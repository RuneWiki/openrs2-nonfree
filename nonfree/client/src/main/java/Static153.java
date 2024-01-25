import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!hp", name = "y", descriptor = "I")
	public static int anInt3073;

	@OriginalMember(owner = "client!hp", name = "db", descriptor = "I")
	public static int anInt3087;

	@OriginalMember(owner = "client!hp", name = "eb", descriptor = "Lclient!ph;")
	public static Class180 aClass180_1;

	@OriginalMember(owner = "client!hp", name = "D", descriptor = "Lclient!eh;")
	public static final Class60 aClass60_1 = new Class60(14, 1);

	@OriginalMember(owner = "client!hp", name = "N", descriptor = "Lclient!eh;")
	public static final Class60 aClass60_2 = new Class60(15, 4);

	@OriginalMember(owner = "client!hp", name = "P", descriptor = "Lclient!eh;")
	public static final Class60 aClass60_3 = new Class60(16, -2);

	@OriginalMember(owner = "client!hp", name = "Q", descriptor = "Lclient!eh;")
	public static final Class60 aClass60_4 = new Class60(17, 0);

	@OriginalMember(owner = "client!hp", name = "R", descriptor = "Lclient!eh;")
	public static final Class60 aClass60_5 = new Class60(18, -2);

	@OriginalMember(owner = "client!hp", name = "S", descriptor = "Lclient!eh;")
	public static final Class60 aClass60_6 = new Class60(20, 6);

	@OriginalMember(owner = "client!hp", name = "T", descriptor = "Lclient!eh;")
	public static final Class60 aClass60_7 = new Class60(21, 8);

	@OriginalMember(owner = "client!hp", name = "U", descriptor = "Lclient!eh;")
	public static final Class60 aClass60_8 = new Class60(22, -2);

	@OriginalMember(owner = "client!hp", name = "V", descriptor = "Lclient!eh;")
	public static final Class60 aClass60_9 = new Class60(23, 4);

	@OriginalMember(owner = "client!hp", name = "X", descriptor = "Lclient!eh;")
	public static final Class60 aClass60_10 = new Class60(24, -1);

	@OriginalMember(owner = "client!hp", name = "Z", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_60 = new Class83("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!hp", name = "ab", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_61 = new Class83("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!hp", name = "bb", descriptor = "J")
	public static long aLong107 = 0L;

	@OriginalMember(owner = "client!hp", name = "cb", descriptor = "I")
	public static int anInt3086 = 0;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIIZ)V")
	public static void method2603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(19) long local19 = (long) (arg2 | (arg4 ? Integer.MIN_VALUE : 0));
		@Pc(25) Class4_Sub25 local25 = (Class4_Sub25) Static208.aClass102_11.method2700(local19);
		if (local25 == null) {
			local25 = new Class4_Sub25();
			Static208.aClass102_11.method2703(local19, local25);
		}
		if (local25.anIntArray230.length <= arg0) {
			@Pc(48) int[] local48 = new int[arg0 + 1];
			@Pc(53) int[] local53 = new int[arg0 + 1];
			for (@Pc(55) int local55 = 0; local55 < local25.anIntArray230.length; local55++) {
				local48[local55] = local25.anIntArray230[local55];
				local53[local55] = local25.anIntArray229[local55];
			}
			for (@Pc(81) int local81 = local25.anIntArray230.length; local81 < arg0; local81++) {
				local48[local81] = -1;
				local53[local81] = 0;
			}
			local25.anIntArray230 = local48;
			local25.anIntArray229 = local53;
		}
		local25.anIntArray230[arg0] = arg1;
		local25.anIntArray229[arg0] = arg3;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZC)B")
	public static byte method2605(@OriginalArg(1) char arg0) {
		@Pc(38) byte local38;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local38 = (byte) arg0;
		} else if (arg0 == '€') {
			local38 = -128;
		} else if (arg0 == '‚') {
			local38 = -126;
		} else if (arg0 == 'ƒ') {
			local38 = -125;
		} else if (arg0 == '„') {
			local38 = -124;
		} else if (arg0 == '…') {
			local38 = -123;
		} else if (arg0 == '†') {
			local38 = -122;
		} else if (arg0 == '‡') {
			local38 = -121;
		} else if (arg0 == 'ˆ') {
			local38 = -120;
		} else if (arg0 == '‰') {
			local38 = -119;
		} else if (arg0 == 'Š') {
			local38 = -118;
		} else if (arg0 == '‹') {
			local38 = -117;
		} else if (arg0 == 'Œ') {
			local38 = -116;
		} else if (arg0 == 'Ž') {
			local38 = -114;
		} else if (arg0 == '‘') {
			local38 = -111;
		} else if (arg0 == '’') {
			local38 = -110;
		} else if (arg0 == '“') {
			local38 = -109;
		} else if (arg0 == '”') {
			local38 = -108;
		} else if (arg0 == '•') {
			local38 = -107;
		} else if (arg0 == '–') {
			local38 = -106;
		} else if (arg0 == '—') {
			local38 = -105;
		} else if (arg0 == '˜') {
			local38 = -104;
		} else if (arg0 == '™') {
			local38 = -103;
		} else if (arg0 == 'š') {
			local38 = -102;
		} else if (arg0 == '›') {
			local38 = -101;
		} else if (arg0 == 'œ') {
			local38 = -100;
		} else if (arg0 == 'ž') {
			local38 = -98;
		} else if (arg0 == 'Ÿ') {
			local38 = -97;
		} else {
			local38 = 63;
		}
		return local38;
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)J")
	public static long method2607() {
		return Static63.aClass36_1.method2252();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)V")
	public static void method2610(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static24.anInt5323 - Static294.anInt446;
		if (local7 >= 100) {
			Static111.anInt2386 = 1;
			return;
		}
		@Pc(16) int local16 = (int) Static164.aFloat142;
		if (Static149.anInt3012 >> 8 > local16) {
			local16 = Static149.anInt3012 >> 8;
		}
		if (Static342.aBooleanArray17[4] && Static41.anIntArray46[4] + 128 > local16) {
			local16 = Static41.anIntArray46[4] + 128;
		}
		@Pc(53) int local53 = Static273.anInt5119 + (int) Static368.aFloat192 & 0x3FFF;
		Static195.method3072(Static394.anInt6578, (local16 >> 3) * 3 + 600 << 0, Static325.anInt5636, local53, Static13.method135(Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893, Static263.anInt4963, Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892) - 50, arg0, local16);
		@Pc(98) float local98 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static145.anInt2906 = (int) (local98 * (float) (Static145.anInt2906 - Static59.anInt1090) + (float) Static59.anInt1090);
		Static100.anInt2024 = (int) ((float) Static105.anInt2321 + (float) (Static100.anInt2024 - Static105.anInt2321) * local98);
		Static431.anInt7074 = (int) ((float) Static204.anInt3896 + (float) (Static431.anInt7074 - Static204.anInt3896) * local98);
		Static163.anInt3197 = (int) ((float) (Static163.anInt3197 - Static124.anInt2626) * local98 + (float) Static124.anInt2626);
		@Pc(155) int local155 = Static136.anInt2790 - Static179.anInt3427;
		if (local155 > 8192) {
			local155 -= 16384;
		} else if (local155 < -8192) {
			local155 += 16384;
		}
		Static136.anInt2790 = (int) ((float) Static179.anInt3427 + (float) local155 * local98);
		Static136.anInt2790 &= 0x3FFF;
	}
}
