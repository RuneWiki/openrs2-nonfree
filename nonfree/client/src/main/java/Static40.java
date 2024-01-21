import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!di", name = "d", descriptor = "Z")
	public static boolean aBoolean42;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!di", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_673 = Static118.method2249("Sprites geladen)3");

	@OriginalMember(owner = "client!di", name = "c", descriptor = "I")
	public static int anInt1074 = 0;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "I")
	public static int anInt1077 = 0;

	@OriginalMember(owner = "client!di", name = "o", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_674 = Static118.method2249(":duelfriend:");

	@OriginalMember(owner = "client!di", name = "p", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_675 = Static118.method2249("Too many connections from your address)3");

	@OriginalMember(owner = "client!di", name = "s", descriptor = "Lclient!oc;")
	public static Class65 aClass65_676 = aClass65_675;

	@OriginalMember(owner = "client!di", name = "t", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_677 = Static118.method2249("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([SI[Lclient!oc;II)V")
	public static void method693(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg3) / 2;
		@Pc(21) int local21 = arg3;
		@Pc(25) Class65 local25 = arg2[local19];
		arg2[local19] = arg2[arg1];
		arg2[arg1] = local25;
		@Pc(39) short local39 = arg0[local19];
		arg0[local19] = arg0[arg1];
		arg0[arg1] = local39;
		for (@Pc(51) int local51 = arg3; local51 < arg1; local51++) {
			if (local25 == null || arg2[local51] != null && arg2[local51].method2464(local25) < (local51 & 0x1)) {
				@Pc(76) Class65 local76 = arg2[local51];
				arg2[local51] = arg2[local21];
				arg2[local21] = local76;
				@Pc(90) short local90 = arg0[local51];
				arg0[local51] = arg0[local21];
				arg0[local21++] = local90;
			}
		}
		arg2[arg1] = arg2[local21];
		arg2[local21] = local25;
		arg0[arg1] = arg0[local21];
		arg0[local21] = local39;
		method693(arg0, local21 - 1, arg2, arg3);
		method693(arg0, arg1, arg2, local21 + 1);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([BIII)Z")
	public static boolean method694(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class1_Sub14 local18 = new Class1_Sub14(arg0);
		@Pc(20) boolean local20 = true;
		@Pc(22) int local22 = -1;
		label68: while (true) {
			@Pc(26) int local26 = local18.method1734();
			if (local26 == 0) {
				return local20;
			}
			local22 += local26;
			@Pc(37) int local37 = 0;
			@Pc(39) boolean local39 = false;
			while (true) {
				@Pc(69) int local69;
				@Pc(98) Class1_Sub2_Sub13 local98;
				do {
					@Pc(74) int local74;
					@Pc(78) int local78;
					do {
						do {
							do {
								do {
									@Pc(45) int local45;
									while (local39) {
										local45 = local18.method1703();
										if (local45 == 0) {
											continue label68;
										}
										local18.method1738();
									}
									local45 = local18.method1703();
									if (local45 == 0) {
										continue label68;
									}
									local37 += local45 - 1;
									@Pc(59) int local59 = local37 >> 6 & 0x3F;
									@Pc(63) int local63 = local37 & 0x3F;
									local69 = local18.method1738() >> 2;
									local74 = local59 + arg1;
									local78 = arg2 + local63;
								} while (local74 <= 0);
							} while (local78 <= 0);
						} while (local74 >= 103);
					} while (local78 >= 103);
					local98 = Static5.method65(local22);
				} while (local69 == 22 && Static13.aBoolean36 && local98.anInt1982 == 0 && local98.anInt2004 != 1 && !local98.aBoolean88);
				local39 = true;
				if (!local98.method1426()) {
					Static79.anInt1933++;
					local20 = false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V")
	public static void method696() {
		if (Static120.aClass53_1 != null) {
			@Pc(3) Class53 local3 = Static120.aClass53_1;
			synchronized (Static120.aClass53_1) {
				Static120.aClass53_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Lclient!b;")
	public static Class1_Sub2_Sub2 method700(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub2_Sub2 local14 = (Class1_Sub2_Sub2) Static98.aClass87_45.method3062((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(28) byte[] local28 = Static204.aClass60_39.method2340(Static135.method2564(arg0), Static45.method755(arg0));
		local14 = new Class1_Sub2_Sub2();
		local14.anInt281 = arg0;
		if (local28 != null) {
			local14.method221(new Class1_Sub14(local28));
		}
		local14.method223();
		if (local14.anInt300 != -1) {
			local14.method220(method700(local14.anInt290), method700(local14.anInt300));
		}
		if (local14.anInt304 != -1) {
			local14.method224(method700(local14.anInt280), method700(local14.anInt304));
		}
		if (!Static171.aBoolean152 && local14.aBoolean13) {
			local14.aBoolean12 = false;
			local14.aClass65_229 = Static92.aClass65_1342;
			local14.anInt288 = 0;
			local14.aClass65Array4 = null;
			local14.aClass65Array5 = null;
		}
		Static98.aClass87_45.method3068(local14, (long) arg0);
		return local14;
	}
}
