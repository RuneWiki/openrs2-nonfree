import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!sca", name = "i", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_234 = new Class363(97, -1);

	@OriginalMember(owner = "client!sca", name = "j", descriptor = "I")
	public static int anInt8186 = 0;

	@OriginalMember(owner = "client!sca", name = "k", descriptor = "Lclient!fh;")
	public static final Class113 aClass113_17 = new Class113(10, 3);

	@OriginalMember(owner = "client!sca", name = "l", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_235 = new Class363(30, -1);

	@OriginalMember(owner = "client!sca", name = "m", descriptor = "[I")
	public static final int[] anIntArray580 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(II[Lclient!kp;IZI)V")
	public static void method6776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		for (@Pc(11) int local11 = 0; local11 < arg2.length; local11++) {
			@Pc(17) Class196 local17 = arg2[local11];
			if (local17 != null && local17.anInt5089 == arg3) {
				Static215.method3470(arg0, local17, arg4, arg1);
				Static333.method5102(arg0, arg1, local17);
				if (local17.anInt5125 > local17.anInt5146 - local17.anInt5130) {
					local17.anInt5125 = local17.anInt5146 - local17.anInt5130;
				}
				if (local17.anInt5125 < 0) {
					local17.anInt5125 = 0;
				}
				if (local17.anInt5164 - local17.anInt5078 < local17.anInt5115) {
					local17.anInt5115 = local17.anInt5164 - local17.anInt5078;
				}
				if (local17.anInt5115 < 0) {
					local17.anInt5115 = 0;
				}
				if (local17.anInt5098 == 0) {
					Static274.method4155(local17, arg4);
				}
			}
		}
	}
}
