import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "Lclient!ok;")
	public static Class187 aClass187_4;

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_98 = new Class177(15, 8);

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "[I")
	public static final int[] anIntArray628 = new int[1000];

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!qm;Lclient!la;Lclient!ta;Lclient!ec;IILjava/lang/String;IIII)V")
	public static void method5187(@OriginalArg(0) int arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) Class24 arg3, @OriginalArg(4) Class68 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(14) int local14;
		if (Static21.anInt6762 == 4) {
			local14 = (int) Static267.aFloat83 & 0x3FFF;
		} else {
			local14 = (int) Static267.aFloat83 + Static217.anInt4366 & 0x3FFF;
		}
		@Pc(33) int local33 = Math.max(arg4.anInt2107 / 2, arg4.anInt2149 / 2) + 10;
		@Pc(41) int local41 = arg5 * arg5 + arg8 * arg8;
		if (local33 * local33 < local41) {
			return;
		}
		@Pc(51) int local51 = Class90_Sub1.anIntArray304[local14];
		@Pc(59) int local59 = Class90_Sub1.anIntArray303[local14];
		if (Static21.anInt6762 != 4) {
			local59 = local59 * 256 / (Static135.anInt3022 + 256);
			local51 = local51 * 256 / (Static135.anInt3022 + 256);
		}
		@Pc(90) int local90 = arg8 * local59 + arg5 * local51 >> 15;
		@Pc(100) int local100 = arg5 * local59 - local51 * arg8 >> 15;
		@Pc(107) int local107 = arg1.method4686(arg7, 100, null);
		@Pc(113) int local113 = local90 - local107 / 2;
		@Pc(121) int local121 = arg1.method4693(null, arg7);
		if (local113 >= -arg4.anInt2107 && arg4.anInt2107 >= local113 && -arg4.anInt2149 <= local100 && arg4.anInt2149 >= local100) {
			arg2.method5348(0, arg7, local107, 0, arg4.anInt2149 / 2 + arg0 - arg6 - local100 - local121, null, arg4.anInt2107 / 2 + local113 + arg9, arg10, arg3, null, 50, arg0, arg9);
		}
	}
}
