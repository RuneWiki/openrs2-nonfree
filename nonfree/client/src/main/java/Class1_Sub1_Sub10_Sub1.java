import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class1_Sub1_Sub10_Sub1 extends Class1_Sub1_Sub10 {

	@OriginalMember(owner = "client!ki", name = "xb", descriptor = "[[B")
	private byte[][] aByteArrayArray7 = new byte[256][];

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class1_Sub1_Sub10_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray7 = arg5;
	}

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub10_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method1835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static29.anInt549;
		@Pc(9) int local9 = Static29.anInt549 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static29.anInt548) {
			local20 = Static29.anInt548 - arg2;
			arg4 -= local20;
			arg2 = Static29.anInt548;
			local13 = local20 * arg3;
			local5 += local20 * Static29.anInt549;
		}
		if (arg2 + arg4 > Static29.anInt550) {
			arg4 -= arg2 + arg4 - Static29.anInt550;
		}
		if (arg1 < Static29.anInt552) {
			local20 = Static29.anInt552 - arg1;
			arg3 -= local20;
			arg1 = Static29.anInt552;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static29.anInt551) {
			local20 = arg1 + arg3 - Static29.anInt551;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static29.anIntArray57 == null) {
			Static239.method1837(Static29.anIntArray59, this.aByteArrayArray7[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static239.method1838(Static29.anIntArray59, this.aByteArrayArray7[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static29.anIntArray57, Static29.anIntArray58);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method1830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static29.anInt549;
		@Pc(9) int local9 = Static29.anInt549 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static29.anInt548) {
			local20 = Static29.anInt548 - arg2;
			arg4 -= local20;
			arg2 = Static29.anInt548;
			local13 = local20 * arg3;
			local5 += local20 * Static29.anInt549;
		}
		if (arg2 + arg4 > Static29.anInt550) {
			arg4 -= arg2 + arg4 - Static29.anInt550;
		}
		if (arg1 < Static29.anInt552) {
			local20 = Static29.anInt552 - arg1;
			arg3 -= local20;
			arg1 = Static29.anInt552;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static29.anInt551) {
			local20 = arg1 + arg3 - Static29.anInt551;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static239.method1836(Static29.anIntArray59, this.aByteArrayArray7[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}
}
