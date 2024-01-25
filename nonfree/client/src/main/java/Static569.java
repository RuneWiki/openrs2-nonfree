import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "[Lclient!rs;")
	public static Class20_Sub6_Sub1_Sub1[] aClass20_Sub6_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "I")
	public static int anInt9580;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)Z")
	public static boolean method8134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(III)Z")
	public static boolean method8135(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(28) boolean local28 = (arg0 & 0x37) == 0 ? Static420.method6612(arg1, arg0) : Static482.method7212(arg0, arg1);
		return local28 | Static494.method7399(arg0, arg1) | (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!ha;ZLclient!vd;)V")
	public static void method8136(@OriginalArg(0) Class100 arg0, @OriginalArg(2) Class353 arg1) {
		@Pc(10) Class98[] local10 = Static651.method2405(arg1, Static224.anInt4364);
		Static119.aClass32Array8 = new Class32[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static119.aClass32Array8[local16] = arg0.method8773(local10[local16], true);
		}
		local10 = Static651.method2405(arg1, Static595.anInt9908);
		Static333.aClass32Array20 = new Class32[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static333.aClass32Array20[local47] = arg0.method8773(local10[local47], true);
		}
		local10 = Static651.method2405(arg1, Static466.anInt7616);
		Static380.aClass32Array7 = new Class32[local10.length];
		for (@Pc(78) int local78 = 0; local78 < local10.length; local78++) {
			Static380.aClass32Array7[local78] = arg0.method8773(local10[local78], true);
		}
		local10 = Static651.method2405(arg1, Static482.anInt8354);
		Static194.aClass32Array10 = new Class32[local10.length];
		for (@Pc(105) int local105 = 0; local105 < local10.length; local105++) {
			Static194.aClass32Array10[local105] = arg0.method8773(local10[local105], true);
		}
		local10 = Static651.method2405(arg1, Static64.anInt10320);
		Static499.aClass32Array18 = new Class32[local10.length];
		for (@Pc(136) int local136 = 0; local136 < local10.length; local136++) {
			Static499.aClass32Array18[local136] = arg0.method8773(local10[local136], true);
		}
		local10 = Static651.method2405(arg1, Static116.anInt2276);
		Static30.aClass32Array11 = new Class32[local10.length];
		for (@Pc(167) int local167 = 0; local167 < local10.length; local167++) {
			Static30.aClass32Array11[local167] = arg0.method8773(local10[local167], true);
		}
		local10 = Static651.method2405(arg1, Static94.anInt1855);
		Static257.aClass32Array13 = new Class32[local10.length];
		for (@Pc(198) int local198 = 0; local198 < local10.length; local198++) {
			Static257.aClass32Array13[local198] = arg0.method8773(local10[local198], true);
		}
		local10 = Static651.method2405(arg1, Static499.anInt8643);
		Static246.aClass32Array12 = new Class32[local10.length];
		for (@Pc(225) int local225 = 0; local225 < local10.length; local225++) {
			Static246.aClass32Array12[local225] = arg0.method8773(local10[local225], true);
		}
		local10 = Static651.method2405(arg1, Static274.anInt7991);
		Static272.aClass32Array15 = new Class32[local10.length];
		for (@Pc(252) int local252 = 0; local252 < local10.length; local252++) {
			Static272.aClass32Array15[local252] = arg0.method8773(local10[local252], true);
		}
		local10 = Static651.method2405(arg1, Static188.anInt5454);
		Static564.aClass32Array21 = new Class32[local10.length];
		for (@Pc(279) int local279 = 0; local279 < local10.length; local279++) {
			Static564.aClass32Array21[local279] = arg0.method8773(local10[local279], true);
		}
		local10 = Static651.method2405(arg1, Static386.anInt5554);
		Static52.aClass32Array4 = new Class32[local10.length];
		for (@Pc(310) int local310 = 0; local310 < local10.length; local310++) {
			Static52.aClass32Array4[local310] = arg0.method8773(local10[local310], true);
		}
		local10 = Static651.method2405(arg1, Static560.anInt9546);
		Static553.aClass32Array19 = new Class32[local10.length];
		for (@Pc(337) int local337 = 0; local337 < local10.length; local337++) {
			Static553.aClass32Array19[local337] = arg0.method8773(local10[local337], true);
		}
		Static340.aClass32_16 = arg0.method8773(Static651.method2404(arg1, Static240.anInt4805, 0), true);
		Static581.aClass32_30 = arg0.method8773(Static651.method2404(arg1, Static326.anInt6218, 0), true);
		local10 = Static651.method2405(arg1, Static572.anInt9597);
		Static145.aClass32Array9 = new Class32[local10.length];
		for (@Pc(380) int local380 = 0; local380 < local10.length; local380++) {
			Static145.aClass32Array9[local380] = arg0.method8773(local10[local380], true);
		}
	}
}
