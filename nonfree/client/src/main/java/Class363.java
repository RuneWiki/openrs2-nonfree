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

@OriginalClass("client!wp")
public final class Class363 implements IEnumModesCallback {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	public Class363() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljava/awt/Frame;IIIII)V")
	public void method8311(@OriginalArg(0) Frame arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg0.setVisible(true);
		@Pc(14) WComponentPeer local14 = (WComponentPeer) arg0.getPeer();
		@Pc(17) int local17 = local14.getHwnd();
		User32.SetWindowLong(local17, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local17, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg0, 17);
		this.aDirectDraw1.setDisplayMode(arg1, arg2, arg3, arg4, 0);
		arg0.setBounds(0, 0, arg1, arg2);
		arg0.toFront();
		arg0.requestFocus();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)[I")
	public int[] method8312() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static588.anIntArray549 = new int[Static588.anInt10161];
		Static588.anInt10161 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(25) int[] local25 = Static588.anIntArray549;
		Static588.anInt10161 = 0;
		Static588.anIntArray549 = null;
		return local25;
	}

	@OriginalMember(owner = "client!wp", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static588.anIntArray549 == null) {
			Static588.anInt10161 += 4;
		} else {
			Static588.anIntArray549[Static588.anInt10161++] = arg0.width;
			Static588.anIntArray549[Static588.anInt10161++] = arg0.height;
			Static588.anIntArray549[Static588.anInt10161++] = arg0.rgbBitCount;
			Static588.anIntArray549[Static588.anInt10161++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLjava/awt/Frame;)V")
	public void method8313(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}
}
