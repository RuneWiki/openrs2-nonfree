import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!se", name = "F", descriptor = "I")
	public static int anInt5140;

	@OriginalMember(owner = "client!se", name = "B", descriptor = "I")
	public static int anInt5136 = 0;

	@OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
	public static int anInt5158 = 0;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(III)V")
	public static void method4228(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static138.anInt2664 > 0) {
			Static178.method2940(Static138.anInt2664);
			Static138.anInt2664 = 0;
		}
		@Pc(19) int local19 = Static143.anInt2745 * arg1;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 1; local25 < 255; local25++) {
			@Pc(41) int local41 = (256 - local25) * Static39.anIntArray61[local25] / 256;
			if (local41 < 0) {
				local41 = 0;
			}
			local21 += local41;
			@Pc(53) int local53;
			for (local53 = local41; local53 < 128; local53++) {
				@Pc(63) int local63 = Static255.anIntArray551[local21++];
				@Pc(71) int local71 = Static143.anIntArray316[arg0 + local19++];
				if (local63 == 0) {
					Static90.aClass3_Sub4_Sub12_Sub2_1.anIntArray596[local23++] = local71;
				} else {
					@Pc(77) int local77 = local63 + 18;
					if (local77 > 255) {
						local77 = 255;
					}
					@Pc(88) int local88 = 238 - local63;
					if (local88 > 255) {
						local88 = 255;
					}
					local63 = Static152.anIntArray330[local63];
					Static90.aClass3_Sub4_Sub12_Sub2_1.anIntArray596[local23++] = ((local71 & 0xFF00FF) * local88 + (local63 & 0xFF00FF) * local77 & 0xFF00FF00) + (local77 * (local63 & 0xFF00) + (local88 * (local71 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			for (local53 = 0; local53 < local41; local53++) {
				Static90.aClass3_Sub4_Sub12_Sub2_1.anIntArray596[local23++] = Static143.anIntArray316[arg0 + local19++];
			}
			local19 += Static143.anInt2745 - 128;
		}
		if (Static283.aBoolean393) {
			Static234.method3969(Static90.aClass3_Sub4_Sub12_Sub2_1.anIntArray596, arg0, arg1, Static90.aClass3_Sub4_Sub12_Sub2_1.anInt5728, Static90.aClass3_Sub4_Sub12_Sub2_1.anInt5729);
		} else {
			Static90.aClass3_Sub4_Sub12_Sub2_1.method4704(arg0, arg1);
		}
	}
}
