import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "[J")
	public static long[] aLongArray4;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "[Lclient!oaa;")
	public static Class235[] aClass235Array1;

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
	public static int anInt4255;

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "F")
	public static float aFloat108;

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "Lclient!pt;")
	public static Class263 aClass263_1;

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "Lclient!r;")
	public static Class31 aClass31_8;

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	public static int anInt4252 = 0;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
	public static int anInt4253 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3426(@OriginalArg(0) String arg0) {
		if (Static495.aStringArray41 == null) {
			Static314.method4680();
		}
		Static345.aCalendar1.setTime(new Date(Static96.method2000()));
		@Pc(24) int local24 = Static345.aCalendar1.get(11);
		@Pc(28) int local28 = Static345.aCalendar1.get(12);
		@Pc(32) int local32 = Static345.aCalendar1.get(13);
		@Pc(66) String local66 = Integer.toString(local24 / 10) + local24 % 10 + ":" + local28 / 10 + local28 % 10 + ":" + local32 / 10 + local32 % 10;
		@Pc(71) String[] local71 = Static317.method4706('\n', arg0);
		for (@Pc(73) int local73 = 0; local73 < local71.length; local73++) {
			for (@Pc(77) int local77 = Static340.anInt6134; local77 > 0; local77--) {
				Static495.aStringArray41[local77] = Static495.aStringArray41[local77 - 1];
			}
			Static495.aStringArray41[0] = local66 + ": " + local71[local73];
			if (Static172.aFileOutputStream1 != null) {
				try {
					Static172.aFileOutputStream1.write(Static138.method2726(Static495.aStringArray41[0] + "\n"));
				} catch (@Pc(123) IOException local123) {
				}
			}
			if (Static495.aStringArray41.length - 1 > Static340.anInt6134) {
				Static340.anInt6134++;
				if (Static298.anInt5568 > 0) {
					Static298.anInt5568++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(DI)V")
	public static void method3427(@OriginalArg(0) double arg0) {
		if (arg0 == Static533.aDouble9) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static191.anIntArray176[local11] = local23 <= 255 ? local23 : 255;
		}
		Static533.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILclient!ol;)V")
	public static void method3428(@OriginalArg(1) int arg0, @OriginalArg(2) Class25_Sub2_Sub2_Sub5 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt8533 > Static397.anInt6998) {
			Static63.method1575(arg1);
		} else if (arg1.anInt8493 >= Static397.anInt6998) {
			Static25.method247(arg1);
		} else {
			Static172.method3061(false, arg1);
			local9 = Static516.anInt8891;
			local7 = Static448.anInt10226;
		}
		if (arg1.anInt8476 < 512 || arg1.anInt8482 < 512 || arg1.anInt8476 >= (Static345.anInt6228 - 1) * 512 || (Static535.anInt9341 - 1) * 512 <= arg1.anInt8482) {
			arg1.anInt8493 = 0;
			local7 = -1;
			arg1.anInt8508 = -1;
			arg1.anInt8548 = -1;
			local9 = 0;
			arg1.anInt8545 = -1;
			arg1.anInt8533 = 0;
			arg1.anIntArray508 = null;
			arg1.anInt8476 = arg1.anIntArray512[0] * 512 + arg1.method6668() * 256;
			arg1.anInt8482 = arg1.anIntArray513[0] * 512 + arg1.method6668() * 256;
			arg1.method6664();
		}
		if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 == arg1 && (arg1.anInt8476 < 6144 || arg1.anInt8482 < 6144 || arg1.anInt8476 >= (Static345.anInt6228 - 12) * 512 || (Static535.anInt9341 - 12) * 512 <= arg1.anInt8482)) {
			local7 = -1;
			arg1.anInt8545 = -1;
			arg1.anInt8508 = -1;
			arg1.anInt8548 = -1;
			arg1.anInt8493 = 0;
			local9 = 0;
			arg1.anInt8533 = 0;
			arg1.anIntArray508 = null;
			arg1.anInt8476 = arg1.anIntArray512[0] * 512 + arg1.method6668() * 256;
			arg1.anInt8482 = arg1.anIntArray513[0] * 512 + arg1.method6668() * 256;
			arg1.method6664();
		}
		@Pc(209) int local209 = Static475.method6513(arg1);
		Static590.method8118(arg1);
		Static477.method6524(local7, arg1, local9, local209);
		Static129.method2404(local7, arg1);
		Static178.method3177(arg1);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIB)Z")
	public static boolean method3430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!pca;III)V")
	public static void method3431(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray7 != null) {
			@Pc(13) Class3_Sub36 local13 = new Class3_Sub36();
			local13.anObjectArray1 = arg0.anObjectArray7;
			local13.aClass251_8 = arg0;
			Static583.method7919(local13);
		}
		Static580.anInt10049 = arg0.anInt7246;
		Static149.anInt3464 = arg0.anInt7268;
		Static455.anInt7961 = arg0.anInt7247;
		Static511.anInt8807 = arg0.anInt7254;
		Static164.anInt3670 = arg0.anInt7279;
		Static191.anInt4131 = arg2;
		Static182.anInt3987 = arg1;
		Static253.aBoolean325 = true;
		Static588.method8016(arg0);
	}
}
