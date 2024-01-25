import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "Z")
	public static boolean aBoolean461;

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_82 = new Class376(87, -1);

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4997(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static599.method3045("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IBII)Lclient!uv;")
	public static Class23_Sub2_Sub1_Sub2 method4998(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class247 local11 = Static332.aClass247ArrayArrayArray1[arg1][arg0][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class23_Sub2_Sub1_Sub2 local17 = null;
		@Pc(28) int local28 = -1;
		for (@Pc(31) Class85 local31 = local11.aClass85_3; local31 != null; local31 = local31.aClass85_1) {
			@Pc(35) Class23_Sub2_Sub1 local35 = local31.aClass23_Sub2_Sub1_1;
			if (local35 instanceof Class23_Sub2_Sub1_Sub2) {
				@Pc(41) Class23_Sub2_Sub1_Sub2 local41 = (Class23_Sub2_Sub1_Sub2) local35;
				@Pc(51) int local51 = local41.method8625() * 256 + 252 - 256;
				@Pc(59) int local59 = local41.anInt10108 - local51 >> 9;
				@Pc(67) int local67 = local41.anInt10109 - local51 >> 9;
				@Pc(74) int local74 = local51 + local41.anInt10108 >> 9;
				@Pc(82) int local82 = local41.anInt10109 + local51 >> 9;
				if (arg0 >= local59 && local67 <= arg2 && local74 >= arg0 && local82 >= arg2) {
					@Pc(116) int local116 = (local74 + 1 - arg0) * (-arg2 + local82 - -1);
					if (local116 > local28) {
						local28 = local116;
						local17 = local41;
					}
				}
			}
		}
		return local17;
	}
}
