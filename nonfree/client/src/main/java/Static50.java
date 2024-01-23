import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ee", name = "vb", descriptor = "Lclient!ld;")
	public static Class67 aClass67_2;

	@OriginalMember(owner = "client!ee", name = "wb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!ee", name = "zb", descriptor = "[I")
	public static int[] anIntArray70;

	@OriginalMember(owner = "client!ee", name = "eb", descriptor = "Lclient!ie;")
	public static Class53 aClass53_9 = new Class53(4);

	@OriginalMember(owner = "client!ee", name = "pb", descriptor = "[I")
	public static int[] anIntArray68 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!ee", name = "qb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_360 = Static64.method1101("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ee", name = "rb", descriptor = "Lclient!sc;")
	public static Class102 aClass102_7 = new Class102(4096);

	@OriginalMember(owner = "client!ee", name = "tb", descriptor = "Lclient!ia;")
	private static Class51 aClass51_361 = Static64.method1101(" from your ignore list first)3");

	@OriginalMember(owner = "client!ee", name = "ub", descriptor = "Lclient!ia;")
	public static Class51 aClass51_362 = aClass51_361;

	@OriginalMember(owner = "client!ee", name = "xb", descriptor = "[I")
	public static int[] anIntArray69 = new int[64];

	@OriginalMember(owner = "client!ee", name = "yb", descriptor = "I")
	public static int anInt1201 = 0;

	@OriginalMember(owner = "client!ee", name = "Ab", descriptor = "I")
	public static int anInt1202 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZII)I")
	public static int method863(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub10 local15 = (Class1_Sub10) Static23.aClass102_3.method3093((long) arg0);
		if (local15 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local15.anIntArray95.length) {
			return local15.anIntArray95[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIII)V")
	public static void method866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = arg4 << 1;
		@Pc(29) int local29 = local13 << 1;
		@Pc(33) int local33 = local13 << 2;
		@Pc(42) int local42 = local17 - (local25 - 1) * local29;
		@Pc(52) int local52 = local13 * (1 - local25) + local21;
		@Pc(56) int local56 = local17 << 2;
		@Pc(64) int local64 = local21 * 3;
		@Pc(70) int local70 = local56;
		@Pc(76) int local76 = (arg4 - 1) * local33;
		@Pc(84) int local84 = ((arg4 << 1) - 3) * local29;
		@Pc(100) int local100;
		@Pc(109) int local109;
		if (Static225.anInt4729 <= arg1 && arg1 <= Static122.anInt2710) {
			local100 = Static28.method525(Static149.anInt3252, arg3 + arg2, Static160.anInt3454);
			local109 = Static28.method525(Static149.anInt3252, arg2 - arg3, Static160.anInt3454);
			Static71.method1261(Static113.anIntArrayArray10[arg1], local109, arg0, local100);
		}
		while (local9 > 0) {
			local9--;
			local100 = arg1 - local9;
			local109 = local9 + arg1;
			if (local52 < 0) {
				while (local52 < 0) {
					local42 += local70;
					local70 += local56;
					local7++;
					local52 += local64;
					local64 += local56;
				}
			}
			if (local42 < 0) {
				local42 += local70;
				local7++;
				local52 += local64;
				local70 += local56;
				local64 += local56;
			}
			local52 += -local76;
			local76 -= local33;
			if (Static225.anInt4729 <= local109 && local100 <= Static122.anInt2710) {
				@Pc(205) int local205 = Static28.method525(Static149.anInt3252, local7 + arg2, Static160.anInt3454);
				@Pc(214) int local214 = Static28.method525(Static149.anInt3252, arg2 - local7, Static160.anInt3454);
				if (local100 >= Static225.anInt4729) {
					Static71.method1261(Static113.anIntArrayArray10[local100], local214, arg0, local205);
				}
				if (Static122.anInt2710 >= local109) {
					Static71.method1261(Static113.anIntArrayArray10[local109], local214, arg0, local205);
				}
			}
			local42 += -local84;
			local84 -= local33;
		}
	}
}
