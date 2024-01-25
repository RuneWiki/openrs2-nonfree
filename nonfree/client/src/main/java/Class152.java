import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public class Class152 {

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "[I")
	private final int[] anIntArray282 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "[I")
	private final int[] anIntArray281 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "Lclient!md;")
	private final Class209 aClass209_4;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "Lclient!h;")
	private final Class131 aClass131_3;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Z")
	public final boolean aBoolean335;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
	protected final int anInt4297;

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
	protected final int anInt4301;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
	public final int anInt4295;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IIIZLclient!md;Lclient!h;)V")
	protected Class152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class209 arg4, @OriginalArg(5) Class131 arg5) {
		this.aClass209_4 = arg4;
		this.aClass131_3 = arg5;
		this.aBoolean335 = arg3;
		this.anInt4297 = arg2;
		this.anInt4301 = arg1;
		this.anInt4295 = arg0;
		this.anIntArrayArrayArray8 = new int[this.anInt4295][this.anInt4301 + 1][this.anInt4297 + 1];
		this.aByteArrayArrayArray13 = new byte[this.anInt4295][this.anInt4301][this.anInt4297];
		this.aByteArrayArrayArray17 = new byte[this.anInt4295][this.anInt4301][this.anInt4297];
		this.aByteArrayArrayArray16 = new byte[this.anInt4295][this.anInt4301][this.anInt4297];
		this.aByteArrayArrayArray15 = new byte[this.anInt4295][this.anInt4301][this.anInt4297];
		this.aByteArrayArrayArray14 = new byte[this.anInt4295][this.anInt4301 + 1][this.anInt4297 + 1];
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLclient!d;Lclient!d;Lclient!oa;)V")
	public final void method3647(@OriginalArg(1) Class4 arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) Class15 arg2) {
		if (Static386.anIntArray478 == null || Static386.anIntArray478.length != this.anInt4297) {
			Static228.anIntArray292 = new int[this.anInt4297];
			Static386.anIntArray478 = new int[this.anInt4297];
			Static489.anIntArray587 = new int[this.anInt4297];
			Static270.anIntArray284 = new int[this.anInt4297];
			Static542.anIntArray652 = new int[this.anInt4297];
		}
		@Pc(38) int[][] local38 = new int[this.anInt4301][this.anInt4297];
		@Pc(44) int local44;
		for (@Pc(40) int local40 = 0; local40 < this.anInt4295; local40++) {
			for (local44 = 0; local44 < this.anInt4297; local44++) {
				Static386.anIntArray478[local44] = 0;
				Static489.anIntArray587[local44] = 0;
				Static542.anIntArray652[local44] = 0;
				Static270.anIntArray284[local44] = 0;
				Static228.anIntArray292[local44] = 0;
			}
			for (@Pc(73) int local73 = -5; local73 < this.anInt4301; local73++) {
				@Pc(83) int local83;
				@Pc(102) int local102;
				@Pc(174) int local174;
				for (@Pc(77) int local77 = 0; local77 < this.anInt4297; local77++) {
					local83 = local73 + 5;
					@Pc(151) int local151;
					if (this.anInt4301 > local83) {
						local102 = this.aByteArrayArrayArray13[local40][local83][local77] & 0xFF;
						if (local102 > 0) {
							@Pc(115) Class159 local115 = this.aClass131_3.method3146(local102 - 1);
							Static386.anIntArray478[local77] += local115.anInt4471;
							Static489.anIntArray587[local77] += local115.anInt4477;
							Static542.anIntArray652[local77] += local115.anInt4469;
							Static270.anIntArray284[local77] += local115.anInt4468;
							local151 = Static228.anIntArray292[local77]++;
						}
					}
					local102 = local73 - 5;
					if (local102 >= 0) {
						local174 = this.aByteArrayArrayArray13[local40][local102][local77] & 0xFF;
						if (local174 > 0) {
							@Pc(187) Class159 local187 = this.aClass131_3.method3146(local174 - 1);
							Static386.anIntArray478[local77] -= local187.anInt4471;
							Static489.anIntArray587[local77] -= local187.anInt4477;
							Static542.anIntArray652[local77] -= local187.anInt4469;
							Static270.anIntArray284[local77] -= local187.anInt4468;
							local151 = Static228.anIntArray292[local77]--;
						}
					}
				}
				if (local73 >= 0) {
					local83 = 0;
					local102 = 0;
					local174 = 0;
					@Pc(244) int local244 = 0;
					@Pc(246) int local246 = 0;
					for (@Pc(248) int local248 = -5; local248 < this.anInt4297; local248++) {
						@Pc(254) int local254 = local248 + 5;
						if (this.anInt4297 > local254) {
							local244 += Static270.anIntArray284[local254];
							local246 += Static228.anIntArray292[local254];
							local102 += Static489.anIntArray587[local254];
							local174 += Static542.anIntArray652[local254];
							local83 += Static386.anIntArray478[local254];
						}
						@Pc(296) int local296 = local248 - 5;
						if (local296 >= 0) {
							local174 -= Static542.anIntArray652[local296];
							local244 -= Static270.anIntArray284[local296];
							local246 -= Static228.anIntArray292[local296];
							local102 -= Static489.anIntArray587[local296];
							local83 -= Static386.anIntArray478[local296];
						}
						if (local248 >= 0 && local244 > 0 && local246 > 0) {
							local38[local73][local248] = Static183.method3262(local174 / local246, local102 / local246, local83 * 256 / local244);
						}
					}
				}
			}
			if (Static74.aBoolean150) {
				this.method3653(Static224.aClass4Array3[local40], local40, local40 == 0 ? arg1 : null, arg2, local38, local40 == 0 ? arg0 : null);
			} else {
				this.method3656(local40 == 0 ? arg0 : null, arg2, local40, Static224.aClass4Array3[local40], local40 == 0 ? arg1 : null, local38);
			}
			this.aByteArrayArrayArray13[local40] = null;
			this.aByteArrayArrayArray15[local40] = null;
			this.aByteArrayArrayArray17[local40] = null;
			this.aByteArrayArrayArray16[local40] = null;
		}
		if (!this.aBoolean335) {
			if (Static514.anInt9447 != 0) {
				Static514.method7670();
			}
			if (Static370.aBoolean617) {
				Static185.method3273();
			}
		}
		for (local44 = 0; local44 < this.anInt4295; local44++) {
			Static224.aClass4Array3[local44].ba();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIZ)V")
	public final void method3648(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt4295; local11++) {
			this.method3654(local11, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII[Lclient!wca;Lclient!fd;)V")
	public final void method3649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class350[] arg4, @OriginalArg(6) Class3_Sub7 arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (!this.aBoolean335) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class350 local12 = arg4[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = local14 + arg2;
						@Pc(28) int local28 = local18 + arg0;
						if (local24 >= 0 && local24 < this.anInt4301 && local28 >= 0 && this.anInt4297 > local28) {
							local12.method8217(local28, local24);
						}
					}
				}
			}
		}
		local6 = arg2 + arg1;
		@Pc(82) int local82 = arg3 + arg0;
		for (local14 = 0; local14 < this.anInt4295; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local24 = 0; local24 < 64; local24++) {
					this.method3658(arg0 + local24, false, 0, local14, local82 + local24, arg5, 0, arg2 + local18, local6 - -local18, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!d;ILclient!d;Lclient!oa;[[ILclient!d;)V")
	private void method3653(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) Class15 arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) Class4 arg5) {
		@Pc(18) byte[][] local18 = this.aByteArrayArrayArray17[arg1];
		@Pc(23) byte[][] local23 = this.aByteArrayArrayArray16[arg1];
		@Pc(28) byte[][] local28 = this.aByteArrayArrayArray13[arg1];
		@Pc(33) byte[][] local33 = this.aByteArrayArrayArray15[arg1];
		for (@Pc(35) int local35 = 0; local35 < this.anInt4301; local35++) {
			@Pc(49) int local49 = local35 < this.anInt4301 - 1 ? local35 + 1 : local35;
			for (@Pc(51) int local51 = 0; local51 < this.anInt4297; local51++) {
				@Pc(65) int local65 = this.anInt4297 - 1 <= local51 ? local51 : local51 + 1;
				if (Static521.anInt9520 == -1 || Static194.method3317(arg1, Static521.anInt9520, local51, local35)) {
					@Pc(79) boolean local79 = false;
					@Pc(81) boolean local81 = false;
					@Pc(84) boolean[] local84 = new boolean[4];
					@Pc(90) int local90 = local18[local35][local51];
					@Pc(96) int local96 = local23[local35][local51];
					@Pc(104) int local104 = local33[local35][local51] & 0xFF;
					@Pc(112) int local112 = local28[local35][local51] & 0xFF;
					@Pc(120) int local120 = local28[local35][local65] & 0xFF;
					@Pc(128) int local128 = local28[local49][local65] & 0xFF;
					@Pc(136) int local136 = local28[local49][local51] & 0xFF;
					if (local104 != 0 || local112 != 0) {
						@Pc(158) Class128 local158 = local104 == 0 ? null : this.aClass209_4.method5515(local104 - 1);
						@Pc(170) Class159 local170 = local112 == 0 ? null : this.aClass131_3.method3146(local112 - 1);
						if (local90 == 0 && local158 == null) {
							local90 = 12;
						}
						@Pc(181) Class128 local181 = local158;
						if (local158 != null) {
							if (local158.anInt3550 == -1 && local158.anInt3540 == -1) {
								local181 = local158;
								local158 = null;
							} else if (local170 != null && local90 != 0) {
								local81 = local158.aBoolean277;
							}
						}
						@Pc(276) int local276;
						@Pc(306) int local306;
						@Pc(379) int local379;
						@Pc(392) int local392;
						if ((local90 == 0 || local90 == 12) && local35 > 0 && local51 > 0 && this.anInt4301 > local35 && local51 < this.anInt4297) {
							@Pc(259) int local259 = local28[local49][local51 - 1] == local112 ? 1 : -1;
							local276 = local28[local35 - 1][local51 - 1] == local112 ? 1 : -1;
							@Pc(289) int local289 = local28[local49][local65] == local112 ? 1 : -1;
							local306 = local28[local35 - 1][local65] == local112 ? 1 : -1;
							if (local112 == local28[local35][local51 - 1]) {
								local259++;
								local276++;
							} else {
								local259--;
								local276--;
							}
							if (local112 == local28[local49][local51]) {
								local289++;
								local259++;
							} else {
								local289--;
								local259--;
							}
							if (local112 == local28[local35][local65]) {
								local306++;
								local289++;
							} else {
								local289--;
								local306--;
							}
							if (local28[local35 - 1][local51] == local112) {
								local276++;
								local306++;
							} else {
								local306--;
								local276--;
							}
							local379 = local276 - local289;
							if (local379 < 0) {
								local379 = -local379;
							}
							local392 = local259 - local306;
							if (local392 < 0) {
								local392 = -local392;
							}
							if (local379 == local392) {
								local379 = arg0.JA(local35, local51) - arg0.JA(local49, local65);
								if (local379 < 0) {
									local379 = -local379;
								}
								local392 = arg0.JA(local49, local51) - arg0.JA(local35, local65);
								if (local392 < 0) {
									local392 = -local392;
								}
							}
							local96 = local392 > local379 ? 1 : 0;
						}
						for (local276 = 0; local276 < 13; local276++) {
							Static475.anIntArray579[local276] = -1;
							Static163.anIntArray230[local276] = 1;
						}
						@Pc(478) boolean[] local478 = local158 != null && local158.aBoolean277 ? Static511.aBooleanArrayArray6[local90] : Static377.aBooleanArrayArray4[local90];
						this.method3655(local33, local51, this.anInt4297, local170, local96, arg3, local18, local84, this.anInt4301, local90, local35, local23, local158);
						@Pc(511) boolean local511 = local158 != null && local158.anInt3550 != local158.anInt3540;
						if (!local511) {
							for (local306 = 0; local306 < 8; local306++) {
								if (Static475.anIntArray579[local306] >= 0 && Static343.anIntArray448[local306] != Static48.anIntArray72[local306]) {
									local511 = true;
									break;
								}
							}
						}
						if (!local478[local96 + 1 & 0x3]) {
							local84[1] = Static152.method2972(local84[1], (Static163.anIntArray230[4] & Static163.anIntArray230[2]) == 0);
						}
						if (!local478[local96 + 3 & 0x3]) {
							local84[3] = Static152.method2972(local84[3], (Static163.anIntArray230[6] & Static163.anIntArray230[0]) == 0);
						}
						if (!local478[local96 & 0x3]) {
							local84[0] = Static152.method2972(local84[0], (Static163.anIntArray230[0] & Static163.anIntArray230[2]) == 0);
						}
						if (!local478[local96 + 2 & 0x3]) {
							local84[2] = Static152.method2972(local84[2], (Static163.anIntArray230[4] & Static163.anIntArray230[6]) == 0);
						}
						if (!local81 && (local90 == 0 || local90 == 12)) {
							if (local84[0] && !local84[1] && !local84[2] && local84[3]) {
								local90 = local90 == 0 ? 13 : 14;
								local84[0] = local84[3] = false;
								local96 = 0;
							} else if (local84[0] && local84[1] && !local84[2] && !local84[3]) {
								local96 = 3;
								local90 = local90 == 0 ? 13 : 14;
								local84[0] = local84[1] = false;
							} else if (!local84[0] && local84[1] && local84[2] && !local84[3]) {
								local96 = 2;
								local84[1] = local84[2] = false;
								local90 = local90 == 0 ? 13 : 14;
							} else if (!local84[0] && !local84[1] && local84[2] && local84[3]) {
								local90 = local90 == 0 ? 13 : 14;
								local96 = 1;
								local84[2] = local84[3] = false;
							}
						}
						@Pc(818) boolean local818 = !local81 && !local84[0] && !local84[2] && !local84[1] && !local84[3];
						@Pc(820) int[] local820 = null;
						@Pc(838) int[] local838;
						@Pc(842) int[] local842;
						@Pc(826) int[] local826;
						if (local818) {
							local826 = Static219.anIntArrayArray33[local90];
							local379 = local170 == null ? 0 : Static556.anIntArray658[local90];
							local838 = Static375.anIntArrayArray59[local90];
							local842 = Static25.anIntArrayArray8[local90];
							local392 = local158 == null ? 0 : Static2.anIntArray1[local90];
						} else if (local81) {
							local379 = local170 == null ? 0 : Static446.anIntArray518[local90];
							local826 = Static538.anIntArrayArray80[local90];
							local392 = local158 == null ? 0 : Static162.anIntArray229[local90];
							local820 = Static481.anIntArrayArray73[local90];
							local838 = Static202.anIntArrayArray31[local90];
							local842 = Static306.anIntArrayArray52[local90];
						} else {
							local379 = local170 == null ? 0 : Static499.anIntArray610[local90];
							local820 = Static441.anIntArrayArray61[local90];
							local842 = Static67.anIntArrayArray83[local90];
							local838 = Static293.anIntArrayArray45[local90];
							local392 = local158 == null ? 0 : Static475.anIntArray578[local90];
							local826 = Static137.anIntArrayArray28[local90];
						}
						@Pc(923) int local923 = local379 + local392;
						if (local923 <= 0) {
							Static513.method358(arg1, local35, local51);
						} else {
							if (local84[0]) {
								local923++;
							}
							if (local84[2]) {
								local923++;
							}
							if (local84[1]) {
								local923++;
							}
							if (local84[3]) {
								local923++;
							}
							@Pc(953) int local953 = 0;
							@Pc(955) int local955 = 0;
							@Pc(959) int local959 = local923 * 3;
							@Pc(966) int[] local966 = local511 ? new int[local959] : null;
							@Pc(969) int[] local969 = new int[local959];
							@Pc(972) int[] local972 = new int[local959];
							@Pc(975) int[] local975 = new int[local959];
							@Pc(978) int[] local978 = new int[local959];
							@Pc(981) int[] local981 = new int[local959];
							@Pc(988) int[] local988 = arg5 == null ? null : new int[local959];
							@Pc(997) int[] local997 = arg5 == null && arg2 == null ? null : new int[local959];
							@Pc(999) int local999 = -1;
							@Pc(1001) int local1001 = -1;
							@Pc(1003) int local1003 = 256;
							@Pc(1075) byte local1075;
							@Pc(1025) int local1025;
							@Pc(1027) int local1027;
							@Pc(1260) int local1260;
							@Pc(1266) int local1266;
							@Pc(1275) int local1275;
							@Pc(1280) int local1280;
							@Pc(1290) int local1290;
							@Pc(1285) int local1285;
							@Pc(1295) int local1295;
							@Pc(1350) int local1350;
							@Pc(1357) int local1357;
							if (local158 != null) {
								local999 = local158.anInt3550;
								local1001 = arg3.method5289() ? local158.anInt3546 : local158.anInt3545;
								local1003 = local158.anInt3548;
								local1025 = Static106.method2242(arg3, local158);
								for (local1027 = 0; local1027 < local392; local1027++) {
									if (local84[-local96 & 0x3] && local820[0] == local953) {
										Static463.anIntArray532[0] = local838[local953];
										Static463.anIntArray532[1] = 1;
										Static463.anIntArray532[2] = local826[local953];
										Static463.anIntArray532[3] = 1;
										Static463.anIntArray532[4] = local842[local953];
										local1075 = 6;
										Static463.anIntArray532[5] = local826[local953];
									} else if (local84[2 - local96 & 0x3] && local820[2] == local953) {
										Static463.anIntArray532[0] = local838[local953];
										Static463.anIntArray532[1] = 5;
										Static463.anIntArray532[2] = local826[local953];
										Static463.anIntArray532[3] = 5;
										Static463.anIntArray532[4] = local842[local953];
										Static463.anIntArray532[5] = local826[local953];
										local1075 = 6;
									} else if (local84[1 - local96 & 0x3] && local820[1] == local953) {
										Static463.anIntArray532[0] = local838[local953];
										Static463.anIntArray532[1] = 3;
										Static463.anIntArray532[2] = local826[local953];
										Static463.anIntArray532[3] = 3;
										Static463.anIntArray532[4] = local842[local953];
										Static463.anIntArray532[5] = local826[local953];
										local1075 = 6;
									} else if (local84[3 - local96 & 0x3] && local953 == local820[3]) {
										Static463.anIntArray532[0] = local838[local953];
										Static463.anIntArray532[1] = 7;
										Static463.anIntArray532[2] = local826[local953];
										Static463.anIntArray532[3] = 7;
										Static463.anIntArray532[4] = local842[local953];
										local1075 = 6;
										Static463.anIntArray532[5] = local826[local953];
									} else {
										Static463.anIntArray532[0] = local838[local953];
										Static463.anIntArray532[1] = local842[local953];
										local1075 = 3;
										Static463.anIntArray532[2] = local826[local953];
									}
									local953++;
									for (local1260 = 0; local1260 < local1075; local1260++) {
										local1266 = Static463.anIntArray532[local1260];
										local1275 = local1266 - local96 * 2 & 0x7;
										local1280 = this.anIntArray282[local1266];
										local1285 = this.anIntArray281[local1266];
										if (local96 == 1) {
											local1290 = local1285;
											local1295 = 512 - local1280;
										} else if (local96 == 2) {
											local1295 = 512 - local1285;
											local1290 = 512 - local1280;
										} else if (local96 == 3) {
											local1295 = local1280;
											local1290 = 512 - local1285;
										} else {
											local1290 = local1280;
											local1295 = local1285;
										}
										local969[local955] = local1290;
										local972[local955] = local1295;
										if (local988 != null && Static380.aBooleanArrayArray5[local90][local1266]) {
											local1350 = (local35 << 9) + local1290;
											local1357 = (local51 << 9) + local1295;
											local988[local955] = arg5.sa(local1350, local1357) - arg0.sa(local1350, local1357);
										}
										if (local997 != null) {
											if (arg5 != null && !Static380.aBooleanArrayArray5[local90][local1266]) {
												local1350 = (local35 << 9) + local1290;
												local1357 = local1295 + (local51 << 9);
												local997[local955] = arg0.sa(local1350, local1357) - arg5.sa(local1350, local1357);
											} else if (arg2 != null && !Static42.aBooleanArrayArray1[local90][local1266]) {
												local1350 = (local35 << 9) + local1290;
												local1357 = local1295 + (local51 << 9);
												local997[local955] = arg2.sa(local1350, local1357) - arg0.sa(local1350, local1357);
											}
										}
										if (local1266 < 8 && Static475.anIntArray579[local1275] > local158.anInt3549) {
											if (local966 != null) {
												local966[local955] = Static343.anIntArray448[local1275];
											}
											local981[local955] = Static334.anIntArray445[local1275];
											local978[local955] = Static297.anIntArray371[local1275];
											local975[local955] = Static48.anIntArray72[local1275];
										} else {
											if (local966 != null) {
												local966[local955] = local1025;
											}
											local978[local955] = arg3.method5289() ? local158.anInt3546 : local158.anInt3545;
											local981[local955] = local158.anInt3548;
											local975[local955] = local999;
										}
										local955++;
									}
								}
								if (!this.aBoolean335 && arg1 == 0) {
									Static311.method5199(local35, local51, local158.anInt3538, local158.anInt3539 * 8, local158.anInt3547);
								}
								if (local90 != 12 && local158.anInt3550 != -1 && local158.aBoolean275) {
									local79 = true;
								}
							} else if (local818) {
								local953 = Static2.anIntArray1[local90];
							} else if (local81) {
								local953 = Static162.anIntArray229[local90];
							} else {
								local953 = Static475.anIntArray578[local90];
							}
							if (local170 != null) {
								if (local136 == 0) {
									local136 = local112;
								}
								if (local120 == 0) {
									local120 = local112;
								}
								if (local128 == 0) {
									local128 = local112;
								}
								@Pc(1601) Class159 local1601 = this.aClass131_3.method3146(local112 - 1);
								@Pc(1609) Class159 local1609 = this.aClass131_3.method3146(local120 - 1);
								@Pc(1617) Class159 local1617 = this.aClass131_3.method3146(local128 - 1);
								@Pc(1625) Class159 local1625 = this.aClass131_3.method3146(local136 - 1);
								for (local1275 = 0; local1275 < local379; local1275++) {
									if (local84[-local96 & 0x3] && local820[0] == local953) {
										Static463.anIntArray532[0] = local838[local953];
										Static463.anIntArray532[1] = 1;
										Static463.anIntArray532[2] = local826[local953];
										Static463.anIntArray532[3] = 1;
										Static463.anIntArray532[4] = local842[local953];
										local1075 = 6;
										Static463.anIntArray532[5] = local826[local953];
									} else if (local84[2 - local96 & 0x3] && local953 == local820[2]) {
										Static463.anIntArray532[0] = local838[local953];
										Static463.anIntArray532[1] = 5;
										Static463.anIntArray532[2] = local826[local953];
										Static463.anIntArray532[3] = 5;
										Static463.anIntArray532[4] = local842[local953];
										local1075 = 6;
										Static463.anIntArray532[5] = local826[local953];
									} else if (local84[1 - local96 & 0x3] && local820[1] == local953) {
										Static463.anIntArray532[0] = local838[local953];
										Static463.anIntArray532[1] = 3;
										Static463.anIntArray532[2] = local826[local953];
										Static463.anIntArray532[3] = 3;
										Static463.anIntArray532[4] = local842[local953];
										Static463.anIntArray532[5] = local826[local953];
										local1075 = 6;
									} else if (local84[3 - local96 & 0x3] && local953 == local820[3]) {
										Static463.anIntArray532[0] = local838[local953];
										Static463.anIntArray532[1] = 7;
										Static463.anIntArray532[2] = local826[local953];
										Static463.anIntArray532[3] = 7;
										Static463.anIntArray532[4] = local842[local953];
										local1075 = 6;
										Static463.anIntArray532[5] = local826[local953];
									} else {
										Static463.anIntArray532[0] = local838[local953];
										Static463.anIntArray532[1] = local842[local953];
										local1075 = 3;
										Static463.anIntArray532[2] = local826[local953];
									}
									local953++;
									for (local1280 = 0; local1280 < local1075; local1280++) {
										local1290 = Static463.anIntArray532[local1280];
										local1285 = local1290 - local96 * 2 & 0x7;
										local1295 = this.anIntArray282[local1290];
										local1357 = this.anIntArray281[local1290];
										@Pc(1891) int local1891;
										if (local96 == 1) {
											local1891 = 512 - local1295;
											local1350 = local1357;
										} else if (local96 == 2) {
											local1891 = 512 - local1357;
											local1350 = 512 - local1295;
										} else if (local96 == 3) {
											local1891 = local1295;
											local1350 = 512 - local1357;
										} else {
											local1350 = local1295;
											local1891 = local1357;
										}
										local969[local955] = local1350;
										local972[local955] = local1891;
										@Pc(1950) int local1950;
										@Pc(1956) int local1956;
										if (local988 != null && Static380.aBooleanArrayArray5[local90][local1290]) {
											local1950 = (local35 << 9) + local1350;
											local1956 = local1891 + (local51 << 9);
											local988[local955] = arg5.sa(local1950, local1956) - arg0.sa(local1950, local1956);
										}
										if (local997 != null) {
											if (arg5 != null && !Static380.aBooleanArrayArray5[local90][local1290]) {
												local1950 = (local35 << 9) + local1350;
												local1956 = (local51 << 9) + local1891;
												local997[local955] = arg0.sa(local1950, local1956) - arg5.sa(local1950, local1956);
											} else if (arg2 != null && !Static42.aBooleanArrayArray1[local90][local1290]) {
												local1950 = local1350 + (local35 << 9);
												local1956 = local1891 + (local51 << 9);
												local997[local955] = arg2.sa(local1950, local1956) - arg0.sa(local1950, local1956);
											}
										}
										if (local1290 < 8 && Static475.anIntArray579[local1285] >= 0) {
											if (local966 != null) {
												local966[local955] = Static343.anIntArray448[local1285];
											}
											local981[local955] = Static334.anIntArray445[local1285];
											local978[local955] = Static297.anIntArray371[local1285];
											local975[local955] = Static48.anIntArray72[local1285];
										} else {
											if (local81 && Static380.aBooleanArrayArray5[local90][local1290]) {
												local978[local955] = local1001;
												local981[local955] = local1003;
												local975[local955] = local999;
											} else if (local1350 == 0 && local1891 == 0) {
												local975[local955] = arg4[local35][local51];
												local978[local955] = local1601.anInt4472;
												local981[local955] = local1601.anInt4474;
											} else if (local1350 == 0 && local1891 == 512) {
												local975[local955] = arg4[local35][local65];
												local978[local955] = local1609.anInt4472;
												local981[local955] = local1609.anInt4474;
											} else if (local1350 == 512 && local1891 == 512) {
												local975[local955] = arg4[local49][local65];
												local978[local955] = local1617.anInt4472;
												local981[local955] = local1617.anInt4474;
											} else if (local1350 == 512 && local1891 == 0) {
												local975[local955] = arg4[local49][local51];
												local978[local955] = local1625.anInt4472;
												local981[local955] = local1625.anInt4474;
											} else {
												if (local1350 < 256) {
													if (local1891 >= 256) {
														local978[local955] = local1609.anInt4472;
														local981[local955] = local1609.anInt4474;
													} else {
														local978[local955] = local1601.anInt4472;
														local981[local955] = local1601.anInt4474;
													}
												} else if (local1891 < 256) {
													local978[local955] = local1625.anInt4472;
													local981[local955] = local1625.anInt4474;
												} else {
													local978[local955] = local1617.anInt4472;
													local981[local955] = local1617.anInt4474;
												}
												local1950 = Static205.method3407(arg4[local49][local51], arg4[local35][local51], local1350 << 7 >> 9);
												local1956 = Static205.method3407(arg4[local49][local65], arg4[local35][local65], local1350 << 7 >> 9);
												local975[local955] = Static205.method3407(local1956, local1950, local1891 << 7 >> 9);
											}
											if (local966 != null) {
												local966[local955] = local975[local955];
											}
										}
										local955++;
									}
								}
								if (local90 != 0 && local170.aBoolean343) {
									local79 = true;
								}
							}
							local1025 = arg0.JA(local35, local51);
							local1027 = arg0.JA(local49, local51);
							local1260 = arg0.JA(local49, local65);
							local1266 = arg0.JA(local35, local65);
							if (arg1 > 0) {
								@Pc(2367) boolean local2367 = true;
								if (local112 == 0 && local90 != 0) {
									local2367 = false;
								}
								if (local104 > 0 && local181 != null && !local181.aBoolean276) {
									local2367 = false;
								}
								if (local2367 && local1025 == local1027 && local1025 == local1260 && local1266 == local1025) {
									this.aByteArrayArrayArray14[arg1][local35][local51] = (byte) (this.aByteArrayArrayArray14[arg1][local35][local51] | 0x4);
								}
							}
							local1275 = 0;
							local1280 = 0;
							local1290 = 0;
							if (this.aBoolean335) {
								local1275 = Static69.method1732(local35, local51);
								local1280 = Static24.method891(local35, local51);
								local1290 = Static340.method5816(local35, local51);
							}
							arg0.BA(local35, local51, local969, local988, local972, local997, local975, local966, local978, local981, local1275, local1280, local1290, local79);
							Static513.method358(arg1, local35, local51);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBIIII)V")
	private void method3654(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg2; local3 < arg2 + 64; local3++) {
			for (local7 = arg1; local7 < arg1 + 64; local7++) {
				if (local7 >= 0 && this.anInt4301 > local7 && local3 >= 0 && local3 < this.anInt4297) {
					this.anIntArrayArrayArray8[arg0][local7][local3] = arg0 <= 0 ? 0 : this.anIntArrayArrayArray8[arg0 - 1][local7][local3] - 960;
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt4301) {
			for (local7 = arg2 + 1; local7 < arg2 + 64; local7++) {
				if (local7 >= 0 && local7 < this.anInt4297) {
					this.anIntArrayArrayArray8[arg0][arg1][local7] = this.anIntArrayArrayArray8[arg0][arg1 - 1][local7];
				}
			}
		}
		if (arg2 > 0 && this.anInt4297 > arg2) {
			for (local7 = arg1 + 1; local7 < arg1 + 64; local7++) {
				if (local7 >= 0 && local7 < this.anInt4301) {
					this.anIntArrayArrayArray8[arg0][local7][arg2] = this.anIntArrayArrayArray8[arg0][local7][arg2 - 1];
				}
			}
		}
		if (arg1 < 0 || arg2 < 0 || this.anInt4301 <= arg1 || arg2 >= this.anInt4297) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray8[arg0][arg1 - 1][arg2] != 0) {
				this.anIntArrayArrayArray8[arg0][arg1][arg2] = this.anIntArrayArrayArray8[arg0][arg1 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray8[arg0][arg1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray8[arg0][arg1][arg2] = this.anIntArrayArrayArray8[arg0][arg1][arg2 - 1];
				return;
			}
			if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray8[arg0][arg1 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray8[arg0][arg1][arg2] = this.anIntArrayArrayArray8[arg0][arg1 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray8[arg0][arg1 - 1][arg2] != this.anIntArrayArrayArray8[arg0 - 1][arg1 - 1][arg2]) {
			this.anIntArrayArrayArray8[arg0][arg1][arg2] = this.anIntArrayArrayArray8[arg0][arg1 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray8[arg0][arg1][arg2 - 1] != this.anIntArrayArrayArray8[arg0 - 1][arg1][arg2 - 1]) {
			this.anIntArrayArrayArray8[arg0][arg1][arg2] = this.anIntArrayArrayArray8[arg0][arg1][arg2 - 1];
			return;
		}
		if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray8[arg0][arg1 - 1][arg2 - 1] != this.anIntArrayArrayArray8[arg0 - 1][arg1 - 1][arg2 - 1]) {
			this.anIntArrayArrayArray8[arg0][arg1][arg2] = this.anIntArrayArrayArray8[arg0][arg1 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([[BIILclient!ih;ILclient!oa;[[B[ZIIII[[BLclient!gr;)V")
	private void method3655(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class159 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class15 arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) boolean[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) Class128 arg12) {
		@Pc(18) boolean[] local18 = arg12 != null && arg12.aBoolean277 ? Static511.aBooleanArrayArray6[arg9] : Static377.aBooleanArrayArray4[arg9];
		@Pc(37) int local37;
		@Pc(50) Class128 local50;
		@Pc(68) byte local68;
		@Pc(84) int local84;
		@Pc(89) int local89;
		if (arg1 > 0) {
			if (arg10 > 0) {
				local37 = arg0[arg10 - 1][arg1 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass209_4.method5515(local37 - 1);
					if (local50.anInt3550 != -1 && local50.aBoolean277) {
						local68 = arg6[arg10 - 1][arg1 - 1];
						local84 = arg11[arg10 - 1][arg1 - 1] * 2 + 4 & 0x7;
						local89 = Static106.method2242(arg5, local50);
						if (Static380.aBooleanArrayArray5[local68][local84]) {
							Static48.anIntArray72[0] = local50.anInt3550;
							Static343.anIntArray448[0] = local89;
							Static297.anIntArray371[0] = arg5.method5289() ? local50.anInt3546 : local50.anInt3545;
							Static334.anIntArray445[0] = local50.anInt3548;
							Static475.anIntArray579[0] = local50.anInt3549;
							Static163.anIntArray230[0] = 256;
						}
					}
				}
			}
			if (arg8 - 1 > arg10) {
				local37 = arg0[arg10 + 1][arg1 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass209_4.method5515(local37 - 1);
					if (local50.anInt3550 != -1 && local50.aBoolean277) {
						local68 = arg6[arg10 + 1][arg1 - 1];
						local84 = arg11[arg10 + 1][arg1 - 1] * 2 + 6 & 0x7;
						local89 = Static106.method2242(arg5, local50);
						if (Static380.aBooleanArrayArray5[local68][local84]) {
							Static48.anIntArray72[2] = local50.anInt3550;
							Static343.anIntArray448[2] = local89;
							Static297.anIntArray371[2] = arg5.method5289() ? local50.anInt3546 : local50.anInt3545;
							Static334.anIntArray445[2] = local50.anInt3548;
							Static475.anIntArray579[2] = local50.anInt3549;
							Static163.anIntArray230[2] = 512;
						}
					}
				}
			}
		}
		if (arg1 < arg2 - 1) {
			if (arg10 > 0) {
				local37 = arg0[arg10 - 1][arg1 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass209_4.method5515(local37 - 1);
					if (local50.anInt3550 != -1 && local50.aBoolean277) {
						local68 = arg6[arg10 - 1][arg1 + 1];
						local84 = arg11[arg10 - 1][arg1 + 1] * 2 + 2 & 0x7;
						local89 = Static106.method2242(arg5, local50);
						if (Static380.aBooleanArrayArray5[local68][local84]) {
							Static48.anIntArray72[6] = local50.anInt3550;
							Static343.anIntArray448[6] = local89;
							Static297.anIntArray371[6] = arg5.method5289() ? local50.anInt3546 : local50.anInt3545;
							Static334.anIntArray445[6] = local50.anInt3548;
							Static475.anIntArray579[6] = local50.anInt3549;
							Static163.anIntArray230[6] = 64;
						}
					}
				}
			}
			if (arg10 < arg8 - 1) {
				local37 = arg0[arg10 + 1][arg1 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass209_4.method5515(local37 - 1);
					if (local50.anInt3550 != -1 && local50.aBoolean277) {
						local68 = arg6[arg10 + 1][arg1 + 1];
						local84 = arg11[arg10 + 1][arg1 + 1] * 2 & 0x7;
						local89 = Static106.method2242(arg5, local50);
						if (Static380.aBooleanArrayArray5[local68][local84]) {
							Static48.anIntArray72[4] = local50.anInt3550;
							Static343.anIntArray448[4] = local89;
							Static297.anIntArray371[4] = arg5.method5289() ? local50.anInt3546 : local50.anInt3545;
							Static334.anIntArray445[4] = local50.anInt3548;
							Static475.anIntArray579[4] = local50.anInt3549;
							Static163.anIntArray230[4] = 128;
						}
					}
				}
			}
		}
		@Pc(520) int local520;
		@Pc(525) int local525;
		@Pc(527) int local527;
		@Pc(509) byte local509;
		if (arg1 > 0) {
			local37 = arg0[arg10][arg1 - 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass209_4.method5515(local37 - 1);
				if (local50.anInt3550 != -1) {
					local68 = arg6[arg10][arg1 - 1];
					local509 = arg11[arg10][arg1 - 1];
					if (local50.aBoolean277) {
						local89 = 2;
						local520 = local509 * 2 + 4;
						local525 = Static106.method2242(arg5, local50);
						for (local527 = 0; local527 < 3; local527++) {
							local520 &= 0x7;
							local89 &= 0x7;
							if (Static380.aBooleanArrayArray5[local68][local520] && Static475.anIntArray579[local89] <= local50.anInt3549) {
								Static48.anIntArray72[local89] = local50.anInt3550;
								Static343.anIntArray448[local89] = local525;
								Static297.anIntArray371[local89] = arg5.method5289() ? local50.anInt3546 : local50.anInt3545;
								Static334.anIntArray445[local89] = local50.anInt3548;
								if (local50.anInt3549 == Static475.anIntArray579[local89]) {
									Static163.anIntArray230[local89] |= 0x20;
								} else {
									Static163.anIntArray230[local89] = 32;
								}
								Static475.anIntArray579[local89] = local50.anInt3549;
							}
							local520++;
							local89--;
						}
						if (!local18[arg4 & 0x3]) {
							arg7[0] = Static511.aBooleanArrayArray6[local68][local509 + 2 & 0x3];
						}
					} else if (!local18[arg4 & 0x3]) {
						arg7[0] = Static377.aBooleanArrayArray4[local68][local509 + 2 & 0x3];
					}
				}
			}
		}
		if (arg2 - 1 > arg1) {
			local37 = arg0[arg10][arg1 + 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass209_4.method5515(local37 - 1);
				if (local50.anInt3550 != -1) {
					local68 = arg6[arg10][arg1 + 1];
					local509 = arg11[arg10][arg1 + 1];
					if (local50.aBoolean277) {
						local89 = 4;
						local520 = local509 * 2 + 2;
						local525 = Static106.method2242(arg5, local50);
						for (local527 = 0; local527 < 3; local527++) {
							local89 &= 0x7;
							local520 &= 0x7;
							if (Static380.aBooleanArrayArray5[local68][local520] && local50.anInt3549 >= Static475.anIntArray579[local89]) {
								Static48.anIntArray72[local89] = local50.anInt3550;
								Static343.anIntArray448[local89] = local525;
								Static297.anIntArray371[local89] = arg5.method5289() ? local50.anInt3546 : local50.anInt3545;
								Static334.anIntArray445[local89] = local50.anInt3548;
								if (Static475.anIntArray579[local89] == local50.anInt3549) {
									Static163.anIntArray230[local89] |= 0x10;
								} else {
									Static163.anIntArray230[local89] = 16;
								}
								Static475.anIntArray579[local89] = local50.anInt3549;
							}
							local89++;
							local520--;
						}
						if (!local18[arg4 + 2 & 0x3]) {
							arg7[2] = Static511.aBooleanArrayArray6[local68][local509 & 0x3];
						}
					} else if (!local18[arg4 + 2 & 0x3]) {
						arg7[2] = Static377.aBooleanArrayArray4[local68][local509 & 0x3];
					}
				}
			}
		}
		if (arg10 > 0) {
			local37 = arg0[arg10 - 1][arg1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass209_4.method5515(local37 - 1);
				if (local50.anInt3550 != -1) {
					local68 = arg6[arg10 - 1][arg1];
					local509 = arg11[arg10 - 1][arg1];
					if (local50.aBoolean277) {
						local89 = 6;
						local520 = local509 * 2 + 4;
						local525 = Static106.method2242(arg5, local50);
						for (local527 = 0; local527 < 3; local527++) {
							local520 &= 0x7;
							local89 &= 0x7;
							if (Static380.aBooleanArrayArray5[local68][local520] && local50.anInt3549 >= Static475.anIntArray579[local89]) {
								Static48.anIntArray72[local89] = local50.anInt3550;
								Static343.anIntArray448[local89] = local525;
								Static297.anIntArray371[local89] = arg5.method5289() ? local50.anInt3546 : local50.anInt3545;
								Static334.anIntArray445[local89] = local50.anInt3548;
								if (local50.anInt3549 == Static475.anIntArray579[local89]) {
									Static163.anIntArray230[local89] |= 0x8;
								} else {
									Static163.anIntArray230[local89] = 8;
								}
								Static475.anIntArray579[local89] = local50.anInt3549;
							}
							local520--;
							local89++;
						}
						if (!local18[arg4 + 3 & 0x3]) {
							arg7[3] = Static511.aBooleanArrayArray6[local68][local509 + 1 & 0x3];
						}
					} else if (!local18[arg4 + 3 & 0x3]) {
						arg7[3] = Static377.aBooleanArrayArray4[local68][local509 + 1 & 0x3];
					}
				}
			}
		}
		if (arg10 < arg8 - 1) {
			local37 = arg0[arg10 + 1][arg1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass209_4.method5515(local37 - 1);
				if (local50.anInt3550 != -1) {
					local68 = arg6[arg10 + 1][arg1];
					local509 = arg11[arg10 + 1][arg1];
					if (local50.aBoolean277) {
						local89 = 4;
						local520 = local509 * 2 + 6;
						local525 = Static106.method2242(arg5, local50);
						for (local527 = 0; local527 < 3; local527++) {
							local520 &= 0x7;
							local89 &= 0x7;
							if (Static380.aBooleanArrayArray5[local68][local520] && local50.anInt3549 >= Static475.anIntArray579[local89]) {
								Static48.anIntArray72[local89] = local50.anInt3550;
								Static343.anIntArray448[local89] = local525;
								Static297.anIntArray371[local89] = arg5.method5289() ? local50.anInt3546 : local50.anInt3545;
								Static334.anIntArray445[local89] = local50.anInt3548;
								if (local50.anInt3549 == Static475.anIntArray579[local89]) {
									Static163.anIntArray230[local89] |= 0x4;
								} else {
									Static163.anIntArray230[local89] = 4;
								}
								Static475.anIntArray579[local89] = local50.anInt3549;
							}
							local520++;
							local89--;
						}
						if (!local18[arg4 + 1 & 0x3]) {
							arg7[1] = Static511.aBooleanArrayArray6[local68][local509 + 3 & 0x3];
						}
					} else if (!local18[arg4 + 1 & 0x3]) {
						arg7[1] = Static377.aBooleanArrayArray4[local68][local509 + 3 & 0x3];
					}
				}
			}
		}
		if (arg12 == null) {
			return;
		}
		local37 = Static106.method2242(arg5, arg12);
		if (!arg12.aBoolean277) {
			return;
		}
		for (@Pc(1225) int local1225 = 0; local1225 < 8; local1225++) {
			@Pc(1236) int local1236 = local1225 - arg4 * 2 & 0x7;
			if (Static380.aBooleanArrayArray5[arg9][local1225] && Static475.anIntArray579[local1236] <= arg12.anInt3549) {
				Static48.anIntArray72[local1236] = arg12.anInt3550;
				Static343.anIntArray448[local1236] = local37;
				Static297.anIntArray371[local1236] = arg5.method5289() ? arg12.anInt3546 : arg12.anInt3545;
				Static334.anIntArray445[local1236] = arg12.anInt3548;
				if (Static475.anIntArray579[local1236] == arg12.anInt3549) {
					Static163.anIntArray230[local1236] |= 0x2;
				} else {
					Static163.anIntArray230[local1236] = 2;
				}
				Static475.anIntArray579[local1236] = arg12.anInt3549;
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!d;Lclient!oa;IILclient!d;Lclient!d;[[I)V")
	private void method3656(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4 arg3, @OriginalArg(5) Class4 arg4, @OriginalArg(6) int[][] arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4301; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt4297; local11++) {
				if (Static521.anInt9520 == -1 || Static194.method3317(arg2, Static521.anInt9520, local11, local7)) {
					@Pc(37) byte local37 = this.aByteArrayArrayArray17[arg2][local7][local11];
					@Pc(46) byte local46 = this.aByteArrayArrayArray16[arg2][local7][local11];
					@Pc(57) int local57 = this.aByteArrayArrayArray15[arg2][local7][local11] & 0xFF;
					@Pc(68) int local68 = this.aByteArrayArrayArray13[arg2][local7][local11] & 0xFF;
					@Pc(80) Class128 local80 = local57 == 0 ? null : this.aClass209_4.method5515(local57 - 1);
					@Pc(92) Class159 local92 = local68 == 0 ? null : this.aClass131_3.method3146(local68 - 1);
					@Pc(94) int local94 = 0;
					@Pc(96) int local96 = 0;
					if (local37 != 0) {
						local94 = local92 == null ? 0 : Static556.anIntArray658[local37];
						local96 = local80 == null ? 0 : Static2.anIntArray1[local37];
					} else if (local80 != null) {
						local96 = Static2.anIntArray1[local37];
					} else if (local92 != null) {
						local94 = Static2.anIntArray1[local37];
					}
					@Pc(137) int local137 = local94 + local96;
					@Pc(139) int local139 = 0;
					if (local137 != 0) {
						@Pc(144) int[] local144 = new int[local137];
						@Pc(147) int[] local147 = new int[local137];
						@Pc(150) int[] local150 = new int[local137];
						@Pc(153) int[] local153 = new int[local137];
						@Pc(155) boolean local155 = false;
						@Pc(180) int local180;
						@Pc(186) int local186;
						if (local80 == null || local80.anInt3550 == -1 && local80.anInt3540 == -1 && local80.anInt3546 == -1) {
							for (local180 = 0; local180 < local96; local180++) {
								local144[local139] = -1;
								local139++;
							}
						} else {
							local180 = arg1.method5289() ? local80.anInt3546 : local80.anInt3545;
							if (Static197.aBoolean301) {
								local180 = -1;
							}
							for (local186 = 0; local186 < local96; local186++) {
								local150[local139] = local180;
								local153[local139] = local80.anInt3548;
								if (local80.anInt3550 == -1) {
									local144[local139] = -1;
								} else {
									local144[local139] = local80.anInt3550;
								}
								if (local80.anInt3540 == -1) {
									local147[local139] = -1;
								} else {
									local147[local139] = local80.anInt3540;
									local155 = true;
								}
								local139++;
							}
							if (!this.aBoolean335 && arg2 == 0) {
								Static311.method5199(local7, local11, local80.anInt3538, local80.anInt3539 * 8, local80.anInt3547);
							}
						}
						if (!local155) {
							local147 = null;
						}
						if (local92 == null) {
							for (local180 = 0; local180 < local94; local180++) {
								local144[local139] = -1;
								local139++;
							}
						} else {
							local180 = local92.anInt4472;
							if (Static197.aBoolean301) {
								local180 = -1;
							}
							for (local186 = 0; local186 < local94; local186++) {
								local150[local139] = local180;
								local153[local139] = local92.anInt4474;
								local144[local139] = arg5[local7][local11];
								if (local147 != null) {
									local147[local139] = -1;
								}
								local139++;
							}
						}
						local180 = this.anIntArray282.length;
						@Pc(339) int[] local339 = new int[local180];
						@Pc(342) int[] local342 = new int[local180];
						@Pc(349) int[] local349 = arg0 == null ? null : new int[local180];
						@Pc(358) int[] local358 = arg0 == null && arg4 == null ? null : new int[local180];
						@Pc(367) int local367;
						@Pc(372) int local372;
						@Pc(452) int local452;
						@Pc(458) int local458;
						for (@Pc(360) int local360 = 0; local360 < local180; local360++) {
							local367 = this.anIntArray282[local360];
							local372 = this.anIntArray281[local360];
							if (local46 == 0) {
								local339[local360] = local367;
								local342[local360] = local372;
							} else if (local46 == 1) {
								local339[local360] = local372;
								local342[local360] = 512 - local367;
							} else if (local46 == 2) {
								local339[local360] = 512 - local367;
								local342[local360] = 512 - local372;
							} else if (local46 == 3) {
								local339[local360] = 512 - local372;
								local342[local360] = local367;
							}
							if (local349 != null && Static380.aBooleanArrayArray5[local37][local360]) {
								local452 = local367 + (local7 << 9);
								local458 = local367 + (local11 << 9);
								local349[local360] = arg0.sa(local452, local458) - arg3.sa(local452, local458);
							}
							if (local358 != null) {
								if (arg0 != null && !Static380.aBooleanArrayArray5[local37][local360]) {
									local452 = (local7 << 9) + local367;
									local458 = (local11 << 9) + local367;
									local358[local360] = arg3.sa(local452, local458) - arg0.sa(local452, local458);
								} else if (arg4 != null && !Static42.aBooleanArrayArray1[local37][local360]) {
									local452 = local367 + (local7 << 9);
									local458 = local367 + (local11 << 9);
									local358[local360] = arg4.sa(local452, local458) - arg3.sa(local452, local458);
								}
							}
						}
						local367 = arg3.JA(local7, local11);
						local372 = arg3.JA(local7 + 1, local11);
						local452 = arg3.JA(local7 + 1, local11 - -1);
						local458 = arg3.JA(local7, local11 + 1);
						if (arg2 > 0) {
							@Pc(578) boolean local578 = true;
							if (local68 == 0 && local37 != 0) {
								local578 = false;
							}
							if (local57 > 0 && local80 != null && !local80.aBoolean276) {
								local578 = false;
							}
							if (local578 && local372 == local367 && local452 == local367 && local367 == local458) {
								this.aByteArrayArrayArray14[arg2][local7][local11] = (byte) (this.aByteArrayArrayArray14[arg2][local7][local11] | 0x4);
							}
						}
						@Pc(629) int local629 = 0;
						@Pc(631) int local631 = 0;
						@Pc(633) int local633 = 0;
						if (this.aBoolean335) {
							local629 = Static69.method1732(local7, local11);
							local631 = Static24.method891(local7, local11);
							local633 = Static340.method5816(local7, local11);
						}
						arg3.method8444(local7, local11, local339, local349, local342, local358, Static375.anIntArrayArray59[local37], Static25.anIntArrayArray8[local37], Static219.anIntArrayArray33[local37], local144, local147, local150, local153, local629, local631, local633);
						Static513.method358(arg2, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[[[I[Lclient!wca;Lclient!oa;)V")
	public final void method3657(@OriginalArg(1) int[][][] arg0, @OriginalArg(2) Class350[] arg1, @OriginalArg(3) Class15 arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean335) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt4301; local10++) {
					for (local14 = 0; local14 < this.anInt4297; local14++) {
						if ((Static576.aByteArrayArrayArray21[local6][local10][local14] & 0x1) != 0) {
							@Pc(28) int local28 = local6;
							if ((Static576.aByteArrayArrayArray21[1][local10][local14] & 0x2) != 0) {
								local28 = local6 - 1;
							}
							if (local28 >= 0) {
								arg1[local28].method8219(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt4295; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean335) {
				if (Static553.aBoolean825) {
					local14 = 8;
				}
				if (Static370.aBoolean617) {
					local10 = 2;
				}
				if (Static514.anInt9447 != 0) {
					if (Static554.aBoolean827 | local6 == 0) {
						local14 |= 0x10;
					}
					local10 |= 0x1;
				}
			}
			if (Static370.aBoolean617) {
				local14 |= 0x7;
			}
			if (!Static102.aBoolean186) {
				local14 |= 0x20;
			}
			@Pc(158) int[][] local158 = arg0 == null || local6 >= arg0.length ? this.anIntArrayArrayArray8[local6] : arg0[local6];
			Static404.method6579(local6, arg2.method5354(this.anInt4301, this.anInt4297, this.anIntArrayArrayArray8[local6], local158, local10, local14));
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZIIIILclient!fd;IIII)V")
	private void method3658(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3_Sub7 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg6 == 1) {
			arg2 = 1;
		} else if (arg6 == 2) {
			arg9 = 1;
			arg2 = 1;
		} else if (arg6 == 3) {
			arg9 = 1;
		}
		@Pc(62) int local62;
		if (arg7 < 0 || this.anInt4301 <= arg7 || arg0 < 0 || arg0 >= this.anInt4297) {
			while (true) {
				local62 = arg5.method6538();
				if (local62 == 0) {
					return;
				}
				if (local62 == 1) {
					arg5.method6538();
					return;
				}
				if (local62 <= 49) {
					arg5.method6538();
				}
			}
			return;
		}
		if (!this.aBoolean335 && !arg1) {
			Static576.aByteArrayArrayArray21[arg3][arg7][arg0] = 0;
		}
		while (true) {
			local62 = arg5.method6538();
			if (local62 == 0) {
				if (this.aBoolean335) {
					this.anIntArrayArrayArray8[0][arg7 + arg9][arg0 + arg2] = 0;
					return;
				} else if (arg3 == 0) {
					this.anIntArrayArrayArray8[0][arg7 + arg9][arg0 + arg2] = -Static327.method5678(arg4 + 556238, arg8 + 932731) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray8[arg3][arg9 + arg7][arg0 + arg2] = this.anIntArrayArrayArray8[arg3 - 1][arg7 + arg9][arg2 + arg0] - 960;
					return;
				}
			}
			if (local62 == 1) {
				@Pc(191) int local191 = arg5.method6538();
				if (!this.aBoolean335) {
					if (local191 == 1) {
						local191 = 0;
					}
					if (arg3 == 0) {
						this.anIntArrayArrayArray8[0][arg7 + arg9][arg2 + arg0] = -local191 * 8 << 2;
						return;
					}
					this.anIntArrayArrayArray8[arg3][arg9 + arg7][arg2 + arg0] = this.anIntArrayArrayArray8[arg3 - 1][arg7 + arg9][arg2 + arg0] - (local191 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray8[0][arg9 + arg7][arg0 + arg2] = local191 * 8 << 2;
				return;
			}
			if (local62 <= 49) {
				if (arg1) {
					arg5.method6538();
				} else {
					this.aByteArrayArrayArray15[arg3][arg7][arg0] = arg5.method6529();
					this.aByteArrayArrayArray17[arg3][arg7][arg0] = (byte) ((local62 - 2) / 4);
					this.aByteArrayArrayArray16[arg3][arg7][arg0] = (byte) (local62 + arg6 - 2 & 0x3);
				}
			} else if (local62 <= 81) {
				if (!this.aBoolean335 && !arg1) {
					Static576.aByteArrayArrayArray21[arg3][arg7][arg0] = (byte) (local62 - 49);
				}
			} else if (!arg1) {
				this.aByteArrayArrayArray13[arg3][arg7][arg0] = (byte) (local62 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[[IZ)V")
	public final void method3659(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray8[0];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4301 + 1; local16++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt4297 + 1; local20++) {
				local10[local16][local20] += arg0[local16][local20];
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBLclient!fd;II[Lclient!wca;IIII)V")
	public final void method3660(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class350[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg8 & 0x7) * 8;
		@Pc(17) int local17 = (arg2 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean335) {
			@Pc(24) Class350 local24 = arg4[arg0];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static420.method6746(arg6, local26 & 0x7, local30 & 0x7) + arg3;
					local56 = Static48.method1241(arg6, local30 & 0x7, local26 & 0x7) + arg7;
					if (local44 > 0 && this.anInt4301 - 1 > local44 && local56 > 0 && this.anInt4297 - 1 > local56) {
						local24.method8217(local56, local44);
					}
				}
			}
		}
		@Pc(98) int local98 = (arg8 & 0x1FFFFFF8) << 3;
		local26 = (arg2 & 0xFFFFFFF8) << 3;
		@Pc(106) byte local106 = 0;
		@Pc(108) byte local108 = 0;
		if (arg6 == 1) {
			local108 = 1;
		} else if (arg6 == 2) {
			local108 = 1;
			local106 = 1;
		} else if (arg6 == 3) {
			local106 = 1;
		}
		for (local56 = 0; local56 < this.anInt4295; local56++) {
			for (@Pc(139) int local139 = 0; local139 < 64; local139++) {
				for (@Pc(143) int local143 = 0; local143 < 64; local143++) {
					if (local56 == arg5 && local139 >= local11 && local139 <= local11 + 8 && local17 <= local143 && local17 + 8 >= local143) {
						@Pc(220) int local220;
						@Pc(211) int local211;
						if (local139 == local11 + 8 || local143 == local17 + 8) {
							if (arg6 == 0) {
								local211 = local143 + arg7 - local17;
								local220 = arg3 + local139 - local11;
							} else if (arg6 == 1) {
								local220 = arg3 + local143 - local17;
								local211 = arg7 + local11 + 8 - local139;
							} else if (arg6 == 2) {
								local220 = arg3 + local11 + 8 - local139;
								local211 = arg7 + local17 + 8 - local143;
							} else {
								local211 = arg7 + local139 - local11;
								local220 = arg3 + local17 + 8 - local143;
							}
							this.method3658(local211, true, 0, arg0, local143 + local26, arg1, 0, local220, local98 + local139, 0);
						} else {
							local220 = Static420.method6746(arg6, local139 & 0x7, local143 & 0x7) + arg3;
							local211 = Static48.method1241(arg6, local143 & 0x7, local139 & 0x7) + arg7;
							this.method3658(local211, false, local108, arg0, local143 + local26, arg1, arg6, local220, local139 + local98, local106);
						}
						if (local139 == 63 || local143 == 63) {
							@Pc(342) byte local342 = 1;
							if (local139 == 63 && local143 == 63) {
								local342 = 3;
							}
							for (@Pc(352) int local352 = 0; local352 < local342; local352++) {
								@Pc(356) int local356 = local139;
								@Pc(358) int local358 = local143;
								if (local352 == 0) {
									local356 = local139 == 63 ? 64 : local139;
									local358 = local143 == 63 ? 64 : local143;
								} else if (local352 == 1) {
									local356 = 64;
								} else if (local352 == 2) {
									local358 = 64;
								}
								@Pc(410) int local410;
								@Pc(418) int local418;
								if (arg6 == 0) {
									local410 = arg3 + local356 - local11;
									local418 = local358 + arg7 - local17;
								} else if (arg6 == 1) {
									local410 = arg3 + local358 - local17;
									local418 = local11 + arg7 + 8 - local356;
								} else if (arg6 == 2) {
									local410 = arg3 + local11 + 8 - local356;
									local418 = arg7 + local17 + 8 - local358;
								} else {
									local418 = arg7 + local356 - local11;
									local410 = arg3 + local17 + 8 - local358;
								}
								if (local410 >= 0 && local410 < this.anInt4301 && local418 >= 0 && this.anInt4297 > local418) {
									this.anIntArrayArrayArray8[arg0][local410][local418] = this.anIntArrayArrayArray8[arg0][local220 + local106][local211 + local108];
								}
							}
						}
					} else {
						this.method3658(-1, false, 0, 0, 0, arg1, 0, -1, 0, 0);
					}
				}
			}
		}
	}
}
