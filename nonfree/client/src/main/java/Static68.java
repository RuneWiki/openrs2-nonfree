import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "[I")
	public static int[] anIntArray182;

	@OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
	public static int anInt1863;

	@OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
	public static int anInt1856 = 0;

	@OriginalMember(owner = "client!ma", name = "B", descriptor = "Lclient!je;")
	private static Class40 aClass40_904 = Static69.method1231("Please enter your password)3");

	@OriginalMember(owner = "client!ma", name = "C", descriptor = "Lclient!uf;")
	public static Class77 aClass77_7 = new Class77(4096);

	@OriginalMember(owner = "client!ma", name = "G", descriptor = "Lclient!je;")
	public static Class40 aClass40_905 = Static69.method1231("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!ma", name = "R", descriptor = "Lclient!je;")
	private static Class40 aClass40_911 = Static69.method1231("Type");

	@OriginalMember(owner = "client!ma", name = "H", descriptor = "Lclient!je;")
	public static Class40 aClass40_906 = aClass40_911;

	@OriginalMember(owner = "client!ma", name = "J", descriptor = "[Lclient!je;")
	public static Class40[] aClass40Array9 = new Class40[1000];

	@OriginalMember(owner = "client!ma", name = "K", descriptor = "Lclient!je;")
	public static Class40 aClass40_907 = Static69.method1231("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!ma", name = "L", descriptor = "Lclient!je;")
	public static Class40 aClass40_908 = Static69.method1231("Art");

	@OriginalMember(owner = "client!ma", name = "N", descriptor = "Lclient!je;")
	public static Class40 aClass40_909 = aClass40_904;

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "Lclient!je;")
	public static Class40 aClass40_910 = Static69.method1231("welle2:");

	@OriginalMember(owner = "client!ma", name = "T", descriptor = "Lclient!je;")
	public static Class40 aClass40_912 = Static69.method1231("<col=ffff00>");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!fd;B)V")
	public static void method1191(@OriginalArg(0) Class24 arg0) {
		Static19.aClass24_7 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
	public static void method1192() {
		aClass40_904 = null;
		anIntArray182 = null;
		aClass40_908 = null;
		aClass40_907 = null;
		aClass40_906 = null;
		aClass40_905 = null;
		aClass40Array9 = null;
		aClass40_912 = null;
		aClass40_910 = null;
		aClass77_7 = null;
		aClass40_909 = null;
		aClass40_911 = null;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(III)I")
	public static int method1193(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub20 local12 = (Class2_Sub20) Static63.aClass77_5.method2034((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(25) int local25 = 0; local25 < local12.anIntArray265.length; local25++) {
				if (arg0 == local12.anIntArray266[local25]) {
					local23 += local12.anIntArray265[local25];
				}
			}
			return local23;
		}
	}
}
