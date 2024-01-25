import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!jl", name = "tb", descriptor = "F")
	public static float aFloat124;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	public static void method4861() {
		if (Static87.aClass6_Sub33_6.aClass14_Sub3_2.method819() == 0 && Static213.anInt4581 != Static86.anInt10575) {
			Static441.method6730(Static484.anInt8559, false, Static300.anInt6134, 11);
		} else {
			Static75.method2138(Static467.aClass5_13);
			if (Static282.anInt5926 != Static86.anInt10575) {
				Static260.method4613();
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!ha;BLclient!ni;)V")
	public static void method4870(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class223 arg1) {
		@Pc(10) Class331[] local10 = Static655.method7887(arg1, Static1.anInt7049);
		Static381.aClass4Array9 = new Class4[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static381.aClass4Array9[local16] = arg0.method6121(local10[local16], true);
		}
		local10 = Static655.method7887(arg1, Static272.anInt5805);
		Static447.aClass4Array12 = new Class4[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static447.aClass4Array12[local43] = arg0.method6121(local10[local43], true);
		}
		local10 = Static655.method7887(arg1, Static125.anInt3109);
		Static333.aClass4Array8 = new Class4[local10.length];
		for (@Pc(70) int local70 = 0; local70 < local10.length; local70++) {
			Static333.aClass4Array8[local70] = arg0.method6121(local10[local70], true);
		}
		local10 = Static655.method7887(arg1, Static461.anInt8259);
		Static532.aClass4Array14 = new Class4[local10.length];
		for (@Pc(101) int local101 = 0; local101 < local10.length; local101++) {
			Static532.aClass4Array14[local101] = arg0.method6121(local10[local101], true);
		}
		local10 = Static655.method7887(arg1, Static441.anInt7979);
		Static6.aClass4Array1 = new Class4[local10.length];
		for (@Pc(128) int local128 = 0; local128 < local10.length; local128++) {
			Static6.aClass4Array1[local128] = arg0.method6121(local10[local128], true);
		}
		local10 = Static655.method7887(arg1, Static551.anInt9474);
		Static530.aClass4Array13 = new Class4[local10.length];
		for (@Pc(159) int local159 = 0; local159 < local10.length; local159++) {
			Static530.aClass4Array13[local159] = arg0.method6121(local10[local159], true);
		}
		local10 = Static655.method7887(arg1, Static168.anInt3760);
		Static188.aClass4Array3 = new Class4[local10.length];
		for (@Pc(186) int local186 = 0; local186 < local10.length; local186++) {
			Static188.aClass4Array3[local186] = arg0.method6121(local10[local186], true);
		}
		local10 = Static655.method7887(arg1, Static402.anInt7481);
		Static579.aClass4Array17 = new Class4[local10.length];
		for (@Pc(217) int local217 = 0; local217 < local10.length; local217++) {
			Static579.aClass4Array17[local217] = arg0.method6121(local10[local217], true);
		}
		local10 = Static655.method7887(arg1, Static77.anInt6024);
		Static296.aClass4Array7 = new Class4[local10.length];
		for (@Pc(248) int local248 = 0; local248 < local10.length; local248++) {
			Static296.aClass4Array7[local248] = arg0.method6121(local10[local248], true);
		}
		local10 = Static655.method7887(arg1, Static97.anInt2777);
		Static166.aClass4Array18 = new Class4[local10.length];
		for (@Pc(279) int local279 = 0; local279 < local10.length; local279++) {
			Static166.aClass4Array18[local279] = arg0.method6121(local10[local279], true);
		}
		local10 = Static655.method7887(arg1, Static430.anInt7862);
		Static279.aClass4Array6 = new Class4[local10.length];
		for (@Pc(310) int local310 = 0; local310 < local10.length; local310++) {
			Static279.aClass4Array6[local310] = arg0.method6121(local10[local310], true);
		}
		local10 = Static655.method7887(arg1, Static621.anInt10458);
		Static393.aClass4Array11 = new Class4[local10.length];
		for (@Pc(345) int local345 = 0; local345 < local10.length; local345++) {
			Static393.aClass4Array11[local345] = arg0.method6121(local10[local345], true);
		}
		Static572.aClass4_31 = arg0.method6121(Static655.method7892(arg1, Static222.anInt5008, 0), true);
		Static295.aClass4_14 = arg0.method6121(Static655.method7892(arg1, Static466.anInt8306, 0), true);
		local10 = Static655.method7887(arg1, Static144.anInt10674);
		Static603.aClass4Array19 = new Class4[local10.length];
		for (@Pc(388) int local388 = 0; local388 < local10.length; local388++) {
			Static603.aClass4Array19[local388] = arg0.method6121(local10[local388], true);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B[S)[S")
	public static short[] method4871(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static653.method6538(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
