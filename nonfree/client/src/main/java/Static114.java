import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "Lclient!ir;")
	public static Class156 aClass156_2;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "Lclient!oa;")
	public static Class9 aClass9_5;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "[Lclient!xa;")
	public static Class66[] aClass66Array3;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Lclient!lu;")
	public static final Class207 aClass207_4 = new Class207();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)V")
	public static void method2310(@OriginalArg(1) int arg0) {
		@Pc(14) Class6_Sub4_Sub6 local14 = Static68.method1408(7, arg0);
		local14.method3828();
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V")
	public static void method2311() {
		@Pc(1) Class245 local1 = Static428.aClass245_59;
		synchronized (Static428.aClass245_59) {
			Static428.aClass245_59.method6079();
		}
		local1 = Static180.aClass245_33;
		synchronized (Static180.aClass245_33) {
			Static180.aClass245_33.method6079();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BZ)V")
	public static void method2312(@OriginalArg(1) boolean arg0) {
		for (@Pc(14) Class6_Sub2 local14 = (Class6_Sub2) Static284.aClass211_39.method5183(); local14 != null; local14 = (Class6_Sub2) Static284.aClass211_39.method5177()) {
			if (local14.aClass6_Sub10_Sub2_1 != null) {
				Static35.aClass6_Sub10_Sub3_1.method4742(local14.aClass6_Sub10_Sub2_1);
				local14.aClass6_Sub10_Sub2_1 = null;
			}
			if (local14.aClass6_Sub10_Sub2_2 != null) {
				Static35.aClass6_Sub10_Sub3_1.method4742(local14.aClass6_Sub10_Sub2_2);
				local14.aClass6_Sub10_Sub2_2 = null;
			}
			local14.method8151();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(57) Class6_Sub2 local57 = (Class6_Sub2) Static299.aClass211_43.method5183(); local57 != null; local57 = (Class6_Sub2) Static299.aClass211_43.method5177()) {
			if (local57.aClass6_Sub10_Sub2_1 != null) {
				Static35.aClass6_Sub10_Sub3_1.method4742(local57.aClass6_Sub10_Sub2_1);
				local57.aClass6_Sub10_Sub2_1 = null;
			}
			local57.method8151();
		}
		for (@Pc(84) Class6_Sub2 local84 = (Class6_Sub2) Static580.aClass305_42.method7445(); local84 != null; local84 = (Class6_Sub2) Static580.aClass305_42.method7449()) {
			if (local84.aClass6_Sub10_Sub2_1 != null) {
				Static35.aClass6_Sub10_Sub3_1.method4742(local84.aClass6_Sub10_Sub2_1);
				local84.aClass6_Sub10_Sub2_1 = null;
			}
			local84.method8151();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[BLjava/lang/String;)I")
	public static int method2313(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg2.length();
		for (@Pc(18) int local18 = 0; local18 < local10; local18 += 4) {
			@Pc(26) int local26 = Static200.method3766(arg2.charAt(local18));
			@Pc(45) int local45 = local10 <= local18 + 1 ? -1 : Static200.method3766(arg2.charAt(local18 + 1));
			@Pc(60) int local60 = local10 > local18 + 2 ? Static200.method3766(arg2.charAt(local18 + 2)) : -1;
			@Pc(75) int local75 = local10 > local18 + 3 ? Static200.method3766(arg2.charAt(local18 + 3)) : -1;
			arg1[arg0++] = (byte) (local45 >>> 4 | local26 << 2);
			if (local60 == -1) {
				break;
			}
			arg1[arg0++] = (byte) ((local45 & 0xF) << 4 | local60 >>> 2);
			if (local75 == -1) {
				break;
			}
			arg1[arg0++] = (byte) ((local60 & 0x3) << 6 | local75);
		}
		return arg0;
	}
}
