import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class123 {

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "[[Lclient!lka;")
	private final Class4_Sub4_Sub1[][] aClass4_Sub4_Sub1ArrayArray1 = new Class4_Sub4_Sub1[64][768];

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "[I")
	private final int[] anIntArray174 = new int[1600];

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "[I")
	private final int[] anIntArray175 = new int[64];

	@OriginalMember(owner = "client!fs", name = "x", descriptor = "[[Lclient!lka;")
	private final Class4_Sub4_Sub1[][] aClass4_Sub4_Sub1ArrayArray2 = new Class4_Sub4_Sub1[1600][64];

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
	private int anInt2836 = 0;

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "[I")
	private final int[] anIntArray176 = new int[8191];

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "Lclient!ok;")
	private final Class119 aClass119_1;

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "Lclient!fea;")
	private final Interface7 anInterface7_1;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "Lclient!fea;")
	private final Interface7 anInterface7_2;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "Lclient!fm;")
	private final Interface8 anInterface8_1;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!he;)V")
	public Class123(@OriginalArg(0) Class144_Sub1 arg0) {
		this.aClass119_1 = arg0.method5689(new Class127[] { new Class127(new Class73[] { Static102.aClass73_1, Static102.aClass73_3, Static102.aClass73_5 }), new Class127(Static102.aClass73_2) });
		this.anInterface7_1 = arg0.method5780(true);
		this.anInterface7_2 = arg0.method5780(false);
		this.anInterface7_2.method5841(12, 393168);
		this.anInterface8_1 = arg0.method5736(false);
		this.anInterface8_1.method5084(49146);
		@Pc(96) Buffer local96 = this.anInterface8_1.method5085();
		@Pc(112) int local112;
		if (local96 != null) {
			@Pc(103) Stream local103 = arg0.method5747(local96);
			@Pc(107) int local107;
			if (Stream.c()) {
				for (local107 = 0; local107 < 8191; local107++) {
					local112 = local107 * 4;
					local103.a(local112);
					local103.a(local112 + 1);
					local103.a(local112 + 2);
					local103.a(local112 + 2);
					local103.a(local112 + 3);
					local103.a(local112);
				}
			} else {
				for (local107 = 0; local107 < 8191; local107++) {
					local112 = local107 * 4;
					local103.d(local112);
					local103.d(local112 + 1);
					local103.d(local112 + 2);
					local103.d(local112 + 2);
					local103.d(local112 + 3);
					local103.d(local112);
				}
			}
			local103.b();
			this.anInterface8_1.method5081();
		}
		@Pc(198) Buffer local198 = this.anInterface7_2.method5840();
		if (local198 != null) {
			@Pc(205) Stream local205 = arg0.method5747(local198);
			if (Stream.c()) {
				for (local112 = 0; local112 < 8191; local112++) {
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
				}
			} else {
				for (local112 = 0; local112 < 8191; local112++) {
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
				}
			}
			local205.b();
			this.anInterface7_2.method5843();
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLclient!he;)V")
	public void method2574(@OriginalArg(1) Class144_Sub1 arg0) {
		this.anInterface7_1.method5841(24, 786336);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!he;I)V")
	private void method2575(@OriginalArg(0) Class144_Sub1 arg0) {
		Static226.aFloat83 = arg0.aFloat95;
		arg0.method5650();
		arg0.method5715(false);
		arg0.method5694(false);
		arg0.method5662();
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
	public void method2576() {
		this.anInterface7_1.method5842();
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!he;IB)V")
	private void method2578(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class263_Sub2 local11 = arg0.method5765();
		@Pc(14) float local14 = local11.aFloat173;
		@Pc(17) float local17 = local11.aFloat169;
		@Pc(20) float local20 = local11.aFloat175;
		@Pc(23) float local23 = local11.aFloat171;
		@Pc(26) float local26 = local11.aFloat166;
		@Pc(29) float local29 = local11.aFloat165;
		@Pc(33) float local33 = local14 + local23;
		@Pc(37) float local37 = local26 + local17;
		@Pc(41) float local41 = local20 + local29;
		@Pc(46) float local46 = local14 - local23;
		@Pc(50) float local50 = local17 - local26;
		@Pc(55) float local55 = local20 - local29;
		@Pc(59) float local59 = local23 - local14;
		@Pc(64) float local64 = local26 - local17;
		@Pc(68) float local68 = local29 - local20;
		@Pc(74) Buffer local74 = this.anInterface7_1.method5840();
		if (local74 == null) {
			return;
		}
		@Pc(91) Stream local91 = arg0.method5747(local74);
		@Pc(97) int local97;
		@Pc(117) int local117;
		@Pc(126) int local126;
		@Pc(137) Class4_Sub4_Sub1 local137;
		@Pc(140) int local140;
		@Pc(145) byte local145;
		@Pc(150) byte local150;
		@Pc(153) byte local153;
		@Pc(158) byte local158;
		@Pc(164) float local164;
		@Pc(170) float local170;
		@Pc(176) float local176;
		@Pc(181) int local181;
		@Pc(474) float local474;
		@Pc(479) int local479;
		@Pc(419) int local419;
		@Pc(435) Class4_Sub4_Sub1 local435;
		@Pc(438) int local438;
		@Pc(451) byte local451;
		@Pc(456) byte local456;
		@Pc(468) float local468;
		if (Stream.c()) {
			for (local97 = arg1 - 1; local97 >= 0; local97--) {
				local117 = this.anIntArray174[local97] <= 64 ? this.anIntArray174[local97] : 64;
				if (local117 > 0) {
					for (local126 = local117 - 1; local126 >= 0; local126--) {
						local137 = this.aClass4_Sub4_Sub1ArrayArray2[local97][local126];
						local140 = local137.anInt9661;
						local145 = (byte) (local140 >> 16);
						local150 = (byte) (local140 >> 8);
						local153 = (byte) local140;
						local158 = (byte) (local140 >>> 24);
						local164 = (float) (local137.anInt9663 >> 12);
						local170 = (float) (local137.anInt9665 >> 12);
						local176 = (float) (local137.anInt9662 >> 12);
						local181 = local137.anInt9664 >> 12;
						local91.b((float) -local181 * local33 + local164);
						local91.b(local170 + local37 * (float) -local181);
						local91.b(local176 + (float) -local181 * local41);
						if (arg0.anInt6500 == 0) {
							local91.a(local145, local150, local153, local158);
						} else {
							local91.b(local145, local150, local153, local158);
						}
						local91.b(0.0F);
						local91.b(0.0F);
						local91.b(local164 + local46 * (float) local181);
						local91.b((float) local181 * local50 + local170);
						local91.b((float) local181 * local55 + local176);
						if (arg0.anInt6500 == 0) {
							local91.a(local145, local150, local153, local158);
						} else {
							local91.b(local145, local150, local153, local158);
						}
						local91.b(1.0F);
						local91.b(0.0F);
						local91.b(local164 + local33 * (float) local181);
						local91.b((float) local181 * local37 + local170);
						local91.b(local41 * (float) local181 + local176);
						if (arg0.anInt6500 == 0) {
							local91.a(local145, local150, local153, local158);
						} else {
							local91.b(local145, local150, local153, local158);
						}
						local91.b(1.0F);
						local91.b(1.0F);
						local91.b(local59 * (float) local181 + local164);
						local91.b((float) local181 * local64 + local170);
						local91.b(local68 * (float) local181 + local176);
						if (arg0.anInt6500 == 0) {
							local91.a(local145, local150, local153, local158);
						} else {
							local91.b(local145, local150, local153, local158);
						}
						local91.b(0.0F);
						local91.b(1.0F);
						local7++;
					}
					if (this.anIntArray174[local97] > 64) {
						local419 = this.anIntArray174[local97] - 1 - 64;
						for (local140 = this.anIntArray175[local419] - 1; local140 >= 0; local140--) {
							local435 = this.aClass4_Sub4_Sub1ArrayArray1[local419][local140];
							local438 = local435.anInt9661;
							local153 = (byte) (local438 >> 16);
							local158 = (byte) (local438 >> 8);
							local451 = (byte) local438;
							local456 = (byte) (local438 >>> 24);
							local176 = (float) (local435.anInt9663 >> 12);
							local468 = (float) (local435.anInt9665 >> 12);
							local474 = (float) (local435.anInt9662 >> 12);
							local479 = local435.anInt9664 >> 12;
							local91.b((float) -local479 * local33 + local176);
							local91.b(local37 * (float) -local479 + local468);
							local91.b((float) -local479 * local41 + local474);
							if (arg0.anInt6500 == 0) {
								local91.a(local153, local158, local451, local456);
							} else {
								local91.b(local153, local158, local451, local456);
							}
							local91.b(0.0F);
							local91.b(0.0F);
							local91.b(local46 * (float) local479 + local176);
							local91.b(local468 + (float) local479 * local50);
							local91.b(local474 + (float) local479 * local55);
							if (arg0.anInt6500 == 0) {
								local91.a(local153, local158, local451, local456);
							} else {
								local91.b(local153, local158, local451, local456);
							}
							local91.b(1.0F);
							local91.b(0.0F);
							local91.b(local176 + local33 * (float) local479);
							local91.b(local468 + local37 * (float) local479);
							local91.b((float) local479 * local41 + local474);
							if (arg0.anInt6500 == 0) {
								local91.a(local153, local158, local451, local456);
							} else {
								local91.b(local153, local158, local451, local456);
							}
							local91.b(1.0F);
							local91.b(1.0F);
							local91.b(local176 + local59 * (float) local479);
							local91.b(local468 + local64 * (float) local479);
							local91.b(local68 * (float) local479 + local474);
							if (arg0.anInt6500 == 0) {
								local91.a(local153, local158, local451, local456);
							} else {
								local91.b(local153, local158, local451, local456);
							}
							local91.b(0.0F);
							local7++;
							local91.b(1.0F);
						}
					}
				}
			}
		} else {
			for (local97 = arg1 - 1; local97 >= 0; local97--) {
				local117 = this.anIntArray174[local97] <= 64 ? this.anIntArray174[local97] : 64;
				if (local117 > 0) {
					for (local126 = local117 - 1; local126 >= 0; local126--) {
						local137 = this.aClass4_Sub4_Sub1ArrayArray2[local97][local126];
						local140 = local137.anInt9661;
						local145 = (byte) (local140 >> 16);
						local150 = (byte) (local140 >> 8);
						local153 = (byte) local140;
						local158 = (byte) (local140 >>> 24);
						local164 = (float) (local137.anInt9663 >> 12);
						local170 = (float) (local137.anInt9665 >> 12);
						local176 = (float) (local137.anInt9662 >> 12);
						local181 = local137.anInt9664 >> 12;
						local91.a(local33 * (float) -local181 + local164);
						local91.a(local170 + (float) -local181 * local37);
						local91.a(local41 * (float) -local181 + local176);
						if (arg0.anInt6500 == 0) {
							local91.a(local145, local150, local153, local158);
						} else {
							local91.b(local145, local150, local153, local158);
						}
						local91.a(0.0F);
						local91.a(0.0F);
						local91.a((float) local181 * local46 + local164);
						local91.a(local50 * (float) local181 + local170);
						local91.a(local176 + local55 * (float) local181);
						if (arg0.anInt6500 == 0) {
							local91.a(local145, local150, local153, local158);
						} else {
							local91.b(local145, local150, local153, local158);
						}
						local91.a(1.0F);
						local91.a(0.0F);
						local91.a(local33 * (float) local181 + local164);
						local91.a(local170 + local37 * (float) local181);
						local91.a(local41 * (float) local181 + local176);
						if (arg0.anInt6500 == 0) {
							local91.a(local145, local150, local153, local158);
						} else {
							local91.b(local145, local150, local153, local158);
						}
						local91.a(1.0F);
						local91.a(1.0F);
						local91.a(local164 + local59 * (float) local181);
						local91.a(local170 + (float) local181 * local64);
						local91.a(local68 * (float) local181 + local176);
						if (arg0.anInt6500 == 0) {
							local91.a(local145, local150, local153, local158);
						} else {
							local91.b(local145, local150, local153, local158);
						}
						local91.a(0.0F);
						local91.a(1.0F);
						local7++;
					}
					if (this.anIntArray174[local97] > 64) {
						local419 = this.anIntArray174[local97] - 64 - 1;
						for (local140 = this.anIntArray175[local419] - 1; local140 >= 0; local140--) {
							local435 = this.aClass4_Sub4_Sub1ArrayArray1[local419][local140];
							local438 = local435.anInt9661;
							local153 = (byte) (local438 >> 16);
							local158 = (byte) (local438 >> 8);
							local451 = (byte) local438;
							local456 = (byte) (local438 >>> 24);
							local176 = (float) (local435.anInt9663 >> 12);
							local468 = (float) (local435.anInt9665 >> 12);
							local474 = (float) (local435.anInt9662 >> 12);
							local479 = local435.anInt9664 >> 12;
							local91.a(local33 * (float) -local479 + local176);
							local91.a(local468 + local37 * (float) -local479);
							local91.a(local474 + local41 * (float) -local479);
							if (arg0.anInt6500 == 0) {
								local91.a(local153, local158, local451, local456);
							} else {
								local91.b(local153, local158, local451, local456);
							}
							local91.a(0.0F);
							local91.a(0.0F);
							local91.a(local46 * (float) local479 + local176);
							local91.a(local468 + local50 * (float) local479);
							local91.a(local474 + local55 * (float) local479);
							if (arg0.anInt6500 == 0) {
								local91.a(local153, local158, local451, local456);
							} else {
								local91.b(local153, local158, local451, local456);
							}
							local91.a(1.0F);
							local91.a(0.0F);
							local91.a(local176 + (float) local479 * local33);
							local91.a((float) local479 * local37 + local468);
							local91.a(local41 * (float) local479 + local474);
							if (arg0.anInt6500 == 0) {
								local91.a(local153, local158, local451, local456);
							} else {
								local91.b(local153, local158, local451, local456);
							}
							local91.a(1.0F);
							local91.a(1.0F);
							local91.a(local59 * (float) local479 + local176);
							local91.a(local64 * (float) local479 + local468);
							local91.a(local474 + (float) local479 * local68);
							if (arg0.anInt6500 == 0) {
								local91.a(local153, local158, local451, local456);
							} else {
								local91.b(local153, local158, local451, local456);
							}
							local91.a(0.0F);
							local91.a(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local91.b();
		if (this.anInterface7_1.method5843()) {
			arg0.method5696(0, this.anInterface7_1);
			arg0.method5696(1, this.anInterface7_2);
			arg0.method5707(this.aClass119_1);
			arg0.method5746(local7 * 2, 0, this.anInterface8_1, local7 * 4, Static469.aClass213_46, 0);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!qv;Lclient!he;BI)V")
	public void method2579(@OriginalArg(0) Class304 arg0, @OriginalArg(1) Class144_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aClass263_Sub2_16 == null) {
			return;
		}
		if (arg2 >= 0) {
			this.method2580(arg1, arg2);
		} else {
			this.method2575(arg1);
		}
		@Pc(34) float local34 = arg1.aClass263_Sub2_16.aFloat172;
		@Pc(38) float local38 = arg1.aClass263_Sub2_16.aFloat168;
		@Pc(42) float local42 = arg1.aClass263_Sub2_16.aFloat167;
		@Pc(46) float local46 = arg1.aClass263_Sub2_16.aFloat174;
		try {
			@Pc(48) int local48 = 0;
			@Pc(50) int local50 = Integer.MAX_VALUE;
			@Pc(52) int local52 = 0;
			@Pc(61) Class4_Sub4 local61 = arg0.aClass324_1.aClass4_Sub4_7;
			@Pc(64) Class4_Sub4 local64;
			@Pc(96) int local96;
			for (local64 = local61.aClass4_Sub4_9; local64 != local61; local64 = local64.aClass4_Sub4_9) {
				@Pc(69) Class4_Sub4_Sub1 local69 = (Class4_Sub4_Sub1) local64;
				local96 = (int) (local46 + (float) (local69.anInt9663 >> 12) * local34 + local38 * (float) (local69.anInt9665 >> 12) + local42 * (float) (local69.anInt9662 >> 12));
				if (local96 < local50) {
					local50 = local96;
				}
				this.anIntArray176[local48++] = local96;
				if (local52 < local96) {
					local52 = local96;
				}
			}
			@Pc(127) int local127 = local52 - local50;
			if (local127 + 2 <= 1600) {
				local127 += 2;
				local96 = 0;
			} else {
				local96 = Static220.method3803(local127) + 1 - Static269.anInt10471;
				local127 = (local127 >> local96) + 2;
			}
			local48 = 0;
			local64 = local61.aClass4_Sub4_9;
			@Pc(162) int local162 = -2;
			@Pc(164) boolean local164 = true;
			@Pc(166) boolean local166 = true;
			while (local61 != local64) {
				this.anInt2836 = 0;
				for (@Pc(175) int local175 = 0; local175 < local127; local175++) {
					this.anIntArray174[local175] = 0;
				}
				for (@Pc(194) int local194 = 0; local194 < 64; local194++) {
					this.anIntArray175[local194] = 0;
				}
				while (local61 != local64) {
					@Pc(220) Class4_Sub4_Sub1 local220 = (Class4_Sub4_Sub1) local64;
					if (local166) {
						local164 = local220.aBoolean666;
						local162 = local220.anInt9660;
						local166 = false;
					}
					if (local48 > 0 && (local162 != local220.anInt9660 || local220.aBoolean666 != local164)) {
						local166 = true;
						break;
					}
					@Pc(259) int local259 = this.anIntArray176[local48++] - local50 >> local96;
					if (local259 < 1600) {
						if (this.anIntArray174[local259] < 64) {
							this.aClass4_Sub4_Sub1ArrayArray2[local259][this.anIntArray174[local259]++] = local220;
						} else {
							label97: {
								if (this.anIntArray174[local259] == 64) {
									if (this.anInt2836 == 64) {
										break label97;
									}
									this.anIntArray174[local259] += this.anInt2836++ + 1;
								}
								@Pc(342) Class4_Sub4_Sub1[] local342 = this.aClass4_Sub4_Sub1ArrayArray1[this.anIntArray174[local259] - 1 - 64];
								@Pc(352) int local352 = this.anIntArray174[local259] - 1 - 64;
								@Pc(354) int local354 = this.anIntArray175[this.anIntArray174[local259] - 1 - 64];
								this.anIntArray175[local352] = this.anIntArray175[this.anIntArray174[local259] - 1 - 64] + 1;
								local342[local354] = local220;
							}
						}
					}
					local64 = local64.aClass4_Sub4_9;
				}
				arg1.method5769(false, local162 >= 0 ? local162 : -1, false);
				if (local164 && Static226.aFloat83 != arg1.aFloat95) {
					arg1.xa(Static226.aFloat83);
				} else if (arg1.aFloat95 != 1.0F) {
					arg1.xa(1.0F);
				}
				this.method2578(arg1, local127);
			}
		} catch (@Pc(419) Exception local419) {
		}
		this.method2581(arg1);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILclient!he;I)V")
	private void method2580(@OriginalArg(1) Class144_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static226.aFloat83 = arg0.aFloat95;
		arg0.method5766((float) arg1);
		arg0.method5657();
		arg0.method5715(false);
		arg0.method5694(false);
		arg0.method5662();
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILclient!he;)V")
	private void method2581(@OriginalArg(1) Class144_Sub1 arg0) {
		arg0.method5694(true);
		arg0.method5715(true);
		if (arg0.aFloat95 != Static226.aFloat83) {
			arg0.xa(Static226.aFloat83);
		}
	}
}
