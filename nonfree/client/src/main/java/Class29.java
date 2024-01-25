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

@OriginalClass("client!bha")
public final class Class29 implements IEnumModesCallback {

	@OriginalMember(owner = "client!bha", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "()V")
	public Class29() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(Z)[I")
	public int[] method1353() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static42.anIntArray42 = new int[Static42.anInt1434];
		Static42.anInt1434 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(25) int[] local25 = Static42.anIntArray42;
		Static42.anInt1434 = 0;
		Static42.anIntArray42 = null;
		return local25;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	public void method1354(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!bha", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static42.anIntArray42 == null) {
			Static42.anInt1434 += 4;
		} else {
			Static42.anIntArray42[Static42.anInt1434++] = arg0.width;
			Static42.anIntArray42[Static42.anInt1434++] = arg0.height;
			Static42.anIntArray42[Static42.anInt1434++] = arg0.rgbBitCount;
			Static42.anIntArray42[Static42.anInt1434++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIIIILjava/awt/Frame;)V")
	public void method1355(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Frame arg4) {
		arg4.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg4.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg4, 17);
		this.aDirectDraw1.setDisplayMode(arg1, arg3, arg0, arg2, 0);
		arg4.setBounds(0, 0, arg1, arg3);
		arg4.toFront();
		arg4.requestFocus();
	}
}
