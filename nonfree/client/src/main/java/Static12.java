import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ag", name = "fh", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_6 = new Class6(38, 5);

	@OriginalMember(owner = "client!ag", name = "Yh", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_7 = new Class6(45, 6);

	@OriginalMember(owner = "client!ag", name = "ei", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_8 = new Class6(64, 11);

	@OriginalMember(owner = "client!ag", name = "fi", descriptor = "I")
	public static int anInt658 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
	public static String[] method678(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = Static332.method5434(arg0, arg1);
		@Pc(13) String[] local13 = new String[local8 + 1];
		@Pc(15) int local15 = 0;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local8; local27++) {
			@Pc(30) int local30;
			for (local30 = local25; arg1.charAt(local30) != arg0; local30++) {
			}
			local13[local15++] = arg1.substring(local25, local30);
			local25 = local30 + 1;
		}
		local13[local8] = arg1.substring(local25);
		return local13;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IFII[BFIIFILclient!mba;IFF)V")
	public static void method680(@OriginalArg(1) float arg0, @OriginalArg(4) byte[] arg1, @OriginalArg(5) float arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) float arg5, @OriginalArg(10) Class104 arg6, @OriginalArg(12) float arg7, @OriginalArg(13) float arg8) {
		@Pc(10) float[] local10 = new float[16384];
		@Pc(47) int local47;
		@Pc(49) int local49;
		for (@Pc(20) int local20 = 0; local20 < 8; local20++) {
			arg6.method3136(local10, arg5 / (float) 16, 0, arg3, arg7 * 127.0F, arg0 / (float) 128, arg8 / (float) 128);
			local47 = arg4;
			for (local49 = 0; local49 < 16384; local49++) {
				arg1[local47] = (byte) ((float) arg1[local47] + local10[local49]);
				local47++;
			}
			arg8 *= 2.0F;
			arg5 *= 2.0F;
			arg0 *= 2.0F;
			arg7 *= arg2;
		}
		local47 = arg4;
		for (local49 = 0; local49 < 16384; local49++) {
			arg1[local47] -= -127;
			local47++;
		}
	}
}
