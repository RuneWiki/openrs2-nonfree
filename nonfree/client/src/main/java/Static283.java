import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "Lclient!kr;")
	public static Class46 aClass46_20;

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "Lclient!iq;")
	public static Class104 aClass104_148;

	@OriginalMember(owner = "client!rj", name = "y", descriptor = "Lclient!tn;")
	public static Class194 aClass194_3;

	@OriginalMember(owner = "client!rj", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!rj", name = "w", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_189 = new Class221(63, 28);

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "Z")
	public static boolean aBoolean505 = false;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)Z")
	public static boolean method4806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static215.anInt4742; local1++) {
			@Pc(6) Class175 local6 = Static49.aClass175Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt5768 == 1) {
				local15 = local6.anInt5770 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt5773 + (local6.anInt5762 * local15 >> 8);
					local37 = local6.anInt5775 + (local6.anInt5766 * local15 >> 8);
					local47 = local6.anInt5757 + (local6.anInt5761 * local15 >> 8);
					local57 = local6.anInt5758 + (local6.anInt5769 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5768 == 2) {
				local15 = arg0 - local6.anInt5770;
				if (local15 > 0) {
					local27 = local6.anInt5773 + (local6.anInt5762 * local15 >> 8);
					local37 = local6.anInt5775 + (local6.anInt5766 * local15 >> 8);
					local47 = local6.anInt5757 + (local6.anInt5761 * local15 >> 8);
					local57 = local6.anInt5758 + (local6.anInt5769 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5768 == 3) {
				local15 = local6.anInt5773 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt5770 + (local6.anInt5760 * local15 >> 8);
					local37 = local6.anInt5765 + (local6.anInt5774 * local15 >> 8);
					local47 = local6.anInt5757 + (local6.anInt5761 * local15 >> 8);
					local57 = local6.anInt5758 + (local6.anInt5769 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5768 == 4) {
				local15 = arg2 - local6.anInt5773;
				if (local15 > 0) {
					local27 = local6.anInt5770 + (local6.anInt5760 * local15 >> 8);
					local37 = local6.anInt5765 + (local6.anInt5774 * local15 >> 8);
					local47 = local6.anInt5757 + (local6.anInt5761 * local15 >> 8);
					local57 = local6.anInt5758 + (local6.anInt5769 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5768 == 5) {
				local15 = arg1 - local6.anInt5757;
				if (local15 > 0) {
					local27 = local6.anInt5770 + (local6.anInt5760 * local15 >> 8);
					local37 = local6.anInt5765 + (local6.anInt5774 * local15 >> 8);
					local47 = local6.anInt5773 + (local6.anInt5762 * local15 >> 8);
					local57 = local6.anInt5775 + (local6.anInt5766 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V")
	public static void method4807() {
		Static165.aClass107_18.method3015();
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)V")
	public static void method4808() {
		for (@Pc(3) int local3 = 0; local3 < Static191.anInt4213; local3++) {
			@Pc(9) int local9 = Static186.anIntArray310[local3]--;
			if (Static186.anIntArray310[local3] >= -10) {
				@Pc(84) Class135 local84 = Static226.aClass135Array1[local3];
				if (local84 == null) {
					local84 = Static372.method3857(Static80.aClass104_54, Static300.anIntArray461[local3], 0);
					if (local84 == null) {
						continue;
					}
					Static186.anIntArray310[local3] += local84.method3856();
					Static226.aClass135Array1[local3] = local84;
				}
				if (Static186.anIntArray310[local3] < 0) {
					@Pc(229) int local229;
					if (Static312.anIntArray478[local3] == 0) {
						local229 = Static17.anInt277 * Static241.anIntArray398[local3] >> 8;
					} else {
						@Pc(131) int local131 = Static312.anIntArray478[local3] >> 24 & 0x3;
						if (Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77 == local131) {
							@Pc(143) int local143 = (Static312.anIntArray478[local3] & 0xFF) * 128;
							@Pc(151) int local151 = Static312.anIntArray478[local3] >> 16 & 0xFF;
							@Pc(161) int local161 = local151 * 128 + 64 - Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893;
							if (local161 < 0) {
								local161 = -local161;
							}
							@Pc(174) int local174 = Static312.anIntArray478[local3] >> 8 & 0xFF;
							@Pc(184) int local184 = local174 * 128 + 64 - Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888;
							if (local184 < 0) {
								local184 = -local184;
							}
							@Pc(195) int local195 = local161 + local184 - 128;
							if (local143 < local195) {
								Static186.anIntArray310[local3] = -100;
								continue;
							}
							if (local195 < 0) {
								local195 = 0;
							}
							local229 = Static46.anInt752 * (local143 - local195) * Static241.anIntArray398[local3] / local143 >> 8;
						} else {
							local229 = 0;
						}
					}
					if (local229 > 0) {
						@Pc(253) Class2_Sub5_Sub1 local253 = local84.method3859().method267(Static179.aClass83_1);
						@Pc(258) Class2_Sub11_Sub4 local258 = Static377.method4980(local253, local229);
						local258.method4977(Static236.anIntArray88[local3] - 1);
						Static31.aClass2_Sub11_Sub3_1.method4108(local258);
					}
					Static186.anIntArray310[local3] = -100;
				}
			} else {
				Static191.anInt4213--;
				for (@Pc(23) int local23 = local3; local23 < Static191.anInt4213; local23++) {
					Static300.anIntArray461[local23] = Static300.anIntArray461[local23 + 1];
					Static226.aClass135Array1[local23] = Static226.aClass135Array1[local23 + 1];
					Static236.anIntArray88[local23] = Static236.anIntArray88[local23 + 1];
					Static186.anIntArray310[local23] = Static186.anIntArray310[local23 + 1];
					Static312.anIntArray478[local23] = Static312.anIntArray478[local23 + 1];
					Static241.anIntArray398[local23] = Static241.anIntArray398[local23 + 1];
				}
				local3--;
			}
		}
		if (Static97.aBoolean179 && !Static334.method5446()) {
			if (Static241.anInt5136 != 0 && Static290.anInt5805 != -1) {
				Static271.method4700(Static290.anInt5805, Static284.aClass104_149, Static241.anInt5136);
			}
			Static97.aBoolean179 = false;
		} else if (Static241.anInt5136 != 0 && Static290.anInt5805 != -1 && !Static334.method5446()) {
			Static300.method5057(Static36.aClass157_24);
			Static197.aClass2_Sub12_Sub2_2.method3162(Static290.anInt5805);
			Static290.anInt5805 = -1;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!ec;Lclient!dr;IBII)V")
	public static void method4809(@OriginalArg(0) int arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) Class37 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static249.anInt5214 < 100) {
			Static331.method5391(arg2, arg1);
		}
		arg2.method3677(arg0, arg5, arg3 + arg0, arg4 + arg5);
		@Pc(35) int local35;
		@Pc(46) int local46;
		if (Static249.anInt5214 < 100) {
			local35 = arg0 + arg3 / 2;
			local46 = arg4 / 2 + arg5 - 18 - 20;
			arg2.method3712(arg0, arg5, arg3, arg4, -16777216, 0);
			arg2.method3697(local35 - 152, local46, 304, 34, Static227.aColorArray1[Static114.anInt2412].getRGB(), 0);
			arg2.method3712(local35 - 150, local46 - -2, Static249.anInt5214 * 3, 30, Static278.aColorArray3[Static114.anInt2412].getRGB(), 0);
			Static25.aClass71_1.method5233(Static265.aColorArray2[Static114.anInt2412].getRGB(), -1, local46 + 20, local35, Static353.aClass140_140.method4155(Static239.anInt2803));
			return;
		}
		@Pc(111) int local111 = Static298.anInt5924 - (int) ((float) arg3 / Static202.aFloat50);
		local35 = Static105.anInt2196 + (int) ((float) arg4 / Static202.aFloat50);
		local46 = Static298.anInt5924 + (int) ((float) arg3 / Static202.aFloat50);
		Static133.anInt2847 = (int) ((float) (arg4 * 2) / Static202.aFloat50);
		@Pc(145) int local145 = Static105.anInt2196 - (int) ((float) arg4 / Static202.aFloat50);
		Static43.anInt2553 = Static105.anInt2196 - (int) ((float) arg4 / Static202.aFloat50);
		Static105.anInt2194 = (int) ((float) (arg3 * 2) / Static202.aFloat50);
		Static114.anInt2420 = Static298.anInt5924 - (int) ((float) arg3 / Static202.aFloat50);
		Static202.method4226(Static202.anInt4952 + local111, Static202.anInt4958 + local35, local46 + Static202.anInt4952, local145 - -Static202.anInt4958, arg0, arg5, arg3 + arg0, arg4 + 1 + arg5);
		Static202.method4235(arg2);
		@Pc(201) Class180 local201 = Static202.method4220(arg2);
		Static321.method1021(arg2, local201);
		if (Static314.anInt6200 > 0) {
			Static328.anInt6685--;
			if (Static328.anInt6685 == 0) {
				Static314.anInt6200--;
				Static328.anInt6685 = 20;
			}
		}
		if (!Static311.aBoolean550) {
			return;
		}
		@Pc(232) int local232 = arg0 + arg3 - 5;
		@Pc(238) int local238 = arg4 + arg5 - 8;
		Static272.aClass71_4.method5235(16776960, "Fps:" + Static212.anInt4619, local238, local232);
		@Pc(253) int local253 = local238 - 15;
		@Pc(255) Runtime local255 = Runtime.getRuntime();
		@Pc(264) int local264 = (int) ((local255.totalMemory() - local255.freeMemory()) / 1024L);
		@Pc(266) int local266 = 16776960;
		if (local264 > 65536) {
			local266 = 16711680;
		}
		Static272.aClass71_4.method5235(local266, "Mem:" + local264 + "k", local253, local232);
		local238 = local253 - 15;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(III)Z")
	public static boolean method4811(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static243.aByteArrayArrayArray10[1][arg0][arg1] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!dr;)V")
	public static void method4812(@OriginalArg(1) Class37 arg0) {
		if (Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77 != Static148.anInt3213 && (Static196.aClass51ArrayArrayArray3 != null && Static257.method4521(Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77, arg0))) {
			Static148.anInt3213 = Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77;
		}
	}
}
