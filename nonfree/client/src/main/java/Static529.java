import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "Lclient!cs;")
	public static Class66 aClass66_9;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "F")
	public static float aFloat202;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "[Lclient!mi;")
	public static Class46[] aClass46Array18;

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "J")
	public static long aLong237;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Lclient!da;")
	public static Class68 aClass68_10;

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
	public static int anInt9630;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
	public static int anInt9623 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
	public static void method8006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class100 local7 = Static395.aClass100ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class3_Sub1_Sub2 local13 = local7.aClass3_Sub1_Sub2_1;
		@Pc(16) Class3_Sub1_Sub2 local16 = local7.aClass3_Sub1_Sub2_2;
		if (local13 != null) {
			local13.aShort108 = (short) (local13.aShort108 * arg3 / (0x10 << Static151.anInt3896 - 7));
			local13.aShort107 = (short) (local13.aShort107 * arg3 / (0x10 << Static151.anInt3896 - 7));
		}
		if (local16 != null) {
			local16.aShort108 = (short) (local16.aShort108 * arg3 / (0x10 << Static151.anInt3896 - 7));
			local16.aShort107 = (short) (local16.aShort107 * arg3 / (0x10 << Static151.anInt3896 - 7));
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZI)I")
	public static int method8008(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class2_Sub24 local16 = Static628.method9105(arg0, arg1);
		if (local16 == null) {
			return 0;
		} else if (arg2 >= 0 && arg2 < local16.anIntArray264.length) {
			return local16.anIntArray264[arg2];
		} else {
			return 0;
		}
	}
}
