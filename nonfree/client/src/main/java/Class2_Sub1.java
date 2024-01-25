import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
	protected int anInt4571;

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "[I")
	private int[] anIntArray308;

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
	protected int anInt4584;

	@OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
	protected int anInt4586;

	@OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
	protected int anInt4595;

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "Lclient!vq;")
	protected final Class167_Sub2 aClass167_Sub2_6;

	@OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
	protected final int anInt4593;

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
	protected final int anInt4587;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!vq;II)V")
	protected Class2_Sub1(@OriginalArg(0) Class167_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass167_Sub2_6 = arg0;
		this.anInt4593 = arg1;
		this.anInt4587 = arg2;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)V")
	protected abstract void method3802(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILclient!i;II)V")
	public abstract void method5833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!nf", name = "ta", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void ta(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass167_Sub2_6.method6037()) {
			throw new IllegalStateException();
		} else if (this.method3804(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static274.anInt4572 = arg7;
			if (arg6 != 1) {
				Static274.anInt4590 = arg7 >>> 24;
				Static274.anInt4575 = 256 - Static274.anInt4590;
				if (arg6 == 0) {
					Static274.anInt4589 = arg7 >> 16 & 0xFF;
					Static274.anInt4579 = arg7 >> 8 & 0xFF;
					Static274.anInt4574 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static274.anInt4583 = arg7 >>> 24;
					Static274.anInt4580 = 256 - Static274.anInt4583;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static274.anInt4580 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static274.anInt4580 & 0xFF0000;
					Static274.anInt4596 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method3802(1);
			} else if (arg6 == 0) {
				this.method3802(0);
			} else if (arg6 == 3) {
				this.method3802(3);
			} else if (arg6 == 2) {
				this.method3802(2);
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "TA", descriptor = "()I")
	@Override
	public final int TA() {
		return this.anInt4593;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFFFLclient!i;II)V")
	@Override
	protected final void method5836(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class14 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass167_Sub2_6.method6037()) {
			throw new IllegalStateException();
		} else if (this.method3804(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class14_Sub2 local20 = (Class14_Sub2) arg6;
			this.method3803(local20.anIntArray405, local20.anIntArray404, Static274.anInt4568 - arg7, -arg8 - (Static274.anInt4569 - Static274.anInt4585));
		}
	}

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "(IIII)V")
	@Override
	public final void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4571 = arg0;
		this.anInt4586 = arg1;
		this.anInt4595 = arg2;
		this.anInt4584 = arg3;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([I[III)V")
	protected abstract void method3803(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method3804(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt4571 + this.anInt4593 + this.anInt4595;
		@Pc(17) int local17 = this.anInt4586 + this.anInt4587 + this.anInt4584;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt4593 || local17 != this.anInt4587) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt4586;
			local65 = local53 * (float) this.anInt4586;
			local71 = local32 * (float) this.anInt4571;
			local77 = local39 * (float) this.anInt4571;
			@Pc(84) float local84 = -local32 * (float) this.anInt4595;
			@Pc(91) float local91 = -local39 * (float) this.anInt4595;
			@Pc(98) float local98 = -local46 * (float) this.anInt4584;
			@Pc(105) float local105 = -local53 * (float) this.anInt4584;
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
		if (local46 < (float) this.aClass167_Sub2_6.anInt7391) {
			local46 = this.aClass167_Sub2_6.anInt7391;
		}
		if (local53 > (float) this.aClass167_Sub2_6.anInt7401) {
			local53 = this.aClass167_Sub2_6.anInt7401;
		}
		if (local59 < (float) this.aClass167_Sub2_6.anInt7373) {
			local59 = this.aClass167_Sub2_6.anInt7373;
		}
		if (local65 > (float) this.aClass167_Sub2_6.anInt7382) {
			local65 = this.aClass167_Sub2_6.anInt7382;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static274.anInt4573 = this.aClass167_Sub2_6.anInt7376;
		Static274.anInt4578 = (int) ((float) ((int) local59 * Static274.anInt4573) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static274.anInt4576 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt4593 / local71);
		Static274.anInt4597 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt4587 / local77);
		Static274.anInt4581 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt4593 / local77);
		Static274.anInt4588 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt4587 / local71);
		Static274.anInt4594 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static274.anInt4592 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static274.anInt4591 = (this.anInt4593 >> 1 << 12) + (Static274.anInt4592 * Static274.anInt4581 >> 4);
		Static274.anInt4577 = (this.anInt4587 >> 1 << 12) + (Static274.anInt4592 * Static274.anInt4588 >> 4);
		Static274.anInt4582 = Static274.anInt4594 * Static274.anInt4576 >> 4;
		Static274.anInt4570 = Static274.anInt4594 * Static274.anInt4597 >> 4;
		Static274.anInt4568 = (int) local46;
		Static274.anInt4567 = (int) local53;
		Static274.anInt4585 = (int) local59;
		Static274.anInt4569 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!nf", name = "XA", descriptor = "(IIIIIII)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!nf", name = "V", descriptor = "()I")
	@Override
	public final int V() {
		return this.anInt4587;
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "()I")
	@Override
	public final int d() {
		return this.anInt4571 + this.anInt4593 + this.anInt4595;
	}

	@OriginalMember(owner = "client!nf", name = "PA", descriptor = "(IIIIIII)V")
	@Override
	public final void PA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass167_Sub2_6.method6037()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray308 == null) {
			this.anIntArray308 = new int[4];
		}
		this.aClass167_Sub2_6.p(this.anIntArray308);
		this.aClass167_Sub2_6.IA(this.aClass167_Sub2_6.anInt7391, this.aClass167_Sub2_6.anInt7373, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.d();
		@Pc(40) int local40 = this.ga();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.E(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass167_Sub2_6.w(this.anIntArray308[0], this.anIntArray308[1], this.anIntArray308[2], this.anIntArray308[3]);
	}

	@OriginalMember(owner = "client!nf", name = "E", descriptor = "(IIIII)V")
	public abstract void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!nf", name = "ga", descriptor = "()I")
	@Override
	public final int ga() {
		return this.anInt4586 + this.anInt4587 + this.anInt4584;
	}
}
