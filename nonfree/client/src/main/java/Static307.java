import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!mg", name = "y", descriptor = "Lclient!iaa;")
	public static Class139 aClass139_1;

	@OriginalMember(owner = "client!mg", name = "B", descriptor = "Z")
	public static boolean aBoolean415 = false;

	@OriginalMember(owner = "client!mg", name = "C", descriptor = "J")
	public static long aLong171 = -1L;

	@OriginalMember(owner = "client!mg", name = "D", descriptor = "Lclient!cb;")
	public static Class42 aClass42_24 = new Class42(8);

	@OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
	public static int anInt6046 = 1;

	@OriginalMember(owner = "client!mg", name = "K", descriptor = "[I")
	public static final int[] anIntArray415 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
	public static void method5027(@OriginalArg(0) int arg0) {
		Static263.anInt5182 = arg0;
		Static134.anInt2779 = -1;
		Static224.anInt4176 = 3;
		Static183.anInt4083 = 100;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method5028(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class220 local8 = Static485.method6724(arg1, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray30 != null) {
			@Pc(18) Class5_Sub17 local18 = new Class5_Sub17();
			local18.anInt2980 = arg3;
			local18.aString35 = arg2;
			local18.aClass220_5 = local8;
			local18.anObjectArray3 = local8.anObjectArray30;
			Static266.method4403(local18);
		}
		if (Static389.anInt7024 != 9 || !Static68.method1303(local8).method1958(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static415.method5995(Static131.aClass236_23);
			Static505.method6630(local8.anInt6641, arg0, arg1);
		}
		if (arg3 == 2) {
			Static415.method5995(Static36.aClass236_3);
			Static505.method6630(local8.anInt6641, arg0, arg1);
		}
		if (arg3 == 3) {
			Static415.method5995(Static397.aClass236_64);
			Static505.method6630(local8.anInt6641, arg0, arg1);
		}
		if (arg3 == 4) {
			Static415.method5995(Static109.aClass236_20);
			Static505.method6630(local8.anInt6641, arg0, arg1);
		}
		if (arg3 == 5) {
			Static415.method5995(Static520.aClass236_97);
			Static505.method6630(local8.anInt6641, arg0, arg1);
		}
		if (arg3 == 6) {
			Static415.method5995(Static255.aClass236_48);
			Static505.method6630(local8.anInt6641, arg0, arg1);
		}
		if (arg3 == 7) {
			Static415.method5995(Static418.aClass236_67);
			Static505.method6630(local8.anInt6641, arg0, arg1);
		}
		if (arg3 == 8) {
			Static415.method5995(Static472.aClass236_83);
			Static505.method6630(local8.anInt6641, arg0, arg1);
		}
		if (arg3 == 9) {
			Static415.method5995(Static421.aClass236_68);
			Static505.method6630(local8.anInt6641, arg0, arg1);
		}
		if (arg3 == 10) {
			Static415.method5995(Static48.aClass236_8);
			Static505.method6630(local8.anInt6641, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5029(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(20) char local20 = arg0.charAt(local14);
			if (local20 == '%' && local12 > local14 + 2) {
				local20 = arg0.charAt(local14 + 1);
				@Pc(65) int local65;
				if (local20 >= '0' && local20 <= '9') {
					local65 = local20 - 48;
				} else if (local20 >= 'a' && local20 <= 'f') {
					local65 = local20 + 10 - 'a';
				} else {
					if (local20 < 'A' || local20 > 'F') {
						local9.append('%');
						continue;
					}
					local65 = local20 + '\n' - 65;
				}
				local65 *= 16;
				local20 = arg0.charAt(local14 + 2);
				if (local20 >= '0' && local20 <= '9') {
					local65 += local20 - 48;
				} else if (local20 >= 'a' && local20 <= 'f') {
					local65 += local20 - 87;
				} else {
					if (local20 < 'A' || local20 > 'F') {
						local9.append('%');
						continue;
					}
					local65 += local20 + 10 - 65;
				}
				if (local65 != 0 && Static40.method859((byte) local65)) {
					local9.append(Static260.method6803((byte) local65));
				}
				local14 += 2;
			} else if (local20 == '+') {
				local9.append(' ');
			} else {
				local9.append(local20);
			}
		}
		return local9.toString();
	}
}
