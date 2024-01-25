import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!em", name = "i", descriptor = "Lclient!f;")
	public static Class78 aClass78_5;

	@OriginalMember(owner = "client!em", name = "t", descriptor = "I")
	public static int anInt2717 = 104;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BIIIIII)V")
	public static void method2515(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static322.method5335(Static290.anInt5903, Static530.anInt9437, arg3);
		@Pc(17) int local17 = Static322.method5335(Static290.anInt5903, Static530.anInt9437, arg2);
		@Pc(23) int local23 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg4);
		@Pc(29) int local29 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg0);
		@Pc(37) int local37 = Static322.method5335(Static290.anInt5903, Static530.anInt9437, arg5 + arg3);
		@Pc(46) int local46 = Static322.method5335(Static290.anInt5903, Static530.anInt9437, arg2 - arg5);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static306.method5239(Static46.anIntArrayArray4[local48], local29, arg1, local23);
		}
		for (@Pc(68) int local68 = local17; local68 > local46; local68--) {
			Static306.method5239(Static46.anIntArrayArray4[local68], local29, arg1, local23);
		}
		@Pc(98) int local98 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg5 + arg4);
		@Pc(106) int local106 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg0 - arg5);
		for (@Pc(108) int local108 = local37; local108 <= local46; local108++) {
			@Pc(114) int[] local114 = Static46.anIntArrayArray4[local108];
			Static306.method5239(local114, local98, arg1, local23);
			Static306.method5239(local114, local29, arg1, local106);
		}
	}
}
