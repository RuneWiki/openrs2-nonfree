import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "[Lclient!ya;")
	public static Class154[] aClass154Array3;

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "Lclient!vp;")
	public static Class262 aClass262_9;

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
	public static int anInt5638 = 0;

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "J")
	public static long aLong195 = 0L;

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "[I")
	public static final int[] anIntArray551 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!es;Lclient!es;B)V")
	public static void method4493(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1) {
		if (arg0.aClass10_264 != null) {
			arg0.method6033();
		}
		arg0.aClass10_264 = arg1.aClass10_264;
		arg0.aClass10_263 = arg1;
		arg0.aClass10_264.aClass10_263 = arg0;
		arg0.aClass10_263.aClass10_264 = arg0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
	public static void method4494() {
		for (@Pc(3) int local3 = 0; local3 < Static181.aByteArrayArrayArray15.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static181.aByteArrayArrayArray15[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static181.aByteArrayArrayArray15[0][0].length; local11++) {
					Static181.aByteArrayArrayArray15[local3][local7][local11] = 0;
				}
			}
		}
	}
}
