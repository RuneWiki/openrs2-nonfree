import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class61_Sub1 extends Class61 {

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "Lclient!hga;")
	private Class136 aClass136_1;

	@OriginalMember(owner = "client!dw", name = "u", descriptor = "Lclient!qq;")
	private final Class12_Sub2 aClass12_Sub2_6;

	@OriginalMember(owner = "client!dw", name = "z", descriptor = "I")
	private int anInt2172;

	@OriginalMember(owner = "client!dw", name = "B", descriptor = "I")
	private int anInt2173;

	@OriginalMember(owner = "client!dw", name = "D", descriptor = "Lclient!hga;")
	private Class136 aClass136_2;

	@OriginalMember(owner = "client!dw", name = "M", descriptor = "I")
	private int anInt2182;

	@OriginalMember(owner = "client!dw", name = "N", descriptor = "I")
	private int anInt2183;

	@OriginalMember(owner = "client!dw", name = "Q", descriptor = "I")
	private int anInt2185;

	@OriginalMember(owner = "client!dw", name = "W", descriptor = "Z")
	private boolean aBoolean171;

	@OriginalMember(owner = "client!dw", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!dw", name = "yb", descriptor = "I")
	private int anInt2206;

	@OriginalMember(owner = "client!dw", name = "Ib", descriptor = "I")
	private int anInt2213;

	@OriginalMember(owner = "client!dw", name = "Sb", descriptor = "Z")
	private boolean aBoolean172;

	@OriginalMember(owner = "client!dw", name = "Xb", descriptor = "I")
	private int anInt2223;

	@OriginalMember(owner = "client!dw", name = "gc", descriptor = "Z")
	private boolean aBoolean173;

	@OriginalMember(owner = "client!dw", name = "qc", descriptor = "Lclient!on;")
	private Class242 aClass242_1;

	@OriginalMember(owner = "client!dw", name = "zc", descriptor = "Lclient!hga;")
	private Class136 aClass136_3;

	@OriginalMember(owner = "client!dw", name = "Ac", descriptor = "Lclient!hga;")
	private Class136 aClass136_4;

	@OriginalMember(owner = "client!dw", name = "Bc", descriptor = "I")
	private int anInt2241;

	@OriginalMember(owner = "client!dw", name = "Cc", descriptor = "I")
	private int anInt2242;

	@OriginalMember(owner = "client!dw", name = "Gc", descriptor = "Lclient!qga;")
	private Class267 aClass267_1;

	@OriginalMember(owner = "client!dw", name = "v", descriptor = "[I")
	private int[] anIntArray130;

	@OriginalMember(owner = "client!dw", name = "Jb", descriptor = "I")
	private int anInt2214;

	@OriginalMember(owner = "client!dw", name = "Cb", descriptor = "I")
	private int anInt2209;

	@OriginalMember(owner = "client!dw", name = "w", descriptor = "Z")
	private boolean aBoolean170;

	@OriginalMember(owner = "client!dw", name = "Pb", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!dw", name = "fb", descriptor = "[I")
	private int[] anIntArray131;

	@OriginalMember(owner = "client!dw", name = "Yb", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!dw", name = "hc", descriptor = "I")
	private int anInt2227;

	@OriginalMember(owner = "client!dw", name = "zb", descriptor = "I")
	private int anInt2207;

	@OriginalMember(owner = "client!dw", name = "Y", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!dw", name = "Eb", descriptor = "[Lclient!mp;")
	private Class219[] aClass219Array2;

	@OriginalMember(owner = "client!dw", name = "ec", descriptor = "[Lclient!fk;")
	private Class101[] aClass101Array2;

	@OriginalMember(owner = "client!dw", name = "Hc", descriptor = "I")
	private int anInt2245;

	@OriginalMember(owner = "client!dw", name = "kb", descriptor = "[Lclient!vg;")
	private Class342[] aClass342Array1;

	@OriginalMember(owner = "client!dw", name = "sc", descriptor = "[Lclient!gda;")
	private Class115[] aClass115Array1;

	@OriginalMember(owner = "client!dw", name = "ub", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!dw", name = "tb", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!dw", name = "Bb", descriptor = "S")
	private short aShort24;

	@OriginalMember(owner = "client!dw", name = "Fc", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!dw", name = "A", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!dw", name = "Z", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!dw", name = "Ub", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!dw", name = "O", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!dw", name = "G", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!dw", name = "S", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!dw", name = "s", descriptor = "[F")
	private float[] aFloatArray11;

	@OriginalMember(owner = "client!dw", name = "fc", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!dw", name = "sb", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!dw", name = "r", descriptor = "[F")
	private float[] aFloatArray10;

	@OriginalMember(owner = "client!dw", name = "q", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!dw", name = "ac", descriptor = "S")
	private short aShort25;

	@OriginalMember(owner = "client!dw", name = "mc", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!dw", name = "Tb", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!dw", name = "Wb", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!dw", name = "Fb", descriptor = "[I")
	private int[] anIntArray132;

	@OriginalMember(owner = "client!dw", name = "vc", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!dw", name = "jb", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!dw", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!qq;Lclient!cca;IIII)V")
	public Class61_Sub1(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface5 local11 = arg0.anInterface5_10;
		this.anIntArray130 = new int[arg1.anInt1497 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt1492];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt1492; local24++) {
			if ((arg1.aByteArray8 == null || arg1.aByteArray8[local24] != 2) && (arg1.aShortArray15 == null || arg1.aShortArray15[local24] == -1 || !local11.method4043(arg1.aShortArray15[local24] & 0xFFFF).aBoolean123)) {
				local22[this.anInt2214++] = local24;
				this.anIntArray130[arg1.aShortArray16[local24]]++;
				this.anIntArray130[arg1.aShortArray7[local24]]++;
				this.anIntArray130[arg1.aShortArray9[local24]]++;
			}
		}
		this.anInt2209 = this.anInt2214;
		@Pc(118) long[] local118 = new long[this.anInt2214];
		@Pc(130) boolean local130 = (this.anInt2213 & 0x100) != 0;
		@Pc(142) int local142;
		@Pc(153) int local153;
		@Pc(292) int local292;
		label501: for (@Pc(132) int local132 = 0; local132 < this.anInt2214; local132++) {
			@Pc(138) int local138 = local22[local132];
			@Pc(140) Class45 local140 = null;
			local142 = 0;
			@Pc(144) byte local144 = 0;
			@Pc(146) byte local146 = 0;
			@Pc(148) byte local148 = 0;
			if (arg1.aClass347Array1 != null) {
				for (local153 = 0; local153 < arg1.aClass347Array1.length; local153++) {
					@Pc(160) Class347 local160 = arg1.aClass347Array1[local153];
					if (local138 == local160.anInt9257) {
						@Pc(173) Class107 local173 = Static119.method2026(local160.anInt9253);
						if (local173.aBoolean204) {
							local118[local132] = Long.MAX_VALUE;
							this.anInt2209--;
							continue label501;
						}
					}
				}
			}
			@Pc(196) short local196 = -1;
			if (arg1.aShortArray15 != null) {
				local196 = arg1.aShortArray15[local138];
				if (local196 != -1) {
					local140 = local11.method4043(local196 & 0xFFFF);
					local148 = local140.aByte23;
					local146 = local140.aByte25;
				}
			}
			@Pc(248) boolean local248 = arg1.aByteArray5 != null && arg1.aByteArray5[local138] != 0 || local140 != null && !local140.aBoolean119 | local140.aBoolean121;
			if ((local130 || local248) && arg1.aByteArray9 != null) {
				local142 += arg1.aByteArray9[local138] << 17;
			}
			if (local248) {
				local142 += 65536;
			}
			local142 += (local146 & 0xFF) << 8;
			local142 += local148 & 0xFF;
			local292 = local144 + ((local196 & 0xFFFF) << 16);
			@Pc(298) int local298 = local292 + (local132 & 0xFFFF);
			local118[local132] = (long) local298 + ((long) local142 << 32);
			this.aBoolean170 |= local248;
		}
		Static63.method1404(local118, local22);
		this.anIntArray133 = arg1.anIntArray74;
		this.anIntArray131 = arg1.anIntArray79;
		this.anIntArray136 = arg1.anIntArray72;
		this.anInt2227 = arg1.anInt1493;
		this.anInt2207 = arg1.anInt1497;
		this.aShortArray25 = arg1.aShortArray10;
		this.aClass219Array2 = arg1.aClass219Array1;
		this.aClass101Array2 = arg1.aClass101Array1;
		@Pc(363) Class135[] local363 = new Class135[this.anInt2207];
		@Pc(383) int local383;
		@Pc(397) int local397;
		if (arg1.aClass347Array1 != null) {
			this.anInt2245 = arg1.aClass347Array1.length;
			this.aClass342Array1 = new Class342[this.anInt2245];
			this.aClass115Array1 = new Class115[this.anInt2245];
			for (local383 = 0; local383 < this.anInt2245; local383++) {
				@Pc(390) Class347 local390 = arg1.aClass347Array1[local383];
				@Pc(395) Class107 local395 = Static119.method2026(local390.anInt9253);
				local397 = -1;
				for (@Pc(399) int local399 = 0; local399 < this.anInt2214; local399++) {
					if (local22[local399] == local390.anInt9257) {
						local397 = local399;
						break;
					}
				}
				if (local397 == -1) {
					throw new RuntimeException();
				}
				local153 = Static279.anIntArray313[arg1.aShortArray13[local390.anInt9257] & 0xFFFF] & 0xFFFFFF;
				local153 |= 255 - (arg1.aByteArray5 == null ? 0 : arg1.aByteArray5[local390.anInt9257]) << 24;
				this.aClass342Array1[local383] = new Class342(local397, arg1.aShortArray16[local390.anInt9257], arg1.aShortArray7[local390.anInt9257], arg1.aShortArray9[local390.anInt9257], local395.anInt2862, local395.anInt2861, local395.anInt2865, local395.anInt2867, local395.anInt2866, local395.aBoolean204, local395.aBoolean203, local390.anInt9258);
				this.aClass115Array1[local383] = new Class115(local153);
			}
		}
		local383 = this.anInt2214 * 3;
		this.aShortArray29 = new short[local383];
		this.aShortArray28 = new short[local383];
		this.aShort24 = (short) arg3;
		this.aByteArray19 = new byte[this.anInt2214];
		this.aByteArray18 = new byte[local383];
		this.aShortArray26 = new short[this.anInt2214];
		this.aShortArray30 = new short[local383];
		if (arg1.aShortArray12 != null) {
			this.aShortArray23 = new short[this.anInt2214];
		}
		this.aShortArray22 = new short[local383];
		this.aShortArray24 = new short[local383];
		this.aFloatArray11 = new float[local383];
		this.aShortArray31 = new short[this.anInt2214];
		this.aShortArray27 = new short[this.anInt2214];
		this.aShortArray20 = new short[this.anInt2214];
		this.aFloatArray10 = new float[local383];
		this.aShortArray21 = new short[this.anInt2214];
		Static27.aLongArray3 = new long[local383];
		this.aShort25 = (short) arg4;
		this.aShortArray32 = new short[local383];
		local142 = 0;
		for (local292 = 0; local292 < arg1.anInt1497; local292++) {
			local397 = this.anIntArray130[local292];
			this.anIntArray130[local292] = local142;
			local363[local292] = new Class135();
			local142 += local397;
		}
		this.anIntArray130[arg1.anInt1497] = local142;
		@Pc(642) int[] local642 = null;
		@Pc(644) int[] local644 = null;
		@Pc(646) int[] local646 = null;
		@Pc(648) float[][] local648 = null;
		@Pc(666) int[] local666;
		@Pc(674) int local674;
		@Pc(719) int local719;
		@Pc(725) int local725;
		@Pc(738) int local738;
		@Pc(740) int local740;
		@Pc(774) int local774;
		@Pc(779) int local779;
		@Pc(942) float local942;
		@Pc(934) float local934;
		@Pc(950) float local950;
		if (arg1.aByteArray10 != null) {
			@Pc(654) int local654 = arg1.anInt1483;
			@Pc(657) int[] local657 = new int[local654];
			@Pc(660) int[] local660 = new int[local654];
			@Pc(663) int[] local663 = new int[local654];
			local666 = new int[local654];
			@Pc(669) int[] local669 = new int[local654];
			@Pc(672) int[] local672 = new int[local654];
			for (local674 = 0; local674 < local654; local674++) {
				local657[local674] = Integer.MAX_VALUE;
				local660[local674] = -2147483647;
				local663[local674] = Integer.MAX_VALUE;
				local666[local674] = -2147483647;
				local669[local674] = Integer.MAX_VALUE;
				local672[local674] = -2147483647;
			}
			local644 = new int[local654];
			local646 = new int[local654];
			local648 = new float[local654][];
			for (local719 = 0; local719 < this.anInt2214; local719++) {
				local725 = local22[local719];
				if (arg1.aByteArray10[local725] != -1) {
					local738 = arg1.aByteArray10[local725] & 0xFF;
					for (local740 = 0; local740 < 3; local740++) {
						@Pc(755) short local755;
						if (local740 == 0) {
							local755 = arg1.aShortArray16[local725];
						} else if (local740 == 1) {
							local755 = arg1.aShortArray7[local725];
						} else {
							local755 = arg1.aShortArray9[local725];
						}
						local774 = arg1.anIntArray74[local755];
						local779 = arg1.anIntArray72[local755];
						@Pc(784) int local784 = arg1.anIntArray79[local755];
						if (local774 < local657[local738]) {
							local657[local738] = local774;
						}
						if (local660[local738] < local774) {
							local660[local738] = local774;
						}
						if (local663[local738] > local779) {
							local663[local738] = local779;
						}
						if (local666[local738] < local779) {
							local666[local738] = local779;
						}
						if (local784 < local669[local738]) {
							local669[local738] = local784;
						}
						if (local784 > local672[local738]) {
							local672[local738] = local784;
						}
					}
				}
			}
			local642 = new int[local654];
			for (local725 = 0; local725 < local654; local725++) {
				@Pc(879) byte local879 = arg1.aByteArray6[local725];
				if (local879 > 0) {
					local642[local725] = (local660[local725] + local657[local725]) / 2;
					local644[local725] = (local663[local725] + local666[local725]) / 2;
					local646[local725] = (local672[local725] + local669[local725]) / 2;
					if (local879 == 1) {
						local779 = arg1.anIntArray78[local725];
						if (local779 == 0) {
							local942 = 1.0F;
							local934 = 1.0F;
						} else if (local779 > 0) {
							local942 = 1.0F;
							local934 = (float) local779 / 1024.0F;
						} else {
							local942 = (float) -local779 / 1024.0F;
							local934 = 1.0F;
						}
						local950 = 64.0F / (float) arg1.anIntArray80[local725];
					} else if (local879 == 2) {
						local934 = 64.0F / (float) arg1.anIntArray71[local725];
						local942 = 64.0F / (float) arg1.anIntArray78[local725];
						local950 = 64.0F / (float) arg1.anIntArray80[local725];
					} else {
						local942 = (float) arg1.anIntArray78[local725] / 1024.0F;
						local950 = (float) arg1.anIntArray80[local725] / 1024.0F;
						local934 = (float) arg1.anIntArray71[local725] / 1024.0F;
					}
					local648[local725] = Static333.method5002(arg1.aShortArray11[local725], arg1.aShortArray14[local725], arg1.aShortArray8[local725], local942, arg1.aByteArray11[local725] & 0xFF, local934, local950);
				}
			}
		}
		@Pc(1059) Class88[] local1059 = new Class88[arg1.anInt1492];
		@Pc(1078) short local1078;
		@Pc(1089) int local1089;
		@Pc(1100) int local1100;
		for (@Pc(1061) int local1061 = 0; local1061 < arg1.anInt1492; local1061++) {
			@Pc(1068) short local1068 = arg1.aShortArray16[local1061];
			@Pc(1073) short local1073 = arg1.aShortArray7[local1061];
			local1078 = arg1.aShortArray9[local1061];
			local1089 = this.anIntArray133[local1073] - this.anIntArray133[local1068];
			local1100 = this.anIntArray136[local1073] - this.anIntArray136[local1068];
			local674 = this.anIntArray131[local1073] - this.anIntArray131[local1068];
			local719 = this.anIntArray133[local1078] - this.anIntArray133[local1068];
			local725 = this.anIntArray136[local1078] - this.anIntArray136[local1068];
			local738 = this.anIntArray131[local1078] - this.anIntArray131[local1068];
			local740 = local1100 * local738 - local725 * local674;
			@Pc(1161) int local1161 = local674 * local719 - local738 * local1089;
			for (local774 = local725 * local1089 - local719 * local1100; local740 > 8192 || local1161 > 8192 || local774 > 8192 || local740 < -8192 || local1161 < -8192 || local774 < -8192; local774 >>= 0x1) {
				local1161 >>= 0x1;
				local740 >>= 0x1;
			}
			local779 = (int) Math.sqrt((double) (local774 * local774 + local1161 * local1161 + local740 * local740));
			if (local779 <= 0) {
				local779 = 1;
			}
			local1161 = local1161 * 256 / local779;
			local740 = local740 * 256 / local779;
			local774 = local774 * 256 / local779;
			@Pc(1255) byte local1255 = arg1.aByteArray8 == null ? 0 : arg1.aByteArray8[local1061];
			if (local1255 == 0) {
				@Pc(1261) Class135 local1261 = local363[local1068];
				local1261.anInt3889 += local740;
				local1261.anInt3887++;
				local1261.anInt3886 += local1161;
				local1261.anInt3888 += local774;
				@Pc(1289) Class135 local1289 = local363[local1073];
				local1289.anInt3889 += local740;
				local1289.anInt3886 += local1161;
				local1289.anInt3887++;
				local1289.anInt3888 += local774;
				@Pc(1317) Class135 local1317 = local363[local1078];
				local1317.anInt3887++;
				local1317.anInt3889 += local740;
				local1317.anInt3888 += local774;
				local1317.anInt3886 += local1161;
			} else if (local1255 == 1) {
				@Pc(1356) Class88 local1356 = local1059[local1061] = new Class88();
				local1356.anInt2407 = local740;
				local1356.anInt2413 = local1161;
				local1356.anInt2408 = local774;
			}
		}
		@Pc(1378) int local1378;
		for (@Pc(1372) int local1372 = 0; local1372 < this.anInt2214; local1372++) {
			local1378 = local22[local1372];
			@Pc(1385) int local1385 = arg1.aShortArray13[local1378] & 0xFFFF;
			@Pc(1390) short local1390;
			if (arg1.aShortArray15 == null) {
				local1390 = -1;
			} else {
				local1390 = arg1.aShortArray15[local1378];
			}
			if (arg1.aByteArray10 == null) {
				local1100 = -1;
			} else {
				local1100 = arg1.aByteArray10[local1378];
			}
			if (arg1.aByteArray5 == null) {
				local674 = 0;
			} else {
				local674 = arg1.aByteArray5[local1378] & 0xFF;
			}
			@Pc(1425) float local1425 = 0.0F;
			@Pc(1427) float local1427 = 0.0F;
			@Pc(1429) float local1429 = 0.0F;
			local942 = 0.0F;
			local950 = 0.0F;
			local934 = 0.0F;
			@Pc(1437) byte local1437 = 0;
			@Pc(1439) byte local1439 = 0;
			@Pc(1441) int local1441 = 0;
			@Pc(1475) byte local1475;
			@Pc(1492) short local1492;
			@Pc(1497) short local1497;
			@Pc(1502) short local1502;
			if (local1390 != -1) {
				if (local1100 == -1) {
					local1427 = 1.0F;
					local1439 = 2;
					local1429 = 1.0F;
					local1425 = 0.0F;
					local942 = 1.0F;
					local950 = 0.0F;
					local934 = 0.0F;
					local1437 = 1;
				} else {
					local1100 &= 0xFF;
					local1475 = arg1.aByteArray6[local1100];
					@Pc(1482) short local1482;
					@Pc(1487) short local1487;
					@Pc(1525) float local1525;
					@Pc(1533) float local1533;
					@Pc(1541) float local1541;
					@Pc(1622) float local1622;
					@Pc(1630) float local1630;
					@Pc(1638) float local1638;
					@Pc(1646) float local1646;
					@Pc(1655) float local1655;
					@Pc(1663) float local1663;
					if (local1475 == 0) {
						local1482 = arg1.aShortArray16[local1378];
						local1487 = arg1.aShortArray7[local1378];
						local1492 = arg1.aShortArray9[local1378];
						local1497 = arg1.aShortArray11[local1100];
						local1502 = arg1.aShortArray14[local1100];
						@Pc(1507) short local1507 = arg1.aShortArray8[local1100];
						@Pc(1513) float local1513 = (float) arg1.anIntArray74[local1497];
						@Pc(1519) float local1519 = (float) arg1.anIntArray72[local1497];
						local1525 = arg1.anIntArray79[local1497];
						local1533 = (float) arg1.anIntArray74[local1502] - local1513;
						local1541 = (float) arg1.anIntArray72[local1502] - local1519;
						@Pc(1549) float local1549 = (float) arg1.anIntArray79[local1502] - local1525;
						@Pc(1557) float local1557 = (float) arg1.anIntArray74[local1507] - local1513;
						@Pc(1565) float local1565 = (float) arg1.anIntArray72[local1507] - local1519;
						@Pc(1573) float local1573 = (float) arg1.anIntArray79[local1507] - local1525;
						@Pc(1581) float local1581 = (float) arg1.anIntArray74[local1482] - local1513;
						@Pc(1590) float local1590 = (float) arg1.anIntArray72[local1482] - local1519;
						@Pc(1598) float local1598 = (float) arg1.anIntArray79[local1482] - local1525;
						@Pc(1606) float local1606 = (float) arg1.anIntArray74[local1487] - local1513;
						@Pc(1614) float local1614 = (float) arg1.anIntArray72[local1487] - local1519;
						local1622 = (float) arg1.anIntArray79[local1487] - local1525;
						local1630 = (float) arg1.anIntArray74[local1492] - local1513;
						local1638 = (float) arg1.anIntArray72[local1492] - local1519;
						local1646 = (float) arg1.anIntArray79[local1492] - local1525;
						local1655 = local1573 * local1541 - local1565 * local1549;
						local1663 = local1557 * local1549 - local1573 * local1533;
						@Pc(1671) float local1671 = local1533 * local1565 - local1541 * local1557;
						@Pc(1679) float local1679 = local1671 * local1565 - local1573 * local1663;
						@Pc(1687) float local1687 = local1573 * local1655 - local1671 * local1557;
						@Pc(1695) float local1695 = local1663 * local1557 - local1655 * local1565;
						@Pc(1709) float local1709 = 1.0F / (local1679 * local1533 + local1541 * local1687 + local1695 * local1549);
						local1425 = (local1695 * local1598 + local1687 * local1590 + local1679 * local1581) * local1709;
						local1429 = (local1614 * local1687 + local1606 * local1679 + local1622 * local1695) * local1709;
						local950 = local1709 * (local1646 * local1695 + local1638 * local1687 + local1630 * local1679);
						@Pc(1759) float local1759 = local1663 * local1533 - local1655 * local1541;
						@Pc(1768) float local1768 = local1541 * local1671 - local1549 * local1663;
						@Pc(1777) float local1777 = local1655 * local1549 - local1533 * local1671;
						@Pc(1791) float local1791 = 1.0F / (local1777 * local1565 + local1768 * local1557 + local1573 * local1759);
						local1427 = (local1598 * local1759 + local1768 * local1581 + local1590 * local1777) * local1791;
						local934 = local1791 * (local1646 * local1759 + local1768 * local1630 + local1638 * local1777);
						local942 = local1791 * (local1614 * local1777 + local1768 * local1606 + local1622 * local1759);
					} else {
						local1482 = arg1.aShortArray16[local1378];
						local1487 = arg1.aShortArray7[local1378];
						local1492 = arg1.aShortArray9[local1378];
						@Pc(1854) int local1854 = local642[local1100];
						@Pc(1858) int local1858 = local644[local1100];
						@Pc(1862) int local1862 = local646[local1100];
						@Pc(1866) float[] local1866 = local648[local1100];
						@Pc(1871) byte local1871 = arg1.aByteArray7[local1100];
						local1525 = (float) arg1.anIntArray76[local1100] / 256.0F;
						if (local1475 == 1) {
							local1533 = (float) arg1.anIntArray71[local1100] / 1024.0F;
							Static195.method3396(arg1.anIntArray79[local1482], local1871, local1533, local1854, local1858, arg1.anIntArray72[local1482], local1862, local1866, arg1.anIntArray74[local1482], local1525);
							local1425 = Static279.aFloat116;
							local1427 = Static366.aFloat160;
							Static195.method3396(arg1.anIntArray79[local1487], local1871, local1533, local1854, local1858, arg1.anIntArray72[local1487], local1862, local1866, arg1.anIntArray74[local1487], local1525);
							local942 = Static366.aFloat160;
							local1429 = Static279.aFloat116;
							Static195.method3396(arg1.anIntArray79[local1492], local1871, local1533, local1854, local1858, arg1.anIntArray72[local1492], local1862, local1866, arg1.anIntArray74[local1492], local1525);
							local934 = Static366.aFloat160;
							local950 = Static279.aFloat116;
							local1541 = local1533 / 2.0F;
							if ((local1871 & 0x1) == 0) {
								if (local1541 < local950 - local1425) {
									local1439 = 1;
									local950 -= local1533;
								} else if (local1541 < local1425 - local950) {
									local950 += local1533;
									local1439 = 2;
								}
								if (local1541 < local1429 - local1425) {
									local1429 -= local1533;
									local1437 = 1;
								} else if (local1425 - local1429 > local1541) {
									local1429 += local1533;
									local1437 = 2;
								}
							} else {
								if (local1541 < local934 - local1427) {
									local934 -= local1533;
									local1439 = 1;
								} else if (local1427 - local934 > local1541) {
									local934 += local1533;
									local1439 = 2;
								}
								if (local942 - local1427 > local1541) {
									local942 -= local1533;
									local1437 = 1;
								} else if (local1427 - local942 > local1541) {
									local1437 = 2;
									local942 += local1533;
								}
							}
						} else if (local1475 == 2) {
							local1533 = (float) arg1.anIntArray81[local1100] / 256.0F;
							local1541 = (float) arg1.anIntArray73[local1100] / 256.0F;
							@Pc(2122) int local2122 = arg1.anIntArray74[local1487] - arg1.anIntArray74[local1482];
							@Pc(2133) int local2133 = arg1.anIntArray72[local1487] - arg1.anIntArray72[local1482];
							@Pc(2144) int local2144 = arg1.anIntArray79[local1487] - arg1.anIntArray79[local1482];
							@Pc(2155) int local2155 = arg1.anIntArray74[local1492] - arg1.anIntArray74[local1482];
							@Pc(2166) int local2166 = arg1.anIntArray72[local1492] - arg1.anIntArray72[local1482];
							@Pc(2177) int local2177 = arg1.anIntArray79[local1492] - arg1.anIntArray79[local1482];
							@Pc(2186) int local2186 = local2133 * local2177 - local2144 * local2166;
							@Pc(2194) int local2194 = local2155 * local2144 - local2122 * local2177;
							@Pc(2203) int local2203 = local2122 * local2166 - local2133 * local2155;
							local1622 = 64.0F / (float) arg1.anIntArray78[local1100];
							local1630 = 64.0F / (float) arg1.anIntArray80[local1100];
							local1638 = 64.0F / (float) arg1.anIntArray71[local1100];
							local1646 = (local1866[0] * (float) local2186 + local1866[1] * (float) local2194 + (float) local2203 * local1866[2]) / local1622;
							local1655 = (local1866[3] * (float) local2186 + (float) local2194 * local1866[4] + local1866[5] * (float) local2203) / local1630;
							local1663 = (local1866[6] * (float) local2186 + (float) local2194 * local1866[7] + local1866[8] * (float) local2203) / local1638;
							local1441 = Static346.method5122(local1663, local1646, local1655);
							Static233.method3822(arg1.anIntArray72[local1482], arg1.anIntArray74[local1482], local1533, local1871, local1862, local1854, local1866, arg1.anIntArray79[local1482], local1525, local1858, local1541, local1441);
							local1425 = Static84.aFloat38;
							local1427 = Static87.aFloat39;
							Static233.method3822(arg1.anIntArray72[local1487], arg1.anIntArray74[local1487], local1533, local1871, local1862, local1854, local1866, arg1.anIntArray79[local1487], local1525, local1858, local1541, local1441);
							local942 = Static87.aFloat39;
							local1429 = Static84.aFloat38;
							Static233.method3822(arg1.anIntArray72[local1492], arg1.anIntArray74[local1492], local1533, local1871, local1862, local1854, local1866, arg1.anIntArray79[local1492], local1525, local1858, local1541, local1441);
							local950 = Static84.aFloat38;
							local934 = Static87.aFloat39;
						} else if (local1475 == 3) {
							Static478.method6713(arg1.anIntArray79[local1482], local1862, local1866, local1854, local1525, arg1.anIntArray72[local1482], arg1.anIntArray74[local1482], local1871, local1858);
							local1427 = Static333.aFloat151;
							local1425 = Static393.aFloat175;
							Static478.method6713(arg1.anIntArray79[local1487], local1862, local1866, local1854, local1525, arg1.anIntArray72[local1487], arg1.anIntArray74[local1487], local1871, local1858);
							local942 = Static333.aFloat151;
							local1429 = Static393.aFloat175;
							Static478.method6713(arg1.anIntArray79[local1492], local1862, local1866, local1854, local1525, arg1.anIntArray72[local1492], arg1.anIntArray74[local1492], local1871, local1858);
							local934 = Static333.aFloat151;
							local950 = Static393.aFloat175;
							if ((local1871 & 0x1) == 0) {
								if (local950 - local1425 > 0.5F) {
									local1439 = 1;
									local950--;
								} else if (local1425 - local950 > 0.5F) {
									local1439 = 2;
									local950++;
								}
								if (local1429 - local1425 > 0.5F) {
									local1429--;
									local1437 = 1;
								} else if (local1425 - local1429 > 0.5F) {
									local1429++;
									local1437 = 2;
								}
							} else {
								if (local934 - local1427 > 0.5F) {
									local1439 = 1;
									local934--;
								} else if (local1427 - local934 > 0.5F) {
									local1439 = 2;
									local934++;
								}
								if (local942 - local1427 > 0.5F) {
									local1437 = 1;
									local942--;
								} else if (local1427 - local942 > 0.5F) {
									local942++;
									local1437 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray8 == null) {
				local1475 = 0;
			} else {
				local1475 = arg1.aByteArray8[local1378];
			}
			if (local1475 == 0) {
				@Pc(2741) long local2741 = (long) (local1100 << 2) + ((long) local674 + (long) (local1385 << 8) + (long) (local1441 << 24) << 32);
				local1492 = arg1.aShortArray16[local1378];
				local1497 = arg1.aShortArray7[local1378];
				local1502 = arg1.aShortArray9[local1378];
				@Pc(2760) Class135 local2760 = local363[local1492];
				this.aShortArray31[local1372] = this.method1937(local1372, local1427, local1425, arg1, local2741, local1492, local2760.anInt3889, local2760.anInt3888, local2760.anInt3886, local2760.anInt3887);
				@Pc(2785) Class135 local2785 = local363[local1497];
				this.aShortArray26[local1372] = this.method1937(local1372, local942, local1429, arg1, local2741 + (long) local1437, local1497, local2785.anInt3889, local2785.anInt3888, local2785.anInt3886, local2785.anInt3887);
				@Pc(2813) Class135 local2813 = local363[local1502];
				this.aShortArray27[local1372] = this.method1937(local1372, local934, local950, arg1, local2741 + (long) local1439, local1502, local2813.anInt3889, local2813.anInt3888, local2813.anInt3886, local2813.anInt3887);
			} else if (local1475 == 1) {
				@Pc(2601) Class88 local2601 = local1059[local1378];
				@Pc(2643) long local2643 = (long) ((local2601.anInt2408 + 256 << 22) + (local2601.anInt2407 > 0 ? 1024 : 2048) + (local1100 << 2) + (local2601.anInt2413 + 256 << 12)) + ((long) local674 + (long) (local1385 << 8) + (long) (local1441 << 24) << 32);
				this.aShortArray31[local1372] = this.method1937(local1372, local1427, local1425, arg1, local2643, arg1.aShortArray16[local1378], local2601.anInt2407, local2601.anInt2408, local2601.anInt2413, 0);
				this.aShortArray26[local1372] = this.method1937(local1372, local942, local1429, arg1, (long) local1437 + local2643, arg1.aShortArray7[local1378], local2601.anInt2407, local2601.anInt2408, local2601.anInt2413, 0);
				this.aShortArray27[local1372] = this.method1937(local1372, local934, local950, arg1, local2643 + (long) local1439, arg1.aShortArray9[local1378], local2601.anInt2407, local2601.anInt2408, local2601.anInt2413, 0);
			}
			if (arg1.aShortArray15 == null) {
				this.aShortArray21[local1372] = -1;
			} else {
				this.aShortArray21[local1372] = arg1.aShortArray15[local1378];
			}
			if (arg1.aByteArray5 != null) {
				this.aByteArray19[local1372] = arg1.aByteArray5[local1378];
			}
			if (arg1.aShortArray12 != null) {
				this.aShortArray23[local1372] = arg1.aShortArray12[local1378];
			}
			this.aShortArray20[local1372] = arg1.aShortArray13[local1378];
		}
		if (this.anInt2209 > 0) {
			local1378 = 1;
			local1078 = this.aShortArray21[0];
			for (local1089 = 0; local1089 < this.anInt2209; local1089++) {
				@Pc(2916) short local2916 = this.aShortArray21[local1089];
				if (local2916 != local1078) {
					local1078 = local2916;
					local1378++;
				}
			}
			this.anIntArray134 = new int[local1378];
			this.anIntArray135 = new int[local1378];
			this.anIntArray132 = new int[local1378 + 1];
			this.anIntArray132[0] = 0;
			local1100 = this.anInt2241;
			@Pc(2959) short local2959 = 0;
			local1378 = 0;
			local1078 = this.aShortArray21[0];
			for (local719 = 0; local719 < this.anInt2209; local719++) {
				@Pc(2975) short local2975 = this.aShortArray21[local719];
				if (local1078 != local2975) {
					this.anIntArray135[local1378] = local1100;
					this.anIntArray134[local1378] = local2959 + 1 - local1100;
					local1378++;
					this.anIntArray132[local1378] = local719;
					local1100 = this.anInt2241;
					local2959 = 0;
					local1078 = local2975;
				}
				@Pc(3011) short local3011 = this.aShortArray31[local719];
				if (local3011 < local1100) {
					local1100 = local3011;
				}
				if (local2959 < local3011) {
					local2959 = local3011;
				}
				local3011 = this.aShortArray26[local719];
				if (local2959 < local3011) {
					local2959 = local3011;
				}
				if (local1100 > local3011) {
					local1100 = local3011;
				}
				local3011 = this.aShortArray27[local719];
				if (local3011 < local1100) {
					local1100 = local3011;
				}
				if (local2959 < local3011) {
					local2959 = local3011;
				}
			}
			this.anIntArray135[local1378] = local1100;
			this.anIntArray134[local1378] = local2959 + 1 - local1100;
			local1378++;
			this.anIntArray132[local1378] = this.anInt2209;
		}
		Static27.aLongArray3 = null;
		this.aShortArray28 = Static112.method1972(this.aShortArray28, this.anInt2241);
		this.aShortArray29 = Static112.method1972(this.aShortArray29, this.anInt2241);
		this.aShortArray30 = Static112.method1972(this.aShortArray30, this.anInt2241);
		this.aShortArray32 = Static112.method1972(this.aShortArray32, this.anInt2241);
		this.aShortArray22 = Static112.method1972(this.aShortArray22, this.anInt2241);
		this.aByteArray18 = Static181.method2769(this.aByteArray18, this.anInt2241);
		this.aFloatArray11 = Static41.method995(this.anInt2241, this.aFloatArray11);
		this.aFloatArray10 = Static41.method995(this.anInt2241, this.aFloatArray10);
		if (arg1.anIntArray77 != null && Static535.method7304(this.lb, arg2)) {
			this.anIntArrayArray16 = arg1.method1369(false);
		}
		if (arg1.aClass347Array1 != null && Static369.method5394(arg2, this.lb)) {
			this.anIntArrayArray15 = arg1.method1367();
		}
		if (arg1.anIntArray75 != null && Static481.method6759(this.lb, arg2)) {
			local1378 = 0;
			local666 = new int[256];
			for (local1089 = 0; local1089 < this.anInt2214; local1089++) {
				local1100 = arg1.anIntArray75[local22[local1089]];
				if (local1100 >= 0) {
					@Pc(3235) int local3235 = local666[local1100]++;
					if (local1100 > local1378) {
						local1378 = local1100;
					}
				}
			}
			this.anIntArrayArray14 = new int[local1378 + 1][];
			for (local1100 = 0; local1100 <= local1378; local1100++) {
				this.anIntArrayArray14[local1100] = new int[local666[local1100]];
				local666[local1100] = 0;
			}
			for (local674 = 0; local674 < this.anInt2214; local674++) {
				local719 = arg1.anIntArray75[local22[local674]];
				if (local719 >= 0) {
					this.anIntArrayArray14[local719][local666[local719]++] = local674;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!qq;IIZZ)V")
	public Class61_Sub1(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean170 = false;
		this.aBoolean171 = false;
		this.anInt2214 = 0;
		this.anInt2227 = 0;
		this.aBoolean172 = true;
		this.aBoolean173 = false;
		this.anInt2207 = 0;
		this.anInt2241 = 0;
		this.anInt2209 = 0;
		this.aBoolean171 = arg4;
		this.anInt2213 = arg1;
		this.lb = arg2;
		this.aClass12_Sub2_6 = arg0;
		if (arg3 || Static586.method7836(this.anInt2213, this.lb)) {
			this.aClass136_1 = new Class136(Static357.method5214(this.anInt2213, this.lb));
		}
		if (arg3 || Static567.method7644(this.anInt2213, this.lb)) {
			this.aClass136_2 = new Class136(Static160.method7317(this.lb, this.anInt2213));
		}
		if (arg3 || Static192.method3391(this.anInt2213, this.lb)) {
			this.aClass136_4 = new Class136(Static563.method7586(this.lb, this.anInt2213));
		}
		if (arg3 || Static344.method5094(this.anInt2213, this.lb)) {
			this.aClass136_3 = new Class136(Static205.method3502(this.anInt2213, this.lb));
		}
		if (arg3 || Static501.method6978(this.anInt2213, this.lb)) {
			this.aClass242_1 = new Class242(Static86.method1721(this.lb, this.anInt2213));
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class61 method7591(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) Class61_Sub1 local14;
		@Pc(18) Class61_Sub1 local18;
		if (arg0 == 1) {
			local14 = this.aClass12_Sub2_6.aClass61_Sub1_25;
			local18 = this.aClass12_Sub2_6.aClass61_Sub1_30;
		} else if (arg0 == 2) {
			local18 = this.aClass12_Sub2_6.aClass61_Sub1_21;
			local14 = this.aClass12_Sub2_6.aClass61_Sub1_26;
		} else if (arg0 == 3) {
			local18 = this.aClass12_Sub2_6.aClass61_Sub1_23;
			local14 = this.aClass12_Sub2_6.aClass61_Sub1_24;
		} else if (arg0 == 4) {
			local14 = this.aClass12_Sub2_6.aClass61_Sub1_27;
			local18 = this.aClass12_Sub2_6.aClass61_Sub1_22;
		} else if (arg0 == 5) {
			local14 = this.aClass12_Sub2_6.aClass61_Sub1_29;
			local18 = this.aClass12_Sub2_6.aClass61_Sub1_28;
		} else {
			local14 = local18 = new Class61_Sub1(this.aClass12_Sub2_6, 0, 0, true, false);
		}
		return this.method1928(local18, local14, arg0 != 0, arg2, arg1);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!q;Lclient!bc;II)V")
	@Override
	public void method7592(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class20_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2241 == 0) {
			return;
		}
		@Pc(13) Class209_Sub2 local13 = this.aClass12_Sub2_6.aClass209_Sub2_16;
		if (!this.aBoolean173) {
			this.method1923();
		}
		@Pc(22) Class209_Sub2 local22 = (Class209_Sub2) arg0;
		Static100.aFloat42 = local22.aFloat149 * local13.aFloat139 + local13.aFloat140 * local22.aFloat145 + local13.aFloat143 * local22.aFloat139;
		Static106.aFloat43 = local13.aFloat142 + local13.aFloat143 * local22.aFloat142 + local22.aFloat141 * local13.aFloat139 + local13.aFloat140 * local22.aFloat138;
		@Pc(69) float local69 = (float) this.anInt2206 * Static100.aFloat42 + Static106.aFloat43;
		@Pc(77) float local77 = Static106.aFloat43 + (float) this.anInt2173 * Static100.aFloat42;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local69 > local77) {
			local87 = local69 + (float) this.anInt2182;
			local94 = (float) -this.anInt2182 + local77;
		} else {
			local87 = (float) this.anInt2182 + local77;
			local94 = (float) -this.anInt2182 + local69;
		}
		if (local94 >= this.aClass12_Sub2_6.aFloat189 || local87 <= (float) this.aClass12_Sub2_6.anInt7532) {
			return;
		}
		Static348.aFloat155 = local22.aFloat149 * local13.aFloat145 + local13.aFloat146 * local22.aFloat145 + local22.aFloat139 * local13.aFloat148;
		Static358.aFloat159 = local13.aFloat145 * local22.aFloat141 + local13.aFloat146 * local22.aFloat138 + local13.aFloat148 * local22.aFloat142 + local13.aFloat138;
		@Pc(171) float local171 = (float) this.anInt2206 * Static348.aFloat155 + Static358.aFloat159;
		@Pc(179) float local179 = Static358.aFloat159 + (float) this.anInt2173 * Static348.aFloat155;
		@Pc(194) float local194;
		@Pc(205) float local205;
		if (local179 < local171) {
			local194 = (local179 - (float) this.anInt2182) * (float) this.aClass12_Sub2_6.anInt7527;
			local205 = ((float) this.anInt2182 + local171) * (float) this.aClass12_Sub2_6.anInt7527;
		} else {
			local205 = ((float) this.anInt2182 + local179) * (float) this.aClass12_Sub2_6.anInt7527;
			local194 = (float) this.aClass12_Sub2_6.anInt7527 * ((float) -this.anInt2182 + local171);
		}
		if (this.aClass12_Sub2_6.aFloat192 <= local194 / (float) arg2 || this.aClass12_Sub2_6.aFloat198 >= local205 / (float) arg2) {
			return;
		}
		Static473.aFloat208 = local13.aFloat147 * local22.aFloat138 + local13.aFloat149 * local22.aFloat141 + local13.aFloat144 * local22.aFloat142 + local13.aFloat141;
		Static587.aFloat213 = local13.aFloat144 * local22.aFloat139 + local22.aFloat145 * local13.aFloat147 + local22.aFloat149 * local13.aFloat149;
		@Pc(297) float local297 = Static473.aFloat208 + Static587.aFloat213 * (float) this.anInt2206;
		@Pc(305) float local305 = Static473.aFloat208 + (float) this.anInt2173 * Static587.aFloat213;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local305 < local297) {
			local321 = ((float) -this.anInt2182 + local305) * (float) this.aClass12_Sub2_6.anInt7546;
			local332 = ((float) this.anInt2182 + local297) * (float) this.aClass12_Sub2_6.anInt7546;
		} else {
			local321 = (local297 - (float) this.anInt2182) * (float) this.aClass12_Sub2_6.anInt7546;
			local332 = (float) this.aClass12_Sub2_6.anInt7546 * (local305 + (float) this.anInt2182);
		}
		if (local321 / (float) arg2 >= this.aClass12_Sub2_6.aFloat185 || this.aClass12_Sub2_6.aFloat196 >= local332 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass342Array1 != null) {
			Static92.aFloat34 = local22.aFloat140 * local13.aFloat143 + local13.aFloat140 * local22.aFloat146 + local22.aFloat147 * local13.aFloat139;
			Static256.aFloat110 = local13.aFloat144 * local22.aFloat143 + local22.aFloat144 * local13.aFloat149 + local22.aFloat148 * local13.aFloat147;
			Static423.aFloat180 = local13.aFloat148 * local22.aFloat143 + local13.aFloat145 * local22.aFloat144 + local13.aFloat146 * local22.aFloat148;
			Static523.aFloat215 = local22.aFloat140 * local13.aFloat148 + local13.aFloat146 * local22.aFloat146 + local13.aFloat145 * local22.aFloat147;
			Static166.aFloat65 = local22.aFloat140 * local13.aFloat144 + local22.aFloat147 * local13.aFloat149 + local22.aFloat146 * local13.aFloat147;
			Static269.aFloat114 = local13.aFloat139 * local22.aFloat144 + local22.aFloat148 * local13.aFloat140 + local22.aFloat143 * local13.aFloat143;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.anInt2183 + this.anInt2223 >> 1;
			@Pc(507) int local507 = this.anInt2172 + this.anInt2242 >> 1;
			@Pc(526) int local526 = (int) (Static348.aFloat155 * (float) this.anInt2206 + (float) local499 * Static523.aFloat215 + Static358.aFloat159 + (float) local507 * Static423.aFloat180);
			@Pc(545) int local545 = (int) ((float) this.anInt2206 * Static587.aFloat213 + Static473.aFloat208 + Static166.aFloat65 * (float) local499 + Static256.aFloat110 * (float) local507);
			@Pc(564) int local564 = (int) ((float) local507 * Static269.aFloat114 + Static106.aFloat43 + (float) local499 * Static92.aFloat34 + Static100.aFloat42 * (float) this.anInt2206);
			@Pc(583) int local583 = (int) (Static358.aFloat159 + Static523.aFloat215 * (float) local499 + (float) this.anInt2173 * Static348.aFloat155 + (float) local507 * Static423.aFloat180);
			@Pc(602) int local602 = (int) (Static587.aFloat213 * (float) this.anInt2173 + Static473.aFloat208 + (float) local499 * Static166.aFloat65 + Static256.aFloat110 * (float) local507);
			@Pc(621) int local621 = (int) (Static106.aFloat43 + (float) local499 * Static92.aFloat34 + Static100.aFloat42 * (float) this.anInt2173 + (float) local507 * Static269.aFloat114);
			arg1.anInt902 = this.aClass12_Sub2_6.anInt7535 + local602 * this.aClass12_Sub2_6.anInt7546 / arg2;
			arg1.anInt905 = this.aClass12_Sub2_6.anInt7527 * local583 / arg2 + this.aClass12_Sub2_6.anInt7553;
			arg1.anInt904 = this.aClass12_Sub2_6.anInt7553 + this.aClass12_Sub2_6.anInt7527 * local526 / arg2;
			arg1.anInt901 = this.aClass12_Sub2_6.anInt7535 + this.aClass12_Sub2_6.anInt7546 * local545 / arg2;
			if (local564 >= this.aClass12_Sub2_6.anInt7532 || local621 >= this.aClass12_Sub2_6.anInt7532) {
				arg1.aBoolean78 = true;
				arg1.anInt903 = this.aClass12_Sub2_6.anInt7553 + (local526 + this.anInt2182) * this.aClass12_Sub2_6.anInt7527 / arg2 - arg1.anInt904;
			}
		}
		this.aClass12_Sub2_6.method6233((float) arg2);
		this.aClass12_Sub2_6.method6267();
		this.aClass12_Sub2_6.method6214(local22);
		this.method1922();
		this.method1934();
	}

	@OriginalMember(owner = "client!dw", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		if (this.aClass136_1 != null) {
			this.aClass136_1.aBoolean329 = Static357.method5214(arg0, this.lb);
		}
		if (this.aClass136_2 != null) {
			this.aClass136_2.aBoolean329 = Static160.method7317(this.lb, arg0);
		}
		if (this.aClass136_4 != null) {
			this.aClass136_4.aBoolean329 = Static563.method7586(this.lb, arg0);
		}
		if (this.aClass136_3 != null) {
			this.aClass136_3.aBoolean329 = Static205.method3502(arg0, this.lb);
		}
		this.anInt2213 = arg0;
		if (this.aClass267_1 != null && (this.anInt2213 & 0x10000) == 0) {
			this.aShortArray30 = this.aClass267_1.aShortArray82;
			this.aByteArray18 = this.aClass267_1.aByteArray78;
			this.aShortArray32 = this.aClass267_1.aShortArray81;
			this.aShortArray22 = this.aClass267_1.aShortArray80;
			this.aClass267_1 = null;
		}
		this.aBoolean172 = true;
		this.method1931();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
	private void method1922() {
		if (this.anInt2209 == 0) {
			return;
		}
		if (this.method1932() && this.method1927()) {
			this.aClass12_Sub2_6.method6276(0, this.aClass136_1.anInterface24_6);
			this.aClass12_Sub2_6.method6276(1, this.aClass136_4.anInterface24_6);
			this.aClass12_Sub2_6.method6276(2, this.aClass136_2.anInterface24_6);
			@Pc(65) boolean local65;
			if ((this.lb & 0x37) == 0) {
				this.aClass12_Sub2_6.method6161(false);
				local65 = false;
				this.aClass12_Sub2_6.method6194(this.aClass12_Sub2_6.aClass331_15);
			} else {
				this.aClass12_Sub2_6.method6161(true);
				local65 = true;
				this.aClass12_Sub2_6.method6276(3, this.aClass136_3.anInterface24_6);
				this.aClass12_Sub2_6.method6194(this.aClass12_Sub2_6.aClass331_20);
			}
			for (@Pc(98) int local98 = 0; local98 < this.anIntArray135.length; local98++) {
				@Pc(105) int local105 = this.anIntArray132[local98];
				@Pc(112) int local112 = this.anIntArray132[local98 + 1];
				@Pc(119) int local119 = this.aShortArray21[local105] & 0xFFFF;
				if (local119 == 65535) {
					local119 = -1;
				}
				this.aClass12_Sub2_6.method6236(local119, true, local65);
				this.aClass12_Sub2_6.method6274(local105 * 3, this.anIntArray135[local98], this.aClass242_1.anInterface13_5, local112 - local105, this.anIntArray134[local98], Static312.aClass165_3);
			}
		}
		this.method1931();
	}

	@OriginalMember(owner = "client!dw", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class151.anIntArray244[arg0];
		@Pc(13) int local13 = Class151.anIntArray245[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2207; local15++) {
			@Pc(34) int local34 = this.anIntArray136[local15] * local13 - this.anIntArray131[local15] * local9 >> 14;
			this.anIntArray131[local15] = local9 * this.anIntArray136[local15] + this.anIntArray131[local15] * local13 >> 14;
			this.anIntArray136[local15] = local34;
		}
		this.method1924();
		this.aBoolean173 = false;
	}

	@OriginalMember(owner = "client!dw", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean173) {
			this.method1923();
		}
		return this.anInt2173;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7600(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(22) int local22;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg4 << 4;
			local22 = arg2 << 4;
			Static576.anInt9371 = 0;
			Static201.anInt6747 = 0;
			Static353.anInt6196 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray16.length) {
					local52 = this.anIntArrayArray16[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static576.anInt9371 += this.anIntArray133[local60];
						Static201.anInt6747 += this.anIntArray136[local60];
						local30++;
						Static353.anInt6196 += this.anIntArray131[local60];
					}
				}
			}
			if (local30 <= 0) {
				Static201.anInt6747 = local14;
				Static576.anInt9371 = local22;
				Static353.anInt6196 = local18;
			} else {
				Static201.anInt6747 = local14 + Static201.anInt6747 / local30;
				Static576.anInt9371 = Static576.anInt9371 / local30 + local22;
				Static353.anInt6196 = Static353.anInt6196 / local30 + local18;
			}
			return;
		}
		@Pc(157) int[] local157;
		@Pc(159) int local159;
		if (arg0 == 1) {
			local18 = arg4 << 4;
			local22 = arg2 << 4;
			local14 = arg3 << 4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray16.length) {
					local157 = this.anIntArrayArray16[local32];
					for (local159 = 0; local159 < local157.length; local159++) {
						local54 = local157[local159];
						this.anIntArray133[local54] += local22;
						this.anIntArray136[local54] += local14;
						this.anIntArray131[local54] += local18;
					}
				}
			}
			return;
		}
		@Pc(277) int local277;
		@Pc(295) int local295;
		@Pc(753) int local753;
		@Pc(762) int local762;
		if (arg0 == 2) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray16.length) {
					local157 = this.anIntArrayArray16[local32];
					if ((arg5 & 0x1) == 0) {
						for (local159 = 0; local159 < local157.length; local159++) {
							local54 = local157[local159];
							this.anIntArray133[local54] -= Static576.anInt9371;
							this.anIntArray136[local54] -= Static201.anInt6747;
							this.anIntArray131[local54] -= Static353.anInt6196;
							if (arg4 != 0) {
								local60 = Class151.anIntArray244[arg4];
								local277 = Class151.anIntArray245[arg4];
								local295 = this.anIntArray136[local54] * local60 + this.anIntArray133[local54] * local277 + 16383 >> 14;
								this.anIntArray136[local54] = local277 * this.anIntArray136[local54] + 16383 - local60 * this.anIntArray133[local54] >> 14;
								this.anIntArray133[local54] = local295;
							}
							if (arg2 != 0) {
								local60 = Class151.anIntArray244[arg2];
								local277 = Class151.anIntArray245[arg2];
								local295 = this.anIntArray136[local54] * local277 + 16383 - this.anIntArray131[local54] * local60 >> 14;
								this.anIntArray131[local54] = local60 * this.anIntArray136[local54] + this.anIntArray131[local54] * local277 + 16383 >> 14;
								this.anIntArray136[local54] = local295;
							}
							if (arg3 != 0) {
								local60 = Class151.anIntArray244[arg3];
								local277 = Class151.anIntArray245[arg3];
								local295 = local60 * this.anIntArray131[local54] + this.anIntArray133[local54] * local277 + 16383 >> 14;
								this.anIntArray131[local54] = local277 * this.anIntArray131[local54] + 16383 - this.anIntArray133[local54] * local60 >> 14;
								this.anIntArray133[local54] = local295;
							}
							this.anIntArray133[local54] += Static576.anInt9371;
							this.anIntArray136[local54] += Static201.anInt6747;
							this.anIntArray131[local54] += Static353.anInt6196;
						}
					} else {
						for (local159 = 0; local159 < local157.length; local159++) {
							local54 = local157[local159];
							this.anIntArray133[local54] -= Static576.anInt9371;
							this.anIntArray136[local54] -= Static201.anInt6747;
							this.anIntArray131[local54] -= Static353.anInt6196;
							if (arg2 != 0) {
								local60 = Class151.anIntArray244[arg2];
								local277 = Class151.anIntArray245[arg2];
								local295 = local277 * this.anIntArray136[local54] + 16383 - local60 * this.anIntArray131[local54] >> 14;
								this.anIntArray131[local54] = local277 * this.anIntArray131[local54] + this.anIntArray136[local54] * local60 + 16383 >> 14;
								this.anIntArray136[local54] = local295;
							}
							if (arg4 != 0) {
								local60 = Class151.anIntArray244[arg4];
								local277 = Class151.anIntArray245[arg4];
								local295 = this.anIntArray136[local54] * local60 + local277 * this.anIntArray133[local54] + 16383 >> 14;
								this.anIntArray136[local54] = local277 * this.anIntArray136[local54] + 16383 - this.anIntArray133[local54] * local60 >> 14;
								this.anIntArray133[local54] = local295;
							}
							if (arg3 != 0) {
								local60 = Class151.anIntArray244[arg3];
								local277 = Class151.anIntArray245[arg3];
								local295 = local60 * this.anIntArray131[local54] + local277 * this.anIntArray133[local54] + 16383 >> 14;
								this.anIntArray131[local54] = this.anIntArray131[local54] * local277 + 16383 - this.anIntArray133[local54] * local60 >> 14;
								this.anIntArray133[local54] = local295;
							}
							this.anIntArray133[local54] += Static576.anInt9371;
							this.anIntArray136[local54] += Static201.anInt6747;
							this.anIntArray131[local54] += Static353.anInt6196;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray16.length > local38) {
						local52 = this.anIntArrayArray16[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local277 = this.anIntArray130[local60];
							local295 = this.anIntArray130[local60 + 1];
							for (local753 = local277; local753 < local295; local753++) {
								local762 = this.aShortArray24[local753] - 1;
								if (local762 == -1) {
									break;
								}
								@Pc(771) int local771;
								@Pc(775) int local775;
								@Pc(793) int local793;
								if (arg4 != 0) {
									local771 = Class151.anIntArray244[arg4];
									local775 = Class151.anIntArray245[arg4];
									local793 = local775 * this.aShortArray30[local762] + local771 * this.aShortArray32[local762] + 16383 >> 14;
									this.aShortArray32[local762] = (short) (local775 * this.aShortArray32[local762] + 16383 - local771 * this.aShortArray30[local762] >> 14);
									this.aShortArray30[local762] = (short) local793;
								}
								if (arg2 != 0) {
									local771 = Class151.anIntArray244[arg2];
									local775 = Class151.anIntArray245[arg2];
									local793 = local775 * this.aShortArray32[local762] + 16383 - local771 * this.aShortArray22[local762] >> 14;
									this.aShortArray22[local762] = (short) (this.aShortArray32[local762] * local771 + local775 * this.aShortArray22[local762] + 16383 >> 14);
									this.aShortArray32[local762] = (short) local793;
								}
								if (arg3 != 0) {
									local771 = Class151.anIntArray244[arg3];
									local775 = Class151.anIntArray245[arg3];
									local793 = local771 * this.aShortArray22[local762] + local775 * this.aShortArray30[local762] + 16383 >> 14;
									this.aShortArray22[local762] = (short) (local775 * this.aShortArray22[local762] + 16383 - local771 * this.aShortArray30[local762] >> 14);
									this.aShortArray30[local762] = (short) local793;
								}
							}
						}
					}
				}
				this.method1929();
			}
		} else if (arg0 == 3) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray16.length) {
					local157 = this.anIntArrayArray16[local32];
					for (local159 = 0; local159 < local157.length; local159++) {
						local54 = local157[local159];
						this.anIntArray133[local54] -= Static576.anInt9371;
						this.anIntArray136[local54] -= Static201.anInt6747;
						this.anIntArray131[local54] -= Static353.anInt6196;
						this.anIntArray133[local54] = arg2 * this.anIntArray133[local54] >> 7;
						this.anIntArray136[local54] = arg3 * this.anIntArray136[local54] >> 7;
						this.anIntArray131[local54] = arg4 * this.anIntArray131[local54] >> 7;
						this.anIntArray133[local54] += Static576.anInt9371;
						this.anIntArray136[local54] += Static201.anInt6747;
						this.anIntArray131[local54] += Static353.anInt6196;
					}
				}
			}
		} else {
			@Pc(1212) Class115 local1212;
			@Pc(1104) boolean local1104;
			@Pc(1207) Class342 local1207;
			if (arg0 == 5) {
				if (this.anIntArrayArray14 != null) {
					local1104 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray14.length > local38) {
							local52 = this.anIntArrayArray14[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								local277 = (this.aByteArray19[local60] & 0xFF) + (arg2 * 8);
								if (local277 < 0) {
									local277 = 0;
								} else if (local277 > 255) {
									local277 = 255;
								}
								this.aByteArray19[local60] = (byte) local277;
							}
							local1104 |= local52.length > 0;
						}
					}
					if (local1104) {
						if (this.aClass342Array1 != null) {
							for (local38 = 0; local38 < this.anInt2245; local38++) {
								local1207 = this.aClass342Array1[local38];
								local1212 = this.aClass115Array1[local38];
								local1212.anInt2985 = 255 - (this.aByteArray19[local1207.anInt9076] & 0xFF) << 24 | local1212.anInt2985 & 0xFFFFFF;
							}
						}
						this.method1926();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray14 != null) {
					local1104 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray14.length > local38) {
							local52 = this.anIntArrayArray14[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								local277 = this.aShortArray20[local60] & 0xFFFF;
								local295 = local277 >> 10 & 0x3F;
								local753 = local277 >> 7 & 0x7;
								local753 += arg3 / 4;
								local762 = local277 & 0x7F;
								@Pc(1311) int local1311 = arg2 + local295 & 0x3F;
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
								this.aShortArray20[local60] = (short) (local762 | local753 << 7 | local1311 << 10);
							}
							local1104 |= local52.length > 0;
						}
					}
					if (local1104) {
						if (this.aClass342Array1 != null) {
							for (local38 = 0; local38 < this.anInt2245; local38++) {
								local1207 = this.aClass342Array1[local38];
								local1212 = this.aClass115Array1[local38];
								local1212.anInt2985 = local1212.anInt2985 & 0xFF000000 | Static279.anIntArray313[this.aShortArray20[local1207.anInt9076] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method1926();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray15 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray15.length) {
							local157 = this.anIntArrayArray15[local32];
							for (local159 = 0; local159 < local157.length; local159++) {
								local1212 = this.aClass115Array1[local157[local159]];
								local1212.anInt2982 += arg2;
								local1212.anInt2989 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray15 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray15.length) {
							local157 = this.anIntArrayArray15[local32];
							for (local159 = 0; local159 < local157.length; local159++) {
								local1212 = this.aClass115Array1[local157[local159]];
								local1212.anInt2991 = arg3 * local1212.anInt2991 >> 7;
								local1212.anInt2984 = arg2 * local1212.anInt2984 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray15 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray15.length) {
						local157 = this.anIntArrayArray15[local32];
						for (local159 = 0; local159 < local157.length; local159++) {
							local1212 = this.aClass115Array1[local157[local159]];
							local1212.anInt2990 = arg2 + local1212.anInt2990 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V")
	private void method1923() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2207; local23++) {
			@Pc(30) int local30 = this.anIntArray133[local23];
			@Pc(35) int local35 = this.anIntArray136[local23];
			if (local15 < local35) {
				local15 = local35;
			}
			if (local7 > local30) {
				local7 = local30;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			@Pc(67) int local67 = this.anIntArray131[local23];
			if (local35 < local9) {
				local9 = local35;
			}
			if (local67 > local17) {
				local17 = local67;
			}
			if (local67 < local11) {
				local11 = local67;
			}
			@Pc(98) int local98 = local67 * local67 + local30 * local30;
			if (local19 < local98) {
				local19 = local98;
			}
			local98 = local35 * local35 + local67 * local67 + local30 * local30;
			if (local21 < local98) {
				local21 = local98;
			}
		}
		this.anInt2172 = local17;
		this.anInt2223 = local13;
		this.anInt2206 = local9;
		this.anInt2242 = local11;
		this.anInt2173 = local15;
		this.anInt2183 = local7;
		this.anInt2182 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt2185 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean173 = true;
	}

	@OriginalMember(owner = "client!dw", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			Static353.anInt6196 = 0;
			Static201.anInt6747 = 0;
			Static576.anInt9371 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray16.length) {
					local52 = this.anIntArrayArray16[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray25 == null || (this.aShortArray25[local60] & arg6) != 0) {
							Static576.anInt9371 += this.anIntArray133[local60];
							Static201.anInt6747 += this.anIntArray136[local60];
							Static353.anInt6196 += this.anIntArray131[local60];
							local30++;
						}
					}
				}
			}
			if (local30 <= 0) {
				Static201.anInt6747 = arg3;
				Static576.anInt9371 = arg2;
				Static353.anInt6196 = arg4;
			} else {
				Static353.anInt6196 = Static353.anInt6196 / local30 + arg4;
				Static201.anInt6747 = Static201.anInt6747 / local30 + arg3;
				Static504.aBoolean623 = true;
				Static576.anInt9371 = Static576.anInt9371 / local30 + arg2;
			}
			return;
		}
		@Pc(253) int[] local253;
		@Pc(255) int local255;
		if (arg0 == 1) {
			if (arg7 != null) {
				local30 = arg4 * arg7[2] + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
				local32 = arg4 * arg7[5] + arg3 * arg7[4] + arg2 * arg7[3] + 8192 >> 14;
				local38 = arg4 * arg7[8] + arg7[6] * arg2 + arg3 * arg7[7] + 8192 >> 14;
				arg3 = local32;
				arg4 = local38;
				arg2 = local30;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray16.length > local32) {
					local253 = this.anIntArrayArray16[local32];
					for (local255 = 0; local255 < local253.length; local255++) {
						local54 = local253[local255];
						if (this.aShortArray25 == null || (this.aShortArray25[local54] & arg6) != 0) {
							this.anIntArray133[local54] += arg2;
							this.anIntArray136[local54] += arg3;
							this.anIntArray131[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(387) int local387;
		@Pc(405) int local405;
		@Pc(634) int local634;
		@Pc(643) int local643;
		@Pc(653) int local653;
		@Pc(657) int local657;
		@Pc(676) int local676;
		@Pc(1010) int local1010;
		@Pc(1018) int local1018;
		@Pc(1174) int local1174;
		@Pc(1199) int local1199;
		@Pc(1203) int local1203;
		@Pc(1213) int local1213;
		@Pc(1218) int local1218;
		@Pc(1222) int local1222;
		@Pc(1226) int local1226;
		@Pc(1228) int local1228;
		@Pc(1356) int[] local1356;
		@Pc(1358) int local1358;
		@Pc(1362) int local1362;
		@Pc(1366) int local1366;
		@Pc(1368) int local1368;
		@Pc(1497) int local1497;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray16.length) {
						local253 = this.anIntArrayArray16[local32];
						for (local255 = 0; local255 < local253.length; local255++) {
							local54 = local253[local255];
							if (this.aShortArray25 == null || (this.aShortArray25[local54] & arg6) != 0) {
								this.anIntArray133[local54] -= Static576.anInt9371;
								this.anIntArray136[local54] -= Static201.anInt6747;
								this.anIntArray131[local54] -= Static353.anInt6196;
								if (arg4 != 0) {
									local60 = Class151.anIntArray244[arg4];
									local387 = Class151.anIntArray245[arg4];
									local405 = local387 * this.anIntArray133[local54] + this.anIntArray136[local54] * local60 + 16383 >> 14;
									this.anIntArray136[local54] = local387 * this.anIntArray136[local54] + 16383 - this.anIntArray133[local54] * local60 >> 14;
									this.anIntArray133[local54] = local405;
								}
								if (arg2 != 0) {
									local60 = Class151.anIntArray244[arg2];
									local387 = Class151.anIntArray245[arg2];
									local405 = this.anIntArray136[local54] * local387 + 16383 - local60 * this.anIntArray131[local54] >> 14;
									this.anIntArray131[local54] = local387 * this.anIntArray131[local54] + this.anIntArray136[local54] * local60 + 16383 >> 14;
									this.anIntArray136[local54] = local405;
								}
								if (arg3 != 0) {
									local60 = Class151.anIntArray244[arg3];
									local387 = Class151.anIntArray245[arg3];
									local405 = local387 * this.anIntArray133[local54] + local60 * this.anIntArray131[local54] + 16383 >> 14;
									this.anIntArray131[local54] = local387 * this.anIntArray131[local54] + 16383 - this.anIntArray133[local54] * local60 >> 14;
									this.anIntArray133[local54] = local405;
								}
								this.anIntArray133[local54] += Static576.anInt9371;
								this.anIntArray136[local54] += Static201.anInt6747;
								this.anIntArray131[local54] += Static353.anInt6196;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray16.length > local38) {
							local52 = this.anIntArrayArray16[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray25 == null || (arg6 & this.aShortArray25[local60]) != 0) {
									local387 = this.anIntArray130[local60];
									local405 = this.anIntArray130[local60 + 1];
									for (local634 = local387; local634 < local405; local634++) {
										local643 = this.aShortArray24[local634] - 1;
										if (local643 == -1) {
											break;
										}
										if (arg4 != 0) {
											local653 = Class151.anIntArray244[arg4];
											local657 = Class151.anIntArray245[arg4];
											local676 = local653 * this.aShortArray32[local643] + this.aShortArray30[local643] * local657 + 16383 >> 14;
											this.aShortArray32[local643] = (short) (local657 * this.aShortArray32[local643] + 16383 - local653 * this.aShortArray30[local643] >> 14);
											this.aShortArray30[local643] = (short) local676;
										}
										if (arg2 != 0) {
											local653 = Class151.anIntArray244[arg2];
											local657 = Class151.anIntArray245[arg2];
											local676 = local657 * this.aShortArray32[local643] + 16383 - local653 * this.aShortArray22[local643] >> 14;
											this.aShortArray22[local643] = (short) (local657 * this.aShortArray22[local643] + local653 * this.aShortArray32[local643] + 16383 >> 14);
											this.aShortArray32[local643] = (short) local676;
										}
										if (arg3 != 0) {
											local653 = Class151.anIntArray244[arg3];
											local657 = Class151.anIntArray245[arg3];
											local676 = local653 * this.aShortArray22[local643] + local657 * this.aShortArray30[local643] + 16383 >> 14;
											this.aShortArray22[local643] = (short) (this.aShortArray22[local643] * local657 + 16383 - this.aShortArray30[local643] * local653 >> 14);
											this.aShortArray30[local643] = (short) local676;
										}
									}
								}
							}
						}
					}
					this.method1929();
					return;
				}
			} else {
				local30 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local255 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static504.aBoolean623) {
					local387 = Static353.anInt6196 * arg7[6] + arg7[3] * Static201.anInt6747 + arg7[0] * Static576.anInt9371 + 8192 >> 14;
					local405 = Static353.anInt6196 * arg7[7] + Static576.anInt9371 * arg7[1] + arg7[4] * Static201.anInt6747 + 8192 >> 14;
					local387 += local255;
					local634 = Static201.anInt6747 * arg7[5] + Static576.anInt9371 * arg7[2] + Static353.anInt6196 * arg7[8] + 8192 >> 14;
					local405 += local54;
					Static576.anInt9371 = local387;
					local634 += local60;
					Static201.anInt6747 = local405;
					Static353.anInt6196 = local634;
					Static504.aBoolean623 = false;
				}
				@Pc(978) int[] local978 = new int[9];
				local405 = Class151.anIntArray245[arg2];
				local634 = Class151.anIntArray244[arg2];
				local643 = Class151.anIntArray245[arg3];
				local653 = Class151.anIntArray244[arg3];
				local657 = Class151.anIntArray245[arg4];
				local676 = Class151.anIntArray244[arg4];
				local1010 = local634 * local657 + 8192 >> 14;
				local1018 = local634 * local676 + 8192 >> 14;
				local978[0] = local1018 * local653 + local657 * local643 + 8192 >> 14;
				local978[8] = local405 * local643 + 8192 >> 14;
				local978[5] = -local634;
				local978[3] = local676 * local405 + 8192 >> 14;
				local978[7] = local643 * local1010 + local676 * local653 + 8192 >> 14;
				local978[6] = local657 * -local653 + local1018 * local643 + 8192 >> 14;
				local978[2] = local653 * local405 + 8192 >> 14;
				local978[4] = local405 * local657 + 8192 >> 14;
				local978[1] = -local643 * local676 + local653 * local1010 + 8192 >> 14;
				@Pc(1149) int local1149 = -Static201.anInt6747 * local978[1] + -Static576.anInt9371 * local978[0] + local978[2] * -Static353.anInt6196 + 8192 >> 14;
				local1174 = -Static353.anInt6196 * local978[5] + -Static201.anInt6747 * local978[4] + -Static576.anInt9371 * local978[3] + 8192 >> 14;
				local1199 = local978[6] * -Static576.anInt9371 + -Static201.anInt6747 * local978[7] + local978[8] * -Static353.anInt6196 + 8192 >> 14;
				local1203 = Static576.anInt9371 + local1149;
				@Pc(1208) int local1208 = local1174 + Static201.anInt6747;
				local1213 = local1199 + Static353.anInt6196;
				@Pc(1216) int[] local1216 = new int[9];
				for (local1218 = 0; local1218 < 3; local1218++) {
					for (local1222 = 0; local1222 < 3; local1222++) {
						local1226 = 0;
						for (local1228 = 0; local1228 < 3; local1228++) {
							local1226 += arg7[local1222 * 3 + local1228] * local978[local1228 + local1218 * 3];
						}
						local1216[local1222 + local1218 * 3] = local1226 + 8192 >> 14;
					}
				}
				local1222 = local978[1] * local54 + local255 * local978[0] + local978[2] * local60 + 8192 >> 14;
				local1226 = local54 * local978[4] + local255 * local978[3] + local978[5] * local60 + 8192 >> 14;
				local1226 += local1208;
				local1222 += local1203;
				local1228 = local60 * local978[8] + local978[7] * local54 + local255 * local978[6] + 8192 >> 14;
				local1228 += local1213;
				local1356 = new int[9];
				for (local1358 = 0; local1358 < 3; local1358++) {
					for (local1362 = 0; local1362 < 3; local1362++) {
						local1366 = 0;
						for (local1368 = 0; local1368 < 3; local1368++) {
							local1366 += local1216[local1362 + local1368 * 3] * arg7[local1358 * 3 + local1368];
						}
						local1356[local1362 + local1358 * 3] = local1366 + 8192 >> 14;
					}
				}
				local1362 = arg7[1] * local1226 + local1222 * arg7[0] + arg7[2] * local1228 + 8192 >> 14;
				local1366 = local1228 * arg7[5] + arg7[3] * local1222 + arg7[4] * local1226 + 8192 >> 14;
				local1362 += local30;
				local1368 = local1226 * arg7[7] + local1222 * arg7[6] + local1228 * arg7[8] + 8192 >> 14;
				local1366 += local32;
				local1368 += local38;
				for (local1497 = 0; local1497 < local8; local1497++) {
					@Pc(1503) int local1503 = arg1[local1497];
					if (this.anIntArrayArray16.length > local1503) {
						@Pc(1513) int[] local1513 = this.anIntArrayArray16[local1503];
						for (@Pc(1515) int local1515 = 0; local1515 < local1513.length; local1515++) {
							@Pc(1521) int local1521 = local1513[local1515];
							if (this.aShortArray25 == null || (arg6 & this.aShortArray25[local1521]) != 0) {
								@Pc(1562) int local1562 = local1356[1] * this.anIntArray136[local1521] + local1356[0] * this.anIntArray133[local1521] + this.anIntArray131[local1521] * local1356[2] + 8192 >> 14;
								@Pc(1593) int local1593 = this.anIntArray136[local1521] * local1356[4] + local1356[3] * this.anIntArray133[local1521] + this.anIntArray131[local1521] * local1356[5] + 8192 >> 14;
								@Pc(1624) int local1624 = local1356[8] * this.anIntArray131[local1521] + local1356[6] * this.anIntArray133[local1521] + this.anIntArray136[local1521] * local1356[7] + 8192 >> 14;
								@Pc(1628) int local1628 = local1562 + local1362;
								@Pc(1632) int local1632 = local1593 + local1366;
								@Pc(1636) int local1636 = local1624 + local1368;
								this.anIntArray133[local1521] = local1628;
								this.anIntArray136[local1521] = local1632;
								this.anIntArray131[local1521] = local1636;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2599) Class115 local2599;
			@Pc(2478) boolean local2478;
			@Pc(2594) Class342 local2594;
			if (arg0 == 5) {
				if (this.anIntArrayArray14 != null) {
					local2478 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray14.length > local38) {
							local52 = this.anIntArrayArray14[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray23 == null || (this.aShortArray23[local60] & arg6) != 0) {
									local387 = arg2 * 8 + (this.aByteArray19[local60] & 0xFF);
									if (local387 < 0) {
										local387 = 0;
									} else if (local387 > 255) {
										local387 = 255;
									}
									this.aByteArray19[local60] = (byte) local387;
								}
							}
							local2478 |= local52.length > 0;
						}
					}
					if (local2478) {
						if (this.aClass342Array1 != null) {
							for (local38 = 0; local38 < this.anInt2245; local38++) {
								local2594 = this.aClass342Array1[local38];
								local2599 = this.aClass115Array1[local38];
								local2599.anInt2985 = 255 - (this.aByteArray19[local2594.anInt9076] & 0xFF) << 24 | local2599.anInt2985 & 0xFFFFFF;
							}
						}
						this.method1926();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray14 != null) {
					local2478 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray14.length) {
							local52 = this.anIntArrayArray14[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray23 == null || (this.aShortArray23[local60] & arg6) != 0) {
									local387 = this.aShortArray20[local60] & 0xFFFF;
									local405 = local387 >> 10 & 0x3F;
									local634 = local387 >> 7 & 0x7;
									local643 = local387 & 0x7F;
									local634 += arg3 / 4;
									@Pc(2715) int local2715 = arg2 + local405 & 0x3F;
									local643 += arg4;
									if (local634 < 0) {
										local634 = 0;
									} else if (local634 > 7) {
										local634 = 7;
									}
									if (local643 < 0) {
										local643 = 0;
									} else if (local643 > 127) {
										local643 = 127;
									}
									this.aShortArray20[local60] = (short) (local643 | local2715 << 10 | local634 << 7);
								}
							}
							local2478 |= local52.length > 0;
						}
					}
					if (local2478) {
						if (this.aClass342Array1 != null) {
							for (local38 = 0; local38 < this.anInt2245; local38++) {
								local2594 = this.aClass342Array1[local38];
								local2599 = this.aClass115Array1[local38];
								local2599.anInt2985 = local2599.anInt2985 & 0xFF000000 | Static279.anIntArray313[this.aShortArray20[local2594.anInt9076] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method1926();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray15 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray15.length) {
							local253 = this.anIntArrayArray15[local32];
							for (local255 = 0; local255 < local253.length; local255++) {
								local2599 = this.aClass115Array1[local253[local255]];
								local2599.anInt2982 += arg2;
								local2599.anInt2989 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray15 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray15.length > local32) {
							local253 = this.anIntArrayArray15[local32];
							for (local255 = 0; local255 < local253.length; local255++) {
								local2599 = this.aClass115Array1[local253[local255]];
								local2599.anInt2984 = arg2 * local2599.anInt2984 >> 7;
								local2599.anInt2991 = local2599.anInt2991 * arg3 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray15 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray15.length > local32) {
						local253 = this.anIntArrayArray15[local32];
						for (local255 = 0; local255 < local253.length; local255++) {
							local2599 = this.aClass115Array1[local253[local255]];
							local2599.anInt2990 = arg2 + local2599.anInt2990 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray16.length > local32) {
					local253 = this.anIntArrayArray16[local32];
					for (local255 = 0; local255 < local253.length; local255++) {
						local54 = local253[local255];
						if (this.aShortArray25 == null || (this.aShortArray25[local54] & arg6) != 0) {
							this.anIntArray133[local54] -= Static576.anInt9371;
							this.anIntArray136[local54] -= Static201.anInt6747;
							this.anIntArray131[local54] -= Static353.anInt6196;
							this.anIntArray133[local54] = arg2 * this.anIntArray133[local54] >> 7;
							this.anIntArray136[local54] = this.anIntArray136[local54] * arg3 >> 7;
							this.anIntArray131[local54] = this.anIntArray131[local54] * arg4 >> 7;
							this.anIntArray133[local54] += Static576.anInt9371;
							this.anIntArray136[local54] += Static201.anInt6747;
							this.anIntArray131[local54] += Static353.anInt6196;
						}
					}
				}
			}
		} else {
			local30 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local255 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static504.aBoolean623) {
				local387 = arg7[6] * Static353.anInt6196 + Static576.anInt9371 * arg7[0] + arg7[3] * Static201.anInt6747 + 8192 >> 14;
				local405 = arg7[7] * Static353.anInt6196 + arg7[4] * Static201.anInt6747 + Static576.anInt9371 * arg7[1] + 8192 >> 14;
				local405 += local54;
				local634 = Static201.anInt6747 * arg7[5] + Static576.anInt9371 * arg7[2] + arg7[8] * Static353.anInt6196 + 8192 >> 14;
				local387 += local255;
				Static576.anInt9371 = local387;
				local634 += local60;
				Static201.anInt6747 = local405;
				Static504.aBoolean623 = false;
				Static353.anInt6196 = local634;
			}
			local387 = arg2 << 15 >> 7;
			local405 = arg3 << 15 >> 7;
			local634 = arg4 << 15 >> 7;
			local643 = local387 * -Static576.anInt9371 + 8192 >> 14;
			local653 = -Static201.anInt6747 * local405 + 8192 >> 14;
			local657 = local634 * -Static353.anInt6196 + 8192 >> 14;
			local676 = local643 + Static576.anInt9371;
			local1010 = Static201.anInt6747 + local653;
			local1018 = Static353.anInt6196 + local657;
			@Pc(2002) int[] local2002 = new int[] { arg7[0] * local387 + 8192 >> 14, arg7[3] * local387 + 8192 >> 14, arg7[6] * local387 + 8192 >> 14, arg7[1] * local405 + 8192 >> 14, local405 * arg7[4] + 8192 >> 14, local405 * arg7[7] + 8192 >> 14, arg7[2] * local634 + 8192 >> 14, arg7[5] * local634 + 8192 >> 14, local634 * arg7[8] + 8192 >> 14 };
			local1174 = local255 * local387 + 8192 >> 14;
			local1199 = local405 * local54 + 8192 >> 14;
			local1203 = local634 * local60 + 8192 >> 14;
			@Pc(2138) int local2138 = local1174 + local676;
			@Pc(2142) int local2142 = local1199 + local1010;
			@Pc(2146) int local2146 = local1203 + local1018;
			@Pc(2149) int[] local2149 = new int[9];
			@Pc(2155) int local2155;
			for (local1213 = 0; local1213 < 3; local1213++) {
				for (local2155 = 0; local2155 < 3; local2155++) {
					local1218 = 0;
					for (local1222 = 0; local1222 < 3; local1222++) {
						local1218 += arg7[local1222 + local1213 * 3] * local2002[local2155 + local1222 * 3];
					}
					local2149[local2155 + local1213 * 3] = local1218 + 8192 >> 14;
				}
			}
			local2155 = arg7[1] * local2142 + local2138 * arg7[0] + arg7[2] * local2146 + 8192 >> 14;
			local1218 = arg7[5] * local2146 + local2142 * arg7[4] + arg7[3] * local2138 + 8192 >> 14;
			local1218 += local32;
			local1222 = arg7[7] * local2142 + local2138 * arg7[6] + local2146 * arg7[8] + 8192 >> 14;
			local2155 += local30;
			local1222 += local38;
			for (local1226 = 0; local1226 < local8; local1226++) {
				local1228 = arg1[local1226];
				if (this.anIntArrayArray16.length > local1228) {
					local1356 = this.anIntArrayArray16[local1228];
					for (local1358 = 0; local1358 < local1356.length; local1358++) {
						local1362 = local1356[local1358];
						if (this.aShortArray25 == null || (arg6 & this.aShortArray25[local1362]) != 0) {
							local1366 = local2149[0] * this.anIntArray133[local1362] + local2149[1] * this.anIntArray136[local1362] + local2149[2] * this.anIntArray131[local1362] + 8192 >> 14;
							local1368 = this.anIntArray136[local1362] * local2149[4] + local2149[3] * this.anIntArray133[local1362] + this.anIntArray131[local1362] * local2149[5] + 8192 >> 14;
							@Pc(2396) int local2396 = local1368 + local1218;
							@Pc(2400) int local2400 = local1366 + local2155;
							local1497 = local2149[8] * this.anIntArray131[local1362] + this.anIntArray136[local1362] * local2149[7] + local2149[6] * this.anIntArray133[local1362] + 8192 >> 14;
							@Pc(2435) int local2435 = local1497 + local1222;
							this.anIntArray133[local1362] = local2400;
							this.anIntArray136[local1362] = local2396;
							this.anIntArray131[local1362] = local2435;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)V")
	private void method1924() {
		if (this.aClass136_1 != null) {
			this.aClass136_1.aBoolean327 = false;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILclient!di;)V")
	private void method1925(@OriginalArg(1) Class1_Sub3_Sub4_Sub2 arg0) {
		if (Static263.anIntArray301.length < this.anInt2241) {
			Static98.anIntArray122 = new int[this.anInt2241];
			Static263.anIntArray301 = new int[this.anInt2241];
		}
		@Pc(55) int local55;
		@Pc(94) int local94;
		@Pc(103) int local103;
		for (@Pc(28) int local28 = 0; local28 < this.anInt2207; local28++) {
			local55 = (this.anIntArray133[local28] - (this.aClass12_Sub2_6.anInt7549 * this.anIntArray136[local28] >> 8) >> this.aClass12_Sub2_6.anInt7540) - arg0.anInt2027;
			@Pc(80) int local80 = (this.anIntArray131[local28] - (this.anIntArray136[local28] * this.aClass12_Sub2_6.anInt7536 >> 8) >> this.aClass12_Sub2_6.anInt7540) - arg0.anInt2032;
			@Pc(85) int local85 = this.anIntArray130[local28];
			@Pc(92) int local92 = this.anIntArray130[local28 + 1];
			for (local94 = local85; local94 < local92; local94++) {
				local103 = this.aShortArray24[local94] - 1;
				if (local103 == -1) {
					break;
				}
				Static263.anIntArray301[local103] = local55;
				Static98.anIntArray122[local103] = local80;
			}
		}
		for (local55 = 0; local55 < this.anInt2209; local55++) {
			if (this.aByteArray19 == null || this.aByteArray19[local55] <= 128) {
				@Pc(149) short local149 = this.aShortArray31[local55];
				@Pc(154) short local154 = this.aShortArray26[local55];
				@Pc(159) short local159 = this.aShortArray27[local55];
				local94 = Static263.anIntArray301[local149];
				local103 = Static263.anIntArray301[local154];
				@Pc(171) int local171 = Static263.anIntArray301[local159];
				@Pc(175) int local175 = Static98.anIntArray122[local149];
				@Pc(179) int local179 = Static98.anIntArray122[local154];
				@Pc(183) int local183 = Static98.anIntArray122[local159];
				if ((local179 - local183) * (local94 - local103) - (local171 - local103) * (local179 - local175) > 0) {
					arg0.method1793(local103, local94, local179, local183, local171, local175);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2207; local3++) {
			if (arg0 != 0) {
				this.anIntArray133[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray136[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray131[local3] += arg2;
			}
		}
		this.method1924();
		this.aBoolean173 = false;
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(B)V")
	private void method1926() {
		if (this.aClass136_4 != null) {
			this.aClass136_4.aBoolean327 = false;
		}
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "()Z")
	@Override
	public boolean method7602() {
		if (this.aShortArray21 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray21.length; local12++) {
			if (this.aShortArray21[local12] != -1 && !this.aClass12_Sub2_6.anInterface5_10.method4045(this.aShortArray21[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)Z")
	private boolean method1927() {
		if (this.aClass242_1.aBoolean490) {
			return true;
		}
		if (this.aClass242_1.anInterface13_6 == null) {
			this.aClass242_1.anInterface13_6 = this.aClass12_Sub2_6.method6193(this.aBoolean171);
		}
		@Pc(30) Interface13 local30 = this.aClass242_1.anInterface13_6;
		local30.method7650(this.anInt2209 * 6);
		@Pc(47) Buffer local47 = local30.method7648();
		if (local47 != null) {
			@Pc(55) Stream local55 = this.aClass12_Sub2_6.method6160(local47);
			@Pc(59) int local59;
			if (Stream.c()) {
				for (local59 = 0; local59 < this.anInt2209; local59++) {
					local55.b(this.aShortArray31[local59]);
					local55.b(this.aShortArray26[local59]);
					local55.b(this.aShortArray27[local59]);
				}
			} else {
				for (local59 = 0; local59 < this.anInt2209; local59++) {
					local55.e(this.aShortArray31[local59]);
					local55.e(this.aShortArray26[local59]);
					local55.e(this.aShortArray27[local59]);
				}
			}
			local55.a();
			if (local30.method7652()) {
				this.aClass242_1.aBoolean490 = true;
				this.aBoolean172 = true;
				this.aClass242_1.anInterface13_5 = local30;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dw", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2207; local7++) {
			if (arg0 != 128) {
				this.anIntArray133[local7] = this.anIntArray133[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray136[local7] = this.anIntArray136[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray131[local7] = this.anIntArray131[local7] * arg2 >> 7;
			}
		}
		this.method1924();
		this.aBoolean173 = false;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "()[Lclient!mp;")
	@Override
	public Class219[] method7597() {
		return this.aClass219Array2;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!dw;Lclient!dw;IZZI)Lclient!da;")
	private Class61 method1928(@OriginalArg(0) Class61_Sub1 arg0, @OriginalArg(1) Class61_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		arg1.aShort25 = this.aShort25;
		arg1.anInt2227 = this.anInt2227;
		arg1.anInt2214 = this.anInt2214;
		arg1.lb = this.lb;
		arg1.anInt2241 = this.anInt2241;
		arg1.anInt2213 = arg4;
		arg1.anInt2207 = this.anInt2207;
		if ((arg4 & 0x100) == 0) {
			arg1.aBoolean170 = this.aBoolean170;
		} else {
			arg1.aBoolean170 = true;
		}
		arg1.anInt2209 = this.anInt2209;
		arg1.anInt2245 = this.anInt2245;
		arg1.aShort24 = this.aShort24;
		@Pc(63) boolean local63 = Static495.method6912(this.lb, arg4);
		@Pc(69) boolean local69 = Static487.method6814(this.lb, arg4);
		@Pc(75) boolean local75 = Static239.method3936(this.lb, arg4);
		@Pc(81) boolean local81 = local75 | local69 | local63;
		@Pc(196) int local196;
		if (local81) {
			if (!local63) {
				arg1.anIntArray133 = this.anIntArray133;
			} else if (arg0.anIntArray133 == null || this.anInt2227 > arg0.anIntArray133.length) {
				arg1.anIntArray133 = arg0.anIntArray133 = new int[this.anInt2227];
			} else {
				arg1.anIntArray133 = arg0.anIntArray133;
			}
			if (!local69) {
				arg1.anIntArray136 = this.anIntArray136;
			} else if (arg0.anIntArray136 == null || arg0.anIntArray136.length < this.anInt2227) {
				arg1.anIntArray136 = arg0.anIntArray136 = new int[this.anInt2227];
			} else {
				arg1.anIntArray136 = arg0.anIntArray136;
			}
			if (!local75) {
				arg1.anIntArray131 = this.anIntArray131;
			} else if (arg0.anIntArray131 == null || this.anInt2227 > arg0.anIntArray131.length) {
				arg1.anIntArray131 = arg0.anIntArray131 = new int[this.anInt2227];
			} else {
				arg1.anIntArray131 = arg0.anIntArray131;
			}
			for (local196 = 0; local196 < this.anInt2227; local196++) {
				if (local63) {
					arg1.anIntArray133[local196] = this.anIntArray133[local196];
				}
				if (local69) {
					arg1.anIntArray136[local196] = this.anIntArray136[local196];
				}
				if (local75) {
					arg1.anIntArray131[local196] = this.anIntArray131[local196];
				}
			}
		} else {
			arg1.anIntArray131 = this.anIntArray131;
			arg1.anIntArray133 = this.anIntArray133;
			arg1.anIntArray136 = this.anIntArray136;
		}
		if (Static357.method5214(arg4, this.lb)) {
			arg1.aClass136_1 = arg0.aClass136_1;
			arg1.aClass136_1.aBoolean329 = true;
			arg1.aClass136_1.aBoolean327 = this.aClass136_1.aBoolean327;
			arg1.aClass136_1.anInterface24_6 = this.aClass136_1.anInterface24_6;
		} else if (Static586.method7836(arg4, this.lb)) {
			arg1.aClass136_1 = this.aClass136_1;
		} else {
			arg1.aClass136_1 = null;
		}
		if (Static221.method3672(arg4, this.lb)) {
			if (arg0.aShortArray20 == null || this.anInt2214 > arg0.aShortArray20.length) {
				arg1.aShortArray20 = arg0.aShortArray20 = new short[this.anInt2214];
			} else {
				arg1.aShortArray20 = arg0.aShortArray20;
			}
			for (local196 = 0; local196 < this.anInt2214; local196++) {
				arg1.aShortArray20[local196] = this.aShortArray20[local196];
			}
		} else {
			arg1.aShortArray20 = this.aShortArray20;
		}
		if (Static356.method5848(arg4, this.lb)) {
			if (arg0.aByteArray19 == null || arg0.aByteArray19.length < this.anInt2214) {
				arg1.aByteArray19 = arg0.aByteArray19 = new byte[this.anInt2214];
			} else {
				arg1.aByteArray19 = arg0.aByteArray19;
			}
			for (local196 = 0; local196 < this.anInt2214; local196++) {
				arg1.aByteArray19[local196] = this.aByteArray19[local196];
			}
		} else {
			arg1.aByteArray19 = this.aByteArray19;
		}
		if (Static563.method7586(this.lb, arg4)) {
			arg1.aClass136_4 = arg0.aClass136_4;
			arg1.aClass136_4.anInterface24_6 = this.aClass136_4.anInterface24_6;
			arg1.aClass136_4.aBoolean329 = true;
			arg1.aClass136_4.aBoolean327 = this.aClass136_4.aBoolean327;
		} else if (Static192.method3391(arg4, this.lb)) {
			arg1.aClass136_4 = this.aClass136_4;
		} else {
			arg1.aClass136_4 = null;
		}
		@Pc(517) int local517;
		if (Static96.method1811(arg4, this.lb)) {
			if (arg0.aShortArray30 == null || arg0.aShortArray30.length < this.anInt2241) {
				local196 = this.anInt2241;
				arg1.aShortArray32 = arg0.aShortArray32 = new short[local196];
				arg1.aShortArray22 = arg0.aShortArray22 = new short[local196];
				arg1.aShortArray30 = arg0.aShortArray30 = new short[local196];
			} else {
				arg1.aShortArray32 = arg0.aShortArray32;
				arg1.aShortArray30 = arg0.aShortArray30;
				arg1.aShortArray22 = arg0.aShortArray22;
			}
			if (this.aClass267_1 == null) {
				arg1.aClass267_1 = null;
				for (local196 = 0; local196 < this.anInt2241; local196++) {
					arg1.aShortArray30[local196] = this.aShortArray30[local196];
					arg1.aShortArray32[local196] = this.aShortArray32[local196];
					arg1.aShortArray22[local196] = this.aShortArray22[local196];
				}
			} else {
				if (arg0.aClass267_1 == null) {
					arg0.aClass267_1 = new Class267();
				}
				@Pc(505) Class267 local505 = arg1.aClass267_1 = arg0.aClass267_1;
				if (local505.aShortArray82 == null || this.anInt2241 > local505.aShortArray82.length) {
					local517 = this.anInt2241;
					local505.aShortArray81 = new short[local517];
					local505.aShortArray80 = new short[local517];
					local505.aShortArray82 = new short[local517];
					local505.aByteArray78 = new byte[local517];
				}
				for (local517 = 0; local517 < this.anInt2241; local517++) {
					arg1.aShortArray30[local517] = this.aShortArray30[local517];
					arg1.aShortArray32[local517] = this.aShortArray32[local517];
					arg1.aShortArray22[local517] = this.aShortArray22[local517];
					local505.aShortArray82[local517] = this.aClass267_1.aShortArray82[local517];
					local505.aShortArray81[local517] = this.aClass267_1.aShortArray81[local517];
					local505.aShortArray80[local517] = this.aClass267_1.aShortArray80[local517];
					local505.aByteArray78[local517] = this.aClass267_1.aByteArray78[local517];
				}
			}
			arg1.aByteArray18 = this.aByteArray18;
		} else {
			arg1.aShortArray30 = this.aShortArray30;
			arg1.aShortArray22 = this.aShortArray22;
			arg1.aShortArray32 = this.aShortArray32;
			arg1.aByteArray18 = this.aByteArray18;
			arg1.aClass267_1 = this.aClass267_1;
		}
		if (Static205.method3502(arg4, this.lb)) {
			arg1.aClass136_3 = arg0.aClass136_3;
			arg1.aClass136_3.aBoolean327 = this.aClass136_3.aBoolean327;
			arg1.aClass136_3.aBoolean329 = true;
			arg1.aClass136_3.anInterface24_6 = this.aClass136_3.anInterface24_6;
		} else if (Static344.method5094(arg4, this.lb)) {
			arg1.aClass136_3 = this.aClass136_3;
		} else {
			arg1.aClass136_3 = null;
		}
		if (Static325.method7832(this.lb, arg4)) {
			if (arg0.aFloatArray11 == null || arg0.aFloatArray11.length < this.anInt2214) {
				local196 = this.anInt2241;
				arg1.aFloatArray10 = arg0.aFloatArray10 = new float[local196];
				arg1.aFloatArray11 = arg0.aFloatArray11 = new float[local196];
			} else {
				arg1.aFloatArray10 = arg0.aFloatArray10;
				arg1.aFloatArray11 = arg0.aFloatArray11;
			}
			for (local196 = 0; local196 < this.anInt2241; local196++) {
				arg1.aFloatArray11[local196] = this.aFloatArray11[local196];
				arg1.aFloatArray10[local196] = this.aFloatArray10[local196];
			}
		} else {
			arg1.aFloatArray10 = this.aFloatArray10;
			arg1.aFloatArray11 = this.aFloatArray11;
		}
		if (Static160.method7317(this.lb, arg4)) {
			arg1.aClass136_2 = arg0.aClass136_2;
			arg1.aClass136_2.anInterface24_6 = this.aClass136_2.anInterface24_6;
			arg1.aClass136_2.aBoolean327 = this.aClass136_2.aBoolean327;
			arg1.aClass136_2.aBoolean329 = true;
		} else if (Static567.method7644(arg4, this.lb)) {
			arg1.aClass136_2 = this.aClass136_2;
		} else {
			arg1.aClass136_2 = null;
		}
		if (Static157.method2423(arg4, this.lb)) {
			if (arg0.aShortArray31 == null || arg0.aShortArray31.length < this.anInt2214) {
				local196 = this.anInt2214;
				arg1.aShortArray31 = arg0.aShortArray31 = new short[local196];
				arg1.aShortArray26 = arg0.aShortArray26 = new short[local196];
				arg1.aShortArray27 = arg0.aShortArray27 = new short[local196];
			} else {
				arg1.aShortArray31 = arg0.aShortArray31;
				arg1.aShortArray27 = arg0.aShortArray27;
				arg1.aShortArray26 = arg0.aShortArray26;
			}
			for (local196 = 0; local196 < this.anInt2214; local196++) {
				arg1.aShortArray31[local196] = this.aShortArray31[local196];
				arg1.aShortArray26[local196] = this.aShortArray26[local196];
				arg1.aShortArray27[local196] = this.aShortArray27[local196];
			}
		} else {
			arg1.aShortArray31 = this.aShortArray31;
			arg1.aShortArray27 = this.aShortArray27;
			arg1.aShortArray26 = this.aShortArray26;
		}
		if (Static86.method1721(this.lb, arg4)) {
			arg1.aClass242_1 = arg0.aClass242_1;
			arg1.aClass242_1.aBoolean490 = this.aClass242_1.aBoolean490;
			arg1.aClass242_1.aBoolean491 = true;
			arg1.aClass242_1.anInterface13_5 = this.aClass242_1.anInterface13_5;
		} else if (Static501.method6978(arg4, this.lb)) {
			arg1.aClass242_1 = this.aClass242_1;
		} else {
			arg1.aClass242_1 = null;
		}
		if (Static404.method5706(arg4, this.lb)) {
			if (arg0.aShortArray21 == null || this.anInt2214 > arg0.aShortArray21.length) {
				local196 = this.anInt2214;
				arg1.aShortArray21 = arg0.aShortArray21 = new short[local196];
			} else {
				arg1.aShortArray21 = arg0.aShortArray21;
			}
			for (local196 = 0; local196 < this.anInt2214; local196++) {
				arg1.aShortArray21[local196] = this.aShortArray21[local196];
			}
		} else {
			arg1.aShortArray21 = this.aShortArray21;
		}
		if (!Static527.method7212(arg4, this.lb)) {
			arg1.aClass115Array1 = this.aClass115Array1;
		} else if (arg0.aClass115Array1 == null || this.anInt2245 > arg0.aClass115Array1.length) {
			local196 = this.anInt2245;
			arg1.aClass115Array1 = arg0.aClass115Array1 = new Class115[local196];
			for (local517 = 0; local517 < this.anInt2245; local517++) {
				arg1.aClass115Array1[local517] = this.aClass115Array1[local517].method2528();
			}
		} else {
			arg1.aClass115Array1 = arg0.aClass115Array1;
			for (local196 = 0; local196 < this.anInt2245; local196++) {
				arg1.aClass115Array1[local196].method2526(this.aClass115Array1[local196]);
			}
		}
		arg1.anIntArrayArray15 = this.anIntArrayArray15;
		arg1.aShortArray25 = this.aShortArray25;
		arg1.aShortArray29 = this.aShortArray29;
		arg1.anIntArray134 = this.anIntArray134;
		arg1.aClass101Array2 = this.aClass101Array2;
		arg1.aClass219Array2 = this.aClass219Array2;
		arg1.anIntArrayArray16 = this.anIntArrayArray16;
		arg1.aShortArray28 = this.aShortArray28;
		arg1.anIntArrayArray14 = this.anIntArrayArray14;
		arg1.anIntArray135 = this.anIntArray135;
		arg1.aShortArray23 = this.aShortArray23;
		arg1.aClass342Array1 = this.aClass342Array1;
		if (this.aBoolean173) {
			arg1.aBoolean173 = true;
			arg1.anInt2173 = this.anInt2173;
			arg1.anInt2182 = this.anInt2182;
			arg1.anInt2223 = this.anInt2223;
			arg1.anInt2185 = this.anInt2185;
			arg1.anInt2242 = this.anInt2242;
			arg1.anInt2183 = this.anInt2183;
			arg1.anInt2172 = this.anInt2172;
			arg1.anInt2206 = this.anInt2206;
		} else {
			arg1.aBoolean173 = false;
		}
		arg1.anIntArray132 = this.anIntArray132;
		arg1.anIntArray130 = this.anIntArray130;
		arg1.aShortArray24 = this.aShortArray24;
		return arg1;
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)V")
	private void method1929() {
		if ((this.lb & 0x37) == 0) {
			if (this.aClass136_4 != null) {
				this.aClass136_4.aBoolean327 = false;
			}
		} else if (this.aClass136_3 != null) {
			this.aClass136_3.aBoolean327 = false;
		}
	}

	@OriginalMember(owner = "client!dw", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface5 local9 = this.aClass12_Sub2_6.anInterface5_10;
		for (@Pc(11) int local11 = 0; local11 < this.anInt2214; local11++) {
			if (arg0 == this.aShortArray21[local11]) {
				this.aShortArray21[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class45 local48 = local9.method4043(arg0 & 0xFFFF);
			local35 = local48.aByte22;
			local37 = local48.aByte28;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(69) Class45 local69 = local9.method4043(arg1 & 0xFFFF);
			local58 = local69.aByte28;
			local56 = local69.aByte22;
		}
		if (!(local35 != local56 | local58 != local37)) {
			return;
		}
		if (this.aClass342Array1 != null) {
			for (@Pc(98) int local98 = 0; local98 < this.anInt2245; local98++) {
				@Pc(105) Class342 local105 = this.aClass342Array1[local98];
				@Pc(110) Class115 local110 = this.aClass115Array1[local98];
				local110.anInt2985 = local110.anInt2985 & 0xFF000000 | Static279.anIntArray313[this.aShortArray20[local105.anInt9076] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method1926();
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(B)V")
	private void method1930() {
		if (this.aClass242_1 != null) {
			this.aClass242_1.aBoolean490 = false;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!q;Lclient!bc;I)V")
	@Override
	public void method7587(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class20_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2241 == 0) {
			return;
		}
		@Pc(16) Class209_Sub2 local16 = this.aClass12_Sub2_6.aClass209_Sub2_16;
		@Pc(19) Class209_Sub2 local19 = (Class209_Sub2) arg0;
		if (!this.aBoolean173) {
			this.method1923();
		}
		Static100.aFloat42 = local16.aFloat143 * local19.aFloat139 + local16.aFloat140 * local19.aFloat145 + local19.aFloat149 * local16.aFloat139;
		Static106.aFloat43 = local16.aFloat139 * local19.aFloat141 + local16.aFloat140 * local19.aFloat138 + local19.aFloat142 * local16.aFloat143 + local16.aFloat142;
		@Pc(72) float local72 = Static106.aFloat43 + Static100.aFloat42 * (float) this.anInt2206;
		@Pc(80) float local80 = Static106.aFloat43 + (float) this.anInt2173 * Static100.aFloat42;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local80 < local72) {
			local90 = local72 + (float) this.anInt2182;
			local96 = local80 - (float) this.anInt2182;
		} else {
			local90 = local80 + (float) this.anInt2182;
			local96 = local72 - (float) this.anInt2182;
		}
		if (local96 >= this.aClass12_Sub2_6.aFloat182 || (float) this.aClass12_Sub2_6.anInt7532 >= local90) {
			return;
		}
		Static348.aFloat155 = local19.aFloat149 * local16.aFloat145 + local16.aFloat146 * local19.aFloat145 + local19.aFloat139 * local16.aFloat148;
		Static358.aFloat159 = local16.aFloat138 + local19.aFloat141 * local16.aFloat145 + local16.aFloat146 * local19.aFloat138 + local19.aFloat142 * local16.aFloat148;
		@Pc(172) float local172 = Static358.aFloat159 + (float) this.anInt2206 * Static348.aFloat155;
		@Pc(180) float local180 = (float) this.anInt2173 * Static348.aFloat155 + Static358.aFloat159;
		@Pc(207) float local207;
		@Pc(195) float local195;
		if (local172 > local180) {
			local195 = (local172 + (float) this.anInt2182) * (float) this.aClass12_Sub2_6.anInt7527;
			local207 = (float) this.aClass12_Sub2_6.anInt7527 * (local180 - (float) this.anInt2182);
		} else {
			local195 = (local180 + (float) this.anInt2182) * (float) this.aClass12_Sub2_6.anInt7527;
			local207 = (float) this.aClass12_Sub2_6.anInt7527 * ((float) -this.anInt2182 + local172);
		}
		if (local207 / local90 >= this.aClass12_Sub2_6.aFloat192 || local195 / local90 <= this.aClass12_Sub2_6.aFloat198) {
			return;
		}
		Static473.aFloat208 = local19.aFloat141 * local16.aFloat149 + local19.aFloat138 * local16.aFloat147 + local16.aFloat144 * local19.aFloat142 + local16.aFloat141;
		Static587.aFloat213 = local19.aFloat139 * local16.aFloat144 + local16.aFloat149 * local19.aFloat149 + local16.aFloat147 * local19.aFloat145;
		@Pc(296) float local296 = (float) this.anInt2206 * Static587.aFloat213 + Static473.aFloat208;
		@Pc(304) float local304 = Static473.aFloat208 + Static587.aFloat213 * (float) this.anInt2173;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local296 > local304) {
			local320 = ((float) -this.anInt2182 + local304) * (float) this.aClass12_Sub2_6.anInt7546;
			local331 = (float) this.aClass12_Sub2_6.anInt7546 * ((float) this.anInt2182 + local296);
		} else {
			local331 = (float) this.aClass12_Sub2_6.anInt7546 * (local304 + (float) this.anInt2182);
			local320 = (local296 - (float) this.anInt2182) * (float) this.aClass12_Sub2_6.anInt7546;
		}
		if (local320 / local90 >= this.aClass12_Sub2_6.aFloat185 || local331 / local90 <= this.aClass12_Sub2_6.aFloat196) {
			return;
		}
		if (arg1 != null || this.aClass342Array1 != null) {
			Static166.aFloat65 = local19.aFloat147 * local16.aFloat149 + local19.aFloat146 * local16.aFloat147 + local19.aFloat140 * local16.aFloat144;
			Static269.aFloat114 = local19.aFloat144 * local16.aFloat139 + local16.aFloat140 * local19.aFloat148 + local19.aFloat143 * local16.aFloat143;
			Static256.aFloat110 = local16.aFloat149 * local19.aFloat144 + local19.aFloat148 * local16.aFloat147 + local19.aFloat143 * local16.aFloat144;
			Static423.aFloat180 = local19.aFloat144 * local16.aFloat145 + local16.aFloat146 * local19.aFloat148 + local19.aFloat143 * local16.aFloat148;
			Static523.aFloat215 = local19.aFloat140 * local16.aFloat148 + local19.aFloat146 * local16.aFloat146 + local19.aFloat147 * local16.aFloat145;
			Static92.aFloat34 = local19.aFloat147 * local16.aFloat139 + local19.aFloat146 * local16.aFloat140 + local19.aFloat140 * local16.aFloat143;
		}
		if (arg1 != null) {
			@Pc(490) boolean local490 = false;
			@Pc(492) boolean local492 = true;
			@Pc(501) int local501 = this.anInt2183 + this.anInt2223 >> 1;
			@Pc(510) int local510 = this.anInt2242 + this.anInt2172 >> 1;
			@Pc(529) int local529 = (int) (Static358.aFloat159 + (float) local501 * Static523.aFloat215 + Static348.aFloat155 * (float) this.anInt2206 + Static423.aFloat180 * (float) local510);
			@Pc(548) int local548 = (int) ((float) this.anInt2206 * Static587.aFloat213 + Static166.aFloat65 * (float) local501 + Static473.aFloat208 + Static256.aFloat110 * (float) local510);
			@Pc(567) int local567 = (int) ((float) local510 * Static269.aFloat114 + Static106.aFloat43 + Static92.aFloat34 * (float) local501 + Static100.aFloat42 * (float) this.anInt2206);
			if (local567 < this.aClass12_Sub2_6.anInt7532) {
				local490 = true;
			} else {
				arg1.anInt901 = this.aClass12_Sub2_6.anInt7535 + local548 * this.aClass12_Sub2_6.anInt7546 / local567;
				arg1.anInt904 = this.aClass12_Sub2_6.anInt7553 + local529 * this.aClass12_Sub2_6.anInt7527 / local567;
			}
			@Pc(621) int local621 = (int) ((float) local510 * Static423.aFloat180 + Static523.aFloat215 * (float) local501 + Static358.aFloat159 + (float) this.anInt2173 * Static348.aFloat155);
			@Pc(640) int local640 = (int) ((float) this.anInt2173 * Static587.aFloat213 + Static473.aFloat208 + Static166.aFloat65 * (float) local501 + Static256.aFloat110 * (float) local510);
			@Pc(659) int local659 = (int) (Static92.aFloat34 * (float) local501 + Static106.aFloat43 + Static100.aFloat42 * (float) this.anInt2173 + (float) local510 * Static269.aFloat114);
			if (this.aClass12_Sub2_6.anInt7532 > local659) {
				local490 = true;
			} else {
				arg1.anInt902 = this.aClass12_Sub2_6.anInt7546 * local640 / local659 + this.aClass12_Sub2_6.anInt7535;
				arg1.anInt905 = this.aClass12_Sub2_6.anInt7553 + local621 * this.aClass12_Sub2_6.anInt7527 / local659;
			}
			if (local490) {
				if (this.aClass12_Sub2_6.anInt7532 > local567 && this.aClass12_Sub2_6.anInt7532 > local659) {
					local492 = false;
				} else {
					@Pc(743) int local743;
					@Pc(754) int local754;
					@Pc(765) int local765;
					if (this.aClass12_Sub2_6.anInt7532 > local567) {
						local743 = (local659 - this.aClass12_Sub2_6.anInt7532 << 16) / (local659 - local567);
						local754 = local621 + ((local621 - local529) * local743 >> 16);
						local765 = local640 + (local743 * (local640 - local548) >> 16);
						arg1.anInt904 = this.aClass12_Sub2_6.anInt7553 + local754 * this.aClass12_Sub2_6.anInt7527 / this.aClass12_Sub2_6.anInt7532;
						arg1.anInt901 = local765 * this.aClass12_Sub2_6.anInt7546 / this.aClass12_Sub2_6.anInt7532 + this.aClass12_Sub2_6.anInt7535;
					} else if (local659 < this.aClass12_Sub2_6.anInt7532) {
						local743 = (local567 - this.aClass12_Sub2_6.anInt7532 << 16) / (local567 - local659);
						local754 = ((local529 - local621) * local743 >> 16) + local529;
						arg1.anInt904 = this.aClass12_Sub2_6.anInt7527 * local754 / this.aClass12_Sub2_6.anInt7532 + this.aClass12_Sub2_6.anInt7553;
						local765 = local548 + (local743 * (local548 - local640) >> 16);
						arg1.anInt901 = this.aClass12_Sub2_6.anInt7535 + this.aClass12_Sub2_6.anInt7546 * local765 / this.aClass12_Sub2_6.anInt7532;
					}
				}
			}
			if (local492) {
				arg1.aBoolean78 = true;
				if (local659 < local567) {
					arg1.anInt903 = this.aClass12_Sub2_6.anInt7527 * (this.anInt2182 + local529) / local567 + this.aClass12_Sub2_6.anInt7553 - arg1.anInt904;
				} else {
					arg1.anInt903 = (this.anInt2182 + local621) * this.aClass12_Sub2_6.anInt7527 / local659 + this.aClass12_Sub2_6.anInt7553 - arg1.anInt905;
				}
			}
		}
		this.aClass12_Sub2_6.method6277();
		this.aClass12_Sub2_6.method6214(local19);
		this.method1922();
		this.method1934();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)V")
	private void method1931() {
		if (!this.aBoolean172) {
			return;
		}
		this.aBoolean172 = false;
		if (this.aClass219Array2 == null && this.aClass101Array2 == null && this.aClass342Array1 == null) {
			if (this.anIntArray133 != null && !Static371.method5411(this.lb, this.anInt2213)) {
				if (this.aClass136_1 == null || this.aClass136_1.method3387()) {
					if (!this.aBoolean173) {
						this.method1923();
					}
					this.anIntArray133 = null;
				} else {
					this.aBoolean172 = true;
				}
			}
			if (this.anIntArray136 != null && !Static227.method3761(this.anInt2213, this.lb)) {
				if (this.aClass136_1 == null || this.aClass136_1.method3387()) {
					if (!this.aBoolean173) {
						this.method1923();
					}
					this.anIntArray136 = null;
				} else {
					this.aBoolean172 = true;
				}
			}
			if (this.anIntArray131 != null && !Static185.method3239(this.anInt2213, this.lb)) {
				if (this.aClass136_1 == null || this.aClass136_1.method3387()) {
					if (!this.aBoolean173) {
						this.method1923();
					}
					this.anIntArray131 = null;
				} else {
					this.aBoolean172 = true;
				}
			}
		}
		if (this.aShortArray24 != null && this.anIntArray133 == null && this.anIntArray136 == null && this.anIntArray131 == null) {
			this.anIntArray130 = null;
			this.aShortArray24 = null;
		}
		if (this.aByteArray18 != null && !Static494.method6907(this.anInt2213, this.lb)) {
			label197: {
				label196: {
					@Pc(162) boolean local162;
					if ((this.lb & 0x37) == 0) {
						if (this.aClass136_4 == null || this.aClass136_4.method3387()) {
							break label196;
						}
						local162 = false;
					} else {
						if (this.aClass136_3 == null || this.aClass136_3.method3387()) {
							break label196;
						}
						local162 = false;
					}
					if (!local162) {
						this.aBoolean172 = true;
						break label197;
					}
				}
				this.aByteArray18 = null;
				this.aShortArray30 = this.aShortArray32 = this.aShortArray22 = null;
			}
		}
		if (this.aShortArray20 != null && !Static587.method7839(this.anInt2213, this.lb)) {
			if (this.aClass136_4 == null || this.aClass136_4.method3387()) {
				this.aShortArray20 = null;
			} else {
				this.aBoolean172 = true;
			}
		}
		if (this.aByteArray19 != null && !Static536.method7311(this.lb, this.anInt2213)) {
			if (this.aClass136_4 == null || this.aClass136_4.method3387()) {
				this.aByteArray19 = null;
			} else {
				this.aBoolean172 = true;
			}
		}
		if (this.aFloatArray11 != null && !Static170.method2602(this.lb, this.anInt2213)) {
			if (this.aClass136_2 == null || this.aClass136_2.method3387()) {
				this.aFloatArray11 = this.aFloatArray10 = null;
			} else {
				this.aBoolean172 = true;
			}
		}
		if (this.aShortArray21 != null && !Static337.method5035(this.anInt2213, this.lb)) {
			if (this.aClass136_4 == null || this.aClass136_4.method3387()) {
				this.aShortArray21 = null;
			} else {
				this.aBoolean172 = true;
			}
		}
		if (this.aShortArray31 != null && !Static44.method1012(this.anInt2213, this.lb)) {
			if ((this.aClass242_1 == null || this.aClass242_1.method5563()) && (this.aClass136_4 == null || this.aClass136_4.method3387())) {
				this.aShortArray31 = this.aShortArray26 = this.aShortArray27 = null;
			} else {
				this.aBoolean172 = true;
			}
		}
		if (this.aShortArray28 != null) {
			if (this.aClass136_1 == null || this.aClass136_1.method3387()) {
				this.aShortArray28 = null;
			} else {
				this.aBoolean172 = true;
			}
		}
		if (this.aShortArray29 != null) {
			if (this.aClass136_4 == null || this.aClass136_4.method3387()) {
				this.aShortArray29 = null;
			} else {
				this.aBoolean172 = true;
			}
		}
		if (this.anIntArrayArray14 != null && !Static481.method6759(this.lb, this.anInt2213)) {
			this.anIntArrayArray14 = null;
			this.aShortArray23 = null;
		}
		if (this.anIntArrayArray16 != null && !Static535.method7304(this.lb, this.anInt2213)) {
			this.aShortArray25 = null;
			this.anIntArrayArray16 = null;
		}
		if (this.anIntArrayArray15 != null && !Static369.method5394(this.anInt2213, this.lb)) {
			this.anIntArrayArray15 = null;
		}
		if (this.anIntArray132 != null && (this.anInt2213 & 0x800) == 0 && (this.anInt2213 & 0x40000) == 0) {
			this.anIntArray135 = null;
			this.anIntArray134 = null;
			this.anIntArray132 = null;
		}
	}

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean173) {
			this.method1923();
		}
		return this.anInt2223;
	}

	@OriginalMember(owner = "client!dw", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2227; local3++) {
			this.anIntArray133[local3] = this.anIntArray133[local3] + 7 >> 4;
			this.anIntArray136[local3] = this.anIntArray136[local3] + 7 >> 4;
			this.anIntArray131[local3] = this.anIntArray131[local3] + 7 >> 4;
		}
		this.method1924();
		this.aBoolean173 = false;
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "()[Lclient!fk;")
	@Override
	public Class101[] method7599() {
		return this.aClass101Array2;
	}

	@OriginalMember(owner = "client!dw", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		this.aShort24 = (short) arg0;
		this.method1926();
	}

	@OriginalMember(owner = "client!dw", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean173) {
			this.method1923();
		}
		return this.anInt2182;
	}

	@OriginalMember(owner = "client!dw", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class151.anIntArray244[arg0];
		@Pc(13) int local13 = Class151.anIntArray245[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2207; local15++) {
			@Pc(33) int local33 = this.anIntArray136[local15] * local9 + local13 * this.anIntArray133[local15] >> 14;
			this.anIntArray136[local15] = local13 * this.anIntArray136[local15] - local9 * this.anIntArray133[local15] >> 14;
			this.anIntArray133[local15] = local33;
		}
		this.method1924();
		this.aBoolean173 = false;
	}

	@OriginalMember(owner = "client!dw", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt2213;
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "()V")
	@Override
	protected void method7603() {
	}

	@OriginalMember(owner = "client!dw", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray16 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt2227; local12++) {
			this.anIntArray133[local12] <<= 0x4;
			this.anIntArray136[local12] <<= 0x4;
			this.anIntArray131[local12] <<= 0x4;
		}
		Static576.anInt9371 = 0;
		Static353.anInt6196 = 0;
		Static201.anInt6747 = 0;
		return true;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(Z)Z")
	private boolean method1932() {
		@Pc(13) boolean local13 = !this.aClass136_4.aBoolean327;
		@Pc(29) boolean local29 = (this.lb & 0x37) != 0 && !this.aClass136_3.aBoolean327;
		@Pc(37) boolean local37 = !this.aClass136_1.aBoolean327;
		@Pc(45) boolean local45 = !this.aClass136_2.aBoolean327;
		if (!local37 && !local13 && !local29 && !local45) {
			return true;
		}
		@Pc(57) boolean local57 = true;
		@Pc(76) Interface24 local76;
		@Pc(90) Buffer local90;
		if (local37) {
			if (this.aClass136_1.anInterface24_5 == null) {
				this.aClass136_1.anInterface24_5 = this.aClass12_Sub2_6.method6176(this.aBoolean171);
			}
			local76 = this.aClass136_1.anInterface24_5;
			local76.method6518(12, this.anInt2241 * 12);
			local90 = local76.method6519();
			if (local90 == null) {
				local57 = false;
			} else {
				this.aClass12_Sub2_6.aNativeInterface3.copyPositions(this.anIntArray133, this.anIntArray136, this.anIntArray131, this.aShortArray28, 0, 12, this.anInt2241, local90.getAddress());
				if (local76.method6520()) {
					this.aClass136_1.anInterface24_6 = local76;
					this.aClass136_1.aBoolean327 = true;
				} else {
					local57 = false;
				}
			}
		}
		@Pc(177) short[] local177;
		@Pc(189) short[] local189;
		@Pc(181) short[] local181;
		@Pc(185) byte[] local185;
		if (local13) {
			if (this.aClass136_4.anInterface24_5 == null) {
				this.aClass136_4.anInterface24_5 = this.aClass12_Sub2_6.method6176(this.aBoolean171);
			}
			local76 = this.aClass136_4.anInterface24_5;
			local76.method6518(4, this.anInt2241 * 4);
			local90 = local76.method6519();
			if (local90 == null) {
				local57 = false;
			} else {
				if ((this.lb & 0x37) == 0) {
					if (this.aClass267_1 == null) {
						local185 = this.aByteArray18;
						local189 = this.aShortArray32;
						local181 = this.aShortArray22;
						local177 = this.aShortArray30;
					} else {
						local177 = this.aClass267_1.aShortArray82;
						local181 = this.aClass267_1.aShortArray80;
						local185 = this.aClass267_1.aByteArray78;
						local189 = this.aClass267_1.aShortArray81;
					}
					this.aClass12_Sub2_6.aNativeInterface3.copyLighting(this.aShortArray20, this.aByteArray19, this.aShortArray21, local177, local189, local181, local185, this.aShort24, this.aShort25, this.aShortArray29, 0, 4, this.anInt2241, local90.getAddress());
				} else {
					this.aClass12_Sub2_6.aNativeInterface3.copyColours(this.aShortArray20, this.aByteArray19, this.aShortArray21, this.aShort24, this.aShortArray29, 0, 4, this.anInt2241, local90.getAddress());
				}
				if (local76.method6520()) {
					this.aClass136_4.anInterface24_6 = local76;
					this.aClass136_4.aBoolean327 = true;
				} else {
					local57 = false;
				}
			}
		}
		if (local29) {
			if (this.aClass136_3.anInterface24_5 == null) {
				this.aClass136_3.anInterface24_5 = this.aClass12_Sub2_6.method6176(this.aBoolean171);
			}
			local76 = this.aClass136_3.anInterface24_5;
			local76.method6518(12, this.anInt2241 * 12);
			local90 = local76.method6519();
			if (local90 == null) {
				local57 = false;
			} else {
				if (this.aClass267_1 == null) {
					local177 = this.aShortArray30;
					local185 = this.aByteArray18;
					local189 = this.aShortArray32;
					local181 = this.aShortArray22;
				} else {
					local177 = this.aClass267_1.aShortArray82;
					local189 = this.aClass267_1.aShortArray81;
					local181 = this.aClass267_1.aShortArray80;
					local185 = this.aClass267_1.aByteArray78;
				}
				this.aClass12_Sub2_6.aNativeInterface3.copyNormals(local177, local189, local181, local185, 3.0F / (float) this.aShort25, 3.0F / (float) (this.aShort25 / 2 + this.aShort25), 0, 12, this.anInt2241, local90.getAddress());
				if (local76.method6520()) {
					this.aClass136_3.anInterface24_6 = local76;
					this.aClass136_3.aBoolean327 = true;
				} else {
					local57 = false;
				}
			}
		}
		if (local45) {
			if (this.aClass136_2.anInterface24_5 == null) {
				this.aClass136_2.anInterface24_5 = this.aClass12_Sub2_6.method6176(this.aBoolean171);
			}
			local76 = this.aClass136_2.anInterface24_5;
			local76.method6518(8, this.anInt2241 * 8);
			local90 = local76.method6519();
			if (local90 == null) {
				local57 = false;
			} else {
				this.aClass12_Sub2_6.aNativeInterface3.copyTexCoords(this.aFloatArray11, this.aFloatArray10, 0, 8, this.anInt2241, local90.getAddress());
				if (local76.method6520()) {
					this.aClass136_2.anInterface24_6 = local76;
					this.aClass136_2.aBoolean327 = true;
				} else {
					local57 = false;
				}
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!dw", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class151.anIntArray244[arg0];
		@Pc(13) int local13 = Class151.anIntArray245[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2207; local15++) {
			local33 = local13 * this.anIntArray133[local15] + local9 * this.anIntArray131[local15] >> 14;
			this.anIntArray131[local15] = local13 * this.anIntArray131[local15] - local9 * this.anIntArray133[local15] >> 14;
			this.anIntArray133[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt2241; local33++) {
			@Pc(83) int local83 = this.aShortArray22[local33] * local9 + local13 * this.aShortArray30[local33] >> 14;
			this.aShortArray22[local33] = (short) (this.aShortArray22[local33] * local13 - local9 * this.aShortArray30[local33] >> 14);
			this.aShortArray30[local33] = (short) local83;
		}
		this.method1924();
		this.method1929();
		this.aBoolean173 = false;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) boolean arg3) {
		return this.method1933(arg3, arg0, arg2, arg1, -1);
	}

	@OriginalMember(owner = "client!dw", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean170;
	}

	@OriginalMember(owner = "client!dw", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		this.aShort25 = (short) arg0;
		this.method1924();
		this.method1929();
	}

	@OriginalMember(owner = "client!dw", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class1_Sub3_Sub4 S(@OriginalArg(0) Class1_Sub3_Sub4 arg0) {
		if (this.anInt2241 == 0) {
			return null;
		}
		if (!this.aBoolean173) {
			this.method1923();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass12_Sub2_6.anInt7549 <= 0) {
			local43 = this.anInt2183 - (this.anInt2206 * this.aClass12_Sub2_6.anInt7549 >> 8) >> this.aClass12_Sub2_6.anInt7540;
			local60 = this.anInt2223 - (this.aClass12_Sub2_6.anInt7549 * this.anInt2173 >> 8) >> this.aClass12_Sub2_6.anInt7540;
		} else {
			local43 = this.anInt2183 - (this.anInt2173 * this.aClass12_Sub2_6.anInt7549 >> 8) >> this.aClass12_Sub2_6.anInt7540;
			local60 = this.anInt2223 - (this.aClass12_Sub2_6.anInt7549 * this.anInt2206 >> 8) >> this.aClass12_Sub2_6.anInt7540;
		}
		@Pc(118) int local118;
		@Pc(135) int local135;
		if (this.aClass12_Sub2_6.anInt7536 > 0) {
			local118 = this.anInt2242 - (this.aClass12_Sub2_6.anInt7536 * this.anInt2173 >> 8) >> this.aClass12_Sub2_6.anInt7540;
			local135 = this.anInt2172 - (this.aClass12_Sub2_6.anInt7536 * this.anInt2206 >> 8) >> this.aClass12_Sub2_6.anInt7540;
		} else {
			local118 = this.anInt2242 - (this.aClass12_Sub2_6.anInt7536 * this.anInt2206 >> 8) >> this.aClass12_Sub2_6.anInt7540;
			local135 = this.anInt2172 - (this.anInt2173 * this.aClass12_Sub2_6.anInt7536 >> 8) >> this.aClass12_Sub2_6.anInt7540;
		}
		@Pc(176) int local176 = local60 + 1 - local43;
		@Pc(182) int local182 = local135 + 1 - local118;
		@Pc(185) Class1_Sub3_Sub4_Sub2 local185 = (Class1_Sub3_Sub4_Sub2) arg0;
		@Pc(195) Class1_Sub3_Sub4_Sub2 local195;
		if (local185 != null && local185.method1796(local176, local182)) {
			local195 = local185;
			local185.method1797();
		} else {
			local195 = new Class1_Sub3_Sub4_Sub2(this.aClass12_Sub2_6, local176, local182);
		}
		local195.method1798(local135, local60, local118, local43);
		this.method1925(local195);
		return local195;
	}

	@OriginalMember(owner = "client!dw", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean173) {
			this.method1923();
		}
		return this.anInt2242;
	}

	@OriginalMember(owner = "client!dw", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static353.anInt6196 = 0;
			local11 = 0;
			Static576.anInt9371 = 0;
			Static201.anInt6747 = 0;
			for (local17 = 0; local17 < this.anInt2207; local17++) {
				Static576.anInt9371 += this.anIntArray133[local17];
				Static201.anInt6747 += this.anIntArray136[local17];
				local11++;
				Static353.anInt6196 += this.anIntArray131[local17];
			}
			if (local11 <= 0) {
				Static576.anInt9371 = arg1;
				Static353.anInt6196 = arg3;
				Static201.anInt6747 = arg2;
			} else {
				Static201.anInt6747 = arg2 + Static201.anInt6747 / local11;
				Static353.anInt6196 = arg3 + Static353.anInt6196 / local11;
				Static576.anInt9371 = arg1 + Static576.anInt9371 / local11;
			}
		} else if (arg0 == 1) {
			for (local11 = 0; local11 < this.anInt2207; local11++) {
				this.anIntArray133[local11] += arg1;
				this.anIntArray136[local11] += arg2;
				this.anIntArray131[local11] += arg3;
			}
		} else {
			@Pc(166) int local166;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local11 = 0; local11 < this.anInt2207; local11++) {
					this.anIntArray133[local11] -= Static576.anInt9371;
					this.anIntArray136[local11] -= Static201.anInt6747;
					this.anIntArray131[local11] -= Static353.anInt6196;
					if (arg3 != 0) {
						local17 = Class151.anIntArray244[arg3];
						local166 = Class151.anIntArray245[arg3];
						local185 = local17 * this.anIntArray136[local11] + this.anIntArray133[local11] * local166 + 16383 >> 14;
						this.anIntArray136[local11] = this.anIntArray136[local11] * local166 + 16383 - local17 * this.anIntArray133[local11] >> 14;
						this.anIntArray133[local11] = local185;
					}
					if (arg1 != 0) {
						local17 = Class151.anIntArray244[arg1];
						local166 = Class151.anIntArray245[arg1];
						local185 = local166 * this.anIntArray136[local11] + 16383 - this.anIntArray131[local11] * local17 >> 14;
						this.anIntArray131[local11] = local166 * this.anIntArray131[local11] + local17 * this.anIntArray136[local11] + 16383 >> 14;
						this.anIntArray136[local11] = local185;
					}
					if (arg2 != 0) {
						local17 = Class151.anIntArray244[arg2];
						local166 = Class151.anIntArray245[arg2];
						local185 = this.anIntArray133[local11] * local166 + local17 * this.anIntArray131[local11] + 16383 >> 14;
						this.anIntArray131[local11] = this.anIntArray131[local11] * local166 + 16383 - this.anIntArray133[local11] * local17 >> 14;
						this.anIntArray133[local11] = local185;
					}
					this.anIntArray133[local11] += Static576.anInt9371;
					this.anIntArray136[local11] += Static201.anInt6747;
					this.anIntArray131[local11] += Static353.anInt6196;
				}
			} else if (arg0 == 3) {
				for (local11 = 0; local11 < this.anInt2207; local11++) {
					this.anIntArray133[local11] -= Static576.anInt9371;
					this.anIntArray136[local11] -= Static201.anInt6747;
					this.anIntArray131[local11] -= Static353.anInt6196;
					this.anIntArray133[local11] = arg1 * this.anIntArray133[local11] / 128;
					this.anIntArray136[local11] = arg2 * this.anIntArray136[local11] / 128;
					this.anIntArray131[local11] = arg3 * this.anIntArray131[local11] / 128;
					this.anIntArray133[local11] += Static576.anInt9371;
					this.anIntArray136[local11] += Static201.anInt6747;
					this.anIntArray131[local11] += Static353.anInt6196;
				}
			} else {
				@Pc(523) Class342 local523;
				@Pc(528) Class115 local528;
				if (arg0 == 5) {
					for (local11 = 0; local11 < this.anInt2214; local11++) {
						local17 = (this.aByteArray19[local11] & 0xFF) + arg1 * 8;
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray19[local11] = (byte) local17;
					}
					if (this.aClass342Array1 != null) {
						for (local17 = 0; local17 < this.anInt2245; local17++) {
							local523 = this.aClass342Array1[local17];
							local528 = this.aClass115Array1[local17];
							local528.anInt2985 = local528.anInt2985 & 0xFFFFFF | 255 - (this.aByteArray19[local523.anInt9076] & 0xFF) << 24;
						}
					}
					this.method1926();
				} else if (arg0 == 7) {
					for (local11 = 0; local11 < this.anInt2214; local11++) {
						local17 = this.aShortArray20[local11] & 0xFFFF;
						local166 = local17 >> 10 & 0x3F;
						local185 = local17 >> 7 & 0x7;
						local185 += arg2 / 4;
						@Pc(599) int local599 = local166 + arg1 & 0x3F;
						@Pc(603) int local603 = local17 & 0x7F;
						if (local185 < 0) {
							local185 = 0;
						} else if (local185 > 7) {
							local185 = 7;
						}
						local603 += arg3;
						if (local603 < 0) {
							local603 = 0;
						} else if (local603 > 127) {
							local603 = 127;
						}
						this.aShortArray20[local11] = (short) (local603 | local599 << 10 | local185 << 7);
					}
					if (this.aClass342Array1 != null) {
						for (local17 = 0; local17 < this.anInt2245; local17++) {
							local523 = this.aClass342Array1[local17];
							local528 = this.aClass115Array1[local17];
							local528.anInt2985 = local528.anInt2985 & 0xFF000000 | Static279.anIntArray313[this.aShortArray20[local523.anInt9076] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method1926();
				} else {
					@Pc(713) Class115 local713;
					if (arg0 == 8) {
						for (local11 = 0; local11 < this.anInt2245; local11++) {
							local713 = this.aClass115Array1[local11];
							local713.anInt2982 += arg1;
							local713.anInt2989 += arg2;
						}
					} else if (arg0 == 10) {
						for (local11 = 0; local11 < this.anInt2245; local11++) {
							local713 = this.aClass115Array1[local11];
							local713.anInt2984 = arg1 * local713.anInt2984 >> 7;
							local713.anInt2991 = arg2 * local713.anInt2991 >> 7;
						}
					} else if (arg0 == 9) {
						for (local11 = 0; local11 < this.anInt2245; local11++) {
							local713 = this.aClass115Array1[local11];
							local713.anInt2990 = arg1 + local713.anInt2990 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean173) {
			this.method1923();
		}
		@Pc(16) int local16 = arg4 + this.anInt2183;
		@Pc(21) int local21 = this.anInt2223 + arg4;
		@Pc(26) int local26 = this.anInt2242 + arg6;
		@Pc(32) int local32 = arg6 + this.anInt2172;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt7983 <= local21 + arg2.anInt7986 >> arg2.anInt7988 || local26 < 0 || arg2.anInt7986 + local32 >> arg2.anInt7988 >= arg2.anInt7984)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt7983 <= local21 + arg3.anInt7986 >> arg3.anInt7988 || local26 < 0 || arg3.anInt7984 <= local32 + arg3.anInt7986 >> arg3.anInt7988) {
				return;
			}
		} else {
			local16 >>= arg2.anInt7988;
			local21 = local21 + arg2.anInt7986 - 1 >> arg2.anInt7988;
			local26 >>= arg2.anInt7988;
			local32 = local32 + arg2.anInt7986 - 1 >> arg2.anInt7988;
			if (arg2.method6642(local16, local26) == arg5 && arg5 == arg2.method6642(local21, local26) && arg5 == arg2.method6642(local16, local32) && arg5 == arg2.method6642(local21, local32)) {
				return;
			}
		}
		@Pc(196) int local196;
		if (arg0 == 1) {
			for (local196 = 0; local196 < this.anInt2207; local196++) {
				this.anIntArray136[local196] = this.anIntArray136[local196] + arg2.method6637(arg4 + this.anIntArray133[local196], this.anIntArray131[local196] - -arg6) - arg5;
			}
		} else {
			@Pc(204) int local204;
			@Pc(215) int local215;
			if (arg0 == 2) {
				local196 = this.anInt2206;
				if (local196 == 0) {
					return;
				}
				for (local204 = 0; local204 < this.anInt2207; local204++) {
					local215 = (this.anIntArray136[local204] << 16) / local196;
					if (local215 < arg1) {
						this.anIntArray136[local204] += (arg2.method6637(arg4 + this.anIntArray133[local204], this.anIntArray131[local204] - -arg6) - arg5) * (arg1 + -local215) / arg1;
					}
				}
			} else {
				@Pc(297) int local297;
				if (arg0 == 3) {
					local196 = (arg1 & 0xFF) * 4;
					local204 = (arg1 >> 8 & 0xFF) * 4;
					local215 = (arg1 >> 16 & 0xFF) << 6;
					local297 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local196 >> 1) < 0 || (local196 >> 1) + arg4 + arg2.anInt7986 >= arg2.anInt7983 << arg2.anInt7988 || arg6 - (local204 >> 1) < 0 || arg2.anInt7984 << arg2.anInt7988 <= (local204 >> 1) + arg6 + arg2.anInt7986) {
						return;
					}
					this.method7604(local204, arg2, arg6, local215, arg5, arg4, local196, local297);
				} else if (arg0 == 4) {
					local196 = this.anInt2173 - this.anInt2206;
					for (local204 = 0; local204 < this.anInt2207; local204++) {
						this.anIntArray136[local204] = local196 + this.anIntArray136[local204] + arg3.method6637(arg4 + this.anIntArray133[local204], this.anIntArray131[local204] + arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local196 = this.anInt2173 - this.anInt2206;
					for (local204 = 0; local204 < this.anInt2207; local204++) {
						local215 = arg4 + this.anIntArray133[local204];
						local297 = this.anIntArray131[local204] + arg6;
						@Pc(449) int local449 = arg2.method6637(local215, local297);
						@Pc(455) int local455 = arg3.method6637(local215, local297);
						@Pc(463) int local463 = local449 - local455 - arg1;
						this.anIntArray136[local204] = local449 + (local463 * ((this.anIntArray136[local204] << 8) / local196) >> 8) - arg5;
					}
				}
			}
		}
		this.method1924();
		this.aBoolean173 = false;
	}

	@OriginalMember(owner = "client!dw", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean173) {
			this.method1923();
		}
		return this.anInt2206;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZILclient!q;II)Z")
	private boolean method1933(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class209 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class209_Sub2 local8 = (Class209_Sub2) arg2;
		@Pc(12) Class209_Sub2 local12 = this.aClass12_Sub2_6.aClass209_Sub2_16;
		@Pc(33) float local33 = local12.aFloat138 + local12.aFloat145 * local8.aFloat141 + local8.aFloat138 * local12.aFloat146 + local8.aFloat142 * local12.aFloat148;
		@Pc(54) float local54 = local8.aFloat142 * local12.aFloat144 + local8.aFloat141 * local12.aFloat149 + local8.aFloat138 * local12.aFloat147 + local12.aFloat141;
		Static166.aFloat65 = local8.aFloat140 * local12.aFloat144 + local12.aFloat147 * local8.aFloat146 + local12.aFloat149 * local8.aFloat147;
		Static92.aFloat34 = local12.aFloat143 * local8.aFloat140 + local8.aFloat146 * local12.aFloat140 + local12.aFloat139 * local8.aFloat147;
		Static523.aFloat215 = local8.aFloat146 * local12.aFloat146 + local12.aFloat145 * local8.aFloat147 + local12.aFloat148 * local8.aFloat140;
		Static256.aFloat110 = local12.aFloat149 * local8.aFloat144 + local8.aFloat148 * local12.aFloat147 + local12.aFloat144 * local8.aFloat143;
		Static269.aFloat114 = local8.aFloat143 * local12.aFloat143 + local12.aFloat140 * local8.aFloat148 + local8.aFloat144 * local12.aFloat139;
		Static348.aFloat155 = local12.aFloat145 * local8.aFloat149 + local8.aFloat145 * local12.aFloat146 + local12.aFloat148 * local8.aFloat139;
		Static587.aFloat213 = local12.aFloat144 * local8.aFloat139 + local8.aFloat149 * local12.aFloat149 + local12.aFloat147 * local8.aFloat145;
		@Pc(201) float local201 = local12.aFloat142 + local12.aFloat139 * local8.aFloat141 + local8.aFloat138 * local12.aFloat140 + local12.aFloat143 * local8.aFloat142;
		Static423.aFloat180 = local8.aFloat143 * local12.aFloat148 + local8.aFloat148 * local12.aFloat146 + local12.aFloat145 * local8.aFloat144;
		Static100.aFloat42 = local12.aFloat143 * local8.aFloat139 + local8.aFloat145 * local12.aFloat140 + local8.aFloat149 * local12.aFloat139;
		@Pc(239) boolean local239 = false;
		@Pc(247) float local247 = Float.MAX_VALUE;
		@Pc(249) float local249 = -3.4028235E38F;
		@Pc(251) float local251 = Float.MAX_VALUE;
		@Pc(253) float local253 = -3.4028235E38F;
		@Pc(257) int local257 = this.aClass12_Sub2_6.anInt7527;
		@Pc(261) int local261 = this.aClass12_Sub2_6.anInt7546;
		if (!this.aBoolean173) {
			this.method1923();
		}
		Static195.anIntArray225[0] = this.anInt2183;
		Static356.anIntArray488[0] = this.anInt2206;
		Static195.anIntArray225[1] = this.anInt2223;
		Static549.anIntArray608[0] = this.anInt2242;
		Static356.anIntArray488[1] = this.anInt2206;
		Static195.anIntArray225[2] = this.anInt2183;
		Static549.anIntArray608[1] = this.anInt2242;
		Static356.anIntArray488[2] = this.anInt2173;
		Static195.anIntArray225[3] = this.anInt2223;
		Static549.anIntArray608[2] = this.anInt2242;
		Static356.anIntArray488[3] = this.anInt2173;
		Static549.anIntArray608[3] = this.anInt2242;
		Static195.anIntArray225[4] = this.anInt2183;
		Static356.anIntArray488[4] = this.anInt2206;
		Static549.anIntArray608[4] = this.anInt2172;
		Static195.anIntArray225[5] = this.anInt2223;
		Static356.anIntArray488[5] = this.anInt2206;
		Static195.anIntArray225[6] = this.anInt2183;
		Static549.anIntArray608[5] = this.anInt2172;
		Static356.anIntArray488[6] = this.anInt2173;
		Static195.anIntArray225[7] = this.anInt2223;
		Static549.anIntArray608[6] = this.anInt2172;
		Static356.anIntArray488[7] = this.anInt2173;
		Static549.anIntArray608[7] = this.anInt2172;
		@Pc(448) float local448;
		@Pc(434) float local434;
		@Pc(420) float local420;
		@Pc(401) float local401;
		@Pc(396) float local396;
		@Pc(406) float local406;
		for (@Pc(389) int local389 = 0; local389 < 8; local389++) {
			local396 = Static356.anIntArray488[local389];
			local401 = Static195.anIntArray225[local389];
			local406 = Static549.anIntArray608[local389];
			local420 = local201 + Static269.aFloat114 * local406 + local401 * Static92.aFloat34 + Static100.aFloat42 * local396;
			local434 = local54 + Static587.aFloat213 * local396 + local401 * Static166.aFloat65 + local406 * Static256.aFloat110;
			local448 = Static423.aFloat180 * local406 + local401 * Static523.aFloat215 + Static348.aFloat155 * local396 + local33;
			if (local420 >= (float) this.aClass12_Sub2_6.anInt7532) {
				if (arg4 > 0) {
					local420 = arg4;
				}
				@Pc(472) float local472 = (float) this.aClass12_Sub2_6.anInt7553 + local448 * (float) local257 / local420;
				if (local472 < local247) {
					local247 = local472;
				}
				@Pc(490) float local490 = (float) this.aClass12_Sub2_6.anInt7535 + local434 * (float) local261 / local420;
				if (local472 > local249) {
					local249 = local472;
				}
				local239 = true;
				if (local253 < local490) {
					local253 = local490;
				}
				if (local251 > local490) {
					local251 = local490;
				}
			}
		}
		if (local239 && (float) arg1 > local247 && local249 > (float) arg1 && local251 < (float) arg3 && local253 > (float) arg3) {
			if (arg0) {
				return true;
			}
			if (this.anInt2241 > Static263.anIntArray301.length) {
				Static263.anIntArray301 = new int[this.anInt2241];
				Static98.anIntArray122 = new int[this.anInt2241];
			}
			@Pc(646) int local646;
			for (@Pc(559) int local559 = 0; local559 < this.anInt2207; local559++) {
				local401 = this.anIntArray133[local559];
				local406 = this.anIntArray131[local559];
				local396 = this.anIntArray136[local559];
				local448 = local396 * Static348.aFloat155 + local401 * Static523.aFloat215 + local406 * Static423.aFloat180 + local33;
				local420 = Static100.aFloat42 * local396 + Static92.aFloat34 * local401 + local406 * Static269.aFloat114 + local201;
				local434 = local54 + local406 * Static256.aFloat110 + Static587.aFloat213 * local396 + local401 * Static166.aFloat65;
				@Pc(659) int local659;
				@Pc(664) int local664;
				@Pc(671) int local671;
				if ((float) this.aClass12_Sub2_6.anInt7532 <= local420) {
					if (arg4 > 0) {
						local420 = arg4;
					}
					local646 = (int) ((float) local257 * local448 / local420 + (float) this.aClass12_Sub2_6.anInt7553);
					local659 = (int) ((float) this.aClass12_Sub2_6.anInt7535 + local434 * (float) local261 / local420);
					local664 = this.anIntArray130[local559];
					local671 = this.anIntArray130[local559 + 1];
					for (@Pc(673) int local673 = local664; local673 < local671; local673++) {
						@Pc(682) int local682 = this.aShortArray24[local673] - 1;
						if (local682 == -1) {
							break;
						}
						Static263.anIntArray301[local682] = local646;
						Static98.anIntArray122[local682] = local659;
					}
				} else {
					local646 = this.anIntArray130[local559];
					local659 = this.anIntArray130[local559 + 1];
					for (local664 = local646; local664 < local659; local664++) {
						local671 = this.aShortArray24[local664] - 1;
						if (local671 == -1) {
							break;
						}
						Static263.anIntArray301[this.aShortArray24[local664] - 1] = -999999;
					}
				}
			}
			for (local646 = 0; local646 < this.anInt2214; local646++) {
				if (Static263.anIntArray301[this.aShortArray31[local646]] != -999999 && Static263.anIntArray301[this.aShortArray26[local646]] != -999999 && Static263.anIntArray301[this.aShortArray27[local646]] != -999999 && this.method1936(Static263.anIntArray301[this.aShortArray31[local646]], Static263.anIntArray301[this.aShortArray26[local646]], Static98.anIntArray122[this.aShortArray31[local646]], Static98.anIntArray122[this.aShortArray26[local646]], arg3, arg1, Static98.anIntArray122[this.aShortArray27[local646]], Static263.anIntArray301[this.aShortArray27[local646]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(B)V")
	private void method1934() {
		if (this.aClass342Array1 == null) {
			return;
		}
		this.aClass12_Sub2_6.ZA(false);
		this.aClass12_Sub2_6.method6161(false);
		this.aClass12_Sub2_6.method6179(Static135.aClass84_1, 1);
		this.aClass12_Sub2_6.method6234(1, Static135.aClass84_1);
		for (@Pc(33) int local33 = 0; local33 < this.anInt2245; local33++) {
			@Pc(40) Class342 local40 = this.aClass342Array1[local33];
			@Pc(45) Class115 local45 = this.aClass115Array1[local33];
			if (!local40.aBoolean665 || !this.aClass12_Sub2_6.method6451()) {
				@Pc(73) float local73 = (float) (this.anIntArray133[local40.anInt9074] + this.anIntArray133[local40.anInt9075] + this.anIntArray133[local40.anInt9077]) * 0.3333333F;
				@Pc(94) float local94 = (float) (this.anIntArray136[local40.anInt9077] + this.anIntArray136[local40.anInt9075] + this.anIntArray136[local40.anInt9074]) * 0.3333333F;
				@Pc(116) float local116 = (float) (this.anIntArray131[local40.anInt9077] + this.anIntArray131[local40.anInt9075] + this.anIntArray131[local40.anInt9074]) * 0.3333333F;
				@Pc(130) float local130 = local73 * Static523.aFloat215 + local94 * Static348.aFloat155 + Static423.aFloat180 * local116 + Static358.aFloat159;
				@Pc(144) float local144 = Static587.aFloat213 * local94 + Static166.aFloat65 * local73 + Static256.aFloat110 * local116 + Static473.aFloat208;
				@Pc(158) float local158 = Static269.aFloat114 * local116 + local94 * Static100.aFloat42 + local73 * Static92.aFloat34 + Static106.aFloat43;
				@Pc(163) Class209_Sub2 local163 = this.aClass12_Sub2_6.method6245();
				local163.method4924(local45.anInt2990, local40.aShort110 * local45.anInt2984 >> 7, local45.anInt2991 * local40.aShort108 >> 7, (float) -local40.anInt9081 + local158, local130 + (float) local45.anInt2982, local144 + (float) local45.anInt2989);
				local163.method4934(this.aClass12_Sub2_6.aClass209_Sub2_17);
				this.aClass12_Sub2_6.method6275();
				@Pc(211) int local211 = local45.anInt2985;
				this.aClass12_Sub2_6.method6236(local40.aShort109, false, false);
				this.aClass12_Sub2_6.method6183(local40.aByte119);
				this.aClass12_Sub2_6.method6259(local211);
				this.aClass12_Sub2_6.method6213();
			}
		}
		this.aClass12_Sub2_6.method6234(1, Static266.aClass84_5);
		this.aClass12_Sub2_6.method6179(Static266.aClass84_5, 1);
		this.aClass12_Sub2_6.ZA(true);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2214; local7++) {
			local16 = this.aShortArray20[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local32 -= -(arg3 * (arg2 - local32) >> 7);
			}
			this.aShortArray20[local7] = (short) (local28 << 7 | local22 << 10 | local32);
		}
		if (this.aClass342Array1 != null) {
			for (local16 = 0; local16 < this.anInt2245; local16++) {
				@Pc(111) Class342 local111 = this.aClass342Array1[local16];
				@Pc(116) Class115 local116 = this.aClass115Array1[local16];
				local116.anInt2985 = local116.anInt2985 & 0xFF000000 | Static279.anIntArray313[this.aShortArray20[local111.anInt9076] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method1926();
	}

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "()V")
	@Override
	protected void method7605() {
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method1933(arg3, arg0, arg2, arg1, arg4);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7609(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class61_Sub1 local8 = (Class61_Sub1) arg0;
		if (this.anInt2214 == 0 || local8.anInt2214 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt2207;
		@Pc(24) int[] local24 = local8.anIntArray133;
		@Pc(27) int[] local27 = local8.anIntArray136;
		@Pc(30) int[] local30 = local8.anIntArray131;
		@Pc(33) short[] local33 = local8.aShortArray30;
		@Pc(36) short[] local36 = local8.aShortArray32;
		@Pc(39) short[] local39 = local8.aShortArray22;
		@Pc(42) byte[] local42 = local8.aByteArray18;
		@Pc(49) short[] local49;
		@Pc(53) short[] local53;
		@Pc(51) short[] local51;
		@Pc(47) byte[] local47;
		if (this.aClass267_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local53 = this.aClass267_1.aShortArray81;
			local47 = this.aClass267_1.aByteArray78;
			local49 = this.aClass267_1.aShortArray82;
			local51 = this.aClass267_1.aShortArray80;
		}
		@Pc(78) short[] local78;
		@Pc(76) short[] local76;
		@Pc(82) short[] local82;
		@Pc(80) byte[] local80;
		if (local8.aClass267_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local82 = local8.aClass267_1.aShortArray80;
			local78 = local8.aClass267_1.aShortArray82;
			local80 = local8.aClass267_1.aByteArray78;
			local76 = local8.aClass267_1.aShortArray81;
		}
		@Pc(103) int[] local103 = local8.anIntArray130;
		@Pc(106) short[] local106 = local8.aShortArray24;
		if (!local8.aBoolean173) {
			local8.method1923();
		}
		@Pc(115) int local115 = local8.anInt2206;
		@Pc(118) int local118 = local8.anInt2173;
		@Pc(121) int local121 = local8.anInt2183;
		@Pc(124) int local124 = local8.anInt2223;
		@Pc(127) int local127 = local8.anInt2242;
		@Pc(130) int local130 = local8.anInt2172;
		for (@Pc(132) int local132 = 0; local132 < this.anInt2207; local132++) {
			@Pc(142) int local142 = this.anIntArray136[local132] - arg2;
			if (local115 <= local142 && local118 >= local142) {
				@Pc(165) int local165 = this.anIntArray133[local132] - arg1;
				if (local121 <= local165 && local124 >= local165) {
					@Pc(181) int local181 = this.anIntArray131[local132] - arg3;
					if (local127 <= local181 && local130 >= local181) {
						@Pc(195) int local195 = -1;
						@Pc(200) int local200 = this.anIntArray130[local132];
						@Pc(207) int local207 = this.anIntArray130[local132 + 1];
						for (@Pc(209) int local209 = local200; local209 < local207; local209++) {
							local195 = this.aShortArray24[local209] - 1;
							if (local195 == -1 || this.aByteArray18[local195] != 0) {
								break;
							}
						}
						if (local195 != -1) {
							for (@Pc(241) int local241 = 0; local241 < local21; local241++) {
								if (local165 == local24[local241] && local181 == local30[local241] && local142 == local27[local241]) {
									@Pc(260) int local260 = -1;
									local200 = local103[local241];
									local207 = local103[local241 + 1];
									for (@Pc(272) int local272 = local200; local272 < local207; local272++) {
										local260 = local106[local272] - 1;
										if (local260 == -1 || local42[local260] != 0) {
											break;
										}
									}
									if (local260 != -1) {
										if (local49 == null) {
											this.aClass267_1 = new Class267();
											local49 = this.aClass267_1.aShortArray82 = Static420.method6360(this.aShortArray30);
											local53 = this.aClass267_1.aShortArray81 = Static420.method6360(this.aShortArray32);
											local51 = this.aClass267_1.aShortArray80 = Static420.method6360(this.aShortArray22);
											local47 = this.aClass267_1.aByteArray78 = Static121.method2075(this.aByteArray18);
										}
										if (local78 == null) {
											@Pc(357) Class267 local357 = local8.aClass267_1 = new Class267();
											local78 = local357.aShortArray82 = Static420.method6360(local33);
											local76 = local357.aShortArray81 = Static420.method6360(local36);
											local82 = local357.aShortArray80 = Static420.method6360(local39);
											local80 = local357.aByteArray78 = Static121.method2075(local42);
										}
										@Pc(390) short local390 = this.aShortArray30[local195];
										@Pc(395) short local395 = this.aShortArray32[local195];
										@Pc(400) short local400 = this.aShortArray22[local195];
										local200 = local103[local241];
										@Pc(409) byte local409 = this.aByteArray18[local195];
										local207 = local103[local241 + 1];
										@Pc(425) int local425;
										for (@Pc(417) int local417 = local200; local417 < local207; local417++) {
											local425 = local106[local417] - 1;
											if (local425 == -1) {
												break;
											}
											if (local80[local425] != 0) {
												local78[local425] += local390;
												local76[local425] += local395;
												local82[local425] += local400;
												local80[local425] += local409;
											}
										}
										local395 = local36[local260];
										local390 = local33[local260];
										local207 = this.anIntArray130[local132 + 1];
										local400 = local39[local260];
										local409 = local42[local260];
										local200 = this.anIntArray130[local132];
										for (local425 = local200; local425 < local207; local425++) {
											@Pc(511) int local511 = this.aShortArray24[local425] - 1;
											if (local511 == -1) {
												break;
											}
											if (local47[local511] != 0) {
												local49[local511] += local390;
												local53[local511] += local395;
												local51[local511] += local400;
												local47[local511] += local409;
											}
										}
										local8.method1929();
										this.method1929();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method1936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > arg4 && arg3 > arg4 && arg4 < arg6) {
			return false;
		} else if (arg4 > arg2 && arg3 < arg4 && arg4 > arg6) {
			return false;
		} else if (arg0 > arg5 && arg1 > arg5 && arg5 < arg7) {
			return false;
		} else {
			return arg5 <= arg0 || arg5 <= arg1 || arg5 <= arg7;
		}
	}

	@OriginalMember(owner = "client!dw", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class151.anIntArray244[arg0];
		@Pc(13) int local13 = Class151.anIntArray245[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2207; local15++) {
			@Pc(34) int local34 = this.anIntArray131[local15] * local9 + local13 * this.anIntArray133[local15] >> 14;
			this.anIntArray131[local15] = this.anIntArray131[local15] * local13 - this.anIntArray133[local15] * local9 >> 14;
			this.anIntArray133[local15] = local34;
		}
		this.method1924();
		this.aBoolean173 = false;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IFFLclient!cca;JIIZIII)S")
	private short method1937(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class43 arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(15) int local15 = this.anIntArray130[arg5];
		@Pc(22) int local22 = this.anIntArray130[arg5 + 1];
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = local15; local26 < local22; local26++) {
			@Pc(33) short local33 = this.aShortArray24[local26];
			if (local33 == 0) {
				local24 = local26;
				break;
			}
			if (arg4 == Static27.aLongArray3[local26]) {
				return (short) (local33 - 1);
			}
		}
		this.aShortArray24[local24] = (short) (this.anInt2241 + 1);
		Static27.aLongArray3[local24] = arg4;
		this.aShortArray29[this.anInt2241] = (short) arg0;
		this.aShortArray28[this.anInt2241] = (short) arg5;
		this.aShortArray30[this.anInt2241] = (short) arg6;
		this.aShortArray32[this.anInt2241] = (short) arg8;
		this.aShortArray22[this.anInt2241] = (short) arg7;
		this.aByteArray18[this.anInt2241] = (byte) arg9;
		this.aFloatArray11[this.anInt2241] = arg2;
		this.aFloatArray10[this.anInt2241] = arg1;
		return (short) this.anInt2241++;
	}

	@OriginalMember(owner = "client!dw", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort25;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "()V")
	@Override
	public void method7589() {
		if (this.anInt2241 > 0 && this.anInt2209 > 0) {
			this.method1932();
			this.method1927();
			this.method1931();
		}
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2214; local3++) {
			if (this.aShortArray20[local3] == arg0) {
				this.aShortArray20[local3] = arg1;
			}
		}
		if (this.aClass342Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt2245; local30++) {
				@Pc(37) Class342 local37 = this.aClass342Array1[local30];
				@Pc(42) Class115 local42 = this.aClass115Array1[local30];
				local42.anInt2985 = Static279.anIntArray313[this.aShortArray20[local37.anInt9076] & 0xFFFF] & 0xFFFFFF | local42.anInt2985 & 0xFF000000;
			}
		}
		this.method1926();
	}

	@OriginalMember(owner = "client!dw", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean173) {
			this.method1923();
		}
		return this.anInt2172;
	}

	@OriginalMember(owner = "client!dw", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean173) {
			this.method1923();
		}
		return this.anInt2183;
	}

	@OriginalMember(owner = "client!dw", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean173) {
			this.method1923();
		}
		return this.anInt2185;
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(I)V")
	public void method1938() {
		if (this.aClass136_1 != null) {
			this.aClass136_1.method3388();
		}
		if (this.aClass136_2 != null) {
			this.aClass136_2.method3388();
		}
		if (this.aClass136_4 != null) {
			this.aClass136_4.method3388();
		}
		if (this.aClass136_3 != null) {
			this.aClass136_3.method3388();
		}
		if (this.aClass242_1 != null) {
			this.aClass242_1.method5560();
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7588(@OriginalArg(0) Class209 arg0) {
		@Pc(8) Class209_Sub2 local8 = (Class209_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass219Array2 != null) {
			for (local13 = 0; local13 < this.aClass219Array2.length; local13++) {
				@Pc(20) Class219 local20 = this.aClass219Array2[local13];
				@Pc(22) Class219 local22 = local20;
				if (local20.aClass219_1 != null) {
					local22 = local20.aClass219_1;
				}
				local22.anInt5917 = (int) ((float) this.anIntArray131[local20.anInt5927] * local8.aFloat148 + local8.aFloat146 * (float) this.anIntArray133[local20.anInt5927] + local8.aFloat145 * (float) this.anIntArray136[local20.anInt5927] + local8.aFloat138);
				local22.anInt5910 = (int) ((float) this.anIntArray136[local20.anInt5927] * local8.aFloat149 + (float) this.anIntArray133[local20.anInt5927] * local8.aFloat147 + local8.aFloat144 * (float) this.anIntArray131[local20.anInt5927] + local8.aFloat141);
				local22.anInt5926 = (int) (local8.aFloat142 + local8.aFloat143 * (float) this.anIntArray131[local20.anInt5927] + (float) this.anIntArray133[local20.anInt5927] * local8.aFloat140 + local8.aFloat139 * (float) this.anIntArray136[local20.anInt5927]);
				local22.anInt5912 = (int) ((float) this.anIntArray131[local20.anInt5924] * local8.aFloat148 + local8.aFloat145 * (float) this.anIntArray136[local20.anInt5924] + (float) this.anIntArray133[local20.anInt5924] * local8.aFloat146 + local8.aFloat138);
				local22.anInt5919 = (int) (local8.aFloat149 * (float) this.anIntArray136[local20.anInt5924] + local8.aFloat147 * (float) this.anIntArray133[local20.anInt5924] + local8.aFloat144 * (float) this.anIntArray131[local20.anInt5924] + local8.aFloat141);
				local22.anInt5918 = (int) ((float) this.anIntArray136[local20.anInt5924] * local8.aFloat139 + (float) this.anIntArray133[local20.anInt5924] * local8.aFloat140 + local8.aFloat143 * (float) this.anIntArray131[local20.anInt5924] + local8.aFloat142);
				local22.anInt5915 = (int) (local8.aFloat138 + (float) this.anIntArray131[local20.anInt5916] * local8.aFloat148 + (float) this.anIntArray133[local20.anInt5916] * local8.aFloat146 + (float) this.anIntArray136[local20.anInt5916] * local8.aFloat145);
				local22.anInt5914 = (int) (local8.aFloat141 + (float) this.anIntArray131[local20.anInt5916] * local8.aFloat144 + (float) this.anIntArray133[local20.anInt5916] * local8.aFloat147 + local8.aFloat149 * (float) this.anIntArray136[local20.anInt5916]);
				local22.anInt5925 = (int) (local8.aFloat142 + (float) this.anIntArray133[local20.anInt5916] * local8.aFloat140 + local8.aFloat139 * (float) this.anIntArray136[local20.anInt5916] + local8.aFloat143 * (float) this.anIntArray131[local20.anInt5916]);
			}
		}
		if (this.aClass101Array2 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass101Array2.length; local13++) {
			@Pc(361) Class101 local361 = this.aClass101Array2[local13];
			@Pc(363) Class101 local363 = local361;
			if (local361.aClass101_1 != null) {
				local363 = local361.aClass101_1;
			}
			if (local361.aClass209_2 == null) {
				local361.aClass209_2 = local8.method6362();
			} else {
				local361.aClass209_2.M(local8);
			}
			local363.anInt2801 = (int) (local8.aFloat138 + (float) this.anIntArray133[local361.anInt2803] * local8.aFloat146 + local8.aFloat145 * (float) this.anIntArray136[local361.anInt2803] + (float) this.anIntArray131[local361.anInt2803] * local8.aFloat148);
			local363.anInt2805 = (int) (local8.aFloat141 + local8.aFloat149 * (float) this.anIntArray136[local361.anInt2803] + local8.aFloat147 * (float) this.anIntArray133[local361.anInt2803] + (float) this.anIntArray131[local361.anInt2803] * local8.aFloat144);
			local363.anInt2802 = (int) (local8.aFloat142 + local8.aFloat143 * (float) this.anIntArray131[local361.anInt2803] + (float) this.anIntArray133[local361.anInt2803] * local8.aFloat140 + local8.aFloat139 * (float) this.anIntArray136[local361.anInt2803]);
		}
	}

	@OriginalMember(owner = "client!dw", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2207; local7++) {
			this.anIntArray131[local7] = -this.anIntArray131[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2241; local25++) {
			this.aShortArray22[local25] = (short) -this.aShortArray22[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt2214; local48++) {
			@Pc(55) short local55 = this.aShortArray31[local48];
			this.aShortArray31[local48] = this.aShortArray27[local48];
			this.aShortArray27[local48] = local55;
		}
		this.method1924();
		this.method1929();
		this.method1930();
		this.aBoolean173 = false;
	}

	@OriginalMember(owner = "client!dw", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort24;
	}
}
