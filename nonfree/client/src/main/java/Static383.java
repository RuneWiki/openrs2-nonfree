import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
	public static int anInt6994;

	@OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
	public static int anInt6995 = 0;

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "I")
	public static int anInt6996 = -1;

	@OriginalMember(owner = "client!pn", name = "u", descriptor = "Z")
	public static boolean aBoolean493 = false;

	@OriginalMember(owner = "client!pn", name = "B", descriptor = "I")
	public static int anInt7004 = -1;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III[BIIII[B)V")
	public static void method5691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(18) int local18 = -(arg2 >> 2);
		@Pc(23) int local23 = -(arg2 & 0x3);
		for (@Pc(26) int local26 = -arg4; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local18; local30 < 0; local30++) {
				local34 = arg5++;
				arg7[local34] = (byte) (arg7[local34] - arg3[arg1++]);
				@Pc(47) int local47 = arg5++;
				arg7[local47] = (byte) (arg7[local47] - arg3[arg1++]);
				@Pc(60) int local60 = arg5++;
				arg7[local60] = (byte) (arg7[local60] - arg3[arg1++]);
				@Pc(73) int local73 = arg5++;
				arg7[local73] = (byte) (arg7[local73] - arg3[arg1++]);
			}
			for (@Pc(89) int local89 = local23; local89 < 0; local89++) {
				local34 = arg5++;
				arg7[local34] = (byte) (arg7[local34] - arg3[arg1++]);
			}
			arg1 += arg0;
			arg5 += arg6;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!co;I)Lclient!vn;")
	public static Class5_Sub1 method5692(@OriginalArg(0) Class5_Sub3 arg0) {
		arg0.method4220();
		@Pc(13) int local13 = arg0.method4220();
		@Pc(19) Class5_Sub1 local19 = Static241.method4092(local13);
		local19.anInt8835 = arg0.method4220();
		@Pc(30) int local30 = arg0.method4220();
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			@Pc(38) int local38 = arg0.method4220();
			local19.method7164(local38, arg0);
		}
		local19.method7157();
		return local19;
	}
}
