import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "Lclient!jn;")
	public static Class176 aClass176_1;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "Lclient!qr;")
	public static final Class293 aClass293_59 = new Class293(30);

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray51 = new boolean[100];

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
	public static int anInt8636 = 0;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "Z")
	public static boolean aBoolean709 = false;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIBII)V")
	public static void method7431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = Static84.method1337(Static231.anInt3977, Static304.anInt4824, arg4);
		@Pc(21) int local21 = Static84.method1337(Static231.anInt3977, Static304.anInt4824, arg3);
		@Pc(27) int local27 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg2);
		@Pc(33) int local33 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg1);
		@Pc(41) int local41 = Static84.method1337(Static231.anInt3977, Static304.anInt4824, arg0 + arg4);
		@Pc(50) int local50 = Static84.method1337(Static231.anInt3977, Static304.anInt4824, arg3 - arg0);
		for (@Pc(52) int local52 = local15; local52 < local41; local52++) {
			Static260.method3979(arg5, local27, Static267.anIntArrayArray20[local52], local33);
		}
		for (@Pc(74) int local74 = local21; local74 > local50; local74--) {
			Static260.method3979(arg5, local27, Static267.anIntArrayArray20[local74], local33);
		}
		@Pc(98) int local98 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg2 + arg0);
		@Pc(106) int local106 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg1 - arg0);
		for (@Pc(108) int local108 = local41; local108 <= local50; local108++) {
			@Pc(114) int[] local114 = Static267.anIntArrayArray20[local108];
			Static260.method3979(arg5, local27, local114, local98);
			Static260.method3979(arg5, local106, local114, local33);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public static void method7432() {
		@Pc(10) Class5_Sub35 local10;
		for (local10 = (Class5_Sub35) Static404.aClass306_36.method7313(); local10 != null; local10 = (Class5_Sub35) Static404.aClass306_36.method7301()) {
			Static350.method5352(false, local10);
		}
		for (local10 = (Class5_Sub35) Static498.aClass306_55.method7313(); local10 != null; local10 = (Class5_Sub35) Static498.aClass306_55.method7301()) {
			Static350.method5352(true, local10);
		}
	}
}
