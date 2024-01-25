import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
	public static int anInt6936;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "Lclient!bi;")
	public static Class31 aClass31_86;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
	public static int anInt6943 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IJLclient!oa;)V")
	public static void method5793(@OriginalArg(1) long arg0, @OriginalArg(2) Class66 arg1) {
		Static6.anInt96 = 0;
		Static29.anInt566 = 0;
		Static496.anInt8593 = Static259.anInt5063;
		Static259.anInt5063 = 0;
		@Pc(24) long local24 = Static184.method3422();
		for (@Pc(29) Class26_Sub3 local29 = (Class26_Sub3) Static471.aClass8_7.method110(); local29 != null; local29 = (Class26_Sub3) Static471.aClass8_7.method113()) {
			if (local29.method3664(arg1, arg0)) {
				Static29.anInt566++;
			}
		}
		if (Static442.aBoolean534 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static471.aClass8_7.method105() + ", running: " + Static29.anInt566);
			System.out.println("Emitters: " + Static6.anInt96 + " Particles: " + Static259.anInt5063 + ". Time taken: " + (Static184.method3422() - local24) + "ms");
		}
	}
}
