import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
	public static int anInt6698;

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
	public static int anInt6699;

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_120 = new Class117("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
	public static int anInt6703 = 0;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)I")
	public static int method5663(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)I")
	public static int method5664(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg0 >> 5 << 7) + ((arg1 >> 2 & 0x3F) << 10) + (arg2 >> 1);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)V")
	public static void method5666(@OriginalArg(0) boolean arg0) {
		for (@Pc(17) Class11_Sub1 local17 = (Class11_Sub1) Static108.aClass16_19.method193(); local17 != null; local17 = (Class11_Sub1) Static108.aClass16_19.method188()) {
			if (local17.aClass11_Sub10_Sub1_2 != null) {
				Static341.aClass11_Sub10_Sub3_2.method3737(local17.aClass11_Sub10_Sub1_2);
				local17.aClass11_Sub10_Sub1_2 = null;
			}
			if (local17.aClass11_Sub10_Sub1_1 != null) {
				Static341.aClass11_Sub10_Sub3_2.method3737(local17.aClass11_Sub10_Sub1_1);
				local17.aClass11_Sub10_Sub1_1 = null;
			}
			local17.method5701();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(56) Class11_Sub1 local56 = (Class11_Sub1) Static169.aClass16_52.method193(); local56 != null; local56 = (Class11_Sub1) Static169.aClass16_52.method188()) {
			if (local56.aClass11_Sub10_Sub1_2 != null) {
				Static341.aClass11_Sub10_Sub3_2.method3737(local56.aClass11_Sub10_Sub1_2);
				local56.aClass11_Sub10_Sub1_2 = null;
			}
			local56.method5701();
		}
		for (@Pc(83) Class11_Sub1 local83 = (Class11_Sub1) Static99.aClass58_9.method1008(); local83 != null; local83 = (Class11_Sub1) Static99.aClass58_9.method1004()) {
			if (local83.aClass11_Sub10_Sub1_2 != null) {
				Static341.aClass11_Sub10_Sub3_2.method3737(local83.aClass11_Sub10_Sub1_2);
				local83.aClass11_Sub10_Sub1_2 = null;
			}
			local83.method5701();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5667(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static6.method3569(Static114.method1765(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}
