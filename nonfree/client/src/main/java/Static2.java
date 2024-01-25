import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
	public static int anInt5071;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Z")
	public static boolean aBoolean425 = true;

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
	public static int anInt5069 = 0;

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
	public static int anInt5070 = 0;

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
	public static int anInt5073 = 0;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "[I")
	public static final int[] anIntArray419 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BZ)V")
	public static void method4190(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static149.aBoolean278) {
			Static149.aBoolean278 = arg0;
			Static36.method673();
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V")
	public static void method4192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class57 local7 = Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null && local7.aClass2_Sub5_1 != null) {
			local7.aClass2_Sub5_1 = null;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!fd;ILclient!lg;ZIILclient!go;I)V")
	public static void method4193(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class84 arg5, @OriginalArg(7) int arg6) {
		if (arg2 == null) {
			return;
		}
		@Pc(18) int local18;
		if (Static303.anInt3065 == 4) {
			local18 = (int) Static138.aFloat35 & 0x3FFF;
		} else {
			local18 = (int) Static138.aFloat35 + Static222.anInt4620 & 0x3FFF;
		}
		@Pc(40) int local40 = Math.max(arg0.anInt1829 / 2, arg0.anInt1806 / 2) + 10;
		@Pc(49) int local49 = arg6 * arg6 + arg1 * arg1;
		if (local40 * local40 < local49) {
			return;
		}
		@Pc(63) int local63 = Class4_Sub4_Sub25.anIntArray384[local18];
		@Pc(67) int local67 = Class4_Sub4_Sub25.anIntArray383[local18];
		if (Static303.anInt3065 != 4) {
			local63 = local63 * 256 / (Static48.anInt1082 + 256);
			local67 = local67 * 256 / (Static48.anInt1082 + 256);
		}
		@Pc(96) int local96 = local63 * arg1 + local67 * arg6 >> 15;
		@Pc(106) int local106 = arg1 * local67 - arg6 * local63 >> 15;
		arg2.method5686(arg3 + arg0.anInt1829 / 2 + local96 - arg2.method5683() / 2, arg4 + arg0.anInt1806 / 2 - (local106 - -(arg2.method5691() / 2)), arg5, arg3, arg4);
	}
}
