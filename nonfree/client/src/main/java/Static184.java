import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "Lclient!hv;")
	public static Class151 aClass151_1;

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
	public static int anInt3521;

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_68 = new Class44(31, 5);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([J[Ljava/lang/Object;I)V")
	public static void method2920(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Static594.method8430(arg1, 0, arg0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ha;IJ)V")
	public static void method2922(@OriginalArg(0) Class137 arg0, @OriginalArg(2) long arg1) {
		Static391.anInt7193 = 0;
		Static486.anInt8727 = 0;
		Static599.anInt6158 = Static132.anInt2539;
		Static132.anInt2539 = 0;
		@Pc(16) long local16 = Static521.method7499();
		for (@Pc(21) Class12_Sub4 local21 = (Class12_Sub4) Static319.aClass376_5.method9008(); local21 != null; local21 = (Class12_Sub4) Static319.aClass376_5.method9014()) {
			if (local21.method1611(arg0, arg1)) {
				Static486.anInt8727++;
			}
		}
		if (Static659.aBoolean752 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static319.aClass376_5.method9012() + ", running: " + Static486.anInt8727);
			System.out.println("Emitters: " + Static391.anInt7193 + " Particles: " + Static132.anInt2539 + ". Time taken: " + (Static521.method7499() - local16) + "ms");
		}
	}
}
