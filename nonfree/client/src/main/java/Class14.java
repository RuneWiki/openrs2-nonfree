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

@OriginalClass("client!aha")
public final class Class14 implements IEnumModesCallback {

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "()V")
	public Class14() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(B)[I")
	public int[] method203() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static14.anIntArray13 = new int[Static14.anInt229];
		Static14.anInt229 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(31) int[] local31 = Static14.anIntArray13;
		Static14.anIntArray13 = null;
		Static14.anInt229 = 0;
		return local31;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IILjava/awt/Frame;III)V")
	public void method204(@OriginalArg(0) int arg0, @OriginalArg(2) Frame arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg1.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg1, 17);
		this.aDirectDraw1.setDisplayMode(arg0, arg4, arg2, arg3, 0);
		arg1.setBounds(0, 0, arg0, arg4);
		arg1.toFront();
		arg1.requestFocus();
	}

	@OriginalMember(owner = "client!aha", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static14.anIntArray13 == null) {
			Static14.anInt229 += 4;
		} else {
			Static14.anIntArray13[Static14.anInt229++] = arg0.width;
			Static14.anIntArray13[Static14.anInt229++] = arg0.height;
			Static14.anIntArray13[Static14.anInt229++] = arg0.rgbBitCount;
			Static14.anIntArray13[Static14.anInt229++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	public void method205(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}
}
