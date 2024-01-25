import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static707 {

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
	public static int anInt11052;

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_129 = new Class286(42, 7);

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "[I")
	public static final int[] anIntArray618 = new int[1];

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
	public static int anInt11053 = -1;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!ss;I)[I")
	public static int[] method9222(@OriginalArg(0) Class3_Sub48 arg0) {
		@Pc(10) Class3_Sub28 local10 = new Class3_Sub28(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method5329(10);
		local10.method5311(local13[0]);
		local10.method5311(local13[1]);
		local10.method5311(local13[2]);
		local10.method5311(local13[3]);
		for (@Pc(64) int local64 = 0; local64 < 10; local64++) {
			local10.method5311((int) (Math.random() * 9.9999999E7D));
		}
		local10.method5282((int) (Math.random() * 9.9999999E7D));
		local10.method5310(Static19.aBigInteger1, Static691.aBigInteger5);
		arg0.aClass3_Sub28_Sub2_1.method5274(local10.anInt6241, local10.aByteArray50, 0);
		return local13;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIII)V")
	public static void method9224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg0) {
			Static542.method7608(arg2, arg0, arg4, arg1);
		} else if (arg4 - arg0 >= Static85.anInt1313 && arg0 + arg4 <= Static316.anInt6313 && Static280.anInt5114 <= arg2 - arg3 && arg3 + arg2 <= Static356.anInt6028) {
			Static538.method6236(arg0, arg4, arg3, arg2, arg1);
		} else {
			Static418.method6195(arg0, arg2, arg3, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Z")
	public static boolean method9228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > -115) {
			return false;
		} else {
			return (arg1 & 0x70000) != 0 | Static691.method9067(arg0, arg1) || Static381.method5735(arg1, arg0);
		}
	}
}
