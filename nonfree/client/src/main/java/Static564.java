import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!tea", name = "i", descriptor = "Lclient!re;")
	public static Class301 aClass301_1 = new Class301();

	@OriginalMember(owner = "client!tea", name = "o", descriptor = "I")
	public static int anInt9384 = 1;

	@OriginalMember(owner = "client!tea", name = "q", descriptor = "I")
	public static int anInt9386 = 0;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(BLclient!ha;J)V")
	public static void method7908(@OriginalArg(1) Class132 arg0, @OriginalArg(2) long arg1) {
		Static264.anInt4577 = 0;
		Static568.anInt9425 = 0;
		Static88.anInt1693 = Static594.anInt9687;
		Static594.anInt9687 = 0;
		@Pc(16) long local16 = Static566.method7936();
		for (@Pc(21) Class2_Sub8 local21 = (Class2_Sub8) Static100.aClass43_4.method1087(); local21 != null; local21 = (Class2_Sub8) Static100.aClass43_4.method1088()) {
			if (local21.method4167(arg0, arg1)) {
				Static264.anInt4577++;
			}
		}
		if (Static230.aBoolean236 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static100.aClass43_4.method1083() + ", running: " + Static264.anInt4577);
			System.out.println("Emitters: " + Static568.anInt9425 + " Particles: " + Static594.anInt9687 + ". Time taken: " + (Static566.method7936() - local16) + "ms");
		}
	}
}
