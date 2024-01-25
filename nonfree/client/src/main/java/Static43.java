import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ce", name = "y", descriptor = "Lclient!dr;")
	public static Class59 aClass59_5;

	@OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
	public static int anInt2397;

	@OriginalMember(owner = "client!ce", name = "A", descriptor = "[I")
	public static final int[] anIntArray188 = new int[3];

	@OriginalMember(owner = "client!ce", name = "D", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_43 = new Class265(20, -1);

	@OriginalMember(owner = "client!ce", name = "E", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_53 = new Class209("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
	public static String method1872(@OriginalArg(0) int arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(18) String local18 = arg1[arg0];
			return local18 == null ? "null" : local18.toString();
		} else {
			@Pc(29) int local29 = arg0 + arg2;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = arg0; local33 < local29; local33++) {
				@Pc(39) String local39 = arg1[local33];
				if (local39 == null) {
					local31 += 4;
				} else {
					local31 += local39.length();
				}
			}
			@Pc(58) StringBuffer local58 = new StringBuffer(local31);
			for (@Pc(60) int local60 = arg0; local60 < local29; local60++) {
				@Pc(66) String local66 = arg1[local60];
				if (local66 == null) {
					local58.append("null");
				} else {
					local58.append(local66);
				}
			}
			return local58.toString();
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)I")
	public static int method1873(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V")
	public static void method1874(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static159.method2586(Static6.aClass54_6);
		Static424.aClass2_Sub23_Sub2_1.method5498(arg1);
		Static424.aClass2_Sub23_Sub2_1.method5502(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1875(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static46.anInt861; local19++) {
			if (arg0.equalsIgnoreCase(Static284.aStringArray35[local19])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static375.aClass3_Sub2_Sub1_Sub2_7.aString56);
	}
}
