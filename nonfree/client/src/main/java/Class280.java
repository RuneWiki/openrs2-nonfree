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

@OriginalClass("client!rs")
public final class Class280 implements IEnumModesCallback {

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V")
	public Class280() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILjava/awt/Frame;IIII)V")
	public void method6431(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg1.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg1, 17);
		this.aDirectDraw1.setDisplayMode(arg0, arg4, arg3, arg2, 0);
		arg1.setBounds(0, 0, arg0, arg4);
		arg1.toFront();
		arg1.requestFocus();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	public void method6432(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!rs", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static449.anIntArray616 == null) {
			Static449.anInt7763 += 4;
		} else {
			Static449.anIntArray616[Static449.anInt7763++] = arg0.width;
			Static449.anIntArray616[Static449.anInt7763++] = arg0.height;
			Static449.anIntArray616[Static449.anInt7763++] = arg0.rgbBitCount;
			Static449.anIntArray616[Static449.anInt7763++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)[I")
	public int[] method6433() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static449.anIntArray616 = new int[Static449.anInt7763];
		Static449.anInt7763 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(20) int[] local20 = Static449.anIntArray616;
		Static449.anIntArray616 = null;
		Static449.anInt7763 = 0;
		return local20;
	}
}
