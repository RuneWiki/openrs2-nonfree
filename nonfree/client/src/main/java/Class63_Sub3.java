import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class63_Sub3 extends Class63 {

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
	private int anInt7499;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
	private int anInt7501;

	@OriginalMember(owner = "client!qi", name = "B", descriptor = "I")
	private int anInt7511;

	@OriginalMember(owner = "client!qi", name = "G", descriptor = "I")
	private int anInt7515;

	@OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
	private int anInt7519;

	@OriginalMember(owner = "client!qi", name = "P", descriptor = "Lclient!gs;")
	private Class106 aClass106_1;

	@OriginalMember(owner = "client!qi", name = "S", descriptor = "Lclient!kw;")
	private final Class39_Sub2 aClass39_Sub2_18;

	@OriginalMember(owner = "client!qi", name = "bb", descriptor = "Lclient!gs;")
	private Class106 aClass106_2;

	@OriginalMember(owner = "client!qi", name = "jb", descriptor = "Z")
	private boolean aBoolean561;

	@OriginalMember(owner = "client!qi", name = "nb", descriptor = "Z")
	private boolean aBoolean562;

	@OriginalMember(owner = "client!qi", name = "qb", descriptor = "I")
	private int anInt7531;

	@OriginalMember(owner = "client!qi", name = "rb", descriptor = "Lclient!gs;")
	private Class106 aClass106_3;

	@OriginalMember(owner = "client!qi", name = "vb", descriptor = "Z")
	private boolean aBoolean563;

	@OriginalMember(owner = "client!qi", name = "Gb", descriptor = "Lclient!gs;")
	private Class106 aClass106_4;

	@OriginalMember(owner = "client!qi", name = "Qb", descriptor = "I")
	private int anInt7547;

	@OriginalMember(owner = "client!qi", name = "Tb", descriptor = "Lclient!bd;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!qi", name = "ec", descriptor = "Lclient!lf;")
	private Class174 aClass174_1;

	@OriginalMember(owner = "client!qi", name = "ic", descriptor = "I")
	private int anInt7557;

	@OriginalMember(owner = "client!qi", name = "nc", descriptor = "I")
	private int anInt7560;

	@OriginalMember(owner = "client!qi", name = "uc", descriptor = "I")
	private int anInt7567;

	@OriginalMember(owner = "client!qi", name = "u", descriptor = "[I")
	private int[] anIntArray578;

	@OriginalMember(owner = "client!qi", name = "Ob", descriptor = "I")
	private int anInt7546;

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
	private int anInt7498;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
	private int anInt7497;

	@OriginalMember(owner = "client!qi", name = "jc", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!qi", name = "ob", descriptor = "[I")
	private int[] anIntArray580;

	@OriginalMember(owner = "client!qi", name = "x", descriptor = "[I")
	private int[] anIntArray579;

	@OriginalMember(owner = "client!qi", name = "lc", descriptor = "[I")
	private int[] anIntArray584;

	@OriginalMember(owner = "client!qi", name = "qc", descriptor = "I")
	private int anInt7563;

	@OriginalMember(owner = "client!qi", name = "Q", descriptor = "[Lclient!mm;")
	private Class192[] aClass192Array6;

	@OriginalMember(owner = "client!qi", name = "J", descriptor = "[Lclient!kv;")
	private Class169[] aClass169Array6;

	@OriginalMember(owner = "client!qi", name = "sc", descriptor = "I")
	private int anInt7565;

	@OriginalMember(owner = "client!qi", name = "H", descriptor = "[Lclient!he;")
	private Class114[] aClass114Array1;

	@OriginalMember(owner = "client!qi", name = "Ub", descriptor = "[Lclient!us;")
	private Class289[] aClass289Array1;

	@OriginalMember(owner = "client!qi", name = "Pb", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!qi", name = "Y", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!qi", name = "Ib", descriptor = "S")
	private short aShort124;

	@OriginalMember(owner = "client!qi", name = "fc", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!qi", name = "fb", descriptor = "[B")
	private byte[] aByteArray100;

	@OriginalMember(owner = "client!qi", name = "y", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!qi", name = "wb", descriptor = "S")
	private short aShort123;

	@OriginalMember(owner = "client!qi", name = "eb", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!qi", name = "Zb", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!qi", name = "hb", descriptor = "[F")
	private float[] aFloatArray67;

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!qi", name = "V", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "[F")
	private float[] aFloatArray66;

	@OriginalMember(owner = "client!qi", name = "Mb", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!qi", name = "mb", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!qi", name = "ab", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!qi", name = "I", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!qi", name = "F", descriptor = "[B")
	private byte[] aByteArray99;

	@OriginalMember(owner = "client!qi", name = "bc", descriptor = "[I")
	private int[] anIntArray582;

	@OriginalMember(owner = "client!qi", name = "Nb", descriptor = "[I")
	private int[] anIntArray581;

	@OriginalMember(owner = "client!qi", name = "dc", descriptor = "[I")
	private int[] anIntArray583;

	@OriginalMember(owner = "client!qi", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!qi", name = "Fb", descriptor = "[[I")
	private int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!kw;Lclient!bt;IIII)V")
	public Class63_Sub3(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface12 local11 = arg0.anInterface12_15;
		@Pc(15) int[] local15 = new int[arg1.anInt856];
		this.anIntArray578 = new int[arg1.anInt861 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt856; local24++) {
			if ((arg1.aByteArray25 == null || arg1.aByteArray25[local24] != 2) && (arg1.aShortArray35 == null || arg1.aShortArray35[local24] == -1 || !local11.method2573(arg1.aShortArray35[local24] & 0xFFFF).aBoolean459)) {
				local15[this.anInt7546++] = local24;
				this.anIntArray578[arg1.aShortArray33[local24]]++;
				this.anIntArray578[arg1.aShortArray27[local24]]++;
				this.anIntArray578[arg1.aShortArray28[local24]]++;
			}
		}
		this.anInt7498 = this.anInt7546;
		@Pc(112) long[] local112 = new long[this.anInt7546];
		@Pc(124) boolean local124 = (this.anInt7567 & 0x100) != 0;
		@Pc(136) int local136;
		@Pc(147) int local147;
		@Pc(283) int local283;
		label496: for (@Pc(126) int local126 = 0; local126 < this.anInt7546; local126++) {
			@Pc(132) int local132 = local15[local126];
			@Pc(134) Class204 local134 = null;
			local136 = 0;
			@Pc(138) byte local138 = 0;
			@Pc(140) byte local140 = 0;
			@Pc(142) byte local142 = 0;
			if (arg1.aClass120Array1 != null) {
				for (local147 = 0; local147 < arg1.aClass120Array1.length; local147++) {
					@Pc(154) Class120 local154 = arg1.aClass120Array1[local147];
					if (local132 == local154.anInt3402) {
						@Pc(167) Class233 local167 = Static367.method5866(local154.anInt3401);
						if (local167.aBoolean556) {
							local112[local126] = Long.MAX_VALUE;
							this.anInt7498--;
							continue label496;
						}
					}
				}
			}
			@Pc(194) short local194 = -1;
			if (arg1.aShortArray35 != null) {
				local194 = arg1.aShortArray35[local132];
				if (local194 != -1) {
					local134 = local11.method2573(local194 & 0xFFFF);
					local142 = local134.aByte86;
					local140 = local134.aByte85;
				}
			}
			@Pc(239) boolean local239 = arg1.aByteArray30 != null && arg1.aByteArray30[local132] != 0 || local134 != null && !local134.aBoolean458;
			if ((local124 || local239) && arg1.aByteArray31 != null) {
				local136 += arg1.aByteArray31[local132] << 17;
			}
			if (local239) {
				local136 += 65536;
			}
			local136 += (local140 & 0xFF) << 8;
			local136 += local142 & 0xFF;
			local283 = local138 + ((local194 & 0xFFFF) << 16);
			@Pc(289) int local289 = local283 + (local126 & 0xFFFF);
			local112[local126] = ((long) local136 << 32) + (long) local289;
		}
		Static59.method1102(local112, local15);
		this.anInt7497 = arg1.anInt861;
		this.aShortArray104 = arg1.aShortArray26;
		this.anIntArray580 = arg1.anIntArray72;
		this.anIntArray579 = arg1.anIntArray65;
		this.anIntArray584 = arg1.anIntArray71;
		this.anInt7563 = arg1.anInt866;
		@Pc(336) Class253[] local336 = new Class253[this.anInt7497];
		this.aClass192Array6 = arg1.aClass192Array1;
		this.aClass169Array6 = arg1.aClass169Array1;
		@Pc(364) int local364;
		@Pc(378) int local378;
		if (arg1.aClass120Array1 != null) {
			this.anInt7565 = arg1.aClass120Array1.length;
			this.aClass114Array1 = new Class114[this.anInt7565];
			this.aClass289Array1 = new Class289[this.anInt7565];
			for (local364 = 0; local364 < this.anInt7565; local364++) {
				@Pc(371) Class120 local371 = arg1.aClass120Array1[local364];
				@Pc(376) Class233 local376 = Static367.method5866(local371.anInt3401);
				local378 = -1;
				for (@Pc(380) int local380 = 0; local380 < this.anInt7546; local380++) {
					if (local15[local380] == local371.anInt3402) {
						local378 = local380;
						break;
					}
				}
				if (local378 == -1) {
					throw new RuntimeException();
				}
				local147 = Static445.anIntArray614[arg1.aShortArray30[local371.anInt3402] & 0xFFFF] & 0xFFFFFF;
				local147 |= 255 - (arg1.aByteArray30 == null ? 0 : arg1.aByteArray30[local371.anInt3402]) << 24;
				this.aClass289Array1[local364] = new Class289(local378, arg1.aShortArray33[local371.anInt3402], arg1.aShortArray27[local371.anInt3402], arg1.aShortArray28[local371.anInt3402], local376.anInt7439, local376.anInt7440, local376.anInt7435, local376.anInt7438, local376.anInt7434, local376.aBoolean556, local376.aBoolean558, local371.anInt3406);
				this.aClass114Array1[local364] = new Class114(local147);
			}
		}
		local364 = this.anInt7546 * 3;
		Static518.aLongArray16 = new long[local364];
		this.aShortArray101 = new short[local364];
		this.aShortArray96 = new short[this.anInt7546];
		this.aShort124 = (short) arg3;
		this.aShortArray103 = new short[local364];
		this.aByteArray100 = new byte[local364];
		this.aShortArray93 = new short[this.anInt7546];
		this.aShort123 = (short) arg4;
		if (arg1.aShortArray31 != null) {
			this.aShortArray98 = new short[this.anInt7546];
		}
		this.aShortArray102 = new short[this.anInt7546];
		this.aFloatArray67 = new float[local364];
		this.aShortArray92 = new short[this.anInt7546];
		this.aShortArray95 = new short[local364];
		this.aFloatArray66 = new float[local364];
		this.aShortArray100 = new short[local364];
		this.aShortArray99 = new short[local364];
		this.aShortArray97 = new short[this.anInt7546];
		this.aShortArray94 = new short[local364];
		this.aByteArray99 = new byte[this.anInt7546];
		local136 = 0;
		for (local283 = 0; local283 < arg1.anInt861; local283++) {
			local378 = this.anIntArray578[local283];
			this.anIntArray578[local283] = local136;
			local136 += local378;
			local336[local283] = new Class253();
		}
		this.anIntArray578[arg1.anInt861] = local136;
		@Pc(632) int[] local632 = null;
		@Pc(634) int[] local634 = null;
		@Pc(636) int[] local636 = null;
		@Pc(638) float[][] local638 = null;
		@Pc(656) int[] local656;
		@Pc(664) int local664;
		@Pc(706) int local706;
		@Pc(712) int local712;
		@Pc(726) int local726;
		@Pc(728) int local728;
		@Pc(762) int local762;
		@Pc(767) int local767;
		@Pc(938) float local938;
		@Pc(946) float local946;
		@Pc(930) float local930;
		if (arg1.aByteArray28 != null) {
			@Pc(644) int local644 = arg1.anInt850;
			@Pc(647) int[] local647 = new int[local644];
			@Pc(650) int[] local650 = new int[local644];
			@Pc(653) int[] local653 = new int[local644];
			local656 = new int[local644];
			@Pc(659) int[] local659 = new int[local644];
			@Pc(662) int[] local662 = new int[local644];
			for (local664 = 0; local664 < local644; local664++) {
				local647[local664] = Integer.MAX_VALUE;
				local650[local664] = -2147483647;
				local653[local664] = Integer.MAX_VALUE;
				local656[local664] = -2147483647;
				local659[local664] = Integer.MAX_VALUE;
				local662[local664] = -2147483647;
			}
			local638 = new float[local644][];
			local636 = new int[local644];
			for (local706 = 0; local706 < this.anInt7546; local706++) {
				local712 = local15[local706];
				if (arg1.aByteArray28[local712] != -1) {
					local726 = arg1.aByteArray28[local712] & 0xFF;
					for (local728 = 0; local728 < 3; local728++) {
						@Pc(743) short local743;
						if (local728 == 0) {
							local743 = arg1.aShortArray33[local712];
						} else if (local728 == 1) {
							local743 = arg1.aShortArray27[local712];
						} else {
							local743 = arg1.aShortArray28[local712];
						}
						local762 = arg1.anIntArray65[local743];
						local767 = arg1.anIntArray71[local743];
						@Pc(772) int local772 = arg1.anIntArray72[local743];
						if (local762 < local647[local726]) {
							local647[local726] = local762;
						}
						if (local762 > local650[local726]) {
							local650[local726] = local762;
						}
						if (local767 < local653[local726]) {
							local653[local726] = local767;
						}
						if (local656[local726] < local767) {
							local656[local726] = local767;
						}
						if (local659[local726] > local772) {
							local659[local726] = local772;
						}
						if (local662[local726] < local772) {
							local662[local726] = local772;
						}
					}
				}
			}
			local632 = new int[local644];
			local634 = new int[local644];
			for (local712 = 0; local712 < local644; local712++) {
				@Pc(872) byte local872 = arg1.aByteArray27[local712];
				if (local872 > 0) {
					local632[local712] = (local647[local712] + local650[local712]) / 2;
					local634[local712] = (local653[local712] + local656[local712]) / 2;
					local636[local712] = (local662[local712] + local659[local712]) / 2;
					if (local872 == 1) {
						local767 = arg1.anIntArray64[local712];
						local946 = 64.0F / (float) arg1.anIntArray70[local712];
						if (local767 == 0) {
							local930 = 1.0F;
							local938 = 1.0F;
						} else if (local767 > 0) {
							local938 = 1.0F;
							local930 = (float) local767 / 1024.0F;
						} else {
							local930 = 1.0F;
							local938 = (float) -local767 / 1024.0F;
						}
					} else if (local872 == 2) {
						local930 = 64.0F / (float) arg1.anIntArray73[local712];
						local938 = 64.0F / (float) arg1.anIntArray64[local712];
						local946 = 64.0F / (float) arg1.anIntArray70[local712];
					} else {
						local938 = (float) arg1.anIntArray64[local712] / 1024.0F;
						local946 = (float) arg1.anIntArray70[local712] / 1024.0F;
						local930 = (float) arg1.anIntArray73[local712] / 1024.0F;
					}
					local638[local712] = Static88.method1682(local946, arg1.aByteArray29[local712] & 0xFF, local938, arg1.aShortArray34[local712], arg1.aShortArray32[local712], local930, arg1.aShortArray29[local712]);
				}
			}
		}
		@Pc(1054) Class89[] local1054 = new Class89[arg1.anInt856];
		@Pc(1073) short local1073;
		@Pc(1084) int local1084;
		@Pc(1095) int local1095;
		for (@Pc(1056) int local1056 = 0; local1056 < arg1.anInt856; local1056++) {
			@Pc(1063) short local1063 = arg1.aShortArray33[local1056];
			@Pc(1068) short local1068 = arg1.aShortArray27[local1056];
			local1073 = arg1.aShortArray28[local1056];
			local1084 = this.anIntArray579[local1068] - this.anIntArray579[local1063];
			local1095 = this.anIntArray584[local1068] - this.anIntArray584[local1063];
			local664 = this.anIntArray580[local1068] - this.anIntArray580[local1063];
			local706 = this.anIntArray579[local1073] - this.anIntArray579[local1063];
			local712 = this.anIntArray584[local1073] - this.anIntArray584[local1063];
			local726 = this.anIntArray580[local1073] - this.anIntArray580[local1063];
			local728 = local726 * local1095 - local712 * local664;
			@Pc(1157) int local1157 = local706 * local664 - local726 * local1084;
			local762 = local1084 * local712 - local706 * local1095;
			while (local728 > 8192 || local1157 > 8192 || local762 > 8192 || local728 < -8192 || local1157 < -8192 || local762 < -8192) {
				local1157 >>= 0x1;
				local762 >>= 0x1;
				local728 >>= 0x1;
			}
			local767 = (int) Math.sqrt((double) (local762 * local762 + local1157 * local1157 + local728 * local728));
			if (local767 <= 0) {
				local767 = 1;
			}
			local728 = local728 * 256 / local767;
			local1157 = local1157 * 256 / local767;
			local762 = local762 * 256 / local767;
			@Pc(1252) byte local1252 = arg1.aByteArray25 == null ? 0 : arg1.aByteArray25[local1056];
			if (local1252 == 0) {
				@Pc(1285) Class253 local1285 = local336[local1063];
				local1285.anInt7842 += local728;
				local1285.anInt7840 += local1157;
				local1285.anInt7841 += local762;
				local1285.anInt7839++;
				@Pc(1313) Class253 local1313 = local336[local1068];
				local1313.anInt7842 += local728;
				local1313.anInt7840 += local1157;
				local1313.anInt7839++;
				local1313.anInt7841 += local762;
				@Pc(1341) Class253 local1341 = local336[local1073];
				local1341.anInt7839++;
				local1341.anInt7840 += local1157;
				local1341.anInt7841 += local762;
				local1341.anInt7842 += local728;
			} else if (local1252 == 1) {
				@Pc(1270) Class89 local1270 = local1054[local1056] = new Class89();
				local1270.anInt2537 = local1157;
				local1270.anInt2536 = local728;
				local1270.anInt2538 = local762;
			}
		}
		@Pc(1382) int local1382;
		for (@Pc(1376) int local1376 = 0; local1376 < this.anInt7546; local1376++) {
			local1382 = local15[local1376];
			@Pc(1389) int local1389 = arg1.aShortArray30[local1382] & 0xFFFF;
			@Pc(1394) short local1394;
			if (arg1.aShortArray35 == null) {
				local1394 = -1;
			} else {
				local1394 = arg1.aShortArray35[local1382];
			}
			if (arg1.aByteArray28 == null) {
				local1095 = -1;
			} else {
				local1095 = arg1.aByteArray28[local1382];
			}
			if (arg1.aByteArray30 == null) {
				local664 = 0;
			} else {
				local664 = arg1.aByteArray30[local1382] & 0xFF;
			}
			@Pc(1429) float local1429 = 0.0F;
			@Pc(1431) float local1431 = 0.0F;
			@Pc(1433) float local1433 = 0.0F;
			local938 = 0.0F;
			local946 = 0.0F;
			local930 = 0.0F;
			@Pc(1441) byte local1441 = 0;
			@Pc(1443) byte local1443 = 0;
			@Pc(1445) int local1445 = 0;
			@Pc(1478) byte local1478;
			@Pc(1495) short local1495;
			@Pc(2241) short local2241;
			@Pc(2246) short local2246;
			if (local1394 != -1) {
				if (local1095 == -1) {
					local1431 = 1.0F;
					local938 = 1.0F;
					local930 = 0.0F;
					local1433 = 1.0F;
					local946 = 0.0F;
					local1429 = 0.0F;
					local1443 = 2;
					local1441 = 1;
				} else {
					local1095 &= 0xFF;
					local1478 = arg1.aByteArray27[local1095];
					@Pc(1485) short local1485;
					@Pc(1490) short local1490;
					@Pc(1524) float local1524;
					@Pc(1537) float local1537;
					@Pc(1616) float local1616;
					@Pc(2047) float local2047;
					@Pc(2055) float local2055;
					@Pc(2063) float local2063;
					@Pc(2086) float local2086;
					@Pc(2109) float local2109;
					@Pc(2132) float local2132;
					if (local1478 == 0) {
						local1485 = arg1.aShortArray33[local1382];
						local1490 = arg1.aShortArray27[local1382];
						local1495 = arg1.aShortArray28[local1382];
						local2241 = arg1.aShortArray32[local1095];
						local2246 = arg1.aShortArray29[local1095];
						@Pc(2251) short local2251 = arg1.aShortArray34[local1095];
						@Pc(2257) float local2257 = (float) arg1.anIntArray65[local2241];
						@Pc(2263) float local2263 = (float) arg1.anIntArray71[local2241];
						local1524 = arg1.anIntArray72[local2241];
						local1537 = (float) arg1.anIntArray65[local2246] - local2257;
						local1616 = (float) arg1.anIntArray71[local2246] - local2263;
						@Pc(2295) float local2295 = (float) arg1.anIntArray72[local2246] - local1524;
						@Pc(2303) float local2303 = (float) arg1.anIntArray65[local2251] - local2257;
						@Pc(2312) float local2312 = (float) arg1.anIntArray71[local2251] - local2263;
						@Pc(2321) float local2321 = (float) arg1.anIntArray72[local2251] - local1524;
						@Pc(2329) float local2329 = (float) arg1.anIntArray65[local1485] - local2257;
						@Pc(2337) float local2337 = (float) arg1.anIntArray71[local1485] - local2263;
						@Pc(2345) float local2345 = (float) arg1.anIntArray72[local1485] - local1524;
						@Pc(2353) float local2353 = (float) arg1.anIntArray65[local1490] - local2257;
						@Pc(2361) float local2361 = (float) arg1.anIntArray71[local1490] - local2263;
						local2047 = (float) arg1.anIntArray72[local1490] - local1524;
						local2055 = (float) arg1.anIntArray65[local1495] - local2257;
						local2063 = (float) arg1.anIntArray71[local1495] - local2263;
						local2086 = (float) arg1.anIntArray72[local1495] - local1524;
						local2109 = local2321 * local1616 - local2312 * local2295;
						local2132 = local2295 * local2303 - local1537 * local2321;
						@Pc(2419) float local2419 = local1537 * local2312 - local2303 * local1616;
						@Pc(2427) float local2427 = local2419 * local2312 - local2132 * local2321;
						@Pc(2436) float local2436 = local2321 * local2109 - local2419 * local2303;
						@Pc(2445) float local2445 = local2303 * local2132 - local2312 * local2109;
						@Pc(2459) float local2459 = 1.0F / (local2436 * local1616 + local1537 * local2427 + local2295 * local2445);
						local1433 = (local2361 * local2436 + local2427 * local2353 + local2445 * local2047) * local2459;
						local1429 = (local2329 * local2427 + local2337 * local2436 + local2345 * local2445) * local2459;
						local946 = (local2445 * local2086 + local2063 * local2436 + local2427 * local2055) * local2459;
						@Pc(2510) float local2510 = local1537 * local2132 - local1616 * local2109;
						@Pc(2518) float local2518 = local1616 * local2419 - local2132 * local2295;
						@Pc(2527) float local2527 = local2109 * local2295 - local1537 * local2419;
						@Pc(2541) float local2541 = 1.0F / (local2321 * local2510 + local2527 * local2312 + local2303 * local2518);
						local1431 = local2541 * (local2345 * local2510 + local2329 * local2518 + local2527 * local2337);
						local930 = local2541 * (local2518 * local2055 + local2063 * local2527 + local2510 * local2086);
						local938 = (local2353 * local2518 + local2361 * local2527 + local2510 * local2047) * local2541;
					} else {
						local1485 = arg1.aShortArray33[local1382];
						local1490 = arg1.aShortArray27[local1382];
						local1495 = arg1.aShortArray28[local1382];
						@Pc(1499) int local1499 = local632[local1095];
						@Pc(1503) int local1503 = local634[local1095];
						@Pc(1507) int local1507 = local636[local1095];
						@Pc(1511) float[] local1511 = local638[local1095];
						@Pc(1516) byte local1516 = arg1.aByteArray26[local1095];
						local1524 = (float) arg1.anIntArray67[local1095] / 256.0F;
						if (local1478 == 1) {
							local1537 = (float) arg1.anIntArray73[local1095] / 1024.0F;
							Static467.method7029(arg1.anIntArray71[local1485], local1503, arg1.anIntArray72[local1485], arg1.anIntArray65[local1485], local1507, local1511, local1537, local1524, local1499, local1516);
							local1429 = Static54.aFloat20;
							local1431 = Static245.aFloat78;
							Static467.method7029(arg1.anIntArray71[local1490], local1503, arg1.anIntArray72[local1490], arg1.anIntArray65[local1490], local1507, local1511, local1537, local1524, local1499, local1516);
							local938 = Static245.aFloat78;
							local1433 = Static54.aFloat20;
							Static467.method7029(arg1.anIntArray71[local1495], local1503, arg1.anIntArray72[local1495], arg1.anIntArray65[local1495], local1507, local1511, local1537, local1524, local1499, local1516);
							local946 = Static54.aFloat20;
							local930 = Static245.aFloat78;
							local1616 = local1537 / 2.0F;
							if ((local1516 & 0x1) == 0) {
								if (local1433 - local1429 > local1616) {
									local1433 -= local1537;
									local1441 = 1;
								} else if (local1616 < local1429 - local1433) {
									local1441 = 2;
									local1433 += local1537;
								}
								if (local1616 < local946 - local1429) {
									local946 -= local1537;
									local1443 = 1;
								} else if (local1429 - local946 > local1616) {
									local946 += local1537;
									local1443 = 2;
								}
							} else {
								if (local938 - local1431 > local1616) {
									local938 -= local1537;
									local1441 = 1;
								} else if (local1616 < local1431 - local938) {
									local938 += local1537;
									local1441 = 2;
								}
								if (local1616 < local930 - local1431) {
									local1443 = 1;
									local930 -= local1537;
								} else if (local1431 - local930 > local1616) {
									local930 += local1537;
									local1443 = 2;
								}
							}
						} else if (local1478 == 2) {
							local1537 = (float) arg1.anIntArray69[local1095] / 256.0F;
							local1616 = (float) arg1.anIntArray74[local1095] / 256.0F;
							@Pc(1958) int local1958 = arg1.anIntArray65[local1490] - arg1.anIntArray65[local1485];
							@Pc(1969) int local1969 = arg1.anIntArray71[local1490] - arg1.anIntArray71[local1485];
							@Pc(1980) int local1980 = arg1.anIntArray72[local1490] - arg1.anIntArray72[local1485];
							@Pc(1991) int local1991 = arg1.anIntArray65[local1495] - arg1.anIntArray65[local1485];
							@Pc(2002) int local2002 = arg1.anIntArray71[local1495] - arg1.anIntArray71[local1485];
							@Pc(2013) int local2013 = arg1.anIntArray72[local1495] - arg1.anIntArray72[local1485];
							@Pc(2022) int local2022 = local2013 * local1969 - local1980 * local2002;
							@Pc(2030) int local2030 = local1980 * local1991 - local1958 * local2013;
							@Pc(2039) int local2039 = local1958 * local2002 - local1991 * local1969;
							local2047 = 64.0F / (float) arg1.anIntArray64[local1095];
							local2055 = 64.0F / (float) arg1.anIntArray70[local1095];
							local2063 = 64.0F / (float) arg1.anIntArray73[local1095];
							local2086 = (local1511[0] * (float) local2022 + local1511[1] * (float) local2030 + local1511[2] * (float) local2039) / local2047;
							local2109 = (local1511[5] * (float) local2039 + (float) local2030 * local1511[4] + local1511[3] * (float) local2022) / local2055;
							local2132 = ((float) local2022 * local1511[6] + (float) local2030 * local1511[7] + (float) local2039 * local1511[8]) / local2063;
							local1445 = Static442.method6726(local2086, local2109, local2132);
							Static202.method3262(local1499, local1516, local1616, local1511, arg1.anIntArray65[local1485], arg1.anIntArray72[local1485], arg1.anIntArray71[local1485], local1537, local1507, local1445, local1524, local1503);
							local1429 = Static281.aFloat101;
							local1431 = Static474.aFloat217;
							Static202.method3262(local1499, local1516, local1616, local1511, arg1.anIntArray65[local1490], arg1.anIntArray72[local1490], arg1.anIntArray71[local1490], local1537, local1507, local1445, local1524, local1503);
							local938 = Static474.aFloat217;
							local1433 = Static281.aFloat101;
							Static202.method3262(local1499, local1516, local1616, local1511, arg1.anIntArray65[local1495], arg1.anIntArray72[local1495], arg1.anIntArray71[local1495], local1537, local1507, local1445, local1524, local1503);
							local946 = Static281.aFloat101;
							local930 = Static474.aFloat217;
						} else if (local1478 == 3) {
							Static284.method7815(local1511, local1516, arg1.anIntArray72[local1485], arg1.anIntArray71[local1485], arg1.anIntArray65[local1485], local1503, local1507, local1524, local1499);
							local1429 = Static141.aFloat221;
							local1431 = Static53.aFloat19;
							Static284.method7815(local1511, local1516, arg1.anIntArray72[local1490], arg1.anIntArray71[local1490], arg1.anIntArray65[local1490], local1503, local1507, local1524, local1499);
							local938 = Static53.aFloat19;
							local1433 = Static141.aFloat221;
							Static284.method7815(local1511, local1516, arg1.anIntArray72[local1495], arg1.anIntArray71[local1495], arg1.anIntArray65[local1495], local1503, local1507, local1524, local1499);
							local946 = Static141.aFloat221;
							local930 = Static53.aFloat19;
							if ((local1516 & 0x1) == 0) {
								if (local946 - local1429 > 0.5F) {
									local1443 = 1;
									local946--;
								} else if (local1429 - local946 > 0.5F) {
									local946++;
									local1443 = 2;
								}
								if (local1433 - local1429 > 0.5F) {
									local1441 = 1;
									local1433--;
								} else if (local1429 - local1433 > 0.5F) {
									local1441 = 2;
									local1433++;
								}
							} else {
								if (local930 - local1431 > 0.5F) {
									local1443 = 1;
									local930--;
								} else if (local1431 - local930 > 0.5F) {
									local1443 = 2;
									local930++;
								}
								if (local938 - local1431 > 0.5F) {
									local1441 = 1;
									local938--;
								} else if (local1431 - local938 > 0.5F) {
									local938++;
									local1441 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray25 == null) {
				local1478 = 0;
			} else {
				local1478 = arg1.aByteArray25[local1382];
			}
			if (local1478 == 0) {
				@Pc(2618) long local2618 = (long) (local1095 << 2) + ((long) (local1445 << 24) + (long) (local1389 << 8) + (long) local664 << 32);
				local1495 = arg1.aShortArray33[local1382];
				local2241 = arg1.aShortArray27[local1382];
				local2246 = arg1.aShortArray28[local1382];
				@Pc(2637) Class253 local2637 = local336[local1495];
				this.aShortArray102[local1376] = this.method6324(local2637.anInt7840, local2637.anInt7839, local1429, local1495, local1376, local1431, arg1, local2618, local2637.anInt7841, local2637.anInt7842);
				@Pc(2662) Class253 local2662 = local336[local2241];
				this.aShortArray96[local1376] = this.method6324(local2662.anInt7840, local2662.anInt7839, local1433, local2241, local1376, local938, arg1, (long) local1441 + local2618, local2662.anInt7841, local2662.anInt7842);
				@Pc(2690) Class253 local2690 = local336[local2246];
				this.aShortArray93[local1376] = this.method6324(local2690.anInt7840, local2690.anInt7839, local946, local2246, local1376, local930, arg1, (long) local1443 + local2618, local2690.anInt7841, local2690.anInt7842);
			} else if (local1478 == 1) {
				@Pc(2723) Class89 local2723 = local1054[local1382];
				@Pc(2769) long local2769 = (long) ((local2723.anInt2538 + 256 << 22) + (local1095 << 2) + (local2723.anInt2536 > 0 ? 1024 : 2048) + (local2723.anInt2537 + 256 << 12)) + ((long) (local1389 << 8) + (long) (local1445 << 24) + (long) local664 << 32);
				this.aShortArray102[local1376] = this.method6324(local2723.anInt2537, 0, local1429, arg1.aShortArray33[local1382], local1376, local1431, arg1, local2769, local2723.anInt2538, local2723.anInt2536);
				this.aShortArray96[local1376] = this.method6324(local2723.anInt2537, 0, local1433, arg1.aShortArray27[local1382], local1376, local938, arg1, local2769 + (long) local1441, local2723.anInt2538, local2723.anInt2536);
				this.aShortArray93[local1376] = this.method6324(local2723.anInt2537, 0, local946, arg1.aShortArray28[local1382], local1376, local930, arg1, (long) local1443 + local2769, local2723.anInt2538, local2723.anInt2536);
			}
			if (arg1.aShortArray35 == null) {
				this.aShortArray97[local1376] = -1;
			} else {
				this.aShortArray97[local1376] = arg1.aShortArray35[local1382];
			}
			if (arg1.aByteArray30 != null) {
				this.aByteArray99[local1376] = arg1.aByteArray30[local1382];
			}
			if (arg1.aShortArray31 != null) {
				this.aShortArray98[local1376] = arg1.aShortArray31[local1382];
			}
			this.aShortArray92[local1376] = arg1.aShortArray30[local1382];
		}
		if (this.anInt7498 > 0) {
			local1382 = 1;
			local1073 = this.aShortArray97[0];
			for (local1084 = 0; local1084 < this.anInt7498; local1084++) {
				@Pc(2919) short local2919 = this.aShortArray97[local1084];
				if (local2919 != local1073) {
					local1073 = local2919;
					local1382++;
				}
			}
			this.anIntArray582 = new int[local1382 + 1];
			this.anIntArray581 = new int[local1382];
			this.anIntArray583 = new int[local1382];
			this.anIntArray582[0] = 0;
			local1095 = this.anInt7560;
			local1382 = 0;
			local1073 = this.aShortArray97[0];
			@Pc(2969) short local2969 = 0;
			for (local706 = 0; local706 < this.anInt7498; local706++) {
				@Pc(2978) short local2978 = this.aShortArray97[local706];
				if (local1073 != local2978) {
					this.anIntArray583[local1382] = local1095;
					this.anIntArray581[local1382] = local2969 + 1 - local1095;
					local1382++;
					this.anIntArray582[local1382] = local706;
					local1095 = this.anInt7560;
					local1073 = local2978;
					local2969 = 0;
				}
				@Pc(3018) short local3018 = this.aShortArray102[local706];
				if (local3018 > local2969) {
					local2969 = local3018;
				}
				if (local1095 > local3018) {
					local1095 = local3018;
				}
				local3018 = this.aShortArray96[local706];
				if (local3018 < local1095) {
					local1095 = local3018;
				}
				if (local2969 < local3018) {
					local2969 = local3018;
				}
				local3018 = this.aShortArray93[local706];
				if (local3018 > local2969) {
					local2969 = local3018;
				}
				if (local1095 > local3018) {
					local1095 = local3018;
				}
			}
			this.anIntArray583[local1382] = local1095;
			this.anIntArray581[local1382] = local2969 + 1 - local1095;
			local1382++;
			this.anIntArray582[local1382] = this.anInt7498;
		}
		Static518.aLongArray16 = null;
		this.aShortArray99 = Static42.method811(this.aShortArray99, this.anInt7560);
		this.aShortArray103 = Static42.method811(this.aShortArray103, this.anInt7560);
		this.aShortArray100 = Static42.method811(this.aShortArray100, this.anInt7560);
		this.aShortArray101 = Static42.method811(this.aShortArray101, this.anInt7560);
		this.aShortArray94 = Static42.method811(this.aShortArray94, this.anInt7560);
		this.aByteArray100 = Static488.method7229(this.anInt7560, this.aByteArray100);
		this.aFloatArray66 = Static11.method3916(this.anInt7560, this.aFloatArray66);
		this.aFloatArray67 = Static11.method3916(this.anInt7560, this.aFloatArray67);
		if (arg1.anIntArray68 != null && Static344.method5415(this.anInt7499, arg2)) {
			this.anIntArrayArray65 = arg1.method873(false);
		}
		if (arg1.aClass120Array1 != null && Static173.method2894(this.anInt7499, arg2)) {
			this.anIntArrayArray64 = arg1.method861();
		}
		if (arg1.anIntArray66 != null && Static77.method1566(this.anInt7499, arg2)) {
			local1382 = 0;
			local656 = new int[256];
			for (local1084 = 0; local1084 < this.anInt7546; local1084++) {
				local1095 = arg1.anIntArray66[local15[local1084]];
				if (local1095 >= 0) {
					@Pc(3222) int local3222 = local656[local1095]++;
					if (local1095 > local1382) {
						local1382 = local1095;
					}
				}
			}
			this.anIntArrayArray66 = new int[local1382 + 1][];
			for (local1095 = 0; local1095 <= local1382; local1095++) {
				this.anIntArrayArray66[local1095] = new int[local656[local1095]];
				local656[local1095] = 0;
			}
			for (local664 = 0; local664 < this.anInt7546; local664++) {
				local706 = arg1.anIntArray66[local15[local664]];
				if (local706 >= 0) {
					this.anIntArrayArray66[local706][local656[local706]++] = local664;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!kw;IIZZ)V")
	public Class63_Sub3(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7497 = 0;
		this.aBoolean562 = true;
		this.aBoolean563 = false;
		this.aBoolean561 = false;
		this.anInt7498 = 0;
		this.anInt7546 = 0;
		this.anInt7560 = 0;
		this.anInt7563 = 0;
		this.aBoolean561 = arg4;
		this.aClass39_Sub2_18 = arg0;
		this.anInt7499 = arg2;
		this.anInt7567 = arg1;
		if (arg3 || Static70.method1448(this.anInt7567, this.anInt7499)) {
			this.aClass106_2 = new Class106(Static105.method1941(this.anInt7499, this.anInt7567));
		}
		if (arg3 || Static450.method6875(this.anInt7499, this.anInt7567)) {
			this.aClass106_4 = new Class106(Static61.method1138(this.anInt7499, this.anInt7567));
		}
		if (arg3 || Static154.method2639(this.anInt7567, this.anInt7499)) {
			this.aClass106_1 = new Class106(Static154.method2641(this.anInt7567, this.anInt7499));
		}
		if (arg3 || Static151.method2621(this.anInt7567, this.anInt7499)) {
			this.aClass106_3 = new Class106(Static215.method6802(this.anInt7499, this.anInt7567));
		}
		if (arg3 || Static387.method6220(this.anInt7499, this.anInt7567)) {
			this.aClass174_1 = new Class174(Static153.method7529(this.anInt7499, this.anInt7567));
		}
	}

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "(I)V")
	@Override
	public void q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class125.anIntArray381[arg0];
		@Pc(13) int local13 = Class125.anIntArray382[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7497; local15++) {
			local33 = local9 * this.anIntArray580[local15] + this.anIntArray579[local15] * local13 >> 15;
			this.anIntArray580[local15] = this.anIntArray580[local15] * local13 - this.anIntArray579[local15] * local9 >> 15;
			this.anIntArray579[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt7560; local33++) {
			@Pc(86) int local86 = local13 * this.aShortArray100[local33] + this.aShortArray94[local33] * local9 >> 15;
			this.aShortArray94[local33] = (short) (local13 * this.aShortArray94[local33] - this.aShortArray100[local33] * local9 >> 15);
			this.aShortArray100[local33] = (short) local86;
		}
		this.method6326();
		this.method6335();
		this.aBoolean563 = false;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZIIZLclient!qi;Lclient!qi;)Lclient!r;")
	private Class63 method6321(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class63_Sub3 arg3, @OriginalArg(5) Class63_Sub3 arg4) {
		arg4.anInt7498 = this.anInt7498;
		arg4.anInt7499 = this.anInt7499;
		arg4.aShort124 = this.aShort124;
		arg4.anInt7565 = this.anInt7565;
		arg4.aShort123 = this.aShort123;
		arg4.anInt7560 = this.anInt7560;
		arg4.anInt7546 = this.anInt7546;
		arg4.anInt7497 = this.anInt7497;
		arg4.anInt7563 = this.anInt7563;
		arg4.anInt7567 = arg1;
		@Pc(50) boolean local50 = Static291.method4612(this.anInt7499, arg1);
		@Pc(56) boolean local56 = Static538.method7755(arg1, this.anInt7499);
		@Pc(62) boolean local62 = Static114.method2233(arg1, this.anInt7499);
		@Pc(68) boolean local68 = local62 | local50 | local56;
		@Pc(193) int local193;
		if (local68) {
			if (!local50) {
				arg4.anIntArray579 = this.anIntArray579;
			} else if (arg3.anIntArray579 == null || arg3.anIntArray579.length < this.anInt7563) {
				arg4.anIntArray579 = arg3.anIntArray579 = new int[this.anInt7563];
			} else {
				arg4.anIntArray579 = arg3.anIntArray579;
			}
			if (!local56) {
				arg4.anIntArray584 = this.anIntArray584;
			} else if (arg3.anIntArray584 == null || arg3.anIntArray584.length < this.anInt7563) {
				arg4.anIntArray584 = arg3.anIntArray584 = new int[this.anInt7563];
			} else {
				arg4.anIntArray584 = arg3.anIntArray584;
			}
			if (!local62) {
				arg4.anIntArray580 = this.anIntArray580;
			} else if (arg3.anIntArray580 == null || this.anInt7563 > arg3.anIntArray580.length) {
				arg4.anIntArray580 = arg3.anIntArray580 = new int[this.anInt7563];
			} else {
				arg4.anIntArray580 = arg3.anIntArray580;
			}
			for (local193 = 0; local193 < this.anInt7563; local193++) {
				if (local50) {
					arg4.anIntArray579[local193] = this.anIntArray579[local193];
				}
				if (local56) {
					arg4.anIntArray584[local193] = this.anIntArray584[local193];
				}
				if (local62) {
					arg4.anIntArray580[local193] = this.anIntArray580[local193];
				}
			}
		} else {
			arg4.anIntArray579 = this.anIntArray579;
			arg4.anIntArray584 = this.anIntArray584;
			arg4.anIntArray580 = this.anIntArray580;
		}
		if (Static105.method1941(this.anInt7499, arg1)) {
			arg4.aClass106_2 = arg3.aClass106_2;
			arg4.aClass106_2.aBoolean249 = this.aClass106_2.aBoolean249;
			arg4.aClass106_2.aBoolean248 = true;
			arg4.aClass106_2.anInterface19_6 = this.aClass106_2.anInterface19_6;
		} else if (Static70.method1448(arg1, this.anInt7499)) {
			arg4.aClass106_2 = this.aClass106_2;
		} else {
			arg4.aClass106_2 = null;
		}
		if (Static311.method4814(this.anInt7499, arg1)) {
			if (arg3.aShortArray92 == null || this.anInt7546 > arg3.aShortArray92.length) {
				arg4.aShortArray92 = arg3.aShortArray92 = new short[this.anInt7546];
			} else {
				arg4.aShortArray92 = arg3.aShortArray92;
			}
			for (local193 = 0; local193 < this.anInt7546; local193++) {
				arg4.aShortArray92[local193] = this.aShortArray92[local193];
			}
		} else {
			arg4.aShortArray92 = this.aShortArray92;
		}
		if (Static439.method6710(this.anInt7499, arg1)) {
			if (arg3.aByteArray99 == null || arg3.aByteArray99.length < this.anInt7546) {
				arg4.aByteArray99 = arg3.aByteArray99 = new byte[this.anInt7546];
			} else {
				arg4.aByteArray99 = arg3.aByteArray99;
			}
			for (local193 = 0; local193 < this.anInt7546; local193++) {
				arg4.aByteArray99[local193] = this.aByteArray99[local193];
			}
		} else {
			arg4.aByteArray99 = this.aByteArray99;
		}
		if (Static154.method2641(arg1, this.anInt7499)) {
			arg4.aClass106_1 = arg3.aClass106_1;
			arg4.aClass106_1.aBoolean249 = this.aClass106_1.aBoolean249;
			arg4.aClass106_1.aBoolean248 = true;
			arg4.aClass106_1.anInterface19_6 = this.aClass106_1.anInterface19_6;
		} else if (Static154.method2639(arg1, this.anInt7499)) {
			arg4.aClass106_1 = this.aClass106_1;
		} else {
			arg4.aClass106_1 = null;
		}
		@Pc(540) int local540;
		if (Static262.method6141(this.anInt7499, arg1)) {
			if (arg3.aShortArray100 == null || arg3.aShortArray100.length < this.anInt7560) {
				local193 = this.anInt7560;
				arg4.aShortArray100 = arg3.aShortArray100 = new short[local193];
				arg4.aShortArray101 = arg3.aShortArray101 = new short[local193];
				arg4.aShortArray94 = arg3.aShortArray94 = new short[local193];
			} else {
				arg4.aShortArray101 = arg3.aShortArray101;
				arg4.aShortArray100 = arg3.aShortArray100;
				arg4.aShortArray94 = arg3.aShortArray94;
			}
			if (this.aClass21_1 == null) {
				arg4.aClass21_1 = null;
				for (local193 = 0; local193 < this.anInt7560; local193++) {
					arg4.aShortArray100[local193] = this.aShortArray100[local193];
					arg4.aShortArray101[local193] = this.aShortArray101[local193];
					arg4.aShortArray94[local193] = this.aShortArray94[local193];
				}
			} else {
				if (arg3.aClass21_1 == null) {
					arg3.aClass21_1 = new Class21();
				}
				@Pc(528) Class21 local528 = arg4.aClass21_1 = arg3.aClass21_1;
				if (local528.aShortArray21 == null || this.anInt7560 > local528.aShortArray21.length) {
					local540 = this.anInt7560;
					local528.aShortArray20 = new short[local540];
					local528.aShortArray21 = new short[local540];
					local528.aShortArray19 = new short[local540];
					local528.aByteArray20 = new byte[local540];
				}
				for (local540 = 0; local540 < this.anInt7560; local540++) {
					arg4.aShortArray100[local540] = this.aShortArray100[local540];
					arg4.aShortArray101[local540] = this.aShortArray101[local540];
					arg4.aShortArray94[local540] = this.aShortArray94[local540];
					local528.aShortArray21[local540] = this.aClass21_1.aShortArray21[local540];
					local528.aShortArray20[local540] = this.aClass21_1.aShortArray20[local540];
					local528.aShortArray19[local540] = this.aClass21_1.aShortArray19[local540];
					local528.aByteArray20[local540] = this.aClass21_1.aByteArray20[local540];
				}
			}
			arg4.aByteArray100 = this.aByteArray100;
		} else {
			arg4.aByteArray100 = this.aByteArray100;
			arg4.aClass21_1 = this.aClass21_1;
			arg4.aShortArray101 = this.aShortArray101;
			arg4.aShortArray100 = this.aShortArray100;
			arg4.aShortArray94 = this.aShortArray94;
		}
		if (Static215.method6802(this.anInt7499, arg1)) {
			arg4.aClass106_3 = arg3.aClass106_3;
			arg4.aClass106_3.aBoolean249 = this.aClass106_3.aBoolean249;
			arg4.aClass106_3.aBoolean248 = true;
			arg4.aClass106_3.anInterface19_6 = this.aClass106_3.anInterface19_6;
		} else if (Static151.method2621(arg1, this.anInt7499)) {
			arg4.aClass106_3 = this.aClass106_3;
		} else {
			arg4.aClass106_3 = null;
		}
		if (Static16.method470(arg1, this.anInt7499)) {
			if (arg3.aFloatArray66 == null || arg3.aFloatArray66.length < this.anInt7546) {
				local193 = this.anInt7560;
				arg4.aFloatArray66 = arg3.aFloatArray66 = new float[local193];
				arg4.aFloatArray67 = arg3.aFloatArray67 = new float[local193];
			} else {
				arg4.aFloatArray67 = arg3.aFloatArray67;
				arg4.aFloatArray66 = arg3.aFloatArray66;
			}
			for (local193 = 0; local193 < this.anInt7560; local193++) {
				arg4.aFloatArray66[local193] = this.aFloatArray66[local193];
				arg4.aFloatArray67[local193] = this.aFloatArray67[local193];
			}
		} else {
			arg4.aFloatArray67 = this.aFloatArray67;
			arg4.aFloatArray66 = this.aFloatArray66;
		}
		if (Static61.method1138(this.anInt7499, arg1)) {
			arg4.aClass106_4 = arg3.aClass106_4;
			arg4.aClass106_4.aBoolean248 = true;
			arg4.aClass106_4.anInterface19_6 = this.aClass106_4.anInterface19_6;
			arg4.aClass106_4.aBoolean249 = this.aClass106_4.aBoolean249;
		} else if (Static450.method6875(this.anInt7499, arg1)) {
			arg4.aClass106_4 = this.aClass106_4;
		} else {
			arg4.aClass106_4 = null;
		}
		if (Static521.method7543(arg1, this.anInt7499)) {
			if (arg3.aShortArray102 == null || this.anInt7546 > arg3.aShortArray102.length) {
				local193 = this.anInt7546;
				arg4.aShortArray96 = arg3.aShortArray96 = new short[local193];
				arg4.aShortArray102 = arg3.aShortArray102 = new short[local193];
				arg4.aShortArray93 = arg3.aShortArray93 = new short[local193];
			} else {
				arg4.aShortArray93 = arg3.aShortArray93;
				arg4.aShortArray96 = arg3.aShortArray96;
				arg4.aShortArray102 = arg3.aShortArray102;
			}
			for (local193 = 0; local193 < this.anInt7546; local193++) {
				arg4.aShortArray102[local193] = this.aShortArray102[local193];
				arg4.aShortArray96[local193] = this.aShortArray96[local193];
				arg4.aShortArray93[local193] = this.aShortArray93[local193];
			}
		} else {
			arg4.aShortArray93 = this.aShortArray93;
			arg4.aShortArray96 = this.aShortArray96;
			arg4.aShortArray102 = this.aShortArray102;
		}
		if (Static153.method7529(this.anInt7499, arg1)) {
			arg4.aClass174_1 = arg3.aClass174_1;
			arg4.aClass174_1.aBoolean373 = this.aClass174_1.aBoolean373;
			arg4.aClass174_1.anInterface7_5 = this.aClass174_1.anInterface7_5;
			arg4.aClass174_1.aBoolean374 = true;
		} else if (Static387.method6220(this.anInt7499, arg1)) {
			arg4.aClass174_1 = this.aClass174_1;
		} else {
			arg4.aClass174_1 = null;
		}
		if (Static251.method3972(this.anInt7499, arg1)) {
			if (arg3.aShortArray97 == null || this.anInt7546 > arg3.aShortArray97.length) {
				local193 = this.anInt7546;
				arg4.aShortArray97 = arg3.aShortArray97 = new short[local193];
			} else {
				arg4.aShortArray97 = arg3.aShortArray97;
			}
			for (local193 = 0; local193 < this.anInt7546; local193++) {
				arg4.aShortArray97[local193] = this.aShortArray97[local193];
			}
		} else {
			arg4.aShortArray97 = this.aShortArray97;
		}
		if (!Static518.method7535(this.anInt7499, arg1)) {
			arg4.aClass114Array1 = this.aClass114Array1;
		} else if (arg3.aClass114Array1 == null || this.anInt7565 > arg3.aClass114Array1.length) {
			local193 = this.anInt7565;
			arg4.aClass114Array1 = arg3.aClass114Array1 = new Class114[local193];
			for (local540 = 0; local540 < this.anInt7565; local540++) {
				arg4.aClass114Array1[local540] = this.aClass114Array1[local540].method2967();
			}
		} else {
			arg4.aClass114Array1 = arg3.aClass114Array1;
			for (local193 = 0; local193 < this.anInt7565; local193++) {
				arg4.aClass114Array1[local193].method2965(this.aClass114Array1[local193]);
			}
		}
		arg4.anIntArrayArray64 = this.anIntArrayArray64;
		arg4.aShortArray104 = this.aShortArray104;
		arg4.anIntArrayArray65 = this.anIntArrayArray65;
		arg4.aShortArray98 = this.aShortArray98;
		arg4.anIntArray581 = this.anIntArray581;
		arg4.aShortArray95 = this.aShortArray95;
		arg4.aClass192Array6 = this.aClass192Array6;
		arg4.anIntArrayArray66 = this.anIntArrayArray66;
		if (this.aBoolean563) {
			arg4.anInt7501 = this.anInt7501;
			arg4.anInt7531 = this.anInt7531;
			arg4.anInt7547 = this.anInt7547;
			arg4.aBoolean563 = true;
			arg4.anInt7519 = this.anInt7519;
			arg4.anInt7511 = this.anInt7511;
			arg4.anInt7515 = this.anInt7515;
			arg4.anInt7557 = this.anInt7557;
		} else {
			arg4.aBoolean563 = false;
		}
		arg4.aShortArray103 = this.aShortArray103;
		arg4.aClass289Array1 = this.aClass289Array1;
		arg4.anIntArray583 = this.anIntArray583;
		arg4.anIntArray578 = this.anIntArray578;
		arg4.anIntArray582 = this.anIntArray582;
		arg4.aClass169Array6 = this.aClass169Array6;
		arg4.aShortArray99 = this.aShortArray99;
		return arg4;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
	private void method6322() {
		if (this.anInt7498 == 0) {
			return;
		}
		if (this.method6332() && this.method6336()) {
			this.aClass39_Sub2_18.method6095(0, this.aClass106_2.anInterface19_6);
			this.aClass39_Sub2_18.method6095(1, this.aClass106_1.anInterface19_6);
			this.aClass39_Sub2_18.method6095(2, this.aClass106_4.anInterface19_6);
			@Pc(62) boolean local62;
			if ((this.anInt7499 & 0x37) == 0) {
				local62 = false;
				this.aClass39_Sub2_18.method6139(false);
				this.aClass39_Sub2_18.method6200(this.aClass39_Sub2_18.aClass304_19);
			} else {
				local62 = true;
				this.aClass39_Sub2_18.method6139(true);
				this.aClass39_Sub2_18.method6200(this.aClass39_Sub2_18.aClass304_21);
				this.aClass39_Sub2_18.method6095(3, this.aClass106_3.anInterface19_6);
			}
			for (@Pc(100) int local100 = 0; local100 < this.anIntArray583.length; local100++) {
				@Pc(107) int local107 = this.anIntArray582[local100];
				@Pc(114) int local114 = this.anIntArray582[local100 + 1];
				@Pc(121) int local121 = this.aShortArray97[local107] & 0xFFFF;
				if (local121 == 65535) {
					local121 = -1;
				}
				this.aClass39_Sub2_18.method6208(local62, local121, true);
				this.aClass39_Sub2_18.method6215(this.aClass174_1.anInterface7_5, local107 * 3, Static514.aClass281_6, local114 - local107, this.anIntArray583[local100], this.anIntArray581[local100]);
			}
		}
		this.method6331();
	}

	@OriginalMember(owner = "client!qi", name = "ga", descriptor = "()I")
	@Override
	public int ga() {
		return this.aShort123;
	}

	@OriginalMember(owner = "client!qi", name = "MA", descriptor = "()V")
	@Override
	protected void MA() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7563; local3++) {
			this.anIntArray579[local3] = this.anIntArray579[local3] + 7 >> 4;
			this.anIntArray584[local3] = this.anIntArray584[local3] + 7 >> 4;
			this.anIntArray580[local3] = this.anIntArray580[local3] + 7 >> 4;
		}
		this.method6326();
		this.aBoolean563 = false;
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "()Z")
	@Override
	public boolean method7707() {
		if (this.aShortArray97 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray97.length; local12++) {
			if (this.aShortArray97[local12] != -1 && !this.aClass39_Sub2_18.anInterface12_15.method2572(this.aShortArray97[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qi", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		if (!this.aBoolean563) {
			this.method6329();
		}
		return this.anInt7547;
	}

	@OriginalMember(owner = "client!qi", name = "wa", descriptor = "()I")
	@Override
	public int wa() {
		if (!this.aBoolean563) {
			this.method6329();
		}
		return this.anInt7519;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	@Override
	public void b(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class125.anIntArray381[arg0];
		@Pc(13) int local13 = Class125.anIntArray382[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7497; local15++) {
			@Pc(33) int local33 = this.anIntArray579[local15] * local13 + local9 * this.anIntArray584[local15] >> 15;
			this.anIntArray584[local15] = local13 * this.anIntArray584[local15] - this.anIntArray579[local15] * local9 >> 15;
			this.anIntArray579[local15] = local33;
		}
		this.method6326();
		this.aBoolean563 = false;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "()[Lclient!kv;")
	@Override
	public Class169[] method7702() {
		return this.aClass169Array6;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BLclient!vh;)V")
	private void method6323(@OriginalArg(1) Class2_Sub13_Sub6_Sub2 arg0) {
		if (this.anInt7560 > Static118.anIntArray308.length) {
			Static118.anIntArray308 = new int[this.anInt7560];
			Static355.anIntArray514 = new int[this.anInt7560];
		}
		@Pc(47) int local47;
		@Pc(86) int local86;
		@Pc(95) int local95;
		for (@Pc(20) int local20 = 0; local20 < this.anInt7497; local20++) {
			local47 = (this.anIntArray579[local20] - (this.aClass39_Sub2_18.anInt7306 * this.anIntArray584[local20] >> 8) >> this.aClass39_Sub2_18.anInt7289) - arg0.anInt8866;
			@Pc(72) int local72 = (this.anIntArray580[local20] - (this.aClass39_Sub2_18.anInt7295 * this.anIntArray584[local20] >> 8) >> this.aClass39_Sub2_18.anInt7289) - arg0.anInt8863;
			@Pc(77) int local77 = this.anIntArray578[local20];
			@Pc(84) int local84 = this.anIntArray578[local20 + 1];
			for (local86 = local77; local86 < local84; local86++) {
				local95 = this.aShortArray95[local86] - 1;
				if (local95 == -1) {
					break;
				}
				Static118.anIntArray308[local95] = local47;
				Static355.anIntArray514[local95] = local72;
			}
		}
		for (local47 = 0; local47 < this.anInt7498; local47++) {
			if (this.aByteArray99 == null || this.aByteArray99[local47] <= 128) {
				@Pc(148) short local148 = this.aShortArray102[local47];
				@Pc(153) short local153 = this.aShortArray96[local47];
				@Pc(158) short local158 = this.aShortArray93[local47];
				local86 = Static118.anIntArray308[local148];
				local95 = Static118.anIntArray308[local153];
				@Pc(170) int local170 = Static118.anIntArray308[local158];
				@Pc(174) int local174 = Static355.anIntArray514[local148];
				@Pc(178) int local178 = Static355.anIntArray514[local153];
				@Pc(182) int local182 = Static355.anIntArray514[local158];
				if ((local86 - local95) * (local178 - local182) - (local178 - local174) * (-local95 + local170) > 0) {
					arg0.method7449(local170, local174, local86, local95, local182, local178);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!m;Lclient!gr;II)V")
	@Override
	public void method7703(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class6_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7560 == 0) {
			return;
		}
		@Pc(16) Class181_Sub2 local16 = this.aClass39_Sub2_18.aClass181_Sub2_16;
		@Pc(19) Class181_Sub2 local19 = (Class181_Sub2) arg0;
		if (!this.aBoolean563) {
			this.method6329();
		}
		Static473.aFloat216 = local19.aFloat138 * local16.aFloat134 + local19.aFloat136 * local16.aFloat129 + local16.aFloat133 * local19.aFloat135 + local16.aFloat138;
		Static21.aFloat13 = local19.aFloat129 * local16.aFloat134 + local16.aFloat129 * local19.aFloat132 + local19.aFloat139 * local16.aFloat133;
		@Pc(72) float local72 = Static21.aFloat13 * (float) this.anInt7547 + Static473.aFloat216;
		@Pc(80) float local80 = Static21.aFloat13 * (float) this.anInt7531 + Static473.aFloat216;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local72 > local80) {
			local90 = local80 - (float) this.anInt7511;
			local96 = (float) this.anInt7511 + local72;
		} else {
			local96 = (float) this.anInt7511 + local80;
			local90 = (float) -this.anInt7511 + local72;
		}
		if (local90 >= this.aClass39_Sub2_18.aFloat187 || local96 <= (float) this.aClass39_Sub2_18.anInt7288) {
			return;
		}
		Static171.aFloat60 = local16.aFloat135 + local16.aFloat131 * local19.aFloat138 + local19.aFloat136 * local16.aFloat139 + local16.aFloat137 * local19.aFloat135;
		Static115.aFloat44 = local16.aFloat131 * local19.aFloat129 + local19.aFloat132 * local16.aFloat139 + local16.aFloat137 * local19.aFloat139;
		@Pc(173) float local173 = Static171.aFloat60 + (float) this.anInt7547 * Static115.aFloat44;
		@Pc(181) float local181 = Static171.aFloat60 + Static115.aFloat44 * (float) this.anInt7531;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local173 > local181) {
			local197 = (float) this.aClass39_Sub2_18.anInt7287 * (local181 - (float) this.anInt7511);
			local208 = (float) this.aClass39_Sub2_18.anInt7287 * ((float) this.anInt7511 + local173);
		} else {
			local197 = ((float) -this.anInt7511 + local173) * (float) this.aClass39_Sub2_18.anInt7287;
			local208 = (float) this.aClass39_Sub2_18.anInt7287 * (local181 + (float) this.anInt7511);
		}
		if (local197 / (float) arg2 >= this.aClass39_Sub2_18.aFloat193 || local208 / (float) arg2 <= this.aClass39_Sub2_18.aFloat199) {
			return;
		}
		Static237.aFloat76 = local16.aFloat136 + local16.aFloat140 * local19.aFloat138 + local19.aFloat135 * local16.aFloat130 + local16.aFloat132 * local19.aFloat136;
		Static404.aFloat207 = local16.aFloat140 * local19.aFloat129 + local16.aFloat130 * local19.aFloat139 + local19.aFloat132 * local16.aFloat132;
		@Pc(299) float local299 = Static237.aFloat76 + Static404.aFloat207 * (float) this.anInt7547;
		@Pc(307) float local307 = Static237.aFloat76 + Static404.aFloat207 * (float) this.anInt7531;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local299 > local307) {
			local333 = ((float) this.anInt7511 + local299) * (float) this.aClass39_Sub2_18.anInt7312;
			local322 = (float) this.aClass39_Sub2_18.anInt7312 * ((float) -this.anInt7511 + local307);
		} else {
			local322 = (local299 - (float) this.anInt7511) * (float) this.aClass39_Sub2_18.anInt7312;
			local333 = (float) this.aClass39_Sub2_18.anInt7312 * ((float) this.anInt7511 + local307);
		}
		if (this.aClass39_Sub2_18.aFloat195 <= local322 / (float) arg2 || this.aClass39_Sub2_18.aFloat198 >= local333 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass289Array1 != null) {
			Static284.aFloat223 = local19.aFloat131 * local16.aFloat137 + local19.aFloat140 * local16.aFloat139 + local19.aFloat134 * local16.aFloat131;
			Static402.aFloat206 = local19.aFloat133 * local16.aFloat140 + local19.aFloat130 * local16.aFloat132 + local19.aFloat137 * local16.aFloat130;
			Static82.aFloat28 = local16.aFloat133 * local19.aFloat137 + local16.aFloat129 * local19.aFloat130 + local16.aFloat134 * local19.aFloat133;
			Static36.aFloat17 = local19.aFloat131 * local16.aFloat130 + local16.aFloat132 * local19.aFloat140 + local16.aFloat140 * local19.aFloat134;
			Static310.aFloat105 = local16.aFloat137 * local19.aFloat137 + local16.aFloat139 * local19.aFloat130 + local16.aFloat131 * local19.aFloat133;
			Static188.aFloat2 = local19.aFloat131 * local16.aFloat133 + local19.aFloat140 * local16.aFloat129 + local19.aFloat134 * local16.aFloat134;
		}
		if (arg1 != null) {
			@Pc(501) int local501 = this.anInt7501 + this.anInt7519 >> 1;
			@Pc(509) int local509 = this.anInt7515 + this.anInt7557 >> 1;
			@Pc(528) int local528 = (int) (Static171.aFloat60 + Static310.aFloat105 * (float) local501 + Static115.aFloat44 * (float) this.anInt7547 + Static284.aFloat223 * (float) local509);
			@Pc(547) int local547 = (int) ((float) local509 * Static36.aFloat17 + Static404.aFloat207 * (float) this.anInt7547 + (float) local501 * Static402.aFloat206 + Static237.aFloat76);
			@Pc(566) int local566 = (int) ((float) local509 * Static188.aFloat2 + (float) local501 * Static82.aFloat28 + Static473.aFloat216 + (float) this.anInt7547 * Static21.aFloat13);
			@Pc(585) int local585 = (int) (Static284.aFloat223 * (float) local509 + (float) local501 * Static310.aFloat105 + Static171.aFloat60 + (float) this.anInt7531 * Static115.aFloat44);
			@Pc(604) int local604 = (int) (Static36.aFloat17 * (float) local509 + (float) local501 * Static402.aFloat206 + Static237.aFloat76 + Static404.aFloat207 * (float) this.anInt7531);
			arg1.anInt3042 = this.aClass39_Sub2_18.anInt7305 + local585 * this.aClass39_Sub2_18.anInt7287 / arg2;
			arg1.anInt3043 = local547 * this.aClass39_Sub2_18.anInt7312 / arg2 + this.aClass39_Sub2_18.anInt7307;
			arg1.anInt3044 = this.aClass39_Sub2_18.anInt7312 * local604 / arg2 + this.aClass39_Sub2_18.anInt7307;
			@Pc(663) int local663 = (int) (Static188.aFloat2 * (float) local509 + (float) this.anInt7531 * Static21.aFloat13 + Static82.aFloat28 * (float) local501 + Static473.aFloat216);
			arg1.anInt3041 = this.aClass39_Sub2_18.anInt7305 + local528 * this.aClass39_Sub2_18.anInt7287 / arg2;
			if (local566 < this.aClass39_Sub2_18.anInt7288 && this.aClass39_Sub2_18.anInt7288 > local663) {
				arg1.aBoolean247 = true;
				arg1.anInt3040 = this.aClass39_Sub2_18.anInt7287 * (local528 + this.anInt7511) / arg2 + this.aClass39_Sub2_18.anInt7305 - arg1.anInt3041;
			}
		}
		this.aClass39_Sub2_18.method6196((float) arg2);
		this.aClass39_Sub2_18.method6206();
		this.aClass39_Sub2_18.method6211(local19);
		this.method6322();
		this.method6338();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIFIIFZLclient!bt;JII)S")
	private short method6324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class29 arg6, @OriginalArg(8) long arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray578[arg3];
		@Pc(17) int local17 = this.anIntArray578[arg3 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray95[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg7 == Static518.aLongArray16[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray95[local19] = (short) (this.anInt7560 + 1);
		Static518.aLongArray16[local19] = arg7;
		this.aShortArray103[this.anInt7560] = (short) arg4;
		this.aShortArray99[this.anInt7560] = (short) arg3;
		this.aShortArray100[this.anInt7560] = (short) arg9;
		this.aShortArray101[this.anInt7560] = (short) arg0;
		this.aShortArray94[this.anInt7560] = (short) arg8;
		this.aByteArray100[this.anInt7560] = (byte) arg1;
		this.aFloatArray66[this.anInt7560] = arg2;
		this.aFloatArray67[this.anInt7560] = arg5;
		return (short) this.anInt7560++;
	}

	@OriginalMember(owner = "client!qi", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class125.anIntArray381[arg0];
		@Pc(13) int local13 = Class125.anIntArray382[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7497; local15++) {
			@Pc(34) int local34 = this.anIntArray584[local15] * local13 - local9 * this.anIntArray580[local15] >> 15;
			this.anIntArray580[local15] = this.anIntArray580[local15] * local13 + local9 * this.anIntArray584[local15] >> 15;
			this.anIntArray584[local15] = local34;
		}
		this.method6326();
		this.aBoolean563 = false;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
	private void method6326() {
		if (this.aClass106_2 != null) {
			this.aClass106_2.aBoolean249 = false;
		}
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "()I")
	@Override
	public int e() {
		if (!this.aBoolean563) {
			this.method6329();
		}
		return this.anInt7511;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	private void method6327() {
		if (this.aClass106_1 != null) {
			this.aClass106_1.aBoolean249 = false;
		}
	}

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "()I")
	@Override
	public int n() {
		if (!this.aBoolean563) {
			this.method6329();
		}
		return this.anInt7531;
	}

	@OriginalMember(owner = "client!qi", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7497; local7++) {
			if (arg0 != 128) {
				this.anIntArray579[local7] = this.anIntArray579[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray584[local7] = this.anIntArray584[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray580[local7] = arg2 * this.anIntArray580[local7] >> 7;
			}
		}
		this.method6326();
		this.aBoolean563 = false;
	}

	@OriginalMember(owner = "client!qi", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		if (!this.aBoolean563) {
			this.method6329();
		}
		return this.anInt7557;
	}

	@OriginalMember(owner = "client!qi", name = "BA", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local24 = 0;
			Static163.anInt2944 = 0;
			Static131.anInt2526 = 0;
			Static175.anInt3251 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray65.length > local38) {
					local52 = this.anIntArrayArray65[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray104 == null || (this.aShortArray104[local60] & arg6) != 0) {
							Static175.anInt3251 += this.anIntArray579[local60];
							Static163.anInt2944 += this.anIntArray584[local60];
							local24++;
							Static131.anInt2526 += this.anIntArray580[local60];
						}
					}
				}
			}
			if (local24 > 0) {
				Static175.anInt3251 = arg2 + Static175.anInt3251 / local24;
				Static131.anInt2526 = arg4 + Static131.anInt2526 / local24;
				Static163.anInt2944 = arg3 + Static163.anInt2944 / local24;
				Static468.aBoolean608 = true;
			} else {
				Static175.anInt3251 = arg2;
				Static163.anInt2944 = arg3;
				Static131.anInt2526 = arg4;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg4 * arg7[2] + arg3 * arg7[1] + arg2 * arg7[0] + 16384 >> 15;
				local32 = arg2 * arg7[3] + arg7[4] * arg3 + arg7[5] * arg4 + 16384 >> 15;
				local38 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
				arg2 = local24;
				arg3 = local32;
				arg4 = local38;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray65.length) {
					local247 = this.anIntArrayArray65[local32];
					for (local249 = 0; local249 < local247.length; local249++) {
						local54 = local247[local249];
						if (this.aShortArray104 == null || (arg6 & this.aShortArray104[local54]) != 0) {
							this.anIntArray579[local54] += arg2;
							this.anIntArray584[local54] += arg3;
							this.anIntArray580[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(382) int local382;
		@Pc(400) int local400;
		@Pc(629) int local629;
		@Pc(638) int local638;
		@Pc(647) int local647;
		@Pc(651) int local651;
		@Pc(669) int local669;
		@Pc(1004) int local1004;
		@Pc(1012) int local1012;
		@Pc(1166) int local1166;
		@Pc(1192) int local1192;
		@Pc(1196) int local1196;
		@Pc(1205) int local1205;
		@Pc(1210) int local1210;
		@Pc(1214) int local1214;
		@Pc(1218) int local1218;
		@Pc(1220) int local1220;
		@Pc(1348) int[] local1348;
		@Pc(1350) int local1350;
		@Pc(1354) int local1354;
		@Pc(1358) int local1358;
		@Pc(1360) int local1360;
		@Pc(1489) int local1489;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray65.length > local32) {
						local247 = this.anIntArrayArray65[local32];
						for (local249 = 0; local249 < local247.length; local249++) {
							local54 = local247[local249];
							if (this.aShortArray104 == null || (arg6 & this.aShortArray104[local54]) != 0) {
								this.anIntArray579[local54] -= Static175.anInt3251;
								this.anIntArray584[local54] -= Static163.anInt2944;
								this.anIntArray580[local54] -= Static131.anInt2526;
								if (arg4 != 0) {
									local60 = Class125.anIntArray381[arg4];
									local382 = Class125.anIntArray382[arg4];
									local400 = local382 * this.anIntArray579[local54] + local60 * this.anIntArray584[local54] + 32767 >> 15;
									this.anIntArray584[local54] = local382 * this.anIntArray584[local54] + 32767 - this.anIntArray579[local54] * local60 >> 15;
									this.anIntArray579[local54] = local400;
								}
								if (arg2 != 0) {
									local60 = Class125.anIntArray381[arg2];
									local382 = Class125.anIntArray382[arg2];
									local400 = local382 * this.anIntArray584[local54] + 32767 - this.anIntArray580[local54] * local60 >> 15;
									this.anIntArray580[local54] = this.anIntArray584[local54] * local60 + this.anIntArray580[local54] * local382 + 32767 >> 15;
									this.anIntArray584[local54] = local400;
								}
								if (arg3 != 0) {
									local60 = Class125.anIntArray381[arg3];
									local382 = Class125.anIntArray382[arg3];
									local400 = local60 * this.anIntArray580[local54] + local382 * this.anIntArray579[local54] + 32767 >> 15;
									this.anIntArray580[local54] = this.anIntArray580[local54] * local382 + 32767 - local60 * this.anIntArray579[local54] >> 15;
									this.anIntArray579[local54] = local400;
								}
								this.anIntArray579[local54] += Static175.anInt3251;
								this.anIntArray584[local54] += Static163.anInt2944;
								this.anIntArray580[local54] += Static131.anInt2526;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray65.length) {
							local52 = this.anIntArrayArray65[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray104 == null || (this.aShortArray104[local60] & arg6) != 0) {
									local382 = this.anIntArray578[local60];
									local400 = this.anIntArray578[local60 + 1];
									for (local629 = local382; local629 < local400; local629++) {
										local638 = this.aShortArray95[local629] - 1;
										if (local638 == -1) {
											break;
										}
										if (arg4 != 0) {
											local647 = Class125.anIntArray381[arg4];
											local651 = Class125.anIntArray382[arg4];
											local669 = this.aShortArray100[local638] * local651 + this.aShortArray101[local638] * local647 + 32767 >> 15;
											this.aShortArray101[local638] = (short) (this.aShortArray101[local638] * local651 + 32767 - local647 * this.aShortArray100[local638] >> 15);
											this.aShortArray100[local638] = (short) local669;
										}
										if (arg2 != 0) {
											local647 = Class125.anIntArray381[arg2];
											local651 = Class125.anIntArray382[arg2];
											local669 = this.aShortArray101[local638] * local651 + 32767 - this.aShortArray94[local638] * local647 >> 15;
											this.aShortArray94[local638] = (short) (this.aShortArray94[local638] * local651 + local647 * this.aShortArray101[local638] + 32767 >> 15);
											this.aShortArray101[local638] = (short) local669;
										}
										if (arg3 != 0) {
											local647 = Class125.anIntArray381[arg3];
											local651 = Class125.anIntArray382[arg3];
											local669 = local651 * this.aShortArray100[local638] + this.aShortArray94[local638] * local647 + 32767 >> 15;
											this.aShortArray94[local638] = (short) (this.aShortArray94[local638] * local651 + 32767 - local647 * this.aShortArray100[local638] >> 15);
											this.aShortArray100[local638] = (short) local669;
										}
									}
								}
							}
						}
					}
					this.method6335();
					return;
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static468.aBoolean608) {
					local382 = Static163.anInt2944 * arg7[3] + Static175.anInt3251 * arg7[0] + Static131.anInt2526 * arg7[6] + 16384 >> 15;
					local400 = Static163.anInt2944 * arg7[4] + Static175.anInt3251 * arg7[1] + Static131.anInt2526 * arg7[7] + 16384 >> 15;
					local382 += local249;
					local400 += local54;
					local629 = arg7[2] * Static175.anInt3251 + Static163.anInt2944 * arg7[5] + Static131.anInt2526 * arg7[8] + 16384 >> 15;
					Static163.anInt2944 = local400;
					Static175.anInt3251 = local382;
					local629 += local60;
					Static131.anInt2526 = local629;
					Static468.aBoolean608 = false;
				}
				@Pc(972) int[] local972 = new int[9];
				local400 = Class125.anIntArray382[arg2];
				local629 = Class125.anIntArray381[arg2];
				local638 = Class125.anIntArray382[arg3];
				local647 = Class125.anIntArray381[arg3];
				local651 = Class125.anIntArray382[arg4];
				local669 = Class125.anIntArray381[arg4];
				local1004 = local651 * local629 + 16384 >> 15;
				local1012 = local669 * local629 + 16384 >> 15;
				local972[7] = local669 * local647 + local638 * local1004 + 16384 >> 15;
				local972[6] = local651 * -local647 + local1012 * local638 + 16384 >> 15;
				local972[4] = local400 * local651 + 16384 >> 15;
				local972[0] = local638 * local651 + local647 * local1012 + 16384 >> 15;
				local972[3] = local400 * local669 + 16384 >> 15;
				local972[8] = local400 * local638 + 16384 >> 15;
				local972[2] = local400 * local647 + 16384 >> 15;
				local972[1] = local647 * local1004 + local669 * -local638 + 16384 >> 15;
				local972[5] = -local629;
				@Pc(1140) int local1140 = local972[2] * -Static131.anInt2526 + local972[0] * -Static175.anInt3251 + -Static163.anInt2944 * local972[1] + 16384 >> 15;
				local1166 = -Static131.anInt2526 * local972[5] + local972[3] * -Static175.anInt3251 + local972[4] * -Static163.anInt2944 + 16384 >> 15;
				local1192 = local972[7] * -Static163.anInt2944 + -Static175.anInt3251 * local972[6] + -Static131.anInt2526 * local972[8] + 16384 >> 15;
				local1196 = Static175.anInt3251 + local1140;
				@Pc(1201) int local1201 = local1166 + Static163.anInt2944;
				local1205 = local1192 + Static131.anInt2526;
				@Pc(1208) int[] local1208 = new int[9];
				for (local1210 = 0; local1210 < 3; local1210++) {
					for (local1214 = 0; local1214 < 3; local1214++) {
						local1218 = 0;
						for (local1220 = 0; local1220 < 3; local1220++) {
							local1218 += arg7[local1220 + local1214 * 3] * local972[local1210 * 3 + local1220];
						}
						local1208[local1210 * 3 + local1214] = local1218 + 16384 >> 15;
					}
				}
				local1214 = local972[1] * local54 + local972[0] * local249 + local972[2] * local60 + 16384 >> 15;
				local1218 = local972[5] * local60 + local54 * local972[4] + local249 * local972[3] + 16384 >> 15;
				local1220 = local972[7] * local54 + local972[6] * local249 + local972[8] * local60 + 16384 >> 15;
				local1214 += local1196;
				local1218 += local1201;
				local1220 += local1205;
				local1348 = new int[9];
				for (local1350 = 0; local1350 < 3; local1350++) {
					for (local1354 = 0; local1354 < 3; local1354++) {
						local1358 = 0;
						for (local1360 = 0; local1360 < 3; local1360++) {
							local1358 += local1208[local1354 + local1360 * 3] * arg7[local1360 + local1350 * 3];
						}
						local1348[local1354 + local1350 * 3] = local1358 + 16384 >> 15;
					}
				}
				local1354 = local1220 * arg7[2] + local1218 * arg7[1] + arg7[0] * local1214 + 16384 >> 15;
				local1358 = arg7[5] * local1220 + arg7[4] * local1218 + arg7[3] * local1214 + 16384 >> 15;
				local1358 += local32;
				local1354 += local24;
				local1360 = arg7[7] * local1218 + local1214 * arg7[6] + local1220 * arg7[8] + 16384 >> 15;
				local1360 += local38;
				for (local1489 = 0; local1489 < local8; local1489++) {
					@Pc(1495) int local1495 = arg1[local1489];
					if (local1495 < this.anIntArrayArray65.length) {
						@Pc(1509) int[] local1509 = this.anIntArrayArray65[local1495];
						for (@Pc(1511) int local1511 = 0; local1511 < local1509.length; local1511++) {
							@Pc(1517) int local1517 = local1509[local1511];
							if (this.aShortArray104 == null || (arg6 & this.aShortArray104[local1517]) != 0) {
								@Pc(1562) int local1562 = this.anIntArray580[local1517] * local1348[2] + this.anIntArray579[local1517] * local1348[0] + this.anIntArray584[local1517] * local1348[1] + 16384 >> 15;
								@Pc(1593) int local1593 = local1348[5] * this.anIntArray580[local1517] + this.anIntArray579[local1517] * local1348[3] + this.anIntArray584[local1517] * local1348[4] + 16384 >> 15;
								@Pc(1597) int local1597 = local1562 + local1354;
								@Pc(1630) int local1630 = this.anIntArray579[local1517] * local1348[6] + this.anIntArray584[local1517] * local1348[7] + this.anIntArray580[local1517] * local1348[8] + 16384 >> 15;
								@Pc(1634) int local1634 = local1593 + local1358;
								this.anIntArray579[local1517] = local1597;
								@Pc(1643) int local1643 = local1630 + local1360;
								this.anIntArray584[local1517] = local1634;
								this.anIntArray580[local1517] = local1643;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2586) Class114 local2586;
			@Pc(2471) boolean local2471;
			@Pc(2581) Class289 local2581;
			if (arg0 == 5) {
				if (this.anIntArrayArray66 != null) {
					local2471 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray66.length > local38) {
							local52 = this.anIntArrayArray66[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray98 == null || (arg6 & this.aShortArray98[local60]) != 0) {
									local382 = arg2 * 8 + (this.aByteArray99[local60] & 0xFF);
									if (local382 < 0) {
										local382 = 0;
									} else if (local382 > 255) {
										local382 = 255;
									}
									this.aByteArray99[local60] = (byte) local382;
								}
							}
							local2471 |= local52.length > 0;
						}
					}
					if (local2471) {
						if (this.aClass289Array1 != null) {
							for (local38 = 0; local38 < this.anInt7565; local38++) {
								local2581 = this.aClass289Array1[local38];
								local2586 = this.aClass114Array1[local38];
								local2586.anInt3305 = local2586.anInt3305 & 0xFFFFFF | 255 - (this.aByteArray99[local2581.anInt8682] & 0xFF) << 24;
							}
						}
						this.method6327();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray66 != null) {
					local2471 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray66.length > local38) {
							local52 = this.anIntArrayArray66[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray98 == null || (arg6 & this.aShortArray98[local60]) != 0) {
									local382 = this.aShortArray92[local60] & 0xFFFF;
									local400 = local382 >> 10 & 0x3F;
									local629 = local382 >> 7 & 0x7;
									@Pc(2688) int local2688 = local400 + arg2 & 0x3F;
									local638 = local382 & 0x7F;
									local629 += arg3 / 4;
									local638 += arg4;
									if (local629 < 0) {
										local629 = 0;
									} else if (local629 > 7) {
										local629 = 7;
									}
									if (local638 < 0) {
										local638 = 0;
									} else if (local638 > 127) {
										local638 = 127;
									}
									this.aShortArray92[local60] = (short) (local638 | local629 << 7 | local2688 << 10);
								}
							}
							local2471 |= local52.length > 0;
						}
					}
					if (local2471) {
						if (this.aClass289Array1 != null) {
							for (local38 = 0; local38 < this.anInt7565; local38++) {
								local2581 = this.aClass289Array1[local38];
								local2586 = this.aClass114Array1[local38];
								local2586.anInt3305 = local2586.anInt3305 & 0xFF000000 | Static445.anIntArray614[this.aShortArray92[local2581.anInt8682] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method6327();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray64 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray64.length) {
							local247 = this.anIntArrayArray64[local32];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2586 = this.aClass114Array1[local247[local249]];
								local2586.anInt3300 += arg2;
								local2586.anInt3297 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray64 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray64.length) {
							local247 = this.anIntArrayArray64[local32];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2586 = this.aClass114Array1[local247[local249]];
								local2586.anInt3303 = local2586.anInt3303 * arg3 >> 7;
								local2586.anInt3306 = arg2 * local2586.anInt3306 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray64 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray64.length) {
						local247 = this.anIntArrayArray64[local32];
						for (local249 = 0; local249 < local247.length; local249++) {
							local2586 = this.aClass114Array1[local247[local249]];
							local2586.anInt3299 = local2586.anInt3299 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray65.length) {
					local247 = this.anIntArrayArray65[local32];
					for (local249 = 0; local249 < local247.length; local249++) {
						local54 = local247[local249];
						if (this.aShortArray104 == null || (this.aShortArray104[local54] & arg6) != 0) {
							this.anIntArray579[local54] -= Static175.anInt3251;
							this.anIntArray584[local54] -= Static163.anInt2944;
							this.anIntArray580[local54] -= Static131.anInt2526;
							this.anIntArray579[local54] = arg2 * this.anIntArray579[local54] >> 7;
							this.anIntArray584[local54] = this.anIntArray584[local54] * arg3 >> 7;
							this.anIntArray580[local54] = arg4 * this.anIntArray580[local54] >> 7;
							this.anIntArray579[local54] += Static175.anInt3251;
							this.anIntArray584[local54] += Static163.anInt2944;
							this.anIntArray580[local54] += Static131.anInt2526;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static468.aBoolean608) {
				local382 = arg7[0] * Static175.anInt3251 + arg7[3] * Static163.anInt2944 + arg7[6] * Static131.anInt2526 + 16384 >> 15;
				local400 = Static131.anInt2526 * arg7[7] + Static163.anInt2944 * arg7[4] + arg7[1] * Static175.anInt3251 + 16384 >> 15;
				local382 += local249;
				local629 = Static175.anInt3251 * arg7[2] + Static163.anInt2944 * arg7[5] + arg7[8] * Static131.anInt2526 + 16384 >> 15;
				local400 += local54;
				Static163.anInt2944 = local400;
				local629 += local60;
				Static175.anInt3251 = local382;
				Static131.anInt2526 = local629;
				Static468.aBoolean608 = false;
			}
			local382 = arg2 << 15 >> 7;
			local400 = arg3 << 15 >> 7;
			local629 = arg4 << 15 >> 7;
			local638 = local382 * -Static175.anInt3251 + 16384 >> 15;
			local647 = -Static163.anInt2944 * local400 + 16384 >> 15;
			local651 = local629 * -Static131.anInt2526 + 16384 >> 15;
			local669 = Static175.anInt3251 + local638;
			local1004 = Static163.anInt2944 + local647;
			local1012 = Static131.anInt2526 + local651;
			@Pc(2000) int[] local2000 = new int[] { local382 * arg7[0] + 16384 >> 15, local382 * arg7[3] + 16384 >> 15, arg7[6] * local382 + 16384 >> 15, arg7[1] * local400 + 16384 >> 15, arg7[4] * local400 + 16384 >> 15, arg7[7] * local400 + 16384 >> 15, local629 * arg7[2] + 16384 >> 15, arg7[5] * local629 + 16384 >> 15, local629 * arg7[8] + 16384 >> 15 };
			local1166 = local249 * local382 + 16384 >> 15;
			local1192 = local54 * local400 + 16384 >> 15;
			local1196 = local60 * local629 + 16384 >> 15;
			@Pc(2136) int local2136 = local1166 + local669;
			@Pc(2140) int local2140 = local1192 + local1004;
			@Pc(2144) int local2144 = local1196 + local1012;
			@Pc(2147) int[] local2147 = new int[9];
			@Pc(2153) int local2153;
			for (local1205 = 0; local1205 < 3; local1205++) {
				for (local2153 = 0; local2153 < 3; local2153++) {
					local1210 = 0;
					for (local1214 = 0; local1214 < 3; local1214++) {
						local1210 += arg7[local1214 + local1205 * 3] * local2000[local2153 + local1214 * 3];
					}
					local2147[local2153 + local1205 * 3] = local1210 + 16384 >> 15;
				}
			}
			local2153 = local2144 * arg7[2] + local2140 * arg7[1] + local2136 * arg7[0] + 16384 >> 15;
			local1210 = local2140 * arg7[4] + local2136 * arg7[3] + local2144 * arg7[5] + 16384 >> 15;
			local2153 += local24;
			local1214 = local2140 * arg7[7] + arg7[6] * local2136 + local2144 * arg7[8] + 16384 >> 15;
			local1210 += local32;
			local1214 += local38;
			for (local1218 = 0; local1218 < local8; local1218++) {
				local1220 = arg1[local1218];
				if (local1220 < this.anIntArrayArray65.length) {
					local1348 = this.anIntArrayArray65[local1220];
					for (local1350 = 0; local1350 < local1348.length; local1350++) {
						local1354 = local1348[local1350];
						if (this.aShortArray104 == null || (arg6 & this.aShortArray104[local1354]) != 0) {
							local1358 = local2147[2] * this.anIntArray580[local1354] + this.anIntArray584[local1354] * local2147[1] + this.anIntArray579[local1354] * local2147[0] + 16384 >> 15;
							local1360 = this.anIntArray580[local1354] * local2147[5] + local2147[4] * this.anIntArray584[local1354] + local2147[3] * this.anIntArray579[local1354] + 16384 >> 15;
							@Pc(2392) int local2392 = local1358 + local2153;
							@Pc(2396) int local2396 = local1360 + local1210;
							local1489 = this.anIntArray579[local1354] * local2147[6] + this.anIntArray584[local1354] * local2147[7] + this.anIntArray580[local1354] * local2147[8] + 16384 >> 15;
							@Pc(2432) int local2432 = local1489 + local1214;
							this.anIntArray579[local1354] = local2392;
							this.anIntArray584[local1354] = local2396;
							this.anIntArray580[local1354] = local2432;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!oe;)V")
	private void method6328(@OriginalArg(1) Class181_Sub2 arg0) {
		@Pc(10) int local10;
		if (this.aClass192Array6 != null) {
			for (local10 = 0; local10 < this.aClass192Array6.length; local10++) {
				@Pc(17) Class192 local17 = this.aClass192Array6[local10];
				@Pc(19) Class192 local19 = local17;
				if (local17.aClass192_1 != null) {
					local19 = local17.aClass192_1;
				}
				local19.anInt5538 = (int) (arg0.aFloat135 + (float) this.anIntArray579[local17.anInt5532] * arg0.aFloat137 + arg0.aFloat139 * (float) this.anIntArray584[local17.anInt5532] + (float) this.anIntArray580[local17.anInt5532] * arg0.aFloat131);
				local19.anInt5544 = (int) (arg0.aFloat140 * (float) this.anIntArray580[local17.anInt5532] + (float) this.anIntArray579[local17.anInt5532] * arg0.aFloat130 + arg0.aFloat132 * (float) this.anIntArray584[local17.anInt5532] + arg0.aFloat136);
				local19.anInt5542 = (int) (arg0.aFloat138 + (float) this.anIntArray584[local17.anInt5532] * arg0.aFloat129 + arg0.aFloat133 * (float) this.anIntArray579[local17.anInt5532] + (float) this.anIntArray580[local17.anInt5532] * arg0.aFloat134);
				local19.anInt5545 = (int) (arg0.aFloat135 + arg0.aFloat139 * (float) this.anIntArray584[local17.anInt5539] + (float) this.anIntArray579[local17.anInt5539] * arg0.aFloat137 + (float) this.anIntArray580[local17.anInt5539] * arg0.aFloat131);
				local19.anInt5534 = (int) ((float) this.anIntArray584[local17.anInt5539] * arg0.aFloat132 + arg0.aFloat130 * (float) this.anIntArray579[local17.anInt5539] + (float) this.anIntArray580[local17.anInt5539] * arg0.aFloat140 + arg0.aFloat136);
				local19.anInt5533 = (int) (arg0.aFloat138 + arg0.aFloat134 * (float) this.anIntArray580[local17.anInt5539] + arg0.aFloat133 * (float) this.anIntArray579[local17.anInt5539] + (float) this.anIntArray584[local17.anInt5539] * arg0.aFloat129);
				local19.anInt5537 = (int) (arg0.aFloat135 + (float) this.anIntArray580[local17.anInt5543] * arg0.aFloat131 + (float) this.anIntArray584[local17.anInt5543] * arg0.aFloat139 + arg0.aFloat137 * (float) this.anIntArray579[local17.anInt5543]);
				local19.anInt5535 = (int) (arg0.aFloat136 + (float) this.anIntArray584[local17.anInt5543] * arg0.aFloat132 + arg0.aFloat130 * (float) this.anIntArray579[local17.anInt5543] + (float) this.anIntArray580[local17.anInt5543] * arg0.aFloat140);
				local19.anInt5531 = (int) (arg0.aFloat138 + arg0.aFloat129 * (float) this.anIntArray584[local17.anInt5543] + (float) this.anIntArray579[local17.anInt5543] * arg0.aFloat133 + (float) this.anIntArray580[local17.anInt5543] * arg0.aFloat134);
			}
		}
		if (this.aClass169Array6 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass169Array6.length; local10++) {
			@Pc(362) Class169 local362 = this.aClass169Array6[local10];
			@Pc(364) Class169 local364 = local362;
			if (local362.aClass169_2 != null) {
				local364 = local362.aClass169_2;
			}
			if (local362.aClass181_10 == null) {
				local362.aClass181_10 = arg0.method5993();
			} else {
				local362.aClass181_10.EA(arg0);
			}
			local364.anInt4676 = (int) (arg0.aFloat131 * (float) this.anIntArray580[local362.anInt4667] + arg0.aFloat139 * (float) this.anIntArray584[local362.anInt4667] + arg0.aFloat137 * (float) this.anIntArray579[local362.anInt4667] + arg0.aFloat135);
			local364.anInt4674 = (int) (arg0.aFloat136 + arg0.aFloat130 * (float) this.anIntArray579[local362.anInt4667] + arg0.aFloat132 * (float) this.anIntArray584[local362.anInt4667] + arg0.aFloat140 * (float) this.anIntArray580[local362.anInt4667]);
			local364.anInt4670 = (int) ((float) this.anIntArray580[local362.anInt4667] * arg0.aFloat134 + arg0.aFloat133 * (float) this.anIntArray579[local362.anInt4667] + (float) this.anIntArray584[local362.anInt4667] * arg0.aFloat129 + arg0.aFloat138);
		}
	}

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "(IIII)V")
	@Override
	protected void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		if (arg0 == 0) {
			local12 = 0;
			Static175.anInt3251 = 0;
			Static163.anInt2944 = 0;
			Static131.anInt2526 = 0;
			for (local20 = 0; local20 < this.anInt7497; local20++) {
				Static175.anInt3251 += this.anIntArray579[local20];
				Static163.anInt2944 += this.anIntArray584[local20];
				Static131.anInt2526 += this.anIntArray580[local20];
				local12++;
			}
			if (local12 <= 0) {
				Static131.anInt2526 = arg3;
				Static175.anInt3251 = arg1;
				Static163.anInt2944 = arg2;
			} else {
				Static175.anInt3251 = Static175.anInt3251 / local12 + arg1;
				Static131.anInt2526 = arg3 + Static131.anInt2526 / local12;
				Static163.anInt2944 = arg2 + Static163.anInt2944 / local12;
			}
		} else if (arg0 == 1) {
			for (local12 = 0; local12 < this.anInt7497; local12++) {
				this.anIntArray579[local12] += arg1;
				this.anIntArray584[local12] += arg2;
				this.anIntArray580[local12] += arg3;
			}
		} else {
			@Pc(168) int local168;
			@Pc(186) int local186;
			if (arg0 == 2) {
				for (local12 = 0; local12 < this.anInt7497; local12++) {
					this.anIntArray579[local12] -= Static175.anInt3251;
					this.anIntArray584[local12] -= Static163.anInt2944;
					this.anIntArray580[local12] -= Static131.anInt2526;
					if (arg3 != 0) {
						local20 = Class125.anIntArray381[arg3];
						local168 = Class125.anIntArray382[arg3];
						local186 = this.anIntArray579[local12] * local168 + this.anIntArray584[local12] * local20 + 32767 >> 15;
						this.anIntArray584[local12] = local168 * this.anIntArray584[local12] + 32767 - this.anIntArray579[local12] * local20 >> 15;
						this.anIntArray579[local12] = local186;
					}
					if (arg1 != 0) {
						local20 = Class125.anIntArray381[arg1];
						local168 = Class125.anIntArray382[arg1];
						local186 = local168 * this.anIntArray584[local12] + 32767 - local20 * this.anIntArray580[local12] >> 15;
						this.anIntArray580[local12] = local168 * this.anIntArray580[local12] + local20 * this.anIntArray584[local12] + 32767 >> 15;
						this.anIntArray584[local12] = local186;
					}
					if (arg2 != 0) {
						local20 = Class125.anIntArray381[arg2];
						local168 = Class125.anIntArray382[arg2];
						local186 = local168 * this.anIntArray579[local12] + local20 * this.anIntArray580[local12] + 32767 >> 15;
						this.anIntArray580[local12] = this.anIntArray580[local12] * local168 + 32767 - this.anIntArray579[local12] * local20 >> 15;
						this.anIntArray579[local12] = local186;
					}
					this.anIntArray579[local12] += Static175.anInt3251;
					this.anIntArray584[local12] += Static163.anInt2944;
					this.anIntArray580[local12] += Static131.anInt2526;
				}
			} else if (arg0 == 3) {
				for (local12 = 0; local12 < this.anInt7497; local12++) {
					this.anIntArray579[local12] -= Static175.anInt3251;
					this.anIntArray584[local12] -= Static163.anInt2944;
					this.anIntArray580[local12] -= Static131.anInt2526;
					this.anIntArray579[local12] = this.anIntArray579[local12] * arg1 / 128;
					this.anIntArray584[local12] = arg2 * this.anIntArray584[local12] / 128;
					this.anIntArray580[local12] = this.anIntArray580[local12] * arg3 / 128;
					this.anIntArray579[local12] += Static175.anInt3251;
					this.anIntArray584[local12] += Static163.anInt2944;
					this.anIntArray580[local12] += Static131.anInt2526;
				}
			} else {
				@Pc(511) Class289 local511;
				@Pc(516) Class114 local516;
				if (arg0 == 5) {
					for (local12 = 0; local12 < this.anInt7546; local12++) {
						local20 = (this.aByteArray99[local12] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray99[local12] = (byte) local20;
					}
					if (this.aClass289Array1 != null) {
						for (local20 = 0; local20 < this.anInt7565; local20++) {
							local511 = this.aClass289Array1[local20];
							local516 = this.aClass114Array1[local20];
							local516.anInt3305 = 255 - (this.aByteArray99[local511.anInt8682] & 0xFF) << 24 | local516.anInt3305 & 0xFFFFFF;
						}
					}
					this.method6327();
				} else if (arg0 == 7) {
					for (local12 = 0; local12 < this.anInt7546; local12++) {
						local20 = this.aShortArray92[local12] & 0xFFFF;
						local168 = local20 >> 10 & 0x3F;
						local186 = local20 >> 7 & 0x7;
						@Pc(581) int local581 = local168 + arg1 & 0x3F;
						local186 += arg2 / 4;
						@Pc(591) int local591 = local20 & 0x7F;
						local591 += arg3;
						if (local186 < 0) {
							local186 = 0;
						} else if (local186 > 7) {
							local186 = 7;
						}
						if (local591 < 0) {
							local591 = 0;
						} else if (local591 > 127) {
							local591 = 127;
						}
						this.aShortArray92[local12] = (short) (local186 << 7 | local581 << 10 | local591);
					}
					if (this.aClass289Array1 != null) {
						for (local20 = 0; local20 < this.anInt7565; local20++) {
							local511 = this.aClass289Array1[local20];
							local516 = this.aClass114Array1[local20];
							local516.anInt3305 = local516.anInt3305 & 0xFF000000 | Static445.anIntArray614[this.aShortArray92[local511.anInt8682] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method6327();
				} else {
					@Pc(699) Class114 local699;
					if (arg0 == 8) {
						for (local12 = 0; local12 < this.anInt7565; local12++) {
							local699 = this.aClass114Array1[local12];
							local699.anInt3297 += arg2;
							local699.anInt3300 += arg1;
						}
					} else if (arg0 == 10) {
						for (local12 = 0; local12 < this.anInt7565; local12++) {
							local699 = this.aClass114Array1[local12];
							local699.anInt3306 = local699.anInt3306 * arg1 >> 7;
							local699.anInt3303 = arg2 * local699.anInt3303 >> 7;
						}
					} else if (arg0 == 9) {
						for (local12 = 0; local12 < this.anInt7565; local12++) {
							local699 = this.aClass114Array1[local12];
							local699.anInt3299 = arg1 + local699.anInt3299 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "U", descriptor = "()I")
	@Override
	public int U() {
		if (!this.aBoolean563) {
			this.method6329();
		}
		return this.anInt7515;
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "()[Lclient!mm;")
	@Override
	public Class192[] method7708() {
		return this.aClass192Array6;
	}

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.aShort124 = (short) arg0;
		this.method6327();
	}

	@OriginalMember(owner = "client!qi", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		this.aShort123 = (short) arg0;
		this.method6326();
		this.method6335();
	}

	@OriginalMember(owner = "client!qi", name = "ea", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg4 << 4;
			local25 = arg3 << 4;
			Static131.anInt2526 = 0;
			Static175.anInt3251 = 0;
			Static163.anInt2944 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray65.length) {
					local51 = this.anIntArrayArray65[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static175.anInt3251 += this.anIntArray579[local59];
						Static163.anInt2944 += this.anIntArray584[local59];
						local33++;
						Static131.anInt2526 += this.anIntArray580[local59];
					}
				}
			}
			if (local33 > 0) {
				Static131.anInt2526 = Static131.anInt2526 / local33 + local21;
				Static163.anInt2944 = Static163.anInt2944 / local33 + local25;
				Static175.anInt3251 = Static175.anInt3251 / local33 + local17;
			} else {
				Static131.anInt2526 = local21;
				Static175.anInt3251 = local17;
				Static163.anInt2944 = local25;
			}
			return;
		}
		@Pc(159) int[] local159;
		@Pc(161) int local161;
		if (arg0 == 1) {
			local17 = arg2 << 4;
			local21 = arg4 << 4;
			local25 = arg3 << 4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray65.length) {
					local159 = this.anIntArrayArray65[local35];
					for (local161 = 0; local161 < local159.length; local161++) {
						local53 = local159[local161];
						this.anIntArray579[local53] += local17;
						this.anIntArray584[local53] += local25;
						this.anIntArray580[local53] += local21;
					}
				}
			}
			return;
		}
		@Pc(272) int local272;
		@Pc(290) int local290;
		@Pc(737) int local737;
		@Pc(746) int local746;
		if (arg0 == 2) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray65.length) {
					local159 = this.anIntArrayArray65[local35];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local53 = local159[local161];
							this.anIntArray579[local53] -= Static175.anInt3251;
							this.anIntArray584[local53] -= Static163.anInt2944;
							this.anIntArray580[local53] -= Static131.anInt2526;
							if (arg4 != 0) {
								local59 = Class125.anIntArray381[arg4];
								local272 = Class125.anIntArray382[arg4];
								local290 = this.anIntArray579[local53] * local272 + this.anIntArray584[local53] * local59 + 32767 >> 15;
								this.anIntArray584[local53] = this.anIntArray584[local53] * local272 + 32767 - local59 * this.anIntArray579[local53] >> 15;
								this.anIntArray579[local53] = local290;
							}
							if (arg2 != 0) {
								local59 = Class125.anIntArray381[arg2];
								local272 = Class125.anIntArray382[arg2];
								local290 = this.anIntArray584[local53] * local272 + 32767 - this.anIntArray580[local53] * local59 >> 15;
								this.anIntArray580[local53] = local272 * this.anIntArray580[local53] + local59 * this.anIntArray584[local53] + 32767 >> 15;
								this.anIntArray584[local53] = local290;
							}
							if (arg3 != 0) {
								local59 = Class125.anIntArray381[arg3];
								local272 = Class125.anIntArray382[arg3];
								local290 = local272 * this.anIntArray579[local53] + this.anIntArray580[local53] * local59 + 32767 >> 15;
								this.anIntArray580[local53] = this.anIntArray580[local53] * local272 + 32767 - this.anIntArray579[local53] * local59 >> 15;
								this.anIntArray579[local53] = local290;
							}
							this.anIntArray579[local53] += Static175.anInt3251;
							this.anIntArray584[local53] += Static163.anInt2944;
							this.anIntArray580[local53] += Static131.anInt2526;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local53 = local159[local161];
							this.anIntArray579[local53] -= Static175.anInt3251;
							this.anIntArray584[local53] -= Static163.anInt2944;
							this.anIntArray580[local53] -= Static131.anInt2526;
							if (arg2 != 0) {
								local59 = Class125.anIntArray381[arg2];
								local272 = Class125.anIntArray382[arg2];
								local290 = local272 * this.anIntArray584[local53] + 32767 - this.anIntArray580[local53] * local59 >> 15;
								this.anIntArray580[local53] = this.anIntArray580[local53] * local272 + this.anIntArray584[local53] * local59 + 32767 >> 15;
								this.anIntArray584[local53] = local290;
							}
							if (arg4 != 0) {
								local59 = Class125.anIntArray381[arg4];
								local272 = Class125.anIntArray382[arg4];
								local290 = local272 * this.anIntArray579[local53] + local59 * this.anIntArray584[local53] + 32767 >> 15;
								this.anIntArray584[local53] = this.anIntArray584[local53] * local272 + 32767 - local59 * this.anIntArray579[local53] >> 15;
								this.anIntArray579[local53] = local290;
							}
							if (arg3 != 0) {
								local59 = Class125.anIntArray381[arg3];
								local272 = Class125.anIntArray382[arg3];
								local290 = local59 * this.anIntArray580[local53] + this.anIntArray579[local53] * local272 + 32767 >> 15;
								this.anIntArray580[local53] = this.anIntArray580[local53] * local272 + 32767 - local59 * this.anIntArray579[local53] >> 15;
								this.anIntArray579[local53] = local290;
							}
							this.anIntArray579[local53] += Static175.anInt3251;
							this.anIntArray584[local53] += Static163.anInt2944;
							this.anIntArray580[local53] += Static131.anInt2526;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray65.length) {
						local51 = this.anIntArrayArray65[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local272 = this.anIntArray578[local59];
							local290 = this.anIntArray578[local59 + 1];
							for (local737 = local272; local737 < local290; local737++) {
								local746 = this.aShortArray95[local737] - 1;
								if (local746 == -1) {
									break;
								}
								@Pc(756) int local756;
								@Pc(760) int local760;
								@Pc(778) int local778;
								if (arg4 != 0) {
									local756 = Class125.anIntArray381[arg4];
									local760 = Class125.anIntArray382[arg4];
									local778 = this.aShortArray100[local746] * local760 + local756 * this.aShortArray101[local746] + 32767 >> 15;
									this.aShortArray101[local746] = (short) (local760 * this.aShortArray101[local746] + 32767 - this.aShortArray100[local746] * local756 >> 15);
									this.aShortArray100[local746] = (short) local778;
								}
								if (arg2 != 0) {
									local756 = Class125.anIntArray381[arg2];
									local760 = Class125.anIntArray382[arg2];
									local778 = local760 * this.aShortArray101[local746] + 32767 - local756 * this.aShortArray94[local746] >> 15;
									this.aShortArray94[local746] = (short) (this.aShortArray101[local746] * local756 + local760 * this.aShortArray94[local746] + 32767 >> 15);
									this.aShortArray101[local746] = (short) local778;
								}
								if (arg3 != 0) {
									local756 = Class125.anIntArray381[arg3];
									local760 = Class125.anIntArray382[arg3];
									local778 = this.aShortArray94[local746] * local756 + local760 * this.aShortArray100[local746] + 32767 >> 15;
									this.aShortArray94[local746] = (short) (local760 * this.aShortArray94[local746] + 32767 - local756 * this.aShortArray100[local746] >> 15);
									this.aShortArray100[local746] = (short) local778;
								}
							}
						}
					}
				}
				this.method6335();
			}
		} else if (arg0 == 3) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray65.length) {
					local159 = this.anIntArrayArray65[local35];
					for (local161 = 0; local161 < local159.length; local161++) {
						local53 = local159[local161];
						this.anIntArray579[local53] -= Static175.anInt3251;
						this.anIntArray584[local53] -= Static163.anInt2944;
						this.anIntArray580[local53] -= Static131.anInt2526;
						this.anIntArray579[local53] = this.anIntArray579[local53] * arg2 >> 7;
						this.anIntArray584[local53] = this.anIntArray584[local53] * arg3 >> 7;
						this.anIntArray580[local53] = arg4 * this.anIntArray580[local53] >> 7;
						this.anIntArray579[local53] += Static175.anInt3251;
						this.anIntArray584[local53] += Static163.anInt2944;
						this.anIntArray580[local53] += Static131.anInt2526;
					}
				}
			}
		} else {
			@Pc(1191) Class114 local1191;
			@Pc(1090) boolean local1090;
			@Pc(1186) Class289 local1186;
			if (arg0 == 5) {
				if (this.anIntArrayArray66 != null) {
					local1090 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray66.length > local41) {
							local51 = this.anIntArrayArray66[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local272 = (this.aByteArray99[local59] & 0xFF) + arg2 * 8;
								if (local272 < 0) {
									local272 = 0;
								} else if (local272 > 255) {
									local272 = 255;
								}
								this.aByteArray99[local59] = (byte) local272;
							}
							local1090 |= local51.length > 0;
						}
					}
					if (local1090) {
						if (this.aClass289Array1 != null) {
							for (local41 = 0; local41 < this.anInt7565; local41++) {
								local1186 = this.aClass289Array1[local41];
								local1191 = this.aClass114Array1[local41];
								local1191.anInt3305 = 255 - (this.aByteArray99[local1186.anInt8682] & 0xFF) << 24 | local1191.anInt3305 & 0xFFFFFF;
							}
						}
						this.method6327();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray66 != null) {
					local1090 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray66.length) {
							local51 = this.anIntArrayArray66[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local272 = this.aShortArray92[local59] & 0xFFFF;
								local290 = local272 >> 10 & 0x3F;
								local737 = local272 >> 7 & 0x7;
								local737 += arg3 / 4;
								@Pc(1290) int local1290 = local290 + arg2 & 0x3F;
								local746 = local272 & 0x7F;
								if (local737 < 0) {
									local737 = 0;
								} else if (local737 > 7) {
									local737 = 7;
								}
								local746 += arg4;
								if (local746 < 0) {
									local746 = 0;
								} else if (local746 > 127) {
									local746 = 127;
								}
								this.aShortArray92[local59] = (short) (local737 << 7 | local1290 << 10 | local746);
							}
							local1090 |= local51.length > 0;
						}
					}
					if (local1090) {
						if (this.aClass289Array1 != null) {
							for (local41 = 0; local41 < this.anInt7565; local41++) {
								local1186 = this.aClass289Array1[local41];
								local1191 = this.aClass114Array1[local41];
								local1191.anInt3305 = local1191.anInt3305 & 0xFF000000 | Static445.anIntArray614[this.aShortArray92[local1186.anInt8682] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method6327();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray64 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray64.length) {
							local159 = this.anIntArrayArray64[local35];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1191 = this.aClass114Array1[local159[local161]];
								local1191.anInt3300 += arg2;
								local1191.anInt3297 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray64 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray64.length) {
							local159 = this.anIntArrayArray64[local35];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1191 = this.aClass114Array1[local159[local161]];
								local1191.anInt3303 = arg3 * local1191.anInt3303 >> 7;
								local1191.anInt3306 = local1191.anInt3306 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray64 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (this.anIntArrayArray64.length > local35) {
						local159 = this.anIntArrayArray64[local35];
						for (local161 = 0; local161 < local159.length; local161++) {
							local1191 = this.aClass114Array1[local159[local161]];
							local1191.anInt3299 = arg2 + local1191.anInt3299 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V")
	private void method6329() {
		@Pc(7) int local7 = 32767;
		@Pc(17) int local17 = 32767;
		@Pc(19) int local19 = 32767;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = -32768;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt7497; local31++) {
			@Pc(38) int local38 = this.anIntArray579[local31];
			@Pc(43) int local43 = this.anIntArray584[local31];
			if (local21 < local38) {
				local21 = local38;
			}
			if (local23 < local43) {
				local23 = local43;
			}
			if (local38 < local7) {
				local7 = local38;
			}
			@Pc(71) int local71 = this.anIntArray580[local31];
			if (local17 > local43) {
				local17 = local43;
			}
			if (local25 < local71) {
				local25 = local71;
			}
			if (local19 > local71) {
				local19 = local71;
			}
			@Pc(102) int local102 = local71 * local71 + local38 * local38;
			if (local102 > local27) {
				local27 = local102;
			}
			local102 = local71 * local71 + local38 * local38 + local43 * local43;
			if (local102 > local29) {
				local29 = local102;
			}
		}
		this.anInt7557 = local19;
		this.anInt7531 = local23;
		this.anInt7547 = local17;
		this.anInt7515 = local25;
		this.anInt7501 = local21;
		this.anInt7519 = local7;
		this.anInt7511 = (int) (Math.sqrt((double) local27) + 0.99D);
		Math.sqrt((double) local29);
		this.aBoolean563 = true;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIBIIIII)Z")
	private boolean method6330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 > arg2 && arg6 > arg2 && arg2 < arg0) {
			return false;
		} else if (arg2 > arg3 && arg6 < arg2 && arg2 > arg0) {
			return false;
		} else if (arg1 < arg4 && arg5 > arg1 && arg1 < arg7) {
			return false;
		} else {
			return arg4 >= arg1 || arg5 >= arg1 || arg7 >= arg1;
		}
	}

	@OriginalMember(owner = "client!qi", name = "va", descriptor = "()I")
	@Override
	public int va() {
		if (!this.aBoolean563) {
			this.method6329();
		}
		return this.anInt7501;
	}

	@OriginalMember(owner = "client!qi", name = "M", descriptor = "()I")
	@Override
	public int M() {
		return this.aShort124;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method7705(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class63_Sub3 local8 = (Class63_Sub3) arg0;
		if (this.anInt7546 == 0 || local8.anInt7546 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt7497;
		@Pc(27) int[] local27 = local8.anIntArray579;
		@Pc(30) int[] local30 = local8.anIntArray584;
		@Pc(33) int[] local33 = local8.anIntArray580;
		@Pc(36) short[] local36 = local8.aShortArray100;
		@Pc(39) short[] local39 = local8.aShortArray101;
		@Pc(42) short[] local42 = local8.aShortArray94;
		@Pc(45) byte[] local45 = local8.aByteArray100;
		@Pc(56) short[] local56;
		@Pc(54) short[] local54;
		@Pc(52) short[] local52;
		@Pc(50) byte[] local50;
		if (this.aClass21_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local56 = this.aClass21_1.aShortArray21;
			local50 = this.aClass21_1.aByteArray20;
			local54 = this.aClass21_1.aShortArray20;
			local52 = this.aClass21_1.aShortArray19;
		}
		@Pc(85) short[] local85;
		@Pc(93) short[] local93;
		@Pc(89) short[] local89;
		@Pc(81) byte[] local81;
		if (local8.aClass21_1 == null) {
			local81 = null;
			local93 = null;
			local85 = null;
			local89 = null;
		} else {
			local81 = local8.aClass21_1.aByteArray20;
			local85 = local8.aClass21_1.aShortArray21;
			local89 = local8.aClass21_1.aShortArray19;
			local93 = local8.aClass21_1.aShortArray20;
		}
		@Pc(106) int[] local106 = local8.anIntArray578;
		@Pc(109) short[] local109 = local8.aShortArray95;
		if (!local8.aBoolean563) {
			local8.method6329();
		}
		@Pc(118) int local118 = local8.anInt7547;
		@Pc(121) int local121 = local8.anInt7531;
		@Pc(124) int local124 = local8.anInt7519;
		@Pc(127) int local127 = local8.anInt7501;
		@Pc(130) int local130 = local8.anInt7557;
		@Pc(133) int local133 = local8.anInt7515;
		for (@Pc(135) int local135 = 0; local135 < this.anInt7497; local135++) {
			@Pc(145) int local145 = this.anIntArray584[local135] - arg2;
			if (local118 <= local145 && local121 >= local145) {
				@Pc(165) int local165 = this.anIntArray579[local135] - arg1;
				if (local165 >= local124 && local165 <= local127) {
					@Pc(188) int local188 = this.anIntArray580[local135] - arg3;
					if (local188 >= local130 && local133 >= local188) {
						@Pc(202) int local202 = -1;
						@Pc(207) int local207 = this.anIntArray578[local135];
						@Pc(214) int local214 = this.anIntArray578[local135 + 1];
						for (@Pc(216) int local216 = local207; local216 < local214; local216++) {
							local202 = this.aShortArray95[local216] - 1;
							if (local202 == -1 || this.aByteArray100[local202] != 0) {
								break;
							}
						}
						if (local202 != -1) {
							for (@Pc(248) int local248 = 0; local248 < local24; local248++) {
								if (local165 == local27[local248] && local33[local248] == local188 && local145 == local30[local248]) {
									local214 = local106[local248 + 1];
									@Pc(281) int local281 = -1;
									local207 = local106[local248];
									for (@Pc(287) int local287 = local207; local287 < local214; local287++) {
										local281 = local109[local287] - 1;
										if (local281 == -1 || local45[local281] != 0) {
											break;
										}
									}
									if (local281 != -1) {
										if (local56 == null) {
											this.aClass21_1 = new Class21();
											local56 = this.aClass21_1.aShortArray21 = Static192.method3148(this.aShortArray100);
											local54 = this.aClass21_1.aShortArray20 = Static192.method3148(this.aShortArray101);
											local52 = this.aClass21_1.aShortArray19 = Static192.method3148(this.aShortArray94);
											local50 = this.aClass21_1.aByteArray20 = Static229.method3608(this.aByteArray100);
										}
										if (local85 == null) {
											@Pc(366) Class21 local366 = local8.aClass21_1 = new Class21();
											local85 = local366.aShortArray21 = Static192.method3148(local36);
											local93 = local366.aShortArray20 = Static192.method3148(local39);
											local89 = local366.aShortArray19 = Static192.method3148(local42);
											local81 = local366.aByteArray20 = Static229.method3608(local45);
										}
										@Pc(399) short local399 = this.aShortArray100[local202];
										@Pc(404) short local404 = this.aShortArray101[local202];
										@Pc(409) short local409 = this.aShortArray94[local202];
										local214 = local106[local248 + 1];
										local207 = local106[local248];
										@Pc(424) byte local424 = this.aByteArray100[local202];
										@Pc(434) int local434;
										for (@Pc(426) int local426 = local207; local426 < local214; local426++) {
											local434 = local109[local426] - 1;
											if (local434 == -1) {
												break;
											}
											if (local81[local434] != 0) {
												local85[local434] += local399;
												local93[local434] += local404;
												local89[local434] += local409;
												local81[local434] += local424;
											}
										}
										local409 = local42[local281];
										local207 = this.anIntArray578[local135];
										local424 = local45[local281];
										local214 = this.anIntArray578[local135 + 1];
										local404 = local39[local281];
										local399 = local36[local281];
										for (local434 = local207; local434 < local214; local434++) {
											@Pc(520) int local520 = this.aShortArray95[local434] - 1;
											if (local520 == -1) {
												break;
											}
											if (local50[local520] != 0) {
												local56[local520] += local399;
												local54[local520] += local404;
												local52[local520] += local409;
												local50[local520] += local424;
											}
										}
										local8.method6335();
										this.method6335();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
	private void method6331() {
		if (!this.aBoolean562) {
			return;
		}
		this.aBoolean562 = false;
		if (this.aClass192Array6 == null && this.aClass169Array6 == null && this.aClass289Array1 == null) {
			if (this.anIntArray579 != null && !Static391.method6261(this.anInt7499, this.anInt7567)) {
				if (this.aClass106_2 == null || this.aClass106_2.method2816()) {
					if (!this.aBoolean563) {
						this.method6329();
					}
					this.anIntArray579 = null;
				} else {
					this.aBoolean562 = true;
				}
			}
			if (this.anIntArray584 != null && !Static339.method5352(this.anInt7567, this.anInt7499)) {
				if (this.aClass106_2 == null || this.aClass106_2.method2816()) {
					if (!this.aBoolean563) {
						this.method6329();
					}
					this.anIntArray584 = null;
				} else {
					this.aBoolean562 = true;
				}
			}
			if (this.anIntArray580 != null && !Static113.method2226(this.anInt7567, this.anInt7499)) {
				if (this.aClass106_2 == null || this.aClass106_2.method2816()) {
					if (!this.aBoolean563) {
						this.method6329();
					}
					this.anIntArray580 = null;
				} else {
					this.aBoolean562 = true;
				}
			}
		}
		if (this.aShortArray95 != null && this.anIntArray579 == null && this.anIntArray584 == null && this.anIntArray580 == null) {
			this.anIntArray578 = null;
			this.aShortArray95 = null;
		}
		if (this.aByteArray100 != null && !Static300.method4726(this.anInt7567, this.anInt7499)) {
			label195: {
				label194: {
					@Pc(165) boolean local165;
					if ((this.anInt7499 & 0x37) == 0) {
						if (this.aClass106_1 == null || this.aClass106_1.method2816()) {
							break label194;
						}
						local165 = false;
					} else {
						if (this.aClass106_3 == null || this.aClass106_3.method2816()) {
							break label194;
						}
						local165 = false;
					}
					if (!local165) {
						this.aBoolean562 = true;
						break label195;
					}
				}
				this.aShortArray100 = this.aShortArray101 = this.aShortArray94 = null;
				this.aByteArray100 = null;
			}
		}
		if (this.aShortArray92 != null && !Static378.method5949(this.anInt7499, this.anInt7567)) {
			if (this.aClass106_1 == null || this.aClass106_1.method2816()) {
				this.aShortArray92 = null;
			} else {
				this.aBoolean562 = true;
			}
		}
		if (this.aByteArray99 != null && !Static534.method7691(this.anInt7567, this.anInt7499)) {
			if (this.aClass106_1 == null || this.aClass106_1.method2816()) {
				this.aByteArray99 = null;
			} else {
				this.aBoolean562 = true;
			}
		}
		if (this.aFloatArray66 != null && !Static8.method373(this.anInt7567, this.anInt7499)) {
			if (this.aClass106_4 == null || this.aClass106_4.method2816()) {
				this.aFloatArray66 = this.aFloatArray67 = null;
			} else {
				this.aBoolean562 = true;
			}
		}
		if (this.aShortArray97 != null && !Static298.method4701(this.anInt7499, this.anInt7567)) {
			if (this.aClass106_1 == null || this.aClass106_1.method2816()) {
				this.aShortArray97 = null;
			} else {
				this.aBoolean562 = true;
			}
		}
		if (this.aShortArray102 != null && !Static285.method4517(this.anInt7499, this.anInt7567)) {
			if ((this.aClass174_1 == null || this.aClass174_1.method4341()) && (this.aClass106_1 == null || this.aClass106_1.method2816())) {
				this.aShortArray102 = this.aShortArray96 = this.aShortArray93 = null;
			} else {
				this.aBoolean562 = true;
			}
		}
		if (this.aShortArray99 != null) {
			if (this.aClass106_2 == null || this.aClass106_2.method2816()) {
				this.aShortArray99 = null;
			} else {
				this.aBoolean562 = true;
			}
		}
		if (this.aShortArray103 != null) {
			if (this.aClass106_1 == null || this.aClass106_1.method2816()) {
				this.aShortArray103 = null;
			} else {
				this.aBoolean562 = true;
			}
		}
		if (this.anIntArrayArray66 != null && !Static77.method1566(this.anInt7499, this.anInt7567)) {
			this.anIntArrayArray66 = null;
			this.aShortArray98 = null;
		}
		if (this.anIntArrayArray65 != null && !Static344.method5415(this.anInt7499, this.anInt7567)) {
			this.aShortArray104 = null;
			this.anIntArrayArray65 = null;
		}
		if (this.anIntArrayArray64 != null && !Static173.method2894(this.anInt7499, this.anInt7567)) {
			this.anIntArrayArray64 = null;
		}
		if (this.anIntArray582 != null && (this.anInt7567 & 0x800) == 0 && (this.anInt7567 & 0x40000) == 0) {
			this.anIntArray583 = null;
			this.anIntArray582 = null;
			this.anIntArray581 = null;
		}
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)Z")
	private boolean method6332() {
		@Pc(19) boolean local19 = !this.aClass106_1.aBoolean249;
		@Pc(35) boolean local35 = (this.anInt7499 & 0x37) != 0 && !this.aClass106_3.aBoolean249;
		@Pc(43) boolean local43 = !this.aClass106_2.aBoolean249;
		@Pc(51) boolean local51 = !this.aClass106_4.aBoolean249;
		if (!local43 && !local19 && !local35 && !local51) {
			return true;
		}
		@Pc(63) boolean local63 = true;
		@Pc(82) Interface19 local82;
		@Pc(96) Buffer local96;
		if (local43) {
			if (this.aClass106_2.anInterface19_5 == null) {
				this.aClass106_2.anInterface19_5 = this.aClass39_Sub2_18.method6100(this.aBoolean561);
			}
			local82 = this.aClass106_2.anInterface19_5;
			local82.method6493(this.anInt7560 * 12, 12);
			local96 = local82.method6952();
			if (local96 == null) {
				local63 = false;
			} else {
				this.aClass39_Sub2_18.aNativeInterface3.copyPositions(this.anIntArray579, this.anIntArray584, this.anIntArray580, this.aShortArray99, 0, 12, this.anInt7560, local96.getAddress());
				if (local82.method6954()) {
					this.aClass106_2.anInterface19_6 = local82;
					this.aClass106_2.aBoolean249 = true;
				} else {
					local63 = false;
				}
			}
		}
		@Pc(182) short[] local182;
		@Pc(191) short[] local191;
		@Pc(185) short[] local185;
		@Pc(188) byte[] local188;
		if (local19) {
			if (this.aClass106_1.anInterface19_5 == null) {
				this.aClass106_1.anInterface19_5 = this.aClass39_Sub2_18.method6100(this.aBoolean561);
			}
			local82 = this.aClass106_1.anInterface19_5;
			local82.method6493(this.anInt7560 * 4, 4);
			local96 = local82.method6952();
			if (local96 == null) {
				local63 = false;
			} else {
				if ((this.anInt7499 & 0x37) == 0) {
					if (this.aClass21_1 == null) {
						local182 = this.aShortArray100;
						local185 = this.aShortArray94;
						local188 = this.aByteArray100;
						local191 = this.aShortArray101;
					} else {
						local182 = this.aClass21_1.aShortArray21;
						local191 = this.aClass21_1.aShortArray20;
						local188 = this.aClass21_1.aByteArray20;
						local185 = this.aClass21_1.aShortArray19;
					}
					this.aClass39_Sub2_18.aNativeInterface3.copyLighting(this.aShortArray92, this.aByteArray99, this.aShortArray97, local182, local191, local185, local188, this.aShort124, this.aShort123, this.aShortArray103, 0, 4, this.anInt7560, local96.getAddress());
				} else {
					this.aClass39_Sub2_18.aNativeInterface3.copyColours(this.aShortArray92, this.aByteArray99, this.aShortArray97, this.aShort124, this.aShortArray103, 0, 4, this.anInt7560, local96.getAddress());
				}
				if (local82.method6954()) {
					this.aClass106_1.aBoolean249 = true;
					this.aClass106_1.anInterface19_6 = local82;
				} else {
					local63 = false;
				}
			}
		}
		if (local35) {
			if (this.aClass106_3.anInterface19_5 == null) {
				this.aClass106_3.anInterface19_5 = this.aClass39_Sub2_18.method6100(this.aBoolean561);
			}
			local82 = this.aClass106_3.anInterface19_5;
			local82.method6493(this.anInt7560 * 12, 12);
			local96 = local82.method6952();
			if (local96 == null) {
				local63 = false;
			} else {
				if (this.aClass21_1 == null) {
					local191 = this.aShortArray101;
					local185 = this.aShortArray94;
					local188 = this.aByteArray100;
					local182 = this.aShortArray100;
				} else {
					local182 = this.aClass21_1.aShortArray21;
					local188 = this.aClass21_1.aByteArray20;
					local191 = this.aClass21_1.aShortArray20;
					local185 = this.aClass21_1.aShortArray19;
				}
				this.aClass39_Sub2_18.aNativeInterface3.copyNormals(local182, local191, local185, local188, 3.0F / (float) this.aShort123, 3.0F / (float) (this.aShort123 + this.aShort123 / 2), 0, 12, this.anInt7560, local96.getAddress());
				if (local82.method6954()) {
					this.aClass106_3.aBoolean249 = true;
					this.aClass106_3.anInterface19_6 = local82;
				} else {
					local63 = false;
				}
			}
		}
		if (local51) {
			if (this.aClass106_4.anInterface19_5 == null) {
				this.aClass106_4.anInterface19_5 = this.aClass39_Sub2_18.method6100(this.aBoolean561);
			}
			local82 = this.aClass106_4.anInterface19_5;
			local82.method6493(this.anInt7560 * 8, 8);
			local96 = local82.method6952();
			if (local96 == null) {
				local63 = false;
			} else {
				this.aClass39_Sub2_18.aNativeInterface3.copyTexCoords(this.aFloatArray66, this.aFloatArray67, 0, 8, this.anInt7560, local96.getAddress());
				if (local82.method6954()) {
					this.aClass106_4.aBoolean249 = true;
					this.aClass106_4.anInterface19_6 = local82;
				} else {
					local63 = false;
				}
			}
		}
		return local63;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt7546; local7++) {
			local16 = this.aShortArray92[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 -= -(arg3 * (arg0 - local22) >> 7);
			}
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local32 += arg3 * (arg2 - local32) >> 7;
			}
			this.aShortArray92[local7] = (short) (local22 << 10 | local28 << 7 | local32);
		}
		if (this.aClass289Array1 != null) {
			for (local16 = 0; local16 < this.anInt7565; local16++) {
				@Pc(110) Class289 local110 = this.aClass289Array1[local16];
				@Pc(115) Class114 local115 = this.aClass114Array1[local16];
				local115.anInt3305 = local115.anInt3305 & 0xFF000000 | Static445.anIntArray614[this.aShortArray92[local110.anInt8682] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6327();
	}

	@OriginalMember(owner = "client!qi", name = "OA", descriptor = "(I)V")
	@Override
	public void OA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class125.anIntArray381[arg0];
		@Pc(13) int local13 = Class125.anIntArray382[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7497; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray580[local15] + this.anIntArray579[local15] * local13 >> 15;
			this.anIntArray580[local15] = this.anIntArray580[local15] * local13 - this.anIntArray579[local15] * local9 >> 15;
			this.anIntArray579[local15] = local34;
		}
		this.method6326();
		this.aBoolean563 = false;
	}

	@OriginalMember(owner = "client!qi", name = "sa", descriptor = "()Z")
	@Override
	protected boolean sa() {
		if (this.anIntArrayArray65 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt7563; local12++) {
			this.anIntArray579[local12] <<= 0x4;
			this.anIntArray584[local12] <<= 0x4;
			this.anIntArray580[local12] <<= 0x4;
		}
		Static175.anInt3251 = 0;
		Static131.anInt2526 = 0;
		Static163.anInt2944 = 0;
		return true;
	}

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "(I)V")
	public void method6334() {
		if (this.aClass106_2 != null) {
			this.aClass106_2.method2817();
		}
		if (this.aClass106_4 != null) {
			this.aClass106_4.method2817();
		}
		if (this.aClass106_1 != null) {
			this.aClass106_1.method2817();
		}
		if (this.aClass106_3 != null) {
			this.aClass106_3.method2817();
		}
		if (this.aClass174_1 != null) {
			this.aClass174_1.method4340();
		}
	}

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "(I)V")
	private void method6335() {
		if ((this.anInt7499 & 0x37) == 0) {
			if (this.aClass106_1 != null) {
				this.aClass106_1.aBoolean249 = false;
			}
		} else if (this.aClass106_3 != null) {
			this.aClass106_3.aBoolean249 = false;
		}
	}

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "(I)V")
	@Override
	public void m(@OriginalArg(0) int arg0) {
		if (this.aClass106_2 != null) {
			this.aClass106_2.aBoolean248 = Static105.method1941(this.anInt7499, arg0);
		}
		if (this.aClass106_4 != null) {
			this.aClass106_4.aBoolean248 = Static61.method1138(this.anInt7499, arg0);
		}
		if (this.aClass106_1 != null) {
			this.aClass106_1.aBoolean248 = Static154.method2641(arg0, this.anInt7499);
		}
		if (this.aClass106_3 != null) {
			this.aClass106_3.aBoolean248 = Static215.method6802(this.anInt7499, arg0);
		}
		this.anInt7567 = arg0;
		if (this.aClass21_1 != null && (this.anInt7567 & 0x10000) == 0) {
			this.aShortArray94 = this.aClass21_1.aShortArray19;
			this.aShortArray100 = this.aClass21_1.aShortArray21;
			this.aByteArray100 = this.aClass21_1.aByteArray20;
			this.aShortArray101 = this.aClass21_1.aShortArray20;
			this.aClass21_1 = null;
		}
		this.aBoolean562 = true;
		this.method6331();
	}

	@OriginalMember(owner = "client!qi", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		return this.anInt7567;
	}

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "(I)Z")
	private boolean method6336() {
		if (this.aClass174_1.aBoolean373) {
			return true;
		}
		if (this.aClass174_1.anInterface7_6 == null) {
			this.aClass174_1.anInterface7_6 = this.aClass39_Sub2_18.method6204(this.aBoolean561);
		}
		@Pc(28) Interface7 local28 = this.aClass174_1.anInterface7_6;
		local28.method6949(this.anInt7498 * 6);
		@Pc(45) Buffer local45 = local28.method6952();
		if (local45 != null) {
			@Pc(53) Stream local53 = this.aClass39_Sub2_18.method6195(local45);
			@Pc(57) int local57;
			if (Stream.a()) {
				for (local57 = 0; local57 < this.anInt7498; local57++) {
					local53.f(this.aShortArray102[local57]);
					local53.f(this.aShortArray96[local57]);
					local53.f(this.aShortArray93[local57]);
				}
			} else {
				for (local57 = 0; local57 < this.anInt7498; local57++) {
					local53.e(this.aShortArray102[local57]);
					local53.e(this.aShortArray96[local57]);
					local53.e(this.aShortArray93[local57]);
				}
			}
			local53.c();
			if (local28.method6954()) {
				this.aClass174_1.anInterface7_5 = local28;
				this.aClass174_1.aBoolean373 = true;
				this.aBoolean562 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)V")
	private void method6337() {
		if (this.aClass174_1 != null) {
			this.aClass174_1.aBoolean373 = false;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "()V")
	@Override
	public void method7696() {
		if (this.anInt7560 > 0 && this.anInt7498 > 0) {
			this.method6332();
			this.method6336();
			this.method6331();
		}
	}

	@OriginalMember(owner = "client!qi", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	@Override
	public void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean563) {
			this.method6329();
		}
		@Pc(16) int local16 = this.anInt7519 + arg4;
		@Pc(21) int local21 = arg4 + this.anInt7501;
		@Pc(27) int local27 = arg6 + this.anInt7557;
		@Pc(32) int local32 = this.anInt7515 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt7994 + local21 >> arg2.anInt7996 >= arg2.anInt7998 || local27 < 0 || arg2.anInt7995 <= arg2.anInt7994 + local32 >> arg2.anInt7996)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt7998 <= arg3.anInt7994 + local21 >> arg3.anInt7996 || local27 < 0 || local32 + arg3.anInt7994 >> arg3.anInt7996 >= arg3.anInt7995) {
				return;
			}
		} else {
			local16 >>= arg2.anInt7996;
			local21 = local21 + arg2.anInt7994 - 1 >> arg2.anInt7996;
			local27 >>= arg2.anInt7996;
			local32 = arg2.anInt7994 + local32 - 1 >> arg2.anInt7996;
			if (arg5 == arg2.ba(local16, local27) && arg2.ba(local21, local27) == arg5 && arg5 == arg2.ba(local16, local32) && arg2.ba(local21, local32) == arg5) {
				return;
			}
		}
		@Pc(192) int local192;
		if (arg0 == 1) {
			for (local192 = 0; local192 < this.anInt7497; local192++) {
				this.anIntArray584[local192] = this.anIntArray584[local192] + arg2.aa(arg4 + this.anIntArray579[local192], this.anIntArray580[local192] - -arg6) - arg5;
			}
		} else {
			@Pc(240) int local240;
			@Pc(251) int local251;
			if (arg0 == 2) {
				local192 = this.anInt7547;
				if (local192 == 0) {
					return;
				}
				for (local240 = 0; local240 < this.anInt7497; local240++) {
					local251 = (this.anIntArray584[local240] << 16) / local192;
					if (arg1 > local251) {
						this.anIntArray584[local240] -= -((arg1 - local251) * (arg2.aa(arg4 + this.anIntArray579[local240], this.anIntArray580[local240] - -arg6) + -arg5) / arg1);
					}
				}
			} else {
				@Pc(387) int local387;
				if (arg0 == 3) {
					local192 = (arg1 & 0xFF) * 4;
					local240 = (arg1 >> 8 & 0xFF) * 4;
					local251 = (arg1 >> 16 & 0xFF) << 6;
					local387 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local192 >> 1) < 0 || arg2.anInt7998 << arg2.anInt7996 <= (local192 >> 1) + (arg4 + arg2.anInt7994) || arg6 - (local240 >> 1) < 0 || arg2.anInt7994 + arg6 + (local240 >> 1) >= arg2.anInt7995 << arg2.anInt7996) {
						return;
					}
					this.method7695(local251, arg2, local387, arg6, arg5, arg4, local192, local240);
				} else if (arg0 == 4) {
					local192 = this.anInt7531 - this.anInt7547;
					for (local240 = 0; local240 < this.anInt7497; local240++) {
						this.anIntArray584[local240] += arg3.aa(this.anIntArray579[local240] + arg4, this.anIntArray580[local240] - -arg6) + local192 - arg5;
					}
				} else if (arg0 == 5) {
					local192 = this.anInt7531 - this.anInt7547;
					for (local240 = 0; local240 < this.anInt7497; local240++) {
						local251 = this.anIntArray579[local240] + arg4;
						local387 = this.anIntArray580[local240] + arg6;
						@Pc(392) int local392 = arg2.aa(local251, local387);
						@Pc(397) int local397 = arg3.aa(local251, local387);
						@Pc(402) int local402 = local392 - local397;
						this.anIntArray584[local240] = local392 + (local402 * ((this.anIntArray584[local240] << 8) / local192) >> 8) - arg5;
					}
				}
			}
		}
		this.method6326();
		this.aBoolean563 = false;
	}

	@OriginalMember(owner = "client!qi", name = "pa", descriptor = "(SS)V")
	@Override
	public void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7546; local7++) {
			if (arg0 == this.aShortArray92[local7]) {
				this.aShortArray92[local7] = arg1;
			}
		}
		if (this.aClass289Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt7565; local34++) {
				@Pc(41) Class289 local41 = this.aClass289Array1[local34];
				@Pc(46) Class114 local46 = this.aClass114Array1[local34];
				local46.anInt3305 = local46.anInt3305 & 0xFF000000 | Static445.anIntArray614[this.aShortArray92[local41.anInt8682] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6327();
	}

	@OriginalMember(owner = "client!qi", name = "ca", descriptor = "(III)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7497; local3++) {
			if (arg0 != 0) {
				this.anIntArray579[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray584[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray580[local3] += arg2;
			}
		}
		this.method6326();
		this.aBoolean563 = false;
	}

	@OriginalMember(owner = "client!qi", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	@Override
	public Class2_Sub13_Sub6 EA(@OriginalArg(0) Class2_Sub13_Sub6 arg0) {
		if (this.anInt7560 == 0) {
			return null;
		}
		if (!this.aBoolean563) {
			this.method6329();
		}
		@Pc(42) int local42;
		@Pc(59) int local59;
		if (this.aClass39_Sub2_18.anInt7306 <= 0) {
			local42 = this.anInt7519 - (this.aClass39_Sub2_18.anInt7306 * this.anInt7547 >> 8) >> this.aClass39_Sub2_18.anInt7289;
			local59 = this.anInt7501 - (this.anInt7531 * this.aClass39_Sub2_18.anInt7306 >> 8) >> this.aClass39_Sub2_18.anInt7289;
		} else {
			local42 = this.anInt7519 - (this.aClass39_Sub2_18.anInt7306 * this.anInt7531 >> 8) >> this.aClass39_Sub2_18.anInt7289;
			local59 = this.anInt7501 - (this.anInt7547 * this.aClass39_Sub2_18.anInt7306 >> 8) >> this.aClass39_Sub2_18.anInt7289;
		}
		@Pc(115) int local115;
		@Pc(132) int local132;
		if (this.aClass39_Sub2_18.anInt7295 > 0) {
			local115 = this.anInt7557 - (this.anInt7531 * this.aClass39_Sub2_18.anInt7295 >> 8) >> this.aClass39_Sub2_18.anInt7289;
			local132 = this.anInt7515 - (this.aClass39_Sub2_18.anInt7295 * this.anInt7547 >> 8) >> this.aClass39_Sub2_18.anInt7289;
		} else {
			local115 = this.anInt7557 - (this.anInt7547 * this.aClass39_Sub2_18.anInt7295 >> 8) >> this.aClass39_Sub2_18.anInt7289;
			local132 = this.anInt7515 - (this.aClass39_Sub2_18.anInt7295 * this.anInt7531 >> 8) >> this.aClass39_Sub2_18.anInt7289;
		}
		@Pc(175) int local175 = local59 + 1 - local42;
		@Pc(181) int local181 = local132 + 1 - local115;
		@Pc(184) Class2_Sub13_Sub6_Sub2 local184 = (Class2_Sub13_Sub6_Sub2) arg0;
		@Pc(194) Class2_Sub13_Sub6_Sub2 local194;
		if (local184 != null && local184.method7451(local175, local181)) {
			local194 = local184;
			local184.method7448();
		} else {
			local194 = new Class2_Sub13_Sub6_Sub2(this.aClass39_Sub2_18, local175, local181);
		}
		local194.method7447(local59, local132, local42, local115);
		this.method6323(local194);
		return local194;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!m;Lclient!gr;I)V")
	@Override
	public void method7700(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class6_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7560 == 0) {
			return;
		}
		@Pc(16) Class181_Sub2 local16 = this.aClass39_Sub2_18.aClass181_Sub2_16;
		if (!this.aBoolean563) {
			this.method6329();
		}
		@Pc(25) Class181_Sub2 local25 = (Class181_Sub2) arg0;
		this.method6328(local25);
		Static473.aFloat216 = local25.aFloat135 * local16.aFloat133 + local16.aFloat129 * local25.aFloat136 + local16.aFloat134 * local25.aFloat138 + local16.aFloat138;
		Static21.aFloat13 = local25.aFloat129 * local16.aFloat134 + local25.aFloat132 * local16.aFloat129 + local16.aFloat133 * local25.aFloat139;
		@Pc(76) float local76 = Static21.aFloat13 * (float) this.anInt7547 + Static473.aFloat216;
		@Pc(84) float local84 = Static473.aFloat216 + Static21.aFloat13 * (float) this.anInt7531;
		@Pc(95) float local95;
		@Pc(101) float local101;
		if (local76 > local84) {
			local95 = (float) -this.anInt7511 + local84;
			local101 = (float) this.anInt7511 + local76;
		} else {
			local95 = local76 - (float) this.anInt7511;
			local101 = (float) this.anInt7511 + local84;
		}
		if (local95 >= this.aClass39_Sub2_18.aFloat201 || local101 <= (float) this.aClass39_Sub2_18.anInt7288) {
			return;
		}
		Static171.aFloat60 = local16.aFloat135 + local25.aFloat138 * local16.aFloat131 + local16.aFloat137 * local25.aFloat135 + local25.aFloat136 * local16.aFloat139;
		Static115.aFloat44 = local25.aFloat139 * local16.aFloat137 + local16.aFloat139 * local25.aFloat132 + local16.aFloat131 * local25.aFloat129;
		@Pc(177) float local177 = Static171.aFloat60 + Static115.aFloat44 * (float) this.anInt7547;
		@Pc(185) float local185 = (float) this.anInt7531 * Static115.aFloat44 + Static171.aFloat60;
		@Pc(211) float local211;
		@Pc(200) float local200;
		if (local177 > local185) {
			local200 = ((float) this.anInt7511 + local177) * (float) this.aClass39_Sub2_18.anInt7287;
			local211 = ((float) -this.anInt7511 + local185) * (float) this.aClass39_Sub2_18.anInt7287;
		} else {
			local200 = (float) this.aClass39_Sub2_18.anInt7287 * (local185 + (float) this.anInt7511);
			local211 = (local177 - (float) this.anInt7511) * (float) this.aClass39_Sub2_18.anInt7287;
		}
		if (local211 / local101 >= this.aClass39_Sub2_18.aFloat193 || this.aClass39_Sub2_18.aFloat199 >= local200 / local101) {
			return;
		}
		Static404.aFloat207 = local16.aFloat140 * local25.aFloat129 + local16.aFloat130 * local25.aFloat139 + local16.aFloat132 * local25.aFloat132;
		Static237.aFloat76 = local16.aFloat136 + local16.aFloat130 * local25.aFloat135 + local16.aFloat132 * local25.aFloat136 + local16.aFloat140 * local25.aFloat138;
		@Pc(301) float local301 = (float) this.anInt7547 * Static404.aFloat207 + Static237.aFloat76;
		@Pc(309) float local309 = Static237.aFloat76 + (float) this.anInt7531 * Static404.aFloat207;
		@Pc(324) float local324;
		@Pc(335) float local335;
		if (local301 > local309) {
			local324 = (float) this.aClass39_Sub2_18.anInt7312 * (local309 - (float) this.anInt7511);
			local335 = (float) this.aClass39_Sub2_18.anInt7312 * (local301 + (float) this.anInt7511);
		} else {
			local335 = (local309 + (float) this.anInt7511) * (float) this.aClass39_Sub2_18.anInt7312;
			local324 = (float) this.aClass39_Sub2_18.anInt7312 * ((float) -this.anInt7511 + local301);
		}
		if (local324 / local101 >= this.aClass39_Sub2_18.aFloat195 || this.aClass39_Sub2_18.aFloat198 >= local335 / local101) {
			return;
		}
		if (arg1 != null || this.aClass289Array1 != null) {
			Static284.aFloat223 = local25.aFloat134 * local16.aFloat131 + local16.aFloat139 * local25.aFloat140 + local16.aFloat137 * local25.aFloat131;
			Static402.aFloat206 = local16.aFloat140 * local25.aFloat133 + local25.aFloat130 * local16.aFloat132 + local25.aFloat137 * local16.aFloat130;
			Static36.aFloat17 = local16.aFloat130 * local25.aFloat131 + local25.aFloat140 * local16.aFloat132 + local25.aFloat134 * local16.aFloat140;
			Static82.aFloat28 = local16.aFloat134 * local25.aFloat133 + local16.aFloat133 * local25.aFloat137 + local25.aFloat130 * local16.aFloat129;
			Static310.aFloat105 = local25.aFloat133 * local16.aFloat131 + local25.aFloat130 * local16.aFloat139 + local25.aFloat137 * local16.aFloat137;
			Static188.aFloat2 = local16.aFloat129 * local25.aFloat140 + local25.aFloat131 * local16.aFloat133 + local25.aFloat134 * local16.aFloat134;
		}
		if (arg1 != null) {
			@Pc(495) boolean local495 = false;
			@Pc(497) boolean local497 = true;
			@Pc(505) int local505 = this.anInt7501 + this.anInt7519 >> 1;
			@Pc(513) int local513 = this.anInt7515 + this.anInt7557 >> 1;
			@Pc(532) int local532 = (int) (Static284.aFloat223 * (float) local513 + (float) local505 * Static310.aFloat105 + Static171.aFloat60 + (float) this.anInt7547 * Static115.aFloat44);
			@Pc(551) int local551 = (int) (Static404.aFloat207 * (float) this.anInt7547 + Static402.aFloat206 * (float) local505 + Static237.aFloat76 + (float) local513 * Static36.aFloat17);
			@Pc(570) int local570 = (int) (Static473.aFloat216 + (float) local505 * Static82.aFloat28 + (float) this.anInt7547 * Static21.aFloat13 + (float) local513 * Static188.aFloat2);
			if (this.aClass39_Sub2_18.anInt7288 > local570) {
				local495 = true;
			} else {
				arg1.anInt3041 = local532 * this.aClass39_Sub2_18.anInt7287 / local570 + this.aClass39_Sub2_18.anInt7305;
				arg1.anInt3043 = this.aClass39_Sub2_18.anInt7312 * local551 / local570 + this.aClass39_Sub2_18.anInt7307;
			}
			@Pc(624) int local624 = (int) (Static284.aFloat223 * (float) local513 + Static310.aFloat105 * (float) local505 + Static171.aFloat60 + Static115.aFloat44 * (float) this.anInt7531);
			@Pc(643) int local643 = (int) (Static36.aFloat17 * (float) local513 + (float) this.anInt7531 * Static404.aFloat207 + Static237.aFloat76 + Static402.aFloat206 * (float) local505);
			@Pc(662) int local662 = (int) ((float) this.anInt7531 * Static21.aFloat13 + (float) local505 * Static82.aFloat28 + Static473.aFloat216 + Static188.aFloat2 * (float) local513);
			if (this.aClass39_Sub2_18.anInt7288 > local662) {
				local495 = true;
			} else {
				arg1.anInt3042 = this.aClass39_Sub2_18.anInt7287 * local624 / local662 + this.aClass39_Sub2_18.anInt7305;
				arg1.anInt3044 = this.aClass39_Sub2_18.anInt7312 * local643 / local662 + this.aClass39_Sub2_18.anInt7307;
			}
			if (local495) {
				if (this.aClass39_Sub2_18.anInt7288 > local570 && local662 < this.aClass39_Sub2_18.anInt7288) {
					local497 = false;
				} else {
					@Pc(735) int local735;
					@Pc(746) int local746;
					@Pc(772) int local772;
					if (this.aClass39_Sub2_18.anInt7288 > local570) {
						local735 = (local662 - this.aClass39_Sub2_18.anInt7288 << 16) / (local662 - local570);
						local746 = local624 + ((local624 - local532) * local735 >> 16);
						arg1.anInt3041 = this.aClass39_Sub2_18.anInt7287 * local746 / this.aClass39_Sub2_18.anInt7288 + this.aClass39_Sub2_18.anInt7305;
						local772 = ((local643 - local551) * local735 >> 16) + local643;
						arg1.anInt3043 = this.aClass39_Sub2_18.anInt7312 * local772 / this.aClass39_Sub2_18.anInt7288 + this.aClass39_Sub2_18.anInt7307;
					} else if (local662 < this.aClass39_Sub2_18.anInt7288) {
						local735 = (local570 - this.aClass39_Sub2_18.anInt7288 << 16) / (local570 - local662);
						local746 = local532 + (local735 * (local532 - local624) >> 16);
						arg1.anInt3041 = local746 * this.aClass39_Sub2_18.anInt7287 / this.aClass39_Sub2_18.anInt7288 + this.aClass39_Sub2_18.anInt7305;
						local772 = (local735 * (local551 - local643) >> 16) + local551;
						arg1.anInt3043 = this.aClass39_Sub2_18.anInt7307 + this.aClass39_Sub2_18.anInt7312 * local772 / this.aClass39_Sub2_18.anInt7288;
					}
				}
			}
			if (local497) {
				if (local662 < local570) {
					arg1.anInt3040 = this.aClass39_Sub2_18.anInt7287 * (local532 + this.anInt7511) / local570 + this.aClass39_Sub2_18.anInt7305 - arg1.anInt3041;
				} else {
					arg1.anInt3040 = this.aClass39_Sub2_18.anInt7305 + this.aClass39_Sub2_18.anInt7287 * (this.anInt7511 + local624) / local662 - arg1.anInt3042;
				}
				arg1.aBoolean247 = true;
			}
		}
		this.aClass39_Sub2_18.method6146();
		this.aClass39_Sub2_18.method6211(local25);
		this.method6322();
		this.method6338();
	}

	@OriginalMember(owner = "client!qi", name = "L", descriptor = "(SS)V")
	@Override
	public void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface12 local9 = this.aClass39_Sub2_18.anInterface12_15;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7546; local11++) {
			if (this.aShortArray97[local11] == arg0) {
				this.aShortArray97[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class204 local47 = local9.method2573(arg0 & 0xFFFF);
			local35 = local47.aByte83;
			local37 = local47.aByte82;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(67) Class204 local67 = local9.method2573(arg1 & 0xFFFF);
			local55 = local67.aByte83;
			local57 = local67.aByte82;
		}
		if (!(local57 != local37 | local55 != local35)) {
			return;
		}
		if (this.aClass289Array1 != null) {
			for (@Pc(96) int local96 = 0; local96 < this.anInt7565; local96++) {
				@Pc(103) Class289 local103 = this.aClass289Array1[local96];
				@Pc(108) Class114 local108 = this.aClass114Array1[local96];
				local108.anInt3305 = local108.anInt3305 & 0xFF000000 | Static445.anIntArray614[this.aShortArray92[local103.anInt8682] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6327();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method7697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class181_Sub2 local8 = (Class181_Sub2) arg2;
		@Pc(12) Class181_Sub2 local12 = this.aClass39_Sub2_18.aClass181_Sub2_16;
		@Pc(33) float local33 = local12.aFloat135 + local8.aFloat138 * local12.aFloat131 + local8.aFloat135 * local12.aFloat137 + local8.aFloat136 * local12.aFloat139;
		@Pc(54) float local54 = local12.aFloat132 * local8.aFloat136 + local12.aFloat130 * local8.aFloat135 + local8.aFloat138 * local12.aFloat140 + local12.aFloat136;
		Static188.aFloat2 = local8.aFloat131 * local12.aFloat133 + local8.aFloat140 * local12.aFloat129 + local12.aFloat134 * local8.aFloat134;
		Static310.aFloat105 = local12.aFloat137 * local8.aFloat137 + local12.aFloat139 * local8.aFloat130 + local8.aFloat133 * local12.aFloat131;
		Static82.aFloat28 = local12.aFloat134 * local8.aFloat133 + local8.aFloat137 * local12.aFloat133 + local8.aFloat130 * local12.aFloat129;
		Static404.aFloat207 = local12.aFloat140 * local8.aFloat129 + local8.aFloat139 * local12.aFloat130 + local12.aFloat132 * local8.aFloat132;
		@Pc(147) float local147 = local12.aFloat138 + local12.aFloat133 * local8.aFloat135 + local12.aFloat129 * local8.aFloat136 + local8.aFloat138 * local12.aFloat134;
		Static36.aFloat17 = local12.aFloat130 * local8.aFloat131 + local12.aFloat132 * local8.aFloat140 + local12.aFloat140 * local8.aFloat134;
		Static115.aFloat44 = local8.aFloat129 * local12.aFloat131 + local12.aFloat139 * local8.aFloat132 + local12.aFloat137 * local8.aFloat139;
		Static284.aFloat223 = local8.aFloat140 * local12.aFloat139 + local8.aFloat131 * local12.aFloat137 + local12.aFloat131 * local8.aFloat134;
		Static402.aFloat206 = local8.aFloat133 * local12.aFloat140 + local8.aFloat130 * local12.aFloat132 + local12.aFloat130 * local8.aFloat137;
		Static21.aFloat13 = local12.aFloat133 * local8.aFloat139 + local12.aFloat129 * local8.aFloat132 + local8.aFloat129 * local12.aFloat134;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass39_Sub2_18.anInt7287;
		@Pc(255) int local255 = this.aClass39_Sub2_18.anInt7312;
		if (!this.aBoolean563) {
			this.method6329();
		}
		Static185.anIntArray370[0] = this.anInt7519;
		Static276.anIntArray444[0] = this.anInt7547;
		Static210.anIntArray399[0] = this.anInt7557;
		Static185.anIntArray370[1] = this.anInt7501;
		Static276.anIntArray444[1] = this.anInt7547;
		Static210.anIntArray399[1] = this.anInt7557;
		Static185.anIntArray370[2] = this.anInt7519;
		Static276.anIntArray444[2] = this.anInt7531;
		Static185.anIntArray370[3] = this.anInt7501;
		Static210.anIntArray399[2] = this.anInt7557;
		Static276.anIntArray444[3] = this.anInt7531;
		Static210.anIntArray399[3] = this.anInt7557;
		Static185.anIntArray370[4] = this.anInt7519;
		Static276.anIntArray444[4] = this.anInt7547;
		Static185.anIntArray370[5] = this.anInt7501;
		Static210.anIntArray399[4] = this.anInt7515;
		Static276.anIntArray444[5] = this.anInt7547;
		Static185.anIntArray370[6] = this.anInt7519;
		Static210.anIntArray399[5] = this.anInt7515;
		Static276.anIntArray444[6] = this.anInt7531;
		Static210.anIntArray399[6] = this.anInt7515;
		Static185.anIntArray370[7] = this.anInt7501;
		Static276.anIntArray444[7] = this.anInt7531;
		Static210.anIntArray399[7] = this.anInt7515;
		@Pc(442) float local442;
		@Pc(414) float local414;
		@Pc(428) float local428;
		@Pc(400) float local400;
		@Pc(395) float local395;
		@Pc(390) float local390;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static210.anIntArray399[local383];
			local395 = Static276.anIntArray444[local383];
			local400 = Static185.anIntArray370[local383];
			local414 = local54 + Static36.aFloat17 * local390 + Static402.aFloat206 * local400 + Static404.aFloat207 * local395;
			local428 = local390 * Static188.aFloat2 + local395 * Static21.aFloat13 + Static82.aFloat28 * local400 + local147;
			local442 = local33 + local400 * Static310.aFloat105 + Static115.aFloat44 * local395 + local390 * Static284.aFloat223;
			if (local428 >= (float) this.aClass39_Sub2_18.anInt7288) {
				@Pc(461) float local461 = local442 * (float) local251 / local428 + (float) this.aClass39_Sub2_18.anInt7305;
				if (local243 < local461) {
					local243 = local461;
				}
				if (local241 > local461) {
					local241 = local461;
				}
				@Pc(485) float local485 = local414 * (float) local255 / local428 + (float) this.aClass39_Sub2_18.anInt7307;
				local239 = true;
				if (local247 < local485) {
					local247 = local485;
				}
				if (local485 < local245) {
					local245 = local485;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && local243 > (float) arg0 && local245 < (float) arg1 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (Static118.anIntArray308.length < this.anInt7560) {
				Static355.anIntArray514 = new int[this.anInt7560];
				Static118.anIntArray308 = new int[this.anInt7560];
			}
			@Pc(620) int local620;
			for (@Pc(546) int local546 = 0; local546 < this.anInt7497; local546++) {
				local400 = this.anIntArray579[local546];
				local390 = this.anIntArray580[local546];
				local395 = this.anIntArray584[local546];
				local442 = local33 + Static284.aFloat223 * local390 + local395 * Static115.aFloat44 + local400 * Static310.aFloat105;
				local428 = local390 * Static188.aFloat2 + local400 * Static82.aFloat28 + local395 * Static21.aFloat13 + local147;
				local414 = local54 + local390 * Static36.aFloat17 + Static402.aFloat206 * local400 + Static404.aFloat207 * local395;
				@Pc(627) int local627;
				@Pc(629) int local629;
				@Pc(638) int local638;
				if ((float) this.aClass39_Sub2_18.anInt7288 <= local428) {
					local620 = (int) (local442 * (float) local251 / local428 + (float) this.aClass39_Sub2_18.anInt7305);
					local627 = (int) (local414 * (float) local255 / local428 + (float) this.aClass39_Sub2_18.anInt7307);
					local629 = this.anIntArray578[local546];
					local638 = this.anIntArray578[local546 + 1];
					for (@Pc(696) int local696 = local629; local696 < local638; local696++) {
						@Pc(705) int local705 = this.aShortArray95[local696] - 1;
						if (local705 == -1) {
							break;
						}
						Static118.anIntArray308[local705] = local620;
						Static355.anIntArray514[local705] = local627;
					}
				} else {
					local620 = this.anIntArray578[local546];
					local627 = this.anIntArray578[local546 + 1];
					for (local629 = local620; local629 < local627; local629++) {
						local638 = this.aShortArray95[local629] - 1;
						if (local638 == -1) {
							break;
						}
						Static118.anIntArray308[this.aShortArray95[local629] - 1] = -999999;
					}
				}
			}
			for (local620 = 0; local620 < this.anInt7546; local620++) {
				if (Static118.anIntArray308[this.aShortArray102[local620]] != -999999 && Static118.anIntArray308[this.aShortArray96[local620]] != -999999 && Static118.anIntArray308[this.aShortArray93[local620]] != -999999 && this.method6330(Static355.anIntArray514[this.aShortArray93[local620]], arg0, arg1, Static355.anIntArray514[this.aShortArray102[local620]], Static118.anIntArray308[this.aShortArray102[local620]], Static118.anIntArray308[this.aShortArray96[local620]], Static355.anIntArray514[this.aShortArray96[local620]], Static118.anIntArray308[this.aShortArray93[local620]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class63 method7706(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(27) Class63_Sub3 local27;
		@Pc(23) Class63_Sub3 local23;
		if (arg0 == 1) {
			local23 = this.aClass39_Sub2_18.aClass63_Sub3_26;
			local27 = this.aClass39_Sub2_18.aClass63_Sub3_29;
		} else if (arg0 == 2) {
			local23 = this.aClass39_Sub2_18.aClass63_Sub3_25;
			local27 = this.aClass39_Sub2_18.aClass63_Sub3_27;
		} else if (arg0 == 3) {
			local23 = this.aClass39_Sub2_18.aClass63_Sub3_23;
			local27 = this.aClass39_Sub2_18.aClass63_Sub3_30;
		} else if (arg0 == 4) {
			local23 = this.aClass39_Sub2_18.aClass63_Sub3_28;
			local27 = this.aClass39_Sub2_18.aClass63_Sub3_21;
		} else if (arg0 == 5) {
			local23 = this.aClass39_Sub2_18.aClass63_Sub3_22;
			local27 = this.aClass39_Sub2_18.aClass63_Sub3_24;
		} else {
			local27 = local23 = new Class63_Sub3(this.aClass39_Sub2_18, 0, 0, true, false);
		}
		return this.method6321(arg0 != 0, arg1, arg2, local23, local27);
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V")
	private void method6338() {
		if (this.aClass289Array1 == null) {
			return;
		}
		@Pc(12) float local12 = this.aClass39_Sub2_18.ra();
		@Pc(16) float local16 = this.aClass39_Sub2_18.P();
		this.aClass39_Sub2_18.method6058(false);
		this.aClass39_Sub2_18.method6139(false);
		this.aClass39_Sub2_18.method6192(1, Static254.aClass111_2);
		this.aClass39_Sub2_18.method6085(Static254.aClass111_2, 1);
		for (@Pc(39) int local39 = 0; local39 < this.anInt7565; local39++) {
			@Pc(46) Class289 local46 = this.aClass289Array1[local39];
			@Pc(51) Class114 local51 = this.aClass114Array1[local39];
			if (!local46.aBoolean623 || !this.aClass39_Sub2_18.method6043()) {
				@Pc(80) float local80 = (float) (this.anIntArray579[local46.anInt8681] + this.anIntArray579[local46.anInt8678] + this.anIntArray579[local46.anInt8683]) * 0.3333333F;
				@Pc(101) float local101 = (float) (this.anIntArray584[local46.anInt8678] + this.anIntArray584[local46.anInt8683] + this.anIntArray584[local46.anInt8681]) * 0.3333333F;
				@Pc(122) float local122 = (float) (this.anIntArray580[local46.anInt8681] + this.anIntArray580[local46.anInt8683] + this.anIntArray580[local46.anInt8678]) * 0.3333333F;
				@Pc(136) float local136 = Static284.aFloat223 * local122 + Static310.aFloat105 * local80 + local101 * Static115.aFloat44 + Static171.aFloat60;
				@Pc(150) float local150 = Static237.aFloat76 + local101 * Static404.aFloat207 + local80 * Static402.aFloat206 + local122 * Static36.aFloat17;
				@Pc(164) float local164 = Static473.aFloat216 + Static188.aFloat2 * local122 + local101 * Static21.aFloat13 + Static82.aFloat28 * local80;
				@Pc(169) Class181_Sub2 local169 = this.aClass39_Sub2_18.method6158();
				local169.method5395(local46.aShort145 * local51.anInt3306 >> 7, local164, local136 + (float) local51.anInt3300, local150 + (float) local51.anInt3297, local51.anInt3303 * local46.aShort143 >> 7, local51.anInt3299);
				local169.method5393(this.aClass39_Sub2_18.aClass181_Sub2_17);
				this.aClass39_Sub2_18.method6089();
				this.aClass39_Sub2_18.la(local16, local12 - (float) local46.anInt8684 * 1.5F);
				@Pc(224) int local224 = local51.anInt3305;
				this.aClass39_Sub2_18.method6208(false, local46.aShort144, false);
				this.aClass39_Sub2_18.method6088(local46.aByte103);
				this.aClass39_Sub2_18.method6164(local46.aByte102);
				this.aClass39_Sub2_18.method6203(local224);
				this.aClass39_Sub2_18.method6166();
			}
		}
		this.aClass39_Sub2_18.method6085(Static409.aClass111_3, 1);
		this.aClass39_Sub2_18.method6192(1, Static409.aClass111_3);
		this.aClass39_Sub2_18.la(local16, local12);
		this.aClass39_Sub2_18.method6058(true);
	}

	@OriginalMember(owner = "client!qi", name = "X", descriptor = "()V")
	@Override
	public void X() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7497; local7++) {
			this.anIntArray580[local7] = -this.anIntArray580[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt7560; local25++) {
			this.aShortArray94[local25] = (short) -this.aShortArray94[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt7546; local48++) {
			@Pc(55) short local55 = this.aShortArray102[local48];
			this.aShortArray102[local48] = this.aShortArray93[local48];
			this.aShortArray93[local48] = local55;
		}
		this.method6326();
		this.method6335();
		this.method6337();
		this.aBoolean563 = false;
	}
}
