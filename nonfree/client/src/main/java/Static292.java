import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!lda", name = "p", descriptor = "Lclient!jo;")
	public static Class168 aClass168_69;

	@OriginalMember(owner = "client!lda", name = "q", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_109 = new Class254(1, -1);

	@OriginalMember(owner = "client!lda", name = "r", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_65 = new Class181(21, -1);

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIIIIBI)V")
	public static void method4796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static434.method6629(arg3);
		@Pc(10) int local10 = 0;
		@Pc(26) int local26 = arg3 - arg4;
		if (local26 < 0) {
			local26 = 0;
		}
		@Pc(35) int local35 = arg3;
		@Pc(38) int local38 = -arg3;
		@Pc(40) int local40 = local26;
		@Pc(43) int local43 = -local26;
		@Pc(45) int local45 = -1;
		@Pc(47) int local47 = -1;
		@Pc(51) int[] local51 = Static183.anIntArrayArray26[arg2];
		@Pc(55) int local55 = arg5 - local26;
		@Pc(60) int local60 = arg5 + local26;
		Static115.method2332(arg5 - arg3, local55, arg1, local51);
		Static115.method2332(local55, local60, arg0, local51);
		Static115.method2332(local60, arg5 + arg3, arg1, local51);
		while (local10 < local35) {
			local47 += 2;
			local45 += 2;
			local38 += local45;
			local43 += local47;
			if (local43 >= 0 && local40 >= 1) {
				Static158.anIntArray236[local40] = local10;
				local40--;
				local43 -= local40 << 1;
			}
			local10++;
			@Pc(131) int[] local131;
			@Pc(138) int[] local138;
			@Pc(142) int local142;
			@Pc(146) int local146;
			@Pc(151) int local151;
			@Pc(155) int local155;
			@Pc(159) int local159;
			if (local38 >= 0) {
				local35--;
				if (local35 < local26) {
					local131 = Static183.anIntArrayArray26[arg2 + local35];
					local138 = Static183.anIntArrayArray26[arg2 - local35];
					local142 = Static158.anIntArray236[local35];
					local146 = local10 + arg5;
					local151 = arg5 - local10;
					local155 = local142 + arg5;
					local159 = arg5 - local142;
					Static115.method2332(local151, local159, arg1, local131);
					Static115.method2332(local159, local155, arg0, local131);
					Static115.method2332(local155, local146, arg1, local131);
					Static115.method2332(local151, local159, arg1, local138);
					Static115.method2332(local159, local155, arg0, local138);
					Static115.method2332(local155, local146, arg1, local138);
				} else {
					local131 = Static183.anIntArrayArray26[arg2 + local35];
					local138 = Static183.anIntArrayArray26[arg2 - local35];
					local142 = local10 + arg5;
					local146 = arg5 - local10;
					Static115.method2332(local146, local142, arg1, local131);
					Static115.method2332(local146, local142, arg1, local138);
				}
				local38 -= local35 << 1;
			}
			local131 = Static183.anIntArrayArray26[local10 + arg2];
			local138 = Static183.anIntArrayArray26[arg2 - local10];
			local142 = local35 + arg5;
			local146 = arg5 - local35;
			if (local10 < local26) {
				local151 = local10 > local40 ? Static158.anIntArray236[local10] : local40;
				local155 = arg5 + local151;
				local159 = arg5 - local151;
				Static115.method2332(local146, local159, arg1, local131);
				Static115.method2332(local159, local155, arg0, local131);
				Static115.method2332(local155, local142, arg1, local131);
				Static115.method2332(local146, local159, arg1, local138);
				Static115.method2332(local159, local155, arg0, local138);
				Static115.method2332(local155, local142, arg1, local138);
			} else {
				Static115.method2332(local146, local142, arg1, local131);
				Static115.method2332(local146, local142, arg1, local138);
			}
		}
	}
}
