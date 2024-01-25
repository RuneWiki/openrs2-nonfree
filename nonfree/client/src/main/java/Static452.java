import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILclient!aa;IILclient!sba;IJII)V")
	public static void method6866(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class302 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7) {
		@Pc(11) int local11 = arg2 * arg2 + arg3 * arg3;
		if ((long) local11 > arg6) {
			return;
		}
		@Pc(35) int local35 = Math.min(arg4.anInt8909 / 2, arg4.anInt8872 / 2);
		if (local11 <= local35 * local35) {
			Static8.method485(arg5, arg2, arg7, arg4, arg1, arg3, Static188.aClass4Array3[arg0]);
			return;
		}
		local35 -= 10;
		@Pc(65) int local65;
		if (Static554.anInt9497 == 4) {
			local65 = (int) Static595.aFloat184 & 0x3FFF;
		} else {
			local65 = Static372.anInt7080 + (int) Static595.aFloat184 & 0x3FFF;
		}
		@Pc(78) int local78 = Class78_Sub2_Sub2.anIntArray270[local65];
		@Pc(82) int local82 = Class78_Sub2_Sub2.anIntArray271[local65];
		if (Static554.anInt9497 != 4) {
			local78 = local78 * 256 / (Static289.anInt10738 + 256);
			local82 = local82 * 256 / (Static289.anInt10738 + 256);
		}
		@Pc(112) int local112 = local78 * arg2 + arg3 * local82 >> 14;
		@Pc(123) int local123 = local82 * arg2 - arg3 * local78 >> 14;
		@Pc(129) double local129 = Math.atan2((double) local112, (double) local123);
		@Pc(136) int local136 = (int) (Math.sin(local129) * (double) local35);
		@Pc(143) int local143 = (int) (Math.cos(local129) * (double) local35);
		Static603.aClass4Array19[arg0].method7693((float) arg7 + (float) arg4.anInt8909 / 2.0F + (float) local136, (float) -local143 + (float) arg5 + (float) arg4.anInt8872 / 2.0F, 4096, (int) (-local129 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZLclient!eda;)V")
	public static void method6867(@OriginalArg(1) Class6_Sub17 arg0) {
		Static574.aClass163_57.method4967(arg0);
		arg0.anInt3094 = arg0.aClass6_Sub8_Sub1_2.anInt10061;
		Static120.anInt3032 += arg0.anInt3094;
		arg0.aClass6_Sub8_Sub1_2.anInt10061 = 0;
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(IIB)Z")
	public static boolean method6868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
