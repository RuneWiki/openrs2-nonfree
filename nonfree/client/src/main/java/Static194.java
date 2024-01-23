import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "Lclient!s;")
	public static Class1_Sub27 aClass1_Sub27_1;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
	public static int anInt4291;

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "Lclient!jb;")
	public static Class28 aClass28_68;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "Z")
	public static boolean aBoolean377;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
	public static int anInt4292;

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
	public static int anInt4293;

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
	public static int anInt4294;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1116 = Static231.method3737("name_icons");

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "[S")
	public static short[] aShortArray50 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
	public static int anInt4290 = -1;

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "Lclient!re;")
	public static Class1_Sub26_Sub1 aClass1_Sub26_Sub1_3 = new Class1_Sub26_Sub1(5000);

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1122 = Static231.method3737("flash1:");

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1117 = aClass107_1122;

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1118 = Static231.method3737(":duelfriend:");

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1119 = Static231.method3737("Type");

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1120 = aClass107_1122;

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1121 = aClass107_1119;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBIII)V")
	public static void method3156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = -1;
		@Pc(14) int local14 = -arg1;
		@Pc(22) int local22 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg1 + arg2);
		@Pc(30) int local30 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg2 - arg1);
		Static162.method2605(Static231.anIntArrayArray44[arg3], local30, arg0, local22);
		while (local9 < local7) {
			local11 += 2;
			local14 += local11;
			@Pc(78) int local78;
			@Pc(73) int local73;
			@Pc(92) int local92;
			@Pc(101) int local101;
			if (local14 > 0) {
				local7--;
				local14 -= local7 << 1;
				local73 = arg3 + local7;
				local78 = arg3 - local7;
				if (Static223.anInt4869 <= local73 && Static47.anInt1057 >= local78) {
					local92 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg2 + local9);
					local101 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg2 - local9);
					if (Static47.anInt1057 >= local73) {
						Static162.method2605(Static231.anIntArrayArray44[local73], local101, arg0, local92);
					}
					if (Static223.anInt4869 <= local78) {
						Static162.method2605(Static231.anIntArrayArray44[local78], local101, arg0, local92);
					}
				}
			}
			local9++;
			local73 = arg3 + local9;
			local78 = arg3 - local9;
			if (Static223.anInt4869 <= local73 && local78 <= Static47.anInt1057) {
				local92 = Static123.method2091(Static38.anInt784, Static99.anInt915, local7 + arg2);
				local101 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg2 - local7);
				if (local73 <= Static47.anInt1057) {
					Static162.method2605(Static231.anIntArrayArray44[local73], local101, arg0, local92);
				}
				if (Static223.anInt4869 <= local78) {
					Static162.method2605(Static231.anIntArrayArray44[local78], local101, arg0, local92);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)I")
	public static int method3157() {
		return 0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 0 || arg5 < 0 || arg6 >= 103 || arg5 >= 103) {
			return;
		}
		@Pc(31) int local31;
		if (arg1 == 0) {
			@Pc(21) Class97 local21 = Static139.method2341(arg3, arg6, arg5);
			if (local21 != null) {
				local31 = Integer.MAX_VALUE & (int) (local21.aLong136 >>> 32);
				if (arg0 == 2) {
					local21.aClass5_8 = new Class5_Sub7(local31, 2, arg2 + 4, arg3, arg6, arg5, arg4, false, local21.aClass5_8);
					local21.aClass5_9 = new Class5_Sub7(local31, 2, arg2 + 1 & 0x3, arg3, arg6, arg5, arg4, false, local21.aClass5_9);
				} else {
					local21.aClass5_8 = new Class5_Sub7(local31, arg0, arg2, arg3, arg6, arg5, arg4, false, local21.aClass5_8);
				}
			}
		}
		if (arg1 == 1) {
			@Pc(96) Class46 local96 = Static113.method1959(arg3, arg6, arg5);
			if (local96 != null) {
				local31 = Integer.MAX_VALUE & (int) (local96.aLong57 >>> 32);
				if (arg0 == 4 || arg0 == 5) {
					local96.aClass5_3 = new Class5_Sub7(local31, 4, arg2, arg3, arg6, arg5, arg4, false, local96.aClass5_3);
				} else if (arg0 == 6) {
					local96.aClass5_3 = new Class5_Sub7(local31, 4, arg2 + 4, arg3, arg6, arg5, arg4, false, local96.aClass5_3);
				} else if (arg0 == 7) {
					local96.aClass5_3 = new Class5_Sub7(local31, 4, (arg2 + 2 & 0x3) + 4, arg3, arg6, arg5, arg4, false, local96.aClass5_3);
				} else if (arg0 == 8) {
					local96.aClass5_3 = new Class5_Sub7(local31, 4, arg2 + 4, arg3, arg6, arg5, arg4, false, local96.aClass5_3);
					local96.aClass5_2 = new Class5_Sub7(local31, 4, (arg2 + 2 & 0x3) + 4, arg3, arg6, arg5, arg4, false, local96.aClass5_2);
				}
			}
		}
		if (arg1 == 2) {
			@Pc(230) Class99 local230 = Static108.method1890(arg3, arg6, arg5);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (local230 != null) {
				local230.aClass5_10 = new Class5_Sub7((int) (local230.aLong140 >>> 32) & Integer.MAX_VALUE, arg0, arg2, arg3, arg6, arg5, arg4, false, local230.aClass5_10);
			}
		}
		if (arg1 == 3) {
			@Pc(268) Class40 local268 = Static86.method1491(arg3, arg6, arg5);
			if (local268 != null) {
				local268.aClass5_1 = new Class5_Sub7((int) (local268.aLong49 >>> 32) & Integer.MAX_VALUE, 22, arg2, arg3, arg6, arg5, arg4, false, local268.aClass5_1);
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!ed;Lclient!mj;Lclient!ra;IIII)V")
	public static void method3159(@OriginalArg(1) Class5_Sub5_Sub1 arg0, @OriginalArg(2) Class5_Sub5_Sub2 arg1, @OriginalArg(3) Class101 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(19) Class1_Sub21 local19 = new Class1_Sub21();
		local19.anInt3418 = arg6 * 128;
		local19.anInt3413 = arg4 * 128;
		local19.anInt3425 = arg5;
		if (arg2 != null) {
			local19.anIntArray300 = arg2.anIntArray339;
			local19.anInt3428 = arg2.anInt3898;
			local19.anInt3424 = arg2.anInt3918;
			local19.anInt3411 = arg2.anInt3910;
			local19.aClass101_1 = arg2;
			@Pc(156) int local156 = arg2.anInt3904;
			local19.anInt3414 = arg2.anInt3899 * 128;
			@Pc(165) int local165 = arg2.anInt3922;
			if (arg3 == 1 || arg3 == 3) {
				local156 = arg2.anInt3922;
				local165 = arg2.anInt3904;
			}
			local19.anInt3412 = (arg4 + local165) * 128;
			local19.anInt3420 = (arg6 + local156) * 128;
			if (arg2.anIntArray338 != null) {
				local19.aBoolean300 = true;
				local19.method2527();
			}
			if (local19.anIntArray300 != null) {
				local19.anInt3426 = (int) (Math.random() * (double) (local19.anInt3411 - local19.anInt3428)) + local19.anInt3428;
			}
			Static157.aClass120_18.method3567(local19);
			return;
		}
		if (arg1 != null) {
			local19.aClass5_Sub5_Sub2_1 = arg1;
			@Pc(42) Class30 local42 = arg1.aClass30_1;
			if (local42.anIntArray102 != null) {
				local19.aBoolean300 = true;
				local42 = local42.method870();
			}
			if (local42 != null) {
				local19.anInt3420 = (local42.anInt961 + arg6) * 128;
				local19.anInt3412 = (arg4 + local42.anInt961) * 128;
				local19.anInt3424 = Static19.method374(arg1);
				local19.anInt3414 = local42.anInt972 * 128;
			}
			Static82.aClass120_9.method3567(local19);
			return;
		}
		if (arg0 == null) {
			return;
		}
		local19.anInt3420 = (arg0.anInt2997 + arg6) * 128;
		local19.aClass5_Sub5_Sub1_3 = arg0;
		local19.anInt3412 = (arg4 + arg0.anInt2997) * 128;
		local19.anInt3424 = Static188.method3060(arg0);
		local19.anInt3414 = arg0.anInt1291 * 128;
		Static59.aClass50_10.method1362(arg0.aClass107_351.method3066(), local19);
		return;
	}
}
