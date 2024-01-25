import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "I")
	public static int anInt2797;

	@OriginalMember(owner = "client!io", name = "b", descriptor = "J")
	public static long aLong103 = 0L;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "Ljava/lang/String;")
	public static final String aString107 = "flash2:";

	@OriginalMember(owner = "client!io", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString108 = "Loaded interfaces";

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IBIII)I")
	public static int method2269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg2 & 0xF;
		@Pc(16) int local16 = local7 < 8 ? arg0 : arg1;
		@Pc(35) int local35 = local7 < 4 ? arg1 : local7 == 12 || local7 == 14 ? arg0 : arg3;
		return ((local7 & 0x1) == 0 ? local16 : -local16) + ((local7 & 0x2) == 0 ? local35 : -local35);
	}
}
