import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!i", name = "l", descriptor = "I")
	public static int anInt1448;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Lclient!qf;")
	public static Class60 aClass60_632 = Static59.method1195("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!i", name = "c", descriptor = "Lclient!qf;")
	public static Class60 aClass60_633 = Static59.method1195("<col=ff9040>");

	@OriginalMember(owner = "client!i", name = "e", descriptor = "Lclient!qf;")
	public static Class60 aClass60_634 = Static59.method1195("sl_back");

	@OriginalMember(owner = "client!i", name = "f", descriptor = "[I")
	public static int[] anIntArray170 = new int[2048];

	@OriginalMember(owner = "client!i", name = "g", descriptor = "I")
	public static int anInt1445 = 1;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "Lclient!qf;")
	public static Class60 aClass60_635 = Static59.method1195("Hidden)2");

	@OriginalMember(owner = "client!i", name = "i", descriptor = "Lclient!la;")
	public static Class3_Sub12 aClass3_Sub12_2 = new Class3_Sub12(new byte[5000]);

	@OriginalMember(owner = "client!i", name = "j", descriptor = "I")
	public static int anInt1446 = -1;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!qf;")
	private static Class60 aClass60_637 = Static59.method1195("Ok");

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!qf;")
	public static Class60 aClass60_636 = aClass60_637;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIB)I")
	public static int method992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(44) int local44 = Static63.method1928(arg0 - 1, arg1 + -1) + Static63.method1928(arg0 - 1, arg1 + 1) + Static63.method1928(arg0 + 1, arg1 + -1) + Static63.method1928(arg0 + 1, arg1 + 1);
		@Pc(74) int local74 = Static63.method1928(arg0, arg1 - 1) + Static63.method1928(arg0, arg1 + 1) + Static63.method1928(arg0 - 1, arg1) + Static63.method1928(arg0 + 1, arg1);
		@Pc(79) int local79 = Static63.method1928(arg0, arg1);
		return local44 / 16 + local74 / 8 + local79 / 4;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method993() {
		aClass60_632 = null;
		aClass60_634 = null;
		aClass3_Sub12_2 = null;
		aClass60_633 = null;
		aClass60_637 = null;
		aClass60_636 = null;
		aClass60_635 = null;
		anIntArray170 = null;
	}
}
