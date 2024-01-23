import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class1_Sub2_Sub1_Sub2 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!bn", name = "S", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[256][];

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub1_Sub2(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class1_Sub2_Sub1_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray4 = arg5;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static50.anInt1138;
		@Pc(9) int local9 = Static50.anInt1138 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static50.anInt1135) {
			local20 = Static50.anInt1135 - arg2;
			arg4 -= local20;
			arg2 = Static50.anInt1135;
			local13 = local20 * arg3;
			local5 += local20 * Static50.anInt1138;
		}
		if (arg2 + arg4 > Static50.anInt1136) {
			arg4 -= arg2 + arg4 - Static50.anInt1136;
		}
		if (arg1 < Static50.anInt1139) {
			local20 = Static50.anInt1139 - arg1;
			arg3 -= local20;
			arg1 = Static50.anInt1139;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static50.anInt1137) {
			local20 = arg1 + arg3 - Static50.anInt1137;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static50.anIntArray108 == null) {
			Static300.method475(Static50.anIntArray107, this.aByteArrayArray4[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static300.method474(Static50.anIntArray107, this.aByteArrayArray4[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static50.anIntArray108, Static50.anIntArray109);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static50.anInt1138;
		@Pc(9) int local9 = Static50.anInt1138 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static50.anInt1135) {
			local20 = Static50.anInt1135 - arg2;
			arg4 -= local20;
			arg2 = Static50.anInt1135;
			local13 = local20 * arg3;
			local5 += local20 * Static50.anInt1138;
		}
		if (arg2 + arg4 > Static50.anInt1136) {
			arg4 -= arg2 + arg4 - Static50.anInt1136;
		}
		if (arg1 < Static50.anInt1139) {
			local20 = Static50.anInt1139 - arg1;
			arg3 -= local20;
			arg1 = Static50.anInt1139;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static50.anInt1137) {
			local20 = arg1 + arg3 - Static50.anInt1137;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static300.method473(Static50.anIntArray107, this.aByteArrayArray4[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}
}
