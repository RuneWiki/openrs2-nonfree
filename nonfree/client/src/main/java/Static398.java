import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
	public static int anInt6550;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I[SB)[S")
	public static short[] method5107(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static462.method4615(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIII)I")
	public static int method5108(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg0 & 0xF;
		@Pc(21) int local21 = local12 < 8 ? arg2 : arg1;
		@Pc(40) int local40 = local12 < 4 ? arg1 : local12 == 12 || local12 == 14 ? arg2 : arg3;
		return ((local12 & 0x2) == 0 ? local40 : -local40) + ((local12 & 0x1) == 0 ? local21 : -local21);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZLclient!qa;)V")
	public static void method5109(@OriginalArg(1) Class172 arg0) {
		if (Static438.aBoolean636) {
			Static375.method5192(arg0);
		} else {
			Static62.method1238(arg0);
		}
	}
}
