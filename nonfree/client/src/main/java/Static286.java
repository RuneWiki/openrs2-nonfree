import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
	public static int anInt5360;

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "[Lclient!f;")
	public static Class73[] aClass73Array7;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_87 = new Class287(29, 4);

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
	public static int anInt5361 = 0;

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
	public static int anInt5362 = -1;

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "Lclient!ws;")
	public static final Class364 aClass364_15 = new Class364(7, 7);

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)I")
	public static int method4306() {
		if (Static289.aBoolean370) {
			return 6;
		} else if (Static330.aClass3_Sub13_2 == null) {
			return 0;
		} else {
			@Pc(20) int local20 = Static330.aClass3_Sub13_2.anInt2364;
			if (Static454.method6260(local20)) {
				return 1;
			} else if (Static549.method7512(local20)) {
				return 2;
			} else if (Static343.method5003(local20)) {
				return 3;
			} else if (Static55.method6551(local20)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)Z")
	public static boolean method4308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
