import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public abstract class Class71_Sub1 extends Class71 {

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
	protected int anInt7133;

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
	protected int anInt7142;

	@OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
	protected int anInt7144;

	@OriginalMember(owner = "client!qk", name = "y", descriptor = "[I")
	private int[] anIntArray337;

	@OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
	protected int anInt7147;

	@OriginalMember(owner = "client!qk", name = "E", descriptor = "Lclient!rp;")
	protected final Class101_Sub3 aClass101_Sub3_10;

	@OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
	public final int anInt7152;

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
	public final int anInt7132;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!rp;II)V")
	public Class71_Sub1(@OriginalArg(0) Class101_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass101_Sub3_10 = arg0;
		this.anInt7152 = arg1;
		this.anInt7132 = arg2;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)V")
	protected abstract void method6398(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method7690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7144 = arg0;
		this.anInt7133 = arg1;
		this.anInt7142 = arg2;
		this.anInt7147 = arg3;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "([I)V")
	@Override
	public final void method7689(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7144;
		arg0[1] = this.anInt7133;
		arg0[2] = this.anInt7142;
		arg0[3] = this.anInt7147;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method7705(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass101_Sub3_10.method8161()) {
			throw new IllegalStateException();
		} else if (this.method6399(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static492.anInt7128 = arg7;
			if (arg6 != 1) {
				Static492.anInt7153 = arg7 >>> 24;
				Static492.anInt7124 = 256 - Static492.anInt7153;
				if (arg6 == 0) {
					Static492.anInt7123 = arg7 >> 16 & 0xFF;
					Static492.anInt7135 = arg7 >> 8 & 0xFF;
					Static492.anInt7129 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static492.anInt7136 = arg7 >>> 24;
					Static492.anInt7151 = 256 - Static492.anInt7136;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static492.anInt7151 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static492.anInt7151 & 0xFF0000;
					Static492.anInt7125 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method6398(1);
			} else if (arg6 == 0) {
				this.method6398(0);
			} else if (arg6 == 3) {
				this.method6398(3);
			} else if (arg6 == 2) {
				this.method6398(2);
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "()I")
	@Override
	public final int method7707() {
		return this.anInt7132;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIII)V")
	public abstract void method7697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method7704(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass101_Sub3_10.method8161()) {
			throw new IllegalStateException();
		} else if (this.method6399(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub2 local20 = (Class1_Sub2) arg6;
			this.method6400(local20.anIntArray220, local20.anIntArray221, Static492.anInt7139 - arg7, -arg8 - (Static492.anInt7127 - Static492.anInt7131));
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass101_Sub3_10.method8161()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray337 == null) {
			this.anIntArray337 = new int[4];
		}
		this.aClass101_Sub3_10.K(this.anIntArray337);
		this.aClass101_Sub3_10.T(this.aClass101_Sub3_10.anInt9244, this.aClass101_Sub3_10.anInt9238, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method7709();
		@Pc(40) int local40 = this.method7711();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method7697(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass101_Sub3_10.KA(this.anIntArray337[0], this.anIntArray337[1], this.anIntArray337[2], this.anIntArray337[3]);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method7708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method7694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "()I")
	@Override
	public final int method7709() {
		return this.anInt7144 + this.anInt7152 + this.anInt7142;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method6399(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7144 + this.anInt7152 + this.anInt7142;
		@Pc(17) int local17 = this.anInt7133 + this.anInt7132 + this.anInt7147;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7152 || local17 != this.anInt7132) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7133;
			local65 = local53 * (float) this.anInt7133;
			local71 = local32 * (float) this.anInt7144;
			local77 = local39 * (float) this.anInt7144;
			@Pc(84) float local84 = -local32 * (float) this.anInt7142;
			@Pc(91) float local91 = -local39 * (float) this.anInt7142;
			@Pc(98) float local98 = -local46 * (float) this.anInt7147;
			@Pc(105) float local105 = -local53 * (float) this.anInt7147;
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
		if (local46 < (float) this.aClass101_Sub3_10.anInt9244) {
			local46 = (float) this.aClass101_Sub3_10.anInt9244;
		}
		if (local53 > (float) this.aClass101_Sub3_10.anInt9254) {
			local53 = (float) this.aClass101_Sub3_10.anInt9254;
		}
		if (local59 < (float) this.aClass101_Sub3_10.anInt9238) {
			local59 = (float) this.aClass101_Sub3_10.anInt9238;
		}
		if (local65 > (float) this.aClass101_Sub3_10.anInt9232) {
			local65 = (float) this.aClass101_Sub3_10.anInt9232;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static492.anInt7141 = this.aClass101_Sub3_10.anInt9242;
		Static492.anInt7150 = (int) ((float) ((int) local59 * Static492.anInt7141) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static492.anInt7138 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7152 / local71);
		Static492.anInt7146 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7132 / local77);
		Static492.anInt7134 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7152 / local77);
		Static492.anInt7126 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7132 / local71);
		Static492.anInt7140 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static492.anInt7137 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static492.anInt7130 = (this.anInt7152 >> 1 << 12) + (Static492.anInt7137 * Static492.anInt7134 >> 4);
		Static492.anInt7148 = (this.anInt7132 >> 1 << 12) + (Static492.anInt7137 * Static492.anInt7126 >> 4);
		Static492.anInt7145 = Static492.anInt7140 * Static492.anInt7138 >> 4;
		Static492.anInt7149 = Static492.anInt7140 * Static492.anInt7146 >> 4;
		Static492.anInt7139 = (int) local46;
		Static492.anInt7143 = (int) local53;
		Static492.anInt7131 = (int) local59;
		Static492.anInt7127 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "([I[III)V")
	protected abstract void method6400(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "()I")
	@Override
	public final int method7711() {
		return this.anInt7133 + this.anInt7132 + this.anInt7147;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method6401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "()I")
	@Override
	public final int method7691() {
		return this.anInt7152;
	}
}
