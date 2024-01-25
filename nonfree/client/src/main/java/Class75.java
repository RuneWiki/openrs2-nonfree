import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class75 {

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "[I")
	private final int[] anIntArray132 = new int[1600];

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "[I")
	private final int[] anIntArray133 = new int[8191];

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "[[Lclient!di;")
	private final Class14_Sub2_Sub2[][] aClass14_Sub2_Sub2ArrayArray1 = new Class14_Sub2_Sub2[1600][64];

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
	private int anInt1572 = 0;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "[I")
	private final int[] anIntArray134 = new int[64];

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "[[Lclient!di;")
	private final Class14_Sub2_Sub2[][] aClass14_Sub2_Sub2ArrayArray2 = new Class14_Sub2_Sub2[64][768];

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "Lclient!ld;")
	private final Class203 aClass203_1;

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "Lclient!am;")
	private final Interface1 anInterface1_2;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Lclient!am;")
	private final Interface1 anInterface1_1;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "Lclient!rh;")
	private final Interface21 anInterface21_1;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!rv;)V")
	public Class75(@OriginalArg(0) Class126_Sub2 arg0) {
		this.aClass203_1 = arg0.method5525(new Class212[] { new Class212(new Class106[] { Static150.aClass106_1, Static150.aClass106_3, Static150.aClass106_5 }), new Class212(Static150.aClass106_2) });
		this.anInterface1_2 = arg0.method5530(true);
		this.anInterface1_1 = arg0.method5530(false);
		this.anInterface1_1.method7715(12, 393168);
		this.anInterface21_1 = arg0.method5444(false);
		this.anInterface21_1.method5732(49146);
		@Pc(98) Buffer local98 = this.anInterface21_1.method5730();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method5446(local98);
			@Pc(109) int local109;
			if (Stream.b()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.b(local115);
					local105.b(local115 + 1);
					local105.b(local115 + 2);
					local105.b(local115 + 2);
					local105.b(local115 + 3);
					local105.b(local115);
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
			local105.a();
			this.anInterface21_1.method5734();
		}
		@Pc(200) Buffer local200 = this.anInterface1_1.method7714();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method5446(local200);
			if (Stream.b()) {
				for (local115 = 0; local115 < 8191; local115++) {
					local207.a(0.0F);
					local207.a(-1.0F);
					local207.a(0.0F);
					local207.a(0.0F);
					local207.a(-1.0F);
					local207.a(0.0F);
					local207.a(0.0F);
					local207.a(-1.0F);
					local207.a(0.0F);
					local207.a(0.0F);
					local207.a(-1.0F);
					local207.a(0.0F);
				}
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
					local207.b(0.0F);
					local207.b(-1.0F);
					local207.b(0.0F);
					local207.b(0.0F);
					local207.b(-1.0F);
					local207.b(0.0F);
					local207.b(0.0F);
					local207.b(-1.0F);
					local207.b(0.0F);
					local207.b(0.0F);
					local207.b(-1.0F);
					local207.b(0.0F);
				}
			}
			local207.a();
			this.anInterface1_1.method7717();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!rv;Lclient!uj;II)V")
	public void method1465(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(1) Class345 arg1, @OriginalArg(2) int arg2) {
		if (arg0.aClass117_Sub2_16 == null) {
			return;
		}
		if (arg2 < 0) {
			this.method1471(arg0);
		} else {
			this.method1469(arg0, arg2);
		}
		@Pc(29) float local29 = arg0.aClass117_Sub2_16.aFloat55;
		@Pc(33) float local33 = arg0.aClass117_Sub2_16.aFloat58;
		@Pc(37) float local37 = arg0.aClass117_Sub2_16.aFloat60;
		@Pc(41) float local41 = arg0.aClass117_Sub2_16.aFloat49;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(47) int local47 = 0;
			@Pc(51) Class14_Sub2 local51 = arg1.aClass42_1.aClass14_Sub2_5;
			@Pc(54) Class14_Sub2 local54;
			@Pc(86) int local86;
			for (local54 = local51.aClass14_Sub2_9; local54 != local51; local54 = local54.aClass14_Sub2_9) {
				@Pc(59) Class14_Sub2_Sub2 local59 = (Class14_Sub2_Sub2) local54;
				local86 = (int) ((float) (local59.anInt4155 >> 12) * local37 + local33 * (float) (local59.anInt4151 >> 12) + (float) (local59.anInt4154 >> 12) * local29 + local41);
				this.anIntArray133[local43++] = local86;
				if (local45 > local86) {
					local45 = local86;
				}
				if (local86 > local47) {
					local47 = local86;
				}
			}
			@Pc(116) int local116 = local47 - local45;
			if (local116 + 2 <= 1600) {
				local116 += 2;
				local86 = 0;
			} else {
				local86 = Static407.method6237(local116) + 1 - Static25.anInt481;
				local116 = (local116 >> local86) + 2;
			}
			local43 = 0;
			local54 = local51.aClass14_Sub2_9;
			@Pc(147) int local147 = -2;
			@Pc(149) boolean local149 = true;
			@Pc(151) boolean local151 = true;
			while (local51 != local54) {
				this.anInt1572 = 0;
				for (@Pc(158) int local158 = 0; local158 < local116; local158++) {
					this.anIntArray132[local158] = 0;
				}
				for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
					this.anIntArray134[local175] = 0;
				}
				while (local54 != local51) {
					@Pc(191) Class14_Sub2_Sub2 local191 = (Class14_Sub2_Sub2) local54;
					if (local151) {
						local147 = local191.anInt4158;
						local151 = false;
						local149 = local191.aBoolean341;
					}
					if (local43 > 0 && (local191.anInt4158 != local147 || local191.aBoolean341 != local149)) {
						local151 = true;
						break;
					}
					@Pc(230) int local230 = this.anIntArray133[local43++] - local45 >> local86;
					if (local230 < 1600) {
						if (this.anIntArray132[local230] >= 64) {
							label101: {
								if (this.anIntArray132[local230] == 64) {
									if (this.anInt1572 == 64) {
										break label101;
									}
									this.anIntArray132[local230] += this.anInt1572++ + 1;
								}
								@Pc(283) Class14_Sub2_Sub2[] local283 = this.aClass14_Sub2_Sub2ArrayArray2[this.anIntArray132[local230] - 1 - 64];
								@Pc(293) int local293 = this.anIntArray132[local230] - 1 - 64;
								@Pc(295) int local295 = this.anIntArray134[this.anIntArray132[local230] - 1 - 64];
								this.anIntArray134[local293] = this.anIntArray134[this.anIntArray132[local230] - 1 - 64] + 1;
								local283[local295] = local191;
							}
						} else {
							this.aClass14_Sub2_Sub2ArrayArray1[local230][this.anIntArray132[local230]++] = local191;
						}
					}
					local54 = local54.aClass14_Sub2_9;
				}
				arg0.method5482(local147 >= 0 ? local147 : -1, false, false);
				if (local149 && arg0.aFloat119 != Static263.aFloat64) {
					arg0.xa(Static263.aFloat64);
				} else if (arg0.aFloat119 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method1470(arg0, local116);
			}
		} catch (@Pc(367) Exception local367) {
		}
		this.method1468(arg0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!rv;)V")
	public void method1466(@OriginalArg(1) Class126_Sub2 arg0) {
		this.anInterface1_2.method7715(24, 786336);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(ILclient!rv;)V")
	private void method1468(@OriginalArg(1) Class126_Sub2 arg0) {
		arg0.method5470(true);
		arg0.method5544(true);
		if (Static263.aFloat64 != arg0.aFloat119) {
			arg0.xa(Static263.aFloat64);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!rv;II)V")
	private void method1469(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static263.aFloat64 = arg0.aFloat119;
		arg0.method5497((float) arg1);
		arg0.method5572();
		arg0.method5544(false);
		arg0.method5470(false);
		arg0.method5523();
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(Lclient!rv;II)V")
	private void method1470(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class117_Sub2 local11 = arg0.method5539();
		@Pc(14) float local14 = local11.aFloat50;
		@Pc(17) float local17 = local11.aFloat59;
		@Pc(20) float local20 = local11.aFloat54;
		@Pc(23) float local23 = local11.aFloat51;
		@Pc(26) float local26 = local11.aFloat57;
		@Pc(29) float local29 = local11.aFloat53;
		@Pc(33) float local33 = local23 + local14;
		@Pc(37) float local37 = local17 + local26;
		@Pc(41) float local41 = local20 + local29;
		@Pc(45) float local45 = local14 - local23;
		@Pc(50) float local50 = local17 - local26;
		@Pc(54) float local54 = local20 - local29;
		@Pc(58) float local58 = local23 - local14;
		@Pc(62) float local62 = local26 - local17;
		@Pc(67) float local67 = local29 - local20;
		@Pc(73) Buffer local73 = this.anInterface1_2.method7714();
		if (local73 == null) {
			return;
		}
		@Pc(81) Stream local81 = arg0.method5446(local73);
		@Pc(87) int local87;
		@Pc(104) int local104;
		@Pc(113) int local113;
		@Pc(122) Class14_Sub2_Sub2 local122;
		@Pc(125) int local125;
		@Pc(130) byte local130;
		@Pc(135) byte local135;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(149) float local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(166) int local166;
		@Pc(443) float local443;
		@Pc(448) int local448;
		@Pc(388) int local388;
		@Pc(404) Class14_Sub2_Sub2 local404;
		@Pc(407) int local407;
		@Pc(420) byte local420;
		@Pc(425) byte local425;
		@Pc(437) float local437;
		if (Stream.b()) {
			for (local87 = arg1 - 1; local87 >= 0; local87--) {
				local104 = this.anIntArray132[local87] <= 64 ? this.anIntArray132[local87] : 64;
				if (local104 > 0) {
					for (local113 = local104 - 1; local113 >= 0; local113--) {
						local122 = this.aClass14_Sub2_Sub2ArrayArray1[local87][local113];
						local125 = local122.anInt4157;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = (float) (local122.anInt4154 >> 12);
						local155 = (float) (local122.anInt4151 >> 12);
						local161 = (float) (local122.anInt4155 >> 12);
						local166 = local122.anInt4156 >> 12;
						local81.a(local149 + (float) -local166 * local33);
						local81.a(local155 + local37 * (float) -local166);
						local81.a(local41 * (float) -local166 + local161);
						if (arg0.anInt6290 == 0) {
							local81.b(local130, local135, local138, local143);
						} else {
							local81.a(local130, local135, local138, local143);
						}
						local81.a(0.0F);
						local81.a(0.0F);
						local81.a(local149 + (float) local166 * local45);
						local81.a((float) local166 * local50 + local155);
						local81.a(local161 + local54 * (float) local166);
						if (arg0.anInt6290 == 0) {
							local81.b(local130, local135, local138, local143);
						} else {
							local81.a(local130, local135, local138, local143);
						}
						local81.a(1.0F);
						local81.a(0.0F);
						local81.a(local149 + (float) local166 * local33);
						local81.a((float) local166 * local37 + local155);
						local81.a(local161 + local41 * (float) local166);
						if (arg0.anInt6290 == 0) {
							local81.b(local130, local135, local138, local143);
						} else {
							local81.a(local130, local135, local138, local143);
						}
						local81.a(1.0F);
						local81.a(1.0F);
						local81.a(local58 * (float) local166 + local149);
						local81.a(local155 + (float) local166 * local62);
						local81.a(local161 + (float) local166 * local67);
						if (arg0.anInt6290 == 0) {
							local81.b(local130, local135, local138, local143);
						} else {
							local81.a(local130, local135, local138, local143);
						}
						local81.a(0.0F);
						local7++;
						local81.a(1.0F);
					}
					if (this.anIntArray132[local87] > 64) {
						local388 = this.anIntArray132[local87] - 65;
						for (local125 = this.anIntArray134[local388] - 1; local125 >= 0; local125--) {
							local404 = this.aClass14_Sub2_Sub2ArrayArray2[local388][local125];
							local407 = local404.anInt4157;
							local138 = (byte) (local407 >> 16);
							local143 = (byte) (local407 >> 8);
							local420 = (byte) local407;
							local425 = (byte) (local407 >>> 24);
							local161 = (float) (local404.anInt4154 >> 12);
							local437 = (float) (local404.anInt4151 >> 12);
							local443 = (float) (local404.anInt4155 >> 12);
							local448 = local404.anInt4156 >> 12;
							local81.a((float) -local448 * local33 + local161);
							local81.a((float) -local448 * local37 + local437);
							local81.a((float) -local448 * local41 + local443);
							if (arg0.anInt6290 == 0) {
								local81.b(local138, local143, local420, local425);
							} else {
								local81.a(local138, local143, local420, local425);
							}
							local81.a(0.0F);
							local81.a(0.0F);
							local81.a((float) local448 * local45 + local161);
							local81.a(local437 + local50 * (float) local448);
							local81.a(local443 + local54 * (float) local448);
							if (arg0.anInt6290 == 0) {
								local81.b(local138, local143, local420, local425);
							} else {
								local81.a(local138, local143, local420, local425);
							}
							local81.a(1.0F);
							local81.a(0.0F);
							local81.a(local161 + local33 * (float) local448);
							local81.a(local437 + (float) local448 * local37);
							local81.a((float) local448 * local41 + local443);
							if (arg0.anInt6290 == 0) {
								local81.b(local138, local143, local420, local425);
							} else {
								local81.a(local138, local143, local420, local425);
							}
							local81.a(1.0F);
							local81.a(1.0F);
							local81.a((float) local448 * local58 + local161);
							local81.a(local62 * (float) local448 + local437);
							local81.a(local443 + (float) local448 * local67);
							if (arg0.anInt6290 == 0) {
								local81.b(local138, local143, local420, local425);
							} else {
								local81.a(local138, local143, local420, local425);
							}
							local81.a(0.0F);
							local7++;
							local81.a(1.0F);
						}
					}
				}
			}
		} else {
			for (local87 = arg1 - 1; local87 >= 0; local87--) {
				local104 = this.anIntArray132[local87] > 64 ? 64 : this.anIntArray132[local87];
				if (local104 > 0) {
					for (local113 = local104 - 1; local113 >= 0; local113--) {
						local122 = this.aClass14_Sub2_Sub2ArrayArray1[local87][local113];
						local125 = local122.anInt4157;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = (float) (local122.anInt4154 >> 12);
						local155 = (float) (local122.anInt4151 >> 12);
						local161 = (float) (local122.anInt4155 >> 12);
						local166 = local122.anInt4156 >> 12;
						local81.b(local33 * (float) -local166 + local149);
						local81.b((float) -local166 * local37 + local155);
						local81.b((float) -local166 * local41 + local161);
						if (arg0.anInt6290 == 0) {
							local81.b(local130, local135, local138, local143);
						} else {
							local81.a(local130, local135, local138, local143);
						}
						local81.b(0.0F);
						local81.b(0.0F);
						local81.b((float) local166 * local45 + local149);
						local81.b(local155 + local50 * (float) local166);
						local81.b(local54 * (float) local166 + local161);
						if (arg0.anInt6290 == 0) {
							local81.b(local130, local135, local138, local143);
						} else {
							local81.a(local130, local135, local138, local143);
						}
						local81.b(1.0F);
						local81.b(0.0F);
						local81.b(local149 + local33 * (float) local166);
						local81.b(local37 * (float) local166 + local155);
						local81.b(local41 * (float) local166 + local161);
						if (arg0.anInt6290 == 0) {
							local81.b(local130, local135, local138, local143);
						} else {
							local81.a(local130, local135, local138, local143);
						}
						local81.b(1.0F);
						local81.b(1.0F);
						local81.b(local149 + (float) local166 * local58);
						local81.b(local155 + local62 * (float) local166);
						local81.b((float) local166 * local67 + local161);
						if (arg0.anInt6290 == 0) {
							local81.b(local130, local135, local138, local143);
						} else {
							local81.a(local130, local135, local138, local143);
						}
						local81.b(0.0F);
						local7++;
						local81.b(1.0F);
					}
					if (this.anIntArray132[local87] > 64) {
						local388 = this.anIntArray132[local87] - 1 - 64;
						for (local125 = this.anIntArray134[local388] - 1; local125 >= 0; local125--) {
							local404 = this.aClass14_Sub2_Sub2ArrayArray2[local388][local125];
							local407 = local404.anInt4157;
							local138 = (byte) (local407 >> 16);
							local143 = (byte) (local407 >> 8);
							local420 = (byte) local407;
							local425 = (byte) (local407 >>> 24);
							local161 = (float) (local404.anInt4154 >> 12);
							local437 = (float) (local404.anInt4151 >> 12);
							local443 = (float) (local404.anInt4155 >> 12);
							local448 = local404.anInt4156 >> 12;
							local81.b(local161 + (float) -local448 * local33);
							local81.b(local437 + local37 * (float) -local448);
							local81.b((float) -local448 * local41 + local443);
							if (arg0.anInt6290 == 0) {
								local81.b(local138, local143, local420, local425);
							} else {
								local81.a(local138, local143, local420, local425);
							}
							local81.b(0.0F);
							local81.b(0.0F);
							local81.b(local45 * (float) local448 + local161);
							local81.b((float) local448 * local50 + local437);
							local81.b((float) local448 * local54 + local443);
							if (arg0.anInt6290 == 0) {
								local81.b(local138, local143, local420, local425);
							} else {
								local81.a(local138, local143, local420, local425);
							}
							local81.b(1.0F);
							local81.b(0.0F);
							local81.b(local33 * (float) local448 + local161);
							local81.b(local437 + (float) local448 * local37);
							local81.b(local41 * (float) local448 + local443);
							if (arg0.anInt6290 == 0) {
								local81.b(local138, local143, local420, local425);
							} else {
								local81.a(local138, local143, local420, local425);
							}
							local81.b(1.0F);
							local81.b(1.0F);
							local81.b(local58 * (float) local448 + local161);
							local81.b((float) local448 * local62 + local437);
							local81.b(local443 + local67 * (float) local448);
							if (arg0.anInt6290 == 0) {
								local81.b(local138, local143, local420, local425);
							} else {
								local81.a(local138, local143, local420, local425);
							}
							local81.b(0.0F);
							local7++;
							local81.b(1.0F);
						}
					}
				}
			}
		}
		local81.a();
		if (this.anInterface1_2.method7717()) {
			arg0.method5451(0, this.anInterface1_2);
			arg0.method5451(1, this.anInterface1_1);
			arg0.method5524(this.aClass203_1);
			arg0.method5526(this.anInterface21_1, Static370.aClass23_7, local7 * 2, 0, local7 * 4, 0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!rv;Z)V")
	private void method1471(@OriginalArg(0) Class126_Sub2 arg0) {
		Static263.aFloat64 = arg0.aFloat119;
		arg0.method5570();
		arg0.method5544(false);
		arg0.method5470(false);
		arg0.method5523();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	public void method1472() {
		this.anInterface1_2.method7716();
	}
}
