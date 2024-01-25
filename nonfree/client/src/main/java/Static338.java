import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	public static int anInt6970;

	@OriginalMember(owner = "client!na", name = "j", descriptor = "Lclient!oa;")
	public static Class15 aClass15_11;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "Lclient!hfa;")
	public static final Class139 aClass139_1 = new Class139();

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(JI)V")
	public static void method5799(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLclient!fd;)Lclient!uea;")
	public static Class284_Sub1 method5800(@OriginalArg(1) Class3_Sub7 arg0) {
		@Pc(7) Class284 local7 = Static250.method4495(arg0);
		@Pc(16) int local16 = arg0.method6507();
		return new Class284_Sub1(local7.anInt9597, local7.aClass100_12, local7.aClass237_12, local7.anInt9596, local7.anInt9598, local16);
	}
}
