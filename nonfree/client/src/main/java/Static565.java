import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!ru", name = "u", descriptor = "Lclient!dj;")
	public static Class71 aClass71_1;

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_162 = new Class186(133, 6);

	@OriginalMember(owner = "client!ru", name = "s", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[100];

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!ha;JI)V")
	public static void method7869(@OriginalArg(0) Class67 arg0, @OriginalArg(1) long arg1) {
		Static125.anInt2388 = Static49.anInt835;
		Static268.anInt4872 = 0;
		Static418.anInt7392 = 0;
		Static49.anInt835 = 0;
		@Pc(16) long local16 = Static626.method8479();
		for (@Pc(28) Class19_Sub9 local28 = (Class19_Sub9) Static296.aClass66_5.method1381(); local28 != null; local28 = (Class19_Sub9) Static296.aClass66_5.method1380()) {
			if (local28.method6777(arg0, arg1)) {
				Static418.anInt7392++;
			}
		}
		if (Static414.aBoolean573 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static296.aClass66_5.method1378() + ", running: " + Static418.anInt7392);
			System.out.println("Emitters: " + Static268.anInt4872 + " Particles: " + Static49.anInt835 + ". Time taken: " + (Static626.method8479() - local16) + "ms");
		}
	}
}
