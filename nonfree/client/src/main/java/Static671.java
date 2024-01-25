import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static671 {

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Lclient!vga;")
	public static final Class392 aClass392_4 = new Class392();

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	public static int anInt10587 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)I")
	public static int method8996(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static488.anInt7680;
		if (local5 == 0) {
			return arg0 ? 0 : Static245.anInt3872;
		} else if (local5 == 1) {
			return Static245.anInt3872;
		} else if (local5 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIZIB)Z")
	public static boolean method8997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7) {
		@Pc(8) int local8 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray644[0];
		@Pc(13) int local13 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray643[0];
		if (local8 < 0 || local8 >= Static497.anInt7926 || local13 < 0 || Static646.anInt9979 <= local13) {
			return false;
		} else if (arg7 >= 0 && Static497.anInt7926 > arg7 && arg3 >= 0 && Static646.anInt9979 > arg3) {
			@Pc(88) int local88 = Static173.method8685(arg6, arg7, Static125.anIntArray151, arg4, arg5, local13, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.method7485(), arg0, local8, arg3, Static68.anIntArray87, arg2, Static455.aClass109Array1[Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139], arg1);
			if (local88 < 1) {
				return false;
			}
			Static681.anInt10651 = Static68.anIntArray87[local88 - 1];
			Static517.anInt8136 = Static125.anIntArray151[local88 - 1];
			Static216.aBoolean223 = false;
			Static71.method1569();
			return true;
		} else {
			return false;
		}
	}
}
