import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class80_Sub1 extends Class80 {

	@OriginalMember(owner = "client!eaa", name = "o", descriptor = "I")
	private int anInt2370;

	@OriginalMember(owner = "client!eaa", name = "s", descriptor = "Lclient!pj;")
	private final Class137_Sub1 aClass137_Sub1_4;

	@OriginalMember(owner = "client!eaa", name = "w", descriptor = "Z")
	private boolean aBoolean197;

	@OriginalMember(owner = "client!eaa", name = "Z", descriptor = "Lclient!qq;")
	private Class288 aClass288_1;

	@OriginalMember(owner = "client!eaa", name = "bb", descriptor = "Lclient!wga;")
	private Class383 aClass383_1;

	@OriginalMember(owner = "client!eaa", name = "jb", descriptor = "I")
	private int anInt2398;

	@OriginalMember(owner = "client!eaa", name = "qb", descriptor = "I")
	private int anInt2404;

	@OriginalMember(owner = "client!eaa", name = "rb", descriptor = "I")
	private int anInt2405;

	@OriginalMember(owner = "client!eaa", name = "ub", descriptor = "I")
	private int anInt2407;

	@OriginalMember(owner = "client!eaa", name = "vb", descriptor = "Z")
	private boolean aBoolean198;

	@OriginalMember(owner = "client!eaa", name = "wb", descriptor = "I")
	private int anInt2408;

	@OriginalMember(owner = "client!eaa", name = "Kb", descriptor = "I")
	private int anInt2418;

	@OriginalMember(owner = "client!eaa", name = "Nb", descriptor = "Lclient!wga;")
	private Class383 aClass383_2;

	@OriginalMember(owner = "client!eaa", name = "Ob", descriptor = "I")
	private int anInt2420;

	@OriginalMember(owner = "client!eaa", name = "Sb", descriptor = "Lclient!wga;")
	private Class383 aClass383_3;

	@OriginalMember(owner = "client!eaa", name = "Wb", descriptor = "I")
	private int anInt2426;

	@OriginalMember(owner = "client!eaa", name = "Yb", descriptor = "Lclient!wh;")
	private Class384 aClass384_1;

	@OriginalMember(owner = "client!eaa", name = "cc", descriptor = "I")
	private int anInt2428;

	@OriginalMember(owner = "client!eaa", name = "kc", descriptor = "I")
	private int anInt2435;

	@OriginalMember(owner = "client!eaa", name = "tc", descriptor = "Z")
	private boolean aBoolean199;

	@OriginalMember(owner = "client!eaa", name = "xc", descriptor = "Lclient!wga;")
	private Class383 aClass383_4;

	@OriginalMember(owner = "client!eaa", name = "Qb", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!eaa", name = "Mb", descriptor = "I")
	private int anInt2419;

	@OriginalMember(owner = "client!eaa", name = "O", descriptor = "I")
	private int anInt2385;

	@OriginalMember(owner = "client!eaa", name = "vc", descriptor = "Z")
	private boolean aBoolean200;

	@OriginalMember(owner = "client!eaa", name = "m", descriptor = "Z")
	private boolean aBoolean196;

	@OriginalMember(owner = "client!eaa", name = "C", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!eaa", name = "M", descriptor = "[I")
	private int[] anIntArray203;

	@OriginalMember(owner = "client!eaa", name = "wc", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!eaa", name = "Q", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!eaa", name = "U", descriptor = "I")
	private int anInt2389;

	@OriginalMember(owner = "client!eaa", name = "gc", descriptor = "I")
	private int anInt2431;

	@OriginalMember(owner = "client!eaa", name = "mc", descriptor = "[Lclient!gv;")
	private Class136[] aClass136Array2;

	@OriginalMember(owner = "client!eaa", name = "y", descriptor = "[Lclient!oq;")
	private Class265[] aClass265Array2;

	@OriginalMember(owner = "client!eaa", name = "Cb", descriptor = "I")
	private int anInt2412;

	@OriginalMember(owner = "client!eaa", name = "Ec", descriptor = "[Lclient!pi;")
	private Class277[] aClass277Array1;

	@OriginalMember(owner = "client!eaa", name = "pc", descriptor = "[Lclient!qi;")
	private Class284[] aClass284Array1;

	@OriginalMember(owner = "client!eaa", name = "N", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!eaa", name = "q", descriptor = "[F")
	private float[] aFloatArray20;

	@OriginalMember(owner = "client!eaa", name = "fc", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!eaa", name = "bc", descriptor = "S")
	private short aShort26;

	@OriginalMember(owner = "client!eaa", name = "Ab", descriptor = "S")
	private short aShort25;

	@OriginalMember(owner = "client!eaa", name = "zb", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!eaa", name = "z", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!eaa", name = "Hb", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!eaa", name = "u", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!eaa", name = "l", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!eaa", name = "ib", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!eaa", name = "sc", descriptor = "[B")
	private byte[] aByteArray40;

	@OriginalMember(owner = "client!eaa", name = "Hc", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!eaa", name = "X", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!eaa", name = "Fc", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!eaa", name = "n", descriptor = "[B")
	private byte[] aByteArray39;

	@OriginalMember(owner = "client!eaa", name = "Lb", descriptor = "[F")
	private float[] aFloatArray21;

	@OriginalMember(owner = "client!eaa", name = "sb", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!eaa", name = "Zb", descriptor = "[I")
	private int[] anIntArray207;

	@OriginalMember(owner = "client!eaa", name = "Fb", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!eaa", name = "t", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!eaa", name = "gb", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!eaa", name = "Xb", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!eaa", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!pj;Lclient!dba;IIII)V")
	public Class80_Sub1(@OriginalArg(0) Class137_Sub1 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface3 local11 = arg0.anInterface3_11;
		this.anIntArray206 = new int[arg1.anInt2029 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt2019];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt2019; local24++) {
			if (arg1.aByteArray27 == null || arg1.aByteArray27[local24] != 2) {
				if (arg1.aShortArray26 != null && arg1.aShortArray26[local24] != -1) {
					@Pc(56) Class224 local56 = local11.method6177(arg1.aShortArray26[local24] & 0xFFFF);
					if (((this.anInt2418 & 0x40) == 0 || !local56.aBoolean453) && local56.aBoolean450) {
						continue;
					}
				}
				local22[this.anInt2419++] = local24;
				this.anIntArray206[arg1.aShortArray28[local24]]++;
				this.anIntArray206[arg1.aShortArray22[local24]]++;
				this.anIntArray206[arg1.aShortArray25[local24]]++;
			}
		}
		this.anInt2385 = this.anInt2419;
		@Pc(129) long[] local129 = new long[this.anInt2419];
		@Pc(138) boolean local138 = (this.anInt2435 & 0x100) != 0;
		@Pc(150) int local150;
		@Pc(163) int local163;
		@Pc(332) int local332;
		for (@Pc(140) int local140 = 0; local140 < this.anInt2419; local140++) {
			@Pc(146) int local146 = local22[local140];
			@Pc(148) Class224 local148 = null;
			local150 = 0;
			@Pc(152) byte local152 = 0;
			@Pc(154) byte local154 = 0;
			@Pc(156) byte local156 = 0;
			if (arg1.aClass156Array1 != null) {
				@Pc(161) boolean local161 = false;
				for (local163 = 0; local163 < arg1.aClass156Array1.length; local163++) {
					@Pc(170) Class156 local170 = arg1.aClass156Array1[local163];
					if (local146 == local170.anInt4303) {
						@Pc(183) Class182 local183 = Static356.method5394(local170.anInt4305);
						if (local183.aBoolean331) {
							local161 = true;
						}
						if (local183.anInt4854 != -1) {
							@Pc(199) Class224 local199 = local11.method6177(local183.anInt4854);
							if (local199.anInt6492 == 2) {
								this.aBoolean200 = true;
							}
						}
					}
				}
				if (local161) {
					local129[local140] = Long.MAX_VALUE;
					this.anInt2385--;
					continue;
				}
			}
			@Pc(234) short local234 = -1;
			if (arg1.aShortArray26 != null) {
				local234 = arg1.aShortArray26[local146];
				if (local234 != -1) {
					local148 = local11.method6177(local234 & 0xFFFF);
					if ((this.anInt2418 & 0x40) != 0 && local148.aBoolean453) {
						local234 = -1;
						local148 = null;
					} else {
						local156 = local148.aByte94;
						local154 = local148.aByte96;
					}
				}
			}
			@Pc(294) boolean local294 = arg1.aByteArray26 != null && arg1.aByteArray26[local146] != 0 || local148 != null && local148.anInt6492 != 0;
			if ((local138 || local294) && arg1.aByteArray29 != null) {
				local150 += arg1.aByteArray29[local146] << 17;
			}
			if (local294) {
				local150 += 65536;
			}
			local150 += (local154 & 0xFF) << 8;
			local332 = local152 + ((local234 & 0xFFFF) << 16);
			local150 += local156 & 0xFF;
			@Pc(344) int local344 = local332 + (local140 & 0xFFFF);
			local129[local140] = (long) local344 + ((long) local150 << 32);
			this.aBoolean196 |= local148 != null && (local148.aByte98 != 0 || local148.aByte97 != 0);
			this.aBoolean200 |= local294;
		}
		Static116.method1962(local22, local129);
		this.aShortArray32 = arg1.aShortArray21;
		this.anIntArray203 = arg1.anIntArray146;
		this.anIntArray208 = arg1.anIntArray148;
		this.anIntArray204 = arg1.anIntArray147;
		this.anInt2389 = arg1.anInt2023;
		this.anInt2431 = arg1.anInt2029;
		this.aClass136Array2 = arg1.aClass136Array1;
		this.aClass265Array2 = arg1.aClass265Array1;
		@Pc(421) Class260[] local421 = new Class260[this.anInt2431];
		@Pc(441) int local441;
		@Pc(455) int local455;
		@Pc(497) int local497;
		if (arg1.aClass156Array1 != null) {
			this.anInt2412 = arg1.aClass156Array1.length;
			this.aClass277Array1 = new Class277[this.anInt2412];
			this.aClass284Array1 = new Class284[this.anInt2412];
			for (local441 = 0; local441 < this.anInt2412; local441++) {
				@Pc(448) Class156 local448 = arg1.aClass156Array1[local441];
				@Pc(453) Class182 local453 = Static356.method5394(local448.anInt4305);
				local455 = -1;
				for (@Pc(457) int local457 = 0; local457 < this.anInt2419; local457++) {
					if (local22[local457] == local448.anInt4303) {
						local455 = local457;
						break;
					}
				}
				if (local455 == -1) {
					throw new RuntimeException();
				}
				local497 = Static659.anIntArray816[arg1.aShortArray23[local448.anInt4303] & 0xFFFF] & 0xFFFFFF;
				@Pc(515) int local515 = local497 | 255 - (arg1.aByteArray26 == null ? 0 : arg1.aByteArray26[local448.anInt4303]) << 24;
				this.aClass277Array1[local441] = new Class277(local455, arg1.aShortArray28[local448.anInt4303], arg1.aShortArray22[local448.anInt4303], arg1.aShortArray25[local448.anInt4303], local453.anInt4852, local453.anInt4851, local453.anInt4854, local453.anInt4857, local453.anInt4853, local453.aBoolean331, local453.aBoolean332, local448.anInt4306);
				this.aClass284Array1[local441] = new Class284(local515);
			}
		}
		local441 = this.anInt2419 * 3;
		this.aShortArray33 = new short[local441];
		this.aFloatArray20 = new float[local441];
		this.aShortArray39 = new short[local441];
		this.aShort26 = (short) arg3;
		this.aShort25 = (short) arg4;
		this.aShortArray37 = new short[local441];
		this.aShortArray31 = new short[this.anInt2419];
		this.aShortArray38 = new short[this.anInt2419];
		this.aShortArray30 = new short[this.anInt2419];
		this.aShortArray29 = new short[local441];
		this.aShortArray35 = new short[this.anInt2419];
		this.aByteArray40 = new byte[local441];
		this.aShortArray41 = new short[local441];
		this.aShortArray34 = new short[local441];
		Static271.aLongArray6 = new long[local441];
		if (arg1.aShortArray19 != null) {
			this.aShortArray40 = new short[this.anInt2419];
		}
		this.aByteArray39 = new byte[this.anInt2419];
		this.aFloatArray21 = new float[local441];
		this.aShortArray36 = new short[this.anInt2419];
		local150 = 0;
		for (local332 = 0; local332 < arg1.anInt2029; local332++) {
			local455 = this.anIntArray206[local332];
			this.anIntArray206[local332] = local150;
			local150 += local455;
			local421[local332] = new Class260();
		}
		this.anIntArray206[arg1.anInt2029] = local150;
		@Pc(705) Class358 local705 = Static54.method1182(arg1, this.anInt2419, local22);
		@Pc(709) Class127[] local709 = new Class127[arg1.anInt2019];
		@Pc(748) int local748;
		@Pc(758) int local758;
		@Pc(769) int local769;
		@Pc(728) short local728;
		@Pc(738) int local738;
		for (local497 = 0; local497 < arg1.anInt2019; local497++) {
			@Pc(718) short local718 = arg1.aShortArray28[local497];
			@Pc(723) short local723 = arg1.aShortArray22[local497];
			local728 = arg1.aShortArray25[local497];
			local738 = this.anIntArray204[local723] - this.anIntArray204[local718];
			local748 = this.anIntArray203[local723] - this.anIntArray203[local718];
			local758 = this.anIntArray208[local723] - this.anIntArray208[local718];
			local769 = this.anIntArray204[local728] - this.anIntArray204[local718];
			@Pc(779) int local779 = this.anIntArray203[local728] - this.anIntArray203[local718];
			@Pc(790) int local790 = this.anIntArray208[local728] - this.anIntArray208[local718];
			@Pc(799) int local799 = local748 * local790 - local758 * local779;
			@Pc(808) int local808 = local769 * local758 - local738 * local790;
			@Pc(816) int local816 = local779 * local738 - local769 * local748;
			while (local799 > 8192 || local808 > 8192 || local816 > 8192 || local799 < -8192 || local808 < -8192 || local816 < -8192) {
				local808 >>= 0x1;
				local816 >>= 0x1;
				local799 >>= 0x1;
			}
			@Pc(870) int local870 = (int) Math.sqrt((double) (local799 * local799 + local808 * local808 + local816 * local816));
			if (local870 <= 0) {
				local870 = 1;
			}
			local799 = local799 * 256 / local870;
			local816 = local816 * 256 / local870;
			local808 = local808 * 256 / local870;
			@Pc(902) byte local902 = arg1.aByteArray27 == null ? 0 : arg1.aByteArray27[local497];
			if (local902 == 0) {
				@Pc(933) Class260 local933 = local421[local718];
				local933.anInt7624 += local799;
				local933.anInt7623++;
				local933.anInt7628 += local808;
				local933.anInt7626 += local816;
				@Pc(961) Class260 local961 = local421[local723];
				local961.anInt7623++;
				local961.anInt7628 += local808;
				local961.anInt7626 += local816;
				local961.anInt7624 += local799;
				@Pc(989) Class260 local989 = local421[local728];
				local989.anInt7628 += local808;
				local989.anInt7623++;
				local989.anInt7624 += local799;
				local989.anInt7626 += local816;
			} else if (local902 == 1) {
				@Pc(918) Class127 local918 = local709[local497] = new Class127();
				local918.anInt3580 = local799;
				local918.anInt3583 = local808;
				local918.anInt3585 = local816;
			}
		}
		@Pc(1026) int local1026;
		@Pc(1069) short local1069;
		for (local163 = 0; local163 < this.anInt2419; local163++) {
			local1026 = local22[local163];
			@Pc(1033) int local1033 = arg1.aShortArray23[local1026] & 0xFFFF;
			if (arg1.aByteArray32 == null) {
				local738 = -1;
			} else {
				local738 = arg1.aByteArray32[local1026];
			}
			if (arg1.aByteArray26 == null) {
				local748 = 0;
			} else {
				local748 = arg1.aByteArray26[local1026] & 0xFF;
			}
			local1069 = arg1.aShortArray26 == null ? -1 : arg1.aShortArray26[local1026];
			if (local1069 != -1 && (this.anInt2418 & 0x40) != 0) {
				@Pc(1088) Class224 local1088 = local11.method6177(local1069 & 0xFFFF);
				if (local1088.aBoolean453) {
					local1069 = -1;
				}
			}
			@Pc(1095) float local1095 = 0.0F;
			@Pc(1097) float local1097 = 0.0F;
			@Pc(1099) float local1099 = 0.0F;
			@Pc(1101) float local1101 = 0.0F;
			@Pc(1103) float local1103 = 0.0F;
			@Pc(1105) float local1105 = 0.0F;
			@Pc(1107) byte local1107 = 0;
			@Pc(1109) byte local1109 = 0;
			@Pc(1111) int local1111 = 0;
			@Pc(1127) byte local1127;
			@Pc(1144) short local1144;
			@Pc(1149) short local1149;
			@Pc(1154) short local1154;
			if (local1069 != -1) {
				if (local738 == -1) {
					local1109 = 2;
					local1099 = 1.0F;
					local1107 = 1;
					local1097 = 1.0F;
					local1095 = 0.0F;
					local1101 = 1.0F;
					local1103 = 0.0F;
					local1105 = 0.0F;
				} else {
					local738 &= 0xFF;
					local1127 = arg1.aByteArray31[local738];
					@Pc(1134) short local1134;
					@Pc(1139) short local1139;
					@Pc(1177) float local1177;
					@Pc(1185) float local1185;
					@Pc(1193) float local1193;
					@Pc(1275) float local1275;
					@Pc(1283) float local1283;
					@Pc(1291) float local1291;
					@Pc(1299) float local1299;
					@Pc(1308) float local1308;
					@Pc(1316) float local1316;
					if (local1127 == 0) {
						local1134 = arg1.aShortArray28[local1026];
						local1139 = arg1.aShortArray22[local1026];
						local1144 = arg1.aShortArray25[local1026];
						local1149 = arg1.aShortArray27[local738];
						local1154 = arg1.aShortArray24[local738];
						@Pc(1159) short local1159 = arg1.aShortArray20[local738];
						@Pc(1165) float local1165 = (float) arg1.anIntArray147[local1149];
						@Pc(1171) float local1171 = (float) arg1.anIntArray146[local1149];
						local1177 = (float) arg1.anIntArray148[local1149];
						local1185 = (float) arg1.anIntArray147[local1154] - local1165;
						local1193 = (float) arg1.anIntArray146[local1154] - local1171;
						@Pc(1201) float local1201 = (float) arg1.anIntArray148[local1154] - local1177;
						@Pc(1209) float local1209 = (float) arg1.anIntArray147[local1159] - local1165;
						@Pc(1217) float local1217 = (float) arg1.anIntArray146[local1159] - local1171;
						@Pc(1225) float local1225 = (float) arg1.anIntArray148[local1159] - local1177;
						@Pc(1233) float local1233 = (float) arg1.anIntArray147[local1134] - local1165;
						@Pc(1241) float local1241 = (float) arg1.anIntArray146[local1134] - local1171;
						@Pc(1250) float local1250 = (float) arg1.anIntArray148[local1134] - local1177;
						@Pc(1258) float local1258 = (float) arg1.anIntArray147[local1139] - local1165;
						@Pc(1267) float local1267 = (float) arg1.anIntArray146[local1139] - local1171;
						local1275 = (float) arg1.anIntArray148[local1139] - local1177;
						local1283 = (float) arg1.anIntArray147[local1144] - local1165;
						local1291 = (float) arg1.anIntArray146[local1144] - local1171;
						local1299 = (float) arg1.anIntArray148[local1144] - local1177;
						local1308 = local1193 * local1225 - local1217 * local1201;
						local1316 = local1209 * local1201 - local1225 * local1185;
						@Pc(1324) float local1324 = local1185 * local1217 - local1193 * local1209;
						@Pc(1333) float local1333 = local1217 * local1324 - local1316 * local1225;
						@Pc(1341) float local1341 = local1308 * local1225 - local1324 * local1209;
						@Pc(1350) float local1350 = local1209 * local1316 - local1308 * local1217;
						@Pc(1364) float local1364 = 1.0F / (local1193 * local1341 + local1333 * local1185 + local1201 * local1350);
						local1103 = local1364 * (local1350 * local1299 + local1291 * local1341 + local1333 * local1283);
						local1099 = (local1275 * local1350 + local1267 * local1341 + local1333 * local1258) * local1364;
						local1095 = (local1250 * local1350 + local1341 * local1241 + local1233 * local1333) * local1364;
						@Pc(1414) float local1414 = local1193 * local1324 - local1316 * local1201;
						@Pc(1422) float local1422 = local1201 * local1308 - local1324 * local1185;
						@Pc(1430) float local1430 = local1185 * local1316 - local1193 * local1308;
						@Pc(1444) float local1444 = 1.0F / (local1422 * local1217 + local1414 * local1209 + local1430 * local1225);
						local1097 = local1444 * (local1414 * local1233 + local1422 * local1241 + local1430 * local1250);
						local1101 = local1444 * (local1258 * local1414 + local1422 * local1267 + local1430 * local1275);
						local1105 = (local1430 * local1299 + local1291 * local1422 + local1414 * local1283) * local1444;
					} else {
						local1134 = arg1.aShortArray28[local1026];
						local1139 = arg1.aShortArray22[local1026];
						local1144 = arg1.aShortArray25[local1026];
						@Pc(1508) int local1508 = local705.anIntArray756[local738];
						@Pc(1513) int local1513 = local705.anIntArray757[local738];
						@Pc(1518) int local1518 = local705.anIntArray758[local738];
						@Pc(1523) float[] local1523 = local705.aFloatArrayArray18[local738];
						@Pc(1528) byte local1528 = arg1.aByteArray30[local738];
						local1177 = (float) arg1.anIntArray151[local738] / 256.0F;
						if (local1127 == 1) {
							local1185 = (float) arg1.anIntArray145[local738] / 1024.0F;
							Static529.method7861(arg1.anIntArray148[local1134], local1185, local1177, local1508, arg1.anIntArray146[local1134], local1518, Static629.aFloatArray84, local1528, local1513, arg1.anIntArray147[local1134], local1523);
							local1095 = Static629.aFloatArray84[0];
							local1097 = Static629.aFloatArray84[1];
							Static529.method7861(arg1.anIntArray148[local1139], local1185, local1177, local1508, arg1.anIntArray146[local1139], local1518, Static629.aFloatArray84, local1528, local1513, arg1.anIntArray147[local1139], local1523);
							local1101 = Static629.aFloatArray84[1];
							local1099 = Static629.aFloatArray84[0];
							Static529.method7861(arg1.anIntArray148[local1144], local1185, local1177, local1508, arg1.anIntArray146[local1144], local1518, Static629.aFloatArray84, local1528, local1513, arg1.anIntArray147[local1144], local1523);
							local1105 = Static629.aFloatArray84[1];
							local1103 = Static629.aFloatArray84[0];
							local1193 = local1185 / 2.0F;
							if ((local1528 & 0x1) == 0) {
								if (local1103 - local1095 > local1193) {
									local1109 = 1;
									local1103 -= local1185;
								} else if (local1193 < local1095 - local1103) {
									local1109 = 2;
									local1103 += local1185;
								}
								if (local1099 - local1095 > local1193) {
									local1099 -= local1185;
									local1107 = 1;
								} else if (local1095 - local1099 > local1193) {
									local1099 += local1185;
									local1107 = 2;
								}
							} else {
								if (local1101 - local1097 > local1193) {
									local1101 -= local1185;
									local1107 = 1;
								} else if (local1193 < local1097 - local1101) {
									local1107 = 2;
									local1101 += local1185;
								}
								if (local1105 - local1097 > local1193) {
									local1105 -= local1185;
									local1109 = 1;
								} else if (local1097 - local1105 > local1193) {
									local1109 = 2;
									local1105 += local1185;
								}
							}
						} else if (local1127 == 2) {
							local1185 = (float) arg1.anIntArray143[local738] / 256.0F;
							local1193 = (float) arg1.anIntArray150[local738] / 256.0F;
							@Pc(1997) int local1997 = arg1.anIntArray147[local1139] - arg1.anIntArray147[local1134];
							@Pc(2008) int local2008 = arg1.anIntArray146[local1139] - arg1.anIntArray146[local1134];
							@Pc(2019) int local2019 = arg1.anIntArray148[local1139] - arg1.anIntArray148[local1134];
							@Pc(2029) int local2029 = arg1.anIntArray147[local1144] - arg1.anIntArray147[local1134];
							@Pc(2039) int local2039 = arg1.anIntArray146[local1144] - arg1.anIntArray146[local1134];
							@Pc(2050) int local2050 = arg1.anIntArray148[local1144] - arg1.anIntArray148[local1134];
							@Pc(2059) int local2059 = local2050 * local2008 - local2039 * local2019;
							@Pc(2068) int local2068 = local2019 * local2029 - local2050 * local1997;
							@Pc(2076) int local2076 = local1997 * local2039 - local2008 * local2029;
							local1275 = 64.0F / (float) arg1.anIntArray141[local738];
							local1283 = 64.0F / (float) arg1.anIntArray144[local738];
							local1291 = 64.0F / (float) arg1.anIntArray145[local738];
							local1299 = (local1523[2] * (float) local2076 + (float) local2059 * local1523[0] + (float) local2068 * local1523[1]) / local1275;
							local1308 = (local1523[3] * (float) local2059 + (float) local2068 * local1523[4] + local1523[5] * (float) local2076) / local1283;
							local1316 = (local1523[6] * (float) local2059 + (float) local2068 * local1523[7] + (float) local2076 * local1523[8]) / local1291;
							local1111 = Static230.method3500(local1308, local1316, local1299);
							Static245.method9052(arg1.anIntArray148[local1134], local1528, Static629.aFloatArray84, local1111, local1193, local1177, local1508, local1523, arg1.anIntArray146[local1134], arg1.anIntArray147[local1134], local1185, local1513, local1518);
							local1097 = Static629.aFloatArray84[1];
							local1095 = Static629.aFloatArray84[0];
							Static245.method9052(arg1.anIntArray148[local1139], local1528, Static629.aFloatArray84, local1111, local1193, local1177, local1508, local1523, arg1.anIntArray146[local1139], arg1.anIntArray147[local1139], local1185, local1513, local1518);
							local1101 = Static629.aFloatArray84[1];
							local1099 = Static629.aFloatArray84[0];
							Static245.method9052(arg1.anIntArray148[local1144], local1528, Static629.aFloatArray84, local1111, local1193, local1177, local1508, local1523, arg1.anIntArray146[local1144], arg1.anIntArray147[local1144], local1185, local1513, local1518);
							local1105 = Static629.aFloatArray84[1];
							local1103 = Static629.aFloatArray84[0];
						} else if (local1127 == 3) {
							Static240.method3605(arg1.anIntArray148[local1134], local1518, local1508, arg1.anIntArray146[local1134], local1513, arg1.anIntArray147[local1134], local1528, local1523, local1177, Static629.aFloatArray84);
							local1095 = Static629.aFloatArray84[0];
							local1097 = Static629.aFloatArray84[1];
							Static240.method3605(arg1.anIntArray148[local1139], local1518, local1508, arg1.anIntArray146[local1139], local1513, arg1.anIntArray147[local1139], local1528, local1523, local1177, Static629.aFloatArray84);
							local1101 = Static629.aFloatArray84[1];
							local1099 = Static629.aFloatArray84[0];
							Static240.method3605(arg1.anIntArray148[local1144], local1518, local1508, arg1.anIntArray146[local1144], local1513, arg1.anIntArray147[local1144], local1528, local1523, local1177, Static629.aFloatArray84);
							local1105 = Static629.aFloatArray84[1];
							local1103 = Static629.aFloatArray84[0];
							if ((local1528 & 0x1) == 0) {
								if (local1099 - local1095 > 0.5F) {
									local1099--;
									local1107 = 1;
								} else if (local1095 - local1099 > 0.5F) {
									local1099++;
									local1107 = 2;
								}
								if (local1103 - local1095 > 0.5F) {
									local1103--;
									local1109 = 1;
								} else if (local1095 - local1103 > 0.5F) {
									local1109 = 2;
									local1103++;
								}
							} else {
								if (local1105 - local1097 > 0.5F) {
									local1105--;
									local1109 = 1;
								} else if (local1097 - local1105 > 0.5F) {
									local1109 = 2;
									local1105++;
								}
								if (local1101 - local1097 > 0.5F) {
									local1101--;
									local1107 = 1;
								} else if (local1097 - local1101 > 0.5F) {
									local1101++;
									local1107 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray27 == null) {
				local1127 = 0;
			} else {
				local1127 = arg1.aByteArray27[local1026];
			}
			if (local1127 == 0) {
				@Pc(2327) long local2327 = ((long) local748 + (long) (local1111 << 24) + (long) (local1033 << 8) << 32) + (long) (local738 << 2);
				local1144 = arg1.aShortArray28[local1026];
				local1149 = arg1.aShortArray22[local1026];
				local1154 = arg1.aShortArray25[local1026];
				@Pc(2346) Class260 local2346 = local421[local1144];
				this.aShortArray30[local163] = this.method2054(arg1, local1097, local2346.anInt7626, local2346.anInt7628, local2346.anInt7623, local2346.anInt7624, local2327, local1095, local163, local1144);
				@Pc(2371) Class260 local2371 = local421[local1149];
				this.aShortArray31[local163] = this.method2054(arg1, local1101, local2371.anInt7626, local2371.anInt7628, local2371.anInt7623, local2371.anInt7624, (long) local1107 + local2327, local1099, local163, local1149);
				@Pc(2399) Class260 local2399 = local421[local1154];
				this.aShortArray36[local163] = this.method2054(arg1, local1105, local2399.anInt7626, local2399.anInt7628, local2399.anInt7623, local2399.anInt7624, (long) local1109 + local2327, local1103, local163, local1154);
			} else if (local1127 == 1) {
				@Pc(2432) Class127 local2432 = local709[local1026];
				@Pc(2478) long local2478 = ((long) (local1111 << 24) + (long) (local1033 << 8) + (long) local748 << 32) + (long) ((local2432.anInt3585 + 256 << 22) + (local738 << 2) + ((local2432.anInt3580 <= 0 ? 2048 : 1024) - -(local2432.anInt3583 + 256 << 12)));
				this.aShortArray30[local163] = this.method2054(arg1, local1097, local2432.anInt3585, local2432.anInt3583, 0, local2432.anInt3580, local2478, local1095, local163, arg1.aShortArray28[local1026]);
				this.aShortArray31[local163] = this.method2054(arg1, local1101, local2432.anInt3585, local2432.anInt3583, 0, local2432.anInt3580, local2478 + (long) local1107, local1099, local163, arg1.aShortArray22[local1026]);
				this.aShortArray36[local163] = this.method2054(arg1, local1105, local2432.anInt3585, local2432.anInt3583, 0, local2432.anInt3580, (long) local1109 + local2478, local1103, local163, arg1.aShortArray25[local1026]);
			}
			if (arg1.aByteArray26 != null) {
				this.aByteArray39[local163] = arg1.aByteArray26[local1026];
			}
			if (arg1.aShortArray19 != null) {
				this.aShortArray40[local163] = arg1.aShortArray19[local1026];
			}
			this.aShortArray38[local163] = arg1.aShortArray23[local1026];
			this.aShortArray35[local163] = local1069;
		}
		if (this.anInt2385 > 0) {
			local1026 = 1;
			local728 = this.aShortArray35[0];
			for (local738 = 0; local738 < this.anInt2385; local738++) {
				@Pc(2615) short local2615 = this.aShortArray35[local738];
				if (local2615 != local728) {
					local728 = local2615;
					local1026++;
				}
			}
			this.anIntArray207 = new int[local1026];
			this.anIntArray205 = new int[local1026 + 1];
			this.anIntArray202 = new int[local1026];
			this.anIntArray205[0] = 0;
			local748 = this.anInt2428;
			local1026 = 0;
			local1069 = 0;
			local728 = this.aShortArray35[0];
			for (local769 = 0; local769 < this.anInt2385; local769++) {
				@Pc(2670) short local2670 = this.aShortArray35[local769];
				if (local728 != local2670) {
					this.anIntArray207[local1026] = local748;
					this.anIntArray202[local1026] = local1069 + 1 - local748;
					local1026++;
					this.anIntArray205[local1026] = local769;
					local748 = this.anInt2428;
					local1069 = 0;
					local728 = local2670;
				}
				@Pc(2709) short local2709 = this.aShortArray30[local769];
				if (local2709 < local748) {
					local748 = local2709;
				}
				if (local2709 > local1069) {
					local1069 = local2709;
				}
				local2709 = this.aShortArray31[local769];
				if (local1069 < local2709) {
					local1069 = local2709;
				}
				if (local2709 < local748) {
					local748 = local2709;
				}
				local2709 = this.aShortArray36[local769];
				if (local1069 < local2709) {
					local1069 = local2709;
				}
				if (local748 > local2709) {
					local748 = local2709;
				}
			}
			this.anIntArray207[local1026] = local748;
			this.anIntArray202[local1026] = local1069 + 1 - local748;
			local1026++;
			this.anIntArray205[local1026] = this.anInt2385;
		}
		Static271.aLongArray6 = null;
		this.aShortArray39 = Static85.method1591(this.aShortArray39, this.anInt2428);
		this.aShortArray34 = Static85.method1591(this.aShortArray34, this.anInt2428);
		this.aShortArray29 = Static85.method1591(this.aShortArray29, this.anInt2428);
		this.aShortArray33 = Static85.method1591(this.aShortArray33, this.anInt2428);
		this.aShortArray41 = Static85.method1591(this.aShortArray41, this.anInt2428);
		this.aByteArray40 = Static276.method4019(this.anInt2428, this.aByteArray40);
		this.aFloatArray20 = Static209.method3282(this.anInt2428, this.aFloatArray20);
		this.aFloatArray21 = Static209.method3282(this.anInt2428, this.aFloatArray21);
		if (arg1.anIntArray149 != null && Static406.method6037(arg2, this.anInt2418)) {
			this.anIntArrayArray11 = arg1.method1713(false);
		}
		if (arg1.aClass156Array1 != null && Static233.method3544(arg2, this.anInt2418)) {
			this.anIntArrayArray12 = arg1.method1726();
		}
		if (arg1.anIntArray142 != null && Static366.method5521(arg2, this.anInt2418)) {
			local1026 = 0;
			@Pc(2900) int[] local2900 = new int[256];
			for (local738 = 0; local738 < this.anInt2419; local738++) {
				local748 = arg1.anIntArray142[local22[local738]];
				if (local748 >= 0) {
					if (local1026 < local748) {
						local1026 = local748;
					}
					@Pc(2926) int local2926 = local2900[local748]++;
				}
			}
			this.anIntArrayArray10 = new int[local1026 + 1][];
			for (local748 = 0; local748 <= local1026; local748++) {
				this.anIntArrayArray10[local748] = new int[local2900[local748]];
				local2900[local748] = 0;
			}
			for (local758 = 0; local758 < this.anInt2419; local758++) {
				local769 = arg1.anIntArray142[local22[local758]];
				if (local769 >= 0) {
					this.anIntArrayArray10[local769][local2900[local769]++] = local758;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!pj;IIZZ)V")
	public Class80_Sub1(@OriginalArg(0) Class137_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean197 = false;
		this.aBoolean198 = true;
		this.aBoolean196 = false;
		this.anInt2385 = 0;
		this.anInt2419 = 0;
		this.anInt2389 = 0;
		this.anInt2431 = 0;
		this.aBoolean199 = false;
		this.aBoolean200 = false;
		this.anInt2428 = 0;
		this.anInt2435 = arg1;
		this.aClass137_Sub1_4 = arg0;
		this.anInt2418 = arg2;
		this.aBoolean197 = arg4;
		if (arg3 || Static652.method9072(this.anInt2435, this.anInt2418)) {
			this.aClass383_1 = new Class383(Static79.method1488(this.anInt2435, this.anInt2418));
		}
		if (arg3 || Static156.method2526(this.anInt2418, this.anInt2435)) {
			this.aClass383_2 = new Class383(Static271.method3954(this.anInt2435, this.anInt2418));
		}
		if (arg3 || Static447.method8531(this.anInt2418, this.anInt2435)) {
			this.aClass383_3 = new Class383(Static385.method5715(this.anInt2418, this.anInt2435));
		}
		if (arg3 || Static66.method1324(this.anInt2418, this.anInt2435)) {
			this.aClass383_4 = new Class383(Static212.method3350(this.anInt2435, this.anInt2418));
		}
		if (arg3 || Static454.method6569(this.anInt2435, this.anInt2418)) {
			this.aClass384_1 = new Class384(Static248.method3657(this.anInt2418, this.anInt2435));
		}
	}

	@OriginalMember(owner = "client!eaa", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class32.anIntArray76[arg0];
		@Pc(13) int local13 = Class32.anIntArray77[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2431; local15++) {
			local33 = this.anIntArray204[local15] * local13 + local9 * this.anIntArray208[local15] >> 14;
			this.anIntArray208[local15] = this.anIntArray208[local15] * local13 - this.anIntArray204[local15] * local9 >> 14;
			this.anIntArray204[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt2428; local33++) {
			@Pc(83) int local83 = this.aShortArray41[local33] * local9 + this.aShortArray29[local33] * local13 >> 14;
			this.aShortArray41[local33] = (short) (this.aShortArray41[local33] * local13 - local9 * this.aShortArray29[local33] >> 14);
			this.aShortArray29[local33] = (short) local83;
		}
		this.method2059();
		this.method2057();
		this.aBoolean199 = false;
	}

	@OriginalMember(owner = "client!eaa", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass383_1 != null) {
			this.aClass383_1.aBoolean753 = Static79.method1488(arg0, this.anInt2418);
		}
		if (this.aClass383_2 != null) {
			this.aClass383_2.aBoolean753 = Static271.method3954(arg0, this.anInt2418);
		}
		if (this.aClass383_3 != null) {
			this.aClass383_3.aBoolean753 = Static385.method5715(this.anInt2418, arg0);
		}
		if (this.aClass383_4 != null) {
			this.aClass383_4.aBoolean753 = Static212.method3350(arg0, this.anInt2418);
		}
		this.anInt2435 = arg0;
		this.aBoolean198 = true;
		if (this.aClass288_1 != null && (this.anInt2435 & 0x10000) == 0) {
			this.aByteArray40 = this.aClass288_1.aByteArray100;
			this.aShortArray29 = this.aClass288_1.aShortArray126;
			this.aShortArray33 = this.aClass288_1.aShortArray124;
			this.aShortArray41 = this.aClass288_1.aShortArray125;
			this.aClass288_1 = null;
		}
		this.method2066();
	}

	@OriginalMember(owner = "client!eaa", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean199) {
			this.method2067();
		}
		return this.anInt2408;
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V")
	public void method2053() {
		if (this.aClass383_1 != null) {
			this.aClass383_1.method9129();
		}
		if (this.aClass383_2 != null) {
			this.aClass383_2.method9129();
		}
		if (this.aClass383_3 != null) {
			this.aClass383_3.method9129();
		}
		if (this.aClass383_4 != null) {
			this.aClass383_4.method9129();
		}
		if (this.aClass384_1 != null) {
			this.aClass384_1.method9133();
		}
	}

	@OriginalMember(owner = "client!eaa", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class14_Sub3_Sub14 ba(@OriginalArg(0) Class14_Sub3_Sub14 arg0) {
		if (this.anInt2428 == 0) {
			return null;
		}
		if (!this.aBoolean199) {
			this.method2067();
		}
		@Pc(37) int local37;
		@Pc(54) int local54;
		if (this.aClass137_Sub1_4.anInt9740 <= 0) {
			local37 = this.anInt2398 - (this.anInt2405 * this.aClass137_Sub1_4.anInt9740 >> 8) >> this.aClass137_Sub1_4.anInt9731;
			local54 = this.anInt2407 - (this.anInt2404 * this.aClass137_Sub1_4.anInt9740 >> 8) >> this.aClass137_Sub1_4.anInt9731;
		} else {
			local37 = this.anInt2398 - (this.anInt2404 * this.aClass137_Sub1_4.anInt9740 >> 8) >> this.aClass137_Sub1_4.anInt9731;
			local54 = this.anInt2407 - (this.aClass137_Sub1_4.anInt9740 * this.anInt2405 >> 8) >> this.aClass137_Sub1_4.anInt9731;
		}
		@Pc(109) int local109;
		@Pc(126) int local126;
		if (this.aClass137_Sub1_4.anInt9717 > 0) {
			local109 = this.anInt2420 - (this.anInt2404 * this.aClass137_Sub1_4.anInt9717 >> 8) >> this.aClass137_Sub1_4.anInt9731;
			local126 = this.anInt2408 - (this.aClass137_Sub1_4.anInt9717 * this.anInt2405 >> 8) >> this.aClass137_Sub1_4.anInt9731;
		} else {
			local109 = this.anInt2420 - (this.anInt2405 * this.aClass137_Sub1_4.anInt9717 >> 8) >> this.aClass137_Sub1_4.anInt9731;
			local126 = this.anInt2408 - (this.aClass137_Sub1_4.anInt9717 * this.anInt2404 >> 8) >> this.aClass137_Sub1_4.anInt9731;
		}
		@Pc(168) int local168 = local54 + 1 - local37;
		@Pc(174) int local174 = local126 + 1 - local109;
		@Pc(177) Class14_Sub3_Sub14_Sub1 local177 = (Class14_Sub3_Sub14_Sub1) arg0;
		@Pc(187) Class14_Sub3_Sub14_Sub1 local187;
		if (local177 != null && local177.method6751(local168, local174)) {
			local187 = local177;
			local177.method6750();
		} else {
			local187 = new Class14_Sub3_Sub14_Sub1(this.aClass137_Sub1_4, local168, local174);
		}
		local187.method6746(local54, local37, local126, local109);
		this.method2055(local187);
		return local187;
	}

	@OriginalMember(owner = "client!eaa", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static28.anInt700 = 0;
			Static357.anInt6582 = 0;
			local31 = 0;
			Static261.anInt4566 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray11.length) {
					local55 = this.anIntArrayArray11[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray32 == null || (arg6 & this.aShortArray32[local63]) != 0) {
							Static357.anInt6582 += this.anIntArray204[local63];
							Static28.anInt700 += this.anIntArray203[local63];
							local31++;
							Static261.anInt4566 += this.anIntArray208[local63];
						}
					}
				}
			}
			if (local31 <= 0) {
				Static261.anInt4566 = arg4;
				Static28.anInt700 = arg3;
				Static357.anInt6582 = arg2;
			} else {
				Static357.anInt6582 = arg2 + Static357.anInt6582 / local31;
				Static261.anInt4566 = arg4 + Static261.anInt4566 / local31;
				Static28.anInt700 = Static28.anInt700 / local31 + arg3;
				Static10.aBoolean5 = true;
			}
			return;
		}
		@Pc(249) int[] local249;
		@Pc(251) int local251;
		if (arg0 == 1) {
			if (arg7 != null) {
				local31 = arg3 * arg7[1] + arg7[0] * arg2 + arg7[2] * arg4 + 8192 >> 14;
				local35 = arg3 * arg7[4] + arg2 * arg7[3] + arg4 * arg7[5] + 8192 >> 14;
				local41 = arg3 * arg7[7] + arg7[6] * arg2 + arg4 * arg7[8] + 8192 >> 14;
				arg3 = local35;
				arg2 = local31;
				arg4 = local41;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray11.length) {
					local249 = this.anIntArrayArray11[local35];
					for (local251 = 0; local251 < local249.length; local251++) {
						local57 = local249[local251];
						if (this.aShortArray32 == null || (this.aShortArray32[local57] & arg6) != 0) {
							this.anIntArray204[local57] += arg2;
							this.anIntArray203[local57] += arg3;
							this.anIntArray208[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(373) int local373;
		@Pc(396) int local396;
		@Pc(423) int local423;
		@Pc(454) int local454;
		@Pc(458) int local458;
		@Pc(462) int local462;
		@Pc(466) int local466;
		@Pc(474) int local474;
		@Pc(482) int local482;
		@Pc(637) int local637;
		@Pc(662) int local662;
		@Pc(667) int local667;
		@Pc(675) int local675;
		@Pc(680) int local680;
		@Pc(684) int local684;
		@Pc(688) int local688;
		@Pc(690) int local690;
		@Pc(822) int[] local822;
		@Pc(824) int local824;
		@Pc(828) int local828;
		@Pc(832) int local832;
		@Pc(834) int local834;
		@Pc(961) int local961;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray11.length) {
						local249 = this.anIntArrayArray11[local35];
						for (local251 = 0; local251 < local249.length; local251++) {
							local57 = local249[local251];
							if (this.aShortArray32 == null || (arg6 & this.aShortArray32[local57]) != 0) {
								this.anIntArray204[local57] -= Static357.anInt6582;
								this.anIntArray203[local57] -= Static28.anInt700;
								this.anIntArray208[local57] -= Static261.anInt4566;
								if (arg4 != 0) {
									local63 = Class32.anIntArray76[arg4];
									local373 = Class32.anIntArray77[arg4];
									local396 = this.anIntArray204[local57] * local373 + this.anIntArray203[local57] * local63 + 16383 >> 14;
									this.anIntArray203[local57] = this.anIntArray203[local57] * local373 + 16383 - this.anIntArray204[local57] * local63 >> 14;
									this.anIntArray204[local57] = local396;
								}
								if (arg2 != 0) {
									local63 = Class32.anIntArray76[arg2];
									local373 = Class32.anIntArray77[arg2];
									local396 = this.anIntArray203[local57] * local373 + 16383 - local63 * this.anIntArray208[local57] >> 14;
									this.anIntArray208[local57] = this.anIntArray208[local57] * local373 + local63 * this.anIntArray203[local57] + 16383 >> 14;
									this.anIntArray203[local57] = local396;
								}
								if (arg3 != 0) {
									local63 = Class32.anIntArray76[arg3];
									local373 = Class32.anIntArray77[arg3];
									local396 = local63 * this.anIntArray208[local57] + local373 * this.anIntArray204[local57] + 16383 >> 14;
									this.anIntArray208[local57] = this.anIntArray208[local57] * local373 + 16383 - local63 * this.anIntArray204[local57] >> 14;
									this.anIntArray204[local57] = local396;
								}
								this.anIntArray204[local57] += Static357.anInt6582;
								this.anIntArray203[local57] += Static28.anInt700;
								this.anIntArray208[local57] += Static261.anInt4566;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray11.length > local41) {
							local55 = this.anIntArrayArray11[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray32 == null || (this.aShortArray32[local63] & arg6) != 0) {
									local373 = this.anIntArray206[local63];
									local396 = this.anIntArray206[local63 + 1];
									for (local423 = local373; local423 < local396; local423++) {
										local454 = this.aShortArray37[local423] - 1;
										if (local454 == -1) {
											break;
										}
										if (arg4 != 0) {
											local458 = Class32.anIntArray76[arg4];
											local462 = Class32.anIntArray77[arg4];
											local466 = this.aShortArray29[local454] * local462 + local458 * this.aShortArray33[local454] + 16383 >> 14;
											this.aShortArray33[local454] = (short) (this.aShortArray33[local454] * local462 + 16383 - this.aShortArray29[local454] * local458 >> 14);
											this.aShortArray29[local454] = (short) local466;
										}
										if (arg2 != 0) {
											local458 = Class32.anIntArray76[arg2];
											local462 = Class32.anIntArray77[arg2];
											local466 = local462 * this.aShortArray33[local454] + 16383 - this.aShortArray41[local454] * local458 >> 14;
											this.aShortArray41[local454] = (short) (this.aShortArray33[local454] * local458 + local462 * this.aShortArray41[local454] + 16383 >> 14);
											this.aShortArray33[local454] = (short) local466;
										}
										if (arg3 != 0) {
											local458 = Class32.anIntArray76[arg3];
											local462 = Class32.anIntArray77[arg3];
											local466 = this.aShortArray41[local454] * local458 + local462 * this.aShortArray29[local454] + 16383 >> 14;
											this.aShortArray41[local454] = (short) (local462 * this.aShortArray41[local454] + 16383 - local458 * this.aShortArray29[local454] >> 14);
											this.aShortArray29[local454] = (short) local466;
										}
									}
								}
							}
						}
					}
					this.method2057();
				}
			} else {
				local31 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local251 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static10.aBoolean5) {
					local373 = Static357.anInt6582 * arg7[0] + arg7[3] * Static28.anInt700 + arg7[6] * Static261.anInt4566 + 8192 >> 14;
					local396 = arg7[1] * Static357.anInt6582 + Static28.anInt700 * arg7[4] + Static261.anInt4566 * arg7[7] + 8192 >> 14;
					local396 += local57;
					local423 = Static261.anInt4566 * arg7[8] + Static357.anInt6582 * arg7[2] + arg7[5] * Static28.anInt700 + 8192 >> 14;
					local373 += local251;
					Static357.anInt6582 = local373;
					local423 += local63;
					Static28.anInt700 = local396;
					Static10.aBoolean5 = false;
					Static261.anInt4566 = local423;
				}
				@Pc(442) int[] local442 = new int[9];
				local396 = Class32.anIntArray77[arg2];
				local423 = Class32.anIntArray76[arg2];
				local454 = Class32.anIntArray77[arg3];
				local458 = Class32.anIntArray76[arg3];
				local462 = Class32.anIntArray77[arg4];
				local466 = Class32.anIntArray76[arg4];
				local474 = local462 * local423 + 8192 >> 14;
				local482 = local423 * local466 + 8192 >> 14;
				local442[0] = local454 * local462 + local482 * local458 + 8192 >> 14;
				local442[1] = -local454 * local466 + local474 * local458 + 8192 >> 14;
				local442[3] = local396 * local466 + 8192 >> 14;
				local442[7] = local454 * local474 + local466 * local458 + 8192 >> 14;
				local442[6] = local482 * local454 + -local458 * local462 + 8192 >> 14;
				local442[8] = local454 * local396 + 8192 >> 14;
				local442[2] = local458 * local396 + 8192 >> 14;
				local442[4] = local462 * local396 + 8192 >> 14;
				local442[5] = -local423;
				@Pc(612) int local612 = -Static28.anInt700 * local442[1] + -Static357.anInt6582 * local442[0] + local442[2] * -Static261.anInt4566 + 8192 >> 14;
				local637 = -Static357.anInt6582 * local442[3] + local442[4] * -Static28.anInt700 + -Static261.anInt4566 * local442[5] + 8192 >> 14;
				local662 = local442[8] * -Static261.anInt4566 + -Static28.anInt700 * local442[7] + local442[6] * -Static357.anInt6582 + 8192 >> 14;
				local667 = local612 + Static357.anInt6582;
				@Pc(671) int local671 = local637 + Static28.anInt700;
				local675 = Static261.anInt4566 + local662;
				@Pc(678) int[] local678 = new int[9];
				for (local680 = 0; local680 < 3; local680++) {
					for (local684 = 0; local684 < 3; local684++) {
						local688 = 0;
						for (local690 = 0; local690 < 3; local690++) {
							local688 += local442[local690 + local680 * 3] * arg7[local684 * 3 + local690];
						}
						local678[local684 + local680 * 3] = local688 + 8192 >> 14;
					}
				}
				local684 = local63 * local442[2] + local251 * local442[0] + local57 * local442[1] + 8192 >> 14;
				local688 = local442[3] * local251 + local442[4] * local57 + local63 * local442[5] + 8192 >> 14;
				local684 += local667;
				local690 = local63 * local442[8] + local251 * local442[6] + local442[7] * local57 + 8192 >> 14;
				local688 += local671;
				local690 += local675;
				local822 = new int[9];
				for (local824 = 0; local824 < 3; local824++) {
					for (local828 = 0; local828 < 3; local828++) {
						local832 = 0;
						for (local834 = 0; local834 < 3; local834++) {
							local832 += local678[local828 + local834 * 3] * arg7[local824 * 3 + local834];
						}
						local822[local824 * 3 + local828] = local832 + 8192 >> 14;
					}
				}
				local828 = arg7[2] * local690 + local684 * arg7[0] + arg7[1] * local688 + 8192 >> 14;
				local832 = arg7[4] * local688 + local684 * arg7[3] + arg7[5] * local690 + 8192 >> 14;
				local832 += local35;
				local834 = local688 * arg7[7] + arg7[6] * local684 + arg7[8] * local690 + 8192 >> 14;
				local828 += local31;
				local834 += local41;
				for (local961 = 0; local961 < local8; local961++) {
					@Pc(967) int local967 = arg1[local961];
					if (this.anIntArrayArray11.length > local967) {
						@Pc(977) int[] local977 = this.anIntArrayArray11[local967];
						for (@Pc(979) int local979 = 0; local979 < local977.length; local979++) {
							@Pc(985) int local985 = local977[local979];
							if (this.aShortArray32 == null || (this.aShortArray32[local985] & arg6) != 0) {
								@Pc(1027) int local1027 = local822[0] * this.anIntArray204[local985] + this.anIntArray203[local985] * local822[1] + this.anIntArray208[local985] * local822[2] + 8192 >> 14;
								@Pc(1059) int local1059 = this.anIntArray208[local985] * local822[5] + this.anIntArray204[local985] * local822[3] + this.anIntArray203[local985] * local822[4] + 8192 >> 14;
								@Pc(1063) int local1063 = local1027 + local828;
								@Pc(1094) int local1094 = this.anIntArray208[local985] * local822[8] + this.anIntArray203[local985] * local822[7] + this.anIntArray204[local985] * local822[6] + 8192 >> 14;
								@Pc(1098) int local1098 = local1059 + local832;
								@Pc(1102) int local1102 = local1094 + local834;
								this.anIntArray204[local985] = local1063;
								this.anIntArray203[local985] = local1098;
								this.anIntArray208[local985] = local1102;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2577) Class284 local2577;
			@Pc(2469) boolean local2469;
			@Pc(2572) Class277 local2572;
			if (arg0 == 5) {
				if (this.anIntArrayArray10 != null) {
					local2469 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray10.length > local41) {
							local55 = this.anIntArrayArray10[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray40 == null || (arg6 & this.aShortArray40[local63]) != 0) {
									local373 = (this.aByteArray39[local63] & 0xFF) + arg2 * 8;
									if (local373 < 0) {
										local373 = 0;
									} else if (local373 > 255) {
										local373 = 255;
									}
									this.aByteArray39[local63] = (byte) local373;
								}
							}
							local2469 |= local55.length > 0;
						}
					}
					if (local2469) {
						if (this.aClass277Array1 != null) {
							for (local41 = 0; local41 < this.anInt2412; local41++) {
								local2572 = this.aClass277Array1[local41];
								local2577 = this.aClass284Array1[local41];
								local2577.anInt8654 = local2577.anInt8654 & 0xFFFFFF | 255 - (this.aByteArray39[local2572.anInt7977] & 0xFF) << 24;
							}
						}
						this.method2058();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray10 != null) {
					local2469 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray10.length > local41) {
							local55 = this.anIntArrayArray10[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray40 == null || (arg6 & this.aShortArray40[local63]) != 0) {
									local373 = this.aShortArray38[local63] & 0xFFFF;
									local396 = local373 >> 10 & 0x3F;
									local423 = local373 >> 7 & 0x7;
									local423 += arg3 / 4;
									@Pc(2685) int local2685 = local396 + arg2 & 0x3F;
									local454 = local373 & 0x7F;
									if (local423 < 0) {
										local423 = 0;
									} else if (local423 > 7) {
										local423 = 7;
									}
									local454 += arg4;
									if (local454 < 0) {
										local454 = 0;
									} else if (local454 > 127) {
										local454 = 127;
									}
									this.aShortArray38[local63] = (short) (local423 << 7 | local2685 << 10 | local454);
								}
							}
							local2469 |= local55.length > 0;
						}
					}
					if (local2469) {
						if (this.aClass277Array1 != null) {
							for (local41 = 0; local41 < this.anInt2412; local41++) {
								local2572 = this.aClass277Array1[local41];
								local2577 = this.aClass284Array1[local41];
								local2577.anInt8654 = Static659.anIntArray816[this.aShortArray38[local2572.anInt7977] & 0xFFFF] & 0xFFFFFF | local2577.anInt8654 & 0xFF000000;
							}
						}
						this.method2058();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray12 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray12.length) {
							local249 = this.anIntArrayArray12[local35];
							for (local251 = 0; local251 < local249.length; local251++) {
								local2577 = this.aClass284Array1[local249[local251]];
								local2577.anInt8655 += arg2;
								local2577.anInt8651 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray12 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray12.length > local35) {
							local249 = this.anIntArrayArray12[local35];
							for (local251 = 0; local251 < local249.length; local251++) {
								local2577 = this.aClass284Array1[local249[local251]];
								local2577.anInt8650 = arg2 * local2577.anInt8650 >> 7;
								local2577.anInt8652 = local2577.anInt8652 * arg3 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray12 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray12.length) {
						local249 = this.anIntArrayArray12[local35];
						for (local251 = 0; local251 < local249.length; local251++) {
							local2577 = this.aClass284Array1[local249[local251]];
							local2577.anInt8649 = local2577.anInt8649 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray11.length) {
					local249 = this.anIntArrayArray11[local35];
					for (local251 = 0; local251 < local249.length; local251++) {
						local57 = local249[local251];
						if (this.aShortArray32 == null || (this.aShortArray32[local57] & arg6) != 0) {
							this.anIntArray204[local57] -= Static357.anInt6582;
							this.anIntArray203[local57] -= Static28.anInt700;
							this.anIntArray208[local57] -= Static261.anInt4566;
							this.anIntArray204[local57] = this.anIntArray204[local57] * arg2 >> 7;
							this.anIntArray203[local57] = arg3 * this.anIntArray203[local57] >> 7;
							this.anIntArray208[local57] = arg4 * this.anIntArray208[local57] >> 7;
							this.anIntArray204[local57] += Static357.anInt6582;
							this.anIntArray203[local57] += Static28.anInt700;
							this.anIntArray208[local57] += Static261.anInt4566;
						}
					}
				}
			}
		} else {
			local31 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local251 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static10.aBoolean5) {
				local373 = arg7[6] * Static261.anInt4566 + arg7[3] * Static28.anInt700 + arg7[0] * Static357.anInt6582 + 8192 >> 14;
				local396 = Static261.anInt4566 * arg7[7] + arg7[1] * Static357.anInt6582 + Static28.anInt700 * arg7[4] + 8192 >> 14;
				local396 += local57;
				local423 = arg7[2] * Static357.anInt6582 + Static28.anInt700 * arg7[5] + arg7[8] * Static261.anInt4566 + 8192 >> 14;
				local373 += local251;
				Static357.anInt6582 = local373;
				local423 += local63;
				Static28.anInt700 = local396;
				Static10.aBoolean5 = false;
				Static261.anInt4566 = local423;
			}
			local373 = arg2 << 15 >> 7;
			local396 = arg3 << 15 >> 7;
			local423 = arg4 << 15 >> 7;
			local454 = local373 * -Static357.anInt6582 + 8192 >> 14;
			local458 = local396 * -Static28.anInt700 + 8192 >> 14;
			local462 = local423 * -Static261.anInt4566 + 8192 >> 14;
			local466 = Static357.anInt6582 + local454;
			local474 = local458 + Static28.anInt700;
			local482 = local462 + Static261.anInt4566;
			@Pc(1862) int[] local1862 = new int[] { local373 * arg7[0] + 8192 >> 14, arg7[3] * local373 + 8192 >> 14, arg7[6] * local373 + 8192 >> 14, local396 * arg7[1] + 8192 >> 14, arg7[4] * local396 + 8192 >> 14, arg7[7] * local396 + 8192 >> 14, arg7[2] * local423 + 8192 >> 14, local423 * arg7[5] + 8192 >> 14, local423 * arg7[8] + 8192 >> 14 };
			local637 = local373 * local251 + 8192 >> 14;
			local662 = local396 * local57 + 8192 >> 14;
			@Pc(1990) int local1990 = local637 + local466;
			local667 = local423 * local63 + 8192 >> 14;
			@Pc(2002) int local2002 = local662 + local474;
			@Pc(2006) int local2006 = local667 + local482;
			@Pc(2009) int[] local2009 = new int[9];
			@Pc(2015) int local2015;
			for (local675 = 0; local675 < 3; local675++) {
				for (local2015 = 0; local2015 < 3; local2015++) {
					local680 = 0;
					for (local684 = 0; local684 < 3; local684++) {
						local680 += arg7[local684 + local675 * 3] * local1862[local684 * 3 + local2015];
					}
					local2009[local675 * 3 + local2015] = local680 + 8192 >> 14;
				}
			}
			local2015 = local2006 * arg7[2] + local2002 * arg7[1] + local1990 * arg7[0] + 8192 >> 14;
			local680 = arg7[5] * local2006 + local2002 * arg7[4] + arg7[3] * local1990 + 8192 >> 14;
			local680 += local35;
			local2015 += local31;
			local684 = local2006 * arg7[8] + local2002 * arg7[7] + arg7[6] * local1990 + 8192 >> 14;
			local684 += local41;
			for (local688 = 0; local688 < local8; local688++) {
				local690 = arg1[local688];
				if (local690 < this.anIntArrayArray11.length) {
					local822 = this.anIntArrayArray11[local690];
					for (local824 = 0; local824 < local822.length; local824++) {
						local828 = local822[local824];
						if (this.aShortArray32 == null || (arg6 & this.aShortArray32[local828]) != 0) {
							local832 = this.anIntArray208[local828] * local2009[2] + local2009[1] * this.anIntArray203[local828] + this.anIntArray204[local828] * local2009[0] + 8192 >> 14;
							local834 = this.anIntArray204[local828] * local2009[3] + local2009[4] * this.anIntArray203[local828] + local2009[5] * this.anIntArray208[local828] + 8192 >> 14;
							@Pc(2251) int local2251 = local834 + local680;
							local961 = local2009[8] * this.anIntArray208[local828] + this.anIntArray204[local828] * local2009[6] + local2009[7] * this.anIntArray203[local828] + 8192 >> 14;
							@Pc(2287) int local2287 = local832 + local2015;
							this.anIntArray204[local828] = local2287;
							@Pc(2296) int local2296 = local961 + local684;
							this.anIntArray203[local828] = local2251;
							this.anIntArray208[local828] = local2296;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILclient!dba;FIIIIJFII)S")
	private short method2054(@OriginalArg(1) Class67 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray206[arg9];
		@Pc(17) int local17 = this.anIntArray206[arg9 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray37[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static271.aLongArray6[local21] == arg6) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray37[local19] = (short) (this.anInt2428 + 1);
		Static271.aLongArray6[local19] = arg6;
		this.aShortArray34[this.anInt2428] = (short) arg8;
		this.aShortArray39[this.anInt2428] = (short) arg9;
		this.aShortArray29[this.anInt2428] = (short) arg5;
		this.aShortArray33[this.anInt2428] = (short) arg3;
		this.aShortArray41[this.anInt2428] = (short) arg2;
		this.aByteArray40[this.anInt2428] = (byte) arg4;
		this.aFloatArray20[this.anInt2428] = arg7;
		this.aFloatArray21[this.anInt2428] = arg1;
		return (short) this.anInt2428++;
	}

	@OriginalMember(owner = "client!eaa", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort25;
	}

	@OriginalMember(owner = "client!eaa", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface3 local9 = this.aClass137_Sub1_4.anInterface3_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt2419; local11++) {
			if (arg0 == this.aShortArray35[local11]) {
				this.aShortArray35[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class224 local48 = local9.method6177(arg0 & 0xFFFF);
			local35 = local48.aByte100;
			local37 = local48.aByte99;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(69) Class224 local69 = local9.method6177(arg1 & 0xFFFF);
			local56 = local69.aByte100;
			if (local69.aByte98 != 0 || local69.aByte97 != 0) {
				this.aBoolean196 = true;
			}
			local58 = local69.aByte99;
		}
		if (!(local56 != local35 | local58 != local37)) {
			return;
		}
		if (this.aClass277Array1 != null) {
			for (@Pc(113) int local113 = 0; local113 < this.anInt2412; local113++) {
				@Pc(120) Class277 local120 = this.aClass277Array1[local113];
				@Pc(125) Class284 local125 = this.aClass284Array1[local113];
				local125.anInt8654 = Static659.anIntArray816[this.aShortArray38[local120.anInt7977] & 0xFFFF] & 0xFFFFFF | local125.anInt8654 & 0xFF000000;
			}
		}
		this.method2058();
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILclient!pn;)V")
	private void method2055(@OriginalArg(1) Class14_Sub3_Sub14_Sub1 arg0) {
		if (this.anInt2428 > Static350.anIntArray116.length) {
			Static376.anIntArray506 = new int[this.anInt2428];
			Static350.anIntArray116 = new int[this.anInt2428];
		}
		@Pc(51) int local51;
		@Pc(89) int local89;
		@Pc(98) int local98;
		for (@Pc(24) int local24 = 0; local24 < this.anInt2431; local24++) {
			local51 = (this.anIntArray204[local24] - (this.anIntArray203[local24] * this.aClass137_Sub1_4.anInt9740 >> 8) >> this.aClass137_Sub1_4.anInt9731) - arg0.anInt8093;
			@Pc(75) int local75 = (this.anIntArray208[local24] - (this.aClass137_Sub1_4.anInt9717 * this.anIntArray203[local24] >> 8) >> this.aClass137_Sub1_4.anInt9731) - arg0.anInt8098;
			@Pc(80) int local80 = this.anIntArray206[local24];
			@Pc(87) int local87 = this.anIntArray206[local24 + 1];
			for (local89 = local80; local89 < local87; local89++) {
				local98 = this.aShortArray37[local89] - 1;
				if (local98 == -1) {
					break;
				}
				Static350.anIntArray116[local98] = local51;
				Static376.anIntArray506[local98] = local75;
			}
		}
		for (local51 = 0; local51 < this.anInt2385; local51++) {
			if (this.aByteArray39 == null || this.aByteArray39[local51] <= 128) {
				@Pc(146) short local146 = this.aShortArray30[local51];
				@Pc(151) short local151 = this.aShortArray31[local51];
				@Pc(156) short local156 = this.aShortArray36[local51];
				local89 = Static350.anIntArray116[local146];
				local98 = Static350.anIntArray116[local151];
				@Pc(168) int local168 = Static350.anIntArray116[local156];
				@Pc(172) int local172 = Static376.anIntArray506[local146];
				@Pc(176) int local176 = Static376.anIntArray506[local151];
				@Pc(180) int local180 = Static376.anIntArray506[local156];
				if ((local89 - local98) * (local176 - local180) - (local168 - local98) * (-local172 + local176) > 0) {
					arg0.method6747(local172, local180, local89, local98, local168, local176);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(Z)V")
	private void method2056() {
		if (this.aClass277Array1 == null) {
			return;
		}
		this.aClass137_Sub1_4.C(!this.aBoolean200);
		this.aClass137_Sub1_4.method8077(false);
		this.aClass137_Sub1_4.method8069(1, Static490.aClass169_6);
		this.aClass137_Sub1_4.method7971(1, Static490.aClass169_6);
		for (@Pc(42) int local42 = 0; local42 < this.anInt2412; local42++) {
			@Pc(49) Class277 local49 = this.aClass277Array1[local42];
			@Pc(54) Class284 local54 = this.aClass284Array1[local42];
			if (!local49.aBoolean551 || !this.aClass137_Sub1_4.method7880()) {
				@Pc(82) float local82 = (float) (this.anIntArray204[local49.anInt7982] + this.anIntArray204[local49.anInt7980] + this.anIntArray204[local49.anInt7978]) * 0.3333333F;
				@Pc(104) float local104 = (float) (this.anIntArray203[local49.anInt7980] + this.anIntArray203[local49.anInt7982] + this.anIntArray203[local49.anInt7978]) * 0.3333333F;
				@Pc(125) float local125 = (float) (this.anIntArray208[local49.anInt7978] + this.anIntArray208[local49.anInt7982] + this.anIntArray208[local49.anInt7980]) * 0.3333333F;
				@Pc(139) float local139 = Static143.aFloat61 * local125 + local104 * Static655.aFloat267 + Static89.aFloat54 * local82 + Static468.aFloat11;
				@Pc(153) float local153 = Static507.aFloat219 + Static202.aFloat77 * local104 + local82 * Static55.aFloat33 + local125 * Static453.aFloat183;
				@Pc(167) float local167 = Static334.aFloat151 + local125 * Static298.aFloat106 + local104 * Static294.aFloat105 + local82 * Static386.aFloat162;
				@Pc(188) float local188 = (float) (1.0D / Math.sqrt((double) (local167 * local167 + local139 * local139 + local153 * local153))) * (float) local49.anInt7979;
				@Pc(193) Class26_Sub1 local193 = this.aClass137_Sub1_4.method8006();
				local193.method783(local167 - local188 * local167, local54.anInt8652 * local49.aShort86 >> 7, local54.anInt8649, local153 + (float) local54.anInt8651 - local188 * local153, (float) local54.anInt8655 + local139 - local188 * local139, local49.aShort85 * local54.anInt8650 >> 7);
				local193.method801(this.aClass137_Sub1_4.aClass26_Sub1_17);
				this.aClass137_Sub1_4.method8036();
				@Pc(248) int local248 = local54.anInt8654;
				this.aClass137_Sub1_4.method7962(false, local49.aShort84, false);
				this.aClass137_Sub1_4.method7990(local49.aByte117);
				this.aClass137_Sub1_4.method8048(local248);
				this.aClass137_Sub1_4.method7968();
			}
		}
		this.aClass137_Sub1_4.method7971(1, Static567.aClass169_7);
		this.aClass137_Sub1_4.method8069(1, Static567.aClass169_7);
		this.aClass137_Sub1_4.C(true);
	}

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)V")
	private void method2057() {
		if ((this.anInt2418 & 0x37) == 0) {
			if (this.aClass383_3 != null) {
				this.aClass383_3.aBoolean751 = false;
			}
		} else if (this.aClass383_4 != null) {
			this.aClass383_4.aBoolean751 = false;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!qja;Lclient!ag;II)V")
	@Override
	public void method6375(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class12_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2428 == 0) {
			return;
		}
		@Pc(16) Class26_Sub1 local16 = this.aClass137_Sub1_4.aClass26_Sub1_16;
		@Pc(19) Class26_Sub1 local19 = (Class26_Sub1) arg0;
		if (!this.aBoolean199) {
			this.method2067();
		}
		Static294.aFloat105 = local19.aFloat26 * local16.aFloat20 + local19.aFloat24 * local16.aFloat28 + local19.aFloat28 * local16.aFloat21;
		Static334.aFloat151 = local19.aFloat25 * local16.aFloat21 + local19.aFloat23 * local16.aFloat20 + local16.aFloat28 * local19.aFloat18 + local16.aFloat25;
		@Pc(72) float local72 = Static334.aFloat151 + Static294.aFloat105 * (float) this.anInt2405;
		@Pc(80) float local80 = Static334.aFloat151 + (float) this.anInt2404 * Static294.aFloat105;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = (float) this.anInt2370 + local72;
			local97 = local80 - (float) this.anInt2370;
		} else {
			local90 = local80 + (float) this.anInt2370;
			local97 = (float) -this.anInt2370 + local72;
		}
		if (local97 >= this.aClass137_Sub1_4.aFloat247 || (float) this.aClass137_Sub1_4.anInt9737 >= local90) {
			return;
		}
		Static655.aFloat267 = local19.aFloat28 * local16.aFloat19 + local19.aFloat24 * local16.aFloat26 + local16.aFloat29 * local19.aFloat26;
		Static468.aFloat11 = local16.aFloat19 * local19.aFloat25 + local16.aFloat29 * local19.aFloat23 + local16.aFloat26 * local19.aFloat18 + local16.aFloat23;
		@Pc(173) float local173 = Static468.aFloat11 + Static655.aFloat267 * (float) this.anInt2405;
		@Pc(181) float local181 = (float) this.anInt2404 * Static655.aFloat267 + Static468.aFloat11;
		@Pc(196) float local196;
		@Pc(207) float local207;
		if (local173 > local181) {
			local207 = (local173 + (float) this.anInt2370) * (float) this.aClass137_Sub1_4.anInt9742;
			local196 = ((float) -this.anInt2370 + local181) * (float) this.aClass137_Sub1_4.anInt9742;
		} else {
			local196 = (local173 - (float) this.anInt2370) * (float) this.aClass137_Sub1_4.anInt9742;
			local207 = (local181 + (float) this.anInt2370) * (float) this.aClass137_Sub1_4.anInt9742;
		}
		if (this.aClass137_Sub1_4.aFloat239 <= local196 / (float) arg2 || this.aClass137_Sub1_4.aFloat241 >= local207 / (float) arg2) {
			return;
		}
		Static507.aFloat219 = local16.aFloat24 * local19.aFloat18 + local19.aFloat23 * local16.aFloat22 + local16.aFloat27 * local19.aFloat25 + local16.aFloat18;
		Static202.aFloat77 = local16.aFloat27 * local19.aFloat28 + local19.aFloat24 * local16.aFloat24 + local19.aFloat26 * local16.aFloat22;
		@Pc(299) float local299 = (float) this.anInt2405 * Static202.aFloat77 + Static507.aFloat219;
		@Pc(307) float local307 = Static202.aFloat77 * (float) this.anInt2404 + Static507.aFloat219;
		@Pc(333) float local333;
		@Pc(322) float local322;
		if (local299 > local307) {
			local322 = ((float) this.anInt2370 + local299) * (float) this.aClass137_Sub1_4.anInt9735;
			local333 = (float) this.aClass137_Sub1_4.anInt9735 * (local307 - (float) this.anInt2370);
		} else {
			local333 = (float) this.aClass137_Sub1_4.anInt9735 * (local299 - (float) this.anInt2370);
			local322 = (float) this.aClass137_Sub1_4.anInt9735 * ((float) this.anInt2370 + local307);
		}
		if (local333 / (float) arg2 >= this.aClass137_Sub1_4.aFloat237 || this.aClass137_Sub1_4.aFloat243 >= local322 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass277Array1 != null) {
			Static89.aFloat54 = local16.aFloat19 * local19.aFloat20 + local19.aFloat29 * local16.aFloat29 + local16.aFloat26 * local19.aFloat22;
			Static453.aFloat183 = local16.aFloat27 * local19.aFloat21 + local19.aFloat19 * local16.aFloat22 + local19.aFloat27 * local16.aFloat24;
			Static386.aFloat162 = local19.aFloat20 * local16.aFloat21 + local16.aFloat28 * local19.aFloat22 + local16.aFloat20 * local19.aFloat29;
			Static55.aFloat33 = local16.aFloat27 * local19.aFloat20 + local19.aFloat22 * local16.aFloat24 + local19.aFloat29 * local16.aFloat22;
			Static298.aFloat106 = local19.aFloat21 * local16.aFloat21 + local19.aFloat27 * local16.aFloat28 + local16.aFloat20 * local19.aFloat19;
			Static143.aFloat61 = local19.aFloat27 * local16.aFloat26 + local16.aFloat29 * local19.aFloat19 + local19.aFloat21 * local16.aFloat19;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.anInt2407 + this.anInt2398 >> 1;
			@Pc(508) int local508 = this.anInt2408 + this.anInt2420 >> 1;
			@Pc(527) int local527 = (int) (Static143.aFloat61 * (float) local508 + Static655.aFloat267 * (float) this.anInt2405 + (float) local500 * Static89.aFloat54 + Static468.aFloat11);
			@Pc(546) int local546 = (int) ((float) local508 * Static453.aFloat183 + Static507.aFloat219 + (float) local500 * Static55.aFloat33 + Static202.aFloat77 * (float) this.anInt2405);
			@Pc(565) int local565 = (int) ((float) local508 * Static298.aFloat106 + Static386.aFloat162 * (float) local500 + Static334.aFloat151 + Static294.aFloat105 * (float) this.anInt2405);
			@Pc(584) int local584 = (int) ((float) this.anInt2404 * Static655.aFloat267 + Static468.aFloat11 + (float) local500 * Static89.aFloat54 + Static143.aFloat61 * (float) local508);
			@Pc(603) int local603 = (int) ((float) this.anInt2404 * Static202.aFloat77 + (float) local500 * Static55.aFloat33 + Static507.aFloat219 + (float) local508 * Static453.aFloat183);
			arg1.anInt83 = local546 * this.aClass137_Sub1_4.anInt9735 / arg2 + this.aClass137_Sub1_4.anInt9715;
			arg1.anInt82 = this.aClass137_Sub1_4.anInt9715 + local603 * this.aClass137_Sub1_4.anInt9735 / arg2;
			@Pc(649) int local649 = (int) ((float) local508 * Static298.aFloat106 + Static334.aFloat151 + Static386.aFloat162 * (float) local500 + Static294.aFloat105 * (float) this.anInt2404);
			arg1.anInt84 = local584 * this.aClass137_Sub1_4.anInt9742 / arg2 + this.aClass137_Sub1_4.anInt9712;
			arg1.anInt80 = this.aClass137_Sub1_4.anInt9742 * local527 / arg2 + this.aClass137_Sub1_4.anInt9712;
			if (this.aClass137_Sub1_4.anInt9737 <= local565 || this.aClass137_Sub1_4.anInt9737 <= local649) {
				arg1.aBoolean6 = true;
				arg1.anInt81 = this.aClass137_Sub1_4.anInt9742 * (local527 + this.anInt2370) / arg2 + this.aClass137_Sub1_4.anInt9712 - arg1.anInt80;
			}
		}
		this.aClass137_Sub1_4.method7993((float) arg2);
		this.aClass137_Sub1_4.method7966();
		this.aClass137_Sub1_4.method7960(local19);
		this.method2062();
		this.method2056();
	}

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "(Z)V")
	private void method2058() {
		if (this.aClass383_3 != null) {
			this.aClass383_3.aBoolean751 = false;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray11 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt2389; local12++) {
			this.anIntArray204[local12] <<= 0x4;
			this.anIntArray203[local12] <<= 0x4;
			this.anIntArray208[local12] <<= 0x4;
		}
		Static28.anInt700 = 0;
		Static261.anInt4566 = 0;
		Static357.anInt6582 = 0;
		return true;
	}

	@OriginalMember(owner = "client!eaa", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort26;
	}

	@OriginalMember(owner = "client!eaa", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort25 = (short) arg0;
		this.method2059();
		this.method2057();
	}

	@OriginalMember(owner = "client!eaa", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean199) {
			this.method2067();
		}
		return this.anInt2405;
	}

	@OriginalMember(owner = "client!eaa", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2431; local3++) {
			this.anIntArray208[local3] = -this.anIntArray208[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt2428; local29++) {
			this.aShortArray41[local29] = (short) -this.aShortArray41[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt2419; local52++) {
			@Pc(59) short local59 = this.aShortArray30[local52];
			this.aShortArray30[local52] = this.aShortArray36[local52];
			this.aShortArray36[local52] = local59;
		}
		this.method2059();
		this.method2057();
		this.method2068();
		this.aBoolean199 = false;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IILclient!qja;ZI)Z")
	@Override
	public boolean method6380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method2063(arg1, arg0, arg4, arg3, arg2, -1);
	}

	@OriginalMember(owner = "client!eaa", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean199) {
			this.method2067();
		}
		return this.anInt2407;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class80 method6378(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(25) Class80_Sub1 local25;
		@Pc(29) Class80_Sub1 local29;
		if (arg0 == 1) {
			local29 = this.aClass137_Sub1_4.aClass80_Sub1_25;
			local25 = this.aClass137_Sub1_4.aClass80_Sub1_22;
		} else if (arg0 == 2) {
			local29 = this.aClass137_Sub1_4.aClass80_Sub1_27;
			local25 = this.aClass137_Sub1_4.aClass80_Sub1_21;
		} else if (arg0 == 3) {
			local25 = this.aClass137_Sub1_4.aClass80_Sub1_29;
			local29 = this.aClass137_Sub1_4.aClass80_Sub1_23;
		} else if (arg0 == 4) {
			local25 = this.aClass137_Sub1_4.aClass80_Sub1_24;
			local29 = this.aClass137_Sub1_4.aClass80_Sub1_26;
		} else if (arg0 == 5) {
			local25 = this.aClass137_Sub1_4.aClass80_Sub1_28;
			local29 = this.aClass137_Sub1_4.aClass80_Sub1_30;
		} else {
			local25 = local29 = new Class80_Sub1(this.aClass137_Sub1_4, 0, 0, true, false);
		}
		return this.method2061(arg2, arg1, local25, arg0 != 0, local29);
	}

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "()V")
	@Override
	public void method6389() {
		if (this.anInt2428 > 0 && this.anInt2385 > 0) {
			this.method2064();
			this.method2065();
			this.method2066();
		}
	}

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "()V")
	@Override
	protected void method6381() {
	}

	@OriginalMember(owner = "client!eaa", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean199) {
			this.method2067();
		}
		return this.anInt2398;
	}

	@OriginalMember(owner = "client!eaa", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2419; local7++) {
			if (this.aShortArray38[local7] == arg0) {
				this.aShortArray38[local7] = arg1;
			}
		}
		if (this.aClass277Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt2412; local34++) {
				@Pc(41) Class277 local41 = this.aClass277Array1[local34];
				@Pc(46) Class284 local46 = this.aClass284Array1[local34];
				local46.anInt8654 = local46.anInt8654 & 0xFF000000 | Static659.anIntArray816[this.aShortArray38[local41.anInt7977] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method2058();
	}

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "(Z)V")
	private void method2059() {
		if (this.aClass383_1 != null) {
			this.aClass383_1.aBoolean751 = false;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt2419; local3++) {
			local12 = this.aShortArray38[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			@Pc(43) int local43 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local43 -= -((arg2 - local43) * arg3 >> 7);
			}
			this.aShortArray38[local3] = (short) (local24 << 7 | local18 << 10 | local43);
		}
		if (this.aClass277Array1 != null) {
			for (local12 = 0; local12 < this.anInt2412; local12++) {
				@Pc(112) Class277 local112 = this.aClass277Array1[local12];
				@Pc(117) Class284 local117 = this.aClass284Array1[local12];
				local117.anInt8654 = Static659.anIntArray816[this.aShortArray38[local112.anInt7977] & 0xFFFF] & 0xFFFFFF | local117.anInt8654 & 0xFF000000;
			}
		}
		this.method2058();
	}

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "()[Lclient!gv;")
	@Override
	public Class136[] method6376() {
		return this.aClass136Array2;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "()Z")
	@Override
	public boolean method6371() {
		if (this.aShortArray35 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray35.length; local12++) {
			if (this.aShortArray35[local12] != -1 && !this.aClass137_Sub1_4.anInterface3_11.method6181(this.aShortArray35[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!qja;IZ)V")
	@Override
	public void method6382(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray32 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt2431; local14++) {
			if ((arg1 & this.aShortArray32[local14]) != 0) {
				if (arg2) {
					arg0.method6454(this.anIntArray204[local14], this.anIntArray203[local14], this.anIntArray208[local14], local12);
				} else {
					arg0.method6461(this.anIntArray204[local14], this.anIntArray203[local14], this.anIntArray208[local14], local12);
				}
				this.anIntArray204[local14] = local12[0];
				this.anIntArray203[local14] = local12[1];
				this.anIntArray208[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "()V")
	@Override
	protected void method6377() {
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6385(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class80_Sub1 local8 = (Class80_Sub1) arg0;
		if (this.anInt2419 == 0 || local8.anInt2419 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt2431;
		@Pc(24) int[] local24 = local8.anIntArray204;
		@Pc(27) int[] local27 = local8.anIntArray203;
		@Pc(30) int[] local30 = local8.anIntArray208;
		@Pc(33) short[] local33 = local8.aShortArray29;
		@Pc(36) short[] local36 = local8.aShortArray33;
		@Pc(39) short[] local39 = local8.aShortArray41;
		@Pc(42) byte[] local42 = local8.aByteArray40;
		@Pc(49) short[] local49;
		@Pc(61) short[] local61;
		@Pc(53) short[] local53;
		@Pc(57) byte[] local57;
		if (this.aClass288_1 == null) {
			local53 = null;
			local57 = null;
			local61 = null;
			local49 = null;
		} else {
			local49 = this.aClass288_1.aShortArray126;
			local53 = this.aClass288_1.aShortArray125;
			local57 = this.aClass288_1.aByteArray100;
			local61 = this.aClass288_1.aShortArray124;
		}
		@Pc(82) short[] local82;
		@Pc(90) short[] local90;
		@Pc(86) short[] local86;
		@Pc(78) byte[] local78;
		if (local8.aClass288_1 == null) {
			local78 = null;
			local86 = null;
			local90 = null;
			local82 = null;
		} else {
			local78 = local8.aClass288_1.aByteArray100;
			local82 = local8.aClass288_1.aShortArray126;
			local86 = local8.aClass288_1.aShortArray125;
			local90 = local8.aClass288_1.aShortArray124;
		}
		@Pc(103) int[] local103 = local8.anIntArray206;
		@Pc(106) short[] local106 = local8.aShortArray37;
		if (!local8.aBoolean199) {
			local8.method2067();
		}
		@Pc(115) int local115 = local8.anInt2405;
		@Pc(118) int local118 = local8.anInt2404;
		@Pc(121) int local121 = local8.anInt2398;
		@Pc(124) int local124 = local8.anInt2407;
		@Pc(127) int local127 = local8.anInt2420;
		@Pc(130) int local130 = local8.anInt2408;
		for (@Pc(132) int local132 = 0; local132 < this.anInt2431; local132++) {
			@Pc(142) int local142 = this.anIntArray203[local132] - arg2;
			if (local142 >= local115 && local118 >= local142) {
				@Pc(162) int local162 = this.anIntArray204[local132] - arg1;
				if (local121 <= local162 && local124 >= local162) {
					@Pc(186) int local186 = this.anIntArray208[local132] - arg3;
					if (local186 >= local127 && local186 <= local130) {
						@Pc(196) int local196 = -1;
						@Pc(201) int local201 = this.anIntArray206[local132];
						@Pc(208) int local208 = this.anIntArray206[local132 + 1];
						for (@Pc(210) int local210 = local201; local210 < local208; local210++) {
							local196 = this.aShortArray37[local210] - 1;
							if (local196 == -1 || this.aByteArray40[local196] != 0) {
								break;
							}
						}
						if (local196 != -1) {
							for (@Pc(245) int local245 = 0; local245 < local21; local245++) {
								if (local24[local245] == local162 && local186 == local30[local245] && local27[local245] == local142) {
									@Pc(272) int local272 = -1;
									local208 = local103[local245 + 1];
									local201 = local103[local245];
									for (@Pc(284) int local284 = local201; local284 < local208; local284++) {
										local272 = local106[local284] - 1;
										if (local272 == -1 || local42[local272] != 0) {
											break;
										}
									}
									if (local272 != -1) {
										if (local49 == null) {
											this.aClass288_1 = new Class288();
											local49 = this.aClass288_1.aShortArray126 = Static9.method54(this.aShortArray29);
											local61 = this.aClass288_1.aShortArray124 = Static9.method54(this.aShortArray33);
											local53 = this.aClass288_1.aShortArray125 = Static9.method54(this.aShortArray41);
											local57 = this.aClass288_1.aByteArray100 = Static50.method1051(this.aByteArray40);
										}
										if (local82 == null) {
											@Pc(365) Class288 local365 = local8.aClass288_1 = new Class288();
											local82 = local365.aShortArray126 = Static9.method54(local33);
											local90 = local365.aShortArray124 = Static9.method54(local36);
											local86 = local365.aShortArray125 = Static9.method54(local39);
											local78 = local365.aByteArray100 = Static50.method1051(local42);
										}
										@Pc(398) short local398 = this.aShortArray29[local196];
										@Pc(403) short local403 = this.aShortArray33[local196];
										@Pc(408) short local408 = this.aShortArray41[local196];
										@Pc(413) byte local413 = this.aByteArray40[local196];
										local208 = local103[local245 + 1];
										local201 = local103[local245];
										@Pc(433) int local433;
										for (@Pc(425) int local425 = local201; local425 < local208; local425++) {
											local433 = local106[local425] - 1;
											if (local433 == -1) {
												break;
											}
											if (local78[local433] != 0) {
												local82[local433] += local398;
												local90[local433] += local403;
												local86[local433] += local408;
												local78[local433] += local413;
											}
										}
										local201 = this.anIntArray206[local132];
										local408 = local39[local272];
										local208 = this.anIntArray206[local132 + 1];
										local413 = local42[local272];
										local398 = local33[local272];
										local403 = local36[local272];
										for (local433 = local201; local433 < local208; local433++) {
											@Pc(520) int local520 = this.aShortArray37[local433] - 1;
											if (local520 == -1) {
												break;
											}
											if (local57[local520] != 0) {
												local49[local520] += local398;
												local61[local520] += local403;
												local53[local520] += local408;
												local57[local520] += local413;
											}
										}
										local8.method2057();
										this.method2057();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean199) {
			this.method2067();
		}
		return this.anInt2370;
	}

	@OriginalMember(owner = "client!eaa", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class32.anIntArray76[arg0];
		@Pc(13) int local13 = Class32.anIntArray77[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2431; local15++) {
			@Pc(34) int local34 = this.anIntArray203[local15] * local9 + local13 * this.anIntArray204[local15] >> 14;
			this.anIntArray203[local15] = this.anIntArray203[local15] * local13 - local9 * this.anIntArray204[local15] >> 14;
			this.anIntArray204[local15] = local34;
		}
		this.method2059();
		this.aBoolean199 = false;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method2060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg2 > arg4 && arg3 > arg4 && arg4 < arg0) {
			return false;
		} else if (arg2 < arg4 && arg4 > arg3 && arg4 > arg0) {
			return false;
		} else if (arg7 < arg1 && arg7 < arg6 && arg5 > arg7) {
			return false;
		} else {
			return arg1 >= arg7 || arg6 >= arg7 || arg7 <= arg5;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZILclient!eaa;ZLclient!eaa;Z)Lclient!ka;")
	private Class80 method2061(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class80_Sub1 arg4) {
		arg2.anInt2418 = this.anInt2418;
		arg2.anInt2435 = arg1;
		arg2.aShort26 = this.aShort26;
		arg2.aBoolean196 = this.aBoolean196;
		arg2.aShort25 = this.aShort25;
		arg2.anInt2385 = this.anInt2385;
		arg2.anInt2428 = this.anInt2428;
		arg2.anInt2431 = this.anInt2431;
		arg2.anInt2419 = this.anInt2419;
		arg2.anInt2389 = this.anInt2389;
		arg2.anInt2412 = this.anInt2412;
		if ((arg1 & 0x100) == 0) {
			arg2.aBoolean200 = this.aBoolean200;
		} else {
			arg2.aBoolean200 = true;
		}
		@Pc(70) boolean local70 = Static504.method7376(this.anInt2418, arg1);
		@Pc(76) boolean local76 = Static563.method8117(arg1, this.anInt2418);
		@Pc(82) boolean local82 = Static313.method7483(this.anInt2418, arg1);
		@Pc(88) boolean local88 = local82 | local70 | local76;
		@Pc(211) int local211;
		if (local88) {
			if (!local70) {
				arg2.anIntArray204 = this.anIntArray204;
			} else if (arg4.anIntArray204 == null || arg4.anIntArray204.length < this.anInt2389) {
				arg2.anIntArray204 = arg4.anIntArray204 = new int[this.anInt2389];
			} else {
				arg2.anIntArray204 = arg4.anIntArray204;
			}
			if (!local76) {
				arg2.anIntArray203 = this.anIntArray203;
			} else if (arg4.anIntArray203 == null || this.anInt2389 > arg4.anIntArray203.length) {
				arg2.anIntArray203 = arg4.anIntArray203 = new int[this.anInt2389];
			} else {
				arg2.anIntArray203 = arg4.anIntArray203;
			}
			if (!local82) {
				arg2.anIntArray208 = this.anIntArray208;
			} else if (arg4.anIntArray208 == null || this.anInt2389 > arg4.anIntArray208.length) {
				arg2.anIntArray208 = arg4.anIntArray208 = new int[this.anInt2389];
			} else {
				arg2.anIntArray208 = arg4.anIntArray208;
			}
			for (local211 = 0; local211 < this.anInt2389; local211++) {
				if (local70) {
					arg2.anIntArray204[local211] = this.anIntArray204[local211];
				}
				if (local76) {
					arg2.anIntArray203[local211] = this.anIntArray203[local211];
				}
				if (local82) {
					arg2.anIntArray208[local211] = this.anIntArray208[local211];
				}
			}
		} else {
			arg2.anIntArray208 = this.anIntArray208;
			arg2.anIntArray203 = this.anIntArray203;
			arg2.anIntArray204 = this.anIntArray204;
		}
		if (Static79.method1488(arg1, this.anInt2418)) {
			arg2.aClass383_1 = arg4.aClass383_1;
			arg2.aClass383_1.aBoolean751 = this.aClass383_1.aBoolean751;
			arg2.aClass383_1.anInterface10_17 = this.aClass383_1.anInterface10_17;
			arg2.aClass383_1.aBoolean753 = true;
		} else if (Static652.method9072(arg1, this.anInt2418)) {
			arg2.aClass383_1 = this.aClass383_1;
		} else {
			arg2.aClass383_1 = null;
		}
		if (Static193.method2994(arg1, this.anInt2418)) {
			if (arg4.aShortArray38 == null || arg4.aShortArray38.length < this.anInt2419) {
				arg2.aShortArray38 = arg4.aShortArray38 = new short[this.anInt2419];
			} else {
				arg2.aShortArray38 = arg4.aShortArray38;
			}
			for (local211 = 0; local211 < this.anInt2419; local211++) {
				arg2.aShortArray38[local211] = this.aShortArray38[local211];
			}
		} else {
			arg2.aShortArray38 = this.aShortArray38;
		}
		if (Static379.method9308(this.anInt2418, arg1)) {
			if (arg4.aByteArray39 == null || arg4.aByteArray39.length < this.anInt2419) {
				arg2.aByteArray39 = arg4.aByteArray39 = new byte[this.anInt2419];
			} else {
				arg2.aByteArray39 = arg4.aByteArray39;
			}
			for (local211 = 0; local211 < this.anInt2419; local211++) {
				arg2.aByteArray39[local211] = this.aByteArray39[local211];
			}
		} else {
			arg2.aByteArray39 = this.aByteArray39;
		}
		if (Static385.method5715(this.anInt2418, arg1)) {
			arg2.aClass383_3 = arg4.aClass383_3;
			arg2.aClass383_3.aBoolean753 = true;
			arg2.aClass383_3.aBoolean751 = this.aClass383_3.aBoolean751;
			arg2.aClass383_3.anInterface10_17 = this.aClass383_3.anInterface10_17;
		} else if (Static447.method8531(this.anInt2418, arg1)) {
			arg2.aClass383_3 = this.aClass383_3;
		} else {
			arg2.aClass383_3 = null;
		}
		@Pc(600) int local600;
		if (Static266.method3896(this.anInt2418, arg1)) {
			if (arg4.aShortArray29 == null || this.anInt2428 > arg4.aShortArray29.length) {
				local211 = this.anInt2428;
				arg2.aShortArray33 = arg4.aShortArray33 = new short[local211];
				arg2.aShortArray29 = arg4.aShortArray29 = new short[local211];
				arg2.aShortArray41 = arg4.aShortArray41 = new short[local211];
			} else {
				arg2.aShortArray41 = arg4.aShortArray41;
				arg2.aShortArray33 = arg4.aShortArray33;
				arg2.aShortArray29 = arg4.aShortArray29;
			}
			if (this.aClass288_1 == null) {
				arg2.aClass288_1 = null;
				for (local211 = 0; local211 < this.anInt2428; local211++) {
					arg2.aShortArray29[local211] = this.aShortArray29[local211];
					arg2.aShortArray33[local211] = this.aShortArray33[local211];
					arg2.aShortArray41[local211] = this.aShortArray41[local211];
				}
			} else {
				if (arg4.aClass288_1 == null) {
					arg4.aClass288_1 = new Class288();
				}
				@Pc(584) Class288 local584 = arg2.aClass288_1 = arg4.aClass288_1;
				if (local584.aShortArray126 == null || local584.aShortArray126.length < this.anInt2428) {
					local600 = this.anInt2428;
					local584.aByteArray100 = new byte[local600];
					local584.aShortArray124 = new short[local600];
					local584.aShortArray125 = new short[local600];
					local584.aShortArray126 = new short[local600];
				}
				for (local600 = 0; local600 < this.anInt2428; local600++) {
					arg2.aShortArray29[local600] = this.aShortArray29[local600];
					arg2.aShortArray33[local600] = this.aShortArray33[local600];
					arg2.aShortArray41[local600] = this.aShortArray41[local600];
					local584.aShortArray126[local600] = this.aClass288_1.aShortArray126[local600];
					local584.aShortArray124[local600] = this.aClass288_1.aShortArray124[local600];
					local584.aShortArray125[local600] = this.aClass288_1.aShortArray125[local600];
					local584.aByteArray100[local600] = this.aClass288_1.aByteArray100[local600];
				}
			}
			arg2.aByteArray40 = this.aByteArray40;
		} else {
			arg2.aShortArray41 = this.aShortArray41;
			arg2.aByteArray40 = this.aByteArray40;
			arg2.aClass288_1 = this.aClass288_1;
			arg2.aShortArray33 = this.aShortArray33;
			arg2.aShortArray29 = this.aShortArray29;
		}
		if (Static212.method3350(arg1, this.anInt2418)) {
			arg2.aClass383_4 = arg4.aClass383_4;
			arg2.aClass383_4.aBoolean751 = this.aClass383_4.aBoolean751;
			arg2.aClass383_4.anInterface10_17 = this.aClass383_4.anInterface10_17;
			arg2.aClass383_4.aBoolean753 = true;
		} else if (Static66.method1324(this.anInt2418, arg1)) {
			arg2.aClass383_4 = this.aClass383_4;
		} else {
			arg2.aClass383_4 = null;
		}
		if (Static317.method5006(arg1, this.anInt2418)) {
			if (arg4.aFloatArray20 == null || arg4.aFloatArray20.length < this.anInt2419) {
				local211 = this.anInt2428;
				arg2.aFloatArray21 = arg4.aFloatArray21 = new float[local211];
				arg2.aFloatArray20 = arg4.aFloatArray20 = new float[local211];
			} else {
				arg2.aFloatArray21 = arg4.aFloatArray21;
				arg2.aFloatArray20 = arg4.aFloatArray20;
			}
			for (local211 = 0; local211 < this.anInt2428; local211++) {
				arg2.aFloatArray20[local211] = this.aFloatArray20[local211];
				arg2.aFloatArray21[local211] = this.aFloatArray21[local211];
			}
		} else {
			arg2.aFloatArray20 = this.aFloatArray20;
			arg2.aFloatArray21 = this.aFloatArray21;
		}
		if (Static271.method3954(arg1, this.anInt2418)) {
			arg2.aClass383_2 = arg4.aClass383_2;
			arg2.aClass383_2.aBoolean753 = true;
			arg2.aClass383_2.aBoolean751 = this.aClass383_2.aBoolean751;
			arg2.aClass383_2.anInterface10_17 = this.aClass383_2.anInterface10_17;
		} else if (Static156.method2526(this.anInt2418, arg1)) {
			arg2.aClass383_2 = this.aClass383_2;
		} else {
			arg2.aClass383_2 = null;
		}
		if (Static595.method8432(arg1, this.anInt2418)) {
			if (arg4.aShortArray30 == null || this.anInt2419 > arg4.aShortArray30.length) {
				local211 = this.anInt2419;
				arg2.aShortArray36 = arg4.aShortArray36 = new short[local211];
				arg2.aShortArray30 = arg4.aShortArray30 = new short[local211];
				arg2.aShortArray31 = arg4.aShortArray31 = new short[local211];
			} else {
				arg2.aShortArray30 = arg4.aShortArray30;
				arg2.aShortArray31 = arg4.aShortArray31;
				arg2.aShortArray36 = arg4.aShortArray36;
			}
			for (local211 = 0; local211 < this.anInt2419; local211++) {
				arg2.aShortArray30[local211] = this.aShortArray30[local211];
				arg2.aShortArray31[local211] = this.aShortArray31[local211];
				arg2.aShortArray36[local211] = this.aShortArray36[local211];
			}
		} else {
			arg2.aShortArray30 = this.aShortArray30;
			arg2.aShortArray36 = this.aShortArray36;
			arg2.aShortArray31 = this.aShortArray31;
		}
		if (Static248.method3657(this.anInt2418, arg1)) {
			arg2.aClass384_1 = arg4.aClass384_1;
			arg2.aClass384_1.anInterface4_8 = this.aClass384_1.anInterface4_8;
			arg2.aClass384_1.aBoolean754 = this.aClass384_1.aBoolean754;
			arg2.aClass384_1.aBoolean755 = true;
		} else if (Static454.method6569(arg1, this.anInt2418)) {
			arg2.aClass384_1 = this.aClass384_1;
		} else {
			arg2.aClass384_1 = null;
		}
		if (Static679.method9324(this.anInt2418, arg1)) {
			if (arg4.aShortArray35 == null || this.anInt2419 > arg4.aShortArray35.length) {
				local211 = this.anInt2419;
				arg2.aShortArray35 = arg4.aShortArray35 = new short[local211];
			} else {
				arg2.aShortArray35 = arg4.aShortArray35;
			}
			for (local211 = 0; local211 < this.anInt2419; local211++) {
				arg2.aShortArray35[local211] = this.aShortArray35[local211];
			}
		} else {
			arg2.aShortArray35 = this.aShortArray35;
		}
		if (!Static42.method930(arg1, this.anInt2418)) {
			arg2.aClass284Array1 = this.aClass284Array1;
		} else if (arg4.aClass284Array1 == null || this.anInt2412 > arg4.aClass284Array1.length) {
			local211 = this.anInt2412;
			arg2.aClass284Array1 = arg4.aClass284Array1 = new Class284[local211];
			for (local600 = 0; local600 < this.anInt2412; local600++) {
				arg2.aClass284Array1[local600] = this.aClass284Array1[local600].method7140();
			}
		} else {
			arg2.aClass284Array1 = arg4.aClass284Array1;
			for (local211 = 0; local211 < this.anInt2412; local211++) {
				arg2.aClass284Array1[local211].method7138(this.aClass284Array1[local211]);
			}
		}
		arg2.anIntArray207 = this.anIntArray207;
		arg2.aShortArray37 = this.aShortArray37;
		arg2.aClass265Array2 = this.aClass265Array2;
		arg2.aShortArray40 = this.aShortArray40;
		arg2.aClass277Array1 = this.aClass277Array1;
		arg2.anIntArrayArray11 = this.anIntArrayArray11;
		arg2.anIntArray206 = this.anIntArray206;
		arg2.anIntArrayArray12 = this.anIntArrayArray12;
		arg2.anIntArray202 = this.anIntArray202;
		arg2.aShortArray39 = this.aShortArray39;
		arg2.anIntArray205 = this.anIntArray205;
		arg2.anIntArrayArray10 = this.anIntArrayArray10;
		arg2.aShortArray32 = this.aShortArray32;
		if (this.aBoolean199) {
			arg2.anInt2426 = this.anInt2426;
			arg2.anInt2404 = this.anInt2404;
			arg2.anInt2370 = this.anInt2370;
			arg2.anInt2398 = this.anInt2398;
			arg2.aBoolean199 = true;
			arg2.anInt2407 = this.anInt2407;
			arg2.anInt2420 = this.anInt2420;
			arg2.anInt2405 = this.anInt2405;
			arg2.anInt2408 = this.anInt2408;
		} else {
			arg2.aBoolean199 = false;
		}
		arg2.aShortArray34 = this.aShortArray34;
		arg2.aClass136Array2 = this.aClass136Array2;
		return arg2;
	}

	@OriginalMember(owner = "client!eaa", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class32.anIntArray76[arg0];
		@Pc(13) int local13 = Class32.anIntArray77[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2431; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray203[local15] - local9 * this.anIntArray208[local15] >> 14;
			this.anIntArray208[local15] = local9 * this.anIntArray203[local15] + this.anIntArray208[local15] * local13 >> 14;
			this.anIntArray203[local15] = local34;
		}
		this.method2059();
		this.aBoolean199 = false;
	}

	@OriginalMember(owner = "client!eaa", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean196;
	}

	@OriginalMember(owner = "client!eaa", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean200;
	}

	@OriginalMember(owner = "client!eaa", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2431; local3++) {
			if (arg0 != 0) {
				this.anIntArray204[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray203[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray208[local3] += arg2;
			}
		}
		this.method2059();
		this.aBoolean199 = false;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6384(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(17) int local17;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg3 << 4;
			local25 = arg2 << 4;
			Static261.anInt4566 = 0;
			local29 = 0;
			Static357.anInt6582 = 0;
			Static28.anInt700 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray11.length) {
					local51 = this.anIntArrayArray11[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static357.anInt6582 += this.anIntArray204[local59];
						Static28.anInt700 += this.anIntArray203[local59];
						Static261.anInt4566 += this.anIntArray208[local59];
						local29++;
					}
				}
			}
			if (local29 <= 0) {
				Static357.anInt6582 = local25;
				Static261.anInt4566 = local17;
				Static28.anInt700 = local21;
			} else {
				Static261.anInt4566 = local17 + Static261.anInt4566 / local29;
				Static28.anInt700 = local21 + Static28.anInt700 / local29;
				Static357.anInt6582 = local25 + Static357.anInt6582 / local29;
			}
			return;
		}
		@Pc(162) int[] local162;
		@Pc(164) int local164;
		if (arg0 == 1) {
			local21 = arg3 << 4;
			local25 = arg2 << 4;
			local17 = arg4 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray11.length) {
					local162 = this.anIntArrayArray11[local35];
					for (local164 = 0; local164 < local162.length; local164++) {
						local53 = local162[local164];
						this.anIntArray204[local53] += local25;
						this.anIntArray203[local53] += local21;
						this.anIntArray208[local53] += local17;
					}
				}
			}
			return;
		}
		@Pc(288) int local288;
		@Pc(307) int local307;
		@Pc(763) int local763;
		@Pc(772) int local772;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray11.length > local35) {
					local162 = this.anIntArrayArray11[local35];
					if ((arg5 & 0x1) == 0) {
						for (local164 = 0; local164 < local162.length; local164++) {
							local53 = local162[local164];
							this.anIntArray204[local53] -= Static357.anInt6582;
							this.anIntArray203[local53] -= Static28.anInt700;
							this.anIntArray208[local53] -= Static261.anInt4566;
							if (arg4 != 0) {
								local59 = Class32.anIntArray76[arg4];
								local288 = Class32.anIntArray77[arg4];
								local307 = this.anIntArray204[local53] * local288 + this.anIntArray203[local53] * local59 + 16383 >> 14;
								this.anIntArray203[local53] = this.anIntArray203[local53] * local288 + 16383 - local59 * this.anIntArray204[local53] >> 14;
								this.anIntArray204[local53] = local307;
							}
							if (arg2 != 0) {
								local59 = Class32.anIntArray76[arg2];
								local288 = Class32.anIntArray77[arg2];
								local307 = local288 * this.anIntArray203[local53] + 16383 - this.anIntArray208[local53] * local59 >> 14;
								this.anIntArray208[local53] = local288 * this.anIntArray208[local53] + this.anIntArray203[local53] * local59 + 16383 >> 14;
								this.anIntArray203[local53] = local307;
							}
							if (arg3 != 0) {
								local59 = Class32.anIntArray76[arg3];
								local288 = Class32.anIntArray77[arg3];
								local307 = local59 * this.anIntArray208[local53] + this.anIntArray204[local53] * local288 + 16383 >> 14;
								this.anIntArray208[local53] = this.anIntArray208[local53] * local288 + 16383 - local59 * this.anIntArray204[local53] >> 14;
								this.anIntArray204[local53] = local307;
							}
							this.anIntArray204[local53] += Static357.anInt6582;
							this.anIntArray203[local53] += Static28.anInt700;
							this.anIntArray208[local53] += Static261.anInt4566;
						}
					} else {
						for (local164 = 0; local164 < local162.length; local164++) {
							local53 = local162[local164];
							this.anIntArray204[local53] -= Static357.anInt6582;
							this.anIntArray203[local53] -= Static28.anInt700;
							this.anIntArray208[local53] -= Static261.anInt4566;
							if (arg2 != 0) {
								local59 = Class32.anIntArray76[arg2];
								local288 = Class32.anIntArray77[arg2];
								local307 = local288 * this.anIntArray203[local53] + 16383 - this.anIntArray208[local53] * local59 >> 14;
								this.anIntArray208[local53] = local59 * this.anIntArray203[local53] + this.anIntArray208[local53] * local288 + 16383 >> 14;
								this.anIntArray203[local53] = local307;
							}
							if (arg4 != 0) {
								local59 = Class32.anIntArray76[arg4];
								local288 = Class32.anIntArray77[arg4];
								local307 = this.anIntArray203[local53] * local59 + local288 * this.anIntArray204[local53] + 16383 >> 14;
								this.anIntArray203[local53] = this.anIntArray203[local53] * local288 + 16383 - local59 * this.anIntArray204[local53] >> 14;
								this.anIntArray204[local53] = local307;
							}
							if (arg3 != 0) {
								local59 = Class32.anIntArray76[arg3];
								local288 = Class32.anIntArray77[arg3];
								local307 = this.anIntArray204[local53] * local288 + this.anIntArray208[local53] * local59 + 16383 >> 14;
								this.anIntArray208[local53] = this.anIntArray208[local53] * local288 + 16383 - local59 * this.anIntArray204[local53] >> 14;
								this.anIntArray204[local53] = local307;
							}
							this.anIntArray204[local53] += Static357.anInt6582;
							this.anIntArray203[local53] += Static28.anInt700;
							this.anIntArray208[local53] += Static261.anInt4566;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray11.length) {
						local51 = this.anIntArrayArray11[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local288 = this.anIntArray206[local59];
							local307 = this.anIntArray206[local59 + 1];
							for (local763 = local288; local763 < local307; local763++) {
								local772 = this.aShortArray37[local763] - 1;
								if (local772 == -1) {
									break;
								}
								@Pc(785) int local785;
								@Pc(789) int local789;
								@Pc(807) int local807;
								if (arg4 != 0) {
									local785 = Class32.anIntArray76[arg4];
									local789 = Class32.anIntArray77[arg4];
									local807 = this.aShortArray33[local772] * local785 + local789 * this.aShortArray29[local772] + 16383 >> 14;
									this.aShortArray33[local772] = (short) (this.aShortArray33[local772] * local789 + 16383 - this.aShortArray29[local772] * local785 >> 14);
									this.aShortArray29[local772] = (short) local807;
								}
								if (arg2 != 0) {
									local785 = Class32.anIntArray76[arg2];
									local789 = Class32.anIntArray77[arg2];
									local807 = local789 * this.aShortArray33[local772] + 16383 - local785 * this.aShortArray41[local772] >> 14;
									this.aShortArray41[local772] = (short) (local789 * this.aShortArray41[local772] + local785 * this.aShortArray33[local772] + 16383 >> 14);
									this.aShortArray33[local772] = (short) local807;
								}
								if (arg3 != 0) {
									local785 = Class32.anIntArray76[arg3];
									local789 = Class32.anIntArray77[arg3];
									local807 = local785 * this.aShortArray41[local772] + this.aShortArray29[local772] * local789 + 16383 >> 14;
									this.aShortArray41[local772] = (short) (this.aShortArray41[local772] * local789 + 16383 - local785 * this.aShortArray29[local772] >> 14);
									this.aShortArray29[local772] = (short) local807;
								}
							}
						}
					}
				}
				this.method2057();
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray11.length > local35) {
					local162 = this.anIntArrayArray11[local35];
					for (local164 = 0; local164 < local162.length; local164++) {
						local53 = local162[local164];
						this.anIntArray204[local53] -= Static357.anInt6582;
						this.anIntArray203[local53] -= Static28.anInt700;
						this.anIntArray208[local53] -= Static261.anInt4566;
						this.anIntArray204[local53] = this.anIntArray204[local53] * arg2 >> 7;
						this.anIntArray203[local53] = this.anIntArray203[local53] * arg3 >> 7;
						this.anIntArray208[local53] = arg4 * this.anIntArray208[local53] >> 7;
						this.anIntArray204[local53] += Static357.anInt6582;
						this.anIntArray203[local53] += Static28.anInt700;
						this.anIntArray208[local53] += Static261.anInt4566;
					}
				}
			}
		} else {
			@Pc(1211) Class284 local1211;
			@Pc(1113) boolean local1113;
			@Pc(1206) Class277 local1206;
			if (arg0 == 5) {
				if (this.anIntArrayArray10 != null) {
					local1113 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray10.length) {
							local51 = this.anIntArrayArray10[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local288 = arg2 * 8 + (this.aByteArray39[local59] & 0xFF);
								if (local288 < 0) {
									local288 = 0;
								} else if (local288 > 255) {
									local288 = 255;
								}
								this.aByteArray39[local59] = (byte) local288;
							}
							local1113 |= local51.length > 0;
						}
					}
					if (local1113) {
						if (this.aClass277Array1 != null) {
							for (local41 = 0; local41 < this.anInt2412; local41++) {
								local1206 = this.aClass277Array1[local41];
								local1211 = this.aClass284Array1[local41];
								local1211.anInt8654 = local1211.anInt8654 & 0xFFFFFF | 255 - (this.aByteArray39[local1206.anInt7977] & 0xFF) << 24;
							}
						}
						this.method2058();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray10 != null) {
					local1113 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray10.length > local41) {
							local51 = this.anIntArrayArray10[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local288 = this.aShortArray38[local59] & 0xFFFF;
								local307 = local288 >> 10 & 0x3F;
								local763 = local288 >> 7 & 0x7;
								local772 = local288 & 0x7F;
								@Pc(1310) int local1310 = arg2 + local307 & 0x3F;
								local763 += arg3 / 4;
								if (local763 < 0) {
									local763 = 0;
								} else if (local763 > 7) {
									local763 = 7;
								}
								local772 += arg4;
								if (local772 < 0) {
									local772 = 0;
								} else if (local772 > 127) {
									local772 = 127;
								}
								this.aShortArray38[local59] = (short) (local763 << 7 | local1310 << 10 | local772);
							}
							local1113 |= local51.length > 0;
						}
					}
					if (local1113) {
						if (this.aClass277Array1 != null) {
							for (local41 = 0; local41 < this.anInt2412; local41++) {
								local1206 = this.aClass277Array1[local41];
								local1211 = this.aClass284Array1[local41];
								local1211.anInt8654 = Static659.anIntArray816[this.aShortArray38[local1206.anInt7977] & 0xFFFF] & 0xFFFFFF | local1211.anInt8654 & 0xFF000000;
							}
						}
						this.method2058();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray12 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray12.length > local35) {
							local162 = this.anIntArrayArray12[local35];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1211 = this.aClass284Array1[local162[local164]];
								local1211.anInt8651 += arg3;
								local1211.anInt8655 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray12 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray12.length) {
							local162 = this.anIntArrayArray12[local35];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1211 = this.aClass284Array1[local162[local164]];
								local1211.anInt8650 = arg2 * local1211.anInt8650 >> 7;
								local1211.anInt8652 = arg3 * local1211.anInt8652 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray12 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray12.length > local35) {
						local162 = this.anIntArrayArray12[local35];
						for (local164 = 0; local164 < local162.length; local164++) {
							local1211 = this.aClass284Array1[local162[local164]];
							local1211.anInt8649 = local1211.anInt8649 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "(I)V")
	private void method2062() {
		if (this.anInt2385 == 0) {
			return;
		}
		if (this.method2064() && this.method2065()) {
			this.aClass137_Sub1_4.method8067(0, this.aClass383_1.anInterface10_17);
			this.aClass137_Sub1_4.method8067(1, this.aClass383_3.anInterface10_17);
			this.aClass137_Sub1_4.method8067(2, this.aClass383_2.anInterface10_17);
			@Pc(57) boolean local57;
			if ((this.anInt2418 & 0x37) == 0) {
				local57 = false;
				this.aClass137_Sub1_4.method8077(false);
				this.aClass137_Sub1_4.method8000(this.aClass137_Sub1_4.aClass201_17);
			} else {
				local57 = true;
				this.aClass137_Sub1_4.method8077(true);
				this.aClass137_Sub1_4.method8067(3, this.aClass383_4.anInterface10_17);
				this.aClass137_Sub1_4.method8000(this.aClass137_Sub1_4.aClass201_21);
			}
			for (@Pc(95) int local95 = 0; local95 < this.anIntArray207.length; local95++) {
				@Pc(102) int local102 = this.anIntArray205[local95];
				@Pc(109) int local109 = this.anIntArray205[local95 + 1];
				@Pc(116) int local116 = this.aShortArray35[local102] & 0xFFFF;
				if (local116 == 65535) {
					local116 = -1;
				}
				this.aClass137_Sub1_4.method7962(local57, local116, true);
				this.aClass137_Sub1_4.method7980(local109 - local102, this.aClass384_1.anInterface4_8, this.anIntArray207[local95], local102 * 3, this.anIntArray202[local95], Static620.aClass54_6);
			}
		}
		this.method2066();
	}

	@OriginalMember(owner = "client!eaa", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean199) {
			this.method2067();
		}
		return this.anInt2420;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IILclient!qja;ZII)Z")
	@Override
	public boolean method6386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method2063(arg1, arg0, arg4, arg3, arg2, arg5);
	}

	@OriginalMember(owner = "client!eaa", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean199) {
			this.method2067();
		}
		return this.anInt2426;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIIZLclient!qja;BI)Z")
	private boolean method2063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class26_Sub1 local8 = (Class26_Sub1) arg4;
		@Pc(12) Class26_Sub1 local12 = this.aClass137_Sub1_4.aClass26_Sub1_16;
		@Pc(42) float local42 = local12.aFloat23 + local8.aFloat25 * local12.aFloat19 + local12.aFloat29 * local8.aFloat23 + local12.aFloat26 * local8.aFloat18;
		@Pc(63) float local63 = local8.aFloat18 * local12.aFloat24 + local8.aFloat23 * local12.aFloat22 + local12.aFloat27 * local8.aFloat25 + local12.aFloat18;
		Static655.aFloat267 = local8.aFloat26 * local12.aFloat29 + local12.aFloat26 * local8.aFloat24 + local8.aFloat28 * local12.aFloat19;
		Static143.aFloat61 = local8.aFloat21 * local12.aFloat19 + local12.aFloat29 * local8.aFloat19 + local12.aFloat26 * local8.aFloat27;
		@Pc(120) float local120 = local12.aFloat20 * local8.aFloat23 + local8.aFloat18 * local12.aFloat28 + local12.aFloat21 * local8.aFloat25 + local12.aFloat25;
		Static298.aFloat106 = local8.aFloat19 * local12.aFloat20 + local12.aFloat28 * local8.aFloat27 + local8.aFloat21 * local12.aFloat21;
		Static386.aFloat162 = local12.aFloat21 * local8.aFloat20 + local12.aFloat20 * local8.aFloat29 + local8.aFloat22 * local12.aFloat28;
		Static294.aFloat105 = local8.aFloat28 * local12.aFloat21 + local8.aFloat24 * local12.aFloat28 + local12.aFloat20 * local8.aFloat26;
		Static55.aFloat33 = local8.aFloat22 * local12.aFloat24 + local12.aFloat22 * local8.aFloat29 + local12.aFloat27 * local8.aFloat20;
		Static453.aFloat183 = local8.aFloat21 * local12.aFloat27 + local12.aFloat24 * local8.aFloat27 + local12.aFloat22 * local8.aFloat19;
		Static89.aFloat54 = local8.aFloat22 * local12.aFloat26 + local8.aFloat29 * local12.aFloat29 + local12.aFloat19 * local8.aFloat20;
		Static202.aFloat77 = local12.aFloat27 * local8.aFloat28 + local8.aFloat24 * local12.aFloat24 + local12.aFloat22 * local8.aFloat26;
		@Pc(248) boolean local248 = false;
		@Pc(250) float local250 = Float.MAX_VALUE;
		@Pc(252) float local252 = -3.4028235E38F;
		@Pc(254) float local254 = Float.MAX_VALUE;
		@Pc(256) float local256 = -3.4028235E38F;
		@Pc(260) int local260 = this.aClass137_Sub1_4.anInt9742;
		@Pc(264) int local264 = this.aClass137_Sub1_4.anInt9735;
		if (!this.aBoolean199) {
			this.method2067();
		}
		@Pc(279) int local279 = this.anInt2407 - this.anInt2398 >> 1;
		@Pc(288) int local288 = this.anInt2404 - this.anInt2405 >> 1;
		@Pc(297) int local297 = this.anInt2408 - this.anInt2420 >> 1;
		@Pc(302) int local302 = local279 + this.anInt2398;
		@Pc(307) int local307 = local288 + this.anInt2405;
		@Pc(313) int local313 = this.anInt2420 + local297;
		@Pc(319) int local319 = local302 - (local279 << arg2);
		@Pc(326) int local326 = local307 - (local288 << arg2);
		@Pc(333) int local333 = local313 - (local297 << arg2);
		@Pc(339) int local339 = local302 + (local279 << arg2);
		@Pc(345) int local345 = (local288 << arg2) + local307;
		Static323.anIntArray446[0] = local319;
		@Pc(355) int local355 = (local297 << arg2) + local313;
		Static656.anIntArray815[0] = local326;
		Static323.anIntArray446[1] = local339;
		Static70.anIntArray118[0] = local333;
		Static656.anIntArray815[1] = local326;
		Static323.anIntArray446[2] = local319;
		Static70.anIntArray118[1] = local333;
		Static656.anIntArray815[2] = local345;
		Static70.anIntArray118[2] = local333;
		Static323.anIntArray446[3] = local339;
		Static656.anIntArray815[3] = local345;
		Static323.anIntArray446[4] = local319;
		Static70.anIntArray118[3] = local333;
		Static656.anIntArray815[4] = local326;
		Static70.anIntArray118[4] = local355;
		Static323.anIntArray446[5] = local339;
		Static656.anIntArray815[5] = local326;
		Static70.anIntArray118[5] = local355;
		Static323.anIntArray446[6] = local319;
		Static656.anIntArray815[6] = local345;
		Static70.anIntArray118[6] = local355;
		Static323.anIntArray446[7] = local339;
		Static656.anIntArray815[7] = local345;
		Static70.anIntArray118[7] = local355;
		@Pc(480) float local480;
		@Pc(508) float local508;
		@Pc(494) float local494;
		@Pc(456) float local456;
		@Pc(461) float local461;
		@Pc(466) float local466;
		for (@Pc(449) int local449 = 0; local449 < 8; local449++) {
			local456 = (float) Static323.anIntArray446[local449];
			local461 = (float) Static656.anIntArray815[local449];
			local466 = (float) Static70.anIntArray118[local449];
			local480 = local42 + local456 * Static89.aFloat54 + Static655.aFloat267 * local461 + local466 * Static143.aFloat61;
			local494 = Static298.aFloat106 * local466 + local456 * Static386.aFloat162 + Static294.aFloat105 * local461 + local120;
			local508 = local63 + Static453.aFloat183 * local466 + local456 * Static55.aFloat33 + local461 * Static202.aFloat77;
			if (local494 >= (float) this.aClass137_Sub1_4.anInt9737) {
				if (arg5 > 0) {
					local494 = (float) arg5;
				}
				@Pc(535) float local535 = (float) local260 * local480 / local494 + (float) this.aClass137_Sub1_4.anInt9712;
				@Pc(547) float local547 = (float) this.aClass137_Sub1_4.anInt9715 + local508 * (float) local264 / local494;
				if (local252 < local535) {
					local252 = local535;
				}
				if (local250 > local535) {
					local250 = local535;
				}
				if (local254 > local547) {
					local254 = local547;
				}
				if (local547 > local256) {
					local256 = local547;
				}
				local248 = true;
			}
		}
		if (local248 && (float) arg1 > local250 && local252 > (float) arg1 && (float) arg0 > local254 && (float) arg0 < local256) {
			if (arg3) {
				return true;
			}
			if (this.anInt2428 > Static350.anIntArray116.length) {
				Static350.anIntArray116 = new int[this.anInt2428];
				Static376.anIntArray506 = new int[this.anInt2428];
			}
			@Pc(714) int local714;
			for (@Pc(624) int local624 = 0; local624 < this.anInt2431; local624++) {
				local456 = (float) this.anIntArray204[local624];
				local461 = (float) this.anIntArray203[local624];
				local466 = (float) this.anIntArray208[local624];
				local508 = local461 * Static202.aFloat77 + local456 * Static55.aFloat33 + local466 * Static453.aFloat183 + local63;
				local480 = local42 + local466 * Static143.aFloat61 + local456 * Static89.aFloat54 + Static655.aFloat267 * local461;
				local494 = local466 * Static298.aFloat106 + local456 * Static386.aFloat162 + Static294.aFloat105 * local461 + local120;
				@Pc(727) int local727;
				@Pc(732) int local732;
				@Pc(739) int local739;
				if ((float) this.aClass137_Sub1_4.anInt9737 <= local494) {
					if (arg5 > 0) {
						local494 = (float) arg5;
					}
					local714 = (int) ((float) this.aClass137_Sub1_4.anInt9712 + (float) local260 * local480 / local494);
					local727 = (int) ((float) local264 * local508 / local494 + (float) this.aClass137_Sub1_4.anInt9715);
					local732 = this.anIntArray206[local624];
					local739 = this.anIntArray206[local624 + 1];
					for (@Pc(741) int local741 = local732; local741 < local739; local741++) {
						@Pc(750) int local750 = this.aShortArray37[local741] - 1;
						if (local750 == -1) {
							break;
						}
						Static350.anIntArray116[local750] = local714;
						Static376.anIntArray506[local750] = local727;
					}
				} else {
					local714 = this.anIntArray206[local624];
					local727 = this.anIntArray206[local624 + 1];
					for (local732 = local714; local732 < local727; local732++) {
						local739 = this.aShortArray37[local732] - 1;
						if (local739 == -1) {
							break;
						}
						Static350.anIntArray116[this.aShortArray37[local732] - 1] = -999999;
					}
				}
			}
			for (local714 = 0; local714 < this.anInt2419; local714++) {
				if (Static350.anIntArray116[this.aShortArray30[local714]] != -999999 && Static350.anIntArray116[this.aShortArray31[local714]] != -999999 && Static350.anIntArray116[this.aShortArray36[local714]] != -999999 && this.method2060(Static376.anIntArray506[this.aShortArray36[local714]], Static350.anIntArray116[this.aShortArray30[local714]], Static376.anIntArray506[this.aShortArray30[local714]], Static376.anIntArray506[this.aShortArray31[local714]], arg0, Static350.anIntArray116[this.aShortArray36[local714]], Static350.anIntArray116[this.aShortArray31[local714]], arg1)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "(I)Z")
	private boolean method2064() {
		@Pc(25) boolean local25 = !this.aClass383_3.aBoolean751;
		@Pc(41) boolean local41 = (this.anInt2418 & 0x37) != 0 && !this.aClass383_4.aBoolean751;
		@Pc(49) boolean local49 = !this.aClass383_1.aBoolean751;
		@Pc(57) boolean local57 = !this.aClass383_2.aBoolean751;
		if (!local49 && !local25 && !local41 && !local57) {
			return true;
		}
		@Pc(69) boolean local69 = true;
		@Pc(88) Interface10 local88;
		@Pc(102) Buffer local102;
		if (local49) {
			if (this.aClass383_1.anInterface10_18 == null) {
				this.aClass383_1.anInterface10_18 = this.aClass137_Sub1_4.method7963(this.aBoolean197);
			}
			local88 = this.aClass383_1.anInterface10_18;
			local88.method3994(this.anInt2428 * 12, 12);
			local102 = local88.method3996();
			if (local102 == null) {
				local69 = false;
			} else {
				this.aClass137_Sub1_4.aNativeInterface3.copyPositions(this.anIntArray204, this.anIntArray203, this.anIntArray208, this.aShortArray39, 0, 12, this.anInt2428, local102.getAddress());
				if (local88.method3995()) {
					this.aClass383_1.anInterface10_17 = local88;
					this.aClass383_1.aBoolean751 = true;
				} else {
					local69 = false;
				}
			}
		}
		@Pc(195) short[] local195;
		@Pc(201) short[] local201;
		@Pc(198) short[] local198;
		@Pc(204) byte[] local204;
		if (local25) {
			if (this.aClass383_3.anInterface10_18 == null) {
				this.aClass383_3.anInterface10_18 = this.aClass137_Sub1_4.method7963(this.aBoolean197);
			}
			local88 = this.aClass383_3.anInterface10_18;
			local88.method3994(this.anInt2428 * 4, 4);
			local102 = local88.method3996();
			if (local102 == null) {
				local69 = false;
			} else {
				if ((this.anInt2418 & 0x37) == 0) {
					if (this.aClass288_1 == null) {
						local195 = this.aShortArray29;
						local198 = this.aShortArray41;
						local201 = this.aShortArray33;
						local204 = this.aByteArray40;
					} else {
						local195 = this.aClass288_1.aShortArray126;
						local201 = this.aClass288_1.aShortArray124;
						local198 = this.aClass288_1.aShortArray125;
						local204 = this.aClass288_1.aByteArray100;
					}
					this.aClass137_Sub1_4.aNativeInterface3.copyLighting(this.aShortArray38, this.aByteArray39, this.aShortArray35, local195, local201, local198, local204, this.aShort26, this.aShort25, this.aShortArray34, 0, 4, this.anInt2428, local102.getAddress());
				} else {
					this.aClass137_Sub1_4.aNativeInterface3.copyColours(this.aShortArray38, this.aByteArray39, this.aShortArray35, this.aShort26, this.aShortArray34, 0, 4, this.anInt2428, local102.getAddress());
				}
				if (local88.method3995()) {
					this.aClass383_3.anInterface10_17 = local88;
					this.aClass383_3.aBoolean751 = true;
				} else {
					local69 = false;
				}
			}
		}
		if (local41) {
			if (this.aClass383_4.anInterface10_18 == null) {
				this.aClass383_4.anInterface10_18 = this.aClass137_Sub1_4.method7963(this.aBoolean197);
			}
			local88 = this.aClass383_4.anInterface10_18;
			local88.method3994(this.anInt2428 * 12, 12);
			local102 = local88.method3996();
			if (local102 == null) {
				local69 = false;
			} else {
				if (this.aClass288_1 == null) {
					local195 = this.aShortArray29;
					local204 = this.aByteArray40;
					local198 = this.aShortArray41;
					local201 = this.aShortArray33;
				} else {
					local204 = this.aClass288_1.aByteArray100;
					local201 = this.aClass288_1.aShortArray124;
					local198 = this.aClass288_1.aShortArray125;
					local195 = this.aClass288_1.aShortArray126;
				}
				this.aClass137_Sub1_4.aNativeInterface3.copyNormals(local195, local201, local198, local204, 3.0F / (float) this.aShort25, 3.0F / (float) (this.aShort25 + this.aShort25 / 2), 0, 12, this.anInt2428, local102.getAddress());
				if (local88.method3995()) {
					this.aClass383_4.anInterface10_17 = local88;
					this.aClass383_4.aBoolean751 = true;
				} else {
					local69 = false;
				}
			}
		}
		if (local57) {
			if (this.aClass383_2.anInterface10_18 == null) {
				this.aClass383_2.anInterface10_18 = this.aClass137_Sub1_4.method7963(this.aBoolean197);
			}
			local88 = this.aClass383_2.anInterface10_18;
			local88.method3994(this.anInt2428 * 8, 8);
			local102 = local88.method3996();
			if (local102 == null) {
				local69 = false;
			} else {
				this.aClass137_Sub1_4.aNativeInterface3.copyTexCoords(this.aFloatArray20, this.aFloatArray21, 0, 8, this.anInt2428, local102.getAddress());
				if (local88.method3995()) {
					this.aClass383_2.aBoolean751 = true;
					this.aClass383_2.anInterface10_17 = local88;
				} else {
					local69 = false;
				}
			}
		}
		return local69;
	}

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "(I)Z")
	private boolean method2065() {
		if (this.aClass384_1.aBoolean754) {
			return true;
		}
		if (this.aClass384_1.anInterface4_7 == null) {
			this.aClass384_1.anInterface4_7 = this.aClass137_Sub1_4.method8073(this.aBoolean197);
		}
		@Pc(28) Interface4 local28 = this.aClass384_1.anInterface4_7;
		local28.method5678(this.anInt2385 * 6);
		@Pc(40) Buffer local40 = local28.method5680();
		if (local40 != null) {
			@Pc(50) Stream local50 = this.aClass137_Sub1_4.method8079(local40);
			@Pc(54) int local54;
			if (Stream.c()) {
				for (local54 = 0; local54 < this.anInt2385; local54++) {
					local50.a(this.aShortArray30[local54]);
					local50.a(this.aShortArray31[local54]);
					local50.a(this.aShortArray36[local54]);
				}
			} else {
				for (local54 = 0; local54 < this.anInt2385; local54++) {
					local50.e(this.aShortArray30[local54]);
					local50.e(this.aShortArray31[local54]);
					local50.e(this.aShortArray36[local54]);
				}
			}
			local50.b();
			if (local28.method5682()) {
				this.aClass384_1.anInterface4_8 = local28;
				this.aBoolean198 = true;
				this.aClass384_1.aBoolean754 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "()[Lclient!oq;")
	@Override
	public Class265[] method6372() {
		return this.aClass265Array2;
	}

	@OriginalMember(owner = "client!eaa", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt2435;
	}

	@OriginalMember(owner = "client!eaa", name = "g", descriptor = "(I)V")
	private void method2066() {
		if (!this.aBoolean198) {
			return;
		}
		this.aBoolean198 = false;
		if (this.aClass136Array2 == null && this.aClass265Array2 == null && this.aClass277Array1 == null && !Static547.method7708(this.anInt2435, this.anInt2418)) {
			@Pc(34) boolean local34 = false;
			@Pc(36) boolean local36 = false;
			if (this.anIntArray204 != null && !Static221.method6304(this.anInt2418, this.anInt2435)) {
				if (this.aClass383_1 == null || this.aClass383_1.method9128()) {
					local34 = true;
					if (!this.aBoolean199) {
						this.method2067();
					}
				} else {
					this.aBoolean198 = true;
				}
			}
			@Pc(69) boolean local69 = false;
			if (this.anIntArray203 != null && !Static40.method1457(this.anInt2418, this.anInt2435)) {
				if (this.aClass383_1 == null || this.aClass383_1.method9128()) {
					local36 = true;
					if (!this.aBoolean199) {
						this.method2067();
					}
				} else {
					this.aBoolean198 = true;
				}
			}
			if (this.anIntArray208 != null && !Static637.method8888(this.anInt2435, this.anInt2418)) {
				if (this.aClass383_1 == null || this.aClass383_1.method9128()) {
					local69 = true;
					if (!this.aBoolean199) {
						this.method2067();
					}
				} else {
					this.aBoolean198 = true;
				}
			}
			if (local36) {
				this.anIntArray203 = null;
			}
			if (local34) {
				this.anIntArray204 = null;
			}
			if (local69) {
				this.anIntArray208 = null;
			}
		}
		if (this.aShortArray37 != null && this.anIntArray204 == null && this.anIntArray203 == null && this.anIntArray208 == null) {
			this.anIntArray206 = null;
			this.aShortArray37 = null;
		}
		if (this.aByteArray40 != null && !Static542.method7656(this.anInt2418, this.anInt2435)) {
			label201: {
				label200: {
					@Pc(191) boolean local191;
					if ((this.anInt2418 & 0x37) == 0) {
						if (this.aClass383_3 == null || this.aClass383_3.method9128()) {
							break label200;
						}
						local191 = false;
					} else {
						if (this.aClass383_4 == null || this.aClass383_4.method9128()) {
							break label200;
						}
						local191 = false;
					}
					if (!local191) {
						this.aBoolean198 = true;
						break label201;
					}
				}
				this.aByteArray40 = null;
				this.aShortArray29 = this.aShortArray33 = this.aShortArray41 = null;
			}
		}
		if (this.aShortArray38 != null && !Static558.method7844(this.anInt2435, this.anInt2418)) {
			if (this.aClass383_3 == null || this.aClass383_3.method9128()) {
				this.aShortArray38 = null;
			} else {
				this.aBoolean198 = true;
			}
		}
		if (this.aByteArray39 != null && !Static487.method7824(this.anInt2435, this.anInt2418)) {
			if (this.aClass383_3 == null || this.aClass383_3.method9128()) {
				this.aByteArray39 = null;
			} else {
				this.aBoolean198 = true;
			}
		}
		if (this.aFloatArray20 != null && !Static287.method4094(this.anInt2418, this.anInt2435)) {
			if (this.aClass383_2 == null || this.aClass383_2.method9128()) {
				this.aFloatArray20 = this.aFloatArray21 = null;
			} else {
				this.aBoolean198 = true;
			}
		}
		if (this.aShortArray35 != null && !Static319.method5060(this.anInt2418, this.anInt2435)) {
			if (this.aClass383_3 == null || this.aClass383_3.method9128()) {
				this.aShortArray35 = null;
			} else {
				this.aBoolean198 = true;
			}
		}
		if (this.aShortArray30 != null && !Static583.method8331(this.anInt2418, this.anInt2435)) {
			if ((this.aClass384_1 == null || this.aClass384_1.method9131()) && (this.aClass383_3 == null || this.aClass383_3.method9128())) {
				this.aShortArray30 = this.aShortArray31 = this.aShortArray36 = null;
			} else {
				this.aBoolean198 = true;
			}
		}
		if (this.aShortArray39 != null) {
			if (this.aClass383_1 == null || this.aClass383_1.method9128()) {
				this.aShortArray39 = null;
			} else {
				this.aBoolean198 = true;
			}
		}
		if (this.aShortArray34 != null) {
			if (this.aClass383_3 == null || this.aClass383_3.method9128()) {
				this.aShortArray34 = null;
			} else {
				this.aBoolean198 = true;
			}
		}
		if (this.anIntArrayArray10 != null && !Static366.method5521(this.anInt2435, this.anInt2418)) {
			this.anIntArrayArray10 = null;
			this.aShortArray40 = null;
		}
		if (this.anIntArrayArray11 != null && !Static406.method6037(this.anInt2435, this.anInt2418)) {
			this.aShortArray32 = null;
			this.anIntArrayArray11 = null;
		}
		if (this.anIntArrayArray12 != null && !Static233.method3544(this.anInt2435, this.anInt2418)) {
			this.anIntArrayArray12 = null;
		}
		if (this.anIntArray205 != null && (this.anInt2435 & 0x800) == 0 && (this.anInt2435 & 0x40000) == 0) {
			this.anIntArray205 = null;
			this.anIntArray207 = null;
			this.anIntArray202 = null;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "h", descriptor = "(I)V")
	private void method2067() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2431; local23++) {
			@Pc(30) int local30 = this.anIntArray204[local23];
			@Pc(35) int local35 = this.anIntArray203[local23];
			if (local35 < local9) {
				local9 = local35;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			if (local35 > local15) {
				local15 = local35;
			}
			@Pc(63) int local63 = this.anIntArray208[local23];
			if (local13 < local30) {
				local13 = local30;
			}
			if (local63 < local11) {
				local11 = local63;
			}
			if (local17 < local63) {
				local17 = local63;
			}
			@Pc(90) int local90 = local63 * local63 + local30 * local30;
			if (local19 < local90) {
				local19 = local90;
			}
			local90 = local35 * local35 + local63 * local63 + local30 * local30;
			if (local90 > local21) {
				local21 = local90;
			}
		}
		this.anInt2404 = local15;
		this.anInt2405 = local9;
		this.anInt2420 = local11;
		this.anInt2408 = local17;
		this.anInt2398 = local7;
		this.anInt2407 = local13;
		this.anInt2370 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt2426 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean199 = true;
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(B)V")
	private void method2068() {
		if (this.aClass384_1 != null) {
			this.aClass384_1.aBoolean754 = false;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static357.anInt6582 = 0;
			Static28.anInt700 = 0;
			Static261.anInt4566 = 0;
			local18 = 0;
			for (local20 = 0; local20 < this.anInt2431; local20++) {
				Static357.anInt6582 += this.anIntArray204[local20];
				Static28.anInt700 += this.anIntArray203[local20];
				Static261.anInt4566 += this.anIntArray208[local20];
				local18++;
			}
			if (local18 > 0) {
				Static357.anInt6582 = arg1 + Static357.anInt6582 / local18;
				Static261.anInt4566 = arg3 + Static261.anInt4566 / local18;
				Static28.anInt700 = Static28.anInt700 / local18 + arg2;
			} else {
				Static357.anInt6582 = arg1;
				Static261.anInt4566 = arg3;
				Static28.anInt700 = arg2;
			}
		} else if (arg0 == 1) {
			for (local18 = 0; local18 < this.anInt2431; local18++) {
				this.anIntArray204[local18] += arg1;
				this.anIntArray203[local18] += arg2;
				this.anIntArray208[local18] += arg3;
			}
		} else {
			@Pc(166) int local166;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local18 = 0; local18 < this.anInt2431; local18++) {
					this.anIntArray204[local18] -= Static357.anInt6582;
					this.anIntArray203[local18] -= Static28.anInt700;
					this.anIntArray208[local18] -= Static261.anInt4566;
					if (arg3 != 0) {
						local20 = Class32.anIntArray76[arg3];
						local166 = Class32.anIntArray77[arg3];
						local185 = local20 * this.anIntArray203[local18] + this.anIntArray204[local18] * local166 + 16383 >> 14;
						this.anIntArray203[local18] = local166 * this.anIntArray203[local18] + 16383 - local20 * this.anIntArray204[local18] >> 14;
						this.anIntArray204[local18] = local185;
					}
					if (arg1 != 0) {
						local20 = Class32.anIntArray76[arg1];
						local166 = Class32.anIntArray77[arg1];
						local185 = local166 * this.anIntArray203[local18] + 16383 - this.anIntArray208[local18] * local20 >> 14;
						this.anIntArray208[local18] = this.anIntArray208[local18] * local166 + local20 * this.anIntArray203[local18] + 16383 >> 14;
						this.anIntArray203[local18] = local185;
					}
					if (arg2 != 0) {
						local20 = Class32.anIntArray76[arg2];
						local166 = Class32.anIntArray77[arg2];
						local185 = local166 * this.anIntArray204[local18] + local20 * this.anIntArray208[local18] + 16383 >> 14;
						this.anIntArray208[local18] = this.anIntArray208[local18] * local166 + 16383 - this.anIntArray204[local18] * local20 >> 14;
						this.anIntArray204[local18] = local185;
					}
					this.anIntArray204[local18] += Static357.anInt6582;
					this.anIntArray203[local18] += Static28.anInt700;
					this.anIntArray208[local18] += Static261.anInt4566;
				}
			} else if (arg0 == 3) {
				for (local18 = 0; local18 < this.anInt2431; local18++) {
					this.anIntArray204[local18] -= Static357.anInt6582;
					this.anIntArray203[local18] -= Static28.anInt700;
					this.anIntArray208[local18] -= Static261.anInt4566;
					this.anIntArray204[local18] = this.anIntArray204[local18] * arg1 / 128;
					this.anIntArray203[local18] = this.anIntArray203[local18] * arg2 / 128;
					this.anIntArray208[local18] = arg3 * this.anIntArray208[local18] / 128;
					this.anIntArray204[local18] += Static357.anInt6582;
					this.anIntArray203[local18] += Static28.anInt700;
					this.anIntArray208[local18] += Static261.anInt4566;
				}
			} else {
				@Pc(516) Class277 local516;
				@Pc(521) Class284 local521;
				if (arg0 == 5) {
					for (local18 = 0; local18 < this.anInt2419; local18++) {
						local20 = arg1 * 8 + (this.aByteArray39[local18] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray39[local18] = (byte) local20;
					}
					if (this.aClass277Array1 != null) {
						for (local20 = 0; local20 < this.anInt2412; local20++) {
							local516 = this.aClass277Array1[local20];
							local521 = this.aClass284Array1[local20];
							local521.anInt8654 = local521.anInt8654 & 0xFFFFFF | 255 - (this.aByteArray39[local516.anInt7977] & 0xFF) << 24;
						}
					}
					this.method2058();
				} else if (arg0 == 7) {
					for (local18 = 0; local18 < this.anInt2419; local18++) {
						local20 = this.aShortArray38[local18] & 0xFFFF;
						local166 = local20 >> 10 & 0x3F;
						local185 = local20 >> 7 & 0x7;
						local185 += arg2 / 4;
						@Pc(591) int local591 = local20 & 0x7F;
						@Pc(597) int local597 = arg1 + local166 & 0x3F;
						if (local185 < 0) {
							local185 = 0;
						} else if (local185 > 7) {
							local185 = 7;
						}
						local591 += arg3;
						if (local591 < 0) {
							local591 = 0;
						} else if (local591 > 127) {
							local591 = 127;
						}
						this.aShortArray38[local18] = (short) (local591 | local597 << 10 | local185 << 7);
					}
					if (this.aClass277Array1 != null) {
						for (local20 = 0; local20 < this.anInt2412; local20++) {
							local516 = this.aClass277Array1[local20];
							local521 = this.aClass284Array1[local20];
							local521.anInt8654 = Static659.anIntArray816[this.aShortArray38[local516.anInt7977] & 0xFFFF] & 0xFFFFFF | local521.anInt8654 & 0xFF000000;
						}
					}
					this.method2058();
				} else {
					@Pc(710) Class284 local710;
					if (arg0 == 8) {
						for (local18 = 0; local18 < this.anInt2412; local18++) {
							local710 = this.aClass284Array1[local18];
							local710.anInt8655 += arg1;
							local710.anInt8651 += arg2;
						}
					} else if (arg0 == 10) {
						for (local18 = 0; local18 < this.anInt2412; local18++) {
							local710 = this.aClass284Array1[local18];
							local710.anInt8652 = local710.anInt8652 * arg2 >> 7;
							local710.anInt8650 = arg1 * local710.anInt8650 >> 7;
						}
					} else if (arg0 == 9) {
						for (local18 = 0; local18 < this.anInt2412; local18++) {
							local710 = this.aClass284Array1[local18];
							local710.anInt8649 = arg1 + local710.anInt8649 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class32.anIntArray76[arg0];
		@Pc(13) int local13 = Class32.anIntArray77[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2431; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray204[local15] + local9 * this.anIntArray208[local15] >> 14;
			this.anIntArray208[local15] = this.anIntArray208[local15] * local13 - local9 * this.anIntArray204[local15] >> 14;
			this.anIntArray204[local15] = local33;
		}
		this.method2059();
		this.aBoolean199 = false;
	}

	@OriginalMember(owner = "client!eaa", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2431; local7++) {
			if (arg0 != 128) {
				this.anIntArray204[local7] = this.anIntArray204[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray203[local7] = this.anIntArray203[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray208[local7] = this.anIntArray208[local7] * arg2 >> 7;
			}
		}
		this.method2059();
		this.aBoolean199 = false;
	}

	@OriginalMember(owner = "client!eaa", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort26 = (short) arg0;
		this.method2058();
	}

	@OriginalMember(owner = "client!eaa", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) Class51 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean199) {
			this.method2067();
		}
		@Pc(16) int local16 = this.anInt2398 + arg4;
		@Pc(22) int local22 = arg4 + this.anInt2407;
		@Pc(27) int local27 = arg6 + this.anInt2420;
		@Pc(32) int local32 = this.anInt2408 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9511 <= local22 + arg2.anInt9506 >> arg2.anInt9507 || local27 < 0 || arg2.anInt9506 + local32 >> arg2.anInt9507 >= arg2.anInt9512)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9511 <= local22 + arg3.anInt9506 >> arg3.anInt9507 || local27 < 0 || arg3.anInt9512 <= local32 + arg3.anInt9506 >> arg3.anInt9507) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9507;
			local22 = arg2.anInt9506 + local22 - 1 >> arg2.anInt9507;
			local27 >>= arg2.anInt9507;
			local32 = local32 + arg2.anInt9506 - 1 >> arg2.anInt9507;
			if (arg2.method7857(local27, local16) == arg5 && arg2.method7857(local27, local22) == arg5 && arg5 == arg2.method7857(local32, local16) && arg5 == arg2.method7857(local32, local22)) {
				return;
			}
		}
		@Pc(190) int local190;
		if (arg0 == 1) {
			for (local190 = 0; local190 < this.anInt2431; local190++) {
				this.anIntArray203[local190] = this.anIntArray203[local190] + arg2.method7866(this.anIntArray204[local190] + arg4, arg6 + this.anIntArray208[local190]) - arg5;
			}
		} else {
			@Pc(259) int local259;
			@Pc(269) int local269;
			if (arg0 == 2) {
				local190 = this.anInt2405;
				if (local190 == 0) {
					return;
				}
				for (local259 = 0; local259 < this.anInt2431; local259++) {
					local269 = (this.anIntArray203[local259] << 16) / local190;
					if (local269 < arg1) {
						this.anIntArray203[local259] -= -((arg1 - local269) * (-arg5 + arg2.method7866(arg4 + this.anIntArray204[local259], this.anIntArray208[local259] - -arg6)) / arg1);
					}
				}
			} else {
				@Pc(276) int local276;
				if (arg0 == 3) {
					local190 = (arg1 & 0xFF) * 4;
					local259 = (arg1 >> 8 & 0xFF) * 4;
					local269 = (arg1 >> 16 & 0xFF) << 6;
					local276 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local190 >> 1) < 0 || arg2.anInt9511 << arg2.anInt9507 <= arg2.anInt9506 + (local190 >> 1) + arg4 || arg6 - (local259 >> 1) < 0 || arg2.anInt9512 << arg2.anInt9507 <= arg6 + (local259 >> 1) + arg2.anInt9506) {
						return;
					}
					this.method6392(arg2, arg5, local276, arg6, local269, local190, arg4, local259);
				} else if (arg0 == 4) {
					local190 = this.anInt2404 - this.anInt2405;
					for (local259 = 0; local259 < this.anInt2431; local259++) {
						this.anIntArray203[local259] = this.anIntArray203[local259] + arg3.method7866(this.anIntArray204[local259] + arg4, arg6 + this.anIntArray208[local259]) + local190 - arg5;
					}
				} else if (arg0 == 5) {
					local190 = this.anInt2404 - this.anInt2405;
					for (local259 = 0; local259 < this.anInt2431; local259++) {
						local269 = this.anIntArray204[local259] + arg4;
						local276 = arg6 + this.anIntArray208[local259];
						@Pc(282) int local282 = arg2.method7866(local269, local276);
						@Pc(288) int local288 = arg3.method7866(local269, local276);
						@Pc(295) int local295 = local282 - local288 - arg1;
						this.anIntArray203[local259] = local282 + ((this.anIntArray203[local259] << 8) / local190 * local295 >> 8) - arg5;
					}
				}
			}
		}
		this.method2059();
		this.aBoolean199 = false;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!qja;Lclient!ag;I)V")
	@Override
	public void method6391(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class12_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2428 == 0) {
			return;
		}
		@Pc(16) Class26_Sub1 local16 = this.aClass137_Sub1_4.aClass26_Sub1_16;
		@Pc(19) Class26_Sub1 local19 = (Class26_Sub1) arg0;
		if (!this.aBoolean199) {
			this.method2067();
		}
		Static334.aFloat151 = local16.aFloat28 * local19.aFloat18 + local19.aFloat23 * local16.aFloat20 + local16.aFloat21 * local19.aFloat25 + local16.aFloat25;
		Static294.aFloat105 = local19.aFloat28 * local16.aFloat21 + local16.aFloat28 * local19.aFloat24 + local19.aFloat26 * local16.aFloat20;
		@Pc(72) float local72 = (float) this.anInt2405 * Static294.aFloat105 + Static334.aFloat151;
		@Pc(80) float local80 = Static334.aFloat151 + Static294.aFloat105 * (float) this.anInt2404;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local80 < local72) {
			local90 = local72 + (float) this.anInt2370;
			local96 = local80 - (float) this.anInt2370;
		} else {
			local96 = local72 - (float) this.anInt2370;
			local90 = (float) this.anInt2370 + local80;
		}
		if (this.aClass137_Sub1_4.aFloat249 <= local96 || local90 <= (float) this.aClass137_Sub1_4.anInt9737) {
			return;
		}
		Static468.aFloat11 = local16.aFloat23 + local16.aFloat26 * local19.aFloat18 + local16.aFloat29 * local19.aFloat23 + local16.aFloat19 * local19.aFloat25;
		Static655.aFloat267 = local16.aFloat29 * local19.aFloat26 + local19.aFloat24 * local16.aFloat26 + local16.aFloat19 * local19.aFloat28;
		@Pc(172) float local172 = Static468.aFloat11 + (float) this.anInt2405 * Static655.aFloat267;
		@Pc(180) float local180 = Static655.aFloat267 * (float) this.anInt2404 + Static468.aFloat11;
		@Pc(195) float local195;
		@Pc(206) float local206;
		if (local180 < local172) {
			local206 = (float) this.aClass137_Sub1_4.anInt9742 * ((float) this.anInt2370 + local172);
			local195 = (local180 - (float) this.anInt2370) * (float) this.aClass137_Sub1_4.anInt9742;
		} else {
			local195 = (local172 - (float) this.anInt2370) * (float) this.aClass137_Sub1_4.anInt9742;
			local206 = ((float) this.anInt2370 + local180) * (float) this.aClass137_Sub1_4.anInt9742;
		}
		if (this.aClass137_Sub1_4.aFloat239 <= local195 / local90 || this.aClass137_Sub1_4.aFloat241 >= local206 / local90) {
			return;
		}
		Static507.aFloat219 = local16.aFloat18 + local16.aFloat24 * local19.aFloat18 + local19.aFloat23 * local16.aFloat22 + local16.aFloat27 * local19.aFloat25;
		Static202.aFloat77 = local19.aFloat28 * local16.aFloat27 + local16.aFloat22 * local19.aFloat26 + local19.aFloat24 * local16.aFloat24;
		@Pc(295) float local295 = Static507.aFloat219 + (float) this.anInt2405 * Static202.aFloat77;
		@Pc(303) float local303 = Static507.aFloat219 + (float) this.anInt2404 * Static202.aFloat77;
		@Pc(330) float local330;
		@Pc(318) float local318;
		if (local303 < local295) {
			local318 = (float) this.aClass137_Sub1_4.anInt9735 * ((float) this.anInt2370 + local295);
			local330 = (float) this.aClass137_Sub1_4.anInt9735 * ((float) -this.anInt2370 + local303);
		} else {
			local330 = (float) this.aClass137_Sub1_4.anInt9735 * (local295 - (float) this.anInt2370);
			local318 = (local303 + (float) this.anInt2370) * (float) this.aClass137_Sub1_4.anInt9735;
		}
		if (local330 / local90 >= this.aClass137_Sub1_4.aFloat237 || local318 / local90 <= this.aClass137_Sub1_4.aFloat243) {
			return;
		}
		if (arg1 != null || this.aClass277Array1 != null) {
			Static453.aFloat183 = local16.aFloat27 * local19.aFloat21 + local16.aFloat22 * local19.aFloat19 + local16.aFloat24 * local19.aFloat27;
			Static89.aFloat54 = local16.aFloat19 * local19.aFloat20 + local19.aFloat22 * local16.aFloat26 + local16.aFloat29 * local19.aFloat29;
			Static55.aFloat33 = local19.aFloat29 * local16.aFloat22 + local16.aFloat24 * local19.aFloat22 + local19.aFloat20 * local16.aFloat27;
			Static143.aFloat61 = local19.aFloat19 * local16.aFloat29 + local16.aFloat26 * local19.aFloat27 + local16.aFloat19 * local19.aFloat21;
			Static386.aFloat162 = local19.aFloat29 * local16.aFloat20 + local16.aFloat28 * local19.aFloat22 + local16.aFloat21 * local19.aFloat20;
			Static298.aFloat106 = local19.aFloat21 * local16.aFloat21 + local16.aFloat20 * local19.aFloat19 + local19.aFloat27 * local16.aFloat28;
		}
		if (arg1 != null) {
			@Pc(489) boolean local489 = false;
			@Pc(491) boolean local491 = true;
			@Pc(499) int local499 = this.anInt2407 + this.anInt2398 >> 1;
			@Pc(507) int local507 = this.anInt2408 + this.anInt2420 >> 1;
			@Pc(526) int local526 = (int) ((float) local507 * Static143.aFloat61 + (float) this.anInt2405 * Static655.aFloat267 + Static89.aFloat54 * (float) local499 + Static468.aFloat11);
			@Pc(545) int local545 = (int) ((float) local507 * Static453.aFloat183 + (float) this.anInt2405 * Static202.aFloat77 + Static507.aFloat219 + (float) local499 * Static55.aFloat33);
			@Pc(564) int local564 = (int) ((float) local499 * Static386.aFloat162 + Static334.aFloat151 + (float) this.anInt2405 * Static294.aFloat105 + Static298.aFloat106 * (float) local507);
			if (local564 >= this.aClass137_Sub1_4.anInt9737) {
				arg1.anInt80 = local526 * this.aClass137_Sub1_4.anInt9742 / local564 + this.aClass137_Sub1_4.anInt9712;
				arg1.anInt83 = this.aClass137_Sub1_4.anInt9715 + local545 * this.aClass137_Sub1_4.anInt9735 / local564;
			} else {
				local489 = true;
			}
			@Pc(623) int local623 = (int) (Static143.aFloat61 * (float) local507 + Static468.aFloat11 + (float) local499 * Static89.aFloat54 + Static655.aFloat267 * (float) this.anInt2404);
			@Pc(642) int local642 = (int) ((float) local507 * Static453.aFloat183 + (float) this.anInt2404 * Static202.aFloat77 + Static55.aFloat33 * (float) local499 + Static507.aFloat219);
			@Pc(661) int local661 = (int) (Static334.aFloat151 + Static386.aFloat162 * (float) local499 + Static294.aFloat105 * (float) this.anInt2404 + Static298.aFloat106 * (float) local507);
			if (this.aClass137_Sub1_4.anInt9737 <= local661) {
				arg1.anInt84 = this.aClass137_Sub1_4.anInt9712 + local623 * this.aClass137_Sub1_4.anInt9742 / local661;
				arg1.anInt82 = this.aClass137_Sub1_4.anInt9715 + local642 * this.aClass137_Sub1_4.anInt9735 / local661;
			} else {
				local489 = true;
			}
			if (local489) {
				if (local564 < this.aClass137_Sub1_4.anInt9737 && this.aClass137_Sub1_4.anInt9737 > local661) {
					local491 = false;
				} else {
					@Pc(745) int local745;
					@Pc(755) int local755;
					@Pc(781) int local781;
					if (local564 < this.aClass137_Sub1_4.anInt9737) {
						local745 = (local661 - this.aClass137_Sub1_4.anInt9737 << 16) / (local661 - local564);
						local755 = local623 + (local745 * (local623 - local526) >> 16);
						arg1.anInt80 = this.aClass137_Sub1_4.anInt9742 * local755 / this.aClass137_Sub1_4.anInt9737 + this.aClass137_Sub1_4.anInt9712;
						local781 = (local745 * (local642 - local545) >> 16) + local642;
						arg1.anInt83 = local781 * this.aClass137_Sub1_4.anInt9735 / this.aClass137_Sub1_4.anInt9737 + this.aClass137_Sub1_4.anInt9715;
					} else if (local661 < this.aClass137_Sub1_4.anInt9737) {
						local745 = (local564 - this.aClass137_Sub1_4.anInt9737 << 16) / (local564 - local661);
						local755 = (local745 * (local526 - local623) >> 16) + local526;
						arg1.anInt80 = this.aClass137_Sub1_4.anInt9742 * local755 / this.aClass137_Sub1_4.anInt9737 + this.aClass137_Sub1_4.anInt9712;
						local781 = (local745 * (local545 - local642) >> 16) + local545;
						arg1.anInt83 = this.aClass137_Sub1_4.anInt9715 + this.aClass137_Sub1_4.anInt9735 * local781 / this.aClass137_Sub1_4.anInt9737;
					}
				}
			}
			if (local491) {
				if (local564 <= local661) {
					arg1.anInt81 = (local623 + this.anInt2370) * this.aClass137_Sub1_4.anInt9742 / local661 + this.aClass137_Sub1_4.anInt9712 - arg1.anInt84;
				} else {
					arg1.anInt81 = this.aClass137_Sub1_4.anInt9742 * (local526 + this.anInt2370) / local564 + this.aClass137_Sub1_4.anInt9712 - arg1.anInt80;
				}
				arg1.aBoolean6 = true;
			}
		}
		this.aClass137_Sub1_4.method7955();
		this.aClass137_Sub1_4.method7960(local19);
		this.method2062();
		this.method2056();
	}

	@OriginalMember(owner = "client!eaa", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2389; local3++) {
			this.anIntArray204[local3] = this.anIntArray204[local3] + 7 >> 4;
			this.anIntArray203[local3] = this.anIntArray203[local3] + 7 >> 4;
			this.anIntArray208[local3] = this.anIntArray208[local3] + 7 >> 4;
		}
		this.method2059();
		this.aBoolean199 = false;
	}

	@OriginalMember(owner = "client!eaa", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean199) {
			this.method2067();
		}
		return this.anInt2404;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!qja;)V")
	@Override
	public void method6373(@OriginalArg(0) Class26 arg0) {
		@Pc(8) Class26_Sub1 local8 = (Class26_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass136Array2 != null) {
			for (local13 = 0; local13 < this.aClass136Array2.length; local13++) {
				@Pc(20) Class136 local20 = this.aClass136Array2[local13];
				@Pc(22) Class136 local22 = local20;
				if (local20.aClass136_1 != null) {
					local22 = local20.aClass136_1;
				}
				local22.anInt3747 = (int) (local8.aFloat23 + (float) this.anIntArray204[local20.anInt3741] * local8.aFloat29 + (float) this.anIntArray203[local20.anInt3741] * local8.aFloat26 + (float) this.anIntArray208[local20.anInt3741] * local8.aFloat19);
				local22.anInt3738 = (int) (local8.aFloat18 + (float) this.anIntArray203[local20.anInt3741] * local8.aFloat24 + (float) this.anIntArray204[local20.anInt3741] * local8.aFloat22 + (float) this.anIntArray208[local20.anInt3741] * local8.aFloat27);
				local22.anInt3753 = (int) (local8.aFloat25 + (float) this.anIntArray203[local20.anInt3741] * local8.aFloat28 + (float) this.anIntArray204[local20.anInt3741] * local8.aFloat20 + local8.aFloat21 * (float) this.anIntArray208[local20.anInt3741]);
				local22.anInt3746 = (int) (local8.aFloat23 + local8.aFloat26 * (float) this.anIntArray203[local20.anInt3739] + (float) this.anIntArray204[local20.anInt3739] * local8.aFloat29 + (float) this.anIntArray208[local20.anInt3739] * local8.aFloat19);
				local22.anInt3737 = (int) (local8.aFloat18 + local8.aFloat24 * (float) this.anIntArray203[local20.anInt3739] + (float) this.anIntArray204[local20.anInt3739] * local8.aFloat22 + local8.aFloat27 * (float) this.anIntArray208[local20.anInt3739]);
				local22.anInt3749 = (int) (local8.aFloat28 * (float) this.anIntArray203[local20.anInt3739] + local8.aFloat20 * (float) this.anIntArray204[local20.anInt3739] + (float) this.anIntArray208[local20.anInt3739] * local8.aFloat21 + local8.aFloat25);
				local22.anInt3744 = (int) (local8.aFloat26 * (float) this.anIntArray203[local20.anInt3750] + (float) this.anIntArray204[local20.anInt3750] * local8.aFloat29 + local8.aFloat19 * (float) this.anIntArray208[local20.anInt3750] + local8.aFloat23);
				local22.anInt3743 = (int) ((float) this.anIntArray203[local20.anInt3750] * local8.aFloat24 + local8.aFloat22 * (float) this.anIntArray204[local20.anInt3750] + (float) this.anIntArray208[local20.anInt3750] * local8.aFloat27 + local8.aFloat18);
				local22.anInt3736 = (int) ((float) this.anIntArray204[local20.anInt3750] * local8.aFloat20 + local8.aFloat28 * (float) this.anIntArray203[local20.anInt3750] + local8.aFloat21 * (float) this.anIntArray208[local20.anInt3750] + local8.aFloat25);
			}
		}
		if (this.aClass265Array2 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass265Array2.length; local13++) {
			@Pc(365) Class265 local365 = this.aClass265Array2[local13];
			@Pc(367) Class265 local367 = local365;
			if (local365.aClass265_1 != null) {
				local367 = local365.aClass265_1;
			}
			if (local365.aClass26_10 == null) {
				local365.aClass26_10 = local8.method6452();
			} else {
				local365.aClass26_10.method6447(local8);
			}
			local367.anInt7790 = (int) (local8.aFloat23 + (float) this.anIntArray204[local365.anInt7789] * local8.aFloat29 + (float) this.anIntArray203[local365.anInt7789] * local8.aFloat26 + (float) this.anIntArray208[local365.anInt7789] * local8.aFloat19);
			local367.anInt7791 = (int) (local8.aFloat27 * (float) this.anIntArray208[local365.anInt7789] + (float) this.anIntArray204[local365.anInt7789] * local8.aFloat22 + (float) this.anIntArray203[local365.anInt7789] * local8.aFloat24 + local8.aFloat18);
			local367.anInt7792 = (int) (local8.aFloat21 * (float) this.anIntArray208[local365.anInt7789] + (float) this.anIntArray204[local365.anInt7789] * local8.aFloat20 + (float) this.anIntArray203[local365.anInt7789] * local8.aFloat28 + local8.aFloat25);
		}
	}
}
