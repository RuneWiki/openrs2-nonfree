import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
	public static int anInt6388;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "Lclient!qha;")
	public static final Class291 aClass291_26 = new Class291(16);

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_65 = new Class387(33, 3);

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "[Lclient!ika;")
	public static final Class176[] aClass176Array1 = new Class176[37];

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIZII)V")
	public static void method5448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static83.method1286(Static456.anInt7815, Static604.anInt10083, arg4);
		@Pc(17) int local17 = Static83.method1286(Static456.anInt7815, Static604.anInt10083, arg0);
		@Pc(23) int local23 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg1);
		@Pc(29) int local29 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg2);
		for (@Pc(38) int local38 = local11; local38 <= local17; local38++) {
			Static646.method7025(Static569.anIntArrayArray54[local38], local23, local29, arg3);
		}
	}
}
