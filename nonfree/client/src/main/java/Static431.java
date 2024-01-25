import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "Z")
	public static boolean aBoolean491 = false;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Z")
	public static boolean method5860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static367.aBoolean425) {
			return false;
		}
		@Pc(29) int local29 = arg1 >> 16;
		@Pc(33) int local33 = arg1 & 0xFFFF;
		if (Static298.aClass82ArrayArray2[local29] == null || Static298.aClass82ArrayArray2[local29][local33] == null) {
			return false;
		}
		@Pc(51) Class82 local51 = Static298.aClass82ArrayArray2[local29][local33];
		@Pc(63) Class3_Sub38 local63;
		if (arg0 == -1 && local51.anInt2252 == 0) {
			for (local63 = (Class3_Sub38) Static325.aClass193_54.method4519(); local63 != null; local63 = (Class3_Sub38) Static325.aClass193_54.method4525()) {
				if (local63.anInt5875 == 58 || local63.anInt5875 == 1006 || local63.anInt5875 == 10 || local63.anInt5875 == 45 || local63.anInt5875 == 60) {
					for (@Pc(98) Class82 local98 = Static180.method2857(local63.anInt5870); local98 != null; local98 = Static264.method3661(local98)) {
						if (local98.anInt2208 == local51.anInt2208) {
							return true;
						}
					}
				}
			}
		} else {
			for (local63 = (Class3_Sub38) Static325.aClass193_54.method4519(); local63 != null; local63 = (Class3_Sub38) Static325.aClass193_54.method4525()) {
				if (arg0 == local63.anInt5874 && local51.anInt2208 == local63.anInt5870 && (local63.anInt5875 == 58 || local63.anInt5875 == 1006 || local63.anInt5875 == 10 || local63.anInt5875 == 45 || local63.anInt5875 == 60)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
	public static void method5861(@OriginalArg(0) int arg0) {
		if (Static123.anIntArray102 == null || arg0 > Static123.anIntArray102.length) {
			Static123.anIntArray102 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(FFIIFIBFLclient!ag;FI)[B")
	public static byte[] method5862(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(4) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) Class6 arg4, @OriginalArg(9) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static69.method1263(0, arg0, arg2, local15, arg1, arg4, arg5, arg3);
		return local15;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
	public static void method5864() {
		Static106.aClass268_45.method6160();
	}
}
