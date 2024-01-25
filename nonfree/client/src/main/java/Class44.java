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

@OriginalClass("client!cba")
public final class Class44 implements IEnumModesCallback {

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "()V")
	public Class44() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!cba", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static59.anIntArray98 == null) {
			Static59.anInt1005 += 4;
		} else {
			Static59.anIntArray98[Static59.anInt1005++] = arg0.width;
			Static59.anIntArray98[Static59.anInt1005++] = arg0.height;
			Static59.anIntArray98[Static59.anInt1005++] = arg0.rgbBitCount;
			Static59.anIntArray98[Static59.anInt1005++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IILjava/awt/Frame;IBI)V")
	public void method851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Frame arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		arg2.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg2.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg2, 17);
		this.aDirectDraw1.setDisplayMode(arg4, arg1, arg3, arg0, 0);
		arg2.setBounds(0, 0, arg4, arg1);
		arg2.toFront();
		arg2.requestFocus();
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)[I")
	public int[] method852() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static59.anIntArray98 = new int[Static59.anInt1005];
		Static59.anInt1005 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(20) int[] local20 = Static59.anIntArray98;
		Static59.anIntArray98 = null;
		Static59.anInt1005 = 0;
		return local20;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	public void method853(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}
}
