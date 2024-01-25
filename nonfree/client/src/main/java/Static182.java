import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray67;

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "[Lclient!cg;")
	public static Class5_Sub9_Sub1[] aClass5_Sub9_Sub1Array2;

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "Lclient!ne;")
	public static Class139 aClass139_5;

	@OriginalMember(owner = "client!lk", name = "B", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray43;

	@OriginalMember(owner = "client!lk", name = "E", descriptor = "Lclient!gf;")
	public static Interface3 anInterface3_3;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V")
	public static void method3318() {
		Static306.aClass109_56.method2858();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIBZ)V")
	public static void method3319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(19) long local19 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg2);
		@Pc(25) Class5_Sub14 local25 = (Class5_Sub14) Static118.aClass190_11.method5466(local19);
		if (local25 == null) {
			local25 = new Class5_Sub14();
			Static118.aClass190_11.method5464(local25, local19);
		}
		if (local25.anIntArray129.length <= arg3) {
			@Pc(50) int[] local50 = new int[arg3 + 1];
			@Pc(55) int[] local55 = new int[arg3 + 1];
			for (@Pc(57) int local57 = 0; local57 < local25.anIntArray129.length; local57++) {
				local50[local57] = local25.anIntArray129[local57];
				local55[local57] = local25.anIntArray128[local57];
			}
			for (@Pc(83) int local83 = local25.anIntArray129.length; local83 < arg3; local83++) {
				local50[local83] = -1;
				local55[local83] = 0;
			}
			local25.anIntArray128 = local55;
			local25.anIntArray129 = local50;
		}
		local25.anIntArray129[arg3] = arg1;
		local25.anIntArray128[arg3] = arg0;
	}
}
