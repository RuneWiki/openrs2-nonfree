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

@OriginalClass("client!ig")
public final class Class141 implements IEnumModesCallback {

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	public Class141() {
		this.aDirectDraw1.initialize(null);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)[I")
	public int[] method3683() {
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		Static221.anIntArray212 = new int[Static221.anInt4594];
		Static221.anInt4594 = 0;
		this.aDirectDraw1.enumDisplayModes(0, null, null, this);
		@Pc(28) int[] local28 = Static221.anIntArray212;
		Static221.anIntArray212 = null;
		Static221.anInt4594 = 0;
		return local28;
	}

	@OriginalMember(owner = "client!ig", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static221.anIntArray212 == null) {
			Static221.anInt4594 += 4;
		} else {
			Static221.anIntArray212[Static221.anInt4594++] = arg0.width;
			Static221.anIntArray212[Static221.anInt4594++] = arg0.height;
			Static221.anIntArray212[Static221.anInt4594++] = arg0.rgbBitCount;
			Static221.anIntArray212[Static221.anInt4594++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	public void method3684(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILjava/awt/Frame;IBII)V")
	public void method3685(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg1.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg1, 17);
		this.aDirectDraw1.setDisplayMode(arg2, arg3, arg0, arg4, 0);
		arg1.setBounds(0, 0, arg2, arg3);
		arg1.toFront();
		arg1.requestFocus();
	}
}
