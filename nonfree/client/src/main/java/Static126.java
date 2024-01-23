import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!je", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray24;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray64;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "I")
	public static int anInt2810 = -1;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "I")
	public static int anInt2812 = 0;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Z")
	public static boolean aBoolean144 = false;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)[Lclient!ag;")
	public static Class7_Sub1[] method2146() {
		@Pc(8) Class7_Sub1[] local8 = new Class7_Sub1[Static153.anInt3542];
		for (@Pc(16) int local16 = 0; local16 < Static153.anInt3542; local16++) {
			local8[local16] = new Class7_Sub1(Static298.anInt6232, Static158.anInt3659, Static298.anIntArray623[local16], Static121.anIntArray257[local16], Static166.anIntArray343[local16], Static81.anIntArray204[local16], Static200.aByteArrayArray83[local16], Static167.anIntArray346);
		}
		Static265.method4490();
		return local8;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!kb;Ljava/lang/String;)Lclient!jg;")
	public static Class78 method2147(@OriginalArg(1) Class83 arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = arg0.method2322(arg1);
		if (local10 == -1) {
			return new Class78(0);
		}
		@Pc(24) int[] local24 = arg0.method2326(local10);
		@Pc(30) Class78 local30 = new Class78(local24.length);
		for (@Pc(32) int local32 = 0; local32 < local30.anInt2855; local32++) {
			@Pc(47) Class1_Sub16 local47 = new Class1_Sub16(arg0.method2306(local10, local24[local32]));
			local30.aStringArray14[local32] = local47.method2611();
			local30.aByteArray32[local32] = local47.method2633();
			local30.anIntArray264[local32] = local47.method2610();
			local30.anIntArray265[local32] = local47.method2610();
		}
		return local30;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BIILclient!kb;)Lclient!ag;")
	public static Class7_Sub1 method2148(@OriginalArg(1) int arg0, @OriginalArg(3) Class83 arg1) {
		return Static19.method387(arg0, 0, arg1) ? Static298.method4851() : null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method2149() {
		Static222.aClass1_Sub16_Sub1_3.method2671();
		@Pc(11) int local11 = Static222.aClass1_Sub16_Sub1_3.method2670(1);
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static222.aClass1_Sub16_Sub1_3.method2670(2);
		if (local22 == 0) {
			Static95.anIntArray220[Static111.anInt2390++] = 2047;
			return;
		}
		@Pc(47) int local47;
		@Pc(57) int local57;
		if (local22 == 1) {
			local47 = Static222.aClass1_Sub16_Sub1_3.method2670(3);
			Static239.aClass25_Sub1_Sub1_2.method1240(local47, 1);
			local57 = Static222.aClass1_Sub16_Sub1_3.method2670(1);
			if (local57 == 1) {
				Static95.anIntArray220[Static111.anInt2390++] = 2047;
			}
		} else if (local22 == 2) {
			if (Static222.aClass1_Sub16_Sub1_3.method2670(1) == 1) {
				local47 = Static222.aClass1_Sub16_Sub1_3.method2670(3);
				Static239.aClass25_Sub1_Sub1_2.method1240(local47, 2);
				local57 = Static222.aClass1_Sub16_Sub1_3.method2670(3);
				Static239.aClass25_Sub1_Sub1_2.method1240(local57, 2);
			} else {
				local47 = Static222.aClass1_Sub16_Sub1_3.method2670(3);
				Static239.aClass25_Sub1_Sub1_2.method1240(local47, 0);
			}
			local47 = Static222.aClass1_Sub16_Sub1_3.method2670(1);
			if (local47 == 1) {
				Static95.anIntArray220[Static111.anInt2390++] = 2047;
			}
		} else if (local22 == 3) {
			local47 = Static222.aClass1_Sub16_Sub1_3.method2670(1);
			if (local47 == 1) {
				Static95.anIntArray220[Static111.anInt2390++] = 2047;
			}
			local57 = Static222.aClass1_Sub16_Sub1_3.method2670(1);
			Static145.anInt3477 = Static222.aClass1_Sub16_Sub1_3.method2670(2);
			@Pc(171) int local171 = Static222.aClass1_Sub16_Sub1_3.method2670(7);
			@Pc(176) int local176 = Static222.aClass1_Sub16_Sub1_3.method2670(7);
			Static239.aClass25_Sub1_Sub1_2.method494(local176, local171, local57 == 1);
		}
	}
}
