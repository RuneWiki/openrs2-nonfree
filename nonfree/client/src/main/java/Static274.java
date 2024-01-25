import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
	public static int anInt307;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "Lclient!f;")
	public static Class22 aClass22_2;

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
	public static final int anInt308 = 1407;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "Z")
	public static boolean aBoolean30 = false;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "[I")
	public static final int[] anIntArray38 = new int[] { 25000, 2000 };

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)Z")
	public static boolean method266(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static419.aBoolean572) {
			return false;
		} else if (Static286.anInt8220 < 100) {
			return false;
		} else if (Static548.method7005(arg1, arg2, arg0)) {
			@Pc(29) int local29 = arg2 << Static351.anInt5832;
			@Pc(33) int local33 = arg0 << Static351.anInt5832;
			if (Static292.method4109(Static379.anInt6307, Static199.aClass47Array1[arg1].method7545(arg2, arg0), arg3, local29, Static379.anInt6307, local33)) {
				Static541.anInt9055++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIZI)V")
	public static void method268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg3 >= arg1) {
			for (local10 = arg1; local10 < arg3; local10++) {
				Static171.anIntArrayArray79[local10][arg2] = arg0;
			}
		} else {
			for (local10 = arg3; local10 < arg1; local10++) {
				Static171.anIntArrayArray79[local10][arg2] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZI)Z")
	public static boolean method269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static515.method7171(arg0, arg1) || Static69.method1218(arg1, arg0);
	}
}
