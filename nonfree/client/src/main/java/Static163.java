import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ka", name = "db", descriptor = "Lclient!cr;")
	public static final Class44 aClass44_1 = new Class44();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(CI)C")
	public static char method3093(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)Lclient!va;")
	public static Class7_Sub1_Sub20 method3108(@OriginalArg(1) int arg0) {
		@Pc(10) Class7_Sub1_Sub20 local10 = (Class7_Sub1_Sub20) Static100.aClass154_1.method4079((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static249.aClass180_16.method4560(arg0, 5);
		local10 = new Class7_Sub1_Sub20();
		if (local25 != null) {
			local10.method5264(new Class7_Sub3(local25));
		}
		Static100.aClass154_1.method4078(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IZ)V")
	public static void method3111(@OriginalArg(1) boolean arg0) {
		for (@Pc(13) Class7_Sub26 local13 = (Class7_Sub26) Static75.aClass74_7.method1793(); local13 != null; local13 = (Class7_Sub26) Static75.aClass74_7.method1798()) {
			if (local13.aClass7_Sub8_Sub4_1 != null) {
				Static134.aClass7_Sub8_Sub3_2.method3898(local13.aClass7_Sub8_Sub4_1);
				local13.aClass7_Sub8_Sub4_1 = null;
			}
			if (local13.aClass7_Sub8_Sub4_2 != null) {
				Static134.aClass7_Sub8_Sub3_2.method3898(local13.aClass7_Sub8_Sub4_2);
				local13.aClass7_Sub8_Sub4_2 = null;
			}
			local13.method5648();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(51) Class7_Sub26 local51 = (Class7_Sub26) Static45.aClass74_4.method1793(); local51 != null; local51 = (Class7_Sub26) Static45.aClass74_4.method1798()) {
			if (local51.aClass7_Sub8_Sub4_1 != null) {
				Static134.aClass7_Sub8_Sub3_2.method3898(local51.aClass7_Sub8_Sub4_1);
				local51.aClass7_Sub8_Sub4_1 = null;
			}
			local51.method5648();
		}
		for (@Pc(77) Class7_Sub26 local77 = (Class7_Sub26) Static141.aClass10_24.method157(); local77 != null; local77 = (Class7_Sub26) Static141.aClass10_24.method155()) {
			if (local77.aClass7_Sub8_Sub4_1 != null) {
				Static134.aClass7_Sub8_Sub3_2.method3898(local77.aClass7_Sub8_Sub4_1);
				local77.aClass7_Sub8_Sub4_1 = null;
			}
			local77.method5648();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3116(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static179.method3304(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILclient!gl;Lclient!gl;)V")
	public static void method3124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class22_Sub4 arg3, @OriginalArg(4) Class22_Sub4 arg4) {
		if (Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2] == null) {
			Static248.method4274(arg0, arg1, arg2);
		}
		Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2].aClass22_Sub4_1 = arg3;
		Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2].aClass22_Sub4_2 = arg4;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLclient!ap;)Lclient!cp;")
	public static Class43_Sub1 method3129(@OriginalArg(1) Class7_Sub3 arg0) {
		return new Class43_Sub1(arg0.method2744(), arg0.method2744(), arg0.method2744(), arg0.method2744(), arg0.method2791(), arg0.method2791(), arg0.method2772());
	}
}
