import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public abstract class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
	protected int anInt7465;

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
	protected int anInt7468;

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
	protected int anInt7475;

	@OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
	protected int anInt7483;

	@OriginalMember(owner = "client!wr", name = "F", descriptor = "[I")
	private int[] anIntArray562;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "Lclient!in;")
	protected final Class121_Sub1 aClass121_Sub1_11;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
	protected final int anInt7458;

	@OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
	protected final int anInt7479;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!in;II)V")
	protected Class78_Sub1(@OriginalArg(0) Class121_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass121_Sub1_11 = arg0;
		this.anInt7458 = arg1;
		this.anInt7479 = arg2;
	}

	@OriginalMember(owner = "client!wr", name = "YA", descriptor = "(IIIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!wr", name = "M", descriptor = "(IIIIIII)V")
	public abstract void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILclient!ea;II)V")
	public abstract void method6000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "([I[III)V")
	protected abstract void method5768(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!wr", name = "ka", descriptor = "(IIII)V")
	@Override
	public final void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7483 = arg0;
		this.anInt7468 = arg1;
		this.anInt7475 = arg2;
		this.anInt7465 = arg3;
	}

	@OriginalMember(owner = "client!wr", name = "D", descriptor = "(IIIIIII)V")
	@Override
	public final void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass121_Sub1_11.method2731()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray562 == null) {
			this.anIntArray562 = new int[4];
		}
		this.aClass121_Sub1_11.u(this.anIntArray562);
		this.aClass121_Sub1_11.Z(this.aClass121_Sub1_11.anInt3090, this.aClass121_Sub1_11.anInt3085, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.ja();
		@Pc(40) int local40 = this.JA();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.YA(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass121_Sub1_11.pa(this.anIntArray562[0], this.anIntArray562[1], this.anIntArray562[2], this.anIntArray562[3]);
	}

	@OriginalMember(owner = "client!wr", name = "JA", descriptor = "()I")
	@Override
	public final int JA() {
		return this.anInt7468 + this.anInt7479 + this.anInt7465;
	}

	@OriginalMember(owner = "client!wr", name = "qa", descriptor = "()I")
	@Override
	public final int qa() {
		return this.anInt7479;
	}

	@OriginalMember(owner = "client!wr", name = "ja", descriptor = "()I")
	@Override
	public final int ja() {
		return this.anInt7483 + this.anInt7458 + this.anInt7475;
	}

	@OriginalMember(owner = "client!wr", name = "aa", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass121_Sub1_11.method2731()) {
			throw new IllegalStateException();
		}
		this.method5769(arg0, arg1, arg2, arg3, arg4, arg5);
		Static450.anInt7484 = arg7;
		if (arg6 != 1) {
			Static450.anInt7478 = arg7 >>> 24;
			Static450.anInt7481 = 256 - Static450.anInt7478;
			if (arg6 == 0) {
				Static450.anInt7466 = arg7 >> 16 & 0xFF;
				Static450.anInt7470 = arg7 >> 8 & 0xFF;
				Static450.anInt7457 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static450.anInt7471 = arg7 >>> 24;
				Static450.anInt7480 = 256 - Static450.anInt7471;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static450.anInt7480 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static450.anInt7480 & 0xFF0000;
				Static450.anInt7463 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method5770(1);
		} else if (arg6 == 0) {
			this.method5770(0);
		} else if (arg6 == 3) {
			this.method5770(3);
		} else if (arg6 == 2) {
			this.method5770(2);
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(FFFFFF)V")
	private void method5769(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7483 + this.anInt7458 + this.anInt7475;
		@Pc(17) int local17 = this.anInt7468 + this.anInt7479 + this.anInt7465;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7458 || local17 != this.anInt7479) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7468;
			local65 = local53 * (float) this.anInt7468;
			local71 = local32 * (float) this.anInt7483;
			local77 = local39 * (float) this.anInt7483;
			@Pc(84) float local84 = -local32 * (float) this.anInt7475;
			@Pc(91) float local91 = -local39 * (float) this.anInt7475;
			@Pc(98) float local98 = -local46 * (float) this.anInt7465;
			@Pc(105) float local105 = -local53 * (float) this.anInt7465;
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
		if (local46 < (float) this.aClass121_Sub1_11.anInt3090) {
			local46 = this.aClass121_Sub1_11.anInt3090;
		}
		if (local53 > (float) this.aClass121_Sub1_11.anInt3098) {
			local53 = this.aClass121_Sub1_11.anInt3098;
		}
		if (local59 < (float) this.aClass121_Sub1_11.anInt3085) {
			local59 = this.aClass121_Sub1_11.anInt3085;
		}
		if (local65 > (float) this.aClass121_Sub1_11.anInt3069) {
			local65 = this.aClass121_Sub1_11.anInt3069;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static450.anInt7476 = this.aClass121_Sub1_11.anInt3087;
		Static450.anInt7482 = (int) ((float) ((int) local59 * Static450.anInt7476) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static450.anInt7469 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7458 / local71);
		Static450.anInt7467 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7479 / local77);
		Static450.anInt7474 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7458 / local77);
		Static450.anInt7455 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7479 / local71);
		Static450.anInt7459 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static450.anInt7454 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static450.anInt7473 = (this.anInt7458 >> 1 << 12) + (Static450.anInt7454 * Static450.anInt7474 >> 4);
		Static450.anInt7461 = (this.anInt7479 >> 1 << 12) + (Static450.anInt7454 * Static450.anInt7455 >> 4);
		Static450.anInt7460 = Static450.anInt7459 * Static450.anInt7469 >> 4;
		Static450.anInt7477 = Static450.anInt7459 * Static450.anInt7467 >> 4;
		Static450.anInt7464 = (int) local46;
		Static450.anInt7472 = (int) local53;
		Static450.anInt7462 = (int) local59;
		Static450.anInt7456 = (int) local65;
	}

	@OriginalMember(owner = "client!wr", name = "UA", descriptor = "()I")
	@Override
	public final int UA() {
		return this.anInt7458;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(FFFFFFLclient!ea;II)V")
	@Override
	protected final void method6008(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class34 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass121_Sub1_11.method2731()) {
			throw new IllegalStateException();
		}
		this.method5769(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class34_Sub1 local18 = (Class34_Sub1) arg6;
		this.method5768(local18.anIntArray37, local18.anIntArray38, Static450.anInt7464 - arg7, -arg8 - (Static450.anInt7456 - Static450.anInt7462));
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(II)V")
	protected abstract void method5770(@OriginalArg(0) int arg0);
}
