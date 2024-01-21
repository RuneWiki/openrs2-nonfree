import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "Lclient!dc;")
	public static Class14 aClass14_2;

	@OriginalMember(owner = "client!ma", name = "G", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!ma", name = "M", descriptor = "Lclient!sf;")
	public static Class5 aClass5_17;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
	public static int anInt538 = 0;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "Lclient!sc;")
	public static Class66 aClass66_320 = Static106.method1849("mod_icons");

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!sc;")
	public static Class66 aClass66_321 = Static106.method1849("(Y<)4col>");

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "Lclient!sc;")
	private static Class66 aClass66_322 = Static106.method1849("Continue");

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "Lclient!sc;")
	public static Class66 aClass66_323 = Static106.method1849("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!ma", name = "A", descriptor = "Lclient!sc;")
	public static Class66 aClass66_324 = aClass66_322;

	@OriginalMember(owner = "client!ma", name = "O", descriptor = "Lclient!sc;")
	public static Class66 aClass66_325 = Static106.method1849("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
	public static void method439() {
		aClass66_320 = null;
		aClass66_325 = null;
		aClass14_2 = null;
		aClass66_322 = null;
		aClass66_324 = null;
		aClass66_321 = null;
		aClass66_323 = null;
		aClass5_17 = null;
		aFont2 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Lclient!kc;")
	public static Class1_Sub1_Sub7 method441(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub7 local10 = (Class1_Sub1_Sub7) Static57.aClass60_54.method1745((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static116.aClass5_85.method107(arg0, 16);
		local10 = new Class1_Sub1_Sub7();
		if (local20 != null) {
			local10.method1275(new Class1_Sub12(local20));
		}
		Static57.aClass60_54.method1741((long) arg0, local10);
		return local10;
	}
}
