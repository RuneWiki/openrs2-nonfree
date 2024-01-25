import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!eia", name = "l", descriptor = "I")
	public static int anInt3150;

	@OriginalMember(owner = "client!eia", name = "m", descriptor = "I")
	public static int anInt3151 = 0;

	@OriginalMember(owner = "client!eia", name = "o", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_34 = new Class218(27, -2);

	@OriginalMember(owner = "client!eia", name = "p", descriptor = "[Lclient!jfa;")
	public static final Interface13[] anInterface13Array1 = new Interface13[128];

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(JZ)V")
	public static void method2877(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}
}
