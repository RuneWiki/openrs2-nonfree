import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!le", name = "f", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "I")
	public static int anInt4058 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIII)I")
	public static int method3547(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(8) int local8 = arg2;
			arg2 = arg1;
			arg1 = local8;
		}
		@Pc(16) int local16 = arg5 & 0x3;
		if (local16 == 0) {
			return arg0;
		} else if (local16 == 1) {
			return arg4;
		} else if (local16 == 2) {
			return 1 + 7 - arg2 - arg0;
		} else {
			return 7 + 1 - arg4 - arg1;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)[Lclient!sd;")
	public static Class208[] method3548() {
		return new Class208[] { Static67.aClass208_32, Static92.aClass208_48, Static319.aClass208_167, Static294.aClass208_161, Static182.aClass208_106, Static167.aClass208_101, Static331.aClass208_176, Static169.aClass208_163, Static10.aClass208_194, Static41.aClass208_18, Static383.aClass208_203, Static87.aClass208_43, Static218.aClass208_122, Static4.aClass208_3, Static355.aClass208_193, Static46.aClass208_160, Static257.aClass208_143, Static128.aClass208_71, Static347.aClass208_190, Static312.aClass208_164, Static237.aClass208_132, Static116.aClass208_67, Static249.aClass208_139, Static115.aClass208_64, Static336.aClass208_181, Static57.aClass208_25, Static272.aClass208_150, Static248.aClass208_137, Static154.aClass208_93, Static48.aClass208_21, Static15.aClass208_7, Static114.aClass208_63, Static144.aClass208_84, Static77.aClass208_40, Static247.aClass208_136, Static334.aClass208_180, Static47.aClass208_20, Static337.aClass208_184, Static148.aClass208_87, Static27.aClass208_74, Static223.aClass208_124, Static133.aClass208_78, Static2.aClass208_207, Static34.aClass208_11, Static270.aClass208_149, Static31.aClass208_10, Static39.aClass208_17, Static252.aClass208_140, Static155.aClass208_94, Static198.aClass208_114, Static268.aClass208_148, Static9.aClass208_5, Static344.aClass208_188, Static65.aClass208_29, Static190.aClass208_107, Static131.aClass208_75, Static58.aClass208_26, Static197.aClass208_112, Static2.aClass208_208, Static70.aClass208_36, Static248.aClass208_138, Static69.aClass208_35, Static386.aClass208_206, Static224.aClass208_125, Static383.aClass208_204, Static5.aClass208_4, Static162.aClass208_100, Static151.aClass208_120, Static310.aClass208_162, Static338.aClass208_185, Static360.aClass208_197, Static36.aClass208_80, Static51.aClass208_24, Static346.aClass208_189, Static340.aClass208_186, Static240.aClass208_135, Static72.aClass208_37, Static320.aClass208_209, Static327.aClass208_175, Static63.aClass208_27, Static319.aClass208_168, Static120.aClass208_70, Static278.aClass208_154, Static88.aClass208_45, Static99.aClass208_54, Static317.aClass208_166, Static107.aClass208_59, Static64.aClass208_28, Static147.aClass208_86, Static344.aClass208_187, Static261.aClass208_144, Static97.aClass208_53, Static111.aClass208_62, Static205.aClass208_117, Static160.aClass208_97, Static31.aClass208_9, Static135.aClass208_81, Static262.aClass208_145, Static152.aClass208_129, Static371.aClass208_198, Static133.aClass208_79, Static274.aClass208_151, Static385.aClass208_205, Static189.aClass208_16, Static288.aClass208_159 };
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)I")
	public static int method3549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static102.aByteArrayArray8 == null ? 0 : (Static102.aByteArrayArray8[arg0][arg1] & 0xFF) << 3;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(II)V")
	public static void method3550(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub7_Sub2 local13 = Static328.method5290(6, arg0);
		local13.method1197();
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public static void method3551() {
		@Pc(7) int local7 = Static97.anInt2139;
		@Pc(9) int[] local9 = Static321.anIntArray512;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class1_Sub2_Sub1_Sub1 local19 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local9[local11]];
			if (local19 != null && local19.anInt5397 > 0) {
				local19.anInt5397--;
				if (local19.anInt5397 == 0) {
					local19.aString51 = null;
				}
			}
		}
		for (@Pc(45) int local45 = 0; local45 < Static123.anInt5933; local45++) {
			@Pc(51) int local51 = Static373.anIntArray577[local45];
			@Pc(55) Class1_Sub2_Sub1_Sub2 local55 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local51];
			if (local55 != null && local55.anInt5397 > 0) {
				local55.anInt5397--;
				if (local55.anInt5397 == 0) {
					local55.aString51 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!oj;IILclient!bd;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method3552(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class21 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static59.aClass48_2 = arg0;
		Static112.anInt2126 = arg1;
		Static221.aClass21_13 = arg3;
		Static305.aBoolean491 = Static59.aClass48_2.method2446() > 0;
		Static284.anInt5626 = arg4 >> Static162.anInt3362;
		Static373.anInt6861 = arg6 >> Static162.anInt3362;
		Static181.anInt3807 = arg4;
		Static200.anInt4146 = arg6;
		Static246.anInt3031 = arg5;
		Static94.anInt2021 = Static284.anInt5626 - Static113.anInt5764;
		if (Static94.anInt2021 < 0) {
			Static121.anInt6767 = -Static94.anInt2021;
			Static94.anInt2021 = 0;
		} else {
			Static121.anInt6767 = 0;
		}
		Static287.anInt5307 = Static373.anInt6861 - Static113.anInt5764;
		if (Static287.anInt5307 < 0) {
			Static18.anInt314 = -Static287.anInt5307;
			Static287.anInt5307 = 0;
		} else {
			Static18.anInt314 = 0;
		}
		Static310.anInt5683 = Static284.anInt5626 + Static113.anInt5764;
		if (Static310.anInt5683 > Static176.anInt3742) {
			Static310.anInt5683 = Static176.anInt3742;
		}
		Static286.anInt5279 = Static373.anInt6861 + Static113.anInt5764;
		if (Static286.anInt5279 > Static285.anInt5263) {
			Static286.anInt5279 = Static285.anInt5263;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static113.anInt5764 + Static113.anInt5764 + 2; local74++) {
			for (local77 = 0; local77 < Static113.anInt5764 + Static113.anInt5764 + 2; local77++) {
				local84 = Static284.anInt5626 + local74 - Static113.anInt5764;
				local90 = Static373.anInt6861 + local77 - Static113.anInt5764;
				if (local84 >= 0 && local90 >= 0 && local84 < Static176.anInt3742 && local90 < Static285.anInt5263) {
					@Pc(104) int local104 = local84 << Static162.anInt3362;
					@Pc(108) int local108 = local90 << Static162.anInt3362;
					@Pc(120) int local120 = Static210.aClass149Array5[Static210.aClass149Array5.length - 1].method5837(local84, local90) - 1000;
					@Pc(140) int local140 = Static248.aClass149Array3 == null ? Static210.aClass149Array5[0].method5837(local84, local90) + Static169.anInt5687 : Static248.aClass149Array3[0].method5837(local84, local90) + Static169.anInt5687;
					Static66.aBooleanArrayArray1[local74][local77] = Static59.aClass48_2.method2497(local104, local120, local108, local104, local140, local108);
				} else {
					Static66.aBooleanArrayArray1[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static113.anInt5764 + Static113.anInt5764 + 1; local77++) {
			for (local84 = 0; local84 < Static113.anInt5764 + Static113.anInt5764 + 1; local84++) {
				Static133.aBooleanArrayArray3[local77][local84] = Static66.aBooleanArrayArray1[local77][local84] || Static66.aBooleanArrayArray1[local77 + 1][local84] || Static66.aBooleanArrayArray1[local77][local84 + 1] || Static66.aBooleanArrayArray1[local77 + 1][local84 + 1];
			}
		}
		Static354.anIntArray555 = arg8;
		Static264.anIntArray288 = arg9;
		Static353.anIntArray552 = arg10;
		Static247.anIntArray395 = arg11;
		Static75.anIntArray124 = arg12;
		Static161.method2837();
		Static381.method5692();
		for (@Pc(256) Class7_Sub5 local256 = (Class7_Sub5) Static349.aClass199_7.method4896(); local256 != null; local256 = (Class7_Sub5) Static349.aClass199_7.method4902()) {
			local256.method5398();
			Static352.method5594(local256);
		}
		if (Static305.aBoolean491) {
			for (local90 = 0; local90 < Static184.anInt3912; local90++) {
				Static41.aClass2_Sub8_Sub1Array1[local90].method1152(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static59.aClass48_2.method2457(0);
			if (Static185.aClass19_1 == null || Static185.aClass19_1 instanceof Class19_Sub1) {
				Static185.aClass19_1 = new Class19_Sub2();
			}
		} else if (Static185.aClass19_1 == null || Static185.aClass19_1 instanceof Class19_Sub2) {
			Static185.aClass19_1 = new Class19_Sub1();
		}
		Static185.aClass19_1.method5301(arg2);
		Static185.aClass19_1.method5298();
		if (Static89.aClass188ArrayArrayArray3 != null) {
			Static307.method5020(true);
			Static185.aClass19_1.method5303(22);
			Static354.method5611(arg2, null, 0, (byte) 0, arg15, arg16);
			Static185.aClass19_1.method5298();
			Static185.aClass19_1.method5303(23);
			Static307.method5020(false);
		}
		Static354.method5611(arg2, arg7, arg13, arg14, arg15, arg16);
		Static185.aClass19_1.method5298();
		Static185.aClass19_1.method5300();
		Static185.aClass19_1.method5298();
		if (arg2 > 1) {
			Static59.aClass48_2.method2518(0);
		}
		Static59.aClass48_2.method2474(0, null);
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)I")
	public static int method3553() {
		if (Static33.aFrame2 == null) {
			return Static336.aBoolean455 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
