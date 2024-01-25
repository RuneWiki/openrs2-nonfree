import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sia")
public abstract class Class32_Sub2 extends Class32 {

	@OriginalMember(owner = "client!sia", name = "c", descriptor = "I")
	protected int anInt4879;

	@OriginalMember(owner = "client!sia", name = "f", descriptor = "I")
	protected int anInt4882;

	@OriginalMember(owner = "client!sia", name = "u", descriptor = "[I")
	private int[] anIntArray283;

	@OriginalMember(owner = "client!sia", name = "w", descriptor = "I")
	protected int anInt4897;

	@OriginalMember(owner = "client!sia", name = "y", descriptor = "I")
	protected int anInt4899;

	@OriginalMember(owner = "client!sia", name = "v", descriptor = "Lclient!iw;")
	protected final Class100_Sub2 aClass100_Sub2_8;

	@OriginalMember(owner = "client!sia", name = "B", descriptor = "I")
	public final int anInt4902;

	@OriginalMember(owner = "client!sia", name = "s", descriptor = "I")
	public final int anInt4895;

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lclient!iw;II)V")
	public Class32_Sub2(@OriginalArg(0) Class100_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass100_Sub2_8 = arg0;
		this.anInt4902 = arg1;
		this.anInt4895 = arg2;
	}

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "()I")
	@Override
	public final int method5077() {
		return this.anInt4895;
	}

	@OriginalMember(owner = "client!sia", name = "c", descriptor = "()I")
	@Override
	public final int method5079() {
		return this.anInt4899 + this.anInt4895 + this.anInt4882;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method4257(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt4897 + this.anInt4902 + this.anInt4879;
		@Pc(17) int local17 = this.anInt4899 + this.anInt4895 + this.anInt4882;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt4902 || local17 != this.anInt4895) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt4899;
			local65 = local53 * (float) this.anInt4899;
			local71 = local32 * (float) this.anInt4897;
			local77 = local39 * (float) this.anInt4897;
			@Pc(84) float local84 = -local32 * (float) this.anInt4879;
			@Pc(91) float local91 = -local39 * (float) this.anInt4879;
			@Pc(98) float local98 = -local46 * (float) this.anInt4882;
			@Pc(105) float local105 = -local53 * (float) this.anInt4882;
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
		if (local46 < (float) this.aClass100_Sub2_8.anInt4995) {
			local46 = (float) this.aClass100_Sub2_8.anInt4995;
		}
		if (local53 > (float) this.aClass100_Sub2_8.anInt5003) {
			local53 = (float) this.aClass100_Sub2_8.anInt5003;
		}
		if (local59 < (float) this.aClass100_Sub2_8.anInt5005) {
			local59 = (float) this.aClass100_Sub2_8.anInt5005;
		}
		if (local65 > (float) this.aClass100_Sub2_8.anInt5006) {
			local65 = (float) this.aClass100_Sub2_8.anInt5006;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static521.anInt4904 = this.aClass100_Sub2_8.anInt4996;
		Static521.anInt4893 = (int) ((float) ((int) local59 * Static521.anInt4904) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static521.anInt4890 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt4902 / local71);
		Static521.anInt4880 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt4895 / local77);
		Static521.anInt4877 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt4902 / local77);
		Static521.anInt4898 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt4895 / local71);
		Static521.anInt4884 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static521.anInt4878 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static521.anInt4906 = (this.anInt4902 >> 1 << 12) + (Static521.anInt4878 * Static521.anInt4877 >> 4);
		Static521.anInt4889 = (this.anInt4895 >> 1 << 12) + (Static521.anInt4878 * Static521.anInt4898 >> 4);
		Static521.anInt4888 = Static521.anInt4884 * Static521.anInt4890 >> 4;
		Static521.anInt4905 = Static521.anInt4884 * Static521.anInt4880 >> 4;
		Static521.anInt4903 = (int) local46;
		Static521.anInt4896 = (int) local53;
		Static521.anInt4883 = (int) local59;
		Static521.anInt4881 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method5069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass100_Sub2_8.method4425()) {
			throw new IllegalStateException();
		} else if (this.method4257(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub2 local20 = (Class1_Sub2) arg6;
			this.method4259(local20.anIntArray218, local20.anIntArray219, Static521.anInt4903 - arg7, -arg8 - (Static521.anInt4881 - Static521.anInt4883));
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method5084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method5083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass100_Sub2_8.method4425()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray283 == null) {
			this.anIntArray283 = new int[4];
		}
		this.aClass100_Sub2_8.K(this.anIntArray283);
		this.aClass100_Sub2_8.T(this.aClass100_Sub2_8.anInt4995, this.aClass100_Sub2_8.anInt5005, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method5080();
		@Pc(40) int local40 = this.method5079();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5088(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass100_Sub2_8.KA(this.anIntArray283[0], this.anIntArray283[1], this.anIntArray283[2], this.anIntArray283[3]);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method5073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4897 = arg0;
		this.anInt4899 = arg1;
		this.anInt4879 = arg2;
		this.anInt4882 = arg3;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "([I)V")
	@Override
	public final void method5082(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4897;
		arg0[1] = this.anInt4899;
		arg0[2] = this.anInt4879;
		arg0[3] = this.anInt4882;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method5078(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass100_Sub2_8.method4425()) {
			throw new IllegalStateException();
		} else if (this.method4257(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static521.anInt4907 = arg7;
			if (arg6 != 1) {
				Static521.anInt4886 = arg7 >>> 24;
				Static521.anInt4894 = 256 - Static521.anInt4886;
				if (arg6 == 0) {
					Static521.anInt4891 = arg7 >> 16 & 0xFF;
					Static521.anInt4900 = arg7 >> 8 & 0xFF;
					Static521.anInt4887 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static521.anInt4901 = arg7 >>> 24;
					Static521.anInt4892 = 256 - Static521.anInt4901;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static521.anInt4892 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static521.anInt4892 & 0xFF0000;
					Static521.anInt4885 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method4258(1);
			} else if (arg6 == 0) {
				this.method4258(0);
			} else if (arg6 == 3) {
				this.method4258(3);
			} else if (arg6 == 2) {
				this.method4258(2);
			}
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method5075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(II)V")
	protected abstract void method4258(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "([I[III)V")
	protected abstract void method4259(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "()I")
	@Override
	public final int method5072() {
		return this.anInt4902;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method4260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIII)V")
	public abstract void method5088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!sia", name = "d", descriptor = "()I")
	@Override
	public final int method5080() {
		return this.anInt4897 + this.anInt4902 + this.anInt4879;
	}
}
