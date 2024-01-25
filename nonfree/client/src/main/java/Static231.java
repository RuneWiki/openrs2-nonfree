import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
	public static int anInt4532;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!ve;")
	public static Class1_Sub40 aClass1_Sub40_2;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "[Lclient!lo;")
	public static final Class121[] aClass121Array1 = new Class121[14];

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!ke;I)V")
	public static void method4161(@OriginalArg(0) Class5_Sub3_Sub3_Sub1 arg0) {
		@Pc(14) Class1_Sub36 local14 = (Class1_Sub36) Static130.aClass26_18.method870((long) arg0.anInt4920);
		if (local14 == null) {
			Static222.method4056(arg0.anIntArray637[0], null, Static285.anInt5511, 0, null, arg0.anIntArray638[0], arg0);
		} else {
			local14.method4956();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!aa;JB)V")
	public static void method4162(@OriginalArg(0) Class2 arg0, @OriginalArg(1) long arg1) {
		Static19.anInt397 = 0;
		Static337.anInt6399 = Static291.anInt5656;
		Static291.anInt5656 = 0;
		@Pc(21) long local21 = Static349.method5647();
		for (@Pc(26) Class15_Sub5 local26 = (Class15_Sub5) Static293.aClass175_6.method4669(); local26 != null; local26 = (Class15_Sub5) Static293.aClass175_6.method4673()) {
			if (local26.method2862(arg0, arg1)) {
				Static19.anInt397++;
			}
		}
		if (Static274.aBoolean462 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static293.aClass175_6.method4675() + ", running: " + Static19.anInt397 + ". Particles: " + Static291.anInt5656 + ". Time taken: " + (Static349.method5647() - local21) + "ms");
		}
	}
}
