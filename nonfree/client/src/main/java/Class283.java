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

@OriginalClass("client!qd")
public final class Class283 implements IEnumModesCallback {

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	public Class283() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!qd", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static459.anIntArray510 == null) {
			Static459.anInt7452 += 4;
		} else {
			Static459.anIntArray510[Static459.anInt7452++] = arg0.width;
			Static459.anIntArray510[Static459.anInt7452++] = arg0.height;
			Static459.anIntArray510[Static459.anInt7452++] = arg0.rgbBitCount;
			Static459.anIntArray510[Static459.anInt7452++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)[I")
	public int[] method6497() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static459.anIntArray510 = new int[Static459.anInt7452];
		Static459.anInt7452 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(20) int[] local20 = Static459.anIntArray510;
		Static459.anInt7452 = 0;
		Static459.anIntArray510 = null;
		return local20;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLjava/awt/Frame;)V")
	public void method6498(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/awt/Frame;IIIB)V")
	public void method6499(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg1.setVisible(true);
		@Pc(10) WComponentPeer local10 = (WComponentPeer) arg1.getPeer();
		@Pc(13) int local13 = local10.getHwnd();
		User32.SetWindowLong(local13, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local13, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg1, 17);
		this.aDirectDraw1.setDisplayMode(arg0, arg2, arg4, arg3, 0);
		arg1.setBounds(0, 0, arg0, arg2);
		arg1.toFront();
		arg1.requestFocus();
	}
}
