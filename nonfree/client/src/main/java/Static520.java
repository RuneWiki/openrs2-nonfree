import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_151 = new Class40("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_96 = new Class236(78, -1);

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "Lclient!id;")
	public static final Class142 aClass142_21 = new Class142("", 13);

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_97 = new Class236(38, 8);

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	public static void method7265() {
		@Pc(7) Class97 local7 = null;
		try {
			@Pc(13) Class83 local13 = Static159.aClass9_10.method293(true, "2");
			while (local13.anInt2495 == 0) {
				Static213.method3465(1L);
			}
			if (local13.anInt2495 == 1) {
				local7 = (Class97) local13.anObject8;
				@Pc(42) Class5_Sub3 local42 = new Class5_Sub3(Static304.anInt6006 * 6 + 3);
				local42.method4192(1);
				local42.method4181(Static304.anInt6006);
				for (@Pc(52) int local52 = 0; local52 < Static481.anIntArray650.length; local52++) {
					if (Static466.aBooleanArray34[local52]) {
						local42.method4181(local52);
						local42.method4184(Static481.anIntArray650[local52]);
					}
				}
				local7.method2497(local42.aByteArray66, 0, local42.anInt4960);
			}
		} catch (@Pc(87) Exception local87) {
		}
		try {
			if (local7 != null) {
				local7.method2499();
			}
		} catch (@Pc(103) Exception local103) {
		}
		Static115.aLong83 = Static105.method2132();
		Static218.aBoolean249 = false;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZZBI)V")
	public static void method7268(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		Static534.method7284(arg3, 0, arg1, Static74.aClass35_Sub1Array1.length - 1, arg2, arg0);
		Static322.anInt6205 = 0;
		Static322.aClass5_Sub38_1 = null;
	}
}
