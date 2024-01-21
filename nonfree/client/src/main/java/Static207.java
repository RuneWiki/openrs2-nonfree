import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
	public static int anInt4079;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "[Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3[] aClass1_Sub2_Sub8_Sub3Array22;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!s;")
	public static final Class87 aClass87_27 = new Class87();

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1177 = Static81.method1507("mapflag");

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1178 = Static81.method1507("auf der Hautpseite)3");

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([BZ)[B")
	public static byte[] method3160(@OriginalArg(0) byte[] arg0) {
		@Pc(18) Class1_Sub7 local18 = new Class1_Sub7(arg0);
		@Pc(22) int local22 = local18.method2771();
		@Pc(26) int local26 = local18.method2793();
		if (local26 < 0 || Static212.anInt4708 != 0 && Static212.anInt4708 < local26) {
			throw new RuntimeException();
		} else if (local22 == 0) {
			@Pc(95) byte[] local95 = new byte[local26];
			local18.method2780(local26, local95);
			return local95;
		} else {
			@Pc(56) int local56 = local18.method2793();
			if (local56 < 0 || Static212.anInt4708 != 0 && local56 > Static212.anInt4708) {
				throw new RuntimeException();
			}
			@Pc(74) byte[] local74 = new byte[local56];
			if (local22 == 1) {
				Static113.method1972(local74, local56, arg0, local26);
			} else {
				Static55.aClass50_1.method1681(local18, local74);
			}
			return local74;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZIIIII)V")
	public static void method3167(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static120.anInt2672 == arg2 && Static115.anInt2583 == arg0 && (arg4 == Static80.anInt1910 || !Static30.aBoolean35)) {
			return;
		}
		Static115.anInt2583 = arg0;
		Static120.anInt2672 = arg2;
		Static80.anInt1910 = arg4;
		if (!Static30.aBoolean35) {
			Static80.anInt1910 = 0;
		}
		Static57.method1099(25);
		Static132.method2262(true, Static150.aClass24_988);
		@Pc(38) int local38 = Static127.anInt2789;
		Static127.anInt2789 = arg0 * 8 - 48;
		@Pc(46) int local46 = Static196.anInt4343;
		Static196.anInt4343 = (arg2 - 6) * 8;
		@Pc(57) int local57 = Static196.anInt4343 - local46;
		@Pc(61) int local61 = Static127.anInt2789 - local38;
		for (@Pc(67) int local67 = 0; local67 < 32768; local67++) {
			@Pc(72) Class5_Sub2_Sub2 local72 = Static148.aClass5_Sub2_Sub2Array1[local67];
			if (local72 != null) {
				for (@Pc(76) int local76 = 0; local76 < 10; local76++) {
					local72.anIntArray199[local76] -= local57;
					local72.anIntArray196[local76] -= local61;
				}
				local72.anInt2448 -= local61 * 128;
				local72.anInt2501 -= local57 * 128;
			}
		}
		for (@Pc(123) int local123 = 0; local123 < 2048; local123++) {
			@Pc(128) Class5_Sub2_Sub1 local128 = Static110.aClass5_Sub2_Sub1Array1[local123];
			if (local128 != null) {
				for (@Pc(132) int local132 = 0; local132 < 10; local132++) {
					local128.anIntArray199[local132] -= local57;
					local128.anIntArray196[local132] -= local61;
				}
				local128.anInt2448 -= local61 * 128;
				local128.anInt2501 -= local57 * 128;
			}
		}
		@Pc(177) byte local177 = 104;
		Static170.anInt3799 = arg4;
		Static87.aClass5_Sub2_Sub1_1.method1889(arg3, arg1, false);
		@Pc(187) byte local187 = 1;
		@Pc(189) byte local189 = 0;
		if (local57 < 0) {
			local177 = -1;
			local187 = -1;
			local189 = 103;
		}
		@Pc(199) byte local199 = 0;
		@Pc(201) byte local201 = 104;
		@Pc(203) byte local203 = 1;
		if (local61 < 0) {
			local201 = -1;
			local199 = 103;
			local203 = -1;
		}
		for (@Pc(216) int local216 = local189; local216 != local177; local216 += local187) {
			for (@Pc(219) int local219 = local199; local219 != local201; local219 += local203) {
				@Pc(225) int local225 = local216 + local57;
				@Pc(229) int local229 = local61 + local219;
				for (@Pc(231) int local231 = 0; local231 < 4; local231++) {
					if (local225 >= 0 && local229 >= 0 && local225 < 104 && local229 < 104) {
						Static31.aClass87ArrayArrayArray1[local231][local216][local219] = Static31.aClass87ArrayArrayArray1[local231][local225][local229];
					} else {
						Static31.aClass87ArrayArrayArray1[local231][local216][local219] = null;
					}
				}
			}
		}
		for (@Pc(299) Class1_Sub15 local299 = (Class1_Sub15) Static185.aClass87_28.method2827(); local299 != null; local299 = (Class1_Sub15) Static185.aClass87_28.method2830()) {
			local299.anInt2653 -= local61;
			local299.anInt2645 -= local57;
			if (local299.anInt2645 < 0 || local299.anInt2653 < 0 || local299.anInt2645 >= 104 || local299.anInt2653 >= 104) {
				local299.method3563();
			}
		}
		if (Static174.anInt3879 != 0) {
			Static174.anInt3879 -= local57;
			Static35.anInt4154 -= local61;
		}
		Static66.anInt1660 = 0;
		Static179.anInt3975 = -1;
		Static78.aBoolean92 = false;
		aClass87_27.method2831();
		Static201.aClass87_29.method2831();
	}
}
