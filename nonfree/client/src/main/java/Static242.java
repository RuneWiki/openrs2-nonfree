import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static242 {

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "[I")
	public static final int[] anIntArray321 = new int[13];

	@OriginalMember(owner = "client!jda", name = "e", descriptor = "Lclient!pca;")
	public static final Class245 aClass245_39 = new Class245(8);

	@OriginalMember(owner = "client!jda", name = "i", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_57 = new Class181(5, -1);

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(III)Z")
	public static boolean method4246(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V")
	public static void method4247() {
		if (Static104.aClass6_Sub6_Sub1_4.method1075(Static5.anInt145) || Static410.anInt7667 == Static493.anInt8836) {
			Static96.method2073(Static323.aClass9_8);
			if (Static380.anInt7115 != Static493.anInt8836) {
				Static579.method6614();
			}
		} else {
			Static120.method2369(Static335.anInt6221, false, Static94.anInt2266, 11);
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V")
	public static void method4248() {
		Static540.aClass6_Sub42_7 = new Class6_Sub42(Static222.aClass152_3.method4002(Static286.anInt5468), "", Static530.anInt9191, 1008, -1, 0L, 0, 0, true, false);
	}
}
