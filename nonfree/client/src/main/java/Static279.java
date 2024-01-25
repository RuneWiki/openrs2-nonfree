import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!jg", name = "w", descriptor = "Z")
	public static boolean aBoolean636 = false;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII)V")
	public static void method7929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) Class14_Sub2_Sub9 local18 = Static499.method7527((long) arg2 | (long) arg3 << 32, 18);
		local18.method4004();
		local18.anInt4595 = arg1;
		local18.anInt4592 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
	public static void method7930() {
		Static515.anInt8875 = 0;
		Static511.anInt8867 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static117.anInt1906; local18++) {
			@Pc(24) int local24 = Static93.anInt1647 * local18;
			for (@Pc(26) int local26 = 0; local26 < Static93.anInt1647; local26++) {
				@Pc(32) int local32 = local26 + local24;
				Static276.anInterface22Array1[local32].method9218(Static599.anInt9885 * local26, local18 * Static611.anInt10061, Static599.anInt9885, Static611.anInt10061, true);
			}
		}
	}
}
