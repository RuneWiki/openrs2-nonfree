import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "Lclient!hs;")
	public static Class77 aClass77_1;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
	public static int anInt4689;

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
	public static int anInt4690 = 0;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
	public static int anInt4692 = 0;

	@OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
	public static final int anInt4695 = 1339;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)I")
	public static int method3897(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	public static void method3899() {
		Static201.aClass39_6.B(((float) Static38.aClass135_Sub1_1.anInt5111 * 0.1F + 0.7F) * 1.1523438F);
		Static201.aClass39_6.T(Static144.anInt2776, 0.69921875F, 1.2F, -50.0F, (float) -60, -50.0F);
		Static201.aClass39_6.UA(Static268.anInt4756, -1, 256);
		Static201.aClass39_6.method4567(Static48.aClass16_1);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)I")
	public static int method3900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = arg3 & 0xF;
		@Pc(16) int local16 = local7 >= 8 ? arg2 : arg0;
		@Pc(35) int local35 = local7 < 4 ? arg2 : local7 == 12 || local7 == 14 ? arg0 : arg1;
		return ((local7 & 0x1) == 0 ? local16 : -local16) + ((local7 & 0x2) == 0 ? local35 : -local35);
	}
}
