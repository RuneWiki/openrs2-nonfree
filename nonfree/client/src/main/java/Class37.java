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

@OriginalClass("client!br")
public final class Class37 implements IEnumModesCallback {

	@OriginalMember(owner = "client!br", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	public Class37() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIILjava/awt/Frame;)V")
	public void method768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Frame arg4) {
		arg4.setVisible(true);
		@Pc(12) WComponentPeer local12 = (WComponentPeer) arg4.getPeer();
		@Pc(15) int local15 = local12.getHwnd();
		User32.SetWindowLong(local15, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local15, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg4, 17);
		this.aDirectDraw1.setDisplayMode(arg0, arg2, arg1, arg3, 0);
		arg4.setBounds(0, 0, arg0, arg2);
		arg4.toFront();
		arg4.requestFocus();
	}

	@OriginalMember(owner = "client!br", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static48.anIntArray137 == null) {
			Static48.anInt874 += 4;
		} else {
			Static48.anIntArray137[Static48.anInt874++] = arg0.width;
			Static48.anIntArray137[Static48.anInt874++] = arg0.height;
			Static48.anIntArray137[Static48.anInt874++] = arg0.rgbBitCount;
			Static48.anIntArray137[Static48.anInt874++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZLjava/awt/Frame;)V")
	public void method769(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)[I")
	public int[] method770() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static48.anIntArray137 = new int[Static48.anInt874];
		Static48.anInt874 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(25) int[] local25 = Static48.anIntArray137;
		Static48.anInt874 = 0;
		Static48.anIntArray137 = null;
		return local25;
	}
}
