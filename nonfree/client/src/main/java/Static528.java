import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!so", name = "F", descriptor = "I")
	public static int anInt9022;

	@OriginalMember(owner = "client!so", name = "J", descriptor = "Lclient!oi;")
	public static Class230 aClass230_2;

	@OriginalMember(owner = "client!so", name = "t", descriptor = "Lclient!aj;")
	public static Class3_Sub4_Sub1 aClass3_Sub4_Sub1_1 = null;

	@OriginalMember(owner = "client!so", name = "u", descriptor = "I")
	public static int anInt9013 = -1;

	@OriginalMember(owner = "client!so", name = "x", descriptor = "[Lclient!g;")
	public static Class96_Sub1[] aClass96_Sub1Array2 = new Class96_Sub1[0];

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIBII)V")
	public static void method7752(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class251[] local7 = Static82.aClass251Array1;
		for (@Pc(20) int local20 = 0; local20 < local7.length; local20++) {
			@Pc(26) Class251 local26 = local7[local20];
			if (local26 != null && local26.anInt7476 == 2) {
				Static344.method5775(local26.anInt7478, arg3 >> 1, local26.anInt7481 * 2, arg1 >> 1, local26.anInt7487, local26.anInt7477);
				if (Static312.anIntArray311[0] > -1 && Static101.anInt2262 % 20 < 10) {
					@Pc(71) Class24 local71 = Static203.aClass24Array9[local26.anInt7480];
					@Pc(80) int local80 = arg2 + Static312.anIntArray311[0] - 12;
					@Pc(89) int local89 = arg0 + Static312.anIntArray311[1] - 28;
					local71.method8559(local80, local89);
					Static520.method8069(local80, local89, local80 + local71.method8576(), local71.method8573() + local89);
				}
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIZ)I")
	public static int method7753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) int local21 = 65536 - Class21.anIntArray655[arg2 * 8192 / arg0] >> 1;
		return (arg1 * (65536 - local21) >> 16) + (local21 * arg3 >> 16);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IZBI)I")
	public static int method7757(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub32 local8 = Static210.method3568(arg1, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg2 >= 0 && local8.anIntArray268.length > arg2) {
			return local8.anIntArray268[arg2];
		} else {
			return -1;
		}
	}
}
