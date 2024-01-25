import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static634 {

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_257 = new Class215(62, 4);

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "I")
	public static final int anInt11010 = 1406;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!ha;BJ)V")
	public static void method9194(@OriginalArg(0) Class20 arg0, @OriginalArg(2) long arg1) {
		Static370.anInt7342 = 0;
		Static616.anInt10777 = Static70.anInt2219;
		Static578.anInt8201 = 0;
		Static70.anInt2219 = 0;
		@Pc(14) long local14 = Static277.method5091();
		for (@Pc(19) Class3_Sub9 local19 = (Class3_Sub9) Static403.aClass325_5.method8016(); local19 != null; local19 = (Class3_Sub9) Static403.aClass325_5.method8022()) {
			if (local19.method8586(arg0, arg1)) {
				Static578.anInt8201++;
			}
		}
		if (Static240.aBoolean381 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static403.aClass325_5.method8018() + ", running: " + Static578.anInt8201);
			System.out.println("Emitters: " + Static370.anInt7342 + " Particles: " + Static70.anInt2219 + ". Time taken: " + (Static277.method5091() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIZ)Z")
	public static boolean method9195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static408.method6624(arg1, arg0) | Static15.method318(arg0, arg1)) & Static363.method6138(arg1, arg0);
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
	public static void method9197() {
		if (Static186.aClass20_4.method7297()) {
			Static186.aClass20_4.method7304(Static639.aCanvas10);
			Static330.method5696();
			if (Static487.aBoolean676) {
				Static42.method1608(Static639.aCanvas10);
			} else {
				@Pc(27) Dimension local27 = Static639.aCanvas10.getSize();
				Static186.aClass20_4.method7246(Static639.aCanvas10, local27.width, local27.height);
			}
			Static186.aClass20_4.method7280(Static639.aCanvas10);
		} else {
			Static316.method5509(false, Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945());
		}
		Static132.method3031();
		Static240.aBoolean380 = true;
	}
}
