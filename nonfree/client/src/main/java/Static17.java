import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
	public static int anInt438;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
	public static int anInt439;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "Lclient!ah;")
	public static Class6 aClass6_2;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "[I")
	public static int[] anIntArray69 = new int[1000];

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "J")
	public static volatile long aLong12 = 0L;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "Lclient!kh;")
	public static Class60 aClass60_145 = Static200.method3116("leuchten1:");

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "Lclient!kh;")
	public static Class60 aClass60_146 = Static200.method3116("Stufe)2");

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "Lclient!kh;")
	public static Class60 aClass60_147 = Static200.method3116("(U0a )2 in: ");

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BII)I")
	public static int method314(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(47) int local47 = Static143.method2456(arg1 + 91923, 4, arg0 + 45365) + (Static143.method2456(arg1 + 37821, 2, arg0 + 10294) - 128 >> 1) + (Static143.method2456(arg1, 1, arg0) + -128 >> 2) - 128;
		local47 = (int) ((double) local47 * 0.3D) + 35;
		if (local47 < 10) {
			local47 = 10;
		} else if (local47 > 60) {
			local47 = 60;
		}
		return local47;
	}
}
