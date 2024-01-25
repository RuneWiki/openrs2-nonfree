import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!vea", name = "o", descriptor = "Lclient!tq;")
	public static Class318 aClass318_4;

	@OriginalMember(owner = "client!vea", name = "p", descriptor = "I")
	public static int anInt9070;

	@OriginalMember(owner = "client!vea", name = "m", descriptor = "Lclient!vea;")
	public static final Class340 aClass340_18 = new Class340(4);

	@OriginalMember(owner = "client!vea", name = "i", descriptor = "Lclient!vea;")
	public static final Class340 aClass340_14 = new Class340(1);

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "Lclient!vea;")
	public static final Class340 aClass340_11 = new Class340(1);

	@OriginalMember(owner = "client!vea", name = "f", descriptor = "Lclient!vea;")
	public static final Class340 aClass340_12 = new Class340(2);

	@OriginalMember(owner = "client!vea", name = "g", descriptor = "Lclient!vea;")
	public static final Class340 aClass340_13 = new Class340(4);

	@OriginalMember(owner = "client!vea", name = "j", descriptor = "Lclient!vea;")
	public static final Class340 aClass340_15 = new Class340(2);

	@OriginalMember(owner = "client!vea", name = "k", descriptor = "Lclient!vea;")
	public static final Class340 aClass340_16 = new Class340(4);

	@OriginalMember(owner = "client!vea", name = "l", descriptor = "Lclient!vea;")
	public static final Class340 aClass340_17 = new Class340(2);

	@OriginalMember(owner = "client!vea", name = "n", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_218 = new Class81(16, 8);

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(FFFI)F")
	public static float method7509(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg1 * (arg0 - arg2) + arg2;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(ZI)Z")
	public static boolean method7511(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(III)V")
	public static void method7512(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static374.method5445(6, arg1);
		local8.method491();
		local8.anInt548 = arg0;
	}
}
