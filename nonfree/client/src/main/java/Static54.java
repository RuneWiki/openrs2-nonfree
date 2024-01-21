import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ke", name = "v", descriptor = "Lclient!ja;")
	public static Class33 aClass33_15;

	@OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
	public static int anInt1407;

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "Lclient!mc;")
	public static Class42 aClass42_754 = Static23.method501(": ");

	@OriginalMember(owner = "client!ke", name = "A", descriptor = "Lclient!mc;")
	public static Class42 aClass42_755 = Static23.method501("::errortest");

	@OriginalMember(owner = "client!ke", name = "E", descriptor = "Lclient!mc;")
	public static Class42 aClass42_756 = Static23.method501("Konfig geladen)3");

	@OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
	public static int anInt1409 = 0;

	@OriginalMember(owner = "client!ke", name = "H", descriptor = "Lclient!mc;")
	public static Class42 aClass42_757 = Static23.method501("(Z");

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
	public static void method989() {
		aClass42_757 = null;
		aClass42_754 = null;
		aClass42_756 = null;
		aClass33_15 = null;
		aClass42_755 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBIILclient!je;I)V")
	public static void method990(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub9 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub13 local7 = new Class1_Sub13();
		local7.anInt2213 = arg3.anInt1273;
		local7.anInt2204 = arg3.anInt1253;
		@Pc(18) int local18 = arg3.anInt1279;
		local7.anInt2211 = arg1;
		local7.anInt2210 = arg4 * 128;
		local7.anIntArray338 = arg3.anIntArray193;
		local7.anInt2219 = arg3.anInt1267 * 128;
		local7.anInt2209 = arg3.anInt1258;
		@Pc(43) int local43 = arg3.anInt1276;
		if (arg2 == 1 || arg2 == 3) {
			local18 = arg3.anInt1276;
			local43 = arg3.anInt1279;
		}
		local7.anInt2208 = (local43 + arg4) * 128;
		local7.anInt2215 = (arg0 + local18) * 128;
		local7.anInt2205 = arg0 * 128;
		if (arg3.anIntArray190 != null) {
			local7.aClass1_Sub1_Sub9_1 = arg3;
			local7.method1518();
		}
		Static73.aClass22_10.method512(local7);
		if (local7.anIntArray338 != null) {
			local7.anInt2214 = (int) ((double) (local7.anInt2204 - local7.anInt2209) * Math.random()) + local7.anInt2209;
		}
	}
}
