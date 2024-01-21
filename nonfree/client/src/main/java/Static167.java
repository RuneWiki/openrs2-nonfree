import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
	public static int anInt739;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "Lclient!kb;")
	public static Class46 aClass46_187 = Static65.method1172("null");

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "Lclient!kb;")
	private static Class46 aClass46_189 = Static65.method1172("Login limit exceeded)3");

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Lclient!kb;")
	public static Class46 aClass46_188 = aClass46_189;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
	public static int anInt734 = 0;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "[I")
	public static int[] anIntArray50 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -1, -2, 0, 0, 2, 0, 0, 0, 0, 0, 7, -2, 0, 0, 0, -1, 0, 15, 0, 0, 1, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 11, 0, 11, 0, 5, 0, 0, 0, 0, 4, 0, 6, 0, 0, 0, 0, 8, 0, 0, -1, 2, -2, 0, 0, 0, 0, 20, 0, 0, 5, 0, 10, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 2, 7, 0, 24, 0, 0, 0, 0, 7, 6, 0, 6, 0, 2, 0, 0, 4, 1, -2, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 6, 1, -2, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 0, -2, 0, 0, 0, 0, 0, 6, 3, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 6, 0, 0, 0, 5, 4, 0, -2, 0, 3, 0, -1, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, -2, 0, 0, 0, 0, 0, 0, 0, 0, 8, 6, 0, 0, 0, 0, 0, 0, 6, 14, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 6, 2, 0, 0, 6, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 4, 0, 0, 0, -2, 0, -2, 0, 0, 0, -1, 0, 0, 3 };

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "[Lclient!kb;")
	public static Class46[] aClass46Array3 = new Class46[1000];

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "Lclient!kb;")
	public static Class46 aClass46_190 = Static65.method1172("null");

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "Lclient!kb;")
	private static Class46 aClass46_191 = Static65.method1172("Ok");

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "Lclient!kb;")
	public static Class46 aClass46_192 = aClass46_191;

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
	public static int anInt740 = -1;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!jg;BI)Z")
	public static boolean method521(@OriginalArg(0) Class44 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method1633(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static178.method2858(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	public static void method522() {
		aShortArrayArray4 = null;
		aClass46_189 = null;
		aClass46_192 = null;
		aClass46_187 = null;
		aClass46_191 = null;
		aClass46Array3 = null;
		anIntArray50 = null;
		aClass46_188 = null;
		aClass46_190 = null;
	}
}
