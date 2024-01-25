import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!jd", name = "Jb", descriptor = "I")
	public static int anInt4566;

	@OriginalMember(owner = "client!jd", name = "Rb", descriptor = "Lclient!ga;")
	public static Class111 aClass111_50;

	@OriginalMember(owner = "client!jd", name = "Ob", descriptor = "Lclient!lg;")
	public static final Class201 aClass201_21 = new Class201(15, 0, 1, 0);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method3923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 + arg5 > arg4 && arg0 < arg4 + arg3) {
			return arg2 + arg7 > arg1 && arg2 < arg1 + arg6;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "(I)V")
	public static void method3926() {
		if (Static219.anInt4263 == -1) {
			return;
		}
		@Pc(11) int local11 = Static287.aClass256_8.method7558();
		@Pc(15) int local15 = Static287.aClass256_8.method7561();
		@Pc(20) Class1_Sub13 local20 = (Class1_Sub13) Static270.aClass361_55.method7854();
		if (local20 != null) {
			local11 = local20.method2536();
			local15 = local20.method2537();
		}
		Static332.method4981(0, 0, Static443.anInt7718, local15, Static219.anInt4263, 0, local11, 0, Static300.anInt5516);
		if (Static559.aClass365_16 != null) {
			Static415.method5819(local11, local15);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Z")
	public static boolean method3936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}
