import java.awt.Frame;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!rfa", name = "r", descriptor = "J")
	public static long aLong238;

	@OriginalMember(owner = "client!rfa", name = "i", descriptor = "[I")
	public static final int[] anIntArray596 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!rfa", name = "l", descriptor = "[I")
	public static final int[] anIntArray597 = new int[3];

	@OriginalMember(owner = "client!rfa", name = "o", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_79 = new Class70(51, 8);

	@OriginalMember(owner = "client!rfa", name = "p", descriptor = "[I")
	public static final int[] anIntArray598 = new int[200];

	@OriginalMember(owner = "client!rfa", name = "v", descriptor = "Z")
	public static boolean aBoolean596 = false;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(III)Z")
	public static boolean method6201(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static30.method388(arg0, arg1) | Static549.method6482(arg1, arg0) | Static114.method1789(arg0, arg1)) & Static29.method347(arg1, arg0);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6202(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 <= '\u007f') {
				local10++;
			} else if (local18 <= '\u07ff') {
				local10 += 2;
			} else {
				local10 += 3;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!ft;ILjava/awt/Frame;)V")
	public static void method6203(@OriginalArg(0) Class109 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(10) Class260 local10 = arg0.method2185(arg1);
			while (local10.anInt7041 == 0) {
				Static391.method5400(10L);
			}
			if (local10.anInt7041 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static391.method5400(100L);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIB)I")
	public static int method6205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(50) int local50 = Static442.method6112(arg1 - 1, arg0 - 1) + Static442.method6112(arg1 - 1, arg0 + 1) + Static442.method6112(arg1 - -1, arg0 + -1) + Static442.method6112(arg1 - -1, arg0 + 1);
		@Pc(84) int local84 = Static442.method6112(arg1, arg0 - 1) + Static442.method6112(arg1, arg0 + 1) + Static442.method6112(arg1 - 1, arg0) + Static442.method6112(arg1 + 1, arg0);
		@Pc(89) int local89 = Static442.method6112(arg1, arg0);
		return local89 / 4 + local84 / 8 + local50 / 16;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IZII)V")
	public static void method6206(@OriginalArg(1) boolean arg0) {
		Class1_Sub30_Sub1.lb = 22050;
		Static517.anInt9665 = 2;
		Static19.aBoolean22 = arg0;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!ft;BLjava/lang/Object;)V")
	public static void method6207(@OriginalArg(0) Class109 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg0.anEventQueue1.peekEvent() != null; local16++) {
			Static391.method5400(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(42) Exception local42) {
		}
	}
}
