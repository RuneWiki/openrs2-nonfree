import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "Lclient!tq;")
	public static Class191 aClass191_116;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V")
	public static void method3325() {
		Static110.aClass119_72.method3312();
		Static250.aClass119_154.method3312();
		Static29.aClass119_16.method3312();
		Static98.aClass119_58.method3312();
		Static126.aClass119_83.method3312();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZZI)Ljava/lang/String;")
	public static String method3327(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(37) int local37 = 2;
		for (@Pc(41) int local41 = arg0 / 10; local41 != 0; local41 /= 10) {
			local37++;
		}
		@Pc(56) char[] local56 = new char[local37];
		local56[0] = '+';
		for (@Pc(69) int local69 = local37 - 1; local69 > 0; local69--) {
			@Pc(73) int local73 = arg0;
			arg0 /= 10;
			@Pc(84) int local84 = local73 - arg0 * 10;
			if (local84 >= 10) {
				local56[local69] = (char) (local84 + 87);
			} else {
				local56[local69] = (char) (local84 + 48);
			}
		}
		return new String(local56);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method3328(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static326.anInt6623;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(21) Class200 local21 = Static65.method1485(arg0[local13]);
			if (local21.anInt6647 != -1) {
				@Pc(34) Class31 local34 = (Class31) Static151.aClass119_94.method3311((long) local21.anInt6647);
				if (local34 == null) {
					@Pc(42) Class76 local42 = Static361.method2368(Static59.aClass191_35, local21.anInt6647, 0);
					if (local42 != null) {
						local34 = Static147.aClass4_2.method4214(local42);
						Static151.aClass119_94.method3308(local34, (long) local21.anInt6647);
					}
				}
				if (local34 != null) {
					Static36.aClass31Array1[local11] = local34;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
