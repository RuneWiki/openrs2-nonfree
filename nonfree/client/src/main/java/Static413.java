import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "Lclient!un;")
	public static Class257 aClass257_1;

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "Lclient!dh;")
	public static final Class49 aClass49_20 = new Class49(11, 7);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIB)Z")
	public static boolean method5729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static347.method5055(arg1, arg0) | (arg1 & 0x60000) != 0 || Static45.method928(arg0, arg1) || Static85.method1764(arg0, arg1);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "([BI)Z")
	public static boolean method5730(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub20 local8 = new Class4_Sub20(arg0);
		@Pc(12) int local12 = local8.method4614();
		if (local12 != 2) {
			return false;
		}
		@Pc(28) boolean local28 = local8.method4614() == 1;
		if (local28) {
			Static370.method5244(local8);
		}
		Static194.method3457(local8);
		return true;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!ci;III)Lclient!gg;")
	public static Class84 method5731(@OriginalArg(0) Class38 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method1039(0, arg1);
		return local14 == null ? null : new Class84(local14);
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(III)Z")
	public static boolean method5732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(III)I")
	public static int method5742(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(45) int local45 = (arg0 & 0x7F) * 96 >> 7;
			if (local45 < 2) {
				local45 = 2;
			} else if (local45 > 126) {
				local45 = 126;
			}
			return (arg0 & 0xFF80) + local45;
		}
	}
}
