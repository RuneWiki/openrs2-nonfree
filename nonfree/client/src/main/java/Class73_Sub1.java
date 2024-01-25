import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public abstract class Class73_Sub1 extends Class73 {

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "I")
	protected int anInt6842;

	@OriginalMember(owner = "client!oca", name = "o", descriptor = "I")
	protected int anInt6851;

	@OriginalMember(owner = "client!oca", name = "q", descriptor = "[I")
	private int[] anIntArray386;

	@OriginalMember(owner = "client!oca", name = "s", descriptor = "I")
	protected int anInt6854;

	@OriginalMember(owner = "client!oca", name = "E", descriptor = "I")
	protected int anInt6865;

	@OriginalMember(owner = "client!oca", name = "B", descriptor = "Lclient!wk;")
	protected final Class31_Sub3 aClass31_Sub3_8;

	@OriginalMember(owner = "client!oca", name = "G", descriptor = "I")
	public final int anInt6867;

	@OriginalMember(owner = "client!oca", name = "p", descriptor = "I")
	public final int anInt6852;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!wk;II)V")
	public Class73_Sub1(@OriginalArg(0) Class31_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass31_Sub3_8 = arg0;
		this.anInt6867 = arg1;
		this.anInt6852 = arg2;
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(II)V")
	protected abstract void method5470(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected final void method7951(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class53 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass31_Sub3_8.method8096()) {
			throw new IllegalStateException();
		} else if (this.method5472(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class53_Sub1 local20 = (Class53_Sub1) arg6;
			this.method5471(local20.anIntArray58, local20.anIntArray57, Static380.anInt6858 - arg7, -arg8 - (Static380.anInt6860 - Static380.anInt6845));
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "([I[III)V")
	protected abstract void method5471(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oca", name = "YA", descriptor = "(IIIIIIII)V")
	protected abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!oca", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt6867;
	}

	@OriginalMember(owner = "client!oca", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6865 = arg0;
		this.anInt6851 = arg1;
		this.anInt6842 = arg2;
		this.anInt6854 = arg3;
	}

	@OriginalMember(owner = "client!oca", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass31_Sub3_8.method8096()) {
			throw new IllegalStateException();
		} else if (this.method5472(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static380.anInt6857 = arg7;
			if (arg6 != 1) {
				Static380.anInt6859 = arg7 >>> 24;
				Static380.anInt6837 = 256 - Static380.anInt6859;
				if (arg6 == 0) {
					Static380.anInt6841 = arg7 >> 16 & 0xFF;
					Static380.anInt6864 = arg7 >> 8 & 0xFF;
					Static380.anInt6838 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static380.anInt6839 = arg7 >>> 24;
					Static380.anInt6843 = 256 - Static380.anInt6839;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static380.anInt6843 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static380.anInt6843 & 0xFF0000;
					Static380.anInt6861 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method5470(1);
			} else if (arg6 == 0) {
				this.method5470(0);
			} else if (arg6 == 3) {
				this.method5470(3);
			} else if (arg6 == 2) {
				this.method5470(2);
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IILclient!ua;II)V")
	public abstract void method7952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oca", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass31_Sub3_8.method8096()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray386 == null) {
			this.anIntArray386 = new int[4];
		}
		this.aClass31_Sub3_8.oa(this.anIntArray386);
		this.aClass31_Sub3_8.V(this.aClass31_Sub3_8.anInt10259, this.aClass31_Sub3_8.anInt10234, arg0 + arg2, arg1 + arg3);
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
		this.aClass31_Sub3_8.da(this.anIntArray386[0], this.anIntArray386[1], this.anIntArray386[2], this.anIntArray386[3]);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method5472(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt6865 + this.anInt6867 + this.anInt6842;
		@Pc(17) int local17 = this.anInt6851 + this.anInt6852 + this.anInt6854;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt6867 || local17 != this.anInt6852) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt6851;
			local65 = local53 * (float) this.anInt6851;
			local71 = local32 * (float) this.anInt6865;
			local77 = local39 * (float) this.anInt6865;
			@Pc(84) float local84 = -local32 * (float) this.anInt6842;
			@Pc(91) float local91 = -local39 * (float) this.anInt6842;
			@Pc(98) float local98 = -local46 * (float) this.anInt6854;
			@Pc(105) float local105 = -local53 * (float) this.anInt6854;
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
		if (local46 < (float) this.aClass31_Sub3_8.anInt10259) {
			local46 = this.aClass31_Sub3_8.anInt10259;
		}
		if (local53 > (float) this.aClass31_Sub3_8.anInt10257) {
			local53 = this.aClass31_Sub3_8.anInt10257;
		}
		if (local59 < (float) this.aClass31_Sub3_8.anInt10234) {
			local59 = this.aClass31_Sub3_8.anInt10234;
		}
		if (local65 > (float) this.aClass31_Sub3_8.anInt10254) {
			local65 = this.aClass31_Sub3_8.anInt10254;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static380.anInt6840 = this.aClass31_Sub3_8.anInt10243;
		Static380.anInt6847 = (int) ((float) ((int) local59 * Static380.anInt6840) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static380.anInt6853 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt6867 / local71);
		Static380.anInt6848 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt6852 / local77);
		Static380.anInt6855 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt6867 / local77);
		Static380.anInt6846 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt6852 / local71);
		Static380.anInt6862 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static380.anInt6866 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static380.anInt6850 = (this.anInt6867 >> 1 << 12) + (Static380.anInt6866 * Static380.anInt6855 >> 4);
		Static380.anInt6856 = (this.anInt6852 >> 1 << 12) + (Static380.anInt6866 * Static380.anInt6846 >> 4);
		Static380.anInt6863 = Static380.anInt6862 * Static380.anInt6853 >> 4;
		Static380.anInt6844 = Static380.anInt6862 * Static380.anInt6848 >> 4;
		Static380.anInt6858 = (int) local46;
		Static380.anInt6849 = (int) local53;
		Static380.anInt6845 = (int) local59;
		Static380.anInt6860 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!oca", name = "ca", descriptor = "()I")
	@Override
	public final int ca() {
		return this.anInt6851 + this.anInt6852 + this.anInt6854;
	}

	@OriginalMember(owner = "client!oca", name = "V", descriptor = "(IIIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oca", name = "A", descriptor = "()I")
	@Override
	public final int A() {
		return this.anInt6865 + this.anInt6867 + this.anInt6842;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method5473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!oca", name = "u", descriptor = "()I")
	@Override
	public final int u() {
		return this.anInt6852;
	}
}
