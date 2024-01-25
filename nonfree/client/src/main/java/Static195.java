import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!jt", name = "db", descriptor = "Lclient!bt;")
	public static final Class29 aClass29_3 = new Class29(16);

	@OriginalMember(owner = "client!jt", name = "pb", descriptor = "Z")
	public static boolean aBoolean221 = false;

	@OriginalMember(owner = "client!jt", name = "Kb", descriptor = "I")
	public static int anInt3537 = 104;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ZIIII)V")
	public static void method3023(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static28.anInt644 <= arg2 - arg3 && arg3 + arg2 <= Static125.anInt2545 && arg0 - arg3 >= Static108.anInt2276 && arg3 + arg0 <= Static173.anInt3208) {
			Static280.method4059(arg2, arg1, arg3, arg0);
		} else {
			Static353.method5925(arg0, arg2, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)V")
	public static void method3029() {
		if (Static361.anInt5956 <= 0) {
			Static94.aString17 = "";
			return;
		}
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static206.aStringArray25.length; local15++) {
			if (Static206.aStringArray25[local15].startsWith("--> ")) {
				local13++;
				if (local13 == Static361.anInt5956) {
					Static94.aString17 = Static206.aStringArray25[local15].substring(4);
					break;
				}
			}
		}
	}
}
