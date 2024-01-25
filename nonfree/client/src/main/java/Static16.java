import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ap", name = "Yb", descriptor = "Lclient!nv;")
	public static Class183 aClass183_1;

	@OriginalMember(owner = "client!ap", name = "bc", descriptor = "I")
	public static int anInt376 = 1;

	@OriginalMember(owner = "client!ap", name = "kc", descriptor = "[I")
	public static final int[] anIntArray23 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIILclient!o;Lclient!ta;IILclient!ec;)V")
	public static void method313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class137 arg3, @OriginalArg(4) Class24 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class68 arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static21.anInt6762 == 4) {
			local14 = (int) Static267.aFloat83 & 0x3FFF;
		} else {
			local14 = Static217.anInt4366 + (int) Static267.aFloat83 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg6.anInt2107 / 2, arg6.anInt2149 / 2) + 10;
		@Pc(43) int local43 = arg5 * arg5 + arg1 * arg1;
		if (local43 > local35 * local35) {
			return;
		}
		@Pc(53) int local53 = Class90_Sub1.anIntArray304[local14];
		@Pc(57) int local57 = Class90_Sub1.anIntArray303[local14];
		if (Static21.anInt6762 != 4) {
			local57 = local57 * 256 / (Static135.anInt3022 + 256);
			local53 = local53 * 256 / (Static135.anInt3022 + 256);
		}
		@Pc(88) int local88 = local57 * arg1 + local53 * arg5 >> 15;
		@Pc(99) int local99 = arg5 * local57 - local53 * arg1 >> 15;
		arg3.method5703(arg6.anInt2107 / 2 + arg0 + local88 - arg3.RA() / 2, arg6.anInt2149 / 2 + arg2 + -local99 + -(arg3.Q() / 2), arg4, arg0, arg2);
	}
}
