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

@OriginalClass("client!saa")
public final class Class315 implements IEnumModesCallback {

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "()V")
	public Class315() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	public void method7360(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z)[I")
	public int[] method7361() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static525.anIntArray478 = new int[Static525.anInt8723];
		Static525.anInt8723 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(25) int[] local25 = Static525.anIntArray478;
		Static525.anIntArray478 = null;
		Static525.anInt8723 = 0;
		return local25;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(BILjava/awt/Frame;III)V")
	public void method7362(@OriginalArg(1) int arg0, @OriginalArg(2) Frame arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg1.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg1, 17);
		this.aDirectDraw1.setDisplayMode(arg2, arg4, arg0, arg3, 0);
		arg1.setBounds(0, 0, arg2, arg4);
		arg1.toFront();
		arg1.requestFocus();
	}

	@OriginalMember(owner = "client!saa", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static525.anIntArray478 == null) {
			Static525.anInt8723 += 4;
		} else {
			Static525.anIntArray478[Static525.anInt8723++] = arg0.width;
			Static525.anIntArray478[Static525.anInt8723++] = arg0.height;
			Static525.anIntArray478[Static525.anInt8723++] = arg0.rgbBitCount;
			Static525.anIntArray478[Static525.anInt8723++] = arg0.refreshRate;
		}
	}
}
