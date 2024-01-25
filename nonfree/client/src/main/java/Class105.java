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

@OriginalClass("client!fd")
public final class Class105 implements IEnumModesCallback {

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class105() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)[I")
	public int[] method2176() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static147.anIntArray192 = new int[Static147.anInt2378];
		Static147.anInt2378 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(20) int[] local20 = Static147.anIntArray192;
		Static147.anInt2378 = 0;
		Static147.anIntArray192 = null;
		return local20;
	}

	@OriginalMember(owner = "client!fd", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static147.anIntArray192 == null) {
			Static147.anInt2378 += 4;
		} else {
			Static147.anIntArray192[Static147.anInt2378++] = arg0.width;
			Static147.anIntArray192[Static147.anInt2378++] = arg0.height;
			Static147.anIntArray192[Static147.anInt2378++] = arg0.rgbBitCount;
			Static147.anIntArray192[Static147.anInt2378++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	public void method2177(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Frame;IIIII)V")
	public void method2178(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg0.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg0, 17);
		this.aDirectDraw1.setDisplayMode(arg4, arg3, arg1, arg2, 0);
		arg0.setBounds(0, 0, arg4, arg3);
		arg0.toFront();
		arg0.requestFocus();
	}
}
