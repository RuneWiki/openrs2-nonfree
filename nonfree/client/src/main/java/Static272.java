import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!na", name = "I", descriptor = "Lclient!nh;")
	public static Class171 aClass171_2;

	@OriginalMember(owner = "client!na", name = "N", descriptor = "Z")
	public static boolean aBoolean285;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "Z")
	public static boolean aBoolean283 = false;

	@OriginalMember(owner = "client!na", name = "J", descriptor = "I")
	public static int anInt4295 = 0;

	@OriginalMember(owner = "client!na", name = "M", descriptor = "Z")
	public static boolean aBoolean284 = false;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(CBI)I")
	public static int method3424(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local12 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local12 = 1762;
		}
		return local12;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!bc;IIII)V")
	public static void method3425(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static262.method3349(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static439.anInt7318) {
			Static262.method3349(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static262.method3349(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static459.anInt4775) {
			Static262.method3349(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static459.anInt4775) {
			Static262.method3349(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static439.anInt7318 && arg4 <= Static459.anInt4775) {
			Static262.method3349(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static262.method3349(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static439.anInt7318 && arg4 > 0) {
			Static262.method3349(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
