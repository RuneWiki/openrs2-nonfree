import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!nq", name = "A", descriptor = "Lclient!cd;")
	public static Class12 aClass12_2;

	@OriginalMember(owner = "client!nq", name = "u", descriptor = "Lclient!fha;")
	public static final Class109 aClass109_38 = new Class109();

	@OriginalMember(owner = "client!nq", name = "x", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_83 = new Class179(19, 8);

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIII)V")
	public static void method5163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg3; local3 <= arg2; local3++) {
			Static134.method1841(Static543.anIntArrayArray57[local3], arg4, arg0, arg1);
		}
	}
}
