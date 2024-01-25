import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_104 = new Class296(19, 7);

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "[I")
	public static final int[] anIntArray231 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(III)Lclient!vh;")
	public static Class49_Sub5 method1983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class255 local7 = Static242.aClass255ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass49_Sub5_2 == null ? null : local7.aClass49_Sub5_2;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!qa;Lclient!lb;IIIII)V")
	public static void method1985(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static388.anInt7032) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static93.anInt1898) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static382.anInt6965 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class255 local62 = Static242.aClass255ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static544.aClass205Array3[local17].ba(local23, local32) + Static544.aClass205Array3[local17].ba(local23 + 1, local32) + Static544.aClass205Array3[local17].ba(local23, local32 + 1) + Static544.aClass205Array3[local17].ba(local23 + 1, local32 + 1)) / 4 - (Static544.aClass205Array3[arg2].ba(arg3, arg4) + Static544.aClass205Array3[arg2].ba(arg3 + 1, arg4) + Static544.aClass205Array3[arg2].ba(arg3, arg4 + 1) + Static544.aClass205Array3[arg2].ba(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class49_Sub1 local143 = local62.aClass49_Sub1_3;
									@Pc(146) Class49_Sub1 local146 = local62.aClass49_Sub1_2;
									if (local143 != null && local143.method7451()) {
										arg1.method7456((local32 - arg4) * Static201.anInt3950 + (1 - arg6) * Static122.anInt2483, local140, arg0, (local23 - arg3) * Static201.anInt3950 + (1 - arg5) * Static122.anInt2483, local1, local143);
									}
									if (local146 != null && local146.method7451()) {
										arg1.method7456((local32 - arg4) * Static201.anInt3950 + (1 - arg6) * Static122.anInt2483, local140, arg0, (local23 - arg3) * Static201.anInt3950 + (1 - arg5) * Static122.anInt2483, local1, local146);
									}
									for (@Pc(219) Class63 local219 = local62.aClass63_3; local219 != null; local219 = local219.aClass63_1) {
										@Pc(223) Class49_Sub2 local223 = local219.aClass49_Sub2_1;
										if (local223 != null && local223.method7451() && (local23 == local223.aShort117 || local23 == local3) && (local32 == local223.aShort116 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort115 + 1 - local223.aShort117;
											@Pc(260) int local260 = local223.aShort118 + 1 - local223.aShort116;
											arg1.method7456((local223.aShort116 - arg4) * Static201.anInt3950 + (local260 - arg6) * Static122.anInt2483, local140, arg0, (local223.aShort117 - arg3) * Static201.anInt3950 + (local252 - arg5) * Static122.anInt2483, local1, local223);
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

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!kr;I)V")
	public static void method1986(@OriginalArg(0) Class171 arg0) {
		Static546.aClass171_61 = arg0;
	}
}
