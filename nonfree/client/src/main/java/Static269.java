import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "I")
	public static int anInt4798 = -1;

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(Lclient!wq;I)Lclient!eda;")
	public static Class91_Sub1 method4359(@OriginalArg(0) Class5_Sub36 arg0) {
		@Pc(14) Class91 local14 = Static2.method25(arg0);
		@Pc(18) int local18 = arg0.method7269();
		return new Class91_Sub1(local14.anInt1881, local14.aClass189_4, local14.aClass346_3, local14.anInt1884, local14.anInt1883, local18);
	}
}
