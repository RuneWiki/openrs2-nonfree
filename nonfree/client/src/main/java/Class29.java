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

@OriginalClass("client!be")
public final class Class29 implements IEnumModesCallback {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class29() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIILjava/awt/Frame;Z)V")
	public void method559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Frame arg4) {
		arg4.setVisible(true);
		@Pc(13) WComponentPeer local13 = (WComponentPeer) arg4.getPeer();
		@Pc(16) int local16 = local13.getHwnd();
		User32.SetWindowLong(local16, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local16, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg4, 17);
		this.aDirectDraw1.setDisplayMode(arg3, arg1, arg0, arg2, 0);
		arg4.setBounds(0, 0, arg3, arg1);
		arg4.toFront();
		arg4.requestFocus();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Frame;Z)V")
	public void method560(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)[I")
	public int[] method561() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static34.anIntArray55 = new int[Static34.anInt662];
		Static34.anInt662 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(20) int[] local20 = Static34.anIntArray55;
		Static34.anIntArray55 = null;
		Static34.anInt662 = 0;
		return local20;
	}

	@OriginalMember(owner = "client!be", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static34.anIntArray55 == null) {
			Static34.anInt662 += 4;
		} else {
			Static34.anIntArray55[Static34.anInt662++] = arg0.width;
			Static34.anIntArray55[Static34.anInt662++] = arg0.height;
			Static34.anIntArray55[Static34.anInt662++] = arg0.rgbBitCount;
			Static34.anIntArray55[Static34.anInt662++] = arg0.refreshRate;
		}
	}
}
