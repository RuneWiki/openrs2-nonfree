import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!qv", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!qv", name = "n", descriptor = "I")
	public static int anInt8423 = 0;

	@OriginalMember(owner = "client!qv", name = "o", descriptor = "I")
	public static int anInt8424 = -1;

	@OriginalMember(owner = "client!qv", name = "q", descriptor = "Z")
	public static boolean aBoolean609 = true;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IB)V")
	public static void method7171(@OriginalArg(0) int arg0) {
		Static69.anInt1053 = arg0;
		Static62.anInt991 = 2;
		if (Static328.aString57 == null) {
			Static97.method1623(35);
		} else {
			@Pc(29) Class5_Sub15 local29 = new Class5_Sub15(Static324.method5062(Static532.method7417(Static328.aString57)));
			@Pc(33) long local33 = local29.method3634();
			Static416.aLong216 = local29.method3634();
			Static96.method1621("", true, Static618.method8284(local33));
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(BIIIIII)V")
	public static void method7173(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static361.anInt6317 <= arg1 && Static651.anInt10267 >= arg3 && arg5 >= Static128.anInt2200 && arg4 <= Static380.anInt6585) {
			if (arg0 == 1) {
				Static91.method6922(arg4, arg5, arg1, arg2, arg3);
			} else {
				Static624.method8335(arg3, arg0, arg2, arg1, arg4, arg5);
			}
		} else if (arg0 == 1) {
			Static423.method6425(arg2, arg1, arg4, arg3, arg5);
		} else {
			Static547.method7538(arg2, arg5, arg0, arg4, arg3, arg1);
		}
	}
}
