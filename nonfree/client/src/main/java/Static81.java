import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ia", name = "gb", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_25 = new Class53(64);

	@OriginalMember(owner = "client!ia", name = "hb", descriptor = "I")
	public static int anInt4472 = 0;

	@OriginalMember(owner = "client!ia", name = "ib", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_26 = new Class53(100);

	@OriginalMember(owner = "client!ia", name = "jb", descriptor = "I")
	public static int anInt4473 = 127;

	@OriginalMember(owner = "client!ia", name = "kb", descriptor = "[Lclient!mb;")
	public static final Class62[] aClass62Array134 = new Class62[100];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = arg3 * Static91.anInt2043 + arg0 * Static28.anInt641 >> 16;
		@Pc(19) int local19 = arg3 * Static28.anInt641 - arg0 * Static91.anInt2043 >> 16;
		@Pc(29) int local29 = arg1 * Static181.anInt3781 + local19 * Static36.anInt864 >> 16;
		@Pc(39) int local39 = arg1 * Static36.anInt864 - local19 * Static181.anInt3781 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static181.anInt3781 + local19 * Static36.anInt864 >> 16;
		@Pc(76) int local76 = arg2 * Static36.anInt864 - local19 * Static181.anInt3781 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > 3500 && local66 > 3500) {
			return false;
		} else if (local50 < Static14.anInt340 && local87 < Static14.anInt340) {
			return false;
		} else if (local50 > Static34.anInt822 && local87 > Static34.anInt822) {
			return false;
		} else if (local56 < Static131.anInt1516 && local93 < Static131.anInt1516) {
			return false;
		} else {
			return local56 <= Static143.anInt3031 || local93 <= Static143.anInt3031;
		}
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)Lclient!mb;")
	public static Class62 method3136(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static169.method2460(new Class62[] { Static172.aClass62_217, Static119.method1865(arg0), Static118.aClass62_910 });
		} else if (arg0 < 10000000) {
			return Static169.method2460(new Class62[] { Static107.aClass62_820, Static119.method1865(arg0 / 1000), Static216.aClass62_1546, Static118.aClass62_910 });
		} else {
			return Static169.method2460(new Class62[] { Static39.aClass62_1526, Static119.method1865(arg0 / 1000000), Static126.aClass62_985, Static118.aClass62_910 });
		}
	}
}
