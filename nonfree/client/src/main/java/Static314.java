import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "F")
	public static float aFloat170;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "Lclient!pc;")
	public static Class188 aClass188_85;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)Z")
	public static boolean method4489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!v;IFBFIIIFFF[BII)V")
	public static void method4492(@OriginalArg(0) Class160 arg0, @OriginalArg(2) float arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) float arg5, @OriginalArg(9) float arg6, @OriginalArg(10) float arg7, @OriginalArg(11) byte[] arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(60) int local60;
		@Pc(74) int local74;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg0.method3658(arg1 / (float) 128, arg7 * 127.0F, local12, arg5 / (float) 128, 0, arg4, arg2 / (float) 16);
			local60 = arg3;
			arg5 *= 2.0F;
			arg2 *= 2.0F;
			arg1 *= 2.0F;
			for (local74 = 0; local74 < 16384; local74++) {
				arg8[local60] = (byte) ((float) arg8[local60] + local12[local74]);
				local60++;
			}
			arg7 *= arg6;
		}
		local60 = arg3;
		for (local74 = 0; local74 < 16384; local74++) {
			arg8[local60] = (byte) (arg8[local60] + 127);
			local60++;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLclient!pc;)I")
	public static int method4493(@OriginalArg(1) Class188 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method4296(Static406.anInt7051)) {
			local10++;
		}
		if (arg0.method4296(Static223.anInt4252)) {
			local10++;
		}
		return local10;
	}
}
