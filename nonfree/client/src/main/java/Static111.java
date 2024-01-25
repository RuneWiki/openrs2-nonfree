import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_40 = new Class134("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Lclient!mg;")
	public static final Class156 aClass156_12 = new Class156();

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
	public static int anInt2076 = 0;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIIIZ)Z")
	public static boolean method1707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(8) int local8 = Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray425[0];
		@Pc(13) int local13 = Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray424[0];
		if (local8 < 0 || local8 >= Static166.anInt2852 || local13 < 0 || Static426.anInt6923 <= local13) {
			return false;
		} else if (arg4 >= 0 && arg4 < Static166.anInt2852 && arg0 >= 0 && Static426.anInt6923 > arg0) {
			@Pc(80) int local80 = Static460.method5540(local13, arg0, arg7, local8, Static361.aClass71Array1[Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91], arg5, Static254.anIntArray351, arg6, arg4, arg2, arg1, Static60.aClass3_Sub4_Sub1_Sub2_1.method4009(), arg3, Static375.anIntArray539);
			if (local80 < 1) {
				return false;
			}
			Static233.anInt6980 = Static375.anIntArray539[local80 - 1];
			Static333.anInt5631 = Static254.anIntArray351[local80 - 1];
			Static426.aBoolean501 = false;
			Static291.method3892();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(CB)Z")
	public static boolean method1709(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(32) char[] local32 = Static243.aCharArray2;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(40) char local40 = local32[local34];
				if (local40 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([Lclient!o;I)V")
	public static void method1710(@OriginalArg(0) Class13[] arg0) {
		Static444.anInt7132 = arg0.length;
		Static271.aClass13Array14 = new Class13[Static444.anInt7132 + 10];
		Static181.anIntArray245 = new int[Static444.anInt7132 + 10];
		Static464.method1963(arg0, 0, Static271.aClass13Array14, 0, Static444.anInt7132);
		for (@Pc(26) int local26 = 0; local26 < Static444.anInt7132; local26++) {
			Static181.anIntArray245[local26] = Static271.aClass13Array14[local26].Q();
		}
		for (@Pc(41) int local41 = Static444.anInt7132; local41 < Static271.aClass13Array14.length; local41++) {
			Static181.anIntArray245[local41] = 12;
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
	public static void method1711() {
		Static268.method3631();
		Static123.method5625();
	}
}
