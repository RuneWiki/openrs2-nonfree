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

@OriginalClass("client!cw")
public final class Class59 implements IEnumModesCallback {

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "()V")
	public Class59() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)[I")
	public int[] method1602() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static80.anIntArray78 = new int[Static80.anInt1733];
		Static80.anInt1733 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(25) int[] local25 = Static80.anIntArray78;
		Static80.anIntArray78 = null;
		Static80.anInt1733 = 0;
		return local25;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BLjava/awt/Frame;)V")
	public void method1603(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!cw", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static80.anIntArray78 == null) {
			Static80.anInt1733 += 4;
		} else {
			Static80.anIntArray78[Static80.anInt1733++] = arg0.width;
			Static80.anIntArray78[Static80.anInt1733++] = arg0.height;
			Static80.anIntArray78[Static80.anInt1733++] = arg0.rgbBitCount;
			Static80.anIntArray78[Static80.anInt1733++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIILjava/awt/Frame;IB)V")
	public void method1604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Frame arg3, @OriginalArg(4) int arg4) {
		arg3.setVisible(true);
		@Pc(10) WComponentPeer local10 = (WComponentPeer) arg3.getPeer();
		@Pc(13) int local13 = local10.getHwnd();
		User32.SetWindowLong(local13, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local13, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg3, 17);
		this.aDirectDraw1.setDisplayMode(arg2, arg4, arg0, arg1, 0);
		arg3.setBounds(0, 0, arg2, arg4);
		arg3.toFront();
		arg3.requestFocus();
	}
}
