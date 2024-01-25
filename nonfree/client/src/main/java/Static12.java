import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!an", name = "j", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_7 = new Class93("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!dg;)Lclient!sh;")
	public static Class79_Sub4 method422(@OriginalArg(1) Class2_Sub10 arg0) {
		return new Class79_Sub4(arg0.method4460(), arg0.method4460(), arg0.method4460(), arg0.method4460(), arg0.method4463(), arg0.method4421());
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method423(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static71.aClass93_24.method2819(Static287.anInt5816) + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static56.aClass93_16.method2819(Static287.anInt5816) + "</col>";
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IZ)V")
	public static void method424(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static127.aClass2_Sub11_Sub6_2 != null) {
			Static27.anInt6651 = Static127.aClass2_Sub11_Sub6_2.anInt2448;
		} else {
			Static27.anInt6651 = -1;
		}
		Static56.aClass216_19 = null;
		Static85.anInt1831 = 0;
		Static162.aClass146_10 = null;
		Static127.aClass2_Sub11_Sub6_2 = null;
		Static127.method1633();
		Static127.aClass216_21.method5991();
		Static120.anInt2601 = -1;
		Static262.aClass98_7 = null;
		Static25.aClass98_4 = null;
		Static167.aClass98_6 = null;
		Static127.aClass142_2 = null;
		Static2.anInt62 = -1;
		Static343.aClass98_9 = null;
		Static310.aClass31_127 = null;
		Static344.aClass98_10 = null;
		Static293.aClass98_8 = null;
		Static66.aClass98_5 = null;
		Static60.aClass98_3 = null;
		Static247.method4481();
		Static113.method2468(64, 128);
		Static145.method5964(64, 64);
		Static281.method5076(64);
		Static326.method5733(64);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!fj;)V")
	public static void method426(@OriginalArg(1) Class62_Sub1_Sub2 arg0) {
		if (arg0 instanceof Class62_Sub1_Sub2_Sub1) {
			@Pc(19) Class62_Sub1_Sub2_Sub1 local19 = (Class62_Sub1_Sub2_Sub1) arg0;
			if (local19.aClass186_1 != null) {
				Static205.method3669(local19);
			}
		} else if (arg0 instanceof Class62_Sub1_Sub2_Sub2) {
			Static187.method3375((Class62_Sub1_Sub2_Sub2) arg0);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)Z")
	public static boolean method427(@OriginalArg(1) int arg0) {
		return (arg0 & -arg0) == arg0;
	}
}
