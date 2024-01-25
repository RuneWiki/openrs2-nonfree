import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!jp", name = "L", descriptor = "Lclient!pr;")
	public static Class158 aClass158_2;

	@OriginalMember(owner = "client!jp", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString119 = "Connection lost.";

	@OriginalMember(owner = "client!jp", name = "J", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!jp", name = "O", descriptor = "I")
	public static int anInt3078 = 0;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIB)Z")
	public static boolean method2918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static183.aByteArrayArrayArray7[1][arg1][arg0] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(30) int local30 = Static217.aShort53 + (Static9.aShort2 - Static217.aShort53) * local7 / 100;
		@Pc(36) int local36 = arg5 * local30 >> 8;
		@Pc(43) int local43 = 16384 - arg0 & 0x3FFF;
		@Pc(50) int local50 = 16384 - arg3 & 0x3FFF;
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = local36;
		if (local43 != 0) {
			local54 = -local36 * Class1_Sub1_Sub16.anIntArray587[local43] >> 15;
			local56 = Class1_Sub1_Sub16.anIntArray586[local43] * local36 >> 15;
		}
		if (local50 != 0) {
			local52 = local56 * Class1_Sub1_Sub16.anIntArray587[local50] >> 15;
			local56 = Class1_Sub1_Sub16.anIntArray586[local50] * local56 >> 15;
		}
		Static164.anInt3425 = arg4 - local56;
		Static221.anInt4363 = arg6 - local52;
		Static5.anInt99 = arg3;
		Static107.anInt2183 = arg0;
		Static194.anInt3958 = arg1 - local54;
	}
}
