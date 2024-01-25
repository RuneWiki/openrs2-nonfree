import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "Lclient!td;")
	public static final Class233 aClass233_4 = new Class233("LIVE", 0);

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_176 = new Class12(60, 6);

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_177 = new Class12(99, 12);

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5679(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(12) Class1_Sub3 local12 = null;
		for (@Pc(19) Class1_Sub3 local19 = (Class1_Sub3) Static413.aClass227_43.method4967(); local19 != null; local19 = (Class1_Sub3) Static413.aClass227_43.method4973()) {
			if (local19.anInt127 == arg4 && arg0 == local19.anInt126 && arg2 == local19.anInt121 && local19.anInt125 == arg3) {
				local12 = local19;
				break;
			}
		}
		if (local12 == null) {
			local12 = new Class1_Sub3();
			local12.anInt125 = arg3;
			local12.anInt126 = arg0;
			local12.anInt121 = arg2;
			local12.anInt127 = arg4;
			if (arg0 >= 0 && arg2 >= 0 && arg0 < Static296.anInt5187 && Static206.anInt3607 > arg2) {
				Static416.method5408(local12);
			}
			Static413.aClass227_43.method4972(local12);
		}
		local12.anInt120 = -1;
		local12.anInt115 = arg5;
		local12.anInt124 = arg1;
		local12.anInt118 = 0;
		local12.anInt119 = arg6;
	}
}
