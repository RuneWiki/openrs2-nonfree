import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class97_Sub2 extends Class97 {

	@OriginalMember(owner = "client!rw", name = "z", descriptor = "I")
	private int anInt7538;

	@OriginalMember(owner = "client!rw", name = "C", descriptor = "Z")
	private boolean aBoolean566;

	@OriginalMember(owner = "client!rw", name = "F", descriptor = "I")
	private int anInt7541;

	@OriginalMember(owner = "client!rw", name = "G", descriptor = "I")
	private int anInt7542;

	@OriginalMember(owner = "client!rw", name = "N", descriptor = "I")
	private int anInt7544;

	@OriginalMember(owner = "client!rw", name = "V", descriptor = "Lclient!nr;")
	private Class204 aClass204_1;

	@OriginalMember(owner = "client!rw", name = "hb", descriptor = "I")
	private int anInt7558;

	@OriginalMember(owner = "client!rw", name = "ib", descriptor = "Lclient!nr;")
	private Class204 aClass204_2;

	@OriginalMember(owner = "client!rw", name = "lb", descriptor = "Z")
	private boolean lb;

	@OriginalMember(owner = "client!rw", name = "pb", descriptor = "I")
	private int anInt7562;

	@OriginalMember(owner = "client!rw", name = "wb", descriptor = "Z")
	private boolean aBoolean567;

	@OriginalMember(owner = "client!rw", name = "Rb", descriptor = "I")
	private int anInt7580;

	@OriginalMember(owner = "client!rw", name = "Sb", descriptor = "I")
	private int anInt7581;

	@OriginalMember(owner = "client!rw", name = "Tb", descriptor = "Lclient!hl;")
	private Class129 aClass129_1;

	@OriginalMember(owner = "client!rw", name = "Xb", descriptor = "I")
	private int anInt7582;

	@OriginalMember(owner = "client!rw", name = "jc", descriptor = "I")
	private int anInt7591;

	@OriginalMember(owner = "client!rw", name = "lc", descriptor = "Lclient!tl;")
	private Class282 aClass282_1;

	@OriginalMember(owner = "client!rw", name = "mc", descriptor = "Lclient!nr;")
	private Class204 aClass204_3;

	@OriginalMember(owner = "client!rw", name = "pc", descriptor = "Lclient!nr;")
	private Class204 aClass204_4;

	@OriginalMember(owner = "client!rw", name = "yc", descriptor = "Lclient!bda;")
	private final Class4_Sub2 aClass4_Sub2_15;

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "[I")
	private int[] anIntArray709;

	@OriginalMember(owner = "client!rw", name = "uc", descriptor = "I")
	private int anInt7598;

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "I")
	private int anInt7532;

	@OriginalMember(owner = "client!rw", name = "bb", descriptor = "I")
	private int anInt7555;

	@OriginalMember(owner = "client!rw", name = "J", descriptor = "[I")
	private int[] anIntArray710;

	@OriginalMember(owner = "client!rw", name = "wc", descriptor = "[I")
	private int[] anIntArray716;

	@OriginalMember(owner = "client!rw", name = "Lb", descriptor = "[S")
	private short[] aShortArray125;

	@OriginalMember(owner = "client!rw", name = "db", descriptor = "[I")
	private int[] anIntArray711;

	@OriginalMember(owner = "client!rw", name = "Cc", descriptor = "I")
	private int anInt7603;

	@OriginalMember(owner = "client!rw", name = "O", descriptor = "[Lclient!fr;")
	private Class106[] aClass106Array6;

	@OriginalMember(owner = "client!rw", name = "vb", descriptor = "[Lclient!dl;")
	private Class68[] aClass68Array6;

	@OriginalMember(owner = "client!rw", name = "fc", descriptor = "I")
	private int anInt7590;

	@OriginalMember(owner = "client!rw", name = "K", descriptor = "[Lclient!ve;")
	private Class302[] aClass302Array1;

	@OriginalMember(owner = "client!rw", name = "A", descriptor = "[Lclient!ce;")
	private Class44[] aClass44Array1;

	@OriginalMember(owner = "client!rw", name = "Wb", descriptor = "[S")
	private short[] aShortArray126;

	@OriginalMember(owner = "client!rw", name = "Kb", descriptor = "[S")
	private short[] aShortArray124;

	@OriginalMember(owner = "client!rw", name = "cb", descriptor = "[S")
	private short[] aShortArray120;

	@OriginalMember(owner = "client!rw", name = "H", descriptor = "S")
	private short aShort102;

	@OriginalMember(owner = "client!rw", name = "gc", descriptor = "[S")
	private short[] aShortArray127;

	@OriginalMember(owner = "client!rw", name = "L", descriptor = "[S")
	private short[] aShortArray118;

	@OriginalMember(owner = "client!rw", name = "B", descriptor = "[B")
	private byte[] aByteArray99;

	@OriginalMember(owner = "client!rw", name = "zc", descriptor = "[F")
	private float[] aFloatArray62;

	@OriginalMember(owner = "client!rw", name = "Hb", descriptor = "[S")
	private short[] aShortArray123;

	@OriginalMember(owner = "client!rw", name = "u", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!rw", name = "w", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!rw", name = "T", descriptor = "[S")
	private short[] aShortArray119;

	@OriginalMember(owner = "client!rw", name = "fb", descriptor = "[S")
	private short[] aShortArray121;

	@OriginalMember(owner = "client!rw", name = "ob", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!rw", name = "ic", descriptor = "[S")
	private short[] aShortArray128;

	@OriginalMember(owner = "client!rw", name = "I", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!rw", name = "rb", descriptor = "[F")
	private float[] aFloatArray61;

	@OriginalMember(owner = "client!rw", name = "oc", descriptor = "[B")
	private byte[] aByteArray100;

	@OriginalMember(owner = "client!rw", name = "Qb", descriptor = "[I")
	private int[] anIntArray714;

	@OriginalMember(owner = "client!rw", name = "Eb", descriptor = "[I")
	private int[] anIntArray713;

	@OriginalMember(owner = "client!rw", name = "Ub", descriptor = "[I")
	private int[] anIntArray715;

	@OriginalMember(owner = "client!rw", name = "Vb", descriptor = "[[I")
	private int[][] anIntArrayArray102;

	@OriginalMember(owner = "client!rw", name = "Cb", descriptor = "[[I")
	private int[][] anIntArrayArray100;

	@OriginalMember(owner = "client!rw", name = "Nb", descriptor = "[[I")
	private int[][] anIntArrayArray101;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!bda;Lclient!ei;IIII)V")
	public Class97_Sub2(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface13 local11 = arg0.anInterface13_13;
		@Pc(15) int[] local15 = new int[arg1.anInt2239];
		this.anIntArray709 = new int[arg1.anInt2240 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt2239; local24++) {
			if ((arg1.aByteArray29 == null || arg1.aByteArray29[local24] != 2) && (arg1.aShortArray43 == null || arg1.aShortArray43[local24] == -1 || !local11.method5789(arg1.aShortArray43[local24] & 0xFFFF).aBoolean642)) {
				local15[this.anInt7598++] = local24;
				this.anIntArray709[arg1.aShortArray39[local24]]++;
				this.anIntArray709[arg1.aShortArray45[local24]]++;
				this.anIntArray709[arg1.aShortArray41[local24]]++;
			}
		}
		this.anInt7532 = this.anInt7598;
		@Pc(118) long[] local118 = new long[this.anInt7598];
		@Pc(130) boolean local130 = (this.anInt7581 & 0x100) != 0;
		@Pc(142) int local142;
		@Pc(153) int local153;
		@Pc(276) int local276;
		label496: for (@Pc(132) int local132 = 0; local132 < this.anInt7598; local132++) {
			@Pc(138) int local138 = local15[local132];
			@Pc(140) Class296 local140 = null;
			local142 = 0;
			@Pc(144) byte local144 = 0;
			@Pc(146) byte local146 = 0;
			@Pc(148) byte local148 = 0;
			if (arg1.aClass256Array1 != null) {
				for (local153 = 0; local153 < arg1.aClass256Array1.length; local153++) {
					@Pc(160) Class256 local160 = arg1.aClass256Array1[local153];
					if (local138 == local160.anInt7426) {
						@Pc(169) Class34 local169 = Static461.method7929(local160.anInt7427);
						if (local169.aBoolean100) {
							local118[local132] = Long.MAX_VALUE;
							this.anInt7532--;
							continue label496;
						}
					}
				}
			}
			@Pc(196) short local196 = -1;
			if (arg1.aShortArray43 != null) {
				local196 = arg1.aShortArray43[local138];
				if (local196 != -1) {
					local140 = local11.method5789(local196 & 0xFFFF);
					local146 = local140.aByte104;
					local148 = local140.aByte100;
				}
			}
			@Pc(238) boolean local238 = arg1.aByteArray25 != null && arg1.aByteArray25[local138] != 0 || local140 != null && !local140.aBoolean641;
			if ((local130 || local238) && arg1.aByteArray28 != null) {
				local142 += arg1.aByteArray28[local138] << 17;
			}
			if (local238) {
				local142 += 65536;
			}
			local142 += (local146 & 0xFF) << 8;
			local276 = local144 + ((local196 & 0xFFFF) << 16);
			local142 += local148 & 0xFF;
			@Pc(288) int local288 = local276 + (local132 & 0xFFFF);
			local118[local132] = (long) local288 + ((long) local142 << 32);
		}
		Static260.method4697(local118, local15);
		this.anInt7555 = arg1.anInt2251;
		this.anIntArray710 = arg1.anIntArray170;
		this.anIntArray716 = arg1.anIntArray174;
		this.aShortArray125 = arg1.aShortArray44;
		this.anIntArray711 = arg1.anIntArray165;
		this.anInt7603 = arg1.anInt2240;
		this.aClass106Array6 = arg1.aClass106Array1;
		this.aClass68Array6 = arg1.aClass68Array1;
		@Pc(343) Class261[] local343 = new Class261[this.anInt7603];
		@Pc(363) int local363;
		@Pc(377) int local377;
		if (arg1.aClass256Array1 != null) {
			this.anInt7590 = arg1.aClass256Array1.length;
			this.aClass302Array1 = new Class302[this.anInt7590];
			this.aClass44Array1 = new Class44[this.anInt7590];
			for (local363 = 0; local363 < this.anInt7590; local363++) {
				@Pc(370) Class256 local370 = arg1.aClass256Array1[local363];
				@Pc(375) Class34 local375 = Static461.method7929(local370.anInt7427);
				local377 = -1;
				for (@Pc(379) int local379 = 0; local379 < this.anInt7598; local379++) {
					if (local370.anInt7426 == local15[local379]) {
						local377 = local379;
						break;
					}
				}
				if (local377 == -1) {
					throw new RuntimeException();
				}
				local153 = Static107.anIntArray176[arg1.aShortArray42[local370.anInt7426] & 0xFFFF] & 0xFFFFFF;
				local153 |= 255 - (arg1.aByteArray25 == null ? 0 : arg1.aByteArray25[local370.anInt7426]) << 24;
				this.aClass44Array1[local363] = new Class44(local377, arg1.aShortArray39[local370.anInt7426], arg1.aShortArray45[local370.anInt7426], arg1.aShortArray41[local370.anInt7426], local375.anInt1150, local375.anInt1151, local375.anInt1153, local375.anInt1154, local375.anInt1157, local375.aBoolean100, local375.aBoolean99, local370.anInt7424);
				this.aClass302Array1[local363] = new Class302(local153);
			}
		}
		local363 = this.anInt7598 * 3;
		this.aShortArray126 = new short[this.anInt7598];
		this.aShortArray124 = new short[this.anInt7598];
		Static538.aLongArray18 = new long[local363];
		this.aShortArray120 = new short[local363];
		this.aShort102 = (short) arg3;
		this.aShortArray127 = new short[local363];
		this.aShortArray118 = new short[local363];
		this.aByteArray99 = new byte[local363];
		this.aFloatArray62 = new float[local363];
		this.aShortArray123 = new short[local363];
		this.aShort101 = (short) arg4;
		this.aShortArray116 = new short[local363];
		this.aShortArray119 = new short[this.anInt7598];
		this.aShortArray121 = new short[local363];
		this.aShortArray122 = new short[this.anInt7598];
		this.aShortArray128 = new short[this.anInt7598];
		if (arg1.aShortArray46 != null) {
			this.aShortArray117 = new short[this.anInt7598];
		}
		this.aFloatArray61 = new float[local363];
		this.aByteArray100 = new byte[this.anInt7598];
		local142 = 0;
		for (local276 = 0; local276 < arg1.anInt2240; local276++) {
			local377 = this.anIntArray709[local276];
			this.anIntArray709[local276] = local142;
			local343[local276] = new Class261();
			local142 += local377;
		}
		this.anIntArray709[arg1.anInt2240] = local142;
		@Pc(618) int[] local618 = null;
		@Pc(620) int[] local620 = null;
		@Pc(622) int[] local622 = null;
		@Pc(624) float[][] local624 = null;
		@Pc(642) int[] local642;
		@Pc(650) int local650;
		@Pc(688) int local688;
		@Pc(694) int local694;
		@Pc(708) int local708;
		@Pc(710) int local710;
		@Pc(744) int local744;
		@Pc(749) int local749;
		@Pc(917) float local917;
		@Pc(899) float local899;
		@Pc(911) float local911;
		if (arg1.aByteArray27 != null) {
			@Pc(630) int local630 = arg1.anInt2249;
			@Pc(633) int[] local633 = new int[local630];
			@Pc(636) int[] local636 = new int[local630];
			@Pc(639) int[] local639 = new int[local630];
			local642 = new int[local630];
			@Pc(645) int[] local645 = new int[local630];
			@Pc(648) int[] local648 = new int[local630];
			for (local650 = 0; local650 < local630; local650++) {
				local633[local650] = Integer.MAX_VALUE;
				local636[local650] = -2147483647;
				local639[local650] = Integer.MAX_VALUE;
				local642[local650] = -2147483647;
				local645[local650] = Integer.MAX_VALUE;
				local648[local650] = -2147483647;
			}
			local622 = new int[local630];
			local624 = new float[local630][];
			for (local688 = 0; local688 < this.anInt7598; local688++) {
				local694 = local15[local688];
				if (arg1.aByteArray27[local694] != -1) {
					local708 = arg1.aByteArray27[local694] & 0xFF;
					for (local710 = 0; local710 < 3; local710++) {
						@Pc(725) short local725;
						if (local710 == 0) {
							local725 = arg1.aShortArray39[local694];
						} else if (local710 == 1) {
							local725 = arg1.aShortArray45[local694];
						} else {
							local725 = arg1.aShortArray41[local694];
						}
						local744 = arg1.anIntArray174[local725];
						local749 = arg1.anIntArray165[local725];
						@Pc(754) int local754 = arg1.anIntArray170[local725];
						if (local744 < local633[local708]) {
							local633[local708] = local744;
						}
						if (local744 > local636[local708]) {
							local636[local708] = local744;
						}
						if (local639[local708] > local749) {
							local639[local708] = local749;
						}
						if (local642[local708] < local749) {
							local642[local708] = local749;
						}
						if (local754 < local645[local708]) {
							local645[local708] = local754;
						}
						if (local754 > local648[local708]) {
							local648[local708] = local754;
						}
					}
				}
			}
			local618 = new int[local630];
			local620 = new int[local630];
			for (local694 = 0; local694 < local630; local694++) {
				@Pc(842) byte local842 = arg1.aByteArray26[local694];
				if (local842 > 0) {
					local618[local694] = (local633[local694] + local636[local694]) / 2;
					local620[local694] = (local642[local694] + local639[local694]) / 2;
					local622[local694] = (local648[local694] + local645[local694]) / 2;
					if (local842 == 1) {
						local749 = arg1.anIntArray166[local694];
						local899 = 64.0F / (float) arg1.anIntArray168[local694];
						if (local749 == 0) {
							local911 = 1.0F;
							local917 = 1.0F;
						} else if (local749 <= 0) {
							local911 = 1.0F;
							local917 = (float) -local749 / 1024.0F;
						} else {
							local917 = 1.0F;
							local911 = (float) local749 / 1024.0F;
						}
					} else if (local842 == 2) {
						local911 = 64.0F / (float) arg1.anIntArray171[local694];
						local899 = 64.0F / (float) arg1.anIntArray168[local694];
						local917 = 64.0F / (float) arg1.anIntArray166[local694];
					} else {
						local917 = (float) arg1.anIntArray166[local694] / 1024.0F;
						local911 = (float) arg1.anIntArray171[local694] / 1024.0F;
						local899 = (float) arg1.anIntArray168[local694] / 1024.0F;
					}
					local624[local694] = Static186.method3580(local899, local911, arg1.aByteArray24[local694] & 0xFF, arg1.aShortArray40[local694], local917, arg1.aShortArray48[local694], arg1.aShortArray47[local694]);
				}
			}
		}
		@Pc(1027) Class119[] local1027 = new Class119[arg1.anInt2239];
		@Pc(1046) short local1046;
		@Pc(1057) int local1057;
		@Pc(1068) int local1068;
		for (@Pc(1029) int local1029 = 0; local1029 < arg1.anInt2239; local1029++) {
			@Pc(1036) short local1036 = arg1.aShortArray39[local1029];
			@Pc(1041) short local1041 = arg1.aShortArray45[local1029];
			local1046 = arg1.aShortArray41[local1029];
			local1057 = this.anIntArray716[local1041] - this.anIntArray716[local1036];
			local1068 = this.anIntArray711[local1041] - this.anIntArray711[local1036];
			local650 = this.anIntArray710[local1041] - this.anIntArray710[local1036];
			local688 = this.anIntArray716[local1046] - this.anIntArray716[local1036];
			local694 = this.anIntArray711[local1046] - this.anIntArray711[local1036];
			local708 = this.anIntArray710[local1046] - this.anIntArray710[local1036];
			local710 = local708 * local1068 - local694 * local650;
			@Pc(1128) int local1128 = local650 * local688 - local1057 * local708;
			local744 = local1057 * local694 - local1068 * local688;
			while (local710 > 8192 || local1128 > 8192 || local744 > 8192 || local710 < -8192 || local1128 < -8192 || local744 < -8192) {
				local1128 >>= 0x1;
				local744 >>= 0x1;
				local710 >>= 0x1;
			}
			local749 = (int) Math.sqrt((double) (local710 * local710 + local1128 * local1128 + local744 * local744));
			if (local749 <= 0) {
				local749 = 1;
			}
			local710 = local710 * 256 / local749;
			local1128 = local1128 * 256 / local749;
			local744 = local744 * 256 / local749;
			@Pc(1223) byte local1223 = arg1.aByteArray29 == null ? 0 : arg1.aByteArray29[local1029];
			if (local1223 == 0) {
				@Pc(1232) Class261 local1232 = local343[local1036];
				local1232.anInt7513++;
				local1232.anInt7511 += local744;
				local1232.anInt7509 += local710;
				local1232.anInt7514 += local1128;
				@Pc(1260) Class261 local1260 = local343[local1041];
				local1260.anInt7514 += local1128;
				local1260.anInt7511 += local744;
				local1260.anInt7513++;
				local1260.anInt7509 += local710;
				@Pc(1288) Class261 local1288 = local343[local1046];
				local1288.anInt7511 += local744;
				local1288.anInt7514 += local1128;
				local1288.anInt7509 += local710;
				local1288.anInt7513++;
			} else if (local1223 == 1) {
				@Pc(1325) Class119 local1325 = local1027[local1029] = new Class119();
				local1325.anInt3415 = local710;
				local1325.anInt3413 = local744;
				local1325.anInt3414 = local1128;
			}
		}
		@Pc(1347) int local1347;
		for (@Pc(1341) int local1341 = 0; local1341 < this.anInt7598; local1341++) {
			local1347 = local15[local1341];
			@Pc(1354) int local1354 = arg1.aShortArray42[local1347] & 0xFFFF;
			@Pc(1362) short local1362;
			if (arg1.aShortArray43 == null) {
				local1362 = -1;
			} else {
				local1362 = arg1.aShortArray43[local1347];
			}
			if (arg1.aByteArray27 == null) {
				local1068 = -1;
			} else {
				local1068 = arg1.aByteArray27[local1347];
			}
			if (arg1.aByteArray25 == null) {
				local650 = 0;
			} else {
				local650 = arg1.aByteArray25[local1347] & 0xFF;
			}
			@Pc(1394) float local1394 = 0.0F;
			@Pc(1396) float local1396 = 0.0F;
			@Pc(1398) float local1398 = 0.0F;
			local917 = 0.0F;
			local899 = 0.0F;
			local911 = 0.0F;
			@Pc(1406) byte local1406 = 0;
			@Pc(1408) byte local1408 = 0;
			@Pc(1410) int local1410 = 0;
			@Pc(1444) byte local1444;
			@Pc(1461) short local1461;
			@Pc(1466) short local1466;
			@Pc(1471) short local1471;
			if (local1362 != -1) {
				if (local1068 == -1) {
					local911 = 0.0F;
					local1396 = 1.0F;
					local1406 = 1;
					local899 = 0.0F;
					local1408 = 2;
					local917 = 1.0F;
					local1394 = 0.0F;
					local1398 = 1.0F;
				} else {
					local1068 &= 0xFF;
					local1444 = arg1.aByteArray26[local1068];
					@Pc(1451) short local1451;
					@Pc(1456) short local1456;
					@Pc(1494) float local1494;
					@Pc(1502) float local1502;
					@Pc(1510) float local1510;
					@Pc(1597) float local1597;
					@Pc(1605) float local1605;
					@Pc(1614) float local1614;
					@Pc(1623) float local1623;
					@Pc(1631) float local1631;
					@Pc(1640) float local1640;
					if (local1444 == 0) {
						local1451 = arg1.aShortArray39[local1347];
						local1456 = arg1.aShortArray45[local1347];
						local1461 = arg1.aShortArray41[local1347];
						local1466 = arg1.aShortArray48[local1068];
						local1471 = arg1.aShortArray40[local1068];
						@Pc(1476) short local1476 = arg1.aShortArray47[local1068];
						@Pc(1482) float local1482 = (float) arg1.anIntArray174[local1466];
						@Pc(1488) float local1488 = (float) arg1.anIntArray165[local1466];
						local1494 = arg1.anIntArray170[local1466];
						local1502 = (float) arg1.anIntArray174[local1471] - local1482;
						local1510 = (float) arg1.anIntArray165[local1471] - local1488;
						@Pc(1519) float local1519 = (float) arg1.anIntArray170[local1471] - local1494;
						@Pc(1527) float local1527 = (float) arg1.anIntArray174[local1476] - local1482;
						@Pc(1535) float local1535 = (float) arg1.anIntArray165[local1476] - local1488;
						@Pc(1544) float local1544 = (float) arg1.anIntArray170[local1476] - local1494;
						@Pc(1553) float local1553 = (float) arg1.anIntArray174[local1451] - local1482;
						@Pc(1562) float local1562 = (float) arg1.anIntArray165[local1451] - local1488;
						@Pc(1571) float local1571 = (float) arg1.anIntArray170[local1451] - local1494;
						@Pc(1580) float local1580 = (float) arg1.anIntArray174[local1456] - local1482;
						@Pc(1588) float local1588 = (float) arg1.anIntArray165[local1456] - local1488;
						local1597 = (float) arg1.anIntArray170[local1456] - local1494;
						local1605 = (float) arg1.anIntArray174[local1461] - local1482;
						local1614 = (float) arg1.anIntArray165[local1461] - local1488;
						local1623 = (float) arg1.anIntArray170[local1461] - local1494;
						local1631 = local1544 * local1510 - local1535 * local1519;
						local1640 = local1519 * local1527 - local1502 * local1544;
						@Pc(1649) float local1649 = local1535 * local1502 - local1510 * local1527;
						@Pc(1657) float local1657 = local1649 * local1535 - local1640 * local1544;
						@Pc(1665) float local1665 = local1631 * local1544 - local1649 * local1527;
						@Pc(1673) float local1673 = local1527 * local1640 - local1631 * local1535;
						@Pc(1687) float local1687 = 1.0F / (local1665 * local1510 + local1657 * local1502 + local1519 * local1673);
						local1398 = local1687 * (local1673 * local1597 + local1588 * local1665 + local1657 * local1580);
						local1394 = (local1553 * local1657 + local1665 * local1562 + local1571 * local1673) * local1687;
						local899 = local1687 * (local1673 * local1623 + local1665 * local1614 + local1605 * local1657);
						@Pc(1738) float local1738 = local1519 * local1631 - local1502 * local1649;
						@Pc(1746) float local1746 = local1649 * local1510 - local1519 * local1640;
						@Pc(1755) float local1755 = local1640 * local1502 - local1510 * local1631;
						@Pc(1769) float local1769 = 1.0F / (local1544 * local1755 + local1746 * local1527 + local1738 * local1535);
						local917 = (local1755 * local1597 + local1738 * local1588 + local1746 * local1580) * local1769;
						local1396 = local1769 * (local1755 * local1571 + local1562 * local1738 + local1746 * local1553);
						local911 = (local1738 * local1614 + local1605 * local1746 + local1623 * local1755) * local1769;
					} else {
						local1451 = arg1.aShortArray39[local1347];
						local1456 = arg1.aShortArray45[local1347];
						local1461 = arg1.aShortArray41[local1347];
						@Pc(1832) int local1832 = local618[local1068];
						@Pc(1836) int local1836 = local620[local1068];
						@Pc(1840) int local1840 = local622[local1068];
						@Pc(1844) float[] local1844 = local624[local1068];
						@Pc(1849) byte local1849 = arg1.aByteArray30[local1068];
						local1494 = (float) arg1.anIntArray169[local1068] / 256.0F;
						if (local1444 == 1) {
							local1502 = (float) arg1.anIntArray171[local1068] / 1024.0F;
							Static86.method1836(local1832, local1849, local1844, local1494, local1840, arg1.anIntArray165[local1451], local1502, arg1.anIntArray170[local1451], arg1.anIntArray174[local1451], local1836);
							local1394 = Static7.aFloat5;
							local1396 = Static186.aFloat81;
							Static86.method1836(local1832, local1849, local1844, local1494, local1840, arg1.anIntArray165[local1456], local1502, arg1.anIntArray170[local1456], arg1.anIntArray174[local1456], local1836);
							local917 = Static186.aFloat81;
							local1398 = Static7.aFloat5;
							Static86.method1836(local1832, local1849, local1844, local1494, local1840, arg1.anIntArray165[local1461], local1502, arg1.anIntArray170[local1461], arg1.anIntArray174[local1461], local1836);
							local899 = Static7.aFloat5;
							local911 = Static186.aFloat81;
							local1510 = local1502 / 2.0F;
							if ((local1849 & 0x1) == 0) {
								if (local899 - local1394 > local1510) {
									local899 -= local1502;
									local1408 = 1;
								} else if (local1394 - local899 > local1510) {
									local899 += local1502;
									local1408 = 2;
								}
								if (local1510 < local1398 - local1394) {
									local1398 -= local1502;
									local1406 = 1;
								} else if (local1510 < local1394 - local1398) {
									local1398 += local1502;
									local1406 = 2;
								}
							} else {
								if (local911 - local1396 > local1510) {
									local911 -= local1502;
									local1408 = 1;
								} else if (local1510 < local1396 - local911) {
									local911 += local1502;
									local1408 = 2;
								}
								if (local917 - local1396 > local1510) {
									local1406 = 1;
									local917 -= local1502;
								} else if (local1510 < local1396 - local917) {
									local917 += local1502;
									local1406 = 2;
								}
							}
						} else if (local1444 == 2) {
							local1502 = (float) arg1.anIntArray175[local1068] / 256.0F;
							local1510 = (float) arg1.anIntArray167[local1068] / 256.0F;
							@Pc(2091) int local2091 = arg1.anIntArray174[local1456] - arg1.anIntArray174[local1451];
							@Pc(2102) int local2102 = arg1.anIntArray165[local1456] - arg1.anIntArray165[local1451];
							@Pc(2112) int local2112 = arg1.anIntArray170[local1456] - arg1.anIntArray170[local1451];
							@Pc(2123) int local2123 = arg1.anIntArray174[local1461] - arg1.anIntArray174[local1451];
							@Pc(2133) int local2133 = arg1.anIntArray165[local1461] - arg1.anIntArray165[local1451];
							@Pc(2144) int local2144 = arg1.anIntArray170[local1461] - arg1.anIntArray170[local1451];
							@Pc(2152) int local2152 = local2144 * local2102 - local2112 * local2133;
							@Pc(2161) int local2161 = local2112 * local2123 - local2091 * local2144;
							@Pc(2170) int local2170 = local2091 * local2133 - local2123 * local2102;
							local1597 = 64.0F / (float) arg1.anIntArray166[local1068];
							local1605 = 64.0F / (float) arg1.anIntArray168[local1068];
							local1614 = 64.0F / (float) arg1.anIntArray171[local1068];
							local1623 = ((float) local2161 * local1844[1] + (float) local2152 * local1844[0] + (float) local2170 * local1844[2]) / local1597;
							local1631 = (local1844[5] * (float) local2170 + local1844[4] * (float) local2161 + local1844[3] * (float) local2152) / local1605;
							local1640 = ((float) local2170 * local1844[8] + (float) local2161 * local1844[7] + (float) local2152 * local1844[6]) / local1614;
							local1410 = Static140.method2623(local1623, local1631, local1640);
							Static403.method6414(arg1.anIntArray165[local1451], local1832, local1494, arg1.anIntArray174[local1451], local1510, local1849, local1836, local1844, local1502, local1410, arg1.anIntArray170[local1451], local1840);
							local1394 = Static466.aFloat163;
							local1396 = Static517.aFloat187;
							Static403.method6414(arg1.anIntArray165[local1456], local1832, local1494, arg1.anIntArray174[local1456], local1510, local1849, local1836, local1844, local1502, local1410, arg1.anIntArray170[local1456], local1840);
							local917 = Static517.aFloat187;
							local1398 = Static466.aFloat163;
							Static403.method6414(arg1.anIntArray165[local1461], local1832, local1494, arg1.anIntArray174[local1461], local1510, local1849, local1836, local1844, local1502, local1410, arg1.anIntArray170[local1461], local1840);
							local899 = Static466.aFloat163;
							local911 = Static517.aFloat187;
						} else if (local1444 == 3) {
							Static230.method4161(arg1.anIntArray170[local1451], local1844, local1494, local1836, arg1.anIntArray165[local1451], local1849, arg1.anIntArray174[local1451], local1832, local1840);
							local1396 = Static511.aFloat186;
							local1394 = Static275.aFloat107;
							Static230.method4161(arg1.anIntArray170[local1456], local1844, local1494, local1836, arg1.anIntArray165[local1456], local1849, arg1.anIntArray174[local1456], local1832, local1840);
							local1398 = Static275.aFloat107;
							local917 = Static511.aFloat186;
							Static230.method4161(arg1.anIntArray170[local1461], local1844, local1494, local1836, arg1.anIntArray165[local1461], local1849, arg1.anIntArray174[local1461], local1832, local1840);
							local899 = Static275.aFloat107;
							local911 = Static511.aFloat186;
							if ((local1849 & 0x1) == 0) {
								if (local1398 - local1394 > 0.5F) {
									local1398--;
									local1406 = 1;
								} else if (local1394 - local1398 > 0.5F) {
									local1398++;
									local1406 = 2;
								}
								if (local899 - local1394 > 0.5F) {
									local1408 = 1;
									local899--;
								} else if (local1394 - local899 > 0.5F) {
									local899++;
									local1408 = 2;
								}
							} else {
								if (local917 - local1396 > 0.5F) {
									local1406 = 1;
									local917--;
								} else if (local1396 - local917 > 0.5F) {
									local1406 = 2;
									local917++;
								}
								if (local911 - local1396 > 0.5F) {
									local911--;
									local1408 = 1;
								} else if (local1396 - local911 > 0.5F) {
									local1408 = 2;
									local911++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray29 == null) {
				local1444 = 0;
			} else {
				local1444 = arg1.aByteArray29[local1347];
			}
			if (local1444 == 0) {
				@Pc(2719) long local2719 = ((long) (local1410 << 24) + (long) (local1354 << 8) + (long) local650 << 32) + (long) (local1068 << 2);
				local1461 = arg1.aShortArray39[local1347];
				local1466 = arg1.aShortArray45[local1347];
				local1471 = arg1.aShortArray41[local1347];
				@Pc(2738) Class261 local2738 = local343[local1461];
				this.aShortArray122[local1341] = this.method6755(local2738.anInt7514, local2719, local2738.anInt7509, local1394, local1341, local2738.anInt7513, local1396, arg1, local1461, local2738.anInt7511);
				@Pc(2763) Class261 local2763 = local343[local1466];
				this.aShortArray128[local1341] = this.method6755(local2763.anInt7514, local2719 + (long) local1406, local2763.anInt7509, local1398, local1341, local2763.anInt7513, local917, arg1, local1466, local2763.anInt7511);
				@Pc(2791) Class261 local2791 = local343[local1471];
				this.aShortArray119[local1341] = this.method6755(local2791.anInt7514, (long) local1408 + local2719, local2791.anInt7509, local899, local1341, local2791.anInt7513, local911, arg1, local1471, local2791.anInt7511);
			} else if (local1444 == 1) {
				@Pc(2580) Class119 local2580 = local1027[local1347];
				@Pc(2621) long local2621 = ((long) local650 + (long) (local1354 << 8) + (long) (local1410 << 24) << 32) + (long) ((local2580.anInt3414 + 256 << 12) + (local1068 << 2) + (local2580.anInt3415 > 0 ? 1024 : 2048) + (local2580.anInt3413 + 256 << 22));
				this.aShortArray122[local1341] = this.method6755(local2580.anInt3414, local2621, local2580.anInt3415, local1394, local1341, 0, local1396, arg1, arg1.aShortArray39[local1347], local2580.anInt3413);
				this.aShortArray128[local1341] = this.method6755(local2580.anInt3414, local2621 + (long) local1406, local2580.anInt3415, local1398, local1341, 0, local917, arg1, arg1.aShortArray45[local1347], local2580.anInt3413);
				this.aShortArray119[local1341] = this.method6755(local2580.anInt3414, (long) local1408 + local2621, local2580.anInt3415, local899, local1341, 0, local911, arg1, arg1.aShortArray41[local1347], local2580.anInt3413);
			}
			if (arg1.aShortArray43 == null) {
				this.aShortArray124[local1341] = -1;
			} else {
				this.aShortArray124[local1341] = arg1.aShortArray43[local1347];
			}
			if (arg1.aByteArray25 != null) {
				this.aByteArray100[local1341] = arg1.aByteArray25[local1347];
			}
			if (arg1.aShortArray46 != null) {
				this.aShortArray117[local1341] = arg1.aShortArray46[local1347];
			}
			this.aShortArray126[local1341] = arg1.aShortArray42[local1347];
		}
		if (this.anInt7532 > 0) {
			local1347 = 1;
			local1046 = this.aShortArray124[0];
			for (local1057 = 0; local1057 < this.anInt7532; local1057++) {
				@Pc(2890) short local2890 = this.aShortArray124[local1057];
				if (local1046 != local2890) {
					local1046 = local2890;
					local1347++;
				}
			}
			this.anIntArray714 = new int[local1347];
			this.anIntArray713 = new int[local1347];
			this.anIntArray715 = new int[local1347 + 1];
			this.anIntArray715[0] = 0;
			local1068 = this.anInt7541;
			local1347 = 0;
			@Pc(2935) short local2935 = 0;
			local1046 = this.aShortArray124[0];
			for (local688 = 0; local688 < this.anInt7532; local688++) {
				@Pc(2949) short local2949 = this.aShortArray124[local688];
				if (local1046 != local2949) {
					this.anIntArray714[local1347] = local1068;
					this.anIntArray713[local1347] = local2935 + 1 - local1068;
					local1347++;
					this.anIntArray715[local1347] = local688;
					local1046 = local2949;
					local1068 = this.anInt7541;
					local2935 = 0;
				}
				@Pc(2989) short local2989 = this.aShortArray122[local688];
				if (local2989 > local2935) {
					local2935 = local2989;
				}
				if (local2989 < local1068) {
					local1068 = local2989;
				}
				local2989 = this.aShortArray128[local688];
				if (local2989 < local1068) {
					local1068 = local2989;
				}
				if (local2935 < local2989) {
					local2935 = local2989;
				}
				local2989 = this.aShortArray119[local688];
				if (local2989 > local2935) {
					local2935 = local2989;
				}
				if (local2989 < local1068) {
					local1068 = local2989;
				}
			}
			this.anIntArray714[local1347] = local1068;
			this.anIntArray713[local1347] = local2935 + 1 - local1068;
			local1347++;
			this.anIntArray715[local1347] = this.anInt7532;
		}
		Static538.aLongArray18 = null;
		this.aShortArray121 = Static104.method8231(this.aShortArray121, this.anInt7541);
		this.aShortArray118 = Static104.method8231(this.aShortArray118, this.anInt7541);
		this.aShortArray123 = Static104.method8231(this.aShortArray123, this.anInt7541);
		this.aShortArray116 = Static104.method8231(this.aShortArray116, this.anInt7541);
		this.aShortArray127 = Static104.method8231(this.aShortArray127, this.anInt7541);
		this.aByteArray99 = Static132.method2522(this.aByteArray99, this.anInt7541);
		this.aFloatArray62 = Static468.method7129(this.aFloatArray62, this.anInt7541);
		this.aFloatArray61 = Static468.method7129(this.aFloatArray61, this.anInt7541);
		if (arg1.anIntArray172 != null && Static465.method7069(this.anInt7580, arg2)) {
			this.anIntArrayArray102 = arg1.method2159(false);
		}
		if (arg1.aClass256Array1 != null && Static244.method4327(this.anInt7580, arg2)) {
			this.anIntArrayArray100 = arg1.method2166();
		}
		if (arg1.anIntArray173 != null && Static303.method5351(arg2, this.anInt7580)) {
			local1347 = 0;
			local642 = new int[256];
			for (local1057 = 0; local1057 < this.anInt7598; local1057++) {
				local1068 = arg1.anIntArray173[local15[local1057]];
				if (local1068 >= 0) {
					@Pc(3213) int local3213 = local642[local1068]++;
					if (local1347 < local1068) {
						local1347 = local1068;
					}
				}
			}
			this.anIntArrayArray101 = new int[local1347 + 1][];
			for (local1068 = 0; local1068 <= local1347; local1068++) {
				this.anIntArrayArray101[local1068] = new int[local642[local1068]];
				local642[local1068] = 0;
			}
			for (local650 = 0; local650 < this.anInt7598; local650++) {
				local688 = arg1.anIntArray173[local15[local650]];
				if (local688 >= 0) {
					this.anIntArrayArray101[local688][local642[local688]++] = local650;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!bda;IIZZ)V")
	public Class97_Sub2(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7532 = 0;
		this.aBoolean566 = true;
		this.lb = false;
		this.anInt7555 = 0;
		this.aBoolean567 = false;
		this.anInt7598 = 0;
		this.anInt7541 = 0;
		this.anInt7603 = 0;
		this.aClass4_Sub2_15 = arg0;
		this.anInt7581 = arg1;
		this.anInt7580 = arg2;
		this.aBoolean567 = arg4;
		if (arg3 || Static291.method5104(this.anInt7580, this.anInt7581)) {
			this.aClass204_4 = new Class204(Static263.method4733(this.anInt7581, this.anInt7580));
		}
		if (arg3 || Static167.method3164(this.anInt7581, this.anInt7580)) {
			this.aClass204_1 = new Class204(Static514.method7861(this.anInt7580, this.anInt7581));
		}
		if (arg3 || Static333.method5657(this.anInt7581, this.anInt7580)) {
			this.aClass204_2 = new Class204(Static461.method7923(this.anInt7580, this.anInt7581));
		}
		if (arg3 || Static54.method1451(this.anInt7580, this.anInt7581)) {
			this.aClass204_3 = new Class204(Static157.method2875(this.anInt7580, this.anInt7581));
		}
		if (arg3 || Static495.method7591(this.anInt7580, this.anInt7581)) {
			this.aClass129_1 = new Class129(Static498.method7618(this.anInt7581, this.anInt7580));
		}
	}

	@OriginalMember(owner = "client!rw", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class200_Sub1.lb[arg0];
		@Pc(13) int local13 = Class200_Sub1.anIntArray576[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7603; local15++) {
			@Pc(34) int local34 = this.anIntArray711[local15] * local13 - local9 * this.anIntArray710[local15] >> 15;
			this.anIntArray710[local15] = local9 * this.anIntArray711[local15] + this.anIntArray710[local15] * local13 >> 15;
			this.anIntArray711[local15] = local34;
		}
		this.method6754();
		this.lb = false;
	}

	@OriginalMember(owner = "client!rw", name = "pa", descriptor = "(SS)V")
	@Override
	public void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7598; local7++) {
			if (this.aShortArray126[local7] == arg0) {
				this.aShortArray126[local7] = arg1;
			}
		}
		if (this.aClass44Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt7590; local38++) {
				@Pc(45) Class44 local45 = this.aClass44Array1[local38];
				@Pc(50) Class302 local50 = this.aClass302Array1[local38];
				local50.anInt8898 = Static107.anIntArray176[this.aShortArray126[local45.anInt1423] & 0xFFFF] & 0xFFFFFF | local50.anInt8898 & 0xFF000000;
			}
		}
		this.method6757();
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "()[Lclient!fr;")
	@Override
	public Class106[] method6767() {
		return this.aClass106Array6;
	}

	@OriginalMember(owner = "client!rw", name = "MA", descriptor = "()V")
	@Override
	protected void MA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7555; local7++) {
			this.anIntArray716[local7] = this.anIntArray716[local7] + 7 >> 4;
			this.anIntArray711[local7] = this.anIntArray711[local7] + 7 >> 4;
			this.anIntArray710[local7] = this.anIntArray710[local7] + 7 >> 4;
		}
		this.method6754();
		this.lb = false;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V")
	private void method6740() {
		if (!this.aBoolean566) {
			return;
		}
		this.aBoolean566 = false;
		if (this.aClass68Array6 == null && this.aClass106Array6 == null && this.aClass44Array1 == null) {
			if (this.anIntArray716 != null && !Static130.method7392(this.anInt7581, this.anInt7580)) {
				if (this.aClass204_4 == null || this.aClass204_4.method5628()) {
					if (!this.lb) {
						this.method6751();
					}
					this.anIntArray716 = null;
				} else {
					this.aBoolean566 = true;
				}
			}
			if (this.anIntArray711 != null && !Static388.method6204(this.anInt7581, this.anInt7580)) {
				if (this.aClass204_4 == null || this.aClass204_4.method5628()) {
					if (!this.lb) {
						this.method6751();
					}
					this.anIntArray711 = null;
				} else {
					this.aBoolean566 = true;
				}
			}
			if (this.anIntArray710 != null && !Static494.method7576(this.anInt7581, this.anInt7580)) {
				if (this.aClass204_4 == null || this.aClass204_4.method5628()) {
					if (!this.lb) {
						this.method6751();
					}
					this.anIntArray710 = null;
				} else {
					this.aBoolean566 = true;
				}
			}
		}
		if (this.aShortArray120 != null && this.anIntArray716 == null && this.anIntArray711 == null && this.anIntArray710 == null) {
			this.anIntArray709 = null;
			this.aShortArray120 = null;
		}
		if (this.aByteArray99 != null && !Static240.method4288(this.anInt7581, this.anInt7580)) {
			label195: {
				label194: {
					@Pc(172) boolean local172;
					if ((this.anInt7580 & 0x37) == 0) {
						if (this.aClass204_2 == null || this.aClass204_2.method5628()) {
							break label194;
						}
						local172 = false;
					} else {
						if (this.aClass204_3 == null || this.aClass204_3.method5628()) {
							break label194;
						}
						local172 = false;
					}
					if (!local172) {
						this.aBoolean566 = true;
						break label195;
					}
				}
				this.aShortArray123 = this.aShortArray116 = this.aShortArray127 = null;
				this.aByteArray99 = null;
			}
		}
		if (this.aShortArray126 != null && !Static111.method2224(this.anInt7580, this.anInt7581)) {
			if (this.aClass204_2 == null || this.aClass204_2.method5628()) {
				this.aShortArray126 = null;
			} else {
				this.aBoolean566 = true;
			}
		}
		if (this.aByteArray100 != null && !Static306.method5366(this.anInt7581, this.anInt7580)) {
			if (this.aClass204_2 == null || this.aClass204_2.method5628()) {
				this.aByteArray100 = null;
			} else {
				this.aBoolean566 = true;
			}
		}
		if (this.aFloatArray62 != null && !Static422.method6590(this.anInt7580, this.anInt7581)) {
			if (this.aClass204_1 == null || this.aClass204_1.method5628()) {
				this.aFloatArray62 = this.aFloatArray61 = null;
			} else {
				this.aBoolean566 = true;
			}
		}
		if (this.aShortArray124 != null && !Static111.method2226(this.anInt7580, this.anInt7581)) {
			if (this.aClass204_2 == null || this.aClass204_2.method5628()) {
				this.aShortArray124 = null;
			} else {
				this.aBoolean566 = true;
			}
		}
		if (this.aShortArray122 != null && !Static139.method2614(this.anInt7580, this.anInt7581)) {
			if ((this.aClass129_1 == null || this.aClass129_1.method3532()) && (this.aClass204_2 == null || this.aClass204_2.method5628())) {
				this.aShortArray122 = this.aShortArray128 = this.aShortArray119 = null;
			} else {
				this.aBoolean566 = true;
			}
		}
		if (this.aShortArray121 != null) {
			if (this.aClass204_4 == null || this.aClass204_4.method5628()) {
				this.aShortArray121 = null;
			} else {
				this.aBoolean566 = true;
			}
		}
		if (this.aShortArray118 != null) {
			if (this.aClass204_2 == null || this.aClass204_2.method5628()) {
				this.aShortArray118 = null;
			} else {
				this.aBoolean566 = true;
			}
		}
		if (this.anIntArrayArray101 != null && !Static303.method5351(this.anInt7581, this.anInt7580)) {
			this.aShortArray117 = null;
			this.anIntArrayArray101 = null;
		}
		if (this.anIntArrayArray102 != null && !Static465.method7069(this.anInt7580, this.anInt7581)) {
			this.anIntArrayArray102 = null;
			this.aShortArray125 = null;
		}
		if (this.anIntArrayArray100 != null && !Static244.method4327(this.anInt7580, this.anInt7581)) {
			this.anIntArrayArray100 = null;
		}
		if (this.anIntArray715 != null && (this.anInt7581 & 0x800) == 0 && (this.anInt7581 & 0x40000) == 0) {
			this.anIntArray713 = null;
			this.anIntArray714 = null;
			this.anIntArray715 = null;
		}
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(I)V")
	private void method6741() {
		if (this.aClass44Array1 == null) {
			return;
		}
		@Pc(20) float local20 = this.aClass4_Sub2_15.ra();
		@Pc(24) float local24 = this.aClass4_Sub2_15.P();
		this.aClass4_Sub2_15.method7214(false);
		this.aClass4_Sub2_15.method7299(false);
		this.aClass4_Sub2_15.method7277(1, Static319.aClass27_4);
		this.aClass4_Sub2_15.method7330(Static319.aClass27_4, 1);
		for (@Pc(47) int local47 = 0; local47 < this.anInt7590; local47++) {
			@Pc(54) Class44 local54 = this.aClass44Array1[local47];
			@Pc(59) Class302 local59 = this.aClass302Array1[local47];
			if (!local54.aBoolean108 || !this.aClass4_Sub2_15.method7182()) {
				@Pc(87) float local87 = (float) (this.anIntArray716[local54.anInt1418] + this.anIntArray716[local54.anInt1422] + this.anIntArray716[local54.anInt1417]) * 0.3333333F;
				@Pc(108) float local108 = (float) (this.anIntArray711[local54.anInt1418] + this.anIntArray711[local54.anInt1422] + this.anIntArray711[local54.anInt1417]) * 0.3333333F;
				@Pc(129) float local129 = (float) (this.anIntArray710[local54.anInt1417] + this.anIntArray710[local54.anInt1422] + this.anIntArray710[local54.anInt1418]) * 0.3333333F;
				@Pc(143) float local143 = Static393.aFloat143 * local87 + Static192.aFloat7 * local108 + local129 * Static156.aFloat53 + Static106.aFloat46;
				@Pc(157) float local157 = Static233.aFloat87 + Static452.aFloat162 * local108 + Static80.aFloat42 * local87 + Static119.aFloat47 * local129;
				@Pc(171) float local171 = Static53.aFloat31 * local108 + local87 * Static191.aFloat190 + local129 * Static425.aFloat146 + Static423.aFloat145;
				@Pc(176) Class128_Sub3 local176 = this.aClass4_Sub2_15.method7338();
				local176.method6892(local59.anInt8904, local54.aShort17 * local59.anInt8900 >> 7, (float) local59.anInt8907 + local157, local171, local143 + (float) local59.anInt8906, local54.aShort15 * local59.anInt8902 >> 7);
				local176.method6902(this.aClass4_Sub2_15.aClass128_Sub3_17);
				this.aClass4_Sub2_15.method7306();
				this.aClass4_Sub2_15.la(local24, local20 - (float) local54.anInt1421 * 1.5F);
				@Pc(230) int local230 = local59.anInt8898;
				this.aClass4_Sub2_15.method7281(local54.aShort16, false, false);
				this.aClass4_Sub2_15.method7228(local54.aByte20);
				this.aClass4_Sub2_15.method7279(local54.aByte19);
				this.aClass4_Sub2_15.method7275(local230);
				this.aClass4_Sub2_15.method7264();
			}
		}
		this.aClass4_Sub2_15.method7330(Static226.aClass27_1, 1);
		this.aClass4_Sub2_15.method7277(1, Static226.aClass27_1);
		this.aClass4_Sub2_15.la(local24, local20);
		this.aClass4_Sub2_15.method7214(true);
	}

	@OriginalMember(owner = "client!rw", name = "wa", descriptor = "()I")
	@Override
	public int wa() {
		if (!this.lb) {
			this.method6751();
		}
		return this.anInt7582;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!be;I)V")
	private void method6742(@OriginalArg(0) Class1_Sub2_Sub2_Sub1 arg0) {
		if (this.anInt7541 > Static107.anIntArray177.length) {
			Static343.anIntArray812 = new int[this.anInt7541];
			Static107.anIntArray177 = new int[this.anInt7541];
		}
		@Pc(51) int local51;
		@Pc(89) int local89;
		@Pc(98) int local98;
		for (@Pc(24) int local24 = 0; local24 < this.anInt7603; local24++) {
			local51 = (this.anIntArray716[local24] - (this.aClass4_Sub2_15.anInt8302 * this.anIntArray711[local24] >> 8) >> this.aClass4_Sub2_15.anInt8290) - arg0.anInt1044;
			@Pc(75) int local75 = (this.anIntArray710[local24] - (this.anIntArray711[local24] * this.aClass4_Sub2_15.anInt8314 >> 8) >> this.aClass4_Sub2_15.anInt8290) - arg0.anInt1048;
			@Pc(80) int local80 = this.anIntArray709[local24];
			@Pc(87) int local87 = this.anIntArray709[local24 + 1];
			for (local89 = local80; local89 < local87; local89++) {
				local98 = this.aShortArray120[local89] - 1;
				if (local98 == -1) {
					break;
				}
				Static107.anIntArray177[local98] = local51;
				Static343.anIntArray812[local98] = local75;
			}
		}
		for (local51 = 0; local51 < this.anInt7532; local51++) {
			if (this.aByteArray100 == null || this.aByteArray100[local51] <= 128) {
				@Pc(141) short local141 = this.aShortArray122[local51];
				@Pc(146) short local146 = this.aShortArray128[local51];
				@Pc(151) short local151 = this.aShortArray119[local51];
				local89 = Static107.anIntArray177[local141];
				local98 = Static107.anIntArray177[local146];
				@Pc(163) int local163 = Static107.anIntArray177[local151];
				@Pc(167) int local167 = Static343.anIntArray812[local141];
				@Pc(171) int local171 = Static343.anIntArray812[local146];
				@Pc(175) int local175 = Static343.anIntArray812[local151];
				if ((local171 - local175) * (local89 + -local98) - (local171 - local167) * (-local98 + local163) > 0) {
					arg0.method1059(local167, local98, local175, local163, local171, local89);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "BA", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			Static369.anInt6644 = 0;
			local29 = 0;
			Static37.anInt1097 = 0;
			Static481.anInt6919 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray102.length > local41) {
					local55 = this.anIntArrayArray102[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray125 == null || (this.aShortArray125[local63] & arg6) != 0) {
							Static369.anInt6644 += this.anIntArray716[local63];
							Static481.anInt6919 += this.anIntArray711[local63];
							local29++;
							Static37.anInt1097 += this.anIntArray710[local63];
						}
					}
				}
			}
			if (local29 > 0) {
				Static363.aBoolean484 = true;
				Static369.anInt6644 = arg2 + Static369.anInt6644 / local29;
				Static37.anInt1097 = arg4 + Static37.anInt1097 / local29;
				Static481.anInt6919 = arg3 + Static481.anInt6919 / local29;
			} else {
				Static481.anInt6919 = arg3;
				Static37.anInt1097 = arg4;
				Static369.anInt6644 = arg2;
			}
			return;
		}
		@Pc(253) int[] local253;
		@Pc(255) int local255;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg7[2] * arg4 + arg3 * arg7[1] + arg2 * arg7[0] + 16384 >> 15;
				local35 = arg4 * arg7[5] + arg3 * arg7[4] + arg2 * arg7[3] + 16384 >> 15;
				local41 = arg3 * arg7[7] + arg7[6] * arg2 + arg4 * arg7[8] + 16384 >> 15;
				arg3 = local35;
				arg2 = local29;
				arg4 = local41;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray102.length > local35) {
					local253 = this.anIntArrayArray102[local35];
					for (local255 = 0; local255 < local253.length; local255++) {
						local57 = local253[local255];
						if (this.aShortArray125 == null || (this.aShortArray125[local57] & arg6) != 0) {
							this.anIntArray716[local57] += arg2;
							this.anIntArray711[local57] += arg3;
							this.anIntArray710[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(376) int local376;
		@Pc(398) int local398;
		@Pc(428) int local428;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(475) int local475;
		@Pc(483) int local483;
		@Pc(638) int local638;
		@Pc(663) int local663;
		@Pc(667) int local667;
		@Pc(675) int local675;
		@Pc(680) int local680;
		@Pc(684) int local684;
		@Pc(688) int local688;
		@Pc(690) int local690;
		@Pc(819) int[] local819;
		@Pc(821) int local821;
		@Pc(825) int local825;
		@Pc(829) int local829;
		@Pc(831) int local831;
		@Pc(959) int local959;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray102.length) {
						local253 = this.anIntArrayArray102[local35];
						for (local255 = 0; local255 < local253.length; local255++) {
							local57 = local253[local255];
							if (this.aShortArray125 == null || (arg6 & this.aShortArray125[local57]) != 0) {
								this.anIntArray716[local57] -= Static369.anInt6644;
								this.anIntArray711[local57] -= Static481.anInt6919;
								this.anIntArray710[local57] -= Static37.anInt1097;
								if (arg4 != 0) {
									local63 = Class200_Sub1.lb[arg4];
									local376 = Class200_Sub1.anIntArray576[arg4];
									local398 = this.anIntArray716[local57] * local376 + this.anIntArray711[local57] * local63 + 32767 >> 15;
									this.anIntArray711[local57] = this.anIntArray711[local57] * local376 + 32767 - local63 * this.anIntArray716[local57] >> 15;
									this.anIntArray716[local57] = local398;
								}
								if (arg2 != 0) {
									local63 = Class200_Sub1.lb[arg2];
									local376 = Class200_Sub1.anIntArray576[arg2];
									local398 = local376 * this.anIntArray711[local57] + 32767 - local63 * this.anIntArray710[local57] >> 15;
									this.anIntArray710[local57] = this.anIntArray710[local57] * local376 + local63 * this.anIntArray711[local57] + 32767 >> 15;
									this.anIntArray711[local57] = local398;
								}
								if (arg3 != 0) {
									local63 = Class200_Sub1.lb[arg3];
									local376 = Class200_Sub1.anIntArray576[arg3];
									local398 = local376 * this.anIntArray716[local57] + local63 * this.anIntArray710[local57] + 32767 >> 15;
									this.anIntArray710[local57] = local376 * this.anIntArray710[local57] + 32767 - local63 * this.anIntArray716[local57] >> 15;
									this.anIntArray716[local57] = local398;
								}
								this.anIntArray716[local57] += Static369.anInt6644;
								this.anIntArray711[local57] += Static481.anInt6919;
								this.anIntArray710[local57] += Static37.anInt1097;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray102.length) {
							local55 = this.anIntArrayArray102[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray125 == null || (this.aShortArray125[local63] & arg6) != 0) {
									local376 = this.anIntArray709[local63];
									local398 = this.anIntArray709[local63 + 1];
									for (local428 = local376; local428 < local398; local428++) {
										local455 = this.aShortArray120[local428] - 1;
										if (local455 == -1) {
											break;
										}
										if (arg4 != 0) {
											local459 = Class200_Sub1.lb[arg4];
											local463 = Class200_Sub1.anIntArray576[arg4];
											local467 = local459 * this.aShortArray116[local455] + this.aShortArray123[local455] * local463 + 32767 >> 15;
											this.aShortArray116[local455] = (short) (this.aShortArray116[local455] * local463 + 32767 - this.aShortArray123[local455] * local459 >> 15);
											this.aShortArray123[local455] = (short) local467;
										}
										if (arg2 != 0) {
											local459 = Class200_Sub1.lb[arg2];
											local463 = Class200_Sub1.anIntArray576[arg2];
											local467 = this.aShortArray116[local455] * local463 + 32767 - local459 * this.aShortArray127[local455] >> 15;
											this.aShortArray127[local455] = (short) (this.aShortArray127[local455] * local463 + local459 * this.aShortArray116[local455] + 32767 >> 15);
											this.aShortArray116[local455] = (short) local467;
										}
										if (arg3 != 0) {
											local459 = Class200_Sub1.lb[arg3];
											local463 = Class200_Sub1.anIntArray576[arg3];
											local467 = local463 * this.aShortArray123[local455] + this.aShortArray127[local455] * local459 + 32767 >> 15;
											this.aShortArray127[local455] = (short) (local463 * this.aShortArray127[local455] + 32767 - local459 * this.aShortArray123[local455] >> 15);
											this.aShortArray123[local455] = (short) local467;
										}
									}
								}
							}
						}
					}
					this.method6743();
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local255 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static363.aBoolean484) {
					local376 = arg7[6] * Static37.anInt1097 + arg7[3] * Static481.anInt6919 + Static369.anInt6644 * arg7[0] + 16384 >> 15;
					local398 = Static369.anInt6644 * arg7[1] + Static481.anInt6919 * arg7[4] + Static37.anInt1097 * arg7[7] + 16384 >> 15;
					local376 += local255;
					local398 += local57;
					local428 = Static37.anInt1097 * arg7[8] + Static481.anInt6919 * arg7[5] + arg7[2] * Static369.anInt6644 + 16384 >> 15;
					Static481.anInt6919 = local398;
					local428 += local63;
					Static369.anInt6644 = local376;
					Static37.anInt1097 = local428;
					Static363.aBoolean484 = false;
				}
				@Pc(443) int[] local443 = new int[9];
				local398 = Class200_Sub1.anIntArray576[arg2];
				local428 = Class200_Sub1.lb[arg2];
				local455 = Class200_Sub1.anIntArray576[arg3];
				local459 = Class200_Sub1.lb[arg3];
				local463 = Class200_Sub1.anIntArray576[arg4];
				local467 = Class200_Sub1.lb[arg4];
				local475 = local463 * local428 + 16384 >> 15;
				local483 = local428 * local467 + 16384 >> 15;
				local443[6] = -local459 * local463 + local455 * local483 + 16384 >> 15;
				local443[3] = local467 * local398 + 16384 >> 15;
				local443[7] = local455 * local475 + local467 * local459 + 16384 >> 15;
				local443[4] = local463 * local398 + 16384 >> 15;
				local443[2] = local459 * local398 + 16384 >> 15;
				local443[1] = local475 * local459 + -local455 * local467 + 16384 >> 15;
				local443[5] = -local428;
				local443[0] = local459 * local483 + local455 * local463 + 16384 >> 15;
				local443[8] = local398 * local455 + 16384 >> 15;
				@Pc(613) int local613 = -Static369.anInt6644 * local443[0] + local443[1] * -Static481.anInt6919 + local443[2] * -Static37.anInt1097 + 16384 >> 15;
				local638 = -Static369.anInt6644 * local443[3] + local443[4] * -Static481.anInt6919 + -Static37.anInt1097 * local443[5] + 16384 >> 15;
				local663 = local443[8] * -Static37.anInt1097 + local443[6] * -Static369.anInt6644 + -Static481.anInt6919 * local443[7] + 16384 >> 15;
				local667 = Static369.anInt6644 + local613;
				@Pc(671) int local671 = Static481.anInt6919 + local638;
				local675 = Static37.anInt1097 + local663;
				@Pc(678) int[] local678 = new int[9];
				for (local680 = 0; local680 < 3; local680++) {
					for (local684 = 0; local684 < 3; local684++) {
						local688 = 0;
						for (local690 = 0; local690 < 3; local690++) {
							local688 += arg7[local690 + local684 * 3] * local443[local680 * 3 + local690];
						}
						local678[local684 + local680 * 3] = local688 + 16384 >> 15;
					}
				}
				local684 = local443[2] * local63 + local57 * local443[1] + local443[0] * local255 + 16384 >> 15;
				local688 = local443[5] * local63 + local443[4] * local57 + local255 * local443[3] + 16384 >> 15;
				local690 = local443[8] * local63 + local57 * local443[7] + local255 * local443[6] + 16384 >> 15;
				local688 += local671;
				local684 += local667;
				local690 += local675;
				local819 = new int[9];
				for (local821 = 0; local821 < 3; local821++) {
					for (local825 = 0; local825 < 3; local825++) {
						local829 = 0;
						for (local831 = 0; local831 < 3; local831++) {
							local829 += local678[local831 * 3 + local825] * arg7[local821 * 3 + local831];
						}
						local819[local821 * 3 + local825] = local829 + 16384 >> 15;
					}
				}
				local825 = local690 * arg7[2] + arg7[1] * local688 + arg7[0] * local684 + 16384 >> 15;
				local829 = local688 * arg7[4] + local684 * arg7[3] + local690 * arg7[5] + 16384 >> 15;
				local831 = arg7[6] * local684 + local688 * arg7[7] + arg7[8] * local690 + 16384 >> 15;
				local825 += local29;
				local829 += local35;
				local831 += local41;
				for (local959 = 0; local959 < local8; local959++) {
					@Pc(965) int local965 = arg1[local959];
					if (this.anIntArrayArray102.length > local965) {
						@Pc(979) int[] local979 = this.anIntArrayArray102[local965];
						for (@Pc(981) int local981 = 0; local981 < local979.length; local981++) {
							@Pc(987) int local987 = local979[local981];
							if (this.aShortArray125 == null || (arg6 & this.aShortArray125[local987]) != 0) {
								@Pc(1031) int local1031 = local819[2] * this.anIntArray710[local987] + this.anIntArray711[local987] * local819[1] + this.anIntArray716[local987] * local819[0] + 16384 >> 15;
								@Pc(1062) int local1062 = local819[4] * this.anIntArray711[local987] + local819[3] * this.anIntArray716[local987] + this.anIntArray710[local987] * local819[5] + 16384 >> 15;
								@Pc(1066) int local1066 = local1062 + local829;
								@Pc(1070) int local1070 = local1031 + local825;
								@Pc(1101) int local1101 = local819[7] * this.anIntArray711[local987] + this.anIntArray716[local987] * local819[6] + this.anIntArray710[local987] * local819[8] + 16384 >> 15;
								@Pc(1105) int local1105 = local1101 + local831;
								this.anIntArray716[local987] = local1070;
								this.anIntArray711[local987] = local1066;
								this.anIntArray710[local987] = local1105;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2601) Class302 local2601;
			@Pc(2484) boolean local2484;
			@Pc(2596) Class44 local2596;
			if (arg0 == 5) {
				if (this.anIntArrayArray101 != null) {
					local2484 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray101.length > local41) {
							local55 = this.anIntArrayArray101[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray117 == null || (this.aShortArray117[local63] & arg6) != 0) {
									local376 = arg2 * 8 + (this.aByteArray100[local63] & 0xFF);
									if (local376 < 0) {
										local376 = 0;
									} else if (local376 > 255) {
										local376 = 255;
									}
									this.aByteArray100[local63] = (byte) local376;
								}
							}
							local2484 |= local55.length > 0;
						}
					}
					if (local2484) {
						if (this.aClass44Array1 != null) {
							for (local41 = 0; local41 < this.anInt7590; local41++) {
								local2596 = this.aClass44Array1[local41];
								local2601 = this.aClass302Array1[local41];
								local2601.anInt8898 = local2601.anInt8898 & 0xFFFFFF | 255 - (this.aByteArray100[local2596.anInt1423] & 0xFF) << 24;
							}
						}
						this.method6757();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray101 != null) {
					local2484 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray101.length > local41) {
							local55 = this.anIntArrayArray101[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray117 == null || (this.aShortArray117[local63] & arg6) != 0) {
									local376 = this.aShortArray126[local63] & 0xFFFF;
									local398 = local376 >> 10 & 0x3F;
									local428 = local376 >> 7 & 0x7;
									local455 = local376 & 0x7F;
									local428 += arg3 / 4;
									@Pc(2710) int local2710 = arg2 + local398 & 0x3F;
									local455 += arg4;
									if (local428 < 0) {
										local428 = 0;
									} else if (local428 > 7) {
										local428 = 7;
									}
									if (local455 < 0) {
										local455 = 0;
									} else if (local455 > 127) {
										local455 = 127;
									}
									this.aShortArray126[local63] = (short) (local455 | local428 << 7 | local2710 << 10);
								}
							}
							local2484 |= local55.length > 0;
						}
					}
					if (local2484) {
						if (this.aClass44Array1 != null) {
							for (local41 = 0; local41 < this.anInt7590; local41++) {
								local2596 = this.aClass44Array1[local41];
								local2601 = this.aClass302Array1[local41];
								local2601.anInt8898 = local2601.anInt8898 & 0xFF000000 | Static107.anIntArray176[this.aShortArray126[local2596.anInt1423] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method6757();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray100 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray100.length) {
							local253 = this.anIntArrayArray100[local35];
							for (local255 = 0; local255 < local253.length; local255++) {
								local2601 = this.aClass302Array1[local253[local255]];
								local2601.anInt8906 += arg2;
								local2601.anInt8907 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray100 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray100.length) {
							local253 = this.anIntArrayArray100[local35];
							for (local255 = 0; local255 < local253.length; local255++) {
								local2601 = this.aClass302Array1[local253[local255]];
								local2601.anInt8902 = arg3 * local2601.anInt8902 >> 7;
								local2601.anInt8900 = local2601.anInt8900 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray100 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray100.length > local35) {
						local253 = this.anIntArrayArray100[local35];
						for (local255 = 0; local255 < local253.length; local255++) {
							local2601 = this.aClass302Array1[local253[local255]];
							local2601.anInt8904 = local2601.anInt8904 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray102.length) {
					local253 = this.anIntArrayArray102[local35];
					for (local255 = 0; local255 < local253.length; local255++) {
						local57 = local253[local255];
						if (this.aShortArray125 == null || (this.aShortArray125[local57] & arg6) != 0) {
							this.anIntArray716[local57] -= Static369.anInt6644;
							this.anIntArray711[local57] -= Static481.anInt6919;
							this.anIntArray710[local57] -= Static37.anInt1097;
							this.anIntArray716[local57] = arg2 * this.anIntArray716[local57] >> 7;
							this.anIntArray711[local57] = this.anIntArray711[local57] * arg3 >> 7;
							this.anIntArray710[local57] = this.anIntArray710[local57] * arg4 >> 7;
							this.anIntArray716[local57] += Static369.anInt6644;
							this.anIntArray711[local57] += Static481.anInt6919;
							this.anIntArray710[local57] += Static37.anInt1097;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local255 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static363.aBoolean484) {
				local376 = Static37.anInt1097 * arg7[6] + arg7[3] * Static481.anInt6919 + arg7[0] * Static369.anInt6644 + 16384 >> 15;
				local398 = arg7[1] * Static369.anInt6644 + arg7[4] * Static481.anInt6919 + Static37.anInt1097 * arg7[7] + 16384 >> 15;
				local398 += local57;
				local376 += local255;
				local428 = Static37.anInt1097 * arg7[8] + arg7[5] * Static481.anInt6919 + arg7[2] * Static369.anInt6644 + 16384 >> 15;
				Static369.anInt6644 = local376;
				Static481.anInt6919 = local398;
				local428 += local63;
				Static37.anInt1097 = local428;
				Static363.aBoolean484 = false;
			}
			local376 = arg2 << 15 >> 7;
			local398 = arg3 << 15 >> 7;
			local428 = arg4 << 15 >> 7;
			local455 = -Static369.anInt6644 * local376 + 16384 >> 15;
			local459 = local398 * -Static481.anInt6919 + 16384 >> 15;
			local463 = local428 * -Static37.anInt1097 + 16384 >> 15;
			local467 = local455 + Static369.anInt6644;
			local475 = local459 + Static481.anInt6919;
			local483 = local463 + Static37.anInt1097;
			@Pc(1879) int[] local1879 = new int[] { local376 * arg7[0] + 16384 >> 15, arg7[3] * local376 + 16384 >> 15, local376 * arg7[6] + 16384 >> 15, arg7[1] * local398 + 16384 >> 15, arg7[4] * local398 + 16384 >> 15, local398 * arg7[7] + 16384 >> 15, arg7[2] * local428 + 16384 >> 15, arg7[5] * local428 + 16384 >> 15, arg7[8] * local428 + 16384 >> 15 };
			local638 = local255 * local376 + 16384 >> 15;
			local663 = local398 * local57 + 16384 >> 15;
			@Pc(2007) int local2007 = local663 + local475;
			local667 = local428 * local63 + 16384 >> 15;
			@Pc(2019) int local2019 = local638 + local467;
			@Pc(2023) int local2023 = local667 + local483;
			@Pc(2026) int[] local2026 = new int[9];
			@Pc(2032) int local2032;
			for (local675 = 0; local675 < 3; local675++) {
				for (local2032 = 0; local2032 < 3; local2032++) {
					local680 = 0;
					for (local684 = 0; local684 < 3; local684++) {
						local680 += local1879[local2032 + local684 * 3] * arg7[local684 + local675 * 3];
					}
					local2026[local675 * 3 + local2032] = local680 + 16384 >> 15;
				}
			}
			local2032 = arg7[0] * local2019 + local2007 * arg7[1] + arg7[2] * local2023 + 16384 >> 15;
			local680 = arg7[3] * local2019 + local2007 * arg7[4] + arg7[5] * local2023 + 16384 >> 15;
			local684 = local2023 * arg7[8] + local2007 * arg7[7] + arg7[6] * local2019 + 16384 >> 15;
			local2032 += local29;
			local680 += local35;
			local684 += local41;
			for (local688 = 0; local688 < local8; local688++) {
				local690 = arg1[local688];
				if (local690 < this.anIntArrayArray102.length) {
					local819 = this.anIntArrayArray102[local690];
					for (local821 = 0; local821 < local819.length; local821++) {
						local825 = local819[local821];
						if (this.aShortArray125 == null || (arg6 & this.aShortArray125[local825]) != 0) {
							local829 = this.anIntArray716[local825] * local2026[0] + local2026[1] * this.anIntArray711[local825] + local2026[2] * this.anIntArray710[local825] + 16384 >> 15;
							local831 = this.anIntArray716[local825] * local2026[3] + this.anIntArray711[local825] * local2026[4] + local2026[5] * this.anIntArray710[local825] + 16384 >> 15;
							@Pc(2269) int local2269 = local831 + local680;
							@Pc(2273) int local2273 = local829 + local2032;
							local959 = local2026[8] * this.anIntArray710[local825] + local2026[6] * this.anIntArray716[local825] + local2026[7] * this.anIntArray711[local825] + 16384 >> 15;
							this.anIntArray716[local825] = local2273;
							@Pc(2313) int local2313 = local959 + local684;
							this.anIntArray711[local825] = local2269;
							this.anIntArray710[local825] = local2313;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(Z)V")
	private void method6743() {
		if ((this.anInt7580 & 0x37) == 0) {
			if (this.aClass204_2 != null) {
				this.aClass204_2.aBoolean465 = false;
			}
		} else if (this.aClass204_3 != null) {
			this.aClass204_3.aBoolean465 = false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	@Override
	public void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.lb) {
			this.method6751();
		}
		@Pc(17) int local17 = arg4 + this.anInt7582;
		@Pc(22) int local22 = this.anInt7538 + arg4;
		@Pc(27) int local27 = arg6 + this.anInt7542;
		@Pc(32) int local32 = this.anInt7591 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || arg2.anInt9577 <= arg2.anInt9576 + local22 >> arg2.anInt9573 || local27 < 0 || local32 + arg2.anInt9576 >> arg2.anInt9573 >= arg2.anInt9575)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || local22 + arg3.anInt9576 >> arg3.anInt9573 >= arg3.anInt9577 || local27 < 0 || arg3.anInt9576 + local32 >> arg3.anInt9573 >= arg3.anInt9575) {
				return;
			}
		} else {
			local17 >>= arg2.anInt9573;
			local22 = local22 + arg2.anInt9576 - 1 >> arg2.anInt9573;
			local27 >>= arg2.anInt9573;
			local32 = local32 + arg2.anInt9576 - 1 >> arg2.anInt9573;
			if (arg5 == arg2.ba(local17, local27) && arg5 == arg2.ba(local22, local27) && arg5 == arg2.ba(local17, local32) && arg2.ba(local22, local32) == arg5) {
				return;
			}
		}
		@Pc(191) int local191;
		if (arg0 == 1) {
			for (local191 = 0; local191 < this.anInt7603; local191++) {
				this.anIntArray711[local191] -= arg5 - arg2.aa(arg4 + this.anIntArray716[local191], arg6 + this.anIntArray710[local191]);
			}
		} else {
			@Pc(243) int local243;
			@Pc(254) int local254;
			if (arg0 == 2) {
				local191 = this.anInt7558;
				if (local191 == 0) {
					return;
				}
				for (local243 = 0; local243 < this.anInt7603; local243++) {
					local254 = (this.anIntArray711[local243] << 16) / local191;
					if (arg1 > local254) {
						this.anIntArray711[local243] += (arg1 - local254) * (-arg5 + arg2.aa(arg4 + this.anIntArray716[local243], this.anIntArray710[local243] + arg6)) / arg1;
					}
				}
			} else {
				@Pc(334) int local334;
				if (arg0 == 3) {
					local191 = (arg1 & 0xFF) * 4;
					local243 = (arg1 >> 8 & 0xFF) * 4;
					local254 = (arg1 >> 16 & 0xFF) << 6;
					local334 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local191 >> 1) < 0 || arg2.anInt9577 << arg2.anInt9573 <= arg2.anInt9576 + (local191 >> 1) + arg4 || arg6 - (local243 >> 1) < 0 || arg6 + (local243 >> 1) + arg2.anInt9576 >= arg2.anInt9575 << arg2.anInt9573) {
						return;
					}
					this.method6774(local334, local254, arg6, local243, arg4, arg2, local191, arg5);
				} else if (arg0 == 4) {
					local191 = this.anInt7562 - this.anInt7558;
					for (local243 = 0; local243 < this.anInt7603; local243++) {
						this.anIntArray711[local243] = this.anIntArray711[local243] + arg3.aa(this.anIntArray716[local243] + arg4, this.anIntArray710[local243] + arg6) + local191 - arg5;
					}
				} else if (arg0 == 5) {
					local191 = this.anInt7562 - this.anInt7558;
					for (local243 = 0; local243 < this.anInt7603; local243++) {
						local254 = this.anIntArray716[local243] + arg4;
						local334 = arg6 + this.anIntArray710[local243];
						@Pc(339) int local339 = arg2.aa(local254, local334);
						@Pc(344) int local344 = arg3.aa(local254, local334);
						@Pc(348) int local348 = local339 - local344;
						this.anIntArray711[local243] = ((this.anIntArray711[local243] << 8) / local191 * local348 >> 8) + local339 - arg5;
					}
				}
			}
		}
		this.method6754();
		this.lb = false;
	}

	@OriginalMember(owner = "client!rw", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		if (!this.lb) {
			this.method6751();
		}
		return this.anInt7558;
	}

	@OriginalMember(owner = "client!rw", name = "M", descriptor = "()I")
	@Override
	public int M() {
		return this.aShort102;
	}

	@OriginalMember(owner = "client!rw", name = "ea", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			local14 = arg4 << 4;
			local18 = arg3 << 4;
			local22 = arg2 << 4;
			Static369.anInt6644 = 0;
			local26 = 0;
			Static481.anInt6919 = 0;
			Static37.anInt1097 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray102.length) {
					local48 = this.anIntArrayArray102[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static369.anInt6644 += this.anIntArray716[local56];
						Static481.anInt6919 += this.anIntArray711[local56];
						local26++;
						Static37.anInt1097 += this.anIntArray710[local56];
					}
				}
			}
			if (local26 <= 0) {
				Static37.anInt1097 = local14;
				Static481.anInt6919 = local18;
				Static369.anInt6644 = local22;
			} else {
				Static369.anInt6644 = Static369.anInt6644 / local26 + local22;
				Static37.anInt1097 = Static37.anInt1097 / local26 + local14;
				Static481.anInt6919 = Static481.anInt6919 / local26 + local18;
			}
			return;
		}
		@Pc(154) int[] local154;
		@Pc(156) int local156;
		if (arg0 == 1) {
			local14 = arg4 << 4;
			local18 = arg3 << 4;
			local22 = arg2 << 4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray102.length) {
					local154 = this.anIntArrayArray102[local32];
					for (local156 = 0; local156 < local154.length; local156++) {
						local50 = local154[local156];
						this.anIntArray716[local50] += local22;
						this.anIntArray711[local50] += local18;
						this.anIntArray710[local50] += local14;
					}
				}
			}
			return;
		}
		@Pc(270) int local270;
		@Pc(288) int local288;
		@Pc(751) int local751;
		@Pc(760) int local760;
		if (arg0 == 2) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray102.length) {
					local154 = this.anIntArrayArray102[local32];
					if ((arg5 & 0x1) == 0) {
						for (local156 = 0; local156 < local154.length; local156++) {
							local50 = local154[local156];
							this.anIntArray716[local50] -= Static369.anInt6644;
							this.anIntArray711[local50] -= Static481.anInt6919;
							this.anIntArray710[local50] -= Static37.anInt1097;
							if (arg4 != 0) {
								local56 = Class200_Sub1.lb[arg4];
								local270 = Class200_Sub1.anIntArray576[arg4];
								local288 = this.anIntArray716[local50] * local270 + this.anIntArray711[local50] * local56 + 32767 >> 15;
								this.anIntArray711[local50] = local270 * this.anIntArray711[local50] + 32767 - local56 * this.anIntArray716[local50] >> 15;
								this.anIntArray716[local50] = local288;
							}
							if (arg2 != 0) {
								local56 = Class200_Sub1.lb[arg2];
								local270 = Class200_Sub1.anIntArray576[arg2];
								local288 = local270 * this.anIntArray711[local50] + 32767 - this.anIntArray710[local50] * local56 >> 15;
								this.anIntArray710[local50] = this.anIntArray710[local50] * local270 + this.anIntArray711[local50] * local56 + 32767 >> 15;
								this.anIntArray711[local50] = local288;
							}
							if (arg3 != 0) {
								local56 = Class200_Sub1.lb[arg3];
								local270 = Class200_Sub1.anIntArray576[arg3];
								local288 = this.anIntArray716[local50] * local270 + this.anIntArray710[local50] * local56 + 32767 >> 15;
								this.anIntArray710[local50] = this.anIntArray710[local50] * local270 + 32767 - local56 * this.anIntArray716[local50] >> 15;
								this.anIntArray716[local50] = local288;
							}
							this.anIntArray716[local50] += Static369.anInt6644;
							this.anIntArray711[local50] += Static481.anInt6919;
							this.anIntArray710[local50] += Static37.anInt1097;
						}
					} else {
						for (local156 = 0; local156 < local154.length; local156++) {
							local50 = local154[local156];
							this.anIntArray716[local50] -= Static369.anInt6644;
							this.anIntArray711[local50] -= Static481.anInt6919;
							this.anIntArray710[local50] -= Static37.anInt1097;
							if (arg2 != 0) {
								local56 = Class200_Sub1.lb[arg2];
								local270 = Class200_Sub1.anIntArray576[arg2];
								local288 = this.anIntArray711[local50] * local270 + 32767 - local56 * this.anIntArray710[local50] >> 15;
								this.anIntArray710[local50] = local270 * this.anIntArray710[local50] + this.anIntArray711[local50] * local56 + 32767 >> 15;
								this.anIntArray711[local50] = local288;
							}
							if (arg4 != 0) {
								local56 = Class200_Sub1.lb[arg4];
								local270 = Class200_Sub1.anIntArray576[arg4];
								local288 = this.anIntArray711[local50] * local56 + this.anIntArray716[local50] * local270 + 32767 >> 15;
								this.anIntArray711[local50] = local270 * this.anIntArray711[local50] + 32767 - local56 * this.anIntArray716[local50] >> 15;
								this.anIntArray716[local50] = local288;
							}
							if (arg3 != 0) {
								local56 = Class200_Sub1.lb[arg3];
								local270 = Class200_Sub1.anIntArray576[arg3];
								local288 = local270 * this.anIntArray716[local50] + local56 * this.anIntArray710[local50] + 32767 >> 15;
								this.anIntArray710[local50] = this.anIntArray710[local50] * local270 + 32767 - this.anIntArray716[local50] * local56 >> 15;
								this.anIntArray716[local50] = local288;
							}
							this.anIntArray716[local50] += Static369.anInt6644;
							this.anIntArray711[local50] += Static481.anInt6919;
							this.anIntArray710[local50] += Static37.anInt1097;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray102.length > local38) {
						local48 = this.anIntArrayArray102[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local270 = this.anIntArray709[local56];
							local288 = this.anIntArray709[local56 + 1];
							for (local751 = local270; local751 < local288; local751++) {
								local760 = this.aShortArray120[local751] - 1;
								if (local760 == -1) {
									break;
								}
								@Pc(769) int local769;
								@Pc(773) int local773;
								@Pc(791) int local791;
								if (arg4 != 0) {
									local769 = Class200_Sub1.lb[arg4];
									local773 = Class200_Sub1.anIntArray576[arg4];
									local791 = local769 * this.aShortArray116[local760] + this.aShortArray123[local760] * local773 + 32767 >> 15;
									this.aShortArray116[local760] = (short) (this.aShortArray116[local760] * local773 + 32767 - this.aShortArray123[local760] * local769 >> 15);
									this.aShortArray123[local760] = (short) local791;
								}
								if (arg2 != 0) {
									local769 = Class200_Sub1.lb[arg2];
									local773 = Class200_Sub1.anIntArray576[arg2];
									local791 = local773 * this.aShortArray116[local760] + 32767 - this.aShortArray127[local760] * local769 >> 15;
									this.aShortArray127[local760] = (short) (this.aShortArray127[local760] * local773 + this.aShortArray116[local760] * local769 + 32767 >> 15);
									this.aShortArray116[local760] = (short) local791;
								}
								if (arg3 != 0) {
									local769 = Class200_Sub1.lb[arg3];
									local773 = Class200_Sub1.anIntArray576[arg3];
									local791 = this.aShortArray123[local760] * local773 + local769 * this.aShortArray127[local760] + 32767 >> 15;
									this.aShortArray127[local760] = (short) (local773 * this.aShortArray127[local760] + 32767 - this.aShortArray123[local760] * local769 >> 15);
									this.aShortArray123[local760] = (short) local791;
								}
							}
						}
					}
				}
				this.method6743();
			}
		} else if (arg0 == 3) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray102.length) {
					local154 = this.anIntArrayArray102[local32];
					for (local156 = 0; local156 < local154.length; local156++) {
						local50 = local154[local156];
						this.anIntArray716[local50] -= Static369.anInt6644;
						this.anIntArray711[local50] -= Static481.anInt6919;
						this.anIntArray710[local50] -= Static37.anInt1097;
						this.anIntArray716[local50] = arg2 * this.anIntArray716[local50] >> 7;
						this.anIntArray711[local50] = this.anIntArray711[local50] * arg3 >> 7;
						this.anIntArray710[local50] = this.anIntArray710[local50] * arg4 >> 7;
						this.anIntArray716[local50] += Static369.anInt6644;
						this.anIntArray711[local50] += Static481.anInt6919;
						this.anIntArray710[local50] += Static37.anInt1097;
					}
				}
			}
		} else {
			@Pc(1189) Class302 local1189;
			@Pc(1085) boolean local1085;
			@Pc(1184) Class44 local1184;
			if (arg0 == 5) {
				if (this.anIntArrayArray101 != null) {
					local1085 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray101.length > local38) {
							local48 = this.anIntArrayArray101[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local270 = (this.aByteArray100[local56] & 0xFF) + arg2 * 8;
								if (local270 < 0) {
									local270 = 0;
								} else if (local270 > 255) {
									local270 = 255;
								}
								this.aByteArray100[local56] = (byte) local270;
							}
							local1085 |= local48.length > 0;
						}
					}
					if (local1085) {
						if (this.aClass44Array1 != null) {
							for (local38 = 0; local38 < this.anInt7590; local38++) {
								local1184 = this.aClass44Array1[local38];
								local1189 = this.aClass302Array1[local38];
								local1189.anInt8898 = 255 - (this.aByteArray100[local1184.anInt1423] & 0xFF) << 24 | local1189.anInt8898 & 0xFFFFFF;
							}
						}
						this.method6757();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray101 != null) {
					local1085 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray101.length) {
							local48 = this.anIntArrayArray101[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local270 = this.aShortArray126[local56] & 0xFFFF;
								local288 = local270 >> 10 & 0x3F;
								local751 = local270 >> 7 & 0x7;
								@Pc(1276) int local1276 = local288 + arg2 & 0x3F;
								local751 += arg3 / 4;
								local760 = local270 & 0x7F;
								if (local751 < 0) {
									local751 = 0;
								} else if (local751 > 7) {
									local751 = 7;
								}
								local760 += arg4;
								if (local760 < 0) {
									local760 = 0;
								} else if (local760 > 127) {
									local760 = 127;
								}
								this.aShortArray126[local56] = (short) (local760 | local751 << 7 | local1276 << 10);
							}
							local1085 |= local48.length > 0;
						}
					}
					if (local1085) {
						if (this.aClass44Array1 != null) {
							for (local38 = 0; local38 < this.anInt7590; local38++) {
								local1184 = this.aClass44Array1[local38];
								local1189 = this.aClass302Array1[local38];
								local1189.anInt8898 = local1189.anInt8898 & 0xFF000000 | Static107.anIntArray176[this.aShortArray126[local1184.anInt1423] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method6757();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray100 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray100.length > local32) {
							local154 = this.anIntArrayArray100[local32];
							for (local156 = 0; local156 < local154.length; local156++) {
								local1189 = this.aClass302Array1[local154[local156]];
								local1189.anInt8907 += arg3;
								local1189.anInt8906 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray100 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray100.length > local32) {
							local154 = this.anIntArrayArray100[local32];
							for (local156 = 0; local156 < local154.length; local156++) {
								local1189 = this.aClass302Array1[local154[local156]];
								local1189.anInt8900 = local1189.anInt8900 * arg2 >> 7;
								local1189.anInt8902 = local1189.anInt8902 * arg3 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray100 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray100.length > local32) {
						local154 = this.anIntArrayArray100[local32];
						for (local156 = 0; local156 < local154.length; local156++) {
							local1189 = this.aClass302Array1[local154[local156]];
							local1189.anInt8904 = local1189.anInt8904 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method6769(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class97_Sub2 local8 = (Class97_Sub2) arg0;
		if (this.anInt7598 == 0 || local8.anInt7598 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt7603;
		@Pc(24) int[] local24 = local8.anIntArray716;
		@Pc(27) int[] local27 = local8.anIntArray711;
		@Pc(30) int[] local30 = local8.anIntArray710;
		@Pc(33) short[] local33 = local8.aShortArray123;
		@Pc(36) short[] local36 = local8.aShortArray116;
		@Pc(39) short[] local39 = local8.aShortArray127;
		@Pc(42) byte[] local42 = local8.aByteArray99;
		@Pc(47) short[] local47;
		@Pc(51) short[] local51;
		@Pc(49) short[] local49;
		@Pc(53) byte[] local53;
		if (this.aClass282_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local47 = this.aClass282_1.aShortArray141;
			local49 = this.aClass282_1.aShortArray142;
			local51 = this.aClass282_1.aShortArray143;
			local53 = this.aClass282_1.aByteArray113;
		}
		@Pc(78) short[] local78;
		@Pc(86) short[] local86;
		@Pc(90) short[] local90;
		@Pc(82) byte[] local82;
		if (local8.aClass282_1 == null) {
			local86 = null;
			local90 = null;
			local78 = null;
			local82 = null;
		} else {
			local78 = local8.aClass282_1.aShortArray141;
			local82 = local8.aClass282_1.aByteArray113;
			local86 = local8.aClass282_1.aShortArray143;
			local90 = local8.aClass282_1.aShortArray142;
		}
		@Pc(103) int[] local103 = local8.anIntArray709;
		@Pc(106) short[] local106 = local8.aShortArray120;
		if (!local8.lb) {
			local8.method6751();
		}
		@Pc(115) int local115 = local8.anInt7558;
		@Pc(118) int local118 = local8.anInt7562;
		@Pc(121) int local121 = local8.anInt7582;
		@Pc(124) int local124 = local8.anInt7538;
		@Pc(127) int local127 = local8.anInt7542;
		@Pc(130) int local130 = local8.anInt7591;
		for (@Pc(132) int local132 = 0; local132 < this.anInt7603; local132++) {
			@Pc(142) int local142 = this.anIntArray711[local132] - arg2;
			if (local142 >= local115 && local118 >= local142) {
				@Pc(158) int local158 = this.anIntArray716[local132] - arg1;
				if (local121 <= local158 && local158 <= local124) {
					@Pc(174) int local174 = this.anIntArray710[local132] - arg3;
					if (local127 <= local174 && local130 >= local174) {
						@Pc(188) int local188 = -1;
						@Pc(193) int local193 = this.anIntArray709[local132];
						@Pc(200) int local200 = this.anIntArray709[local132 + 1];
						for (@Pc(202) int local202 = local193; local202 < local200; local202++) {
							local188 = this.aShortArray120[local202] - 1;
							if (local188 == -1 || this.aByteArray99[local188] != 0) {
								break;
							}
						}
						if (local188 != -1) {
							for (@Pc(231) int local231 = 0; local231 < local21; local231++) {
								if (local24[local231] == local158 && local30[local231] == local174 && local142 == local27[local231]) {
									local193 = local103[local231];
									@Pc(254) int local254 = -1;
									local200 = local103[local231 + 1];
									for (@Pc(262) int local262 = local193; local262 < local200; local262++) {
										local254 = local106[local262] - 1;
										if (local254 == -1 || local42[local254] != 0) {
											break;
										}
									}
									if (local254 != -1) {
										if (local47 == null) {
											this.aClass282_1 = new Class282();
											local47 = this.aClass282_1.aShortArray141 = Static8.method396(this.aShortArray123);
											local51 = this.aClass282_1.aShortArray143 = Static8.method396(this.aShortArray116);
											local49 = this.aClass282_1.aShortArray142 = Static8.method396(this.aShortArray127);
											local53 = this.aClass282_1.aByteArray113 = Static236.method4200(this.aByteArray99);
										}
										if (local78 == null) {
											@Pc(343) Class282 local343 = local8.aClass282_1 = new Class282();
											local78 = local343.aShortArray141 = Static8.method396(local33);
											local86 = local343.aShortArray143 = Static8.method396(local36);
											local90 = local343.aShortArray142 = Static8.method396(local39);
											local82 = local343.aByteArray113 = Static236.method4200(local42);
										}
										@Pc(376) short local376 = this.aShortArray123[local188];
										@Pc(381) short local381 = this.aShortArray116[local188];
										@Pc(386) short local386 = this.aShortArray127[local188];
										@Pc(391) byte local391 = this.aByteArray99[local188];
										local200 = local103[local231 + 1];
										local193 = local103[local231];
										@Pc(411) int local411;
										for (@Pc(403) int local403 = local193; local403 < local200; local403++) {
											local411 = local106[local403] - 1;
											if (local411 == -1) {
												break;
											}
											if (local82[local411] != 0) {
												local78[local411] += local376;
												local86[local411] += local381;
												local90[local411] += local386;
												local82[local411] += local391;
											}
										}
										local376 = local33[local254];
										local386 = local39[local254];
										local381 = local36[local254];
										local193 = this.anIntArray709[local132];
										local391 = local42[local254];
										local200 = this.anIntArray709[local132 + 1];
										for (local411 = local193; local411 < local200; local411++) {
											@Pc(501) int local501 = this.aShortArray120[local411] - 1;
											if (local501 == -1) {
												break;
											}
											if (local53[local501] != 0) {
												local47[local501] += local376;
												local51[local501] += local381;
												local49[local501] += local386;
												local53[local501] += local391;
											}
										}
										local8.method6743();
										this.method6743();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "()Z")
	@Override
	public boolean method6784() {
		if (this.aShortArray124 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray124.length; local12++) {
			if (this.aShortArray124[local12] != -1 && !this.aClass4_Sub2_15.anInterface13_13.method5788(this.aShortArray124[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rw", name = "X", descriptor = "()V")
	@Override
	public void X() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7603; local7++) {
			this.anIntArray710[local7] = -this.anIntArray710[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt7541; local29++) {
			this.aShortArray127[local29] = (short) -this.aShortArray127[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt7598; local52++) {
			@Pc(59) short local59 = this.aShortArray122[local52];
			this.aShortArray122[local52] = this.aShortArray119[local52];
			this.aShortArray119[local52] = local59;
		}
		this.method6754();
		this.method6743();
		this.method6756();
		this.lb = false;
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "()V")
	@Override
	public void method6777() {
		if (this.anInt7541 > 0 && this.anInt7532 > 0) {
			this.method6752();
			this.method6745();
			this.method6740();
		}
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "()[Lclient!dl;")
	@Override
	public Class68[] method6782() {
		return this.aClass68Array6;
	}

	@OriginalMember(owner = "client!rw", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		return this.anInt7581;
	}

	@OriginalMember(owner = "client!rw", name = "n", descriptor = "()I")
	@Override
	public int n() {
		if (!this.lb) {
			this.method6751();
		}
		return this.anInt7562;
	}

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "(I)Z")
	private boolean method6745() {
		if (this.aClass129_1.aBoolean309) {
			return true;
		}
		if (this.aClass129_1.anInterface9_5 == null) {
			this.aClass129_1.anInterface9_5 = this.aClass4_Sub2_15.method7227(this.aBoolean567);
		}
		@Pc(28) Interface9 local28 = this.aClass129_1.anInterface9_5;
		local28.method7607(this.anInt7532 * 6);
		@Pc(40) Buffer local40 = local28.method7613();
		if (local40 != null) {
			@Pc(53) Stream local53 = this.aClass4_Sub2_15.method7263(local40);
			@Pc(57) int local57;
			if (Stream.a()) {
				for (local57 = 0; local57 < this.anInt7532; local57++) {
					local53.c(this.aShortArray122[local57]);
					local53.c(this.aShortArray128[local57]);
					local53.c(this.aShortArray119[local57]);
				}
			} else {
				for (local57 = 0; local57 < this.anInt7532; local57++) {
					local53.d(this.aShortArray122[local57]);
					local53.d(this.aShortArray128[local57]);
					local53.d(this.aShortArray119[local57]);
				}
			}
			local53.b();
			if (local28.method7614()) {
				this.aClass129_1.anInterface9_4 = local28;
				this.aBoolean566 = true;
				this.aClass129_1.aBoolean309 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rw", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		this.aShort101 = (short) arg0;
		this.method6754();
		this.method6743();
	}

	@OriginalMember(owner = "client!rw", name = "OA", descriptor = "(I)V")
	@Override
	public void OA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class200_Sub1.lb[arg0];
		@Pc(13) int local13 = Class200_Sub1.anIntArray576[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7603; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray716[local15] + local9 * this.anIntArray710[local15] >> 15;
			this.anIntArray710[local15] = this.anIntArray710[local15] * local13 - local9 * this.anIntArray716[local15] >> 15;
			this.anIntArray716[local15] = local33;
		}
		this.method6754();
		this.lb = false;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V")
	public void method6746() {
		if (this.aClass204_4 != null) {
			this.aClass204_4.method5627();
		}
		if (this.aClass204_1 != null) {
			this.aClass204_1.method5627();
		}
		if (this.aClass204_2 != null) {
			this.aClass204_2.method5627();
		}
		if (this.aClass204_3 != null) {
			this.aClass204_3.method5627();
		}
		if (this.aClass129_1 != null) {
			this.aClass129_1.method3535();
		}
	}

	@OriginalMember(owner = "client!rw", name = "m", descriptor = "(I)V")
	@Override
	public void m(@OriginalArg(0) int arg0) {
		if (this.aClass204_4 != null) {
			this.aClass204_4.aBoolean464 = Static263.method4733(arg0, this.anInt7580);
		}
		if (this.aClass204_1 != null) {
			this.aClass204_1.aBoolean464 = Static514.method7861(this.anInt7580, arg0);
		}
		if (this.aClass204_2 != null) {
			this.aClass204_2.aBoolean464 = Static461.method7923(this.anInt7580, arg0);
		}
		if (this.aClass204_3 != null) {
			this.aClass204_3.aBoolean464 = Static157.method2875(this.anInt7580, arg0);
		}
		this.anInt7581 = arg0;
		this.aBoolean566 = true;
		if (this.aClass282_1 != null && (this.anInt7581 & 0x10000) == 0) {
			this.aByteArray99 = this.aClass282_1.aByteArray113;
			this.aShortArray123 = this.aClass282_1.aShortArray141;
			this.aShortArray127 = this.aClass282_1.aShortArray142;
			this.aShortArray116 = this.aClass282_1.aShortArray143;
			this.aClass282_1 = null;
		}
		this.method6740();
	}

	@OriginalMember(owner = "client!rw", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		if (!this.lb) {
			this.method6751();
		}
		return this.anInt7542;
	}

	@OriginalMember(owner = "client!rw", name = "ca", descriptor = "(III)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7603; local7++) {
			if (arg0 != 0) {
				this.anIntArray716[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray711[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray710[local7] += arg2;
			}
		}
		this.method6754();
		this.lb = false;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!m;Lclient!cf;II)V")
	@Override
	public void method6778(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class46_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7541 == 0) {
			return;
		}
		@Pc(13) Class128_Sub3 local13 = this.aClass4_Sub2_15.aClass128_Sub3_16;
		if (!this.lb) {
			this.method6751();
		}
		@Pc(22) Class128_Sub3 local22 = (Class128_Sub3) arg0;
		Static423.aFloat145 = local22.aFloat150 * local13.aFloat153 + local22.aFloat151 * local13.aFloat154 + local22.aFloat155 * local13.aFloat157 + local13.aFloat150;
		Static53.aFloat31 = local22.aFloat158 * local13.aFloat154 + local22.aFloat156 * local13.aFloat157 + local13.aFloat153 * local22.aFloat154;
		@Pc(69) float local69 = Static423.aFloat145 + Static53.aFloat31 * (float) this.anInt7558;
		@Pc(77) float local77 = Static53.aFloat31 * (float) this.anInt7562 + Static423.aFloat145;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local69 > local77) {
			local93 = local69 + (float) this.anInt7544;
			local87 = local77 - (float) this.anInt7544;
		} else {
			local87 = local69 - (float) this.anInt7544;
			local93 = (float) this.anInt7544 + local77;
		}
		if (this.aClass4_Sub2_15.aFloat171 <= local87 || (float) this.aClass4_Sub2_15.anInt8324 >= local93) {
			return;
		}
		Static192.aFloat7 = local13.aFloat152 * local22.aFloat154 + local22.aFloat156 * local13.aFloat161 + local22.aFloat158 * local13.aFloat156;
		Static106.aFloat46 = local13.aFloat152 * local22.aFloat150 + local22.aFloat151 * local13.aFloat156 + local13.aFloat161 * local22.aFloat155 + local13.aFloat155;
		@Pc(169) float local169 = Static106.aFloat46 + (float) this.anInt7558 * Static192.aFloat7;
		@Pc(177) float local177 = Static106.aFloat46 + (float) this.anInt7562 * Static192.aFloat7;
		@Pc(192) float local192;
		@Pc(203) float local203;
		if (local177 < local169) {
			local192 = (float) this.aClass4_Sub2_15.anInt8326 * (local177 - (float) this.anInt7544);
			local203 = (local169 + (float) this.anInt7544) * (float) this.aClass4_Sub2_15.anInt8326;
		} else {
			local203 = (float) this.aClass4_Sub2_15.anInt8326 * (local177 + (float) this.anInt7544);
			local192 = (float) this.aClass4_Sub2_15.anInt8326 * (local169 - (float) this.anInt7544);
		}
		if (local192 / (float) arg2 >= this.aClass4_Sub2_15.bf || local203 / (float) arg2 <= this.aClass4_Sub2_15.aFloat181) {
			return;
		}
		Static233.aFloat87 = local13.aFloat159 * local22.aFloat155 + local13.aFloat158 * local22.aFloat151 + local22.aFloat150 * local13.aFloat160 + local13.aFloat151;
		Static452.aFloat162 = local22.aFloat154 * local13.aFloat160 + local22.aFloat158 * local13.aFloat158 + local13.aFloat159 * local22.aFloat156;
		@Pc(294) float local294 = Static233.aFloat87 + (float) this.anInt7558 * Static452.aFloat162;
		@Pc(302) float local302 = Static452.aFloat162 * (float) this.anInt7562 + Static233.aFloat87;
		@Pc(317) float local317;
		@Pc(328) float local328;
		if (local294 > local302) {
			local317 = (float) this.aClass4_Sub2_15.anInt8300 * (local302 - (float) this.anInt7544);
			local328 = ((float) this.anInt7544 + local294) * (float) this.aClass4_Sub2_15.anInt8300;
		} else {
			local328 = (local302 + (float) this.anInt7544) * (float) this.aClass4_Sub2_15.anInt8300;
			local317 = (float) this.aClass4_Sub2_15.anInt8300 * ((float) -this.anInt7544 + local294);
		}
		if (this.aClass4_Sub2_15.aFloat167 <= local317 / (float) arg2 || this.aClass4_Sub2_15.aFloat168 >= local328 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass44Array1 != null) {
			Static425.aFloat146 = local22.aFloat153 * local13.aFloat153 + local22.aFloat160 * local13.aFloat154 + local13.aFloat157 * local22.aFloat152;
			Static119.aFloat47 = local13.aFloat160 * local22.aFloat153 + local22.aFloat152 * local13.aFloat159 + local22.aFloat160 * local13.aFloat158;
			Static80.aFloat42 = local13.aFloat158 * local22.aFloat159 + local22.aFloat161 * local13.aFloat159 + local22.aFloat157 * local13.aFloat160;
			Static393.aFloat143 = local22.aFloat159 * local13.aFloat156 + local13.aFloat161 * local22.aFloat161 + local13.aFloat152 * local22.aFloat157;
			Static156.aFloat53 = local22.aFloat153 * local13.aFloat152 + local22.aFloat160 * local13.aFloat156 + local13.aFloat161 * local22.aFloat152;
			Static191.aFloat190 = local13.aFloat153 * local22.aFloat157 + local13.aFloat157 * local22.aFloat161 + local22.aFloat159 * local13.aFloat154;
		}
		if (arg1 != null) {
			@Pc(496) int local496 = this.anInt7538 + this.anInt7582 >> 1;
			@Pc(504) int local504 = this.anInt7542 + this.anInt7591 >> 1;
			@Pc(523) int local523 = (int) ((float) this.anInt7558 * Static192.aFloat7 + Static106.aFloat46 + (float) local496 * Static393.aFloat143 + (float) local504 * Static156.aFloat53);
			@Pc(542) int local542 = (int) (Static119.aFloat47 * (float) local504 + Static452.aFloat162 * (float) this.anInt7558 + (float) local496 * Static80.aFloat42 + Static233.aFloat87);
			@Pc(561) int local561 = (int) (Static423.aFloat145 + (float) local496 * Static191.aFloat190 + Static53.aFloat31 * (float) this.anInt7558 + Static425.aFloat146 * (float) local504);
			@Pc(580) int local580 = (int) (Static156.aFloat53 * (float) local504 + Static393.aFloat143 * (float) local496 + Static106.aFloat46 + Static192.aFloat7 * (float) this.anInt7562);
			@Pc(599) int local599 = (int) ((float) local504 * Static119.aFloat47 + Static80.aFloat42 * (float) local496 + Static233.aFloat87 + Static452.aFloat162 * (float) this.anInt7562);
			arg1.anInt1434 = this.aClass4_Sub2_15.anInt8323 + this.aClass4_Sub2_15.anInt8300 * local599 / arg2;
			arg1.anInt1433 = this.aClass4_Sub2_15.anInt8326 * local523 / arg2 + this.aClass4_Sub2_15.anInt8307;
			@Pc(645) int local645 = (int) (Static423.aFloat145 + Static191.aFloat190 * (float) local496 + (float) this.anInt7562 * Static53.aFloat31 + Static425.aFloat146 * (float) local504);
			arg1.anInt1435 = this.aClass4_Sub2_15.anInt8323 + local542 * this.aClass4_Sub2_15.anInt8300 / arg2;
			arg1.anInt1437 = this.aClass4_Sub2_15.anInt8307 + this.aClass4_Sub2_15.anInt8326 * local580 / arg2;
			if (local561 < this.aClass4_Sub2_15.anInt8324 && local645 < this.aClass4_Sub2_15.anInt8324) {
				arg1.aBoolean109 = true;
				arg1.anInt1436 = this.aClass4_Sub2_15.anInt8326 * (local523 + this.anInt7544) / arg2 + this.aClass4_Sub2_15.anInt8307 - arg1.anInt1433;
			}
		}
		this.aClass4_Sub2_15.method7341((float) arg2);
		this.aClass4_Sub2_15.method7278();
		this.aClass4_Sub2_15.method7301(local22);
		this.method6750();
		this.method6741();
	}

	@OriginalMember(owner = "client!rw", name = "ga", descriptor = "()I")
	@Override
	public int ga() {
		return this.aShort101;
	}

	@OriginalMember(owner = "client!rw", name = "U", descriptor = "()I")
	@Override
	public int U() {
		if (!this.lb) {
			this.method6751();
		}
		return this.anInt7591;
	}

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "(IIII)V")
	@Override
	protected void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static37.anInt1097 = 0;
			Static481.anInt6919 = 0;
			Static369.anInt6644 = 0;
			for (local17 = 0; local17 < this.anInt7603; local17++) {
				Static369.anInt6644 += this.anIntArray716[local17];
				Static481.anInt6919 += this.anIntArray711[local17];
				local9++;
				Static37.anInt1097 += this.anIntArray710[local17];
			}
			if (local9 <= 0) {
				Static37.anInt1097 = arg3;
				Static369.anInt6644 = arg1;
				Static481.anInt6919 = arg2;
			} else {
				Static37.anInt1097 = arg3 + Static37.anInt1097 / local9;
				Static369.anInt6644 = Static369.anInt6644 / local9 + arg1;
				Static481.anInt6919 = Static481.anInt6919 / local9 + arg2;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.anInt7603; local9++) {
				this.anIntArray716[local9] += arg1;
				this.anIntArray711[local9] += arg2;
				this.anIntArray710[local9] += arg3;
			}
		} else {
			@Pc(160) int local160;
			@Pc(178) int local178;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.anInt7603; local9++) {
					this.anIntArray716[local9] -= Static369.anInt6644;
					this.anIntArray711[local9] -= Static481.anInt6919;
					this.anIntArray710[local9] -= Static37.anInt1097;
					if (arg3 != 0) {
						local17 = Class200_Sub1.lb[arg3];
						local160 = Class200_Sub1.anIntArray576[arg3];
						local178 = this.anIntArray716[local9] * local160 + this.anIntArray711[local9] * local17 + 32767 >> 15;
						this.anIntArray711[local9] = local160 * this.anIntArray711[local9] + 32767 - local17 * this.anIntArray716[local9] >> 15;
						this.anIntArray716[local9] = local178;
					}
					if (arg1 != 0) {
						local17 = Class200_Sub1.lb[arg1];
						local160 = Class200_Sub1.anIntArray576[arg1];
						local178 = this.anIntArray711[local9] * local160 + 32767 - local17 * this.anIntArray710[local9] >> 15;
						this.anIntArray710[local9] = this.anIntArray711[local9] * local17 + this.anIntArray710[local9] * local160 + 32767 >> 15;
						this.anIntArray711[local9] = local178;
					}
					if (arg2 != 0) {
						local17 = Class200_Sub1.lb[arg2];
						local160 = Class200_Sub1.anIntArray576[arg2];
						local178 = this.anIntArray716[local9] * local160 + this.anIntArray710[local9] * local17 + 32767 >> 15;
						this.anIntArray710[local9] = this.anIntArray710[local9] * local160 + 32767 - this.anIntArray716[local9] * local17 >> 15;
						this.anIntArray716[local9] = local178;
					}
					this.anIntArray716[local9] += Static369.anInt6644;
					this.anIntArray711[local9] += Static481.anInt6919;
					this.anIntArray710[local9] += Static37.anInt1097;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.anInt7603; local9++) {
					this.anIntArray716[local9] -= Static369.anInt6644;
					this.anIntArray711[local9] -= Static481.anInt6919;
					this.anIntArray710[local9] -= Static37.anInt1097;
					this.anIntArray716[local9] = this.anIntArray716[local9] * arg1 / 128;
					this.anIntArray711[local9] = arg2 * this.anIntArray711[local9] / 128;
					this.anIntArray710[local9] = this.anIntArray710[local9] * arg3 / 128;
					this.anIntArray716[local9] += Static369.anInt6644;
					this.anIntArray711[local9] += Static481.anInt6919;
					this.anIntArray710[local9] += Static37.anInt1097;
				}
			} else {
				@Pc(509) Class44 local509;
				@Pc(514) Class302 local514;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt7598; local9++) {
						local17 = arg1 * 8 + (this.aByteArray100[local9] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray100[local9] = (byte) local17;
					}
					if (this.aClass44Array1 != null) {
						for (local17 = 0; local17 < this.anInt7590; local17++) {
							local509 = this.aClass44Array1[local17];
							local514 = this.aClass302Array1[local17];
							local514.anInt8898 = local514.anInt8898 & 0xFFFFFF | 255 - (this.aByteArray100[local509.anInt1423] & 0xFF) << 24;
						}
					}
					this.method6757();
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt7598; local9++) {
						local17 = this.aShortArray126[local9] & 0xFFFF;
						local160 = local17 >> 10 & 0x3F;
						local178 = local17 >> 7 & 0x7;
						local178 += arg2 / 4;
						@Pc(583) int local583 = arg1 + local160 & 0x3F;
						@Pc(587) int local587 = local17 & 0x7F;
						local587 += arg3;
						if (local178 < 0) {
							local178 = 0;
						} else if (local178 > 7) {
							local178 = 7;
						}
						if (local587 < 0) {
							local587 = 0;
						} else if (local587 > 127) {
							local587 = 127;
						}
						this.aShortArray126[local9] = (short) (local583 << 10 | local178 << 7 | local587);
					}
					if (this.aClass44Array1 != null) {
						for (local17 = 0; local17 < this.anInt7590; local17++) {
							local509 = this.aClass44Array1[local17];
							local514 = this.aClass302Array1[local17];
							local514.anInt8898 = local514.anInt8898 & 0xFF000000 | Static107.anIntArray176[this.aShortArray126[local509.anInt1423] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method6757();
				} else {
					@Pc(690) Class302 local690;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt7590; local9++) {
							local690 = this.aClass302Array1[local9];
							local690.anInt8907 += arg2;
							local690.anInt8906 += arg1;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt7590; local9++) {
							local690 = this.aClass302Array1[local9];
							local690.anInt8902 = arg2 * local690.anInt8902 >> 7;
							local690.anInt8900 = local690.anInt8900 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt7590; local9++) {
							local690 = this.aClass302Array1[local9];
							local690.anInt8904 = arg1 + local690.anInt8904 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "L", descriptor = "(SS)V")
	@Override
	public void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface13 local9 = this.aClass4_Sub2_15.anInterface13_13;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7598; local11++) {
			if (this.aShortArray124[local11] == arg0) {
				this.aShortArray124[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class296 local47 = local9.method5789(arg0 & 0xFFFF);
			local35 = local47.aByte103;
			local37 = local47.aByte99;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(67) Class296 local67 = local9.method5789(arg1 & 0xFFFF);
			local55 = local67.aByte103;
			local57 = local67.aByte99;
		}
		if (!(local35 != local55 | local57 != local37)) {
			return;
		}
		if (this.aClass44Array1 != null) {
			for (@Pc(96) int local96 = 0; local96 < this.anInt7590; local96++) {
				@Pc(103) Class44 local103 = this.aClass44Array1[local96];
				@Pc(108) Class302 local108 = this.aClass302Array1[local96];
				local108.anInt8898 = local108.anInt8898 & 0xFF000000 | Static107.anIntArray176[this.aShortArray126[local103.anInt1423] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6757();
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIIIZIII)Z")
	private boolean method6747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > arg4 && arg6 > arg4 && arg3 > arg4) {
			return false;
		} else if (arg2 < arg4 && arg6 < arg4 && arg4 > arg3) {
			return false;
		} else if (arg5 < arg0 && arg7 > arg5 && arg1 > arg5) {
			return false;
		} else {
			return arg0 >= arg5 || arg5 <= arg7 || arg1 >= arg5;
		}
	}

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "(I)V")
	@Override
	public void q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class200_Sub1.lb[arg0];
		@Pc(13) int local13 = Class200_Sub1.anIntArray576[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7603; local15++) {
			local33 = this.anIntArray716[local15] * local13 + local9 * this.anIntArray710[local15] >> 15;
			this.anIntArray710[local15] = this.anIntArray710[local15] * local13 - local9 * this.anIntArray716[local15] >> 15;
			this.anIntArray716[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt7541; local33++) {
			@Pc(86) int local86 = this.aShortArray127[local33] * local9 + this.aShortArray123[local33] * local13 >> 15;
			this.aShortArray127[local33] = (short) (local13 * this.aShortArray127[local33] - this.aShortArray123[local33] * local9 >> 15);
			this.aShortArray123[local33] = (short) local86;
		}
		this.method6754();
		this.method6743();
		this.lb = false;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method6785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class128_Sub3 local8 = (Class128_Sub3) arg2;
		@Pc(12) Class128_Sub3 local12 = this.aClass4_Sub2_15.aClass128_Sub3_16;
		@Pc(33) float local33 = local12.aFloat152 * local8.aFloat150 + local12.aFloat161 * local8.aFloat155 + local12.aFloat156 * local8.aFloat151 + local12.aFloat155;
		@Pc(54) float local54 = local8.aFloat150 * local12.aFloat160 + local8.aFloat151 * local12.aFloat158 + local12.aFloat159 * local8.aFloat155 + local12.aFloat151;
		Static80.aFloat42 = local12.aFloat158 * local8.aFloat159 + local12.aFloat159 * local8.aFloat161 + local8.aFloat157 * local12.aFloat160;
		@Pc(93) float local93 = local12.aFloat150 + local8.aFloat150 * local12.aFloat153 + local8.aFloat155 * local12.aFloat157 + local8.aFloat151 * local12.aFloat154;
		Static192.aFloat7 = local8.aFloat154 * local12.aFloat152 + local8.aFloat156 * local12.aFloat161 + local8.aFloat158 * local12.aFloat156;
		Static191.aFloat190 = local12.aFloat157 * local8.aFloat161 + local12.aFloat154 * local8.aFloat159 + local12.aFloat153 * local8.aFloat157;
		Static53.aFloat31 = local8.aFloat158 * local12.aFloat154 + local12.aFloat157 * local8.aFloat156 + local8.aFloat154 * local12.aFloat153;
		Static393.aFloat143 = local12.aFloat156 * local8.aFloat159 + local12.aFloat161 * local8.aFloat161 + local8.aFloat157 * local12.aFloat152;
		Static119.aFloat47 = local12.aFloat158 * local8.aFloat160 + local8.aFloat152 * local12.aFloat159 + local8.aFloat153 * local12.aFloat160;
		Static452.aFloat162 = local12.aFloat160 * local8.aFloat154 + local8.aFloat156 * local12.aFloat159 + local8.aFloat158 * local12.aFloat158;
		Static156.aFloat53 = local8.aFloat153 * local12.aFloat152 + local8.aFloat152 * local12.aFloat161 + local8.aFloat160 * local12.aFloat156;
		Static425.aFloat146 = local12.aFloat154 * local8.aFloat160 + local8.aFloat152 * local12.aFloat157 + local12.aFloat153 * local8.aFloat153;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass4_Sub2_15.anInt8326;
		@Pc(255) int local255 = this.aClass4_Sub2_15.anInt8300;
		if (!this.lb) {
			this.method6751();
		}
		Static34.anIntArray71[0] = this.anInt7582;
		Static519.anIntArray151[0] = this.anInt7558;
		Static34.anIntArray71[1] = this.anInt7538;
		Static363.anIntArray636[0] = this.anInt7542;
		Static519.anIntArray151[1] = this.anInt7558;
		Static363.anIntArray636[1] = this.anInt7542;
		Static34.anIntArray71[2] = this.anInt7582;
		Static519.anIntArray151[2] = this.anInt7562;
		Static363.anIntArray636[2] = this.anInt7542;
		Static34.anIntArray71[3] = this.anInt7538;
		Static519.anIntArray151[3] = this.anInt7562;
		Static34.anIntArray71[4] = this.anInt7582;
		Static363.anIntArray636[3] = this.anInt7542;
		Static519.anIntArray151[4] = this.anInt7558;
		Static34.anIntArray71[5] = this.anInt7538;
		Static363.anIntArray636[4] = this.anInt7591;
		Static519.anIntArray151[5] = this.anInt7558;
		Static363.anIntArray636[5] = this.anInt7591;
		Static34.anIntArray71[6] = this.anInt7582;
		Static519.anIntArray151[6] = this.anInt7562;
		Static34.anIntArray71[7] = this.anInt7538;
		Static363.anIntArray636[6] = this.anInt7591;
		Static519.anIntArray151[7] = this.anInt7562;
		Static363.anIntArray636[7] = this.anInt7591;
		@Pc(442) float local442;
		@Pc(414) float local414;
		@Pc(428) float local428;
		@Pc(390) float local390;
		@Pc(400) float local400;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static34.anIntArray71[local383];
			local395 = Static363.anIntArray636[local383];
			local400 = Static519.anIntArray151[local383];
			local414 = local54 + Static452.aFloat162 * local400 + local390 * Static80.aFloat42 + local395 * Static119.aFloat47;
			local428 = Static53.aFloat31 * local400 + local390 * Static191.aFloat190 + Static425.aFloat146 * local395 + local93;
			local442 = Static393.aFloat143 * local390 + local400 * Static192.aFloat7 + local395 * Static156.aFloat53 + local33;
			if ((float) this.aClass4_Sub2_15.anInt8324 <= local428) {
				@Pc(461) float local461 = local442 * (float) local251 / local428 + (float) this.aClass4_Sub2_15.anInt8307;
				if (local243 < local461) {
					local243 = local461;
				}
				if (local461 < local241) {
					local241 = local461;
				}
				@Pc(485) float local485 = (float) this.aClass4_Sub2_15.anInt8323 + (float) local255 * local414 / local428;
				if (local485 > local247) {
					local247 = local485;
				}
				if (local245 > local485) {
					local245 = local485;
				}
				local239 = true;
			}
		}
		if (local239 && local241 < (float) arg0 && local243 > (float) arg0 && local245 < (float) arg1 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt7541 > Static107.anIntArray177.length) {
				Static107.anIntArray177 = new int[this.anInt7541];
				Static343.anIntArray812 = new int[this.anInt7541];
			}
			@Pc(630) int local630;
			for (@Pc(548) int local548 = 0; local548 < this.anInt7603; local548++) {
				local400 = this.anIntArray711[local548];
				local390 = this.anIntArray716[local548];
				local395 = this.anIntArray710[local548];
				local428 = local93 + local400 * Static53.aFloat31 + local390 * Static191.aFloat190 + local395 * Static425.aFloat146;
				local414 = local54 + Static119.aFloat47 * local395 + Static452.aFloat162 * local400 + Static80.aFloat42 * local390;
				local442 = local33 + local395 * Static156.aFloat53 + local390 * Static393.aFloat143 + local400 * Static192.aFloat7;
				@Pc(643) int local643;
				@Pc(648) int local648;
				@Pc(655) int local655;
				if ((float) this.aClass4_Sub2_15.anInt8324 <= local428) {
					local630 = (int) ((float) local251 * local442 / local428 + (float) this.aClass4_Sub2_15.anInt8307);
					local643 = (int) ((float) this.aClass4_Sub2_15.anInt8323 + local414 * (float) local255 / local428);
					local648 = this.anIntArray709[local548];
					local655 = this.anIntArray709[local548 + 1];
					for (@Pc(657) int local657 = local648; local657 < local655; local657++) {
						@Pc(666) int local666 = this.aShortArray120[local657] - 1;
						if (local666 == -1) {
							break;
						}
						Static107.anIntArray177[local666] = local630;
						Static343.anIntArray812[local666] = local643;
					}
				} else {
					local630 = this.anIntArray709[local548];
					local643 = this.anIntArray709[local548 + 1];
					for (local648 = local630; local648 < local643; local648++) {
						local655 = this.aShortArray120[local648] - 1;
						if (local655 == -1) {
							break;
						}
						Static107.anIntArray177[this.aShortArray120[local648] - 1] = -999999;
					}
				}
			}
			for (local630 = 0; local630 < this.anInt7598; local630++) {
				if (Static107.anIntArray177[this.aShortArray122[local630]] != -999999 && Static107.anIntArray177[this.aShortArray128[local630]] != -999999 && Static107.anIntArray177[this.aShortArray119[local630]] != -999999 && this.method6747(Static107.anIntArray177[this.aShortArray122[local630]], Static107.anIntArray177[this.aShortArray119[local630]], Static343.anIntArray812[this.aShortArray122[local630]], Static343.anIntArray812[this.aShortArray119[local630]], arg1, arg0, Static343.anIntArray812[this.aShortArray128[local630]], Static107.anIntArray177[this.aShortArray128[local630]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!m;Lclient!cf;I)V")
	@Override
	public void method6773(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class46_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7541 == 0) {
			return;
		}
		@Pc(13) Class128_Sub3 local13 = this.aClass4_Sub2_15.aClass128_Sub3_16;
		@Pc(16) Class128_Sub3 local16 = (Class128_Sub3) arg0;
		if (!this.lb) {
			this.method6751();
		}
		this.method6753(local16);
		Static423.aFloat145 = local13.aFloat150 + local16.aFloat155 * local13.aFloat157 + local13.aFloat154 * local16.aFloat151 + local16.aFloat150 * local13.aFloat153;
		Static53.aFloat31 = local16.aFloat156 * local13.aFloat157 + local16.aFloat158 * local13.aFloat154 + local16.aFloat154 * local13.aFloat153;
		@Pc(73) float local73 = Static53.aFloat31 * (float) this.anInt7558 + Static423.aFloat145;
		@Pc(81) float local81 = Static53.aFloat31 * (float) this.anInt7562 + Static423.aFloat145;
		@Pc(98) float local98;
		@Pc(91) float local91;
		if (local73 > local81) {
			local91 = (float) this.anInt7544 + local73;
			local98 = (float) -this.anInt7544 + local81;
		} else {
			local98 = (float) -this.anInt7544 + local73;
			local91 = local81 + (float) this.anInt7544;
		}
		if (this.aClass4_Sub2_15.aFloat180 <= local98 || (float) this.aClass4_Sub2_15.anInt8324 >= local91) {
			return;
		}
		Static106.aFloat46 = local13.aFloat155 + local16.aFloat150 * local13.aFloat152 + local16.aFloat151 * local13.aFloat156 + local16.aFloat155 * local13.aFloat161;
		Static192.aFloat7 = local13.aFloat161 * local16.aFloat156 + local16.aFloat158 * local13.aFloat156 + local13.aFloat152 * local16.aFloat154;
		@Pc(175) float local175 = (float) this.anInt7558 * Static192.aFloat7 + Static106.aFloat46;
		@Pc(183) float local183 = Static106.aFloat46 + (float) this.anInt7562 * Static192.aFloat7;
		@Pc(198) float local198;
		@Pc(209) float local209;
		if (local175 > local183) {
			local209 = (local175 + (float) this.anInt7544) * (float) this.aClass4_Sub2_15.anInt8326;
			local198 = ((float) -this.anInt7544 + local183) * (float) this.aClass4_Sub2_15.anInt8326;
		} else {
			local198 = (float) this.aClass4_Sub2_15.anInt8326 * (local175 - (float) this.anInt7544);
			local209 = (local183 + (float) this.anInt7544) * (float) this.aClass4_Sub2_15.anInt8326;
		}
		if (local198 / local91 >= this.aClass4_Sub2_15.bf || this.aClass4_Sub2_15.aFloat181 >= local209 / local91) {
			return;
		}
		Static233.aFloat87 = local16.aFloat150 * local13.aFloat160 + local16.aFloat151 * local13.aFloat158 + local16.aFloat155 * local13.aFloat159 + local13.aFloat151;
		Static452.aFloat162 = local16.aFloat154 * local13.aFloat160 + local16.aFloat156 * local13.aFloat159 + local13.aFloat158 * local16.aFloat158;
		@Pc(299) float local299 = Static452.aFloat162 * (float) this.anInt7558 + Static233.aFloat87;
		@Pc(307) float local307 = Static233.aFloat87 + Static452.aFloat162 * (float) this.anInt7562;
		@Pc(333) float local333;
		@Pc(322) float local322;
		if (local299 > local307) {
			local322 = (local299 + (float) this.anInt7544) * (float) this.aClass4_Sub2_15.anInt8300;
			local333 = (float) this.aClass4_Sub2_15.anInt8300 * (local307 - (float) this.anInt7544);
		} else {
			local322 = (float) this.aClass4_Sub2_15.anInt8300 * ((float) this.anInt7544 + local307);
			local333 = (local299 - (float) this.anInt7544) * (float) this.aClass4_Sub2_15.anInt8300;
		}
		if (local333 / local91 >= this.aClass4_Sub2_15.aFloat167 || this.aClass4_Sub2_15.aFloat168 >= local322 / local91) {
			return;
		}
		if (arg1 != null || this.aClass44Array1 != null) {
			Static156.aFloat53 = local13.aFloat152 * local16.aFloat153 + local16.aFloat160 * local13.aFloat156 + local13.aFloat161 * local16.aFloat152;
			Static80.aFloat42 = local16.aFloat159 * local13.aFloat158 + local13.aFloat159 * local16.aFloat161 + local13.aFloat160 * local16.aFloat157;
			Static393.aFloat143 = local16.aFloat157 * local13.aFloat152 + local13.aFloat161 * local16.aFloat161 + local13.aFloat156 * local16.aFloat159;
			Static425.aFloat146 = local13.aFloat153 * local16.aFloat153 + local13.aFloat154 * local16.aFloat160 + local16.aFloat152 * local13.aFloat157;
			Static119.aFloat47 = local16.aFloat160 * local13.aFloat158 + local16.aFloat152 * local13.aFloat159 + local13.aFloat160 * local16.aFloat153;
			Static191.aFloat190 = local13.aFloat153 * local16.aFloat157 + local16.aFloat159 * local13.aFloat154 + local13.aFloat157 * local16.aFloat161;
		}
		if (arg1 != null) {
			@Pc(492) boolean local492 = false;
			@Pc(494) boolean local494 = true;
			@Pc(502) int local502 = this.anInt7582 + this.anInt7538 >> 1;
			@Pc(510) int local510 = this.anInt7591 + this.anInt7542 >> 1;
			@Pc(529) int local529 = (int) ((float) local510 * Static156.aFloat53 + (float) this.anInt7558 * Static192.aFloat7 + Static393.aFloat143 * (float) local502 + Static106.aFloat46);
			@Pc(548) int local548 = (int) (Static80.aFloat42 * (float) local502 + Static233.aFloat87 + (float) this.anInt7558 * Static452.aFloat162 + (float) local510 * Static119.aFloat47);
			@Pc(567) int local567 = (int) (Static53.aFloat31 * (float) this.anInt7558 + Static191.aFloat190 * (float) local502 + Static423.aFloat145 + Static425.aFloat146 * (float) local510);
			if (local567 < this.aClass4_Sub2_15.anInt8324) {
				local492 = true;
			} else {
				arg1.anInt1435 = this.aClass4_Sub2_15.anInt8323 + local548 * this.aClass4_Sub2_15.anInt8300 / local567;
				arg1.anInt1433 = this.aClass4_Sub2_15.anInt8307 + local529 * this.aClass4_Sub2_15.anInt8326 / local567;
			}
			@Pc(621) int local621 = (int) (Static106.aFloat46 + Static393.aFloat143 * (float) local502 + (float) this.anInt7562 * Static192.aFloat7 + (float) local510 * Static156.aFloat53);
			@Pc(640) int local640 = (int) ((float) local502 * Static80.aFloat42 + Static233.aFloat87 + Static452.aFloat162 * (float) this.anInt7562 + Static119.aFloat47 * (float) local510);
			@Pc(659) int local659 = (int) (Static423.aFloat145 + (float) local502 * Static191.aFloat190 + (float) this.anInt7562 * Static53.aFloat31 + (float) local510 * Static425.aFloat146);
			if (local659 < this.aClass4_Sub2_15.anInt8324) {
				local492 = true;
			} else {
				arg1.anInt1434 = this.aClass4_Sub2_15.anInt8300 * local640 / local659 + this.aClass4_Sub2_15.anInt8323;
				arg1.anInt1437 = this.aClass4_Sub2_15.anInt8307 + local621 * this.aClass4_Sub2_15.anInt8326 / local659;
			}
			if (local492) {
				if (this.aClass4_Sub2_15.anInt8324 > local567 && this.aClass4_Sub2_15.anInt8324 > local659) {
					local494 = false;
				} else {
					@Pc(742) int local742;
					@Pc(753) int local753;
					@Pc(763) int local763;
					if (this.aClass4_Sub2_15.anInt8324 > local567) {
						local742 = (local659 - this.aClass4_Sub2_15.anInt8324 << 16) / (local659 - local567);
						local753 = local621 + ((local621 - local529) * local742 >> 16);
						local763 = local640 + ((local640 - local548) * local742 >> 16);
						arg1.anInt1433 = this.aClass4_Sub2_15.anInt8307 + local753 * this.aClass4_Sub2_15.anInt8326 / this.aClass4_Sub2_15.anInt8324;
						arg1.anInt1435 = local763 * this.aClass4_Sub2_15.anInt8300 / this.aClass4_Sub2_15.anInt8324 + this.aClass4_Sub2_15.anInt8323;
					} else if (this.aClass4_Sub2_15.anInt8324 > local659) {
						local742 = (local567 - this.aClass4_Sub2_15.anInt8324 << 16) / (local567 - local659);
						local753 = local529 + (local742 * (local529 - local621) >> 16);
						arg1.anInt1433 = local753 * this.aClass4_Sub2_15.anInt8326 / this.aClass4_Sub2_15.anInt8324 + this.aClass4_Sub2_15.anInt8307;
						local763 = ((local548 - local640) * local742 >> 16) + local548;
						arg1.anInt1435 = this.aClass4_Sub2_15.anInt8323 + this.aClass4_Sub2_15.anInt8300 * local763 / this.aClass4_Sub2_15.anInt8324;
					}
				}
			}
			if (local494) {
				if (local567 <= local659) {
					arg1.anInt1436 = this.aClass4_Sub2_15.anInt8307 + this.aClass4_Sub2_15.anInt8326 * (this.anInt7544 + local621) / local659 - arg1.anInt1437;
				} else {
					arg1.anInt1436 = (local529 + this.anInt7544) * this.aClass4_Sub2_15.anInt8326 / local567 + this.aClass4_Sub2_15.anInt8307 - arg1.anInt1433;
				}
				arg1.aBoolean109 = true;
			}
		}
		this.aClass4_Sub2_15.method7240();
		this.aClass4_Sub2_15.method7301(local16);
		this.method6750();
		this.method6741();
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IBZLclient!rw;ZLclient!rw;)Lclient!r;")
	private Class97 method6748(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class97_Sub2 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class97_Sub2 arg4) {
		arg2.anInt7590 = this.anInt7590;
		arg2.anInt7581 = arg0;
		arg2.anInt7603 = this.anInt7603;
		arg2.anInt7532 = this.anInt7532;
		arg2.anInt7580 = this.anInt7580;
		arg2.anInt7555 = this.anInt7555;
		arg2.aShort101 = this.aShort101;
		arg2.anInt7598 = this.anInt7598;
		arg2.anInt7541 = this.anInt7541;
		arg2.aShort102 = this.aShort102;
		@Pc(50) boolean local50 = Static443.method6860(arg0, this.anInt7580);
		@Pc(56) boolean local56 = Static303.method5348(this.anInt7580, arg0);
		@Pc(62) boolean local62 = Static336.method5672(arg0, this.anInt7580);
		@Pc(68) boolean local68 = local56 | local50 | local62;
		@Pc(187) int local187;
		if (local68) {
			if (!local50) {
				arg2.anIntArray716 = this.anIntArray716;
			} else if (arg4.anIntArray716 == null || arg4.anIntArray716.length < this.anInt7555) {
				arg2.anIntArray716 = arg4.anIntArray716 = new int[this.anInt7555];
			} else {
				arg2.anIntArray716 = arg4.anIntArray716;
			}
			if (!local56) {
				arg2.anIntArray711 = this.anIntArray711;
			} else if (arg4.anIntArray711 == null || arg4.anIntArray711.length < this.anInt7555) {
				arg2.anIntArray711 = arg4.anIntArray711 = new int[this.anInt7555];
			} else {
				arg2.anIntArray711 = arg4.anIntArray711;
			}
			if (!local62) {
				arg2.anIntArray710 = this.anIntArray710;
			} else if (arg4.anIntArray710 == null || this.anInt7555 > arg4.anIntArray710.length) {
				arg2.anIntArray710 = arg4.anIntArray710 = new int[this.anInt7555];
			} else {
				arg2.anIntArray710 = arg4.anIntArray710;
			}
			for (local187 = 0; local187 < this.anInt7555; local187++) {
				if (local50) {
					arg2.anIntArray716[local187] = this.anIntArray716[local187];
				}
				if (local56) {
					arg2.anIntArray711[local187] = this.anIntArray711[local187];
				}
				if (local62) {
					arg2.anIntArray710[local187] = this.anIntArray710[local187];
				}
			}
		} else {
			arg2.anIntArray710 = this.anIntArray710;
			arg2.anIntArray711 = this.anIntArray711;
			arg2.anIntArray716 = this.anIntArray716;
		}
		if (Static263.method4733(arg0, this.anInt7580)) {
			arg2.aClass204_4 = arg4.aClass204_4;
			arg2.aClass204_4.aBoolean465 = this.aClass204_4.aBoolean465;
			arg2.aClass204_4.aBoolean464 = true;
			arg2.aClass204_4.anInterface16_9 = this.aClass204_4.anInterface16_9;
		} else if (Static291.method5104(this.anInt7580, arg0)) {
			arg2.aClass204_4 = this.aClass204_4;
		} else {
			arg2.aClass204_4 = null;
		}
		if (Static127.method2443(this.anInt7580, arg0)) {
			if (arg4.aShortArray126 == null || arg4.aShortArray126.length < this.anInt7598) {
				arg2.aShortArray126 = arg4.aShortArray126 = new short[this.anInt7598];
			} else {
				arg2.aShortArray126 = arg4.aShortArray126;
			}
			for (local187 = 0; local187 < this.anInt7598; local187++) {
				arg2.aShortArray126[local187] = this.aShortArray126[local187];
			}
		} else {
			arg2.aShortArray126 = this.aShortArray126;
		}
		if (Static276.method7564(arg0, this.anInt7580)) {
			if (arg4.aByteArray100 == null || arg4.aByteArray100.length < this.anInt7598) {
				arg2.aByteArray100 = arg4.aByteArray100 = new byte[this.anInt7598];
			} else {
				arg2.aByteArray100 = arg4.aByteArray100;
			}
			for (local187 = 0; local187 < this.anInt7598; local187++) {
				arg2.aByteArray100[local187] = this.aByteArray100[local187];
			}
		} else {
			arg2.aByteArray100 = this.aByteArray100;
		}
		if (Static461.method7923(this.anInt7580, arg0)) {
			arg2.aClass204_2 = arg4.aClass204_2;
			arg2.aClass204_2.aBoolean465 = this.aClass204_2.aBoolean465;
			arg2.aClass204_2.anInterface16_9 = this.aClass204_2.anInterface16_9;
			arg2.aClass204_2.aBoolean464 = true;
		} else if (Static333.method5657(arg0, this.anInt7580)) {
			arg2.aClass204_2 = this.aClass204_2;
		} else {
			arg2.aClass204_2 = null;
		}
		@Pc(551) int local551;
		if (Static346.method5755(arg0, this.anInt7580)) {
			if (arg4.aShortArray123 == null || arg4.aShortArray123.length < this.anInt7541) {
				local187 = this.anInt7541;
				arg2.aShortArray123 = arg4.aShortArray123 = new short[local187];
				arg2.aShortArray127 = arg4.aShortArray127 = new short[local187];
				arg2.aShortArray116 = arg4.aShortArray116 = new short[local187];
			} else {
				arg2.aShortArray127 = arg4.aShortArray127;
				arg2.aShortArray123 = arg4.aShortArray123;
				arg2.aShortArray116 = arg4.aShortArray116;
			}
			if (this.aClass282_1 == null) {
				arg2.aClass282_1 = null;
				for (local187 = 0; local187 < this.anInt7541; local187++) {
					arg2.aShortArray123[local187] = this.aShortArray123[local187];
					arg2.aShortArray116[local187] = this.aShortArray116[local187];
					arg2.aShortArray127[local187] = this.aShortArray127[local187];
				}
			} else {
				if (arg4.aClass282_1 == null) {
					arg4.aClass282_1 = new Class282();
				}
				@Pc(535) Class282 local535 = arg2.aClass282_1 = arg4.aClass282_1;
				if (local535.aShortArray141 == null || local535.aShortArray141.length < this.anInt7541) {
					local551 = this.anInt7541;
					local535.aShortArray142 = new short[local551];
					local535.aShortArray141 = new short[local551];
					local535.aShortArray143 = new short[local551];
					local535.aByteArray113 = new byte[local551];
				}
				for (local551 = 0; local551 < this.anInt7541; local551++) {
					arg2.aShortArray123[local551] = this.aShortArray123[local551];
					arg2.aShortArray116[local551] = this.aShortArray116[local551];
					arg2.aShortArray127[local551] = this.aShortArray127[local551];
					local535.aShortArray141[local551] = this.aClass282_1.aShortArray141[local551];
					local535.aShortArray143[local551] = this.aClass282_1.aShortArray143[local551];
					local535.aShortArray142[local551] = this.aClass282_1.aShortArray142[local551];
					local535.aByteArray113[local551] = this.aClass282_1.aByteArray113[local551];
				}
			}
			arg2.aByteArray99 = this.aByteArray99;
		} else {
			arg2.aShortArray127 = this.aShortArray127;
			arg2.aByteArray99 = this.aByteArray99;
			arg2.aShortArray123 = this.aShortArray123;
			arg2.aShortArray116 = this.aShortArray116;
			arg2.aClass282_1 = this.aClass282_1;
		}
		if (Static157.method2875(this.anInt7580, arg0)) {
			arg2.aClass204_3 = arg4.aClass204_3;
			arg2.aClass204_3.aBoolean465 = this.aClass204_3.aBoolean465;
			arg2.aClass204_3.aBoolean464 = true;
			arg2.aClass204_3.anInterface16_9 = this.aClass204_3.anInterface16_9;
		} else if (Static54.method1451(this.anInt7580, arg0)) {
			arg2.aClass204_3 = this.aClass204_3;
		} else {
			arg2.aClass204_3 = null;
		}
		if (Static216.method3996(arg0, this.anInt7580)) {
			if (arg4.aFloatArray62 == null || this.anInt7598 > arg4.aFloatArray62.length) {
				local187 = this.anInt7541;
				arg2.aFloatArray61 = arg4.aFloatArray61 = new float[local187];
				arg2.aFloatArray62 = arg4.aFloatArray62 = new float[local187];
			} else {
				arg2.aFloatArray61 = arg4.aFloatArray61;
				arg2.aFloatArray62 = arg4.aFloatArray62;
			}
			for (local187 = 0; local187 < this.anInt7541; local187++) {
				arg2.aFloatArray62[local187] = this.aFloatArray62[local187];
				arg2.aFloatArray61[local187] = this.aFloatArray61[local187];
			}
		} else {
			arg2.aFloatArray62 = this.aFloatArray62;
			arg2.aFloatArray61 = this.aFloatArray61;
		}
		if (Static514.method7861(this.anInt7580, arg0)) {
			arg2.aClass204_1 = arg4.aClass204_1;
			arg2.aClass204_1.aBoolean464 = true;
			arg2.aClass204_1.aBoolean465 = this.aClass204_1.aBoolean465;
			arg2.aClass204_1.anInterface16_9 = this.aClass204_1.anInterface16_9;
		} else if (Static167.method3164(arg0, this.anInt7580)) {
			arg2.aClass204_1 = this.aClass204_1;
		} else {
			arg2.aClass204_1 = null;
		}
		if (Static197.method3751(this.anInt7580, arg0)) {
			if (arg4.aShortArray122 == null || this.anInt7598 > arg4.aShortArray122.length) {
				local187 = this.anInt7598;
				arg2.aShortArray119 = arg4.aShortArray119 = new short[local187];
				arg2.aShortArray122 = arg4.aShortArray122 = new short[local187];
				arg2.aShortArray128 = arg4.aShortArray128 = new short[local187];
			} else {
				arg2.aShortArray122 = arg4.aShortArray122;
				arg2.aShortArray128 = arg4.aShortArray128;
				arg2.aShortArray119 = arg4.aShortArray119;
			}
			for (local187 = 0; local187 < this.anInt7598; local187++) {
				arg2.aShortArray122[local187] = this.aShortArray122[local187];
				arg2.aShortArray128[local187] = this.aShortArray128[local187];
				arg2.aShortArray119[local187] = this.aShortArray119[local187];
			}
		} else {
			arg2.aShortArray128 = this.aShortArray128;
			arg2.aShortArray119 = this.aShortArray119;
			arg2.aShortArray122 = this.aShortArray122;
		}
		if (Static498.method7618(arg0, this.anInt7580)) {
			arg2.aClass129_1 = arg4.aClass129_1;
			arg2.aClass129_1.aBoolean309 = this.aClass129_1.aBoolean309;
			arg2.aClass129_1.aBoolean311 = true;
			arg2.aClass129_1.anInterface9_4 = this.aClass129_1.anInterface9_4;
		} else if (Static495.method7591(this.anInt7580, arg0)) {
			arg2.aClass129_1 = this.aClass129_1;
		} else {
			arg2.aClass129_1 = null;
		}
		if (Static431.method6697(arg0, this.anInt7580)) {
			if (arg4.aShortArray124 == null || this.anInt7598 > arg4.aShortArray124.length) {
				local187 = this.anInt7598;
				arg2.aShortArray124 = arg4.aShortArray124 = new short[local187];
			} else {
				arg2.aShortArray124 = arg4.aShortArray124;
			}
			for (local187 = 0; local187 < this.anInt7598; local187++) {
				arg2.aShortArray124[local187] = this.aShortArray124[local187];
			}
		} else {
			arg2.aShortArray124 = this.aShortArray124;
		}
		if (!Static375.method7395(arg0, this.anInt7580)) {
			arg2.aClass302Array1 = this.aClass302Array1;
		} else if (arg4.aClass302Array1 == null || this.anInt7590 > arg4.aClass302Array1.length) {
			local187 = this.anInt7590;
			arg2.aClass302Array1 = arg4.aClass302Array1 = new Class302[local187];
			for (local551 = 0; local551 < this.anInt7590; local551++) {
				arg2.aClass302Array1[local551] = this.aClass302Array1[local551].method7753();
			}
		} else {
			arg2.aClass302Array1 = arg4.aClass302Array1;
			for (local187 = 0; local187 < this.anInt7590; local187++) {
				arg2.aClass302Array1[local187].method7750(this.aClass302Array1[local187]);
			}
		}
		arg2.anIntArrayArray101 = this.anIntArrayArray101;
		arg2.anIntArrayArray100 = this.anIntArrayArray100;
		arg2.aClass68Array6 = this.aClass68Array6;
		arg2.aShortArray125 = this.aShortArray125;
		arg2.aShortArray117 = this.aShortArray117;
		if (this.lb) {
			arg2.lb = true;
			arg2.anInt7591 = this.anInt7591;
			arg2.anInt7542 = this.anInt7542;
			arg2.anInt7544 = this.anInt7544;
			arg2.anInt7538 = this.anInt7538;
			arg2.anInt7558 = this.anInt7558;
			arg2.anInt7582 = this.anInt7582;
			arg2.anInt7562 = this.anInt7562;
		} else {
			arg2.lb = false;
		}
		arg2.anIntArray714 = this.anIntArray714;
		arg2.aShortArray121 = this.aShortArray121;
		arg2.aShortArray120 = this.aShortArray120;
		arg2.anIntArray713 = this.anIntArray713;
		arg2.aShortArray118 = this.aShortArray118;
		arg2.anIntArrayArray102 = this.anIntArrayArray102;
		arg2.aClass44Array1 = this.aClass44Array1;
		arg2.anIntArray709 = this.anIntArray709;
		arg2.anIntArray715 = this.anIntArray715;
		arg2.aClass106Array6 = this.aClass106Array6;
		return arg2;
	}

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.aShort102 = (short) arg0;
		this.method6757();
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)V")
	private void method6750() {
		if (this.anInt7532 == 0) {
			return;
		}
		if (this.method6752() && this.method6745()) {
			this.aClass4_Sub2_15.method7251(this.aClass204_4.anInterface16_9, 0);
			this.aClass4_Sub2_15.method7251(this.aClass204_2.anInterface16_9, 1);
			this.aClass4_Sub2_15.method7251(this.aClass204_1.anInterface16_9, 2);
			@Pc(63) boolean local63;
			if ((this.anInt7580 & 0x37) == 0) {
				this.aClass4_Sub2_15.method7299(false);
				local63 = false;
				this.aClass4_Sub2_15.method7268(this.aClass4_Sub2_15.aClass310_20);
			} else {
				local63 = true;
				this.aClass4_Sub2_15.method7299(true);
				this.aClass4_Sub2_15.method7268(this.aClass4_Sub2_15.aClass310_21);
				this.aClass4_Sub2_15.method7251(this.aClass204_3.anInterface16_9, 3);
			}
			for (@Pc(96) int local96 = 0; local96 < this.anIntArray714.length; local96++) {
				@Pc(103) int local103 = this.anIntArray715[local96];
				@Pc(110) int local110 = this.anIntArray715[local96 + 1];
				@Pc(117) int local117 = this.aShortArray124[local103] & 0xFFFF;
				if (local117 == 65535) {
					local117 = -1;
				}
				this.aClass4_Sub2_15.method7281(local117, true, local63);
				this.aClass4_Sub2_15.method7291(this.anIntArray714[local96], this.anIntArray713[local96], Static416.aClass263_5, this.aClass129_1.anInterface9_4, local110 - local103, local103 * 3);
			}
		}
		this.method6740();
	}

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "(I)V")
	private void method6751() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt7603; local23++) {
			@Pc(30) int local30 = this.anIntArray716[local23];
			@Pc(35) int local35 = this.anIntArray711[local23];
			if (local13 < local30) {
				local13 = local30;
			}
			if (local35 < local9) {
				local9 = local35;
			}
			if (local7 > local30) {
				local7 = local30;
			}
			@Pc(59) int local59 = this.anIntArray710[local23];
			if (local15 < local35) {
				local15 = local35;
			}
			if (local17 < local59) {
				local17 = local59;
			}
			if (local11 > local59) {
				local11 = local59;
			}
			@Pc(95) int local95 = local30 * local30 + local59 * local59;
			if (local19 < local95) {
				local19 = local95;
			}
			local95 = local35 * local35 + local30 * local30 + local59 * local59;
			if (local95 > local21) {
				local21 = local95;
			}
		}
		this.anInt7542 = local11;
		this.anInt7591 = local17;
		this.anInt7538 = local13;
		this.anInt7558 = local9;
		this.anInt7562 = local15;
		this.anInt7582 = local7;
		this.anInt7544 = (int) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.lb = true;
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)V")
	@Override
	public void b(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class200_Sub1.lb[arg0];
		@Pc(13) int local13 = Class200_Sub1.anIntArray576[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7603; local15++) {
			@Pc(33) int local33 = this.anIntArray711[local15] * local9 + local13 * this.anIntArray716[local15] >> 15;
			this.anIntArray711[local15] = local13 * this.anIntArray711[local15] - this.anIntArray716[local15] * local9 >> 15;
			this.anIntArray716[local15] = local33;
		}
		this.method6754();
		this.lb = false;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class97 method6770(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(16) Class97_Sub2 local16;
		@Pc(12) Class97_Sub2 local12;
		if (arg0 == 1) {
			local12 = this.aClass4_Sub2_15.aClass97_Sub2_28;
			local16 = this.aClass4_Sub2_15.aClass97_Sub2_26;
		} else if (arg0 == 2) {
			local12 = this.aClass4_Sub2_15.aClass97_Sub2_21;
			local16 = this.aClass4_Sub2_15.aClass97_Sub2_25;
		} else if (arg0 == 3) {
			local16 = this.aClass4_Sub2_15.aClass97_Sub2_27;
			local12 = this.aClass4_Sub2_15.aClass97_Sub2_23;
		} else if (arg0 == 4) {
			local16 = this.aClass4_Sub2_15.aClass97_Sub2_30;
			local12 = this.aClass4_Sub2_15.aClass97_Sub2_29;
		} else if (arg0 == 5) {
			local12 = this.aClass4_Sub2_15.aClass97_Sub2_22;
			local16 = this.aClass4_Sub2_15.aClass97_Sub2_24;
		} else {
			local16 = local12 = new Class97_Sub2(this.aClass4_Sub2_15, 0, 0, true, false);
		}
		return this.method6748(arg1, arg0 != 0, local16, arg2, local12);
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(Z)Z")
	private boolean method6752() {
		@Pc(13) boolean local13 = !this.aClass204_2.aBoolean465;
		@Pc(26) boolean local26 = (this.anInt7580 & 0x37) != 0 && !this.aClass204_3.aBoolean465;
		@Pc(34) boolean local34 = !this.aClass204_4.aBoolean465;
		@Pc(42) boolean local42 = !this.aClass204_1.aBoolean465;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(61) boolean local61 = true;
		@Pc(80) Interface16 local80;
		@Pc(94) Buffer local94;
		if (local34) {
			if (this.aClass204_4.anInterface16_8 == null) {
				this.aClass204_4.anInterface16_8 = this.aClass4_Sub2_15.method7250(this.aBoolean567);
			}
			local80 = this.aClass204_4.anInterface16_8;
			local80.method7616(this.anInt7541 * 12, 12);
			local94 = local80.method7613();
			if (local94 == null) {
				local61 = false;
			} else {
				this.aClass4_Sub2_15.aNativeInterface3.copyPositions(this.anIntArray716, this.anIntArray711, this.anIntArray710, this.aShortArray121, 0, 12, this.anInt7541, local94.getAddress());
				if (local80.method7614()) {
					this.aClass204_4.anInterface16_9 = local80;
					this.aClass204_4.aBoolean465 = true;
				} else {
					local61 = false;
				}
			}
		}
		@Pc(207) short[] local207;
		@Pc(211) short[] local211;
		@Pc(203) short[] local203;
		@Pc(215) byte[] local215;
		if (local13) {
			if (this.aClass204_2.anInterface16_8 == null) {
				this.aClass204_2.anInterface16_8 = this.aClass4_Sub2_15.method7250(this.aBoolean567);
			}
			local80 = this.aClass204_2.anInterface16_8;
			local80.method7616(this.anInt7541 * 4, 4);
			local94 = local80.method7613();
			if (local94 == null) {
				local61 = false;
			} else {
				if ((this.anInt7580 & 0x37) == 0) {
					if (this.aClass282_1 == null) {
						local207 = this.aShortArray123;
						local215 = this.aByteArray99;
						local211 = this.aShortArray116;
						local203 = this.aShortArray127;
					} else {
						local203 = this.aClass282_1.aShortArray142;
						local207 = this.aClass282_1.aShortArray141;
						local211 = this.aClass282_1.aShortArray143;
						local215 = this.aClass282_1.aByteArray113;
					}
					this.aClass4_Sub2_15.aNativeInterface3.copyLighting(this.aShortArray126, this.aByteArray100, this.aShortArray124, local207, local211, local203, local215, this.aShort102, this.aShort101, this.aShortArray118, 0, 4, this.anInt7541, local94.getAddress());
				} else {
					this.aClass4_Sub2_15.aNativeInterface3.copyColours(this.aShortArray126, this.aByteArray100, this.aShortArray124, this.aShort102, this.aShortArray118, 0, 4, this.anInt7541, local94.getAddress());
				}
				if (local80.method7614()) {
					this.aClass204_2.anInterface16_9 = local80;
					this.aClass204_2.aBoolean465 = true;
				} else {
					local61 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass204_3.anInterface16_8 == null) {
				this.aClass204_3.anInterface16_8 = this.aClass4_Sub2_15.method7250(this.aBoolean567);
			}
			local80 = this.aClass204_3.anInterface16_8;
			local80.method7616(this.anInt7541 * 12, 12);
			local94 = local80.method7613();
			if (local94 == null) {
				local61 = false;
			} else {
				if (this.aClass282_1 == null) {
					local211 = this.aShortArray116;
					local215 = this.aByteArray99;
					local203 = this.aShortArray127;
					local207 = this.aShortArray123;
				} else {
					local215 = this.aClass282_1.aByteArray113;
					local211 = this.aClass282_1.aShortArray143;
					local207 = this.aClass282_1.aShortArray141;
					local203 = this.aClass282_1.aShortArray142;
				}
				this.aClass4_Sub2_15.aNativeInterface3.copyNormals(local207, local211, local203, local215, 3.0F / (float) this.aShort101, 3.0F / (float) (this.aShort101 / 2 + this.aShort101), 0, 12, this.anInt7541, local94.getAddress());
				if (local80.method7614()) {
					this.aClass204_3.anInterface16_9 = local80;
					this.aClass204_3.aBoolean465 = true;
				} else {
					local61 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass204_1.anInterface16_8 == null) {
				this.aClass204_1.anInterface16_8 = this.aClass4_Sub2_15.method7250(this.aBoolean567);
			}
			local80 = this.aClass204_1.anInterface16_8;
			local80.method7616(this.anInt7541 * 8, 8);
			local94 = local80.method7613();
			if (local94 == null) {
				local61 = false;
			} else {
				this.aClass4_Sub2_15.aNativeInterface3.copyTexCoords(this.aFloatArray62, this.aFloatArray61, 0, 8, this.anInt7541, local94.getAddress());
				if (local80.method7614()) {
					this.aClass204_1.aBoolean465 = true;
					this.aClass204_1.anInterface16_9 = local80;
				} else {
					local61 = false;
				}
			}
		}
		return local61;
	}

	@OriginalMember(owner = "client!rw", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7603; local3++) {
			if (arg0 != 128) {
				this.anIntArray716[local3] = arg0 * this.anIntArray716[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray711[local3] = this.anIntArray711[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray710[local3] = this.anIntArray710[local3] * arg2 >> 7;
			}
		}
		this.method6754();
		this.lb = false;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!sg;B)V")
	private void method6753(@OriginalArg(0) Class128_Sub3 arg0) {
		@Pc(10) int local10;
		if (this.aClass68Array6 != null) {
			for (local10 = 0; local10 < this.aClass68Array6.length; local10++) {
				@Pc(17) Class68 local17 = this.aClass68Array6[local10];
				@Pc(19) Class68 local19 = local17;
				if (local17.aClass68_1 != null) {
					local19 = local17.aClass68_1;
				}
				local19.anInt1946 = (int) ((float) this.anIntArray711[local17.anInt1933] * arg0.aFloat156 + (float) this.anIntArray716[local17.anInt1933] * arg0.aFloat161 + (float) this.anIntArray710[local17.anInt1933] * arg0.aFloat152 + arg0.aFloat155);
				local19.anInt1940 = (int) (arg0.aFloat151 + (float) this.anIntArray711[local17.anInt1933] * arg0.aFloat158 + arg0.aFloat159 * (float) this.anIntArray716[local17.anInt1933] + arg0.aFloat160 * (float) this.anIntArray710[local17.anInt1933]);
				local19.anInt1935 = (int) (arg0.aFloat157 * (float) this.anIntArray716[local17.anInt1933] + arg0.aFloat154 * (float) this.anIntArray711[local17.anInt1933] + (float) this.anIntArray710[local17.anInt1933] * arg0.aFloat153 + arg0.aFloat150);
				local19.anInt1939 = (int) (arg0.aFloat161 * (float) this.anIntArray716[local17.anInt1944] + (float) this.anIntArray711[local17.anInt1944] * arg0.aFloat156 + (float) this.anIntArray710[local17.anInt1944] * arg0.aFloat152 + arg0.aFloat155);
				local19.anInt1934 = (int) ((float) this.anIntArray716[local17.anInt1944] * arg0.aFloat159 + arg0.aFloat158 * (float) this.anIntArray711[local17.anInt1944] + (float) this.anIntArray710[local17.anInt1944] * arg0.aFloat160 + arg0.aFloat151);
				local19.anInt1943 = (int) (arg0.aFloat153 * (float) this.anIntArray710[local17.anInt1944] + (float) this.anIntArray711[local17.anInt1944] * arg0.aFloat154 + arg0.aFloat157 * (float) this.anIntArray716[local17.anInt1944] + arg0.aFloat150);
				local19.anInt1941 = (int) (arg0.aFloat155 + arg0.aFloat152 * (float) this.anIntArray710[local17.anInt1938] + (float) this.anIntArray711[local17.anInt1938] * arg0.aFloat156 + (float) this.anIntArray716[local17.anInt1938] * arg0.aFloat161);
				local19.anInt1947 = (int) (arg0.aFloat151 + arg0.aFloat159 * (float) this.anIntArray716[local17.anInt1938] + arg0.aFloat158 * (float) this.anIntArray711[local17.anInt1938] + arg0.aFloat160 * (float) this.anIntArray710[local17.anInt1938]);
				local19.anInt1936 = (int) (arg0.aFloat150 + arg0.aFloat157 * (float) this.anIntArray716[local17.anInt1938] + arg0.aFloat154 * (float) this.anIntArray711[local17.anInt1938] + (float) this.anIntArray710[local17.anInt1938] * arg0.aFloat153);
			}
		}
		if (this.aClass106Array6 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass106Array6.length; local10++) {
			@Pc(358) Class106 local358 = this.aClass106Array6[local10];
			@Pc(360) Class106 local360 = local358;
			if (local358.aClass106_1 != null) {
				local360 = local358.aClass106_1;
			}
			if (local358.aClass128_3 == null) {
				local358.aClass128_3 = arg0.method6887();
			} else {
				local358.aClass128_3.EA(arg0);
			}
			local360.anInt2800 = (int) (arg0.aFloat161 * (float) this.anIntArray716[local358.anInt2810] + arg0.aFloat156 * (float) this.anIntArray711[local358.anInt2810] + (float) this.anIntArray710[local358.anInt2810] * arg0.aFloat152 + arg0.aFloat155);
			local360.anInt2801 = (int) ((float) this.anIntArray710[local358.anInt2810] * arg0.aFloat160 + arg0.aFloat159 * (float) this.anIntArray716[local358.anInt2810] + (float) this.anIntArray711[local358.anInt2810] * arg0.aFloat158 + arg0.aFloat151);
			local360.anInt2809 = (int) ((float) this.anIntArray716[local358.anInt2810] * arg0.aFloat157 + (float) this.anIntArray711[local358.anInt2810] * arg0.aFloat154 + arg0.aFloat153 * (float) this.anIntArray710[local358.anInt2810] + arg0.aFloat150);
		}
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(B)V")
	private void method6754() {
		if (this.aClass204_4 != null) {
			this.aClass204_4.aBoolean465 = false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IJIFIIFLclient!ei;IIB)S")
	private short method6755(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) Class81 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(10) int local10 = this.anIntArray709[arg8];
		@Pc(17) int local17 = this.anIntArray709[arg8 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(29) int local29 = local10; local29 < local17; local29++) {
			@Pc(36) short local36 = this.aShortArray120[local29];
			if (local36 == 0) {
				local19 = local29;
				break;
			}
			if (Static538.aLongArray18[local29] == arg1) {
				return (short) (local36 - 1);
			}
		}
		this.aShortArray120[local19] = (short) (this.anInt7541 + 1);
		Static538.aLongArray18[local19] = arg1;
		this.aShortArray118[this.anInt7541] = (short) arg4;
		this.aShortArray121[this.anInt7541] = (short) arg8;
		this.aShortArray123[this.anInt7541] = (short) arg2;
		this.aShortArray116[this.anInt7541] = (short) arg0;
		this.aShortArray127[this.anInt7541] = (short) arg9;
		this.aByteArray99[this.anInt7541] = (byte) arg5;
		this.aFloatArray62[this.anInt7541] = arg3;
		this.aFloatArray61[this.anInt7541] = arg6;
		return (short) this.anInt7541++;
	}

	@OriginalMember(owner = "client!rw", name = "sa", descriptor = "()Z")
	@Override
	protected boolean sa() {
		if (this.anIntArrayArray102 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt7555; local12++) {
			this.anIntArray716[local12] <<= 0x4;
			this.anIntArray711[local12] <<= 0x4;
			this.anIntArray710[local12] <<= 0x4;
		}
		Static481.anInt6919 = 0;
		Static369.anInt6644 = 0;
		Static37.anInt1097 = 0;
		return true;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt7598; local3++) {
			local12 = this.aShortArray126[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg0 != -1) {
				local18 -= -(arg3 * (arg0 - local18) >> 7);
			}
			@Pc(55) int local55 = local12 & 0x7F;
			if (arg2 != -1) {
				local55 += arg3 * (arg2 - local55) >> 7;
			}
			this.aShortArray126[local3] = (short) (local55 | local24 << 7 | local18 << 10);
		}
		if (this.aClass44Array1 != null) {
			for (local12 = 0; local12 < this.anInt7590; local12++) {
				@Pc(109) Class44 local109 = this.aClass44Array1[local12];
				@Pc(114) Class302 local114 = this.aClass302Array1[local12];
				local114.anInt8898 = Static107.anIntArray176[this.aShortArray126[local109.anInt1423] & 0xFFFF] & 0xFFFFFF | local114.anInt8898 & 0xFF000000;
			}
		}
		this.method6757();
	}

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "()I")
	@Override
	public int e() {
		if (!this.lb) {
			this.method6751();
		}
		return this.anInt7544;
	}

	@OriginalMember(owner = "client!rw", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	@Override
	public Class1_Sub2_Sub2 EA(@OriginalArg(0) Class1_Sub2_Sub2 arg0) {
		if (this.anInt7541 == 0) {
			return null;
		}
		if (!this.lb) {
			this.method6751();
		}
		@Pc(42) int local42;
		@Pc(58) int local58;
		if (this.aClass4_Sub2_15.anInt8302 > 0) {
			local42 = this.anInt7582 - (this.aClass4_Sub2_15.anInt8302 * this.anInt7562 >> 8) >> this.aClass4_Sub2_15.anInt8290;
			local58 = this.anInt7538 - (this.aClass4_Sub2_15.anInt8302 * this.anInt7558 >> 8) >> this.aClass4_Sub2_15.anInt8290;
		} else {
			local42 = this.anInt7582 - (this.anInt7558 * this.aClass4_Sub2_15.anInt8302 >> 8) >> this.aClass4_Sub2_15.anInt8290;
			local58 = this.anInt7538 - (this.aClass4_Sub2_15.anInt8302 * this.anInt7562 >> 8) >> this.aClass4_Sub2_15.anInt8290;
		}
		@Pc(115) int local115;
		@Pc(132) int local132;
		if (this.aClass4_Sub2_15.anInt8314 > 0) {
			local115 = this.anInt7542 - (this.aClass4_Sub2_15.anInt8314 * this.anInt7562 >> 8) >> this.aClass4_Sub2_15.anInt8290;
			local132 = this.anInt7591 - (this.anInt7558 * this.aClass4_Sub2_15.anInt8314 >> 8) >> this.aClass4_Sub2_15.anInt8290;
		} else {
			local115 = this.anInt7542 - (this.aClass4_Sub2_15.anInt8314 * this.anInt7558 >> 8) >> this.aClass4_Sub2_15.anInt8290;
			local132 = this.anInt7591 - (this.anInt7562 * this.aClass4_Sub2_15.anInt8314 >> 8) >> this.aClass4_Sub2_15.anInt8290;
		}
		@Pc(175) int local175 = local58 + 1 - local42;
		@Pc(182) int local182 = local132 + 1 - local115;
		@Pc(185) Class1_Sub2_Sub2_Sub1 local185 = (Class1_Sub2_Sub2_Sub1) arg0;
		@Pc(201) Class1_Sub2_Sub2_Sub1 local201;
		if (local185 != null && local185.method1056(local175, local182)) {
			local201 = local185;
			local185.method1060();
		} else {
			local201 = new Class1_Sub2_Sub2_Sub1(this.aClass4_Sub2_15, local175, local182);
		}
		local201.method1058(local42, local58, local115, local132);
		this.method6742(local201);
		return local201;
	}

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "(Z)V")
	private void method6756() {
		if (this.aClass129_1 != null) {
			this.aClass129_1.aBoolean309 = false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "(I)V")
	private void method6757() {
		if (this.aClass204_2 != null) {
			this.aClass204_2.aBoolean465 = false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "va", descriptor = "()I")
	@Override
	public int va() {
		if (!this.lb) {
			this.method6751();
		}
		return this.anInt7538;
	}
}
