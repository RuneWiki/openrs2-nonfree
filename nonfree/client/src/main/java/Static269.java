import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "Lclient!g;")
	public static Class83 aClass83_92;

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "Lclient!aj;")
	public static Class10 aClass10_2;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_75 = new Class183(63, 2);

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "Lclient!vf;")
	public static final Class238 aClass238_30 = new Class238();

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
	public static int anInt5104 = 0;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V")
	public static void method4567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg1 * Static228.anInt4592 >> 8;
		if (arg0 == -1 && !Static361.aBoolean293) {
			Static234.method4210();
		} else if (arg0 != -1 && (Static42.anInt732 != arg0 || !Static176.method3281()) && local13 != 0 && !Static361.aBoolean293) {
			Static379.method5969(local13, arg0, Static279.aClass83_95);
		}
		Static42.anInt732 = arg0;
	}
}
