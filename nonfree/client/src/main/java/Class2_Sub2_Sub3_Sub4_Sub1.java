import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class2_Sub2_Sub3_Sub4_Sub1 extends Class2_Sub2_Sub3_Sub4 {

	@OriginalMember(owner = "client!gf", name = "xb", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!gf", name = "yb", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!gf", name = "zb", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!gf", name = "Bb", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!gf", name = "Cb", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!gf", name = "Db", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!gf", name = "Eb", descriptor = "[I")
	private int[] anIntArray140;

	@OriginalMember(owner = "client!gf", name = "Fb", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!gf", name = "Gb", descriptor = "[I")
	private int[] anIntArray142;

	@OriginalMember(owner = "client!gf", name = "Hb", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!gf", name = "Ib", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!gf", name = "Jb", descriptor = "[I")
	private int[] anIntArray144;

	@OriginalMember(owner = "client!gf", name = "Lb", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!gf", name = "Kb", descriptor = "B")
	private byte aByte3 = 0;

	@OriginalMember(owner = "client!gf", name = "Mb", descriptor = "I")
	private int anInt1309 = 0;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub3_Sub4_Sub1() {
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!oe;IIIII)V")
	public Class2_Sub2_Sub3_Sub4_Sub1(@OriginalArg(0) Class2_Sub2_Sub3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method2035();
		arg0.method2030();
		super.anInt1306 = arg0.anInt2501;
		super.anIntArray134 = arg0.anIntArray235;
		super.anIntArray132 = arg0.anIntArray228;
		super.anIntArray133 = arg0.anIntArray230;
		super.anInt1305 = arg0.anInt2500;
		this.anIntArray139 = arg0.anIntArray229;
		this.anIntArray143 = arg0.anIntArray233;
		this.anIntArray142 = arg0.anIntArray231;
		this.aByteArray15 = arg0.aByteArray37;
		this.aByteArray14 = arg0.aByteArray43;
		this.aByte3 = arg0.aByte7;
		super.anIntArrayArray12 = arg0.anIntArrayArray25;
		super.anIntArrayArray13 = arg0.anIntArrayArray26;
		@Pc(78) int local78 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(84) int local84 = arg2 * local78 >> 8;
		this.anIntArray140 = new int[super.anInt1305];
		this.anIntArray144 = new int[super.anInt1305];
		this.anIntArray137 = new int[super.anInt1305];
		@Pc(109) int local109;
		if (arg0.aShortArray25 == null) {
			this.aShortArray4 = null;
		} else {
			this.aShortArray4 = new short[super.anInt1305];
			for (local109 = 0; local109 < super.anInt1305; local109++) {
				@Pc(115) short local115 = arg0.aShortArray25[local109];
				if (local115 != -1 && Static109.anInterface1_2.method193(local115)) {
					this.aShortArray4[local109] = local115;
				} else {
					this.aShortArray4[local109] = -1;
				}
			}
		}
		@Pc(286) int local286;
		if (arg0.anInt2498 > 0 && arg0.aByteArray36 != null) {
			@Pc(153) int[] local153 = new int[arg0.anInt2498];
			for (@Pc(155) int local155 = 0; local155 < super.anInt1305; local155++) {
				if (arg0.aByteArray36[local155] != -1) {
					local153[arg0.aByteArray36[local155] & 0xFF]++;
				}
			}
			this.anInt1309 = 0;
			for (@Pc(184) int local184 = 0; local184 < arg0.anInt2498; local184++) {
				if (local153[local184] > 0 && arg0.aByteArray44[local184] == 0) {
					this.anInt1309++;
				}
			}
			this.anIntArray136 = new int[this.anInt1309];
			this.anIntArray138 = new int[this.anInt1309];
			this.anIntArray141 = new int[this.anInt1309];
			@Pc(222) int local222 = 0;
			for (@Pc(224) int local224 = 0; local224 < arg0.anInt2498; local224++) {
				if (local153[local224] > 0 && arg0.aByteArray44[local224] == 0) {
					this.anIntArray136[local222] = arg0.aShortArray28[local224] & 0xFFFF;
					this.anIntArray138[local222] = arg0.aShortArray29[local224] & 0xFFFF;
					this.anIntArray141[local222] = arg0.aShortArray24[local224] & 0xFFFF;
					local153[local224] = local222++;
				} else {
					local153[local224] = -1;
				}
			}
			this.aByteArray16 = new byte[super.anInt1305];
			for (local286 = 0; local286 < super.anInt1305; local286++) {
				if (arg0.aByteArray36[local286] == -1) {
					this.aByteArray16[local286] = -1;
				} else {
					this.aByteArray16[local286] = (byte) local153[arg0.aByteArray36[local286] & 0xFF];
					if (this.aByteArray16[local286] == -1 && this.aShortArray4 != null) {
						this.aShortArray4[local286] = -1;
					}
				}
			}
		}
		for (local109 = 0; local109 < super.anInt1305; local109++) {
			@Pc(339) byte local339;
			if (arg0.aByteArray38 == null) {
				local339 = 0;
			} else {
				local339 = arg0.aByteArray38[local109];
			}
			@Pc(350) byte local350;
			if (arg0.aByteArray43 == null) {
				local350 = 0;
			} else {
				local350 = arg0.aByteArray43[local109];
			}
			@Pc(361) short local361;
			if (this.aShortArray4 == null) {
				local361 = -1;
			} else {
				local361 = this.aShortArray4[local109];
			}
			if (local350 == -2) {
				local339 = 3;
			}
			if (local350 == -1) {
				local339 = 2;
			}
			@Pc(408) Class38 local408;
			@Pc(569) Class12 local569;
			if (local361 == -1) {
				if (local339 == 0) {
					@Pc(389) int local389 = arg0.aShortArray30[local109] & 0xFFFF;
					if (arg0.aClass38Array1 == null || arg0.aClass38Array1[this.anIntArray139[local109]] == null) {
						local408 = arg0.aClass38Array2[this.anIntArray139[local109]];
					} else {
						local408 = arg0.aClass38Array1[this.anIntArray139[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt1442 + arg4 * local408.anInt1441 + arg5 * local408.anInt1444) / (local84 * local408.anInt1439);
					this.anIntArray140[local109] = Static60.method1058(local389, local286);
					if (arg0.aClass38Array1 == null || arg0.aClass38Array1[this.anIntArray143[local109]] == null) {
						local408 = arg0.aClass38Array2[this.anIntArray143[local109]];
					} else {
						local408 = arg0.aClass38Array1[this.anIntArray143[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt1442 + arg4 * local408.anInt1441 + arg5 * local408.anInt1444) / (local84 * local408.anInt1439);
					this.anIntArray144[local109] = Static60.method1058(local389, local286);
					if (arg0.aClass38Array1 == null || arg0.aClass38Array1[this.anIntArray142[local109]] == null) {
						local408 = arg0.aClass38Array2[this.anIntArray142[local109]];
					} else {
						local408 = arg0.aClass38Array1[this.anIntArray142[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt1442 + arg4 * local408.anInt1441 + arg5 * local408.anInt1444) / (local84 * local408.anInt1439);
					this.anIntArray137[local109] = Static60.method1058(local389, local286);
				} else if (local339 == 1) {
					local569 = arg0.aClass12Array1[local109];
					local286 = arg1 + (arg3 * local569.anInt467 + arg4 * local569.anInt463 + arg5 * local569.anInt462) / (local84 + local84 / 2);
					this.anIntArray140[local109] = Static60.method1058(arg0.aShortArray30[local109] & 0xFFFF, local286);
					this.anIntArray137[local109] = -1;
				} else if (local339 == 3) {
					this.anIntArray140[local109] = 128;
					this.anIntArray137[local109] = -1;
				} else {
					this.anIntArray137[local109] = -2;
				}
			} else if (local339 == 0) {
				if (arg0.aClass38Array1 == null || arg0.aClass38Array1[this.anIntArray139[local109]] == null) {
					local408 = arg0.aClass38Array2[this.anIntArray139[local109]];
				} else {
					local408 = arg0.aClass38Array1[this.anIntArray139[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt1442 + arg4 * local408.anInt1441 + arg5 * local408.anInt1444) / (local84 * local408.anInt1439);
				this.anIntArray140[local109] = Static60.method1067(local286);
				if (arg0.aClass38Array1 == null || arg0.aClass38Array1[this.anIntArray143[local109]] == null) {
					local408 = arg0.aClass38Array2[this.anIntArray143[local109]];
				} else {
					local408 = arg0.aClass38Array1[this.anIntArray143[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt1442 + arg4 * local408.anInt1441 + arg5 * local408.anInt1444) / (local84 * local408.anInt1439);
				this.anIntArray144[local109] = Static60.method1067(local286);
				if (arg0.aClass38Array1 == null || arg0.aClass38Array1[this.anIntArray142[local109]] == null) {
					local408 = arg0.aClass38Array2[this.anIntArray142[local109]];
				} else {
					local408 = arg0.aClass38Array1[this.anIntArray142[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt1442 + arg4 * local408.anInt1441 + arg5 * local408.anInt1444) / (local84 * local408.anInt1439);
				this.anIntArray137[local109] = Static60.method1067(local286);
			} else if (local339 == 1) {
				local569 = arg0.aClass12Array1[local109];
				local286 = arg1 + (arg3 * local569.anInt467 + arg4 * local569.anInt463 + arg5 * local569.anInt462) / (local84 + local84 / 2);
				this.anIntArray140[local109] = Static60.method1067(local286);
				this.anIntArray137[local109] = -1;
			} else {
				this.anIntArray137[local109] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "([Lclient!gf;I)V")
	private Class2_Sub2_Sub3_Sub4_Sub1(@OriginalArg(0) Class2_Sub2_Sub3_Sub4_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		super.anInt1306 = 0;
		super.anInt1305 = 0;
		this.anInt1309 = 0;
		this.aByte3 = -1;
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			@Pc(34) Class2_Sub2_Sub3_Sub4_Sub1 local34 = arg0[local29];
			if (local34 != null) {
				super.anInt1306 += local34.anInt1306;
				super.anInt1305 += local34.anInt1305;
				this.anInt1309 += local34.anInt1309;
				if (local34.aByteArray15 == null) {
					if (this.aByte3 == -1) {
						this.aByte3 = local34.aByte3;
					}
					if (this.aByte3 != local34.aByte3) {
						local9 = true;
					}
				} else {
					local9 = true;
				}
				local11 |= local34.aByteArray14 != null;
				local13 |= local34.aShortArray4 != null;
				local15 |= local34.aByteArray16 != null;
			}
		}
		super.anIntArray134 = new int[super.anInt1306];
		super.anIntArray132 = new int[super.anInt1306];
		super.anIntArray133 = new int[super.anInt1306];
		this.anIntArray139 = new int[super.anInt1305];
		this.anIntArray143 = new int[super.anInt1305];
		this.anIntArray142 = new int[super.anInt1305];
		this.anIntArray140 = new int[super.anInt1305];
		this.anIntArray144 = new int[super.anInt1305];
		this.anIntArray137 = new int[super.anInt1305];
		if (local9) {
			this.aByteArray15 = new byte[super.anInt1305];
		}
		if (local11) {
			this.aByteArray14 = new byte[super.anInt1305];
		}
		if (local13) {
			this.aShortArray4 = new short[super.anInt1305];
		}
		if (local15) {
			this.aByteArray16 = new byte[super.anInt1305];
		}
		if (this.anInt1309 > 0) {
			this.anIntArray136 = new int[this.anInt1309];
			this.anIntArray138 = new int[this.anInt1309];
			this.anIntArray141 = new int[this.anInt1309];
		}
		super.anInt1306 = 0;
		super.anInt1305 = 0;
		this.anInt1309 = 0;
		for (@Pc(211) int local211 = 0; local211 < arg1; local211++) {
			@Pc(216) Class2_Sub2_Sub3_Sub4_Sub1 local216 = arg0[local211];
			if (local216 != null) {
				for (@Pc(220) int local220 = 0; local220 < local216.anInt1305; local220++) {
					this.anIntArray139[super.anInt1305] = local216.anIntArray139[local220] + super.anInt1306;
					this.anIntArray143[super.anInt1305] = local216.anIntArray143[local220] + super.anInt1306;
					this.anIntArray142[super.anInt1305] = local216.anIntArray142[local220] + super.anInt1306;
					this.anIntArray140[super.anInt1305] = local216.anIntArray140[local220];
					this.anIntArray144[super.anInt1305] = local216.anIntArray144[local220];
					this.anIntArray137[super.anInt1305] = local216.anIntArray137[local220];
					if (local9) {
						if (local216.aByteArray15 == null) {
							this.aByteArray15[super.anInt1305] = local216.aByte3;
						} else {
							this.aByteArray15[super.anInt1305] = local216.aByteArray15[local220];
						}
					}
					if (local11 && local216.aByteArray14 != null) {
						this.aByteArray14[super.anInt1305] = local216.aByteArray14[local220];
					}
					if (local13) {
						if (local216.aShortArray4 == null) {
							this.aShortArray4[super.anInt1305] = -1;
						} else {
							this.aShortArray4[super.anInt1305] = local216.aShortArray4[local220];
						}
					}
					if (local15) {
						if (local216.aByteArray16 == null || local216.aByteArray16[local220] == -1) {
							this.aByteArray16[super.anInt1305] = -1;
						} else {
							this.aByteArray16[super.anInt1305] = (byte) (local216.aByteArray16[local220] + this.anInt1309);
						}
					}
					super.anInt1305++;
				}
				for (@Pc(385) int local385 = 0; local385 < local216.anInt1309; local385++) {
					this.anIntArray136[this.anInt1309] = local216.anIntArray136[local385] + super.anInt1306;
					this.anIntArray138[this.anInt1309] = local216.anIntArray138[local385] + super.anInt1306;
					this.anIntArray141[this.anInt1309] = local216.anIntArray141[local385] + super.anInt1306;
					this.anInt1309++;
				}
				for (@Pc(435) int local435 = 0; local435 < local216.anInt1306; local435++) {
					super.anIntArray134[super.anInt1306] = local216.anIntArray134[local435];
					super.anIntArray132[super.anInt1306] = local216.anIntArray132[local435];
					super.anIntArray133[super.anInt1306] = local216.anIntArray133[local435];
					super.anInt1306++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!super.aBoolean54) {
			this.method1042();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (super.aShort18 * arg2 + super.aShort19 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-super.aShort18 * arg2 + super.aShort34 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + super.aShort18 << 9;
		if (local78 / local38 <= Static109.anInt2286) {
			return;
		}
		@Pc(91) int local91 = local71 - super.aShort18 << 9;
		if (local91 / local38 >= Static109.anInt2282) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (super.aShort18 * arg1 + super.aShort19 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static109.anInt2284) {
			return;
		}
		@Pc(146) int local146 = local107 + (-super.aShort18 * arg1 + super.aShort34 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static109.anInt2280) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt1309 > 0;
		@Pc(172) int local172 = Static109.anInt2279;
		@Pc(174) int local174 = Static109.anInt2281;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Static60.anIntArray158[arg0];
			local178 = Static60.anIntArray154[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		@Pc(240) int local240;
		if (arg8 > 0L && Static166.aBoolean53 && local57 > 0) {
			if (local71 > 0) {
				local204 = local91 / local38;
				local208 = local78 / local57;
			} else {
				local204 = local91 / local57;
				local208 = local78 / local38;
			}
			if (local107 > 0) {
				local223 = local146 / local38;
				local227 = local123 / local57;
			} else {
				local223 = local146 / local57;
				local227 = local123 / local38;
			}
			local240 = Static166.anInt1308 - Static109.anInt2279;
			@Pc(244) int local244 = Static166.anInt1307 - Static109.anInt2281;
			if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(307) int[] local307 = new int[] { super.aShort20, super.aShort14, super.aShort20, super.aShort14, super.aShort20, super.aShort14, super.aShort20, super.aShort14 };
				@Pc(350) int[] local350 = new int[] { super.aShort16, super.aShort16, super.aShort15, super.aShort15, super.aShort16, super.aShort16, super.aShort15, super.aShort15 };
				@Pc(393) int[] local393 = new int[] { super.aShort34, super.aShort34, super.aShort34, super.aShort34, super.aShort19, super.aShort19, super.aShort19, super.aShort19 };
				for (@Pc(395) int local395 = 0; local395 < 8; local395++) {
					@Pc(400) int local400 = local307[local395];
					@Pc(404) int local404 = local393[local395];
					@Pc(408) int local408 = local350[local395];
					@Pc(420) int local420;
					if (arg0 != 0) {
						local420 = local408 * local176 + local400 * local178 >> 16;
						local408 = local408 * local178 - local400 * local176 >> 16;
						local400 = local420;
					}
					local400 += arg5;
					local404 += arg6;
					local408 += arg7;
					local420 = local408 * arg3 + local400 * arg4 >> 16;
					local408 = local408 * arg4 - local400 * arg3 >> 16;
					local400 = local420;
					local420 = local404 * arg2 - local408 * arg1 >> 16;
					local408 = local404 * arg1 + local408 * arg2 >> 16;
					if (local408 > 0) {
						@Pc(496) int local496 = (local400 << 9) / local408;
						@Pc(502) int local502 = (local420 << 9) / local408;
						if (local496 < local204) {
							local204 = local496;
						}
						if (local496 > local208) {
							local208 = local496;
						}
						if (local502 < local223) {
							local223 = local502;
						}
						if (local502 > local227) {
							local227 = local502;
						}
					}
				}
				if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
					if (super.aBoolean52) {
						Static166.aLongArray8[Static166.anInt1304++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < super.anInt1306; local204++) {
			local223 = super.anIntArray134[local204];
			local208 = super.anIntArray132[local204];
			local227 = super.anIntArray133[local204];
			if (arg0 != 0) {
				local240 = local227 * local176 + local223 * local178 >> 16;
				local227 = local227 * local178 - local223 * local176 >> 16;
				local223 = local240;
			}
			local223 += arg5;
			local208 += arg6;
			local227 += arg7;
			local240 = local227 * arg3 + local223 * arg4 >> 16;
			local227 = local227 * arg4 - local223 * arg3 >> 16;
			local223 = local240;
			local240 = local208 * arg2 - local227 * arg1 >> 16;
			local227 = local208 * arg1 + local227 * arg2 >> 16;
			Static60.anIntArray160[local204] = local227 - local24;
			if (local227 >= 50) {
				Static60.anIntArray162[local204] = local172 + (local223 << 9) / local227;
				Static60.anIntArray151[local204] = local174 + (local240 << 9) / local227;
			} else {
				Static60.anIntArray162[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static60.anIntArray161[local204] = local223;
				Static60.anIntArray155[local204] = local240;
				Static60.anIntArray146[local204] = local227;
			}
		}
		try {
			this.method1062(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(720) Exception local720) {
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!td;ILclient!td;I[I)V")
	@Override
	public void method1054(@OriginalArg(0) Class2_Sub2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1056(arg0, arg1);
			return;
		}
		@Pc(18) Class83 local18 = arg0.aClass83Array1[arg1];
		@Pc(23) Class83 local23 = arg2.aClass83Array1[arg3];
		@Pc(26) Class2_Sub9 local26 = local18.aClass2_Sub9_1;
		Static60.anInt1312 = 0;
		Static60.anInt1311 = 0;
		Static60.anInt1310 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		for (@Pc(41) int local41 = 0; local41 < local18.anInt3747; local41++) {
			@Pc(47) short local47 = local18.aShortArray40[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray166[local47] == 0) {
				if (local18.aShortArray45[local41] != -1) {
					this.method1061(0, local26.anIntArrayArray16[local18.aShortArray45[local41]], 0, 0, 0);
				}
				this.method1061(local26.anIntArray166[local47], local26.anIntArrayArray16[local47], local18.aShortArray44[local41], local18.aShortArray46[local41], local18.aShortArray43[local41]);
			}
		}
		Static60.anInt1312 = 0;
		Static60.anInt1311 = 0;
		Static60.anInt1310 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (@Pc(125) int local125 = 0; local125 < local23.anInt3747; local125++) {
			@Pc(131) short local131 = local23.aShortArray40[local125];
			while (local131 > local39) {
				local39 = arg4[local37++];
			}
			if (local131 == local39 || local26.anIntArray166[local131] == 0) {
				if (local23.aShortArray45[local125] != -1) {
					this.method1061(0, local26.anIntArrayArray16[local23.aShortArray45[local125]], 0, 0, 0);
				}
				this.method1061(local26.anIntArray166[local131], local26.anIntArrayArray16[local131], local23.aShortArray44[local125], local23.aShortArray46[local125], local23.aShortArray43[local125]);
			}
		}
		super.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method1055(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			this.method1042();
			@Pc(3) int local3 = Static109.anInt2279;
			@Pc(5) int local5 = Static109.anInt2281;
			@Pc(9) int local9 = Static60.anIntArray158[0];
			@Pc(13) int local13 = Static60.anIntArray154[0];
			@Pc(17) int local17 = Static60.anIntArray158[arg0];
			@Pc(21) int local21 = Static60.anIntArray154[arg0];
			@Pc(25) int local25 = Static60.anIntArray158[arg1];
			@Pc(29) int local29 = Static60.anIntArray154[arg1];
			@Pc(33) int local33 = Static60.anIntArray158[arg2];
			@Pc(37) int local37 = Static60.anIntArray154[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt1306; local49++) {
				@Pc(55) int local55 = super.anIntArray134[local49];
				@Pc(60) int local60 = super.anIntArray132[local49];
				@Pc(65) int local65 = super.anIntArray133[local49];
				@Pc(77) int local77;
				if (arg1 != 0) {
					local77 = local60 * local25 + local55 * local29 >> 16;
					local60 = local60 * local29 - local55 * local25 >> 16;
					local55 = local77;
				}
				if (arg0 != 0) {
					local77 = local65 * local17 + local55 * local21 >> 16;
					local65 = local65 * local21 - local55 * local17 >> 16;
					local55 = local77;
				}
				local55 += arg3;
				local60 += arg4;
				local65 += arg5;
				local77 = local60 * local37 - local65 * local33 >> 16;
				local65 = local60 * local33 + local65 * local37 >> 16;
				Static60.anIntArray160[local49] = local65 - local47;
				Static60.anIntArray162[local49] = local3 + (local55 << 9) / local65;
				Static60.anIntArray151[local49] = local5 + (local77 << 9) / local65;
				if (this.anInt1309 > 0) {
					Static60.anIntArray161[local49] = local55;
					Static60.anIntArray155[local49] = local77;
					Static60.anIntArray146[local49] = local65;
				}
			}
			this.method1062(false, false, 0L, super.aShort17, super.aShort17 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(IIIIIIII)Z")
	private boolean method1060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!td;I)V")
	@Override
	public void method1056(@OriginalArg(0) Class2_Sub2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (super.anIntArrayArray12 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class83 local12 = arg0.aClass83Array1[arg1];
		@Pc(15) Class2_Sub9 local15 = local12.aClass2_Sub9_1;
		Static60.anInt1312 = 0;
		Static60.anInt1311 = 0;
		Static60.anInt1310 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt3747; local23++) {
			@Pc(29) short local29 = local12.aShortArray40[local23];
			if (local12.aShortArray45[local23] != -1) {
				this.method1061(0, local15.anIntArrayArray16[local12.aShortArray45[local23]], 0, 0, 0);
			}
			this.method1061(local15.anIntArray166[local29], local15.anIntArrayArray16[local29], local12.aShortArray44[local23], local12.aShortArray46[local23], local12.aShortArray43[local23]);
		}
		super.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[IIII)V")
	private void method1061(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static60.anInt1312 = 0;
			Static60.anInt1311 = 0;
			Static60.anInt1310 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < super.anIntArrayArray12.length) {
					@Pc(29) int[] local29 = super.anIntArrayArray12[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static60.anInt1312 += super.anIntArray134[local36];
						Static60.anInt1311 += super.anIntArray132[local36];
						Static60.anInt1310 += super.anIntArray133[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static60.anInt1312 = Static60.anInt1312 / local6 + arg2;
				Static60.anInt1311 = Static60.anInt1311 / local6 + arg3;
				Static60.anInt1310 = Static60.anInt1310 / local6 + arg4;
			} else {
				Static60.anInt1312 = arg2;
				Static60.anInt1311 = arg3;
				Static60.anInt1310 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray12.length) {
					local115 = super.anIntArrayArray12[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray134[local31] += arg2;
						super.anIntArray132[local31] += arg3;
						super.anIntArray133[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray12.length) {
					local115 = super.anIntArrayArray12[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray134[local31] -= Static60.anInt1312;
						super.anIntArray132[local31] -= Static60.anInt1311;
						super.anIntArray133[local31] -= Static60.anInt1310;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(253) int local253;
						if (local225 != 0) {
							local231 = Static60.anIntArray158[local225];
							local235 = Static60.anIntArray154[local225];
							local253 = super.anIntArray132[local31] * local231 + super.anIntArray134[local31] * local235 + 32767 >> 16;
							super.anIntArray132[local31] = super.anIntArray132[local31] * local235 + 32767 - super.anIntArray134[local31] * local231 >> 16;
							super.anIntArray134[local31] = local253;
						}
						if (local36 != 0) {
							local231 = Static60.anIntArray158[local36];
							local235 = Static60.anIntArray154[local36];
							local253 = super.anIntArray132[local31] * local235 + 32767 - super.anIntArray133[local31] * local231 >> 16;
							super.anIntArray133[local31] = super.anIntArray132[local31] * local231 + super.anIntArray133[local31] * local235 + 32767 >> 16;
							super.anIntArray132[local31] = local253;
						}
						if (local219 != 0) {
							local231 = Static60.anIntArray158[local219];
							local235 = Static60.anIntArray154[local219];
							local253 = super.anIntArray133[local31] * local231 + super.anIntArray134[local31] * local235 + 32767 >> 16;
							super.anIntArray133[local31] = super.anIntArray133[local31] * local235 + 32767 - super.anIntArray134[local31] * local231 >> 16;
							super.anIntArray134[local31] = local253;
						}
						super.anIntArray134[local31] += Static60.anInt1312;
						super.anIntArray132[local31] += Static60.anInt1311;
						super.anIntArray133[local31] += Static60.anInt1310;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray12.length) {
					local115 = super.anIntArrayArray12[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray134[local31] -= Static60.anInt1312;
						super.anIntArray132[local31] -= Static60.anInt1311;
						super.anIntArray133[local31] -= Static60.anInt1310;
						super.anIntArray134[local31] = super.anIntArray134[local31] * arg2 / 128;
						super.anIntArray132[local31] = super.anIntArray132[local31] * arg3 / 128;
						super.anIntArray133[local31] = super.anIntArray133[local31] * arg4 / 128;
						super.anIntArray134[local31] += Static60.anInt1312;
						super.anIntArray132[local31] += Static60.anInt1311;
						super.anIntArray133[local31] += Static60.anInt1310;
					}
				}
			}
		} else if (arg0 == 5 && (super.anIntArrayArray13 != null && this.aByteArray14 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray13.length) {
					local115 = super.anIntArrayArray13[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray14[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray14[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZZJII)V")
	private void method1062(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static60.anIntArray152[local5] = 0;
		}
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(93) int local93;
		for (@Pc(16) int local16 = 0; local16 < super.anInt1305; local16++) {
			if (this.anIntArray137[local16] != -2) {
				local28 = this.anIntArray139[local16];
				local33 = this.anIntArray143[local16];
				local38 = this.anIntArray142[local16];
				local42 = Static60.anIntArray162[local28];
				local46 = Static60.anIntArray162[local33];
				local50 = Static60.anIntArray162[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static60.anIntArray161[local28];
					local69 = Static60.anIntArray161[local33];
					@Pc(73) int local73 = Static60.anIntArray161[local38];
					@Pc(77) int local77 = Static60.anIntArray155[local28];
					local81 = Static60.anIntArray155[local33];
					local85 = Static60.anIntArray155[local38];
					@Pc(89) int local89 = Static60.anIntArray146[local28];
					local93 = Static60.anIntArray146[local33];
					@Pc(97) int local97 = Static60.anIntArray146[local38];
					local65 -= local69;
					@Pc(105) int local105 = local73 - local69;
					@Pc(109) int local109 = local77 - local81;
					@Pc(113) int local113 = local85 - local81;
					@Pc(117) int local117 = local89 - local93;
					@Pc(121) int local121 = local97 - local93;
					@Pc(129) int local129 = local109 * local121 - local117 * local113;
					@Pc(137) int local137 = local117 * local105 - local65 * local121;
					@Pc(145) int local145 = local65 * local113 - local109 * local105;
					if (local69 * local129 + local81 * local137 + local93 * local145 > 0) {
						Static60.aBooleanArray7[local16] = true;
						@Pc(177) int local177 = (Static60.anIntArray160[local28] + Static60.anIntArray160[local33] + Static60.anIntArray160[local38]) / 3 + arg3;
						Static60.anIntArrayArray15[local177][Static60.anIntArray152[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method1060(Static166.anInt1308, Static166.anInt1307, Static60.anIntArray151[local28], Static60.anIntArray151[local33], Static60.anIntArray151[local38], local42, local46, local50)) {
						Static166.aLongArray8[Static166.anInt1304++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static60.anIntArray151[local38] - Static60.anIntArray151[local33]) - (Static60.anIntArray151[local28] - Static60.anIntArray151[local33]) * (local50 - local46) > 0) {
						Static60.aBooleanArray7[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static109.anInt2285 && local46 <= Static109.anInt2285 && local50 <= Static109.anInt2285) {
							Static60.aBooleanArray8[local16] = false;
						} else {
							Static60.aBooleanArray8[local16] = true;
						}
						local65 = (Static60.anIntArray160[local28] + Static60.anIntArray160[local33] + Static60.anIntArray160[local38]) / 3 + arg3;
						Static60.anIntArrayArray15[local65][Static60.anIntArray152[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray15 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static60.anIntArray152[local28];
				if (local33 > 0) {
					@Pc(324) int[] local324 = Static60.anIntArrayArray15[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method1063(local324[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static60.anIntArray153[local28] = 0;
			Static60.anIntArray147[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static60.anIntArray152[local33];
			if (local38 > 0) {
				@Pc(370) int[] local370 = Static60.anIntArrayArray15[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local370[local46];
					@Pc(382) byte local382 = this.aByteArray15[local50];
					local69 = Static60.anIntArray153[local382]++;
					Static60.anIntArrayArray14[local382][local69] = local50;
					if (local382 < 10) {
						Static60.anIntArray147[local382] += local33;
					} else if (local382 == 10) {
						Static60.anIntArray145[local69] = local33;
					} else {
						Static60.anIntArray159[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static60.anIntArray153[1] > 0 || Static60.anIntArray153[2] > 0) {
			local38 = (Static60.anIntArray147[1] + Static60.anIntArray147[2]) / (Static60.anIntArray153[1] + Static60.anIntArray153[2]);
		}
		local42 = 0;
		if (Static60.anIntArray153[3] > 0 || Static60.anIntArray153[4] > 0) {
			local42 = (Static60.anIntArray147[3] + Static60.anIntArray147[4]) / (Static60.anIntArray153[3] + Static60.anIntArray153[4]);
		}
		local46 = 0;
		if (Static60.anIntArray153[6] > 0 || Static60.anIntArray153[8] > 0) {
			local46 = (Static60.anIntArray147[6] + Static60.anIntArray147[8]) / (Static60.anIntArray153[6] + Static60.anIntArray153[8]);
		}
		local65 = 0;
		local69 = Static60.anIntArray153[10];
		@Pc(515) int[] local515 = Static60.anIntArrayArray14[10];
		@Pc(517) int[] local517 = Static60.anIntArray145;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static60.anIntArray153[11];
			local515 = Static60.anIntArrayArray14[11];
			local517 = Static60.anIntArray159;
		}
		if (local69 > 0) {
			local50 = local517[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method1063(local515[local65++]);
				if (local65 == local69 && local515 != Static60.anIntArrayArray14[11]) {
					local65 = 0;
					local69 = Static60.anIntArray153[11];
					local515 = Static60.anIntArrayArray14[11];
					local517 = Static60.anIntArray159;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method1063(local515[local65++]);
				if (local65 == local69 && local515 != Static60.anIntArrayArray14[11]) {
					local65 = 0;
					local69 = Static60.anIntArray153[11];
					local515 = Static60.anIntArrayArray14[11];
					local517 = Static60.anIntArray159;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method1063(local515[local65++]);
				if (local65 == local69 && local515 != Static60.anIntArrayArray14[11]) {
					local65 = 0;
					local69 = Static60.anIntArray153[11];
					local515 = Static60.anIntArrayArray14[11];
					local517 = Static60.anIntArray159;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static60.anIntArray153[local81];
			@Pc(680) int[] local680 = Static60.anIntArrayArray14[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method1063(local680[local93]);
			}
		}
		while (local50 != -1000) {
			this.method1063(local515[local65++]);
			if (local65 == local69 && local515 != Static60.anIntArrayArray14[11]) {
				local65 = 0;
				local515 = Static60.anIntArrayArray14[11];
				local69 = Static60.anIntArray153[11];
				local517 = Static60.anIntArray159;
			}
			if (local65 < local69) {
				local50 = local517[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)V")
	private void method1063(@OriginalArg(0) int arg0) {
		if (Static60.aBooleanArray7[arg0]) {
			this.method1065(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray139[arg0];
		@Pc(17) int local17 = this.anIntArray143[arg0];
		@Pc(22) int local22 = this.anIntArray142[arg0];
		Static109.aBoolean97 = Static60.aBooleanArray8[arg0];
		if (this.aByteArray14 == null) {
			Static109.anInt2278 = 0;
		} else {
			Static109.anInt2278 = this.aByteArray14[arg0] & 0xFF;
		}
		if (this.aShortArray4 != null && this.aShortArray4[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray16 == null || this.aByteArray16[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray16[arg0] & 0xFF;
				local133 = this.anIntArray136[local128];
				local138 = this.anIntArray138[local128];
				local143 = this.anIntArray141[local128];
			}
			if (this.anIntArray137[arg0] == -1) {
				Static109.method1866(Static60.anIntArray151[local12], Static60.anIntArray151[local17], Static60.anIntArray151[local22], Static60.anIntArray162[local12], Static60.anIntArray162[local17], Static60.anIntArray162[local22], this.anIntArray140[arg0], this.anIntArray140[arg0], this.anIntArray140[arg0], Static60.anIntArray161[local133], Static60.anIntArray161[local138], Static60.anIntArray161[local143], Static60.anIntArray155[local133], Static60.anIntArray155[local138], Static60.anIntArray155[local143], Static60.anIntArray146[local133], Static60.anIntArray146[local138], Static60.anIntArray146[local143], this.aShortArray4[arg0]);
			} else {
				Static109.method1866(Static60.anIntArray151[local12], Static60.anIntArray151[local17], Static60.anIntArray151[local22], Static60.anIntArray162[local12], Static60.anIntArray162[local17], Static60.anIntArray162[local22], this.anIntArray140[arg0], this.anIntArray144[arg0], this.anIntArray137[arg0], Static60.anIntArray161[local133], Static60.anIntArray161[local138], Static60.anIntArray161[local143], Static60.anIntArray155[local133], Static60.anIntArray155[local138], Static60.anIntArray155[local143], Static60.anIntArray146[local133], Static60.anIntArray146[local138], Static60.anIntArray146[local143], this.aShortArray4[arg0]);
			}
		} else if (this.anIntArray137[arg0] == -1) {
			Static109.method1871(Static60.anIntArray151[local12], Static60.anIntArray151[local17], Static60.anIntArray151[local22], Static60.anIntArray162[local12], Static60.anIntArray162[local17], Static60.anIntArray162[local22], Static60.anIntArray149[this.anIntArray140[arg0]]);
		} else {
			Static109.method1867(Static60.anIntArray151[local12], Static60.anIntArray151[local17], Static60.anIntArray151[local22], Static60.anIntArray162[local12], Static60.anIntArray162[local17], Static60.anIntArray162[local22], this.anIntArray140[arg0], this.anIntArray144[arg0], this.anIntArray137[arg0]);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!ue;)Lclient!ue;")
	public Class2_Sub2_Sub3_Sub4 method1064(@OriginalArg(0) Class2_Sub2_Sub3_Sub4 arg0) {
		return new Class2_Sub2_Sub3_Sub4_Sub1(new Class2_Sub2_Sub3_Sub4_Sub1[] { this, (Class2_Sub2_Sub3_Sub4_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIIIIIII)V")
	@Override
	public void method1052(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.method1042();
			@Pc(3) int local3 = Static109.anInt2279;
			@Pc(5) int local5 = Static109.anInt2281;
			@Pc(9) int local9 = Static60.anIntArray158[0];
			@Pc(13) int local13 = Static60.anIntArray154[0];
			@Pc(17) int local17 = Static60.anIntArray158[arg0];
			@Pc(21) int local21 = Static60.anIntArray154[arg0];
			@Pc(25) int local25 = Static60.anIntArray158[arg1];
			@Pc(29) int local29 = Static60.anIntArray154[arg1];
			@Pc(33) int local33 = Static60.anIntArray158[arg2];
			@Pc(37) int local37 = Static60.anIntArray154[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt1306; local49++) {
				@Pc(55) int local55 = super.anIntArray134[local49];
				@Pc(60) int local60 = super.anIntArray132[local49];
				@Pc(65) int local65 = super.anIntArray133[local49];
				@Pc(77) int local77;
				if (arg1 != 0) {
					local77 = local60 * local25 + local55 * local29 >> 16;
					local60 = local60 * local29 - local55 * local25 >> 16;
					local55 = local77;
				}
				if (arg0 != 0) {
					local77 = local65 * local17 + local55 * local21 >> 16;
					local65 = local65 * local21 - local55 * local17 >> 16;
					local55 = local77;
				}
				local55 += arg3;
				local60 += arg4;
				local65 += arg5;
				local77 = local60 * local37 - local65 * local33 >> 16;
				local65 = local60 * local33 + local65 * local37 >> 16;
				Static60.anIntArray160[local49] = local65 - local47;
				Static60.anIntArray162[local49] = local3 + (local55 << 9) / arg6;
				Static60.anIntArray151[local49] = local5 + (local77 << 9) / arg6;
				if (this.anInt1309 > 0) {
					Static60.anIntArray161[local49] = local55;
					Static60.anIntArray155[local49] = local77;
					Static60.anIntArray146[local49] = local65;
				}
			}
			this.method1062(false, false, 0L, super.aShort17, super.aShort17 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V")
	private void method1065(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static109.anInt2279;
		@Pc(3) int local3 = Static109.anInt2281;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray139[arg0];
		@Pc(15) int local15 = this.anIntArray143[arg0];
		@Pc(20) int local20 = this.anIntArray142[arg0];
		@Pc(24) int local24 = Static60.anIntArray146[local10];
		@Pc(28) int local28 = Static60.anIntArray146[local15];
		@Pc(32) int local32 = Static60.anIntArray146[local20];
		if (this.aByteArray14 == null) {
			Static109.anInt2278 = 0;
		} else {
			Static109.anInt2278 = this.aByteArray14[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static60.anIntArray157[0] = Static60.anIntArray162[local10];
			Static60.anIntArray156[0] = Static60.anIntArray151[local10];
			local5++;
			Static60.anIntArray148[0] = this.anIntArray140[arg0];
		} else {
			local73 = Static60.anIntArray161[local10];
			local77 = Static60.anIntArray155[local10];
			local82 = this.anIntArray140[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static60.anIntArray150[local32 - local24];
				Static60.anIntArray157[0] = local1 + (local73 + ((Static60.anIntArray161[local20] - local73) * local95 >> 16) << 9) / 50;
				Static60.anIntArray156[0] = local3 + (local77 + ((Static60.anIntArray155[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static60.anIntArray148[0] = local82 + ((this.anIntArray137[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static60.anIntArray150[local28 - local24];
				Static60.anIntArray157[local5] = local1 + (local73 + ((Static60.anIntArray161[local15] - local73) * local95 >> 16) << 9) / 50;
				Static60.anIntArray156[local5] = local3 + (local77 + ((Static60.anIntArray155[local15] - local77) * local95 >> 16) << 9) / 50;
				Static60.anIntArray148[local5++] = local82 + ((this.anIntArray144[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static60.anIntArray157[local5] = Static60.anIntArray162[local15];
			Static60.anIntArray156[local5] = Static60.anIntArray151[local15];
			Static60.anIntArray148[local5++] = this.anIntArray144[arg0];
		} else {
			local73 = Static60.anIntArray161[local15];
			local77 = Static60.anIntArray155[local15];
			local82 = this.anIntArray144[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static60.anIntArray150[local24 - local28];
				Static60.anIntArray157[local5] = local1 + (local73 + ((Static60.anIntArray161[local10] - local73) * local95 >> 16) << 9) / 50;
				Static60.anIntArray156[local5] = local3 + (local77 + ((Static60.anIntArray155[local10] - local77) * local95 >> 16) << 9) / 50;
				Static60.anIntArray148[local5++] = local82 + ((this.anIntArray140[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static60.anIntArray150[local32 - local28];
				Static60.anIntArray157[local5] = local1 + (local73 + ((Static60.anIntArray161[local20] - local73) * local95 >> 16) << 9) / 50;
				Static60.anIntArray156[local5] = local3 + (local77 + ((Static60.anIntArray155[local20] - local77) * local95 >> 16) << 9) / 50;
				Static60.anIntArray148[local5++] = local82 + ((this.anIntArray137[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static60.anIntArray157[local5] = Static60.anIntArray162[local20];
			Static60.anIntArray156[local5] = Static60.anIntArray151[local20];
			Static60.anIntArray148[local5++] = this.anIntArray137[arg0];
		} else {
			local73 = Static60.anIntArray161[local20];
			local77 = Static60.anIntArray155[local20];
			local82 = this.anIntArray137[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static60.anIntArray150[local28 - local32];
				Static60.anIntArray157[local5] = local1 + (local73 + ((Static60.anIntArray161[local15] - local73) * local95 >> 16) << 9) / 50;
				Static60.anIntArray156[local5] = local3 + (local77 + ((Static60.anIntArray155[local15] - local77) * local95 >> 16) << 9) / 50;
				Static60.anIntArray148[local5++] = local82 + ((this.anIntArray144[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static60.anIntArray150[local24 - local32];
				Static60.anIntArray157[local5] = local1 + (local73 + ((Static60.anIntArray161[local10] - local73) * local95 >> 16) << 9) / 50;
				Static60.anIntArray156[local5] = local3 + (local77 + ((Static60.anIntArray155[local10] - local77) * local95 >> 16) << 9) / 50;
				Static60.anIntArray148[local5++] = local82 + ((this.anIntArray140[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static60.anIntArray157[0];
		local77 = Static60.anIntArray157[1];
		local82 = Static60.anIntArray157[2];
		local95 = Static60.anIntArray156[0];
		@Pc(590) int local590 = Static60.anIntArray156[1];
		@Pc(594) int local594 = Static60.anIntArray156[2];
		Static109.aBoolean97 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static109.anInt2285 || local77 > Static109.anInt2285 || local82 > Static109.anInt2285) {
				Static109.aBoolean97 = true;
			}
			if (this.aShortArray4 != null && this.aShortArray4[arg0] != -1) {
				if (this.aByteArray16 == null || this.aByteArray16[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray16[arg0] & 0xFF;
					local683 = this.anIntArray136[local678];
					local688 = this.anIntArray138[local678];
					local693 = this.anIntArray141[local678];
				}
				if (this.anIntArray137[arg0] == -1) {
					Static109.method1866(local95, local590, local594, local73, local77, local82, this.anIntArray140[arg0], this.anIntArray140[arg0], this.anIntArray140[arg0], Static60.anIntArray161[local683], Static60.anIntArray161[local688], Static60.anIntArray161[local693], Static60.anIntArray155[local683], Static60.anIntArray155[local688], Static60.anIntArray155[local693], Static60.anIntArray146[local683], Static60.anIntArray146[local688], Static60.anIntArray146[local693], this.aShortArray4[arg0]);
				} else {
					Static109.method1866(local95, local590, local594, local73, local77, local82, Static60.anIntArray148[0], Static60.anIntArray148[1], Static60.anIntArray148[2], Static60.anIntArray161[local683], Static60.anIntArray161[local688], Static60.anIntArray161[local693], Static60.anIntArray155[local683], Static60.anIntArray155[local688], Static60.anIntArray155[local693], Static60.anIntArray146[local683], Static60.anIntArray146[local688], Static60.anIntArray146[local693], this.aShortArray4[arg0]);
				}
			} else if (this.anIntArray137[arg0] == -1) {
				Static109.method1871(local95, local590, local594, local73, local77, local82, Static60.anIntArray149[this.anIntArray140[arg0]]);
			} else {
				Static109.method1867(local95, local590, local594, local73, local77, local82, Static60.anIntArray148[0], Static60.anIntArray148[1], Static60.anIntArray148[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static109.anInt2285 || local77 > Static109.anInt2285 || local82 > Static109.anInt2285 || Static60.anIntArray157[3] < 0 || Static60.anIntArray157[3] > Static109.anInt2285) {
			Static109.aBoolean97 = true;
		}
		if (this.aShortArray4 == null || this.aShortArray4[arg0] == -1) {
			if (this.anIntArray137[arg0] == -1) {
				local683 = Static60.anIntArray149[this.anIntArray140[arg0]];
				Static109.method1871(local95, local590, local594, local73, local77, local82, local683);
				Static109.method1871(local95, local594, Static60.anIntArray156[3], local73, local82, Static60.anIntArray157[3], local683);
				return;
			}
			Static109.method1867(local95, local590, local594, local73, local77, local82, Static60.anIntArray148[0], Static60.anIntArray148[1], Static60.anIntArray148[2]);
			Static109.method1867(local95, local594, Static60.anIntArray156[3], local73, local82, Static60.anIntArray157[3], Static60.anIntArray148[0], Static60.anIntArray148[2], Static60.anIntArray148[3]);
			return;
		}
		if (this.aByteArray16 == null || this.aByteArray16[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray16[arg0] & 0xFF;
			local683 = this.anIntArray136[local678];
			local688 = this.anIntArray138[local678];
			local693 = this.anIntArray141[local678];
		}
		@Pc(956) short local956 = this.aShortArray4[arg0];
		if (this.anIntArray137[arg0] == -1) {
			Static109.method1866(local95, local590, local594, local73, local77, local82, this.anIntArray140[arg0], this.anIntArray140[arg0], this.anIntArray140[arg0], Static60.anIntArray161[local683], Static60.anIntArray161[local688], Static60.anIntArray161[local693], Static60.anIntArray155[local683], Static60.anIntArray155[local688], Static60.anIntArray155[local693], Static60.anIntArray146[local683], Static60.anIntArray146[local688], Static60.anIntArray146[local693], local956);
			Static109.method1866(local95, local594, Static60.anIntArray156[3], local73, local82, Static60.anIntArray157[3], this.anIntArray140[arg0], this.anIntArray140[arg0], this.anIntArray140[arg0], Static60.anIntArray161[local683], Static60.anIntArray161[local688], Static60.anIntArray161[local693], Static60.anIntArray155[local683], Static60.anIntArray155[local688], Static60.anIntArray155[local693], Static60.anIntArray146[local683], Static60.anIntArray146[local688], Static60.anIntArray146[local693], local956);
			return;
		}
		Static109.method1866(local95, local590, local594, local73, local77, local82, Static60.anIntArray148[0], Static60.anIntArray148[1], Static60.anIntArray148[2], Static60.anIntArray161[local683], Static60.anIntArray161[local688], Static60.anIntArray161[local693], Static60.anIntArray155[local683], Static60.anIntArray155[local688], Static60.anIntArray155[local693], Static60.anIntArray146[local683], Static60.anIntArray146[local688], Static60.anIntArray146[local693], local956);
		Static109.method1866(local95, local594, Static60.anIntArray156[3], local73, local82, Static60.anIntArray157[3], Static60.anIntArray148[0], Static60.anIntArray148[2], Static60.anIntArray148[3], Static60.anIntArray161[local683], Static60.anIntArray161[local688], Static60.anIntArray161[local693], Static60.anIntArray155[local683], Static60.anIntArray155[local688], Static60.anIntArray155[local693], Static60.anIntArray146[local683], Static60.anIntArray146[local688], Static60.anIntArray146[local693], local956);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([[IIIIZI)Lclient!ue;")
	@Override
	public Class2_Sub2_Sub3_Sub4 method1057(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1042();
		@Pc(6) int local6 = arg1 + super.aShort20;
		@Pc(11) int local11 = arg1 + super.aShort14;
		@Pc(16) int local16 = arg3 + super.aShort16;
		@Pc(21) int local21 = arg3 + super.aShort15;
		if (local6 < 0 || local11 + 128 >> 7 >= arg0.length || local16 < 0 || local21 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local6 >>= 0x7;
		local11 = local11 + 127 >> 7;
		local16 >>= 0x7;
		local21 = local21 + 127 >> 7;
		if (arg0[local6][local16] == arg2 && arg0[local11][local16] == arg2 && arg0[local6][local21] == arg2 && arg0[local11][local21] == arg2) {
			return this;
		}
		@Pc(101) Class2_Sub2_Sub3_Sub4_Sub1 local101;
		if (arg4) {
			local101 = new Class2_Sub2_Sub3_Sub4_Sub1();
			local101.anInt1306 = super.anInt1306;
			local101.anInt1305 = super.anInt1305;
			local101.anInt1309 = this.anInt1309;
			local101.anIntArray134 = super.anIntArray134;
			local101.anIntArray133 = super.anIntArray133;
			local101.anIntArray139 = this.anIntArray139;
			local101.anIntArray143 = this.anIntArray143;
			local101.anIntArray142 = this.anIntArray142;
			local101.anIntArray140 = this.anIntArray140;
			local101.anIntArray144 = this.anIntArray144;
			local101.anIntArray137 = this.anIntArray137;
			local101.aByteArray15 = this.aByteArray15;
			local101.aByteArray14 = this.aByteArray14;
			local101.aByteArray16 = this.aByteArray16;
			local101.aShortArray4 = this.aShortArray4;
			local101.aByte3 = this.aByte3;
			local101.anIntArray136 = this.anIntArray136;
			local101.anIntArray138 = this.anIntArray138;
			local101.anIntArray141 = this.anIntArray141;
			local101.anIntArrayArray12 = super.anIntArrayArray12;
			local101.anIntArrayArray13 = super.anIntArrayArray13;
			local101.aBoolean52 = super.aBoolean52;
			local101.anIntArray132 = new int[local101.anInt1306];
		} else {
			local101 = this;
		}
		@Pc(201) int local201;
		@Pc(209) int local209;
		@Pc(216) int local216;
		@Pc(220) int local220;
		@Pc(224) int local224;
		@Pc(228) int local228;
		@Pc(232) int local232;
		@Pc(254) int local254;
		@Pc(280) int local280;
		@Pc(292) int local292;
		if (arg5 == 0) {
			for (local201 = 0; local201 < local101.anInt1306; local201++) {
				local209 = super.anIntArray134[local201] + arg1;
				local216 = super.anIntArray133[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray132[local201] = super.anIntArray132[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt1306; local201++) {
				local209 = (super.anIntArray132[local201] << 16) / super.aShort34;
				if (local209 < arg5) {
					local216 = super.anIntArray134[local201] + arg1;
					local220 = super.anIntArray133[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(416) int local416 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray132[local201] = super.anIntArray132[local201] + (local416 - arg2) * (arg5 - local209) / arg5;
				} else {
					local101.anIntArray132[local201] = super.anIntArray132[local201];
				}
			}
		}
		super.aBoolean54 = false;
		return local101;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLclient!gf;[B)Lclient!gf;")
	private Class2_Sub2_Sub3_Sub4_Sub1 method1066(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub2_Sub3_Sub4_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt1306 = super.anInt1306;
		arg1.anInt1305 = super.anInt1305;
		arg1.anInt1309 = this.anInt1309;
		if (arg1.anIntArray134 == null || arg1.anIntArray134.length < super.anInt1306) {
			arg1.anIntArray134 = new int[super.anInt1306 + 100];
			arg1.anIntArray132 = new int[super.anInt1306 + 100];
			arg1.anIntArray133 = new int[super.anInt1306 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < super.anInt1306; local43++) {
			arg1.anIntArray134[local43] = super.anIntArray134[local43];
			arg1.anIntArray132[local43] = super.anIntArray132[local43];
			arg1.anIntArray133[local43] = super.anIntArray133[local43];
		}
		if (arg0) {
			arg1.aByteArray14 = this.aByteArray14;
		} else {
			arg1.aByteArray14 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray14 == null) {
				for (local88 = 0; local88 < super.anInt1305; local88++) {
					arg1.aByteArray14[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < super.anInt1305; local88++) {
					arg1.aByteArray14[local88] = this.aByteArray14[local88];
				}
			}
		}
		arg1.anIntArray139 = this.anIntArray139;
		arg1.anIntArray143 = this.anIntArray143;
		arg1.anIntArray142 = this.anIntArray142;
		arg1.anIntArray140 = this.anIntArray140;
		arg1.anIntArray144 = this.anIntArray144;
		arg1.anIntArray137 = this.anIntArray137;
		arg1.aByteArray15 = this.aByteArray15;
		arg1.aByteArray16 = this.aByteArray16;
		arg1.aShortArray4 = this.aShortArray4;
		arg1.aByte3 = this.aByte3;
		arg1.anIntArray136 = this.anIntArray136;
		arg1.anIntArray138 = this.anIntArray138;
		arg1.anIntArray141 = this.anIntArray141;
		arg1.anIntArrayArray12 = super.anIntArrayArray12;
		arg1.anIntArrayArray13 = super.anIntArrayArray13;
		arg1.aBoolean52 = super.aBoolean52;
		arg1.aBoolean54 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(Z)Lclient!ue;")
	@Override
	public Class2_Sub2_Sub3_Sub4 method1041(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static60.aByteArray17.length < super.anInt1305) {
			Static60.aByteArray17 = new byte[super.anInt1305 + 100];
		}
		return this.method1066(arg0, Static60.aClass2_Sub2_Sub3_Sub4_Sub1_1, Static60.aByteArray17);
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(Z)Lclient!ue;")
	@Override
	public Class2_Sub2_Sub3_Sub4 method1045(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static60.aByteArray18.length < super.anInt1305) {
			Static60.aByteArray18 = new byte[super.anInt1305 + 100];
		}
		return this.method1066(arg0, Static60.aClass2_Sub2_Sub3_Sub4_Sub1_2, Static60.aByteArray18);
	}
}
