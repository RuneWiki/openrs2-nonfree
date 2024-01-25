import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ak", name = "Q", descriptor = "[I")
	public static int[] anIntArray23;

	@OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
	public static int anInt235 = -50;

	@OriginalMember(owner = "client!ak", name = "z", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_10 = new Class160(19, 7);

	@OriginalMember(owner = "client!ak", name = "A", descriptor = "[I")
	public static final int[] anIntArray21 = new int[1000];

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!oa;ZJ)V")
	public static void method200(@OriginalArg(0) Class121 arg0, @OriginalArg(2) long arg1) {
		Static428.anInt7537 = 0;
		Static130.anInt2246 = Static537.anInt9109;
		Static537.anInt9109 = 0;
		@Pc(19) long local19 = Static137.method2058();
		for (@Pc(24) Class102_Sub6 local24 = (Class102_Sub6) Static430.aClass249_5.method5817(); local24 != null; local24 = (Class102_Sub6) Static430.aClass249_5.method5815()) {
			if (local24.method6845(arg0, arg1)) {
				Static428.anInt7537++;
			}
		}
		if (Static129.aBoolean145 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static430.aClass249_5.method5814() + ", running: " + Static428.anInt7537 + ". Particles: " + Static537.anInt9109 + ". Time taken: " + (Static137.method2058() - local19) + "ms");
		}
	}
}
