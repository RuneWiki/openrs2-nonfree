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

@OriginalClass("client!am")
public final class Class15 implements IEnumModesCallback {

	@OriginalMember(owner = "client!am", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
	public Class15() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIILjava/awt/Frame;)V")
	public void method650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Frame arg4) {
		arg4.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg4.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg4, 17);
		this.aDirectDraw1.setDisplayMode(arg1, arg2, arg0, arg3, 0);
		arg4.setBounds(0, 0, arg1, arg2);
		arg4.toFront();
		arg4.requestFocus();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)[I")
	public int[] method651() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static13.anIntArray112 = new int[Static13.anInt633];
		Static13.anInt633 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(20) int[] local20 = Static13.anIntArray112;
		Static13.anIntArray112 = null;
		Static13.anInt633 = 0;
		return local20;
	}

	@OriginalMember(owner = "client!am", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static13.anIntArray112 == null) {
			Static13.anInt633 += 4;
		} else {
			Static13.anIntArray112[Static13.anInt633++] = arg0.width;
			Static13.anIntArray112[Static13.anInt633++] = arg0.height;
			Static13.anIntArray112[Static13.anInt633++] = arg0.rgbBitCount;
			Static13.anIntArray112[Static13.anInt633++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	public void method652(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}
}
