import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
	public static int anInt5659;

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "Lclient!mn;")
	public static Class160 aClass160_6;

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "Lclient!dg;")
	public static final Class54 aClass54_33 = new Class54(16);

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "Z")
	public static boolean aBoolean510 = false;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIZZII)V")
	public static void method4564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg0 < 1) {
			arg0 = 1;
		}
		@Pc(21) int local21 = arg0 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(45) int local45 = Static83.aShort28 + local21 * (Static463.aShort117 - Static83.aShort28) / 100;
		if (Static193.aShort57 > local45) {
			local45 = Static193.aShort57;
		} else if (Static210.aShort114 < local45) {
			local45 = Static210.aShort114;
		}
		@Pc(71) int local71 = arg0 * local45 * 512 / (arg1 * 334);
		@Pc(108) int local108;
		@Pc(115) int local115;
		@Pc(83) short local83;
		if (Static369.aShort92 > local71) {
			local83 = Static369.aShort92;
			local45 = arg1 * 334 * local83 / (arg0 * 512);
			if (local45 > Static210.aShort114) {
				local45 = Static210.aShort114;
				local108 = arg0 * 512 * local45 / (local83 * 334);
				local115 = (arg1 - local108) / 2;
				if (arg2) {
					Static186.aClass117_3.va();
					Static186.aClass117_3.method5664(local115, arg4, -16777216, arg0, arg3);
					Static186.aClass117_3.method5664(local115, arg4, -16777216, arg0, arg1 + arg3 - local115);
				}
				arg1 -= local115 * 2;
				arg3 += local115;
			}
		} else if (Static380.aShort93 < local71) {
			local83 = Static380.aShort93;
			local45 = local83 * arg1 * 334 / (arg0 * 512);
			if (Static193.aShort57 > local45) {
				local45 = Static193.aShort57;
				local108 = arg1 * local83 * 334 / (local45 * 512);
				local115 = (arg0 - local108) / 2;
				if (arg2) {
					Static186.aClass117_3.va();
					Static186.aClass117_3.method5664(arg1, arg4, -16777216, local115, arg3);
					Static186.aClass117_3.method5664(arg1, arg4 + arg0 - local115, -16777216, local115, arg3);
				}
				arg4 += local115;
				arg0 -= local115 * 2;
			}
		}
		Static112.anInt1712 = local45 * arg0 / 334;
		Static425.anInt6825 = (short) arg1;
		Static286.anInt4797 = (short) arg0;
		Static440.anInt3187 = arg3;
		Static294.anInt4901 = arg4;
	}
}
