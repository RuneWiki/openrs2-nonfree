import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "[S")
	public static short[] aShortArray66;

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "Lclient!mu;")
	public static Class158 aClass158_1;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_136 = new Class189("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
	public static int anInt4225 = -1;

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "[I")
	public static int[] anIntArray278 = new int[1];

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZIZII)V")
	public static void method3380(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (!arg2 && Static373.anInt6270 == arg1 && Static417.anInt6837 == arg3 && (Static228.anInt4246 == Static6.anInt93 || Static374.aClass20_Sub1_1.method1814(Static105.anInt2382))) {
			return;
		}
		Static228.anInt4246 = Static6.anInt93;
		Static373.anInt6270 = arg1;
		Static417.anInt6837 = arg3;
		if (Static374.aClass20_Sub1_1.method1814(Static105.anInt2382)) {
			Static228.anInt4246 = 0;
		}
		if (arg0) {
			Static230.method3465(28);
		} else {
			Static230.method3465(25);
		}
		Static53.method1120(true, Static21.aClass189_14.method4262(Static53.anInt1454), Static299.aClass59_3);
		@Pc(66) int local66 = Static223.anInt7618;
		Static223.anInt7618 = (Static373.anInt6270 - (Static40.anInt1089 >> 4)) * 8;
		@Pc(77) int local77 = Static57.anInt5085;
		Static57.anInt5085 = (Static417.anInt6837 - (Static44.anInt7276 >> 4)) * 8;
		Static87.aClass3_Sub4_Sub8_6 = Static144.method4248(Static373.anInt6270 * 8, Static417.anInt6837 * 8);
		Static240.aClass116_2 = null;
		@Pc(100) int local100 = Static223.anInt7618 - local66;
		@Pc(105) int local105 = Static57.anInt5085 - local77;
		@Pc(115) int local115;
		@Pc(123) int local123;
		if (arg0) {
			Static54.anInt1472 = 0;
			local115 = Static40.anInt1089 * 128 - 128;
			@Pc(121) int local121 = Static44.anInt7276 * 128 - 128;
			for (local123 = 0; local123 < 32768; local123++) {
				@Pc(128) Class7_Sub2_Sub3_Sub1 local128 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local123];
				if (local128 != null) {
					local128.anInt4318 -= local100 * 128;
					local128.anInt4321 -= local105 * 128;
					if (local128.anInt4318 >= 0 && local115 >= local128.anInt4318 && local128.anInt4321 >= 0 && local128.anInt4321 <= local121) {
						@Pc(172) boolean local172 = true;
						for (@Pc(174) int local174 = 0; local174 < 10; local174++) {
							local128.anIntArray287[local174] -= local100;
							local128.anIntArray288[local174] -= local105;
							if (local128.anIntArray287[local174] < 0 || local128.anIntArray287[local174] >= Static40.anInt1089 || local128.anIntArray288[local174] < 0 || local128.anIntArray288[local174] >= Static44.anInt7276) {
								local172 = false;
							}
						}
						if (local172) {
							Static319.anIntArray114[Static54.anInt1472++] = local123;
						} else {
							Static139.aClass7_Sub2_Sub3_Sub1Array11[local123].method454(null);
							Static139.aClass7_Sub2_Sub3_Sub1Array11[local123] = null;
						}
					} else {
						Static139.aClass7_Sub2_Sub3_Sub1Array11[local123].method454(null);
						Static139.aClass7_Sub2_Sub3_Sub1Array11[local123] = null;
					}
				}
			}
		} else {
			for (local115 = 0; local115 < 32768; local115++) {
				@Pc(274) Class7_Sub2_Sub3_Sub1 local274 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local115];
				if (local274 != null) {
					for (local123 = 0; local123 < 10; local123++) {
						local274.anIntArray287[local123] -= local100;
						local274.anIntArray288[local123] -= local105;
					}
					local274.anInt4321 -= local105 * 128;
					local274.anInt4318 -= local100 * 128;
				}
			}
		}
		for (local115 = 0; local115 < 2048; local115++) {
			@Pc(328) Class7_Sub2_Sub3_Sub2 local328 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local115];
			if (local328 != null) {
				for (local123 = 0; local123 < 10; local123++) {
					local328.anIntArray287[local123] -= local100;
					local328.anIntArray288[local123] -= local105;
				}
				local328.anInt4321 -= local105 * 128;
				local328.anInt4318 -= local100 * 128;
			}
		}
		@Pc(379) Class196[] local379 = Static331.aClass196Array41;
		for (local123 = 0; local123 < local379.length; local123++) {
			@Pc(386) Class196 local386 = local379[local123];
			if (local386 != null) {
				local386.anInt5508 -= local105 * 128;
				local386.anInt5500 -= local100 * 128;
			}
		}
		Static269.method3870(local105, local100);
		for (@Pc(420) Class3_Sub17 local420 = (Class3_Sub17) Static301.aClass243_16.method5208(); local420 != null; local420 = (Class3_Sub17) Static301.aClass243_16.method5203()) {
			local420.anInt2917 -= local100;
			local420.anInt2910 -= local105;
			if (Static166.anInt3385 != 3 && (local420.anInt2917 < 0 || local420.anInt2910 < 0 || local420.anInt2917 >= Static40.anInt1089 || local420.anInt2910 >= Static44.anInt7276)) {
				local420.method5977();
			}
		}
		if (Static78.anInt1944 != 0) {
			Static78.anInt1944 -= local100;
			Static312.anInt5522 -= local105;
		}
		Static235.method3583();
		if (arg0) {
			Static348.anInt5916 -= local100;
			Static202.anInt3951 -= local105;
			Static265.anInt5008 -= local105 * 128;
			Static276.anInt5105 -= local100 * 128;
			Static57.anInt5083 -= local105;
			Static194.anInt3883 -= local100;
			if (Math.abs(local100) > Static40.anInt1089 || Math.abs(local105) > Static44.anInt7276) {
				Static214.method3288();
			}
		} else if (Static161.anInt3316 == 4) {
			Static422.anInt6891 -= local105 * 128;
			Static382.anInt1874 -= local100 * 128;
			Static215.anInt4111 -= local105 * 128;
			Static35.anInt1000 -= local100 * 128;
		} else {
			Static161.anInt3316 = 1;
		}
		Static177.method2822();
		Static47.method862();
		Static365.aClass243_38.method5200();
		Static92.aClass243_14.method5200();
		Static231.aClass138_2.method3308();
		Static171.method2757();
	}
}
