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

@OriginalClass("client!ga")
public final class Class114 implements IEnumModesCallback {

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class114() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!ga", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static172.anIntArray204 == null) {
			Static172.anInt3068 += 4;
		} else {
			Static172.anIntArray204[Static172.anInt3068++] = arg0.width;
			Static172.anIntArray204[Static172.anInt3068++] = arg0.height;
			Static172.anIntArray204[Static172.anInt3068++] = arg0.rgbBitCount;
			Static172.anIntArray204[Static172.anInt3068++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	public void method2577(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)[I")
	public int[] method2578() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static172.anIntArray204 = new int[Static172.anInt3068];
		Static172.anInt3068 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(26) int[] local26 = Static172.anIntArray204;
		Static172.anInt3068 = 0;
		Static172.anIntArray204 = null;
		return local26;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIZLjava/awt/Frame;I)V")
	public void method2579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Frame arg3, @OriginalArg(5) int arg4) {
		arg3.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg3.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg3, 17);
		this.aDirectDraw1.setDisplayMode(arg1, arg4, arg2, arg0, 0);
		arg3.setBounds(0, 0, arg1, arg4);
		arg3.toFront();
		arg3.requestFocus();
	}
}
