import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "Lclient!ii;")
	public static Class111 aClass111_8;

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "Lclient!o;")
	public static Class171 aClass171_5;

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "Lclient!ef;")
	public static final Class68 aClass68_13 = new Class68(12, 6);

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray45 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)I")
	public static int method4528(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = arg0 & 0x3F;
		@Pc(22) int local22 = arg0 >> 6 & 0x3;
		if (local16 == 18) {
			if (local22 == 0) {
				return 1;
			}
			if (local22 == 1) {
				return 2;
			}
			if (local22 == 2) {
				return 4;
			}
			if (local22 == 3) {
				return 8;
			}
		} else if (local16 == 19 || local16 == 21) {
			if (local22 == 0) {
				return 16;
			}
			if (local22 == 1) {
				return 32;
			}
			if (local22 == 2) {
				return 64;
			}
			if (local22 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
	public static byte[] method4529(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static304.method2737(local13) : local13;
		} else if (arg0 instanceof Class126) {
			@Pc(32) Class126 local32 = (Class126) arg0;
			return local32.method3095();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIZI)I")
	public static int method4530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return (arg0 >> 1) + ((arg1 >> 2 & 0x3F) << 10) + (arg2 >> 5 << 7);
	}
}
