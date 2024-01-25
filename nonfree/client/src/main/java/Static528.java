import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!wba", name = "G", descriptor = "[S")
	public static final short[] aShortArray168 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!wba", name = "I", descriptor = "Lclient!lb;")
	public static final Class174 aClass174_40 = new Class174(64);

	@OriginalMember(owner = "client!wba", name = "J", descriptor = "[I")
	public static final int[] anIntArray772 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!wba", name = "K", descriptor = "[J")
	public static final long[] aLongArray15 = new long[32];

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIB)I")
	public static int method7530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = arg0 - 1 & arg1 >> 31;
		return local19 + ((arg1 >>> 31) + arg1) % arg0;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "([BIII)[B")
	public static byte[] method7532(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) byte[] local7;
		if (arg2 <= 0) {
			local7 = arg0;
		} else {
			local7 = new byte[arg1];
			for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
				local7[local13] = arg0[arg2 + local13];
			}
		}
		@Pc(34) Class213 local34 = new Class213();
		local34.method5475();
		local34.method5476(local7, (long) (arg1 * 8));
		@Pc(48) byte[] local48 = new byte[64];
		local34.method5477(local48);
		return local48;
	}
}
