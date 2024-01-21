import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
	public static int anInt1807;

	@OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
	public static int anInt1813;

	@OriginalMember(owner = "client!ma", name = "lb", descriptor = "Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 aClass3_Sub1_Sub5_Sub3_14;

	@OriginalMember(owner = "client!ma", name = "ub", descriptor = "Lclient!we;")
	public static Class62 aClass62_12;

	@OriginalMember(owner = "client!ma", name = "wb", descriptor = "[Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4[] aClass3_Sub1_Sub5_Sub4Array10;

	@OriginalMember(owner = "client!ma", name = "fb", descriptor = "Lclient!na;")
	public static Class53 aClass53_811 = Static109.method1737("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!ma", name = "gb", descriptor = "Lclient!ob;")
	public static Class3_Sub7 aClass3_Sub7_5 = new Class3_Sub7(8);

	@OriginalMember(owner = "client!ma", name = "hb", descriptor = "I")
	public static int anInt1820 = 0;

	@OriginalMember(owner = "client!ma", name = "ib", descriptor = "[[I")
	public static int[][] anIntArrayArray14 = new int[104][104];

	@OriginalMember(owner = "client!ma", name = "jb", descriptor = "I")
	public static int anInt1821 = 0;

	@OriginalMember(owner = "client!ma", name = "kb", descriptor = "Lclient!te;")
	public static Class75 aClass75_50 = new Class75(64);

	@OriginalMember(owner = "client!ma", name = "nb", descriptor = "Lclient!na;")
	private static Class53 aClass53_813 = Static109.method1737("glow1:");

	@OriginalMember(owner = "client!ma", name = "mb", descriptor = "Lclient!na;")
	public static Class53 aClass53_812 = aClass53_813;

	@OriginalMember(owner = "client!ma", name = "ob", descriptor = "Lclient!na;")
	public static Class53 aClass53_814 = Static109.method1737("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!ma", name = "pb", descriptor = "Lclient!na;")
	public static Class53 aClass53_815 = Static109.method1737("Schlie-8en");

	@OriginalMember(owner = "client!ma", name = "qb", descriptor = "Lclient!na;")
	public static Class53 aClass53_816 = aClass53_813;

	@OriginalMember(owner = "client!ma", name = "rb", descriptor = "Lclient!na;")
	public static Class53 aClass53_817 = Static109.method1737("Classic");

	@OriginalMember(owner = "client!ma", name = "sb", descriptor = "Lclient!na;")
	public static Class53 aClass53_818 = Static109.method1737("Duell akzeptieren");

	@OriginalMember(owner = "client!ma", name = "tb", descriptor = "I")
	public static int anInt1822 = 1;

	@OriginalMember(owner = "client!ma", name = "vb", descriptor = "Lclient!na;")
	public static Class53 aClass53_819 = Static109.method1737("@or2@");

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)V")
	public static void method1220() {
		aClass3_Sub1_Sub5_Sub4Array10 = null;
		aClass53_815 = null;
		aClass75_50 = null;
		aClass53_819 = null;
		aClass3_Sub1_Sub5_Sub3_14 = null;
		aClass53_812 = null;
		aClass3_Sub7_5 = null;
		aClass62_12 = null;
		aClass53_811 = null;
		aClass53_813 = null;
		anIntArrayArray14 = null;
		aClass53_814 = null;
		aClass53_816 = null;
		aClass53_817 = null;
		aClass53_818 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!qe;I)V")
	public static void method1223(@OriginalArg(0) Class3_Sub1_Sub4_Sub1 arg0) {
		if (arg0.anInt1479 == 0) {
			arg0.anInt1430 = 1024;
		}
		@Pc(22) int local22 = arg0.anInt1454 * 128 + arg0.anInt1453 * 64;
		arg0.anInt1476 = 0;
		if (arg0.anInt1479 == 1) {
			arg0.anInt1430 = 1536;
		}
		if (arg0.anInt1479 == 2) {
			arg0.anInt1430 = 0;
		}
		@Pc(49) int local49 = arg0.anInt1462 - Static27.anInt843;
		arg0.anInt1424 += (local22 - arg0.anInt1424) / local49;
		@Pc(72) int local72 = arg0.anInt1475 * 128 + arg0.anInt1453 * 64;
		arg0.anInt1427 += (local72 - arg0.anInt1427) / local49;
		if (arg0.anInt1479 == 3) {
			arg0.anInt1430 = 512;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)Lclient!na;")
	public static Class53 method1224(@OriginalArg(0) int arg0) {
		@Pc(5) Class53 local5 = Static108.method1725(arg0);
		for (@Pc(15) int local15 = local5.method1294() - 3; local15 > 0; local15 -= 3) {
			local5 = Static103.method1689(new Class53[] { local5.method1267(local15, 0), Static54.aClass53_1422, local5.method1289(local15) });
		}
		if (local5.method1294() > 8) {
			local5 = Static103.method1689(new Class53[] { Static105.aClass53_1211, local5.method1267(local5.method1294() - 8, 0), Static79.aClass53_904, Static120.aClass53_1385, local5, Static46.aClass53_1436 });
		} else if (local5.method1294() > 4) {
			local5 = Static103.method1689(new Class53[] { Static42.aClass53_539, local5.method1267(local5.method1294() - 4, 0), Static20.aClass53_255, Static120.aClass53_1385, local5, Static46.aClass53_1436 });
		}
		return Static103.method1689(new Class53[] { Static104.aClass53_1278, local5 });
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V")
	public static void method1226(@OriginalArg(0) int arg0) {
		@Pc(16) Class3_Sub18 local16 = (Class3_Sub18) Static38.aClass77_4.method1805((long) arg0);
		if (local16 != null) {
			local16.method1962();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method1227(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static6.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(23) Throwable local23) {
			}
		}
		arg0.addKeyListener(Static41.aClass5_1);
		arg0.addFocusListener(Static41.aClass5_1);
	}
}
