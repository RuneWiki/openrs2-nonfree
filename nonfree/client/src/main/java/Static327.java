import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
	public static int anInt8399;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "Z")
	public static final boolean aBoolean598 = false;

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "[I")
	public static final int[] anIntArray490 = new int[13];

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!ek;)Lclient!nda;")
	public static Class30_Sub2 method6512(@OriginalArg(1) Class4_Sub13 arg0) {
		return new Class30_Sub2(arg0.method7043(), arg0.method7043(), arg0.method7043(), arg0.method7043(), arg0.method7013(), arg0.method7013(), arg0.method7004());
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILclient!is;Lclient!f;ILclient!ua;II)V")
	public static void method6515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class155 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class67 arg5, @OriginalArg(7) int arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static300.anInt6053 == 4) {
			local14 = (int) Static189.aFloat83 & 0x3FFF;
		} else {
			local14 = (int) Static189.aFloat83 + Static136.anInt3033 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg2.anInt4806 / 2, arg2.anInt4831 / 2) + 10;
		@Pc(44) int local44 = arg0 * arg0 + arg4 * arg4;
		if (local35 * local35 < local44) {
			return;
		}
		@Pc(59) int local59 = Class262.anIntArray420[local14];
		@Pc(63) int local63 = Class262.anIntArray421[local14];
		if (Static300.anInt6053 != 4) {
			local63 = local63 * 256 / (Static273.anInt5737 + 256);
			local59 = local59 * 256 / (Static273.anInt5737 + 256);
		}
		@Pc(94) int local94 = local63 * arg0 + arg4 * local59 >> 14;
		@Pc(105) int local105 = arg4 * local63 - local59 * arg0 >> 14;
		arg3.method8045(arg1 + arg2.anInt4806 / 2 + local94 - arg3.A() / 2, arg2.anInt4831 / 2 + arg6 + -local105 - arg3.ca() / 2, arg5, arg1, arg6);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIILclient!ga;)V")
	public static void method6518(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class116 arg2) {
		Static347.aClass116ArrayArray1[arg0][arg1] = arg2;
	}
}
