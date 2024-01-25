import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class180_Sub2 extends Class180 {

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "[Lclient!vf;")
	private Class356[] aClass356Array1;

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!nk", name = "w", descriptor = "[Lclient!baa;")
	private Class25[] aClass25Array1;

	@OriginalMember(owner = "client!nk", name = "x", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!nk", name = "D", descriptor = "[I")
	private int[] anIntArray521;

	@OriginalMember(owner = "client!nk", name = "K", descriptor = "[I")
	private int[] anIntArray522;

	@OriginalMember(owner = "client!nk", name = "N", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!nk", name = "O", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!nk", name = "S", descriptor = "[I")
	private int[] anIntArray523;

	@OriginalMember(owner = "client!nk", name = "T", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!nk", name = "U", descriptor = "[I")
	private int[] anIntArray524;

	@OriginalMember(owner = "client!nk", name = "V", descriptor = "[F")
	private float[] aFloatArray46;

	@OriginalMember(owner = "client!nk", name = "Y", descriptor = "I")
	private int anInt6649;

	@OriginalMember(owner = "client!nk", name = "Z", descriptor = "[B")
	private byte[] aByteArray50;

	@OriginalMember(owner = "client!nk", name = "bb", descriptor = "I")
	private int anInt6651;

	@OriginalMember(owner = "client!nk", name = "fb", descriptor = "[Lclient!cm;")
	private Class57[] aClass57Array3;

	@OriginalMember(owner = "client!nk", name = "hb", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!nk", name = "ib", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!nk", name = "ob", descriptor = "S")
	private short aShort86;

	@OriginalMember(owner = "client!nk", name = "pb", descriptor = "Lclient!cs;")
	private Interface7 anInterface7_4;

	@OriginalMember(owner = "client!nk", name = "qb", descriptor = "[B")
	private byte[] aByteArray51;

	@OriginalMember(owner = "client!nk", name = "wb", descriptor = "S")
	private short aShort87;

	@OriginalMember(owner = "client!nk", name = "Ab", descriptor = "B")
	private byte aByte90;

	@OriginalMember(owner = "client!nk", name = "Bb", descriptor = "[F")
	private float[] aFloatArray47;

	@OriginalMember(owner = "client!nk", name = "Cb", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!nk", name = "Ib", descriptor = "S")
	private short aShort88;

	@OriginalMember(owner = "client!nk", name = "Kb", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!nk", name = "Pb", descriptor = "I")
	private int anInt6670;

	@OriginalMember(owner = "client!nk", name = "Qb", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!nk", name = "Rb", descriptor = "S")
	private short aShort89;

	@OriginalMember(owner = "client!nk", name = "Sb", descriptor = "Lclient!om;")
	private Class261 aClass261_1;

	@OriginalMember(owner = "client!nk", name = "Vb", descriptor = "S")
	private short aShort90;

	@OriginalMember(owner = "client!nk", name = "Wb", descriptor = "S")
	private short aShort91;

	@OriginalMember(owner = "client!nk", name = "Yb", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!nk", name = "Zb", descriptor = "S")
	private short aShort92;

	@OriginalMember(owner = "client!nk", name = "bc", descriptor = "[Lclient!hi;")
	private Class143[] aClass143Array3;

	@OriginalMember(owner = "client!nk", name = "fc", descriptor = "[I")
	private int[] anIntArray525;

	@OriginalMember(owner = "client!nk", name = "gc", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!nk", name = "jc", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!nk", name = "rc", descriptor = "S")
	private short aShort93;

	@OriginalMember(owner = "client!nk", name = "uc", descriptor = "Lclient!as;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!nk", name = "Cc", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!nk", name = "Ec", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!nk", name = "G", descriptor = "I")
	private int anInt6639 = 0;

	@OriginalMember(owner = "client!nk", name = "xb", descriptor = "I")
	private int anInt6659 = 0;

	@OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
	private int anInt6630 = 0;

	@OriginalMember(owner = "client!nk", name = "H", descriptor = "I")
	private int anInt6640 = 0;

	@OriginalMember(owner = "client!nk", name = "db", descriptor = "Z")
	private boolean aBoolean548 = true;

	@OriginalMember(owner = "client!nk", name = "nc", descriptor = "Z")
	private boolean aBoolean552 = false;

	@OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
	private int anInt6636 = 0;

	@OriginalMember(owner = "client!nk", name = "kb", descriptor = "Z")
	private boolean aBoolean550 = false;

	@OriginalMember(owner = "client!nk", name = "sb", descriptor = "Z")
	private boolean aBoolean551 = false;

	@OriginalMember(owner = "client!nk", name = "cb", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_25;

	@OriginalMember(owner = "client!nk", name = "Eb", descriptor = "Lclient!im;")
	private Class159 aClass159_11;

	@OriginalMember(owner = "client!nk", name = "sc", descriptor = "Lclient!im;")
	private Class159 aClass159_12;

	@OriginalMember(owner = "client!nk", name = "rb", descriptor = "Lclient!im;")
	private Class159 aClass159_10;

	@OriginalMember(owner = "client!nk", name = "C", descriptor = "Lclient!im;")
	private Class159 aClass159_9;

	@OriginalMember(owner = "client!nk", name = "P", descriptor = "Lclient!vea;")
	private Class355 aClass355_1;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!rda;)V")
	public Class180_Sub2(@OriginalArg(0) Class126_Sub3 arg0) {
		this.aClass126_Sub3_25 = arg0;
		this.aClass159_11 = new Class159((Interface7) null, 5126, 3, 0);
		this.aClass159_12 = new Class159((Interface7) null, 5126, 2, 0);
		this.aClass159_10 = new Class159((Interface7) null, 5126, 3, 0);
		this.aClass159_9 = new Class159((Interface7) null, 5121, 4, 0);
		this.aClass355_1 = new Class355();
	}

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!rda;Lclient!ur;IIII)V")
	public Class180_Sub2(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) Class349 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6649 = arg5;
		this.aClass126_Sub3_25 = arg0;
		this.anInt6670 = arg2;
		if (Static139.method2090(arg5, arg2)) {
			this.aClass159_11 = new Class159((Interface7) null, 5126, 3, 0);
		}
		if (Static437.method6512(arg2, arg5)) {
			this.aClass159_12 = new Class159((Interface7) null, 5126, 2, 0);
		}
		if (Static85.method1347(arg2, arg5)) {
			this.aClass159_10 = new Class159((Interface7) null, 5126, 3, 0);
		}
		if (Static20.method457(arg5, arg2)) {
			this.aClass159_9 = new Class159((Interface7) null, 5121, 4, 0);
		}
		if (Static479.method6947(arg5, arg2)) {
			this.aClass355_1 = new Class355();
		}
		@Pc(108) Interface8 local108 = arg0.anInterface8_10;
		@Pc(112) int[] local112 = new int[arg1.anInt9571];
		this.anIntArray522 = new int[arg1.anInt9589 + 1];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt9571; local121++) {
			if (arg1.aByteArray97 == null || arg1.aByteArray97[local121] != 2) {
				if (arg1.aShortArray171 != null && arg1.aShortArray171[local121] != -1) {
					@Pc(153) Class321 local153 = local108.method7813(arg1.aShortArray171[local121] & 0xFFFF);
					if (((this.anInt6649 & 0x40) == 0 || !local153.aBoolean724) && local153.aBoolean726) {
						continue;
					}
				}
				local112[this.anInt6639++] = local121;
				this.anIntArray522[arg1.aShortArray167[local121]]++;
				this.anIntArray522[arg1.aShortArray165[local121]]++;
				this.anIntArray522[arg1.aShortArray174[local121]]++;
			}
		}
		this.anInt6630 = this.anInt6639;
		@Pc(226) long[] local226 = new long[this.anInt6639];
		@Pc(235) boolean local235 = (this.anInt6670 & 0x100) != 0;
		@Pc(247) int local247;
		@Pc(260) int local260;
		@Pc(435) int local435;
		for (@Pc(237) int local237 = 0; local237 < this.anInt6639; local237++) {
			@Pc(243) int local243 = local112[local237];
			@Pc(245) Class321 local245 = null;
			local247 = 0;
			@Pc(249) byte local249 = 0;
			@Pc(251) byte local251 = 0;
			@Pc(253) byte local253 = 0;
			if (arg1.aClass196Array1 != null) {
				@Pc(258) boolean local258 = false;
				for (local260 = 0; local260 < arg1.aClass196Array1.length; local260++) {
					@Pc(267) Class196 local267 = arg1.aClass196Array1[local260];
					if (local267.anInt4752 == local243) {
						@Pc(276) Class255 local276 = Static415.method6340(local267.anInt4755);
						if (local276.aBoolean571) {
							local258 = true;
						}
						if (local276.anInt6889 != -1) {
							@Pc(292) Class321 local292 = local108.method7813(local276.anInt6889);
							if (local292.anInt8901 == 2) {
								this.aBoolean551 = true;
							}
						}
					}
				}
				if (local258) {
					local226[local237] = Long.MAX_VALUE;
					this.anInt6630--;
					continue;
				}
			}
			@Pc(325) short local325 = -1;
			if (arg1.aShortArray171 != null) {
				local325 = arg1.aShortArray171[local243];
				if (local325 != -1) {
					local245 = local108.method7813(local325 & 0xFFFF);
					if ((this.anInt6649 & 0x40) != 0 && local245.aBoolean724) {
						local325 = -1;
						local245 = null;
					} else {
						local253 = local245.aByte120;
						if (local245.aByte119 != 0 || local245.aByte118 != 0) {
							this.aBoolean550 = true;
						}
						local251 = local245.aByte115;
					}
				}
			}
			@Pc(391) boolean local391 = arg1.aByteArray95 != null && arg1.aByteArray95[local243] != 0 || local245 != null && local245.anInt8901 != 0;
			if ((local235 || local391) && arg1.aByteArray96 != null) {
				local247 += arg1.aByteArray96[local243] << 17;
			}
			if (local391) {
				local247 += 65536;
			}
			local247 += (local251 & 0xFF) << 8;
			local247 += local253 & 0xFF;
			local435 = local249 + ((local325 & 0xFFFF) << 16);
			@Pc(441) int local441 = local435 + (local237 & 0xFFFF);
			local226[local237] = (long) local441 + ((long) local247 << 32);
			this.aBoolean551 |= local391;
			this.aBoolean550 |= local245 != null && (local245.aByte119 != 0 || local245.aByte118 != 0);
		}
		Static123.method1869(local226, local112);
		this.aShortArray89 = arg1.aShortArray166;
		this.anInt6659 = arg1.anInt9589;
		this.anIntArray525 = arg1.anIntArray764;
		this.anInt6636 = arg1.anInt9582;
		this.anIntArray524 = arg1.anIntArray769;
		this.anIntArray521 = arg1.anIntArray774;
		this.aClass57Array3 = arg1.aClass57Array5;
		@Pc(520) Class19[] local520 = new Class19[this.anInt6659];
		this.aClass143Array3 = arg1.aClass143Array5;
		@Pc(544) int local544;
		@Pc(558) int local558;
		@Pc(597) int local597;
		if (arg1.aClass196Array1 != null) {
			this.anInt6651 = arg1.aClass196Array1.length;
			this.aClass356Array1 = new Class356[this.anInt6651];
			this.aClass25Array1 = new Class25[this.anInt6651];
			for (local544 = 0; local544 < this.anInt6651; local544++) {
				@Pc(551) Class196 local551 = arg1.aClass196Array1[local544];
				@Pc(556) Class255 local556 = Static415.method6340(local551.anInt4755);
				local558 = -1;
				for (@Pc(560) int local560 = 0; local560 < this.anInt6639; local560++) {
					if (local112[local560] == local551.anInt4752) {
						local558 = local560;
						break;
					}
				}
				if (local558 == -1) {
					throw new RuntimeException();
				}
				local597 = Static643.anIntArray836[arg1.aShortArray170[local551.anInt4752] & 0xFFFF] & 0xFFFFFF;
				@Pc(615) int local615 = local597 | 255 - (arg1.aByteArray95 == null ? 0 : arg1.aByteArray95[local551.anInt4752]) << 24;
				this.aClass356Array1[local544] = new Class356(local558, arg1.aShortArray167[local551.anInt4752], arg1.aShortArray165[local551.anInt4752], arg1.aShortArray174[local551.anInt4752], local556.anInt6892, local556.anInt6891, local556.anInt6889, local556.anInt6893, local556.anInt6888, local556.aBoolean571, local556.aBoolean570, local551.anInt4754);
				this.aClass25Array1[local544] = new Class25(local615);
			}
		}
		local544 = this.anInt6639 * 3;
		this.aShort87 = (short) arg3;
		this.aShortArray98 = new short[local544];
		this.aShortArray91 = new short[this.anInt6639];
		if (arg1.aShortArray172 != null) {
			this.aShortArray95 = new short[this.anInt6639];
		}
		this.aFloatArray46 = new float[local544];
		Static247.aLongArray6 = new long[local544];
		this.aShortArray96 = new short[this.anInt6639];
		this.aShortArray93 = new short[local544];
		this.aShortArray94 = new short[this.anInt6639];
		this.aShortArray90 = new short[this.anInt6639];
		this.aShortArray92 = new short[local544];
		this.aShortArray88 = new short[this.anInt6639];
		this.aShortArray97 = new short[local544];
		this.aByteArray50 = new byte[this.anInt6639];
		this.aFloatArray47 = new float[local544];
		this.aShort86 = (short) arg4;
		this.aByteArray51 = new byte[local544];
		local247 = 0;
		for (local435 = 0; local435 < arg1.anInt9589; local435++) {
			local558 = this.anIntArray522[local435];
			this.anIntArray522[local435] = local247;
			local520[local435] = new Class19();
			local247 += local558;
		}
		this.anIntArray522[arg1.anInt9589] = local247;
		@Pc(801) Class92 local801 = Static501.method8161(this.anInt6639, arg1, local112);
		@Pc(805) Class236[] local805 = new Class236[arg1.anInt9571];
		@Pc(846) int local846;
		@Pc(857) int local857;
		@Pc(879) int local879;
		@Pc(890) int local890;
		@Pc(898) int local898;
		@Pc(907) int local907;
		@Pc(824) short local824;
		@Pc(835) int local835;
		for (local597 = 0; local597 < arg1.anInt9571; local597++) {
			@Pc(814) short local814 = arg1.aShortArray167[local597];
			@Pc(819) short local819 = arg1.aShortArray165[local597];
			local824 = arg1.aShortArray174[local597];
			local835 = this.anIntArray525[local819] - this.anIntArray525[local814];
			local846 = this.anIntArray521[local819] - this.anIntArray521[local814];
			local857 = this.anIntArray524[local819] - this.anIntArray524[local814];
			@Pc(868) int local868 = this.anIntArray525[local824] - this.anIntArray525[local814];
			local879 = this.anIntArray521[local824] - this.anIntArray521[local814];
			local890 = this.anIntArray524[local824] - this.anIntArray524[local814];
			local898 = local846 * local890 - local879 * local857;
			local907 = local868 * local857 - local835 * local890;
			@Pc(916) int local916 = local879 * local835 - local868 * local846;
			while (local898 > 8192 || local907 > 8192 || local916 > 8192 || local898 < -8192 || local907 < -8192 || local916 < -8192) {
				local898 >>= 0x1;
				local916 >>= 0x1;
				local907 >>= 0x1;
			}
			@Pc(970) int local970 = (int) Math.sqrt((double) (local907 * local907 + local898 * local898 + local916 * local916));
			if (local970 <= 0) {
				local970 = 1;
			}
			local907 = local907 * 256 / local970;
			local898 = local898 * 256 / local970;
			local916 = local916 * 256 / local970;
			@Pc(1005) byte local1005 = arg1.aByteArray97 == null ? 0 : arg1.aByteArray97[local597];
			if (local1005 == 0) {
				@Pc(1035) Class19 local1035 = local520[local814];
				local1035.anInt459++;
				local1035.anInt458 += local907;
				local1035.anInt463 += local898;
				local1035.anInt460 += local916;
				@Pc(1063) Class19 local1063 = local520[local819];
				local1063.anInt458 += local907;
				local1063.anInt460 += local916;
				local1063.anInt463 += local898;
				local1063.anInt459++;
				@Pc(1091) Class19 local1091 = local520[local824];
				local1091.anInt458 += local907;
				local1091.anInt463 += local898;
				local1091.anInt459++;
				local1091.anInt460 += local916;
			} else if (local1005 == 1) {
				@Pc(1020) Class236 local1020 = local805[local597] = new Class236();
				local1020.anInt6444 = local898;
				local1020.anInt6443 = local907;
				local1020.anInt6442 = local916;
			}
		}
		@Pc(1128) int local1128;
		@Pc(1171) short local1171;
		for (local260 = 0; local260 < this.anInt6639; local260++) {
			local1128 = local112[local260];
			@Pc(1135) int local1135 = arg1.aShortArray170[local1128] & 0xFFFF;
			if (arg1.aByteArray91 == null) {
				local835 = -1;
			} else {
				local835 = arg1.aByteArray91[local1128];
			}
			if (arg1.aByteArray95 == null) {
				local846 = 0;
			} else {
				local846 = arg1.aByteArray95[local1128] & 0xFF;
			}
			local1171 = arg1.aShortArray171 == null ? -1 : arg1.aShortArray171[local1128];
			if (local1171 != -1 && (this.anInt6649 & 0x40) != 0) {
				@Pc(1187) Class321 local1187 = local108.method7813(local1171 & 0xFFFF);
				if (local1187.aBoolean724) {
					local1171 = -1;
				}
			}
			@Pc(1194) float local1194 = 0.0F;
			@Pc(1196) float local1196 = 0.0F;
			@Pc(1198) float local1198 = 0.0F;
			@Pc(1200) float local1200 = 0.0F;
			@Pc(1202) float local1202 = 0.0F;
			@Pc(1204) float local1204 = 0.0F;
			@Pc(1206) byte local1206 = 0;
			@Pc(1208) byte local1208 = 0;
			@Pc(1210) int local1210 = 0;
			@Pc(1244) byte local1244;
			@Pc(1261) short local1261;
			@Pc(1266) short local1266;
			@Pc(1271) short local1271;
			if (local1171 != -1) {
				if (local835 == -1) {
					local1208 = 2;
					local1200 = 1.0F;
					local1196 = 1.0F;
					local1206 = 1;
					local1202 = 0.0F;
					local1194 = 0.0F;
					local1198 = 1.0F;
					local1204 = 0.0F;
				} else {
					local835 &= 0xFF;
					local1244 = arg1.aByteArray92[local835];
					@Pc(1251) short local1251;
					@Pc(1256) short local1256;
					@Pc(1294) float local1294;
					@Pc(1303) float local1303;
					@Pc(1311) float local1311;
					@Pc(1397) float local1397;
					@Pc(1405) float local1405;
					@Pc(1413) float local1413;
					@Pc(1422) float local1422;
					@Pc(1430) float local1430;
					@Pc(1438) float local1438;
					if (local1244 == 0) {
						local1251 = arg1.aShortArray167[local1128];
						local1256 = arg1.aShortArray165[local1128];
						local1261 = arg1.aShortArray174[local1128];
						local1266 = arg1.aShortArray168[local835];
						local1271 = arg1.aShortArray169[local835];
						@Pc(1276) short local1276 = arg1.aShortArray173[local835];
						@Pc(1282) float local1282 = (float) arg1.anIntArray764[local1266];
						@Pc(1288) float local1288 = (float) arg1.anIntArray774[local1266];
						local1294 = (float) arg1.anIntArray769[local1266];
						local1303 = (float) arg1.anIntArray764[local1271] - local1282;
						local1311 = (float) arg1.anIntArray774[local1271] - local1288;
						@Pc(1320) float local1320 = (float) arg1.anIntArray769[local1271] - local1294;
						@Pc(1329) float local1329 = (float) arg1.anIntArray764[local1276] - local1282;
						@Pc(1337) float local1337 = (float) arg1.anIntArray774[local1276] - local1288;
						@Pc(1346) float local1346 = (float) arg1.anIntArray769[local1276] - local1294;
						@Pc(1355) float local1355 = (float) arg1.anIntArray764[local1251] - local1282;
						@Pc(1364) float local1364 = (float) arg1.anIntArray774[local1251] - local1288;
						@Pc(1372) float local1372 = (float) arg1.anIntArray769[local1251] - local1294;
						@Pc(1380) float local1380 = (float) arg1.anIntArray764[local1256] - local1282;
						@Pc(1388) float local1388 = (float) arg1.anIntArray774[local1256] - local1288;
						local1397 = (float) arg1.anIntArray769[local1256] - local1294;
						local1405 = (float) arg1.anIntArray764[local1261] - local1282;
						local1413 = (float) arg1.anIntArray774[local1261] - local1288;
						local1422 = (float) arg1.anIntArray769[local1261] - local1294;
						local1430 = local1311 * local1346 - local1337 * local1320;
						local1438 = local1329 * local1320 - local1303 * local1346;
						@Pc(1447) float local1447 = local1303 * local1337 - local1329 * local1311;
						@Pc(1455) float local1455 = local1447 * local1337 - local1438 * local1346;
						@Pc(1463) float local1463 = local1346 * local1430 - local1447 * local1329;
						@Pc(1472) float local1472 = local1329 * local1438 - local1337 * local1430;
						@Pc(1486) float local1486 = 1.0F / (local1463 * local1311 + local1303 * local1455 + local1472 * local1320);
						local1202 = (local1413 * local1463 + local1455 * local1405 + local1422 * local1472) * local1486;
						local1194 = local1486 * (local1355 * local1455 + local1364 * local1463 + local1372 * local1472);
						local1198 = local1486 * (local1397 * local1472 + local1380 * local1455 + local1388 * local1463);
						@Pc(1536) float local1536 = local1320 * local1430 - local1303 * local1447;
						@Pc(1545) float local1545 = local1303 * local1438 - local1430 * local1311;
						@Pc(1554) float local1554 = local1311 * local1447 - local1320 * local1438;
						@Pc(1568) float local1568 = 1.0F / (local1346 * local1545 + local1329 * local1554 + local1536 * local1337);
						local1196 = (local1372 * local1545 + local1536 * local1364 + local1355 * local1554) * local1568;
						local1204 = (local1545 * local1422 + local1536 * local1413 + local1405 * local1554) * local1568;
						local1200 = local1568 * (local1397 * local1545 + local1380 * local1554 + local1536 * local1388);
					} else {
						local1251 = arg1.aShortArray167[local1128];
						local1256 = arg1.aShortArray165[local1128];
						local1261 = arg1.aShortArray174[local1128];
						@Pc(1632) int local1632 = local801.anIntArray165[local835];
						@Pc(1637) int local1637 = local801.anIntArray164[local835];
						@Pc(1642) int local1642 = local801.anIntArray167[local835];
						@Pc(1647) float[] local1647 = local801.aFloatArrayArray1[local835];
						@Pc(1652) byte local1652 = arg1.aByteArray93[local835];
						local1294 = (float) arg1.anIntArray770[local835] / 256.0F;
						if (local1244 == 1) {
							local1303 = (float) arg1.anIntArray763[local835] / 1024.0F;
							Static20.method458(arg1.anIntArray769[local1251], Static328.aFloatArray33, local1652, arg1.anIntArray764[local1251], local1637, local1294, local1647, local1303, local1632, arg1.anIntArray774[local1251], local1642);
							local1196 = Static328.aFloatArray33[1];
							local1194 = Static328.aFloatArray33[0];
							Static20.method458(arg1.anIntArray769[local1256], Static328.aFloatArray33, local1652, arg1.anIntArray764[local1256], local1637, local1294, local1647, local1303, local1632, arg1.anIntArray774[local1256], local1642);
							local1200 = Static328.aFloatArray33[1];
							local1198 = Static328.aFloatArray33[0];
							Static20.method458(arg1.anIntArray769[local1261], Static328.aFloatArray33, local1652, arg1.anIntArray764[local1261], local1637, local1294, local1647, local1303, local1632, arg1.anIntArray774[local1261], local1642);
							local1204 = Static328.aFloatArray33[1];
							local1202 = Static328.aFloatArray33[0];
							local1311 = local1303 / 2.0F;
							if ((local1652 & 0x1) == 0) {
								if (local1311 < local1202 - local1194) {
									local1202 -= local1303;
									local1208 = 1;
								} else if (local1194 - local1202 > local1311) {
									local1202 += local1303;
									local1208 = 2;
								}
								if (local1198 - local1194 > local1311) {
									local1206 = 1;
									local1198 -= local1303;
								} else if (local1311 < local1194 - local1198) {
									local1198 += local1303;
									local1206 = 2;
								}
							} else {
								if (local1204 - local1196 > local1311) {
									local1204 -= local1303;
									local1208 = 1;
								} else if (local1311 < local1196 - local1204) {
									local1208 = 2;
									local1204 += local1303;
								}
								if (local1200 - local1196 > local1311) {
									local1206 = 1;
									local1200 -= local1303;
								} else if (local1196 - local1200 > local1311) {
									local1200 += local1303;
									local1206 = 2;
								}
							}
						} else if (local1244 == 2) {
							local1303 = (float) arg1.anIntArray767[local835] / 256.0F;
							local1311 = (float) arg1.anIntArray768[local835] / 256.0F;
							@Pc(1915) int local1915 = arg1.anIntArray764[local1256] - arg1.anIntArray764[local1251];
							@Pc(1926) int local1926 = arg1.anIntArray774[local1256] - arg1.anIntArray774[local1251];
							@Pc(1936) int local1936 = arg1.anIntArray769[local1256] - arg1.anIntArray769[local1251];
							@Pc(1947) int local1947 = arg1.anIntArray764[local1261] - arg1.anIntArray764[local1251];
							@Pc(1958) int local1958 = arg1.anIntArray774[local1261] - arg1.anIntArray774[local1251];
							@Pc(1969) int local1969 = arg1.anIntArray769[local1261] - arg1.anIntArray769[local1251];
							@Pc(1978) int local1978 = local1969 * local1926 - local1936 * local1958;
							@Pc(1987) int local1987 = local1947 * local1936 - local1915 * local1969;
							@Pc(1996) int local1996 = local1915 * local1958 - local1926 * local1947;
							local1397 = 64.0F / (float) arg1.anIntArray772[local835];
							local1405 = 64.0F / (float) arg1.anIntArray765[local835];
							local1413 = 64.0F / (float) arg1.anIntArray763[local835];
							local1422 = (local1647[1] * (float) local1987 + local1647[0] * (float) local1978 + (float) local1996 * local1647[2]) / local1397;
							local1430 = ((float) local1996 * local1647[5] + local1647[3] * (float) local1978 + local1647[4] * (float) local1987) / local1405;
							local1438 = ((float) local1987 * local1647[7] + local1647[6] * (float) local1978 + local1647[8] * (float) local1996) / local1413;
							local1210 = Static240.method3663(local1422, local1430, local1438);
							Static144.method2154(local1311, local1632, arg1.anIntArray769[local1251], local1642, local1303, local1637, arg1.anIntArray764[local1251], arg1.anIntArray774[local1251], local1294, local1652, Static328.aFloatArray33, local1647, local1210);
							local1196 = Static328.aFloatArray33[1];
							local1194 = Static328.aFloatArray33[0];
							Static144.method2154(local1311, local1632, arg1.anIntArray769[local1256], local1642, local1303, local1637, arg1.anIntArray764[local1256], arg1.anIntArray774[local1256], local1294, local1652, Static328.aFloatArray33, local1647, local1210);
							local1200 = Static328.aFloatArray33[1];
							local1198 = Static328.aFloatArray33[0];
							Static144.method2154(local1311, local1632, arg1.anIntArray769[local1261], local1642, local1303, local1637, arg1.anIntArray764[local1261], arg1.anIntArray774[local1261], local1294, local1652, Static328.aFloatArray33, local1647, local1210);
							local1202 = Static328.aFloatArray33[0];
							local1204 = Static328.aFloatArray33[1];
						} else if (local1244 == 3) {
							Static324.method5026(local1652, arg1.anIntArray774[local1251], Static328.aFloatArray33, local1294, local1637, arg1.anIntArray769[local1251], arg1.anIntArray764[local1251], local1632, local1642, local1647);
							local1196 = Static328.aFloatArray33[1];
							local1194 = Static328.aFloatArray33[0];
							Static324.method5026(local1652, arg1.anIntArray774[local1256], Static328.aFloatArray33, local1294, local1637, arg1.anIntArray769[local1256], arg1.anIntArray764[local1256], local1632, local1642, local1647);
							local1198 = Static328.aFloatArray33[0];
							local1200 = Static328.aFloatArray33[1];
							Static324.method5026(local1652, arg1.anIntArray774[local1261], Static328.aFloatArray33, local1294, local1637, arg1.anIntArray769[local1261], arg1.anIntArray764[local1261], local1632, local1642, local1647);
							local1204 = Static328.aFloatArray33[1];
							local1202 = Static328.aFloatArray33[0];
							if ((local1652 & 0x1) == 0) {
								if (local1198 - local1194 > 0.5F) {
									local1206 = 1;
									local1198--;
								} else if (local1194 - local1198 > 0.5F) {
									local1206 = 2;
									local1198++;
								}
								if (local1202 - local1194 > 0.5F) {
									local1208 = 1;
									local1202--;
								} else if (local1194 - local1202 > 0.5F) {
									local1202++;
									local1208 = 2;
								}
							} else {
								if (local1204 - local1196 > 0.5F) {
									local1204--;
									local1208 = 1;
								} else if (local1196 - local1204 > 0.5F) {
									local1204++;
									local1208 = 2;
								}
								if (local1200 - local1196 > 0.5F) {
									local1200--;
									local1206 = 1;
								} else if (local1196 - local1200 > 0.5F) {
									local1206 = 2;
									local1200++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray97 == null) {
				local1244 = 0;
			} else {
				local1244 = arg1.aByteArray97[local1128];
			}
			if (local1244 == 0) {
				@Pc(2434) long local2434 = (long) (local835 << 2) + ((long) (local1135 << 8) + (long) (local1210 << 24) + (long) local846 << 32);
				local1261 = arg1.aShortArray167[local1128];
				local1266 = arg1.aShortArray165[local1128];
				local1271 = arg1.aShortArray174[local1128];
				@Pc(2453) Class19 local2453 = local520[local1261];
				this.aShortArray91[local260] = this.method5893(local2453.anInt460, local2453.anInt458, local1194, arg1, local2453.anInt459, local1261, local2434, local1196, local2453.anInt463);
				@Pc(2477) Class19 local2477 = local520[local1266];
				this.aShortArray94[local260] = this.method5893(local2477.anInt460, local2477.anInt458, local1198, arg1, local2477.anInt459, local1266, local2434 + (long) local1206, local1200, local2477.anInt463);
				@Pc(2504) Class19 local2504 = local520[local1271];
				this.aShortArray90[local260] = this.method5893(local2504.anInt460, local2504.anInt458, local1202, arg1, local2504.anInt459, local1271, local2434 + (long) local1208, local1204, local2504.anInt463);
			} else if (local1244 == 1) {
				@Pc(2538) Class236 local2538 = local805[local1128];
				@Pc(2579) long local2579 = ((long) (local1135 << 8) + (long) (local1210 << 24) + (long) local846 << 32) + (long) ((local2538.anInt6442 + 256 << 22) + (local2538.anInt6443 + 256 << 12) + (local2538.anInt6444 <= 0 ? 2048 : 1024) + (local835 << 2));
				this.aShortArray91[local260] = this.method5893(local2538.anInt6442, local2538.anInt6443, local1194, arg1, 0, arg1.aShortArray167[local1128], local2579, local1196, local2538.anInt6444);
				this.aShortArray94[local260] = this.method5893(local2538.anInt6442, local2538.anInt6443, local1198, arg1, 0, arg1.aShortArray165[local1128], local2579 + (long) local1206, local1200, local2538.anInt6444);
				this.aShortArray90[local260] = this.method5893(local2538.anInt6442, local2538.anInt6443, local1202, arg1, 0, arg1.aShortArray174[local1128], local2579 + (long) local1208, local1204, local2538.anInt6444);
			}
			if (arg1.aByteArray95 != null) {
				this.aByteArray50[local260] = arg1.aByteArray95[local1128];
			}
			if (arg1.aShortArray172 != null) {
				this.aShortArray95[local260] = arg1.aShortArray172[local1128];
			}
			this.aShortArray96[local260] = arg1.aShortArray170[local1128];
			this.aShortArray88[local260] = local1171;
		}
		local1128 = 0;
		local824 = -10000;
		for (local835 = 0; local835 < this.anInt6630; local835++) {
			@Pc(2704) short local2704 = this.aShortArray88[local835];
			if (local824 != local2704) {
				local1128++;
				local824 = local2704;
			}
		}
		this.anIntArray523 = new int[local1128 + 1];
		local824 = -10000;
		local1128 = 0;
		for (local846 = 0; local846 < this.anInt6630; local846++) {
			local1171 = this.aShortArray88[local846];
			if (local824 != local1171) {
				this.anIntArray523[local1128++] = local846;
				local824 = local1171;
			}
		}
		this.anIntArray523[local1128] = this.anInt6630;
		Static247.aLongArray6 = null;
		this.aShortArray97 = Static272.method4131(this.aShortArray97, this.anInt6640);
		this.aShortArray98 = Static272.method4131(this.aShortArray98, this.anInt6640);
		this.aShortArray92 = Static272.method4131(this.aShortArray92, this.anInt6640);
		this.aByteArray51 = Static242.method3685(this.anInt6640, this.aByteArray51);
		this.aFloatArray47 = Static413.method6304(this.aFloatArray47, this.anInt6640);
		this.aFloatArray46 = Static413.method6304(this.aFloatArray46, this.anInt6640);
		if (arg1.anIntArray771 != null && Static407.method6234(arg2, this.anInt6649)) {
			this.anIntArrayArray33 = arg1.method8219(false);
		}
		if (arg1.aClass196Array1 != null && Static243.method3691(this.anInt6649, arg2)) {
			this.anIntArrayArray34 = arg1.method8221();
		}
		if (arg1.anIntArray766 != null && Static149.method2192(arg2, this.anInt6649)) {
			local857 = 0;
			@Pc(2853) int[] local2853 = new int[256];
			for (local879 = 0; local879 < this.anInt6639; local879++) {
				local890 = arg1.anIntArray766[local112[local879]];
				if (local890 >= 0) {
					if (local857 < local890) {
						local857 = local890;
					}
					@Pc(2879) int local2879 = local2853[local890]++;
				}
			}
			this.anIntArrayArray35 = new int[local857 + 1][];
			for (local890 = 0; local890 <= local857; local890++) {
				this.anIntArrayArray35[local890] = new int[local2853[local890]];
				local2853[local890] = 0;
			}
			for (local898 = 0; local898 < this.anInt6639; local898++) {
				local907 = arg1.anIntArray766[local112[local898]];
				if (local907 >= 0) {
					this.anIntArrayArray35[local907][local2853[local907]++] = local898;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
	private void method5889() {
		if (this.aClass356Array1 == null) {
			return;
		}
		@Pc(8) Class117_Sub3 local8 = this.aClass126_Sub3_25.aClass117_Sub3_2;
		this.aClass126_Sub3_25.method7142();
		this.aClass126_Sub3_25.C(!this.aBoolean551);
		this.aClass126_Sub3_25.method7102(false);
		this.aClass126_Sub3_25.method7067(this.aClass126_Sub3_25.aClass159_14, this.aClass126_Sub3_25.aClass159_13, (Class159) null, (Class159) null);
		for (@Pc(42) int local42 = 0; local42 < this.anInt6651; local42++) {
			@Pc(49) Class356 local49 = this.aClass356Array1[local42];
			@Pc(54) Class25 local54 = this.aClass25Array1[local42];
			if (!local49.aBoolean788 || !this.aClass126_Sub3_25.method7025()) {
				@Pc(82) float local82 = (float) (this.anIntArray525[local49.anInt9779] + this.anIntArray525[local49.anInt9784] + this.anIntArray525[local49.anInt9778]) * 0.3333333F;
				@Pc(103) float local103 = (float) (this.anIntArray521[local49.anInt9784] + this.anIntArray521[local49.anInt9778] + this.anIntArray521[local49.anInt9779]) * 0.3333333F;
				@Pc(124) float local124 = (float) (this.anIntArray524[local49.anInt9779] + this.anIntArray524[local49.anInt9778] + this.anIntArray524[local49.anInt9784]) * 0.3333333F;
				@Pc(138) float local138 = Static584.aFloat197 + local103 * Static111.aFloat21 + Static169.aFloat38 * local82 + local124 * Static519.aFloat144;
				@Pc(152) float local152 = Static642.aFloat206 * local124 + Static290.aFloat70 * local82 + local103 * Static557.aFloat193 + Static30.aFloat8;
				@Pc(166) float local166 = local124 * Static649.aFloat207 + local103 * Static563.aFloat195 + Static584.aFloat196 * local82 + Static234.aFloat47;
				@Pc(187) float local187 = (float) (1.0D / Math.sqrt((double) (local166 * local166 + local152 * local152 + local138 * local138))) * (float) local49.anInt9783;
				local8.method7268((float) local54.anInt602 + local152 * local187 - local152, (float) local54.anInt601 + local138 - local138 * local187, local187 * local166 - local166, local54.anInt603 * local49.aShort124 >> 7, local54.anInt608, local54.anInt604 * local49.aShort126 >> 7);
				this.aClass126_Sub3_25.method7072(local8);
				@Pc(238) int local238 = local54.anInt609;
				OpenGL.glColor4ub((byte) (local238 >> 16), (byte) (local238 >> 8), (byte) local238, (byte) (local238 >> 24));
				this.aClass126_Sub3_25.method7106(local49.aShort125);
				this.aClass126_Sub3_25.method7109(local49.aByte130);
				this.aClass126_Sub3_25.method7100(4);
			}
		}
		this.aClass126_Sub3_25.C(true);
		this.aClass126_Sub3_25.method7064();
	}

	@OriginalMember(owner = "client!nk", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort86 = (short) arg0;
		if (this.aClass159_9 != null) {
			this.aClass159_9.anInterface7_2 = null;
		}
		if (this.aClass159_10 != null) {
			this.aClass159_10.anInterface7_2 = null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "()V")
	@Override
	protected void method7936() {
	}

	@OriginalMember(owner = "client!nk", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6639; local7++) {
			if (arg0 == this.aShortArray96[local7]) {
				this.aShortArray96[local7] = arg1;
			}
		}
		if (this.aClass356Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt6651; local34++) {
				@Pc(41) Class356 local41 = this.aClass356Array1[local34];
				@Pc(46) Class25 local46 = this.aClass25Array1[local34];
				local46.anInt609 = Static643.anIntArray836[this.aShortArray96[local41.anInt9781] & 0xFFFF] & 0xFFFFFF | local46.anInt609 & 0xFF000000;
			}
		}
		if (this.aClass159_9 != null) {
			this.aClass159_9.anInterface7_2 = null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean550;
	}

	@OriginalMember(owner = "client!nk", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub12_Sub1.anIntArray748[arg0];
		@Pc(13) int local13 = Class5_Sub12_Sub1.anIntArray749[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6659; local15++) {
			@Pc(34) int local34 = this.anIntArray521[local15] * local9 + this.anIntArray525[local15] * local13 >> 14;
			this.anIntArray521[local15] = local13 * this.anIntArray521[local15] - this.anIntArray525[local15] * local9 >> 14;
			this.anIntArray525[local15] = local34;
		}
		this.aBoolean552 = false;
		if (this.aClass159_11 != null) {
			this.aClass159_11.anInterface7_2 = null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean552) {
			this.method5897();
		}
		return this.aShort88;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V")
	private void method5890() {
		if (!this.aBoolean548) {
			return;
		}
		this.aBoolean548 = false;
		if (this.aClass57Array3 == null && this.aClass143Array3 == null && this.aClass356Array1 == null) {
			if (this.anIntArray525 != null && !Static580.method8712(this.anInt6670, this.anInt6649)) {
				if (this.aClass159_11 != null && this.aClass159_11.anInterface7_2 == null) {
					this.aBoolean548 = true;
				} else {
					if (!this.aBoolean552) {
						this.method5897();
					}
					this.anIntArray525 = null;
				}
			}
			if (this.anIntArray521 != null && !Static106.method1539(this.anInt6649, this.anInt6670)) {
				if (this.aClass159_11 != null && this.aClass159_11.anInterface7_2 == null) {
					this.aBoolean548 = true;
				} else {
					if (!this.aBoolean552) {
						this.method5897();
					}
					this.anIntArray521 = null;
				}
			}
			if (this.anIntArray524 != null && !Static124.method8858(this.anInt6649, this.anInt6670)) {
				if (this.aClass159_11 != null && this.aClass159_11.anInterface7_2 == null) {
					this.aBoolean548 = true;
				} else {
					if (!this.aBoolean552) {
						this.method5897();
					}
					this.anIntArray524 = null;
				}
			}
		}
		if (this.aShortArray93 != null && this.anIntArray525 == null && this.anIntArray521 == null && this.anIntArray524 == null) {
			this.anIntArray522 = null;
			this.aShortArray93 = null;
		}
		if (this.aByteArray51 != null && !Static179.method2901(this.anInt6670, this.anInt6649)) {
			if (this.aClass159_10 == null) {
				if (this.aClass159_9 != null && this.aClass159_9.anInterface7_2 == null) {
					this.aBoolean548 = true;
				} else {
					this.aShortArray97 = this.aShortArray98 = this.aShortArray92 = null;
					this.aByteArray51 = null;
				}
			} else if (this.aClass159_10.anInterface7_2 == null) {
				this.aBoolean548 = true;
			} else {
				this.aShortArray97 = this.aShortArray98 = this.aShortArray92 = null;
				this.aByteArray51 = null;
			}
		}
		if (this.aShortArray96 != null && !Static97.method1451(this.anInt6670, this.anInt6649)) {
			if (this.aClass159_9 != null && this.aClass159_9.anInterface7_2 == null) {
				this.aBoolean548 = true;
			} else {
				this.aShortArray96 = null;
			}
		}
		if (this.aByteArray50 != null && !Static225.method3512(this.anInt6670, this.anInt6649)) {
			if (this.aClass159_9 != null && this.aClass159_9.anInterface7_2 == null) {
				this.aBoolean548 = true;
			} else {
				this.aByteArray50 = null;
			}
		}
		if (this.aFloatArray47 != null && !Static257.method3957(this.anInt6649, this.anInt6670)) {
			if (this.aClass159_12 != null && this.aClass159_12.anInterface7_2 == null) {
				this.aBoolean548 = true;
			} else {
				this.aFloatArray47 = this.aFloatArray46 = null;
			}
		}
		if (this.aShortArray88 != null && !Static563.method7913(this.anInt6649, this.anInt6670)) {
			if (this.aClass159_9 != null && this.aClass159_9.anInterface7_2 == null) {
				this.aBoolean548 = true;
			} else {
				this.aShortArray88 = null;
			}
		}
		if (this.aShortArray91 != null && !Static58.method968(this.anInt6670, this.anInt6649)) {
			if ((this.aClass355_1 == null || this.aClass355_1.anInterface2_4 != null) && (this.aClass159_9 == null || this.aClass159_9.anInterface7_2 != null)) {
				this.aShortArray91 = this.aShortArray94 = this.aShortArray90 = null;
			} else {
				this.aBoolean548 = true;
			}
		}
		if (this.anIntArrayArray35 != null && !Static149.method2192(this.anInt6670, this.anInt6649)) {
			this.aShortArray95 = null;
			this.anIntArrayArray35 = null;
		}
		if (this.anIntArrayArray33 != null && !Static407.method6234(this.anInt6670, this.anInt6649)) {
			this.aShortArray89 = null;
			this.anIntArrayArray33 = null;
		}
		if (this.anIntArrayArray34 != null && !Static243.method3691(this.anInt6649, this.anInt6670)) {
			this.anIntArrayArray34 = null;
		}
		if (this.anIntArray523 != null && (this.anInt6670 & 0x800) == 0 && (this.anInt6670 & 0x40000) == 0) {
			this.anIntArray523 = null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface8 local9 = this.aClass126_Sub3_25.anInterface8_10;
		for (@Pc(11) int local11 = 0; local11 < this.anInt6639; local11++) {
			if (this.aShortArray88[local11] == arg0) {
				this.aShortArray88[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(44) Class321 local44 = local9.method7813(arg0 & 0xFFFF);
			local31 = local44.aByte117;
			local33 = local44.aByte116;
		}
		@Pc(52) byte local52 = 0;
		@Pc(54) byte local54 = 0;
		if (arg1 != -1) {
			@Pc(65) Class321 local65 = local9.method7813(arg1 & 0xFFFF);
			local52 = local65.aByte117;
			if (local65.aByte119 != 0 || local65.aByte118 != 0) {
				this.aBoolean550 = true;
			}
			local54 = local65.aByte116;
		}
		if (!(local52 != local31 | local33 != local54)) {
			return;
		}
		if (this.aClass356Array1 != null) {
			for (@Pc(103) int local103 = 0; local103 < this.anInt6651; local103++) {
				@Pc(110) Class356 local110 = this.aClass356Array1[local103];
				@Pc(115) Class25 local115 = this.aClass25Array1[local103];
				local115.anInt609 = Static643.anIntArray836[this.aShortArray96[local110.anInt9781] & 0xFFFF] & 0xFFFFFF | local115.anInt609 & 0xFF000000;
			}
		}
		if (this.aClass159_9 != null) {
			this.aClass159_9.anInterface7_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!ofa;Lclient!vh;II)V")
	@Override
	public void method7950(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class14_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6640 == 0) {
			return;
		}
		@Pc(13) Class117_Sub3 local13 = this.aClass126_Sub3_25.aClass117_Sub3_3;
		if (!this.aBoolean552) {
			this.method5897();
		}
		@Pc(22) Class117_Sub3 local22 = (Class117_Sub3) arg0;
		Static563.aFloat195 = local13.aFloat185 * local22.aFloat179 + local13.aFloat180 * local22.aFloat182 + local22.aFloat185 * local13.aFloat186;
		Static234.aFloat47 = local13.aFloat188 + local22.aFloat188 * local13.aFloat186 + local22.aFloat178 * local13.aFloat185 + local13.aFloat180 * local22.aFloat181;
		@Pc(69) float local69 = (float) this.aShort90 * Static563.aFloat195 + Static234.aFloat47;
		@Pc(77) float local77 = Static234.aFloat47 + Static563.aFloat195 * (float) this.aShort93;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local69 > local77) {
			local94 = local77 - (float) this.aShort88;
			local87 = (float) this.aShort88 + local69;
		} else {
			local87 = (float) this.aShort88 + local77;
			local94 = (float) -this.aShort88 + local69;
		}
		if (local94 >= this.aClass126_Sub3_25.aFloat176 || (float) this.aClass126_Sub3_25.anInt8304 >= local87) {
			return;
		}
		Static584.aFloat197 = local13.aFloat182 * local22.aFloat178 + local13.aFloat187 * local22.aFloat181 + local13.aFloat183 * local22.aFloat188 + local13.aFloat181;
		Static111.aFloat21 = local13.aFloat182 * local22.aFloat179 + local13.aFloat187 * local22.aFloat182 + local13.aFloat183 * local22.aFloat185;
		@Pc(170) float local170 = (float) this.aShort90 * Static111.aFloat21 + Static584.aFloat197;
		@Pc(178) float local178 = Static584.aFloat197 + Static111.aFloat21 * (float) this.aShort93;
		@Pc(204) float local204;
		@Pc(193) float local193;
		if (local170 > local178) {
			local193 = ((float) this.aShort88 + local170) * (float) this.aClass126_Sub3_25.anInt8293;
			local204 = (float) this.aClass126_Sub3_25.anInt8293 * (local178 - (float) this.aShort88);
		} else {
			local204 = (float) this.aClass126_Sub3_25.anInt8293 * (local170 - (float) this.aShort88);
			local193 = (local178 + (float) this.aShort88) * (float) this.aClass126_Sub3_25.anInt8293;
		}
		if (this.aClass126_Sub3_25.aFloat158 <= local204 / (float) arg2 || local193 / (float) arg2 <= this.aClass126_Sub3_25.aFloat171) {
			return;
		}
		Static30.aFloat8 = local13.aFloat178 + local13.aFloat179 * local22.aFloat178 + local13.aFloat177 * local22.aFloat181 + local13.aFloat184 * local22.aFloat188;
		Static557.aFloat193 = local22.aFloat179 * local13.aFloat179 + local22.aFloat182 * local13.aFloat177 + local13.aFloat184 * local22.aFloat185;
		@Pc(295) float local295 = (float) this.aShort90 * Static557.aFloat193 + Static30.aFloat8;
		@Pc(303) float local303 = (float) this.aShort93 * Static557.aFloat193 + Static30.aFloat8;
		@Pc(330) float local330;
		@Pc(318) float local318;
		if (local303 < local295) {
			local330 = (float) this.aClass126_Sub3_25.anInt8292 * ((float) -this.aShort88 + local303);
			local318 = (local295 + (float) this.aShort88) * (float) this.aClass126_Sub3_25.anInt8292;
		} else {
			local318 = (float) this.aClass126_Sub3_25.anInt8292 * (local303 + (float) this.aShort88);
			local330 = ((float) -this.aShort88 + local295) * (float) this.aClass126_Sub3_25.anInt8292;
		}
		if (local330 / (float) arg2 >= this.aClass126_Sub3_25.aFloat167 || this.aClass126_Sub3_25.aFloat175 >= local318 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass356Array1 != null) {
			Static642.aFloat206 = local22.aFloat184 * local13.aFloat179 + local13.aFloat177 * local22.aFloat183 + local13.aFloat184 * local22.aFloat186;
			Static169.aFloat38 = local22.aFloat187 * local13.aFloat187 + local13.aFloat182 * local22.aFloat177 + local13.aFloat183 * local22.aFloat180;
			Static519.aFloat144 = local22.aFloat183 * local13.aFloat187 + local13.aFloat182 * local22.aFloat184 + local22.aFloat186 * local13.aFloat183;
			Static649.aFloat207 = local13.aFloat186 * local22.aFloat186 + local13.aFloat185 * local22.aFloat184 + local13.aFloat180 * local22.aFloat183;
			Static584.aFloat196 = local22.aFloat180 * local13.aFloat186 + local13.aFloat185 * local22.aFloat177 + local13.aFloat180 * local22.aFloat187;
			Static290.aFloat70 = local13.aFloat184 * local22.aFloat180 + local13.aFloat177 * local22.aFloat187 + local13.aFloat179 * local22.aFloat177;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.aShort89 + this.aShort84 >> 1;
			@Pc(507) int local507 = this.aShort92 + this.aShort91 >> 1;
			@Pc(526) int local526 = (int) (Static519.aFloat144 * (float) local507 + (float) local499 * Static169.aFloat38 + Static584.aFloat197 + (float) this.aShort90 * Static111.aFloat21);
			@Pc(545) int local545 = (int) (Static30.aFloat8 + (float) local499 * Static290.aFloat70 + Static557.aFloat193 * (float) this.aShort90 + (float) local507 * Static642.aFloat206);
			@Pc(564) int local564 = (int) ((float) local507 * Static649.aFloat207 + Static234.aFloat47 + (float) local499 * Static584.aFloat196 + (float) this.aShort90 * Static563.aFloat195);
			@Pc(583) int local583 = (int) ((float) local507 * Static519.aFloat144 + Static584.aFloat197 + Static169.aFloat38 * (float) local499 + Static111.aFloat21 * (float) this.aShort93);
			@Pc(602) int local602 = (int) (Static642.aFloat206 * (float) local507 + Static290.aFloat70 * (float) local499 + Static30.aFloat8 + Static557.aFloat193 * (float) this.aShort93);
			arg1.anInt9896 = this.aClass126_Sub3_25.anInt8301 + local583 * this.aClass126_Sub3_25.anInt8293 / arg2;
			arg1.anInt9897 = this.aClass126_Sub3_25.anInt8313 + local545 * this.aClass126_Sub3_25.anInt8292 / arg2;
			arg1.anInt9898 = this.aClass126_Sub3_25.anInt8301 + this.aClass126_Sub3_25.anInt8293 * local526 / arg2;
			arg1.anInt9894 = this.aClass126_Sub3_25.anInt8292 * local602 / arg2 + this.aClass126_Sub3_25.anInt8313;
			@Pc(675) int local675 = (int) (Static563.aFloat195 * (float) this.aShort93 + Static584.aFloat196 * (float) local499 + Static234.aFloat47 + (float) local507 * Static649.aFloat207);
			if (this.aClass126_Sub3_25.anInt8304 <= local564 || this.aClass126_Sub3_25.anInt8304 <= local675) {
				arg1.aBoolean809 = true;
				arg1.anInt9895 = this.aClass126_Sub3_25.anInt8301 + this.aClass126_Sub3_25.anInt8293 * (this.aShort88 + local526) / arg2 - arg1.anInt9898;
			}
		}
		this.aClass126_Sub3_25.method7091((float) arg2);
		this.aClass126_Sub3_25.method7078();
		this.aClass126_Sub3_25.method7069(local22);
		this.method5896();
		this.aClass126_Sub3_25.method7064();
		this.method5889();
	}

	@OriginalMember(owner = "client!nk", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort87;
	}

	@OriginalMember(owner = "client!nk", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static163.anInt2844 = 0;
			Static445.anInt7508 = 0;
			Static492.anInt8424 = 0;
			local18 = 0;
			for (local20 = 0; local20 < this.anInt6659; local20++) {
				Static492.anInt8424 += this.anIntArray525[local20];
				Static445.anInt7508 += this.anIntArray521[local20];
				Static163.anInt2844 += this.anIntArray524[local20];
				local18++;
			}
			if (local18 <= 0) {
				Static445.anInt7508 = arg2;
				Static492.anInt8424 = arg1;
				Static163.anInt2844 = arg3;
			} else {
				Static492.anInt8424 = arg1 + Static492.anInt8424 / local18;
				Static445.anInt7508 = arg2 + Static445.anInt7508 / local18;
				Static163.anInt2844 = arg3 + Static163.anInt2844 / local18;
			}
		} else if (arg0 == 1) {
			for (local18 = 0; local18 < this.anInt6659; local18++) {
				this.anIntArray525[local18] += arg1;
				this.anIntArray521[local18] += arg2;
				this.anIntArray524[local18] += arg3;
			}
		} else {
			@Pc(164) int local164;
			@Pc(182) int local182;
			if (arg0 == 2) {
				for (local18 = 0; local18 < this.anInt6659; local18++) {
					this.anIntArray525[local18] -= Static492.anInt8424;
					this.anIntArray521[local18] -= Static445.anInt7508;
					this.anIntArray524[local18] -= Static163.anInt2844;
					if (arg3 != 0) {
						local20 = Class5_Sub12_Sub1.anIntArray748[arg3];
						local164 = Class5_Sub12_Sub1.anIntArray749[arg3];
						local182 = this.anIntArray525[local18] * local164 + this.anIntArray521[local18] * local20 + 16383 >> 14;
						this.anIntArray521[local18] = this.anIntArray521[local18] * local164 + 16383 - this.anIntArray525[local18] * local20 >> 14;
						this.anIntArray525[local18] = local182;
					}
					if (arg1 != 0) {
						local20 = Class5_Sub12_Sub1.anIntArray748[arg1];
						local164 = Class5_Sub12_Sub1.anIntArray749[arg1];
						local182 = this.anIntArray521[local18] * local164 + 16383 - local20 * this.anIntArray524[local18] >> 14;
						this.anIntArray524[local18] = this.anIntArray524[local18] * local164 + this.anIntArray521[local18] * local20 + 16383 >> 14;
						this.anIntArray521[local18] = local182;
					}
					if (arg2 != 0) {
						local20 = Class5_Sub12_Sub1.anIntArray748[arg2];
						local164 = Class5_Sub12_Sub1.anIntArray749[arg2];
						local182 = this.anIntArray524[local18] * local20 + local164 * this.anIntArray525[local18] + 16383 >> 14;
						this.anIntArray524[local18] = this.anIntArray524[local18] * local164 + 16383 - local20 * this.anIntArray525[local18] >> 14;
						this.anIntArray525[local18] = local182;
					}
					this.anIntArray525[local18] += Static492.anInt8424;
					this.anIntArray521[local18] += Static445.anInt7508;
					this.anIntArray524[local18] += Static163.anInt2844;
				}
			} else if (arg0 == 3) {
				for (local18 = 0; local18 < this.anInt6659; local18++) {
					this.anIntArray525[local18] -= Static492.anInt8424;
					this.anIntArray521[local18] -= Static445.anInt7508;
					this.anIntArray524[local18] -= Static163.anInt2844;
					this.anIntArray525[local18] = arg1 * this.anIntArray525[local18] / 128;
					this.anIntArray521[local18] = arg2 * this.anIntArray521[local18] / 128;
					this.anIntArray524[local18] = this.anIntArray524[local18] * arg3 / 128;
					this.anIntArray525[local18] += Static492.anInt8424;
					this.anIntArray521[local18] += Static445.anInt7508;
					this.anIntArray524[local18] += Static163.anInt2844;
				}
			} else {
				@Pc(522) Class356 local522;
				@Pc(527) Class25 local527;
				if (arg0 == 5) {
					for (local18 = 0; local18 < this.anInt6639; local18++) {
						local20 = (this.aByteArray50[local18] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray50[local18] = (byte) local20;
					}
					if (this.aClass159_9 != null) {
						this.aClass159_9.anInterface7_2 = null;
					}
					if (this.aClass356Array1 != null) {
						for (local20 = 0; local20 < this.anInt6651; local20++) {
							local522 = this.aClass356Array1[local20];
							local527 = this.aClass25Array1[local20];
							local527.anInt609 = local527.anInt609 & 0xFFFFFF | 255 - (this.aByteArray50[local522.anInt9781] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local18 = 0; local18 < this.anInt6639; local18++) {
						local20 = this.aShortArray96[local18] & 0xFFFF;
						local164 = local20 >> 10 & 0x3F;
						local182 = local20 >> 7 & 0x7;
						local182 += arg2 / 4;
						@Pc(591) int local591 = arg1 + local164 & 0x3F;
						@Pc(595) int local595 = local20 & 0x7F;
						if (local182 < 0) {
							local182 = 0;
						} else if (local182 > 7) {
							local182 = 7;
						}
						local595 += arg3;
						if (local595 < 0) {
							local595 = 0;
						} else if (local595 > 127) {
							local595 = 127;
						}
						this.aShortArray96[local18] = (short) (local595 | local591 << 10 | local182 << 7);
					}
					if (this.aClass159_9 != null) {
						this.aClass159_9.anInterface7_2 = null;
					}
					if (this.aClass356Array1 != null) {
						for (local20 = 0; local20 < this.anInt6651; local20++) {
							local522 = this.aClass356Array1[local20];
							local527 = this.aClass25Array1[local20];
							local527.anInt609 = Static643.anIntArray836[this.aShortArray96[local522.anInt9781] & 0xFFFF] & 0xFFFFFF | local527.anInt609 & 0xFF000000;
						}
					}
				} else {
					@Pc(716) Class25 local716;
					if (arg0 == 8) {
						for (local18 = 0; local18 < this.anInt6651; local18++) {
							local716 = this.aClass25Array1[local18];
							local716.anInt601 += arg1;
							local716.anInt602 += arg2;
						}
					} else if (arg0 == 10) {
						for (local18 = 0; local18 < this.anInt6651; local18++) {
							local716 = this.aClass25Array1[local18];
							local716.anInt603 = arg2 * local716.anInt603 >> 7;
							local716.anInt604 = local716.anInt604 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local18 = 0; local18 < this.anInt6651; local18++) {
							local716 = this.aClass25Array1[local18];
							local716.anInt608 = local716.anInt608 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "()Z")
	@Override
	public boolean method7931() {
		if (this.aShortArray88 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray88.length; local12++) {
			if (this.aShortArray88[local12] != -1 && !this.aClass126_Sub3_25.anInterface8_10.method7811(this.aShortArray88[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nk", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean552) {
			this.method5897();
		}
		return this.aShort90;
	}

	@OriginalMember(owner = "client!nk", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean552) {
			this.method5897();
		}
		return this.aShort89;
	}

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class40 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean552) {
			this.method5897();
		}
		@Pc(16) int local16 = this.aShort89 + arg4;
		@Pc(21) int local21 = this.aShort84 + arg4;
		@Pc(27) int local27 = arg6 + this.aShort92;
		@Pc(33) int local33 = arg6 + this.aShort91;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9920 <= local21 + arg2.anInt9918 >> arg2.anInt9919 || local27 < 0 || arg2.anInt9918 + local33 >> arg2.anInt9919 >= arg2.anInt9923)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9920 <= local21 + arg3.anInt9918 >> arg3.anInt9919 || local27 < 0 || local33 + arg3.anInt9918 >> arg3.anInt9919 >= arg3.anInt9923) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9919;
			local21 = local21 + arg2.anInt9918 - 1 >> arg2.anInt9919;
			local27 >>= arg2.anInt9919;
			local33 = local33 + arg2.anInt9918 - 1 >> arg2.anInt9919;
			if (arg5 == arg2.method8442(local16, local27) && arg5 == arg2.method8442(local21, local27) && arg2.method8442(local16, local33) == arg5 && arg2.method8442(local21, local33) == arg5) {
				return;
			}
		}
		@Pc(285) int local285;
		if (arg0 == 1) {
			for (local285 = 0; local285 < this.anInt6659; local285++) {
				this.anIntArray521[local285] = this.anIntArray521[local285] + arg2.method8447(this.anIntArray525[local285] + arg4, this.anIntArray524[local285] + arg6) - arg5;
			}
		} else {
			@Pc(216) int local216;
			@Pc(227) int local227;
			if (arg0 == 2) {
				@Pc(211) short local211 = this.aShort90;
				if (local211 == 0) {
					return;
				}
				for (local216 = 0; local216 < this.anInt6659; local216++) {
					local227 = (this.anIntArray521[local216] << 16) / local211;
					if (local227 < arg1) {
						this.anIntArray521[local216] += (arg2.method8447(this.anIntArray525[local216] + arg4, arg6 + this.anIntArray524[local216]) - arg5) * (arg1 - local227) / arg1;
					}
				}
			} else {
				@Pc(309) int local309;
				if (arg0 == 3) {
					local285 = (arg1 & 0xFF) * 4;
					local216 = (arg1 >> 8 & 0xFF) * 4;
					local227 = (arg1 >> 16 & 0xFF) << 6;
					local309 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local285 >> 1) < 0 || arg2.anInt9920 << arg2.anInt9919 <= arg2.anInt9918 + (local285 >> 1) + arg4 || arg6 - (local216 >> 1) < 0 || arg6 + (local216 >> 1) + arg2.anInt9918 >= arg2.anInt9923 << arg2.anInt9919) {
						return;
					}
					this.method7938(arg2, local227, arg6, arg4, local285, local309, arg5, local216);
				} else if (arg0 == 4) {
					local285 = this.aShort93 - this.aShort90;
					for (local216 = 0; local216 < this.anInt6659; local216++) {
						this.anIntArray521[local216] = this.anIntArray521[local216] + arg3.method8447(this.anIntArray525[local216] + arg4, arg6 + this.anIntArray524[local216]) + local285 - arg5;
					}
				} else if (arg0 == 5) {
					local285 = this.aShort93 - this.aShort90;
					for (local216 = 0; local216 < this.anInt6659; local216++) {
						local227 = arg4 + this.anIntArray525[local216];
						local309 = this.anIntArray524[local216] + arg6;
						@Pc(417) int local417 = arg2.method8447(local227, local309);
						@Pc(423) int local423 = arg3.method8447(local227, local309);
						@Pc(431) int local431 = local417 - local423 - arg1;
						this.anIntArray521[local216] = local417 + ((this.anIntArray521[local216] << 8) / local285 * local431 >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass159_11 != null) {
			this.aClass159_11.anInterface7_2 = null;
		}
		this.aBoolean552 = false;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt6639; local3++) {
			local12 = this.aShortArray96[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			@Pc(56) int local56 = local12 & 0x7F;
			if (arg2 != -1) {
				local56 += arg3 * (arg2 - local56) >> 7;
			}
			this.aShortArray96[local3] = (short) (local56 | local24 << 7 | local18 << 10);
		}
		if (this.aClass356Array1 != null) {
			for (local12 = 0; local12 < this.anInt6651; local12++) {
				@Pc(109) Class356 local109 = this.aClass356Array1[local12];
				@Pc(114) Class25 local114 = this.aClass25Array1[local12];
				local114.anInt609 = local114.anInt609 & 0xFF000000 | Static643.anIntArray836[this.aShortArray96[local109.anInt9781] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass159_9 != null) {
			this.aClass159_9.anInterface7_2 = null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "()[Lclient!hi;")
	@Override
	public Class143[] method7935() {
		return this.aClass143Array3;
	}

	@OriginalMember(owner = "client!nk", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6659; local7++) {
			if (arg0 != 0) {
				this.anIntArray525[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray521[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray524[local7] += arg2;
			}
		}
		this.aBoolean552 = false;
		if (this.aClass159_11 != null) {
			this.aClass159_11.anInterface7_2 = null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean551;
	}

	@OriginalMember(owner = "client!nk", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			Static492.anInt8424 = 0;
			Static163.anInt2844 = 0;
			local28 = 0;
			Static445.anInt7508 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray33.length > local38) {
					local52 = this.anIntArrayArray33[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray89 == null || (this.aShortArray89[local60] & arg6) != 0) {
							Static492.anInt8424 += this.anIntArray525[local60];
							Static445.anInt7508 += this.anIntArray521[local60];
							local28++;
							Static163.anInt2844 += this.anIntArray524[local60];
						}
					}
				}
			}
			if (local28 > 0) {
				Static445.anInt7508 = Static445.anInt7508 / local28 + arg3;
				Static492.anInt8424 = Static492.anInt8424 / local28 + arg2;
				Static648.aBoolean842 = true;
				Static163.anInt2844 = arg4 + Static163.anInt2844 / local28;
			} else {
				Static492.anInt8424 = arg2;
				Static445.anInt7508 = arg3;
				Static163.anInt2844 = arg4;
			}
			return;
		}
		@Pc(251) int[] local251;
		@Pc(253) int local253;
		if (arg0 == 1) {
			if (arg7 != null) {
				local28 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
				local32 = arg2 * arg7[3] + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local38 = arg3 * arg7[7] + arg2 * arg7[6] + arg7[8] * arg4 + 8192 >> 14;
				arg4 = local38;
				arg2 = local28;
				arg3 = local32;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray33.length) {
					local251 = this.anIntArrayArray33[local32];
					for (local253 = 0; local253 < local251.length; local253++) {
						local54 = local251[local253];
						if (this.aShortArray89 == null || (this.aShortArray89[local54] & arg6) != 0) {
							this.anIntArray525[local54] += arg2;
							this.anIntArray521[local54] += arg3;
							this.anIntArray524[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(401) int local401;
		@Pc(420) int local420;
		@Pc(654) int local654;
		@Pc(663) int local663;
		@Pc(672) int local672;
		@Pc(676) int local676;
		@Pc(694) int local694;
		@Pc(1034) int local1034;
		@Pc(1042) int local1042;
		@Pc(1198) int local1198;
		@Pc(1224) int local1224;
		@Pc(1228) int local1228;
		@Pc(1237) int local1237;
		@Pc(1242) int local1242;
		@Pc(1246) int local1246;
		@Pc(1250) int local1250;
		@Pc(1252) int local1252;
		@Pc(1383) int[] local1383;
		@Pc(1385) int local1385;
		@Pc(1389) int local1389;
		@Pc(1393) int local1393;
		@Pc(1395) int local1395;
		@Pc(1527) int local1527;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (local32 < this.anIntArrayArray33.length) {
						local251 = this.anIntArrayArray33[local32];
						for (local253 = 0; local253 < local251.length; local253++) {
							local54 = local251[local253];
							if (this.aShortArray89 == null || (arg6 & this.aShortArray89[local54]) != 0) {
								this.anIntArray525[local54] -= Static492.anInt8424;
								this.anIntArray521[local54] -= Static445.anInt7508;
								this.anIntArray524[local54] -= Static163.anInt2844;
								if (arg4 != 0) {
									local60 = Class5_Sub12_Sub1.anIntArray748[arg4];
									local401 = Class5_Sub12_Sub1.anIntArray749[arg4];
									local420 = local60 * this.anIntArray521[local54] + local401 * this.anIntArray525[local54] + 16383 >> 14;
									this.anIntArray521[local54] = local401 * this.anIntArray521[local54] + 16383 - local60 * this.anIntArray525[local54] >> 14;
									this.anIntArray525[local54] = local420;
								}
								if (arg2 != 0) {
									local60 = Class5_Sub12_Sub1.anIntArray748[arg2];
									local401 = Class5_Sub12_Sub1.anIntArray749[arg2];
									local420 = this.anIntArray521[local54] * local401 + 16383 - this.anIntArray524[local54] * local60 >> 14;
									this.anIntArray524[local54] = this.anIntArray524[local54] * local401 + this.anIntArray521[local54] * local60 + 16383 >> 14;
									this.anIntArray521[local54] = local420;
								}
								if (arg3 != 0) {
									local60 = Class5_Sub12_Sub1.anIntArray748[arg3];
									local401 = Class5_Sub12_Sub1.anIntArray749[arg3];
									local420 = local60 * this.anIntArray524[local54] + this.anIntArray525[local54] * local401 + 16383 >> 14;
									this.anIntArray524[local54] = local401 * this.anIntArray524[local54] + 16383 - this.anIntArray525[local54] * local60 >> 14;
									this.anIntArray525[local54] = local420;
								}
								this.anIntArray525[local54] += Static492.anInt8424;
								this.anIntArray521[local54] += Static445.anInt7508;
								this.anIntArray524[local54] += Static163.anInt2844;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray33.length > local38) {
							local52 = this.anIntArrayArray33[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray89 == null || (this.aShortArray89[local60] & arg6) != 0) {
									local401 = this.anIntArray522[local60];
									local420 = this.anIntArray522[local60 + 1];
									for (local654 = local401; local654 < local420; local654++) {
										local663 = this.aShortArray93[local654] - 1;
										if (local663 == -1) {
											break;
										}
										if (arg4 != 0) {
											local672 = Class5_Sub12_Sub1.anIntArray748[arg4];
											local676 = Class5_Sub12_Sub1.anIntArray749[arg4];
											local694 = local676 * this.aShortArray97[local663] + local672 * this.aShortArray98[local663] + 16383 >> 14;
											this.aShortArray98[local663] = (short) (this.aShortArray98[local663] * local676 + 16383 - this.aShortArray97[local663] * local672 >> 14);
											this.aShortArray97[local663] = (short) local694;
										}
										if (arg2 != 0) {
											local672 = Class5_Sub12_Sub1.anIntArray748[arg2];
											local676 = Class5_Sub12_Sub1.anIntArray749[arg2];
											local694 = local676 * this.aShortArray98[local663] + 16383 - this.aShortArray92[local663] * local672 >> 14;
											this.aShortArray92[local663] = (short) (local672 * this.aShortArray98[local663] + local676 * this.aShortArray92[local663] + 16383 >> 14);
											this.aShortArray98[local663] = (short) local694;
										}
										if (arg3 != 0) {
											local672 = Class5_Sub12_Sub1.anIntArray748[arg3];
											local676 = Class5_Sub12_Sub1.anIntArray749[arg3];
											local694 = local672 * this.aShortArray92[local663] + this.aShortArray97[local663] * local676 + 16383 >> 14;
											this.aShortArray92[local663] = (short) (local676 * this.aShortArray92[local663] + 16383 - this.aShortArray97[local663] * local672 >> 14);
											this.aShortArray97[local663] = (short) local694;
										}
									}
								}
							}
						}
					}
					if (this.aClass159_10 == null && this.aClass159_9 != null) {
						this.aClass159_9.anInterface7_2 = null;
					}
					if (this.aClass159_10 != null) {
						this.aClass159_10.anInterface7_2 = null;
						return;
					}
				}
			} else {
				local28 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local253 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static648.aBoolean842) {
					local401 = arg7[3] * Static445.anInt7508 + Static492.anInt8424 * arg7[0] + Static163.anInt2844 * arg7[6] + 8192 >> 14;
					local420 = arg7[1] * Static492.anInt8424 + arg7[4] * Static445.anInt7508 + arg7[7] * Static163.anInt2844 + 8192 >> 14;
					local401 += local253;
					local420 += local54;
					local654 = Static163.anInt2844 * arg7[8] + arg7[2] * Static492.anInt8424 + arg7[5] * Static445.anInt7508 + 8192 >> 14;
					Static492.anInt8424 = local401;
					local654 += local60;
					Static445.anInt7508 = local420;
					Static648.aBoolean842 = false;
					Static163.anInt2844 = local654;
				}
				@Pc(1002) int[] local1002 = new int[9];
				local420 = Class5_Sub12_Sub1.anIntArray749[arg2];
				local654 = Class5_Sub12_Sub1.anIntArray748[arg2];
				local663 = Class5_Sub12_Sub1.anIntArray749[arg3];
				local672 = Class5_Sub12_Sub1.anIntArray748[arg3];
				local676 = Class5_Sub12_Sub1.anIntArray749[arg4];
				local694 = Class5_Sub12_Sub1.anIntArray748[arg4];
				local1034 = local676 * local654 + 8192 >> 14;
				local1042 = local694 * local654 + 8192 >> 14;
				local1002[1] = local672 * local1034 + local694 * -local663 + 8192 >> 14;
				local1002[6] = local1042 * local663 + local676 * -local672 + 8192 >> 14;
				local1002[7] = local663 * local1034 + local672 * local694 + 8192 >> 14;
				local1002[3] = local694 * local420 + 8192 >> 14;
				local1002[5] = -local654;
				local1002[4] = local420 * local676 + 8192 >> 14;
				local1002[0] = local663 * local676 + local1042 * local672 + 8192 >> 14;
				local1002[8] = local420 * local663 + 8192 >> 14;
				local1002[2] = local420 * local672 + 8192 >> 14;
				@Pc(1172) int local1172 = local1002[2] * -Static163.anInt2844 + -Static492.anInt8424 * local1002[0] + local1002[1] * -Static445.anInt7508 + 8192 >> 14;
				local1198 = -Static445.anInt7508 * local1002[4] + -Static492.anInt8424 * local1002[3] + -Static163.anInt2844 * local1002[5] + 8192 >> 14;
				local1224 = -Static492.anInt8424 * local1002[6] + -Static445.anInt7508 * local1002[7] + -Static163.anInt2844 * local1002[8] + 8192 >> 14;
				local1228 = Static492.anInt8424 + local1172;
				@Pc(1233) int local1233 = local1198 + Static445.anInt7508;
				local1237 = Static163.anInt2844 + local1224;
				@Pc(1240) int[] local1240 = new int[9];
				for (local1242 = 0; local1242 < 3; local1242++) {
					for (local1246 = 0; local1246 < 3; local1246++) {
						local1250 = 0;
						for (local1252 = 0; local1252 < 3; local1252++) {
							local1250 += local1002[local1242 * 3 + local1252] * arg7[local1252 + local1246 * 3];
						}
						local1240[local1246 + local1242 * 3] = local1250 + 8192 >> 14;
					}
				}
				local1246 = local1002[0] * local253 + local54 * local1002[1] + local60 * local1002[2] + 8192 >> 14;
				local1250 = local1002[5] * local60 + local1002[4] * local54 + local1002[3] * local253 + 8192 >> 14;
				local1250 += local1233;
				local1246 += local1228;
				local1252 = local1002[7] * local54 + local1002[6] * local253 + local1002[8] * local60 + 8192 >> 14;
				local1252 += local1237;
				local1383 = new int[9];
				for (local1385 = 0; local1385 < 3; local1385++) {
					for (local1389 = 0; local1389 < 3; local1389++) {
						local1393 = 0;
						for (local1395 = 0; local1395 < 3; local1395++) {
							local1393 += arg7[local1385 * 3 + local1395] * local1240[local1395 * 3 + local1389];
						}
						local1383[local1385 * 3 + local1389] = local1393 + 8192 >> 14;
					}
				}
				local1389 = arg7[1] * local1250 + local1246 * arg7[0] + local1252 * arg7[2] + 8192 >> 14;
				local1393 = local1252 * arg7[5] + arg7[3] * local1246 + local1250 * arg7[4] + 8192 >> 14;
				local1389 += local28;
				local1395 = arg7[8] * local1252 + arg7[7] * local1250 + local1246 * arg7[6] + 8192 >> 14;
				local1393 += local32;
				local1395 += local38;
				for (local1527 = 0; local1527 < local8; local1527++) {
					@Pc(1533) int local1533 = arg1[local1527];
					if (this.anIntArrayArray33.length > local1533) {
						@Pc(1547) int[] local1547 = this.anIntArrayArray33[local1533];
						for (@Pc(1549) int local1549 = 0; local1549 < local1547.length; local1549++) {
							@Pc(1555) int local1555 = local1547[local1549];
							if (this.aShortArray89 == null || (arg6 & this.aShortArray89[local1555]) != 0) {
								@Pc(1596) int local1596 = local1383[1] * this.anIntArray521[local1555] + local1383[0] * this.anIntArray525[local1555] + local1383[2] * this.anIntArray524[local1555] + 8192 >> 14;
								@Pc(1628) int local1628 = this.anIntArray521[local1555] * local1383[4] + local1383[3] * this.anIntArray525[local1555] + this.anIntArray524[local1555] * local1383[5] + 8192 >> 14;
								@Pc(1632) int local1632 = local1628 + local1393;
								@Pc(1636) int local1636 = local1596 + local1389;
								@Pc(1667) int local1667 = local1383[8] * this.anIntArray524[local1555] + local1383[6] * this.anIntArray525[local1555] + local1383[7] * this.anIntArray521[local1555] + 8192 >> 14;
								@Pc(1671) int local1671 = local1667 + local1395;
								this.anIntArray525[local1555] = local1636;
								this.anIntArray521[local1555] = local1632;
								this.anIntArray524[local1555] = local1671;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2607) Class356 local2607;
			@Pc(2612) Class25 local2612;
			if (arg0 == 5) {
				if (this.anIntArrayArray35 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray35.length) {
							local251 = this.anIntArrayArray35[local32];
							for (local253 = 0; local253 < local251.length; local253++) {
								local54 = local251[local253];
								if (this.aShortArray95 == null || (arg6 & this.aShortArray95[local54]) != 0) {
									local60 = (this.aByteArray50[local54] & 0xFF) + (arg2 * 8);
									if (local60 < 0) {
										local60 = 0;
									} else if (local60 > 255) {
										local60 = 255;
									}
									this.aByteArray50[local54] = (byte) local60;
									if (this.aClass159_9 != null) {
										this.aClass159_9.anInterface7_2 = null;
									}
								}
							}
						}
					}
					if (this.aClass356Array1 != null) {
						for (local32 = 0; local32 < this.anInt6651; local32++) {
							local2607 = this.aClass356Array1[local32];
							local2612 = this.aClass25Array1[local32];
							local2612.anInt609 = local2612.anInt609 & 0xFFFFFF | 255 - (this.aByteArray50[local2607.anInt9781] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2860) Class25 local2860;
				if (arg0 == 8) {
					if (this.anIntArrayArray34 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray34.length) {
								local251 = this.anIntArrayArray34[local32];
								for (local253 = 0; local253 < local251.length; local253++) {
									local2860 = this.aClass25Array1[local251[local253]];
									local2860.anInt602 += arg3;
									local2860.anInt601 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray34 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray34.length > local32) {
								local251 = this.anIntArrayArray34[local32];
								for (local253 = 0; local253 < local251.length; local253++) {
									local2860 = this.aClass25Array1[local251[local253]];
									local2860.anInt603 = local2860.anInt603 * arg3 >> 7;
									local2860.anInt604 = arg2 * local2860.anInt604 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray34 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray34.length) {
							local251 = this.anIntArrayArray34[local32];
							for (local253 = 0; local253 < local251.length; local253++) {
								local2860 = this.aClass25Array1[local251[local253]];
								local2860.anInt608 = local2860.anInt608 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray35 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray35.length > local32) {
						local251 = this.anIntArrayArray35[local32];
						for (local253 = 0; local253 < local251.length; local253++) {
							local54 = local251[local253];
							if (this.aShortArray95 == null || (this.aShortArray95[local54] & arg6) != 0) {
								local60 = this.aShortArray96[local54] & 0xFFFF;
								local401 = local60 >> 10 & 0x3F;
								local420 = local60 >> 7 & 0x7;
								@Pc(2705) int local2705 = local401 + arg2 & 0x3F;
								local420 += arg3 / 4;
								local654 = local60 & 0x7F;
								if (local420 < 0) {
									local420 = 0;
								} else if (local420 > 7) {
									local420 = 7;
								}
								local654 += arg4;
								if (local654 < 0) {
									local654 = 0;
								} else if (local654 > 127) {
									local654 = 127;
								}
								this.aShortArray96[local54] = (short) (local420 << 7 | local2705 << 10 | local654);
								if (this.aClass159_9 != null) {
									this.aClass159_9.anInterface7_2 = null;
								}
							}
						}
					}
				}
				if (this.aClass356Array1 != null) {
					for (local32 = 0; local32 < this.anInt6651; local32++) {
						local2607 = this.aClass356Array1[local32];
						local2612 = this.aClass25Array1[local32];
						local2612.anInt609 = Static643.anIntArray836[this.aShortArray96[local2607.anInt9781] & 0xFFFF] & 0xFFFFFF | local2612.anInt609 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray33.length) {
					local251 = this.anIntArrayArray33[local32];
					for (local253 = 0; local253 < local251.length; local253++) {
						local54 = local251[local253];
						if (this.aShortArray89 == null || (arg6 & this.aShortArray89[local54]) != 0) {
							this.anIntArray525[local54] -= Static492.anInt8424;
							this.anIntArray521[local54] -= Static445.anInt7508;
							this.anIntArray524[local54] -= Static163.anInt2844;
							this.anIntArray525[local54] = this.anIntArray525[local54] * arg2 >> 7;
							this.anIntArray521[local54] = this.anIntArray521[local54] * arg3 >> 7;
							this.anIntArray524[local54] = this.anIntArray524[local54] * arg4 >> 7;
							this.anIntArray525[local54] += Static492.anInt8424;
							this.anIntArray521[local54] += Static445.anInt7508;
							this.anIntArray524[local54] += Static163.anInt2844;
						}
					}
				}
			}
		} else {
			local28 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local253 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static648.aBoolean842) {
				local401 = Static445.anInt7508 * arg7[3] + Static492.anInt8424 * arg7[0] + Static163.anInt2844 * arg7[6] + 8192 >> 14;
				local420 = arg7[1] * Static492.anInt8424 + arg7[4] * Static445.anInt7508 + arg7[7] * Static163.anInt2844 + 8192 >> 14;
				local654 = Static163.anInt2844 * arg7[8] + Static445.anInt7508 * arg7[5] + arg7[2] * Static492.anInt8424 + 8192 >> 14;
				local401 += local253;
				local420 += local54;
				local654 += local60;
				Static492.anInt8424 = local401;
				Static445.anInt7508 = local420;
				Static648.aBoolean842 = false;
				Static163.anInt2844 = local654;
			}
			local401 = arg2 << 15 >> 7;
			local420 = arg3 << 15 >> 7;
			local654 = arg4 << 15 >> 7;
			local663 = local401 * -Static492.anInt8424 + 8192 >> 14;
			local672 = -Static445.anInt7508 * local420 + 8192 >> 14;
			local676 = -Static163.anInt2844 * local654 + 8192 >> 14;
			local694 = Static492.anInt8424 + local663;
			local1034 = local672 + Static445.anInt7508;
			local1042 = local676 + Static163.anInt2844;
			@Pc(2040) int[] local2040 = new int[] { local401 * arg7[0] + 8192 >> 14, local401 * arg7[3] + 8192 >> 14, local401 * arg7[6] + 8192 >> 14, arg7[1] * local420 + 8192 >> 14, arg7[4] * local420 + 8192 >> 14, local420 * arg7[7] + 8192 >> 14, local654 * arg7[2] + 8192 >> 14, local654 * arg7[5] + 8192 >> 14, local654 * arg7[8] + 8192 >> 14 };
			local1198 = local401 * local253 + 8192 >> 14;
			local1224 = local420 * local54 + 8192 >> 14;
			@Pc(2168) int local2168 = local1198 + local694;
			@Pc(2172) int local2172 = local1224 + local1034;
			local1228 = local654 * local60 + 8192 >> 14;
			@Pc(2184) int local2184 = local1228 + local1042;
			@Pc(2187) int[] local2187 = new int[9];
			@Pc(2193) int local2193;
			for (local1237 = 0; local1237 < 3; local1237++) {
				for (local2193 = 0; local2193 < 3; local2193++) {
					local1242 = 0;
					for (local1246 = 0; local1246 < 3; local1246++) {
						local1242 += local2040[local2193 + local1246 * 3] * arg7[local1246 + local1237 * 3];
					}
					local2187[local1237 * 3 + local2193] = local1242 + 8192 >> 14;
				}
			}
			local2193 = local2172 * arg7[1] + local2168 * arg7[0] + local2184 * arg7[2] + 8192 >> 14;
			local1242 = local2168 * arg7[3] + arg7[4] * local2172 + arg7[5] * local2184 + 8192 >> 14;
			local1246 = arg7[8] * local2184 + local2168 * arg7[6] + local2172 * arg7[7] + 8192 >> 14;
			local2193 += local28;
			local1242 += local32;
			local1246 += local38;
			for (local1250 = 0; local1250 < local8; local1250++) {
				local1252 = arg1[local1250];
				if (this.anIntArrayArray33.length > local1252) {
					local1383 = this.anIntArrayArray33[local1252];
					for (local1385 = 0; local1385 < local1383.length; local1385++) {
						local1389 = local1383[local1385];
						if (this.aShortArray89 == null || (this.aShortArray89[local1389] & arg6) != 0) {
							local1393 = this.anIntArray525[local1389] * local2187[0] + local2187[1] * this.anIntArray521[local1389] + local2187[2] * this.anIntArray524[local1389] + 8192 >> 14;
							local1395 = local2187[3] * this.anIntArray525[local1389] + local2187[4] * this.anIntArray521[local1389] + this.anIntArray524[local1389] * local2187[5] + 8192 >> 14;
							local1527 = this.anIntArray525[local1389] * local2187[6] + local2187[7] * this.anIntArray521[local1389] + local2187[8] * this.anIntArray524[local1389] + 8192 >> 14;
							@Pc(2468) int local2468 = local1395 + local1242;
							@Pc(2472) int local2472 = local1393 + local2193;
							@Pc(2476) int local2476 = local1527 + local1246;
							this.anIntArray525[local1389] = local2472;
							this.anIntArray521[local1389] = local2468;
							this.anIntArray524[local1389] = local2476;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILclient!ofa;ZI)Z")
	@Override
	public boolean method7946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method5898(arg3, arg0, arg4, -1, arg2, arg1);
	}

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub12_Sub1.anIntArray748[arg0];
		@Pc(13) int local13 = Class5_Sub12_Sub1.anIntArray749[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6659; local15++) {
			local33 = local13 * this.anIntArray525[local15] + this.anIntArray524[local15] * local9 >> 14;
			this.anIntArray524[local15] = local13 * this.anIntArray524[local15] - local9 * this.anIntArray525[local15] >> 14;
			this.anIntArray525[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt6640; local33++) {
			@Pc(87) int local87 = local13 * this.aShortArray97[local33] + this.aShortArray92[local33] * local9 >> 14;
			this.aShortArray92[local33] = (short) (this.aShortArray92[local33] * local13 - local9 * this.aShortArray97[local33] >> 14);
			this.aShortArray97[local33] = (short) local87;
		}
		if (this.aClass159_10 == null && this.aClass159_9 != null) {
			this.aClass159_9.anInterface7_2 = null;
		}
		if (this.aClass159_10 != null) {
			this.aClass159_10.anInterface7_2 = null;
		}
		if (this.aClass159_11 != null) {
			this.aClass159_11.anInterface7_2 = null;
		}
		this.aBoolean552 = false;
	}

	@OriginalMember(owner = "client!nk", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean552) {
			this.method5897();
		}
		return this.aShort85;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILclient!ofa;ZII)Z")
	@Override
	public boolean method7929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method5898(arg3, arg0, arg4, arg5, arg2, arg1);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIZIIIII)Z")
	private boolean method5892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < arg4 && arg7 > arg3 && arg6 > arg3) {
			return false;
		} else if (arg4 < arg3 && arg3 > arg7 && arg3 > arg6) {
			return false;
		} else if (arg2 > arg5 && arg5 < arg1 && arg5 < arg0) {
			return false;
		} else {
			return arg5 <= arg2 || arg5 <= arg1 || arg0 >= arg5;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class180 method7945(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(16) Class180_Sub2 local16;
		@Pc(12) Class180_Sub2 local12;
		if (arg0 == 1) {
			local12 = this.aClass126_Sub3_25.aClass180_Sub2_1;
			local16 = this.aClass126_Sub3_25.aClass180_Sub2_4;
		} else if (arg0 == 2) {
			local12 = this.aClass126_Sub3_25.aClass180_Sub2_5;
			local16 = this.aClass126_Sub3_25.aClass180_Sub2_7;
		} else if (arg0 == 3) {
			local12 = this.aClass126_Sub3_25.aClass180_Sub2_10;
			local16 = this.aClass126_Sub3_25.aClass180_Sub2_6;
		} else if (arg0 == 4) {
			local16 = this.aClass126_Sub3_25.aClass180_Sub2_2;
			local12 = this.aClass126_Sub3_25.aClass180_Sub2_9;
		} else if (arg0 == 5) {
			local16 = this.aClass126_Sub3_25.aClass180_Sub2_8;
			local12 = this.aClass126_Sub3_25.aClass180_Sub2_3;
		} else {
			local16 = local12 = new Class180_Sub2(this.aClass126_Sub3_25);
		}
		return this.method5900(arg2, arg1, local12, local16, arg0 != 0);
	}

	@OriginalMember(owner = "client!nk", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class5_Sub4_Sub10 ba(@OriginalArg(0) Class5_Sub4_Sub10 arg0) {
		if (this.anInt6640 == 0) {
			return null;
		}
		if (!this.aBoolean552) {
			this.method5897();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass126_Sub3_25.anInt8291 <= 0) {
			local43 = this.aShort89 - (this.aShort90 * this.aClass126_Sub3_25.anInt8291 >> 8) >> this.aClass126_Sub3_25.anInt8271;
			local60 = this.aShort84 - (this.aClass126_Sub3_25.anInt8291 * this.aShort93 >> 8) >> this.aClass126_Sub3_25.anInt8271;
		} else {
			local43 = this.aShort89 - (this.aClass126_Sub3_25.anInt8291 * this.aShort93 >> 8) >> this.aClass126_Sub3_25.anInt8271;
			local60 = this.aShort84 - (this.aClass126_Sub3_25.anInt8291 * this.aShort90 >> 8) >> this.aClass126_Sub3_25.anInt8271;
		}
		@Pc(116) int local116;
		@Pc(133) int local133;
		if (this.aClass126_Sub3_25.anInt8315 > 0) {
			local116 = this.aShort92 - (this.aClass126_Sub3_25.anInt8315 * this.aShort93 >> 8) >> this.aClass126_Sub3_25.anInt8271;
			local133 = this.aShort91 - (this.aClass126_Sub3_25.anInt8315 * this.aShort90 >> 8) >> this.aClass126_Sub3_25.anInt8271;
		} else {
			local116 = this.aShort92 - (this.aClass126_Sub3_25.anInt8315 * this.aShort90 >> 8) >> this.aClass126_Sub3_25.anInt8271;
			local133 = this.aShort91 - (this.aShort93 * this.aClass126_Sub3_25.anInt8315 >> 8) >> this.aClass126_Sub3_25.anInt8271;
		}
		@Pc(175) int local175 = local60 + 1 - local43;
		@Pc(182) int local182 = local133 + 1 - local116;
		@Pc(185) Class5_Sub4_Sub10_Sub1 local185 = (Class5_Sub4_Sub10_Sub1) arg0;
		@Pc(201) Class5_Sub4_Sub10_Sub1 local201;
		if (local185 != null && local185.method3390(local182, local175)) {
			local201 = local185;
			local185.method3388();
		} else {
			local201 = new Class5_Sub4_Sub10_Sub1(this.aClass126_Sub3_25, local175, local182);
		}
		local201.method3389(local60, local43, local133, local116);
		this.method5894(local201);
		return local201;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!ofa;IZ)V")
	@Override
	public void method7952(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray89 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6659; local14++) {
			if ((arg1 & this.aShortArray89[local14]) != 0) {
				if (arg2) {
					arg0.method7260(this.anIntArray525[local14], this.anIntArray521[local14], this.anIntArray524[local14], local12);
				} else {
					arg0.method7250(this.anIntArray525[local14], this.anIntArray521[local14], this.anIntArray524[local14], local12);
				}
				this.anIntArray525[local14] = local12[0];
				this.anIntArray521[local14] = local12[1];
				this.anIntArray524[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt6670;
	}

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "()[Lclient!cm;")
	@Override
	public Class57[] method7940() {
		return this.aClass57Array3;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!ofa;)V")
	@Override
	public void method7951(@OriginalArg(0) Class117 arg0) {
		@Pc(8) Class117_Sub3 local8 = (Class117_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass57Array3 != null) {
			for (local13 = 0; local13 < this.aClass57Array3.length; local13++) {
				@Pc(20) Class57 local20 = this.aClass57Array3[local13];
				@Pc(22) Class57 local22 = local20;
				if (local20.aClass57_1 != null) {
					local22 = local20.aClass57_1;
				}
				local22.anInt1262 = (int) (local8.aFloat181 + local8.aFloat183 * (float) this.anIntArray524[local20.anInt1261] + (float) this.anIntArray525[local20.anInt1261] * local8.aFloat187 + (float) this.anIntArray521[local20.anInt1261] * local8.aFloat182);
				local22.anInt1272 = (int) (local8.aFloat178 + local8.aFloat184 * (float) this.anIntArray524[local20.anInt1261] + (float) this.anIntArray521[local20.anInt1261] * local8.aFloat179 + (float) this.anIntArray525[local20.anInt1261] * local8.aFloat177);
				local22.anInt1271 = (int) (local8.aFloat188 + (float) this.anIntArray524[local20.anInt1261] * local8.aFloat186 + (float) this.anIntArray525[local20.anInt1261] * local8.aFloat180 + local8.aFloat185 * (float) this.anIntArray521[local20.anInt1261]);
				local22.anInt1267 = (int) (local8.aFloat183 * (float) this.anIntArray524[local20.anInt1265] + (float) this.anIntArray525[local20.anInt1265] * local8.aFloat187 + (float) this.anIntArray521[local20.anInt1265] * local8.aFloat182 + local8.aFloat181);
				local22.anInt1266 = (int) (local8.aFloat178 + local8.aFloat184 * (float) this.anIntArray524[local20.anInt1265] + local8.aFloat179 * (float) this.anIntArray521[local20.anInt1265] + local8.aFloat177 * (float) this.anIntArray525[local20.anInt1265]);
				local22.anInt1256 = (int) (local8.aFloat188 + local8.aFloat185 * (float) this.anIntArray521[local20.anInt1265] + (float) this.anIntArray525[local20.anInt1265] * local8.aFloat180 + local8.aFloat186 * (float) this.anIntArray524[local20.anInt1265]);
				local22.anInt1255 = (int) (local8.aFloat183 * (float) this.anIntArray524[local20.anInt1270] + local8.aFloat187 * (float) this.anIntArray525[local20.anInt1270] + local8.aFloat182 * (float) this.anIntArray521[local20.anInt1270] + local8.aFloat181);
				local22.anInt1257 = (int) (local8.aFloat178 + local8.aFloat179 * (float) this.anIntArray521[local20.anInt1270] + local8.aFloat177 * (float) this.anIntArray525[local20.anInt1270] + local8.aFloat184 * (float) this.anIntArray524[local20.anInt1270]);
				local22.anInt1269 = (int) (local8.aFloat188 + (float) this.anIntArray524[local20.anInt1270] * local8.aFloat186 + local8.aFloat185 * (float) this.anIntArray521[local20.anInt1270] + (float) this.anIntArray525[local20.anInt1270] * local8.aFloat180);
			}
		}
		if (this.aClass143Array3 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass143Array3.length; local13++) {
			@Pc(361) Class143 local361 = this.aClass143Array3[local13];
			@Pc(363) Class143 local363 = local361;
			if (local361.aClass143_1 != null) {
				local363 = local361.aClass143_1;
			}
			if (local361.aClass117_3 == null) {
				local361.aClass117_3 = local8.method7248();
			} else {
				local361.aClass117_3.method7253(local8);
			}
			local363.anInt3655 = (int) (local8.aFloat181 + (float) this.anIntArray524[local361.anInt3651] * local8.aFloat183 + (float) this.anIntArray525[local361.anInt3651] * local8.aFloat187 + local8.aFloat182 * (float) this.anIntArray521[local361.anInt3651]);
			local363.anInt3654 = (int) (local8.aFloat178 + local8.aFloat184 * (float) this.anIntArray524[local361.anInt3651] + (float) this.anIntArray521[local361.anInt3651] * local8.aFloat179 + local8.aFloat177 * (float) this.anIntArray525[local361.anInt3651]);
			local363.anInt3661 = (int) (local8.aFloat186 * (float) this.anIntArray524[local361.anInt3651] + local8.aFloat185 * (float) this.anIntArray521[local361.anInt3651] + (float) this.anIntArray525[local361.anInt3651] * local8.aFloat180 + local8.aFloat188);
		}
	}

	@OriginalMember(owner = "client!nk", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean552) {
			this.method5897();
		}
		return this.aShort91;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIBFLclient!ur;IIJFI)S")
	private short method5893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) Class349 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray522[arg5];
		@Pc(17) int local17 = this.anIntArray522[arg5 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray93[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static247.aLongArray6[local21] == arg6) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray93[local19] = (short) (this.anInt6640 + 1);
		Static247.aLongArray6[local19] = arg6;
		this.aShortArray97[this.anInt6640] = (short) arg8;
		this.aShortArray98[this.anInt6640] = (short) arg1;
		this.aShortArray92[this.anInt6640] = (short) arg0;
		this.aByteArray51[this.anInt6640] = (byte) arg4;
		this.aFloatArray47[this.anInt6640] = arg2;
		this.aFloatArray46[this.anInt6640] = arg7;
		return (short) this.anInt6640++;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "()V")
	@Override
	protected void method7934() {
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!hs;I)V")
	private void method5894(@OriginalArg(0) Class5_Sub4_Sub10_Sub1 arg0) {
		if (this.anInt6640 > this.aClass126_Sub3_25.anIntArray651.length) {
			this.aClass126_Sub3_25.anIntArray649 = new int[this.anInt6640];
			this.aClass126_Sub3_25.anIntArray651 = new int[this.anInt6640];
		}
		@Pc(28) int[] local28 = this.aClass126_Sub3_25.anIntArray651;
		@Pc(32) int[] local32 = this.aClass126_Sub3_25.anIntArray649;
		@Pc(60) int local60;
		@Pc(99) int local99;
		@Pc(108) int local108;
		for (@Pc(34) int local34 = 0; local34 < this.anInt6659; local34++) {
			local60 = (this.anIntArray525[local34] - (this.aClass126_Sub3_25.anInt8291 * this.anIntArray521[local34] >> 8) >> this.aClass126_Sub3_25.anInt8271) - arg0.anInt3787;
			@Pc(85) int local85 = (this.anIntArray524[local34] - (this.anIntArray521[local34] * this.aClass126_Sub3_25.anInt8315 >> 8) >> this.aClass126_Sub3_25.anInt8271) - arg0.anInt3784;
			@Pc(90) int local90 = this.anIntArray522[local34];
			@Pc(97) int local97 = this.anIntArray522[local34 + 1];
			for (local99 = local90; local99 < local97; local99++) {
				local108 = this.aShortArray93[local99] - 1;
				if (local108 == -1) {
					break;
				}
				local28[local108] = local60;
				local32[local108] = local85;
			}
		}
		for (local60 = 0; local60 < this.anInt6630; local60++) {
			if (this.aByteArray50 == null || this.aByteArray50[local60] <= 128) {
				@Pc(155) short local155 = this.aShortArray91[local60];
				@Pc(160) short local160 = this.aShortArray94[local60];
				@Pc(165) short local165 = this.aShortArray90[local60];
				local99 = local28[local155];
				local108 = local28[local160];
				@Pc(177) int local177 = local28[local165];
				@Pc(181) int local181 = local32[local155];
				@Pc(185) int local185 = local32[local160];
				@Pc(189) int local189 = local32[local165];
				if (-((local185 - local181) * (-local108 + local177)) + (local99 - local108) * (local185 - local189) > 0) {
					arg0.method3387(local108, local181, local99, local189, local177, local185);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)V")
	private void method5895(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass159_9 != null && this.aClass159_9.anInterface7_2 == null;
		@Pc(27) boolean local27 = this.aClass159_10 != null && this.aClass159_10.anInterface7_2 == null;
		@Pc(38) boolean local38 = this.aClass159_11 != null && this.aClass159_11.anInterface7_2 == null;
		@Pc(49) boolean local49 = this.aClass159_12 != null && this.aClass159_12.anInterface7_2 == null;
		if (arg0) {
			local38 &= (this.aByte90 & 0x1) != 0;
			local27 &= (this.aByte90 & 0x4) != 0;
			local16 &= (this.aByte90 & 0x2) != 0;
			local49 &= (this.aByte90 & 0x8) != 0;
		}
		@Pc(103) byte local103 = 0;
		@Pc(107) byte local107 = 0;
		@Pc(109) byte local109 = 0;
		@Pc(111) byte local111 = 0;
		if (local38) {
			local103 = 12;
		}
		if (local16) {
			local107 = local103;
			local103 = (byte) (local103 + 4);
		}
		if (local27) {
			local109 = local103;
			local103 = (byte) (local103 + 12);
		}
		if (local49) {
			local111 = local103;
			local103 = (byte) (local103 + 8);
		}
		if (local103 == 0) {
			return;
		}
		if (this.aClass126_Sub3_25.aClass5_Sub12_Sub1_2.aByteArray104.length >= this.anInt6640 * local103) {
			this.aClass126_Sub3_25.aClass5_Sub12_Sub1_2.anInt10154 = 0;
		} else {
			this.aClass126_Sub3_25.aClass5_Sub12_Sub1_2 = new Class5_Sub12_Sub1((this.anInt6640 + 100) * local103);
		}
		@Pc(183) Class5_Sub12_Sub1 local183 = this.aClass126_Sub3_25.aClass5_Sub12_Sub1_2;
		@Pc(191) int local191;
		@Pc(200) int local200;
		@Pc(228) int local228;
		@Pc(237) int local237;
		if (local38) {
			@Pc(207) int local207;
			@Pc(214) int local214;
			@Pc(219) int local219;
			@Pc(226) int local226;
			if (this.aClass126_Sub3_25.aBoolean674) {
				for (local191 = 0; local191 < this.anInt6659; local191++) {
					local200 = Stream.floatToRawIntBits((float) this.anIntArray525[local191]);
					local207 = Stream.floatToRawIntBits((float) this.anIntArray521[local191]);
					local214 = Stream.floatToRawIntBits((float) this.anIntArray524[local191]);
					local219 = this.anIntArray522[local191];
					local226 = this.anIntArray522[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray93[local228] - 1;
						if (local237 == -1) {
							break;
						}
						local183.anInt10154 = local237 * local103;
						local183.method8622(local200);
						local183.method8622(local207);
						local183.method8622(local214);
					}
				}
			} else {
				for (local191 = 0; local191 < this.anInt6659; local191++) {
					local200 = Stream.floatToRawIntBits((float) this.anIntArray525[local191]);
					local207 = Stream.floatToRawIntBits((float) this.anIntArray521[local191]);
					local214 = Stream.floatToRawIntBits((float) this.anIntArray524[local191]);
					local219 = this.anIntArray522[local191];
					local226 = this.anIntArray522[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray93[local228] - 1;
						if (local237 == -1) {
							break;
						}
						local183.anInt10154 = local237 * local103;
						local183.method8613(local200);
						local183.method8613(local207);
						local183.method8613(local214);
					}
				}
			}
		}
		@Pc(493) float local493;
		@Pc(369) short[] local369;
		@Pc(372) short[] local372;
		@Pc(375) short[] local375;
		@Pc(366) byte[] local366;
		@Pc(526) float local526;
		if (local16) {
			if (this.aClass159_10 == null) {
				if (this.aClass261_1 == null) {
					local366 = this.aByteArray51;
					local369 = this.aShortArray97;
					local372 = this.aShortArray98;
					local375 = this.aShortArray92;
				} else {
					local369 = this.aClass261_1.aShortArray103;
					local375 = this.aClass261_1.aShortArray102;
					local366 = this.aClass261_1.aByteArray55;
					local372 = this.aClass261_1.aShortArray104;
				}
				@Pc(399) float local399 = this.aClass126_Sub3_25.aFloatArray65[0];
				@Pc(405) float local405 = this.aClass126_Sub3_25.aFloatArray65[1];
				@Pc(411) float local411 = this.aClass126_Sub3_25.aFloatArray65[2];
				@Pc(415) float local415 = this.aClass126_Sub3_25.aFloat163;
				@Pc(425) float local425 = this.aClass126_Sub3_25.aFloat156 * 768.0F / (float) this.aShort86;
				@Pc(435) float local435 = this.aClass126_Sub3_25.aFloat159 * 768.0F / (float) this.aShort86;
				for (@Pc(437) int local437 = 0; local437 < this.anInt6639; local437++) {
					@Pc(457) int local457 = this.method5901(this.aShortArray96[local437], this.aShortArray88[local437], this.aShort87, this.aByteArray50[local437]);
					@Pc(466) float local466 = (float) (local457 >>> 24) * this.aClass126_Sub3_25.aFloat164;
					@Pc(477) float local477 = (float) (local457 >> 8 & 0xFF) * this.aClass126_Sub3_25.aFloat165;
					@Pc(482) short local482 = this.aShortArray91[local437];
					local493 = (float) (local457 >> 16 & 0xFF) * this.aClass126_Sub3_25.aFloat161;
					@Pc(498) short local498 = (short) local366[local482];
					if (local498 == 0) {
						local526 = (local411 * (float) local375[local482] + (float) local372[local482] * local405 + local399 * (float) local369[local482]) * 0.0026041667F;
					} else {
						local526 = (local405 * (float) local372[local482] + (float) local369[local482] * local399 + (float) local375[local482] * local411) / (float) (local498 * 256);
					}
					@Pc(566) float local566 = local526 * (local526 < 0.0F ? local435 : local425) + local415;
					@Pc(571) int local571 = (int) (local566 * local466);
					@Pc(576) int local576 = (int) (local493 * local566);
					if (local571 < 0) {
						local571 = 0;
					} else if (local571 > 255) {
						local571 = 255;
					}
					@Pc(592) int local592 = (int) (local477 * local566);
					if (local576 < 0) {
						local576 = 0;
					} else if (local576 > 255) {
						local576 = 255;
					}
					if (local592 < 0) {
						local592 = 0;
					} else if (local592 > 255) {
						local592 = 255;
					}
					local183.anInt10154 = local103 * local482 + local107;
					local183.method8647(local571);
					local183.method8647(local576);
					local183.method8647(local592);
					local183.method8647(255 - (this.aByteArray50[local437] & 0xFF));
					local482 = this.aShortArray94[local437];
					local498 = (short) local366[local482];
					if (local498 == 0) {
						local526 = (local405 * (float) local372[local482] + (float) local369[local482] * local399 + local411 * (float) local375[local482]) * 0.0026041667F;
					} else {
						local526 = ((float) local375[local482] * local411 + (float) local372[local482] * local405 + (float) local369[local482] * local399) / (float) (local498 * 256);
					}
					local566 = local526 * (local526 < 0.0F ? local435 : local425) + local415;
					local571 = (int) (local566 * local466);
					local576 = (int) (local566 * local493);
					if (local571 < 0) {
						local571 = 0;
					} else if (local571 > 255) {
						local571 = 255;
					}
					local592 = (int) (local566 * local477);
					if (local576 < 0) {
						local576 = 0;
					} else if (local576 > 255) {
						local576 = 255;
					}
					if (local592 < 0) {
						local592 = 0;
					} else if (local592 > 255) {
						local592 = 255;
					}
					local183.anInt10154 = local103 * local482 + local107;
					local183.method8647(local571);
					local183.method8647(local576);
					local183.method8647(local592);
					local183.method8647(255 - (this.aByteArray50[local437] & 0xFF));
					local482 = this.aShortArray90[local437];
					local498 = (short) local366[local482];
					if (local498 == 0) {
						local526 = ((float) local375[local482] * local411 + (float) local369[local482] * local399 + (float) local372[local482] * local405) * 0.0026041667F;
					} else {
						local526 = (local411 * (float) local375[local482] + local405 * (float) local372[local482] + (float) local369[local482] * local399) / (float) (local498 * 256);
					}
					local566 = local415 + local526 * (local526 < 0.0F ? local435 : local425);
					local571 = (int) (local566 * local466);
					if (local571 < 0) {
						local571 = 0;
					} else if (local571 > 255) {
						local571 = 255;
					}
					local576 = (int) (local493 * local566);
					local592 = (int) (local477 * local566);
					if (local576 < 0) {
						local576 = 0;
					} else if (local576 > 255) {
						local576 = 255;
					}
					if (local592 < 0) {
						local592 = 0;
					} else if (local592 > 255) {
						local592 = 255;
					}
					local183.anInt10154 = local107 + local103 * local482;
					local183.method8647(local571);
					local183.method8647(local576);
					local183.method8647(local592);
					local183.method8647(255 - (this.aByteArray50[local437] & 0xFF));
				}
			} else {
				for (local191 = 0; local191 < this.anInt6639; local191++) {
					local200 = this.method5901(this.aShortArray96[local191], this.aShortArray88[local191], this.aShort87, this.aByteArray50[local191]);
					local183.anInt10154 = this.aShortArray91[local191] * local103 + local107;
					local183.method8622(local200);
					local183.anInt10154 = local107 + this.aShortArray94[local191] * local103;
					local183.method8622(local200);
					local183.anInt10154 = local107 + this.aShortArray90[local191] * local103;
					local183.method8622(local200);
				}
			}
		}
		if (local27) {
			if (this.aClass261_1 == null) {
				local369 = this.aShortArray97;
				local372 = this.aShortArray98;
				local375 = this.aShortArray92;
				local366 = this.aByteArray51;
			} else {
				local369 = this.aClass261_1.aShortArray103;
				local372 = this.aClass261_1.aShortArray104;
				local375 = this.aClass261_1.aShortArray102;
				local366 = this.aClass261_1.aByteArray55;
			}
			@Pc(1110) float local1110 = 3.0F / (float) this.aShort86;
			local526 = 3.0F / (float) (this.aShort86 / 2 + this.aShort86);
			local183.anInt10154 = local109;
			if (this.aClass126_Sub3_25.aBoolean674) {
				for (local228 = 0; local228 < this.anInt6640; local228++) {
					local237 = local366[local228] & 0xFF;
					if (local237 == 0) {
						local183.method8130((float) local369[local228] * local526);
						local183.method8130((float) local372[local228] * local526);
						local183.method8130(local526 * (float) local375[local228]);
					} else {
						local493 = local1110 / (float) local237;
						local183.method8130(local493 * (float) local369[local228]);
						local183.method8130((float) local372[local228] * local493);
						local183.method8130((float) local375[local228] * local493);
					}
					local183.anInt10154 += local103 - 12;
				}
			} else {
				for (local228 = 0; local228 < this.anInt6640; local228++) {
					local237 = local366[local228] & 0xFF;
					if (local237 == 0) {
						local183.method8129((float) local369[local228] * local526);
						local183.method8129((float) local372[local228] * local526);
						local183.method8129((float) local375[local228] * local526);
					} else {
						local493 = local1110 / (float) local237;
						local183.method8129(local493 * (float) local369[local228]);
						local183.method8129((float) local372[local228] * local493);
						local183.method8129((float) local375[local228] * local493);
					}
					local183.anInt10154 += local103 - 12;
				}
			}
		}
		if (local49) {
			local183.anInt10154 = local111;
			if (this.aClass126_Sub3_25.aBoolean674) {
				for (local191 = 0; local191 < this.anInt6640; local191++) {
					local183.method8130(this.aFloatArray47[local191]);
					local183.method8130(this.aFloatArray46[local191]);
					local183.anInt10154 += local103 - 8;
				}
			} else {
				for (local191 = 0; local191 < this.anInt6640; local191++) {
					local183.method8129(this.aFloatArray47[local191]);
					local183.method8129(this.aFloatArray46[local191]);
					local183.anInt10154 += local103 - 8;
				}
			}
		}
		local183.anInt10154 = local103 * this.anInt6640;
		@Pc(1418) Interface7 local1418;
		if (arg0) {
			if (this.anInterface7_4 == null) {
				this.anInterface7_4 = this.aClass126_Sub3_25.method7093(local183.anInt10154, true, local103, local183.aByteArray104);
			} else {
				this.anInterface7_4.method6378(local183.anInt10154, local103, local183.aByteArray104);
			}
			local1418 = this.anInterface7_4;
			this.aByte90 = 0;
		} else {
			local1418 = this.aClass126_Sub3_25.method7093(local183.anInt10154, false, local103, local183.aByteArray104);
			this.aBoolean548 = true;
		}
		if (local38) {
			this.aClass159_11.aByte79 = 0;
			this.aClass159_11.anInterface7_2 = local1418;
		}
		if (local49) {
			this.aClass159_12.anInterface7_2 = local1418;
			this.aClass159_12.aByte79 = local111;
		}
		if (local16) {
			this.aClass159_9.aByte79 = local107;
			this.aClass159_9.anInterface7_2 = local1418;
		}
		if (local27) {
			this.aClass159_10.aByte79 = local109;
			this.aClass159_10.anInterface7_2 = local1418;
		}
	}

	@OriginalMember(owner = "client!nk", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		if (this.aClass159_9 != null) {
			this.aClass159_9.anInterface7_2 = null;
		}
		this.aShort87 = (short) arg0;
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V")
	private void method5896() {
		if (this.anInt6630 == 0) {
			return;
		}
		if (this.aByte90 != 0) {
			this.method5895(true);
		}
		this.method5895(false);
		if (this.aClass355_1 != null) {
			if (this.aClass355_1.anInterface2_4 == null) {
				this.method5899((this.aByte90 & 0x10) != 0);
			}
			if (this.aClass355_1.anInterface2_4 != null) {
				this.aClass126_Sub3_25.method7102(this.aClass159_10 != null);
				this.aClass126_Sub3_25.method7067(this.aClass159_12, this.aClass159_11, this.aClass159_10, this.aClass159_9);
				@Pc(75) int local75 = this.anIntArray523.length - 1;
				for (@Pc(77) int local77 = 0; local77 < local75; local77++) {
					@Pc(84) int local84 = this.anIntArray523[local77];
					@Pc(91) int local91 = this.anIntArray523[local77 + 1];
					@Pc(98) int local98 = this.aShortArray88[local84] & 0xFFFF;
					if (local98 == 65535) {
						local98 = -1;
					}
					this.aClass126_Sub3_25.method7131(local98, this.aClass159_10 != null);
					this.aClass126_Sub3_25.method7121(this.aClass355_1.anInterface2_4, local84 * 3, (local91 - local84) * 3);
				}
			}
		}
		this.method5890();
	}

	@OriginalMember(owner = "client!nk", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub12_Sub1.anIntArray748[arg0];
		@Pc(13) int local13 = Class5_Sub12_Sub1.anIntArray749[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6659; local15++) {
			@Pc(33) int local33 = this.anIntArray521[local15] * local13 - this.anIntArray524[local15] * local9 >> 14;
			this.anIntArray524[local15] = this.anIntArray521[local15] * local9 + local13 * this.anIntArray524[local15] >> 14;
			this.anIntArray521[local15] = local33;
		}
		if (this.aClass159_11 != null) {
			this.aClass159_11.anInterface7_2 = null;
		}
		this.aBoolean552 = false;
	}

	@OriginalMember(owner = "client!nk", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6659; local7++) {
			if (arg0 != 128) {
				this.anIntArray525[local7] = arg0 * this.anIntArray525[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray521[local7] = this.anIntArray521[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray524[local7] = arg2 * this.anIntArray524[local7] >> 7;
			}
		}
		this.aBoolean552 = false;
		if (this.aClass159_11 != null) {
			this.aClass159_11.anInterface7_2 = null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray33 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt6636; local12++) {
			this.anIntArray525[local12] <<= 0x4;
			this.anIntArray521[local12] <<= 0x4;
			this.anIntArray524[local12] <<= 0x4;
		}
		Static445.anInt7508 = 0;
		Static492.anInt8424 = 0;
		Static163.anInt2844 = 0;
		return true;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub12_Sub1.anIntArray748[arg0];
		@Pc(13) int local13 = Class5_Sub12_Sub1.anIntArray749[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6659; local15++) {
			@Pc(34) int local34 = this.anIntArray524[local15] * local9 + local13 * this.anIntArray525[local15] >> 14;
			this.anIntArray524[local15] = local13 * this.anIntArray524[local15] - local9 * this.anIntArray525[local15] >> 14;
			this.anIntArray525[local15] = local34;
		}
		if (this.aClass159_11 != null) {
			this.aClass159_11.anInterface7_2 = null;
		}
		this.aBoolean552 = false;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7947(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg4 << 4;
			local25 = arg3 << 4;
			Static445.anInt7508 = 0;
			Static492.anInt8424 = 0;
			local31 = 0;
			Static163.anInt2844 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray33.length) {
					local51 = this.anIntArrayArray33[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static492.anInt8424 += this.anIntArray525[local59];
						Static445.anInt7508 += this.anIntArray521[local59];
						Static163.anInt2844 += this.anIntArray524[local59];
						local31++;
					}
				}
			}
			if (local31 > 0) {
				Static163.anInt2844 = Static163.anInt2844 / local31 + local21;
				Static492.anInt8424 = Static492.anInt8424 / local31 + local17;
				Static445.anInt7508 = Static445.anInt7508 / local31 + local25;
			} else {
				Static492.anInt8424 = local17;
				Static163.anInt2844 = local21;
				Static445.anInt7508 = local25;
			}
			return;
		}
		@Pc(165) int[] local165;
		@Pc(167) int local167;
		if (arg0 == 1) {
			local17 = arg2 << 4;
			local25 = arg3 << 4;
			local21 = arg4 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray33.length) {
					local165 = this.anIntArrayArray33[local35];
					for (local167 = 0; local167 < local165.length; local167++) {
						local53 = local165[local167];
						this.anIntArray525[local53] += local17;
						this.anIntArray521[local53] += local25;
						this.anIntArray524[local53] += local21;
					}
				}
			}
			return;
		}
		@Pc(287) int local287;
		@Pc(306) int local306;
		@Pc(771) int local771;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray33.length) {
					local165 = this.anIntArrayArray33[local35];
					if ((arg5 & 0x1) == 0) {
						for (local167 = 0; local167 < local165.length; local167++) {
							local53 = local165[local167];
							this.anIntArray525[local53] -= Static492.anInt8424;
							this.anIntArray521[local53] -= Static445.anInt7508;
							this.anIntArray524[local53] -= Static163.anInt2844;
							if (arg4 != 0) {
								local59 = Class5_Sub12_Sub1.anIntArray748[arg4];
								local287 = Class5_Sub12_Sub1.anIntArray749[arg4];
								local306 = this.anIntArray525[local53] * local287 + local59 * this.anIntArray521[local53] + 16383 >> 14;
								this.anIntArray521[local53] = local287 * this.anIntArray521[local53] + 16383 - local59 * this.anIntArray525[local53] >> 14;
								this.anIntArray525[local53] = local306;
							}
							if (arg2 != 0) {
								local59 = Class5_Sub12_Sub1.anIntArray748[arg2];
								local287 = Class5_Sub12_Sub1.anIntArray749[arg2];
								local306 = this.anIntArray521[local53] * local287 + 16383 - local59 * this.anIntArray524[local53] >> 14;
								this.anIntArray524[local53] = local59 * this.anIntArray521[local53] + this.anIntArray524[local53] * local287 + 16383 >> 14;
								this.anIntArray521[local53] = local306;
							}
							if (arg3 != 0) {
								local59 = Class5_Sub12_Sub1.anIntArray748[arg3];
								local287 = Class5_Sub12_Sub1.anIntArray749[arg3];
								local306 = this.anIntArray524[local53] * local59 + this.anIntArray525[local53] * local287 + 16383 >> 14;
								this.anIntArray524[local53] = local287 * this.anIntArray524[local53] + 16383 - local59 * this.anIntArray525[local53] >> 14;
								this.anIntArray525[local53] = local306;
							}
							this.anIntArray525[local53] += Static492.anInt8424;
							this.anIntArray521[local53] += Static445.anInt7508;
							this.anIntArray524[local53] += Static163.anInt2844;
						}
					} else {
						for (local167 = 0; local167 < local165.length; local167++) {
							local53 = local165[local167];
							this.anIntArray525[local53] -= Static492.anInt8424;
							this.anIntArray521[local53] -= Static445.anInt7508;
							this.anIntArray524[local53] -= Static163.anInt2844;
							if (arg2 != 0) {
								local59 = Class5_Sub12_Sub1.anIntArray748[arg2];
								local287 = Class5_Sub12_Sub1.anIntArray749[arg2];
								local306 = local287 * this.anIntArray521[local53] + 16383 - local59 * this.anIntArray524[local53] >> 14;
								this.anIntArray524[local53] = this.anIntArray524[local53] * local287 + this.anIntArray521[local53] * local59 + 16383 >> 14;
								this.anIntArray521[local53] = local306;
							}
							if (arg4 != 0) {
								local59 = Class5_Sub12_Sub1.anIntArray748[arg4];
								local287 = Class5_Sub12_Sub1.anIntArray749[arg4];
								local306 = this.anIntArray525[local53] * local287 + this.anIntArray521[local53] * local59 + 16383 >> 14;
								this.anIntArray521[local53] = this.anIntArray521[local53] * local287 + 16383 - local59 * this.anIntArray525[local53] >> 14;
								this.anIntArray525[local53] = local306;
							}
							if (arg3 != 0) {
								local59 = Class5_Sub12_Sub1.anIntArray748[arg3];
								local287 = Class5_Sub12_Sub1.anIntArray749[arg3];
								local306 = local59 * this.anIntArray524[local53] + this.anIntArray525[local53] * local287 + 16383 >> 14;
								this.anIntArray524[local53] = local287 * this.anIntArray524[local53] + 16383 - this.anIntArray525[local53] * local59 >> 14;
								this.anIntArray525[local53] = local306;
							}
							this.anIntArray525[local53] += Static492.anInt8424;
							this.anIntArray521[local53] += Static445.anInt7508;
							this.anIntArray524[local53] += Static163.anInt2844;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray33.length > local41) {
						local51 = this.anIntArrayArray33[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local287 = this.anIntArray522[local59];
							local306 = this.anIntArray522[local59 + 1];
							for (local771 = local287; local771 < local306; local771++) {
								@Pc(780) int local780 = this.aShortArray93[local771] - 1;
								if (local780 == -1) {
									break;
								}
								@Pc(790) int local790;
								@Pc(794) int local794;
								@Pc(812) int local812;
								if (arg4 != 0) {
									local790 = Class5_Sub12_Sub1.anIntArray748[arg4];
									local794 = Class5_Sub12_Sub1.anIntArray749[arg4];
									local812 = this.aShortArray97[local780] * local794 + this.aShortArray98[local780] * local790 + 16383 >> 14;
									this.aShortArray98[local780] = (short) (local794 * this.aShortArray98[local780] + 16383 - this.aShortArray97[local780] * local790 >> 14);
									this.aShortArray97[local780] = (short) local812;
								}
								if (arg2 != 0) {
									local790 = Class5_Sub12_Sub1.anIntArray748[arg2];
									local794 = Class5_Sub12_Sub1.anIntArray749[arg2];
									local812 = this.aShortArray98[local780] * local794 + 16383 - local790 * this.aShortArray92[local780] >> 14;
									this.aShortArray92[local780] = (short) (local794 * this.aShortArray92[local780] + this.aShortArray98[local780] * local790 + 16383 >> 14);
									this.aShortArray98[local780] = (short) local812;
								}
								if (arg3 != 0) {
									local790 = Class5_Sub12_Sub1.anIntArray748[arg3];
									local794 = Class5_Sub12_Sub1.anIntArray749[arg3];
									local812 = this.aShortArray92[local780] * local790 + this.aShortArray97[local780] * local794 + 16383 >> 14;
									this.aShortArray92[local780] = (short) (this.aShortArray92[local780] * local794 + 16383 - this.aShortArray97[local780] * local790 >> 14);
									this.aShortArray97[local780] = (short) local812;
								}
							}
						}
					}
				}
				if (this.aClass159_10 == null && this.aClass159_9 != null) {
					this.aClass159_9.anInterface7_2 = null;
				}
				if (this.aClass159_10 != null) {
					this.aClass159_10.anInterface7_2 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray33.length > local35) {
					local165 = this.anIntArrayArray33[local35];
					for (local167 = 0; local167 < local165.length; local167++) {
						local53 = local165[local167];
						this.anIntArray525[local53] -= Static492.anInt8424;
						this.anIntArray521[local53] -= Static445.anInt7508;
						this.anIntArray524[local53] -= Static163.anInt2844;
						this.anIntArray525[local53] = arg2 * this.anIntArray525[local53] >> 7;
						this.anIntArray521[local53] = this.anIntArray521[local53] * arg3 >> 7;
						this.anIntArray524[local53] = arg4 * this.anIntArray524[local53] >> 7;
						this.anIntArray525[local53] += Static492.anInt8424;
						this.anIntArray521[local53] += Static445.anInt7508;
						this.anIntArray524[local53] += Static163.anInt2844;
					}
				}
			}
		} else {
			@Pc(1230) Class356 local1230;
			@Pc(1235) Class25 local1235;
			if (arg0 == 5) {
				if (this.anIntArrayArray35 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray35.length) {
							local165 = this.anIntArrayArray35[local35];
							for (local167 = 0; local167 < local165.length; local167++) {
								local53 = local165[local167];
								local59 = (this.aByteArray50[local53] & 0xFF) + arg2 * 8;
								if (local59 < 0) {
									local59 = 0;
								} else if (local59 > 255) {
									local59 = 255;
								}
								this.aByteArray50[local53] = (byte) local59;
							}
							if (local165.length > 0 && this.aClass159_9 != null) {
								this.aClass159_9.anInterface7_2 = null;
							}
						}
					}
					if (this.aClass356Array1 != null) {
						for (local35 = 0; local35 < this.anInt6651; local35++) {
							local1230 = this.aClass356Array1[local35];
							local1235 = this.aClass25Array1[local35];
							local1235.anInt609 = local1235.anInt609 & 0xFFFFFF | 255 - (this.aByteArray50[local1230.anInt9781] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1484) Class25 local1484;
				if (arg0 == 8) {
					if (this.anIntArrayArray34 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray34.length > local35) {
								local165 = this.anIntArrayArray34[local35];
								for (local167 = 0; local167 < local165.length; local167++) {
									local1484 = this.aClass25Array1[local165[local167]];
									local1484.anInt601 += arg2;
									local1484.anInt602 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray34 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray34.length) {
								local165 = this.anIntArrayArray34[local35];
								for (local167 = 0; local167 < local165.length; local167++) {
									local1484 = this.aClass25Array1[local165[local167]];
									local1484.anInt604 = arg2 * local1484.anInt604 >> 7;
									local1484.anInt603 = arg3 * local1484.anInt603 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray34 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray34.length) {
							local165 = this.anIntArrayArray34[local35];
							for (local167 = 0; local167 < local165.length; local167++) {
								local1484 = this.aClass25Array1[local165[local167]];
								local1484.anInt608 = arg2 + local1484.anInt608 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray35 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray35.length) {
						local165 = this.anIntArrayArray35[local35];
						for (local167 = 0; local167 < local165.length; local167++) {
							local53 = local165[local167];
							local59 = this.aShortArray96[local53] & 0xFFFF;
							local287 = local59 >> 10 & 0x3F;
							local306 = local59 >> 7 & 0x7;
							local771 = local59 & 0x7F;
							@Pc(1324) int local1324 = arg2 + local287 & 0x3F;
							local306 += arg3 / 4;
							if (local306 < 0) {
								local306 = 0;
							} else if (local306 > 7) {
								local306 = 7;
							}
							local771 += arg4;
							if (local771 < 0) {
								local771 = 0;
							} else if (local771 > 127) {
								local771 = 127;
							}
							this.aShortArray96[local53] = (short) (local771 | local306 << 7 | local1324 << 10);
						}
						if (local165.length > 0 && this.aClass159_9 != null) {
							this.aClass159_9.anInterface7_2 = null;
						}
					}
				}
				if (this.aClass356Array1 != null) {
					for (local35 = 0; local35 < this.anInt6651; local35++) {
						local1230 = this.aClass356Array1[local35];
						local1235 = this.aClass25Array1[local35];
						local1235.anInt609 = Static643.anIntArray836[this.aShortArray96[local1230.anInt9781] & 0xFFFF] & 0xFFFFFF | local1235.anInt609 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V")
	private void method5897() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt6659; local28++) {
			@Pc(35) int local35 = this.anIntArray525[local28];
			@Pc(40) int local40 = this.anIntArray521[local28];
			if (local40 < local9) {
				local9 = local40;
			}
			if (local13 < local35) {
				local13 = local35;
			}
			@Pc(63) int local63 = this.anIntArray524[local28];
			if (local40 > local15) {
				local15 = local40;
			}
			if (local35 < local7) {
				local7 = local35;
			}
			if (local63 > local17) {
				local17 = local63;
			}
			if (local11 > local63) {
				local11 = local63;
			}
			@Pc(91) int local91 = local35 * local35 + local63 * local63;
			if (local91 > local19) {
				local19 = local91;
			}
			local91 = local63 * local63 + local35 * local35 + local40 * local40;
			if (local91 > local21) {
				local21 = local91;
			}
		}
		this.aShort92 = (short) local11;
		this.aShort89 = (short) local7;
		this.aShort90 = (short) local9;
		this.aShort84 = (short) local13;
		this.aShort91 = (short) local17;
		this.aShort93 = (short) local15;
		this.aShort88 = (short) (int) (Math.sqrt((double) local19) + 0.99D);
		this.aShort85 = (short) (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean552 = true;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZIIIILclient!ofa;I)Z")
	private boolean method5898(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class117 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class117_Sub3 local8 = (Class117_Sub3) arg4;
		@Pc(12) Class117_Sub3 local12 = this.aClass126_Sub3_25.aClass117_Sub3_3;
		@Pc(33) float local33 = local12.aFloat181 + local12.aFloat183 * local8.aFloat188 + local8.aFloat181 * local12.aFloat187 + local12.aFloat182 * local8.aFloat178;
		@Pc(54) float local54 = local12.aFloat178 + local12.aFloat184 * local8.aFloat188 + local12.aFloat177 * local8.aFloat181 + local8.aFloat178 * local12.aFloat179;
		@Pc(75) float local75 = local12.aFloat180 * local8.aFloat181 + local8.aFloat178 * local12.aFloat185 + local8.aFloat188 * local12.aFloat186 + local12.aFloat188;
		Static557.aFloat193 = local8.aFloat185 * local12.aFloat184 + local8.aFloat179 * local12.aFloat179 + local8.aFloat182 * local12.aFloat177;
		Static290.aFloat70 = local8.aFloat187 * local12.aFloat177 + local12.aFloat179 * local8.aFloat177 + local8.aFloat180 * local12.aFloat184;
		Static169.aFloat38 = local8.aFloat180 * local12.aFloat183 + local8.aFloat187 * local12.aFloat187 + local8.aFloat177 * local12.aFloat182;
		Static642.aFloat206 = local12.aFloat179 * local8.aFloat184 + local12.aFloat177 * local8.aFloat183 + local8.aFloat186 * local12.aFloat184;
		Static649.aFloat207 = local12.aFloat185 * local8.aFloat184 + local12.aFloat180 * local8.aFloat183 + local12.aFloat186 * local8.aFloat186;
		Static519.aFloat144 = local8.aFloat183 * local12.aFloat187 + local8.aFloat184 * local12.aFloat182 + local8.aFloat186 * local12.aFloat183;
		Static111.aFloat21 = local12.aFloat183 * local8.aFloat185 + local12.aFloat182 * local8.aFloat179 + local12.aFloat187 * local8.aFloat182;
		Static584.aFloat196 = local12.aFloat185 * local8.aFloat177 + local12.aFloat180 * local8.aFloat187 + local8.aFloat180 * local12.aFloat186;
		Static563.aFloat195 = local12.aFloat185 * local8.aFloat179 + local8.aFloat182 * local12.aFloat180 + local12.aFloat186 * local8.aFloat185;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass126_Sub3_25.anInt8293;
		@Pc(255) int local255 = this.aClass126_Sub3_25.anInt8292;
		if (!this.aBoolean552) {
			this.method5897();
		}
		@Pc(270) int local270 = this.aShort84 - this.aShort89 >> 1;
		@Pc(279) int local279 = this.aShort93 - this.aShort90 >> 1;
		@Pc(287) int local287 = this.aShort91 - this.aShort92 >> 1;
		@Pc(299) int local299 = this.aShort89 + local270;
		@Pc(304) int local304 = this.aShort90 + local279;
		@Pc(309) int local309 = local287 + this.aShort92;
		@Pc(315) int local315 = local299 - (local270 << arg2);
		@Pc(321) int local321 = local304 - (local279 << arg2);
		@Pc(327) int local327 = local309 - (local287 << arg2);
		@Pc(333) int local333 = local299 + (local270 << arg2);
		@Pc(339) int local339 = local304 + (local279 << arg2);
		@Pc(346) int local346 = local309 + (local287 << arg2);
		Static630.anIntArray820[0] = local315;
		Static427.anIntArray582[0] = local321;
		Static483.anIntArray646[0] = local327;
		Static630.anIntArray820[1] = local333;
		Static427.anIntArray582[1] = local321;
		Static483.anIntArray646[1] = local327;
		Static630.anIntArray820[2] = local315;
		Static427.anIntArray582[2] = local339;
		Static630.anIntArray820[3] = local333;
		Static483.anIntArray646[2] = local327;
		Static427.anIntArray582[3] = local339;
		Static483.anIntArray646[3] = local327;
		Static630.anIntArray820[4] = local315;
		Static427.anIntArray582[4] = local321;
		Static483.anIntArray646[4] = local346;
		Static630.anIntArray820[5] = local333;
		Static427.anIntArray582[5] = local321;
		Static483.anIntArray646[5] = local346;
		Static630.anIntArray820[6] = local315;
		Static427.anIntArray582[6] = local339;
		Static630.anIntArray820[7] = local333;
		Static483.anIntArray646[6] = local346;
		Static427.anIntArray582[7] = local339;
		Static483.anIntArray646[7] = local346;
		@Pc(475) float local475;
		@Pc(503) float local503;
		@Pc(489) float local489;
		@Pc(461) float local461;
		@Pc(456) float local456;
		@Pc(451) float local451;
		for (@Pc(444) int local444 = 0; local444 < 8; local444++) {
			local451 = (float) Static483.anIntArray646[local444];
			local456 = (float) Static427.anIntArray582[local444];
			local461 = (float) Static630.anIntArray820[local444];
			local475 = local33 + local461 * Static169.aFloat38 + local456 * Static111.aFloat21 + local451 * Static519.aFloat144;
			local489 = local456 * Static563.aFloat195 + local461 * Static584.aFloat196 + local451 * Static649.aFloat207 + local75;
			local503 = local54 + local461 * Static290.aFloat70 + Static557.aFloat193 * local456 + local451 * Static642.aFloat206;
			if ((float) this.aClass126_Sub3_25.anInt8304 <= local489) {
				if (arg3 > 0) {
					local489 = (float) arg3;
				}
				@Pc(530) float local530 = (float) local251 * local475 / local489 + (float) this.aClass126_Sub3_25.anInt8301;
				@Pc(542) float local542 = (float) this.aClass126_Sub3_25.anInt8313 + local503 * (float) local255 / local489;
				if (local530 > local243) {
					local243 = local530;
				}
				if (local241 > local530) {
					local241 = local530;
				}
				if (local245 > local542) {
					local245 = local542;
				}
				if (local247 < local542) {
					local247 = local542;
				}
				local239 = true;
			}
		}
		if (local239 && (float) arg1 > local241 && (float) arg1 < local243 && (float) arg5 > local245 && local247 > (float) arg5) {
			if (arg0) {
				return true;
			}
			if (this.aClass126_Sub3_25.anIntArray651.length < this.anInt6640) {
				this.aClass126_Sub3_25.anIntArray649 = new int[this.anInt6640];
				this.aClass126_Sub3_25.anIntArray651 = new int[this.anInt6640];
			}
			@Pc(623) int[] local623 = this.aClass126_Sub3_25.anIntArray651;
			@Pc(627) int[] local627 = this.aClass126_Sub3_25.anIntArray649;
			@Pc(703) int local703;
			for (@Pc(629) int local629 = 0; local629 < this.anInt6659; local629++) {
				local451 = (float) this.anIntArray524[local629];
				local461 = (float) this.anIntArray525[local629];
				local456 = (float) this.anIntArray521[local629];
				local475 = local33 + Static519.aFloat144 * local451 + Static111.aFloat21 * local456 + local461 * Static169.aFloat38;
				local503 = local451 * Static642.aFloat206 + Static557.aFloat193 * local456 + local461 * Static290.aFloat70 + local54;
				local489 = local451 * Static649.aFloat207 + Static563.aFloat195 * local456 + Static584.aFloat196 * local461 + local75;
				@Pc(710) int local710;
				@Pc(712) int local712;
				@Pc(721) int local721;
				if ((float) this.aClass126_Sub3_25.anInt8304 <= local489) {
					if (arg3 > 0) {
						local489 = (float) arg3;
					}
					local703 = (int) (local475 * (float) local251 / local489 + (float) this.aClass126_Sub3_25.anInt8301);
					local710 = (int) ((float) this.aClass126_Sub3_25.anInt8313 + local503 * (float) local255 / local489);
					local712 = this.anIntArray522[local629];
					local721 = this.anIntArray522[local629 + 1];
					for (@Pc(788) int local788 = local712; local788 < local721; local788++) {
						@Pc(797) int local797 = this.aShortArray93[local788] - 1;
						if (local797 == -1) {
							break;
						}
						local623[local797] = local703;
						local627[local797] = local710;
					}
				} else {
					local703 = this.anIntArray522[local629];
					local710 = this.anIntArray522[local629 + 1];
					for (local712 = local703; local712 < local710; local712++) {
						local721 = this.aShortArray93[local712] - 1;
						if (local721 == -1) {
							break;
						}
						local623[this.aShortArray93[local712] - 1] = -999999;
					}
				}
			}
			for (local703 = 0; local703 < this.anInt6639; local703++) {
				if (local623[this.aShortArray91[local703]] != -999999 && local623[this.aShortArray94[local703]] != -999999 && local623[this.aShortArray90[local703]] != -999999 && this.method5892(local623[this.aShortArray90[local703]], local623[this.aShortArray94[local703]], local623[this.aShortArray91[local703]], arg5, local627[this.aShortArray91[local703]], arg1, local627[this.aShortArray90[local703]], local627[this.aShortArray94[local703]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nk", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean552) {
			this.method5897();
		}
		return this.aShort84;
	}

	@OriginalMember(owner = "client!nk", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6636; local7++) {
			this.anIntArray525[local7] = this.anIntArray525[local7] + 7 >> 4;
			this.anIntArray521[local7] = this.anIntArray521[local7] + 7 >> 4;
			this.anIntArray524[local7] = this.anIntArray524[local7] + 7 >> 4;
		}
		this.aBoolean552 = false;
		if (this.aClass159_11 != null) {
			this.aClass159_11.anInterface7_2 = null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6659; local7++) {
			this.anIntArray524[local7] = -this.anIntArray524[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt6640; local25++) {
			this.aShortArray92[local25] = (short) -this.aShortArray92[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt6639; local44++) {
			@Pc(51) short local51 = this.aShortArray91[local44];
			this.aShortArray91[local44] = this.aShortArray90[local44];
			this.aShortArray90[local44] = local51;
		}
		if (this.aClass159_10 == null && this.aClass159_9 != null) {
			this.aClass159_9.anInterface7_2 = null;
		}
		if (this.aClass159_10 != null) {
			this.aClass159_10.anInterface7_2 = null;
		}
		this.aBoolean552 = false;
		if (this.aClass355_1 != null) {
			this.aClass355_1.anInterface2_4 = null;
		}
		if (this.aClass159_11 != null) {
			this.aClass159_11.anInterface7_2 = null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort86;
	}

	@OriginalMember(owner = "client!nk", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean552) {
			this.method5897();
		}
		return this.aShort92;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(IZ)V")
	private void method5899(@OriginalArg(1) boolean arg0) {
		if (this.anInt6630 * 6 > this.aClass126_Sub3_25.aClass5_Sub12_Sub1_2.aByteArray104.length) {
			this.aClass126_Sub3_25.aClass5_Sub12_Sub1_2 = new Class5_Sub12_Sub1(this.anInt6630 * 6 + 600);
		} else {
			this.aClass126_Sub3_25.aClass5_Sub12_Sub1_2.anInt10154 = 0;
		}
		@Pc(46) Class5_Sub12_Sub1 local46 = this.aClass126_Sub3_25.aClass5_Sub12_Sub1_2;
		@Pc(52) int local52;
		if (this.aClass126_Sub3_25.aBoolean674) {
			for (local52 = 0; local52 < this.anInt6630; local52++) {
				local46.method8655(this.aShortArray91[local52]);
				local46.method8655(this.aShortArray94[local52]);
				local46.method8655(this.aShortArray90[local52]);
			}
		} else {
			for (local52 = 0; local52 < this.anInt6630; local52++) {
				local46.method8643(this.aShortArray91[local52]);
				local46.method8643(this.aShortArray94[local52]);
				local46.method8643(this.aShortArray90[local52]);
			}
		}
		if (local46.anInt10154 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface2_1 == null) {
				this.anInterface2_1 = this.aClass126_Sub3_25.method7101(local46.aByteArray104, local46.anInt10154, true);
			} else {
				this.anInterface2_1.method8502(local46.anInt10154, local46.aByteArray104);
			}
			this.aClass355_1.anInterface2_4 = this.anInterface2_1;
		} else {
			this.aClass355_1.anInterface2_4 = this.aClass126_Sub3_25.method7101(local46.aByteArray104, local46.anInt10154, false);
		}
		if (!arg0) {
			this.aBoolean548 = true;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!ofa;Lclient!vh;I)V")
	@Override
	public void method7949(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class14_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6640 == 0) {
			return;
		}
		@Pc(13) Class117_Sub3 local13 = this.aClass126_Sub3_25.aClass117_Sub3_3;
		if (!this.aBoolean552) {
			this.method5897();
		}
		@Pc(22) Class117_Sub3 local22 = (Class117_Sub3) arg0;
		Static234.aFloat47 = local13.aFloat185 * local22.aFloat178 + local13.aFloat180 * local22.aFloat181 + local22.aFloat188 * local13.aFloat186 + local13.aFloat188;
		Static563.aFloat195 = local13.aFloat185 * local22.aFloat179 + local22.aFloat182 * local13.aFloat180 + local13.aFloat186 * local22.aFloat185;
		@Pc(69) float local69 = Static234.aFloat47 + (float) this.aShort90 * Static563.aFloat195;
		@Pc(77) float local77 = Static234.aFloat47 + Static563.aFloat195 * (float) this.aShort93;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local69 > local77) {
			local87 = local69 + (float) this.aShort88;
			local94 = local77 - (float) this.aShort88;
		} else {
			local87 = (float) this.aShort88 + local77;
			local94 = (float) -this.aShort88 + local69;
		}
		if (this.aClass126_Sub3_25.aFloat172 <= local94 || local87 <= (float) this.aClass126_Sub3_25.anInt8304) {
			return;
		}
		Static111.aFloat21 = local22.aFloat179 * local13.aFloat182 + local13.aFloat187 * local22.aFloat182 + local13.aFloat183 * local22.aFloat185;
		Static584.aFloat197 = local13.aFloat181 + local13.aFloat183 * local22.aFloat188 + local22.aFloat181 * local13.aFloat187 + local22.aFloat178 * local13.aFloat182;
		@Pc(170) float local170 = Static584.aFloat197 + Static111.aFloat21 * (float) this.aShort90;
		@Pc(178) float local178 = Static584.aFloat197 + Static111.aFloat21 * (float) this.aShort93;
		@Pc(204) float local204;
		@Pc(193) float local193;
		if (local178 < local170) {
			local193 = (float) this.aClass126_Sub3_25.anInt8293 * (local170 + (float) this.aShort88);
			local204 = (float) this.aClass126_Sub3_25.anInt8293 * (local178 - (float) this.aShort88);
		} else {
			local193 = (float) this.aClass126_Sub3_25.anInt8293 * (local178 + (float) this.aShort88);
			local204 = (local170 - (float) this.aShort88) * (float) this.aClass126_Sub3_25.anInt8293;
		}
		if (local204 / local87 >= this.aClass126_Sub3_25.aFloat158 || local193 / local87 <= this.aClass126_Sub3_25.aFloat171) {
			return;
		}
		Static557.aFloat193 = local22.aFloat182 * local13.aFloat177 + local22.aFloat179 * local13.aFloat179 + local22.aFloat185 * local13.aFloat184;
		Static30.aFloat8 = local13.aFloat184 * local22.aFloat188 + local22.aFloat178 * local13.aFloat179 + local13.aFloat177 * local22.aFloat181 + local13.aFloat178;
		@Pc(293) float local293 = Static30.aFloat8 + Static557.aFloat193 * (float) this.aShort90;
		@Pc(301) float local301 = Static557.aFloat193 * (float) this.aShort93 + Static30.aFloat8;
		@Pc(316) float local316;
		@Pc(327) float local327;
		if (local301 < local293) {
			local316 = (float) this.aClass126_Sub3_25.anInt8292 * (local301 - (float) this.aShort88);
			local327 = ((float) this.aShort88 + local293) * (float) this.aClass126_Sub3_25.anInt8292;
		} else {
			local316 = (local293 - (float) this.aShort88) * (float) this.aClass126_Sub3_25.anInt8292;
			local327 = (local301 + (float) this.aShort88) * (float) this.aClass126_Sub3_25.anInt8292;
		}
		if (local316 / local87 >= this.aClass126_Sub3_25.aFloat167 || this.aClass126_Sub3_25.aFloat175 >= local327 / local87) {
			return;
		}
		if (arg1 != null || this.aClass356Array1 != null) {
			Static642.aFloat206 = local13.aFloat177 * local22.aFloat183 + local13.aFloat179 * local22.aFloat184 + local13.aFloat184 * local22.aFloat186;
			Static519.aFloat144 = local13.aFloat182 * local22.aFloat184 + local13.aFloat187 * local22.aFloat183 + local13.aFloat183 * local22.aFloat186;
			Static584.aFloat196 = local13.aFloat186 * local22.aFloat180 + local22.aFloat187 * local13.aFloat180 + local22.aFloat177 * local13.aFloat185;
			Static290.aFloat70 = local13.aFloat184 * local22.aFloat180 + local13.aFloat177 * local22.aFloat187 + local13.aFloat179 * local22.aFloat177;
			Static169.aFloat38 = local13.aFloat183 * local22.aFloat180 + local13.aFloat182 * local22.aFloat177 + local22.aFloat187 * local13.aFloat187;
			Static649.aFloat207 = local13.aFloat186 * local22.aFloat186 + local13.aFloat185 * local22.aFloat184 + local13.aFloat180 * local22.aFloat183;
		}
		if (arg1 != null) {
			@Pc(486) boolean local486 = false;
			@Pc(488) boolean local488 = true;
			@Pc(497) int local497 = this.aShort89 + this.aShort84 >> 1;
			@Pc(505) int local505 = this.aShort91 + this.aShort92 >> 1;
			@Pc(524) int local524 = (int) (Static519.aFloat144 * (float) local505 + Static584.aFloat197 + Static169.aFloat38 * (float) local497 + Static111.aFloat21 * (float) this.aShort90);
			@Pc(543) int local543 = (int) ((float) this.aShort90 * Static557.aFloat193 + Static30.aFloat8 + (float) local497 * Static290.aFloat70 + Static642.aFloat206 * (float) local505);
			@Pc(562) int local562 = (int) (Static584.aFloat196 * (float) local497 + Static234.aFloat47 + Static563.aFloat195 * (float) this.aShort90 + (float) local505 * Static649.aFloat207);
			if (local562 < this.aClass126_Sub3_25.anInt8304) {
				local486 = true;
			} else {
				arg1.anInt9897 = this.aClass126_Sub3_25.anInt8292 * local543 / local562 + this.aClass126_Sub3_25.anInt8313;
				arg1.anInt9898 = this.aClass126_Sub3_25.anInt8293 * local524 / local562 + this.aClass126_Sub3_25.anInt8301;
			}
			@Pc(616) int local616 = (int) ((float) local505 * Static519.aFloat144 + Static169.aFloat38 * (float) local497 + Static584.aFloat197 + (float) this.aShort93 * Static111.aFloat21);
			@Pc(635) int local635 = (int) ((float) local497 * Static290.aFloat70 + Static30.aFloat8 + Static557.aFloat193 * (float) this.aShort93 + (float) local505 * Static642.aFloat206);
			@Pc(654) int local654 = (int) (Static584.aFloat196 * (float) local497 + Static234.aFloat47 + (float) this.aShort93 * Static563.aFloat195 + (float) local505 * Static649.aFloat207);
			if (this.aClass126_Sub3_25.anInt8304 <= local654) {
				arg1.anInt9896 = this.aClass126_Sub3_25.anInt8293 * local616 / local654 + this.aClass126_Sub3_25.anInt8301;
				arg1.anInt9894 = local635 * this.aClass126_Sub3_25.anInt8292 / local654 + this.aClass126_Sub3_25.anInt8313;
			} else {
				local486 = true;
			}
			if (local486) {
				if (this.aClass126_Sub3_25.anInt8304 > local562 && this.aClass126_Sub3_25.anInt8304 > local654) {
					local488 = false;
				} else {
					@Pc(741) int local741;
					@Pc(751) int local751;
					@Pc(761) int local761;
					if (this.aClass126_Sub3_25.anInt8304 > local562) {
						local741 = (local654 - this.aClass126_Sub3_25.anInt8304 << 16) / (local654 - local562);
						local751 = local616 + (local741 * (local616 - local524) >> 16);
						arg1.anInt9898 = this.aClass126_Sub3_25.anInt8301 + this.aClass126_Sub3_25.anInt8293 * local751 / this.aClass126_Sub3_25.anInt8304;
						local761 = (local741 * (local635 - local543) >> 16) + local635;
						arg1.anInt9897 = this.aClass126_Sub3_25.anInt8313 + this.aClass126_Sub3_25.anInt8292 * local761 / this.aClass126_Sub3_25.anInt8304;
					} else if (this.aClass126_Sub3_25.anInt8304 > local654) {
						local741 = (local562 - this.aClass126_Sub3_25.anInt8304 << 16) / (local562 - local654);
						local751 = local524 + (local741 * (local524 - local616) >> 16);
						local761 = local543 + (local741 * (local543 - local635) >> 16);
						arg1.anInt9898 = this.aClass126_Sub3_25.anInt8293 * local751 / this.aClass126_Sub3_25.anInt8304 + this.aClass126_Sub3_25.anInt8301;
						arg1.anInt9897 = this.aClass126_Sub3_25.anInt8292 * local761 / this.aClass126_Sub3_25.anInt8304 + this.aClass126_Sub3_25.anInt8313;
					}
				}
			}
			if (local488) {
				if (local654 >= local562) {
					arg1.anInt9895 = (this.aShort88 + local616) * this.aClass126_Sub3_25.anInt8293 / local654 + this.aClass126_Sub3_25.anInt8301 - arg1.anInt9896;
				} else {
					arg1.anInt9895 = this.aClass126_Sub3_25.anInt8301 + this.aClass126_Sub3_25.anInt8293 * (this.aShort88 + local524) / local562 - arg1.anInt9898;
				}
				arg1.aBoolean809 = true;
			}
		}
		this.aClass126_Sub3_25.method7087();
		this.aClass126_Sub3_25.method7069(local22);
		this.method5896();
		this.aClass126_Sub3_25.method7064();
		this.method5889();
	}

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt6670 = arg0;
		if (this.aClass261_1 != null && (this.anInt6670 & 0x10000) == 0) {
			this.aByteArray51 = this.aClass261_1.aByteArray55;
			this.aShortArray98 = this.aClass261_1.aShortArray104;
			this.aShortArray92 = this.aClass261_1.aShortArray102;
			this.aShortArray97 = this.aClass261_1.aShortArray103;
			this.aClass261_1 = null;
		}
		this.aBoolean548 = true;
		this.method5890();
	}

	@OriginalMember(owner = "client!nk", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean552) {
			this.method5897();
		}
		return this.aShort93;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZILclient!nk;Lclient!nk;ZB)Lclient!ka;")
	private Class180 method5900(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class180_Sub2 arg2, @OriginalArg(3) Class180_Sub2 arg3, @OriginalArg(4) boolean arg4) {
		arg3.anInt6651 = this.anInt6651;
		arg3.anInt6639 = this.anInt6639;
		if ((arg1 & 0x100) == 0) {
			arg3.aBoolean551 = this.aBoolean551;
		} else {
			arg3.aBoolean551 = true;
		}
		arg3.anInt6649 = this.anInt6649;
		arg3.aBoolean550 = this.aBoolean550;
		arg3.anInt6640 = this.anInt6640;
		arg3.aByte90 = 0;
		arg3.anInt6636 = this.anInt6636;
		arg3.anInt6659 = this.anInt6659;
		arg3.aShort86 = this.aShort86;
		arg3.anInt6670 = arg1;
		arg3.aShort87 = this.aShort87;
		arg3.anInt6630 = this.anInt6630;
		@Pc(78) boolean local78 = Static567.method8018(arg1, this.anInt6649);
		@Pc(84) boolean local84 = Static542.method7724(arg1, this.anInt6649);
		@Pc(90) boolean local90 = Static325.method5029(this.anInt6649, arg1);
		@Pc(96) boolean local96 = local90 | local78 | local84;
		@Pc(211) int local211;
		if (local96) {
			if (!local78) {
				arg3.anIntArray525 = this.anIntArray525;
			} else if (arg2.anIntArray525 == null || this.anInt6636 > arg2.anIntArray525.length) {
				arg3.anIntArray525 = arg2.anIntArray525 = new int[this.anInt6636];
			} else {
				arg3.anIntArray525 = arg2.anIntArray525;
			}
			if (!local84) {
				arg3.anIntArray521 = this.anIntArray521;
			} else if (arg2.anIntArray521 == null || this.anInt6636 > arg2.anIntArray521.length) {
				arg3.anIntArray521 = arg2.anIntArray521 = new int[this.anInt6636];
			} else {
				arg3.anIntArray521 = arg2.anIntArray521;
			}
			if (!local90) {
				arg3.anIntArray524 = this.anIntArray524;
			} else if (arg2.anIntArray524 == null || this.anInt6636 > arg2.anIntArray524.length) {
				arg3.anIntArray524 = arg2.anIntArray524 = new int[this.anInt6636];
			} else {
				arg3.anIntArray524 = arg2.anIntArray524;
			}
			for (local211 = 0; local211 < this.anInt6636; local211++) {
				if (local78) {
					arg3.anIntArray525[local211] = this.anIntArray525[local211];
				}
				if (local84) {
					arg3.anIntArray521[local211] = this.anIntArray521[local211];
				}
				if (local90) {
					arg3.anIntArray524[local211] = this.anIntArray524[local211];
				}
			}
		} else {
			arg3.anIntArray524 = this.anIntArray524;
			arg3.anIntArray525 = this.anIntArray525;
			arg3.anIntArray521 = this.anIntArray521;
		}
		if (Static188.method8826(arg1, this.anInt6649)) {
			if (arg4) {
				arg3.aByte90 = (byte) (arg3.aByte90 | 0x1);
			}
			arg3.aClass159_11 = arg2.aClass159_11;
			arg3.aClass159_11.anInterface7_2 = this.aClass159_11.anInterface7_2;
			arg3.aClass159_11.aByte79 = this.aClass159_11.aByte79;
		} else if (Static139.method2090(this.anInt6649, arg1)) {
			arg3.aClass159_11 = this.aClass159_11;
		} else {
			arg3.aClass159_11 = null;
		}
		if (Static416.method6342(arg1, this.anInt6649)) {
			if (arg2.aShortArray96 == null || this.anInt6639 > arg2.aShortArray96.length) {
				arg3.aShortArray96 = arg2.aShortArray96 = new short[this.anInt6639];
			} else {
				arg3.aShortArray96 = arg2.aShortArray96;
			}
			for (local211 = 0; local211 < this.anInt6639; local211++) {
				arg3.aShortArray96[local211] = this.aShortArray96[local211];
			}
		} else {
			arg3.aShortArray96 = this.aShortArray96;
		}
		if (Static364.method5693(arg1, this.anInt6649)) {
			if (arg2.aByteArray50 == null || arg2.aByteArray50.length < this.anInt6639) {
				arg3.aByteArray50 = arg2.aByteArray50 = new byte[this.anInt6639];
			} else {
				arg3.aByteArray50 = arg2.aByteArray50;
			}
			for (local211 = 0; local211 < this.anInt6639; local211++) {
				arg3.aByteArray50[local211] = this.aByteArray50[local211];
			}
		} else {
			arg3.aByteArray50 = this.aByteArray50;
		}
		if (Static194.method3065(arg1, this.anInt6649)) {
			if (arg4) {
				arg3.aByte90 = (byte) (arg3.aByte90 | 0x2);
			}
			arg3.aClass159_9 = arg2.aClass159_9;
			arg3.aClass159_9.aByte79 = this.aClass159_9.aByte79;
			arg3.aClass159_9.anInterface7_2 = this.aClass159_9.anInterface7_2;
		} else if (Static20.method457(this.anInt6649, arg1)) {
			arg3.aClass159_9 = this.aClass159_9;
		} else {
			arg3.aClass159_9 = null;
		}
		@Pc(585) int local585;
		if (Static182.method2926(this.anInt6649, arg1)) {
			if (arg2.aShortArray97 == null || arg2.aShortArray97.length < this.anInt6640) {
				local211 = this.anInt6640;
				arg3.aShortArray92 = arg2.aShortArray92 = new short[local211];
				arg3.aShortArray97 = arg2.aShortArray97 = new short[local211];
				arg3.aShortArray98 = arg2.aShortArray98 = new short[local211];
			} else {
				arg3.aShortArray92 = arg2.aShortArray92;
				arg3.aShortArray97 = arg2.aShortArray97;
				arg3.aShortArray98 = arg2.aShortArray98;
			}
			if (this.aClass261_1 == null) {
				for (local211 = 0; local211 < this.anInt6640; local211++) {
					arg3.aShortArray97[local211] = this.aShortArray97[local211];
					arg3.aShortArray98[local211] = this.aShortArray98[local211];
					arg3.aShortArray92[local211] = this.aShortArray92[local211];
				}
			} else {
				if (arg2.aClass261_1 == null) {
					arg2.aClass261_1 = new Class261();
				}
				@Pc(569) Class261 local569 = arg3.aClass261_1 = arg2.aClass261_1;
				if (local569.aShortArray103 == null || this.anInt6640 > local569.aShortArray103.length) {
					local585 = this.anInt6640;
					local569.aShortArray102 = new short[local585];
					local569.aShortArray103 = new short[local585];
					local569.aByteArray55 = new byte[local585];
					local569.aShortArray104 = new short[local585];
				}
				for (local585 = 0; local585 < this.anInt6640; local585++) {
					arg3.aShortArray97[local585] = this.aShortArray97[local585];
					arg3.aShortArray98[local585] = this.aShortArray98[local585];
					arg3.aShortArray92[local585] = this.aShortArray92[local585];
					local569.aShortArray103[local585] = this.aClass261_1.aShortArray103[local585];
					local569.aShortArray104[local585] = this.aClass261_1.aShortArray104[local585];
					local569.aShortArray102[local585] = this.aClass261_1.aShortArray102[local585];
					local569.aByteArray55[local585] = this.aClass261_1.aByteArray55[local585];
				}
			}
			arg3.aByteArray51 = this.aByteArray51;
		} else {
			arg3.aClass261_1 = this.aClass261_1;
			arg3.aShortArray97 = this.aShortArray97;
			arg3.aByteArray51 = this.aByteArray51;
			arg3.aShortArray92 = this.aShortArray92;
			arg3.aShortArray98 = this.aShortArray98;
		}
		if (Static369.method5774(this.anInt6649, arg1)) {
			arg3.aClass159_10 = arg2.aClass159_10;
			if (arg4) {
				arg3.aByte90 = (byte) (arg3.aByte90 | 0x4);
			}
			arg3.aClass159_10.aByte79 = this.aClass159_10.aByte79;
			arg3.aClass159_10.anInterface7_2 = this.aClass159_10.anInterface7_2;
		} else if (Static85.method1347(arg1, this.anInt6649)) {
			arg3.aClass159_10 = this.aClass159_10;
		} else {
			arg3.aClass159_10 = null;
		}
		if (Static602.method8405(this.anInt6649, arg1)) {
			if (arg2.aFloatArray47 == null || this.anInt6639 > arg2.aFloatArray47.length) {
				local211 = this.anInt6640;
				arg3.aFloatArray46 = arg2.aFloatArray46 = new float[local211];
				arg3.aFloatArray47 = arg2.aFloatArray47 = new float[local211];
			} else {
				arg3.aFloatArray46 = arg2.aFloatArray46;
				arg3.aFloatArray47 = arg2.aFloatArray47;
			}
			for (local211 = 0; local211 < this.anInt6640; local211++) {
				arg3.aFloatArray47[local211] = this.aFloatArray47[local211];
				arg3.aFloatArray46[local211] = this.aFloatArray46[local211];
			}
		} else {
			arg3.aFloatArray47 = this.aFloatArray47;
			arg3.aFloatArray46 = this.aFloatArray46;
		}
		if (Static358.method6961(this.anInt6649, arg1)) {
			if (arg4) {
				arg3.aByte90 = (byte) (arg3.aByte90 | 0x8);
			}
			arg3.aClass159_12 = arg2.aClass159_12;
			arg3.aClass159_12.aByte79 = this.aClass159_12.aByte79;
			arg3.aClass159_12.anInterface7_2 = this.aClass159_12.anInterface7_2;
		} else if (Static437.method6512(arg1, this.anInt6649)) {
			arg3.aClass159_12 = this.aClass159_12;
		} else {
			arg3.aClass159_12 = null;
		}
		if (Static248.method3792(arg1, this.anInt6649)) {
			if (arg2.aShortArray91 == null || arg2.aShortArray91.length < this.anInt6639) {
				local211 = this.anInt6639;
				arg3.aShortArray94 = arg2.aShortArray94 = new short[local211];
				arg3.aShortArray91 = arg2.aShortArray91 = new short[local211];
				arg3.aShortArray90 = arg2.aShortArray90 = new short[local211];
			} else {
				arg3.aShortArray90 = arg2.aShortArray90;
				arg3.aShortArray94 = arg2.aShortArray94;
				arg3.aShortArray91 = arg2.aShortArray91;
			}
			for (local211 = 0; local211 < this.anInt6639; local211++) {
				arg3.aShortArray91[local211] = this.aShortArray91[local211];
				arg3.aShortArray94[local211] = this.aShortArray94[local211];
				arg3.aShortArray90[local211] = this.aShortArray90[local211];
			}
		} else {
			arg3.aShortArray90 = this.aShortArray90;
			arg3.aShortArray94 = this.aShortArray94;
			arg3.aShortArray91 = this.aShortArray91;
		}
		if (Static83.method7208(arg1, this.anInt6649)) {
			if (arg4) {
				arg3.aByte90 = (byte) (arg3.aByte90 | 0x10);
			}
			arg3.aClass355_1 = arg2.aClass355_1;
			arg3.aClass355_1.anInterface2_4 = this.aClass355_1.anInterface2_4;
		} else if (Static479.method6947(this.anInt6649, arg1)) {
			arg3.aClass355_1 = this.aClass355_1;
		} else {
			arg3.aClass355_1 = null;
		}
		if (Static620.method8539(arg1, this.anInt6649)) {
			if (arg2.aShortArray88 == null || arg2.aShortArray88.length < this.anInt6639) {
				local211 = this.anInt6639;
				arg3.aShortArray88 = arg2.aShortArray88 = new short[local211];
			} else {
				arg3.aShortArray88 = arg2.aShortArray88;
			}
			for (local211 = 0; local211 < this.anInt6639; local211++) {
				arg3.aShortArray88[local211] = this.aShortArray88[local211];
			}
		} else {
			arg3.aShortArray88 = this.aShortArray88;
		}
		if (!Static288.method4294(arg1, this.anInt6649)) {
			arg3.aClass25Array1 = this.aClass25Array1;
		} else if (arg2.aClass25Array1 == null || this.anInt6651 > arg2.aClass25Array1.length) {
			local211 = this.anInt6651;
			arg3.aClass25Array1 = arg2.aClass25Array1 = new Class25[local211];
			for (local585 = 0; local585 < this.anInt6651; local585++) {
				arg3.aClass25Array1[local585] = this.aClass25Array1[local585].method607();
			}
		} else {
			arg3.aClass25Array1 = arg2.aClass25Array1;
			for (local211 = 0; local211 < this.anInt6651; local211++) {
				arg3.aClass25Array1[local211].method609(this.aClass25Array1[local211]);
			}
		}
		arg3.aClass143Array3 = this.aClass143Array3;
		arg3.aClass356Array1 = this.aClass356Array1;
		arg3.aShortArray93 = this.aShortArray93;
		arg3.anIntArrayArray34 = this.anIntArrayArray34;
		arg3.anIntArray522 = this.anIntArray522;
		arg3.anIntArrayArray33 = this.anIntArrayArray33;
		arg3.anIntArray523 = this.anIntArray523;
		if (this.aBoolean552) {
			arg3.aBoolean552 = true;
			arg3.aShort91 = this.aShort91;
			arg3.aShort84 = this.aShort84;
			arg3.aShort89 = this.aShort89;
			arg3.aShort88 = this.aShort88;
			arg3.aShort85 = this.aShort85;
			arg3.aShort92 = this.aShort92;
			arg3.aShort90 = this.aShort90;
			arg3.aShort93 = this.aShort93;
		} else {
			arg3.aBoolean552 = false;
		}
		arg3.aClass57Array3 = this.aClass57Array3;
		arg3.anIntArrayArray35 = this.anIntArrayArray35;
		arg3.aShortArray95 = this.aShortArray95;
		arg3.aShortArray89 = this.aShortArray89;
		return arg3;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ISIBI)I")
	private int method5901(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(17) int local17 = Static643.anIntArray836[Static400.method6180(arg2, arg0)];
		if (arg1 != -1) {
			@Pc(30) Class321 local30 = this.aClass126_Sub3_25.anInterface8_10.method7813(arg1 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte117 & 0xFF;
			@Pc(52) int local52;
			@Pc(76) int local76;
			if (local35 != 0) {
				if (arg2 < 0) {
					local52 = 0;
				} else if (arg2 > 127) {
					local52 = 16777215;
				} else {
					local52 = arg2 * 131586;
				}
				if (local35 == 256) {
					local17 = local52;
				} else {
					local76 = 256 - local35;
					local17 = ((local17 & 0xFF00) * local76 + (local52 & 0xFF00) * local35 & 0xFF0000) + (local76 * (local17 & 0xFF00FF) + (local52 & 0xFF00FF) * local35 & 0xFF00FF00) >> 8;
				}
			}
			local52 = local30.aByte116 & 0xFF;
			if (local52 != 0) {
				local52 += 256;
				@Pc(125) int local125 = local52 * (local17 >> 16 & 0xFF);
				if (local125 > 65535) {
					local125 = 65535;
				}
				local76 = local52 * (local17 >> 8 & 0xFF);
				if (local76 > 65535) {
					local76 = 65535;
				}
				@Pc(153) int local153 = local52 * (local17 & 0xFF);
				if (local153 > 65535) {
					local153 = 65535;
				}
				local17 = (local125 << 8 & 0xFF0088) + (local76 & 0xFF00) + (local153 >> 8);
			}
		}
		return (local17 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7937(@OriginalArg(0) Class180 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class180_Sub2 local8 = (Class180_Sub2) arg0;
		if (this.anInt6639 == 0 || local8.anInt6639 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt6659;
		@Pc(21) int[] local21 = local8.anIntArray525;
		@Pc(24) int[] local24 = local8.anIntArray521;
		@Pc(27) int[] local27 = local8.anIntArray524;
		@Pc(30) short[] local30 = local8.aShortArray97;
		@Pc(33) short[] local33 = local8.aShortArray98;
		@Pc(36) short[] local36 = local8.aShortArray92;
		@Pc(39) byte[] local39 = local8.aByteArray51;
		@Pc(54) short[] local54;
		@Pc(50) short[] local50;
		@Pc(46) short[] local46;
		@Pc(58) byte[] local58;
		if (this.aClass261_1 == null) {
			local50 = null;
			local58 = null;
			local54 = null;
			local46 = null;
		} else {
			local46 = this.aClass261_1.aShortArray102;
			local50 = this.aClass261_1.aShortArray104;
			local54 = this.aClass261_1.aShortArray103;
			local58 = this.aClass261_1.aByteArray55;
		}
		@Pc(75) short[] local75;
		@Pc(73) short[] local73;
		@Pc(79) short[] local79;
		@Pc(77) byte[] local77;
		if (local8.aClass261_1 == null) {
			local73 = null;
			local75 = null;
			local77 = null;
			local79 = null;
		} else {
			local73 = local8.aClass261_1.aShortArray104;
			local79 = local8.aClass261_1.aShortArray102;
			local75 = local8.aClass261_1.aShortArray103;
			local77 = local8.aClass261_1.aByteArray55;
		}
		@Pc(100) int[] local100 = local8.anIntArray522;
		@Pc(103) short[] local103 = local8.aShortArray93;
		if (!local8.aBoolean552) {
			local8.method5897();
		}
		@Pc(112) short local112 = local8.aShort90;
		@Pc(115) short local115 = local8.aShort93;
		@Pc(118) short local118 = local8.aShort89;
		@Pc(121) short local121 = local8.aShort84;
		@Pc(124) short local124 = local8.aShort92;
		@Pc(127) short local127 = local8.aShort91;
		for (@Pc(129) int local129 = 0; local129 < this.anInt6659; local129++) {
			@Pc(139) int local139 = this.anIntArray521[local129] - arg2;
			if (local139 >= local112 && local115 >= local139) {
				@Pc(163) int local163 = this.anIntArray525[local129] - arg1;
				if (local118 <= local163 && local121 >= local163) {
					@Pc(182) int local182 = this.anIntArray524[local129] - arg3;
					if (local124 <= local182 && local182 <= local127) {
						@Pc(196) int local196 = -1;
						@Pc(201) int local201 = this.anIntArray522[local129];
						@Pc(208) int local208 = this.anIntArray522[local129 + 1];
						for (@Pc(210) int local210 = local201; local210 < local208; local210++) {
							local196 = this.aShortArray93[local210] - 1;
							if (local196 == -1 || this.aByteArray51[local196] != 0) {
								break;
							}
						}
						if (local196 != -1) {
							for (@Pc(243) int local243 = 0; local243 < local18; local243++) {
								if (local21[local243] == local163 && local27[local243] == local182 && local139 == local24[local243]) {
									local201 = local100[local243];
									@Pc(274) int local274 = -1;
									local208 = local100[local243 + 1];
									for (@Pc(282) int local282 = local201; local282 < local208; local282++) {
										local274 = local103[local282] - 1;
										if (local274 == -1 || local39[local274] != 0) {
											break;
										}
									}
									if (local274 != -1) {
										if (local54 == null) {
											this.aClass261_1 = new Class261();
											local54 = this.aClass261_1.aShortArray103 = Static16.method432(this.aShortArray97);
											local50 = this.aClass261_1.aShortArray104 = Static16.method432(this.aShortArray98);
											local46 = this.aClass261_1.aShortArray102 = Static16.method432(this.aShortArray92);
											local58 = this.aClass261_1.aByteArray55 = Static74.method1215(this.aByteArray51);
										}
										if (local75 == null) {
											@Pc(359) Class261 local359 = local8.aClass261_1 = new Class261();
											local75 = local359.aShortArray103 = Static16.method432(local30);
											local73 = local359.aShortArray104 = Static16.method432(local33);
											local79 = local359.aShortArray102 = Static16.method432(local36);
											local77 = local359.aByteArray55 = Static74.method1215(local39);
										}
										@Pc(392) short local392 = this.aShortArray97[local196];
										@Pc(397) short local397 = this.aShortArray98[local196];
										@Pc(402) short local402 = this.aShortArray92[local196];
										local208 = local100[local243 + 1];
										@Pc(413) byte local413 = this.aByteArray51[local196];
										local201 = local100[local243];
										@Pc(427) int local427;
										for (@Pc(419) int local419 = local201; local419 < local208; local419++) {
											local427 = local103[local419] - 1;
											if (local427 == -1) {
												break;
											}
											if (local77[local427] != 0) {
												local75[local427] += local392;
												local73[local427] += local397;
												local79[local427] += local402;
												local77[local427] += local413;
											}
										}
										local392 = local30[local274];
										local201 = this.anIntArray522[local129];
										local208 = this.anIntArray522[local129 + 1];
										local402 = local36[local274];
										local413 = local39[local274];
										local397 = local33[local274];
										for (local427 = local201; local427 < local208; local427++) {
											@Pc(513) int local513 = this.aShortArray93[local427] - 1;
											if (local513 == -1) {
												break;
											}
											if (local58[local513] != 0) {
												local54[local513] += local392;
												local50[local513] += local397;
												local46[local513] += local402;
												local58[local513] += local413;
											}
										}
										if (this.aClass159_10 == null && this.aClass159_9 != null) {
											this.aClass159_9.anInterface7_2 = null;
										}
										if (this.aClass159_10 != null) {
											this.aClass159_10.anInterface7_2 = null;
										}
										if (local8.aClass159_10 == null && local8.aClass159_9 != null) {
											local8.aClass159_9.anInterface7_2 = null;
										}
										if (local8.aClass159_10 != null) {
											local8.aClass159_10.anInterface7_2 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "()V")
	@Override
	public void method7944() {
		if (this.anInt6640 <= 0 || this.anInt6630 <= 0) {
			return;
		}
		this.method5895(false);
		if ((this.aByte90 & 0x10) == 0 && this.aClass355_1.anInterface2_4 == null) {
			this.method5899(false);
		}
		this.method5890();
	}
}
