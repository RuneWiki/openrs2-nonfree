import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class8_Sub1_Sub5_Sub2 extends Class8_Sub1_Sub5 {

	@OriginalMember(owner = "client!jj", name = "R", descriptor = "[[B")
	private byte[][] aByteArrayArray9 = new byte[256][];

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "([B)V")
	public Class8_Sub1_Sub5_Sub2(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class8_Sub1_Sub5_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray9 = arg5;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method2030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static103.anInt2161;
		@Pc(9) int local9 = Static103.anInt2161 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static103.anInt2162) {
			local20 = Static103.anInt2162 - arg2;
			arg4 -= local20;
			arg2 = Static103.anInt2162;
			local13 = local20 * arg3;
			local5 += local20 * Static103.anInt2161;
		}
		if (arg2 + arg4 > Static103.anInt2159) {
			arg4 -= arg2 + arg4 - Static103.anInt2159;
		}
		if (arg1 < Static103.anInt2160) {
			local20 = Static103.anInt2160 - arg1;
			arg3 -= local20;
			arg1 = Static103.anInt2160;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static103.anInt2163) {
			local20 = arg1 + arg3 - Static103.anInt2163;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static103.anIntArray153 == null) {
			Static307.method2043(Static103.anIntArray155, this.aByteArrayArray9[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static307.method2041(Static103.anIntArray155, this.aByteArrayArray9[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static103.anIntArray153, Static103.anIntArray154);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method2025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static103.anInt2161;
		@Pc(9) int local9 = Static103.anInt2161 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static103.anInt2162) {
			local20 = Static103.anInt2162 - arg2;
			arg4 -= local20;
			arg2 = Static103.anInt2162;
			local13 = local20 * arg3;
			local5 += local20 * Static103.anInt2161;
		}
		if (arg2 + arg4 > Static103.anInt2159) {
			arg4 -= arg2 + arg4 - Static103.anInt2159;
		}
		if (arg1 < Static103.anInt2160) {
			local20 = Static103.anInt2160 - arg1;
			arg3 -= local20;
			arg1 = Static103.anInt2160;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static103.anInt2163) {
			local20 = arg1 + arg3 - Static103.anInt2163;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static307.method2042(Static103.anIntArray155, this.aByteArrayArray9[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}
}
