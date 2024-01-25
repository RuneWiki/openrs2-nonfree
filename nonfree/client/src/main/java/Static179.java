import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!kc", name = "J", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_94 = new Class41(35, 0);

	@OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
	public static final int anInt3213 = 328;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIBLclient!ms;)V")
	public static void method2925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class155 arg2) {
		Static53.anInt1097 = arg0;
		Static279.anInt4941 = arg1;
		Static186.aClass155_36 = arg2;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)I")
	public static int method2926(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg3 & 0xF;
		@Pc(19) int local19 = local7 >= 8 ? arg2 : arg1;
		@Pc(40) int local40 = local7 < 4 ? arg2 : local7 == 12 || local7 == 14 ? arg1 : arg0;
		return ((local7 & 0x2) == 0 ? local40 : -local40) + ((local7 & 0x1) == 0 ? local19 : -local19);
	}
}
