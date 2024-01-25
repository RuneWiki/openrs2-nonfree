import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public abstract class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!ow", name = "j", descriptor = "I")
	protected int anInt7865;

	@OriginalMember(owner = "client!ow", name = "m", descriptor = "I")
	protected int anInt7868;

	@OriginalMember(owner = "client!ow", name = "o", descriptor = "I")
	protected int anInt7870;

	@OriginalMember(owner = "client!ow", name = "v", descriptor = "[I")
	private int[] anIntArray608;

	@OriginalMember(owner = "client!ow", name = "F", descriptor = "I")
	protected int anInt7884;

	@OriginalMember(owner = "client!ow", name = "u", descriptor = "Lclient!tea;")
	protected final Class134_Sub3 aClass134_Sub3_11;

	@OriginalMember(owner = "client!ow", name = "g", descriptor = "I")
	public final int anInt7862;

	@OriginalMember(owner = "client!ow", name = "q", descriptor = "I")
	public final int anInt7872;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Lclient!tea;II)V")
	public Class22_Sub2(@OriginalArg(0) Class134_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass134_Sub3_11 = arg0;
		this.anInt7862 = arg1;
		this.anInt7872 = arg2;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "([I[III)V")
	protected abstract void method6314(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ow", name = "u", descriptor = "()I")
	@Override
	public final int u() {
		return this.anInt7872;
	}

	@OriginalMember(owner = "client!ow", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7868 = arg0;
		this.anInt7865 = arg1;
		this.anInt7870 = arg2;
		this.anInt7884 = arg3;
	}

	@OriginalMember(owner = "client!ow", name = "ca", descriptor = "()I")
	@Override
	public final int ca() {
		return this.anInt7865 + this.anInt7872 + this.anInt7884;
	}

	@OriginalMember(owner = "client!ow", name = "A", descriptor = "()I")
	@Override
	public final int A() {
		return this.anInt7868 + this.anInt7862 + this.anInt7870;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected final void method7655(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class204 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass134_Sub3_11.method6979()) {
			throw new IllegalStateException();
		} else if (this.method6316(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class204_Sub2 local20 = (Class204_Sub2) arg6;
			this.method6314(local20.anIntArray469, local20.anIntArray470, Static392.anInt7875 - arg7, -arg8 - (Static392.anInt7856 - Static392.anInt7881));
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IILclient!ua;II)V")
	public abstract void method7663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class204 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ow", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt7862;
	}

	@OriginalMember(owner = "client!ow", name = "V", descriptor = "(IIIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ow", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass134_Sub3_11.method6979()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray608 == null) {
			this.anIntArray608 = new int[4];
		}
		this.aClass134_Sub3_11.oa(this.anIntArray608);
		this.aClass134_Sub3_11.V(this.aClass134_Sub3_11.anInt8537, this.aClass134_Sub3_11.anInt8521, arg0 + arg2, arg1 + arg3);
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
		this.aClass134_Sub3_11.da(this.anIntArray608[0], this.anIntArray608[1], this.anIntArray608[2], this.anIntArray608[3]);
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(II)V")
	protected abstract void method6315(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ow", name = "YA", descriptor = "(IIIIIIII)V")
	protected abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method6316(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7868 + this.anInt7862 + this.anInt7870;
		@Pc(17) int local17 = this.anInt7865 + this.anInt7872 + this.anInt7884;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7862 || local17 != this.anInt7872) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7865;
			local65 = local53 * (float) this.anInt7865;
			local71 = local32 * (float) this.anInt7868;
			local77 = local39 * (float) this.anInt7868;
			@Pc(84) float local84 = -local32 * (float) this.anInt7870;
			@Pc(91) float local91 = -local39 * (float) this.anInt7870;
			@Pc(98) float local98 = -local46 * (float) this.anInt7884;
			@Pc(105) float local105 = -local53 * (float) this.anInt7884;
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
		if (local46 < (float) this.aClass134_Sub3_11.anInt8537) {
			local46 = this.aClass134_Sub3_11.anInt8537;
		}
		if (local53 > (float) this.aClass134_Sub3_11.anInt8522) {
			local53 = this.aClass134_Sub3_11.anInt8522;
		}
		if (local59 < (float) this.aClass134_Sub3_11.anInt8521) {
			local59 = this.aClass134_Sub3_11.anInt8521;
		}
		if (local65 > (float) this.aClass134_Sub3_11.anInt8529) {
			local65 = this.aClass134_Sub3_11.anInt8529;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static392.anInt7885 = this.aClass134_Sub3_11.anInt8539;
		Static392.anInt7877 = (int) ((float) ((int) local59 * Static392.anInt7885) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static392.anInt7876 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7862 / local71);
		Static392.anInt7878 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7872 / local77);
		Static392.anInt7864 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7862 / local77);
		Static392.anInt7871 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7872 / local71);
		Static392.anInt7883 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static392.anInt7869 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static392.anInt7882 = (this.anInt7862 >> 1 << 12) + (Static392.anInt7869 * Static392.anInt7864 >> 4);
		Static392.anInt7858 = (this.anInt7872 >> 1 << 12) + (Static392.anInt7869 * Static392.anInt7871 >> 4);
		Static392.anInt7857 = Static392.anInt7883 * Static392.anInt7876 >> 4;
		Static392.anInt7867 = Static392.anInt7883 * Static392.anInt7878 >> 4;
		Static392.anInt7875 = (int) local46;
		Static392.anInt7861 = (int) local53;
		Static392.anInt7881 = (int) local59;
		Static392.anInt7856 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method6317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ow", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass134_Sub3_11.method6979()) {
			throw new IllegalStateException();
		} else if (this.method6316(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static392.anInt7886 = arg7;
			if (arg6 != 1) {
				Static392.anInt7873 = arg7 >>> 24;
				Static392.anInt7879 = 256 - Static392.anInt7873;
				if (arg6 == 0) {
					Static392.anInt7866 = arg7 >> 16 & 0xFF;
					Static392.anInt7880 = arg7 >> 8 & 0xFF;
					Static392.anInt7874 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static392.anInt7863 = arg7 >>> 24;
					Static392.anInt7859 = 256 - Static392.anInt7863;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static392.anInt7859 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static392.anInt7859 & 0xFF0000;
					Static392.anInt7860 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method6315(1);
			} else if (arg6 == 0) {
				this.method6315(0);
			} else if (arg6 == 3) {
				this.method6315(3);
			} else if (arg6 == 2) {
				this.method6315(2);
			}
		}
	}
}
