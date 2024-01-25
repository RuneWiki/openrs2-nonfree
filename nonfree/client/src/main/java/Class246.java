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

@OriginalClass("client!ow")
public final class Class246 implements IEnumModesCallback {

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "()V")
	public Class246() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Z)[I")
	public int[] method6473() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static410.anIntArray420 = new int[Static410.anInt7816];
		Static410.anInt7816 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(27) int[] local27 = Static410.anIntArray420;
		Static410.anInt7816 = 0;
		Static410.anIntArray420 = null;
		return local27;
	}

	@OriginalMember(owner = "client!ow", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static410.anIntArray420 == null) {
			Static410.anInt7816 += 4;
		} else {
			Static410.anIntArray420[Static410.anInt7816++] = arg0.width;
			Static410.anIntArray420[Static410.anInt7816++] = arg0.height;
			Static410.anIntArray420[Static410.anInt7816++] = arg0.rgbBitCount;
			Static410.anIntArray420[Static410.anInt7816++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	public void method6474(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIILjava/awt/Frame;II)V")
	public void method6475(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Frame arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg2.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg2.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg2, 17);
		this.aDirectDraw1.setDisplayMode(arg4, arg1, arg0, arg3, 0);
		arg2.setBounds(0, 0, arg4, arg1);
		arg2.toFront();
		arg2.requestFocus();
	}
}
