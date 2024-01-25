import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "I")
	public static volatile int anInt9357 = -1;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static502.anInt8456 <= arg4 && arg0 <= Static153.anInt2554 && Static55.anInt4238 <= arg1 && Static292.anInt4921 >= arg6) {
			Static512.method7263(arg5, arg2, arg6, arg0, arg4, arg3, arg1);
		} else {
			Static74.method1304(arg4, arg0, arg3, arg2, arg5, arg1, arg6);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIIII)V")
	public static void method7895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10 = Static228.anInt3894;
		if (local10 == 0) {
			return;
		}
		if (local10 == 1) {
			Static223.anInt3799 = arg1;
			Static644.anInt10400 = arg0;
			Static393.anInt6584 = arg3;
			Static673.anInt10778 = arg2;
			Static228.anInt3894 = 2;
		} else if (local10 == 2) {
			if (arg3 < Static393.anInt6584) {
				Static393.anInt6584 = arg3;
			}
			if (arg2 > Static673.anInt10778) {
				Static673.anInt10778 = arg2;
			}
			if (arg1 > Static223.anInt3799) {
				Static223.anInt3799 = arg1;
			}
			if (arg0 < Static644.anInt10400) {
				Static644.anInt10400 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BII)V")
	public static void method7896(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class6_Sub26 local20 = Static268.method3981(Static377.aClass15_2, Static547.aClass289_132);
		local20.aClass6_Sub23_Sub1_2.method8357(arg0);
		local20.aClass6_Sub23_Sub1_2.method8338(arg1);
		Static670.method9077(local20);
	}
}
