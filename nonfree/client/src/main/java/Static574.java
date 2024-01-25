import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!tha", name = "u", descriptor = "I")
	public static int anInt10017;

	@OriginalMember(owner = "client!tha", name = "g", descriptor = "[I")
	public static int[] anIntArray509 = new int[2];

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(BIII)I")
	public static int method8718(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = 255 - arg1;
		@Pc(33) int local33 = ((arg0 & 0xFF00FF) * arg1 & 0xFF00FF00 | arg1 * (arg0 & 0xFF00) & 0xFF0000) >>> 8;
		return ((local15 * (arg2 & 0xFF00) & 0xFF0000 | (arg2 & 0xFF00FF) * local15 & 0xFF00FF00) >>> 8) + local33;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(FFIIIFIIFFLclient!lt;)[B")
	public static byte[] method8719(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(5) float arg2, @OriginalArg(8) float arg3, @OriginalArg(9) float arg4, @OriginalArg(10) Class225 arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static509.method7937(arg5, arg0, arg1, arg2, arg3, 0, local10, arg4);
		return local10;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IBI)B")
	public static byte method8720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IIIIIBI)V")
	public static void method8721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static230.aClass2_Sub54_15.aClass4_Sub22_1.method7520() != 0 && arg4 != 0 && Static356.anInt6821 < 50 && arg3 != -1) {
			Static307.aClass150Array1[Static356.anInt6821++] = new Class150((byte) 1, arg3, arg4, arg0, arg2, arg1, arg5, (Class15_Sub3) null);
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!ufa;IZ)V")
	public static void method8722(@OriginalArg(0) Class2_Sub49 arg0, @OriginalArg(2) boolean arg1) {
		if (arg0.aBoolean768) {
			if (arg0.anInt10504 < 0 || Static167.method3349(arg0.anInt10498, arg0.anInt10504)) {
				if (arg1) {
					Static448.method7281(arg0.anInt10502, arg0.anInt10506, (Class278) null, arg0.anInt10499, arg0.anInt10505);
				} else {
					Static340.method5712(arg0.anInt10499, arg0.anInt10502, arg0.anInt10503, arg0.anInt10506, -1, arg0.anInt10498, arg0.anInt10505, arg0.anInt10504);
				}
				arg0.method9825();
			}
		} else if (arg0.aBoolean767 && arg0.anInt10499 >= 1 && arg0.anInt10505 >= 1 && Static222.anInt4533 - 2 >= arg0.anInt10499 && Static668.anInt11370 - 2 >= arg0.anInt10505 && (arg0.anInt10507 < 0 || Static167.method3349(arg0.anInt10496, arg0.anInt10507))) {
			if (arg1) {
				Static448.method7281(arg0.anInt10502, arg0.anInt10506, arg0.aClass278_2, arg0.anInt10499, arg0.anInt10505);
			} else {
				Static340.method5712(arg0.anInt10499, arg0.anInt10502, arg0.anInt10497, arg0.anInt10506, -1, arg0.anInt10496, arg0.anInt10505, arg0.anInt10507);
			}
			arg0.aBoolean767 = false;
			if (!arg1 && arg0.anInt10504 == arg0.anInt10507 && arg0.anInt10504 == -1) {
				arg0.method9825();
			} else if (!arg1 && arg0.anInt10504 == arg0.anInt10507 && arg0.anInt10497 == arg0.anInt10503 && arg0.anInt10498 == arg0.anInt10496) {
				arg0.method9825();
			}
		}
	}
}
