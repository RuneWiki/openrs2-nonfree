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

@OriginalClass("client!rm")
public final class Class326 implements IEnumModesCallback {

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	public Class326() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)[I")
	public int[] method7821() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static559.anIntArray514 = new int[Static559.anInt9290];
		Static559.anInt9290 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(29) int[] local29 = Static559.anIntArray514;
		Static559.anIntArray514 = null;
		Static559.anInt9290 = 0;
		return local29;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IILjava/awt/Frame;III)V")
	public void method7822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Frame arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		arg2.setVisible(true);
		@Pc(14) WComponentPeer local14 = (WComponentPeer) arg2.getPeer();
		@Pc(17) int local17 = local14.getHwnd();
		User32.SetWindowLong(local17, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local17, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg2, 17);
		this.aDirectDraw1.setDisplayMode(arg1, arg0, arg4, arg3, 0);
		arg2.setBounds(0, 0, arg1, arg0);
		arg2.toFront();
		arg2.requestFocus();
	}

	@OriginalMember(owner = "client!rm", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static559.anIntArray514 == null) {
			Static559.anInt9290 += 4;
		} else {
			Static559.anIntArray514[Static559.anInt9290++] = arg0.width;
			Static559.anIntArray514[Static559.anInt9290++] = arg0.height;
			Static559.anIntArray514[Static559.anInt9290++] = arg0.rgbBitCount;
			Static559.anIntArray514[Static559.anInt9290++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	public void method7823(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}
}
