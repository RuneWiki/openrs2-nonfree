import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
	public static int anInt9218;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "Lclient!gn;")
	public static final Class136 aClass136_41 = new Class136(8);

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_155 = new Class186(9, -1);

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_96 = new Class286(17, 0);

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "[I")
	public static final int[] anIntArray506 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZLjava/lang/String;Z)V")
	public static void method7763(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		Static135.method2227();
		Static292.method4410();
		Static404.method6050();
		Static13.method164(arg1, arg0, arg2);
		Static285.method4301();
		Static722.method9415(Static488.aClass67_12);
		Static115.method2035(Static488.aClass67_12);
		Static453.method6735(Static488.aClass67_12, Static403.aClass221_115);
		Static247.method3755();
		Static564.method7847(Static619.aClass9Array44, 0);
		Static693.method9085();
		Static523.method7451();
		if (Static178.anInt3225 == 3) {
			Static638.method8657(4);
		} else if (Static178.anInt3225 == 7) {
			Static638.method8657(8);
		} else if (Static178.anInt3225 == 9) {
			Static638.method8657(10);
		} else if (Static178.anInt3225 == 11) {
			Static638.method8657(12);
		} else if (Static178.anInt3225 == 1 || Static178.anInt3225 == 2) {
			Static110.method1959();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)Lclient!lda;")
	public static Class225 method7765(@OriginalArg(0) int arg0) {
		@Pc(8) Class225[] local8 = Static340.method4999();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].anInt6030 == arg0) {
				return local8[local10];
			}
		}
		return null;
	}
}
