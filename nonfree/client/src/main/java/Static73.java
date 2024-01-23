import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
	public static int anInt1576;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "[Lclient!wd;")
	public static Class8_Sub1_Sub7[] aClass8_Sub1_Sub7Array36;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	public static int anInt1574 = 0;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString61 = null;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "[I")
	public static int[] anIntArray110 = new int[32];

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString62 = "purple:";

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)V")
	public static void method1156(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class8_Sub1_Sub6 local12 = Static181.method2779(9, arg1);
		local12.method931();
		local12.anInt1286 = arg2;
		local12.anInt1284 = arg0;
	}
}
