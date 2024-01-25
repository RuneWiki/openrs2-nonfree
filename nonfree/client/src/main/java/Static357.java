import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "F")
	public static float aFloat178;

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
	public static int anInt6522 = 0;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!ac;I)Lclient!ss;")
	public static Class23_Sub3 method5295(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(14) Class23 local14 = Static551.method7500(arg0);
		@Pc(18) int local18 = arg0.method7940();
		@Pc(22) int local22 = arg0.method7940();
		@Pc(28) int local28 = arg0.method7945();
		return new Class23_Sub3(local14.aClass259_12, local14.aClass216_12, local14.anInt8315, local14.anInt8308, local14.anInt8314, local14.anInt8309, local14.anInt8312, local14.anInt8311, local14.anInt8310, local18, local22, local28);
	}
}
