import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!lg", name = "V", descriptor = "[Z")
	public static boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!lg", name = "W", descriptor = "Lclient!gp;")
	public static Class131 aClass131_22;

	@OriginalMember(owner = "client!lg", name = "Q", descriptor = "Lclient!jq;")
	public static final Class189 aClass189_1 = Static608.method8556();

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;ILclient!td;I)Lclient!hu;")
	public static Class150 method5177(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class333 arg2) {
		return Static209.method3279(arg2, "openjs", arg0, arg1);
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)Lclient!qe;")
	public static Class14_Sub46 method5180() {
		if (Static498.aClass262_60 == null || Static263.aClass118_1 == null) {
			return null;
		}
		for (@Pc(21) Class14_Sub46 local21 = (Class14_Sub46) Static263.aClass118_1.method2832(); local21 != null; local21 = (Class14_Sub46) Static263.aClass118_1.method2832()) {
			@Pc(29) Class42 local29 = Static498.aClass116_4.method2783(local21.anInt8309);
			if (local29 != null && local29.aBoolean106 && local29.method1109(Static498.anInterface20_2)) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)I")
	public static int method5181(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local28 | local28 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)V")
	public static void method5182(@OriginalArg(1) boolean arg0) {
		for (@Pc(10) Class14_Sub31 local10 = (Class14_Sub31) Static40.aClass262_7.method6318(); local10 != null; local10 = (Class14_Sub31) Static40.aClass262_7.method6311()) {
			if (local10.aClass14_Sub5_Sub4_2 != null) {
				Static217.aClass14_Sub5_Sub3_1.method6029(local10.aClass14_Sub5_Sub4_2);
				local10.aClass14_Sub5_Sub4_2 = null;
			}
			if (local10.aClass14_Sub5_Sub4_3 != null) {
				Static217.aClass14_Sub5_Sub3_1.method6029(local10.aClass14_Sub5_Sub4_3);
				local10.aClass14_Sub5_Sub4_3 = null;
			}
			local10.method9315();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(49) Class14_Sub31 local49 = (Class14_Sub31) Static41.aClass262_5.method6318(); local49 != null; local49 = (Class14_Sub31) Static41.aClass262_5.method6311()) {
			if (local49.aClass14_Sub5_Sub4_2 != null) {
				Static217.aClass14_Sub5_Sub3_1.method6029(local49.aClass14_Sub5_Sub4_2);
				local49.aClass14_Sub5_Sub4_2 = null;
			}
			local49.method9315();
		}
		for (@Pc(76) Class14_Sub31 local76 = (Class14_Sub31) Static587.aClass187_83.method4079(); local76 != null; local76 = (Class14_Sub31) Static587.aClass187_83.method4084()) {
			if (local76.aClass14_Sub5_Sub4_2 != null) {
				Static217.aClass14_Sub5_Sub3_1.method6029(local76.aClass14_Sub5_Sub4_2);
				local76.aClass14_Sub5_Sub4_2 = null;
			}
			local76.method9315();
		}
	}
}
