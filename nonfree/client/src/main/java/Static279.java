import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Lclient!la;")
	public static Class116 aClass116_2;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "[Lclient!l;")
	public static Class17[] aClass17Array12;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_115 = new Class209("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	public static int anInt5093 = 0;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_107 = new Class265(58, 0);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)I")
	public static int method4092() {
		if (Static182.aClass68_7 == null) {
			if (!Static123.aBoolean212 && Static373.anInt4900 > 0) {
				if (Static424.aBoolean472 && Static334.aClass226_1.method4977(81) && Static373.anInt4900 > 2) {
					return ((Class2_Sub22) Static248.aClass14_35.aClass2_17.aClass2_262.aClass2_262).anInt3717;
				}
				return ((Class2_Sub22) Static248.aClass14_35.aClass2_17.aClass2_262).anInt3717;
			}
			@Pc(48) int local48 = Static109.aClass1_2.method702();
			@Pc(52) int local52 = Static109.aClass1_2.method698();
			@Pc(54) int local54 = Static237.anInt4550;
			@Pc(56) int local56 = Static19.anInt5290;
			@Pc(58) int local58 = Static296.anInt5305;
			if (local48 > local54 && local48 < local58 + local54) {
				@Pc(76) int local76 = -1;
				@Pc(95) int local95;
				for (@Pc(78) int local78 = 0; local78 < Static373.anInt4900; local78++) {
					if (Static82.aBoolean109) {
						local95 = (Static373.anInt4900 - local78 - 1) * 16 + local56 + 33;
						if (local95 - 13 < local52 && local52 <= local95 + 3) {
							local76 = local78;
						}
					} else {
						local95 = (Static373.anInt4900 - local78 - 1) * 16 + local56 + 31;
						if (local52 > local95 - 13 && local95 + 3 >= local52) {
							local76 = local78;
						}
					}
				}
				if (local76 != -1) {
					local95 = 0;
					@Pc(165) Class249 local165 = new Class249(Static248.aClass14_35);
					for (@Pc(170) Class2_Sub22 local170 = (Class2_Sub22) local165.method5441(); local170 != null; local170 = (Class2_Sub22) local165.method5444()) {
						if (local95++ == local76) {
							return local170.anInt3717;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static void method4093() {
		if (Static199.anIntArray337 != null) {
			return;
		}
		Static199.anIntArray337 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(39) double local39 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(79) double local79;
				if (local57 < 0.5D) {
					local79 = (local50 + 1.0D) * local57;
				} else {
					local79 = local57 + local50 - local57 * local50;
				}
				@Pc(93) double local93 = local57 * 2.0D - local79;
				@Pc(97) double local97 = local39 + 0.3333333333333333D;
				if (local97 > 1.0D) {
					local97--;
				}
				@Pc(111) double local111 = local39 - 0.3333333333333333D;
				if (local97 * 6.0D < 1.0D) {
					local59 = local93 + local97 * (local79 - local93) * 6.0D;
				} else if (local97 * 2.0D < 1.0D) {
					local59 = local79;
				} else if (local97 * 3.0D < 2.0D) {
					local59 = (0.6666666666666666D - local97) * 6.0D * (local79 - local93) + local93;
				} else {
					local59 = local93;
				}
				if (local111 < 0.0D) {
					local111++;
				}
				if (local39 * 6.0D < 1.0D) {
					local61 = local93 + local39 * (local79 - local93) * 6.0D;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local79;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = (0.6666666666666666D - local39) * (-local93 + local79) * 6.0D + local93;
				} else {
					local61 = local93;
				}
				if (local111 * 6.0D < 1.0D) {
					local63 = local111 * (local79 - local93) * 6.0D + local93;
				} else if (local111 * 2.0D < 1.0D) {
					local63 = local79;
				} else if (local111 * 3.0D < 2.0D) {
					local63 = (local79 - local93) * (0.6666666666666666D - local111) * 6.0D + local93;
				} else {
					local63 = local93;
				}
			}
			local59 = Math.pow(local59, local24);
			local61 = Math.pow(local61, local24);
			local63 = Math.pow(local63, local24);
			@Pc(290) int local290 = (int) (local59 * 256.0D);
			@Pc(295) int local295 = (int) (local61 * 256.0D);
			@Pc(300) int local300 = (int) (local63 * 256.0D);
			@Pc(310) int local310 = local300 + (local295 << 8) + (local290 << 16);
			Static199.anIntArray337[local26] = local310;
		}
	}
}
