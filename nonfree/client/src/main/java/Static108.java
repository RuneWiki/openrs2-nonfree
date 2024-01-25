import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!so;I)Lclient!eia;")
	public static Class92_Sub1 method1901(@OriginalArg(0) Class14_Sub29 arg0) {
		@Pc(7) Class92 local7 = Static64.method1268(arg0);
		@Pc(11) int local11 = arg0.method5900();
		@Pc(22) int local22 = arg0.method5900();
		@Pc(26) int local26 = arg0.method5900();
		@Pc(30) int local30 = arg0.method5900();
		@Pc(34) int local34 = arg0.method5900();
		@Pc(38) int local38 = arg0.method5900();
		return new Class92_Sub1(local7.aClass168_13, local7.aClass339_13, local7.anInt10908, local7.anInt10902, local7.anInt10903, local7.anInt10907, local7.anInt10904, local7.anInt10910, local7.anInt10905, local11, local22, local26, local30, local34, local38);
	}
}
