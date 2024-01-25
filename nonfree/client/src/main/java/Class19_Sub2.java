import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!li", name = "r", descriptor = "Lclient!qc;")
	private Class236 aClass236_1;

	@OriginalMember(owner = "client!li", name = "v", descriptor = "I")
	private int anInt5414;

	@OriginalMember(owner = "client!li", name = "B", descriptor = "I")
	private int anInt5420;

	@OriginalMember(owner = "client!li", name = "N", descriptor = "Z")
	private boolean aBoolean372;

	@OriginalMember(owner = "client!li", name = "O", descriptor = "I")
	private int anInt5430;

	@OriginalMember(owner = "client!li", name = "U", descriptor = "Lclient!cb;")
	private final Class9_Sub1 aClass9_Sub1_8;

	@OriginalMember(owner = "client!li", name = "Z", descriptor = "Z")
	private boolean aBoolean373;

	@OriginalMember(owner = "client!li", name = "eb", descriptor = "I")
	private int anInt5438;

	@OriginalMember(owner = "client!li", name = "hb", descriptor = "Lclient!am;")
	private Class13 aClass13_1;

	@OriginalMember(owner = "client!li", name = "yb", descriptor = "I")
	private int anInt5446;

	@OriginalMember(owner = "client!li", name = "Db", descriptor = "I")
	private int anInt5451;

	@OriginalMember(owner = "client!li", name = "Jb", descriptor = "Lclient!vt;")
	private Class311 aClass311_1;

	@OriginalMember(owner = "client!li", name = "Kb", descriptor = "Lclient!vt;")
	private Class311 aClass311_2;

	@OriginalMember(owner = "client!li", name = "Mb", descriptor = "Lclient!vt;")
	private Class311 aClass311_3;

	@OriginalMember(owner = "client!li", name = "Sb", descriptor = "I")
	private int anInt5458;

	@OriginalMember(owner = "client!li", name = "ac", descriptor = "Z")
	private boolean aBoolean374;

	@OriginalMember(owner = "client!li", name = "hc", descriptor = "I")
	private int anInt5468;

	@OriginalMember(owner = "client!li", name = "mc", descriptor = "Lclient!vt;")
	private Class311 aClass311_4;

	@OriginalMember(owner = "client!li", name = "sc", descriptor = "I")
	private int anInt5475;

	@OriginalMember(owner = "client!li", name = "wc", descriptor = "I")
	private int anInt5478;

	@OriginalMember(owner = "client!li", name = "ub", descriptor = "[I")
	private int[] anIntArray386;

	@OriginalMember(owner = "client!li", name = "C", descriptor = "I")
	private int anInt5421;

	@OriginalMember(owner = "client!li", name = "Bb", descriptor = "I")
	private int anInt5449;

	@OriginalMember(owner = "client!li", name = "qb", descriptor = "[I")
	private int[] anIntArray385;

	@OriginalMember(owner = "client!li", name = "ec", descriptor = "[I")
	private int[] anIntArray389;

	@OriginalMember(owner = "client!li", name = "F", descriptor = "I")
	private int anInt5423;

	@OriginalMember(owner = "client!li", name = "o", descriptor = "I")
	private int anInt5409;

	@OriginalMember(owner = "client!li", name = "kc", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!li", name = "Qb", descriptor = "[I")
	private int[] anIntArray388;

	@OriginalMember(owner = "client!li", name = "D", descriptor = "[Lclient!lh;")
	private Class178[] aClass178Array4;

	@OriginalMember(owner = "client!li", name = "kb", descriptor = "[Lclient!ia;")
	private Class129[] aClass129Array4;

	@OriginalMember(owner = "client!li", name = "Wb", descriptor = "I")
	private int anInt5461;

	@OriginalMember(owner = "client!li", name = "S", descriptor = "[Lclient!et;")
	private Class83[] aClass83Array1;

	@OriginalMember(owner = "client!li", name = "X", descriptor = "[Lclient!i;")
	private Class128[] aClass128Array1;

	@OriginalMember(owner = "client!li", name = "T", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!li", name = "V", descriptor = "[F")
	private float[] aFloatArray45;

	@OriginalMember(owner = "client!li", name = "Hb", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!li", name = "nb", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!li", name = "Eb", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!li", name = "bc", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!li", name = "sb", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!li", name = "lc", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!li", name = "pc", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!li", name = "ob", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!li", name = "fb", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!li", name = "jb", descriptor = "[F")
	private float[] aFloatArray46;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!li", name = "rb", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!li", name = "mb", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!li", name = "tc", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!li", name = "Ob", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!li", name = "Q", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!li", name = "Y", descriptor = "[I")
	private int[] anIntArray384;

	@OriginalMember(owner = "client!li", name = "Nb", descriptor = "[I")
	private int[] anIntArray387;

	@OriginalMember(owner = "client!li", name = "I", descriptor = "[I")
	private int[] anIntArray383;

	@OriginalMember(owner = "client!li", name = "xc", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!li", name = "Tb", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!li", name = "fc", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!cb;Lclient!fd;IIII)V")
	public Class19_Sub2(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface8 local11 = arg0.anInterface8_13;
		this.anIntArray386 = new int[arg1.anInt3066 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt3068];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt3068; local24++) {
			if ((arg1.aByteArray35 == null || arg1.aByteArray35[local24] != 2) && (arg1.aShortArray40 == null || arg1.aShortArray40[local24] == -1 || !local11.method7085(arg1.aShortArray40[local24] & 0xFFFF).aBoolean350)) {
				local22[this.anInt5421++] = local24;
				this.anIntArray386[arg1.aShortArray37[local24]]++;
				this.anIntArray386[arg1.aShortArray44[local24]]++;
				this.anIntArray386[arg1.aShortArray46[local24]]++;
			}
		}
		this.anInt5449 = this.anInt5421;
		@Pc(118) long[] local118 = new long[this.anInt5421];
		@Pc(130) boolean local130 = (this.anInt5475 & 0x100) != 0;
		@Pc(142) int local142;
		@Pc(153) int local153;
		@Pc(275) int local275;
		label498: for (@Pc(132) int local132 = 0; local132 < this.anInt5421; local132++) {
			@Pc(138) int local138 = local22[local132];
			@Pc(140) Class175 local140 = null;
			local142 = 0;
			@Pc(144) byte local144 = 0;
			@Pc(146) byte local146 = 0;
			@Pc(148) byte local148 = 0;
			if (arg1.aClass26Array1 != null) {
				for (local153 = 0; local153 < arg1.aClass26Array1.length; local153++) {
					@Pc(160) Class26 local160 = arg1.aClass26Array1[local153];
					if (local160.anInt1199 == local138) {
						@Pc(173) Class103 local173 = Static193.method3619(local160.anInt1200);
						if (local173.aBoolean212) {
							local118[local132] = Long.MAX_VALUE;
							this.anInt5449--;
							continue label498;
						}
					}
				}
			}
			@Pc(196) short local196 = -1;
			if (arg1.aShortArray40 != null) {
				local196 = arg1.aShortArray40[local138];
				if (local196 != -1) {
					local140 = local11.method7085(local196 & 0xFFFF);
					local146 = local140.aByte54;
					local148 = local140.aByte56;
				}
			}
			@Pc(237) boolean local237 = arg1.aByteArray34 != null && arg1.aByteArray34[local138] != 0 || local140 != null && !local140.aBoolean359;
			if ((local130 || local237) && arg1.aByteArray36 != null) {
				local142 += arg1.aByteArray36[local138] << 17;
			}
			if (local237) {
				local142 += 65536;
			}
			local142 += (local146 & 0xFF) << 8;
			local275 = local144 + ((local196 & 0xFFFF) << 16);
			local142 += local148 & 0xFF;
			@Pc(287) int local287 = local275 + (local132 & 0xFFFF);
			local118[local132] = ((long) local142 << 32) + (long) local287;
		}
		Static331.method5390(local22, local118);
		this.anIntArray385 = arg1.anIntArray249;
		this.anIntArray389 = arg1.anIntArray251;
		this.anInt5423 = arg1.anInt3066;
		this.anInt5409 = arg1.anInt3059;
		this.aShortArray103 = arg1.aShortArray42;
		this.anIntArray388 = arg1.anIntArray246;
		this.aClass178Array4 = arg1.aClass178Array3;
		this.aClass129Array4 = arg1.aClass129Array3;
		@Pc(346) Class124[] local346 = new Class124[this.anInt5423];
		@Pc(366) int local366;
		@Pc(380) int local380;
		if (arg1.aClass26Array1 != null) {
			this.anInt5461 = arg1.aClass26Array1.length;
			this.aClass83Array1 = new Class83[this.anInt5461];
			this.aClass128Array1 = new Class128[this.anInt5461];
			for (local366 = 0; local366 < this.anInt5461; local366++) {
				@Pc(373) Class26 local373 = arg1.aClass26Array1[local366];
				@Pc(378) Class103 local378 = Static193.method3619(local373.anInt1200);
				local380 = -1;
				for (@Pc(382) int local382 = 0; local382 < this.anInt5421; local382++) {
					if (local373.anInt1199 == local22[local382]) {
						local380 = local382;
						break;
					}
				}
				if (local380 == -1) {
					throw new RuntimeException();
				}
				local153 = Static392.anIntArray516[arg1.aShortArray45[local373.anInt1199] & 0xFFFF] & 0xFFFFFF;
				local153 |= 255 - (arg1.aByteArray34 == null ? 0 : arg1.aByteArray34[local373.anInt1199]) << 24;
				this.aClass83Array1[local366] = new Class83(local380, arg1.aShortArray37[local373.anInt1199], arg1.aShortArray44[local373.anInt1199], arg1.aShortArray46[local373.anInt1199], local378.anInt3483, local378.anInt3485, local378.anInt3488, local378.anInt3481, local378.anInt3484, local378.aBoolean212, local378.aBoolean213, local373.anInt1202);
				this.aClass128Array1[local366] = new Class128(local153);
			}
		}
		local366 = this.anInt5421 * 3;
		this.aShortArray94 = new short[local366];
		this.aFloatArray45 = new float[local366];
		Static414.aLongArray12 = new long[local366];
		this.aShortArray101 = new short[this.anInt5421];
		this.aByteArray71 = new byte[this.anInt5421];
		this.aShortArray100 = new short[local366];
		this.aShort84 = (short) arg3;
		this.aShortArray99 = new short[local366];
		this.aShort85 = (short) arg4;
		this.aShortArray104 = new short[this.anInt5421];
		this.aShortArray97 = new short[this.anInt5421];
		this.aShortArray95 = new short[local366];
		this.aFloatArray46 = new float[local366];
		if (arg1.aShortArray38 != null) {
			this.aShortArray92 = new short[this.anInt5421];
		}
		this.aShortArray98 = new short[local366];
		this.aShortArray96 = new short[this.anInt5421];
		this.aByteArray72 = new byte[local366];
		this.aShortArray102 = new short[local366];
		this.aShortArray93 = new short[this.anInt5421];
		local142 = 0;
		for (local275 = 0; local275 < arg1.anInt3066; local275++) {
			local380 = this.anIntArray386[local275];
			this.anIntArray386[local275] = local142;
			local346[local275] = new Class124();
			local142 += local380;
		}
		this.anIntArray386[arg1.anInt3066] = local142;
		@Pc(621) int[] local621 = null;
		@Pc(623) int[] local623 = null;
		@Pc(625) int[] local625 = null;
		@Pc(627) float[][] local627 = null;
		@Pc(645) int[] local645;
		@Pc(653) int local653;
		@Pc(685) int local685;
		@Pc(691) int local691;
		@Pc(704) int local704;
		@Pc(706) int local706;
		@Pc(737) int local737;
		@Pc(742) int local742;
		@Pc(915) float local915;
		@Pc(906) float local906;
		@Pc(913) float local913;
		if (arg1.aByteArray37 != null) {
			@Pc(633) int local633 = arg1.anInt3054;
			@Pc(636) int[] local636 = new int[local633];
			@Pc(639) int[] local639 = new int[local633];
			@Pc(642) int[] local642 = new int[local633];
			local645 = new int[local633];
			@Pc(648) int[] local648 = new int[local633];
			@Pc(651) int[] local651 = new int[local633];
			for (local653 = 0; local653 < local633; local653++) {
				local636[local653] = Integer.MAX_VALUE;
				local639[local653] = -2147483647;
				local642[local653] = Integer.MAX_VALUE;
				local645[local653] = -2147483647;
				local648[local653] = Integer.MAX_VALUE;
				local651[local653] = -2147483647;
			}
			for (local685 = 0; local685 < this.anInt5421; local685++) {
				local691 = local22[local685];
				if (arg1.aByteArray37[local691] != -1) {
					local704 = arg1.aByteArray37[local691] & 0xFF;
					for (local706 = 0; local706 < 3; local706++) {
						@Pc(718) short local718;
						if (local706 == 0) {
							local718 = arg1.aShortArray37[local691];
						} else if (local706 == 1) {
							local718 = arg1.aShortArray44[local691];
						} else {
							local718 = arg1.aShortArray46[local691];
						}
						local737 = arg1.anIntArray251[local718];
						local742 = arg1.anIntArray249[local718];
						@Pc(747) int local747 = arg1.anIntArray246[local718];
						if (local636[local704] > local737) {
							local636[local704] = local737;
						}
						if (local737 > local639[local704]) {
							local639[local704] = local737;
						}
						if (local742 < local642[local704]) {
							local642[local704] = local742;
						}
						if (local742 > local645[local704]) {
							local645[local704] = local742;
						}
						if (local747 < local648[local704]) {
							local648[local704] = local747;
						}
						if (local747 > local651[local704]) {
							local651[local704] = local747;
						}
					}
				}
			}
			local621 = new int[local633];
			local625 = new int[local633];
			local627 = new float[local633][];
			local623 = new int[local633];
			for (local691 = 0; local691 < local633; local691++) {
				@Pc(849) byte local849 = arg1.aByteArray38[local691];
				if (local849 > 0) {
					local621[local691] = (local639[local691] + local636[local691]) / 2;
					local623[local691] = (local642[local691] + local645[local691]) / 2;
					local625[local691] = (local648[local691] + local651[local691]) / 2;
					if (local849 == 1) {
						local742 = arg1.anIntArray242[local691];
						local906 = 64.0F / (float) arg1.anIntArray250[local691];
						if (local742 == 0) {
							local913 = 1.0F;
							local915 = 1.0F;
						} else if (local742 <= 0) {
							local913 = 1.0F;
							local915 = (float) -local742 / 1024.0F;
						} else {
							local913 = (float) local742 / 1024.0F;
							local915 = 1.0F;
						}
					} else if (local849 == 2) {
						local906 = 64.0F / (float) arg1.anIntArray250[local691];
						local915 = 64.0F / (float) arg1.anIntArray242[local691];
						local913 = 64.0F / (float) arg1.anIntArray248[local691];
					} else {
						local906 = (float) arg1.anIntArray250[local691] / 1024.0F;
						local915 = (float) arg1.anIntArray242[local691] / 1024.0F;
						local913 = (float) arg1.anIntArray248[local691] / 1024.0F;
					}
					local627[local691] = Static443.method6411(arg1.aShortArray39[local691], local913, arg1.aShortArray41[local691], arg1.aByteArray39[local691] & 0xFF, arg1.aShortArray43[local691], local906, local915);
				}
			}
		}
		@Pc(1032) Class241[] local1032 = new Class241[arg1.anInt3068];
		@Pc(1051) short local1051;
		@Pc(1061) int local1061;
		@Pc(1072) int local1072;
		for (@Pc(1034) int local1034 = 0; local1034 < arg1.anInt3068; local1034++) {
			@Pc(1041) short local1041 = arg1.aShortArray37[local1034];
			@Pc(1046) short local1046 = arg1.aShortArray44[local1034];
			local1051 = arg1.aShortArray46[local1034];
			local1061 = this.anIntArray389[local1046] - this.anIntArray389[local1041];
			local1072 = this.anIntArray385[local1046] - this.anIntArray385[local1041];
			local653 = this.anIntArray388[local1046] - this.anIntArray388[local1041];
			local685 = this.anIntArray389[local1051] - this.anIntArray389[local1041];
			local691 = this.anIntArray385[local1051] - this.anIntArray385[local1041];
			local704 = this.anIntArray388[local1051] - this.anIntArray388[local1041];
			local706 = local1072 * local704 - local691 * local653;
			@Pc(1133) int local1133 = local685 * local653 - local704 * local1061;
			local737 = local691 * local1061 - local685 * local1072;
			while (local706 > 8192 || local1133 > 8192 || local737 > 8192 || local706 < -8192 || local1133 < -8192 || local737 < -8192) {
				local1133 >>= 0x1;
				local737 >>= 0x1;
				local706 >>= 0x1;
			}
			local742 = (int) Math.sqrt((double) (local706 * local706 + local1133 * local1133 + local737 * local737));
			if (local742 <= 0) {
				local742 = 1;
			}
			local706 = local706 * 256 / local742;
			local737 = local737 * 256 / local742;
			local1133 = local1133 * 256 / local742;
			@Pc(1231) byte local1231 = arg1.aByteArray35 == null ? 0 : arg1.aByteArray35[local1034];
			if (local1231 == 0) {
				@Pc(1261) Class124 local1261 = local346[local1041];
				local1261.anInt3938 += local706;
				local1261.anInt3942++;
				local1261.anInt3943 += local1133;
				local1261.anInt3941 += local737;
				@Pc(1289) Class124 local1289 = local346[local1046];
				local1289.anInt3942++;
				local1289.anInt3938 += local706;
				local1289.anInt3943 += local1133;
				local1289.anInt3941 += local737;
				@Pc(1317) Class124 local1317 = local346[local1051];
				local1317.anInt3938 += local706;
				local1317.anInt3941 += local737;
				local1317.anInt3943 += local1133;
				local1317.anInt3942++;
			} else if (local1231 == 1) {
				@Pc(1246) Class241 local1246 = local1032[local1034] = new Class241();
				local1246.anInt6848 = local1133;
				local1246.anInt6852 = local706;
				local1246.anInt6851 = local737;
			}
		}
		@Pc(1354) int local1354;
		for (@Pc(1348) int local1348 = 0; local1348 < this.anInt5421; local1348++) {
			local1354 = local22[local1348];
			@Pc(1361) int local1361 = arg1.aShortArray45[local1354] & 0xFFFF;
			@Pc(1369) short local1369;
			if (arg1.aShortArray40 == null) {
				local1369 = -1;
			} else {
				local1369 = arg1.aShortArray40[local1354];
			}
			if (arg1.aByteArray37 == null) {
				local1072 = -1;
			} else {
				local1072 = arg1.aByteArray37[local1354];
			}
			if (arg1.aByteArray34 == null) {
				local653 = 0;
			} else {
				local653 = arg1.aByteArray34[local1354] & 0xFF;
			}
			@Pc(1401) float local1401 = 0.0F;
			@Pc(1403) float local1403 = 0.0F;
			@Pc(1405) float local1405 = 0.0F;
			local915 = 0.0F;
			local906 = 0.0F;
			local913 = 0.0F;
			@Pc(1413) byte local1413 = 0;
			@Pc(1415) byte local1415 = 0;
			@Pc(1417) int local1417 = 0;
			@Pc(1451) byte local1451;
			@Pc(1468) short local1468;
			@Pc(1473) short local1473;
			@Pc(1478) short local1478;
			if (local1369 != -1) {
				if (local1072 == -1) {
					local915 = 1.0F;
					local1405 = 1.0F;
					local1413 = 1;
					local1403 = 1.0F;
					local913 = 0.0F;
					local1401 = 0.0F;
					local1415 = 2;
					local906 = 0.0F;
				} else {
					local1072 &= 0xFF;
					local1451 = arg1.aByteArray38[local1072];
					@Pc(1458) short local1458;
					@Pc(1463) short local1463;
					@Pc(1501) float local1501;
					@Pc(1510) float local1510;
					@Pc(1519) float local1519;
					@Pc(1604) float local1604;
					@Pc(1613) float local1613;
					@Pc(1621) float local1621;
					@Pc(1629) float local1629;
					@Pc(1638) float local1638;
					@Pc(1647) float local1647;
					if (local1451 == 0) {
						local1458 = arg1.aShortArray37[local1354];
						local1463 = arg1.aShortArray44[local1354];
						local1468 = arg1.aShortArray46[local1354];
						local1473 = arg1.aShortArray43[local1072];
						local1478 = arg1.aShortArray41[local1072];
						@Pc(1483) short local1483 = arg1.aShortArray39[local1072];
						@Pc(1489) float local1489 = (float) arg1.anIntArray251[local1473];
						@Pc(1495) float local1495 = (float) arg1.anIntArray249[local1473];
						local1501 = arg1.anIntArray246[local1473];
						local1510 = (float) arg1.anIntArray251[local1478] - local1489;
						local1519 = (float) arg1.anIntArray249[local1478] - local1495;
						@Pc(1527) float local1527 = (float) arg1.anIntArray246[local1478] - local1501;
						@Pc(1535) float local1535 = (float) arg1.anIntArray251[local1483] - local1489;
						@Pc(1543) float local1543 = (float) arg1.anIntArray249[local1483] - local1495;
						@Pc(1552) float local1552 = (float) arg1.anIntArray246[local1483] - local1501;
						@Pc(1560) float local1560 = (float) arg1.anIntArray251[local1458] - local1489;
						@Pc(1569) float local1569 = (float) arg1.anIntArray249[local1458] - local1495;
						@Pc(1578) float local1578 = (float) arg1.anIntArray246[local1458] - local1501;
						@Pc(1586) float local1586 = (float) arg1.anIntArray251[local1463] - local1489;
						@Pc(1595) float local1595 = (float) arg1.anIntArray249[local1463] - local1495;
						local1604 = (float) arg1.anIntArray246[local1463] - local1501;
						local1613 = (float) arg1.anIntArray251[local1468] - local1489;
						local1621 = (float) arg1.anIntArray249[local1468] - local1495;
						local1629 = (float) arg1.anIntArray246[local1468] - local1501;
						local1638 = local1519 * local1552 - local1543 * local1527;
						local1647 = local1527 * local1535 - local1552 * local1510;
						@Pc(1655) float local1655 = local1510 * local1543 - local1519 * local1535;
						@Pc(1663) float local1663 = local1543 * local1655 - local1647 * local1552;
						@Pc(1672) float local1672 = local1552 * local1638 - local1535 * local1655;
						@Pc(1680) float local1680 = local1535 * local1647 - local1543 * local1638;
						@Pc(1694) float local1694 = 1.0F / (local1672 * local1519 + local1510 * local1663 + local1527 * local1680);
						local1401 = local1694 * (local1569 * local1672 + local1663 * local1560 + local1578 * local1680);
						local906 = (local1680 * local1629 + local1621 * local1672 + local1663 * local1613) * local1694;
						local1405 = (local1672 * local1595 + local1586 * local1663 + local1680 * local1604) * local1694;
						@Pc(1745) float local1745 = local1638 * local1527 - local1655 * local1510;
						@Pc(1754) float local1754 = local1519 * local1655 - local1527 * local1647;
						@Pc(1763) float local1763 = local1510 * local1647 - local1519 * local1638;
						@Pc(1777) float local1777 = 1.0F / (local1763 * local1552 + local1543 * local1745 + local1535 * local1754);
						local913 = (local1745 * local1621 + local1754 * local1613 + local1763 * local1629) * local1777;
						local1403 = (local1745 * local1569 + local1560 * local1754 + local1763 * local1578) * local1777;
						local915 = (local1586 * local1754 + local1595 * local1745 + local1604 * local1763) * local1777;
					} else {
						local1458 = arg1.aShortArray37[local1354];
						local1463 = arg1.aShortArray44[local1354];
						local1468 = arg1.aShortArray46[local1354];
						@Pc(1840) int local1840 = local621[local1072];
						@Pc(1844) int local1844 = local623[local1072];
						@Pc(1848) int local1848 = local625[local1072];
						@Pc(1852) float[] local1852 = local627[local1072];
						@Pc(1857) byte local1857 = arg1.aByteArray40[local1072];
						local1501 = (float) arg1.anIntArray245[local1072] / 256.0F;
						if (local1451 == 1) {
							local1510 = (float) arg1.anIntArray248[local1072] / 1024.0F;
							Static336.method5471(local1501, local1840, arg1.anIntArray249[local1458], local1848, local1852, arg1.anIntArray246[local1458], arg1.anIntArray251[local1458], local1844, local1857, local1510);
							local1401 = Static265.aFloat102;
							local1403 = Static312.aFloat114;
							Static336.method5471(local1501, local1840, arg1.anIntArray249[local1463], local1848, local1852, arg1.anIntArray246[local1463], arg1.anIntArray251[local1463], local1844, local1857, local1510);
							local1405 = Static265.aFloat102;
							local915 = Static312.aFloat114;
							Static336.method5471(local1501, local1840, arg1.anIntArray249[local1468], local1848, local1852, arg1.anIntArray246[local1468], arg1.anIntArray251[local1468], local1844, local1857, local1510);
							local913 = Static312.aFloat114;
							local906 = Static265.aFloat102;
							local1519 = local1510 / 2.0F;
							if ((local1857 & 0x1) == 0) {
								if (local906 - local1401 > local1519) {
									local906 -= local1510;
									local1415 = 1;
								} else if (local1519 < local1401 - local906) {
									local906 += local1510;
									local1415 = 2;
								}
								if (local1405 - local1401 > local1519) {
									local1405 -= local1510;
									local1413 = 1;
								} else if (local1519 < local1401 - local1405) {
									local1405 += local1510;
									local1413 = 2;
								}
							} else {
								if (local915 - local1403 > local1519) {
									local1413 = 1;
									local915 -= local1510;
								} else if (local1519 < local1403 - local915) {
									local915 += local1510;
									local1413 = 2;
								}
								if (local1519 < local913 - local1403) {
									local913 -= local1510;
									local1415 = 1;
								} else if (local1403 - local913 > local1519) {
									local913 += local1510;
									local1415 = 2;
								}
							}
						} else if (local1451 == 2) {
							local1510 = (float) arg1.anIntArray240[local1072] / 256.0F;
							local1519 = (float) arg1.anIntArray244[local1072] / 256.0F;
							@Pc(2090) int local2090 = arg1.anIntArray251[local1463] - arg1.anIntArray251[local1458];
							@Pc(2101) int local2101 = arg1.anIntArray249[local1463] - arg1.anIntArray249[local1458];
							@Pc(2112) int local2112 = arg1.anIntArray246[local1463] - arg1.anIntArray246[local1458];
							@Pc(2122) int local2122 = arg1.anIntArray251[local1468] - arg1.anIntArray251[local1458];
							@Pc(2133) int local2133 = arg1.anIntArray249[local1468] - arg1.anIntArray249[local1458];
							@Pc(2144) int local2144 = arg1.anIntArray246[local1468] - arg1.anIntArray246[local1458];
							@Pc(2153) int local2153 = local2144 * local2101 - local2112 * local2133;
							@Pc(2162) int local2162 = local2122 * local2112 - local2144 * local2090;
							@Pc(2170) int local2170 = local2133 * local2090 - local2101 * local2122;
							local1604 = 64.0F / (float) arg1.anIntArray242[local1072];
							local1613 = 64.0F / (float) arg1.anIntArray250[local1072];
							local1621 = 64.0F / (float) arg1.anIntArray248[local1072];
							local1629 = ((float) local2162 * local1852[1] + (float) local2153 * local1852[0] + (float) local2170 * local1852[2]) / local1604;
							local1638 = ((float) local2170 * local1852[5] + (float) local2162 * local1852[4] + local1852[3] * (float) local2153) / local1613;
							local1647 = ((float) local2170 * local1852[8] + local1852[7] * (float) local2162 + (float) local2153 * local1852[6]) / local1621;
							local1417 = Static25.method1151(local1638, local1647, local1629);
							Static80.method2003(arg1.anIntArray249[local1458], local1501, local1844, local1840, local1519, local1852, arg1.anIntArray251[local1458], arg1.anIntArray246[local1458], local1848, local1857, local1417, local1510);
							local1401 = Static87.aFloat121;
							local1403 = Static280.aFloat108;
							Static80.method2003(arg1.anIntArray249[local1463], local1501, local1844, local1840, local1519, local1852, arg1.anIntArray251[local1463], arg1.anIntArray246[local1463], local1848, local1857, local1417, local1510);
							local915 = Static280.aFloat108;
							local1405 = Static87.aFloat121;
							Static80.method2003(arg1.anIntArray249[local1468], local1501, local1844, local1840, local1519, local1852, arg1.anIntArray251[local1468], arg1.anIntArray246[local1468], local1848, local1857, local1417, local1510);
							local906 = Static87.aFloat121;
							local913 = Static280.aFloat108;
						} else if (local1451 == 3) {
							Static6.method214(local1857, local1852, arg1.anIntArray249[local1458], local1848, local1844, local1840, arg1.anIntArray251[local1458], arg1.anIntArray246[local1458], local1501);
							local1401 = Static216.aFloat93;
							local1403 = Static46.aFloat56;
							Static6.method214(local1857, local1852, arg1.anIntArray249[local1463], local1848, local1844, local1840, arg1.anIntArray251[local1463], arg1.anIntArray246[local1463], local1501);
							local1405 = Static216.aFloat93;
							local915 = Static46.aFloat56;
							Static6.method214(local1857, local1852, arg1.anIntArray249[local1468], local1848, local1844, local1840, arg1.anIntArray251[local1468], arg1.anIntArray246[local1468], local1501);
							local906 = Static216.aFloat93;
							local913 = Static46.aFloat56;
							if ((local1857 & 0x1) == 0) {
								if (local1405 - local1401 > 0.5F) {
									local1413 = 1;
									local1405--;
								} else if (local1401 - local1405 > 0.5F) {
									local1413 = 2;
									local1405++;
								}
								if (local906 - local1401 > 0.5F) {
									local1415 = 1;
									local906--;
								} else if (local1401 - local906 > 0.5F) {
									local1415 = 2;
									local906++;
								}
							} else {
								if (local913 - local1403 > 0.5F) {
									local1415 = 1;
									local913--;
								} else if (local1403 - local913 > 0.5F) {
									local1415 = 2;
									local913++;
								}
								if (local915 - local1403 > 0.5F) {
									local1413 = 1;
									local915--;
								} else if (local1403 - local915 > 0.5F) {
									local915++;
									local1413 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray35 == null) {
				local1451 = 0;
			} else {
				local1451 = arg1.aByteArray35[local1354];
			}
			if (local1451 == 0) {
				@Pc(2715) long local2715 = (long) (local1072 << 2) + ((long) (local1361 << 8) + (long) (local1417 << 24) + (long) local653 << 32);
				local1468 = arg1.aShortArray37[local1354];
				local1473 = arg1.aShortArray44[local1354];
				local1478 = arg1.aShortArray46[local1354];
				@Pc(2734) Class124 local2734 = local346[local1468];
				this.aShortArray104[local1348] = this.method4709(local1401, arg1, local2734.anInt3943, local1468, local1348, local2734.anInt3938, local2715, local2734.anInt3941, local1403, local2734.anInt3942);
				@Pc(2759) Class124 local2759 = local346[local1473];
				this.aShortArray96[local1348] = this.method4709(local1405, arg1, local2759.anInt3943, local1473, local1348, local2759.anInt3938, (long) local1413 + local2715, local2759.anInt3941, local915, local2759.anInt3942);
				@Pc(2787) Class124 local2787 = local346[local1478];
				this.aShortArray97[local1348] = this.method4709(local906, arg1, local2787.anInt3943, local1478, local1348, local2787.anInt3938, local2715 + (long) local1415, local2787.anInt3941, local913, local2787.anInt3942);
			} else if (local1451 == 1) {
				@Pc(2572) Class241 local2572 = local1032[local1354];
				@Pc(2617) long local2617 = (long) ((local2572.anInt6848 + 256 << 12) + (local1072 << 2) + (local2572.anInt6852 > 0 ? 1024 : 2048) + (local2572.anInt6851 - -256 << 22)) + ((long) local653 + (long) (local1361 << 8) + (long) (local1417 << 24) << 32);
				this.aShortArray104[local1348] = this.method4709(local1401, arg1, local2572.anInt6848, arg1.aShortArray37[local1354], local1348, local2572.anInt6852, local2617, local2572.anInt6851, local1403, 0);
				this.aShortArray96[local1348] = this.method4709(local1405, arg1, local2572.anInt6848, arg1.aShortArray44[local1354], local1348, local2572.anInt6852, local2617 + (long) local1413, local2572.anInt6851, local915, 0);
				this.aShortArray97[local1348] = this.method4709(local906, arg1, local2572.anInt6848, arg1.aShortArray46[local1354], local1348, local2572.anInt6852, local2617 + (long) local1415, local2572.anInt6851, local913, 0);
			}
			if (arg1.aShortArray40 == null) {
				this.aShortArray93[local1348] = -1;
			} else {
				this.aShortArray93[local1348] = arg1.aShortArray40[local1354];
			}
			if (arg1.aByteArray34 != null) {
				this.aByteArray71[local1348] = arg1.aByteArray34[local1354];
			}
			if (arg1.aShortArray38 != null) {
				this.aShortArray92[local1348] = arg1.aShortArray38[local1354];
			}
			this.aShortArray101[local1348] = arg1.aShortArray45[local1354];
		}
		if (this.anInt5449 > 0) {
			local1354 = 1;
			local1051 = this.aShortArray93[0];
			for (local1061 = 0; local1061 < this.anInt5449; local1061++) {
				@Pc(2890) short local2890 = this.aShortArray93[local1061];
				if (local1051 != local2890) {
					local1354++;
					local1051 = local2890;
				}
			}
			this.anIntArray384 = new int[local1354 + 1];
			this.anIntArray387 = new int[local1354];
			this.anIntArray383 = new int[local1354];
			this.anIntArray384[0] = 0;
			local1072 = this.anInt5468;
			local1354 = 0;
			local1051 = this.aShortArray93[0];
			@Pc(2936) short local2936 = 0;
			for (local685 = 0; local685 < this.anInt5449; local685++) {
				@Pc(2945) short local2945 = this.aShortArray93[local685];
				if (local1051 != local2945) {
					this.anIntArray383[local1354] = local1072;
					this.anIntArray387[local1354] = local2936 + 1 - local1072;
					local1354++;
					this.anIntArray384[local1354] = local685;
					local1051 = local2945;
					local1072 = this.anInt5468;
					local2936 = 0;
				}
				@Pc(2984) short local2984 = this.aShortArray104[local685];
				if (local2984 > local2936) {
					local2936 = local2984;
				}
				if (local1072 > local2984) {
					local1072 = local2984;
				}
				local2984 = this.aShortArray96[local685];
				if (local2984 < local1072) {
					local1072 = local2984;
				}
				if (local2984 > local2936) {
					local2936 = local2984;
				}
				local2984 = this.aShortArray97[local685];
				if (local2984 > local2936) {
					local2936 = local2984;
				}
				if (local2984 < local1072) {
					local1072 = local2984;
				}
			}
			this.anIntArray383[local1354] = local1072;
			this.anIntArray387[local1354] = local2936 + 1 - local1072;
			local1354++;
			this.anIntArray384[local1354] = this.anInt5449;
		}
		Static414.aLongArray12 = null;
		this.aShortArray100 = Static233.method3995(this.anInt5468, this.aShortArray100);
		this.aShortArray98 = Static233.method3995(this.anInt5468, this.aShortArray98);
		this.aShortArray99 = Static233.method3995(this.anInt5468, this.aShortArray99);
		this.aShortArray94 = Static233.method3995(this.anInt5468, this.aShortArray94);
		this.aShortArray102 = Static233.method3995(this.anInt5468, this.aShortArray102);
		this.aByteArray72 = Static332.method5435(this.anInt5468, this.aByteArray72);
		this.aFloatArray45 = Static284.method4837(this.anInt5468, this.aFloatArray45);
		this.aFloatArray46 = Static284.method4837(this.anInt5468, this.aFloatArray46);
		if (arg1.anIntArray243 != null && Static515.method7357(arg2, this.anInt5478)) {
			this.anIntArrayArray43 = arg1.method2794(false);
		}
		if (arg1.aClass26Array1 != null && Static521.method7432(this.anInt5478, arg2)) {
			this.anIntArrayArray41 = arg1.method2796();
		}
		if (arg1.anIntArray241 != null && Static43.method1390(this.anInt5478, arg2)) {
			local1354 = 0;
			local645 = new int[256];
			for (local1061 = 0; local1061 < this.anInt5421; local1061++) {
				local1072 = arg1.anIntArray241[local22[local1061]];
				if (local1072 >= 0) {
					if (local1354 < local1072) {
						local1354 = local1072;
					}
					@Pc(3204) int local3204 = local645[local1072]++;
				}
			}
			this.anIntArrayArray42 = new int[local1354 + 1][];
			for (local1072 = 0; local1072 <= local1354; local1072++) {
				this.anIntArrayArray42[local1072] = new int[local645[local1072]];
				local645[local1072] = 0;
			}
			for (local653 = 0; local653 < this.anInt5421; local653++) {
				local685 = arg1.anIntArray241[local22[local653]];
				if (local685 >= 0) {
					this.anIntArrayArray42[local685][local645[local685]++] = local653;
				}
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!cb;IIZZ)V")
	public Class19_Sub2(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5409 = 0;
		this.anInt5421 = 0;
		this.aBoolean373 = false;
		this.anInt5423 = 0;
		this.anInt5449 = 0;
		this.aBoolean372 = false;
		this.anInt5468 = 0;
		this.aBoolean374 = true;
		this.anInt5475 = arg1;
		this.aClass9_Sub1_8 = arg0;
		this.anInt5478 = arg2;
		this.aBoolean373 = arg4;
		if (arg3 || Static328.method5369(this.anInt5475, this.anInt5478)) {
			this.aClass311_2 = new Class311(Static309.method5130(this.anInt5475, this.anInt5478));
		}
		if (arg3 || Static97.method5683(this.anInt5475, this.anInt5478)) {
			this.aClass311_1 = new Class311(Static474.method4261(this.anInt5478, this.anInt5475));
		}
		if (arg3 || Static436.method6378(this.anInt5478, this.anInt5475)) {
			this.aClass311_4 = new Class311(Static153.method3113(this.anInt5478, this.anInt5475));
		}
		if (arg3 || Static201.method3745(this.anInt5478, this.anInt5475)) {
			this.aClass311_3 = new Class311(Static350.method5565(this.anInt5475, this.anInt5478));
		}
		if (arg3 || Static8.method230(this.anInt5478, this.anInt5475)) {
			this.aClass236_1 = new Class236(Static163.method3252(this.anInt5475, this.anInt5478));
		}
	}

	@OriginalMember(owner = "client!li", name = "wa", descriptor = "()I")
	@Override
	public int wa() {
		if (!this.aBoolean372) {
			this.method4705();
		}
		return this.anInt5420;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method7263(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class19_Sub2 local8 = (Class19_Sub2) arg0;
		if (this.anInt5421 == 0 || local8.anInt5421 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt5423;
		@Pc(21) int[] local21 = local8.anIntArray389;
		@Pc(24) int[] local24 = local8.anIntArray385;
		@Pc(27) int[] local27 = local8.anIntArray388;
		@Pc(30) short[] local30 = local8.aShortArray99;
		@Pc(33) short[] local33 = local8.aShortArray94;
		@Pc(36) short[] local36 = local8.aShortArray102;
		@Pc(39) byte[] local39 = local8.aByteArray72;
		@Pc(46) short[] local46;
		@Pc(50) short[] local50;
		@Pc(48) short[] local48;
		@Pc(44) byte[] local44;
		if (this.aClass13_1 == null) {
			local44 = null;
			local46 = null;
			local48 = null;
			local50 = null;
		} else {
			local46 = this.aClass13_1.aShortArray4;
			local50 = this.aClass13_1.aShortArray3;
			local44 = this.aClass13_1.aByteArray2;
			local48 = this.aClass13_1.aShortArray2;
		}
		@Pc(83) short[] local83;
		@Pc(79) short[] local79;
		@Pc(75) short[] local75;
		@Pc(87) byte[] local87;
		if (local8.aClass13_1 == null) {
			local87 = null;
			local79 = null;
			local83 = null;
			local75 = null;
		} else {
			local75 = local8.aClass13_1.aShortArray2;
			local79 = local8.aClass13_1.aShortArray3;
			local83 = local8.aClass13_1.aShortArray4;
			local87 = local8.aClass13_1.aByteArray2;
		}
		@Pc(100) int[] local100 = local8.anIntArray386;
		@Pc(103) short[] local103 = local8.aShortArray95;
		if (!local8.aBoolean372) {
			local8.method4705();
		}
		@Pc(112) int local112 = local8.anInt5430;
		@Pc(115) int local115 = local8.anInt5446;
		@Pc(118) int local118 = local8.anInt5420;
		@Pc(121) int local121 = local8.anInt5451;
		@Pc(124) int local124 = local8.anInt5438;
		@Pc(127) int local127 = local8.anInt5458;
		for (@Pc(129) int local129 = 0; local129 < this.anInt5423; local129++) {
			@Pc(138) int local138 = this.anIntArray385[local129] - arg2;
			if (local112 <= local138 && local115 >= local138) {
				@Pc(157) int local157 = this.anIntArray389[local129] - arg1;
				if (local157 >= local118 && local157 <= local121) {
					@Pc(181) int local181 = this.anIntArray388[local129] - arg3;
					if (local124 <= local181 && local181 <= local127) {
						@Pc(195) int local195 = -1;
						@Pc(200) int local200 = this.anIntArray386[local129];
						@Pc(207) int local207 = this.anIntArray386[local129 + 1];
						for (@Pc(209) int local209 = local200; local209 < local207; local209++) {
							local195 = this.aShortArray95[local209] - 1;
							if (local195 == -1 || this.aByteArray72[local195] != 0) {
								break;
							}
						}
						if (local195 != -1) {
							for (@Pc(244) int local244 = 0; local244 < local18; local244++) {
								if (local21[local244] == local157 && local181 == local27[local244] && local138 == local24[local244]) {
									local200 = local100[local244];
									@Pc(275) int local275 = -1;
									local207 = local100[local244 + 1];
									for (@Pc(283) int local283 = local200; local283 < local207; local283++) {
										local275 = local103[local283] - 1;
										if (local275 == -1 || local39[local275] != 0) {
											break;
										}
									}
									if (local275 != -1) {
										if (local46 == null) {
											this.aClass13_1 = new Class13();
											local46 = this.aClass13_1.aShortArray4 = Static376.method5719(this.aShortArray99);
											local50 = this.aClass13_1.aShortArray3 = Static376.method5719(this.aShortArray94);
											local48 = this.aClass13_1.aShortArray2 = Static376.method5719(this.aShortArray102);
											local44 = this.aClass13_1.aByteArray2 = Static164.method3259(this.aByteArray72);
										}
										if (local83 == null) {
											@Pc(366) Class13 local366 = local8.aClass13_1 = new Class13();
											local83 = local366.aShortArray4 = Static376.method5719(local30);
											local79 = local366.aShortArray3 = Static376.method5719(local33);
											local75 = local366.aShortArray2 = Static376.method5719(local36);
											local87 = local366.aByteArray2 = Static164.method3259(local39);
										}
										@Pc(399) short local399 = this.aShortArray99[local195];
										@Pc(404) short local404 = this.aShortArray94[local195];
										@Pc(409) short local409 = this.aShortArray102[local195];
										@Pc(414) byte local414 = this.aByteArray72[local195];
										local200 = local100[local244];
										local207 = local100[local244 + 1];
										@Pc(434) int local434;
										for (@Pc(426) int local426 = local200; local426 < local207; local426++) {
											local434 = local103[local426] - 1;
											if (local434 == -1) {
												break;
											}
											if (local87[local434] != 0) {
												local83[local434] += local399;
												local79[local434] += local404;
												local75[local434] += local409;
												local87[local434] += local414;
											}
										}
										local414 = local39[local275];
										local409 = local36[local275];
										local200 = this.anIntArray386[local129];
										local207 = this.anIntArray386[local129 + 1];
										local399 = local30[local275];
										local404 = local33[local275];
										for (local434 = local200; local434 < local207; local434++) {
											@Pc(519) int local519 = this.aShortArray95[local434] - 1;
											if (local519 == -1) {
												break;
											}
											if (local44[local519] != 0) {
												local46[local519] += local399;
												local50[local519] += local404;
												local48[local519] += local409;
												local44[local519] += local414;
											}
										}
										local8.method4704();
										this.method4704();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!m;Lclient!pr;II)V")
	@Override
	public void method7253(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class2_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5468 == 0) {
			return;
		}
		@Pc(16) Class22_Sub3 local16 = this.aClass9_Sub1_8.aClass22_Sub3_16;
		if (!this.aBoolean372) {
			this.method4705();
		}
		@Pc(25) Class22_Sub3 local25 = (Class22_Sub3) arg0;
		Static380.aFloat131 = local16.aFloat133 * local25.aFloat136 + local25.aFloat135 * local16.aFloat144 + local25.aFloat144 * local16.aFloat143;
		Static459.aFloat175 = local16.aFloat142 + local25.aFloat142 * local16.aFloat143 + local16.aFloat133 * local25.aFloat138 + local25.aFloat134 * local16.aFloat144;
		@Pc(72) float local72 = Static380.aFloat131 * (float) this.anInt5430 + Static459.aFloat175;
		@Pc(80) float local80 = Static380.aFloat131 * (float) this.anInt5446 + Static459.aFloat175;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local80 < local72) {
			local90 = (float) this.anInt5414 + local72;
			local97 = (float) -this.anInt5414 + local80;
		} else {
			local97 = (float) -this.anInt5414 + local72;
			local90 = (float) this.anInt5414 + local80;
		}
		if (local97 >= this.aClass9_Sub1_8.aFloat185 || (float) this.aClass9_Sub1_8.anInt9217 >= local90) {
			return;
		}
		Static371.aFloat129 = local16.aFloat140 * local25.aFloat136 + local16.aFloat136 * local25.aFloat135 + local25.aFloat144 * local16.aFloat141;
		Static427.aFloat149 = local16.aFloat138 + local25.aFloat142 * local16.aFloat141 + local25.aFloat138 * local16.aFloat140 + local25.aFloat134 * local16.aFloat136;
		@Pc(174) float local174 = (float) this.anInt5430 * Static371.aFloat129 + Static427.aFloat149;
		@Pc(182) float local182 = Static371.aFloat129 * (float) this.anInt5446 + Static427.aFloat149;
		@Pc(198) float local198;
		@Pc(209) float local209;
		if (local182 < local174) {
			local209 = (float) this.aClass9_Sub1_8.anInt9226 * (local174 + (float) this.anInt5414);
			local198 = ((float) -this.anInt5414 + local182) * (float) this.aClass9_Sub1_8.anInt9226;
		} else {
			local198 = ((float) -this.anInt5414 + local174) * (float) this.aClass9_Sub1_8.anInt9226;
			local209 = (float) this.aClass9_Sub1_8.anInt9226 * (local182 + (float) this.anInt5414);
		}
		if (this.aClass9_Sub1_8.aFloat201 <= local198 / (float) arg2 || this.aClass9_Sub1_8.aFloat196 >= local209 / (float) arg2) {
			return;
		}
		Static370.aFloat96 = local16.aFloat137 * local25.aFloat142 + local16.aFloat135 * local25.aFloat134 + local16.aFloat139 * local25.aFloat138 + local16.aFloat134;
		Static4.aFloat2 = local16.aFloat137 * local25.aFloat144 + local25.aFloat136 * local16.aFloat139 + local25.aFloat135 * local16.aFloat135;
		@Pc(301) float local301 = Static4.aFloat2 * (float) this.anInt5430 + Static370.aFloat96;
		@Pc(309) float local309 = Static4.aFloat2 * (float) this.anInt5446 + Static370.aFloat96;
		@Pc(324) float local324;
		@Pc(335) float local335;
		if (local301 > local309) {
			local324 = (float) this.aClass9_Sub1_8.anInt9224 * (local309 - (float) this.anInt5414);
			local335 = (float) this.aClass9_Sub1_8.anInt9224 * (local301 + (float) this.anInt5414);
		} else {
			local324 = ((float) -this.anInt5414 + local301) * (float) this.aClass9_Sub1_8.anInt9224;
			local335 = (float) this.aClass9_Sub1_8.anInt9224 * (local309 + (float) this.anInt5414);
		}
		if (local324 / (float) arg2 >= this.aClass9_Sub1_8.aFloat194 || this.aClass9_Sub1_8.aFloat186 >= local335 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass83Array1 != null) {
			Static3.aFloat1 = local25.aFloat133 * local16.aFloat141 + local25.aFloat140 * local16.aFloat140 + local25.aFloat139 * local16.aFloat136;
			Static452.aFloat152 = local25.aFloat133 * local16.aFloat137 + local16.aFloat139 * local25.aFloat140 + local25.aFloat139 * local16.aFloat135;
			Static467.aFloat176 = local25.aFloat141 * local16.aFloat140 + local25.aFloat137 * local16.aFloat136 + local25.aFloat143 * local16.aFloat141;
			Static314.aFloat115 = local16.aFloat133 * local25.aFloat141 + local16.aFloat144 * local25.aFloat137 + local16.aFloat143 * local25.aFloat143;
			Static437.aFloat150 = local16.aFloat135 * local25.aFloat137 + local25.aFloat141 * local16.aFloat139 + local16.aFloat137 * local25.aFloat143;
			Static393.aFloat132 = local25.aFloat139 * local16.aFloat144 + local25.aFloat140 * local16.aFloat133 + local16.aFloat143 * local25.aFloat133;
		}
		if (arg1 != null) {
			@Pc(503) int local503 = this.anInt5451 + this.anInt5420 >> 1;
			@Pc(511) int local511 = this.anInt5458 + this.anInt5438 >> 1;
			@Pc(530) int local530 = (int) (Static371.aFloat129 * (float) this.anInt5430 + Static427.aFloat149 + (float) local503 * Static3.aFloat1 + Static467.aFloat176 * (float) local511);
			@Pc(549) int local549 = (int) (Static452.aFloat152 * (float) local503 + Static370.aFloat96 + (float) this.anInt5430 * Static4.aFloat2 + Static437.aFloat150 * (float) local511);
			@Pc(568) int local568 = (int) (Static459.aFloat175 + Static393.aFloat132 * (float) local503 + Static380.aFloat131 * (float) this.anInt5430 + (float) local511 * Static314.aFloat115);
			@Pc(587) int local587 = (int) ((float) local511 * Static467.aFloat176 + Static371.aFloat129 * (float) this.anInt5446 + (float) local503 * Static3.aFloat1 + Static427.aFloat149);
			@Pc(606) int local606 = (int) (Static437.aFloat150 * (float) local511 + Static370.aFloat96 + (float) local503 * Static452.aFloat152 + Static4.aFloat2 * (float) this.anInt5446);
			arg1.anInt6643 = this.aClass9_Sub1_8.anInt9208 + this.aClass9_Sub1_8.anInt9226 * local587 / arg2;
			arg1.anInt6639 = this.aClass9_Sub1_8.anInt9205 + this.aClass9_Sub1_8.anInt9224 * local606 / arg2;
			arg1.anInt6640 = local530 * this.aClass9_Sub1_8.anInt9226 / arg2 + this.aClass9_Sub1_8.anInt9208;
			@Pc(664) int local664 = (int) (Static459.aFloat175 + Static393.aFloat132 * (float) local503 + Static380.aFloat131 * (float) this.anInt5446 + (float) local511 * Static314.aFloat115);
			arg1.anInt6642 = this.aClass9_Sub1_8.anInt9224 * local549 / arg2 + this.aClass9_Sub1_8.anInt9205;
			if (this.aClass9_Sub1_8.anInt9217 > local568 && this.aClass9_Sub1_8.anInt9217 > local664) {
				arg1.aBoolean437 = true;
				arg1.anInt6641 = this.aClass9_Sub1_8.anInt9208 + (local530 + this.anInt5414) * this.aClass9_Sub1_8.anInt9226 / arg2 - arg1.anInt6640;
			}
		}
		this.aClass9_Sub1_8.method7743((float) arg2);
		this.aClass9_Sub1_8.method7776();
		this.aClass9_Sub1_8.method7720(local25);
		this.method4710();
		this.method4701();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!ch;I)V")
	private void method4698(@OriginalArg(0) Class1_Sub1_Sub4_Sub1 arg0) {
		if (this.anInt5468 > Static372.anIntArray493.length) {
			Static372.anIntArray493 = new int[this.anInt5468];
			Static399.anIntArray524 = new int[this.anInt5468];
		}
		@Pc(45) int local45;
		@Pc(83) int local83;
		@Pc(92) int local92;
		for (@Pc(20) int local20 = 0; local20 < this.anInt5423; local20++) {
			local45 = (this.anIntArray389[local20] - (this.aClass9_Sub1_8.anInt9211 * this.anIntArray385[local20] >> 8) >> this.aClass9_Sub1_8.anInt9216) - arg0.anInt1644;
			@Pc(69) int local69 = (this.anIntArray388[local20] - (this.anIntArray385[local20] * this.aClass9_Sub1_8.anInt9200 >> 8) >> this.aClass9_Sub1_8.anInt9216) - arg0.anInt1646;
			@Pc(74) int local74 = this.anIntArray386[local20];
			@Pc(81) int local81 = this.anIntArray386[local20 + 1];
			for (local83 = local74; local83 < local81; local83++) {
				local92 = this.aShortArray95[local83] - 1;
				if (local92 == -1) {
					break;
				}
				Static372.anIntArray493[local92] = local45;
				Static399.anIntArray524[local92] = local69;
			}
		}
		for (local45 = 0; local45 < this.anInt5449; local45++) {
			if (this.aByteArray71 == null || this.aByteArray71[local45] <= 128) {
				@Pc(138) short local138 = this.aShortArray104[local45];
				@Pc(143) short local143 = this.aShortArray96[local45];
				@Pc(148) short local148 = this.aShortArray97[local45];
				local83 = Static372.anIntArray493[local138];
				local92 = Static372.anIntArray493[local143];
				@Pc(160) int local160 = Static372.anIntArray493[local148];
				@Pc(164) int local164 = Static399.anIntArray524[local138];
				@Pc(168) int local168 = Static399.anIntArray524[local143];
				@Pc(172) int local172 = Static399.anIntArray524[local148];
				if ((local83 - local92) * (-local172 + local168) - (local168 - local164) * (local160 - local92) > 0) {
					arg0.method1641(local160, local164, local172, local83, local92, local168);
				}
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "ga", descriptor = "()I")
	@Override
	public int ga() {
		return this.aShort85;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
	private void method4699() {
		if (this.aClass236_1 != null) {
			this.aClass236_1.aBoolean447 = false;
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "()[Lclient!lh;")
	@Override
	public Class178[] method7251() {
		return this.aClass178Array4;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!m;Lclient!pr;I)V")
	@Override
	public void method7258(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class2_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5468 == 0) {
			return;
		}
		@Pc(13) Class22_Sub3 local13 = this.aClass9_Sub1_8.aClass22_Sub3_16;
		if (!this.aBoolean372) {
			this.method4705();
		}
		@Pc(22) Class22_Sub3 local22 = (Class22_Sub3) arg0;
		this.method4702(local22);
		Static380.aFloat131 = local13.aFloat143 * local22.aFloat144 + local22.aFloat135 * local13.aFloat144 + local13.aFloat133 * local22.aFloat136;
		Static459.aFloat175 = local13.aFloat144 * local22.aFloat134 + local22.aFloat138 * local13.aFloat133 + local22.aFloat142 * local13.aFloat143 + local13.aFloat142;
		@Pc(73) float local73 = Static459.aFloat175 + (float) this.anInt5430 * Static380.aFloat131;
		@Pc(81) float local81 = Static380.aFloat131 * (float) this.anInt5446 + Static459.aFloat175;
		@Pc(98) float local98;
		@Pc(91) float local91;
		if (local81 < local73) {
			local91 = local73 + (float) this.anInt5414;
			local98 = (float) -this.anInt5414 + local81;
		} else {
			local91 = local81 + (float) this.anInt5414;
			local98 = local73 - (float) this.anInt5414;
		}
		if (local98 >= this.aClass9_Sub1_8.aFloat190 || local91 <= (float) this.aClass9_Sub1_8.anInt9217) {
			return;
		}
		Static371.aFloat129 = local22.aFloat144 * local13.aFloat141 + local22.aFloat136 * local13.aFloat140 + local22.aFloat135 * local13.aFloat136;
		Static427.aFloat149 = local22.aFloat134 * local13.aFloat136 + local22.aFloat138 * local13.aFloat140 + local22.aFloat142 * local13.aFloat141 + local13.aFloat138;
		@Pc(174) float local174 = Static427.aFloat149 + Static371.aFloat129 * (float) this.anInt5430;
		@Pc(182) float local182 = Static427.aFloat149 + (float) this.anInt5446 * Static371.aFloat129;
		@Pc(198) float local198;
		@Pc(209) float local209;
		if (local182 < local174) {
			local198 = (float) this.aClass9_Sub1_8.anInt9226 * ((float) -this.anInt5414 + local182);
			local209 = (local174 + (float) this.anInt5414) * (float) this.aClass9_Sub1_8.anInt9226;
		} else {
			local209 = (local182 + (float) this.anInt5414) * (float) this.aClass9_Sub1_8.anInt9226;
			local198 = (float) this.aClass9_Sub1_8.anInt9226 * ((float) -this.anInt5414 + local174);
		}
		if (this.aClass9_Sub1_8.aFloat201 <= local198 / local91 || this.aClass9_Sub1_8.aFloat196 >= local209 / local91) {
			return;
		}
		Static4.aFloat2 = local22.aFloat135 * local13.aFloat135 + local22.aFloat136 * local13.aFloat139 + local22.aFloat144 * local13.aFloat137;
		Static370.aFloat96 = local22.aFloat142 * local13.aFloat137 + local22.aFloat138 * local13.aFloat139 + local22.aFloat134 * local13.aFloat135 + local13.aFloat134;
		@Pc(299) float local299 = Static370.aFloat96 + (float) this.anInt5430 * Static4.aFloat2;
		@Pc(307) float local307 = Static4.aFloat2 * (float) this.anInt5446 + Static370.aFloat96;
		@Pc(334) float local334;
		@Pc(322) float local322;
		if (local307 < local299) {
			local322 = ((float) this.anInt5414 + local299) * (float) this.aClass9_Sub1_8.anInt9224;
			local334 = ((float) -this.anInt5414 + local307) * (float) this.aClass9_Sub1_8.anInt9224;
		} else {
			local334 = (float) this.aClass9_Sub1_8.anInt9224 * (local299 - (float) this.anInt5414);
			local322 = (local307 + (float) this.anInt5414) * (float) this.aClass9_Sub1_8.anInt9224;
		}
		if (this.aClass9_Sub1_8.aFloat194 <= local334 / local91 || this.aClass9_Sub1_8.aFloat186 >= local322 / local91) {
			return;
		}
		if (arg1 != null || this.aClass83Array1 != null) {
			Static3.aFloat1 = local13.aFloat136 * local22.aFloat139 + local13.aFloat140 * local22.aFloat140 + local22.aFloat133 * local13.aFloat141;
			Static314.aFloat115 = local22.aFloat143 * local13.aFloat143 + local13.aFloat144 * local22.aFloat137 + local13.aFloat133 * local22.aFloat141;
			Static452.aFloat152 = local22.aFloat133 * local13.aFloat137 + local13.aFloat135 * local22.aFloat139 + local22.aFloat140 * local13.aFloat139;
			Static393.aFloat132 = local13.aFloat143 * local22.aFloat133 + local13.aFloat133 * local22.aFloat140 + local13.aFloat144 * local22.aFloat139;
			Static437.aFloat150 = local22.aFloat141 * local13.aFloat139 + local22.aFloat137 * local13.aFloat135 + local13.aFloat137 * local22.aFloat143;
			Static467.aFloat176 = local22.aFloat143 * local13.aFloat141 + local22.aFloat137 * local13.aFloat136 + local22.aFloat141 * local13.aFloat140;
		}
		if (arg1 != null) {
			@Pc(493) boolean local493 = false;
			@Pc(495) boolean local495 = true;
			@Pc(503) int local503 = this.anInt5451 + this.anInt5420 >> 1;
			@Pc(511) int local511 = this.anInt5438 + this.anInt5458 >> 1;
			@Pc(530) int local530 = (int) (Static427.aFloat149 + Static3.aFloat1 * (float) local503 + Static371.aFloat129 * (float) this.anInt5430 + (float) local511 * Static467.aFloat176);
			@Pc(549) int local549 = (int) (Static452.aFloat152 * (float) local503 + Static370.aFloat96 + Static4.aFloat2 * (float) this.anInt5430 + Static437.aFloat150 * (float) local511);
			@Pc(568) int local568 = (int) (Static314.aFloat115 * (float) local511 + Static393.aFloat132 * (float) local503 + Static459.aFloat175 + Static380.aFloat131 * (float) this.anInt5430);
			if (this.aClass9_Sub1_8.anInt9217 > local568) {
				local493 = true;
			} else {
				arg1.anInt6640 = this.aClass9_Sub1_8.anInt9226 * local530 / local568 + this.aClass9_Sub1_8.anInt9208;
				arg1.anInt6642 = local549 * this.aClass9_Sub1_8.anInt9224 / local568 + this.aClass9_Sub1_8.anInt9205;
			}
			@Pc(622) int local622 = (int) ((float) local511 * Static467.aFloat176 + Static427.aFloat149 + Static3.aFloat1 * (float) local503 + (float) this.anInt5446 * Static371.aFloat129);
			@Pc(641) int local641 = (int) ((float) local511 * Static437.aFloat150 + Static452.aFloat152 * (float) local503 + Static370.aFloat96 + Static4.aFloat2 * (float) this.anInt5446);
			@Pc(660) int local660 = (int) ((float) this.anInt5446 * Static380.aFloat131 + Static459.aFloat175 + (float) local503 * Static393.aFloat132 + Static314.aFloat115 * (float) local511);
			if (this.aClass9_Sub1_8.anInt9217 <= local660) {
				arg1.anInt6639 = local641 * this.aClass9_Sub1_8.anInt9224 / local660 + this.aClass9_Sub1_8.anInt9205;
				arg1.anInt6643 = this.aClass9_Sub1_8.anInt9226 * local622 / local660 + this.aClass9_Sub1_8.anInt9208;
			} else {
				local493 = true;
			}
			if (local493) {
				if (local568 < this.aClass9_Sub1_8.anInt9217 && local660 < this.aClass9_Sub1_8.anInt9217) {
					local495 = false;
				} else {
					@Pc(743) int local743;
					@Pc(755) int local755;
					@Pc(765) int local765;
					if (this.aClass9_Sub1_8.anInt9217 > local568) {
						local743 = (local660 - this.aClass9_Sub1_8.anInt9217 << 16) / (local660 - local568);
						local755 = (local743 * (local622 - local530) >> 16) + local622;
						arg1.anInt6640 = local755 * this.aClass9_Sub1_8.anInt9226 / this.aClass9_Sub1_8.anInt9217 + this.aClass9_Sub1_8.anInt9208;
						local765 = local641 + ((local641 - local549) * local743 >> 16);
						arg1.anInt6642 = this.aClass9_Sub1_8.anInt9205 + local765 * this.aClass9_Sub1_8.anInt9224 / this.aClass9_Sub1_8.anInt9217;
					} else if (this.aClass9_Sub1_8.anInt9217 > local660) {
						local743 = (local568 - this.aClass9_Sub1_8.anInt9217 << 16) / (local568 - local660);
						local755 = local530 + (local743 * (local530 - local622) >> 16);
						local765 = (local743 * (local549 - local641) >> 16) + local549;
						arg1.anInt6640 = local755 * this.aClass9_Sub1_8.anInt9226 / this.aClass9_Sub1_8.anInt9217 + this.aClass9_Sub1_8.anInt9208;
						arg1.anInt6642 = this.aClass9_Sub1_8.anInt9205 + local765 * this.aClass9_Sub1_8.anInt9224 / this.aClass9_Sub1_8.anInt9217;
					}
				}
			}
			if (local495) {
				if (local568 <= local660) {
					arg1.anInt6641 = this.aClass9_Sub1_8.anInt9208 + (local622 + this.anInt5414) * this.aClass9_Sub1_8.anInt9226 / local660 - arg1.anInt6643;
				} else {
					arg1.anInt6641 = this.aClass9_Sub1_8.anInt9226 * (local530 + this.anInt5414) / local568 + this.aClass9_Sub1_8.anInt9208 - arg1.anInt6640;
				}
				arg1.aBoolean437 = true;
			}
		}
		this.aClass9_Sub1_8.method7649();
		this.aClass9_Sub1_8.method7720(local22);
		this.method4710();
		this.method4701();
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(B)Z")
	private boolean method4700() {
		@Pc(13) boolean local13 = !this.aClass311_4.aBoolean615;
		@Pc(26) boolean local26 = (this.anInt5478 & 0x37) != 0 && !this.aClass311_3.aBoolean615;
		@Pc(34) boolean local34 = !this.aClass311_2.aBoolean615;
		@Pc(42) boolean local42 = !this.aClass311_1.aBoolean615;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(54) boolean local54 = true;
		@Pc(73) Interface15 local73;
		@Pc(87) Buffer local87;
		if (local34) {
			if (this.aClass311_2.anInterface15_12 == null) {
				this.aClass311_2.anInterface15_12 = this.aClass9_Sub1_8.method7707(this.aBoolean373);
			}
			local73 = this.aClass311_2.anInterface15_12;
			local73.method6277(this.anInt5468 * 12, 12);
			local87 = local73.method7519();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass9_Sub1_8.aNativeInterface3.copyPositions(this.anIntArray389, this.anIntArray385, this.anIntArray388, this.aShortArray100, 0, 12, this.anInt5468, local87.getAddress());
				if (local73.method7521()) {
					this.aClass311_2.aBoolean615 = true;
					this.aClass311_2.anInterface15_11 = local73;
				} else {
					local54 = false;
				}
			}
		}
		@Pc(201) short[] local201;
		@Pc(198) short[] local198;
		@Pc(195) short[] local195;
		@Pc(204) byte[] local204;
		if (local13) {
			if (this.aClass311_4.anInterface15_12 == null) {
				this.aClass311_4.anInterface15_12 = this.aClass9_Sub1_8.method7707(this.aBoolean373);
			}
			local73 = this.aClass311_4.anInterface15_12;
			local73.method6277(this.anInt5468 * 4, 4);
			local87 = local73.method7519();
			if (local87 == null) {
				local54 = false;
			} else {
				if ((this.anInt5478 & 0x37) == 0) {
					if (this.aClass13_1 == null) {
						local195 = this.aShortArray102;
						local198 = this.aShortArray94;
						local201 = this.aShortArray99;
						local204 = this.aByteArray72;
					} else {
						local204 = this.aClass13_1.aByteArray2;
						local201 = this.aClass13_1.aShortArray4;
						local198 = this.aClass13_1.aShortArray3;
						local195 = this.aClass13_1.aShortArray2;
					}
					this.aClass9_Sub1_8.aNativeInterface3.copyLighting(this.aShortArray101, this.aByteArray71, this.aShortArray93, local201, local198, local195, local204, this.aShort84, this.aShort85, this.aShortArray98, 0, 4, this.anInt5468, local87.getAddress());
				} else {
					this.aClass9_Sub1_8.aNativeInterface3.copyColours(this.aShortArray101, this.aByteArray71, this.aShortArray93, this.aShort84, this.aShortArray98, 0, 4, this.anInt5468, local87.getAddress());
				}
				if (local73.method7521()) {
					this.aClass311_4.anInterface15_11 = local73;
					this.aClass311_4.aBoolean615 = true;
				} else {
					local54 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass311_3.anInterface15_12 == null) {
				this.aClass311_3.anInterface15_12 = this.aClass9_Sub1_8.method7707(this.aBoolean373);
			}
			local73 = this.aClass311_3.anInterface15_12;
			local73.method6277(this.anInt5468 * 12, 12);
			local87 = local73.method7519();
			if (local87 == null) {
				local54 = false;
			} else {
				if (this.aClass13_1 == null) {
					local204 = this.aByteArray72;
					local198 = this.aShortArray94;
					local201 = this.aShortArray99;
					local195 = this.aShortArray102;
				} else {
					local195 = this.aClass13_1.aShortArray2;
					local201 = this.aClass13_1.aShortArray4;
					local198 = this.aClass13_1.aShortArray3;
					local204 = this.aClass13_1.aByteArray2;
				}
				this.aClass9_Sub1_8.aNativeInterface3.copyNormals(local201, local198, local195, local204, 3.0F / (float) this.aShort85, 3.0F / (float) (this.aShort85 / 2 + this.aShort85), 0, 12, this.anInt5468, local87.getAddress());
				if (local73.method7521()) {
					this.aClass311_3.anInterface15_11 = local73;
					this.aClass311_3.aBoolean615 = true;
				} else {
					local54 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass311_1.anInterface15_12 == null) {
				this.aClass311_1.anInterface15_12 = this.aClass9_Sub1_8.method7707(this.aBoolean373);
			}
			local73 = this.aClass311_1.anInterface15_12;
			local73.method6277(this.anInt5468 * 8, 8);
			local87 = local73.method7519();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass9_Sub1_8.aNativeInterface3.copyTexCoords(this.aFloatArray45, this.aFloatArray46, 0, 8, this.anInt5468, local87.getAddress());
				if (local73.method7521()) {
					this.aClass311_1.anInterface15_11 = local73;
					this.aClass311_1.aBoolean615 = true;
				} else {
					local54 = false;
				}
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "()[Lclient!ia;")
	@Override
	public Class129[] method7246() {
		return this.aClass129Array4;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	private void method4701() {
		if (this.aClass83Array1 == null) {
			return;
		}
		@Pc(12) float local12 = this.aClass9_Sub1_8.ra();
		@Pc(16) float local16 = this.aClass9_Sub1_8.P();
		this.aClass9_Sub1_8.method7589(false);
		this.aClass9_Sub1_8.method7738(false);
		this.aClass9_Sub1_8.method7678(Static349.aClass122_3, 1);
		this.aClass9_Sub1_8.method7735(1, Static349.aClass122_3);
		for (@Pc(41) int local41 = 0; local41 < this.anInt5461; local41++) {
			@Pc(48) Class83 local48 = this.aClass83Array1[local41];
			@Pc(53) Class128 local53 = this.aClass128Array1[local41];
			if (!local48.aBoolean187 || !this.aClass9_Sub1_8.method7591()) {
				@Pc(81) float local81 = (float) (this.anIntArray389[local48.anInt2856] + this.anIntArray389[local48.anInt2855] + this.anIntArray389[local48.anInt2853]) * 0.3333333F;
				@Pc(103) float local103 = (float) (this.anIntArray385[local48.anInt2853] + this.anIntArray385[local48.anInt2855] + this.anIntArray385[local48.anInt2856]) * 0.3333333F;
				@Pc(125) float local125 = (float) (this.anIntArray388[local48.anInt2853] + this.anIntArray388[local48.anInt2855] + this.anIntArray388[local48.anInt2856]) * 0.3333333F;
				@Pc(139) float local139 = Static371.aFloat129 * local103 + Static3.aFloat1 * local81 + local125 * Static467.aFloat176 + Static427.aFloat149;
				@Pc(153) float local153 = Static437.aFloat150 * local125 + local103 * Static4.aFloat2 + Static452.aFloat152 * local81 + Static370.aFloat96;
				@Pc(167) float local167 = Static459.aFloat175 + local103 * Static380.aFloat131 + local81 * Static393.aFloat132 + local125 * Static314.aFloat115;
				@Pc(172) Class22_Sub3 local172 = this.aClass9_Sub1_8.method7760();
				local172.method5956(local48.aShort43 * local53.anInt4054 >> 7, local167, local53.anInt4058, local139 + (float) local53.anInt4056, (float) local53.anInt4055 + local153, local48.aShort44 * local53.anInt4057 >> 7);
				local172.method5955(this.aClass9_Sub1_8.aClass22_Sub3_17);
				this.aClass9_Sub1_8.method7656();
				this.aClass9_Sub1_8.la(local16, local12 - (float) local48.anInt2854 * 1.5F);
				@Pc(229) int local229 = local53.anInt4061;
				this.aClass9_Sub1_8.method7732(false, local48.aShort45, false);
				this.aClass9_Sub1_8.method7730(local48.aByte16);
				this.aClass9_Sub1_8.method7768(local229);
				this.aClass9_Sub1_8.method7758();
			}
		}
		this.aClass9_Sub1_8.method7735(1, Static426.aClass122_4);
		this.aClass9_Sub1_8.method7678(Static426.aClass122_4, 1);
		this.aClass9_Sub1_8.la(local16, local12);
		this.aClass9_Sub1_8.method7589(true);
	}

	@OriginalMember(owner = "client!li", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	@Override
	public void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean372) {
			this.method4705();
		}
		@Pc(16) int local16 = arg4 + this.anInt5420;
		@Pc(21) int local21 = this.anInt5451 + arg4;
		@Pc(26) int local26 = this.anInt5438 + arg6;
		@Pc(31) int local31 = arg6 + this.anInt5458;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt7410 + local21 >> arg2.anInt7411 >= arg2.anInt7412 || local26 < 0 || arg2.anInt7410 + local31 >> arg2.anInt7411 >= arg2.anInt7409)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local21 + arg3.anInt7410 >> arg3.anInt7411 >= arg3.anInt7412 || local26 < 0 || arg3.anInt7410 + local31 >> arg3.anInt7411 >= arg3.anInt7409) {
				return;
			}
		} else {
			local16 >>= arg2.anInt7411;
			local21 = arg2.anInt7410 + local21 - 1 >> arg2.anInt7411;
			local26 >>= arg2.anInt7411;
			local31 = arg2.anInt7410 + local31 - 1 >> arg2.anInt7411;
			if (arg5 == arg2.ba(local16, local26) && arg5 == arg2.ba(local21, local26) && arg5 == arg2.ba(local16, local31) && arg2.ba(local21, local31) == arg5) {
				return;
			}
		}
		@Pc(203) int local203;
		if (arg0 == 1) {
			for (local203 = 0; local203 < this.anInt5423; local203++) {
				this.anIntArray385[local203] = this.anIntArray385[local203] + arg2.aa(this.anIntArray389[local203] + arg4, arg6 + this.anIntArray388[local203]) - arg5;
			}
		} else {
			@Pc(211) int local211;
			@Pc(219) int local219;
			if (arg0 == 2) {
				local203 = this.anInt5430;
				if (local203 == 0) {
					return;
				}
				for (local211 = 0; local211 < this.anInt5423; local211++) {
					local219 = (this.anIntArray385[local211] << 16) / local203;
					if (local219 < arg1) {
						this.anIntArray385[local211] += (arg2.aa(this.anIntArray389[local211] + arg4, arg6 + this.anIntArray388[local211]) - arg5) * (-local219 + arg1) / arg1;
					}
				}
			} else {
				@Pc(227) int local227;
				if (arg0 == 3) {
					local203 = (arg1 & 0xFF) * 4;
					local211 = (arg1 >> 8 & 0xFF) * 4;
					local219 = (arg1 >> 16 & 0xFF) << 6;
					local227 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local203 >> 1) < 0 || arg2.anInt7410 + (local203 >> 1) + arg4 >= arg2.anInt7412 << arg2.anInt7411 || arg6 - (local211 >> 1) < 0 || arg2.anInt7409 << arg2.anInt7411 <= (local211 >> 1) + arg6 + arg2.anInt7410) {
						return;
					}
					this.method7264(local211, local203, arg4, local219, local227, arg5, arg2, arg6);
				} else if (arg0 == 4) {
					local203 = this.anInt5446 - this.anInt5430;
					for (local211 = 0; local211 < this.anInt5423; local211++) {
						this.anIntArray385[local211] = local203 + this.anIntArray385[local211] + arg3.aa(this.anIntArray389[local211] + arg4, arg6 + this.anIntArray388[local211]) - arg5;
					}
				} else if (arg0 == 5) {
					local203 = this.anInt5446 - this.anInt5430;
					for (local211 = 0; local211 < this.anInt5423; local211++) {
						local219 = arg4 + this.anIntArray389[local211];
						local227 = this.anIntArray388[local211] + arg6;
						@Pc(375) int local375 = arg2.aa(local219, local227);
						@Pc(380) int local380 = arg3.aa(local219, local227);
						@Pc(385) int local385 = local375 - local380;
						this.anIntArray385[local211] = local375 + ((this.anIntArray385[local211] << 8) / local203 * local385 >> 8) - arg5;
					}
				}
			}
		}
		this.method4711();
		this.aBoolean372 = false;
	}

	@OriginalMember(owner = "client!li", name = "M", descriptor = "()I")
	@Override
	public int M() {
		return this.aShort84;
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "()Z")
	@Override
	public boolean method7256() {
		if (this.aShortArray93 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray93.length; local12++) {
			if (this.aShortArray93[local12] != -1 && !this.aClass9_Sub1_8.anInterface8_13.method7084(this.aShortArray93[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "()V")
	@Override
	public void method7259() {
		if (this.anInt5468 > 0 && this.anInt5449 > 0) {
			this.method4700();
			this.method4712();
			this.method4708();
		}
	}

	@OriginalMember(owner = "client!li", name = "X", descriptor = "()V")
	@Override
	public void X() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5423; local3++) {
			this.anIntArray388[local3] = -this.anIntArray388[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5468; local25++) {
			this.aShortArray102[local25] = (short) -this.aShortArray102[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt5421; local48++) {
			@Pc(55) short local55 = this.aShortArray104[local48];
			this.aShortArray104[local48] = this.aShortArray97[local48];
			this.aShortArray97[local48] = local55;
		}
		this.method4711();
		this.method4704();
		this.method4699();
		this.aBoolean372 = false;
	}

	@OriginalMember(owner = "client!li", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		if (!this.aBoolean372) {
			this.method4705();
		}
		return this.anInt5430;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!qn;I)V")
	private void method4702(@OriginalArg(0) Class22_Sub3 arg0) {
		@Pc(12) int local12;
		if (this.aClass178Array4 != null) {
			for (local12 = 0; local12 < this.aClass178Array4.length; local12++) {
				@Pc(19) Class178 local19 = this.aClass178Array4[local12];
				@Pc(21) Class178 local21 = local19;
				if (local19.aClass178_2 != null) {
					local21 = local19.aClass178_2;
				}
				local21.anInt5393 = (int) ((float) this.anIntArray388[local19.anInt5394] * arg0.aFloat141 + (float) this.anIntArray389[local19.anInt5394] * arg0.aFloat140 + (float) this.anIntArray385[local19.anInt5394] * arg0.aFloat136 + arg0.aFloat138);
				local21.anInt5383 = (int) ((float) this.anIntArray388[local19.anInt5394] * arg0.aFloat137 + arg0.aFloat135 * (float) this.anIntArray385[local19.anInt5394] + arg0.aFloat139 * (float) this.anIntArray389[local19.anInt5394] + arg0.aFloat134);
				local21.anInt5381 = (int) (arg0.aFloat142 + arg0.aFloat143 * (float) this.anIntArray388[local19.anInt5394] + arg0.aFloat144 * (float) this.anIntArray385[local19.anInt5394] + (float) this.anIntArray389[local19.anInt5394] * arg0.aFloat133);
				local21.anInt5382 = (int) (arg0.aFloat138 + arg0.aFloat136 * (float) this.anIntArray385[local19.anInt5388] + arg0.aFloat140 * (float) this.anIntArray389[local19.anInt5388] + arg0.aFloat141 * (float) this.anIntArray388[local19.anInt5388]);
				local21.anInt5387 = (int) (arg0.aFloat137 * (float) this.anIntArray388[local19.anInt5388] + (float) this.anIntArray389[local19.anInt5388] * arg0.aFloat139 + (float) this.anIntArray385[local19.anInt5388] * arg0.aFloat135 + arg0.aFloat134);
				local21.anInt5380 = (int) (arg0.aFloat142 + (float) this.anIntArray388[local19.anInt5388] * arg0.aFloat143 + arg0.aFloat133 * (float) this.anIntArray389[local19.anInt5388] + arg0.aFloat144 * (float) this.anIntArray385[local19.anInt5388]);
				local21.anInt5395 = (int) (arg0.aFloat138 + arg0.aFloat136 * (float) this.anIntArray385[local19.anInt5386] + (float) this.anIntArray389[local19.anInt5386] * arg0.aFloat140 + arg0.aFloat141 * (float) this.anIntArray388[local19.anInt5386]);
				local21.anInt5391 = (int) (arg0.aFloat139 * (float) this.anIntArray389[local19.anInt5386] + (float) this.anIntArray385[local19.anInt5386] * arg0.aFloat135 + (float) this.anIntArray388[local19.anInt5386] * arg0.aFloat137 + arg0.aFloat134);
				local21.anInt5385 = (int) (arg0.aFloat142 + (float) this.anIntArray388[local19.anInt5386] * arg0.aFloat143 + arg0.aFloat133 * (float) this.anIntArray389[local19.anInt5386] + arg0.aFloat144 * (float) this.anIntArray385[local19.anInt5386]);
			}
		}
		if (this.aClass129Array4 == null) {
			return;
		}
		for (local12 = 0; local12 < this.aClass129Array4.length; local12++) {
			@Pc(364) Class129 local364 = this.aClass129Array4[local12];
			@Pc(366) Class129 local366 = local364;
			if (local364.aClass129_2 != null) {
				local366 = local364.aClass129_2;
			}
			if (local364.aClass22_7 == null) {
				local364.aClass22_7 = arg0.method5945();
			} else {
				local364.aClass22_7.EA(arg0);
			}
			local366.anInt4068 = (int) ((float) this.anIntArray389[local364.anInt4062] * arg0.aFloat140 + arg0.aFloat136 * (float) this.anIntArray385[local364.anInt4062] + arg0.aFloat141 * (float) this.anIntArray388[local364.anInt4062] + arg0.aFloat138);
			local366.anInt4063 = (int) (arg0.aFloat134 + (float) this.anIntArray388[local364.anInt4062] * arg0.aFloat137 + (float) this.anIntArray385[local364.anInt4062] * arg0.aFloat135 + arg0.aFloat139 * (float) this.anIntArray389[local364.anInt4062]);
			local366.anInt4064 = (int) (arg0.aFloat142 + arg0.aFloat143 * (float) this.anIntArray388[local364.anInt4062] + arg0.aFloat133 * (float) this.anIntArray389[local364.anInt4062] + arg0.aFloat144 * (float) this.anIntArray385[local364.anInt4062]);
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
	@Override
	public void b(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class307.anIntArray744[arg0];
		@Pc(13) int local13 = Class307.anIntArray743[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5423; local15++) {
			@Pc(34) int local34 = this.anIntArray385[local15] * local9 + this.anIntArray389[local15] * local13 >> 15;
			this.anIntArray385[local15] = this.anIntArray385[local15] * local13 - this.anIntArray389[local15] * local9 >> 15;
			this.anIntArray389[local15] = local34;
		}
		this.method4711();
		this.aBoolean372 = false;
	}

	@OriginalMember(owner = "client!li", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		this.aShort85 = (short) arg0;
		this.method4711();
		this.method4704();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method7257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class22_Sub3 local8 = (Class22_Sub3) arg2;
		@Pc(12) Class22_Sub3 local12 = this.aClass9_Sub1_8.aClass22_Sub3_16;
		@Pc(33) float local33 = local12.aFloat138 + local8.aFloat142 * local12.aFloat141 + local8.aFloat134 * local12.aFloat136 + local12.aFloat140 * local8.aFloat138;
		@Pc(54) float local54 = local8.aFloat138 * local12.aFloat139 + local8.aFloat134 * local12.aFloat135 + local8.aFloat142 * local12.aFloat137 + local12.aFloat134;
		@Pc(75) float local75 = local8.aFloat134 * local12.aFloat144 + local12.aFloat133 * local8.aFloat138 + local8.aFloat142 * local12.aFloat143 + local12.aFloat142;
		Static452.aFloat152 = local8.aFloat140 * local12.aFloat139 + local12.aFloat135 * local8.aFloat139 + local8.aFloat133 * local12.aFloat137;
		Static393.aFloat132 = local12.aFloat133 * local8.aFloat140 + local8.aFloat139 * local12.aFloat144 + local8.aFloat133 * local12.aFloat143;
		Static371.aFloat129 = local8.aFloat135 * local12.aFloat136 + local12.aFloat140 * local8.aFloat136 + local8.aFloat144 * local12.aFloat141;
		Static3.aFloat1 = local12.aFloat140 * local8.aFloat140 + local12.aFloat136 * local8.aFloat139 + local8.aFloat133 * local12.aFloat141;
		Static4.aFloat2 = local12.aFloat137 * local8.aFloat144 + local12.aFloat139 * local8.aFloat136 + local8.aFloat135 * local12.aFloat135;
		Static467.aFloat176 = local12.aFloat141 * local8.aFloat143 + local12.aFloat140 * local8.aFloat141 + local8.aFloat137 * local12.aFloat136;
		Static380.aFloat131 = local8.aFloat144 * local12.aFloat143 + local12.aFloat144 * local8.aFloat135 + local8.aFloat136 * local12.aFloat133;
		Static314.aFloat115 = local8.aFloat143 * local12.aFloat143 + local12.aFloat144 * local8.aFloat137 + local12.aFloat133 * local8.aFloat141;
		Static437.aFloat150 = local12.aFloat137 * local8.aFloat143 + local8.aFloat141 * local12.aFloat139 + local12.aFloat135 * local8.aFloat137;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass9_Sub1_8.anInt9226;
		@Pc(255) int local255 = this.aClass9_Sub1_8.anInt9224;
		if (!this.aBoolean372) {
			this.method4705();
		}
		Static81.anIntArray175[0] = this.anInt5420;
		Static66.anIntArray162[0] = this.anInt5430;
		Static477.anIntArray633[0] = this.anInt5438;
		Static81.anIntArray175[1] = this.anInt5451;
		Static66.anIntArray162[1] = this.anInt5430;
		Static81.anIntArray175[2] = this.anInt5420;
		Static477.anIntArray633[1] = this.anInt5438;
		Static66.anIntArray162[2] = this.anInt5446;
		Static81.anIntArray175[3] = this.anInt5451;
		Static477.anIntArray633[2] = this.anInt5438;
		Static66.anIntArray162[3] = this.anInt5446;
		Static81.anIntArray175[4] = this.anInt5420;
		Static477.anIntArray633[3] = this.anInt5438;
		Static66.anIntArray162[4] = this.anInt5430;
		Static81.anIntArray175[5] = this.anInt5451;
		Static477.anIntArray633[4] = this.anInt5458;
		Static66.anIntArray162[5] = this.anInt5430;
		Static81.anIntArray175[6] = this.anInt5420;
		Static477.anIntArray633[5] = this.anInt5458;
		Static66.anIntArray162[6] = this.anInt5446;
		Static477.anIntArray633[6] = this.anInt5458;
		Static81.anIntArray175[7] = this.anInt5451;
		Static66.anIntArray162[7] = this.anInt5446;
		Static477.anIntArray633[7] = this.anInt5458;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(400) float local400;
		@Pc(395) float local395;
		@Pc(390) float local390;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static477.anIntArray633[local383];
			local395 = Static66.anIntArray162[local383];
			local400 = Static81.anIntArray175[local383];
			local414 = local390 * Static314.aFloat115 + Static393.aFloat132 * local400 + Static380.aFloat131 * local395 + local75;
			local428 = local54 + local395 * Static4.aFloat2 + Static452.aFloat152 * local400 + local390 * Static437.aFloat150;
			local442 = local33 + Static467.aFloat176 * local390 + Static371.aFloat129 * local395 + local400 * Static3.aFloat1;
			if (local414 >= (float) this.aClass9_Sub1_8.anInt9217) {
				@Pc(461) float local461 = (float) this.aClass9_Sub1_8.anInt9208 + (float) local251 * local442 / local414;
				if (local243 < local461) {
					local243 = local461;
				}
				@Pc(479) float local479 = local428 * (float) local255 / local414 + (float) this.aClass9_Sub1_8.anInt9205;
				if (local461 < local241) {
					local241 = local461;
				}
				if (local479 < local245) {
					local245 = local479;
				}
				if (local479 > local247) {
					local247 = local479;
				}
				local239 = true;
			}
		}
		if (local239 && (float) arg0 > local241 && (float) arg0 < local243 && local245 < (float) arg1 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (Static372.anIntArray493.length < this.anInt5468) {
				Static399.anIntArray524 = new int[this.anInt5468];
				Static372.anIntArray493 = new int[this.anInt5468];
			}
			@Pc(632) int local632;
			for (@Pc(550) int local550 = 0; local550 < this.anInt5423; local550++) {
				local400 = this.anIntArray389[local550];
				local390 = this.anIntArray388[local550];
				local395 = this.anIntArray385[local550];
				local428 = Static437.aFloat150 * local390 + Static4.aFloat2 * local395 + Static452.aFloat152 * local400 + local54;
				local442 = local33 + Static3.aFloat1 * local400 + Static371.aFloat129 * local395 + Static467.aFloat176 * local390;
				local414 = local75 + local395 * Static380.aFloat131 + local400 * Static393.aFloat132 + Static314.aFloat115 * local390;
				@Pc(645) int local645;
				@Pc(650) int local650;
				@Pc(657) int local657;
				if (local414 >= (float) this.aClass9_Sub1_8.anInt9217) {
					local632 = (int) ((float) this.aClass9_Sub1_8.anInt9208 + (float) local251 * local442 / local414);
					local645 = (int) ((float) local255 * local428 / local414 + (float) this.aClass9_Sub1_8.anInt9205);
					local650 = this.anIntArray386[local550];
					local657 = this.anIntArray386[local550 + 1];
					for (@Pc(659) int local659 = local650; local659 < local657; local659++) {
						@Pc(668) int local668 = this.aShortArray95[local659] - 1;
						if (local668 == -1) {
							break;
						}
						Static372.anIntArray493[local668] = local632;
						Static399.anIntArray524[local668] = local645;
					}
				} else {
					local632 = this.anIntArray386[local550];
					local645 = this.anIntArray386[local550 + 1];
					for (local650 = local632; local650 < local645; local650++) {
						local657 = this.aShortArray95[local650] - 1;
						if (local657 == -1) {
							break;
						}
						Static372.anIntArray493[this.aShortArray95[local650] - 1] = -999999;
					}
				}
			}
			for (local632 = 0; local632 < this.anInt5421; local632++) {
				if (Static372.anIntArray493[this.aShortArray104[local632]] != -999999 && Static372.anIntArray493[this.aShortArray96[local632]] != -999999 && Static372.anIntArray493[this.aShortArray97[local632]] != -999999 && this.method4713(Static372.anIntArray493[this.aShortArray96[local632]], arg1, Static372.anIntArray493[this.aShortArray104[local632]], Static399.anIntArray524[this.aShortArray97[local632]], Static399.anIntArray524[this.aShortArray104[local632]], Static372.anIntArray493[this.aShortArray97[local632]], Static399.anIntArray524[this.aShortArray96[local632]], arg0)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!li", name = "n", descriptor = "()I")
	@Override
	public int n() {
		if (!this.aBoolean372) {
			this.method4705();
		}
		return this.anInt5446;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLclient!li;IZLclient!li;B)Lclient!r;")
	private Class19 method4703(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class19_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class19_Sub2 arg4) {
		arg4.anInt5421 = this.anInt5421;
		arg4.anInt5409 = this.anInt5409;
		arg4.anInt5449 = this.anInt5449;
		arg4.anInt5423 = this.anInt5423;
		arg4.anInt5475 = arg2;
		arg4.aShort84 = this.aShort84;
		arg4.anInt5461 = this.anInt5461;
		arg4.anInt5478 = this.anInt5478;
		arg4.aShort85 = this.aShort85;
		arg4.anInt5468 = this.anInt5468;
		@Pc(50) boolean local50 = Static19.method826(this.anInt5478, arg2);
		@Pc(56) boolean local56 = Static306.method5089(this.anInt5478, arg2);
		@Pc(62) boolean local62 = Static339.method5498(this.anInt5478, arg2);
		@Pc(68) boolean local68 = local62 | local56 | local50;
		@Pc(183) int local183;
		if (local68) {
			if (!local50) {
				arg4.anIntArray389 = this.anIntArray389;
			} else if (arg1.anIntArray389 == null || arg1.anIntArray389.length < this.anInt5409) {
				arg4.anIntArray389 = arg1.anIntArray389 = new int[this.anInt5409];
			} else {
				arg4.anIntArray389 = arg1.anIntArray389;
			}
			if (!local56) {
				arg4.anIntArray385 = this.anIntArray385;
			} else if (arg1.anIntArray385 == null || arg1.anIntArray385.length < this.anInt5409) {
				arg4.anIntArray385 = arg1.anIntArray385 = new int[this.anInt5409];
			} else {
				arg4.anIntArray385 = arg1.anIntArray385;
			}
			if (!local62) {
				arg4.anIntArray388 = this.anIntArray388;
			} else if (arg1.anIntArray388 == null || arg1.anIntArray388.length < this.anInt5409) {
				arg4.anIntArray388 = arg1.anIntArray388 = new int[this.anInt5409];
			} else {
				arg4.anIntArray388 = arg1.anIntArray388;
			}
			for (local183 = 0; local183 < this.anInt5409; local183++) {
				if (local50) {
					arg4.anIntArray389[local183] = this.anIntArray389[local183];
				}
				if (local56) {
					arg4.anIntArray385[local183] = this.anIntArray385[local183];
				}
				if (local62) {
					arg4.anIntArray388[local183] = this.anIntArray388[local183];
				}
			}
		} else {
			arg4.anIntArray388 = this.anIntArray388;
			arg4.anIntArray389 = this.anIntArray389;
			arg4.anIntArray385 = this.anIntArray385;
		}
		if (Static309.method5130(arg2, this.anInt5478)) {
			arg4.aClass311_2 = arg1.aClass311_2;
			arg4.aClass311_2.aBoolean616 = true;
			arg4.aClass311_2.aBoolean615 = this.aClass311_2.aBoolean615;
			arg4.aClass311_2.anInterface15_11 = this.aClass311_2.anInterface15_11;
		} else if (Static328.method5369(arg2, this.anInt5478)) {
			arg4.aClass311_2 = this.aClass311_2;
		} else {
			arg4.aClass311_2 = null;
		}
		if (Static544.method7953(this.anInt5478, arg2)) {
			if (arg1.aShortArray101 == null || this.anInt5421 > arg1.aShortArray101.length) {
				arg4.aShortArray101 = arg1.aShortArray101 = new short[this.anInt5421];
			} else {
				arg4.aShortArray101 = arg1.aShortArray101;
			}
			for (local183 = 0; local183 < this.anInt5421; local183++) {
				arg4.aShortArray101[local183] = this.aShortArray101[local183];
			}
		} else {
			arg4.aShortArray101 = this.aShortArray101;
		}
		if (Static441.method6404(arg2, this.anInt5478)) {
			if (arg1.aByteArray71 == null || arg1.aByteArray71.length < this.anInt5421) {
				arg4.aByteArray71 = arg1.aByteArray71 = new byte[this.anInt5421];
			} else {
				arg4.aByteArray71 = arg1.aByteArray71;
			}
			for (local183 = 0; local183 < this.anInt5421; local183++) {
				arg4.aByteArray71[local183] = this.aByteArray71[local183];
			}
		} else {
			arg4.aByteArray71 = this.aByteArray71;
		}
		if (Static153.method3113(this.anInt5478, arg2)) {
			arg4.aClass311_4 = arg1.aClass311_4;
			arg4.aClass311_4.aBoolean616 = true;
			arg4.aClass311_4.anInterface15_11 = this.aClass311_4.anInterface15_11;
			arg4.aClass311_4.aBoolean615 = this.aClass311_4.aBoolean615;
		} else if (Static436.method6378(this.anInt5478, arg2)) {
			arg4.aClass311_4 = this.aClass311_4;
		} else {
			arg4.aClass311_4 = null;
		}
		@Pc(542) int local542;
		if (Static327.method5345(arg2, this.anInt5478)) {
			if (arg1.aShortArray99 == null || arg1.aShortArray99.length < this.anInt5468) {
				local183 = this.anInt5468;
				arg4.aShortArray94 = arg1.aShortArray94 = new short[local183];
				arg4.aShortArray102 = arg1.aShortArray102 = new short[local183];
				arg4.aShortArray99 = arg1.aShortArray99 = new short[local183];
			} else {
				arg4.aShortArray102 = arg1.aShortArray102;
				arg4.aShortArray94 = arg1.aShortArray94;
				arg4.aShortArray99 = arg1.aShortArray99;
			}
			if (this.aClass13_1 == null) {
				arg4.aClass13_1 = null;
				for (local183 = 0; local183 < this.anInt5468; local183++) {
					arg4.aShortArray99[local183] = this.aShortArray99[local183];
					arg4.aShortArray94[local183] = this.aShortArray94[local183];
					arg4.aShortArray102[local183] = this.aShortArray102[local183];
				}
			} else {
				if (arg1.aClass13_1 == null) {
					arg1.aClass13_1 = new Class13();
				}
				@Pc(530) Class13 local530 = arg4.aClass13_1 = arg1.aClass13_1;
				if (local530.aShortArray4 == null || this.anInt5468 > local530.aShortArray4.length) {
					local542 = this.anInt5468;
					local530.aShortArray2 = new short[local542];
					local530.aShortArray3 = new short[local542];
					local530.aByteArray2 = new byte[local542];
					local530.aShortArray4 = new short[local542];
				}
				for (local542 = 0; local542 < this.anInt5468; local542++) {
					arg4.aShortArray99[local542] = this.aShortArray99[local542];
					arg4.aShortArray94[local542] = this.aShortArray94[local542];
					arg4.aShortArray102[local542] = this.aShortArray102[local542];
					local530.aShortArray4[local542] = this.aClass13_1.aShortArray4[local542];
					local530.aShortArray3[local542] = this.aClass13_1.aShortArray3[local542];
					local530.aShortArray2[local542] = this.aClass13_1.aShortArray2[local542];
					local530.aByteArray2[local542] = this.aClass13_1.aByteArray2[local542];
				}
			}
			arg4.aByteArray72 = this.aByteArray72;
		} else {
			arg4.aClass13_1 = this.aClass13_1;
			arg4.aByteArray72 = this.aByteArray72;
			arg4.aShortArray94 = this.aShortArray94;
			arg4.aShortArray102 = this.aShortArray102;
			arg4.aShortArray99 = this.aShortArray99;
		}
		if (Static350.method5565(arg2, this.anInt5478)) {
			arg4.aClass311_3 = arg1.aClass311_3;
			arg4.aClass311_3.aBoolean615 = this.aClass311_3.aBoolean615;
			arg4.aClass311_3.anInterface15_11 = this.aClass311_3.anInterface15_11;
			arg4.aClass311_3.aBoolean616 = true;
		} else if (Static201.method3745(this.anInt5478, arg2)) {
			arg4.aClass311_3 = this.aClass311_3;
		} else {
			arg4.aClass311_3 = null;
		}
		if (Static464.method6809(this.anInt5478, arg2)) {
			if (arg1.aFloatArray45 == null || this.anInt5421 > arg1.aFloatArray45.length) {
				local183 = this.anInt5468;
				arg4.aFloatArray46 = arg1.aFloatArray46 = new float[local183];
				arg4.aFloatArray45 = arg1.aFloatArray45 = new float[local183];
			} else {
				arg4.aFloatArray45 = arg1.aFloatArray45;
				arg4.aFloatArray46 = arg1.aFloatArray46;
			}
			for (local183 = 0; local183 < this.anInt5468; local183++) {
				arg4.aFloatArray45[local183] = this.aFloatArray45[local183];
				arg4.aFloatArray46[local183] = this.aFloatArray46[local183];
			}
		} else {
			arg4.aFloatArray45 = this.aFloatArray45;
			arg4.aFloatArray46 = this.aFloatArray46;
		}
		if (Static474.method4261(this.anInt5478, arg2)) {
			arg4.aClass311_1 = arg1.aClass311_1;
			arg4.aClass311_1.aBoolean616 = true;
			arg4.aClass311_1.anInterface15_11 = this.aClass311_1.anInterface15_11;
			arg4.aClass311_1.aBoolean615 = this.aClass311_1.aBoolean615;
		} else if (Static97.method5683(arg2, this.anInt5478)) {
			arg4.aClass311_1 = this.aClass311_1;
		} else {
			arg4.aClass311_1 = null;
		}
		if (Static192.method3615(this.anInt5478, arg2)) {
			if (arg1.aShortArray104 == null || this.anInt5421 > arg1.aShortArray104.length) {
				local183 = this.anInt5421;
				arg4.aShortArray104 = arg1.aShortArray104 = new short[local183];
				arg4.aShortArray97 = arg1.aShortArray97 = new short[local183];
				arg4.aShortArray96 = arg1.aShortArray96 = new short[local183];
			} else {
				arg4.aShortArray97 = arg1.aShortArray97;
				arg4.aShortArray104 = arg1.aShortArray104;
				arg4.aShortArray96 = arg1.aShortArray96;
			}
			for (local183 = 0; local183 < this.anInt5421; local183++) {
				arg4.aShortArray104[local183] = this.aShortArray104[local183];
				arg4.aShortArray96[local183] = this.aShortArray96[local183];
				arg4.aShortArray97[local183] = this.aShortArray97[local183];
			}
		} else {
			arg4.aShortArray104 = this.aShortArray104;
			arg4.aShortArray96 = this.aShortArray96;
			arg4.aShortArray97 = this.aShortArray97;
		}
		if (Static163.method3252(arg2, this.anInt5478)) {
			arg4.aClass236_1 = arg1.aClass236_1;
			arg4.aClass236_1.aBoolean447 = this.aClass236_1.aBoolean447;
			arg4.aClass236_1.anInterface1_5 = this.aClass236_1.anInterface1_5;
			arg4.aClass236_1.aBoolean446 = true;
		} else if (Static8.method230(this.anInt5478, arg2)) {
			arg4.aClass236_1 = this.aClass236_1;
		} else {
			arg4.aClass236_1 = null;
		}
		if (Static135.method2904(this.anInt5478, arg2)) {
			if (arg1.aShortArray93 == null || arg1.aShortArray93.length < this.anInt5421) {
				local183 = this.anInt5421;
				arg4.aShortArray93 = arg1.aShortArray93 = new short[local183];
			} else {
				arg4.aShortArray93 = arg1.aShortArray93;
			}
			for (local183 = 0; local183 < this.anInt5421; local183++) {
				arg4.aShortArray93[local183] = this.aShortArray93[local183];
			}
		} else {
			arg4.aShortArray93 = this.aShortArray93;
		}
		if (!Static127.method2789(this.anInt5478, arg2)) {
			arg4.aClass128Array1 = this.aClass128Array1;
		} else if (arg1.aClass128Array1 == null || arg1.aClass128Array1.length < this.anInt5461) {
			local183 = this.anInt5461;
			arg4.aClass128Array1 = arg1.aClass128Array1 = new Class128[local183];
			for (local542 = 0; local542 < this.anInt5461; local542++) {
				arg4.aClass128Array1[local542] = this.aClass128Array1[local542].method3618();
			}
		} else {
			arg4.aClass128Array1 = arg1.aClass128Array1;
			for (local183 = 0; local183 < this.anInt5461; local183++) {
				arg4.aClass128Array1[local183].method3622(this.aClass128Array1[local183]);
			}
		}
		arg4.aShortArray95 = this.aShortArray95;
		arg4.anIntArray386 = this.anIntArray386;
		if (this.aBoolean372) {
			arg4.aBoolean372 = true;
			arg4.anInt5451 = this.anInt5451;
			arg4.anInt5420 = this.anInt5420;
			arg4.anInt5438 = this.anInt5438;
			arg4.anInt5430 = this.anInt5430;
			arg4.anInt5458 = this.anInt5458;
			arg4.anInt5414 = this.anInt5414;
			arg4.anInt5446 = this.anInt5446;
		} else {
			arg4.aBoolean372 = false;
		}
		arg4.anIntArray384 = this.anIntArray384;
		arg4.anIntArrayArray41 = this.anIntArrayArray41;
		arg4.aShortArray98 = this.aShortArray98;
		arg4.aShortArray103 = this.aShortArray103;
		arg4.aClass129Array4 = this.aClass129Array4;
		arg4.aClass178Array4 = this.aClass178Array4;
		arg4.anIntArray387 = this.anIntArray387;
		arg4.aShortArray100 = this.aShortArray100;
		arg4.anIntArrayArray42 = this.anIntArrayArray42;
		arg4.aShortArray92 = this.aShortArray92;
		arg4.anIntArray383 = this.anIntArray383;
		arg4.anIntArrayArray43 = this.anIntArrayArray43;
		arg4.aClass83Array1 = this.aClass83Array1;
		return arg4;
	}

	@OriginalMember(owner = "client!li", name = "ca", descriptor = "(III)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5423; local3++) {
			if (arg0 != 0) {
				this.anIntArray389[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray385[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray388[local3] += arg2;
			}
		}
		this.method4711();
		this.aBoolean372 = false;
	}

	@OriginalMember(owner = "client!li", name = "OA", descriptor = "(I)V")
	@Override
	public void OA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class307.anIntArray744[arg0];
		@Pc(13) int local13 = Class307.anIntArray743[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5423; local15++) {
			@Pc(33) int local33 = this.anIntArray389[local15] * local13 + local9 * this.anIntArray388[local15] >> 15;
			this.anIntArray388[local15] = this.anIntArray388[local15] * local13 - this.anIntArray389[local15] * local9 >> 15;
			this.anIntArray389[local15] = local33;
		}
		this.method4711();
		this.aBoolean372 = false;
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
	private void method4704() {
		if ((this.anInt5478 & 0x37) == 0) {
			if (this.aClass311_4 == null) {
				return;
			}
			this.aClass311_4.aBoolean615 = false;
		} else if (this.aClass311_3 != null) {
			this.aClass311_3.aBoolean615 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
	private void method4705() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt5423; local23++) {
			@Pc(30) int local30 = this.anIntArray389[local23];
			@Pc(35) int local35 = this.anIntArray385[local23];
			if (local13 < local30) {
				local13 = local30;
			}
			@Pc(45) int local45 = this.anIntArray388[local23];
			if (local35 > local15) {
				local15 = local35;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			if (local9 > local35) {
				local9 = local35;
			}
			if (local17 < local45) {
				local17 = local45;
			}
			if (local45 < local11) {
				local11 = local45;
			}
			@Pc(91) int local91 = local30 * local30 + local45 * local45;
			if (local19 < local91) {
				local19 = local91;
			}
			local91 = local35 * local35 + local45 * local45 + local30 * local30;
			if (local91 > local21) {
				local21 = local91;
			}
		}
		this.anInt5420 = local7;
		this.anInt5446 = local15;
		this.anInt5438 = local11;
		this.anInt5458 = local17;
		this.anInt5430 = local9;
		this.anInt5451 = local13;
		this.anInt5414 = (int) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean372 = true;
	}

	@OriginalMember(owner = "client!li", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	@Override
	public Class1_Sub1_Sub4 EA(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		if (this.anInt5468 == 0) {
			return null;
		}
		if (!this.aBoolean372) {
			this.method4705();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass9_Sub1_8.anInt9211 <= 0) {
			local40 = this.anInt5420 - (this.anInt5430 * this.aClass9_Sub1_8.anInt9211 >> 8) >> this.aClass9_Sub1_8.anInt9216;
			local57 = this.anInt5451 - (this.aClass9_Sub1_8.anInt9211 * this.anInt5446 >> 8) >> this.aClass9_Sub1_8.anInt9216;
		} else {
			local40 = this.anInt5420 - (this.aClass9_Sub1_8.anInt9211 * this.anInt5446 >> 8) >> this.aClass9_Sub1_8.anInt9216;
			local57 = this.anInt5451 - (this.anInt5430 * this.aClass9_Sub1_8.anInt9211 >> 8) >> this.aClass9_Sub1_8.anInt9216;
		}
		@Pc(116) int local116;
		@Pc(132) int local132;
		if (this.aClass9_Sub1_8.anInt9200 > 0) {
			local116 = this.anInt5438 - (this.aClass9_Sub1_8.anInt9200 * this.anInt5446 >> 8) >> this.aClass9_Sub1_8.anInt9216;
			local132 = this.anInt5458 - (this.anInt5430 * this.aClass9_Sub1_8.anInt9200 >> 8) >> this.aClass9_Sub1_8.anInt9216;
		} else {
			local116 = this.anInt5438 - (this.anInt5430 * this.aClass9_Sub1_8.anInt9200 >> 8) >> this.aClass9_Sub1_8.anInt9216;
			local132 = this.anInt5458 - (this.anInt5446 * this.aClass9_Sub1_8.anInt9200 >> 8) >> this.aClass9_Sub1_8.anInt9216;
		}
		@Pc(175) int local175 = local57 + 1 - local40;
		@Pc(182) int local182 = local132 + 1 - local116;
		@Pc(185) Class1_Sub1_Sub4_Sub1 local185 = (Class1_Sub1_Sub4_Sub1) arg0;
		@Pc(201) Class1_Sub1_Sub4_Sub1 local201;
		if (local185 != null && local185.method1637(local175, local182)) {
			local201 = local185;
			local185.method1635();
		} else {
			local201 = new Class1_Sub1_Sub4_Sub1(this.aClass9_Sub1_8, local175, local182);
		}
		local201.method1642(local40, local116, local132, local57);
		this.method4698(local201);
		return local201;
	}

	@OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
	private void method4706() {
		if (this.aClass311_4 != null) {
			this.aClass311_4.aBoolean615 = false;
		}
	}

	@OriginalMember(owner = "client!li", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class307.anIntArray744[arg0];
		@Pc(13) int local13 = Class307.anIntArray743[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5423; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray385[local15] - this.anIntArray388[local15] * local9 >> 15;
			this.anIntArray388[local15] = local13 * this.anIntArray388[local15] + local9 * this.anIntArray385[local15] >> 15;
			this.anIntArray385[local15] = local34;
		}
		this.method4711();
		this.aBoolean372 = false;
	}

	@OriginalMember(owner = "client!li", name = "l", descriptor = "(IIII)V")
	@Override
	protected void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static398.anInt6964 = 0;
			local14 = 0;
			Static311.anInt5972 = 0;
			Static406.anInt7106 = 0;
			for (local20 = 0; local20 < this.anInt5423; local20++) {
				Static311.anInt5972 += this.anIntArray389[local20];
				Static398.anInt6964 += this.anIntArray385[local20];
				Static406.anInt7106 += this.anIntArray388[local20];
				local14++;
			}
			if (local14 <= 0) {
				Static398.anInt6964 = arg2;
				Static406.anInt7106 = arg3;
				Static311.anInt5972 = arg1;
			} else {
				Static398.anInt6964 = Static398.anInt6964 / local14 + arg2;
				Static406.anInt7106 = Static406.anInt7106 / local14 + arg3;
				Static311.anInt5972 = arg1 + Static311.anInt5972 / local14;
			}
		} else if (arg0 == 1) {
			for (local14 = 0; local14 < this.anInt5423; local14++) {
				this.anIntArray389[local14] += arg1;
				this.anIntArray385[local14] += arg2;
				this.anIntArray388[local14] += arg3;
			}
		} else {
			@Pc(164) int local164;
			@Pc(183) int local183;
			if (arg0 == 2) {
				for (local14 = 0; local14 < this.anInt5423; local14++) {
					this.anIntArray389[local14] -= Static311.anInt5972;
					this.anIntArray385[local14] -= Static398.anInt6964;
					this.anIntArray388[local14] -= Static406.anInt7106;
					if (arg3 != 0) {
						local20 = Class307.anIntArray744[arg3];
						local164 = Class307.anIntArray743[arg3];
						local183 = local20 * this.anIntArray385[local14] + local164 * this.anIntArray389[local14] + 32767 >> 15;
						this.anIntArray385[local14] = local164 * this.anIntArray385[local14] + 32767 - this.anIntArray389[local14] * local20 >> 15;
						this.anIntArray389[local14] = local183;
					}
					if (arg1 != 0) {
						local20 = Class307.anIntArray744[arg1];
						local164 = Class307.anIntArray743[arg1];
						local183 = local164 * this.anIntArray385[local14] + 32767 - this.anIntArray388[local14] * local20 >> 15;
						this.anIntArray388[local14] = local164 * this.anIntArray388[local14] + local20 * this.anIntArray385[local14] + 32767 >> 15;
						this.anIntArray385[local14] = local183;
					}
					if (arg2 != 0) {
						local20 = Class307.anIntArray744[arg2];
						local164 = Class307.anIntArray743[arg2];
						local183 = this.anIntArray388[local14] * local20 + this.anIntArray389[local14] * local164 + 32767 >> 15;
						this.anIntArray388[local14] = this.anIntArray388[local14] * local164 + 32767 - local20 * this.anIntArray389[local14] >> 15;
						this.anIntArray389[local14] = local183;
					}
					this.anIntArray389[local14] += Static311.anInt5972;
					this.anIntArray385[local14] += Static398.anInt6964;
					this.anIntArray388[local14] += Static406.anInt7106;
				}
			} else if (arg0 == 3) {
				for (local14 = 0; local14 < this.anInt5423; local14++) {
					this.anIntArray389[local14] -= Static311.anInt5972;
					this.anIntArray385[local14] -= Static398.anInt6964;
					this.anIntArray388[local14] -= Static406.anInt7106;
					this.anIntArray389[local14] = arg1 * this.anIntArray389[local14] / 128;
					this.anIntArray385[local14] = this.anIntArray385[local14] * arg2 / 128;
					this.anIntArray388[local14] = this.anIntArray388[local14] * arg3 / 128;
					this.anIntArray389[local14] += Static311.anInt5972;
					this.anIntArray385[local14] += Static398.anInt6964;
					this.anIntArray388[local14] += Static406.anInt7106;
				}
			} else {
				@Pc(503) Class83 local503;
				@Pc(508) Class128 local508;
				if (arg0 == 5) {
					for (local14 = 0; local14 < this.anInt5421; local14++) {
						local20 = (this.aByteArray71[local14] & 0xFF) + arg1 * 8;
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray71[local14] = (byte) local20;
					}
					if (this.aClass83Array1 != null) {
						for (local20 = 0; local20 < this.anInt5461; local20++) {
							local503 = this.aClass83Array1[local20];
							local508 = this.aClass128Array1[local20];
							local508.anInt4061 = local508.anInt4061 & 0xFFFFFF | 255 - (this.aByteArray71[local503.anInt2857] & 0xFF) << 24;
						}
					}
					this.method4706();
				} else if (arg0 == 7) {
					for (local14 = 0; local14 < this.anInt5421; local14++) {
						local20 = this.aShortArray101[local14] & 0xFFFF;
						local164 = local20 >> 10 & 0x3F;
						local183 = local20 >> 7 & 0x7;
						local183 += arg2 / 4;
						@Pc(574) int local574 = local20 & 0x7F;
						@Pc(581) int local581 = local164 + arg1 & 0x3F;
						if (local183 < 0) {
							local183 = 0;
						} else if (local183 > 7) {
							local183 = 7;
						}
						local574 += arg3;
						if (local574 < 0) {
							local574 = 0;
						} else if (local574 > 127) {
							local574 = 127;
						}
						this.aShortArray101[local14] = (short) (local574 | local183 << 7 | local581 << 10);
					}
					if (this.aClass83Array1 != null) {
						for (local20 = 0; local20 < this.anInt5461; local20++) {
							local503 = this.aClass83Array1[local20];
							local508 = this.aClass128Array1[local20];
							local508.anInt4061 = Static392.anIntArray516[this.aShortArray101[local503.anInt2857] & 0xFFFF] & 0xFFFFFF | local508.anInt4061 & 0xFF000000;
						}
					}
					this.method4706();
				} else {
					@Pc(690) Class128 local690;
					if (arg0 == 8) {
						for (local14 = 0; local14 < this.anInt5461; local14++) {
							local690 = this.aClass128Array1[local14];
							local690.anInt4055 += arg2;
							local690.anInt4056 += arg1;
						}
					} else if (arg0 == 10) {
						for (local14 = 0; local14 < this.anInt5461; local14++) {
							local690 = this.aClass128Array1[local14];
							local690.anInt4054 = local690.anInt4054 * arg1 >> 7;
							local690.anInt4057 = arg2 * local690.anInt4057 >> 7;
						}
					} else if (arg0 == 9) {
						for (local14 = 0; local14 < this.anInt5461; local14++) {
							local690 = this.aClass128Array1[local14];
							local690.anInt4058 = arg1 + local690.anInt4058 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "pa", descriptor = "(SS)V")
	@Override
	public void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5421; local3++) {
			if (this.aShortArray101[local3] == arg0) {
				this.aShortArray101[local3] = arg1;
			}
		}
		if (this.aClass83Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt5461; local38++) {
				@Pc(45) Class83 local45 = this.aClass83Array1[local38];
				@Pc(50) Class128 local50 = this.aClass128Array1[local38];
				local50.anInt4061 = Static392.anIntArray516[this.aShortArray101[local45.anInt2857] & 0xFFFF] & 0xFFFFFF | local50.anInt4061 & 0xFF000000;
			}
		}
		this.method4706();
	}

	@OriginalMember(owner = "client!li", name = "L", descriptor = "(SS)V")
	@Override
	public void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface8 local9 = this.aClass9_Sub1_8.anInterface8_13;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5421; local11++) {
			if (this.aShortArray93[local11] == arg0) {
				this.aShortArray93[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(43) Class175 local43 = local9.method7085(arg0 & 0xFFFF);
			local33 = local43.aByte58;
			local31 = local43.aByte59;
		}
		@Pc(51) byte local51 = 0;
		@Pc(53) byte local53 = 0;
		if (arg1 != -1) {
			@Pc(64) Class175 local64 = local9.method7085(arg1 & 0xFFFF);
			local53 = local64.aByte58;
			local51 = local64.aByte59;
		}
		if (!(local33 != local53 | local51 != local31)) {
			return;
		}
		if (this.aClass83Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt5461; local97++) {
				@Pc(104) Class83 local104 = this.aClass83Array1[local97];
				@Pc(109) Class128 local109 = this.aClass128Array1[local97];
				local109.anInt4061 = local109.anInt4061 & 0xFF000000 | Static392.anIntArray516[this.aShortArray101[local104.anInt2857] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4706();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class19 method7260(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(17) Class19_Sub2 local17;
		@Pc(21) Class19_Sub2 local21;
		if (arg0 == 1) {
			local17 = this.aClass9_Sub1_8.aClass19_Sub2_25;
			local21 = this.aClass9_Sub1_8.aClass19_Sub2_26;
		} else if (arg0 == 2) {
			local17 = this.aClass9_Sub1_8.aClass19_Sub2_30;
			local21 = this.aClass9_Sub1_8.aClass19_Sub2_21;
		} else if (arg0 == 3) {
			local17 = this.aClass9_Sub1_8.aClass19_Sub2_28;
			local21 = this.aClass9_Sub1_8.aClass19_Sub2_24;
		} else if (arg0 == 4) {
			local17 = this.aClass9_Sub1_8.aClass19_Sub2_23;
			local21 = this.aClass9_Sub1_8.aClass19_Sub2_29;
		} else if (arg0 == 5) {
			local21 = this.aClass9_Sub1_8.aClass19_Sub2_27;
			local17 = this.aClass9_Sub1_8.aClass19_Sub2_22;
		} else {
			local17 = local21 = new Class19_Sub2(this.aClass9_Sub1_8, 0, 0, true, false);
		}
		return this.method4703(arg2, local21, arg1, arg0 != 0, local17);
	}

	@OriginalMember(owner = "client!li", name = "MA", descriptor = "()V")
	@Override
	protected void MA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5409; local7++) {
			this.anIntArray389[local7] = this.anIntArray389[local7] + 7 >> 4;
			this.anIntArray385[local7] = this.anIntArray385[local7] + 7 >> 4;
			this.anIntArray388[local7] = this.anIntArray388[local7] + 7 >> 4;
		}
		this.method4711();
		this.aBoolean372 = false;
	}

	@OriginalMember(owner = "client!li", name = "f", descriptor = "(I)V")
	public void method4707() {
		if (this.aClass311_2 != null) {
			this.aClass311_2.method7437();
		}
		if (this.aClass311_1 != null) {
			this.aClass311_1.method7437();
		}
		if (this.aClass311_4 != null) {
			this.aClass311_4.method7437();
		}
		if (this.aClass311_3 != null) {
			this.aClass311_3.method7437();
		}
		if (this.aClass236_1 != null) {
			this.aClass236_1.method5823();
		}
	}

	@OriginalMember(owner = "client!li", name = "h", descriptor = "(I)V")
	private void method4708() {
		if (!this.aBoolean374) {
			return;
		}
		this.aBoolean374 = false;
		if (this.aClass178Array4 == null && this.aClass129Array4 == null && this.aClass83Array1 == null) {
			if (this.anIntArray389 != null && !Static20.method833(this.anInt5478, this.anInt5475)) {
				if (this.aClass311_2 == null || this.aClass311_2.method7440()) {
					if (!this.aBoolean372) {
						this.method4705();
					}
					this.anIntArray389 = null;
				} else {
					this.aBoolean374 = true;
				}
			}
			if (this.anIntArray385 != null && !Static191.method6863(this.anInt5478, this.anInt5475)) {
				if (this.aClass311_2 == null || this.aClass311_2.method7440()) {
					if (!this.aBoolean372) {
						this.method4705();
					}
					this.anIntArray385 = null;
				} else {
					this.aBoolean374 = true;
				}
			}
			if (this.anIntArray388 != null && !Static239.method4057(this.anInt5475, this.anInt5478)) {
				if (this.aClass311_2 == null || this.aClass311_2.method7440()) {
					if (!this.aBoolean372) {
						this.method4705();
					}
					this.anIntArray388 = null;
				} else {
					this.aBoolean374 = true;
				}
			}
		}
		if (this.aShortArray95 != null && this.anIntArray389 == null && this.anIntArray385 == null && this.anIntArray388 == null) {
			this.anIntArray386 = null;
			this.aShortArray95 = null;
		}
		if (this.aByteArray72 != null && !Static19.method824(this.anInt5478, this.anInt5475)) {
			label195: {
				label194: {
					@Pc(164) boolean local164;
					if ((this.anInt5478 & 0x37) == 0) {
						if (this.aClass311_4 == null || this.aClass311_4.method7440()) {
							break label194;
						}
						local164 = false;
					} else {
						if (this.aClass311_3 == null || this.aClass311_3.method7440()) {
							break label194;
						}
						local164 = false;
					}
					if (!local164) {
						this.aBoolean374 = true;
						break label195;
					}
				}
				this.aByteArray72 = null;
				this.aShortArray99 = this.aShortArray94 = this.aShortArray102 = null;
			}
		}
		if (this.aShortArray101 != null && !Static89.method2163(this.anInt5475, this.anInt5478)) {
			if (this.aClass311_4 == null || this.aClass311_4.method7440()) {
				this.aShortArray101 = null;
			} else {
				this.aBoolean374 = true;
			}
		}
		if (this.aByteArray71 != null && !Static499.method7149(this.anInt5478, this.anInt5475)) {
			if (this.aClass311_4 == null || this.aClass311_4.method7440()) {
				this.aByteArray71 = null;
			} else {
				this.aBoolean374 = true;
			}
		}
		if (this.aFloatArray45 != null && !Static321.method5258(this.anInt5478, this.anInt5475)) {
			if (this.aClass311_1 == null || this.aClass311_1.method7440()) {
				this.aFloatArray45 = this.aFloatArray46 = null;
			} else {
				this.aBoolean374 = true;
			}
		}
		if (this.aShortArray93 != null && !Static409.method6133(this.anInt5478, this.anInt5475)) {
			if (this.aClass311_4 == null || this.aClass311_4.method7440()) {
				this.aShortArray93 = null;
			} else {
				this.aBoolean374 = true;
			}
		}
		if (this.aShortArray104 != null && !Static159.method3141(this.anInt5478, this.anInt5475)) {
			if ((this.aClass236_1 == null || this.aClass236_1.method5824()) && (this.aClass311_4 == null || this.aClass311_4.method7440())) {
				this.aShortArray104 = this.aShortArray96 = this.aShortArray97 = null;
			} else {
				this.aBoolean374 = true;
			}
		}
		if (this.aShortArray100 != null) {
			if (this.aClass311_2 == null || this.aClass311_2.method7440()) {
				this.aShortArray100 = null;
			} else {
				this.aBoolean374 = true;
			}
		}
		if (this.aShortArray98 != null) {
			if (this.aClass311_4 == null || this.aClass311_4.method7440()) {
				this.aShortArray98 = null;
			} else {
				this.aBoolean374 = true;
			}
		}
		if (this.anIntArrayArray42 != null && !Static43.method1390(this.anInt5478, this.anInt5475)) {
			this.anIntArrayArray42 = null;
			this.aShortArray92 = null;
		}
		if (this.anIntArrayArray43 != null && !Static515.method7357(this.anInt5475, this.anInt5478)) {
			this.anIntArrayArray43 = null;
			this.aShortArray103 = null;
		}
		if (this.anIntArrayArray41 != null && !Static521.method7432(this.anInt5478, this.anInt5475)) {
			this.anIntArrayArray41 = null;
		}
		if (this.anIntArray384 != null && (this.anInt5475 & 0x800) == 0 && (this.anInt5475 & 0x40000) == 0) {
			this.anIntArray383 = null;
			this.anIntArray384 = null;
			this.anIntArray387 = null;
		}
	}

	@OriginalMember(owner = "client!li", name = "m", descriptor = "(I)V")
	@Override
	public void m(@OriginalArg(0) int arg0) {
		if (this.aClass311_2 != null) {
			this.aClass311_2.aBoolean616 = Static309.method5130(arg0, this.anInt5478);
		}
		if (this.aClass311_1 != null) {
			this.aClass311_1.aBoolean616 = Static474.method4261(this.anInt5478, arg0);
		}
		if (this.aClass311_4 != null) {
			this.aClass311_4.aBoolean616 = Static153.method3113(this.anInt5478, arg0);
		}
		if (this.aClass311_3 != null) {
			this.aClass311_3.aBoolean616 = Static350.method5565(arg0, this.anInt5478);
		}
		this.anInt5475 = arg0;
		if (this.aClass13_1 != null && (this.anInt5475 & 0x10000) == 0) {
			this.aShortArray94 = this.aClass13_1.aShortArray3;
			this.aShortArray99 = this.aClass13_1.aShortArray4;
			this.aShortArray102 = this.aClass13_1.aShortArray2;
			this.aByteArray72 = this.aClass13_1.aByteArray2;
			this.aClass13_1 = null;
		}
		this.aBoolean374 = true;
		this.method4708();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt5421; local3++) {
			local12 = this.aShortArray101[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += arg3 * (arg0 - local18) >> 7;
			}
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local28 -= -(arg3 * (arg2 - local28) >> 7);
			}
			this.aShortArray101[local3] = (short) (local28 | local24 << 7 | local18 << 10);
		}
		if (this.aClass83Array1 != null) {
			for (local12 = 0; local12 < this.anInt5461; local12++) {
				@Pc(107) Class83 local107 = this.aClass83Array1[local12];
				@Pc(112) Class128 local112 = this.aClass128Array1[local12];
				local112.anInt4061 = Static392.anIntArray516[this.aShortArray101[local107.anInt2857] & 0xFFFF] & 0xFFFFFF | local112.anInt4061 & 0xFF000000;
			}
		}
		this.method4706();
	}

	@OriginalMember(owner = "client!li", name = "e", descriptor = "()I")
	@Override
	public int e() {
		if (!this.aBoolean372) {
			this.method4705();
		}
		return this.anInt5414;
	}

	@OriginalMember(owner = "client!li", name = "va", descriptor = "()I")
	@Override
	public int va() {
		if (!this.aBoolean372) {
			this.method4705();
		}
		return this.anInt5451;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZFLclient!fd;IIIIJIFI)S")
	private short method4709(@OriginalArg(1) float arg0, @OriginalArg(2) Class86 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray386[arg3];
		@Pc(17) int local17 = this.anIntArray386[arg3 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray95[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg6 == Static414.aLongArray12[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray95[local19] = (short) (this.anInt5468 + 1);
		Static414.aLongArray12[local19] = arg6;
		this.aShortArray98[this.anInt5468] = (short) arg4;
		this.aShortArray100[this.anInt5468] = (short) arg3;
		this.aShortArray99[this.anInt5468] = (short) arg5;
		this.aShortArray94[this.anInt5468] = (short) arg2;
		this.aShortArray102[this.anInt5468] = (short) arg7;
		this.aByteArray72[this.anInt5468] = (byte) arg9;
		this.aFloatArray45[this.anInt5468] = arg0;
		this.aFloatArray46[this.anInt5468] = arg8;
		return (short) this.anInt5468++;
	}

	@OriginalMember(owner = "client!li", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		if (!this.aBoolean372) {
			this.method4705();
		}
		return this.anInt5438;
	}

	@OriginalMember(owner = "client!li", name = "i", descriptor = "(I)V")
	private void method4710() {
		if (this.anInt5449 == 0) {
			return;
		}
		if (this.method4700() && this.method4712()) {
			this.aClass9_Sub1_8.method7697(this.aClass311_2.anInterface15_11, 0);
			this.aClass9_Sub1_8.method7697(this.aClass311_4.anInterface15_11, 1);
			this.aClass9_Sub1_8.method7697(this.aClass311_1.anInterface15_11, 2);
			@Pc(62) boolean local62;
			if ((this.anInt5478 & 0x37) == 0) {
				this.aClass9_Sub1_8.method7738(false);
				local62 = false;
				this.aClass9_Sub1_8.method7664(this.aClass9_Sub1_8.aClass265_20);
			} else {
				this.aClass9_Sub1_8.method7738(true);
				local62 = true;
				this.aClass9_Sub1_8.method7664(this.aClass9_Sub1_8.aClass265_16);
				this.aClass9_Sub1_8.method7697(this.aClass311_3.anInterface15_11, 3);
			}
			for (@Pc(95) int local95 = 0; local95 < this.anIntArray383.length; local95++) {
				@Pc(102) int local102 = this.anIntArray384[local95];
				@Pc(109) int local109 = this.anIntArray384[local95 + 1];
				@Pc(116) int local116 = this.aShortArray93[local102] & 0xFFFF;
				if (local116 == 65535) {
					local116 = -1;
				}
				this.aClass9_Sub1_8.method7732(true, local116, local62);
				this.aClass9_Sub1_8.method7658(Static29.aClass102_1, this.anIntArray383[local95], local102 * 3, this.anIntArray387[local95], local109 - local102, this.aClass236_1.anInterface1_5);
			}
		}
		this.method4708();
	}

	@OriginalMember(owner = "client!li", name = "ea", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(17) int local17;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg3 << 4;
			local25 = arg2 << 4;
			Static398.anInt6964 = 0;
			local29 = 0;
			Static311.anInt5972 = 0;
			Static406.anInt7106 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray43.length > local41) {
					local55 = this.anIntArrayArray43[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static311.anInt5972 += this.anIntArray389[local63];
						Static398.anInt6964 += this.anIntArray385[local63];
						local29++;
						Static406.anInt7106 += this.anIntArray388[local63];
					}
				}
			}
			if (local29 <= 0) {
				Static311.anInt5972 = local25;
				Static398.anInt6964 = local21;
				Static406.anInt7106 = local17;
			} else {
				Static406.anInt7106 = Static406.anInt7106 / local29 + local17;
				Static311.anInt5972 = Static311.anInt5972 / local29 + local25;
				Static398.anInt6964 = local21 + Static398.anInt6964 / local29;
			}
			return;
		}
		@Pc(166) int[] local166;
		@Pc(168) int local168;
		if (arg0 == 1) {
			local17 = arg4 << 4;
			local21 = arg3 << 4;
			local25 = arg2 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray43.length) {
					local166 = this.anIntArrayArray43[local35];
					for (local168 = 0; local168 < local166.length; local168++) {
						local57 = local166[local168];
						this.anIntArray389[local57] += local25;
						this.anIntArray385[local57] += local21;
						this.anIntArray388[local57] += local17;
					}
				}
			}
			return;
		}
		@Pc(284) int local284;
		@Pc(303) int local303;
		@Pc(760) int local760;
		@Pc(769) int local769;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray43.length) {
					local166 = this.anIntArrayArray43[local35];
					if ((arg5 & 0x1) == 0) {
						for (local168 = 0; local168 < local166.length; local168++) {
							local57 = local166[local168];
							this.anIntArray389[local57] -= Static311.anInt5972;
							this.anIntArray385[local57] -= Static398.anInt6964;
							this.anIntArray388[local57] -= Static406.anInt7106;
							if (arg4 != 0) {
								local63 = Class307.anIntArray744[arg4];
								local284 = Class307.anIntArray743[arg4];
								local303 = this.anIntArray385[local57] * local63 + local284 * this.anIntArray389[local57] + 32767 >> 15;
								this.anIntArray385[local57] = this.anIntArray385[local57] * local284 + 32767 - this.anIntArray389[local57] * local63 >> 15;
								this.anIntArray389[local57] = local303;
							}
							if (arg2 != 0) {
								local63 = Class307.anIntArray744[arg2];
								local284 = Class307.anIntArray743[arg2];
								local303 = this.anIntArray385[local57] * local284 + 32767 - local63 * this.anIntArray388[local57] >> 15;
								this.anIntArray388[local57] = local284 * this.anIntArray388[local57] + this.anIntArray385[local57] * local63 + 32767 >> 15;
								this.anIntArray385[local57] = local303;
							}
							if (arg3 != 0) {
								local63 = Class307.anIntArray744[arg3];
								local284 = Class307.anIntArray743[arg3];
								local303 = local63 * this.anIntArray388[local57] + local284 * this.anIntArray389[local57] + 32767 >> 15;
								this.anIntArray388[local57] = this.anIntArray388[local57] * local284 + 32767 - local63 * this.anIntArray389[local57] >> 15;
								this.anIntArray389[local57] = local303;
							}
							this.anIntArray389[local57] += Static311.anInt5972;
							this.anIntArray385[local57] += Static398.anInt6964;
							this.anIntArray388[local57] += Static406.anInt7106;
						}
					} else {
						for (local168 = 0; local168 < local166.length; local168++) {
							local57 = local166[local168];
							this.anIntArray389[local57] -= Static311.anInt5972;
							this.anIntArray385[local57] -= Static398.anInt6964;
							this.anIntArray388[local57] -= Static406.anInt7106;
							if (arg2 != 0) {
								local63 = Class307.anIntArray744[arg2];
								local284 = Class307.anIntArray743[arg2];
								local303 = local284 * this.anIntArray385[local57] + 32767 - this.anIntArray388[local57] * local63 >> 15;
								this.anIntArray388[local57] = this.anIntArray385[local57] * local63 + this.anIntArray388[local57] * local284 + 32767 >> 15;
								this.anIntArray385[local57] = local303;
							}
							if (arg4 != 0) {
								local63 = Class307.anIntArray744[arg4];
								local284 = Class307.anIntArray743[arg4];
								local303 = local284 * this.anIntArray389[local57] + local63 * this.anIntArray385[local57] + 32767 >> 15;
								this.anIntArray385[local57] = local284 * this.anIntArray385[local57] + 32767 - this.anIntArray389[local57] * local63 >> 15;
								this.anIntArray389[local57] = local303;
							}
							if (arg3 != 0) {
								local63 = Class307.anIntArray744[arg3];
								local284 = Class307.anIntArray743[arg3];
								local303 = local284 * this.anIntArray389[local57] + local63 * this.anIntArray388[local57] + 32767 >> 15;
								this.anIntArray388[local57] = local284 * this.anIntArray388[local57] + 32767 - local63 * this.anIntArray389[local57] >> 15;
								this.anIntArray389[local57] = local303;
							}
							this.anIntArray389[local57] += Static311.anInt5972;
							this.anIntArray385[local57] += Static398.anInt6964;
							this.anIntArray388[local57] += Static406.anInt7106;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray43.length) {
						local55 = this.anIntArrayArray43[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local284 = this.anIntArray386[local63];
							local303 = this.anIntArray386[local63 + 1];
							for (local760 = local284; local760 < local303; local760++) {
								local769 = this.aShortArray95[local760] - 1;
								if (local769 == -1) {
									break;
								}
								@Pc(782) int local782;
								@Pc(786) int local786;
								@Pc(804) int local804;
								if (arg4 != 0) {
									local782 = Class307.anIntArray744[arg4];
									local786 = Class307.anIntArray743[arg4];
									local804 = local786 * this.aShortArray99[local769] + this.aShortArray94[local769] * local782 + 32767 >> 15;
									this.aShortArray94[local769] = (short) (this.aShortArray94[local769] * local786 + 32767 - local782 * this.aShortArray99[local769] >> 15);
									this.aShortArray99[local769] = (short) local804;
								}
								if (arg2 != 0) {
									local782 = Class307.anIntArray744[arg2];
									local786 = Class307.anIntArray743[arg2];
									local804 = local786 * this.aShortArray94[local769] + 32767 - local782 * this.aShortArray102[local769] >> 15;
									this.aShortArray102[local769] = (short) (local782 * this.aShortArray94[local769] + local786 * this.aShortArray102[local769] + 32767 >> 15);
									this.aShortArray94[local769] = (short) local804;
								}
								if (arg3 != 0) {
									local782 = Class307.anIntArray744[arg3];
									local786 = Class307.anIntArray743[arg3];
									local804 = local786 * this.aShortArray99[local769] + local782 * this.aShortArray102[local769] + 32767 >> 15;
									this.aShortArray102[local769] = (short) (local786 * this.aShortArray102[local769] + 32767 - this.aShortArray99[local769] * local782 >> 15);
									this.aShortArray99[local769] = (short) local804;
								}
							}
						}
					}
				}
				this.method4704();
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray43.length > local35) {
					local166 = this.anIntArrayArray43[local35];
					for (local168 = 0; local168 < local166.length; local168++) {
						local57 = local166[local168];
						this.anIntArray389[local57] -= Static311.anInt5972;
						this.anIntArray385[local57] -= Static398.anInt6964;
						this.anIntArray388[local57] -= Static406.anInt7106;
						this.anIntArray389[local57] = arg2 * this.anIntArray389[local57] >> 7;
						this.anIntArray385[local57] = arg3 * this.anIntArray385[local57] >> 7;
						this.anIntArray388[local57] = arg4 * this.anIntArray388[local57] >> 7;
						this.anIntArray389[local57] += Static311.anInt5972;
						this.anIntArray385[local57] += Static398.anInt6964;
						this.anIntArray388[local57] += Static406.anInt7106;
					}
				}
			}
		} else {
			@Pc(1206) Class128 local1206;
			@Pc(1106) boolean local1106;
			@Pc(1201) Class83 local1201;
			if (arg0 == 5) {
				if (this.anIntArrayArray42 != null) {
					local1106 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray42.length) {
							local55 = this.anIntArrayArray42[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local284 = (this.aByteArray71[local63] & 0xFF) + arg2 * 8;
								if (local284 < 0) {
									local284 = 0;
								} else if (local284 > 255) {
									local284 = 255;
								}
								this.aByteArray71[local63] = (byte) local284;
							}
							local1106 |= local55.length > 0;
						}
					}
					if (local1106) {
						if (this.aClass83Array1 != null) {
							for (local41 = 0; local41 < this.anInt5461; local41++) {
								local1201 = this.aClass83Array1[local41];
								local1206 = this.aClass128Array1[local41];
								local1206.anInt4061 = local1206.anInt4061 & 0xFFFFFF | 255 - (this.aByteArray71[local1201.anInt2857] & 0xFF) << 24;
							}
						}
						this.method4706();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray42 != null) {
					local1106 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray42.length) {
							local55 = this.anIntArrayArray42[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local284 = this.aShortArray101[local63] & 0xFFFF;
								local303 = local284 >> 10 & 0x3F;
								local760 = local284 >> 7 & 0x7;
								@Pc(1303) int local1303 = local303 + arg2 & 0x3F;
								local760 += arg3 / 4;
								local769 = local284 & 0x7F;
								local769 += arg4;
								if (local760 < 0) {
									local760 = 0;
								} else if (local760 > 7) {
									local760 = 7;
								}
								if (local769 < 0) {
									local769 = 0;
								} else if (local769 > 127) {
									local769 = 127;
								}
								this.aShortArray101[local63] = (short) (local1303 << 10 | local760 << 7 | local769);
							}
							local1106 |= local55.length > 0;
						}
					}
					if (local1106) {
						if (this.aClass83Array1 != null) {
							for (local41 = 0; local41 < this.anInt5461; local41++) {
								local1201 = this.aClass83Array1[local41];
								local1206 = this.aClass128Array1[local41];
								local1206.anInt4061 = local1206.anInt4061 & 0xFF000000 | Static392.anIntArray516[this.aShortArray101[local1201.anInt2857] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method4706();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray41 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray41.length) {
							local166 = this.anIntArrayArray41[local35];
							for (local168 = 0; local168 < local166.length; local168++) {
								local1206 = this.aClass128Array1[local166[local168]];
								local1206.anInt4055 += arg3;
								local1206.anInt4056 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray41 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray41.length > local35) {
							local166 = this.anIntArrayArray41[local35];
							for (local168 = 0; local168 < local166.length; local168++) {
								local1206 = this.aClass128Array1[local166[local168]];
								local1206.anInt4057 = arg3 * local1206.anInt4057 >> 7;
								local1206.anInt4054 = arg2 * local1206.anInt4054 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray41 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray41.length) {
						local166 = this.anIntArrayArray41[local35];
						for (local168 = 0; local168 < local166.length; local168++) {
							local1206 = this.aClass128Array1[local166[local168]];
							local1206.anInt4058 = arg2 + local1206.anInt4058 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "q", descriptor = "(I)V")
	@Override
	public void q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class307.anIntArray744[arg0];
		@Pc(13) int local13 = Class307.anIntArray743[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5423; local15++) {
			local34 = this.anIntArray388[local15] * local9 + local13 * this.anIntArray389[local15] >> 15;
			this.anIntArray388[local15] = local13 * this.anIntArray388[local15] - local9 * this.anIntArray389[local15] >> 15;
			this.anIntArray389[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt5468; local34++) {
			@Pc(88) int local88 = local13 * this.aShortArray99[local34] + local9 * this.aShortArray102[local34] >> 15;
			this.aShortArray102[local34] = (short) (local13 * this.aShortArray102[local34] - local9 * this.aShortArray99[local34] >> 15);
			this.aShortArray99[local34] = (short) local88;
		}
		this.method4711();
		this.method4704();
		this.aBoolean372 = false;
	}

	@OriginalMember(owner = "client!li", name = "j", descriptor = "(I)V")
	private void method4711() {
		if (this.aClass311_2 != null) {
			this.aClass311_2.aBoolean615 = false;
		}
	}

	@OriginalMember(owner = "client!li", name = "k", descriptor = "(I)Z")
	private boolean method4712() {
		if (this.aClass236_1.aBoolean447) {
			return true;
		}
		if (this.aClass236_1.anInterface1_4 == null) {
			this.aClass236_1.anInterface1_4 = this.aClass9_Sub1_8.method7718(this.aBoolean373);
		}
		@Pc(33) Interface1 local33 = this.aClass236_1.anInterface1_4;
		local33.method7526(this.anInt5449 * 6);
		@Pc(45) Buffer local45 = local33.method7519();
		if (local45 != null) {
			@Pc(53) Stream local53 = this.aClass9_Sub1_8.method7677(local45);
			@Pc(57) int local57;
			if (Stream.c()) {
				for (local57 = 0; local57 < this.anInt5449; local57++) {
					local53.c(this.aShortArray104[local57]);
					local53.c(this.aShortArray96[local57]);
					local53.c(this.aShortArray97[local57]);
				}
			} else {
				for (local57 = 0; local57 < this.anInt5449; local57++) {
					local53.f(this.aShortArray104[local57]);
					local53.f(this.aShortArray96[local57]);
					local53.f(this.aShortArray97[local57]);
				}
			}
			local53.b();
			if (local33.method7521()) {
				this.aClass236_1.aBoolean447 = true;
				this.aClass236_1.anInterface1_5 = local33;
				this.aBoolean374 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!li", name = "U", descriptor = "()I")
	@Override
	public int U() {
		if (!this.aBoolean372) {
			this.method4705();
		}
		return this.anInt5458;
	}

	@OriginalMember(owner = "client!li", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		return this.anInt5475;
	}

	@OriginalMember(owner = "client!li", name = "sa", descriptor = "()Z")
	@Override
	protected boolean sa() {
		if (this.anIntArrayArray43 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5409; local12++) {
			this.anIntArray389[local12] <<= 0x4;
			this.anIntArray385[local12] <<= 0x4;
			this.anIntArray388[local12] <<= 0x4;
		}
		Static311.anInt5972 = 0;
		Static406.anInt7106 = 0;
		Static398.anInt6964 = 0;
		return true;
	}

	@OriginalMember(owner = "client!li", name = "BA", descriptor = "(I[IIIIZI[I)V")
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
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			Static398.anInt6964 = 0;
			Static406.anInt7106 = 0;
			local31 = 0;
			Static311.anInt5972 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray43.length > local41) {
					local55 = this.anIntArrayArray43[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray103 == null || (this.aShortArray103[local63] & arg6) != 0) {
							Static311.anInt5972 += this.anIntArray389[local63];
							Static398.anInt6964 += this.anIntArray385[local63];
							Static406.anInt7106 += this.anIntArray388[local63];
							local31++;
						}
					}
				}
			}
			if (local31 > 0) {
				Static311.anInt5972 = Static311.anInt5972 / local31 + arg2;
				Static406.anInt7106 = arg4 + Static406.anInt7106 / local31;
				Static398.anInt6964 = arg3 + Static398.anInt6964 / local31;
				Static290.aBoolean460 = true;
			} else {
				Static406.anInt7106 = arg4;
				Static398.anInt6964 = arg3;
				Static311.anInt5972 = arg2;
			}
			return;
		}
		@Pc(246) int[] local246;
		@Pc(248) int local248;
		if (arg0 == 1) {
			if (arg7 != null) {
				local31 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
				local35 = arg7[4] * arg3 + arg7[3] * arg2 + arg4 * arg7[5] + 16384 >> 15;
				local41 = arg4 * arg7[8] + arg3 * arg7[7] + arg2 * arg7[6] + 16384 >> 15;
				arg3 = local35;
				arg2 = local31;
				arg4 = local41;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray43.length > local35) {
					local246 = this.anIntArrayArray43[local35];
					for (local248 = 0; local248 < local246.length; local248++) {
						local57 = local246[local248];
						if (this.aShortArray103 == null || (arg6 & this.aShortArray103[local57]) != 0) {
							this.anIntArray389[local57] += arg2;
							this.anIntArray385[local57] += arg3;
							this.anIntArray388[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(388) int local388;
		@Pc(418) int local418;
		@Pc(445) int local445;
		@Pc(449) int local449;
		@Pc(453) int local453;
		@Pc(457) int local457;
		@Pc(465) int local465;
		@Pc(473) int local473;
		@Pc(628) int local628;
		@Pc(654) int local654;
		@Pc(659) int local659;
		@Pc(667) int local667;
		@Pc(672) int local672;
		@Pc(676) int local676;
		@Pc(680) int local680;
		@Pc(682) int local682;
		@Pc(812) int[] local812;
		@Pc(814) int local814;
		@Pc(818) int local818;
		@Pc(822) int local822;
		@Pc(824) int local824;
		@Pc(953) int local953;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray43.length > local35) {
						local246 = this.anIntArrayArray43[local35];
						for (local248 = 0; local248 < local246.length; local248++) {
							local57 = local246[local248];
							if (this.aShortArray103 == null || (arg6 & this.aShortArray103[local57]) != 0) {
								this.anIntArray389[local57] -= Static311.anInt5972;
								this.anIntArray385[local57] -= Static398.anInt6964;
								this.anIntArray388[local57] -= Static406.anInt7106;
								if (arg4 != 0) {
									local63 = Class307.anIntArray744[arg4];
									local366 = Class307.anIntArray743[arg4];
									local388 = local63 * this.anIntArray385[local57] + local366 * this.anIntArray389[local57] + 32767 >> 15;
									this.anIntArray385[local57] = this.anIntArray385[local57] * local366 + 32767 - this.anIntArray389[local57] * local63 >> 15;
									this.anIntArray389[local57] = local388;
								}
								if (arg2 != 0) {
									local63 = Class307.anIntArray744[arg2];
									local366 = Class307.anIntArray743[arg2];
									local388 = this.anIntArray385[local57] * local366 + 32767 - this.anIntArray388[local57] * local63 >> 15;
									this.anIntArray388[local57] = local366 * this.anIntArray388[local57] + local63 * this.anIntArray385[local57] + 32767 >> 15;
									this.anIntArray385[local57] = local388;
								}
								if (arg3 != 0) {
									local63 = Class307.anIntArray744[arg3];
									local366 = Class307.anIntArray743[arg3];
									local388 = local366 * this.anIntArray389[local57] + local63 * this.anIntArray388[local57] + 32767 >> 15;
									this.anIntArray388[local57] = this.anIntArray388[local57] * local366 + 32767 - local63 * this.anIntArray389[local57] >> 15;
									this.anIntArray389[local57] = local388;
								}
								this.anIntArray389[local57] += Static311.anInt5972;
								this.anIntArray385[local57] += Static398.anInt6964;
								this.anIntArray388[local57] += Static406.anInt7106;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray43.length > local41) {
							local55 = this.anIntArrayArray43[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray103 == null || (this.aShortArray103[local63] & arg6) != 0) {
									local366 = this.anIntArray386[local63];
									local388 = this.anIntArray386[local63 + 1];
									for (local418 = local366; local418 < local388; local418++) {
										local445 = this.aShortArray95[local418] - 1;
										if (local445 == -1) {
											break;
										}
										if (arg4 != 0) {
											local449 = Class307.anIntArray744[arg4];
											local453 = Class307.anIntArray743[arg4];
											local457 = local453 * this.aShortArray99[local445] + local449 * this.aShortArray94[local445] + 32767 >> 15;
											this.aShortArray94[local445] = (short) (this.aShortArray94[local445] * local453 + 32767 - local449 * this.aShortArray99[local445] >> 15);
											this.aShortArray99[local445] = (short) local457;
										}
										if (arg2 != 0) {
											local449 = Class307.anIntArray744[arg2];
											local453 = Class307.anIntArray743[arg2];
											local457 = this.aShortArray94[local445] * local453 + 32767 - this.aShortArray102[local445] * local449 >> 15;
											this.aShortArray102[local445] = (short) (this.aShortArray102[local445] * local453 + local449 * this.aShortArray94[local445] + 32767 >> 15);
											this.aShortArray94[local445] = (short) local457;
										}
										if (arg3 != 0) {
											local449 = Class307.anIntArray744[arg3];
											local453 = Class307.anIntArray743[arg3];
											local457 = this.aShortArray102[local445] * local449 + this.aShortArray99[local445] * local453 + 32767 >> 15;
											this.aShortArray102[local445] = (short) (local453 * this.aShortArray102[local445] + 32767 - this.aShortArray99[local445] * local449 >> 15);
											this.aShortArray99[local445] = (short) local457;
										}
									}
								}
							}
						}
					}
					this.method4704();
				}
			} else {
				local31 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local248 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static290.aBoolean460) {
					local366 = Static311.anInt5972 * arg7[0] + Static398.anInt6964 * arg7[3] + Static406.anInt7106 * arg7[6] + 16384 >> 15;
					local388 = arg7[7] * Static406.anInt7106 + arg7[4] * Static398.anInt6964 + arg7[1] * Static311.anInt5972 + 16384 >> 15;
					local388 += local57;
					local366 += local248;
					local418 = Static311.anInt5972 * arg7[2] + Static398.anInt6964 * arg7[5] + Static406.anInt7106 * arg7[8] + 16384 >> 15;
					Static311.anInt5972 = local366;
					local418 += local63;
					Static398.anInt6964 = local388;
					Static406.anInt7106 = local418;
					Static290.aBoolean460 = false;
				}
				@Pc(433) int[] local433 = new int[9];
				local388 = Class307.anIntArray743[arg2];
				local418 = Class307.anIntArray744[arg2];
				local445 = Class307.anIntArray743[arg3];
				local449 = Class307.anIntArray744[arg3];
				local453 = Class307.anIntArray743[arg4];
				local457 = Class307.anIntArray744[arg4];
				local465 = local453 * local418 + 16384 >> 15;
				local473 = local457 * local418 + 16384 >> 15;
				local433[7] = local457 * local449 + local445 * local465 + 16384 >> 15;
				local433[1] = -local445 * local457 + local449 * local465 + 16384 >> 15;
				local433[5] = -local418;
				local433[4] = local453 * local388 + 16384 >> 15;
				local433[6] = local473 * local445 + -local449 * local453 + 16384 >> 15;
				local433[3] = local457 * local388 + 16384 >> 15;
				local433[8] = local445 * local388 + 16384 >> 15;
				local433[0] = local445 * local453 + local449 * local473 + 16384 >> 15;
				local433[2] = local388 * local449 + 16384 >> 15;
				@Pc(603) int local603 = -Static311.anInt5972 * local433[0] + -Static398.anInt6964 * local433[1] + -Static406.anInt7106 * local433[2] + 16384 >> 15;
				local628 = -Static406.anInt7106 * local433[5] + local433[4] * -Static398.anInt6964 + -Static311.anInt5972 * local433[3] + 16384 >> 15;
				local654 = local433[8] * -Static406.anInt7106 + -Static311.anInt5972 * local433[6] + -Static398.anInt6964 * local433[7] + 16384 >> 15;
				local659 = local603 + Static311.anInt5972;
				@Pc(663) int local663 = Static398.anInt6964 + local628;
				local667 = Static406.anInt7106 + local654;
				@Pc(670) int[] local670 = new int[9];
				for (local672 = 0; local672 < 3; local672++) {
					for (local676 = 0; local676 < 3; local676++) {
						local680 = 0;
						for (local682 = 0; local682 < 3; local682++) {
							local680 += arg7[local682 + local676 * 3] * local433[local672 * 3 + local682];
						}
						local670[local676 + local672 * 3] = local680 + 16384 >> 15;
					}
				}
				local676 = local63 * local433[2] + local248 * local433[0] + local57 * local433[1] + 16384 >> 15;
				local680 = local433[5] * local63 + local248 * local433[3] + local57 * local433[4] + 16384 >> 15;
				local676 += local659;
				local680 += local663;
				local682 = local57 * local433[7] + local433[6] * local248 + local433[8] * local63 + 16384 >> 15;
				local682 += local667;
				local812 = new int[9];
				for (local814 = 0; local814 < 3; local814++) {
					for (local818 = 0; local818 < 3; local818++) {
						local822 = 0;
						for (local824 = 0; local824 < 3; local824++) {
							local822 += arg7[local824 + local814 * 3] * local670[local824 * 3 + local818];
						}
						local812[local818 + local814 * 3] = local822 + 16384 >> 15;
					}
				}
				local818 = local682 * arg7[2] + local680 * arg7[1] + arg7[0] * local676 + 16384 >> 15;
				local822 = arg7[5] * local682 + arg7[3] * local676 + local680 * arg7[4] + 16384 >> 15;
				local822 += local35;
				local818 += local31;
				local824 = local682 * arg7[8] + arg7[7] * local680 + arg7[6] * local676 + 16384 >> 15;
				local824 += local41;
				for (local953 = 0; local953 < local8; local953++) {
					@Pc(959) int local959 = arg1[local953];
					if (local959 < this.anIntArrayArray43.length) {
						@Pc(969) int[] local969 = this.anIntArrayArray43[local959];
						for (@Pc(971) int local971 = 0; local971 < local969.length; local971++) {
							@Pc(977) int local977 = local969[local971];
							if (this.aShortArray103 == null || (this.aShortArray103[local977] & arg6) != 0) {
								@Pc(1023) int local1023 = this.anIntArray389[local977] * local812[0] + local812[1] * this.anIntArray385[local977] + this.anIntArray388[local977] * local812[2] + 16384 >> 15;
								@Pc(1054) int local1054 = local812[5] * this.anIntArray388[local977] + local812[4] * this.anIntArray385[local977] + this.anIntArray389[local977] * local812[3] + 16384 >> 15;
								@Pc(1085) int local1085 = this.anIntArray388[local977] * local812[8] + this.anIntArray385[local977] * local812[7] + local812[6] * this.anIntArray389[local977] + 16384 >> 15;
								@Pc(1089) int local1089 = local1054 + local822;
								@Pc(1093) int local1093 = local1023 + local818;
								@Pc(1097) int local1097 = local1085 + local824;
								this.anIntArray389[local977] = local1093;
								this.anIntArray385[local977] = local1089;
								this.anIntArray388[local977] = local1097;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2574) Class128 local2574;
			@Pc(2461) boolean local2461;
			@Pc(2569) Class83 local2569;
			if (arg0 == 5) {
				if (this.anIntArrayArray42 != null) {
					local2461 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray42.length) {
							local55 = this.anIntArrayArray42[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray92 == null || (arg6 & this.aShortArray92[local63]) != 0) {
									local366 = (this.aByteArray71[local63] & 0xFF) + arg2 * 8;
									if (local366 < 0) {
										local366 = 0;
									} else if (local366 > 255) {
										local366 = 255;
									}
									this.aByteArray71[local63] = (byte) local366;
								}
							}
							local2461 |= local55.length > 0;
						}
					}
					if (local2461) {
						if (this.aClass83Array1 != null) {
							for (local41 = 0; local41 < this.anInt5461; local41++) {
								local2569 = this.aClass83Array1[local41];
								local2574 = this.aClass128Array1[local41];
								local2574.anInt4061 = local2574.anInt4061 & 0xFFFFFF | 255 - (this.aByteArray71[local2569.anInt2857] & 0xFF) << 24;
							}
						}
						this.method4706();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray42 != null) {
					local2461 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray42.length > local41) {
							local55 = this.anIntArrayArray42[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray92 == null || (this.aShortArray92[local63] & arg6) != 0) {
									local366 = this.aShortArray101[local63] & 0xFFFF;
									local388 = local366 >> 10 & 0x3F;
									local418 = local366 >> 7 & 0x7;
									@Pc(2678) int local2678 = arg2 + local388 & 0x3F;
									local445 = local366 & 0x7F;
									local418 += arg3 / 4;
									if (local418 < 0) {
										local418 = 0;
									} else if (local418 > 7) {
										local418 = 7;
									}
									local445 += arg4;
									if (local445 < 0) {
										local445 = 0;
									} else if (local445 > 127) {
										local445 = 127;
									}
									this.aShortArray101[local63] = (short) (local445 | local418 << 7 | local2678 << 10);
								}
							}
							local2461 |= local55.length > 0;
						}
					}
					if (local2461) {
						if (this.aClass83Array1 != null) {
							for (local41 = 0; local41 < this.anInt5461; local41++) {
								local2569 = this.aClass83Array1[local41];
								local2574 = this.aClass128Array1[local41];
								local2574.anInt4061 = local2574.anInt4061 & 0xFF000000 | Static392.anIntArray516[this.aShortArray101[local2569.anInt2857] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method4706();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray41 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray41.length) {
							local246 = this.anIntArrayArray41[local35];
							for (local248 = 0; local248 < local246.length; local248++) {
								local2574 = this.aClass128Array1[local246[local248]];
								local2574.anInt4056 += arg2;
								local2574.anInt4055 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray41 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray41.length) {
							local246 = this.anIntArrayArray41[local35];
							for (local248 = 0; local248 < local246.length; local248++) {
								local2574 = this.aClass128Array1[local246[local248]];
								local2574.anInt4054 = local2574.anInt4054 * arg2 >> 7;
								local2574.anInt4057 = arg3 * local2574.anInt4057 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray41 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray41.length) {
						local246 = this.anIntArrayArray41[local35];
						for (local248 = 0; local248 < local246.length; local248++) {
							local2574 = this.aClass128Array1[local246[local248]];
							local2574.anInt4058 = arg2 + local2574.anInt4058 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray43.length > local35) {
					local246 = this.anIntArrayArray43[local35];
					for (local248 = 0; local248 < local246.length; local248++) {
						local57 = local246[local248];
						if (this.aShortArray103 == null || (arg6 & this.aShortArray103[local57]) != 0) {
							this.anIntArray389[local57] -= Static311.anInt5972;
							this.anIntArray385[local57] -= Static398.anInt6964;
							this.anIntArray388[local57] -= Static406.anInt7106;
							this.anIntArray389[local57] = arg2 * this.anIntArray389[local57] >> 7;
							this.anIntArray385[local57] = this.anIntArray385[local57] * arg3 >> 7;
							this.anIntArray388[local57] = arg4 * this.anIntArray388[local57] >> 7;
							this.anIntArray389[local57] += Static311.anInt5972;
							this.anIntArray385[local57] += Static398.anInt6964;
							this.anIntArray388[local57] += Static406.anInt7106;
						}
					}
				}
			}
		} else {
			local31 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local248 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static290.aBoolean460) {
				local366 = Static398.anInt6964 * arg7[3] + Static311.anInt5972 * arg7[0] + arg7[6] * Static406.anInt7106 + 16384 >> 15;
				local388 = arg7[7] * Static406.anInt7106 + Static398.anInt6964 * arg7[4] + arg7[1] * Static311.anInt5972 + 16384 >> 15;
				local388 += local57;
				local366 += local248;
				local418 = arg7[8] * Static406.anInt7106 + arg7[5] * Static398.anInt6964 + Static311.anInt5972 * arg7[2] + 16384 >> 15;
				Static398.anInt6964 = local388;
				Static311.anInt5972 = local366;
				local418 += local63;
				Static290.aBoolean460 = false;
				Static406.anInt7106 = local418;
			}
			local366 = arg2 << 15 >> 7;
			local388 = arg3 << 15 >> 7;
			local418 = arg4 << 15 >> 7;
			local445 = -Static311.anInt5972 * local366 + 16384 >> 15;
			local449 = -Static398.anInt6964 * local388 + 16384 >> 15;
			local453 = local418 * -Static406.anInt7106 + 16384 >> 15;
			local457 = local445 + Static311.anInt5972;
			local465 = local449 + Static398.anInt6964;
			local473 = local453 + Static406.anInt7106;
			@Pc(1993) int[] local1993 = new int[] { arg7[0] * local366 + 16384 >> 15, local366 * arg7[3] + 16384 >> 15, arg7[6] * local366 + 16384 >> 15, arg7[1] * local388 + 16384 >> 15, local388 * arg7[4] + 16384 >> 15, local388 * arg7[7] + 16384 >> 15, local418 * arg7[2] + 16384 >> 15, local418 * arg7[5] + 16384 >> 15, local418 * arg7[8] + 16384 >> 15 };
			local628 = local366 * local248 + 16384 >> 15;
			local654 = local57 * local388 + 16384 >> 15;
			@Pc(2121) int local2121 = local628 + local457;
			@Pc(2125) int local2125 = local654 + local465;
			local659 = local63 * local418 + 16384 >> 15;
			@Pc(2137) int local2137 = local659 + local473;
			@Pc(2140) int[] local2140 = new int[9];
			@Pc(2146) int local2146;
			for (local667 = 0; local667 < 3; local667++) {
				for (local2146 = 0; local2146 < 3; local2146++) {
					local672 = 0;
					for (local676 = 0; local676 < 3; local676++) {
						local672 += local1993[local676 * 3 + local2146] * arg7[local667 * 3 + local676];
					}
					local2140[local2146 + local667 * 3] = local672 + 16384 >> 15;
				}
			}
			local2146 = arg7[2] * local2137 + arg7[1] * local2125 + arg7[0] * local2121 + 16384 >> 15;
			local672 = arg7[3] * local2121 + local2125 * arg7[4] + local2137 * arg7[5] + 16384 >> 15;
			local672 += local35;
			local676 = local2125 * arg7[7] + arg7[6] * local2121 + local2137 * arg7[8] + 16384 >> 15;
			local2146 += local31;
			local676 += local41;
			for (local680 = 0; local680 < local8; local680++) {
				local682 = arg1[local680];
				if (this.anIntArrayArray43.length > local682) {
					local812 = this.anIntArrayArray43[local682];
					for (local814 = 0; local814 < local812.length; local814++) {
						local818 = local812[local814];
						if (this.aShortArray103 == null || (this.aShortArray103[local818] & arg6) != 0) {
							local822 = local2140[2] * this.anIntArray388[local818] + this.anIntArray389[local818] * local2140[0] + local2140[1] * this.anIntArray385[local818] + 16384 >> 15;
							local824 = this.anIntArray389[local818] * local2140[3] + local2140[4] * this.anIntArray385[local818] + this.anIntArray388[local818] * local2140[5] + 16384 >> 15;
							local953 = this.anIntArray389[local818] * local2140[6] + local2140[7] * this.anIntArray385[local818] + this.anIntArray388[local818] * local2140[8] + 16384 >> 15;
							@Pc(2418) int local2418 = local824 + local672;
							@Pc(2422) int local2422 = local822 + local2146;
							@Pc(2426) int local2426 = local953 + local676;
							this.anIntArray389[local818] = local2422;
							this.anIntArray385[local818] = local2418;
							this.anIntArray388[local818] = local2426;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BIIIIIIII)Z")
	private boolean method4713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < arg4 && arg1 < arg6 && arg1 < arg3) {
			return false;
		} else if (arg1 > arg4 && arg6 < arg1 && arg3 < arg1) {
			return false;
		} else if (arg7 < arg2 && arg7 < arg0 && arg7 < arg5) {
			return false;
		} else {
			return arg2 >= arg7 || arg0 >= arg7 || arg7 <= arg5;
		}
	}

	@OriginalMember(owner = "client!li", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.aShort84 = (short) arg0;
		this.method4706();
	}

	@OriginalMember(owner = "client!li", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5423; local7++) {
			if (arg0 != 128) {
				this.anIntArray389[local7] = this.anIntArray389[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray385[local7] = this.anIntArray385[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray388[local7] = arg2 * this.anIntArray388[local7] >> 7;
			}
		}
		this.method4711();
		this.aBoolean372 = false;
	}
}
