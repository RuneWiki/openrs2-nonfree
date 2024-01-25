import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "Lclient!f;")
	public static Class73 aClass73_38;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
	public static int anInt8445;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
	public static int anInt8441 = 0;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!iaa;Z)Z")
	public static boolean method6621(@OriginalArg(0) Class25_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static256.aClass127Array3 == Static108.aClass127Array5;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method6661();
		if (arg0.aShort106 < 0 || arg0.aShort107 < 0 || arg0.aShort108 >= Static349.anInt6237 || arg0.aShort109 >= Static414.anInt7451) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort106; local36 <= arg0.aShort108; local36++) {
			for (local40 = arg0.aShort107; local40 <= arg0.aShort109; local40++) {
				@Pc(47) Class333 local47 = Static195.method3408(arg0.aByte117, local36, local40);
				if (local47 != null) {
					@Pc(53) Class147 local53 = Static79.method1839(arg0);
					@Pc(56) Class147 local56 = local47.aClass147_3;
					if (local56 == null) {
						local47.aClass147_3 = local53;
					} else {
						while (local56.aClass147_2 != null) {
							local56 = local56.aClass147_2;
						}
						local56.aClass147_2 = local53;
					}
					if (local6 && (Static516.anIntArrayArray92[local36][local40] & 0xFF000000) != 0) {
						local8 = Static516.anIntArrayArray92[local36][local40];
						local10 = Static155.aShortArrayArray2[local36][local40];
						local12 = Static143.aByteArrayArray14[local36][local40];
					}
					if (!arg1 && local47.aClass25_Sub2_Sub5_1 != null && local47.aClass25_Sub2_Sub5_1.aShort48 > local33) {
						local33 = local47.aClass25_Sub2_Sub5_1.aShort48;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort106; local40 <= arg0.aShort108; local40++) {
				for (@Pc(136) int local136 = arg0.aShort107; local136 <= arg0.aShort109; local136++) {
					if ((Static516.anIntArrayArray92[local40][local136] & 0xFF000000) == 0) {
						Static516.anIntArrayArray92[local40][local136] = local8;
						Static155.aShortArrayArray2[local40][local136] = local10;
						Static143.aByteArrayArray14[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static34.aClass25_Sub2_Sub2Array2[Static283.anInt5319++] = arg0;
		} else {
			local40 = Static256.aClass127Array3 == Static108.aClass127Array5 ? 1 : 0;
			if (!arg0.method6653()) {
				Static69.aClass25_Sub2ArrayArray3[local40][Static473.anIntArray482[local40]++] = arg0;
			} else if (arg0.method6655()) {
				Static468.aClass25_Sub2ArrayArray4[local40][Static154.anIntArray135[local40]++] = arg0;
			} else {
				Static530.aClass25_Sub2ArrayArray5[local40][Static199.anIntArray186[local40]++] = arg0;
			}
		}
		if (arg1) {
			arg0.anInt8480 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIZ)Z")
	public static boolean method6622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZZ)V")
	public static void method6623(@OriginalArg(1) boolean arg0) {
		if (Static527.aString267.length() == 0) {
			return;
		}
		Static196.method3426("--> " + Static527.aString267);
		Static513.method6930(false, Static527.aString267, arg0);
		Static527.aString267 = "";
		Static329.anInt5996 = 0;
		Static478.anInt8321 = 0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "()V")
	public static void method6624() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static566.aClass333ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static566.aClass333ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static349.anInt6237; local6++) {
					for (local9 = 0; local9 < Static414.anInt7451; local9++) {
						if (Static566.aClass333ArrayArrayArray2[local3][local6][local9] != null) {
							Static566.aClass333ArrayArrayArray2[local3][local6][local9].method7507();
						}
						Static566.aClass333ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static566.aClass333ArrayArrayArray2 = null;
		Static420.aClass127Array6 = null;
		if (Static590.aClass333ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static590.aClass333ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static349.anInt6237; local6++) {
					for (local9 = 0; local9 < Static414.anInt7451; local9++) {
						if (Static590.aClass333ArrayArrayArray3[local3][local6][local9] != null) {
							Static590.aClass333ArrayArrayArray3[local3][local6][local9].method7507();
						}
						Static590.aClass333ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static590.aClass333ArrayArrayArray3 = null;
		Static108.aClass127Array5 = null;
		Static189.aClass333ArrayArrayArray1 = null;
		Static256.aClass127Array3 = null;
		Static209.aBooleanArrayArray11 = null;
		Static290.aBooleanArrayArray6 = null;
		Static205.aBooleanArrayArrayArray1 = null;
		Static540.aBooleanArrayArrayArray2 = null;
		Static28.method329();
		if (Static34.aClass25_Sub2_Sub2Array2 != null) {
			for (local3 = 0; local3 < Static283.anInt5319; local3++) {
				Static34.aClass25_Sub2_Sub2Array2[local3] = null;
			}
			Static283.anInt5319 = 0;
		}
		if (Static530.aClass25_Sub2ArrayArray5 != null) {
			for (local3 = 0; local3 < Static199.anIntArray186[0]; local3++) {
				Static530.aClass25_Sub2ArrayArray5[0][local3] = null;
			}
			for (local6 = 0; local6 < Static199.anIntArray186[1]; local6++) {
				Static530.aClass25_Sub2ArrayArray5[1][local6] = null;
			}
			Static199.anIntArray186 = new int[2];
		}
		if (Static468.aClass25_Sub2ArrayArray4 != null) {
			for (local3 = 0; local3 < Static154.anIntArray135[0]; local3++) {
				Static468.aClass25_Sub2ArrayArray4[0][local3] = null;
			}
			for (local6 = 0; local6 < Static154.anIntArray135[1]; local6++) {
				Static468.aClass25_Sub2ArrayArray4[1][local6] = null;
			}
			Static154.anIntArray135 = new int[2];
		}
		if (Static69.aClass25_Sub2ArrayArray3 != null) {
			for (local3 = 0; local3 < Static473.anIntArray482[0]; local3++) {
				Static69.aClass25_Sub2ArrayArray3[0][local3] = null;
			}
			for (local6 = 0; local6 < Static473.anIntArray482[1]; local6++) {
				Static69.aClass25_Sub2ArrayArray3[1][local6] = null;
			}
			Static473.anIntArray482 = new int[2];
		}
		if (Static364.aClass25_Sub2Array2 != null) {
			for (local3 = 0; local3 < Static364.aClass25_Sub2Array2.length; local3++) {
				Static364.aClass25_Sub2Array2[local3] = null;
			}
			Static505.anInt8754 = 0;
		}
		if (Static263.aClass25_Sub2Array1 != null) {
			for (local3 = 0; local3 < Static263.aClass25_Sub2Array1.length; local3++) {
				Static263.aClass25_Sub2Array1[local3] = null;
			}
			Static127.anInt2900 = 0;
		}
		if (Static196.aClass235Array1 != null) {
			for (local3 = 0; local3 < Static346.anInt6230; local3++) {
				Static196.aClass235Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static590.anInt10277; local6++) {
				for (local9 = 0; local9 < Static349.anInt6237; local9++) {
					for (@Pc(292) int local292 = 0; local292 < Static414.anInt7451; local292++) {
						Static31.aLongArrayArrayArray1[local6][local9][local292] = 0L;
					}
				}
			}
			Static346.anInt6230 = 0;
		}
		Static166.method3009();
		Static545.aClass269_10.method5969();
		Static143.aByteArrayArray14 = null;
		Static516.anIntArrayArray92 = null;
		Static155.aShortArrayArray2 = null;
		if (Static242.aClass176Array1 != null) {
			Static428.method5923();
			Static68.aClass31_4.method8043(1);
			Static68.aClass31_4.method8055(0);
		}
		if (Static483.aClass311Array1 != null) {
			Static483.aClass311Array1 = null;
		}
		Static68.aClass31_4 = null;
	}
}
