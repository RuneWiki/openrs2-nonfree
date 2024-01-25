import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static236 {

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "Lclient!dl;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_92 = new Class25(3, 7);

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
	public static int anInt3995 = -1;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	public static void method3224() {
		Static28.aClass75_3.JA(((float) Static434.aClass165_Sub1_1.anInt4210 * 0.1F + 0.7F) * 1.1523438F);
		Static28.aClass75_3.B(Static149.anInt7396, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static28.aClass75_3.Q(Static298.anInt5367, -1, 256);
		Static28.aClass75_3.method5958(Static434.aClass141_4);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!gi;I)V")
	public static void method3225(@OriginalArg(0) Class93 arg0) {
		if (arg0.anInt2469 != Static418.anInt7174) {
			return;
		}
		if (Static127.aClass11_Sub5_Sub2_Sub1_2.aString20 == null) {
			arg0.anInt2512 = 0;
			arg0.anInt2496 = 0;
			return;
		}
		arg0.anInt2462 = 150;
		arg0.anInt2474 = (int) (Math.sin((double) Static277.anInt5022 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt2512 = Static94.anInt5592;
		arg0.anInt2431 = 5;
		arg0.anInt2496 = Static383.method5265(Static127.aClass11_Sub5_Sub2_Sub1_2.aString20);
		arg0.anInt2455 = Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7657;
		arg0.anInt2428 = Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7663;
		arg0.anInt2433 = 0;
		arg0.anInt2438 = Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7701;
	}
}
