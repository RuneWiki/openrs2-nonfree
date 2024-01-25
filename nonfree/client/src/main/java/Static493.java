import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!sr", name = "R", descriptor = "I")
	public static int anInt8313;

	@OriginalMember(owner = "client!sr", name = "S", descriptor = "Lclient!pl;")
	public static Class259 aClass259_155;

	@OriginalMember(owner = "client!sr", name = "V", descriptor = "J")
	public static long aLong227;

	@OriginalMember(owner = "client!sr", name = "K", descriptor = "Lclient!fh;")
	public static final Class113 aClass113_18 = new Class113(7, 5);

	@OriginalMember(owner = "client!sr", name = "P", descriptor = "I")
	public static final int anInt8312 = 328;

	@OriginalMember(owner = "client!sr", name = "T", descriptor = "[Z")
	public static final boolean[] aBooleanArray35 = new boolean[100];

	@OriginalMember(owner = "client!sr", name = "U", descriptor = "Lclient!tb;")
	public static final Class313 aClass313_53 = new Class313(3000000, 200);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(FI[BFLclient!ab;FFFIIIII)V")
	public static void method6891(@OriginalArg(0) float arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) Class4 arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(11) int arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static327.method5033(arg7, arg5, arg0, arg2, arg1, arg3, arg4, arg6, local7);
			arg7 += 16384;
		}
	}
}
