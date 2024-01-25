import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
	public static int anInt7272;

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "Lclient!ok;")
	public static Class178 aClass178_136;

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
	public static int anInt7276;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
	public static int anInt7270 = 0;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "[I")
	public static final int[] anIntArray611 = new int[1];

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!ya;JI)V")
	public static void method5595(@OriginalArg(0) Class51 arg0, @OriginalArg(1) long arg1) {
		Static429.anInt7167 = Static226.anInt3950;
		Static321.anInt5281 = 0;
		Static226.anInt3950 = 0;
		@Pc(14) long local14 = Static158.method2342();
		for (@Pc(19) Class28_Sub3 local19 = (Class28_Sub3) Static14.aClass169_1.method3598(); local19 != null; local19 = (Class28_Sub3) Static14.aClass169_1.method3597()) {
			if (local19.method3163(arg0, arg1)) {
				Static321.anInt5281++;
			}
		}
		if (Static166.aBoolean178 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static14.aClass169_1.method3591() + ", running: " + Static321.anInt5281 + ". Particles: " + Static226.anInt3950 + ". Time taken: " + (Static158.method2342() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)I")
	public static int method5602(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}
