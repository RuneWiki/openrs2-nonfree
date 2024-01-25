import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "Lclient!dca;")
	public static final Class65 aClass65_5 = new Class65();

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
	public static int anInt1789 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IFFFILclient!ss;[BIIIIFIF)V")
	public static void method1584(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class267 arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(11) float arg6, @OriginalArg(12) int arg7, @OriginalArg(13) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(23) int local23;
		@Pc(67) int local67;
		for (@Pc(19) int local19 = 0; local19 < 8; local19++) {
			local23 = arg7;
			arg4.method5887(local12, arg1 * 127.0F, arg0 / (float) 16, arg3, arg6 / (float) 128, 0, arg2 / (float) 128);
			arg2 *= 2.0F;
			arg1 *= arg8;
			arg6 *= 2.0F;
			arg0 *= 2.0F;
			for (local67 = 0; local67 < 16384; local67++) {
				arg5[local23] = (byte) ((float) arg5[local23] + local12[local67]);
				local23++;
			}
		}
		local23 = arg7;
		for (local67 = 0; local67 < 16384; local67++) {
			arg5[local23] -= -127;
			local23++;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BII)V")
	public static void method1586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub7_Sub19 local15 = Static73.method5992(15, 0);
		local15.method7363();
		local15.anInt9377 = arg1;
		local15.anInt9381 = arg0;
	}
}
