import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!cka", name = "m", descriptor = "I")
	public static int anInt1902 = 0;

	@OriginalMember(owner = "client!cka", name = "n", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_29 = new Class397(107, 8);

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static414.method5529(arg1, arg0) & Static284.method4012(arg0, arg1);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!sca;I)I")
	public static int method1790(@OriginalArg(0) Class335 arg0) {
		if (Static661.aClass335_16 == arg0) {
			return 6407;
		} else if (Static646.aClass335_14 == arg0) {
			return 6408;
		} else if (arg0 == Static702.aClass335_19) {
			return 6406;
		} else if (arg0 == Static514.aClass335_15) {
			return 6409;
		} else if (Static109.aClass335_4 == arg0) {
			return 6410;
		} else if (Static684.aClass335_17 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!ha;IJ)V")
	public static void method1792(@OriginalArg(0) Class22 arg0, @OriginalArg(2) long arg1) {
		Static389.anInt6051 = Static397.anInt6167;
		Static668.anInt10258 = 0;
		Static37.anInt1200 = 0;
		Static397.anInt6167 = 0;
		@Pc(16) long local16 = Static517.method6965();
		for (@Pc(23) Class9_Sub5 local23 = (Class9_Sub5) Static228.aClass319_15.method7195(); local23 != null; local23 = (Class9_Sub5) Static228.aClass319_15.method7188()) {
			if (local23.method5578(arg0, arg1)) {
				Static668.anInt10258++;
			}
		}
		if (Static349.aBoolean361 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static228.aClass319_15.method7191() + ", running: " + Static668.anInt10258);
			System.out.println("Emitters: " + Static37.anInt1200 + " Particles: " + Static397.anInt6167 + ". Time taken: " + (Static517.method6965() - local16) + "ms");
		}
	}
}
