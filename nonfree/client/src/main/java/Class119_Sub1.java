import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public abstract class Class119_Sub1 extends Class119 {

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "I")
	protected int anInt4488;

	@OriginalMember(owner = "client!hea", name = "h", descriptor = "I")
	protected int anInt4495;

	@OriginalMember(owner = "client!hea", name = "i", descriptor = "I")
	protected int anInt4496;

	@OriginalMember(owner = "client!hea", name = "t", descriptor = "I")
	protected int anInt4507;

	@OriginalMember(owner = "client!hea", name = "v", descriptor = "[I")
	private int[] anIntArray414;

	@OriginalMember(owner = "client!hea", name = "w", descriptor = "Lclient!fk;")
	protected final Class5_Sub2 aClass5_Sub2_13;

	@OriginalMember(owner = "client!hea", name = "G", descriptor = "I")
	protected final int anInt4518;

	@OriginalMember(owner = "client!hea", name = "q", descriptor = "I")
	protected final int anInt4504;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!fk;II)V")
	protected Class119_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub2_13 = arg0;
		this.anInt4518 = arg1;
		this.anInt4504 = arg2;
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "()I")
	@Override
	public final int b() {
		return this.anInt4504;
	}

	@OriginalMember(owner = "client!hea", name = "QA", descriptor = "()I")
	@Override
	public final int QA() {
		return this.anInt4518;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IILclient!fa;II)V")
	public abstract void method6677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!hea", name = "I", descriptor = "(IIIII)V")
	public abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!hea", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass5_Sub2_13.method7486()) {
			throw new IllegalStateException();
		} else if (this.method3768(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static177.anInt4502 = arg7;
			if (arg6 != 1) {
				Static177.anInt4505 = arg7 >>> 24;
				Static177.anInt4501 = 256 - Static177.anInt4505;
				if (arg6 == 0) {
					Static177.anInt4499 = arg7 >> 16 & 0xFF;
					Static177.anInt4493 = arg7 >> 8 & 0xFF;
					Static177.anInt4491 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static177.anInt4498 = arg7 >>> 24;
					Static177.anInt4497 = 256 - Static177.anInt4498;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static177.anInt4497 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static177.anInt4497 & 0xFF0000;
					Static177.anInt4511 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method3767(1);
			} else if (arg6 == 0) {
				this.method3767(0);
			} else if (arg6 == 3) {
				this.method3767(3);
			} else if (arg6 == 2) {
				this.method3767(2);
			}
		}
	}

	@OriginalMember(owner = "client!hea", name = "KA", descriptor = "(IIIIIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(II)V")
	protected abstract void method3767(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method3768(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt4496 + this.anInt4518 + this.anInt4495;
		@Pc(17) int local17 = this.anInt4488 + this.anInt4504 + this.anInt4507;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt4518 || local17 != this.anInt4504) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt4488;
			local65 = local53 * (float) this.anInt4488;
			local71 = local32 * (float) this.anInt4496;
			local77 = local39 * (float) this.anInt4496;
			@Pc(84) float local84 = -local32 * (float) this.anInt4495;
			@Pc(91) float local91 = -local39 * (float) this.anInt4495;
			@Pc(98) float local98 = -local46 * (float) this.anInt4507;
			@Pc(105) float local105 = -local53 * (float) this.anInt4507;
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
		if (local46 < (float) this.aClass5_Sub2_13.anInt9064) {
			local46 = this.aClass5_Sub2_13.anInt9064;
		}
		if (local53 > (float) this.aClass5_Sub2_13.anInt9068) {
			local53 = this.aClass5_Sub2_13.anInt9068;
		}
		if (local59 < (float) this.aClass5_Sub2_13.anInt9069) {
			local59 = this.aClass5_Sub2_13.anInt9069;
		}
		if (local65 > (float) this.aClass5_Sub2_13.anInt9049) {
			local65 = this.aClass5_Sub2_13.anInt9049;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static177.anInt4509 = this.aClass5_Sub2_13.anInt9076;
		Static177.anInt4517 = (int) ((float) ((int) local59 * Static177.anInt4509) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static177.anInt4489 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt4518 / local71);
		Static177.anInt4508 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt4504 / local77);
		Static177.anInt4513 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt4518 / local77);
		Static177.anInt4490 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt4504 / local71);
		Static177.anInt4510 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static177.anInt4515 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static177.anInt4503 = (this.anInt4518 >> 1 << 12) + (Static177.anInt4515 * Static177.anInt4513 >> 4);
		Static177.anInt4492 = (this.anInt4504 >> 1 << 12) + (Static177.anInt4515 * Static177.anInt4490 >> 4);
		Static177.anInt4516 = Static177.anInt4510 * Static177.anInt4489 >> 4;
		Static177.anInt4506 = Static177.anInt4510 * Static177.anInt4508 >> 4;
		Static177.anInt4512 = (int) local46;
		Static177.anInt4500 = (int) local53;
		Static177.anInt4514 = (int) local59;
		Static177.anInt4494 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected final void method6672(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class10 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass5_Sub2_13.method7486()) {
			throw new IllegalStateException();
		} else if (this.method3768(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class10_Sub1 local20 = (Class10_Sub1) arg6;
			this.method3769(local20.anIntArray93, local20.anIntArray94, Static177.anInt4512 - arg7, -arg8 - (Static177.anInt4494 - Static177.anInt4514));
		}
	}

	@OriginalMember(owner = "client!hea", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public final void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass5_Sub2_13.method7486()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray414 == null) {
			this.anIntArray414 = new int[4];
		}
		this.aClass5_Sub2_13.A(this.anIntArray414);
		this.aClass5_Sub2_13.Q(this.aClass5_Sub2_13.anInt9064, this.aClass5_Sub2_13.anInt9069, arg0 + arg2, arg1 + arg3);
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
		this.aClass5_Sub2_13.ca(this.anIntArray414[0], this.anIntArray414[1], this.anIntArray414[2], this.anIntArray414[3]);
	}

	@OriginalMember(owner = "client!hea", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4496 = arg0;
		this.anInt4488 = arg1;
		this.anInt4495 = arg2;
		this.anInt4507 = arg3;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "()I")
	@Override
	public final int a() {
		return this.anInt4488 + this.anInt4504 + this.anInt4507;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "([I[III)V")
	protected abstract void method3769(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!hea", name = "AA", descriptor = "()I")
	@Override
	public final int AA() {
		return this.anInt4496 + this.anInt4518 + this.anInt4495;
	}
}
