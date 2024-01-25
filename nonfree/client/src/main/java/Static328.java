import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!uo", name = "N", descriptor = "I")
	public static int anInt6445;

	@OriginalMember(owner = "client!uo", name = "M", descriptor = "I")
	public static int anInt6444 = 0;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V")
	public static void method5394() {
		@Pc(9) Class154 local9 = Static36.aClass154_8;
		synchronized (Static36.aClass154_8) {
			Static36.aClass154_8.method4220(5);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BLclient!fd;)V")
	public static void method5395(@OriginalArg(1) Class72 arg0) {
		@Pc(12) Class72 local12 = Static319.method5289(arg0);
		@Pc(17) int local17;
		@Pc(20) int local20;
		if (local12 == null) {
			local20 = Static38.anInt832;
			local17 = Static202.anInt4258;
		} else {
			local17 = local12.anInt1829;
			local20 = local12.anInt1806;
		}
		Static27.method475(arg0, false, local17, local20);
		Static194.method3525(local20, local17, arg0);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BIII)I")
	public static int method5397(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg1 >> 2 << 10) + (arg0 >> 5 << 7) + (arg2 >> 1);
	}
}
