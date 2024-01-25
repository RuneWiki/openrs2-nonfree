import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public abstract class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!db", name = "d", descriptor = "I")
	protected int anInt5380;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "[I")
	private int[] anIntArray630;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	protected int anInt5386;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "I")
	protected int anInt5400;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "I")
	protected int anInt5403;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Lclient!wb;")
	protected final Class164_Sub2 aClass164_Sub2_10;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	protected final int anInt5388;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "I")
	protected final int anInt5381;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!wb;II)V")
	protected Class51_Sub1(@OriginalArg(0) Class164_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass164_Sub2_10 = arg0;
		this.anInt5388 = arg1;
		this.anInt5381 = arg2;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(FFFFFF)V")
	private void method4686(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt5400 + this.anInt5388 + this.anInt5386;
		@Pc(17) int local17 = this.anInt5403 + this.anInt5381 + this.anInt5380;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt5388 || local17 != this.anInt5381) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt5403;
			local65 = local53 * (float) this.anInt5403;
			local71 = local32 * (float) this.anInt5400;
			local77 = local39 * (float) this.anInt5400;
			@Pc(84) float local84 = -local32 * (float) this.anInt5386;
			@Pc(91) float local91 = -local39 * (float) this.anInt5386;
			@Pc(98) float local98 = -local46 * (float) this.anInt5380;
			@Pc(105) float local105 = -local53 * (float) this.anInt5380;
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
		if (local46 < (float) this.aClass164_Sub2_10.anInt6174) {
			local46 = this.aClass164_Sub2_10.anInt6174;
		}
		if (local53 > (float) this.aClass164_Sub2_10.anInt6195) {
			local53 = this.aClass164_Sub2_10.anInt6195;
		}
		if (local59 < (float) this.aClass164_Sub2_10.anInt6169) {
			local59 = this.aClass164_Sub2_10.anInt6169;
		}
		if (local65 > (float) this.aClass164_Sub2_10.anInt6183) {
			local65 = this.aClass164_Sub2_10.anInt6183;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static58.anInt5393 = this.aClass164_Sub2_10.anInt6170;
		Static58.anInt5405 = (int) ((float) ((int) local59 * Static58.anInt5393) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static58.anInt5384 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt5388 / local71);
		Static58.anInt5404 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt5381 / local77);
		Static58.anInt5395 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt5388 / local77);
		Static58.anInt5383 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt5381 / local71);
		Static58.anInt5407 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static58.anInt5379 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static58.anInt5389 = (this.anInt5388 >> 1 << 12) + (Static58.anInt5379 * Static58.anInt5395 >> 4);
		Static58.anInt5402 = (this.anInt5381 >> 1 << 12) + (Static58.anInt5379 * Static58.anInt5383 >> 4);
		Static58.anInt5378 = Static58.anInt5407 * Static58.anInt5384 >> 4;
		Static58.anInt5391 = Static58.anInt5407 * Static58.anInt5404 >> 4;
		Static58.anInt5387 = (int) local46;
		Static58.anInt5385 = (int) local53;
		Static58.anInt5390 = (int) local59;
		Static58.anInt5377 = (int) local65;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)V")
	protected abstract void method4687(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "()I")
	@Override
	public final int method4673() {
		return this.anInt5403 + this.anInt5381 + this.anInt5380;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method4667(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass164_Sub2_10.method5414()) {
			throw new IllegalStateException();
		}
		this.method4686(arg0, arg1, arg2, arg3, arg4, arg5);
		Static58.anInt5396 = arg7;
		if (arg6 != 0) {
			Static58.anInt5397 = arg7 >>> 24;
			Static58.anInt5398 = 256 - Static58.anInt5397;
			if (arg6 == 1) {
				Static58.anInt5392 = arg7 >> 16 & 0xFF;
				Static58.anInt5401 = arg7 >> 8 & 0xFF;
				Static58.anInt5406 = arg7 & 0xFF;
			} else {
				Static58.anInt5382 = arg7 >>> 24;
				Static58.anInt5394 = 256 - Static58.anInt5382;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static58.anInt5394 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static58.anInt5394 & 0xFF0000;
				Static58.anInt5399 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method4687(0);
		} else if (arg6 == 1) {
			this.method4687(1);
		} else if (arg6 == 2) {
			this.method4687(2);
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "()I")
	@Override
	public final int method4682() {
		return this.anInt5400 + this.anInt5388 + this.anInt5386;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method4677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
	public abstract void method4671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method4666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass164_Sub2_10.method5414()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray630 == null) {
			this.anIntArray630 = new int[4];
		}
		this.aClass164_Sub2_10.method5353(this.anIntArray630);
		this.aClass164_Sub2_10.method5385(this.aClass164_Sub2_10.anInt6174, this.aClass164_Sub2_10.anInt6169, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method4682();
		@Pc(40) int local40 = this.method4673();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method4671(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass164_Sub2_10.method5313(this.anIntArray630[0], this.anIntArray630[1], this.anIntArray630[2], this.anIntArray630[3]);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IILclient!us;II)V")
	public abstract void method4675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!db", name = "b", descriptor = "()I")
	@Override
	public final int method4681() {
		return this.anInt5381;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method4672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5400 = arg0;
		this.anInt5403 = arg1;
		this.anInt5386 = arg2;
		this.anInt5380 = arg3;
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "()I")
	@Override
	public final int method4685() {
		return this.anInt5388;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([I[III)V")
	protected abstract void method4688(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(FFFFFFLclient!us;II)V")
	@Override
	protected final void method4684(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class34 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass164_Sub2_10.method5414()) {
			throw new IllegalStateException();
		}
		this.method4686(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class34_Sub1 local18 = (Class34_Sub1) arg6;
		this.method4688(local18.anIntArray114, local18.anIntArray113, Static58.anInt5387 - arg7, -arg8 - (Static58.anInt5377 - Static58.anInt5390));
	}
}
