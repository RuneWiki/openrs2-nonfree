import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public abstract class Class95_Sub1 extends Class95 {

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
	protected int anInt7257;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	protected int anInt7261;

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "[I")
	private int[] anIntArray551;

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
	protected int anInt7281;

	@OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
	protected int anInt7283;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!ji;")
	protected final Class135_Sub1 aClass135_Sub1_11;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	protected final int anInt7256;

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
	protected final int anInt7275;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!ji;II)V")
	protected Class95_Sub1(@OriginalArg(0) Class135_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass135_Sub1_11 = arg0;
		this.anInt7256 = arg1;
		this.anInt7275 = arg2;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)V")
	protected abstract void method5829(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void a(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass135_Sub1_11.method2713()) {
			throw new IllegalStateException();
		}
		this.method5831(arg0, arg1, arg2, arg3, arg4, arg5);
		Static201.anInt7262 = arg7;
		if (arg6 != 1) {
			Static201.anInt7263 = arg7 >>> 24;
			Static201.anInt7280 = 256 - Static201.anInt7263;
			if (arg6 == 0) {
				Static201.anInt7264 = arg7 >> 16 & 0xFF;
				Static201.anInt7279 = arg7 >> 8 & 0xFF;
				Static201.anInt7266 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static201.anInt7273 = arg7 >>> 24;
				Static201.anInt7265 = 256 - Static201.anInt7273;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static201.anInt7265 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static201.anInt7265 & 0xFF0000;
				Static201.anInt7260 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method5829(1);
		} else if (arg6 == 0) {
			this.method5829(0);
		} else if (arg6 == 3) {
			this.method5829(3);
		} else if (arg6 == 2) {
			this.method5829(2);
		}
	}

	@OriginalMember(owner = "client!kf", name = "MA", descriptor = "(IIII)V")
	@Override
	public final void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7261 = arg0;
		this.anInt7281 = arg1;
		this.anInt7283 = arg2;
		this.anInt7257 = arg3;
	}

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "()I")
	@Override
	public final int j() {
		return this.anInt7261 + this.anInt7256 + this.anInt7283;
	}

	@OriginalMember(owner = "client!kf", name = "la", descriptor = "()I")
	@Override
	public final int la() {
		return this.anInt7256;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILclient!ma;II)V")
	public abstract void method5820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "(IIIII)V")
	public abstract void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "(IIIIIII)V")
	public abstract void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!kf", name = "ma", descriptor = "()I")
	@Override
	public final int ma() {
		return this.anInt7275;
	}

	@OriginalMember(owner = "client!kf", name = "JA", descriptor = "(IIIIIII)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass135_Sub1_11.method2713()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray551 == null) {
			this.anIntArray551 = new int[4];
		}
		this.aClass135_Sub1_11.da(this.anIntArray551);
		this.aClass135_Sub1_11.fa(this.aClass135_Sub1_11.anInt3430, this.aClass135_Sub1_11.anInt3422, arg0 + arg2, arg1 + arg3);
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
		this.aClass135_Sub1_11.OA(this.anIntArray551[0], this.anIntArray551[1], this.anIntArray551[2], this.anIntArray551[3]);
	}

	@OriginalMember(owner = "client!kf", name = "T", descriptor = "()I")
	@Override
	public final int T() {
		return this.anInt7281 + this.anInt7275 + this.anInt7257;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([I[III)V")
	protected abstract void method5830(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(FFFFFF)V")
	private void method5831(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7261 + this.anInt7256 + this.anInt7283;
		@Pc(17) int local17 = this.anInt7281 + this.anInt7275 + this.anInt7257;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7256 || local17 != this.anInt7275) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7281;
			local65 = local53 * (float) this.anInt7281;
			local71 = local32 * (float) this.anInt7261;
			local77 = local39 * (float) this.anInt7261;
			@Pc(84) float local84 = -local32 * (float) this.anInt7283;
			@Pc(91) float local91 = -local39 * (float) this.anInt7283;
			@Pc(98) float local98 = -local46 * (float) this.anInt7257;
			@Pc(105) float local105 = -local53 * (float) this.anInt7257;
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
		if (local46 < (float) this.aClass135_Sub1_11.anInt3430) {
			local46 = this.aClass135_Sub1_11.anInt3430;
		}
		if (local53 > (float) this.aClass135_Sub1_11.anInt3423) {
			local53 = this.aClass135_Sub1_11.anInt3423;
		}
		if (local59 < (float) this.aClass135_Sub1_11.anInt3422) {
			local59 = this.aClass135_Sub1_11.anInt3422;
		}
		if (local65 > (float) this.aClass135_Sub1_11.anInt3419) {
			local65 = this.aClass135_Sub1_11.anInt3419;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static201.anInt7284 = this.aClass135_Sub1_11.anInt3418;
		Static201.anInt7278 = (int) ((float) ((int) local59 * Static201.anInt7284) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static201.anInt7255 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7256 / local71);
		Static201.anInt7271 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7275 / local77);
		Static201.anInt7285 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7256 / local77);
		Static201.anInt7276 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7275 / local71);
		Static201.anInt7277 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static201.anInt7268 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static201.anInt7259 = (this.anInt7256 >> 1 << 12) + (Static201.anInt7268 * Static201.anInt7285 >> 4);
		Static201.anInt7258 = (this.anInt7275 >> 1 << 12) + (Static201.anInt7268 * Static201.anInt7276 >> 4);
		Static201.anInt7272 = Static201.anInt7277 * Static201.anInt7255 >> 4;
		Static201.anInt7282 = Static201.anInt7277 * Static201.anInt7271 >> 4;
		Static201.anInt7270 = (int) local46;
		Static201.anInt7274 = (int) local53;
		Static201.anInt7269 = (int) local59;
		Static201.anInt7267 = (int) local65;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(FFFFFFLclient!ma;II)V")
	@Override
	protected final void method5822(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class71 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass135_Sub1_11.method2713()) {
			throw new IllegalStateException();
		}
		this.method5831(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class71_Sub2 local18 = (Class71_Sub2) arg6;
		this.method5830(local18.anIntArray445, local18.anIntArray444, Static201.anInt7270 - arg7, -arg8 - (Static201.anInt7267 - Static201.anInt7269));
	}
}
