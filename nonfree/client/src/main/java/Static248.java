import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
	public static int anInt4641 = -1;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "Lclient!rr;")
	public static final Class290 aClass290_2 = new Class290(1);

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
	public static int anInt4642 = 0;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
	public static int anInt4644 = -1;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)Z")
	public static boolean method3988(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			return false;
		} else {
			return local12 < 128 || local12 >= 160 || Static355.aCharArray6[local12 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
	public static int method3989(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static1.method40(arg0);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILclient!r;I)V")
	public static void method3990(@OriginalArg(0) int arg0, @OriginalArg(2) Class12 arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || arg2 < 0 || Static28.anInt3098 == 0 || Static87.anInt1966 == 0) {
			return;
		}
		arg1.la(Static309.anInt5591, Static574.anInt9353, Static28.anInt3098, Static87.anInt1966);
		arg1.da(Static539.anInt8888, Static89.anInt1988, Static28.anInt3098, Static87.anInt1966);
		@Pc(42) Class209 local42 = arg1.method6410();
		local42.na(Static160.anInt8856, Static584.anInt9458, Static247.anInt4639, Static554.anInt9070, Static33.anInt896, Static177.anInt2099);
		arg1.method6471(local42);
		@Pc(62) int local62;
		@Pc(71) int local71;
		@Pc(80) int local80;
		@Pc(83) int local83;
		@Pc(92) int local92;
		@Pc(101) int local101;
		@Pc(134) int[] local134;
		@Pc(148) int local148;
		@Pc(157) int local157;
		@Pc(166) int local166;
		@Pc(179) int local179;
		if (Static158.aClass17Array2 != null) {
			@Pc(57) int local57 = -1;
			@Pc(59) int local59 = -1;
			local62 = arg1.BA();
			local71 = (arg0 - Static309.anInt5591) * local62 / Static28.anInt3098;
			local80 = (arg2 - Static574.anInt9353) * local62 / Static87.anInt1966;
			local83 = arg1.U();
			local92 = local83 * (arg0 - Static309.anInt5591) / Static28.anInt3098;
			local101 = local83 * (arg2 - Static574.anInt9353) / Static87.anInt1966;
			@Pc(116) int[] local116 = new int[] { local71, local80, local62 };
			local42.YA(local116);
			local134 = new int[] { local92, local101, local83 };
			local42.YA(local134);
			@Pc(139) float local139 = 0.0F;
			local148 = local134[0] - local116[0];
			local157 = local134[1] - local116[1];
			local166 = local134[2] - local116[2];
			while (local139 < 1.0F) {
				local179 = (int) ((float) local116[0] + (float) local148 * local139);
				@Pc(183) int local183 = local179 >> 9;
				@Pc(194) int local194 = (int) ((float) local116[2] + (float) local166 * local139);
				@Pc(198) int local198 = local194 >> 9;
				if (local183 > 0 && local198 > 0 && Static500.anInt6888 > local183 && local198 < Static573.anInt9325) {
					@Pc(219) int local219 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116;
					if (local219 < 3 && (Static511.aByteArrayArrayArray19[1][local183][local198] & 0x2) != 0) {
						local219++;
					}
					if ((float) Static158.aClass17Array2[local219].method6637(local179, local194) < (float) local116[1] + local139 * (float) local157) {
						local57 = (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.method5349() - 1 << 8) + local179 >> 9;
						local59 = (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.method5349() - 1 << 8) + local194 >> 9;
						break;
					}
				}
				local139 = (float) ((double) local139 + 0.01D);
			}
			if (local57 != -1 && local59 != -1) {
				if (Static22.aBoolean43 && (Static434.anInt7646 & 0x40) != 0) {
					@Pc(349) Class365 local349 = Static583.method7803(Static365.anInt6484, Static39.anInt1026);
					if (local349 == null) {
						Static130.method6495();
					} else {
						Static374.method5440(true, -1, 20, Static559.aString92, false, 0L, Static3.anInt71, local59, local57, " ->");
					}
				} else {
					if (Static275.aClass230_2 == Static353.aClass230_3) {
						Static374.method5440(true, -1, 25, Static103.aClass77_29.method1864(Static562.anInt9127), false, 0L, -1, local59, local57, "");
					}
					Static374.method5440(true, -1, 12, Static415.aString77, false, 0L, Static17.anInt562, local59, local57, "");
				}
			}
		}
		@Pc(369) Class349 local369 = Static312.aClass349_8;
		for (@Pc(374) Class20_Sub8 local374 = (Class20_Sub8) local369.method7653(); local374 != null; local374 = (Class20_Sub8) local369.method7660()) {
			if ((Static11.aBoolean10 || Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 == local374.aClass20_Sub2_1.aByte116) && local374.method6356(arg1, arg2, arg0)) {
				if (local374.aClass20_Sub2_1 instanceof Class20_Sub2_Sub4) {
					local71 = ((Class20_Sub2_Sub4) local374.aClass20_Sub2_1).aShort97;
					local62 = ((Class20_Sub2_Sub4) local374.aClass20_Sub2_1).aShort100;
				} else {
					local62 = local374.aClass20_Sub2_1.anInt8796 >> 9;
					local71 = local374.aClass20_Sub2_1.anInt8795 >> 9;
				}
				@Pc(498) int local498;
				@Pc(611) int local611;
				if (local374.aClass20_Sub2_1 instanceof Class20_Sub2_Sub4_Sub1_Sub1) {
					@Pc(431) Class20_Sub2_Sub4_Sub1_Sub1 local431 = (Class20_Sub2_Sub4_Sub1_Sub1) local374.aClass20_Sub2_1;
					local83 = local431.method5349();
					if ((local83 & 0x1) == 0 && (local431.anInt8796 & 0x1FF) == 0 && (local431.anInt8795 & 0x1FF) == 0 || (local83 & 0x1) == 1 && (local431.anInt8796 & 0x1FF) == 256 && (local431.anInt8795 & 0x1FF) == 256) {
						local92 = local431.anInt8796 - (local431.method5349() - 1 << 8);
						local101 = local431.anInt8795 - (local431.method5349() - 1 << 8);
						for (local498 = 0; local498 < Static480.anInt8097; local498++) {
							@Pc(509) Class1_Sub39 local509 = (Class1_Sub39) Static131.aClass356_32.method7796((long) Static542.anIntArray599[local498]);
							if (local509 != null) {
								@Pc(514) Class20_Sub2_Sub4_Sub1_Sub2 local514 = local509.aClass20_Sub2_Sub4_Sub1_Sub2_2;
								if (local514.anInt6422 != Static81.anInt1910 && local514.aBoolean458) {
									local148 = local514.anInt8796 - (local514.aClass162_1.anInt4408 - 1 << 8);
									local157 = local514.anInt8795 - (local514.aClass162_1.anInt4408 - 1 << 8);
									if (local148 >= local92 && local514.aClass162_1.anInt4408 <= local431.method5349() - (local148 - local92 >> 9) && local101 <= local157 && local514.aClass162_1.anInt4408 <= local431.method5349() - (local157 - local101 >> 9)) {
										Static140.method2303(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 != local374.aClass20_Sub2_1.aByte116, local514);
										local514.anInt6422 = Static81.anInt1910;
									}
								}
							}
						}
						local611 = Static60.anInt1505;
						@Pc(613) int[] local613 = Static346.anIntArray413;
						for (local148 = 0; local148 < local611; local148++) {
							@Pc(623) Class20_Sub2_Sub4_Sub1_Sub1 local623 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local613[local148]];
							if (local623 != null && Static81.anInt1910 != local623.anInt6422 && local623 != local431 && local623.aBoolean458) {
								local166 = local623.anInt8796 - (local623.method5349() - 1 << 8);
								local179 = local623.anInt8795 - (local623.method5349() - 1 << 8);
								if (local166 >= local92 && local623.method5349() <= local431.method5349() - (local166 - local92 >> 9) && local179 >= local101 && local623.method5349() <= local431.method5349() - (local179 - local101 >> 9)) {
									Static296.method4672(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 != local374.aClass20_Sub2_1.aByte116, local623);
									local623.anInt6422 = Static81.anInt1910;
								}
							}
						}
					}
					if (local431.anInt6422 == Static81.anInt1910) {
						continue;
					}
					Static296.method4672(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 != local374.aClass20_Sub2_1.aByte116, local431);
					local431.anInt6422 = Static81.anInt1910;
				}
				@Pc(870) int local870;
				if (local374.aClass20_Sub2_1 instanceof Class20_Sub2_Sub4_Sub1_Sub2) {
					@Pc(753) Class20_Sub2_Sub4_Sub1_Sub2 local753 = (Class20_Sub2_Sub4_Sub1_Sub2) local374.aClass20_Sub2_1;
					if (local753.aClass162_1 != null) {
						if ((local753.aClass162_1.anInt4408 & 0x1) == 0 && (local753.anInt8796 & 0x1FF) == 0 && (local753.anInt8795 & 0x1FF) == 0 || (local753.aClass162_1.anInt4408 & 0x1) == 1 && (local753.anInt8796 & 0x1FF) == 256 && (local753.anInt8795 & 0x1FF) == 256) {
							local83 = local753.anInt8796 - (local753.aClass162_1.anInt4408 - 1 << 8);
							local92 = local753.anInt8795 - (local753.aClass162_1.anInt4408 - 1 << 8);
							for (local101 = 0; local101 < Static480.anInt8097; local101++) {
								@Pc(837) Class1_Sub39 local837 = (Class1_Sub39) Static131.aClass356_32.method7796((long) Static542.anIntArray599[local101]);
								if (local837 != null) {
									@Pc(842) Class20_Sub2_Sub4_Sub1_Sub2 local842 = local837.aClass20_Sub2_Sub4_Sub1_Sub2_2;
									if (Static81.anInt1910 != local842.anInt6422 && local842 != local753 && local842.aBoolean458) {
										local870 = local842.anInt8796 - (local842.aClass162_1.anInt4408 - 1 << 8);
										local148 = local842.anInt8795 - (local842.aClass162_1.anInt4408 - 1 << 8);
										if (local870 >= local83 && local753.aClass162_1.anInt4408 - (local870 - local83 >> 9) >= local842.aClass162_1.anInt4408 && local92 <= local148 && local842.aClass162_1.anInt4408 <= local753.aClass162_1.anInt4408 - (local148 - local92 >> 9)) {
											Static140.method2303(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 != local374.aClass20_Sub2_1.aByte116, local842);
											local842.anInt6422 = Static81.anInt1910;
										}
									}
								}
							}
							local498 = Static60.anInt1505;
							local134 = Static346.anIntArray413;
							for (local870 = 0; local870 < local498; local870++) {
								@Pc(959) Class20_Sub2_Sub4_Sub1_Sub1 local959 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local134[local870]];
								if (local959 != null && Static81.anInt1910 != local959.anInt6422 && local959.aBoolean458) {
									local157 = local959.anInt8796 - (local959.method5349() - 1 << 8);
									local166 = local959.anInt8795 - (local959.method5349() - 1 << 8);
									if (local157 >= local83 && local959.method5349() <= local753.aClass162_1.anInt4408 - (local157 - local83 >> 9) && local92 <= local166 && local959.method5349() <= local753.aClass162_1.anInt4408 - (local166 - local92 >> 9)) {
										Static296.method4672(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 != local374.aClass20_Sub2_1.aByte116, local959);
										local959.anInt6422 = Static81.anInt1910;
									}
								}
							}
						}
						if (Static81.anInt1910 == local753.anInt6422) {
							continue;
						}
						Static140.method2303(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 != local374.aClass20_Sub2_1.aByte116, local753);
						local753.anInt6422 = Static81.anInt1910;
					}
				}
				if (local374.aClass20_Sub2_1 instanceof Class20_Sub2_Sub5_Sub1) {
					local80 = Static376.anInt6631 + local62;
					local83 = local71 + Static24.anInt674;
					@Pc(1114) Class1_Sub37 local1114 = (Class1_Sub37) Static186.aClass356_13.method7796((long) (local374.aClass20_Sub2_1.aByte116 << 28 | local83 << 14 | local80));
					if (local1114 != null) {
						for (@Pc(1122) Class1_Sub34 local1122 = (Class1_Sub34) local1114.aClass361_66.method7848(); local1122 != null; local1122 = (Class1_Sub34) local1114.aClass361_66.method7859()) {
							@Pc(1130) Class322 local1130 = Static46.aClass234_1.method5390(local1122.anInt6203);
							if (Static22.aBoolean43 && local374.aClass20_Sub2_1.aByte116 == Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116) {
								@Pc(1152) Class105 local1152 = Static397.anInt6847 == -1 ? null : Static88.aClass183_1.method4071(Static397.anInt6847);
								if ((Static434.anInt7646 & 0x1) != 0 && (local1152 == null || local1130.method7109(Static397.anInt6847, local1152.anInt2858) != local1152.anInt2858)) {
									Static374.method5440(true, -1, 59, Static559.aString92, false, (long) local1122.anInt6203, Static3.anInt71, local71, local62, Static264.aString51 + " -> <col=ff9040>" + local1130.aString89);
								}
							}
							if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 == local374.aClass20_Sub2_1.aByte116) {
								@Pc(1208) String[] local1208 = local1130.aStringArray37;
								for (local870 = 4; local870 >= 0; local870--) {
									if (local1208 != null && local1208[local870] != null) {
										@Pc(1220) byte local1220 = 0;
										local157 = Static183.anInt3713;
										if (local870 == 0) {
											local1220 = 11;
										}
										if (local870 == 1) {
											local1220 = 8;
										}
										if (local870 == 2) {
											local1220 = 46;
										}
										if (local870 == 3) {
											local1220 = 6;
										}
										if (local870 == 4) {
											local1220 = 23;
										}
										if (local1130.anInt8617 == local870) {
											local157 = local1130.anInt8622;
										}
										if (local870 == local1130.anInt8645) {
											local157 = local1130.lb;
										}
										Static374.method5440(true, -1, local1220, local1208[local870], false, (long) local1122.anInt6203, local157, local71, local62, "<col=ff9040>" + local1130.aString89);
									}
								}
							}
							Static374.method5440(true, -1, 1006, Static103.aClass77_24.method1864(Static562.anInt9127), Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 != local374.aClass20_Sub2_1.aByte116, (long) local1122.anInt6203, Static326.anInt5841, local71, local62, "<col=ff9040>" + local1130.aString89);
						}
					}
				}
				if (local374.aClass20_Sub2_1 instanceof Interface7) {
					@Pc(1350) Interface7 local1350 = (Interface7) local374.aClass20_Sub2_1;
					@Pc(1357) Class306 local1357 = Static146.aClass214_1.method4897(local1350.method7276());
					if (local1357.anIntArray570 != null) {
						local1357 = local1357.method6966(Static121.aClass148_1);
					}
					if (local1357 != null) {
						if (Static22.aBoolean43 && local374.aClass20_Sub2_1.aByte116 == Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116) {
							@Pc(1386) Class105 local1386 = Static397.anInt6847 == -1 ? null : Static88.aClass183_1.method4071(Static397.anInt6847);
							if ((Static434.anInt7646 & 0x4) != 0 && (local1386 == null || local1357.method6977(local1386.anInt2858, Static397.anInt6847) != local1386.anInt2858)) {
								Static374.method5440(true, -1, 18, Static559.aString92, false, Static592.method7892(local1350, local62, local71), Static3.anInt71, local71, local62, Static264.aString51 + " -> <col=00ffff>" + local1357.aString88);
							}
						}
						if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 == local374.aClass20_Sub2_1.aByte116) {
							@Pc(1449) String[] local1449 = local1357.aStringArray35;
							if (local1449 != null) {
								for (local101 = 4; local101 >= 0; local101--) {
									if (local1449[local101] != null) {
										@Pc(1461) short local1461 = 0;
										if (local101 == 0) {
											local1461 = 4;
										}
										local611 = Static183.anInt3713;
										if (local101 == 1) {
											local1461 = 21;
										}
										if (local101 == 2) {
											local1461 = 15;
										}
										if (local101 == 3) {
											local1461 = 45;
										}
										if (local101 == local1357.anInt8365) {
											local611 = local1357.anInt8370;
										}
										if (local101 == 4) {
											local1461 = 1003;
										}
										if (local101 == local1357.anInt8404) {
											local611 = local1357.anInt8413;
										}
										Static374.method5440(true, -1, local1461, local1449[local101], false, Static592.method7892(local1350, local62, local71), local611, local71, local62, "<col=00ffff>" + local1357.aString88);
									}
								}
							}
						}
						Static374.method5440(true, -1, 1011, Static103.aClass77_24.method1864(Static562.anInt9127), local374.aClass20_Sub2_1.aByte116 != Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116, (long) local1357.anInt8416, Static326.anInt5841, local71, local62, "<col=00ffff>" + local1357.aString88);
					}
				}
			}
		}
	}
}
