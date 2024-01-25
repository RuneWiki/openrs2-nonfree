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

@OriginalClass("client!nt")
public final class Class231 implements IEnumModesCallback {

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V")
	public Class231() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!nt", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static382.anIntArray469 == null) {
			Static382.anInt7426 += 4;
		} else {
			Static382.anIntArray469[Static382.anInt7426++] = arg0.width;
			Static382.anIntArray469[Static382.anInt7426++] = arg0.height;
			Static382.anIntArray469[Static382.anInt7426++] = arg0.rgbBitCount;
			Static382.anIntArray469[Static382.anInt7426++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)[I")
	public int[] method6298() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static382.anIntArray469 = new int[Static382.anInt7426];
		Static382.anInt7426 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(25) int[] local25 = Static382.anIntArray469;
		Static382.anIntArray469 = null;
		Static382.anInt7426 = 0;
		return local25;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIILjava/awt/Frame;)V")
	public void method6299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Frame arg4) {
		arg4.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg4.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg4, 17);
		this.aDirectDraw1.setDisplayMode(arg2, arg0, arg1, arg3, 0);
		arg4.setBounds(0, 0, arg2, arg0);
		arg4.toFront();
		arg4.requestFocus();
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	public void method6300(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}
}
