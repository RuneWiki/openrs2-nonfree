import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static139 {

	@OriginalMember(owner = "client!eq", name = "T", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!eq", name = "X", descriptor = "I")
	public static int anInt2958;

	@OriginalMember(owner = "client!eq", name = "Z", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!eq", name = "cb", descriptor = "Lclient!nd;")
	public static Class238 aClass238_66;

	@OriginalMember(owner = "client!eq", name = "db", descriptor = "I")
	public static int anInt2961;

	@OriginalMember(owner = "client!eq", name = "rb", descriptor = "Lclient!de;")
	public static final Class69 aClass69_15 = new Class69(64);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)Z")
	public static boolean method2559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | Static228.method3698(arg1, arg0) || Static394.method5835(arg0, arg1);
	}
}
