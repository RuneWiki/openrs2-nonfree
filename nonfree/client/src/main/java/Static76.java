import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "Lclient!gca;")
	public static Class120 aClass120_1;

	@OriginalMember(owner = "client!cja", name = "c", descriptor = "[I")
	public static int[] anIntArray127;

	@OriginalMember(owner = "client!cja", name = "d", descriptor = "Lclient!wia;")
	public static Class386 aClass386_18;

	@OriginalMember(owner = "client!cja", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString15 = "";

	@OriginalMember(owner = "client!cja", name = "g", descriptor = "I")
	public static int anInt1651 = 0;

	@OriginalMember(owner = "client!cja", name = "q", descriptor = "Lclient!rh;")
	public static final Class104 aClass104_1 = Static20.method9250();

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method1427(@OriginalArg(0) Class14_Sub3_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static576.aClass51Array3 == Static473.aClass51Array2) {
			return;
		}
		@Pc(10) int local10 = Static343.aClass51Array1[arg1].method7866(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class51 local23 = Static343.aClass51Array1[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method7866(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
