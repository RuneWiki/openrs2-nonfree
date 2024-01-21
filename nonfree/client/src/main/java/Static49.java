import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!fh", name = "bb", descriptor = "Lclient!qf;")
	public static Class66 aClass66_6 = null;

	@OriginalMember(owner = "client!fh", name = "eb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_524 = Static146.method2172("Loading)3)3)3");

	@OriginalMember(owner = "client!fh", name = "cb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_522 = aClass77_524;

	@OriginalMember(owner = "client!fh", name = "db", descriptor = "Lclient!sg;")
	private static Class77 aClass77_523 = Static146.method2172("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!fh", name = "hb", descriptor = "I")
	public static int anInt1342 = 0;

	@OriginalMember(owner = "client!fh", name = "ib", descriptor = "I")
	public static int anInt1343 = 10;

	@OriginalMember(owner = "client!fh", name = "mb", descriptor = "I")
	public static int anInt1347 = 0;

	@OriginalMember(owner = "client!fh", name = "ob", descriptor = "I")
	public static int anInt1349 = 2;

	@OriginalMember(owner = "client!fh", name = "pb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_525 = aClass77_523;

	@OriginalMember(owner = "client!fh", name = "qb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_526 = Static146.method2172(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
	public static void method943() {
		aClass77_525 = null;
		aClass77_526 = null;
		aClass66_6 = null;
		aClass77_524 = null;
		aClass77_523 = null;
		aClass77_522 = null;
	}

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)V")
	public static void method944() {
		for (@Pc(4) Class2_Sub2_Sub1_Sub7 local4 = (Class2_Sub2_Sub1_Sub7) Static160.aClass10_120.method444(); local4 != null; local4 = (Class2_Sub2_Sub1_Sub7) Static160.aClass10_120.method451()) {
			if (Static54.anInt1472 != local4.anInt4192 || local4.aBoolean172) {
				local4.method3004();
			} else if (Static143.anInt3513 >= local4.anInt4186) {
				local4.method2832(Static131.anInt4359);
				if (local4.aBoolean172) {
					local4.method3004();
				} else {
					Static172.aClass60_1.method2091(local4.anInt4192, local4.anInt4184, local4.anInt4193, local4.anInt4194, 60, local4, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(III)I")
	public static int method945(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}
}
