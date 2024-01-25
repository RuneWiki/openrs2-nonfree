import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_147 = new Class90(28, 17);

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
	public static int anInt10405 = 0;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZLclient!ek;)Lclient!a;")
	public static Class1 method8119(@OriginalArg(1) Class4_Sub13 arg0) {
		@Pc(14) int local14 = arg0.method7054();
		@Pc(21) Class347 local21 = Static302.method4802()[arg0.method7004()];
		@Pc(28) Class214 local28 = Static106.method1999()[arg0.method7004()];
		@Pc(32) int local32 = arg0.method7043();
		@Pc(36) int local36 = arg0.method7043();
		return new Class1(local14, local21, local28, local32, local36);
	}
}
