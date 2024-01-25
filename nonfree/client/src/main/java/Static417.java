import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!up", name = "g", descriptor = "[I")
	public static int[] anIntArray475;

	@OriginalMember(owner = "client!up", name = "c", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_113 = new Class194(34, 7);

	@OriginalMember(owner = "client!up", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[100];

	@OriginalMember(owner = "client!up", name = "i", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_114 = new Class194(16, -1);

	@OriginalMember(owner = "client!up", name = "j", descriptor = "I")
	public static int anInt6956 = 0;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IZIII)V")
	public static void method5501(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static305.method3794(arg2)) {
			Static119.method2851(arg3, arg0, arg1, -1, Static34.aClass76ArrayArray1[arg2]);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static391.method5106(Static356.anInt5817, arg4, Static3.anInt46);
		@Pc(17) int local17 = Static391.method5106(Static356.anInt5817, arg6, Static3.anInt46);
		@Pc(23) int local23 = Static391.method5106(Static3.anInt45, arg3, Static112.anInt1900);
		@Pc(29) int local29 = Static391.method5106(Static3.anInt45, arg5, Static112.anInt1900);
		@Pc(37) int local37 = Static391.method5106(Static356.anInt5817, arg0 + arg4, Static3.anInt46);
		@Pc(46) int local46 = Static391.method5106(Static356.anInt5817, arg6 - arg0, Static3.anInt46);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static291.method3606(local29, Static133.anIntArrayArray15[local48], arg1, local23);
		}
		for (@Pc(73) int local73 = local17; local73 > local46; local73--) {
			Static291.method3606(local29, Static133.anIntArrayArray15[local73], arg1, local23);
		}
		@Pc(100) int local100 = Static391.method5106(Static3.anInt45, arg3 + arg0, Static112.anInt1900);
		@Pc(109) int local109 = Static391.method5106(Static3.anInt45, arg5 - arg0, Static112.anInt1900);
		for (@Pc(111) int local111 = local37; local111 <= local46; local111++) {
			@Pc(117) int[] local117 = Static133.anIntArrayArray15[local111];
			Static291.method3606(local100, local117, arg1, local23);
			Static291.method3606(local109, local117, arg2, local100);
			Static291.method3606(local29, local117, arg1, local109);
		}
	}
}
