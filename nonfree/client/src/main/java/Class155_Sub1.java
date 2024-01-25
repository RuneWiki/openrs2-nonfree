import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public abstract class Class155_Sub1 extends Class155 {

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
	protected int anInt7498;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "[I")
	private int[] anIntArray444;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
	protected int anInt7506;

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
	protected int anInt7512;

	@OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
	protected int anInt7515;

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "Lclient!fba;")
	protected final Class100_Sub2 aClass100_Sub2_8;

	@OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
	public final int anInt7487;

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
	public final int anInt7504;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!fba;II)V")
	public Class155_Sub1(@OriginalArg(0) Class100_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass100_Sub2_8 = arg0;
		this.anInt7487 = arg1;
		this.anInt7504 = arg2;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method7196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method7190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7512 = arg0;
		this.anInt7506 = arg1;
		this.anInt7498 = arg2;
		this.anInt7515 = arg3;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "()I")
	@Override
	public final int method7213() {
		return this.anInt7487;
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "()I")
	@Override
	public final int method7206() {
		return this.anInt7512 + this.anInt7487 + this.anInt7498;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([I)V")
	@Override
	public final void method7208(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7512;
		arg0[1] = this.anInt7506;
		arg0[2] = this.anInt7498;
		arg0[3] = this.anInt7515;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method7207(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass100_Sub2_8.method2718()) {
			throw new IllegalStateException();
		} else if (this.method6540(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static245.anInt7509 = arg7;
			if (arg6 != 1) {
				Static245.anInt7499 = arg7 >>> 24;
				Static245.anInt7494 = 256 - Static245.anInt7499;
				if (arg6 == 0) {
					Static245.anInt7485 = arg7 >> 16 & 0xFF;
					Static245.anInt7514 = arg7 >> 8 & 0xFF;
					Static245.anInt7489 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static245.anInt7511 = arg7 >>> 24;
					Static245.anInt7513 = 256 - Static245.anInt7511;
					@Pc(73) int local73 = (arg7 & 0xFF00FF) * Static245.anInt7513 & 0xFF00FF00;
					@Pc(81) int local81 = (arg7 & 0xFF00) * Static245.anInt7513 & 0xFF0000;
					Static245.anInt7490 = (local73 | local81) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method6538(1);
			} else if (arg6 == 0) {
				this.method6538(0);
			} else if (arg6 == 3) {
				this.method6538(3);
			} else if (arg6 == 2) {
				this.method6538(2);
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method6537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V")
	protected abstract void method6538(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIIIIIIII)V")
	public abstract void method6539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
	public abstract void method7205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method6540(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7512 + this.anInt7487 + this.anInt7498;
		@Pc(17) int local17 = this.anInt7506 + this.anInt7504 + this.anInt7515;
		@Pc(34) float local34;
		@Pc(41) float local41;
		@Pc(48) float local48;
		@Pc(55) float local55;
		@Pc(61) float local61;
		@Pc(67) float local67;
		@Pc(73) float local73;
		@Pc(79) float local79;
		if (local8 != this.anInt7487 || local17 != this.anInt7504) {
			local34 = (arg2 - arg0) / (float) local8;
			local41 = (arg3 - arg1) / (float) local8;
			local48 = (arg4 - arg0) / (float) local17;
			local55 = (arg5 - arg1) / (float) local17;
			local61 = local48 * (float) this.anInt7506;
			local67 = local55 * (float) this.anInt7506;
			local73 = local34 * (float) this.anInt7512;
			local79 = local41 * (float) this.anInt7512;
			@Pc(86) float local86 = -local34 * (float) this.anInt7498;
			@Pc(93) float local93 = -local41 * (float) this.anInt7498;
			@Pc(100) float local100 = -local48 * (float) this.anInt7515;
			@Pc(107) float local107 = -local55 * (float) this.anInt7515;
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
		if (local48 < (float) this.aClass100_Sub2_8.anInt2873) {
			local48 = (float) this.aClass100_Sub2_8.anInt2873;
		}
		if (local55 > (float) this.aClass100_Sub2_8.anInt2895) {
			local55 = (float) this.aClass100_Sub2_8.anInt2895;
		}
		if (local61 < (float) this.aClass100_Sub2_8.anInt2891) {
			local61 = (float) this.aClass100_Sub2_8.anInt2891;
		}
		if (local67 > (float) this.aClass100_Sub2_8.anInt2870) {
			local67 = (float) this.aClass100_Sub2_8.anInt2870;
		}
		local55 = local48 - local55;
		if (local55 >= 0.0F) {
			return false;
		}
		local67 = local61 - local67;
		if (local67 >= 0.0F) {
			return false;
		}
		Static245.anInt7491 = this.aClass100_Sub2_8.anInt2898;
		Static245.anInt7486 = (int) ((float) ((int) local61 * Static245.anInt7491) + local48);
		local73 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local79 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static245.anInt7496 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7487 / local73);
		Static245.anInt7492 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7504 / local79);
		Static245.anInt7503 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7487 / local79);
		Static245.anInt7510 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7504 / local73);
		Static245.anInt7502 = (int) (local48 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local34) / 4.0F * 16.0F);
		Static245.anInt7495 = (int) (local61 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local41) / 4.0F * 16.0F);
		Static245.anInt7493 = (this.anInt7487 >> 1 << 12) + (Static245.anInt7495 * Static245.anInt7503 >> 4);
		Static245.anInt7497 = (this.anInt7504 >> 1 << 12) + (Static245.anInt7495 * Static245.anInt7510 >> 4);
		Static245.anInt7501 = Static245.anInt7502 * Static245.anInt7496 >> 4;
		Static245.anInt7505 = Static245.anInt7502 * Static245.anInt7492 >> 4;
		Static245.anInt7508 = (int) local48;
		Static245.anInt7500 = (int) local55;
		Static245.anInt7507 = (int) local61;
		Static245.anInt7488 = (int) local67;
		return true;
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "()I")
	@Override
	public final int method7209() {
		return this.anInt7506 + this.anInt7504 + this.anInt7515;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method7191(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass100_Sub2_8.method2718()) {
			throw new IllegalStateException();
		} else if (this.method6540(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(22) Class1_Sub3 local22 = (Class1_Sub3) arg6;
			this.method6541(local22.anIntArray468, local22.anIntArray466, Static245.anInt7508 - arg7, -arg8 - (Static245.anInt7488 - Static245.anInt7507));
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([I[III)V")
	protected abstract void method6541(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "()I")
	@Override
	public final int method7198() {
		return this.anInt7504;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass100_Sub2_8.method2718()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray444 == null) {
			this.anIntArray444 = new int[4];
		}
		this.aClass100_Sub2_8.K(this.anIntArray444);
		this.aClass100_Sub2_8.T(this.aClass100_Sub2_8.anInt2873, this.aClass100_Sub2_8.anInt2891, arg0 + arg2, arg1 + arg3);
		@Pc(40) int local40 = this.method7206();
		@Pc(43) int local43 = this.method7209();
		@Pc(51) int local51 = (arg2 + local40 - 1) / local40;
		@Pc(59) int local59 = (arg3 + local43 - 1) / local43;
		for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
			@Pc(66) int local66 = local61 * local43;
			for (@Pc(68) int local68 = 0; local68 < local51; local68++) {
				this.method7205(arg0 + local68 * local40, arg1 + local66, arg4, arg5, arg6);
			}
		}
		this.aClass100_Sub2_8.KA(this.anIntArray444[0], this.anIntArray444[1], this.anIntArray444[2], this.anIntArray444[3]);
	}
}
