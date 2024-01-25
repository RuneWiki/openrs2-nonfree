import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fca", name = "L", descriptor = "I")
	public static int anInt2854;

	@OriginalMember(owner = "client!fca", name = "D", descriptor = "F")
	public static float aFloat26;

	@OriginalMember(owner = "client!fca", name = "fb", descriptor = "I")
	public static int anInt2831 = 0;

	@OriginalMember(owner = "client!fca", name = "J", descriptor = "Lclient!pm;")
	public static final Class295 aClass295_6 = new Class295(4);

	@OriginalMember(owner = "client!fca", name = "rc", descriptor = "J")
	public static long aLong98 = -1L;

	@OriginalMember(owner = "client!fca", name = "dc", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_49 = new Class349(14, 8);

	@OriginalMember(owner = "client!fca", name = "f", descriptor = "(I)V")
	public static void method2491() {
		if (Static555.anIntArray633 != null) {
			return;
		}
		Static555.anIntArray633 = new int[65536];
		@Pc(23) double local23 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(25) int local25 = 0; local25 < 65536; local25++) {
			@Pc(42) double local42 = (double) (local25 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(53) double local53 = (double) (local25 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(60) double local60 = (double) (local25 & 0x7F) / 128.0D;
			@Pc(62) double local62 = local60;
			@Pc(64) double local64 = local60;
			@Pc(66) double local66 = local60;
			if (local53 != 0.0D) {
				@Pc(84) double local84;
				if (local60 < 0.5D) {
					local84 = (local53 + 1.0D) * local60;
				} else {
					local84 = local60 + local53 - local53 * local60;
				}
				@Pc(99) double local99 = local60 * 2.0D - local84;
				@Pc(103) double local103 = local42 + 0.3333333333333333D;
				if (local103 > 1.0D) {
					local103--;
				}
				@Pc(117) double local117 = local42 - 0.3333333333333333D;
				if (local117 < 0.0D) {
					local117++;
				}
				if (local103 * 6.0D < 1.0D) {
					local62 = local103 * (local84 - local99) * 6.0D + local99;
				} else if (local103 * 2.0D < 1.0D) {
					local62 = local84;
				} else if (local103 * 3.0D < 2.0D) {
					local62 = (local84 - local99) * (-local103 + 0.6666666666666666D) * 6.0D + local99;
				} else {
					local62 = local99;
				}
				if (local42 * 6.0D < 1.0D) {
					local64 = local42 * 6.0D * (local84 - local99) + local99;
				} else if (local42 * 2.0D < 1.0D) {
					local64 = local84;
				} else if (local42 * 3.0D < 2.0D) {
					local64 = local99 + (local84 - local99) * 6.0D * (0.6666666666666666D - local42);
				} else {
					local64 = local99;
				}
				if (local117 * 6.0D < 1.0D) {
					local66 = (local84 - local99) * 6.0D * local117 + local99;
				} else if (local117 * 2.0D < 1.0D) {
					local66 = local84;
				} else if (local117 * 3.0D < 2.0D) {
					local66 = local99 + (local84 - local99) * (-local117 + 0.6666666666666666D) * 6.0D;
				} else {
					local66 = local99;
				}
			}
			local62 = Math.pow(local62, local23);
			local64 = Math.pow(local64, local23);
			local66 = Math.pow(local66, local23);
			@Pc(310) int local310 = (int) (local62 * 256.0D);
			@Pc(315) int local315 = (int) (local64 * 256.0D);
			@Pc(320) int local320 = (int) (local66 * 256.0D);
			@Pc(331) int local331 = local320 + (local310 << 16) + (local315 << 8);
			Static555.anIntArray633[local25] = local331;
		}
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "(Z)V")
	public static void method2505() {
		if (Static479.aClass70_2 != null) {
			Static479.aClass70_2.method9362();
		}
		if (Static600.aClass70_3 != null) {
			Static600.aClass70_3.method9362();
		}
	}
}
