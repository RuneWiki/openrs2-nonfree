import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!md", name = "d", descriptor = "I")
	public static int anInt6333;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "[I")
	public static int[] anIntArray347 = new int[1];

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(JILclient!ha;)V")
	public static void method5466(@OriginalArg(0) long arg0, @OriginalArg(2) Class82 arg1) {
		Static306.anInt5977 = Static119.anInt2612;
		Static90.anInt8336 = 0;
		Static342.anInt6328 = 0;
		Static119.anInt2612 = 0;
		@Pc(16) long local16 = Static191.method3071();
		for (@Pc(21) Class9_Sub8 local21 = (Class9_Sub8) Static76.aClass139_2.method3198(); local21 != null; local21 = (Class9_Sub8) Static76.aClass139_2.method3205()) {
			if (local21.method5947(arg1, arg0)) {
				Static90.anInt8336++;
			}
		}
		if (Static579.aBoolean710 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static76.aClass139_2.method3199() + ", running: " + Static90.anInt8336);
			System.out.println("Emitters: " + Static342.anInt6328 + " Particles: " + Static119.anInt2612 + ". Time taken: " + (Static191.method3071() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!uu;I)V")
	public static void method5468(@OriginalArg(0) Class343 arg0) {
		Static440.aClass343_208 = arg0;
	}
}
