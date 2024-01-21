import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ec", name = "ab", descriptor = "I")
	public static int anInt977;

	@OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
	public static int anInt978;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_498 = Static32.method683("<img=1>");

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "Lclient!lf;")
	public static Class49 aClass49_499 = Static32.method683(" <col=ffff00>");

	@OriginalMember(owner = "client!ec", name = "V", descriptor = "Lclient!lf;")
	private static Class49 aClass49_501 = Static32.method683("Password: ");

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "Lclient!lf;")
	public static Class49 aClass49_500 = aClass49_501;

	@OriginalMember(owner = "client!ec", name = "W", descriptor = "Lclient!lf;")
	private static Class49 aClass49_502 = Static32.method683("button near the top of that page)3");

	@OriginalMember(owner = "client!ec", name = "Y", descriptor = "J")
	public static long aLong40 = 0L;

	@OriginalMember(owner = "client!ec", name = "db", descriptor = "Lclient!lf;")
	public static Class49 aClass49_503 = null;

	@OriginalMember(owner = "client!ec", name = "gb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_504 = aClass49_502;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!qe;")
	public static RuntimeException_Sub1 method788(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub1 local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			local8 = (RuntimeException_Sub1) arg0;
			local8.aString6 = local8.aString6 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
	public static void method789() {
		aClass49_499 = null;
		aClass49_501 = null;
		aClass49_504 = null;
		aClass49_500 = null;
		aClass49_498 = null;
		aClass49_503 = null;
		aClass49_502 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI)I")
	public static int method790(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = local7 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIBI)V")
	public static void method791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
			Static161.anInt3503 = -1;
			Static165.anInt3574 = -1;
			return;
		}
		@Pc(31) int local31 = Static18.method346(arg1, Static66.anInt1396, arg0) - arg2;
		@Pc(35) int local35 = arg0 - Static35.anInt894;
		@Pc(39) int local39 = arg1 - Static101.anInt2150;
		@Pc(43) int local43 = Class2_Sub2_Sub2_Sub4.anIntArray217[Static66.anInt1389];
		@Pc(47) int local47 = Class2_Sub2_Sub2_Sub4.anIntArray218[Static66.anInt1389];
		@Pc(51) int local51 = local31 - Static110.anInt2302;
		@Pc(63) int local63 = Class2_Sub2_Sub2_Sub4.anIntArray217[Static127.anInt2754];
		@Pc(67) int local67 = Class2_Sub2_Sub2_Sub4.anIntArray218[Static127.anInt2754];
		@Pc(77) int local77 = local35 * local67 + local39 * local63 >> 16;
		@Pc(88) int local88 = local67 * local39 - local35 * local63 >> 16;
		@Pc(90) int local90 = local77;
		@Pc(101) int local101 = local51 * local47 - local43 * local88 >> 16;
		@Pc(111) int local111 = local88 * local47 + local43 * local51 >> 16;
		if (local111 < 50) {
			Static161.anInt3503 = -1;
			Static165.anInt3574 = -1;
		} else {
			Static165.anInt3574 = (local101 << 9) / local111 + 167;
			Static161.anInt3503 = (local90 << 9) / local111 + 256;
		}
	}
}
