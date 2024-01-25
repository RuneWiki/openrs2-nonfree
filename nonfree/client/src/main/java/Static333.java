import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!mga", name = "o", descriptor = "Lclient!tb;")
	public static final Class313 aClass313_36 = new Class313(4);

	@OriginalMember(owner = "client!mga", name = "s", descriptor = "Z")
	public static boolean aBoolean489 = false;

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)V")
	public static void method5099(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static427.anInt7297 == 2) {
				Static563.aClass356Array1[0].method7822(Static140.aClass72Array1[0]);
				Static563.aClass356Array1[1].method7822(Static140.aClass72Array1[1]);
			} else if (Static427.anInt7297 == 3) {
				Static563.aClass356Array1[0].method7822(Static140.aClass72Array1[0]);
				Static563.aClass356Array1[1].method7822(Static140.aClass72Array1[1]);
				Static563.aClass356Array1[2].method7822(Static140.aClass72Array1[2]);
			} else {
				Static563.aClass356Array1[0].method7822(Static140.aClass72Array1[0]);
				Static563.aClass356Array1[1].method7822(Static140.aClass72Array1[1]);
				Static563.aClass356Array1[2].method7822(Static140.aClass72Array1[2]);
				Static563.aClass356Array1[3].method7822(Static140.aClass72Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static427.anInt7297 == 2) {
				Static563.aClass356Array1[0].method7822(Static140.aClass72Array1[2]);
			} else if (Static427.anInt7297 == 3) {
				Static563.aClass356Array1[0].method7822(Static140.aClass72Array1[3]);
				Static563.aClass356Array1[1].method7822(Static140.aClass72Array1[4]);
			} else {
				Static563.aClass356Array1[0].method7822(Static140.aClass72Array1[4]);
				Static563.aClass356Array1[1].method7822(Static140.aClass72Array1[5]);
				Static563.aClass356Array1[2].method7822(Static140.aClass72Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static427.anInt7297 == 2) {
				Static563.aClass356Array1[0].method7822(Static140.aClass72Array1[3]);
				return;
			}
			if (Static427.anInt7297 == 3) {
				Static563.aClass356Array1[0].method7822(Static140.aClass72Array1[5]);
				return;
			}
			Static563.aClass356Array1[0].method7822(Static140.aClass72Array1[7]);
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIBLclient!kp;)V")
	public static void method5102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class196 arg2) {
		if (arg2.aByte75 == 0) {
			arg2.anInt5095 = arg2.anInt5142;
		} else if (arg2.aByte75 == 1) {
			arg2.anInt5095 = (arg1 - arg2.anInt5130) / 2 + arg2.anInt5142;
		} else if (arg2.aByte75 == 2) {
			arg2.anInt5095 = arg1 - arg2.anInt5142 - arg2.anInt5130;
		} else if (arg2.aByte75 == 3) {
			arg2.anInt5095 = arg2.anInt5142 * arg1 >> 14;
		} else if (arg2.aByte75 == 4) {
			arg2.anInt5095 = (arg1 - arg2.anInt5130) / 2 + (arg1 * arg2.anInt5142 >> 14);
		} else {
			arg2.anInt5095 = arg1 - (arg2.anInt5142 * arg1 >> 14) - arg2.anInt5130;
		}
		if (arg2.aByte74 == 0) {
			arg2.anInt5093 = arg2.anInt5163;
		} else if (arg2.aByte74 == 1) {
			arg2.anInt5093 = arg2.anInt5163 + (arg0 - arg2.anInt5078) / 2;
		} else if (arg2.aByte74 == 2) {
			arg2.anInt5093 = arg0 - arg2.anInt5078 - arg2.anInt5163;
		} else if (arg2.aByte74 == 3) {
			arg2.anInt5093 = arg2.anInt5163 * arg0 >> 14;
		} else if (arg2.aByte74 == 4) {
			arg2.anInt5093 = (arg0 - arg2.anInt5078) / 2 + (arg0 * arg2.anInt5163 >> 14);
		} else {
			arg2.anInt5093 = arg0 - arg2.anInt5078 - (arg0 * arg2.anInt5163 >> 14);
		}
		if (!Static298.aBoolean425 || Static67.method1102(arg2).anInt6464 == 0 && arg2.anInt5098 != 0) {
			return;
		}
		if (arg2.anInt5095 < 0) {
			arg2.anInt5095 = 0;
		} else if (arg2.anInt5130 + arg2.anInt5095 > arg1) {
			arg2.anInt5095 = arg1 - arg2.anInt5130;
		}
		if (arg2.anInt5093 < 0) {
			arg2.anInt5093 = 0;
		} else if (arg2.anInt5093 + arg2.anInt5078 > arg0) {
			arg2.anInt5093 = arg0 - arg2.anInt5078;
			return;
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String method5104(@OriginalArg(1) int arg0) {
		@Pc(13) String local13 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local13.length() - 3; local18 > 0; local18 -= 3) {
			local13 = local13.substring(0, local18) + "," + local13.substring(local18);
		}
		if (local13.length() > 9) {
			return " <col=00ff80>" + local13.substring(0, local13.length() - 8) + Static290.aClass198_35.method4365(Static52.anInt1264) + " (" + local13 + ")</col>";
		} else if (local13.length() > 6) {
			return " <col=ffffff>" + local13.substring(0, local13.length() - 4) + Static290.aClass198_37.method4365(Static52.anInt1264) + " (" + local13 + ")</col>";
		} else {
			return " <col=ffff00>" + local13 + "</col>";
		}
	}
}
