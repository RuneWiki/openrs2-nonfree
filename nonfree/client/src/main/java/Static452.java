import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!pia", name = "o", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_269 = new Class179(76, 2);

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ILclient!sda;)Z")
	public static boolean method6552(@OriginalArg(1) Class318 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean616) {
			return false;
		} else if (!arg0.method7386(Static528.anInterface19_2)) {
			return false;
		} else if (Static94.aClass209_9.method5038((long) arg0.anInt8708) == null) {
			return Static187.aClass209_13.method5038((long) arg0.anInt8700) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pia", name = "d", descriptor = "(I)V")
	public static void method6555() {
		Static560.anInt1380 = 1;
		Static595.anInt9707 = -1;
		if (Static259.aString53 == null) {
			Static82.method1399(35);
		} else {
			@Pc(26) Class6_Sub23 local26 = new Class6_Sub23(Static96.method1571(Static379.method5360(Static259.aString53)));
			@Pc(30) long local30 = local26.method8381();
			Static62.aLong38 = local26.method8381();
			Static539.method7683(Static74.method1301(local30), true, "");
		}
	}
}
