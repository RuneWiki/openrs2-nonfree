import com.ms.awt.WComponentPeer;
import com.ms.com.IUnknown;
import com.ms.com._Guid;
import com.ms.directX.DDSurfaceDesc;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class197 implements IEnumModesCallback {

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
	public Class197() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V")
	public void method4560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Frame arg4) {
		arg4.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg4.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg4, 17);
		this.aDirectDraw1.setDisplayMode(arg3, arg0, arg2, arg1, 0);
		arg4.setBounds(0, 0, arg3, arg0);
		arg4.toFront();
		arg4.requestFocus();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	public void method4561(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!kq", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static317.anIntArray325 == null) {
			Static317.anInt5378 += 4;
		} else {
			Static317.anIntArray325[Static317.anInt5378++] = arg0.width;
			Static317.anIntArray325[Static317.anInt5378++] = arg0.height;
			Static317.anIntArray325[Static317.anInt5378++] = arg0.rgbBitCount;
			Static317.anIntArray325[Static317.anInt5378++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)[I")
	public int[] method4562() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static317.anIntArray325 = new int[Static317.anInt5378];
		Static317.anInt5378 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(20) int[] local20 = Static317.anIntArray325;
		Static317.anInt5378 = 0;
		Static317.anIntArray325 = null;
		return local20;
	}
}
