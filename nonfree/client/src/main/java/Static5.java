import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	public static int anInt66;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
	public static int anInt68;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Lclient!ph;")
	public static Class138 aClass138_2;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString2 = " from your ignore list first.";

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
	public static int anInt69 = -1;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "[Lclient!vk;")
	public static Class1_Sub1_Sub24[] aClass1_Sub1_Sub24Array1 = new Class1_Sub1_Sub24[14];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBII)I")
	public static int method57(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return (arg1 >> 2 << 10) + (arg2 >> 5 << 7) + (arg0 >> 1);
	}
}
