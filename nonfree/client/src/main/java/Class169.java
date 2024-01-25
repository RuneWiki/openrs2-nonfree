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

@OriginalClass("client!ia")
public final class Class169 implements IEnumModesCallback {

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	public Class169() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)[I")
	public int[] method3677() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static258.anIntArray301 = new int[Static258.anInt4046];
		Static258.anInt4046 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(20) int[] local20 = Static258.anIntArray301;
		Static258.anInt4046 = 0;
		Static258.anIntArray301 = null;
		return local20;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIILjava/awt/Frame;)V")
	public void method3678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Frame arg4) {
		arg4.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg4.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg4, 17);
		this.aDirectDraw1.setDisplayMode(arg3, arg1, arg0, arg2, 0);
		arg4.setBounds(0, 0, arg3, arg1);
		arg4.toFront();
		arg4.requestFocus();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	public void method3679(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!ia", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static258.anIntArray301 == null) {
			Static258.anInt4046 += 4;
		} else {
			Static258.anIntArray301[Static258.anInt4046++] = arg0.width;
			Static258.anIntArray301[Static258.anInt4046++] = arg0.height;
			Static258.anIntArray301[Static258.anInt4046++] = arg0.rgbBitCount;
			Static258.anIntArray301[Static258.anInt4046++] = arg0.refreshRate;
		}
	}
}
