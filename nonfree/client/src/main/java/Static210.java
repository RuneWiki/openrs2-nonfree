import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "[Lclient!vf;")
	public static Class1_Sub1_Sub8[] aClass1_Sub1_Sub8Array10;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1326 = Static186.method3527("<img=0>");

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
	public static int anInt4162 = 0;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
	public static int anInt4163 = 0;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "[I")
	public static int[] anIntArray472 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([Lclient!qh;ZI)V")
	public static void method3282(@OriginalArg(0) Class93[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class93 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt3656 == 0) {
					if (local13.aClass93Array1 != null) {
						method3282(local13.aClass93Array1, arg1);
					}
					@Pc(34) Class1_Sub13 local34 = (Class1_Sub13) Static157.aClass90_19.method2819((long) local13.anInt3603);
					if (local34 != null) {
						Static113.method1839(arg1, local34.anInt1588);
					}
				}
				@Pc(50) Class1_Sub29 local50;
				if (arg1 == 0 && local13.anObjectArray9 != null) {
					local50 = new Class1_Sub29();
					local50.anObjectArray33 = local13.anObjectArray9;
					local50.aClass93_119 = local13;
					Static144.method2381(local50);
				}
				if (arg1 == 1 && local13.anObjectArray27 != null) {
					if (local13.anInt3614 >= 0) {
						@Pc(74) Class93 local74 = Static164.method2725(local13.anInt3603);
						if (local74 == null || local74.aClass93Array1 == null || local74.aClass93Array1.length <= local13.anInt3614 || local13 != local74.aClass93Array1[local13.anInt3614]) {
							continue;
						}
					}
					local50 = new Class1_Sub29();
					local50.anObjectArray33 = local13.anObjectArray27;
					local50.aClass93_119 = local13;
					Static144.method2381(local50);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
	public static void method3284() {
		if (Static57.anInt1120 != Static75.anInt1529) {
			Static48.anInt1023 += Static75.anInt1529;
			Static75.anInt1529 = Static57.anInt1120;
			Static48.anInt1023 -= Static57.anInt1120;
			if (Static10.anInt204 != -1) {
				Static14.method195(true);
			}
		}
		if (Static18.aBrowsercontrol1 != null) {
			Static18.aBrowsercontrol1.method2289();
		}
		Static19.method290(Static193.aCanvas4);
		Static173.method2878(Static193.aCanvas4);
		if (Static48.aClass42_1 != null) {
			Static48.aClass42_1.method1036(Static193.aCanvas4);
		}
		Static116.method1856();
		Static156.method2584(Static193.aCanvas4);
		Static162.method2709(Static193.aCanvas4);
		if (Static48.aClass42_1 != null) {
			Static48.aClass42_1.method1038(Static193.aCanvas4);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
	public static void method3285() {
		Static27.aClass84_11.method2577(5);
		Static125.aClass84_23.method2577(5);
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)I")
	public static int method3286(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!pa;ILclient!pa;)V")
	public static void method3287(@OriginalArg(0) Class86 arg0, @OriginalArg(2) Class86 arg1) {
		Static150.aClass86_55 = arg1;
		Static228.aClass86_84 = arg0;
		Static40.anInt875 = Static150.aClass86_55.method3323(3);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
	public static void method3288() {
		if (Static33.aClass26_2 != null) {
			Static33.aClass26_2.method776();
			Static33.aClass26_2 = null;
		}
		Static116.method1857();
		Static32.method462();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static22.aClass16Array1[local17].method431();
		}
		Static129.method2047();
		System.gc();
		Static56.method819();
		Static35.anInt737 = -1;
		Static159.aBoolean199 = false;
		Static181.method2963(true);
		Static91.anInt4078 = 0;
		Static140.aBoolean123 = false;
		Static101.anInt2041 = 0;
		for (@Pc(51) int local51 = 0; local51 < Static229.aClass64Array1.length; local51++) {
			Static229.aClass64Array1[local51] = null;
		}
		Static13.anInt250 = 0;
		Static103.anInt2065 = 0;
		for (@Pc(72) int local72 = 0; local72 < 2048; local72++) {
			Static232.aClass20_Sub3_Sub1Array1[local72] = null;
			Static119.aClass1_Sub17Array1[local72] = null;
		}
		for (@Pc(88) int local88 = 0; local88 < 32768; local88++) {
			Static78.aClass20_Sub3_Sub2Array1[local88] = null;
		}
		for (@Pc(100) int local100 = 0; local100 < 4; local100++) {
			for (@Pc(104) int local104 = 0; local104 < 104; local104++) {
				for (@Pc(108) int local108 = 0; local108 < 104; local108++) {
					Static182.aClass75ArrayArrayArray1[local100][local104][local108] = null;
				}
			}
		}
		Static118.method1872();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIILclient!sh;IIB)V")
	public static void method3289(@OriginalArg(0) int arg0, @OriginalArg(3) Class20_Sub3 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static40.method647(arg3, arg2, arg1.anInt3008, arg0, arg1.anInt3022);
	}
}
