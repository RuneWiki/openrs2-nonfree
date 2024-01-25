import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
	public static int anInt8283;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BILclient!oda;II)V")
	public static void method6692(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub34 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1.aClass2_Sub7_Sub2_2.method4495(arg0);
		arg1.aClass2_Sub7_Sub2_2.method4512(arg2);
		arg1.aClass2_Sub7_Sub2_2.method4511(arg3);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BII)V")
	public static void method6693(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class2_Sub2_Sub18 local17 = Static508.method6607(arg0, 7);
		local17.method6227();
		local17.anInt7701 = arg1;
	}
}
