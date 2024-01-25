import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_223 = new Class198(50);

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "[I")
	public static final int[] anIntArray477 = new int[3];

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLclient!vq;J)V")
	public static void method5188(@OriginalArg(1) Class47 arg0, @OriginalArg(2) long arg1) {
		Static330.anInt6311 = 0;
		Static239.anInt4794 = Static73.anInt2038;
		Static73.anInt2038 = 0;
		@Pc(18) long local18 = Static208.method3879();
		for (@Pc(23) Class2_Sub4 local23 = (Class2_Sub4) Static178.aClass32_6.method850(); local23 != null; local23 = (Class2_Sub4) Static178.aClass32_6.method846()) {
			if (local23.method3936(arg0, arg1)) {
				Static330.anInt6311++;
			}
		}
		if (Static117.aBoolean201 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static178.aClass32_6.method838() + ", running: " + Static330.anInt6311 + ". Particles: " + Static73.anInt2038 + ". Time taken: " + (Static208.method3879() - local18) + "ms");
		}
	}
}
