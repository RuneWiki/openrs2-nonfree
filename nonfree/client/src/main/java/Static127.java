import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!hr", name = "V", descriptor = "I")
	public static int anInt2450;

	@OriginalMember(owner = "client!hr", name = "Y", descriptor = "[[I")
	public static int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!hr", name = "N", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_59 = new Class85("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!hr", name = "R", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_60 = new Class85("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!hr", name = "W", descriptor = "[I")
	public static final int[] anIntArray242 = new int[1000];

	@OriginalMember(owner = "client!hr", name = "X", descriptor = "[I")
	public static final int[] anIntArray243 = new int[50];

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)V")
	public static void method2261() {
		Static125.anIntArray239 = null;
		Static183.anIntArray365 = null;
		Static11.aClipboard1 = null;
		Static186.aBoolean286 = false;
		Static207.aBooleanArray16 = null;
		Static192.anIntArray382 = null;
		Static300.method5274();
	}

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "(I)V")
	public static void method2263() {
		Static212.aClass109_45.method2850();
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(Z)V")
	public static void method2264() {
		Static187.aClass5_Sub12_Sub2_4.method5124();
		@Pc(11) int local11 = Static187.aClass5_Sub12_Sub2_4.method5120(1);
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static187.aClass5_Sub12_Sub2_4.method5120(2);
		if (local22 == 0) {
			Static76.anIntArray118[Static195.anInt3883++] = 2047;
			return;
		}
		@Pc(48) int local48;
		@Pc(58) int local58;
		if (local22 == 1) {
			local48 = Static187.aClass5_Sub12_Sub2_4.method5120(3);
			Static192.aClass4_Sub5_Sub2_Sub1_2.method4125(local48, 1);
			local58 = Static187.aClass5_Sub12_Sub2_4.method5120(1);
			if (local58 == 1) {
				Static76.anIntArray118[Static195.anInt3883++] = 2047;
			}
		} else if (local22 == 2) {
			if (Static187.aClass5_Sub12_Sub2_4.method5120(1) == 1) {
				local48 = Static187.aClass5_Sub12_Sub2_4.method5120(3);
				Static192.aClass4_Sub5_Sub2_Sub1_2.method4125(local48, 2);
				local58 = Static187.aClass5_Sub12_Sub2_4.method5120(3);
				Static192.aClass4_Sub5_Sub2_Sub1_2.method4125(local58, 2);
			} else {
				local48 = Static187.aClass5_Sub12_Sub2_4.method5120(3);
				Static192.aClass4_Sub5_Sub2_Sub1_2.method4125(local48, 0);
			}
			local48 = Static187.aClass5_Sub12_Sub2_4.method5120(1);
			if (local48 == 1) {
				Static76.anIntArray118[Static195.anInt3883++] = 2047;
			}
		} else if (local22 == 3) {
			local48 = Static187.aClass5_Sub12_Sub2_4.method5120(7);
			local58 = Static187.aClass5_Sub12_Sub2_4.method5120(7);
			@Pc(148) int local148 = Static187.aClass5_Sub12_Sub2_4.method5120(1);
			if (local148 == 1) {
				Static76.anIntArray118[Static195.anInt3883++] = 2047;
			}
			Static239.anInt4811 = Static187.aClass5_Sub12_Sub2_4.method5120(2);
			@Pc(171) int local171 = Static187.aClass5_Sub12_Sub2_4.method5120(1);
			Static192.aClass4_Sub5_Sub2_Sub1_2.method4118(local171 == 1, local58, Static239.anInt4811, local48);
		}
	}
}
