import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
	public static int anInt1282;

	@OriginalMember(owner = "client!fi", name = "L", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!fi", name = "M", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!fi", name = "N", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_12;

	@OriginalMember(owner = "client!fi", name = "E", descriptor = "Lclient!oj;")
	public static Class84 aClass84_20 = new Class84(5);

	@OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
	public static int anInt1281 = 0;

	@OriginalMember(owner = "client!fi", name = "I", descriptor = "Lclient!hh;")
	private static Class50 aClass50_467 = Static186.method3527("Players");

	@OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
	public static int anInt1283 = 0;

	@OriginalMember(owner = "client!fi", name = "P", descriptor = "Lclient!hh;")
	public static Class50 aClass50_468 = aClass50_467;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
	public static void method986() {
		for (@Pc(7) int local7 = 0; local7 < Static25.anInt493; local7++) {
			@Pc(13) Class63 local13 = Static102.method1586(local7);
			if (local13 != null && local13.anInt2181 == 0) {
				Static66.anIntArray108[local7] = 0;
				Static24.anIntArray49[local7] = 0;
			}
		}
		Static4.aClass90_1 = new Class90(16);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(III)J")
	public static long method988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub11 local7 = Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass128_1 == null ? 0L : local7.aClass128_1.aLong169;
	}
}
