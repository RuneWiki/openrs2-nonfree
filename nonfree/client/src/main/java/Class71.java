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

@OriginalClass("client!du")
public final class Class71 implements IEnumModesCallback {

	@OriginalMember(owner = "client!du", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V")
	public Class71() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BLjava/awt/Frame;)V")
	public void method2142(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIBLjava/awt/Frame;)V")
	public void method2143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Frame arg4) {
		arg4.setVisible(true);
		@Pc(10) WComponentPeer local10 = (WComponentPeer) arg4.getPeer();
		@Pc(13) int local13 = local10.getHwnd();
		User32.SetWindowLong(local13, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local13, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg4, 17);
		this.aDirectDraw1.setDisplayMode(arg0, arg3, arg1, arg2, 0);
		arg4.setBounds(0, 0, arg0, arg3);
		arg4.toFront();
		arg4.requestFocus();
	}

	@OriginalMember(owner = "client!du", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static100.anIntArray120 == null) {
			Static100.anInt2402 += 4;
		} else {
			Static100.anIntArray120[Static100.anInt2402++] = arg0.width;
			Static100.anIntArray120[Static100.anInt2402++] = arg0.height;
			Static100.anIntArray120[Static100.anInt2402++] = arg0.rgbBitCount;
			Static100.anIntArray120[Static100.anInt2402++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B)[I")
	public int[] method2144() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static100.anIntArray120 = new int[Static100.anInt2402];
		Static100.anInt2402 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(26) int[] local26 = Static100.anIntArray120;
		Static100.anIntArray120 = null;
		Static100.anInt2402 = 0;
		return local26;
	}
}
