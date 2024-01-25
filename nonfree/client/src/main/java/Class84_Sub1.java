import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public abstract class Class84_Sub1 extends Class84 {

	@OriginalMember(owner = "client!wba", name = "l", descriptor = "I")
	protected int anInt7826;

	@OriginalMember(owner = "client!wba", name = "w", descriptor = "I")
	protected int anInt7836;

	@OriginalMember(owner = "client!wba", name = "y", descriptor = "[I")
	private int[] anIntArray564;

	@OriginalMember(owner = "client!wba", name = "A", descriptor = "I")
	protected int anInt7839;

	@OriginalMember(owner = "client!wba", name = "F", descriptor = "I")
	protected int anInt7844;

	@OriginalMember(owner = "client!wba", name = "v", descriptor = "Lclient!et;")
	protected final Class42_Sub2 aClass42_Sub2_13;

	@OriginalMember(owner = "client!wba", name = "e", descriptor = "I")
	protected final int anInt7819;

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
	protected final int anInt7816;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!et;II)V")
	protected Class84_Sub1(@OriginalArg(0) Class42_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass42_Sub2_13 = arg0;
		this.anInt7819 = arg1;
		this.anInt7816 = arg2;
	}

	@OriginalMember(owner = "client!wba", name = "EA", descriptor = "()I")
	@Override
	public final int EA() {
		return this.anInt7839 + this.anInt7819 + this.anInt7826;
	}

	@OriginalMember(owner = "client!wba", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7839 = arg0;
		this.anInt7844 = arg1;
		this.anInt7826 = arg2;
		this.anInt7836 = arg3;
	}

	@OriginalMember(owner = "client!wba", name = "DA", descriptor = "(IIIII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!wba", name = "la", descriptor = "()I")
	@Override
	public final int la() {
		return this.anInt7816;
	}

	@OriginalMember(owner = "client!wba", name = "ra", descriptor = "(IIIIIII)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!wba", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass42_Sub2_13.method4536()) {
			throw new IllegalStateException();
		} else if (this.method6510(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static529.anInt7832 = arg7;
			if (arg6 != 1) {
				Static529.anInt7841 = arg7 >>> 24;
				Static529.anInt7828 = 256 - Static529.anInt7841;
				if (arg6 == 0) {
					Static529.anInt7838 = arg7 >> 16 & 0xFF;
					Static529.anInt7820 = arg7 >> 8 & 0xFF;
					Static529.anInt7821 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static529.anInt7817 = arg7 >>> 24;
					Static529.anInt7842 = 256 - Static529.anInt7817;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static529.anInt7842 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static529.anInt7842 & 0xFF0000;
					Static529.anInt7835 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method6508(1);
			} else if (arg6 == 0) {
				this.method6508(0);
			} else if (arg6 == 3) {
				this.method6508(3);
			} else if (arg6 == 2) {
				this.method6508(2);
			}
		}
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(II)V")
	protected abstract void method6508(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wba", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public final void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass42_Sub2_13.method4536()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray564 == null) {
			this.anIntArray564 = new int[4];
		}
		this.aClass42_Sub2_13.d(this.anIntArray564);
		this.aClass42_Sub2_13.F(this.aClass42_Sub2_13.anInt5348, this.aClass42_Sub2_13.anInt5344, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.EA();
		@Pc(40) int local40 = this.ma();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.DA(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass42_Sub2_13.N(this.anIntArray564[0], this.anIntArray564[1], this.anIntArray564[2], this.anIntArray564[3]);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "([I[III)V")
	protected abstract void method6509(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected final void method7493(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class145 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass42_Sub2_13.method4536()) {
			throw new IllegalStateException();
		} else if (this.method6510(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class145_Sub1 local20 = (Class145_Sub1) arg6;
			this.method6509(local20.anIntArray339, local20.anIntArray340, Static529.anInt7843 - arg7, -arg8 - (Static529.anInt7840 - Static529.anInt7822));
		}
	}

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt7819;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method6510(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7839 + this.anInt7819 + this.anInt7826;
		@Pc(17) int local17 = this.anInt7844 + this.anInt7816 + this.anInt7836;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7819 || local17 != this.anInt7816) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7844;
			local65 = local53 * (float) this.anInt7844;
			local71 = local32 * (float) this.anInt7839;
			local77 = local39 * (float) this.anInt7839;
			@Pc(84) float local84 = -local32 * (float) this.anInt7826;
			@Pc(91) float local91 = -local39 * (float) this.anInt7826;
			@Pc(98) float local98 = -local46 * (float) this.anInt7836;
			@Pc(105) float local105 = -local53 * (float) this.anInt7836;
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
		if (local46 < (float) this.aClass42_Sub2_13.anInt5348) {
			local46 = this.aClass42_Sub2_13.anInt5348;
		}
		if (local53 > (float) this.aClass42_Sub2_13.anInt5351) {
			local53 = this.aClass42_Sub2_13.anInt5351;
		}
		if (local59 < (float) this.aClass42_Sub2_13.anInt5344) {
			local59 = this.aClass42_Sub2_13.anInt5344;
		}
		if (local65 > (float) this.aClass42_Sub2_13.anInt5353) {
			local65 = this.aClass42_Sub2_13.anInt5353;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static529.anInt7831 = this.aClass42_Sub2_13.anInt5359;
		Static529.anInt7830 = (int) ((float) ((int) local59 * Static529.anInt7831) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static529.anInt7834 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7819 / local71);
		Static529.anInt7824 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7816 / local77);
		Static529.anInt7823 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7819 / local77);
		Static529.anInt7827 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7816 / local71);
		Static529.anInt7837 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static529.anInt7815 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static529.anInt7829 = (this.anInt7819 >> 1 << 12) + (Static529.anInt7815 * Static529.anInt7823 >> 4);
		Static529.anInt7818 = (this.anInt7816 >> 1 << 12) + (Static529.anInt7815 * Static529.anInt7827 >> 4);
		Static529.anInt7825 = Static529.anInt7837 * Static529.anInt7834 >> 4;
		Static529.anInt7833 = Static529.anInt7837 * Static529.anInt7824 >> 4;
		Static529.anInt7843 = (int) local46;
		Static529.anInt7845 = (int) local53;
		Static529.anInt7822 = (int) local59;
		Static529.anInt7840 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IILclient!pa;II)V")
	public abstract void method7490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!wba", name = "ma", descriptor = "()I")
	@Override
	public final int ma() {
		return this.anInt7844 + this.anInt7816 + this.anInt7836;
	}
}
