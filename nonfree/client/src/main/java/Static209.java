import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!in", name = "r", descriptor = "Lclient!oa;")
	public static Class210 aClass210_3;

	@OriginalMember(owner = "client!in", name = "h", descriptor = "Lclient!h;")
	public static final Class114 aClass114_90 = new Class114("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!in", name = "n", descriptor = "Lclient!kv;")
	public static final Class171 aClass171_4 = new Class171();

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)Z")
	public static boolean method3801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(IIII)V")
	public static void method3802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class206 local7 = Static313.aClass206ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class47_Sub5 local13 = local7.aClass47_Sub5_1;
		@Pc(16) Class47_Sub5 local16 = local7.aClass47_Sub5_2;
		if (local13 != null) {
			local13.anInt8488 = local13.anInt8488 * arg3 / (0x10 << Static246.anInt4759 - 7);
			local13.anInt8487 = local13.anInt8487 * arg3 / (0x10 << Static246.anInt4759 - 7);
		}
		if (local16 != null) {
			local16.anInt8488 = local16.anInt8488 * arg3 / (0x10 << Static246.anInt4759 - 7);
			local16.anInt8487 = local16.anInt8487 * arg3 / (0x10 << Static246.anInt4759 - 7);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!fw;IIII)V")
	public static void method3805(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static42.method1369(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static488.anInt8353) {
			Static42.method1369(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static42.method1369(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static60.anInt1677) {
			Static42.method1369(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static60.anInt1677) {
			Static42.method1369(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static488.anInt8353 && arg4 <= Static60.anInt1677) {
			Static42.method1369(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static42.method1369(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static488.anInt8353 && arg4 > 0) {
			Static42.method1369(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
