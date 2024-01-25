import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public abstract class Class37_Sub2 extends Class37 {

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
	public int anInt8020;

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
	public int anInt8033;

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
	public int anInt8037;

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "[I")
	private int[] anIntArray494;

	@OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
	public int anInt8045;

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!ql;")
	protected final Class15_Sub1 aClass15_Sub1_16;

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
	public final int anInt8031;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
	public final int anInt8021;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!ql;II)V")
	public Class37_Sub2(@OriginalArg(0) Class15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass15_Sub1_16 = arg0;
		this.anInt8031 = arg1;
		this.anInt8021 = arg2;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([I[III)V")
	protected abstract void method6639(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jj", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8037 = arg0;
		this.anInt8045 = arg1;
		this.anInt8033 = arg2;
		this.anInt8020 = arg3;
	}

	@OriginalMember(owner = "client!jj", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public final void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass15_Sub1_16.method4272()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray494 == null) {
			this.anIntArray494 = new int[4];
		}
		this.aClass15_Sub1_16.A(this.anIntArray494);
		this.aClass15_Sub1_16.Q(this.aClass15_Sub1_16.anInt5021, this.aClass15_Sub1_16.anInt5016, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.AA();
		@Pc(40) int local40 = this.a();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.I(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass15_Sub1_16.ca(this.anIntArray494[0], this.anIntArray494[1], this.anIntArray494[2], this.anIntArray494[3]);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected final void method7081(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class93 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass15_Sub1_16.method4272()) {
			throw new IllegalStateException();
		} else if (this.method6640(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class93_Sub2 local20 = (Class93_Sub2) arg6;
			this.method6639(local20.anIntArray452, local20.anIntArray453, Static246.anInt8023 - arg7, -arg8 - (Static246.anInt8024 - Static246.anInt8030));
		}
	}

	@OriginalMember(owner = "client!jj", name = "QA", descriptor = "()I")
	@Override
	public final int QA() {
		return this.anInt8031;
	}

	@OriginalMember(owner = "client!jj", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass15_Sub1_16.method4272()) {
			throw new IllegalStateException();
		} else if (this.method6640(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static246.anInt8046 = arg7;
			if (arg6 != 1) {
				Static246.anInt8041 = arg7 >>> 24;
				Static246.anInt8043 = 256 - Static246.anInt8041;
				if (arg6 == 0) {
					Static246.anInt8040 = arg7 >> 16 & 0xFF;
					Static246.anInt8034 = arg7 >> 8 & 0xFF;
					Static246.anInt8047 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static246.anInt8049 = arg7 >>> 24;
					Static246.anInt8044 = 256 - Static246.anInt8049;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static246.anInt8044 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static246.anInt8044 & 0xFF0000;
					Static246.anInt8048 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method6641(1);
			} else if (arg6 == 0) {
				this.method6641(0);
			} else if (arg6 == 3) {
				this.method6641(3);
			} else if (arg6 == 2) {
				this.method6641(2);
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method6640(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt8037 + this.anInt8031 + this.anInt8033;
		@Pc(17) int local17 = this.anInt8045 + this.anInt8021 + this.anInt8020;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt8031 || local17 != this.anInt8021) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt8045;
			local65 = local53 * (float) this.anInt8045;
			local71 = local32 * (float) this.anInt8037;
			local77 = local39 * (float) this.anInt8037;
			@Pc(84) float local84 = -local32 * (float) this.anInt8033;
			@Pc(91) float local91 = -local39 * (float) this.anInt8033;
			@Pc(98) float local98 = -local46 * (float) this.anInt8020;
			@Pc(105) float local105 = -local53 * (float) this.anInt8020;
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
		if (local46 < (float) this.aClass15_Sub1_16.anInt5021) {
			local46 = this.aClass15_Sub1_16.anInt5021;
		}
		if (local53 > (float) this.aClass15_Sub1_16.anInt5030) {
			local53 = this.aClass15_Sub1_16.anInt5030;
		}
		if (local59 < (float) this.aClass15_Sub1_16.anInt5016) {
			local59 = this.aClass15_Sub1_16.anInt5016;
		}
		if (local65 > (float) this.aClass15_Sub1_16.anInt5018) {
			local65 = this.aClass15_Sub1_16.anInt5018;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static246.anInt8038 = this.aClass15_Sub1_16.anInt5037;
		Static246.anInt8022 = (int) ((float) ((int) local59 * Static246.anInt8038) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static246.anInt8050 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt8031 / local71);
		Static246.anInt8035 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt8021 / local77);
		Static246.anInt8032 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt8031 / local77);
		Static246.anInt8026 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt8021 / local71);
		Static246.anInt8042 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static246.anInt8028 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static246.anInt8039 = (this.anInt8031 >> 1 << 12) + (Static246.anInt8028 * Static246.anInt8032 >> 4);
		Static246.anInt8029 = (this.anInt8021 >> 1 << 12) + (Static246.anInt8028 * Static246.anInt8026 >> 4);
		Static246.anInt8036 = Static246.anInt8042 * Static246.anInt8050 >> 4;
		Static246.anInt8027 = Static246.anInt8042 * Static246.anInt8035 >> 4;
		Static246.anInt8023 = (int) local46;
		Static246.anInt8025 = (int) local53;
		Static246.anInt8030 = (int) local59;
		Static246.anInt8024 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "I", descriptor = "(IIIII)V")
	public abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILclient!fa;II)V")
	public abstract void method7077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jj", name = "KA", descriptor = "(IIIIIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "()I")
	@Override
	public final int a() {
		return this.anInt8045 + this.anInt8021 + this.anInt8020;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "()I")
	@Override
	public final int b() {
		return this.anInt8021;
	}

	@OriginalMember(owner = "client!jj", name = "AA", descriptor = "()I")
	@Override
	public final int AA() {
		return this.anInt8037 + this.anInt8031 + this.anInt8033;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)V")
	protected abstract void method6641(@OriginalArg(0) int arg0);
}
