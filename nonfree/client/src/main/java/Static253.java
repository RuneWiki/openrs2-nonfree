import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "B")
	public static byte aByte20;

	@OriginalMember(owner = "client!sb", name = "I", descriptor = "[I")
	public static int[] anIntArray485;

	@OriginalMember(owner = "client!sb", name = "L", descriptor = "Lclient!dk;")
	public static Class34 aClass34_3;

	@OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
	public static int anInt4974 = 0;

	@OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
	public static int anInt4975 = 0;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V")
	public static void method3980() {
		Static232.aClass157_39.method4034(5);
		Static105.aClass157_9.method4034(5);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIIII)V")
	public static void method3981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static148.anInt3247; local3++) {
			if (arg2 < Static155.anIntArray352[local3] + Static153.anIntArray344[local3] && arg3 + arg2 > Static153.anIntArray344[local3] && arg1 < Static291.anIntArray537[local3] + Static83.anIntArray171[local3] && arg0 + arg1 > Static83.anIntArray171[local3]) {
				Static293.aBooleanArray23[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLclient!ek;)V")
	public static void method3982(@OriginalArg(1) Class42 arg0) {
		Static108.aClass2_Sub8_Sub1Array4 = Static92.method1629(arg0, Static123.anInt2867);
		Static142.aClass2_Sub8_Sub1Array6 = Static92.method1629(arg0, Static50.anInt1263);
		Static273.aClass2_Sub8_Sub1Array10 = Static92.method1629(arg0, Static193.anInt4039);
		Static241.aClass2_Sub8_Sub1Array8 = Static92.method1629(arg0, Static214.anInt4371);
		Static46.aClass2_Sub8_Sub1Array1 = Static92.method1629(arg0, Static217.anInt4437);
		Static60.aClass2_Sub8_Sub1Array2 = Static92.method1629(arg0, Static184.anInt3966);
		Static134.aClass2_Sub8_Sub1Array5 = Static280.method4388(Static222.anInt4533, arg0);
		Static205.aClass2_Sub8_Sub1Array7 = Static280.method4388(Static182.anInt6010, arg0);
		Static258.aClass2_Sub8_Sub1Array9 = Static280.method4388(Static284.anInt5620, arg0);
		Static190.aClass93Array6 = Static105.method797(arg0, Static233.anInt6040);
		Static9.aClass93Array5 = Static105.method797(arg0, Static5.anInt4797);
		Static92.aClass2_Sub8_Sub5_2.method1225(Static9.aClass93Array5, null);
		Static69.aClass2_Sub8_Sub5_4.method1225(Static9.aClass93Array5, null);
		Static237.aClass2_Sub8_Sub5_5.method1225(Static9.aClass93Array5, null);
		if (Static116.aBoolean184) {
			Static266.aClass93_Sub1Array2 = Static174.method3157(Static101.anInt2396, arg0);
			for (@Pc(97) int local97 = 0; local97 < Static266.aClass93_Sub1Array2.length; local97++) {
				Static266.aClass93_Sub1Array2[local97].method2573();
			}
		}
		@Pc(118) Class2_Sub8_Sub1_Sub1 local118 = Static128.method2315(Static161.anInt3591, arg0, 0);
		local118.method2784();
		if (Static116.aBoolean184) {
			Static229.aClass2_Sub8_Sub1_11 = new Class2_Sub8_Sub1_Sub2(local118);
		} else {
			Static229.aClass2_Sub8_Sub1_11 = local118;
		}
		@Pc(137) Class2_Sub8_Sub1_Sub1[] local137 = Static179.method3210(arg0, Static14.anInt284);
		@Pc(139) int local139;
		for (local139 = 0; local139 < local137.length; local139++) {
			local137[local139].method2784();
		}
		if (Static116.aBoolean184) {
			Static86.aClass2_Sub8_Sub1Array3 = new Class2_Sub8_Sub1[local137.length];
			for (local139 = 0; local139 < local137.length; local139++) {
				Static86.aClass2_Sub8_Sub1Array3[local139] = new Class2_Sub8_Sub1_Sub2(local137[local139]);
			}
		} else {
			Static86.aClass2_Sub8_Sub1Array3 = local137;
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
	public static void method3983() {
		Static203.aClass157_34.method4027();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BZ)V")
	public static void method3985(@OriginalArg(1) boolean arg0) {
		Static47.aBoolean81 = arg0;
		Static272.aBoolean360 = !Static69.method2440();
	}
}
