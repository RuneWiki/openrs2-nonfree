import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "Lclient!bd;")
	public static Class8 aClass8_22;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "Lclient!b;")
	public static Class2_Sub2_Sub1 aClass2_Sub2_Sub1_1;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
	public static int anInt2148;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Lclient!a;")
	public static Class1 aClass1_2278 = Static94.method1596("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Lclient!cb;")
	public static Class11 aClass11_19 = new Class11(30);

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Lclient!a;")
	public static Class1 aClass1_2279 = Static94.method1596("An");

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public static volatile int anInt2146 = 0;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Lclient!a;")
	private static Class1 aClass1_2284 = Static94.method1596("Loading ignore list");

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Lclient!a;")
	public static Class1 aClass1_2280 = aClass1_2284;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!a;")
	public static Class1 aClass1_2281 = Static94.method1596("Empf-=nger:");

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	public static int anInt2147 = 0;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Lclient!a;")
	public static Class1 aClass1_2282 = Static94.method1596("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Lclient!a;")
	public static Class1 aClass1_2283 = Static94.method1596("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIII)V")
	public static void method1496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(8) int local8 = 2048 - arg3 & 0x7FF;
		@Pc(10) int local10 = 0;
		@Pc(16) int local16 = 2048 - arg0 & 0x7FF;
		@Pc(22) int local22 = arg5;
		@Pc(35) int local35;
		@Pc(31) int local31;
		@Pc(46) int local46;
		if (local16 != 0) {
			local31 = Static75.anIntArray256[local16];
			local35 = Static75.anIntArray254[local16];
			local46 = local31 * 0 - local35 * arg5 >> 16;
			local22 = local31 * arg5 + local35 * 0 >> 16;
			local10 = local46;
		}
		if (local8 != 0) {
			local31 = Static75.anIntArray256[local8];
			local35 = Static75.anIntArray254[local8];
			local46 = local31 * 0 + local22 * local35 >> 16;
			local22 = local22 * local31 - local35 * 0 >> 16;
			local1 = local46;
		}
		Static4.anInt376 = arg3;
		Static59.anInt1824 = arg2 - local10;
		Static21.anInt916 = arg1 - local1;
		Static47.anInt1561 = arg0;
		Static41.anInt1396 = arg4 - local22;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void method1497() {
		aClass1_2282 = null;
		aClass11_19 = null;
		aClass2_Sub2_Sub1_1 = null;
		aClass1_2283 = null;
		aClass1_2281 = null;
		aClass1_2280 = null;
		aClass1_2279 = null;
		aClass1_2278 = null;
		aClass1_2284 = null;
		aClass8_22 = null;
	}
}
