import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "Lclient!et;")
	public static Class66 aClass66_5;

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
	public static int anInt3967 = -1;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "[[B")
	public static final byte[][] aByteArrayArray14 = new byte[1000][];

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_80 = new Class83("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!tm", name = "q", descriptor = "Lclient!fa;")
	public static final Class68 aClass68_23 = new Class68(8);

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "[I")
	public static final int[] anIntArray262 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)V")
	public static void method3233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static3.aClass4_Sub12_Sub1_5.anInt2997 = 0;
		Static3.aClass4_Sub12_Sub1_5.method2551(Static153.aClass60_6.anInt1812);
		Static3.aClass4_Sub12_Sub1_5.method2551(arg1);
		Static3.aClass4_Sub12_Sub1_5.method2551(arg0);
		Static3.aClass4_Sub12_Sub1_5.method2524(arg2);
		Static3.aClass4_Sub12_Sub1_5.method2524(arg3);
		Static119.anInt2524 = 0;
		Static348.anInt5976 = 0;
		Static249.anInt4623 = -3;
		Static354.anInt6183 = 1;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLjava/awt/Canvas;ILclient!et;Lclient!ga;)Lclient!ya;")
	public static Class19 method3234(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class66 arg2, @OriginalArg(4) Interface7 arg3) {
		return new qa(arg1, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!iv;)Lclient!ob;")
	public static Class27_Sub4 method3235(@OriginalArg(1) Class4_Sub12 arg0) {
		return new Class27_Sub4(arg0.method2512(), arg0.method2512(), arg0.method2512(), arg0.method2512(), arg0.method2493(), arg0.method2493(), arg0.method2490());
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIBIIIII)V")
	public static void method3236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(19) int local19 = Static332.method4519(Static168.anInt3256, arg3, Static376.anInt6287);
		@Pc(25) int local25 = Static332.method4519(Static168.anInt3256, arg6, Static376.anInt6287);
		@Pc(31) int local31 = Static332.method4519(Static208.anInt2656, arg0, Static354.anInt6186);
		@Pc(37) int local37 = Static332.method4519(Static208.anInt2656, arg5, Static354.anInt6186);
		@Pc(46) int local46 = Static332.method4519(Static168.anInt3256, arg3 + arg2, Static376.anInt6287);
		@Pc(55) int local55 = Static332.method4519(Static168.anInt3256, arg6 - arg2, Static376.anInt6287);
		for (@Pc(57) int local57 = local19; local57 < local46; local57++) {
			Static251.method3640(local31, arg1, local37, Static96.anIntArrayArray21[local57]);
		}
		for (@Pc(77) int local77 = local25; local77 > local55; local77--) {
			Static251.method3640(local31, arg1, local37, Static96.anIntArrayArray21[local77]);
		}
		@Pc(99) int local99 = Static332.method4519(Static208.anInt2656, arg0 + arg2, Static354.anInt6186);
		@Pc(107) int local107 = Static332.method4519(Static208.anInt2656, arg5 - arg2, Static354.anInt6186);
		for (@Pc(109) int local109 = local46; local109 <= local55; local109++) {
			@Pc(115) int[] local115 = Static96.anIntArrayArray21[local109];
			Static251.method3640(local31, arg1, local99, local115);
			Static251.method3640(local99, arg4, local107, local115);
			Static251.method3640(local107, arg1, local37, local115);
		}
	}
}
