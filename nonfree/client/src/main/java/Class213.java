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

@OriginalClass("client!lf")
public final class Class213 implements IEnumModesCallback {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class213() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!lf", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static336.anIntArray331 == null) {
			Static336.anInt5995 += 4;
		} else {
			Static336.anIntArray331[Static336.anInt5995++] = arg0.width;
			Static336.anIntArray331[Static336.anInt5995++] = arg0.height;
			Static336.anIntArray331[Static336.anInt5995++] = arg0.rgbBitCount;
			Static336.anIntArray331[Static336.anInt5995++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	public void method5113(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)[I")
	public int[] method5114() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static336.anIntArray331 = new int[Static336.anInt5995];
		Static336.anInt5995 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(26) int[] local26 = Static336.anIntArray331;
		Static336.anIntArray331 = null;
		Static336.anInt5995 = 0;
		return local26;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIILjava/awt/Frame;II)V")
	public void method5115(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Frame arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg2.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg2.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg2, 17);
		this.aDirectDraw1.setDisplayMode(arg3, arg0, arg4, arg1, 0);
		arg2.setBounds(0, 0, arg3, arg0);
		arg2.toFront();
		arg2.requestFocus();
	}
}
