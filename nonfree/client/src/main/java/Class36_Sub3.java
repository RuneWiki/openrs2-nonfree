import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class36_Sub3 extends Class36 {

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
	private int anInt6401;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "Z")
	private boolean aBoolean439;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "Lclient!rb;")
	private Class251 aClass251_1;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "Lclient!bh;")
	private Class29 aClass29_1;

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "Lclient!nd;")
	private final Class62_Sub1 aClass62_Sub1_15;

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
	private int anInt6410;

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
	private int anInt6411;

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
	private int anInt6422;

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "Lclient!rb;")
	private Class251 aClass251_2;

	@OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
	private int anInt6426;

	@OriginalMember(owner = "client!oa", name = "ib", descriptor = "Z")
	private boolean aBoolean440;

	@OriginalMember(owner = "client!oa", name = "jb", descriptor = "I")
	private int anInt6432;

	@OriginalMember(owner = "client!oa", name = "kb", descriptor = "I")
	private int anInt6433;

	@OriginalMember(owner = "client!oa", name = "pb", descriptor = "Z")
	private boolean aBoolean441;

	@OriginalMember(owner = "client!oa", name = "Kb", descriptor = "I")
	private int anInt6450;

	@OriginalMember(owner = "client!oa", name = "Mb", descriptor = "Lclient!ih;")
	private Class145 aClass145_1;

	@OriginalMember(owner = "client!oa", name = "Pb", descriptor = "I")
	private int anInt6454;

	@OriginalMember(owner = "client!oa", name = "Tb", descriptor = "Lclient!rb;")
	private Class251 aClass251_3;

	@OriginalMember(owner = "client!oa", name = "jc", descriptor = "I")
	private int anInt6466;

	@OriginalMember(owner = "client!oa", name = "lc", descriptor = "Lclient!rb;")
	private Class251 aClass251_4;

	@OriginalMember(owner = "client!oa", name = "Jb", descriptor = "[I")
	private int[] anIntArray480;

	@OriginalMember(owner = "client!oa", name = "wb", descriptor = "I")
	private int anInt6440;

	@OriginalMember(owner = "client!oa", name = "bb", descriptor = "I")
	private int anInt6429;

	@OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
	private int anInt6414;

	@OriginalMember(owner = "client!oa", name = "ac", descriptor = "[I")
	private int[] anIntArray481;

	@OriginalMember(owner = "client!oa", name = "lb", descriptor = "[I")
	private int[] lb;

	@OriginalMember(owner = "client!oa", name = "Cb", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
	private int anInt6412;

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "[I")
	private int[] anIntArray478;

	@OriginalMember(owner = "client!oa", name = "oc", descriptor = "[Lclient!tf;")
	private Class280[] aClass280Array6;

	@OriginalMember(owner = "client!oa", name = "gc", descriptor = "[Lclient!on;")
	private Class223[] aClass223Array6;

	@OriginalMember(owner = "client!oa", name = "ic", descriptor = "I")
	private int anInt6465;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "[Lclient!rj;")
	private Class255[] aClass255Array1;

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "[Lclient!mca;")
	private Class194[] aClass194Array1;

	@OriginalMember(owner = "client!oa", name = "eb", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!oa", name = "dc", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!oa", name = "cb", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!oa", name = "Bb", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!oa", name = "gb", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!oa", name = "nb", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!oa", name = "vc", descriptor = "[F")
	private float[] aFloatArray63;

	@OriginalMember(owner = "client!oa", name = "yc", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!oa", name = "sb", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!oa", name = "Qb", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!oa", name = "uc", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!oa", name = "xc", descriptor = "[B")
	private byte[] aByteArray86;

	@OriginalMember(owner = "client!oa", name = "fb", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!oa", name = "Xb", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!oa", name = "Vb", descriptor = "[F")
	private float[] aFloatArray62;

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "[I")
	private int[] anIntArray477;

	@OriginalMember(owner = "client!oa", name = "ub", descriptor = "[I")
	private int[] anIntArray479;

	@OriginalMember(owner = "client!oa", name = "nc", descriptor = "[I")
	private int[] anIntArray482;

	@OriginalMember(owner = "client!oa", name = "Db", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!oa", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!nd;Lclient!ld;IIII)V")
	public Class36_Sub3(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) Class184 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface8 local11 = arg0.anInterface8_145;
		this.anIntArray480 = new int[arg1.anInt5399 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt5403];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt5403; local24++) {
			if ((arg1.aByteArray77 == null || arg1.aByteArray77[local24] != 2) && (arg1.aShortArray80 == null || arg1.aShortArray80[local24] == -1 || !local11.method7237(arg1.aShortArray80[local24] & 0xFFFF).aBoolean557)) {
				local22[this.anInt6440++] = local24;
				this.anIntArray480[arg1.aShortArray78[local24]]++;
				this.anIntArray480[arg1.aShortArray74[local24]]++;
				this.anIntArray480[arg1.aShortArray75[local24]]++;
			}
		}
		this.anInt6429 = this.anInt6440;
		@Pc(115) long[] local115 = new long[this.anInt6440];
		@Pc(124) boolean local124 = (this.anInt6450 & 0x100) != 0;
		@Pc(136) int local136;
		@Pc(147) int local147;
		@Pc(277) int local277;
		label498: for (@Pc(126) int local126 = 0; local126 < this.anInt6440; local126++) {
			@Pc(132) int local132 = local22[local126];
			@Pc(134) Class271 local134 = null;
			local136 = 0;
			@Pc(138) byte local138 = 0;
			@Pc(140) byte local140 = 0;
			@Pc(142) byte local142 = 0;
			if (arg1.aClass21Array1 != null) {
				for (local147 = 0; local147 < arg1.aClass21Array1.length; local147++) {
					@Pc(154) Class21 local154 = arg1.aClass21Array1[local147];
					if (local154.anInt536 == local132) {
						@Pc(167) Class147 local167 = Static181.method3084(local154.anInt535);
						if (local167.aBoolean244) {
							local115[local126] = Long.MAX_VALUE;
							this.anInt6429--;
							continue label498;
						}
					}
				}
			}
			@Pc(194) short local194 = -1;
			if (arg1.aShortArray80 != null) {
				local194 = arg1.aShortArray80[local132];
				if (local194 != -1) {
					local134 = local11.method7237(local194 & 0xFFFF);
					local140 = local134.aByte78;
					local142 = local134.aByte79;
				}
			}
			@Pc(239) boolean local239 = arg1.aByteArray78 != null && arg1.aByteArray78[local132] != 0 || local134 != null && !local134.aBoolean561;
			if ((local124 || local239) && arg1.aByteArray73 != null) {
				local136 += arg1.aByteArray73[local132] << 17;
			}
			if (local239) {
				local136 += 65536;
			}
			local136 += (local140 & 0xFF) << 8;
			local277 = local138 + ((local194 & 0xFFFF) << 16);
			local136 += local142 & 0xFF;
			@Pc(289) int local289 = local277 + (local126 & 0xFFFF);
			local115[local126] = ((long) local136 << 32) + (long) local289;
		}
		Static184.method5423(local22, local115);
		this.anInt6414 = arg1.anInt5398;
		this.anIntArray481 = arg1.anIntArray379;
		this.lb = arg1.anIntArray381;
		this.aShortArray92 = arg1.aShortArray79;
		this.anInt6412 = arg1.anInt5399;
		this.anIntArray478 = arg1.anIntArray388;
		@Pc(336) Class314[] local336 = new Class314[this.anInt6412];
		this.aClass280Array6 = arg1.aClass280Array4;
		this.aClass223Array6 = arg1.aClass223Array4;
		@Pc(364) int local364;
		@Pc(378) int local378;
		if (arg1.aClass21Array1 != null) {
			this.anInt6465 = arg1.aClass21Array1.length;
			this.aClass255Array1 = new Class255[this.anInt6465];
			this.aClass194Array1 = new Class194[this.anInt6465];
			for (local364 = 0; local364 < this.anInt6465; local364++) {
				@Pc(371) Class21 local371 = arg1.aClass21Array1[local364];
				@Pc(376) Class147 local376 = Static181.method3084(local371.anInt535);
				local378 = -1;
				for (@Pc(380) int local380 = 0; local380 < this.anInt6440; local380++) {
					if (local371.anInt536 == local22[local380]) {
						local378 = local380;
						break;
					}
				}
				if (local378 == -1) {
					throw new RuntimeException();
				}
				local147 = Static444.anIntArray587[arg1.aShortArray73[local371.anInt536] & 0xFFFF] & 0xFFFFFF;
				local147 |= 255 - (arg1.aByteArray78 == null ? 0 : arg1.aByteArray78[local371.anInt536]) << 24;
				this.aClass255Array1[local364] = new Class255(local378, arg1.aShortArray78[local371.anInt536], arg1.aShortArray74[local371.anInt536], arg1.aShortArray75[local371.anInt536], local376.anInt4022, local376.anInt4025, local376.anInt4021, local376.anInt4017, local376.anInt4023, local376.aBoolean244, local376.aBoolean243, local371.anInt531);
				this.aClass194Array1[local364] = new Class194(local147);
			}
		}
		local364 = this.anInt6440 * 3;
		this.aShort84 = (short) arg3;
		this.aShortArray95 = new short[local364];
		this.aShortArray87 = new short[this.anInt6440];
		Static114.aLongArray4 = new long[local364];
		this.aShortArray86 = new short[this.anInt6440];
		this.aShortArray88 = new short[local364];
		this.aShortArray91 = new short[this.anInt6440];
		if (arg1.aShortArray81 != null) {
			this.aShortArray89 = new short[this.anInt6440];
		}
		this.aByteArray85 = new byte[this.anInt6440];
		this.aFloatArray63 = new float[local364];
		this.aShortArray97 = new short[local364];
		this.aShortArray90 = new short[this.anInt6440];
		this.aShortArray93 = new short[local364];
		this.aShortArray96 = new short[local364];
		this.aByteArray86 = new byte[local364];
		this.aShort85 = (short) arg4;
		this.aShortArray85 = new short[local364];
		this.aShortArray94 = new short[this.anInt6440];
		this.aFloatArray62 = new float[local364];
		local136 = 0;
		for (local277 = 0; local277 < arg1.anInt5399; local277++) {
			local378 = this.anIntArray480[local277];
			this.anIntArray480[local277] = local136;
			local336[local277] = new Class314();
			local136 += local378;
		}
		this.anIntArray480[arg1.anInt5399] = local136;
		@Pc(620) int[] local620 = null;
		@Pc(622) int[] local622 = null;
		@Pc(624) int[] local624 = null;
		@Pc(626) float[][] local626 = null;
		@Pc(644) int[] local644;
		@Pc(652) int local652;
		@Pc(696) int local696;
		@Pc(702) int local702;
		@Pc(715) int local715;
		@Pc(717) int local717;
		@Pc(750) int local750;
		@Pc(755) int local755;
		@Pc(891) float local891;
		@Pc(922) float local922;
		@Pc(893) float local893;
		if (arg1.aByteArray75 != null) {
			@Pc(632) int local632 = arg1.anInt5408;
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
			local620 = new int[local632];
			local624 = new int[local632];
			local626 = new float[local632][];
			local622 = new int[local632];
			for (local696 = 0; local696 < this.anInt6440; local696++) {
				local702 = local22[local696];
				if (arg1.aByteArray75[local702] != -1) {
					local715 = arg1.aByteArray75[local702] & 0xFF;
					for (local717 = 0; local717 < 3; local717++) {
						@Pc(726) short local726;
						if (local717 == 0) {
							local726 = arg1.aShortArray78[local702];
						} else if (local717 == 1) {
							local726 = arg1.aShortArray74[local702];
						} else {
							local726 = arg1.aShortArray75[local702];
						}
						local750 = arg1.anIntArray381[local726];
						local755 = arg1.anIntArray379[local726];
						@Pc(760) int local760 = arg1.anIntArray388[local726];
						if (local635[local715] > local750) {
							local635[local715] = local750;
						}
						if (local750 > local638[local715]) {
							local638[local715] = local750;
						}
						if (local755 < local641[local715]) {
							local641[local715] = local755;
						}
						if (local755 > local644[local715]) {
							local644[local715] = local755;
						}
						if (local647[local715] > local760) {
							local647[local715] = local760;
						}
						if (local760 > local650[local715]) {
							local650[local715] = local760;
						}
					}
				}
			}
			for (local702 = 0; local702 < local632; local702++) {
				@Pc(836) byte local836 = arg1.aByteArray72[local702];
				if (local836 > 0) {
					local620[local702] = (local635[local702] + local638[local702]) / 2;
					local622[local702] = (local641[local702] + local644[local702]) / 2;
					local624[local702] = (local650[local702] + local647[local702]) / 2;
					if (local836 == 1) {
						local755 = arg1.anIntArray384[local702];
						if (local755 == 0) {
							local891 = 1.0F;
							local893 = 1.0F;
						} else if (local755 > 0) {
							local891 = 1.0F;
							local893 = (float) local755 / 1024.0F;
						} else {
							local891 = (float) -local755 / 1024.0F;
							local893 = 1.0F;
						}
						local922 = 64.0F / (float) arg1.anIntArray380[local702];
					} else if (local836 == 2) {
						local891 = 64.0F / (float) arg1.anIntArray384[local702];
						local922 = 64.0F / (float) arg1.anIntArray380[local702];
						local893 = 64.0F / (float) arg1.anIntArray387[local702];
					} else {
						local891 = (float) arg1.anIntArray384[local702] / 1024.0F;
						local922 = (float) arg1.anIntArray380[local702] / 1024.0F;
						local893 = (float) arg1.anIntArray387[local702] / 1024.0F;
					}
					local626[local702] = Static428.method6114(local891, arg1.aShortArray76[local702], arg1.aShortArray77[local702], local922, local893, arg1.aShortArray82[local702], arg1.aByteArray74[local702] & 0xFF);
				}
			}
		}
		@Pc(1017) Class320[] local1017 = new Class320[arg1.anInt5403];
		@Pc(1036) short local1036;
		@Pc(1047) int local1047;
		@Pc(1057) int local1057;
		for (@Pc(1019) int local1019 = 0; local1019 < arg1.anInt5403; local1019++) {
			@Pc(1026) short local1026 = arg1.aShortArray78[local1019];
			@Pc(1031) short local1031 = arg1.aShortArray74[local1019];
			local1036 = arg1.aShortArray75[local1019];
			local1047 = this.lb[local1031] - this.lb[local1026];
			local1057 = this.anIntArray481[local1031] - this.anIntArray481[local1026];
			local652 = this.anIntArray478[local1031] - this.anIntArray478[local1026];
			local696 = this.lb[local1036] - this.lb[local1026];
			local702 = this.anIntArray481[local1036] - this.anIntArray481[local1026];
			local715 = this.anIntArray478[local1036] - this.anIntArray478[local1026];
			local717 = local715 * local1057 - local652 * local702;
			@Pc(1119) int local1119 = local696 * local652 - local715 * local1047;
			local750 = local1047 * local702 - local696 * local1057;
			while (local717 > 8192 || local1119 > 8192 || local750 > 8192 || local717 < -8192 || local1119 < -8192 || local750 < -8192) {
				local750 >>= 0x1;
				local1119 >>= 0x1;
				local717 >>= 0x1;
			}
			local755 = (int) Math.sqrt((double) (local750 * local750 + local717 * local717 + local1119 * local1119));
			if (local755 <= 0) {
				local755 = 1;
			}
			local1119 = local1119 * 256 / local755;
			local750 = local750 * 256 / local755;
			local717 = local717 * 256 / local755;
			@Pc(1217) byte local1217 = arg1.aByteArray77 == null ? 0 : arg1.aByteArray77[local1019];
			if (local1217 == 0) {
				@Pc(1223) Class314 local1223 = local336[local1026];
				local1223.anInt9105 += local1119;
				local1223.anInt9108++;
				local1223.anInt9106 += local750;
				local1223.anInt9107 += local717;
				@Pc(1251) Class314 local1251 = local336[local1031];
				local1251.anInt9106 += local750;
				local1251.anInt9105 += local1119;
				local1251.anInt9108++;
				local1251.anInt9107 += local717;
				@Pc(1279) Class314 local1279 = local336[local1036];
				local1279.anInt9108++;
				local1279.anInt9105 += local1119;
				local1279.anInt9106 += local750;
				local1279.anInt9107 += local717;
			} else if (local1217 == 1) {
				@Pc(1316) Class320 local1316 = local1017[local1019] = new Class320();
				local1316.anInt9148 = local717;
				local1316.anInt9151 = local750;
				local1316.anInt9150 = local1119;
			}
		}
		@Pc(1338) int local1338;
		for (@Pc(1332) int local1332 = 0; local1332 < this.anInt6440; local1332++) {
			local1338 = local22[local1332];
			@Pc(1345) int local1345 = arg1.aShortArray73[local1338] & 0xFFFF;
			@Pc(1353) short local1353;
			if (arg1.aShortArray80 == null) {
				local1353 = -1;
			} else {
				local1353 = arg1.aShortArray80[local1338];
			}
			if (arg1.aByteArray75 == null) {
				local1057 = -1;
			} else {
				local1057 = arg1.aByteArray75[local1338];
			}
			if (arg1.aByteArray78 == null) {
				local652 = 0;
			} else {
				local652 = arg1.aByteArray78[local1338] & 0xFF;
			}
			@Pc(1385) float local1385 = 0.0F;
			@Pc(1387) float local1387 = 0.0F;
			@Pc(1389) float local1389 = 0.0F;
			local891 = 0.0F;
			local922 = 0.0F;
			local893 = 0.0F;
			@Pc(1397) byte local1397 = 0;
			@Pc(1399) byte local1399 = 0;
			@Pc(1401) int local1401 = 0;
			@Pc(1417) byte local1417;
			@Pc(1437) short local1437;
			@Pc(2181) short local2181;
			@Pc(2186) short local2186;
			if (local1353 != -1) {
				if (local1057 == -1) {
					local1387 = 1.0F;
					local922 = 0.0F;
					local1397 = 1;
					local1399 = 2;
					local1385 = 0.0F;
					local1389 = 1.0F;
					local893 = 0.0F;
					local891 = 1.0F;
				} else {
					local1057 &= 0xFF;
					local1417 = arg1.aByteArray72[local1057];
					@Pc(1427) short local1427;
					@Pc(1432) short local1432;
					@Pc(1466) float local1466;
					@Pc(1674) float local1674;
					@Pc(1682) float local1682;
					@Pc(1782) float local1782;
					@Pc(1790) float local1790;
					@Pc(1798) float local1798;
					@Pc(1821) float local1821;
					@Pc(1844) float local1844;
					@Pc(1867) float local1867;
					if (local1417 == 0) {
						local1427 = arg1.aShortArray78[local1338];
						local1432 = arg1.aShortArray74[local1338];
						local1437 = arg1.aShortArray75[local1338];
						local2181 = arg1.aShortArray77[local1057];
						local2186 = arg1.aShortArray76[local1057];
						@Pc(2191) short local2191 = arg1.aShortArray82[local1057];
						@Pc(2197) float local2197 = (float) arg1.anIntArray381[local2181];
						@Pc(2203) float local2203 = (float) arg1.anIntArray379[local2181];
						local1466 = arg1.anIntArray388[local2181];
						local1674 = (float) arg1.anIntArray381[local2186] - local2197;
						local1682 = (float) arg1.anIntArray379[local2186] - local2203;
						@Pc(2235) float local2235 = (float) arg1.anIntArray388[local2186] - local1466;
						@Pc(2243) float local2243 = (float) arg1.anIntArray381[local2191] - local2197;
						@Pc(2252) float local2252 = (float) arg1.anIntArray379[local2191] - local2203;
						@Pc(2260) float local2260 = (float) arg1.anIntArray388[local2191] - local1466;
						@Pc(2269) float local2269 = (float) arg1.anIntArray381[local1427] - local2197;
						@Pc(2277) float local2277 = (float) arg1.anIntArray379[local1427] - local2203;
						@Pc(2286) float local2286 = (float) arg1.anIntArray388[local1427] - local1466;
						@Pc(2294) float local2294 = (float) arg1.anIntArray381[local1432] - local2197;
						@Pc(2303) float local2303 = (float) arg1.anIntArray379[local1432] - local2203;
						local1782 = (float) arg1.anIntArray388[local1432] - local1466;
						local1790 = (float) arg1.anIntArray381[local1437] - local2197;
						local1798 = (float) arg1.anIntArray379[local1437] - local2203;
						local1821 = (float) arg1.anIntArray388[local1437] - local1466;
						local1844 = local1682 * local2260 - local2252 * local2235;
						local1867 = local2235 * local2243 - local1674 * local2260;
						@Pc(2362) float local2362 = local2252 * local1674 - local2243 * local1682;
						@Pc(2370) float local2370 = local2252 * local2362 - local1867 * local2260;
						@Pc(2379) float local2379 = local2260 * local1844 - local2362 * local2243;
						@Pc(2387) float local2387 = local1867 * local2243 - local1844 * local2252;
						@Pc(2401) float local2401 = 1.0F / (local2387 * local2235 + local2379 * local1682 + local2370 * local1674);
						local922 = local2401 * (local2379 * local1798 + local1790 * local2370 + local2387 * local1821);
						local1385 = local2401 * (local2370 * local2269 + local2379 * local2277 + local2286 * local2387);
						local1389 = local2401 * (local2303 * local2379 + local2370 * local2294 + local2387 * local1782);
						@Pc(2452) float local2452 = local2235 * local1844 - local1674 * local2362;
						@Pc(2461) float local2461 = local2362 * local1682 - local2235 * local1867;
						@Pc(2469) float local2469 = local1674 * local1867 - local1844 * local1682;
						@Pc(2483) float local2483 = 1.0F / (local2252 * local2452 + local2243 * local2461 + local2469 * local2260);
						local891 = local2483 * (local2303 * local2452 + local2461 * local2294 + local1782 * local2469);
						local893 = (local1821 * local2469 + local2461 * local1790 + local2452 * local1798) * local2483;
						local1387 = (local2452 * local2277 + local2461 * local2269 + local2286 * local2469) * local2483;
					} else {
						local1427 = arg1.aShortArray78[local1338];
						local1432 = arg1.aShortArray74[local1338];
						local1437 = arg1.aShortArray75[local1338];
						@Pc(1441) int local1441 = local620[local1057];
						@Pc(1445) int local1445 = local622[local1057];
						@Pc(1449) int local1449 = local624[local1057];
						@Pc(1453) float[] local1453 = local626[local1057];
						@Pc(1458) byte local1458 = arg1.aByteArray76[local1057];
						local1466 = (float) arg1.anIntArray386[local1057] / 256.0F;
						if (local1417 == 1) {
							local1674 = (float) arg1.anIntArray387[local1057] / 1024.0F;
							Static288.method4838(local1453, arg1.anIntArray381[local1427], arg1.anIntArray388[local1427], local1449, local1458, local1674, local1466, arg1.anIntArray379[local1427], local1445, local1441);
							local1387 = Static254.aFloat366;
							local1385 = Static211.aFloat174;
							Static288.method4838(local1453, arg1.anIntArray381[local1432], arg1.anIntArray388[local1432], local1449, local1458, local1674, local1466, arg1.anIntArray379[local1432], local1445, local1441);
							local1389 = Static211.aFloat174;
							local891 = Static254.aFloat366;
							Static288.method4838(local1453, arg1.anIntArray381[local1437], arg1.anIntArray388[local1437], local1449, local1458, local1674, local1466, arg1.anIntArray379[local1437], local1445, local1441);
							local893 = Static254.aFloat366;
							local922 = Static211.aFloat174;
							local1682 = local1674 / 2.0F;
							if ((local1458 & 0x1) == 0) {
								if (local922 - local1385 > local1682) {
									local1399 = 1;
									local922 -= local1674;
								} else if (local1682 < local1385 - local922) {
									local1399 = 2;
									local922 += local1674;
								}
								if (local1682 < local1389 - local1385) {
									local1389 -= local1674;
									local1397 = 1;
								} else if (local1385 - local1389 > local1682) {
									local1397 = 2;
									local1389 += local1674;
								}
							} else {
								if (local891 - local1387 > local1682) {
									local1397 = 1;
									local891 -= local1674;
								} else if (local1387 - local891 > local1682) {
									local891 += local1674;
									local1397 = 2;
								}
								if (local1682 < local893 - local1387) {
									local893 -= local1674;
									local1399 = 1;
								} else if (local1387 - local893 > local1682) {
									local1399 = 2;
									local893 += local1674;
								}
							}
						} else if (local1417 == 2) {
							local1674 = (float) arg1.anIntArray385[local1057] / 256.0F;
							local1682 = (float) arg1.anIntArray383[local1057] / 256.0F;
							@Pc(1693) int local1693 = arg1.anIntArray381[local1432] - arg1.anIntArray381[local1427];
							@Pc(1704) int local1704 = arg1.anIntArray379[local1432] - arg1.anIntArray379[local1427];
							@Pc(1715) int local1715 = arg1.anIntArray388[local1432] - arg1.anIntArray388[local1427];
							@Pc(1726) int local1726 = arg1.anIntArray381[local1437] - arg1.anIntArray381[local1427];
							@Pc(1737) int local1737 = arg1.anIntArray379[local1437] - arg1.anIntArray379[local1427];
							@Pc(1748) int local1748 = arg1.anIntArray388[local1437] - arg1.anIntArray388[local1427];
							@Pc(1757) int local1757 = local1748 * local1704 - local1737 * local1715;
							@Pc(1765) int local1765 = local1726 * local1715 - local1693 * local1748;
							@Pc(1774) int local1774 = local1737 * local1693 - local1726 * local1704;
							local1782 = 64.0F / (float) arg1.anIntArray384[local1057];
							local1790 = 64.0F / (float) arg1.anIntArray380[local1057];
							local1798 = 64.0F / (float) arg1.anIntArray387[local1057];
							local1821 = (local1453[0] * (float) local1757 + local1453[1] * (float) local1765 + local1453[2] * (float) local1774) / local1782;
							local1844 = ((float) local1765 * local1453[4] + (float) local1757 * local1453[3] + (float) local1774 * local1453[5]) / local1790;
							local1867 = ((float) local1774 * local1453[8] + local1453[7] * (float) local1765 + local1453[6] * (float) local1757) / local1798;
							local1401 = Static523.method7172(local1821, local1844, local1867);
							Static445.method6297(local1445, arg1.anIntArray379[local1427], local1401, arg1.anIntArray388[local1427], local1682, local1458, local1453, arg1.anIntArray381[local1427], local1441, local1449, local1466, local1674);
							local1385 = Static255.aFloat218;
							local1387 = Static61.aFloat41;
							Static445.method6297(local1445, arg1.anIntArray379[local1432], local1401, arg1.anIntArray388[local1432], local1682, local1458, local1453, arg1.anIntArray381[local1432], local1441, local1449, local1466, local1674);
							local1389 = Static255.aFloat218;
							local891 = Static61.aFloat41;
							Static445.method6297(local1445, arg1.anIntArray379[local1437], local1401, arg1.anIntArray388[local1437], local1682, local1458, local1453, arg1.anIntArray381[local1437], local1441, local1449, local1466, local1674);
							local922 = Static255.aFloat218;
							local893 = Static61.aFloat41;
						} else if (local1417 == 3) {
							Static11.method321(local1445, local1449, arg1.anIntArray388[local1427], local1453, arg1.anIntArray381[local1427], arg1.anIntArray379[local1427], local1441, local1466, local1458);
							local1385 = Static230.aFloat182;
							local1387 = Static452.aFloat327;
							Static11.method321(local1445, local1449, arg1.anIntArray388[local1432], local1453, arg1.anIntArray381[local1432], arg1.anIntArray379[local1432], local1441, local1466, local1458);
							local1389 = Static230.aFloat182;
							local891 = Static452.aFloat327;
							Static11.method321(local1445, local1449, arg1.anIntArray388[local1437], local1453, arg1.anIntArray381[local1437], arg1.anIntArray379[local1437], local1441, local1466, local1458);
							local893 = Static452.aFloat327;
							local922 = Static230.aFloat182;
							if ((local1458 & 0x1) == 0) {
								if (local922 - local1385 > 0.5F) {
									local922--;
									local1399 = 1;
								} else if (local1385 - local922 > 0.5F) {
									local1399 = 2;
									local922++;
								}
								if (local1389 - local1385 > 0.5F) {
									local1397 = 1;
									local1389--;
								} else if (local1385 - local1389 > 0.5F) {
									local1397 = 2;
									local1389++;
								}
							} else {
								if (local891 - local1387 > 0.5F) {
									local1397 = 1;
									local891--;
								} else if (local1387 - local891 > 0.5F) {
									local891++;
									local1397 = 2;
								}
								if (local893 - local1387 > 0.5F) {
									local893--;
									local1399 = 1;
								} else if (local1387 - local893 > 0.5F) {
									local893++;
									local1399 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray77 == null) {
				local1417 = 0;
			} else {
				local1417 = arg1.aByteArray77[local1338];
			}
			if (local1417 == 0) {
				@Pc(2706) long local2706 = ((long) local652 + (long) (local1345 << 8) + (long) (local1401 << 24) << 32) + (long) (local1057 << 2);
				local1437 = arg1.aShortArray78[local1338];
				local2181 = arg1.aShortArray74[local1338];
				local2186 = arg1.aShortArray75[local1338];
				@Pc(2725) Class314 local2725 = local336[local1437];
				this.aShortArray94[local1332] = this.method5349(arg1, local2706, local1385, local1332, local1437, local2725.anInt9107, local1387, local2725.anInt9106, local2725.anInt9108, local2725.anInt9105);
				@Pc(2750) Class314 local2750 = local336[local2181];
				this.aShortArray86[local1332] = this.method5349(arg1, (long) local1397 + local2706, local1389, local1332, local2181, local2750.anInt9107, local891, local2750.anInt9106, local2750.anInt9108, local2750.anInt9105);
				@Pc(2778) Class314 local2778 = local336[local2186];
				this.aShortArray87[local1332] = this.method5349(arg1, (long) local1399 + local2706, local922, local1332, local2186, local2778.anInt9107, local893, local2778.anInt9106, local2778.anInt9108, local2778.anInt9105);
			} else if (local1417 == 1) {
				@Pc(2566) Class320 local2566 = local1017[local1338];
				@Pc(2609) long local2609 = (long) ((local2566.anInt9151 + 256 << 22) + (local2566.anInt9150 + 256 << 12) + (local1057 << 2) + (local2566.anInt9148 <= 0 ? 2048 : 1024)) + ((long) (local1345 << 8) + (long) (local1401 << 24) + (long) local652 << 32);
				this.aShortArray94[local1332] = this.method5349(arg1, local2609, local1385, local1332, arg1.aShortArray78[local1338], local2566.anInt9148, local1387, local2566.anInt9151, 0, local2566.anInt9150);
				this.aShortArray86[local1332] = this.method5349(arg1, local2609 + (long) local1397, local1389, local1332, arg1.aShortArray74[local1338], local2566.anInt9148, local891, local2566.anInt9151, 0, local2566.anInt9150);
				this.aShortArray87[local1332] = this.method5349(arg1, local2609 + (long) local1399, local922, local1332, arg1.aShortArray75[local1338], local2566.anInt9148, local893, local2566.anInt9151, 0, local2566.anInt9150);
			}
			if (arg1.aShortArray80 == null) {
				this.aShortArray91[local1332] = -1;
			} else {
				this.aShortArray91[local1332] = arg1.aShortArray80[local1338];
			}
			if (arg1.aByteArray78 != null) {
				this.aByteArray85[local1332] = arg1.aByteArray78[local1338];
			}
			if (arg1.aShortArray81 != null) {
				this.aShortArray89[local1332] = arg1.aShortArray81[local1338];
			}
			this.aShortArray90[local1332] = arg1.aShortArray73[local1338];
		}
		if (this.anInt6429 > 0) {
			local1338 = 1;
			local1036 = this.aShortArray91[0];
			for (local1047 = 0; local1047 < this.anInt6429; local1047++) {
				@Pc(2878) short local2878 = this.aShortArray91[local1047];
				if (local1036 != local2878) {
					local1338++;
					local1036 = local2878;
				}
			}
			this.anIntArray477 = new int[local1338];
			this.anIntArray479 = new int[local1338 + 1];
			this.anIntArray482 = new int[local1338];
			this.anIntArray479[0] = 0;
			local1057 = this.anInt6410;
			@Pc(2917) short local2917 = 0;
			local1036 = this.aShortArray91[0];
			local1338 = 0;
			for (local696 = 0; local696 < this.anInt6429; local696++) {
				@Pc(2933) short local2933 = this.aShortArray91[local696];
				if (local2933 != local1036) {
					this.anIntArray482[local1338] = local1057;
					this.anIntArray477[local1338] = local2917 + 1 - local1057;
					local1338++;
					this.anIntArray479[local1338] = local696;
					local2917 = 0;
					local1036 = local2933;
					local1057 = this.anInt6410;
				}
				@Pc(2969) short local2969 = this.aShortArray94[local696];
				if (local2969 > local2917) {
					local2917 = local2969;
				}
				if (local2969 < local1057) {
					local1057 = local2969;
				}
				local2969 = this.aShortArray86[local696];
				if (local2969 > local2917) {
					local2917 = local2969;
				}
				if (local1057 > local2969) {
					local1057 = local2969;
				}
				local2969 = this.aShortArray87[local696];
				if (local2969 > local2917) {
					local2917 = local2969;
				}
				if (local2969 < local1057) {
					local1057 = local2969;
				}
			}
			this.anIntArray482[local1338] = local1057;
			this.anIntArray477[local1338] = local2917 + 1 - local1057;
			local1338++;
			this.anIntArray479[local1338] = this.anInt6429;
		}
		Static114.aLongArray4 = null;
		this.aShortArray85 = Static303.method4988(this.aShortArray85, this.anInt6410);
		this.aShortArray93 = Static303.method4988(this.aShortArray93, this.anInt6410);
		this.aShortArray95 = Static303.method4988(this.aShortArray95, this.anInt6410);
		this.aShortArray97 = Static303.method4988(this.aShortArray97, this.anInt6410);
		this.aShortArray96 = Static303.method4988(this.aShortArray96, this.anInt6410);
		this.aByteArray86 = Static46.method1039(this.aByteArray86, this.anInt6410);
		this.aFloatArray62 = Static215.method3484(this.aFloatArray62, this.anInt6410);
		this.aFloatArray63 = Static215.method3484(this.aFloatArray63, this.anInt6410);
		if (arg1.anIntArray378 != null && Static446.method7428(arg2, this.anInt6426)) {
			this.anIntArrayArray50 = arg1.method4525(false);
		}
		if (arg1.aClass21Array1 != null && Static13.method343(arg2, this.anInt6426)) {
			this.anIntArrayArray48 = arg1.method4529();
		}
		if (arg1.anIntArray382 != null && Static527.method7220(arg2, this.anInt6426)) {
			local1338 = 0;
			local644 = new int[256];
			for (local1047 = 0; local1047 < this.anInt6440; local1047++) {
				local1057 = arg1.anIntArray382[local22[local1047]];
				if (local1057 >= 0) {
					@Pc(3188) int local3188 = local644[local1057]++;
					if (local1338 < local1057) {
						local1338 = local1057;
					}
				}
			}
			this.anIntArrayArray49 = new int[local1338 + 1][];
			for (local1057 = 0; local1057 <= local1338; local1057++) {
				this.anIntArrayArray49[local1057] = new int[local644[local1057]];
				local644[local1057] = 0;
			}
			for (local652 = 0; local652 < this.anInt6440; local652++) {
				local696 = arg1.anIntArray382[local22[local652]];
				if (local696 >= 0) {
					this.anIntArrayArray49[local696][local644[local696]++] = local652;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!nd;IIZZ)V")
	public Class36_Sub3(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean439 = false;
		this.aBoolean441 = true;
		this.aBoolean440 = false;
		this.anInt6414 = 0;
		this.anInt6440 = 0;
		this.anInt6410 = 0;
		this.anInt6429 = 0;
		this.anInt6412 = 0;
		this.aBoolean440 = arg4;
		this.anInt6426 = arg2;
		this.anInt6450 = arg1;
		this.aClass62_Sub1_15 = arg0;
		if (arg3 || Static157.method2863(this.anInt6450, this.anInt6426)) {
			this.aClass251_4 = new Class251(Static523.method7171(this.anInt6450, this.anInt6426));
		}
		if (arg3 || Static213.method3469(this.anInt6450, this.anInt6426)) {
			this.aClass251_2 = new Class251(Static311.method5050(this.anInt6450, this.anInt6426));
		}
		if (arg3 || Static423.method6078(this.anInt6450, this.anInt6426)) {
			this.aClass251_3 = new Class251(Static404.method5867(this.anInt6426, this.anInt6450));
		}
		if (arg3 || Static386.method3038(this.anInt6450, this.anInt6426)) {
			this.aClass251_1 = new Class251(Static293.method4902(this.anInt6426, this.anInt6450));
		}
		if (arg3 || Static256.method4336(this.anInt6450, this.anInt6426)) {
			this.aClass29_1 = new Class29(Static477.method6653(this.anInt6450, this.anInt6426));
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class36 method7356(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(24) Class36_Sub3 local24;
		@Pc(20) Class36_Sub3 local20;
		if (arg0 == 1) {
			local20 = this.aClass62_Sub1_15.aClass36_Sub3_29;
			local24 = this.aClass62_Sub1_15.aClass36_Sub3_28;
		} else if (arg0 == 2) {
			local20 = this.aClass62_Sub1_15.aClass36_Sub3_27;
			local24 = this.aClass62_Sub1_15.aClass36_Sub3_23;
		} else if (arg0 == 3) {
			local20 = this.aClass62_Sub1_15.aClass36_Sub3_22;
			local24 = this.aClass62_Sub1_15.aClass36_Sub3_21;
		} else if (arg0 == 4) {
			local20 = this.aClass62_Sub1_15.aClass36_Sub3_26;
			local24 = this.aClass62_Sub1_15.aClass36_Sub3_24;
		} else if (arg0 == 5) {
			local20 = this.aClass62_Sub1_15.aClass36_Sub3_30;
			local24 = this.aClass62_Sub1_15.aClass36_Sub3_25;
		} else {
			local24 = local20 = new Class36_Sub3(this.aClass62_Sub1_15, 0, 0, true, false);
		}
		return this.method5350(arg1, arg2, arg0 != 0, local24, local20);
	}

	@OriginalMember(owner = "client!oa", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6412; local7++) {
			if (arg0 != 128) {
				this.lb[local7] = this.lb[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray481[local7] = arg1 * this.anIntArray481[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray478[local7] = arg2 * this.anIntArray478[local7] >> 7;
			}
		}
		this.method5365();
		this.aBoolean439 = false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	private void method5347() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt6412; local23++) {
			@Pc(30) int local30 = this.lb[local23];
			@Pc(35) int local35 = this.anIntArray481[local23];
			if (local7 > local30) {
				local7 = local30;
			}
			@Pc(49) int local49 = this.anIntArray478[local23];
			if (local9 > local35) {
				local9 = local35;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			if (local11 > local49) {
				local11 = local49;
			}
			if (local49 > local17) {
				local17 = local49;
			}
			@Pc(94) int local94 = local30 * local30 + local49 * local49;
			if (local94 > local19) {
				local19 = local94;
			}
			local94 = local30 * local30 + local49 * local49 + local35 * local35;
			if (local94 > local21) {
				local21 = local94;
			}
		}
		this.anInt6411 = local11;
		this.anInt6433 = local13;
		this.anInt6466 = local7;
		this.anInt6432 = local15;
		this.anInt6422 = local17;
		this.anInt6401 = local9;
		this.anInt6454 = (int) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean439 = true;
	}

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "()V")
	@Override
	public void X() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6412; local3++) {
			this.anIntArray478[local3] = -this.anIntArray478[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt6410; local25++) {
			this.aShortArray96[local25] = (short) -this.aShortArray96[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt6440; local48++) {
			@Pc(55) short local55 = this.aShortArray94[local48];
			this.aShortArray94[local48] = this.aShortArray87[local48];
			this.aShortArray87[local48] = local55;
		}
		this.method5365();
		this.method5352();
		this.method5366();
		this.aBoolean439 = false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIBIII)Z")
	private boolean method5348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < arg4 && arg5 < arg1 && arg5 < arg0) {
			return false;
		} else if (arg4 < arg5 && arg1 < arg5 && arg5 > arg0) {
			return false;
		} else if (arg7 < arg2 && arg7 < arg6 && arg3 > arg7) {
			return false;
		} else {
			return arg2 >= arg7 || arg6 >= arg7 || arg3 >= arg7;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ld;JFIIIFIIII)S")
	private short method5349(@OriginalArg(0) Class184 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(10) int local10 = this.anIntArray480[arg4];
		@Pc(17) int local17 = this.anIntArray480[arg4 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray88[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg1 == Static114.aLongArray4[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray88[local19] = (short) (this.anInt6410 + 1);
		Static114.aLongArray4[local19] = arg1;
		this.aShortArray93[this.anInt6410] = (short) arg3;
		this.aShortArray85[this.anInt6410] = (short) arg4;
		this.aShortArray95[this.anInt6410] = (short) arg5;
		this.aShortArray97[this.anInt6410] = (short) arg9;
		this.aShortArray96[this.anInt6410] = (short) arg7;
		this.aByteArray86[this.anInt6410] = (byte) arg8;
		this.aFloatArray62[this.anInt6410] = arg2;
		this.aFloatArray63[this.anInt6410] = arg6;
		return (short) this.anInt6410++;
	}

	@OriginalMember(owner = "client!oa", name = "ea", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg2 << 4;
			local22 = arg4 << 4;
			Static295.anInt5918 = 0;
			Static494.anInt8486 = 0;
			local28 = 0;
			Static157.anInt3222 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray50.length) {
					local48 = this.anIntArrayArray50[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static295.anInt5918 += this.lb[local56];
						Static157.anInt3222 += this.anIntArray481[local56];
						local28++;
						Static494.anInt8486 += this.anIntArray478[local56];
					}
				}
			}
			if (local28 <= 0) {
				Static157.anInt3222 = local14;
				Static295.anInt5918 = local18;
				Static494.anInt8486 = local22;
			} else {
				Static494.anInt8486 = Static494.anInt8486 / local28 + local22;
				Static157.anInt3222 = local14 + Static157.anInt3222 / local28;
				Static295.anInt5918 = Static295.anInt5918 / local28 + local18;
			}
			return;
		}
		@Pc(164) int[] local164;
		@Pc(166) int local166;
		if (arg0 == 1) {
			local14 = arg3 << 4;
			local22 = arg4 << 4;
			local18 = arg2 << 4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray50.length > local32) {
					local164 = this.anIntArrayArray50[local32];
					for (local166 = 0; local166 < local164.length; local166++) {
						local50 = local164[local166];
						this.lb[local50] += local18;
						this.anIntArray481[local50] += local14;
						this.anIntArray478[local50] += local22;
					}
				}
			}
			return;
		}
		@Pc(282) int local282;
		@Pc(301) int local301;
		@Pc(751) int local751;
		@Pc(760) int local760;
		if (arg0 == 2) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray50.length > local32) {
					local164 = this.anIntArrayArray50[local32];
					if ((arg5 & 0x1) == 0) {
						for (local166 = 0; local166 < local164.length; local166++) {
							local50 = local164[local166];
							this.lb[local50] -= Static295.anInt5918;
							this.anIntArray481[local50] -= Static157.anInt3222;
							this.anIntArray478[local50] -= Static494.anInt8486;
							if (arg4 != 0) {
								local56 = Class5_Sub2_Sub16.anIntArray411[arg4];
								local282 = Class5_Sub2_Sub16.anIntArray410[arg4];
								local301 = this.lb[local50] * local282 + this.anIntArray481[local50] * local56 + 32767 >> 15;
								this.anIntArray481[local50] = local282 * this.anIntArray481[local50] + 32767 - local56 * this.lb[local50] >> 15;
								this.lb[local50] = local301;
							}
							if (arg2 != 0) {
								local56 = Class5_Sub2_Sub16.anIntArray411[arg2];
								local282 = Class5_Sub2_Sub16.anIntArray410[arg2];
								local301 = local282 * this.anIntArray481[local50] + 32767 - this.anIntArray478[local50] * local56 >> 15;
								this.anIntArray478[local50] = this.anIntArray481[local50] * local56 + this.anIntArray478[local50] * local282 + 32767 >> 15;
								this.anIntArray481[local50] = local301;
							}
							if (arg3 != 0) {
								local56 = Class5_Sub2_Sub16.anIntArray411[arg3];
								local282 = Class5_Sub2_Sub16.anIntArray410[arg3];
								local301 = this.anIntArray478[local50] * local56 + this.lb[local50] * local282 + 32767 >> 15;
								this.anIntArray478[local50] = local282 * this.anIntArray478[local50] + 32767 - this.lb[local50] * local56 >> 15;
								this.lb[local50] = local301;
							}
							this.lb[local50] += Static295.anInt5918;
							this.anIntArray481[local50] += Static157.anInt3222;
							this.anIntArray478[local50] += Static494.anInt8486;
						}
					} else {
						for (local166 = 0; local166 < local164.length; local166++) {
							local50 = local164[local166];
							this.lb[local50] -= Static295.anInt5918;
							this.anIntArray481[local50] -= Static157.anInt3222;
							this.anIntArray478[local50] -= Static494.anInt8486;
							if (arg2 != 0) {
								local56 = Class5_Sub2_Sub16.anIntArray411[arg2];
								local282 = Class5_Sub2_Sub16.anIntArray410[arg2];
								local301 = this.anIntArray481[local50] * local282 + 32767 - local56 * this.anIntArray478[local50] >> 15;
								this.anIntArray478[local50] = local282 * this.anIntArray478[local50] + local56 * this.anIntArray481[local50] + 32767 >> 15;
								this.anIntArray481[local50] = local301;
							}
							if (arg4 != 0) {
								local56 = Class5_Sub2_Sub16.anIntArray411[arg4];
								local282 = Class5_Sub2_Sub16.anIntArray410[arg4];
								local301 = local282 * this.lb[local50] + local56 * this.anIntArray481[local50] + 32767 >> 15;
								this.anIntArray481[local50] = local282 * this.anIntArray481[local50] + 32767 - this.lb[local50] * local56 >> 15;
								this.lb[local50] = local301;
							}
							if (arg3 != 0) {
								local56 = Class5_Sub2_Sub16.anIntArray411[arg3];
								local282 = Class5_Sub2_Sub16.anIntArray410[arg3];
								local301 = local56 * this.anIntArray478[local50] + local282 * this.lb[local50] + 32767 >> 15;
								this.anIntArray478[local50] = local282 * this.anIntArray478[local50] + 32767 - this.lb[local50] * local56 >> 15;
								this.lb[local50] = local301;
							}
							this.lb[local50] += Static295.anInt5918;
							this.anIntArray481[local50] += Static157.anInt3222;
							this.anIntArray478[local50] += Static494.anInt8486;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray50.length) {
						local48 = this.anIntArrayArray50[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local282 = this.anIntArray480[local56];
							local301 = this.anIntArray480[local56 + 1];
							for (local751 = local282; local751 < local301; local751++) {
								local760 = this.aShortArray88[local751] - 1;
								if (local760 == -1) {
									break;
								}
								@Pc(770) int local770;
								@Pc(774) int local774;
								@Pc(792) int local792;
								if (arg4 != 0) {
									local770 = Class5_Sub2_Sub16.anIntArray411[arg4];
									local774 = Class5_Sub2_Sub16.anIntArray410[arg4];
									local792 = this.aShortArray97[local760] * local770 + this.aShortArray95[local760] * local774 + 32767 >> 15;
									this.aShortArray97[local760] = (short) (local774 * this.aShortArray97[local760] + 32767 - local770 * this.aShortArray95[local760] >> 15);
									this.aShortArray95[local760] = (short) local792;
								}
								if (arg2 != 0) {
									local770 = Class5_Sub2_Sub16.anIntArray411[arg2];
									local774 = Class5_Sub2_Sub16.anIntArray410[arg2];
									local792 = local774 * this.aShortArray97[local760] + 32767 - local770 * this.aShortArray96[local760] >> 15;
									this.aShortArray96[local760] = (short) (this.aShortArray97[local760] * local770 + this.aShortArray96[local760] * local774 + 32767 >> 15);
									this.aShortArray97[local760] = (short) local792;
								}
								if (arg3 != 0) {
									local770 = Class5_Sub2_Sub16.anIntArray411[arg3];
									local774 = Class5_Sub2_Sub16.anIntArray410[arg3];
									local792 = local774 * this.aShortArray95[local760] + local770 * this.aShortArray96[local760] + 32767 >> 15;
									this.aShortArray96[local760] = (short) (local774 * this.aShortArray96[local760] + 32767 - local770 * this.aShortArray95[local760] >> 15);
									this.aShortArray95[local760] = (short) local792;
								}
							}
						}
					}
				}
				this.method5352();
			}
		} else if (arg0 == 3) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray50.length > local32) {
					local164 = this.anIntArrayArray50[local32];
					for (local166 = 0; local166 < local164.length; local166++) {
						local50 = local164[local166];
						this.lb[local50] -= Static295.anInt5918;
						this.anIntArray481[local50] -= Static157.anInt3222;
						this.anIntArray478[local50] -= Static494.anInt8486;
						this.lb[local50] = arg2 * this.lb[local50] >> 7;
						this.anIntArray481[local50] = arg3 * this.anIntArray481[local50] >> 7;
						this.anIntArray478[local50] = arg4 * this.anIntArray478[local50] >> 7;
						this.lb[local50] += Static295.anInt5918;
						this.anIntArray481[local50] += Static157.anInt3222;
						this.anIntArray478[local50] += Static494.anInt8486;
					}
				}
			}
		} else {
			@Pc(1186) Class194 local1186;
			@Pc(1088) boolean local1088;
			@Pc(1181) Class255 local1181;
			if (arg0 == 5) {
				if (this.anIntArrayArray49 != null) {
					local1088 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray49.length) {
							local48 = this.anIntArrayArray49[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local282 = (this.aByteArray85[local56] & 0xFF) + arg2 * 8;
								if (local282 < 0) {
									local282 = 0;
								} else if (local282 > 255) {
									local282 = 255;
								}
								this.aByteArray85[local56] = (byte) local282;
							}
							local1088 |= local48.length > 0;
						}
					}
					if (local1088) {
						if (this.aClass255Array1 != null) {
							for (local38 = 0; local38 < this.anInt6465; local38++) {
								local1181 = this.aClass255Array1[local38];
								local1186 = this.aClass194Array1[local38];
								local1186.anInt5990 = 255 - (this.aByteArray85[local1181.anInt7525] & 0xFF) << 24 | local1186.anInt5990 & 0xFFFFFF;
							}
						}
						this.method5354();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray49 != null) {
					local1088 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray49.length > local38) {
							local48 = this.anIntArrayArray49[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local282 = this.aShortArray90[local56] & 0xFFFF;
								local301 = local282 >> 10 & 0x3F;
								local751 = local282 >> 7 & 0x7;
								@Pc(1280) int local1280 = local301 + arg2 & 0x3F;
								local760 = local282 & 0x7F;
								local751 += arg3 / 4;
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
								this.aShortArray90[local56] = (short) (local1280 << 10 | local751 << 7 | local760);
							}
							local1088 |= local48.length > 0;
						}
					}
					if (local1088) {
						if (this.aClass255Array1 != null) {
							for (local38 = 0; local38 < this.anInt6465; local38++) {
								local1181 = this.aClass255Array1[local38];
								local1186 = this.aClass194Array1[local38];
								local1186.anInt5990 = Static444.anIntArray587[this.aShortArray90[local1181.anInt7525] & 0xFFFF] & 0xFFFFFF | local1186.anInt5990 & 0xFF000000;
							}
						}
						this.method5354();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray48 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray48.length) {
							local164 = this.anIntArrayArray48[local32];
							for (local166 = 0; local166 < local164.length; local166++) {
								local1186 = this.aClass194Array1[local164[local166]];
								local1186.anInt5986 += arg2;
								local1186.anInt5984 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray48 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray48.length > local32) {
							local164 = this.anIntArrayArray48[local32];
							for (local166 = 0; local166 < local164.length; local166++) {
								local1186 = this.aClass194Array1[local164[local166]];
								local1186.anInt5987 = local1186.anInt5987 * arg2 >> 7;
								local1186.anInt5993 = arg3 * local1186.anInt5993 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray48 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray48.length > local32) {
						local164 = this.anIntArrayArray48[local32];
						for (local166 = 0; local166 < local164.length; local166++) {
							local1186 = this.aClass194Array1[local164[local166]];
							local1186.anInt5988 = arg2 + local1186.anInt5988 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZZLclient!oa;ZLclient!oa;)Lclient!r;")
	private Class36 method5350(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class36_Sub3 arg3, @OriginalArg(5) Class36_Sub3 arg4) {
		arg3.aShort85 = this.aShort85;
		arg3.anInt6410 = this.anInt6410;
		arg3.anInt6426 = this.anInt6426;
		arg3.anInt6465 = this.anInt6465;
		arg3.anInt6440 = this.anInt6440;
		arg3.anInt6414 = this.anInt6414;
		arg3.anInt6429 = this.anInt6429;
		arg3.anInt6412 = this.anInt6412;
		arg3.aShort84 = this.aShort84;
		arg3.anInt6450 = arg0;
		@Pc(50) boolean local50 = Static405.method5869(this.anInt6426, arg0);
		@Pc(56) boolean local56 = Static141.method2634(arg0, this.anInt6426);
		@Pc(62) boolean local62 = Static124.method2348(arg0, this.anInt6426);
		@Pc(68) boolean local68 = local62 | local56 | local50;
		@Pc(169) int local169;
		if (local68) {
			if (!local50) {
				arg3.lb = this.lb;
			} else if (arg4.lb == null || this.anInt6414 > arg4.lb.length) {
				arg3.lb = arg4.lb = new int[this.anInt6414];
			} else {
				arg3.lb = arg4.lb;
			}
			if (!local56) {
				arg3.anIntArray481 = this.anIntArray481;
			} else if (arg4.anIntArray481 == null || this.anInt6414 > arg4.anIntArray481.length) {
				arg3.anIntArray481 = arg4.anIntArray481 = new int[this.anInt6414];
			} else {
				arg3.anIntArray481 = arg4.anIntArray481;
			}
			if (!local62) {
				arg3.anIntArray478 = this.anIntArray478;
			} else if (arg4.anIntArray478 == null || arg4.anIntArray478.length < this.anInt6414) {
				arg3.anIntArray478 = arg4.anIntArray478 = new int[this.anInt6414];
			} else {
				arg3.anIntArray478 = arg4.anIntArray478;
			}
			for (local169 = 0; local169 < this.anInt6414; local169++) {
				if (local50) {
					arg3.lb[local169] = this.lb[local169];
				}
				if (local56) {
					arg3.anIntArray481[local169] = this.anIntArray481[local169];
				}
				if (local62) {
					arg3.anIntArray478[local169] = this.anIntArray478[local169];
				}
			}
		} else {
			arg3.lb = this.lb;
			arg3.anIntArray481 = this.anIntArray481;
			arg3.anIntArray478 = this.anIntArray478;
		}
		if (Static523.method7171(arg0, this.anInt6426)) {
			arg3.aClass251_4 = arg4.aClass251_4;
			arg3.aClass251_4.aBoolean526 = true;
			arg3.aClass251_4.anInterface16_14 = this.aClass251_4.anInterface16_14;
			arg3.aClass251_4.aBoolean525 = this.aClass251_4.aBoolean525;
		} else if (Static157.method2863(arg0, this.anInt6426)) {
			arg3.aClass251_4 = this.aClass251_4;
		} else {
			arg3.aClass251_4 = null;
		}
		if (Static66.method1217(arg0, this.anInt6426)) {
			if (arg4.aShortArray90 == null || arg4.aShortArray90.length < this.anInt6440) {
				arg3.aShortArray90 = arg4.aShortArray90 = new short[this.anInt6440];
			} else {
				arg3.aShortArray90 = arg4.aShortArray90;
			}
			for (local169 = 0; local169 < this.anInt6440; local169++) {
				arg3.aShortArray90[local169] = this.aShortArray90[local169];
			}
		} else {
			arg3.aShortArray90 = this.aShortArray90;
		}
		if (Static33.method799(arg0, this.anInt6426)) {
			if (arg4.aByteArray85 == null || arg4.aByteArray85.length < this.anInt6440) {
				arg3.aByteArray85 = arg4.aByteArray85 = new byte[this.anInt6440];
			} else {
				arg3.aByteArray85 = arg4.aByteArray85;
			}
			for (local169 = 0; local169 < this.anInt6440; local169++) {
				arg3.aByteArray85[local169] = this.aByteArray85[local169];
			}
		} else {
			arg3.aByteArray85 = this.aByteArray85;
		}
		if (Static404.method5867(this.anInt6426, arg0)) {
			arg3.aClass251_3 = arg4.aClass251_3;
			arg3.aClass251_3.aBoolean526 = true;
			arg3.aClass251_3.aBoolean525 = this.aClass251_3.aBoolean525;
			arg3.aClass251_3.anInterface16_14 = this.aClass251_3.anInterface16_14;
		} else if (Static423.method6078(arg0, this.anInt6426)) {
			arg3.aClass251_3 = this.aClass251_3;
		} else {
			arg3.aClass251_3 = null;
		}
		@Pc(550) int local550;
		if (Static77.method4917(arg0, this.anInt6426)) {
			if (arg4.aShortArray95 == null || arg4.aShortArray95.length < this.anInt6410) {
				local169 = this.anInt6410;
				arg3.aShortArray97 = arg4.aShortArray97 = new short[local169];
				arg3.aShortArray96 = arg4.aShortArray96 = new short[local169];
				arg3.aShortArray95 = arg4.aShortArray95 = new short[local169];
			} else {
				arg3.aShortArray95 = arg4.aShortArray95;
				arg3.aShortArray96 = arg4.aShortArray96;
				arg3.aShortArray97 = arg4.aShortArray97;
			}
			if (this.aClass145_1 == null) {
				arg3.aClass145_1 = null;
				for (local169 = 0; local169 < this.anInt6410; local169++) {
					arg3.aShortArray95[local169] = this.aShortArray95[local169];
					arg3.aShortArray97[local169] = this.aShortArray97[local169];
					arg3.aShortArray96[local169] = this.aShortArray96[local169];
				}
			} else {
				if (arg4.aClass145_1 == null) {
					arg4.aClass145_1 = new Class145();
				}
				@Pc(538) Class145 local538 = arg3.aClass145_1 = arg4.aClass145_1;
				if (local538.aShortArray37 == null || local538.aShortArray37.length < this.anInt6410) {
					local550 = this.anInt6410;
					local538.aShortArray36 = new short[local550];
					local538.aShortArray38 = new short[local550];
					local538.aShortArray37 = new short[local550];
					local538.aByteArray51 = new byte[local550];
				}
				for (local550 = 0; local550 < this.anInt6410; local550++) {
					arg3.aShortArray95[local550] = this.aShortArray95[local550];
					arg3.aShortArray97[local550] = this.aShortArray97[local550];
					arg3.aShortArray96[local550] = this.aShortArray96[local550];
					local538.aShortArray37[local550] = this.aClass145_1.aShortArray37[local550];
					local538.aShortArray38[local550] = this.aClass145_1.aShortArray38[local550];
					local538.aShortArray36[local550] = this.aClass145_1.aShortArray36[local550];
					local538.aByteArray51[local550] = this.aClass145_1.aByteArray51[local550];
				}
			}
			arg3.aByteArray86 = this.aByteArray86;
		} else {
			arg3.aShortArray97 = this.aShortArray97;
			arg3.aClass145_1 = this.aClass145_1;
			arg3.aShortArray95 = this.aShortArray95;
			arg3.aShortArray96 = this.aShortArray96;
			arg3.aByteArray86 = this.aByteArray86;
		}
		if (Static293.method4902(this.anInt6426, arg0)) {
			arg3.aClass251_1 = arg4.aClass251_1;
			arg3.aClass251_1.aBoolean525 = this.aClass251_1.aBoolean525;
			arg3.aClass251_1.aBoolean526 = true;
			arg3.aClass251_1.anInterface16_14 = this.aClass251_1.anInterface16_14;
		} else if (Static386.method3038(arg0, this.anInt6426)) {
			arg3.aClass251_1 = this.aClass251_1;
		} else {
			arg3.aClass251_1 = null;
		}
		if (Static431.method6139(arg0, this.anInt6426)) {
			if (arg4.aFloatArray62 == null || arg4.aFloatArray62.length < this.anInt6440) {
				local169 = this.anInt6410;
				arg3.aFloatArray63 = arg4.aFloatArray63 = new float[local169];
				arg3.aFloatArray62 = arg4.aFloatArray62 = new float[local169];
			} else {
				arg3.aFloatArray62 = arg4.aFloatArray62;
				arg3.aFloatArray63 = arg4.aFloatArray63;
			}
			for (local169 = 0; local169 < this.anInt6410; local169++) {
				arg3.aFloatArray62[local169] = this.aFloatArray62[local169];
				arg3.aFloatArray63[local169] = this.aFloatArray63[local169];
			}
		} else {
			arg3.aFloatArray62 = this.aFloatArray62;
			arg3.aFloatArray63 = this.aFloatArray63;
		}
		if (Static311.method5050(arg0, this.anInt6426)) {
			arg3.aClass251_2 = arg4.aClass251_2;
			arg3.aClass251_2.anInterface16_14 = this.aClass251_2.anInterface16_14;
			arg3.aClass251_2.aBoolean526 = true;
			arg3.aClass251_2.aBoolean525 = this.aClass251_2.aBoolean525;
		} else if (Static213.method3469(arg0, this.anInt6426)) {
			arg3.aClass251_2 = this.aClass251_2;
		} else {
			arg3.aClass251_2 = null;
		}
		if (Static394.method5746(this.anInt6426, arg0)) {
			if (arg4.aShortArray94 == null || this.anInt6440 > arg4.aShortArray94.length) {
				local169 = this.anInt6440;
				arg3.aShortArray87 = arg4.aShortArray87 = new short[local169];
				arg3.aShortArray86 = arg4.aShortArray86 = new short[local169];
				arg3.aShortArray94 = arg4.aShortArray94 = new short[local169];
			} else {
				arg3.aShortArray87 = arg4.aShortArray87;
				arg3.aShortArray86 = arg4.aShortArray86;
				arg3.aShortArray94 = arg4.aShortArray94;
			}
			for (local169 = 0; local169 < this.anInt6440; local169++) {
				arg3.aShortArray94[local169] = this.aShortArray94[local169];
				arg3.aShortArray86[local169] = this.aShortArray86[local169];
				arg3.aShortArray87[local169] = this.aShortArray87[local169];
			}
		} else {
			arg3.aShortArray87 = this.aShortArray87;
			arg3.aShortArray86 = this.aShortArray86;
			arg3.aShortArray94 = this.aShortArray94;
		}
		if (Static477.method6653(arg0, this.anInt6426)) {
			arg3.aClass29_1 = arg4.aClass29_1;
			arg3.aClass29_1.aBoolean36 = true;
			arg3.aClass29_1.aBoolean35 = this.aClass29_1.aBoolean35;
			arg3.aClass29_1.anInterface13_3 = this.aClass29_1.anInterface13_3;
		} else if (Static256.method4336(arg0, this.anInt6426)) {
			arg3.aClass29_1 = this.aClass29_1;
		} else {
			arg3.aClass29_1 = null;
		}
		if (Static505.method6629(arg0, this.anInt6426)) {
			if (arg4.aShortArray91 == null || this.anInt6440 > arg4.aShortArray91.length) {
				local169 = this.anInt6440;
				arg3.aShortArray91 = arg4.aShortArray91 = new short[local169];
			} else {
				arg3.aShortArray91 = arg4.aShortArray91;
			}
			for (local169 = 0; local169 < this.anInt6440; local169++) {
				arg3.aShortArray91[local169] = this.aShortArray91[local169];
			}
		} else {
			arg3.aShortArray91 = this.aShortArray91;
		}
		if (!Static267.method4423(this.anInt6426, arg0)) {
			arg3.aClass194Array1 = this.aClass194Array1;
		} else if (arg4.aClass194Array1 == null || arg4.aClass194Array1.length < this.anInt6465) {
			local169 = this.anInt6465;
			arg3.aClass194Array1 = arg4.aClass194Array1 = new Class194[local169];
			for (local550 = 0; local550 < this.anInt6465; local550++) {
				arg3.aClass194Array1[local550] = this.aClass194Array1[local550].method4981();
			}
		} else {
			arg3.aClass194Array1 = arg4.aClass194Array1;
			for (local169 = 0; local169 < this.anInt6465; local169++) {
				arg3.aClass194Array1[local169].method4986(this.aClass194Array1[local169]);
			}
		}
		arg3.anIntArray480 = this.anIntArray480;
		arg3.aShortArray85 = this.aShortArray85;
		arg3.aShortArray92 = this.aShortArray92;
		arg3.aClass223Array6 = this.aClass223Array6;
		if (this.aBoolean439) {
			arg3.anInt6401 = this.anInt6401;
			arg3.anInt6454 = this.anInt6454;
			arg3.anInt6411 = this.anInt6411;
			arg3.anInt6432 = this.anInt6432;
			arg3.anInt6422 = this.anInt6422;
			arg3.anInt6433 = this.anInt6433;
			arg3.aBoolean439 = true;
			arg3.anInt6466 = this.anInt6466;
		} else {
			arg3.aBoolean439 = false;
		}
		arg3.anIntArrayArray48 = this.anIntArrayArray48;
		arg3.anIntArray477 = this.anIntArray477;
		arg3.aShortArray93 = this.aShortArray93;
		arg3.anIntArrayArray50 = this.anIntArrayArray50;
		arg3.aShortArray89 = this.aShortArray89;
		arg3.anIntArray482 = this.anIntArray482;
		arg3.anIntArray479 = this.anIntArray479;
		arg3.anIntArrayArray49 = this.anIntArrayArray49;
		arg3.aClass255Array1 = this.aClass255Array1;
		arg3.aClass280Array6 = this.aClass280Array6;
		arg3.aShortArray88 = this.aShortArray88;
		return arg3;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!lo;)V")
	private void method5351(@OriginalArg(1) Class5_Sub2_Sub13_Sub2 arg0) {
		if (this.anInt6410 > Static323.anIntArray464.length) {
			Static191.anIntArray490 = new int[this.anInt6410];
			Static323.anIntArray464 = new int[this.anInt6410];
		}
		@Pc(47) int local47;
		@Pc(86) int local86;
		@Pc(95) int local95;
		for (@Pc(20) int local20 = 0; local20 < this.anInt6412; local20++) {
			local47 = (this.lb[local20] - (this.anIntArray481[local20] * this.aClass62_Sub1_15.anInt5664 >> 8) >> this.aClass62_Sub1_15.anInt5686) - arg0.anInt5857;
			@Pc(72) int local72 = (this.anIntArray478[local20] - (this.anIntArray481[local20] * this.aClass62_Sub1_15.anInt5691 >> 8) >> this.aClass62_Sub1_15.anInt5686) - arg0.anInt5862;
			@Pc(77) int local77 = this.anIntArray480[local20];
			@Pc(84) int local84 = this.anIntArray480[local20 + 1];
			for (local86 = local77; local86 < local84; local86++) {
				local95 = this.aShortArray88[local86] - 1;
				if (local95 == -1) {
					break;
				}
				Static323.anIntArray464[local95] = local47;
				Static191.anIntArray490[local95] = local72;
			}
		}
		for (local47 = 0; local47 < this.anInt6429; local47++) {
			if (this.aByteArray85 == null || this.aByteArray85[local47] <= 128) {
				@Pc(143) short local143 = this.aShortArray94[local47];
				@Pc(148) short local148 = this.aShortArray86[local47];
				@Pc(153) short local153 = this.aShortArray87[local47];
				local86 = Static323.anIntArray464[local143];
				local95 = Static323.anIntArray464[local148];
				@Pc(165) int local165 = Static323.anIntArray464[local153];
				@Pc(169) int local169 = Static191.anIntArray490[local143];
				@Pc(173) int local173 = Static191.anIntArray490[local148];
				@Pc(177) int local177 = Static191.anIntArray490[local153];
				if ((local86 - local95) * (local173 - local177) - (local173 - local169) * (local165 - local95) > 0) {
					arg0.method4850(local169, local165, local173, local177, local95, local86);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
	@Override
	public void method7357() {
		if (this.anInt6410 > 0 && this.anInt6429 > 0) {
			this.method5357();
			this.method5355();
			this.method5364();
		}
	}

	@OriginalMember(owner = "client!oa", name = "MA", descriptor = "()V")
	@Override
	protected void MA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6414; local7++) {
			this.lb[local7] = this.lb[local7] + 7 >> 4;
			this.anIntArray481[local7] = this.anIntArray481[local7] + 7 >> 4;
			this.anIntArray478[local7] = this.anIntArray478[local7] + 7 >> 4;
		}
		this.method5365();
		this.aBoolean439 = false;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
	private void method5352() {
		if ((this.anInt6426 & 0x37) == 0) {
			if (this.aClass251_3 != null) {
				this.aClass251_3.aBoolean525 = false;
			}
		} else if (this.aClass251_1 != null) {
			this.aClass251_1.aBoolean525 = false;
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	private void method5354() {
		if (this.aClass251_3 != null) {
			this.aClass251_3.aBoolean525 = false;
		}
	}

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "()I")
	@Override
	public int U() {
		if (!this.aBoolean439) {
			this.method5347();
		}
		return this.anInt6422;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method7349(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class36_Sub3 local8 = (Class36_Sub3) arg0;
		if (this.anInt6440 == 0 || local8.anInt6440 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt6412;
		@Pc(24) int[] local24 = local8.lb;
		@Pc(27) int[] local27 = local8.anIntArray481;
		@Pc(30) int[] local30 = local8.anIntArray478;
		@Pc(33) short[] local33 = local8.aShortArray95;
		@Pc(36) short[] local36 = local8.aShortArray97;
		@Pc(39) short[] local39 = local8.aShortArray96;
		@Pc(42) byte[] local42 = local8.aByteArray86;
		@Pc(53) short[] local53;
		@Pc(47) short[] local47;
		@Pc(49) short[] local49;
		@Pc(51) byte[] local51;
		if (this.aClass145_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local49 = this.aClass145_1.aShortArray36;
			local53 = this.aClass145_1.aShortArray37;
			local47 = this.aClass145_1.aShortArray38;
			local51 = this.aClass145_1.aByteArray51;
		}
		@Pc(76) short[] local76;
		@Pc(82) short[] local82;
		@Pc(80) short[] local80;
		@Pc(78) byte[] local78;
		if (local8.aClass145_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local80 = local8.aClass145_1.aShortArray36;
			local76 = local8.aClass145_1.aShortArray37;
			local78 = local8.aClass145_1.aByteArray51;
			local82 = local8.aClass145_1.aShortArray38;
		}
		@Pc(103) int[] local103 = local8.anIntArray480;
		@Pc(106) short[] local106 = local8.aShortArray88;
		if (!local8.aBoolean439) {
			local8.method5347();
		}
		@Pc(115) int local115 = local8.anInt6401;
		@Pc(118) int local118 = local8.anInt6432;
		@Pc(121) int local121 = local8.anInt6466;
		@Pc(124) int local124 = local8.anInt6433;
		@Pc(127) int local127 = local8.anInt6411;
		@Pc(130) int local130 = local8.anInt6422;
		for (@Pc(132) int local132 = 0; local132 < this.anInt6412; local132++) {
			@Pc(142) int local142 = this.anIntArray481[local132] - arg2;
			if (local115 <= local142 && local118 >= local142) {
				@Pc(161) int local161 = this.lb[local132] - arg1;
				if (local121 <= local161 && local124 >= local161) {
					@Pc(181) int local181 = this.anIntArray478[local132] - arg3;
					if (local127 <= local181 && local181 <= local130) {
						@Pc(191) int local191 = -1;
						@Pc(196) int local196 = this.anIntArray480[local132];
						@Pc(203) int local203 = this.anIntArray480[local132 + 1];
						for (@Pc(205) int local205 = local196; local205 < local203; local205++) {
							local191 = this.aShortArray88[local205] - 1;
							if (local191 == -1 || this.aByteArray86[local191] != 0) {
								break;
							}
						}
						if (local191 != -1) {
							for (@Pc(234) int local234 = 0; local234 < local21; local234++) {
								if (local24[local234] == local161 && local30[local234] == local181 && local142 == local27[local234]) {
									@Pc(257) int local257 = -1;
									local203 = local103[local234 + 1];
									local196 = local103[local234];
									for (@Pc(269) int local269 = local196; local269 < local203; local269++) {
										local257 = local106[local269] - 1;
										if (local257 == -1 || local42[local257] != 0) {
											break;
										}
									}
									if (local257 != -1) {
										if (local53 == null) {
											this.aClass145_1 = new Class145();
											local53 = this.aClass145_1.aShortArray37 = Static149.method2769(this.aShortArray95);
											local47 = this.aClass145_1.aShortArray38 = Static149.method2769(this.aShortArray97);
											local49 = this.aClass145_1.aShortArray36 = Static149.method2769(this.aShortArray96);
											local51 = this.aClass145_1.aByteArray51 = Static51.method1070(this.aByteArray86);
										}
										if (local76 == null) {
											@Pc(351) Class145 local351 = local8.aClass145_1 = new Class145();
											local76 = local351.aShortArray37 = Static149.method2769(local33);
											local82 = local351.aShortArray38 = Static149.method2769(local36);
											local80 = local351.aShortArray36 = Static149.method2769(local39);
											local78 = local351.aByteArray51 = Static51.method1070(local42);
										}
										@Pc(384) short local384 = this.aShortArray95[local191];
										@Pc(389) short local389 = this.aShortArray97[local191];
										@Pc(394) short local394 = this.aShortArray96[local191];
										@Pc(399) byte local399 = this.aByteArray86[local191];
										local203 = local103[local234 + 1];
										local196 = local103[local234];
										@Pc(419) int local419;
										for (@Pc(411) int local411 = local196; local411 < local203; local411++) {
											local419 = local106[local411] - 1;
											if (local419 == -1) {
												break;
											}
											if (local78[local419] != 0) {
												local76[local419] += local384;
												local82[local419] += local389;
												local80[local419] += local394;
												local78[local419] += local399;
											}
										}
										local399 = local42[local257];
										local389 = local36[local257];
										local196 = this.anIntArray480[local132];
										local203 = this.anIntArray480[local132 + 1];
										local384 = local33[local257];
										local394 = local39[local257];
										for (local419 = local196; local419 < local203; local419++) {
											@Pc(504) int local504 = this.aShortArray88[local419] - 1;
											if (local504 == -1) {
												break;
											}
											if (local51[local504] != 0) {
												local53[local504] += local384;
												local47[local504] += local389;
												local49[local504] += local394;
												local51[local504] += local399;
											}
										}
										local8.method5352();
										this.method5352();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)Z")
	private boolean method5355() {
		if (this.aClass29_1.aBoolean35) {
			return true;
		}
		if (this.aClass29_1.anInterface13_2 == null) {
			this.aClass29_1.anInterface13_2 = this.aClass62_Sub1_15.method4657(this.aBoolean440);
		}
		@Pc(34) Interface13 local34 = this.aClass29_1.anInterface13_2;
		local34.method3488(this.anInt6429 * 6);
		@Pc(46) Buffer local46 = local34.method3487();
		if (local46 != null) {
			@Pc(54) Stream local54 = this.aClass62_Sub1_15.method4693(local46);
			@Pc(58) int local58;
			if (Stream.c()) {
				for (local58 = 0; local58 < this.anInt6429; local58++) {
					local54.e(this.aShortArray94[local58]);
					local54.e(this.aShortArray86[local58]);
					local54.e(this.aShortArray87[local58]);
				}
			} else {
				for (local58 = 0; local58 < this.anInt6429; local58++) {
					local54.a(this.aShortArray94[local58]);
					local54.a(this.aShortArray86[local58]);
					local54.a(this.aShortArray87[local58]);
				}
			}
			local54.b();
			if (local34.method3492()) {
				this.aBoolean441 = true;
				this.aClass29_1.aBoolean35 = true;
				this.aClass29_1.anInterface13_3 = local34;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	public void method5356() {
		if (this.aClass251_4 != null) {
			this.aClass251_4.method6002();
		}
		if (this.aClass251_2 != null) {
			this.aClass251_2.method6002();
		}
		if (this.aClass251_3 != null) {
			this.aClass251_3.method6002();
		}
		if (this.aClass251_1 != null) {
			this.aClass251_1.method6002();
		}
		if (this.aClass29_1 != null) {
			this.aClass29_1.method839();
		}
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.aShort84 = (short) arg0;
		this.method5354();
	}

	@OriginalMember(owner = "client!oa", name = "OA", descriptor = "(I)V")
	@Override
	public void OA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub2_Sub16.anIntArray411[arg0];
		@Pc(13) int local13 = Class5_Sub2_Sub16.anIntArray410[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6412; local15++) {
			@Pc(33) int local33 = this.anIntArray478[local15] * local9 + local13 * this.lb[local15] >> 15;
			this.anIntArray478[local15] = this.anIntArray478[local15] * local13 - local9 * this.lb[local15] >> 15;
			this.lb[local15] = local33;
		}
		this.method5365();
		this.aBoolean439 = false;
	}

	@OriginalMember(owner = "client!oa", name = "ca", descriptor = "(III)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6412; local3++) {
			if (arg0 != 0) {
				this.lb[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray481[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray478[local3] += arg2;
			}
		}
		this.method5365();
		this.aBoolean439 = false;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)Z")
	private boolean method5357() {
		@Pc(13) boolean local13 = !this.aClass251_3.aBoolean525;
		@Pc(29) boolean local29 = (this.anInt6426 & 0x37) != 0 && !this.aClass251_1.aBoolean525;
		@Pc(45) boolean local45 = !this.aClass251_4.aBoolean525;
		@Pc(53) boolean local53 = !this.aClass251_2.aBoolean525;
		if (!local45 && !local13 && !local29 && !local53) {
			return true;
		}
		@Pc(65) boolean local65 = true;
		@Pc(84) Interface16 local84;
		@Pc(98) Buffer local98;
		if (local45) {
			if (this.aClass251_4.anInterface16_13 == null) {
				this.aClass251_4.anInterface16_13 = this.aClass62_Sub1_15.method4702(this.aBoolean440);
			}
			local84 = this.aClass251_4.anInterface16_13;
			local84.method3464(12, this.anInt6410 * 12);
			local98 = local84.method3487();
			if (local98 == null) {
				local65 = false;
			} else {
				this.aClass62_Sub1_15.aNativeInterface3.copyPositions(this.lb, this.anIntArray481, this.anIntArray478, this.aShortArray85, 0, 12, this.anInt6410, local98.getAddress());
				if (local84.method3492()) {
					this.aClass251_4.aBoolean525 = true;
					this.aClass251_4.anInterface16_14 = local84;
				} else {
					local65 = false;
				}
			}
		}
		@Pc(216) short[] local216;
		@Pc(213) short[] local213;
		@Pc(219) short[] local219;
		@Pc(222) byte[] local222;
		if (local13) {
			if (this.aClass251_3.anInterface16_13 == null) {
				this.aClass251_3.anInterface16_13 = this.aClass62_Sub1_15.method4702(this.aBoolean440);
			}
			local84 = this.aClass251_3.anInterface16_13;
			local84.method3464(4, this.anInt6410 * 4);
			local98 = local84.method3487();
			if (local98 == null) {
				local65 = false;
			} else {
				if ((this.anInt6426 & 0x37) == 0) {
					if (this.aClass145_1 == null) {
						local213 = this.aShortArray97;
						local216 = this.aShortArray95;
						local219 = this.aShortArray96;
						local222 = this.aByteArray86;
					} else {
						local213 = this.aClass145_1.aShortArray38;
						local222 = this.aClass145_1.aByteArray51;
						local216 = this.aClass145_1.aShortArray37;
						local219 = this.aClass145_1.aShortArray36;
					}
					this.aClass62_Sub1_15.aNativeInterface3.copyLighting(this.aShortArray90, this.aByteArray85, this.aShortArray91, local216, local213, local219, local222, this.aShort84, this.aShort85, this.aShortArray93, 0, 4, this.anInt6410, local98.getAddress());
				} else {
					this.aClass62_Sub1_15.aNativeInterface3.copyColours(this.aShortArray90, this.aByteArray85, this.aShortArray91, this.aShort84, this.aShortArray93, 0, 4, this.anInt6410, local98.getAddress());
				}
				if (local84.method3492()) {
					this.aClass251_3.anInterface16_14 = local84;
					this.aClass251_3.aBoolean525 = true;
				} else {
					local65 = false;
				}
			}
		}
		if (local29) {
			if (this.aClass251_1.anInterface16_13 == null) {
				this.aClass251_1.anInterface16_13 = this.aClass62_Sub1_15.method4702(this.aBoolean440);
			}
			local84 = this.aClass251_1.anInterface16_13;
			local84.method3464(12, this.anInt6410 * 12);
			local98 = local84.method3487();
			if (local98 == null) {
				local65 = false;
			} else {
				if (this.aClass145_1 == null) {
					local219 = this.aShortArray96;
					local222 = this.aByteArray86;
					local213 = this.aShortArray97;
					local216 = this.aShortArray95;
				} else {
					local219 = this.aClass145_1.aShortArray36;
					local216 = this.aClass145_1.aShortArray37;
					local213 = this.aClass145_1.aShortArray38;
					local222 = this.aClass145_1.aByteArray51;
				}
				this.aClass62_Sub1_15.aNativeInterface3.copyNormals(local216, local213, local219, local222, 3.0F / (float) this.aShort85, 3.0F / (float) (this.aShort85 / 2 + this.aShort85), 0, 12, this.anInt6410, local98.getAddress());
				if (local84.method3492()) {
					this.aClass251_1.anInterface16_14 = local84;
					this.aClass251_1.aBoolean525 = true;
				} else {
					local65 = false;
				}
			}
		}
		if (local53) {
			if (this.aClass251_2.anInterface16_13 == null) {
				this.aClass251_2.anInterface16_13 = this.aClass62_Sub1_15.method4702(this.aBoolean440);
			}
			local84 = this.aClass251_2.anInterface16_13;
			local84.method3464(8, this.anInt6410 * 8);
			local98 = local84.method3487();
			if (local98 == null) {
				local65 = false;
			} else {
				this.aClass62_Sub1_15.aNativeInterface3.copyTexCoords(this.aFloatArray62, this.aFloatArray63, 0, 8, this.anInt6410, local98.getAddress());
				if (local84.method3492()) {
					this.aClass251_2.anInterface16_14 = local84;
					this.aClass251_2.aBoolean525 = true;
				} else {
					local65 = false;
				}
			}
		}
		return local65;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(B)V")
	private void method5359() {
		if (this.anInt6429 == 0) {
			return;
		}
		if (this.method5357() && this.method5355()) {
			this.aClass62_Sub1_15.method4673(0, this.aClass251_4.anInterface16_14);
			this.aClass62_Sub1_15.method4673(1, this.aClass251_3.anInterface16_14);
			this.aClass62_Sub1_15.method4673(2, this.aClass251_2.anInterface16_14);
			@Pc(62) boolean local62;
			if ((this.anInt6426 & 0x37) == 0) {
				local62 = false;
				this.aClass62_Sub1_15.method4760(false);
				this.aClass62_Sub1_15.method4713(this.aClass62_Sub1_15.aClass318_19);
			} else {
				this.aClass62_Sub1_15.method4760(true);
				local62 = true;
				this.aClass62_Sub1_15.method4713(this.aClass62_Sub1_15.aClass318_18);
				this.aClass62_Sub1_15.method4673(3, this.aClass251_1.anInterface16_14);
			}
			for (@Pc(95) int local95 = 0; local95 < this.anIntArray482.length; local95++) {
				@Pc(102) int local102 = this.anIntArray479[local95];
				@Pc(109) int local109 = this.anIntArray479[local95 + 1];
				@Pc(116) int local116 = this.aShortArray91[local102] & 0xFFFF;
				if (local116 == 65535) {
					local116 = -1;
				}
				this.aClass62_Sub1_15.method4656(local116, local62, true);
				this.aClass62_Sub1_15.method4727(Static403.aClass228_7, local102 * 3, this.anIntArray477[local95], local109 - local102, this.aClass29_1.anInterface13_3, this.anIntArray482[local95]);
			}
		}
		this.method5364();
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()[Lclient!tf;")
	@Override
	public Class280[] method7361() {
		return this.aClass280Array6;
	}

	@OriginalMember(owner = "client!oa", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		return this.anInt6450;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!m;Lclient!paa;II)V")
	@Override
	public void method7346(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class30_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6410 == 0) {
			return;
		}
		@Pc(13) Class78_Sub1 local13 = this.aClass62_Sub1_15.aClass78_Sub1_16;
		@Pc(16) Class78_Sub1 local16 = (Class78_Sub1) arg0;
		if (!this.aBoolean439) {
			this.method5347();
		}
		Static28.aFloat24 = local16.aFloat123 * local13.aFloat124 + local16.aFloat122 * local13.aFloat127 + local13.aFloat129 * local16.aFloat121 + local13.aFloat123;
		Static155.aFloat153 = local16.aFloat129 * local13.aFloat124 + local16.aFloat125 * local13.aFloat129 + local13.aFloat127 * local16.aFloat132;
		@Pc(69) float local69 = Static155.aFloat153 * (float) this.anInt6401 + Static28.aFloat24;
		@Pc(77) float local77 = Static155.aFloat153 * (float) this.anInt6432 + Static28.aFloat24;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local69 > local77) {
			local88 = (float) -this.anInt6454 + local77;
			local94 = local69 + (float) this.anInt6454;
		} else {
			local94 = local77 + (float) this.anInt6454;
			local88 = local69 - (float) this.anInt6454;
		}
		if (this.aClass62_Sub1_15.aFloat238 <= local88 || (float) this.aClass62_Sub1_15.anInt5676 >= local94) {
			return;
		}
		Static360.aFloat293 = local13.aFloat131 * local16.aFloat123 + local13.aFloat130 * local16.aFloat122 + local13.aFloat132 * local16.aFloat121 + local13.aFloat122;
		Static75.aFloat52 = local13.aFloat132 * local16.aFloat125 + local16.aFloat132 * local13.aFloat130 + local13.aFloat131 * local16.aFloat129;
		@Pc(170) float local170 = Static360.aFloat293 + (float) this.anInt6401 * Static75.aFloat52;
		@Pc(178) float local178 = Static360.aFloat293 + Static75.aFloat52 * (float) this.anInt6432;
		@Pc(204) float local204;
		@Pc(193) float local193;
		if (local178 < local170) {
			local193 = (float) this.aClass62_Sub1_15.anInt5696 * ((float) this.anInt6454 + local170);
			local204 = (local178 - (float) this.anInt6454) * (float) this.aClass62_Sub1_15.anInt5696;
		} else {
			local193 = ((float) this.anInt6454 + local178) * (float) this.aClass62_Sub1_15.anInt5696;
			local204 = ((float) -this.anInt6454 + local170) * (float) this.aClass62_Sub1_15.anInt5696;
		}
		if (this.aClass62_Sub1_15.aFloat244 <= local204 / (float) arg2 || this.aClass62_Sub1_15.aFloat228 >= local193 / (float) arg2) {
			return;
		}
		Static309.aFloat261 = local13.aFloat126 * local16.aFloat132 + local13.aFloat125 * local16.aFloat125 + local16.aFloat129 * local13.aFloat128;
		Static425.aFloat317 = local13.aFloat121 + local13.aFloat128 * local16.aFloat123 + local16.aFloat122 * local13.aFloat126 + local13.aFloat125 * local16.aFloat121;
		@Pc(296) float local296 = (float) this.anInt6401 * Static309.aFloat261 + Static425.aFloat317;
		@Pc(304) float local304 = Static425.aFloat317 + (float) this.anInt6432 * Static309.aFloat261;
		@Pc(331) float local331;
		@Pc(319) float local319;
		if (local304 < local296) {
			local319 = (float) this.aClass62_Sub1_15.anInt5697 * (local296 + (float) this.anInt6454);
			local331 = ((float) -this.anInt6454 + local304) * (float) this.aClass62_Sub1_15.anInt5697;
		} else {
			local319 = ((float) this.anInt6454 + local304) * (float) this.aClass62_Sub1_15.anInt5697;
			local331 = (local296 - (float) this.anInt6454) * (float) this.aClass62_Sub1_15.anInt5697;
		}
		if (local331 / (float) arg2 >= this.aClass62_Sub1_15.aFloat243 || local319 / (float) arg2 <= this.aClass62_Sub1_15.aFloat242) {
			return;
		}
		if (arg1 != null || this.aClass255Array1 != null) {
			Static403.aFloat310 = local16.aFloat131 * local13.aFloat127 + local13.aFloat129 * local16.aFloat128 + local16.aFloat124 * local13.aFloat124;
			Static27.aFloat23 = local16.aFloat130 * local13.aFloat126 + local16.aFloat126 * local13.aFloat125 + local13.aFloat128 * local16.aFloat127;
			Static508.aFloat353 = local13.aFloat130 * local16.aFloat131 + local16.aFloat128 * local13.aFloat132 + local13.aFloat131 * local16.aFloat124;
			Static345.aFloat274 = local13.aFloat131 * local16.aFloat127 + local13.aFloat132 * local16.aFloat126 + local16.aFloat130 * local13.aFloat130;
			Static327.aFloat267 = local13.aFloat128 * local16.aFloat124 + local16.aFloat128 * local13.aFloat125 + local13.aFloat126 * local16.aFloat131;
			Static344.aFloat273 = local13.aFloat129 * local16.aFloat126 + local16.aFloat130 * local13.aFloat127 + local16.aFloat127 * local13.aFloat124;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.anInt6433 + this.anInt6466 >> 1;
			@Pc(506) int local506 = this.anInt6422 + this.anInt6411 >> 1;
			@Pc(525) int local525 = (int) (Static360.aFloat293 + Static345.aFloat274 * (float) local498 + Static75.aFloat52 * (float) this.anInt6401 + Static508.aFloat353 * (float) local506);
			@Pc(544) int local544 = (int) (Static27.aFloat23 * (float) local498 + Static425.aFloat317 + Static309.aFloat261 * (float) this.anInt6401 + (float) local506 * Static327.aFloat267);
			@Pc(563) int local563 = (int) (Static155.aFloat153 * (float) this.anInt6401 + Static28.aFloat24 + Static344.aFloat273 * (float) local498 + (float) local506 * Static403.aFloat310);
			@Pc(582) int local582 = (int) (Static360.aFloat293 + (float) local498 * Static345.aFloat274 + Static75.aFloat52 * (float) this.anInt6432 + (float) local506 * Static508.aFloat353);
			@Pc(601) int local601 = (int) (Static27.aFloat23 * (float) local498 + Static425.aFloat317 + (float) this.anInt6432 * Static309.aFloat261 + (float) local506 * Static327.aFloat267);
			arg1.anInt6884 = this.aClass62_Sub1_15.anInt5690 + local582 * this.aClass62_Sub1_15.anInt5696 / arg2;
			arg1.anInt6883 = this.aClass62_Sub1_15.anInt5697 * local601 / arg2 + this.aClass62_Sub1_15.anInt5672;
			arg1.anInt6882 = this.aClass62_Sub1_15.anInt5696 * local525 / arg2 + this.aClass62_Sub1_15.anInt5690;
			arg1.anInt6885 = this.aClass62_Sub1_15.anInt5672 + this.aClass62_Sub1_15.anInt5697 * local544 / arg2;
			@Pc(673) int local673 = (int) ((float) local498 * Static344.aFloat273 + Static28.aFloat24 + (float) this.anInt6432 * Static155.aFloat153 + (float) local506 * Static403.aFloat310);
			if (local563 < this.aClass62_Sub1_15.anInt5676 && this.aClass62_Sub1_15.anInt5676 > local673) {
				arg1.anInt6881 = this.aClass62_Sub1_15.anInt5696 * (local525 + this.anInt6454) / arg2 + this.aClass62_Sub1_15.anInt5690 - arg1.anInt6882;
				arg1.aBoolean481 = true;
			}
		}
		this.aClass62_Sub1_15.method4722((float) arg2);
		this.aClass62_Sub1_15.method4674();
		this.aClass62_Sub1_15.method4746(local16);
		this.method5359();
		this.method5367();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()[Lclient!on;")
	@Override
	public Class223[] method7350() {
		return this.aClass223Array6;
	}

	@OriginalMember(owner = "client!oa", name = "va", descriptor = "()I")
	@Override
	public int va() {
		if (!this.aBoolean439) {
			this.method5347();
		}
		return this.anInt6433;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!eda;I)V")
	private void method5360(@OriginalArg(0) Class78_Sub1 arg0) {
		@Pc(6) int local6;
		if (this.aClass223Array6 != null) {
			for (local6 = 0; local6 < this.aClass223Array6.length; local6++) {
				@Pc(13) Class223 local13 = this.aClass223Array6[local6];
				@Pc(15) Class223 local15 = local13;
				if (local13.aClass223_1 != null) {
					local15 = local13.aClass223_1;
				}
				local15.anInt6749 = (int) (arg0.aFloat122 + (float) this.anIntArray478[local13.anInt6756] * arg0.aFloat131 + arg0.aFloat132 * (float) this.anIntArray481[local13.anInt6756] + (float) this.lb[local13.anInt6756] * arg0.aFloat130);
				local15.anInt6759 = (int) ((float) this.anIntArray481[local13.anInt6756] * arg0.aFloat125 + arg0.aFloat126 * (float) this.lb[local13.anInt6756] + arg0.aFloat128 * (float) this.anIntArray478[local13.anInt6756] + arg0.aFloat121);
				local15.anInt6755 = (int) (arg0.aFloat123 + (float) this.anIntArray478[local13.anInt6756] * arg0.aFloat124 + arg0.aFloat129 * (float) this.anIntArray481[local13.anInt6756] + (float) this.lb[local13.anInt6756] * arg0.aFloat127);
				local15.anInt6762 = (int) (arg0.aFloat132 * (float) this.anIntArray481[local13.anInt6752] + (float) this.lb[local13.anInt6752] * arg0.aFloat130 + arg0.aFloat131 * (float) this.anIntArray478[local13.anInt6752] + arg0.aFloat122);
				local15.anInt6763 = (int) (arg0.aFloat121 + (float) this.lb[local13.anInt6752] * arg0.aFloat126 + arg0.aFloat125 * (float) this.anIntArray481[local13.anInt6752] + arg0.aFloat128 * (float) this.anIntArray478[local13.anInt6752]);
				local15.anInt6750 = (int) (arg0.aFloat129 * (float) this.anIntArray481[local13.anInt6752] + (float) this.lb[local13.anInt6752] * arg0.aFloat127 + (float) this.anIntArray478[local13.anInt6752] * arg0.aFloat124 + arg0.aFloat123);
				local15.anInt6761 = (int) (arg0.aFloat132 * (float) this.anIntArray481[local13.anInt6765] + (float) this.lb[local13.anInt6765] * arg0.aFloat130 + arg0.aFloat131 * (float) this.anIntArray478[local13.anInt6765] + arg0.aFloat122);
				local15.anInt6757 = (int) ((float) this.lb[local13.anInt6765] * arg0.aFloat126 + (float) this.anIntArray481[local13.anInt6765] * arg0.aFloat125 + (float) this.anIntArray478[local13.anInt6765] * arg0.aFloat128 + arg0.aFloat121);
				local15.anInt6751 = (int) (arg0.aFloat124 * (float) this.anIntArray478[local13.anInt6765] + (float) this.lb[local13.anInt6765] * arg0.aFloat127 + (float) this.anIntArray481[local13.anInt6765] * arg0.aFloat129 + arg0.aFloat123);
			}
		}
		if (this.aClass280Array6 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass280Array6.length; local6++) {
			@Pc(362) Class280 local362 = this.aClass280Array6[local6];
			@Pc(364) Class280 local364 = local362;
			if (local362.aClass280_2 != null) {
				local364 = local362.aClass280_2;
			}
			if (local362.aClass78_6 == null) {
				local362.aClass78_6 = arg0.method5707();
			} else {
				local362.aClass78_6.EA(arg0);
			}
			local364.anInt8075 = (int) ((float) this.lb[local362.anInt8077] * arg0.aFloat130 + arg0.aFloat132 * (float) this.anIntArray481[local362.anInt8077] + (float) this.anIntArray478[local362.anInt8077] * arg0.aFloat131 + arg0.aFloat122);
			local364.anInt8068 = (int) (arg0.aFloat121 + arg0.aFloat128 * (float) this.anIntArray478[local362.anInt8077] + (float) this.lb[local362.anInt8077] * arg0.aFloat126 + arg0.aFloat125 * (float) this.anIntArray481[local362.anInt8077]);
			local364.anInt8070 = (int) (arg0.aFloat123 + arg0.aFloat129 * (float) this.anIntArray481[local362.anInt8077] + arg0.aFloat127 * (float) this.lb[local362.anInt8077] + arg0.aFloat124 * (float) this.anIntArray478[local362.anInt8077]);
		}
	}

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		if (!this.aBoolean439) {
			this.method5347();
		}
		return this.anInt6411;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!m;Lclient!paa;I)V")
	@Override
	public void method7360(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class30_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6410 == 0) {
			return;
		}
		@Pc(13) Class78_Sub1 local13 = this.aClass62_Sub1_15.aClass78_Sub1_16;
		if (!this.aBoolean439) {
			this.method5347();
		}
		@Pc(22) Class78_Sub1 local22 = (Class78_Sub1) arg0;
		this.method5360(local22);
		Static28.aFloat24 = local13.aFloat127 * local22.aFloat122 + local22.aFloat121 * local13.aFloat129 + local13.aFloat124 * local22.aFloat123 + local13.aFloat123;
		Static155.aFloat153 = local13.aFloat124 * local22.aFloat129 + local22.aFloat125 * local13.aFloat129 + local13.aFloat127 * local22.aFloat132;
		@Pc(73) float local73 = (float) this.anInt6401 * Static155.aFloat153 + Static28.aFloat24;
		@Pc(81) float local81 = Static28.aFloat24 + (float) this.anInt6432 * Static155.aFloat153;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local81 < local73) {
			local91 = (float) -this.anInt6454 + local81;
			local97 = (float) this.anInt6454 + local73;
		} else {
			local91 = local73 - (float) this.anInt6454;
			local97 = (float) this.anInt6454 + local81;
		}
		if (local91 >= this.aClass62_Sub1_15.aFloat227 || local97 <= (float) this.aClass62_Sub1_15.anInt5676) {
			return;
		}
		Static75.aFloat52 = local13.aFloat130 * local22.aFloat132 + local22.aFloat125 * local13.aFloat132 + local22.aFloat129 * local13.aFloat131;
		Static360.aFloat293 = local13.aFloat122 + local13.aFloat131 * local22.aFloat123 + local22.aFloat121 * local13.aFloat132 + local13.aFloat130 * local22.aFloat122;
		@Pc(174) float local174 = Static360.aFloat293 + Static75.aFloat52 * (float) this.anInt6401;
		@Pc(182) float local182 = Static360.aFloat293 + Static75.aFloat52 * (float) this.anInt6432;
		@Pc(209) float local209;
		@Pc(197) float local197;
		if (local174 > local182) {
			local197 = ((float) this.anInt6454 + local174) * (float) this.aClass62_Sub1_15.anInt5696;
			local209 = (float) this.aClass62_Sub1_15.anInt5696 * ((float) -this.anInt6454 + local182);
		} else {
			local197 = (float) this.aClass62_Sub1_15.anInt5696 * (local182 + (float) this.anInt6454);
			local209 = (local174 - (float) this.anInt6454) * (float) this.aClass62_Sub1_15.anInt5696;
		}
		if (local209 / local97 >= this.aClass62_Sub1_15.aFloat244 || this.aClass62_Sub1_15.aFloat228 >= local197 / local97) {
			return;
		}
		Static425.aFloat317 = local22.aFloat122 * local13.aFloat126 + local22.aFloat121 * local13.aFloat125 + local13.aFloat128 * local22.aFloat123 + local13.aFloat121;
		Static309.aFloat261 = local22.aFloat129 * local13.aFloat128 + local13.aFloat126 * local22.aFloat132 + local13.aFloat125 * local22.aFloat125;
		@Pc(298) float local298 = (float) this.anInt6401 * Static309.aFloat261 + Static425.aFloat317;
		@Pc(306) float local306 = Static309.aFloat261 * (float) this.anInt6432 + Static425.aFloat317;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local298 > local306) {
			local322 = (float) this.aClass62_Sub1_15.anInt5697 * (local306 - (float) this.anInt6454);
			local333 = (local298 + (float) this.anInt6454) * (float) this.aClass62_Sub1_15.anInt5697;
		} else {
			local322 = (float) this.aClass62_Sub1_15.anInt5697 * ((float) -this.anInt6454 + local298);
			local333 = ((float) this.anInt6454 + local306) * (float) this.aClass62_Sub1_15.anInt5697;
		}
		if (this.aClass62_Sub1_15.aFloat243 <= local322 / local97 || this.aClass62_Sub1_15.aFloat242 >= local333 / local97) {
			return;
		}
		if (arg1 != null || this.aClass255Array1 != null) {
			Static403.aFloat310 = local22.aFloat124 * local13.aFloat124 + local13.aFloat127 * local22.aFloat131 + local22.aFloat128 * local13.aFloat129;
			Static344.aFloat273 = local13.aFloat127 * local22.aFloat130 + local22.aFloat126 * local13.aFloat129 + local22.aFloat127 * local13.aFloat124;
			Static508.aFloat353 = local22.aFloat124 * local13.aFloat131 + local13.aFloat130 * local22.aFloat131 + local22.aFloat128 * local13.aFloat132;
			Static27.aFloat23 = local13.aFloat128 * local22.aFloat127 + local13.aFloat126 * local22.aFloat130 + local22.aFloat126 * local13.aFloat125;
			Static345.aFloat274 = local22.aFloat126 * local13.aFloat132 + local22.aFloat130 * local13.aFloat130 + local13.aFloat131 * local22.aFloat127;
			Static327.aFloat267 = local22.aFloat124 * local13.aFloat128 + local22.aFloat131 * local13.aFloat126 + local22.aFloat128 * local13.aFloat125;
		}
		if (arg1 != null) {
			@Pc(492) boolean local492 = false;
			@Pc(494) boolean local494 = true;
			@Pc(503) int local503 = this.anInt6466 + this.anInt6433 >> 1;
			@Pc(512) int local512 = this.anInt6411 + this.anInt6422 >> 1;
			@Pc(531) int local531 = (int) (Static360.aFloat293 + Static345.aFloat274 * (float) local503 + (float) this.anInt6401 * Static75.aFloat52 + (float) local512 * Static508.aFloat353);
			@Pc(550) int local550 = (int) ((float) this.anInt6401 * Static309.aFloat261 + (float) local503 * Static27.aFloat23 + Static425.aFloat317 + (float) local512 * Static327.aFloat267);
			@Pc(569) int local569 = (int) (Static28.aFloat24 + (float) local503 * Static344.aFloat273 + (float) this.anInt6401 * Static155.aFloat153 + Static403.aFloat310 * (float) local512);
			if (this.aClass62_Sub1_15.anInt5676 <= local569) {
				arg1.anInt6882 = this.aClass62_Sub1_15.anInt5690 + this.aClass62_Sub1_15.anInt5696 * local531 / local569;
				arg1.anInt6885 = this.aClass62_Sub1_15.anInt5697 * local550 / local569 + this.aClass62_Sub1_15.anInt5672;
			} else {
				local492 = true;
			}
			@Pc(628) int local628 = (int) (Static360.aFloat293 + (float) local503 * Static345.aFloat274 + Static75.aFloat52 * (float) this.anInt6432 + Static508.aFloat353 * (float) local512);
			@Pc(647) int local647 = (int) (Static27.aFloat23 * (float) local503 + Static425.aFloat317 + (float) this.anInt6432 * Static309.aFloat261 + Static327.aFloat267 * (float) local512);
			@Pc(666) int local666 = (int) (Static403.aFloat310 * (float) local512 + (float) this.anInt6432 * Static155.aFloat153 + Static28.aFloat24 + Static344.aFloat273 * (float) local503);
			if (this.aClass62_Sub1_15.anInt5676 > local666) {
				local492 = true;
			} else {
				arg1.anInt6884 = this.aClass62_Sub1_15.anInt5690 + local628 * this.aClass62_Sub1_15.anInt5696 / local666;
				arg1.anInt6883 = this.aClass62_Sub1_15.anInt5672 + local647 * this.aClass62_Sub1_15.anInt5697 / local666;
			}
			if (local492) {
				if (this.aClass62_Sub1_15.anInt5676 > local569 && local666 < this.aClass62_Sub1_15.anInt5676) {
					local494 = false;
				} else {
					@Pc(755) int local755;
					@Pc(766) int local766;
					@Pc(777) int local777;
					if (local569 < this.aClass62_Sub1_15.anInt5676) {
						local755 = (local666 - this.aClass62_Sub1_15.anInt5676 << 16) / (local666 - local569);
						local766 = local628 + (local755 * (local628 - local531) >> 16);
						arg1.anInt6882 = this.aClass62_Sub1_15.anInt5696 * local766 / this.aClass62_Sub1_15.anInt5676 + this.aClass62_Sub1_15.anInt5690;
						local777 = (local755 * (local647 - local550) >> 16) + local647;
						arg1.anInt6885 = local777 * this.aClass62_Sub1_15.anInt5697 / this.aClass62_Sub1_15.anInt5676 + this.aClass62_Sub1_15.anInt5672;
					} else if (local666 < this.aClass62_Sub1_15.anInt5676) {
						local755 = (local569 - this.aClass62_Sub1_15.anInt5676 << 16) / (local569 - local666);
						local766 = local531 + (local755 * (local531 - local628) >> 16);
						local777 = (local755 * (local550 - local647) >> 16) + local550;
						arg1.anInt6882 = this.aClass62_Sub1_15.anInt5696 * local766 / this.aClass62_Sub1_15.anInt5676 + this.aClass62_Sub1_15.anInt5690;
						arg1.anInt6885 = this.aClass62_Sub1_15.anInt5672 + local777 * this.aClass62_Sub1_15.anInt5697 / this.aClass62_Sub1_15.anInt5676;
					}
				}
			}
			if (local494) {
				if (local666 < local569) {
					arg1.anInt6881 = this.aClass62_Sub1_15.anInt5696 * (this.anInt6454 + local531) / local569 + this.aClass62_Sub1_15.anInt5690 - arg1.anInt6882;
				} else {
					arg1.anInt6881 = this.aClass62_Sub1_15.anInt5690 + this.aClass62_Sub1_15.anInt5696 * (this.anInt6454 + local628) / local666 - arg1.anInt6884;
				}
				arg1.aBoolean481 = true;
			}
		}
		this.aClass62_Sub1_15.method4704();
		this.aClass62_Sub1_15.method4746(local22);
		this.method5359();
		this.method5367();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt6440; local7++) {
			local16 = this.aShortArray90[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 -= -((arg1 - local28) * arg3 >> 7);
			}
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			@Pc(59) int local59 = local16 & 0x7F;
			if (arg2 != -1) {
				local59 += (arg2 - local59) * arg3 >> 7;
			}
			this.aShortArray90[local7] = (short) (local28 << 7 | local22 << 10 | local59);
		}
		if (this.aClass255Array1 != null) {
			for (local16 = 0; local16 < this.anInt6465; local16++) {
				@Pc(107) Class255 local107 = this.aClass255Array1[local16];
				@Pc(112) Class194 local112 = this.aClass194Array1[local16];
				local112.anInt5990 = local112.anInt5990 & 0xFF000000 | Static444.anIntArray587[this.aShortArray90[local107.anInt7525] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5354();
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()I")
	@Override
	public int e() {
		if (!this.aBoolean439) {
			this.method5347();
		}
		return this.anInt6454;
	}

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub2_Sub16.anIntArray411[arg0];
		@Pc(13) int local13 = Class5_Sub2_Sub16.anIntArray410[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6412; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray481[local15] - this.anIntArray478[local15] * local9 >> 15;
			this.anIntArray478[local15] = local13 * this.anIntArray478[local15] + this.anIntArray481[local15] * local9 >> 15;
			this.anIntArray481[local15] = local34;
		}
		this.method5365();
		this.aBoolean439 = false;
	}

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
	@Override
	public int M() {
		return this.aShort84;
	}

	@OriginalMember(owner = "client!oa", name = "pa", descriptor = "(SS)V")
	@Override
	public void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6440; local7++) {
			if (arg0 == this.aShortArray90[local7]) {
				this.aShortArray90[local7] = arg1;
			}
		}
		if (this.aClass255Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt6465; local34++) {
				@Pc(41) Class255 local41 = this.aClass255Array1[local34];
				@Pc(46) Class194 local46 = this.aClass194Array1[local34];
				local46.anInt5990 = Static444.anIntArray587[this.aShortArray90[local41.anInt7525] & 0xFFFF] & 0xFFFFFF | local46.anInt5990 & 0xFF000000;
			}
		}
		this.method5354();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
	@Override
	public boolean method7353() {
		if (this.aShortArray91 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray91.length; local12++) {
			if (this.aShortArray91[local12] != -1 && !this.aClass62_Sub1_15.anInterface8_145.method7236(this.aShortArray91[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(B)V")
	private void method5364() {
		if (!this.aBoolean441) {
			return;
		}
		this.aBoolean441 = false;
		if (this.aClass223Array6 == null && this.aClass280Array6 == null && this.aClass255Array1 == null) {
			if (this.lb != null && !Static231.method3803(this.anInt6450, this.anInt6426)) {
				if (this.aClass251_4 == null || this.aClass251_4.method6001()) {
					if (!this.aBoolean439) {
						this.method5347();
					}
					this.lb = null;
				} else {
					this.aBoolean441 = true;
				}
			}
			if (this.anIntArray481 != null && !Static292.method4883(this.anInt6450, this.anInt6426)) {
				if (this.aClass251_4 == null || this.aClass251_4.method6001()) {
					if (!this.aBoolean439) {
						this.method5347();
					}
					this.anIntArray481 = null;
				} else {
					this.aBoolean441 = true;
				}
			}
			if (this.anIntArray478 != null && !Static174.method3036(this.anInt6426, this.anInt6450)) {
				if (this.aClass251_4 == null || this.aClass251_4.method6001()) {
					if (!this.aBoolean439) {
						this.method5347();
					}
					this.anIntArray478 = null;
				} else {
					this.aBoolean441 = true;
				}
			}
		}
		if (this.aShortArray88 != null && this.lb == null && this.anIntArray481 == null && this.anIntArray478 == null) {
			this.anIntArray480 = null;
			this.aShortArray88 = null;
		}
		if (this.aByteArray86 != null && !Static459.method6388(this.anInt6450, this.anInt6426)) {
			label195: {
				label194: {
					@Pc(166) boolean local166;
					if ((this.anInt6426 & 0x37) == 0) {
						if (this.aClass251_3 == null || this.aClass251_3.method6001()) {
							break label194;
						}
						local166 = false;
					} else {
						if (this.aClass251_1 == null || this.aClass251_1.method6001()) {
							break label194;
						}
						local166 = false;
					}
					if (!local166) {
						this.aBoolean441 = true;
						break label195;
					}
				}
				this.aByteArray86 = null;
				this.aShortArray95 = this.aShortArray97 = this.aShortArray96 = null;
			}
		}
		if (this.aShortArray90 != null && !Static263.method4381(this.anInt6426, this.anInt6450)) {
			if (this.aClass251_3 == null || this.aClass251_3.method6001()) {
				this.aShortArray90 = null;
			} else {
				this.aBoolean441 = true;
			}
		}
		if (this.aByteArray85 != null && !Static485.method6730(this.anInt6450, this.anInt6426)) {
			if (this.aClass251_3 == null || this.aClass251_3.method6001()) {
				this.aByteArray85 = null;
			} else {
				this.aBoolean441 = true;
			}
		}
		if (this.aFloatArray62 != null && !Static4.method5492(this.anInt6450, this.anInt6426)) {
			if (this.aClass251_2 == null || this.aClass251_2.method6001()) {
				this.aFloatArray62 = this.aFloatArray63 = null;
			} else {
				this.aBoolean441 = true;
			}
		}
		if (this.aShortArray91 != null && !Static53.method1104(this.anInt6426, this.anInt6450)) {
			if (this.aClass251_3 == null || this.aClass251_3.method6001()) {
				this.aShortArray91 = null;
			} else {
				this.aBoolean441 = true;
			}
		}
		if (this.aShortArray94 != null && !Static268.method4443(this.anInt6450, this.anInt6426)) {
			if ((this.aClass29_1 == null || this.aClass29_1.method837()) && (this.aClass251_3 == null || this.aClass251_3.method6001())) {
				this.aShortArray94 = this.aShortArray86 = this.aShortArray87 = null;
			} else {
				this.aBoolean441 = true;
			}
		}
		if (this.aShortArray85 != null) {
			if (this.aClass251_4 == null || this.aClass251_4.method6001()) {
				this.aShortArray85 = null;
			} else {
				this.aBoolean441 = true;
			}
		}
		if (this.aShortArray93 != null) {
			if (this.aClass251_3 == null || this.aClass251_3.method6001()) {
				this.aShortArray93 = null;
			} else {
				this.aBoolean441 = true;
			}
		}
		if (this.anIntArrayArray49 != null && !Static527.method7220(this.anInt6450, this.anInt6426)) {
			this.anIntArrayArray49 = null;
			this.aShortArray89 = null;
		}
		if (this.anIntArrayArray50 != null && !Static446.method7428(this.anInt6450, this.anInt6426)) {
			this.anIntArrayArray50 = null;
			this.aShortArray92 = null;
		}
		if (this.anIntArrayArray48 != null && !Static13.method343(this.anInt6450, this.anInt6426)) {
			this.anIntArrayArray48 = null;
		}
		if (this.anIntArray479 != null && (this.anInt6450 & 0x800) == 0 && (this.anInt6450 & 0x40000) == 0) {
			this.anIntArray477 = null;
			this.anIntArray482 = null;
			this.anIntArray479 = null;
		}
	}

	@OriginalMember(owner = "client!oa", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		if (!this.aBoolean439) {
			this.method5347();
		}
		return this.anInt6401;
	}

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		this.aShort85 = (short) arg0;
		this.method5365();
		this.method5352();
	}

	@OriginalMember(owner = "client!oa", name = "wa", descriptor = "()I")
	@Override
	public int wa() {
		if (!this.aBoolean439) {
			this.method5347();
		}
		return this.anInt6466;
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(B)V")
	private void method5365() {
		if (this.aClass251_4 != null) {
			this.aClass251_4.aBoolean525 = false;
		}
	}

	@OriginalMember(owner = "client!oa", name = "ga", descriptor = "()I")
	@Override
	public int ga() {
		return this.aShort85;
	}

	@OriginalMember(owner = "client!oa", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	@Override
	public void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class131 arg2, @OriginalArg(3) Class131 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean439) {
			this.method5347();
		}
		@Pc(16) int local16 = arg4 + this.anInt6466;
		@Pc(21) int local21 = arg4 + this.anInt6433;
		@Pc(27) int local27 = arg6 + this.anInt6411;
		@Pc(32) int local32 = arg6 + this.anInt6422;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt8874 >> arg2.anInt8869 >= arg2.anInt8873 || local27 < 0 || arg2.anInt8871 <= local32 + arg2.anInt8874 >> arg2.anInt8869)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt8874 + local21 >> arg3.anInt8869 >= arg3.anInt8873 || local27 < 0 || arg3.anInt8871 <= arg3.anInt8874 + local32 >> arg3.anInt8869) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8869;
			local21 = local21 + arg2.anInt8874 - 1 >> arg2.anInt8869;
			local27 >>= arg2.anInt8869;
			local32 = local32 + arg2.anInt8874 - 1 >> arg2.anInt8869;
			if (arg2.ba(local16, local27) == arg5 && arg2.ba(local21, local27) == arg5 && arg2.ba(local16, local32) == arg5 && arg5 == arg2.ba(local21, local32)) {
				return;
			}
		}
		@Pc(204) int local204;
		if (arg0 == 1) {
			for (local204 = 0; local204 < this.anInt6412; local204++) {
				this.anIntArray481[local204] = this.anIntArray481[local204] + arg2.aa(arg4 + this.lb[local204], arg6 + this.anIntArray478[local204]) - arg5;
			}
		} else {
			@Pc(212) int local212;
			@Pc(223) int local223;
			if (arg0 == 2) {
				local204 = this.anInt6401;
				if (local204 == 0) {
					return;
				}
				for (local212 = 0; local212 < this.anInt6412; local212++) {
					local223 = (this.anIntArray481[local212] << 16) / local204;
					if (arg1 > local223) {
						this.anIntArray481[local212] -= -((arg2.aa(arg4 + this.lb[local212], arg6 + this.anIntArray478[local212]) - arg5) * (arg1 - local223) / arg1);
					}
				}
			} else {
				@Pc(303) int local303;
				if (arg0 == 3) {
					local204 = (arg1 & 0xFF) * 4;
					local212 = (arg1 >> 8 & 0xFF) * 4;
					local223 = (arg1 >> 16 & 0xFF) << 6;
					local303 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local204 >> 1) < 0 || arg2.anInt8874 + (local204 >> 1) + arg4 >= arg2.anInt8873 << arg2.anInt8869 || arg6 - (local212 >> 1) < 0 || arg2.anInt8871 << arg2.anInt8869 <= arg2.anInt8874 + arg6 + (local212 >> 1)) {
						return;
					}
					this.method7358(local303, arg6, arg4, local212, arg2, local223, arg5, local204);
				} else if (arg0 == 4) {
					local204 = this.anInt6432 - this.anInt6401;
					for (local212 = 0; local212 < this.anInt6412; local212++) {
						this.anIntArray481[local212] = local204 + this.anIntArray481[local212] + arg3.aa(arg4 + this.lb[local212], arg6 + this.anIntArray478[local212]) - arg5;
					}
				} else if (arg0 == 5) {
					local204 = this.anInt6432 - this.anInt6401;
					for (local212 = 0; local212 < this.anInt6412; local212++) {
						local223 = arg4 + this.lb[local212];
						local303 = this.anIntArray478[local212] + arg6;
						@Pc(449) int local449 = arg2.aa(local223, local303);
						@Pc(454) int local454 = arg3.aa(local223, local303);
						@Pc(459) int local459 = local449 - local454;
						this.anIntArray481[local212] = ((this.anIntArray481[local212] << 8) / local204 * local459 >> 8) + (local449 - arg5);
					}
				}
			}
		}
		this.method5365();
		this.aBoolean439 = false;
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
	private void method5366() {
		if (this.aClass29_1 != null) {
			this.aClass29_1.aBoolean35 = false;
		}
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
	private void method5367() {
		if (this.aClass255Array1 == null) {
			return;
		}
		@Pc(18) float local18 = this.aClass62_Sub1_15.ra();
		@Pc(22) float local22 = this.aClass62_Sub1_15.P();
		this.aClass62_Sub1_15.method7022(false);
		this.aClass62_Sub1_15.method4760(false);
		this.aClass62_Sub1_15.method4715(Static429.aClass63_6, 1);
		this.aClass62_Sub1_15.method4661(Static429.aClass63_6, 1);
		for (@Pc(45) int local45 = 0; local45 < this.anInt6465; local45++) {
			@Pc(52) Class255 local52 = this.aClass255Array1[local45];
			@Pc(57) Class194 local57 = this.aClass194Array1[local45];
			if (!local52.aBoolean535 || !this.aClass62_Sub1_15.method7031()) {
				@Pc(86) float local86 = (float) (this.lb[local52.anInt7520] + this.lb[local52.anInt7522] + this.lb[local52.anInt7521]) * 0.3333333F;
				@Pc(107) float local107 = (float) (this.anIntArray481[local52.anInt7522] + this.anIntArray481[local52.anInt7520] + this.anIntArray481[local52.anInt7521]) * 0.3333333F;
				@Pc(128) float local128 = (float) (this.anIntArray478[local52.anInt7521] + this.anIntArray478[local52.anInt7522] + this.anIntArray478[local52.anInt7520]) * 0.3333333F;
				@Pc(142) float local142 = Static360.aFloat293 + Static345.aFloat274 * local86 + Static75.aFloat52 * local107 + local128 * Static508.aFloat353;
				@Pc(156) float local156 = local128 * Static327.aFloat267 + Static309.aFloat261 * local107 + local86 * Static27.aFloat23 + Static425.aFloat317;
				@Pc(170) float local170 = Static28.aFloat24 + Static403.aFloat310 * local128 + Static155.aFloat153 * local107 + Static344.aFloat273 * local86;
				@Pc(175) Class78_Sub1 local175 = this.aClass62_Sub1_15.method4744();
				local175.method2196(local142 + (float) local57.anInt5986, local170, local57.anInt5993 * local52.aShort96 >> 7, local57.anInt5988, local52.aShort94 * local57.anInt5987 >> 7, local156 + (float) local57.anInt5984);
				local175.method2195(this.aClass62_Sub1_15.aClass78_Sub1_17);
				this.aClass62_Sub1_15.method4679();
				this.aClass62_Sub1_15.la(local22, local18 - (float) local52.anInt7524 * 1.5F);
				@Pc(230) int local230 = local57.anInt5990;
				this.aClass62_Sub1_15.method4656(local52.aShort95, false, false);
				this.aClass62_Sub1_15.method4754(local52.aByte72);
				this.aClass62_Sub1_15.method4671(local230);
				this.aClass62_Sub1_15.method4740();
			}
		}
		this.aClass62_Sub1_15.method4661(Static233.aClass63_5, 1);
		this.aClass62_Sub1_15.method4715(Static233.aClass63_5, 1);
		this.aClass62_Sub1_15.la(local22, local18);
		this.aClass62_Sub1_15.method7022(true);
	}

	@OriginalMember(owner = "client!oa", name = "BA", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static295.anInt5918 = 0;
			Static157.anInt3222 = 0;
			Static494.anInt8486 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray50.length) {
					local51 = this.anIntArrayArray50[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray92 == null || (arg6 & this.aShortArray92[local59]) != 0) {
							Static295.anInt5918 += this.lb[local59];
							Static157.anInt3222 += this.anIntArray481[local59];
							local33++;
							Static494.anInt8486 += this.anIntArray478[local59];
						}
					}
				}
			}
			if (local33 > 0) {
				Static494.anInt8486 = Static494.anInt8486 / local33 + arg4;
				Static157.anInt3222 = Static157.anInt3222 / local33 + arg3;
				Static293.aBoolean410 = true;
				Static295.anInt5918 = Static295.anInt5918 / local33 + arg2;
			} else {
				Static494.anInt8486 = arg4;
				Static157.anInt3222 = arg3;
				Static295.anInt5918 = arg2;
			}
			return;
		}
		@Pc(260) int[] local260;
		@Pc(262) int local262;
		if (arg0 == 1) {
			if (arg7 != null) {
				local33 = arg7[2] * arg4 + arg3 * arg7[1] + arg7[0] * arg2 + 16384 >> 15;
				local35 = arg7[4] * arg3 + arg2 * arg7[3] + arg7[5] * arg4 + 16384 >> 15;
				local41 = arg2 * arg7[6] + arg3 * arg7[7] + arg4 * arg7[8] + 16384 >> 15;
				arg3 = local35;
				arg2 = local33;
				arg4 = local41;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray50.length > local35) {
					local260 = this.anIntArrayArray50[local35];
					for (local262 = 0; local262 < local260.length; local262++) {
						local53 = local260[local262];
						if (this.aShortArray92 == null || (this.aShortArray92[local53] & arg6) != 0) {
							this.lb[local53] += arg2;
							this.anIntArray481[local53] += arg3;
							this.anIntArray478[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(380) int local380;
		@Pc(402) int local402;
		@Pc(424) int local424;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(471) int local471;
		@Pc(479) int local479;
		@Pc(487) int local487;
		@Pc(642) int local642;
		@Pc(669) int local669;
		@Pc(673) int local673;
		@Pc(681) int local681;
		@Pc(686) int local686;
		@Pc(690) int local690;
		@Pc(694) int local694;
		@Pc(696) int local696;
		@Pc(830) int[] local830;
		@Pc(832) int local832;
		@Pc(836) int local836;
		@Pc(840) int local840;
		@Pc(842) int local842;
		@Pc(972) int local972;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray50.length) {
						local260 = this.anIntArrayArray50[local35];
						for (local262 = 0; local262 < local260.length; local262++) {
							local53 = local260[local262];
							if (this.aShortArray92 == null || (arg6 & this.aShortArray92[local53]) != 0) {
								this.lb[local53] -= Static295.anInt5918;
								this.anIntArray481[local53] -= Static157.anInt3222;
								this.anIntArray478[local53] -= Static494.anInt8486;
								if (arg4 != 0) {
									local59 = Class5_Sub2_Sub16.anIntArray411[arg4];
									local380 = Class5_Sub2_Sub16.anIntArray410[arg4];
									local402 = this.anIntArray481[local53] * local59 + local380 * this.lb[local53] + 32767 >> 15;
									this.anIntArray481[local53] = this.anIntArray481[local53] * local380 + 32767 - this.lb[local53] * local59 >> 15;
									this.lb[local53] = local402;
								}
								if (arg2 != 0) {
									local59 = Class5_Sub2_Sub16.anIntArray411[arg2];
									local380 = Class5_Sub2_Sub16.anIntArray410[arg2];
									local402 = this.anIntArray481[local53] * local380 + 32767 - this.anIntArray478[local53] * local59 >> 15;
									this.anIntArray478[local53] = local380 * this.anIntArray478[local53] + local59 * this.anIntArray481[local53] + 32767 >> 15;
									this.anIntArray481[local53] = local402;
								}
								if (arg3 != 0) {
									local59 = Class5_Sub2_Sub16.anIntArray411[arg3];
									local380 = Class5_Sub2_Sub16.anIntArray410[arg3];
									local402 = this.anIntArray478[local53] * local59 + this.lb[local53] * local380 + 32767 >> 15;
									this.anIntArray478[local53] = local380 * this.anIntArray478[local53] + 32767 - this.lb[local53] * local59 >> 15;
									this.lb[local53] = local402;
								}
								this.lb[local53] += Static295.anInt5918;
								this.anIntArray481[local53] += Static157.anInt3222;
								this.anIntArray478[local53] += Static494.anInt8486;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray50.length > local41) {
							local51 = this.anIntArrayArray50[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray92 == null || (this.aShortArray92[local59] & arg6) != 0) {
									local380 = this.anIntArray480[local59];
									local402 = this.anIntArray480[local59 + 1];
									for (local424 = local380; local424 < local402; local424++) {
										local459 = this.aShortArray88[local424] - 1;
										if (local459 == -1) {
											break;
										}
										if (arg4 != 0) {
											local463 = Class5_Sub2_Sub16.anIntArray411[arg4];
											local467 = Class5_Sub2_Sub16.anIntArray410[arg4];
											local471 = this.aShortArray95[local459] * local467 + local463 * this.aShortArray97[local459] + 32767 >> 15;
											this.aShortArray97[local459] = (short) (local467 * this.aShortArray97[local459] + 32767 - local463 * this.aShortArray95[local459] >> 15);
											this.aShortArray95[local459] = (short) local471;
										}
										if (arg2 != 0) {
											local463 = Class5_Sub2_Sub16.anIntArray411[arg2];
											local467 = Class5_Sub2_Sub16.anIntArray410[arg2];
											local471 = local467 * this.aShortArray97[local459] + 32767 - this.aShortArray96[local459] * local463 >> 15;
											this.aShortArray96[local459] = (short) (local463 * this.aShortArray97[local459] + this.aShortArray96[local459] * local467 + 32767 >> 15);
											this.aShortArray97[local459] = (short) local471;
										}
										if (arg3 != 0) {
											local463 = Class5_Sub2_Sub16.anIntArray411[arg3];
											local467 = Class5_Sub2_Sub16.anIntArray410[arg3];
											local471 = this.aShortArray95[local459] * local467 + local463 * this.aShortArray96[local459] + 32767 >> 15;
											this.aShortArray96[local459] = (short) (local467 * this.aShortArray96[local459] + 32767 - local463 * this.aShortArray95[local459] >> 15);
											this.aShortArray95[local459] = (short) local471;
										}
									}
								}
							}
						}
					}
					this.method5352();
				}
			} else {
				local33 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local262 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static293.aBoolean410) {
					local380 = arg7[3] * Static157.anInt3222 + arg7[0] * Static295.anInt5918 + arg7[6] * Static494.anInt8486 + 16384 >> 15;
					local402 = Static494.anInt8486 * arg7[7] + Static157.anInt3222 * arg7[4] + arg7[1] * Static295.anInt5918 + 16384 >> 15;
					local424 = arg7[5] * Static157.anInt3222 + arg7[2] * Static295.anInt5918 + arg7[8] * Static494.anInt8486 + 16384 >> 15;
					local380 += local262;
					local402 += local53;
					local424 += local59;
					Static295.anInt5918 = local380;
					Static157.anInt3222 = local402;
					Static494.anInt8486 = local424;
					Static293.aBoolean410 = false;
				}
				@Pc(447) int[] local447 = new int[9];
				local402 = Class5_Sub2_Sub16.anIntArray410[arg2];
				local424 = Class5_Sub2_Sub16.anIntArray411[arg2];
				local459 = Class5_Sub2_Sub16.anIntArray410[arg3];
				local463 = Class5_Sub2_Sub16.anIntArray411[arg3];
				local467 = Class5_Sub2_Sub16.anIntArray410[arg4];
				local471 = Class5_Sub2_Sub16.anIntArray411[arg4];
				local479 = local424 * local467 + 16384 >> 15;
				local487 = local471 * local424 + 16384 >> 15;
				local447[4] = local467 * local402 + 16384 >> 15;
				local447[8] = local402 * local459 + 16384 >> 15;
				local447[6] = local459 * local487 + -local463 * local467 + 16384 >> 15;
				local447[5] = -local424;
				local447[7] = local463 * local471 + local479 * local459 + 16384 >> 15;
				local447[3] = local471 * local402 + 16384 >> 15;
				local447[2] = local402 * local463 + 16384 >> 15;
				local447[1] = -local459 * local471 + local479 * local463 + 16384 >> 15;
				local447[0] = local459 * local467 + local487 * local463 + 16384 >> 15;
				@Pc(617) int local617 = local447[2] * -Static494.anInt8486 + local447[1] * -Static157.anInt3222 + -Static295.anInt5918 * local447[0] + 16384 >> 15;
				local642 = local447[5] * -Static494.anInt8486 + -Static295.anInt5918 * local447[3] + -Static157.anInt3222 * local447[4] + 16384 >> 15;
				local669 = -Static295.anInt5918 * local447[6] + -Static157.anInt3222 * local447[7] + -Static494.anInt8486 * local447[8] + 16384 >> 15;
				local673 = local617 + Static295.anInt5918;
				@Pc(677) int local677 = Static157.anInt3222 + local642;
				local681 = Static494.anInt8486 + local669;
				@Pc(684) int[] local684 = new int[9];
				for (local686 = 0; local686 < 3; local686++) {
					for (local690 = 0; local690 < 3; local690++) {
						local694 = 0;
						for (local696 = 0; local696 < 3; local696++) {
							local694 += arg7[local690 * 3 + local696] * local447[local686 * 3 + local696];
						}
						local684[local690 + local686 * 3] = local694 + 16384 >> 15;
					}
				}
				local690 = local447[1] * local53 + local447[0] * local262 + local59 * local447[2] + 16384 >> 15;
				local694 = local447[4] * local53 + local262 * local447[3] + local59 * local447[5] + 16384 >> 15;
				local696 = local447[8] * local59 + local447[7] * local53 + local447[6] * local262 + 16384 >> 15;
				local690 += local673;
				local694 += local677;
				local696 += local681;
				local830 = new int[9];
				for (local832 = 0; local832 < 3; local832++) {
					for (local836 = 0; local836 < 3; local836++) {
						local840 = 0;
						for (local842 = 0; local842 < 3; local842++) {
							local840 += arg7[local842 + local832 * 3] * local684[local836 + local842 * 3];
						}
						local830[local836 + local832 * 3] = local840 + 16384 >> 15;
					}
				}
				local836 = arg7[1] * local694 + arg7[0] * local690 + local696 * arg7[2] + 16384 >> 15;
				local840 = arg7[4] * local694 + local690 * arg7[3] + local696 * arg7[5] + 16384 >> 15;
				local840 += local35;
				local842 = local694 * arg7[7] + local690 * arg7[6] + arg7[8] * local696 + 16384 >> 15;
				local836 += local33;
				local842 += local41;
				for (local972 = 0; local972 < local8; local972++) {
					@Pc(978) int local978 = arg1[local972];
					if (local978 < this.anIntArrayArray50.length) {
						@Pc(988) int[] local988 = this.anIntArrayArray50[local978];
						for (@Pc(990) int local990 = 0; local990 < local988.length; local990++) {
							@Pc(996) int local996 = local988[local990];
							if (this.aShortArray92 == null || (this.aShortArray92[local996] & arg6) != 0) {
								@Pc(1037) int local1037 = this.lb[local996] * local830[0] + this.anIntArray481[local996] * local830[1] + this.anIntArray478[local996] * local830[2] + 16384 >> 15;
								@Pc(1068) int local1068 = local830[5] * this.anIntArray478[local996] + local830[4] * this.anIntArray481[local996] + this.lb[local996] * local830[3] + 16384 >> 15;
								@Pc(1100) int local1100 = local830[7] * this.anIntArray481[local996] + this.lb[local996] * local830[6] + local830[8] * this.anIntArray478[local996] + 16384 >> 15;
								@Pc(1104) int local1104 = local1037 + local836;
								@Pc(1108) int local1108 = local1068 + local840;
								this.lb[local996] = local1104;
								@Pc(1117) int local1117 = local1100 + local842;
								this.anIntArray481[local996] = local1108;
								this.anIntArray478[local996] = local1117;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2595) Class194 local2595;
			@Pc(2488) boolean local2488;
			@Pc(2590) Class255 local2590;
			if (arg0 == 5) {
				if (this.anIntArrayArray49 != null) {
					local2488 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray49.length > local41) {
							local51 = this.anIntArrayArray49[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray89 == null || (this.aShortArray89[local59] & arg6) != 0) {
									local380 = arg2 * 8 + (this.aByteArray85[local59] & 0xFF);
									if (local380 < 0) {
										local380 = 0;
									} else if (local380 > 255) {
										local380 = 255;
									}
									this.aByteArray85[local59] = (byte) local380;
								}
							}
							local2488 |= local51.length > 0;
						}
					}
					if (local2488) {
						if (this.aClass255Array1 != null) {
							for (local41 = 0; local41 < this.anInt6465; local41++) {
								local2590 = this.aClass255Array1[local41];
								local2595 = this.aClass194Array1[local41];
								local2595.anInt5990 = 255 - (this.aByteArray85[local2590.anInt7525] & 0xFF) << 24 | local2595.anInt5990 & 0xFFFFFF;
							}
						}
						this.method5354();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray49 != null) {
					local2488 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray49.length) {
							local51 = this.anIntArrayArray49[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray89 == null || (arg6 & this.aShortArray89[local59]) != 0) {
									local380 = this.aShortArray90[local59] & 0xFFFF;
									local402 = local380 >> 10 & 0x3F;
									local424 = local380 >> 7 & 0x7;
									local459 = local380 & 0x7F;
									@Pc(2700) int local2700 = local402 + arg2 & 0x3F;
									local424 += arg3 / 4;
									local459 += arg4;
									if (local424 < 0) {
										local424 = 0;
									} else if (local424 > 7) {
										local424 = 7;
									}
									if (local459 < 0) {
										local459 = 0;
									} else if (local459 > 127) {
										local459 = 127;
									}
									this.aShortArray90[local59] = (short) (local459 | local424 << 7 | local2700 << 10);
								}
							}
							local2488 |= local51.length > 0;
						}
					}
					if (local2488) {
						if (this.aClass255Array1 != null) {
							for (local41 = 0; local41 < this.anInt6465; local41++) {
								local2590 = this.aClass255Array1[local41];
								local2595 = this.aClass194Array1[local41];
								local2595.anInt5990 = local2595.anInt5990 & 0xFF000000 | Static444.anIntArray587[this.aShortArray90[local2590.anInt7525] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method5354();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray48 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray48.length) {
							local260 = this.anIntArrayArray48[local35];
							for (local262 = 0; local262 < local260.length; local262++) {
								local2595 = this.aClass194Array1[local260[local262]];
								local2595.anInt5984 += arg3;
								local2595.anInt5986 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray48 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray48.length) {
							local260 = this.anIntArrayArray48[local35];
							for (local262 = 0; local262 < local260.length; local262++) {
								local2595 = this.aClass194Array1[local260[local262]];
								local2595.anInt5993 = arg3 * local2595.anInt5993 >> 7;
								local2595.anInt5987 = local2595.anInt5987 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray48 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (this.anIntArrayArray48.length > local35) {
						local260 = this.anIntArrayArray48[local35];
						for (local262 = 0; local262 < local260.length; local262++) {
							local2595 = this.aClass194Array1[local260[local262]];
							local2595.anInt5988 = local2595.anInt5988 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray50.length > local35) {
					local260 = this.anIntArrayArray50[local35];
					for (local262 = 0; local262 < local260.length; local262++) {
						local53 = local260[local262];
						if (this.aShortArray92 == null || (arg6 & this.aShortArray92[local53]) != 0) {
							this.lb[local53] -= Static295.anInt5918;
							this.anIntArray481[local53] -= Static157.anInt3222;
							this.anIntArray478[local53] -= Static494.anInt8486;
							this.lb[local53] = arg2 * this.lb[local53] >> 7;
							this.anIntArray481[local53] = arg3 * this.anIntArray481[local53] >> 7;
							this.anIntArray478[local53] = arg4 * this.anIntArray478[local53] >> 7;
							this.lb[local53] += Static295.anInt5918;
							this.anIntArray481[local53] += Static157.anInt3222;
							this.anIntArray478[local53] += Static494.anInt8486;
						}
					}
				}
			}
		} else {
			local33 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local262 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static293.aBoolean410) {
				local380 = Static494.anInt8486 * arg7[6] + arg7[0] * Static295.anInt5918 + arg7[3] * Static157.anInt3222 + 16384 >> 15;
				local402 = arg7[7] * Static494.anInt8486 + Static157.anInt3222 * arg7[4] + Static295.anInt5918 * arg7[1] + 16384 >> 15;
				local424 = Static494.anInt8486 * arg7[8] + arg7[2] * Static295.anInt5918 + Static157.anInt3222 * arg7[5] + 16384 >> 15;
				local402 += local53;
				local380 += local262;
				Static295.anInt5918 = local380;
				Static157.anInt3222 = local402;
				local424 += local59;
				Static293.aBoolean410 = false;
				Static494.anInt8486 = local424;
			}
			local380 = arg2 << 15 >> 7;
			local402 = arg3 << 15 >> 7;
			local424 = arg4 << 15 >> 7;
			local459 = -Static295.anInt5918 * local380 + 16384 >> 15;
			local463 = -Static157.anInt3222 * local402 + 16384 >> 15;
			local467 = -Static494.anInt8486 * local424 + 16384 >> 15;
			local471 = local459 + Static295.anInt5918;
			local479 = local463 + Static157.anInt3222;
			local487 = local467 + Static494.anInt8486;
			@Pc(1877) int[] local1877 = new int[] { arg7[0] * local380 + 16384 >> 15, arg7[3] * local380 + 16384 >> 15, local380 * arg7[6] + 16384 >> 15, local402 * arg7[1] + 16384 >> 15, arg7[4] * local402 + 16384 >> 15, arg7[7] * local402 + 16384 >> 15, arg7[2] * local424 + 16384 >> 15, local424 * arg7[5] + 16384 >> 15, arg7[8] * local424 + 16384 >> 15 };
			local642 = local380 * local262 + 16384 >> 15;
			local669 = local53 * local402 + 16384 >> 15;
			@Pc(2005) int local2005 = local669 + local479;
			@Pc(2009) int local2009 = local642 + local471;
			local673 = local424 * local59 + 16384 >> 15;
			@Pc(2021) int local2021 = local673 + local487;
			@Pc(2024) int[] local2024 = new int[9];
			@Pc(2030) int local2030;
			for (local681 = 0; local681 < 3; local681++) {
				for (local2030 = 0; local2030 < 3; local2030++) {
					local686 = 0;
					for (local690 = 0; local690 < 3; local690++) {
						local686 += arg7[local690 + local681 * 3] * local1877[local2030 + local690 * 3];
					}
					local2024[local681 * 3 + local2030] = local686 + 16384 >> 15;
				}
			}
			local2030 = local2021 * arg7[2] + arg7[0] * local2009 + local2005 * arg7[1] + 16384 >> 15;
			local686 = local2021 * arg7[5] + arg7[3] * local2009 + local2005 * arg7[4] + 16384 >> 15;
			local686 += local35;
			local2030 += local33;
			local690 = arg7[7] * local2005 + arg7[6] * local2009 + arg7[8] * local2021 + 16384 >> 15;
			local690 += local41;
			for (local694 = 0; local694 < local8; local694++) {
				local696 = arg1[local694];
				if (this.anIntArrayArray50.length > local696) {
					local830 = this.anIntArrayArray50[local696];
					for (local832 = 0; local832 < local830.length; local832++) {
						local836 = local830[local832];
						if (this.aShortArray92 == null || (arg6 & this.aShortArray92[local836]) != 0) {
							local840 = this.anIntArray481[local836] * local2024[1] + local2024[0] * this.lb[local836] + this.anIntArray478[local836] * local2024[2] + 16384 >> 15;
							local842 = this.anIntArray481[local836] * local2024[4] + local2024[3] * this.lb[local836] + local2024[5] * this.anIntArray478[local836] + 16384 >> 15;
							@Pc(2270) int local2270 = local840 + local2030;
							local972 = local2024[8] * this.anIntArray478[local836] + this.lb[local836] * local2024[6] + local2024[7] * this.anIntArray481[local836] + 16384 >> 15;
							@Pc(2305) int local2305 = local842 + local686;
							@Pc(2309) int local2309 = local972 + local690;
							this.lb[local836] = local2270;
							this.anIntArray481[local836] = local2305;
							this.anIntArray478[local836] = local2309;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class78_Sub1 local8 = (Class78_Sub1) arg2;
		@Pc(12) Class78_Sub1 local12 = this.aClass62_Sub1_15.aClass78_Sub1_16;
		@Pc(33) float local33 = local12.aFloat122 + local12.aFloat131 * local8.aFloat123 + local8.aFloat122 * local12.aFloat130 + local12.aFloat132 * local8.aFloat121;
		@Pc(54) float local54 = local12.aFloat126 * local8.aFloat122 + local8.aFloat121 * local12.aFloat125 + local8.aFloat123 * local12.aFloat128 + local12.aFloat121;
		Static75.aFloat52 = local12.aFloat131 * local8.aFloat129 + local12.aFloat130 * local8.aFloat132 + local12.aFloat132 * local8.aFloat125;
		Static27.aFloat23 = local12.aFloat128 * local8.aFloat127 + local12.aFloat125 * local8.aFloat126 + local8.aFloat130 * local12.aFloat126;
		@Pc(111) float local111 = local12.aFloat123 + local12.aFloat127 * local8.aFloat122 + local8.aFloat121 * local12.aFloat129 + local12.aFloat124 * local8.aFloat123;
		Static344.aFloat273 = local8.aFloat126 * local12.aFloat129 + local8.aFloat130 * local12.aFloat127 + local12.aFloat124 * local8.aFloat127;
		Static327.aFloat267 = local8.aFloat124 * local12.aFloat128 + local8.aFloat128 * local12.aFloat125 + local8.aFloat131 * local12.aFloat126;
		Static155.aFloat153 = local12.aFloat127 * local8.aFloat132 + local12.aFloat129 * local8.aFloat125 + local12.aFloat124 * local8.aFloat129;
		Static403.aFloat310 = local12.aFloat129 * local8.aFloat128 + local8.aFloat131 * local12.aFloat127 + local12.aFloat124 * local8.aFloat124;
		Static309.aFloat261 = local12.aFloat128 * local8.aFloat129 + local8.aFloat125 * local12.aFloat125 + local8.aFloat132 * local12.aFloat126;
		Static345.aFloat274 = local8.aFloat126 * local12.aFloat132 + local8.aFloat130 * local12.aFloat130 + local12.aFloat131 * local8.aFloat127;
		Static508.aFloat353 = local12.aFloat132 * local8.aFloat128 + local8.aFloat131 * local12.aFloat130 + local8.aFloat124 * local12.aFloat131;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass62_Sub1_15.anInt5696;
		@Pc(255) int local255 = this.aClass62_Sub1_15.anInt5697;
		if (!this.aBoolean439) {
			this.method5347();
		}
		Static103.anIntArray78[0] = this.anInt6466;
		Static539.anIntArray689[0] = this.anInt6401;
		Static437.anIntArray579[0] = this.anInt6411;
		Static103.anIntArray78[1] = this.anInt6433;
		Static539.anIntArray689[1] = this.anInt6401;
		Static437.anIntArray579[1] = this.anInt6411;
		Static103.anIntArray78[2] = this.anInt6466;
		Static539.anIntArray689[2] = this.anInt6432;
		Static103.anIntArray78[3] = this.anInt6433;
		Static437.anIntArray579[2] = this.anInt6411;
		Static539.anIntArray689[3] = this.anInt6432;
		Static437.anIntArray579[3] = this.anInt6411;
		Static103.anIntArray78[4] = this.anInt6466;
		Static539.anIntArray689[4] = this.anInt6401;
		Static103.anIntArray78[5] = this.anInt6433;
		Static437.anIntArray579[4] = this.anInt6422;
		Static539.anIntArray689[5] = this.anInt6401;
		Static437.anIntArray579[5] = this.anInt6422;
		Static103.anIntArray78[6] = this.anInt6466;
		Static539.anIntArray689[6] = this.anInt6432;
		Static103.anIntArray78[7] = this.anInt6433;
		Static437.anIntArray579[6] = this.anInt6422;
		Static539.anIntArray689[7] = this.anInt6432;
		Static437.anIntArray579[7] = this.anInt6422;
		@Pc(414) float local414;
		@Pc(428) float local428;
		@Pc(442) float local442;
		@Pc(395) float local395;
		@Pc(400) float local400;
		@Pc(390) float local390;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static437.anIntArray579[local383];
			local395 = Static103.anIntArray78[local383];
			local400 = Static539.anIntArray689[local383];
			local414 = local390 * Static508.aFloat353 + local395 * Static345.aFloat274 + local400 * Static75.aFloat52 + local33;
			local428 = Static27.aFloat23 * local395 + Static309.aFloat261 * local400 + local390 * Static327.aFloat267 + local54;
			local442 = local111 + local390 * Static403.aFloat310 + Static344.aFloat273 * local395 + Static155.aFloat153 * local400;
			if (local442 >= (float) this.aClass62_Sub1_15.anInt5676) {
				@Pc(461) float local461 = local414 * (float) local251 / local442 + (float) this.aClass62_Sub1_15.anInt5690;
				if (local241 > local461) {
					local241 = local461;
				}
				@Pc(479) float local479 = (float) this.aClass62_Sub1_15.anInt5672 + local428 * (float) local255 / local442;
				if (local461 > local243) {
					local243 = local461;
				}
				local239 = true;
				if (local247 < local479) {
					local247 = local479;
				}
				if (local479 < local245) {
					local245 = local479;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && (float) arg1 > local245 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt6410 > Static323.anIntArray464.length) {
				Static191.anIntArray490 = new int[this.anInt6410];
				Static323.anIntArray464 = new int[this.anInt6410];
			}
			@Pc(628) int local628;
			for (@Pc(546) int local546 = 0; local546 < this.anInt6412; local546++) {
				local395 = this.lb[local546];
				local390 = this.anIntArray478[local546];
				local400 = this.anIntArray481[local546];
				local442 = local111 + local400 * Static155.aFloat153 + Static344.aFloat273 * local395 + local390 * Static403.aFloat310;
				local428 = local54 + local400 * Static309.aFloat261 + Static27.aFloat23 * local395 + local390 * Static327.aFloat267;
				local414 = Static508.aFloat353 * local390 + Static75.aFloat52 * local400 + local395 * Static345.aFloat274 + local33;
				@Pc(641) int local641;
				@Pc(646) int local646;
				@Pc(653) int local653;
				if (local442 >= (float) this.aClass62_Sub1_15.anInt5676) {
					local628 = (int) ((float) local251 * local414 / local442 + (float) this.aClass62_Sub1_15.anInt5690);
					local641 = (int) (local428 * (float) local255 / local442 + (float) this.aClass62_Sub1_15.anInt5672);
					local646 = this.anIntArray480[local546];
					local653 = this.anIntArray480[local546 + 1];
					for (@Pc(655) int local655 = local646; local655 < local653; local655++) {
						@Pc(664) int local664 = this.aShortArray88[local655] - 1;
						if (local664 == -1) {
							break;
						}
						Static323.anIntArray464[local664] = local628;
						Static191.anIntArray490[local664] = local641;
					}
				} else {
					local628 = this.anIntArray480[local546];
					local641 = this.anIntArray480[local546 + 1];
					for (local646 = local628; local646 < local641; local646++) {
						local653 = this.aShortArray88[local646] - 1;
						if (local653 == -1) {
							break;
						}
						Static323.anIntArray464[this.aShortArray88[local646] - 1] = -999999;
					}
				}
			}
			for (local628 = 0; local628 < this.anInt6440; local628++) {
				if (Static323.anIntArray464[this.aShortArray94[local628]] != -999999 && Static323.anIntArray464[this.aShortArray86[local628]] != -999999 && Static323.anIntArray464[this.aShortArray87[local628]] != -999999 && this.method5348(Static191.anIntArray490[this.aShortArray87[local628]], Static191.anIntArray490[this.aShortArray86[local628]], Static323.anIntArray464[this.aShortArray94[local628]], Static323.anIntArray464[this.aShortArray87[local628]], Static191.anIntArray490[this.aShortArray94[local628]], arg1, Static323.anIntArray464[this.aShortArray86[local628]], arg0)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	@Override
	public void b(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub2_Sub16.anIntArray411[arg0];
		@Pc(13) int local13 = Class5_Sub2_Sub16.anIntArray410[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6412; local15++) {
			@Pc(33) int local33 = local13 * this.lb[local15] + this.anIntArray481[local15] * local9 >> 15;
			this.anIntArray481[local15] = local13 * this.anIntArray481[local15] - this.lb[local15] * local9 >> 15;
			this.lb[local15] = local33;
		}
		this.method5365();
		this.aBoolean439 = false;
	}

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "(I)V")
	@Override
	public void q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub2_Sub16.anIntArray411[arg0];
		@Pc(13) int local13 = Class5_Sub2_Sub16.anIntArray410[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6412; local15++) {
			local34 = this.anIntArray478[local15] * local9 + local13 * this.lb[local15] >> 15;
			this.anIntArray478[local15] = local13 * this.anIntArray478[local15] - this.lb[local15] * local9 >> 15;
			this.lb[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt6410; local34++) {
			@Pc(89) int local89 = this.aShortArray96[local34] * local9 + this.aShortArray95[local34] * local13 >> 15;
			this.aShortArray96[local34] = (short) (this.aShortArray96[local34] * local13 - this.aShortArray95[local34] * local9 >> 15);
			this.aShortArray95[local34] = (short) local89;
		}
		this.method5365();
		this.method5352();
		this.aBoolean439 = false;
	}

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "(IIII)V")
	@Override
	protected void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static494.anInt8486 = 0;
			Static157.anInt3222 = 0;
			Static295.anInt5918 = 0;
			local18 = 0;
			for (local20 = 0; local20 < this.anInt6412; local20++) {
				Static295.anInt5918 += this.lb[local20];
				Static157.anInt3222 += this.anIntArray481[local20];
				local18++;
				Static494.anInt8486 += this.anIntArray478[local20];
			}
			if (local18 > 0) {
				Static157.anInt3222 = Static157.anInt3222 / local18 + arg2;
				Static494.anInt8486 = Static494.anInt8486 / local18 + arg3;
				Static295.anInt5918 = Static295.anInt5918 / local18 + arg1;
			} else {
				Static494.anInt8486 = arg3;
				Static157.anInt3222 = arg2;
				Static295.anInt5918 = arg1;
			}
		} else if (arg0 == 1) {
			for (local18 = 0; local18 < this.anInt6412; local18++) {
				this.lb[local18] += arg1;
				this.anIntArray481[local18] += arg2;
				this.anIntArray478[local18] += arg3;
			}
		} else {
			@Pc(170) int local170;
			@Pc(189) int local189;
			if (arg0 == 2) {
				for (local18 = 0; local18 < this.anInt6412; local18++) {
					this.lb[local18] -= Static295.anInt5918;
					this.anIntArray481[local18] -= Static157.anInt3222;
					this.anIntArray478[local18] -= Static494.anInt8486;
					if (arg3 != 0) {
						local20 = Class5_Sub2_Sub16.anIntArray411[arg3];
						local170 = Class5_Sub2_Sub16.anIntArray410[arg3];
						local189 = local20 * this.anIntArray481[local18] + local170 * this.lb[local18] + 32767 >> 15;
						this.anIntArray481[local18] = this.anIntArray481[local18] * local170 + 32767 - this.lb[local18] * local20 >> 15;
						this.lb[local18] = local189;
					}
					if (arg1 != 0) {
						local20 = Class5_Sub2_Sub16.anIntArray411[arg1];
						local170 = Class5_Sub2_Sub16.anIntArray410[arg1];
						local189 = local170 * this.anIntArray481[local18] + 32767 - this.anIntArray478[local18] * local20 >> 15;
						this.anIntArray478[local18] = local170 * this.anIntArray478[local18] + local20 * this.anIntArray481[local18] + 32767 >> 15;
						this.anIntArray481[local18] = local189;
					}
					if (arg2 != 0) {
						local20 = Class5_Sub2_Sub16.anIntArray411[arg2];
						local170 = Class5_Sub2_Sub16.anIntArray410[arg2];
						local189 = local170 * this.lb[local18] + this.anIntArray478[local18] * local20 + 32767 >> 15;
						this.anIntArray478[local18] = this.anIntArray478[local18] * local170 + 32767 - this.lb[local18] * local20 >> 15;
						this.lb[local18] = local189;
					}
					this.lb[local18] += Static295.anInt5918;
					this.anIntArray481[local18] += Static157.anInt3222;
					this.anIntArray478[local18] += Static494.anInt8486;
				}
			} else if (arg0 == 3) {
				for (local18 = 0; local18 < this.anInt6412; local18++) {
					this.lb[local18] -= Static295.anInt5918;
					this.anIntArray481[local18] -= Static157.anInt3222;
					this.anIntArray478[local18] -= Static494.anInt8486;
					this.lb[local18] = arg1 * this.lb[local18] / 128;
					this.anIntArray481[local18] = this.anIntArray481[local18] * arg2 / 128;
					this.anIntArray478[local18] = arg3 * this.anIntArray478[local18] / 128;
					this.lb[local18] += Static295.anInt5918;
					this.anIntArray481[local18] += Static157.anInt3222;
					this.anIntArray478[local18] += Static494.anInt8486;
				}
			} else {
				@Pc(522) Class255 local522;
				@Pc(527) Class194 local527;
				if (arg0 == 5) {
					for (local18 = 0; local18 < this.anInt6440; local18++) {
						local20 = arg1 * 8 + (this.aByteArray85[local18] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray85[local18] = (byte) local20;
					}
					if (this.aClass255Array1 != null) {
						for (local20 = 0; local20 < this.anInt6465; local20++) {
							local522 = this.aClass255Array1[local20];
							local527 = this.aClass194Array1[local20];
							local527.anInt5990 = local527.anInt5990 & 0xFFFFFF | 255 - (this.aByteArray85[local522.anInt7525] & 0xFF) << 24;
						}
					}
					this.method5354();
				} else if (arg0 == 7) {
					for (local18 = 0; local18 < this.anInt6440; local18++) {
						local20 = this.aShortArray90[local18] & 0xFFFF;
						local170 = local20 >> 10 & 0x3F;
						local189 = local20 >> 7 & 0x7;
						@Pc(590) int local590 = arg1 + local170 & 0x3F;
						local189 += arg2 / 4;
						@Pc(600) int local600 = local20 & 0x7F;
						if (local189 < 0) {
							local189 = 0;
						} else if (local189 > 7) {
							local189 = 7;
						}
						local600 += arg3;
						if (local600 < 0) {
							local600 = 0;
						} else if (local600 > 127) {
							local600 = 127;
						}
						this.aShortArray90[local18] = (short) (local600 | local189 << 7 | local590 << 10);
					}
					if (this.aClass255Array1 != null) {
						for (local20 = 0; local20 < this.anInt6465; local20++) {
							local522 = this.aClass255Array1[local20];
							local527 = this.aClass194Array1[local20];
							local527.anInt5990 = Static444.anIntArray587[this.aShortArray90[local522.anInt7525] & 0xFFFF] & 0xFFFFFF | local527.anInt5990 & 0xFF000000;
						}
					}
					this.method5354();
				} else {
					@Pc(715) Class194 local715;
					if (arg0 == 8) {
						for (local18 = 0; local18 < this.anInt6465; local18++) {
							local715 = this.aClass194Array1[local18];
							local715.anInt5986 += arg1;
							local715.anInt5984 += arg2;
						}
					} else if (arg0 == 10) {
						for (local18 = 0; local18 < this.anInt6465; local18++) {
							local715 = this.aClass194Array1[local18];
							local715.anInt5993 = arg2 * local715.anInt5993 >> 7;
							local715.anInt5987 = arg1 * local715.anInt5987 >> 7;
						}
					} else if (arg0 == 9) {
						for (local18 = 0; local18 < this.anInt6465; local18++) {
							local715 = this.aClass194Array1[local18];
							local715.anInt5988 = local715.anInt5988 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	@Override
	public Class5_Sub2_Sub13 EA(@OriginalArg(0) Class5_Sub2_Sub13 arg0) {
		if (this.anInt6410 == 0) {
			return null;
		}
		if (!this.aBoolean439) {
			this.method5347();
		}
		@Pc(43) int local43;
		@Pc(59) int local59;
		if (this.aClass62_Sub1_15.anInt5664 <= 0) {
			local43 = this.anInt6466 - (this.anInt6401 * this.aClass62_Sub1_15.anInt5664 >> 8) >> this.aClass62_Sub1_15.anInt5686;
			local59 = this.anInt6433 - (this.anInt6432 * this.aClass62_Sub1_15.anInt5664 >> 8) >> this.aClass62_Sub1_15.anInt5686;
		} else {
			local43 = this.anInt6466 - (this.anInt6432 * this.aClass62_Sub1_15.anInt5664 >> 8) >> this.aClass62_Sub1_15.anInt5686;
			local59 = this.anInt6433 - (this.aClass62_Sub1_15.anInt5664 * this.anInt6401 >> 8) >> this.aClass62_Sub1_15.anInt5686;
		}
		@Pc(119) int local119;
		@Pc(135) int local135;
		if (this.aClass62_Sub1_15.anInt5691 > 0) {
			local119 = this.anInt6411 - (this.aClass62_Sub1_15.anInt5691 * this.anInt6432 >> 8) >> this.aClass62_Sub1_15.anInt5686;
			local135 = this.anInt6422 - (this.anInt6401 * this.aClass62_Sub1_15.anInt5691 >> 8) >> this.aClass62_Sub1_15.anInt5686;
		} else {
			local119 = this.anInt6411 - (this.aClass62_Sub1_15.anInt5691 * this.anInt6401 >> 8) >> this.aClass62_Sub1_15.anInt5686;
			local135 = this.anInt6422 - (this.anInt6432 * this.aClass62_Sub1_15.anInt5691 >> 8) >> this.aClass62_Sub1_15.anInt5686;
		}
		@Pc(178) int local178 = local59 + 1 - local43;
		@Pc(185) int local185 = local135 + 1 - local119;
		@Pc(188) Class5_Sub2_Sub13_Sub2 local188 = (Class5_Sub2_Sub13_Sub2) arg0;
		@Pc(204) Class5_Sub2_Sub13_Sub2 local204;
		if (local188 != null && local188.method4851(local185, local178)) {
			local204 = local188;
			local188.method4848();
		} else {
			local204 = new Class5_Sub2_Sub13_Sub2(this.aClass62_Sub1_15, local178, local185);
		}
		local204.method4854(local119, local43, local135, local59);
		this.method5351(local204);
		return local204;
	}

	@OriginalMember(owner = "client!oa", name = "sa", descriptor = "()Z")
	@Override
	protected boolean sa() {
		if (this.anIntArrayArray50 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt6414; local12++) {
			this.lb[local12] <<= 0x4;
			this.anIntArray481[local12] <<= 0x4;
			this.anIntArray478[local12] <<= 0x4;
		}
		Static295.anInt5918 = 0;
		Static157.anInt3222 = 0;
		Static494.anInt8486 = 0;
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "(I)V")
	@Override
	public void m(@OriginalArg(0) int arg0) {
		if (this.aClass251_4 != null) {
			this.aClass251_4.aBoolean526 = Static523.method7171(arg0, this.anInt6426);
		}
		if (this.aClass251_2 != null) {
			this.aClass251_2.aBoolean526 = Static311.method5050(arg0, this.anInt6426);
		}
		if (this.aClass251_3 != null) {
			this.aClass251_3.aBoolean526 = Static404.method5867(this.anInt6426, arg0);
		}
		if (this.aClass251_1 != null) {
			this.aClass251_1.aBoolean526 = Static293.method4902(this.anInt6426, arg0);
		}
		this.anInt6450 = arg0;
		this.aBoolean441 = true;
		if (this.aClass145_1 != null && (this.anInt6450 & 0x10000) == 0) {
			this.aShortArray97 = this.aClass145_1.aShortArray38;
			this.aShortArray95 = this.aClass145_1.aShortArray37;
			this.aShortArray96 = this.aClass145_1.aShortArray36;
			this.aByteArray86 = this.aClass145_1.aByteArray51;
			this.aClass145_1 = null;
		}
		this.method5364();
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()I")
	@Override
	public int n() {
		if (!this.aBoolean439) {
			this.method5347();
		}
		return this.anInt6432;
	}

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(SS)V")
	@Override
	public void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface8 local9 = this.aClass62_Sub1_15.anInterface8_145;
		for (@Pc(11) int local11 = 0; local11 < this.anInt6440; local11++) {
			if (arg0 == this.aShortArray91[local11]) {
				this.aShortArray91[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class271 local48 = local9.method7237(arg0 & 0xFFFF);
			local35 = local48.aByte80;
			local37 = local48.aByte83;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(69) Class271 local69 = local9.method7237(arg1 & 0xFFFF);
			local56 = local69.aByte80;
			local58 = local69.aByte83;
		}
		if (!(local58 != local37 | local35 != local56)) {
			return;
		}
		if (this.aClass255Array1 != null) {
			for (@Pc(98) int local98 = 0; local98 < this.anInt6465; local98++) {
				@Pc(105) Class255 local105 = this.aClass255Array1[local98];
				@Pc(110) Class194 local110 = this.aClass194Array1[local98];
				local110.anInt5990 = Static444.anIntArray587[this.aShortArray90[local105.anInt7525] & 0xFFFF] & 0xFFFFFF | local110.anInt5990 & 0xFF000000;
			}
		}
		this.method5354();
	}
}
