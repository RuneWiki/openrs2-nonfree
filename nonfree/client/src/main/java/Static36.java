import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "Lclient!al;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!bt", name = "A", descriptor = "Lclient!fh;")
	public static Class68 aClass68_2;

	@OriginalMember(owner = "client!bt", name = "D", descriptor = "Lclient!iq;")
	public static Class104 aClass104_26;

	@OriginalMember(owner = "client!bt", name = "F", descriptor = "Lclient!iq;")
	public static Class104 aClass104_27;

	@OriginalMember(owner = "client!bt", name = "G", descriptor = "I")
	public static int anInt551;

	@OriginalMember(owner = "client!bt", name = "H", descriptor = "Lclient!tg;")
	public static Class191 aClass191_1;

	@OriginalMember(owner = "client!bt", name = "I", descriptor = "[I")
	public static int[] anIntArray67;

	@OriginalMember(owner = "client!bt", name = "J", descriptor = "I")
	public static int anInt552;

	@OriginalMember(owner = "client!bt", name = "B", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_24 = new Class157(60, 4);

	@OriginalMember(owner = "client!bt", name = "C", descriptor = "Lclient!cf;")
	public static final Class36 aClass36_1 = Static59.method1242();

	@OriginalMember(owner = "client!bt", name = "E", descriptor = "[[I")
	public static final int[][] anIntArrayArray12 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
	public static void method468() {
		if (Static99.anInt2030 > 0) {
			Static348.method2469();
		} else {
			Static155.aClass117_3 = Static129.aClass117_2;
			Static129.aClass117_2 = null;
			Static224.method5495(40);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)V")
	public static void method471() {
		if (Static354.anIntArray519 != null) {
			return;
		}
		Static354.anIntArray519 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(21) int local21 = 0; local21 < 65536; local21++) {
			@Pc(36) double local36 = (double) (local21 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(47) double local47 = (double) (local21 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(54) double local54 = (double) (local21 & 0x7F) / 128.0D;
			@Pc(56) double local56 = local54;
			@Pc(58) double local58 = local54;
			@Pc(60) double local60 = local54;
			if (local47 != 0.0D) {
				@Pc(74) double local74;
				if (local54 < 0.5D) {
					local74 = local54 * (local47 + 1.0D);
				} else {
					local74 = local47 + local54 - local47 * local54;
				}
				@Pc(92) double local92 = local54 * 2.0D - local74;
				@Pc(96) double local96 = local36 + 0.3333333333333333D;
				if (local96 > 1.0D) {
					local96--;
				}
				@Pc(110) double local110 = local36 - 0.3333333333333333D;
				if (local110 < 0.0D) {
					local110++;
				}
				if (local96 * 6.0D < 1.0D) {
					local56 = local92 + local96 * (local74 - local92) * 6.0D;
				} else if (local96 * 2.0D < 1.0D) {
					local56 = local74;
				} else if (local96 * 3.0D < 2.0D) {
					local56 = local92 + (0.6666666666666666D - local96) * 6.0D * (local74 - local92);
				} else {
					local56 = local92;
				}
				if (local36 * 6.0D < 1.0D) {
					local58 = local36 * (local74 - local92) * 6.0D + local92;
				} else if (local36 * 2.0D < 1.0D) {
					local58 = local74;
				} else if (local36 * 3.0D < 2.0D) {
					local58 = (local74 - local92) * 6.0D * (0.6666666666666666D - local36) + local92;
				} else {
					local58 = local92;
				}
				if (local110 * 6.0D < 1.0D) {
					local60 = local92 + (local74 - local92) * 6.0D * local110;
				} else if (local110 * 2.0D < 1.0D) {
					local60 = local74;
				} else if (local110 * 3.0D < 2.0D) {
					local60 = local92 + (local74 - local92) * (-local110 + 0.6666666666666666D) * 6.0D;
				} else {
					local60 = local92;
				}
			}
			local56 = Math.pow(local56, local19);
			local58 = Math.pow(local58, local19);
			local60 = Math.pow(local60, local19);
			@Pc(290) int local290 = (int) (local56 * 256.0D);
			@Pc(295) int local295 = (int) (local58 * 256.0D);
			@Pc(300) int local300 = (int) (local60 * 256.0D);
			@Pc(311) int local311 = (local295 << 8) + ((local290 << 16) + local300);
			Static354.anIntArray519[local21] = local311;
		}
	}
}
