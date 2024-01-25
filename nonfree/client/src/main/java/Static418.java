import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!uq", name = "w", descriptor = "Lclient!pc;")
	public static Class189 aClass189_1;

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_114 = new Class198("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
	public static int anInt6969 = 104;

	@OriginalMember(owner = "client!uq", name = "x", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!uq", name = "y", descriptor = "J")
	public static long aLong219 = 0L;

	@OriginalMember(owner = "client!uq", name = "z", descriptor = "[I")
	public static final int[] anIntArray476 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!za;)V")
	public static void method5512(@OriginalArg(0) Class200 arg0) {
		for (@Pc(1) int local1 = Static252.anInt4106; local1 < Static96.anInt1667; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static439.anInt7318; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static459.anInt4775; local7++) {
					@Pc(16) Class258 local16 = Static319.aClass258ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class2_Sub4 local21 = local16.aClass2_Sub4_2;
						@Pc(24) Class2_Sub4 local24 = local16.aClass2_Sub4_3;
						if (local21 != null && local21.method6024()) {
							Static63.method995(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method6024()) {
								Static63.method995(arg0, local24, local1, local4, local7, 1, 1);
								local24.method6023(arg0, 0, 0, local21, 0, false);
								local24.method6022();
							}
							local21.method6022();
						}
						for (@Pc(70) Class122 local70 = local16.aClass122_3; local70 != null; local70 = local70.aClass122_1) {
							@Pc(74) Class2_Sub1 local74 = local70.aClass2_Sub1_1;
							if (local74 != null && local74.method6024()) {
								Static63.method995(arg0, local74, local1, local4, local7, local74.aShort104 + 1 - local74.aShort107, local74.aShort105 - local74.aShort106 + 1);
								local74.method6022();
							}
						}
						@Pc(111) Class2_Sub3 local111 = local16.aClass2_Sub3_2;
						if (local111 != null && local111.method6024()) {
							Static170.method2356(arg0, local111, local1, local4, local7);
							local111.method6022();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)V")
	public static void method5513() {
		Static288.method3576(Static417.aClass194_114);
		Static281.aClass5_Sub15_Sub2_13.method5583(0);
	}
}
