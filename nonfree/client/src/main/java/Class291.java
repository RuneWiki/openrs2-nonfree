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

@OriginalClass("client!rq")
public final class Class291 implements IEnumModesCallback {

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
	public Class291() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIILjava/awt/Frame;II)V")
	public void method6458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Frame arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg2.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg2.getPeer();
		@Pc(17) int local17 = local6.getHwnd();
		User32.SetWindowLong(local17, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local17, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg2, 17);
		this.aDirectDraw1.setDisplayMode(arg1, arg4, arg3, arg0, 0);
		arg2.setBounds(0, 0, arg1, arg4);
		arg2.toFront();
		arg2.requestFocus();
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BLjava/awt/Frame;)V")
	public void method6459(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)[I")
	public int[] method6460() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static460.anIntArray569 = new int[Static460.anInt7879];
		Static460.anInt7879 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(25) int[] local25 = Static460.anIntArray569;
		Static460.anIntArray569 = null;
		Static460.anInt7879 = 0;
		return local25;
	}

	@OriginalMember(owner = "client!rq", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static460.anIntArray569 == null) {
			Static460.anInt7879 += 4;
		} else {
			Static460.anIntArray569[Static460.anInt7879++] = arg0.width;
			Static460.anIntArray569[Static460.anInt7879++] = arg0.height;
			Static460.anIntArray569[Static460.anInt7879++] = arg0.rgbBitCount;
			Static460.anIntArray569[Static460.anInt7879++] = arg0.refreshRate;
		}
	}
}
