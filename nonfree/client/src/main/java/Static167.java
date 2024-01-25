import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_111 = new Class18(53, 8);

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIII)V")
	public static void method3127(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class101[] local7 = Static60.aClass101Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class101 local15 = local7[local9];
			if (local15 != null && local15.anInt3096 == 2) {
				Static42.method981(local15.anInt3092 + (local15.anInt3094 - Static299.anInt4036 << 7), (local15.anInt3098 + -Static50.anInt1271 << 7) + local15.anInt3099, local15.anInt3101 * 2, local15.anInt3106, arg1 >> 1, arg3 >> 1);
				if (Static168.anIntArray261[0] > -1 && Static51.anInt1301 % 20 < 10) {
					Static225.aClass4Array13[local15.anInt3104].method5948(Static168.anIntArray261[0] + arg0 - 12, arg2 + -28 - -Static168.anIntArray261[1]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!ct;II)Lclient!hi;")
	public static Class80 method3128(@OriginalArg(0) Class30 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method1179(arg1);
		return local8 == null ? null : new Class80(local8);
	}
}
