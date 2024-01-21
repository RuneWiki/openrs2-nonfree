import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!hb", name = "S", descriptor = "Lclient!ud;")
	public static Class5 aClass5_12;

	@OriginalMember(owner = "client!hb", name = "U", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!hb", name = "ob", descriptor = "I")
	public static int anInt935;

	@OriginalMember(owner = "client!hb", name = "wb", descriptor = "I")
	public static int anInt941;

	@OriginalMember(owner = "client!hb", name = "Ib", descriptor = "Lclient!qc;")
	public static Class47 aClass47_9;

	@OriginalMember(owner = "client!hb", name = "Ob", descriptor = "[I")
	public static int[] anIntArray182;

	@OriginalMember(owner = "client!hb", name = "W", descriptor = "Z")
	public static boolean aBoolean65 = false;

	@OriginalMember(owner = "client!hb", name = "bb", descriptor = "I")
	public static int anInt927 = 0;

	@OriginalMember(owner = "client!hb", name = "fb", descriptor = "Lclient!o;")
	public static Class40 aClass40_286 = Static13.method257("Examine @cya@");

	@OriginalMember(owner = "client!hb", name = "jb", descriptor = "Lclient!o;")
	public static Class40 aClass40_287 = Static13.method257("Loading ignore list");

	@OriginalMember(owner = "client!hb", name = "nb", descriptor = "Lclient!o;")
	public static Class40 aClass40_288 = Static13.method257("backvmid3");

	@OriginalMember(owner = "client!hb", name = "Eb", descriptor = "I")
	public static int anInt949 = 0;

	@OriginalMember(owner = "client!hb", name = "bc", descriptor = "I")
	public static int anInt965 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII)V")
	public static void method711(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = arg0 * (arg0 - 32) / arg4;
		if (local11 < 8) {
			local11 = 8;
		}
		Static93.aClass2_Sub2_Sub2_Sub3Array12[0].method1320(arg1, arg3);
		@Pc(41) int local41 = (arg0 - local11 - 32) * arg2 / (arg4 - arg0);
		Static93.aClass2_Sub2_Sub2_Sub3Array12[1].method1320(arg1, arg0 + arg3 - 16);
		Static26.method1612(arg1, arg3 + 16, 16, arg0 - 32, Static49.anInt2253);
		Static26.method1612(arg1, local41 + arg3 + 16, 16, local11, Static82.anInt1936);
		Static26.method1611(arg1, arg3 + local41 + 16, local11, Static14.anInt311);
		Static26.method1611(arg1 + 1, local41 + arg3 + 16, local11, Static14.anInt311);
		Static26.method1603(arg1, arg3 + local41 + 16, 16, Static14.anInt311);
		Static26.method1603(arg1, local41 + arg3 + 17, 16, Static14.anInt311);
		Static26.method1611(arg1 + 15, arg3 + 16 + local41, local11, Static60.anInt1519);
		Static26.method1611(arg1 + 14, local41 + arg3 - -17, local11 - 1, Static60.anInt1519);
		Static26.method1603(arg1, arg3 + local41 + local11 + 15, 16, Static60.anInt1519);
		Static26.method1603(arg1 + 1, local11 + local41 + 14 + arg3, 15, Static60.anInt1519);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method712(@OriginalArg(0) Component arg0) {
		try {
			@Pc(1) Method local1 = Static8.aMethod1;
			if (local1 != null) {
				local1.invoke(arg0, Boolean.FALSE);
			}
		} catch (@Pc(20) Throwable local20) {
		}
		arg0.addKeyListener(Static73.aClass30_1);
		arg0.addFocusListener(Static73.aClass30_1);
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)[Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4[] method715() {
		@Pc(8) Class2_Sub2_Sub2_Sub4[] local8 = new Class2_Sub2_Sub2_Sub4[Static30.anInt727];
		for (@Pc(15) int local15 = 0; local15 < Static30.anInt727; local15++) {
			@Pc(25) Class2_Sub2_Sub2_Sub4 local25 = local8[local15] = new Class2_Sub2_Sub2_Sub4();
			local25.anInt2443 = Static104.anInt2513;
			local25.anInt2445 = Static44.anInt1079;
			local25.anInt2444 = Static83.anIntArray430[local15];
			local25.anInt2441 = Static97.anIntArray503[local15];
			local25.anInt2446 = Static66.anIntArray338[local15];
			local25.anInt2442 = Static19.anIntArray86[local15];
			@Pc(55) byte[] local55 = Static91.aByteArrayArray10[local15];
			@Pc(61) int local61 = local25.anInt2446 * local25.anInt2442;
			local25.anIntArray534 = new int[local61];
			for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
				local25.anIntArray534[local67] = Static20.anIntArray92[local55[local67] & 0xFF];
			}
		}
		Static93.method1485();
		return local8;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!bb;Ljava/awt/Component;)Lclient!qa;")
	public static Class2_Sub10_Sub2 method717(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Component arg1) {
		Static13.method256(arg1, arg0);
		@Pc(12) Class2_Sub10_Sub2 local12 = new Class2_Sub10_Sub2();
		Static107.method1657(local12);
		return local12;
	}

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)V")
	public static void method719() {
		if (Static106.aClass12_1 == null) {
			return;
		}
		if (Static61.anInt1548 >= 0) {
			if (Static18.anInt432 > 0) {
				Static102.anInt2474 += Static52.anInt1175;
				Static106.aClass12_1.method1244(Static102.anInt2474, Static61.anInt1548);
				Static18.anInt432--;
				if (Static18.anInt432 == 0) {
					Static106.aClass12_1.method1241();
					Static61.anInt1548 = -1;
					Static18.anInt432 = 20;
				}
			}
		} else if (Static18.anInt432 > 0) {
			Static18.anInt432--;
			if (Static18.anInt432 == 0) {
				Static106.aClass12_1.method1251();
				Static102.anInt2474 = 0;
				if (Static24.aByteArray9 != null) {
					Static61.anInt1548 = Static27.anInt685;
					Static106.aClass12_1.method1250(Static22.aBoolean185, Static24.aByteArray9, Static27.anInt685);
					Static24.aByteArray9 = null;
				}
			}
		}
		Static106.aClass12_1.method1252();
	}

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "(I)V")
	public static void method720() {
		anIntArray182 = null;
		aClass47_9 = null;
		aClass40_288 = null;
		aByteArrayArrayArray4 = null;
		aClass5_12 = null;
		aClass40_287 = null;
		aClass40_286 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V")
	public static void method722(@OriginalArg(0) int arg0) {
		Static58.anInt1497 = arg0;
	}
}
