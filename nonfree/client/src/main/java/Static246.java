import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
	public static int anInt5145 = 0;

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString187 = "Loaded textures";

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!ok;ILclient!ir;Lclient!vm;IILclient!nj;I)V")
	public static void method4246(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub20 arg2, @OriginalArg(3) Class92 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class139 arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg2.anInt3078 - arg6 / 2 - 5;
		@Pc(19) int local19 = arg4 + 2;
		if (arg5.anInt4382 != 0) {
			arg3.method4502(local19, arg6 + 10, local15, arg0.method3910() * arg1 + arg4 + 1 - local19, arg5.anInt4382);
		}
		if (arg5.anInt4364 != 0) {
			arg3.method4522(arg4 + arg0.method3910() * arg1 + 1 - local19, arg6 + 10, local15, local19, arg5.anInt4364);
		}
		@Pc(71) int local71 = arg5.anInt4378;
		if (arg2.aBoolean260 && arg5.anInt4363 != -1) {
			local71 = arg5.anInt4363;
		}
		for (@Pc(96) int local96 = 0; local96 < arg1; local96++) {
			@Pc(102) String local102 = Static344.aStringArray46[local96];
			if (arg1 - 1 > local96) {
				local102 = local102.substring(0, local102.length() - 4);
			}
			arg0.method3913(arg3, local102, arg2.anInt3078, arg4, local71);
			arg4 += arg0.method3910();
		}
	}
}
