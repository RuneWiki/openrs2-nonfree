import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "Lclient!rb;")
	public static Class173 aClass173_6;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "J")
	public static long aLong127 = 0L;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "Lclient!tc;")
	public static final Class195 aClass195_37 = new Class195();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	public static void method3470() {
		Static176.aClass2_9.method3341(Static96.aFloat120 * ((float) Static210.anInt4175 * 0.1F + 0.7F));
		Static176.aClass2_9.method3329(Static20.anInt413, Static55.aFloat24, Static332.aFloat116, (float) Static44.anInt963, (float) Static108.anInt2198, (float) Static199.anInt4062);
		Static176.aClass2_9.method3271(Static56.aClass113_1);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)I")
	public static int method3472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static183.aByteArrayArrayArray7[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static183.aByteArrayArrayArray7[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)V")
	public static void method3475() {
		Static22.method583();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI[I)V")
	public static void method3476(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		for (@Pc(8) int local8 = 31; local8 > 0; local8--) {
			@Pc(14) int local14 = local8 * 36;
			for (@Pc(16) int local16 = 35; local16 > 0; local16--) {
				if (arg1[local14 + local16] == 0 && arg1[local16 + local14 - 36 - 1] != 0) {
					arg1[local14 + local16] = arg0;
				}
			}
		}
	}
}
