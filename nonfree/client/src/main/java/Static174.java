import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!v", name = "I", descriptor = "I")
	public static int anInt3906;

	@OriginalMember(owner = "client!v", name = "B", descriptor = "I")
	public static int anInt3902 = -1;

	@OriginalMember(owner = "client!v", name = "C", descriptor = "I")
	public static final int anInt3903 = 7759444;

	@OriginalMember(owner = "client!v", name = "J", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1425 = Static177.method3050("Location");

	@OriginalMember(owner = "client!v", name = "E", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1424 = aClass46_1425;

	@OriginalMember(owner = "client!v", name = "ab", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1428 = Static177.method3050("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!v", name = "L", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1426 = aClass46_1428;

	@OriginalMember(owner = "client!v", name = "R", descriptor = "[J")
	public static final long[] aLongArray45 = new long[32];

	@OriginalMember(owner = "client!v", name = "U", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1427 = Static177.method3050(")3");

	@OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
	public static int anInt3915 = 0;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!jd;)V")
	public static void method3006(@OriginalArg(1) Class46 arg0) {
		if (Static79.anInt1991 >= 2) {
			if (arg0.method1683(Static25.aClass46_205)) {
				System.gc();
			}
			if (arg0.method1683(Static109.aClass46_992)) {
				Static183.method1441();
			}
			if (arg0.method1683(Static40.aClass46_358)) {
				Static26.aBoolean31 = true;
			}
			if (arg0.method1683(Static91.aClass46_849)) {
				Static26.aBoolean31 = false;
			}
			arg0.method1683(Static37.aClass46_335);
			arg0.method1683(Static164.aClass46_1337);
			if (arg0.method1683(Static113.aClass46_1015)) {
				for (@Pc(60) int local60 = 0; local60 < 4; local60++) {
					for (@Pc(64) int local64 = 1; local64 < 103; local64++) {
						for (@Pc(68) int local68 = 1; local68 < 103; local68++) {
							Static29.aClass58Array1[local60].anIntArrayArray20[local64][local68] = 0;
						}
					}
				}
			}
			if (arg0.method1673(Static146.aClass46_1248) && Static89.anInt2298 != 0) {
				Static169.method2887(arg0.method1650(6).method1658());
			}
			if (arg0.method1683(Static103.aClass46_943) && Static89.anInt2298 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method1673(Static177.aClass46_1456)) {
				Static127.anInt3025 = arg0.method1650(12).method1644().method1658();
				Static105.method1982(null, 0, Static69.method1482(new Class46[] { Static125.aClass46_1095, Static127.method2240(Static127.anInt3025) }));
			}
			if (arg0.method1683(Static68.aClass46_706)) {
				Static120.aBoolean150 = true;
			}
		}
		Static90.aClass4_Sub11_Sub1_1.method1285(177);
		Static90.aClass4_Sub11_Sub1_1.method1238(arg0.method1677() - 1);
		Static90.aClass4_Sub11_Sub1_1.method1276(arg0.method1650(2));
	}
}
