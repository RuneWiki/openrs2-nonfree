import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
	public static int anInt3260;

	@OriginalMember(owner = "client!qe", name = "lb", descriptor = "[[I")
	public static int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!qe", name = "Z", descriptor = "Lclient!bd;")
	public static final Class10 aClass10_90 = new Class10();

	@OriginalMember(owner = "client!qe", name = "hb", descriptor = "[I")
	public static final int[] anIntArray237 = new int[32];

	@OriginalMember(owner = "client!qe", name = "mb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1572 = Static193.method3027("yellow:");

	@OriginalMember(owner = "client!qe", name = "ob", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1574 = Static193.method3027("Malformed login packet)3");

	@OriginalMember(owner = "client!qe", name = "nb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1573 = aClass70_1574;

	@OriginalMember(owner = "client!qe", name = "pb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1575 = aClass70_1572;

	@OriginalMember(owner = "client!qe", name = "qb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1576 = aClass70_1572;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[BII)I")
	public static int method2363(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(1) int local1 = -1;
		for (@Pc(12) int local12 = arg1; local12 < arg2; local12++) {
			local1 = local1 >>> 8 ^ Class3_Sub2_Sub8.anIntArray47[(arg0[local12] ^ local1) & 0xFF];
		}
		return ~local1;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(III)J")
	public static long method2364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub6 local7 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass64_1 == null ? 0L : local7.aClass64_1.aLong78;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!b;)I")
	public static int method2365(@OriginalArg(1) Class6 arg0) {
		@Pc(17) Class3_Sub16 local17 = (Class3_Sub16) Static38.aClass40_2.method1029((long) arg0.anInt261 + ((long) arg0.anInt229 << 32));
		return local17 == null ? arg0.anInt246 : local17.anInt2100;
	}
}
