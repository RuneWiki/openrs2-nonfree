import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "Lclient!ta;")
	public static Class92 aClass92_13;

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "[I")
	public static int[] anIntArray494;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILclient!oa;J)V")
	public static void method5628(@OriginalArg(1) Class14 arg0, @OriginalArg(2) long arg1) {
		Static438.anInt7573 = 0;
		Static538.anInt8919 = Static12.anInt335;
		Static489.anInt8241 = 0;
		Static12.anInt335 = 0;
		@Pc(16) long local16 = Static8.method201();
		for (@Pc(21) Class98_Sub3 local21 = (Class98_Sub3) Static439.aClass40_6.method1132(); local21 != null; local21 = (Class98_Sub3) Static439.aClass40_6.method1129()) {
			if (local21.method4533(arg0, arg1)) {
				Static489.anInt8241++;
			}
		}
		if (Static14.aBoolean28 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static439.aClass40_6.method1135() + ", running: " + Static489.anInt8241);
			System.out.println("Emitters: " + Static438.anInt7573 + " Particles: " + Static12.anInt335 + ". Time taken: " + (Static8.method201() - local16) + "ms");
		}
	}
}
