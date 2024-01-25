import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nka")
public final class Class54_Sub2 extends Class54 {

	@OriginalMember(owner = "client!nka", name = "Tb", descriptor = "I")
	private int anInt6919;

	@OriginalMember(owner = "client!nka", name = "X", descriptor = "I")
	private int anInt6925;

	@OriginalMember(owner = "client!nka", name = "Zb", descriptor = "Z")
	private boolean aBoolean517;

	@OriginalMember(owner = "client!nka", name = "Cb", descriptor = "Lclient!pea;")
	private Class279 aClass279_1;

	@OriginalMember(owner = "client!nka", name = "D", descriptor = "I")
	private int anInt6930;

	@OriginalMember(owner = "client!nka", name = "yc", descriptor = "I")
	private int anInt6936;

	@OriginalMember(owner = "client!nka", name = "gc", descriptor = "Lclient!bf;")
	private Class34 aClass34_1;

	@OriginalMember(owner = "client!nka", name = "uc", descriptor = "Lclient!jj;")
	private final Class75_Sub1 aClass75_Sub1_19;

	@OriginalMember(owner = "client!nka", name = "hc", descriptor = "I")
	private int anInt6954;

	@OriginalMember(owner = "client!nka", name = "Kc", descriptor = "I")
	private int anInt6956;

	@OriginalMember(owner = "client!nka", name = "zb", descriptor = "Lclient!ca;")
	private Class50 aClass50_1;

	@OriginalMember(owner = "client!nka", name = "rc", descriptor = "Lclient!pea;")
	private Class279 aClass279_2;

	@OriginalMember(owner = "client!nka", name = "F", descriptor = "I")
	private int anInt6967;

	@OriginalMember(owner = "client!nka", name = "T", descriptor = "I")
	private int anInt6969;

	@OriginalMember(owner = "client!nka", name = "Eb", descriptor = "Lclient!pea;")
	private Class279 aClass279_3;

	@OriginalMember(owner = "client!nka", name = "tb", descriptor = "Lclient!pea;")
	private Class279 aClass279_4;

	@OriginalMember(owner = "client!nka", name = "qc", descriptor = "I")
	private int anInt6976;

	@OriginalMember(owner = "client!nka", name = "Rc", descriptor = "Z")
	private boolean aBoolean519;

	@OriginalMember(owner = "client!nka", name = "rb", descriptor = "I")
	private int anInt6982;

	@OriginalMember(owner = "client!nka", name = "ic", descriptor = "I")
	private int anInt6986;

	@OriginalMember(owner = "client!nka", name = "R", descriptor = "Z")
	private boolean aBoolean521;

	@OriginalMember(owner = "client!nka", name = "C", descriptor = "[I")
	private int[] anIntArray440;

	@OriginalMember(owner = "client!nka", name = "O", descriptor = "I")
	private int anInt6989;

	@OriginalMember(owner = "client!nka", name = "z", descriptor = "I")
	private int anInt6984;

	@OriginalMember(owner = "client!nka", name = "ib", descriptor = "Z")
	private boolean aBoolean520;

	@OriginalMember(owner = "client!nka", name = "qb", descriptor = "Z")
	private boolean aBoolean518;

	@OriginalMember(owner = "client!nka", name = "Pb", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!nka", name = "Lb", descriptor = "I")
	private int anInt6960;

	@OriginalMember(owner = "client!nka", name = "E", descriptor = "[I")
	private int[] anIntArray441;

	@OriginalMember(owner = "client!nka", name = "wb", descriptor = "[I")
	private int[] anIntArray443;

	@OriginalMember(owner = "client!nka", name = "y", descriptor = "[I")
	private int[] anIntArray442;

	@OriginalMember(owner = "client!nka", name = "Ib", descriptor = "I")
	private int anInt6966;

	@OriginalMember(owner = "client!nka", name = "eb", descriptor = "[Lclient!kw;")
	private Class216[] aClass216Array3;

	@OriginalMember(owner = "client!nka", name = "S", descriptor = "[Lclient!iia;")
	private Class173[] aClass173Array3;

	@OriginalMember(owner = "client!nka", name = "Cc", descriptor = "I")
	private int anInt6971;

	@OriginalMember(owner = "client!nka", name = "tc", descriptor = "[Lclient!al;")
	private Class19[] aClass19Array1;

	@OriginalMember(owner = "client!nka", name = "cb", descriptor = "[Lclient!uga;")
	private Class357[] aClass357Array1;

	@OriginalMember(owner = "client!nka", name = "Dc", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!nka", name = "jc", descriptor = "[F")
	private float[] aFloatArray58;

	@OriginalMember(owner = "client!nka", name = "Rb", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!nka", name = "xb", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!nka", name = "ac", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!nka", name = "mb", descriptor = "S")
	private short aShort78;

	@OriginalMember(owner = "client!nka", name = "gb", descriptor = "[F")
	private float[] aFloatArray57;

	@OriginalMember(owner = "client!nka", name = "Ac", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!nka", name = "cc", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!nka", name = "Ic", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!nka", name = "Jb", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!nka", name = "ab", descriptor = "S")
	private short aShort77;

	@OriginalMember(owner = "client!nka", name = "fc", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!nka", name = "Nb", descriptor = "[B")
	private byte[] aByteArray59;

	@OriginalMember(owner = "client!nka", name = "Ob", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!nka", name = "nc", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!nka", name = "hb", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!nka", name = "Gc", descriptor = "[B")
	private byte[] aByteArray58;

	@OriginalMember(owner = "client!nka", name = "fb", descriptor = "[I")
	private int[] anIntArray438;

	@OriginalMember(owner = "client!nka", name = "J", descriptor = "[I")
	private int[] anIntArray444;

	@OriginalMember(owner = "client!nka", name = "Yb", descriptor = "[I")
	private int[] anIntArray439;

	@OriginalMember(owner = "client!nka", name = "ub", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!nka", name = "pc", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!nka", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!nka", name = "<init>", descriptor = "(Lclient!jj;Lclient!rha;IIII)V")
	public Class54_Sub2(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) Class316 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface11 local11 = arg0.anInterface11_10;
		this.anIntArray440 = new int[arg1.anInt8603 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt8614];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt8614; local24++) {
			if (arg1.aByteArray90 == null || arg1.aByteArray90[local24] != 2) {
				if (arg1.aShortArray133 != null && arg1.aShortArray133[local24] != -1) {
					@Pc(63) Class297 local63 = local11.method6027(arg1.aShortArray133[local24] & 0xFFFF);
					if (((this.anInt6954 & 0x40) == 0 || !local63.aBoolean625) && local63.aBoolean627) {
						continue;
					}
				}
				local22[this.anInt6989++] = local24;
				this.anIntArray440[arg1.aShortArray131[local24]]++;
				this.anIntArray440[arg1.aShortArray125[local24]]++;
				this.anIntArray440[arg1.aShortArray129[local24]]++;
			}
		}
		this.anInt6984 = this.anInt6989;
		@Pc(144) long[] local144 = new long[this.anInt6989];
		@Pc(156) boolean local156 = (this.anInt6936 & 0x100) != 0;
		@Pc(170) int local170;
		@Pc(183) int local183;
		@Pc(361) int local361;
		for (@Pc(158) int local158 = 0; local158 < this.anInt6989; local158++) {
			@Pc(166) int local166 = local22[local158];
			@Pc(168) Class297 local168 = null;
			local170 = 0;
			@Pc(172) byte local172 = 0;
			@Pc(174) byte local174 = 0;
			@Pc(176) byte local176 = 0;
			if (arg1.aClass395Array1 != null) {
				@Pc(181) boolean local181 = false;
				for (local183 = 0; local183 < arg1.aClass395Array1.length; local183++) {
					@Pc(190) Class395 local190 = arg1.aClass395Array1[local183];
					if (local166 == local190.anInt10374) {
						@Pc(199) Class399 local199 = Static634.method8589(local190.anInt10370);
						if (local199.aBoolean779) {
							local181 = true;
						}
						if (local199.anInt10492 != -1) {
							@Pc(214) Class297 local214 = local11.method6027(local199.anInt10492);
							if (local214.anInt8252 == 2) {
								this.aBoolean520 = true;
							}
						}
					}
				}
				if (local181) {
					local144[local158] = Long.MAX_VALUE;
					this.anInt6984--;
					continue;
				}
			}
			@Pc(249) short local249 = -1;
			if (arg1.aShortArray133 != null) {
				local249 = arg1.aShortArray133[local166];
				if (local249 != -1) {
					local168 = local11.method6027(local249 & 0xFFFF);
					if ((this.anInt6954 & 0x40) != 0 && local168.aBoolean625) {
						local168 = null;
						local249 = -1;
					} else {
						local176 = local168.aByte122;
						local174 = local168.aByte124;
					}
				}
			}
			@Pc(319) boolean local319 = arg1.aByteArray94 != null && arg1.aByteArray94[local166] != 0 || local168 != null && local168.anInt8252 != 0;
			if ((local156 || local319) && arg1.aByteArray91 != null) {
				local170 += arg1.aByteArray91[local166] << 17;
			}
			if (local319) {
				local170 += 65536;
			}
			local170 += (local174 & 0xFF) << 8;
			local361 = local172 + ((local249 & 0xFFFF) << 16);
			local170 += local176 & 0xFF;
			@Pc(373) int local373 = local361 + (local158 & 0xFFFF);
			local144[local158] = (long) local373 + ((long) local170 << 32);
			this.aBoolean518 |= local168 != null && (local168.aByte121 != 0 || local168.aByte119 != 0);
			this.aBoolean520 |= local319;
		}
		Static677.method8633(local22, local144);
		this.aShortArray74 = arg1.aShortArray124;
		this.anInt6960 = arg1.anInt8599;
		this.anIntArray441 = arg1.anIntArray570;
		this.anIntArray443 = arg1.anIntArray574;
		this.anIntArray442 = arg1.anIntArray575;
		this.anInt6966 = arg1.anInt8603;
		this.aClass216Array3 = arg1.aClass216Array5;
		this.aClass173Array3 = arg1.aClass173Array5;
		@Pc(466) Class269[] local466 = new Class269[this.anInt6966];
		@Pc(486) int local486;
		@Pc(502) int local502;
		@Pc(554) int local554;
		if (arg1.aClass395Array1 != null) {
			this.anInt6971 = arg1.aClass395Array1.length;
			this.aClass19Array1 = new Class19[this.anInt6971];
			this.aClass357Array1 = new Class357[this.anInt6971];
			for (local486 = 0; local486 < this.anInt6971; local486++) {
				@Pc(495) Class395 local495 = arg1.aClass395Array1[local486];
				@Pc(500) Class399 local500 = Static634.method8589(local495.anInt10370);
				local502 = -1;
				for (@Pc(504) int local504 = 0; local504 < this.anInt6989; local504++) {
					if (local22[local504] == local495.anInt10374) {
						local502 = local504;
						break;
					}
				}
				if (local502 == -1) {
					throw new RuntimeException();
				}
				local554 = Static229.anIntArray228[arg1.aShortArray132[local495.anInt10374] & 0xFFFF] & 0xFFFFFF;
				@Pc(572) int local572 = local554 | 255 - (arg1.aByteArray94 == null ? 0 : arg1.aByteArray94[local495.anInt10374]) << 24;
				this.aClass357Array1[local486] = new Class357(local502, arg1.aShortArray131[local495.anInt10374], arg1.aShortArray125[local495.anInt10374], arg1.aShortArray129[local495.anInt10374], local500.anInt10493, local500.anInt10495, local500.anInt10492, local500.anInt10494, local500.anInt10496, local500.aBoolean779, local500.aBoolean778, local495.anInt10373);
				this.aClass19Array1[local486] = new Class19(local572);
			}
		}
		local486 = this.anInt6989 * 3;
		this.aShortArray76 = new short[this.anInt6989];
		this.aFloatArray58 = new float[local486];
		this.aShortArray77 = new short[this.anInt6989];
		this.aShortArray69 = new short[this.anInt6989];
		this.aShortArray73 = new short[this.anInt6989];
		this.aShort78 = (short) arg3;
		this.aFloatArray57 = new float[local486];
		this.aShortArray67 = new short[local486];
		this.aShortArray65 = new short[local486];
		this.aShortArray71 = new short[local486];
		this.aShortArray72 = new short[local486];
		this.aShort77 = (short) arg4;
		Static326.aLongArray15 = new long[local486];
		this.aShortArray66 = new short[local486];
		this.aByteArray59 = new byte[local486];
		this.aShortArray68 = new short[this.anInt6989];
		if (arg1.aShortArray127 != null) {
			this.aShortArray75 = new short[this.anInt6989];
		}
		this.aShortArray70 = new short[local486];
		this.aByteArray58 = new byte[this.anInt6989];
		local170 = 0;
		for (local361 = 0; local361 < arg1.anInt8603; local361++) {
			local502 = this.anIntArray440[local361];
			this.anIntArray440[local361] = local170;
			local466[local361] = new Class269();
			local170 += local502;
		}
		this.anIntArray440[arg1.anInt8603] = local170;
		@Pc(774) Class18 local774 = Static452.method6947(this.anInt6989, local22, arg1);
		@Pc(778) Class273[] local778 = new Class273[arg1.anInt8614];
		@Pc(820) int local820;
		@Pc(831) int local831;
		@Pc(842) int local842;
		@Pc(799) short local799;
		@Pc(810) int local810;
		for (local554 = 0; local554 < arg1.anInt8614; local554++) {
			@Pc(789) short local789 = arg1.aShortArray131[local554];
			@Pc(794) short local794 = arg1.aShortArray125[local554];
			local799 = arg1.aShortArray129[local554];
			local810 = this.anIntArray441[local794] - this.anIntArray441[local789];
			local820 = this.anIntArray442[local794] - this.anIntArray442[local789];
			local831 = this.anIntArray443[local794] - this.anIntArray443[local789];
			local842 = this.anIntArray441[local799] - this.anIntArray441[local789];
			@Pc(852) int local852 = this.anIntArray442[local799] - this.anIntArray442[local789];
			@Pc(863) int local863 = this.anIntArray443[local799] - this.anIntArray443[local789];
			@Pc(871) int local871 = local820 * local863 - local831 * local852;
			@Pc(880) int local880 = local831 * local842 - local810 * local863;
			@Pc(889) int local889 = local810 * local852 - local842 * local820;
			while (local871 > 8192 || local880 > 8192 || local889 > 8192 || local871 < -8192 || local880 < -8192 || local889 < -8192) {
				local880 >>= 0x1;
				local889 >>= 0x1;
				local871 >>= 0x1;
			}
			@Pc(945) int local945 = (int) Math.sqrt((double) (local880 * local880 + local871 * local871 + local889 * local889));
			if (local945 <= 0) {
				local945 = 1;
			}
			local880 = local880 * 256 / local945;
			local871 = local871 * 256 / local945;
			local889 = local889 * 256 / local945;
			@Pc(981) byte local981 = arg1.aByteArray90 == null ? 0 : arg1.aByteArray90[local554];
			if (local981 == 0) {
				@Pc(1013) Class269 local1013 = local466[local789];
				local1013.anInt7299++;
				local1013.anInt7303 += local889;
				local1013.anInt7301 += local880;
				local1013.anInt7304 += local871;
				@Pc(1041) Class269 local1041 = local466[local794];
				local1041.anInt7303 += local889;
				local1041.anInt7299++;
				local1041.anInt7304 += local871;
				local1041.anInt7301 += local880;
				@Pc(1069) Class269 local1069 = local466[local799];
				local1069.anInt7304 += local871;
				local1069.anInt7299++;
				local1069.anInt7301 += local880;
				local1069.anInt7303 += local889;
			} else if (local981 == 1) {
				@Pc(998) Class273 local998 = local778[local554] = new Class273();
				local998.anInt7434 = local871;
				local998.anInt7431 = local880;
				local998.anInt7430 = local889;
			}
		}
		@Pc(1114) int local1114;
		@Pc(1158) short local1158;
		for (local183 = 0; local183 < this.anInt6989; local183++) {
			local1114 = local22[local183];
			@Pc(1121) int local1121 = arg1.aShortArray132[local1114] & 0xFFFF;
			if (arg1.aByteArray93 == null) {
				local810 = -1;
			} else {
				local810 = arg1.aByteArray93[local1114];
			}
			if (arg1.aByteArray94 == null) {
				local820 = 0;
			} else {
				local820 = arg1.aByteArray94[local1114] & 0xFF;
			}
			local1158 = arg1.aShortArray133 == null ? -1 : arg1.aShortArray133[local1114];
			if (local1158 != -1 && (this.anInt6954 & 0x40) != 0) {
				@Pc(1178) Class297 local1178 = local11.method6027(local1158 & 0xFFFF);
				if (local1178.aBoolean625) {
					local1158 = -1;
				}
			}
			@Pc(1185) float local1185 = 0.0F;
			@Pc(1187) float local1187 = 0.0F;
			@Pc(1189) float local1189 = 0.0F;
			@Pc(1191) float local1191 = 0.0F;
			@Pc(1193) float local1193 = 0.0F;
			@Pc(1195) float local1195 = 0.0F;
			@Pc(1197) byte local1197 = 0;
			@Pc(1199) byte local1199 = 0;
			@Pc(1201) int local1201 = 0;
			@Pc(1237) byte local1237;
			@Pc(1254) short local1254;
			@Pc(1259) short local1259;
			@Pc(1264) short local1264;
			if (local1158 != -1) {
				if (local810 == -1) {
					local1191 = 1.0F;
					local1187 = 1.0F;
					local1199 = 2;
					local1189 = 1.0F;
					local1197 = 1;
					local1195 = 0.0F;
					local1185 = 0.0F;
					local1193 = 0.0F;
				} else {
					local810 &= 0xFF;
					local1237 = arg1.aByteArray96[local810];
					@Pc(1244) short local1244;
					@Pc(1249) short local1249;
					@Pc(1287) float local1287;
					@Pc(1296) float local1296;
					@Pc(1304) float local1304;
					@Pc(1391) float local1391;
					@Pc(1400) float local1400;
					@Pc(1409) float local1409;
					@Pc(1417) float local1417;
					@Pc(1425) float local1425;
					@Pc(1433) float local1433;
					if (local1237 == 0) {
						local1244 = arg1.aShortArray131[local1114];
						local1249 = arg1.aShortArray125[local1114];
						local1254 = arg1.aShortArray129[local1114];
						local1259 = arg1.aShortArray126[local810];
						local1264 = arg1.aShortArray128[local810];
						@Pc(1269) short local1269 = arg1.aShortArray130[local810];
						@Pc(1275) float local1275 = (float) arg1.anIntArray570[local1259];
						@Pc(1281) float local1281 = (float) arg1.anIntArray575[local1259];
						local1287 = (float) arg1.anIntArray574[local1259];
						local1296 = (float) arg1.anIntArray570[local1264] - local1275;
						local1304 = (float) arg1.anIntArray575[local1264] - local1281;
						@Pc(1313) float local1313 = (float) arg1.anIntArray574[local1264] - local1287;
						@Pc(1322) float local1322 = (float) arg1.anIntArray570[local1269] - local1275;
						@Pc(1330) float local1330 = (float) arg1.anIntArray575[local1269] - local1281;
						@Pc(1338) float local1338 = (float) arg1.anIntArray574[local1269] - local1287;
						@Pc(1346) float local1346 = (float) arg1.anIntArray570[local1244] - local1275;
						@Pc(1355) float local1355 = (float) arg1.anIntArray575[local1244] - local1281;
						@Pc(1364) float local1364 = (float) arg1.anIntArray574[local1244] - local1287;
						@Pc(1373) float local1373 = (float) arg1.anIntArray570[local1249] - local1275;
						@Pc(1382) float local1382 = (float) arg1.anIntArray575[local1249] - local1281;
						local1391 = (float) arg1.anIntArray574[local1249] - local1287;
						local1400 = (float) arg1.anIntArray570[local1254] - local1275;
						local1409 = (float) arg1.anIntArray575[local1254] - local1281;
						local1417 = (float) arg1.anIntArray574[local1254] - local1287;
						local1425 = local1304 * local1338 - local1313 * local1330;
						local1433 = local1322 * local1313 - local1338 * local1296;
						@Pc(1442) float local1442 = local1330 * local1296 - local1322 * local1304;
						@Pc(1451) float local1451 = local1330 * local1442 - local1338 * local1433;
						@Pc(1460) float local1460 = local1425 * local1338 - local1442 * local1322;
						@Pc(1469) float local1469 = local1433 * local1322 - local1425 * local1330;
						@Pc(1483) float local1483 = 1.0F / (local1469 * local1313 + local1451 * local1296 + local1304 * local1460);
						local1185 = local1483 * (local1469 * local1364 + local1451 * local1346 + local1460 * local1355);
						local1189 = local1483 * (local1391 * local1469 + local1373 * local1451 + local1382 * local1460);
						local1193 = (local1460 * local1409 + local1400 * local1451 + local1417 * local1469) * local1483;
						@Pc(1534) float local1534 = local1304 * local1442 - local1313 * local1433;
						@Pc(1542) float local1542 = local1313 * local1425 - local1442 * local1296;
						@Pc(1551) float local1551 = local1296 * local1433 - local1425 * local1304;
						@Pc(1565) float local1565 = 1.0F / (local1551 * local1338 + local1330 * local1542 + local1322 * local1534);
						local1187 = local1565 * (local1364 * local1551 + local1542 * local1355 + local1346 * local1534);
						local1195 = local1565 * (local1417 * local1551 + local1400 * local1534 + local1409 * local1542);
						local1191 = (local1551 * local1391 + local1542 * local1382 + local1534 * local1373) * local1565;
					} else {
						local1244 = arg1.aShortArray131[local1114];
						local1249 = arg1.aShortArray125[local1114];
						local1254 = arg1.aShortArray129[local1114];
						@Pc(1629) int local1629 = local774.anIntArray13[local810];
						@Pc(1634) int local1634 = local774.anIntArray14[local810];
						@Pc(1639) int local1639 = local774.anIntArray16[local810];
						@Pc(1644) float[] local1644 = local774.aFloatArrayArray1[local810];
						@Pc(1649) byte local1649 = arg1.aByteArray92[local810];
						local1287 = (float) arg1.anIntArray566[local810] / 256.0F;
						if (local1237 == 1) {
							local1296 = (float) arg1.anIntArray567[local810] / 1024.0F;
							Static569.method7984(local1649, Static268.aFloatArray48, local1634, local1639, arg1.anIntArray570[local1244], arg1.anIntArray574[local1244], arg1.anIntArray575[local1244], local1287, local1296, local1644, local1629);
							local1187 = Static268.aFloatArray48[1];
							local1185 = Static268.aFloatArray48[0];
							Static569.method7984(local1649, Static268.aFloatArray48, local1634, local1639, arg1.anIntArray570[local1249], arg1.anIntArray574[local1249], arg1.anIntArray575[local1249], local1287, local1296, local1644, local1629);
							local1191 = Static268.aFloatArray48[1];
							local1189 = Static268.aFloatArray48[0];
							Static569.method7984(local1649, Static268.aFloatArray48, local1634, local1639, arg1.anIntArray570[local1254], arg1.anIntArray574[local1254], arg1.anIntArray575[local1254], local1287, local1296, local1644, local1629);
							local1195 = Static268.aFloatArray48[1];
							local1193 = Static268.aFloatArray48[0];
							local1304 = local1296 / 2.0F;
							if ((local1649 & 0x1) == 0) {
								if (local1189 - local1185 > local1304) {
									local1189 -= local1296;
									local1197 = 1;
								} else if (local1185 - local1189 > local1304) {
									local1189 += local1296;
									local1197 = 2;
								}
								if (local1193 - local1185 > local1304) {
									local1199 = 1;
									local1193 -= local1296;
								} else if (local1185 - local1193 > local1304) {
									local1193 += local1296;
									local1199 = 2;
								}
							} else {
								if (local1304 < local1195 - local1187) {
									local1199 = 1;
									local1195 -= local1296;
								} else if (local1304 < local1187 - local1195) {
									local1195 += local1296;
									local1199 = 2;
								}
								if (local1304 < local1191 - local1187) {
									local1191 -= local1296;
									local1197 = 1;
								} else if (local1187 - local1191 > local1304) {
									local1191 += local1296;
									local1197 = 2;
								}
							}
						} else if (local1237 == 2) {
							local1296 = (float) arg1.anIntArray568[local810] / 256.0F;
							local1304 = (float) arg1.anIntArray576[local810] / 256.0F;
							@Pc(2150) int local2150 = arg1.anIntArray570[local1249] - arg1.anIntArray570[local1244];
							@Pc(2161) int local2161 = arg1.anIntArray575[local1249] - arg1.anIntArray575[local1244];
							@Pc(2172) int local2172 = arg1.anIntArray574[local1249] - arg1.anIntArray574[local1244];
							@Pc(2183) int local2183 = arg1.anIntArray570[local1254] - arg1.anIntArray570[local1244];
							@Pc(2194) int local2194 = arg1.anIntArray575[local1254] - arg1.anIntArray575[local1244];
							@Pc(2204) int local2204 = arg1.anIntArray574[local1254] - arg1.anIntArray574[local1244];
							@Pc(2213) int local2213 = local2204 * local2161 - local2194 * local2172;
							@Pc(2222) int local2222 = local2183 * local2172 - local2204 * local2150;
							@Pc(2230) int local2230 = local2150 * local2194 - local2183 * local2161;
							local1391 = 64.0F / (float) arg1.anIntArray571[local810];
							local1400 = 64.0F / (float) arg1.anIntArray573[local810];
							local1409 = 64.0F / (float) arg1.anIntArray567[local810];
							local1417 = ((float) local2230 * local1644[2] + local1644[0] * (float) local2213 + (float) local2222 * local1644[1]) / local1391;
							local1425 = ((float) local2230 * local1644[5] + (float) local2213 * local1644[3] + (float) local2222 * local1644[4]) / local1400;
							local1433 = (local1644[7] * (float) local2222 + local1644[6] * (float) local2213 + (float) local2230 * local1644[8]) / local1409;
							local1201 = Static524.method7531(local1425, local1417, local1433);
							Static252.method8469(local1634, local1201, arg1.anIntArray575[local1244], local1639, arg1.anIntArray574[local1244], local1287, local1304, local1296, Static268.aFloatArray48, arg1.anIntArray570[local1244], local1629, local1644, local1649);
							local1187 = Static268.aFloatArray48[1];
							local1185 = Static268.aFloatArray48[0];
							Static252.method8469(local1634, local1201, arg1.anIntArray575[local1249], local1639, arg1.anIntArray574[local1249], local1287, local1304, local1296, Static268.aFloatArray48, arg1.anIntArray570[local1249], local1629, local1644, local1649);
							local1191 = Static268.aFloatArray48[1];
							local1189 = Static268.aFloatArray48[0];
							Static252.method8469(local1634, local1201, arg1.anIntArray575[local1254], local1639, arg1.anIntArray574[local1254], local1287, local1304, local1296, Static268.aFloatArray48, arg1.anIntArray570[local1254], local1629, local1644, local1649);
							local1193 = Static268.aFloatArray48[0];
							local1195 = Static268.aFloatArray48[1];
						} else if (local1237 == 3) {
							Static96.method1396(local1629, arg1.anIntArray570[local1244], local1639, local1634, arg1.anIntArray574[local1244], local1644, local1649, arg1.anIntArray575[local1244], Static268.aFloatArray48, local1287);
							local1185 = Static268.aFloatArray48[0];
							local1187 = Static268.aFloatArray48[1];
							Static96.method1396(local1629, arg1.anIntArray570[local1249], local1639, local1634, arg1.anIntArray574[local1249], local1644, local1649, arg1.anIntArray575[local1249], Static268.aFloatArray48, local1287);
							local1189 = Static268.aFloatArray48[0];
							local1191 = Static268.aFloatArray48[1];
							Static96.method1396(local1629, arg1.anIntArray570[local1254], local1639, local1634, arg1.anIntArray574[local1254], local1644, local1649, arg1.anIntArray575[local1254], Static268.aFloatArray48, local1287);
							local1195 = Static268.aFloatArray48[1];
							local1193 = Static268.aFloatArray48[0];
							if ((local1649 & 0x1) == 0) {
								if (local1193 - local1185 > 0.5F) {
									local1193--;
									local1199 = 1;
								} else if (local1185 - local1193 > 0.5F) {
									local1193++;
									local1199 = 2;
								}
								if (local1189 - local1185 > 0.5F) {
									local1189--;
									local1197 = 1;
								} else if (local1185 - local1189 > 0.5F) {
									local1197 = 2;
									local1189++;
								}
							} else {
								if (local1191 - local1187 > 0.5F) {
									local1197 = 1;
									local1191--;
								} else if (local1187 - local1191 > 0.5F) {
									local1197 = 2;
									local1191++;
								}
								if (local1195 - local1187 > 0.5F) {
									local1199 = 1;
									local1195--;
								} else if (local1187 - local1195 > 0.5F) {
									local1199 = 2;
									local1195++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray90 == null) {
				local1237 = 0;
			} else {
				local1237 = arg1.aByteArray90[local1114];
			}
			if (local1237 == 0) {
				@Pc(2461) long local2461 = (long) (local810 << 2) + ((long) (local1121 << 8) + (long) (local1201 << 24) + (long) local820 << 32);
				local1254 = arg1.aShortArray131[local1114];
				local1259 = arg1.aShortArray125[local1114];
				local1264 = arg1.aShortArray129[local1114];
				@Pc(2480) Class269 local2480 = local466[local1254];
				this.aShortArray76[local183] = this.method6159(local1187, local2461, local1185, local2480.anInt7299, local1254, local183, arg1, local2480.anInt7301, local2480.anInt7304, local2480.anInt7303);
				@Pc(2505) Class269 local2505 = local466[local1259];
				this.aShortArray69[local183] = this.method6159(local1191, local2461 + (long) local1197, local1189, local2505.anInt7299, local1259, local183, arg1, local2505.anInt7301, local2505.anInt7304, local2505.anInt7303);
				@Pc(2533) Class269 local2533 = local466[local1264];
				this.aShortArray68[local183] = this.method6159(local1195, local2461 + (long) local1199, local1193, local2533.anInt7299, local1264, local183, arg1, local2533.anInt7301, local2533.anInt7304, local2533.anInt7303);
			} else if (local1237 == 1) {
				@Pc(2568) Class273 local2568 = local778[local1114];
				@Pc(2611) long local2611 = ((long) (local1121 << 8) + (long) (local1201 << 24) + (long) local820 << 32) + (long) ((local2568.anInt7430 + 256 << 22) + ((local810 << 2) - (-(local2568.anInt7434 <= 0 ? 2048 : 1024) - (local2568.anInt7431 + 256 << 12))));
				this.aShortArray76[local183] = this.method6159(local1187, local2611, local1185, 0, arg1.aShortArray131[local1114], local183, arg1, local2568.anInt7431, local2568.anInt7434, local2568.anInt7430);
				this.aShortArray69[local183] = this.method6159(local1191, local2611 + (long) local1197, local1189, 0, arg1.aShortArray125[local1114], local183, arg1, local2568.anInt7431, local2568.anInt7434, local2568.anInt7430);
				this.aShortArray68[local183] = this.method6159(local1195, local2611 + (long) local1199, local1193, 0, arg1.aShortArray129[local1114], local183, arg1, local2568.anInt7431, local2568.anInt7434, local2568.anInt7430);
			}
			if (arg1.aByteArray94 != null) {
				this.aByteArray58[local183] = arg1.aByteArray94[local1114];
			}
			if (arg1.aShortArray127 != null) {
				this.aShortArray75[local183] = arg1.aShortArray127[local1114];
			}
			this.aShortArray73[local183] = arg1.aShortArray132[local1114];
			this.aShortArray77[local183] = local1158;
		}
		if (this.anInt6984 > 0) {
			local1114 = 1;
			local799 = this.aShortArray77[0];
			for (local810 = 0; local810 < this.anInt6984; local810++) {
				@Pc(2757) short local2757 = this.aShortArray77[local810];
				if (local799 != local2757) {
					local1114++;
					local799 = local2757;
				}
			}
			this.anIntArray438 = new int[local1114 + 1];
			this.anIntArray444 = new int[local1114];
			this.anIntArray439 = new int[local1114];
			this.anIntArray438[0] = 0;
			local820 = this.anInt6969;
			local1158 = 0;
			local1114 = 0;
			local799 = this.aShortArray77[0];
			for (local842 = 0; local842 < this.anInt6984; local842++) {
				@Pc(2816) short local2816 = this.aShortArray77[local842];
				if (local2816 != local799) {
					this.anIntArray439[local1114] = local820;
					this.anIntArray444[local1114] = local1158 + 1 - local820;
					local1114++;
					this.anIntArray438[local1114] = local842;
					local820 = this.anInt6969;
					local799 = local2816;
					local1158 = 0;
				}
				@Pc(2852) short local2852 = this.aShortArray76[local842];
				if (local2852 < local820) {
					local820 = local2852;
				}
				if (local2852 > local1158) {
					local1158 = local2852;
				}
				local2852 = this.aShortArray69[local842];
				if (local2852 < local820) {
					local820 = local2852;
				}
				if (local2852 > local1158) {
					local1158 = local2852;
				}
				local2852 = this.aShortArray68[local842];
				if (local1158 < local2852) {
					local1158 = local2852;
				}
				if (local820 > local2852) {
					local820 = local2852;
				}
			}
			this.anIntArray439[local1114] = local820;
			this.anIntArray444[local1114] = local1158 + 1 - local820;
			local1114++;
			this.anIntArray438[local1114] = this.anInt6984;
		}
		Static326.aLongArray15 = null;
		this.aShortArray70 = Static392.method6006(this.aShortArray70, this.anInt6969);
		this.aShortArray66 = Static392.method6006(this.aShortArray66, this.anInt6969);
		this.aShortArray67 = Static392.method6006(this.aShortArray67, this.anInt6969);
		this.aShortArray72 = Static392.method6006(this.aShortArray72, this.anInt6969);
		this.aShortArray71 = Static392.method6006(this.aShortArray71, this.anInt6969);
		this.aByteArray59 = Static84.method1234(this.aByteArray59, this.anInt6969);
		this.aFloatArray58 = Static439.method7365(this.aFloatArray58, this.anInt6969);
		this.aFloatArray57 = Static439.method7365(this.aFloatArray57, this.anInt6969);
		if (arg1.anIntArray569 != null && Static216.method3959(this.anInt6954, arg2)) {
			this.anIntArrayArray38 = arg1.method7532(false);
		}
		if (arg1.aClass395Array1 != null && Static574.method8021(this.anInt6954, arg2)) {
			this.anIntArrayArray39 = arg1.method7543();
		}
		if (arg1.anIntArray572 != null && Static94.method1358(this.anInt6954, arg2)) {
			local1114 = 0;
			@Pc(3046) int[] local3046 = new int[256];
			for (local810 = 0; local810 < this.anInt6989; local810++) {
				local820 = arg1.anIntArray572[local22[local810]];
				if (local820 >= 0) {
					@Pc(3063) int local3063 = local3046[local820]++;
					if (local820 > local1114) {
						local1114 = local820;
					}
				}
			}
			this.anIntArrayArray37 = new int[local1114 + 1][];
			for (local820 = 0; local820 <= local1114; local820++) {
				this.anIntArrayArray37[local820] = new int[local3046[local820]];
				local3046[local820] = 0;
			}
			for (local831 = 0; local831 < this.anInt6989; local831++) {
				local842 = arg1.anIntArray572[local22[local831]];
				if (local842 >= 0) {
					this.anIntArrayArray37[local842][local3046[local842]++] = local831;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nka", name = "<init>", descriptor = "(Lclient!jj;IIZZ)V")
	public Class54_Sub2(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean517 = false;
		this.anInt6966 = 0;
		this.anInt6960 = 0;
		this.anInt6969 = 0;
		this.aBoolean518 = false;
		this.anInt6989 = 0;
		this.aBoolean521 = false;
		this.anInt6984 = 0;
		this.aBoolean519 = true;
		this.aBoolean520 = false;
		this.aBoolean517 = arg4;
		this.aClass75_Sub1_19 = arg0;
		this.anInt6936 = arg1;
		this.anInt6954 = arg2;
		if (arg3 || Static153.method3056(this.anInt6954, this.anInt6936)) {
			this.aClass279_4 = new Class279(Static234.method4147(this.anInt6936, this.anInt6954));
		}
		if (arg3 || Static325.method5113(this.anInt6936, this.anInt6954)) {
			this.aClass279_3 = new Class279(Static14.method189(this.anInt6936, this.anInt6954));
		}
		if (arg3 || Static163.method3216(this.anInt6936, this.anInt6954)) {
			this.aClass279_2 = new Class279(Static165.method3263(this.anInt6936, this.anInt6954));
		}
		if (arg3 || Static26.method333(this.anInt6936, this.anInt6954)) {
			this.aClass279_1 = new Class279(Static313.method4966(this.anInt6936, this.anInt6954));
		}
		if (arg3 || Static250.method4363(this.anInt6954, this.anInt6936)) {
			this.aClass50_1 = new Class50(Static337.method5204(this.anInt6954, this.anInt6936));
		}
	}

	@OriginalMember(owner = "client!nka", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface11 local9 = this.aClass75_Sub1_19.anInterface11_10;
		for (@Pc(11) int local11 = 0; local11 < this.anInt6989; local11++) {
			if (arg0 == this.aShortArray77[local11]) {
				this.aShortArray77[local11] = arg1;
			}
		}
		@Pc(43) byte local43 = 0;
		@Pc(45) byte local45 = 0;
		if (arg0 != -1) {
			@Pc(58) Class297 local58 = local9.method6027(arg0 & 0xFFFF);
			local43 = local58.aByte118;
			local45 = local58.aByte123;
		}
		@Pc(66) byte local66 = 0;
		@Pc(68) byte local68 = 0;
		if (arg1 != -1) {
			@Pc(78) Class297 local78 = local9.method6027(arg1 & 0xFFFF);
			local68 = local78.aByte123;
			if (local78.aByte121 != 0 || local78.aByte119 != 0) {
				this.aBoolean518 = true;
			}
			local66 = local78.aByte118;
		}
		if (!(local43 != local66 | local45 != local68)) {
			return;
		}
		if (this.aClass357Array1 != null) {
			for (@Pc(127) int local127 = 0; local127 < this.anInt6971; local127++) {
				@Pc(134) Class357 local134 = this.aClass357Array1[local127];
				@Pc(139) Class19 local139 = this.aClass19Array1[local127];
				local139.anInt267 = local139.anInt267 & 0xFF000000 | Static229.anIntArray228[this.aShortArray73[local134.anInt9730] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6162();
	}

	@OriginalMember(owner = "client!nka", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean521) {
			this.method6164();
		}
		return this.anInt6919;
	}

	@OriginalMember(owner = "client!nka", name = "h", descriptor = "(I)V")
	private void method6158() {
		if (!this.aBoolean519) {
			return;
		}
		this.aBoolean519 = false;
		if (this.aClass216Array3 == null && this.aClass173Array3 == null && this.aClass357Array1 == null && !Static215.method3942(this.anInt6954, this.anInt6936)) {
			@Pc(37) boolean local37 = false;
			@Pc(39) boolean local39 = false;
			if (this.anIntArray441 != null && !Static374.method5636(this.anInt6954, this.anInt6936)) {
				if (this.aClass279_4 == null || this.aClass279_4.method6961()) {
					if (!this.aBoolean521) {
						this.method6164();
					}
					local37 = true;
				} else {
					this.aBoolean519 = true;
				}
			}
			@Pc(84) boolean local84 = false;
			if (this.anIntArray442 != null && !Static56.method672(this.anInt6936, this.anInt6954)) {
				if (this.aClass279_4 == null || this.aClass279_4.method6961()) {
					local39 = true;
					if (!this.aBoolean521) {
						this.method6164();
					}
				} else {
					this.aBoolean519 = true;
				}
			}
			if (this.anIntArray443 != null && !Static348.method5337(this.anInt6936, this.anInt6954)) {
				if (this.aClass279_4 == null || this.aClass279_4.method6961()) {
					local84 = true;
					if (!this.aBoolean521) {
						this.method6164();
					}
				} else {
					this.aBoolean519 = true;
				}
			}
			if (local37) {
				this.anIntArray441 = null;
			}
			if (local39) {
				this.anIntArray442 = null;
			}
			if (local84) {
				this.anIntArray443 = null;
			}
		}
		if (this.aShortArray65 != null && this.anIntArray441 == null && this.anIntArray442 == null && this.anIntArray443 == null) {
			this.anIntArray440 = null;
			this.aShortArray65 = null;
		}
		if (this.aByteArray59 != null && !Static95.method1363(this.anInt6954, this.anInt6936)) {
			label205: {
				label204: {
					@Pc(245) boolean local245;
					if ((this.anInt6954 & 0x37) == 0) {
						if (this.aClass279_2 == null || this.aClass279_2.method6961()) {
							break label204;
						}
						local245 = false;
					} else {
						if (this.aClass279_1 == null || this.aClass279_1.method6961()) {
							break label204;
						}
						local245 = false;
					}
					if (!local245) {
						this.aBoolean519 = true;
						break label205;
					}
				}
				this.aByteArray59 = null;
				this.aShortArray67 = this.aShortArray72 = this.aShortArray71 = null;
			}
		}
		if (this.aShortArray73 != null && !Static495.method7307(this.anInt6954, this.anInt6936)) {
			if (this.aClass279_2 == null || this.aClass279_2.method6961()) {
				this.aShortArray73 = null;
			} else {
				this.aBoolean519 = true;
			}
		}
		if (this.aByteArray58 != null && !Static226.method4055(this.anInt6936, this.anInt6954)) {
			if (this.aClass279_2 == null || this.aClass279_2.method6961()) {
				this.aByteArray58 = null;
			} else {
				this.aBoolean519 = true;
			}
		}
		if (this.aFloatArray58 != null && !Static476.method7129(this.anInt6936, this.anInt6954)) {
			if (this.aClass279_3 == null || this.aClass279_3.method6961()) {
				this.aFloatArray58 = this.aFloatArray57 = null;
			} else {
				this.aBoolean519 = true;
			}
		}
		if (this.aShortArray77 != null && !Static592.method8219(this.anInt6936, this.anInt6954)) {
			if (this.aClass279_2 == null || this.aClass279_2.method6961()) {
				this.aShortArray77 = null;
			} else {
				this.aBoolean519 = true;
			}
		}
		if (this.aShortArray76 != null && !Static346.method5314(this.anInt6936, this.anInt6954)) {
			if ((this.aClass50_1 == null || this.aClass50_1.method765()) && (this.aClass279_2 == null || this.aClass279_2.method6961())) {
				this.aShortArray76 = this.aShortArray69 = this.aShortArray68 = null;
			} else {
				this.aBoolean519 = true;
			}
		}
		if (this.aShortArray70 != null) {
			if (this.aClass279_4 == null || this.aClass279_4.method6961()) {
				this.aShortArray70 = null;
			} else {
				this.aBoolean519 = true;
			}
		}
		if (this.aShortArray66 != null) {
			if (this.aClass279_2 == null || this.aClass279_2.method6961()) {
				this.aShortArray66 = null;
			} else {
				this.aBoolean519 = true;
			}
		}
		if (this.anIntArrayArray37 != null && !Static94.method1358(this.anInt6954, this.anInt6936)) {
			this.aShortArray75 = null;
			this.anIntArrayArray37 = null;
		}
		if (this.anIntArrayArray38 != null && !Static216.method3959(this.anInt6954, this.anInt6936)) {
			this.aShortArray74 = null;
			this.anIntArrayArray38 = null;
		}
		if (this.anIntArrayArray39 != null && !Static574.method8021(this.anInt6954, this.anInt6936)) {
			this.anIntArrayArray39 = null;
		}
		if (this.anIntArray438 != null && (this.anInt6936 & 0x800) == 0 && (this.anInt6936 & 0x40000) == 0) {
			this.anIntArray444 = null;
			this.anIntArray439 = null;
			this.anIntArray438 = null;
		}
	}

	@OriginalMember(owner = "client!nka", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6966; local3++) {
			this.anIntArray443[local3] = -this.anIntArray443[local3];
		}
		for (@Pc(31) int local31 = 0; local31 < this.anInt6969; local31++) {
			this.aShortArray71[local31] = (short) -this.aShortArray71[local31];
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt6989; local58++) {
			@Pc(69) short local69 = this.aShortArray76[local58];
			this.aShortArray76[local58] = this.aShortArray68[local58];
			this.aShortArray68[local58] = local69;
		}
		this.method6160();
		this.method6161();
		this.method6168();
		this.aBoolean521 = false;
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(FJFIIILclient!rha;IIII)S")
	private short method6159(@OriginalArg(0) float arg0, @OriginalArg(1) long arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class316 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(10) int local10 = this.anIntArray440[arg4];
		@Pc(25) int local25 = this.anIntArray440[arg4 + 1];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = local10; local29 < local25; local29++) {
			@Pc(38) short local38 = this.aShortArray65[local29];
			if (local38 == 0) {
				local27 = local29;
				break;
			}
			if (arg1 == Static326.aLongArray15[local29]) {
				return (short) (local38 - 1);
			}
		}
		this.aShortArray65[local27] = (short) (this.anInt6969 + 1);
		Static326.aLongArray15[local27] = arg1;
		this.aShortArray66[this.anInt6969] = (short) arg5;
		this.aShortArray70[this.anInt6969] = (short) arg4;
		this.aShortArray67[this.anInt6969] = (short) arg8;
		this.aShortArray72[this.anInt6969] = (short) arg7;
		this.aShortArray71[this.anInt6969] = (short) arg9;
		this.aByteArray59[this.anInt6969] = (byte) arg3;
		this.aFloatArray58[this.anInt6969] = arg2;
		this.aFloatArray57[this.anInt6969] = arg0;
		return (short) this.anInt6969++;
	}

	@OriginalMember(owner = "client!nka", name = "g", descriptor = "(I)V")
	private void method6160() {
		if (this.aClass279_4 != null) {
			this.aClass279_4.aBoolean589 = false;
		}
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(IILclient!qa;ZI)Z")
	@Override
	public boolean method7417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6171(arg2, arg3, arg1, arg0, arg4, -1);
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7403(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(61) int local61;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(17) int local17;
		@Pc(43) int local43;
		@Pc(53) int[] local53;
		@Pc(55) int local55;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg3 << 4;
			local25 = arg2 << 4;
			Static614.anInt9713 = 0;
			local29 = 0;
			Static140.anInt2887 = 0;
			Static86.anInt1304 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local43 = arg1[local35];
				if (this.anIntArrayArray38.length > local43) {
					local53 = this.anIntArrayArray38[local43];
					for (local55 = 0; local55 < local53.length; local55++) {
						local61 = local53[local55];
						Static86.anInt1304 += this.anIntArray441[local61];
						Static140.anInt2887 += this.anIntArray442[local61];
						Static614.anInt9713 += this.anIntArray443[local61];
						local29++;
					}
				}
			}
			if (local29 > 0) {
				Static86.anInt1304 = Static86.anInt1304 / local29 + local25;
				Static140.anInt2887 = local21 + Static140.anInt2887 / local29;
				Static614.anInt9713 = local17 + Static614.anInt9713 / local29;
			} else {
				Static86.anInt1304 = local25;
				Static140.anInt2887 = local21;
				Static614.anInt9713 = local17;
			}
			return;
		}
		@Pc(167) int[] local167;
		@Pc(169) int local169;
		if (arg0 == 1) {
			local17 = arg4 << 4;
			local25 = arg2 << 4;
			local21 = arg3 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray38.length) {
					local167 = this.anIntArrayArray38[local35];
					for (local169 = 0; local169 < local167.length; local169++) {
						local55 = local167[local169];
						this.anIntArray441[local55] += local25;
						this.anIntArray442[local55] += local21;
						this.anIntArray443[local55] += local17;
					}
				}
			}
			return;
		}
		@Pc(288) int local288;
		@Pc(306) int local306;
		@Pc(769) int local769;
		@Pc(778) int local778;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray38.length > local35) {
					local167 = this.anIntArrayArray38[local35];
					if ((arg5 & 0x1) == 0) {
						for (local169 = 0; local169 < local167.length; local169++) {
							local55 = local167[local169];
							this.anIntArray441[local55] -= Static86.anInt1304;
							this.anIntArray442[local55] -= Static140.anInt2887;
							this.anIntArray443[local55] -= Static614.anInt9713;
							if (arg4 != 0) {
								local61 = Class6_Sub2_Sub12.anIntArray293[arg4];
								local288 = Class6_Sub2_Sub12.anIntArray292[arg4];
								local306 = this.anIntArray441[local55] * local288 + this.anIntArray442[local55] * local61 + 16383 >> 14;
								this.anIntArray442[local55] = local288 * this.anIntArray442[local55] + 16383 - this.anIntArray441[local55] * local61 >> 14;
								this.anIntArray441[local55] = local306;
							}
							if (arg2 != 0) {
								local61 = Class6_Sub2_Sub12.anIntArray293[arg2];
								local288 = Class6_Sub2_Sub12.anIntArray292[arg2];
								local306 = this.anIntArray442[local55] * local288 + 16383 - local61 * this.anIntArray443[local55] >> 14;
								this.anIntArray443[local55] = local288 * this.anIntArray443[local55] + local61 * this.anIntArray442[local55] + 16383 >> 14;
								this.anIntArray442[local55] = local306;
							}
							if (arg3 != 0) {
								local61 = Class6_Sub2_Sub12.anIntArray293[arg3];
								local288 = Class6_Sub2_Sub12.anIntArray292[arg3];
								local306 = this.anIntArray443[local55] * local61 + local288 * this.anIntArray441[local55] + 16383 >> 14;
								this.anIntArray443[local55] = this.anIntArray443[local55] * local288 + 16383 - this.anIntArray441[local55] * local61 >> 14;
								this.anIntArray441[local55] = local306;
							}
							this.anIntArray441[local55] += Static86.anInt1304;
							this.anIntArray442[local55] += Static140.anInt2887;
							this.anIntArray443[local55] += Static614.anInt9713;
						}
					} else {
						for (local169 = 0; local169 < local167.length; local169++) {
							local55 = local167[local169];
							this.anIntArray441[local55] -= Static86.anInt1304;
							this.anIntArray442[local55] -= Static140.anInt2887;
							this.anIntArray443[local55] -= Static614.anInt9713;
							if (arg2 != 0) {
								local61 = Class6_Sub2_Sub12.anIntArray293[arg2];
								local288 = Class6_Sub2_Sub12.anIntArray292[arg2];
								local306 = local288 * this.anIntArray442[local55] + 16383 - local61 * this.anIntArray443[local55] >> 14;
								this.anIntArray443[local55] = local288 * this.anIntArray443[local55] + this.anIntArray442[local55] * local61 + 16383 >> 14;
								this.anIntArray442[local55] = local306;
							}
							if (arg4 != 0) {
								local61 = Class6_Sub2_Sub12.anIntArray293[arg4];
								local288 = Class6_Sub2_Sub12.anIntArray292[arg4];
								local306 = local61 * this.anIntArray442[local55] + local288 * this.anIntArray441[local55] + 16383 >> 14;
								this.anIntArray442[local55] = local288 * this.anIntArray442[local55] + 16383 - local61 * this.anIntArray441[local55] >> 14;
								this.anIntArray441[local55] = local306;
							}
							if (arg3 != 0) {
								local61 = Class6_Sub2_Sub12.anIntArray293[arg3];
								local288 = Class6_Sub2_Sub12.anIntArray292[arg3];
								local306 = this.anIntArray441[local55] * local288 + local61 * this.anIntArray443[local55] + 16383 >> 14;
								this.anIntArray443[local55] = this.anIntArray443[local55] * local288 + 16383 - local61 * this.anIntArray441[local55] >> 14;
								this.anIntArray441[local55] = local306;
							}
							this.anIntArray441[local55] += Static86.anInt1304;
							this.anIntArray442[local55] += Static140.anInt2887;
							this.anIntArray443[local55] += Static614.anInt9713;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local43 = arg1[local35];
					if (this.anIntArrayArray38.length > local43) {
						local53 = this.anIntArrayArray38[local43];
						for (local55 = 0; local55 < local53.length; local55++) {
							local61 = local53[local55];
							local288 = this.anIntArray440[local61];
							local306 = this.anIntArray440[local61 + 1];
							for (local769 = local288; local769 < local306; local769++) {
								local778 = this.aShortArray65[local769] - 1;
								if (local778 == -1) {
									break;
								}
								@Pc(793) int local793;
								@Pc(797) int local797;
								@Pc(815) int local815;
								if (arg4 != 0) {
									local793 = Class6_Sub2_Sub12.anIntArray293[arg4];
									local797 = Class6_Sub2_Sub12.anIntArray292[arg4];
									local815 = local797 * this.aShortArray67[local778] + local793 * this.aShortArray72[local778] + 16383 >> 14;
									this.aShortArray72[local778] = (short) (local797 * this.aShortArray72[local778] + 16383 - local793 * this.aShortArray67[local778] >> 14);
									this.aShortArray67[local778] = (short) local815;
								}
								if (arg2 != 0) {
									local793 = Class6_Sub2_Sub12.anIntArray293[arg2];
									local797 = Class6_Sub2_Sub12.anIntArray292[arg2];
									local815 = this.aShortArray72[local778] * local797 + 16383 - local793 * this.aShortArray71[local778] >> 14;
									this.aShortArray71[local778] = (short) (this.aShortArray72[local778] * local793 + this.aShortArray71[local778] * local797 + 16383 >> 14);
									this.aShortArray72[local778] = (short) local815;
								}
								if (arg3 != 0) {
									local793 = Class6_Sub2_Sub12.anIntArray293[arg3];
									local797 = Class6_Sub2_Sub12.anIntArray292[arg3];
									local815 = this.aShortArray71[local778] * local793 + local797 * this.aShortArray67[local778] + 16383 >> 14;
									this.aShortArray71[local778] = (short) (local797 * this.aShortArray71[local778] + 16383 - this.aShortArray67[local778] * local793 >> 14);
									this.aShortArray67[local778] = (short) local815;
								}
							}
						}
					}
				}
				this.method6161();
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray38.length) {
					local167 = this.anIntArrayArray38[local35];
					for (local169 = 0; local169 < local167.length; local169++) {
						local55 = local167[local169];
						this.anIntArray441[local55] -= Static86.anInt1304;
						this.anIntArray442[local55] -= Static140.anInt2887;
						this.anIntArray443[local55] -= Static614.anInt9713;
						this.anIntArray441[local55] = this.anIntArray441[local55] * arg2 >> 7;
						this.anIntArray442[local55] = this.anIntArray442[local55] * arg3 >> 7;
						this.anIntArray443[local55] = this.anIntArray443[local55] * arg4 >> 7;
						this.anIntArray441[local55] += Static86.anInt1304;
						this.anIntArray442[local55] += Static140.anInt2887;
						this.anIntArray443[local55] += Static614.anInt9713;
					}
				}
			}
		} else {
			@Pc(1258) Class19 local1258;
			@Pc(1134) boolean local1134;
			@Pc(1253) Class357 local1253;
			if (arg0 == 5) {
				if (this.anIntArrayArray37 != null) {
					local1134 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (local43 < this.anIntArrayArray37.length) {
							local53 = this.anIntArrayArray37[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								local288 = arg2 * 8 + (this.aByteArray58[local61] & 0xFF);
								if (local288 < 0) {
									local288 = 0;
								} else if (local288 > 255) {
									local288 = 255;
								}
								this.aByteArray58[local61] = (byte) local288;
							}
							local1134 |= local53.length > 0;
						}
					}
					if (local1134) {
						if (this.aClass357Array1 != null) {
							for (local43 = 0; local43 < this.anInt6971; local43++) {
								local1253 = this.aClass357Array1[local43];
								local1258 = this.aClass19Array1[local43];
								local1258.anInt267 = local1258.anInt267 & 0xFFFFFF | 255 - (this.aByteArray58[local1253.anInt9730] & 0xFF) << 24;
							}
						}
						this.method6162();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray37 != null) {
					local1134 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (this.anIntArrayArray37.length > local43) {
							local53 = this.anIntArrayArray37[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								local288 = this.aShortArray73[local61] & 0xFFFF;
								local306 = local288 >> 10 & 0x3F;
								local769 = local288 >> 7 & 0x7;
								@Pc(1358) int local1358 = local306 + arg2 & 0x3F;
								local769 += arg3 / 4;
								local778 = local288 & 0x7F;
								local778 += arg4;
								if (local769 < 0) {
									local769 = 0;
								} else if (local769 > 7) {
									local769 = 7;
								}
								if (local778 < 0) {
									local778 = 0;
								} else if (local778 > 127) {
									local778 = 127;
								}
								this.aShortArray73[local61] = (short) (local1358 << 10 | local769 << 7 | local778);
							}
							local1134 |= local53.length > 0;
						}
					}
					if (local1134) {
						if (this.aClass357Array1 != null) {
							for (local43 = 0; local43 < this.anInt6971; local43++) {
								local1253 = this.aClass357Array1[local43];
								local1258 = this.aClass19Array1[local43];
								local1258.anInt267 = local1258.anInt267 & 0xFF000000 | Static229.anIntArray228[this.aShortArray73[local1253.anInt9730] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method6162();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray39 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray39.length > local35) {
							local167 = this.anIntArrayArray39[local35];
							for (local169 = 0; local169 < local167.length; local169++) {
								local1258 = this.aClass19Array1[local167[local169]];
								local1258.anInt272 += arg3;
								local1258.anInt268 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray39 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray39.length) {
							local167 = this.anIntArrayArray39[local35];
							for (local169 = 0; local169 < local167.length; local169++) {
								local1258 = this.aClass19Array1[local167[local169]];
								local1258.anInt273 = arg3 * local1258.anInt273 >> 7;
								local1258.anInt269 = local1258.anInt269 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray39 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray39.length > local35) {
						local167 = this.anIntArrayArray39[local35];
						for (local169 = 0; local169 < local167.length; local169++) {
							local1258 = this.aClass19Array1[local167[local169]];
							local1258.anInt276 = arg2 + local1258.anInt276 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nka", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort77;
	}

	@OriginalMember(owner = "client!nka", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean521) {
			this.method6164();
		}
		return this.anInt6925;
	}

	@OriginalMember(owner = "client!nka", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6989; local3++) {
			if (arg0 == this.aShortArray73[local3]) {
				this.aShortArray73[local3] = arg1;
			}
		}
		if (this.aClass357Array1 != null) {
			for (@Pc(42) int local42 = 0; local42 < this.anInt6971; local42++) {
				@Pc(49) Class357 local49 = this.aClass357Array1[local42];
				@Pc(54) Class19 local54 = this.aClass19Array1[local42];
				local54.anInt267 = local54.anInt267 & 0xFF000000 | Static229.anIntArray228[this.aShortArray73[local49.anInt9730] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6162();
	}

	@OriginalMember(owner = "client!nka", name = "b", descriptor = "(I)V")
	private void method6161() {
		if ((this.anInt6954 & 0x37) == 0) {
			if (this.aClass279_2 != null) {
				this.aClass279_2.aBoolean589 = false;
			}
		} else if (this.aClass279_1 != null) {
			this.aClass279_1.aBoolean589 = false;
		}
	}

	@OriginalMember(owner = "client!nka", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(62) int local62;
		@Pc(40) int local40;
		@Pc(54) int[] local54;
		@Pc(56) int local56;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			Static614.anInt9713 = 0;
			local26 = 0;
			Static140.anInt2887 = 0;
			Static86.anInt1304 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local40 = arg1[local32];
				if (local40 < this.anIntArrayArray38.length) {
					local54 = this.anIntArrayArray38[local40];
					for (local56 = 0; local56 < local54.length; local56++) {
						local62 = local54[local56];
						if (this.aShortArray74 == null || (arg6 & this.aShortArray74[local62]) != 0) {
							Static86.anInt1304 += this.anIntArray441[local62];
							Static140.anInt2887 += this.anIntArray442[local62];
							local26++;
							Static614.anInt9713 += this.anIntArray443[local62];
						}
					}
				}
			}
			if (local26 > 0) {
				Static140.anInt2887 = arg3 + Static140.anInt2887 / local26;
				Static266.aBoolean375 = true;
				Static86.anInt1304 = Static86.anInt1304 / local26 + arg2;
				Static614.anInt9713 = arg4 + Static614.anInt9713 / local26;
			} else {
				Static140.anInt2887 = arg3;
				Static86.anInt1304 = arg2;
				Static614.anInt9713 = arg4;
			}
			return;
		}
		@Pc(265) int[] local265;
		@Pc(267) int local267;
		if (arg0 == 1) {
			if (arg7 != null) {
				local26 = arg7[1] * arg3 + arg7[0] * arg2 + arg4 * arg7[2] + 8192 >> 14;
				local32 = arg2 * arg7[3] + arg3 * arg7[4] + arg4 * arg7[5] + 8192 >> 14;
				local40 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg4 = local40;
				arg3 = local32;
				arg2 = local26;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray38.length > local32) {
					local265 = this.anIntArrayArray38[local32];
					for (local267 = 0; local267 < local265.length; local267++) {
						local56 = local265[local267];
						if (this.aShortArray74 == null || (arg6 & this.aShortArray74[local56]) != 0) {
							this.anIntArray441[local56] += arg2;
							this.anIntArray442[local56] += arg3;
							this.anIntArray443[local56] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(398) int local398;
		@Pc(420) int local420;
		@Pc(450) int local450;
		@Pc(477) int local477;
		@Pc(481) int local481;
		@Pc(485) int local485;
		@Pc(489) int local489;
		@Pc(497) int local497;
		@Pc(505) int local505;
		@Pc(659) int local659;
		@Pc(685) int local685;
		@Pc(689) int local689;
		@Pc(697) int local697;
		@Pc(702) int local702;
		@Pc(706) int local706;
		@Pc(710) int local710;
		@Pc(712) int local712;
		@Pc(849) int[] local849;
		@Pc(851) int local851;
		@Pc(857) int local857;
		@Pc(861) int local861;
		@Pc(863) int local863;
		@Pc(997) int local997;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray38.length) {
						local265 = this.anIntArrayArray38[local32];
						for (local267 = 0; local267 < local265.length; local267++) {
							local56 = local265[local267];
							if (this.aShortArray74 == null || (arg6 & this.aShortArray74[local56]) != 0) {
								this.anIntArray441[local56] -= Static86.anInt1304;
								this.anIntArray442[local56] -= Static140.anInt2887;
								this.anIntArray443[local56] -= Static614.anInt9713;
								if (arg4 != 0) {
									local62 = Class6_Sub2_Sub12.anIntArray293[arg4];
									local398 = Class6_Sub2_Sub12.anIntArray292[arg4];
									local420 = this.anIntArray441[local56] * local398 + this.anIntArray442[local56] * local62 + 16383 >> 14;
									this.anIntArray442[local56] = local398 * this.anIntArray442[local56] + 16383 - local62 * this.anIntArray441[local56] >> 14;
									this.anIntArray441[local56] = local420;
								}
								if (arg2 != 0) {
									local62 = Class6_Sub2_Sub12.anIntArray293[arg2];
									local398 = Class6_Sub2_Sub12.anIntArray292[arg2];
									local420 = local398 * this.anIntArray442[local56] + 16383 - local62 * this.anIntArray443[local56] >> 14;
									this.anIntArray443[local56] = local62 * this.anIntArray442[local56] + local398 * this.anIntArray443[local56] + 16383 >> 14;
									this.anIntArray442[local56] = local420;
								}
								if (arg3 != 0) {
									local62 = Class6_Sub2_Sub12.anIntArray293[arg3];
									local398 = Class6_Sub2_Sub12.anIntArray292[arg3];
									local420 = local398 * this.anIntArray441[local56] + this.anIntArray443[local56] * local62 + 16383 >> 14;
									this.anIntArray443[local56] = this.anIntArray443[local56] * local398 + 16383 - local62 * this.anIntArray441[local56] >> 14;
									this.anIntArray441[local56] = local420;
								}
								this.anIntArray441[local56] += Static86.anInt1304;
								this.anIntArray442[local56] += Static140.anInt2887;
								this.anIntArray443[local56] += Static614.anInt9713;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (local40 < this.anIntArrayArray38.length) {
							local54 = this.anIntArrayArray38[local40];
							for (local56 = 0; local56 < local54.length; local56++) {
								local62 = local54[local56];
								if (this.aShortArray74 == null || (this.aShortArray74[local62] & arg6) != 0) {
									local398 = this.anIntArray440[local62];
									local420 = this.anIntArray440[local62 + 1];
									for (local450 = local398; local450 < local420; local450++) {
										local477 = this.aShortArray65[local450] - 1;
										if (local477 == -1) {
											break;
										}
										if (arg4 != 0) {
											local481 = Class6_Sub2_Sub12.anIntArray293[arg4];
											local485 = Class6_Sub2_Sub12.anIntArray292[arg4];
											local489 = local481 * this.aShortArray72[local477] + local485 * this.aShortArray67[local477] + 16383 >> 14;
											this.aShortArray72[local477] = (short) (this.aShortArray72[local477] * local485 + 16383 - this.aShortArray67[local477] * local481 >> 14);
											this.aShortArray67[local477] = (short) local489;
										}
										if (arg2 != 0) {
											local481 = Class6_Sub2_Sub12.anIntArray293[arg2];
											local485 = Class6_Sub2_Sub12.anIntArray292[arg2];
											local489 = this.aShortArray72[local477] * local485 + 16383 - local481 * this.aShortArray71[local477] >> 14;
											this.aShortArray71[local477] = (short) (this.aShortArray71[local477] * local485 + local481 * this.aShortArray72[local477] + 16383 >> 14);
											this.aShortArray72[local477] = (short) local489;
										}
										if (arg3 != 0) {
											local481 = Class6_Sub2_Sub12.anIntArray293[arg3];
											local485 = Class6_Sub2_Sub12.anIntArray292[arg3];
											local489 = local485 * this.aShortArray67[local477] + local481 * this.aShortArray71[local477] + 16383 >> 14;
											this.aShortArray71[local477] = (short) (this.aShortArray71[local477] * local485 + 16383 - this.aShortArray67[local477] * local481 >> 14);
											this.aShortArray67[local477] = (short) local489;
										}
									}
								}
							}
						}
					}
					this.method6161();
				}
			} else {
				local26 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local40 = arg7[11] << 4;
				local267 = arg7[12] << 4;
				local56 = arg7[13] << 4;
				local62 = arg7[14] << 4;
				if (Static266.aBoolean375) {
					local398 = Static614.anInt9713 * arg7[6] + arg7[0] * Static86.anInt1304 + Static140.anInt2887 * arg7[3] + 8192 >> 14;
					local420 = Static614.anInt9713 * arg7[7] + Static140.anInt2887 * arg7[4] + arg7[1] * Static86.anInt1304 + 8192 >> 14;
					local398 += local267;
					local420 += local56;
					local450 = arg7[8] * Static614.anInt9713 + arg7[5] * Static140.anInt2887 + arg7[2] * Static86.anInt1304 + 8192 >> 14;
					Static140.anInt2887 = local420;
					local450 += local62;
					Static86.anInt1304 = local398;
					Static266.aBoolean375 = false;
					Static614.anInt9713 = local450;
				}
				@Pc(465) int[] local465 = new int[9];
				local420 = Class6_Sub2_Sub12.anIntArray292[arg2];
				local450 = Class6_Sub2_Sub12.anIntArray293[arg2];
				local477 = Class6_Sub2_Sub12.anIntArray292[arg3];
				local481 = Class6_Sub2_Sub12.anIntArray293[arg3];
				local485 = Class6_Sub2_Sub12.anIntArray292[arg4];
				local489 = Class6_Sub2_Sub12.anIntArray293[arg4];
				local497 = local450 * local485 + 8192 >> 14;
				local505 = local450 * local489 + 8192 >> 14;
				local465[6] = local477 * local505 + -local481 * local485 + 8192 >> 14;
				local465[8] = local420 * local477 + 8192 >> 14;
				local465[4] = local485 * local420 + 8192 >> 14;
				local465[1] = local481 * local497 + -local477 * local489 + 8192 >> 14;
				local465[0] = local477 * local485 + local505 * local481 + 8192 >> 14;
				local465[2] = local481 * local420 + 8192 >> 14;
				local465[7] = local481 * local489 + local497 * local477 + 8192 >> 14;
				local465[5] = -local450;
				local465[3] = local489 * local420 + 8192 >> 14;
				@Pc(633) int local633 = -Static140.anInt2887 * local465[1] + local465[0] * -Static86.anInt1304 + local465[2] * -Static614.anInt9713 + 8192 >> 14;
				local659 = local465[3] * -Static86.anInt1304 + local465[4] * -Static140.anInt2887 + -Static614.anInt9713 * local465[5] + 8192 >> 14;
				local685 = -Static86.anInt1304 * local465[6] + local465[7] * -Static140.anInt2887 + local465[8] * -Static614.anInt9713 + 8192 >> 14;
				local689 = Static86.anInt1304 + local633;
				@Pc(693) int local693 = Static140.anInt2887 + local659;
				local697 = local685 + Static614.anInt9713;
				@Pc(700) int[] local700 = new int[9];
				for (local702 = 0; local702 < 3; local702++) {
					for (local706 = 0; local706 < 3; local706++) {
						local710 = 0;
						for (local712 = 0; local712 < 3; local712++) {
							local710 += arg7[local706 * 3 + local712] * local465[local712 + local702 * 3];
						}
						local700[local706 + local702 * 3] = local710 + 8192 >> 14;
					}
				}
				local706 = local465[0] * local267 + local465[1] * local56 + local62 * local465[2] + 8192 >> 14;
				local710 = local465[5] * local62 + local267 * local465[3] + local465[4] * local56 + 8192 >> 14;
				local712 = local465[7] * local56 + local465[6] * local267 + local465[8] * local62 + 8192 >> 14;
				local710 += local693;
				local706 += local689;
				local712 += local697;
				local849 = new int[9];
				for (local851 = 0; local851 < 3; local851++) {
					for (local857 = 0; local857 < 3; local857++) {
						local861 = 0;
						for (local863 = 0; local863 < 3; local863++) {
							local861 += local700[local863 * 3 + local857] * arg7[local851 * 3 + local863];
						}
						local849[local857 + local851 * 3] = local861 + 8192 >> 14;
					}
				}
				local857 = arg7[1] * local710 + local706 * arg7[0] + local712 * arg7[2] + 8192 >> 14;
				local861 = local712 * arg7[5] + local706 * arg7[3] + arg7[4] * local710 + 8192 >> 14;
				local863 = arg7[8] * local712 + local706 * arg7[6] + local710 * arg7[7] + 8192 >> 14;
				local861 += local32;
				local857 += local26;
				local863 += local40;
				for (local997 = 0; local997 < local8; local997++) {
					@Pc(1005) int local1005 = arg1[local997];
					if (local1005 < this.anIntArrayArray38.length) {
						@Pc(1015) int[] local1015 = this.anIntArrayArray38[local1005];
						for (@Pc(1017) int local1017 = 0; local1017 < local1015.length; local1017++) {
							@Pc(1023) int local1023 = local1015[local1017];
							if (this.aShortArray74 == null || (arg6 & this.aShortArray74[local1023]) != 0) {
								@Pc(1066) int local1066 = this.anIntArray442[local1023] * local849[1] + local849[0] * this.anIntArray441[local1023] + local849[2] * this.anIntArray443[local1023] + 8192 >> 14;
								@Pc(1097) int local1097 = local849[5] * this.anIntArray443[local1023] + this.anIntArray441[local1023] * local849[3] + this.anIntArray442[local1023] * local849[4] + 8192 >> 14;
								@Pc(1101) int local1101 = local1066 + local857;
								@Pc(1132) int local1132 = this.anIntArray443[local1023] * local849[8] + local849[7] * this.anIntArray442[local1023] + this.anIntArray441[local1023] * local849[6] + 8192 >> 14;
								@Pc(1136) int local1136 = local1097 + local861;
								@Pc(1140) int local1140 = local1132 + local863;
								this.anIntArray441[local1023] = local1101;
								this.anIntArray442[local1023] = local1136;
								this.anIntArray443[local1023] = local1140;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2702) Class19 local2702;
			@Pc(2573) boolean local2573;
			@Pc(2697) Class357 local2697;
			if (arg0 == 5) {
				if (this.anIntArrayArray37 != null) {
					local2573 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (this.anIntArrayArray37.length > local40) {
							local54 = this.anIntArrayArray37[local40];
							for (local56 = 0; local56 < local54.length; local56++) {
								local62 = local54[local56];
								if (this.aShortArray75 == null || (this.aShortArray75[local62] & arg6) != 0) {
									local398 = arg2 * 8 + (this.aByteArray58[local62] & 0xFF);
									if (local398 < 0) {
										local398 = 0;
									} else if (local398 > 255) {
										local398 = 255;
									}
									this.aByteArray58[local62] = (byte) local398;
								}
							}
							local2573 |= local54.length > 0;
						}
					}
					if (local2573) {
						if (this.aClass357Array1 != null) {
							for (local40 = 0; local40 < this.anInt6971; local40++) {
								local2697 = this.aClass357Array1[local40];
								local2702 = this.aClass19Array1[local40];
								local2702.anInt267 = local2702.anInt267 & 0xFFFFFF | 255 - (this.aByteArray58[local2697.anInt9730] & 0xFF) << 24;
							}
						}
						this.method6162();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray37 != null) {
					local2573 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (this.anIntArrayArray37.length > local40) {
							local54 = this.anIntArrayArray37[local40];
							for (local56 = 0; local56 < local54.length; local56++) {
								local62 = local54[local56];
								if (this.aShortArray75 == null || (arg6 & this.aShortArray75[local62]) != 0) {
									local398 = this.aShortArray73[local62] & 0xFFFF;
									local420 = local398 >> 10 & 0x3F;
									local450 = local398 >> 7 & 0x7;
									local477 = local398 & 0x7F;
									@Pc(2820) int local2820 = arg2 + local420 & 0x3F;
									local450 += arg3 / 4;
									if (local450 < 0) {
										local450 = 0;
									} else if (local450 > 7) {
										local450 = 7;
									}
									local477 += arg4;
									if (local477 < 0) {
										local477 = 0;
									} else if (local477 > 127) {
										local477 = 127;
									}
									this.aShortArray73[local62] = (short) (local450 << 7 | local2820 << 10 | local477);
								}
							}
							local2573 |= local54.length > 0;
						}
					}
					if (local2573) {
						if (this.aClass357Array1 != null) {
							for (local40 = 0; local40 < this.anInt6971; local40++) {
								local2697 = this.aClass357Array1[local40];
								local2702 = this.aClass19Array1[local40];
								local2702.anInt267 = local2702.anInt267 & 0xFF000000 | Static229.anIntArray228[this.aShortArray73[local2697.anInt9730] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method6162();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray39 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray39.length) {
							local265 = this.anIntArrayArray39[local32];
							for (local267 = 0; local267 < local265.length; local267++) {
								local2702 = this.aClass19Array1[local265[local267]];
								local2702.anInt268 += arg2;
								local2702.anInt272 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray39 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray39.length > local32) {
							local265 = this.anIntArrayArray39[local32];
							for (local267 = 0; local267 < local265.length; local267++) {
								local2702 = this.aClass19Array1[local265[local267]];
								local2702.anInt273 = arg3 * local2702.anInt273 >> 7;
								local2702.anInt269 = arg2 * local2702.anInt269 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray39 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray39.length > local32) {
						local265 = this.anIntArrayArray39[local32];
						for (local267 = 0; local267 < local265.length; local267++) {
							local2702 = this.aClass19Array1[local265[local267]];
							local2702.anInt276 = local2702.anInt276 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray38.length) {
					local265 = this.anIntArrayArray38[local32];
					for (local267 = 0; local267 < local265.length; local267++) {
						local56 = local265[local267];
						if (this.aShortArray74 == null || (this.aShortArray74[local56] & arg6) != 0) {
							this.anIntArray441[local56] -= Static86.anInt1304;
							this.anIntArray442[local56] -= Static140.anInt2887;
							this.anIntArray443[local56] -= Static614.anInt9713;
							this.anIntArray441[local56] = arg2 * this.anIntArray441[local56] >> 7;
							this.anIntArray442[local56] = this.anIntArray442[local56] * arg3 >> 7;
							this.anIntArray443[local56] = arg4 * this.anIntArray443[local56] >> 7;
							this.anIntArray441[local56] += Static86.anInt1304;
							this.anIntArray442[local56] += Static140.anInt2887;
							this.anIntArray443[local56] += Static614.anInt9713;
						}
					}
				}
			}
		} else {
			local26 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local40 = arg7[11] << 4;
			local267 = arg7[12] << 4;
			local56 = arg7[13] << 4;
			local62 = arg7[14] << 4;
			if (Static266.aBoolean375) {
				local398 = Static614.anInt9713 * arg7[6] + Static140.anInt2887 * arg7[3] + Static86.anInt1304 * arg7[0] + 8192 >> 14;
				local420 = arg7[1] * Static86.anInt1304 + Static140.anInt2887 * arg7[4] + arg7[7] * Static614.anInt9713 + 8192 >> 14;
				local450 = arg7[2] * Static86.anInt1304 + arg7[5] * Static140.anInt2887 + arg7[8] * Static614.anInt9713 + 8192 >> 14;
				local398 += local267;
				local420 += local56;
				Static140.anInt2887 = local420;
				Static86.anInt1304 = local398;
				local450 += local62;
				Static614.anInt9713 = local450;
				Static266.aBoolean375 = false;
			}
			local398 = arg2 << 15 >> 7;
			local420 = arg3 << 15 >> 7;
			local450 = arg4 << 15 >> 7;
			local477 = local398 * -Static86.anInt1304 + 8192 >> 14;
			local481 = -Static140.anInt2887 * local420 + 8192 >> 14;
			local485 = local450 * -Static614.anInt9713 + 8192 >> 14;
			local489 = Static86.anInt1304 + local477;
			local497 = local481 + Static140.anInt2887;
			local505 = Static614.anInt9713 + local485;
			@Pc(2086) int[] local2086 = new int[] { local398 * arg7[0] + 8192 >> 14, arg7[3] * local398 + 8192 >> 14, arg7[6] * local398 + 8192 >> 14, local420 * arg7[1] + 8192 >> 14, local420 * arg7[4] + 8192 >> 14, local420 * arg7[7] + 8192 >> 14, local450 * arg7[2] + 8192 >> 14, arg7[5] * local450 + 8192 >> 14, local450 * arg7[8] + 8192 >> 14 };
			local659 = local398 * local267 + 8192 >> 14;
			local685 = local56 * local420 + 8192 >> 14;
			local689 = local450 * local62 + 8192 >> 14;
			@Pc(2222) int local2222 = local685 + local497;
			@Pc(2226) int local2226 = local659 + local489;
			@Pc(2230) int local2230 = local689 + local505;
			@Pc(2233) int[] local2233 = new int[9];
			@Pc(2239) int local2239;
			for (local697 = 0; local697 < 3; local697++) {
				for (local2239 = 0; local2239 < 3; local2239++) {
					local702 = 0;
					for (local706 = 0; local706 < 3; local706++) {
						local702 += arg7[local706 + local697 * 3] * local2086[local706 * 3 + local2239];
					}
					local2233[local697 * 3 + local2239] = local702 + 8192 >> 14;
				}
			}
			local2239 = arg7[1] * local2222 + arg7[0] * local2226 + arg7[2] * local2230 + 8192 >> 14;
			local702 = arg7[5] * local2230 + arg7[4] * local2222 + arg7[3] * local2226 + 8192 >> 14;
			local702 += local32;
			local706 = arg7[8] * local2230 + arg7[6] * local2226 + arg7[7] * local2222 + 8192 >> 14;
			local2239 += local26;
			local706 += local40;
			for (local710 = 0; local710 < local8; local710++) {
				local712 = arg1[local710];
				if (this.anIntArrayArray38.length > local712) {
					local849 = this.anIntArrayArray38[local712];
					for (local851 = 0; local851 < local849.length; local851++) {
						local857 = local849[local851];
						if (this.aShortArray74 == null || (arg6 & this.aShortArray74[local857]) != 0) {
							local861 = this.anIntArray443[local857] * local2233[2] + this.anIntArray441[local857] * local2233[0] + local2233[1] * this.anIntArray442[local857] + 8192 >> 14;
							local863 = this.anIntArray441[local857] * local2233[3] + this.anIntArray442[local857] * local2233[4] + this.anIntArray443[local857] * local2233[5] + 8192 >> 14;
							@Pc(2491) int local2491 = local861 + local2239;
							local997 = this.anIntArray443[local857] * local2233[8] + local2233[6] * this.anIntArray441[local857] + local2233[7] * this.anIntArray442[local857] + 8192 >> 14;
							@Pc(2527) int local2527 = local863 + local702;
							this.anIntArray441[local857] = local2491;
							@Pc(2536) int local2536 = local997 + local706;
							this.anIntArray442[local857] = local2527;
							this.anIntArray443[local857] = local2536;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(Lclient!qa;IZ)V")
	@Override
	public void method7416(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray74 == null) {
			return;
		}
		@Pc(13) int[] local13 = new int[3];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6966; local15++) {
			if ((arg1 & this.aShortArray74[local15]) != 0) {
				if (arg2) {
					arg0.method4610(this.anIntArray441[local15], this.anIntArray442[local15], this.anIntArray443[local15], local13);
				} else {
					arg0.method4596(this.anIntArray441[local15], this.anIntArray442[local15], this.anIntArray443[local15], local13);
				}
				this.anIntArray441[local15] = local13[0];
				this.anIntArray442[local15] = local13[1];
				this.anIntArray443[local15] = local13[2];
			}
		}
	}

	@OriginalMember(owner = "client!nka", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub2_Sub12.anIntArray293[arg0];
		@Pc(13) int local13 = Class6_Sub2_Sub12.anIntArray292[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6966; local15++) {
			local33 = local13 * this.anIntArray441[local15] + local9 * this.anIntArray443[local15] >> 14;
			this.anIntArray443[local15] = local13 * this.anIntArray443[local15] - local9 * this.anIntArray441[local15] >> 14;
			this.anIntArray441[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt6969; local33++) {
			@Pc(88) int local88 = local13 * this.aShortArray67[local33] + local9 * this.aShortArray71[local33] >> 14;
			this.aShortArray71[local33] = (short) (this.aShortArray71[local33] * local13 - this.aShortArray67[local33] * local9 >> 14);
			this.aShortArray67[local33] = (short) local88;
		}
		this.method6160();
		this.method6161();
		this.aBoolean521 = false;
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7405(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class54_Sub2 local8 = (Class54_Sub2) arg0;
		if (this.anInt6989 == 0 || local8.anInt6989 == 0) {
			return;
		}
		@Pc(27) int local27 = local8.anInt6966;
		@Pc(30) int[] local30 = local8.anIntArray441;
		@Pc(33) int[] local33 = local8.anIntArray442;
		@Pc(36) int[] local36 = local8.anIntArray443;
		@Pc(39) short[] local39 = local8.aShortArray67;
		@Pc(42) short[] local42 = local8.aShortArray72;
		@Pc(45) short[] local45 = local8.aShortArray71;
		@Pc(48) byte[] local48 = local8.aByteArray59;
		@Pc(63) short[] local63;
		@Pc(59) short[] local59;
		@Pc(67) short[] local67;
		@Pc(55) byte[] local55;
		if (this.aClass34_1 == null) {
			local63 = null;
			local55 = null;
			local67 = null;
			local59 = null;
		} else {
			local55 = this.aClass34_1.aByteArray7;
			local59 = this.aClass34_1.aShortArray22;
			local63 = this.aClass34_1.aShortArray21;
			local67 = this.aClass34_1.aShortArray20;
		}
		@Pc(84) short[] local84;
		@Pc(96) short[] local96;
		@Pc(88) short[] local88;
		@Pc(92) byte[] local92;
		if (local8.aClass34_1 == null) {
			local96 = null;
			local84 = null;
			local92 = null;
			local88 = null;
		} else {
			local84 = local8.aClass34_1.aShortArray21;
			local88 = local8.aClass34_1.aShortArray20;
			local92 = local8.aClass34_1.aByteArray7;
			local96 = local8.aClass34_1.aShortArray22;
		}
		@Pc(109) int[] local109 = local8.anIntArray440;
		@Pc(112) short[] local112 = local8.aShortArray65;
		if (!local8.aBoolean521) {
			local8.method6164();
		}
		@Pc(123) int local123 = local8.anInt6930;
		@Pc(126) int local126 = local8.anInt6976;
		@Pc(129) int local129 = local8.anInt6967;
		@Pc(132) int local132 = local8.anInt6986;
		@Pc(135) int local135 = local8.anInt6956;
		@Pc(138) int local138 = local8.anInt6925;
		for (@Pc(140) int local140 = 0; local140 < this.anInt6966; local140++) {
			@Pc(150) int local150 = this.anIntArray442[local140] - arg2;
			if (local123 <= local150 && local126 >= local150) {
				@Pc(177) int local177 = this.anIntArray441[local140] - arg1;
				if (local177 >= local129 && local132 >= local177) {
					@Pc(197) int local197 = this.anIntArray443[local140] - arg3;
					if (local135 <= local197 && local197 <= local138) {
						@Pc(211) int local211 = -1;
						@Pc(216) int local216 = this.anIntArray440[local140];
						@Pc(223) int local223 = this.anIntArray440[local140 + 1];
						for (@Pc(225) int local225 = local216; local225 < local223; local225++) {
							local211 = this.aShortArray65[local225] - 1;
							if (local211 == -1 || this.aByteArray59[local211] != 0) {
								break;
							}
						}
						if (local211 != -1) {
							for (@Pc(261) int local261 = 0; local261 < local27; local261++) {
								if (local30[local261] == local177 && local197 == local36[local261] && local33[local261] == local150) {
									local216 = local109[local261];
									@Pc(294) int local294 = -1;
									local223 = local109[local261 + 1];
									for (@Pc(302) int local302 = local216; local302 < local223; local302++) {
										local294 = local112[local302] - 1;
										if (local294 == -1 || local48[local294] != 0) {
											break;
										}
									}
									if (local294 != -1) {
										if (local63 == null) {
											this.aClass34_1 = new Class34();
											local63 = this.aClass34_1.aShortArray21 = Static124.method2323(this.aShortArray67);
											local59 = this.aClass34_1.aShortArray22 = Static124.method2323(this.aShortArray72);
											local67 = this.aClass34_1.aShortArray20 = Static124.method2323(this.aShortArray71);
											local55 = this.aClass34_1.aByteArray7 = Static387.method5967(this.aByteArray59);
										}
										if (local84 == null) {
											@Pc(389) Class34 local389 = local8.aClass34_1 = new Class34();
											local84 = local389.aShortArray21 = Static124.method2323(local39);
											local96 = local389.aShortArray22 = Static124.method2323(local42);
											local88 = local389.aShortArray20 = Static124.method2323(local45);
											local92 = local389.aByteArray7 = Static387.method5967(local48);
										}
										@Pc(422) short local422 = this.aShortArray67[local211];
										@Pc(427) short local427 = this.aShortArray72[local211];
										@Pc(432) short local432 = this.aShortArray71[local211];
										@Pc(437) byte local437 = this.aByteArray59[local211];
										local216 = local109[local261];
										local223 = local109[local261 + 1];
										@Pc(457) int local457;
										for (@Pc(449) int local449 = local216; local449 < local223; local449++) {
											local457 = local112[local449] - 1;
											if (local457 == -1) {
												break;
											}
											if (local92[local457] != 0) {
												local84[local457] += local422;
												local96[local457] += local427;
												local88[local457] += local432;
												local92[local457] += local437;
											}
										}
										local216 = this.anIntArray440[local140];
										local427 = local42[local294];
										local223 = this.anIntArray440[local140 + 1];
										local422 = local39[local294];
										local437 = local48[local294];
										local432 = local45[local294];
										for (local457 = local216; local457 < local223; local457++) {
											@Pc(549) int local549 = this.aShortArray65[local457] - 1;
											if (local549 == -1) {
												break;
											}
											if (local55[local549] != 0) {
												local63[local549] += local422;
												local59[local549] += local427;
												local67[local549] += local432;
												local55[local549] += local437;
											}
										}
										local8.method6161();
										this.method6161();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nka", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6966; local7++) {
			if (arg0 != 128) {
				this.anIntArray441[local7] = arg0 * this.anIntArray441[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray442[local7] = this.anIntArray442[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray443[local7] = arg2 * this.anIntArray443[local7] >> 7;
			}
		}
		this.method6160();
		this.aBoolean521 = false;
	}

	@OriginalMember(owner = "client!nka", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray38 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anInt6960; local13++) {
			this.anIntArray441[local13] <<= 0x4;
			this.anIntArray442[local13] <<= 0x4;
			this.anIntArray443[local13] <<= 0x4;
		}
		Static614.anInt9713 = 0;
		Static140.anInt2887 = 0;
		Static86.anInt1304 = 0;
		return true;
	}

	@OriginalMember(owner = "client!nka", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static614.anInt9713 = 0;
			Static140.anInt2887 = 0;
			local13 = 0;
			Static86.anInt1304 = 0;
			for (local17 = 0; local17 < this.anInt6966; local17++) {
				Static86.anInt1304 += this.anIntArray441[local17];
				Static140.anInt2887 += this.anIntArray442[local17];
				Static614.anInt9713 += this.anIntArray443[local17];
				local13++;
			}
			if (local13 <= 0) {
				Static614.anInt9713 = arg3;
				Static140.anInt2887 = arg2;
				Static86.anInt1304 = arg1;
			} else {
				Static614.anInt9713 = arg3 + Static614.anInt9713 / local13;
				Static140.anInt2887 = Static140.anInt2887 / local13 + arg2;
				Static86.anInt1304 = Static86.anInt1304 / local13 + arg1;
			}
		} else if (arg0 == 1) {
			for (local13 = 0; local13 < this.anInt6966; local13++) {
				this.anIntArray441[local13] += arg1;
				this.anIntArray442[local13] += arg2;
				this.anIntArray443[local13] += arg3;
			}
		} else {
			@Pc(181) int local181;
			@Pc(199) int local199;
			if (arg0 == 2) {
				for (local13 = 0; local13 < this.anInt6966; local13++) {
					this.anIntArray441[local13] -= Static86.anInt1304;
					this.anIntArray442[local13] -= Static140.anInt2887;
					this.anIntArray443[local13] -= Static614.anInt9713;
					if (arg3 != 0) {
						local17 = Class6_Sub2_Sub12.anIntArray293[arg3];
						local181 = Class6_Sub2_Sub12.anIntArray292[arg3];
						local199 = this.anIntArray442[local13] * local17 + local181 * this.anIntArray441[local13] + 16383 >> 14;
						this.anIntArray442[local13] = this.anIntArray442[local13] * local181 + 16383 - local17 * this.anIntArray441[local13] >> 14;
						this.anIntArray441[local13] = local199;
					}
					if (arg1 != 0) {
						local17 = Class6_Sub2_Sub12.anIntArray293[arg1];
						local181 = Class6_Sub2_Sub12.anIntArray292[arg1];
						local199 = local181 * this.anIntArray442[local13] + 16383 - local17 * this.anIntArray443[local13] >> 14;
						this.anIntArray443[local13] = this.anIntArray443[local13] * local181 + local17 * this.anIntArray442[local13] + 16383 >> 14;
						this.anIntArray442[local13] = local199;
					}
					if (arg2 != 0) {
						local17 = Class6_Sub2_Sub12.anIntArray293[arg2];
						local181 = Class6_Sub2_Sub12.anIntArray292[arg2];
						local199 = local17 * this.anIntArray443[local13] + local181 * this.anIntArray441[local13] + 16383 >> 14;
						this.anIntArray443[local13] = local181 * this.anIntArray443[local13] + 16383 - local17 * this.anIntArray441[local13] >> 14;
						this.anIntArray441[local13] = local199;
					}
					this.anIntArray441[local13] += Static86.anInt1304;
					this.anIntArray442[local13] += Static140.anInt2887;
					this.anIntArray443[local13] += Static614.anInt9713;
				}
			} else if (arg0 == 3) {
				for (local13 = 0; local13 < this.anInt6966; local13++) {
					this.anIntArray441[local13] -= Static86.anInt1304;
					this.anIntArray442[local13] -= Static140.anInt2887;
					this.anIntArray443[local13] -= Static614.anInt9713;
					this.anIntArray441[local13] = this.anIntArray441[local13] * arg1 / 128;
					this.anIntArray442[local13] = arg2 * this.anIntArray442[local13] / 128;
					this.anIntArray443[local13] = arg3 * this.anIntArray443[local13] / 128;
					this.anIntArray441[local13] += Static86.anInt1304;
					this.anIntArray442[local13] += Static140.anInt2887;
					this.anIntArray443[local13] += Static614.anInt9713;
				}
			} else {
				@Pc(544) Class357 local544;
				@Pc(549) Class19 local549;
				if (arg0 == 5) {
					for (local13 = 0; local13 < this.anInt6989; local13++) {
						local17 = (this.aByteArray58[local13] & 0xFF) + (arg1 * 8);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray58[local13] = (byte) local17;
					}
					if (this.aClass357Array1 != null) {
						for (local17 = 0; local17 < this.anInt6971; local17++) {
							local544 = this.aClass357Array1[local17];
							local549 = this.aClass19Array1[local17];
							local549.anInt267 = 255 - (this.aByteArray58[local544.anInt9730] & 0xFF) << 24 | local549.anInt267 & 0xFFFFFF;
						}
					}
					this.method6162();
				} else if (arg0 == 7) {
					for (local13 = 0; local13 < this.anInt6989; local13++) {
						local17 = this.aShortArray73[local13] & 0xFFFF;
						local181 = local17 >> 10 & 0x3F;
						local199 = local17 >> 7 & 0x7;
						local199 += arg2 / 4;
						@Pc(623) int local623 = local181 + arg1 & 0x3F;
						@Pc(627) int local627 = local17 & 0x7F;
						if (local199 < 0) {
							local199 = 0;
						} else if (local199 > 7) {
							local199 = 7;
						}
						local627 += arg3;
						if (local627 < 0) {
							local627 = 0;
						} else if (local627 > 127) {
							local627 = 127;
						}
						this.aShortArray73[local13] = (short) (local627 | local623 << 10 | local199 << 7);
					}
					if (this.aClass357Array1 != null) {
						for (local17 = 0; local17 < this.anInt6971; local17++) {
							local544 = this.aClass357Array1[local17];
							local549 = this.aClass19Array1[local17];
							local549.anInt267 = Static229.anIntArray228[this.aShortArray73[local544.anInt9730] & 0xFFFF] & 0xFFFFFF | local549.anInt267 & 0xFF000000;
						}
					}
					this.method6162();
				} else {
					@Pc(750) Class19 local750;
					if (arg0 == 8) {
						for (local13 = 0; local13 < this.anInt6971; local13++) {
							local750 = this.aClass19Array1[local13];
							local750.anInt272 += arg2;
							local750.anInt268 += arg1;
						}
					} else if (arg0 == 10) {
						for (local13 = 0; local13 < this.anInt6971; local13++) {
							local750 = this.aClass19Array1[local13];
							local750.anInt273 = arg2 * local750.anInt273 >> 7;
							local750.anInt269 = arg1 * local750.anInt269 >> 7;
						}
					} else if (arg0 == 9) {
						for (local13 = 0; local13 < this.anInt6971; local13++) {
							local750 = this.aClass19Array1[local13];
							local750.anInt276 = arg1 + local750.anInt276 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nka", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt6936;
	}

	@OriginalMember(owner = "client!nka", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean518;
	}

	@OriginalMember(owner = "client!nka", name = "f", descriptor = "(I)V")
	private void method6162() {
		if (this.aClass279_2 != null) {
			this.aClass279_2.aBoolean589 = false;
		}
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		for (@Pc(3) int local3 = 0; local3 < this.anInt6989; local3++) {
			local14 = this.aShortArray73[local3] & 0xFFFF;
			@Pc(20) int local20 = local14 >> 10 & 0x3F;
			@Pc(26) int local26 = local14 >> 7 & 0x7;
			if (arg1 != -1) {
				local26 += (arg1 - local26) * arg3 >> 7;
			}
			if (arg0 != -1) {
				local20 += arg3 * (arg0 - local20) >> 7;
			}
			@Pc(58) int local58 = local14 & 0x7F;
			if (arg2 != -1) {
				local58 += (arg2 - local58) * arg3 >> 7;
			}
			this.aShortArray73[local3] = (short) (local58 | local20 << 10 | local26 << 7);
		}
		if (this.aClass357Array1 != null) {
			for (local14 = 0; local14 < this.anInt6971; local14++) {
				@Pc(115) Class357 local115 = this.aClass357Array1[local14];
				@Pc(120) Class19 local120 = this.aClass19Array1[local14];
				local120.anInt267 = Static229.anIntArray228[this.aShortArray73[local115.anInt9730] & 0xFFFF] & 0xFFFFFF | local120.anInt267 & 0xFF000000;
			}
		}
		this.method6162();
	}

	@OriginalMember(owner = "client!nka", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort78;
	}

	@OriginalMember(owner = "client!nka", name = "b", descriptor = "(Z)Z")
	private boolean method6163() {
		if (this.aClass50_1.aBoolean49) {
			return true;
		}
		if (this.aClass50_1.anInterface25_3 == null) {
			this.aClass50_1.anInterface25_3 = this.aClass75_Sub1_19.method6817(this.aBoolean517);
		}
		@Pc(39) Interface25 local39 = this.aClass50_1.anInterface25_3;
		local39.method8679(this.anInt6984 * 6);
		@Pc(51) Buffer local51 = local39.method8677();
		if (local51 != null) {
			@Pc(59) Stream local59 = this.aClass75_Sub1_19.method6788(local51);
			@Pc(63) int local63;
			if (Stream.b()) {
				for (local63 = 0; local63 < this.anInt6984; local63++) {
					local59.b(this.aShortArray76[local63]);
					local59.b(this.aShortArray69[local63]);
					local59.b(this.aShortArray68[local63]);
				}
			} else {
				for (local63 = 0; local63 < this.anInt6984; local63++) {
					local59.a(this.aShortArray76[local63]);
					local59.a(this.aShortArray69[local63]);
					local59.a(this.aShortArray68[local63]);
				}
			}
			local59.a();
			if (local39.method8676()) {
				this.aClass50_1.anInterface25_2 = local39;
				this.aClass50_1.aBoolean49 = true;
				this.aBoolean519 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nka", name = "d", descriptor = "()V")
	@Override
	protected void method7420() {
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(Lclient!qa;)V")
	@Override
	public void method7410(@OriginalArg(0) Class109 arg0) {
		@Pc(8) Class109_Sub3 local8 = (Class109_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass216Array3 != null) {
			for (local13 = 0; local13 < this.aClass216Array3.length; local13++) {
				@Pc(20) Class216 local20 = this.aClass216Array3[local13];
				@Pc(22) Class216 local22 = local20;
				if (local20.aClass216_1 != null) {
					local22 = local20.aClass216_1;
				}
				local22.anInt5653 = (int) (local8.aFloat87 + (float) this.anIntArray443[local20.anInt5662] * local8.aFloat92 + local8.aFloat93 * (float) this.anIntArray441[local20.anInt5662] + (float) this.anIntArray442[local20.anInt5662] * local8.aFloat94);
				local22.anInt5657 = (int) (local8.aFloat95 * (float) this.anIntArray442[local20.anInt5662] + (float) this.anIntArray441[local20.anInt5662] * local8.aFloat90 + (float) this.anIntArray443[local20.anInt5662] * local8.aFloat85 + local8.aFloat89);
				local22.anInt5655 = (int) (local8.aFloat91 + (float) this.anIntArray443[local20.anInt5662] * local8.aFloat88 + (float) this.anIntArray441[local20.anInt5662] * local8.aFloat86 + local8.aFloat96 * (float) this.anIntArray442[local20.anInt5662]);
				local22.anInt5663 = (int) (local8.aFloat87 + (float) this.anIntArray443[local20.anInt5658] * local8.aFloat92 + (float) this.anIntArray442[local20.anInt5658] * local8.aFloat94 + (float) this.anIntArray441[local20.anInt5658] * local8.aFloat93);
				local22.anInt5666 = (int) (local8.aFloat89 + (float) this.anIntArray443[local20.anInt5658] * local8.aFloat85 + (float) this.anIntArray441[local20.anInt5658] * local8.aFloat90 + local8.aFloat95 * (float) this.anIntArray442[local20.anInt5658]);
				local22.anInt5667 = (int) (local8.aFloat91 + local8.aFloat88 * (float) this.anIntArray443[local20.anInt5658] + (float) this.anIntArray441[local20.anInt5658] * local8.aFloat86 + (float) this.anIntArray442[local20.anInt5658] * local8.aFloat96);
				local22.anInt5665 = (int) ((float) this.anIntArray442[local20.anInt5664] * local8.aFloat94 + local8.aFloat93 * (float) this.anIntArray441[local20.anInt5664] + (float) this.anIntArray443[local20.anInt5664] * local8.aFloat92 + local8.aFloat87);
				local22.anInt5654 = (int) (local8.aFloat89 + local8.aFloat95 * (float) this.anIntArray442[local20.anInt5664] + local8.aFloat90 * (float) this.anIntArray441[local20.anInt5664] + local8.aFloat85 * (float) this.anIntArray443[local20.anInt5664]);
				local22.anInt5656 = (int) (local8.aFloat91 + (float) this.anIntArray441[local20.anInt5664] * local8.aFloat86 + local8.aFloat96 * (float) this.anIntArray442[local20.anInt5664] + (float) this.anIntArray443[local20.anInt5664] * local8.aFloat88);
			}
		}
		if (this.aClass173Array3 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass173Array3.length; local13++) {
			@Pc(367) Class173 local367 = this.aClass173Array3[local13];
			@Pc(369) Class173 local369 = local367;
			if (local367.aClass173_1 != null) {
				local369 = local367.aClass173_1;
			}
			if (local367.aClass109_4 == null) {
				local367.aClass109_4 = local8.method4609();
			} else {
				local367.aClass109_4.method4595(local8);
			}
			local369.anInt4955 = (int) ((float) this.anIntArray442[local367.anInt4951] * local8.aFloat94 + local8.aFloat93 * (float) this.anIntArray441[local367.anInt4951] + (float) this.anIntArray443[local367.anInt4951] * local8.aFloat92 + local8.aFloat87);
			local369.anInt4954 = (int) ((float) this.anIntArray442[local367.anInt4951] * local8.aFloat95 + (float) this.anIntArray441[local367.anInt4951] * local8.aFloat90 + (float) this.anIntArray443[local367.anInt4951] * local8.aFloat85 + local8.aFloat89);
			local369.anInt4949 = (int) (local8.aFloat91 + local8.aFloat96 * (float) this.anIntArray442[local367.anInt4951] + local8.aFloat86 * (float) this.anIntArray441[local367.anInt4951] + local8.aFloat88 * (float) this.anIntArray443[local367.anInt4951]);
		}
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "()V")
	@Override
	public void method7414() {
		if (this.anInt6969 > 0 && this.anInt6984 > 0) {
			this.method6170();
			this.method6163();
			this.method6158();
		}
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(B[B)V")
	@Override
	public void method7424(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(5) int local5;
		if (arg1 == null) {
			for (local5 = 0; local5 < this.anInt6989; local5++) {
				this.aByteArray58[local5] = arg0;
			}
		} else {
			for (local5 = 0; local5 < this.anInt6989; local5++) {
				@Pc(28) int local28 = 255 - (255 - (arg1[local5] & 0xFF)) * (-(arg0 & 0xFF) + 255) / 255;
				this.aByteArray58[local5] = (byte) local28;
			}
		}
		this.method6162();
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(Z)V")
	private void method6164() {
		@Pc(17) int local17 = 32767;
		@Pc(19) int local19 = 32767;
		@Pc(21) int local21 = 32767;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = -32768;
		@Pc(27) int local27 = -32768;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = 0; local33 < this.anInt6966; local33++) {
			@Pc(42) int local42 = this.anIntArray441[local33];
			@Pc(47) int local47 = this.anIntArray442[local33];
			if (local23 < local42) {
				local23 = local42;
			}
			@Pc(57) int local57 = this.anIntArray443[local33];
			if (local47 < local19) {
				local19 = local47;
			}
			if (local25 < local47) {
				local25 = local47;
			}
			if (local42 < local17) {
				local17 = local42;
			}
			if (local21 > local57) {
				local21 = local57;
			}
			if (local27 < local57) {
				local27 = local57;
			}
			@Pc(110) int local110 = local42 * local42 + local57 * local57;
			if (local110 > local29) {
				local29 = local110;
			}
			local110 = local57 * local57 + local42 * local42 + local47 * local47;
			if (local110 > local31) {
				local31 = local110;
			}
		}
		this.anInt6925 = local27;
		this.anInt6986 = local23;
		this.anInt6956 = local21;
		this.anInt6967 = local17;
		this.anInt6930 = local19;
		this.anInt6976 = local25;
		this.anInt6919 = (int) (Math.sqrt((double) local29) + 0.99D);
		this.anInt6982 = (int) (Math.sqrt((double) local31) + 0.99D);
		this.aBoolean521 = true;
	}

	@OriginalMember(owner = "client!nka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class6_Sub2_Sub18 ba(@OriginalArg(0) Class6_Sub2_Sub18 arg0) {
		if (this.anInt6969 == 0) {
			return null;
		}
		if (!this.aBoolean521) {
			this.method6164();
		}
		@Pc(40) int local40;
		@Pc(56) int local56;
		if (this.aClass75_Sub1_19.anInt7662 > 0) {
			local40 = this.anInt6967 - (this.anInt6976 * this.aClass75_Sub1_19.anInt7662 >> 8) >> this.aClass75_Sub1_19.anInt7672;
			local56 = this.anInt6986 - (this.aClass75_Sub1_19.anInt7662 * this.anInt6930 >> 8) >> this.aClass75_Sub1_19.anInt7672;
		} else {
			local40 = this.anInt6967 - (this.anInt6930 * this.aClass75_Sub1_19.anInt7662 >> 8) >> this.aClass75_Sub1_19.anInt7672;
			local56 = this.anInt6986 - (this.anInt6976 * this.aClass75_Sub1_19.anInt7662 >> 8) >> this.aClass75_Sub1_19.anInt7672;
		}
		@Pc(113) int local113;
		@Pc(129) int local129;
		if (this.aClass75_Sub1_19.anInt7666 <= 0) {
			local113 = this.anInt6956 - (this.anInt6930 * this.aClass75_Sub1_19.anInt7666 >> 8) >> this.aClass75_Sub1_19.anInt7672;
			local129 = this.anInt6925 - (this.aClass75_Sub1_19.anInt7666 * this.anInt6976 >> 8) >> this.aClass75_Sub1_19.anInt7672;
		} else {
			local113 = this.anInt6956 - (this.anInt6976 * this.aClass75_Sub1_19.anInt7666 >> 8) >> this.aClass75_Sub1_19.anInt7672;
			local129 = this.anInt6925 - (this.anInt6930 * this.aClass75_Sub1_19.anInt7666 >> 8) >> this.aClass75_Sub1_19.anInt7672;
		}
		@Pc(172) int local172 = local56 + 1 - local40;
		@Pc(178) int local178 = local129 + 1 - local113;
		@Pc(181) Class6_Sub2_Sub18_Sub2 local181 = (Class6_Sub2_Sub18_Sub2) arg0;
		@Pc(199) Class6_Sub2_Sub18_Sub2 local199;
		if (local181 != null && local181.method8476(local178, local172)) {
			local199 = local181;
			local181.method8477();
		} else {
			local199 = new Class6_Sub2_Sub18_Sub2(this.aClass75_Sub1_19, local172, local178);
		}
		local199.method8474(local129, local113, local40, local56);
		this.method6166(local199);
		return local199;
	}

	@OriginalMember(owner = "client!nka", name = "e", descriptor = "()[B")
	@Override
	public byte[] method7423() {
		return this.aByteArray58;
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(Lclient!nka;IZZLclient!nka;Z)Lclient!ka;")
	private Class54 method6165(@OriginalArg(0) Class54_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class54_Sub2 arg4) {
		arg4.anInt6989 = this.anInt6989;
		arg4.anInt6966 = this.anInt6966;
		arg4.anInt6960 = this.anInt6960;
		arg4.anInt6971 = this.anInt6971;
		arg4.aShort77 = this.aShort77;
		arg4.aBoolean518 = this.aBoolean518;
		arg4.anInt6984 = this.anInt6984;
		arg4.aShort78 = this.aShort78;
		arg4.anInt6969 = this.anInt6969;
		arg4.anInt6936 = arg1;
		arg4.anInt6954 = this.anInt6954;
		if ((arg1 & 0x100) == 0) {
			arg4.aBoolean520 = this.aBoolean520;
		} else {
			arg4.aBoolean520 = true;
		}
		@Pc(74) boolean local74 = Static669.method8875(arg1, this.anInt6954);
		@Pc(80) boolean local80 = Static680.method8956(arg1, this.anInt6954);
		@Pc(86) boolean local86 = Static116.method2163(this.anInt6954, arg1);
		@Pc(92) boolean local92 = local86 | local80 | local74;
		@Pc(231) int local231;
		if (local92) {
			if (!local74) {
				arg4.anIntArray441 = this.anIntArray441;
			} else if (arg0.anIntArray441 == null || this.anInt6960 > arg0.anIntArray441.length) {
				arg4.anIntArray441 = arg0.anIntArray441 = new int[this.anInt6960];
			} else {
				arg4.anIntArray441 = arg0.anIntArray441;
			}
			if (!local80) {
				arg4.anIntArray442 = this.anIntArray442;
			} else if (arg0.anIntArray442 == null || this.anInt6960 > arg0.anIntArray442.length) {
				arg4.anIntArray442 = arg0.anIntArray442 = new int[this.anInt6960];
			} else {
				arg4.anIntArray442 = arg0.anIntArray442;
			}
			if (!local86) {
				arg4.anIntArray443 = this.anIntArray443;
			} else if (arg0.anIntArray443 == null || arg0.anIntArray443.length < this.anInt6960) {
				arg4.anIntArray443 = arg0.anIntArray443 = new int[this.anInt6960];
			} else {
				arg4.anIntArray443 = arg0.anIntArray443;
			}
			for (local231 = 0; local231 < this.anInt6960; local231++) {
				if (local74) {
					arg4.anIntArray441[local231] = this.anIntArray441[local231];
				}
				if (local80) {
					arg4.anIntArray442[local231] = this.anIntArray442[local231];
				}
				if (local86) {
					arg4.anIntArray443[local231] = this.anIntArray443[local231];
				}
			}
		} else {
			arg4.anIntArray441 = this.anIntArray441;
			arg4.anIntArray442 = this.anIntArray442;
			arg4.anIntArray443 = this.anIntArray443;
		}
		if (Static234.method4147(arg1, this.anInt6954)) {
			arg4.aClass279_4 = arg0.aClass279_4;
			arg4.aClass279_4.anInterface6_16 = this.aClass279_4.anInterface6_16;
			arg4.aClass279_4.aBoolean588 = true;
			arg4.aClass279_4.aBoolean589 = this.aClass279_4.aBoolean589;
		} else if (Static153.method3056(this.anInt6954, arg1)) {
			arg4.aClass279_4 = this.aClass279_4;
		} else {
			arg4.aClass279_4 = null;
		}
		if (Static409.method6270(arg1, this.anInt6954)) {
			if (arg0.aShortArray73 == null || arg0.aShortArray73.length < this.anInt6989) {
				arg4.aShortArray73 = arg0.aShortArray73 = new short[this.anInt6989];
			} else {
				arg4.aShortArray73 = arg0.aShortArray73;
			}
			for (local231 = 0; local231 < this.anInt6989; local231++) {
				arg4.aShortArray73[local231] = this.aShortArray73[local231];
			}
		} else {
			arg4.aShortArray73 = this.aShortArray73;
		}
		if (Static36.method466(arg1, this.anInt6954)) {
			if (arg0.aByteArray58 == null || this.anInt6989 > arg0.aByteArray58.length) {
				arg4.aByteArray58 = arg0.aByteArray58 = new byte[this.anInt6989];
			} else {
				arg4.aByteArray58 = arg0.aByteArray58;
			}
			for (local231 = 0; local231 < this.anInt6989; local231++) {
				arg4.aByteArray58[local231] = this.aByteArray58[local231];
			}
		} else {
			arg4.aByteArray58 = this.aByteArray58;
		}
		if (Static165.method3263(arg1, this.anInt6954)) {
			arg4.aClass279_2 = arg0.aClass279_2;
			arg4.aClass279_2.aBoolean588 = true;
			arg4.aClass279_2.anInterface6_16 = this.aClass279_2.anInterface6_16;
			arg4.aClass279_2.aBoolean589 = this.aClass279_2.aBoolean589;
		} else if (Static163.method3216(arg1, this.anInt6954)) {
			arg4.aClass279_2 = this.aClass279_2;
		} else {
			arg4.aClass279_2 = null;
		}
		@Pc(672) int local672;
		if (Static70.method927(this.anInt6954, arg1)) {
			if (arg0.aShortArray67 == null || arg0.aShortArray67.length < this.anInt6969) {
				local231 = this.anInt6969;
				arg4.aShortArray67 = arg0.aShortArray67 = new short[local231];
				arg4.aShortArray72 = arg0.aShortArray72 = new short[local231];
				arg4.aShortArray71 = arg0.aShortArray71 = new short[local231];
			} else {
				arg4.aShortArray71 = arg0.aShortArray71;
				arg4.aShortArray67 = arg0.aShortArray67;
				arg4.aShortArray72 = arg0.aShortArray72;
			}
			if (this.aClass34_1 == null) {
				arg4.aClass34_1 = null;
				for (local231 = 0; local231 < this.anInt6969; local231++) {
					arg4.aShortArray67[local231] = this.aShortArray67[local231];
					arg4.aShortArray72[local231] = this.aShortArray72[local231];
					arg4.aShortArray71[local231] = this.aShortArray71[local231];
				}
			} else {
				if (arg0.aClass34_1 == null) {
					arg0.aClass34_1 = new Class34();
				}
				@Pc(654) Class34 local654 = arg4.aClass34_1 = arg0.aClass34_1;
				if (local654.aShortArray21 == null || local654.aShortArray21.length < this.anInt6969) {
					local672 = this.anInt6969;
					local654.aByteArray7 = new byte[local672];
					local654.aShortArray22 = new short[local672];
					local654.aShortArray21 = new short[local672];
					local654.aShortArray20 = new short[local672];
				}
				for (local672 = 0; local672 < this.anInt6969; local672++) {
					arg4.aShortArray67[local672] = this.aShortArray67[local672];
					arg4.aShortArray72[local672] = this.aShortArray72[local672];
					arg4.aShortArray71[local672] = this.aShortArray71[local672];
					local654.aShortArray21[local672] = this.aClass34_1.aShortArray21[local672];
					local654.aShortArray22[local672] = this.aClass34_1.aShortArray22[local672];
					local654.aShortArray20[local672] = this.aClass34_1.aShortArray20[local672];
					local654.aByteArray7[local672] = this.aClass34_1.aByteArray7[local672];
				}
			}
			arg4.aByteArray59 = this.aByteArray59;
		} else {
			arg4.aShortArray72 = this.aShortArray72;
			arg4.aShortArray67 = this.aShortArray67;
			arg4.aShortArray71 = this.aShortArray71;
			arg4.aClass34_1 = this.aClass34_1;
			arg4.aByteArray59 = this.aByteArray59;
		}
		if (Static313.method4966(arg1, this.anInt6954)) {
			arg4.aClass279_1 = arg0.aClass279_1;
			arg4.aClass279_1.aBoolean588 = true;
			arg4.aClass279_1.aBoolean589 = this.aClass279_1.aBoolean589;
			arg4.aClass279_1.anInterface6_16 = this.aClass279_1.anInterface6_16;
		} else if (Static26.method333(arg1, this.anInt6954)) {
			arg4.aClass279_1 = this.aClass279_1;
		} else {
			arg4.aClass279_1 = null;
		}
		if (Static622.method8537(arg1, this.anInt6954)) {
			if (arg0.aFloatArray58 == null || this.anInt6989 > arg0.aFloatArray58.length) {
				local231 = this.anInt6969;
				arg4.aFloatArray57 = arg0.aFloatArray57 = new float[local231];
				arg4.aFloatArray58 = arg0.aFloatArray58 = new float[local231];
			} else {
				arg4.aFloatArray57 = arg0.aFloatArray57;
				arg4.aFloatArray58 = arg0.aFloatArray58;
			}
			for (local231 = 0; local231 < this.anInt6969; local231++) {
				arg4.aFloatArray58[local231] = this.aFloatArray58[local231];
				arg4.aFloatArray57[local231] = this.aFloatArray57[local231];
			}
		} else {
			arg4.aFloatArray58 = this.aFloatArray58;
			arg4.aFloatArray57 = this.aFloatArray57;
		}
		if (Static14.method189(arg1, this.anInt6954)) {
			arg4.aClass279_3 = arg0.aClass279_3;
			arg4.aClass279_3.anInterface6_16 = this.aClass279_3.anInterface6_16;
			arg4.aClass279_3.aBoolean589 = this.aClass279_3.aBoolean589;
			arg4.aClass279_3.aBoolean588 = true;
		} else if (Static325.method5113(arg1, this.anInt6954)) {
			arg4.aClass279_3 = this.aClass279_3;
		} else {
			arg4.aClass279_3 = null;
		}
		if (Static137.method2610(this.anInt6954, arg1)) {
			if (arg0.aShortArray76 == null || arg0.aShortArray76.length < this.anInt6989) {
				local231 = this.anInt6989;
				arg4.aShortArray76 = arg0.aShortArray76 = new short[local231];
				arg4.aShortArray68 = arg0.aShortArray68 = new short[local231];
				arg4.aShortArray69 = arg0.aShortArray69 = new short[local231];
			} else {
				arg4.aShortArray68 = arg0.aShortArray68;
				arg4.aShortArray69 = arg0.aShortArray69;
				arg4.aShortArray76 = arg0.aShortArray76;
			}
			for (local231 = 0; local231 < this.anInt6989; local231++) {
				arg4.aShortArray76[local231] = this.aShortArray76[local231];
				arg4.aShortArray69[local231] = this.aShortArray69[local231];
				arg4.aShortArray68[local231] = this.aShortArray68[local231];
			}
		} else {
			arg4.aShortArray69 = this.aShortArray69;
			arg4.aShortArray76 = this.aShortArray76;
			arg4.aShortArray68 = this.aShortArray68;
		}
		if (Static337.method5204(this.anInt6954, arg1)) {
			arg4.aClass50_1 = arg0.aClass50_1;
			arg4.aClass50_1.aBoolean48 = true;
			arg4.aClass50_1.anInterface25_2 = this.aClass50_1.anInterface25_2;
			arg4.aClass50_1.aBoolean49 = this.aClass50_1.aBoolean49;
		} else if (Static250.method4363(this.anInt6954, arg1)) {
			arg4.aClass50_1 = this.aClass50_1;
		} else {
			arg4.aClass50_1 = null;
		}
		if (Static681.method8957(arg1, this.anInt6954)) {
			if (arg0.aShortArray77 == null || this.anInt6989 > arg0.aShortArray77.length) {
				local231 = this.anInt6989;
				arg4.aShortArray77 = arg0.aShortArray77 = new short[local231];
			} else {
				arg4.aShortArray77 = arg0.aShortArray77;
			}
			for (local231 = 0; local231 < this.anInt6989; local231++) {
				arg4.aShortArray77[local231] = this.aShortArray77[local231];
			}
		} else {
			arg4.aShortArray77 = this.aShortArray77;
		}
		if (!Static29.method340(arg1, this.anInt6954)) {
			arg4.aClass19Array1 = this.aClass19Array1;
		} else if (arg0.aClass19Array1 == null || this.anInt6971 > arg0.aClass19Array1.length) {
			local231 = this.anInt6971;
			arg4.aClass19Array1 = arg0.aClass19Array1 = new Class19[local231];
			for (local672 = 0; local672 < this.anInt6971; local672++) {
				arg4.aClass19Array1[local672] = this.aClass19Array1[local672].method240();
			}
		} else {
			arg4.aClass19Array1 = arg0.aClass19Array1;
			for (local231 = 0; local231 < this.anInt6971; local231++) {
				arg4.aClass19Array1[local231].method241(this.aClass19Array1[local231]);
			}
		}
		arg4.aShortArray70 = this.aShortArray70;
		arg4.aShortArray65 = this.aShortArray65;
		arg4.anIntArray440 = this.anIntArray440;
		arg4.anIntArrayArray39 = this.anIntArrayArray39;
		arg4.aShortArray74 = this.aShortArray74;
		arg4.aClass357Array1 = this.aClass357Array1;
		arg4.anIntArray439 = this.anIntArray439;
		arg4.anIntArray438 = this.anIntArray438;
		arg4.anIntArrayArray37 = this.anIntArrayArray37;
		arg4.aShortArray66 = this.aShortArray66;
		arg4.anIntArray444 = this.anIntArray444;
		arg4.aClass216Array3 = this.aClass216Array3;
		arg4.anIntArrayArray38 = this.anIntArrayArray38;
		arg4.aClass173Array3 = this.aClass173Array3;
		if (this.aBoolean521) {
			arg4.anInt6986 = this.anInt6986;
			arg4.aBoolean521 = true;
			arg4.anInt6919 = this.anInt6919;
			arg4.anInt6976 = this.anInt6976;
			arg4.anInt6956 = this.anInt6956;
			arg4.anInt6967 = this.anInt6967;
			arg4.anInt6925 = this.anInt6925;
			arg4.anInt6982 = this.anInt6982;
			arg4.anInt6930 = this.anInt6930;
		} else {
			arg4.aBoolean521 = false;
		}
		arg4.aShortArray75 = this.aShortArray75;
		return arg4;
	}

	@OriginalMember(owner = "client!nka", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort78 = (short) arg0;
		this.method6162();
	}

	@OriginalMember(owner = "client!nka", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean521) {
			this.method6164();
		}
		return this.anInt6976;
	}

	@OriginalMember(owner = "client!nka", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass279_4 != null) {
			this.aClass279_4.aBoolean588 = Static234.method4147(arg0, this.anInt6954);
		}
		if (this.aClass279_3 != null) {
			this.aClass279_3.aBoolean588 = Static14.method189(arg0, this.anInt6954);
		}
		if (this.aClass279_2 != null) {
			this.aClass279_2.aBoolean588 = Static165.method3263(arg0, this.anInt6954);
		}
		if (this.aClass279_1 != null) {
			this.aClass279_1.aBoolean588 = Static313.method4966(arg0, this.anInt6954);
		}
		this.anInt6936 = arg0;
		this.aBoolean519 = true;
		if (this.aClass34_1 != null && (this.anInt6936 & 0x10000) == 0) {
			this.aShortArray71 = this.aClass34_1.aShortArray20;
			this.aByteArray59 = this.aClass34_1.aByteArray7;
			this.aShortArray67 = this.aClass34_1.aShortArray21;
			this.aShortArray72 = this.aClass34_1.aShortArray22;
			this.aClass34_1 = null;
		}
		this.method6158();
	}

	@OriginalMember(owner = "client!nka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) Class96 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean521) {
			this.method6164();
		}
		@Pc(18) int local18 = arg4 + this.anInt6967;
		@Pc(23) int local23 = this.anInt6986 + arg4;
		@Pc(28) int local28 = this.anInt6956 + arg6;
		@Pc(33) int local33 = this.anInt6925 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local18 < 0 || local23 + arg2.anInt9246 >> arg2.anInt9248 >= arg2.anInt9255 || local28 < 0 || arg2.anInt9257 <= arg2.anInt9246 + local33 >> arg2.anInt9248)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local18 < 0 || arg3.anInt9255 <= local23 + arg3.anInt9246 >> arg3.anInt9248 || local28 < 0 || arg3.anInt9257 <= local33 + arg3.anInt9246 >> arg3.anInt9248) {
				return;
			}
		} else {
			local18 >>= arg2.anInt9248;
			local23 = arg2.anInt9246 + local23 - 1 >> arg2.anInt9248;
			local28 >>= arg2.anInt9248;
			local33 = local33 + arg2.anInt9246 - 1 >> arg2.anInt9248;
			if (arg5 == arg2.method8080(local18, local28) && arg5 == arg2.method8080(local23, local28) && arg5 == arg2.method8080(local18, local33) && arg5 == arg2.method8080(local23, local33)) {
				return;
			}
		}
		@Pc(266) int local266;
		if (arg0 == 1) {
			for (local266 = 0; local266 < this.anInt6966; local266++) {
				this.anIntArray442[local266] = this.anIntArray442[local266] + arg2.method8077(this.anIntArray441[local266] - -arg4, arg6 + this.anIntArray443[local266]) - arg5;
			}
		} else {
			@Pc(268) int local268;
			@Pc(277) int local277;
			if (arg0 == 2) {
				local266 = this.anInt6930;
				if (local266 == 0) {
					return;
				}
				for (local268 = 0; local268 < this.anInt6966; local268++) {
					local277 = (this.anIntArray442[local268] << 16) / local266;
					if (arg1 > local277) {
						this.anIntArray442[local268] += (arg2.method8077(this.anIntArray441[local268] + arg4, arg6 + this.anIntArray443[local268]) - arg5) * (arg1 - local277) / arg1;
					}
				}
			} else {
				@Pc(284) int local284;
				if (arg0 == 3) {
					local266 = (arg1 & 0xFF) * 4;
					local268 = (arg1 >> 8 & 0xFF) * 4;
					local277 = (arg1 >> 16 & 0xFF) << 6;
					local284 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local266 >> 1) < 0 || arg2.anInt9255 << arg2.anInt9248 <= arg2.anInt9246 + arg4 + (local266 >> 1) || arg6 - (local268 >> 1) < 0 || arg2.anInt9257 << arg2.anInt9248 <= arg2.anInt9246 + (local268 >> 1) + arg6) {
						return;
					}
					this.method7411(arg4, local266, arg5, arg6, local284, local277, arg2, local268);
				} else if (arg0 == 4) {
					local266 = this.anInt6976 - this.anInt6930;
					for (local268 = 0; local268 < this.anInt6966; local268++) {
						this.anIntArray442[local268] = local266 + this.anIntArray442[local268] + arg3.method8077(arg4 + this.anIntArray441[local268], this.anIntArray443[local268] - -arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local266 = this.anInt6976 - this.anInt6930;
					for (local268 = 0; local268 < this.anInt6966; local268++) {
						local277 = this.anIntArray441[local268] + arg4;
						local284 = arg6 + this.anIntArray443[local268];
						@Pc(290) int local290 = arg2.method8077(local277, local284);
						@Pc(296) int local296 = arg3.method8077(local277, local284);
						@Pc(304) int local304 = local290 - arg1 - local296;
						this.anIntArray442[local268] = local290 + ((this.anIntArray442[local268] << 8) / local266 * local304 >> 8) - arg5;
					}
				}
			}
		}
		this.method6160();
		this.aBoolean521 = false;
	}

	@OriginalMember(owner = "client!nka", name = "c", descriptor = "()[Lclient!iia;")
	@Override
	public Class173[] method7409() {
		return this.aClass173Array3;
	}

	@OriginalMember(owner = "client!nka", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean521) {
			this.method6164();
		}
		return this.anInt6956;
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(Lclient!qa;Lclient!wha;I)V")
	@Override
	public void method7401(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class60_Sub10 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6969 == 0) {
			return;
		}
		@Pc(14) Class109_Sub3 local14 = this.aClass75_Sub1_19.aClass109_Sub3_16;
		if (!this.aBoolean521) {
			this.method6164();
		}
		@Pc(25) Class109_Sub3 local25 = (Class109_Sub3) arg0;
		Static292.aFloat101 = local14.aFloat88 * local25.aFloat91 + local14.aFloat96 * local25.aFloat89 + local14.aFloat86 * local25.aFloat87 + local14.aFloat91;
		Static200.aFloat84 = local25.aFloat95 * local14.aFloat96 + local14.aFloat86 * local25.aFloat94 + local14.aFloat88 * local25.aFloat96;
		@Pc(72) float local72 = Static292.aFloat101 + (float) this.anInt6930 * Static200.aFloat84;
		@Pc(80) float local80 = (float) this.anInt6976 * Static200.aFloat84 + Static292.aFloat101;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local97 = local80 - (float) this.anInt6919;
			local90 = local72 + (float) this.anInt6919;
		} else {
			local90 = (float) this.anInt6919 + local80;
			local97 = (float) -this.anInt6919 + local72;
		}
		if (local97 >= this.aClass75_Sub1_19.aFloat143 || (float) this.aClass75_Sub1_19.anInt7687 >= local90) {
			return;
		}
		Static566.aFloat170 = local25.aFloat96 * local14.aFloat92 + local25.aFloat95 * local14.aFloat94 + local14.aFloat93 * local25.aFloat94;
		Static159.aFloat66 = local14.aFloat87 + local14.aFloat93 * local25.aFloat87 + local14.aFloat94 * local25.aFloat89 + local25.aFloat91 * local14.aFloat92;
		@Pc(175) float local175 = Static566.aFloat170 * (float) this.anInt6930 + Static159.aFloat66;
		@Pc(183) float local183 = Static566.aFloat170 * (float) this.anInt6976 + Static159.aFloat66;
		@Pc(198) float local198;
		@Pc(209) float local209;
		if (local183 < local175) {
			local198 = (float) this.aClass75_Sub1_19.anInt7655 * ((float) -this.anInt6919 + local183);
			local209 = (float) this.aClass75_Sub1_19.anInt7655 * ((float) this.anInt6919 + local175);
		} else {
			local198 = (local175 - (float) this.anInt6919) * (float) this.aClass75_Sub1_19.anInt7655;
			local209 = (local183 + (float) this.anInt6919) * (float) this.aClass75_Sub1_19.anInt7655;
		}
		if (local198 / local90 >= this.aClass75_Sub1_19.aFloat156 || local209 / local90 <= this.aClass75_Sub1_19.aFloat154) {
			return;
		}
		Static546.aFloat177 = local14.aFloat89 + local14.aFloat95 * local25.aFloat89 + local14.aFloat90 * local25.aFloat87 + local14.aFloat85 * local25.aFloat91;
		Static93.aFloat6 = local14.aFloat85 * local25.aFloat96 + local14.aFloat90 * local25.aFloat94 + local25.aFloat95 * local14.aFloat95;
		@Pc(301) float local301 = Static546.aFloat177 + Static93.aFloat6 * (float) this.anInt6930;
		@Pc(309) float local309 = Static93.aFloat6 * (float) this.anInt6976 + Static546.aFloat177;
		@Pc(336) float local336;
		@Pc(324) float local324;
		if (local309 < local301) {
			local324 = (float) this.aClass75_Sub1_19.anInt7688 * ((float) this.anInt6919 + local301);
			local336 = (float) this.aClass75_Sub1_19.anInt7688 * ((float) -this.anInt6919 + local309);
		} else {
			local324 = (float) this.aClass75_Sub1_19.anInt7688 * ((float) this.anInt6919 + local309);
			local336 = ((float) -this.anInt6919 + local301) * (float) this.aClass75_Sub1_19.anInt7688;
		}
		if (this.aClass75_Sub1_19.aFloat157 <= local336 / local90 || this.aClass75_Sub1_19.aFloat151 >= local324 / local90) {
			return;
		}
		if (arg1 != null || this.aClass357Array1 != null) {
			Static483.aFloat162 = local14.aFloat85 * local25.aFloat88 + local25.aFloat85 * local14.aFloat95 + local25.aFloat92 * local14.aFloat90;
			Static532.aFloat174 = local14.aFloat94 * local25.aFloat90 + local14.aFloat93 * local25.aFloat93 + local14.aFloat92 * local25.aFloat86;
			Static178.aFloat175 = local25.aFloat85 * local14.aFloat96 + local14.aFloat86 * local25.aFloat92 + local25.aFloat88 * local14.aFloat88;
			Static123.aFloat48 = local14.aFloat88 * local25.aFloat86 + local14.aFloat96 * local25.aFloat90 + local25.aFloat93 * local14.aFloat86;
			Static450.aFloat159 = local14.aFloat90 * local25.aFloat93 + local25.aFloat90 * local14.aFloat95 + local14.aFloat85 * local25.aFloat86;
			Static669.aFloat200 = local14.aFloat93 * local25.aFloat92 + local14.aFloat94 * local25.aFloat85 + local25.aFloat88 * local14.aFloat92;
		}
		if (arg1 != null) {
			@Pc(502) boolean local502 = false;
			@Pc(504) boolean local504 = true;
			@Pc(513) int local513 = this.anInt6967 + this.anInt6986 >> 1;
			@Pc(521) int local521 = this.anInt6956 + this.anInt6925 >> 1;
			@Pc(540) int local540 = (int) ((float) local521 * Static669.aFloat200 + Static566.aFloat170 * (float) this.anInt6930 + (float) local513 * Static532.aFloat174 + Static159.aFloat66);
			@Pc(559) int local559 = (int) ((float) local521 * Static483.aFloat162 + Static546.aFloat177 + Static450.aFloat159 * (float) local513 + (float) this.anInt6930 * Static93.aFloat6);
			@Pc(578) int local578 = (int) (Static292.aFloat101 + Static123.aFloat48 * (float) local513 + (float) this.anInt6930 * Static200.aFloat84 + (float) local521 * Static178.aFloat175);
			if (local578 >= this.aClass75_Sub1_19.anInt7687) {
				arg1.anInt10338 = this.aClass75_Sub1_19.anInt7654 + local559 * this.aClass75_Sub1_19.anInt7688 / local578;
				arg1.anInt10340 = local540 * this.aClass75_Sub1_19.anInt7655 / local578 + this.aClass75_Sub1_19.anInt7664;
			} else {
				local502 = true;
			}
			@Pc(634) int local634 = (int) (Static669.aFloat200 * (float) local521 + Static532.aFloat174 * (float) local513 + Static159.aFloat66 + Static566.aFloat170 * (float) this.anInt6976);
			@Pc(653) int local653 = (int) ((float) local521 * Static483.aFloat162 + (float) local513 * Static450.aFloat159 + Static546.aFloat177 + (float) this.anInt6976 * Static93.aFloat6);
			@Pc(672) int local672 = (int) (Static178.aFloat175 * (float) local521 + (float) local513 * Static123.aFloat48 + Static292.aFloat101 + Static200.aFloat84 * (float) this.anInt6976);
			if (this.aClass75_Sub1_19.anInt7687 > local672) {
				local502 = true;
			} else {
				arg1.anInt10341 = this.aClass75_Sub1_19.anInt7664 + local634 * this.aClass75_Sub1_19.anInt7655 / local672;
				arg1.anInt10342 = local653 * this.aClass75_Sub1_19.anInt7688 / local672 + this.aClass75_Sub1_19.anInt7654;
			}
			if (local502) {
				if (local578 < this.aClass75_Sub1_19.anInt7687 && local672 < this.aClass75_Sub1_19.anInt7687) {
					local504 = false;
				} else {
					@Pc(762) int local762;
					@Pc(774) int local774;
					@Pc(785) int local785;
					if (local578 < this.aClass75_Sub1_19.anInt7687) {
						local762 = (local672 - this.aClass75_Sub1_19.anInt7687 << 16) / (local672 - local578);
						local774 = (local762 * (local634 - local540) >> 16) + local634;
						arg1.anInt10340 = this.aClass75_Sub1_19.anInt7664 + this.aClass75_Sub1_19.anInt7655 * local774 / this.aClass75_Sub1_19.anInt7687;
						local785 = (local762 * (local653 - local559) >> 16) + local653;
						arg1.anInt10338 = local785 * this.aClass75_Sub1_19.anInt7688 / this.aClass75_Sub1_19.anInt7687 + this.aClass75_Sub1_19.anInt7654;
					} else if (this.aClass75_Sub1_19.anInt7687 > local672) {
						local762 = (local578 - this.aClass75_Sub1_19.anInt7687 << 16) / (local578 - local672);
						local774 = local540 + ((local540 - local634) * local762 >> 16);
						local785 = ((local559 - local653) * local762 >> 16) + local559;
						arg1.anInt10340 = local774 * this.aClass75_Sub1_19.anInt7655 / this.aClass75_Sub1_19.anInt7687 + this.aClass75_Sub1_19.anInt7664;
						arg1.anInt10338 = local785 * this.aClass75_Sub1_19.anInt7688 / this.aClass75_Sub1_19.anInt7687 + this.aClass75_Sub1_19.anInt7654;
					}
				}
			}
			if (local504) {
				arg1.aBoolean765 = true;
				if (local672 >= local578) {
					arg1.anInt10339 = (local634 + this.anInt6919) * this.aClass75_Sub1_19.anInt7655 / local672 + this.aClass75_Sub1_19.anInt7664 - arg1.anInt10341;
				} else {
					arg1.anInt10339 = this.aClass75_Sub1_19.anInt7664 + this.aClass75_Sub1_19.anInt7655 * (local540 + this.anInt6919) / local578 - arg1.anInt10340;
				}
			}
		}
		this.aClass75_Sub1_19.method6791();
		this.aClass75_Sub1_19.method6824(local25);
		this.method6173();
		this.method6172();
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(ILclient!ug;)V")
	private void method6166(@OriginalArg(1) Class6_Sub2_Sub18_Sub2 arg0) {
		if (this.anInt6969 > Static285.anIntArray281.length) {
			Static360.anIntArray358 = new int[this.anInt6969];
			Static285.anIntArray281 = new int[this.anInt6969];
		}
		@Pc(53) int local53;
		@Pc(99) int local99;
		for (@Pc(26) int local26 = 0; local26 < this.anInt6966; local26++) {
			local53 = (this.anIntArray441[local26] - (this.aClass75_Sub1_19.anInt7662 * this.anIntArray442[local26] >> 8) >> this.aClass75_Sub1_19.anInt7672) - arg0.anInt9718;
			@Pc(76) int local76 = (this.anIntArray443[local26] - (this.aClass75_Sub1_19.anInt7666 * this.anIntArray442[local26] >> 8) >> this.aClass75_Sub1_19.anInt7672) - arg0.anInt9720;
			@Pc(81) int local81 = this.anIntArray440[local26];
			@Pc(88) int local88 = this.anIntArray440[local26 + 1];
			for (@Pc(90) int local90 = local81; local90 < local88; local90++) {
				local99 = this.aShortArray65[local90] - 1;
				if (local99 == -1) {
					break;
				}
				Static285.anIntArray281[local99] = local53;
				Static360.anIntArray358[local99] = local76;
			}
		}
		for (local53 = 0; local53 < this.anInt6984; local53++) {
			if (this.aByteArray58 == null || this.aByteArray58[local53] <= 128) {
				@Pc(162) short local162 = this.aShortArray76[local53];
				@Pc(167) short local167 = this.aShortArray69[local53];
				@Pc(172) short local172 = this.aShortArray68[local53];
				local99 = Static285.anIntArray281[local162];
				@Pc(180) int local180 = Static285.anIntArray281[local167];
				@Pc(184) int local184 = Static285.anIntArray281[local172];
				@Pc(188) int local188 = Static360.anIntArray358[local162];
				@Pc(192) int local192 = Static360.anIntArray358[local167];
				@Pc(196) int local196 = Static360.anIntArray358[local172];
				if ((local99 - local180) * (-local196 + local192) - (local192 - local188) * (-local180 + local184) > 0) {
					arg0.method8478(local188, local184, local99, local192, local180, local196);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nka", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean521) {
			this.method6164();
		}
		return this.anInt6986;
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class54 method7398(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(23) Class54_Sub2 local23;
		@Pc(19) Class54_Sub2 local19;
		if (arg0 == 1) {
			local19 = this.aClass75_Sub1_19.aClass54_Sub2_27;
			local23 = this.aClass75_Sub1_19.aClass54_Sub2_26;
		} else if (arg0 == 2) {
			local19 = this.aClass75_Sub1_19.aClass54_Sub2_23;
			local23 = this.aClass75_Sub1_19.aClass54_Sub2_30;
		} else if (arg0 == 3) {
			local23 = this.aClass75_Sub1_19.aClass54_Sub2_28;
			local19 = this.aClass75_Sub1_19.aClass54_Sub2_24;
		} else if (arg0 == 4) {
			local23 = this.aClass75_Sub1_19.aClass54_Sub2_22;
			local19 = this.aClass75_Sub1_19.aClass54_Sub2_25;
		} else if (arg0 == 5) {
			local23 = this.aClass75_Sub1_19.aClass54_Sub2_21;
			local19 = this.aClass75_Sub1_19.aClass54_Sub2_29;
		} else {
			local23 = local19 = new Class54_Sub2(this.aClass75_Sub1_19, 0, 0, true, false);
		}
		return this.method6165(local19, arg1, arg0 != 0, arg2, local23);
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub2_Sub12.anIntArray293[arg0];
		@Pc(13) int local13 = Class6_Sub2_Sub12.anIntArray292[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6966; local15++) {
			@Pc(36) int local36 = this.anIntArray443[local15] * local9 + this.anIntArray441[local15] * local13 >> 14;
			this.anIntArray443[local15] = this.anIntArray443[local15] * local13 - local9 * this.anIntArray441[local15] >> 14;
			this.anIntArray441[local15] = local36;
		}
		this.method6160();
		this.aBoolean521 = false;
	}

	@OriginalMember(owner = "client!nka", name = "c", descriptor = "(B)V")
	public void method6167() {
		if (this.aClass279_4 != null) {
			this.aClass279_4.method6962();
		}
		if (this.aClass279_3 != null) {
			this.aClass279_3.method6962();
		}
		if (this.aClass279_2 != null) {
			this.aClass279_2.method6962();
		}
		if (this.aClass279_1 != null) {
			this.aClass279_1.method6962();
		}
		if (this.aClass50_1 != null) {
			this.aClass50_1.method766();
		}
	}

	@OriginalMember(owner = "client!nka", name = "i", descriptor = "(I)V")
	private void method6168() {
		if (this.aClass50_1 != null) {
			this.aClass50_1.aBoolean49 = false;
		}
	}

	@OriginalMember(owner = "client!nka", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean520;
	}

	@OriginalMember(owner = "client!nka", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean521) {
			this.method6164();
		}
		return this.anInt6982;
	}

	@OriginalMember(owner = "client!nka", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6960; local7++) {
			this.anIntArray441[local7] = this.anIntArray441[local7] + 7 >> 4;
			this.anIntArray442[local7] = this.anIntArray442[local7] + 7 >> 4;
			this.anIntArray443[local7] = this.anIntArray443[local7] + 7 >> 4;
		}
		this.method6160();
		this.aBoolean521 = false;
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(IIIIIIIBI)Z")
	private boolean method6169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 > arg7 && arg2 > arg7 && arg6 > arg7) {
			return false;
		} else if (arg3 < arg7 && arg2 < arg7 && arg6 < arg7) {
			return false;
		} else if (arg4 < arg0 && arg4 < arg5 && arg4 < arg1) {
			return false;
		} else {
			return arg0 >= arg4 || arg5 >= arg4 || arg1 >= arg4;
		}
	}

	@OriginalMember(owner = "client!nka", name = "g", descriptor = "()[Lclient!kw;")
	@Override
	public Class216[] method7408() {
		return this.aClass216Array3;
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(Lclient!qa;Lclient!wha;II)V")
	@Override
	public void method7407(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class60_Sub10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6969 == 0) {
			return;
		}
		@Pc(17) Class109_Sub3 local17 = this.aClass75_Sub1_19.aClass109_Sub3_16;
		@Pc(20) Class109_Sub3 local20 = (Class109_Sub3) arg0;
		if (!this.aBoolean521) {
			this.method6164();
		}
		Static200.aFloat84 = local17.aFloat88 * local20.aFloat96 + local17.aFloat86 * local20.aFloat94 + local17.aFloat96 * local20.aFloat95;
		Static292.aFloat101 = local20.aFloat87 * local17.aFloat86 + local17.aFloat96 * local20.aFloat89 + local20.aFloat91 * local17.aFloat88 + local17.aFloat91;
		@Pc(75) float local75 = (float) this.anInt6930 * Static200.aFloat84 + Static292.aFloat101;
		@Pc(83) float local83 = Static292.aFloat101 + (float) this.anInt6976 * Static200.aFloat84;
		@Pc(100) float local100;
		@Pc(93) float local93;
		if (local75 > local83) {
			local93 = (float) this.anInt6919 + local75;
			local100 = (float) -this.anInt6919 + local83;
		} else {
			local93 = local83 + (float) this.anInt6919;
			local100 = local75 - (float) this.anInt6919;
		}
		if (this.aClass75_Sub1_19.aFloat158 <= local100 || (float) this.aClass75_Sub1_19.anInt7687 >= local93) {
			return;
		}
		Static159.aFloat66 = local17.aFloat87 + local17.aFloat94 * local20.aFloat89 + local17.aFloat93 * local20.aFloat87 + local17.aFloat92 * local20.aFloat91;
		Static566.aFloat170 = local17.aFloat92 * local20.aFloat96 + local17.aFloat93 * local20.aFloat94 + local20.aFloat95 * local17.aFloat94;
		@Pc(178) float local178 = Static159.aFloat66 + (float) this.anInt6930 * Static566.aFloat170;
		@Pc(186) float local186 = Static566.aFloat170 * (float) this.anInt6976 + Static159.aFloat66;
		@Pc(201) float local201;
		@Pc(212) float local212;
		if (local178 > local186) {
			local201 = (float) this.aClass75_Sub1_19.anInt7655 * (local186 - (float) this.anInt6919);
			local212 = (local178 + (float) this.anInt6919) * (float) this.aClass75_Sub1_19.anInt7655;
		} else {
			local201 = ((float) -this.anInt6919 + local178) * (float) this.aClass75_Sub1_19.anInt7655;
			local212 = ((float) this.anInt6919 + local186) * (float) this.aClass75_Sub1_19.anInt7655;
		}
		if (this.aClass75_Sub1_19.aFloat156 <= local201 / (float) arg2 || local212 / (float) arg2 <= this.aClass75_Sub1_19.aFloat154) {
			return;
		}
		Static546.aFloat177 = local17.aFloat89 + local20.aFloat91 * local17.aFloat85 + local17.aFloat95 * local20.aFloat89 + local20.aFloat87 * local17.aFloat90;
		Static93.aFloat6 = local20.aFloat94 * local17.aFloat90 + local17.aFloat95 * local20.aFloat95 + local17.aFloat85 * local20.aFloat96;
		@Pc(306) float local306 = Static546.aFloat177 + Static93.aFloat6 * (float) this.anInt6930;
		@Pc(314) float local314 = (float) this.anInt6976 * Static93.aFloat6 + Static546.aFloat177;
		@Pc(341) float local341;
		@Pc(329) float local329;
		if (local306 > local314) {
			local329 = ((float) this.anInt6919 + local306) * (float) this.aClass75_Sub1_19.anInt7688;
			local341 = (float) this.aClass75_Sub1_19.anInt7688 * ((float) -this.anInt6919 + local314);
		} else {
			local329 = (float) this.aClass75_Sub1_19.anInt7688 * ((float) this.anInt6919 + local314);
			local341 = (local306 - (float) this.anInt6919) * (float) this.aClass75_Sub1_19.anInt7688;
		}
		if (local341 / (float) arg2 >= this.aClass75_Sub1_19.aFloat157 || local329 / (float) arg2 <= this.aClass75_Sub1_19.aFloat151) {
			return;
		}
		if (arg1 != null || this.aClass357Array1 != null) {
			Static669.aFloat200 = local17.aFloat94 * local20.aFloat85 + local20.aFloat92 * local17.aFloat93 + local17.aFloat92 * local20.aFloat88;
			Static483.aFloat162 = local17.aFloat85 * local20.aFloat88 + local20.aFloat85 * local17.aFloat95 + local20.aFloat92 * local17.aFloat90;
			Static450.aFloat159 = local20.aFloat93 * local17.aFloat90 + local20.aFloat90 * local17.aFloat95 + local17.aFloat85 * local20.aFloat86;
			Static123.aFloat48 = local20.aFloat90 * local17.aFloat96 + local17.aFloat86 * local20.aFloat93 + local20.aFloat86 * local17.aFloat88;
			Static532.aFloat174 = local20.aFloat93 * local17.aFloat93 + local20.aFloat90 * local17.aFloat94 + local20.aFloat86 * local17.aFloat92;
			Static178.aFloat175 = local20.aFloat88 * local17.aFloat88 + local20.aFloat85 * local17.aFloat96 + local17.aFloat86 * local20.aFloat92;
		}
		if (arg1 != null) {
			@Pc(514) int local514 = this.anInt6967 + this.anInt6986 >> 1;
			@Pc(522) int local522 = this.anInt6956 + this.anInt6925 >> 1;
			@Pc(541) int local541 = (int) ((float) local522 * Static669.aFloat200 + Static159.aFloat66 + (float) local514 * Static532.aFloat174 + Static566.aFloat170 * (float) this.anInt6930);
			@Pc(560) int local560 = (int) (Static93.aFloat6 * (float) this.anInt6930 + Static546.aFloat177 + Static450.aFloat159 * (float) local514 + (float) local522 * Static483.aFloat162);
			@Pc(579) int local579 = (int) ((float) local514 * Static123.aFloat48 + Static292.aFloat101 + (float) this.anInt6930 * Static200.aFloat84 + Static178.aFloat175 * (float) local522);
			@Pc(598) int local598 = (int) (Static669.aFloat200 * (float) local522 + Static566.aFloat170 * (float) this.anInt6976 + Static532.aFloat174 * (float) local514 + Static159.aFloat66);
			@Pc(617) int local617 = (int) (Static546.aFloat177 + Static450.aFloat159 * (float) local514 + (float) this.anInt6976 * Static93.aFloat6 + (float) local522 * Static483.aFloat162);
			@Pc(636) int local636 = (int) (Static200.aFloat84 * (float) this.anInt6976 + Static292.aFloat101 + Static123.aFloat48 * (float) local514 + (float) local522 * Static178.aFloat175);
			arg1.anInt10338 = this.aClass75_Sub1_19.anInt7654 + this.aClass75_Sub1_19.anInt7688 * local560 / arg2;
			arg1.anInt10340 = local541 * this.aClass75_Sub1_19.anInt7655 / arg2 + this.aClass75_Sub1_19.anInt7664;
			arg1.anInt10341 = this.aClass75_Sub1_19.anInt7664 + local598 * this.aClass75_Sub1_19.anInt7655 / arg2;
			arg1.anInt10342 = this.aClass75_Sub1_19.anInt7654 + local617 * this.aClass75_Sub1_19.anInt7688 / arg2;
			if (this.aClass75_Sub1_19.anInt7687 <= local579 || this.aClass75_Sub1_19.anInt7687 <= local636) {
				arg1.aBoolean765 = true;
				arg1.anInt10339 = (this.anInt6919 + local541) * this.aClass75_Sub1_19.anInt7655 / arg2 + this.aClass75_Sub1_19.anInt7664 - arg1.anInt10340;
			}
		}
		this.aClass75_Sub1_19.method6749((float) arg2);
		this.aClass75_Sub1_19.method6761();
		this.aClass75_Sub1_19.method6824(local20);
		this.method6173();
		this.method6172();
	}

	@OriginalMember(owner = "client!nka", name = "c", descriptor = "(I)Z")
	private boolean method6170() {
		@Pc(14) boolean local14 = !this.aClass279_2.aBoolean589;
		@Pc(30) boolean local30 = (this.anInt6954 & 0x37) != 0 && !this.aClass279_1.aBoolean589;
		@Pc(39) boolean local39 = !this.aClass279_4.aBoolean589;
		@Pc(48) boolean local48 = !this.aClass279_3.aBoolean589;
		if (!local39 && !local14 && !local30 && !local48) {
			return true;
		}
		@Pc(75) boolean local75 = true;
		@Pc(106) Interface6 local106;
		@Pc(120) Buffer local120;
		if (local39) {
			if (this.aShortArray70 == null) {
				return true;
			}
			if (this.aClass279_4.anInterface6_15 == null) {
				this.aClass279_4.anInterface6_15 = this.aClass75_Sub1_19.method6768(this.aBoolean517);
			}
			local106 = this.aClass279_4.anInterface6_15;
			local106.method3659(this.anInt6969 * 12, 12);
			local120 = local106.method3658();
			if (local120 == null) {
				local75 = false;
			} else {
				this.aClass75_Sub1_19.aNativeInterface3.copyPositions(this.anIntArray441, this.anIntArray442, this.anIntArray443, this.aShortArray70, 0, 12, this.anInt6969, local120.getAddress());
				if (local106.method3657()) {
					this.aClass279_4.aBoolean589 = true;
					this.aClass279_4.anInterface6_16 = local106;
				} else {
					local75 = false;
				}
			}
		}
		@Pc(252) short[] local252;
		@Pc(255) short[] local255;
		@Pc(249) short[] local249;
		@Pc(258) byte[] local258;
		if (local14) {
			if (this.aClass279_2.anInterface6_15 == null) {
				this.aClass279_2.anInterface6_15 = this.aClass75_Sub1_19.method6768(this.aBoolean517);
			}
			local106 = this.aClass279_2.anInterface6_15;
			local106.method3659(this.anInt6969 * 4, 4);
			local120 = local106.method3658();
			if (local120 == null) {
				local75 = false;
			} else {
				if ((this.anInt6954 & 0x37) == 0) {
					if (this.aClass34_1 == null) {
						local249 = this.aShortArray71;
						local252 = this.aShortArray67;
						local255 = this.aShortArray72;
						local258 = this.aByteArray59;
					} else {
						local255 = this.aClass34_1.aShortArray22;
						local249 = this.aClass34_1.aShortArray20;
						local252 = this.aClass34_1.aShortArray21;
						local258 = this.aClass34_1.aByteArray7;
					}
					this.aClass75_Sub1_19.aNativeInterface3.copyLighting(this.aShortArray73, this.aByteArray58, this.aShortArray77, local252, local255, local249, local258, this.aShort78, this.aShort77, this.aShortArray66, 0, 4, this.anInt6969, local120.getAddress());
				} else {
					this.aClass75_Sub1_19.aNativeInterface3.copyColours(this.aShortArray73, this.aByteArray58, this.aShortArray77, this.aShort78, this.aShortArray66, 0, 4, this.anInt6969, local120.getAddress());
				}
				if (local106.method3657()) {
					this.aClass279_2.aBoolean589 = true;
					this.aClass279_2.anInterface6_16 = local106;
				} else {
					local75 = false;
				}
			}
		}
		if (local30) {
			if (this.aClass279_1.anInterface6_15 == null) {
				this.aClass279_1.anInterface6_15 = this.aClass75_Sub1_19.method6768(this.aBoolean517);
			}
			local106 = this.aClass279_1.anInterface6_15;
			local106.method3659(this.anInt6969 * 12, 12);
			local120 = local106.method3658();
			if (local120 == null) {
				local75 = false;
			} else {
				if (this.aClass34_1 == null) {
					local258 = this.aByteArray59;
					local255 = this.aShortArray72;
					local249 = this.aShortArray71;
					local252 = this.aShortArray67;
				} else {
					local249 = this.aClass34_1.aShortArray20;
					local258 = this.aClass34_1.aByteArray7;
					local252 = this.aClass34_1.aShortArray21;
					local255 = this.aClass34_1.aShortArray22;
				}
				this.aClass75_Sub1_19.aNativeInterface3.copyNormals(local252, local255, local249, local258, 3.0F / (float) this.aShort77, 3.0F / (float) (this.aShort77 / 2 + this.aShort77), 0, 12, this.anInt6969, local120.getAddress());
				if (local106.method3657()) {
					this.aClass279_1.aBoolean589 = true;
					this.aClass279_1.anInterface6_16 = local106;
				} else {
					local75 = false;
				}
			}
		}
		if (local48) {
			if (this.aClass279_3.anInterface6_15 == null) {
				this.aClass279_3.anInterface6_15 = this.aClass75_Sub1_19.method6768(this.aBoolean517);
			}
			local106 = this.aClass279_3.anInterface6_15;
			local106.method3659(this.anInt6969 * 8, 8);
			local120 = local106.method3658();
			if (local120 == null) {
				local75 = false;
			} else {
				this.aClass75_Sub1_19.aNativeInterface3.copyTexCoords(this.aFloatArray58, this.aFloatArray57, 0, 8, this.anInt6969, local120.getAddress());
				if (local106.method3657()) {
					this.aClass279_3.aBoolean589 = true;
					this.aClass279_3.anInterface6_16 = local106;
				} else {
					local75 = false;
				}
			}
		}
		return local75;
	}

	@OriginalMember(owner = "client!nka", name = "f", descriptor = "()V")
	@Override
	protected void method7418() {
	}

	@OriginalMember(owner = "client!nka", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6966; local7++) {
			if (arg0 != 0) {
				this.anIntArray441[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray442[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray443[local7] += arg2;
			}
		}
		this.method6160();
		this.aBoolean521 = false;
	}

	@OriginalMember(owner = "client!nka", name = "b", descriptor = "()Z")
	@Override
	public boolean method7404() {
		if (this.aShortArray77 == null) {
			return true;
		}
		for (@Pc(13) int local13 = 0; local13 < this.aShortArray77.length; local13++) {
			if (this.aShortArray77[local13] != -1 && !this.aClass75_Sub1_19.anInterface11_10.method6032(this.aShortArray77[local13])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nka", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean521) {
			this.method6164();
		}
		return this.anInt6930;
	}

	@OriginalMember(owner = "client!nka", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean521) {
			this.method6164();
		}
		return this.anInt6967;
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(Lclient!qa;IZIIII)Z")
	private boolean method6171(@OriginalArg(0) Class109 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class109_Sub3 local8 = (Class109_Sub3) arg0;
		@Pc(12) Class109_Sub3 local12 = this.aClass75_Sub1_19.aClass109_Sub3_16;
		@Pc(33) float local33 = local12.aFloat87 + local12.aFloat92 * local8.aFloat91 + local8.aFloat89 * local12.aFloat94 + local8.aFloat87 * local12.aFloat93;
		@Pc(54) float local54 = local12.aFloat89 + local8.aFloat91 * local12.aFloat85 + local8.aFloat89 * local12.aFloat95 + local8.aFloat87 * local12.aFloat90;
		Static483.aFloat162 = local12.aFloat95 * local8.aFloat85 + local8.aFloat92 * local12.aFloat90 + local8.aFloat88 * local12.aFloat85;
		Static532.aFloat174 = local8.aFloat90 * local12.aFloat94 + local8.aFloat93 * local12.aFloat93 + local12.aFloat92 * local8.aFloat86;
		@Pc(111) float local111 = local12.aFloat91 + local8.aFloat91 * local12.aFloat88 + local12.aFloat96 * local8.aFloat89 + local8.aFloat87 * local12.aFloat86;
		Static669.aFloat200 = local8.aFloat88 * local12.aFloat92 + local12.aFloat94 * local8.aFloat85 + local8.aFloat92 * local12.aFloat93;
		Static200.aFloat84 = local12.aFloat88 * local8.aFloat96 + local12.aFloat96 * local8.aFloat95 + local12.aFloat86 * local8.aFloat94;
		Static93.aFloat6 = local8.aFloat94 * local12.aFloat90 + local12.aFloat95 * local8.aFloat95 + local12.aFloat85 * local8.aFloat96;
		Static450.aFloat159 = local12.aFloat85 * local8.aFloat86 + local8.aFloat93 * local12.aFloat90 + local8.aFloat90 * local12.aFloat95;
		Static178.aFloat175 = local12.aFloat96 * local8.aFloat85 + local12.aFloat86 * local8.aFloat92 + local8.aFloat88 * local12.aFloat88;
		Static123.aFloat48 = local12.aFloat88 * local8.aFloat86 + local12.aFloat86 * local8.aFloat93 + local8.aFloat90 * local12.aFloat96;
		Static566.aFloat170 = local8.aFloat96 * local12.aFloat92 + local8.aFloat94 * local12.aFloat93 + local12.aFloat94 * local8.aFloat95;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass75_Sub1_19.anInt7655;
		@Pc(255) int local255 = this.aClass75_Sub1_19.anInt7688;
		if (!this.aBoolean521) {
			this.method6164();
		}
		@Pc(271) int local271 = this.anInt6986 - this.anInt6967 >> 1;
		@Pc(279) int local279 = this.anInt6976 - this.anInt6930 >> 1;
		@Pc(288) int local288 = this.anInt6925 - this.anInt6956 >> 1;
		@Pc(294) int local294 = this.anInt6967 + local271;
		@Pc(299) int local299 = local279 + this.anInt6930;
		@Pc(305) int local305 = this.anInt6956 + local288;
		@Pc(311) int local311 = local294 - (local271 << arg4);
		@Pc(318) int local318 = local299 - (local279 << arg4);
		@Pc(325) int local325 = local305 - (local288 << arg4);
		@Pc(331) int local331 = (local271 << arg4) + local294;
		@Pc(337) int local337 = (local279 << arg4) + local299;
		Static175.anIntArray193[0] = local311;
		@Pc(347) int local347 = local305 + (local288 << arg4);
		Static215.anIntArray217[0] = local318;
		Static175.anIntArray193[1] = local331;
		Static648.anIntArray658[0] = local325;
		Static215.anIntArray217[1] = local318;
		Static648.anIntArray658[1] = local325;
		Static175.anIntArray193[2] = local311;
		Static215.anIntArray217[2] = local337;
		Static648.anIntArray658[2] = local325;
		Static175.anIntArray193[3] = local331;
		Static215.anIntArray217[3] = local337;
		Static648.anIntArray658[3] = local325;
		Static175.anIntArray193[4] = local311;
		Static215.anIntArray217[4] = local318;
		Static648.anIntArray658[4] = local347;
		Static175.anIntArray193[5] = local331;
		Static215.anIntArray217[5] = local318;
		Static648.anIntArray658[5] = local347;
		Static175.anIntArray193[6] = local311;
		Static215.anIntArray217[6] = local337;
		Static648.anIntArray658[6] = local347;
		Static175.anIntArray193[7] = local331;
		Static215.anIntArray217[7] = local337;
		Static648.anIntArray658[7] = local347;
		@Pc(488) float local488;
		@Pc(502) float local502;
		@Pc(474) float local474;
		@Pc(450) float local450;
		@Pc(455) float local455;
		@Pc(460) float local460;
		for (@Pc(441) int local441 = 0; local441 < 8; local441++) {
			local450 = (float) Static175.anIntArray193[local441];
			local455 = (float) Static215.anIntArray217[local441];
			local460 = (float) Static648.anIntArray658[local441];
			local474 = Static178.aFloat175 * local460 + Static200.aFloat84 * local455 + local450 * Static123.aFloat48 + local111;
			local488 = local33 + Static532.aFloat174 * local450 + Static566.aFloat170 * local455 + local460 * Static669.aFloat200;
			local502 = Static483.aFloat162 * local460 + local455 * Static93.aFloat6 + local450 * Static450.aFloat159 + local54;
			if ((float) this.aClass75_Sub1_19.anInt7687 <= local474) {
				if (arg5 > 0) {
					local474 = (float) arg5;
				}
				@Pc(528) float local528 = local488 * (float) local251 / local474 + (float) this.aClass75_Sub1_19.anInt7664;
				if (local243 < local528) {
					local243 = local528;
				}
				if (local528 < local241) {
					local241 = local528;
				}
				@Pc(552) float local552 = (float) this.aClass75_Sub1_19.anInt7654 + local502 * (float) local255 / local474;
				if (local247 < local552) {
					local247 = local552;
				}
				if (local552 < local245) {
					local245 = local552;
				}
				local239 = true;
			}
		}
		if (local239 && local241 < (float) arg3 && (float) arg3 < local243 && (float) arg2 > local245 && local247 > (float) arg2) {
			if (arg1) {
				return true;
			}
			if (Static285.anIntArray281.length < this.anInt6969) {
				Static285.anIntArray281 = new int[this.anInt6969];
				Static360.anIntArray358 = new int[this.anInt6969];
			}
			@Pc(706) int local706;
			for (@Pc(630) int local630 = 0; local630 < this.anInt6966; local630++) {
				local460 = (float) this.anIntArray443[local630];
				local455 = (float) this.anIntArray442[local630];
				local450 = (float) this.anIntArray441[local630];
				local502 = Static93.aFloat6 * local455 + Static450.aFloat159 * local450 + Static483.aFloat162 * local460 + local54;
				local474 = local455 * Static200.aFloat84 + local450 * Static123.aFloat48 + local460 * Static178.aFloat175 + local111;
				local488 = local33 + Static669.aFloat200 * local460 + local455 * Static566.aFloat170 + local450 * Static532.aFloat174;
				@Pc(713) int local713;
				@Pc(715) int local715;
				@Pc(724) int local724;
				if (local474 >= (float) this.aClass75_Sub1_19.anInt7687) {
					if (arg5 > 0) {
						local474 = (float) arg5;
					}
					local706 = (int) ((float) local251 * local488 / local474 + (float) this.aClass75_Sub1_19.anInt7664);
					local713 = (int) ((float) this.aClass75_Sub1_19.anInt7654 + (float) local255 * local502 / local474);
					local715 = this.anIntArray440[local630];
					local724 = this.anIntArray440[local630 + 1];
					for (@Pc(794) int local794 = local715; local794 < local724; local794++) {
						@Pc(803) int local803 = this.aShortArray65[local794] - 1;
						if (local803 == -1) {
							break;
						}
						Static285.anIntArray281[local803] = local706;
						Static360.anIntArray358[local803] = local713;
					}
				} else {
					local706 = this.anIntArray440[local630];
					local713 = this.anIntArray440[local630 + 1];
					for (local715 = local706; local715 < local713; local715++) {
						local724 = this.aShortArray65[local715] - 1;
						if (local724 == -1) {
							break;
						}
						Static285.anIntArray281[this.aShortArray65[local715] - 1] = -999999;
					}
				}
			}
			for (local706 = 0; local706 < this.anInt6989; local706++) {
				if (Static285.anIntArray281[this.aShortArray76[local706]] != -999999 && Static285.anIntArray281[this.aShortArray69[local706]] != -999999 && Static285.anIntArray281[this.aShortArray68[local706]] != -999999 && this.method6169(Static285.anIntArray281[this.aShortArray76[local706]], Static285.anIntArray281[this.aShortArray68[local706]], Static360.anIntArray358[this.aShortArray69[local706]], Static360.anIntArray358[this.aShortArray76[local706]], arg3, Static285.anIntArray281[this.aShortArray69[local706]], Static360.anIntArray358[this.aShortArray68[local706]], arg2)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nka", name = "e", descriptor = "(I)V")
	private void method6172() {
		if (this.aClass357Array1 == null) {
			return;
		}
		this.aClass75_Sub1_19.C(!this.aBoolean520);
		this.aClass75_Sub1_19.method6780(false);
		this.aClass75_Sub1_19.method6795(1, Static389.aClass261_8);
		this.aClass75_Sub1_19.method6816(1, Static389.aClass261_8);
		for (@Pc(35) int local35 = 0; local35 < this.anInt6971; local35++) {
			@Pc(44) Class357 local44 = this.aClass357Array1[local35];
			@Pc(49) Class19 local49 = this.aClass19Array1[local35];
			if (!local44.aBoolean718 || !this.aClass75_Sub1_19.method6705()) {
				@Pc(81) float local81 = (float) (this.anIntArray441[local44.anInt9728] + this.anIntArray441[local44.anInt9725] + this.anIntArray441[local44.anInt9729]) * 0.3333333F;
				@Pc(103) float local103 = (float) (this.anIntArray442[local44.anInt9729] + this.anIntArray442[local44.anInt9728] + this.anIntArray442[local44.anInt9725]) * 0.3333333F;
				@Pc(124) float local124 = (float) (this.anIntArray443[local44.anInt9725] + this.anIntArray443[local44.anInt9728] + this.anIntArray443[local44.anInt9729]) * 0.3333333F;
				@Pc(138) float local138 = local124 * Static669.aFloat200 + local81 * Static532.aFloat174 + local103 * Static566.aFloat170 + Static159.aFloat66;
				@Pc(152) float local152 = Static546.aFloat177 + local81 * Static450.aFloat159 + Static93.aFloat6 * local103 + local124 * Static483.aFloat162;
				@Pc(166) float local166 = Static292.aFloat101 + Static200.aFloat84 * local103 + Static123.aFloat48 * local81 + local124 * Static178.aFloat175;
				@Pc(187) float local187 = (float) (1.0D / Math.sqrt((double) (local166 * local166 + local138 * local138 + local152 * local152))) * (float) local44.anInt9727;
				@Pc(192) Class109_Sub3 local192 = this.aClass75_Sub1_19.method6734();
				local192.method4340(local49.anInt269 * local44.aShort126 >> 7, local152 + (float) local49.anInt272 - local187 * local152, -(local138 * local187) + local138 + (float) local49.anInt268, local44.aShort124 * local49.anInt273 >> 7, local166 - local166 * local187, local49.anInt276);
				local192.method4359(this.aClass75_Sub1_19.aClass109_Sub3_17);
				this.aClass75_Sub1_19.method6820();
				@Pc(248) int local248 = local49.anInt267;
				this.aClass75_Sub1_19.method6809(false, false, local44.aShort125);
				this.aClass75_Sub1_19.method6736(local44.aByte141);
				this.aClass75_Sub1_19.method6801(local248);
				this.aClass75_Sub1_19.method6808();
			}
		}
		this.aClass75_Sub1_19.method6816(1, Static110.aClass261_3);
		this.aClass75_Sub1_19.method6795(1, Static110.aClass261_3);
		this.aClass75_Sub1_19.C(true);
	}

	@OriginalMember(owner = "client!nka", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub2_Sub12.anIntArray293[arg0];
		@Pc(13) int local13 = Class6_Sub2_Sub12.anIntArray292[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6966; local15++) {
			@Pc(35) int local35 = this.anIntArray442[local15] * local13 - local9 * this.anIntArray443[local15] >> 14;
			this.anIntArray443[local15] = local13 * this.anIntArray443[local15] + local9 * this.anIntArray442[local15] >> 14;
			this.anIntArray442[local15] = local35;
		}
		this.method6160();
		this.aBoolean521 = false;
	}

	@OriginalMember(owner = "client!nka", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub2_Sub12.anIntArray293[arg0];
		@Pc(13) int local13 = Class6_Sub2_Sub12.anIntArray292[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6966; local15++) {
			@Pc(35) int local35 = this.anIntArray441[local15] * local13 + local9 * this.anIntArray442[local15] >> 14;
			this.anIntArray442[local15] = local13 * this.anIntArray442[local15] - this.anIntArray441[local15] * local9 >> 14;
			this.anIntArray441[local15] = local35;
		}
		this.method6160();
		this.aBoolean521 = false;
	}

	@OriginalMember(owner = "client!nka", name = "d", descriptor = "(I)V")
	private void method6173() {
		if (this.anInt6984 == 0) {
			return;
		}
		if (this.method6170() && this.method6163()) {
			this.aClass75_Sub1_19.method6827(this.aClass279_4.anInterface6_16, 0);
			this.aClass75_Sub1_19.method6827(this.aClass279_2.anInterface6_16, 1);
			this.aClass75_Sub1_19.method6827(this.aClass279_3.anInterface6_16, 2);
			@Pc(61) boolean local61;
			if ((this.anInt6954 & 0x37) == 0) {
				this.aClass75_Sub1_19.method6780(false);
				local61 = false;
				this.aClass75_Sub1_19.method6753(this.aClass75_Sub1_19.aClass207_17);
			} else {
				this.aClass75_Sub1_19.method6780(true);
				local61 = true;
				this.aClass75_Sub1_19.method6827(this.aClass279_1.anInterface6_16, 3);
				this.aClass75_Sub1_19.method6753(this.aClass75_Sub1_19.aClass207_19);
			}
			for (@Pc(94) int local94 = 0; local94 < this.anIntArray439.length; local94++) {
				@Pc(101) int local101 = this.anIntArray438[local94];
				@Pc(108) int local108 = this.anIntArray438[local94 + 1];
				@Pc(115) int local115 = this.aShortArray77[local101] & 0xFFFF;
				if (local115 == 65535) {
					local115 = -1;
				}
				this.aClass75_Sub1_19.method6809(true, local61, local115);
				this.aClass75_Sub1_19.method6746(Static118.aClass51_4, this.anIntArray439[local94], this.anIntArray444[local94], this.aClass50_1.anInterface25_2, local101 * 3, local108 - local101);
			}
		}
		this.method6158();
	}

	@OriginalMember(owner = "client!nka", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort77 = (short) arg0;
		this.method6160();
		this.method6161();
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(IILclient!qa;ZII)Z")
	@Override
	public boolean method7399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method6171(arg2, arg3, arg1, arg0, arg4, arg5);
	}
}
