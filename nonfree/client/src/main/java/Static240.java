import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
	public static int anInt4801;

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
	public static int anInt4805;

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "Lclient!oo;")
	public static final Class244 aClass244_9 = new Class244(13, 7);

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
	public static int anInt4802 = 2;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([BII)I")
	public static int method4159(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static150.method2373(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)I")
	public static int method4161() {
		return Static469.anInt8256 == 1 ? anInt4801 : 0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZ)Lclient!be;")
	public static Class6_Sub4 method4163(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class6_Sub4_Sub7();
		} else if (arg0 == 1) {
			return new Class6_Sub4_Sub18();
		} else if (arg0 == 2) {
			return new Class6_Sub4_Sub37();
		} else if (arg0 == 3) {
			return new Class6_Sub4_Sub12();
		} else if (arg0 == 4) {
			return new Class6_Sub4_Sub30();
		} else if (arg0 == 5) {
			return new Class6_Sub4_Sub28();
		} else if (arg0 == 6) {
			return new Class6_Sub4_Sub14();
		} else if (arg0 == 7) {
			return new Class6_Sub4_Sub17();
		} else if (arg0 == 8) {
			return new Class6_Sub4_Sub22();
		} else if (arg0 == 9) {
			return new Class6_Sub4_Sub3();
		} else if (arg0 == 10) {
			return new Class6_Sub4_Sub20();
		} else if (arg0 == 11) {
			return new Class6_Sub4_Sub2();
		} else if (arg0 == 12) {
			return new Class6_Sub4_Sub23();
		} else if (arg0 == 13) {
			return new Class6_Sub4_Sub8();
		} else if (arg0 == 14) {
			return new Class6_Sub4_Sub39();
		} else if (arg0 == 15) {
			return new Class6_Sub4_Sub13();
		} else if (arg0 == 16) {
			return new Class6_Sub4_Sub6();
		} else if (arg0 == 17) {
			return new Class6_Sub4_Sub27();
		} else if (arg0 == 18) {
			return new Class6_Sub4_Sub4_Sub1();
		} else if (arg0 == 19) {
			return new Class6_Sub4_Sub25();
		} else if (arg0 == 20) {
			return new Class6_Sub4_Sub9();
		} else if (arg0 == 21) {
			return new Class6_Sub4_Sub38();
		} else if (arg0 == 22) {
			return new Class6_Sub4_Sub35();
		} else if (arg0 == 23) {
			return new Class6_Sub4_Sub19();
		} else if (arg0 == 24) {
			return new Class6_Sub4_Sub34();
		} else if (arg0 == 25) {
			return new Class6_Sub4_Sub10();
		} else if (arg0 == 26) {
			return new Class6_Sub4_Sub33();
		} else if (arg0 == 27) {
			return new Class6_Sub4_Sub36();
		} else if (arg0 == 28) {
			return new Class6_Sub4_Sub31();
		} else if (arg0 == 29) {
			return new Class6_Sub4_Sub29();
		} else if (arg0 == 30) {
			return new Class6_Sub4_Sub32();
		} else if (arg0 == 31) {
			return new Class6_Sub4_Sub11();
		} else if (arg0 == 32) {
			return new Class6_Sub4_Sub24();
		} else if (arg0 == 33) {
			return new Class6_Sub4_Sub15();
		} else if (arg0 == 34) {
			return new Class6_Sub4_Sub5();
		} else if (arg0 == 35) {
			return new Class6_Sub4_Sub26();
		} else if (arg0 == 36) {
			return new Class6_Sub4_Sub1();
		} else if (arg0 == 37) {
			return new Class6_Sub4_Sub16();
		} else if (arg0 == 38) {
			return new Class6_Sub4_Sub21();
		} else if (arg0 == 39) {
			return new Class6_Sub4_Sub4();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V")
	public static void method4164() {
		Static430.anInt7816++;
		Static501.anInt8668 = 0;
		Static120.anInt2349 = 0;
		Static76.method1320();
		Static485.method7238();
		Static155.method2438();
		@Pc(23) boolean local23 = false;
		@Pc(31) int local31;
		for (@Pc(25) int local25 = 0; local25 < Static120.anInt2349; local25++) {
			local31 = Static283.anIntArray371[local25];
			@Pc(38) Class6_Sub46 local38 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local31);
			@Pc(41) Class20_Sub2_Sub2_Sub1_Sub2 local41 = local38.aClass20_Sub2_Sub2_Sub1_Sub2_1;
			if (Static71.aBoolean94 && Static204.method3559(local31)) {
				Static547.method7963();
			}
			if (local41.anInt5569 != Static430.anInt7816) {
				if (local41.aClass247_1.method6611()) {
					Static648.method9036(local41);
				}
				local41.method4928((Class247) null);
				local38.method9043();
				local23 = true;
			}
		}
		if (local23) {
			Static273.anInt5420 = Static347.aClass128_23.method3554();
			Static347.aClass128_23.method3561(Static1.aClass6_Sub46Array5);
		}
		if (Static456.aClass6_Sub40_Sub2_2.anInt10169 != Static501.anInt8676) {
			throw new RuntimeException("gnp1 pos:" + Static456.aClass6_Sub40_Sub2_2.anInt10169 + " psize:" + Static501.anInt8676);
		}
		for (local31 = 0; local31 < Static252.anInt5066; local31++) {
			if (Static347.aClass128_23.method3560((long) Static483.anIntArray525[local31]) == null) {
				throw new RuntimeException("gnp2 pos:" + local31 + " size:" + Static252.anInt5066);
			}
		}
		if (Static273.anInt5420 - Static252.anInt5066 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static273.anInt5420 - Static252.anInt5066));
		}
		for (@Pc(167) int local167 = 0; local167 < Static273.anInt5420; local167++) {
			if (Static1.aClass6_Sub46Array5[local167].aClass20_Sub2_Sub2_Sub1_Sub2_1.anInt5569 != Static430.anInt7816) {
				throw new RuntimeException("gnp4 uk:" + Static1.aClass6_Sub46Array5[local167].aClass20_Sub2_Sub2_Sub1_Sub2_1.anInt5567);
			}
		}
	}
}
