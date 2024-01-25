import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!pha", name = "Q", descriptor = "Lclient!le;")
	public static Class205 aClass205_1;

	@OriginalMember(owner = "client!pha", name = "J", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_95 = new Class179(79, 3);

	@OriginalMember(owner = "client!pha", name = "N", descriptor = "S")
	public static short aShort91 = 1;

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(I[BLjava/lang/String;I)I")
	public static int method5965(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17 += 4) {
			@Pc(25) int local25 = Static119.method1755(arg1.charAt(local17));
			@Pc(44) int local44 = local15 > local17 + 1 ? Static119.method1755(arg1.charAt(local17 + 1)) : -1;
			@Pc(63) int local63 = local17 + 2 < local15 ? Static119.method1755(arg1.charAt(local17 + 2)) : -1;
			@Pc(82) int local82 = local17 + 3 >= local15 ? -1 : Static119.method1755(arg1.charAt(local17 + 3));
			arg0[arg2++] = (byte) (local25 << 2 | local44 >>> 4);
			if (local63 == -1) {
				break;
			}
			arg0[arg2++] = (byte) (local63 >>> 2 | (local44 & 0xF) << 4);
			if (local82 == -1) {
				break;
			}
			arg0[arg2++] = (byte) ((local63 & 0x3) << 6 | local82);
		}
		return arg2;
	}
}
