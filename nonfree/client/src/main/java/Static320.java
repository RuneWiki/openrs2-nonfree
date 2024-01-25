import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_116 = new Class211(62, -2);

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "Z")
	public static boolean aBoolean409 = false;

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
	public static int anInt5507 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)Z")
	public static boolean method4349(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)Z")
	public static boolean method4350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public static void method4352() {
		for (@Pc(17) Class2_Sub46 local17 = (Class2_Sub46) Static261.aClass156_13.method3155(); local17 != null; local17 = (Class2_Sub46) Static261.aClass156_13.method3150()) {
			if (Static390.method5287(local17.anInt7283)) {
				Static380.method361(local17);
			}
		}
		if (Static137.anInt6647 == 1) {
			Static117.method1762();
			return;
		}
		Static403.method5083(Static275.anInt4524, Static246.anInt3972, Static429.anInt6935, Static253.anInt4058);
		@Pc(51) int local51 = Static241.aClass141_5.method2914(Static445.aClass134_104.method2720(Static331.anInt5597));
		for (@Pc(56) Class2_Sub46 local56 = (Class2_Sub46) Static261.aClass156_13.method3155(); local56 != null; local56 = (Class2_Sub46) Static261.aClass156_13.method3150()) {
			@Pc(62) int local62 = Static431.method5391(local56);
			if (local51 < local62) {
				local51 = local62;
			}
		}
		Static429.anInt6935 = (Static285.aBoolean329 ? 26 : 22) + Static137.anInt6647 * 16;
		Static246.anInt3972 = local51 + 8;
	}
}
