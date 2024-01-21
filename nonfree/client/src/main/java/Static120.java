import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ue", name = "R", descriptor = "Lclient!ef;")
	public static Class16 aClass16_148;

	@OriginalMember(owner = "client!ue", name = "U", descriptor = "Lclient!he;")
	public static Class26 aClass26_1709 = Static6.method100("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!ue", name = "X", descriptor = "Lclient!he;")
	public static Class26 aClass26_1710 = Static6.method100("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(ILclient!nc;)Lclient!he;")
	public static Class26 method2151(@OriginalArg(1) Class3_Sub14 arg0) {
		if (Static111.method2008(Static89.method1641(arg0)) == 0) {
			return null;
		} else if (arg0.aClass26_1113 == null || arg0.aClass26_1113.method829().method839() == 0) {
			return Static27.aBoolean56 ? Static6.aClass26_87 : null;
		} else {
			return arg0.aClass26_1113;
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
	public static void method2152() {
		aClass26_1710 = null;
		aClass26_1709 = null;
		aClass16_148 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I[B)Lclient!od;")
	public static Class3_Sub1_Sub4_Sub2_Sub1 method2154(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(23) Class3_Sub1_Sub4_Sub2_Sub1 local23 = new Class3_Sub1_Sub4_Sub2_Sub1(arg0, Static57.anIntArray169, Static58.anIntArray173, Static51.anIntArray157, Static46.anIntArray148, Static110.anIntArray351, Static117.aByteArrayArray19);
			Static67.method1913();
			return local23;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)Lclient!lc;")
	public static Class42 method2156() {
		try {
			return (Class42) Class.forName("Class42_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
