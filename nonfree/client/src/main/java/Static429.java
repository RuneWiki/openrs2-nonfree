import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!oka", name = "j", descriptor = "[Lclient!nh;")
	public static Class250[] aClass250Array119;

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "Lclient!da;")
	public static Class70 aClass70_8;

	@OriginalMember(owner = "client!oka", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!oka", name = "f", descriptor = "I")
	public static int anInt7127 = -1;

	@OriginalMember(owner = "client!oka", name = "b", descriptor = "Z")
	public static boolean aBoolean478 = true;

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(IIIII)V")
	public static void method6193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(20) Class5_Sub1_Sub18 local20 = Static123.method1827((long) arg0 << 32 | (long) arg1, 19);
		local20.method7441();
		local20.anInt8635 = arg2;
		local20.anInt8632 = arg3;
	}
}
