import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public abstract class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
	protected int anInt7887;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
	protected int anInt7890;

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "[I")
	private int[] anIntArray596;

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "I")
	protected int anInt7900;

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
	protected int anInt7903;

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "Lclient!pm;")
	protected final Class137_Sub2 aClass137_Sub2_10;

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
	public final int anInt7883;

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
	public final int anInt7886;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!pm;II)V")
	public Class20_Sub1(@OriginalArg(0) Class137_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass137_Sub2_10 = arg0;
		this.anInt7883 = arg1;
		this.anInt7886 = arg2;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "()I")
	@Override
	public final int method7394() {
		return this.anInt7887 + this.anInt7883 + this.anInt7900;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method6539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method7406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass137_Sub2_10.method6715()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray596 == null) {
			this.anIntArray596 = new int[4];
		}
		this.aClass137_Sub2_10.K(this.anIntArray596);
		this.aClass137_Sub2_10.T(this.aClass137_Sub2_10.anInt8067, this.aClass137_Sub2_10.anInt8047, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method7394();
		@Pc(40) int local40 = this.method7408();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method7402(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass137_Sub2_10.KA(this.anIntArray596[0], this.anIntArray596[1], this.anIntArray596[2], this.anIntArray596[3]);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "([I[III)V")
	protected abstract void method6540(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIII)V")
	public abstract void method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "()I")
	@Override
	public final int method7412() {
		return this.anInt7883;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "([I)V")
	@Override
	public final void method7411(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7887;
		arg0[1] = this.anInt7903;
		arg0[2] = this.anInt7900;
		arg0[3] = this.anInt7890;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method7409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7887 = arg0;
		this.anInt7903 = arg1;
		this.anInt7900 = arg2;
		this.anInt7890 = arg3;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(II)V")
	protected abstract void method6541(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method7397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method6542(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7887 + this.anInt7883 + this.anInt7900;
		@Pc(17) int local17 = this.anInt7903 + this.anInt7886 + this.anInt7890;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7883 || local17 != this.anInt7886) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7903;
			local65 = local53 * (float) this.anInt7903;
			local71 = local32 * (float) this.anInt7887;
			local77 = local39 * (float) this.anInt7887;
			@Pc(84) float local84 = -local32 * (float) this.anInt7900;
			@Pc(91) float local91 = -local39 * (float) this.anInt7900;
			@Pc(98) float local98 = -local46 * (float) this.anInt7890;
			@Pc(105) float local105 = -local53 * (float) this.anInt7890;
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
		if (local46 < (float) this.aClass137_Sub2_10.anInt8067) {
			local46 = (float) this.aClass137_Sub2_10.anInt8067;
		}
		if (local53 > (float) this.aClass137_Sub2_10.anInt8066) {
			local53 = (float) this.aClass137_Sub2_10.anInt8066;
		}
		if (local59 < (float) this.aClass137_Sub2_10.anInt8047) {
			local59 = (float) this.aClass137_Sub2_10.anInt8047;
		}
		if (local65 > (float) this.aClass137_Sub2_10.anInt8044) {
			local65 = (float) this.aClass137_Sub2_10.anInt8044;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static463.anInt7889 = this.aClass137_Sub2_10.anInt8058;
		Static463.anInt7894 = (int) ((float) ((int) local59 * Static463.anInt7889) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static463.anInt7896 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7883 / local71);
		Static463.anInt7893 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7886 / local77);
		Static463.anInt7884 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7883 / local77);
		Static463.anInt7881 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7886 / local71);
		Static463.anInt7895 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static463.anInt7908 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static463.anInt7898 = (this.anInt7883 >> 1 << 12) + (Static463.anInt7908 * Static463.anInt7884 >> 4);
		Static463.anInt7888 = (this.anInt7886 >> 1 << 12) + (Static463.anInt7908 * Static463.anInt7881 >> 4);
		Static463.anInt7897 = Static463.anInt7895 * Static463.anInt7896 >> 4;
		Static463.anInt7905 = Static463.anInt7895 * Static463.anInt7893 >> 4;
		Static463.anInt7899 = (int) local46;
		Static463.anInt7909 = (int) local53;
		Static463.anInt7880 = (int) local59;
		Static463.anInt7892 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method7404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method7403(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass137_Sub2_10.method6715()) {
			throw new IllegalStateException();
		} else if (this.method6542(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static463.anInt7882 = arg7;
			if (arg6 != 1) {
				Static463.anInt7907 = arg7 >>> 24;
				Static463.anInt7891 = 256 - Static463.anInt7907;
				if (arg6 == 0) {
					Static463.anInt7910 = arg7 >> 16 & 0xFF;
					Static463.anInt7904 = arg7 >> 8 & 0xFF;
					Static463.anInt7906 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static463.anInt7885 = arg7 >>> 24;
					Static463.anInt7901 = 256 - Static463.anInt7885;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static463.anInt7901 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static463.anInt7901 & 0xFF0000;
					Static463.anInt7902 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method6541(1);
			} else if (arg6 == 0) {
				this.method6541(0);
			} else if (arg6 == 3) {
				this.method6541(3);
			} else if (arg6 == 2) {
				this.method6541(2);
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "()I")
	@Override
	public final int method7393() {
		return this.anInt7886;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "()I")
	@Override
	public final int method7408() {
		return this.anInt7903 + this.anInt7886 + this.anInt7890;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method7417(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass137_Sub2_10.method6715()) {
			throw new IllegalStateException();
		} else if (this.method6542(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub2 local20 = (Class1_Sub2) arg6;
			this.method6540(local20.anIntArray500, local20.anIntArray499, Static463.anInt7899 - arg7, -arg8 - (Static463.anInt7892 - Static463.anInt7880));
		}
	}
}
