import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!eca", name = "l", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!eca", name = "p", descriptor = "[[I")
	public static int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!eca", name = "i", descriptor = "Lclient!fh;")
	public static final Class107 aClass107_1 = new Class107("WTI", 5);

	@OriginalMember(owner = "client!eca", name = "j", descriptor = "Lclient!kf;")
	public static final Class177 aClass177_1 = new Class177();

	@OriginalMember(owner = "client!eca", name = "m", descriptor = "[I")
	public static final int[] anIntArray153 = new int[64];

	@OriginalMember(owner = "client!eca", name = "q", descriptor = "Lclient!jr;")
	public static final Class169 aClass169_19 = new Class169(32);

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!cs;Lclient!lga;IIILclient!ha;IILclient!ii;)V")
	public static void method2907(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class2_Sub32 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class20 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class153 arg7) {
		@Pc(17) int local17 = arg2 - arg6 / 2 - 5;
		@Pc(21) int local21 = arg5 + 2;
		if (arg7.anInt5243 != 0) {
			arg4.method7278(arg6 + 10, local17, local21, arg5 + arg0.method2369() * arg3 + 1 - local21, arg7.anInt5243);
		}
		if (arg7.anInt5245 != 0) {
			arg4.method7271(arg6 + 10, local21, arg7.anInt5245, local17, arg3 * arg0.method2369() + arg5 + 1 - local21);
		}
		@Pc(74) int local74 = arg7.anInt5226;
		if (arg1.aBoolean491 && arg7.anInt5217 != -1) {
			local74 = arg7.anInt5217;
		}
		for (@Pc(86) int local86 = 0; local86 < arg3; local86++) {
			@Pc(92) String local92 = Static626.aStringArray8[local86];
			if (arg3 - 1 > local86) {
				local92 = local92.substring(0, local92.length() - 4);
			}
			arg0.method2367(arg4, local92, arg2, arg5, local74);
			arg5 += arg0.method2369();
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IF)F")
	public static float method2908(@OriginalArg(1) float arg0) {
		return (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "()V")
	public static void method2910() {
		for (@Pc(1) int local1 = Static599.anInt10549; local1 < Static462.anInt8470; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static477.anInt8929; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static562.anInt10128; local7++) {
					@Pc(16) Class100 local16 = Static395.aClass100ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class3_Sub1_Sub5 local21 = local16.aClass3_Sub1_Sub5_2;
						@Pc(24) Class3_Sub1_Sub5 local24 = local16.aClass3_Sub1_Sub5_1;
						if (local21 != null && local21.method8612()) {
							Static254.method6950(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8612()) {
								Static254.method6950(local24, local1, local4, local7, 1, 1);
								local24.method8604(Static194.aClass20_5, 0, false, local21, 0, 0);
								local24.method8616();
							}
							local21.method8616();
						}
						for (@Pc(68) Class243 local68 = local16.aClass243_1; local68 != null; local68 = local68.aClass243_3) {
							@Pc(72) Class3_Sub1_Sub3 local72 = local68.aClass3_Sub1_Sub3_1;
							if (local72 != null && local72.method8612()) {
								Static254.method6950(local72, local1, local4, local7, local72.aShort121 + 1 - local72.aShort118, local72.aShort119 - local72.aShort120 + 1);
								local72.method8616();
							}
						}
						@Pc(108) Class3_Sub1_Sub1 local108 = local16.aClass3_Sub1_Sub1_1;
						if (local108 != null && local108.method8612()) {
							Static571.method8521(local108, local1, local4, local7);
							local108.method8616();
						}
					}
				}
			}
		}
	}
}
