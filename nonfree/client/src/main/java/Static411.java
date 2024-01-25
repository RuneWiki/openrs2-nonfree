import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "[I")
	public static final int[] anIntArray350 = new int[4];

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZI)[B")
	public static synchronized byte[] method5617(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static79.anInt1496 > 0) {
			local21 = Static193.aByteArrayArray13[--Static79.anInt1496];
			Static193.aByteArrayArray13[Static79.anInt1496] = null;
			return local21;
		} else if (arg0 == 5000 && Static101.anInt1976 > 0) {
			local21 = Static136.aByteArrayArray9[--Static101.anInt1976];
			Static136.aByteArrayArray9[Static101.anInt1976] = null;
			return local21;
		} else if (arg0 == 30000 && Static211.anInt3661 > 0) {
			local21 = Static24.aByteArrayArray1[--Static211.anInt3661];
			Static24.aByteArrayArray1[Static211.anInt3661] = null;
			return local21;
		} else {
			if (Static649.aByteArrayArrayArray18 != null) {
				for (@Pc(80) int local80 = 0; local80 < Static175.anIntArray161.length; local80++) {
					if (arg0 == Static175.anIntArray161[local80] && Static169.anIntArray158[local80] > 0) {
						@Pc(107) byte[] local107 = Static649.aByteArrayArrayArray18[local80][--Static169.anIntArray158[local80]];
						Static649.aByteArrayArrayArray18[local80][Static169.anIntArray158[local80]] = null;
						return local107;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!uq;ILclient!ha;)V")
	public static void method5618(@OriginalArg(0) Class362 arg0, @OriginalArg(2) Class95 arg1) {
		@Pc(10) Class370[] local10 = Static688.method8597(arg0, Static512.anInt8072);
		Static578.aClass6Array12 = new Class6[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static578.aClass6Array12[local16] = arg1.method8008(local10[local16], true);
		}
		local10 = Static688.method8597(arg0, Static169.anInt3097);
		Static225.aClass6Array5 = new Class6[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static225.aClass6Array5[local43] = arg1.method8008(local10[local43], true);
		}
		local10 = Static688.method8597(arg0, Static628.anInt10402);
		Static678.aClass6Array15 = new Class6[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static678.aClass6Array15[local74] = arg1.method8008(local10[local74], true);
		}
		local10 = Static688.method8597(arg0, Static516.anInt8125);
		Static393.aClass6Array10 = new Class6[local10.length];
		for (@Pc(105) int local105 = 0; local105 < local10.length; local105++) {
			Static393.aClass6Array10[local105] = arg1.method8008(local10[local105], true);
		}
		local10 = Static688.method8597(arg0, Static401.anInt6632);
		Static348.aClass6Array9 = new Class6[local10.length];
		for (@Pc(136) int local136 = 0; local136 < local10.length; local136++) {
			Static348.aClass6Array9[local136] = arg1.method8008(local10[local136], true);
		}
		local10 = Static688.method8597(arg0, Static600.anInt9810);
		Static14.aClass6Array1 = new Class6[local10.length];
		for (@Pc(163) int local163 = 0; local163 < local10.length; local163++) {
			Static14.aClass6Array1[local163] = arg1.method8008(local10[local163], true);
		}
		local10 = Static688.method8597(arg0, Static21.anInt7427);
		Static656.aClass6Array14 = new Class6[local10.length];
		for (@Pc(194) int local194 = 0; local194 < local10.length; local194++) {
			Static656.aClass6Array14[local194] = arg1.method8008(local10[local194], true);
		}
		local10 = Static688.method8597(arg0, Static347.anInt5935);
		Static245.aClass6Array7 = new Class6[local10.length];
		for (@Pc(232) int local232 = 0; local232 < local10.length; local232++) {
			Static245.aClass6Array7[local232] = arg1.method8008(local10[local232], true);
		}
		local10 = Static688.method8597(arg0, Static24.anInt587);
		Static586.aClass6Array13 = new Class6[local10.length];
		for (@Pc(263) int local263 = 0; local263 < local10.length; local263++) {
			Static586.aClass6Array13[local263] = arg1.method8008(local10[local263], true);
		}
		local10 = Static688.method8597(arg0, Static26.anInt630);
		Static232.aClass6Array6 = new Class6[local10.length];
		for (@Pc(294) int local294 = 0; local294 < local10.length; local294++) {
			Static232.aClass6Array6[local294] = arg1.method8008(local10[local294], true);
		}
		local10 = Static688.method8597(arg0, Static278.anInt4724);
		Static221.aClass6Array4 = new Class6[local10.length];
		for (@Pc(325) int local325 = 0; local325 < local10.length; local325++) {
			Static221.aClass6Array4[local325] = arg1.method8008(local10[local325], true);
		}
		local10 = Static688.method8597(arg0, Static504.anInt7951);
		Static266.aClass6Array8 = new Class6[local10.length];
		for (@Pc(356) int local356 = 0; local356 < local10.length; local356++) {
			Static266.aClass6Array8[local356] = arg1.method8008(local10[local356], true);
		}
		Static653.aClass6_39 = arg1.method8008(Static688.method8590(arg0, Static315.anInt5265, 0), true);
		Static74.aClass6_6 = arg1.method8008(Static688.method8590(arg0, Static1.anInt10667, 0), true);
		local10 = Static688.method8597(arg0, Static116.anInt2119);
		Static35.aClass6Array2 = new Class6[local10.length];
		for (@Pc(403) int local403 = 0; local403 < local10.length; local403++) {
			Static35.aClass6Array2[local403] = arg1.method8008(local10[local403], true);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "([BB)V")
	public static synchronized void method5619(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && Static79.anInt1496 < 1000) {
			Static193.aByteArrayArray13[Static79.anInt1496++] = arg0;
		} else if (arg0.length == 5000 && Static101.anInt1976 < 250) {
			Static136.aByteArrayArray9[Static101.anInt1976++] = arg0;
		} else if (arg0.length == 30000 && Static211.anInt3661 < 50) {
			Static24.aByteArrayArray1[Static211.anInt3661++] = arg0;
		} else if (Static649.aByteArrayArrayArray18 != null) {
			for (@Pc(66) int local66 = 0; local66 < Static175.anIntArray161.length; local66++) {
				if (arg0.length == Static175.anIntArray161[local66] && Static649.aByteArrayArrayArray18[local66].length > Static169.anIntArray158[local66]) {
					Static649.aByteArrayArrayArray18[local66][Static169.anIntArray158[local66]++] = arg0;
					return;
				}
			}
		}
	}
}
