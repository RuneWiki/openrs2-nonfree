import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray8;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBIIIII)V")
	public static void method6858(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static379.anInt5914 <= arg2 && Static624.anInt10032 >= arg5 && arg4 >= Static257.anInt4068 && Static67.anInt1214 >= arg1) {
			if (arg3 == 1) {
				Static258.method3534(arg4, arg0, arg1, arg5, arg2);
			} else {
				Static473.method6402(arg4, arg0, arg2, arg3, arg5, arg1);
			}
		} else if (arg3 == 1) {
			Static635.method8483(arg1, arg0, arg2, arg4, arg5);
		} else {
			Static254.method3520(arg4, arg2, arg0, arg1, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!ha;Lclient!wu;)V")
	public static void method6860(@OriginalArg(1) Class95 arg0, @OriginalArg(2) Class380 arg1) {
		@Pc(10) Class329[] local10 = Static655.method7413(arg1, Static219.anInt3586);
		Static179.aClass61Array8 = new Class61[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static179.aClass61Array8[local16] = arg0.method6980(local10[local16], true);
		}
		local10 = Static655.method7413(arg1, Static255.anInt4054);
		Static364.aClass61Array10 = new Class61[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static364.aClass61Array10[local43] = arg0.method6980(local10[local43], true);
		}
		local10 = Static655.method7413(arg1, Static198.anInt8168);
		Static22.aClass61Array2 = new Class61[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static22.aClass61Array2[local74] = arg0.method6980(local10[local74], true);
		}
		local10 = Static655.method7413(arg1, Static50.anInt1047);
		Static4.aClass61Array1 = new Class61[local10.length];
		for (@Pc(101) int local101 = 0; local101 < local10.length; local101++) {
			Static4.aClass61Array1[local101] = arg0.method6980(local10[local101], true);
		}
		local10 = Static655.method7413(arg1, Static392.anInt6183);
		Static535.aClass61Array13 = new Class61[local10.length];
		for (@Pc(128) int local128 = 0; local128 < local10.length; local128++) {
			Static535.aClass61Array13[local128] = arg0.method6980(local10[local128], true);
		}
		local10 = Static655.method7413(arg1, Static311.anInt5006);
		Static564.aClass61Array14 = new Class61[local10.length];
		for (@Pc(155) int local155 = 0; local155 < local10.length; local155++) {
			Static564.aClass61Array14[local155] = arg0.method6980(local10[local155], true);
		}
		local10 = Static655.method7413(arg1, Static617.anInt9939);
		Static236.aClass61Array9 = new Class61[local10.length];
		for (@Pc(186) int local186 = 0; local186 < local10.length; local186++) {
			Static236.aClass61Array9[local186] = arg0.method6980(local10[local186], true);
		}
		local10 = Static655.method7413(arg1, Static200.anInt3400);
		Static206.aClass61Array7 = new Class61[local10.length];
		for (@Pc(217) int local217 = 0; local217 < local10.length; local217++) {
			Static206.aClass61Array7[local217] = arg0.method6980(local10[local217], true);
		}
		local10 = Static655.method7413(arg1, Static96.anInt1823);
		Static611.aClass61Array16 = new Class61[local10.length];
		for (@Pc(248) int local248 = 0; local248 < local10.length; local248++) {
			Static611.aClass61Array16[local248] = arg0.method6980(local10[local248], true);
		}
		local10 = Static655.method7413(arg1, Static211.anInt3250);
		Static401.aClass61Array12 = new Class61[local10.length];
		for (@Pc(283) int local283 = 0; local283 < local10.length; local283++) {
			Static401.aClass61Array12[local283] = arg0.method6980(local10[local283], true);
		}
		local10 = Static655.method7413(arg1, Static81.anInt1424);
		Static607.aClass61Array15 = new Class61[local10.length];
		for (@Pc(310) int local310 = 0; local310 < local10.length; local310++) {
			Static607.aClass61Array15[local310] = arg0.method6980(local10[local310], true);
		}
		local10 = Static655.method7413(arg1, Static197.anInt3366);
		Static176.aClass61Array5 = new Class61[local10.length];
		for (@Pc(341) int local341 = 0; local341 < local10.length; local341++) {
			Static176.aClass61Array5[local341] = arg0.method6980(local10[local341], true);
		}
		Static83.aClass61_3 = arg0.method6980(Static655.method7423(arg1, Static179.anInt3513, 0), true);
		Static205.aClass61_19 = arg0.method6980(Static655.method7423(arg1, Static410.anInt6384, 0), true);
		local10 = Static655.method7413(arg1, Static5.anInt80);
		Static366.aClass61Array11 = new Class61[local10.length];
		for (@Pc(384) int local384 = 0; local384 < local10.length; local384++) {
			Static366.aClass61Array11[local384] = arg0.method6980(local10[local384], true);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!wu;I)V")
	public static void method6862(@OriginalArg(0) Class380 arg0) {
		Static114.anInt2095 = arg0.method8609("p11_full");
		Static397.anInt6240 = arg0.method8609("p12_full");
		Static39.anInt780 = arg0.method8609("b12_full");
	}
}
