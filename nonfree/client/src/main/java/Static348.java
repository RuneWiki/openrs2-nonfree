import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
	public static int anInt5916;

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "Z")
	public static boolean aBoolean433;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	public static int anInt5917 = 0;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_81 = new Class134("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
	public static int anInt5919 = 0;

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "[I")
	public static final int[] anIntArray515 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_82 = new Class134("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	public static void method4627() {
		@Pc(13) Class2_Sub14 local13 = (Class2_Sub14) Static57.aClass156_8.method3155();
		@Pc(24) boolean local24 = Static336.aClass16_18 != null || Static302.anInt4877 > 0;
		if (local24) {
			Static78.anInt1491 = 1;
		}
		if (Static245.aBoolean275 && Static218.aClass181_1.method3865(81) && Static137.anInt6647 > 2) {
			if (local24) {
				Static61.aClass2_Sub46_1 = (Class2_Sub46) Static261.aClass156_13.aClass2_159.aClass2_263.aClass2_263;
			} else {
				Static315.method4296((Class2_Sub46) Static261.aClass156_13.aClass2_159.aClass2_263.aClass2_263, local13.method5383(), local13.method5382());
			}
		} else if (local24) {
			Static61.aClass2_Sub46_1 = (Class2_Sub46) Static261.aClass156_13.aClass2_159.aClass2_263;
		} else {
			Static315.method4296((Class2_Sub46) Static261.aClass156_13.aClass2_159.aClass2_263, local13.method5383(), local13.method5382());
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
	public static void method4628() {
		if (Static237.anIntArray330 != null) {
			return;
		}
		Static237.anIntArray330 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(39) double local39 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(80) double local80;
				if (local57 < 0.5D) {
					local80 = local57 * (local50 + 1.0D);
				} else {
					local80 = local57 + local50 - local50 * local57;
				}
				@Pc(95) double local95 = local57 * 2.0D - local80;
				@Pc(99) double local99 = local39 + 0.3333333333333333D;
				if (local99 > 1.0D) {
					local99--;
				}
				@Pc(113) double local113 = local39 - 0.3333333333333333D;
				if (local113 < 0.0D) {
					local113++;
				}
				if (local39 * 6.0D < 1.0D) {
					local61 = (local80 - local95) * 6.0D * local39 + local95;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local80;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = local95 + (local80 - local95) * (-local39 + 0.6666666666666666D) * 6.0D;
				} else {
					local61 = local95;
				}
				if (local99 * 6.0D < 1.0D) {
					local59 = local99 * (local80 - local95) * 6.0D + local95;
				} else if (local99 * 2.0D < 1.0D) {
					local59 = local80;
				} else if (local99 * 3.0D < 2.0D) {
					local59 = (0.6666666666666666D - local99) * (local80 - local95) * 6.0D + local95;
				} else {
					local59 = local95;
				}
				if (local113 * 6.0D < 1.0D) {
					local63 = local113 * 6.0D * (local80 - local95) + local95;
				} else if (local113 * 2.0D < 1.0D) {
					local63 = local80;
				} else if (local113 * 3.0D < 2.0D) {
					local63 = (local80 - local95) * 6.0D * (0.6666666666666666D - local113) + local95;
				} else {
					local63 = local95;
				}
			}
			local59 = Math.pow(local59, local24);
			local61 = Math.pow(local61, local24);
			local63 = Math.pow(local63, local24);
			@Pc(293) int local293 = (int) (local59 * 256.0D);
			@Pc(298) int local298 = (int) (local61 * 256.0D);
			@Pc(303) int local303 = (int) (local63 * 256.0D);
			@Pc(313) int local313 = (local298 << 8) + (local293 << 16) + local303;
			Static237.anIntArray330[local26] = local313;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IILclient!pg;IZII[B)Lclient!gq;")
	public static Class20_Sub1_Sub1 method4629(@OriginalArg(0) int arg0, @OriginalArg(2) Class163_Sub2 arg1, @OriginalArg(5) int arg2, @OriginalArg(7) byte[] arg3) {
		if (arg1.aBoolean380 || Static376.method4880(arg0) && Static376.method4880(arg2)) {
			return new Class20_Sub1_Sub1(arg1, 3553, 6406, arg0, arg2, false, arg3, 6406);
		} else if (arg1.aBoolean377) {
			return new Class20_Sub1_Sub1(arg1, 34037, 6406, arg0, arg2, false, arg3, 6406);
		} else {
			return new Class20_Sub1_Sub1(arg1, 6406, arg0, arg2, Static29.method453(arg0), Static29.method453(arg2), arg3, 6406);
		}
	}
}
