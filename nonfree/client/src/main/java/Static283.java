import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
	public static int anInt5218;

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "Lclient!vr;")
	public static Class3 aClass3_2;

	@OriginalMember(owner = "client!jga", name = "h", descriptor = "[I")
	public static int[] anIntArray266;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "Lclient!ow;")
	public static final Class271 aClass271_28 = new Class271();

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "Lclient!in;")
	public static final Class169 aClass169_137 = new Class169(60, 1);

	@OriginalMember(owner = "client!jga", name = "g", descriptor = "I")
	public static int anInt5221 = -1;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIB)I")
	public static int method4742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 24;
		@Pc(17) int local17 = 255 - local12;
		@Pc(35) int local35 = ((arg0 & 0xFF00) * local12 & 0xFF0000 | local12 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return (((arg1 & 0xFF00) * local17 & 0xFF0000 | local17 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local35;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIII)V")
	public static void method4743(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		@Pc(14) int local14 = -1;
		Static567.method8614(arg0 - arg1, arg0 + arg1, Static186.anIntArrayArray12[arg3], arg2);
		while (local9 > local7) {
			local14 += 2;
			local7++;
			local12 += local14;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(52) int[] local52 = Static186.anIntArrayArray12[arg3 + local9];
				@Pc(59) int[] local59 = Static186.anIntArrayArray12[arg3 - local9];
				@Pc(64) int local64 = arg0 + local7;
				@Pc(69) int local69 = arg0 - local7;
				Static567.method8614(local69, local64, local52, arg2);
				Static567.method8614(local69, local64, local59, arg2);
			}
			@Pc(85) int local85 = local9 + arg0;
			@Pc(90) int local90 = arg0 - local9;
			@Pc(96) int[] local96 = Static186.anIntArrayArray12[local7 + arg3];
			@Pc(103) int[] local103 = Static186.anIntArrayArray12[arg3 - local7];
			Static567.method8614(local90, local85, local96, arg2);
			Static567.method8614(local90, local85, local103, arg2);
		}
	}
}
