import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static130 {

	@OriginalMember(owner = "client!eka", name = "j", descriptor = "Lclient!np;")
	public static Class258 aClass258_2;

	@OriginalMember(owner = "client!eka", name = "d", descriptor = "Lclient!bl;")
	public static Class40 aClass40_22;

	@OriginalMember(owner = "client!eka", name = "k", descriptor = "Lclient!hd;")
	public static final Class146 aClass146_1 = new Class146();

	@OriginalMember(owner = "client!eka", name = "l", descriptor = "I")
	public static int anInt2168 = 0;

	@OriginalMember(owner = "client!eka", name = "m", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(Z)V")
	public static void method1928(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static283.aClass128ArrayArrayArray1 = Static681.aClass128ArrayArrayArray3;
			Static177.aClass84Array2 = Static77.aClass84Array1;
		} else {
			Static283.aClass128ArrayArrayArray1 = Static451.aClass128ArrayArrayArray2;
			Static177.aClass84Array2 = Static668.aClass84Array4;
		}
		Static237.anInt4100 = Static283.aClass128ArrayArrayArray1.length;
	}
}
