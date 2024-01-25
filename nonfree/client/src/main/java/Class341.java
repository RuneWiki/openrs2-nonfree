import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class341 {

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "[I")
	private final int[] anIntArray512 = new int[8191];

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "[[Lclient!ej;")
	private final Class4_Sub1_Sub1[][] aClass4_Sub1_Sub1ArrayArray3 = new Class4_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "[[Lclient!ej;")
	private final Class4_Sub1_Sub1[][] aClass4_Sub1_Sub1ArrayArray4 = new Class4_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!tu", name = "r", descriptor = "[I")
	private final int[] anIntArray513 = new int[64];

	@OriginalMember(owner = "client!tu", name = "u", descriptor = "[I")
	private final int[] anIntArray514 = new int[1600];

	@OriginalMember(owner = "client!tu", name = "y", descriptor = "I")
	private int anInt9350 = 0;

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "Lclient!fk;")
	private final Class90 aClass90_22;

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "Lclient!fb;")
	private final Interface6 anInterface6_14;

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "Lclient!fb;")
	private final Interface6 anInterface6_13;

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "Lclient!oq;")
	private final Interface14 anInterface14_8;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!pj;)V")
	public Class341(@OriginalArg(0) Class133_Sub1 arg0) {
		this.aClass90_22 = arg0.method6154(new Class40[] { new Class40(new Class266[] { Static420.aClass266_1, Static420.aClass266_3, Static420.aClass266_5 }), new Class40(Static420.aClass266_2) });
		this.anInterface6_14 = arg0.method6196(true);
		this.anInterface6_13 = arg0.method6196(false);
		this.anInterface6_13.method4124(393168, 12);
		this.anInterface14_8 = arg0.method6281(false);
		this.anInterface14_8.method6764(49146);
		@Pc(98) Buffer local98 = this.anInterface14_8.method6770();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method6242(local98);
			@Pc(109) int local109;
			if (Stream.a()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.f(local115);
					local105.f(local115 + 1);
					local105.f(local115 + 2);
					local105.f(local115 + 2);
					local105.f(local115 + 3);
					local105.f(local115);
				}
			} else {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.e(local115);
					local105.e(local115 + 1);
					local105.e(local115 + 2);
					local105.e(local115 + 2);
					local105.e(local115 + 3);
					local105.e(local115);
				}
			}
			local105.b();
			this.anInterface14_8.method6769();
		}
		@Pc(198) Buffer local198 = this.anInterface6_13.method4126();
		if (local198 != null) {
			@Pc(205) Stream local205 = arg0.method6242(local198);
			if (Stream.a()) {
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
			local205.b();
			this.anInterface6_13.method4123();
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!pj;)V")
	private void method8056(@OriginalArg(1) Class133_Sub1 arg0) {
		Static98.aFloat96 = arg0.aFloat129;
		arg0.method6221();
		arg0.method6185(false);
		arg0.method6259(false);
		arg0.method6285();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!pj;II)V")
	private void method8057(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(19) Class113_Sub1 local19 = arg0.method6262();
		@Pc(22) float local22 = local19.aFloat39;
		@Pc(25) float local25 = local19.aFloat46;
		@Pc(28) float local28 = local19.aFloat38;
		@Pc(31) float local31 = local19.aFloat40;
		@Pc(34) float local34 = local19.aFloat44;
		@Pc(37) float local37 = local19.aFloat41;
		@Pc(41) float local41 = local22 + local31;
		@Pc(45) float local45 = local34 + local25;
		@Pc(49) float local49 = local28 + local37;
		@Pc(53) float local53 = local22 - local31;
		@Pc(58) float local58 = local25 - local34;
		@Pc(62) float local62 = local28 - local37;
		@Pc(66) float local66 = local31 - local22;
		@Pc(70) float local70 = local34 - local25;
		@Pc(74) float local74 = local37 - local28;
		@Pc(80) Buffer local80 = this.anInterface6_14.method4126();
		if (local80 == null) {
			return;
		}
		@Pc(88) Stream local88 = arg0.method6242(local80);
		@Pc(94) int local94;
		@Pc(111) int local111;
		@Pc(120) int local120;
		@Pc(129) Class4_Sub1_Sub1 local129;
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
		@Pc(405) Class4_Sub1_Sub1 local405;
		@Pc(408) int local408;
		@Pc(421) byte local421;
		@Pc(426) byte local426;
		@Pc(438) float local438;
		if (Stream.a()) {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local111 = this.anIntArray514[local94] > 64 ? 64 : this.anIntArray514[local94];
				if (local111 > 0) {
					for (local120 = local111 - 1; local120 >= 0; local120--) {
						local129 = this.aClass4_Sub1_Sub1ArrayArray3[local94][local120];
						local132 = local129.anInt51;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = local129.anInt45 >> 12;
						local162 = local129.anInt52 >> 12;
						local168 = local129.anInt46 >> 12;
						local173 = local129.anInt47 >> 12;
						local88.a(local156 + local41 * (float) -local173);
						local88.a(local162 + (float) -local173 * local45);
						local88.a((float) -local173 * local49 + local168);
						if (arg0.anInt7000 == 0) {
							local88.a(local137, local142, local145, local150);
						} else {
							local88.b(local137, local142, local145, local150);
						}
						local88.a(0.0F);
						local88.a(0.0F);
						local88.a(local53 * (float) local173 + local156);
						local88.a(local58 * (float) local173 + local162);
						local88.a(local168 + local62 * (float) local173);
						if (arg0.anInt7000 == 0) {
							local88.a(local137, local142, local145, local150);
						} else {
							local88.b(local137, local142, local145, local150);
						}
						local88.a(1.0F);
						local88.a(0.0F);
						local88.a(local41 * (float) local173 + local156);
						local88.a(local162 + local45 * (float) local173);
						local88.a(local49 * (float) local173 + local168);
						if (arg0.anInt7000 == 0) {
							local88.a(local137, local142, local145, local150);
						} else {
							local88.b(local137, local142, local145, local150);
						}
						local88.a(1.0F);
						local88.a(1.0F);
						local88.a(local156 + local66 * (float) local173);
						local88.a((float) local173 * local70 + local162);
						local88.a(local74 * (float) local173 + local168);
						if (arg0.anInt7000 == 0) {
							local88.a(local137, local142, local145, local150);
						} else {
							local88.b(local137, local142, local145, local150);
						}
						local88.a(0.0F);
						local7++;
						local88.a(1.0F);
					}
					if (this.anIntArray514[local94] > 64) {
						local389 = this.anIntArray514[local94] - 65;
						for (local132 = this.anIntArray513[local389] - 1; local132 >= 0; local132--) {
							local405 = this.aClass4_Sub1_Sub1ArrayArray4[local389][local132];
							local408 = local405.anInt51;
							local145 = (byte) (local408 >> 16);
							local150 = (byte) (local408 >> 8);
							local421 = (byte) local408;
							local426 = (byte) (local408 >>> 24);
							local168 = local405.anInt45 >> 12;
							local438 = local405.anInt52 >> 12;
							local444 = local405.anInt46 >> 12;
							local449 = local405.anInt47 >> 12;
							local88.a(local168 + local41 * (float) -local449);
							local88.a(local45 * (float) -local449 + local438);
							local88.a(local49 * (float) -local449 + local444);
							if (arg0.anInt7000 == 0) {
								local88.a(local145, local150, local421, local426);
							} else {
								local88.b(local145, local150, local421, local426);
							}
							local88.a(0.0F);
							local88.a(0.0F);
							local88.a(local168 + local53 * (float) local449);
							local88.a(local438 + local58 * (float) local449);
							local88.a((float) local449 * local62 + local444);
							if (arg0.anInt7000 == 0) {
								local88.a(local145, local150, local421, local426);
							} else {
								local88.b(local145, local150, local421, local426);
							}
							local88.a(1.0F);
							local88.a(0.0F);
							local88.a(local168 + local41 * (float) local449);
							local88.a(local45 * (float) local449 + local438);
							local88.a(local444 + (float) local449 * local49);
							if (arg0.anInt7000 == 0) {
								local88.a(local145, local150, local421, local426);
							} else {
								local88.b(local145, local150, local421, local426);
							}
							local88.a(1.0F);
							local88.a(1.0F);
							local88.a(local168 + (float) local449 * local66);
							local88.a(local438 + local70 * (float) local449);
							local88.a((float) local449 * local74 + local444);
							if (arg0.anInt7000 == 0) {
								local88.a(local145, local150, local421, local426);
							} else {
								local88.b(local145, local150, local421, local426);
							}
							local88.a(0.0F);
							local7++;
							local88.a(1.0F);
						}
					}
				}
			}
		} else {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local111 = this.anIntArray514[local94] > 64 ? 64 : this.anIntArray514[local94];
				if (local111 > 0) {
					for (local120 = local111 - 1; local120 >= 0; local120--) {
						local129 = this.aClass4_Sub1_Sub1ArrayArray3[local94][local120];
						local132 = local129.anInt51;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = local129.anInt45 >> 12;
						local162 = local129.anInt52 >> 12;
						local168 = local129.anInt46 >> 12;
						local173 = local129.anInt47 >> 12;
						local88.b(local156 + (float) -local173 * local41);
						local88.b(local45 * (float) -local173 + local162);
						local88.b(local49 * (float) -local173 + local168);
						if (arg0.anInt7000 == 0) {
							local88.a(local137, local142, local145, local150);
						} else {
							local88.b(local137, local142, local145, local150);
						}
						local88.b(0.0F);
						local88.b(0.0F);
						local88.b(local156 + local53 * (float) local173);
						local88.b(local162 + (float) local173 * local58);
						local88.b((float) local173 * local62 + local168);
						if (arg0.anInt7000 == 0) {
							local88.a(local137, local142, local145, local150);
						} else {
							local88.b(local137, local142, local145, local150);
						}
						local88.b(1.0F);
						local88.b(0.0F);
						local88.b(local156 + (float) local173 * local41);
						local88.b(local162 + local45 * (float) local173);
						local88.b((float) local173 * local49 + local168);
						if (arg0.anInt7000 == 0) {
							local88.a(local137, local142, local145, local150);
						} else {
							local88.b(local137, local142, local145, local150);
						}
						local88.b(1.0F);
						local88.b(1.0F);
						local88.b(local156 + (float) local173 * local66);
						local88.b(local162 + local70 * (float) local173);
						local88.b(local74 * (float) local173 + local168);
						if (arg0.anInt7000 == 0) {
							local88.a(local137, local142, local145, local150);
						} else {
							local88.b(local137, local142, local145, local150);
						}
						local88.b(0.0F);
						local7++;
						local88.b(1.0F);
					}
					if (this.anIntArray514[local94] > 64) {
						local389 = this.anIntArray514[local94] - 1 - 64;
						for (local132 = this.anIntArray513[local389] - 1; local132 >= 0; local132--) {
							local405 = this.aClass4_Sub1_Sub1ArrayArray4[local389][local132];
							local408 = local405.anInt51;
							local145 = (byte) (local408 >> 16);
							local150 = (byte) (local408 >> 8);
							local421 = (byte) local408;
							local426 = (byte) (local408 >>> 24);
							local168 = local405.anInt45 >> 12;
							local438 = local405.anInt52 >> 12;
							local444 = local405.anInt46 >> 12;
							local449 = local405.anInt47 >> 12;
							local88.b((float) -local449 * local41 + local168);
							local88.b(local438 + local45 * (float) -local449);
							local88.b(local444 + local49 * (float) -local449);
							if (arg0.anInt7000 == 0) {
								local88.a(local145, local150, local421, local426);
							} else {
								local88.b(local145, local150, local421, local426);
							}
							local88.b(0.0F);
							local88.b(0.0F);
							local88.b(local168 + (float) local449 * local53);
							local88.b(local438 + (float) local449 * local58);
							local88.b((float) local449 * local62 + local444);
							if (arg0.anInt7000 == 0) {
								local88.a(local145, local150, local421, local426);
							} else {
								local88.b(local145, local150, local421, local426);
							}
							local88.b(1.0F);
							local88.b(0.0F);
							local88.b(local41 * (float) local449 + local168);
							local88.b(local438 + local45 * (float) local449);
							local88.b(local444 + local49 * (float) local449);
							if (arg0.anInt7000 == 0) {
								local88.a(local145, local150, local421, local426);
							} else {
								local88.b(local145, local150, local421, local426);
							}
							local88.b(1.0F);
							local88.b(1.0F);
							local88.b(local168 + local66 * (float) local449);
							local88.b(local70 * (float) local449 + local438);
							local88.b((float) local449 * local74 + local444);
							if (arg0.anInt7000 == 0) {
								local88.a(local145, local150, local421, local426);
							} else {
								local88.b(local145, local150, local421, local426);
							}
							local88.b(0.0F);
							local88.b(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local88.b();
		if (this.anInterface6_14.method4123()) {
			arg0.method6215(this.anInterface6_14, 0);
			arg0.method6215(this.anInterface6_13, 1);
			arg0.method6217(this.aClass90_22);
			arg0.method6194(local7 * 2, local7 * 4, 0, this.anInterface14_8, 0, Static68.aClass303_2);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V")
	public void method8058() {
		this.anInterface6_14.method6765();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!pj;BI)V")
	private void method8059(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static98.aFloat96 = arg0.aFloat129;
		arg0.method6254((float) arg1);
		arg0.method6199();
		arg0.method6185(false);
		arg0.method6259(false);
		arg0.method6285();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!pj;ILclient!mp;Z)V")
	public void method8063(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class235 arg2) {
		if (arg0.aClass113_Sub1_16 == null) {
			return;
		}
		if (arg1 >= 0) {
			this.method8059(arg0, arg1);
		} else {
			this.method8056(arg0);
		}
		@Pc(30) float local30 = arg0.aClass113_Sub1_16.aFloat43;
		@Pc(34) float local34 = arg0.aClass113_Sub1_16.aFloat42;
		@Pc(38) float local38 = arg0.aClass113_Sub1_16.aFloat45;
		@Pc(42) float local42 = arg0.aClass113_Sub1_16.aFloat47;
		try {
			@Pc(44) int local44 = 0;
			@Pc(46) int local46 = Integer.MAX_VALUE;
			@Pc(48) int local48 = 0;
			@Pc(52) Class4_Sub1 local52 = arg2.aClass287_1.aClass4_Sub1_9;
			@Pc(55) Class4_Sub1 local55;
			@Pc(87) int local87;
			for (local55 = local52.aClass4_Sub1_8; local55 != local52; local55 = local55.aClass4_Sub1_8) {
				@Pc(60) Class4_Sub1_Sub1 local60 = (Class4_Sub1_Sub1) local55;
				local87 = (int) (local42 + (float) (local60.anInt52 >> 12) * local34 + local30 * (float) (local60.anInt45 >> 12) + local38 * (float) (local60.anInt46 >> 12));
				if (local87 > local48) {
					local48 = local87;
				}
				this.anIntArray512[local44++] = local87;
				if (local87 < local46) {
					local46 = local87;
				}
			}
			@Pc(117) int local117 = local48 - local46;
			if (local117 + 2 <= 1600) {
				local87 = 0;
				local117 += 2;
			} else {
				local87 = Static172.method2668(local117) + 1 - Static503.anInt8760;
				local117 = (local117 >> local87) + 2;
			}
			local44 = 0;
			local55 = local52.aClass4_Sub1_8;
			@Pc(148) int local148 = -2;
			@Pc(150) boolean local150 = true;
			@Pc(152) boolean local152 = true;
			while (local52 != local55) {
				this.anInt9350 = 0;
				for (@Pc(159) int local159 = 0; local159 < local117; local159++) {
					this.anIntArray514[local159] = 0;
				}
				for (@Pc(176) int local176 = 0; local176 < 64; local176++) {
					this.anIntArray513[local176] = 0;
				}
				while (local52 != local55) {
					@Pc(194) Class4_Sub1_Sub1 local194 = (Class4_Sub1_Sub1) local55;
					if (local152) {
						local150 = local194.aBoolean3;
						local152 = false;
						local148 = local194.anInt48;
					}
					if (local44 > 0 && (local148 != local194.anInt48 || local150 != local194.aBoolean3)) {
						local152 = true;
						break;
					}
					@Pc(235) int local235 = this.anIntArray512[local44++] - local46 >> local87;
					if (local235 < 1600) {
						if (this.anIntArray514[local235] >= 64) {
							label97: {
								if (this.anIntArray514[local235] == 64) {
									if (this.anInt9350 == 64) {
										break label97;
									}
									this.anIntArray514[local235] += this.anInt9350++ + 1;
								}
								this.aClass4_Sub1_Sub1ArrayArray4[this.anIntArray514[local235] - 65][this.anIntArray513[this.anIntArray514[local235] - 1 - 64]++] = local194;
							}
						} else {
							this.aClass4_Sub1_Sub1ArrayArray3[local235][this.anIntArray514[local235]++] = local194;
						}
					}
					local55 = local55.aClass4_Sub1_8;
				}
				arg0.method6277(false, local148 >= 0 ? local148 : -1, false);
				if (local150 && Static98.aFloat96 != arg0.aFloat129) {
					arg0.xa(Static98.aFloat96);
				} else if (arg0.aFloat129 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method8057(arg0, local117);
			}
		} catch (@Pc(368) Exception local368) {
		}
		this.method8066(arg0);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!pj;I)V")
	public void method8064(@OriginalArg(0) Class133_Sub1 arg0) {
		this.anInterface6_14.method4124(786336, 24);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLclient!pj;)V")
	private void method8066(@OriginalArg(1) Class133_Sub1 arg0) {
		arg0.method6259(true);
		arg0.method6185(true);
		if (arg0.aFloat129 != Static98.aFloat96) {
			arg0.xa(Static98.aFloat96);
		}
	}
}
