import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
	public static int anInt5610;

	// $FF: synthetic field
	@OriginalMember(owner = "client!kp", name = "m", descriptor = "Ljava/lang/Class;")
	private static Class aClass17;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIB)Z")
	public static boolean method4970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)I")
	public static int method4971(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIBI)Z")
	public static boolean method4972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface9 local11 = (Interface9) Static518.method6967(arg1, arg0, arg2);
		if (local11 != null) {
			local5 = Static294.method4088(local11) & true;
		}
		local11 = (Interface9) Static405.method5449(arg1, arg0, arg2, aClass17 == null ? (aClass17 = Class3_Sub17_Sub8.a("et")) : aClass17);
		if (local11 != null) {
			local5 &= Static294.method4088(local11);
		}
		local11 = (Interface9) Static198.method3049(arg1, arg0, arg2);
		if (local11 != null) {
			local5 &= Static294.method4088(local11);
		}
		return local5;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IBII)V")
	public static void method4973(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static510.aByteArrayArrayArray11 = new byte[4][arg0][arg1];
	}
}
