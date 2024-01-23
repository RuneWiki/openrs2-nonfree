import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
	public static int anInt1574;

	@OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
	public static int anInt1575;

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "Lclient!si;")
	public static Class157 aClass157_8;

	@OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
	public static int anInt1580;

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "[I")
	public static int[] anIntArray128 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
	public static int anInt1579 = 64;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!nm;I)Z")
	public static boolean method1439(@OriginalArg(0) Class119 arg0) {
		return arg0.method3250(Static240.anInt4468);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIILclient!km;Lclient!km;IIIIJ)V")
	public static void method1440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11 arg4, @OriginalArg(5) Class11 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class18 local6 = new Class18();
		local6.aLong21 = arg10;
		local6.anInt563 = arg1 * 128 + 64;
		local6.anInt558 = arg2 * 128 + 64;
		local6.anInt554 = arg3;
		local6.aClass11_1 = arg4;
		local6.aClass11_2 = arg5;
		local6.anInt559 = arg6;
		local6.anInt557 = arg7;
		local6.anInt562 = arg8;
		local6.anInt560 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static254.aClass1_Sub16ArrayArrayArray3[local46][arg1][arg2] == null) {
				Static254.aClass1_Sub16ArrayArrayArray3[local46][arg1][arg2] = new Class1_Sub16(local46, arg1, arg2);
			}
		}
		Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2].aClass18_1 = local6;
	}
}
