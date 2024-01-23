import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "Lclient!hh;")
	public static Class50 aClass50_379;

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "[Lclient!sf;")
	public static Class106[] aClass106Array1;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "Lclient!hh;")
	public static Class50 aClass50_380 = Static186.method3527("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "Lclient!hh;")
	public static Class50 aClass50_381 = Static186.method3527("VOLL");

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
	public static int anInt1063 = 0;

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "[I")
	public static int[] anIntArray90 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!eg", name = "D", descriptor = "Lclient!qh;")
	public static Class93 aClass93_34 = null;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)Lclient!n;")
	public static Class42 method800() {
		try {
			return (Class42) Class.forName("Class42_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V")
	public static void method802() {
		for (@Pc(8) int local8 = -1; local8 < Static13.anInt250; local8++) {
			@Pc(16) int local16;
			if (local8 == -1) {
				local16 = 2047;
			} else {
				local16 = Static52.anIntArray356[local8];
			}
			@Pc(26) Class20_Sub3_Sub1 local26 = Static232.aClass20_Sub3_Sub1Array1[local16];
			if (local26 != null) {
				Static5.method84(local26.anInt3034, local26);
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([BIII)Z")
	public static boolean method803(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class1_Sub17 local17 = new Class1_Sub17(arg0);
		@Pc(19) int local19 = -1;
		label56: while (true) {
			@Pc(23) int local23 = local17.method2132();
			if (local23 == 0) {
				return local7;
			}
			@Pc(27) int local27 = 0;
			local19 += local23;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(39) int local39;
				while (!local33) {
					local39 = local17.method2156();
					if (local39 == 0) {
						continue label56;
					}
					local27 += local39 - 1;
					@Pc(66) int local66 = local27 & 0x3F;
					@Pc(72) int local72 = local27 >> 6 & 0x3F;
					@Pc(78) int local78 = local17.method2142() >> 2;
					@Pc(83) int local83 = local72 + arg1;
					@Pc(87) int local87 = arg2 + local66;
					if (local83 > 0 && local87 > 0 && local83 < 103 && local87 < 103) {
						@Pc(111) Class18 local111 = Static148.method2487(local19);
						if (local78 != 22 || Static24.aBoolean14 || local111.anInt824 != 0 || local111.anInt807 == 1 || local111.aBoolean36) {
							if (!local111.method602()) {
								local7 = false;
								Static114.anInt2290++;
							}
							local33 = true;
						}
					}
				}
				local39 = local17.method2156();
				if (local39 == 0) {
					break;
				}
				local17.method2142();
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)I")
	public static int method804(@OriginalArg(0) int arg0) {
		@Pc(7) Class91 local7 = Static181.method2968(arg0);
		@Pc(18) int local18 = local7.anInt3507;
		@Pc(21) int local21 = local7.anInt3510;
		@Pc(28) int local28 = Class1_Sub1_Sub4.anIntArray42[local21 - local18];
		@Pc(31) int local31 = local7.anInt3503;
		return Static24.anIntArray49[local31] >> local18 & local28;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIII)V")
	public static void method805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static131.anInt2713 <= arg2 - arg0 && arg2 + arg0 <= Static135.anInt2790 && Static49.anInt1030 <= arg1 - arg0 && Static177.anInt3701 >= arg0 + arg1) {
			Static124.method1980(arg3, arg2, arg1, arg0, arg4, arg5);
		} else {
			Static197.method3492(arg1, arg4, arg0, arg3, arg5, arg2);
		}
	}
}
