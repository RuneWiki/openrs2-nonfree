import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
	public static int anInt560 = -60;

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "[F")
	public static final float[] aFloatArray4 = new float[4];

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!za;Lclient!vs;IIIII)V")
	public static void method475(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static285.anInt5004) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static54.anInt998) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static24.anInt401 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class11 local62 = Static309.aClass11ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static332.aClass154Array3[local17].ua(local23, local32) + Static332.aClass154Array3[local17].ua(local23 + 1, local32) + Static332.aClass154Array3[local17].ua(local23, local32 + 1) + Static332.aClass154Array3[local17].ua(local23 + 1, local32 + 1)) / 4 - (Static332.aClass154Array3[arg2].ua(arg3, arg4) + Static332.aClass154Array3[arg2].ua(arg3 + 1, arg4) + Static332.aClass154Array3[arg2].ua(arg3, arg4 + 1) + Static332.aClass154Array3[arg2].ua(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class24_Sub5 local143 = local62.aClass24_Sub5_1;
									@Pc(146) Class24_Sub5 local146 = local62.aClass24_Sub5_2;
									if (local143 != null && local143.method5692()) {
										arg1.method5687(local140, (local23 - arg3) * Static335.anInt5671 + (1 - arg5) * Static437.anInt7214, local143, arg0, local1, (local32 - arg4) * Static335.anInt5671 + (1 - arg6) * Static437.anInt7214);
									}
									if (local146 != null && local146.method5692()) {
										arg1.method5687(local140, (local23 - arg3) * Static335.anInt5671 + (1 - arg5) * Static437.anInt7214, local146, arg0, local1, (local32 - arg4) * Static335.anInt5671 + (1 - arg6) * Static437.anInt7214);
									}
									for (@Pc(219) Class1 local219 = local62.aClass1_3; local219 != null; local219 = local219.aClass1_1) {
										@Pc(223) Class24_Sub3 local223 = local219.aClass24_Sub3_1;
										if (local223 != null && local223.method5692() && (local23 == local223.aShort107 || local23 == local3) && (local32 == local223.aShort105 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort106 + 1 - local223.aShort107;
											@Pc(260) int local260 = local223.aShort104 + 1 - local223.aShort105;
											arg1.method5687(local140, (local223.aShort107 - arg3) * Static335.anInt5671 + (local252 - arg5) * Static437.anInt7214, local223, arg0, local1, (local223.aShort105 - arg4) * Static335.anInt5671 + (local260 - arg6) * Static437.anInt7214);
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

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!lt;Ljava/lang/Object;I)V")
	public static void method476(@OriginalArg(0) Class159 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < 50 && arg0.anEventQueue1.peekEvent() != null; local9++) {
			Static328.method5696(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
