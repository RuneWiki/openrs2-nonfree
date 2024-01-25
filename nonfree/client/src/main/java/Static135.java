import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!hj", name = "X", descriptor = "Lclient!pc;")
	public static Class176 aClass176_5;

	@OriginalMember(owner = "client!hj", name = "Y", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_76 = new Class77(36, -2);

	@OriginalMember(owner = "client!hj", name = "Z", descriptor = "I")
	public static int anInt2531 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZI)V")
	public static void method2370(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static304.aClass82_4 = Static189.method4473(Static170.aCanvas4, arg1, Static92.aClass53_2, Static34.anInt734 * 2, Static356.anInterface1_7);
		} else {
			if (arg0) {
				Static304.aClass82_4 = Static189.method4473(Static170.aCanvas4, 0, Static92.aClass53_2, 0, Static356.anInterface1_7);
				Static304.aClass82_4.method4481(0);
				@Pc(27) Class216 local27 = Static362.method5519(Static382.aClass71_89, Static263.anInt4664);
				@Pc(36) Class13 local36 = Static304.aClass82_4.method4472(local27, Static404.method5314(Static119.aClass71_25, Static263.anInt4664));
				Static104.method1846(local36, Static303.aClass221_182.method5229(Static189.anInt5185), true);
				Static304.aClass82_4.method4461();
				Static353.method5355();
				Static304.aClass82_4.method4553();
			}
			try {
				Static304.aClass82_4 = Static189.method4473(Static170.aCanvas4, arg1, Static92.aClass53_2, Static34.anInt734 * 2, Static356.anInterface1_7);
			} catch (@Pc(63) Throwable local63) {
				Static304.aClass82_4 = Static189.method4473(Static170.aCanvas4, 0, Static92.aClass53_2, 0, Static356.anInterface1_7);
				arg1 = 0;
			}
		}
		if (Static304.aClass82_4.method4469()) {
			@Pc(92) Class2_Sub34 local92 = Static304.aClass82_4.method4500();
			Static304.aClass82_4.method4467(local92);
		}
		Static123.anInt2363 = arg1;
		Static340.method5224();
		if (!Static304.aClass82_4.method4488()) {
			Static126.anInt2390 = 1;
		}
		Static304.aClass82_4.method4496(Static126.anInt2390);
		Static304.aClass82_4.method4464(0);
		Static280.aClass54_2 = Static304.aClass82_4.method4493();
		Static246.aClass54_1 = Static304.aClass82_4.method4493();
		@Pc(122) int local122 = (int) ((double) Static392.anInt6751 * 34.46D);
		if (Static304.aClass82_4.method4498()) {
			local122 += 128;
		}
		Static304.aClass82_4.method4524(50, local122);
		Static304.aClass82_4.method4459(!Static264.aBoolean341);
		if (Static304.aClass82_4.method4484()) {
			Static171.method2806(Static168.aBoolean222);
		}
		Static159.method2668(Static304.aClass82_4, Static392.anInt6751 >> 3, Static307.anInt5484 >> 3);
		Static150.method2531();
		Static218.aBoolean305 = false;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)V")
	public static void method2373(@OriginalArg(0) int arg0) {
		Static238.anInt4357 = arg0;
		Static118.aClass154_11.method3748();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!fc;Lclient!fc;)V")
	public static void method2375(@OriginalArg(1) Class71 arg0, @OriginalArg(2) Class71 arg1) {
		Static340.aClass71_82 = arg0;
		Static15.aClass71_3 = arg1;
	}
}
