import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	public static int anInt8061 = 0;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "I")
	public static int anInt8063 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZLclient!ac;)Lclient!efa;")
	public static Class23_Sub1_Sub1 method6477(@OriginalArg(1) Class1_Sub3 arg0) {
		@Pc(7) Class23_Sub1 local7 = Static295.method4395(arg0);
		@Pc(11) int local11 = arg0.method7975();
		return new Class23_Sub1_Sub1(local7.aClass259_12, local7.aClass216_12, local7.anInt8315, local7.anInt8308, local7.anInt8314, local7.anInt8309, local7.anInt8312, local7.anInt8311, local7.anInt8310, local7.anInt1979, local7.anInt1977, local7.anInt1978, local7.anInt1974, local7.anInt1981, local7.anInt1975, local11);
	}
}
