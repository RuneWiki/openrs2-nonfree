import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "Lclient!sm;")
	public static Class214 aClass214_28;

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_156 = new Class211(18, 6);

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "Lclient!at;")
	public static final Class17 aClass17_67 = new Class17();

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "[I")
	public static final int[] anIntArray722 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
	public static int anInt6076 = 0;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIII)I")
	public static int method5231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < arg2) {
			return arg2;
		} else if (arg1 < arg0) {
			return arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)V")
	public static void method5237() {
		if (!Static268.aBoolean453) {
			return;
		}
		while (true) {
			while (Static52.aClass124_Sub1Array1.length > Static78.anInt1494) {
				@Pc(26) Class124_Sub1 local26 = Static52.aClass124_Sub1Array1[Static78.anInt1494];
				if (local26 != null && local26.anInt5512 == -1) {
					if (Static300.aClass1_Sub21_2 == null) {
						Static300.aClass1_Sub21_2 = Static352.aClass173_1.method3890(local26.aString64);
					}
					@Pc(49) int local49 = Static300.aClass1_Sub21_2.anInt3209;
					if (local49 == -1) {
						return;
					}
					Static78.anInt1494++;
					Static300.aClass1_Sub21_2 = null;
					local26.anInt5512 = local49;
				} else {
					Static78.anInt1494++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(IIII)V")
	public static void method5238(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg0 * Static188.aClass135_Sub1_1.anInt3379 >> 8;
		if (arg1 == -1 && !Static12.aBoolean13) {
			Static374.method5259();
		} else if (arg1 != -1 && (Static91.anInt1663 != arg1 || !Static247.method3678()) && local6 != 0 && !Static12.aBoolean13) {
			Static177.method1112(local6, Static156.aClass230_44, arg1, arg2);
		}
		Static91.anInt1663 = arg1;
	}
}
