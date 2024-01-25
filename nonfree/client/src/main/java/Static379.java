import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIII)V")
	public static void method5479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static217.anIntArrayArray28 != null) {
			Static217.anIntArrayArray28[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static651.aShortArrayArray6 != null) {
			Static651.aShortArrayArray6[arg0][arg1] = (short) arg3;
		}
		if (Static314.aByteArrayArray9 != null) {
			Static314.aByteArrayArray9[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method5480(@OriginalArg(0) Class145 arg0) {
		for (@Pc(10) Class4_Sub7 local10 = (Class4_Sub7) Static624.aClass320_8.method7605(); local10 != null; local10 = (Class4_Sub7) Static624.aClass320_8.method7608()) {
			if (local10.aBoolean358) {
				local10.method3635(arg0);
			}
		}
		if (101 <= 35) {
			method5479(61, -59, -46, -77, -61);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIB)Z")
	public static boolean method5481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
