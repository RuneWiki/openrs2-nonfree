import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!tc", name = "E", descriptor = "Lclient!eg;")
	public static Interface3 anInterface3_7;

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_96 = new Class183(26, -1);

	@OriginalMember(owner = "client!tc", name = "I", descriptor = "[I")
	public static final int[] anIntArray530 = new int[100];

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lclient!aa;")
	public static Class2_Sub1 method5364(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class2_Sub1_Sub35();
		} else if (arg0 == 1) {
			return new Class2_Sub1_Sub38();
		} else if (arg0 == 2) {
			return new Class2_Sub1_Sub1();
		} else if (arg0 == 3) {
			return new Class2_Sub1_Sub29();
		} else if (arg0 == 4) {
			return new Class2_Sub1_Sub7();
		} else if (arg0 == 5) {
			return new Class2_Sub1_Sub6();
		} else if (arg0 == 6) {
			return new Class2_Sub1_Sub3();
		} else if (arg0 == 7) {
			return new Class2_Sub1_Sub33();
		} else if (arg0 == 8) {
			return new Class2_Sub1_Sub12();
		} else if (arg0 == 9) {
			return new Class2_Sub1_Sub20();
		} else if (arg0 == 10) {
			return new Class2_Sub1_Sub31();
		} else if (arg0 == 11) {
			return new Class2_Sub1_Sub19();
		} else if (arg0 == 12) {
			return new Class2_Sub1_Sub23();
		} else if (arg0 == 13) {
			return new Class2_Sub1_Sub18();
		} else if (arg0 == 14) {
			return new Class2_Sub1_Sub24();
		} else if (arg0 == 15) {
			return new Class2_Sub1_Sub37();
		} else if (arg0 == 16) {
			return new Class2_Sub1_Sub32();
		} else if (arg0 == 17) {
			return new Class2_Sub1_Sub11();
		} else if (arg0 == 18) {
			return new Class2_Sub1_Sub8_Sub1();
		} else if (arg0 == 19) {
			return new Class2_Sub1_Sub25();
		} else if (arg0 == 20) {
			return new Class2_Sub1_Sub16();
		} else if (arg0 == 21) {
			return new Class2_Sub1_Sub39();
		} else if (arg0 == 22) {
			return new Class2_Sub1_Sub26();
		} else if (arg0 == 23) {
			return new Class2_Sub1_Sub14();
		} else if (arg0 == 24) {
			return new Class2_Sub1_Sub10();
		} else if (arg0 == 25) {
			return new Class2_Sub1_Sub17();
		} else if (arg0 == 26) {
			return new Class2_Sub1_Sub21();
		} else if (arg0 == 27) {
			return new Class2_Sub1_Sub15();
		} else if (arg0 == 28) {
			return new Class2_Sub1_Sub4();
		} else if (arg0 == 29) {
			return new Class2_Sub1_Sub28();
		} else if (arg0 == 30) {
			return new Class2_Sub1_Sub2();
		} else if (arg0 == 31) {
			return new Class2_Sub1_Sub34();
		} else if (arg0 == 32) {
			return new Class2_Sub1_Sub30();
		} else if (arg0 == 33) {
			return new Class2_Sub1_Sub22();
		} else if (arg0 == 34) {
			return new Class2_Sub1_Sub13();
		} else if (arg0 == 35) {
			return new Class2_Sub1_Sub36();
		} else if (arg0 == 36) {
			return new Class2_Sub1_Sub27();
		} else if (arg0 == 37) {
			return new Class2_Sub1_Sub9();
		} else if (arg0 == 38) {
			return new Class2_Sub1_Sub5();
		} else if (arg0 == 39) {
			return new Class2_Sub1_Sub8();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)V")
	public static void method5366(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static321.aClass2_Sub24_Sub2_34.method5787(Static248.anInt4821) >= 15) {
				@Pc(20) int local20 = Static321.aClass2_Sub24_Sub2_34.method5793(15);
				if (local20 != 32767) {
					@Pc(27) boolean local27 = false;
					if (Static223.aClass1_Sub2_Sub1_Sub2Array1[local20] == null) {
						Static223.aClass1_Sub2_Sub1_Sub2Array1[local20] = new Class1_Sub2_Sub1_Sub2();
						local27 = true;
						Static223.aClass1_Sub2_Sub1_Sub2Array1[local20].anInt5374 = local20;
					}
					@Pc(48) Class1_Sub2_Sub1_Sub2 local48 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local20];
					Static373.anIntArray577[Static123.anInt5933++] = local20;
					local48.anInt5399 = Static339.anInt6265;
					if (local48.aClass197_1 != null && local48.aClass197_1.method4839()) {
						Static313.method5078(local48);
					}
					@Pc(77) int local77 = Static321.aClass2_Sub24_Sub2_34.method5793(1);
					@Pc(84) int local84;
					if (arg0) {
						local84 = Static321.aClass2_Sub24_Sub2_34.method5793(8);
						if (local84 > 127) {
							local84 -= 256;
						}
					} else {
						local84 = Static321.aClass2_Sub24_Sub2_34.method5793(5);
						if (local84 > 15) {
							local84 -= 32;
						}
					}
					@Pc(112) int local112 = (Static321.aClass2_Sub24_Sub2_34.method5793(3) + 4 & 0xC4800007) << 11;
					@Pc(119) int local119;
					if (arg0) {
						local119 = Static321.aClass2_Sub24_Sub2_34.method5793(8);
						if (local119 > 127) {
							local119 -= 256;
						}
					} else {
						local119 = Static321.aClass2_Sub24_Sub2_34.method5793(5);
						if (local119 > 15) {
							local119 -= 32;
						}
					}
					local48.method4807(Static207.aClass32_1.method579(Static321.aClass2_Sub24_Sub2_34.method5793(14)));
					@Pc(149) int local149 = Static321.aClass2_Sub24_Sub2_34.method5793(1);
					if (local149 == 1) {
						Static4.anIntArray13[Static287.anInt5316++] = local20;
					}
					@Pc(165) int local165 = Static321.aClass2_Sub24_Sub2_34.method5793(2);
					local48.method4801(local48.aClass197_1.anInt5486);
					local48.anInt5426 = local48.aClass197_1.anInt5488 << 3;
					if (local48.anInt5426 == 0) {
						local48.method4796(0);
					} else if (local27) {
						local48.method4796(local112);
					}
					local48.method4806(local77 == 1, local84 + Static182.aClass1_Sub2_Sub1_Sub1_1.anIntArray466[0], local165, local48.method4792(), local119 + Static182.aClass1_Sub2_Sub1_Sub1_1.anIntArray465[0]);
					if (local48.aClass197_1.method4839()) {
						Static168.method2962(0, local48.aByte73, local48.anIntArray465[0], local48, null, null, local48.anIntArray466[0]);
					}
					continue;
				}
			}
			Static321.aClass2_Sub24_Sub2_34.method5782();
			return;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)Z")
	public static boolean method5367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static69.method1256(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static162.anInt3362;
			@Pc(14) int local14 = arg2 << Static162.anInt3362;
			return Static151.method3887(local10 + 1, Static128.aClass149Array1[arg0].method5837(arg1, arg2) + arg3, local14 + 1) && Static151.method3887(local10 + Static169.anInt5687 - 1, Static128.aClass149Array1[arg0].method5837(arg1 + 1, arg2) + arg3, local14 + 1) && Static151.method3887(local10 + Static169.anInt5687 - 1, Static128.aClass149Array1[arg0].method5837(arg1 + 1, arg2 + 1) + arg3, local14 + Static169.anInt5687 - 1) && Static151.method3887(local10 + 1, Static128.aClass149Array1[arg0].method5837(arg1, arg2 + 1) + arg3, local14 + Static169.anInt5687 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)V")
	public static void method5368(@OriginalArg(1) int arg0) {
		for (@Pc(5) Class2 local5 = Static328.aClass243_28.method5975(); local5 != null; local5 = Static328.aClass243_28.method5973()) {
			if ((local5.aLong213 >> 48 & 0xFFFFL) == (long) arg0) {
				local5.method6130();
			}
		}
	}
}
