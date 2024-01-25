import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public abstract class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "I")
	protected int anInt6653;

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "I")
	protected int anInt6655;

	@OriginalMember(owner = "client!nu", name = "l", descriptor = "I")
	protected int anInt6659;

	@OriginalMember(owner = "client!nu", name = "m", descriptor = "[I")
	private int[] anIntArray399;

	@OriginalMember(owner = "client!nu", name = "o", descriptor = "I")
	protected int anInt6661;

	@OriginalMember(owner = "client!nu", name = "k", descriptor = "Lclient!ao;")
	protected final Class20_Sub1 aClass20_Sub1_8;

	@OriginalMember(owner = "client!nu", name = "v", descriptor = "I")
	public final int anInt6668;

	@OriginalMember(owner = "client!nu", name = "u", descriptor = "I")
	public final int anInt6667;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lclient!ao;II)V")
	public Class46_Sub1(@OriginalArg(0) Class20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass20_Sub1_8 = arg0;
		this.anInt6668 = arg1;
		this.anInt6667 = arg2;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIII)V")
	public abstract void method6203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "()I")
	@Override
	public final int method6210() {
		return this.anInt6668;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "([I)V")
	@Override
	public final void method6223(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6659;
		arg0[1] = this.anInt6661;
		arg0[2] = this.anInt6653;
		arg0[3] = this.anInt6655;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass20_Sub1_8.method570()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray399 == null) {
			this.anIntArray399 = new int[4];
		}
		this.aClass20_Sub1_8.K(this.anIntArray399);
		this.aClass20_Sub1_8.T(this.aClass20_Sub1_8.anInt375, this.aClass20_Sub1_8.anInt359, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method6205();
		@Pc(40) int local40 = this.method6219();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method6203(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass20_Sub1_8.KA(this.anIntArray399[0], this.anIntArray399[1], this.anIntArray399[2], this.anIntArray399[3]);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method6222(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass20_Sub1_8.method570()) {
			throw new IllegalStateException();
		} else if (this.method5686(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub3 local20 = (Class1_Sub3) arg6;
			this.method5684(local20.anIntArray453, local20.anIntArray454, Static383.anInt6670 - arg7, -arg8 - (Static383.anInt6665 - Static383.anInt6663));
		}
	}

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(IIII)V")
	@Override
	public final void method6224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6659 = arg0;
		this.anInt6661 = arg1;
		this.anInt6653 = arg2;
		this.anInt6655 = arg3;
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(II)V")
	protected abstract void method5683(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "([I[III)V")
	protected abstract void method5684(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method6201(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass20_Sub1_8.method570()) {
			throw new IllegalStateException();
		} else if (this.method5686(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static383.anInt6677 = arg7;
			if (arg6 != 1) {
				Static383.anInt6674 = arg7 >>> 24;
				Static383.anInt6669 = 256 - Static383.anInt6674;
				if (arg6 == 0) {
					Static383.anInt6666 = arg7 >> 16 & 0xFF;
					Static383.anInt6660 = arg7 >> 8 & 0xFF;
					Static383.anInt6662 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static383.anInt6658 = arg7 >>> 24;
					Static383.anInt6654 = 256 - Static383.anInt6658;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static383.anInt6654 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static383.anInt6654 & 0xFF0000;
					Static383.anInt6671 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method5683(1);
			} else if (arg6 == 0) {
				this.method5683(0);
			} else if (arg6 == 3) {
				this.method5683(3);
			} else if (arg6 == 2) {
				this.method5683(2);
			}
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method5685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method6221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "()I")
	@Override
	public final int method6208() {
		return this.anInt6667;
	}

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "()I")
	@Override
	public final int method6219() {
		return this.anInt6661 + this.anInt6667 + this.anInt6655;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "()I")
	@Override
	public final int method6205() {
		return this.anInt6659 + this.anInt6668 + this.anInt6653;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method6202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method5686(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt6659 + this.anInt6668 + this.anInt6653;
		@Pc(17) int local17 = this.anInt6661 + this.anInt6667 + this.anInt6655;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt6668 || local17 != this.anInt6667) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt6661;
			local65 = local53 * (float) this.anInt6661;
			local71 = local32 * (float) this.anInt6659;
			local77 = local39 * (float) this.anInt6659;
			@Pc(84) float local84 = -local32 * (float) this.anInt6653;
			@Pc(91) float local91 = -local39 * (float) this.anInt6653;
			@Pc(98) float local98 = -local46 * (float) this.anInt6655;
			@Pc(105) float local105 = -local53 * (float) this.anInt6655;
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
		if (local46 < (float) this.aClass20_Sub1_8.anInt375) {
			local46 = this.aClass20_Sub1_8.anInt375;
		}
		if (local53 > (float) this.aClass20_Sub1_8.anInt382) {
			local53 = this.aClass20_Sub1_8.anInt382;
		}
		if (local59 < (float) this.aClass20_Sub1_8.anInt359) {
			local59 = this.aClass20_Sub1_8.anInt359;
		}
		if (local65 > (float) this.aClass20_Sub1_8.anInt379) {
			local65 = this.aClass20_Sub1_8.anInt379;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static383.anInt6652 = this.aClass20_Sub1_8.anInt360;
		Static383.anInt6650 = (int) ((float) ((int) local59 * Static383.anInt6652) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static383.anInt6678 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt6668 / local71);
		Static383.anInt6649 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt6667 / local77);
		Static383.anInt6656 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt6668 / local77);
		Static383.anInt6651 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt6667 / local71);
		Static383.anInt6673 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static383.anInt6679 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static383.anInt6657 = (this.anInt6668 >> 1 << 12) + (Static383.anInt6679 * Static383.anInt6656 >> 4);
		Static383.anInt6664 = (this.anInt6667 >> 1 << 12) + (Static383.anInt6679 * Static383.anInt6651 >> 4);
		Static383.anInt6676 = Static383.anInt6673 * Static383.anInt6678 >> 4;
		Static383.anInt6672 = Static383.anInt6673 * Static383.anInt6649 >> 4;
		Static383.anInt6670 = (int) local46;
		Static383.anInt6675 = (int) local53;
		Static383.anInt6663 = (int) local59;
		Static383.anInt6665 = (int) local65;
		return true;
	}
}
