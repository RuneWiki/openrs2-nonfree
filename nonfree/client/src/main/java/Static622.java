import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static622 {

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "Lclient!wm;")
	public static Class390 aClass390_120;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!mc;Z)Lclient!rj;")
	public static Class9_Sub4 method8433(@OriginalArg(0) Class5_Sub41 arg0) {
		return new Class9_Sub4(arg0.method7849(), arg0.method7849(), arg0.method7849(), arg0.method7849(), arg0.method7807(), arg0.method7816());
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!lq;ZZ)V")
	public static void method8434(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean912 = arg1;
		if (Static23.aBoolean21) {
			Static198.aClass289Array2[Static198.aClass289Array2.length - 1].method6862(arg0);
		} else {
			Static56.method745(arg0, Static281.aClass5_Sub18Array5);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(JZ)V")
	public static void method8435(@OriginalArg(0) long arg0) {
		Static158.aCalendar1.setTime(new Date(arg0));
	}
}
