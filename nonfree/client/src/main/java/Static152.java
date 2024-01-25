import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static152 {

	@OriginalMember(owner = "client!gca", name = "u", descriptor = "I")
	public static int anInt3449;

	@OriginalMember(owner = "client!gca", name = "q", descriptor = "Z")
	public static boolean aBoolean209 = false;

	@OriginalMember(owner = "client!gca", name = "t", descriptor = "Lclient!bt;")
	public static final Class37 aClass37_1 = new Class37("runescape", 0);

	@OriginalMember(owner = "client!gca", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString24 = null;

	@OriginalMember(owner = "client!gca", name = "w", descriptor = "Lclient!kv;")
	public static final Class171 aClass171_3 = new Class171();

	@OriginalMember(owner = "client!gca", name = "x", descriptor = "[F")
	public static final float[] aFloatArray32 = new float[4];

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BIIII)V")
	public static void method3104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static95.anInt2358 <= arg0 - arg2 && arg2 + arg0 <= Static299.anInt4491 && arg3 - arg2 >= Static92.anInt2338 && Static341.anInt6379 >= arg3 + arg2) {
			Static69.method7888(arg2, arg1, arg0, arg3);
		} else {
			Static364.method5662(arg0, arg3, arg2, arg1);
		}
	}
}
