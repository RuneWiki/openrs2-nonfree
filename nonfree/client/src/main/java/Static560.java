import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!vg", name = "C", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_264 = new Class272(59, -1);

	@OriginalMember(owner = "client!vg", name = "G", descriptor = "Lclient!mea;")
	public static final Class211 aClass211_4 = new Class211("stellardawn", 1);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!qh;I)V")
	public static void method7453(@OriginalArg(0) Class3_Sub11 arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static588.anInt2860; local11++) {
			@Pc(19) int local19 = arg0.method3138();
			@Pc(23) int local23 = arg0.method3109();
			if (local23 == 65535) {
				local23 = -1;
			}
			if (Static72.aClass133_Sub1Array1[local19] != null) {
				Static72.aClass133_Sub1Array1[local19].anInt4090 = local23;
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!om;BLclient!r;)V")
	public static void method7464(@OriginalArg(0) Class246 arg0, @OriginalArg(2) Class43 arg1) {
		@Pc(10) Class355[] local10 = Static606.method7593(arg0, Static410.anInt6920);
		Static10.aClass46Array1 = new Class46[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static10.aClass46Array1[local16] = arg1.method7205(local10[local16], true);
		}
		local10 = Static606.method7593(arg0, Static376.anInt6363);
		Static594.aClass46Array15 = new Class46[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static594.aClass46Array15[local47] = arg1.method7205(local10[local47], true);
		}
		local10 = Static606.method7593(arg0, Static160.anInt3217);
		Static231.aClass46Array9 = new Class46[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static231.aClass46Array9[local74] = arg1.method7205(local10[local74], true);
		}
		local10 = Static606.method7593(arg0, Static243.anInt4530);
		Static223.aClass46Array8 = new Class46[local10.length];
		for (@Pc(101) int local101 = 0; local101 < local10.length; local101++) {
			Static223.aClass46Array8[local101] = arg1.method7205(local10[local101], true);
		}
		local10 = Static606.method7593(arg0, Static233.anInt4433);
		Static503.aClass46Array14 = new Class46[local10.length];
		for (@Pc(132) int local132 = 0; local132 < local10.length; local132++) {
			Static503.aClass46Array14[local132] = arg1.method7205(local10[local132], true);
		}
		local10 = Static606.method7593(arg0, Static416.anInt6986);
		Static56.aClass46Array2 = new Class46[local10.length];
		for (@Pc(159) int local159 = 0; local159 < local10.length; local159++) {
			Static56.aClass46Array2[local159] = arg1.method7205(local10[local159], true);
		}
		local10 = Static606.method7593(arg0, Static451.anInt7398);
		Static405.aClass46Array13 = new Class46[local10.length];
		for (@Pc(190) int local190 = 0; local190 < local10.length; local190++) {
			Static405.aClass46Array13[local190] = arg1.method7205(local10[local190], true);
		}
		local10 = Static606.method7593(arg0, Static2.anInt17);
		Static191.aClass46Array7 = new Class46[local10.length];
		for (@Pc(221) int local221 = 0; local221 < local10.length; local221++) {
			Static191.aClass46Array7[local221] = arg1.method7205(local10[local221], true);
		}
		local10 = Static606.method7593(arg0, Static225.anInt4392);
		Static58.aClass46Array3 = new Class46[local10.length];
		for (@Pc(248) int local248 = 0; local248 < local10.length; local248++) {
			Static58.aClass46Array3[local248] = arg1.method7205(local10[local248], true);
		}
		local10 = Static606.method7593(arg0, Static193.anInt3726);
		Static277.aClass46Array11 = new Class46[local10.length];
		for (@Pc(279) int local279 = 0; local279 < local10.length; local279++) {
			Static277.aClass46Array11[local279] = arg1.method7205(local10[local279], true);
		}
		local10 = Static606.method7593(arg0, Static536.anInt8406);
		Static330.aClass46Array12 = new Class46[local10.length];
		for (@Pc(312) int local312 = 0; local312 < local10.length; local312++) {
			Static330.aClass46Array12[local312] = arg1.method7205(local10[local312], true);
		}
		local10 = Static606.method7593(arg0, Static597.anInt9434);
		Static90.aClass46Array4 = new Class46[local10.length];
		for (@Pc(339) int local339 = 0; local339 < local10.length; local339++) {
			Static90.aClass46Array4[local339] = arg1.method7205(local10[local339], true);
		}
		Static573.aClass46_35 = arg1.method7205(Static606.method7590(arg0, Static409.anInt6458, 0), true);
		Static569.aClass46_33 = arg1.method7205(Static606.method7590(arg0, Static193.anInt3724, 0), true);
		local10 = Static606.method7593(arg0, Static462.anInt7556);
		Static245.aClass46Array10 = new Class46[local10.length];
		for (@Pc(386) int local386 = 0; local386 < local10.length; local386++) {
			Static245.aClass46Array10[local386] = arg1.method7205(local10[local386], true);
		}
	}
}
