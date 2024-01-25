import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bp", name = "J", descriptor = "[Lclient!nfa;")
	public static Class33_Sub1[] aClass33_Sub1Array1;

	@OriginalMember(owner = "client!bp", name = "L", descriptor = "I")
	public static int anInt1064;

	@OriginalMember(owner = "client!bp", name = "D", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_18 = new Class337(27, 2);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BI)I")
	public static int method898(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local19 * arg0 >> 12) + 40960;
		return local33 * local13 >> 12;
	}

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "(I)V")
	public static void method899() {
		if (Static66.anIntArray97 != null) {
			return;
		}
		Static66.anIntArray97 = new int[65536];
		@Pc(27) double local27 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < 512; local31++) {
			@Pc(45) float local45 = ((float) (local31 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(54) float local54 = (float) (local31 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(56) int local56 = 0; local56 < 128; local56++) {
				@Pc(63) float local63 = (float) local56 / 128.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(67) float local67 = 0.0F;
				@Pc(69) float local69 = 0.0F;
				@Pc(73) float local73 = local45 / 60.0F;
				@Pc(76) int local76 = (int) local73;
				@Pc(80) int local80 = local76 % 6;
				@Pc(86) float local86 = (float) -local76 + local73;
				@Pc(93) float local93 = (1.0F - local54) * local63;
				@Pc(102) float local102 = local63 * (1.0F - local54 * local86);
				@Pc(112) float local112 = local63 * (1.0F - local54 * (1.0F - local86));
				if (local80 == 0) {
					local69 = local93;
					local67 = local112;
					local65 = local63;
				} else if (local80 == 1) {
					local67 = local63;
					local65 = local102;
					local69 = local93;
				} else if (local80 == 2) {
					local69 = local112;
					local67 = local63;
					local65 = local93;
				} else if (local80 == 3) {
					local67 = local102;
					local65 = local93;
					local69 = local63;
				} else if (local80 == 4) {
					local69 = local63;
					local67 = local93;
					local65 = local112;
				} else if (local80 == 5) {
					local69 = local102;
					local67 = local93;
					local65 = local63;
				}
				local65 = (float) Math.pow((double) local65, local27);
				local67 = (float) Math.pow((double) local67, local27);
				local69 = (float) Math.pow((double) local69, local27);
				@Pc(200) int local200 = (int) (local65 * 256.0F);
				@Pc(205) int local205 = (int) (local67 * 256.0F);
				@Pc(210) int local210 = (int) (local69 * 256.0F);
				@Pc(222) int local222 = local210 + (local205 << 8) + (local200 << 16) - 16777216;
				Static66.anIntArray97[local29++] = local222;
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!raa;I)V")
	public static void method900(@OriginalArg(0) Class295 arg0) {
		if (arg0.anInt7960 != Static371.anInt6177) {
			return;
		}
		if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aString17 == null) {
			arg0.anInt8034 = 0;
			arg0.anInt7982 = 0;
			return;
		}
		arg0.anInt7999 = 150;
		arg0.anInt8037 = (int) (Math.sin((double) Static631.anInt10493 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt7969 = 5;
		arg0.anInt7982 = Static337.anInt5722;
		arg0.anInt8034 = Static108.method1679(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aString17);
		arg0.anInt7966 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt1274;
		arg0.anInt7992 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt1264;
		arg0.anInt7964 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt1208;
		arg0.anInt7975 = 0;
		@Pc(71) Class362 local71 = arg0.anInt7992 == -1 ? null : Static435.aClass298_1.method7034(arg0.anInt7992);
		if (local71 != null) {
			Static574.method8327(arg0.anInt7964, local71);
		}
	}
}
