import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static24 {

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	public static int anInt5482;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "[[S")
	public static short[][] aShortArrayArray11;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
	public static int anInt5487;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_124 = new Class40(42, -1);

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[8];

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Z")
	public static boolean method4703(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIB)Z")
	public static boolean method4707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static36.method512(arg0, arg1) | Static39.method562(arg1, arg0) | Static149.method2197(arg0, arg1)) & Static325.method5030(arg1, arg0);
	}
}
