import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!qk", name = "G", descriptor = "Lclient!pc;")
	public static Class188 aClass188_129;

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_203 = new Class81(18, 0);

	@OriginalMember(owner = "client!qk", name = "A", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_166 = new Class256("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V")
	public static void method6027() {
		if (Static108.anInt2264 == -1) {
			return;
		}
		@Pc(11) int local11 = Static304.aClass40_1.method1164();
		@Pc(15) int local15 = Static304.aClass40_1.method1159();
		@Pc(20) Class2_Sub6 local20 = (Class2_Sub6) Static36.aClass265_2.method6005();
		if (local20 != null) {
			local11 = local20.method772();
			local15 = local20.method771();
		}
		Static272.method5847(Static96.anInt2175, local15, 0, Static108.anInt2264, Static216.anInt4171, 0, 0, 0, local11);
		if (Static22.aClass41_1 != null) {
			Static63.method1251(local15, local11);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BII)V")
	public static void method6035(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class68 local9 = Static404.aClass68ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static212.anInt4076 = local9.anInt2165;
			Static257.anInt4827 = local9.anInt2171;
			Static249.anInt4741 = local9.anInt2167;
		}
		Static348.method4896();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method6040(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static216.aBoolean340) {
			try {
				@Pc(23) Class142 local23 = (Class142) Class.forName("Class142_Sub1").getDeclaredConstructor().newInstance();
				local23.method3344(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static216.aBoolean340 = true;
			}
		}
		return arg0;
	}
}
