import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!i", name = "p", descriptor = "I")
	public static int anInt2791;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "I")
	public static int anInt2792 = -1;

	@OriginalMember(owner = "client!i", name = "s", descriptor = "I")
	public static int anInt2794 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!rk;Lclient!rk;B)V")
	public static void method2603(@OriginalArg(0) Class180 arg0, @OriginalArg(1) Class180 arg1) {
		Static153.aClass180_41 = arg1;
		Static264.aClass180_71 = arg0;
		Static264.aClass180_71.method4553(34);
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
	public static void method2604() {
		if (Static74.aBoolean141) {
			return;
		}
		Static74.aBoolean141 = true;
		Static13.aBoolean10 = true;
		if (Static268.aBoolean393) {
			Static18.aFloat7 = (int) Static18.aFloat7 + 47 & 0xFFFFFFF0;
		} else {
			Static321.aFloat76 += (12.0F - Static321.aFloat76) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
	public static void method2605() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static252.aClass49ArrayArrayArray7 != null) {
			for (local3 = 0; local3 < Static252.aClass49ArrayArrayArray7.length; local3++) {
				for (local6 = 0; local6 < Static346.anInt6536; local6++) {
					for (local9 = 0; local9 < Static174.anInt3604; local9++) {
						if (Static252.aClass49ArrayArrayArray7[local3][local6][local9] != null) {
							Static252.aClass49ArrayArrayArray7[local3][local6][local9].method1173();
						}
						Static252.aClass49ArrayArrayArray7[local3][local6][local9] = null;
					}
				}
			}
		}
		Static252.aClass49ArrayArrayArray7 = null;
		Static136.aClass8Array3 = null;
		if (Static289.aClass49ArrayArrayArray5 != null) {
			for (local3 = 0; local3 < Static289.aClass49ArrayArrayArray5.length; local3++) {
				for (local6 = 0; local6 < Static346.anInt6536; local6++) {
					for (local9 = 0; local9 < Static174.anInt3604; local9++) {
						if (Static289.aClass49ArrayArrayArray5[local3][local6][local9] != null) {
							Static289.aClass49ArrayArrayArray5[local3][local6][local9].method1173();
						}
						Static289.aClass49ArrayArrayArray5[local3][local6][local9] = null;
					}
				}
			}
		}
		Static289.aClass49ArrayArrayArray5 = null;
		Static251.aClass8Array6 = null;
		Static229.aClass49ArrayArrayArray6 = null;
		Static331.aClass8Array5 = null;
		Static140.anInt3044 = 0;
		if (Static125.aClass142Array2 != null) {
			for (local3 = 0; local3 < Static140.anInt3044; local3++) {
				Static125.aClass142Array2[local3] = null;
			}
		}
		if (Static282.aClass22_Sub2Array3 != null) {
			for (local3 = 0; local3 < Static2.anInt9; local3++) {
				Static282.aClass22_Sub2Array3[local3] = null;
			}
			Static2.anInt9 = 0;
		}
		if (Static116.aClass7_Sub16_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static105.anInt6014; local3++) {
				Static116.aClass7_Sub16_Sub1Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static41.anInt1075; local6++) {
				for (local9 = 0; local9 < Static346.anInt6536; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static174.anInt3604; local160++) {
						Static142.anIntArrayArrayArray11[local6][local9][local160] = 0;
					}
				}
			}
			Static105.anInt6014 = 0;
		}
		Static285.anIntArrayArrayArray14 = null;
		Static254.method4309();
		Static320.aClass191_7.method4865();
		Static220.aClass11_1 = null;
		Static20.anIntArrayArray5 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZI)I")
	public static int method2606(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(27) int local27 = (arg0 * local19 >> 12) + 40960;
		return local13 * local27 >> 12;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	public static void method2607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1001) {
			Static83.method1761(10, arg2, arg0);
		} else if (arg1 == 1012) {
			Static83.method1761(11, arg2, arg0);
		} else if (arg1 == 1003) {
			Static83.method1761(12, arg2, arg0);
		} else if (arg1 == 1007) {
			Static83.method1761(13, arg2, arg0);
		} else if (arg1 == 1005) {
			Static83.method1761(14, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!rk;BLclient!rk;Z)V")
	public static void method2608(@OriginalArg(0) Class180 arg0, @OriginalArg(2) Class180 arg1) {
		Static246.aClass180_63 = arg0;
		Static291.aClass180_83 = arg1;
		Static114.aBoolean180 = true;
		@Pc(15) int local15 = Static291.aClass180_83.method4576() - 1;
		Static233.anInt4645 = Static291.aClass180_83.method4553(local15) + local15 * 256;
		Static28.aStringArray7 = new String[] { null, null, Static8.aString11, null, null };
		Static54.aStringArray11 = new String[] { null, null, null, null, Static267.aString334 };
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V")
	public static void method2609() {
		if (Static239.aClass152_1 != null) {
			@Pc(14) Class152 local14 = Static239.aClass152_1;
			synchronized (Static239.aClass152_1) {
				Static239.aClass152_1 = null;
			}
		}
	}
}
