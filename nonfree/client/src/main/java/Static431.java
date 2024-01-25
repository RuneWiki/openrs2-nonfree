import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!qh", name = "U", descriptor = "I")
	public static int anInt3510;

	@OriginalMember(owner = "client!qh", name = "ab", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[8];

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/String;I[BI)I")
	public static int method3135(@OriginalArg(0) String arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17 += 4) {
			@Pc(25) int local25 = Static299.method4717(arg0.charAt(local17));
			@Pc(40) int local40 = local17 + 1 >= local15 ? -1 : Static299.method4717(arg0.charAt(local17 + 1));
			@Pc(55) int local55 = local17 + 2 >= local15 ? -1 : Static299.method4717(arg0.charAt(local17 + 2));
			@Pc(70) int local70 = local15 > local17 + 3 ? Static299.method4717(arg0.charAt(local17 + 3)) : -1;
			arg1[arg2++] = (byte) (local25 << 2 | local40 >>> 4);
			if (local55 == -1) {
				break;
			}
			arg1[arg2++] = (byte) ((local40 & 0xF) << 4 | local55 >>> 2);
			if (local70 == -1) {
				break;
			}
			arg1[arg2++] = (byte) (local70 | (local55 & 0x3) << 6);
		}
		return arg2;
	}
}
