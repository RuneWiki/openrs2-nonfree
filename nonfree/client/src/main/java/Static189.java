import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
	public static int anInt4406;

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
	public static int anInt4407;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "Lclient!qe;")
	private static Class78 aClass78_749 = Static199.method3560("wave2:");

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "Lclient!qe;")
	public static Class78 aClass78_747 = aClass78_749;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "Lclient!qe;")
	public static Class78 aClass78_748 = Static199.method3560("Sprites geladen)3");

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "[I")
	public static int[] anIntArray711 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
	public static int anInt4412 = 0;

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "Lclient!qe;")
	private static Class78 aClass78_752 = Static199.method3560("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!sj", name = "o", descriptor = "Lclient!qe;")
	public static Class78 aClass78_750 = aClass78_752;

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "Lclient!qe;")
	public static Class78 aClass78_751 = aClass78_749;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
	public static void method3490() {
		@Pc(10) Object local10 = Static95.anObject3;
		synchronized (Static95.anObject3) {
			if (Static146.anInt3306 != 0) {
				Static146.anInt3306 = 1;
				try {
					Static95.anObject3.wait();
				} catch (@Pc(20) InterruptedException local20) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([BZII)I")
	public static int method3491(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(12) int local12 = arg2; local12 < arg1; local12++) {
			local5 = local5 >>> 8 ^ Class85.anIntArray694[(local5 ^ arg0[local12]) & 0xFF];
		}
		return ~local5;
	}
}
