import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static252 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "Lclient!aba;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString108;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
	public static final int anInt4903 = 1;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(IIII)I")
	public static int method4529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + ((arg0 >> 2 & 0x3F) << 10) + (arg1 >> 5 << 7);
	}
}
