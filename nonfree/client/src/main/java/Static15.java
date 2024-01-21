import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_13;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
	public static int anInt456;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "Lclient!fd;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_14;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "[I")
	public static final int[] anIntArray42 = new int[128];

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_158 = Static177.method3050("Hidden)2");

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_160 = Static177.method3050("Ok");

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "Lclient!jd;")
	public static Class46 aClass46_159 = aClass46_160;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V")
	public static void method277() {
		@Pc(10) int local10;
		for (@Pc(3) int local3 = -1; local3 < Static126.anInt3006; local3++) {
			if (local3 == -1) {
				local10 = 2047;
			} else {
				local10 = Static167.anIntArray369[local3];
			}
			@Pc(20) Class4_Sub1_Sub1_Sub1_Sub1 local20 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local10];
			if (local20 != null && local20.anInt2826 > 0) {
				local20.anInt2826--;
				if (local20.anInt2826 == 0) {
					local20.aClass46_1037 = null;
				}
			}
		}
		for (local10 = 0; local10 < Static87.anInt2219; local10++) {
			@Pc(60) int local60 = Static35.anIntArray82[local10];
			@Pc(64) Class4_Sub1_Sub1_Sub1_Sub2 local64 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local60];
			if (local64 != null && local64.anInt2826 > 0) {
				local64.anInt2826--;
				if (local64.anInt2826 == 0) {
					local64.aClass46_1037 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)Z")
	public static boolean method279(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}
