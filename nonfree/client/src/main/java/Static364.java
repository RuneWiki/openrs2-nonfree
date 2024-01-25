import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
	public static int anInt6029 = 0;

	@OriginalMember(owner = "client!sj", name = "N", descriptor = "I")
	public static int anInt6037 = 0;

	@OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
	public static int anInt6038 = 0;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public static void method4849(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class110 local8 = Static220.method2992(arg0, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray6 != null) {
			@Pc(18) Class4_Sub34 local18 = new Class4_Sub34();
			local18.anObjectArray34 = local8.anObjectArray6;
			local18.anInt4908 = arg3;
			local18.aClass110_14 = local8;
			local18.aString53 = arg1;
			Static80.method1289(local18);
		}
		if (Static8.anInt119 != 9) {
			return;
		}
		@Pc(39) boolean local39 = true;
		if (local8.anInt2638 != 0) {
			local39 = Static256.method3376(local8);
		}
		if (!local39 || !Static55.method752(local8).method2794(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static448.method5935(Static4.aClass146_6);
			Static45.method586(arg0, arg2, local8.anInt2588);
		}
		if (arg3 == 2) {
			Static448.method5935(Static436.aClass146_105);
			Static45.method586(arg0, arg2, local8.anInt2588);
		}
		if (arg3 == 3) {
			Static448.method5935(Static84.aClass146_69);
			Static45.method586(arg0, arg2, local8.anInt2588);
		}
		if (arg3 == 4) {
			Static448.method5935(Static193.aClass146_25);
			Static45.method586(arg0, arg2, local8.anInt2588);
		}
		if (arg3 == 5) {
			Static448.method5935(Static257.aClass146_61);
			Static45.method586(arg0, arg2, local8.anInt2588);
		}
		if (arg3 == 6) {
			Static448.method5935(Static15.aClass146_10);
			Static45.method586(arg0, arg2, local8.anInt2588);
		}
		if (arg3 == 7) {
			Static448.method5935(Static123.aClass146_38);
			Static45.method586(arg0, arg2, local8.anInt2588);
		}
		if (arg3 == 8) {
			Static448.method5935(Static349.aClass146_79);
			Static45.method586(arg0, arg2, local8.anInt2588);
		}
		if (arg3 == 9) {
			Static448.method5935(Static441.aClass146_107);
			Static45.method586(arg0, arg2, local8.anInt2588);
		}
		if (arg3 == 10) {
			Static448.method5935(Static164.aClass146_46);
			Static45.method586(arg0, arg2, local8.anInt2588);
		}
	}
}
