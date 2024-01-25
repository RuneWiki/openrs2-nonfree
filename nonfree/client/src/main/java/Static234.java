import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_58 = new Class244(43, 4);

	@OriginalMember(owner = "client!nh", name = "V", descriptor = "I")
	public static int anInt4190 = -1;

	@OriginalMember(owner = "client!nh", name = "ab", descriptor = "I")
	public static int anInt4195 = 0;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!np;)V")
	public static void method3883(@OriginalArg(1) Class155 arg0) {
		if (Static91.anInt2989 != Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73 && (Static69.aClass48ArrayArrayArray1 != null && Static254.method894(Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73, arg0))) {
			Static91.anInt2989 = Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III[BII)Z")
	public static boolean method3884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class3_Sub5 local17 = new Class3_Sub5(arg2);
		@Pc(19) int local19 = -1;
		label70: while (true) {
			@Pc(23) int local23 = local17.method2777();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(65) int local65;
				@Pc(101) Class60 local101;
				do {
					@Pc(69) int local69;
					@Pc(73) int local73;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local17.method2750();
										if (local39 == 0) {
											continue label70;
										}
										local17.method2739();
									}
									local39 = local17.method2750();
									if (local39 == 0) {
										continue label70;
									}
									local31 += local39 - 1;
									@Pc(51) int local51 = local31 & 0x3F;
									@Pc(57) int local57 = local31 >> 6 & 0x3F;
									local65 = local17.method2739() >> 2;
									local69 = local57 + arg1;
									local73 = arg0 + local51;
								} while (local69 <= 0);
							} while (local73 <= 0);
						} while (arg4 - 1 <= local69);
					} while (arg3 - 1 <= local73);
					local101 = Static97.aClass217_4.method5007(local19);
				} while (local65 == 22 && !Static164.aClass154_Sub1_1.aBoolean475 && local101.anInt1415 == 0 && local101.anInt1418 != 1 && !local101.aBoolean94);
				if (!local101.method1198()) {
					Static55.anInt1126++;
					local12 = false;
				}
				local33 = true;
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(B)V")
	public static void method3886() {
		Static366.anInt4870 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static192.aClass3_Sub5Array1[local14] = null;
			Static338.aByteArray81[local14] = 1;
		}
	}
}
