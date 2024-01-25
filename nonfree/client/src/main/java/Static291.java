import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!kfa", name = "j", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_83 = new Class288(18, 0);

	@OriginalMember(owner = "client!kfa", name = "k", descriptor = "Lclient!fha;")
	public static final Class109 aClass109_15 = new Class109();

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)[Lclient!mha;")
	public static Class222[] method1822() {
		return new Class222[] { Static568.aClass222_17, Static52.aClass222_7, Static589.aClass222_18, Static241.aClass222_10, Static337.aClass222_14, Static457.aClass222_12, Static611.aClass222_19, Static437.aClass222_11, Static476.aClass222_13, Static58.aClass222_8, Static531.aClass222_15, Static546.aClass222_16, Static12.aClass222_1, Static13.aClass222_2 };
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "([B[BIIIBIII)V")
	public static void method1826(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(26) int local26 = -arg6; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local10; local30 < 0; local30++) {
				local34 = arg4++;
				arg1[local34] = (byte) (arg1[local34] - arg0[arg2++]);
				@Pc(47) int local47 = arg4++;
				arg1[local47] = (byte) (arg1[local47] - arg0[arg2++]);
				@Pc(60) int local60 = arg4++;
				arg1[local60] = (byte) (arg1[local60] - arg0[arg2++]);
				@Pc(73) int local73 = arg4++;
				arg1[local73] = (byte) (arg1[local73] - arg0[arg2++]);
			}
			for (@Pc(89) int local89 = local15; local89 < 0; local89++) {
				local34 = arg4++;
				arg1[local34] = (byte) (arg1[local34] - arg0[arg2++]);
			}
			arg2 += arg7;
			arg4 += arg5;
		}
	}
}
