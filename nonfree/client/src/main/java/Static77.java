import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
	public static int anInt1520 = 2;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
	public static int anInt1525 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	public static void method1161() {
		if (Static193.aFloat15 > Static193.aFloat14) {
			Static193.aFloat14 = (float) ((double) Static193.aFloat14 + (double) Static193.aFloat14 / 30.0D);
			if (Static193.aFloat15 < Static193.aFloat14) {
				Static193.aFloat14 = Static193.aFloat15;
			}
			Static149.method2422();
			Static193.anInt2342 = (int) Static193.aFloat14 >> 1;
			Static193.aByteArrayArrayArray5 = Static349.method5668(Static193.anInt2342);
		} else if (Static193.aFloat15 < Static193.aFloat14) {
			Static193.aFloat14 = (float) ((double) Static193.aFloat14 - (double) Static193.aFloat14 / 30.0D);
			if (Static193.aFloat15 > Static193.aFloat14) {
				Static193.aFloat14 = Static193.aFloat15;
			}
			Static149.method2422();
			Static193.anInt2342 = (int) Static193.aFloat14 >> 1;
			Static193.aByteArrayArrayArray5 = Static349.method5668(Static193.anInt2342);
		}
		if (Static286.anInt5771 != -1 && Static265.anInt5321 != -1) {
			@Pc(78) int local78 = Static286.anInt5771 - Static330.anInt6402;
			if (local78 < 2 || local78 > 2) {
				local78 >>= 0x4;
			}
			@Pc(95) int local95 = Static265.anInt5321 - Static114.anInt2413;
			if (local95 < 2 || local95 > 2) {
				local95 >>= 0x4;
			}
			Static330.anInt6402 -= -local78;
			Static114.anInt2413 += local95;
			if (local78 == 0 && local95 == 0) {
				Static286.anInt5771 = -1;
				Static265.anInt5321 = -1;
			}
			Static149.method2422();
		}
		if (Static13.anInt346 > 0) {
			Static277.anInt5533--;
			if (Static277.anInt5533 == 0) {
				Static277.anInt5533 = 100;
				Static13.anInt346--;
			}
		} else {
			Static309.anInt6134 = -1;
			Static276.anInt5510 = -1;
		}
		if (!Static97.aBoolean103 || Static293.aClass127_40 == null) {
			return;
		}
		for (@Pc(166) Class3_Sub14 local166 = (Class3_Sub14) Static293.aClass127_40.method3402(); local166 != null; local166 = (Class3_Sub14) Static293.aClass127_40.method3400()) {
			@Pc(174) Class211 local174 = Static136.method2268(local166.aClass3_Sub5_1.anInt544);
			if (Static278.anInt5569 == 0 && local166.method1132(Static221.anInt4562, Static192.anInt4000)) {
				if (local174.aStringArray41 != null) {
					if (local174.aStringArray41[4] != null) {
						Static271.method4580(0, local174.aStringArray41[4], local174.aString250, -1, (long) local166.aClass3_Sub5_1.anInt544, local174.anInt6589, 1006);
					}
					if (local174.aStringArray41[3] != null) {
						Static271.method4580(0, local174.aStringArray41[3], local174.aString250, -1, (long) local166.aClass3_Sub5_1.anInt544, local174.anInt6589, 1004);
					}
					if (local174.aStringArray41[2] != null) {
						Static271.method4580(0, local174.aStringArray41[2], local174.aString250, -1, (long) local166.aClass3_Sub5_1.anInt544, local174.anInt6589, 1012);
					}
					if (local174.aStringArray41[1] != null) {
						Static271.method4580(0, local174.aStringArray41[1], local174.aString250, -1, (long) local166.aClass3_Sub5_1.anInt544, local174.anInt6589, 1007);
					}
					if (local174.aStringArray41[0] != null) {
						Static271.method4580(0, local174.aStringArray41[0], local174.aString250, -1, (long) local166.aClass3_Sub5_1.anInt544, local174.anInt6589, 1001);
					}
				}
				if (!local166.aClass3_Sub5_1.aBoolean28) {
					local166.aClass3_Sub5_1.aBoolean28 = true;
					Static139.method2271(15, local166.aClass3_Sub5_1.anInt544, local174.anInt6589);
				}
				if (local166.aClass3_Sub5_1.aBoolean28) {
					Static139.method2271(17, local166.aClass3_Sub5_1.anInt544, local174.anInt6589);
				}
			} else if (local166.aClass3_Sub5_1.aBoolean28) {
				local166.aClass3_Sub5_1.aBoolean28 = false;
				Static139.method2271(16, local166.aClass3_Sub5_1.anInt544, local174.anInt6589);
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZI)Lclient!tf;")
	public static Class189 method1165(@OriginalArg(1) int arg0) {
		@Pc(5) Class198 local5 = Static327.aClass198_59;
		@Pc(14) Class189 local14;
		synchronized (Static327.aClass198_59) {
			local14 = (Class189) Static327.aClass198_59.method5242((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static95.aClass100_35.method2319(3, arg0);
		local14 = new Class189();
		if (local34 != null) {
			local14.method5069(new Class3_Sub4(local34));
		}
		@Pc(49) Class198 local49 = Static327.aClass198_59;
		synchronized (Static327.aClass198_59) {
			Static327.aClass198_59.method5231((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!qc;I)V")
	public static void method1166(@OriginalArg(0) Class5_Sub4_Sub4_Sub2 arg0) {
		if (Static170.anInt6279 >= 400) {
			return;
		}
		@Pc(12) Class119 local12 = arg0.aClass119_1;
		if (local12.anIntArray248 != null) {
			local12 = local12.method2882();
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean205) {
			return;
		}
		@Pc(35) String local35 = local12.aString137;
		if (local12.anInt3658 != 0) {
			@Pc(50) String local50 = Static309.anInt6133 == 1 ? Static350.aString257 : Static135.aString106;
			local35 = local35 + Static302.method5088(local12.anInt3658, Static349.aClass5_Sub4_Sub4_Sub1_2.anInt3417) + " (" + local50 + local12.anInt3658 + ")";
		}
		if (Static235.anInt4719 == 1) {
			Static271.method4580(0, Static87.aString57, Static200.aString156 + " -> <col=ffff00>" + local35, Static274.anInt5908, (long) arg0.anInt4946, 0, 37);
		} else if (Static155.aBoolean96) {
			@Pc(347) Class3_Sub7_Sub4 local347 = Static58.anInt1273 == -1 ? null : Static11.method177(Static58.anInt1273);
			if ((Static299.anInt5948 & 0x2) != 0 && (local347 == null || local12.method2887(Static58.anInt1273, local347.anInt808) != local347.anInt808)) {
				Static271.method4580(0, Static303.aString199, Static309.aString229 + " -> <col=ffff00>" + local35, Static244.anInt4838, (long) arg0.anInt4946, 0, 23);
			}
		} else {
			@Pc(108) String[] local108 = local12.aStringArray23;
			if (Static1.aBoolean4) {
				local108 = Static182.method3251(local108);
			}
			@Pc(118) int local118;
			if (local108 != null) {
				for (local118 = 4; local118 >= 0; local118--) {
					if (local108[local118] != null && (Static309.anInt6133 != 0 || !local108[local118].equalsIgnoreCase(Static300.aString223))) {
						@Pc(137) byte local137 = 0;
						if (local118 == 0) {
							local137 = 20;
						}
						@Pc(146) int local146 = Static298.anInt5938;
						if (local118 == 1) {
							local137 = 31;
						}
						if (local118 == 2) {
							local137 = 57;
						}
						if (local118 == 3) {
							local137 = 42;
						}
						if (local118 == 4) {
							local137 = 45;
						}
						if (local12.anInt3667 == local118) {
							local146 = local12.anInt3672;
						}
						if (local12.anInt3640 == local118) {
							local146 = local12.anInt3641;
						}
						Static271.method4580(0, local108[local118], "<col=ffff00>" + local35, local146, (long) arg0.anInt4946, 0, local137);
					}
				}
			}
			if (Static309.anInt6133 == 0 && local108 != null) {
				for (local118 = 4; local118 >= 0; local118--) {
					if (local108[local118] != null && local108[local118].equalsIgnoreCase(Static300.aString223)) {
						@Pc(240) short local240 = 0;
						if (local12.anInt3658 > Static349.aClass5_Sub4_Sub4_Sub1_2.anInt3417) {
							local240 = 2000;
						}
						@Pc(249) short local249 = 0;
						if (local118 == 0) {
							local249 = 20;
						}
						if (local118 == 1) {
							local249 = 31;
						}
						if (local118 == 2) {
							local249 = 57;
						}
						if (local118 == 3) {
							local249 = 42;
						}
						if (local118 == 4) {
							local249 = 45;
						}
						if (local249 != 0) {
							local249 += local240;
						}
						Static271.method4580(0, local108[local118], "<col=ffff00>" + local35, local12.anInt3662, (long) arg0.anInt4946, 0, local249);
					}
				}
			}
			Static271.method4580(0, Static334.aString243, "<col=ffff00>" + local35, Static344.anInt6694, (long) arg0.anInt4946, 0, 1009);
		}
	}
}
