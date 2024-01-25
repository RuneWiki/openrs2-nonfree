import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "[I")
	public static final int[] anIntArray565 = new int[5];

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
	public static int anInt6823 = 0;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)Lclient!cl;")
	public static Class1_Sub2_Sub5 method5351(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub2_Sub5 local17 = (Class1_Sub2_Sub5) Static302.aClass90_1.method1862((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static215.aClass250_50.method5667(0, arg0);
		if (local27 == null || local27.length <= 1) {
			return null;
		} else {
			local17 = Static46.method779(local27);
			Static302.aClass90_1.method1865((long) arg0, local17);
			return local17;
		}
	}
}
