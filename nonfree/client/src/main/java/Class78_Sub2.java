import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public abstract class Class78_Sub2 extends Class78 {

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "[I")
	private int[] anIntArray468;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
	protected int anInt8567;

	@OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
	protected int anInt8580;

	@OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
	protected int anInt8585;

	@OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
	protected int anInt8588;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!cb;")
	protected final Class44_Sub1 aClass44_Sub1_9;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
	public final int anInt8563;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
	public final int anInt8560;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!cb;II)V")
	public Class78_Sub2(@OriginalArg(0) Class44_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass44_Sub1_9 = arg0;
		this.anInt8563 = arg1;
		this.anInt8560 = arg2;
	}

	@OriginalMember(owner = "client!vf", name = "YA", descriptor = "(IIIIIIII)V")
	protected abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!vf", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8585 = arg0;
		this.anInt8588 = arg1;
		this.anInt8567 = arg2;
		this.anInt8580 = arg3;
	}

	@OriginalMember(owner = "client!vf", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass44_Sub1_9.method923()) {
			throw new IllegalStateException();
		} else if (this.method7012(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static556.anInt8589 = arg7;
			if (arg6 != 1) {
				Static556.anInt8569 = arg7 >>> 24;
				Static556.anInt8581 = 256 - Static556.anInt8569;
				if (arg6 == 0) {
					Static556.anInt8579 = arg7 >> 16 & 0xFF;
					Static556.anInt8576 = arg7 >> 8 & 0xFF;
					Static556.anInt8561 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static556.anInt8568 = arg7 >>> 24;
					Static556.anInt8562 = 256 - Static556.anInt8568;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static556.anInt8562 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static556.anInt8562 & 0xFF0000;
					Static556.anInt8566 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method7011(1);
			} else if (arg6 == 0) {
				this.method7011(0);
			} else if (arg6 == 3) {
				this.method7011(3);
			} else if (arg6 == 2) {
				this.method7011(2);
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method7010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)V")
	protected abstract void method7011(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vf", name = "A", descriptor = "()I")
	@Override
	public final int A() {
		return this.anInt8585 + this.anInt8563 + this.anInt8567;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method7012(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt8585 + this.anInt8563 + this.anInt8567;
		@Pc(17) int local17 = this.anInt8588 + this.anInt8560 + this.anInt8580;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt8563 || local17 != this.anInt8560) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt8588;
			local65 = local53 * (float) this.anInt8588;
			local71 = local32 * (float) this.anInt8585;
			local77 = local39 * (float) this.anInt8585;
			@Pc(84) float local84 = -local32 * (float) this.anInt8567;
			@Pc(91) float local91 = -local39 * (float) this.anInt8567;
			@Pc(98) float local98 = -local46 * (float) this.anInt8580;
			@Pc(105) float local105 = -local53 * (float) this.anInt8580;
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
		if (local46 < (float) this.aClass44_Sub1_9.anInt875) {
			local46 = this.aClass44_Sub1_9.anInt875;
		}
		if (local53 > (float) this.aClass44_Sub1_9.anInt866) {
			local53 = this.aClass44_Sub1_9.anInt866;
		}
		if (local59 < (float) this.aClass44_Sub1_9.anInt873) {
			local59 = this.aClass44_Sub1_9.anInt873;
		}
		if (local65 > (float) this.aClass44_Sub1_9.anInt885) {
			local65 = this.aClass44_Sub1_9.anInt885;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static556.anInt8586 = this.aClass44_Sub1_9.anInt870;
		Static556.anInt8577 = (int) ((float) ((int) local59 * Static556.anInt8586) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static556.anInt8573 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt8563 / local71);
		Static556.anInt8572 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt8560 / local77);
		Static556.anInt8574 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt8563 / local77);
		Static556.anInt8565 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt8560 / local71);
		Static556.anInt8575 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static556.anInt8564 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static556.anInt8559 = (this.anInt8563 >> 1 << 12) + (Static556.anInt8564 * Static556.anInt8574 >> 4);
		Static556.anInt8587 = (this.anInt8560 >> 1 << 12) + (Static556.anInt8564 * Static556.anInt8565 >> 4);
		Static556.anInt8584 = Static556.anInt8575 * Static556.anInt8573 >> 4;
		Static556.anInt8578 = Static556.anInt8575 * Static556.anInt8572 >> 4;
		Static556.anInt8582 = (int) local46;
		Static556.anInt8571 = (int) local53;
		Static556.anInt8570 = (int) local59;
		Static556.anInt8583 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!vf", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass44_Sub1_9.method923()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray468 == null) {
			this.anIntArray468 = new int[4];
		}
		this.aClass44_Sub1_9.oa(this.anIntArray468);
		this.aClass44_Sub1_9.V(this.aClass44_Sub1_9.anInt875, this.aClass44_Sub1_9.anInt873, arg0 + arg2, arg1 + arg3);
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
		this.aClass44_Sub1_9.da(this.anIntArray468[0], this.anIntArray468[1], this.anIntArray468[2], this.anIntArray468[3]);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected final void method8195(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class6 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass44_Sub1_9.method923()) {
			throw new IllegalStateException();
		} else if (this.method7012(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class6_Sub1 local20 = (Class6_Sub1) arg6;
			this.method7013(local20.anIntArray7, local20.anIntArray8, Static556.anInt8582 - arg7, -arg8 - (Static556.anInt8583 - Static556.anInt8570));
		}
	}

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "()I")
	@Override
	public final int u() {
		return this.anInt8560;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([I[III)V")
	protected abstract void method7013(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vf", name = "ca", descriptor = "()I")
	@Override
	public final int ca() {
		return this.anInt8588 + this.anInt8560 + this.anInt8580;
	}

	@OriginalMember(owner = "client!vf", name = "V", descriptor = "(IIIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vf", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt8563;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILclient!ua;II)V")
	public abstract void method8186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
