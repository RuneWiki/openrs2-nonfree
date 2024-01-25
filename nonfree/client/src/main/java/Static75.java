import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_24 = new Class349(33, 7);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ha;II)Lclient!ug;")
	public static Class43 method1157(@OriginalArg(0) Class145 arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class2_Sub44 local18 = (Class2_Sub44) Static426.aClass218_29.method5095((long) arg1, 0);
		if (local18 != null) {
			@Pc(25) Class2_Sub12_Sub4 local25 = local18.aClass156_Sub1_1.method3416();
			local18.aBoolean618 = true;
			if (local25 != null) {
				return local25.method7850(arg0);
			}
		}
		return null;
	}
}
