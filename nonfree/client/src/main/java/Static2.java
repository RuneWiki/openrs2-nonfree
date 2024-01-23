import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
	public static int anInt54;

	@OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
	public static int anInt82;

	@OriginalMember(owner = "client!aa", name = "gb", descriptor = "I")
	public static int anInt94;

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "J")
	public static long aLong4 = 0L;

	@OriginalMember(owner = "client!aa", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString1 = " is already on your ignore list.";

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!nm;B)[Lclient!fo;")
	public static Class57_Sub1[] method44(@OriginalArg(0) int arg0, @OriginalArg(1) Class119 arg1) {
		return Static219.method3548(arg1, arg0) ? Static89.method1732() : null;
	}
}
