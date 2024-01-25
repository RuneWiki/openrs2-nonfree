import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "[I")
	public static int[] anIntArray346;

	@OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
	public static int anInt5870;

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_212 = new Class214(24, 2);

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_184 = new Class151("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
	public static int anInt5868 = 0;

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
	public static int anInt5869 = 0;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIZ)I")
	public static int method4555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return local12 * arg1;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)Z")
	public static boolean method4556(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static337.anInt1766; local1 < Static97.anInt1709; local1++) {
			@Pc(6) Class82[][] local6 = Static159.aClass82ArrayArrayArray2[local1];
			for (@Pc(9) int local9 = -Static317.anInt5269; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static85.anInt4657 + local9;
				@Pc(18) int local18 = Static85.anInt4657 - local9;
				if (local14 >= Static330.anInt5396 || local18 < Static275.anInt4346) {
					for (@Pc(27) int local27 = -Static317.anInt5269; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static179.anInt2929 + local27;
						@Pc(36) int local36 = Static179.anInt2929 - local27;
						@Pc(48) Class82 local48;
						if (local14 >= Static330.anInt5396) {
							if (local32 >= Static402.anInt6522) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean150) {
									Static69.aBoolean481 = arg0;
									Static63.aClass2_1.method2560(local48);
									Static63.aClass2_1.method2561();
								}
							}
							if (local36 < Static401.anInt3622) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean150) {
									Static69.aBoolean481 = arg0;
									Static63.aClass2_1.method2560(local48);
									Static63.aClass2_1.method2561();
								}
							}
						}
						if (local18 < Static275.anInt4346) {
							if (local32 >= Static402.anInt6522) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean150) {
									Static69.aBoolean481 = arg0;
									Static63.aClass2_1.method2560(local48);
									Static63.aClass2_1.method2561();
								}
							}
							if (local36 < Static401.anInt3622) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean150) {
									Static69.aBoolean481 = arg0;
									Static63.aClass2_1.method2560(local48);
									Static63.aClass2_1.method2561();
								}
							}
						}
						if (Static309.anInt5156 == 0) {
							if (Static350.aBoolean478) {
								Static63.aClass2_1.method2551(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
