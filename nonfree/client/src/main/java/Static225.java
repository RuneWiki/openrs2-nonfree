import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
	public static int anInt3978;

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "Lclient!lba;")
	public static Class165 aClass165_1;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_82 = new Class56(58, 10);

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public static void method3528() {
		if (Static214.anIntArray203 != null) {
			return;
		}
		Static214.anIntArray203 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(21) int local21 = 0; local21 < 65536; local21++) {
			@Pc(34) double local34 = (double) (local21 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(45) double local45 = (double) (local21 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(52) double local52 = (double) (local21 & 0x7F) / 128.0D;
			@Pc(54) double local54 = local52;
			@Pc(56) double local56 = local52;
			@Pc(58) double local58 = local52;
			if (local45 != 0.0D) {
				@Pc(72) double local72;
				if (local52 < 0.5D) {
					local72 = (local45 + 1.0D) * local52;
				} else {
					local72 = local45 + local52 - local45 * local52;
				}
				@Pc(90) double local90 = local52 * 2.0D - local72;
				@Pc(94) double local94 = local34 + 0.3333333333333333D;
				if (local94 > 1.0D) {
					local94--;
				}
				@Pc(108) double local108 = local34 - 0.3333333333333333D;
				if (local34 * 6.0D < 1.0D) {
					local56 = local90 + (local72 - local90) * 6.0D * local34;
				} else if (local34 * 2.0D < 1.0D) {
					local56 = local72;
				} else if (local34 * 3.0D < 2.0D) {
					local56 = local90 + (local72 - local90) * 6.0D * (0.6666666666666666D - local34);
				} else {
					local56 = local90;
				}
				if (local108 < 0.0D) {
					local108++;
				}
				if (local94 * 6.0D < 1.0D) {
					local54 = local94 * 6.0D * (local72 - local90) + local90;
				} else if (local94 * 2.0D < 1.0D) {
					local54 = local72;
				} else if (local94 * 3.0D < 2.0D) {
					local54 = local90 + (0.6666666666666666D - local94) * 6.0D * (local72 - local90);
				} else {
					local54 = local90;
				}
				if (local108 * 6.0D < 1.0D) {
					local58 = local90 + local108 * 6.0D * (local72 - local90);
				} else if (local108 * 2.0D < 1.0D) {
					local58 = local72;
				} else if (local108 * 3.0D < 2.0D) {
					local58 = (local72 - local90) * 6.0D * (0.6666666666666666D - local108) + local90;
				} else {
					local58 = local90;
				}
			}
			local54 = Math.pow(local54, local19);
			local56 = Math.pow(local56, local19);
			local58 = Math.pow(local58, local19);
			@Pc(288) int local288 = (int) (local54 * 256.0D);
			@Pc(293) int local293 = (int) (local56 * 256.0D);
			@Pc(298) int local298 = (int) (local58 * 256.0D);
			@Pc(308) int local308 = local298 + (local293 << 8) + (local288 << 16);
			Static214.anIntArray203[local21] = local308;
		}
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V")
	public static void method3530() {
		Static527.anIntArray554 = Static360.method5293(0.4F);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBI)V")
	public static void method3532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub7_Sub18 local8 = Static543.method7218(12, arg1);
		local8.method7326();
		local8.anInt8802 = arg0;
	}
}
