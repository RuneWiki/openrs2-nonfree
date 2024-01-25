import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!au", name = "q", descriptor = "Lclient!hh;")
	public static Class109 aClass109_7;

	@OriginalMember(owner = "client!au", name = "s", descriptor = "[I")
	public static int[] anIntArray25;

	@OriginalMember(owner = "client!au", name = "t", descriptor = "Lclient!hh;")
	public static Class109 aClass109_8;

	@OriginalMember(owner = "client!au", name = "l", descriptor = "[I")
	public static final int[] anIntArray24 = new int[2048];

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!qa;Lclient!ha;IIIII)V")
	public static void method248(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static29.anInt482) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static251.anInt4344) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static219.anInt3872 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class137 local62 = Static131.aClass137ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static256.aClass70Array2[local17].I(local23, local32) + Static256.aClass70Array2[local17].I(local23 + 1, local32) + Static256.aClass70Array2[local17].I(local23, local32 + 1) + Static256.aClass70Array2[local17].I(local23 + 1, local32 + 1)) / 4 - (Static256.aClass70Array2[arg2].I(arg3, arg4) + Static256.aClass70Array2[arg2].I(arg3 + 1, arg4) + Static256.aClass70Array2[arg2].I(arg3, arg4 + 1) + Static256.aClass70Array2[arg2].I(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class47_Sub2 local143 = local62.aClass47_Sub2_1;
									@Pc(146) Class47_Sub2 local146 = local62.aClass47_Sub2_2;
									if (local143 != null && local143.method5725()) {
										arg1.method5733(local140, (local23 - arg3) * Static297.anInt4985 + (1 - arg5) * Static86.anInt1530, arg0, local1, local143, (local32 - arg4) * Static297.anInt4985 + (1 - arg6) * Static86.anInt1530);
									}
									if (local146 != null && local146.method5725()) {
										arg1.method5733(local140, (local23 - arg3) * Static297.anInt4985 + (1 - arg5) * Static86.anInt1530, arg0, local1, local146, (local32 - arg4) * Static297.anInt4985 + (1 - arg6) * Static86.anInt1530);
									}
									for (@Pc(219) Class167 local219 = local62.aClass167_1; local219 != null; local219 = local219.aClass167_2) {
										@Pc(223) Class47_Sub1 local223 = local219.aClass47_Sub1_2;
										if (local223 != null && local223.method5725() && (local23 == local223.aShort104 || local23 == local3) && (local32 == local223.aShort105 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort107 + 1 - local223.aShort104;
											@Pc(260) int local260 = local223.aShort106 + 1 - local223.aShort105;
											arg1.method5733(local140, (local223.aShort104 - arg3) * Static297.anInt4985 + (local252 - arg5) * Static86.anInt1530, arg0, local1, local223, (local223.aShort105 - arg4) * Static297.anInt4985 + (local260 - arg6) * Static86.anInt1530);
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

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIFLclient!ee;FFIFFI[B)V")
	public static void method251(@OriginalArg(1) int arg0, @OriginalArg(4) float arg1, @OriginalArg(5) Class68 arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6, @OriginalArg(12) byte[] arg7) {
		for (@Pc(3) int local3 = 0; local3 < 16; local3++) {
			Static73.method1100(arg2, arg4, local3, arg1, arg6, arg7, arg0, arg5, arg3);
			arg0 += 16384;
		}
	}
}
