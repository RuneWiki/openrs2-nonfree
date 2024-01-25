import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_70 = new Class61(30, 3);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIII)V")
	public static void method4708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class125 local3 = new Class125();
		local3.anInt3708 = arg1 >> Static41.anInt810;
		local3.anInt3702 = arg2 >> Static41.anInt810;
		local3.anInt3694 = arg3 >> Static41.anInt810;
		local3.anInt3695 = arg4 >> Static41.anInt810;
		local3.anInt3698 = arg0;
		local3.anInt3696 = arg1;
		local3.anInt3701 = arg2;
		local3.anInt3693 = arg3;
		local3.anInt3706 = arg4;
		local3.anInt3707 = arg5;
		local3.anInt3704 = arg6;
		Static465.aClass125Array2[Static115.anInt2689++] = local3;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([BI)V")
	public static void method4710(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class4_Sub9 local13 = new Class4_Sub9(arg0);
		while (true) {
			@Pc(17) int local17 = local13.method6015();
			if (local17 == 0) {
				return;
			}
			if (local17 == 2) {
				Static385.anInt6801 = local13.method5982();
			}
		}
	}
}
