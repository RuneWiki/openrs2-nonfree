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

@OriginalClass("client!vca")
public final class Class387 implements IEnumModesCallback {

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "()V")
	public Class387() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IILjava/awt/Frame;III)V")
	public void method9001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Frame arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg2.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg2, 17);
		this.aDirectDraw1.setDisplayMode(arg3, arg4, arg0, arg1, 0);
		arg2.setBounds(0, 0, arg3, arg4);
		arg2.toFront();
		arg2.requestFocus();
	}

	@OriginalMember(owner = "client!vca", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static674.anIntArray760 == null) {
			Static674.anInt10592 += 4;
		} else {
			Static674.anIntArray760[Static674.anInt10592++] = arg0.width;
			Static674.anIntArray760[Static674.anInt10592++] = arg0.height;
			Static674.anIntArray760[Static674.anInt10592++] = arg0.rgbBitCount;
			Static674.anIntArray760[Static674.anInt10592++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	public void method9002(@OriginalArg(1) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)[I")
	public int[] method9003() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static674.anIntArray760 = new int[Static674.anInt10592];
		Static674.anInt10592 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(33) int[] local33 = Static674.anIntArray760;
		Static674.anInt10592 = 0;
		Static674.anIntArray760 = null;
		return local33;
	}
}
