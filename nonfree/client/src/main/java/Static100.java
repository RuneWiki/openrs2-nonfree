import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "Lclient!ce;")
	public static Interface1 anInterface1_1;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	public static int anInt2013;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "[I")
	public static int[] anIntArray175;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "[I")
	public static int[] anIntArray174 = new int[5];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZI)V")
	public static void method1810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class1_Sub2_Sub11 local4 = Static5.method35(arg0, 6);
		local4.method2866();
		local4.anInt3315 = arg1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)Lclient!ad;")
	public static Class5 method1811(@OriginalArg(0) int arg0) {
		@Pc(15) Class5 local15 = (Class5) Static104.aClass187_62.method4527((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(26) byte[] local26 = Static110.aClass121_54.method3115(1, arg0);
		local15 = new Class5();
		local15.anInt43 = arg0;
		if (local26 != null) {
			local15.method33(new Class1_Sub14(local26));
		}
		local15.method30();
		if (local15.anInt38 == 2 && Static250.aClass142_23.method3543((long) arg0) == null) {
			Static250.aClass142_23.method3537(new Class1_Sub1(Static35.anInt3967), (long) arg0);
			Static251.aClass5Array1[Static35.anInt3967++] = local15;
		}
		Static104.aClass187_62.method4524((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
	public static void method1812() {
		Static55.aClass187_34.method4534(50);
		Static191.aClass187_101.method4534(50);
		Static116.aClass187_68.method4534(50);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)V")
	public static void method1813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 < arg2) {
			Static273.method4257(arg0, Static183.anIntArrayArray26[arg3], arg1, arg2);
		} else {
			Static273.method4257(arg2, Static183.anIntArrayArray26[arg3], arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)I")
	public static int method1817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 - 1 & arg1 >> 31;
		return local18 + ((arg1 >>> 31) + arg1) % arg0;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIIII)V")
	public static void method1818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static64.anInt1228 == 0 || arg0 == 0 || Static295.anInt5297 >= 50 || arg1 == -1) {
			return;
		}
		Static179.anIntArray290[Static295.anInt5297] = arg1;
		Static302.anIntArray470[Static295.anInt5297] = arg0;
		Static69.anIntArray452[Static295.anInt5297] = arg2;
		Static240.aClass169Array1[Static295.anInt5297] = null;
		Static142.anIntArray240[Static295.anInt5297] = 0;
		Static152.anIntArray42[Static295.anInt5297] = arg3;
		Static295.anInt5297++;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([BB)Lclient!sb;")
	public static Class1_Sub2_Sub18 method1819(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class1_Sub2_Sub18 local15 = new Class1_Sub2_Sub18();
		@Pc(20) Class1_Sub14 local20 = new Class1_Sub14(arg0);
		local20.anInt1480 = local20.aByteArray17.length - 2;
		@Pc(31) int local31 = local20.method1386();
		@Pc(41) int local41 = local20.aByteArray17.length - local31 - 2 - 12;
		local20.anInt1480 = local41;
		@Pc(48) int local48 = local20.method1392();
		local15.anInt4572 = local20.method1386();
		local15.anInt4575 = local20.method1386();
		local15.anInt4570 = local20.method1386();
		local15.anInt4574 = local20.method1386();
		@Pc(72) int local72 = local20.method1378();
		@Pc(80) int local80;
		@Pc(87) int local87;
		if (local72 > 0) {
			local15.aClass142Array1 = new Class142[local72];
			for (local80 = 0; local80 < local72; local80++) {
				local87 = local20.method1386();
				@Pc(94) Class142 local94 = new Class142(Static218.method1098(local87));
				local15.aClass142Array1[local80] = local94;
				while (local87-- > 0) {
					@Pc(106) int local106 = local20.method1392();
					@Pc(110) int local110 = local20.method1392();
					local94.method3537(new Class1_Sub1(local110), (long) local106);
				}
			}
		}
		local20.anInt1480 = 0;
		local15.aString273 = local20.method1396();
		local15.aStringArray35 = new String[local48];
		local15.anIntArray402 = new int[local48];
		local15.anIntArray403 = new int[local48];
		local80 = 0;
		while (local41 > local20.anInt1480) {
			local87 = local20.method1386();
			if (local87 == 3) {
				local15.aStringArray35[local80] = local20.method1375().intern();
			} else if (local87 >= 100 || local87 == 21 || local87 == 38 || local87 == 39) {
				local15.anIntArray403[local80] = local20.method1378();
			} else {
				local15.anIntArray403[local80] = local20.method1392();
			}
			local15.anIntArray402[local80++] = local87;
		}
		return local15;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(III)I")
	public static int method1820(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return local12 * arg1;
		} else {
			return local12;
		}
	}
}
