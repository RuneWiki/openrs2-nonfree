import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_113 = new Class200(86, 3);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "()V")
	public static void method4617() {
		Static171.method2964(Static395.anInt6810);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLclient!ha;J)V")
	public static void method4618(@OriginalArg(1) Class13 arg0, @OriginalArg(2) long arg1) {
		Static357.anInt6184 = 0;
		Static452.anInt7372 = Static439.anInt7221;
		Static267.anInt5012 = 0;
		Static439.anInt7221 = 0;
		@Pc(21) long local21 = Static48.method1203();
		for (@Pc(26) Class16_Sub7 local26 = (Class16_Sub7) Static518.aClass19_9.method562(); local26 != null; local26 = (Class16_Sub7) Static518.aClass19_9.method558()) {
			if (local26.method5979(arg0, arg1)) {
				Static267.anInt5012++;
			}
		}
		if (Static405.aBoolean493 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static518.aClass19_9.method561() + ", running: " + Static267.anInt5012);
			System.out.println("Emitters: " + Static357.anInt6184 + " Particles: " + Static439.anInt7221 + ". Time taken: " + (Static48.method1203() - local21) + "ms");
		}
	}
}
