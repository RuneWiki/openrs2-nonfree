import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!at", name = "e", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_15 = new Class163(34, -1);

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ILclient!uu;II)Lclient!nd;")
	public static Class160 method320(@OriginalArg(1) Class250 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method5806(arg1, 0);
		return local9 == null ? null : new Class160(local9);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIFFIIFIF[BFLclient!ag;II)V")
	public static void method322(@OriginalArg(2) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) float arg4, @OriginalArg(8) float arg5, @OriginalArg(9) byte[] arg6, @OriginalArg(10) float arg7, @OriginalArg(11) Class6 arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(47) int local47;
		@Pc(49) int local49;
		for (@Pc(19) int local19 = 0; local19 < 8; local19++) {
			arg8.method1787(arg1 / (float) 128, arg4 / (float) 128, arg7 * 127.0F, local12, arg5 / (float) 16, arg2, 0);
			local47 = arg3;
			for (local49 = 0; local49 < 16384; local49++) {
				arg6[local47] = (byte) ((float) arg6[local47] + local12[local49]);
				local47++;
			}
			arg4 *= 2.0F;
			arg1 *= 2.0F;
			arg5 *= 2.0F;
			arg7 *= arg0;
		}
		local47 = arg3;
		for (local49 = 0; local49 < 16384; local49++) {
			arg6[local47] = (byte) (arg6[local47] + 127);
			local47++;
		}
	}
}
