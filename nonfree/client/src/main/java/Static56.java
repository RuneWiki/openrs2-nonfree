import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ej", name = "m", descriptor = "[[[Lclient!eg;")
	public static Class1_Sub11[][][] aClass1_Sub11ArrayArrayArray3;

	@OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
	public static int anInt1101;

	@OriginalMember(owner = "client!ej", name = "o", descriptor = "[S")
	public static short[] aShortArray9;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "Lclient!mi;")
	public static Class75 aClass75_5 = new Class75();

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean56 = true;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "Lclient!hh;")
	public static Class50 aClass50_387 = Static186.method3527("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
	public static int anInt1096 = 0;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "Lclient!hh;")
	public static Class50 aClass50_388 = Static186.method3527("gelb:");

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public static void method816() {
		if (Static158.aClass22_1 != null) {
			@Pc(3) Class22 local3 = Static158.aClass22_1;
			synchronized (Static158.aClass22_1) {
				Static158.aClass22_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II[IJ)Lclient!hh;")
	public static Class50 method817(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (Static15.anInterface3_1 != null) {
			@Pc(12) Class50 local12 = Static15.anInterface3_1.method815(arg1, arg0, arg2);
			if (local12 != null) {
				return local12;
			}
		}
		return arg0 == 5 ? Static130.method2183(arg2).method1218() : Static20.method302(arg2);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V")
	public static void method819() {
		Static109.anInt2171 = 2;
		Static67.anInt1302 = -1;
		Static63.anInt1254 = 0;
		Static85.anInt1755 = -1;
		Static92.aBoolean83 = false;
		Static218.aClass86_68 = null;
		Static19.anInt400 = 1;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(JI)V")
	public static void method820(@OriginalArg(0) long arg0) {
		Static32.aClass1_Sub17_Sub1_1.anInt2656 = 0;
		Static32.aClass1_Sub17_Sub1_1.method2175(173);
		Static32.aClass1_Sub17_Sub1_1.method2171(arg0);
		Static151.anInt3156 = -3;
		Static12.anInt241 = 0;
		Static109.anInt2170 = 0;
		Static2.anInt52 = 1;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub11 local7 = aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass29_1 != null && local7.aClass29_1.aLong44 == arg3) {
			return true;
		} else if (local7.aClass61_1 != null && local7.aClass61_1.aLong89 == arg3) {
			return true;
		} else if (local7.aClass128_1 != null && local7.aClass128_1.aLong169 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt1072; local46++) {
				if (local7.aClass94Array1[local46].aLong143 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!pa;ILclient!hh;)Lclient!kc;")
	public static Class62 method822(@OriginalArg(0) Class86 arg0, @OriginalArg(2) Class50 arg1) {
		@Pc(10) int local10 = arg0.method3336(arg1);
		if (local10 == -1) {
			return new Class62(0);
		}
		@Pc(24) int[] local24 = arg0.method3308(local10);
		@Pc(30) Class62 local30 = new Class62(local24.length);
		for (@Pc(32) int local32 = 0; local32 < local30.anInt2136; local32++) {
			@Pc(45) Class1_Sub17 local45 = new Class1_Sub17(arg0.method3325(local10, local24[local32]));
			local30.aClass50Array38[local32] = local45.method2125();
			local30.aByteArray27[local32] = local45.method2155();
			local30.aShortArray32[local32] = (short) local45.method2178();
			local30.aShortArray31[local32] = (short) local45.method2178();
			local30.anIntArray205[local32] = local45.method2140();
		}
		return local30;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
	public static void method823() {
		@Pc(5) int local5 = Static31.anInt598 >> 7;
		if (Static176.anInt3690 < 128) {
			Static176.anInt3690 = 128;
		}
		@Pc(18) int local18 = Static201.anInt4057 >> 7;
		Static104.anInt2068 &= 0x7FF;
		if (Static176.anInt3690 > 383) {
			Static176.anInt3690 = 383;
		}
		@Pc(33) int local33 = Static131.method2213(Static201.anInt4057, Static31.anInt598, Static212.anInt4195);
		@Pc(35) int local35 = 0;
		@Pc(55) int local55;
		if (local5 > 3 && local18 > 3 && local5 < 100 && local18 < 100) {
			for (local55 = local5 - 4; local55 <= local5 + 4; local55++) {
				for (@Pc(61) int local61 = local18 - 4; local61 <= local18 + 4; local61++) {
					@Pc(65) int local65 = Static212.anInt4195;
					if (local65 < 3 && (Static159.aByteArrayArrayArray13[1][local55][local61] & 0x2) == 2) {
						local65++;
					}
					@Pc(90) int local90 = local33 - Static119.anIntArrayArrayArray10[local65][local55][local61];
					if (local35 < local90) {
						local35 = local90;
					}
				}
			}
		}
		local55 = local35 * 192;
		if (local55 > 98048) {
			local55 = 98048;
		}
		if (local55 < 32768) {
			local55 = 32768;
		}
		if (Static17.anInt335 < local55) {
			Static17.anInt335 += (local55 - Static17.anInt335) / 24;
		} else if (Static17.anInt335 > local55) {
			Static17.anInt335 += (local55 - Static17.anInt335) / 80;
			return;
		}
	}
}
