import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "Lclient!tja;")
	public static final Class336 aClass336_6 = new Class336(1, -1);

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
	public static volatile int anInt2265 = -1;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I[BIIIIII[B)V")
	public static void method2080(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(23) int local23 = -(arg6 >> 2);
		@Pc(28) int local28 = -(arg6 & 0x3);
		for (@Pc(31) int local31 = -arg4; local31 < 0; local31++) {
			@Pc(39) int local39;
			for (@Pc(35) int local35 = local23; local35 < 0; local35++) {
				local39 = arg3++;
				arg7[local39] = (byte) (arg7[local39] - arg0[arg5++]);
				@Pc(52) int local52 = arg3++;
				arg7[local52] = (byte) (arg7[local52] - arg0[arg5++]);
				@Pc(65) int local65 = arg3++;
				arg7[local65] = (byte) (arg7[local65] - arg0[arg5++]);
				@Pc(78) int local78 = arg3++;
				arg7[local78] = (byte) (arg7[local78] - arg0[arg5++]);
			}
			for (@Pc(94) int local94 = local28; local94 < 0; local94++) {
				local39 = arg3++;
				arg7[local39] = (byte) (arg7[local39] - arg0[arg5++]);
			}
			arg3 += arg1;
			arg5 += arg2;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!nb;I)Lclient!gs;")
	public static Class125 method2081(@OriginalArg(0) Class28_Sub1_Sub1 arg0) {
		@Pc(9) Class125 local9;
		if (Static472.aClass125_3 == null) {
			local9 = new Class125();
		} else {
			local9 = Static472.aClass125_3;
			Static472.aClass125_3 = Static472.aClass125_3.aClass125_1;
			Static10.anInt113--;
			local9.aClass125_1 = null;
		}
		local9.aClass28_Sub1_Sub1_1 = arg0;
		return local9;
	}
}
