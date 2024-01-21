import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "[I")
	public static int[] anIntArray242;

	@OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
	public static int anInt3291;

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "[I")
	public static final int[] anIntArray243 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
	public static int anInt3286 = 0;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
	public static void method2393() {
		Static192.aClass94_12.method3157();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I")
	public static int method2395(@OriginalArg(0) int arg0) {
		if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
			return arg0 + 32;
		} else if (arg0 == 159) {
			return 255;
		} else if (arg0 == 140) {
			return 156;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIB)I")
	public static int method2396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)V")
	public static void method2397(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class3_Sub16 local12 = (Class3_Sub16) Static38.aClass40_2.method1026(); local12 != null; local12 = (Class3_Sub16) Static38.aClass40_2.method1024()) {
			if ((local12.aLong147 >> 48 & 0xFFFFL) == (long) arg0) {
				local12.method3320();
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(III)J")
	public static long method2398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub6 local7 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt827; local13++) {
			@Pc(19) Class99 local19 = local7.aClass99Array1[local13];
			if ((local19.aLong144 >> 29 & 0x3L) == 2L && local19.anInt4226 == arg1 && local19.anInt4239 == arg2) {
				return local19.aLong144;
			}
		}
		return 0L;
	}
}
