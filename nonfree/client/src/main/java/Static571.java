import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!st", name = "h", descriptor = "Lclient!bh;")
	public static Class37 aClass37_3;

	@OriginalMember(owner = "client!st", name = "j", descriptor = "Lclient!rl;")
	public static final Class317 aClass317_64 = new Class317(8);

	@OriginalMember(owner = "client!st", name = "g", descriptor = "Z")
	public static boolean aBoolean654 = false;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BII)I")
	public static int method8147(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg0 >>> 24;
		@Pc(21) int local21 = 255 - local17;
		@Pc(39) int local39 = ((arg0 & 0xFF00FF) * local17 & 0xFF00FF00 | (arg0 & 0xFF00) * local17 & 0xFF0000) >>> 8;
		return (((arg1 & 0xFF00FF) * local21 & 0xFF00FF00 | local21 * (arg1 & 0xFF00) & 0xFF0000) >>> 8) + local39;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIFIIIILclient!ra;[BFFFF)V")
	public static void method8150(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(5) int arg2, @OriginalArg(8) Class295 arg3, @OriginalArg(9) byte[] arg4, @OriginalArg(10) float arg5, @OriginalArg(11) float arg6, @OriginalArg(12) float arg7, @OriginalArg(13) float arg8) {
		@Pc(17) float[] local17 = new float[16384];
		@Pc(22) int local22;
		@Pc(52) int local52;
		for (@Pc(19) int local19 = 0; local19 < 8; local19++) {
			local22 = arg0;
			arg3.method7349(arg6 / (float) 128, arg8 * 127.0F, arg1 / (float) 16, arg2, 0, local17, arg7 / (float) 128);
			arg6 *= 2.0F;
			for (local52 = 0; local52 < 16384; local52++) {
				arg4[local22] = (byte) (int) ((float) arg4[local22] + local17[local52]);
				local22++;
			}
			arg1 *= 2.0F;
			arg7 *= 2.0F;
			arg8 *= arg5;
		}
		local22 = arg0;
		for (local52 = 0; local52 < 16384; local52++) {
			arg4[local22] = (byte) (arg4[local22] + 127);
			local22++;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!tja;ILclient!qga;IILclient!da;Ljava/lang/String;IIILclient!aa;I)V")
	public static void method8153(@OriginalArg(0) Class350 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class299 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class68 arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class1 arg9, @OriginalArg(11) int arg10) {
		@Pc(14) int local14;
		if (Static304.anInt5410 == 4) {
			local14 = (int) Static139.aFloat16 & 0x3FFF;
		} else {
			local14 = (int) Static139.aFloat16 + Static405.anInt7023 & 0x3FFF;
		}
		@Pc(33) int local33 = Math.max(arg2.anInt8573 / 2, arg2.anInt8547 / 2) + 10;
		@Pc(41) int local41 = arg7 * arg7 + arg4 * arg4;
		if (local41 > local33 * local33) {
			return;
		}
		@Pc(52) int local52 = Class141.anIntArray207[local14];
		@Pc(56) int local56 = Class141.anIntArray208[local14];
		if (Static304.anInt5410 != 4) {
			local56 = local56 * 256 / (Static195.anInt3404 + 256);
			local52 = local52 * 256 / (Static195.anInt3404 + 256);
		}
		@Pc(87) int local87 = arg4 * local56 + local52 * arg7 >> 14;
		@Pc(97) int local97 = local56 * arg7 - local52 * arg4 >> 14;
		@Pc(104) int local104 = arg0.method8352((Class45[]) null, 100, arg6);
		@Pc(110) int local110 = local87 - local104 / 2;
		@Pc(118) int local118 = arg0.method8351(0, 100, arg6, (Class45[]) null);
		if (local110 >= -arg2.anInt8573 && arg2.anInt8573 >= local110 && local97 >= -arg2.anInt8547 && local97 <= arg2.anInt8547) {
			arg5.method9436(arg10, 50, arg1, arg8 + arg2.anInt8547 / 2 - local118 - local97 - arg3, local104, arg10 + local110 + arg2.anInt8573 / 2, arg6, arg9, 0, arg8, (int[]) null, 0, 0, (Class45[]) null, 1);
		}
	}
}
