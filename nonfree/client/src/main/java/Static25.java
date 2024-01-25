import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!baa", name = "s", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IFFF)I")
	public static int method1151(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(21) float local21 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(30) float local30 = arg1 < 0.0F ? -arg1 : arg1;
		if (local12 < local21 && local21 > local30) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local30 > local12 && local21 < local30) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IB)I")
	public static int method1152(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)Z")
	public static boolean method1154() {
		return Static359.aClass199_13 != Static363.aClass199_14 || Static351.anInt6430 >= 2;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!qa;Lclient!uh;IIBI)V")
	public static void method1155(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class288 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) Class140 local14 = Static198.aClass165_3.method4290(arg1.anInt8366);
		if (local14.anInt4440 == -1) {
			return;
		}
		if (arg1.aBoolean580) {
			@Pc(27) int local27 = arg4 + arg1.anInt8347;
			arg4 = local27 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(42) Class12 local42 = local14.method3857(arg4, arg1.aBoolean570, arg0);
		if (local42 == null) {
			return;
		}
		@Pc(48) int local48 = arg1.anInt8365;
		@Pc(51) int local51 = arg1.anInt8343;
		if ((arg4 & 0x1) == 1) {
			local51 = arg1.anInt8365;
			local48 = arg1.anInt8343;
		}
		@Pc(67) int local67 = local42.EA();
		@Pc(70) int local70 = local42.ma();
		if (local14.aBoolean271) {
			local67 = local48 * 4;
			local70 = local51 * 4;
		}
		if (local14.anInt4432 == 0) {
			local42.method7192(arg3, arg2 + 4 - local51 * 4, local67, local70);
		} else {
			local42.ra(arg3, arg2 - (local51 - 1) * 4, local67, local70, 0, local14.anInt4432 | 0xFF000000, 1);
		}
	}
}
