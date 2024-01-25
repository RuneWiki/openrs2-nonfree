import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class97 {

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "[I")
	private final int[] anIntArray158 = new int[1600];

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "[[Lclient!tha;")
	private final Class9_Sub1_Sub1[][] aClass9_Sub1_Sub1ArrayArray1 = new Class9_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!fea", name = "n", descriptor = "[I")
	private final int[] anIntArray159 = new int[64];

	@OriginalMember(owner = "client!fea", name = "l", descriptor = "I")
	private int anInt3551 = 0;

	@OriginalMember(owner = "client!fea", name = "q", descriptor = "[I")
	private final int[] anIntArray160 = new int[8191];

	@OriginalMember(owner = "client!fea", name = "r", descriptor = "[[Lclient!tha;")
	private final Class9_Sub1_Sub1[][] aClass9_Sub1_Sub1ArrayArray2 = new Class9_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!fea", name = "f", descriptor = "Lclient!qa;")
	private final Class270 aClass270_15;

	@OriginalMember(owner = "client!fea", name = "y", descriptor = "Lclient!tea;")
	private final Interface26 anInterface26_8;

	@OriginalMember(owner = "client!fea", name = "i", descriptor = "Lclient!tea;")
	private final Interface26 anInterface26_7;

	@OriginalMember(owner = "client!fea", name = "d", descriptor = "Lclient!ug;")
	private final Interface27 anInterface27_5;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lclient!uv;)V")
	public Class97(@OriginalArg(0) Class5_Sub2 arg0) {
		this.aClass270_15 = arg0.method3985(new Class63[] { new Class63(new Class183[] { Static315.aClass183_1, Static315.aClass183_3, Static315.aClass183_5 }), new Class63(Static315.aClass183_2) });
		this.anInterface26_8 = arg0.method4063(true);
		this.anInterface26_7 = arg0.method4063(false);
		this.anInterface26_7.method8109(12, 393168);
		this.anInterface27_5 = arg0.method3993(false);
		this.anInterface27_5.method8101(49146);
		@Pc(98) Buffer local98 = this.anInterface27_5.method7962();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method4046(local98);
			@Pc(109) int local109;
			if (Stream.a()) {
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
					local105.d(local115);
					local105.d(local115 + 1);
					local105.d(local115 + 2);
					local105.d(local115 + 2);
					local105.d(local115 + 3);
					local105.d(local115);
				}
			}
			local105.c();
			this.anInterface27_5.method7963();
		}
		@Pc(202) Buffer local202 = this.anInterface26_7.method8110();
		if (local202 != null) {
			@Pc(209) Stream local209 = arg0.method4046(local202);
			if (Stream.a()) {
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
			} else {
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
			}
			local209.c();
			this.anInterface26_7.method8107();
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!uv;BI)V")
	private void method3036(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class115_Sub3 local11 = arg0.method4030();
		@Pc(14) float local14 = local11.aFloat152;
		@Pc(17) float local17 = local11.aFloat151;
		@Pc(20) float local20 = local11.aFloat146;
		@Pc(23) float local23 = local11.aFloat154;
		@Pc(26) float local26 = local11.aFloat147;
		@Pc(29) float local29 = local11.aFloat150;
		@Pc(33) float local33 = local23 + local14;
		@Pc(37) float local37 = local17 + local26;
		@Pc(41) float local41 = local20 + local29;
		@Pc(46) float local46 = local14 - local23;
		@Pc(51) float local51 = local17 - local26;
		@Pc(56) float local56 = local20 - local29;
		@Pc(61) float local61 = local23 - local14;
		@Pc(65) float local65 = local26 - local17;
		@Pc(69) float local69 = local29 - local20;
		@Pc(80) Buffer local80 = this.anInterface26_8.method8110();
		if (local80 == null) {
			return;
		}
		@Pc(90) Stream local90 = arg0.method4046(local80);
		@Pc(96) int local96;
		@Pc(111) int local111;
		@Pc(120) int local120;
		@Pc(129) Class9_Sub1_Sub1 local129;
		@Pc(132) int local132;
		@Pc(137) byte local137;
		@Pc(142) byte local142;
		@Pc(145) byte local145;
		@Pc(150) byte local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(168) float local168;
		@Pc(173) int local173;
		@Pc(447) float local447;
		@Pc(452) int local452;
		@Pc(392) int local392;
		@Pc(408) Class9_Sub1_Sub1 local408;
		@Pc(411) int local411;
		@Pc(424) byte local424;
		@Pc(429) byte local429;
		@Pc(441) float local441;
		if (Stream.a()) {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local111 = this.anIntArray158[local96] > 64 ? 64 : this.anIntArray158[local96];
				if (local111 > 0) {
					for (local120 = local111 - 1; local120 >= 0; local120--) {
						local129 = this.aClass9_Sub1_Sub1ArrayArray2[local96][local120];
						local132 = local129.anInt507;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = (float) (local129.anInt505 >> 12);
						local162 = (float) (local129.anInt506 >> 12);
						local168 = (float) (local129.anInt504 >> 12);
						local173 = local129.anInt508 >> 12;
						local90.b(local156 + local33 * (float) -local173);
						local90.b(local162 + local37 * (float) -local173);
						local90.b((float) -local173 * local41 + local168);
						if (arg0.anInt4868 == 0) {
							local90.a(local137, local142, local145, local150);
						} else {
							local90.b(local137, local142, local145, local150);
						}
						local90.b(0.0F);
						local90.b(0.0F);
						local90.b(local156 + local46 * (float) local173);
						local90.b(local162 + local51 * (float) local173);
						local90.b(local56 * (float) local173 + local168);
						if (arg0.anInt4868 == 0) {
							local90.a(local137, local142, local145, local150);
						} else {
							local90.b(local137, local142, local145, local150);
						}
						local90.b(1.0F);
						local90.b(0.0F);
						local90.b(local33 * (float) local173 + local156);
						local90.b((float) local173 * local37 + local162);
						local90.b((float) local173 * local41 + local168);
						if (arg0.anInt4868 == 0) {
							local90.a(local137, local142, local145, local150);
						} else {
							local90.b(local137, local142, local145, local150);
						}
						local90.b(1.0F);
						local90.b(1.0F);
						local90.b(local156 + local61 * (float) local173);
						local90.b(local65 * (float) local173 + local162);
						local90.b((float) local173 * local69 + local168);
						if (arg0.anInt4868 == 0) {
							local90.a(local137, local142, local145, local150);
						} else {
							local90.b(local137, local142, local145, local150);
						}
						local90.b(0.0F);
						local7++;
						local90.b(1.0F);
					}
					if (this.anIntArray158[local96] > 64) {
						local392 = this.anIntArray158[local96] - 64 - 1;
						for (local132 = this.anIntArray159[local392] - 1; local132 >= 0; local132--) {
							local408 = this.aClass9_Sub1_Sub1ArrayArray1[local392][local132];
							local411 = local408.anInt507;
							local145 = (byte) (local411 >> 16);
							local150 = (byte) (local411 >> 8);
							local424 = (byte) local411;
							local429 = (byte) (local411 >>> 24);
							local168 = (float) (local408.anInt505 >> 12);
							local441 = (float) (local408.anInt506 >> 12);
							local447 = (float) (local408.anInt504 >> 12);
							local452 = local408.anInt508 >> 12;
							local90.b(local168 + local33 * (float) -local452);
							local90.b(local37 * (float) -local452 + local441);
							local90.b(local447 + (float) -local452 * local41);
							if (arg0.anInt4868 == 0) {
								local90.a(local145, local150, local424, local429);
							} else {
								local90.b(local145, local150, local424, local429);
							}
							local90.b(0.0F);
							local90.b(0.0F);
							local90.b(local46 * (float) local452 + local168);
							local90.b((float) local452 * local51 + local441);
							local90.b(local447 + local56 * (float) local452);
							if (arg0.anInt4868 == 0) {
								local90.a(local145, local150, local424, local429);
							} else {
								local90.b(local145, local150, local424, local429);
							}
							local90.b(1.0F);
							local90.b(0.0F);
							local90.b(local168 + local33 * (float) local452);
							local90.b(local441 + (float) local452 * local37);
							local90.b(local447 + (float) local452 * local41);
							if (arg0.anInt4868 == 0) {
								local90.a(local145, local150, local424, local429);
							} else {
								local90.b(local145, local150, local424, local429);
							}
							local90.b(1.0F);
							local90.b(1.0F);
							local90.b(local168 + (float) local452 * local61);
							local90.b((float) local452 * local65 + local441);
							local90.b(local447 + (float) local452 * local69);
							if (arg0.anInt4868 == 0) {
								local90.a(local145, local150, local424, local429);
							} else {
								local90.b(local145, local150, local424, local429);
							}
							local90.b(0.0F);
							local7++;
							local90.b(1.0F);
						}
					}
				}
			}
		} else {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local111 = this.anIntArray158[local96] > 64 ? 64 : this.anIntArray158[local96];
				if (local111 > 0) {
					for (local120 = local111 - 1; local120 >= 0; local120--) {
						local129 = this.aClass9_Sub1_Sub1ArrayArray2[local96][local120];
						local132 = local129.anInt507;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = (float) (local129.anInt505 >> 12);
						local162 = (float) (local129.anInt506 >> 12);
						local168 = (float) (local129.anInt504 >> 12);
						local173 = local129.anInt508 >> 12;
						local90.a((float) -local173 * local33 + local156);
						local90.a(local162 + local37 * (float) -local173);
						local90.a(local168 + (float) -local173 * local41);
						if (arg0.anInt4868 == 0) {
							local90.a(local137, local142, local145, local150);
						} else {
							local90.b(local137, local142, local145, local150);
						}
						local90.a(0.0F);
						local90.a(0.0F);
						local90.a(local156 + (float) local173 * local46);
						local90.a(local162 + (float) local173 * local51);
						local90.a(local56 * (float) local173 + local168);
						if (arg0.anInt4868 == 0) {
							local90.a(local137, local142, local145, local150);
						} else {
							local90.b(local137, local142, local145, local150);
						}
						local90.a(1.0F);
						local90.a(0.0F);
						local90.a((float) local173 * local33 + local156);
						local90.a((float) local173 * local37 + local162);
						local90.a(local168 + (float) local173 * local41);
						if (arg0.anInt4868 == 0) {
							local90.a(local137, local142, local145, local150);
						} else {
							local90.b(local137, local142, local145, local150);
						}
						local90.a(1.0F);
						local90.a(1.0F);
						local90.a(local156 + local61 * (float) local173);
						local90.a((float) local173 * local65 + local162);
						local90.a((float) local173 * local69 + local168);
						if (arg0.anInt4868 == 0) {
							local90.a(local137, local142, local145, local150);
						} else {
							local90.b(local137, local142, local145, local150);
						}
						local90.a(0.0F);
						local7++;
						local90.a(1.0F);
					}
					if (this.anIntArray158[local96] > 64) {
						local392 = this.anIntArray158[local96] - 64 - 1;
						for (local132 = this.anIntArray159[local392] - 1; local132 >= 0; local132--) {
							local408 = this.aClass9_Sub1_Sub1ArrayArray1[local392][local132];
							local411 = local408.anInt507;
							local145 = (byte) (local411 >> 16);
							local150 = (byte) (local411 >> 8);
							local424 = (byte) local411;
							local429 = (byte) (local411 >>> 24);
							local168 = (float) (local408.anInt505 >> 12);
							local441 = (float) (local408.anInt506 >> 12);
							local447 = (float) (local408.anInt504 >> 12);
							local452 = local408.anInt508 >> 12;
							local90.a((float) -local452 * local33 + local168);
							local90.a(local441 + local37 * (float) -local452);
							local90.a((float) -local452 * local41 + local447);
							if (arg0.anInt4868 == 0) {
								local90.a(local145, local150, local424, local429);
							} else {
								local90.b(local145, local150, local424, local429);
							}
							local90.a(0.0F);
							local90.a(0.0F);
							local90.a((float) local452 * local46 + local168);
							local90.a(local441 + (float) local452 * local51);
							local90.a(local447 + local56 * (float) local452);
							if (arg0.anInt4868 == 0) {
								local90.a(local145, local150, local424, local429);
							} else {
								local90.b(local145, local150, local424, local429);
							}
							local90.a(1.0F);
							local90.a(0.0F);
							local90.a(local168 + local33 * (float) local452);
							local90.a(local441 + local37 * (float) local452);
							local90.a(local41 * (float) local452 + local447);
							if (arg0.anInt4868 == 0) {
								local90.a(local145, local150, local424, local429);
							} else {
								local90.b(local145, local150, local424, local429);
							}
							local90.a(1.0F);
							local90.a(1.0F);
							local90.a(local61 * (float) local452 + local168);
							local90.a(local441 + local65 * (float) local452);
							local90.a((float) local452 * local69 + local447);
							if (arg0.anInt4868 == 0) {
								local90.a(local145, local150, local424, local429);
							} else {
								local90.b(local145, local150, local424, local429);
							}
							local90.a(0.0F);
							local90.a(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local90.c();
		if (this.anInterface26_8.method8107()) {
			arg0.method3974(0, this.anInterface26_8);
			arg0.method3974(1, this.anInterface26_7);
			arg0.method4045(this.aClass270_15);
			arg0.method3976(Static574.aClass248_11, local7 * 4, 0, this.anInterface27_5, 0, local7 * 2);
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!uv;B)V")
	public void method3037(@OriginalArg(0) Class5_Sub2 arg0) {
		this.anInterface26_8.method8109(24, 786336);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!uv;I)V")
	private void method3038(@OriginalArg(0) Class5_Sub2 arg0) {
		Static170.aFloat74 = arg0.aFloat93;
		arg0.method3979();
		arg0.method3989(false);
		arg0.method4000(false);
		arg0.method3963();
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V")
	public void method3039() {
		this.anInterface26_8.method8104();
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILclient!uv;)V")
	private void method3041(@OriginalArg(1) Class5_Sub2 arg0) {
		arg0.method4000(true);
		arg0.method3989(true);
		if (Static170.aFloat74 != arg0.aFloat93) {
			arg0.xa(Static170.aFloat74);
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(BLclient!pf;ILclient!uv;)V")
	public void method3043(@OriginalArg(1) Class257 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub2 arg2) {
		if (arg2.aClass115_Sub3_16 == null) {
			return;
		}
		if (arg1 < 0) {
			this.method3038(arg2);
		} else {
			this.method3044(arg1, arg2);
		}
		@Pc(26) float local26 = arg2.aClass115_Sub3_16.aFloat148;
		@Pc(30) float local30 = arg2.aClass115_Sub3_16.aFloat153;
		@Pc(34) float local34 = arg2.aClass115_Sub3_16.aFloat145;
		@Pc(38) float local38 = arg2.aClass115_Sub3_16.aFloat144;
		try {
			@Pc(40) int local40 = 0;
			@Pc(42) int local42 = Integer.MAX_VALUE;
			@Pc(44) int local44 = 0;
			@Pc(48) Class9_Sub1 local48 = arg0.aClass362_1.aClass9_Sub1_9;
			@Pc(51) Class9_Sub1 local51;
			@Pc(83) int local83;
			for (local51 = local48.aClass9_Sub1_7; local51 != local48; local51 = local51.aClass9_Sub1_7) {
				@Pc(56) Class9_Sub1_Sub1 local56 = (Class9_Sub1_Sub1) local51;
				local83 = (int) (local38 + (float) (local56.anInt504 >> 12) * local34 + (float) (local56.anInt506 >> 12) * local30 + (float) (local56.anInt505 >> 12) * local26);
				if (local44 < local83) {
					local44 = local83;
				}
				if (local83 < local42) {
					local42 = local83;
				}
				this.anIntArray160[local40++] = local83;
			}
			@Pc(117) int local117 = local44 - local42;
			if (local117 + 2 <= 1600) {
				local117 += 2;
				local83 = 0;
			} else {
				local83 = Static126.method2629(local117) + 1 - Static636.anInt9233;
				local117 = (local117 >> local83) + 2;
			}
			local40 = 0;
			local51 = local48.aClass9_Sub1_7;
			@Pc(151) int local151 = -2;
			@Pc(159) boolean local159 = true;
			@Pc(161) boolean local161 = true;
			while (local48 != local51) {
				this.anInt3551 = 0;
				for (@Pc(168) int local168 = 0; local168 < local117; local168++) {
					this.anIntArray158[local168] = 0;
				}
				for (@Pc(185) int local185 = 0; local185 < 64; local185++) {
					this.anIntArray159[local185] = 0;
				}
				while (local51 != local48) {
					@Pc(201) Class9_Sub1_Sub1 local201 = (Class9_Sub1_Sub1) local51;
					if (local161) {
						local161 = false;
						local159 = local201.aBoolean53;
						local151 = local201.anInt509;
					}
					if (local40 > 0 && (local151 != local201.anInt509 || local201.aBoolean53 != local159)) {
						local161 = true;
						break;
					}
					@Pc(240) int local240 = this.anIntArray160[local40++] - local42 >> local83;
					if (local240 < 1600) {
						if (this.anIntArray158[local240] < 64) {
							this.aClass9_Sub1_Sub1ArrayArray2[local240][this.anIntArray158[local240]++] = local201;
						} else {
							label102: {
								if (this.anIntArray158[local240] == 64) {
									if (this.anInt3551 == 64) {
										break label102;
									}
									this.anIntArray158[local240] += this.anInt3551++ + 1;
								}
								this.aClass9_Sub1_Sub1ArrayArray1[this.anIntArray158[local240] - 64 - 1][this.anIntArray159[this.anIntArray158[local240] - 1 - 64]++] = local201;
							}
						}
					}
					local51 = local51.aClass9_Sub1_7;
				}
				arg2.method4042(false, local151 < 0 ? -1 : local151, false);
				if (local159 && Static170.aFloat74 != arg2.aFloat93) {
					arg2.xa(Static170.aFloat74);
				} else if (arg2.aFloat93 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method3036(arg2, local117);
			}
		} catch (@Pc(382) Exception local382) {
		}
		this.method3041(arg2);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IILclient!uv;)V")
	private void method3044(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub2 arg1) {
		Static170.aFloat74 = arg1.aFloat93;
		arg1.method4059((float) arg0);
		arg1.method3940();
		arg1.method3989(false);
		arg1.method4000(false);
		arg1.method3963();
	}
}
