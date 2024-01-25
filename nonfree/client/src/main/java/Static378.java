import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!os", name = "I", descriptor = "Lclient!jo;")
	public static Class168 aClass168_88;

	@OriginalMember(owner = "client!os", name = "U", descriptor = "I")
	public static int anInt7106;

	@OriginalMember(owner = "client!os", name = "J", descriptor = "Lclient!gl;")
	public static final Class117 aClass117_13 = new Class117(1, 5);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIII[BII[B)V")
	public static void method5980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(18) int local18 = -arg3; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg0++;
				arg5[local26] = (byte) (arg5[local26] - arg7[arg2++]);
				@Pc(39) int local39 = arg0++;
				arg5[local39] = (byte) (arg5[local39] - arg7[arg2++]);
				@Pc(52) int local52 = arg0++;
				arg5[local52] = (byte) (arg5[local52] - arg7[arg2++]);
				@Pc(65) int local65 = arg0++;
				arg5[local65] = (byte) (arg5[local65] - arg7[arg2++]);
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local26 = arg0++;
				arg5[local26] = (byte) (arg5[local26] - arg7[arg2++]);
			}
			arg0 += arg6;
			arg2 += arg4;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BLclient!iaa;)Lclient!lr;")
	public static Class206 method5983(@OriginalArg(1) Class6_Sub26 arg0) {
		@Pc(12) int local12 = arg0.method5000();
		return new Class206(local12);
	}
}
