import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class1_Sub2_Sub6_Sub1 extends Class1_Sub2_Sub6 {

	@OriginalMember(owner = "client!jh", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray6 = new byte[256][];

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class1_Sub2_Sub6_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray6 = arg5;
	}

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub6_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method4021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static25.anInt420;
		@Pc(9) int local9 = Static25.anInt420 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static25.anInt417) {
			local20 = Static25.anInt417 - arg2;
			arg4 -= local20;
			arg2 = Static25.anInt417;
			local13 = local20 * arg3;
			local5 += local20 * Static25.anInt420;
		}
		if (arg2 + arg4 > Static25.anInt419) {
			arg4 -= arg2 + arg4 - Static25.anInt419;
		}
		if (arg1 < Static25.anInt418) {
			local20 = Static25.anInt418 - arg1;
			arg3 -= local20;
			arg1 = Static25.anInt418;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static25.anInt422) {
			local20 = arg1 + arg3 - Static25.anInt422;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static320.method2285(Static25.anIntArray27, this.aByteArrayArray6[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method4017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static25.anInt420;
		@Pc(9) int local9 = Static25.anInt420 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static25.anInt417) {
			local20 = Static25.anInt417 - arg2;
			arg4 -= local20;
			arg2 = Static25.anInt417;
			local13 = local20 * arg3;
			local5 += local20 * Static25.anInt420;
		}
		if (arg2 + arg4 > Static25.anInt419) {
			arg4 -= arg2 + arg4 - Static25.anInt419;
		}
		if (arg1 < Static25.anInt418) {
			local20 = Static25.anInt418 - arg1;
			arg3 -= local20;
			arg1 = Static25.anInt418;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static25.anInt422) {
			local20 = arg1 + arg3 - Static25.anInt422;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static25.anIntArray25 == null) {
			Static320.method2283(Static25.anIntArray27, this.aByteArrayArray6[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static320.method2284(Static25.anIntArray27, this.aByteArrayArray6[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static25.anIntArray25, Static25.anIntArray26);
		}
	}
}
