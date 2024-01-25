import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!kda", name = "k", descriptor = "[I")
	public static int[] anIntArray287;

	@OriginalMember(owner = "client!kda", name = "H", descriptor = "I")
	public static int anInt5008 = 0;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(B[BILjava/lang/String;)I")
	public static int method4275(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(15) int local15 = arg2.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17 += 4) {
			@Pc(25) int local25 = Static486.method7062(arg2.charAt(local17));
			@Pc(44) int local44 = local15 <= local17 + 1 ? -1 : Static486.method7062(arg2.charAt(local17 + 1));
			@Pc(59) int local59 = local17 + 2 < local15 ? Static486.method7062(arg2.charAt(local17 + 2)) : -1;
			@Pc(78) int local78 = local17 + 3 >= local15 ? -1 : Static486.method7062(arg2.charAt(local17 + 3));
			arg0[arg1++] = (byte) (local44 >>> 4 | local25 << 2);
			if (local59 == -1) {
				break;
			}
			arg0[arg1++] = (byte) (local59 >>> 2 | (local44 & 0xF) << 4);
			if (local78 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local59 & 0x3) << 6 | local78);
		}
		return arg1;
	}
}
