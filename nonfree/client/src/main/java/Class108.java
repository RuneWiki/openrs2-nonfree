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

@OriginalClass("client!fw")
public final class Class108 implements IEnumModesCallback {

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "()V")
	public Class108() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!fw", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static158.anIntArray271 == null) {
			Static158.anInt3174 += 4;
		} else {
			Static158.anIntArray271[Static158.anInt3174++] = arg0.width;
			Static158.anIntArray271[Static158.anInt3174++] = arg0.height;
			Static158.anIntArray271[Static158.anInt3174++] = arg0.rgbBitCount;
			Static158.anIntArray271[Static158.anInt3174++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	public void method2839(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)[I")
	public int[] method2840() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static158.anIntArray271 = new int[Static158.anInt3174];
		Static158.anInt3174 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(20) int[] local20 = Static158.anIntArray271;
		Static158.anInt3174 = 0;
		Static158.anIntArray271 = null;
		return local20;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IILjava/awt/Frame;III)V")
	public void method2841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Frame arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		arg2.setVisible(true);
		@Pc(13) WComponentPeer local13 = (WComponentPeer) arg2.getPeer();
		@Pc(16) int local16 = local13.getHwnd();
		User32.SetWindowLong(local16, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local16, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg2, 17);
		this.aDirectDraw1.setDisplayMode(arg3, arg1, arg4, arg0, 0);
		arg2.setBounds(0, 0, arg3, arg1);
		arg2.toFront();
		arg2.requestFocus();
	}
}
