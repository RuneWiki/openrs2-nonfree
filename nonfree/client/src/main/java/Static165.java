import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "Lclient!th;")
	public static Class168 aClass168_121;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
	public static int anInt3668;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray45 = new int[5][5000];

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
	public static int anInt3670 = 0;

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
	public static int anInt3672 = 0;

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "[I")
	public static int[] anIntArray330 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)Lclient!eb;")
	public static Class1_Sub3_Sub6 method2679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg1 << 8 | arg0;
		@Pc(23) Class1_Sub3_Sub6 local23 = (Class1_Sub3_Sub6) Static157.aClass162_6.method4003((long) local9 << 16);
		if (local23 != null) {
			return local23;
		}
		@Pc(39) byte[] local39 = Static208.aClass168_154.method4062(Static208.aClass168_154.method4065(local9));
		if (local39 == null) {
			local9 = arg2 + 65536 << 8 | arg0;
			local23 = (Class1_Sub3_Sub6) Static157.aClass162_6.method4003((long) local9 << 16);
			if (local23 != null) {
				return local23;
			}
			local39 = Static208.aClass168_154.method4062(Static208.aClass168_154.method4065(local9));
			if (local39 == null) {
				local9 = arg0 | 0xFFFF00;
				local23 = (Class1_Sub3_Sub6) Static157.aClass162_6.method4003((long) local9 << 16);
				if (local23 != null) {
					return local23;
				}
				local39 = Static208.aClass168_154.method4062(Static208.aClass168_154.method4065(local9));
				if (local39 == null) {
					return null;
				} else if (local39.length > 1) {
					local23 = Static245.method3803(local39);
					local23.anInt1260 = arg0;
					Static157.aClass162_6.method4005(local23, (long) local9 << 16);
					return local23;
				} else {
					return null;
				}
			} else if (local39.length <= 1) {
				return null;
			} else {
				local23 = Static245.method3803(local39);
				local23.anInt1260 = arg0;
				Static157.aClass162_6.method4005(local23, (long) local9 << 16);
				return local23;
			}
		} else if (local39.length > 1) {
			local23 = Static245.method3803(local39);
			local23.anInt1260 = arg0;
			Static157.aClass162_6.method4005(local23, (long) local9 << 16);
			return local23;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
	public static void method2680() {
		Static105.aClass89_13.method2266();
		Static62.aClass89_11.method2266();
	}
}
