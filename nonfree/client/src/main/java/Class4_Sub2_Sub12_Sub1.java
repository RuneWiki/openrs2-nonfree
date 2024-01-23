import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class4_Sub2_Sub12_Sub1 extends Class4_Sub2_Sub12 {

	@OriginalMember(owner = "client!kg", name = "H", descriptor = "[[B")
	private byte[][] aByteArrayArray12 = new byte[256][];

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "([B)V")
	public Class4_Sub2_Sub12_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class4_Sub2_Sub12_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray12 = arg5;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method4175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static166.anInt3305;
		@Pc(9) int local9 = Static166.anInt3305 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static166.anInt3303) {
			local20 = Static166.anInt3303 - arg2;
			arg4 -= local20;
			arg2 = Static166.anInt3303;
			local13 = local20 * arg3;
			local5 += local20 * Static166.anInt3305;
		}
		if (arg2 + arg4 > Static166.anInt3304) {
			arg4 -= arg2 + arg4 - Static166.anInt3304;
		}
		if (arg1 < Static166.anInt3302) {
			local20 = Static166.anInt3302 - arg1;
			arg3 -= local20;
			arg1 = Static166.anInt3302;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static166.anInt3306) {
			local20 = arg1 + arg3 - Static166.anInt3306;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static305.method2256(Static166.anIntArray293, this.aByteArrayArray12[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method4183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static166.anInt3305;
		@Pc(9) int local9 = Static166.anInt3305 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static166.anInt3303) {
			local20 = Static166.anInt3303 - arg2;
			arg4 -= local20;
			arg2 = Static166.anInt3303;
			local13 = local20 * arg3;
			local5 += local20 * Static166.anInt3305;
		}
		if (arg2 + arg4 > Static166.anInt3304) {
			arg4 -= arg2 + arg4 - Static166.anInt3304;
		}
		if (arg1 < Static166.anInt3302) {
			local20 = Static166.anInt3302 - arg1;
			arg3 -= local20;
			arg1 = Static166.anInt3302;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static166.anInt3306) {
			local20 = arg1 + arg3 - Static166.anInt3306;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static166.anIntArray294 == null) {
			Static305.method2257(Static166.anIntArray293, this.aByteArrayArray12[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static305.method2258(Static166.anIntArray293, this.aByteArrayArray12[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static166.anIntArray294, Static166.anIntArray295);
		}
	}
}
