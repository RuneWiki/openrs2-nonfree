import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Lclient!bd;")
	public static Class21 aClass21_2;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "Lclient!bi;")
	public static Class26 aClass26_11;

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
	public static int anInt1482;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
	public static int anInt1487;

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
	public static int anInt1486 = 0;

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V")
	public static void method1175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class126 local7 = Static111.method2159(arg0);
		@Pc(10) int local10 = local7.anInt3655;
		@Pc(13) int local13 = local7.anInt3656;
		@Pc(16) int local16 = local7.anInt3652;
		@Pc(30) int local30 = Class11.anIntArray418[local16 - local13];
		if (arg1 < 0 || arg1 > local30) {
			arg1 = 0;
		}
		local30 <<= local13;
		Static301.method4875(local30 & arg1 << local13 | Static183.anIntArray506[local10] & ~local30, local10);
	}
}
