import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!rw", name = "s", descriptor = "[I")
	public static final int[] anIntArray511 = new int[6];

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)Lclient!rfa;")
	public static Class5_Sub1 method7583(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class5_Sub1_Sub30();
		} else if (arg0 == 1) {
			return new Class5_Sub1_Sub25();
		} else if (arg0 == 2) {
			return new Class5_Sub1_Sub27();
		} else if (arg0 == 3) {
			return new Class5_Sub1_Sub12();
		} else if (arg0 == 4) {
			return new Class5_Sub1_Sub10();
		} else if (arg0 == 5) {
			return new Class5_Sub1_Sub4();
		} else if (arg0 == 6) {
			return new Class5_Sub1_Sub11();
		} else if (arg0 == 7) {
			return new Class5_Sub1_Sub17();
		} else if (arg0 == 8) {
			return new Class5_Sub1_Sub6();
		} else if (arg0 == 9) {
			return new Class5_Sub1_Sub18();
		} else if (arg0 == 10) {
			return new Class5_Sub1_Sub1();
		} else if (arg0 == 11) {
			return new Class5_Sub1_Sub21();
		} else if (arg0 == 12) {
			return new Class5_Sub1_Sub24();
		} else if (arg0 == 13) {
			return new Class5_Sub1_Sub5();
		} else if (arg0 == 14) {
			return new Class5_Sub1_Sub34();
		} else if (arg0 == 15) {
			return new Class5_Sub1_Sub31();
		} else if (arg0 == 16) {
			return new Class5_Sub1_Sub15();
		} else if (arg0 == 17) {
			return new Class5_Sub1_Sub8();
		} else if (arg0 == 18) {
			return new Class5_Sub1_Sub9_Sub1();
		} else if (arg0 == 19) {
			return new Class5_Sub1_Sub2();
		} else if (arg0 == 20) {
			return new Class5_Sub1_Sub19();
		} else if (arg0 == 21) {
			return new Class5_Sub1_Sub20();
		} else if (arg0 == 22) {
			return new Class5_Sub1_Sub38();
		} else if (arg0 == 23) {
			return new Class5_Sub1_Sub3();
		} else if (arg0 == 24) {
			return new Class5_Sub1_Sub37();
		} else if (arg0 == 25) {
			return new Class5_Sub1_Sub28();
		} else if (arg0 == 26) {
			return new Class5_Sub1_Sub26();
		} else if (arg0 == 27) {
			return new Class5_Sub1_Sub35();
		} else if (arg0 == 28) {
			return new Class5_Sub1_Sub36();
		} else if (arg0 == 29) {
			return new Class5_Sub1_Sub33();
		} else if (arg0 == 30) {
			return new Class5_Sub1_Sub13();
		} else if (arg0 == 31) {
			return new Class5_Sub1_Sub29();
		} else if (arg0 == 32) {
			return new Class5_Sub1_Sub39();
		} else if (arg0 == 33) {
			return new Class5_Sub1_Sub7();
		} else if (arg0 == 34) {
			return new Class5_Sub1_Sub22();
		} else if (arg0 == 35) {
			return new Class5_Sub1_Sub16();
		} else if (arg0 == 36) {
			return new Class5_Sub1_Sub14();
		} else if (arg0 == 37) {
			return new Class5_Sub1_Sub32();
		} else if (arg0 == 38) {
			return new Class5_Sub1_Sub23();
		} else if (arg0 == 39) {
			return new Class5_Sub1_Sub9();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILclient!ib;ILclient!mca;)V")
	public static void method7585(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub23 arg1, @OriginalArg(3) Class230 arg2) {
		@Pc(16) Class5_Sub32 local16 = new Class5_Sub32();
		local16.anInt5872 = arg1.method8529();
		local16.anInt5871 = arg1.method8527();
		local16.anIntArray326 = new int[local16.anInt5872];
		local16.anIntArray327 = new int[local16.anInt5872];
		local16.aClass366Array1 = new Class366[local16.anInt5872];
		local16.aByteArrayArrayArray16 = new byte[local16.anInt5872][][];
		local16.anIntArray325 = new int[local16.anInt5872];
		local16.aClass366Array2 = new Class366[local16.anInt5872];
		for (@Pc(58) int local58 = 0; local58 < local16.anInt5872; local58++) {
			try {
				@Pc(64) int local64 = arg1.method8529();
				@Pc(92) String local92;
				@Pc(96) String local96;
				@Pc(100) int local100;
				if (local64 == 0 || local64 == 1 || local64 == 2) {
					local92 = arg1.method8497();
					local96 = arg1.method8497();
					local100 = 0;
					if (local64 == 1) {
						local100 = arg1.method8527();
					}
					local16.anIntArray326[local58] = local64;
					local16.anIntArray325[local58] = local100;
					local16.aClass366Array2[local58] = arg2.method5349(local96, Static32.method557(local92));
				} else if (local64 == 3 || local64 == 4) {
					local92 = arg1.method8497();
					local96 = arg1.method8497();
					local100 = arg1.method8529();
					@Pc(103) String[] local103 = new String[local100];
					for (@Pc(105) int local105 = 0; local105 < local100; local105++) {
						local103[local105] = arg1.method8497();
					}
					@Pc(126) byte[][] local126 = new byte[local100][];
					@Pc(139) int local139;
					if (local64 == 3) {
						for (@Pc(133) int local133 = 0; local133 < local100; local133++) {
							local139 = arg1.method8527();
							local126[local133] = new byte[local139];
							arg1.method8487(local126[local133], local139, 0);
						}
					}
					local16.anIntArray326[local58] = local64;
					@Pc(164) Class[] local164 = new Class[local100];
					for (local139 = 0; local139 < local100; local139++) {
						local164[local139] = Static32.method557(local103[local139]);
					}
					local16.aClass366Array1[local58] = arg2.method5348(local96, Static32.method557(local92), local164);
					local16.aByteArrayArrayArray16[local58] = local126;
				}
			} catch (@Pc(251) ClassNotFoundException local251) {
				local16.anIntArray327[local58] = -1;
			} catch (@Pc(258) SecurityException local258) {
				local16.anIntArray327[local58] = -2;
			} catch (@Pc(265) NullPointerException local265) {
				local16.anIntArray327[local58] = -3;
			} catch (@Pc(272) Exception local272) {
				local16.anIntArray327[local58] = -4;
			} catch (@Pc(279) Throwable local279) {
				local16.anIntArray327[local58] = -5;
			}
		}
		Static608.aClass102_71.method1921(local16);
	}
}
