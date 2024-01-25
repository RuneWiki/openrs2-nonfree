import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
	public static int anInt5523;

	@OriginalMember(owner = "client!pw", name = "f", descriptor = "Lclient!aa;")
	public static Class2 aClass2_13;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)V")
	public static void method4573(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub3_Sub4 local8 = Static281.method3883(5, arg0);
		local8.method1006();
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V")
	public static void method4574() {
		if (Static329.anIntArray346 != null) {
			return;
		}
		Static329.anIntArray346 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(40) double local40 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(51) double local51 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(58) double local58 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(60) double local60 = local58;
			@Pc(62) double local62 = local58;
			@Pc(64) double local64 = local58;
			if (local51 != 0.0D) {
				@Pc(78) double local78;
				if (local58 < 0.5D) {
					local78 = (local51 + 1.0D) * local58;
				} else {
					local78 = local58 + local51 - local58 * local51;
				}
				@Pc(96) double local96 = local58 * 2.0D - local78;
				@Pc(100) double local100 = local40 + 0.3333333333333333D;
				if (local100 > 1.0D) {
					local100--;
				}
				@Pc(114) double local114 = local40 - 0.3333333333333333D;
				if (local40 * 6.0D < 1.0D) {
					local62 = local96 + (local78 - local96) * 6.0D * local40;
				} else if (local40 * 2.0D < 1.0D) {
					local62 = local78;
				} else if (local40 * 3.0D < 2.0D) {
					local62 = (0.6666666666666666D - local40) * (-local96 + local78) * 6.0D + local96;
				} else {
					local62 = local96;
				}
				if (local114 < 0.0D) {
					local114++;
				}
				if (local100 * 6.0D < 1.0D) {
					local60 = local100 * (local78 - local96) * 6.0D + local96;
				} else if (local100 * 2.0D < 1.0D) {
					local60 = local78;
				} else if (local100 * 3.0D < 2.0D) {
					local60 = (local78 - local96) * (-local100 + 0.6666666666666666D) * 6.0D + local96;
				} else {
					local60 = local96;
				}
				if (local114 * 6.0D < 1.0D) {
					local64 = local114 * (local78 - local96) * 6.0D + local96;
				} else if (local114 * 2.0D < 1.0D) {
					local64 = local78;
				} else if (local114 * 3.0D < 2.0D) {
					local64 = (local78 - local96) * (0.6666666666666666D - local114) * 6.0D + local96;
				} else {
					local64 = local96;
				}
			}
			local60 = Math.pow(local60, local20);
			local62 = Math.pow(local62, local20);
			local64 = Math.pow(local64, local20);
			@Pc(292) int local292 = (int) (local60 * 256.0D);
			@Pc(297) int local297 = (int) (local62 * 256.0D);
			@Pc(302) int local302 = (int) (local64 * 256.0D);
			@Pc(313) int local313 = (local292 << 16) + (local297 << 8) + local302;
			Static329.anIntArray346[local26] = local313;
		}
	}

	@OriginalMember(owner = "client!pw", name = "f", descriptor = "(I)Lclient!uo;")
	public static Class41_Sub1 method4581() {
		Static414.anInt7473 = 0;
		return Static419.method5746();
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(II)V")
	public static void method4584(@OriginalArg(0) int arg0) {
		Static36.anInt626 = arg0;
		Static106.aClass268_45.method6160();
	}
}
