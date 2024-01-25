import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
	public static int anInt6363 = 0;

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "S")
	public static short aShort98 = 320;

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_163 = new Class211(25, -1);

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
	public static int anInt6367 = -1;

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "S")
	public static short aShort99 = 1;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!je;Lclient!je;)V")
	public static void method5528(@OriginalArg(1) Class117 arg0, @OriginalArg(2) Class117 arg1) {
		Static177.method1119(Static227.aClass48_170);
		Static209.aClass1_Sub33_Sub2_2.method5142(arg0.anInt3093);
		Static209.aClass1_Sub33_Sub2_2.method5139(arg1.anInt3080);
		Static209.aClass1_Sub33_Sub2_2.method5170(arg1.anInt3043);
		Static209.aClass1_Sub33_Sub2_2.method5126(arg0.anInt3043);
		Static209.aClass1_Sub33_Sub2_2.method5142(arg1.anInt3093);
		Static209.aClass1_Sub33_Sub2_2.method5126(arg0.anInt3080);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)V")
	public static void method5529(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static25.aClass132ArrayArrayArray1 = Static329.aClass132ArrayArrayArray4;
			Static229.aClass42Array3 = Static77.aClass42Array2;
		} else {
			Static25.aClass132ArrayArrayArray1 = Static66.aClass132ArrayArrayArray2;
			Static229.aClass42Array3 = Static239.aClass42Array4;
		}
		Static337.anInt5599 = Static25.aClass132ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!tq;IILclient!mu;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method5535(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static90.aClass164_3 = arg0;
		Static16.anInt278 = arg1;
		Static134.aClass127_4 = arg3;
		Static172.aBoolean279 = Static90.aClass164_3.method5337() > 0;
		Static266.anInt4625 = arg4 >> Static365.anInt5876;
		Static249.anInt4358 = arg6 >> Static365.anInt5876;
		Static227.anInt4750 = arg4;
		Static12.anInt170 = arg6;
		Static343.anInt5657 = arg5;
		Static39.anInt751 = Static266.anInt4625 - Static32.anInt647;
		if (Static39.anInt751 < 0) {
			Static223.anInt3796 = -Static39.anInt751;
			Static39.anInt751 = 0;
		} else {
			Static223.anInt3796 = 0;
		}
		Static35.anInt679 = Static249.anInt4358 - Static32.anInt647;
		if (Static35.anInt679 < 0) {
			Static6.anInt93 = -Static35.anInt679;
			Static35.anInt679 = 0;
		} else {
			Static6.anInt93 = 0;
		}
		Static60.anInt1201 = Static266.anInt4625 + Static32.anInt647;
		if (Static60.anInt1201 > Static19.anInt329) {
			Static60.anInt1201 = Static19.anInt329;
		}
		Static255.anInt4404 = Static249.anInt4358 + Static32.anInt647;
		if (Static255.anInt4404 > Static230.anInt6113) {
			Static255.anInt4404 = Static230.anInt6113;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static32.anInt647 + Static32.anInt647 + 2; local74++) {
			for (local77 = 0; local77 < Static32.anInt647 + Static32.anInt647 + 2; local77++) {
				local84 = Static266.anInt4625 + local74 - Static32.anInt647;
				local90 = Static249.anInt4358 + local77 - Static32.anInt647;
				if (local84 >= 0 && local90 >= 0 && local84 < Static19.anInt329 && local90 < Static230.anInt6113) {
					@Pc(104) int local104 = local84 << Static365.anInt5876;
					@Pc(108) int local108 = local90 << Static365.anInt5876;
					@Pc(120) int local120 = Static239.aClass42Array4[Static239.aClass42Array4.length - 1].method3060(local84, local90) - 1000;
					@Pc(140) int local140 = Static77.aClass42Array2 == null ? Static239.aClass42Array4[0].method3060(local84, local90) + Static53.anInt1116 : Static77.aClass42Array2[0].method3060(local84, local90) + Static53.anInt1116;
					Static63.aBooleanArrayArray5[local74][local77] = Static90.aClass164_3.method5380(local104, local120, local108, local104, local140, local108);
				} else {
					Static63.aBooleanArrayArray5[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static32.anInt647 + Static32.anInt647 + 1; local77++) {
			for (local84 = 0; local84 < Static32.anInt647 + Static32.anInt647 + 1; local84++) {
				Static54.aBooleanArrayArray1[local77][local84] = Static63.aBooleanArrayArray5[local77][local84] || Static63.aBooleanArrayArray5[local77 + 1][local84] || Static63.aBooleanArrayArray5[local77][local84 + 1] || Static63.aBooleanArrayArray5[local77 + 1][local84 + 1];
			}
		}
		Static336.anIntArray649 = arg8;
		Static262.anIntArray743 = arg9;
		Static212.anIntArray450 = arg10;
		Static325.anIntArray639 = arg11;
		Static119.anIntArray271 = arg12;
		Static150.method2271();
		Static319.method4698();
		for (@Pc(256) Class41_Sub1 local256 = (Class41_Sub1) Static118.aClass208_6.method4661(); local256 != null; local256 = (Class41_Sub1) Static118.aClass208_6.method4663()) {
			local256.method5475();
			Static47.method725(local256);
		}
		if (Static172.aBoolean279) {
			for (local90 = 0; local90 < Static164.anInt2967; local90++) {
				Static300.aClass1_Sub27_Sub1Array3[local90].method3201(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static90.aClass164_3.method5345(0);
			if (Static273.aClass54_1 == null || Static273.aClass54_1 instanceof Class54_Sub1) {
				Static273.aClass54_1 = new Class54_Sub2();
			}
		} else if (Static273.aClass54_1 == null || Static273.aClass54_1 instanceof Class54_Sub2) {
			Static273.aClass54_1 = new Class54_Sub1();
		}
		Static273.aClass54_1.method1111(arg2);
		Static273.aClass54_1.method1109();
		if (Static329.aClass132ArrayArrayArray4 != null) {
			method5529(true);
			Static273.aClass54_1.method1110(22);
			Static112.method1632(arg2, null, 0, (byte) 0, arg15, arg16);
			Static273.aClass54_1.method1109();
			Static273.aClass54_1.method1110(23);
			method5529(false);
		}
		Static112.method1632(arg2, arg7, arg13, arg14, arg15, arg16);
		Static273.aClass54_1.method1109();
		Static273.aClass54_1.method1117();
		Static273.aClass54_1.method1109();
		if (arg2 > 1) {
			Static90.aClass164_3.method5377(0);
		}
		Static90.aClass164_3.method5355(0, null);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)I")
	public static int method5536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (local12 + arg0) / arg1 - local12;
	}
}
