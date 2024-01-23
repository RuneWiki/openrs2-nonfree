import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
	public static int anInt3652;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	public static int anInt3654;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
	public static int anInt3655;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public static int anInt3657 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(CZILjava/lang/StringBuffer;)Ljava/lang/StringBuffer;")
	public static StringBuffer method2932(@OriginalArg(3) StringBuffer arg0) {
		@Pc(8) int local8 = arg0.length();
		arg0.setLength(0);
		for (@Pc(22) int local22 = local8; local22 < 0; local22++) {
			arg0.setCharAt(local22, ' ');
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public static void method2934() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) int local13 = 0; local13 < 104; local13++) {
			for (@Pc(20) int local20 = 0; local20 < 104; local20++) {
				if (Static239.method3685(local7, local13, Static74.aClass1_Sub26ArrayArrayArray1, local20, true)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!km;I)Lclient!b;")
	public static Class1_Sub6 method2936(@OriginalArg(1) Class91 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method2488(arg1);
		return local9 == null ? null : new Class1_Sub6(local9);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V")
	public static void method2939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class1_Sub8 local6;
		for (local6 = (Class1_Sub8) Static185.aClass61_20.method1835(); local6 != null; local6 = (Class1_Sub8) Static185.aClass61_20.method1836()) {
			Static17.method3924(arg1, arg0, arg2, local6, arg3);
		}
		@Pc(32) byte local32;
		@Pc(39) Class164 local39;
		@Pc(134) int local134;
		for (local6 = (Class1_Sub8) Static264.aClass61_28.method1835(); local6 != null; local6 = (Class1_Sub8) Static264.aClass61_28.method1836()) {
			local32 = 1;
			local39 = local6.aClass14_Sub2_Sub2_1.method3650();
			if (local39.anInt5190 == local6.aClass14_Sub2_Sub2_1.anInt4658) {
				local32 = 0;
			} else if (local39.anInt5207 == local6.aClass14_Sub2_Sub2_1.anInt4658 || local39.anInt5215 == local6.aClass14_Sub2_Sub2_1.anInt4658 || local39.anInt5205 == local6.aClass14_Sub2_Sub2_1.anInt4658 || local39.anInt5222 == local6.aClass14_Sub2_Sub2_1.anInt4658) {
				local32 = 2;
			} else if (local39.anInt5221 == local6.aClass14_Sub2_Sub2_1.anInt4658 || local39.anInt5192 == local6.aClass14_Sub2_Sub2_1.anInt4658 || local6.aClass14_Sub2_Sub2_1.anInt4658 == local39.anInt5195 || local6.aClass14_Sub2_Sub2_1.anInt4658 == local39.anInt5209) {
				local32 = 3;
			}
			if (local6.anInt354 != local32) {
				local134 = Static207.method3769(local6.aClass14_Sub2_Sub2_1);
				if (local134 != local6.anInt364) {
					if (local6.aClass1_Sub5_Sub1_1 != null) {
						Static141.aClass1_Sub5_Sub4_1.method4380(local6.aClass1_Sub5_Sub1_1);
						local6.aClass1_Sub5_Sub1_1 = null;
					}
					local6.anInt364 = local134;
				}
				local6.anInt354 = local32;
			}
			local6.anInt359 = local6.aClass14_Sub2_Sub2_1.anInt4680;
			local6.anInt356 = local6.aClass14_Sub2_Sub2_1.anInt4680 + local6.aClass14_Sub2_Sub2_1.method3656() * 64;
			local6.anInt358 = local6.aClass14_Sub2_Sub2_1.anInt4630;
			local6.anInt363 = local6.aClass14_Sub2_Sub2_1.anInt4630 + local6.aClass14_Sub2_Sub2_1.method3656() * 64;
			Static17.method3924(arg1, arg0, arg2, local6, arg3);
		}
		for (local6 = (Class1_Sub8) Static179.aClass70_12.method2074(); local6 != null; local6 = (Class1_Sub8) Static179.aClass70_12.method2079()) {
			local39 = local6.aClass14_Sub2_Sub1_1.method3650();
			local32 = 1;
			if (local39.anInt5190 == local6.aClass14_Sub2_Sub1_1.anInt4658) {
				local32 = 0;
			} else if (local6.aClass14_Sub2_Sub1_1.anInt4658 == local39.anInt5207 || local6.aClass14_Sub2_Sub1_1.anInt4658 == local39.anInt5215 || local6.aClass14_Sub2_Sub1_1.anInt4658 == local39.anInt5205 || local6.aClass14_Sub2_Sub1_1.anInt4658 == local39.anInt5222) {
				local32 = 2;
			} else if (local6.aClass14_Sub2_Sub1_1.anInt4658 == local39.anInt5221 || local39.anInt5192 == local6.aClass14_Sub2_Sub1_1.anInt4658 || local39.anInt5195 == local6.aClass14_Sub2_Sub1_1.anInt4658 || local39.anInt5209 == local6.aClass14_Sub2_Sub1_1.anInt4658) {
				local32 = 3;
			}
			if (local6.anInt354 != local32) {
				local134 = Static202.method3261(local6.aClass14_Sub2_Sub1_1);
				if (local134 != local6.anInt364) {
					if (local6.aClass1_Sub5_Sub1_1 != null) {
						Static141.aClass1_Sub5_Sub4_1.method4380(local6.aClass1_Sub5_Sub1_1);
						local6.aClass1_Sub5_Sub1_1 = null;
					}
					local6.anInt364 = local134;
				}
				local6.anInt354 = local32;
			}
			local6.anInt359 = local6.aClass14_Sub2_Sub1_1.anInt4680;
			local6.anInt356 = local6.aClass14_Sub2_Sub1_1.anInt4680 + local6.aClass14_Sub2_Sub1_1.method3656() * 64;
			local6.anInt358 = local6.aClass14_Sub2_Sub1_1.anInt4630;
			local6.anInt363 = local6.aClass14_Sub2_Sub1_1.anInt4630 + local6.aClass14_Sub2_Sub1_1.method3656() * 64;
			Static17.method3924(arg1, arg0, arg2, local6, arg3);
		}
	}
}
