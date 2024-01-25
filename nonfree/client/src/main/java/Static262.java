import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!jha", name = "i", descriptor = "Lclient!dm;")
	public static Class65 aClass65_2;

	@OriginalMember(owner = "client!jha", name = "j", descriptor = "[I")
	public static int[] anIntArray332;

	@OriginalMember(owner = "client!jha", name = "k", descriptor = "I")
	public static int anInt5743 = 0;

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ZCLjava/lang/String;)I")
	public static int method4868(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg1.charAt(local17) == arg0) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(III)V")
	public static void method4869(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		if (arg0 != Static164.anInt8839) {
			Static352.anIntArray400 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static352.anIntArray400[local17] = (local17 << 12) / arg0;
			}
			Static90.anInt2314 = arg0 * 32;
			Static52.anInt1120 = arg0 - 1;
			Static164.anInt8839 = arg0;
		}
		if (Static638.anInt10476 == arg1) {
			return;
		}
		if (arg1 == Static164.anInt8839) {
			Static328.anIntArray387 = Static352.anIntArray400;
		} else {
			Static328.anIntArray387 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static328.anIntArray387[local17] = (local17 << 12) / arg1;
			}
		}
		Static638.anInt10476 = arg1;
		Static46.anInt1029 = arg1 - 1;
	}
}
