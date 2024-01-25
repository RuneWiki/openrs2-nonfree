import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
	public static int anInt5429;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!qs;)V")
	public static void method4187(@OriginalArg(1) Class211 arg0) {
		Static64.anInt1738 = arg0.method4759("titlebg");
		Static265.anInt5129 = arg0.method4759("logo");
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
	public static void method4188(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub1_Sub11 local13 = Static248.method3707(arg0, 5);
		local13.method2957();
		local13.anInt3820 = arg1;
	}
}
