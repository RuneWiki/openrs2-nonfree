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

@OriginalClass("client!el")
public final class Class92 implements IEnumModesCallback {

	@OriginalMember(owner = "client!el", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
	public Class92() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	public void method2524(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!el", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static132.anIntArray129 == null) {
			Static132.anInt2702 += 4;
		} else {
			Static132.anIntArray129[Static132.anInt2702++] = arg0.width;
			Static132.anIntArray129[Static132.anInt2702++] = arg0.height;
			Static132.anIntArray129[Static132.anInt2702++] = arg0.rgbBitCount;
			Static132.anIntArray129[Static132.anInt2702++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V")
	public void method2525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Frame arg3, @OriginalArg(5) int arg4) {
		arg3.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg3.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg3, 17);
		this.aDirectDraw1.setDisplayMode(arg0, arg4, arg2, arg1, 0);
		arg3.setBounds(0, 0, arg0, arg4);
		arg3.toFront();
		arg3.requestFocus();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)[I")
	public int[] method2526() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static132.anIntArray129 = new int[Static132.anInt2702];
		Static132.anInt2702 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(20) int[] local20 = Static132.anIntArray129;
		Static132.anIntArray129 = null;
		Static132.anInt2702 = 0;
		return local20;
	}
}
