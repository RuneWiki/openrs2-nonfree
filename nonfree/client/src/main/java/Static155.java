import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static155 {

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "Z")
	public static boolean aBoolean541 = true;

	@OriginalMember(owner = "client!fu", name = "w", descriptor = "Lclient!vw;")
	public static final Class340 aClass340_12 = new Class340();

	@OriginalMember(owner = "client!fu", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[100];

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IBI)Z")
	public static boolean method6197(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIBI)I")
	public static int method6200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + (((arg0 >> 2 & 0x3F) << 10) + (arg2 >> 1));
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)Z")
	public static boolean method6202(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (method6197(arg1, arg0) | Static184.method3598(arg1, arg0) | Static104.method6577(arg0, arg1)) & Static93.method2045(arg1, arg0);
	}
}
