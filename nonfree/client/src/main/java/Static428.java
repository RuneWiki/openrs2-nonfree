import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "[Lclient!ha;")
	public static Class35[] aClass35Array34;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIII)V")
	public static void method6591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static7.anInt8119 && Static34.anInt603 >= arg3) {
			@Pc(19) int local19 = Static84.method1650(Static328.anInt6154, arg1, Static394.anInt7462);
			@Pc(25) int local25 = Static84.method1650(Static328.anInt6154, arg0, Static394.anInt7462);
			Static473.method7079(local25, local19, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V")
	public static void method6593() {
		for (@Pc(3) int local3 = 0; local3 < Static36.anInt644; local3++) {
			@Pc(9) int local9 = Static430.anIntArray604[local3];
			@Pc(17) Class1_Sub1_Sub2_Sub2 local17 = ((Class2_Sub11) Static71.aClass127_13.method3205((long) local9)).aClass1_Sub1_Sub2_Sub2_1;
			@Pc(21) int local21 = Static70.aClass2_Sub29_Sub2_1.method5170();
			if ((local21 & 0x2) != 0) {
				local21 += Static70.aClass2_Sub29_Sub2_1.method5170() << 8;
			}
			if ((local21 & 0x800) != 0) {
				local17.aByte70 = Static70.aClass2_Sub29_Sub2_1.method5235();
				local17.aByte72 = Static70.aClass2_Sub29_Sub2_1.method5207();
				local17.aByte69 = Static70.aClass2_Sub29_Sub2_1.method5213();
				local17.aByte71 = (byte) Static70.aClass2_Sub29_Sub2_1.method5209();
				local17.anInt5091 = Static115.anInt2326 + Static70.aClass2_Sub29_Sub2_1.method5196();
				local17.anInt5095 = Static115.anInt2326 + Static70.aClass2_Sub29_Sub2_1.method5229();
			}
			@Pc(87) int local87;
			@Pc(91) int local91;
			@Pc(102) int local102;
			if ((local21 & 0x200) != 0) {
				local87 = Static70.aClass2_Sub29_Sub2_1.method5225();
				local91 = Static70.aClass2_Sub29_Sub2_1.method5197();
				if (local87 == 65535) {
					local87 = -1;
				}
				local102 = Static70.aClass2_Sub29_Sub2_1.method5170();
				local17.method4387(local87, local102, true, local91);
			}
			if ((local21 & 0x1) != 0) {
				local87 = Static70.aClass2_Sub29_Sub2_1.method5196();
				local91 = Static70.aClass2_Sub29_Sub2_1.method5173();
				if (local87 == 65535) {
					local87 = -1;
				}
				local102 = Static70.aClass2_Sub29_Sub2_1.method5209();
				local17.method4387(local87, local102, false, local91);
			}
			if ((local21 & 0x10) != 0) {
				local87 = Static70.aClass2_Sub29_Sub2_1.method5182();
				local91 = Static70.aClass2_Sub29_Sub2_1.method5224();
				local17.method4378(Static115.anInt2326, local87, local91);
			}
			if ((local21 & 0x100) != 0) {
				local17.anInt5043 = Static70.aClass2_Sub29_Sub2_1.method5207();
				local17.anInt5056 = Static70.aClass2_Sub29_Sub2_1.method5235();
				local17.anInt5046 = Static70.aClass2_Sub29_Sub2_1.method5179();
				local17.anInt5064 = Static70.aClass2_Sub29_Sub2_1.method5235();
				local17.anInt5068 = Static70.aClass2_Sub29_Sub2_1.method5229() + Static115.anInt2326;
				local17.anInt5033 = Static70.aClass2_Sub29_Sub2_1.method5196() + Static115.anInt2326;
				local17.anInt5093 = Static70.aClass2_Sub29_Sub2_1.method5183();
				local17.anInt5046 += local17.anIntArray450[0];
				local17.anInt5043 += local17.anIntArray450[0];
				local17.anInt5056 += local17.anIntArray449[0];
				local17.anInt5105 = 0;
				local17.anInt5064 += local17.anIntArray449[0];
				local17.anInt5102 = 1;
			}
			if ((local21 & 0x2000) != 0) {
				local17.anInt5107 = Static70.aClass2_Sub29_Sub2_1.method5229();
				local17.anInt5119 = Static70.aClass2_Sub29_Sub2_1.method5196();
			}
			if ((local21 & 0x8) != 0) {
				local17.aString108 = Static70.aClass2_Sub29_Sub2_1.method5194();
				local17.anInt5054 = 100;
			}
			if ((local21 & 0x400) != 0) {
				local87 = Static70.aClass2_Sub29_Sub2_1.method5170();
				@Pc(286) int[] local286 = new int[local87];
				@Pc(289) int[] local289 = new int[local87];
				@Pc(292) int[] local292 = new int[local87];
				for (@Pc(294) int local294 = 0; local294 < local87; local294++) {
					@Pc(300) int local300 = Static70.aClass2_Sub29_Sub2_1.method5225();
					if (local300 == 65535) {
						local300 = -1;
					}
					local286[local294] = local300;
					local289[local294] = Static70.aClass2_Sub29_Sub2_1.method5183();
					local292[local294] = Static70.aClass2_Sub29_Sub2_1.method5229();
				}
				Static188.method253(local286, local292, local17, local289);
			}
			if ((local21 & 0x40) != 0) {
				local87 = Static70.aClass2_Sub29_Sub2_1.method5225();
				if (local87 == 65535) {
					local87 = -1;
				}
				local91 = Static70.aClass2_Sub29_Sub2_1.method5224();
				Static115.method2240(local87, local17, local91);
			}
			if ((local21 & 0x80) != 0) {
				local17.anInt5062 = Static70.aClass2_Sub29_Sub2_1.method5196();
				if (local17.anInt5062 == 65535) {
					local17.anInt5062 = -1;
				}
			}
			if ((local21 & 0x4) != 0) {
				local87 = Static70.aClass2_Sub29_Sub2_1.method5182();
				local91 = Static70.aClass2_Sub29_Sub2_1.method5170();
				local17.method4378(Static115.anInt2326, local87, local91);
				local17.anInt5058 = Static115.anInt2326 + 300;
				local17.anInt5042 = Static70.aClass2_Sub29_Sub2_1.method5183();
			}
			if ((local21 & 0x1000) != 0) {
				local87 = Static70.aClass2_Sub29_Sub2_1.method5230();
				local17.anInt5025 = Static70.aClass2_Sub29_Sub2_1.method5209();
				local17.anInt5035 = Static70.aClass2_Sub29_Sub2_1.method5183();
				local17.anInt5047 = local87 & 0x7FFF;
				local17.aBoolean386 = (local87 & 0x8000) != 0;
				local17.anInt5100 = local17.anInt5025 + local17.anInt5047 + Static115.anInt2326;
			}
			if ((local21 & 0x20) != 0) {
				if (local17.aClass12_1.method457()) {
					Static501.method7364(local17);
				}
				local17.method4401(Static21.aClass255_2.method6583(Static70.aClass2_Sub29_Sub2_1.method5229()));
				local17.method4388(local17.aClass12_1.anInt313);
				local17.anInt5082 = local17.aClass12_1.anInt327 << 3;
				if (local17.aClass12_1.method457()) {
					Static141.method7492(local17.anIntArray449[0], null, 0, null, local17.aByte90, local17.anIntArray450[0], local17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BI)Lclient!ln;")
	public static Class2_Sub13_Sub11 method6594(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub13_Sub11 local10 = (Class2_Sub13_Sub11) Static196.aClass65_3.method1918((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static458.aClass53_131.method1616(0, arg0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local10 = Static108.method2074(local25);
			Static196.aClass65_3.method1921((long) arg0, local10);
			return local10;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)I")
	public static int method6599(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
