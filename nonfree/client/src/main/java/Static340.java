import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!lea", name = "Q", descriptor = "[Lclient!nq;")
	public static final Interface17[] anInterface17Array1 = new Interface17[128];

	@OriginalMember(owner = "client!lea", name = "U", descriptor = "I")
	public static int anInt5803 = 0;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZII[B[BIIII)V")
	public static void method5216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(15) int local15 = -(arg4 & 0x3);
		for (@Pc(18) int local18 = -arg7; local18 < 0; local18++) {
			@Pc(28) int local28;
			for (@Pc(24) int local24 = local10; local24 < 0; local24++) {
				local28 = arg6++;
				arg3[local28] += arg2[arg5++];
				@Pc(40) int local40 = arg6++;
				arg3[local40] += arg2[arg5++];
				@Pc(52) int local52 = arg6++;
				arg3[local52] += arg2[arg5++];
				@Pc(64) int local64 = arg6++;
				arg3[local64] += arg2[arg5++];
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local28 = arg6++;
				arg3[local28] += arg2[arg5++];
			}
			arg5 += arg0;
			arg6 += arg1;
		}
		if (false) {
			method5216(-8, -39, (byte[]) null, (byte[]) null, 85, 114, 23, 72);
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(CB)Z")
	public static boolean method5217(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(42) char[] local42 = Static601.aCharArray10;
			for (@Pc(44) int local44 = 0; local44 < local42.length; local44++) {
				@Pc(50) char local50 = local42[local44];
				if (arg0 == local50) {
					return true;
				}
			}
		}
		return false;
	}
}
