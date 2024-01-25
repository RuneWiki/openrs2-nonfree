import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!tfa", name = "h", descriptor = "F")
	public static float aFloat180 = 0.25F;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V")
	public static void method7661() {
		@Pc(9) int[] local9 = new int[Static356.aClass221_1.anInt7082];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static356.aClass221_1.anInt7082; local13++) {
			@Pc(20) Class306 local20 = Static356.aClass221_1.method5923(local13);
			if (local20.anInt9072 >= 0 || local20.anInt9083 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static448.anIntArray422 = new int[local11];
		for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
			Static448.anIntArray422[local47] = local9[local47];
		}
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)[Lclient!ea;")
	public static Class73[] method7665() {
		return new Class73[] { Static629.aClass73_188, Static40.aClass73_13, Static337.aClass73_115, Static170.aClass73_59, Static441.aClass73_141, Static333.aClass73_111, Static144.aClass73_190, Static378.aClass73_128, Static106.aClass73_91, Static624.aClass73_186, Static412.aClass73_137, Static80.aClass73_29, Static371.aClass73_125, Static547.aClass73_3, Static502.aClass73_131, Static24.aClass73_7, Static596.aClass73_177, Static595.aClass73_176, Static44.aClass73_147, Static597.aClass73_178, Static458.aClass73_146, Static84.aClass73_30, Static28.aClass73_10, Static553.aClass73_163, Static557.aClass73_167, Static77.aClass73_100, Static351.aClass73_120, Static118.aClass73_41, Static199.aClass73_61, Static525.aClass73_157, Static134.aClass73_45, Static288.aClass73_99, Static266.aClass73_88, Static85.aClass73_31, Static12.aClass73_4, Static15.aClass73_5, Static258.aClass73_87, Static628.aClass73_187, Static536.aClass73_159, Static109.aClass73_39, Static234.aClass73_74, Static603.aClass73_182, Static462.aClass73_149, Static606.aClass73_183, Static146.aClass73_135, Static32.aClass73_12, Static232.aClass73_80, Static521.aClass73_172, Static25.aClass73_8, Static288.aClass73_98, Static556.aClass73_165, Static634.aClass73_189, Static337.aClass73_114, Static287.aClass73_97, Static574.aClass73_171, Static413.aClass73_139, Static295.aClass73_101, Static284.aClass73_95, Static585.aClass73_173, Static388.aClass73_133, Static99.aClass73_37, Static57.aClass73_19, Static243.aClass73_68, Static499.aClass73_154, Static151.aClass73_54, Static240.aClass73_81, Static139.aClass73_47, Static366.aClass73_123, Static209.aClass73_65, Static144.aClass73_191, Static57.aClass73_18, Static573.aClass73_170, Static360.aClass73_122, Static25.aClass73_9, Static577.aClass73_113, Static90.aClass73_36, Static371.aClass73_124, Static209.aClass73_66, Static125.aClass73_44, Static378.aClass73_129, Static371.aClass73_126, Static7.aClass73_1, Static469.aClass73_150, Static183.aClass73_185, Static283.aClass73_151, Static299.aClass73_104, Static426.aClass73_140, Static342.aClass73_119, Static224.aClass73_69, Static542.aClass73_161, Static499.aClass73_155, Static356.aClass73_121, Static375.aClass73_127, Static545.aClass73_162, Static226.aClass73_70, Static74.aClass73_27, Static535.aClass73_158, Static442.aClass73_142, Static241.aClass73_82, Static146.aClass73_134, Static523.aClass73_156, Static406.aClass73_136, Static383.aClass73_132, Static30.aClass73_11, Static168.aClass73_58, Static588.aClass73_174, Static53.aClass73_17, Static177.aClass73_160, Static603.aClass73_181, Static338.aClass73_116, Static610.aClass73_184, Static502.aClass73_130, Static498.aClass73_153, Static116.aClass73_40, Static269.aClass73_175, Static285.aClass73_96, Static490.aClass73_78, Static18.aClass73_6, Static565.aClass73_169, Static322.aClass73_108, Static136.aClass73_46, Static63.aClass73_20 };
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)Lclient!dt;")
	public static Class6_Sub1 method7666(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class6_Sub1_Sub13();
		} else if (arg0 == 1) {
			return new Class6_Sub1_Sub22();
		} else if (arg0 == 2) {
			return new Class6_Sub1_Sub18();
		} else if (arg0 == 3) {
			return new Class6_Sub1_Sub3();
		} else if (arg0 == 4) {
			return new Class6_Sub1_Sub38();
		} else if (arg0 == 5) {
			return new Class6_Sub1_Sub24();
		} else if (arg0 == 6) {
			return new Class6_Sub1_Sub15();
		} else if (arg0 == 7) {
			return new Class6_Sub1_Sub7();
		} else if (arg0 == 8) {
			return new Class6_Sub1_Sub9();
		} else if (arg0 == 9) {
			return new Class6_Sub1_Sub11();
		} else if (arg0 == 10) {
			return new Class6_Sub1_Sub33();
		} else if (arg0 == 11) {
			return new Class6_Sub1_Sub4();
		} else if (arg0 == 12) {
			return new Class6_Sub1_Sub30();
		} else if (arg0 == 13) {
			return new Class6_Sub1_Sub8();
		} else if (arg0 == 14) {
			return new Class6_Sub1_Sub17();
		} else if (arg0 == 15) {
			return new Class6_Sub1_Sub26();
		} else if (arg0 == 16) {
			return new Class6_Sub1_Sub32();
		} else if (arg0 == 17) {
			return new Class6_Sub1_Sub6();
		} else if (arg0 == 18) {
			return new Class6_Sub1_Sub5_Sub1();
		} else if (arg0 == 19) {
			return new Class6_Sub1_Sub2();
		} else if (arg0 == 20) {
			return new Class6_Sub1_Sub29();
		} else if (arg0 == 21) {
			return new Class6_Sub1_Sub12();
		} else if (arg0 == 22) {
			return new Class6_Sub1_Sub39();
		} else if (arg0 == 23) {
			return new Class6_Sub1_Sub27();
		} else if (arg0 == 24) {
			return new Class6_Sub1_Sub16();
		} else if (arg0 == 25) {
			return new Class6_Sub1_Sub14();
		} else if (arg0 == 26) {
			return new Class6_Sub1_Sub31();
		} else if (arg0 == 27) {
			return new Class6_Sub1_Sub23();
		} else if (arg0 == 28) {
			return new Class6_Sub1_Sub28();
		} else if (arg0 == 29) {
			return new Class6_Sub1_Sub36();
		} else if (arg0 == 30) {
			return new Class6_Sub1_Sub10();
		} else if (arg0 == 31) {
			return new Class6_Sub1_Sub34();
		} else if (arg0 == 32) {
			return new Class6_Sub1_Sub37();
		} else if (arg0 == 33) {
			return new Class6_Sub1_Sub20();
		} else if (arg0 == 34) {
			return new Class6_Sub1_Sub35();
		} else if (arg0 == 35) {
			return new Class6_Sub1_Sub1();
		} else if (arg0 == 36) {
			return new Class6_Sub1_Sub25();
		} else if (arg0 == 37) {
			return new Class6_Sub1_Sub21();
		} else if (arg0 == 38) {
			return new Class6_Sub1_Sub19();
		} else if (arg0 == 39) {
			return new Class6_Sub1_Sub5();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)I")
	public static int method7672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static80.anIntArrayArray5 == null ? 0 : Static80.anIntArrayArray5[arg0][arg1] & 0xFFFFFF;
	}
}
