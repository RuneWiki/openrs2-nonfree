import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!up", name = "z", descriptor = "F")
	public static float aFloat193;

	@OriginalMember(owner = "client!up", name = "B", descriptor = "Lclient!em;")
	public static final Class83 aClass83_160 = new Class83(42, -2);

	@OriginalMember(owner = "client!up", name = "E", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_93 = new Class208(49, 15);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIII)I")
	public static int method6114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static310.aClass129Array5 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 9;
		@Pc(15) int local15 = arg1 >> 9;
		if (local11 < 0 || local15 < 0 || local11 > Static458.anInt9736 - 1 || Static378.anInt6747 - 1 < local15) {
			return 0;
		}
		@Pc(52) int local52 = arg0;
		if (arg0 < 3 && (Static85.aByteArrayArrayArray1[1][local11][local15] & 0x2) != 0) {
			local52 = arg0 + 1;
		}
		return Static310.aClass129Array5[local52].method6480(arg1, arg2);
	}

	@OriginalMember(owner = "client!up", name = "g", descriptor = "(I)[Lclient!fc;")
	public static Class93[] method6117() {
		return new Class93[] { Static76.aClass93_3, Static215.aClass93_2, Static440.aClass93_7, Static403.aClass93_5, Static385.aClass93_4, Static466.aClass93_8 };
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZI)I")
	public static int method6119(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(B)[Lclient!ch;")
	public static Class41[] method6120() {
		return new Class41[] { Static560.aClass41_4, Static490.aClass41_3, Static168.aClass41_2 };
	}
}
