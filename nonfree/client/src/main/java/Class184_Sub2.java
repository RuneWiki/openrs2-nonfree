import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class184_Sub2 extends Class184 {

	@OriginalMember(owner = "client!pr", name = "q", descriptor = "[I")
	private int[] anIntArray523;

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "[Lclient!fba;")
	private Class100[] aClass100Array4;

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "S")
	private short aShort98;

	@OriginalMember(owner = "client!pr", name = "v", descriptor = "S")
	private short aShort99;

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!pr", name = "z", descriptor = "Lclient!os;")
	private Class261 aClass261_1;

	@OriginalMember(owner = "client!pr", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!pr", name = "D", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!pr", name = "E", descriptor = "Lclient!vn;")
	private Interface26 anInterface26_6;

	@OriginalMember(owner = "client!pr", name = "G", descriptor = "S")
	private short aShort100;

	@OriginalMember(owner = "client!pr", name = "H", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!pr", name = "K", descriptor = "[I")
	private int[] anIntArray524;

	@OriginalMember(owner = "client!pr", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!pr", name = "P", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!pr", name = "R", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!pr", name = "cb", descriptor = "[F")
	private float[] aFloatArray46;

	@OriginalMember(owner = "client!pr", name = "eb", descriptor = "[B")
	private byte[] aByteArray86;

	@OriginalMember(owner = "client!pr", name = "kb", descriptor = "S")
	private short aShort102;

	@OriginalMember(owner = "client!pr", name = "lb", descriptor = "[I")
	private int[] lb;

	@OriginalMember(owner = "client!pr", name = "mb", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!pr", name = "ob", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!pr", name = "sb", descriptor = "[Lclient!mb;")
	private Class218[] aClass218Array4;

	@OriginalMember(owner = "client!pr", name = "tb", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!pr", name = "ub", descriptor = "[Lclient!gn;")
	private Class126[] aClass126Array1;

	@OriginalMember(owner = "client!pr", name = "xb", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!pr", name = "Cb", descriptor = "[I")
	private int[] anIntArray525;

	@OriginalMember(owner = "client!pr", name = "Eb", descriptor = "S")
	private short aShort103;

	@OriginalMember(owner = "client!pr", name = "Hb", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!pr", name = "Mb", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!pr", name = "Tb", descriptor = "I")
	private int anInt7984;

	@OriginalMember(owner = "client!pr", name = "Vb", descriptor = "S")
	private short aShort104;

	@OriginalMember(owner = "client!pr", name = "cc", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!pr", name = "dc", descriptor = "[I")
	private int[] anIntArray526;

	@OriginalMember(owner = "client!pr", name = "ec", descriptor = "[F")
	private float[] aFloatArray47;

	@OriginalMember(owner = "client!pr", name = "hc", descriptor = "B")
	private byte aByte112;

	@OriginalMember(owner = "client!pr", name = "oc", descriptor = "S")
	private short aShort105;

	@OriginalMember(owner = "client!pr", name = "pc", descriptor = "S")
	private short aShort106;

	@OriginalMember(owner = "client!pr", name = "qc", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!pr", name = "rc", descriptor = "Lclient!jda;")
	private Interface14 anInterface14_4;

	@OriginalMember(owner = "client!pr", name = "uc", descriptor = "[B")
	private byte[] aByteArray87;

	@OriginalMember(owner = "client!pr", name = "vc", descriptor = "I")
	private int anInt7999;

	@OriginalMember(owner = "client!pr", name = "xc", descriptor = "I")
	private int anInt8001;

	@OriginalMember(owner = "client!pr", name = "Bc", descriptor = "S")
	private short aShort107;

	@OriginalMember(owner = "client!pr", name = "Ec", descriptor = "[Lclient!eia;")
	private Class85[] aClass85Array1;

	@OriginalMember(owner = "client!pr", name = "W", descriptor = "I")
	private int anInt7955 = 0;

	@OriginalMember(owner = "client!pr", name = "wb", descriptor = "Z")
	private boolean aBoolean549 = true;

	@OriginalMember(owner = "client!pr", name = "nb", descriptor = "I")
	private int anInt7966 = 0;

	@OriginalMember(owner = "client!pr", name = "Ib", descriptor = "I")
	private int anInt7976 = 0;

	@OriginalMember(owner = "client!pr", name = "J", descriptor = "I")
	private int anInt7946 = 0;

	@OriginalMember(owner = "client!pr", name = "gc", descriptor = "Z")
	private boolean aBoolean550 = false;

	@OriginalMember(owner = "client!pr", name = "qb", descriptor = "Z")
	private boolean aBoolean548 = false;

	@OriginalMember(owner = "client!pr", name = "Zb", descriptor = "I")
	private int anInt7989 = 0;

	@OriginalMember(owner = "client!pr", name = "zc", descriptor = "Z")
	private boolean aBoolean551 = false;

	@OriginalMember(owner = "client!pr", name = "yc", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_36;

	@OriginalMember(owner = "client!pr", name = "Nb", descriptor = "Lclient!ls;")
	private Class214 aClass214_12;

	@OriginalMember(owner = "client!pr", name = "lc", descriptor = "Lclient!ls;")
	private Class214 aClass214_14;

	@OriginalMember(owner = "client!pr", name = "Bb", descriptor = "Lclient!ls;")
	private Class214 aClass214_11;

	@OriginalMember(owner = "client!pr", name = "Rb", descriptor = "Lclient!ls;")
	private Class214 aClass214_13;

	@OriginalMember(owner = "client!pr", name = "fc", descriptor = "Lclient!mj;")
	private Class225 aClass225_1;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class184_Sub2(@OriginalArg(0) Class132_Sub3 arg0) {
		this.aClass132_Sub3_36 = arg0;
		this.aClass214_12 = new Class214((Interface26) null, 5126, 3, 0);
		this.aClass214_14 = new Class214((Interface26) null, 5126, 2, 0);
		this.aClass214_11 = new Class214((Interface26) null, 5126, 3, 0);
		this.aClass214_13 = new Class214((Interface26) null, 5121, 4, 0);
		this.aClass225_1 = new Class225();
	}

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!pq;Lclient!ao;IIII)V")
	public Class184_Sub2(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass132_Sub3_36 = arg0;
		this.anInt8001 = arg5;
		this.anInt7999 = arg2;
		if (Static405.method5834(arg2, arg5)) {
			this.aClass214_12 = new Class214((Interface26) null, 5126, 3, 0);
		}
		if (Static556.method7864(arg5, arg2)) {
			this.aClass214_14 = new Class214((Interface26) null, 5126, 2, 0);
		}
		if (Static46.method956(arg5, arg2)) {
			this.aClass214_11 = new Class214((Interface26) null, 5126, 3, 0);
		}
		if (Static173.method2463(arg2, arg5)) {
			this.aClass214_13 = new Class214((Interface26) null, 5121, 4, 0);
		}
		if (Static360.method8251(arg2, arg5)) {
			this.aClass225_1 = new Class225();
		}
		@Pc(108) Interface6 local108 = arg0.anInterface6_11;
		@Pc(112) int[] local112 = new int[arg1.anInt509];
		this.anIntArray526 = new int[arg1.anInt506 + 1];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt509; local121++) {
			if (arg1.aByteArray3 == null || arg1.aByteArray3[local121] != 2) {
				if (arg1.aShortArray14 != null && arg1.aShortArray14[local121] != -1) {
					@Pc(154) Class294 local154 = local108.method7088(arg1.aShortArray14[local121] & 0xFFFF);
					if (((this.anInt8001 & 0x40) == 0 || !local154.aBoolean573) && local154.aBoolean567) {
						continue;
					}
				}
				local112[this.anInt7946++] = local121;
				this.anIntArray526[arg1.aShortArray15[local121]]++;
				this.anIntArray526[arg1.aShortArray19[local121]]++;
				this.anIntArray526[arg1.aShortArray21[local121]]++;
			}
		}
		this.anInt7966 = this.anInt7946;
		@Pc(230) long[] local230 = new long[this.anInt7946];
		@Pc(242) boolean local242 = (this.anInt7999 & 0x100) != 0;
		@Pc(254) int local254;
		@Pc(267) int local267;
		@Pc(449) int local449;
		for (@Pc(244) int local244 = 0; local244 < this.anInt7946; local244++) {
			@Pc(250) int local250 = local112[local244];
			@Pc(252) Class294 local252 = null;
			local254 = 0;
			@Pc(256) byte local256 = 0;
			@Pc(258) byte local258 = 0;
			@Pc(260) byte local260 = 0;
			if (arg1.aClass319Array1 != null) {
				@Pc(265) boolean local265 = false;
				for (local267 = 0; local267 < arg1.aClass319Array1.length; local267++) {
					@Pc(274) Class319 local274 = arg1.aClass319Array1[local267];
					if (local274.anInt8748 == local250) {
						@Pc(287) Class5 local287 = Static122.method1892(local274.anInt8754);
						if (local287.aBoolean8) {
							local265 = true;
						}
						if (local287.anInt76 != -1) {
							@Pc(302) Class294 local302 = local108.method7088(local287.anInt76);
							if (local302.anInt8333 == 2) {
								this.aBoolean551 = true;
							}
						}
					}
				}
				if (local265) {
					local230[local244] = Long.MAX_VALUE;
					this.anInt7966--;
					continue;
				}
			}
			@Pc(335) short local335 = -1;
			if (arg1.aShortArray14 != null) {
				local335 = arg1.aShortArray14[local250];
				if (local335 != -1) {
					local252 = local108.method7088(local335 & 0xFFFF);
					if ((this.anInt8001 & 0x40) != 0 && local252.aBoolean573) {
						local252 = null;
						local335 = -1;
					} else {
						local260 = local252.aByte114;
						if (local252.aByte115 != 0 || local252.aByte117 != 0) {
							this.aBoolean548 = true;
						}
						local258 = local252.aByte120;
					}
				}
			}
			@Pc(411) boolean local411 = arg1.aByteArray5 != null && arg1.aByteArray5[local250] != 0 || local252 != null && local252.anInt8333 != 0;
			if ((local242 || local411) && arg1.aByteArray4 != null) {
				local254 += arg1.aByteArray4[local250] << 17;
			}
			if (local411) {
				local254 += 65536;
			}
			local254 += (local258 & 0xFF) << 8;
			local449 = local256 + ((local335 & 0xFFFF) << 16);
			local254 += local260 & 0xFF;
			@Pc(461) int local461 = local449 + (local244 & 0xFFFF);
			local230[local244] = ((long) local254 << 32) + (long) local461;
			this.aBoolean548 |= local252 != null && (local252.aByte115 != 0 || local252.aByte117 != 0);
			this.aBoolean551 |= local411;
		}
		Static408.method5845(local230, local112);
		this.anInt7989 = arg1.anInt502;
		this.anIntArray525 = arg1.anIntArray32;
		this.aShortArray114 = arg1.aShortArray22;
		this.anInt7955 = arg1.anInt506;
		this.anIntArray524 = arg1.anIntArray27;
		this.anIntArray523 = arg1.anIntArray28;
		@Pc(534) Class224[] local534 = new Class224[this.anInt7955];
		this.aClass218Array4 = arg1.aClass218Array1;
		this.aClass100Array4 = arg1.aClass100Array1;
		@Pc(562) int local562;
		@Pc(576) int local576;
		@Pc(619) int local619;
		if (arg1.aClass319Array1 != null) {
			this.anInt7984 = arg1.aClass319Array1.length;
			this.aClass85Array1 = new Class85[this.anInt7984];
			this.aClass126Array1 = new Class126[this.anInt7984];
			for (local562 = 0; local562 < this.anInt7984; local562++) {
				@Pc(569) Class319 local569 = arg1.aClass319Array1[local562];
				@Pc(574) Class5 local574 = Static122.method1892(local569.anInt8754);
				local576 = -1;
				for (@Pc(578) int local578 = 0; local578 < this.anInt7946; local578++) {
					if (local569.anInt8748 == local112[local578]) {
						local576 = local578;
						break;
					}
				}
				if (local576 == -1) {
					throw new RuntimeException();
				}
				local619 = Static70.anIntArray71[arg1.aShortArray16[local569.anInt8748] & 0xFFFF] & 0xFFFFFF;
				@Pc(637) int local637 = local619 | 255 - (arg1.aByteArray5 == null ? 0 : arg1.aByteArray5[local569.anInt8748]) << 24;
				this.aClass85Array1[local562] = new Class85(local576, arg1.aShortArray15[local569.anInt8748], arg1.aShortArray19[local569.anInt8748], arg1.aShortArray21[local569.anInt8748], local574.anInt75, local574.anInt82, local574.anInt76, local574.anInt84, local574.anInt77, local574.aBoolean8, local574.aBoolean9, local569.anInt8746);
				this.aClass126Array1[local562] = new Class126(local637);
			}
		}
		local562 = this.anInt7946 * 3;
		if (arg1.aShortArray20 != null) {
			this.aShortArray107 = new short[this.anInt7946];
		}
		this.aShortArray113 = new short[local562];
		this.aShortArray112 = new short[this.anInt7946];
		this.aShortArray108 = new short[local562];
		this.aShortArray115 = new short[this.anInt7946];
		this.aShortArray111 = new short[this.anInt7946];
		Static76.aLongArray4 = new long[local562];
		this.aShortArray109 = new short[local562];
		this.aFloatArray46 = new float[local562];
		this.aShortArray105 = new short[this.anInt7946];
		this.aShortArray106 = new short[this.anInt7946];
		this.aShortArray110 = new short[local562];
		this.aShort107 = (short) arg4;
		this.aByteArray86 = new byte[this.anInt7946];
		this.aFloatArray47 = new float[local562];
		this.aShort102 = (short) arg3;
		this.aByteArray87 = new byte[local562];
		local254 = 0;
		for (local449 = 0; local449 < arg1.anInt506; local449++) {
			local576 = this.anIntArray526[local449];
			this.anIntArray526[local449] = local254;
			local534[local449] = new Class224();
			local254 += local576;
		}
		this.anIntArray526[arg1.anInt506] = local254;
		@Pc(819) Class49 local819 = Static274.method4048(local112, arg1, this.anInt7946);
		@Pc(823) Class26[] local823 = new Class26[arg1.anInt509];
		@Pc(864) int local864;
		@Pc(875) int local875;
		@Pc(897) int local897;
		@Pc(908) int local908;
		@Pc(917) int local917;
		@Pc(925) int local925;
		@Pc(842) short local842;
		@Pc(853) int local853;
		for (local619 = 0; local619 < arg1.anInt509; local619++) {
			@Pc(832) short local832 = arg1.aShortArray15[local619];
			@Pc(837) short local837 = arg1.aShortArray19[local619];
			local842 = arg1.aShortArray21[local619];
			local853 = this.anIntArray524[local837] - this.anIntArray524[local832];
			local864 = this.anIntArray523[local837] - this.anIntArray523[local832];
			local875 = this.anIntArray525[local837] - this.anIntArray525[local832];
			@Pc(886) int local886 = this.anIntArray524[local842] - this.anIntArray524[local832];
			local897 = this.anIntArray523[local842] - this.anIntArray523[local832];
			local908 = this.anIntArray525[local842] - this.anIntArray525[local832];
			local917 = local864 * local908 - local897 * local875;
			local925 = local875 * local886 - local908 * local853;
			@Pc(934) int local934 = local897 * local853 - local886 * local864;
			while (local917 > 8192 || local925 > 8192 || local934 > 8192 || local917 < -8192 || local925 < -8192 || local934 < -8192) {
				local934 >>= 0x1;
				local925 >>= 0x1;
				local917 >>= 0x1;
			}
			@Pc(987) int local987 = (int) Math.sqrt((double) (local934 * local934 + local917 * local917 + local925 * local925));
			if (local987 <= 0) {
				local987 = 1;
			}
			local925 = local925 * 256 / local987;
			local917 = local917 * 256 / local987;
			local934 = local934 * 256 / local987;
			@Pc(1019) byte local1019 = arg1.aByteArray3 == null ? 0 : arg1.aByteArray3[local619];
			if (local1019 == 0) {
				@Pc(1025) Class224 local1025 = local534[local832];
				local1025.anInt6290 += local925;
				local1025.anInt6289 += local917;
				local1025.anInt6291++;
				local1025.anInt6292 += local934;
				@Pc(1053) Class224 local1053 = local534[local837];
				local1053.anInt6290 += local925;
				local1053.anInt6289 += local917;
				local1053.anInt6291++;
				local1053.anInt6292 += local934;
				@Pc(1081) Class224 local1081 = local534[local842];
				local1081.anInt6289 += local917;
				local1081.anInt6292 += local934;
				local1081.anInt6291++;
				local1081.anInt6290 += local925;
			} else if (local1019 == 1) {
				@Pc(1120) Class26 local1120 = local823[local619] = new Class26();
				local1120.anInt603 = local917;
				local1120.anInt605 = local934;
				local1120.anInt610 = local925;
			}
		}
		@Pc(1142) int local1142;
		@Pc(1185) short local1185;
		for (local267 = 0; local267 < this.anInt7946; local267++) {
			local1142 = local112[local267];
			@Pc(1149) int local1149 = arg1.aShortArray16[local1142] & 0xFFFF;
			if (arg1.aByteArray8 == null) {
				local853 = -1;
			} else {
				local853 = arg1.aByteArray8[local1142];
			}
			if (arg1.aByteArray5 == null) {
				local864 = 0;
			} else {
				local864 = arg1.aByteArray5[local1142] & 0xFF;
			}
			local1185 = arg1.aShortArray14 == null ? -1 : arg1.aShortArray14[local1142];
			if (local1185 != -1 && (this.anInt8001 & 0x40) != 0) {
				@Pc(1203) Class294 local1203 = local108.method7088(local1185 & 0xFFFF);
				if (local1203.aBoolean573) {
					local1185 = -1;
				}
			}
			@Pc(1210) float local1210 = 0.0F;
			@Pc(1212) float local1212 = 0.0F;
			@Pc(1214) float local1214 = 0.0F;
			@Pc(1216) float local1216 = 0.0F;
			@Pc(1218) float local1218 = 0.0F;
			@Pc(1220) float local1220 = 0.0F;
			@Pc(1222) byte local1222 = 0;
			@Pc(1224) byte local1224 = 0;
			@Pc(1226) int local1226 = 0;
			@Pc(1242) byte local1242;
			@Pc(1259) short local1259;
			@Pc(1264) short local1264;
			@Pc(1269) short local1269;
			if (local1185 != -1) {
				if (local853 == -1) {
					local1212 = 1.0F;
					local1218 = 0.0F;
					local1222 = 1;
					local1214 = 1.0F;
					local1210 = 0.0F;
					local1224 = 2;
					local1220 = 0.0F;
					local1216 = 1.0F;
				} else {
					local853 &= 0xFF;
					local1242 = arg1.aByteArray7[local853];
					@Pc(1249) short local1249;
					@Pc(1254) short local1254;
					@Pc(1292) float local1292;
					@Pc(1301) float local1301;
					@Pc(1310) float local1310;
					@Pc(1395) float local1395;
					@Pc(1404) float local1404;
					@Pc(1413) float local1413;
					@Pc(1422) float local1422;
					@Pc(1431) float local1431;
					@Pc(1440) float local1440;
					if (local1242 == 0) {
						local1249 = arg1.aShortArray15[local1142];
						local1254 = arg1.aShortArray19[local1142];
						local1259 = arg1.aShortArray21[local1142];
						local1264 = arg1.aShortArray13[local853];
						local1269 = arg1.aShortArray18[local853];
						@Pc(1274) short local1274 = arg1.aShortArray17[local853];
						@Pc(1280) float local1280 = (float) arg1.anIntArray27[local1264];
						@Pc(1286) float local1286 = (float) arg1.anIntArray28[local1264];
						local1292 = (float) arg1.anIntArray32[local1264];
						local1301 = (float) arg1.anIntArray27[local1269] - local1280;
						local1310 = (float) arg1.anIntArray28[local1269] - local1286;
						@Pc(1318) float local1318 = (float) arg1.anIntArray32[local1269] - local1292;
						@Pc(1326) float local1326 = (float) arg1.anIntArray27[local1274] - local1280;
						@Pc(1335) float local1335 = (float) arg1.anIntArray28[local1274] - local1286;
						@Pc(1343) float local1343 = (float) arg1.anIntArray32[local1274] - local1292;
						@Pc(1352) float local1352 = (float) arg1.anIntArray27[local1249] - local1280;
						@Pc(1361) float local1361 = (float) arg1.anIntArray28[local1249] - local1286;
						@Pc(1369) float local1369 = (float) arg1.anIntArray32[local1249] - local1292;
						@Pc(1378) float local1378 = (float) arg1.anIntArray27[local1254] - local1280;
						@Pc(1386) float local1386 = (float) arg1.anIntArray28[local1254] - local1286;
						local1395 = (float) arg1.anIntArray32[local1254] - local1292;
						local1404 = (float) arg1.anIntArray27[local1259] - local1280;
						local1413 = (float) arg1.anIntArray28[local1259] - local1286;
						local1422 = (float) arg1.anIntArray32[local1259] - local1292;
						local1431 = local1310 * local1343 - local1335 * local1318;
						local1440 = local1326 * local1318 - local1301 * local1343;
						@Pc(1448) float local1448 = local1335 * local1301 - local1310 * local1326;
						@Pc(1456) float local1456 = local1335 * local1448 - local1343 * local1440;
						@Pc(1465) float local1465 = local1343 * local1431 - local1326 * local1448;
						@Pc(1474) float local1474 = local1326 * local1440 - local1431 * local1335;
						@Pc(1488) float local1488 = 1.0F / (local1310 * local1465 + local1456 * local1301 + local1318 * local1474);
						local1214 = local1488 * (local1474 * local1395 + local1378 * local1456 + local1465 * local1386);
						local1210 = local1488 * (local1465 * local1361 + local1352 * local1456 + local1474 * local1369);
						local1218 = (local1413 * local1465 + local1456 * local1404 + local1474 * local1422) * local1488;
						@Pc(1538) float local1538 = local1301 * local1440 - local1431 * local1310;
						@Pc(1547) float local1547 = local1431 * local1318 - local1448 * local1301;
						@Pc(1556) float local1556 = local1448 * local1310 - local1440 * local1318;
						@Pc(1570) float local1570 = 1.0F / (local1343 * local1538 + local1335 * local1547 + local1326 * local1556);
						local1212 = local1570 * (local1352 * local1556 + local1547 * local1361 + local1369 * local1538);
						local1216 = (local1538 * local1395 + local1386 * local1547 + local1378 * local1556) * local1570;
						local1220 = local1570 * (local1547 * local1413 + local1556 * local1404 + local1422 * local1538);
					} else {
						local1249 = arg1.aShortArray15[local1142];
						local1254 = arg1.aShortArray19[local1142];
						local1259 = arg1.aShortArray21[local1142];
						@Pc(1634) int local1634 = local819.anIntArray67[local853];
						@Pc(1639) int local1639 = local819.anIntArray66[local853];
						@Pc(1644) int local1644 = local819.anIntArray68[local853];
						@Pc(1649) float[] local1649 = local819.aFloatArrayArray7[local853];
						@Pc(1654) byte local1654 = arg1.aByteArray9[local853];
						local1292 = (float) arg1.anIntArray26[local853] / 256.0F;
						if (local1242 == 1) {
							local1301 = (float) arg1.anIntArray23[local853] / 1024.0F;
							Static539.method7684(Static575.aFloatArray70, local1301, local1644, local1292, local1634, arg1.anIntArray32[local1249], local1654, local1639, arg1.anIntArray28[local1249], arg1.anIntArray27[local1249], local1649);
							local1210 = Static575.aFloatArray70[0];
							local1212 = Static575.aFloatArray70[1];
							Static539.method7684(Static575.aFloatArray70, local1301, local1644, local1292, local1634, arg1.anIntArray32[local1254], local1654, local1639, arg1.anIntArray28[local1254], arg1.anIntArray27[local1254], local1649);
							local1214 = Static575.aFloatArray70[0];
							local1216 = Static575.aFloatArray70[1];
							Static539.method7684(Static575.aFloatArray70, local1301, local1644, local1292, local1634, arg1.anIntArray32[local1259], local1654, local1639, arg1.anIntArray28[local1259], arg1.anIntArray27[local1259], local1649);
							local1220 = Static575.aFloatArray70[1];
							local1218 = Static575.aFloatArray70[0];
							local1310 = local1301 / 2.0F;
							if ((local1654 & 0x1) == 0) {
								if (local1310 < local1214 - local1210) {
									local1222 = 1;
									local1214 -= local1301;
								} else if (local1210 - local1214 > local1310) {
									local1222 = 2;
									local1214 += local1301;
								}
								if (local1310 < local1218 - local1210) {
									local1224 = 1;
									local1218 -= local1301;
								} else if (local1310 < local1210 - local1218) {
									local1218 += local1301;
									local1224 = 2;
								}
							} else {
								if (local1310 < local1216 - local1212) {
									local1216 -= local1301;
									local1222 = 1;
								} else if (local1310 < local1212 - local1216) {
									local1216 += local1301;
									local1222 = 2;
								}
								if (local1310 < local1220 - local1212) {
									local1220 -= local1301;
									local1224 = 1;
								} else if (local1310 < local1212 - local1220) {
									local1220 += local1301;
									local1224 = 2;
								}
							}
						} else if (local1242 == 2) {
							local1301 = (float) arg1.anIntArray30[local853] / 256.0F;
							local1310 = (float) arg1.anIntArray24[local853] / 256.0F;
							@Pc(1919) int local1919 = arg1.anIntArray27[local1254] - arg1.anIntArray27[local1249];
							@Pc(1930) int local1930 = arg1.anIntArray28[local1254] - arg1.anIntArray28[local1249];
							@Pc(1941) int local1941 = arg1.anIntArray32[local1254] - arg1.anIntArray32[local1249];
							@Pc(1952) int local1952 = arg1.anIntArray27[local1259] - arg1.anIntArray27[local1249];
							@Pc(1963) int local1963 = arg1.anIntArray28[local1259] - arg1.anIntArray28[local1249];
							@Pc(1974) int local1974 = arg1.anIntArray32[local1259] - arg1.anIntArray32[local1249];
							@Pc(1983) int local1983 = local1974 * local1930 - local1963 * local1941;
							@Pc(1992) int local1992 = local1941 * local1952 - local1919 * local1974;
							@Pc(2001) int local2001 = local1963 * local1919 - local1952 * local1930;
							local1395 = 64.0F / (float) arg1.anIntArray22[local853];
							local1404 = 64.0F / (float) arg1.anIntArray29[local853];
							local1413 = 64.0F / (float) arg1.anIntArray23[local853];
							local1422 = (local1649[0] * (float) local1983 + local1649[1] * (float) local1992 + (float) local2001 * local1649[2]) / local1395;
							local1431 = ((float) local1992 * local1649[4] + (float) local1983 * local1649[3] + local1649[5] * (float) local2001) / local1404;
							local1440 = ((float) local2001 * local1649[8] + (float) local1983 * local1649[6] + (float) local1992 * local1649[7]) / local1413;
							local1226 = Static318.method4578(local1440, local1422, local1431);
							Static565.method7928(local1301, Static575.aFloatArray70, local1310, arg1.anIntArray32[local1249], local1634, local1226, local1639, local1654, local1644, arg1.anIntArray27[local1249], local1292, local1649, arg1.anIntArray28[local1249]);
							local1212 = Static575.aFloatArray70[1];
							local1210 = Static575.aFloatArray70[0];
							Static565.method7928(local1301, Static575.aFloatArray70, local1310, arg1.anIntArray32[local1254], local1634, local1226, local1639, local1654, local1644, arg1.anIntArray27[local1254], local1292, local1649, arg1.anIntArray28[local1254]);
							local1216 = Static575.aFloatArray70[1];
							local1214 = Static575.aFloatArray70[0];
							Static565.method7928(local1301, Static575.aFloatArray70, local1310, arg1.anIntArray32[local1259], local1634, local1226, local1639, local1654, local1644, arg1.anIntArray27[local1259], local1292, local1649, arg1.anIntArray28[local1259]);
							local1220 = Static575.aFloatArray70[1];
							local1218 = Static575.aFloatArray70[0];
						} else if (local1242 == 3) {
							Static463.method6860(Static575.aFloatArray70, local1639, local1644, arg1.anIntArray32[local1249], arg1.anIntArray28[local1249], local1292, local1649, local1634, arg1.anIntArray27[local1249], local1654);
							local1212 = Static575.aFloatArray70[1];
							local1210 = Static575.aFloatArray70[0];
							Static463.method6860(Static575.aFloatArray70, local1639, local1644, arg1.anIntArray32[local1254], arg1.anIntArray28[local1254], local1292, local1649, local1634, arg1.anIntArray27[local1254], local1654);
							local1216 = Static575.aFloatArray70[1];
							local1214 = Static575.aFloatArray70[0];
							Static463.method6860(Static575.aFloatArray70, local1639, local1644, arg1.anIntArray32[local1259], arg1.anIntArray28[local1259], local1292, local1649, local1634, arg1.anIntArray27[local1259], local1654);
							local1218 = Static575.aFloatArray70[0];
							local1220 = Static575.aFloatArray70[1];
							if ((local1654 & 0x1) == 0) {
								if (local1214 - local1210 > 0.5F) {
									local1214--;
									local1222 = 1;
								} else if (local1210 - local1214 > 0.5F) {
									local1214++;
									local1222 = 2;
								}
								if (local1218 - local1210 > 0.5F) {
									local1218--;
									local1224 = 1;
								} else if (local1210 - local1218 > 0.5F) {
									local1224 = 2;
									local1218++;
								}
							} else {
								if (local1220 - local1212 > 0.5F) {
									local1220--;
									local1224 = 1;
								} else if (local1212 - local1220 > 0.5F) {
									local1224 = 2;
									local1220++;
								}
								if (local1216 - local1212 > 0.5F) {
									local1216--;
									local1222 = 1;
								} else if (local1212 - local1216 > 0.5F) {
									local1216++;
									local1222 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray3 == null) {
				local1242 = 0;
			} else {
				local1242 = arg1.aByteArray3[local1142];
			}
			if (local1242 == 0) {
				@Pc(2584) long local2584 = ((long) (local1226 << 24) + (long) (local1149 << 8) + (long) local864 << 32) + (long) (local853 << 2);
				local1259 = arg1.aShortArray15[local1142];
				local1264 = arg1.aShortArray19[local1142];
				local1269 = arg1.aShortArray21[local1142];
				@Pc(2603) Class224 local2603 = local534[local1259];
				this.aShortArray106[local267] = this.method6850(local1210, local1212, local2584, local2603.anInt6292, arg1, local2603.anInt6291, local1259, local2603.anInt6289, local2603.anInt6290);
				@Pc(2627) Class224 local2627 = local534[local1264];
				this.aShortArray115[local267] = this.method6850(local1214, local1216, local2584 + (long) local1222, local2627.anInt6292, arg1, local2627.anInt6291, local1264, local2627.anInt6289, local2627.anInt6290);
				@Pc(2654) Class224 local2654 = local534[local1269];
				this.aShortArray112[local267] = this.method6850(local1218, local1220, local2584 + (long) local1224, local2654.anInt6292, arg1, local2654.anInt6291, local1269, local2654.anInt6289, local2654.anInt6290);
			} else if (local1242 == 1) {
				@Pc(2445) Class26 local2445 = local823[local1142];
				@Pc(2488) long local2488 = ((long) (local1149 << 8) + (long) (local1226 << 24) + (long) local864 << 32) + (long) ((local2445.anInt610 + 256 << 12) + ((local2445.anInt603 > 0 ? 1024 : 2048) + (local853 << 2) + (local2445.anInt605 + 256 << 22)));
				this.aShortArray106[local267] = this.method6850(local1210, local1212, local2488, local2445.anInt605, arg1, 0, arg1.aShortArray15[local1142], local2445.anInt603, local2445.anInt610);
				this.aShortArray115[local267] = this.method6850(local1214, local1216, (long) local1222 + local2488, local2445.anInt605, arg1, 0, arg1.aShortArray19[local1142], local2445.anInt603, local2445.anInt610);
				this.aShortArray112[local267] = this.method6850(local1218, local1220, (long) local1224 + local2488, local2445.anInt605, arg1, 0, arg1.aShortArray21[local1142], local2445.anInt603, local2445.anInt610);
			}
			if (arg1.aByteArray5 != null) {
				this.aByteArray86[local267] = arg1.aByteArray5[local1142];
			}
			if (arg1.aShortArray20 != null) {
				this.aShortArray107[local267] = arg1.aShortArray20[local1142];
			}
			this.aShortArray111[local267] = arg1.aShortArray16[local1142];
			this.aShortArray105[local267] = local1185;
		}
		local1142 = 0;
		local842 = -10000;
		for (local853 = 0; local853 < this.anInt7966; local853++) {
			@Pc(2734) short local2734 = this.aShortArray105[local853];
			if (local842 != local2734) {
				local1142++;
				local842 = local2734;
			}
		}
		this.lb = new int[local1142 + 1];
		local842 = -10000;
		local1142 = 0;
		for (local864 = 0; local864 < this.anInt7966; local864++) {
			local1185 = this.aShortArray105[local864];
			if (local842 != local1185) {
				local842 = local1185;
				this.lb[local1142++] = local864;
			}
		}
		this.lb[local1142] = this.anInt7966;
		Static76.aLongArray4 = null;
		this.aShortArray110 = Static128.method1957(this.aShortArray110, this.anInt7976);
		this.aShortArray109 = Static128.method1957(this.aShortArray109, this.anInt7976);
		this.aShortArray113 = Static128.method1957(this.aShortArray113, this.anInt7976);
		this.aByteArray87 = Static360.method8243(this.anInt7976, this.aByteArray87);
		this.aFloatArray46 = Static502.method7197(this.aFloatArray46, this.anInt7976);
		this.aFloatArray47 = Static502.method7197(this.aFloatArray47, this.anInt7976);
		if (arg1.anIntArray25 != null && Static644.method8781(this.anInt8001, arg2)) {
			this.anIntArrayArray46 = arg1.method537(false);
		}
		if (arg1.aClass319Array1 != null && Static607.method8311(this.anInt8001, arg2)) {
			this.anIntArrayArray47 = arg1.method541();
		}
		if (arg1.anIntArray31 != null && Static432.method6400(this.anInt8001, arg2)) {
			local875 = 0;
			@Pc(2891) int[] local2891 = new int[256];
			for (local897 = 0; local897 < this.anInt7946; local897++) {
				local908 = arg1.anIntArray31[local112[local897]];
				if (local908 >= 0) {
					@Pc(2908) int local2908 = local2891[local908]++;
					if (local875 < local908) {
						local875 = local908;
					}
				}
			}
			this.anIntArrayArray45 = new int[local875 + 1][];
			for (local908 = 0; local908 <= local875; local908++) {
				this.anIntArrayArray45[local908] = new int[local2891[local908]];
				local2891[local908] = 0;
			}
			for (local917 = 0; local917 < this.anInt7946; local917++) {
				local925 = arg1.anIntArray31[local112[local917]];
				if (local925 >= 0) {
					this.anIntArrayArray45[local925][local2891[local925]++] = local917;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub1_Sub3.anIntArray56[arg0];
		@Pc(13) int local13 = Class6_Sub1_Sub3.anIntArray58[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7955; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray524[local15] + this.anIntArray525[local15] * local9 >> 14;
			this.anIntArray525[local15] = local13 * this.anIntArray525[local15] - local9 * this.anIntArray524[local15] >> 14;
			this.anIntArray524[local15] = local33;
		}
		this.aBoolean550 = false;
		if (this.aClass214_12 != null) {
			this.aClass214_12.anInterface26_2 = null;
		}
	}

	@OriginalMember(owner = "client!pr", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7989; local7++) {
			this.anIntArray524[local7] = this.anIntArray524[local7] + 7 >> 4;
			this.anIntArray523[local7] = this.anIntArray523[local7] + 7 >> 4;
			this.anIntArray525[local7] = this.anIntArray525[local7] + 7 >> 4;
		}
		this.aBoolean550 = false;
		if (this.aClass214_12 != null) {
			this.aClass214_12.anInterface26_2 = null;
		}
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "()Z")
	@Override
	public boolean method8645() {
		if (this.aShortArray105 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray105.length; local12++) {
			if (this.aShortArray105[local12] != -1 && !this.aClass132_Sub3_36.anInterface6_11.method7090(this.aShortArray105[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLclient!gea;)V")
	private void method6842(@OriginalArg(1) Class6_Sub4_Sub5_Sub1 arg0) {
		if (this.aClass132_Sub3_36.anIntArray521.length < this.anInt7976) {
			this.aClass132_Sub3_36.anIntArray521 = new int[this.anInt7976];
			this.aClass132_Sub3_36.anIntArray522 = new int[this.anInt7976];
		}
		@Pc(32) int[] local32 = this.aClass132_Sub3_36.anIntArray521;
		@Pc(36) int[] local36 = this.aClass132_Sub3_36.anIntArray522;
		@Pc(65) int local65;
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (@Pc(38) int local38 = 0; local38 < this.anInt7955; local38++) {
			local65 = (this.anIntArray524[local38] - (this.anIntArray523[local38] * this.aClass132_Sub3_36.anInt7897 >> 8) >> this.aClass132_Sub3_36.anInt7879) - arg0.anInt2989;
			@Pc(90) int local90 = (this.anIntArray525[local38] - (this.anIntArray523[local38] * this.aClass132_Sub3_36.anInt7922 >> 8) >> this.aClass132_Sub3_36.anInt7879) - arg0.anInt2996;
			@Pc(95) int local95 = this.anIntArray526[local38];
			@Pc(102) int local102 = this.anIntArray526[local38 + 1];
			for (local104 = local95; local104 < local102; local104++) {
				local113 = this.aShortArray108[local104] - 1;
				if (local113 == -1) {
					break;
				}
				local32[local113] = local65;
				local36[local113] = local90;
			}
		}
		for (local65 = 0; local65 < this.anInt7966; local65++) {
			if (this.aByteArray86 == null || this.aByteArray86[local65] <= 128) {
				@Pc(164) short local164 = this.aShortArray106[local65];
				@Pc(169) short local169 = this.aShortArray115[local65];
				@Pc(174) short local174 = this.aShortArray112[local65];
				local104 = local32[local164];
				local113 = local32[local169];
				@Pc(186) int local186 = local32[local174];
				@Pc(190) int local190 = local36[local164];
				@Pc(194) int local194 = local36[local169];
				@Pc(198) int local198 = local36[local174];
				if ((local104 - local113) * (-local198 + local194) - (local194 - local190) * (-local113 + local186) > 0) {
					arg0.method2497(local198, local113, local194, local104, local190, local186);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IILclient!oo;ZI)Z")
	@Override
	public boolean method8656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6844(arg4, arg3, -1, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
	private void method6843() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt7955; local23++) {
			@Pc(30) int local30 = this.anIntArray524[local23];
			@Pc(35) int local35 = this.anIntArray523[local23];
			if (local30 < local7) {
				local7 = local30;
			}
			if (local9 > local35) {
				local9 = local35;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			@Pc(68) int local68 = this.anIntArray525[local23];
			if (local17 < local68) {
				local17 = local68;
			}
			if (local68 < local11) {
				local11 = local68;
			}
			@Pc(94) int local94 = local68 * local68 + local30 * local30;
			if (local19 < local94) {
				local19 = local94;
			}
			local94 = local35 * local35 + local68 * local68 + local30 * local30;
			if (local94 > local21) {
				local21 = local94;
			}
		}
		this.aShort106 = (short) local15;
		this.aShort103 = (short) local11;
		this.aShort101 = (short) local13;
		this.aShort98 = (short) local9;
		this.aShort100 = (short) local17;
		this.aShort99 = (short) local7;
		this.aShort105 = (short) (int) (Math.sqrt((double) local19) + 0.99D);
		this.aShort104 = (short) (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean550 = true;
	}

	@OriginalMember(owner = "client!pr", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			Static616.anInt10068 = 0;
			local26 = 0;
			Static83.anInt1652 = 0;
			Static28.anInt639 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray46.length) {
					local48 = this.anIntArrayArray46[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray114 == null || (this.aShortArray114[local56] & arg6) != 0) {
							Static83.anInt1652 += this.anIntArray524[local56];
							Static616.anInt10068 += this.anIntArray523[local56];
							Static28.anInt639 += this.anIntArray525[local56];
							local26++;
						}
					}
				}
			}
			if (local26 <= 0) {
				Static83.anInt1652 = arg2;
				Static28.anInt639 = arg4;
				Static616.anInt10068 = arg3;
			} else {
				Static83.anInt1652 = arg2 + Static83.anInt1652 / local26;
				Static205.aBoolean209 = true;
				Static28.anInt639 = arg4 + Static28.anInt639 / local26;
				Static616.anInt10068 = Static616.anInt10068 / local26 + arg3;
			}
			return;
		}
		@Pc(243) int[] local243;
		@Pc(245) int local245;
		if (arg0 == 1) {
			if (arg7 != null) {
				local26 = arg3 * arg7[1] + arg7[0] * arg2 + arg7[2] * arg4 + 8192 >> 14;
				local32 = arg3 * arg7[4] + arg2 * arg7[3] + arg4 * arg7[5] + 8192 >> 14;
				local38 = arg7[6] * arg2 + arg3 * arg7[7] + arg7[8] * arg4 + 8192 >> 14;
				arg4 = local38;
				arg2 = local26;
				arg3 = local32;
			}
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray46.length) {
					local243 = this.anIntArrayArray46[local32];
					for (local245 = 0; local245 < local243.length; local245++) {
						local50 = local243[local245];
						if (this.aShortArray114 == null || (this.aShortArray114[local50] & arg6) != 0) {
							this.anIntArray524[local50] += arg2;
							this.anIntArray523[local50] += arg3;
							this.anIntArray525[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(383) int local383;
		@Pc(401) int local401;
		@Pc(630) int local630;
		@Pc(639) int local639;
		@Pc(651) int local651;
		@Pc(655) int local655;
		@Pc(673) int local673;
		@Pc(1010) int local1010;
		@Pc(1018) int local1018;
		@Pc(1172) int local1172;
		@Pc(1197) int local1197;
		@Pc(1201) int local1201;
		@Pc(1209) int local1209;
		@Pc(1214) int local1214;
		@Pc(1218) int local1218;
		@Pc(1222) int local1222;
		@Pc(1224) int local1224;
		@Pc(1352) int[] local1352;
		@Pc(1354) int local1354;
		@Pc(1358) int local1358;
		@Pc(1362) int local1362;
		@Pc(1364) int local1364;
		@Pc(1494) int local1494;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray46.length) {
						local243 = this.anIntArrayArray46[local32];
						for (local245 = 0; local245 < local243.length; local245++) {
							local50 = local243[local245];
							if (this.aShortArray114 == null || (this.aShortArray114[local50] & arg6) != 0) {
								this.anIntArray524[local50] -= Static83.anInt1652;
								this.anIntArray523[local50] -= Static616.anInt10068;
								this.anIntArray525[local50] -= Static28.anInt639;
								if (arg4 != 0) {
									local56 = Class6_Sub1_Sub3.anIntArray56[arg4];
									local383 = Class6_Sub1_Sub3.anIntArray58[arg4];
									local401 = local383 * this.anIntArray524[local50] + this.anIntArray523[local50] * local56 + 16383 >> 14;
									this.anIntArray523[local50] = this.anIntArray523[local50] * local383 + 16383 - local56 * this.anIntArray524[local50] >> 14;
									this.anIntArray524[local50] = local401;
								}
								if (arg2 != 0) {
									local56 = Class6_Sub1_Sub3.anIntArray56[arg2];
									local383 = Class6_Sub1_Sub3.anIntArray58[arg2];
									local401 = local383 * this.anIntArray523[local50] + 16383 - this.anIntArray525[local50] * local56 >> 14;
									this.anIntArray525[local50] = local56 * this.anIntArray523[local50] + local383 * this.anIntArray525[local50] + 16383 >> 14;
									this.anIntArray523[local50] = local401;
								}
								if (arg3 != 0) {
									local56 = Class6_Sub1_Sub3.anIntArray56[arg3];
									local383 = Class6_Sub1_Sub3.anIntArray58[arg3];
									local401 = this.anIntArray524[local50] * local383 + local56 * this.anIntArray525[local50] + 16383 >> 14;
									this.anIntArray525[local50] = this.anIntArray525[local50] * local383 + 16383 - local56 * this.anIntArray524[local50] >> 14;
									this.anIntArray524[local50] = local401;
								}
								this.anIntArray524[local50] += Static83.anInt1652;
								this.anIntArray523[local50] += Static616.anInt10068;
								this.anIntArray525[local50] += Static28.anInt639;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray46.length > local38) {
							local48 = this.anIntArrayArray46[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray114 == null || (this.aShortArray114[local56] & arg6) != 0) {
									local383 = this.anIntArray526[local56];
									local401 = this.anIntArray526[local56 + 1];
									for (local630 = local383; local630 < local401; local630++) {
										local639 = this.aShortArray108[local630] - 1;
										if (local639 == -1) {
											break;
										}
										if (arg4 != 0) {
											local651 = Class6_Sub1_Sub3.anIntArray56[arg4];
											local655 = Class6_Sub1_Sub3.anIntArray58[arg4];
											local673 = local651 * this.aShortArray109[local639] + this.aShortArray110[local639] * local655 + 16383 >> 14;
											this.aShortArray109[local639] = (short) (local655 * this.aShortArray109[local639] + 16383 - this.aShortArray110[local639] * local651 >> 14);
											this.aShortArray110[local639] = (short) local673;
										}
										if (arg2 != 0) {
											local651 = Class6_Sub1_Sub3.anIntArray56[arg2];
											local655 = Class6_Sub1_Sub3.anIntArray58[arg2];
											local673 = this.aShortArray109[local639] * local655 + 16383 - local651 * this.aShortArray113[local639] >> 14;
											this.aShortArray113[local639] = (short) (local655 * this.aShortArray113[local639] + local651 * this.aShortArray109[local639] + 16383 >> 14);
											this.aShortArray109[local639] = (short) local673;
										}
										if (arg3 != 0) {
											local651 = Class6_Sub1_Sub3.anIntArray56[arg3];
											local655 = Class6_Sub1_Sub3.anIntArray58[arg3];
											local673 = local651 * this.aShortArray113[local639] + this.aShortArray110[local639] * local655 + 16383 >> 14;
											this.aShortArray113[local639] = (short) (local655 * this.aShortArray113[local639] + 16383 - this.aShortArray110[local639] * local651 >> 14);
											this.aShortArray110[local639] = (short) local673;
										}
									}
								}
							}
						}
					}
					if (this.aClass214_11 == null && this.aClass214_13 != null) {
						this.aClass214_13.anInterface26_2 = null;
					}
					if (this.aClass214_11 != null) {
						this.aClass214_11.anInterface26_2 = null;
						return;
					}
				}
			} else {
				local26 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local245 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static205.aBoolean209) {
					local383 = Static28.anInt639 * arg7[6] + Static83.anInt1652 * arg7[0] + arg7[3] * Static616.anInt10068 + 8192 >> 14;
					local401 = Static83.anInt1652 * arg7[1] + Static616.anInt10068 * arg7[4] + Static28.anInt639 * arg7[7] + 8192 >> 14;
					local630 = Static616.anInt10068 * arg7[5] + arg7[2] * Static83.anInt1652 + arg7[8] * Static28.anInt639 + 8192 >> 14;
					local401 += local50;
					local383 += local245;
					local630 += local56;
					Static616.anInt10068 = local401;
					Static83.anInt1652 = local383;
					Static205.aBoolean209 = false;
					Static28.anInt639 = local630;
				}
				@Pc(978) int[] local978 = new int[9];
				local401 = Class6_Sub1_Sub3.anIntArray58[arg2];
				local630 = Class6_Sub1_Sub3.anIntArray56[arg2];
				local639 = Class6_Sub1_Sub3.anIntArray58[arg3];
				local651 = Class6_Sub1_Sub3.anIntArray56[arg3];
				local655 = Class6_Sub1_Sub3.anIntArray58[arg4];
				local673 = Class6_Sub1_Sub3.anIntArray56[arg4];
				local1010 = local630 * local655 + 8192 >> 14;
				local1018 = local630 * local673 + 8192 >> 14;
				local978[3] = local401 * local673 + 8192 >> 14;
				local978[8] = local639 * local401 + 8192 >> 14;
				local978[6] = -local651 * local655 + local1018 * local639 + 8192 >> 14;
				local978[7] = local639 * local1010 + local651 * local673 + 8192 >> 14;
				local978[5] = -local630;
				local978[4] = local655 * local401 + 8192 >> 14;
				local978[2] = local401 * local651 + 8192 >> 14;
				local978[1] = local673 * -local639 + local1010 * local651 + 8192 >> 14;
				local978[0] = local651 * local1018 + local655 * local639 + 8192 >> 14;
				@Pc(1147) int local1147 = -Static616.anInt10068 * local978[1] + -Static83.anInt1652 * local978[0] + local978[2] * -Static28.anInt639 + 8192 >> 14;
				local1172 = -Static28.anInt639 * local978[5] + -Static83.anInt1652 * local978[3] + local978[4] * -Static616.anInt10068 + 8192 >> 14;
				local1197 = -Static616.anInt10068 * local978[7] + -Static83.anInt1652 * local978[6] + local978[8] * -Static28.anInt639 + 8192 >> 14;
				local1201 = Static83.anInt1652 + local1147;
				@Pc(1205) int local1205 = local1172 + Static616.anInt10068;
				local1209 = local1197 + Static28.anInt639;
				@Pc(1212) int[] local1212 = new int[9];
				for (local1214 = 0; local1214 < 3; local1214++) {
					for (local1218 = 0; local1218 < 3; local1218++) {
						local1222 = 0;
						for (local1224 = 0; local1224 < 3; local1224++) {
							local1222 += arg7[local1224 + local1218 * 3] * local978[local1224 + local1214 * 3];
						}
						local1212[local1218 + local1214 * 3] = local1222 + 8192 >> 14;
					}
				}
				local1218 = local978[0] * local245 + local978[1] * local50 + local56 * local978[2] + 8192 >> 14;
				local1222 = local978[5] * local56 + local245 * local978[3] + local50 * local978[4] + 8192 >> 14;
				local1218 += local1201;
				local1222 += local1205;
				local1224 = local978[8] * local56 + local50 * local978[7] + local245 * local978[6] + 8192 >> 14;
				local1224 += local1209;
				local1352 = new int[9];
				for (local1354 = 0; local1354 < 3; local1354++) {
					for (local1358 = 0; local1358 < 3; local1358++) {
						local1362 = 0;
						for (local1364 = 0; local1364 < 3; local1364++) {
							local1362 += arg7[local1354 * 3 + local1364] * local1212[local1364 * 3 + local1358];
						}
						local1352[local1358 + local1354 * 3] = local1362 + 8192 >> 14;
					}
				}
				local1358 = arg7[2] * local1224 + arg7[1] * local1222 + arg7[0] * local1218 + 8192 >> 14;
				local1362 = arg7[4] * local1222 + arg7[3] * local1218 + local1224 * arg7[5] + 8192 >> 14;
				local1364 = local1218 * arg7[6] + local1222 * arg7[7] + local1224 * arg7[8] + 8192 >> 14;
				local1358 += local26;
				local1362 += local32;
				local1364 += local38;
				for (local1494 = 0; local1494 < local8; local1494++) {
					@Pc(1500) int local1500 = arg1[local1494];
					if (local1500 < this.anIntArrayArray46.length) {
						@Pc(1514) int[] local1514 = this.anIntArrayArray46[local1500];
						for (@Pc(1516) int local1516 = 0; local1516 < local1514.length; local1516++) {
							@Pc(1522) int local1522 = local1514[local1516];
							if (this.aShortArray114 == null || (this.aShortArray114[local1522] & arg6) != 0) {
								@Pc(1564) int local1564 = this.anIntArray524[local1522] * local1352[0] + this.anIntArray523[local1522] * local1352[1] + local1352[2] * this.anIntArray525[local1522] + 8192 >> 14;
								@Pc(1595) int local1595 = this.anIntArray525[local1522] * local1352[5] + this.anIntArray523[local1522] * local1352[4] + this.anIntArray524[local1522] * local1352[3] + 8192 >> 14;
								@Pc(1599) int local1599 = local1564 + local1358;
								@Pc(1631) int local1631 = this.anIntArray525[local1522] * local1352[8] + local1352[6] * this.anIntArray524[local1522] + this.anIntArray523[local1522] * local1352[7] + 8192 >> 14;
								@Pc(1635) int local1635 = local1595 + local1362;
								@Pc(1639) int local1639 = local1631 + local1364;
								this.anIntArray524[local1522] = local1599;
								this.anIntArray523[local1522] = local1635;
								this.anIntArray525[local1522] = local1639;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2560) Class85 local2560;
			@Pc(2565) Class126 local2565;
			if (arg0 == 5) {
				if (this.anIntArrayArray45 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray45.length > local32) {
							local243 = this.anIntArrayArray45[local32];
							for (local245 = 0; local245 < local243.length; local245++) {
								local50 = local243[local245];
								if (this.aShortArray107 == null || (arg6 & this.aShortArray107[local50]) != 0) {
									local56 = arg2 * 8 + (this.aByteArray86[local50] & 0xFF);
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray86[local50] = (byte) local56;
									if (this.aClass214_13 != null) {
										this.aClass214_13.anInterface26_2 = null;
									}
								}
							}
						}
					}
					if (this.aClass85Array1 != null) {
						for (local32 = 0; local32 < this.anInt7984; local32++) {
							local2560 = this.aClass85Array1[local32];
							local2565 = this.aClass126Array1[local32];
							local2565.anInt3248 = local2565.anInt3248 & 0xFFFFFF | 255 - (this.aByteArray86[local2560.anInt2290] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2816) Class126 local2816;
				if (arg0 == 8) {
					if (this.anIntArrayArray47 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (local32 < this.anIntArrayArray47.length) {
								local243 = this.anIntArrayArray47[local32];
								for (local245 = 0; local245 < local243.length; local245++) {
									local2816 = this.aClass126Array1[local243[local245]];
									local2816.anInt3250 += arg3;
									local2816.anInt3253 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray47 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (this.anIntArrayArray47.length > local32) {
								local243 = this.anIntArrayArray47[local32];
								for (local245 = 0; local245 < local243.length; local245++) {
									local2816 = this.aClass126Array1[local243[local245]];
									local2816.anInt3245 = arg2 * local2816.anInt3245 >> 7;
									local2816.anInt3243 = local2816.anInt3243 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray47 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray47.length > local32) {
							local243 = this.anIntArrayArray47[local32];
							for (local245 = 0; local245 < local243.length; local245++) {
								local2816 = this.aClass126Array1[local243[local245]];
								local2816.anInt3246 = local2816.anInt3246 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray45 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray45.length > local32) {
						local243 = this.anIntArrayArray45[local32];
						for (local245 = 0; local245 < local243.length; local245++) {
							local50 = local243[local245];
							if (this.aShortArray107 == null || (arg6 & this.aShortArray107[local50]) != 0) {
								local56 = this.aShortArray111[local50] & 0xFFFF;
								local383 = local56 >> 10 & 0x3F;
								local401 = local56 >> 7 & 0x7;
								@Pc(2663) int local2663 = local383 + arg2 & 0x3F;
								local401 += arg3 / 4;
								local630 = local56 & 0x7F;
								if (local401 < 0) {
									local401 = 0;
								} else if (local401 > 7) {
									local401 = 7;
								}
								local630 += arg4;
								if (local630 < 0) {
									local630 = 0;
								} else if (local630 > 127) {
									local630 = 127;
								}
								this.aShortArray111[local50] = (short) (local630 | local2663 << 10 | local401 << 7);
								if (this.aClass214_13 != null) {
									this.aClass214_13.anInterface26_2 = null;
								}
							}
						}
					}
				}
				if (this.aClass85Array1 != null) {
					for (local32 = 0; local32 < this.anInt7984; local32++) {
						local2560 = this.aClass85Array1[local32];
						local2565 = this.aClass126Array1[local32];
						local2565.anInt3248 = Static70.anIntArray71[this.aShortArray111[local2560.anInt2290] & 0xFFFF] & 0xFFFFFF | local2565.anInt3248 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray46.length > local32) {
					local243 = this.anIntArrayArray46[local32];
					for (local245 = 0; local245 < local243.length; local245++) {
						local50 = local243[local245];
						if (this.aShortArray114 == null || (this.aShortArray114[local50] & arg6) != 0) {
							this.anIntArray524[local50] -= Static83.anInt1652;
							this.anIntArray523[local50] -= Static616.anInt10068;
							this.anIntArray525[local50] -= Static28.anInt639;
							this.anIntArray524[local50] = arg2 * this.anIntArray524[local50] >> 7;
							this.anIntArray523[local50] = arg3 * this.anIntArray523[local50] >> 7;
							this.anIntArray525[local50] = arg4 * this.anIntArray525[local50] >> 7;
							this.anIntArray524[local50] += Static83.anInt1652;
							this.anIntArray523[local50] += Static616.anInt10068;
							this.anIntArray525[local50] += Static28.anInt639;
						}
					}
				}
			}
		} else {
			local26 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local245 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static205.aBoolean209) {
				local383 = arg7[6] * Static28.anInt639 + arg7[3] * Static616.anInt10068 + arg7[0] * Static83.anInt1652 + 8192 >> 14;
				local401 = Static83.anInt1652 * arg7[1] + arg7[4] * Static616.anInt10068 + Static28.anInt639 * arg7[7] + 8192 >> 14;
				local401 += local50;
				local383 += local245;
				local630 = arg7[8] * Static28.anInt639 + Static616.anInt10068 * arg7[5] + arg7[2] * Static83.anInt1652 + 8192 >> 14;
				Static83.anInt1652 = local383;
				local630 += local56;
				Static616.anInt10068 = local401;
				Static28.anInt639 = local630;
				Static205.aBoolean209 = false;
			}
			local383 = arg2 << 15 >> 7;
			local401 = arg3 << 15 >> 7;
			local630 = arg4 << 15 >> 7;
			local639 = -Static83.anInt1652 * local383 + 8192 >> 14;
			local651 = local401 * -Static616.anInt10068 + 8192 >> 14;
			local655 = -Static28.anInt639 * local630 + 8192 >> 14;
			local673 = local639 + Static83.anInt1652;
			local1010 = Static616.anInt10068 + local651;
			local1018 = Static28.anInt639 + local655;
			@Pc(1858) int[] local1858 = new int[] { local383 * arg7[0] + 8192 >> 14, local383 * arg7[3] + 8192 >> 14, local383 * arg7[6] + 8192 >> 14, arg7[1] * local401 + 8192 >> 14, local401 * arg7[4] + 8192 >> 14, local401 * arg7[7] + 8192 >> 14, arg7[2] * local630 + 8192 >> 14, local630 * arg7[5] + 8192 >> 14, local630 * arg7[8] + 8192 >> 14 };
			local1172 = local383 * local245 + 8192 >> 14;
			local1197 = local401 * local50 + 8192 >> 14;
			local1201 = local630 * local56 + 8192 >> 14;
			@Pc(1994) int local1994 = local1197 + local1010;
			@Pc(1998) int local1998 = local1172 + local673;
			@Pc(2002) int local2002 = local1201 + local1018;
			@Pc(2005) int[] local2005 = new int[9];
			@Pc(2011) int local2011;
			for (local1209 = 0; local1209 < 3; local1209++) {
				for (local2011 = 0; local2011 < 3; local2011++) {
					local1214 = 0;
					for (local1218 = 0; local1218 < 3; local1218++) {
						local1214 += arg7[local1218 + local1209 * 3] * local1858[local1218 * 3 + local2011];
					}
					local2005[local1209 * 3 + local2011] = local1214 + 8192 >> 14;
				}
			}
			local2011 = local2002 * arg7[2] + arg7[1] * local1994 + arg7[0] * local1998 + 8192 >> 14;
			local1214 = local1998 * arg7[3] + local1994 * arg7[4] + local2002 * arg7[5] + 8192 >> 14;
			local2011 += local26;
			local1214 += local32;
			local1218 = local2002 * arg7[8] + local1994 * arg7[7] + local1998 * arg7[6] + 8192 >> 14;
			local1218 += local38;
			for (local1222 = 0; local1222 < local8; local1222++) {
				local1224 = arg1[local1222];
				if (local1224 < this.anIntArrayArray46.length) {
					local1352 = this.anIntArrayArray46[local1224];
					for (local1354 = 0; local1354 < local1352.length; local1354++) {
						local1358 = local1352[local1354];
						if (this.aShortArray114 == null || (arg6 & this.aShortArray114[local1358]) != 0) {
							local1362 = this.anIntArray523[local1358] * local2005[1] + local2005[0] * this.anIntArray524[local1358] + this.anIntArray525[local1358] * local2005[2] + 8192 >> 14;
							local1364 = local2005[5] * this.anIntArray525[local1358] + this.anIntArray523[local1358] * local2005[4] + local2005[3] * this.anIntArray524[local1358] + 8192 >> 14;
							@Pc(2251) int local2251 = local1364 + local1214;
							@Pc(2255) int local2255 = local1362 + local2011;
							local1494 = local2005[8] * this.anIntArray525[local1358] + local2005[6] * this.anIntArray524[local1358] + this.anIntArray523[local1358] * local2005[7] + 8192 >> 14;
							@Pc(2290) int local2290 = local1494 + local1218;
							this.anIntArray524[local1358] = local2255;
							this.anIntArray523[local1358] = local2251;
							this.anIntArray525[local1358] = local2290;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8650(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg4 << 4;
			local22 = arg3 << 4;
			Static28.anInt639 = 0;
			Static83.anInt1652 = 0;
			Static616.anInt10068 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray46.length) {
					local52 = this.anIntArrayArray46[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static83.anInt1652 += this.anIntArray524[local60];
						Static616.anInt10068 += this.anIntArray523[local60];
						local30++;
						Static28.anInt639 += this.anIntArray525[local60];
					}
				}
			}
			if (local30 <= 0) {
				Static83.anInt1652 = local14;
				Static616.anInt10068 = local22;
				Static28.anInt639 = local18;
			} else {
				Static616.anInt10068 = local22 + Static616.anInt10068 / local30;
				Static83.anInt1652 = local14 + Static83.anInt1652 / local30;
				Static28.anInt639 = local18 + Static28.anInt639 / local30;
			}
			return;
		}
		@Pc(164) int[] local164;
		@Pc(166) int local166;
		if (arg0 == 1) {
			local14 = arg2 << 4;
			local18 = arg4 << 4;
			local22 = arg3 << 4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray46.length > local32) {
					local164 = this.anIntArrayArray46[local32];
					for (local166 = 0; local166 < local164.length; local166++) {
						local54 = local164[local166];
						this.anIntArray524[local54] += local14;
						this.anIntArray523[local54] += local22;
						this.anIntArray525[local54] += local18;
					}
				}
			}
			return;
		}
		@Pc(284) int local284;
		@Pc(302) int local302;
		@Pc(759) int local759;
		if (arg0 == 2) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray46.length > local32) {
					local164 = this.anIntArrayArray46[local32];
					if ((arg5 & 0x1) == 0) {
						for (local166 = 0; local166 < local164.length; local166++) {
							local54 = local164[local166];
							this.anIntArray524[local54] -= Static83.anInt1652;
							this.anIntArray523[local54] -= Static616.anInt10068;
							this.anIntArray525[local54] -= Static28.anInt639;
							if (arg4 != 0) {
								local60 = Class6_Sub1_Sub3.anIntArray56[arg4];
								local284 = Class6_Sub1_Sub3.anIntArray58[arg4];
								local302 = local284 * this.anIntArray524[local54] + local60 * this.anIntArray523[local54] + 16383 >> 14;
								this.anIntArray523[local54] = local284 * this.anIntArray523[local54] + 16383 - this.anIntArray524[local54] * local60 >> 14;
								this.anIntArray524[local54] = local302;
							}
							if (arg2 != 0) {
								local60 = Class6_Sub1_Sub3.anIntArray56[arg2];
								local284 = Class6_Sub1_Sub3.anIntArray58[arg2];
								local302 = this.anIntArray523[local54] * local284 + 16383 - this.anIntArray525[local54] * local60 >> 14;
								this.anIntArray525[local54] = local284 * this.anIntArray525[local54] + this.anIntArray523[local54] * local60 + 16383 >> 14;
								this.anIntArray523[local54] = local302;
							}
							if (arg3 != 0) {
								local60 = Class6_Sub1_Sub3.anIntArray56[arg3];
								local284 = Class6_Sub1_Sub3.anIntArray58[arg3];
								local302 = local284 * this.anIntArray524[local54] + local60 * this.anIntArray525[local54] + 16383 >> 14;
								this.anIntArray525[local54] = this.anIntArray525[local54] * local284 + 16383 - this.anIntArray524[local54] * local60 >> 14;
								this.anIntArray524[local54] = local302;
							}
							this.anIntArray524[local54] += Static83.anInt1652;
							this.anIntArray523[local54] += Static616.anInt10068;
							this.anIntArray525[local54] += Static28.anInt639;
						}
					} else {
						for (local166 = 0; local166 < local164.length; local166++) {
							local54 = local164[local166];
							this.anIntArray524[local54] -= Static83.anInt1652;
							this.anIntArray523[local54] -= Static616.anInt10068;
							this.anIntArray525[local54] -= Static28.anInt639;
							if (arg2 != 0) {
								local60 = Class6_Sub1_Sub3.anIntArray56[arg2];
								local284 = Class6_Sub1_Sub3.anIntArray58[arg2];
								local302 = this.anIntArray523[local54] * local284 + 16383 - this.anIntArray525[local54] * local60 >> 14;
								this.anIntArray525[local54] = local60 * this.anIntArray523[local54] + this.anIntArray525[local54] * local284 + 16383 >> 14;
								this.anIntArray523[local54] = local302;
							}
							if (arg4 != 0) {
								local60 = Class6_Sub1_Sub3.anIntArray56[arg4];
								local284 = Class6_Sub1_Sub3.anIntArray58[arg4];
								local302 = local284 * this.anIntArray524[local54] + this.anIntArray523[local54] * local60 + 16383 >> 14;
								this.anIntArray523[local54] = local284 * this.anIntArray523[local54] + 16383 - this.anIntArray524[local54] * local60 >> 14;
								this.anIntArray524[local54] = local302;
							}
							if (arg3 != 0) {
								local60 = Class6_Sub1_Sub3.anIntArray56[arg3];
								local284 = Class6_Sub1_Sub3.anIntArray58[arg3];
								local302 = local60 * this.anIntArray525[local54] + this.anIntArray524[local54] * local284 + 16383 >> 14;
								this.anIntArray525[local54] = local284 * this.anIntArray525[local54] + 16383 - this.anIntArray524[local54] * local60 >> 14;
								this.anIntArray524[local54] = local302;
							}
							this.anIntArray524[local54] += Static83.anInt1652;
							this.anIntArray523[local54] += Static616.anInt10068;
							this.anIntArray525[local54] += Static28.anInt639;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray46.length > local38) {
						local52 = this.anIntArrayArray46[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local284 = this.anIntArray526[local60];
							local302 = this.anIntArray526[local60 + 1];
							for (local759 = local284; local759 < local302; local759++) {
								@Pc(768) int local768 = this.aShortArray108[local759] - 1;
								if (local768 == -1) {
									break;
								}
								@Pc(777) int local777;
								@Pc(781) int local781;
								@Pc(800) int local800;
								if (arg4 != 0) {
									local777 = Class6_Sub1_Sub3.anIntArray56[arg4];
									local781 = Class6_Sub1_Sub3.anIntArray58[arg4];
									local800 = this.aShortArray109[local768] * local777 + this.aShortArray110[local768] * local781 + 16383 >> 14;
									this.aShortArray109[local768] = (short) (this.aShortArray109[local768] * local781 + 16383 - this.aShortArray110[local768] * local777 >> 14);
									this.aShortArray110[local768] = (short) local800;
								}
								if (arg2 != 0) {
									local777 = Class6_Sub1_Sub3.anIntArray56[arg2];
									local781 = Class6_Sub1_Sub3.anIntArray58[arg2];
									local800 = this.aShortArray109[local768] * local781 + 16383 - this.aShortArray113[local768] * local777 >> 14;
									this.aShortArray113[local768] = (short) (this.aShortArray113[local768] * local781 + local777 * this.aShortArray109[local768] + 16383 >> 14);
									this.aShortArray109[local768] = (short) local800;
								}
								if (arg3 != 0) {
									local777 = Class6_Sub1_Sub3.anIntArray56[arg3];
									local781 = Class6_Sub1_Sub3.anIntArray58[arg3];
									local800 = this.aShortArray110[local768] * local781 + local777 * this.aShortArray113[local768] + 16383 >> 14;
									this.aShortArray113[local768] = (short) (this.aShortArray113[local768] * local781 + 16383 - this.aShortArray110[local768] * local777 >> 14);
									this.aShortArray110[local768] = (short) local800;
								}
							}
						}
					}
				}
				if (this.aClass214_11 == null && this.aClass214_13 != null) {
					this.aClass214_13.anInterface26_2 = null;
				}
				if (this.aClass214_11 != null) {
					this.aClass214_11.anInterface26_2 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray46.length) {
					local164 = this.anIntArrayArray46[local32];
					for (local166 = 0; local166 < local164.length; local166++) {
						local54 = local164[local166];
						this.anIntArray524[local54] -= Static83.anInt1652;
						this.anIntArray523[local54] -= Static616.anInt10068;
						this.anIntArray525[local54] -= Static28.anInt639;
						this.anIntArray524[local54] = this.anIntArray524[local54] * arg2 >> 7;
						this.anIntArray523[local54] = this.anIntArray523[local54] * arg3 >> 7;
						this.anIntArray525[local54] = arg4 * this.anIntArray525[local54] >> 7;
						this.anIntArray524[local54] += Static83.anInt1652;
						this.anIntArray523[local54] += Static616.anInt10068;
						this.anIntArray525[local54] += Static28.anInt639;
					}
				}
			}
		} else {
			@Pc(1212) Class85 local1212;
			@Pc(1217) Class126 local1217;
			if (arg0 == 5) {
				if (this.anIntArrayArray45 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray45.length) {
							local164 = this.anIntArrayArray45[local32];
							for (local166 = 0; local166 < local164.length; local166++) {
								local54 = local164[local166];
								local60 = (this.aByteArray86[local54] & 0xFF) + arg2 * 8;
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray86[local54] = (byte) local60;
							}
							if (local164.length > 0 && this.aClass214_13 != null) {
								this.aClass214_13.anInterface26_2 = null;
							}
						}
					}
					if (this.aClass85Array1 != null) {
						for (local32 = 0; local32 < this.anInt7984; local32++) {
							local1212 = this.aClass85Array1[local32];
							local1217 = this.aClass126Array1[local32];
							local1217.anInt3248 = local1217.anInt3248 & 0xFFFFFF | 255 - (this.aByteArray86[local1212.anInt2290] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1463) Class126 local1463;
				if (arg0 == 8) {
					if (this.anIntArrayArray47 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray47.length) {
								local164 = this.anIntArrayArray47[local32];
								for (local166 = 0; local166 < local164.length; local166++) {
									local1463 = this.aClass126Array1[local164[local166]];
									local1463.anInt3250 += arg3;
									local1463.anInt3253 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray47 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray47.length) {
								local164 = this.anIntArrayArray47[local32];
								for (local166 = 0; local166 < local164.length; local166++) {
									local1463 = this.aClass126Array1[local164[local166]];
									local1463.anInt3245 = local1463.anInt3245 * arg2 >> 7;
									local1463.anInt3243 = local1463.anInt3243 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray47 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray47.length > local32) {
							local164 = this.anIntArrayArray47[local32];
							for (local166 = 0; local166 < local164.length; local166++) {
								local1463 = this.aClass126Array1[local164[local166]];
								local1463.anInt3246 = arg2 + local1463.anInt3246 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray45 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray45.length > local32) {
						local164 = this.anIntArrayArray45[local32];
						for (local166 = 0; local166 < local164.length; local166++) {
							local54 = local164[local166];
							local60 = this.aShortArray111[local54] & 0xFFFF;
							local284 = local60 >> 10 & 0x3F;
							local302 = local60 >> 7 & 0x7;
							local302 += arg3 / 4;
							@Pc(1313) int local1313 = arg2 + local284 & 0x3F;
							local759 = local60 & 0x7F;
							local759 += arg4;
							if (local302 < 0) {
								local302 = 0;
							} else if (local302 > 7) {
								local302 = 7;
							}
							if (local759 < 0) {
								local759 = 0;
							} else if (local759 > 127) {
								local759 = 127;
							}
							this.aShortArray111[local54] = (short) (local759 | local302 << 7 | local1313 << 10);
						}
						if (local164.length > 0 && this.aClass214_13 != null) {
							this.aClass214_13.anInterface26_2 = null;
						}
					}
				}
				if (this.aClass85Array1 != null) {
					for (local32 = 0; local32 < this.anInt7984; local32++) {
						local1212 = this.aClass85Array1[local32];
						local1217 = this.aClass126Array1[local32];
						local1217.anInt3248 = local1217.anInt3248 & 0xFF000000 | Static70.anIntArray71[this.aShortArray111[local1212.anInt2290] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean550) {
			this.method6843();
		}
		return this.aShort103;
	}

	@OriginalMember(owner = "client!pr", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort107 = (short) arg0;
		if (this.aClass214_13 != null) {
			this.aClass214_13.anInterface26_2 = null;
		}
		if (this.aClass214_11 != null) {
			this.aClass214_11.anInterface26_2 = null;
		}
	}

	@OriginalMember(owner = "client!pr", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static616.anInt10068 = 0;
			Static83.anInt1652 = 0;
			Static28.anInt639 = 0;
			for (local17 = 0; local17 < this.anInt7955; local17++) {
				Static83.anInt1652 += this.anIntArray524[local17];
				Static616.anInt10068 += this.anIntArray523[local17];
				local9++;
				Static28.anInt639 += this.anIntArray525[local17];
			}
			if (local9 > 0) {
				Static28.anInt639 = arg3 + Static28.anInt639 / local9;
				Static616.anInt10068 = arg2 + Static616.anInt10068 / local9;
				Static83.anInt1652 = Static83.anInt1652 / local9 + arg1;
			} else {
				Static28.anInt639 = arg3;
				Static83.anInt1652 = arg1;
				Static616.anInt10068 = arg2;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.anInt7955; local9++) {
				this.anIntArray524[local9] += arg1;
				this.anIntArray523[local9] += arg2;
				this.anIntArray525[local9] += arg3;
			}
		} else {
			@Pc(161) int local161;
			@Pc(179) int local179;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.anInt7955; local9++) {
					this.anIntArray524[local9] -= Static83.anInt1652;
					this.anIntArray523[local9] -= Static616.anInt10068;
					this.anIntArray525[local9] -= Static28.anInt639;
					if (arg3 != 0) {
						local17 = Class6_Sub1_Sub3.anIntArray56[arg3];
						local161 = Class6_Sub1_Sub3.anIntArray58[arg3];
						local179 = local161 * this.anIntArray524[local9] + local17 * this.anIntArray523[local9] + 16383 >> 14;
						this.anIntArray523[local9] = local161 * this.anIntArray523[local9] + 16383 - local17 * this.anIntArray524[local9] >> 14;
						this.anIntArray524[local9] = local179;
					}
					if (arg1 != 0) {
						local17 = Class6_Sub1_Sub3.anIntArray56[arg1];
						local161 = Class6_Sub1_Sub3.anIntArray58[arg1];
						local179 = local161 * this.anIntArray523[local9] + 16383 - local17 * this.anIntArray525[local9] >> 14;
						this.anIntArray525[local9] = local161 * this.anIntArray525[local9] + local17 * this.anIntArray523[local9] + 16383 >> 14;
						this.anIntArray523[local9] = local179;
					}
					if (arg2 != 0) {
						local17 = Class6_Sub1_Sub3.anIntArray56[arg2];
						local161 = Class6_Sub1_Sub3.anIntArray58[arg2];
						local179 = this.anIntArray524[local9] * local161 + this.anIntArray525[local9] * local17 + 16383 >> 14;
						this.anIntArray525[local9] = local161 * this.anIntArray525[local9] + 16383 - this.anIntArray524[local9] * local17 >> 14;
						this.anIntArray524[local9] = local179;
					}
					this.anIntArray524[local9] += Static83.anInt1652;
					this.anIntArray523[local9] += Static616.anInt10068;
					this.anIntArray525[local9] += Static28.anInt639;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.anInt7955; local9++) {
					this.anIntArray524[local9] -= Static83.anInt1652;
					this.anIntArray523[local9] -= Static616.anInt10068;
					this.anIntArray525[local9] -= Static28.anInt639;
					this.anIntArray524[local9] = arg1 * this.anIntArray524[local9] / 128;
					this.anIntArray523[local9] = this.anIntArray523[local9] * arg2 / 128;
					this.anIntArray525[local9] = arg3 * this.anIntArray525[local9] / 128;
					this.anIntArray524[local9] += Static83.anInt1652;
					this.anIntArray523[local9] += Static616.anInt10068;
					this.anIntArray525[local9] += Static28.anInt639;
				}
			} else {
				@Pc(514) Class85 local514;
				@Pc(519) Class126 local519;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt7946; local9++) {
						local17 = (this.aByteArray86[local9] & 0xFF) + arg1 * 8;
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray86[local9] = (byte) local17;
					}
					if (this.aClass214_13 != null) {
						this.aClass214_13.anInterface26_2 = null;
					}
					if (this.aClass85Array1 != null) {
						for (local17 = 0; local17 < this.anInt7984; local17++) {
							local514 = this.aClass85Array1[local17];
							local519 = this.aClass126Array1[local17];
							local519.anInt3248 = 255 - (this.aByteArray86[local514.anInt2290] & 0xFF) << 24 | local519.anInt3248 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt7946; local9++) {
						local17 = this.aShortArray111[local9] & 0xFFFF;
						local161 = local17 >> 10 & 0x3F;
						local179 = local17 >> 7 & 0x7;
						@Pc(580) int local580 = arg1 + local161 & 0x3F;
						@Pc(584) int local584 = local17 & 0x7F;
						local179 += arg2 / 4;
						if (local179 < 0) {
							local179 = 0;
						} else if (local179 > 7) {
							local179 = 7;
						}
						local584 += arg3;
						if (local584 < 0) {
							local584 = 0;
						} else if (local584 > 127) {
							local584 = 127;
						}
						this.aShortArray111[local9] = (short) (local580 << 10 | local179 << 7 | local584);
					}
					if (this.aClass214_13 != null) {
						this.aClass214_13.anInterface26_2 = null;
					}
					if (this.aClass85Array1 != null) {
						for (local17 = 0; local17 < this.anInt7984; local17++) {
							local514 = this.aClass85Array1[local17];
							local519 = this.aClass126Array1[local17];
							local519.anInt3248 = Static70.anIntArray71[this.aShortArray111[local514.anInt2290] & 0xFFFF] & 0xFFFFFF | local519.anInt3248 & 0xFF000000;
						}
					}
				} else {
					@Pc(709) Class126 local709;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt7984; local9++) {
							local709 = this.aClass126Array1[local9];
							local709.anInt3253 += arg1;
							local709.anInt3250 += arg2;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt7984; local9++) {
							local709 = this.aClass126Array1[local9];
							local709.anInt3243 = local709.anInt3243 * arg2 >> 7;
							local709.anInt3245 = local709.anInt3245 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt7984; local9++) {
							local709 = this.aClass126Array1[local9];
							local709.anInt3246 = arg1 + local709.anInt3246 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt7999 = arg0;
		if (this.aClass261_1 != null && (this.anInt7999 & 0x10000) == 0) {
			this.aShortArray110 = this.aClass261_1.aShortArray96;
			this.aShortArray113 = this.aClass261_1.aShortArray97;
			this.aShortArray109 = this.aClass261_1.aShortArray98;
			this.aByteArray87 = this.aClass261_1.aByteArray82;
			this.aClass261_1 = null;
		}
		this.aBoolean549 = true;
		this.method6854();
	}

	@OriginalMember(owner = "client!pr", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean550) {
			this.method6843();
		}
		return this.aShort104;
	}

	@OriginalMember(owner = "client!pr", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray46 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt7989; local12++) {
			this.anIntArray524[local12] <<= 0x4;
			this.anIntArray523[local12] <<= 0x4;
			this.anIntArray525[local12] <<= 0x4;
		}
		Static83.anInt1652 = 0;
		Static616.anInt10068 = 0;
		Static28.anInt639 = 0;
		return true;
	}

	@OriginalMember(owner = "client!pr", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12 arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean550) {
			this.method6843();
		}
		@Pc(16) int local16 = arg4 + this.aShort99;
		@Pc(21) int local21 = arg4 + this.aShort101;
		@Pc(26) int local26 = this.aShort103 + arg6;
		@Pc(31) int local31 = this.aShort100 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt9306 >> arg2.anInt9312 >= arg2.anInt9314 || local26 < 0 || local31 + arg2.anInt9306 >> arg2.anInt9312 >= arg2.anInt9313)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9314 <= local21 + arg3.anInt9306 >> arg3.anInt9312 || local26 < 0 || arg3.anInt9313 <= local31 + arg3.anInt9306 >> arg3.anInt9312) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9312;
			local21 = local21 + arg2.anInt9306 - 1 >> arg2.anInt9312;
			local26 >>= arg2.anInt9312;
			local31 = arg2.anInt9306 + local31 - 1 >> arg2.anInt9312;
			if (arg2.method7846(local16, local26) == arg5 && arg2.method7846(local21, local26) == arg5 && arg5 == arg2.method7846(local16, local31) && arg2.method7846(local21, local31) == arg5) {
				return;
			}
		}
		@Pc(196) int local196;
		if (arg0 == 1) {
			for (local196 = 0; local196 < this.anInt7955; local196++) {
				this.anIntArray523[local196] = this.anIntArray523[local196] + arg2.method7854(this.anIntArray525[local196] - -arg6, this.anIntArray524[local196] - -arg4) - arg5;
			}
		} else {
			@Pc(249) int local249;
			@Pc(260) int local260;
			if (arg0 == 2) {
				@Pc(244) short local244 = this.aShort98;
				if (local244 == 0) {
					return;
				}
				for (local249 = 0; local249 < this.anInt7955; local249++) {
					local260 = (this.anIntArray523[local249] << 16) / local244;
					if (arg1 > local260) {
						this.anIntArray523[local249] += (arg2.method7854(arg6 + this.anIntArray525[local249], this.anIntArray524[local249] - -arg4) - arg5) * (arg1 - local260) / arg1;
					}
				}
			} else {
				@Pc(347) int local347;
				if (arg0 == 3) {
					local196 = (arg1 & 0xFF) * 4;
					local249 = (arg1 >> 8 & 0xFF) * 4;
					local260 = (arg1 >> 16 & 0xFF) << 6;
					local347 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local196 >> 1) < 0 || (local196 >> 1) + arg4 + arg2.anInt9306 >= arg2.anInt9314 << arg2.anInt9312 || arg6 - (local249 >> 1) < 0 || (local249 >> 1) + (arg6 + arg2.anInt9306) >= arg2.anInt9313 << arg2.anInt9312) {
						return;
					}
					this.method8661(arg4, arg5, arg2, local347, local260, arg6, local196, local249);
				} else if (arg0 == 4) {
					local196 = this.aShort106 - this.aShort98;
					for (local249 = 0; local249 < this.anInt7955; local249++) {
						this.anIntArray523[local249] = local196 + this.anIntArray523[local249] + arg3.method7854(this.anIntArray525[local249] - -arg6, this.anIntArray524[local249] + arg4) - arg5;
					}
				} else if (arg0 == 5) {
					local196 = this.aShort106 - this.aShort98;
					for (local249 = 0; local249 < this.anInt7955; local249++) {
						local260 = arg4 + this.anIntArray524[local249];
						local347 = arg6 + this.anIntArray525[local249];
						@Pc(496) int local496 = arg2.method7854(local347, local260);
						@Pc(502) int local502 = arg3.method7854(local347, local260);
						@Pc(510) int local510 = local496 - arg1 - local502;
						this.anIntArray523[local249] = (local510 * ((this.anIntArray523[local249] << 8) / local196) >> 8) - (arg5 - local496);
					}
				}
			}
		}
		this.aBoolean550 = false;
		if (this.aClass214_12 != null) {
			this.aClass214_12.anInterface26_2 = null;
		}
	}

	@OriginalMember(owner = "client!pr", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7946; local3++) {
			if (this.aShortArray111[local3] == arg0) {
				this.aShortArray111[local3] = arg1;
			}
		}
		if (this.aClass85Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt7984; local34++) {
				@Pc(41) Class85 local41 = this.aClass85Array1[local34];
				@Pc(46) Class126 local46 = this.aClass126Array1[local34];
				local46.anInt3248 = local46.anInt3248 & 0xFF000000 | Static70.anIntArray71[this.aShortArray111[local41.anInt2290] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass214_13 != null) {
			this.aClass214_13.anInterface26_2 = null;
		}
	}

	@OriginalMember(owner = "client!pr", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface6 local9 = this.aClass132_Sub3_36.anInterface6_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7946; local11++) {
			if (arg0 == this.aShortArray105[local11]) {
				this.aShortArray105[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class294 local48 = local9.method7088(arg0 & 0xFFFF);
			local37 = local48.aByte116;
			local35 = local48.aByte118;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(69) Class294 local69 = local9.method7088(arg1 & 0xFFFF);
			if (local69.aByte115 != 0 || local69.aByte117 != 0) {
				this.aBoolean548 = true;
			}
			local56 = local69.aByte118;
			local58 = local69.aByte116;
		}
		if (!(local58 != local37 | local35 != local56)) {
			return;
		}
		if (this.aClass85Array1 != null) {
			for (@Pc(113) int local113 = 0; local113 < this.anInt7984; local113++) {
				@Pc(120) Class85 local120 = this.aClass85Array1[local113];
				@Pc(125) Class126 local125 = this.aClass126Array1[local113];
				local125.anInt3248 = Static70.anIntArray71[this.aShortArray111[local120.anInt2290] & 0xFFFF] & 0xFFFFFF | local125.anInt3248 & 0xFF000000;
			}
		}
		if (this.aClass214_13 != null) {
			this.aClass214_13.anInterface26_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!pr", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		if (this.aClass214_13 != null) {
			this.aClass214_13.anInterface26_2 = null;
		}
		this.aShort102 = (short) arg0;
	}

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "()V")
	@Override
	protected void method8665() {
	}

	@OriginalMember(owner = "client!pr", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7955; local7++) {
			if (arg0 != 0) {
				this.anIntArray524[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray523[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray525[local7] += arg2;
			}
		}
		if (this.aClass214_12 != null) {
			this.aClass214_12.anInterface26_2 = null;
		}
		this.aBoolean550 = false;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZIILclient!oo;II)Z")
	private boolean method6844(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class207 arg4, @OriginalArg(5) int arg5) {
		@Pc(8) Class207_Sub1 local8 = (Class207_Sub1) arg4;
		@Pc(12) Class207_Sub1 local12 = this.aClass132_Sub3_36.aClass207_Sub1_3;
		@Pc(33) float local33 = local8.aFloat66 * local12.aFloat68 + local8.aFloat61 * local12.aFloat59 + local12.aFloat67 * local8.aFloat64 + local12.aFloat61;
		@Pc(54) float local54 = local12.aFloat69 * local8.aFloat64 + local12.aFloat60 * local8.aFloat61 + local8.aFloat66 * local12.aFloat63 + local12.aFloat64;
		Static377.aFloat71 = local8.aFloat62 * local12.aFloat68 + local8.aFloat68 * local12.aFloat59 + local12.aFloat67 * local8.aFloat63;
		Static311.aFloat35 = local8.aFloat65 * local12.aFloat62 + local8.aFloat67 * local12.aFloat58 + local8.aFloat69 * local12.aFloat65;
		Static673.aFloat205 = local12.aFloat69 * local8.aFloat60 + local12.aFloat60 * local8.aFloat59 + local12.aFloat63 * local8.aFloat58;
		Static196.aFloat19 = local12.aFloat62 * local8.aFloat62 + local8.aFloat68 * local12.aFloat58 + local12.aFloat65 * local8.aFloat63;
		@Pc(147) float local147 = local12.aFloat65 * local8.aFloat64 + local8.aFloat61 * local12.aFloat58 + local8.aFloat66 * local12.aFloat62 + local12.aFloat66;
		Static385.aFloat75 = local12.aFloat63 * local8.aFloat65 + local8.aFloat67 * local12.aFloat60 + local12.aFloat69 * local8.aFloat69;
		Static466.aFloat153 = local8.aFloat58 * local12.aFloat68 + local12.aFloat67 * local8.aFloat60 + local8.aFloat59 * local12.aFloat59;
		Static151.aFloat15 = local12.aFloat58 * local8.aFloat59 + local8.aFloat60 * local12.aFloat65 + local12.aFloat62 * local8.aFloat58;
		Static460.aFloat151 = local8.aFloat62 * local12.aFloat63 + local12.aFloat60 * local8.aFloat68 + local8.aFloat63 * local12.aFloat69;
		Static70.aFloat8 = local12.aFloat68 * local8.aFloat65 + local8.aFloat69 * local12.aFloat67 + local12.aFloat59 * local8.aFloat67;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass132_Sub3_36.anInt7908;
		@Pc(255) int local255 = this.aClass132_Sub3_36.anInt7901;
		if (!this.aBoolean550) {
			this.method6843();
		}
		@Pc(271) int local271 = this.aShort101 - this.aShort99 >> 1;
		@Pc(280) int local280 = this.aShort106 - this.aShort98 >> 1;
		@Pc(289) int local289 = this.aShort100 - this.aShort103 >> 1;
		@Pc(294) int local294 = local271 + this.aShort99;
		@Pc(300) int local300 = this.aShort98 + local280;
		@Pc(305) int local305 = local289 + this.aShort103;
		@Pc(312) int local312 = local294 - (local271 << arg0);
		@Pc(319) int local319 = local300 - (local280 << arg0);
		@Pc(326) int local326 = local305 - (local289 << arg0);
		@Pc(332) int local332 = (local271 << arg0) + local294;
		@Pc(338) int local338 = (local280 << arg0) + local300;
		@Pc(345) int local345 = local305 + (local289 << arg0);
		Static312.anIntArray541[0] = local312;
		Static160.anIntArray151[0] = local319;
		Static312.anIntArray541[1] = local332;
		Static341.anIntArray703[0] = local326;
		Static160.anIntArray151[1] = local319;
		Static312.anIntArray541[2] = local312;
		Static341.anIntArray703[1] = local326;
		Static160.anIntArray151[2] = local338;
		Static312.anIntArray541[3] = local332;
		Static341.anIntArray703[2] = local326;
		Static160.anIntArray151[3] = local338;
		Static312.anIntArray541[4] = local312;
		Static341.anIntArray703[3] = local326;
		Static160.anIntArray151[4] = local319;
		Static312.anIntArray541[5] = local332;
		Static341.anIntArray703[4] = local345;
		Static160.anIntArray151[5] = local319;
		Static341.anIntArray703[5] = local345;
		Static312.anIntArray541[6] = local312;
		Static160.anIntArray151[6] = local338;
		Static312.anIntArray541[7] = local332;
		Static341.anIntArray703[6] = local345;
		Static160.anIntArray151[7] = local338;
		Static341.anIntArray703[7] = local345;
		@Pc(479) float local479;
		@Pc(507) float local507;
		@Pc(493) float local493;
		@Pc(465) float local465;
		@Pc(460) float local460;
		@Pc(455) float local455;
		for (@Pc(448) int local448 = 0; local448 < 8; local448++) {
			local455 = (float) Static341.anIntArray703[local448];
			local460 = (float) Static160.anIntArray151[local448];
			local465 = (float) Static312.anIntArray541[local448];
			local479 = local465 * Static466.aFloat153 + Static70.aFloat8 * local460 + Static377.aFloat71 * local455 + local33;
			local493 = local147 + Static311.aFloat35 * local460 + Static151.aFloat15 * local465 + Static196.aFloat19 * local455;
			local507 = Static673.aFloat205 * local465 + local460 * Static385.aFloat75 + local455 * Static460.aFloat151 + local54;
			if (local493 >= (float) this.aClass132_Sub3_36.anInt7920) {
				if (arg2 > 0) {
					local493 = (float) arg2;
				}
				@Pc(531) float local531 = (float) local251 * local479 / local493 + (float) this.aClass132_Sub3_36.anInt7906;
				if (local241 > local531) {
					local241 = local531;
				}
				@Pc(549) float local549 = local507 * (float) local255 / local493 + (float) this.aClass132_Sub3_36.anInt7893;
				if (local243 < local531) {
					local243 = local531;
				}
				local239 = true;
				if (local247 < local549) {
					local247 = local549;
				}
				if (local245 > local549) {
					local245 = local549;
				}
			}
		}
		if (local239 && local241 < (float) arg3 && local243 > (float) arg3 && local245 < (float) arg5 && (float) arg5 < local247) {
			if (arg1) {
				return true;
			}
			if (this.aClass132_Sub3_36.anIntArray521.length < this.anInt7976) {
				this.aClass132_Sub3_36.anIntArray521 = new int[this.anInt7976];
				this.aClass132_Sub3_36.anIntArray522 = new int[this.anInt7976];
			}
			@Pc(624) int[] local624 = this.aClass132_Sub3_36.anIntArray521;
			@Pc(628) int[] local628 = this.aClass132_Sub3_36.anIntArray522;
			@Pc(704) int local704;
			for (@Pc(630) int local630 = 0; local630 < this.anInt7955; local630++) {
				local465 = (float) this.anIntArray524[local630];
				local460 = (float) this.anIntArray523[local630];
				local455 = (float) this.anIntArray525[local630];
				local493 = local455 * Static196.aFloat19 + Static151.aFloat15 * local465 + local460 * Static311.aFloat35 + local147;
				local479 = local455 * Static377.aFloat71 + Static466.aFloat153 * local465 + Static70.aFloat8 * local460 + local33;
				local507 = Static673.aFloat205 * local465 + Static385.aFloat75 * local460 + Static460.aFloat151 * local455 + local54;
				@Pc(711) int local711;
				@Pc(713) int local713;
				@Pc(722) int local722;
				if ((float) this.aClass132_Sub3_36.anInt7920 <= local493) {
					if (arg2 > 0) {
						local493 = (float) arg2;
					}
					local704 = (int) ((float) local251 * local479 / local493 + (float) this.aClass132_Sub3_36.anInt7906);
					local711 = (int) (local507 * (float) local255 / local493 + (float) this.aClass132_Sub3_36.anInt7893);
					local713 = this.anIntArray526[local630];
					local722 = this.anIntArray526[local630 + 1];
					for (@Pc(786) int local786 = local713; local786 < local722; local786++) {
						@Pc(795) int local795 = this.aShortArray108[local786] - 1;
						if (local795 == -1) {
							break;
						}
						local624[local795] = local704;
						local628[local795] = local711;
					}
				} else {
					local704 = this.anIntArray526[local630];
					local711 = this.anIntArray526[local630 + 1];
					for (local713 = local704; local713 < local711; local713++) {
						local722 = this.aShortArray108[local713] - 1;
						if (local722 == -1) {
							break;
						}
						local624[this.aShortArray108[local713] - 1] = -999999;
					}
				}
			}
			for (local704 = 0; local704 < this.anInt7946; local704++) {
				if (local624[this.aShortArray106[local704]] != -999999 && local624[this.aShortArray115[local704]] != -999999 && local624[this.aShortArray112[local704]] != -999999 && this.method6851(local628[this.aShortArray112[local704]], local628[this.aShortArray106[local704]], local624[this.aShortArray106[local704]], local624[this.aShortArray115[local704]], arg3, local624[this.aShortArray112[local704]], local628[this.aShortArray115[local704]], arg5)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "()[Lclient!mb;")
	@Override
	public Class218[] method8643() {
		return this.aClass218Array4;
	}

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub1_Sub3.anIntArray56[arg0];
		@Pc(13) int local13 = Class6_Sub1_Sub3.anIntArray58[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7955; local15++) {
			local33 = this.anIntArray525[local15] * local9 + this.anIntArray524[local15] * local13 >> 14;
			this.anIntArray525[local15] = this.anIntArray525[local15] * local13 - this.anIntArray524[local15] * local9 >> 14;
			this.anIntArray524[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt7976; local33++) {
			@Pc(86) int local86 = local13 * this.aShortArray110[local33] + local9 * this.aShortArray113[local33] >> 14;
			this.aShortArray113[local33] = (short) (local13 * this.aShortArray113[local33] - this.aShortArray110[local33] * local9 >> 14);
			this.aShortArray110[local33] = (short) local86;
		}
		if (this.aClass214_11 == null && this.aClass214_13 != null) {
			this.aClass214_13.anInterface26_2 = null;
		}
		if (this.aClass214_11 != null) {
			this.aClass214_11.anInterface26_2 = null;
		}
		if (this.aClass214_12 != null) {
			this.aClass214_12.anInterface26_2 = null;
		}
		this.aBoolean550 = false;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!oo;Lclient!ea;I)V")
	@Override
	public void method8662(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7976 == 0) {
			return;
		}
		@Pc(16) Class207_Sub1 local16 = this.aClass132_Sub3_36.aClass207_Sub1_3;
		@Pc(19) Class207_Sub1 local19 = (Class207_Sub1) arg0;
		if (!this.aBoolean550) {
			this.method6843();
		}
		Static311.aFloat35 = local19.aFloat69 * local16.aFloat65 + local16.aFloat58 * local19.aFloat67 + local19.aFloat65 * local16.aFloat62;
		Static66.aFloat7 = local19.aFloat61 * local16.aFloat58 + local16.aFloat65 * local19.aFloat64 + local19.aFloat66 * local16.aFloat62 + local16.aFloat66;
		@Pc(72) float local72 = Static311.aFloat35 * (float) this.aShort98 + Static66.aFloat7;
		@Pc(80) float local80 = (float) this.aShort106 * Static311.aFloat35 + Static66.aFloat7;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local80 < local72) {
			local96 = (float) -this.aShort105 + local80;
			local90 = (float) this.aShort105 + local72;
		} else {
			local90 = local80 + (float) this.aShort105;
			local96 = local72 - (float) this.aShort105;
		}
		if (local96 >= this.aClass132_Sub3_36.aFloat142 || (float) this.aClass132_Sub3_36.anInt7920 >= local90) {
			return;
		}
		Static46.aFloat5 = local19.aFloat61 * local16.aFloat59 + local16.aFloat67 * local19.aFloat64 + local16.aFloat68 * local19.aFloat66 + local16.aFloat61;
		Static70.aFloat8 = local19.aFloat67 * local16.aFloat59 + local19.aFloat69 * local16.aFloat67 + local19.aFloat65 * local16.aFloat68;
		@Pc(173) float local173 = Static46.aFloat5 + (float) this.aShort98 * Static70.aFloat8;
		@Pc(181) float local181 = (float) this.aShort106 * Static70.aFloat8 + Static46.aFloat5;
		@Pc(207) float local207;
		@Pc(196) float local196;
		if (local181 < local173) {
			local196 = ((float) this.aShort105 + local173) * (float) this.aClass132_Sub3_36.anInt7908;
			local207 = (float) this.aClass132_Sub3_36.anInt7908 * (local181 - (float) this.aShort105);
		} else {
			local196 = ((float) this.aShort105 + local181) * (float) this.aClass132_Sub3_36.anInt7908;
			local207 = (local173 - (float) this.aShort105) * (float) this.aClass132_Sub3_36.anInt7908;
		}
		if (local207 / local90 >= this.aClass132_Sub3_36.aFloat140 || local196 / local90 <= this.aClass132_Sub3_36.aFloat129) {
			return;
		}
		Static268.aFloat33 = local16.aFloat69 * local19.aFloat64 + local19.aFloat61 * local16.aFloat60 + local19.aFloat66 * local16.aFloat63 + local16.aFloat64;
		Static385.aFloat75 = local16.aFloat60 * local19.aFloat67 + local16.aFloat69 * local19.aFloat69 + local19.aFloat65 * local16.aFloat63;
		@Pc(296) float local296 = Static268.aFloat33 + Static385.aFloat75 * (float) this.aShort98;
		@Pc(304) float local304 = Static268.aFloat33 + Static385.aFloat75 * (float) this.aShort106;
		@Pc(330) float local330;
		@Pc(319) float local319;
		if (local296 > local304) {
			local319 = (float) this.aClass132_Sub3_36.anInt7901 * (local296 + (float) this.aShort105);
			local330 = ((float) -this.aShort105 + local304) * (float) this.aClass132_Sub3_36.anInt7901;
		} else {
			local319 = ((float) this.aShort105 + local304) * (float) this.aClass132_Sub3_36.anInt7901;
			local330 = (float) this.aClass132_Sub3_36.anInt7901 * (local296 - (float) this.aShort105);
		}
		if (this.aClass132_Sub3_36.aFloat138 <= local330 / local90 || this.aClass132_Sub3_36.aFloat133 >= local319 / local90) {
			return;
		}
		if (arg1 != null || this.aClass85Array1 != null) {
			Static151.aFloat15 = local19.aFloat59 * local16.aFloat58 + local16.aFloat65 * local19.aFloat60 + local19.aFloat58 * local16.aFloat62;
			Static466.aFloat153 = local16.aFloat68 * local19.aFloat58 + local19.aFloat60 * local16.aFloat67 + local16.aFloat59 * local19.aFloat59;
			Static377.aFloat71 = local16.aFloat68 * local19.aFloat62 + local19.aFloat63 * local16.aFloat67 + local19.aFloat68 * local16.aFloat59;
			Static673.aFloat205 = local19.aFloat60 * local16.aFloat69 + local16.aFloat60 * local19.aFloat59 + local16.aFloat63 * local19.aFloat58;
			Static196.aFloat19 = local16.aFloat65 * local19.aFloat63 + local16.aFloat58 * local19.aFloat68 + local19.aFloat62 * local16.aFloat62;
			Static460.aFloat151 = local19.aFloat62 * local16.aFloat63 + local19.aFloat63 * local16.aFloat69 + local19.aFloat68 * local16.aFloat60;
		}
		if (arg1 != null) {
			@Pc(490) boolean local490 = false;
			@Pc(492) boolean local492 = true;
			@Pc(500) int local500 = this.aShort99 + this.aShort101 >> 1;
			@Pc(508) int local508 = this.aShort103 + this.aShort100 >> 1;
			@Pc(527) int local527 = (int) (Static377.aFloat71 * (float) local508 + (float) this.aShort98 * Static70.aFloat8 + Static46.aFloat5 + (float) local500 * Static466.aFloat153);
			@Pc(546) int local546 = (int) ((float) this.aShort98 * Static385.aFloat75 + (float) local500 * Static673.aFloat205 + Static268.aFloat33 + (float) local508 * Static460.aFloat151);
			@Pc(565) int local565 = (int) (Static196.aFloat19 * (float) local508 + Static66.aFloat7 + Static151.aFloat15 * (float) local500 + Static311.aFloat35 * (float) this.aShort98);
			if (local565 >= this.aClass132_Sub3_36.anInt7920) {
				arg1.anInt2086 = this.aClass132_Sub3_36.anInt7893 + local546 * this.aClass132_Sub3_36.anInt7901 / local565;
				arg1.anInt2082 = this.aClass132_Sub3_36.anInt7908 * local527 / local565 + this.aClass132_Sub3_36.anInt7906;
			} else {
				local490 = true;
			}
			@Pc(624) int local624 = (int) ((float) this.aShort106 * Static70.aFloat8 + Static46.aFloat5 + Static466.aFloat153 * (float) local500 + (float) local508 * Static377.aFloat71);
			@Pc(643) int local643 = (int) (Static460.aFloat151 * (float) local508 + Static385.aFloat75 * (float) this.aShort106 + Static268.aFloat33 + (float) local500 * Static673.aFloat205);
			@Pc(662) int local662 = (int) (Static311.aFloat35 * (float) this.aShort106 + Static66.aFloat7 + (float) local500 * Static151.aFloat15 + (float) local508 * Static196.aFloat19);
			if (local662 >= this.aClass132_Sub3_36.anInt7920) {
				arg1.anInt2083 = this.aClass132_Sub3_36.anInt7906 + local624 * this.aClass132_Sub3_36.anInt7908 / local662;
				arg1.anInt2084 = this.aClass132_Sub3_36.anInt7893 + this.aClass132_Sub3_36.anInt7901 * local643 / local662;
			} else {
				local490 = true;
			}
			if (local490) {
				if (this.aClass132_Sub3_36.anInt7920 > local565 && local662 < this.aClass132_Sub3_36.anInt7920) {
					local492 = false;
				} else {
					@Pc(745) int local745;
					@Pc(756) int local756;
					@Pc(767) int local767;
					if (this.aClass132_Sub3_36.anInt7920 > local565) {
						local745 = (local662 - this.aClass132_Sub3_36.anInt7920 << 16) / (local662 - local565);
						local756 = local624 + ((local624 - local527) * local745 >> 16);
						arg1.anInt2082 = this.aClass132_Sub3_36.anInt7906 + this.aClass132_Sub3_36.anInt7908 * local756 / this.aClass132_Sub3_36.anInt7920;
						local767 = local643 + ((local643 - local546) * local745 >> 16);
						arg1.anInt2086 = this.aClass132_Sub3_36.anInt7893 + this.aClass132_Sub3_36.anInt7901 * local767 / this.aClass132_Sub3_36.anInt7920;
					} else if (this.aClass132_Sub3_36.anInt7920 > local662) {
						local745 = (local565 - this.aClass132_Sub3_36.anInt7920 << 16) / (local565 - local662);
						local756 = (local745 * (local527 - local624) >> 16) + local527;
						local767 = local546 + (local745 * (local546 - local643) >> 16);
						arg1.anInt2082 = this.aClass132_Sub3_36.anInt7908 * local756 / this.aClass132_Sub3_36.anInt7920 + this.aClass132_Sub3_36.anInt7906;
						arg1.anInt2086 = local767 * this.aClass132_Sub3_36.anInt7901 / this.aClass132_Sub3_36.anInt7920 + this.aClass132_Sub3_36.anInt7893;
					}
				}
			}
			if (local492) {
				if (local565 > local662) {
					arg1.anInt2085 = this.aClass132_Sub3_36.anInt7908 * (this.aShort105 + local527) / local565 + this.aClass132_Sub3_36.anInt7906 - arg1.anInt2082;
				} else {
					arg1.anInt2085 = this.aClass132_Sub3_36.anInt7906 + this.aClass132_Sub3_36.anInt7908 * (this.aShort105 + local624) / local662 - arg1.anInt2083;
				}
				arg1.aBoolean124 = true;
			}
		}
		this.aClass132_Sub3_36.method6777();
		this.aClass132_Sub3_36.method6750(local19);
		this.method6852();
		this.aClass132_Sub3_36.method6786();
		this.method6853();
	}

	@OriginalMember(owner = "client!pr", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean550) {
			this.method6843();
		}
		return this.aShort99;
	}

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean548;
	}

	@OriginalMember(owner = "client!pr", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub1_Sub3.anIntArray56[arg0];
		@Pc(13) int local13 = Class6_Sub1_Sub3.anIntArray58[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7955; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray523[local15] - local9 * this.anIntArray525[local15] >> 14;
			this.anIntArray525[local15] = local13 * this.anIntArray525[local15] + this.anIntArray523[local15] * local9 >> 14;
			this.anIntArray523[local15] = local34;
		}
		if (this.aClass214_12 != null) {
			this.aClass214_12.anInterface26_2 = null;
		}
		this.aBoolean550 = false;
	}

	@OriginalMember(owner = "client!pr", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean550) {
			this.method6843();
		}
		return this.aShort101;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class184 method8660(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(16) Class184_Sub2 local16;
		@Pc(12) Class184_Sub2 local12;
		if (arg0 == 1) {
			local12 = this.aClass132_Sub3_36.aClass184_Sub2_3;
			local16 = this.aClass132_Sub3_36.aClass184_Sub2_2;
		} else if (arg0 == 2) {
			local12 = this.aClass132_Sub3_36.aClass184_Sub2_7;
			local16 = this.aClass132_Sub3_36.aClass184_Sub2_4;
		} else if (arg0 == 3) {
			local12 = this.aClass132_Sub3_36.aClass184_Sub2_9;
			local16 = this.aClass132_Sub3_36.aClass184_Sub2_10;
		} else if (arg0 == 4) {
			local12 = this.aClass132_Sub3_36.aClass184_Sub2_6;
			local16 = this.aClass132_Sub3_36.aClass184_Sub2_8;
		} else if (arg0 == 5) {
			local16 = this.aClass132_Sub3_36.aClass184_Sub2_1;
			local12 = this.aClass132_Sub3_36.aClass184_Sub2_5;
		} else {
			local16 = local12 = new Class184_Sub2(this.aClass132_Sub3_36);
		}
		return this.method6847(arg0 != 0, arg1, arg2, local16, local12);
	}

	@OriginalMember(owner = "client!pr", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7955; local7++) {
			if (arg0 != 128) {
				this.anIntArray524[local7] = this.anIntArray524[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray523[local7] = arg1 * this.anIntArray523[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray525[local7] = this.anIntArray525[local7] * arg2 >> 7;
			}
		}
		this.aBoolean550 = false;
		if (this.aClass214_12 != null) {
			this.aClass214_12.anInterface26_2 = null;
		}
	}

	@OriginalMember(owner = "client!pr", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean550) {
			this.method6843();
		}
		return this.aShort105;
	}

	@OriginalMember(owner = "client!pr", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean550) {
			this.method6843();
		}
		return this.aShort100;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(SBZII)I")
	private int method6846(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) int local17 = Static70.anIntArray71[Static256.method3697(arg3, arg2)];
		if (arg0 != -1) {
			@Pc(29) Class294 local29 = this.aClass132_Sub3_36.anInterface6_11.method7088(arg0 & 0xFFFF);
			@Pc(34) int local34 = local29.aByte118 & 0xFF;
			@Pc(48) int local48;
			@Pc(65) int local65;
			if (local34 != 0) {
				if (arg3 < 0) {
					local48 = 0;
				} else if (arg3 <= 127) {
					local48 = arg3 * 131586;
				} else {
					local48 = 16777215;
				}
				if (local34 == 256) {
					local17 = local48;
				} else {
					local65 = 256 - local34;
					local17 = (local65 * (local17 & 0xFF00FF) + (local48 & 0xFF00FF) * local34 & 0xFF00FF00) + (local34 * (local48 & 0xFF00) + ((local17 & 0xFF00) * local65) & 0xFF0000) >> 8;
				}
			}
			local48 = local29.aByte116 & 0xFF;
			if (local48 != 0) {
				local48 += 256;
				@Pc(119) int local119 = local48 * (local17 >> 16 & 0xFF);
				if (local119 > 65535) {
					local119 = 65535;
				}
				local65 = (local17 >> 8 & 0xFF) * local48;
				if (local65 > 65535) {
					local65 = 65535;
				}
				@Pc(145) int local145 = (local17 & 0xFF) * local48;
				if (local145 > 65535) {
					local145 = 65535;
				}
				local17 = (local145 >> 8) + (local119 << 8 & 0xFF0052) + (local65 & 0xFF00);
			}
		}
		return (local17 << 8) - ((arg1 & 0xFF) - 255);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BZIZLclient!pr;Lclient!pr;)Lclient!ka;")
	private Class184 method6847(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class184_Sub2 arg3, @OriginalArg(5) Class184_Sub2 arg4) {
		arg3.anInt7999 = arg1;
		arg3.aByte112 = 0;
		arg3.aShort102 = this.aShort102;
		arg3.anInt7989 = this.anInt7989;
		arg3.anInt7984 = this.anInt7984;
		arg3.anInt8001 = this.anInt8001;
		arg3.anInt7946 = this.anInt7946;
		if ((arg1 & 0x100) == 0) {
			arg3.aBoolean551 = this.aBoolean551;
		} else {
			arg3.aBoolean551 = true;
		}
		arg3.aBoolean548 = this.aBoolean548;
		arg3.anInt7976 = this.anInt7976;
		arg3.aShort107 = this.aShort107;
		arg3.anInt7966 = this.anInt7966;
		arg3.anInt7955 = this.anInt7955;
		@Pc(75) boolean local75 = Static310.method4425(arg1, this.anInt8001);
		@Pc(81) boolean local81 = Static352.method5121(arg1, this.anInt8001);
		@Pc(87) boolean local87 = Static590.method8953(arg1, this.anInt8001);
		@Pc(93) boolean local93 = local81 | local75 | local87;
		@Pc(208) int local208;
		if (local93) {
			if (!local75) {
				arg3.anIntArray524 = this.anIntArray524;
			} else if (arg4.anIntArray524 == null || arg4.anIntArray524.length < this.anInt7989) {
				arg3.anIntArray524 = arg4.anIntArray524 = new int[this.anInt7989];
			} else {
				arg3.anIntArray524 = arg4.anIntArray524;
			}
			if (!local81) {
				arg3.anIntArray523 = this.anIntArray523;
			} else if (arg4.anIntArray523 == null || this.anInt7989 > arg4.anIntArray523.length) {
				arg3.anIntArray523 = arg4.anIntArray523 = new int[this.anInt7989];
			} else {
				arg3.anIntArray523 = arg4.anIntArray523;
			}
			if (!local87) {
				arg3.anIntArray525 = this.anIntArray525;
			} else if (arg4.anIntArray525 == null || arg4.anIntArray525.length < this.anInt7989) {
				arg3.anIntArray525 = arg4.anIntArray525 = new int[this.anInt7989];
			} else {
				arg3.anIntArray525 = arg4.anIntArray525;
			}
			for (local208 = 0; local208 < this.anInt7989; local208++) {
				if (local75) {
					arg3.anIntArray524[local208] = this.anIntArray524[local208];
				}
				if (local81) {
					arg3.anIntArray523[local208] = this.anIntArray523[local208];
				}
				if (local87) {
					arg3.anIntArray525[local208] = this.anIntArray525[local208];
				}
			}
		} else {
			arg3.anIntArray524 = this.anIntArray524;
			arg3.anIntArray525 = this.anIntArray525;
			arg3.anIntArray523 = this.anIntArray523;
		}
		if (Static293.method4213(this.anInt8001, arg1)) {
			if (arg0) {
				arg3.aByte112 = (byte) (arg3.aByte112 | 0x1);
			}
			arg3.aClass214_12 = arg4.aClass214_12;
			arg3.aClass214_12.aByte102 = this.aClass214_12.aByte102;
			arg3.aClass214_12.anInterface26_2 = this.aClass214_12.anInterface26_2;
		} else if (Static405.method5834(arg1, this.anInt8001)) {
			arg3.aClass214_12 = this.aClass214_12;
		} else {
			arg3.aClass214_12 = null;
		}
		if (Static3.method1022(arg1, this.anInt8001)) {
			if (arg4.aShortArray111 == null || arg4.aShortArray111.length < this.anInt7946) {
				arg3.aShortArray111 = arg4.aShortArray111 = new short[this.anInt7946];
			} else {
				arg3.aShortArray111 = arg4.aShortArray111;
			}
			for (local208 = 0; local208 < this.anInt7946; local208++) {
				arg3.aShortArray111[local208] = this.aShortArray111[local208];
			}
		} else {
			arg3.aShortArray111 = this.aShortArray111;
		}
		if (Static619.method8540(arg1, this.anInt8001)) {
			if (arg4.aByteArray86 == null || arg4.aByteArray86.length < this.anInt7946) {
				arg3.aByteArray86 = arg4.aByteArray86 = new byte[this.anInt7946];
			} else {
				arg3.aByteArray86 = arg4.aByteArray86;
			}
			for (local208 = 0; local208 < this.anInt7946; local208++) {
				arg3.aByteArray86[local208] = this.aByteArray86[local208];
			}
		} else {
			arg3.aByteArray86 = this.aByteArray86;
		}
		if (Static307.method4407(arg1, this.anInt8001)) {
			if (arg0) {
				arg3.aByte112 = (byte) (arg3.aByte112 | 0x2);
			}
			arg3.aClass214_13 = arg4.aClass214_13;
			arg3.aClass214_13.anInterface26_2 = this.aClass214_13.anInterface26_2;
			arg3.aClass214_13.aByte102 = this.aClass214_13.aByte102;
		} else if (Static173.method2463(arg1, this.anInt8001)) {
			arg3.aClass214_13 = this.aClass214_13;
		} else {
			arg3.aClass214_13 = null;
		}
		@Pc(569) int local569;
		if (Static673.method9097(arg1, this.anInt8001)) {
			if (arg4.aShortArray110 == null || arg4.aShortArray110.length < this.anInt7976) {
				local208 = this.anInt7976;
				arg3.aShortArray113 = arg4.aShortArray113 = new short[local208];
				arg3.aShortArray110 = arg4.aShortArray110 = new short[local208];
				arg3.aShortArray109 = arg4.aShortArray109 = new short[local208];
			} else {
				arg3.aShortArray113 = arg4.aShortArray113;
				arg3.aShortArray110 = arg4.aShortArray110;
				arg3.aShortArray109 = arg4.aShortArray109;
			}
			if (this.aClass261_1 == null) {
				for (local208 = 0; local208 < this.anInt7976; local208++) {
					arg3.aShortArray110[local208] = this.aShortArray110[local208];
					arg3.aShortArray109[local208] = this.aShortArray109[local208];
					arg3.aShortArray113[local208] = this.aShortArray113[local208];
				}
			} else {
				if (arg4.aClass261_1 == null) {
					arg4.aClass261_1 = new Class261();
				}
				@Pc(557) Class261 local557 = arg3.aClass261_1 = arg4.aClass261_1;
				if (local557.aShortArray96 == null || local557.aShortArray96.length < this.anInt7976) {
					local569 = this.anInt7976;
					local557.aShortArray97 = new short[local569];
					local557.aShortArray96 = new short[local569];
					local557.aByteArray82 = new byte[local569];
					local557.aShortArray98 = new short[local569];
				}
				for (local569 = 0; local569 < this.anInt7976; local569++) {
					arg3.aShortArray110[local569] = this.aShortArray110[local569];
					arg3.aShortArray109[local569] = this.aShortArray109[local569];
					arg3.aShortArray113[local569] = this.aShortArray113[local569];
					local557.aShortArray96[local569] = this.aClass261_1.aShortArray96[local569];
					local557.aShortArray98[local569] = this.aClass261_1.aShortArray98[local569];
					local557.aShortArray97[local569] = this.aClass261_1.aShortArray97[local569];
					local557.aByteArray82[local569] = this.aClass261_1.aByteArray82[local569];
				}
			}
			arg3.aByteArray87 = this.aByteArray87;
		} else {
			arg3.aShortArray113 = this.aShortArray113;
			arg3.aClass261_1 = this.aClass261_1;
			arg3.aByteArray87 = this.aByteArray87;
			arg3.aShortArray109 = this.aShortArray109;
			arg3.aShortArray110 = this.aShortArray110;
		}
		if (Static179.method2535(arg1, this.anInt8001)) {
			if (arg0) {
				arg3.aByte112 = (byte) (arg3.aByte112 | 0x4);
			}
			arg3.aClass214_11 = arg4.aClass214_11;
			arg3.aClass214_11.anInterface26_2 = this.aClass214_11.anInterface26_2;
			arg3.aClass214_11.aByte102 = this.aClass214_11.aByte102;
		} else if (Static46.method956(this.anInt8001, arg1)) {
			arg3.aClass214_11 = this.aClass214_11;
		} else {
			arg3.aClass214_11 = null;
		}
		if (Static334.method4896(arg1, this.anInt8001)) {
			if (arg4.aFloatArray46 == null || this.anInt7946 > arg4.aFloatArray46.length) {
				local208 = this.anInt7976;
				arg3.aFloatArray46 = arg4.aFloatArray46 = new float[local208];
				arg3.aFloatArray47 = arg4.aFloatArray47 = new float[local208];
			} else {
				arg3.aFloatArray47 = arg4.aFloatArray47;
				arg3.aFloatArray46 = arg4.aFloatArray46;
			}
			for (local208 = 0; local208 < this.anInt7976; local208++) {
				arg3.aFloatArray46[local208] = this.aFloatArray46[local208];
				arg3.aFloatArray47[local208] = this.aFloatArray47[local208];
			}
		} else {
			arg3.aFloatArray46 = this.aFloatArray46;
			arg3.aFloatArray47 = this.aFloatArray47;
		}
		if (Static191.method2705(arg1, this.anInt8001)) {
			if (arg0) {
				arg3.aByte112 = (byte) (arg3.aByte112 | 0x8);
			}
			arg3.aClass214_14 = arg4.aClass214_14;
			arg3.aClass214_14.anInterface26_2 = this.aClass214_14.anInterface26_2;
			arg3.aClass214_14.aByte102 = this.aClass214_14.aByte102;
		} else if (Static556.method7864(this.anInt8001, arg1)) {
			arg3.aClass214_14 = this.aClass214_14;
		} else {
			arg3.aClass214_14 = null;
		}
		if (Static213.method3108(arg1, this.anInt8001)) {
			if (arg4.aShortArray106 == null || this.anInt7946 > arg4.aShortArray106.length) {
				local208 = this.anInt7946;
				arg3.aShortArray106 = arg4.aShortArray106 = new short[local208];
				arg3.aShortArray115 = arg4.aShortArray115 = new short[local208];
				arg3.aShortArray112 = arg4.aShortArray112 = new short[local208];
			} else {
				arg3.aShortArray106 = arg4.aShortArray106;
				arg3.aShortArray115 = arg4.aShortArray115;
				arg3.aShortArray112 = arg4.aShortArray112;
			}
			for (local208 = 0; local208 < this.anInt7946; local208++) {
				arg3.aShortArray106[local208] = this.aShortArray106[local208];
				arg3.aShortArray115[local208] = this.aShortArray115[local208];
				arg3.aShortArray112[local208] = this.aShortArray112[local208];
			}
		} else {
			arg3.aShortArray115 = this.aShortArray115;
			arg3.aShortArray112 = this.aShortArray112;
			arg3.aShortArray106 = this.aShortArray106;
		}
		if (Static202.method3040(this.anInt8001, arg1)) {
			if (arg0) {
				arg3.aByte112 = (byte) (arg3.aByte112 | 0x10);
			}
			arg3.aClass225_1 = arg4.aClass225_1;
			arg3.aClass225_1.anInterface14_2 = this.aClass225_1.anInterface14_2;
		} else if (Static360.method8251(arg1, this.anInt8001)) {
			arg3.aClass225_1 = this.aClass225_1;
		} else {
			arg3.aClass225_1 = null;
		}
		if (Static394.method5591(this.anInt8001, arg1)) {
			if (arg4.aShortArray105 == null || arg4.aShortArray105.length < this.anInt7946) {
				local208 = this.anInt7946;
				arg3.aShortArray105 = arg4.aShortArray105 = new short[local208];
			} else {
				arg3.aShortArray105 = arg4.aShortArray105;
			}
			for (local208 = 0; local208 < this.anInt7946; local208++) {
				arg3.aShortArray105[local208] = this.aShortArray105[local208];
			}
		} else {
			arg3.aShortArray105 = this.aShortArray105;
		}
		if (!Static554.method7830(arg1, this.anInt8001)) {
			arg3.aClass126Array1 = this.aClass126Array1;
		} else if (arg4.aClass126Array1 == null || arg4.aClass126Array1.length < this.anInt7984) {
			local208 = this.anInt7984;
			arg3.aClass126Array1 = arg4.aClass126Array1 = new Class126[local208];
			for (local569 = 0; local569 < this.anInt7984; local569++) {
				arg3.aClass126Array1[local569] = this.aClass126Array1[local569].method2704();
			}
		} else {
			arg3.aClass126Array1 = arg4.aClass126Array1;
			for (local208 = 0; local208 < this.anInt7984; local208++) {
				arg3.aClass126Array1[local208].method2706(this.aClass126Array1[local208]);
			}
		}
		arg3.aShortArray114 = this.aShortArray114;
		arg3.anIntArrayArray46 = this.anIntArrayArray46;
		if (this.aBoolean550) {
			arg3.aShort104 = this.aShort104;
			arg3.aBoolean550 = true;
			arg3.aShort99 = this.aShort99;
			arg3.aShort106 = this.aShort106;
			arg3.aShort105 = this.aShort105;
			arg3.aShort98 = this.aShort98;
			arg3.aShort103 = this.aShort103;
			arg3.aShort101 = this.aShort101;
			arg3.aShort100 = this.aShort100;
		} else {
			arg3.aBoolean550 = false;
		}
		arg3.aShortArray107 = this.aShortArray107;
		arg3.aClass100Array4 = this.aClass100Array4;
		arg3.aClass85Array1 = this.aClass85Array1;
		arg3.aShortArray108 = this.aShortArray108;
		arg3.lb = this.lb;
		arg3.anIntArray526 = this.anIntArray526;
		arg3.aClass218Array4 = this.aClass218Array4;
		arg3.anIntArrayArray47 = this.anIntArrayArray47;
		arg3.anIntArrayArray45 = this.anIntArrayArray45;
		return arg3;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZ)V")
	private void method6848(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass214_13 != null && this.aClass214_13.anInterface26_2 == null;
		@Pc(27) boolean local27 = this.aClass214_11 != null && this.aClass214_11.anInterface26_2 == null;
		@Pc(38) boolean local38 = this.aClass214_12 != null && this.aClass214_12.anInterface26_2 == null;
		@Pc(49) boolean local49 = this.aClass214_14 != null && this.aClass214_14.anInterface26_2 == null;
		if (arg0) {
			local16 &= (this.aByte112 & 0x2) != 0;
			local27 &= (this.aByte112 & 0x4) != 0;
			local49 &= (this.aByte112 & 0x8) != 0;
			local38 &= (this.aByte112 & 0x1) != 0;
		}
		@Pc(100) byte local100 = 0;
		@Pc(104) byte local104 = 0;
		@Pc(106) byte local106 = 0;
		@Pc(108) byte local108 = 0;
		if (local38) {
			local100 = 12;
		}
		if (local16) {
			local104 = local100;
			local100 = (byte) (local100 + 4);
		}
		if (local27) {
			local106 = local100;
			local100 = (byte) (local100 + 12);
		}
		if (local49) {
			local108 = local100;
			local100 = (byte) (local100 + 8);
		}
		if (local100 == 0) {
			return;
		}
		if (local100 * this.anInt7976 <= this.aClass132_Sub3_36.aClass6_Sub23_Sub2_2.aByteArray101.length) {
			this.aClass132_Sub3_36.aClass6_Sub23_Sub2_2.anInt9901 = 0;
		} else {
			this.aClass132_Sub3_36.aClass6_Sub23_Sub2_2 = new Class6_Sub23_Sub2((this.anInt7976 + 100) * local100);
		}
		@Pc(191) Class6_Sub23_Sub2 local191 = this.aClass132_Sub3_36.aClass6_Sub23_Sub2_2;
		@Pc(199) int local199;
		@Pc(208) int local208;
		@Pc(236) int local236;
		@Pc(245) int local245;
		if (local38) {
			@Pc(215) int local215;
			@Pc(222) int local222;
			@Pc(227) int local227;
			@Pc(234) int local234;
			if (this.aClass132_Sub3_36.aBoolean544) {
				for (local199 = 0; local199 < this.anInt7955; local199++) {
					local208 = Stream.floatToRawIntBits((float) this.anIntArray524[local199]);
					local215 = Stream.floatToRawIntBits((float) this.anIntArray523[local199]);
					local222 = Stream.floatToRawIntBits((float) this.anIntArray525[local199]);
					local227 = this.anIntArray526[local199];
					local234 = this.anIntArray526[local199 + 1];
					for (local236 = local227; local236 < local234; local236++) {
						local245 = this.aShortArray108[local236] - 1;
						if (local245 == -1) {
							break;
						}
						local191.anInt9901 = local100 * local245;
						local191.method8364(local208);
						local191.method8364(local215);
						local191.method8364(local222);
					}
				}
			} else {
				for (local199 = 0; local199 < this.anInt7955; local199++) {
					local208 = Stream.floatToRawIntBits((float) this.anIntArray524[local199]);
					local215 = Stream.floatToRawIntBits((float) this.anIntArray523[local199]);
					local222 = Stream.floatToRawIntBits((float) this.anIntArray525[local199]);
					local227 = this.anIntArray526[local199];
					local234 = this.anIntArray526[local199 + 1];
					for (local236 = local227; local236 < local234; local236++) {
						local245 = this.aShortArray108[local236] - 1;
						if (local245 == -1) {
							break;
						}
						local191.anInt9901 = local245 * local100;
						local191.method8373(local208);
						local191.method8373(local215);
						local191.method8373(local222);
					}
				}
			}
		}
		@Pc(497) float local497;
		@Pc(373) short[] local373;
		@Pc(370) short[] local370;
		@Pc(379) short[] local379;
		@Pc(376) byte[] local376;
		@Pc(530) float local530;
		if (local16) {
			if (this.aClass214_11 == null) {
				if (this.aClass261_1 == null) {
					local370 = this.aShortArray109;
					local373 = this.aShortArray110;
					local376 = this.aByteArray87;
					local379 = this.aShortArray113;
				} else {
					local376 = this.aClass261_1.aByteArray82;
					local379 = this.aClass261_1.aShortArray97;
					local370 = this.aClass261_1.aShortArray98;
					local373 = this.aClass261_1.aShortArray96;
				}
				@Pc(403) float local403 = this.aClass132_Sub3_36.aFloatArray45[0];
				@Pc(409) float local409 = this.aClass132_Sub3_36.aFloatArray45[1];
				@Pc(415) float local415 = this.aClass132_Sub3_36.aFloatArray45[2];
				@Pc(419) float local419 = this.aClass132_Sub3_36.aFloat143;
				@Pc(429) float local429 = this.aClass132_Sub3_36.aFloat137 * 768.0F / (float) this.aShort107;
				@Pc(439) float local439 = this.aClass132_Sub3_36.aFloat146 * 768.0F / (float) this.aShort107;
				for (@Pc(441) int local441 = 0; local441 < this.anInt7946; local441++) {
					@Pc(461) int local461 = this.method6846(this.aShortArray105[local441], this.aByteArray86[local441], this.aShortArray111[local441], this.aShort102);
					@Pc(470) float local470 = this.aClass132_Sub3_36.aFloat144 * (float) (local461 >>> 24);
					@Pc(481) float local481 = this.aClass132_Sub3_36.aFloat135 * (float) (local461 >> 8 & 0xFF);
					@Pc(486) short local486 = this.aShortArray106[local441];
					local497 = (float) (local461 >> 16 & 0xFF) * this.aClass132_Sub3_36.aFloat147;
					@Pc(502) short local502 = (short) local376[local486];
					if (local502 == 0) {
						local530 = ((float) local379[local486] * local415 + local403 * (float) local373[local486] + local409 * (float) local370[local486]) * 0.0026041667F;
					} else {
						local530 = (local415 * (float) local379[local486] + local409 * (float) local370[local486] + (float) local373[local486] * local403) / (float) (local502 * 256);
					}
					@Pc(567) float local567 = local419 + (local530 < 0.0F ? local439 : local429) * local530;
					@Pc(572) int local572 = (int) (local567 * local470);
					if (local572 < 0) {
						local572 = 0;
					} else if (local572 > 255) {
						local572 = 255;
					}
					@Pc(591) int local591 = (int) (local497 * local567);
					if (local591 < 0) {
						local591 = 0;
					} else if (local591 > 255) {
						local591 = 255;
					}
					@Pc(610) int local610 = (int) (local481 * local567);
					if (local610 < 0) {
						local610 = 0;
					} else if (local610 > 255) {
						local610 = 255;
					}
					local191.anInt9901 = local486 * local100 + local104;
					local191.method8366(local572);
					local191.method8366(local591);
					local191.method8366(local610);
					local191.method8366(255 - (this.aByteArray86[local441] & 0xFF));
					local486 = this.aShortArray115[local441];
					local502 = (short) local376[local486];
					if (local502 == 0) {
						local530 = ((float) local373[local486] * local403 + local409 * (float) local370[local486] + local415 * (float) local379[local486]) * 0.0026041667F;
					} else {
						local530 = ((float) local379[local486] * local415 + local403 * (float) local373[local486] + (float) local370[local486] * local409) / (float) (local502 * 256);
					}
					local567 = local419 + local530 * (local530 < 0.0F ? local439 : local429);
					local572 = (int) (local567 * local470);
					local591 = (int) (local497 * local567);
					if (local572 < 0) {
						local572 = 0;
					} else if (local572 > 255) {
						local572 = 255;
					}
					if (local591 < 0) {
						local591 = 0;
					} else if (local591 > 255) {
						local591 = 255;
					}
					local610 = (int) (local567 * local481);
					local191.anInt9901 = local104 + local486 * local100;
					if (local610 < 0) {
						local610 = 0;
					} else if (local610 > 255) {
						local610 = 255;
					}
					local191.method8366(local572);
					local191.method8366(local591);
					local191.method8366(local610);
					local191.method8366(255 - (this.aByteArray86[local441] & 0xFF));
					local486 = this.aShortArray112[local441];
					local502 = (short) local376[local486];
					if (local502 == 0) {
						local530 = (local415 * (float) local379[local486] + (float) local373[local486] * local403 + local409 * (float) local370[local486]) * 0.0026041667F;
					} else {
						local530 = ((float) local379[local486] * local415 + (float) local373[local486] * local403 + (float) local370[local486] * local409) / (float) (local502 * 256);
					}
					local567 = local419 + local530 * (local530 < 0.0F ? local439 : local429);
					local572 = (int) (local567 * local470);
					if (local572 < 0) {
						local572 = 0;
					} else if (local572 > 255) {
						local572 = 255;
					}
					local591 = (int) (local567 * local497);
					local610 = (int) (local567 * local481);
					if (local591 < 0) {
						local591 = 0;
					} else if (local591 > 255) {
						local591 = 255;
					}
					if (local610 < 0) {
						local610 = 0;
					} else if (local610 > 255) {
						local610 = 255;
					}
					local191.anInt9901 = local104 + local486 * local100;
					local191.method8366(local572);
					local191.method8366(local591);
					local191.method8366(local610);
					local191.method8366(255 - (this.aByteArray86[local441] & 0xFF));
				}
			} else {
				for (local199 = 0; local199 < this.anInt7946; local199++) {
					local208 = this.method6846(this.aShortArray105[local199], this.aByteArray86[local199], this.aShortArray111[local199], this.aShort102);
					local191.anInt9901 = local104 + this.aShortArray106[local199] * local100;
					local191.method8364(local208);
					local191.anInt9901 = local104 + this.aShortArray115[local199] * local100;
					local191.method8364(local208);
					local191.anInt9901 = this.aShortArray112[local199] * local100 + local104;
					local191.method8364(local208);
				}
			}
		}
		if (local27) {
			if (this.aClass261_1 == null) {
				local376 = this.aByteArray87;
				local379 = this.aShortArray113;
				local370 = this.aShortArray109;
				local373 = this.aShortArray110;
			} else {
				local379 = this.aClass261_1.aShortArray97;
				local373 = this.aClass261_1.aShortArray96;
				local376 = this.aClass261_1.aByteArray82;
				local370 = this.aClass261_1.aShortArray98;
			}
			@Pc(1113) float local1113 = 3.0F / (float) this.aShort107;
			local530 = 3.0F / (float) (this.aShort107 / 2 + this.aShort107);
			local191.anInt9901 = local106;
			if (this.aClass132_Sub3_36.aBoolean544) {
				for (local236 = 0; local236 < this.anInt7976; local236++) {
					local245 = local376[local236] & 0xFF;
					if (local245 == 0) {
						local191.method8407(local530 * (float) local373[local236]);
						local191.method8407(local530 * (float) local370[local236]);
						local191.method8407(local530 * (float) local379[local236]);
					} else {
						local497 = local1113 / (float) local245;
						local191.method8407((float) local373[local236] * local497);
						local191.method8407((float) local370[local236] * local497);
						local191.method8407((float) local379[local236] * local497);
					}
					local191.anInt9901 += local100 - 12;
				}
			} else {
				for (local236 = 0; local236 < this.anInt7976; local236++) {
					local245 = local376[local236] & 0xFF;
					if (local245 == 0) {
						local191.method8406(local530 * (float) local373[local236]);
						local191.method8406(local530 * (float) local370[local236]);
						local191.method8406(local530 * (float) local379[local236]);
					} else {
						local497 = local1113 / (float) local245;
						local191.method8406((float) local373[local236] * local497);
						local191.method8406((float) local370[local236] * local497);
						local191.method8406(local497 * (float) local379[local236]);
					}
					local191.anInt9901 += local100 - 12;
				}
			}
		}
		if (local49) {
			local191.anInt9901 = local108;
			if (this.aClass132_Sub3_36.aBoolean544) {
				for (local199 = 0; local199 < this.anInt7976; local199++) {
					local191.method8407(this.aFloatArray46[local199]);
					local191.method8407(this.aFloatArray47[local199]);
					local191.anInt9901 += local100 - 8;
				}
			} else {
				for (local199 = 0; local199 < this.anInt7976; local199++) {
					local191.method8406(this.aFloatArray46[local199]);
					local191.method8406(this.aFloatArray47[local199]);
					local191.anInt9901 += local100 - 8;
				}
			}
		}
		local191.anInt9901 = local100 * this.anInt7976;
		@Pc(1413) Interface26 local1413;
		if (arg0) {
			if (this.anInterface26_6 == null) {
				this.anInterface26_6 = this.aClass132_Sub3_36.method6806(local100, local191.anInt9901, true, local191.aByteArray101);
			} else {
				this.anInterface26_6.method3632(local191.anInt9901, local100, local191.aByteArray101);
			}
			this.aByte112 = 0;
			local1413 = this.anInterface26_6;
		} else {
			local1413 = this.aClass132_Sub3_36.method6806(local100, local191.anInt9901, false, local191.aByteArray101);
			this.aBoolean549 = true;
		}
		if (local38) {
			this.aClass214_12.aByte102 = 0;
			this.aClass214_12.anInterface26_2 = local1413;
		}
		if (local49) {
			this.aClass214_14.anInterface26_2 = local1413;
			this.aClass214_14.aByte102 = local108;
		}
		if (local16) {
			this.aClass214_13.anInterface26_2 = local1413;
			this.aClass214_13.aByte102 = local104;
		}
		if (local27) {
			this.aClass214_11.anInterface26_2 = local1413;
			this.aClass214_11.aByte102 = local106;
		}
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(IZ)V")
	private void method6849(@OriginalArg(1) boolean arg0) {
		if (this.anInt7966 * 6 <= this.aClass132_Sub3_36.aClass6_Sub23_Sub2_2.aByteArray101.length) {
			this.aClass132_Sub3_36.aClass6_Sub23_Sub2_2.anInt9901 = 0;
		} else {
			this.aClass132_Sub3_36.aClass6_Sub23_Sub2_2 = new Class6_Sub23_Sub2(this.anInt7966 * 6 + 600);
		}
		@Pc(38) Class6_Sub23_Sub2 local38 = this.aClass132_Sub3_36.aClass6_Sub23_Sub2_2;
		@Pc(44) int local44;
		if (this.aClass132_Sub3_36.aBoolean544) {
			for (local44 = 0; local44 < this.anInt7966; local44++) {
				local38.method8347(this.aShortArray106[local44]);
				local38.method8347(this.aShortArray115[local44]);
				local38.method8347(this.aShortArray112[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt7966; local44++) {
				local38.method8335(this.aShortArray106[local44]);
				local38.method8335(this.aShortArray115[local44]);
				local38.method8335(this.aShortArray112[local44]);
			}
		}
		if (local38.anInt9901 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface14_4 == null) {
				this.anInterface14_4 = this.aClass132_Sub3_36.method6745(local38.anInt9901, local38.aByteArray101, true);
			} else {
				this.anInterface14_4.method8575(local38.anInt9901, local38.aByteArray101);
			}
			this.aClass225_1.anInterface14_2 = this.anInterface14_4;
		} else {
			this.aClass225_1.anInterface14_2 = this.aClass132_Sub3_36.method6745(local38.anInt9901, local38.aByteArray101, false);
		}
		if (!arg0) {
			this.aBoolean549 = true;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(FFJILclient!ao;IIBII)S")
	private short method6850(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class22 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray526[arg6];
		@Pc(17) int local17 = this.anIntArray526[arg6 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray108[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg2 == Static76.aLongArray4[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray108[local19] = (short) (this.anInt7976 + 1);
		Static76.aLongArray4[local19] = arg2;
		this.aShortArray110[this.anInt7976] = (short) arg7;
		this.aShortArray109[this.anInt7976] = (short) arg8;
		this.aShortArray113[this.anInt7976] = (short) arg3;
		this.aByteArray87[this.anInt7976] = (byte) arg5;
		this.aFloatArray46[this.anInt7976] = arg0;
		this.aFloatArray47[this.anInt7976] = arg1;
		return (short) this.anInt7976++;
	}

	@OriginalMember(owner = "client!pr", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class6_Sub4_Sub5 ba(@OriginalArg(0) Class6_Sub4_Sub5 arg0) {
		if (this.anInt7976 == 0) {
			return null;
		}
		if (!this.aBoolean550) {
			this.method6843();
		}
		@Pc(37) int local37;
		@Pc(54) int local54;
		if (this.aClass132_Sub3_36.anInt7897 <= 0) {
			local37 = this.aShort99 - (this.aClass132_Sub3_36.anInt7897 * this.aShort98 >> 8) >> this.aClass132_Sub3_36.anInt7879;
			local54 = this.aShort101 - (this.aClass132_Sub3_36.anInt7897 * this.aShort106 >> 8) >> this.aClass132_Sub3_36.anInt7879;
		} else {
			local37 = this.aShort99 - (this.aClass132_Sub3_36.anInt7897 * this.aShort106 >> 8) >> this.aClass132_Sub3_36.anInt7879;
			local54 = this.aShort101 - (this.aClass132_Sub3_36.anInt7897 * this.aShort98 >> 8) >> this.aClass132_Sub3_36.anInt7879;
		}
		@Pc(111) int local111;
		@Pc(128) int local128;
		if (this.aClass132_Sub3_36.anInt7922 <= 0) {
			local111 = this.aShort103 - (this.aShort98 * this.aClass132_Sub3_36.anInt7922 >> 8) >> this.aClass132_Sub3_36.anInt7879;
			local128 = this.aShort100 - (this.aClass132_Sub3_36.anInt7922 * this.aShort106 >> 8) >> this.aClass132_Sub3_36.anInt7879;
		} else {
			local111 = this.aShort103 - (this.aClass132_Sub3_36.anInt7922 * this.aShort106 >> 8) >> this.aClass132_Sub3_36.anInt7879;
			local128 = this.aShort100 - (this.aShort98 * this.aClass132_Sub3_36.anInt7922 >> 8) >> this.aClass132_Sub3_36.anInt7879;
		}
		@Pc(171) int local171 = local54 + 1 - local37;
		@Pc(177) int local177 = local128 + 1 - local111;
		@Pc(180) Class6_Sub4_Sub5_Sub1 local180 = (Class6_Sub4_Sub5_Sub1) arg0;
		@Pc(190) Class6_Sub4_Sub5_Sub1 local190;
		if (local180 != null && local180.method2496(local177, local171)) {
			local190 = local180;
			local180.method2495();
		} else {
			local190 = new Class6_Sub4_Sub5_Sub1(this.aClass132_Sub3_36, local171, local177);
		}
		local190.method2499(local54, local111, local128, local37);
		this.method6842(local190);
		return local190;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8651(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class184_Sub2 local8 = (Class184_Sub2) arg0;
		if (this.anInt7946 == 0 || local8.anInt7946 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt7955;
		@Pc(24) int[] local24 = local8.anIntArray524;
		@Pc(27) int[] local27 = local8.anIntArray523;
		@Pc(30) int[] local30 = local8.anIntArray525;
		@Pc(33) short[] local33 = local8.aShortArray110;
		@Pc(36) short[] local36 = local8.aShortArray109;
		@Pc(39) short[] local39 = local8.aShortArray113;
		@Pc(42) byte[] local42 = local8.aByteArray87;
		@Pc(49) short[] local49;
		@Pc(47) short[] local47;
		@Pc(53) short[] local53;
		@Pc(51) byte[] local51;
		if (this.aClass261_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local51 = this.aClass261_1.aByteArray82;
			local47 = this.aClass261_1.aShortArray98;
			local53 = this.aClass261_1.aShortArray97;
			local49 = this.aClass261_1.aShortArray96;
		}
		@Pc(78) short[] local78;
		@Pc(82) short[] local82;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local8.aClass261_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local78 = local8.aClass261_1.aShortArray96;
			local76 = local8.aClass261_1.aShortArray97;
			local82 = local8.aClass261_1.aShortArray98;
			local80 = local8.aClass261_1.aByteArray82;
		}
		@Pc(103) int[] local103 = local8.anIntArray526;
		@Pc(106) short[] local106 = local8.aShortArray108;
		if (!local8.aBoolean550) {
			local8.method6843();
		}
		@Pc(115) short local115 = local8.aShort98;
		@Pc(118) short local118 = local8.aShort106;
		@Pc(121) short local121 = local8.aShort99;
		@Pc(124) short local124 = local8.aShort101;
		@Pc(127) short local127 = local8.aShort103;
		@Pc(130) short local130 = local8.aShort100;
		for (@Pc(132) int local132 = 0; local132 < this.anInt7955; local132++) {
			@Pc(142) int local142 = this.anIntArray523[local132] - arg2;
			if (local115 <= local142 && local118 >= local142) {
				@Pc(157) int local157 = this.anIntArray524[local132] - arg1;
				if (local157 >= local121 && local157 <= local124) {
					@Pc(173) int local173 = this.anIntArray525[local132] - arg3;
					if (local127 <= local173 && local173 <= local130) {
						@Pc(191) int local191 = -1;
						@Pc(196) int local196 = this.anIntArray526[local132];
						@Pc(203) int local203 = this.anIntArray526[local132 + 1];
						for (@Pc(205) int local205 = local196; local205 < local203; local205++) {
							local191 = this.aShortArray108[local205] - 1;
							if (local191 == -1 || this.aByteArray87[local191] != 0) {
								break;
							}
						}
						if (local191 != -1) {
							for (@Pc(238) int local238 = 0; local238 < local21; local238++) {
								if (local157 == local24[local238] && local173 == local30[local238] && local27[local238] == local142) {
									@Pc(257) int local257 = -1;
									local203 = local103[local238 + 1];
									local196 = local103[local238];
									for (@Pc(269) int local269 = local196; local269 < local203; local269++) {
										local257 = local106[local269] - 1;
										if (local257 == -1 || local42[local257] != 0) {
											break;
										}
									}
									if (local257 != -1) {
										if (local49 == null) {
											this.aClass261_1 = new Class261();
											local49 = this.aClass261_1.aShortArray96 = Static195.method2797(this.aShortArray110);
											local47 = this.aClass261_1.aShortArray98 = Static195.method2797(this.aShortArray109);
											local53 = this.aClass261_1.aShortArray97 = Static195.method2797(this.aShortArray113);
											local51 = this.aClass261_1.aByteArray82 = Static251.method3638(this.aByteArray87);
										}
										if (local78 == null) {
											@Pc(348) Class261 local348 = local8.aClass261_1 = new Class261();
											local78 = local348.aShortArray96 = Static195.method2797(local33);
											local82 = local348.aShortArray98 = Static195.method2797(local36);
											local76 = local348.aShortArray97 = Static195.method2797(local39);
											local80 = local348.aByteArray82 = Static251.method3638(local42);
										}
										@Pc(381) short local381 = this.aShortArray110[local191];
										@Pc(386) short local386 = this.aShortArray109[local191];
										@Pc(391) short local391 = this.aShortArray113[local191];
										local203 = local103[local238 + 1];
										@Pc(402) byte local402 = this.aByteArray87[local191];
										local196 = local103[local238];
										@Pc(416) int local416;
										for (@Pc(408) int local408 = local196; local408 < local203; local408++) {
											local416 = local106[local408] - 1;
											if (local416 == -1) {
												break;
											}
											if (local80[local416] != 0) {
												local78[local416] += local381;
												local82[local416] += local386;
												local76[local416] += local391;
												local80[local416] += local402;
											}
										}
										local196 = this.anIntArray526[local132];
										local402 = local42[local257];
										local386 = local36[local257];
										local391 = local39[local257];
										local203 = this.anIntArray526[local132 + 1];
										local381 = local33[local257];
										for (local416 = local196; local416 < local203; local416++) {
											@Pc(498) int local498 = this.aShortArray108[local416] - 1;
											if (local498 == -1) {
												break;
											}
											if (local51[local498] != 0) {
												local49[local498] += local381;
												local47[local498] += local386;
												local53[local498] += local391;
												local51[local498] += local402;
											}
										}
										if (this.aClass214_11 == null && this.aClass214_13 != null) {
											this.aClass214_13.anInterface26_2 = null;
										}
										if (this.aClass214_11 != null) {
											this.aClass214_11.anInterface26_2 = null;
										}
										if (local8.aClass214_11 == null && local8.aClass214_13 != null) {
											local8.aClass214_13.anInterface26_2 = null;
										}
										if (local8.aClass214_11 != null) {
											local8.aClass214_11.anInterface26_2 = null;
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

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!oo;Lclient!ea;II)V")
	@Override
	public void method8658(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7976 == 0) {
			return;
		}
		@Pc(16) Class207_Sub1 local16 = this.aClass132_Sub3_36.aClass207_Sub1_3;
		@Pc(19) Class207_Sub1 local19 = (Class207_Sub1) arg0;
		if (!this.aBoolean550) {
			this.method6843();
		}
		Static66.aFloat7 = local16.aFloat66 + local16.aFloat58 * local19.aFloat61 + local16.aFloat65 * local19.aFloat64 + local16.aFloat62 * local19.aFloat66;
		Static311.aFloat35 = local16.aFloat65 * local19.aFloat69 + local19.aFloat67 * local16.aFloat58 + local19.aFloat65 * local16.aFloat62;
		@Pc(72) float local72 = (float) this.aShort98 * Static311.aFloat35 + Static66.aFloat7;
		@Pc(80) float local80 = Static66.aFloat7 + (float) this.aShort106 * Static311.aFloat35;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local80 < local72) {
			local91 = (float) -this.aShort105 + local80;
			local97 = local72 + (float) this.aShort105;
		} else {
			local91 = (float) -this.aShort105 + local72;
			local97 = local80 + (float) this.aShort105;
		}
		if (local91 >= this.aClass132_Sub3_36.aFloat148 || (float) this.aClass132_Sub3_36.anInt7920 >= local97) {
			return;
		}
		Static46.aFloat5 = local19.aFloat64 * local16.aFloat67 + local19.aFloat61 * local16.aFloat59 + local16.aFloat68 * local19.aFloat66 + local16.aFloat61;
		Static70.aFloat8 = local16.aFloat68 * local19.aFloat65 + local19.aFloat69 * local16.aFloat67 + local16.aFloat59 * local19.aFloat67;
		@Pc(174) float local174 = Static46.aFloat5 + Static70.aFloat8 * (float) this.aShort98;
		@Pc(182) float local182 = Static46.aFloat5 + (float) this.aShort106 * Static70.aFloat8;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local182 < local174) {
			local197 = (float) this.aClass132_Sub3_36.anInt7908 * (local182 - (float) this.aShort105);
			local208 = (float) this.aClass132_Sub3_36.anInt7908 * (local174 + (float) this.aShort105);
		} else {
			local197 = (float) this.aClass132_Sub3_36.anInt7908 * (local174 - (float) this.aShort105);
			local208 = ((float) this.aShort105 + local182) * (float) this.aClass132_Sub3_36.anInt7908;
		}
		if (this.aClass132_Sub3_36.aFloat140 <= local197 / (float) arg2 || local208 / (float) arg2 <= this.aClass132_Sub3_36.aFloat129) {
			return;
		}
		Static268.aFloat33 = local16.aFloat63 * local19.aFloat66 + local19.aFloat64 * local16.aFloat69 + local16.aFloat60 * local19.aFloat61 + local16.aFloat64;
		Static385.aFloat75 = local19.aFloat65 * local16.aFloat63 + local19.aFloat69 * local16.aFloat69 + local16.aFloat60 * local19.aFloat67;
		@Pc(299) float local299 = Static385.aFloat75 * (float) this.aShort98 + Static268.aFloat33;
		@Pc(307) float local307 = (float) this.aShort106 * Static385.aFloat75 + Static268.aFloat33;
		@Pc(333) float local333;
		@Pc(322) float local322;
		if (local307 < local299) {
			local333 = ((float) -this.aShort105 + local307) * (float) this.aClass132_Sub3_36.anInt7901;
			local322 = (local299 + (float) this.aShort105) * (float) this.aClass132_Sub3_36.anInt7901;
		} else {
			local322 = (float) this.aClass132_Sub3_36.anInt7901 * ((float) this.aShort105 + local307);
			local333 = (float) this.aClass132_Sub3_36.anInt7901 * (local299 - (float) this.aShort105);
		}
		if (local333 / (float) arg2 >= this.aClass132_Sub3_36.aFloat138 || local322 / (float) arg2 <= this.aClass132_Sub3_36.aFloat133) {
			return;
		}
		if (arg1 != null || this.aClass85Array1 != null) {
			Static377.aFloat71 = local19.aFloat68 * local16.aFloat59 + local19.aFloat63 * local16.aFloat67 + local19.aFloat62 * local16.aFloat68;
			Static196.aFloat19 = local16.aFloat65 * local19.aFloat63 + local16.aFloat58 * local19.aFloat68 + local16.aFloat62 * local19.aFloat62;
			Static466.aFloat153 = local16.aFloat68 * local19.aFloat58 + local19.aFloat59 * local16.aFloat59 + local16.aFloat67 * local19.aFloat60;
			Static673.aFloat205 = local19.aFloat58 * local16.aFloat63 + local19.aFloat59 * local16.aFloat60 + local19.aFloat60 * local16.aFloat69;
			Static151.aFloat15 = local16.aFloat58 * local19.aFloat59 + local19.aFloat60 * local16.aFloat65 + local19.aFloat58 * local16.aFloat62;
			Static460.aFloat151 = local16.aFloat63 * local19.aFloat62 + local19.aFloat63 * local16.aFloat69 + local16.aFloat60 * local19.aFloat68;
		}
		if (arg1 != null) {
			@Pc(502) int local502 = this.aShort99 + this.aShort101 >> 1;
			@Pc(511) int local511 = this.aShort103 + this.aShort100 >> 1;
			@Pc(530) int local530 = (int) ((float) this.aShort98 * Static70.aFloat8 + Static466.aFloat153 * (float) local502 + Static46.aFloat5 + (float) local511 * Static377.aFloat71);
			@Pc(549) int local549 = (int) ((float) local511 * Static460.aFloat151 + (float) this.aShort98 * Static385.aFloat75 + Static673.aFloat205 * (float) local502 + Static268.aFloat33);
			@Pc(568) int local568 = (int) (Static311.aFloat35 * (float) this.aShort98 + Static66.aFloat7 + (float) local502 * Static151.aFloat15 + Static196.aFloat19 * (float) local511);
			@Pc(587) int local587 = (int) ((float) local511 * Static377.aFloat71 + (float) this.aShort106 * Static70.aFloat8 + Static46.aFloat5 + Static466.aFloat153 * (float) local502);
			@Pc(606) int local606 = (int) (Static385.aFloat75 * (float) this.aShort106 + Static268.aFloat33 + Static673.aFloat205 * (float) local502 + Static460.aFloat151 * (float) local511);
			@Pc(625) int local625 = (int) (Static66.aFloat7 + (float) local502 * Static151.aFloat15 + Static311.aFloat35 * (float) this.aShort106 + Static196.aFloat19 * (float) local511);
			arg1.anInt2084 = this.aClass132_Sub3_36.anInt7901 * local606 / arg2 + this.aClass132_Sub3_36.anInt7893;
			arg1.anInt2086 = this.aClass132_Sub3_36.anInt7901 * local549 / arg2 + this.aClass132_Sub3_36.anInt7893;
			arg1.anInt2082 = this.aClass132_Sub3_36.anInt7906 + local530 * this.aClass132_Sub3_36.anInt7908 / arg2;
			arg1.anInt2083 = local587 * this.aClass132_Sub3_36.anInt7908 / arg2 + this.aClass132_Sub3_36.anInt7906;
			if (this.aClass132_Sub3_36.anInt7920 <= local568 || local625 >= this.aClass132_Sub3_36.anInt7920) {
				arg1.anInt2085 = (this.aShort105 + local530) * this.aClass132_Sub3_36.anInt7908 / arg2 + this.aClass132_Sub3_36.anInt7906 - arg1.anInt2082;
				arg1.aBoolean124 = true;
			}
		}
		this.aClass132_Sub3_36.method6736((float) arg2);
		this.aClass132_Sub3_36.method6749();
		this.aClass132_Sub3_36.method6750(local19);
		this.method6852();
		this.aClass132_Sub3_36.method6786();
		this.method6853();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IILclient!oo;ZII)Z")
	@Override
	public boolean method8653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method6844(arg4, arg3, arg5, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "()V")
	@Override
	public void method8663() {
		if (this.anInt7976 <= 0 || this.anInt7966 <= 0) {
			return;
		}
		this.method6848(false);
		if ((this.aByte112 & 0x10) == 0 && this.aClass225_1.anInterface14_2 == null) {
			this.method6849(false);
		}
		this.method6854();
	}

	@OriginalMember(owner = "client!pr", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7955; local3++) {
			this.anIntArray525[local3] = -this.anIntArray525[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt7976; local29++) {
			this.aShortArray113[local29] = (short) -this.aShortArray113[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt7946; local52++) {
			@Pc(59) short local59 = this.aShortArray106[local52];
			this.aShortArray106[local52] = this.aShortArray112[local52];
			this.aShortArray112[local52] = local59;
		}
		if (this.aClass214_11 == null && this.aClass214_13 != null) {
			this.aClass214_13.anInterface26_2 = null;
		}
		if (this.aClass214_11 != null) {
			this.aClass214_11.anInterface26_2 = null;
		}
		if (this.aClass225_1 != null) {
			this.aClass225_1.anInterface14_2 = null;
		}
		this.aBoolean550 = false;
		if (this.aClass214_12 != null) {
			this.aClass214_12.anInterface26_2 = null;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!oo;)V")
	@Override
	public void method8659(@OriginalArg(0) Class207 arg0) {
		@Pc(8) Class207_Sub1 local8 = (Class207_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass100Array4 != null) {
			for (local13 = 0; local13 < this.aClass100Array4.length; local13++) {
				@Pc(20) Class100 local20 = this.aClass100Array4[local13];
				@Pc(22) Class100 local22 = local20;
				if (local20.aClass100_2 != null) {
					local22 = local20.aClass100_2;
				}
				local22.anInt2513 = (int) (local8.aFloat67 * (float) this.anIntArray523[local20.anInt2508] + (float) this.anIntArray524[local20.anInt2508] * local8.aFloat59 + local8.aFloat68 * (float) this.anIntArray525[local20.anInt2508] + local8.aFloat61);
				local22.anInt2512 = (int) (local8.aFloat64 + (float) this.anIntArray525[local20.anInt2508] * local8.aFloat63 + (float) this.anIntArray523[local20.anInt2508] * local8.aFloat69 + local8.aFloat60 * (float) this.anIntArray524[local20.anInt2508]);
				local22.anInt2501 = (int) (local8.aFloat62 * (float) this.anIntArray525[local20.anInt2508] + local8.aFloat58 * (float) this.anIntArray524[local20.anInt2508] + local8.aFloat65 * (float) this.anIntArray523[local20.anInt2508] + local8.aFloat66);
				local22.anInt2504 = (int) ((float) this.anIntArray525[local20.anInt2511] * local8.aFloat68 + local8.aFloat67 * (float) this.anIntArray523[local20.anInt2511] + (float) this.anIntArray524[local20.anInt2511] * local8.aFloat59 + local8.aFloat61);
				local22.anInt2502 = (int) ((float) this.anIntArray524[local20.anInt2511] * local8.aFloat60 + local8.aFloat69 * (float) this.anIntArray523[local20.anInt2511] + (float) this.anIntArray525[local20.anInt2511] * local8.aFloat63 + local8.aFloat64);
				local22.anInt2505 = (int) ((float) this.anIntArray524[local20.anInt2511] * local8.aFloat58 + (float) this.anIntArray523[local20.anInt2511] * local8.aFloat65 + (float) this.anIntArray525[local20.anInt2511] * local8.aFloat62 + local8.aFloat66);
				local22.anInt2500 = (int) (local8.aFloat68 * (float) this.anIntArray525[local20.anInt2499] + (float) this.anIntArray523[local20.anInt2499] * local8.aFloat67 + (float) this.anIntArray524[local20.anInt2499] * local8.aFloat59 + local8.aFloat61);
				local22.anInt2509 = (int) (local8.aFloat64 + (float) this.anIntArray525[local20.anInt2499] * local8.aFloat63 + local8.aFloat60 * (float) this.anIntArray524[local20.anInt2499] + (float) this.anIntArray523[local20.anInt2499] * local8.aFloat69);
				local22.anInt2498 = (int) (local8.aFloat66 + (float) this.anIntArray525[local20.anInt2499] * local8.aFloat62 + local8.aFloat65 * (float) this.anIntArray523[local20.anInt2499] + local8.aFloat58 * (float) this.anIntArray524[local20.anInt2499]);
			}
		}
		if (this.aClass218Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass218Array4.length; local13++) {
			@Pc(365) Class218 local365 = this.aClass218Array4[local13];
			@Pc(367) Class218 local367 = local365;
			if (local365.aClass218_2 != null) {
				local367 = local365.aClass218_2;
			}
			if (local365.aClass207_20 == null) {
				local365.aClass207_20 = local8.method8199();
			} else {
				local365.aClass207_20.method8211(local8);
			}
			local367.anInt6152 = (int) (local8.aFloat61 + local8.aFloat68 * (float) this.anIntArray525[local365.anInt6151] + (float) this.anIntArray523[local365.anInt6151] * local8.aFloat67 + local8.aFloat59 * (float) this.anIntArray524[local365.anInt6151]);
			local367.anInt6153 = (int) (local8.aFloat64 + local8.aFloat60 * (float) this.anIntArray524[local365.anInt6151] + local8.aFloat69 * (float) this.anIntArray523[local365.anInt6151] + local8.aFloat63 * (float) this.anIntArray525[local365.anInt6151]);
			local367.anInt6150 = (int) ((float) this.anIntArray525[local365.anInt6151] * local8.aFloat62 + local8.aFloat65 * (float) this.anIntArray523[local365.anInt6151] + (float) this.anIntArray524[local365.anInt6151] * local8.aFloat58 + local8.aFloat66);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!oo;IZ)V")
	@Override
	public void method8642(@OriginalArg(0) Class207 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray114 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7955; local14++) {
			if ((arg1 & this.aShortArray114[local14]) != 0) {
				if (arg2) {
					arg0.method8210(this.anIntArray524[local14], this.anIntArray523[local14], this.anIntArray525[local14], local12);
				} else {
					arg0.method8195(this.anIntArray524[local14], this.anIntArray523[local14], this.anIntArray525[local14], local12);
				}
				this.anIntArray524[local14] = local12[0];
				this.anIntArray523[local14] = local12[1];
				this.anIntArray525[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt7999;
	}

	@OriginalMember(owner = "client!pr", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean551;
	}

	@OriginalMember(owner = "client!pr", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort102;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIBIIII)Z")
	private boolean method6851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 < arg1 && arg6 > arg7 && arg7 < arg0) {
			return false;
		} else if (arg1 < arg7 && arg6 < arg7 && arg7 > arg0) {
			return false;
		} else if (arg4 < arg2 && arg3 > arg4 && arg5 > arg4) {
			return false;
		} else {
			return arg2 >= arg4 || arg3 >= arg4 || arg4 <= arg5;
		}
	}

	@OriginalMember(owner = "client!pr", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean550) {
			this.method6843();
		}
		return this.aShort106;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
	private void method6852() {
		if (this.anInt7966 == 0) {
			return;
		}
		if (this.aByte112 != 0) {
			this.method6848(true);
		}
		this.method6848(false);
		if (this.aClass225_1 != null) {
			if (this.aClass225_1.anInterface14_2 == null) {
				this.method6849((this.aByte112 & 0x10) != 0);
			}
			if (this.aClass225_1.anInterface14_2 != null) {
				this.aClass132_Sub3_36.method6742(this.aClass214_11 != null);
				this.aClass132_Sub3_36.method6788(this.aClass214_12, this.aClass214_14, this.aClass214_13, this.aClass214_11);
				@Pc(76) int local76 = this.lb.length - 1;
				for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
					@Pc(85) int local85 = this.lb[local78];
					@Pc(92) int local92 = this.lb[local78 + 1];
					@Pc(99) int local99 = this.aShortArray105[local85] & 0xFFFF;
					if (local99 == 65535) {
						local99 = -1;
					}
					this.aClass132_Sub3_36.method6800(this.aClass214_11 != null, local99);
					this.aClass132_Sub3_36.method6751((local92 - local85) * 3, this.aClass225_1.anInterface14_2, local85 * 3);
				}
			}
		}
		this.method6854();
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "()V")
	@Override
	protected void method8647() {
	}

	@OriginalMember(owner = "client!pr", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort107;
	}

	@OriginalMember(owner = "client!pr", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub1_Sub3.anIntArray56[arg0];
		@Pc(13) int local13 = Class6_Sub1_Sub3.anIntArray58[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7955; local15++) {
			@Pc(34) int local34 = this.anIntArray523[local15] * local9 + this.anIntArray524[local15] * local13 >> 14;
			this.anIntArray523[local15] = local13 * this.anIntArray523[local15] - this.anIntArray524[local15] * local9 >> 14;
			this.anIntArray524[local15] = local34;
		}
		this.aBoolean550 = false;
		if (this.aClass214_12 != null) {
			this.aClass214_12.anInterface26_2 = null;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt7946; local7++) {
			local16 = this.aShortArray111[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			@Pc(60) int local60 = local16 & 0x7F;
			if (arg2 != -1) {
				local60 += arg3 * (arg2 - local60) >> 7;
			}
			this.aShortArray111[local7] = (short) (local60 | local22 << 10 | local28 << 7);
		}
		if (this.aClass85Array1 != null) {
			for (local16 = 0; local16 < this.anInt7984; local16++) {
				@Pc(109) Class85 local109 = this.aClass85Array1[local16];
				@Pc(114) Class126 local114 = this.aClass126Array1[local16];
				local114.anInt3248 = local114.anInt3248 & 0xFF000000 | Static70.anIntArray71[this.aShortArray111[local109.anInt2290] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass214_13 != null) {
			this.aClass214_13.anInterface26_2 = null;
		}
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
	private void method6853() {
		if (this.aClass85Array1 == null) {
			return;
		}
		@Pc(8) Class207_Sub1 local8 = this.aClass132_Sub3_36.aClass207_Sub1_2;
		this.aClass132_Sub3_36.method6809();
		this.aClass132_Sub3_36.C(!this.aBoolean551);
		this.aClass132_Sub3_36.method6742(false);
		this.aClass132_Sub3_36.method6788(this.aClass132_Sub3_36.aClass214_9, this.aClass132_Sub3_36.aClass214_10, (Class214) null, (Class214) null);
		for (@Pc(42) int local42 = 0; local42 < this.anInt7984; local42++) {
			@Pc(49) Class85 local49 = this.aClass85Array1[local42];
			@Pc(54) Class126 local54 = this.aClass126Array1[local42];
			if (!local49.aBoolean138 || !this.aClass132_Sub3_36.method7466()) {
				@Pc(82) float local82 = (float) (this.anIntArray524[local49.anInt2288] + this.anIntArray524[local49.anInt2286] + this.anIntArray524[local49.anInt2289]) * 0.3333333F;
				@Pc(103) float local103 = (float) (this.anIntArray523[local49.anInt2288] + this.anIntArray523[local49.anInt2289] + this.anIntArray523[local49.anInt2286]) * 0.3333333F;
				@Pc(125) float local125 = (float) (this.anIntArray525[local49.anInt2286] + this.anIntArray525[local49.anInt2289] + this.anIntArray525[local49.anInt2288]) * 0.3333333F;
				@Pc(139) float local139 = Static46.aFloat5 + local125 * Static377.aFloat71 + local82 * Static466.aFloat153 + local103 * Static70.aFloat8;
				@Pc(153) float local153 = Static268.aFloat33 + Static385.aFloat75 * local103 + local82 * Static673.aFloat205 + Static460.aFloat151 * local125;
				@Pc(167) float local167 = Static66.aFloat7 + Static196.aFloat19 * local125 + local103 * Static311.aFloat35 + local82 * Static151.aFloat15;
				@Pc(188) float local188 = (float) (1.0D / Math.sqrt((double) (local153 * local153 + local139 * local139 + local167 * local167))) * (float) local49.anInt2287;
				local8.method5005(local153 * local188 + (float) local54.anInt3250 - local153, local49.aShort28 * local54.anInt3243 >> 7, local49.aShort29 * local54.anInt3245 >> 7, local54.anInt3246, local139 + (float) local54.anInt3253 - local188 * local139, local188 * local167 + -local167);
				this.aClass132_Sub3_36.method6793(local8);
				@Pc(240) int local240 = local54.anInt3248;
				OpenGL.glColor4ub((byte) (local240 >> 16), (byte) (local240 >> 8), (byte) local240, (byte) (local240 >> 24));
				this.aClass132_Sub3_36.method6772(local49.aShort30);
				this.aClass132_Sub3_36.method6781(local49.aByte34);
				this.aClass132_Sub3_36.method6780(4);
			}
		}
		this.aClass132_Sub3_36.C(true);
		this.aClass132_Sub3_36.method6786();
	}

	@OriginalMember(owner = "client!pr", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean550) {
			this.method6843();
		}
		return this.aShort98;
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "()[Lclient!fba;")
	@Override
	public Class100[] method8657() {
		return this.aClass100Array4;
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)V")
	private void method6854() {
		if (!this.aBoolean549) {
			return;
		}
		this.aBoolean549 = false;
		if (this.aClass100Array4 == null && this.aClass218Array4 == null && this.aClass85Array1 == null && !Static484.method7048(this.anInt8001, this.anInt7999)) {
			@Pc(30) boolean local30 = false;
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			if (this.anIntArray524 != null && !Static265.method3966(this.anInt8001, this.anInt7999)) {
				if (this.aClass214_12 != null && this.aClass214_12.anInterface26_2 == null) {
					this.aBoolean549 = true;
				} else {
					if (!this.aBoolean550) {
						this.method6843();
					}
					local30 = true;
				}
			}
			if (this.anIntArray523 != null && !Static294.method8655(this.anInt7999, this.anInt8001)) {
				if (this.aClass214_12 != null && this.aClass214_12.anInterface26_2 == null) {
					this.aBoolean549 = true;
				} else {
					if (!this.aBoolean550) {
						this.method6843();
					}
					local32 = true;
				}
			}
			if (this.anIntArray525 != null && !Static212.method3105(this.anInt8001, this.anInt7999)) {
				if (this.aClass214_12 != null && this.aClass214_12.anInterface26_2 == null) {
					this.aBoolean549 = true;
				} else {
					local34 = true;
					if (!this.aBoolean550) {
						this.method6843();
					}
				}
			}
			if (local30) {
				this.anIntArray524 = null;
			}
			if (local32) {
				this.anIntArray523 = null;
			}
			if (local34) {
				this.anIntArray525 = null;
			}
		}
		if (this.aShortArray108 != null && this.anIntArray524 == null && this.anIntArray523 == null && this.anIntArray525 == null) {
			this.aShortArray108 = null;
			this.anIntArray526 = null;
		}
		if (this.aByteArray87 != null && !Static337.method2273(this.anInt7999, this.anInt8001)) {
			if (this.aClass214_11 == null) {
				if (this.aClass214_13 != null && this.aClass214_13.anInterface26_2 == null) {
					this.aBoolean549 = true;
				} else {
					this.aByteArray87 = null;
					this.aShortArray110 = this.aShortArray109 = this.aShortArray113 = null;
				}
			} else if (this.aClass214_11.anInterface26_2 == null) {
				this.aBoolean549 = true;
			} else {
				this.aShortArray110 = this.aShortArray109 = this.aShortArray113 = null;
				this.aByteArray87 = null;
			}
		}
		if (this.aShortArray111 != null && !Static128.method1958(this.anInt7999, this.anInt8001)) {
			if (this.aClass214_13 != null && this.aClass214_13.anInterface26_2 == null) {
				this.aBoolean549 = true;
			} else {
				this.aShortArray111 = null;
			}
		}
		if (this.aByteArray86 != null && !Static281.method4108(this.anInt8001, this.anInt7999)) {
			if (this.aClass214_13 != null && this.aClass214_13.anInterface26_2 == null) {
				this.aBoolean549 = true;
			} else {
				this.aByteArray86 = null;
			}
		}
		if (this.aFloatArray46 != null && !Static491.method8326(this.anInt8001, this.anInt7999)) {
			if (this.aClass214_14 != null && this.aClass214_14.anInterface26_2 == null) {
				this.aBoolean549 = true;
			} else {
				this.aFloatArray46 = this.aFloatArray47 = null;
			}
		}
		if (this.aShortArray105 != null && !Static173.method2466(this.anInt7999, this.anInt8001)) {
			if (this.aClass214_13 != null && this.aClass214_13.anInterface26_2 == null) {
				this.aBoolean549 = true;
			} else {
				this.aShortArray105 = null;
			}
		}
		if (this.aShortArray106 != null && !Static239.method3592(this.anInt7999, this.anInt8001)) {
			if (this.aClass225_1 != null && this.aClass225_1.anInterface14_2 == null || this.aClass214_13 != null && this.aClass214_13.anInterface26_2 == null) {
				this.aBoolean549 = true;
			} else {
				this.aShortArray106 = this.aShortArray115 = this.aShortArray112 = null;
			}
		}
		if (this.anIntArrayArray45 != null && !Static432.method6400(this.anInt8001, this.anInt7999)) {
			this.anIntArrayArray45 = null;
			this.aShortArray107 = null;
		}
		if (this.anIntArrayArray46 != null && !Static644.method8781(this.anInt8001, this.anInt7999)) {
			this.aShortArray114 = null;
			this.anIntArrayArray46 = null;
		}
		if (this.anIntArrayArray47 != null && !Static607.method8311(this.anInt8001, this.anInt7999)) {
			this.anIntArrayArray47 = null;
		}
		if (this.lb != null && (this.anInt7999 & 0x800) == 0 && (this.anInt7999 & 0x40000) == 0) {
			this.lb = null;
		}
	}
}
