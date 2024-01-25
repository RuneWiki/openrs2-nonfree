import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!ro", name = "F", descriptor = "Lclient!fe;")
	public static Class79 aClass79_4;

	@OriginalMember(owner = "client!ro", name = "H", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!ro", name = "O", descriptor = "F")
	public static float aFloat70;

	@OriginalMember(owner = "client!ro", name = "D", descriptor = "[I")
	public static final int[] anIntArray459 = new int[250];

	@OriginalMember(owner = "client!ro", name = "J", descriptor = "I")
	public static int anInt5837 = 0;

	@OriginalMember(owner = "client!ro", name = "K", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_108 = new Class15("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!ro", name = "Q", descriptor = "I")
	public static int anInt5841 = 0;

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "(Z)V")
	public static void method4657() {
		Static254.anInt4209 = -1;
		Static224.aClass95_11 = null;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!ya;)V")
	public static void method4658(@OriginalArg(0) Class135 arg0) {
		for (@Pc(1) int local1 = Static322.anInt5236; local1 < Static320.anInt5205; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static81.anInt1606; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static18.anInt297; local7++) {
					@Pc(16) Class75 local16 = Static432.aClass75ArrayArrayArray6[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class8_Sub2 local21 = local16.aClass8_Sub2_1;
						@Pc(24) Class8_Sub2 local24 = local16.aClass8_Sub2_2;
						if (local21 != null && local21.method5873()) {
							Static421.method5675(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5873()) {
								Static421.method5675(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5875(local21, 0, false, 0, 0, arg0);
								local24.method5879();
							}
							local21.method5879();
						}
						for (@Pc(70) Class251 local70 = local16.aClass251_2; local70 != null; local70 = local70.aClass251_3) {
							@Pc(74) Class8_Sub3 local74 = local70.aClass8_Sub3_2;
							if (local74 != null && local74.method5873()) {
								Static421.method5675(arg0, local74, local1, local4, local7, local74.aShort101 + 1 - local74.aShort100, local74.aShort98 - local74.aShort99 + 1);
								local74.method5879();
							}
						}
						@Pc(111) Class8_Sub4 local111 = local16.aClass8_Sub4_1;
						if (local111 != null && local111.method5873()) {
							Static228.method3082(arg0, local111, local1, local4, local7);
							local111.method5879();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "(III)Lclient!e;")
	public static Class8_Sub5 method4659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class75 local7 = Static432.aClass75ArrayArrayArray6[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass8_Sub5_1;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BI)V")
	public static void method4661() {
		@Pc(1) Class137 local1 = Static144.aClass137_23;
		synchronized (Static144.aClass137_23) {
			Static144.aClass137_23.method2745(5);
		}
		local1 = Static264.aClass137_46;
		synchronized (Static264.aClass137_46) {
			Static264.aClass137_46.method2745(5);
		}
	}
}
