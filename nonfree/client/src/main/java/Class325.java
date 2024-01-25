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

@OriginalClass("client!sr")
public final class Class325 implements IEnumModesCallback {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
	public Class325() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!sr", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static558.anIntArray771 == null) {
			Static558.anInt9084 += 4;
		} else {
			Static558.anIntArray771[Static558.anInt9084++] = arg0.width;
			Static558.anIntArray771[Static558.anInt9084++] = arg0.height;
			Static558.anIntArray771[Static558.anInt9084++] = arg0.rgbBitCount;
			Static558.anIntArray771[Static558.anInt9084++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)[I")
	public int[] method7932() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static558.anIntArray771 = new int[Static558.anInt9084];
		Static558.anInt9084 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(20) int[] local20 = Static558.anIntArray771;
		Static558.anInt9084 = 0;
		Static558.anIntArray771 = null;
		return local20;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	public void method7933(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILjava/awt/Frame;IIII)V")
	public void method7934(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg1.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg1.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg1, 17);
		this.aDirectDraw1.setDisplayMode(arg4, arg0, arg2, arg3, 0);
		arg1.setBounds(0, 0, arg4, arg0);
		arg1.toFront();
		arg1.requestFocus();
	}
}
