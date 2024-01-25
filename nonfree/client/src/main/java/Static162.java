import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!fia", name = "e", descriptor = "I")
	public static int anInt3285;

	@OriginalMember(owner = "client!fia", name = "g", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_68 = new Class200(3, 4);

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(IZ)V")
	public static void method2780(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static188.method3210(10, arg0);
		local8.method923();
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(IIIIIIB)I")
	public static int method2782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg2;
			arg2 = local6;
		}
		@Pc(18) int local18 = arg5 & 0x3;
		if (local18 == 0) {
			return arg1;
		} else if (local18 == 1) {
			return 8 - arg3 - arg4;
		} else if (local18 == 2) {
			return 1 + 7 - arg2 - arg1;
		} else {
			return arg4;
		}
	}
}
