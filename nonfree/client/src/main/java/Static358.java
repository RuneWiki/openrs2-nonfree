import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!mda", name = "o", descriptor = "I")
	public static int anInt6600;

	@OriginalMember(owner = "client!mda", name = "p", descriptor = "I")
	public static int anInt6601;

	@OriginalMember(owner = "client!mda", name = "y", descriptor = "I")
	public static int anInt6609;

	@OriginalMember(owner = "client!mda", name = "K", descriptor = "Lclient!gj;")
	public static Class124 aClass124_7;

	@OriginalMember(owner = "client!mda", name = "F", descriptor = "I")
	public static int anInt6615 = -1;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "([[[Lclient!cja;Z)V")
	public static void method5419(@OriginalArg(0) Class58[][][] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(19) Class58[][] local19 = arg0[local13];
			for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
				for (@Pc(25) int local25 = 0; local25 < local19[local21].length; local25++) {
					@Pc(33) Class58 local33 = local19[local21][local25];
					if (local33 != null) {
						if (local33.aClass12_Sub2_Sub4_1 instanceof Interface19) {
							((Interface19) local33.aClass12_Sub2_Sub4_1).method9176();
						}
						if (local33.aClass12_Sub2_Sub3_2 instanceof Interface19) {
							((Interface19) local33.aClass12_Sub2_Sub3_2).method9176();
						}
						if (local33.aClass12_Sub2_Sub3_1 instanceof Interface19) {
							((Interface19) local33.aClass12_Sub2_Sub3_1).method9176();
						}
						if (local33.aClass12_Sub2_Sub1_1 instanceof Interface19) {
							((Interface19) local33.aClass12_Sub2_Sub1_1).method9176();
						}
						if (local33.aClass12_Sub2_Sub1_2 instanceof Interface19) {
							((Interface19) local33.aClass12_Sub2_Sub1_2).method9176();
						}
						for (@Pc(83) Class43 local83 = local33.aClass43_4; local83 != null; local83 = local83.aClass43_3) {
							@Pc(88) Class12_Sub2_Sub2 local88 = local83.aClass12_Sub2_Sub2_1;
							if (local88 instanceof Interface19) {
								((Interface19) local88).method9176();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IBJZ)Ljava/lang/String;")
	public static String method5435(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		Static89.method1689(arg1);
		@Pc(10) Calendar local10 = Static170.aCalendar2;
		@Pc(21) int local21 = local10.get(5);
		@Pc(27) int local27 = local10.get(2) + 1;
		@Pc(31) int local31 = local10.get(1);
		@Pc(35) int local35 = local10.get(11);
		@Pc(47) int local47 = local10.get(12);
		return Integer.toString(local21 / 10) + local21 % 10 + "/" + local27 / 10 + local27 % 10 + "/" + local31 % 100 / 10 + local31 % 10 + " " + local35 / 10 + local35 % 10 + ":" + local47 / 10 + local47 % 10;
	}
}
