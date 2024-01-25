import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!iaa", name = "h", descriptor = "F")
	public static float aFloat73;

	@OriginalMember(owner = "client!iaa", name = "e", descriptor = "Lclient!nj;")
	public static Class253 aClass253_1;

	@OriginalMember(owner = "client!iaa", name = "f", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_127 = new Class160(140, -2);

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "I")
	public static int anInt4621 = 0;

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "I")
	public static int anInt4622 = -1;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "([BIIIII)V")
	public static void method4040(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		arg1 += arg2;
		@Pc(21) int local21 = arg3 - arg2 >> 2;
		while (true) {
			local21--;
			if (local21 < 0) {
				if (-24310 != -24310) {
					anInt4622 = -94;
				}
				local21 = arg3 - arg2 & 0x3;
				while (true) {
					local21--;
					if (local21 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(26) int local26 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(31) int local31 = local26 + 1;
			arg0[local26] = 1;
			@Pc(36) int local36 = local31 + 1;
			arg0[local31] = 1;
			arg1 = local36 + 1;
			arg0[local36] = 1;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIILclient!th;IBI)Z")
	public static boolean method4041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class348 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (!Static413.aBoolean501 || !Static434.aBoolean515) {
			return false;
		} else if (anInt4621 < 100) {
			return false;
		} else if (arg4 != arg5 || arg2 != arg0) {
			for (@Pc(60) int local60 = arg5; local60 <= arg4; local60++) {
				for (@Pc(66) int local66 = arg2; local66 <= arg0; local66++) {
					if (-Static559.anInt9354 == Static354.anIntArrayArrayArray16[arg1][local60][local66]) {
						return false;
					}
				}
			}
			if (32 != 32) {
				anInt4622 = 95;
			}
			if (Static69.method1094(arg3)) {
				Static264.anInt4913++;
				return true;
			} else {
				return false;
			}
		} else if (!Static164.method2366(arg2, arg5, arg1)) {
			return false;
		} else if (Static69.method1094(arg3)) {
			Static264.anInt4913++;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)V")
	public static void method4042() {
		if (Static18.aClass168_1 != null) {
			Static161.aClass329_3 = new Class329();
			Static161.aClass329_3.method8073(Static18.aClass168_1, Static50.aLong36, Static18.aClass168_1.anInt4640, Static18.aClass168_1.aClass21_63.method324(Static26.anInt352));
			Static101.aThread2 = new Thread(Static161.aClass329_3, "");
			Static101.aThread2.start();
		}
	}
}
