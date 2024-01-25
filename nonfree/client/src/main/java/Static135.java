import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "Lclient!kea;")
	public static Class161 aClass161_28;

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
	public static int anInt2758;

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
	public static final int[] anIntArray272 = new int[500];

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "Lclient!fj;")
	public static final Class91 aClass91_2 = new Class91("", 10);

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
	public static final int anInt2757 = 1337;

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "[I")
	public static final int[] anIntArray273 = new int[4096];

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	public static void method2314() {
		@Pc(7) Class323 local7 = null;
		try {
			@Pc(13) Class212 local13 = Static401.aClass285_11.method7034(true, "2");
			while (local13.anInt6547 == 0) {
				Static327.method5231(1L);
			}
			if (local13.anInt6547 == 1) {
				local7 = (Class323) local13.anObject13;
				@Pc(42) Class3_Sub27 local42 = new Class3_Sub27(Static176.anInt4108 * 6 + 3);
				local42.method7576(1);
				local42.method7600(Static176.anInt4108, 30364);
				for (@Pc(52) int local52 = 0; local52 < Static416.anIntArray153.length; local52++) {
					if (Static4.aBooleanArray44[local52]) {
						local42.method7600(local52, 30364);
						local42.method7594(Static416.anIntArray153[local52]);
					}
				}
				local7.method7795(local42.anInt9191, local42.aByteArray114, 0);
			}
		} catch (@Pc(95) Exception local95) {
		}
		try {
			if (local7 != null) {
				local7.method7794();
			}
		} catch (@Pc(102) Exception local102) {
		}
		Static491.aLong282 = Static12.method647();
		Static421.aBoolean556 = false;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
	public static void method2316() {
		if (Static316.method5110(Static512.anInt8932) || Static173.method3293(Static512.anInt8932)) {
			Static46.method1004(5000, Static311.anInt6050 >> 12, Static329.anInt6297 >> 12);
		} else {
			@Pc(38) int local38 = Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray733[0] >> 3;
			@Pc(45) int local45 = Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray734[0] >> 3;
			if (local38 >= 0 && local38 < Static118.anInt2527 >> 3 && local45 >= 0 && local45 < Static549.anInt9482 >> 3) {
				Static46.method1004(5000, local38, local45);
			} else {
				Static46.method1004(0, Static118.anInt2527 >> 4, Static549.anInt9482 >> 4);
			}
		}
		Static24.method779();
		Static192.method3683();
		Static101.method1975();
		Static347.method5527();
	}
}
