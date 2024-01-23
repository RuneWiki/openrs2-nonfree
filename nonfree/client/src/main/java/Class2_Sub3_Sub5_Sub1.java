import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class2_Sub3_Sub5_Sub1 extends Class2_Sub3_Sub5 {

	@OriginalMember(owner = "client!g", name = "bb", descriptor = "[[B")
	private byte[][] aByteArrayArray38 = new byte[256][];

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class2_Sub3_Sub5_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray38 = arg5;
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "([B)V")
	public Class2_Sub3_Sub5_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method3322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static160.anInt3390;
		@Pc(9) int local9 = Static160.anInt3390 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static160.anInt3391) {
			local20 = Static160.anInt3391 - arg2;
			arg4 -= local20;
			arg2 = Static160.anInt3391;
			local13 = local20 * arg3;
			local5 += local20 * Static160.anInt3390;
		}
		if (arg2 + arg4 > Static160.anInt3392) {
			arg4 -= arg2 + arg4 - Static160.anInt3392;
		}
		if (arg1 < Static160.anInt3389) {
			local20 = Static160.anInt3389 - arg1;
			arg3 -= local20;
			arg1 = Static160.anInt3389;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static160.anInt3387) {
			local20 = arg1 + arg3 - Static160.anInt3387;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static305.method1490(Static160.anIntArray254, this.aByteArrayArray38[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method3306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static160.anInt3390;
		@Pc(9) int local9 = Static160.anInt3390 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static160.anInt3391) {
			local20 = Static160.anInt3391 - arg2;
			arg4 -= local20;
			arg2 = Static160.anInt3391;
			local13 = local20 * arg3;
			local5 += local20 * Static160.anInt3390;
		}
		if (arg2 + arg4 > Static160.anInt3392) {
			arg4 -= arg2 + arg4 - Static160.anInt3392;
		}
		if (arg1 < Static160.anInt3389) {
			local20 = Static160.anInt3389 - arg1;
			arg3 -= local20;
			arg1 = Static160.anInt3389;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static160.anInt3387) {
			local20 = arg1 + arg3 - Static160.anInt3387;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static160.anIntArray255 == null) {
			Static305.method1491(Static160.anIntArray254, this.aByteArrayArray38[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static305.method1489(Static160.anIntArray254, this.aByteArrayArray38[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static160.anIntArray255, Static160.anIntArray253);
		}
	}
}
