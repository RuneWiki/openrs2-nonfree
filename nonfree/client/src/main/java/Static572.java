import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!tha", name = "e", descriptor = "Z")
	public static boolean aBoolean460 = false;

	@OriginalMember(owner = "client!tha", name = "f", descriptor = "I")
	public static int anInt6194 = 0;

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(FFIIFLclient!jf;IFII[BIIF)V")
	public static void method5297(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) Class186 arg4, @OriginalArg(7) float arg5, @OriginalArg(10) byte[] arg6, @OriginalArg(12) int arg7, @OriginalArg(13) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(60) int local60;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg4.method4095(arg8 / (float) 16, arg0 * 127.0F, arg2, 0, arg1 / (float) 128, local12, arg5 / (float) 128);
			local42 = arg7;
			arg0 *= arg3;
			arg8 *= 2.0F;
			arg1 *= 2.0F;
			arg5 *= 2.0F;
			for (local60 = 0; local60 < 16384; local60++) {
				arg6[local42] = (byte) (int) ((float) arg6[local42] + local12[local60]);
				local42++;
			}
		}
		local42 = arg7;
		for (local60 = 0; local60 < 16384; local60++) {
			arg6[local42] = (byte) (arg6[local42] + 127);
			local42++;
		}
	}

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(B)V")
	public static void method5298() {
		@Pc(12) Class5_Sub50 local12 = Static457.method6722(Static228.aClass387_45, Static80.aClass313_1);
		local12.aClass5_Sub23_Sub2_2.method8502(0);
		Static494.method7120(local12);
	}
}
