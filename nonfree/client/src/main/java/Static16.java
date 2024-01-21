import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!cd", name = "kb", descriptor = "Lclient!he;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!cd", name = "pb", descriptor = "I")
	public static int anInt468;

	@OriginalMember(owner = "client!cd", name = "qb", descriptor = "Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2 aClass3_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!cd", name = "sb", descriptor = "I")
	public static int anInt469;

	@OriginalMember(owner = "client!cd", name = "tb", descriptor = "Lclient!md;")
	public static Class30 aClass30_4;

	@OriginalMember(owner = "client!cd", name = "vb", descriptor = "[Lclient!v;")
	public static Class75[] aClass75Array1;

	@OriginalMember(owner = "client!cd", name = "lb", descriptor = "Lclient!n;")
	public static Class52 aClass52_9 = new Class52(200);

	@OriginalMember(owner = "client!cd", name = "rb", descriptor = "[[B")
	public static byte[][] aByteArrayArray4 = new byte[250][];

	@OriginalMember(owner = "client!cd", name = "ub", descriptor = "Lclient!ja;")
	public static Class37 aClass37_2 = new Class37();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)I")
	public static int method340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static61.method1201(arg0 - 1, arg1 + -1) + Static61.method1201(arg0 + 1, arg1 - 1) + Static61.method1201(arg0 + -1, arg1 + 1) + Static61.method1201(arg0 - -1, arg1 + 1);
		@Pc(69) int local69 = Static61.method1201(arg0 - 1, arg1) + Static61.method1201(arg0 + 1, arg1) + Static61.method1201(arg0, arg1 - 1) + Static61.method1201(arg0, arg1 + 1);
		@Pc(74) int local74 = Static61.method1201(arg0, arg1);
		return local74 / 4 + local69 / 8 + local40 / 16;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IJ)Lclient!oa;")
	public static Class56 method342(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(38) long local38 = arg0; local38 != 0L; local38 /= 37L) {
				local29++;
			}
			@Pc(52) byte[] local52 = new byte[local29];
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local29--;
				local52[local29] = Static46.aByteArray31[(int) (local56 - arg0 * 37L)];
			}
			@Pc(81) Class56 local81 = new Class56();
			local81.aByteArray29 = local52;
			local81.anInt2171 = local52.length;
			return local81;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLclient!td;)V")
	public static void method343(@OriginalArg(1) Class3_Sub1_Sub16 arg0) {
		@Pc(8) int local8 = arg0.anInt2811;
		@Pc(95) int local95;
		if (local8 >= 1 && local8 <= 100 || !(local8 < 701 || local8 > 800)) {
			if (Static24.anInt707 == 0) {
				if (local8 == 1) {
					arg0.aClass56_1546 = Static124.aClass56_1695;
					arg0.anInt2823 = 0;
					return;
				}
				if (local8 == 2) {
					arg0.aClass56_1546 = Static32.aClass56_520;
					arg0.anInt2823 = 0;
					return;
				}
			}
			if (Static24.anInt707 == 1) {
				if (local8 == 1) {
					arg0.anInt2823 = 0;
					arg0.aClass56_1546 = Static86.aClass56_1237;
					return;
				}
				if (local8 == 2) {
					arg0.anInt2823 = 0;
					arg0.aClass56_1546 = Static32.aClass56_524;
					return;
				}
				if (local8 == 3) {
					arg0.aClass56_1546 = Static29.aClass56_433;
					arg0.anInt2823 = 0;
					return;
				}
			}
			if (local8 <= 700) {
				local8--;
			} else {
				local8 -= 601;
			}
			local95 = Static42.anInt1124;
			if (Static24.anInt707 != 2) {
				local95 = 0;
			}
			if (local95 <= local8) {
				arg0.aClass56_1546 = Static122.aClass56_1633;
				arg0.anInt2823 = 0;
			} else {
				arg0.aClass56_1546 = Static113.aClass56Array15[local8];
				arg0.anInt2823 = 1;
			}
		} else if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
			if (local8 > 800) {
				local8 -= 701;
			} else {
				local8 -= 101;
			}
			local95 = Static42.anInt1124;
			if (Static24.anInt707 != 2) {
				local95 = 0;
			}
			if (local95 <= local8) {
				arg0.aClass56_1546 = Static122.aClass56_1633;
				arg0.anInt2823 = 0;
			} else {
				if (Static86.anIntArray195[local8] == 0) {
					arg0.aClass56_1546 = Static84.method1524(new Class56[] { Static41.aClass56_653, Static106.aClass56_1452 });
				} else if (Static86.anIntArray195[local8] >= 5000) {
					if (Static4.anInt54 == Static86.anIntArray195[local8]) {
						arg0.aClass56_1546 = Static84.method1524(new Class56[] { Static50.aClass56_803, Static63.aClass56_971, Static111.method1851(Static86.anIntArray195[local8] - 5000) });
					} else {
						arg0.aClass56_1546 = Static84.method1524(new Class56[] { Static50.aClass56_801, Static63.aClass56_971, Static111.method1851(Static86.anIntArray195[local8] - 5000) });
					}
				} else if (Static86.anIntArray195[local8] == Static4.anInt54) {
					arg0.aClass56_1546 = Static84.method1524(new Class56[] { Static50.aClass56_803, Static59.aClass56_924, Static111.method1851(Static86.anIntArray195[local8]) });
				} else {
					arg0.aClass56_1546 = Static84.method1524(new Class56[] { Static50.aClass56_801, Static59.aClass56_924, Static111.method1851(Static86.anIntArray195[local8]) });
				}
				arg0.anInt2823 = 1;
			}
		} else if (local8 == 203) {
			local95 = Static42.anInt1124;
			if (Static24.anInt707 != 2) {
				local95 = 0;
			}
			arg0.anInt2829 = local95 * 15 + 20;
			if (arg0.anInt2827 >= arg0.anInt2829) {
				arg0.anInt2829 = arg0.anInt2827 + 1;
			}
		} else if (local8 >= 401 && local8 <= 500) {
			local8 -= 401;
			if (local8 == 0 && Static24.anInt707 == 0) {
				arg0.anInt2823 = 0;
				arg0.aClass56_1546 = Static35.aClass56_549;
			} else if (local8 == 1 && Static24.anInt707 == 0) {
				arg0.anInt2823 = 0;
				arg0.aClass56_1546 = Static32.aClass56_520;
			} else {
				local95 = Static63.anInt1820;
				if (Static24.anInt707 == 0) {
					local95 = 0;
				}
				if (local95 <= local8) {
					arg0.aClass56_1546 = Static122.aClass56_1633;
					arg0.anInt2823 = 0;
				} else {
					arg0.aClass56_1546 = method342(Static84.aLongArray24[local8]).method1421();
					arg0.anInt2823 = 1;
				}
			}
		} else if (local8 == 503) {
			arg0.anInt2829 = Static63.anInt1820 * 15 + 20;
			if (arg0.anInt2827 >= arg0.anInt2829) {
				arg0.anInt2829 = arg0.anInt2827 + 1;
			}
		} else if (local8 == 324) {
			if (Static76.anInt2065 == -1) {
				Static76.anInt2065 = arg0.anInt2812;
				Static12.anInt305 = arg0.anInt2832;
			}
			if (Static76.aClass42_2.aBoolean72) {
				arg0.anInt2812 = Static76.anInt2065;
			} else {
				arg0.anInt2812 = Static12.anInt305;
			}
		} else if (local8 == 325) {
			if (Static76.anInt2065 == -1) {
				Static12.anInt305 = arg0.anInt2832;
				Static76.anInt2065 = arg0.anInt2812;
			}
			if (Static76.aClass42_2.aBoolean72) {
				arg0.anInt2812 = Static12.anInt305;
			} else {
				arg0.anInt2812 = Static76.anInt2065;
			}
		} else if (local8 == 327) {
			arg0.anInt2856 = 150;
			arg0.anInt2858 = (int) (Math.sin((double) Static98.anInt2566 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2841 = 5;
			arg0.anInt2805 = 0;
		} else if (local8 == 328) {
			arg0.anInt2856 = 150;
			arg0.anInt2858 = (int) (Math.sin((double) Static98.anInt2566 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2841 = 5;
			arg0.anInt2805 = 1;
		} else if (local8 == 600) {
			arg0.aClass56_1546 = Static84.method1524(new Class56[] { Static122.aClass56_1631, Static96.aClass56_1371 });
		} else if (local8 == 620) {
			if (Static29.anInt868 < 1) {
				arg0.aClass56_1546 = Static122.aClass56_1633;
			} else if (Static70.aBoolean87) {
				arg0.anInt2822 = 16711680;
				arg0.aClass56_1546 = Static122.aClass56_1645;
			} else {
				arg0.anInt2822 = 16777215;
				arg0.aClass56_1546 = Static59.aClass56_918;
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
	public static void method344() {
		aClass37_2 = null;
		aClass52_9 = null;
		aByteArrayArray4 = null;
		aClass75Array1 = null;
		aClass3_Sub1_Sub1_Sub2_1 = null;
		aClass30_4 = null;
		aClass33_1 = null;
	}
}
