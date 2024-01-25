import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
	public static int anInt10105 = -1;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)Z")
	public static boolean method8661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIBILclient!l;)V")
	public static void method8662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class4_Sub1_Sub2_Sub1_Sub2 arg2) {
		@Pc(14) int local14 = arg2.anIntArray310[0];
		@Pc(19) int local19 = arg2.anIntArray309[0];
		if (local14 < 0 || Static634.anInt10129 <= local14 || local19 < 0 || Static638.anInt10172 <= local19 || (arg0 < 0 || arg0 >= Static634.anInt10129 || arg1 < 0 || Static638.anInt10172 <= arg1)) {
			return;
		}
		@Pc(76) int local76 = Static585.method8266(arg2.method5059(), true, Static271.aClass105Array1[arg2.aByte123], 0, -4, arg0, 0, 0, local19, 0, arg1, Static259.anIntArray252, Static449.anIntArray496, local14);
		if (local76 >= 1 && local76 <= 3) {
			for (@Pc(88) int local88 = 0; local88 < local76 - 1; local88++) {
				arg2.method5080(Static449.anIntArray496[local88], (byte) 2, Static259.anIntArray252[local88]);
			}
		}
	}
}
