import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public abstract class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
	protected int anInt4852;

	@OriginalMember(owner = "client!tw", name = "m", descriptor = "[I")
	private int[] anIntArray437;

	@OriginalMember(owner = "client!tw", name = "p", descriptor = "I")
	protected int anInt4861;

	@OriginalMember(owner = "client!tw", name = "w", descriptor = "I")
	protected int anInt4868;

	@OriginalMember(owner = "client!tw", name = "A", descriptor = "I")
	protected int anInt4872;

	@OriginalMember(owner = "client!tw", name = "B", descriptor = "Lclient!uga;")
	protected final Class13_Sub3 aClass13_Sub3_8;

	@OriginalMember(owner = "client!tw", name = "z", descriptor = "I")
	public final int anInt4871;

	@OriginalMember(owner = "client!tw", name = "x", descriptor = "I")
	public final int anInt4869;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!uga;II)V")
	public Class33_Sub1(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass13_Sub3_8 = arg0;
		this.anInt4871 = arg1;
		this.anInt4869 = arg2;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "([I[III)V")
	protected abstract void method4512(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "([I)V")
	@Override
	public final void method7657(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4852;
		arg0[1] = this.anInt4872;
		arg0[2] = this.anInt4868;
		arg0[3] = this.anInt4861;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method7650(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass13_Sub3_8.method8532()) {
			throw new IllegalStateException();
		} else if (this.method4515(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub2 local20 = (Class1_Sub2) arg6;
			this.method4512(local20.anIntArray458, local20.anIntArray456, Static591.anInt4859 - arg7, -arg8 - (Static591.anInt4854 - Static591.anInt4874));
		}
	}

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "()I")
	@Override
	public final int method7662() {
		return this.anInt4869;
	}

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "(IIII)V")
	@Override
	public final void method7664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4852 = arg0;
		this.anInt4872 = arg1;
		this.anInt4868 = arg2;
		this.anInt4861 = arg3;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIII)V")
	public abstract void method7644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(II)V")
	protected abstract void method4513(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "()I")
	@Override
	public final int method7658() {
		return this.anInt4872 + this.anInt4869 + this.anInt4861;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method7648(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass13_Sub3_8.method8532()) {
			throw new IllegalStateException();
		} else if (this.method4515(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static591.anInt4847 = arg7;
			if (arg6 != 1) {
				Static591.anInt4849 = arg7 >>> 24;
				Static591.anInt4864 = 256 - Static591.anInt4849;
				if (arg6 == 0) {
					Static591.anInt4856 = arg7 >> 16 & 0xFF;
					Static591.anInt4867 = arg7 >> 8 & 0xFF;
					Static591.anInt4855 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static591.anInt4857 = arg7 >>> 24;
					Static591.anInt4848 = 256 - Static591.anInt4857;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static591.anInt4848 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static591.anInt4848 & 0xFF0000;
					Static591.anInt4851 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method4513(1);
			} else if (arg6 == 0) {
				this.method4513(0);
			} else if (arg6 == 3) {
				this.method4513(3);
			} else if (arg6 == 2) {
				this.method4513(2);
			}
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass13_Sub3_8.method8532()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray437 == null) {
			this.anIntArray437 = new int[4];
		}
		this.aClass13_Sub3_8.K(this.anIntArray437);
		this.aClass13_Sub3_8.T(this.aClass13_Sub3_8.anInt9703, this.aClass13_Sub3_8.anInt9717, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method7645();
		@Pc(40) int local40 = this.method7658();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method7644(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass13_Sub3_8.KA(this.anIntArray437[0], this.anIntArray437[1], this.anIntArray437[2], this.anIntArray437[3]);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method7647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "()I")
	@Override
	public final int method7645() {
		return this.anInt4852 + this.anInt4871 + this.anInt4868;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method7652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method4514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "()I")
	@Override
	public final int method7659() {
		return this.anInt4871;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method4515(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt4852 + this.anInt4871 + this.anInt4868;
		@Pc(17) int local17 = this.anInt4872 + this.anInt4869 + this.anInt4861;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt4871 || local17 != this.anInt4869) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt4872;
			local65 = local53 * (float) this.anInt4872;
			local71 = local32 * (float) this.anInt4852;
			local77 = local39 * (float) this.anInt4852;
			@Pc(84) float local84 = -local32 * (float) this.anInt4868;
			@Pc(91) float local91 = -local39 * (float) this.anInt4868;
			@Pc(98) float local98 = -local46 * (float) this.anInt4861;
			@Pc(105) float local105 = -local53 * (float) this.anInt4861;
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
		if (local46 < (float) this.aClass13_Sub3_8.anInt9703) {
			local46 = (float) this.aClass13_Sub3_8.anInt9703;
		}
		if (local53 > (float) this.aClass13_Sub3_8.anInt9694) {
			local53 = (float) this.aClass13_Sub3_8.anInt9694;
		}
		if (local59 < (float) this.aClass13_Sub3_8.anInt9717) {
			local59 = (float) this.aClass13_Sub3_8.anInt9717;
		}
		if (local65 > (float) this.aClass13_Sub3_8.anInt9702) {
			local65 = (float) this.aClass13_Sub3_8.anInt9702;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static591.anInt4850 = this.aClass13_Sub3_8.anInt9709;
		Static591.anInt4876 = (int) ((float) ((int) local59 * Static591.anInt4850) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static591.anInt4870 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt4871 / local71);
		Static591.anInt4865 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt4869 / local77);
		Static591.anInt4862 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt4871 / local77);
		Static591.anInt4875 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt4869 / local71);
		Static591.anInt4860 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static591.anInt4853 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static591.anInt4863 = (this.anInt4871 >> 1 << 12) + (Static591.anInt4853 * Static591.anInt4862 >> 4);
		Static591.anInt4858 = (this.anInt4869 >> 1 << 12) + (Static591.anInt4853 * Static591.anInt4875 >> 4);
		Static591.anInt4873 = Static591.anInt4860 * Static591.anInt4870 >> 4;
		Static591.anInt4877 = Static591.anInt4860 * Static591.anInt4865 >> 4;
		Static591.anInt4859 = (int) local46;
		Static591.anInt4866 = (int) local53;
		Static591.anInt4874 = (int) local59;
		Static591.anInt4854 = (int) local65;
		return true;
	}
}
