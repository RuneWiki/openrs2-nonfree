import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "Lclient!fg;")
	public static Class96 aClass96_2;

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
	public static int anInt3127 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!np;I)Lclient!iq;")
	public static Class65_Sub2 method2825(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(7) Class65 local7 = Static5.method86(arg0);
		@Pc(16) int local16 = arg0.method5186();
		@Pc(20) int local20 = arg0.method5186();
		return new Class65_Sub2(local7.aClass63_16, local7.aClass249_16, local7.anInt5457, local7.anInt5460, local7.anInt5462, local7.anInt5461, local7.anInt5463, local7.anInt5459, local7.anInt5458, local16, local20);
	}
}
