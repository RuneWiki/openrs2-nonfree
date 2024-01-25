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

@OriginalClass("client!lg")
public final class Class220 implements IEnumModesCallback {

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
	public Class220() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	public void method4993(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V")
	public void method4994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Frame arg3, @OriginalArg(5) int arg4) {
		arg3.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg3.getPeer();
		@Pc(9) int local9 = local6.getHwnd();
		User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local9, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg3, 17);
		this.aDirectDraw1.setDisplayMode(arg2, arg0, arg4, arg1, 0);
		arg3.setBounds(0, 0, arg2, arg0);
		arg3.toFront();
		arg3.requestFocus();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)[I")
	public int[] method4995() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static330.anIntArray325 = new int[Static330.anInt5570];
		Static330.anInt5570 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(27) int[] local27 = Static330.anIntArray325;
		Static330.anIntArray325 = null;
		Static330.anInt5570 = 0;
		return local27;
	}

	@OriginalMember(owner = "client!lg", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static330.anIntArray325 == null) {
			Static330.anInt5570 += 4;
		} else {
			Static330.anIntArray325[Static330.anInt5570++] = arg0.width;
			Static330.anIntArray325[Static330.anInt5570++] = arg0.height;
			Static330.anIntArray325[Static330.anInt5570++] = arg0.rgbBitCount;
			Static330.anIntArray325[Static330.anInt5570++] = arg0.refreshRate;
		}
	}
}
