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

@OriginalClass("client!lea")
public final class Class209 implements IEnumModesCallback {

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "()V")
	public Class209() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIZILjava/awt/Frame;I)V")
	public void method4801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Frame arg3, @OriginalArg(5) int arg4) {
		arg3.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg3.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg3, 17);
		this.aDirectDraw1.setDisplayMode(arg2, arg4, arg0, arg1, 0);
		arg3.setBounds(0, 0, arg2, arg4);
		arg3.toFront();
		arg3.requestFocus();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)[I")
	public int[] method4802() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static309.anIntArray286 = new int[Static309.anInt5361];
		Static309.anInt5361 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(25) int[] local25 = Static309.anIntArray286;
		Static309.anIntArray286 = null;
		Static309.anInt5361 = 0;
		return local25;
	}

	@OriginalMember(owner = "client!lea", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static309.anIntArray286 == null) {
			Static309.anInt5361 += 4;
		} else {
			Static309.anIntArray286[Static309.anInt5361++] = arg0.width;
			Static309.anIntArray286[Static309.anInt5361++] = arg0.height;
			Static309.anIntArray286[Static309.anInt5361++] = arg0.rgbBitCount;
			Static309.anIntArray286[Static309.anInt5361++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	public void method4803(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}
}
