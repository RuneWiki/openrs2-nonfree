import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class269 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "[[Lclient!an;")
	private final Class12_Sub1_Sub1[][] aClass12_Sub1_Sub1ArrayArray3 = new Class12_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "[I")
	private final int[] anIntArray429 = new int[8191];

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "[[Lclient!an;")
	private final Class12_Sub1_Sub1[][] aClass12_Sub1_Sub1ArrayArray4 = new Class12_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "[I")
	private final int[] anIntArray430 = new int[64];

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "[I")
	private final int[] anIntArray431 = new int[1600];

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
	private int anInt6709 = 0;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "Lclient!cl;")
	private final Class59 aClass59_20;

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "Lclient!ega;")
	private final Interface8 anInterface8_14;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "Lclient!ega;")
	private final Interface8 anInterface8_13;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "Lclient!ip;")
	private final Interface13 anInterface13_7;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!um;)V")
	public Class269(@OriginalArg(0) Class162_Sub1 arg0) {
		this.aClass59_20 = arg0.method3935(new Class76[] { new Class76(new Class341[] { Static545.aClass341_1, Static545.aClass341_3, Static545.aClass341_5 }), new Class76(Static545.aClass341_2) });
		this.anInterface8_14 = arg0.method3826(true);
		this.anInterface8_13 = arg0.method3826(false);
		this.anInterface8_13.method5367(393168, 12);
		this.anInterface13_7 = arg0.method3889(false);
		this.anInterface13_7.method7035(49146);
		@Pc(98) Buffer local98 = this.anInterface13_7.method7034();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method3907(local98);
			@Pc(109) int local109;
			if (Stream.b()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.e(local115);
					local105.e(local115 + 1);
					local105.e(local115 + 2);
					local105.e(local115 + 2);
					local105.e(local115 + 3);
					local105.e(local115);
				}
			} else {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.b(local115);
					local105.b(local115 + 1);
					local105.b(local115 + 2);
					local105.b(local115 + 2);
					local105.b(local115 + 3);
					local105.b(local115);
				}
			}
			local105.c();
			this.anInterface13_7.method7033();
		}
		@Pc(202) Buffer local202 = this.anInterface8_13.method5369();
		if (local202 != null) {
			@Pc(209) Stream local209 = arg0.method3907(local202);
			if (Stream.b()) {
				for (local115 = 0; local115 < 8191; local115++) {
					local209.a(0.0F);
					local209.a(-1.0F);
					local209.a(0.0F);
					local209.a(0.0F);
					local209.a(-1.0F);
					local209.a(0.0F);
					local209.a(0.0F);
					local209.a(-1.0F);
					local209.a(0.0F);
					local209.a(0.0F);
					local209.a(-1.0F);
					local209.a(0.0F);
				}
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
					local209.b(0.0F);
					local209.b(-1.0F);
					local209.b(0.0F);
					local209.b(0.0F);
					local209.b(-1.0F);
					local209.b(0.0F);
					local209.b(0.0F);
					local209.b(-1.0F);
					local209.b(0.0F);
					local209.b(0.0F);
					local209.b(-1.0F);
					local209.b(0.0F);
				}
			}
			local209.c();
			this.anInterface8_13.method5368();
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!um;ILclient!uo;)V")
	public void method5557(@OriginalArg(0) int arg0, @OriginalArg(1) Class162_Sub1 arg1, @OriginalArg(3) Class339 arg2) {
		if (arg1.aClass25_Sub2_16 == null) {
			return;
		}
		if (arg0 >= 0) {
			this.method5559(arg1, arg0);
		} else {
			this.method5561(arg1);
		}
		@Pc(31) float local31 = arg1.aClass25_Sub2_16.aFloat80;
		@Pc(35) float local35 = arg1.aClass25_Sub2_16.aFloat73;
		@Pc(39) float local39 = arg1.aClass25_Sub2_16.aFloat78;
		@Pc(43) float local43 = arg1.aClass25_Sub2_16.aFloat72;
		try {
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = Integer.MAX_VALUE;
			@Pc(49) int local49 = 0;
			@Pc(53) Class12_Sub1 local53 = arg2.aClass77_1.aClass12_Sub1_5;
			@Pc(56) Class12_Sub1 local56;
			@Pc(88) int local88;
			for (local56 = local53.aClass12_Sub1_9; local56 != local53; local56 = local56.aClass12_Sub1_9) {
				@Pc(61) Class12_Sub1_Sub1 local61 = (Class12_Sub1_Sub1) local56;
				local88 = (int) (local43 + local35 * (float) (local61.anInt4843 >> 12) + local31 * (float) (local61.anInt4849 >> 12) + (float) (local61.anInt4848 >> 12) * local39);
				if (local47 > local88) {
					local47 = local88;
				}
				this.anIntArray429[local45++] = local88;
				if (local88 > local49) {
					local49 = local88;
				}
			}
			@Pc(119) int local119 = local49 - local47;
			if (local119 + 2 <= 1600) {
				local88 = 0;
				local119 += 2;
			} else {
				local88 = Static234.method3333(local119) + 1 - Static470.anInt7538;
				local119 = (local119 >> local88) + 2;
			}
			local56 = local53.aClass12_Sub1_9;
			local45 = 0;
			@Pc(152) int local152 = -2;
			@Pc(154) boolean local154 = true;
			@Pc(156) boolean local156 = true;
			while (local53 != local56) {
				this.anInt6709 = 0;
				for (@Pc(163) int local163 = 0; local163 < local119; local163++) {
					this.anIntArray431[local163] = 0;
				}
				for (@Pc(176) int local176 = 0; local176 < 64; local176++) {
					this.anIntArray430[local176] = 0;
				}
				while (local53 != local56) {
					@Pc(192) Class12_Sub1_Sub1 local192 = (Class12_Sub1_Sub1) local56;
					if (local156) {
						local154 = local192.aBoolean370;
						local152 = local192.anInt4847;
						local156 = false;
					}
					if (local45 > 0 && (local152 != local192.anInt4847 || local154 != local192.aBoolean370)) {
						local156 = true;
						break;
					}
					@Pc(235) int local235 = this.anIntArray429[local45++] - local47 >> local88;
					if (local235 < 1600) {
						if (this.anIntArray431[local235] < 64) {
							this.aClass12_Sub1_Sub1ArrayArray4[local235][this.anIntArray431[local235]++] = local192;
						} else {
							label101: {
								if (this.anIntArray431[local235] == 64) {
									if (this.anInt6709 == 64) {
										break label101;
									}
									this.anIntArray431[local235] += this.anInt6709++ + 1;
								}
								this.aClass12_Sub1_Sub1ArrayArray3[this.anIntArray431[local235] - 1 - 64][this.anIntArray430[this.anIntArray431[local235] - 64 - 1]++] = local192;
							}
						}
					}
					local56 = local56.aClass12_Sub1_9;
				}
				arg1.method3943(false, local152 >= 0 ? local152 : -1, false);
				if (local154 && Static217.aFloat69 != arg1.aFloat144) {
					arg1.ra(Static217.aFloat69);
				} else if (arg1.aFloat144 != 1.0F) {
					arg1.ra(1.0F);
				}
				this.method5558(local119, arg1);
			}
		} catch (@Pc(368) Exception local368) {
		}
		this.method5564(arg1);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BILclient!um;)V")
	private void method5558(@OriginalArg(1) int arg0, @OriginalArg(2) Class162_Sub1 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class25_Sub2 local11 = arg1.method3857();
		@Pc(14) float local14 = local11.aFloat81;
		@Pc(17) float local17 = local11.aFloat76;
		@Pc(20) float local20 = local11.aFloat82;
		@Pc(27) float local27 = local11.aFloat77;
		@Pc(30) float local30 = local11.aFloat75;
		@Pc(33) float local33 = local11.aFloat74;
		@Pc(37) float local37 = local27 + local14;
		@Pc(41) float local41 = local17 + local30;
		@Pc(45) float local45 = local20 + local33;
		@Pc(50) float local50 = local14 - local27;
		@Pc(54) float local54 = local17 - local30;
		@Pc(58) float local58 = local20 - local33;
		@Pc(62) float local62 = local27 - local14;
		@Pc(67) float local67 = local30 - local17;
		@Pc(71) float local71 = local33 - local20;
		@Pc(77) Buffer local77 = this.anInterface8_14.method5369();
		if (local77 == null) {
			return;
		}
		@Pc(85) Stream local85 = arg1.method3907(local77);
		@Pc(91) int local91;
		@Pc(108) int local108;
		@Pc(114) int local114;
		@Pc(123) Class12_Sub1_Sub1 local123;
		@Pc(126) int local126;
		@Pc(131) byte local131;
		@Pc(136) byte local136;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(150) float local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(167) int local167;
		@Pc(446) float local446;
		@Pc(451) int local451;
		@Pc(391) int local391;
		@Pc(407) Class12_Sub1_Sub1 local407;
		@Pc(410) int local410;
		@Pc(423) byte local423;
		@Pc(428) byte local428;
		@Pc(440) float local440;
		if (Stream.b()) {
			for (local91 = arg0 - 1; local91 >= 0; local91--) {
				local108 = this.anIntArray431[local91] > 64 ? 64 : this.anIntArray431[local91];
				if (local108 > 0) {
					for (local114 = local108 - 1; local114 >= 0; local114--) {
						local123 = this.aClass12_Sub1_Sub1ArrayArray4[local91][local114];
						local126 = local123.anInt4841;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = local123.anInt4849 >> 12;
						local156 = local123.anInt4843 >> 12;
						local162 = local123.anInt4848 >> 12;
						local167 = local123.anInt4846 >> 12;
						local85.a(local150 + local37 * (float) -local167);
						local85.a((float) -local167 * local41 + local156);
						local85.a((float) -local167 * local45 + local162);
						if (arg1.anInt4620 == 0) {
							local85.b(local131, local136, local139, local144);
						} else {
							local85.a(local131, local136, local139, local144);
						}
						local85.a(0.0F);
						local85.a(0.0F);
						local85.a(local50 * (float) local167 + local150);
						local85.a(local156 + (float) local167 * local54);
						local85.a(local162 + (float) local167 * local58);
						if (arg1.anInt4620 == 0) {
							local85.b(local131, local136, local139, local144);
						} else {
							local85.a(local131, local136, local139, local144);
						}
						local85.a(1.0F);
						local85.a(0.0F);
						local85.a(local150 + local37 * (float) local167);
						local85.a((float) local167 * local41 + local156);
						local85.a(local45 * (float) local167 + local162);
						if (arg1.anInt4620 == 0) {
							local85.b(local131, local136, local139, local144);
						} else {
							local85.a(local131, local136, local139, local144);
						}
						local85.a(1.0F);
						local85.a(1.0F);
						local85.a(local150 + local62 * (float) local167);
						local85.a(local156 + (float) local167 * local67);
						local85.a(local162 + (float) local167 * local71);
						if (arg1.anInt4620 == 0) {
							local85.b(local131, local136, local139, local144);
						} else {
							local85.a(local131, local136, local139, local144);
						}
						local85.a(0.0F);
						local85.a(1.0F);
						local7++;
					}
					if (this.anIntArray431[local91] > 64) {
						local391 = this.anIntArray431[local91] - 1 - 64;
						for (local126 = this.anIntArray430[local391] - 1; local126 >= 0; local126--) {
							local407 = this.aClass12_Sub1_Sub1ArrayArray3[local391][local126];
							local410 = local407.anInt4841;
							local139 = (byte) (local410 >> 16);
							local144 = (byte) (local410 >> 8);
							local423 = (byte) local410;
							local428 = (byte) (local410 >>> 24);
							local162 = local407.anInt4849 >> 12;
							local440 = local407.anInt4843 >> 12;
							local446 = local407.anInt4848 >> 12;
							local451 = local407.anInt4846 >> 12;
							local85.a(local162 + local37 * (float) -local451);
							local85.a(local440 + (float) -local451 * local41);
							local85.a(local446 + (float) -local451 * local45);
							if (arg1.anInt4620 == 0) {
								local85.b(local139, local144, local423, local428);
							} else {
								local85.a(local139, local144, local423, local428);
							}
							local85.a(0.0F);
							local85.a(0.0F);
							local85.a(local50 * (float) local451 + local162);
							local85.a(local440 + (float) local451 * local54);
							local85.a(local58 * (float) local451 + local446);
							if (arg1.anInt4620 == 0) {
								local85.b(local139, local144, local423, local428);
							} else {
								local85.a(local139, local144, local423, local428);
							}
							local85.a(1.0F);
							local85.a(0.0F);
							local85.a((float) local451 * local37 + local162);
							local85.a(local440 + local41 * (float) local451);
							local85.a(local446 + local45 * (float) local451);
							if (arg1.anInt4620 == 0) {
								local85.b(local139, local144, local423, local428);
							} else {
								local85.a(local139, local144, local423, local428);
							}
							local85.a(1.0F);
							local85.a(1.0F);
							local85.a((float) local451 * local62 + local162);
							local85.a(local67 * (float) local451 + local440);
							local85.a(local71 * (float) local451 + local446);
							if (arg1.anInt4620 == 0) {
								local85.b(local139, local144, local423, local428);
							} else {
								local85.a(local139, local144, local423, local428);
							}
							local85.a(0.0F);
							local7++;
							local85.a(1.0F);
						}
					}
				}
			}
		} else {
			for (local91 = arg0 - 1; local91 >= 0; local91--) {
				local108 = this.anIntArray431[local91] > 64 ? 64 : this.anIntArray431[local91];
				if (local108 > 0) {
					for (local114 = local108 - 1; local114 >= 0; local114--) {
						local123 = this.aClass12_Sub1_Sub1ArrayArray4[local91][local114];
						local126 = local123.anInt4841;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = local123.anInt4849 >> 12;
						local156 = local123.anInt4843 >> 12;
						local162 = local123.anInt4848 >> 12;
						local167 = local123.anInt4846 >> 12;
						local85.b((float) -local167 * local37 + local150);
						local85.b((float) -local167 * local41 + local156);
						local85.b(local162 + local45 * (float) -local167);
						if (arg1.anInt4620 == 0) {
							local85.b(local131, local136, local139, local144);
						} else {
							local85.a(local131, local136, local139, local144);
						}
						local85.b(0.0F);
						local85.b(0.0F);
						local85.b(local150 + local50 * (float) local167);
						local85.b(local156 + (float) local167 * local54);
						local85.b(local58 * (float) local167 + local162);
						if (arg1.anInt4620 == 0) {
							local85.b(local131, local136, local139, local144);
						} else {
							local85.a(local131, local136, local139, local144);
						}
						local85.b(1.0F);
						local85.b(0.0F);
						local85.b((float) local167 * local37 + local150);
						local85.b(local41 * (float) local167 + local156);
						local85.b(local162 + (float) local167 * local45);
						if (arg1.anInt4620 == 0) {
							local85.b(local131, local136, local139, local144);
						} else {
							local85.a(local131, local136, local139, local144);
						}
						local85.b(1.0F);
						local85.b(1.0F);
						local85.b(local150 + local62 * (float) local167);
						local85.b(local156 + (float) local167 * local67);
						local85.b(local162 + (float) local167 * local71);
						if (arg1.anInt4620 == 0) {
							local85.b(local131, local136, local139, local144);
						} else {
							local85.a(local131, local136, local139, local144);
						}
						local85.b(0.0F);
						local85.b(1.0F);
						local7++;
					}
					if (this.anIntArray431[local91] > 64) {
						local391 = this.anIntArray431[local91] - 1 - 64;
						for (local126 = this.anIntArray430[local391] - 1; local126 >= 0; local126--) {
							local407 = this.aClass12_Sub1_Sub1ArrayArray3[local391][local126];
							local410 = local407.anInt4841;
							local139 = (byte) (local410 >> 16);
							local144 = (byte) (local410 >> 8);
							local423 = (byte) local410;
							local428 = (byte) (local410 >>> 24);
							local162 = local407.anInt4849 >> 12;
							local440 = local407.anInt4843 >> 12;
							local446 = local407.anInt4848 >> 12;
							local451 = local407.anInt4846 >> 12;
							local85.b(local162 + local37 * (float) -local451);
							local85.b(local440 + local41 * (float) -local451);
							local85.b(local446 + local45 * (float) -local451);
							if (arg1.anInt4620 == 0) {
								local85.b(local139, local144, local423, local428);
							} else {
								local85.a(local139, local144, local423, local428);
							}
							local85.b(0.0F);
							local85.b(0.0F);
							local85.b(local50 * (float) local451 + local162);
							local85.b(local440 + (float) local451 * local54);
							local85.b(local446 + local58 * (float) local451);
							if (arg1.anInt4620 == 0) {
								local85.b(local139, local144, local423, local428);
							} else {
								local85.a(local139, local144, local423, local428);
							}
							local85.b(1.0F);
							local85.b(0.0F);
							local85.b(local162 + (float) local451 * local37);
							local85.b((float) local451 * local41 + local440);
							local85.b(local45 * (float) local451 + local446);
							if (arg1.anInt4620 == 0) {
								local85.b(local139, local144, local423, local428);
							} else {
								local85.a(local139, local144, local423, local428);
							}
							local85.b(1.0F);
							local85.b(1.0F);
							local85.b((float) local451 * local62 + local162);
							local85.b((float) local451 * local67 + local440);
							local85.b(local71 * (float) local451 + local446);
							if (arg1.anInt4620 == 0) {
								local85.b(local139, local144, local423, local428);
							} else {
								local85.a(local139, local144, local423, local428);
							}
							local85.b(0.0F);
							local85.b(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local85.c();
		if (this.anInterface8_14.method5368()) {
			arg1.method3954(this.anInterface8_14, 0);
			arg1.method3954(this.anInterface8_13, 1);
			arg1.method3882(this.aClass59_20);
			arg1.method3892(0, local7 * 4, Static523.aClass155_6, local7 * 2, this.anInterface13_7, 0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!um;I)V")
	private void method5559(@OriginalArg(1) Class162_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static217.aFloat69 = arg0.aFloat144;
		arg0.method3905((float) arg1);
		arg0.method3914();
		arg0.method3879(false);
		arg0.method3940(false);
		arg0.method3952();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!um;)V")
	public void method5560(@OriginalArg(1) Class162_Sub1 arg0) {
		this.anInterface8_14.method5367(786336, 24);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!um;I)V")
	private void method5561(@OriginalArg(0) Class162_Sub1 arg0) {
		Static217.aFloat69 = arg0.aFloat144;
		arg0.method3832();
		arg0.method3879(false);
		arg0.method3940(false);
		arg0.method3952();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLclient!um;)V")
	private void method5564(@OriginalArg(1) Class162_Sub1 arg0) {
		arg0.method3940(true);
		arg0.method3879(true);
		if (Static217.aFloat69 != arg0.aFloat144) {
			arg0.ra(Static217.aFloat69);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	public void method5565() {
		this.anInterface8_14.method7032();
	}
}
