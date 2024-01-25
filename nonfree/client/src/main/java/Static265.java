import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "Lclient!ao;")
	public static Class5_Sub4_Sub1 aClass5_Sub4_Sub1_2;

	@OriginalMember(owner = "client!jea", name = "k", descriptor = "[I")
	public static int[] anIntArray255;

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_88 = new Class156(53, 8);

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)V")
	public static void method4289() {
		Static365.aClass168_54.method3862();
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lclient!ha;ZJ)V")
	public static void method4290(@OriginalArg(0) Class100 arg0, @OriginalArg(2) long arg1) {
		Static161.anInt3205 = 0;
		Static548.anInt8694 = 0;
		Static411.anInt6962 = Static213.anInt3732;
		Static213.anInt3732 = 0;
		@Pc(16) long local16 = Static480.method6763();
		for (@Pc(28) Class4_Sub9 local28 = (Class4_Sub9) Static618.aClass387_9.method9018(); local28 != null; local28 = (Class4_Sub9) Static618.aClass387_9.method9016()) {
			if (local28.method8050(arg0, arg1)) {
				Static161.anInt3205++;
			}
		}
		if (Static443.aBoolean495 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static618.aClass387_9.method9015() + ", running: " + Static161.anInt3205);
			System.out.println("Emitters: " + Static548.anInt8694 + " Particles: " + Static213.anInt3732 + ". Time taken: " + (Static480.method6763() - local16) + "ms");
		}
	}
}
