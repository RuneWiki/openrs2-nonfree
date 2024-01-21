import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "Lclient!oa;")
	public static Class75 aClass75_8;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_9 = new Class91();

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "Lclient!oa;")
	public static Class75 aClass75_7 = new Class75(8);

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_541 = Static161.method2452(" has logged out)3");

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "Lclient!dc;")
	public static Class20 aClass20_540 = aClass20_541;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
	public static int anInt1622 = 0;

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_543 = Static161.method2452(" seconds)3");

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "Lclient!dc;")
	public static Class20 aClass20_542 = aClass20_543;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
	public static void method1218() {
		@Pc(5) int local5 = Static30.aClass5_Sub2_Sub8_1.method1333(Static118.aClass20_1208);
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < Static85.anInt1879; local7++) {
			local15 = Static30.aClass5_Sub2_Sub8_1.method1333(Static169.method2576(local7));
			if (local5 < local15) {
				local5 = local15;
			}
		}
		Static104.aBoolean95 = true;
		Static198.anInt3862 = Static85.anInt1879 * 15 + 22;
		local15 = Static85.anInt1879 * 15 + 21;
		@Pc(52) int local52 = Static175.anInt3521;
		if (Static90.anInt1933 < local52 + local15) {
			local52 = Static90.anInt1933 - local15;
		}
		local5 += 8;
		@Pc(69) int local69 = Static179.anInt3572 - local5 / 2;
		if (local5 + local69 > Static101.anInt2163) {
			local69 = Static101.anInt2163 - local5;
		}
		if (local69 < 0) {
			local69 = 0;
		}
		if (local52 < 0) {
			local52 = 0;
		}
		Static8.anInt207 = local52;
		Static218.anInt4221 = local69;
		Static130.anInt2714 = local5;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)Z")
	public static boolean method1219(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIB[B)I")
	public static int method1221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(17) int local17 = arg0; local17 < arg1; local17++) {
			local7 = local7 >>> 8 ^ Class5_Sub2_Sub2.anIntArray11[(local7 ^ arg2[local17]) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BII)V")
	public static void method1222(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static46.anInt1037 != 0 && arg1 != -1) {
			Static147.method2257(arg1, Static16.aClass23_Sub1_3, Static46.anInt1037);
			Static210.aBoolean58 = true;
		}
	}
}
