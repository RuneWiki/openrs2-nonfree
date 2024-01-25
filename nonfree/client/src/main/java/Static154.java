import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "J")
	public static long aLong97;

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
	public static int anInt3337;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "Lclient!vm;")
	public static Class251 aClass251_2;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_103 = new Class92(35, 4);

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_105 = new Class175("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "Lclient!su;")
	public static final Class215 aClass215_56 = new Class215(0);

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_109 = new Class184(62, 2);

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < 1 || arg2 < 1 || Static399.anInt6923 - 2 < arg5 || Static127.anInt2696 - 2 < arg2) {
			return;
		}
		@Pc(32) int local32 = arg0;
		if (arg0 < 3 && Static202.method3303(arg2, arg5)) {
			local32 = arg0 + 1;
		}
		if (!Static123.aClass21_Sub1_1.method787(Static347.anInt6318) && !Static352.method4307(arg2, Static367.anInt6555, arg5, local32)) {
			return;
		}
		if (Static151.aClass217ArrayArrayArray3 == null) {
			return;
		}
		Static368.aClass4_Sub1_1.method759(Static266.aClass75_7, arg3, arg5, arg2, arg0, Static389.aClass23Array1[arg0]);
		if (arg4 < 0) {
			return;
		}
		@Pc(76) boolean local76 = Static123.aClass21_Sub1_1.aBoolean65;
		Static123.aClass21_Sub1_1.aBoolean65 = true;
		Static368.aClass4_Sub1_1.method756(arg0, local32, arg6, arg4, Static266.aClass75_7, arg2, arg1, arg7, Static389.aClass23Array1[arg0], arg5);
		Static123.aClass21_Sub1_1.aBoolean65 = local76;
		return;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIII)V")
	public static void method2723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class70 local3 = new Class70();
		local3.anInt2252 = arg1 >> Static287.anInt5248;
		local3.anInt2242 = arg2 >> Static287.anInt5248;
		local3.anInt2251 = arg3 >> Static287.anInt5248;
		local3.anInt2235 = arg4 >> Static287.anInt5248;
		local3.anInt2239 = arg0;
		local3.anInt2248 = arg1;
		local3.anInt2237 = arg2;
		local3.anInt2245 = arg3;
		local3.anInt2253 = arg4;
		local3.anInt2250 = arg5;
		local3.anInt2236 = arg6;
		Static35.aClass70Array3[Static396.anInt6816++] = local3;
	}
}
