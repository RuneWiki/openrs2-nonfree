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

@OriginalClass("client!hca")
public final class Class135 implements IEnumModesCallback {

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "()V")
	public Class135() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!hca", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static189.anIntArray218 == null) {
			Static189.anInt3851 += 4;
		} else {
			Static189.anIntArray218[Static189.anInt3851++] = arg0.width;
			Static189.anIntArray218[Static189.anInt3851++] = arg0.height;
			Static189.anIntArray218[Static189.anInt3851++] = arg0.rgbBitCount;
			Static189.anIntArray218[Static189.anInt3851++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)[I")
	public int[] method3185() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static189.anIntArray218 = new int[Static189.anInt3851];
		Static189.anInt3851 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(26) int[] local26 = Static189.anIntArray218;
		Static189.anIntArray218 = null;
		Static189.anInt3851 = 0;
		return local26;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ljava/awt/Frame;IZIII)V")
	public void method3186(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg0.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg0.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg0, 17);
		this.aDirectDraw1.setDisplayMode(arg4, arg1, arg2, arg3, 0);
		arg0.setBounds(0, 0, arg4, arg1);
		arg0.toFront();
		arg0.requestFocus();
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ljava/awt/Frame;Z)V")
	public void method3187(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}
}
