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

@OriginalClass("client!lga")
public final class Class198 implements IEnumModesCallback {

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "()V")
	public Class198() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	public void method5368(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)[I")
	public int[] method5369() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static316.anIntArray380 = new int[Static316.anInt6428];
		Static316.anInt6428 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(31) int[] local31 = Static316.anIntArray380;
		Static316.anIntArray380 = null;
		Static316.anInt6428 = 0;
		return local31;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILjava/awt/Frame;ZIII)V")
	public void method5370(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg1.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg1, 17);
		this.aDirectDraw1.setDisplayMode(arg2, arg0, arg3, arg4, 0);
		arg1.setBounds(0, 0, arg2, arg0);
		arg1.toFront();
		arg1.requestFocus();
	}

	@OriginalMember(owner = "client!lga", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static316.anIntArray380 == null) {
			Static316.anInt6428 += 4;
		} else {
			Static316.anIntArray380[Static316.anInt6428++] = arg0.width;
			Static316.anIntArray380[Static316.anInt6428++] = arg0.height;
			Static316.anIntArray380[Static316.anInt6428++] = arg0.rgbBitCount;
			Static316.anIntArray380[Static316.anInt6428++] = arg0.refreshRate;
		}
	}
}
