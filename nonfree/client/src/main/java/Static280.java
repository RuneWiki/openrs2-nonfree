import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
	public static int anInt5602 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public static void method4294() {
		Static11.aClass31_1.method855();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)Lclient!ch;")
	public static Class25 method4295(@OriginalArg(0) int arg0) {
		@Pc(10) Class25 local10 = (Class25) Static257.aClass31_39.method852((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(35) byte[] local35 = Static187.aClass7_153.method253(Static169.method2560(arg0), Static174.method2633(arg0));
		local10 = new Class25();
		local10.anInt840 = arg0;
		if (local35 != null) {
			local10.method713(new Class1_Sub18(local35));
		}
		Static257.aClass31_39.method851(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!le;ILclient!qm;ILclient!qi;III)V")
	public static void method4296(@OriginalArg(0) Class104 arg0, @OriginalArg(2) Class6_Sub6_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub6_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(13) Class1_Sub6 local13 = new Class1_Sub6();
		local13.anInt1044 = arg2;
		local13.anInt1045 = arg4 * 128;
		local13.anInt1041 = arg5 * 128;
		if (arg0 != null) {
			local13.aClass104_1 = arg0;
			local13.anIntArray134 = arg0.anIntArray348;
			local13.anInt1037 = arg0.anInt2835;
			local13.anInt1040 = arg0.anInt2805;
			local13.anInt1047 = arg0.anInt2831 * 128;
			@Pc(52) int local52 = arg0.anInt2814;
			local13.anInt1046 = arg0.anInt2829;
			local13.anInt1048 = arg0.anInt2833;
			@Pc(63) int local63 = arg0.anInt2817;
			if (arg6 == 1 || arg6 == 3) {
				local52 = arg0.anInt2817;
				local63 = arg0.anInt2814;
			}
			local13.anInt1031 = (local52 + arg4) * 128;
			local13.anInt1039 = (arg5 + local63) * 128;
			if (arg0.anIntArray350 != null) {
				local13.aBoolean88 = true;
				local13.method842();
			}
			if (local13.anIntArray134 != null) {
				local13.anInt1049 = (int) ((double) (local13.anInt1037 - local13.anInt1040) * Math.random()) + local13.anInt1040;
			}
			Static261.aClass69_26.method1628(local13);
		} else if (arg3 != null) {
			local13.aClass6_Sub6_Sub1_1 = arg3;
			@Pc(133) Class19 local133 = arg3.aClass19_1;
			if (local133.anIntArray67 != null) {
				local13.aBoolean88 = true;
				local133 = local133.method507();
			}
			if (local133 != null) {
				local13.anInt1039 = (arg5 + local133.anInt629) * 128;
				local13.anInt1031 = (arg4 + local133.anInt629) * 128;
				local13.anInt1048 = Static2.method57(arg3);
				local13.anInt1047 = local133.anInt665 * 128;
				local13.anInt1046 = local133.anInt667;
			}
			Static196.aClass69_22.method1628(local13);
		} else if (arg1 != null) {
			local13.aClass6_Sub6_Sub2_2 = arg1;
			local13.anInt1031 = (arg1.method3509() + arg4) * 128;
			local13.anInt1039 = (arg1.method3509() + arg5) * 128;
			local13.anInt1048 = Static184.method2764(arg1);
			local13.anInt1046 = arg1.anInt4604;
			local13.anInt1047 = arg1.anInt4609 * 128;
			Static94.aClass22_10.method643(Static136.method2158(arg1.aString147), local13);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static void method4297() {
		@Pc(12) boolean local12 = false;
		while (!local12) {
			local12 = true;
			for (@Pc(18) int local18 = 0; local18 < Static29.anInt626 - 1; local18++) {
				if (Static276.aShortArray92[local18] < 1000 && Static276.aShortArray92[local18 + 1] > 1000) {
					local12 = false;
					@Pc(47) String local47 = Static190.aStringArray19[local18];
					Static190.aStringArray19[local18] = Static190.aStringArray19[local18 + 1];
					Static190.aStringArray19[local18 + 1] = local47;
					@Pc(65) String local65 = Static277.aStringArray35[local18];
					Static277.aStringArray35[local18] = Static277.aStringArray35[local18 + 1];
					Static277.aStringArray35[local18 + 1] = local65;
					@Pc(83) int local83 = Static55.anIntArray140[local18];
					Static55.anIntArray140[local18] = Static55.anIntArray140[local18 + 1];
					Static55.anIntArray140[local18 + 1] = local83;
					@Pc(101) int local101 = Static221.anIntArray522[local18];
					Static221.anIntArray522[local18] = Static221.anIntArray522[local18 + 1];
					Static221.anIntArray522[local18 + 1] = local101;
					@Pc(119) int local119 = Static64.anIntArray148[local18];
					Static64.anIntArray148[local18] = Static64.anIntArray148[local18 + 1];
					Static64.anIntArray148[local18 + 1] = local119;
					@Pc(137) short local137 = Static276.aShortArray92[local18];
					Static276.aShortArray92[local18] = Static276.aShortArray92[local18 + 1];
					Static276.aShortArray92[local18 + 1] = local137;
					@Pc(155) long local155 = Static128.aLongArray6[local18];
					Static128.aLongArray6[local18] = Static128.aLongArray6[local18 + 1];
					Static128.aLongArray6[local18 + 1] = local155;
				}
			}
		}
	}
}
