import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "[Lclient!fo;")
	public static Class30_Sub2_Sub1_Sub1[] aClass30_Sub2_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
	public static int anInt8550;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "Lclient!id;")
	public static final Class142 aClass142_19 = new Class142("", 12);

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BII)Z")
	public static boolean method6899(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(23) Class283 local23 = Static453.aClass88_3.method2294(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local23.method6608(arg1);
	}
}
