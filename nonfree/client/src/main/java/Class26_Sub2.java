import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class26_Sub2 extends Class26 {

	@OriginalMember(owner = "client!i", name = "r", descriptor = "I")
	private int anInt4366;

	@OriginalMember(owner = "client!i", name = "B", descriptor = "I")
	private int anInt4371;

	@OriginalMember(owner = "client!i", name = "C", descriptor = "Lclient!rg;")
	private Class261 aClass261_1;

	@OriginalMember(owner = "client!i", name = "J", descriptor = "I")
	private int anInt4376;

	@OriginalMember(owner = "client!i", name = "K", descriptor = "I")
	private int anInt4377;

	@OriginalMember(owner = "client!i", name = "ab", descriptor = "Lclient!rg;")
	private Class261 aClass261_2;

	@OriginalMember(owner = "client!i", name = "hb", descriptor = "Z")
	private boolean aBoolean348;

	@OriginalMember(owner = "client!i", name = "ib", descriptor = "I")
	private int anInt4390;

	@OriginalMember(owner = "client!i", name = "lb", descriptor = "Lclient!rg;")
	private Class261 lb;

	@OriginalMember(owner = "client!i", name = "nb", descriptor = "Lclient!cb;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!i", name = "qb", descriptor = "Lclient!wr;")
	private final Class42_Sub1 aClass42_Sub1_9;

	@OriginalMember(owner = "client!i", name = "rb", descriptor = "I")
	private int anInt4395;

	@OriginalMember(owner = "client!i", name = "wb", descriptor = "Z")
	private boolean aBoolean349;

	@OriginalMember(owner = "client!i", name = "yb", descriptor = "I")
	private int anInt4400;

	@OriginalMember(owner = "client!i", name = "Hb", descriptor = "I")
	private int anInt4407;

	@OriginalMember(owner = "client!i", name = "Ib", descriptor = "I")
	private int anInt4408;

	@OriginalMember(owner = "client!i", name = "Jb", descriptor = "Lclient!rg;")
	private Class261 aClass261_3;

	@OriginalMember(owner = "client!i", name = "Xb", descriptor = "I")
	private int anInt4415;

	@OriginalMember(owner = "client!i", name = "jc", descriptor = "Lclient!eh;")
	private Class87 aClass87_1;

	@OriginalMember(owner = "client!i", name = "rc", descriptor = "Z")
	private boolean aBoolean350;

	@OriginalMember(owner = "client!i", name = "E", descriptor = "[I")
	private int[] anIntArray325;

	@OriginalMember(owner = "client!i", name = "dc", descriptor = "I")
	private int anInt4418;

	@OriginalMember(owner = "client!i", name = "Kb", descriptor = "I")
	private int anInt4409;

	@OriginalMember(owner = "client!i", name = "vb", descriptor = "I")
	private int anInt4398;

	@OriginalMember(owner = "client!i", name = "tc", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!i", name = "Eb", descriptor = "I")
	private int anInt4405;

	@OriginalMember(owner = "client!i", name = "bc", descriptor = "[I")
	private int[] anIntArray329;

	@OriginalMember(owner = "client!i", name = "lc", descriptor = "[I")
	private int[] anIntArray330;

	@OriginalMember(owner = "client!i", name = "tb", descriptor = "[I")
	private int[] anIntArray326;

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "[Lclient!rn;")
	private Class265[] aClass265Array4;

	@OriginalMember(owner = "client!i", name = "t", descriptor = "[Lclient!ig;")
	private Class142[] aClass142Array4;

	@OriginalMember(owner = "client!i", name = "kc", descriptor = "I")
	private int anInt4424;

	@OriginalMember(owner = "client!i", name = "x", descriptor = "[Lclient!rm;")
	private Class264[] aClass264Array1;

	@OriginalMember(owner = "client!i", name = "Wb", descriptor = "[Lclient!iv;")
	private Class151[] aClass151Array1;

	@OriginalMember(owner = "client!i", name = "oc", descriptor = "[B")
	private byte[] aByteArray51;

	@OriginalMember(owner = "client!i", name = "cc", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!i", name = "Pb", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "[F")
	private float[] aFloatArray37;

	@OriginalMember(owner = "client!i", name = "db", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!i", name = "gb", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!i", name = "Lb", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!i", name = "Sb", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!i", name = "w", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!i", name = "U", descriptor = "S")
	private short aShort64;

	@OriginalMember(owner = "client!i", name = "D", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!i", name = "Y", descriptor = "[F")
	private float[] aFloatArray38;

	@OriginalMember(owner = "client!i", name = "Fb", descriptor = "[B")
	private byte[] aByteArray50;

	@OriginalMember(owner = "client!i", name = "pb", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!i", name = "Rb", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!i", name = "R", descriptor = "S")
	private short aShort63;

	@OriginalMember(owner = "client!i", name = "L", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!i", name = "pc", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!i", name = "Mb", descriptor = "[I")
	private int[] anIntArray328;

	@OriginalMember(owner = "client!i", name = "zb", descriptor = "[I")
	private int[] anIntArray327;

	@OriginalMember(owner = "client!i", name = "z", descriptor = "[I")
	private int[] anIntArray324;

	@OriginalMember(owner = "client!i", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!i", name = "Ub", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!i", name = "Yb", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!wr;Lclient!ln;IIII)V")
	public Class26_Sub2(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface11 local11 = arg0.anInterface11_11;
		this.anIntArray325 = new int[arg1.anInt5546 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt5556];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt5556; local24++) {
			if ((arg1.aByteArray65 == null || arg1.aByteArray65[local24] != 2) && (arg1.aShortArray80 == null || arg1.aShortArray80[local24] == -1 || !local11.method6215(arg1.aShortArray80[local24] & 0xFFFF).aBoolean573)) {
				local22[this.anInt4418++] = local24;
				this.anIntArray325[arg1.aShortArray84[local24]]++;
				this.anIntArray325[arg1.aShortArray86[local24]]++;
				this.anIntArray325[arg1.aShortArray82[local24]]++;
			}
		}
		this.anInt4409 = this.anInt4418;
		@Pc(115) long[] local115 = new long[this.anInt4418];
		@Pc(124) boolean local124 = (this.anInt4400 & 0x100) != 0;
		@Pc(136) int local136;
		@Pc(147) int local147;
		@Pc(270) int local270;
		label498: for (@Pc(126) int local126 = 0; local126 < this.anInt4418; local126++) {
			@Pc(132) int local132 = local22[local126];
			@Pc(134) Class278 local134 = null;
			local136 = 0;
			@Pc(138) byte local138 = 0;
			@Pc(140) byte local140 = 0;
			@Pc(142) byte local142 = 0;
			if (arg1.aClass2Array1 != null) {
				for (local147 = 0; local147 < arg1.aClass2Array1.length; local147++) {
					@Pc(154) Class2 local154 = arg1.aClass2Array1[local147];
					if (local154.anInt52 == local132) {
						@Pc(167) Class271 local167 = Static267.method4553(local154.anInt56);
						if (local167.aBoolean555) {
							local115[local126] = Long.MAX_VALUE;
							this.anInt4409--;
							continue label498;
						}
					}
				}
			}
			@Pc(190) short local190 = -1;
			if (arg1.aShortArray80 != null) {
				local190 = arg1.aShortArray80[local132];
				if (local190 != -1) {
					local134 = local11.method6215(local190 & 0xFFFF);
					local142 = local134.aByte83;
					local140 = local134.aByte87;
				}
			}
			@Pc(232) boolean local232 = arg1.aByteArray62 != null && arg1.aByteArray62[local132] != 0 || local134 != null && !local134.aBoolean571;
			if ((local124 || local232) && arg1.aByteArray66 != null) {
				local136 += arg1.aByteArray66[local132] << 17;
			}
			if (local232) {
				local136 += 65536;
			}
			local136 += (local140 & 0xFF) << 8;
			local270 = local138 + ((local190 & 0xFFFF) << 16);
			local136 += local142 & 0xFF;
			@Pc(282) int local282 = local270 + (local126 & 0xFFFF);
			local115[local126] = ((long) local136 << 32) + (long) local282;
		}
		Static218.method4015(local22, local115);
		this.anInt4398 = arg1.anInt5546;
		this.aShortArray73 = arg1.aShortArray77;
		this.anInt4405 = arg1.anInt5543;
		this.anIntArray329 = arg1.anIntArray394;
		this.anIntArray330 = arg1.anIntArray386;
		this.anIntArray326 = arg1.anIntArray387;
		@Pc(329) Class127[] local329 = new Class127[this.anInt4398];
		this.aClass265Array4 = arg1.aClass265Array5;
		this.aClass142Array4 = arg1.aClass142Array5;
		@Pc(357) int local357;
		@Pc(371) int local371;
		if (arg1.aClass2Array1 != null) {
			this.anInt4424 = arg1.aClass2Array1.length;
			this.aClass264Array1 = new Class264[this.anInt4424];
			this.aClass151Array1 = new Class151[this.anInt4424];
			for (local357 = 0; local357 < this.anInt4424; local357++) {
				@Pc(364) Class2 local364 = arg1.aClass2Array1[local357];
				@Pc(369) Class271 local369 = Static267.method4553(local364.anInt56);
				local371 = -1;
				for (@Pc(373) int local373 = 0; local373 < this.anInt4418; local373++) {
					if (local364.anInt52 == local22[local373]) {
						local371 = local373;
						break;
					}
				}
				if (local371 == -1) {
					throw new RuntimeException();
				}
				local147 = Static141.anIntArray234[arg1.aShortArray85[local364.anInt52] & 0xFFFF] & 0xFFFFFF;
				local147 |= 255 - (arg1.aByteArray62 == null ? 0 : arg1.aByteArray62[local364.anInt52]) << 24;
				this.aClass151Array1[local357] = new Class151(local371, arg1.aShortArray84[local364.anInt52], arg1.aShortArray86[local364.anInt52], arg1.aShortArray82[local364.anInt52], local369.anInt8113, local369.anInt8111, local369.anInt8107, local369.anInt8109, local369.anInt8112, local369.aBoolean555, local369.aBoolean556, local364.anInt51);
				this.aClass264Array1[local357] = new Class264(local147);
			}
		}
		local357 = this.anInt4418 * 3;
		this.aByteArray51 = new byte[local357];
		this.aShortArray71 = new short[this.anInt4418];
		if (arg1.aShortArray79 != null) {
			this.aShortArray68 = new short[this.anInt4418];
		}
		this.aFloatArray37 = new float[local357];
		this.aShortArray64 = new short[this.anInt4418];
		this.aShortArray65 = new short[local357];
		this.aShortArray67 = new short[local357];
		this.aShortArray70 = new short[this.anInt4418];
		this.aShortArray61 = new short[this.anInt4418];
		this.aShort64 = (short) arg4;
		this.aShortArray62 = new short[local357];
		this.aFloatArray38 = new float[local357];
		this.aByteArray50 = new byte[this.anInt4418];
		this.aShortArray66 = new short[this.anInt4418];
		this.aShortArray69 = new short[local357];
		this.aShort63 = (short) arg3;
		Static289.aLongArray10 = new long[local357];
		this.aShortArray63 = new short[local357];
		this.aShortArray72 = new short[local357];
		local136 = 0;
		for (local270 = 0; local270 < arg1.anInt5546; local270++) {
			local371 = this.anIntArray325[local270];
			this.anIntArray325[local270] = local136;
			local329[local270] = new Class127();
			local136 += local371;
		}
		this.anIntArray325[arg1.anInt5546] = local136;
		@Pc(620) int[] local620 = null;
		@Pc(622) int[] local622 = null;
		@Pc(624) int[] local624 = null;
		@Pc(626) float[][] local626 = null;
		@Pc(644) int[] local644;
		@Pc(652) int local652;
		@Pc(697) int local697;
		@Pc(703) int local703;
		@Pc(716) int local716;
		@Pc(718) int local718;
		@Pc(749) int local749;
		@Pc(754) int local754;
		@Pc(921) float local921;
		@Pc(913) float local913;
		@Pc(929) float local929;
		if (arg1.aByteArray63 != null) {
			@Pc(632) int local632 = arg1.anInt5557;
			@Pc(635) int[] local635 = new int[local632];
			@Pc(638) int[] local638 = new int[local632];
			@Pc(641) int[] local641 = new int[local632];
			local644 = new int[local632];
			@Pc(647) int[] local647 = new int[local632];
			@Pc(650) int[] local650 = new int[local632];
			for (local652 = 0; local652 < local632; local652++) {
				local635[local652] = Integer.MAX_VALUE;
				local638[local652] = -2147483647;
				local641[local652] = Integer.MAX_VALUE;
				local644[local652] = -2147483647;
				local647[local652] = Integer.MAX_VALUE;
				local650[local652] = -2147483647;
			}
			local624 = new int[local632];
			local626 = new float[local632][];
			local620 = new int[local632];
			for (local697 = 0; local697 < this.anInt4418; local697++) {
				local703 = local22[local697];
				if (arg1.aByteArray63[local703] != -1) {
					local716 = arg1.aByteArray63[local703] & 0xFF;
					for (local718 = 0; local718 < 3; local718++) {
						@Pc(730) short local730;
						if (local718 == 0) {
							local730 = arg1.aShortArray84[local703];
						} else if (local718 == 1) {
							local730 = arg1.aShortArray86[local703];
						} else {
							local730 = arg1.aShortArray82[local703];
						}
						local749 = arg1.anIntArray386[local730];
						local754 = arg1.anIntArray394[local730];
						@Pc(759) int local759 = arg1.anIntArray387[local730];
						if (local635[local716] > local749) {
							local635[local716] = local749;
						}
						if (local638[local716] < local749) {
							local638[local716] = local749;
						}
						if (local641[local716] > local754) {
							local641[local716] = local754;
						}
						if (local754 > local644[local716]) {
							local644[local716] = local754;
						}
						if (local759 < local647[local716]) {
							local647[local716] = local759;
						}
						if (local650[local716] < local759) {
							local650[local716] = local759;
						}
					}
				}
			}
			local622 = new int[local632];
			for (local703 = 0; local703 < local632; local703++) {
				@Pc(854) byte local854 = arg1.aByteArray68[local703];
				if (local854 > 0) {
					local620[local703] = (local638[local703] + local635[local703]) / 2;
					local622[local703] = (local644[local703] + local641[local703]) / 2;
					local624[local703] = (local650[local703] + local647[local703]) / 2;
					if (local854 == 1) {
						local754 = arg1.anIntArray392[local703];
						local913 = 64.0F / (float) arg1.anIntArray385[local703];
						if (local754 == 0) {
							local929 = 1.0F;
							local921 = 1.0F;
						} else if (local754 <= 0) {
							local921 = (float) -local754 / 1024.0F;
							local929 = 1.0F;
						} else {
							local929 = (float) local754 / 1024.0F;
							local921 = 1.0F;
						}
					} else if (local854 == 2) {
						local913 = 64.0F / (float) arg1.anIntArray385[local703];
						local921 = 64.0F / (float) arg1.anIntArray392[local703];
						local929 = 64.0F / (float) arg1.anIntArray393[local703];
					} else {
						local921 = (float) arg1.anIntArray392[local703] / 1024.0F;
						local929 = (float) arg1.anIntArray393[local703] / 1024.0F;
						local913 = (float) arg1.anIntArray385[local703] / 1024.0F;
					}
					local626[local703] = Static426.method5116(arg1.aByteArray67[local703] & 0xFF, local929, local921, arg1.aShortArray81[local703], arg1.aShortArray78[local703], arg1.aShortArray83[local703], local913);
				}
			}
		}
		@Pc(1034) Class20[] local1034 = new Class20[arg1.anInt5556];
		@Pc(1053) short local1053;
		@Pc(1064) int local1064;
		@Pc(1075) int local1075;
		for (@Pc(1036) int local1036 = 0; local1036 < arg1.anInt5556; local1036++) {
			@Pc(1043) short local1043 = arg1.aShortArray84[local1036];
			@Pc(1048) short local1048 = arg1.aShortArray86[local1036];
			local1053 = arg1.aShortArray82[local1036];
			local1064 = this.anIntArray330[local1048] - this.anIntArray330[local1043];
			local1075 = this.anIntArray329[local1048] - this.anIntArray329[local1043];
			local652 = this.anIntArray326[local1048] - this.anIntArray326[local1043];
			local697 = this.anIntArray330[local1053] - this.anIntArray330[local1043];
			local703 = this.anIntArray329[local1053] - this.anIntArray329[local1043];
			local716 = this.anIntArray326[local1053] - this.anIntArray326[local1043];
			local718 = local716 * local1075 - local652 * local703;
			@Pc(1135) int local1135 = local697 * local652 - local716 * local1064;
			local749 = local1064 * local703 - local697 * local1075;
			while (local718 > 8192 || local1135 > 8192 || local749 > 8192 || local718 < -8192 || local1135 < -8192 || local749 < -8192) {
				local1135 >>= 0x1;
				local749 >>= 0x1;
				local718 >>= 0x1;
			}
			local754 = (int) Math.sqrt((double) (local1135 * local1135 + local718 * local718 + local749 * local749));
			if (local754 <= 0) {
				local754 = 1;
			}
			local1135 = local1135 * 256 / local754;
			local718 = local718 * 256 / local754;
			local749 = local749 * 256 / local754;
			@Pc(1232) byte local1232 = arg1.aByteArray65 == null ? 0 : arg1.aByteArray65[local1036];
			if (local1232 == 0) {
				@Pc(1241) Class127 local1241 = local329[local1043];
				local1241.anInt3984 += local1135;
				local1241.anInt3982 += local718;
				local1241.anInt3988++;
				local1241.anInt3986 += local749;
				@Pc(1269) Class127 local1269 = local329[local1048];
				local1269.anInt3986 += local749;
				local1269.anInt3988++;
				local1269.anInt3984 += local1135;
				local1269.anInt3982 += local718;
				@Pc(1297) Class127 local1297 = local329[local1053];
				local1297.anInt3982 += local718;
				local1297.anInt3984 += local1135;
				local1297.anInt3988++;
				local1297.anInt3986 += local749;
			} else if (local1232 == 1) {
				@Pc(1334) Class20 local1334 = local1034[local1036] = new Class20();
				local1334.anInt393 = local749;
				local1334.anInt391 = local1135;
				local1334.anInt389 = local718;
			}
		}
		@Pc(1360) int local1360;
		for (@Pc(1354) int local1354 = 0; local1354 < this.anInt4418; local1354++) {
			local1360 = local22[local1354];
			@Pc(1367) int local1367 = arg1.aShortArray85[local1360] & 0xFFFF;
			@Pc(1375) short local1375;
			if (arg1.aShortArray80 == null) {
				local1375 = -1;
			} else {
				local1375 = arg1.aShortArray80[local1360];
			}
			if (arg1.aByteArray63 == null) {
				local1075 = -1;
			} else {
				local1075 = arg1.aByteArray63[local1360];
			}
			if (arg1.aByteArray62 == null) {
				local652 = 0;
			} else {
				local652 = arg1.aByteArray62[local1360] & 0xFF;
			}
			@Pc(1407) float local1407 = 0.0F;
			@Pc(1409) float local1409 = 0.0F;
			@Pc(1411) float local1411 = 0.0F;
			local921 = 0.0F;
			local913 = 0.0F;
			local929 = 0.0F;
			@Pc(1419) byte local1419 = 0;
			@Pc(1421) byte local1421 = 0;
			@Pc(1423) int local1423 = 0;
			@Pc(1458) byte local1458;
			@Pc(1475) short local1475;
			@Pc(1480) short local1480;
			@Pc(1485) short local1485;
			if (local1375 != -1) {
				if (local1075 == -1) {
					local913 = 0.0F;
					local1419 = 1;
					local1421 = 2;
					local1407 = 0.0F;
					local929 = 0.0F;
					local1411 = 1.0F;
					local921 = 1.0F;
					local1409 = 1.0F;
				} else {
					local1075 &= 0xFF;
					local1458 = arg1.aByteArray68[local1075];
					@Pc(1465) short local1465;
					@Pc(1470) short local1470;
					@Pc(1508) float local1508;
					@Pc(1517) float local1517;
					@Pc(1526) float local1526;
					@Pc(1613) float local1613;
					@Pc(1621) float local1621;
					@Pc(1629) float local1629;
					@Pc(1638) float local1638;
					@Pc(1646) float local1646;
					@Pc(1654) float local1654;
					if (local1458 == 0) {
						local1465 = arg1.aShortArray84[local1360];
						local1470 = arg1.aShortArray86[local1360];
						local1475 = arg1.aShortArray82[local1360];
						local1480 = arg1.aShortArray78[local1075];
						local1485 = arg1.aShortArray83[local1075];
						@Pc(1490) short local1490 = arg1.aShortArray81[local1075];
						@Pc(1496) float local1496 = (float) arg1.anIntArray386[local1480];
						@Pc(1502) float local1502 = (float) arg1.anIntArray394[local1480];
						local1508 = arg1.anIntArray387[local1480];
						local1517 = (float) arg1.anIntArray386[local1485] - local1496;
						local1526 = (float) arg1.anIntArray394[local1485] - local1502;
						@Pc(1535) float local1535 = (float) arg1.anIntArray387[local1485] - local1508;
						@Pc(1544) float local1544 = (float) arg1.anIntArray386[local1490] - local1496;
						@Pc(1553) float local1553 = (float) arg1.anIntArray394[local1490] - local1502;
						@Pc(1562) float local1562 = (float) arg1.anIntArray387[local1490] - local1508;
						@Pc(1570) float local1570 = (float) arg1.anIntArray386[local1465] - local1496;
						@Pc(1579) float local1579 = (float) arg1.anIntArray394[local1465] - local1502;
						@Pc(1587) float local1587 = (float) arg1.anIntArray387[local1465] - local1508;
						@Pc(1596) float local1596 = (float) arg1.anIntArray386[local1470] - local1496;
						@Pc(1604) float local1604 = (float) arg1.anIntArray394[local1470] - local1502;
						local1613 = (float) arg1.anIntArray387[local1470] - local1508;
						local1621 = (float) arg1.anIntArray386[local1475] - local1496;
						local1629 = (float) arg1.anIntArray394[local1475] - local1502;
						local1638 = (float) arg1.anIntArray387[local1475] - local1508;
						local1646 = local1562 * local1526 - local1553 * local1535;
						local1654 = local1544 * local1535 - local1517 * local1562;
						@Pc(1662) float local1662 = local1553 * local1517 - local1526 * local1544;
						@Pc(1670) float local1670 = local1662 * local1553 - local1654 * local1562;
						@Pc(1678) float local1678 = local1562 * local1646 - local1662 * local1544;
						@Pc(1687) float local1687 = local1654 * local1544 - local1553 * local1646;
						@Pc(1701) float local1701 = 1.0F / (local1526 * local1678 + local1517 * local1670 + local1687 * local1535);
						local913 = local1701 * (local1670 * local1621 + local1678 * local1629 + local1638 * local1687);
						local1407 = (local1570 * local1670 + local1678 * local1579 + local1687 * local1587) * local1701;
						local1411 = (local1687 * local1613 + local1670 * local1596 + local1604 * local1678) * local1701;
						@Pc(1752) float local1752 = local1535 * local1646 - local1517 * local1662;
						@Pc(1761) float local1761 = local1526 * local1662 - local1535 * local1654;
						@Pc(1770) float local1770 = local1654 * local1517 - local1646 * local1526;
						@Pc(1784) float local1784 = 1.0F / (local1770 * local1562 + local1553 * local1752 + local1761 * local1544);
						local921 = local1784 * (local1752 * local1604 + local1761 * local1596 + local1613 * local1770);
						local1409 = (local1770 * local1587 + local1579 * local1752 + local1761 * local1570) * local1784;
						local929 = local1784 * (local1770 * local1638 + local1629 * local1752 + local1621 * local1761);
					} else {
						local1465 = arg1.aShortArray84[local1360];
						local1470 = arg1.aShortArray86[local1360];
						local1475 = arg1.aShortArray82[local1360];
						@Pc(1847) int local1847 = local620[local1075];
						@Pc(1851) int local1851 = local622[local1075];
						@Pc(1855) int local1855 = local624[local1075];
						@Pc(1859) float[] local1859 = local626[local1075];
						@Pc(1864) byte local1864 = arg1.aByteArray69[local1075];
						local1508 = (float) arg1.anIntArray395[local1075] / 256.0F;
						if (local1458 == 1) {
							local1517 = (float) arg1.anIntArray393[local1075] / 1024.0F;
							Static234.method4142(arg1.anIntArray387[local1465], local1859, arg1.anIntArray394[local1465], local1517, local1508, local1855, arg1.anIntArray386[local1465], local1851, local1847, local1864);
							local1409 = Static541.aFloat197;
							local1407 = Static330.aFloat128;
							Static234.method4142(arg1.anIntArray387[local1470], local1859, arg1.anIntArray394[local1470], local1517, local1508, local1855, arg1.anIntArray386[local1470], local1851, local1847, local1864);
							local921 = Static541.aFloat197;
							local1411 = Static330.aFloat128;
							Static234.method4142(arg1.anIntArray387[local1475], local1859, arg1.anIntArray394[local1475], local1517, local1508, local1855, arg1.anIntArray386[local1475], local1851, local1847, local1864);
							local929 = Static541.aFloat197;
							local913 = Static330.aFloat128;
							local1526 = local1517 / 2.0F;
							if ((local1864 & 0x1) == 0) {
								if (local1526 < local913 - local1407) {
									local913 -= local1517;
									local1421 = 1;
								} else if (local1407 - local913 > local1526) {
									local1421 = 2;
									local913 += local1517;
								}
								if (local1411 - local1407 > local1526) {
									local1419 = 1;
									local1411 -= local1517;
								} else if (local1407 - local1411 > local1526) {
									local1411 += local1517;
									local1419 = 2;
								}
							} else {
								if (local1526 < local921 - local1409) {
									local921 -= local1517;
									local1419 = 1;
								} else if (local1409 - local921 > local1526) {
									local1419 = 2;
									local921 += local1517;
								}
								if (local1526 < local929 - local1409) {
									local1421 = 1;
									local929 -= local1517;
								} else if (local1526 < local1409 - local929) {
									local929 += local1517;
									local1421 = 2;
								}
							}
						} else if (local1458 == 2) {
							local1517 = (float) arg1.anIntArray389[local1075] / 256.0F;
							local1526 = (float) arg1.anIntArray391[local1075] / 256.0F;
							@Pc(2112) int local2112 = arg1.anIntArray386[local1470] - arg1.anIntArray386[local1465];
							@Pc(2123) int local2123 = arg1.anIntArray394[local1470] - arg1.anIntArray394[local1465];
							@Pc(2134) int local2134 = arg1.anIntArray387[local1470] - arg1.anIntArray387[local1465];
							@Pc(2145) int local2145 = arg1.anIntArray386[local1475] - arg1.anIntArray386[local1465];
							@Pc(2156) int local2156 = arg1.anIntArray394[local1475] - arg1.anIntArray394[local1465];
							@Pc(2167) int local2167 = arg1.anIntArray387[local1475] - arg1.anIntArray387[local1465];
							@Pc(2175) int local2175 = local2167 * local2123 - local2134 * local2156;
							@Pc(2183) int local2183 = local2145 * local2134 - local2167 * local2112;
							@Pc(2192) int local2192 = local2112 * local2156 - local2145 * local2123;
							local1613 = 64.0F / (float) arg1.anIntArray392[local1075];
							local1621 = 64.0F / (float) arg1.anIntArray385[local1075];
							local1629 = 64.0F / (float) arg1.anIntArray393[local1075];
							local1638 = ((float) local2183 * local1859[1] + local1859[0] * (float) local2175 + (float) local2192 * local1859[2]) / local1613;
							local1646 = (local1859[5] * (float) local2192 + local1859[3] * (float) local2175 + local1859[4] * (float) local2183) / local1621;
							local1654 = (local1859[6] * (float) local2175 + (float) local2183 * local1859[7] + local1859[8] * (float) local2192) / local1629;
							local1423 = Static397.method6237(local1654, local1638, local1646);
							Static99.method2092(local1855, arg1.anIntArray387[local1465], local1859, local1864, local1423, local1851, local1526, arg1.anIntArray394[local1465], arg1.anIntArray386[local1465], local1847, local1517, local1508);
							local1409 = Static532.aFloat196;
							local1407 = Static447.aFloat181;
							Static99.method2092(local1855, arg1.anIntArray387[local1470], local1859, local1864, local1423, local1851, local1526, arg1.anIntArray394[local1470], arg1.anIntArray386[local1470], local1847, local1517, local1508);
							local1411 = Static447.aFloat181;
							local921 = Static532.aFloat196;
							Static99.method2092(local1855, arg1.anIntArray387[local1475], local1859, local1864, local1423, local1851, local1526, arg1.anIntArray394[local1475], arg1.anIntArray386[local1475], local1847, local1517, local1508);
							local913 = Static447.aFloat181;
							local929 = Static532.aFloat196;
						} else if (local1458 == 3) {
							Static145.method2870(local1864, arg1.anIntArray394[local1465], local1847, arg1.anIntArray386[local1465], local1851, local1508, local1859, local1855, arg1.anIntArray387[local1465]);
							local1409 = Static96.aFloat57;
							local1407 = Static42.aFloat8;
							Static145.method2870(local1864, arg1.anIntArray394[local1470], local1847, arg1.anIntArray386[local1470], local1851, local1508, local1859, local1855, arg1.anIntArray387[local1470]);
							local1411 = Static42.aFloat8;
							local921 = Static96.aFloat57;
							Static145.method2870(local1864, arg1.anIntArray394[local1475], local1847, arg1.anIntArray386[local1475], local1851, local1508, local1859, local1855, arg1.anIntArray387[local1475]);
							local913 = Static42.aFloat8;
							local929 = Static96.aFloat57;
							if ((local1864 & 0x1) == 0) {
								if (local1411 - local1407 > 0.5F) {
									local1411--;
									local1419 = 1;
								} else if (local1407 - local1411 > 0.5F) {
									local1411++;
									local1419 = 2;
								}
								if (local913 - local1407 > 0.5F) {
									local1421 = 1;
									local913--;
								} else if (local1407 - local913 > 0.5F) {
									local913++;
									local1421 = 2;
								}
							} else {
								if (local929 - local1409 > 0.5F) {
									local1421 = 1;
									local929--;
								} else if (local1409 - local929 > 0.5F) {
									local929++;
									local1421 = 2;
								}
								if (local921 - local1409 > 0.5F) {
									local921--;
									local1419 = 1;
								} else if (local1409 - local921 > 0.5F) {
									local1419 = 2;
									local921++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray65 == null) {
				local1458 = 0;
			} else {
				local1458 = arg1.aByteArray65[local1360];
			}
			if (local1458 == 0) {
				@Pc(2603) long local2603 = (long) (local1075 << 2) + ((long) (local1367 << 8) + (long) (local1423 << 24) + (long) local652 << 32);
				local1475 = arg1.aShortArray84[local1360];
				local1480 = arg1.aShortArray86[local1360];
				local1485 = arg1.aShortArray82[local1360];
				@Pc(2622) Class127 local2622 = local329[local1475];
				this.aShortArray71[local1354] = this.method3733(local1475, local2622.anInt3982, local2622.anInt3988, local1407, local2622.anInt3986, local1409, local1354, local2603, local2622.anInt3984, arg1);
				@Pc(2647) Class127 local2647 = local329[local1480];
				this.aShortArray64[local1354] = this.method3733(local1480, local2647.anInt3982, local2647.anInt3988, local1411, local2647.anInt3986, local921, local1354, (long) local1419 + local2603, local2647.anInt3984, arg1);
				@Pc(2675) Class127 local2675 = local329[local1485];
				this.aShortArray61[local1354] = this.method3733(local1485, local2675.anInt3982, local2675.anInt3988, local913, local2675.anInt3986, local929, local1354, (long) local1421 + local2603, local2675.anInt3984, arg1);
			} else if (local1458 == 1) {
				@Pc(2710) Class20 local2710 = local1034[local1360];
				@Pc(2755) long local2755 = (long) ((local2710.anInt393 + 256 << 22) + (local2710.anInt391 + 256 << 12) + (local1075 << 2) + (local2710.anInt389 > 0 ? 1024 : 2048)) + ((long) local652 + (long) (local1367 << 8) + (long) (local1423 << 24) << 32);
				this.aShortArray71[local1354] = this.method3733(arg1.aShortArray84[local1360], local2710.anInt389, 0, local1407, local2710.anInt393, local1409, local1354, local2755, local2710.anInt391, arg1);
				this.aShortArray64[local1354] = this.method3733(arg1.aShortArray86[local1360], local2710.anInt389, 0, local1411, local2710.anInt393, local921, local1354, local2755 + (long) local1419, local2710.anInt391, arg1);
				this.aShortArray61[local1354] = this.method3733(arg1.aShortArray82[local1360], local2710.anInt389, 0, local913, local2710.anInt393, local929, local1354, (long) local1421 + local2755, local2710.anInt391, arg1);
			}
			if (arg1.aShortArray80 == null) {
				this.aShortArray70[local1354] = -1;
			} else {
				this.aShortArray70[local1354] = arg1.aShortArray80[local1360];
			}
			if (arg1.aByteArray62 != null) {
				this.aByteArray50[local1354] = arg1.aByteArray62[local1360];
			}
			if (arg1.aShortArray79 != null) {
				this.aShortArray68[local1354] = arg1.aShortArray79[local1360];
			}
			this.aShortArray66[local1354] = arg1.aShortArray85[local1360];
		}
		if (this.anInt4409 > 0) {
			local1360 = 1;
			local1053 = this.aShortArray70[0];
			for (local1064 = 0; local1064 < this.anInt4409; local1064++) {
				@Pc(2906) short local2906 = this.aShortArray70[local1064];
				if (local2906 != local1053) {
					local1360++;
					local1053 = local2906;
				}
			}
			this.anIntArray328 = new int[local1360 + 1];
			this.anIntArray327 = new int[local1360];
			this.anIntArray324 = new int[local1360];
			this.anIntArray328[0] = 0;
			local1075 = this.anInt4395;
			local1360 = 0;
			@Pc(2947) short local2947 = 0;
			local1053 = this.aShortArray70[0];
			for (local697 = 0; local697 < this.anInt4409; local697++) {
				@Pc(2961) short local2961 = this.aShortArray70[local697];
				if (local2961 != local1053) {
					this.anIntArray327[local1360] = local1075;
					this.anIntArray324[local1360] = local2947 + 1 - local1075;
					local1360++;
					this.anIntArray328[local1360] = local697;
					local1075 = this.anInt4395;
					local2947 = 0;
					local1053 = local2961;
				}
				@Pc(3001) short local3001 = this.aShortArray71[local697];
				if (local3001 > local2947) {
					local2947 = local3001;
				}
				if (local3001 < local1075) {
					local1075 = local3001;
				}
				local3001 = this.aShortArray64[local697];
				if (local2947 < local3001) {
					local2947 = local3001;
				}
				if (local3001 < local1075) {
					local1075 = local3001;
				}
				local3001 = this.aShortArray61[local697];
				if (local3001 < local1075) {
					local1075 = local3001;
				}
				if (local3001 > local2947) {
					local2947 = local3001;
				}
			}
			this.anIntArray327[local1360] = local1075;
			this.anIntArray324[local1360] = local2947 + 1 - local1075;
			local1360++;
			this.anIntArray328[local1360] = this.anInt4409;
		}
		Static289.aLongArray10 = null;
		this.aShortArray67 = Static425.method6548(this.anInt4395, this.aShortArray67);
		this.aShortArray62 = Static425.method6548(this.anInt4395, this.aShortArray62);
		this.aShortArray65 = Static425.method6548(this.anInt4395, this.aShortArray65);
		this.aShortArray72 = Static425.method6548(this.anInt4395, this.aShortArray72);
		this.aShortArray63 = Static425.method6548(this.anInt4395, this.aShortArray63);
		this.aByteArray51 = Static149.method2949(this.anInt4395, this.aByteArray51);
		this.aFloatArray38 = Static508.method7542(this.aFloatArray38, this.anInt4395);
		this.aFloatArray37 = Static508.method7542(this.aFloatArray37, this.anInt4395);
		if (arg1.anIntArray390 != null && Static120.method2483(arg2, this.anInt4366)) {
			this.anIntArrayArray42 = arg1.method4656(false);
		}
		if (arg1.aClass2Array1 != null && Static428.method6572(this.anInt4366, arg2)) {
			this.anIntArrayArray43 = arg1.method4661();
		}
		if (arg1.anIntArray388 != null && Static389.method6146(this.anInt4366, arg2)) {
			local1360 = 0;
			local644 = new int[256];
			for (local1064 = 0; local1064 < this.anInt4418; local1064++) {
				local1075 = arg1.anIntArray388[local22[local1064]];
				if (local1075 >= 0) {
					if (local1075 > local1360) {
						local1360 = local1075;
					}
					@Pc(3222) int local3222 = local644[local1075]++;
				}
			}
			this.anIntArrayArray44 = new int[local1360 + 1][];
			for (local1075 = 0; local1075 <= local1360; local1075++) {
				this.anIntArrayArray44[local1075] = new int[local644[local1075]];
				local644[local1075] = 0;
			}
			for (local652 = 0; local652 < this.anInt4418; local652++) {
				local697 = arg1.anIntArray388[local22[local652]];
				if (local697 >= 0) {
					this.anIntArrayArray44[local697][local644[local697]++] = local652;
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!wr;IIZZ)V")
	public Class26_Sub2(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean348 = true;
		this.anInt4398 = 0;
		this.anInt4395 = 0;
		this.anInt4409 = 0;
		this.anInt4418 = 0;
		this.anInt4405 = 0;
		this.aBoolean349 = false;
		this.aBoolean350 = false;
		this.anInt4366 = arg2;
		this.aClass42_Sub1_9 = arg0;
		this.anInt4400 = arg1;
		this.aBoolean349 = arg4;
		if (arg3 || Static254.method4370(this.anInt4400, this.anInt4366)) {
			this.aClass261_2 = new Class261(Static43.method849(this.anInt4400, this.anInt4366));
		}
		if (arg3 || Static17.method391(this.anInt4366, this.anInt4400)) {
			this.lb = new Class261(Static4.method199(this.anInt4400, this.anInt4366));
		}
		if (arg3 || Static267.method4551(this.anInt4366, this.anInt4400)) {
			this.aClass261_3 = new Class261(Static58.method1436(this.anInt4366, this.anInt4400));
		}
		if (arg3 || Static249.method4291(this.anInt4400, this.anInt4366)) {
			this.aClass261_1 = new Class261(Static173.method3445(this.anInt4366, this.anInt4400));
		}
		if (arg3 || Static51.method7363(this.anInt4366, this.anInt4400)) {
			this.aClass44_1 = new Class44(Static448.method6772(this.anInt4366, this.anInt4400));
		}
	}

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		this.aShort64 = (short) arg0;
		this.method3744();
		this.method3738();
	}

	@OriginalMember(owner = "client!i", name = "L", descriptor = "(SS)V")
	@Override
	public void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface11 local9 = this.aClass42_Sub1_9.anInterface11_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt4418; local11++) {
			if (arg0 == this.aShortArray70[local11]) {
				this.aShortArray70[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class278 local47 = local9.method6215(arg0 & 0xFFFF);
			local35 = local47.aByte84;
			local37 = local47.aByte85;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class278 local68 = local9.method6215(arg1 & 0xFFFF);
			local55 = local68.aByte84;
			local57 = local68.aByte85;
		}
		if (!(local37 != local57 | local55 != local35)) {
			return;
		}
		if (this.aClass151Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt4424; local97++) {
				@Pc(104) Class151 local104 = this.aClass151Array1[local97];
				@Pc(109) Class264 local109 = this.aClass264Array1[local97];
				local109.anInt7968 = local109.anInt7968 & 0xFF000000 | Static141.anIntArray234[this.aShortArray66[local104.anInt4690] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method3735();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!og;Z)V")
	private void method3728(@OriginalArg(0) Class91_Sub2 arg0) {
		@Pc(6) int local6;
		if (this.aClass142Array4 != null) {
			for (local6 = 0; local6 < this.aClass142Array4.length; local6++) {
				@Pc(13) Class142 local13 = this.aClass142Array4[local6];
				@Pc(15) Class142 local15 = local13;
				if (local13.aClass142_1 != null) {
					local15 = local13.aClass142_1;
				}
				local15.anInt4543 = (int) (arg0.aFloat144 + arg0.aFloat142 * (float) this.anIntArray326[local13.anInt4538] + arg0.aFloat143 * (float) this.anIntArray329[local13.anInt4538] + arg0.aFloat141 * (float) this.anIntArray330[local13.anInt4538]);
				local15.anInt4545 = (int) (arg0.aFloat134 * (float) this.anIntArray329[local13.anInt4538] + arg0.aFloat137 * (float) this.anIntArray330[local13.anInt4538] + (float) this.anIntArray326[local13.anInt4538] * arg0.aFloat139 + arg0.aFloat138);
				local15.anInt4551 = (int) (arg0.aFloat133 * (float) this.anIntArray329[local13.anInt4538] + (float) this.anIntArray330[local13.anInt4538] * arg0.aFloat136 + (float) this.anIntArray326[local13.anInt4538] * arg0.aFloat140 + arg0.aFloat135);
				local15.anInt4547 = (int) ((float) this.anIntArray329[local13.anInt4540] * arg0.aFloat143 + (float) this.anIntArray330[local13.anInt4540] * arg0.aFloat141 + arg0.aFloat142 * (float) this.anIntArray326[local13.anInt4540] + arg0.aFloat144);
				local15.anInt4541 = (int) (arg0.aFloat138 + (float) this.anIntArray329[local13.anInt4540] * arg0.aFloat134 + (float) this.anIntArray330[local13.anInt4540] * arg0.aFloat137 + (float) this.anIntArray326[local13.anInt4540] * arg0.aFloat139);
				local15.anInt4550 = (int) ((float) this.anIntArray326[local13.anInt4540] * arg0.aFloat140 + arg0.aFloat133 * (float) this.anIntArray329[local13.anInt4540] + (float) this.anIntArray330[local13.anInt4540] * arg0.aFloat136 + arg0.aFloat135);
				local15.anInt4535 = (int) (arg0.aFloat144 + arg0.aFloat142 * (float) this.anIntArray326[local13.anInt4542] + arg0.aFloat141 * (float) this.anIntArray330[local13.anInt4542] + (float) this.anIntArray329[local13.anInt4542] * arg0.aFloat143);
				local15.anInt4548 = (int) (arg0.aFloat138 + arg0.aFloat137 * (float) this.anIntArray330[local13.anInt4542] + arg0.aFloat134 * (float) this.anIntArray329[local13.anInt4542] + arg0.aFloat139 * (float) this.anIntArray326[local13.anInt4542]);
				local15.anInt4546 = (int) (arg0.aFloat135 + (float) this.anIntArray326[local13.anInt4542] * arg0.aFloat140 + (float) this.anIntArray329[local13.anInt4542] * arg0.aFloat133 + (float) this.anIntArray330[local13.anInt4542] * arg0.aFloat136);
			}
		}
		if (this.aClass265Array4 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass265Array4.length; local6++) {
			@Pc(363) Class265 local363 = this.aClass265Array4[local6];
			@Pc(365) Class265 local365 = local363;
			if (local363.aClass265_1 != null) {
				local365 = local363.aClass265_1;
			}
			if (local363.aClass91_6 == null) {
				local363.aClass91_6 = arg0.method7050();
			} else {
				local363.aClass91_6.EA(arg0);
			}
			local365.anInt7974 = (int) (arg0.aFloat144 + arg0.aFloat142 * (float) this.anIntArray326[local363.anInt7977] + arg0.aFloat141 * (float) this.anIntArray330[local363.anInt7977] + arg0.aFloat143 * (float) this.anIntArray329[local363.anInt7977]);
			local365.anInt7975 = (int) ((float) this.anIntArray326[local363.anInt7977] * arg0.aFloat139 + arg0.aFloat134 * (float) this.anIntArray329[local363.anInt7977] + (float) this.anIntArray330[local363.anInt7977] * arg0.aFloat137 + arg0.aFloat138);
			local365.anInt7972 = (int) (arg0.aFloat136 * (float) this.anIntArray330[local363.anInt7977] + arg0.aFloat133 * (float) this.anIntArray329[local363.anInt7977] + arg0.aFloat140 * (float) this.anIntArray326[local363.anInt7977] + arg0.aFloat135);
		}
	}

	@OriginalMember(owner = "client!i", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.aShort63 = (short) arg0;
		this.method3735();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	private void method3730() {
		if (!this.aBoolean348) {
			return;
		}
		this.aBoolean348 = false;
		if (this.aClass142Array4 == null && this.aClass265Array4 == null && this.aClass151Array1 == null) {
			if (this.anIntArray330 != null && !Static200.method3792(this.anInt4366, this.anInt4400)) {
				if (this.aClass261_2 == null || this.aClass261_2.method6547()) {
					if (!this.aBoolean350) {
						this.method3737();
					}
					this.anIntArray330 = null;
				} else {
					this.aBoolean348 = true;
				}
			}
			if (this.anIntArray329 != null && !Static495.method7365(this.anInt4400, this.anInt4366)) {
				if (this.aClass261_2 == null || this.aClass261_2.method6547()) {
					if (!this.aBoolean350) {
						this.method3737();
					}
					this.anIntArray329 = null;
				} else {
					this.aBoolean348 = true;
				}
			}
			if (this.anIntArray326 != null && !Static294.method4771(this.anInt4400, this.anInt4366)) {
				if (this.aClass261_2 == null || this.aClass261_2.method6547()) {
					if (!this.aBoolean350) {
						this.method3737();
					}
					this.anIntArray326 = null;
				} else {
					this.aBoolean348 = true;
				}
			}
		}
		if (this.aShortArray69 != null && this.anIntArray330 == null && this.anIntArray329 == null && this.anIntArray326 == null) {
			this.aShortArray69 = null;
			this.anIntArray325 = null;
		}
		if (this.aByteArray51 != null && !Static55.method1414(this.anInt4400, this.anInt4366)) {
			label195: {
				label194: {
					@Pc(159) boolean local159;
					if ((this.anInt4366 & 0x37) == 0) {
						if (this.aClass261_3 == null || this.aClass261_3.method6547()) {
							break label194;
						}
						local159 = false;
					} else {
						if (this.aClass261_1 == null || this.aClass261_1.method6547()) {
							break label194;
						}
						local159 = false;
					}
					if (!local159) {
						this.aBoolean348 = true;
						break label195;
					}
				}
				this.aByteArray51 = null;
				this.aShortArray65 = this.aShortArray72 = this.aShortArray63 = null;
			}
		}
		if (this.aShortArray66 != null && !Static519.method7733(this.anInt4366, this.anInt4400)) {
			if (this.aClass261_3 == null || this.aClass261_3.method6547()) {
				this.aShortArray66 = null;
			} else {
				this.aBoolean348 = true;
			}
		}
		if (this.aByteArray50 != null && !Static21.method6667(this.anInt4366, this.anInt4400)) {
			if (this.aClass261_3 == null || this.aClass261_3.method6547()) {
				this.aByteArray50 = null;
			} else {
				this.aBoolean348 = true;
			}
		}
		if (this.aFloatArray38 != null && !Static81.method1825(this.anInt4400, this.anInt4366)) {
			if (this.lb == null || this.lb.method6547()) {
				this.aFloatArray38 = this.aFloatArray37 = null;
			} else {
				this.aBoolean348 = true;
			}
		}
		if (this.aShortArray70 != null && !Static102.method2110(this.anInt4366, this.anInt4400)) {
			if (this.aClass261_3 == null || this.aClass261_3.method6547()) {
				this.aShortArray70 = null;
			} else {
				this.aBoolean348 = true;
			}
		}
		if (this.aShortArray71 != null && !Static481.method7154(this.anInt4400, this.anInt4366)) {
			if ((this.aClass44_1 == null || this.aClass44_1.method1406()) && (this.aClass261_3 == null || this.aClass261_3.method6547())) {
				this.aShortArray71 = this.aShortArray64 = this.aShortArray61 = null;
			} else {
				this.aBoolean348 = true;
			}
		}
		if (this.aShortArray67 != null) {
			if (this.aClass261_2 == null || this.aClass261_2.method6547()) {
				this.aShortArray67 = null;
			} else {
				this.aBoolean348 = true;
			}
		}
		if (this.aShortArray62 != null) {
			if (this.aClass261_3 == null || this.aClass261_3.method6547()) {
				this.aShortArray62 = null;
			} else {
				this.aBoolean348 = true;
			}
		}
		if (this.anIntArrayArray44 != null && !Static389.method6146(this.anInt4366, this.anInt4400)) {
			this.anIntArrayArray44 = null;
			this.aShortArray68 = null;
		}
		if (this.anIntArrayArray42 != null && !Static120.method2483(this.anInt4400, this.anInt4366)) {
			this.anIntArrayArray42 = null;
			this.aShortArray73 = null;
		}
		if (this.anIntArrayArray43 != null && !Static428.method6572(this.anInt4366, this.anInt4400)) {
			this.anIntArrayArray43 = null;
		}
		if (this.anIntArray328 != null && (this.anInt4400 & 0x800) == 0 && (this.anInt4400 & 0x40000) == 0) {
			this.anIntArray328 = null;
			this.anIntArray324 = null;
			this.anIntArray327 = null;
		}
	}

	@OriginalMember(owner = "client!i", name = "m", descriptor = "(I)V")
	@Override
	public void m(@OriginalArg(0) int arg0) {
		if (this.aClass261_2 != null) {
			this.aClass261_2.aBoolean548 = Static43.method849(arg0, this.anInt4366);
		}
		if (this.lb != null) {
			this.lb.aBoolean548 = Static4.method199(arg0, this.anInt4366);
		}
		if (this.aClass261_3 != null) {
			this.aClass261_3.aBoolean548 = Static58.method1436(this.anInt4366, arg0);
		}
		if (this.aClass261_1 != null) {
			this.aClass261_1.aBoolean548 = Static173.method3445(this.anInt4366, arg0);
		}
		this.anInt4400 = arg0;
		this.aBoolean348 = true;
		if (this.aClass87_1 != null && (this.anInt4400 & 0x10000) == 0) {
			this.aShortArray72 = this.aClass87_1.aShortArray41;
			this.aByteArray51 = this.aClass87_1.aByteArray27;
			this.aShortArray65 = this.aClass87_1.aShortArray40;
			this.aShortArray63 = this.aClass87_1.aShortArray42;
			this.aClass87_1 = null;
		}
		this.method3730();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	private void method3731() {
		if (this.aClass44_1 != null) {
			this.aClass44_1.aBoolean98 = false;
		}
	}

	@OriginalMember(owner = "client!i", name = "OA", descriptor = "(I)V")
	@Override
	public void OA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class12_Sub1_Sub36.anIntArray667[arg0];
		@Pc(13) int local13 = Class12_Sub1_Sub36.anIntArray668[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4398; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray330[local15] + this.anIntArray326[local15] * local9 >> 15;
			this.anIntArray326[local15] = this.anIntArray326[local15] * local13 - this.anIntArray330[local15] * local9 >> 15;
			this.anIntArray330[local15] = local33;
		}
		this.method3744();
		this.aBoolean350 = false;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt4418; local7++) {
			local16 = this.aShortArray66[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 -= -(arg3 * (arg1 - local28) >> 7);
			}
			@Pc(47) int local47 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local47 -= -((arg2 - local47) * arg3 >> 7);
			}
			this.aShortArray66[local7] = (short) (local47 | local22 << 10 | local28 << 7);
		}
		if (this.aClass151Array1 != null) {
			for (local16 = 0; local16 < this.anInt4424; local16++) {
				@Pc(106) Class151 local106 = this.aClass151Array1[local16];
				@Pc(111) Class264 local111 = this.aClass264Array1[local16];
				local111.anInt7968 = Static141.anIntArray234[this.aShortArray66[local106.anInt4690] & 0xFFFF] & 0xFFFFFF | local111.anInt7968 & 0xFF000000;
			}
		}
		this.method3735();
	}

	@OriginalMember(owner = "client!i", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		if (!this.aBoolean350) {
			this.method3737();
		}
		return this.anInt4376;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method3732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > arg0 && arg3 > arg0 && arg4 > arg0) {
			return false;
		} else if (arg0 > arg2 && arg0 > arg3 && arg0 > arg4) {
			return false;
		} else if (arg7 > arg5 && arg5 < arg6 && arg1 > arg5) {
			return false;
		} else {
			return arg5 <= arg7 || arg5 <= arg6 || arg5 <= arg1;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIFIFIJIILclient!ln;)S")
	private short method3733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class192 arg9) {
		@Pc(10) int local10 = this.anIntArray325[arg0];
		@Pc(17) int local17 = this.anIntArray325[arg0 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray69[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static289.aLongArray10[local21] == arg7) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray69[local19] = (short) (this.anInt4395 + 1);
		Static289.aLongArray10[local19] = arg7;
		this.aShortArray62[this.anInt4395] = (short) arg6;
		this.aShortArray67[this.anInt4395] = (short) arg0;
		this.aShortArray65[this.anInt4395] = (short) arg1;
		this.aShortArray72[this.anInt4395] = (short) arg8;
		this.aShortArray63[this.anInt4395] = (short) arg4;
		this.aByteArray51[this.anInt4395] = (byte) arg2;
		this.aFloatArray38[this.anInt4395] = arg3;
		this.aFloatArray37[this.anInt4395] = arg5;
		return (short) this.anInt4395++;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V")
	public void method3734() {
		if (this.aClass261_2 != null) {
			this.aClass261_2.method6546();
		}
		if (this.lb != null) {
			this.lb.method6546();
		}
		if (this.aClass261_3 != null) {
			this.aClass261_3.method6546();
		}
		if (this.aClass261_1 != null) {
			this.aClass261_1.method6546();
		}
		if (this.aClass44_1 != null) {
			this.aClass44_1.method1409();
		}
	}

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		return this.anInt4400;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
	@Override
	public void method8004() {
		if (this.anInt4395 > 0 && this.anInt4409 > 0) {
			this.method3741();
			this.method3746();
			this.method3730();
		}
	}

	@OriginalMember(owner = "client!i", name = "M", descriptor = "()I")
	@Override
	public int M() {
		return this.aShort63;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V")
	private void method3735() {
		if (this.aClass261_3 != null) {
			this.aClass261_3.aBoolean549 = false;
		}
	}

	@OriginalMember(owner = "client!i", name = "q", descriptor = "(I)V")
	@Override
	public void q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class12_Sub1_Sub36.anIntArray667[arg0];
		@Pc(13) int local13 = Class12_Sub1_Sub36.anIntArray668[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4398; local15++) {
			local33 = local9 * this.anIntArray326[local15] + this.anIntArray330[local15] * local13 >> 15;
			this.anIntArray326[local15] = local13 * this.anIntArray326[local15] - local9 * this.anIntArray330[local15] >> 15;
			this.anIntArray330[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt4395; local33++) {
			@Pc(84) int local84 = local9 * this.aShortArray63[local33] + local13 * this.aShortArray65[local33] >> 15;
			this.aShortArray63[local33] = (short) (local13 * this.aShortArray63[local33] - local9 * this.aShortArray65[local33] >> 15);
			this.aShortArray65[local33] = (short) local84;
		}
		this.method3744();
		this.method3738();
		this.aBoolean350 = false;
	}

	@OriginalMember(owner = "client!i", name = "ca", descriptor = "(III)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4398; local7++) {
			if (arg0 != 0) {
				this.anIntArray330[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray329[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray326[local7] += arg2;
			}
		}
		this.method3744();
		this.aBoolean350 = false;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BLclient!iba;)V")
	private void method3736(@OriginalArg(1) Class12_Sub4_Sub10_Sub1 arg0) {
		if (this.anInt4395 > Static170.anIntArray304.length) {
			Static314.anIntArray424 = new int[this.anInt4395];
			Static170.anIntArray304 = new int[this.anInt4395];
		}
		@Pc(56) int local56;
		@Pc(94) int local94;
		@Pc(103) int local103;
		for (@Pc(30) int local30 = 0; local30 < this.anInt4398; local30++) {
			local56 = (this.anIntArray330[local30] - (this.aClass42_Sub1_9.anInt7100 * this.anIntArray329[local30] >> 8) >> this.aClass42_Sub1_9.anInt7103) - arg0.anInt4523;
			@Pc(80) int local80 = (this.anIntArray326[local30] - (this.anIntArray329[local30] * this.aClass42_Sub1_9.anInt7117 >> 8) >> this.aClass42_Sub1_9.anInt7103) - arg0.anInt4519;
			@Pc(85) int local85 = this.anIntArray325[local30];
			@Pc(92) int local92 = this.anIntArray325[local30 + 1];
			for (local94 = local85; local94 < local92; local94++) {
				local103 = this.aShortArray69[local94] - 1;
				if (local103 == -1) {
					break;
				}
				Static170.anIntArray304[local103] = local56;
				Static314.anIntArray424[local103] = local80;
			}
		}
		for (local56 = 0; local56 < this.anInt4409; local56++) {
			if (this.aByteArray50 == null || this.aByteArray50[local56] <= 128) {
				@Pc(141) short local141 = this.aShortArray71[local56];
				@Pc(146) short local146 = this.aShortArray64[local56];
				@Pc(151) short local151 = this.aShortArray61[local56];
				local94 = Static170.anIntArray304[local141];
				local103 = Static170.anIntArray304[local146];
				@Pc(163) int local163 = Static170.anIntArray304[local151];
				@Pc(167) int local167 = Static314.anIntArray424[local141];
				@Pc(171) int local171 = Static314.anIntArray424[local146];
				@Pc(175) int local175 = Static314.anIntArray424[local151];
				if (-((local163 - local103) * (local171 - local167)) + (local94 - local103) * (-local175 + local171) > 0) {
					arg0.method3808(local171, local94, local167, local103, local163, local175);
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
	private void method3737() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt4398; local29++) {
			@Pc(36) int local36 = this.anIntArray330[local29];
			@Pc(41) int local41 = this.anIntArray329[local29];
			@Pc(46) int local46 = this.anIntArray326[local29];
			if (local41 < local9) {
				local9 = local41;
			}
			if (local41 > local15) {
				local15 = local41;
			}
			if (local36 < local7) {
				local7 = local36;
			}
			if (local36 > local13) {
				local13 = local36;
			}
			if (local46 > local17) {
				local17 = local46;
			}
			if (local46 < local11) {
				local11 = local46;
			}
			@Pc(96) int local96 = local46 * local46 + local36 * local36;
			if (local96 > local25) {
				local25 = local96;
			}
			local96 = local41 * local41 + local46 * local46 + local36 * local36;
			if (local27 < local96) {
				local27 = local96;
			}
		}
		this.anInt4415 = local11;
		this.anInt4408 = local13;
		this.anInt4376 = local9;
		this.anInt4377 = local17;
		this.anInt4407 = local15;
		this.anInt4390 = local7;
		this.anInt4371 = (int) (Math.sqrt((double) local25) + 0.99D);
		Math.sqrt((double) local27);
		this.aBoolean350 = true;
	}

	@OriginalMember(owner = "client!i", name = "va", descriptor = "()I")
	@Override
	public int va() {
		if (!this.aBoolean350) {
			this.method3737();
		}
		return this.anInt4408;
	}

	@OriginalMember(owner = "client!i", name = "ea", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			local14 = arg4 << 4;
			local18 = arg3 << 4;
			local22 = arg2 << 4;
			Static501.anInt9053 = 0;
			Static332.anInt6357 = 0;
			local28 = 0;
			Static227.anInt4859 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray42.length > local38) {
					local52 = this.anIntArrayArray42[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static227.anInt4859 += this.anIntArray330[local60];
						Static332.anInt6357 += this.anIntArray329[local60];
						local28++;
						Static501.anInt9053 += this.anIntArray326[local60];
					}
				}
			}
			if (local28 > 0) {
				Static227.anInt4859 = Static227.anInt4859 / local28 + local22;
				Static501.anInt9053 = local14 + Static501.anInt9053 / local28;
				Static332.anInt6357 = local18 + Static332.anInt6357 / local28;
			} else {
				Static501.anInt9053 = local14;
				Static227.anInt4859 = local22;
				Static332.anInt6357 = local18;
			}
			return;
		}
		@Pc(163) int[] local163;
		@Pc(165) int local165;
		if (arg0 == 1) {
			local22 = arg2 << 4;
			local14 = arg4 << 4;
			local18 = arg3 << 4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray42.length) {
					local163 = this.anIntArrayArray42[local32];
					for (local165 = 0; local165 < local163.length; local165++) {
						local54 = local163[local165];
						this.anIntArray330[local54] += local22;
						this.anIntArray329[local54] += local18;
						this.anIntArray326[local54] += local14;
					}
				}
			}
			return;
		}
		@Pc(286) int local286;
		@Pc(305) int local305;
		@Pc(753) int local753;
		@Pc(762) int local762;
		if (arg0 == 2) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray42.length) {
					local163 = this.anIntArrayArray42[local32];
					if ((arg5 & 0x1) == 0) {
						for (local165 = 0; local165 < local163.length; local165++) {
							local54 = local163[local165];
							this.anIntArray330[local54] -= Static227.anInt4859;
							this.anIntArray329[local54] -= Static332.anInt6357;
							this.anIntArray326[local54] -= Static501.anInt9053;
							if (arg4 != 0) {
								local60 = Class12_Sub1_Sub36.anIntArray667[arg4];
								local286 = Class12_Sub1_Sub36.anIntArray668[arg4];
								local305 = this.anIntArray329[local54] * local60 + this.anIntArray330[local54] * local286 + 32767 >> 15;
								this.anIntArray329[local54] = this.anIntArray329[local54] * local286 + 32767 - local60 * this.anIntArray330[local54] >> 15;
								this.anIntArray330[local54] = local305;
							}
							if (arg2 != 0) {
								local60 = Class12_Sub1_Sub36.anIntArray667[arg2];
								local286 = Class12_Sub1_Sub36.anIntArray668[arg2];
								local305 = this.anIntArray329[local54] * local286 + 32767 - this.anIntArray326[local54] * local60 >> 15;
								this.anIntArray326[local54] = this.anIntArray326[local54] * local286 + local60 * this.anIntArray329[local54] + 32767 >> 15;
								this.anIntArray329[local54] = local305;
							}
							if (arg3 != 0) {
								local60 = Class12_Sub1_Sub36.anIntArray667[arg3];
								local286 = Class12_Sub1_Sub36.anIntArray668[arg3];
								local305 = this.anIntArray326[local54] * local60 + this.anIntArray330[local54] * local286 + 32767 >> 15;
								this.anIntArray326[local54] = local286 * this.anIntArray326[local54] + 32767 - this.anIntArray330[local54] * local60 >> 15;
								this.anIntArray330[local54] = local305;
							}
							this.anIntArray330[local54] += Static227.anInt4859;
							this.anIntArray329[local54] += Static332.anInt6357;
							this.anIntArray326[local54] += Static501.anInt9053;
						}
					} else {
						for (local165 = 0; local165 < local163.length; local165++) {
							local54 = local163[local165];
							this.anIntArray330[local54] -= Static227.anInt4859;
							this.anIntArray329[local54] -= Static332.anInt6357;
							this.anIntArray326[local54] -= Static501.anInt9053;
							if (arg2 != 0) {
								local60 = Class12_Sub1_Sub36.anIntArray667[arg2];
								local286 = Class12_Sub1_Sub36.anIntArray668[arg2];
								local305 = local286 * this.anIntArray329[local54] + 32767 - this.anIntArray326[local54] * local60 >> 15;
								this.anIntArray326[local54] = local60 * this.anIntArray329[local54] + local286 * this.anIntArray326[local54] + 32767 >> 15;
								this.anIntArray329[local54] = local305;
							}
							if (arg4 != 0) {
								local60 = Class12_Sub1_Sub36.anIntArray667[arg4];
								local286 = Class12_Sub1_Sub36.anIntArray668[arg4];
								local305 = local60 * this.anIntArray329[local54] + this.anIntArray330[local54] * local286 + 32767 >> 15;
								this.anIntArray329[local54] = this.anIntArray329[local54] * local286 + 32767 - this.anIntArray330[local54] * local60 >> 15;
								this.anIntArray330[local54] = local305;
							}
							if (arg3 != 0) {
								local60 = Class12_Sub1_Sub36.anIntArray667[arg3];
								local286 = Class12_Sub1_Sub36.anIntArray668[arg3];
								local305 = local286 * this.anIntArray330[local54] + this.anIntArray326[local54] * local60 + 32767 >> 15;
								this.anIntArray326[local54] = local286 * this.anIntArray326[local54] + 32767 - this.anIntArray330[local54] * local60 >> 15;
								this.anIntArray330[local54] = local305;
							}
							this.anIntArray330[local54] += Static227.anInt4859;
							this.anIntArray329[local54] += Static332.anInt6357;
							this.anIntArray326[local54] += Static501.anInt9053;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray42.length) {
						local52 = this.anIntArrayArray42[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local286 = this.anIntArray325[local60];
							local305 = this.anIntArray325[local60 + 1];
							for (local753 = local286; local753 < local305; local753++) {
								local762 = this.aShortArray69[local753] - 1;
								if (local762 == -1) {
									break;
								}
								@Pc(774) int local774;
								@Pc(778) int local778;
								@Pc(796) int local796;
								if (arg4 != 0) {
									local774 = Class12_Sub1_Sub36.anIntArray667[arg4];
									local778 = Class12_Sub1_Sub36.anIntArray668[arg4];
									local796 = this.aShortArray65[local762] * local778 + this.aShortArray72[local762] * local774 + 32767 >> 15;
									this.aShortArray72[local762] = (short) (local778 * this.aShortArray72[local762] + 32767 - local774 * this.aShortArray65[local762] >> 15);
									this.aShortArray65[local762] = (short) local796;
								}
								if (arg2 != 0) {
									local774 = Class12_Sub1_Sub36.anIntArray667[arg2];
									local778 = Class12_Sub1_Sub36.anIntArray668[arg2];
									local796 = local778 * this.aShortArray72[local762] + 32767 - this.aShortArray63[local762] * local774 >> 15;
									this.aShortArray63[local762] = (short) (this.aShortArray63[local762] * local778 + local774 * this.aShortArray72[local762] + 32767 >> 15);
									this.aShortArray72[local762] = (short) local796;
								}
								if (arg3 != 0) {
									local774 = Class12_Sub1_Sub36.anIntArray667[arg3];
									local778 = Class12_Sub1_Sub36.anIntArray668[arg3];
									local796 = this.aShortArray63[local762] * local774 + local778 * this.aShortArray65[local762] + 32767 >> 15;
									this.aShortArray63[local762] = (short) (local778 * this.aShortArray63[local762] + 32767 - this.aShortArray65[local762] * local774 >> 15);
									this.aShortArray65[local762] = (short) local796;
								}
							}
						}
					}
				}
				this.method3738();
			}
		} else if (arg0 == 3) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray42.length > local32) {
					local163 = this.anIntArrayArray42[local32];
					for (local165 = 0; local165 < local163.length; local165++) {
						local54 = local163[local165];
						this.anIntArray330[local54] -= Static227.anInt4859;
						this.anIntArray329[local54] -= Static332.anInt6357;
						this.anIntArray326[local54] -= Static501.anInt9053;
						this.anIntArray330[local54] = this.anIntArray330[local54] * arg2 >> 7;
						this.anIntArray329[local54] = arg3 * this.anIntArray329[local54] >> 7;
						this.anIntArray326[local54] = arg4 * this.anIntArray326[local54] >> 7;
						this.anIntArray330[local54] += Static227.anInt4859;
						this.anIntArray329[local54] += Static332.anInt6357;
						this.anIntArray326[local54] += Static501.anInt9053;
					}
				}
			}
		} else {
			@Pc(1207) Class264 local1207;
			@Pc(1106) boolean local1106;
			@Pc(1202) Class151 local1202;
			if (arg0 == 5) {
				if (this.anIntArrayArray44 != null) {
					local1106 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray44.length > local38) {
							local52 = this.anIntArrayArray44[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								local286 = arg2 * 8 + (this.aByteArray50[local60] & 0xFF);
								if (local286 < 0) {
									local286 = 0;
								} else if (local286 > 255) {
									local286 = 255;
								}
								this.aByteArray50[local60] = (byte) local286;
							}
							local1106 |= local52.length > 0;
						}
					}
					if (local1106) {
						if (this.aClass151Array1 != null) {
							for (local38 = 0; local38 < this.anInt4424; local38++) {
								local1202 = this.aClass151Array1[local38];
								local1207 = this.aClass264Array1[local38];
								local1207.anInt7968 = local1207.anInt7968 & 0xFFFFFF | 255 - (this.aByteArray50[local1202.anInt4690] & 0xFF) << 24;
							}
						}
						this.method3735();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray44 != null) {
					local1106 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray44.length) {
							local52 = this.anIntArrayArray44[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								local286 = this.aShortArray66[local60] & 0xFFFF;
								local305 = local286 >> 10 & 0x3F;
								local753 = local286 >> 7 & 0x7;
								@Pc(1298) int local1298 = arg2 + local305 & 0x3F;
								local762 = local286 & 0x7F;
								local753 += arg3 / 4;
								if (local753 < 0) {
									local753 = 0;
								} else if (local753 > 7) {
									local753 = 7;
								}
								local762 += arg4;
								if (local762 < 0) {
									local762 = 0;
								} else if (local762 > 127) {
									local762 = 127;
								}
								this.aShortArray66[local60] = (short) (local762 | local753 << 7 | local1298 << 10);
							}
							local1106 |= local52.length > 0;
						}
					}
					if (local1106) {
						if (this.aClass151Array1 != null) {
							for (local38 = 0; local38 < this.anInt4424; local38++) {
								local1202 = this.aClass151Array1[local38];
								local1207 = this.aClass264Array1[local38];
								local1207.anInt7968 = local1207.anInt7968 & 0xFF000000 | Static141.anIntArray234[this.aShortArray66[local1202.anInt4690] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method3735();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray43 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray43.length > local32) {
							local163 = this.anIntArrayArray43[local32];
							for (local165 = 0; local165 < local163.length; local165++) {
								local1207 = this.aClass264Array1[local163[local165]];
								local1207.anInt7969 += arg2;
								local1207.anInt7961 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray43 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray43.length) {
							local163 = this.anIntArrayArray43[local32];
							for (local165 = 0; local165 < local163.length; local165++) {
								local1207 = this.aClass264Array1[local163[local165]];
								local1207.anInt7963 = arg3 * local1207.anInt7963 >> 7;
								local1207.anInt7967 = arg2 * local1207.anInt7967 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray43 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray43.length > local32) {
						local163 = this.anIntArrayArray43[local32];
						for (local165 = 0; local165 < local163.length; local165++) {
							local1207 = this.aClass264Array1[local163[local165]];
							local1207.anInt7964 = local1207.anInt7964 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
	private void method3738() {
		if ((this.anInt4366 & 0x37) != 0) {
			if (this.aClass261_1 == null) {
				return;
			}
			this.aClass261_1.aBoolean549 = false;
		} else if (this.aClass261_3 != null) {
			this.aClass261_3.aBoolean549 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()Z")
	@Override
	public boolean method7997() {
		if (this.aShortArray70 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray70.length; local12++) {
			if (this.aShortArray70[local12] != -1 && !this.aClass42_Sub1_9.anInterface11_11.method6213(this.aShortArray70[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
	@Override
	public void b(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class12_Sub1_Sub36.anIntArray667[arg0];
		@Pc(13) int local13 = Class12_Sub1_Sub36.anIntArray668[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4398; local15++) {
			@Pc(33) int local33 = this.anIntArray329[local15] * local9 + local13 * this.anIntArray330[local15] >> 15;
			this.anIntArray329[local15] = local13 * this.anIntArray329[local15] - local9 * this.anIntArray330[local15] >> 15;
			this.anIntArray330[local15] = local33;
		}
		this.method3744();
		this.aBoolean350 = false;
	}

	@OriginalMember(owner = "client!i", name = "U", descriptor = "()I")
	@Override
	public int U() {
		if (!this.aBoolean350) {
			this.method3737();
		}
		return this.anInt4377;
	}

	@OriginalMember(owner = "client!i", name = "MA", descriptor = "()V")
	@Override
	protected void MA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4405; local7++) {
			this.anIntArray330[local7] = this.anIntArray330[local7] + 7 >> 4;
			this.anIntArray329[local7] = this.anIntArray329[local7] + 7 >> 4;
			this.anIntArray326[local7] = this.anIntArray326[local7] + 7 >> 4;
		}
		this.method3744();
		this.aBoolean350 = false;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!m;Lclient!kn;I)V")
	@Override
	public void method8003(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class7_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4395 == 0) {
			return;
		}
		@Pc(13) Class91_Sub2 local13 = this.aClass42_Sub1_9.aClass91_Sub2_16;
		@Pc(16) Class91_Sub2 local16 = (Class91_Sub2) arg0;
		if (!this.aBoolean350) {
			this.method3737();
		}
		this.method3728(local16);
		Static301.aFloat121 = local16.aFloat134 * local13.aFloat133 + local13.aFloat136 * local16.aFloat143 + local13.aFloat140 * local16.aFloat133;
		Static88.aFloat56 = local13.aFloat135 + local13.aFloat136 * local16.aFloat144 + local13.aFloat133 * local16.aFloat138 + local13.aFloat140 * local16.aFloat135;
		@Pc(73) float local73 = Static88.aFloat56 + (float) this.anInt4376 * Static301.aFloat121;
		@Pc(81) float local81 = Static301.aFloat121 * (float) this.anInt4407 + Static88.aFloat56;
		@Pc(98) float local98;
		@Pc(91) float local91;
		if (local81 < local73) {
			local91 = (float) this.anInt4371 + local73;
			local98 = (float) -this.anInt4371 + local81;
		} else {
			local91 = (float) this.anInt4371 + local81;
			local98 = (float) -this.anInt4371 + local73;
		}
		if (this.aClass42_Sub1_9.aFloat157 <= local98 || local91 <= (float) this.aClass42_Sub1_9.anInt7126) {
			return;
		}
		Static3.aFloat3 = local16.aFloat144 * local13.aFloat141 + local16.aFloat138 * local13.aFloat143 + local13.aFloat142 * local16.aFloat135 + local13.aFloat144;
		Static276.aFloat117 = local13.aFloat141 * local16.aFloat143 + local13.aFloat143 * local16.aFloat134 + local16.aFloat133 * local13.aFloat142;
		@Pc(175) float local175 = Static3.aFloat3 + (float) this.anInt4376 * Static276.aFloat117;
		@Pc(183) float local183 = Static3.aFloat3 + (float) this.anInt4407 * Static276.aFloat117;
		@Pc(198) float local198;
		@Pc(209) float local209;
		if (local175 > local183) {
			local198 = (float) this.aClass42_Sub1_9.anInt7123 * (local183 - (float) this.anInt4371);
			local209 = ((float) this.anInt4371 + local175) * (float) this.aClass42_Sub1_9.anInt7123;
		} else {
			local209 = (float) this.aClass42_Sub1_9.anInt7123 * ((float) this.anInt4371 + local183);
			local198 = (float) this.aClass42_Sub1_9.anInt7123 * ((float) -this.anInt4371 + local175);
		}
		if (this.aClass42_Sub1_9.aFloat161 <= local198 / local91 || local209 / local91 <= this.aClass42_Sub1_9.aFloat159) {
			return;
		}
		Static473.aFloat183 = local16.aFloat133 * local13.aFloat139 + local16.aFloat134 * local13.aFloat134 + local13.aFloat137 * local16.aFloat143;
		Static201.aFloat113 = local16.aFloat138 * local13.aFloat134 + local16.aFloat144 * local13.aFloat137 + local13.aFloat139 * local16.aFloat135 + local13.aFloat138;
		@Pc(299) float local299 = (float) this.anInt4376 * Static473.aFloat183 + Static201.aFloat113;
		@Pc(307) float local307 = Static473.aFloat183 * (float) this.anInt4407 + Static201.aFloat113;
		@Pc(334) float local334;
		@Pc(322) float local322;
		if (local299 > local307) {
			local322 = (float) this.aClass42_Sub1_9.anInt7131 * (local299 + (float) this.anInt4371);
			local334 = (float) this.aClass42_Sub1_9.anInt7131 * ((float) -this.anInt4371 + local307);
		} else {
			local322 = (local307 + (float) this.anInt4371) * (float) this.aClass42_Sub1_9.anInt7131;
			local334 = (float) this.aClass42_Sub1_9.anInt7131 * ((float) -this.anInt4371 + local299);
		}
		if (this.aClass42_Sub1_9.aFloat154 <= local334 / local91 || this.aClass42_Sub1_9.aFloat171 >= local322 / local91) {
			return;
		}
		if (arg1 != null || this.aClass151Array1 != null) {
			Static184.aFloat109 = local16.aFloat137 * local13.aFloat133 + local16.aFloat141 * local13.aFloat136 + local16.aFloat136 * local13.aFloat140;
			Static309.aFloat124 = local13.aFloat142 * local16.aFloat140 + local16.aFloat139 * local13.aFloat143 + local13.aFloat141 * local16.aFloat142;
			Static526.aFloat191 = local13.aFloat141 * local16.aFloat141 + local13.aFloat143 * local16.aFloat137 + local16.aFloat136 * local13.aFloat142;
			Static390.aFloat174 = local13.aFloat136 * local16.aFloat142 + local13.aFloat133 * local16.aFloat139 + local16.aFloat140 * local13.aFloat140;
			Static301.aFloat120 = local13.aFloat139 * local16.aFloat140 + local13.aFloat134 * local16.aFloat139 + local16.aFloat142 * local13.aFloat137;
			Static532.aFloat195 = local13.aFloat139 * local16.aFloat136 + local16.aFloat137 * local13.aFloat134 + local16.aFloat141 * local13.aFloat137;
		}
		if (arg1 != null) {
			@Pc(494) boolean local494 = false;
			@Pc(496) boolean local496 = true;
			@Pc(505) int local505 = this.anInt4390 + this.anInt4408 >> 1;
			@Pc(513) int local513 = this.anInt4415 + this.anInt4377 >> 1;
			@Pc(532) int local532 = (int) (Static309.aFloat124 * (float) local513 + Static276.aFloat117 * (float) this.anInt4376 + (float) local505 * Static526.aFloat191 + Static3.aFloat3);
			@Pc(551) int local551 = (int) (Static532.aFloat195 * (float) local505 + Static201.aFloat113 + (float) this.anInt4376 * Static473.aFloat183 + Static301.aFloat120 * (float) local513);
			@Pc(570) int local570 = (int) ((float) local513 * Static390.aFloat174 + Static301.aFloat121 * (float) this.anInt4376 + (float) local505 * Static184.aFloat109 + Static88.aFloat56);
			if (this.aClass42_Sub1_9.anInt7126 > local570) {
				local494 = true;
			} else {
				arg1.anInt5260 = this.aClass42_Sub1_9.anInt7131 * local551 / local570 + this.aClass42_Sub1_9.anInt7136;
				arg1.anInt5261 = local532 * this.aClass42_Sub1_9.anInt7123 / local570 + this.aClass42_Sub1_9.anInt7108;
			}
			@Pc(628) int local628 = (int) (Static309.aFloat124 * (float) local513 + Static3.aFloat3 + Static526.aFloat191 * (float) local505 + (float) this.anInt4407 * Static276.aFloat117);
			@Pc(647) int local647 = (int) ((float) local505 * Static532.aFloat195 + Static201.aFloat113 + (float) this.anInt4407 * Static473.aFloat183 + Static301.aFloat120 * (float) local513);
			@Pc(666) int local666 = (int) (Static390.aFloat174 * (float) local513 + Static184.aFloat109 * (float) local505 + Static88.aFloat56 + Static301.aFloat121 * (float) this.anInt4407);
			if (local666 < this.aClass42_Sub1_9.anInt7126) {
				local494 = true;
			} else {
				arg1.anInt5259 = local647 * this.aClass42_Sub1_9.anInt7131 / local666 + this.aClass42_Sub1_9.anInt7136;
				arg1.anInt5262 = this.aClass42_Sub1_9.anInt7108 + this.aClass42_Sub1_9.anInt7123 * local628 / local666;
			}
			if (local494) {
				if (local570 < this.aClass42_Sub1_9.anInt7126 && local666 < this.aClass42_Sub1_9.anInt7126) {
					local496 = false;
				} else {
					@Pc(739) int local739;
					@Pc(750) int local750;
					@Pc(777) int local777;
					if (this.aClass42_Sub1_9.anInt7126 > local570) {
						local739 = (local666 - this.aClass42_Sub1_9.anInt7126 << 16) / (local666 - local570);
						local750 = local628 + (local739 * (local628 - local532) >> 16);
						arg1.anInt5261 = this.aClass42_Sub1_9.anInt7108 + this.aClass42_Sub1_9.anInt7123 * local750 / this.aClass42_Sub1_9.anInt7126;
						local777 = ((local647 - local551) * local739 >> 16) + local647;
						arg1.anInt5260 = this.aClass42_Sub1_9.anInt7136 + local777 * this.aClass42_Sub1_9.anInt7131 / this.aClass42_Sub1_9.anInt7126;
					} else if (local666 < this.aClass42_Sub1_9.anInt7126) {
						local739 = (local570 - this.aClass42_Sub1_9.anInt7126 << 16) / (local570 - local666);
						local750 = local532 + (local739 * (local532 - local628) >> 16);
						arg1.anInt5261 = this.aClass42_Sub1_9.anInt7108 + this.aClass42_Sub1_9.anInt7123 * local750 / this.aClass42_Sub1_9.anInt7126;
						local777 = ((local551 - local647) * local739 >> 16) + local551;
						arg1.anInt5260 = this.aClass42_Sub1_9.anInt7131 * local777 / this.aClass42_Sub1_9.anInt7126 + this.aClass42_Sub1_9.anInt7136;
					}
				}
			}
			if (local496) {
				if (local666 < local570) {
					arg1.anInt5258 = this.aClass42_Sub1_9.anInt7123 * (this.anInt4371 + local532) / local570 + this.aClass42_Sub1_9.anInt7108 - arg1.anInt5261;
				} else {
					arg1.anInt5258 = (local628 + this.anInt4371) * this.aClass42_Sub1_9.anInt7123 / local666 + this.aClass42_Sub1_9.anInt7108 - arg1.anInt5262;
				}
				arg1.aBoolean404 = true;
			}
		}
		this.aClass42_Sub1_9.method5889();
		this.aClass42_Sub1_9.method5977(local16);
		this.method3742();
		this.method3745();
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(IIII)V")
	@Override
	protected void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static332.anInt6357 = 0;
			local11 = 0;
			Static227.anInt4859 = 0;
			Static501.anInt9053 = 0;
			for (local17 = 0; local17 < this.anInt4398; local17++) {
				Static227.anInt4859 += this.anIntArray330[local17];
				Static332.anInt6357 += this.anIntArray329[local17];
				local11++;
				Static501.anInt9053 += this.anIntArray326[local17];
			}
			if (local11 > 0) {
				Static501.anInt9053 = Static501.anInt9053 / local11 + arg3;
				Static227.anInt4859 = arg1 + Static227.anInt4859 / local11;
				Static332.anInt6357 = Static332.anInt6357 / local11 + arg2;
			} else {
				Static332.anInt6357 = arg2;
				Static501.anInt9053 = arg3;
				Static227.anInt4859 = arg1;
			}
		} else if (arg0 == 1) {
			for (local11 = 0; local11 < this.anInt4398; local11++) {
				this.anIntArray330[local11] += arg1;
				this.anIntArray329[local11] += arg2;
				this.anIntArray326[local11] += arg3;
			}
		} else {
			@Pc(163) int local163;
			@Pc(181) int local181;
			if (arg0 == 2) {
				for (local11 = 0; local11 < this.anInt4398; local11++) {
					this.anIntArray330[local11] -= Static227.anInt4859;
					this.anIntArray329[local11] -= Static332.anInt6357;
					this.anIntArray326[local11] -= Static501.anInt9053;
					if (arg3 != 0) {
						local17 = Class12_Sub1_Sub36.anIntArray667[arg3];
						local163 = Class12_Sub1_Sub36.anIntArray668[arg3];
						local181 = local17 * this.anIntArray329[local11] + this.anIntArray330[local11] * local163 + 32767 >> 15;
						this.anIntArray329[local11] = local163 * this.anIntArray329[local11] + 32767 - this.anIntArray330[local11] * local17 >> 15;
						this.anIntArray330[local11] = local181;
					}
					if (arg1 != 0) {
						local17 = Class12_Sub1_Sub36.anIntArray667[arg1];
						local163 = Class12_Sub1_Sub36.anIntArray668[arg1];
						local181 = this.anIntArray329[local11] * local163 + 32767 - this.anIntArray326[local11] * local17 >> 15;
						this.anIntArray326[local11] = local17 * this.anIntArray329[local11] + local163 * this.anIntArray326[local11] + 32767 >> 15;
						this.anIntArray329[local11] = local181;
					}
					if (arg2 != 0) {
						local17 = Class12_Sub1_Sub36.anIntArray667[arg2];
						local163 = Class12_Sub1_Sub36.anIntArray668[arg2];
						local181 = this.anIntArray326[local11] * local17 + this.anIntArray330[local11] * local163 + 32767 >> 15;
						this.anIntArray326[local11] = this.anIntArray326[local11] * local163 + 32767 - this.anIntArray330[local11] * local17 >> 15;
						this.anIntArray330[local11] = local181;
					}
					this.anIntArray330[local11] += Static227.anInt4859;
					this.anIntArray329[local11] += Static332.anInt6357;
					this.anIntArray326[local11] += Static501.anInt9053;
				}
			} else if (arg0 == 3) {
				for (local11 = 0; local11 < this.anInt4398; local11++) {
					this.anIntArray330[local11] -= Static227.anInt4859;
					this.anIntArray329[local11] -= Static332.anInt6357;
					this.anIntArray326[local11] -= Static501.anInt9053;
					this.anIntArray330[local11] = arg1 * this.anIntArray330[local11] / 128;
					this.anIntArray329[local11] = this.anIntArray329[local11] * arg2 / 128;
					this.anIntArray326[local11] = arg3 * this.anIntArray326[local11] / 128;
					this.anIntArray330[local11] += Static227.anInt4859;
					this.anIntArray329[local11] += Static332.anInt6357;
					this.anIntArray326[local11] += Static501.anInt9053;
				}
			} else {
				@Pc(509) Class151 local509;
				@Pc(514) Class264 local514;
				if (arg0 == 5) {
					for (local11 = 0; local11 < this.anInt4418; local11++) {
						local17 = arg1 * 8 + (this.aByteArray50[local11] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray50[local11] = (byte) local17;
					}
					if (this.aClass151Array1 != null) {
						for (local17 = 0; local17 < this.anInt4424; local17++) {
							local509 = this.aClass151Array1[local17];
							local514 = this.aClass264Array1[local17];
							local514.anInt7968 = local514.anInt7968 & 0xFFFFFF | 255 - (this.aByteArray50[local509.anInt4690] & 0xFF) << 24;
						}
					}
					this.method3735();
				} else if (arg0 == 7) {
					for (local11 = 0; local11 < this.anInt4418; local11++) {
						local17 = this.aShortArray66[local11] & 0xFFFF;
						local163 = local17 >> 10 & 0x3F;
						local181 = local17 >> 7 & 0x7;
						@Pc(574) int local574 = local17 & 0x7F;
						local181 += arg2 / 4;
						@Pc(586) int local586 = arg1 + local163 & 0x3F;
						if (local181 < 0) {
							local181 = 0;
						} else if (local181 > 7) {
							local181 = 7;
						}
						local574 += arg3;
						if (local574 < 0) {
							local574 = 0;
						} else if (local574 > 127) {
							local574 = 127;
						}
						this.aShortArray66[local11] = (short) (local574 | local586 << 10 | local181 << 7);
					}
					if (this.aClass151Array1 != null) {
						for (local17 = 0; local17 < this.anInt4424; local17++) {
							local509 = this.aClass151Array1[local17];
							local514 = this.aClass264Array1[local17];
							local514.anInt7968 = local514.anInt7968 & 0xFF000000 | Static141.anIntArray234[this.aShortArray66[local509.anInt4690] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method3735();
				} else {
					@Pc(694) Class264 local694;
					if (arg0 == 8) {
						for (local11 = 0; local11 < this.anInt4424; local11++) {
							local694 = this.aClass264Array1[local11];
							local694.anInt7969 += arg1;
							local694.anInt7961 += arg2;
						}
					} else if (arg0 == 10) {
						for (local11 = 0; local11 < this.anInt4424; local11++) {
							local694 = this.aClass264Array1[local11];
							local694.anInt7963 = local694.anInt7963 * arg2 >> 7;
							local694.anInt7967 = arg1 * local694.anInt7967 >> 7;
						}
					} else if (arg0 == 9) {
						for (local11 = 0; local11 < this.anInt4424; local11++) {
							local694 = this.aClass264Array1[local11];
							local694.anInt7964 = local694.anInt7964 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lclient!ig;")
	@Override
	public Class142[] method8006() {
		return this.aClass142Array4;
	}

	@OriginalMember(owner = "client!i", name = "sa", descriptor = "()Z")
	@Override
	protected boolean sa() {
		if (this.anIntArrayArray42 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt4405; local12++) {
			this.anIntArray330[local12] <<= 0x4;
			this.anIntArray329[local12] <<= 0x4;
			this.anIntArray326[local12] <<= 0x4;
		}
		Static501.anInt9053 = 0;
		Static332.anInt6357 = 0;
		Static227.anInt4859 = 0;
		return true;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class26 method7992(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class26_Sub2 local12;
		@Pc(16) Class26_Sub2 local16;
		if (arg0 == 1) {
			local12 = this.aClass42_Sub1_9.aClass26_Sub2_28;
			local16 = this.aClass42_Sub1_9.aClass26_Sub2_27;
		} else if (arg0 == 2) {
			local16 = this.aClass42_Sub1_9.aClass26_Sub2_25;
			local12 = this.aClass42_Sub1_9.aClass26_Sub2_24;
		} else if (arg0 == 3) {
			local16 = this.aClass42_Sub1_9.aClass26_Sub2_22;
			local12 = this.aClass42_Sub1_9.aClass26_Sub2_21;
		} else if (arg0 == 4) {
			local12 = this.aClass42_Sub1_9.aClass26_Sub2_26;
			local16 = this.aClass42_Sub1_9.aClass26_Sub2_30;
		} else if (arg0 == 5) {
			local16 = this.aClass42_Sub1_9.aClass26_Sub2_23;
			local12 = this.aClass42_Sub1_9.aClass26_Sub2_29;
		} else {
			local12 = local16 = new Class26_Sub2(this.aClass42_Sub1_9, 0, 0, true, false);
		}
		return this.method3740(local16, local12, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!i", name = "BA", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			Static501.anInt9053 = 0;
			Static332.anInt6357 = 0;
			local31 = 0;
			Static227.anInt4859 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray42.length > local41) {
					local55 = this.anIntArrayArray42[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray73 == null || (this.aShortArray73[local63] & arg6) != 0) {
							Static227.anInt4859 += this.anIntArray330[local63];
							Static332.anInt6357 += this.anIntArray329[local63];
							local31++;
							Static501.anInt9053 += this.anIntArray326[local63];
						}
					}
				}
			}
			if (local31 <= 0) {
				Static227.anInt4859 = arg2;
				Static332.anInt6357 = arg3;
				Static501.anInt9053 = arg4;
			} else {
				Static316.aBoolean458 = true;
				Static332.anInt6357 = arg3 + Static332.anInt6357 / local31;
				Static227.anInt4859 = Static227.anInt4859 / local31 + arg2;
				Static501.anInt9053 = Static501.anInt9053 / local31 + arg4;
			}
			return;
		}
		@Pc(250) int[] local250;
		@Pc(252) int local252;
		if (arg0 == 1) {
			if (arg7 != null) {
				local31 = arg7[0] * arg2 + arg7[1] * arg3 + arg4 * arg7[2] + 16384 >> 15;
				local35 = arg7[5] * arg4 + arg3 * arg7[4] + arg7[3] * arg2 + 16384 >> 15;
				local41 = arg4 * arg7[8] + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
				arg2 = local31;
				arg4 = local41;
				arg3 = local35;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray42.length > local35) {
					local250 = this.anIntArrayArray42[local35];
					for (local252 = 0; local252 < local250.length; local252++) {
						local57 = local250[local252];
						if (this.aShortArray73 == null || (arg6 & this.aShortArray73[local57]) != 0) {
							this.anIntArray330[local57] += arg2;
							this.anIntArray329[local57] += arg3;
							this.anIntArray326[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(387) int local387;
		@Pc(405) int local405;
		@Pc(640) int local640;
		@Pc(649) int local649;
		@Pc(659) int local659;
		@Pc(663) int local663;
		@Pc(681) int local681;
		@Pc(1010) int local1010;
		@Pc(1018) int local1018;
		@Pc(1173) int local1173;
		@Pc(1199) int local1199;
		@Pc(1204) int local1204;
		@Pc(1212) int local1212;
		@Pc(1217) int local1217;
		@Pc(1221) int local1221;
		@Pc(1225) int local1225;
		@Pc(1227) int local1227;
		@Pc(1355) int[] local1355;
		@Pc(1357) int local1357;
		@Pc(1361) int local1361;
		@Pc(1365) int local1365;
		@Pc(1367) int local1367;
		@Pc(1493) int local1493;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray42.length > local35) {
						local250 = this.anIntArrayArray42[local35];
						for (local252 = 0; local252 < local250.length; local252++) {
							local57 = local250[local252];
							if (this.aShortArray73 == null || (this.aShortArray73[local57] & arg6) != 0) {
								this.anIntArray330[local57] -= Static227.anInt4859;
								this.anIntArray329[local57] -= Static332.anInt6357;
								this.anIntArray326[local57] -= Static501.anInt9053;
								if (arg4 != 0) {
									local63 = Class12_Sub1_Sub36.anIntArray667[arg4];
									local387 = Class12_Sub1_Sub36.anIntArray668[arg4];
									local405 = local63 * this.anIntArray329[local57] + this.anIntArray330[local57] * local387 + 32767 >> 15;
									this.anIntArray329[local57] = local387 * this.anIntArray329[local57] + 32767 - this.anIntArray330[local57] * local63 >> 15;
									this.anIntArray330[local57] = local405;
								}
								if (arg2 != 0) {
									local63 = Class12_Sub1_Sub36.anIntArray667[arg2];
									local387 = Class12_Sub1_Sub36.anIntArray668[arg2];
									local405 = this.anIntArray329[local57] * local387 + 32767 - local63 * this.anIntArray326[local57] >> 15;
									this.anIntArray326[local57] = this.anIntArray326[local57] * local387 + this.anIntArray329[local57] * local63 + 32767 >> 15;
									this.anIntArray329[local57] = local405;
								}
								if (arg3 != 0) {
									local63 = Class12_Sub1_Sub36.anIntArray667[arg3];
									local387 = Class12_Sub1_Sub36.anIntArray668[arg3];
									local405 = local387 * this.anIntArray330[local57] + local63 * this.anIntArray326[local57] + 32767 >> 15;
									this.anIntArray326[local57] = this.anIntArray326[local57] * local387 + 32767 - this.anIntArray330[local57] * local63 >> 15;
									this.anIntArray330[local57] = local405;
								}
								this.anIntArray330[local57] += Static227.anInt4859;
								this.anIntArray329[local57] += Static332.anInt6357;
								this.anIntArray326[local57] += Static501.anInt9053;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray42.length > local41) {
							local55 = this.anIntArrayArray42[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray73 == null || (this.aShortArray73[local63] & arg6) != 0) {
									local387 = this.anIntArray325[local63];
									local405 = this.anIntArray325[local63 + 1];
									for (local640 = local387; local640 < local405; local640++) {
										local649 = this.aShortArray69[local640] - 1;
										if (local649 == -1) {
											break;
										}
										if (arg4 != 0) {
											local659 = Class12_Sub1_Sub36.anIntArray667[arg4];
											local663 = Class12_Sub1_Sub36.anIntArray668[arg4];
											local681 = local663 * this.aShortArray65[local649] + this.aShortArray72[local649] * local659 + 32767 >> 15;
											this.aShortArray72[local649] = (short) (local663 * this.aShortArray72[local649] + 32767 - local659 * this.aShortArray65[local649] >> 15);
											this.aShortArray65[local649] = (short) local681;
										}
										if (arg2 != 0) {
											local659 = Class12_Sub1_Sub36.anIntArray667[arg2];
											local663 = Class12_Sub1_Sub36.anIntArray668[arg2];
											local681 = local663 * this.aShortArray72[local649] + 32767 - local659 * this.aShortArray63[local649] >> 15;
											this.aShortArray63[local649] = (short) (local663 * this.aShortArray63[local649] + local659 * this.aShortArray72[local649] + 32767 >> 15);
											this.aShortArray72[local649] = (short) local681;
										}
										if (arg3 != 0) {
											local659 = Class12_Sub1_Sub36.anIntArray667[arg3];
											local663 = Class12_Sub1_Sub36.anIntArray668[arg3];
											local681 = this.aShortArray65[local649] * local663 + this.aShortArray63[local649] * local659 + 32767 >> 15;
											this.aShortArray63[local649] = (short) (local663 * this.aShortArray63[local649] + 32767 - local659 * this.aShortArray65[local649] >> 15);
											this.aShortArray65[local649] = (short) local681;
										}
									}
								}
							}
						}
					}
					this.method3738();
					return;
				}
			} else {
				local31 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local252 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static316.aBoolean458) {
					local387 = Static501.anInt9053 * arg7[6] + Static332.anInt6357 * arg7[3] + arg7[0] * Static227.anInt4859 + 16384 >> 15;
					local405 = Static227.anInt4859 * arg7[1] + arg7[4] * Static332.anInt6357 + Static501.anInt9053 * arg7[7] + 16384 >> 15;
					local640 = Static501.anInt9053 * arg7[8] + arg7[2] * Static227.anInt4859 + Static332.anInt6357 * arg7[5] + 16384 >> 15;
					local405 += local57;
					local387 += local252;
					Static227.anInt4859 = local387;
					Static332.anInt6357 = local405;
					local640 += local63;
					Static501.anInt9053 = local640;
					Static316.aBoolean458 = false;
				}
				@Pc(978) int[] local978 = new int[9];
				local405 = Class12_Sub1_Sub36.anIntArray668[arg2];
				local640 = Class12_Sub1_Sub36.anIntArray667[arg2];
				local649 = Class12_Sub1_Sub36.anIntArray668[arg3];
				local659 = Class12_Sub1_Sub36.anIntArray667[arg3];
				local663 = Class12_Sub1_Sub36.anIntArray668[arg4];
				local681 = Class12_Sub1_Sub36.anIntArray667[arg4];
				local1010 = local640 * local663 + 16384 >> 15;
				local1018 = local640 * local681 + 16384 >> 15;
				local978[6] = local1018 * local649 + -local659 * local663 + 16384 >> 15;
				local978[3] = local681 * local405 + 16384 >> 15;
				local978[5] = -local640;
				local978[4] = local663 * local405 + 16384 >> 15;
				local978[7] = local649 * local1010 + local659 * local681 + 16384 >> 15;
				local978[2] = local405 * local659 + 16384 >> 15;
				local978[0] = local649 * local663 + local1018 * local659 + 16384 >> 15;
				local978[8] = local405 * local649 + 16384 >> 15;
				local978[1] = local659 * local1010 + -local649 * local681 + 16384 >> 15;
				@Pc(1147) int local1147 = local978[1] * -Static332.anInt6357 + local978[0] * -Static227.anInt4859 + local978[2] * -Static501.anInt9053 + 16384 >> 15;
				local1173 = -Static501.anInt9053 * local978[5] + -Static227.anInt4859 * local978[3] + -Static332.anInt6357 * local978[4] + 16384 >> 15;
				local1199 = local978[8] * -Static501.anInt9053 + -Static227.anInt4859 * local978[6] + -Static332.anInt6357 * local978[7] + 16384 >> 15;
				local1204 = local1147 + Static227.anInt4859;
				@Pc(1208) int local1208 = Static332.anInt6357 + local1173;
				local1212 = Static501.anInt9053 + local1199;
				@Pc(1215) int[] local1215 = new int[9];
				for (local1217 = 0; local1217 < 3; local1217++) {
					for (local1221 = 0; local1221 < 3; local1221++) {
						local1225 = 0;
						for (local1227 = 0; local1227 < 3; local1227++) {
							local1225 += arg7[local1221 * 3 + local1227] * local978[local1227 + local1217 * 3];
						}
						local1215[local1217 * 3 + local1221] = local1225 + 16384 >> 15;
					}
				}
				local1221 = local978[2] * local63 + local978[0] * local252 + local978[1] * local57 + 16384 >> 15;
				local1225 = local63 * local978[5] + local978[3] * local252 + local978[4] * local57 + 16384 >> 15;
				local1221 += local1204;
				local1227 = local978[6] * local252 + local978[7] * local57 + local63 * local978[8] + 16384 >> 15;
				local1225 += local1208;
				local1227 += local1212;
				local1355 = new int[9];
				for (local1357 = 0; local1357 < 3; local1357++) {
					for (local1361 = 0; local1361 < 3; local1361++) {
						local1365 = 0;
						for (local1367 = 0; local1367 < 3; local1367++) {
							local1365 += local1215[local1361 + local1367 * 3] * arg7[local1357 * 3 + local1367];
						}
						local1355[local1357 * 3 + local1361] = local1365 + 16384 >> 15;
					}
				}
				local1361 = local1225 * arg7[1] + local1221 * arg7[0] + arg7[2] * local1227 + 16384 >> 15;
				local1365 = arg7[4] * local1225 + arg7[3] * local1221 + local1227 * arg7[5] + 16384 >> 15;
				local1365 += local35;
				local1367 = arg7[8] * local1227 + local1221 * arg7[6] + local1225 * arg7[7] + 16384 >> 15;
				local1361 += local31;
				local1367 += local41;
				for (local1493 = 0; local1493 < local8; local1493++) {
					@Pc(1499) int local1499 = arg1[local1493];
					if (local1499 < this.anIntArrayArray42.length) {
						@Pc(1513) int[] local1513 = this.anIntArrayArray42[local1499];
						for (@Pc(1515) int local1515 = 0; local1515 < local1513.length; local1515++) {
							@Pc(1521) int local1521 = local1513[local1515];
							if (this.aShortArray73 == null || (arg6 & this.aShortArray73[local1521]) != 0) {
								@Pc(1562) int local1562 = local1355[1] * this.anIntArray329[local1521] + local1355[0] * this.anIntArray330[local1521] + this.anIntArray326[local1521] * local1355[2] + 16384 >> 15;
								@Pc(1594) int local1594 = this.anIntArray329[local1521] * local1355[4] + local1355[3] * this.anIntArray330[local1521] + local1355[5] * this.anIntArray326[local1521] + 16384 >> 15;
								@Pc(1598) int local1598 = local1562 + local1361;
								@Pc(1602) int local1602 = local1594 + local1365;
								@Pc(1633) int local1633 = this.anIntArray326[local1521] * local1355[8] + local1355[7] * this.anIntArray329[local1521] + local1355[6] * this.anIntArray330[local1521] + 16384 >> 15;
								this.anIntArray330[local1521] = local1598;
								@Pc(1642) int local1642 = local1633 + local1367;
								this.anIntArray329[local1521] = local1602;
								this.anIntArray326[local1521] = local1642;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2606) Class264 local2606;
			@Pc(2481) boolean local2481;
			@Pc(2601) Class151 local2601;
			if (arg0 == 5) {
				if (this.anIntArrayArray44 != null) {
					local2481 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray44.length > local41) {
							local55 = this.anIntArrayArray44[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray68 == null || (this.aShortArray68[local63] & arg6) != 0) {
									local387 = (this.aByteArray50[local63] & 0xFF) + (arg2 * 8);
									if (local387 < 0) {
										local387 = 0;
									} else if (local387 > 255) {
										local387 = 255;
									}
									this.aByteArray50[local63] = (byte) local387;
								}
							}
							local2481 |= local55.length > 0;
						}
					}
					if (local2481) {
						if (this.aClass151Array1 != null) {
							for (local41 = 0; local41 < this.anInt4424; local41++) {
								local2601 = this.aClass151Array1[local41];
								local2606 = this.aClass264Array1[local41];
								local2606.anInt7968 = local2606.anInt7968 & 0xFFFFFF | 255 - (this.aByteArray50[local2601.anInt4690] & 0xFF) << 24;
							}
						}
						this.method3735();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray44 != null) {
					local2481 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray44.length > local41) {
							local55 = this.anIntArrayArray44[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray68 == null || (arg6 & this.aShortArray68[local63]) != 0) {
									local387 = this.aShortArray66[local63] & 0xFFFF;
									local405 = local387 >> 10 & 0x3F;
									local640 = local387 >> 7 & 0x7;
									local649 = local387 & 0x7F;
									local640 += arg3 / 4;
									@Pc(2718) int local2718 = local405 + arg2 & 0x3F;
									local649 += arg4;
									if (local640 < 0) {
										local640 = 0;
									} else if (local640 > 7) {
										local640 = 7;
									}
									if (local649 < 0) {
										local649 = 0;
									} else if (local649 > 127) {
										local649 = 127;
									}
									this.aShortArray66[local63] = (short) (local649 | local640 << 7 | local2718 << 10);
								}
							}
							local2481 |= local55.length > 0;
						}
					}
					if (local2481) {
						if (this.aClass151Array1 != null) {
							for (local41 = 0; local41 < this.anInt4424; local41++) {
								local2601 = this.aClass151Array1[local41];
								local2606 = this.aClass264Array1[local41];
								local2606.anInt7968 = Static141.anIntArray234[this.aShortArray66[local2601.anInt4690] & 0xFFFF] & 0xFFFFFF | local2606.anInt7968 & 0xFF000000;
							}
						}
						this.method3735();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray43 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray43.length) {
							local250 = this.anIntArrayArray43[local35];
							for (local252 = 0; local252 < local250.length; local252++) {
								local2606 = this.aClass264Array1[local250[local252]];
								local2606.anInt7969 += arg2;
								local2606.anInt7961 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray43 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray43.length) {
							local250 = this.anIntArrayArray43[local35];
							for (local252 = 0; local252 < local250.length; local252++) {
								local2606 = this.aClass264Array1[local250[local252]];
								local2606.anInt7967 = local2606.anInt7967 * arg2 >> 7;
								local2606.anInt7963 = local2606.anInt7963 * arg3 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray43 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray43.length) {
						local250 = this.anIntArrayArray43[local35];
						for (local252 = 0; local252 < local250.length; local252++) {
							local2606 = this.aClass264Array1[local250[local252]];
							local2606.anInt7964 = arg2 + local2606.anInt7964 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray42.length > local35) {
					local250 = this.anIntArrayArray42[local35];
					for (local252 = 0; local252 < local250.length; local252++) {
						local57 = local250[local252];
						if (this.aShortArray73 == null || (this.aShortArray73[local57] & arg6) != 0) {
							this.anIntArray330[local57] -= Static227.anInt4859;
							this.anIntArray329[local57] -= Static332.anInt6357;
							this.anIntArray326[local57] -= Static501.anInt9053;
							this.anIntArray330[local57] = arg2 * this.anIntArray330[local57] >> 7;
							this.anIntArray329[local57] = arg3 * this.anIntArray329[local57] >> 7;
							this.anIntArray326[local57] = arg4 * this.anIntArray326[local57] >> 7;
							this.anIntArray330[local57] += Static227.anInt4859;
							this.anIntArray329[local57] += Static332.anInt6357;
							this.anIntArray326[local57] += Static501.anInt9053;
						}
					}
				}
			}
		} else {
			local31 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local252 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static316.aBoolean458) {
				local387 = Static501.anInt9053 * arg7[6] + Static332.anInt6357 * arg7[3] + Static227.anInt4859 * arg7[0] + 16384 >> 15;
				local405 = Static332.anInt6357 * arg7[4] + Static227.anInt4859 * arg7[1] + Static501.anInt9053 * arg7[7] + 16384 >> 15;
				local387 += local252;
				local405 += local57;
				local640 = arg7[2] * Static227.anInt4859 + arg7[5] * Static332.anInt6357 + arg7[8] * Static501.anInt9053 + 16384 >> 15;
				Static227.anInt4859 = local387;
				local640 += local63;
				Static332.anInt6357 = local405;
				Static501.anInt9053 = local640;
				Static316.aBoolean458 = false;
			}
			local387 = arg2 << 15 >> 7;
			local405 = arg3 << 15 >> 7;
			local640 = arg4 << 15 >> 7;
			local649 = -Static227.anInt4859 * local387 + 16384 >> 15;
			local659 = -Static332.anInt6357 * local405 + 16384 >> 15;
			local663 = local640 * -Static501.anInt9053 + 16384 >> 15;
			local681 = local649 + Static227.anInt4859;
			local1010 = Static332.anInt6357 + local659;
			local1018 = local663 + Static501.anInt9053;
			@Pc(2005) int[] local2005 = new int[] { arg7[0] * local387 + 16384 >> 15, local387 * arg7[3] + 16384 >> 15, arg7[6] * local387 + 16384 >> 15, local405 * arg7[1] + 16384 >> 15, arg7[4] * local405 + 16384 >> 15, local405 * arg7[7] + 16384 >> 15, arg7[2] * local640 + 16384 >> 15, local640 * arg7[5] + 16384 >> 15, arg7[8] * local640 + 16384 >> 15 };
			local1173 = local387 * local252 + 16384 >> 15;
			local1199 = local405 * local57 + 16384 >> 15;
			@Pc(2133) int local2133 = local1173 + local681;
			local1204 = local640 * local63 + 16384 >> 15;
			@Pc(2145) int local2145 = local1199 + local1010;
			@Pc(2149) int local2149 = local1204 + local1018;
			@Pc(2152) int[] local2152 = new int[9];
			@Pc(2158) int local2158;
			for (local1212 = 0; local1212 < 3; local1212++) {
				for (local2158 = 0; local2158 < 3; local2158++) {
					local1217 = 0;
					for (local1221 = 0; local1221 < 3; local1221++) {
						local1217 += arg7[local1221 + local1212 * 3] * local2005[local1221 * 3 + local2158];
					}
					local2152[local1212 * 3 + local2158] = local1217 + 16384 >> 15;
				}
			}
			local2158 = arg7[2] * local2149 + local2133 * arg7[0] + arg7[1] * local2145 + 16384 >> 15;
			local1217 = local2145 * arg7[4] + local2133 * arg7[3] + local2149 * arg7[5] + 16384 >> 15;
			local2158 += local31;
			local1221 = local2133 * arg7[6] + arg7[7] * local2145 + arg7[8] * local2149 + 16384 >> 15;
			local1217 += local35;
			local1221 += local41;
			for (local1225 = 0; local1225 < local8; local1225++) {
				local1227 = arg1[local1225];
				if (this.anIntArrayArray42.length > local1227) {
					local1355 = this.anIntArrayArray42[local1227];
					for (local1357 = 0; local1357 < local1355.length; local1357++) {
						local1361 = local1355[local1357];
						if (this.aShortArray73 == null || (this.aShortArray73[local1361] & arg6) != 0) {
							local1365 = local2152[2] * this.anIntArray326[local1361] + this.anIntArray330[local1361] * local2152[0] + local2152[1] * this.anIntArray329[local1361] + 16384 >> 15;
							local1367 = this.anIntArray329[local1361] * local2152[4] + local2152[3] * this.anIntArray330[local1361] + this.anIntArray326[local1361] * local2152[5] + 16384 >> 15;
							@Pc(2398) int local2398 = local1367 + local1217;
							local1493 = local2152[6] * this.anIntArray330[local1361] + this.anIntArray329[local1361] * local2152[7] + this.anIntArray326[local1361] * local2152[8] + 16384 >> 15;
							@Pc(2434) int local2434 = local1365 + local2158;
							@Pc(2438) int local2438 = local1493 + local1221;
							this.anIntArray330[local1361] = local2434;
							this.anIntArray329[local1361] = local2398;
							this.anIntArray326[local1361] = local2438;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "pa", descriptor = "(SS)V")
	@Override
	public void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4418; local3++) {
			if (this.aShortArray66[local3] == arg0) {
				this.aShortArray66[local3] = arg1;
			}
		}
		if (this.aClass151Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt4424; local34++) {
				@Pc(41) Class151 local41 = this.aClass151Array1[local34];
				@Pc(46) Class264 local46 = this.aClass264Array1[local34];
				local46.anInt7968 = local46.anInt7968 & 0xFF000000 | Static141.anIntArray234[this.aShortArray66[local41.anInt4690] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method3735();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!m;Lclient!kn;II)V")
	@Override
	public void method7994(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class7_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4395 == 0) {
			return;
		}
		@Pc(16) Class91_Sub2 local16 = this.aClass42_Sub1_9.aClass91_Sub2_16;
		@Pc(19) Class91_Sub2 local19 = (Class91_Sub2) arg0;
		if (!this.aBoolean350) {
			this.method3737();
		}
		Static88.aFloat56 = local19.aFloat135 * local16.aFloat140 + local16.aFloat136 * local19.aFloat144 + local16.aFloat133 * local19.aFloat138 + local16.aFloat135;
		Static301.aFloat121 = local19.aFloat134 * local16.aFloat133 + local16.aFloat136 * local19.aFloat143 + local19.aFloat133 * local16.aFloat140;
		@Pc(72) float local72 = Static88.aFloat56 + Static301.aFloat121 * (float) this.anInt4376;
		@Pc(80) float local80 = Static301.aFloat121 * (float) this.anInt4407 + Static88.aFloat56;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local80 < local72) {
			local90 = (float) this.anInt4371 + local72;
			local97 = (float) -this.anInt4371 + local80;
		} else {
			local97 = local72 - (float) this.anInt4371;
			local90 = local80 + (float) this.anInt4371;
		}
		if (local97 >= this.aClass42_Sub1_9.aFloat153 || (float) this.aClass42_Sub1_9.anInt7126 >= local90) {
			return;
		}
		Static3.aFloat3 = local16.aFloat141 * local19.aFloat144 + local19.aFloat138 * local16.aFloat143 + local16.aFloat142 * local19.aFloat135 + local16.aFloat144;
		Static276.aFloat117 = local16.aFloat141 * local19.aFloat143 + local19.aFloat134 * local16.aFloat143 + local19.aFloat133 * local16.aFloat142;
		@Pc(173) float local173 = Static3.aFloat3 + (float) this.anInt4376 * Static276.aFloat117;
		@Pc(181) float local181 = Static3.aFloat3 + Static276.aFloat117 * (float) this.anInt4407;
		@Pc(207) float local207;
		@Pc(196) float local196;
		if (local181 < local173) {
			local196 = (local173 + (float) this.anInt4371) * (float) this.aClass42_Sub1_9.anInt7123;
			local207 = (local181 - (float) this.anInt4371) * (float) this.aClass42_Sub1_9.anInt7123;
		} else {
			local196 = (local181 + (float) this.anInt4371) * (float) this.aClass42_Sub1_9.anInt7123;
			local207 = (float) this.aClass42_Sub1_9.anInt7123 * (local173 - (float) this.anInt4371);
		}
		if (local207 / (float) arg2 >= this.aClass42_Sub1_9.aFloat161 || this.aClass42_Sub1_9.aFloat159 >= local196 / (float) arg2) {
			return;
		}
		Static473.aFloat183 = local16.aFloat139 * local19.aFloat133 + local16.aFloat134 * local19.aFloat134 + local19.aFloat143 * local16.aFloat137;
		Static201.aFloat113 = local16.aFloat138 + local16.aFloat139 * local19.aFloat135 + local16.aFloat134 * local19.aFloat138 + local16.aFloat137 * local19.aFloat144;
		@Pc(298) float local298 = Static473.aFloat183 * (float) this.anInt4376 + Static201.aFloat113;
		@Pc(306) float local306 = Static473.aFloat183 * (float) this.anInt4407 + Static201.aFloat113;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local298 > local306) {
			local321 = (local306 - (float) this.anInt4371) * (float) this.aClass42_Sub1_9.anInt7131;
			local332 = (local298 + (float) this.anInt4371) * (float) this.aClass42_Sub1_9.anInt7131;
		} else {
			local332 = (float) this.aClass42_Sub1_9.anInt7131 * (local306 + (float) this.anInt4371);
			local321 = (local298 - (float) this.anInt4371) * (float) this.aClass42_Sub1_9.anInt7131;
		}
		if (local321 / (float) arg2 >= this.aClass42_Sub1_9.aFloat154 || this.aClass42_Sub1_9.aFloat171 >= local332 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass151Array1 != null) {
			Static184.aFloat109 = local19.aFloat136 * local16.aFloat140 + local16.aFloat136 * local19.aFloat141 + local16.aFloat133 * local19.aFloat137;
			Static532.aFloat195 = local16.aFloat139 * local19.aFloat136 + local16.aFloat134 * local19.aFloat137 + local19.aFloat141 * local16.aFloat137;
			Static309.aFloat124 = local16.aFloat142 * local19.aFloat140 + local16.aFloat143 * local19.aFloat139 + local19.aFloat142 * local16.aFloat141;
			Static301.aFloat120 = local19.aFloat142 * local16.aFloat137 + local19.aFloat139 * local16.aFloat134 + local19.aFloat140 * local16.aFloat139;
			Static390.aFloat174 = local19.aFloat140 * local16.aFloat140 + local19.aFloat139 * local16.aFloat133 + local19.aFloat142 * local16.aFloat136;
			Static526.aFloat191 = local16.aFloat142 * local19.aFloat136 + local16.aFloat143 * local19.aFloat137 + local16.aFloat141 * local19.aFloat141;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.anInt4408 + this.anInt4390 >> 1;
			@Pc(507) int local507 = this.anInt4415 + this.anInt4377 >> 1;
			@Pc(526) int local526 = (int) (Static526.aFloat191 * (float) local499 + Static3.aFloat3 + Static276.aFloat117 * (float) this.anInt4376 + Static309.aFloat124 * (float) local507);
			@Pc(545) int local545 = (int) (Static532.aFloat195 * (float) local499 + Static201.aFloat113 + Static473.aFloat183 * (float) this.anInt4376 + (float) local507 * Static301.aFloat120);
			@Pc(564) int local564 = (int) ((float) local507 * Static390.aFloat174 + Static88.aFloat56 + Static184.aFloat109 * (float) local499 + Static301.aFloat121 * (float) this.anInt4376);
			@Pc(583) int local583 = (int) ((float) local507 * Static309.aFloat124 + (float) this.anInt4407 * Static276.aFloat117 + Static3.aFloat3 + (float) local499 * Static526.aFloat191);
			@Pc(602) int local602 = (int) (Static301.aFloat120 * (float) local507 + Static532.aFloat195 * (float) local499 + Static201.aFloat113 + Static473.aFloat183 * (float) this.anInt4407);
			arg1.anInt5259 = this.aClass42_Sub1_9.anInt7131 * local602 / arg2 + this.aClass42_Sub1_9.anInt7136;
			arg1.anInt5262 = this.aClass42_Sub1_9.anInt7108 + local583 * this.aClass42_Sub1_9.anInt7123 / arg2;
			@Pc(648) int local648 = (int) (Static390.aFloat174 * (float) local507 + (float) this.anInt4407 * Static301.aFloat121 + Static88.aFloat56 + Static184.aFloat109 * (float) local499);
			arg1.anInt5260 = this.aClass42_Sub1_9.anInt7131 * local545 / arg2 + this.aClass42_Sub1_9.anInt7136;
			arg1.anInt5261 = this.aClass42_Sub1_9.anInt7108 + this.aClass42_Sub1_9.anInt7123 * local526 / arg2;
			if (local564 < this.aClass42_Sub1_9.anInt7126 && this.aClass42_Sub1_9.anInt7126 > local648) {
				arg1.aBoolean404 = true;
				arg1.anInt5258 = (this.anInt4371 + local526) * this.aClass42_Sub1_9.anInt7123 / arg2 + this.aClass42_Sub1_9.anInt7108 - arg1.anInt5261;
			}
		}
		this.aClass42_Sub1_9.method5894((float) arg2);
		this.aClass42_Sub1_9.method5988();
		this.aClass42_Sub1_9.method5977(local19);
		this.method3742();
		this.method3745();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!i;Lclient!i;IBZZ)Lclient!r;")
	private Class26 method3740(@OriginalArg(0) Class26_Sub2 arg0, @OriginalArg(1) Class26_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		arg1.anInt4405 = this.anInt4405;
		arg1.anInt4400 = arg2;
		arg1.anInt4398 = this.anInt4398;
		arg1.anInt4395 = this.anInt4395;
		arg1.aShort64 = this.aShort64;
		arg1.anInt4418 = this.anInt4418;
		arg1.anInt4409 = this.anInt4409;
		arg1.anInt4366 = this.anInt4366;
		arg1.anInt4424 = this.anInt4424;
		arg1.aShort63 = this.aShort63;
		@Pc(56) boolean local56 = Static122.method2532(arg2, this.anInt4366);
		@Pc(62) boolean local62 = Static440.method6681(this.anInt4366, arg2);
		@Pc(68) boolean local68 = Static374.method5767(this.anInt4366, arg2);
		@Pc(74) boolean local74 = local68 | local56 | local62;
		@Pc(193) int local193;
		if (local74) {
			if (!local56) {
				arg1.anIntArray330 = this.anIntArray330;
			} else if (arg0.anIntArray330 == null || this.anInt4405 > arg0.anIntArray330.length) {
				arg1.anIntArray330 = arg0.anIntArray330 = new int[this.anInt4405];
			} else {
				arg1.anIntArray330 = arg0.anIntArray330;
			}
			if (!local62) {
				arg1.anIntArray329 = this.anIntArray329;
			} else if (arg0.anIntArray329 == null || this.anInt4405 > arg0.anIntArray329.length) {
				arg1.anIntArray329 = arg0.anIntArray329 = new int[this.anInt4405];
			} else {
				arg1.anIntArray329 = arg0.anIntArray329;
			}
			if (!local68) {
				arg1.anIntArray326 = this.anIntArray326;
			} else if (arg0.anIntArray326 == null || arg0.anIntArray326.length < this.anInt4405) {
				arg1.anIntArray326 = arg0.anIntArray326 = new int[this.anInt4405];
			} else {
				arg1.anIntArray326 = arg0.anIntArray326;
			}
			for (local193 = 0; local193 < this.anInt4405; local193++) {
				if (local56) {
					arg1.anIntArray330[local193] = this.anIntArray330[local193];
				}
				if (local62) {
					arg1.anIntArray329[local193] = this.anIntArray329[local193];
				}
				if (local68) {
					arg1.anIntArray326[local193] = this.anIntArray326[local193];
				}
			}
		} else {
			arg1.anIntArray326 = this.anIntArray326;
			arg1.anIntArray329 = this.anIntArray329;
			arg1.anIntArray330 = this.anIntArray330;
		}
		if (Static43.method849(arg2, this.anInt4366)) {
			arg1.aClass261_2 = arg0.aClass261_2;
			arg1.aClass261_2.anInterface10_10 = this.aClass261_2.anInterface10_10;
			arg1.aClass261_2.aBoolean549 = this.aClass261_2.aBoolean549;
			arg1.aClass261_2.aBoolean548 = true;
		} else if (Static254.method4370(arg2, this.anInt4366)) {
			arg1.aClass261_2 = this.aClass261_2;
		} else {
			arg1.aClass261_2 = null;
		}
		if (Static208.method3862(this.anInt4366, arg2)) {
			if (arg0.aShortArray66 == null || this.anInt4418 > arg0.aShortArray66.length) {
				arg1.aShortArray66 = arg0.aShortArray66 = new short[this.anInt4418];
			} else {
				arg1.aShortArray66 = arg0.aShortArray66;
			}
			for (local193 = 0; local193 < this.anInt4418; local193++) {
				arg1.aShortArray66[local193] = this.aShortArray66[local193];
			}
		} else {
			arg1.aShortArray66 = this.aShortArray66;
		}
		if (Static273.method4587(this.anInt4366, arg2)) {
			if (arg0.aByteArray50 == null || arg0.aByteArray50.length < this.anInt4418) {
				arg1.aByteArray50 = arg0.aByteArray50 = new byte[this.anInt4418];
			} else {
				arg1.aByteArray50 = arg0.aByteArray50;
			}
			for (local193 = 0; local193 < this.anInt4418; local193++) {
				arg1.aByteArray50[local193] = this.aByteArray50[local193];
			}
		} else {
			arg1.aByteArray50 = this.aByteArray50;
		}
		if (Static58.method1436(this.anInt4366, arg2)) {
			arg1.aClass261_3 = arg0.aClass261_3;
			arg1.aClass261_3.anInterface10_10 = this.aClass261_3.anInterface10_10;
			arg1.aClass261_3.aBoolean548 = true;
			arg1.aClass261_3.aBoolean549 = this.aClass261_3.aBoolean549;
		} else if (Static267.method4551(this.anInt4366, arg2)) {
			arg1.aClass261_3 = this.aClass261_3;
		} else {
			arg1.aClass261_3 = null;
		}
		@Pc(582) int local582;
		if (Static353.method5526(arg2, this.anInt4366)) {
			if (arg0.aShortArray65 == null || arg0.aShortArray65.length < this.anInt4395) {
				local193 = this.anInt4395;
				arg1.aShortArray65 = arg0.aShortArray65 = new short[local193];
				arg1.aShortArray72 = arg0.aShortArray72 = new short[local193];
				arg1.aShortArray63 = arg0.aShortArray63 = new short[local193];
			} else {
				arg1.aShortArray65 = arg0.aShortArray65;
				arg1.aShortArray72 = arg0.aShortArray72;
				arg1.aShortArray63 = arg0.aShortArray63;
			}
			if (this.aClass87_1 == null) {
				arg1.aClass87_1 = null;
				for (local193 = 0; local193 < this.anInt4395; local193++) {
					arg1.aShortArray65[local193] = this.aShortArray65[local193];
					arg1.aShortArray72[local193] = this.aShortArray72[local193];
					arg1.aShortArray63[local193] = this.aShortArray63[local193];
				}
			} else {
				if (arg0.aClass87_1 == null) {
					arg0.aClass87_1 = new Class87();
				}
				@Pc(566) Class87 local566 = arg1.aClass87_1 = arg0.aClass87_1;
				if (local566.aShortArray40 == null || local566.aShortArray40.length < this.anInt4395) {
					local582 = this.anInt4395;
					local566.aByteArray27 = new byte[local582];
					local566.aShortArray42 = new short[local582];
					local566.aShortArray40 = new short[local582];
					local566.aShortArray41 = new short[local582];
				}
				for (local582 = 0; local582 < this.anInt4395; local582++) {
					arg1.aShortArray65[local582] = this.aShortArray65[local582];
					arg1.aShortArray72[local582] = this.aShortArray72[local582];
					arg1.aShortArray63[local582] = this.aShortArray63[local582];
					local566.aShortArray40[local582] = this.aClass87_1.aShortArray40[local582];
					local566.aShortArray41[local582] = this.aClass87_1.aShortArray41[local582];
					local566.aShortArray42[local582] = this.aClass87_1.aShortArray42[local582];
					local566.aByteArray27[local582] = this.aClass87_1.aByteArray27[local582];
				}
			}
			arg1.aByteArray51 = this.aByteArray51;
		} else {
			arg1.aShortArray63 = this.aShortArray63;
			arg1.aByteArray51 = this.aByteArray51;
			arg1.aShortArray72 = this.aShortArray72;
			arg1.aClass87_1 = this.aClass87_1;
			arg1.aShortArray65 = this.aShortArray65;
		}
		if (Static173.method3445(this.anInt4366, arg2)) {
			arg1.aClass261_1 = arg0.aClass261_1;
			arg1.aClass261_1.anInterface10_10 = this.aClass261_1.anInterface10_10;
			arg1.aClass261_1.aBoolean549 = this.aClass261_1.aBoolean549;
			arg1.aClass261_1.aBoolean548 = true;
		} else if (Static249.method4291(arg2, this.anInt4366)) {
			arg1.aClass261_1 = this.aClass261_1;
		} else {
			arg1.aClass261_1 = null;
		}
		if (Static396.method6217(arg2, this.anInt4366)) {
			if (arg0.aFloatArray38 == null || this.anInt4418 > arg0.aFloatArray38.length) {
				local193 = this.anInt4395;
				arg1.aFloatArray38 = arg0.aFloatArray38 = new float[local193];
				arg1.aFloatArray37 = arg0.aFloatArray37 = new float[local193];
			} else {
				arg1.aFloatArray37 = arg0.aFloatArray37;
				arg1.aFloatArray38 = arg0.aFloatArray38;
			}
			for (local193 = 0; local193 < this.anInt4395; local193++) {
				arg1.aFloatArray38[local193] = this.aFloatArray38[local193];
				arg1.aFloatArray37[local193] = this.aFloatArray37[local193];
			}
		} else {
			arg1.aFloatArray37 = this.aFloatArray37;
			arg1.aFloatArray38 = this.aFloatArray38;
		}
		if (Static4.method199(arg2, this.anInt4366)) {
			arg1.lb = arg0.lb;
			arg1.lb.anInterface10_10 = this.lb.anInterface10_10;
			arg1.lb.aBoolean548 = true;
			arg1.lb.aBoolean549 = this.lb.aBoolean549;
		} else if (Static17.method391(this.anInt4366, arg2)) {
			arg1.lb = this.lb;
		} else {
			arg1.lb = null;
		}
		if (Static352.method5522(arg2, this.anInt4366)) {
			if (arg0.aShortArray71 == null || this.anInt4418 > arg0.aShortArray71.length) {
				local193 = this.anInt4418;
				arg1.aShortArray71 = arg0.aShortArray71 = new short[local193];
				arg1.aShortArray61 = arg0.aShortArray61 = new short[local193];
				arg1.aShortArray64 = arg0.aShortArray64 = new short[local193];
			} else {
				arg1.aShortArray61 = arg0.aShortArray61;
				arg1.aShortArray64 = arg0.aShortArray64;
				arg1.aShortArray71 = arg0.aShortArray71;
			}
			for (local193 = 0; local193 < this.anInt4418; local193++) {
				arg1.aShortArray71[local193] = this.aShortArray71[local193];
				arg1.aShortArray64[local193] = this.aShortArray64[local193];
				arg1.aShortArray61[local193] = this.aShortArray61[local193];
			}
		} else {
			arg1.aShortArray64 = this.aShortArray64;
			arg1.aShortArray61 = this.aShortArray61;
			arg1.aShortArray71 = this.aShortArray71;
		}
		if (Static448.method6772(this.anInt4366, arg2)) {
			arg1.aClass44_1 = arg0.aClass44_1;
			arg1.aClass44_1.aBoolean98 = this.aClass44_1.aBoolean98;
			arg1.aClass44_1.aBoolean97 = true;
			arg1.aClass44_1.anInterface18_5 = this.aClass44_1.anInterface18_5;
		} else if (Static51.method7363(this.anInt4366, arg2)) {
			arg1.aClass44_1 = this.aClass44_1;
		} else {
			arg1.aClass44_1 = null;
		}
		if (Static474.method7144(this.anInt4366, arg2)) {
			if (arg0.aShortArray70 == null || arg0.aShortArray70.length < this.anInt4418) {
				local193 = this.anInt4418;
				arg1.aShortArray70 = arg0.aShortArray70 = new short[local193];
			} else {
				arg1.aShortArray70 = arg0.aShortArray70;
			}
			for (local193 = 0; local193 < this.anInt4418; local193++) {
				arg1.aShortArray70[local193] = this.aShortArray70[local193];
			}
		} else {
			arg1.aShortArray70 = this.aShortArray70;
		}
		if (!Static139.method2815(arg2, this.anInt4366)) {
			arg1.aClass264Array1 = this.aClass264Array1;
		} else if (arg0.aClass264Array1 == null || this.anInt4424 > arg0.aClass264Array1.length) {
			local193 = this.anInt4424;
			arg1.aClass264Array1 = arg0.aClass264Array1 = new Class264[local193];
			for (local582 = 0; local582 < this.anInt4424; local582++) {
				arg1.aClass264Array1[local582] = this.aClass264Array1[local582].method6593();
			}
		} else {
			arg1.aClass264Array1 = arg0.aClass264Array1;
			for (local193 = 0; local193 < this.anInt4424; local193++) {
				arg1.aClass264Array1[local193].method6590(this.aClass264Array1[local193]);
			}
		}
		arg1.anIntArrayArray44 = this.anIntArrayArray44;
		arg1.aClass142Array4 = this.aClass142Array4;
		arg1.aShortArray67 = this.aShortArray67;
		arg1.aShortArray69 = this.aShortArray69;
		if (this.aBoolean350) {
			arg1.anInt4415 = this.anInt4415;
			arg1.anInt4407 = this.anInt4407;
			arg1.aBoolean350 = true;
			arg1.anInt4376 = this.anInt4376;
			arg1.anInt4408 = this.anInt4408;
			arg1.anInt4390 = this.anInt4390;
			arg1.anInt4377 = this.anInt4377;
			arg1.anInt4371 = this.anInt4371;
		} else {
			arg1.aBoolean350 = false;
		}
		arg1.aClass151Array1 = this.aClass151Array1;
		arg1.anIntArray328 = this.anIntArray328;
		arg1.aShortArray68 = this.aShortArray68;
		arg1.anIntArray325 = this.anIntArray325;
		arg1.anIntArray327 = this.anIntArray327;
		arg1.anIntArray324 = this.anIntArray324;
		arg1.anIntArrayArray43 = this.anIntArrayArray43;
		arg1.anIntArrayArray42 = this.anIntArrayArray42;
		arg1.aShortArray62 = this.aShortArray62;
		arg1.aClass265Array4 = this.aClass265Array4;
		arg1.aShortArray73 = this.aShortArray73;
		return arg1;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()[Lclient!rn;")
	@Override
	public Class265[] method7999() {
		return this.aClass265Array4;
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(I)Z")
	private boolean method3741() {
		@Pc(22) boolean local22 = !this.aClass261_3.aBoolean549;
		@Pc(35) boolean local35 = (this.anInt4366 & 0x37) != 0 && !this.aClass261_1.aBoolean549;
		@Pc(43) boolean local43 = !this.aClass261_2.aBoolean549;
		@Pc(51) boolean local51 = !this.lb.aBoolean549;
		if (!local43 && !local22 && !local35 && !local51) {
			return true;
		}
		@Pc(63) boolean local63 = true;
		@Pc(82) Interface10 local82;
		@Pc(96) Buffer local96;
		if (local43) {
			if (this.aClass261_2.anInterface10_11 == null) {
				this.aClass261_2.anInterface10_11 = this.aClass42_Sub1_9.method5930(this.aBoolean349);
			}
			local82 = this.aClass261_2.anInterface10_11;
			local82.method7897(12, this.anInt4395 * 12);
			local96 = local82.method7895();
			if (local96 == null) {
				local63 = false;
			} else {
				this.aClass42_Sub1_9.aNativeInterface3.copyPositions(this.anIntArray330, this.anIntArray329, this.anIntArray326, this.aShortArray67, 0, 12, this.anInt4395, local96.getAddress());
				if (local82.method7899()) {
					this.aClass261_2.anInterface10_10 = local82;
					this.aClass261_2.aBoolean549 = true;
				} else {
					local63 = false;
				}
			}
		}
		@Pc(214) short[] local214;
		@Pc(226) short[] local226;
		@Pc(218) short[] local218;
		@Pc(222) byte[] local222;
		if (local22) {
			if (this.aClass261_3.anInterface10_11 == null) {
				this.aClass261_3.anInterface10_11 = this.aClass42_Sub1_9.method5930(this.aBoolean349);
			}
			local82 = this.aClass261_3.anInterface10_11;
			local82.method7897(4, this.anInt4395 * 4);
			local96 = local82.method7895();
			if (local96 == null) {
				local63 = false;
			} else {
				if ((this.anInt4366 & 0x37) == 0) {
					if (this.aClass87_1 == null) {
						local222 = this.aByteArray51;
						local218 = this.aShortArray63;
						local214 = this.aShortArray65;
						local226 = this.aShortArray72;
					} else {
						local214 = this.aClass87_1.aShortArray40;
						local218 = this.aClass87_1.aShortArray42;
						local222 = this.aClass87_1.aByteArray27;
						local226 = this.aClass87_1.aShortArray41;
					}
					this.aClass42_Sub1_9.aNativeInterface3.copyLighting(this.aShortArray66, this.aByteArray50, this.aShortArray70, local214, local226, local218, local222, this.aShort63, this.aShort64, this.aShortArray62, 0, 4, this.anInt4395, local96.getAddress());
				} else {
					this.aClass42_Sub1_9.aNativeInterface3.copyColours(this.aShortArray66, this.aByteArray50, this.aShortArray70, this.aShort63, this.aShortArray62, 0, 4, this.anInt4395, local96.getAddress());
				}
				if (local82.method7899()) {
					this.aClass261_3.aBoolean549 = true;
					this.aClass261_3.anInterface10_10 = local82;
				} else {
					local63 = false;
				}
			}
		}
		if (local35) {
			if (this.aClass261_1.anInterface10_11 == null) {
				this.aClass261_1.anInterface10_11 = this.aClass42_Sub1_9.method5930(this.aBoolean349);
			}
			local82 = this.aClass261_1.anInterface10_11;
			local82.method7897(12, this.anInt4395 * 12);
			local96 = local82.method7895();
			if (local96 == null) {
				local63 = false;
			} else {
				if (this.aClass87_1 == null) {
					local226 = this.aShortArray72;
					local214 = this.aShortArray65;
					local218 = this.aShortArray63;
					local222 = this.aByteArray51;
				} else {
					local214 = this.aClass87_1.aShortArray40;
					local226 = this.aClass87_1.aShortArray41;
					local222 = this.aClass87_1.aByteArray27;
					local218 = this.aClass87_1.aShortArray42;
				}
				this.aClass42_Sub1_9.aNativeInterface3.copyNormals(local214, local226, local218, local222, 3.0F / (float) this.aShort64, 3.0F / (float) (this.aShort64 + this.aShort64 / 2), 0, 12, this.anInt4395, local96.getAddress());
				if (local82.method7899()) {
					this.aClass261_1.aBoolean549 = true;
					this.aClass261_1.anInterface10_10 = local82;
				} else {
					local63 = false;
				}
			}
		}
		if (local51) {
			if (this.lb.anInterface10_11 == null) {
				this.lb.anInterface10_11 = this.aClass42_Sub1_9.method5930(this.aBoolean349);
			}
			local82 = this.lb.anInterface10_11;
			local82.method7897(8, this.anInt4395 * 8);
			local96 = local82.method7895();
			if (local96 == null) {
				local63 = false;
			} else {
				this.aClass42_Sub1_9.aNativeInterface3.copyTexCoords(this.aFloatArray38, this.aFloatArray37, 0, 8, this.anInt4395, local96.getAddress());
				if (local82.method7899()) {
					this.lb.anInterface10_10 = local82;
					this.lb.aBoolean549 = true;
				} else {
					local63 = false;
				}
			}
		}
		return local63;
	}

	@OriginalMember(owner = "client!i", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class12_Sub1_Sub36.anIntArray667[arg0];
		@Pc(13) int local13 = Class12_Sub1_Sub36.anIntArray668[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4398; local15++) {
			@Pc(34) int local34 = this.anIntArray329[local15] * local13 - local9 * this.anIntArray326[local15] >> 15;
			this.anIntArray326[local15] = local13 * this.anIntArray326[local15] + this.anIntArray329[local15] * local9 >> 15;
			this.anIntArray329[local15] = local34;
		}
		this.method3744();
		this.aBoolean350 = false;
	}

	@OriginalMember(owner = "client!i", name = "h", descriptor = "(I)V")
	private void method3742() {
		if (this.anInt4409 == 0) {
			return;
		}
		if (this.method3741() && this.method3746()) {
			this.aClass42_Sub1_9.method5877(this.aClass261_2.anInterface10_10, 0);
			this.aClass42_Sub1_9.method5877(this.aClass261_3.anInterface10_10, 1);
			this.aClass42_Sub1_9.method5877(this.lb.anInterface10_10, 2);
			@Pc(51) boolean local51;
			if ((this.anInt4366 & 0x37) == 0) {
				this.aClass42_Sub1_9.method5886(false);
				local51 = false;
				this.aClass42_Sub1_9.method5999(this.aClass42_Sub1_9.aClass287_15);
			} else {
				local51 = true;
				this.aClass42_Sub1_9.method5886(true);
				this.aClass42_Sub1_9.method5999(this.aClass42_Sub1_9.aClass287_17);
				this.aClass42_Sub1_9.method5877(this.aClass261_1.anInterface10_10, 3);
			}
			for (@Pc(89) int local89 = 0; local89 < this.anIntArray327.length; local89++) {
				@Pc(96) int local96 = this.anIntArray328[local89];
				@Pc(103) int local103 = this.anIntArray328[local89 + 1];
				@Pc(110) int local110 = this.aShortArray70[local96] & 0xFFFF;
				if (local110 == 65535) {
					local110 = -1;
				}
				this.aClass42_Sub1_9.method5997(local110, true, local51);
				this.aClass42_Sub1_9.method5986(this.anIntArray324[local89], this.aClass44_1.anInterface18_5, this.anIntArray327[local89], local103 - local96, local96 * 3, Static480.aClass147_8);
			}
		}
		this.method3730();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method8005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class91_Sub2 local8 = (Class91_Sub2) arg2;
		@Pc(12) Class91_Sub2 local12 = this.aClass42_Sub1_9.aClass91_Sub2_16;
		@Pc(33) float local33 = local12.aFloat142 * local8.aFloat135 + local12.aFloat143 * local8.aFloat138 + local8.aFloat144 * local12.aFloat141 + local12.aFloat144;
		@Pc(54) float local54 = local12.aFloat134 * local8.aFloat138 + local12.aFloat137 * local8.aFloat144 + local12.aFloat139 * local8.aFloat135 + local12.aFloat138;
		Static301.aFloat120 = local8.aFloat140 * local12.aFloat139 + local12.aFloat134 * local8.aFloat139 + local12.aFloat137 * local8.aFloat142;
		Static309.aFloat124 = local12.aFloat143 * local8.aFloat139 + local12.aFloat141 * local8.aFloat142 + local12.aFloat142 * local8.aFloat140;
		Static526.aFloat191 = local8.aFloat136 * local12.aFloat142 + local12.aFloat143 * local8.aFloat137 + local8.aFloat141 * local12.aFloat141;
		Static184.aFloat109 = local12.aFloat133 * local8.aFloat137 + local12.aFloat136 * local8.aFloat141 + local8.aFloat136 * local12.aFloat140;
		Static390.aFloat174 = local8.aFloat140 * local12.aFloat140 + local8.aFloat139 * local12.aFloat133 + local8.aFloat142 * local12.aFloat136;
		Static532.aFloat195 = local12.aFloat134 * local8.aFloat137 + local12.aFloat137 * local8.aFloat141 + local12.aFloat139 * local8.aFloat136;
		Static473.aFloat183 = local12.aFloat139 * local8.aFloat133 + local12.aFloat137 * local8.aFloat143 + local12.aFloat134 * local8.aFloat134;
		Static276.aFloat117 = local8.aFloat133 * local12.aFloat142 + local12.aFloat141 * local8.aFloat143 + local8.aFloat134 * local12.aFloat143;
		Static301.aFloat121 = local8.aFloat133 * local12.aFloat140 + local12.aFloat136 * local8.aFloat143 + local8.aFloat134 * local12.aFloat133;
		@Pc(237) float local237 = local12.aFloat133 * local8.aFloat138 + local12.aFloat136 * local8.aFloat144 + local8.aFloat135 * local12.aFloat140 + local12.aFloat135;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass42_Sub1_9.anInt7123;
		@Pc(255) int local255 = this.aClass42_Sub1_9.anInt7131;
		if (!this.aBoolean350) {
			this.method3737();
		}
		Static545.anIntArray698[0] = this.anInt4390;
		Static546.anIntArray702[0] = this.anInt4376;
		Static545.anIntArray698[1] = this.anInt4408;
		Static530.anIntArray687[0] = this.anInt4415;
		Static546.anIntArray702[1] = this.anInt4376;
		Static530.anIntArray687[1] = this.anInt4415;
		Static545.anIntArray698[2] = this.anInt4390;
		Static546.anIntArray702[2] = this.anInt4407;
		Static530.anIntArray687[2] = this.anInt4415;
		Static545.anIntArray698[3] = this.anInt4408;
		Static546.anIntArray702[3] = this.anInt4407;
		Static545.anIntArray698[4] = this.anInt4390;
		Static530.anIntArray687[3] = this.anInt4415;
		Static546.anIntArray702[4] = this.anInt4376;
		Static545.anIntArray698[5] = this.anInt4408;
		Static530.anIntArray687[4] = this.anInt4377;
		Static546.anIntArray702[5] = this.anInt4376;
		Static545.anIntArray698[6] = this.anInt4390;
		Static530.anIntArray687[5] = this.anInt4377;
		Static546.anIntArray702[6] = this.anInt4407;
		Static530.anIntArray687[6] = this.anInt4377;
		Static545.anIntArray698[7] = this.anInt4408;
		Static546.anIntArray702[7] = this.anInt4407;
		Static530.anIntArray687[7] = this.anInt4377;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(390) float local390;
		@Pc(400) float local400;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static545.anIntArray698[local383];
			local395 = Static530.anIntArray687[local383];
			local400 = Static546.anIntArray702[local383];
			local414 = Static301.aFloat121 * local400 + Static184.aFloat109 * local390 + Static390.aFloat174 * local395 + local237;
			local428 = local54 + Static301.aFloat120 * local395 + local400 * Static473.aFloat183 + local390 * Static532.aFloat195;
			local442 = local33 + Static309.aFloat124 * local395 + local400 * Static276.aFloat117 + local390 * Static526.aFloat191;
			if ((float) this.aClass42_Sub1_9.anInt7126 <= local414) {
				@Pc(461) float local461 = (float) this.aClass42_Sub1_9.anInt7108 + (float) local251 * local442 / local414;
				if (local461 > local243) {
					local243 = local461;
				}
				@Pc(479) float local479 = (float) this.aClass42_Sub1_9.anInt7136 + (float) local255 * local428 / local414;
				if (local461 < local241) {
					local241 = local461;
				}
				if (local245 > local479) {
					local245 = local479;
				}
				if (local479 > local247) {
					local247 = local479;
				}
				local239 = true;
			}
		}
		if (local239 && (float) arg0 > local241 && local243 > (float) arg0 && (float) arg1 > local245 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt4395 > Static170.anIntArray304.length) {
				Static314.anIntArray424 = new int[this.anInt4395];
				Static170.anIntArray304 = new int[this.anInt4395];
			}
			@Pc(630) int local630;
			for (@Pc(548) int local548 = 0; local548 < this.anInt4398; local548++) {
				local400 = this.anIntArray329[local548];
				local395 = this.anIntArray326[local548];
				local390 = this.anIntArray330[local548];
				local442 = local33 + local395 * Static309.aFloat124 + Static526.aFloat191 * local390 + Static276.aFloat117 * local400;
				local414 = Static184.aFloat109 * local390 + local400 * Static301.aFloat121 + local395 * Static390.aFloat174 + local237;
				local428 = local400 * Static473.aFloat183 + Static532.aFloat195 * local390 + Static301.aFloat120 * local395 + local54;
				@Pc(643) int local643;
				@Pc(648) int local648;
				@Pc(655) int local655;
				if (local414 >= (float) this.aClass42_Sub1_9.anInt7126) {
					local630 = (int) ((float) this.aClass42_Sub1_9.anInt7108 + local442 * (float) local251 / local414);
					local643 = (int) ((float) this.aClass42_Sub1_9.anInt7136 + local428 * (float) local255 / local414);
					local648 = this.anIntArray325[local548];
					local655 = this.anIntArray325[local548 + 1];
					for (@Pc(657) int local657 = local648; local657 < local655; local657++) {
						@Pc(666) int local666 = this.aShortArray69[local657] - 1;
						if (local666 == -1) {
							break;
						}
						Static170.anIntArray304[local666] = local630;
						Static314.anIntArray424[local666] = local643;
					}
				} else {
					local630 = this.anIntArray325[local548];
					local643 = this.anIntArray325[local548 + 1];
					for (local648 = local630; local648 < local643; local648++) {
						local655 = this.aShortArray69[local648] - 1;
						if (local655 == -1) {
							break;
						}
						Static170.anIntArray304[this.aShortArray69[local648] - 1] = -999999;
					}
				}
			}
			for (local630 = 0; local630 < this.anInt4418; local630++) {
				if (Static170.anIntArray304[this.aShortArray71[local630]] != -999999 && Static170.anIntArray304[this.aShortArray64[local630]] != -999999 && Static170.anIntArray304[this.aShortArray61[local630]] != -999999 && this.method3732(arg1, Static170.anIntArray304[this.aShortArray61[local630]], Static314.anIntArray424[this.aShortArray71[local630]], Static314.anIntArray424[this.aShortArray64[local630]], Static314.anIntArray424[this.aShortArray61[local630]], arg0, Static170.anIntArray304[this.aShortArray64[local630]], Static170.anIntArray304[this.aShortArray71[local630]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!i", name = "X", descriptor = "()V")
	@Override
	public void X() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4398; local7++) {
			this.anIntArray326[local7] = -this.anIntArray326[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt4395; local29++) {
			this.aShortArray63[local29] = (short) -this.aShortArray63[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt4418; local52++) {
			@Pc(59) short local59 = this.aShortArray71[local52];
			this.aShortArray71[local52] = this.aShortArray61[local52];
			this.aShortArray61[local52] = local59;
		}
		this.method3744();
		this.method3738();
		this.method3731();
		this.aBoolean350 = false;
	}

	@OriginalMember(owner = "client!i", name = "i", descriptor = "(I)V")
	private void method3744() {
		if (this.aClass261_2 != null) {
			this.aClass261_2.aBoolean549 = false;
		}
	}

	@OriginalMember(owner = "client!i", name = "ga", descriptor = "()I")
	@Override
	public int ga() {
		return this.aShort64;
	}

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	@Override
	public void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class215 arg2, @OriginalArg(3) Class215 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean350) {
			this.method3737();
		}
		@Pc(17) int local17 = arg4 + this.anInt4390;
		@Pc(22) int local22 = arg4 + this.anInt4408;
		@Pc(27) int local27 = arg6 + this.anInt4415;
		@Pc(32) int local32 = this.anInt4377 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || local22 + arg2.anInt9451 >> arg2.anInt9453 >= arg2.anInt9452 || local27 < 0 || local32 + arg2.anInt9451 >> arg2.anInt9453 >= arg2.anInt9450)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || arg3.anInt9452 <= local22 + arg3.anInt9451 >> arg3.anInt9453 || local27 < 0 || arg3.anInt9450 <= local32 + arg3.anInt9451 >> arg3.anInt9453) {
				return;
			}
		} else {
			local17 >>= arg2.anInt9453;
			local22 = local22 + arg2.anInt9451 - 1 >> arg2.anInt9453;
			local27 >>= arg2.anInt9453;
			local32 = local32 + arg2.anInt9451 - 1 >> arg2.anInt9453;
			if (arg2.ba(local17, local27) == arg5 && arg2.ba(local22, local27) == arg5 && arg5 == arg2.ba(local17, local32) && arg2.ba(local22, local32) == arg5) {
				return;
			}
		}
		@Pc(185) int local185;
		if (arg0 == 1) {
			for (local185 = 0; local185 < this.anInt4398; local185++) {
				this.anIntArray329[local185] = this.anIntArray329[local185] + arg2.aa(this.anIntArray330[local185] - -arg4, arg6 + this.anIntArray326[local185]) - arg5;
			}
		} else {
			@Pc(236) int local236;
			@Pc(247) int local247;
			if (arg0 == 2) {
				local185 = this.anInt4376;
				if (local185 == 0) {
					return;
				}
				for (local236 = 0; local236 < this.anInt4398; local236++) {
					local247 = (this.anIntArray329[local236] << 16) / local185;
					if (local247 < arg1) {
						this.anIntArray329[local236] += (arg1 - local247) * (-arg5 + arg2.aa(arg4 + this.anIntArray330[local236], this.anIntArray326[local236] - -arg6)) / arg1;
					}
				}
			} else {
				@Pc(334) int local334;
				if (arg0 == 3) {
					local185 = (arg1 & 0xFF) * 4;
					local236 = (arg1 >> 8 & 0xFF) * 4;
					local247 = (arg1 >> 16 & 0xFF) << 6;
					local334 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local185 >> 1) < 0 || arg2.anInt9451 + (local185 >> 1) + arg4 >= arg2.anInt9452 << arg2.anInt9453 || arg6 - (local236 >> 1) < 0 || arg6 + (local236 >> 1) + arg2.anInt9451 >= arg2.anInt9450 << arg2.anInt9453) {
						return;
					}
					this.method7993(arg5, arg2, local247, arg4, local236, arg6, local334, local185);
				} else if (arg0 == 4) {
					local185 = this.anInt4407 - this.anInt4376;
					for (local236 = 0; local236 < this.anInt4398; local236++) {
						this.anIntArray329[local236] = local185 + this.anIntArray329[local236] + arg3.aa(this.anIntArray330[local236] + arg4, arg6 + this.anIntArray326[local236]) - arg5;
					}
				} else if (arg0 == 5) {
					local185 = this.anInt4407 - this.anInt4376;
					for (local236 = 0; local236 < this.anInt4398; local236++) {
						local247 = arg4 + this.anIntArray330[local236];
						local334 = arg6 + this.anIntArray326[local236];
						@Pc(440) int local440 = arg2.aa(local247, local334);
						@Pc(445) int local445 = arg3.aa(local247, local334);
						@Pc(450) int local450 = local440 - local445;
						this.anIntArray329[local236] = local440 + (local450 * ((this.anIntArray329[local236] << 8) / local185) >> 8) - arg5;
					}
				}
			}
		}
		this.method3744();
		this.aBoolean350 = false;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method7998(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class26_Sub2 local8 = (Class26_Sub2) arg0;
		if (this.anInt4418 == 0 || local8.anInt4418 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt4398;
		@Pc(21) int[] local21 = local8.anIntArray330;
		@Pc(24) int[] local24 = local8.anIntArray329;
		@Pc(27) int[] local27 = local8.anIntArray326;
		@Pc(30) short[] local30 = local8.aShortArray65;
		@Pc(33) short[] local33 = local8.aShortArray72;
		@Pc(36) short[] local36 = local8.aShortArray63;
		@Pc(39) byte[] local39 = local8.aByteArray51;
		@Pc(54) short[] local54;
		@Pc(46) short[] local46;
		@Pc(58) short[] local58;
		@Pc(50) byte[] local50;
		if (this.aClass87_1 == null) {
			local50 = null;
			local58 = null;
			local54 = null;
			local46 = null;
		} else {
			local46 = this.aClass87_1.aShortArray41;
			local50 = this.aClass87_1.aByteArray27;
			local54 = this.aClass87_1.aShortArray40;
			local58 = this.aClass87_1.aShortArray42;
		}
		@Pc(87) short[] local87;
		@Pc(79) short[] local79;
		@Pc(75) short[] local75;
		@Pc(83) byte[] local83;
		if (local8.aClass87_1 == null) {
			local87 = null;
			local79 = null;
			local75 = null;
			local83 = null;
		} else {
			local75 = local8.aClass87_1.aShortArray42;
			local79 = local8.aClass87_1.aShortArray41;
			local83 = local8.aClass87_1.aByteArray27;
			local87 = local8.aClass87_1.aShortArray40;
		}
		@Pc(100) int[] local100 = local8.anIntArray325;
		@Pc(103) short[] local103 = local8.aShortArray69;
		if (!local8.aBoolean350) {
			local8.method3737();
		}
		@Pc(112) int local112 = local8.anInt4376;
		@Pc(115) int local115 = local8.anInt4407;
		@Pc(118) int local118 = local8.anInt4390;
		@Pc(121) int local121 = local8.anInt4408;
		@Pc(124) int local124 = local8.anInt4415;
		@Pc(127) int local127 = local8.anInt4377;
		for (@Pc(129) int local129 = 0; local129 < this.anInt4398; local129++) {
			@Pc(139) int local139 = this.anIntArray329[local129] - arg2;
			if (local112 <= local139 && local139 <= local115) {
				@Pc(155) int local155 = this.anIntArray330[local129] - arg1;
				if (local155 >= local118 && local155 <= local121) {
					@Pc(179) int local179 = this.anIntArray326[local129] - arg3;
					if (local179 >= local124 && local127 >= local179) {
						@Pc(193) int local193 = -1;
						@Pc(198) int local198 = this.anIntArray325[local129];
						@Pc(205) int local205 = this.anIntArray325[local129 + 1];
						for (@Pc(207) int local207 = local198; local207 < local205; local207++) {
							local193 = this.aShortArray69[local207] - 1;
							if (local193 == -1 || this.aByteArray51[local193] != 0) {
								break;
							}
						}
						if (local193 != -1) {
							for (@Pc(241) int local241 = 0; local241 < local18; local241++) {
								if (local155 == local21[local241] && local179 == local27[local241] && local24[local241] == local139) {
									@Pc(264) int local264 = -1;
									local198 = local100[local241];
									local205 = local100[local241 + 1];
									for (@Pc(276) int local276 = local198; local276 < local205; local276++) {
										local264 = local103[local276] - 1;
										if (local264 == -1 || local39[local264] != 0) {
											break;
										}
									}
									if (local264 != -1) {
										if (local54 == null) {
											this.aClass87_1 = new Class87();
											local54 = this.aClass87_1.aShortArray40 = Static531.method7868(this.aShortArray65);
											local46 = this.aClass87_1.aShortArray41 = Static531.method7868(this.aShortArray72);
											local58 = this.aClass87_1.aShortArray42 = Static531.method7868(this.aShortArray63);
											local50 = this.aClass87_1.aByteArray27 = Static530.method7853(this.aByteArray51);
										}
										if (local87 == null) {
											@Pc(357) Class87 local357 = local8.aClass87_1 = new Class87();
											local87 = local357.aShortArray40 = Static531.method7868(local30);
											local79 = local357.aShortArray41 = Static531.method7868(local33);
											local75 = local357.aShortArray42 = Static531.method7868(local36);
											local83 = local357.aByteArray27 = Static530.method7853(local39);
										}
										@Pc(390) short local390 = this.aShortArray65[local193];
										@Pc(395) short local395 = this.aShortArray72[local193];
										@Pc(400) short local400 = this.aShortArray63[local193];
										local205 = local100[local241 + 1];
										local198 = local100[local241];
										@Pc(415) byte local415 = this.aByteArray51[local193];
										@Pc(425) int local425;
										for (@Pc(417) int local417 = local198; local417 < local205; local417++) {
											local425 = local103[local417] - 1;
											if (local425 == -1) {
												break;
											}
											if (local83[local425] != 0) {
												local87[local425] += local390;
												local79[local425] += local395;
												local75[local425] += local400;
												local83[local425] += local415;
											}
										}
										local415 = local39[local264];
										local198 = this.anIntArray325[local129];
										local390 = local30[local264];
										local395 = local33[local264];
										local205 = this.anIntArray325[local129 + 1];
										local400 = local36[local264];
										for (local425 = local198; local425 < local205; local425++) {
											@Pc(511) int local511 = this.aShortArray69[local425] - 1;
											if (local511 == -1) {
												break;
											}
											if (local50[local511] != 0) {
												local54[local511] += local390;
												local46[local511] += local395;
												local58[local511] += local400;
												local50[local511] += local415;
											}
										}
										local8.method3738();
										this.method3738();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()I")
	@Override
	public int wa() {
		if (!this.aBoolean350) {
			this.method3737();
		}
		return this.anInt4390;
	}

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	@Override
	public Class12_Sub4_Sub10 EA(@OriginalArg(0) Class12_Sub4_Sub10 arg0) {
		if (this.anInt4395 == 0) {
			return null;
		}
		if (!this.aBoolean350) {
			this.method3737();
		}
		@Pc(37) int local37;
		@Pc(54) int local54;
		if (this.aClass42_Sub1_9.anInt7100 > 0) {
			local37 = this.anInt4390 - (this.aClass42_Sub1_9.anInt7100 * this.anInt4407 >> 8) >> this.aClass42_Sub1_9.anInt7103;
			local54 = this.anInt4408 - (this.aClass42_Sub1_9.anInt7100 * this.anInt4376 >> 8) >> this.aClass42_Sub1_9.anInt7103;
		} else {
			local37 = this.anInt4390 - (this.anInt4376 * this.aClass42_Sub1_9.anInt7100 >> 8) >> this.aClass42_Sub1_9.anInt7103;
			local54 = this.anInt4408 - (this.aClass42_Sub1_9.anInt7100 * this.anInt4407 >> 8) >> this.aClass42_Sub1_9.anInt7103;
		}
		@Pc(113) int local113;
		@Pc(130) int local130;
		if (this.aClass42_Sub1_9.anInt7117 > 0) {
			local113 = this.anInt4415 - (this.aClass42_Sub1_9.anInt7117 * this.anInt4407 >> 8) >> this.aClass42_Sub1_9.anInt7103;
			local130 = this.anInt4377 - (this.anInt4376 * this.aClass42_Sub1_9.anInt7117 >> 8) >> this.aClass42_Sub1_9.anInt7103;
		} else {
			local113 = this.anInt4415 - (this.aClass42_Sub1_9.anInt7117 * this.anInt4376 >> 8) >> this.aClass42_Sub1_9.anInt7103;
			local130 = this.anInt4377 - (this.aClass42_Sub1_9.anInt7117 * this.anInt4407 >> 8) >> this.aClass42_Sub1_9.anInt7103;
		}
		@Pc(171) int local171 = local54 + 1 - local37;
		@Pc(178) int local178 = local130 + 1 - local113;
		@Pc(181) Class12_Sub4_Sub10_Sub1 local181 = (Class12_Sub4_Sub10_Sub1) arg0;
		@Pc(191) Class12_Sub4_Sub10_Sub1 local191;
		if (local181 != null && local181.method3813(local178, local171)) {
			local191 = local181;
			local181.method3807();
		} else {
			local191 = new Class12_Sub4_Sub10_Sub1(this.aClass42_Sub1_9, local171, local178);
		}
		local191.method3809(local37, local130, local113, local54);
		this.method3736(local191);
		return local191;
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(B)V")
	private void method3745() {
		if (this.aClass151Array1 == null) {
			return;
		}
		@Pc(20) float local20 = this.aClass42_Sub1_9.ra();
		@Pc(24) float local24 = this.aClass42_Sub1_9.P();
		this.aClass42_Sub1_9.method5822(false);
		this.aClass42_Sub1_9.method5886(false);
		this.aClass42_Sub1_9.method5951(Static371.aClass302_2, 1);
		this.aClass42_Sub1_9.method5967(1, Static371.aClass302_2);
		for (@Pc(47) int local47 = 0; local47 < this.anInt4424; local47++) {
			@Pc(54) Class151 local54 = this.aClass151Array1[local47];
			@Pc(59) Class264 local59 = this.aClass264Array1[local47];
			if (!local54.aBoolean372 || !this.aClass42_Sub1_9.method5836()) {
				@Pc(88) float local88 = (float) (this.anIntArray330[local54.anInt4694] + this.anIntArray330[local54.anInt4692] + this.anIntArray330[local54.anInt4695]) * 0.3333333F;
				@Pc(109) float local109 = (float) (this.anIntArray329[local54.anInt4694] + this.anIntArray329[local54.anInt4692] + this.anIntArray329[local54.anInt4695]) * 0.3333333F;
				@Pc(130) float local130 = (float) (this.anIntArray326[local54.anInt4695] + this.anIntArray326[local54.anInt4692] + this.anIntArray326[local54.anInt4694]) * 0.3333333F;
				@Pc(144) float local144 = Static3.aFloat3 + Static309.aFloat124 * local130 + local109 * Static276.aFloat117 + local88 * Static526.aFloat191;
				@Pc(158) float local158 = Static201.aFloat113 + Static301.aFloat120 * local130 + local109 * Static473.aFloat183 + local88 * Static532.aFloat195;
				@Pc(172) float local172 = local130 * Static390.aFloat174 + local109 * Static301.aFloat121 + Static184.aFloat109 * local88 + Static88.aFloat56;
				@Pc(177) Class91_Sub2 local177 = this.aClass42_Sub1_9.method5994();
				local177.method5509((float) local59.anInt7969 + local144, local59.anInt7967 * local54.aShort65 >> 7, local59.anInt7964, local172, (float) local59.anInt7961 + local158, local54.aShort67 * local59.anInt7963 >> 7);
				local177.method5508(this.aClass42_Sub1_9.aClass91_Sub2_17);
				this.aClass42_Sub1_9.method5899();
				this.aClass42_Sub1_9.la(local24, local20 - (float) local54.anInt4696 * 1.5F);
				@Pc(231) int local231 = local59.anInt7968;
				this.aClass42_Sub1_9.method5997(local54.aShort66, false, false);
				this.aClass42_Sub1_9.method5955(local54.aByte62);
				this.aClass42_Sub1_9.method5979(local54.aByte63);
				this.aClass42_Sub1_9.method5935(local231);
				this.aClass42_Sub1_9.method5974();
			}
		}
		this.aClass42_Sub1_9.method5967(1, Static499.aClass302_4);
		this.aClass42_Sub1_9.method5951(Static499.aClass302_4, 1);
		this.aClass42_Sub1_9.la(local24, local20);
		this.aClass42_Sub1_9.method5822(true);
	}

	@OriginalMember(owner = "client!i", name = "j", descriptor = "(I)Z")
	private boolean method3746() {
		if (this.aClass44_1.aBoolean98) {
			return true;
		}
		if (this.aClass44_1.anInterface18_4 == null) {
			this.aClass44_1.anInterface18_4 = this.aClass42_Sub1_9.method5906(this.aBoolean349);
		}
		@Pc(33) Interface18 local33 = this.aClass44_1.anInterface18_4;
		local33.method7529(this.anInt4409 * 6);
		@Pc(45) Buffer local45 = local33.method7895();
		if (local45 != null) {
			@Pc(53) Stream local53 = this.aClass42_Sub1_9.method5871(local45);
			@Pc(57) int local57;
			if (Stream.c()) {
				for (local57 = 0; local57 < this.anInt4409; local57++) {
					local53.a(this.aShortArray71[local57]);
					local53.a(this.aShortArray64[local57]);
					local53.a(this.aShortArray61[local57]);
				}
			} else {
				for (local57 = 0; local57 < this.anInt4409; local57++) {
					local53.d(this.aShortArray71[local57]);
					local53.d(this.aShortArray64[local57]);
					local53.d(this.aShortArray61[local57]);
				}
			}
			local53.a();
			if (local33.method7899()) {
				this.aBoolean348 = true;
				this.aClass44_1.aBoolean98 = true;
				this.aClass44_1.anInterface18_5 = local33;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		if (!this.aBoolean350) {
			this.method3737();
		}
		return this.anInt4415;
	}

	@OriginalMember(owner = "client!i", name = "n", descriptor = "()I")
	@Override
	public int n() {
		if (!this.aBoolean350) {
			this.method3737();
		}
		return this.anInt4407;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()I")
	@Override
	public int e() {
		if (!this.aBoolean350) {
			this.method3737();
		}
		return this.anInt4371;
	}

	@OriginalMember(owner = "client!i", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4398; local3++) {
			if (arg0 != 128) {
				this.anIntArray330[local3] = arg0 * this.anIntArray330[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray329[local3] = this.anIntArray329[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray326[local3] = arg2 * this.anIntArray326[local3] >> 7;
			}
		}
		this.method3744();
		this.aBoolean350 = false;
	}
}
