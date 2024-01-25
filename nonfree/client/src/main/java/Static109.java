import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
	public static int anInt2208 = 0;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLclient!eb;)Lclient!ka;")
	public static Class107 method2030(@OriginalArg(1) Class1_Sub7 arg0) {
		@Pc(14) Class107 local14 = new Class107();
		local14.anInt3136 = arg0.method3115();
		local14.aClass1_Sub1_Sub17_1 = Static122.method2174(local14.anInt3136);
		return local14;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	public static void method2034() {
		if (Static220.anIntArray551 != null) {
			return;
		}
		Static220.anIntArray551 = new int[65536];
		@Pc(25) double local25 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
			@Pc(43) float local43 = ((float) (local29 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(52) float local52 = (float) (local29 & 0x7) / 8.0F + 0.0625F;
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
				@Pc(99) float local99 = (1.0F - local84 * local52) * local61;
				@Pc(109) float local109 = (1.0F - local52 * (1.0F - local84)) * local61;
				if (local78 == 0) {
					local67 = local91;
					local65 = local109;
					local63 = local61;
				} else if (local78 == 1) {
					local65 = local61;
					local67 = local91;
					local63 = local99;
				} else if (local78 == 2) {
					local67 = local109;
					local63 = local91;
					local65 = local61;
				} else if (local78 == 3) {
					local67 = local61;
					local65 = local99;
					local63 = local91;
				} else if (local78 == 4) {
					local67 = local61;
					local63 = local109;
					local65 = local91;
				} else if (local78 == 5) {
					local63 = local61;
					local65 = local91;
					local67 = local99;
				}
				local63 = (float) Math.pow((double) local63, local25);
				local65 = (float) Math.pow((double) local65, local25);
				local67 = (float) Math.pow((double) local67, local25);
				@Pc(203) int local203 = (int) (local63 * 256.0F);
				@Pc(208) int local208 = (int) (local65 * 256.0F);
				@Pc(213) int local213 = (int) (local67 * 256.0F);
				@Pc(225) int local225 = local213 + (local203 << 16) + (local208 << 8) - 16777216;
				Static220.anIntArray551[local27++] = local225;
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Lclient!vf;")
	public static Class1_Sub1_Sub20 method2035(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub20 local10 = (Class1_Sub1_Sub20) Static91.aClass156_6.method4258((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static274.aClass165_82.method4508(0, arg0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static23.method589(local20);
			Static91.aClass156_6.method4256(local10, (long) arg0);
			return local10;
		}
	}
}
