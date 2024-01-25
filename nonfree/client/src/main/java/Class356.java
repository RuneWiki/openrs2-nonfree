import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class356 {

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "[I")
	private final int[] anIntArray675 = new int[64];

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	private int anInt10481 = 0;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "[[Lclient!jc;")
	private final Class3_Sub2_Sub2[][] aClass3_Sub2_Sub2ArrayArray3 = new Class3_Sub2_Sub2[1600][64];

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "[I")
	private final int[] anIntArray676 = new int[8191];

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "[[Lclient!jc;")
	private final Class3_Sub2_Sub2[][] aClass3_Sub2_Sub2ArrayArray4 = new Class3_Sub2_Sub2[64][768];

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "[I")
	private final int[] anIntArray677 = new int[1600];

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "Lclient!np;")
	private final Class22 aClass22_23;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "Lclient!tc;")
	private final Interface22 anInterface22_18;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Lclient!tc;")
	private final Interface22 anInterface22_17;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "Lclient!uq;")
	private final Interface24 anInterface24_8;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!wga;)V")
	public Class356(@OriginalArg(0) Class20_Sub2 arg0) {
		this.aClass22_23 = arg0.method1446(new Class168[] { new Class168(new Class69[] { Static88.aClass69_1, Static88.aClass69_3, Static88.aClass69_5 }), new Class168(Static88.aClass69_2) });
		this.anInterface22_18 = arg0.method1523(true);
		this.anInterface22_17 = arg0.method1523(false);
		this.anInterface22_17.method764(393168, 12);
		this.anInterface24_8 = arg0.method1474(false);
		this.anInterface24_8.method6476(49146);
		@Pc(98) Buffer local98 = this.anInterface24_8.method6477();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method1527(local98);
			@Pc(109) int local109;
			if (Stream.c()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.d(local115);
					local105.d(local115 + 1);
					local105.d(local115 + 2);
					local105.d(local115 + 2);
					local105.d(local115 + 3);
					local105.d(local115);
				}
			} else {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.a(local115);
					local105.a(local115 + 1);
					local105.a(local115 + 2);
					local105.a(local115 + 2);
					local105.a(local115 + 3);
					local105.a(local115);
				}
			}
			local105.a();
			this.anInterface24_8.method6474();
		}
		@Pc(198) Buffer local198 = this.anInterface22_17.method763();
		if (local198 != null) {
			@Pc(205) Stream local205 = arg0.method1527(local198);
			if (Stream.c()) {
				for (local115 = 0; local115 < 8191; local115++) {
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
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
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
			}
			local205.a();
			this.anInterface22_17.method762();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!wga;II)V")
	private void method8746(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static487.aFloat200 = arg0.aFloat51;
		arg0.method1501((float) arg1);
		arg0.method1491();
		arg0.method1499(false);
		arg0.method1580(false);
		arg0.method1576();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!wga;)V")
	private void method8747(@OriginalArg(1) Class20_Sub2 arg0) {
		arg0.method1580(true);
		arg0.method1499(true);
		if (Static487.aFloat200 != arg0.aFloat51) {
			arg0.xa(Static487.aFloat200);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLclient!wga;)V")
	public void method8748(@OriginalArg(1) Class20_Sub2 arg0) {
		this.anInterface22_18.method764(786336, 24);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!wga;Lclient!mda;II)V")
	public void method8749(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) int arg2) {
		if (arg0.aClass30_Sub2_16 == null) {
			return;
		}
		if (arg2 >= 0) {
			this.method8746(arg0, arg2);
		} else {
			this.method8751(arg0);
		}
		@Pc(29) float local29 = arg0.aClass30_Sub2_16.aFloat130;
		@Pc(33) float local33 = arg0.aClass30_Sub2_16.aFloat119;
		@Pc(37) float local37 = arg0.aClass30_Sub2_16.aFloat125;
		@Pc(41) float local41 = arg0.aClass30_Sub2_16.aFloat127;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(47) int local47 = 0;
			@Pc(51) Class3_Sub2 local51 = arg1.aClass194_1.aClass3_Sub2_7;
			@Pc(54) Class3_Sub2 local54;
			@Pc(86) int local86;
			for (local54 = local51.aClass3_Sub2_10; local54 != local51; local54 = local54.aClass3_Sub2_10) {
				@Pc(59) Class3_Sub2_Sub2 local59 = (Class3_Sub2_Sub2) local54;
				local86 = (int) ((float) (local59.anInt8145 >> 12) * local29 + local33 * (float) (local59.anInt8148 >> 12) + (float) (local59.anInt8143 >> 12) * local37 + local41);
				if (local86 > local47) {
					local47 = local86;
				}
				this.anIntArray676[local43++] = local86;
				if (local45 > local86) {
					local45 = local86;
				}
			}
			@Pc(117) int local117 = local47 - local45;
			if (local117 + 2 > 1600) {
				local86 = Static627.method7088(local117) + 1 - Static427.anInt8028;
				local117 = (local117 >> local86) + 2;
			} else {
				local86 = 0;
				local117 += 2;
			}
			local54 = local51.aClass3_Sub2_10;
			local43 = 0;
			@Pc(151) int local151 = -2;
			@Pc(153) boolean local153 = true;
			@Pc(155) boolean local155 = true;
			while (local54 != local51) {
				this.anInt10481 = 0;
				for (@Pc(162) int local162 = 0; local162 < local117; local162++) {
					this.anIntArray677[local162] = 0;
				}
				for (@Pc(179) int local179 = 0; local179 < 64; local179++) {
					this.anIntArray675[local179] = 0;
				}
				while (local54 != local51) {
					@Pc(195) Class3_Sub2_Sub2 local195 = (Class3_Sub2_Sub2) local54;
					if (local155) {
						local153 = local195.aBoolean576;
						local151 = local195.anInt8146;
						local155 = false;
					}
					if (local43 > 0 && (local151 != local195.anInt8146 || local153 != local195.aBoolean576)) {
						local155 = true;
						break;
					}
					@Pc(238) int local238 = this.anIntArray676[local43++] - local45 >> local86;
					if (local238 < 1600) {
						if (this.anIntArray677[local238] < 64) {
							this.aClass3_Sub2_Sub2ArrayArray3[local238][this.anIntArray677[local238]++] = local195;
						} else {
							label107: {
								if (this.anIntArray677[local238] == 64) {
									if (this.anInt10481 == 64) {
										break label107;
									}
									this.anIntArray677[local238] += this.anInt10481++ + 1;
								}
								@Pc(305) Class3_Sub2_Sub2[] local305 = this.aClass3_Sub2_Sub2ArrayArray4[this.anIntArray677[local238] - 65];
								@Pc(313) int local313 = this.anIntArray677[local238] - 65;
								@Pc(315) int local315 = this.anIntArray675[this.anIntArray677[local238] - 65];
								this.anIntArray675[local313] = this.anIntArray675[this.anIntArray677[local238] - 65] + 1;
								local305[local315] = local195;
							}
						}
					}
					local54 = local54.aClass3_Sub2_10;
				}
				arg0.method1448(false, false, local151 >= 0 ? local151 : -1);
				if (local153 && Static487.aFloat200 != arg0.aFloat51) {
					arg0.xa(Static487.aFloat200);
				} else if (arg0.aFloat51 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method8750(arg0, local117);
			}
		} catch (@Pc(367) Exception local367) {
		}
		this.method8747(arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLclient!wga;I)V")
	private void method8750(@OriginalArg(1) Class20_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 0;
		@Pc(19) Class30_Sub2 local19 = arg0.method1582();
		@Pc(22) float local22 = local19.aFloat124;
		@Pc(25) float local25 = local19.aFloat120;
		@Pc(28) float local28 = local19.aFloat121;
		@Pc(31) float local31 = local19.aFloat122;
		@Pc(34) float local34 = local19.aFloat126;
		@Pc(37) float local37 = local19.aFloat129;
		@Pc(41) float local41 = local31 + local22;
		@Pc(45) float local45 = local25 + local34;
		@Pc(49) float local49 = local28 + local37;
		@Pc(53) float local53 = local22 - local31;
		@Pc(57) float local57 = local25 - local34;
		@Pc(62) float local62 = local28 - local37;
		@Pc(66) float local66 = local31 - local22;
		@Pc(71) float local71 = local34 - local25;
		@Pc(76) float local76 = local37 - local28;
		@Pc(82) Buffer local82 = this.anInterface22_18.method763();
		if (local82 == null) {
			return;
		}
		@Pc(90) Stream local90 = arg0.method1527(local82);
		@Pc(96) int local96;
		@Pc(111) int local111;
		@Pc(120) int local120;
		@Pc(129) Class3_Sub2_Sub2 local129;
		@Pc(132) int local132;
		@Pc(137) byte local137;
		@Pc(142) byte local142;
		@Pc(145) byte local145;
		@Pc(150) byte local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(168) float local168;
		@Pc(173) int local173;
		@Pc(444) float local444;
		@Pc(449) int local449;
		@Pc(389) int local389;
		@Pc(405) Class3_Sub2_Sub2 local405;
		@Pc(408) int local408;
		@Pc(421) byte local421;
		@Pc(426) byte local426;
		@Pc(438) float local438;
		if (Stream.c()) {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local111 = this.anIntArray677[local96] > 64 ? 64 : this.anIntArray677[local96];
				if (local111 > 0) {
					for (local120 = local111 - 1; local120 >= 0; local120--) {
						local129 = this.aClass3_Sub2_Sub2ArrayArray3[local96][local120];
						local132 = local129.anInt8144;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = local129.anInt8145 >> 12;
						local162 = local129.anInt8148 >> 12;
						local168 = local129.anInt8143 >> 12;
						local173 = local129.anInt8147 >> 12;
						local90.a(local41 * (float) -local173 + local156);
						local90.a(local162 + local45 * (float) -local173);
						local90.a(local168 + (float) -local173 * local49);
						if (arg0.anInt1576 == 0) {
							local90.b(local137, local142, local145, local150);
						} else {
							local90.a(local137, local142, local145, local150);
						}
						local90.a(0.0F);
						local90.a(0.0F);
						local90.a(local53 * (float) local173 + local156);
						local90.a((float) local173 * local57 + local162);
						local90.a(local168 + local62 * (float) local173);
						if (arg0.anInt1576 == 0) {
							local90.b(local137, local142, local145, local150);
						} else {
							local90.a(local137, local142, local145, local150);
						}
						local90.a(1.0F);
						local90.a(0.0F);
						local90.a(local156 + local41 * (float) local173);
						local90.a(local162 + local45 * (float) local173);
						local90.a(local49 * (float) local173 + local168);
						if (arg0.anInt1576 == 0) {
							local90.b(local137, local142, local145, local150);
						} else {
							local90.a(local137, local142, local145, local150);
						}
						local90.a(1.0F);
						local90.a(1.0F);
						local90.a(local156 + local66 * (float) local173);
						local90.a(local162 + local71 * (float) local173);
						local90.a(local168 + local76 * (float) local173);
						if (arg0.anInt1576 == 0) {
							local90.b(local137, local142, local145, local150);
						} else {
							local90.a(local137, local142, local145, local150);
						}
						local90.a(0.0F);
						local15++;
						local90.a(1.0F);
					}
					if (this.anIntArray677[local96] > 64) {
						local389 = this.anIntArray677[local96] - 65;
						for (local132 = this.anIntArray675[local389] - 1; local132 >= 0; local132--) {
							local405 = this.aClass3_Sub2_Sub2ArrayArray4[local389][local132];
							local408 = local405.anInt8144;
							local145 = (byte) (local408 >> 16);
							local150 = (byte) (local408 >> 8);
							local421 = (byte) local408;
							local426 = (byte) (local408 >>> 24);
							local168 = local405.anInt8145 >> 12;
							local438 = local405.anInt8148 >> 12;
							local444 = local405.anInt8143 >> 12;
							local449 = local405.anInt8147 >> 12;
							local90.a(local41 * (float) -local449 + local168);
							local90.a((float) -local449 * local45 + local438);
							local90.a(local444 + local49 * (float) -local449);
							if (arg0.anInt1576 == 0) {
								local90.b(local145, local150, local421, local426);
							} else {
								local90.a(local145, local150, local421, local426);
							}
							local90.a(0.0F);
							local90.a(0.0F);
							local90.a(local53 * (float) local449 + local168);
							local90.a((float) local449 * local57 + local438);
							local90.a((float) local449 * local62 + local444);
							if (arg0.anInt1576 == 0) {
								local90.b(local145, local150, local421, local426);
							} else {
								local90.a(local145, local150, local421, local426);
							}
							local90.a(1.0F);
							local90.a(0.0F);
							local90.a(local168 + (float) local449 * local41);
							local90.a((float) local449 * local45 + local438);
							local90.a((float) local449 * local49 + local444);
							if (arg0.anInt1576 == 0) {
								local90.b(local145, local150, local421, local426);
							} else {
								local90.a(local145, local150, local421, local426);
							}
							local90.a(1.0F);
							local90.a(1.0F);
							local90.a((float) local449 * local66 + local168);
							local90.a((float) local449 * local71 + local438);
							local90.a(local444 + (float) local449 * local76);
							if (arg0.anInt1576 == 0) {
								local90.b(local145, local150, local421, local426);
							} else {
								local90.a(local145, local150, local421, local426);
							}
							local90.a(0.0F);
							local15++;
							local90.a(1.0F);
						}
					}
				}
			}
		} else {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local111 = this.anIntArray677[local96] > 64 ? 64 : this.anIntArray677[local96];
				if (local111 > 0) {
					for (local120 = local111 - 1; local120 >= 0; local120--) {
						local129 = this.aClass3_Sub2_Sub2ArrayArray3[local96][local120];
						local132 = local129.anInt8144;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = local129.anInt8145 >> 12;
						local162 = local129.anInt8148 >> 12;
						local168 = local129.anInt8143 >> 12;
						local173 = local129.anInt8147 >> 12;
						local90.b((float) -local173 * local41 + local156);
						local90.b(local162 + (float) -local173 * local45);
						local90.b((float) -local173 * local49 + local168);
						if (arg0.anInt1576 == 0) {
							local90.b(local137, local142, local145, local150);
						} else {
							local90.a(local137, local142, local145, local150);
						}
						local90.b(0.0F);
						local90.b(0.0F);
						local90.b(local156 + (float) local173 * local53);
						local90.b(local162 + (float) local173 * local57);
						local90.b(local168 + (float) local173 * local62);
						if (arg0.anInt1576 == 0) {
							local90.b(local137, local142, local145, local150);
						} else {
							local90.a(local137, local142, local145, local150);
						}
						local90.b(1.0F);
						local90.b(0.0F);
						local90.b(local156 + local41 * (float) local173);
						local90.b(local45 * (float) local173 + local162);
						local90.b(local49 * (float) local173 + local168);
						if (arg0.anInt1576 == 0) {
							local90.b(local137, local142, local145, local150);
						} else {
							local90.a(local137, local142, local145, local150);
						}
						local90.b(1.0F);
						local90.b(1.0F);
						local90.b(local66 * (float) local173 + local156);
						local90.b((float) local173 * local71 + local162);
						local90.b(local168 + local76 * (float) local173);
						if (arg0.anInt1576 == 0) {
							local90.b(local137, local142, local145, local150);
						} else {
							local90.a(local137, local142, local145, local150);
						}
						local90.b(0.0F);
						local15++;
						local90.b(1.0F);
					}
					if (this.anIntArray677[local96] > 64) {
						local389 = this.anIntArray677[local96] - 64 - 1;
						for (local132 = this.anIntArray675[local389] - 1; local132 >= 0; local132--) {
							local405 = this.aClass3_Sub2_Sub2ArrayArray4[local389][local132];
							local408 = local405.anInt8144;
							local145 = (byte) (local408 >> 16);
							local150 = (byte) (local408 >> 8);
							local421 = (byte) local408;
							local426 = (byte) (local408 >>> 24);
							local168 = local405.anInt8145 >> 12;
							local438 = local405.anInt8148 >> 12;
							local444 = local405.anInt8143 >> 12;
							local449 = local405.anInt8147 >> 12;
							local90.b(local168 + (float) -local449 * local41);
							local90.b((float) -local449 * local45 + local438);
							local90.b(local444 + local49 * (float) -local449);
							if (arg0.anInt1576 == 0) {
								local90.b(local145, local150, local421, local426);
							} else {
								local90.a(local145, local150, local421, local426);
							}
							local90.b(0.0F);
							local90.b(0.0F);
							local90.b(local168 + (float) local449 * local53);
							local90.b(local57 * (float) local449 + local438);
							local90.b(local62 * (float) local449 + local444);
							if (arg0.anInt1576 == 0) {
								local90.b(local145, local150, local421, local426);
							} else {
								local90.a(local145, local150, local421, local426);
							}
							local90.b(1.0F);
							local90.b(0.0F);
							local90.b(local168 + (float) local449 * local41);
							local90.b((float) local449 * local45 + local438);
							local90.b(local49 * (float) local449 + local444);
							if (arg0.anInt1576 == 0) {
								local90.b(local145, local150, local421, local426);
							} else {
								local90.a(local145, local150, local421, local426);
							}
							local90.b(1.0F);
							local90.b(1.0F);
							local90.b(local168 + local66 * (float) local449);
							local90.b(local438 + (float) local449 * local71);
							local90.b((float) local449 * local76 + local444);
							if (arg0.anInt1576 == 0) {
								local90.b(local145, local150, local421, local426);
							} else {
								local90.a(local145, local150, local421, local426);
							}
							local90.b(0.0F);
							local90.b(1.0F);
							local15++;
						}
					}
				}
			}
		}
		local90.a();
		if (this.anInterface22_18.method762()) {
			arg0.method1559(this.anInterface22_18, 0);
			arg0.method1559(this.anInterface22_17, 1);
			arg0.method1496(this.aClass22_23);
			arg0.method1572(Static539.aClass134_6, local15 * 2, this.anInterface24_8, 0, 0, local15 * 4);
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(BLclient!wga;)V")
	private void method8751(@OriginalArg(1) Class20_Sub2 arg0) {
		Static487.aFloat200 = arg0.aFloat51;
		arg0.method1459();
		arg0.method1499(false);
		arg0.method1580(false);
		arg0.method1576();
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public void method8753() {
		this.anInterface22_18.method6475();
	}
}
