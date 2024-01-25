import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!og", name = "T", descriptor = "I")
	public static int anInt4996;

	@OriginalMember(owner = "client!og", name = "L", descriptor = "[I")
	public static final int[] anIntArray392 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!og", name = "M", descriptor = "Z")
	public static boolean aBoolean433 = false;

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
	public static void method4256() {
		@Pc(10) Class107 local10 = Static258.aClass107_36;
		synchronized (Static258.aClass107_36) {
			Static258.aClass107_36.method3015();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZLclient!iq;)V")
	public static void method4257(@OriginalArg(1) Class104 arg0) {
		Static156.aClass104_95 = arg0;
		Static198.anInt4639 = Static156.aClass104_95.method2745(15);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(JBLclient!dr;)V")
	public static void method4259(@OriginalArg(0) long arg0, @OriginalArg(2) Class37 arg1) {
		Static341.anInt465 = Static212.anInt4627;
		Static331.anInt6405 = 0;
		Static212.anInt4627 = 0;
		@Pc(14) long local14 = Static22.method285();
		for (@Pc(23) Class57_Sub6 local23 = (Class57_Sub6) Static67.aClass193_5.method5224(); local23 != null; local23 = (Class57_Sub6) Static67.aClass193_5.method5223()) {
			if (local23.method3855(arg1, arg0)) {
				Static331.anInt6405++;
			}
		}
		if (Static232.aBoolean436 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static67.aClass193_5.method5219() + ", running: " + Static331.anInt6405 + ". Particles: " + Static212.anInt4627 + ". Time taken: " + (Static22.method285() - local14) + "ms");
		}
	}
}
