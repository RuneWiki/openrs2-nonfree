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

@OriginalClass("client!jca")
public final class Class183 implements IEnumModesCallback {

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "()V")
	public Class183() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)[I")
	public int[] method4608() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static273.anIntArray255 = new int[Static273.anInt5102];
		Static273.anInt5102 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(26) int[] local26 = Static273.anIntArray255;
		Static273.anIntArray255 = null;
		Static273.anInt5102 = 0;
		return local26;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/awt/Frame;IIIBI)V")
	public void method4609(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		arg0.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg0.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg0, 17);
		this.aDirectDraw1.setDisplayMode(arg2, arg3, arg1, arg4, 0);
		arg0.setBounds(0, 0, arg2, arg3);
		arg0.toFront();
		arg0.requestFocus();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	public void method4610(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!jca", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static273.anIntArray255 == null) {
			Static273.anInt5102 += 4;
		} else {
			Static273.anIntArray255[Static273.anInt5102++] = arg0.width;
			Static273.anIntArray255[Static273.anInt5102++] = arg0.height;
			Static273.anIntArray255[Static273.anInt5102++] = arg0.rgbBitCount;
			Static273.anIntArray255[Static273.anInt5102++] = arg0.refreshRate;
		}
	}
}
