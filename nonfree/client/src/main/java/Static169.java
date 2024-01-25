import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Lclient!ic;")
	public static Class113 aClass113_54;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Lclient!ic;")
	public static Class113 aClass113_55;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "[Lclient!id;")
	public static Class114_Sub1[] aClass114_Sub1Array2;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	public static int anInt2522 = -1;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method2128(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static5.method94(Static206.aClass137_143);
			Static75.aClass1_Sub11_Sub1_1.method4445(Static221.method2944(arg0));
			Static75.aClass1_Sub11_Sub1_1.method4453(arg0);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)Lclient!qb;")
	public static Class1_Sub1 method2130(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub1_Sub21();
		} else if (arg0 == 1) {
			return new Class1_Sub1_Sub5();
		} else if (arg0 == 2) {
			return new Class1_Sub1_Sub7();
		} else if (arg0 == 3) {
			return new Class1_Sub1_Sub3();
		} else if (arg0 == 4) {
			return new Class1_Sub1_Sub29();
		} else if (arg0 == 5) {
			return new Class1_Sub1_Sub13();
		} else if (arg0 == 6) {
			return new Class1_Sub1_Sub24();
		} else if (arg0 == 7) {
			return new Class1_Sub1_Sub9();
		} else if (arg0 == 8) {
			return new Class1_Sub1_Sub32();
		} else if (arg0 == 9) {
			return new Class1_Sub1_Sub23();
		} else if (arg0 == 10) {
			return new Class1_Sub1_Sub14();
		} else if (arg0 == 11) {
			return new Class1_Sub1_Sub19();
		} else if (arg0 == 12) {
			return new Class1_Sub1_Sub33();
		} else if (arg0 == 13) {
			return new Class1_Sub1_Sub38();
		} else if (arg0 == 14) {
			return new Class1_Sub1_Sub35();
		} else if (arg0 == 15) {
			return new Class1_Sub1_Sub36();
		} else if (arg0 == 16) {
			return new Class1_Sub1_Sub34();
		} else if (arg0 == 17) {
			return new Class1_Sub1_Sub6();
		} else if (arg0 == 18) {
			return new Class1_Sub1_Sub8_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub1_Sub28();
		} else if (arg0 == 20) {
			return new Class1_Sub1_Sub39();
		} else if (arg0 == 21) {
			return new Class1_Sub1_Sub20();
		} else if (arg0 == 22) {
			return new Class1_Sub1_Sub25();
		} else if (arg0 == 23) {
			return new Class1_Sub1_Sub12();
		} else if (arg0 == 24) {
			return new Class1_Sub1_Sub17();
		} else if (arg0 == 25) {
			return new Class1_Sub1_Sub26();
		} else if (arg0 == 26) {
			return new Class1_Sub1_Sub31();
		} else if (arg0 == 27) {
			return new Class1_Sub1_Sub22();
		} else if (arg0 == 28) {
			return new Class1_Sub1_Sub37();
		} else if (arg0 == 29) {
			return new Class1_Sub1_Sub4();
		} else if (arg0 == 30) {
			return new Class1_Sub1_Sub1();
		} else if (arg0 == 31) {
			return new Class1_Sub1_Sub30();
		} else if (arg0 == 32) {
			return new Class1_Sub1_Sub11();
		} else if (arg0 == 33) {
			return new Class1_Sub1_Sub15();
		} else if (arg0 == 34) {
			return new Class1_Sub1_Sub16();
		} else if (arg0 == 35) {
			return new Class1_Sub1_Sub10();
		} else if (arg0 == 36) {
			return new Class1_Sub1_Sub18();
		} else if (arg0 == 37) {
			return new Class1_Sub1_Sub2();
		} else if (arg0 == 38) {
			return new Class1_Sub1_Sub27();
		} else if (arg0 == 39) {
			return new Class1_Sub1_Sub8();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[[B[I[B[II[[BI)I")
	public static int method2131(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg4[arg6];
		@Pc(15) int local15 = arg2[arg6] + local9;
		@Pc(19) int local19 = arg4[arg0];
		@Pc(26) int local26 = local19 + arg2[arg0];
		@Pc(28) int local28 = local9;
		if (local19 > local9) {
			local28 = local19;
		}
		@Pc(35) int local35 = local15;
		if (local15 > local26) {
			local35 = local26;
		}
		@Pc(50) int local50 = arg3[arg6] & 0xFF;
		if (local50 > (arg3[arg0] & 0xFF)) {
			local50 = arg3[arg0] & 0xFF;
		}
		@Pc(71) byte[] local71 = arg5[arg6];
		@Pc(75) byte[] local75 = arg1[arg0];
		@Pc(80) int local80 = local28 - local9;
		@Pc(90) int local90 = local28 - local19;
		for (@Pc(92) int local92 = local28; local92 < local35; local92++) {
			@Pc(104) int local104 = local75[local90++] + local71[local80++];
			if (local104 < local50) {
				local50 = local104;
			}
		}
		return -local50;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Z")
	public static boolean method2132() {
		return Static356.anInt5885 == 0 ? Static312.aClass1_Sub9_Sub4_3.method4603() : true;
	}
}
