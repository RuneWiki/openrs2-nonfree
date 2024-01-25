import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!sda", name = "F", descriptor = "Lclient!np;")
	public static Class227 aClass227_4;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(BLclient!aa;IILclient!sca;Lclient!pga;II)V")
	public static void method7605(@OriginalArg(1) Class1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class302 arg3, @OriginalArg(5) Class32 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static334.anInt6354 == 4) {
			local14 = (int) Static284.aFloat164 & 0x3FFF;
		} else {
			local14 = Static298.anInt6417 + (int) Static284.aFloat164 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg3.anInt8801 / 2, arg3.anInt8814 / 2) + 10;
		@Pc(49) int local49 = arg6 * arg6 + arg1 * arg1;
		if (local49 > local35 * local35) {
			return;
		}
		@Pc(59) int local59 = Class100_Sub1.anIntArray428[local14];
		@Pc(63) int local63 = Class100_Sub1.anIntArray429[local14];
		if (Static334.anInt6354 != 4) {
			local59 = local59 * 256 / (Static620.anInt10702 + 256);
			local63 = local63 * 256 / (Static620.anInt10702 + 256);
		}
		@Pc(92) int local92 = local59 * arg1 + arg6 * local63 >> 14;
		@Pc(103) int local103 = arg1 * local63 - local59 * arg6 >> 14;
		arg4.method5075(arg5 + arg3.anInt8801 / 2 + local92 - arg4.method5080() / 2, arg3.anInt8814 / 2 + arg2 + -local103 + -(arg4.method5079() / 2), arg0, arg5, arg2);
	}
}
