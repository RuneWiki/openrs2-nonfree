import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLclient!oa;I)Z")
	public static boolean method5111(@OriginalArg(1) Class14 arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = (Static473.anInt8075 - 104) / 2;
		@Pc(25) int local25 = (Static165.anInt6749 - 104) / 2;
		@Pc(27) boolean local27 = true;
		@Pc(37) int local37;
		@Pc(48) int local48;
		for (@Pc(29) int local29 = local19; local29 < local19 + 104; local29++) {
			for (@Pc(33) int local33 = local25; local33 < local25 + 104; local33++) {
				for (local37 = arg1; local37 <= 3; local37++) {
					if (Static353.method5386(local33, local29, arg1, local37)) {
						local48 = local37;
						if (Static270.method4475(local29, local33)) {
							local48 = local37 - 1;
						}
						if (local48 >= 0) {
							local27 &= Static342.method5300(local48, local33, local29);
						}
					}
				}
			}
		}
		if (!local27) {
			return false;
		}
		@Pc(93) int[] local93 = new int[262144];
		for (local37 = 0; local37 < local93.length; local37++) {
			local93[local37] = -16777216;
		}
		Static398.aClass58_37 = arg0.method6863(local93, 512, 512, 512);
		Static117.method2478();
		local48 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + (((int) (Math.random() * 20.0D) - 10) + 238 << 8) + 238 - 10 | 0xFF000000;
		@Pc(162) int local162 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x49BFFF00) << 16;
		@Pc(181) int local181 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(189) boolean[][] local189 = new boolean[Static322.anInt5909 + 1][Static322.anInt5909 + 1];
		@Pc(195) int local195;
		@Pc(199) int local199;
		@Pc(201) int local201;
		@Pc(203) int local203;
		@Pc(212) int local212;
		@Pc(222) int local222;
		@Pc(230) int local230;
		@Pc(256) int local256;
		@Pc(260) int local260;
		@Pc(314) int local314;
		@Pc(320) int local320;
		@Pc(324) int local324;
		@Pc(343) int local343;
		for (@Pc(191) int local191 = local19; local191 < local19 + 104; local191 += Static322.anInt5909) {
			for (local195 = local25; local195 < local25 + 104; local195 += Static322.anInt5909) {
				local199 = 0;
				local201 = 0;
				local203 = local191;
				if (local191 > 0) {
					local199 += 4;
					local203 = local191 - 1;
				}
				local212 = local195;
				if (local195 > 0) {
					local212 = local195 - 1;
				}
				local222 = Static322.anInt5909 + local191;
				if (local222 < 104) {
					local222++;
				}
				local230 = Static322.anInt5909 + local195;
				if (local230 < 104) {
					local201 += 4;
					local230++;
				}
				arg0.ca(0, 0, Static322.anInt5909 * 4 + local199, Static322.anInt5909 * 4 + local201);
				arg0.D(-16777216);
				@Pc(264) int local264;
				for (local256 = arg1; local256 <= 3; local256++) {
					for (local260 = 0; local260 <= Static322.anInt5909; local260++) {
						for (local264 = 0; local264 <= Static322.anInt5909; local264++) {
							local189[local260][local264] = Static353.method5386(local264 + local212, local203 - -local260, arg1, local256);
						}
					}
					Static273.aClass59Array4[local256].method7864(local203, local212, local222, local230, local189);
					if (!Static542.aBoolean653) {
						for (local264 = -4; local264 < Static322.anInt5909; local264++) {
							for (local314 = -4; local314 < Static322.anInt5909; local314++) {
								local320 = local191 + local264;
								local324 = local314 + local195;
								if (local320 >= local19 && local25 <= local324 && Static353.method5386(local324, local320, arg1, local256)) {
									local343 = local256;
									if (Static270.method4475(local320, local324)) {
										local343 = local256 - 1;
									}
									if (local343 >= 0) {
										Static31.method4022(local201 + (Static322.anInt5909 - local314) * 4 - 4, local48, local264 * 4 + local199, local324, local162, local343, arg0, local320);
									}
								}
							}
						}
					}
				}
				if (Static542.aBoolean653) {
					@Pc(402) Class189 local402 = Static579.aClass189Array4[arg1];
					for (local264 = 0; local264 < Static322.anInt5909; local264++) {
						for (local314 = 0; local314 < Static322.anInt5909; local314++) {
							local320 = local264 + local191;
							local324 = local314 + local195;
							local343 = local402.anIntArrayArray43[local320 - local402.anInt5301][local324 - local402.anInt5293];
							if ((local343 & 0x40240000) != 0) {
								arg0.method6859(4, local201 + (Static322.anInt5909 - local314) * 4 - 4, local199 - -(local264 * 4), -1713569622, 4);
							} else if ((local343 & 0x800000) != 0) {
								arg0.method6899(-1713569622, 4, local199 + local264 * 4, (Static322.anInt5909 + -local314) * 4 + local201 + -4);
							} else if ((local343 & 0x2000000) != 0) {
								arg0.method6845(4, -1713569622, local264 * 4 + local199 + 3, local201 - -((-local314 + Static322.anInt5909) * 4) + -4);
							} else if ((local343 & 0x8000000) != 0) {
								arg0.method6899(-1713569622, 4, local199 + local264 * 4, local201 + -4 - (-((Static322.anInt5909 - local314) * 4) + -3));
							} else if ((local343 & 0x20000000) != 0) {
								arg0.method6845(4, -1713569622, local264 * 4 + local199, local201 + (-local314 + Static322.anInt5909) * 4 + -4);
							}
						}
					}
				}
				arg0.C(local199, local201, Static322.anInt5909 * 4, Static322.anInt5909 * 4, local181, 2);
				Static398.aClass58_37.GA((local191 - local19) * 4 + 48, -(Static322.anInt5909 * 4) + 464 - (local195 + -local25) * 4, Static322.anInt5909 * 4, Static322.anInt5909 * 4, local199, local201);
			}
		}
		arg0.F();
		arg0.D(-16777215);
		Static415.method7746();
		Static546.anInt9056 = 0;
		Static295.aClass361_45.method7842();
		if (!Static542.aBoolean653) {
			for (local195 = local19; local195 < local19 + 104; local195++) {
				for (local199 = local25; local199 < local25 + 104; local199++) {
					for (local201 = arg1; arg1 + 1 >= local201 && local201 <= 3; local201++) {
						if (Static353.method5386(local199, local195, arg1, local201)) {
							@Pc(691) Interface18 local691 = (Interface18) Static300.method4758(local201, local195, local199);
							if (local691 == null) {
								local691 = (Interface18) Static117.method2480(local201, local195, local199, pba.class);
							}
							if (local691 == null) {
								local691 = (Interface18) Static162.method2962(local201, local195, local199);
							}
							if (local691 == null) {
								local691 = (Interface18) Static401.method5859(local201, local195, local199);
							}
							if (local691 != null) {
								@Pc(732) Class252 local732 = Static412.aClass307_4.method6636(local691.method6265());
								if (!local732.aBoolean480 || Static448.aBoolean544) {
									local222 = local732.anInt6921;
									if (local732.anIntArray506 != null) {
										for (local230 = 0; local230 < local732.anIntArray506.length; local230++) {
											if (local732.anIntArray506[local230] != -1) {
												@Pc(761) Class252 local761 = Static412.aClass307_4.method6636(local732.anIntArray506[local230]);
												if (local761.anInt6921 >= 0) {
													local222 = local761.anInt6921;
												}
											}
										}
									}
									if (local222 >= 0) {
										@Pc(787) boolean local787 = false;
										if (local222 >= 0) {
											@Pc(797) Class176 local797 = Static245.aClass213_3.method5127(local222);
											if (local797 != null && local797.aBoolean357) {
												local787 = true;
											}
										}
										local256 = local195;
										local260 = local199;
										if (local787) {
											@Pc(815) int[][] local815 = Static579.aClass189Array4[local201].anIntArrayArray43;
											local314 = Static579.aClass189Array4[local201].anInt5301;
											local320 = Static579.aClass189Array4[local201].anInt5293;
											for (local324 = 0; local324 < 10; local324++) {
												local343 = (int) (Math.random() * 4.0D);
												if (local343 == 0 && local256 > local19 && local256 > local195 - 3 && (local815[local256 - local314 - 1][local260 - local320] & 0x2C0108) == 0) {
													local256--;
												}
												if (local343 == 1 && local256 < local19 + 104 - 1 && local195 + 3 > local256 && (local815[local256 + 1 - local314][local260 - local320] & 0x2C0180) == 0) {
													local256++;
												}
												if (local343 == 2 && local260 > local25 && local260 > local199 - 3 && (local815[local256 - local314][local260 - local320 - 1] & 0x2C0102) == 0) {
													local260--;
												}
												if (local343 == 3 && local25 + 104 - 1 > local260 && local199 + 3 > local260 && (local815[local256 - local314][local260 + 1 - local320] & 0x2C0120) == 0) {
													local260++;
												}
											}
										}
										Static410.anIntArray528[Static546.anInt9056] = local732.anInt6905;
										Static66.anIntArray127[Static546.anInt9056] = local256;
										Static392.anIntArray582[Static546.anInt9056] = local260;
										Static546.anInt9056++;
									}
								}
							}
						}
					}
				}
			}
			if (Static216.aClass303_3 != null) {
				Static579.aClass251_129.anInt6868 = 1;
				Static245.aClass213_3.method5128(1024, 64);
				for (local199 = 0; local199 < Static216.aClass303_3.anInt8095; local199++) {
					local201 = Static216.aClass303_3.anIntArray596[local199];
					if (Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 == local201 >> 28) {
						local203 = (local201 >> 14 & 0x3FFF) - Static39.anInt4952;
						local212 = (local201 & 0x3FFF) - Static138.anInt3088;
						if (local203 >= 0 && Static473.anInt8075 > local203 && local212 >= 0 && local212 < Static165.anInt6749) {
							Static295.aClass361_45.method7833(new Class6_Sub35(local199));
						} else {
							@Pc(1104) Class176 local1104 = Static245.aClass213_3.method5127(Static216.aClass303_3.anIntArray597[local199]);
							if (local1104.anIntArray385 != null && local203 + local1104.anInt5070 >= 0 && Static473.anInt8075 > local203 + local1104.anInt5069 && local212 + local1104.anInt5086 >= 0 && Static165.anInt6749 > local212 + local1104.anInt5071) {
								Static295.aClass361_45.method7833(new Class6_Sub35(local199));
							}
						}
					}
				}
				Static245.aClass213_3.method5128(128, 64);
				Static579.aClass251_129.anInt6868 = 2;
				Static579.aClass251_129.method5777();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!ba;IIII)Lclient!qt;")
	public static Class277 method5117(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return arg0 == null ? null : new Class277(arg3, arg2, arg1, arg0.ZA(), arg0.ha(), arg0.M(), arg0.DA(), arg0.EA(), arg0.LA(), arg0.K());
	}
}
