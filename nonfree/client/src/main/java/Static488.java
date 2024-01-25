import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!qh", name = "u", descriptor = "D")
	public static double aDouble26;

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "Lclient!aj;")
	public static Class15 aClass15_125;

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "Lclient!mt;")
	public static final Class228 aClass228_14 = new Class228(13, 0, 1, 0);

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_166 = new Class180(92, -2);

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "[I")
	public static final int[] anIntArray681 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZB)I")
	public static int method7051(@OriginalArg(0) boolean arg0) {
		if (Static532.anIntArray747 == null) {
			return 0;
		} else if (arg0 || Static7.aClass368Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < Static532.anIntArray747.length; local22++) {
				@Pc(28) int local28 = Static532.anIntArray747[local22];
				if (Static81.aClass15_24.method526(local28)) {
					local20++;
				}
				if (Static330.aClass15_88.method526(local28)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static532.anIntArray747.length * 2;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)Z")
	public static boolean method7052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < Static90.aByteArrayArrayArray25[1].length && arg1 < Static90.aByteArrayArrayArray25[1][arg0].length) {
			return (Static90.aByteArrayArrayArray25[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIBI)V")
	public static void method7054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class3_Sub11_Sub4 local14 = Static583.method8201(19, (long) arg1 << 32 | (long) arg0);
		local14.method2195();
		local14.anInt2394 = arg2;
		local14.anInt2400 = arg3;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[IZIILclient!dia;IB)Lclient!me;")
	public static Class85_Sub3_Sub1 method7056(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class13_Sub2 arg4, @OriginalArg(6) int arg5) {
		if (arg4.aBoolean170 || Static129.method2437(arg0) && Static129.method2437(arg3)) {
			return new Class85_Sub3_Sub1(arg4, 3553, arg0, arg3, false, arg1, arg2, 0);
		} else if (arg4.aBoolean176) {
			return new Class85_Sub3_Sub1(arg4, 34037, arg0, arg3, false, arg1, arg2, 0);
		} else {
			return new Class85_Sub3_Sub1(arg4, arg0, arg3, Static282.method4521(arg0), Static282.method4521(arg3), arg1);
		}
	}
}
