import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!in", name = "x", descriptor = "Lclient!la;")
	public static final Class136 aClass136_88 = new Class136(95, 3);

	@OriginalMember(owner = "client!in", name = "z", descriptor = "Z")
	public static boolean aBoolean251 = false;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!qa;Lclient!a;IIIII)V")
	public static void method2850(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static174.anInt3263) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static459.anInt5916) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static342.anInt5746 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class227 local62 = Static389.aClass227ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static178.aClass55Array1[local17].oa(local23, local32) + Static178.aClass55Array1[local17].oa(local23 + 1, local32) + Static178.aClass55Array1[local17].oa(local23, local32 + 1) + Static178.aClass55Array1[local17].oa(local23 + 1, local32 + 1)) / 4 - (Static178.aClass55Array1[arg2].oa(arg3, arg4) + Static178.aClass55Array1[arg2].oa(arg3 + 1, arg4) + Static178.aClass55Array1[arg2].oa(arg3, arg4 + 1) + Static178.aClass55Array1[arg2].oa(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class1_Sub3 local143 = local62.aClass1_Sub3_3;
									@Pc(146) Class1_Sub3 local146 = local62.aClass1_Sub3_2;
									if (local143 != null && local143.method6247()) {
										arg1.method6248(local140, local143, (local23 - arg3) * Static99.anInt1803 + (1 - arg5) * Static22.anInt382, (local32 - arg4) * Static99.anInt1803 + (1 - arg6) * Static22.anInt382, arg0, local1);
									}
									if (local146 != null && local146.method6247()) {
										arg1.method6248(local140, local146, (local23 - arg3) * Static99.anInt1803 + (1 - arg5) * Static22.anInt382, (local32 - arg4) * Static99.anInt1803 + (1 - arg6) * Static22.anInt382, arg0, local1);
									}
									for (@Pc(219) Class114 local219 = local62.aClass114_2; local219 != null; local219 = local219.aClass114_1) {
										@Pc(223) Class1_Sub2 local223 = local219.aClass1_Sub2_1;
										if (local223 != null && local223.method6247() && (local23 == local223.aShort108 || local23 == local3) && (local32 == local223.aShort107 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort109 + 1 - local223.aShort108;
											@Pc(260) int local260 = local223.aShort110 + 1 - local223.aShort107;
											arg1.method6248(local140, local223, (local223.aShort108 - arg3) * Static99.anInt1803 + (local252 - arg5) * Static22.anInt382, (local223.aShort107 - arg4) * Static99.anInt1803 + (local260 - arg6) * Static22.anInt382, arg0, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
