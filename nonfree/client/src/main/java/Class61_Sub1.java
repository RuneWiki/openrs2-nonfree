import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public abstract class Class61_Sub1 extends Class61 {

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	protected int anInt7630;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "[I")
	private int[] anIntArray554;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
	protected int anInt7637;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
	protected int anInt7644;

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
	protected int anInt7649;

	@OriginalMember(owner = "client!ld", name = "C", descriptor = "Lclient!ii;")
	protected final Class95_Sub2 aClass95_Sub2_10;

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
	public final int anInt7645;

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
	public final int anInt7636;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!ii;II)V")
	public Class61_Sub1(@OriginalArg(0) Class95_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass95_Sub2_10 = arg0;
		this.anInt7645 = arg1;
		this.anInt7636 = arg2;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass95_Sub2_10.method3303()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray554 == null) {
			this.anIntArray554 = new int[4];
		}
		this.aClass95_Sub2_10.K(this.anIntArray554);
		this.aClass95_Sub2_10.T(this.aClass95_Sub2_10.anInt3859, this.aClass95_Sub2_10.anInt3871, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method6446();
		@Pc(40) int local40 = this.method6438();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method6434(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass95_Sub2_10.KA(this.anIntArray554[0], this.anIntArray554[1], this.anIntArray554[2], this.anIntArray554[3]);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method6449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method6454(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7630 + this.anInt7645 + this.anInt7637;
		@Pc(17) int local17 = this.anInt7649 + this.anInt7636 + this.anInt7644;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7645 || local17 != this.anInt7636) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7649;
			local65 = local53 * (float) this.anInt7649;
			local71 = local32 * (float) this.anInt7630;
			local77 = local39 * (float) this.anInt7630;
			@Pc(84) float local84 = -local32 * (float) this.anInt7637;
			@Pc(91) float local91 = -local39 * (float) this.anInt7637;
			@Pc(98) float local98 = -local46 * (float) this.anInt7644;
			@Pc(105) float local105 = -local53 * (float) this.anInt7644;
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
		if (local46 < (float) this.aClass95_Sub2_10.anInt3859) {
			local46 = this.aClass95_Sub2_10.anInt3859;
		}
		if (local53 > (float) this.aClass95_Sub2_10.anInt3852) {
			local53 = this.aClass95_Sub2_10.anInt3852;
		}
		if (local59 < (float) this.aClass95_Sub2_10.anInt3871) {
			local59 = this.aClass95_Sub2_10.anInt3871;
		}
		if (local65 > (float) this.aClass95_Sub2_10.anInt3879) {
			local65 = this.aClass95_Sub2_10.anInt3879;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static315.anInt7647 = this.aClass95_Sub2_10.anInt3875;
		Static315.anInt7632 = (int) ((float) ((int) local59 * Static315.anInt7647) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static315.anInt7625 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7645 / local71);
		Static315.anInt7651 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7636 / local77);
		Static315.anInt7626 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7645 / local77);
		Static315.anInt7646 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7636 / local71);
		Static315.anInt7639 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static315.anInt7653 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static315.anInt7628 = (this.anInt7645 >> 1 << 12) + (Static315.anInt7653 * Static315.anInt7626 >> 4);
		Static315.anInt7638 = (this.anInt7636 >> 1 << 12) + (Static315.anInt7653 * Static315.anInt7646 >> 4);
		Static315.anInt7631 = Static315.anInt7639 * Static315.anInt7625 >> 4;
		Static315.anInt7648 = Static315.anInt7639 * Static315.anInt7651 >> 4;
		Static315.anInt7640 = (int) local46;
		Static315.anInt7635 = (int) local53;
		Static315.anInt7634 = (int) local59;
		Static315.anInt7650 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method6436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7630 = arg0;
		this.anInt7649 = arg1;
		this.anInt7637 = arg2;
		this.anInt7644 = arg3;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method6433(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass95_Sub2_10.method3303()) {
			throw new IllegalStateException();
		} else if (this.method6454(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub1 local20 = (Class1_Sub1) arg6;
			this.method6455(local20.anIntArray118, local20.anIntArray119, Static315.anInt7640 - arg7, -arg8 - (Static315.anInt7650 - Static315.anInt7634));
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "()I")
	@Override
	public final int method6446() {
		return this.anInt7630 + this.anInt7645 + this.anInt7637;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method6453(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass95_Sub2_10.method3303()) {
			throw new IllegalStateException();
		} else if (this.method6454(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static315.anInt7654 = arg7;
			if (arg6 != 1) {
				Static315.anInt7641 = arg7 >>> 24;
				Static315.anInt7627 = 256 - Static315.anInt7641;
				if (arg6 == 0) {
					Static315.anInt7642 = arg7 >> 16 & 0xFF;
					Static315.anInt7633 = arg7 >> 8 & 0xFF;
					Static315.anInt7624 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static315.anInt7629 = arg7 >>> 24;
					Static315.anInt7643 = 256 - Static315.anInt7629;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static315.anInt7643 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static315.anInt7643 & 0xFF0000;
					Static315.anInt7652 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method6456(1);
			} else if (arg6 == 0) {
				this.method6456(0);
			} else if (arg6 == 3) {
				this.method6456(3);
			} else if (arg6 == 2) {
				this.method6456(2);
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "()I")
	@Override
	public final int method6445() {
		return this.anInt7645;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([I[III)V")
	protected abstract void method6455(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "()I")
	@Override
	public final int method6447() {
		return this.anInt7636;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
	public abstract void method6434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "()I")
	@Override
	public final int method6438() {
		return this.anInt7649 + this.anInt7636 + this.anInt7644;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method6437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)V")
	protected abstract void method6456(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method6457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);
}
