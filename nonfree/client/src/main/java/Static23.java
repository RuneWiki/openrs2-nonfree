import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "Lclient!df;")
	public static Class49 aClass49_4;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "[Lclient!f;")
	public static Class76[] aClass76Array1;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
	public static int anInt493 = 0;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "S")
	public static short aShort5 = 32767;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!na;)V")
	public static void method320(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1) {
		Static372.aClass106Array11[arg0] = arg1;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public static void method322() {
		if (Static130.anIntArray144 != null) {
			return;
		}
		Static130.anIntArray144 = new int[65536];
		@Pc(26) double local26 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(28) int local28 = 0; local28 < 65536; local28++) {
			@Pc(42) double local42 = (double) (local28 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(53) double local53 = (double) (local28 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(60) double local60 = (double) (local28 & 0x7F) / 128.0D;
			@Pc(62) double local62 = local60;
			@Pc(64) double local64 = local60;
			@Pc(66) double local66 = local60;
			if (local53 != 0.0D) {
				@Pc(80) double local80;
				if (local60 < 0.5D) {
					local80 = (local53 + 1.0D) * local60;
				} else {
					local80 = local53 + local60 - local53 * local60;
				}
				@Pc(96) double local96 = local60 * 2.0D - local80;
				@Pc(100) double local100 = local42 + 0.3333333333333333D;
				if (local100 > 1.0D) {
					local100--;
				}
				@Pc(114) double local114 = local42 - 0.3333333333333333D;
				if (local42 * 6.0D < 1.0D) {
					local64 = (local80 - local96) * 6.0D * local42 + local96;
				} else if (local42 * 2.0D < 1.0D) {
					local64 = local80;
				} else if (local42 * 3.0D < 2.0D) {
					local64 = local96 + (0.6666666666666666D - local42) * 6.0D * (local80 - local96);
				} else {
					local64 = local96;
				}
				if (local100 * 6.0D < 1.0D) {
					local62 = (local80 - local96) * 6.0D * local100 + local96;
				} else if (local100 * 2.0D < 1.0D) {
					local62 = local80;
				} else if (local100 * 3.0D < 2.0D) {
					local62 = local96 + (0.6666666666666666D - local100) * 6.0D * (local80 - local96);
				} else {
					local62 = local96;
				}
				if (local114 < 0.0D) {
					local114++;
				}
				if (local114 * 6.0D < 1.0D) {
					local66 = local96 + local114 * 6.0D * (local80 - local96);
				} else if (local114 * 2.0D < 1.0D) {
					local66 = local80;
				} else if (local114 * 3.0D < 2.0D) {
					local66 = local96 + (local80 - local96) * 6.0D * (0.6666666666666666D - local114);
				} else {
					local66 = local96;
				}
			}
			local62 = Math.pow(local62, local26);
			local64 = Math.pow(local64, local26);
			local66 = Math.pow(local66, local26);
			@Pc(293) int local293 = (int) (local62 * 256.0D);
			@Pc(298) int local298 = (int) (local64 * 256.0D);
			@Pc(303) int local303 = (int) (local66 * 256.0D);
			@Pc(313) int local313 = (local298 << 8) + (local293 << 16) + local303;
			Static130.anIntArray144[local28] = local313;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!pc;BLclient!pc;Lclient!pc;Lclient!pc;)V")
	public static void method323(@OriginalArg(0) Class188 arg0, @OriginalArg(2) Class188 arg1, @OriginalArg(3) Class188 arg2, @OriginalArg(4) Class188 arg3) {
		Static171.aClass188_47 = arg2;
		Static313.aClass188_84 = arg1;
		Static320.aClass188_129 = arg0;
		Static269.aClass188_73 = arg3;
		Static450.aClass41ArrayArray2 = new Class41[Static320.aClass188_129.method4299()][];
		Static272.aBooleanArray51 = new boolean[Static320.aClass188_129.method4299()];
	}
}
