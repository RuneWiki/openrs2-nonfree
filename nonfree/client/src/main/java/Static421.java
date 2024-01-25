import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!va", name = "m", descriptor = "I")
	public static int anInt7076 = 503;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "I")
	public static int anInt7078 = 1;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!ya;Lclient!gg;IIIII)V")
	public static void method5675(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static320.anInt5205) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static81.anInt1606) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static18.anInt297 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class75 local62 = Static432.aClass75ArrayArrayArray6[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static278.aClass41Array3[local17].l(local23, local32) + Static278.aClass41Array3[local17].l(local23 + 1, local32) + Static278.aClass41Array3[local17].l(local23, local32 + 1) + Static278.aClass41Array3[local17].l(local23 + 1, local32 + 1)) / 4 - (Static278.aClass41Array3[arg2].l(arg3, arg4) + Static278.aClass41Array3[arg2].l(arg3 + 1, arg4) + Static278.aClass41Array3[arg2].l(arg3, arg4 + 1) + Static278.aClass41Array3[arg2].l(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class8_Sub2 local143 = local62.aClass8_Sub2_1;
									@Pc(146) Class8_Sub2 local146 = local62.aClass8_Sub2_2;
									if (local143 != null && local143.method5873()) {
										arg1.method5875(local143, (local23 - arg3) * Static416.anInt7020 + (1 - arg5) * Static390.anInt7654, local1, (local32 - arg4) * Static416.anInt7020 + (1 - arg6) * Static390.anInt7654, local140, arg0);
									}
									if (local146 != null && local146.method5873()) {
										arg1.method5875(local146, (local23 - arg3) * Static416.anInt7020 + (1 - arg5) * Static390.anInt7654, local1, (local32 - arg4) * Static416.anInt7020 + (1 - arg6) * Static390.anInt7654, local140, arg0);
									}
									for (@Pc(219) Class251 local219 = local62.aClass251_2; local219 != null; local219 = local219.aClass251_3) {
										@Pc(223) Class8_Sub3 local223 = local219.aClass8_Sub3_2;
										if (local223 != null && local223.method5873() && (local23 == local223.aShort100 || local23 == local3) && (local32 == local223.aShort99 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort101 + 1 - local223.aShort100;
											@Pc(260) int local260 = local223.aShort98 + 1 - local223.aShort99;
											arg1.method5875(local223, (local223.aShort100 - arg3) * Static416.anInt7020 + (local252 - arg5) * Static390.anInt7654, local1, (local223.aShort99 - arg4) * Static416.anInt7020 + (local260 - arg6) * Static390.anInt7654, local140, arg0);
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

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!pc;IIII)Ljava/awt/Frame;")
	public static Frame method5676(@OriginalArg(0) int arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method3904()) {
			return null;
		}
		@Pc(20) Class241[] local20 = Static112.method1661(arg1);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (arg0 == local20[local28].anInt6346 && local20[local28].anInt6344 == arg3 && (!local26 || local20[local28].anInt6345 > arg2)) {
				local26 = true;
				arg2 = local20[local28].anInt6345;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(90) Class45 local90 = arg1.method3920(arg3, arg2, arg0);
		while (local90.anInt1129 == 0) {
			Static435.method5777(10L);
		}
		@Pc(106) Frame local106 = (Frame) local90.anObject5;
		if (local106 == null) {
			return null;
		} else if (local90.anInt1129 == 2) {
			Static339.method4485(local106, arg1);
			return null;
		} else {
			return local106;
		}
	}
}
