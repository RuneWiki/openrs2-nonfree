import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bga", name = "n", descriptor = "I")
	public static int anInt861;

	@OriginalMember(owner = "client!bga", name = "s", descriptor = "Lclient!da;")
	public static Class50 aClass50_2;

	@OriginalMember(owner = "client!bga", name = "o", descriptor = "I")
	public static int anInt862 = -1;

	@OriginalMember(owner = "client!bga", name = "t", descriptor = "Z")
	public static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(I[BILjava/lang/String;)I")
	public static int method823(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg2.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12 += 4) {
			@Pc(20) int local20 = Static9.method193(arg2.charAt(local12));
			@Pc(41) int local41 = local12 + 1 >= local10 ? -1 : Static9.method193(arg2.charAt(local12 + 1));
			@Pc(62) int local62 = local12 + 2 < local10 ? Static9.method193(arg2.charAt(local12 + 2)) : -1;
			@Pc(81) int local81 = local10 > local12 + 3 ? Static9.method193(arg2.charAt(local12 + 3)) : -1;
			arg0[arg1++] = (byte) (local20 << 2 | local41 >>> 4);
			if (local62 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local41 & 0xF) << 4 | local62 >>> 2);
			if (local81 == -1) {
				break;
			}
			arg0[arg1++] = (byte) (local81 | (local62 & 0x3) << 6);
		}
		return arg1;
	}
}
