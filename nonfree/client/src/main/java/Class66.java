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

@OriginalClass("client!dc")
public final class Class66 implements IEnumModesCallback {

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class66() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!dc", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static76.anIntArray129 == null) {
			Static76.anInt1469 += 4;
		} else {
			Static76.anIntArray129[Static76.anInt1469++] = arg0.width;
			Static76.anIntArray129[Static76.anInt1469++] = arg0.height;
			Static76.anIntArray129[Static76.anInt1469++] = arg0.rgbBitCount;
			Static76.anIntArray129[Static76.anInt1469++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	public void method1311(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)[I")
	public int[] method1312() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static76.anIntArray129 = new int[Static76.anInt1469];
		Static76.anInt1469 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(20) int[] local20 = Static76.anIntArray129;
		Static76.anIntArray129 = null;
		Static76.anInt1469 = 0;
		return local20;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Frame;IBIII)V")
	public void method1313(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg0.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg0.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg0, 17);
		this.aDirectDraw1.setDisplayMode(arg1, arg2, arg4, arg3, 0);
		arg0.setBounds(0, 0, arg1, arg2);
		arg0.toFront();
		arg0.requestFocus();
	}
}
