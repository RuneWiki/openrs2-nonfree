import java.awt.FontMetrics;
import java.awt.Graphics;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "Lclient!ja;")
	public static Class33 aClass33_17;

	@OriginalMember(owner = "client!oa", name = "Yb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!oa", name = "ac", descriptor = "Lclient!ud;")
	public static Class59 aClass59_2;

	@OriginalMember(owner = "client!oa", name = "ec", descriptor = "Z")
	public static boolean aBoolean96;

	@OriginalMember(owner = "client!oa", name = "fc", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!oa", name = "hc", descriptor = "[I")
	public static int[] anIntArray243;

	@OriginalMember(owner = "client!oa", name = "Lb", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!oa", name = "Rb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_898 = Static23.method501(" )2> @lre@");

	@OriginalMember(owner = "client!oa", name = "jc", descriptor = "Lclient!mc;")
	private static Class42 aClass42_900 = Static23.method501("Password: ");

	@OriginalMember(owner = "client!oa", name = "dc", descriptor = "Lclient!mc;")
	public static Class42 aClass42_899 = aClass42_900;

	@OriginalMember(owner = "client!oa", name = "ic", descriptor = "I")
	public static int anInt1756 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILclient!mc;Lclient!mc;III)V")
	public static void method1232(@OriginalArg(0) int arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) Class42 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static83.anInt2216 >= 500) {
			return;
		}
		if (arg1.method1027() > 0) {
			Static36.aClass42Array6[Static83.anInt2216] = Static57.method1822(new Class42[] { arg2, Static3.aClass42_81, arg1 });
		} else {
			Static36.aClass42Array6[Static83.anInt2216] = arg2;
		}
		Static1.anIntArray1[Static83.anInt2216] = arg4;
		Static31.anIntArray347[Static83.anInt2216] = arg3;
		Static104.anIntArray398[Static83.anInt2216] = arg0;
		Static70.anIntArray248[Static83.anInt2216] = arg5;
		Static83.anInt2216++;
	}

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "(I)V")
	public static void method1233() {
		try {
			@Pc(10) Graphics local10 = Static89.aCanvas1.getGraphics();
			Static87.aClass31_34.method993(4, local10, 4);
		} catch (@Pc(18) Exception local18) {
			Static89.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "(I)V")
	public static void method1235() {
		aBigInteger2 = null;
		aClass42_899 = null;
		aByteArrayArrayArray8 = null;
		aClass42_898 = null;
		aClass42_900 = null;
		anIntArray243 = null;
		aClass59_2 = null;
		aFontMetrics1 = null;
		aClass33_17 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIII[B)V")
	public static void method1239(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		if (Static30.aClass14_1 == null) {
			return;
		}
		if (Static74.anInt1895 >= 0) {
			Static56.anInt1421 = arg1;
			if (Static74.anInt1895 == 0) {
				Static61.anInt1457 = 1;
			} else {
				@Pc(48) int local48 = Static87.method1575(Static74.anInt1895);
				@Pc(52) int local52 = local48 - Static24.anInt718;
				Static61.anInt1457 = (local52 + 3600) / arg1;
				if (Static61.anInt1457 < 1) {
					Static61.anInt1457 = 1;
				}
			}
			Static49.aBoolean78 = arg0;
			Static36.anInt904 = arg2;
			Static45.aByteArray25 = arg3;
		} else if (Static61.anInt1457 == 0) {
			Static1.method1(arg0, arg2, arg3);
		} else {
			Static49.aBoolean78 = arg0;
			Static45.aByteArray25 = arg3;
			Static36.anInt904 = arg2;
		}
	}

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "(I)V")
	public static void method1241() {
		if (Static58.aClass47_17 != null) {
			Static58.aClass47_17.method1338();
			Static58.aClass47_17 = null;
		}
		Static67.method1151();
		Static88.aClass20_1.method499();
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			Static91.aClass6Array1[local23].method114();
		}
		System.gc();
		Static97.method1700();
		Static58.anInt1434 = 0;
		Static108.anInt2750 = -1;
		Static59.method1422();
		Static12.method278(10);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)I")
	public static int method1242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20 = 65536 - Class1_Sub1_Sub1_Sub2.anIntArray143[arg1 * 1024 / arg2] >> 1;
		return (local20 * arg3 >> 16) + ((65536 - local20) * arg0 >> 16);
	}
}
