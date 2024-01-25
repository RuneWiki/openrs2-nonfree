import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!cl", name = "B", descriptor = "Lclient!em;")
	public static Class1_Sub8 aClass1_Sub8_1;

	@OriginalMember(owner = "client!cl", name = "J", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_15 = new Class84(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	public static void method873() {
		Static247.anInt3928 = 0;
		Static153.anInt6274 = 0;
		Static110.anInt2505 = 0;
		Static351.anInt5993 = 0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)I")
	public static int method874(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static454.anIntArray690[arg1 & 0x3] : Static84.anIntArray146[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIZIIBII)Z")
	public static boolean method875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static196.aClass26_Sub2_Sub2_Sub1_1.anIntArray590[0];
		@Pc(13) int local13 = Static196.aClass26_Sub2_Sub2_Sub1_1.anIntArray589[0];
		if (local8 < 0 || local8 >= Static135.anInt2314 || local13 < 0 || Static352.anInt6022 <= local13) {
			return false;
		} else if (arg0 >= 0 && Static135.anInt2314 > arg0 && arg7 >= 0 && arg7 < Static352.anInt6022) {
			@Pc(70) int local70 = Static119.method5888(local13, arg7, Static196.aClass26_Sub2_Sub2_Sub1_1.method5535(), arg4, arg6, arg3, Static353.anIntArray481, Static170.aClass112Array1[Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95], local8, arg1, arg0, arg2, arg5, Static425.anIntArray630);
			if (local70 < 1) {
				return false;
			}
			Static270.anInt4850 = Static425.anIntArray630[local70 - 1];
			Static3.anInt169 = Static353.anIntArray481[local70 - 1];
			Static261.aBoolean488 = false;
			Static323.method4559();
			return true;
		} else {
			return false;
		}
	}
}
