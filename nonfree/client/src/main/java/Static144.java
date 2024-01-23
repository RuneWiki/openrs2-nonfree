import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!sc;")
	public static Class107 aClass107_853 = Static231.method3737("Weiter");

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	public static void method2375() {
		for (@Pc(12) int local12 = 0; local12 < Static204.anInt2501; local12++) {
			@Pc(18) int local18 = Static157.anIntArray303[local12]--;
			if (Static157.anIntArray303[local12] >= -10) {
				@Pc(89) Class43 local89 = Static87.aClass43Array1[local12];
				if (local89 == null) {
					local89 = Static237.method1256(Static156.aClass28_Sub1_90, Static173.anIntArray331[local12], 0);
					if (local89 == null) {
						continue;
					}
					Static157.anIntArray303[local12] += local89.method1254();
					Static87.aClass43Array1[local12] = local89;
				}
				if (Static157.anIntArray303[local12] < 0) {
					@Pc(217) int local217;
					if (Static161.anIntArray308[local12] == 0) {
						local217 = Static91.anInt1982;
					} else {
						@Pc(136) int local136 = (Static161.anIntArray308[local12] & 0xFF) * 128;
						@Pc(144) int local144 = Static161.anIntArray308[local12] >> 16 & 0xFF;
						@Pc(152) int local152 = Static161.anIntArray308[local12] >> 8 & 0xFF;
						@Pc(162) int local162 = local152 * 128 + 64 - Static204.aClass5_Sub5_Sub1_2.anInt3044;
						if (local162 < 0) {
							local162 = -local162;
						}
						@Pc(177) int local177 = local144 * 128 + 64 - Static204.aClass5_Sub5_Sub1_2.anInt3021;
						if (local177 < 0) {
							local177 = -local177;
						}
						@Pc(191) int local191 = local177 + local162 - 128;
						if (local191 > local136) {
							Static157.anIntArray303[local12] = -100;
							continue;
						}
						if (local191 < 0) {
							local191 = 0;
						}
						local217 = Static90.anInt1961 * (local136 - local191) / local136;
					}
					if (local217 > 0) {
						@Pc(228) Class1_Sub7_Sub1 local228 = local89.method1253().method1034(Static218.aClass108_1);
						@Pc(233) Class1_Sub6_Sub3 local233 = Static238.method1831(local228, local217);
						local233.method1837(Static195.anIntArray352[local12] - 1);
						Static42.aClass1_Sub6_Sub1_1.method972(local233);
					}
					Static157.anIntArray303[local12] = -100;
				}
			} else {
				Static204.anInt2501--;
				for (@Pc(32) int local32 = local12; local32 < Static204.anInt2501; local32++) {
					Static173.anIntArray331[local32] = Static173.anIntArray331[local32 + 1];
					Static87.aClass43Array1[local32] = Static87.aClass43Array1[local32 + 1];
					Static195.anIntArray352[local32] = Static195.anIntArray352[local32 + 1];
					Static157.anIntArray303[local32] = Static157.anIntArray303[local32 + 1];
					Static161.anIntArray308[local32] = Static161.anIntArray308[local32 + 1];
				}
				local12--;
			}
		}
		if (Static179.aBoolean356 && !Static193.method3154()) {
			if (Static157.anInt3449 != 0 && Static10.anInt276 != -1) {
				Static172.method2739(Static10.anInt276, Static157.anInt3449, Static80.aClass28_Sub1_47);
			}
			Static179.aBoolean356 = false;
		} else if (Static157.anInt3449 != 0 && Static10.anInt276 != -1 && !Static193.method3154()) {
			Static193.aClass1_Sub26_Sub1_2.method3000(204);
			Static193.aClass1_Sub26_Sub1_2.method2973(Static10.anInt276);
			Static10.anInt276 = -1;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!sc;")
	public static Class107 method2376(@OriginalArg(0) String arg0) {
		@Pc(9) byte[] local9;
		try {
			local9 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(16) UnsupportedEncodingException local16) {
			local9 = arg0.getBytes();
		}
		@Pc(23) Class107 local23 = new Class107();
		local23.aByteArray55 = local9;
		local23.anInt4186 = 0;
		for (@Pc(31) int local31 = 0; local31 < local9.length; local31++) {
			if (local9[local31] != 0) {
				local9[local23.anInt4186++] = local9[local31];
			}
		}
		return local23;
	}
}
