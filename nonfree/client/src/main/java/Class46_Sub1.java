import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public abstract class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
	protected int anInt4139;

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
	protected int anInt4142;

	@OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
	protected int anInt4157;

	@OriginalMember(owner = "client!jp", name = "C", descriptor = "[I")
	private int[] anIntArray328;

	@OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
	protected int anInt4161;

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "Lclient!dda;")
	protected final Class43_Sub2 aClass43_Sub2_7;

	@OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
	public final int anInt4155;

	@OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
	public final int anInt4159;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!dda;II)V")
	public Class46_Sub1(@OriginalArg(0) Class43_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass43_Sub2_7 = arg0;
		this.anInt4155 = arg1;
		this.anInt4159 = arg2;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)V")
	protected abstract void method3684(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILclient!ua;II)V")
	public abstract void method7610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class146 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jp", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4157 = arg0;
		this.anInt4161 = arg1;
		this.anInt4139 = arg2;
		this.anInt4142 = arg3;
	}

	@OriginalMember(owner = "client!jp", name = "A", descriptor = "()I")
	@Override
	public final int A() {
		return this.anInt4157 + this.anInt4155 + this.anInt4139;
	}

	@OriginalMember(owner = "client!jp", name = "V", descriptor = "(IIIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jp", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass43_Sub2_7.method1943()) {
			throw new IllegalStateException();
		} else if (this.method3685(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static256.anInt4133 = arg7;
			if (arg6 != 1) {
				Static256.anInt4143 = arg7 >>> 24;
				Static256.anInt4134 = 256 - Static256.anInt4143;
				if (arg6 == 0) {
					Static256.anInt4136 = arg7 >> 16 & 0xFF;
					Static256.anInt4149 = arg7 >> 8 & 0xFF;
					Static256.anInt4154 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static256.anInt4152 = arg7 >>> 24;
					Static256.anInt4162 = 256 - Static256.anInt4152;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static256.anInt4162 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static256.anInt4162 & 0xFF0000;
					Static256.anInt4141 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method3684(1);
			} else if (arg6 == 0) {
				this.method3684(0);
			} else if (arg6 == 3) {
				this.method3684(3);
			} else if (arg6 == 2) {
				this.method3684(2);
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "ca", descriptor = "()I")
	@Override
	public final int ca() {
		return this.anInt4161 + this.anInt4159 + this.anInt4142;
	}

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "()I")
	@Override
	public final int u() {
		return this.anInt4159;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method3685(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt4157 + this.anInt4155 + this.anInt4139;
		@Pc(17) int local17 = this.anInt4161 + this.anInt4159 + this.anInt4142;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt4155 || local17 != this.anInt4159) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt4161;
			local65 = local53 * (float) this.anInt4161;
			local71 = local32 * (float) this.anInt4157;
			local77 = local39 * (float) this.anInt4157;
			@Pc(84) float local84 = -local32 * (float) this.anInt4139;
			@Pc(91) float local91 = -local39 * (float) this.anInt4139;
			@Pc(98) float local98 = -local46 * (float) this.anInt4142;
			@Pc(105) float local105 = -local53 * (float) this.anInt4142;
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
		if (local46 < (float) this.aClass43_Sub2_7.anInt2132) {
			local46 = this.aClass43_Sub2_7.anInt2132;
		}
		if (local53 > (float) this.aClass43_Sub2_7.anInt2145) {
			local53 = this.aClass43_Sub2_7.anInt2145;
		}
		if (local59 < (float) this.aClass43_Sub2_7.anInt2133) {
			local59 = this.aClass43_Sub2_7.anInt2133;
		}
		if (local65 > (float) this.aClass43_Sub2_7.anInt2131) {
			local65 = this.aClass43_Sub2_7.anInt2131;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static256.anInt4153 = this.aClass43_Sub2_7.anInt2139;
		Static256.anInt4150 = (int) ((float) ((int) local59 * Static256.anInt4153) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static256.anInt4148 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt4155 / local71);
		Static256.anInt4132 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt4159 / local77);
		Static256.anInt4158 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt4155 / local77);
		Static256.anInt4151 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt4159 / local71);
		Static256.anInt4138 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static256.anInt4137 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static256.anInt4144 = (this.anInt4155 >> 1 << 12) + (Static256.anInt4137 * Static256.anInt4158 >> 4);
		Static256.anInt4140 = (this.anInt4159 >> 1 << 12) + (Static256.anInt4137 * Static256.anInt4151 >> 4);
		Static256.anInt4145 = Static256.anInt4138 * Static256.anInt4148 >> 4;
		Static256.anInt4135 = Static256.anInt4138 * Static256.anInt4132 >> 4;
		Static256.anInt4156 = (int) local46;
		Static256.anInt4146 = (int) local53;
		Static256.anInt4160 = (int) local59;
		Static256.anInt4147 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "([I[III)V")
	protected abstract void method3686(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jp", name = "YA", descriptor = "(IIIIIIII)V")
	protected abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!jp", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt4155;
	}

	@OriginalMember(owner = "client!jp", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass43_Sub2_7.method1943()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray328 == null) {
			this.anIntArray328 = new int[4];
		}
		this.aClass43_Sub2_7.oa(this.anIntArray328);
		this.aClass43_Sub2_7.V(this.aClass43_Sub2_7.anInt2132, this.aClass43_Sub2_7.anInt2133, arg0 + arg2, arg1 + arg3);
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
		this.aClass43_Sub2_7.da(this.anIntArray328[0], this.anIntArray328[1], this.anIntArray328[2], this.anIntArray328[3]);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method3687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected final void method7608(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class146 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass43_Sub2_7.method1943()) {
			throw new IllegalStateException();
		} else if (this.method3685(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class146_Sub1 local20 = (Class146_Sub1) arg6;
			this.method3686(local20.anIntArray345, local20.anIntArray344, Static256.anInt4156 - arg7, -arg8 - (Static256.anInt4147 - Static256.anInt4160));
		}
	}
}
