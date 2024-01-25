import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "Lclient!o;")
	public static Class49 aClass49_2;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIII)Lclient!bn;")
	public static Class24 method545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg4 * 986053L ^ (long) arg5 * 475427L ^ (long) arg0 * 97549L ^ (long) arg2 * 67481L ^ (long) arg3 * 32147369L ^ (long) arg1 * 76724863L;
		@Pc(39) Class24 local39 = (Class24) Static333.aClass44_52.method1028(local33);
		if (local39 == null) {
			local39 = Static348.aClass200_7.method5851(arg2, arg0, arg5, arg4, arg3, arg1);
			Static333.aClass44_52.method1017(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!fi;Lclient!fi;I)V")
	public static void method546(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class76 arg1) {
		Static288.method3576(Static284.aClass194_77);
		Static281.aClass5_Sub15_Sub2_13.method5550(arg0.anInt2100);
		Static281.aClass5_Sub15_Sub2_13.method5564(arg0.anInt2057);
		Static281.aClass5_Sub15_Sub2_13.method5564(arg1.anInt2115);
		Static281.aClass5_Sub15_Sub2_13.method5564(arg0.anInt2115);
		Static281.aClass5_Sub15_Sub2_13.method5580(arg1.anInt2100);
		Static281.aClass5_Sub15_Sub2_13.method5566(arg1.anInt2057);
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
	public static void method547() {
		Static400.aClass44_65.method1031();
		Static222.aClass44_33.method1031();
		Static304.aClass44_48.method1031();
		Static323.aClass44_51.method1031();
		Static445.aClass44_25.method1031();
	}
}
