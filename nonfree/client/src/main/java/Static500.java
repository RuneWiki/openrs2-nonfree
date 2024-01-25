import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!jn;")
	public static Class176 aClass176_119;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array18;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!oe;")
	public static final Class244 aClass244_57 = new Class244();

	@OriginalMember(owner = "client!td", name = "k", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray20 = new int[2][][];

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIB)V")
	public static void method7378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = Static322.method5335(Static290.anInt5903, Static530.anInt9437, arg1);
		@Pc(17) int local17 = Static322.method5335(Static290.anInt5903, Static530.anInt9437, arg4);
		@Pc(23) int local23 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg3);
		@Pc(29) int local29 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg2);
		for (@Pc(39) int local39 = local11; local39 <= local17; local39++) {
			Static306.method5239(Static46.anIntArrayArray4[local39], local29, arg0, local23);
		}
	}
}
