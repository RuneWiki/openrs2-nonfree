import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!kt", name = "O", descriptor = "I")
	public static int anInt10292;

	@OriginalMember(owner = "client!kt", name = "F", descriptor = "Lclient!uf;")
	public static final Class328 aClass328_5 = new Class328();

	@OriginalMember(owner = "client!kt", name = "N", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray73 = new String[5];

	@OriginalMember(owner = "client!kt", name = "P", descriptor = "Lclient!sq;")
	public static final Class307 aClass307_15 = new Class307(3, 2);

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = Static322.method5335(Static290.anInt5903, Static530.anInt9437, arg5);
		@Pc(21) int local21 = Static322.method5335(Static290.anInt5903, Static530.anInt9437, arg6);
		@Pc(27) int local27 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg3);
		@Pc(33) int local33 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg1);
		@Pc(41) int local41 = Static322.method5335(Static290.anInt5903, Static530.anInt9437, arg5 + arg4);
		@Pc(50) int local50 = Static322.method5335(Static290.anInt5903, Static530.anInt9437, arg6 - arg4);
		for (@Pc(52) int local52 = local15; local52 < local41; local52++) {
			Static306.method5239(Static46.anIntArrayArray4[local52], local33, arg0, local27);
		}
		for (@Pc(74) int local74 = local21; local74 > local50; local74--) {
			Static306.method5239(Static46.anIntArrayArray4[local74], local33, arg0, local27);
		}
		@Pc(96) int local96 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg4 + arg3);
		@Pc(105) int local105 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg1 - arg4);
		for (@Pc(107) int local107 = local41; local107 <= local50; local107++) {
			@Pc(113) int[] local113 = Static46.anIntArrayArray4[local107];
			Static306.method5239(local113, local96, arg0, local27);
			Static306.method5239(local113, local105, arg2, local96);
			Static306.method5239(local113, local33, arg0, local105);
		}
	}
}
