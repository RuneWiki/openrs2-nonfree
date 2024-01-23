import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "Lclient!fh;")
	public static Class58 aClass58_30;

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
	public static int anInt1053;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "Lclient!uk;")
	public static Class178 aClass178_4 = new Class178();

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
	public static int anInt1047 = -1;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
	public static int anInt1051 = 0;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
	public static int anInt1052 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIZIIII)V")
	public static void method896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static248.method3922(arg2);
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = -arg2;
		@Pc(17) int local17 = arg2 - arg0;
		@Pc(19) int local19 = arg2;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(27) int[] local27 = Static220.anIntArrayArray36[arg5];
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(34) int local34 = local17;
		@Pc(39) int local39 = arg4 - local17;
		Static99.method1656(local27, arg1, arg4 - arg2, local39);
		@Pc(57) int local57 = local17 + arg4;
		@Pc(60) int local60 = -local17;
		Static99.method1656(local27, arg3, local39, local57);
		Static99.method1656(local27, arg1, local57, arg4 + arg2);
		while (local19 > local10) {
			local23 += 2;
			local13 += local23;
			local21 += 2;
			local60 += local21;
			if (local60 >= 0 && local34 >= 1) {
				Static310.anIntArray678[local34] = local10;
				local34--;
				local60 -= local34 << 1;
			}
			local10++;
			@Pc(126) int[] local126;
			@Pc(138) int[] local138;
			@Pc(131) int local131;
			@Pc(143) int local143;
			@Pc(191) int local191;
			@Pc(186) int local186;
			@Pc(182) int local182;
			if (local13 >= 0) {
				local19--;
				if (local19 >= local17) {
					local126 = Static220.anIntArrayArray36[arg5 + local19];
					local131 = arg4 + local10;
					local138 = Static220.anIntArrayArray36[arg5 - local19];
					local143 = arg4 - local10;
					Static99.method1656(local126, arg1, local143, local131);
					Static99.method1656(local138, arg1, local143, local131);
				} else {
					local126 = Static220.anIntArrayArray36[local19 + arg5];
					local131 = Static310.anIntArray678[local19];
					local138 = Static220.anIntArrayArray36[arg5 - local19];
					local143 = local10 + arg4;
					local182 = arg4 - local131;
					local186 = local131 + arg4;
					local191 = arg4 - local10;
					Static99.method1656(local126, arg1, local191, local182);
					Static99.method1656(local126, arg3, local182, local186);
					Static99.method1656(local126, arg1, local186, local143);
					Static99.method1656(local138, arg1, local191, local182);
					Static99.method1656(local138, arg3, local182, local186);
					Static99.method1656(local138, arg1, local186, local143);
				}
				local13 -= local19 << 1;
			}
			local126 = Static220.anIntArrayArray36[arg5 + local10];
			local138 = Static220.anIntArrayArray36[arg5 - local10];
			local131 = local19 + arg4;
			local143 = arg4 - local19;
			if (local17 <= local10) {
				Static99.method1656(local126, arg1, local143, local131);
				Static99.method1656(local138, arg1, local143, local131);
			} else {
				local191 = local10 > local34 ? Static310.anIntArray678[local10] : local34;
				local186 = local191 + arg4;
				local182 = arg4 - local191;
				Static99.method1656(local126, arg1, local143, local182);
				Static99.method1656(local126, arg3, local182, local186);
				Static99.method1656(local126, arg1, local186, local131);
				Static99.method1656(local138, arg1, local143, local182);
				Static99.method1656(local138, arg3, local182, local186);
				Static99.method1656(local138, arg1, local186, local131);
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Lclient!jo;")
	public static Class4_Sub1 method897(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class4_Sub1_Sub24();
		} else if (arg0 == 1) {
			return new Class4_Sub1_Sub11();
		} else if (arg0 == 2) {
			return new Class4_Sub1_Sub23();
		} else if (arg0 == 3) {
			return new Class4_Sub1_Sub7();
		} else if (arg0 == 4) {
			return new Class4_Sub1_Sub33();
		} else if (arg0 == 5) {
			return new Class4_Sub1_Sub38();
		} else if (arg0 == 6) {
			return new Class4_Sub1_Sub4();
		} else if (arg0 == 7) {
			return new Class4_Sub1_Sub32();
		} else if (arg0 == 8) {
			return new Class4_Sub1_Sub20();
		} else if (arg0 == 9) {
			return new Class4_Sub1_Sub9();
		} else if (arg0 == 10) {
			return new Class4_Sub1_Sub39();
		} else if (arg0 == 11) {
			return new Class4_Sub1_Sub3();
		} else if (arg0 == 12) {
			return new Class4_Sub1_Sub37();
		} else if (arg0 == 13) {
			return new Class4_Sub1_Sub30();
		} else if (arg0 == 14) {
			return new Class4_Sub1_Sub16();
		} else if (arg0 == 15) {
			return new Class4_Sub1_Sub27();
		} else if (arg0 == 16) {
			return new Class4_Sub1_Sub25();
		} else if (arg0 == 17) {
			return new Class4_Sub1_Sub17();
		} else if (arg0 == 18) {
			return new Class4_Sub1_Sub21_Sub1();
		} else if (arg0 == 19) {
			return new Class4_Sub1_Sub22();
		} else if (arg0 == 20) {
			return new Class4_Sub1_Sub15();
		} else if (arg0 == 21) {
			return new Class4_Sub1_Sub10();
		} else if (arg0 == 22) {
			return new Class4_Sub1_Sub34();
		} else if (arg0 == 23) {
			return new Class4_Sub1_Sub36();
		} else if (arg0 == 24) {
			return new Class4_Sub1_Sub35();
		} else if (arg0 == 25) {
			return new Class4_Sub1_Sub2();
		} else if (arg0 == 26) {
			return new Class4_Sub1_Sub18();
		} else if (arg0 == 27) {
			return new Class4_Sub1_Sub28();
		} else if (arg0 == 28) {
			return new Class4_Sub1_Sub1();
		} else if (arg0 == 29) {
			return new Class4_Sub1_Sub14();
		} else if (arg0 == 30) {
			return new Class4_Sub1_Sub29();
		} else if (arg0 == 31) {
			return new Class4_Sub1_Sub6();
		} else if (arg0 == 32) {
			return new Class4_Sub1_Sub5();
		} else if (arg0 == 33) {
			return new Class4_Sub1_Sub19();
		} else if (arg0 == 34) {
			return new Class4_Sub1_Sub12();
		} else if (arg0 == 35) {
			return new Class4_Sub1_Sub31();
		} else if (arg0 == 36) {
			return new Class4_Sub1_Sub8();
		} else if (arg0 == 37) {
			return new Class4_Sub1_Sub26();
		} else if (arg0 == 38) {
			return new Class4_Sub1_Sub13();
		} else if (arg0 == 39) {
			return new Class4_Sub1_Sub21();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	public static void method898() {
		Static68.aClass26_12.method511();
		Static138.aClass26_27.method511();
	}
}
