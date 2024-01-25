import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public abstract class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!rba", name = "B", descriptor = "[I")
	private int[] anIntArray449;

	@OriginalMember(owner = "client!rba", name = "o", descriptor = "I")
	protected int anInt8669;

	@OriginalMember(owner = "client!rba", name = "r", descriptor = "I")
	protected int anInt8674;

	@OriginalMember(owner = "client!rba", name = "s", descriptor = "I")
	protected int anInt8682;

	@OriginalMember(owner = "client!rba", name = "v", descriptor = "I")
	protected int anInt8685;

	@OriginalMember(owner = "client!rba", name = "p", descriptor = "Lclient!ie;")
	protected final Class144_Sub2 aClass144_Sub2_8;

	@OriginalMember(owner = "client!rba", name = "h", descriptor = "I")
	public final int anInt8686;

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
	public final int anInt8666;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!ie;II)V")
	public Class45_Sub1(@OriginalArg(0) Class144_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass144_Sub2_8 = arg0;
		this.anInt8686 = arg1;
		this.anInt8666 = arg2;
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(II)V")
	protected abstract void method7511(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "([I)V")
	@Override
	public final void method7509(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8685;
		arg0[1] = this.anInt8669;
		arg0[2] = this.anInt8674;
		arg0[3] = this.anInt8682;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method7507(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass144_Sub2_8.method4187()) {
			throw new IllegalStateException();
		} else if (this.method7515(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(22) Class1_Sub1 local22 = (Class1_Sub1) arg6;
			this.method7513(local22.anIntArray89, local22.anIntArray90, Static516.anInt8677 - arg7, -arg8 - (Static516.anInt8687 - Static516.anInt8680));
		}
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method7499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8685 = arg0;
		this.anInt8669 = arg1;
		this.anInt8674 = arg2;
		this.anInt8682 = arg3;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass144_Sub2_8.method4187()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray449 == null) {
			this.anIntArray449 = new int[4];
		}
		this.aClass144_Sub2_8.K(this.anIntArray449);
		this.aClass144_Sub2_8.T(this.aClass144_Sub2_8.anInt4717, this.aClass144_Sub2_8.anInt4715, arg0 + arg2, arg1 + arg3);
		@Pc(40) int local40 = this.method7508();
		@Pc(43) int local43 = this.method7504();
		@Pc(51) int local51 = (arg2 + local40 - 1) / local40;
		@Pc(59) int local59 = (arg3 + local43 - 1) / local43;
		for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
			@Pc(66) int local66 = local61 * local43;
			for (@Pc(68) int local68 = 0; local68 < local51; local68++) {
				this.method7491(arg0 + local68 * local40, arg1 + local66, arg4, arg5, arg6);
			}
		}
		this.aClass144_Sub2_8.KA(this.anIntArray449[0], this.anIntArray449[1], this.anIntArray449[2], this.anIntArray449[3]);
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(IIIIIIIII)V")
	public abstract void method7512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "([I[III)V")
	protected abstract void method7513(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIII)V")
	public abstract void method7491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method7486(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass144_Sub2_8.method4187()) {
			throw new IllegalStateException();
		} else if (this.method7515(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static516.anInt8683 = arg7;
			if (arg6 != 1) {
				Static516.anInt8675 = arg7 >>> 24;
				Static516.anInt8679 = 256 - Static516.anInt8675;
				if (arg6 == 0) {
					Static516.anInt8673 = arg7 >> 16 & 0xFF;
					Static516.anInt8671 = arg7 >> 8 & 0xFF;
					Static516.anInt8688 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static516.anInt8672 = arg7 >>> 24;
					Static516.anInt8691 = 256 - Static516.anInt8672;
					@Pc(73) int local73 = (arg7 & 0xFF00FF) * Static516.anInt8691 & 0xFF00FF00;
					@Pc(81) int local81 = (arg7 & 0xFF00) * Static516.anInt8691 & 0xFF0000;
					Static516.anInt8668 = (local73 | local81) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method7511(1);
			} else if (arg6 == 0) {
				this.method7511(0);
			} else if (arg6 == 3) {
				this.method7511(3);
			} else if (arg6 == 2) {
				this.method7511(2);
			}
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "()I")
	@Override
	public final int method7508() {
		return this.anInt8685 + this.anInt8686 + this.anInt8674;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method7503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method7489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method7514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "()I")
	@Override
	public final int method7501() {
		return this.anInt8666;
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "()I")
	@Override
	public final int method7510() {
		return this.anInt8686;
	}

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "()I")
	@Override
	public final int method7504() {
		return this.anInt8669 + this.anInt8666 + this.anInt8682;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method7515(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt8685 + this.anInt8686 + this.anInt8674;
		@Pc(17) int local17 = this.anInt8669 + this.anInt8666 + this.anInt8682;
		@Pc(34) float local34;
		@Pc(41) float local41;
		@Pc(48) float local48;
		@Pc(55) float local55;
		@Pc(61) float local61;
		@Pc(67) float local67;
		@Pc(73) float local73;
		@Pc(79) float local79;
		if (local8 != this.anInt8686 || local17 != this.anInt8666) {
			local34 = (arg2 - arg0) / (float) local8;
			local41 = (arg3 - arg1) / (float) local8;
			local48 = (arg4 - arg0) / (float) local17;
			local55 = (arg5 - arg1) / (float) local17;
			local61 = local48 * (float) this.anInt8669;
			local67 = local55 * (float) this.anInt8669;
			local73 = local34 * (float) this.anInt8685;
			local79 = local41 * (float) this.anInt8685;
			@Pc(86) float local86 = -local34 * (float) this.anInt8674;
			@Pc(93) float local93 = -local41 * (float) this.anInt8674;
			@Pc(100) float local100 = -local48 * (float) this.anInt8682;
			@Pc(107) float local107 = -local55 * (float) this.anInt8682;
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
		if (local48 < (float) this.aClass144_Sub2_8.anInt4717) {
			local48 = (float) this.aClass144_Sub2_8.anInt4717;
		}
		if (local55 > (float) this.aClass144_Sub2_8.anInt4721) {
			local55 = (float) this.aClass144_Sub2_8.anInt4721;
		}
		if (local61 < (float) this.aClass144_Sub2_8.anInt4715) {
			local61 = (float) this.aClass144_Sub2_8.anInt4715;
		}
		if (local67 > (float) this.aClass144_Sub2_8.anInt4710) {
			local67 = (float) this.aClass144_Sub2_8.anInt4710;
		}
		local55 = local48 - local55;
		if (local55 >= 0.0F) {
			return false;
		}
		local67 = local61 - local67;
		if (local67 >= 0.0F) {
			return false;
		}
		Static516.anInt8665 = this.aClass144_Sub2_8.anInt4700;
		Static516.anInt8662 = (int) ((float) ((int) local61 * Static516.anInt8665) + local48);
		local73 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local79 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static516.anInt8678 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt8686 / local73);
		Static516.anInt8676 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt8666 / local79);
		Static516.anInt8692 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt8686 / local79);
		Static516.anInt8681 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt8666 / local73);
		Static516.anInt8667 = (int) (local48 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local34) / 4.0F * 16.0F);
		Static516.anInt8664 = (int) (local61 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local41) / 4.0F * 16.0F);
		Static516.anInt8663 = (this.anInt8686 >> 1 << 12) + (Static516.anInt8664 * Static516.anInt8692 >> 4);
		Static516.anInt8690 = (this.anInt8666 >> 1 << 12) + (Static516.anInt8664 * Static516.anInt8681 >> 4);
		Static516.anInt8670 = Static516.anInt8667 * Static516.anInt8678 >> 4;
		Static516.anInt8684 = Static516.anInt8667 * Static516.anInt8676 >> 4;
		Static516.anInt8677 = (int) local48;
		Static516.anInt8689 = (int) local55;
		Static516.anInt8680 = (int) local61;
		Static516.anInt8687 = (int) local67;
		return true;
	}
}
