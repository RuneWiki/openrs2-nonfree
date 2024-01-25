import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public abstract class Class143_Sub1 extends Class143 {

	@OriginalMember(owner = "client!of", name = "d", descriptor = "I")
	protected int anInt6887;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "I")
	protected int anInt6897;

	@OriginalMember(owner = "client!of", name = "t", descriptor = "[I")
	private int[] anIntArray617;

	@OriginalMember(owner = "client!of", name = "y", descriptor = "I")
	protected int anInt6906;

	@OriginalMember(owner = "client!of", name = "F", descriptor = "I")
	protected int anInt6913;

	@OriginalMember(owner = "client!of", name = "r", descriptor = "Lclient!cj;")
	protected final Class39_Sub1 aClass39_Sub1_11;

	@OriginalMember(owner = "client!of", name = "u", descriptor = "I")
	protected final int anInt6902;

	@OriginalMember(owner = "client!of", name = "q", descriptor = "I")
	protected final int anInt6900;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!cj;II)V")
	protected Class143_Sub1(@OriginalArg(0) Class39_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass39_Sub1_11 = arg0;
		this.anInt6902 = arg1;
		this.anInt6900 = arg2;
	}

	@OriginalMember(owner = "client!of", name = "MA", descriptor = "(IIII)V")
	@Override
	public final void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6913 = arg0;
		this.anInt6887 = arg1;
		this.anInt6897 = arg2;
		this.anInt6906 = arg3;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IILclient!ma;II)V")
	public abstract void method5720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(FFFFFF)V")
	private void method5665(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt6913 + this.anInt6902 + this.anInt6897;
		@Pc(17) int local17 = this.anInt6887 + this.anInt6900 + this.anInt6906;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt6902 || local17 != this.anInt6900) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt6887;
			local65 = local53 * (float) this.anInt6887;
			local71 = local32 * (float) this.anInt6913;
			local77 = local39 * (float) this.anInt6913;
			@Pc(84) float local84 = -local32 * (float) this.anInt6897;
			@Pc(91) float local91 = -local39 * (float) this.anInt6897;
			@Pc(98) float local98 = -local46 * (float) this.anInt6906;
			@Pc(105) float local105 = -local53 * (float) this.anInt6906;
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
		if (local46 < (float) this.aClass39_Sub1_11.anInt1066) {
			local46 = this.aClass39_Sub1_11.anInt1066;
		}
		if (local53 > (float) this.aClass39_Sub1_11.anInt1072) {
			local53 = this.aClass39_Sub1_11.anInt1072;
		}
		if (local59 < (float) this.aClass39_Sub1_11.anInt1058) {
			local59 = this.aClass39_Sub1_11.anInt1058;
		}
		if (local65 > (float) this.aClass39_Sub1_11.anInt1049) {
			local65 = this.aClass39_Sub1_11.anInt1049;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static284.anInt6912 = this.aClass39_Sub1_11.anInt1073;
		Static284.anInt6896 = (int) ((float) ((int) local59 * Static284.anInt6912) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static284.anInt6905 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt6902 / local71);
		Static284.anInt6885 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt6900 / local77);
		Static284.anInt6903 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt6902 / local77);
		Static284.anInt6889 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt6900 / local71);
		Static284.anInt6884 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static284.anInt6891 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static284.anInt6899 = (this.anInt6902 >> 1 << 12) + (Static284.anInt6891 * Static284.anInt6903 >> 4);
		Static284.anInt6888 = (this.anInt6900 >> 1 << 12) + (Static284.anInt6891 * Static284.anInt6889 >> 4);
		Static284.anInt6914 = Static284.anInt6884 * Static284.anInt6905 >> 4;
		Static284.anInt6901 = Static284.anInt6884 * Static284.anInt6885 >> 4;
		Static284.anInt6893 = (int) local46;
		Static284.anInt6894 = (int) local53;
		Static284.anInt6909 = (int) local59;
		Static284.anInt6911 = (int) local65;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void a(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass39_Sub1_11.method1082()) {
			throw new IllegalStateException();
		}
		this.method5665(arg0, arg1, arg2, arg3, arg4, arg5);
		Static284.anInt6907 = arg7;
		if (arg6 != 1) {
			Static284.anInt6892 = arg7 >>> 24;
			Static284.anInt6904 = 256 - Static284.anInt6892;
			if (arg6 == 0) {
				Static284.anInt6895 = arg7 >> 16 & 0xFF;
				Static284.anInt6898 = arg7 >> 8 & 0xFF;
				Static284.anInt6910 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static284.anInt6886 = arg7 >>> 24;
				Static284.anInt6890 = 256 - Static284.anInt6886;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static284.anInt6890 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static284.anInt6890 & 0xFF0000;
				Static284.anInt6908 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method5666(1);
		} else if (arg6 == 0) {
			this.method5666(0);
		} else if (arg6 == 3) {
			this.method5666(3);
		} else if (arg6 == 2) {
			this.method5666(2);
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(II)V")
	protected abstract void method5666(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!of", name = "la", descriptor = "()I")
	@Override
	public final int la() {
		return this.anInt6902;
	}

	@OriginalMember(owner = "client!of", name = "ma", descriptor = "()I")
	@Override
	public final int ma() {
		return this.anInt6900;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([I[III)V")
	protected abstract void method5667(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!of", name = "JA", descriptor = "(IIIIIII)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass39_Sub1_11.method1082()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray617 == null) {
			this.anIntArray617 = new int[4];
		}
		this.aClass39_Sub1_11.da(this.anIntArray617);
		this.aClass39_Sub1_11.fa(this.aClass39_Sub1_11.anInt1066, this.aClass39_Sub1_11.anInt1058, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.j();
		@Pc(40) int local40 = this.T();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.r(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass39_Sub1_11.OA(this.anIntArray617[0], this.anIntArray617[1], this.anIntArray617[2], this.anIntArray617[3]);
	}

	@OriginalMember(owner = "client!of", name = "r", descriptor = "(IIIII)V")
	public abstract void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(FFFFFFLclient!ma;II)V")
	@Override
	protected final void method5716(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class133 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass39_Sub1_11.method1082()) {
			throw new IllegalStateException();
		}
		this.method5665(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class133_Sub1 local18 = (Class133_Sub1) arg6;
		this.method5667(local18.anIntArray321, local18.anIntArray320, Static284.anInt6893 - arg7, -arg8 - (Static284.anInt6911 - Static284.anInt6909));
	}

	@OriginalMember(owner = "client!of", name = "T", descriptor = "()I")
	@Override
	public final int T() {
		return this.anInt6887 + this.anInt6900 + this.anInt6906;
	}

	@OriginalMember(owner = "client!of", name = "s", descriptor = "(IIIIIII)V")
	public abstract void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!of", name = "j", descriptor = "()I")
	@Override
	public final int j() {
		return this.anInt6913 + this.anInt6902 + this.anInt6897;
	}
}
