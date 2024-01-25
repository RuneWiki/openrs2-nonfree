import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
	public static int anInt6724 = 0;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLclient!ac;)Lclient!qfa;")
	public static Class23_Sub2 method5450(@OriginalArg(1) Class1_Sub3 arg0) {
		@Pc(7) Class23 local7 = Static551.method7500(arg0);
		@Pc(11) int local11 = arg0.method7940();
		@Pc(15) int local15 = arg0.method7940();
		return new Class23_Sub2(local7.aClass259_12, local7.aClass216_12, local7.anInt8315, local7.anInt8308, local7.anInt8314, local7.anInt8309, local7.anInt8312, local7.anInt8311, local7.anInt8310, local11, local15);
	}
}
