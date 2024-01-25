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

@OriginalClass("client!oc")
public final class Class258 implements IEnumModesCallback {

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class258() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)[I")
	public int[] method6903() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static420.anIntArray377 = new int[Static420.anInt7724];
		Static420.anInt7724 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(25) int[] local25 = Static420.anIntArray377;
		Static420.anInt7724 = 0;
		Static420.anIntArray377 = null;
		return local25;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	public void method6904(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V")
	public void method6905(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Frame arg3, @OriginalArg(5) int arg4) {
		arg3.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg3.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg3, 17);
		this.aDirectDraw1.setDisplayMode(arg1, arg0, arg4, arg2, 0);
		arg3.setBounds(0, 0, arg1, arg0);
		arg3.toFront();
		arg3.requestFocus();
	}

	@OriginalMember(owner = "client!oc", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static420.anIntArray377 == null) {
			Static420.anInt7724 += 4;
		} else {
			Static420.anIntArray377[Static420.anInt7724++] = arg0.width;
			Static420.anIntArray377[Static420.anInt7724++] = arg0.height;
			Static420.anIntArray377[Static420.anInt7724++] = arg0.rgbBitCount;
			Static420.anIntArray377[Static420.anInt7724++] = arg0.refreshRate;
		}
	}
}
