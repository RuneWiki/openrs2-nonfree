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

@OriginalClass("client!eg")
public final class Class86 implements IEnumModesCallback {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class86() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	public void method2339(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)[I")
	public int[] method2340() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static117.anIntArray204 = new int[Static117.anInt2580];
		Static117.anInt2580 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(20) int[] local20 = Static117.anIntArray204;
		Static117.anIntArray204 = null;
		Static117.anInt2580 = 0;
		return local20;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILjava/awt/Frame;II)V")
	public void method2341(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Frame arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg2.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg2.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg2, 17);
		this.aDirectDraw1.setDisplayMode(arg0, arg3, arg4, arg1, 0);
		arg2.setBounds(0, 0, arg0, arg3);
		arg2.toFront();
		arg2.requestFocus();
	}

	@OriginalMember(owner = "client!eg", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static117.anIntArray204 == null) {
			Static117.anInt2580 += 4;
		} else {
			Static117.anIntArray204[Static117.anInt2580++] = arg0.width;
			Static117.anIntArray204[Static117.anInt2580++] = arg0.height;
			Static117.anIntArray204[Static117.anInt2580++] = arg0.rgbBitCount;
			Static117.anIntArray204[Static117.anInt2580++] = arg0.refreshRate;
		}
	}
}
