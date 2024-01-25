import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public abstract class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!c", name = "v", descriptor = "I")
	protected int anInt8642;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "I")
	protected int anInt8647;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "I")
	protected int anInt8648;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "[I")
	private int[] anIntArray578;

	@OriginalMember(owner = "client!c", name = "G", descriptor = "I")
	protected int anInt8657;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "Lclient!ed;")
	protected final Class75_Sub2 aClass75_Sub2_10;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	public final int anInt8663;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "I")
	public final int anInt8661;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lclient!ed;II)V")
	public Class49_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass75_Sub2_10 = arg0;
		this.anInt8663 = arg1;
		this.anInt8661 = arg2;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method7592(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt8647 + this.anInt8663 + this.anInt8648;
		@Pc(17) int local17 = this.anInt8642 + this.anInt8661 + this.anInt8657;
		@Pc(34) float local34;
		@Pc(41) float local41;
		@Pc(48) float local48;
		@Pc(55) float local55;
		@Pc(61) float local61;
		@Pc(67) float local67;
		@Pc(73) float local73;
		@Pc(79) float local79;
		if (local8 != this.anInt8663 || local17 != this.anInt8661) {
			local34 = (arg2 - arg0) / (float) local8;
			local41 = (arg3 - arg1) / (float) local8;
			local48 = (arg4 - arg0) / (float) local17;
			local55 = (arg5 - arg1) / (float) local17;
			local61 = local48 * (float) this.anInt8642;
			local67 = local55 * (float) this.anInt8642;
			local73 = local34 * (float) this.anInt8647;
			local79 = local41 * (float) this.anInt8647;
			@Pc(86) float local86 = -local34 * (float) this.anInt8648;
			@Pc(93) float local93 = -local41 * (float) this.anInt8648;
			@Pc(100) float local100 = -local48 * (float) this.anInt8657;
			@Pc(107) float local107 = -local55 * (float) this.anInt8657;
			arg0 += local73 + local61;
			arg1 += local79 + local67;
			arg2 += local86 + local61;
			arg3 += local93 + local67;
			arg4 += local73 + local100;
			arg5 += local79 + local107;
		}
		local34 = arg4 + arg2 - arg0;
		local41 = arg3 + arg5 - arg1;
		if (arg0 < arg2) {
			local48 = arg0;
			local55 = arg2;
		} else {
			local48 = arg2;
			local55 = arg0;
		}
		if (arg4 < local48) {
			local48 = arg4;
		}
		if (local34 < local48) {
			local48 = local34;
		}
		if (arg4 > local55) {
			local55 = arg4;
		}
		if (local34 > local55) {
			local55 = local34;
		}
		if (arg1 < arg3) {
			local61 = arg1;
			local67 = arg3;
		} else {
			local61 = arg3;
			local67 = arg1;
		}
		if (arg5 < local61) {
			local61 = arg5;
		}
		if (local41 < local61) {
			local61 = local41;
		}
		if (arg5 > local67) {
			local67 = arg5;
		}
		if (local41 > local67) {
			local67 = local41;
		}
		if (local48 < (float) this.aClass75_Sub2_10.anInt2348) {
			local48 = (float) this.aClass75_Sub2_10.anInt2348;
		}
		if (local55 > (float) this.aClass75_Sub2_10.anInt2356) {
			local55 = (float) this.aClass75_Sub2_10.anInt2356;
		}
		if (local61 < (float) this.aClass75_Sub2_10.anInt2347) {
			local61 = (float) this.aClass75_Sub2_10.anInt2347;
		}
		if (local67 > (float) this.aClass75_Sub2_10.anInt2341) {
			local67 = (float) this.aClass75_Sub2_10.anInt2341;
		}
		local55 = local48 - local55;
		if (local55 >= 0.0F) {
			return false;
		}
		local67 = local61 - local67;
		if (local67 >= 0.0F) {
			return false;
		}
		Static60.anInt8656 = this.aClass75_Sub2_10.anInt2345;
		Static60.anInt8639 = (int) ((float) ((int) local61 * Static60.anInt8656) + local48);
		local73 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local79 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static60.anInt8659 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt8663 / local73);
		Static60.anInt8644 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt8661 / local79);
		Static60.anInt8665 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt8663 / local79);
		Static60.anInt8652 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt8661 / local73);
		Static60.anInt8658 = (int) (local48 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local34) / 4.0F * 16.0F);
		Static60.anInt8640 = (int) (local61 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local41) / 4.0F * 16.0F);
		Static60.anInt8666 = (this.anInt8663 >> 1 << 12) + (Static60.anInt8640 * Static60.anInt8665 >> 4);
		Static60.anInt8641 = (this.anInt8661 >> 1 << 12) + (Static60.anInt8640 * Static60.anInt8652 >> 4);
		Static60.anInt8655 = Static60.anInt8658 * Static60.anInt8659 >> 4;
		Static60.anInt8662 = Static60.anInt8658 * Static60.anInt8644 >> 4;
		Static60.anInt8650 = (int) local48;
		Static60.anInt8653 = (int) local55;
		Static60.anInt8645 = (int) local61;
		Static60.anInt8646 = (int) local67;
		return true;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([I[III)V")
	protected abstract void method7593(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method8989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8647 = arg0;
		this.anInt8642 = arg1;
		this.anInt8648 = arg2;
		this.anInt8657 = arg3;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()I")
	@Override
	public final int method8988() {
		return this.anInt8663;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method8975(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass75_Sub2_10.method2311()) {
			throw new IllegalStateException();
		} else if (this.method7592(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static60.anInt8649 = arg7;
			if (arg6 != 1) {
				Static60.anInt8664 = arg7 >>> 24;
				Static60.anInt8654 = 256 - Static60.anInt8664;
				if (arg6 == 0) {
					Static60.anInt8669 = arg7 >> 16 & 0xFF;
					Static60.anInt8668 = arg7 >> 8 & 0xFF;
					Static60.anInt8651 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static60.anInt8643 = arg7 >>> 24;
					Static60.anInt8660 = 256 - Static60.anInt8643;
					@Pc(73) int local73 = (arg7 & 0xFF00FF) * Static60.anInt8660 & 0xFF00FF00;
					@Pc(81) int local81 = (arg7 & 0xFF00) * Static60.anInt8660 & 0xFF0000;
					Static60.anInt8667 = (local73 | local81) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method7594(1);
			} else if (arg6 == 0) {
				this.method7594(0);
			} else if (arg6 == 3) {
				this.method7594(3);
			} else if (arg6 == 2) {
				this.method7594(2);
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method8979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)V")
	protected abstract void method7594(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([I)V")
	@Override
	public final void method8984(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8647;
		arg0[1] = this.anInt8642;
		arg0[2] = this.anInt8648;
		arg0[3] = this.anInt8657;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method7595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIIIIIIII)V")
	public abstract void method7596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!c", name = "d", descriptor = "()I")
	@Override
	public final int method8991() {
		return this.anInt8647 + this.anInt8663 + this.anInt8648;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "()I")
	@Override
	public final int method8993() {
		return this.anInt8661;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method8980(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass75_Sub2_10.method2311()) {
			throw new IllegalStateException();
		} else if (this.method7592(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(22) Class1_Sub2 local22 = (Class1_Sub2) arg6;
			this.method7593(local22.anIntArray367, local22.anIntArray366, Static60.anInt8650 - arg7, -arg8 - (Static60.anInt8646 - Static60.anInt8645));
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method8982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method8990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass75_Sub2_10.method2311()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray578 == null) {
			this.anIntArray578 = new int[4];
		}
		this.aClass75_Sub2_10.K(this.anIntArray578);
		this.aClass75_Sub2_10.T(this.aClass75_Sub2_10.anInt2348, this.aClass75_Sub2_10.anInt2347, arg0 + arg2, arg1 + arg3);
		@Pc(40) int local40 = this.method8991();
		@Pc(43) int local43 = this.method8987();
		@Pc(51) int local51 = (arg2 + local40 - 1) / local40;
		@Pc(59) int local59 = (arg3 + local43 - 1) / local43;
		for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
			@Pc(66) int local66 = local61 * local43;
			for (@Pc(68) int local68 = 0; local68 < local51; local68++) {
				this.method8981(arg0 + local68 * local40, arg1 + local66, arg4, arg5, arg6);
			}
		}
		this.aClass75_Sub2_10.KA(this.anIntArray578[0], this.anIntArray578[1], this.anIntArray578[2], this.anIntArray578[3]);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
	@Override
	public final int method8987() {
		return this.anInt8642 + this.anInt8661 + this.anInt8657;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public abstract void method8981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
