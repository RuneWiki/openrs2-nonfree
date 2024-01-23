import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
	public static int anInt1167;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
	public static int anInt1168;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "[[Lclient!ej;")
	public static Class43[][] aClass43ArrayArray1;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray5 = new String[200];

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString44 = " has logged out.";

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "[I")
	public static int[] anIntArray92 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIII)Z")
	public static boolean method988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static262.anInt4838 + arg0 * Static43.anInt976 >> 16;
		@Pc(19) int local19 = arg3 * Static43.anInt976 - arg0 * Static262.anInt4838 >> 16;
		@Pc(29) int local29 = arg1 * Static304.anInt5481 + local19 * Static3.anInt112 >> 16;
		@Pc(39) int local39 = arg1 * Static3.anInt112 - local19 * Static304.anInt5481 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static304.anInt5481 + local19 * Static3.anInt112 >> 16;
		@Pc(76) int local76 = arg2 * Static3.anInt112 - local19 * Static304.anInt5481 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Static163.anInt3267 && local87 < Static163.anInt3267) {
			return false;
		} else if (local50 > Static264.anInt4880 && local87 > Static264.anInt4880) {
			return false;
		} else if (local56 < Static196.anInt3909 && local93 < Static196.anInt3909) {
			return false;
		} else {
			return local56 <= Static143.anInt2793 || local93 <= Static143.anInt2793;
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Lclient!ml;")
	public static Class34 method989() {
		try {
			return new Class34_Sub3();
		} catch (@Pc(14) Throwable local14) {
			try {
				return (Class34) Class.forName("Class34_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(20) Throwable local20) {
				return new Class34_Sub2();
			}
		}
	}
}
