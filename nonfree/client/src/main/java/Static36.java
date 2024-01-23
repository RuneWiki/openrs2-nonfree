import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ce", name = "P", descriptor = "[Lclient!rg;")
	public static Class48_Sub2[] aClass48_Sub2Array3;

	@OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
	public static int anInt4786;

	@OriginalMember(owner = "client!ce", name = "cb", descriptor = "F")
	public static float aFloat134;

	@OriginalMember(owner = "client!ce", name = "db", descriptor = "I")
	public static int anInt4790;

	@OriginalMember(owner = "client!ce", name = "T", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray24 = new String[] { "en", "de", "fr", "pt" };

	@OriginalMember(owner = "client!ce", name = "ab", descriptor = "Z")
	public static boolean aBoolean355 = false;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(IBI)I")
	public static int method3656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg0 > 0) {
			local15 = arg1 & 0x1 | local15 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local15;
	}
}
