import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "Lclient!ns;")
	public static Class166 aClass166_293;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "[Lclient!mb;")
	public static final Class153[] aClass153Array1 = new Class153[16];

	@OriginalMember(owner = "client!wd", name = "O", descriptor = "[I")
	public static final int[] anIntArray644 = new int[14];

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!uf;IZILclient!uf;)I")
	public static int method5661(@OriginalArg(0) Class84_Sub1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class84_Sub1 arg3) {
		@Pc(16) int local16;
		@Pc(19) int local19;
		if (arg2 == 1) {
			local16 = arg0.anInt6828;
			local19 = arg3.anInt6828;
			if (!arg1) {
				if (local19 == -1) {
					local19 = 2001;
				}
				if (local16 == -1) {
					local16 = 2001;
				}
			}
			return local16 - local19;
		} else if (arg2 == 2) {
			return Static254.method3491(Static139.anInt2670, arg0.method5301().aString59, arg3.method5301().aString59);
		} else if (arg2 == 3) {
			if (arg0.aString65.equals("-")) {
				if (arg3.aString65.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString65.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static254.method3491(Static139.anInt2670, arg0.aString65, arg3.aString65);
			}
		} else if (arg2 == 4) {
			if (arg0.method5299()) {
				return arg3.method5299() ? 0 : 1;
			} else if (arg3.method5299()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg0.method5294()) {
				return arg3.method5294() ? 0 : 1;
			} else if (arg3.method5294()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg0.method5293()) {
				return arg3.method5293() ? 0 : 1;
			} else if (arg3.method5293()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg0.method5295()) {
				return arg3.method5295() ? 0 : 1;
			} else if (arg3.method5295()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local16 = arg0.anInt6835;
			local19 = arg3.anInt6835;
			if (arg1) {
				if (local19 == 1000) {
					local19 = -1;
				}
				if (local16 == 1000) {
					local16 = -1;
				}
			} else {
				if (local19 == -1) {
					local19 = 1000;
				}
				if (local16 == -1) {
					local16 = 1000;
				}
			}
			return local16 - local19;
		} else {
			return arg0.anInt6832 - arg3.anInt6832;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)B")
	public static byte method5663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIIII)I")
	public static int method5664(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg2 & 0xF;
		@Pc(19) int local19 = local12 >= 8 ? arg0 : arg1;
		@Pc(36) int local36 = local12 >= 4 ? (local12 == 12 || local12 == 14 ? arg1 : arg3) : arg0;
		return ((local12 & 0x2) == 0 ? local36 : -local36) + ((local12 & 0x1) == 0 ? local19 : -local19);
	}
}
