import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
	public static int anInt6073 = 0;

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "[I")
	public static final int[] anIntArray389 = new int[1000];

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_111 = new Class126(6, 1);

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "Lclient!kh;")
	public static Class208 aClass208_7 = null;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!hk;Z)V")
	public static void method5086(@OriginalArg(0) Class16_Sub2 arg0) {
		@Pc(12) byte[] local12;
		if (Static667.anObject20 == null) {
			@Pc(5) Class148_Sub1_Sub1 local5 = new Class148_Sub1_Sub1();
			local12 = local5.method3248();
			Static667.anObject20 = Static331.method8338(local12);
		}
		if (Static487.anObject15 == null) {
			@Pc(27) Class148_Sub2_Sub2 local27 = new Class148_Sub2_Sub2();
			local12 = local27.method7957();
			Static487.anObject15 = Static331.method8338(local12);
		}
		@Pc(42) Class390 local42 = arg0.aClass390_1;
		if (local42.method8679() && Static126.anObject5 == null) {
			local12 = Static93.method1880(0.6F, 0.5F, new Class157_Sub1(419684), 4.0F, 4.0F, 16.0F);
			Static126.anObject5 = Static331.method8338(local12);
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(II)I")
	public static int method5087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static273.aShortArrayArray10 == null ? 0 : Static273.aShortArrayArray10[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
	public static void method5088() {
		if (Static422.anIntArray448 != null) {
			return;
		}
		Static422.anIntArray448 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(30) int local30 = 0; local30 < 512; local30++) {
			@Pc(43) float local43 = ((float) (local30 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(52) float local52 = (float) (local30 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
				@Pc(61) float local61 = (float) local54 / 128.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(67) float local67 = 0.0F;
				@Pc(71) float local71 = local43 / 60.0F;
				@Pc(74) int local74 = (int) local71;
				@Pc(78) int local78 = local74 % 6;
				@Pc(84) float local84 = (float) -local74 + local71;
				@Pc(91) float local91 = local61 * (1.0F - local52);
				@Pc(100) float local100 = (1.0F - local84 * local52) * local61;
				@Pc(112) float local112 = (1.0F - local52 * (1.0F - local84)) * local61;
				if (local78 == 0) {
					local65 = local112;
					local63 = local61;
					local67 = local91;
				} else if (local78 == 1) {
					local65 = local61;
					local67 = local91;
					local63 = local100;
				} else if (local78 == 2) {
					local67 = local112;
					local63 = local91;
					local65 = local61;
				} else if (local78 == 3) {
					local63 = local91;
					local65 = local100;
					local67 = local61;
				} else if (local78 == 4) {
					local65 = local91;
					local63 = local112;
					local67 = local61;
				} else if (local78 == 5) {
					local65 = local91;
					local63 = local61;
					local67 = local100;
				}
				local63 = (float) Math.pow((double) local63, local19);
				local65 = (float) Math.pow((double) local65, local19);
				local67 = (float) Math.pow((double) local67, local19);
				@Pc(202) int local202 = (int) (local63 * 256.0F);
				@Pc(207) int local207 = (int) (local65 * 256.0F);
				@Pc(212) int local212 = (int) (local67 * 256.0F);
				@Pc(224) int local224 = local212 + (local202 << 16) + (local207 << 8) - 16777216;
				Static422.anIntArray448[local21++] = local224;
			}
		}
	}
}
