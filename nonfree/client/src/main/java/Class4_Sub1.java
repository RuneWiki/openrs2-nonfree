import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public abstract class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "[I")
	private int[] anIntArray622;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
	public int anInt7876;

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
	public int anInt7882;

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
	public int anInt7884;

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
	public int anInt7887;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Lclient!kb;")
	protected final Class121_Sub1 aClass121_Sub1_16;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
	public final int anInt7872;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	public final int anInt7867;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!kb;II)V")
	protected Class4_Sub1(@OriginalArg(0) Class121_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass121_Sub1_16 = arg0;
		this.anInt7872 = arg1;
		this.anInt7867 = arg2;
	}

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "(IIIII)V")
	public abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!fa;II)V")
	public abstract void method6510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method6517(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7882 + this.anInt7872 + this.anInt7876;
		@Pc(17) int local17 = this.anInt7887 + this.anInt7867 + this.anInt7884;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7872 || local17 != this.anInt7867) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7887;
			local65 = local53 * (float) this.anInt7887;
			local71 = local32 * (float) this.anInt7882;
			local77 = local39 * (float) this.anInt7882;
			@Pc(84) float local84 = -local32 * (float) this.anInt7876;
			@Pc(91) float local91 = -local39 * (float) this.anInt7876;
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
		if (local46 < (float) this.aClass121_Sub1_16.anInt4519) {
			local46 = this.aClass121_Sub1_16.anInt4519;
		}
		if (local53 > (float) this.aClass121_Sub1_16.anInt4502) {
			local53 = this.aClass121_Sub1_16.anInt4502;
		}
		if (local59 < (float) this.aClass121_Sub1_16.anInt4514) {
			local59 = this.aClass121_Sub1_16.anInt4514;
		}
		if (local65 > (float) this.aClass121_Sub1_16.anInt4523) {
			local65 = this.aClass121_Sub1_16.anInt4523;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static3.anInt7877 = this.aClass121_Sub1_16.anInt4529;
		Static3.anInt7874 = (int) ((float) ((int) local59 * Static3.anInt7877) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static3.anInt7864 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7872 / local71);
		Static3.anInt7858 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7867 / local77);
		Static3.anInt7879 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7872 / local77);
		Static3.anInt7869 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7867 / local71);
		Static3.anInt7886 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static3.anInt7860 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static3.anInt7865 = (this.anInt7872 >> 1 << 12) + (Static3.anInt7860 * Static3.anInt7879 >> 4);
		Static3.anInt7866 = (this.anInt7867 >> 1 << 12) + (Static3.anInt7860 * Static3.anInt7869 >> 4);
		Static3.anInt7888 = Static3.anInt7886 * Static3.anInt7864 >> 4;
		Static3.anInt7868 = Static3.anInt7886 * Static3.anInt7858 >> 4;
		Static3.anInt7873 = (int) local46;
		Static3.anInt7878 = (int) local53;
		Static3.anInt7871 = (int) local59;
		Static3.anInt7885 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "()I")
	@Override
	public final int b() {
		return this.anInt7867;
	}

	@OriginalMember(owner = "client!ac", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7882 = arg0;
		this.anInt7887 = arg1;
		this.anInt7876 = arg2;
		this.anInt7884 = arg3;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected final void method6508(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class16 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass121_Sub1_16.method3926()) {
			throw new IllegalStateException();
		} else if (this.method6517(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class16_Sub2 local20 = (Class16_Sub2) arg6;
			this.method6519(local20.anIntArray434, local20.anIntArray433, Static3.anInt7873 - arg7, -arg8 - (Static3.anInt7885 - Static3.anInt7871));
		}
	}

	@OriginalMember(owner = "client!ac", name = "KA", descriptor = "(IIIIIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "()I")
	@Override
	public final int a() {
		return this.anInt7887 + this.anInt7867 + this.anInt7884;
	}

	@OriginalMember(owner = "client!ac", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass121_Sub1_16.method3926()) {
			throw new IllegalStateException();
		} else if (this.method6517(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static3.anInt7859 = arg7;
			if (arg6 != 1) {
				Static3.anInt7863 = arg7 >>> 24;
				Static3.anInt7881 = 256 - Static3.anInt7863;
				if (arg6 == 0) {
					Static3.anInt7875 = arg7 >> 16 & 0xFF;
					Static3.anInt7862 = arg7 >> 8 & 0xFF;
					Static3.anInt7883 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static3.anInt7861 = arg7 >>> 24;
					Static3.anInt7870 = 256 - Static3.anInt7861;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static3.anInt7870 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static3.anInt7870 & 0xFF0000;
					Static3.anInt7880 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method6518(1);
			} else if (arg6 == 0) {
				this.method6518(0);
			} else if (arg6 == 3) {
				this.method6518(3);
			} else if (arg6 == 2) {
				this.method6518(2);
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "QA", descriptor = "()I")
	@Override
	public final int QA() {
		return this.anInt7872;
	}

	@OriginalMember(owner = "client!ac", name = "AA", descriptor = "()I")
	@Override
	public final int AA() {
		return this.anInt7882 + this.anInt7872 + this.anInt7876;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V")
	protected abstract void method6518(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ac", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public final void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass121_Sub1_16.method3926()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray622 == null) {
			this.anIntArray622 = new int[4];
		}
		this.aClass121_Sub1_16.A(this.anIntArray622);
		this.aClass121_Sub1_16.Q(this.aClass121_Sub1_16.anInt4519, this.aClass121_Sub1_16.anInt4514, arg0 + arg2, arg1 + arg3);
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
		this.aClass121_Sub1_16.ca(this.anIntArray622[0], this.anIntArray622[1], this.anIntArray622[2], this.anIntArray622[3]);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([I[III)V")
	protected abstract void method6519(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
