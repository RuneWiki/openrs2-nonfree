import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public abstract class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "I")
	protected int anInt6909;

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "[I")
	private int[] anIntArray508;

	@OriginalMember(owner = "client!rl", name = "x", descriptor = "I")
	protected int anInt6911;

	@OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
	protected int anInt6917;

	@OriginalMember(owner = "client!rl", name = "E", descriptor = "I")
	protected int anInt6918;

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "Lclient!pm;")
	protected final Class63_Sub2 aClass63_Sub2_10;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
	protected final int anInt6890;

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
	protected final int anInt6897;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!pm;II)V")
	protected Class4_Sub2(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass63_Sub2_10 = arg0;
		this.anInt6890 = arg1;
		this.anInt6897 = arg2;
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "()I")
	@Override
	public final int method5963() {
		return this.anInt6918 + this.anInt6897 + this.anInt6911;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "()I")
	@Override
	public final int method5961() {
		return this.anInt6909 + this.anInt6890 + this.anInt6917;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "()I")
	@Override
	public final int method5952() {
		return this.anInt6897;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIII)V")
	public abstract void method5957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(FFFFFFLclient!tm;II)V")
	@Override
	protected final void method5953(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class92 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass63_Sub2_10.method4661()) {
			throw new IllegalStateException();
		}
		this.method5968(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class92_Sub2 local18 = (Class92_Sub2) arg6;
		this.method5970(local18.anIntArray440, local18.anIntArray439, Static278.anInt6910 - arg7, -arg8 - (Static278.anInt6913 - Static278.anInt6904));
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method5959(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass63_Sub2_10.method4661()) {
			throw new IllegalStateException();
		}
		this.method5968(arg0, arg1, arg2, arg3, arg4, arg5);
		Static278.anInt6900 = arg7;
		if (arg6 != 0) {
			Static278.anInt6915 = arg7 >>> 24;
			Static278.anInt6916 = 256 - Static278.anInt6915;
			if (arg6 == 1) {
				Static278.anInt6901 = arg7 >> 16 & 0xFF;
				Static278.anInt6906 = arg7 >> 8 & 0xFF;
				Static278.anInt6905 = arg7 & 0xFF;
			} else {
				Static278.anInt6898 = arg7 >>> 24;
				Static278.anInt6914 = 256 - Static278.anInt6898;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static278.anInt6914 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static278.anInt6914 & 0xFF0000;
				Static278.anInt6899 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method5969(0);
		} else if (arg6 == 1) {
			this.method5969(1);
		} else if (arg6 == 2) {
			this.method5969(2);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(FFFFFF)V")
	private void method5968(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt6909 + this.anInt6890 + this.anInt6917;
		@Pc(17) int local17 = this.anInt6918 + this.anInt6897 + this.anInt6911;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt6890 || local17 != this.anInt6897) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt6918;
			local65 = local53 * (float) this.anInt6918;
			local71 = local32 * (float) this.anInt6909;
			local77 = local39 * (float) this.anInt6909;
			@Pc(84) float local84 = -local32 * (float) this.anInt6917;
			@Pc(91) float local91 = -local39 * (float) this.anInt6917;
			@Pc(98) float local98 = -local46 * (float) this.anInt6911;
			@Pc(105) float local105 = -local53 * (float) this.anInt6911;
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
		if (local46 < (float) this.aClass63_Sub2_10.anInt5032) {
			local46 = this.aClass63_Sub2_10.anInt5032;
		}
		if (local53 > (float) this.aClass63_Sub2_10.anInt5045) {
			local53 = this.aClass63_Sub2_10.anInt5045;
		}
		if (local59 < (float) this.aClass63_Sub2_10.anInt5046) {
			local59 = this.aClass63_Sub2_10.anInt5046;
		}
		if (local65 > (float) this.aClass63_Sub2_10.anInt5020) {
			local65 = this.aClass63_Sub2_10.anInt5020;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static278.anInt6895 = this.aClass63_Sub2_10.anInt5030;
		Static278.anInt6907 = (int) ((float) ((int) local59 * Static278.anInt6895) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static278.anInt6891 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt6890 / local71);
		Static278.anInt6903 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt6897 / local77);
		Static278.anInt6893 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt6890 / local77);
		Static278.anInt6894 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt6897 / local71);
		Static278.anInt6912 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static278.anInt6920 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static278.anInt6902 = (this.anInt6890 >> 1 << 12) + (Static278.anInt6920 * Static278.anInt6893 >> 4);
		Static278.anInt6896 = (this.anInt6897 >> 1 << 12) + (Static278.anInt6920 * Static278.anInt6894 >> 4);
		Static278.anInt6908 = Static278.anInt6912 * Static278.anInt6891 >> 4;
		Static278.anInt6919 = Static278.anInt6912 * Static278.anInt6903 >> 4;
		Static278.anInt6910 = (int) local46;
		Static278.anInt6892 = (int) local53;
		Static278.anInt6904 = (int) local59;
		Static278.anInt6913 = (int) local65;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method5950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass63_Sub2_10.method4661()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray508 == null) {
			this.anIntArray508 = new int[4];
		}
		this.aClass63_Sub2_10.method4565(this.anIntArray508);
		this.aClass63_Sub2_10.method4659(this.aClass63_Sub2_10.anInt5032, this.aClass63_Sub2_10.anInt5046, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method5961();
		@Pc(40) int local40 = this.method5963();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5957(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass63_Sub2_10.method4566(this.anIntArray508[0], this.anIntArray508[1], this.anIntArray508[2], this.anIntArray508[3]);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILclient!tm;II)V")
	public abstract void method5960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method5965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6909 = arg0;
		this.anInt6918 = arg1;
		this.anInt6917 = arg2;
		this.anInt6911 = arg3;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)V")
	protected abstract void method5969(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "()I")
	@Override
	public final int method5962() {
		return this.anInt6890;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([I[III)V")
	protected abstract void method5970(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
