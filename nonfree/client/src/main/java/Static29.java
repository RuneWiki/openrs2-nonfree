import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!as", name = "C", descriptor = "Lclient!jg;")
	public static Class194 aClass194_1;

	@OriginalMember(owner = "client!as", name = "I", descriptor = "Lclient!vo;")
	public static Class389 aClass389_1;

	@OriginalMember(owner = "client!as", name = "H", descriptor = "I")
	public static int anInt415 = 0;

	@OriginalMember(owner = "client!as", name = "D", descriptor = "I")
	public static int anInt417 = 0;

	@OriginalMember(owner = "client!as", name = "E", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I[BI[BIIIII)V")
	public static void method429(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) int local17 = -(arg4 >> 2);
		@Pc(22) int local22 = -(arg4 & 0x3);
		for (@Pc(25) int local25 = -arg0; local25 < 0; local25++) {
			@Pc(33) int local33;
			for (@Pc(29) int local29 = local17; local29 < 0; local29++) {
				local33 = arg7++;
				arg1[local33] = (byte) (arg1[local33] - arg3[arg5++]);
				@Pc(46) int local46 = arg7++;
				arg1[local46] = (byte) (arg1[local46] - arg3[arg5++]);
				@Pc(59) int local59 = arg7++;
				arg1[local59] = (byte) (arg1[local59] - arg3[arg5++]);
				@Pc(72) int local72 = arg7++;
				arg1[local72] = (byte) (arg1[local72] - arg3[arg5++]);
			}
			for (@Pc(93) int local93 = local22; local93 < 0; local93++) {
				local33 = arg7++;
				arg1[local33] = (byte) (arg1[local33] - arg3[arg5++]);
			}
			arg7 += arg2;
			arg5 += arg6;
		}
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(Z)V")
	public static void method431() {
		Static363.aClass378_4.method9115();
	}
}
