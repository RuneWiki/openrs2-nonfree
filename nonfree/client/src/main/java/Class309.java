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

@OriginalClass("client!rk")
public final class Class309 implements IEnumModesCallback {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
	public Class309() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/awt/Frame;IIIII)V")
	public void method6829(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg0.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg0.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg0, 17);
		this.aDirectDraw1.setDisplayMode(arg2, arg3, arg4, arg1, 0);
		arg0.setBounds(0, 0, arg2, arg3);
		arg0.toFront();
		arg0.requestFocus();
	}

	@OriginalMember(owner = "client!rk", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static526.anIntArray442 == null) {
			Static526.anInt8306 += 4;
		} else {
			Static526.anIntArray442[Static526.anInt8306++] = arg0.width;
			Static526.anIntArray442[Static526.anInt8306++] = arg0.height;
			Static526.anIntArray442[Static526.anInt8306++] = arg0.rgbBitCount;
			Static526.anIntArray442[Static526.anInt8306++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	public void method6830(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)[I")
	public int[] method6831() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static526.anIntArray442 = new int[Static526.anInt8306];
		Static526.anInt8306 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(20) int[] local20 = Static526.anIntArray442;
		Static526.anIntArray442 = null;
		Static526.anInt8306 = 0;
		return local20;
	}
}
