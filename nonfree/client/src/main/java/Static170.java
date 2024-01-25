import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
	public static int anInt2901;

	@OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
	public static int anInt2909;

	@OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
	public static int anInt2914 = 0;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIII)V")
	public static void method2481(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class5_Sub5_Sub6 local9 = Static478.method6972((long) arg1, 11);
		local9.method2687();
		local9.anInt3064 = arg0;
		local9.anInt3058 = arg2;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIZI)V")
	public static void method2484(@OriginalArg(2) boolean arg0) {
		if (22050 > 48000) {
			throw new IllegalArgumentException();
		}
		Static555.anInt9355 = 2;
		Static128.aBoolean541 = arg0;
		Static608.anInt10099 = 22050;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)Z")
	public static boolean method2486(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(22) Class55 local22 = Static536.aClass392_2.method9293(0, arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local22.method861(arg1);
	}
}
