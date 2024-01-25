import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public abstract class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "[I")
	private int[] anIntArray338;

	@OriginalMember(owner = "client!bca", name = "e", descriptor = "I")
	protected int anInt4930;

	@OriginalMember(owner = "client!bca", name = "j", descriptor = "I")
	protected int anInt4935;

	@OriginalMember(owner = "client!bca", name = "w", descriptor = "I")
	protected int anInt4948;

	@OriginalMember(owner = "client!bca", name = "x", descriptor = "I")
	protected int anInt4949;

	@OriginalMember(owner = "client!bca", name = "E", descriptor = "Lclient!uj;")
	protected final Class87_Sub3 aClass87_Sub3_7;

	@OriginalMember(owner = "client!bca", name = "p", descriptor = "I")
	public final int anInt4941;

	@OriginalMember(owner = "client!bca", name = "z", descriptor = "I")
	public final int anInt4951;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lclient!uj;II)V")
	public Class20_Sub1(@OriginalArg(0) Class87_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass87_Sub3_7 = arg0;
		this.anInt4941 = arg1;
		this.anInt4951 = arg2;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method4590(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass87_Sub3_7.method7977()) {
			throw new IllegalStateException();
		} else if (this.method4094(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static31.anInt4942 = arg7;
			if (arg6 != 1) {
				Static31.anInt4952 = arg7 >>> 24;
				Static31.anInt4945 = 256 - Static31.anInt4952;
				if (arg6 == 0) {
					Static31.anInt4936 = arg7 >> 16 & 0xFF;
					Static31.anInt4946 = arg7 >> 8 & 0xFF;
					Static31.anInt4931 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static31.anInt4932 = arg7 >>> 24;
					Static31.anInt4950 = 256 - Static31.anInt4932;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static31.anInt4950 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static31.anInt4950 & 0xFF0000;
					Static31.anInt4953 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method4095(1);
			} else if (arg6 == 0) {
				this.method4095(0);
			} else if (arg6 == 3) {
				this.method4095(3);
			} else if (arg6 == 2) {
				this.method4095(2);
			}
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method4589(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass87_Sub3_7.method7977()) {
			throw new IllegalStateException();
		} else if (this.method4094(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub1 local20 = (Class1_Sub1) arg6;
			this.method4096(local20.anIntArray379, local20.anIntArray380, Static31.anInt4933 - arg7, -arg8 - (Static31.anInt4938 - Static31.anInt4937));
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method4575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method4093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "()I")
	@Override
	public final int method4588() {
		return this.anInt4935 + this.anInt4941 + this.anInt4948;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method4580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!bca", name = "d", descriptor = "()I")
	@Override
	public final int method4595() {
		return this.anInt4951;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIII)V")
	public abstract void method4581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "()I")
	@Override
	public final int method4579() {
		return this.anInt4941;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method4577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass87_Sub3_7.method7977()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray338 == null) {
			this.anIntArray338 = new int[4];
		}
		this.aClass87_Sub3_7.K(this.anIntArray338);
		this.aClass87_Sub3_7.T(this.aClass87_Sub3_7.anInt9471, this.aClass87_Sub3_7.anInt9486, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method4588();
		@Pc(40) int local40 = this.method4576();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method4581(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass87_Sub3_7.KA(this.anIntArray338[0], this.anIntArray338[1], this.anIntArray338[2], this.anIntArray338[3]);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method4094(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt4935 + this.anInt4941 + this.anInt4948;
		@Pc(17) int local17 = this.anInt4930 + this.anInt4951 + this.anInt4949;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt4941 || local17 != this.anInt4951) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt4930;
			local65 = local53 * (float) this.anInt4930;
			local71 = local32 * (float) this.anInt4935;
			local77 = local39 * (float) this.anInt4935;
			@Pc(84) float local84 = -local32 * (float) this.anInt4948;
			@Pc(91) float local91 = -local39 * (float) this.anInt4948;
			@Pc(98) float local98 = -local46 * (float) this.anInt4949;
			@Pc(105) float local105 = -local53 * (float) this.anInt4949;
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
		if (local46 < (float) this.aClass87_Sub3_7.anInt9471) {
			local46 = this.aClass87_Sub3_7.anInt9471;
		}
		if (local53 > (float) this.aClass87_Sub3_7.anInt9477) {
			local53 = this.aClass87_Sub3_7.anInt9477;
		}
		if (local59 < (float) this.aClass87_Sub3_7.anInt9486) {
			local59 = this.aClass87_Sub3_7.anInt9486;
		}
		if (local65 > (float) this.aClass87_Sub3_7.anInt9494) {
			local65 = this.aClass87_Sub3_7.anInt9494;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static31.anInt4928 = this.aClass87_Sub3_7.anInt9491;
		Static31.anInt4947 = (int) ((float) ((int) local59 * Static31.anInt4928) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static31.anInt4944 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt4941 / local71);
		Static31.anInt4954 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt4951 / local77);
		Static31.anInt4934 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt4941 / local77);
		Static31.anInt4927 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt4951 / local71);
		Static31.anInt4943 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static31.anInt4939 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static31.anInt4929 = (this.anInt4941 >> 1 << 12) + (Static31.anInt4939 * Static31.anInt4934 >> 4);
		Static31.anInt4956 = (this.anInt4951 >> 1 << 12) + (Static31.anInt4939 * Static31.anInt4927 >> 4);
		Static31.anInt4957 = Static31.anInt4943 * Static31.anInt4944 >> 4;
		Static31.anInt4940 = Static31.anInt4943 * Static31.anInt4954 >> 4;
		Static31.anInt4933 = (int) local46;
		Static31.anInt4955 = (int) local53;
		Static31.anInt4937 = (int) local59;
		Static31.anInt4938 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(II)V")
	protected abstract void method4095(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "([I[III)V")
	protected abstract void method4096(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "()I")
	@Override
	public final int method4576() {
		return this.anInt4930 + this.anInt4951 + this.anInt4949;
	}

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "(IIII)V")
	@Override
	public final void method4592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4935 = arg0;
		this.anInt4930 = arg1;
		this.anInt4948 = arg2;
		this.anInt4949 = arg3;
	}
}
