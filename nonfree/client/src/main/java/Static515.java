import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Lclient!xa;")
	public static Class66 aClass66_30;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_146 = new Class254(45, 2);

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "[I")
	public static final int[] anIntArray719 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method7172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < arg2 + arg4 && arg3 + arg0 > arg4) {
			return arg6 < arg1 + arg7 && arg1 < arg6 + arg5;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII[B[BI)V")
	public static void method7174(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(18) int local18 = -arg4; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg0++;
				arg6[local26] = (byte) (arg6[local26] - arg5[arg1++]);
				@Pc(39) int local39 = arg0++;
				arg6[local39] = (byte) (arg6[local39] - arg5[arg1++]);
				@Pc(52) int local52 = arg0++;
				arg6[local52] = (byte) (arg6[local52] - arg5[arg1++]);
				@Pc(65) int local65 = arg0++;
				arg6[local65] = (byte) (arg6[local65] - arg5[arg1++]);
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local26 = arg0++;
				arg6[local26] = (byte) (arg6[local26] - arg5[arg1++]);
			}
			arg0 += arg2;
			arg1 += arg7;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method7175(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static81.anInt1953;
		@Pc(14) int[] local14 = Static227.anIntArray309;
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local12; local18++) {
			@Pc(26) Class11_Sub1_Sub1_Sub2 local26 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local14[local18]];
			if (local26 != null && Static350.aClass11_Sub1_Sub1_Sub2_4 != local26 && local26.aString95 != null && local26.aString95.equalsIgnoreCase(arg0)) {
				local16 = true;
				if (arg1 == 1) {
					Static298.method4854(Static372.aClass181_115);
					Static547.aClass6_Sub26_Sub2_2.method4991(local14[local18]);
					Static547.aClass6_Sub26_Sub2_2.method4950(0, -81849);
				} else if (arg1 == 4) {
					Static298.method4854(Static508.aClass181_101);
					Static547.aClass6_Sub26_Sub2_2.method4995(0);
					Static547.aClass6_Sub26_Sub2_2.method4991(local14[local18]);
				} else if (arg1 == 5) {
					Static298.method4854(Static354.aClass181_75);
					Static547.aClass6_Sub26_Sub2_2.method4955(0);
					Static547.aClass6_Sub26_Sub2_2.method4991(local14[local18]);
				} else if (arg1 == 6) {
					Static298.method4854(Static282.aClass181_62);
					Static547.aClass6_Sub26_Sub2_2.method4946(local14[local18]);
					Static547.aClass6_Sub26_Sub2_2.method4995(0);
				} else if (arg1 == 7) {
					Static298.method4854(Static536.aClass181_108);
					Static547.aClass6_Sub26_Sub2_2.method4971(0);
					Static547.aClass6_Sub26_Sub2_2.method4965(local14[local18]);
				}
				break;
			}
		}
		if (!local16) {
			Static99.method2135(Static222.aClass152_66.method4002(Static286.anInt5468) + arg0);
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(III)Z")
	public static boolean method7180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
