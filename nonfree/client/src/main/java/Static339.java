import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!vg", name = "u", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
	public static int anInt6804;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BIIII)V", line = 9)
	public static void method6104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Class25_Sub1.anInt675 <= arg1 - arg3 && arg3 + arg1 <= Class61.anInt1835 && arg2 - arg3 >= Class2_Sub40.anInt6819 && Class2_Sub20.anInt2951 >= arg2 + arg3) {
			Static205.method3871(arg3, arg2, arg0, arg1);
		} else {
			Static213.method4013(arg3, arg1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZII[Lclient!nk;ZI)V", line = 49)
	public static void method6106(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class161[] arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) Class161 local9 = arg3[local3];
			if (local9 != null && arg2 == local9.anInt4268) {
				Static346.method6257(arg1, arg4, arg0, local9);
				Static264.method4940(local9, arg4, arg1);
				if (local9.anInt4274 - local9.anInt4242 < local9.anInt4252) {
					local9.anInt4252 = local9.anInt4274 - local9.anInt4242;
				}
				if (local9.anInt4252 < 0) {
					local9.anInt4252 = 0;
				}
				if (local9.anInt4253 > local9.anInt4260 - local9.anInt4255) {
					local9.anInt4253 = local9.anInt4260 - local9.anInt4255;
				}
				if (local9.anInt4253 < 0) {
					local9.anInt4253 = 0;
				}
				if (local9.anInt4265 == 0) {
					Static81.method1913(arg0, local9);
				}
			}
		}
	}
}
