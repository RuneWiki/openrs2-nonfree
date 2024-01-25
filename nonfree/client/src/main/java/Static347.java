import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "J")
	public static long aLong168 = -1L;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BIILclient!wm;)Lclient!su;")
	public static Class329 method5290(@OriginalArg(2) int arg0, @OriginalArg(3) Class390 arg1) {
		@Pc(16) byte[] local16 = arg1.method8914(arg0, 0);
		return local16 == null ? null : new Class329(local16);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method5291(@OriginalArg(1) Class65 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static66.aBoolean570) {
			local7 = Static106.method2037();
			local9 = Static660.method8815();
		}
		Static451.method6506(Static54.anInt805, local7 + Static477.anInt8042, Static633.anInt10304, arg0, Static542.anInt6468 + local9);
		Static231.aClass73_8.method5773(local9 + Static542.anInt6468 + 14, -10660793, Static64.aClass52_24.method907(Static544.anInt8937), local7 + Static477.anInt8042 + 3, -1);
		@Pc(58) int local58 = local7 + Static359.aClass11_1.method6141();
		@Pc(66) int local66 = Static359.aClass11_1.method6144() + local9;
		@Pc(70) int local70;
		@Pc(94) int local94;
		if (Static364.aBoolean585) {
			local70 = 0;
			for (@Pc(129) Class5_Sub3_Sub15 local129 = (Class5_Sub3_Sub15) Static609.aClass358_13.method8322(); local129 != null; local129 = (Class5_Sub3_Sub15) Static609.aClass358_13.method8328()) {
				local94 = local9 + Static542.anInt6468 + local70 * 16 + 31;
				local70++;
				if (local129.anInt8017 == 1) {
					Static642.method8658(Static477.anInt8042 + local7, Static54.anInt805, (Class5_Sub3_Sub20) local129.aClass358_7.aClass5_Sub3_60.aClass5_Sub3_66, local58, Static633.anInt10304, -256, local94, local9 + Static542.anInt6468, -1, local66, arg0);
				} else {
					Static368.method5562(arg0, Static633.anInt10304, -1, -256, local94, Static542.anInt6468 + local9, local129, Static54.anInt805, local66, local58, Static477.anInt8042 + local7);
				}
			}
			if (Static345.aClass5_Sub3_Sub15_1 != null) {
				Static451.method6506(Static469.anInt7914, Static556.anInt9088, Static260.anInt4826, arg0, Static220.anInt4457);
				Static231.aClass73_8.method5773(Static220.anInt4457 + 14, -10660793, Static345.aClass5_Sub3_Sub15_1.aString76, Static556.anInt9088 + 3, -1);
				local70 = 0;
				for (@Pc(229) Class5_Sub3_Sub20 local229 = (Class5_Sub3_Sub20) Static345.aClass5_Sub3_Sub15_1.aClass358_7.method8322(); local229 != null; local229 = (Class5_Sub3_Sub20) Static345.aClass5_Sub3_Sub15_1.aClass358_7.method8328()) {
					@Pc(239) int local239 = local70 * 16 + Static220.anInt4457 + 31;
					local70++;
					Static642.method8658(Static556.anInt9088, Static469.anInt7914, local229, local58, Static260.anInt4826, -256, local239, Static220.anInt4457, -1, local66, arg0);
				}
				Static551.method7649(Static220.anInt4457, Static260.anInt4826, Static469.anInt7914, Static556.anInt9088);
			}
		} else {
			local70 = 0;
			for (@Pc(77) Class5_Sub3_Sub20 local77 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2805(); local77 != null; local77 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2814()) {
				local94 = (Static483.anInt8099 - local70 - 1) * 16 + local9 + Static542.anInt6468 + 31;
				Static642.method8658(local7 + Static477.anInt8042, Static54.anInt805, local77, local58, Static633.anInt10304, -256, local94, Static542.anInt6468 + local9, -1, local66, arg0);
				local70++;
			}
		}
		Static551.method7649(local9 + Static542.anInt6468, Static633.anInt10304, Static54.anInt805, local7 + Static477.anInt8042);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!wm;Lclient!wm;Lclient!wm;Lclient!wm;B)V")
	public static void method5292(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class390 arg2, @OriginalArg(3) Class390 arg3) {
		Static671.aClass390_127 = arg2;
		Static169.aClass390_37 = arg0;
		Static113.aClass390_22 = arg3;
		Static648.aClass345ArrayArray2 = new Class345[Static113.aClass390_22.method8918()][];
		Static593.aBooleanArray38 = new boolean[Static113.aClass390_22.method8918()];
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLclient!wm;IIJII)V")
	public static void method5293(@OriginalArg(1) Class390 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) long arg2, @OriginalArg(6) int arg3) {
		Static328.method5088(arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLclient!jf;)I")
	public static int method5295(@OriginalArg(1) Class178 arg0) {
		if (arg0 == Static138.aClass178_2) {
			return 7681;
		} else if (arg0 == Static606.aClass178_4) {
			return 8448;
		} else if (arg0 == Static512.aClass178_3) {
			return 34165;
		} else if (arg0 == Static654.aClass178_5) {
			return 260;
		} else if (Static11.aClass178_1 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
