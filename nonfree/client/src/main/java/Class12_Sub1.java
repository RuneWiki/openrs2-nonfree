import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public abstract class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "I")
	protected int anInt3179;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "I")
	protected int anInt3184;

	@OriginalMember(owner = "client!am", name = "j", descriptor = "I")
	protected int anInt3188;

	@OriginalMember(owner = "client!am", name = "x", descriptor = "I")
	protected int anInt3202;

	@OriginalMember(owner = "client!am", name = "D", descriptor = "[I")
	private int[] anIntArray296;

	@OriginalMember(owner = "client!am", name = "B", descriptor = "Lclient!lo;")
	protected final Class28_Sub2 aClass28_Sub2_8;

	@OriginalMember(owner = "client!am", name = "C", descriptor = "I")
	protected final int anInt3206;

	@OriginalMember(owner = "client!am", name = "g", descriptor = "I")
	protected final int anInt3185;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!lo;II)V")
	protected Class12_Sub1(@OriginalArg(0) Class28_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass28_Sub2_8 = arg0;
		this.anInt3206 = arg1;
		this.anInt3185 = arg2;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method5668(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass28_Sub2_8.method3590()) {
			throw new IllegalStateException();
		}
		this.method2874(arg0, arg1, arg2, arg3, arg4, arg5);
		Static13.anInt3199 = arg7;
		if (arg6 != 1) {
			Static13.anInt3207 = arg7 >>> 24;
			Static13.anInt3205 = 256 - Static13.anInt3207;
			if (arg6 == 0) {
				Static13.anInt3183 = arg7 >> 16 & 0xFF;
				Static13.anInt3181 = arg7 >> 8 & 0xFF;
				Static13.anInt3192 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static13.anInt3187 = arg7 >>> 24;
				Static13.anInt3190 = 256 - Static13.anInt3187;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static13.anInt3190 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static13.anInt3190 & 0xFF0000;
				Static13.anInt3208 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method2873(1);
		} else if (arg6 == 0) {
			this.method2873(0);
		} else if (arg6 == 3) {
			this.method2873(3);
		} else if (arg6 == 2) {
			this.method2873(2);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IILclient!be;II)V")
	public abstract void method5662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class24 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(II)V")
	protected abstract void method2873(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!am", name = "b", descriptor = "()I")
	@Override
	public final int method5655() {
		return this.anInt3179 + this.anInt3185 + this.anInt3202;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "()I")
	@Override
	public final int method5654() {
		return this.anInt3188 + this.anInt3206 + this.anInt3184;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!am", name = "d", descriptor = "()I")
	@Override
	public final int method5672() {
		return this.anInt3206;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIII)V")
	public abstract void method5658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(FFFFFF)V")
	private void method2874(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt3188 + this.anInt3206 + this.anInt3184;
		@Pc(17) int local17 = this.anInt3179 + this.anInt3185 + this.anInt3202;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt3206 || local17 != this.anInt3185) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt3179;
			local65 = local53 * (float) this.anInt3179;
			local71 = local32 * (float) this.anInt3188;
			local77 = local39 * (float) this.anInt3188;
			@Pc(84) float local84 = -local32 * (float) this.anInt3184;
			@Pc(91) float local91 = -local39 * (float) this.anInt3184;
			@Pc(98) float local98 = -local46 * (float) this.anInt3202;
			@Pc(105) float local105 = -local53 * (float) this.anInt3202;
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
		if (local46 < (float) this.aClass28_Sub2_8.anInt3924) {
			local46 = this.aClass28_Sub2_8.anInt3924;
		}
		if (local53 > (float) this.aClass28_Sub2_8.anInt3907) {
			local53 = this.aClass28_Sub2_8.anInt3907;
		}
		if (local59 < (float) this.aClass28_Sub2_8.anInt3930) {
			local59 = this.aClass28_Sub2_8.anInt3930;
		}
		if (local65 > (float) this.aClass28_Sub2_8.anInt3911) {
			local65 = this.aClass28_Sub2_8.anInt3911;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static13.anInt3201 = this.aClass28_Sub2_8.anInt3916;
		Static13.anInt3186 = (int) ((float) ((int) local59 * Static13.anInt3201) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static13.anInt3180 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt3206 / local71);
		Static13.anInt3196 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt3185 / local77);
		Static13.anInt3198 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt3206 / local77);
		Static13.anInt3204 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt3185 / local71);
		Static13.anInt3209 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static13.anInt3197 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static13.anInt3189 = (this.anInt3206 >> 1 << 12) + (Static13.anInt3197 * Static13.anInt3198 >> 4);
		Static13.anInt3203 = (this.anInt3185 >> 1 << 12) + (Static13.anInt3197 * Static13.anInt3204 >> 4);
		Static13.anInt3191 = Static13.anInt3209 * Static13.anInt3180 >> 4;
		Static13.anInt3194 = Static13.anInt3209 * Static13.anInt3196 >> 4;
		Static13.anInt3193 = (int) local46;
		Static13.anInt3200 = (int) local53;
		Static13.anInt3182 = (int) local59;
		Static13.anInt3195 = (int) local65;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(FFFFFFLclient!be;II)V")
	@Override
	protected final void method5671(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class24 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass28_Sub2_8.method3590()) {
			throw new IllegalStateException();
		}
		this.method2874(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class24_Sub1 local18 = (Class24_Sub1) arg6;
		this.method2875(local18.anIntArray106, local18.anIntArray105, Static13.anInt3193 - arg7, -arg8 - (Static13.anInt3195 - Static13.anInt3182));
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "()I")
	@Override
	public final int method5664() {
		return this.anInt3185;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method5669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass28_Sub2_8.method3590()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray296 == null) {
			this.anIntArray296 = new int[4];
		}
		this.aClass28_Sub2_8.method3524(this.anIntArray296);
		this.aClass28_Sub2_8.method3536(this.aClass28_Sub2_8.anInt3924, this.aClass28_Sub2_8.anInt3930, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method5654();
		@Pc(40) int local40 = this.method5655();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5658(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass28_Sub2_8.method3570(this.anIntArray296[0], this.anIntArray296[1], this.anIntArray296[2], this.anIntArray296[3]);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([I[III)V")
	protected abstract void method2875(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method5663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3188 = arg0;
		this.anInt3179 = arg1;
		this.anInt3184 = arg2;
		this.anInt3202 = arg3;
	}
}
