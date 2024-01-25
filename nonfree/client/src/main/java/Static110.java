import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
	public static int anInt9533;

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
	public static int anInt9538;

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "I")
	public static int anInt9539;

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
	public static int anInt9536 = -1;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)[I")
	public static int[] method8138(@OriginalArg(0) int arg0) {
		@Pc(6) int[] local6 = new int[3];
		Static573.method7712(Static262.method4271(arg0));
		local6[0] = Static462.aCalendar4.get(5);
		local6[1] = Static462.aCalendar4.get(2);
		local6[2] = Static462.aCalendar4.get(1);
		return local6;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "()V")
	public static void method8139() {
		for (@Pc(1) int local1 = 0; local1 < Static107.anInt1735; local1++) {
			@Pc(6) Class4_Sub1_Sub1 local6 = Static414.aClass4_Sub1_Sub1Array1[local1];
			Static314.method4822(local6, true);
			Static414.aClass4_Sub1_Sub1Array1[local1] = null;
		}
		Static107.anInt1735 = 0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
	public static void method8140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class4_Sub7 local7 = new Class4_Sub7();
		local7.anInt6928 = arg3;
		local7.anInt6934 = Static565.anInt8921 + arg0;
		local7.anInt6935 = arg6;
		local7.aString81 = arg5;
		local7.anInt6932 = arg2;
		local7.anInt6930 = arg4;
		local7.anInt6929 = arg1;
		Static151.aClass387_2.method9017(local7);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method8141(@OriginalArg(1) String arg0) {
		if (arg0.equals("")) {
			return;
		}
		@Pc(16) Class389 local16 = Static120.method1769(false);
		@Pc(22) Class5_Sub41 local22 = Static647.method8905(Static456.aClass381_196, local16.aClass393_2);
		local22.aClass5_Sub36_Sub2_1.method7324(Static271.method4453(arg0));
		local22.aClass5_Sub36_Sub2_1.method7327(arg0);
		local16.method9079(local22);
	}
}
