import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public abstract class Class54_Sub1 extends Class54 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "I")
	protected int anInt6268;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "[I")
	private int[] anIntArray542;

	@OriginalMember(owner = "client!np", name = "p", descriptor = "I")
	protected int anInt6282;

	@OriginalMember(owner = "client!np", name = "v", descriptor = "I")
	protected int anInt6288;

	@OriginalMember(owner = "client!np", name = "z", descriptor = "I")
	protected int anInt6291;

	@OriginalMember(owner = "client!np", name = "x", descriptor = "Lclient!s;")
	protected final Class59_Sub2 aClass59_Sub2_11;

	@OriginalMember(owner = "client!np", name = "m", descriptor = "I")
	protected final int anInt6279;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "I")
	protected final int anInt6276;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!s;II)V")
	protected Class54_Sub1(@OriginalArg(0) Class59_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass59_Sub2_11 = arg0;
		this.anInt6279 = arg1;
		this.anInt6276 = arg2;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "()I")
	@Override
	public final int method5560() {
		return this.anInt6282 + this.anInt6279 + this.anInt6288;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "([I[III)V")
	protected abstract void method5580(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(II)V")
	protected abstract void method5581(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method5572(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass59_Sub2_11.method4887()) {
			throw new IllegalStateException();
		}
		this.method5582(arg0, arg1, arg2, arg3, arg4, arg5);
		Static212.anInt6284 = arg7;
		if (arg6 != 0) {
			Static212.anInt6295 = arg7 >>> 24;
			Static212.anInt6283 = 256 - Static212.anInt6295;
			if (arg6 == 1) {
				Static212.anInt6287 = arg7 >> 16 & 0xFF;
				Static212.anInt6292 = arg7 >> 8 & 0xFF;
				Static212.anInt6296 = arg7 & 0xFF;
			} else {
				Static212.anInt6280 = arg7 >>> 24;
				Static212.anInt6289 = 256 - Static212.anInt6280;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static212.anInt6289 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static212.anInt6289 & 0xFF0000;
				Static212.anInt6285 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method5581(0);
		} else if (arg6 == 1) {
			this.method5581(1);
		} else if (arg6 == 2) {
			this.method5581(2);
		}
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "()I")
	@Override
	public final int method5576() {
		return this.anInt6268 + this.anInt6276 + this.anInt6291;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIII)V")
	public abstract void method5575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(FFFFFFLclient!hm;II)V")
	@Override
	protected final void method5564(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class15 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass59_Sub2_11.method4887()) {
			throw new IllegalStateException();
		}
		this.method5582(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class15_Sub2 local18 = (Class15_Sub2) arg6;
		this.method5580(local18.anIntArray95, local18.anIntArray96, Static212.anInt6293 - arg7, -arg8 - (Static212.anInt6273 - Static212.anInt6274));
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "()I")
	@Override
	public final int method5577() {
		return this.anInt6279;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method5567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6282 = arg0;
		this.anInt6268 = arg1;
		this.anInt6288 = arg2;
		this.anInt6291 = arg3;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method5568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass59_Sub2_11.method4887()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray542 == null) {
			this.anIntArray542 = new int[4];
		}
		this.aClass59_Sub2_11.method4817(this.anIntArray542);
		this.aClass59_Sub2_11.method4829(this.aClass59_Sub2_11.anInt5516, this.aClass59_Sub2_11.anInt5509, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method5560();
		@Pc(40) int local40 = this.method5576();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5575(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass59_Sub2_11.method4795(this.anIntArray542[0], this.anIntArray542[1], this.anIntArray542[2], this.anIntArray542[3]);
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "()I")
	@Override
	public final int method5565() {
		return this.anInt6276;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IILclient!hm;II)V")
	public abstract void method5574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(FFFFFF)V")
	private void method5582(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt6282 + this.anInt6279 + this.anInt6288;
		@Pc(17) int local17 = this.anInt6268 + this.anInt6276 + this.anInt6291;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt6279 || local17 != this.anInt6276) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt6268;
			local65 = local53 * (float) this.anInt6268;
			local71 = local32 * (float) this.anInt6282;
			local77 = local39 * (float) this.anInt6282;
			@Pc(84) float local84 = -local32 * (float) this.anInt6288;
			@Pc(91) float local91 = -local39 * (float) this.anInt6288;
			@Pc(98) float local98 = -local46 * (float) this.anInt6291;
			@Pc(105) float local105 = -local53 * (float) this.anInt6291;
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
		if (local46 < (float) this.aClass59_Sub2_11.anInt5516) {
			local46 = this.aClass59_Sub2_11.anInt5516;
		}
		if (local53 > (float) this.aClass59_Sub2_11.anInt5500) {
			local53 = this.aClass59_Sub2_11.anInt5500;
		}
		if (local59 < (float) this.aClass59_Sub2_11.anInt5509) {
			local59 = this.aClass59_Sub2_11.anInt5509;
		}
		if (local65 > (float) this.aClass59_Sub2_11.anInt5511) {
			local65 = this.aClass59_Sub2_11.anInt5511;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static212.anInt6290 = this.aClass59_Sub2_11.anInt5498;
		Static212.anInt6297 = (int) ((float) ((int) local59 * Static212.anInt6290) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static212.anInt6298 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt6279 / local71);
		Static212.anInt6271 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt6276 / local77);
		Static212.anInt6294 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt6279 / local77);
		Static212.anInt6281 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt6276 / local71);
		Static212.anInt6275 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static212.anInt6277 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static212.anInt6269 = (this.anInt6279 >> 1 << 12) + (Static212.anInt6277 * Static212.anInt6294 >> 4);
		Static212.anInt6270 = (this.anInt6276 >> 1 << 12) + (Static212.anInt6277 * Static212.anInt6281 >> 4);
		Static212.anInt6278 = Static212.anInt6275 * Static212.anInt6298 >> 4;
		Static212.anInt6286 = Static212.anInt6275 * Static212.anInt6271 >> 4;
		Static212.anInt6293 = (int) local46;
		Static212.anInt6272 = (int) local53;
		Static212.anInt6274 = (int) local59;
		Static212.anInt6273 = (int) local65;
	}
}
