import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_53 = new Class126(122, 6);

	@OriginalMember(owner = "client!fga", name = "d", descriptor = "[I")
	public static final int[] anIntArray195 = new int[5];

	@OriginalMember(owner = "client!fga", name = "e", descriptor = "[I")
	public static final int[] anIntArray196 = new int[3];

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIZI)V")
	public static void method2752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() == 0) {
			Static585.method7868(false);
		} else {
			Static276.anInt5173 = Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402();
			Static422.method6016(true, 0);
		}
		Static91.anInt8801 = arg1;
		Static6.aBoolean11 = arg2;
		Static329.anInt1860 = arg3;
		Static574.method7086(arg0);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(I[B[BIIIIII)V")
	public static void method2753(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(15) int local15 = -(arg0 & 0x3);
		for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg4++;
				arg2[local31] = (byte) (arg2[local31] - arg1[arg3++]);
				@Pc(44) int local44 = arg4++;
				arg2[local44] = (byte) (arg2[local44] - arg1[arg3++]);
				@Pc(57) int local57 = arg4++;
				arg2[local57] = (byte) (arg2[local57] - arg1[arg3++]);
				@Pc(70) int local70 = arg4++;
				arg2[local70] = (byte) (arg2[local70] - arg1[arg3++]);
			}
			for (@Pc(86) int local86 = local15; local86 < 0; local86++) {
				local31 = arg4++;
				arg2[local31] = (byte) (arg2[local31] - arg1[arg3++]);
			}
			arg3 += arg7;
			arg4 += arg6;
		}
	}
}
