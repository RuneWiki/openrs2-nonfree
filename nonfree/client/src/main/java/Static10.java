import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_5 = new Class186(109, 10);

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZBI)V")
	public static void method139(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class3_Sub4_Sub2 local17 = Static502.method7211(21, (long) arg1);
		local17.method630();
		local17.anInt803 = arg0 ? 1 : 0;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)Z")
	public static boolean method141(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
