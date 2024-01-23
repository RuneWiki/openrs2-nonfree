import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
	public static int anInt5539;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "Lclient!ek;")
	public static Class42 aClass42_101;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "Lclient!ak;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_7;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
	public static int anInt5543;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "[I")
	public static int[] anIntArray528;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString196 = "purple:";

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "Z")
	public static boolean aBoolean365 = true;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString197 = "white:";

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
	public static int anInt5545 = -1;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I")
	public static int method4393(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 * 6 - 61440;
		@Pc(19) int local19 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(28) int local28 = (arg0 * local9 >> 12) + 40960;
		return local19 * local28 >> 12;
	}
}
