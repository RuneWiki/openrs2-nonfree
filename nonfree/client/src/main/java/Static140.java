import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_85;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
	public static int anInt3231 = 0;

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
	public static int anInt3233 = 0;

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "Lclient!i;")
	public static Class41 aClass41_890 = Static184.method2923("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
	public static int anInt3235 = 0;

	@OriginalMember(owner = "client!oc", name = "A", descriptor = "Lclient!i;")
	private static Class41 aClass41_891 = Static184.method2923(" is already on your ignore list)3");

	@OriginalMember(owner = "client!oc", name = "B", descriptor = "Lclient!i;")
	public static Class41 aClass41_892 = aClass41_891;

	@OriginalMember(owner = "client!oc", name = "C", descriptor = "Lclient!i;")
	private static Class41 aClass41_893 = Static184.method2923("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!oc", name = "E", descriptor = "Lclient!i;")
	public static Class41 aClass41_894 = aClass41_893;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBZII[Lclient!q;)V")
	public static void method2216(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class80[] arg4) {
		for (@Pc(11) int local11 = 0; local11 < arg4.length; local11++) {
			@Pc(17) Class80 local17 = arg4[local11];
			if (local17 != null && arg2 == local17.anInt3697) {
				Static52.method1007(arg1, arg3, arg0, local17);
				Static176.method2836(local17, arg0, arg3);
				if (local17.anInt3655 > local17.anInt3632 - local17.anInt3660) {
					local17.anInt3655 = local17.anInt3632 - local17.anInt3660;
				}
				if (local17.anInt3637 - local17.anInt3635 < local17.anInt3642) {
					local17.anInt3642 = local17.anInt3637 - local17.anInt3635;
				}
				if (local17.anInt3642 < 0) {
					local17.anInt3642 = 0;
				}
				if (local17.anInt3655 < 0) {
					local17.anInt3655 = 0;
				}
				if (local17.anInt3640 == 0) {
					Static96.method1670(arg1, local17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)I")
	public static int method2218(@OriginalArg(1) int arg0) {
		@Pc(23) int local23 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(33) int local33 = (local23 >>> 2 & 0x33333333) + (local23 & 0x33333333);
		@Pc(41) int local41 = (local33 >>> 4) + local33 & 0xF0F0F0F;
		@Pc(47) int local47 = local41 + (local41 >>> 8);
		@Pc(53) int local53 = local47 + (local47 >>> 16);
		return local53 & 0xFF;
	}
}
