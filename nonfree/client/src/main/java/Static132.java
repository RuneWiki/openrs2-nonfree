import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
	public static int anInt3051;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
	public static volatile int anInt3052 = 0;

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
	public static int anInt3053 = 0;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public static void method2262() {
		Static22.aClass89_4.method2265();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIII)I")
	public static int method2263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg1 & 0xF;
		@Pc(14) int local14 = local7 < 8 ? arg0 : arg2;
		@Pc(37) int local37 = local7 < 4 ? arg2 : local7 == 12 || local7 == 14 ? arg0 : arg3;
		return ((local7 & 0x2) == 0 ? local37 : -local37) + ((local7 & 0x1) == 0 ? local14 : -local14);
	}
}
