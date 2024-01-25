import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!ki", name = "Gc", descriptor = "Lclient!ci;")
	public static Class38 aClass38_45;

	@OriginalMember(owner = "client!ki", name = "Kc", descriptor = "Lclient!qd;")
	public static Class202 aClass202_1;

	@OriginalMember(owner = "client!ki", name = "kd", descriptor = "I")
	public static int anInt4178;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Z")
	public static boolean method3618(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLjava/lang/String;C)I")
	public static int method3622(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			if (arg1 == arg0.charAt(local18)) {
				local13++;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!tf;I)V")
	public static void method3628(@OriginalArg(0) Class240 arg0) {
		if (arg0.anInt6882 != Static151.anInt3133) {
			return;
		}
		if (Static52.aClass11_Sub5_Sub2_Sub1_2.aString31 == null) {
			arg0.anInt6869 = 0;
			arg0.anInt6902 = 0;
			return;
		}
		arg0.anInt6875 = 150;
		arg0.anInt6887 = (int) (Math.sin((double) Static277.anInt2834 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt6902 = Static147.anInt3062;
		arg0.anInt6880 = 5;
		arg0.anInt6869 = Static72.method1583(Static52.aClass11_Sub5_Sub2_Sub1_2.aString31);
		arg0.anInt6867 = Static52.aClass11_Sub5_Sub2_Sub1_2.anInt6491;
		arg0.anInt6847 = Static52.aClass11_Sub5_Sub2_Sub1_2.anInt6540;
		arg0.anInt6858 = Static52.aClass11_Sub5_Sub2_Sub1_2.anInt6484;
		arg0.anInt6890 = 0;
	}
}
