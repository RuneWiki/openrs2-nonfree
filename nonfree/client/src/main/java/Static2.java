import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "[[[Lclient!nt;")
	public static Class164[][][] aClass164ArrayArrayArray1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "[F")
	public static final float[] aFloatArray1 = new float[4];

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString1 = "";

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Lclient!id;")
	public static Class104 method6(@OriginalArg(1) int arg0) {
		@Pc(8) Class104[] local8 = Static132.method2319();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class104 local16 = local8[local10];
			if (local16.anInt3180 == arg0) {
				return local16;
			}
		}
		return null;
	}
}
