import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!d", name = "h", descriptor = "I")
	public static int anInt965 = 0;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "[I")
	public static int[] anIntArray122 = new int[50];

	@OriginalMember(owner = "client!d", name = "w", descriptor = "Z")
	public static boolean aBoolean71 = false;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method801() {
		if (Static196.aBoolean264) {
			return;
		}
		if (Static211.aBoolean285) {
			Static27.aFloat44 = (int) Static27.aFloat44 + 47 & 0xFFFFFFF0;
		} else {
			Static249.aFloat50 += (12.0F - Static249.aFloat50) / 2.0F;
		}
		Static136.aBoolean193 = true;
		Static196.aBoolean264 = true;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIBLclient!wf;)V")
	public static void method803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class191 arg2) {
		if (arg2.aByte25 == 0) {
			arg2.anInt6157 = arg2.anInt6114;
		} else if (arg2.aByte25 == 1) {
			arg2.anInt6157 = (arg0 - arg2.anInt6128) / 2 + arg2.anInt6114;
		} else if (arg2.aByte25 == 2) {
			arg2.anInt6157 = arg0 - arg2.anInt6114 - arg2.anInt6128;
		} else if (arg2.aByte25 == 3) {
			arg2.anInt6157 = arg0 * arg2.anInt6114 >> 14;
		} else if (arg2.aByte25 == 4) {
			arg2.anInt6157 = (arg0 - arg2.anInt6128) / 2 + (arg2.anInt6114 * arg0 >> 14);
		} else {
			arg2.anInt6157 = arg0 - (arg2.anInt6114 * arg0 >> 14) - arg2.anInt6128;
		}
		if (arg2.aByte28 == 0) {
			arg2.anInt6123 = arg2.anInt6145;
		} else if (arg2.aByte28 == 1) {
			arg2.anInt6123 = (arg1 - arg2.anInt6088) / 2 + arg2.anInt6145;
		} else if (arg2.aByte28 == 2) {
			arg2.anInt6123 = arg1 - arg2.anInt6145 - arg2.anInt6088;
		} else if (arg2.aByte28 == 3) {
			arg2.anInt6123 = arg1 * arg2.anInt6145 >> 14;
		} else if (arg2.aByte28 == 4) {
			arg2.anInt6123 = (arg1 - arg2.anInt6088) / 2 + (arg1 * arg2.anInt6145 >> 14);
		} else {
			arg2.anInt6123 = arg1 - (arg1 * arg2.anInt6145 >> 14) - arg2.anInt6088;
		}
		if (!Static303.aBoolean389 || Static35.method737(arg2).anInt5933 == 0 && arg2.anInt6086 != 0) {
			return;
		}
		if (arg2.anInt6123 < 0) {
			arg2.anInt6123 = 0;
		} else if (arg2.anInt6123 + arg2.anInt6088 > arg1) {
			arg2.anInt6123 = arg1 - arg2.anInt6088;
		}
		if (arg2.anInt6157 < 0) {
			arg2.anInt6157 = 0;
		} else if (arg2.anInt6128 + arg2.anInt6157 > arg0) {
			arg2.anInt6157 = arg0 - arg2.anInt6128;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)Z")
	public static boolean method809() {
		if (Static109.aBoolean152) {
			try {
				return !((Boolean) Static317.method295(Static142.aClass112_2.anApplet1, "showingVideoAd"));
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public static void method810() {
		Static226.aClass89_36.method2266();
		Static95.aClass89_12.method2266();
		Static22.aClass89_4.method2266();
	}
}
