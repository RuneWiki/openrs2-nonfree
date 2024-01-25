import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Lclient!nl;")
	public static Class171 aClass171_81;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	public static int anInt5181;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	public static int anInt5180 = 0;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_82 = new Class32("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
	public static int anInt5182 = 1;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!ld;)Ljava/lang/String;")
	public static String method4502(@OriginalArg(1) Class2_Sub26 arg0) {
		return arg0.aString39 == null || arg0.aString39.length() <= 0 ? arg0.aString40 : arg0.aString40 + Static9.aClass32_5.method701(Static107.anInt2498) + arg0.aString39;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLclient!vh;)V")
	public static void method4503(@OriginalArg(1) Class2_Sub16_Sub2 arg0) {
		arg0.method5378();
		@Pc(14) int local14 = 0;
		@Pc(22) int local22;
		@Pc(47) int local47;
		for (@Pc(16) int local16 = 0; local16 < Static335.anInt5738; local16++) {
			local22 = Static242.anIntArray933[local16];
			if ((Static328.aByteArray104[local22] & 0x1) == 0) {
				if (local14 > 0) {
					local14--;
					Static328.aByteArray104[local22] = (byte) (Static328.aByteArray104[local22] | 0x2);
				} else {
					local47 = arg0.method5380(1);
					if (local47 == 0) {
						local14 = Static165.method2919(arg0);
						Static328.aByteArray104[local22] = (byte) (Static328.aByteArray104[local22] | 0x2);
					} else {
						Static295.method4428(arg0, local22);
					}
				}
			}
		}
		arg0.method5383();
		if (local14 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method5378();
		@Pc(135) int local135;
		for (local22 = 0; local22 < Static335.anInt5738; local22++) {
			local47 = Static242.anIntArray933[local22];
			if ((Static328.aByteArray104[local47] & 0x1) != 0) {
				if (local14 > 0) {
					Static328.aByteArray104[local47] = (byte) (Static328.aByteArray104[local47] | 0x2);
					local14--;
				} else {
					local135 = arg0.method5380(1);
					if (local135 == 0) {
						local14 = Static165.method2919(arg0);
						Static328.aByteArray104[local47] = (byte) (Static328.aByteArray104[local47] | 0x2);
					} else {
						Static295.method4428(arg0, local47);
					}
				}
			}
		}
		arg0.method5383();
		if (local14 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method5378();
		@Pc(222) int local222;
		for (local47 = 0; local47 < Static365.anInt6198; local47++) {
			local135 = Static294.anIntArray1001[local47];
			if ((Static328.aByteArray104[local135] & 0x1) != 0) {
				if (local14 > 0) {
					local14--;
					Static328.aByteArray104[local135] = (byte) (Static328.aByteArray104[local135] | 0x2);
				} else {
					local222 = arg0.method5380(1);
					if (local222 == 0) {
						local14 = Static165.method2919(arg0);
						Static328.aByteArray104[local135] = (byte) (Static328.aByteArray104[local135] | 0x2);
					} else if (Static56.method923(arg0, local135)) {
						Static328.aByteArray104[local135] = (byte) (Static328.aByteArray104[local135] | 0x2);
					}
				}
			}
		}
		arg0.method5383();
		if (local14 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method5378();
		for (local135 = 0; local135 < Static365.anInt6198; local135++) {
			local222 = Static294.anIntArray1001[local135];
			if ((Static328.aByteArray104[local222] & 0x1) == 0) {
				if (local14 > 0) {
					Static328.aByteArray104[local222] = (byte) (Static328.aByteArray104[local222] | 0x2);
					local14--;
				} else {
					@Pc(317) int local317 = arg0.method5380(1);
					if (local317 == 0) {
						local14 = Static165.method2919(arg0);
						Static328.aByteArray104[local222] = (byte) (Static328.aByteArray104[local222] | 0x2);
					} else if (Static56.method923(arg0, local222)) {
						Static328.aByteArray104[local222] = (byte) (Static328.aByteArray104[local222] | 0x2);
					}
				}
			}
		}
		arg0.method5383();
		if (local14 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static365.anInt6198 = 0;
		Static335.anInt5738 = 0;
		for (local222 = 1; local222 < 2048; local222++) {
			Static328.aByteArray104[local222] = (byte) (Static328.aByteArray104[local222] >> 1);
			@Pc(385) Class1_Sub5_Sub1_Sub1 local385 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local222];
			if (local385 == null) {
				Static294.anIntArray1001[Static365.anInt6198++] = local222;
			} else {
				Static242.anIntArray933[Static335.anInt5738++] = local222;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)I")
	public static int method4505(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
