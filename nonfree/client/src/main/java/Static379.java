import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!nl", name = "G", descriptor = "[I")
	public static int[] anIntArray680;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)Lclient!fk;")
	public static Class112 method7521(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static26.aClass112Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)Z")
	public static boolean method7523(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static251.aBoolean343) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static441.aClass357ArrayArray1[local13] == null || Static441.aClass357ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(41) Class357 local41 = Static441.aClass357ArrayArray1[local13][local17];
		@Pc(55) Class5_Sub4_Sub14 local55;
		if (arg1 == -1 && local41.anInt9828 == 0) {
			for (local55 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7313(); local55 != null; local55 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7301()) {
				if (local55.anInt5598 == 25 || local55.anInt5598 == 1003 || local55.anInt5598 == 17 || local55.anInt5598 == 48 || local55.anInt5598 == 30) {
					for (@Pc(88) Class357 local88 = Static472.method6903(local55.anInt5594); local88 != null; local88 = Static243.method3688(local88)) {
						if (local41.anInt9804 == local88.anInt9804) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7313(); local55 != null; local55 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7301()) {
				if (arg1 == local55.anInt5597 && local55.anInt5594 == local41.anInt9804 && (local55.anInt5598 == 25 || local55.anInt5598 == 1003 || local55.anInt5598 == 17 || local55.anInt5598 == 48 || local55.anInt5598 == 30)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)V")
	public static void method7524(@OriginalArg(1) int arg0) {
		@Pc(12) Class5_Sub4_Sub13 local12 = Static506.method2916(arg0, 12);
		local12.method4132();
	}
}
