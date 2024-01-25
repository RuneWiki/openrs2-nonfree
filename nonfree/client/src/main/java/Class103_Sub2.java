import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public abstract class Class103_Sub2 extends Class103 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
	protected int anInt8630;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
	protected int anInt8637;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "[I")
	private int[] anIntArray547;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
	protected int anInt8644;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
	protected int anInt8646;

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "Lclient!fga;")
	protected final Class82_Sub2 aClass82_Sub2_11;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	public final int anInt8627;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
	public final int anInt8649;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!fga;II)V")
	public Class103_Sub2(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass82_Sub2_11 = arg0;
		this.anInt8627 = arg1;
		this.anInt8649 = arg2;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()I")
	@Override
	public final int method7440() {
		return this.anInt8649;
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "()I")
	@Override
	public final int method7451() {
		return this.anInt8630 + this.anInt8649 + this.anInt8646;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method7464(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt8644 + this.anInt8627 + this.anInt8637;
		@Pc(17) int local17 = this.anInt8630 + this.anInt8649 + this.anInt8646;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt8627 || local17 != this.anInt8649) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt8630;
			local65 = local53 * (float) this.anInt8630;
			local71 = local32 * (float) this.anInt8644;
			local77 = local39 * (float) this.anInt8644;
			@Pc(84) float local84 = -local32 * (float) this.anInt8637;
			@Pc(91) float local91 = -local39 * (float) this.anInt8637;
			@Pc(98) float local98 = -local46 * (float) this.anInt8646;
			@Pc(105) float local105 = -local53 * (float) this.anInt8646;
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
		if (local46 < (float) this.aClass82_Sub2_11.anInt3103) {
			local46 = (float) this.aClass82_Sub2_11.anInt3103;
		}
		if (local53 > (float) this.aClass82_Sub2_11.anInt3096) {
			local53 = (float) this.aClass82_Sub2_11.anInt3096;
		}
		if (local59 < (float) this.aClass82_Sub2_11.anInt3083) {
			local59 = (float) this.aClass82_Sub2_11.anInt3083;
		}
		if (local65 > (float) this.aClass82_Sub2_11.anInt3091) {
			local65 = (float) this.aClass82_Sub2_11.anInt3091;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static593.anInt8640 = this.aClass82_Sub2_11.anInt3098;
		Static593.anInt8642 = (int) ((float) ((int) local59 * Static593.anInt8640) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static593.anInt8648 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt8627 / local71);
		Static593.anInt8653 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt8649 / local77);
		Static593.anInt8636 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt8627 / local77);
		Static593.anInt8651 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt8649 / local71);
		Static593.anInt8634 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static593.anInt8645 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static593.anInt8643 = (this.anInt8627 >> 1 << 12) + (Static593.anInt8645 * Static593.anInt8636 >> 4);
		Static593.anInt8650 = (this.anInt8649 >> 1 << 12) + (Static593.anInt8645 * Static593.anInt8651 >> 4);
		Static593.anInt8635 = Static593.anInt8634 * Static593.anInt8648 >> 4;
		Static593.anInt8656 = Static593.anInt8634 * Static593.anInt8653 >> 4;
		Static593.anInt8629 = (int) local46;
		Static593.anInt8652 = (int) local53;
		Static593.anInt8655 = (int) local59;
		Static593.anInt8632 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "()I")
	@Override
	public final int method7454() {
		return this.anInt8644 + this.anInt8627 + this.anInt8637;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass82_Sub2_11.method2700()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray547 == null) {
			this.anIntArray547 = new int[4];
		}
		this.aClass82_Sub2_11.K(this.anIntArray547);
		this.aClass82_Sub2_11.T(this.aClass82_Sub2_11.anInt3103, this.aClass82_Sub2_11.anInt3083, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method7454();
		@Pc(40) int local40 = this.method7451();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method7444(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass82_Sub2_11.KA(this.anIntArray547[0], this.anIntArray547[1], this.anIntArray547[2], this.anIntArray547[3]);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "()I")
	@Override
	public final int method7445() {
		return this.anInt8627;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method7453(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass82_Sub2_11.method2700()) {
			throw new IllegalStateException();
		} else if (this.method7464(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub3 local20 = (Class1_Sub3) arg6;
			this.method7466(local20.anIntArray590, local20.anIntArray591, Static593.anInt8629 - arg7, -arg8 - (Static593.anInt8632 - Static593.anInt8655));
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method7465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method7441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8644 = arg0;
		this.anInt8630 = arg1;
		this.anInt8637 = arg2;
		this.anInt8646 = arg3;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method7457(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass82_Sub2_11.method2700()) {
			throw new IllegalStateException();
		} else if (this.method7464(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static593.anInt8631 = arg7;
			if (arg6 != 1) {
				Static593.anInt8638 = arg7 >>> 24;
				Static593.anInt8639 = 256 - Static593.anInt8638;
				if (arg6 == 0) {
					Static593.anInt8628 = arg7 >> 16 & 0xFF;
					Static593.anInt8633 = arg7 >> 8 & 0xFF;
					Static593.anInt8654 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static593.anInt8657 = arg7 >>> 24;
					Static593.anInt8641 = 256 - Static593.anInt8657;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static593.anInt8641 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static593.anInt8641 & 0xFF0000;
					Static593.anInt8647 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method7467(1);
			} else if (arg6 == 0) {
				this.method7467(0);
			} else if (arg6 == 3) {
				this.method7467(3);
			} else if (arg6 == 2) {
				this.method7467(2);
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V")
	public abstract void method7444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[III)V")
	protected abstract void method7466(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([I)V")
	@Override
	public final void method7459(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8644;
		arg0[1] = this.anInt8630;
		arg0[2] = this.anInt8637;
		arg0[3] = this.anInt8646;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V")
	protected abstract void method7467(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method7439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
