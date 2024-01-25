import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!q", name = "f", descriptor = "Lclient!kp;")
	public static Class195 aClass195_5;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "I")
	public static int anInt8208 = 0;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	public static int anInt8209 = 0;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "I")
	public static int anInt8212 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method6809(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		Static517.method7562(-1, -1, arg1, arg0);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)Z")
	public static boolean method6810() {
		if (Static429.aBoolean557) {
			try {
				if ((Boolean) Static604.method8248(Static110.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILclient!gda;ZIIILclient!n;ILclient!ua;Lclient!la;Ljava/lang/String;)V")
	public static void method6813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class114 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class225 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class6 arg8, @OriginalArg(10) Class58 arg9, @OriginalArg(11) String arg10) {
		@Pc(13) int local13;
		if (Static166.anInt3419 == 4) {
			local13 = (int) Static201.aFloat128 & 0x3FFF;
		} else {
			local13 = (int) Static201.aFloat128 + Static368.anInt7167 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg6.anInt6529 / 2, arg6.anInt6521 / 2) + 10;
		@Pc(40) int local40 = arg7 * arg7 + arg3 * arg3;
		if (local32 * local32 < local40) {
			return;
		}
		@Pc(50) int local50 = Class4_Sub27.anIntArray296[local13];
		@Pc(54) int local54 = Class4_Sub27.anIntArray297[local13];
		if (Static166.anInt3419 != 4) {
			local50 = local50 * 256 / (Static595.anInt10298 + 256);
			local54 = local54 * 256 / (Static595.anInt10298 + 256);
		}
		@Pc(85) int local85 = local50 * arg7 + arg3 * local54 >> 14;
		@Pc(96) int local96 = local54 * arg7 - local50 * arg3 >> 14;
		@Pc(103) int local103 = arg2.method2948(100, null, arg10);
		@Pc(109) int local109 = local85 - local103 / 2;
		@Pc(117) int local117 = arg2.method2952(100, arg10, null, 0);
		if (-arg6.anInt6529 <= local109 && arg6.anInt6529 >= local109 && local96 >= -arg6.anInt6521 && local96 <= arg6.anInt6521) {
			arg9.method8159(0, arg1, arg5, null, arg10, local103, 0, arg0, arg8, arg6.anInt6521 / 2 + arg5 - arg4 - local96 - local117, null, 50, arg6.anInt6529 / 2 + local109 + arg0, 0, 1);
		}
	}
}
