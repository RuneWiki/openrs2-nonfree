import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "[I")
	public static int[] anIntArray179;

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "[[[Lclient!vf;")
	public static Class346[][][] aClass346ArrayArrayArray1;

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "Z")
	public static boolean aBoolean240 = false;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(FFBF)I")
	public static int method2406(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(26) float local26 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local26 > local17 && local35 < local26) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local26 < local35) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLclient!es;)Lclient!mca;")
	public static Class2_Sub2 method2407(@OriginalArg(1) Class2_Sub15 arg0) {
		arg0.method4325();
		@Pc(15) int local15 = arg0.method4325();
		@Pc(26) Class2_Sub2 local26 = Static429.method6121(local15);
		local26.anInt9552 = arg0.method4325();
		@Pc(35) int local35 = arg0.method4325();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(45) int local45 = arg0.method4325();
			local26.method7949(arg0, local45);
		}
		local26.method7948();
		return local26;
	}
}
