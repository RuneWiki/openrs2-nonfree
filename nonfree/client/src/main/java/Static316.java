import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "I")
	public static int anInt5409;

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "Lclient!wt;")
	public static Class1_Sub51 aClass1_Sub51_4;

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "[I")
	public static final int[] anIntArray424 = new int[4];

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(III)Lclient!sj;")
	public static Class8_Sub3_Sub5 method4382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class39 local7 = Static292.aClass39ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class8_Sub3_Sub5 local14 = local7.aClass8_Sub3_Sub5_1;
			local7.aClass8_Sub3_Sub5_1 = null;
			Static395.method5455(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)I")
	public static int method4384() {
		return 46;
	}
}
