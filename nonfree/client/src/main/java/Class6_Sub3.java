import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public abstract class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	protected int anInt6054;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
	protected int anInt6055;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
	protected int anInt6056;

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "[I")
	private int[] anIntArray328;

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
	protected int anInt6069;

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "Lclient!jr;")
	protected final Class95_Sub2 aClass95_Sub2_10;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
	public final int anInt6062;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
	public final int anInt6065;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!jr;II)V")
	public Class6_Sub3(@OriginalArg(0) Class95_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass95_Sub2_10 = arg0;
		this.anInt6062 = arg1;
		this.anInt6065 = arg2;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method5137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass95_Sub2_10.method4270()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray328 == null) {
			this.anIntArray328 = new int[4];
		}
		this.aClass95_Sub2_10.K(this.anIntArray328);
		this.aClass95_Sub2_10.T(this.aClass95_Sub2_10.anInt4923, this.aClass95_Sub2_10.anInt4922, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method5130();
		@Pc(40) int local40 = this.method5134();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5133(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass95_Sub2_10.KA(this.anIntArray328[0], this.anIntArray328[1], this.anIntArray328[2], this.anIntArray328[3]);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V")
	protected abstract void method5140(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method5141(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt6055 + this.anInt6062 + this.anInt6056;
		@Pc(17) int local17 = this.anInt6069 + this.anInt6065 + this.anInt6054;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt6062 || local17 != this.anInt6065) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt6069;
			local65 = local53 * (float) this.anInt6069;
			local71 = local32 * (float) this.anInt6055;
			local77 = local39 * (float) this.anInt6055;
			@Pc(84) float local84 = -local32 * (float) this.anInt6056;
			@Pc(91) float local91 = -local39 * (float) this.anInt6056;
			@Pc(98) float local98 = -local46 * (float) this.anInt6054;
			@Pc(105) float local105 = -local53 * (float) this.anInt6054;
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
		if (local46 < (float) this.aClass95_Sub2_10.anInt4923) {
			local46 = (float) this.aClass95_Sub2_10.anInt4923;
		}
		if (local53 > (float) this.aClass95_Sub2_10.anInt4921) {
			local53 = (float) this.aClass95_Sub2_10.anInt4921;
		}
		if (local59 < (float) this.aClass95_Sub2_10.anInt4922) {
			local59 = (float) this.aClass95_Sub2_10.anInt4922;
		}
		if (local65 > (float) this.aClass95_Sub2_10.anInt4930) {
			local65 = (float) this.aClass95_Sub2_10.anInt4930;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static541.anInt6060 = this.aClass95_Sub2_10.anInt4927;
		Static541.anInt6061 = (int) ((float) ((int) local59 * Static541.anInt6060) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static541.anInt6074 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt6062 / local71);
		Static541.anInt6068 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt6065 / local77);
		Static541.anInt6059 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt6062 / local77);
		Static541.anInt6057 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt6065 / local71);
		Static541.anInt6049 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static541.anInt6048 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static541.anInt6047 = (this.anInt6062 >> 1 << 12) + (Static541.anInt6048 * Static541.anInt6059 >> 4);
		Static541.anInt6064 = (this.anInt6065 >> 1 << 12) + (Static541.anInt6048 * Static541.anInt6057 >> 4);
		Static541.anInt6044 = Static541.anInt6049 * Static541.anInt6074 >> 4;
		Static541.anInt6066 = Static541.anInt6049 * Static541.anInt6068 >> 4;
		Static541.anInt6052 = (int) local46;
		Static541.anInt6053 = (int) local53;
		Static541.anInt6045 = (int) local59;
		Static541.anInt6051 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method5131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "()I")
	@Override
	public final int method5119() {
		return this.anInt6062;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "()I")
	@Override
	public final int method5130() {
		return this.anInt6055 + this.anInt6062 + this.anInt6056;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method5124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "()I")
	@Override
	public final int method5136() {
		return this.anInt6065;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "()I")
	@Override
	public final int method5134() {
		return this.anInt6069 + this.anInt6065 + this.anInt6054;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method5142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method5128(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass95_Sub2_10.method4270()) {
			throw new IllegalStateException();
		} else if (this.method5141(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub3 local20 = (Class1_Sub3) arg6;
			this.method5143(local20.anIntArray581, local20.anIntArray582, Static541.anInt6052 - arg7, -arg8 - (Static541.anInt6051 - Static541.anInt6045));
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([I[III)V")
	protected abstract void method5143(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method5127(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass95_Sub2_10.method4270()) {
			throw new IllegalStateException();
		} else if (this.method5141(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static541.anInt6050 = arg7;
			if (arg6 != 1) {
				Static541.anInt6058 = arg7 >>> 24;
				Static541.anInt6071 = 256 - Static541.anInt6058;
				if (arg6 == 0) {
					Static541.anInt6046 = arg7 >> 16 & 0xFF;
					Static541.anInt6070 = arg7 >> 8 & 0xFF;
					Static541.anInt6072 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static541.anInt6063 = arg7 >>> 24;
					Static541.anInt6073 = 256 - Static541.anInt6063;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static541.anInt6073 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static541.anInt6073 & 0xFF0000;
					Static541.anInt6067 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method5140(1);
			} else if (arg6 == 0) {
				this.method5140(0);
			} else if (arg6 == 3) {
				this.method5140(3);
			} else if (arg6 == 2) {
				this.method5140(2);
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
	public abstract void method5133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method5123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6055 = arg0;
		this.anInt6069 = arg1;
		this.anInt6056 = arg2;
		this.anInt6054 = arg3;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([I)V")
	@Override
	public final void method5118(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6055;
		arg0[1] = this.anInt6069;
		arg0[2] = this.anInt6056;
		arg0[3] = this.anInt6054;
	}
}
