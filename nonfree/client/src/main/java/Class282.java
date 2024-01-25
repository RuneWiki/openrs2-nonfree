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

@OriginalClass("client!pi")
public final class Class282 implements IEnumModesCallback {

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
	public Class282() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILjava/awt/Frame;III)V")
	public void method6449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Frame arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		arg2.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg2.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg2, 17);
		this.aDirectDraw1.setDisplayMode(arg3, arg0, arg1, arg4, 0);
		arg2.setBounds(0, 0, arg3, arg0);
		arg2.toFront();
		arg2.requestFocus();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLjava/awt/Frame;)V")
	public void method6450(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)[I")
	public int[] method6451() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static462.anIntArray501 = new int[Static462.anInt7417];
		Static462.anInt7417 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(25) int[] local25 = Static462.anIntArray501;
		Static462.anIntArray501 = null;
		Static462.anInt7417 = 0;
		return local25;
	}

	@OriginalMember(owner = "client!pi", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static462.anIntArray501 == null) {
			Static462.anInt7417 += 4;
		} else {
			Static462.anIntArray501[Static462.anInt7417++] = arg0.width;
			Static462.anIntArray501[Static462.anInt7417++] = arg0.height;
			Static462.anIntArray501[Static462.anInt7417++] = arg0.rgbBitCount;
			Static462.anIntArray501[Static462.anInt7417++] = arg0.refreshRate;
		}
	}
}
