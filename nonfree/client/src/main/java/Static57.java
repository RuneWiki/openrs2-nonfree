import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_49;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
	public static int anInt1421;

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3 aClass1_Sub2_Sub8_Sub3_1;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_384 = Static81.method1507("VOLL");

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
	public static final int[] anIntArray125 = new int[1000];

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
	public static int anInt1420 = 0;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "[I")
	public static final int[] anIntArray126 = new int[1000];

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_385 = Static81.method1507(":clan:");

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
	public static int anInt1425 = 128;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
	public static int method1096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLclient!ma;)V")
	public static void method1097(@OriginalArg(1) Class1_Sub15 arg0) {
		@Pc(13) long local13 = 0L;
		if (arg0.anInt2640 == 0) {
			local13 = Static195.method3315(arg0.anInt2649, arg0.anInt2645, arg0.anInt2653);
		}
		if (arg0.anInt2640 == 1) {
			local13 = Static108.method1871(arg0.anInt2649, arg0.anInt2645, arg0.anInt2653);
		}
		if (arg0.anInt2640 == 2) {
			local13 = Static78.method1463(arg0.anInt2649, arg0.anInt2645, arg0.anInt2653);
		}
		if (arg0.anInt2640 == 3) {
			local13 = Static212.method3586(arg0.anInt2649, arg0.anInt2645, arg0.anInt2653);
		}
		@Pc(64) int local64 = 0;
		@Pc(66) int local66 = 0;
		@Pc(68) int local68 = -1;
		if (local13 != 0L) {
			local66 = (int) local13 >> 20 & 0x3;
			local64 = (int) local13 >> 14 & 0x1F;
			local68 = Integer.MAX_VALUE & (int) (local13 >>> 32);
		}
		arg0.anInt2654 = local68;
		arg0.anInt2641 = local64;
		arg0.anInt2642 = local66;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V")
	public static void method1099(@OriginalArg(0) int arg0) {
		if (Static160.anInt4679 == arg0) {
			return;
		}
		if (Static160.anInt4679 == 0) {
			Static155.method2240();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static133.anInt2970 = 0;
			Static202.anInt4523 = 0;
			Static36.anInt987 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static26.aClass53_1 != null) {
			Static26.aClass53_1.method1713();
			Static26.aClass53_1 = null;
		}
		if (Static160.anInt4679 == 25) {
			Static104.anInt2346 = 0;
			Static58.anInt1427 = 0;
			Static170.anInt3802 = 1;
			Static128.anInt2830 = 0;
			Static79.anInt1893 = 1;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static30.method579(Static101.aClass69_Sub1_75, Static44.aClass69_Sub1_34, Static8.aCanvas1);
		} else {
			Static93.method1677();
		}
		Static160.anInt4679 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method1100(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static59.aBoolean76) {
			try {
				@Pc(28) Class70 local28 = (Class70) Class.forName("Class70_Sub1").getDeclaredConstructor().newInstance();
				local28.method2244(arg0);
				return local28;
			} catch (@Pc(35) Throwable local35) {
				Static59.aBoolean76 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([BI)V")
	public static void method1101(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub7 local4 = new Class1_Sub7(arg0);
		@Pc(8) int local8 = local4.method2765();
		for (@Pc(22) int local22 = 0; local22 < local8; local22++) {
			@Pc(27) Class1_Sub6 local27 = new Class1_Sub6();
			@Pc(31) Class24 local31 = local4.method2761();
			local27.anInt879 = local4.method2765();
			local27.anInt873 = local4.method2765();
			local27.anInt872 = local4.method2771();
			local27.aClass24_216 = local31.method769();
			local27.aClass24Array5 = local31.method744(47);
			Static162.aClass87_23.method2823(local27);
		}
	}
}
