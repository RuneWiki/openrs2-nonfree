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

@OriginalClass("client!dr")
public final class Class80 implements IEnumModesCallback {

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V")
	public Class80() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	public void method1938(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)[I")
	public int[] method1939() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static102.anIntArray120 = new int[Static102.anInt2443];
		Static102.anInt2443 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(27) int[] local27 = Static102.anIntArray120;
		Static102.anInt2443 = 0;
		Static102.anIntArray120 = null;
		return local27;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILjava/awt/Frame;III)V")
	public void method1940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Frame arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		arg2.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg2.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg2, 17);
		this.aDirectDraw1.setDisplayMode(arg0, arg1, arg3, arg4, 0);
		arg2.setBounds(0, 0, arg0, arg1);
		arg2.toFront();
		arg2.requestFocus();
	}

	@OriginalMember(owner = "client!dr", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static102.anIntArray120 == null) {
			Static102.anInt2443 += 4;
		} else {
			Static102.anIntArray120[Static102.anInt2443++] = arg0.width;
			Static102.anIntArray120[Static102.anInt2443++] = arg0.height;
			Static102.anIntArray120[Static102.anInt2443++] = arg0.rgbBitCount;
			Static102.anIntArray120[Static102.anInt2443++] = arg0.refreshRate;
		}
	}
}
