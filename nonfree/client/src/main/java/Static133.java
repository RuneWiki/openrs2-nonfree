import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "Lclient!jf;")
	public static Class1_Sub1_Sub11 aClass1_Sub1_Sub11_1;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "Lclient!ea;")
	public static Class18 aClass18_7;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1167 = Static49.method1293("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "[I")
	public static int[] anIntArray330 = new int[2000];

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	public static int anInt3471 = 0;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1168 = Static49.method1293("runes");

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
	public static final int anInt3476 = 50;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "Z")
	public static boolean aBoolean136 = false;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public static void method2568() {
		for (@Pc(14) Class1_Sub1_Sub4_Sub5 local14 = (Class1_Sub1_Sub4_Sub5) Static72.aClass4_8.method174(); local14 != null; local14 = (Class1_Sub1_Sub4_Sub5) Static72.aClass4_8.method181()) {
			if (local14.anInt2213 != Static56.anInt1784 || local14.aBoolean75) {
				local14.method3499();
			} else if (Static47.anInt1654 >= local14.anInt2214) {
				local14.method1639(Static72.anInt2243);
				if (local14.aBoolean75) {
					local14.method3499();
				} else {
					Static134.method2577(local14.anInt2213, local14.anInt2222, local14.anInt2225, local14.anInt2216, 60, local14, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[Lclient!oa;BII[BI)V")
	public static void method2569(@OriginalArg(0) int arg0, @OriginalArg(1) Class59[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17;
		for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
			for (@Pc(13) int local13 = 0; local13 < 64; local13++) {
				for (local17 = 0; local17 < 64; local17++) {
					if (arg3 + local13 > 0 && local13 + arg3 < 103 && local17 + arg5 > 0 && local17 + arg5 < 103) {
						arg1[local9].anIntArrayArray27[arg3 + local13][local17 + arg5] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(93) Class1_Sub9 local93 = new Class1_Sub9(arg4);
		for (local17 = 0; local17 < 4; local17++) {
			for (@Pc(99) int local99 = 0; local99 < 64; local99++) {
				for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
					Static162.method3328(local17, arg3 + local99, arg2, arg0, local93, local103 + arg5, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Z")
	public static boolean method2570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(16) Class1_Sub1_Sub7 local16 = Static176.method3433(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local16.method1400(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLclient!gd;)V")
	public static void method2571(@OriginalArg(1) Class1_Sub11 arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(7) int local7 = -1;
		if (arg0.anInt1927 == 0) {
			local5 = Static5.method186(arg0.anInt1935, arg0.anInt1936, arg0.anInt1924);
		}
		@Pc(20) int local20 = 0;
		if (arg0.anInt1927 == 1) {
			local5 = Static69.method1573(arg0.anInt1935, arg0.anInt1936, arg0.anInt1924);
		}
		if (arg0.anInt1927 == 2) {
			local5 = Static8.method248(arg0.anInt1935, arg0.anInt1936, arg0.anInt1924);
		}
		@Pc(48) int local48 = 0;
		if (arg0.anInt1927 == 3) {
			local5 = Static44.method1099(arg0.anInt1935, arg0.anInt1936, arg0.anInt1924);
		}
		if (local5 != 0L) {
			local20 = (int) local5 >> 14 & 0x1F;
			local7 = Integer.MAX_VALUE & (int) (local5 >>> 32);
			local48 = (int) local5 >> 20 & 0x3;
		}
		arg0.anInt1929 = local7;
		arg0.anInt1923 = local48;
		arg0.anInt1940 = local20;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
	public static void method2572() {
		aClass70_1168 = null;
		aClass18_7 = null;
		aClass1_Sub1_Sub11_1 = null;
		anIntArray330 = null;
		aClass70_1167 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method2573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(12) int local12 = (int) arg2 >> 14 & 0x1F;
		@Pc(19) int local19 = (int) arg2 >> 20 & 0x3;
		@Pc(31) int local31 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local12 == 10 || local12 == 11 || local12 == 22) {
			@Pc(48) Class1_Sub1_Sub7 local48 = Static176.method3433(local31);
			@Pc(58) int local58;
			@Pc(61) int local61;
			if (local19 == 0 || local19 == 2) {
				local58 = local48.anInt1818;
				local61 = local48.anInt1813;
			} else {
				local58 = local48.anInt1813;
				local61 = local48.anInt1818;
			}
			@Pc(72) int local72 = local48.anInt1833;
			if (local19 != 0) {
				local72 = (local72 << local19 & 0xF) + (local72 >> 4 - local19);
			}
			Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], arg0, local72, 2, 0, local58, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], arg1, 0, local61, true);
		} else {
			Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], arg0, 0, 2, local12 + 1, 0, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], arg1, local19, 0, true);
		}
		Static107.anInt3036 = Static170.anInt4392;
		Static126.anInt822 = Static15.anInt450;
		Static100.anInt2853 = 0;
		Static115.anInt3162 = 2;
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILclient!ig;I)V")
	public static void method2574(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class39 arg2, @OriginalArg(4) int arg3) {
		if (Static18.anInt491 >= 3) {
			Static155.method3009(arg3, arg0, arg2.anIntArray230, arg2.anIntArray234);
		} else {
			Static42.aClass1_Sub1_Sub1_Sub4_5.method3037(arg3, arg0, arg2.anInt2340, arg2.anInt2369, Static42.aClass1_Sub1_Sub1_Sub4_5.anInt3967 / 2, Static42.aClass1_Sub1_Sub1_Sub4_5.anInt3968 / 2, Static71.anInt2223, arg2.anIntArray230, arg2.anIntArray234);
		}
		Static26.aBooleanArray3[arg1] = true;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2575(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static156.aClass62_1);
		arg0.removeFocusListener(Static156.aClass62_1);
		Static2.anInt128 = -1;
	}
}
