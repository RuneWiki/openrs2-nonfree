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

@OriginalClass("client!lfa")
public final class Class222 implements IEnumModesCallback {

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "()V")
	public Class222() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Ljava/awt/Frame;Z)V")
	public void method5227(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)[I")
	public int[] method5228() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static341.anIntArray340 = new int[Static341.anInt5797];
		Static341.anInt5797 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(28) int[] local28 = Static341.anIntArray340;
		Static341.anInt5797 = 0;
		Static341.anIntArray340 = null;
		return local28;
	}

	@OriginalMember(owner = "client!lfa", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static341.anIntArray340 == null) {
			Static341.anInt5797 += 4;
		} else {
			Static341.anIntArray340[Static341.anInt5797++] = arg0.width;
			Static341.anIntArray340[Static341.anInt5797++] = arg0.height;
			Static341.anIntArray340[Static341.anInt5797++] = arg0.rgbBitCount;
			Static341.anIntArray340[Static341.anInt5797++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V")
	public void method5229(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Frame arg3, @OriginalArg(5) int arg4) {
		arg3.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg3.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg3, 17);
		this.aDirectDraw1.setDisplayMode(arg1, arg2, arg4, arg0, 0);
		arg3.setBounds(0, 0, arg1, arg2);
		arg3.toFront();
		arg3.requestFocus();
	}
}
