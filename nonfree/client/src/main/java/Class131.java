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

@OriginalClass("client!hga")
public final class Class131 implements IEnumModesCallback {

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "()V")
	public Class131() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!hga", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static209.anIntArray244 == null) {
			Static209.anInt4126 += 4;
		} else {
			Static209.anIntArray244[Static209.anInt4126++] = arg0.width;
			Static209.anIntArray244[Static209.anInt4126++] = arg0.height;
			Static209.anIntArray244[Static209.anInt4126++] = arg0.rgbBitCount;
			Static209.anIntArray244[Static209.anInt4126++] = arg0.refreshRate;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	public void method3601(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IILjava/awt/Frame;IZI)V")
	public void method3602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Frame arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		arg2.setVisible(true);
		@Pc(6) WComponentPeer local6 = (WComponentPeer) arg2.getPeer();
		@Pc(15) int local15 = local6.getHwnd();
		User32.SetWindowLong(local15, -16, Integer.MIN_VALUE);
		User32.SetWindowLong(local15, -20, 8);
		this.aDirectDraw1.setCooperativeLevel(arg2, 17);
		this.aDirectDraw1.setDisplayMode(arg1, arg3, arg4, arg0, 0);
		arg2.setBounds(0, 0, arg1, arg3);
		arg2.toFront();
		arg2.requestFocus();
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)[I")
	public int[] method3603() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static209.anIntArray244 = new int[Static209.anInt4126];
		Static209.anInt4126 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(26) int[] local26 = Static209.anIntArray244;
		Static209.anIntArray244 = null;
		Static209.anInt4126 = 0;
		return local26;
	}
}
