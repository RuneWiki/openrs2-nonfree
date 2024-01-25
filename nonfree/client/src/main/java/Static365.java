import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static365 {

	@OriginalMember(owner = "client!m", name = "x", descriptor = "[S")
	public static short[] aShortArray90;

	@OriginalMember(owner = "client!m", name = "N", descriptor = "I")
	public static int anInt6219;

	@OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
	public static int anInt6221;

	@OriginalMember(owner = "client!m", name = "C", descriptor = "Lclient!sia;")
	public static Class331 aClass331_1;

	@OriginalMember(owner = "client!m", name = "J", descriptor = "[I")
	public static int[] anIntArray336;

	@OriginalMember(owner = "client!m", name = "F", descriptor = "I")
	public static int anInt6233 = 0;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(Z)V")
	public static void method5498() {
		Static152.anInt2360 = (int) ((double) Static380.anInt6689 * 34.46D);
		Static3.anInt56 = 200;
		Static152.anInt2360 <<= 0x2;
		if (Static103.aClass144_3.method6962()) {
			Static152.anInt2360 += 512;
		}
		Static512.method9100(false);
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(I)J")
	public static long method5500() {
		return Static15.aClass2_1.method8989();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)Z")
	public static boolean method5502(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 49 || arg0 == 8 || arg0 == 59 || arg0 == 19 || arg0 == 58 || arg0 == 51 || arg0 == 22 || arg0 == 15 || arg0 == 53 || arg0 == 13;
	}
}
