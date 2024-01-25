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

@OriginalClass("client!uj")
public final class Class334 implements IEnumModesCallback {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class334() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZLjava/awt/Frame;)V")
	public void method7289(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!uj", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static532.anIntArray562 == null) {
			Static532.anInt8978 += 4;
		} else {
			Static532.anIntArray562[Static532.anInt8978++] = arg0.width;
			Static532.anIntArray562[Static532.anInt8978++] = arg0.height;
			Static532.anIntArray562[Static532.anInt8978++] = arg0.rgbBitCount;
			Static532.anIntArray562[Static532.anInt8978++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILjava/awt/Frame;IIII)V")
	public void method7290(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		arg1.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg1.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg1, 17);
		this.aDirectDraw1.setDisplayMode(arg0, arg2, arg3, arg4, 0);
		arg1.setBounds(0, 0, arg0, arg2);
		arg1.toFront();
		arg1.requestFocus();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)[I")
	public int[] method7291() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static532.anIntArray562 = new int[Static532.anInt8978];
		Static532.anInt8978 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(28) int[] local28 = Static532.anIntArray562;
		Static532.anInt8978 = 0;
		Static532.anIntArray562 = null;
		return local28;
	}
}
