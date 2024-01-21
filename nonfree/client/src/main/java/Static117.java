import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!m", name = "T", descriptor = "Lclient!ga;")
	public static Class36 aClass36_2;

	@OriginalMember(owner = "client!m", name = "hb", descriptor = "Lclient!vi;")
	public static Class2_Sub1_Sub2 aClass2_Sub1_Sub2_3;

	@OriginalMember(owner = "client!m", name = "cb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_894 = Static151.method2243("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!m", name = "ab", descriptor = "Lclient!mb;")
	public static Class62 aClass62_893 = aClass62_894;

	@OriginalMember(owner = "client!m", name = "fb", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_13 = new Class53(64);

	@OriginalMember(owner = "client!m", name = "ib", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_895 = Static151.method2243("mapflag");

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ha;)V")
	public static void method1811(@OriginalArg(0) Class39 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1480; local2 <= arg0.anInt1481; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1484; local6 <= arg0.anInt1482; local6++) {
				@Pc(16) Class2_Sub18 local16 = Static92.aClass2_Sub18ArrayArrayArray1[arg0.anInt1483][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt3292; local20++) {
						if (local16.aClass39Array2[local20] == arg0) {
							local16.anInt3292--;
							for (local35 = local20; local35 < local16.anInt3292; local35++) {
								local16.aClass39Array2[local35] = local16.aClass39Array2[local35 + 1];
								local16.anIntArray286[local35] = local16.anIntArray286[local35 + 1];
							}
							local16.aClass39Array2[local16.anInt3292] = null;
							break;
						}
					}
					local16.anInt3300 = 0;
					for (local35 = 0; local35 < local16.anInt3292; local35++) {
						local16.anInt3300 |= local16.anIntArray286[local35];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IJ)V")
	public static void method1813(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static169.method2463(arg0 - 1L);
			Static169.method2463(1L);
		} else {
			Static169.method2463(arg0);
		}
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V")
	public static void method1814() {
		if (!Static8.aBoolean12) {
			return;
		}
		@Pc(16) Class47 local16 = Static93.method1400(Static204.anInt4234, Static151.anInt3208);
		if (local16 != null && local16.anObjectArray9 != null) {
			@Pc(25) Class2_Sub13 local25 = new Class2_Sub13();
			local25.anObjectArray27 = local16.anObjectArray9;
			local25.aClass47_12 = local16;
			Static140.method2145(local25);
		}
		Static8.aBoolean12 = false;
		Static165.method2410(local16);
	}
}
