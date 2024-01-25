import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static292 {

	@OriginalMember(owner = "client!kl", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString69;

	@OriginalMember(owner = "client!kl", name = "A", descriptor = "Lclient!vd;")
	public static Class353 aClass353_51;

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
	public static int anInt5761 = 0;

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "Lclient!jt;")
	public static final Class166 aClass166_29 = new Class166(50);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLclient!fo;)Z")
	public static boolean method5057(@OriginalArg(1) Class105 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean246) {
			return false;
		} else if (!arg0.method3042(Static487.anInterface25_2)) {
			return false;
		} else if (Static553.aClass128_45.method3560((long) arg0.anInt3412) == null) {
			return Static15.aClass128_18.method3560((long) arg0.anInt3392) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZB)V")
	public static void method5058(@OriginalArg(0) boolean arg0) {
		if (Static645.aClass121_1 == null) {
			Static559.method8060();
		}
		if (arg0) {
			Static645.aClass121_1.method3457();
		}
	}
}
