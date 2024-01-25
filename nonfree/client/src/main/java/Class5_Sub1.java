import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public abstract class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "[I")
	private int[] anIntArray604;

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
	protected int anInt9596;

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "I")
	protected int anInt9597;

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
	protected int anInt9600;

	@OriginalMember(owner = "client!sv", name = "A", descriptor = "I")
	protected int anInt9609;

	@OriginalMember(owner = "client!sv", name = "x", descriptor = "Lclient!kt;")
	protected final Class78_Sub2 aClass78_Sub2_11;

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
	public final int anInt9588;

	@OriginalMember(owner = "client!sv", name = "z", descriptor = "I")
	public final int anInt9608;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!kt;II)V")
	public Class5_Sub1(@OriginalArg(0) Class78_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass78_Sub2_11 = arg0;
		this.anInt9588 = arg1;
		this.anInt9608 = arg2;
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)V")
	protected abstract void method7806(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILclient!ua;II)V")
	public abstract void method7799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method7807(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt9596 + this.anInt9588 + this.anInt9600;
		@Pc(17) int local17 = this.anInt9597 + this.anInt9608 + this.anInt9609;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt9588 || local17 != this.anInt9608) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt9597;
			local65 = local53 * (float) this.anInt9597;
			local71 = local32 * (float) this.anInt9596;
			local77 = local39 * (float) this.anInt9596;
			@Pc(84) float local84 = -local32 * (float) this.anInt9600;
			@Pc(91) float local91 = -local39 * (float) this.anInt9600;
			@Pc(98) float local98 = -local46 * (float) this.anInt9609;
			@Pc(105) float local105 = -local53 * (float) this.anInt9609;
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
		if (local46 < (float) this.aClass78_Sub2_11.anInt5106) {
			local46 = this.aClass78_Sub2_11.anInt5106;
		}
		if (local53 > (float) this.aClass78_Sub2_11.anInt5094) {
			local53 = this.aClass78_Sub2_11.anInt5094;
		}
		if (local59 < (float) this.aClass78_Sub2_11.anInt5096) {
			local59 = this.aClass78_Sub2_11.anInt5096;
		}
		if (local65 > (float) this.aClass78_Sub2_11.anInt5095) {
			local65 = this.aClass78_Sub2_11.anInt5095;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static491.anInt9612 = this.aClass78_Sub2_11.anInt5105;
		Static491.anInt9595 = (int) ((float) ((int) local59 * Static491.anInt9612) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static491.anInt9594 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt9588 / local71);
		Static491.anInt9601 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt9608 / local77);
		Static491.anInt9614 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt9588 / local77);
		Static491.anInt9590 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt9608 / local71);
		Static491.anInt9611 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static491.anInt9585 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static491.anInt9599 = (this.anInt9588 >> 1 << 12) + (Static491.anInt9585 * Static491.anInt9614 >> 4);
		Static491.anInt9591 = (this.anInt9608 >> 1 << 12) + (Static491.anInt9585 * Static491.anInt9590 >> 4);
		Static491.anInt9604 = Static491.anInt9611 * Static491.anInt9594 >> 4;
		Static491.anInt9615 = Static491.anInt9611 * Static491.anInt9601 >> 4;
		Static491.anInt9593 = (int) local46;
		Static491.anInt9610 = (int) local53;
		Static491.anInt9607 = (int) local59;
		Static491.anInt9605 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!sv", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9596 = arg0;
		this.anInt9597 = arg1;
		this.anInt9600 = arg2;
		this.anInt9609 = arg3;
	}

	@OriginalMember(owner = "client!sv", name = "YA", descriptor = "(IIIIIIII)V")
	protected abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!sv", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt9588;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([I[III)V")
	protected abstract void method7808(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!sv", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass78_Sub2_11.method4129()) {
			throw new IllegalStateException();
		} else if (this.method7807(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static491.anInt9589 = arg7;
			if (arg6 != 1) {
				Static491.anInt9606 = arg7 >>> 24;
				Static491.anInt9587 = 256 - Static491.anInt9606;
				if (arg6 == 0) {
					Static491.anInt9592 = arg7 >> 16 & 0xFF;
					Static491.anInt9613 = arg7 >> 8 & 0xFF;
					Static491.anInt9598 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static491.anInt9586 = arg7 >>> 24;
					Static491.anInt9602 = 256 - Static491.anInt9586;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static491.anInt9602 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static491.anInt9602 & 0xFF0000;
					Static491.anInt9603 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method7806(1);
			} else if (arg6 == 0) {
				this.method7806(0);
			} else if (arg6 == 3) {
				this.method7806(3);
			} else if (arg6 == 2) {
				this.method7806(2);
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "ca", descriptor = "()I")
	@Override
	public final int ca() {
		return this.anInt9597 + this.anInt9608 + this.anInt9609;
	}

	@OriginalMember(owner = "client!sv", name = "V", descriptor = "(IIIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method7809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!sv", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass78_Sub2_11.method4129()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray604 == null) {
			this.anIntArray604 = new int[4];
		}
		this.aClass78_Sub2_11.oa(this.anIntArray604);
		this.aClass78_Sub2_11.V(this.aClass78_Sub2_11.anInt5106, this.aClass78_Sub2_11.anInt5096, arg0 + arg2, arg1 + arg3);
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
		this.aClass78_Sub2_11.da(this.anIntArray604[0], this.anIntArray604[1], this.anIntArray604[2], this.anIntArray604[3]);
	}

	@OriginalMember(owner = "client!sv", name = "A", descriptor = "()I")
	@Override
	public final int A() {
		return this.anInt9596 + this.anInt9588 + this.anInt9600;
	}

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "()I")
	@Override
	public final int u() {
		return this.anInt9608;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected final void method7802(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class181 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass78_Sub2_11.method4129()) {
			throw new IllegalStateException();
		} else if (this.method7807(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class181_Sub3 local20 = (Class181_Sub3) arg6;
			this.method7808(local20.anIntArray547, local20.anIntArray546, Static491.anInt9593 - arg7, -arg8 - (Static491.anInt9605 - Static491.anInt9607));
		}
	}
}
