import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "[Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3[] aClass1_Sub2_Sub2_Sub3Array12;

	@OriginalMember(owner = "client!wb", name = "X", descriptor = "Lclient!vb;")
	public static Class82 aClass82_72;

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "Z")
	public static boolean aBoolean168 = true;

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1432 = Static120.method2057("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!wb", name = "Z", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1433 = Static120.method2057("::fpson");

	@OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
	public static int anInt4087 = 0;

	@OriginalMember(owner = "client!wb", name = "cb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1434 = Static120.method2057("leuchten1:");

	@OriginalMember(owner = "client!wb", name = "eb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1435 = Static120.method2057("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
	public static void method3105() {
		aClass81_1432 = null;
		aClass81_1435 = null;
		aClass81_1433 = null;
		aClass81_1434 = null;
		aClass82_72 = null;
		aClass1_Sub2_Sub2_Sub3Array12 = null;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)I")
	public static int method3106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([Lclient!tg;III)Lclient!tg;")
	public static Class81 method3108(@OriginalArg(0) Class81[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = 0;
		for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
			if (arg0[arg2 + local10] == null) {
				arg0[arg2 + local10] = Static32.aClass81_1094;
			}
			local3 += arg0[arg2 + local10].anInt3691;
		}
		@Pc(45) byte[] local45 = new byte[local3];
		@Pc(51) int local51 = 0;
		@Pc(61) Class81 local61;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			local61 = arg0[local53 + arg2];
			Static190.method1388(local61.aByteArray41, 0, local45, local51, local61.anInt3691);
			local51 += local61.anInt3691;
		}
		local61 = new Class81();
		local61.aByteArray41 = local45;
		local61.anInt3691 = local3;
		return local61;
	}

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)Z")
	public static boolean method3109() {
		try {
			if (Static89.anInt4032 == 2) {
				if (Static78.aClass1_Sub21_1 == null) {
					Static78.aClass1_Sub21_1 = Static192.method2423(Static108.aClass82_40, Static98.anInt2160, Static184.anInt4115);
					if (Static78.aClass1_Sub21_1 == null) {
						return false;
					}
				}
				if (Static21.aClass4_1 == null) {
					Static21.aClass4_1 = new Class4(Static175.aClass82_51, Static14.aClass82_6);
				}
				if (Static115.aClass1_Sub10_Sub3_2.method1324(Static78.aClass1_Sub21_1, Static21.aClass4_1, Static97.aClass82_34)) {
					Static115.aClass1_Sub10_Sub3_2.method1301();
					Static115.aClass1_Sub10_Sub3_2.method1309(Static153.anInt3499);
					Static115.aClass1_Sub10_Sub3_2.method1313(Static131.aBoolean115, Static78.aClass1_Sub21_1);
					Static78.aClass1_Sub21_1 = null;
					Static108.aClass82_40 = null;
					Static89.anInt4032 = 0;
					Static21.aClass4_1 = null;
					return true;
				}
			}
		} catch (@Pc(56) Exception local56) {
			local56.printStackTrace();
			Static115.aClass1_Sub10_Sub3_2.method1311();
			Static89.anInt4032 = 0;
			Static108.aClass82_40 = null;
			Static21.aClass4_1 = null;
			Static78.aClass1_Sub21_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V")
	public static void method3110() {
		while (true) {
			if (Static21.aClass1_Sub8_Sub1_1.method364(Static98.anInt2162) >= 11) {
				@Pc(20) int local20 = Static21.aClass1_Sub8_Sub1_1.method375(11);
				if (local20 != 2047) {
					@Pc(25) boolean local25 = false;
					if (Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local20] == null) {
						Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local20] = new Class1_Sub2_Sub1_Sub3_Sub1();
						local25 = true;
						if (Static21.aClass1_Sub8Array1[local20] != null) {
							Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local20].method1105(Static21.aClass1_Sub8Array1[local20]);
						}
					}
					Static176.anIntArray423[Static25.anInt645++] = local20;
					@Pc(61) Class1_Sub2_Sub1_Sub3_Sub1 local61 = Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local20];
					local61.anInt3022 = Static142.anInt3104;
					@Pc(69) int local69 = Static21.aClass1_Sub8_Sub1_1.method375(1);
					if (local69 == 1) {
						Static90.anIntArray221[Static77.anInt1829++] = local20;
					}
					@Pc(85) int local85 = Static21.aClass1_Sub8_Sub1_1.method375(1);
					@Pc(90) int local90 = Static21.aClass1_Sub8_Sub1_1.method375(5);
					if (local90 > 15) {
						local90 -= 32;
					}
					@Pc(103) int local103 = Static135.anIntArray230[Static21.aClass1_Sub8_Sub1_1.method375(3)];
					if (local25) {
						local61.anInt3049 = local61.anInt3048 = local103;
					}
					@Pc(116) int local116 = Static21.aClass1_Sub8_Sub1_1.method375(5);
					if (local116 > 15) {
						local116 -= 32;
					}
					local61.method2362(Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray324[0] + local116, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray326[0] + local90, local85 == 1);
					continue;
				}
			}
			Static21.aClass1_Sub8_Sub1_1.method367();
			return;
		}
	}
}
