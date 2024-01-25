import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!eda", name = "p", descriptor = "I")
	public static int anInt9241;

	@OriginalMember(owner = "client!eda", name = "s", descriptor = "I")
	public static int anInt9244;

	@OriginalMember(owner = "client!eda", name = "w", descriptor = "I")
	public static int anInt9247;

	@OriginalMember(owner = "client!eda", name = "h", descriptor = "Lclient!ofa;")
	public static final Class244 aClass244_4 = new Class244("RC", 1);

	@OriginalMember(owner = "client!eda", name = "r", descriptor = "I")
	public static int anInt9243 = -1;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIIII)V")
	public static void method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static472.anInt6105 <= arg2 && arg2 <= Static202.anInt4720) {
			@Pc(19) int local19 = Static429.method6586(arg1, Static583.anInt9761, Static246.anInt5506);
			@Pc(27) int local27 = Static429.method6586(arg3, Static583.anInt9761, Static246.anInt5506);
			Static121.method5579(local19, arg0, local27, arg2);
		}
	}
}
