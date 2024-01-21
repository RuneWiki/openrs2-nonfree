import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!bg;")
	public static Class11 aClass11_113;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
	public static int anInt3150;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
	public static int anInt3151;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "[Lclient!fd;")
	public static Class28[] aClass28Array1;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1419 = Static32.method683("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "[Lclient!lb;")
	public static Class48[] aClass48Array1 = new Class48[4];

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1420 = Static32.method683("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
	public static int anInt3154 = 0;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1421 = Static32.method683("Die Verbindung konnte");

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public static void method2438() {
		aClass49_1420 = null;
		aClass28Array1 = null;
		aClass11_113 = null;
		aClass49_1419 = null;
		aClass49_1421 = null;
		aClass48Array1 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!ic;)V")
	public static void method2439(@OriginalArg(1) Class2_Sub11 arg0) {
		@Pc(1) long local1 = 0L;
		if (arg0.anInt1554 == 0) {
			local1 = Static17.method2057(arg0.anInt1541, arg0.anInt1544, arg0.anInt1540);
		}
		if (arg0.anInt1554 == 1) {
			local1 = Static67.method1129(arg0.anInt1541, arg0.anInt1544, arg0.anInt1540);
		}
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = 0;
		if (arg0.anInt1554 == 2) {
			local1 = Static156.method2642(arg0.anInt1541, arg0.anInt1544, arg0.anInt1540);
		}
		if (arg0.anInt1554 == 3) {
			local1 = Static71.method1174(arg0.anInt1541, arg0.anInt1544, arg0.anInt1540);
		}
		if (local1 != 0L) {
			local35 = (int) local1 >> 20 & 0x3;
			local33 = Integer.MAX_VALUE & (int) (local1 >>> 32);
			local31 = (int) local1 >> 14 & 0x1F;
		}
		arg0.anInt1546 = local31;
		arg0.anInt1548 = local35;
		arg0.anInt1542 = local33;
	}
}
