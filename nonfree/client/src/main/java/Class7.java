import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class7 {

	@OriginalMember(owner = "client!aea", name = "r", descriptor = "[J")
	public static final long[] aLongArray3 = new long[256];

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
	private int anInt122 = 0;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "[I")
	private final int[] anIntArray7 = new int[8191];

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "[I")
	private final int[] anIntArray6 = new int[1600];

	@OriginalMember(owner = "client!aea", name = "l", descriptor = "[[Lclient!via;")
	private final Class4_Sub4_Sub1[][] aClass4_Sub4_Sub1ArrayArray1 = new Class4_Sub4_Sub1[64][768];

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "[I")
	private final int[] anIntArray8 = new int[64];

	@OriginalMember(owner = "client!aea", name = "p", descriptor = "[[Lclient!via;")
	private final Class4_Sub4_Sub1[][] aClass4_Sub4_Sub1ArrayArray2 = new Class4_Sub4_Sub1[1600][64];

	@OriginalMember(owner = "client!aea", name = "j", descriptor = "Lclient!gaa;")
	private final Class124 aClass124_1;

	@OriginalMember(owner = "client!aea", name = "t", descriptor = "Lclient!fk;")
	private final Interface15 anInterface15_1;

	@OriginalMember(owner = "client!aea", name = "u", descriptor = "Lclient!fk;")
	private final Interface15 anInterface15_2;

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "Lclient!lp;")
	private final Interface20 anInterface20_1;

	static {
		for (@Pc(154) int local154 = 0; local154 < 256; local154++) {
			@Pc(158) long local158 = (long) local154;
			for (@Pc(160) int local160 = 0; local160 < 8; local160++) {
				if ((local158 & 0x1L) == 1L) {
					local158 = local158 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local158 >>>= 0x1;
				}
			}
			aLongArray3[local154] = local158;
		}
	}

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!gca;)V")
	public Class7(@OriginalArg(0) Class100_Sub1 arg0) {
		this.aClass124_1 = arg0.method7981(new Class139[] { new Class139(new Class21[] { Static24.aClass21_1, Static24.aClass21_3, Static24.aClass21_5 }), new Class139(Static24.aClass21_2) });
		this.anInterface15_1 = arg0.method7920(true);
		this.anInterface15_2 = arg0.method7920(false);
		this.anInterface15_2.method5733(393168, 12);
		this.anInterface20_1 = arg0.method7882(false);
		this.anInterface20_1.method7350(49146);
		@Pc(98) Buffer local98 = this.anInterface20_1.method7347();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method7910(local98);
			@Pc(109) int local109;
			if (Stream.c()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.c(local115);
					local105.c(local115 + 1);
					local105.c(local115 + 2);
					local105.c(local115 + 2);
					local105.c(local115 + 3);
					local105.c(local115);
				}
			} else {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.f(local115);
					local105.f(local115 + 1);
					local105.f(local115 + 2);
					local105.f(local115 + 2);
					local105.f(local115 + 3);
					local105.f(local115);
				}
			}
			local105.b();
			this.anInterface20_1.method7349();
		}
		@Pc(206) Buffer local206 = this.anInterface15_2.method5735();
		if (local206 != null) {
			@Pc(213) Stream local213 = arg0.method7910(local206);
			if (Stream.c()) {
				for (local115 = 0; local115 < 8191; local115++) {
					local213.b(0.0F);
					local213.b(-1.0F);
					local213.b(0.0F);
					local213.b(0.0F);
					local213.b(-1.0F);
					local213.b(0.0F);
					local213.b(0.0F);
					local213.b(-1.0F);
					local213.b(0.0F);
					local213.b(0.0F);
					local213.b(-1.0F);
					local213.b(0.0F);
				}
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
					local213.a(0.0F);
					local213.a(-1.0F);
					local213.a(0.0F);
					local213.a(0.0F);
					local213.a(-1.0F);
					local213.a(0.0F);
					local213.a(0.0F);
					local213.a(-1.0F);
					local213.a(0.0F);
					local213.a(0.0F);
					local213.a(-1.0F);
					local213.a(0.0F);
				}
			}
			local213.b();
			this.anInterface15_2.method5734();
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(BLclient!gca;)V")
	public void method138(@OriginalArg(1) Class100_Sub1 arg0) {
		this.anInterface15_1.method5733(786336, 24);
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(BLclient!gca;)V")
	private void method140(@OriginalArg(1) Class100_Sub1 arg0) {
		Static271.aFloat121 = arg0.aFloat178;
		arg0.method7901();
		arg0.method7907(false);
		arg0.method7914(false);
		arg0.method7933();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILclient!gca;I)V")
	private void method141(@OriginalArg(1) Class100_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class10_Sub2 local11 = arg0.method7927();
		@Pc(14) float local14 = local11.aFloat54;
		@Pc(17) float local17 = local11.aFloat45;
		@Pc(20) float local20 = local11.aFloat50;
		@Pc(23) float local23 = local11.aFloat51;
		@Pc(26) float local26 = local11.aFloat47;
		@Pc(37) float local37 = local11.aFloat46;
		@Pc(41) float local41 = local23 + local14;
		@Pc(45) float local45 = local17 + local26;
		@Pc(49) float local49 = local20 + local37;
		@Pc(54) float local54 = local14 - local23;
		@Pc(59) float local59 = local17 - local26;
		@Pc(63) float local63 = local20 - local37;
		@Pc(67) float local67 = local23 - local14;
		@Pc(71) float local71 = local26 - local17;
		@Pc(76) float local76 = local37 - local20;
		@Pc(82) Buffer local82 = this.anInterface15_1.method5735();
		if (local82 == null) {
			return;
		}
		@Pc(91) Stream local91 = arg0.method7910(local82);
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
				local117 = this.anIntArray6[local97] <= 64 ? this.anIntArray6[local97] : 64;
				if (local117 > 0) {
					for (local126 = local117 - 1; local126 >= 0; local126--) {
						local137 = this.aClass4_Sub4_Sub1ArrayArray2[local97][local126];
						local140 = local137.anInt7731;
						local145 = (byte) (local140 >> 16);
						local150 = (byte) (local140 >> 8);
						local153 = (byte) local140;
						local158 = (byte) (local140 >>> 24);
						local164 = (float) (local137.anInt7730 >> 12);
						local170 = (float) (local137.anInt7738 >> 12);
						local176 = (float) (local137.anInt7735 >> 12);
						local181 = local137.anInt7734 >> 12;
						local91.b(local164 + (float) -local181 * local41);
						local91.b(local170 + local45 * (float) -local181);
						local91.b(local176 + (float) -local181 * local49);
						if (arg0.anInt9227 == 0) {
							local91.a(local145, local150, local153, local158);
						} else {
							local91.b(local145, local150, local153, local158);
						}
						local91.b(0.0F);
						local91.b(0.0F);
						local91.b(local54 * (float) local181 + local164);
						local91.b((float) local181 * local59 + local170);
						local91.b(local176 + local63 * (float) local181);
						if (arg0.anInt9227 == 0) {
							local91.a(local145, local150, local153, local158);
						} else {
							local91.b(local145, local150, local153, local158);
						}
						local91.b(1.0F);
						local91.b(0.0F);
						local91.b(local41 * (float) local181 + local164);
						local91.b(local170 + (float) local181 * local45);
						local91.b(local176 + local49 * (float) local181);
						if (arg0.anInt9227 == 0) {
							local91.a(local145, local150, local153, local158);
						} else {
							local91.b(local145, local150, local153, local158);
						}
						local91.b(1.0F);
						local91.b(1.0F);
						local91.b(local164 + (float) local181 * local67);
						local91.b(local170 + (float) local181 * local71);
						local91.b(local76 * (float) local181 + local176);
						if (arg0.anInt9227 == 0) {
							local91.a(local145, local150, local153, local158);
						} else {
							local91.b(local145, local150, local153, local158);
						}
						local91.b(0.0F);
						local7++;
						local91.b(1.0F);
					}
					if (this.anIntArray6[local97] > 64) {
						local419 = this.anIntArray6[local97] - 64 - 1;
						for (local140 = this.anIntArray8[local419] - 1; local140 >= 0; local140--) {
							local435 = this.aClass4_Sub4_Sub1ArrayArray1[local419][local140];
							local438 = local435.anInt7731;
							local153 = (byte) (local438 >> 16);
							local158 = (byte) (local438 >> 8);
							local451 = (byte) local438;
							local456 = (byte) (local438 >>> 24);
							local176 = (float) (local435.anInt7730 >> 12);
							local468 = (float) (local435.anInt7738 >> 12);
							local474 = (float) (local435.anInt7735 >> 12);
							local479 = local435.anInt7734 >> 12;
							local91.b(local41 * (float) -local479 + local176);
							local91.b(local468 + local45 * (float) -local479);
							local91.b(local474 + local49 * (float) -local479);
							if (arg0.anInt9227 == 0) {
								local91.a(local153, local158, local451, local456);
							} else {
								local91.b(local153, local158, local451, local456);
							}
							local91.b(0.0F);
							local91.b(0.0F);
							local91.b(local176 + local54 * (float) local479);
							local91.b(local468 + (float) local479 * local59);
							local91.b((float) local479 * local63 + local474);
							if (arg0.anInt9227 == 0) {
								local91.a(local153, local158, local451, local456);
							} else {
								local91.b(local153, local158, local451, local456);
							}
							local91.b(1.0F);
							local91.b(0.0F);
							local91.b(local176 + (float) local479 * local41);
							local91.b(local468 + (float) local479 * local45);
							local91.b(local474 + local49 * (float) local479);
							if (arg0.anInt9227 == 0) {
								local91.a(local153, local158, local451, local456);
							} else {
								local91.b(local153, local158, local451, local456);
							}
							local91.b(1.0F);
							local91.b(1.0F);
							local91.b((float) local479 * local67 + local176);
							local91.b(local468 + local71 * (float) local479);
							local91.b(local474 + (float) local479 * local76);
							if (arg0.anInt9227 == 0) {
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
				local117 = this.anIntArray6[local97] > 64 ? 64 : this.anIntArray6[local97];
				if (local117 > 0) {
					for (local126 = local117 - 1; local126 >= 0; local126--) {
						local137 = this.aClass4_Sub4_Sub1ArrayArray2[local97][local126];
						local140 = local137.anInt7731;
						local145 = (byte) (local140 >> 16);
						local150 = (byte) (local140 >> 8);
						local153 = (byte) local140;
						local158 = (byte) (local140 >>> 24);
						local164 = (float) (local137.anInt7730 >> 12);
						local170 = (float) (local137.anInt7738 >> 12);
						local176 = (float) (local137.anInt7735 >> 12);
						local181 = local137.anInt7734 >> 12;
						local91.a((float) -local181 * local41 + local164);
						local91.a(local170 + (float) -local181 * local45);
						local91.a(local49 * (float) -local181 + local176);
						if (arg0.anInt9227 == 0) {
							local91.a(local145, local150, local153, local158);
						} else {
							local91.b(local145, local150, local153, local158);
						}
						local91.a(0.0F);
						local91.a(0.0F);
						local91.a(local164 + (float) local181 * local54);
						local91.a(local170 + (float) local181 * local59);
						local91.a(local176 + (float) local181 * local63);
						if (arg0.anInt9227 == 0) {
							local91.a(local145, local150, local153, local158);
						} else {
							local91.b(local145, local150, local153, local158);
						}
						local91.a(1.0F);
						local91.a(0.0F);
						local91.a(local164 + local41 * (float) local181);
						local91.a((float) local181 * local45 + local170);
						local91.a(local176 + (float) local181 * local49);
						if (arg0.anInt9227 == 0) {
							local91.a(local145, local150, local153, local158);
						} else {
							local91.b(local145, local150, local153, local158);
						}
						local91.a(1.0F);
						local91.a(1.0F);
						local91.a(local164 + local67 * (float) local181);
						local91.a(local71 * (float) local181 + local170);
						local91.a((float) local181 * local76 + local176);
						if (arg0.anInt9227 == 0) {
							local91.a(local145, local150, local153, local158);
						} else {
							local91.b(local145, local150, local153, local158);
						}
						local91.a(0.0F);
						local7++;
						local91.a(1.0F);
					}
					if (this.anIntArray6[local97] > 64) {
						local419 = this.anIntArray6[local97] - 64 - 1;
						for (local140 = this.anIntArray8[local419] - 1; local140 >= 0; local140--) {
							local435 = this.aClass4_Sub4_Sub1ArrayArray1[local419][local140];
							local438 = local435.anInt7731;
							local153 = (byte) (local438 >> 16);
							local158 = (byte) (local438 >> 8);
							local451 = (byte) local438;
							local456 = (byte) (local438 >>> 24);
							local176 = (float) (local435.anInt7730 >> 12);
							local468 = (float) (local435.anInt7738 >> 12);
							local474 = (float) (local435.anInt7735 >> 12);
							local479 = local435.anInt7734 >> 12;
							local91.a(local176 + (float) -local479 * local41);
							local91.a(local468 + local45 * (float) -local479);
							local91.a(local49 * (float) -local479 + local474);
							if (arg0.anInt9227 == 0) {
								local91.a(local153, local158, local451, local456);
							} else {
								local91.b(local153, local158, local451, local456);
							}
							local91.a(0.0F);
							local91.a(0.0F);
							local91.a(local54 * (float) local479 + local176);
							local91.a(local468 + local59 * (float) local479);
							local91.a(local474 + local63 * (float) local479);
							if (arg0.anInt9227 == 0) {
								local91.a(local153, local158, local451, local456);
							} else {
								local91.b(local153, local158, local451, local456);
							}
							local91.a(1.0F);
							local91.a(0.0F);
							local91.a(local176 + local41 * (float) local479);
							local91.a(local45 * (float) local479 + local468);
							local91.a(local49 * (float) local479 + local474);
							if (arg0.anInt9227 == 0) {
								local91.a(local153, local158, local451, local456);
							} else {
								local91.b(local153, local158, local451, local456);
							}
							local91.a(1.0F);
							local91.a(1.0F);
							local91.a((float) local479 * local67 + local176);
							local91.a(local468 + (float) local479 * local71);
							local91.a(local474 + local76 * (float) local479);
							if (arg0.anInt9227 == 0) {
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
		if (this.anInterface15_1.method5734()) {
			arg0.method7868(this.anInterface15_1, 0);
			arg0.method7868(this.anInterface15_2, 1);
			arg0.method7921(this.aClass124_1);
			arg0.method7948(local7 * 4, 0, 0, Static649.aClass187_6, this.anInterface20_1, local7 * 2);
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!gca;IB)V")
	private void method142(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static271.aFloat121 = arg0.aFloat178;
		arg0.method7964((float) arg1);
		arg0.method7953();
		arg0.method7907(false);
		arg0.method7914(false);
		arg0.method7933();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILclient!gca;)V")
	private void method143(@OriginalArg(1) Class100_Sub1 arg0) {
		arg0.method7914(true);
		arg0.method7907(true);
		if (Static271.aFloat121 != arg0.aFloat178) {
			arg0.xa(Static271.aFloat121);
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V")
	public void method144() {
		this.anInterface15_1.method7351();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!gca;IZLclient!sn;)V")
	public void method146(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class336 arg2) {
		if (arg0.aClass10_Sub2_16 == null) {
			return;
		}
		if (arg1 < 0) {
			this.method140(arg0);
		} else {
			this.method142(arg0, arg1);
		}
		@Pc(31) float local31 = arg0.aClass10_Sub2_16.aFloat48;
		@Pc(35) float local35 = arg0.aClass10_Sub2_16.aFloat44;
		@Pc(39) float local39 = arg0.aClass10_Sub2_16.aFloat52;
		@Pc(43) float local43 = arg0.aClass10_Sub2_16.aFloat53;
		try {
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = Integer.MAX_VALUE;
			@Pc(49) int local49 = 0;
			@Pc(53) Class4_Sub4 local53 = arg2.aClass179_1.aClass4_Sub4_3;
			@Pc(56) Class4_Sub4 local56;
			@Pc(88) int local88;
			for (local56 = local53.aClass4_Sub4_10; local56 != local53; local56 = local56.aClass4_Sub4_10) {
				@Pc(61) Class4_Sub4_Sub1 local61 = (Class4_Sub4_Sub1) local56;
				local88 = (int) ((float) (local61.anInt7730 >> 12) * local31 + (float) (local61.anInt7738 >> 12) * local35 + (float) (local61.anInt7735 >> 12) * local39 + local43);
				if (local47 > local88) {
					local47 = local88;
				}
				this.anIntArray7[local45++] = local88;
				if (local88 > local49) {
					local49 = local88;
				}
			}
			@Pc(119) int local119 = local49 - local47;
			if (local119 + 2 > 1600) {
				local88 = Static281.method4513(local119) + 1 - Static450.anInt7342;
				local119 = (local119 >> local88) + 2;
			} else {
				local88 = 0;
				local119 += 2;
			}
			local56 = local53.aClass4_Sub4_10;
			local45 = 0;
			@Pc(152) int local152 = -2;
			@Pc(154) boolean local154 = true;
			@Pc(156) boolean local156 = true;
			while (local56 != local53) {
				this.anInt122 = 0;
				for (@Pc(165) int local165 = 0; local165 < local119; local165++) {
					this.anIntArray6[local165] = 0;
				}
				for (@Pc(184) int local184 = 0; local184 < 64; local184++) {
					this.anIntArray8[local184] = 0;
				}
				while (local56 != local53) {
					@Pc(208) Class4_Sub4_Sub1 local208 = (Class4_Sub4_Sub1) local56;
					if (local156) {
						local152 = local208.anInt7739;
						local154 = local208.aBoolean520;
						local156 = false;
					}
					if (local45 > 0 && (local208.anInt7739 != local152 || local208.aBoolean520 != local154)) {
						local156 = true;
						break;
					}
					@Pc(250) int local250 = this.anIntArray7[local45++] - local47 >> local88;
					if (local250 < 1600) {
						if (this.anIntArray6[local250] >= 64) {
							label96: {
								if (this.anIntArray6[local250] == 64) {
									if (this.anInt122 == 64) {
										break label96;
									}
									this.anIntArray6[local250] += this.anInt122++ + 1;
								}
								@Pc(306) Class4_Sub4_Sub1[] local306 = this.aClass4_Sub4_Sub1ArrayArray1[this.anIntArray6[local250] - 65];
								@Pc(314) int local314 = this.anIntArray6[local250] - 65;
								@Pc(316) int local316 = this.anIntArray8[this.anIntArray6[local250] - 65];
								this.anIntArray8[local314] = this.anIntArray8[this.anIntArray6[local250] - 65] + 1;
								local306[local316] = local208;
							}
						} else {
							this.aClass4_Sub4_Sub1ArrayArray2[local250][this.anIntArray6[local250]++] = local208;
						}
					}
					local56 = local56.aClass4_Sub4_10;
				}
				arg0.method7971(false, local152 < 0 ? -1 : local152, false);
				if (local154 && arg0.aFloat178 != Static271.aFloat121) {
					arg0.xa(Static271.aFloat121);
				} else if (arg0.aFloat178 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method141(arg0, local119);
			}
		} catch (@Pc(403) Exception local403) {
		}
		this.method143(arg0);
	}
}
