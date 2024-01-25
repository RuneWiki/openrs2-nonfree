import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!ju", name = "k", descriptor = "Z")
	public static boolean aBoolean270;

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "Lclient!s;")
	public static final Class217 aClass217_89 = new Class217(29, 1);

	@OriginalMember(owner = "client!ju", name = "j", descriptor = "I")
	public static int anInt4031 = 0;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIII)Z")
	public static boolean method3199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static305.method4247(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static286.anInt5018;
			@Pc(14) int local14 = arg2 << Static286.anInt5018;
			return Static330.method1920(local10 + 1, Static332.aClass154Array3[arg0].ua(arg1, arg2) + arg3, local14 + 1) && Static330.method1920(local10 + Static335.anInt5671 - 1, Static332.aClass154Array3[arg0].ua(arg1 + 1, arg2) + arg3, local14 + 1) && Static330.method1920(local10 + Static335.anInt5671 - 1, Static332.aClass154Array3[arg0].ua(arg1 + 1, arg2 + 1) + arg3, local14 + Static335.anInt5671 - 1) && Static330.method1920(local10 + 1, Static332.aClass154Array3[arg0].ua(arg1, arg2 + 1) + arg3, local14 + Static335.anInt5671 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZLjava/lang/String;I)I")
	public static int method3203(@OriginalArg(1) String arg0) {
		return Static430.method5707(arg0, 16);
	}
}
