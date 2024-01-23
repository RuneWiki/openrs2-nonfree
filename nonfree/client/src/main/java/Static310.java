import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
	public static int anInt6026;

	@OriginalMember(owner = "client!wh", name = "L", descriptor = "[I")
	public static int[] anIntArray678;

	@OriginalMember(owner = "client!wh", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString370 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIZII)V")
	public static void method4810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		Static212.anInt4165 = arg5;
		Static151.anInt2977 = arg1;
		Static183.anInt3490 = arg2;
		Static160.anInt3131 = arg3;
		Static276.anInt5237 = arg0;
		if (arg4 && Static183.anInt3490 >= 100) {
			Static129.anInt2519 = Static151.anInt2977 * 128 + 64;
			Static302.anInt5682 = Static212.anInt4165 * 128 + 64;
			Static82.anInt1931 = Static33.method522(Static302.anInt5682, Static129.anInt2519, Static281.anInt5335) - Static160.anInt3131;
		}
		Static41.anInt772 = 2;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lclient!d;")
	public static Class34 method4813(@OriginalArg(1) int arg0) {
		@Pc(10) Class34 local10 = (Class34) Static253.aClass26_51.method518((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static229.aClass58_84.method1372(32, arg0);
		local10 = new Class34();
		if (local27 != null) {
			local10.method720(new Class4_Sub10(local27));
		}
		local10.method725();
		Static253.aClass26_51.method510(local10, (long) arg0);
		return local10;
	}
}
