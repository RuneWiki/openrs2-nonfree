import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
	public static int anInt5427 = 0;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)V")
	public static void method4726() {
		for (@Pc(6) Class63_Sub4 local6 = (Class63_Sub4) Static178.aClass24_3.method621(); local6 != null; local6 = (Class63_Sub4) Static178.aClass24_3.method621()) {
			Static118.method2323(local6);
		}
		Static43.method984();
		Static43.method968();
		Static43.method982();
		Static43.method963();
		Static43.method979();
		Static43.method969();
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(IIIII)V")
	public static void method4727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg0 >= Static184.anInt6250 && arg0 + arg2 <= Static80.anInt4809 && Static314.anInt6018 <= arg3 - arg0 && arg0 + arg3 <= Static334.anInt6315) {
			Static125.method2418(arg2, arg1, arg3, arg0);
		} else {
			Static101.method2029(arg0, arg2, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IC)Z")
	public static boolean method4728(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)Lclient!bk;")
	public static Class5_Sub1 method4729() {
		@Pc(8) Class5_Sub1 local8 = new Class5_Sub1(37);
		local8.method1886(14);
		local8.method1886(Static190.anInt3772);
		local8.method1886(Static193.aBoolean269 ? 1 : 0);
		local8.method1886(Static114.aBoolean158 ? 1 : 0);
		local8.method1886(Static22.aBoolean43 ? 1 : 0);
		local8.method1886(Static262.aBoolean384 ? 1 : 0);
		local8.method1886(0);
		local8.method1886(Static263.aBoolean385 ? 1 : 0);
		local8.method1886(Static67.aBoolean110 ? 1 : 0);
		local8.method1886(Static267.aBoolean391 ? 1 : 0);
		local8.method1886(Static134.anInt2750);
		local8.method1886(Static8.aBoolean7 ? 1 : 0);
		local8.method1886(Static322.aBoolean457 ? 1 : 0);
		local8.method1886(Static18.aBoolean39 ? 1 : 0);
		local8.method1886(Static32.anInt866);
		local8.method1886(Static29.aBoolean56 ? 1 : 0);
		local8.method1886(Static126.anInt2647);
		local8.method1886(Static111.anInt2405);
		local8.method1886(Static123.anInt2600);
		local8.method1870(Static229.anInt4486);
		local8.method1870(Static45.anInt1175);
		local8.method1886(Static13.method489());
		local8.method1851(Static216.anInt4318);
		local8.method1886(Static326.anInt6197);
		local8.method1886(Static140.aBoolean186 ? 1 : 0);
		local8.method1886(Static139.aBoolean462 ? 1 : 0);
		local8.method1886(Static335.anInt6338);
		local8.method1886(Static91.aBoolean135 ? 1 : 0);
		local8.method1886(Static183.aBoolean261 ? 1 : 0);
		local8.method1886(Static332.anInt6258);
		local8.method1886(Static90.aBoolean316 ? 1 : 0);
		local8.method1886(Static355.anInt6625);
		return local8;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLjava/lang/String;Lclient!ra;Z)Lclient!tm;")
	public static Class194 method4730(@OriginalArg(1) String arg0, @OriginalArg(2) Class170 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(15) int local15 = arg1.method4555(arg0);
		if (local15 == -1) {
			return new Class194(0);
		}
		@Pc(28) int[] local28 = arg1.method4573(local15);
		@Pc(34) Class194 local34 = new Class194(local28.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local36 < local34.anInt5914) {
				@Pc(52) Class5_Sub1 local52 = new Class5_Sub1(arg1.method4584(local15, local28[local38++]));
				@Pc(56) int local56 = local52.method1826();
				@Pc(60) int local60 = local52.method1845();
				@Pc(64) int local64 = local52.method1832();
				if (!arg2 && local64 == 1) {
					local34.anInt5914--;
				} else {
					local34.anIntArray499[local36] = local56;
					local34.anIntArray500[local36] = local60;
					local36++;
				}
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!en;IILclient!dl;III)V")
	public static void method4731(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class49 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) Interface8 local5 = null;
		if (arg5 == 0) {
			local5 = (Interface8) Static178.method3304(arg4, arg0, arg2);
		}
		if (arg5 == 1) {
			local5 = (Interface8) Static258.method4479(arg4, arg0, arg2);
		}
		if (arg5 == 2) {
			local5 = (Interface8) Static82.method1816(arg4, arg0, arg2, sl.class);
		}
		if (arg5 == 3) {
			local5 = (Interface8) Static251.method4403(arg4, arg0, arg2);
		}
		if (local5 == null) {
			return;
		}
		@Pc(67) int local67 = local5.method5554();
		@Pc(71) int local71 = local5.method5552();
		@Pc(77) Class137 local77 = Static228.method3923(local5.method5549());
		if (local77.method3712()) {
			Static293.method4968(arg4, arg2, local77, arg0);
		}
		if (local5.method5551()) {
			local5.method5550(arg1);
		}
		if (arg5 != 0) {
			if (arg5 == 1) {
				Static58.method1228(arg4, arg0, arg2);
				return;
			}
			if (arg5 == 2) {
				Static232.method3986(arg4, arg0, arg2, sl.class);
				if (local77.anInt4128 != 0 && arg0 + local77.anInt4126 < Static266.anInt5101 && arg2 + local77.anInt4126 < Static339.anInt6352 && Static266.anInt5101 > arg0 + local77.anInt4166 && Static339.anInt6352 > arg2 + local77.anInt4166) {
					arg3.method1241(arg0, local77.anInt4166, local71, !local77.aBoolean291, local77.anInt4126, local77.aBoolean290, arg2);
					return;
				}
			} else if (arg5 == 3) {
				Static39.method882(arg4, arg0, arg2);
				if (local77.anInt4128 != 1) {
					return;
				}
				arg3.method1244(arg0, arg2);
			} else {
				return;
			}
			return;
		}
		Static230.method3966(arg4, arg0, arg2);
		if (local77.anInt4128 != 0) {
			arg3.method1231(arg0, local67, local77.aBoolean290, !local77.aBoolean291, arg2, local71);
			return;
		}
	}

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)Lclient!ui;")
	public static Class126 method4732() {
		try {
			return new Class126_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class126) Class.forName("Class126_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(18) Throwable local18) {
				return new Class126_Sub1();
			}
		}
	}
}
