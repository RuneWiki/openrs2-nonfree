import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
	public static int anInt5354;

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "Lclient!vd;")
	public static Class205 aClass205_10;

	@OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
	public static int anInt5363;

	@OriginalMember(owner = "client!rm", name = "r", descriptor = "B")
	public static byte aByte55;

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "Z")
	public static boolean aBoolean353 = true;

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
	public static int anInt5357 = 0;

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "Lclient!ne;")
	public static Class146 aClass146_52 = null;

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "Lclient!al;")
	public static final Class11 aClass11_124 = new Class11(256);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4770(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = (local15 << 5) + Static185.method3545(arg0.charAt(local17)) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!mo;)V")
	public static void method4771(@OriginalArg(1) Class143 arg0) {
		Static30.aClass143_19 = arg0;
		Static61.anInt1462 = Static30.aClass143_19.method3732(16);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!e;IILclient!pg;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method4773(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class51 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static160.aClass46_4 = arg0;
		Static178.anInt3664 = arg1;
		Static336.aClass51_6 = arg3;
		Static347.aBoolean442 = Static160.aClass46_4.method5135() > 0;
		Static93.anInt2184 = arg4 >> 7;
		Static18.anInt373 = arg6 >> 7;
		Static269.anInt5123 = arg4;
		Static103.anInt2312 = arg6;
		Static107.anInt2391 = arg5;
		Static239.anInt6274 = Static93.anInt2184 - Static312.anInt6032;
		if (Static239.anInt6274 < 0) {
			Static74.anInt5349 = -Static239.anInt6274;
			Static239.anInt6274 = 0;
		} else {
			Static74.anInt5349 = 0;
		}
		Static38.anInt906 = Static18.anInt373 - Static312.anInt6032;
		if (Static38.anInt906 < 0) {
			Static92.anInt2167 = -Static38.anInt906;
			Static38.anInt906 = 0;
		} else {
			Static92.anInt2167 = 0;
		}
		Static86.anInt2090 = Static93.anInt2184 + Static312.anInt6032;
		if (Static86.anInt2090 > Static233.anInt4556) {
			Static86.anInt2090 = Static233.anInt4556;
		}
		Static54.anInt1340 = Static18.anInt373 + Static312.anInt6032;
		if (Static54.anInt1340 > Static180.anInt3712) {
			Static54.anInt1340 = Static180.anInt3712;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static312.anInt6032 + Static312.anInt6032 + 2; local74++) {
			for (local77 = 0; local77 < Static312.anInt6032 + Static312.anInt6032 + 2; local77++) {
				local84 = Static93.anInt2184 + local74 - Static312.anInt6032;
				local90 = Static18.anInt373 + local77 - Static312.anInt6032;
				if (local84 >= 0 && local90 >= 0 && local84 < Static233.anInt4556 && local90 < Static180.anInt3712) {
					@Pc(104) int local104 = local84 << 7;
					@Pc(108) int local108 = local90 << 7;
					@Pc(117) int local117 = Static18.aClass114Array1[3].method3610(local84, local90) - 1000;
					@Pc(137) int local137 = Static341.aClass114Array3 == null ? Static18.aClass114Array1[0].method3610(local84, local90) + 128 : Static341.aClass114Array3[0].method3610(local84, local90) + 128;
					Static272.aBooleanArrayArray4[local74][local77] = Static160.aClass46_4.method5173(local104, local117, local108, local104, local137, local108);
				} else {
					Static272.aBooleanArrayArray4[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static312.anInt6032 + Static312.anInt6032 + 1; local77++) {
			for (local84 = 0; local84 < Static312.anInt6032 + Static312.anInt6032 + 1; local84++) {
				Static134.aBooleanArrayArray1[local77][local84] = Static272.aBooleanArrayArray4[local77][local84] || Static272.aBooleanArrayArray4[local77 + 1][local84] || Static272.aBooleanArrayArray4[local77][local84 + 1] || Static272.aBooleanArrayArray4[local77 + 1][local84 + 1];
			}
		}
		Static32.anIntArray50 = arg8;
		Static207.anIntArray357 = arg9;
		Static22.anIntArray35 = arg10;
		Static96.anIntArray204 = arg11;
		Static213.anIntArray382 = arg12;
		Static339.method2412();
		Static23.method649();
		for (@Pc(253) Class1_Sub8 local253 = (Class1_Sub8) Static184.aClass126_4.method3389(); local253 != null; local253 = (Class1_Sub8) Static184.aClass126_4.method3394()) {
			local253.method5701();
			Static265.method4532(local253);
		}
		if (Static347.aBoolean442) {
			for (local90 = 0; local90 < Static4.anInt118; local90++) {
				Static127.aClass14_Sub13_Sub1Array1[local90].method5025(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static160.aClass46_4.method5159(0);
			if (Static295.aClass57_1 == null || Static295.aClass57_1 instanceof Class57_Sub1) {
				Static295.aClass57_1 = new Class57_Sub2();
			}
		} else if (Static295.aClass57_1 == null || Static295.aClass57_1 instanceof Class57_Sub2) {
			Static295.aClass57_1 = new Class57_Sub1();
		}
		Static295.aClass57_1.method2406(arg2);
		Static295.aClass57_1.method2407();
		if (Static342.aClass213ArrayArrayArray3 != null) {
			Static319.method5482(true);
			Static295.aClass57_1.method2403(22);
			Static54.method1261(arg2, null, 0, (byte) 0, arg15, arg16);
			Static295.aClass57_1.method2407();
			Static295.aClass57_1.method2403(23);
			Static319.method5482(false);
		}
		Static54.method1261(arg2, arg7, arg13, arg14, arg15, arg16);
		Static295.aClass57_1.method2407();
		Static295.aClass57_1.method2404();
		Static295.aClass57_1.method2407();
		if (arg2 > 1) {
			Static160.aClass46_4.method5132(0);
		}
		Static160.aClass46_4.method5124(0, null);
	}
}
