import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "F")
	public static float aFloat154;

	@OriginalMember(owner = "client!mf", name = "C", descriptor = "F")
	public static float aFloat157;

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "Lclient!mea;")
	public static Class230 aClass230_7 = null;

	@OriginalMember(owner = "client!mf", name = "y", descriptor = "Lclient!tda;")
	public static final Class334 aClass334_7 = new Class334();

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!td;I)[Lclient!mm;")
	public static Class235[] method5487(@OriginalArg(0) Class333 arg0) {
		if (!arg0.method8144()) {
			return new Class235[0];
		}
		@Pc(18) Class150 local18 = arg0.method8137();
		while (local18.anInt4247 == 0) {
			Static20.method9254(10L);
		}
		if (local18.anInt4247 == 2) {
			return new Class235[0];
		}
		@Pc(39) int[] local39 = (int[]) local18.anObject8;
		@Pc(45) Class235[] local45 = new Class235[local39.length >> 2];
		for (@Pc(47) int local47 = 0; local47 < local45.length; local47++) {
			@Pc(53) Class235 local53 = new Class235();
			local45[local47] = local53;
			local53.anInt6838 = local39[local47 << 2];
			local53.anInt6833 = local39[(local47 << 2) + 1];
			local53.anInt6837 = local39[(local47 << 2) + 2];
			local53.anInt6834 = local39[(local47 << 2) + 3];
		}
		return local45;
	}
}
