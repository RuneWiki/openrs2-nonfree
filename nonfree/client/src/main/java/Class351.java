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

@OriginalClass("client!wb")
public final class Class351 implements IEnumModesCallback {

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class351() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BIIILjava/awt/Frame;I)V")
	public void method7709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Frame arg3, @OriginalArg(5) int arg4) {
		arg3.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg3.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg3, 17);
		this.aDirectDraw1.setDisplayMode(arg4, arg2, arg1, arg0, 0);
		arg3.setBounds(0, 0, arg4, arg2);
		arg3.toFront();
		arg3.requestFocus();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)[I")
	public int[] method7710() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static572.anIntArray621 = new int[Static572.anInt9324];
		Static572.anInt9324 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(25) int[] local25 = Static572.anIntArray621;
		Static572.anIntArray621 = null;
		Static572.anInt9324 = 0;
		return local25;
	}

	@OriginalMember(owner = "client!wb", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static572.anIntArray621 == null) {
			Static572.anInt9324 += 4;
		} else {
			Static572.anIntArray621[Static572.anInt9324++] = arg0.width;
			Static572.anIntArray621[Static572.anInt9324++] = arg0.height;
			Static572.anIntArray621[Static572.anInt9324++] = arg0.rgbBitCount;
			Static572.anIntArray621[Static572.anInt9324++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	public void method7711(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}
}
