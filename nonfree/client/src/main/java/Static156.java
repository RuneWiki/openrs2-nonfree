import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!jq", name = "s", descriptor = "I")
	public static int anInt3217;

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_109 = new Class217(31, 12);

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "[I")
	public static final int[] anIntArray238 = new int[14];

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
	public static int anInt3218 = 20;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Lclient!np;")
	public static Class1_Sub4_Sub20 method2960(@OriginalArg(1) int arg0) {
		@Pc(5) Class21 local5 = Static19.aClass21_18;
		@Pc(14) Class1_Sub4_Sub20 local14;
		synchronized (Static19.aClass21_18) {
			local14 = (Class1_Sub4_Sub20) Static19.aClass21_18.method854((long) arg0);
			if (local14 == null) {
				local14 = new Class1_Sub4_Sub20(arg0);
				Static19.aClass21_18.method843(local14, (long) arg0);
			}
		}
		synchronized (local14) {
			return local14.method4034() ? local14 : null;
		}
	}
}
