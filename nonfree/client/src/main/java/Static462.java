import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static462 {

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "Lclient!kha;")
	public static Class181 aClass181_92;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
	public static int anInt8392;

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "Lclient!ac;")
	public static Class5 aClass5_34;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
	public static int anInt8390 = 0;

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
	public static int anInt8391 = 104;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)I")
	public static int method6937(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
