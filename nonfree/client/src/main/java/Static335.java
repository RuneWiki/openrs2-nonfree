import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
	public static int anInt6393;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZIILclient!ms;B)V")
	public static void method5472(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class137 arg3) {
		@Pc(8) int local8 = arg3.anInt4060;
		if (arg3.aByte51 == 0) {
			arg3.anInt4060 = arg3.anInt4065;
		} else if (arg3.aByte51 == 1) {
			arg3.anInt4060 = arg2 - arg3.anInt4065;
		} else if (arg3.aByte51 == 2) {
			arg3.anInt4060 = arg2 * arg3.anInt4065 >> 14;
		}
		@Pc(48) int local48 = arg3.anInt4110;
		if (arg3.aByte49 == 0) {
			arg3.anInt4110 = arg3.anInt4081;
		} else if (arg3.aByte49 == 1) {
			arg3.anInt4110 = arg1 - arg3.anInt4081;
		} else if (arg3.aByte49 == 2) {
			arg3.anInt4110 = arg1 * arg3.anInt4081 >> 14;
		}
		if (arg3.aByte51 == 4) {
			arg3.anInt4060 = arg3.anInt4110 * arg3.anInt4101 / arg3.anInt4113;
		}
		if (arg3.aByte49 == 4) {
			arg3.anInt4110 = arg3.anInt4060 * arg3.anInt4113 / arg3.anInt4101;
		}
		if (Static332.aBoolean414 && (Static42.method634(arg3).anInt5612 != 0 || arg3.anInt4067 == 0)) {
			if (arg3.anInt4110 < 5 && arg3.anInt4060 < 5) {
				arg3.anInt4110 = 5;
				arg3.anInt4060 = 5;
			} else {
				if (arg3.anInt4060 <= 0) {
					arg3.anInt4060 = 5;
				}
				if (arg3.anInt4110 <= 0) {
					arg3.anInt4110 = 5;
				}
			}
		}
		if (arg3.anInt4093 == 1337) {
			Static188.aClass137_11 = arg3;
		}
		if (arg0 && arg3.anObjectArray30 != null && (arg3.anInt4060 != local8 || local48 != arg3.anInt4110)) {
			@Pc(191) Class11_Sub13 local191 = new Class11_Sub13();
			local191.aClass137_5 = arg3;
			local191.anObjectArray3 = arg3.anObjectArray30;
			Static284.aClass16_43.method190(local191);
		}
	}
}
