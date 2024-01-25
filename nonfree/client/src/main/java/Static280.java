import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "Lclient!vv;")
	public static Class263 aClass263_128;

	@OriginalMember(owner = "client!nt", name = "m", descriptor = "Lclient!o;")
	public static Class137 aClass137_15;

	@OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
	public static int anInt5389 = 1;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "([BB)Lclient!gn;")
	public static Class1_Sub1_Sub9 method4118(@OriginalArg(0) byte[] arg0) {
		@Pc(7) Class1_Sub1_Sub9 local7 = new Class1_Sub1_Sub9();
		@Pc(12) Class1_Sub3 local12 = new Class1_Sub3(arg0);
		local12.anInt1710 = local12.aByteArray14.length - 2;
		@Pc(23) int local23 = local12.method1177();
		@Pc(33) int local33 = local12.aByteArray14.length - local23 - 12 - 2;
		local12.anInt1710 = local33;
		@Pc(47) int local47 = local12.method1188();
		local7.anInt3041 = local12.method1177();
		local7.anInt3040 = local12.method1177();
		local7.anInt3042 = local12.method1177();
		local7.anInt3043 = local12.method1177();
		@Pc(73) int local73 = local12.method1171();
		@Pc(84) int local84;
		@Pc(89) int local89;
		if (local73 > 0) {
			local7.aClass38Array1 = new Class38[local73];
			for (local84 = 0; local84 < local73; local84++) {
				local89 = local12.method1177();
				@Pc(96) Class38 local96 = new Class38(Static427.method5762(local89));
				local7.aClass38Array1[local84] = local96;
				while (local89-- > 0) {
					@Pc(106) int local106 = local12.method1188();
					@Pc(112) int local112 = local12.method1188();
					local96.method766(new Class1_Sub33(local112), (long) local106);
				}
			}
		}
		local12.anInt1710 = 0;
		local7.aString26 = local12.method1211();
		local7.anIntArray314 = new int[local47];
		local7.aStringArray22 = new String[local47];
		local7.anIntArray313 = new int[local47];
		local84 = 0;
		while (local33 > local12.anInt1710) {
			local89 = local12.method1177();
			if (local89 == 3) {
				local7.aStringArray22[local84] = local12.method1201().intern();
			} else if (local89 >= 100 || local89 == 21 || local89 == 38 || local89 == 39) {
				local7.anIntArray314[local84] = local12.method1171();
			} else {
				local7.anIntArray314[local84] = local12.method1188();
			}
			local7.anIntArray313[local84++] = local89;
		}
		return local7;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!pt;III)V")
	public static void method4119(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static457.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt1886 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass1_Sub4Array2[arg0.anInt1886++] = Static135.aClass75Array1[local21 - 1].aClass1_Sub4_2;
			local9 += 16L;
		}
		for (local21 = arg0.anInt1886; local21 < 4; local21++) {
			arg0.aClass1_Sub4Array2[local21] = null;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IBI)Z")
	public static boolean method4120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class192 local16 = Static455.aClass161_4.method3628(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local16.method4364(arg0);
	}
}
