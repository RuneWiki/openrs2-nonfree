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

@OriginalClass("client!qn")
public final class Class286 implements IEnumModesCallback {

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V")
	public Class286() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!qn", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static488.anIntArray646 == null) {
			Static488.anInt8734 += 4;
		} else {
			Static488.anIntArray646[Static488.anInt8734++] = arg0.width;
			Static488.anIntArray646[Static488.anInt8734++] = arg0.height;
			Static488.anIntArray646[Static488.anInt8734++] = arg0.rgbBitCount;
			Static488.anIntArray646[Static488.anInt8734++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLjava/awt/Frame;)V")
	public void method7232(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)[I")
	public int[] method7233() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static488.anIntArray646 = new int[Static488.anInt8734];
		Static488.anInt8734 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(28) int[] local28 = Static488.anIntArray646;
		Static488.anInt8734 = 0;
		Static488.anIntArray646 = null;
		return local28;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V")
	public void method7234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Frame arg3, @OriginalArg(5) int arg4) {
		arg3.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg3.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg3, 17);
		this.aDirectDraw1.setDisplayMode(arg2, arg0, arg4, arg1, 0);
		arg3.setBounds(0, 0, arg2, arg0);
		arg3.toFront();
		arg3.requestFocus();
	}
}
