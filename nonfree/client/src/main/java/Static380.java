import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!om", name = "c", descriptor = "Lclient!vo;")
	public static Class348 aClass348_88;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "[I")
	public static int[] anIntArray406;

	@OriginalMember(owner = "client!om", name = "g", descriptor = "F")
	public static float aFloat182;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "I")
	public static int anInt7471 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method5901(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg2; local12++) {
			@Pc(22) int local22 = arg0[local12 + arg1] & 0xFF;
			if (local22 != 0) {
				if (local22 >= 128 && local22 < 160) {
					@Pc(40) char local40 = Static101.aCharArray3[local22 - 128];
					if (local40 == '\u0000') {
						local40 = '?';
					}
					local22 = local40;
				}
				local8[local10++] = (char) local22;
			}
		}
		return new String(local8, 0, local10);
	}
}
