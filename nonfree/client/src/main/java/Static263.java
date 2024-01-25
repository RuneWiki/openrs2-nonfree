import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "[Lclient!ta;")
	public static Class64[] aClass64Array2;

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "Z")
	public static boolean aBoolean350;

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "[S")
	public static final short[] aShortArray78 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_99 = new Class265(46, 4);

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray50 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)I")
	public static int method3943(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local14;
		if (local23 < local14) {
			local37 = local23;
		}
		if (local37 > local35) {
			local37 = local35;
		}
		@Pc(51) double local51 = local14;
		if (local23 > local14) {
			local51 = local23;
		}
		if (local51 < local35) {
			local51 = local35;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local51 + local37) / 2.0D;
		if (local51 != local37) {
			if (local73 < 0.5D) {
				local67 = (local51 - local37) / (local37 + local51);
			}
			if (local73 >= 0.5D) {
				local67 = (local51 - local37) / (2.0D - local51 - local37);
			}
			if (local51 == local14) {
				local65 = (local23 - local35) / (local51 - local37);
			} else if (local51 == local23) {
				local65 = (local35 - local14) / (local51 - local37) + 2.0D;
			} else if (local51 == local35) {
				local65 = (local14 - local23) / (-local37 + local51) + 4.0D;
			}
		}
		local65 /= 6.0D;
		@Pc(164) int local164 = (int) (local65 * 256.0D);
		@Pc(169) int local169 = (int) (local67 * 256.0D);
		@Pc(174) int local174 = (int) (local73 * 256.0D);
		if (local169 < 0) {
			local169 = 0;
		} else if (local169 > 255) {
			local169 = 255;
		}
		if (local174 < 0) {
			local174 = 0;
		} else if (local174 > 255) {
			local174 = 255;
		}
		if (local174 > 243) {
			local169 >>= 0x4;
		} else if (local174 > 217) {
			local169 >>= 0x3;
		} else if (local174 > 192) {
			local169 >>= 0x2;
		} else if (local174 > 179) {
			local169 >>= 0x1;
		}
		return (local174 >> 1) + (local169 >> 5 << 7) + ((local164 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)V")
	public static void method3945(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub5_Sub13 local12 = Static208.method3306(arg0, 12);
		local12.method4545();
	}
}
