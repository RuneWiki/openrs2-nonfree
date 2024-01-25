import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array7;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_49 = new Class83("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BII)Z")
	public static boolean method2260(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class202 local13 = Static267.aClass262_2.method5560(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local13.method4590(arg1);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
	public static void method2262() {
		if (Static195.anInt3719 != -1) {
			Static231.method3474(-1, -1, Static195.anInt3719, false);
			Static195.anInt3719 = -1;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILclient!rs;Lclient!lh;IIILclient!rd;)V")
	public static void method2264(@OriginalArg(0) int arg0, @OriginalArg(2) Class16_Sub1_Sub5_Sub2 arg1, @OriginalArg(3) Class16_Sub1_Sub5_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class202 arg6) {
		@Pc(7) Class4_Sub8 local7 = new Class4_Sub8();
		local7.anInt614 = arg0 << 7;
		local7.anInt619 = arg5;
		local7.anInt613 = arg3 << 7;
		if (arg6 != null) {
			local7.aClass202_1 = arg6;
			@Pc(145) int local145 = arg6.anInt5816;
			@Pc(148) int local148 = arg6.anInt5801;
			if (arg4 == 1 || arg4 == 3) {
				local145 = arg6.anInt5801;
				local148 = arg6.anInt5816;
			}
			local7.anInt620 = arg6.anInt5806;
			local7.anInt622 = arg6.anInt5843;
			local7.anInt612 = arg3 + local148 << 7;
			local7.anIntArray37 = arg6.anIntArray406;
			local7.anInt615 = local145 + arg0 << 7;
			local7.anInt616 = arg6.anInt5821;
			local7.anInt611 = arg6.anInt5849 << 7;
			local7.anInt623 = arg6.anInt5844;
			if (arg6.anIntArray407 != null) {
				local7.aBoolean66 = true;
				local7.method638();
			}
			if (local7.anIntArray37 != null) {
				local7.anInt618 = local7.anInt623 + (int) ((double) (local7.anInt622 - local7.anInt623) * Math.random());
			}
			Static281.aClass183_34.method4137(local7);
			return;
		}
		if (arg1 != null) {
			local7.aClass16_Sub1_Sub5_Sub2_1 = arg1;
			@Pc(42) Class264 local42 = arg1.aClass264_1;
			if (local42.anIntArray544 != null) {
				local7.aBoolean66 = true;
				local42 = local42.method5574(Static257.aClass114_1);
			}
			if (local42 != null) {
				local7.anInt615 = arg0 + local42.anInt7201 << 7;
				local7.anInt612 = arg3 + local42.anInt7201 << 7;
				local7.anInt616 = Static325.method4392(arg1);
				local7.anInt611 = local42.anInt7238 << 7;
				local7.anInt620 = local42.anInt7235;
			}
			Static143.aClass183_20.method4137(local7);
			return;
		}
		if (arg2 == null) {
			return;
		}
		local7.aClass16_Sub1_Sub5_Sub1_2 = arg2;
		local7.anInt615 = arg2.method4751() + arg0 << 7;
		local7.anInt612 = arg2.method4751() + arg3 << 7;
		local7.anInt616 = Static33.method631(arg2);
		local7.anInt620 = arg2.anInt4348;
		local7.anInt611 = arg2.anInt4334 << 7;
		Static341.aClass102_38.method2703((long) arg2.anInt6037, local7);
		return;
	}
}
