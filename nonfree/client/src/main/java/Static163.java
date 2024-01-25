import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fea", name = "h", descriptor = "F")
	public static float aFloat84;

	@OriginalMember(owner = "client!fea", name = "j", descriptor = "I")
	public static int anInt3311;

	@OriginalMember(owner = "client!fea", name = "l", descriptor = "Lclient!wm;")
	public static Class390 aClass390_36;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(III)Z")
	public static boolean method2890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 | Static287.method4653(arg1, arg0) || Static457.method6552(arg0, arg1);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIILclient!da;Lclient!uaa;Lclient!aa;IIILjava/lang/String;Lclient!ne;)V")
	public static void method2891(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class73 arg3, @OriginalArg(5) Class345 arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) String arg9, @OriginalArg(11) Class247 arg10) {
		@Pc(13) int local13;
		if (Static660.anInt10605 == 4) {
			local13 = (int) Static157.aFloat83 & 0x3FFF;
		} else {
			local13 = (int) Static157.aFloat83 + Static213.anInt9568 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg4.anInt9649 / 2, arg4.anInt9606 / 2) + 10;
		@Pc(43) int local43 = arg2 * arg2 + arg0 * arg0;
		if (local43 > local35 * local35) {
			return;
		}
		@Pc(61) int local61 = Class200.anIntArray337[local13];
		@Pc(65) int local65 = Class200.anIntArray338[local13];
		if (Static660.anInt10605 != 4) {
			local65 = local65 * 256 / (Static569.anInt9215 + 256);
			local61 = local61 * 256 / (Static569.anInt9215 + 256);
		}
		@Pc(94) int local94 = arg2 * local61 + local65 * arg0 >> 14;
		@Pc(104) int local104 = local65 * arg2 - arg0 * local61 >> 14;
		@Pc(111) int local111 = arg10.method5769(arg9, (Class50[]) null, 100);
		@Pc(119) int local119 = arg10.method5763(arg9, (Class50[]) null, 100, 0);
		@Pc(125) int local125 = local94 - local111 / 2;
		if (local125 >= -arg4.anInt9649 && arg4.anInt9649 >= local125 && -arg4.anInt9606 <= local104 && arg4.anInt9606 >= local104) {
			arg3.method5780(1, arg5, arg4.anInt9649 / 2 + arg6 + local125, -local119 + arg4.anInt9606 / 2 + arg7 + -local104 + -arg8, arg9, arg6, 0, (Class50[]) null, local111, arg7, 0, 0, arg1, 50, (int[]) null);
		}
	}
}
