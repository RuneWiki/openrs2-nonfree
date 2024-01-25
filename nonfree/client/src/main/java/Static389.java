import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!pda", name = "f", descriptor = "[I")
	public static final int[] anIntArray504 = new int[5];

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method5727(@OriginalArg(1) Class14 arg0) {
		Static510.aClass139Array1 = new Class139[Static540.anIntArray254.length];
		for (@Pc(11) int local11 = 0; local11 < Static540.anIntArray254.length; local11++) {
			@Pc(22) int local22 = Static540.anIntArray254[local11];
			@Pc(27) Class327 local27 = Static18.method427(local22, Static1.aClass251_127);
			@Pc(35) Class92 local35 = arg0.method6854(local27, Static604.method3618(Static400.aClass251_96, local22));
			Static510.aClass139Array1[local11] = new Class139(local35, local27);
		}
	}
}
