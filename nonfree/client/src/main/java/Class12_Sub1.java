import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public abstract class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
	protected int anInt6911;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
	protected int anInt6928;

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "[I")
	private int[] anIntArray519;

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
	protected int anInt6929;

	@OriginalMember(owner = "client!jo", name = "F", descriptor = "I")
	protected int anInt6940;

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "Lclient!aw;")
	protected final Class9_Sub2 aClass9_Sub2_14;

	@OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
	protected final int anInt6935;

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
	protected final int anInt6927;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!aw;II)V")
	protected Class12_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass9_Sub2_14 = arg0;
		this.anInt6935 = arg1;
		this.anInt6927 = arg2;
	}

	@OriginalMember(owner = "client!jo", name = "EA", descriptor = "()I")
	@Override
	public final int EA() {
		return this.anInt6940 + this.anInt6935 + this.anInt6911;
	}

	@OriginalMember(owner = "client!jo", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6940 = arg0;
		this.anInt6928 = arg1;
		this.anInt6911 = arg2;
		this.anInt6929 = arg3;
	}

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public final void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass9_Sub2_14.method4659()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray519 == null) {
			this.anIntArray519 = new int[4];
		}
		this.aClass9_Sub2_14.d(this.anIntArray519);
		this.aClass9_Sub2_14.F(this.aClass9_Sub2_14.anInt5332, this.aClass9_Sub2_14.anInt5321, arg0 + arg2, arg1 + arg3);
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
		this.aClass9_Sub2_14.N(this.anIntArray519[0], this.anIntArray519[1], this.anIntArray519[2], this.anIntArray519[3]);
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)V")
	protected abstract void method5984(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt6935;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILclient!pa;II)V")
	public abstract void method7194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class23 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected final void method7190(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class23 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass9_Sub2_14.method4659()) {
			throw new IllegalStateException();
		} else if (this.method5985(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class23_Sub2 local20 = (Class23_Sub2) arg6;
			this.method5986(local20.anIntArray429, local20.anIntArray430, Static234.anInt6939 - arg7, -arg8 - (Static234.anInt6921 - Static234.anInt6941));
		}
	}

	@OriginalMember(owner = "client!jo", name = "ra", descriptor = "(IIIIIII)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!jo", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass9_Sub2_14.method4659()) {
			throw new IllegalStateException();
		} else if (this.method5985(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static234.anInt6931 = arg7;
			if (arg6 != 1) {
				Static234.anInt6933 = arg7 >>> 24;
				Static234.anInt6936 = 256 - Static234.anInt6933;
				if (arg6 == 0) {
					Static234.anInt6926 = arg7 >> 16 & 0xFF;
					Static234.anInt6925 = arg7 >> 8 & 0xFF;
					Static234.anInt6938 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static234.anInt6932 = arg7 >>> 24;
					Static234.anInt6934 = 256 - Static234.anInt6932;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static234.anInt6934 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static234.anInt6934 & 0xFF0000;
					Static234.anInt6924 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method5984(1);
			} else if (arg6 == 0) {
				this.method5984(0);
			} else if (arg6 == 3) {
				this.method5984(3);
			} else if (arg6 == 2) {
				this.method5984(2);
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "la", descriptor = "()I")
	@Override
	public final int la() {
		return this.anInt6927;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method5985(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt6940 + this.anInt6935 + this.anInt6911;
		@Pc(17) int local17 = this.anInt6928 + this.anInt6927 + this.anInt6929;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt6935 || local17 != this.anInt6927) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt6928;
			local65 = local53 * (float) this.anInt6928;
			local71 = local32 * (float) this.anInt6940;
			local77 = local39 * (float) this.anInt6940;
			@Pc(84) float local84 = -local32 * (float) this.anInt6911;
			@Pc(91) float local91 = -local39 * (float) this.anInt6911;
			@Pc(98) float local98 = -local46 * (float) this.anInt6929;
			@Pc(105) float local105 = -local53 * (float) this.anInt6929;
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
		if (local46 < (float) this.aClass9_Sub2_14.anInt5332) {
			local46 = this.aClass9_Sub2_14.anInt5332;
		}
		if (local53 > (float) this.aClass9_Sub2_14.anInt5326) {
			local53 = this.aClass9_Sub2_14.anInt5326;
		}
		if (local59 < (float) this.aClass9_Sub2_14.anInt5321) {
			local59 = this.aClass9_Sub2_14.anInt5321;
		}
		if (local65 > (float) this.aClass9_Sub2_14.anInt5330) {
			local65 = this.aClass9_Sub2_14.anInt5330;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static234.anInt6918 = this.aClass9_Sub2_14.anInt5320;
		Static234.anInt6914 = (int) ((float) ((int) local59 * Static234.anInt6918) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static234.anInt6912 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt6935 / local71);
		Static234.anInt6913 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt6927 / local77);
		Static234.anInt6922 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt6935 / local77);
		Static234.anInt6920 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt6927 / local71);
		Static234.anInt6917 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static234.anInt6930 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static234.anInt6937 = (this.anInt6935 >> 1 << 12) + (Static234.anInt6930 * Static234.anInt6922 >> 4);
		Static234.anInt6919 = (this.anInt6927 >> 1 << 12) + (Static234.anInt6930 * Static234.anInt6920 >> 4);
		Static234.anInt6916 = Static234.anInt6917 * Static234.anInt6912 >> 4;
		Static234.anInt6923 = Static234.anInt6917 * Static234.anInt6913 >> 4;
		Static234.anInt6939 = (int) local46;
		Static234.anInt6915 = (int) local53;
		Static234.anInt6941 = (int) local59;
		Static234.anInt6921 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!jo", name = "DA", descriptor = "(IIIII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jo", name = "ma", descriptor = "()I")
	@Override
	public final int ma() {
		return this.anInt6928 + this.anInt6927 + this.anInt6929;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "([I[III)V")
	protected abstract void method5986(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
