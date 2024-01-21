import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!q", name = "cb", descriptor = "Lclient!tf;")
	public static Class81 aClass81_10 = new Class81();

	@OriginalMember(owner = "client!q", name = "hb", descriptor = "I")
	public static int anInt2850 = 2;

	@OriginalMember(owner = "client!q", name = "ib", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1291 = Static32.method683("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!q", name = "pb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1292 = Static32.method683("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZIILclient!vg;III)V")
	public static void method2211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class85 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static171.aBoolean157) {
			Static178.anInt3907 = 32;
		} else {
			Static178.anInt3907 = 0;
		}
		Static171.aBoolean157 = false;
		@Pc(133) int local133;
		if (Static182.anInt4058 != 0) {
			if (arg4 <= arg1 && arg4 + 16 > arg1 && arg5 <= arg6 && arg6 < arg5 + 16) {
				arg3.anInt3891 -= 4;
				Static102.method1756(arg3);
			} else if (arg1 >= arg4 && arg4 + 16 > arg1 && arg6 >= arg5 + arg2 - 16 && arg6 < arg2 + arg5) {
				arg3.anInt3891 += 4;
				Static102.method1756(arg3);
			} else if (arg4 - Static178.anInt3907 <= arg1 && arg1 < Static178.anInt3907 + arg4 + 16 && arg5 + 16 <= arg6 && arg2 + arg5 - 16 > arg6) {
				local133 = (arg2 - 32) * arg2 / arg0;
				if (local133 < 8) {
					local133 = 8;
				}
				@Pc(150) int local150 = arg6 - local133 / 2 - arg5 - 16;
				@Pc(156) int local156 = arg2 - local133 - 32;
				arg3.anInt3891 = local150 * (arg0 - arg2) / local156;
				Static102.method1756(arg3);
				Static171.aBoolean157 = true;
			}
		}
		if (Static42.anInt1030 == 0) {
			return;
		}
		local133 = arg3.anInt3858;
		if (arg4 - local133 <= arg1 && arg6 >= arg5 && arg1 < arg4 + 16 && arg5 + arg2 >= arg6) {
			arg3.anInt3891 += Static42.anInt1030 * 45;
			Static102.method1756(arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!q", name = "e", descriptor = "(I)I")
	public static int method2212() {
		return 6;
	}

	@OriginalMember(owner = "client!q", name = "f", descriptor = "(I)V")
	public static void method2213() {
		aClass81_10 = null;
		aClass49_1291 = null;
		aClass49_1292 = null;
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(III)Z")
	public static boolean method2214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!q", name = "h", descriptor = "(I)V")
	public static void method2217(@OriginalArg(0) int arg0) {
		Static170.anInt3723 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static91.anInt1931; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static59.anInt1256; local6++) {
				if (Static72.aClass2_Sub1ArrayArrayArray1[arg0][local3][local6] == null) {
					Static72.aClass2_Sub1ArrayArrayArray1[arg0][local3][local6] = new Class2_Sub1(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!ke;ILjava/lang/Object;)V")
	public static void method2219(@OriginalArg(0) Class45 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static50.method901(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
