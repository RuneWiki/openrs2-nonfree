import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
	public static int anInt3569;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	public static int anInt3570;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "J")
	public static long aLong97;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	public static int anInt3571 = 0;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "[I")
	public static int[] anIntArray291 = new int[2];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII)V")
	public static void method3152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = Static84.method1337(Static231.anInt3977, Static304.anInt4824, arg3);
		@Pc(22) int local22 = Static84.method1337(Static231.anInt3977, Static304.anInt4824, arg0);
		@Pc(28) int local28 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg1);
		@Pc(34) int local34 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg2);
		for (@Pc(36) int local36 = local16; local36 <= local22; local36++) {
			Static260.method3979(arg4, local28, Static267.anIntArrayArray20[local36], local34);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Component;Z)Lclient!pg;")
	public static Class38 method3154(@OriginalArg(0) Component arg0) {
		return new Class38_Sub1(arg0);
	}
}
