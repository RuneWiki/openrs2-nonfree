import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray2;

	@OriginalMember(owner = "client!lfa", name = "n", descriptor = "Lclient!bi;")
	public static Class31 aClass31_67;

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_64 = new Class61(64, 7);

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lclient!oa;Lclient!ni;IIIII)V")
	public static void method4633(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static562.anInt9418) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static173.anInt3719) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static357.anInt6212 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class100 local62 = Static309.aClass100ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static112.aClass16Array3[local17].JA(local23, local32) + Static112.aClass16Array3[local17].JA(local23 + 1, local32) + Static112.aClass16Array3[local17].JA(local23, local32 + 1) + Static112.aClass16Array3[local17].JA(local23 + 1, local32 + 1)) / 4 - (Static112.aClass16Array3[arg2].JA(arg3, arg4) + Static112.aClass16Array3[arg2].JA(arg3 + 1, arg4) + Static112.aClass16Array3[arg2].JA(arg3, arg4 + 1) + Static112.aClass16Array3[arg2].JA(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class10_Sub2 local143 = local62.aClass10_Sub2_3;
									@Pc(146) Class10_Sub2 local146 = local62.aClass10_Sub2_2;
									if (local143 != null && local143.method7730()) {
										arg1.method7732((local23 - arg3) * Static514.anInt8839 + (1 - arg5) * Static436.anInt7494, arg0, local140, local143, local1, (local32 - arg4) * Static514.anInt8839 + (1 - arg6) * Static436.anInt7494);
									}
									if (local146 != null && local146.method7730()) {
										arg1.method7732((local23 - arg3) * Static514.anInt8839 + (1 - arg5) * Static436.anInt7494, arg0, local140, local146, local1, (local32 - arg4) * Static514.anInt8839 + (1 - arg6) * Static436.anInt7494);
									}
									for (@Pc(219) Class35 local219 = local62.aClass35_2; local219 != null; local219 = local219.aClass35_1) {
										@Pc(223) Class10_Sub1 local223 = local219.aClass10_Sub1_1;
										if (local223 != null && local223.method7730() && (local23 == local223.aShort116 || local23 == local3) && (local32 == local223.aShort117 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort118 + 1 - local223.aShort116;
											@Pc(260) int local260 = local223.aShort115 + 1 - local223.aShort117;
											arg1.method7732((local223.aShort116 - arg3) * Static514.anInt8839 + (local252 - arg5) * Static436.anInt7494, arg0, local140, local223, local1, (local223.aShort117 - arg4) * Static514.anInt8839 + (local260 - arg6) * Static436.anInt7494);
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
