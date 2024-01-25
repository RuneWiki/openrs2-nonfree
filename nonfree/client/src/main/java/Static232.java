import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "[Lclient!qg;")
	public static Class206[] aClass206Array1;

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "[I")
	public static int[] anIntArray339;

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "Lclient!hi;")
	public static final Class106 aClass106_8 = new Class106(13, 0, 1, 0);

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "[I")
	public static final int[] anIntArray340 = new int[100];

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!qq;)V")
	public static void method3612(@OriginalArg(0) Class28 arg0) {
		for (@Pc(1) int local1 = Static71.anInt1486; local1 < Static268.anInt4600; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static401.anInt6621; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static364.anInt6134; local7++) {
					@Pc(16) Class189 local16 = Static30.aClass189ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class3_Sub1 local21 = local16.aClass3_Sub1_1;
						@Pc(24) Class3_Sub1 local24 = local16.aClass3_Sub1_2;
						if (local21 != null && local21.method5791()) {
							Static199.method3151(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5791()) {
								Static199.method3151(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5794(0, arg0, local21, false, 0, 0);
								local24.method5798();
							}
							local21.method5798();
						}
						for (@Pc(70) Class242 local70 = local16.aClass242_2; local70 != null; local70 = local70.aClass242_4) {
							@Pc(74) Class3_Sub3 local74 = local70.aClass3_Sub3_2;
							if (local74 != null && local74.method5791()) {
								Static199.method3151(arg0, local74, local1, local4, local7, local74.aShort98 + 1 - local74.aShort97, local74.aShort96 - local74.aShort95 + 1);
								local74.method5798();
							}
						}
						@Pc(111) Class3_Sub5 local111 = local16.aClass3_Sub5_1;
						if (local111 != null && local111.method5791()) {
							Static161.method2658(arg0, local111, local1, local4, local7);
							local111.method5798();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)Lclient!uo;")
	public static Class245 method3613(@OriginalArg(1) int arg0) {
		@Pc(15) Class245 local15 = (Class245) Static234.aClass220_34.method4990((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static198.aClass158_43.method3672(arg0, 0);
		local15 = new Class245();
		if (local25 != null) {
			local15.method5587(new Class6_Sub15(local25));
		}
		local15.method5588();
		Static234.aClass220_34.method4996(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
	public static void method3614() {
		Static244.anIntArray375 = null;
		Static373.anIntArray193 = null;
		Static243.anIntArray372 = null;
		Static433.aBoolean315 = false;
		Static246.anIntArray379 = null;
		Static451.anIntArray549 = null;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(II)V")
	public static void method3615(@OriginalArg(1) int arg0) {
		if (Static2.anInt9 == 0) {
			Static47.aClass6_Sub5_Sub3_7.method3630(arg0);
		} else {
			Static258.anInt4423 = arg0;
		}
	}
}
