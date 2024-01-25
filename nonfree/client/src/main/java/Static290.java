import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
	public static int anInt5036;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
	public static int anInt5035 = 2;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "Z")
	public static boolean aBoolean399 = false;

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
	public static int anInt5039 = 0;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_69 = new Class244(2, 7);

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
	public static int anInt5040 = 0;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZIB)V")
	public static void method4521(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			Static347.aClass155_9 = Static240.method4934(arg1, Static173.aCanvas2, Static61.aClass156_1, Static12.anInterface10_1, Static164.aClass154_Sub1_1.anInt6058 * 2);
		} else {
			if (arg0) {
				Static347.aClass155_9 = Static240.method4934(0, Static173.aCanvas2, Static61.aClass156_1, Static12.anInterface10_1, 0);
				Static347.aClass155_9.method4921(0);
				@Pc(23) Class190 local23 = Static93.method1548(Static368.aClass20_95, Static98.anInt1954);
				@Pc(32) Class150 local32 = Static347.aClass155_9.method4888(local23, Static402.method2809(Static77.aClass20_19, Static98.anInt1954));
				Static289.method4519(local32, Static28.aClass57_13.method1122(Static66.anInt1307), true);
				Static347.aClass155_9.method4894();
				Static122.method1947();
				Static347.aClass155_9.method4929();
			}
			try {
				Static347.aClass155_9 = Static240.method4934(arg1, Static173.aCanvas2, Static61.aClass156_1, Static12.anInterface10_1, Static164.aClass154_Sub1_1.anInt6058 * 2);
			} catch (@Pc(64) Throwable local64) {
				arg1 = 0;
				Static347.aClass155_9 = Static240.method4934(0, Static173.aCanvas2, Static61.aClass156_1, Static12.anInterface10_1, 0);
			}
		}
		if (Static347.aClass155_9.method4891()) {
			@Pc(100) Class3_Sub15 local100 = Static347.aClass155_9.method4931();
			Static347.aClass155_9.method4873(local100);
		}
		Static2.anInt68 = arg1;
		Static191.method3042();
		if (!Static347.aClass155_9.method4949()) {
			Static307.anInt5415 = 1;
		}
		Static347.aClass155_9.method4865(Static307.anInt5415);
		Static347.aClass155_9.method4852(0);
		Static19.aClass118_1 = Static347.aClass155_9.method4950();
		Static259.aClass118_4 = Static347.aClass155_9.method4950();
		@Pc(134) int local134 = (int) ((double) Static12.anInt161 * 34.46D);
		if (Static347.aClass155_9.method4928()) {
			local134 += 128;
		}
		Static347.aClass155_9.method4940(50, local134);
		Static347.aClass155_9.method4917(!Static164.aClass154_Sub1_1.aBoolean461);
		if (Static347.aClass155_9.method4858()) {
			Static266.method4236(Static164.aClass154_Sub1_1.aBoolean472);
		}
		Static139.method2216(Static347.aClass155_9, Static12.anInt161 >> 3, Static44.anInt787 >> 3);
		Static347.method5256();
		Static47.aBoolean45 = false;
	}
}
