import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static361 {

	@OriginalMember(owner = "client!mea", name = "w", descriptor = "F")
	public static float aFloat120;

	@OriginalMember(owner = "client!mea", name = "x", descriptor = "I")
	public static int anInt6318;

	@OriginalMember(owner = "client!mea", name = "r", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_190 = new Class196(70, 6);

	@OriginalMember(owner = "client!mea", name = "v", descriptor = "I")
	public static int anInt6317 = 0;

	@OriginalMember(owner = "client!mea", name = "y", descriptor = "I")
	public static int anInt6319 = 0;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIIII)V")
	public static void method5315(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (anInt6317 <= arg1 - arg2 && arg2 + arg1 <= Static651.anInt10267 && Static128.anInt2200 <= arg0 - arg2 && arg2 + arg0 <= Static380.anInt6585) {
			Static174.method2562(arg1, arg0, arg3, arg2);
		} else {
			Static40.method507(arg2, arg0, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIB)Z")
	public static boolean method5316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}
}
