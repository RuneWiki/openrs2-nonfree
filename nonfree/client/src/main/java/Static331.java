import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "Lclient!oj;")
	public static Class243 aClass243_6;

	@OriginalMember(owner = "client!mfa", name = "k", descriptor = "F")
	public static float aFloat179;

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "Lclient!nm;")
	public static final Class2_Sub35 aClass2_Sub35_2 = new Class2_Sub35(0, -1);

	@OriginalMember(owner = "client!mfa", name = "j", descriptor = "[I")
	public static final int[] anIntArray426 = new int[25];

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II)I")
	public static int method5069(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(24) int local24 = (local10 & 0x33333333) + ((local10 & 0xCCCCCCCF) >>> 2);
		@Pc(33) int local33 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(39) int local39 = local33 + (local33 >>> 8);
		@Pc(45) int local45 = local39 + (local39 >>> 16);
		return local45 & 0xFF;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "([[B[B[IZ[[B[III)I")
	public static int method5071(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg2[arg6];
		@Pc(16) int local16 = local9 + arg4[arg6];
		@Pc(20) int local20 = arg2[arg5];
		@Pc(27) int local27 = local20 + arg4[arg5];
		@Pc(29) int local29 = local9;
		if (local20 > local9) {
			local29 = local20;
		}
		@Pc(40) int local40 = local16;
		if (local16 > local27) {
			local40 = local27;
		}
		@Pc(51) int local51 = arg1[arg6] & 0xFF;
		if (local51 > (arg1[arg5] & 0xFF)) {
			local51 = arg1[arg5] & 0xFF;
		}
		@Pc(68) byte[] local68 = arg3[arg6];
		@Pc(72) byte[] local72 = arg0[arg5];
		@Pc(77) int local77 = local29 - local9;
		@Pc(81) int local81 = local29 - local20;
		for (@Pc(83) int local83 = local29; local83 < local40; local83++) {
			@Pc(95) int local95 = local72[local81++] + local68[local77++];
			if (local51 > local95) {
				local51 = local95;
			}
		}
		return -local51;
	}
}
