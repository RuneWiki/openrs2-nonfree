import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "Lclient!kba;")
	public static final Class163 aClass163_60 = new Class163();

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[BZLjava/lang/String;)I")
	public static int method8140(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) String arg2) {
		@Pc(15) int local15 = arg2.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17 += 4) {
			@Pc(25) int local25 = Static94.method2323(arg2.charAt(local17));
			@Pc(44) int local44 = local15 <= local17 + 1 ? -1 : Static94.method2323(arg2.charAt(local17 + 1));
			@Pc(63) int local63 = local17 + 2 < local15 ? Static94.method2323(arg2.charAt(local17 + 2)) : -1;
			@Pc(82) int local82 = local17 + 3 >= local15 ? -1 : Static94.method2323(arg2.charAt(local17 + 3));
			arg1[arg0++] = (byte) (local25 << 2 | local44 >>> 4);
			if (local63 == -1) {
				break;
			}
			arg1[arg0++] = (byte) ((local44 & 0xF) << 4 | local63 >>> 2);
			if (local82 == -1) {
				break;
			}
			arg1[arg0++] = (byte) (local82 | (local63 & 0x3) << 6);
		}
		return arg0;
	}
}
