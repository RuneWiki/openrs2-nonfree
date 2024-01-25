import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "Lclient!rr;")
	public static Class292 aClass292_3 = null;

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Lclient!ra;")
	public static final Class280 aClass280_4 = new Class280();

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "[I")
	public static int[] anIntArray263 = new int[2];

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "[I")
	public static final int[] anIntArray264 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "Lclient!uc;")
	public static final Class328 aClass328_10 = new Class328(9, 2);

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "Lclient!rr;")
	public static Class292 aClass292_4 = null;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
	public static void method3659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class6_Sub2_Sub7 local13 = Static401.method5861(arg0, 7);
		local13.method2582();
		local13.anInt2944 = arg1;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public static void method3660() {
		if (Static509.aClass236_6 != null) {
			Static509.aClass236_6.method5511();
		}
		while (true) {
			try {
				Static111.aThread3.join();
				return;
			} catch (@Pc(16) InterruptedException local16) {
			}
		}
	}
}
