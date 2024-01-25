import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ei", name = "M", descriptor = "Lclient!jf;")
	public static Class96 aClass96_6;

	@OriginalMember(owner = "client!ei", name = "O", descriptor = "Lclient!ra;")
	public static Class170 aClass170_24;

	@OriginalMember(owner = "client!ei", name = "Q", descriptor = "Lclient!ra;")
	public static Class170 aClass170_25;

	@OriginalMember(owner = "client!ei", name = "R", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[200];

	@OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
	public static volatile int anInt1799 = 0;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIBIIIII)V")
	public static void method1583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg4 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(34) int local34 = Static10.aShort1 + local7 * (Static123.aShort31 - Static10.aShort1) / 100;
		@Pc(40) int local40 = arg3 * local34 >> 8;
		@Pc(47) int local47 = 16384 - arg5 & 0x3FFF;
		@Pc(54) int local54 = 16384 - arg2 & 0x3FFF;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = local40;
		if (local47 != 0) {
			local58 = Class5_Sub9_Sub12.anIntArray169[local47] * -local40 >> 15;
			local60 = local40 * Class5_Sub9_Sub12.anIntArray170[local47] >> 15;
		}
		if (local54 != 0) {
			local56 = local60 * Class5_Sub9_Sub12.anIntArray169[local54] >> 15;
			local60 = Class5_Sub9_Sub12.anIntArray170[local54] * local60 >> 15;
		}
		Static311.anInt6461 = arg5;
		Static199.anInt3858 = arg2;
		Static347.anInt6471 = arg0 - local60;
		Static347.anInt6472 = arg6 - local56;
		Static339.anInt6354 = arg1 - local58;
	}
}
