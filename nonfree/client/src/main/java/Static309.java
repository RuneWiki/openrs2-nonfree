import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "Lclient!mv;")
	public static Class229 aClass229_74;

	@OriginalMember(owner = "client!ln", name = "I", descriptor = "[I")
	public static int[] anIntArray355;

	@OriginalMember(owner = "client!ln", name = "C", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_86 = new Class349(22, 4);

	@OriginalMember(owner = "client!ln", name = "D", descriptor = "J")
	public static long aLong139 = 0L;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!r;JB)V")
	public static void method4430(@OriginalArg(0) Class162 arg0, @OriginalArg(1) long arg1) {
		Static230.anInt3347 = 0;
		Static111.anInt1964 = Static94.anInt1652;
		Static420.anInt7088 = 0;
		Static94.anInt1652 = 0;
		@Pc(21) long local21 = Static362.method5133();
		for (@Pc(26) Class12_Sub4 local26 = (Class12_Sub4) Static56.aClass220_1.method4661(); local26 != null; local26 = (Class12_Sub4) Static56.aClass220_1.method4660()) {
			if (local26.method4137(arg0, arg1)) {
				Static230.anInt3347++;
			}
		}
		if (Static468.aBoolean623 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static56.aClass220_1.method4658() + ", running: " + Static230.anInt3347);
			System.out.println("Emitters: " + Static420.anInt7088 + " Particles: " + Static94.anInt1652 + ". Time taken: " + (Static362.method5133() - local21) + "ms");
		}
	}
}
