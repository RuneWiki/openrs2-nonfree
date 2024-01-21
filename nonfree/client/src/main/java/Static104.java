import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Lclient!jg;")
	public static Class44 aClass44_20;

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
	public static int anInt2509;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!kb;")
	public static Class46 aClass46_827 = Static65.method1172("Lade Texturen )2 ");

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "Lclient!kb;")
	private static Class46 aClass46_828 = Static65.method1172("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!kb;")
	public static Class46 aClass46_829 = aClass46_828;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
	public static int[] anIntArray251 = new int[1000];

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "Lclient!kb;")
	public static Class46 aClass46_830 = Static65.method1172("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!kb;")
	private static Class46 aClass46_831 = Static65.method1172("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "Lclient!kb;")
	public static Class46 aClass46_832 = aClass46_831;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method1714() {
		@Pc(8) int[] local8 = new int[Static139.anInt3222];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static139.anInt3222; local12++) {
			@Pc(20) Class3_Sub2_Sub14 local20 = Static146.method2432(local12);
			if (local20.anInt3330 >= 0 || local20.anInt3332 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static96.anIntArray238 = new int[local10];
		for (@Pc(40) int local40 = 0; local40 < local10; local40++) {
			Static96.anIntArray238[local40] = local8[local40];
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)Lclient!sg;")
	public static Class28 method1716() {
		try {
			return (Class28) Class.forName("Class28_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(13) Throwable local13) {
			return new Class28_Sub2();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
	public static void method1718() {
		aClass46_831 = null;
		aClass46_828 = null;
		aClass46_832 = null;
		aClass44_20 = null;
		aClass46_827 = null;
		anIntArray251 = null;
		aClass46_830 = null;
		aClass46_829 = null;
	}
}
