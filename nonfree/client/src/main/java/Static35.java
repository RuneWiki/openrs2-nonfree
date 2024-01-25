import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "Lclient!or;")
	public static Class182 aClass182_1;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "Lclient!di;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
	public static void method633() {
		@Pc(7) int local7 = Static335.anInt5738;
		@Pc(14) int[] local14 = Static242.anIntArray933;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class1_Sub5_Sub1_Sub1 local24 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local14[local16]];
			if (local24 != null) {
				Static158.method2855(local24.method5547(), local24);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!ae;)Lclient!ae;")
	public static Class4 method635(@OriginalArg(1) Class4 arg0) {
		@Pc(11) Class4 local11 = Static45.method774(arg0);
		if (local11 == null) {
			local11 = arg0.aClass4_1;
		}
		return local11;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BILclient!oj;ILclient!rn;IILclient!ae;)V")
	public static void method636(@OriginalArg(1) int arg0, @OriginalArg(2) Class165 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class18 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class4 arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(17) int local17;
		if (Static79.anInt4624 == 4) {
			local17 = (int) Static127.aFloat41 & 0x3FFF;
		} else {
			local17 = (int) Static127.aFloat41 + Static190.anInt3567 & 0x3FFF;
		}
		@Pc(36) int local36 = Math.max(arg6.anInt101 / 2, arg6.anInt113 / 2) + 10;
		@Pc(44) int local44 = arg4 * arg4 + arg0 * arg0;
		if (local44 > local36 * local36) {
			return;
		}
		@Pc(58) int local58 = Class177.anIntArray843[local17];
		@Pc(62) int local62 = Class177.anIntArray844[local17];
		if (Static79.anInt4624 != 4) {
			local62 = local62 * 256 / (Static30.anInt643 + 256);
			local58 = local58 * 256 / (Static30.anInt643 + 256);
		}
		@Pc(99) int local99 = arg0 * local62 + local58 * arg4 >> 15;
		@Pc(109) int local109 = arg4 * local62 - local58 * arg0 >> 15;
		arg3.method4559(arg5 + arg6.anInt101 / 2 + local99 - arg3.method4564() / 2, arg6.anInt113 / 2 + (arg2 + -local109 - arg3.method4560() / 2), arg1, arg5, arg2);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ae;ZI)V")
	public static void method640(@OriginalArg(0) Class4 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt68 == 0 ? arg0.anInt101 : arg0.anInt68;
		@Pc(27) int local27 = arg0.anInt72 == 0 ? arg0.anInt113 : arg0.anInt72;
		Static171.method3058(local27, local15, arg0.anInt94, arg1, Static183.aClass4ArrayArray1[arg0.anInt94 >> 16]);
		if (arg0.aClass4Array1 != null) {
			Static171.method3058(local27, local15, arg0.anInt94, arg1, arg0.aClass4Array1);
		}
		@Pc(60) Class2_Sub38 local60 = (Class2_Sub38) Static12.aClass246_2.method5613((long) arg0.anInt94);
		if (local60 != null) {
			Static97.method1939(local27, local15, local60.anInt4976, arg1);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V")
	public static void method641(@OriginalArg(0) int arg0) {
		if (!Static348.method5096(arg0)) {
			return;
		}
		@Pc(14) Class4[] local14 = Static183.aClass4ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(27) Class4 local27 = local14[local16];
			if (local27 != null) {
				local27.anInt105 = 1;
				local27.anInt85 = 0;
				local27.anInt117 = 0;
			}
		}
	}
}
