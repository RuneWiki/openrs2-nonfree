import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!sfa", name = "Y", descriptor = "Lclient!mv;")
	public static Class241 aClass241_108 = new Class241(74, 8);

	@OriginalMember(owner = "client!sfa", name = "ob", descriptor = "I")
	public static int anInt8968 = 0;

	@OriginalMember(owner = "client!sfa", name = "e", descriptor = "(B)V")
	public static void method7846() {
		Static665.aClass88_1 = new Class88(8);
		Static75.anInt1039 = 0;
		for (@Pc(17) Class60_Sub4 local17 = (Class60_Sub4) Static374.aClass385_6.method8778(); local17 != null; local17 = (Class60_Sub4) Static374.aClass385_6.method8773()) {
			local17.method4557();
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(III)Lclient!gb;")
	public static Class60_Sub1_Sub3 method7848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class243 local7 = Static334.aClass243ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass60_Sub1_Sub3_2;
	}
}
