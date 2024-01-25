import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "Lclient!ija;")
	public static Class5_Sub30 aClass5_Sub30_1;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!kh;Lclient!kh;)V")
	public static void method8008(@OriginalArg(1) Class5_Sub3 arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg1.aClass5_Sub3_67 != null) {
			arg1.method8687();
		}
		arg1.aClass5_Sub3_66 = arg0;
		arg1.aClass5_Sub3_67 = arg0.aClass5_Sub3_67;
		arg1.aClass5_Sub3_67.aClass5_Sub3_66 = arg1;
		arg1.aClass5_Sub3_66.aClass5_Sub3_67 = arg1;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)Lclient!uk;")
	public static Class353 method8010(@OriginalArg(0) int arg0) {
		@Pc(15) Class353 local15 = (Class353) Static224.aClass340_23.method7999((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static496.aClass390_96.method8914(0, arg0);
		local15 = new Class353();
		if (local25 != null) {
			local15.method8271(arg0, new Class5_Sub41(local25));
		}
		Static224.aClass340_23.method7986((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BJ)V")
	public static void method8011(@OriginalArg(1) long arg0) {
		if (Static635.aClass226ArrayArrayArray3 != null) {
			if (Static660.anInt10605 == 1 || Static660.anInt10605 == 5) {
				Static460.method6583(arg0);
			} else if (Static660.anInt10605 == 4) {
				Static52.method697(arg0);
			}
		}
		Static506.method7238(Static208.aClass65_7, (long) Static26.anInt350);
		if (Static84.anInt2018 != -1) {
			Static368.method5563(Static84.anInt2018);
		}
		for (@Pc(41) int local41 = 0; local41 < Static168.anInt3361; local41++) {
			if (Static57.aBooleanArray2[local41]) {
				Static208.aBooleanArray18[local41] = true;
			}
			Static19.aBooleanArray1[local41] = Static57.aBooleanArray2[local41];
			Static57.aBooleanArray2[local41] = false;
		}
		Static145.anInt2974 = Static26.anInt350;
		Static125.method2266(-1, -1, (Class345) null);
		Static269.method4158(-1, (Class345) null, -1);
		if (Static84.anInt2018 != -1) {
			Static168.anInt3361 = 0;
			Static324.method8034();
		}
		Static208.aClass65_7.la();
		Static653.method8764(Static208.aClass65_7);
		@Pc(101) int local101 = Static574.method7929();
		if (local101 == -1) {
			local101 = Static105.anInt2256;
		}
		if (local101 == -1) {
			local101 = Static314.anInt5964;
		}
		Static180.method2994(local101);
		@Pc(122) int local122 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.method4599() << 8;
		Static51.method645(Static290.anInt5659, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145, local122 + Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781, local122 + Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784);
		Static290.anInt5659 = 0;
	}
}
