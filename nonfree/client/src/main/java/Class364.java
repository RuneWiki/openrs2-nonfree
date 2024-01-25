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

@OriginalClass("client!up")
public final class Class364 implements IEnumModesCallback {

	@OriginalMember(owner = "client!up", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
	public Class364() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	public void method8085(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!up", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static615.anIntArray627 == null) {
			Static615.anInt9556 += 4;
		} else {
			Static615.anIntArray627[Static615.anInt9556++] = arg0.width;
			Static615.anIntArray627[Static615.anInt9556++] = arg0.height;
			Static615.anIntArray627[Static615.anInt9556++] = arg0.rgbBitCount;
			Static615.anIntArray627[Static615.anInt9556++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIILjava/awt/Frame;II)V")
	public void method8086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Frame arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg2.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg2.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg2, 17);
		this.aDirectDraw1.setDisplayMode(arg4, arg3, arg1, arg0, 0);
		arg2.setBounds(0, 0, arg4, arg3);
		arg2.toFront();
		arg2.requestFocus();
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)[I")
	public int[] method8087() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static615.anIntArray627 = new int[Static615.anInt9556];
		Static615.anInt9556 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(20) int[] local20 = Static615.anIntArray627;
		Static615.anInt9556 = 0;
		Static615.anIntArray627 = null;
		return local20;
	}
}
