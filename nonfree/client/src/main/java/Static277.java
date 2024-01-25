import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "Lclient!c;")
	public static Class5 aClass5_26;

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "Lclient!ph;")
	public static Class162 aClass162_9;

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray59 = new String[100];

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
	public static void method4845() {
		for (@Pc(10) Class1_Sub4_Sub2 local10 = (Class1_Sub4_Sub2) Static34.aClass16_3.method410(); local10 != null; local10 = (Class1_Sub4_Sub2) Static34.aClass16_3.method419()) {
			@Pc(20) Class17_Sub1_Sub4 local20 = local10.aClass17_Sub1_Sub4_1;
			if (Static242.anInt6745 != local20.aByte51 || local20.aBoolean490) {
				local10.method5628();
				local20.method4444();
			} else if (local20.anInt5055 <= Static5.anInt208) {
				local20.method4443(Static303.anInt2311);
				if (local20.aBoolean490) {
					local10.method5628();
				} else {
					Static63.method4865(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
	public static void method4846() {
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(45) int local45;
		if (Static74.anInt1958 == 133) {
			local14 = Static311.aClass1_Sub8_Sub1_8.method4536();
			local23 = Static122.anInt2773 + (local14 >> 4 & 0x7);
			local29 = (local14 & 0x7) + Static170.anInt3654;
			local33 = Static311.aClass1_Sub8_Sub1_8.method4536();
			local37 = local33 >> 2;
			local41 = local33 & 0x3;
			local45 = Static67.anIntArray182[local37];
			if (local23 >= 0 && local29 >= 0 && local23 < Static233.anInt5573 && local29 < Static134.anInt2971) {
				Static191.method3710(-1, 0, Static242.anInt6745, local37, local45, local41, local29, -1, local23);
			}
		} else if (Static74.anInt1958 == 27) {
			local14 = Static311.aClass1_Sub8_Sub1_8.method4556();
			local23 = Static311.aClass1_Sub8_Sub1_8.method4532();
			Static119.method2548(local14).method3842(local23);
		} else if (Static74.anInt1958 == 30) {
			Static311.aClass1_Sub8_Sub1_8.method4532();
			local14 = Static311.aClass1_Sub8_Sub1_8.method4532();
			local23 = (local14 >> 4 & 0x7) + Static122.anInt2773;
			local29 = Static170.anInt3654 + (local14 & 0x7);
			local33 = Static311.aClass1_Sub8_Sub1_8.method4556();
			local37 = Static311.aClass1_Sub8_Sub1_8.method4532();
			local41 = Static311.aClass1_Sub8_Sub1_8.method4514();
			@Pc(141) String local141 = Static311.aClass1_Sub8_Sub1_8.method4534();
			Static253.method4591(local33, local41, local141, local23, local37, local29);
		} else {
			@Pc(212) int local212;
			@Pc(216) int local216;
			@Pc(220) int local220;
			@Pc(224) int local224;
			@Pc(206) int local206;
			@Pc(235) int local235;
			@Pc(325) Class17_Sub1_Sub2 local325;
			if (Static74.anInt1958 == 83) {
				local14 = Static311.aClass1_Sub8_Sub1_8.method4532();
				local23 = (local14 >> 4 & 0xF) + Static122.anInt2773 * 2;
				local29 = Static170.anInt3654 * 2 + (local14 & 0xF);
				local33 = Static311.aClass1_Sub8_Sub1_8.method4558() + local23;
				local37 = Static311.aClass1_Sub8_Sub1_8.method4558() + local29;
				local41 = Static311.aClass1_Sub8_Sub1_8.method4551();
				local45 = Static311.aClass1_Sub8_Sub1_8.method4556();
				local206 = Static311.aClass1_Sub8_Sub1_8.method4532() * 4;
				local212 = Static311.aClass1_Sub8_Sub1_8.method4532() * 4;
				local216 = Static311.aClass1_Sub8_Sub1_8.method4556();
				local220 = Static311.aClass1_Sub8_Sub1_8.method4556();
				local224 = Static311.aClass1_Sub8_Sub1_8.method4532();
				if (local224 == 255) {
					local224 = -1;
				}
				local235 = Static311.aClass1_Sub8_Sub1_8.method4532();
				if (local23 >= 0 && local29 >= 0 && Static233.anInt5573 * 2 > local23 && local29 < Static233.anInt5573 * 2 && local33 >= 0 && local37 >= 0 && Static134.anInt2971 * 2 > local33 && Static134.anInt2971 * 2 > local37 && local45 != 65535) {
					local37 = local37 * 64;
					local29 *= 64;
					local23 *= 64;
					local33 *= 64;
					local325 = new Class17_Sub1_Sub2(local45, Static242.anInt6745, local23, local29, Static94.method2022(local29, local23, Static242.anInt6745) - local206, local216 - -Static5.anInt208, local220 + Static5.anInt208, local224, local235, local41, local212);
					local325.method3462(local216 + Static5.anInt208, local33, local37, Static94.method2022(local37, local33, Static242.anInt6745) - local212);
					Static294.aClass16_36.method416(new Class1_Sub4_Sub6(local325));
				}
			} else if (Static74.anInt1958 == 2) {
				local14 = Static311.aClass1_Sub8_Sub1_8.method4532();
				local23 = (local14 >> 4 & 0x7) + Static122.anInt2773;
				local29 = Static170.anInt3654 + (local14 & 0x7);
				local33 = Static311.aClass1_Sub8_Sub1_8.method4556();
				local37 = Static311.aClass1_Sub8_Sub1_8.method4556();
				local41 = Static311.aClass1_Sub8_Sub1_8.method4556();
				if (Static339.aClass197_30 != null && local23 >= 0 && local29 >= 0 && Static233.anInt5573 > local23 && local29 < Static134.anInt2971) {
					@Pc(415) Class1_Sub7 local415 = (Class1_Sub7) Static339.aClass197_30.method5157((long) (Static242.anInt6745 << 28 | local29 << 14 | local23));
					if (local415 != null) {
						for (@Pc(423) Class1_Sub40 local423 = (Class1_Sub40) local415.aClass16_2.method410(); local423 != null; local423 = (Class1_Sub40) local415.aClass16_2.method419()) {
							if (local423.anInt6580 == (local33 & 0x7FFF) && local423.anInt6576 == local37) {
								local423.method5628();
								local423.anInt6576 = local41;
								Static17.method413(local23, local29, Static242.anInt6745, local423);
								break;
							}
						}
						Static293.method4938(Static242.anInt6745, local23, local29);
					}
				}
			} else if (Static74.anInt1958 == 98) {
				local14 = Static311.aClass1_Sub8_Sub1_8.method4532();
				local23 = local14 >> 2;
				local29 = local14 & 0x3;
				local33 = Static67.anIntArray182[local23];
				local37 = Static311.aClass1_Sub8_Sub1_8.method4556();
				if (local37 == 65535) {
					local37 = -1;
				}
				local41 = Static311.aClass1_Sub8_Sub1_8.method4552();
				local45 = (local41 >> 4 & 0x7) + Static122.anInt2773;
				local206 = (local41 & 0x7) + Static170.anInt3654;
				Static120.method2551(local45, local206, local37, local23, local29, local33, Static242.anInt6745);
			} else if (Static74.anInt1958 == 226) {
				local14 = Static311.aClass1_Sub8_Sub1_8.method4520();
				local23 = Static311.aClass1_Sub8_Sub1_8.method4541();
				local29 = (local23 >> 4 & 0x7) + Static122.anInt2773;
				local33 = Static170.anInt3654 + (local23 & 0x7);
				if (local29 >= 0 && local33 >= 0 && Static233.anInt5573 > local29 && local33 < Static134.anInt2971) {
					@Pc(588) Class1_Sub7 local588 = (Class1_Sub7) Static339.aClass197_30.method5157((long) (local29 | local33 << 14 | Static242.anInt6745 << 28));
					if (local588 != null) {
						for (@Pc(596) Class1_Sub40 local596 = (Class1_Sub40) local588.aClass16_2.method410(); local596 != null; local596 = (Class1_Sub40) local588.aClass16_2.method419()) {
							if ((local14 & 0x7FFF) == local596.anInt6580) {
								local596.method5628();
								break;
							}
						}
						if (local588.aClass16_2.method418()) {
							local588.method5628();
						}
						Static293.method4938(Static242.anInt6745, local29, local33);
					}
				}
			} else if (Static74.anInt1958 == 44) {
				local14 = Static311.aClass1_Sub8_Sub1_8.method4532();
				local23 = (local14 >> 4 & 0x7) + Static122.anInt2773;
				local29 = Static170.anInt3654 + (local14 & 0x7);
				local33 = Static311.aClass1_Sub8_Sub1_8.method4556();
				if (local33 == 65535) {
					local33 = -1;
				}
				local37 = Static311.aClass1_Sub8_Sub1_8.method4532();
				local41 = local37 >> 4 & 0xF;
				local45 = local37 & 0x7;
				local206 = Static311.aClass1_Sub8_Sub1_8.method4532();
				local212 = Static311.aClass1_Sub8_Sub1_8.method4532();
				if (local23 >= 0 && local29 >= 0 && local23 < Static233.anInt5573 && local29 < Static134.anInt2971) {
					local216 = local41 + 1;
					if (Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0] >= local23 - local216 && Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0] <= local216 + local23 && local29 - local216 <= Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0] && local216 + local29 >= Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0] && Static114.anInt4335 != 0 && local45 > 0 && Static225.anInt4698 < 50 && local33 != -1) {
						Static235.anIntArray432[Static225.anInt4698] = local33;
						Static9.anIntArray33[Static225.anInt4698] = local45;
						Static67.anIntArray181[Static225.anInt4698] = local206;
						Static289.aClass77Array2[Static225.anInt4698] = null;
						Static185.anIntArray363[Static225.anInt4698] = local41 + (local29 << 8) + (local23 << 16);
						Static114.anIntArray397[Static225.anInt4698] = local212;
						Static225.anInt4698++;
					}
				}
			} else if (Static74.anInt1958 == 119) {
				local14 = Static311.aClass1_Sub8_Sub1_8.method4556();
				local23 = Static311.aClass1_Sub8_Sub1_8.method4547();
				local29 = Static311.aClass1_Sub8_Sub1_8.method4552();
				local33 = (local29 >> 4 & 0x7) + Static122.anInt2773;
				local37 = (local29 & 0x7) + Static170.anInt3654;
				local41 = Static311.aClass1_Sub8_Sub1_8.method4556();
				if (local33 >= 0 && local37 >= 0 && local33 < Static233.anInt5573 && Static134.anInt2971 > local37 && Static16.anInt527 != local23) {
					Static17.method413(local33, local37, Static242.anInt6745, new Class1_Sub40(local41, local14));
					Static293.method4938(Static242.anInt6745, local33, local37);
				}
			} else if (Static74.anInt1958 == 175) {
				local14 = Static311.aClass1_Sub8_Sub1_8.method4538();
				local23 = Static311.aClass1_Sub8_Sub1_8.method4536();
				local29 = (local23 >> 4 & 0x7) + Static122.anInt2773;
				local33 = Static170.anInt3654 + (local23 & 0x7);
				local37 = Static311.aClass1_Sub8_Sub1_8.method4536();
				local41 = local37 >> 2;
				local45 = local37 & 0x3;
				local206 = Static67.anIntArray182[local41];
				if (local29 >= 0 && local33 >= 0 && Static233.anInt5573 > local29 && Static134.anInt2971 > local33) {
					Static191.method3710(local14, 0, Static242.anInt6745, local41, local206, local45, local33, -1, local29);
				}
			} else if (Static74.anInt1958 == 84) {
				local14 = Static311.aClass1_Sub8_Sub1_8.method4538();
				local23 = Static311.aClass1_Sub8_Sub1_8.method4538();
				local29 = Static311.aClass1_Sub8_Sub1_8.method4552();
				local33 = (local29 >> 4 & 0x7) + Static122.anInt2773;
				local37 = Static170.anInt3654 + (local29 & 0x7);
				if (local33 >= 0 && local37 >= 0 && Static233.anInt5573 > local33 && Static134.anInt2971 > local37) {
					Static17.method413(local33, local37, Static242.anInt6745, new Class1_Sub40(local14, local23));
					Static293.method4938(Static242.anInt6745, local33, local37);
				}
			} else {
				@Pc(1099) int local1099;
				if (Static74.anInt1958 == 79) {
					local14 = Static311.aClass1_Sub8_Sub1_8.method4532();
					local23 = (local14 >> 4 & 0xF) + Static122.anInt2773 * 2;
					local29 = (local14 & 0xF) + Static170.anInt3654 * 2;
					local33 = Static311.aClass1_Sub8_Sub1_8.method4558() + local23;
					local37 = Static311.aClass1_Sub8_Sub1_8.method4558() + local29;
					local41 = Static311.aClass1_Sub8_Sub1_8.method4551();
					local45 = Static311.aClass1_Sub8_Sub1_8.method4551();
					local206 = Static311.aClass1_Sub8_Sub1_8.method4556();
					local212 = Static311.aClass1_Sub8_Sub1_8.method4558();
					local216 = Static311.aClass1_Sub8_Sub1_8.method4532() * 4;
					local220 = Static311.aClass1_Sub8_Sub1_8.method4556();
					local224 = Static311.aClass1_Sub8_Sub1_8.method4556();
					local235 = Static311.aClass1_Sub8_Sub1_8.method4532();
					if (local235 == 255) {
						local235 = -1;
					}
					local1099 = Static311.aClass1_Sub8_Sub1_8.method4532();
					if (local23 >= 0 && local29 >= 0 && local23 < Static233.anInt5573 * 2 && Static233.anInt5573 * 2 > local29 && local33 >= 0 && local37 >= 0 && Static134.anInt2971 * 2 > local33 && local37 < Static134.anInt2971 * 2 && local206 != 65535) {
						local37 = local37 * 64;
						local29 = local29 * 64;
						local23 *= 64;
						local33 = local33 * 64;
						if (local41 != 0) {
							@Pc(1173) int local1173;
							@Pc(1181) Class17_Sub1_Sub1 local1181;
							@Pc(1167) int local1167;
							@Pc(1177) int local1177;
							if (local41 >= 0) {
								local1167 = local41 - 1;
								local1173 = local1167 >> 11 & 0xF;
								local1177 = local1167 & 0x7FF;
								local1181 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local1177];
							} else {
								local1167 = -local41 - 1;
								local1173 = local1167 >> 11 & 0xF;
								local1177 = local1167 & 0x7FF;
								if (local1177 == Static16.anInt527) {
									local1181 = Static198.aClass17_Sub1_Sub1_Sub1_3;
								} else {
									local1181 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local1177];
								}
							}
							if (local1181 != null) {
								@Pc(1215) Class123 local1215 = local1181.method4319();
								if (local1215.anIntArrayArray43 != null && local1215.anIntArrayArray43[local1173] != null) {
									local1177 = local1215.anIntArrayArray43[local1173][0];
									@Pc(1237) int local1237 = local1215.anIntArrayArray43[local1173][2];
									@Pc(1242) int local1242 = local1181.aClass135_7.method3693();
									@Pc(1246) int local1246 = Class1_Sub3_Sub8.anIntArray159[local1242];
									@Pc(1250) int local1250 = Class1_Sub3_Sub8.anIntArray156[local1242];
									@Pc(1260) int local1260 = local1177 * local1250 + local1237 * local1246 >> 15;
									@Pc(1270) int local1270 = local1250 * local1237 - local1246 * local1177 >> 15;
									local29 += local1270;
									local23 += local1260;
									local212 -= local1215.anIntArrayArray43[local1173][1];
								}
							}
						}
						@Pc(1314) Class17_Sub1_Sub2 local1314 = new Class17_Sub1_Sub2(local206, Static242.anInt6745, local23, local29, Static94.method2022(local29, local23, Static242.anInt6745) - local212, Static5.anInt208 + local220, local224 + Static5.anInt208, local235, local1099, local45, local216);
						local1314.method3462(Static5.anInt208 + local220, local33, local37, Static94.method2022(local37, local33, Static242.anInt6745) - local216);
						Static294.aClass16_36.method416(new Class1_Sub4_Sub6(local1314));
					}
				} else if (Static74.anInt1958 == 165) {
					local14 = Static311.aClass1_Sub8_Sub1_8.method4532();
					local23 = (local14 >> 4 & 0x7) + Static122.anInt2773;
					local29 = (local14 & 0x7) + Static170.anInt3654;
					local33 = local23 + Static311.aClass1_Sub8_Sub1_8.method4558();
					local37 = Static311.aClass1_Sub8_Sub1_8.method4558() + local29;
					local41 = Static311.aClass1_Sub8_Sub1_8.method4551();
					local45 = Static311.aClass1_Sub8_Sub1_8.method4556();
					local206 = Static311.aClass1_Sub8_Sub1_8.method4532() * 4;
					local212 = Static311.aClass1_Sub8_Sub1_8.method4532() * 4;
					local216 = Static311.aClass1_Sub8_Sub1_8.method4556();
					local220 = Static311.aClass1_Sub8_Sub1_8.method4556();
					local224 = Static311.aClass1_Sub8_Sub1_8.method4532();
					local235 = Static311.aClass1_Sub8_Sub1_8.method4532();
					if (local224 == 255) {
						local224 = -1;
					}
					if (local23 >= 0 && local29 >= 0 && Static233.anInt5573 > local23 && local29 < Static134.anInt2971 && local33 >= 0 && local37 >= 0 && local33 < Static233.anInt5573 && Static134.anInt2971 > local37 && local45 != 65535) {
						local33 = local33 * 128 + 64;
						local23 = local23 * 128 + 64;
						local37 = local37 * 128 + 64;
						local29 = local29 * 128 + 64;
						local325 = new Class17_Sub1_Sub2(local45, Static242.anInt6745, local23, local29, Static94.method2022(local29, local23, Static242.anInt6745) - local206, Static5.anInt208 + local216, local220 + Static5.anInt208, local224, local235, local41, local212);
						local325.method3462(Static5.anInt208 + local216, local33, local37, Static94.method2022(local37, local33, Static242.anInt6745) - local212);
						Static294.aClass16_36.method416(new Class1_Sub4_Sub6(local325));
					}
				} else {
					if (Static74.anInt1958 == 162) {
						local14 = Static311.aClass1_Sub8_Sub1_8.method4556();
						local23 = Static311.aClass1_Sub8_Sub1_8.method4556();
						@Pc(1549) byte local1549 = Static311.aClass1_Sub8_Sub1_8.method4558();
						local33 = Static311.aClass1_Sub8_Sub1_8.method4541();
						local37 = Static122.anInt2773 + (local33 >> 4 & 0x7);
						local41 = Static170.anInt3654 + (local33 & 0x7);
						@Pc(1575) byte local1575 = Static311.aClass1_Sub8_Sub1_8.method4558();
						@Pc(1579) byte local1579 = Static311.aClass1_Sub8_Sub1_8.method4559();
						local212 = Static311.aClass1_Sub8_Sub1_8.method4532();
						local216 = local212 >> 2;
						local220 = local212 & 0x3;
						local224 = Static311.aClass1_Sub8_Sub1_8.method4533();
						@Pc(1601) byte local1601 = Static311.aClass1_Sub8_Sub1_8.method4558();
						local1099 = Static311.aClass1_Sub8_Sub1_8.method4538();
						if (!Static208.aClass32_11.method2178()) {
							Static208.method3951(local1601, local41, local216, local1549, local23, local14, local220, local37, local1579, local224, local1575, local1099);
						}
					}
					if (Static74.anInt1958 == 35) {
						local14 = Static311.aClass1_Sub8_Sub1_8.method4532();
						local23 = (local14 >> 4 & 0x7) + Static122.anInt2773;
						local29 = Static170.anInt3654 + (local14 & 0x7);
						local33 = Static311.aClass1_Sub8_Sub1_8.method4556();
						local37 = Static311.aClass1_Sub8_Sub1_8.method4532();
						local41 = Static311.aClass1_Sub8_Sub1_8.method4556();
						if (local23 >= 0 && local29 >= 0 && Static233.anInt5573 > local23 && local29 < Static134.anInt2971) {
							local45 = local23 * 128 + 64;
							local206 = local29 * 128 + 64;
							@Pc(1715) Class17_Sub1_Sub4 local1715 = new Class17_Sub1_Sub4(local33, local41, Static5.anInt208, Static242.anInt6745, local45, Static94.method2022(local206, local45, Static242.anInt6745) - local37, local206, local23, local23, local29, local29);
							Static34.aClass16_3.method416(new Class1_Sub4_Sub2(local1715));
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)V")
	public static void method4849() {
		Static137.aClass5_15 = null;
		Static18.aClass5Array3 = null;
		Static261.aClass5Array8 = null;
		Static81.aClass5Array21 = null;
		Static300.aClass5Array23 = null;
		Static56.aClass9_2 = null;
		Static166.aClass5Array14 = null;
		Static49.aClass9_1 = null;
		Static58.aClass5Array9 = null;
		Static212.aClass9_3 = null;
		Static314.aClass5Array24 = null;
		Static163.aClass5Array13 = null;
		Static17.aClass5Array2 = null;
		Static9.aClass5Array1 = null;
		Static86.aClass5Array10 = null;
		Static228.aClass5Array17 = null;
		Static149.aClass5Array12 = null;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method4851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class194 local7 = Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class126 local13 = local7.aClass126_2; local13 != null; local13 = local13.aClass126_1) {
			@Pc(17) Class17_Sub1 local17 = local13.aClass17_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort75 == arg1 && local17.aShort77 == arg2) {
				Static274.method4807(local17);
				return;
			}
		}
	}
}
