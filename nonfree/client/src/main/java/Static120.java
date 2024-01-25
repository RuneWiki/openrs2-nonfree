import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!eea", name = "s", descriptor = "[Lclient!ps;")
	public static Class3_Sub2_Sub2_Sub1[] aClass3_Sub2_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!eea", name = "A", descriptor = "I")
	public static int anInt3199;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(III)V")
	public static void method2941(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(0, 15);
		local8.method3088();
		local8.anInt3368 = arg1;
		local8.anInt3367 = arg0;
	}

	@OriginalMember(owner = "client!eea", name = "d", descriptor = "(I)V")
	public static void method2943() {
		if (Static373.anIntArray464 != null) {
			return;
		}
		Static373.anIntArray464 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(22) int local22 = 0;
		for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
			@Pc(42) float local42 = ((float) (local28 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(51) float local51 = (float) (local28 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(53) int local53 = 0; local53 < 128; local53++) {
				@Pc(60) float local60 = (float) local53 / 128.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(64) float local64 = 0.0F;
				@Pc(66) float local66 = 0.0F;
				@Pc(70) float local70 = local42 / 60.0F;
				@Pc(73) int local73 = (int) local70;
				@Pc(77) int local77 = local73 % 6;
				@Pc(83) float local83 = (float) -local73 + local70;
				@Pc(90) float local90 = local60 * (1.0F - local51);
				@Pc(98) float local98 = local60 * (1.0F - local83 * local51);
				@Pc(108) float local108 = (1.0F - (1.0F - local83) * local51) * local60;
				if (local77 == 0) {
					local62 = local60;
					local64 = local108;
					local66 = local90;
				} else if (local77 == 1) {
					local64 = local60;
					local62 = local98;
					local66 = local90;
				} else if (local77 == 2) {
					local66 = local108;
					local62 = local90;
					local64 = local60;
				} else if (local77 == 3) {
					local66 = local60;
					local64 = local98;
					local62 = local90;
				} else if (local77 == 4) {
					local66 = local60;
					local64 = local90;
					local62 = local108;
				} else if (local77 == 5) {
					local62 = local60;
					local64 = local90;
					local66 = local98;
				}
				local62 = (float) Math.pow((double) local62, local20);
				local64 = (float) Math.pow((double) local64, local20);
				local66 = (float) Math.pow((double) local66, local20);
				@Pc(203) int local203 = (int) (local62 * 256.0F);
				@Pc(208) int local208 = (int) (local64 * 256.0F);
				@Pc(213) int local213 = (int) (local66 * 256.0F);
				@Pc(225) int local225 = (local208 << 8) + (local203 << 16) + local213 - 16777216;
				Static373.anIntArray464[local22++] = local225;
			}
		}
	}

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "(I)V")
	public static void method2944() {
		@Pc(10) Class169 local10 = Static118.aClass169_19;
		synchronized (Static118.aClass169_19) {
			Static118.aClass169_19.method5009();
		}
	}
}
