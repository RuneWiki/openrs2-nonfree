import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!jh", name = "o", descriptor = "Ljava/lang/Object;")
	public static Object anObject10;

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
	public static int anInt5429;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_43 = new Class305(86, 3);

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "[I")
	public static final int[] anIntArray297 = new int[32];

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
	public static void method4547() {
		@Pc(5) Class156[] local5 = Class358.aClass156Array1;
		synchronized (Class358.aClass156Array1) {
			for (@Pc(14) int local14 = 0; local14 < Class358.aClass156Array1.length; local14++) {
				Class358.aClass156Array1[local14] = new Class156();
				Static43.anIntArray34[local14] = 0;
			}
		}
	}
}
