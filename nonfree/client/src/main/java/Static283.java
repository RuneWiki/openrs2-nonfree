import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "Lclient!jga;")
	public static Class14_Sub3_Sub11 aClass14_Sub3_Sub11_2;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
	public static int anInt4862;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "F")
	public static float aFloat102;

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_32 = new Class264(4);

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
	public static int anInt4863 = 0;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
	public static int anInt4865 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLclient!so;)Lclient!k;")
	public static Class86_Sub3 method4062(@OriginalArg(1) Class14_Sub29 arg0) {
		return new Class86_Sub3(arg0.method5890(), arg0.method5890(), arg0.method5890(), arg0.method5890(), arg0.method5862(), arg0.method5862(), arg0.method5866());
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BIIII)V")
	public static void method4064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static468.anInt355 && Static370.anInt10475 >= arg3) {
			@Pc(15) int local15 = Static258.method3697(arg0, Static575.anInt9879, Static313.anInt9045);
			@Pc(21) int local21 = Static258.method3697(arg1, Static575.anInt9879, Static313.anInt9045);
			Static130.method2121(arg2, local21, local15, arg3);
		}
	}
}
