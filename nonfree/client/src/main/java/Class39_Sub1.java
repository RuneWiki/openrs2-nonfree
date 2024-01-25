import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public abstract class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
	protected int anInt9431;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "[I")
	private int[] anIntArray679;

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
	protected int anInt9441;

	@OriginalMember(owner = "client!qp", name = "C", descriptor = "I")
	protected int anInt9453;

	@OriginalMember(owner = "client!qp", name = "E", descriptor = "I")
	protected int anInt9455;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "Lclient!nga;")
	protected final Class100_Sub2 aClass100_Sub2_11;

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
	public final int anInt9436;

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
	public final int anInt9440;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!nga;II)V")
	public Class39_Sub1(@OriginalArg(0) Class100_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass100_Sub2_11 = arg0;
		this.anInt9436 = arg1;
		this.anInt9440 = arg2;
	}

	@OriginalMember(owner = "client!qp", name = "A", descriptor = "()I")
	@Override
	public final int A() {
		return this.anInt9455 + this.anInt9436 + this.anInt9441;
	}

	@OriginalMember(owner = "client!qp", name = "ca", descriptor = "()I")
	@Override
	public final int ca() {
		return this.anInt9431 + this.anInt9440 + this.anInt9453;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method7861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!qp", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass100_Sub2_11.method5391()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray679 == null) {
			this.anIntArray679 = new int[4];
		}
		this.aClass100_Sub2_11.oa(this.anIntArray679);
		this.aClass100_Sub2_11.V(this.aClass100_Sub2_11.anInt6442, this.aClass100_Sub2_11.anInt6418, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.A();
		@Pc(40) int local40 = this.ca();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.V(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass100_Sub2_11.da(this.anIntArray679[0], this.anIntArray679[1], this.anIntArray679[2], this.anIntArray679[3]);
	}

	@OriginalMember(owner = "client!qp", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9455 = arg0;
		this.anInt9431 = arg1;
		this.anInt9441 = arg2;
		this.anInt9453 = arg3;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected final void method7856(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class20 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass100_Sub2_11.method5391()) {
			throw new IllegalStateException();
		} else if (this.method7862(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class20_Sub3 local20 = (Class20_Sub3) arg6;
			this.method7863(local20.anIntArray452, local20.anIntArray453, Static442.anInt9429 - arg7, -arg8 - (Static442.anInt9456 - Static442.anInt9430));
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IILclient!ua;II)V")
	public abstract void method7859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method7862(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt9455 + this.anInt9436 + this.anInt9441;
		@Pc(17) int local17 = this.anInt9431 + this.anInt9440 + this.anInt9453;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt9436 || local17 != this.anInt9440) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt9431;
			local65 = local53 * (float) this.anInt9431;
			local71 = local32 * (float) this.anInt9455;
			local77 = local39 * (float) this.anInt9455;
			@Pc(84) float local84 = -local32 * (float) this.anInt9441;
			@Pc(91) float local91 = -local39 * (float) this.anInt9441;
			@Pc(98) float local98 = -local46 * (float) this.anInt9453;
			@Pc(105) float local105 = -local53 * (float) this.anInt9453;
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
		if (local46 < (float) this.aClass100_Sub2_11.anInt6442) {
			local46 = this.aClass100_Sub2_11.anInt6442;
		}
		if (local53 > (float) this.aClass100_Sub2_11.anInt6425) {
			local53 = this.aClass100_Sub2_11.anInt6425;
		}
		if (local59 < (float) this.aClass100_Sub2_11.anInt6418) {
			local59 = this.aClass100_Sub2_11.anInt6418;
		}
		if (local65 > (float) this.aClass100_Sub2_11.anInt6444) {
			local65 = this.aClass100_Sub2_11.anInt6444;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static442.anInt9445 = this.aClass100_Sub2_11.anInt6426;
		Static442.anInt9446 = (int) ((float) ((int) local59 * Static442.anInt9445) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static442.anInt9433 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt9436 / local71);
		Static442.anInt9439 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt9440 / local77);
		Static442.anInt9438 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt9436 / local77);
		Static442.anInt9457 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt9440 / local71);
		Static442.anInt9442 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static442.anInt9444 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static442.anInt9452 = (this.anInt9436 >> 1 << 12) + (Static442.anInt9444 * Static442.anInt9438 >> 4);
		Static442.anInt9450 = (this.anInt9440 >> 1 << 12) + (Static442.anInt9444 * Static442.anInt9457 >> 4);
		Static442.anInt9427 = Static442.anInt9442 * Static442.anInt9433 >> 4;
		Static442.anInt9428 = Static442.anInt9442 * Static442.anInt9439 >> 4;
		Static442.anInt9429 = (int) local46;
		Static442.anInt9449 = (int) local53;
		Static442.anInt9430 = (int) local59;
		Static442.anInt9456 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!qp", name = "V", descriptor = "(IIIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qp", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass100_Sub2_11.method5391()) {
			throw new IllegalStateException();
		} else if (this.method7862(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static442.anInt9447 = arg7;
			if (arg6 != 1) {
				Static442.anInt9454 = arg7 >>> 24;
				Static442.anInt9443 = 256 - Static442.anInt9454;
				if (arg6 == 0) {
					Static442.anInt9437 = arg7 >> 16 & 0xFF;
					Static442.anInt9432 = arg7 >> 8 & 0xFF;
					Static442.anInt9451 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static442.anInt9434 = arg7 >>> 24;
					Static442.anInt9448 = 256 - Static442.anInt9434;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static442.anInt9448 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static442.anInt9448 & 0xFF0000;
					Static442.anInt9435 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method7864(1);
			} else if (arg6 == 0) {
				this.method7864(0);
			} else if (arg6 == 3) {
				this.method7864(3);
			} else if (arg6 == 2) {
				this.method7864(2);
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt9436;
	}

	@OriginalMember(owner = "client!qp", name = "u", descriptor = "()I")
	@Override
	public final int u() {
		return this.anInt9440;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([I[III)V")
	protected abstract void method7863(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qp", name = "YA", descriptor = "(IIIIIIII)V")
	protected abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(II)V")
	protected abstract void method7864(@OriginalArg(0) int arg0);
}
