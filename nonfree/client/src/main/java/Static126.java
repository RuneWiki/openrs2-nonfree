import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "Lclient!jt;")
	public static Class165 aClass165_3;

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "Lclient!ha;")
	public static Class25 aClass25_25;

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "Z")
	public static boolean aBoolean607 = false;

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
	public static int anInt8434 = -2;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(DI)V")
	public static void method6806(@OriginalArg(0) double arg0) {
		if (arg0 == Static460.aDouble9) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static540.anIntArray690[local7] = local19 <= 255 ? local19 : 255;
		}
		Static460.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZLclient!co;I)Ljava/lang/String;")
	public static String method6807(@OriginalArg(1) Class5_Sub3 arg0) {
		try {
			@Pc(13) int local13 = arg0.method4231();
			if (local13 > 32767) {
				local13 = 32767;
			}
			@Pc(21) byte[] local21 = new byte[local13];
			arg0.anInt4960 += Static223.aClass302_1.method7108(local13, arg0.aByteArray66, local21, 0, arg0.anInt4960);
			return Static152.method2790(local13, 0, local21);
		} catch (@Pc(45) Exception local45) {
			return "Cabbage";
		}
	}
}
