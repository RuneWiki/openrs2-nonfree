import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!ufa", name = "h", descriptor = "Lclient!ofa;")
	public static Class117 aClass117_9;

	@OriginalMember(owner = "client!ufa", name = "j", descriptor = "Lclient!av;")
	public static Class5_Sub4_Sub1 aClass5_Sub4_Sub1_3;

	@OriginalMember(owner = "client!ufa", name = "k", descriptor = "[[[Lclient!ih;")
	public static Class156[][][] aClass156ArrayArrayArray3;

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_88 = new Class181(33, 4);

	@OriginalMember(owner = "client!ufa", name = "m", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_177 = new Class136(44, 2);

	@OriginalMember(owner = "client!ufa", name = "n", descriptor = "Lclient!ro;")
	public static final Class306 aClass306_59 = new Class306();

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I[BFIFBFFFIIIILclient!cq;)V")
	public static void method8133(@OriginalArg(1) byte[] arg0, @OriginalArg(2) float arg1, @OriginalArg(4) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(8) float arg5, @OriginalArg(11) int arg6, @OriginalArg(12) int arg7, @OriginalArg(13) Class61 arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(18) int local18;
		@Pc(52) int local52;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local18 = arg7;
			arg8.method6910(local12, arg6, arg2 * 127.0F, arg3 / (float) 128, 0, arg1 / (float) 128, arg5 / (float) 16);
			arg2 *= arg4;
			arg5 *= 2.0F;
			for (local52 = 0; local52 < 16384; local52++) {
				arg0[local18] = (byte) (int) ((float) arg0[local18] + local12[local52]);
				local18++;
			}
			arg3 *= 2.0F;
			arg1 *= 2.0F;
		}
		local18 = arg7;
		for (local52 = 0; local52 < 16384; local52++) {
			arg0[local18] = (byte) (arg0[local18] + 127);
			local18++;
		}
	}
}
