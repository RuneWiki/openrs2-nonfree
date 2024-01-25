import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lia")
public final class Class157_Sub3 extends Class157 {

	@OriginalMember(owner = "client!lia", name = "Gb", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!lia", name = "Hb", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!lia", name = "Lb", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!lia", name = "M", descriptor = "[Lclient!qia;")
	private Class303[] aClass303Array1;

	@OriginalMember(owner = "client!lia", name = "pc", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!lia", name = "jc", descriptor = "[I")
	private int[] anIntArray347;

	@OriginalMember(owner = "client!lia", name = "Tb", descriptor = "S")
	private short aShort78;

	@OriginalMember(owner = "client!lia", name = "vc", descriptor = "[Lclient!sw;")
	private Class348[] aClass348Array5;

	@OriginalMember(owner = "client!lia", name = "zc", descriptor = "Lclient!rt;")
	private Interface24 anInterface24_6;

	@OriginalMember(owner = "client!lia", name = "Cc", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!lia", name = "Mb", descriptor = "[I")
	private int[] anIntArray348;

	@OriginalMember(owner = "client!lia", name = "W", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!lia", name = "C", descriptor = "[Lclient!lka;")
	private Class231[] aClass231Array1;

	@OriginalMember(owner = "client!lia", name = "Ub", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!lia", name = "sb", descriptor = "Lclient!pv;")
	private Class295 aClass295_1;

	@OriginalMember(owner = "client!lia", name = "ac", descriptor = "[Lclient!hl;")
	private Class156[] aClass156Array5;

	@OriginalMember(owner = "client!lia", name = "qc", descriptor = "[B")
	private byte[] aByteArray49;

	@OriginalMember(owner = "client!lia", name = "Wb", descriptor = "B")
	private byte aByte92;

	@OriginalMember(owner = "client!lia", name = "s", descriptor = "S")
	private short aShort79;

	@OriginalMember(owner = "client!lia", name = "sc", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!lia", name = "Qb", descriptor = "S")
	private short aShort81;

	@OriginalMember(owner = "client!lia", name = "hc", descriptor = "[I")
	private int[] anIntArray349;

	@OriginalMember(owner = "client!lia", name = "R", descriptor = "[I")
	private int[] anIntArray350;

	@OriginalMember(owner = "client!lia", name = "Bb", descriptor = "S")
	private short aShort82;

	@OriginalMember(owner = "client!lia", name = "Kb", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!lia", name = "S", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!lia", name = "fc", descriptor = "I")
	private int anInt6175;

	@OriginalMember(owner = "client!lia", name = "Ib", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!lia", name = "Ec", descriptor = "S")
	private short aShort83;

	@OriginalMember(owner = "client!lia", name = "lb", descriptor = "S")
	private short lb;

	@OriginalMember(owner = "client!lia", name = "yc", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!lia", name = "bb", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!lia", name = "xc", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!lia", name = "Vb", descriptor = "[F")
	private float[] aFloatArray54;

	@OriginalMember(owner = "client!lia", name = "uc", descriptor = "[S")
	private short[] aShortArray118;

	@OriginalMember(owner = "client!lia", name = "N", descriptor = "[F")
	private float[] aFloatArray55;

	@OriginalMember(owner = "client!lia", name = "cb", descriptor = "[I")
	private int[] anIntArray351;

	@OriginalMember(owner = "client!lia", name = "Ac", descriptor = "Lclient!ika;")
	private Interface11 anInterface11_4;

	@OriginalMember(owner = "client!lia", name = "qb", descriptor = "I")
	private int anInt6181;

	@OriginalMember(owner = "client!lia", name = "nc", descriptor = "[S")
	private short[] aShortArray119;

	@OriginalMember(owner = "client!lia", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!lia", name = "Db", descriptor = "[S")
	private short[] aShortArray120;

	@OriginalMember(owner = "client!lia", name = "fb", descriptor = "I")
	private int anInt6189;

	@OriginalMember(owner = "client!lia", name = "nb", descriptor = "S")
	private short aShort86;

	@OriginalMember(owner = "client!lia", name = "K", descriptor = "Z")
	private boolean aBoolean486 = true;

	@OriginalMember(owner = "client!lia", name = "L", descriptor = "Z")
	private boolean aBoolean487 = false;

	@OriginalMember(owner = "client!lia", name = "H", descriptor = "I")
	private int anInt6155 = 0;

	@OriginalMember(owner = "client!lia", name = "gb", descriptor = "I")
	private int anInt6149 = 0;

	@OriginalMember(owner = "client!lia", name = "Z", descriptor = "Z")
	private boolean aBoolean488 = false;

	@OriginalMember(owner = "client!lia", name = "w", descriptor = "I")
	private int anInt6180 = 0;

	@OriginalMember(owner = "client!lia", name = "Fb", descriptor = "I")
	private int anInt6167 = 0;

	@OriginalMember(owner = "client!lia", name = "Eb", descriptor = "I")
	private int anInt6187 = 0;

	@OriginalMember(owner = "client!lia", name = "kc", descriptor = "Z")
	private boolean aBoolean489 = false;

	@OriginalMember(owner = "client!lia", name = "Yb", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_24;

	@OriginalMember(owner = "client!lia", name = "yb", descriptor = "Lclient!li;")
	private Class229 aClass229_11;

	@OriginalMember(owner = "client!lia", name = "rc", descriptor = "Lclient!li;")
	private Class229 aClass229_9;

	@OriginalMember(owner = "client!lia", name = "mc", descriptor = "Lclient!li;")
	private Class229 aClass229_12;

	@OriginalMember(owner = "client!lia", name = "Gc", descriptor = "Lclient!li;")
	private Class229 aClass229_10;

	@OriginalMember(owner = "client!lia", name = "y", descriptor = "Lclient!un;")
	private Class374 aClass374_1;

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lclient!gia;)V")
	public Class157_Sub3(@OriginalArg(0) Class67_Sub2 arg0) {
		this.aClass67_Sub2_24 = arg0;
		this.aClass229_11 = new Class229((Interface24) null, 5126, 3, 0);
		this.aClass229_9 = new Class229((Interface24) null, 5126, 2, 0);
		this.aClass229_12 = new Class229((Interface24) null, 5126, 3, 0);
		this.aClass229_10 = new Class229((Interface24) null, 5121, 4, 0);
		this.aClass374_1 = new Class374();
	}

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lclient!gia;Lclient!iq;IIII)V")
	public Class157_Sub3(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6175 = arg2;
		this.anInt6189 = arg5;
		this.aClass67_Sub2_24 = arg0;
		if (Static244.method3738(arg2, arg5)) {
			this.aClass229_11 = new Class229((Interface24) null, 5126, 3, 0);
		}
		if (Static609.method8333(arg2, arg5)) {
			this.aClass229_9 = new Class229((Interface24) null, 5126, 2, 0);
		}
		if (Static540.method7593(arg5, arg2)) {
			this.aClass229_12 = new Class229((Interface24) null, 5126, 3, 0);
		}
		if (Static14.method271(arg2, arg5)) {
			this.aClass229_10 = new Class229((Interface24) null, 5121, 4, 0);
		}
		if (Static163.method2626(arg5, arg2)) {
			this.aClass374_1 = new Class374();
		}
		@Pc(116) Interface2 local116 = arg0.anInterface2_11;
		this.anIntArray347 = new int[arg1.anInt5129 + 1];
		@Pc(127) int[] local127 = new int[arg1.anInt5135];
		for (@Pc(129) int local129 = 0; local129 < arg1.anInt5135; local129++) {
			if (arg1.aByteArray36 == null || arg1.aByteArray36[local129] != 2) {
				if (arg1.aShortArray101 != null && arg1.aShortArray101[local129] != -1) {
					@Pc(170) Class32 local170 = local116.method1027(arg1.aShortArray101[local129] & 0xFFFF);
					if (((this.anInt6189 & 0x40) == 0 || !local170.aBoolean67) && local170.aBoolean65) {
						continue;
					}
				}
				local127[this.anInt6180++] = local129;
				this.anIntArray347[arg1.aShortArray96[local129]]++;
				this.anIntArray347[arg1.aShortArray95[local129]]++;
				this.anIntArray347[arg1.aShortArray92[local129]]++;
			}
		}
		this.anInt6149 = this.anInt6180;
		@Pc(247) long[] local247 = new long[this.anInt6180];
		@Pc(259) boolean local259 = (this.anInt6175 & 0x100) != 0;
		@Pc(273) int local273;
		@Pc(286) int local286;
		@Pc(492) int local492;
		for (@Pc(261) int local261 = 0; local261 < this.anInt6180; local261++) {
			@Pc(269) int local269 = local127[local261];
			@Pc(271) Class32 local271 = null;
			local273 = 0;
			@Pc(275) byte local275 = 0;
			@Pc(277) byte local277 = 0;
			@Pc(279) byte local279 = 0;
			if (arg1.aClass74Array1 != null) {
				@Pc(284) boolean local284 = false;
				for (local286 = 0; local286 < arg1.aClass74Array1.length; local286++) {
					@Pc(293) Class74 local293 = arg1.aClass74Array1[local286];
					if (local293.anInt2328 == local269) {
						@Pc(306) Class64 local306 = Static421.method6218(local293.anInt2326);
						if (local306.aBoolean131) {
							local284 = true;
						}
						if (local306.anInt1656 != -1) {
							@Pc(322) Class32 local322 = local116.method1027(local306.anInt1656);
							if (local322.anInt861 == 2) {
								this.aBoolean487 = true;
							}
						}
					}
				}
				if (local284) {
					local247[local261] = Long.MAX_VALUE;
					this.anInt6149--;
					continue;
				}
			}
			@Pc(363) short local363 = -1;
			if (arg1.aShortArray101 != null) {
				local363 = arg1.aShortArray101[local269];
				if (local363 != -1) {
					local271 = local116.method1027(local363 & 0xFFFF);
					if ((this.anInt6189 & 0x40) != 0 && local271.aBoolean67) {
						local363 = -1;
						local271 = null;
					} else {
						local279 = local271.aByte19;
						if (local271.aByte22 != 0 || local271.aByte23 != 0) {
							this.aBoolean488 = true;
						}
						local277 = local271.aByte25;
					}
				}
			}
			@Pc(444) boolean local444 = arg1.aByteArray42 != null && arg1.aByteArray42[local269] != 0 || local271 != null && local271.anInt861 != 0;
			if ((local259 || local444) && arg1.aByteArray40 != null) {
				local273 += arg1.aByteArray40[local269] << 17;
			}
			if (local444) {
				local273 += 65536;
			}
			local273 += (local277 & 0xFF) << 8;
			local273 += local279 & 0xFF;
			local492 = local275 + ((local363 & 0xFFFF) << 16);
			@Pc(498) int local498 = local492 + (local261 & 0xFFFF);
			local247[local261] = (long) local498 + ((long) local273 << 32);
			this.aBoolean488 |= local271 != null && (local271.aByte22 != 0 || local271.aByte23 != 0);
			this.aBoolean487 |= local444;
		}
		Static329.method4894(local247, local127);
		this.aShortArray110 = arg1.aShortArray98;
		this.anInt6187 = arg1.anInt5129;
		this.anIntArray348 = arg1.anIntArray298;
		this.anIntArray350 = arg1.anIntArray302;
		this.anInt6167 = arg1.anInt5138;
		this.anIntArray349 = arg1.anIntArray304;
		this.aClass348Array5 = arg1.aClass348Array4;
		this.aClass156Array5 = arg1.aClass156Array4;
		@Pc(587) Class370[] local587 = new Class370[this.anInt6187];
		@Pc(607) int local607;
		@Pc(623) int local623;
		@Pc(670) int local670;
		if (arg1.aClass74Array1 != null) {
			this.anInt6181 = arg1.aClass74Array1.length;
			this.aClass231Array1 = new Class231[this.anInt6181];
			this.aClass303Array1 = new Class303[this.anInt6181];
			for (local607 = 0; local607 < this.anInt6181; local607++) {
				@Pc(616) Class74 local616 = arg1.aClass74Array1[local607];
				@Pc(621) Class64 local621 = Static421.method6218(local616.anInt2326);
				local623 = -1;
				for (@Pc(625) int local625 = 0; local625 < this.anInt6180; local625++) {
					if (local616.anInt2328 == local127[local625]) {
						local623 = local625;
						break;
					}
				}
				if (local623 == -1) {
					throw new RuntimeException();
				}
				local670 = Static305.anIntArray309[arg1.aShortArray100[local616.anInt2328] & 0xFFFF] & 0xFFFFFF;
				@Pc(689) int local689 = local670 | 255 - (arg1.aByteArray42 == null ? 0 : arg1.aByteArray42[local616.anInt2328]) << 24;
				this.aClass231Array1[local607] = new Class231(local623, arg1.aShortArray96[local616.anInt2328], arg1.aShortArray95[local616.anInt2328], arg1.aShortArray92[local616.anInt2328], local621.anInt1651, local621.anInt1657, local621.anInt1656, local621.anInt1654, local621.anInt1652, local621.aBoolean131, local621.aBoolean130, local616.anInt2331);
				this.aClass303Array1[local607] = new Class303(local689);
			}
		}
		local607 = this.anInt6180 * 3;
		this.aShortArray113 = new short[this.anInt6180];
		this.aShortArray112 = new short[local607];
		this.aByteArray49 = new byte[this.anInt6180];
		this.aShortArray119 = new short[local607];
		if (arg1.aShortArray97 != null) {
			this.aShortArray117 = new short[this.anInt6180];
		}
		this.aFloatArray54 = new float[local607];
		this.aShort82 = (short) arg3;
		this.aShortArray114 = new short[this.anInt6180];
		this.aShortArray120 = new short[local607];
		this.aByteArray48 = new byte[local607];
		this.aShortArray111 = new short[this.anInt6180];
		this.aFloatArray55 = new float[local607];
		this.aShortArray116 = new short[local607];
		this.aShortArray118 = new short[this.anInt6180];
		this.aShort83 = (short) arg4;
		this.aShortArray115 = new short[this.anInt6180];
		Static706.aLongArray25 = new long[local607];
		local273 = 0;
		for (local492 = 0; local492 < arg1.anInt5129; local492++) {
			local623 = this.anIntArray347[local492];
			this.anIntArray347[local492] = local273;
			local587[local492] = new Class370();
			local273 += local623;
		}
		this.anIntArray347[arg1.anInt5129] = local273;
		@Pc(875) Class254 local875 = Static255.method3993(this.anInt6180, local127, arg1);
		@Pc(879) Class322[] local879 = new Class322[arg1.anInt5135];
		@Pc(921) int local921;
		@Pc(931) int local931;
		@Pc(952) int local952;
		@Pc(963) int local963;
		@Pc(972) int local972;
		@Pc(981) int local981;
		@Pc(900) short local900;
		@Pc(911) int local911;
		for (local670 = 0; local670 < arg1.anInt5135; local670++) {
			@Pc(890) short local890 = arg1.aShortArray96[local670];
			@Pc(895) short local895 = arg1.aShortArray95[local670];
			local900 = arg1.aShortArray92[local670];
			local911 = this.anIntArray348[local895] - this.anIntArray348[local890];
			local921 = this.anIntArray349[local895] - this.anIntArray349[local890];
			local931 = this.anIntArray350[local895] - this.anIntArray350[local890];
			@Pc(942) int local942 = this.anIntArray348[local900] - this.anIntArray348[local890];
			local952 = this.anIntArray349[local900] - this.anIntArray349[local890];
			local963 = this.anIntArray350[local900] - this.anIntArray350[local890];
			local972 = local963 * local921 - local931 * local952;
			local981 = local942 * local931 - local963 * local911;
			@Pc(990) int local990 = local911 * local952 - local942 * local921;
			while (local972 > 8192 || local981 > 8192 || local990 > 8192 || local972 < -8192 || local981 < -8192 || local990 < -8192) {
				local972 >>= 0x1;
				local990 >>= 0x1;
				local981 >>= 0x1;
			}
			@Pc(1047) int local1047 = (int) Math.sqrt((double) (local972 * local972 + local981 * local981 + local990 * local990));
			if (local1047 <= 0) {
				local1047 = 1;
			}
			local972 = local972 * 256 / local1047;
			local981 = local981 * 256 / local1047;
			local990 = local990 * 256 / local1047;
			@Pc(1083) byte local1083 = arg1.aByteArray36 == null ? 0 : arg1.aByteArray36[local670];
			if (local1083 == 0) {
				@Pc(1118) Class370 local1118 = local587[local890];
				local1118.anInt10432 += local972;
				local1118.anInt10436 += local990;
				local1118.anInt10433 += local981;
				local1118.anInt10435++;
				@Pc(1146) Class370 local1146 = local587[local895];
				local1146.anInt10436 += local990;
				local1146.anInt10435++;
				local1146.anInt10433 += local981;
				local1146.anInt10432 += local972;
				@Pc(1174) Class370 local1174 = local587[local900];
				local1174.anInt10436 += local990;
				local1174.anInt10432 += local972;
				local1174.anInt10433 += local981;
				local1174.anInt10435++;
			} else if (local1083 == 1) {
				@Pc(1103) Class322 local1103 = local879[local670] = new Class322();
				local1103.anInt9254 = local981;
				local1103.anInt9250 = local972;
				local1103.anInt9255 = local990;
			}
		}
		@Pc(1213) int local1213;
		@Pc(1257) short local1257;
		for (local286 = 0; local286 < this.anInt6180; local286++) {
			local1213 = local127[local286];
			@Pc(1220) int local1220 = arg1.aShortArray100[local1213] & 0xFFFF;
			if (arg1.aByteArray37 == null) {
				local911 = -1;
			} else {
				local911 = arg1.aByteArray37[local1213];
			}
			if (arg1.aByteArray42 == null) {
				local921 = 0;
			} else {
				local921 = arg1.aByteArray42[local1213] & 0xFF;
			}
			local1257 = arg1.aShortArray101 == null ? -1 : arg1.aShortArray101[local1213];
			if (local1257 != -1 && (this.anInt6189 & 0x40) != 0) {
				@Pc(1274) Class32 local1274 = local116.method1027(local1257 & 0xFFFF);
				if (local1274.aBoolean67) {
					local1257 = -1;
				}
			}
			@Pc(1281) float local1281 = 0.0F;
			@Pc(1283) float local1283 = 0.0F;
			@Pc(1285) float local1285 = 0.0F;
			@Pc(1287) float local1287 = 0.0F;
			@Pc(1289) float local1289 = 0.0F;
			@Pc(1291) float local1291 = 0.0F;
			@Pc(1293) byte local1293 = 0;
			@Pc(1295) byte local1295 = 0;
			@Pc(1297) int local1297 = 0;
			@Pc(1315) byte local1315;
			@Pc(1332) short local1332;
			@Pc(2150) short local2150;
			@Pc(2155) short local2155;
			if (local1257 != -1) {
				if (local911 == -1) {
					local1283 = 1.0F;
					local1287 = 1.0F;
					local1293 = 1;
					local1285 = 1.0F;
					local1291 = 0.0F;
					local1281 = 0.0F;
					local1289 = 0.0F;
					local1295 = 2;
				} else {
					local911 &= 0xFF;
					local1315 = arg1.aByteArray41[local911];
					@Pc(1322) short local1322;
					@Pc(1327) short local1327;
					@Pc(1365) float local1365;
					@Pc(1376) float local1376;
					@Pc(1470) float local1470;
					@Pc(1718) float local1718;
					@Pc(1726) float local1726;
					@Pc(1734) float local1734;
					@Pc(1757) float local1757;
					@Pc(1780) float local1780;
					@Pc(1803) float local1803;
					if (local1315 == 0) {
						local1322 = arg1.aShortArray96[local1213];
						local1327 = arg1.aShortArray95[local1213];
						local1332 = arg1.aShortArray92[local1213];
						local2150 = arg1.aShortArray93[local911];
						local2155 = arg1.aShortArray94[local911];
						@Pc(2160) short local2160 = arg1.aShortArray99[local911];
						@Pc(2166) float local2166 = (float) arg1.anIntArray298[local2150];
						@Pc(2172) float local2172 = (float) arg1.anIntArray304[local2150];
						local1365 = (float) arg1.anIntArray302[local2150];
						local1376 = (float) arg1.anIntArray298[local2155] - local2166;
						local1470 = (float) arg1.anIntArray304[local2155] - local2172;
						@Pc(2203) float local2203 = (float) arg1.anIntArray302[local2155] - local1365;
						@Pc(2211) float local2211 = (float) arg1.anIntArray298[local2160] - local2166;
						@Pc(2219) float local2219 = (float) arg1.anIntArray304[local2160] - local2172;
						@Pc(2228) float local2228 = (float) arg1.anIntArray302[local2160] - local1365;
						@Pc(2236) float local2236 = (float) arg1.anIntArray298[local1322] - local2166;
						@Pc(2245) float local2245 = (float) arg1.anIntArray304[local1322] - local2172;
						@Pc(2254) float local2254 = (float) arg1.anIntArray302[local1322] - local1365;
						@Pc(2262) float local2262 = (float) arg1.anIntArray298[local1327] - local2166;
						@Pc(2271) float local2271 = (float) arg1.anIntArray304[local1327] - local2172;
						local1718 = (float) arg1.anIntArray302[local1327] - local1365;
						local1726 = (float) arg1.anIntArray298[local1332] - local2166;
						local1734 = (float) arg1.anIntArray304[local1332] - local2172;
						local1757 = (float) arg1.anIntArray302[local1332] - local1365;
						local1780 = local1470 * local2228 - local2219 * local2203;
						local1803 = local2203 * local2211 - local2228 * local1376;
						@Pc(2329) float local2329 = local1376 * local2219 - local1470 * local2211;
						@Pc(2337) float local2337 = local2219 * local2329 - local2228 * local1803;
						@Pc(2345) float local2345 = local1780 * local2228 - local2211 * local2329;
						@Pc(2353) float local2353 = local1803 * local2211 - local1780 * local2219;
						@Pc(2367) float local2367 = 1.0F / (local2353 * local2203 + local1470 * local2345 + local2337 * local1376);
						local1285 = (local1718 * local2353 + local2262 * local2337 + local2271 * local2345) * local2367;
						local1281 = local2367 * (local2337 * local2236 + local2245 * local2345 + local2254 * local2353);
						local1289 = local2367 * (local2353 * local1757 + local2337 * local1726 + local1734 * local2345);
						@Pc(2418) float local2418 = local2203 * local1780 - local1376 * local2329;
						@Pc(2426) float local2426 = local1470 * local2329 - local1803 * local2203;
						@Pc(2435) float local2435 = local1376 * local1803 - local1470 * local1780;
						@Pc(2449) float local2449 = 1.0F / (local2228 * local2435 + local2211 * local2426 + local2219 * local2418);
						local1283 = (local2236 * local2426 + local2418 * local2245 + local2254 * local2435) * local2449;
						local1287 = (local2271 * local2418 + local2426 * local2262 + local1718 * local2435) * local2449;
						local1291 = (local1734 * local2418 + local2426 * local1726 + local1757 * local2435) * local2449;
					} else {
						local1322 = arg1.aShortArray96[local1213];
						local1327 = arg1.aShortArray95[local1213];
						local1332 = arg1.aShortArray92[local1213];
						@Pc(1337) int local1337 = local875.anIntArray401[local911];
						@Pc(1342) int local1342 = local875.anIntArray400[local911];
						@Pc(1347) int local1347 = local875.anIntArray402[local911];
						@Pc(1352) float[] local1352 = local875.aFloatArrayArray12[local911];
						@Pc(1357) byte local1357 = arg1.aByteArray39[local911];
						local1365 = (float) arg1.anIntArray297[local911] / 256.0F;
						if (local1315 == 1) {
							local1376 = (float) arg1.anIntArray295[local911] / 1024.0F;
							Static309.method4678(local1365, Static436.aFloatArray74, local1352, local1342, arg1.anIntArray304[local1322], local1337, local1347, local1376, arg1.anIntArray298[local1322], arg1.anIntArray302[local1322], local1357);
							local1281 = Static436.aFloatArray74[0];
							local1283 = Static436.aFloatArray74[1];
							Static309.method4678(local1365, Static436.aFloatArray74, local1352, local1342, arg1.anIntArray304[local1327], local1337, local1347, local1376, arg1.anIntArray298[local1327], arg1.anIntArray302[local1327], local1357);
							local1287 = Static436.aFloatArray74[1];
							local1285 = Static436.aFloatArray74[0];
							Static309.method4678(local1365, Static436.aFloatArray74, local1352, local1342, arg1.anIntArray304[local1332], local1337, local1347, local1376, arg1.anIntArray298[local1332], arg1.anIntArray302[local1332], local1357);
							local1289 = Static436.aFloatArray74[0];
							local1291 = Static436.aFloatArray74[1];
							local1470 = local1376 / 2.0F;
							if ((local1357 & 0x1) == 0) {
								if (local1285 - local1281 > local1470) {
									local1293 = 1;
									local1285 -= local1376;
								} else if (local1470 < local1281 - local1285) {
									local1285 += local1376;
									local1293 = 2;
								}
								if (local1289 - local1281 > local1470) {
									local1289 -= local1376;
									local1295 = 1;
								} else if (local1470 < local1281 - local1289) {
									local1295 = 2;
									local1289 += local1376;
								}
							} else {
								if (local1470 < local1291 - local1283) {
									local1295 = 1;
									local1291 -= local1376;
								} else if (local1283 - local1291 > local1470) {
									local1295 = 2;
									local1291 += local1376;
								}
								if (local1470 < local1287 - local1283) {
									local1293 = 1;
									local1287 -= local1376;
								} else if (local1470 < local1283 - local1287) {
									local1287 += local1376;
									local1293 = 2;
								}
							}
						} else if (local1315 == 2) {
							local1376 = (float) arg1.anIntArray296[local911] / 256.0F;
							local1470 = (float) arg1.anIntArray300[local911] / 256.0F;
							@Pc(1629) int local1629 = arg1.anIntArray298[local1327] - arg1.anIntArray298[local1322];
							@Pc(1640) int local1640 = arg1.anIntArray304[local1327] - arg1.anIntArray304[local1322];
							@Pc(1651) int local1651 = arg1.anIntArray302[local1327] - arg1.anIntArray302[local1322];
							@Pc(1662) int local1662 = arg1.anIntArray298[local1332] - arg1.anIntArray298[local1322];
							@Pc(1672) int local1672 = arg1.anIntArray304[local1332] - arg1.anIntArray304[local1322];
							@Pc(1683) int local1683 = arg1.anIntArray302[local1332] - arg1.anIntArray302[local1322];
							@Pc(1692) int local1692 = local1683 * local1640 - local1672 * local1651;
							@Pc(1701) int local1701 = local1651 * local1662 - local1683 * local1629;
							@Pc(1710) int local1710 = local1629 * local1672 - local1662 * local1640;
							local1718 = 64.0F / (float) arg1.anIntArray294[local911];
							local1726 = 64.0F / (float) arg1.anIntArray301[local911];
							local1734 = 64.0F / (float) arg1.anIntArray295[local911];
							local1757 = (local1352[2] * (float) local1710 + local1352[1] * (float) local1701 + (float) local1692 * local1352[0]) / local1718;
							local1780 = ((float) local1710 * local1352[5] + (float) local1701 * local1352[4] + (float) local1692 * local1352[3]) / local1726;
							local1803 = (local1352[8] * (float) local1710 + (float) local1692 * local1352[6] + (float) local1701 * local1352[7]) / local1734;
							local1297 = Static551.method7774(local1757, local1780, local1803);
							Static204.method3023(Static436.aFloatArray74, arg1.anIntArray304[local1322], local1297, local1470, local1352, local1365, arg1.anIntArray302[local1322], local1376, local1342, local1357, arg1.anIntArray298[local1322], local1337, local1347);
							local1281 = Static436.aFloatArray74[0];
							local1283 = Static436.aFloatArray74[1];
							Static204.method3023(Static436.aFloatArray74, arg1.anIntArray304[local1327], local1297, local1470, local1352, local1365, arg1.anIntArray302[local1327], local1376, local1342, local1357, arg1.anIntArray298[local1327], local1337, local1347);
							local1285 = Static436.aFloatArray74[0];
							local1287 = Static436.aFloatArray74[1];
							Static204.method3023(Static436.aFloatArray74, arg1.anIntArray304[local1332], local1297, local1470, local1352, local1365, arg1.anIntArray302[local1332], local1376, local1342, local1357, arg1.anIntArray298[local1332], local1337, local1347);
							local1291 = Static436.aFloatArray74[1];
							local1289 = Static436.aFloatArray74[0];
						} else if (local1315 == 3) {
							Static213.method3322(arg1.anIntArray298[local1322], local1357, local1342, Static436.aFloatArray74, local1365, local1337, local1347, arg1.anIntArray302[local1322], local1352, arg1.anIntArray304[local1322]);
							local1283 = Static436.aFloatArray74[1];
							local1281 = Static436.aFloatArray74[0];
							Static213.method3322(arg1.anIntArray298[local1327], local1357, local1342, Static436.aFloatArray74, local1365, local1337, local1347, arg1.anIntArray302[local1327], local1352, arg1.anIntArray304[local1327]);
							local1285 = Static436.aFloatArray74[0];
							local1287 = Static436.aFloatArray74[1];
							Static213.method3322(arg1.anIntArray298[local1332], local1357, local1342, Static436.aFloatArray74, local1365, local1337, local1347, arg1.anIntArray302[local1332], local1352, arg1.anIntArray304[local1332]);
							local1289 = Static436.aFloatArray74[0];
							local1291 = Static436.aFloatArray74[1];
							if ((local1357 & 0x1) == 0) {
								if (local1289 - local1281 > 0.5F) {
									local1295 = 1;
									local1289--;
								} else if (local1281 - local1289 > 0.5F) {
									local1295 = 2;
									local1289++;
								}
								if (local1285 - local1281 > 0.5F) {
									local1293 = 1;
									local1285--;
								} else if (local1281 - local1285 > 0.5F) {
									local1285++;
									local1293 = 2;
								}
							} else {
								if (local1287 - local1283 > 0.5F) {
									local1293 = 1;
									local1287--;
								} else if (local1283 - local1287 > 0.5F) {
									local1287++;
									local1293 = 2;
								}
								if (local1291 - local1283 > 0.5F) {
									local1295 = 1;
									local1291--;
								} else if (local1283 - local1291 > 0.5F) {
									local1291++;
									local1295 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray36 == null) {
				local1315 = 0;
			} else {
				local1315 = arg1.aByteArray36[local1213];
			}
			if (local1315 == 0) {
				@Pc(2679) long local2679 = ((long) (local1297 << 24) + (long) (local1220 << 8) + (long) local921 << 32) + (long) (local911 << 2);
				local1332 = arg1.aShortArray96[local1213];
				local2150 = arg1.aShortArray95[local1213];
				local2155 = arg1.aShortArray92[local1213];
				@Pc(2698) Class370 local2698 = local587[local1332];
				this.aShortArray118[local286] = this.method5249(arg1, local2698.anInt10435, local2679, local1332, local2698.anInt10436, local1281, local2698.anInt10433, local2698.anInt10432, local1283);
				@Pc(2722) Class370 local2722 = local587[local2150];
				this.aShortArray113[local286] = this.method5249(arg1, local2722.anInt10435, local2679 + (long) local1293, local2150, local2722.anInt10436, local1285, local2722.anInt10433, local2722.anInt10432, local1287);
				@Pc(2749) Class370 local2749 = local587[local2155];
				this.aShortArray114[local286] = this.method5249(arg1, local2749.anInt10435, (long) local1295 + local2679, local2155, local2749.anInt10436, local1289, local2749.anInt10433, local2749.anInt10432, local1291);
			} else if (local1315 == 1) {
				@Pc(2537) Class322 local2537 = local879[local1213];
				@Pc(2585) long local2585 = (long) ((local911 << 2) + (local2537.anInt9250 > 0 ? 1024 : 2048) + (local2537.anInt9254 + 256 << 12) + (local2537.anInt9255 + 256 << 22)) + ((long) (local1220 << 8) + (long) (local1297 << 24) + (long) local921 << 32);
				this.aShortArray118[local286] = this.method5249(arg1, 0, local2585, arg1.aShortArray96[local1213], local2537.anInt9255, local1281, local2537.anInt9254, local2537.anInt9250, local1283);
				this.aShortArray113[local286] = this.method5249(arg1, 0, (long) local1293 + local2585, arg1.aShortArray95[local1213], local2537.anInt9255, local1285, local2537.anInt9254, local2537.anInt9250, local1287);
				this.aShortArray114[local286] = this.method5249(arg1, 0, (long) local1295 + local2585, arg1.aShortArray92[local1213], local2537.anInt9255, local1289, local2537.anInt9254, local2537.anInt9250, local1291);
			}
			if (arg1.aByteArray42 != null) {
				this.aByteArray49[local286] = arg1.aByteArray42[local1213];
			}
			if (arg1.aShortArray97 != null) {
				this.aShortArray117[local286] = arg1.aShortArray97[local1213];
			}
			this.aShortArray111[local286] = arg1.aShortArray100[local1213];
			this.aShortArray115[local286] = local1257;
		}
		local1213 = 0;
		local900 = -10000;
		for (local911 = 0; local911 < this.anInt6149; local911++) {
			@Pc(2835) short local2835 = this.aShortArray115[local911];
			if (local900 != local2835) {
				local900 = local2835;
				local1213++;
			}
		}
		this.anIntArray351 = new int[local1213 + 1];
		local1213 = 0;
		local900 = -10000;
		for (local921 = 0; local921 < this.anInt6149; local921++) {
			local1257 = this.aShortArray115[local921];
			if (local900 != local1257) {
				this.anIntArray351[local1213++] = local921;
				local900 = local1257;
			}
		}
		this.anIntArray351[local1213] = this.anInt6149;
		Static706.aLongArray25 = null;
		this.aShortArray119 = Static568.method9093(this.anInt6155, this.aShortArray119);
		this.aShortArray116 = Static568.method9093(this.anInt6155, this.aShortArray116);
		this.aShortArray120 = Static568.method9093(this.anInt6155, this.aShortArray120);
		this.aByteArray48 = Static204.method3024(this.anInt6155, this.aByteArray48);
		this.aFloatArray54 = Static135.method2224(this.anInt6155, this.aFloatArray54);
		this.aFloatArray55 = Static135.method2224(this.anInt6155, this.aFloatArray55);
		if (arg1.anIntArray303 != null && Static689.method4218(this.anInt6189, arg2)) {
			this.anIntArrayArray34 = arg1.method4273(false);
		}
		if (arg1.aClass74Array1 != null && Static378.method5697(this.anInt6189, arg2)) {
			this.anIntArrayArray33 = arg1.method4275();
		}
		if (arg1.anIntArray299 != null && Static410.method6125(arg2, this.anInt6189)) {
			local931 = 0;
			@Pc(3006) int[] local3006 = new int[256];
			for (local952 = 0; local952 < this.anInt6180; local952++) {
				local963 = arg1.anIntArray299[local127[local952]];
				if (local963 >= 0) {
					@Pc(3026) int local3026 = local3006[local963]++;
					if (local963 > local931) {
						local931 = local963;
					}
				}
			}
			this.anIntArrayArray35 = new int[local931 + 1][];
			for (local963 = 0; local963 <= local931; local963++) {
				this.anIntArrayArray35[local963] = new int[local3006[local963]];
				local3006[local963] = 0;
			}
			for (local972 = 0; local972 < this.anInt6180; local972++) {
				local981 = arg1.anIntArray299[local127[local972]];
				if (local981 >= 0) {
					this.anIntArrayArray35[local981][local3006[local981]++] = local972;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean488;
	}

	@OriginalMember(owner = "client!lia", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean489) {
			this.method5240();
		}
		return this.aShort86;
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(ZI)V")
	private void method5235(@OriginalArg(0) boolean arg0) {
		if (this.aClass67_Sub2_24.aClass3_Sub28_Sub1_3.aByteArray50.length < this.anInt6149 * 6) {
			this.aClass67_Sub2_24.aClass3_Sub28_Sub1_3 = new Class3_Sub28_Sub1(this.anInt6149 * 6 + 600);
		} else {
			this.aClass67_Sub2_24.aClass3_Sub28_Sub1_3.anInt6241 = 0;
		}
		@Pc(54) Class3_Sub28_Sub1 local54 = this.aClass67_Sub2_24.aClass3_Sub28_Sub1_3;
		@Pc(60) int local60;
		if (this.aClass67_Sub2_24.aBoolean322) {
			for (local60 = 0; local60 < this.anInt6149; local60++) {
				local54.method5282(this.aShortArray118[local60]);
				local54.method5282(this.aShortArray113[local60]);
				local54.method5282(this.aShortArray114[local60]);
			}
		} else {
			for (local60 = 0; local60 < this.anInt6149; local60++) {
				local54.method5280(this.aShortArray118[local60]);
				local54.method5280(this.aShortArray113[local60]);
				local54.method5280(this.aShortArray114[local60]);
			}
		}
		if (local54.anInt6241 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface11_4 == null) {
				this.anInterface11_4 = this.aClass67_Sub2_24.method3274(local54.aByteArray50, local54.anInt6241, true);
			} else {
				this.anInterface11_4.method2434(local54.aByteArray50, local54.anInt6241);
			}
			this.aClass374_1.anInterface11_5 = this.anInterface11_4;
		} else {
			this.aClass374_1.anInterface11_5 = this.aClass67_Sub2_24.method3274(local54.aByteArray50, local54.anInt6241, false);
		}
		if (!arg0) {
			this.aBoolean486 = true;
		}
	}

	@OriginalMember(owner = "client!lia", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub2_Sub21.anIntArray358[arg0];
		@Pc(13) int local13 = Class3_Sub2_Sub21.anIntArray356[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6187; local15++) {
			@Pc(35) int local35 = this.anIntArray348[local15] * local13 + this.anIntArray349[local15] * local9 >> 14;
			this.anIntArray349[local15] = this.anIntArray349[local15] * local13 - local9 * this.anIntArray348[local15] >> 14;
			this.anIntArray348[local15] = local35;
		}
		this.aBoolean489 = false;
		if (this.aClass229_11 != null) {
			this.aClass229_11.anInterface24_5 = null;
		}
	}

	@OriginalMember(owner = "client!lia", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean489) {
			this.method5240();
		}
		return this.aShort81;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method5231(@OriginalArg(0) Class157 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class157_Sub3 local8 = (Class157_Sub3) arg0;
		if (this.anInt6180 == 0 || local8.anInt6180 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt6187;
		@Pc(24) int[] local24 = local8.anIntArray348;
		@Pc(27) int[] local27 = local8.anIntArray349;
		@Pc(30) int[] local30 = local8.anIntArray350;
		@Pc(33) short[] local33 = local8.aShortArray119;
		@Pc(36) short[] local36 = local8.aShortArray116;
		@Pc(39) short[] local39 = local8.aShortArray120;
		@Pc(42) byte[] local42 = local8.aByteArray48;
		@Pc(57) short[] local57;
		@Pc(53) short[] local53;
		@Pc(61) short[] local61;
		@Pc(49) byte[] local49;
		if (this.aClass295_1 == null) {
			local49 = null;
			local61 = null;
			local57 = null;
			local53 = null;
		} else {
			local49 = this.aClass295_1.aByteArray91;
			local53 = this.aClass295_1.aShortArray137;
			local57 = this.aClass295_1.aShortArray138;
			local61 = this.aClass295_1.aShortArray139;
		}
		@Pc(80) short[] local80;
		@Pc(78) short[] local78;
		@Pc(82) short[] local82;
		@Pc(76) byte[] local76;
		if (local8.aClass295_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local82 = local8.aClass295_1.aShortArray139;
			local78 = local8.aClass295_1.aShortArray137;
			local80 = local8.aClass295_1.aShortArray138;
			local76 = local8.aClass295_1.aByteArray91;
		}
		@Pc(103) int[] local103 = local8.anIntArray347;
		@Pc(106) short[] local106 = local8.aShortArray112;
		if (!local8.aBoolean489) {
			local8.method5240();
		}
		@Pc(117) short local117 = local8.aShort81;
		@Pc(120) short local120 = local8.aShort79;
		@Pc(123) short local123 = local8.aShort84;
		@Pc(126) short local126 = local8.aShort85;
		@Pc(129) short local129 = local8.lb;
		@Pc(132) short local132 = local8.aShort80;
		for (@Pc(134) int local134 = 0; local134 < this.anInt6187; local134++) {
			@Pc(143) int local143 = this.anIntArray349[local134] - arg2;
			if (local117 <= local143 && local143 <= local120) {
				@Pc(167) int local167 = this.anIntArray348[local134] - arg1;
				if (local167 >= local123 && local167 <= local126) {
					@Pc(190) int local190 = this.anIntArray350[local134] - arg3;
					if (local129 <= local190 && local132 >= local190) {
						@Pc(204) int local204 = -1;
						@Pc(209) int local209 = this.anIntArray347[local134];
						@Pc(216) int local216 = this.anIntArray347[local134 + 1];
						for (@Pc(218) int local218 = local209; local218 < local216; local218++) {
							local204 = this.aShortArray112[local218] - 1;
							if (local204 == -1 || this.aByteArray48[local204] != 0) {
								break;
							}
						}
						if (local204 != -1) {
							for (@Pc(260) int local260 = 0; local260 < local21; local260++) {
								if (local167 == local24[local260] && local30[local260] == local190 && local143 == local27[local260]) {
									local216 = local103[local260 + 1];
									@Pc(295) int local295 = -1;
									local209 = local103[local260];
									for (@Pc(301) int local301 = local209; local301 < local216; local301++) {
										local295 = local106[local301] - 1;
										if (local295 == -1 || local42[local295] != 0) {
											break;
										}
									}
									if (local295 != -1) {
										if (local57 == null) {
											this.aClass295_1 = new Class295();
											local57 = this.aClass295_1.aShortArray138 = Static371.method5359(this.aShortArray119);
											local53 = this.aClass295_1.aShortArray137 = Static371.method5359(this.aShortArray116);
											local61 = this.aClass295_1.aShortArray139 = Static371.method5359(this.aShortArray120);
											local49 = this.aClass295_1.aByteArray91 = Static309.method4679(this.aByteArray48);
										}
										if (local80 == null) {
											@Pc(388) Class295 local388 = local8.aClass295_1 = new Class295();
											local80 = local388.aShortArray138 = Static371.method5359(local33);
											local78 = local388.aShortArray137 = Static371.method5359(local36);
											local82 = local388.aShortArray139 = Static371.method5359(local39);
											local76 = local388.aByteArray91 = Static309.method4679(local42);
										}
										@Pc(421) short local421 = this.aShortArray119[local204];
										@Pc(426) short local426 = this.aShortArray116[local204];
										@Pc(431) short local431 = this.aShortArray120[local204];
										local216 = local103[local260 + 1];
										local209 = local103[local260];
										@Pc(446) byte local446 = this.aByteArray48[local204];
										@Pc(456) int local456;
										for (@Pc(448) int local448 = local209; local448 < local216; local448++) {
											local456 = local106[local448] - 1;
											if (local456 == -1) {
												break;
											}
											if (local76[local456] != 0) {
												local80[local456] += local421;
												local78[local456] += local426;
												local82[local456] += local431;
												local76[local456] += local446;
											}
										}
										local421 = local33[local295];
										local216 = this.anIntArray347[local134 + 1];
										local431 = local39[local295];
										local446 = local42[local295];
										local426 = local36[local295];
										local209 = this.anIntArray347[local134];
										for (local456 = local209; local456 < local216; local456++) {
											@Pc(545) int local545 = this.aShortArray112[local456] - 1;
											if (local545 == -1) {
												break;
											}
											if (local49[local545] != 0) {
												local57[local545] += local421;
												local53[local545] += local426;
												local61[local545] += local431;
												local49[local545] += local446;
											}
										}
										if (this.aClass229_12 == null && this.aClass229_10 != null) {
											this.aClass229_10.anInterface24_5 = null;
										}
										if (this.aClass229_12 != null) {
											this.aClass229_12.anInterface24_5 = null;
										}
										if (local8.aClass229_12 == null && local8.aClass229_10 != null) {
											local8.aClass229_10.anInterface24_5 = null;
										}
										if (local8.aClass229_12 != null) {
											local8.aClass229_12.anInterface24_5 = null;
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

	@OriginalMember(owner = "client!lia", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub2_Sub21.anIntArray358[arg0];
		@Pc(13) int local13 = Class3_Sub2_Sub21.anIntArray356[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6187; local15++) {
			local34 = this.anIntArray350[local15] * local9 + this.anIntArray348[local15] * local13 >> 14;
			this.anIntArray350[local15] = this.anIntArray350[local15] * local13 - this.anIntArray348[local15] * local9 >> 14;
			this.anIntArray348[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt6155; local34++) {
			@Pc(92) int local92 = this.aShortArray119[local34] * local13 + this.aShortArray120[local34] * local9 >> 14;
			this.aShortArray120[local34] = (short) (local13 * this.aShortArray120[local34] - local9 * this.aShortArray119[local34] >> 14);
			this.aShortArray119[local34] = (short) local92;
		}
		if (this.aClass229_12 == null && this.aClass229_10 != null) {
			this.aClass229_10.anInterface24_5 = null;
		}
		if (this.aClass229_12 != null) {
			this.aClass229_12.anInterface24_5 = null;
		}
		this.aBoolean489 = false;
		if (this.aClass229_11 != null) {
			this.aClass229_11.anInterface24_5 = null;
		}
	}

	@OriginalMember(owner = "client!lia", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class313 arg2, @OriginalArg(3) Class313 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean489) {
			this.method5240();
		}
		@Pc(19) int local19 = arg4 + this.aShort84;
		@Pc(24) int local24 = this.aShort85 + arg4;
		@Pc(30) int local30 = arg6 + this.lb;
		@Pc(35) int local35 = arg6 + this.aShort80;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local19 < 0 || arg2.anInt10875 <= arg2.anInt10871 + local24 >> arg2.anInt10873 || local30 < 0 || arg2.anInt10872 <= local35 + arg2.anInt10871 >> arg2.anInt10873)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local19 < 0 || arg3.anInt10875 <= local24 + arg3.anInt10871 >> arg3.anInt10873 || local30 < 0 || arg3.anInt10872 <= arg3.anInt10871 + local35 >> arg3.anInt10873) {
				return;
			}
		} else {
			local19 >>= arg2.anInt10873;
			local24 = arg2.anInt10871 + local24 - 1 >> arg2.anInt10873;
			local30 >>= arg2.anInt10873;
			local35 = local35 + arg2.anInt10871 - 1 >> arg2.anInt10873;
			if (arg5 == arg2.method9095(local30, local19) && arg2.method9095(local30, local24) == arg5 && arg2.method9095(local35, local19) == arg5 && arg5 == arg2.method9095(local35, local24)) {
				return;
			}
		}
		@Pc(235) int local235;
		if (arg0 == 1) {
			for (local235 = 0; local235 < this.anInt6187; local235++) {
				this.anIntArray349[local235] = this.anIntArray349[local235] + arg2.method9096(arg4 + this.anIntArray348[local235], this.anIntArray350[local235] + arg6) - arg5;
			}
		} else {
			@Pc(297) int local297;
			@Pc(308) int local308;
			if (arg0 == 2) {
				@Pc(291) short local291 = this.aShort81;
				if (local291 == 0) {
					return;
				}
				for (local297 = 0; local297 < this.anInt6187; local297++) {
					local308 = (this.anIntArray349[local297] << 16) / local291;
					if (local308 < arg1) {
						this.anIntArray349[local297] += (arg1 - local308) * (-arg5 + arg2.method9096(arg4 + this.anIntArray348[local297], arg6 + this.anIntArray350[local297])) / arg1;
					}
				}
			} else {
				@Pc(390) int local390;
				if (arg0 == 3) {
					local235 = (arg1 & 0xFF) * 4;
					local297 = (arg1 >> 8 & 0xFF) * 4;
					local308 = (arg1 >> 16 & 0xFF) << 6;
					local390 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local235 >> 1) < 0 || arg2.anInt10875 << arg2.anInt10873 <= arg2.anInt10871 + arg4 + (local235 >> 1) || arg6 - (local297 >> 1) < 0 || arg2.anInt10871 + (local297 >> 1) + arg6 >= arg2.anInt10872 << arg2.anInt10873) {
						return;
					}
					this.method5228(arg4, local235, local297, local390, arg6, local308, arg5, arg2);
				} else if (arg0 == 4) {
					local235 = this.aShort79 - this.aShort81;
					for (local297 = 0; local297 < this.anInt6187; local297++) {
						this.anIntArray349[local297] = this.anIntArray349[local297] + arg3.method9096(this.anIntArray348[local297] + arg4, arg6 + this.anIntArray350[local297]) + local235 - arg5;
					}
				} else if (arg0 == 5) {
					local235 = this.aShort79 - this.aShort81;
					for (local297 = 0; local297 < this.anInt6187; local297++) {
						local308 = arg4 + this.anIntArray348[local297];
						local390 = arg6 + this.anIntArray350[local297];
						@Pc(556) int local556 = arg2.method9096(local308, local390);
						@Pc(562) int local562 = arg3.method9096(local308, local390);
						@Pc(569) int local569 = local556 - local562 - arg1;
						this.anIntArray349[local297] = (local569 * ((this.anIntArray349[local297] << 8) / local235) >> 8) + (local556 - arg5);
					}
				}
			}
		}
		this.aBoolean489 = false;
		if (this.aClass229_11 != null) {
			this.aClass229_11.anInterface24_5 = null;
		}
	}

	@OriginalMember(owner = "client!lia", name = "f", descriptor = "()Z")
	@Override
	public boolean method5224() {
		if (this.aShortArray115 == null) {
			return true;
		}
		for (@Pc(13) int local13 = 0; local13 < this.aShortArray115.length; local13++) {
			if (this.aShortArray115[local13] != -1 && !this.aClass67_Sub2_24.anInterface2_11.method1024(this.aShortArray115[local13])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lia", name = "e", descriptor = "()[Lclient!sw;")
	@Override
	public Class348[] method5222() {
		return this.aClass348Array5;
	}

	@OriginalMember(owner = "client!lia", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6187; local3++) {
			if (arg0 != 128) {
				this.anIntArray348[local3] = this.anIntArray348[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray349[local3] = this.anIntArray349[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray350[local3] = arg2 * this.anIntArray350[local3] >> 7;
			}
		}
		this.aBoolean489 = false;
		if (this.aClass229_11 != null) {
			this.aClass229_11.anInterface24_5 = null;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(BLclient!nh;)V")
	private void method5236(@OriginalArg(1) Class3_Sub4_Sub13_Sub2 arg0) {
		if (this.anInt6155 > this.aClass67_Sub2_24.anIntArray197.length) {
			this.aClass67_Sub2_24.anIntArray197 = new int[this.anInt6155];
			this.aClass67_Sub2_24.anIntArray196 = new int[this.anInt6155];
		}
		@Pc(30) int[] local30 = this.aClass67_Sub2_24.anIntArray197;
		@Pc(34) int[] local34 = this.aClass67_Sub2_24.anIntArray196;
		@Pc(65) int local65;
		@Pc(103) int local103;
		@Pc(112) int local112;
		for (@Pc(36) int local36 = 0; local36 < this.anInt6187; local36++) {
			local65 = (this.anIntArray348[local36] - (this.anIntArray349[local36] * this.aClass67_Sub2_24.anInt3901 >> 8) >> this.aClass67_Sub2_24.anInt3875) - arg0.anInt7462;
			@Pc(89) int local89 = (this.anIntArray350[local36] - (this.aClass67_Sub2_24.anInt3894 * this.anIntArray349[local36] >> 8) >> this.aClass67_Sub2_24.anInt3875) - arg0.anInt7455;
			@Pc(94) int local94 = this.anIntArray347[local36];
			@Pc(101) int local101 = this.anIntArray347[local36 + 1];
			for (local103 = local94; local103 < local101; local103++) {
				local112 = this.aShortArray112[local103] - 1;
				if (local112 == -1) {
					break;
				}
				local30[local112] = local65;
				local34[local112] = local89;
			}
		}
		if (-119 <= -120) {
			this.method5239(76);
		}
		for (local65 = 0; local65 < this.anInt6149; local65++) {
			if (this.aByteArray49 == null || this.aByteArray49[local65] <= 128) {
				@Pc(178) short local178 = this.aShortArray118[local65];
				@Pc(183) short local183 = this.aShortArray113[local65];
				@Pc(188) short local188 = this.aShortArray114[local65];
				local103 = local30[local178];
				local112 = local30[local183];
				@Pc(200) int local200 = local30[local188];
				@Pc(204) int local204 = local34[local178];
				@Pc(208) int local208 = local34[local183];
				@Pc(212) int local212 = local34[local188];
				if ((local208 - local212) * (local103 - local112) - (local208 - local204) * (-local112 + local200) > 0) {
					arg0.method6239(local200, local212, local112, local204, local208, local103);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort82 = (short) arg0;
		if (this.aClass229_10 != null) {
			this.aClass229_10.anInterface24_5 = null;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(ZZLclient!lia;Lclient!lia;II)Lclient!ka;")
	private Class157 method5237(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class157_Sub3 arg2, @OriginalArg(3) Class157_Sub3 arg3, @OriginalArg(4) int arg4) {
		arg3.anInt6189 = this.anInt6189;
		arg3.anInt6175 = arg4;
		if ((arg4 & 0x100) == 0) {
			arg3.aBoolean487 = this.aBoolean487;
		} else {
			arg3.aBoolean487 = true;
		}
		arg3.anInt6181 = this.anInt6181;
		arg3.anInt6149 = this.anInt6149;
		arg3.aByte92 = 0;
		arg3.aShort82 = this.aShort82;
		arg3.aBoolean488 = this.aBoolean488;
		arg3.anInt6187 = this.anInt6187;
		arg3.anInt6180 = this.anInt6180;
		arg3.aShort83 = this.aShort83;
		arg3.anInt6167 = this.anInt6167;
		arg3.anInt6155 = this.anInt6155;
		@Pc(89) boolean local89 = Static414.method6155(this.anInt6189, arg4);
		@Pc(95) boolean local95 = Static597.method8214(arg4, this.anInt6189);
		@Pc(101) boolean local101 = Static691.method9067(this.anInt6189, arg4);
		@Pc(107) boolean local107 = local89 | local95 | local101;
		@Pc(244) int local244;
		if (local107) {
			if (!local89) {
				arg3.anIntArray348 = this.anIntArray348;
			} else if (arg2.anIntArray348 == null || this.anInt6167 > arg2.anIntArray348.length) {
				arg3.anIntArray348 = arg2.anIntArray348 = new int[this.anInt6167];
			} else {
				arg3.anIntArray348 = arg2.anIntArray348;
			}
			if (!local95) {
				arg3.anIntArray349 = this.anIntArray349;
			} else if (arg2.anIntArray349 == null || this.anInt6167 > arg2.anIntArray349.length) {
				arg3.anIntArray349 = arg2.anIntArray349 = new int[this.anInt6167];
			} else {
				arg3.anIntArray349 = arg2.anIntArray349;
			}
			if (!local101) {
				arg3.anIntArray350 = this.anIntArray350;
			} else if (arg2.anIntArray350 == null || arg2.anIntArray350.length < this.anInt6167) {
				arg3.anIntArray350 = arg2.anIntArray350 = new int[this.anInt6167];
			} else {
				arg3.anIntArray350 = arg2.anIntArray350;
			}
			for (local244 = 0; local244 < this.anInt6167; local244++) {
				if (local89) {
					arg3.anIntArray348[local244] = this.anIntArray348[local244];
				}
				if (local95) {
					arg3.anIntArray349[local244] = this.anIntArray349[local244];
				}
				if (local101) {
					arg3.anIntArray350[local244] = this.anIntArray350[local244];
				}
			}
		} else {
			arg3.anIntArray348 = this.anIntArray348;
			arg3.anIntArray350 = this.anIntArray350;
			arg3.anIntArray349 = this.anIntArray349;
		}
		if (Static381.method5735(arg4, this.anInt6189)) {
			arg3.aClass229_11 = arg2.aClass229_11;
			if (arg1) {
				arg3.aByte92 = (byte) (arg3.aByte92 | 0x1);
			}
			arg3.aClass229_11.anInterface24_5 = this.aClass229_11.anInterface24_5;
			arg3.aClass229_11.aByte90 = this.aClass229_11.aByte90;
		} else if (Static244.method3738(arg4, this.anInt6189)) {
			arg3.aClass229_11 = this.aClass229_11;
		} else {
			arg3.aClass229_11 = null;
		}
		if (Static632.method8567(arg4, this.anInt6189)) {
			if (arg2.aShortArray111 == null || arg2.aShortArray111.length < this.anInt6180) {
				arg3.aShortArray111 = arg2.aShortArray111 = new short[this.anInt6180];
			} else {
				arg3.aShortArray111 = arg2.aShortArray111;
			}
			for (local244 = 0; local244 < this.anInt6180; local244++) {
				arg3.aShortArray111[local244] = this.aShortArray111[local244];
			}
		} else {
			arg3.aShortArray111 = this.aShortArray111;
		}
		if (Static189.method2879(arg4, this.anInt6189)) {
			if (arg2.aByteArray49 == null || this.anInt6180 > arg2.aByteArray49.length) {
				arg3.aByteArray49 = arg2.aByteArray49 = new byte[this.anInt6180];
			} else {
				arg3.aByteArray49 = arg2.aByteArray49;
			}
			for (local244 = 0; local244 < this.anInt6180; local244++) {
				arg3.aByteArray49[local244] = this.aByteArray49[local244];
			}
		} else {
			arg3.aByteArray49 = this.aByteArray49;
		}
		if (Static161.method2562(this.anInt6189, arg4)) {
			if (arg1) {
				arg3.aByte92 = (byte) (arg3.aByte92 | 0x2);
			}
			arg3.aClass229_10 = arg2.aClass229_10;
			arg3.aClass229_10.aByte90 = this.aClass229_10.aByte90;
			arg3.aClass229_10.anInterface24_5 = this.aClass229_10.anInterface24_5;
		} else if (Static14.method271(arg4, this.anInt6189)) {
			arg3.aClass229_10 = this.aClass229_10;
		} else {
			arg3.aClass229_10 = null;
		}
		@Pc(712) int local712;
		if (Static645.method8717(this.anInt6189, arg4)) {
			if (arg2.aShortArray119 == null || arg2.aShortArray119.length < this.anInt6155) {
				local244 = this.anInt6155;
				arg3.aShortArray116 = arg2.aShortArray116 = new short[local244];
				arg3.aShortArray119 = arg2.aShortArray119 = new short[local244];
				arg3.aShortArray120 = arg2.aShortArray120 = new short[local244];
			} else {
				arg3.aShortArray119 = arg2.aShortArray119;
				arg3.aShortArray116 = arg2.aShortArray116;
				arg3.aShortArray120 = arg2.aShortArray120;
			}
			if (this.aClass295_1 == null) {
				for (local244 = 0; local244 < this.anInt6155; local244++) {
					arg3.aShortArray119[local244] = this.aShortArray119[local244];
					arg3.aShortArray116[local244] = this.aShortArray116[local244];
					arg3.aShortArray120[local244] = this.aShortArray120[local244];
				}
			} else {
				if (arg2.aClass295_1 == null) {
					arg2.aClass295_1 = new Class295();
				}
				@Pc(694) Class295 local694 = arg3.aClass295_1 = arg2.aClass295_1;
				if (local694.aShortArray138 == null || local694.aShortArray138.length < this.anInt6155) {
					local712 = this.anInt6155;
					local694.aShortArray139 = new short[local712];
					local694.aShortArray137 = new short[local712];
					local694.aByteArray91 = new byte[local712];
					local694.aShortArray138 = new short[local712];
				}
				for (local712 = 0; local712 < this.anInt6155; local712++) {
					arg3.aShortArray119[local712] = this.aShortArray119[local712];
					arg3.aShortArray116[local712] = this.aShortArray116[local712];
					arg3.aShortArray120[local712] = this.aShortArray120[local712];
					local694.aShortArray138[local712] = this.aClass295_1.aShortArray138[local712];
					local694.aShortArray137[local712] = this.aClass295_1.aShortArray137[local712];
					local694.aShortArray139[local712] = this.aClass295_1.aShortArray139[local712];
					local694.aByteArray91[local712] = this.aClass295_1.aByteArray91[local712];
				}
			}
			arg3.aByteArray48 = this.aByteArray48;
		} else {
			arg3.aByteArray48 = this.aByteArray48;
			arg3.aShortArray116 = this.aShortArray116;
			arg3.aShortArray120 = this.aShortArray120;
			arg3.aShortArray119 = this.aShortArray119;
			arg3.aClass295_1 = this.aClass295_1;
		}
		if (Static255.method3997(this.anInt6189, arg4)) {
			arg3.aClass229_12 = arg2.aClass229_12;
			if (arg1) {
				arg3.aByte92 = (byte) (arg3.aByte92 | 0x4);
			}
			arg3.aClass229_12.aByte90 = this.aClass229_12.aByte90;
			arg3.aClass229_12.anInterface24_5 = this.aClass229_12.anInterface24_5;
		} else if (Static540.method7593(this.anInt6189, arg4)) {
			arg3.aClass229_12 = this.aClass229_12;
		} else {
			arg3.aClass229_12 = null;
		}
		if (Static393.method5917(this.anInt6189, arg4)) {
			if (arg2.aFloatArray54 == null || arg2.aFloatArray54.length < this.anInt6180) {
				local244 = this.anInt6155;
				arg3.aFloatArray54 = arg2.aFloatArray54 = new float[local244];
				arg3.aFloatArray55 = arg2.aFloatArray55 = new float[local244];
			} else {
				arg3.aFloatArray55 = arg2.aFloatArray55;
				arg3.aFloatArray54 = arg2.aFloatArray54;
			}
			for (local244 = 0; local244 < this.anInt6155; local244++) {
				arg3.aFloatArray54[local244] = this.aFloatArray54[local244];
				arg3.aFloatArray55[local244] = this.aFloatArray55[local244];
			}
		} else {
			arg3.aFloatArray55 = this.aFloatArray55;
			arg3.aFloatArray54 = this.aFloatArray54;
		}
		if (Static288.method4390(this.anInt6189, arg4)) {
			arg3.aClass229_9 = arg2.aClass229_9;
			if (arg1) {
				arg3.aByte92 = (byte) (arg3.aByte92 | 0x8);
			}
			arg3.aClass229_9.anInterface24_5 = this.aClass229_9.anInterface24_5;
			arg3.aClass229_9.aByte90 = this.aClass229_9.aByte90;
		} else if (Static609.method8333(arg4, this.anInt6189)) {
			arg3.aClass229_9 = this.aClass229_9;
		} else {
			arg3.aClass229_9 = null;
		}
		if (Static480.method7028(arg4, this.anInt6189)) {
			if (arg2.aShortArray118 == null || this.anInt6180 > arg2.aShortArray118.length) {
				local244 = this.anInt6180;
				arg3.aShortArray114 = arg2.aShortArray114 = new short[local244];
				arg3.aShortArray118 = arg2.aShortArray118 = new short[local244];
				arg3.aShortArray113 = arg2.aShortArray113 = new short[local244];
			} else {
				arg3.aShortArray114 = arg2.aShortArray114;
				arg3.aShortArray118 = arg2.aShortArray118;
				arg3.aShortArray113 = arg2.aShortArray113;
			}
			for (local244 = 0; local244 < this.anInt6180; local244++) {
				arg3.aShortArray118[local244] = this.aShortArray118[local244];
				arg3.aShortArray113[local244] = this.aShortArray113[local244];
				arg3.aShortArray114[local244] = this.aShortArray114[local244];
			}
		} else {
			arg3.aShortArray118 = this.aShortArray118;
			arg3.aShortArray114 = this.aShortArray114;
			arg3.aShortArray113 = this.aShortArray113;
		}
		if (Static143.method2370(this.anInt6189, arg4)) {
			if (arg1) {
				arg3.aByte92 = (byte) (arg3.aByte92 | 0x10);
			}
			arg3.aClass374_1 = arg2.aClass374_1;
			arg3.aClass374_1.anInterface11_5 = this.aClass374_1.anInterface11_5;
		} else if (Static163.method2626(this.anInt6189, arg4)) {
			arg3.aClass374_1 = this.aClass374_1;
		} else {
			arg3.aClass374_1 = null;
		}
		if (Static700.method9155(this.anInt6189, arg4)) {
			if (arg2.aShortArray115 == null || this.anInt6180 > arg2.aShortArray115.length) {
				local244 = this.anInt6180;
				arg3.aShortArray115 = arg2.aShortArray115 = new short[local244];
			} else {
				arg3.aShortArray115 = arg2.aShortArray115;
			}
			for (local244 = 0; local244 < this.anInt6180; local244++) {
				arg3.aShortArray115[local244] = this.aShortArray115[local244];
			}
		} else {
			arg3.aShortArray115 = this.aShortArray115;
		}
		if (!Static616.method8388(arg4, this.anInt6189)) {
			arg3.aClass303Array1 = this.aClass303Array1;
		} else if (arg2.aClass303Array1 == null || this.anInt6181 > arg2.aClass303Array1.length) {
			local244 = this.anInt6181;
			arg3.aClass303Array1 = arg2.aClass303Array1 = new Class303[local244];
			for (local712 = 0; local712 < this.anInt6181; local712++) {
				arg3.aClass303Array1[local712] = this.aClass303Array1[local712].method7427();
			}
		} else {
			arg3.aClass303Array1 = arg2.aClass303Array1;
			for (local244 = 0; local244 < this.anInt6181; local244++) {
				arg3.aClass303Array1[local244].method7428(this.aClass303Array1[local244]);
			}
		}
		arg3.aClass231Array1 = this.aClass231Array1;
		arg3.anIntArrayArray33 = this.anIntArrayArray33;
		arg3.anIntArrayArray34 = this.anIntArrayArray34;
		arg3.anIntArray347 = this.anIntArray347;
		arg3.anIntArrayArray35 = this.anIntArrayArray35;
		arg3.aShortArray110 = this.aShortArray110;
		if (this.aBoolean489) {
			arg3.lb = this.lb;
			arg3.aShort84 = this.aShort84;
			arg3.aShort78 = this.aShort78;
			arg3.aShort86 = this.aShort86;
			arg3.aShort81 = this.aShort81;
			arg3.aShort79 = this.aShort79;
			arg3.aShort85 = this.aShort85;
			arg3.aShort80 = this.aShort80;
			arg3.aBoolean489 = true;
		} else {
			arg3.aBoolean489 = false;
		}
		arg3.aClass156Array5 = this.aClass156Array5;
		arg3.aShortArray112 = this.aShortArray112;
		arg3.aShortArray117 = this.aShortArray117;
		arg3.aClass348Array5 = this.aClass348Array5;
		arg3.anIntArray351 = this.anIntArray351;
		return arg3;
	}

	@OriginalMember(owner = "client!lia", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6187; local3++) {
			this.anIntArray350[local3] = -this.anIntArray350[local3];
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt6155; local27++) {
			this.aShortArray120[local27] = (short) -this.aShortArray120[local27];
		}
		for (@Pc(50) int local50 = 0; local50 < this.anInt6180; local50++) {
			@Pc(61) short local61 = this.aShortArray118[local50];
			this.aShortArray118[local50] = this.aShortArray114[local50];
			this.aShortArray114[local50] = local61;
		}
		if (this.aClass229_12 == null && this.aClass229_10 != null) {
			this.aClass229_10.anInterface24_5 = null;
		}
		if (this.aClass229_12 != null) {
			this.aClass229_12.anInterface24_5 = null;
		}
		if (this.aClass229_11 != null) {
			this.aClass229_11.anInterface24_5 = null;
		}
		this.aBoolean489 = false;
		if (this.aClass374_1 != null) {
			this.aClass374_1.anInterface11_5 = null;
		}
	}

	@OriginalMember(owner = "client!lia", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort82;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(B[B)V")
	@Override
	public void method5210(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(9) int local9;
		if (arg1 == null) {
			for (local9 = 0; local9 < this.anInt6180; local9++) {
				this.aByteArray49[local9] = arg0;
			}
		} else {
			for (local9 = 0; local9 < this.anInt6180; local9++) {
				@Pc(56) int local56 = 255 - (255 - (arg0 & 0xFF)) * (255 - (arg1[local9] & 0xFF)) / 255;
				this.aByteArray49[local9] = (byte) local56;
			}
		}
		if (this.aClass229_10 != null) {
			this.aClass229_10.anInterface24_5 = null;
		}
	}

	@OriginalMember(owner = "client!lia", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean489) {
			this.method5240();
		}
		return this.aShort85;
	}

	@OriginalMember(owner = "client!lia", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static175.anInt10582 = 0;
			Static206.anInt11288 = 0;
			Static218.anInt4240 = 0;
			local15 = 0;
			for (local17 = 0; local17 < this.anInt6187; local17++) {
				Static175.anInt10582 += this.anIntArray348[local17];
				Static218.anInt4240 += this.anIntArray349[local17];
				local15++;
				Static206.anInt11288 += this.anIntArray350[local17];
			}
			if (local15 <= 0) {
				Static206.anInt11288 = arg3;
				Static175.anInt10582 = arg1;
				Static218.anInt4240 = arg2;
			} else {
				Static218.anInt4240 = Static218.anInt4240 / local15 + arg2;
				Static206.anInt11288 = arg3 + Static206.anInt11288 / local15;
				Static175.anInt10582 = arg1 + Static175.anInt10582 / local15;
			}
		} else if (arg0 == 1) {
			for (local15 = 0; local15 < this.anInt6187; local15++) {
				this.anIntArray348[local15] += arg1;
				this.anIntArray349[local15] += arg2;
				this.anIntArray350[local15] += arg3;
			}
		} else {
			@Pc(178) int local178;
			@Pc(196) int local196;
			if (arg0 == 2) {
				for (local15 = 0; local15 < this.anInt6187; local15++) {
					this.anIntArray348[local15] -= Static175.anInt10582;
					this.anIntArray349[local15] -= Static218.anInt4240;
					this.anIntArray350[local15] -= Static206.anInt11288;
					if (arg3 != 0) {
						local17 = Class3_Sub2_Sub21.anIntArray358[arg3];
						local178 = Class3_Sub2_Sub21.anIntArray356[arg3];
						local196 = local178 * this.anIntArray348[local15] + this.anIntArray349[local15] * local17 + 16383 >> 14;
						this.anIntArray349[local15] = this.anIntArray349[local15] * local178 + 16383 - this.anIntArray348[local15] * local17 >> 14;
						this.anIntArray348[local15] = local196;
					}
					if (arg1 != 0) {
						local17 = Class3_Sub2_Sub21.anIntArray358[arg1];
						local178 = Class3_Sub2_Sub21.anIntArray356[arg1];
						local196 = local178 * this.anIntArray349[local15] + 16383 - local17 * this.anIntArray350[local15] >> 14;
						this.anIntArray350[local15] = local178 * this.anIntArray350[local15] + local17 * this.anIntArray349[local15] + 16383 >> 14;
						this.anIntArray349[local15] = local196;
					}
					if (arg2 != 0) {
						local17 = Class3_Sub2_Sub21.anIntArray358[arg2];
						local178 = Class3_Sub2_Sub21.anIntArray356[arg2];
						local196 = local17 * this.anIntArray350[local15] + this.anIntArray348[local15] * local178 + 16383 >> 14;
						this.anIntArray350[local15] = local178 * this.anIntArray350[local15] + 16383 - local17 * this.anIntArray348[local15] >> 14;
						this.anIntArray348[local15] = local196;
					}
					this.anIntArray348[local15] += Static175.anInt10582;
					this.anIntArray349[local15] += Static218.anInt4240;
					this.anIntArray350[local15] += Static206.anInt11288;
				}
			} else if (arg0 == 3) {
				for (local15 = 0; local15 < this.anInt6187; local15++) {
					this.anIntArray348[local15] -= Static175.anInt10582;
					this.anIntArray349[local15] -= Static218.anInt4240;
					this.anIntArray350[local15] -= Static206.anInt11288;
					this.anIntArray348[local15] = arg1 * this.anIntArray348[local15] / 128;
					this.anIntArray349[local15] = arg2 * this.anIntArray349[local15] / 128;
					this.anIntArray350[local15] = this.anIntArray350[local15] * arg3 / 128;
					this.anIntArray348[local15] += Static175.anInt10582;
					this.anIntArray349[local15] += Static218.anInt4240;
					this.anIntArray350[local15] += Static206.anInt11288;
				}
			} else {
				@Pc(551) Class231 local551;
				@Pc(556) Class303 local556;
				if (arg0 == 5) {
					for (local15 = 0; local15 < this.anInt6180; local15++) {
						local17 = (this.aByteArray49[local15] & 0xFF) + (arg1 * 8);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray49[local15] = (byte) local17;
					}
					if (this.aClass229_10 != null) {
						this.aClass229_10.anInterface24_5 = null;
					}
					if (this.aClass231Array1 != null) {
						for (local17 = 0; local17 < this.anInt6181; local17++) {
							local551 = this.aClass231Array1[local17];
							local556 = this.aClass303Array1[local17];
							local556.anInt8869 = local556.anInt8869 & 0xFFFFFF | 255 - (this.aByteArray49[local551.anInt6303] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local15 = 0; local15 < this.anInt6180; local15++) {
						local17 = this.aShortArray111[local15] & 0xFFFF;
						local178 = local17 >> 10 & 0x3F;
						local196 = local17 >> 7 & 0x7;
						@Pc(620) int local620 = local178 + arg1 & 0x3F;
						local196 += arg2 / 4;
						@Pc(630) int local630 = local17 & 0x7F;
						local630 += arg3;
						if (local196 < 0) {
							local196 = 0;
						} else if (local196 > 7) {
							local196 = 7;
						}
						if (local630 < 0) {
							local630 = 0;
						} else if (local630 > 127) {
							local630 = 127;
						}
						this.aShortArray111[local15] = (short) (local620 << 10 | local196 << 7 | local630);
					}
					if (this.aClass229_10 != null) {
						this.aClass229_10.anInterface24_5 = null;
					}
					if (this.aClass231Array1 != null) {
						for (local17 = 0; local17 < this.anInt6181; local17++) {
							local551 = this.aClass231Array1[local17];
							local556 = this.aClass303Array1[local17];
							local556.anInt8869 = Static305.anIntArray309[this.aShortArray111[local551.anInt6303] & 0xFFFF] & 0xFFFFFF | local556.anInt8869 & 0xFF000000;
						}
					}
				} else {
					@Pc(756) Class303 local756;
					if (arg0 == 8) {
						for (local15 = 0; local15 < this.anInt6181; local15++) {
							local756 = this.aClass303Array1[local15];
							local756.anInt8868 += arg2;
							local756.anInt8871 += arg1;
						}
					} else if (arg0 == 10) {
						for (local15 = 0; local15 < this.anInt6181; local15++) {
							local756 = this.aClass303Array1[local15];
							local756.anInt8877 = arg1 * local756.anInt8877 >> 7;
							local756.anInt8875 = arg2 * local756.anInt8875 >> 7;
						}
					} else if (arg0 == 9) {
						for (local15 = 0; local15 < this.anInt6181; local15++) {
							local756 = this.aClass303Array1[local15];
							local756.anInt8872 = local756.anInt8872 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!iu;)V")
	@Override
	public void method5226(@OriginalArg(0) Class181 arg0) {
		@Pc(8) Class181_Sub2 local8 = (Class181_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass156Array5 != null) {
			for (local13 = 0; local13 < this.aClass156Array5.length; local13++) {
				@Pc(20) Class156 local20 = this.aClass156Array5[local13];
				@Pc(22) Class156 local22 = local20;
				if (local20.aClass156_2 != null) {
					local22 = local20.aClass156_2;
				}
				local22.anInt4584 = (int) (local8.aFloat129 + (float) this.anIntArray348[local20.anInt4597] * local8.aFloat138 + local8.aFloat134 * (float) this.anIntArray349[local20.anInt4597] + local8.aFloat139 * (float) this.anIntArray350[local20.anInt4597]);
				local22.anInt4592 = (int) (local8.aFloat137 + (float) this.anIntArray350[local20.anInt4597] * local8.aFloat130 + (float) this.anIntArray348[local20.anInt4597] * local8.aFloat140 + (float) this.anIntArray349[local20.anInt4597] * local8.aFloat131);
				local22.anInt4595 = (int) (local8.aFloat132 * (float) this.anIntArray348[local20.anInt4597] + (float) this.anIntArray349[local20.anInt4597] * local8.aFloat136 + local8.aFloat135 * (float) this.anIntArray350[local20.anInt4597] + local8.aFloat133);
				local22.anInt4596 = (int) (local8.aFloat129 + (float) this.anIntArray349[local20.anInt4586] * local8.aFloat134 + (float) this.anIntArray348[local20.anInt4586] * local8.aFloat138 + (float) this.anIntArray350[local20.anInt4586] * local8.aFloat139);
				local22.anInt4599 = (int) (local8.aFloat137 + (float) this.anIntArray350[local20.anInt4586] * local8.aFloat130 + local8.aFloat131 * (float) this.anIntArray349[local20.anInt4586] + local8.aFloat140 * (float) this.anIntArray348[local20.anInt4586]);
				local22.anInt4598 = (int) (local8.aFloat135 * (float) this.anIntArray350[local20.anInt4586] + (float) this.anIntArray348[local20.anInt4586] * local8.aFloat132 + local8.aFloat136 * (float) this.anIntArray349[local20.anInt4586] + local8.aFloat133);
				local22.anInt4590 = (int) (local8.aFloat139 * (float) this.anIntArray350[local20.anInt4588] + (float) this.anIntArray348[local20.anInt4588] * local8.aFloat138 + local8.aFloat134 * (float) this.anIntArray349[local20.anInt4588] + local8.aFloat129);
				local22.anInt4594 = (int) ((float) this.anIntArray349[local20.anInt4588] * local8.aFloat131 + local8.aFloat140 * (float) this.anIntArray348[local20.anInt4588] + (float) this.anIntArray350[local20.anInt4588] * local8.aFloat130 + local8.aFloat137);
				local22.anInt4587 = (int) (local8.aFloat133 + local8.aFloat132 * (float) this.anIntArray348[local20.anInt4588] + (float) this.anIntArray349[local20.anInt4588] * local8.aFloat136 + local8.aFloat135 * (float) this.anIntArray350[local20.anInt4588]);
			}
		}
		if (this.aClass348Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass348Array5.length; local13++) {
			@Pc(363) Class348 local363 = this.aClass348Array5[local13];
			@Pc(365) Class348 local365 = local363;
			if (local363.aClass348_2 != null) {
				local365 = local363.aClass348_2;
			}
			if (local363.aClass181_13 == null) {
				local363.aClass181_13 = local8.method6350();
			} else {
				local363.aClass181_13.method6355(local8);
			}
			local365.anInt9765 = (int) ((float) this.anIntArray348[local363.anInt9766] * local8.aFloat138 + local8.aFloat134 * (float) this.anIntArray349[local363.anInt9766] + local8.aFloat139 * (float) this.anIntArray350[local363.anInt9766] + local8.aFloat129);
			local365.anInt9763 = (int) ((float) this.anIntArray350[local363.anInt9766] * local8.aFloat130 + (float) this.anIntArray348[local363.anInt9766] * local8.aFloat140 + local8.aFloat131 * (float) this.anIntArray349[local363.anInt9766] + local8.aFloat137);
			local365.anInt9768 = (int) (local8.aFloat133 + (float) this.anIntArray350[local363.anInt9766] * local8.aFloat135 + local8.aFloat132 * (float) this.anIntArray348[local363.anInt9766] + (float) this.anIntArray349[local363.anInt9766] * local8.aFloat136);
		}
	}

	@OriginalMember(owner = "client!lia", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface2 local9 = this.aClass67_Sub2_24.anInterface2_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt6180; local11++) {
			if (this.aShortArray115[local11] == arg0) {
				this.aShortArray115[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(53) Class32 local53 = local9.method1027(arg0 & 0xFFFF);
			local41 = local53.aByte24;
			local39 = local53.aByte20;
		}
		@Pc(61) byte local61 = 0;
		@Pc(63) byte local63 = 0;
		if (arg1 != -1) {
			@Pc(74) Class32 local74 = local9.method1027(arg1 & 0xFFFF);
			if (local74.aByte22 != 0 || local74.aByte23 != 0) {
				this.aBoolean488 = true;
			}
			local63 = local74.aByte24;
			local61 = local74.aByte20;
		}
		if (!(local63 != local41 | local39 != local61)) {
			return;
		}
		if (this.aClass231Array1 != null) {
			for (@Pc(127) int local127 = 0; local127 < this.anInt6181; local127++) {
				@Pc(134) Class231 local134 = this.aClass231Array1[local127];
				@Pc(139) Class303 local139 = this.aClass303Array1[local127];
				local139.anInt8869 = local139.anInt8869 & 0xFF000000 | Static305.anIntArray309[this.aShortArray111[local134.anInt6303] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass229_10 != null) {
			this.aClass229_10.anInterface24_5 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IILclient!iu;ZI)Z")
	@Override
	public boolean method5218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method5245(arg1, arg2, arg0, -1, arg3, arg4);
	}

	@OriginalMember(owner = "client!lia", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6180; local7++) {
			if (this.aShortArray111[local7] == arg0) {
				this.aShortArray111[local7] = arg1;
			}
		}
		if (this.aClass231Array1 != null) {
			for (@Pc(42) int local42 = 0; local42 < this.anInt6181; local42++) {
				@Pc(49) Class231 local49 = this.aClass231Array1[local42];
				@Pc(54) Class303 local54 = this.aClass303Array1[local42];
				local54.anInt8869 = Static305.anIntArray309[this.aShortArray111[local49.anInt6303] & 0xFFFF] & 0xFFFFFF | local54.anInt8869 & 0xFF000000;
			}
		}
		if (this.aClass229_10 != null) {
			this.aClass229_10.anInterface24_5 = null;
		}
	}

	@OriginalMember(owner = "client!lia", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub2_Sub21.anIntArray358[arg0];
		@Pc(13) int local13 = Class3_Sub2_Sub21.anIntArray356[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6187; local15++) {
			@Pc(35) int local35 = this.anIntArray349[local15] * local13 - this.anIntArray350[local15] * local9 >> 14;
			this.anIntArray350[local15] = this.anIntArray349[local15] * local9 + this.anIntArray350[local15] * local13 >> 14;
			this.anIntArray349[local15] = local35;
		}
		this.aBoolean489 = false;
		if (this.aClass229_11 != null) {
			this.aClass229_11.anInterface24_5 = null;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		for (@Pc(3) int local3 = 0; local3 < this.anInt6180; local3++) {
			local14 = this.aShortArray111[local3] & 0xFFFF;
			@Pc(20) int local20 = local14 >> 10 & 0x3F;
			@Pc(26) int local26 = local14 >> 7 & 0x7;
			if (arg0 != -1) {
				local20 += arg3 * (arg0 - local20) >> 7;
			}
			if (arg1 != -1) {
				local26 += (arg1 - local26) * arg3 >> 7;
			}
			@Pc(59) int local59 = local14 & 0x7F;
			if (arg2 != -1) {
				local59 -= -(arg3 * (arg2 - local59) >> 7);
			}
			this.aShortArray111[local3] = (short) (local20 << 10 | local26 << 7 | local59);
		}
		if (this.aClass231Array1 != null) {
			for (local14 = 0; local14 < this.anInt6181; local14++) {
				@Pc(113) Class231 local113 = this.aClass231Array1[local14];
				@Pc(118) Class303 local118 = this.aClass303Array1[local14];
				local118.anInt8869 = Static305.anIntArray309[this.aShortArray111[local113.anInt6303] & 0xFFFF] & 0xFFFFFF | local118.anInt8869 & 0xFF000000;
			}
		}
		if (this.aClass229_10 != null) {
			this.aClass229_10.anInterface24_5 = null;
		}
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "()V")
	@Override
	public void method5225() {
		if (this.anInt6155 <= 0 || this.anInt6149 <= 0) {
			return;
		}
		this.method5243(false);
		if ((this.aByte92 & 0x10) == 0 && this.aClass374_1.anInterface11_5 == null) {
			this.method5235(false);
		}
		this.method5239(-5187);
	}

	@OriginalMember(owner = "client!lia", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt6175 = arg0;
		if (this.aClass295_1 != null && (this.anInt6175 & 0x10000) == 0) {
			this.aByteArray48 = this.aClass295_1.aByteArray91;
			this.aShortArray116 = this.aClass295_1.aShortArray137;
			this.aShortArray119 = this.aClass295_1.aShortArray138;
			this.aShortArray120 = this.aClass295_1.aShortArray139;
			this.aClass295_1 = null;
		}
		this.aBoolean486 = true;
		this.method5239(-5187);
	}

	@OriginalMember(owner = "client!lia", name = "g", descriptor = "()V")
	@Override
	protected void method5219() {
	}

	@OriginalMember(owner = "client!lia", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(65) int local65;
		@Pc(43) int local43;
		@Pc(59) int local59;
		@Pc(57) int[] local57;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			local27 = 0;
			Static218.anInt4240 = 0;
			Static206.anInt11288 = 0;
			Static175.anInt10582 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local43 = arg1[local35];
				if (this.anIntArrayArray34.length > local43) {
					local57 = this.anIntArrayArray34[local43];
					for (local59 = 0; local59 < local57.length; local59++) {
						local65 = local57[local59];
						if (this.aShortArray110 == null || (arg6 & this.aShortArray110[local65]) != 0) {
							Static175.anInt10582 += this.anIntArray348[local65];
							Static218.anInt4240 += this.anIntArray349[local65];
							Static206.anInt11288 += this.anIntArray350[local65];
							local27++;
						}
					}
				}
			}
			if (local27 <= 0) {
				Static175.anInt10582 = arg2;
				Static218.anInt4240 = arg3;
				Static206.anInt11288 = arg4;
			} else {
				Static175.anInt10582 = arg2 + Static175.anInt10582 / local27;
				Static206.anInt11288 = Static206.anInt11288 / local27 + arg4;
				Static699.aBoolean791 = true;
				Static218.anInt4240 = Static218.anInt4240 / local27 + arg3;
			}
			return;
		}
		@Pc(271) int[] local271;
		@Pc(273) int local273;
		if (arg0 == 1) {
			if (arg7 != null) {
				local27 = arg7[1] * arg3 + arg2 * arg7[0] + arg4 * arg7[2] + 8192 >> 14;
				local35 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 8192 >> 14;
				local43 = arg7[8] * arg4 + arg2 * arg7[6] + arg3 * arg7[7] + 8192 >> 14;
				arg4 = local43;
				arg3 = local35;
				arg2 = local27;
			}
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray34.length) {
					local271 = this.anIntArrayArray34[local35];
					for (local273 = 0; local273 < local271.length; local273++) {
						local59 = local271[local273];
						if (this.aShortArray110 == null || (this.aShortArray110[local59] & arg6) != 0) {
							this.anIntArray348[local59] += arg2;
							this.anIntArray349[local59] += arg3;
							this.anIntArray350[local59] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(399) int local399;
		@Pc(422) int local422;
		@Pc(444) int local444;
		@Pc(479) int local479;
		@Pc(483) int local483;
		@Pc(487) int local487;
		@Pc(491) int local491;
		@Pc(499) int local499;
		@Pc(507) int local507;
		@Pc(663) int local663;
		@Pc(688) int local688;
		@Pc(692) int local692;
		@Pc(700) int local700;
		@Pc(705) int local705;
		@Pc(709) int local709;
		@Pc(713) int local713;
		@Pc(715) int local715;
		@Pc(850) int[] local850;
		@Pc(852) int local852;
		@Pc(858) int local858;
		@Pc(862) int local862;
		@Pc(864) int local864;
		@Pc(1000) int local1000;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (this.anIntArrayArray34.length > local35) {
						local271 = this.anIntArrayArray34[local35];
						for (local273 = 0; local273 < local271.length; local273++) {
							local59 = local271[local273];
							if (this.aShortArray110 == null || (arg6 & this.aShortArray110[local59]) != 0) {
								this.anIntArray348[local59] -= Static175.anInt10582;
								this.anIntArray349[local59] -= Static218.anInt4240;
								this.anIntArray350[local59] -= Static206.anInt11288;
								if (arg4 != 0) {
									local65 = Class3_Sub2_Sub21.anIntArray358[arg4];
									local399 = Class3_Sub2_Sub21.anIntArray356[arg4];
									local422 = this.anIntArray349[local59] * local65 + local399 * this.anIntArray348[local59] + 16383 >> 14;
									this.anIntArray349[local59] = this.anIntArray349[local59] * local399 + 16383 - local65 * this.anIntArray348[local59] >> 14;
									this.anIntArray348[local59] = local422;
								}
								if (arg2 != 0) {
									local65 = Class3_Sub2_Sub21.anIntArray358[arg2];
									local399 = Class3_Sub2_Sub21.anIntArray356[arg2];
									local422 = local399 * this.anIntArray349[local59] + 16383 - this.anIntArray350[local59] * local65 >> 14;
									this.anIntArray350[local59] = local399 * this.anIntArray350[local59] + this.anIntArray349[local59] * local65 + 16383 >> 14;
									this.anIntArray349[local59] = local422;
								}
								if (arg3 != 0) {
									local65 = Class3_Sub2_Sub21.anIntArray358[arg3];
									local399 = Class3_Sub2_Sub21.anIntArray356[arg3];
									local422 = this.anIntArray350[local59] * local65 + local399 * this.anIntArray348[local59] + 16383 >> 14;
									this.anIntArray350[local59] = this.anIntArray350[local59] * local399 + 16383 - local65 * this.anIntArray348[local59] >> 14;
									this.anIntArray348[local59] = local422;
								}
								this.anIntArray348[local59] += Static175.anInt10582;
								this.anIntArray349[local59] += Static218.anInt4240;
								this.anIntArray350[local59] += Static206.anInt11288;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (this.anIntArrayArray34.length > local43) {
							local57 = this.anIntArrayArray34[local43];
							for (local59 = 0; local59 < local57.length; local59++) {
								local65 = local57[local59];
								if (this.aShortArray110 == null || (arg6 & this.aShortArray110[local65]) != 0) {
									local399 = this.anIntArray347[local65];
									local422 = this.anIntArray347[local65 + 1];
									for (local444 = local399; local444 < local422; local444++) {
										local479 = this.aShortArray112[local444] - 1;
										if (local479 == -1) {
											break;
										}
										if (arg4 != 0) {
											local483 = Class3_Sub2_Sub21.anIntArray358[arg4];
											local487 = Class3_Sub2_Sub21.anIntArray356[arg4];
											local491 = local483 * this.aShortArray116[local479] + local487 * this.aShortArray119[local479] + 16383 >> 14;
											this.aShortArray116[local479] = (short) (this.aShortArray116[local479] * local487 + 16383 - local483 * this.aShortArray119[local479] >> 14);
											this.aShortArray119[local479] = (short) local491;
										}
										if (arg2 != 0) {
											local483 = Class3_Sub2_Sub21.anIntArray358[arg2];
											local487 = Class3_Sub2_Sub21.anIntArray356[arg2];
											local491 = this.aShortArray116[local479] * local487 + 16383 - local483 * this.aShortArray120[local479] >> 14;
											this.aShortArray120[local479] = (short) (local483 * this.aShortArray116[local479] + local487 * this.aShortArray120[local479] + 16383 >> 14);
											this.aShortArray116[local479] = (short) local491;
										}
										if (arg3 != 0) {
											local483 = Class3_Sub2_Sub21.anIntArray358[arg3];
											local487 = Class3_Sub2_Sub21.anIntArray356[arg3];
											local491 = this.aShortArray119[local479] * local487 + this.aShortArray120[local479] * local483 + 16383 >> 14;
											this.aShortArray120[local479] = (short) (this.aShortArray120[local479] * local487 + 16383 - this.aShortArray119[local479] * local483 >> 14);
											this.aShortArray119[local479] = (short) local491;
										}
									}
								}
							}
						}
					}
					if (this.aClass229_12 == null && this.aClass229_10 != null) {
						this.aClass229_10.anInterface24_5 = null;
					}
					if (this.aClass229_12 != null) {
						this.aClass229_12.anInterface24_5 = null;
					}
				}
			} else {
				local27 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local43 = arg7[11] << 4;
				local273 = arg7[12] << 4;
				local59 = arg7[13] << 4;
				local65 = arg7[14] << 4;
				if (Static699.aBoolean791) {
					local399 = Static218.anInt4240 * arg7[3] + arg7[0] * Static175.anInt10582 + Static206.anInt11288 * arg7[6] + 8192 >> 14;
					local422 = arg7[1] * Static175.anInt10582 + arg7[4] * Static218.anInt4240 + arg7[7] * Static206.anInt11288 + 8192 >> 14;
					local444 = arg7[8] * Static206.anInt11288 + arg7[5] * Static218.anInt4240 + Static175.anInt10582 * arg7[2] + 8192 >> 14;
					local422 += local59;
					local399 += local273;
					local444 += local65;
					Static218.anInt4240 = local422;
					Static175.anInt10582 = local399;
					Static206.anInt11288 = local444;
					Static699.aBoolean791 = false;
				}
				@Pc(467) int[] local467 = new int[9];
				local422 = Class3_Sub2_Sub21.anIntArray356[arg2];
				local444 = Class3_Sub2_Sub21.anIntArray358[arg2];
				local479 = Class3_Sub2_Sub21.anIntArray356[arg3];
				local483 = Class3_Sub2_Sub21.anIntArray358[arg3];
				local487 = Class3_Sub2_Sub21.anIntArray356[arg4];
				local491 = Class3_Sub2_Sub21.anIntArray358[arg4];
				local499 = local487 * local444 + 8192 >> 14;
				local507 = local444 * local491 + 8192 >> 14;
				local467[8] = local422 * local479 + 8192 >> 14;
				local467[1] = local491 * -local479 + local499 * local483 + 8192 >> 14;
				local467[0] = local479 * local487 + local507 * local483 + 8192 >> 14;
				local467[6] = local487 * -local483 + local507 * local479 + 8192 >> 14;
				local467[4] = local422 * local487 + 8192 >> 14;
				local467[5] = -local444;
				local467[7] = local479 * local499 + local491 * local483 + 8192 >> 14;
				local467[3] = local491 * local422 + 8192 >> 14;
				local467[2] = local422 * local483 + 8192 >> 14;
				@Pc(637) int local637 = -Static206.anInt11288 * local467[2] + -Static218.anInt4240 * local467[1] + -Static175.anInt10582 * local467[0] + 8192 >> 14;
				local663 = -Static218.anInt4240 * local467[4] + -Static175.anInt10582 * local467[3] + local467[5] * -Static206.anInt11288 + 8192 >> 14;
				local688 = local467[8] * -Static206.anInt11288 + -Static175.anInt10582 * local467[6] + -Static218.anInt4240 * local467[7] + 8192 >> 14;
				local692 = Static175.anInt10582 + local637;
				@Pc(696) int local696 = Static218.anInt4240 + local663;
				local700 = Static206.anInt11288 + local688;
				@Pc(703) int[] local703 = new int[9];
				for (local705 = 0; local705 < 3; local705++) {
					for (local709 = 0; local709 < 3; local709++) {
						local713 = 0;
						for (local715 = 0; local715 < 3; local715++) {
							local713 += arg7[local715 + local709 * 3] * local467[local705 * 3 + local715];
						}
						local703[local709 + local705 * 3] = local713 + 8192 >> 14;
					}
				}
				local709 = local467[2] * local65 + local59 * local467[1] + local273 * local467[0] + 8192 >> 14;
				local713 = local467[5] * local65 + local273 * local467[3] + local59 * local467[4] + 8192 >> 14;
				local709 += local692;
				local713 += local696;
				local715 = local467[8] * local65 + local467[6] * local273 + local467[7] * local59 + 8192 >> 14;
				local715 += local700;
				local850 = new int[9];
				for (local852 = 0; local852 < 3; local852++) {
					for (local858 = 0; local858 < 3; local858++) {
						local862 = 0;
						for (local864 = 0; local864 < 3; local864++) {
							local862 += local703[local858 + local864 * 3] * arg7[local852 * 3 + local864];
						}
						local850[local858 + local852 * 3] = local862 + 8192 >> 14;
					}
				}
				local858 = arg7[0] * local709 + arg7[1] * local713 + local715 * arg7[2] + 8192 >> 14;
				local862 = local715 * arg7[5] + arg7[4] * local713 + local709 * arg7[3] + 8192 >> 14;
				local862 += local35;
				local864 = arg7[7] * local713 + arg7[6] * local709 + arg7[8] * local715 + 8192 >> 14;
				local858 += local27;
				local864 += local43;
				for (local1000 = 0; local1000 < local8; local1000++) {
					@Pc(1008) int local1008 = arg1[local1000];
					if (this.anIntArrayArray34.length > local1008) {
						@Pc(1018) int[] local1018 = this.anIntArrayArray34[local1008];
						for (@Pc(1020) int local1020 = 0; local1020 < local1018.length; local1020++) {
							@Pc(1026) int local1026 = local1018[local1020];
							if (this.aShortArray110 == null || (this.aShortArray110[local1026] & arg6) != 0) {
								@Pc(1073) int local1073 = this.anIntArray348[local1026] * local850[0] + local850[1] * this.anIntArray349[local1026] + this.anIntArray350[local1026] * local850[2] + 8192 >> 14;
								@Pc(1105) int local1105 = local850[4] * this.anIntArray349[local1026] + local850[3] * this.anIntArray348[local1026] + this.anIntArray350[local1026] * local850[5] + 8192 >> 14;
								@Pc(1109) int local1109 = local1073 + local858;
								@Pc(1140) int local1140 = local850[8] * this.anIntArray350[local1026] + local850[6] * this.anIntArray348[local1026] + this.anIntArray349[local1026] * local850[7] + 8192 >> 14;
								@Pc(1144) int local1144 = local1105 + local862;
								this.anIntArray348[local1026] = local1109;
								@Pc(1153) int local1153 = local1140 + local864;
								this.anIntArray349[local1026] = local1144;
								this.anIntArray350[local1026] = local1153;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2700) Class231 local2700;
			@Pc(2705) Class303 local2705;
			if (arg0 == 5) {
				if (this.anIntArrayArray35 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray35.length > local35) {
							local271 = this.anIntArrayArray35[local35];
							for (local273 = 0; local273 < local271.length; local273++) {
								local59 = local271[local273];
								if (this.aShortArray117 == null || (arg6 & this.aShortArray117[local59]) != 0) {
									local65 = (this.aByteArray49[local59] & 0xFF) + (arg2 * 8);
									if (local65 < 0) {
										local65 = 0;
									} else if (local65 > 255) {
										local65 = 255;
									}
									this.aByteArray49[local59] = (byte) local65;
									if (this.aClass229_10 != null) {
										this.aClass229_10.anInterface24_5 = null;
									}
								}
							}
						}
					}
					if (this.aClass231Array1 != null) {
						for (local35 = 0; local35 < this.anInt6181; local35++) {
							local2700 = this.aClass231Array1[local35];
							local2705 = this.aClass303Array1[local35];
							local2705.anInt8869 = 255 - (this.aByteArray49[local2700.anInt6303] & 0xFF) << 24 | local2705.anInt8869 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2976) Class303 local2976;
				if (arg0 == 8) {
					if (this.anIntArrayArray33 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (local35 < this.anIntArrayArray33.length) {
								local271 = this.anIntArrayArray33[local35];
								for (local273 = 0; local273 < local271.length; local273++) {
									local2976 = this.aClass303Array1[local271[local273]];
									local2976.anInt8871 += arg2;
									local2976.anInt8868 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray33 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (local35 < this.anIntArrayArray33.length) {
								local271 = this.anIntArrayArray33[local35];
								for (local273 = 0; local273 < local271.length; local273++) {
									local2976 = this.aClass303Array1[local271[local273]];
									local2976.anInt8877 = arg2 * local2976.anInt8877 >> 7;
									local2976.anInt8875 = arg3 * local2976.anInt8875 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray33 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray33.length > local35) {
							local271 = this.anIntArrayArray33[local35];
							for (local273 = 0; local273 < local271.length; local273++) {
								local2976 = this.aClass303Array1[local271[local273]];
								local2976.anInt8872 = local2976.anInt8872 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray35 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (this.anIntArrayArray35.length > local35) {
						local271 = this.anIntArrayArray35[local35];
						for (local273 = 0; local273 < local271.length; local273++) {
							local59 = local271[local273];
							if (this.aShortArray117 == null || (this.aShortArray117[local59] & arg6) != 0) {
								local65 = this.aShortArray111[local59] & 0xFFFF;
								local399 = local65 >> 10 & 0x3F;
								local422 = local65 >> 7 & 0x7;
								local444 = local65 & 0x7F;
								local422 += arg3 / 4;
								@Pc(2814) int local2814 = local399 + arg2 & 0x3F;
								local444 += arg4;
								if (local422 < 0) {
									local422 = 0;
								} else if (local422 > 7) {
									local422 = 7;
								}
								if (local444 < 0) {
									local444 = 0;
								} else if (local444 > 127) {
									local444 = 127;
								}
								this.aShortArray111[local59] = (short) (local2814 << 10 | local422 << 7 | local444);
								if (this.aClass229_10 != null) {
									this.aClass229_10.anInterface24_5 = null;
								}
							}
						}
					}
				}
				if (this.aClass231Array1 != null) {
					for (local35 = 0; local35 < this.anInt6181; local35++) {
						local2700 = this.aClass231Array1[local35];
						local2705 = this.aClass303Array1[local35];
						local2705.anInt8869 = local2705.anInt8869 & 0xFF000000 | Static305.anIntArray309[this.aShortArray111[local2700.anInt6303] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray34.length > local35) {
					local271 = this.anIntArrayArray34[local35];
					for (local273 = 0; local273 < local271.length; local273++) {
						local59 = local271[local273];
						if (this.aShortArray110 == null || (arg6 & this.aShortArray110[local59]) != 0) {
							this.anIntArray348[local59] -= Static175.anInt10582;
							this.anIntArray349[local59] -= Static218.anInt4240;
							this.anIntArray350[local59] -= Static206.anInt11288;
							this.anIntArray348[local59] = this.anIntArray348[local59] * arg2 >> 7;
							this.anIntArray349[local59] = this.anIntArray349[local59] * arg3 >> 7;
							this.anIntArray350[local59] = arg4 * this.anIntArray350[local59] >> 7;
							this.anIntArray348[local59] += Static175.anInt10582;
							this.anIntArray349[local59] += Static218.anInt4240;
							this.anIntArray350[local59] += Static206.anInt11288;
						}
					}
				}
			}
		} else {
			local27 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local43 = arg7[11] << 4;
			local273 = arg7[12] << 4;
			local59 = arg7[13] << 4;
			local65 = arg7[14] << 4;
			if (Static699.aBoolean791) {
				local399 = Static206.anInt11288 * arg7[6] + arg7[0] * Static175.anInt10582 + Static218.anInt4240 * arg7[3] + 8192 >> 14;
				local422 = Static206.anInt11288 * arg7[7] + arg7[1] * Static175.anInt10582 + Static218.anInt4240 * arg7[4] + 8192 >> 14;
				local399 += local273;
				local422 += local59;
				local444 = Static206.anInt11288 * arg7[8] + arg7[5] * Static218.anInt4240 + arg7[2] * Static175.anInt10582 + 8192 >> 14;
				Static175.anInt10582 = local399;
				local444 += local65;
				Static218.anInt4240 = local422;
				Static699.aBoolean791 = false;
				Static206.anInt11288 = local444;
			}
			local399 = arg2 << 15 >> 7;
			local422 = arg3 << 15 >> 7;
			local444 = arg4 << 15 >> 7;
			local479 = -Static175.anInt10582 * local399 + 8192 >> 14;
			local483 = -Static218.anInt4240 * local422 + 8192 >> 14;
			local487 = local444 * -Static206.anInt11288 + 8192 >> 14;
			local491 = local479 + Static175.anInt10582;
			local499 = local483 + Static218.anInt4240;
			local507 = Static206.anInt11288 + local487;
			@Pc(1949) int[] local1949 = new int[] { local399 * arg7[0] + 8192 >> 14, local399 * arg7[3] + 8192 >> 14, arg7[6] * local399 + 8192 >> 14, arg7[1] * local422 + 8192 >> 14, local422 * arg7[4] + 8192 >> 14, local422 * arg7[7] + 8192 >> 14, arg7[2] * local444 + 8192 >> 14, local444 * arg7[5] + 8192 >> 14, arg7[8] * local444 + 8192 >> 14 };
			local663 = local399 * local273 + 8192 >> 14;
			local688 = local422 * local59 + 8192 >> 14;
			local692 = local444 * local65 + 8192 >> 14;
			@Pc(2085) int local2085 = local663 + local491;
			@Pc(2089) int local2089 = local688 + local499;
			@Pc(2093) int local2093 = local692 + local507;
			@Pc(2096) int[] local2096 = new int[9];
			@Pc(2102) int local2102;
			for (local700 = 0; local700 < 3; local700++) {
				for (local2102 = 0; local2102 < 3; local2102++) {
					local705 = 0;
					for (local709 = 0; local709 < 3; local709++) {
						local705 += arg7[local700 * 3 + local709] * local1949[local709 * 3 + local2102];
					}
					local2096[local700 * 3 + local2102] = local705 + 8192 >> 14;
				}
			}
			local2102 = arg7[2] * local2093 + local2085 * arg7[0] + arg7[1] * local2089 + 8192 >> 14;
			local705 = local2085 * arg7[3] + local2089 * arg7[4] + local2093 * arg7[5] + 8192 >> 14;
			local705 += local35;
			local709 = arg7[8] * local2093 + arg7[6] * local2085 + arg7[7] * local2089 + 8192 >> 14;
			local2102 += local27;
			local709 += local43;
			for (local713 = 0; local713 < local8; local713++) {
				local715 = arg1[local713];
				if (this.anIntArrayArray34.length > local715) {
					local850 = this.anIntArrayArray34[local715];
					for (local852 = 0; local852 < local850.length; local852++) {
						local858 = local850[local852];
						if (this.aShortArray110 == null || (this.aShortArray110[local858] & arg6) != 0) {
							local862 = this.anIntArray350[local858] * local2096[2] + this.anIntArray349[local858] * local2096[1] + this.anIntArray348[local858] * local2096[0] + 8192 >> 14;
							local864 = this.anIntArray350[local858] * local2096[5] + local2096[4] * this.anIntArray349[local858] + this.anIntArray348[local858] * local2096[3] + 8192 >> 14;
							@Pc(2351) int local2351 = local862 + local2102;
							local1000 = this.anIntArray348[local858] * local2096[6] + this.anIntArray349[local858] * local2096[7] + this.anIntArray350[local858] * local2096[8] + 8192 >> 14;
							@Pc(2387) int local2387 = local864 + local705;
							this.anIntArray348[local858] = local2351;
							@Pc(2396) int local2396 = local1000 + local709;
							this.anIntArray349[local858] = local2387;
							this.anIntArray350[local858] = local2396;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Z)V")
	private void method5238() {
		if (this.aClass231Array1 == null) {
			return;
		}
		@Pc(12) Class181_Sub2 local12 = this.aClass67_Sub2_24.aClass181_Sub2_2;
		this.aClass67_Sub2_24.method3264();
		this.aClass67_Sub2_24.C(!this.aBoolean487);
		this.aClass67_Sub2_24.method3299(false);
		this.aClass67_Sub2_24.method3283(this.aClass67_Sub2_24.aClass229_7, (Class229) null, this.aClass67_Sub2_24.aClass229_6, (Class229) null);
		for (@Pc(45) int local45 = 0; local45 < this.anInt6181; local45++) {
			@Pc(54) Class231 local54 = this.aClass231Array1[local45];
			@Pc(59) Class303 local59 = this.aClass303Array1[local45];
			if (!local54.aBoolean491 || !this.aClass67_Sub2_24.method7643()) {
				@Pc(89) float local89 = (float) (this.anIntArray348[local54.anInt6307] + this.anIntArray348[local54.anInt6308] + this.anIntArray348[local54.anInt6305]) * 0.3333333F;
				@Pc(111) float local111 = (float) (this.anIntArray349[local54.anInt6308] + this.anIntArray349[local54.anInt6307] + this.anIntArray349[local54.anInt6305]) * 0.3333333F;
				@Pc(132) float local132 = (float) (this.anIntArray350[local54.anInt6305] + this.anIntArray350[local54.anInt6307] + this.anIntArray350[local54.anInt6308]) * 0.3333333F;
				@Pc(146) float local146 = Static388.aFloat127 + Static439.aFloat155 * local89 + local111 * Static238.aFloat87 + local132 * Static268.aFloat89;
				@Pc(160) float local160 = Static414.aFloat128 * local132 + Static512.aFloat162 * local111 + Static643.aFloat195 * local89 + Static238.aFloat88;
				@Pc(174) float local174 = local89 * Static708.aFloat200 + Static218.aFloat84 * local111 + local132 * Static580.aFloat180 + Static89.aFloat15;
				@Pc(195) float local195 = (float) (1.0D / Math.sqrt((double) (local174 * local174 + local146 * local146 + local160 * local160))) * (float) local54.anInt6301;
				local12.method6175(local59.anInt8875 * local54.aShort89 >> 7, (float) local59.anInt8868 + local160 * local195 - local160, -local174 + local174 * local195, local59.anInt8872, (float) local59.anInt8871 + local146 - local195 * local146, local59.anInt8877 * local54.aShort88 >> 7);
				this.aClass67_Sub2_24.method3230(local12);
				@Pc(248) int local248 = local59.anInt8869;
				OpenGL.glColor4ub((byte) (local248 >> 16), (byte) (local248 >> 8), (byte) local248, (byte) (local248 >> 24));
				this.aClass67_Sub2_24.method3245(local54.aShort87);
				this.aClass67_Sub2_24.method3257(local54.aByte93);
				this.aClass67_Sub2_24.method3287(4);
			}
		}
		this.aClass67_Sub2_24.C(true);
		this.aClass67_Sub2_24.method3293();
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!iu;Lclient!laa;II)V")
	@Override
	public void method5227(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class19_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6155 == 0) {
			return;
		}
		@Pc(14) Class181_Sub2 local14 = this.aClass67_Sub2_24.aClass181_Sub2_3;
		@Pc(17) Class181_Sub2 local17 = (Class181_Sub2) arg0;
		if (!this.aBoolean489) {
			this.method5240();
		}
		Static89.aFloat15 = local14.aFloat135 * local17.aFloat133 + local17.aFloat137 * local14.aFloat136 + local14.aFloat132 * local17.aFloat129 + local14.aFloat133;
		Static218.aFloat84 = local14.aFloat135 * local17.aFloat136 + local17.aFloat134 * local14.aFloat132 + local17.aFloat131 * local14.aFloat136;
		@Pc(72) float local72 = (float) this.aShort81 * Static218.aFloat84 + Static89.aFloat15;
		@Pc(80) float local80 = (float) this.aShort79 * Static218.aFloat84 + Static89.aFloat15;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local80 < local72) {
			local96 = local72 + (float) this.aShort78;
			local90 = (float) -this.aShort78 + local80;
		} else {
			local90 = local72 - (float) this.aShort78;
			local96 = local80 + (float) this.aShort78;
		}
		if (this.aClass67_Sub2_24.aFloat69 <= local90 || local96 <= (float) this.aClass67_Sub2_24.anInt3919) {
			return;
		}
		Static388.aFloat127 = local17.aFloat133 * local14.aFloat139 + local17.aFloat129 * local14.aFloat138 + local14.aFloat134 * local17.aFloat137 + local14.aFloat129;
		Static238.aFloat87 = local17.aFloat136 * local14.aFloat139 + local14.aFloat134 * local17.aFloat131 + local17.aFloat134 * local14.aFloat138;
		@Pc(175) float local175 = Static388.aFloat127 + Static238.aFloat87 * (float) this.aShort81;
		@Pc(183) float local183 = Static238.aFloat87 * (float) this.aShort79 + Static388.aFloat127;
		@Pc(199) float local199;
		@Pc(210) float local210;
		if (local183 < local175) {
			local199 = (float) this.aClass67_Sub2_24.anInt3911 * ((float) -this.aShort78 + local183);
			local210 = ((float) this.aShort78 + local175) * (float) this.aClass67_Sub2_24.anInt3911;
		} else {
			local210 = (float) this.aClass67_Sub2_24.anInt3911 * ((float) this.aShort78 + local183);
			local199 = (float) this.aClass67_Sub2_24.anInt3911 * ((float) -this.aShort78 + local175);
		}
		if (local199 / (float) arg2 >= this.aClass67_Sub2_24.aFloat75 || local210 / (float) arg2 <= this.aClass67_Sub2_24.aFloat67) {
			return;
		}
		Static512.aFloat162 = local17.aFloat131 * local14.aFloat131 + local14.aFloat140 * local17.aFloat134 + local14.aFloat130 * local17.aFloat136;
		Static238.aFloat88 = local14.aFloat137 + local14.aFloat131 * local17.aFloat137 + local17.aFloat129 * local14.aFloat140 + local14.aFloat130 * local17.aFloat133;
		@Pc(304) float local304 = (float) this.aShort81 * Static512.aFloat162 + Static238.aFloat88;
		@Pc(312) float local312 = (float) this.aShort79 * Static512.aFloat162 + Static238.aFloat88;
		@Pc(327) float local327;
		@Pc(338) float local338;
		if (local312 < local304) {
			local327 = (local312 - (float) this.aShort78) * (float) this.aClass67_Sub2_24.anInt3916;
			local338 = ((float) this.aShort78 + local304) * (float) this.aClass67_Sub2_24.anInt3916;
		} else {
			local327 = (float) this.aClass67_Sub2_24.anInt3916 * (local304 - (float) this.aShort78);
			local338 = (local312 + (float) this.aShort78) * (float) this.aClass67_Sub2_24.anInt3916;
		}
		if (this.aClass67_Sub2_24.aFloat78 <= local327 / (float) arg2 || this.aClass67_Sub2_24.aFloat83 >= local338 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass231Array1 != null) {
			Static708.aFloat200 = local14.aFloat132 * local17.aFloat138 + local17.aFloat140 * local14.aFloat136 + local14.aFloat135 * local17.aFloat132;
			Static643.aFloat195 = local17.aFloat138 * local14.aFloat140 + local17.aFloat140 * local14.aFloat131 + local14.aFloat130 * local17.aFloat132;
			Static414.aFloat128 = local17.aFloat135 * local14.aFloat130 + local17.aFloat130 * local14.aFloat131 + local14.aFloat140 * local17.aFloat139;
			Static268.aFloat89 = local17.aFloat135 * local14.aFloat139 + local17.aFloat139 * local14.aFloat138 + local14.aFloat134 * local17.aFloat130;
			Static439.aFloat155 = local17.aFloat140 * local14.aFloat134 + local17.aFloat138 * local14.aFloat138 + local14.aFloat139 * local17.aFloat132;
			Static580.aFloat180 = local14.aFloat135 * local17.aFloat135 + local17.aFloat130 * local14.aFloat136 + local17.aFloat139 * local14.aFloat132;
		}
		if (arg1 != null) {
			@Pc(511) int local511 = this.aShort84 + this.aShort85 >> 1;
			@Pc(519) int local519 = this.aShort80 + this.lb >> 1;
			@Pc(538) int local538 = (int) ((float) local519 * Static268.aFloat89 + Static238.aFloat87 * (float) this.aShort81 + Static439.aFloat155 * (float) local511 + Static388.aFloat127);
			@Pc(557) int local557 = (int) ((float) local519 * Static414.aFloat128 + Static238.aFloat88 + (float) local511 * Static643.aFloat195 + Static512.aFloat162 * (float) this.aShort81);
			@Pc(576) int local576 = (int) ((float) local519 * Static580.aFloat180 + Static708.aFloat200 * (float) local511 + Static89.aFloat15 + (float) this.aShort81 * Static218.aFloat84);
			@Pc(595) int local595 = (int) (Static388.aFloat127 + (float) local511 * Static439.aFloat155 + (float) this.aShort79 * Static238.aFloat87 + Static268.aFloat89 * (float) local519);
			@Pc(614) int local614 = (int) ((float) local519 * Static414.aFloat128 + Static512.aFloat162 * (float) this.aShort79 + (float) local511 * Static643.aFloat195 + Static238.aFloat88);
			@Pc(633) int local633 = (int) ((float) local519 * Static580.aFloat180 + Static89.aFloat15 + (float) local511 * Static708.aFloat200 + Static218.aFloat84 * (float) this.aShort79);
			arg1.anInt5947 = this.aClass67_Sub2_24.anInt3903 + local538 * this.aClass67_Sub2_24.anInt3911 / arg2;
			arg1.anInt5946 = local614 * this.aClass67_Sub2_24.anInt3916 / arg2 + this.aClass67_Sub2_24.anInt3897;
			arg1.anInt5950 = this.aClass67_Sub2_24.anInt3911 * local595 / arg2 + this.aClass67_Sub2_24.anInt3903;
			arg1.anInt5948 = local557 * this.aClass67_Sub2_24.anInt3916 / arg2 + this.aClass67_Sub2_24.anInt3897;
			if (local576 >= this.aClass67_Sub2_24.anInt3919 || local633 >= this.aClass67_Sub2_24.anInt3919) {
				arg1.aBoolean477 = true;
				arg1.anInt5949 = (local538 + this.aShort78) * this.aClass67_Sub2_24.anInt3911 / arg2 + this.aClass67_Sub2_24.anInt3903 - arg1.anInt5947;
			}
		}
		this.aClass67_Sub2_24.method3254((float) arg2);
		this.aClass67_Sub2_24.method3263();
		this.aClass67_Sub2_24.method3286(local17);
		this.method5248();
		this.aClass67_Sub2_24.method3293();
		this.method5238();
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "()[Lclient!hl;")
	@Override
	public Class156[] method5214() {
		return this.aClass156Array5;
	}

	@OriginalMember(owner = "client!lia", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean489) {
			this.method5240();
		}
		return this.aShort84;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IILclient!iu;ZII)Z")
	@Override
	public boolean method5221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method5245(arg1, arg2, arg0, arg5, arg3, arg4);
	}

	@OriginalMember(owner = "client!lia", name = "c", descriptor = "(I)V")
	private void method5239(@OriginalArg(0) int arg0) {
		if (arg0 != -5187 || !this.aBoolean486) {
			return;
		}
		this.aBoolean486 = false;
		if (this.aClass156Array5 == null && this.aClass348Array5 == null && this.aClass231Array1 == null && !Static290.method4408(this.anInt6189, this.anInt6175)) {
			@Pc(42) boolean local42 = false;
			@Pc(44) boolean local44 = false;
			if (this.anIntArray348 != null && !Static515.method7372(this.anInt6189, this.anInt6175)) {
				if (this.aClass229_11 != null && this.aClass229_11.anInterface24_5 == null) {
					this.aBoolean486 = true;
				} else {
					if (!this.aBoolean489) {
						this.method5240();
					}
					local42 = true;
				}
			}
			@Pc(88) boolean local88 = false;
			if (this.anIntArray349 != null && !Static209.method3107(this.anInt6189, this.anInt6175)) {
				if (this.aClass229_11 != null && this.aClass229_11.anInterface24_5 == null) {
					this.aBoolean486 = true;
				} else {
					local44 = true;
					if (!this.aBoolean489) {
						this.method5240();
					}
				}
			}
			if (this.anIntArray350 != null && !Static707.method9228(this.anInt6189, this.anInt6175, arg0 ^ 0x1435)) {
				if (this.aClass229_11 != null && this.aClass229_11.anInterface24_5 == null) {
					this.aBoolean486 = true;
				} else {
					if (!this.aBoolean489) {
						this.method5240();
					}
					local88 = true;
				}
			}
			if (local42) {
				this.anIntArray348 = null;
			}
			if (local44) {
				this.anIntArray349 = null;
			}
			if (local88) {
				this.anIntArray350 = null;
			}
		}
		if (this.aShortArray112 != null && this.anIntArray348 == null && this.anIntArray349 == null && this.anIntArray350 == null) {
			this.aShortArray112 = null;
			this.anIntArray347 = null;
		}
		if (this.aByteArray48 != null && !Static535.method7521(this.anInt6189, this.anInt6175)) {
			if (this.aClass229_12 == null) {
				if (this.aClass229_10 != null && this.aClass229_10.anInterface24_5 == null) {
					this.aBoolean486 = true;
				} else {
					this.aByteArray48 = null;
					this.aShortArray119 = this.aShortArray116 = this.aShortArray120 = null;
				}
			} else if (this.aClass229_12.anInterface24_5 == null) {
				this.aBoolean486 = true;
			} else {
				this.aShortArray119 = this.aShortArray116 = this.aShortArray120 = null;
				this.aByteArray48 = null;
			}
		}
		if (this.aShortArray111 != null && !Static318.method4781(this.anInt6189, this.anInt6175)) {
			if (this.aClass229_10 != null && this.aClass229_10.anInterface24_5 == null) {
				this.aBoolean486 = true;
			} else {
				this.aShortArray111 = null;
			}
		}
		if (this.aByteArray49 != null && !Static576.method7962(this.anInt6175, this.anInt6189)) {
			if (this.aClass229_10 != null && this.aClass229_10.anInterface24_5 == null) {
				this.aBoolean486 = true;
			} else {
				this.aByteArray49 = null;
			}
		}
		if (this.aFloatArray54 != null && !Static706.method9215(this.anInt6189, this.anInt6175)) {
			if (this.aClass229_9 != null && this.aClass229_9.anInterface24_5 == null) {
				this.aBoolean486 = true;
			} else {
				this.aFloatArray54 = this.aFloatArray55 = null;
			}
		}
		if (this.aShortArray115 != null && !Static267.method4105(this.anInt6175, this.anInt6189)) {
			if (this.aClass229_10 != null && this.aClass229_10.anInterface24_5 == null) {
				this.aBoolean486 = true;
			} else {
				this.aShortArray115 = null;
			}
		}
		if (this.aShortArray118 != null && !Static561.method8784(this.anInt6175, this.anInt6189)) {
			if ((this.aClass374_1 == null || this.aClass374_1.anInterface11_5 != null) && (this.aClass229_10 == null || this.aClass229_10.anInterface24_5 != null)) {
				this.aShortArray118 = this.aShortArray113 = this.aShortArray114 = null;
			} else {
				this.aBoolean486 = true;
			}
		}
		if (this.anIntArrayArray35 != null && !Static410.method6125(this.anInt6175, this.anInt6189)) {
			this.anIntArrayArray35 = null;
			this.aShortArray117 = null;
		}
		if (this.anIntArrayArray34 != null && !Static689.method4218(this.anInt6189, this.anInt6175)) {
			this.aShortArray110 = null;
			this.anIntArrayArray34 = null;
		}
		if (this.anIntArrayArray33 != null && !Static378.method5697(this.anInt6189, this.anInt6175)) {
			this.anIntArrayArray33 = null;
		}
		if (this.anIntArray351 != null && (this.anInt6175 & 0x800) == 0 && (this.anInt6175 & 0x40000) == 0) {
			this.anIntArray351 = null;
		}
	}

	@OriginalMember(owner = "client!lia", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean489) {
			this.method5240();
		}
		return this.aShort79;
	}

	@OriginalMember(owner = "client!lia", name = "c", descriptor = "()[B")
	@Override
	public byte[] method5216() {
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub2_Sub21.anIntArray358[arg0];
		@Pc(13) int local13 = Class3_Sub2_Sub21.anIntArray356[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6187; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray350[local15] + local13 * this.anIntArray348[local15] >> 14;
			this.anIntArray350[local15] = local13 * this.anIntArray350[local15] - this.anIntArray348[local15] * local9 >> 14;
			this.anIntArray348[local15] = local33;
		}
		this.aBoolean489 = false;
		if (this.aClass229_11 != null) {
			this.aClass229_11.anInterface24_5 = null;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method5213(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(61) int local61;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(43) int local43;
		@Pc(55) int local55;
		@Pc(53) int[] local53;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg2 << 4;
			local25 = arg3 << 4;
			Static218.anInt4240 = 0;
			Static175.anInt10582 = 0;
			local31 = 0;
			Static206.anInt11288 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local43 = arg1[local35];
				if (local43 < this.anIntArrayArray34.length) {
					local53 = this.anIntArrayArray34[local43];
					for (local55 = 0; local55 < local53.length; local55++) {
						local61 = local53[local55];
						Static175.anInt10582 += this.anIntArray348[local61];
						Static218.anInt4240 += this.anIntArray349[local61];
						Static206.anInt11288 += this.anIntArray350[local61];
						local31++;
					}
				}
			}
			if (local31 <= 0) {
				Static175.anInt10582 = local21;
				Static218.anInt4240 = local25;
				Static206.anInt11288 = local17;
			} else {
				Static206.anInt11288 = local17 + Static206.anInt11288 / local31;
				Static175.anInt10582 = local21 + Static175.anInt10582 / local31;
				Static218.anInt4240 = Static218.anInt4240 / local31 + local25;
			}
			return;
		}
		@Pc(167) int[] local167;
		@Pc(169) int local169;
		if (arg0 == 1) {
			local25 = arg3 << 4;
			local17 = arg4 << 4;
			local21 = arg2 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray34.length) {
					local167 = this.anIntArrayArray34[local35];
					for (local169 = 0; local169 < local167.length; local169++) {
						local55 = local167[local169];
						this.anIntArray348[local55] += local21;
						this.anIntArray349[local55] += local25;
						this.anIntArray350[local55] += local17;
					}
				}
			}
			return;
		}
		@Pc(295) int local295;
		@Pc(314) int local314;
		@Pc(786) int local786;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray34.length > local35) {
					local167 = this.anIntArrayArray34[local35];
					if ((arg5 & 0x1) == 0) {
						for (local169 = 0; local169 < local167.length; local169++) {
							local55 = local167[local169];
							this.anIntArray348[local55] -= Static175.anInt10582;
							this.anIntArray349[local55] -= Static218.anInt4240;
							this.anIntArray350[local55] -= Static206.anInt11288;
							if (arg4 != 0) {
								local61 = Class3_Sub2_Sub21.anIntArray358[arg4];
								local295 = Class3_Sub2_Sub21.anIntArray356[arg4];
								local314 = local295 * this.anIntArray348[local55] + this.anIntArray349[local55] * local61 + 16383 >> 14;
								this.anIntArray349[local55] = local295 * this.anIntArray349[local55] + 16383 - local61 * this.anIntArray348[local55] >> 14;
								this.anIntArray348[local55] = local314;
							}
							if (arg2 != 0) {
								local61 = Class3_Sub2_Sub21.anIntArray358[arg2];
								local295 = Class3_Sub2_Sub21.anIntArray356[arg2];
								local314 = local295 * this.anIntArray349[local55] + 16383 - this.anIntArray350[local55] * local61 >> 14;
								this.anIntArray350[local55] = this.anIntArray349[local55] * local61 + this.anIntArray350[local55] * local295 + 16383 >> 14;
								this.anIntArray349[local55] = local314;
							}
							if (arg3 != 0) {
								local61 = Class3_Sub2_Sub21.anIntArray358[arg3];
								local295 = Class3_Sub2_Sub21.anIntArray356[arg3];
								local314 = this.anIntArray348[local55] * local295 + local61 * this.anIntArray350[local55] + 16383 >> 14;
								this.anIntArray350[local55] = local295 * this.anIntArray350[local55] + 16383 - local61 * this.anIntArray348[local55] >> 14;
								this.anIntArray348[local55] = local314;
							}
							this.anIntArray348[local55] += Static175.anInt10582;
							this.anIntArray349[local55] += Static218.anInt4240;
							this.anIntArray350[local55] += Static206.anInt11288;
						}
					} else {
						for (local169 = 0; local169 < local167.length; local169++) {
							local55 = local167[local169];
							this.anIntArray348[local55] -= Static175.anInt10582;
							this.anIntArray349[local55] -= Static218.anInt4240;
							this.anIntArray350[local55] -= Static206.anInt11288;
							if (arg2 != 0) {
								local61 = Class3_Sub2_Sub21.anIntArray358[arg2];
								local295 = Class3_Sub2_Sub21.anIntArray356[arg2];
								local314 = local295 * this.anIntArray349[local55] + 16383 - this.anIntArray350[local55] * local61 >> 14;
								this.anIntArray350[local55] = this.anIntArray349[local55] * local61 + this.anIntArray350[local55] * local295 + 16383 >> 14;
								this.anIntArray349[local55] = local314;
							}
							if (arg4 != 0) {
								local61 = Class3_Sub2_Sub21.anIntArray358[arg4];
								local295 = Class3_Sub2_Sub21.anIntArray356[arg4];
								local314 = local61 * this.anIntArray349[local55] + local295 * this.anIntArray348[local55] + 16383 >> 14;
								this.anIntArray349[local55] = this.anIntArray349[local55] * local295 + 16383 - local61 * this.anIntArray348[local55] >> 14;
								this.anIntArray348[local55] = local314;
							}
							if (arg3 != 0) {
								local61 = Class3_Sub2_Sub21.anIntArray358[arg3];
								local295 = Class3_Sub2_Sub21.anIntArray356[arg3];
								local314 = local61 * this.anIntArray350[local55] + this.anIntArray348[local55] * local295 + 16383 >> 14;
								this.anIntArray350[local55] = local295 * this.anIntArray350[local55] + 16383 - local61 * this.anIntArray348[local55] >> 14;
								this.anIntArray348[local55] = local314;
							}
							this.anIntArray348[local55] += Static175.anInt10582;
							this.anIntArray349[local55] += Static218.anInt4240;
							this.anIntArray350[local55] += Static206.anInt11288;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local43 = arg1[local35];
					if (this.anIntArrayArray34.length > local43) {
						local53 = this.anIntArrayArray34[local43];
						for (local55 = 0; local55 < local53.length; local55++) {
							local61 = local53[local55];
							local295 = this.anIntArray347[local61];
							local314 = this.anIntArray347[local61 + 1];
							for (local786 = local295; local786 < local314; local786++) {
								@Pc(795) int local795 = this.aShortArray112[local786] - 1;
								if (local795 == -1) {
									break;
								}
								@Pc(807) int local807;
								@Pc(811) int local811;
								@Pc(829) int local829;
								if (arg4 != 0) {
									local807 = Class3_Sub2_Sub21.anIntArray358[arg4];
									local811 = Class3_Sub2_Sub21.anIntArray356[arg4];
									local829 = local807 * this.aShortArray116[local795] + this.aShortArray119[local795] * local811 + 16383 >> 14;
									this.aShortArray116[local795] = (short) (this.aShortArray116[local795] * local811 + 16383 - this.aShortArray119[local795] * local807 >> 14);
									this.aShortArray119[local795] = (short) local829;
								}
								if (arg2 != 0) {
									local807 = Class3_Sub2_Sub21.anIntArray358[arg2];
									local811 = Class3_Sub2_Sub21.anIntArray356[arg2];
									local829 = this.aShortArray116[local795] * local811 + 16383 - local807 * this.aShortArray120[local795] >> 14;
									this.aShortArray120[local795] = (short) (local811 * this.aShortArray120[local795] + this.aShortArray116[local795] * local807 + 16383 >> 14);
									this.aShortArray116[local795] = (short) local829;
								}
								if (arg3 != 0) {
									local807 = Class3_Sub2_Sub21.anIntArray358[arg3];
									local811 = Class3_Sub2_Sub21.anIntArray356[arg3];
									local829 = local807 * this.aShortArray120[local795] + local811 * this.aShortArray119[local795] + 16383 >> 14;
									this.aShortArray120[local795] = (short) (local811 * this.aShortArray120[local795] + 16383 - local807 * this.aShortArray119[local795] >> 14);
									this.aShortArray119[local795] = (short) local829;
								}
							}
						}
					}
				}
				if (this.aClass229_12 == null && this.aClass229_10 != null) {
					this.aClass229_10.anInterface24_5 = null;
				}
				if (this.aClass229_12 != null) {
					this.aClass229_12.anInterface24_5 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray34.length) {
					local167 = this.anIntArrayArray34[local35];
					for (local169 = 0; local169 < local167.length; local169++) {
						local55 = local167[local169];
						this.anIntArray348[local55] -= Static175.anInt10582;
						this.anIntArray349[local55] -= Static218.anInt4240;
						this.anIntArray350[local55] -= Static206.anInt11288;
						this.anIntArray348[local55] = arg2 * this.anIntArray348[local55] >> 7;
						this.anIntArray349[local55] = arg3 * this.anIntArray349[local55] >> 7;
						this.anIntArray350[local55] = this.anIntArray350[local55] * arg4 >> 7;
						this.anIntArray348[local55] += Static175.anInt10582;
						this.anIntArray349[local55] += Static218.anInt4240;
						this.anIntArray350[local55] += Static206.anInt11288;
					}
				}
			}
		} else {
			@Pc(1269) Class231 local1269;
			@Pc(1274) Class303 local1274;
			if (arg0 == 5) {
				if (this.anIntArrayArray35 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray35.length > local35) {
							local167 = this.anIntArrayArray35[local35];
							for (local169 = 0; local169 < local167.length; local169++) {
								local55 = local167[local169];
								local61 = (this.aByteArray49[local55] & 0xFF) + arg2 * 8;
								if (local61 < 0) {
									local61 = 0;
								} else if (local61 > 255) {
									local61 = 255;
								}
								this.aByteArray49[local55] = (byte) local61;
							}
							if (local167.length > 0 && this.aClass229_10 != null) {
								this.aClass229_10.anInterface24_5 = null;
							}
						}
					}
					if (this.aClass231Array1 != null) {
						for (local35 = 0; local35 < this.anInt6181; local35++) {
							local1269 = this.aClass231Array1[local35];
							local1274 = this.aClass303Array1[local35];
							local1274.anInt8869 = local1274.anInt8869 & 0xFFFFFF | 255 - (this.aByteArray49[local1269.anInt6303] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1553) Class303 local1553;
				if (arg0 == 8) {
					if (this.anIntArrayArray33 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray33.length) {
								local167 = this.anIntArrayArray33[local35];
								for (local169 = 0; local169 < local167.length; local169++) {
									local1553 = this.aClass303Array1[local167[local169]];
									local1553.anInt8871 += arg2;
									local1553.anInt8868 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray33 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray33.length) {
								local167 = this.anIntArrayArray33[local35];
								for (local169 = 0; local169 < local167.length; local169++) {
									local1553 = this.aClass303Array1[local167[local169]];
									local1553.anInt8877 = local1553.anInt8877 * arg2 >> 7;
									local1553.anInt8875 = arg3 * local1553.anInt8875 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray33 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray33.length > local35) {
							local167 = this.anIntArrayArray33[local35];
							for (local169 = 0; local169 < local167.length; local169++) {
								local1553 = this.aClass303Array1[local167[local169]];
								local1553.anInt8872 = arg2 + local1553.anInt8872 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray35 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray35.length) {
						local167 = this.anIntArrayArray35[local35];
						for (local169 = 0; local169 < local167.length; local169++) {
							local55 = local167[local169];
							local61 = this.aShortArray111[local55] & 0xFFFF;
							local295 = local61 >> 10 & 0x3F;
							local314 = local61 >> 7 & 0x7;
							@Pc(1368) int local1368 = local295 + arg2 & 0x3F;
							local314 += arg3 / 4;
							local786 = local61 & 0x7F;
							if (local314 < 0) {
								local314 = 0;
							} else if (local314 > 7) {
								local314 = 7;
							}
							local786 += arg4;
							if (local786 < 0) {
								local786 = 0;
							} else if (local786 > 127) {
								local786 = 127;
							}
							this.aShortArray111[local55] = (short) (local786 | local314 << 7 | local1368 << 10);
						}
						if (local167.length > 0 && this.aClass229_10 != null) {
							this.aClass229_10.anInterface24_5 = null;
						}
					}
				}
				if (this.aClass231Array1 != null) {
					for (local35 = 0; local35 < this.anInt6181; local35++) {
						local1269 = this.aClass231Array1[local35];
						local1274 = this.aClass303Array1[local35];
						local1274.anInt8869 = Static305.anIntArray309[this.aShortArray111[local1269.anInt6303] & 0xFFFF] & 0xFFFFFF | local1274.anInt8869 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(B)V")
	private void method5240() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(25) int local25 = -32768;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt6187; local31++) {
			@Pc(40) int local40 = this.anIntArray348[local31];
			@Pc(45) int local45 = this.anIntArray349[local31];
			if (local45 < local9) {
				local9 = local45;
			}
			@Pc(55) int local55 = this.anIntArray350[local31];
			if (local15 < local45) {
				local15 = local45;
			}
			if (local40 < local7) {
				local7 = local40;
			}
			if (local13 < local40) {
				local13 = local40;
			}
			if (local55 < local11) {
				local11 = local55;
			}
			if (local55 > local25) {
				local25 = local55;
			}
			@Pc(108) int local108 = local55 * local55 + local40 * local40;
			if (local27 < local108) {
				local27 = local108;
			}
			local108 = local45 * local45 + local40 * local40 + local55 * local55;
			if (local29 < local108) {
				local29 = local108;
			}
		}
		this.aShort84 = (short) local7;
		this.aShort85 = (short) local13;
		this.aShort81 = (short) local9;
		this.aShort79 = (short) local15;
		this.aShort80 = (short) local25;
		this.lb = (short) local11;
		this.aShort78 = (short) (int) (Math.sqrt((double) local27) + 0.99D);
		this.aShort86 = (short) (int) (Math.sqrt((double) local29) + 0.99D);
		this.aBoolean489 = true;
	}

	@OriginalMember(owner = "client!lia", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort83 = (short) arg0;
		if (this.aClass229_10 != null) {
			this.aClass229_10.anInterface24_5 = null;
		}
		if (this.aClass229_12 != null) {
			this.aClass229_12.anInterface24_5 = null;
		}
	}

	@OriginalMember(owner = "client!lia", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean487;
	}

	@OriginalMember(owner = "client!lia", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6167; local3++) {
			this.anIntArray348[local3] = this.anIntArray348[local3] + 7 >> 4;
			this.anIntArray349[local3] = this.anIntArray349[local3] + 7 >> 4;
			this.anIntArray350[local3] = this.anIntArray350[local3] + 7 >> 4;
		}
		if (this.aClass229_11 != null) {
			this.aClass229_11.anInterface24_5 = null;
		}
		this.aBoolean489 = false;
	}

	@OriginalMember(owner = "client!lia", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean489) {
			this.method5240();
		}
		return this.aShort78;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!iu;Lclient!laa;I)V")
	@Override
	public void method5232(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class19_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6155 == 0) {
			return;
		}
		@Pc(14) Class181_Sub2 local14 = this.aClass67_Sub2_24.aClass181_Sub2_3;
		@Pc(17) Class181_Sub2 local17 = (Class181_Sub2) arg0;
		if (!this.aBoolean489) {
			this.method5240();
		}
		Static218.aFloat84 = local14.aFloat135 * local17.aFloat136 + local14.aFloat136 * local17.aFloat131 + local14.aFloat132 * local17.aFloat134;
		Static89.aFloat15 = local17.aFloat133 * local14.aFloat135 + local14.aFloat136 * local17.aFloat137 + local17.aFloat129 * local14.aFloat132 + local14.aFloat133;
		@Pc(72) float local72 = Static89.aFloat15 + (float) this.aShort81 * Static218.aFloat84;
		@Pc(80) float local80 = (float) this.aShort79 * Static218.aFloat84 + Static89.aFloat15;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local72 > local80) {
			local91 = (float) -this.aShort78 + local80;
			local97 = (float) this.aShort78 + local72;
		} else {
			local91 = local72 - (float) this.aShort78;
			local97 = local80 + (float) this.aShort78;
		}
		if (local91 >= this.aClass67_Sub2_24.aFloat71 || (float) this.aClass67_Sub2_24.anInt3919 >= local97) {
			return;
		}
		Static238.aFloat87 = local17.aFloat131 * local14.aFloat134 + local17.aFloat134 * local14.aFloat138 + local17.aFloat136 * local14.aFloat139;
		Static388.aFloat127 = local14.aFloat139 * local17.aFloat133 + local14.aFloat134 * local17.aFloat137 + local17.aFloat129 * local14.aFloat138 + local14.aFloat129;
		@Pc(175) float local175 = Static238.aFloat87 * (float) this.aShort81 + Static388.aFloat127;
		@Pc(183) float local183 = Static238.aFloat87 * (float) this.aShort79 + Static388.aFloat127;
		@Pc(198) float local198;
		@Pc(209) float local209;
		if (local175 > local183) {
			local198 = (float) this.aClass67_Sub2_24.anInt3911 * (local183 - (float) this.aShort78);
			local209 = ((float) this.aShort78 + local175) * (float) this.aClass67_Sub2_24.anInt3911;
		} else {
			local198 = (float) this.aClass67_Sub2_24.anInt3911 * (local175 - (float) this.aShort78);
			local209 = ((float) this.aShort78 + local183) * (float) this.aClass67_Sub2_24.anInt3911;
		}
		if (this.aClass67_Sub2_24.aFloat75 <= local198 / local97 || local209 / local97 <= this.aClass67_Sub2_24.aFloat67) {
			return;
		}
		Static512.aFloat162 = local14.aFloat130 * local17.aFloat136 + local17.aFloat131 * local14.aFloat131 + local17.aFloat134 * local14.aFloat140;
		Static238.aFloat88 = local17.aFloat133 * local14.aFloat130 + local17.aFloat129 * local14.aFloat140 + local17.aFloat137 * local14.aFloat131 + local14.aFloat137;
		@Pc(300) float local300 = Static238.aFloat88 + Static512.aFloat162 * (float) this.aShort81;
		@Pc(308) float local308 = Static238.aFloat88 + Static512.aFloat162 * (float) this.aShort79;
		@Pc(334) float local334;
		@Pc(323) float local323;
		if (local308 < local300) {
			local323 = (float) this.aClass67_Sub2_24.anInt3916 * (local300 + (float) this.aShort78);
			local334 = (local308 - (float) this.aShort78) * (float) this.aClass67_Sub2_24.anInt3916;
		} else {
			local323 = (float) this.aClass67_Sub2_24.anInt3916 * (local308 + (float) this.aShort78);
			local334 = (float) this.aClass67_Sub2_24.anInt3916 * (local300 - (float) this.aShort78);
		}
		if (local334 / local97 >= this.aClass67_Sub2_24.aFloat78 || this.aClass67_Sub2_24.aFloat83 >= local323 / local97) {
			return;
		}
		if (arg1 != null || this.aClass231Array1 != null) {
			Static643.aFloat195 = local14.aFloat131 * local17.aFloat140 + local14.aFloat140 * local17.aFloat138 + local14.aFloat130 * local17.aFloat132;
			Static580.aFloat180 = local17.aFloat139 * local14.aFloat132 + local17.aFloat130 * local14.aFloat136 + local17.aFloat135 * local14.aFloat135;
			Static414.aFloat128 = local14.aFloat131 * local17.aFloat130 + local14.aFloat140 * local17.aFloat139 + local17.aFloat135 * local14.aFloat130;
			Static268.aFloat89 = local17.aFloat135 * local14.aFloat139 + local14.aFloat134 * local17.aFloat130 + local17.aFloat139 * local14.aFloat138;
			Static439.aFloat155 = local14.aFloat139 * local17.aFloat132 + local14.aFloat134 * local17.aFloat140 + local14.aFloat138 * local17.aFloat138;
			Static708.aFloat200 = local14.aFloat135 * local17.aFloat132 + local17.aFloat138 * local14.aFloat132 + local17.aFloat140 * local14.aFloat136;
		}
		if (arg1 != null) {
			@Pc(499) boolean local499 = false;
			@Pc(501) boolean local501 = true;
			@Pc(510) int local510 = this.aShort84 + this.aShort85 >> 1;
			@Pc(519) int local519 = this.lb + this.aShort80 >> 1;
			@Pc(538) int local538 = (int) (Static439.aFloat155 * (float) local510 + Static388.aFloat127 + (float) this.aShort81 * Static238.aFloat87 + Static268.aFloat89 * (float) local519);
			@Pc(557) int local557 = (int) (Static643.aFloat195 * (float) local510 + Static238.aFloat88 + Static512.aFloat162 * (float) this.aShort81 + Static414.aFloat128 * (float) local519);
			@Pc(576) int local576 = (int) (Static89.aFloat15 + (float) local510 * Static708.aFloat200 + Static218.aFloat84 * (float) this.aShort81 + Static580.aFloat180 * (float) local519);
			if (this.aClass67_Sub2_24.anInt3919 > local576) {
				local499 = true;
			} else {
				arg1.anInt5948 = this.aClass67_Sub2_24.anInt3916 * local557 / local576 + this.aClass67_Sub2_24.anInt3897;
				arg1.anInt5947 = this.aClass67_Sub2_24.anInt3903 + local538 * this.aClass67_Sub2_24.anInt3911 / local576;
			}
			@Pc(637) int local637 = (int) (Static268.aFloat89 * (float) local519 + (float) this.aShort79 * Static238.aFloat87 + Static388.aFloat127 + Static439.aFloat155 * (float) local510);
			@Pc(656) int local656 = (int) (Static414.aFloat128 * (float) local519 + Static512.aFloat162 * (float) this.aShort79 + Static643.aFloat195 * (float) local510 + Static238.aFloat88);
			@Pc(675) int local675 = (int) ((float) local519 * Static580.aFloat180 + Static89.aFloat15 + Static708.aFloat200 * (float) local510 + (float) this.aShort79 * Static218.aFloat84);
			if (this.aClass67_Sub2_24.anInt3919 > local675) {
				local499 = true;
			} else {
				arg1.anInt5950 = this.aClass67_Sub2_24.anInt3911 * local637 / local675 + this.aClass67_Sub2_24.anInt3903;
				arg1.anInt5946 = this.aClass67_Sub2_24.anInt3897 + local656 * this.aClass67_Sub2_24.anInt3916 / local675;
			}
			if (local499) {
				if (this.aClass67_Sub2_24.anInt3919 > local576 && local675 < this.aClass67_Sub2_24.anInt3919) {
					local501 = false;
				} else {
					@Pc(762) int local762;
					@Pc(773) int local773;
					@Pc(800) int local800;
					if (this.aClass67_Sub2_24.anInt3919 > local576) {
						local762 = (local675 - this.aClass67_Sub2_24.anInt3919 << 16) / (local675 - local576);
						local773 = local637 + ((local637 - local538) * local762 >> 16);
						local800 = (local762 * (local656 - local557) >> 16) + local656;
						arg1.anInt5947 = this.aClass67_Sub2_24.anInt3903 + local773 * this.aClass67_Sub2_24.anInt3911 / this.aClass67_Sub2_24.anInt3919;
						arg1.anInt5948 = this.aClass67_Sub2_24.anInt3916 * local800 / this.aClass67_Sub2_24.anInt3919 + this.aClass67_Sub2_24.anInt3897;
					} else if (local675 < this.aClass67_Sub2_24.anInt3919) {
						local762 = (local576 - this.aClass67_Sub2_24.anInt3919 << 16) / (local576 - local675);
						local773 = local538 + ((local538 - local637) * local762 >> 16);
						arg1.anInt5947 = this.aClass67_Sub2_24.anInt3903 + local773 * this.aClass67_Sub2_24.anInt3911 / this.aClass67_Sub2_24.anInt3919;
						local800 = local557 + ((local557 - local656) * local762 >> 16);
						arg1.anInt5948 = this.aClass67_Sub2_24.anInt3916 * local800 / this.aClass67_Sub2_24.anInt3919 + this.aClass67_Sub2_24.anInt3897;
					}
				}
			}
			if (local501) {
				arg1.aBoolean477 = true;
				if (local675 < local576) {
					arg1.anInt5949 = this.aClass67_Sub2_24.anInt3903 + this.aClass67_Sub2_24.anInt3911 * (this.aShort78 + local538) / local576 - arg1.anInt5947;
				} else {
					arg1.anInt5949 = (this.aShort78 + local637) * this.aClass67_Sub2_24.anInt3911 / local675 + this.aClass67_Sub2_24.anInt3903 - arg1.anInt5950;
				}
			}
		}
		this.aClass67_Sub2_24.method3220();
		this.aClass67_Sub2_24.method3286(local17);
		this.method5248();
		this.aClass67_Sub2_24.method3293();
		this.method5238();
	}

	@OriginalMember(owner = "client!lia", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort83;
	}

	@OriginalMember(owner = "client!lia", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean489) {
			this.method5240();
		}
		return this.aShort80;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIIIIIBII)Z")
	private boolean method5241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < arg3 && arg1 < arg0 && arg2 > arg1) {
			return false;
		} else if (arg3 < arg1 && arg0 < arg1 && arg1 > arg2) {
			return false;
		} else if (arg7 > arg4 && arg4 < arg5 && arg6 > arg4) {
			return false;
		} else {
			return arg7 >= arg4 || arg5 >= arg4 || arg4 <= arg6;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!iu;IZ)V")
	@Override
	public void method5220(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray110 == null) {
			return;
		}
		@Pc(13) int[] local13 = new int[3];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6187; local15++) {
			if ((arg1 & this.aShortArray110[local15]) != 0) {
				if (arg2) {
					arg0.method6348(this.anIntArray348[local15], this.anIntArray349[local15], this.anIntArray350[local15], local13);
				} else {
					arg0.method6360(this.anIntArray348[local15], this.anIntArray349[local15], this.anIntArray350[local15], local13);
				}
				this.anIntArray348[local15] = local13[0];
				this.anIntArray349[local15] = local13[1];
				this.anIntArray350[local15] = local13[2];
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(ZI)V")
	private void method5243(@OriginalArg(0) boolean arg0) {
		@Pc(19) boolean local19 = this.aClass229_10 != null && this.aClass229_10.anInterface24_5 == null;
		@Pc(33) boolean local33 = this.aClass229_12 != null && this.aClass229_12.anInterface24_5 == null;
		@Pc(47) boolean local47 = this.aClass229_11 != null && this.aClass229_11.anInterface24_5 == null;
		@Pc(61) boolean local61 = this.aClass229_9 != null && this.aClass229_9.anInterface24_5 == null;
		if (arg0) {
			local19 &= (this.aByte92 & 0x2) != 0;
			local47 &= (this.aByte92 & 0x1) != 0;
			local61 &= (this.aByte92 & 0x8) != 0;
			local33 &= (this.aByte92 & 0x4) != 0;
		}
		@Pc(121) byte local121 = 0;
		@Pc(125) byte local125 = 0;
		@Pc(127) byte local127 = 0;
		@Pc(129) byte local129 = 0;
		if (local47) {
			local121 = 12;
		}
		if (local19) {
			local125 = local121;
			local121 = (byte) (local121 + 4);
		}
		if (local33) {
			local127 = local121;
			local121 = (byte) (local121 + 12);
		}
		if (local61) {
			local129 = local121;
			local121 = (byte) (local121 + 8);
		}
		if (local121 == 0) {
			return;
		}
		if (local121 * this.anInt6155 <= this.aClass67_Sub2_24.aClass3_Sub28_Sub1_3.aByteArray50.length) {
			this.aClass67_Sub2_24.aClass3_Sub28_Sub1_3.anInt6241 = 0;
		} else {
			this.aClass67_Sub2_24.aClass3_Sub28_Sub1_3 = new Class3_Sub28_Sub1(local121 * (this.anInt6155 + 100));
		}
		@Pc(217) Class3_Sub28_Sub1 local217 = this.aClass67_Sub2_24.aClass3_Sub28_Sub1_3;
		@Pc(227) int local227;
		@Pc(236) int local236;
		@Pc(264) int local264;
		@Pc(273) int local273;
		if (local47) {
			@Pc(243) int local243;
			@Pc(250) int local250;
			@Pc(255) int local255;
			@Pc(262) int local262;
			if (this.aClass67_Sub2_24.aBoolean322) {
				for (local227 = 0; local227 < this.anInt6187; local227++) {
					local236 = Stream.floatToRawIntBits((float) this.anIntArray348[local227]);
					local243 = Stream.floatToRawIntBits((float) this.anIntArray349[local227]);
					local250 = Stream.floatToRawIntBits((float) this.anIntArray350[local227]);
					local255 = this.anIntArray347[local227];
					local262 = this.anIntArray347[local227 + 1];
					for (local264 = local255; local264 < local262; local264++) {
						local273 = this.aShortArray112[local264] - 1;
						if (local273 == -1) {
							break;
						}
						local217.anInt6241 = local121 * local273;
						local217.method5311(local236);
						local217.method5311(local243);
						local217.method5311(local250);
					}
				}
			} else {
				for (local227 = 0; local227 < this.anInt6187; local227++) {
					local236 = Stream.floatToRawIntBits((float) this.anIntArray348[local227]);
					local243 = Stream.floatToRawIntBits((float) this.anIntArray349[local227]);
					local250 = Stream.floatToRawIntBits((float) this.anIntArray350[local227]);
					local255 = this.anIntArray347[local227];
					local262 = this.anIntArray347[local227 + 1];
					for (local264 = local255; local264 < local262; local264++) {
						local273 = this.aShortArray112[local264] - 1;
						if (local273 == -1) {
							break;
						}
						local217.anInt6241 = local121 * local273;
						local217.method5289(local236);
						local217.method5289(local243);
						local217.method5289(local250);
					}
				}
			}
		}
		@Pc(614) float local614;
		@Pc(514) short[] local514;
		@Pc(510) short[] local510;
		@Pc(502) short[] local502;
		@Pc(506) byte[] local506;
		@Pc(664) float local664;
		if (local19) {
			if (this.aClass229_12 == null) {
				if (this.aClass295_1 == null) {
					local514 = this.aShortArray119;
					local506 = this.aByteArray48;
					local502 = this.aShortArray120;
					local510 = this.aShortArray116;
				} else {
					local502 = this.aClass295_1.aShortArray139;
					local506 = this.aClass295_1.aByteArray91;
					local510 = this.aClass295_1.aShortArray137;
					local514 = this.aClass295_1.aShortArray138;
				}
				@Pc(534) float local534 = this.aClass67_Sub2_24.aFloatArray38[0];
				@Pc(540) float local540 = this.aClass67_Sub2_24.aFloatArray38[1];
				@Pc(546) float local546 = this.aClass67_Sub2_24.aFloatArray38[2];
				@Pc(550) float local550 = this.aClass67_Sub2_24.aFloat70;
				@Pc(560) float local560 = this.aClass67_Sub2_24.aFloat66 * 768.0F / (float) this.aShort83;
				@Pc(570) float local570 = this.aClass67_Sub2_24.aFloat81 * 768.0F / (float) this.aShort83;
				for (@Pc(572) int local572 = 0; local572 < this.anInt6180; local572++) {
					@Pc(592) int local592 = this.method5244(this.aShortArray111[local572], this.aByteArray49[local572], this.aShortArray115[local572], this.aShort82);
					@Pc(603) float local603 = (float) (local592 >> 8 & 0xFF) * this.aClass67_Sub2_24.aFloat68;
					local614 = (float) (local592 >> 16 & 0xFF) * this.aClass67_Sub2_24.aFloat76;
					@Pc(623) float local623 = (float) (local592 >>> 24) * this.aClass67_Sub2_24.aFloat77;
					@Pc(628) short local628 = this.aShortArray118[local572];
					@Pc(633) short local633 = (short) local506[local628];
					if (local633 == 0) {
						local664 = ((float) local510[local628] * local540 + local534 * (float) local514[local628] + (float) local502[local628] * local546) * 0.0026041667F;
					} else {
						local664 = ((float) local502[local628] * local546 + (float) local510[local628] * local540 + local534 * (float) local514[local628]) / (float) (local633 * 256);
					}
					@Pc(702) float local702 = local664 * (local664 < 0.0F ? local570 : local560) + local550;
					@Pc(707) int local707 = (int) (local623 * local702);
					@Pc(712) int local712 = (int) (local702 * local614);
					if (local707 < 0) {
						local707 = 0;
					} else if (local707 > 255) {
						local707 = 255;
					}
					if (local712 < 0) {
						local712 = 0;
					} else if (local712 > 255) {
						local712 = 255;
					}
					@Pc(749) int local749 = (int) (local603 * local702);
					local217.anInt6241 = local125 + local628 * local121;
					if (local749 < 0) {
						local749 = 0;
					} else if (local749 > 255) {
						local749 = 255;
					}
					local217.method5329(local707);
					local217.method5329(local712);
					local217.method5329(local749);
					local217.method5329(255 - (this.aByteArray49[local572] & 0xFF));
					local628 = this.aShortArray113[local572];
					local633 = (short) local506[local628];
					if (local633 == 0) {
						local664 = ((float) local502[local628] * local546 + local534 * (float) local514[local628] + (float) local510[local628] * local540) * 0.0026041667F;
					} else {
						local664 = (local534 * (float) local514[local628] + local540 * (float) local510[local628] + local546 * (float) local502[local628]) / (float) (local633 * 256);
					}
					local702 = (local664 < 0.0F ? local570 : local560) * local664 + local550;
					local707 = (int) (local702 * local623);
					if (local707 < 0) {
						local707 = 0;
					} else if (local707 > 255) {
						local707 = 255;
					}
					local712 = (int) (local702 * local614);
					local749 = (int) (local702 * local603);
					if (local712 < 0) {
						local712 = 0;
					} else if (local712 > 255) {
						local712 = 255;
					}
					local217.anInt6241 = local125 + local121 * local628;
					if (local749 < 0) {
						local749 = 0;
					} else if (local749 > 255) {
						local749 = 255;
					}
					local217.method5329(local707);
					local217.method5329(local712);
					local217.method5329(local749);
					local217.method5329(255 - (this.aByteArray49[local572] & 0xFF));
					local628 = this.aShortArray114[local572];
					local633 = (short) local506[local628];
					if (local633 == 0) {
						local664 = (local546 * (float) local502[local628] + local534 * (float) local514[local628] + (float) local510[local628] * local540) * 0.0026041667F;
					} else {
						local664 = (local546 * (float) local502[local628] + local540 * (float) local510[local628] + local534 * (float) local514[local628]) / (float) (local633 * 256);
					}
					local702 = (local664 < 0.0F ? local570 : local560) * local664 + local550;
					local707 = (int) (local623 * local702);
					local712 = (int) (local702 * local614);
					if (local707 < 0) {
						local707 = 0;
					} else if (local707 > 255) {
						local707 = 255;
					}
					local749 = (int) (local603 * local702);
					if (local712 < 0) {
						local712 = 0;
					} else if (local712 > 255) {
						local712 = 255;
					}
					local217.anInt6241 = local121 * local628 + local125;
					if (local749 < 0) {
						local749 = 0;
					} else if (local749 > 255) {
						local749 = 255;
					}
					local217.method5329(local707);
					local217.method5329(local712);
					local217.method5329(local749);
					local217.method5329(255 - (this.aByteArray49[local572] & 0xFF));
				}
			} else {
				for (local227 = 0; local227 < this.anInt6180; local227++) {
					local236 = this.method5244(this.aShortArray111[local227], this.aByteArray49[local227], this.aShortArray115[local227], this.aShort82);
					local217.anInt6241 = local125 + this.aShortArray118[local227] * local121;
					local217.method5311(local236);
					local217.anInt6241 = this.aShortArray113[local227] * local121 + local125;
					local217.method5311(local236);
					local217.anInt6241 = local121 * this.aShortArray114[local227] + local125;
					local217.method5311(local236);
				}
			}
		}
		if (local33) {
			if (this.aClass295_1 == null) {
				local502 = this.aShortArray120;
				local506 = this.aByteArray48;
				local514 = this.aShortArray119;
				local510 = this.aShortArray116;
			} else {
				local514 = this.aClass295_1.aShortArray138;
				local506 = this.aClass295_1.aByteArray91;
				local510 = this.aClass295_1.aShortArray137;
				local502 = this.aClass295_1.aShortArray139;
			}
			@Pc(1202) float local1202 = 3.0F / (float) this.aShort83;
			local664 = 3.0F / (float) (this.aShort83 / 2 + this.aShort83);
			local217.anInt6241 = local127;
			if (this.aClass67_Sub2_24.aBoolean322) {
				for (local264 = 0; local264 < this.anInt6155; local264++) {
					local273 = local506[local264] & 0xFF;
					if (local273 == 0) {
						local217.method4573((float) local514[local264] * local664);
						local217.method4573(local664 * (float) local510[local264]);
						local217.method4573((float) local502[local264] * local664);
					} else {
						local614 = local1202 / (float) local273;
						local217.method4573(local614 * (float) local514[local264]);
						local217.method4573((float) local510[local264] * local614);
						local217.method4573(local614 * (float) local502[local264]);
					}
					local217.anInt6241 += local121 - 12;
				}
			} else {
				for (local264 = 0; local264 < this.anInt6155; local264++) {
					local273 = local506[local264] & 0xFF;
					if (local273 == 0) {
						local217.method4574(local664 * (float) local514[local264]);
						local217.method4574(local664 * (float) local510[local264]);
						local217.method4574((float) local502[local264] * local664);
					} else {
						local614 = local1202 / (float) local273;
						local217.method4574((float) local514[local264] * local614);
						local217.method4574((float) local510[local264] * local614);
						local217.method4574((float) local502[local264] * local614);
					}
					local217.anInt6241 += local121 - 12;
				}
			}
		}
		if (local61) {
			local217.anInt6241 = local129;
			if (this.aClass67_Sub2_24.aBoolean322) {
				for (local227 = 0; local227 < this.anInt6155; local227++) {
					local217.method4573(this.aFloatArray54[local227]);
					local217.method4573(this.aFloatArray55[local227]);
					local217.anInt6241 += local121 - 8;
				}
			} else {
				for (local227 = 0; local227 < this.anInt6155; local227++) {
					local217.method4574(this.aFloatArray54[local227]);
					local217.method4574(this.aFloatArray55[local227]);
					local217.anInt6241 += local121 - 8;
				}
			}
		}
		local217.anInt6241 = this.anInt6155 * local121;
		@Pc(1547) Interface24 local1547;
		if (arg0) {
			if (this.anInterface24_6 == null) {
				this.anInterface24_6 = this.aClass67_Sub2_24.method3273(local217.anInt6241, true, local217.aByteArray50, local121);
			} else {
				this.anInterface24_6.method9135(local217.anInt6241, local217.aByteArray50, local121);
			}
			this.aByte92 = 0;
			local1547 = this.anInterface24_6;
		} else {
			local1547 = this.aClass67_Sub2_24.method3273(local217.anInt6241, false, local217.aByteArray50, local121);
			this.aBoolean486 = true;
		}
		if (local47) {
			this.aClass229_11.aByte90 = 0;
			this.aClass229_11.anInterface24_5 = local1547;
		}
		if (local61) {
			this.aClass229_9.anInterface24_5 = local1547;
			this.aClass229_9.aByte90 = local129;
		}
		if (local19) {
			this.aClass229_10.anInterface24_5 = local1547;
			this.aClass229_10.aByte90 = local125;
		}
		if (local33) {
			this.aClass229_12.aByte90 = local127;
			this.aClass229_12.anInterface24_5 = local1547;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IBISI)I")
	private int method5244(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) short arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20 = Static305.anIntArray309[Static698.method9144(arg0, arg3)];
		if (arg2 != -1) {
			@Pc(33) Class32 local33 = this.aClass67_Sub2_24.anInterface2_11.method1027(arg2 & 0xFFFF);
			@Pc(38) int local38 = local33.aByte20 & 0xFF;
			@Pc(49) int local49;
			@Pc(80) int local80;
			if (local38 != 0) {
				if (arg3 < 0) {
					local49 = 0;
				} else if (arg3 <= 127) {
					local49 = arg3 * 131586;
				} else {
					local49 = 16777215;
				}
				if (local38 == 256) {
					local20 = local49;
				} else {
					local80 = 256 - local38;
					local20 = ((local49 & 0xFF00FF) * local38 + local80 * (local20 & 0xFF00FF) & 0xFF00FF00) + (local38 * (local49 & 0xFF00) + (local20 & 0xFF00) * local80 & 0xFF0000) >> 8;
				}
			}
			local49 = local33.aByte24 & 0xFF;
			if (local49 != 0) {
				local49 += 256;
				@Pc(131) int local131 = (local20 >> 16 & 0xFF) * local49;
				if (local131 > 65535) {
					local131 = 65535;
				}
				local80 = local49 * (local20 >> 8 & 0xFF);
				if (local80 > 65535) {
					local80 = 65535;
				}
				@Pc(157) int local157 = local49 * (local20 & 0xFF);
				if (local157 > 65535) {
					local157 = 65535;
				}
				local20 = (local157 >> 8) + (local80 & 0xFF00) + ((local131 & 0x3E00FF00) << 8);
			}
		}
		return (local20 << 8) + (255 - (arg1 & 0xFF));
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(ILclient!iu;IBIZI)Z")
	private boolean method5245(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class181_Sub2 local8 = (Class181_Sub2) arg1;
		@Pc(12) Class181_Sub2 local12 = this.aClass67_Sub2_24.aClass181_Sub2_3;
		@Pc(33) float local33 = local12.aFloat129 + local8.aFloat129 * local12.aFloat138 + local12.aFloat134 * local8.aFloat137 + local8.aFloat133 * local12.aFloat139;
		@Pc(54) float local54 = local12.aFloat137 + local12.aFloat130 * local8.aFloat133 + local12.aFloat140 * local8.aFloat129 + local8.aFloat137 * local12.aFloat131;
		Static580.aFloat180 = local12.aFloat135 * local8.aFloat135 + local8.aFloat139 * local12.aFloat132 + local8.aFloat130 * local12.aFloat136;
		Static268.aFloat89 = local12.aFloat138 * local8.aFloat139 + local12.aFloat134 * local8.aFloat130 + local12.aFloat139 * local8.aFloat135;
		@Pc(111) float local111 = local8.aFloat133 * local12.aFloat135 + local8.aFloat137 * local12.aFloat136 + local12.aFloat132 * local8.aFloat129 + local12.aFloat133;
		Static439.aFloat155 = local8.aFloat132 * local12.aFloat139 + local8.aFloat138 * local12.aFloat138 + local12.aFloat134 * local8.aFloat140;
		Static643.aFloat195 = local12.aFloat130 * local8.aFloat132 + local12.aFloat131 * local8.aFloat140 + local8.aFloat138 * local12.aFloat140;
		Static414.aFloat128 = local8.aFloat139 * local12.aFloat140 + local12.aFloat131 * local8.aFloat130 + local8.aFloat135 * local12.aFloat130;
		Static238.aFloat87 = local12.aFloat139 * local8.aFloat136 + local12.aFloat138 * local8.aFloat134 + local12.aFloat134 * local8.aFloat131;
		Static512.aFloat162 = local12.aFloat130 * local8.aFloat136 + local8.aFloat131 * local12.aFloat131 + local8.aFloat134 * local12.aFloat140;
		Static218.aFloat84 = local8.aFloat136 * local12.aFloat135 + local8.aFloat131 * local12.aFloat136 + local8.aFloat134 * local12.aFloat132;
		Static708.aFloat200 = local8.aFloat138 * local12.aFloat132 + local12.aFloat136 * local8.aFloat140 + local8.aFloat132 * local12.aFloat135;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass67_Sub2_24.anInt3911;
		@Pc(255) int local255 = this.aClass67_Sub2_24.anInt3916;
		if (!this.aBoolean489) {
			this.method5240();
		}
		@Pc(272) int local272 = this.aShort85 - this.aShort84 >> 1;
		@Pc(280) int local280 = this.aShort79 - this.aShort81 >> 1;
		@Pc(288) int local288 = this.aShort80 - this.lb >> 1;
		@Pc(294) int local294 = this.aShort84 + local272;
		@Pc(308) int local308 = this.aShort81 + local280;
		@Pc(313) int local313 = local288 + this.lb;
		@Pc(320) int local320 = local294 - (local272 << arg5);
		@Pc(326) int local326 = local308 - (local280 << arg5);
		@Pc(333) int local333 = local313 - (local288 << arg5);
		@Pc(339) int local339 = (local272 << arg5) + local294;
		@Pc(346) int local346 = local308 + (local280 << arg5);
		@Pc(352) int local352 = (local288 << arg5) + local313;
		Static455.anIntArray434[0] = local320;
		Static693.anIntArray606[0] = local326;
		Static455.anIntArray434[1] = local339;
		Static531.anIntArray488[0] = local333;
		Static693.anIntArray606[1] = local326;
		Static455.anIntArray434[2] = local320;
		Static531.anIntArray488[1] = local333;
		Static693.anIntArray606[2] = local346;
		Static531.anIntArray488[2] = local333;
		Static455.anIntArray434[3] = local339;
		Static693.anIntArray606[3] = local346;
		Static531.anIntArray488[3] = local333;
		Static455.anIntArray434[4] = local320;
		Static693.anIntArray606[4] = local326;
		Static531.anIntArray488[4] = local352;
		Static455.anIntArray434[5] = local339;
		Static693.anIntArray606[5] = local326;
		Static455.anIntArray434[6] = local320;
		Static531.anIntArray488[5] = local352;
		Static693.anIntArray606[6] = local346;
		Static531.anIntArray488[6] = local352;
		Static455.anIntArray434[7] = local339;
		Static693.anIntArray606[7] = local346;
		Static531.anIntArray488[7] = local352;
		@Pc(511) float local511;
		@Pc(483) float local483;
		@Pc(497) float local497;
		@Pc(469) float local469;
		@Pc(459) float local459;
		@Pc(464) float local464;
		for (@Pc(450) int local450 = 0; local450 < 8; local450++) {
			local459 = (float) Static693.anIntArray606[local450];
			local464 = (float) Static531.anIntArray488[local450];
			local469 = (float) Static455.anIntArray434[local450];
			local483 = local54 + local459 * Static512.aFloat162 + Static643.aFloat195 * local469 + local464 * Static414.aFloat128;
			local497 = local111 + Static708.aFloat200 * local469 + local459 * Static218.aFloat84 + Static580.aFloat180 * local464;
			local511 = Static439.aFloat155 * local469 + local459 * Static238.aFloat87 + Static268.aFloat89 * local464 + local33;
			if (local497 >= (float) this.aClass67_Sub2_24.anInt3919) {
				if (arg3 > 0) {
					local497 = (float) arg3;
				}
				@Pc(537) float local537 = (float) this.aClass67_Sub2_24.anInt3903 + local511 * (float) local251 / local497;
				@Pc(549) float local549 = local483 * (float) local255 / local497 + (float) this.aClass67_Sub2_24.anInt3897;
				if (local243 < local537) {
					local243 = local537;
				}
				if (local537 < local241) {
					local241 = local537;
				}
				local239 = true;
				if (local549 > local247) {
					local247 = local549;
				}
				if (local245 > local549) {
					local245 = local549;
				}
			}
		}
		if (local239 && local241 < (float) arg2 && local243 > (float) arg2 && local245 < (float) arg0 && local247 > (float) arg0) {
			if (arg4) {
				return true;
			}
			if (this.anInt6155 > this.aClass67_Sub2_24.anIntArray197.length) {
				this.aClass67_Sub2_24.anIntArray197 = new int[this.anInt6155];
				this.aClass67_Sub2_24.anIntArray196 = new int[this.anInt6155];
			}
			@Pc(649) int[] local649 = this.aClass67_Sub2_24.anIntArray197;
			@Pc(653) int[] local653 = this.aClass67_Sub2_24.anIntArray196;
			@Pc(731) int local731;
			for (@Pc(655) int local655 = 0; local655 < this.anInt6187; local655++) {
				local464 = (float) this.anIntArray350[local655];
				local459 = (float) this.anIntArray349[local655];
				local469 = (float) this.anIntArray348[local655];
				local497 = local464 * Static580.aFloat180 + local459 * Static218.aFloat84 + Static708.aFloat200 * local469 + local111;
				local511 = local464 * Static268.aFloat89 + Static439.aFloat155 * local469 + Static238.aFloat87 * local459 + local33;
				local483 = local54 + local464 * Static414.aFloat128 + Static643.aFloat195 * local469 + local459 * Static512.aFloat162;
				@Pc(738) int local738;
				@Pc(740) int local740;
				@Pc(749) int local749;
				if ((float) this.aClass67_Sub2_24.anInt3919 <= local497) {
					if (arg3 > 0) {
						local497 = (float) arg3;
					}
					local731 = (int) ((float) this.aClass67_Sub2_24.anInt3903 + (float) local251 * local511 / local497);
					local738 = (int) ((float) local255 * local483 / local497 + (float) this.aClass67_Sub2_24.anInt3897);
					local740 = this.anIntArray347[local655];
					local749 = this.anIntArray347[local655 + 1];
					for (@Pc(823) int local823 = local740; local823 < local749; local823++) {
						@Pc(832) int local832 = this.aShortArray112[local823] - 1;
						if (local832 == -1) {
							break;
						}
						local649[local832] = local731;
						local653[local832] = local738;
					}
				} else {
					local731 = this.anIntArray347[local655];
					local738 = this.anIntArray347[local655 + 1];
					for (local740 = local731; local740 < local738; local740++) {
						local749 = this.aShortArray112[local740] - 1;
						if (local749 == -1) {
							break;
						}
						local649[this.aShortArray112[local740] - 1] = -999999;
					}
				}
			}
			for (local731 = 0; local731 < this.anInt6180; local731++) {
				if (local649[this.aShortArray118[local731]] != -999999 && local649[this.aShortArray113[local731]] != -999999 && local649[this.aShortArray114[local731]] != -999999 && this.method5241(local653[this.aShortArray113[local731]], arg0, local653[this.aShortArray114[local731]], local653[this.aShortArray118[local731]], arg2, local649[this.aShortArray113[local731]], local649[this.aShortArray114[local731]], local649[this.aShortArray118[local731]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lia", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean489) {
			this.method5240();
		}
		return this.lb;
	}

	@OriginalMember(owner = "client!lia", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class3_Sub4_Sub13 ba(@OriginalArg(0) Class3_Sub4_Sub13 arg0) {
		if (this.anInt6155 == 0) {
			return null;
		}
		if (!this.aBoolean489) {
			this.method5240();
		}
		@Pc(45) int local45;
		@Pc(62) int local62;
		if (this.aClass67_Sub2_24.anInt3901 <= 0) {
			local45 = this.aShort84 - (this.aShort81 * this.aClass67_Sub2_24.anInt3901 >> 8) >> this.aClass67_Sub2_24.anInt3875;
			local62 = this.aShort85 - (this.aShort79 * this.aClass67_Sub2_24.anInt3901 >> 8) >> this.aClass67_Sub2_24.anInt3875;
		} else {
			local45 = this.aShort84 - (this.aClass67_Sub2_24.anInt3901 * this.aShort79 >> 8) >> this.aClass67_Sub2_24.anInt3875;
			local62 = this.aShort85 - (this.aClass67_Sub2_24.anInt3901 * this.aShort81 >> 8) >> this.aClass67_Sub2_24.anInt3875;
		}
		@Pc(121) int local121;
		@Pc(138) int local138;
		if (this.aClass67_Sub2_24.anInt3894 > 0) {
			local121 = this.lb - (this.aShort79 * this.aClass67_Sub2_24.anInt3894 >> 8) >> this.aClass67_Sub2_24.anInt3875;
			local138 = this.aShort80 - (this.aShort81 * this.aClass67_Sub2_24.anInt3894 >> 8) >> this.aClass67_Sub2_24.anInt3875;
		} else {
			local121 = this.lb - (this.aShort81 * this.aClass67_Sub2_24.anInt3894 >> 8) >> this.aClass67_Sub2_24.anInt3875;
			local138 = this.aShort80 - (this.aClass67_Sub2_24.anInt3894 * this.aShort79 >> 8) >> this.aClass67_Sub2_24.anInt3875;
		}
		@Pc(181) int local181 = local62 + 1 - local45;
		@Pc(188) int local188 = local138 + 1 - local121;
		@Pc(191) Class3_Sub4_Sub13_Sub2 local191 = (Class3_Sub4_Sub13_Sub2) arg0;
		@Pc(209) Class3_Sub4_Sub13_Sub2 local209;
		if (local191 != null && local191.method6245(local181, local188)) {
			local209 = local191;
			local191.method6240();
		} else {
			local209 = new Class3_Sub4_Sub13_Sub2(this.aClass67_Sub2_24, local181, local188);
		}
		local209.method6242(local45, local138, local121, local62);
		this.method5236(local209);
		return local209;
	}

	@OriginalMember(owner = "client!lia", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6187; local3++) {
			if (arg0 != 0) {
				this.anIntArray348[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray349[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray350[local3] += arg2;
			}
		}
		this.aBoolean489 = false;
		if (this.aClass229_11 != null) {
			this.aClass229_11.anInterface24_5 = null;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class157 method5211(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) boolean local5 = false;
		@Pc(22) Class157_Sub3 local22;
		@Pc(30) Class157_Sub3 local30;
		if (arg0 > 0 && arg0 <= 7) {
			local5 = true;
			local22 = this.aClass67_Sub2_24.aClass157_Sub3Array2[arg0 - 1];
			local30 = this.aClass67_Sub2_24.aClass157_Sub3Array1[arg0 - 1];
		} else {
			local22 = local30 = new Class157_Sub3(this.aClass67_Sub2_24);
		}
		return this.method5237(arg2, local5, local30, local22, arg1);
	}

	@OriginalMember(owner = "client!lia", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt6175;
	}

	@OriginalMember(owner = "client!lia", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray34 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anInt6167; local13++) {
			this.anIntArray348[local13] <<= 0x4;
			this.anIntArray349[local13] <<= 0x4;
			this.anIntArray350[local13] <<= 0x4;
		}
		Static175.anInt10582 = 0;
		Static218.anInt4240 = 0;
		Static206.anInt11288 = 0;
		return true;
	}

	@OriginalMember(owner = "client!lia", name = "c", descriptor = "(B)V")
	private void method5248() {
		if (this.anInt6149 == 0) {
			return;
		}
		if (this.aByte92 != 0) {
			this.method5243(true);
		}
		this.method5243(false);
		if (this.aClass374_1 != null) {
			if (this.aClass374_1.anInterface11_5 == null) {
				this.method5235((this.aByte92 & 0x10) != 0);
			}
			if (this.aClass374_1.anInterface11_5 != null) {
				this.aClass67_Sub2_24.method3299(this.aClass229_12 != null);
				this.aClass67_Sub2_24.method3283(this.aClass229_9, this.aClass229_10, this.aClass229_11, this.aClass229_12);
				@Pc(89) int local89 = this.anIntArray351.length - 1;
				for (@Pc(91) int local91 = 0; local91 < local89; local91++) {
					@Pc(98) int local98 = this.anIntArray351[local91];
					@Pc(105) int local105 = this.anIntArray351[local91 + 1];
					@Pc(112) int local112 = this.aShortArray115[local98] & 0xFFFF;
					if (local112 == 65535) {
						local112 = -1;
					}
					this.aClass67_Sub2_24.method3278(local112, this.aClass229_12 != null);
					this.aClass67_Sub2_24.method3232(this.aClass374_1.anInterface11_5, local98 * 3, (local105 - local98) * 3);
				}
			}
		}
		this.method5239(-5187);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!iq;IJIIIFIIF)S")
	private short method5249(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8) {
		@Pc(18) int local18 = this.anIntArray347[arg3];
		@Pc(25) int local25 = this.anIntArray347[arg3 + 1];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = local18; local29 < local25; local29++) {
			@Pc(38) short local38 = this.aShortArray112[local29];
			if (local38 == 0) {
				local27 = local29;
				break;
			}
			if (arg2 == Static706.aLongArray25[local29]) {
				return (short) (local38 - 1);
			}
		}
		this.aShortArray112[local27] = (short) (this.anInt6155 + 1);
		Static706.aLongArray25[local27] = arg2;
		this.aShortArray119[this.anInt6155] = (short) arg7;
		this.aShortArray116[this.anInt6155] = (short) arg6;
		this.aShortArray120[this.anInt6155] = (short) arg4;
		this.aByteArray48[this.anInt6155] = (byte) arg1;
		this.aFloatArray54[this.anInt6155] = arg5;
		this.aFloatArray55[this.anInt6155] = arg8;
		return (short) this.anInt6155++;
	}

	@OriginalMember(owner = "client!lia", name = "d", descriptor = "()V")
	@Override
	protected void method5215() {
	}
}
