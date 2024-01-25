import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
	public static int anInt2172;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "Lclient!fh;")
	public static final Class113 aClass113_3 = new Class113(1, 3);

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "Z")
	public static boolean aBoolean199 = false;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
	public static void method1580() {
		@Pc(9) Class313 local9 = Static30.aClass313_7;
		synchronized (Static30.aClass313_7) {
			Static30.aClass313_7.method6977();
		}
		local9 = Static6.aClass313_3;
		synchronized (Static6.aClass313_3) {
			Static6.aClass313_3.method6977();
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!r;JI)V")
	public static void method1581(@OriginalArg(0) Class100 arg0, @OriginalArg(1) long arg1) {
		Static220.anInt4155 = Static79.anInt1726;
		Static318.anInt5929 = 0;
		Static564.anInt9223 = 0;
		Static79.anInt1726 = 0;
		@Pc(23) long local23 = Static548.method7437();
		for (@Pc(28) Class6_Sub8 local28 = (Class6_Sub8) Static508.aClass109_8.method2314(); local28 != null; local28 = (Class6_Sub8) Static508.aClass109_8.method2312()) {
			if (local28.method7148(arg0, arg1)) {
				Static318.anInt5929++;
			}
		}
		if (Static336.aBoolean492 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static508.aClass109_8.method2316() + ", running: " + Static318.anInt5929);
			System.out.println("Emitters: " + Static564.anInt9223 + " Particles: " + Static79.anInt1726 + ". Time taken: " + (Static548.method7437() - local23) + "ms");
		}
	}
}
