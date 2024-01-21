import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ie", name = "Kb", descriptor = "I")
	public static int anInt1625;

	@OriginalMember(owner = "client!ie", name = "Nb", descriptor = "[Lclient!df;")
	public static Class2_Sub2_Sub2_Sub2[] aClass2_Sub2_Sub2_Sub2Array6;

	@OriginalMember(owner = "client!ie", name = "Pb", descriptor = "Z")
	public static boolean aBoolean71;

	@OriginalMember(owner = "client!ie", name = "ob", descriptor = "Lclient!rc;")
	public static Class74 aClass74_54 = new Class74(50);

	@OriginalMember(owner = "client!ie", name = "Lb", descriptor = "I")
	public static int anInt1626 = 99;

	@OriginalMember(owner = "client!ie", name = "Mb", descriptor = "Lclient!rc;")
	public static Class74 aClass74_55 = new Class74(64);

	@OriginalMember(owner = "client!ie", name = "Rb", descriptor = "Lclient!lf;")
	private static Class49 aClass49_837 = Static32.method683("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!ie", name = "Ob", descriptor = "Lclient!lf;")
	public static Class49 aClass49_835 = aClass49_837;

	@OriginalMember(owner = "client!ie", name = "Qb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_836 = Static32.method683("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
	public static void method1247() {
		aClass74_55 = null;
		aClass49_835 = null;
		aClass49_836 = null;
		aClass2_Sub2_Sub2_Sub2Array6 = null;
		aClass49_837 = null;
		aClass74_54 = null;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)Z")
	public static boolean method1249(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!eg;")
	public static Class24 method1250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class24_Sub1");
			@Pc(15) Class24 local15 = (Class24) local11.getDeclaredConstructor().newInstance();
			local15.method1747(arg1, arg2, arg0);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class24_Sub2 local28 = new Class24_Sub2();
			local28.method1747(arg1, arg2, arg0);
			return local28;
		}
	}
}
