import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "[I")
	private int[] anIntArray491;

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
	protected int anInt6045;

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
	protected int anInt6049;

	@OriginalMember(owner = "client!eq", name = "x", descriptor = "I")
	protected int anInt6052;

	@OriginalMember(owner = "client!eq", name = "D", descriptor = "I")
	protected int anInt6058;

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "Lclient!fg;")
	protected final Class30_Sub2 aClass30_Sub2_10;

	@OriginalMember(owner = "client!eq", name = "C", descriptor = "I")
	protected final int anInt6057;

	@OriginalMember(owner = "client!eq", name = "z", descriptor = "I")
	protected final int anInt6054;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!fg;II)V")
	protected Class2_Sub1(@OriginalArg(0) Class30_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass30_Sub2_10 = arg0;
		this.anInt6057 = arg1;
		this.anInt6054 = arg2;
	}

	@OriginalMember(owner = "client!eq", name = "V", descriptor = "()I")
	@Override
	public final int V() {
		return this.anInt6054;
	}

	@OriginalMember(owner = "client!eq", name = "PA", descriptor = "(IIIIIII)V")
	@Override
	public final void PA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass30_Sub2_10.method2117()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray491 == null) {
			this.anIntArray491 = new int[4];
		}
		this.aClass30_Sub2_10.p(this.anIntArray491);
		this.aClass30_Sub2_10.IA(this.aClass30_Sub2_10.anInt2308, this.aClass30_Sub2_10.anInt2303, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.d();
		@Pc(40) int local40 = this.ga();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.E(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass30_Sub2_10.w(this.anIntArray491[0], this.anIntArray491[1], this.anIntArray491[2], this.anIntArray491[3]);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([I[III)V")
	protected abstract void method5001(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILclient!i;II)V")
	public abstract void method5916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class74 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "()I")
	@Override
	public final int d() {
		return this.anInt6049 + this.anInt6057 + this.anInt6045;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method5002(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt6049 + this.anInt6057 + this.anInt6045;
		@Pc(17) int local17 = this.anInt6058 + this.anInt6054 + this.anInt6052;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt6057 || local17 != this.anInt6054) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt6058;
			local65 = local53 * (float) this.anInt6058;
			local71 = local32 * (float) this.anInt6049;
			local77 = local39 * (float) this.anInt6049;
			@Pc(84) float local84 = -local32 * (float) this.anInt6045;
			@Pc(91) float local91 = -local39 * (float) this.anInt6045;
			@Pc(98) float local98 = -local46 * (float) this.anInt6052;
			@Pc(105) float local105 = -local53 * (float) this.anInt6052;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + arg2 - arg0;
		local39 = arg3 + arg5 - arg1;
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) this.aClass30_Sub2_10.anInt2308) {
			local46 = this.aClass30_Sub2_10.anInt2308;
		}
		if (local53 > (float) this.aClass30_Sub2_10.anInt2305) {
			local53 = this.aClass30_Sub2_10.anInt2305;
		}
		if (local59 < (float) this.aClass30_Sub2_10.anInt2303) {
			local59 = this.aClass30_Sub2_10.anInt2303;
		}
		if (local65 > (float) this.aClass30_Sub2_10.anInt2310) {
			local65 = this.aClass30_Sub2_10.anInt2310;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static96.anInt6060 = this.aClass30_Sub2_10.anInt2299;
		Static96.anInt6056 = (int) ((float) ((int) local59 * Static96.anInt6060) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static96.anInt6043 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt6057 / local71);
		Static96.anInt6047 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt6054 / local77);
		Static96.anInt6051 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt6057 / local77);
		Static96.anInt6031 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt6054 / local71);
		Static96.anInt6036 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static96.anInt6053 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static96.anInt6039 = (this.anInt6057 >> 1 << 12) + (Static96.anInt6053 * Static96.anInt6051 >> 4);
		Static96.anInt6061 = (this.anInt6054 >> 1 << 12) + (Static96.anInt6053 * Static96.anInt6031 >> 4);
		Static96.anInt6050 = Static96.anInt6036 * Static96.anInt6043 >> 4;
		Static96.anInt6032 = Static96.anInt6036 * Static96.anInt6047 >> 4;
		Static96.anInt6041 = (int) local46;
		Static96.anInt6055 = (int) local53;
		Static96.anInt6035 = (int) local59;
		Static96.anInt6048 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!eq", name = "XA", descriptor = "(IIIIIII)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(II)V")
	protected abstract void method5003(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eq", name = "ga", descriptor = "()I")
	@Override
	public final int ga() {
		return this.anInt6058 + this.anInt6054 + this.anInt6052;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(FFFFFFLclient!i;II)V")
	@Override
	protected final void method5913(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class74 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass30_Sub2_10.method2117()) {
			throw new IllegalStateException();
		} else if (this.method5002(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class74_Sub1 local20 = (Class74_Sub1) arg6;
			this.method5001(local20.anIntArray205, local20.anIntArray204, Static96.anInt6041 - arg7, -arg8 - (Static96.anInt6048 - Static96.anInt6035));
		}
	}

	@OriginalMember(owner = "client!eq", name = "E", descriptor = "(IIIII)V")
	public abstract void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!eq", name = "ta", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void ta(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass30_Sub2_10.method2117()) {
			throw new IllegalStateException();
		} else if (this.method5002(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static96.anInt6042 = arg7;
			if (arg6 != 1) {
				Static96.anInt6059 = arg7 >>> 24;
				Static96.anInt6040 = 256 - Static96.anInt6059;
				if (arg6 == 0) {
					Static96.anInt6037 = arg7 >> 16 & 0xFF;
					Static96.anInt6034 = arg7 >> 8 & 0xFF;
					Static96.anInt6033 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static96.anInt6044 = arg7 >>> 24;
					Static96.anInt6046 = 256 - Static96.anInt6044;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static96.anInt6046 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static96.anInt6046 & 0xFF0000;
					Static96.anInt6038 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method5003(1);
			} else if (arg6 == 0) {
				this.method5003(0);
			} else if (arg6 == 3) {
				this.method5003(3);
			} else if (arg6 == 2) {
				this.method5003(2);
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "(IIII)V")
	@Override
	public final void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6049 = arg0;
		this.anInt6058 = arg1;
		this.anInt6045 = arg2;
		this.anInt6052 = arg3;
	}

	@OriginalMember(owner = "client!eq", name = "TA", descriptor = "()I")
	@Override
	public final int TA() {
		return this.anInt6057;
	}
}
