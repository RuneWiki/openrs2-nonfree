import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
	public static int anInt3038;

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_52 = new Class349(61, 3);

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "[I")
	public static final int[] anIntArray227 = new int[32];

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZI)Z")
	public static boolean method2653(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(JLclient!ha;B)V")
	public static void method2654(@OriginalArg(0) long arg0, @OriginalArg(1) Class145 arg1) {
		Static384.anInt6089 = 0;
		Static352.anInt5419 = Static43.anInt584;
		Static286.anInt4422 = 0;
		Static43.anInt584 = 0;
		@Pc(21) long local21 = Static567.method7863();
		for (@Pc(26) Class4_Sub7 local26 = (Class4_Sub7) Static624.aClass320_8.method7605(); local26 != null; local26 = (Class4_Sub7) Static624.aClass320_8.method7608()) {
			if (local26.method3641(arg1, arg0)) {
				Static384.anInt6089++;
			}
		}
		if (Static306.aBoolean404 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static624.aClass320_8.method7607() + ", running: " + Static384.anInt6089);
			System.out.println("Emitters: " + Static286.anInt4422 + " Particles: " + Static43.anInt584 + ". Time taken: " + (Static567.method7863() - local21) + "ms");
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIII)V")
	public static void method2655(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 >= Static8.anInt99 && arg0 <= Static14.anInt206 && arg3 >= Static617.anInt9501 && arg2 <= Static519.anInt8267) {
			Static190.method2721(arg3, arg1, arg2, arg4, arg0);
		} else {
			Static148.method2148(arg2, arg3, arg1, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
	public static void method2657() {
		Static710.aClass218_45.method5097();
	}
}
