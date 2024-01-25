import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
	public static int anInt5352;

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
	public static int anInt5355;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_113 = new Class83(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
	public static int anInt5353 = 0;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIZZ)V")
	public static void method4107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static453.aLong223 = 0L;
		@Pc(13) int local13 = Static450.method5664();
		if (arg0 == 3 || local13 == 3) {
			arg3 = true;
		}
		if (!Static122.aClass19_16.method4245()) {
			arg3 = true;
		}
		Static292.method4020(arg0, local13, arg2, arg3, arg1);
	}
}
