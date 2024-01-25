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

@OriginalClass("client!eba")
public final class Class84 implements IEnumModesCallback {

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "()V")
	public Class84() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!eba", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static110.anIntArray196 == null) {
			Static110.anInt2154 += 4;
		} else {
			Static110.anIntArray196[Static110.anInt2154++] = arg0.width;
			Static110.anIntArray196[Static110.anInt2154++] = arg0.height;
			Static110.anIntArray196[Static110.anInt2154++] = arg0.rgbBitCount;
			Static110.anIntArray196[Static110.anInt2154++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIIIILjava/awt/Frame;)V")
	public void method1820(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Frame arg4) {
		arg4.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg4.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg4, 17);
		this.aDirectDraw1.setDisplayMode(arg2, arg1, arg0, arg3, 0);
		arg4.setBounds(0, 0, arg2, arg1);
		arg4.toFront();
		arg4.requestFocus();
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	public void method1821(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)[I")
	public int[] method1822() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static110.anIntArray196 = new int[Static110.anInt2154];
		Static110.anInt2154 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(28) int[] local28 = Static110.anIntArray196;
		Static110.anIntArray196 = null;
		Static110.anInt2154 = 0;
		return local28;
	}
}
