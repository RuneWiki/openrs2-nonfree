import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "Lclient!db;")
	public static final Class64 aClass64_235 = new Class64(8, 6);

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "[I")
	public static int[] anIntArray450 = new int[2];

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "Lclient!db;")
	public static final Class64 aClass64_236 = new Class64(34, -1);

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "Lclient!mga;")
	public static final Class223 aClass223_40 = new Class223(20);

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(FIF[BIIIIFIIFFLclient!fq;)V")
	public static void method4414(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) float arg5, @OriginalArg(11) float arg6, @OriginalArg(12) float arg7, @OriginalArg(13) Class109 arg8) {
		@Pc(16) float[] local16 = new float[16384];
		@Pc(46) int local46;
		@Pc(48) int local48;
		for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
			arg8.method7298(arg5 / (float) 128, arg0 / (float) 128, local16, 0, arg4, arg1 * 127.0F, arg7 / (float) 16);
			local46 = arg3;
			for (local48 = 0; local48 < 16384; local48++) {
				arg2[local46] = (byte) ((float) arg2[local46] + local16[local48]);
				local46++;
			}
			arg0 *= 2.0F;
			arg7 *= 2.0F;
			arg1 *= arg6;
			arg5 *= 2.0F;
		}
		local46 = arg3;
		for (local48 = 0; local48 < 16384; local48++) {
			arg2[local46] = (byte) (arg2[local46] + 127);
			local46++;
		}
	}
}
