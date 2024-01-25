import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!br", name = "n", descriptor = "[[[Lclient!dr;")
	public static Class53[][][] aClass53ArrayArrayArray2;

	@OriginalMember(owner = "client!br", name = "p", descriptor = "I")
	public static int anInt1024;

	@OriginalMember(owner = "client!br", name = "b", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_31 = new Class186(105, 1);

	@OriginalMember(owner = "client!br", name = "k", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_23 = new Class36(28, 8);

	@OriginalMember(owner = "client!br", name = "o", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BZ)V")
	public static void method728(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static349.aClass4_Sub30_Sub1_2.method3920(Static106.anInt2242) >= 15) {
				@Pc(16) int local16 = Static349.aClass4_Sub30_Sub1_2.method3924(15);
				if (local16 != 32767) {
					@Pc(23) boolean local23 = false;
					if (Static176.aClass6_Sub2_Sub1_Sub2Array1[local16] == null) {
						Static176.aClass6_Sub2_Sub1_Sub2Array1[local16] = new Class6_Sub2_Sub1_Sub2();
						Static176.aClass6_Sub2_Sub1_Sub2Array1[local16].anInt6078 = local16;
						local23 = true;
					}
					@Pc(44) Class6_Sub2_Sub1_Sub2 local44 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local16];
					Static128.anIntArray171[Static249.anInt4520++] = local16;
					local44.anInt6142 = Static175.anInt3261;
					if (local44.aClass243_1 != null && local44.aClass243_1.method5341()) {
						Static240.method3311(local44);
					}
					@Pc(75) int local75;
					if (arg0) {
						local75 = Static349.aClass4_Sub30_Sub1_2.method3924(8);
						if (local75 > 127) {
							local75 -= 256;
						}
					} else {
						local75 = Static349.aClass4_Sub30_Sub1_2.method3924(5);
						if (local75 > 15) {
							local75 -= 32;
						}
					}
					@Pc(101) int local101;
					if (arg0) {
						local101 = Static349.aClass4_Sub30_Sub1_2.method3924(8);
						if (local101 > 127) {
							local101 -= 256;
						}
					} else {
						local101 = Static349.aClass4_Sub30_Sub1_2.method3924(5);
						if (local101 > 15) {
							local101 -= 32;
						}
					}
					@Pc(123) int local123 = Static349.aClass4_Sub30_Sub1_2.method3924(2);
					@Pc(128) int local128 = Static349.aClass4_Sub30_Sub1_2.method3924(1);
					if (local128 == 1) {
						Static239.anIntArray357[Static110.anInt2332++] = local16;
					}
					@Pc(150) int local150 = (Static349.aClass4_Sub30_Sub1_2.method3924(3) + 4 & 0x58C00007) << 11;
					local44.method4770(Static388.aClass211_1.method4931(Static349.aClass4_Sub30_Sub1_2.method3924(14)));
					@Pc(167) int local167 = Static349.aClass4_Sub30_Sub1_2.method3924(1);
					local44.method4761(local44.aClass243_1.anInt6902);
					local44.anInt6071 = local44.aClass243_1.anInt6913 << 3;
					if (local44.anInt6071 == 0) {
						local44.method4766(0);
					} else if (local23) {
						local44.method4766(local150);
					}
					local44.method4772(local44.method4763(), local123, local75 + Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray537[0], local101 + Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray536[0], local167 == 1);
					if (local44.aClass243_1.method5341()) {
						Static242.method4046(local44, local44.anIntArray536[0], local44.anIntArray537[0], null, 0, null, local44.aByte86);
					}
					continue;
				}
			}
			Static349.aClass4_Sub30_Sub1_2.method3925();
			return;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III)Lclient!lf;")
	public static Class6_Sub4 method729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = aClass53ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass6_Sub4_1 == null ? null : local7.aClass6_Sub4_1;
	}
}
