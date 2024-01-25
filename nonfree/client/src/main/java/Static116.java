import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Lclient!bi;")
	public static Class26 aClass26_18;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Lclient!bd;")
	public static Class21 aClass21_4;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "[Lclient!mp;")
	public static Class7_Sub16_Sub1[] aClass7_Sub16_Sub1Array1;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	public static volatile int anInt2643 = 0;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "J")
	public static long aLong91 = 0L;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "[Lclient!mr;")
	public static final Class140[] aClass140Array1 = new Class140[4];

	@OriginalMember(owner = "client!he", name = "i", descriptor = "[I")
	public static final int[] anIntArray350 = new int[14];

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)V")
	public static void method2470(@OriginalArg(0) boolean arg0) {
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static121.aByteArrayArray8;
		} else {
			local9 = Static58.aByteArrayArray6;
		}
		@Pc(16) int local16 = Static75.aByteArrayArray7.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(24) byte[] local24 = local9[local18];
			if (local24 != null) {
				@Pc(37) int local37 = (Static94.anIntArray311[local18] >> 8) * 64 - Static350.anInt6609;
				@Pc(47) int local47 = (Static94.anIntArray311[local18] & 0xFF) * 64 - Static237.anInt4696;
				Static263.method4429();
				Static336.method3727(local24, arg0, local37, local47, Static327.aClass149Array1, Static128.aClass89_3);
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Z")
	public static boolean method2472() {
		return Static96.aBoolean162;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
	public static void method2473() {
		if (Static200.anIntArray548 != null) {
			return;
		}
		Static200.anIntArray548 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < 512; local21++) {
			@Pc(34) float local34 = ((float) (local21 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(43) float local43 = (float) (local21 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(45) int local45 = 0; local45 < 128; local45++) {
				@Pc(51) float local51 = (float) local45 / 128.0F;
				@Pc(53) float local53 = 0.0F;
				@Pc(55) float local55 = 0.0F;
				@Pc(57) float local57 = 0.0F;
				@Pc(61) float local61 = local34 / 60.0F;
				@Pc(64) int local64 = (int) local61;
				@Pc(68) int local68 = local64 % 6;
				@Pc(73) float local73 = local61 - (float) local64;
				@Pc(79) float local79 = local51 * (1.0F - local43);
				@Pc(87) float local87 = (1.0F - local73 * local43) * local51;
				@Pc(99) float local99 = (1.0F - local43 * (1.0F - local73)) * local51;
				if (local68 == 0) {
					local55 = local99;
					local53 = local51;
					local57 = local79;
				} else if (local68 == 1) {
					local57 = local79;
					local53 = local87;
					local55 = local51;
				} else if (local68 == 2) {
					local53 = local79;
					local55 = local51;
					local57 = local99;
				} else if (local68 == 3) {
					local57 = local51;
					local55 = local87;
					local53 = local79;
				} else if (local68 == 4) {
					local55 = local79;
					local53 = local99;
					local57 = local51;
				} else if (local68 == 5) {
					local53 = local51;
					local57 = local87;
					local55 = local79;
				}
				local53 = (float) Math.pow((double) local53, local17);
				local55 = (float) Math.pow((double) local55, local17);
				local57 = (float) Math.pow((double) local57, local17);
				@Pc(185) int local185 = (int) (local53 * 256.0F);
				@Pc(190) int local190 = (int) (local55 * 256.0F);
				@Pc(195) int local195 = (int) (local57 * 256.0F);
				@Pc(207) int local207 = local195 + (local190 << 8) + (local185 << 16) - 16777216;
				Static200.anIntArray548[local19++] = local207;
			}
		}
	}
}
