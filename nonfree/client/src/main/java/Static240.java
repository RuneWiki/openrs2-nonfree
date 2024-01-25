import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "Z")
	public static boolean aBoolean152 = false;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	public static int anInt1911 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZII)V")
	public static void method1409(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static270.aFloat48 > Static270.aFloat47) {
			Static270.aFloat47 = (float) ((double) Static270.aFloat47 + (double) Static270.aFloat47 / 30.0D);
			if (Static270.aFloat48 < Static270.aFloat47) {
				Static270.aFloat47 = Static270.aFloat48;
			}
			Static246.method3822();
			Static270.anInt1791 = (int) Static270.aFloat47 >> 1;
			Static270.aByteArrayArrayArray14 = Static334.method5123(Static270.anInt1791);
		} else if (Static270.aFloat48 < Static270.aFloat47) {
			Static270.aFloat47 = (float) ((double) Static270.aFloat47 - (double) Static270.aFloat47 / 30.0D);
			if (Static270.aFloat47 < Static270.aFloat48) {
				Static270.aFloat47 = Static270.aFloat48;
			}
			Static246.method3822();
			Static270.anInt1791 = (int) Static270.aFloat47 >> 1;
			Static270.aByteArrayArrayArray14 = Static334.method5123(Static270.anInt1791);
		}
		if (Static264.anInt4873 != -1 && Static415.anInt7185 != -1) {
			@Pc(83) int local83 = Static264.anInt4873 - Static549.anInt8926;
			if (local83 < 2 || local83 > 2) {
				local83 /= 8;
			}
			@Pc(98) int local98 = Static415.anInt7185 - Static75.anInt1651;
			Static549.anInt8926 += local83;
			if (local98 < 2 || local98 > 2) {
				local98 /= 8;
			}
			Static75.anInt1651 -= -local98;
			if (local83 == 0 && local98 == 0) {
				Static415.anInt7185 = -1;
				Static264.anInt4873 = -1;
			}
			Static246.method3822();
		}
		if (Static356.anInt6365 <= 0) {
			Static582.anInt9503 = -1;
			Static591.anInt9584 = -1;
		} else {
			Static485.anInt8224--;
			if (Static485.anInt8224 == 0) {
				Static485.anInt8224 = 100;
				Static356.anInt6365--;
			}
		}
		if (!Static381.aBoolean544 || Static36.aClass8_3 == null) {
			return;
		}
		for (@Pc(166) Class2_Sub8 local166 = (Class2_Sub8) Static36.aClass8_3.method210(); local166 != null; local166 = (Class2_Sub8) Static36.aClass8_3.method218()) {
			@Pc(175) Class366 local175 = Static270.aClass25_2.method435(local166.aClass2_Sub46_1.anInt9117);
			if (local166.method960(arg1, arg0)) {
				if (local175.aStringArray190 != null) {
					if (local175.aStringArray190[4] != null) {
						Static304.method4554(local175.anInt9642, false, 0, -1, true, -1, (long) local166.aClass2_Sub46_1.anInt9117, local175.aString100, 1006, local175.aStringArray190[4]);
					}
					if (local175.aStringArray190[3] != null) {
						Static304.method4554(local175.anInt9642, false, 0, -1, true, -1, (long) local166.aClass2_Sub46_1.anInt9117, local175.aString100, 1002, local175.aStringArray190[3]);
					}
					if (local175.aStringArray190[2] != null) {
						Static304.method4554(local175.anInt9642, false, 0, -1, true, -1, (long) local166.aClass2_Sub46_1.anInt9117, local175.aString100, 1010, local175.aStringArray190[2]);
					}
					if (local175.aStringArray190[1] != null) {
						Static304.method4554(local175.anInt9642, false, 0, -1, true, -1, (long) local166.aClass2_Sub46_1.anInt9117, local175.aString100, 1007, local175.aStringArray190[1]);
					}
					if (local175.aStringArray190[0] != null) {
						Static304.method4554(local175.anInt9642, false, 0, -1, true, -1, (long) local166.aClass2_Sub46_1.anInt9117, local175.aString100, 1012, local175.aStringArray190[0]);
					}
				}
				if (!local166.aClass2_Sub46_1.aBoolean695) {
					local166.aClass2_Sub46_1.aBoolean695 = true;
					Static552.method7500(Static199.aClass269_5, local166.aClass2_Sub46_1.anInt9117, local175.anInt9642);
				}
				if (local166.aClass2_Sub46_1.aBoolean695) {
					Static552.method7500(Static443.aClass269_8, local166.aClass2_Sub46_1.anInt9117, local175.anInt9642);
				}
			} else if (local166.aClass2_Sub46_1.aBoolean695) {
				local166.aClass2_Sub46_1.aBoolean695 = false;
				Static552.method7500(Static187.aClass269_4, local166.aClass2_Sub46_1.anInt9117, local175.anInt9642);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IC)I")
	public static int method1410(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class186.anIntArray336.length ? Class186.anIntArray336[arg0] : -1;
	}
}
