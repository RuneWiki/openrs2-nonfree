import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!o", name = "b", descriptor = "I")
	public static int anInt4121 = 0;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1442 = Static120.method2057("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!o", name = "i", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1443 = Static120.method2057("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!o", name = "k", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1444 = Static120.method2057("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!rh;B)Lclient!rh;")
	public static Class77 method3135(@OriginalArg(0) Class77 arg0) {
		@Pc(12) Class77 local12 = Static94.method1584(arg0);
		if (local12 == null) {
			local12 = arg0.aClass77_12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public static void method3136() {
		aClass81_1443 = null;
		aClass81_1442 = null;
		aClass81_1444 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!rh;IIIIIII)V")
	public static void method3138(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static104.aBoolean96) {
			Static170.anInt3939 = 32;
		} else {
			Static170.anInt3939 = 0;
		}
		Static104.aBoolean96 = false;
		@Pc(120) int local120;
		if (Static1.anInt20 != 0) {
			if (arg3 >= arg6 && arg6 + 16 > arg3 && arg2 <= arg1 && arg2 + 16 > arg1) {
				arg0.anInt3234 -= 4;
				Static51.method913(arg0);
			} else if (arg6 <= arg3 && arg3 < arg6 + 16 && arg4 + arg2 - 16 <= arg1 && arg4 + arg2 > arg1) {
				arg0.anInt3234 += 4;
				Static51.method913(arg0);
			} else if (arg3 >= arg6 - Static170.anInt3939 && arg6 + Static170.anInt3939 + 16 > arg3 && arg1 >= arg2 + 16 && arg1 < arg2 + arg4 - 16) {
				local120 = (arg4 - 32) * arg4 / arg5;
				if (local120 < 8) {
					local120 = 8;
				}
				@Pc(134) int local134 = arg4 - local120 - 32;
				@Pc(145) int local145 = arg1 - arg2 - local120 / 2 - 16;
				arg0.anInt3234 = local145 * (arg5 - arg4) / local134;
				Static51.method913(arg0);
				Static104.aBoolean96 = true;
			}
		}
		if (Static125.anInt2757 == 0) {
			return;
		}
		local120 = arg0.anInt3217;
		if (arg6 - local120 <= arg3 && arg2 <= arg1 && arg3 < arg6 + 16 && arg2 + arg4 >= arg1) {
			arg0.anInt3234 += Static125.anInt2757 * 45;
			Static51.method913(arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Lclient!ob;")
	public static Class62 method3139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass62_1;
	}
}
