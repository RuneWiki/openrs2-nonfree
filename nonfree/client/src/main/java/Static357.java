import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!s", name = "n", descriptor = "Lclient!dk;")
	public static Class54 aClass54_93;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "[I")
	public static int[] anIntArray503;

	@OriginalMember(owner = "client!s", name = "m", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_163 = new Class102(43, 7);

	@OriginalMember(owner = "client!s", name = "p", descriptor = "[Lclient!sv;")
	public static final Class2_Sub13[] aClass2_Sub13Array3 = new Class2_Sub13[2048];

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!i;III[Z)V")
	public static void method4497(@OriginalArg(0) Class2_Sub5_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static345.aClass162Array3 == Static109.aClass162Array1) {
			return;
		}
		@Pc(9) int local9 = Static314.aClass162Array2[arg1].ca(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class162 local22 = Static314.aClass162Array2[local11];
				if (local22 != null) {
					local22.ba(arg0, arg2, local9 - local22.ca(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([[[Lclient!wr;I)V")
	public static void method4499(@OriginalArg(0) Class270[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(14) Class270[][] local14 = arg0[local3];
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				for (@Pc(20) int local20 = 0; local20 < local14[local16].length; local20++) {
					@Pc(28) Class270 local28 = local14[local16][local20];
					if (local28 != null) {
						if (local28.aClass3_Sub5_2 instanceof Interface2) {
							((Interface2) local28.aClass3_Sub5_2).method5297();
						}
						if (local28.aClass3_Sub3_2 instanceof Interface2) {
							((Interface2) local28.aClass3_Sub3_2).method5297();
						}
						if (local28.aClass3_Sub3_3 instanceof Interface2) {
							((Interface2) local28.aClass3_Sub3_3).method5297();
						}
						if (local28.aClass3_Sub2_3 instanceof Interface2) {
							((Interface2) local28.aClass3_Sub2_3).method5297();
						}
						if (local28.aClass3_Sub2_2 instanceof Interface2) {
							((Interface2) local28.aClass3_Sub2_2).method5297();
						}
						for (@Pc(80) Class241 local80 = local28.aClass241_2; local80 != null; local80 = local80.aClass241_1) {
							@Pc(85) Class3_Sub4 local85 = local80.aClass3_Sub4_2;
							if (local85 instanceof Interface2) {
								((Interface2) local85).method5297();
							}
						}
					}
				}
			}
		}
	}
}
