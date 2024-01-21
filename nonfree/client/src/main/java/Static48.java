import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ib", name = "uc", descriptor = "Lclient!ef;")
	public static Class16 aClass16_69;

	@OriginalMember(owner = "client!ib", name = "mc", descriptor = "Lclient!he;")
	private static Class26 aClass26_782 = Static6.method100("shake:");

	@OriginalMember(owner = "client!ib", name = "Yb", descriptor = "Lclient!he;")
	public static Class26 aClass26_778 = aClass26_782;

	@OriginalMember(owner = "client!ib", name = "ac", descriptor = "[Lclient!he;")
	public static Class26[] aClass26Array11 = new Class26[1000];

	@OriginalMember(owner = "client!ib", name = "cc", descriptor = "[Lclient!he;")
	public static Class26[] aClass26Array12 = new Class26[1000];

	@OriginalMember(owner = "client!ib", name = "fc", descriptor = "Lclient!he;")
	public static Class26 aClass26_779 = aClass26_782;

	@OriginalMember(owner = "client!ib", name = "gc", descriptor = "I")
	public static int anInt1575 = 1;

	@OriginalMember(owner = "client!ib", name = "hc", descriptor = "Lclient!he;")
	public static Class26 aClass26_780 = Static6.method100("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!ib", name = "ic", descriptor = "Lclient!he;")
	public static Class26 aClass26_781 = Static6.method100("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!ib", name = "lc", descriptor = "I")
	public static int anInt1578 = 0;

	@OriginalMember(owner = "client!ib", name = "rc", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_3 = new CRC32();

	@OriginalMember(owner = "client!ib", name = "vc", descriptor = "Lclient!he;")
	public static Class26 aClass26_783 = Static6.method100("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!ib", name = "wc", descriptor = "Lclient!he;")
	public static Class26 aClass26_784 = Static6.method100(" <col=00ff80>");

	@OriginalMember(owner = "client!ib", name = "xc", descriptor = "Lclient!he;")
	public static Class26 aClass26_785 = Static6.method100("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!ib", name = "yc", descriptor = "[I")
	public static int[] anIntArray151 = new int[32768];

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(JI)V")
	public static void method1028(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static133.anInt568 >= 100 && Static5.anInt3226 != 1 || Static133.anInt568 >= 200) {
			Static67.method1915(Static47.aClass26_742, Static22.aClass26_415, 0);
			return;
		}
		@Pc(44) Class26 local44 = Static111.method2010(arg0).method853();
		for (@Pc(46) int local46 = 0; local46 < Static133.anInt568; local46++) {
			if (arg0 == Static105.aLongArray8[local46]) {
				Static67.method1915(Static119.method2136(new Class26[] { local44, Static40.aClass26_647 }), Static22.aClass26_415, 0);
				return;
			}
		}
		for (@Pc(81) int local81 = 0; local81 < Static44.anInt1362; local81++) {
			if (Static14.aLongArray1[local81] == arg0) {
				Static67.method1915(Static119.method2136(new Class26[] { Static88.aClass26_1275, local44, Static60.aClass26_908 }), Static22.aClass26_415, 0);
				return;
			}
		}
		if (local44.method816(Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.aClass26_393)) {
			Static67.method1915(Static111.aClass26_1604, Static22.aClass26_415, 0);
			return;
		}
		Static33.aClass26Array9[Static133.anInt568] = local44;
		Static105.aLongArray8[Static133.anInt568] = arg0;
		Static80.anIntArray221[Static133.anInt568] = 0;
		Static55.anIntArray163[Static133.anInt568] = 0;
		Static133.anInt568++;
		Static3.anInt81 = Static71.anInt2023;
		Static107.aClass3_Sub11_Sub1_3.method1029(197);
		Static107.aClass3_Sub11_Sub1_3.method1020(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!ef;Lclient!ef;Lclient!ef;Lclient!ef;)V")
	public static void method1032(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) Class16 arg2, @OriginalArg(4) Class16 arg3) {
		Static120.aClass16_148 = arg1;
		Static14.aClass16_21 = arg2;
		Static11.aClass16_15 = arg0;
		Static96.aClass16_116 = arg3;
		Static49.aClass3_Sub14ArrayArray1 = new Class3_Sub14[Static14.aClass16_21.method579()][];
		Static116.aBooleanArray27 = new boolean[Static14.aClass16_21.method579()];
	}

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "(I)V")
	public static void method1033() {
		Static22.aClass66_9.method1971();
		Static55.aClass66_15.method1971();
	}

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "(I)V")
	public static void method1034() {
		aClass26_785 = null;
		aCRC32_3 = null;
		aClass26_781 = null;
		aClass16_69 = null;
		anIntArray151 = null;
		aClass26_779 = null;
		aClass26Array12 = null;
		aClass26_783 = null;
		aClass26_778 = null;
		aClass26_784 = null;
		aClass26_782 = null;
		aClass26Array11 = null;
		aClass26_780 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!m;ILclient!he;)I")
	public static int method1035(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(2) Class26 arg1) {
		@Pc(2) int local2 = arg0.anInt1562;
		arg0.method1008(arg1.anInt1345);
		arg0.anInt1562 += Static16.aClass47_1.method1351(arg0.aByteArray13, arg1.aByteArray7, arg0.anInt1562, arg1.anInt1345, 0);
		return arg0.anInt1562 - local2;
	}

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "(I)V")
	public static void method1037() {
		@Pc(5) Object local5 = Static18.anObject1;
		synchronized (Static18.anObject1) {
			if (Static16.anInt419 != 0) {
				Static16.anInt419 = 1;
				try {
					Static18.anObject1.wait();
				} catch (@Pc(18) InterruptedException local18) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(BI)V")
	public static void method1040(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static42.aBoolean70) {
			Static109.method1996();
		} else if (arg0 != -1 && arg0 != Static4.anInt138 && Static56.anInt1720 != 0 && !Static42.aBoolean70) {
			Static125.method2194(0, Static89.aClass16_Sub1_12, Static56.anInt1720, arg0);
		}
		Static4.anInt138 = arg0;
	}
}
