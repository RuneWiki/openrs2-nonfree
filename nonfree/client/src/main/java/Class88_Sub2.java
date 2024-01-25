import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public abstract class Class88_Sub2 extends Class88 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	protected int anInt8658;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	protected int anInt8663;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "[I")
	private int[] anIntArray505;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
	protected int anInt8671;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
	protected int anInt8672;

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "Lclient!ve;")
	protected final Class7_Sub3 aClass7_Sub3_10;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	public final int anInt8661;

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
	public final int anInt8678;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!ve;II)V")
	public Class88_Sub2(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass7_Sub3_10 = arg0;
		this.anInt8661 = arg1;
		this.anInt8678 = arg2;
	}

	@OriginalMember(owner = "client!pb", name = "V", descriptor = "(IIIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILclient!ua;II)V")
	public abstract void method8045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!pb", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass7_Sub3_10.method7862()) {
			throw new IllegalStateException();
		} else if (this.method6695(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static391.anInt8664 = arg7;
			if (arg6 != 1) {
				Static391.anInt8667 = arg7 >>> 24;
				Static391.anInt8676 = 256 - Static391.anInt8667;
				if (arg6 == 0) {
					Static391.anInt8674 = arg7 >> 16 & 0xFF;
					Static391.anInt8668 = arg7 >> 8 & 0xFF;
					Static391.anInt8669 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static391.anInt8666 = arg7 >>> 24;
					Static391.anInt8681 = 256 - Static391.anInt8666;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static391.anInt8681 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static391.anInt8681 & 0xFF0000;
					Static391.anInt8677 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method6694(1);
			} else if (arg6 == 0) {
				this.method6694(0);
			} else if (arg6 == 3) {
				this.method6694(3);
			} else if (arg6 == 2) {
				this.method6694(2);
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([I[III)V")
	protected abstract void method6692(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!pb", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8672 = arg0;
		this.anInt8671 = arg1;
		this.anInt8663 = arg2;
		this.anInt8658 = arg3;
	}

	@OriginalMember(owner = "client!pb", name = "YA", descriptor = "(IIIIIIII)V")
	protected abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!pb", name = "ca", descriptor = "()I")
	@Override
	public final int ca() {
		return this.anInt8671 + this.anInt8678 + this.anInt8658;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method6693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!pb", name = "A", descriptor = "()I")
	@Override
	public final int A() {
		return this.anInt8672 + this.anInt8661 + this.anInt8663;
	}

	@OriginalMember(owner = "client!pb", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt8661;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)V")
	protected abstract void method6694(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method6695(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt8672 + this.anInt8661 + this.anInt8663;
		@Pc(17) int local17 = this.anInt8671 + this.anInt8678 + this.anInt8658;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt8661 || local17 != this.anInt8678) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt8671;
			local65 = local53 * (float) this.anInt8671;
			local71 = local32 * (float) this.anInt8672;
			local77 = local39 * (float) this.anInt8672;
			@Pc(84) float local84 = -local32 * (float) this.anInt8663;
			@Pc(91) float local91 = -local39 * (float) this.anInt8663;
			@Pc(98) float local98 = -local46 * (float) this.anInt8658;
			@Pc(105) float local105 = -local53 * (float) this.anInt8658;
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
		if (local46 < (float) this.aClass7_Sub3_10.anInt10108) {
			local46 = this.aClass7_Sub3_10.anInt10108;
		}
		if (local53 > (float) this.aClass7_Sub3_10.anInt10095) {
			local53 = this.aClass7_Sub3_10.anInt10095;
		}
		if (local59 < (float) this.aClass7_Sub3_10.anInt10090) {
			local59 = this.aClass7_Sub3_10.anInt10090;
		}
		if (local65 > (float) this.aClass7_Sub3_10.anInt10113) {
			local65 = this.aClass7_Sub3_10.anInt10113;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static391.anInt8688 = this.aClass7_Sub3_10.anInt10104;
		Static391.anInt8660 = (int) ((float) ((int) local59 * Static391.anInt8688) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static391.anInt8659 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt8661 / local71);
		Static391.anInt8665 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt8678 / local77);
		Static391.anInt8683 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt8661 / local77);
		Static391.anInt8679 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt8678 / local71);
		Static391.anInt8680 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static391.anInt8662 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static391.anInt8682 = (this.anInt8661 >> 1 << 12) + (Static391.anInt8662 * Static391.anInt8683 >> 4);
		Static391.anInt8670 = (this.anInt8678 >> 1 << 12) + (Static391.anInt8662 * Static391.anInt8679 >> 4);
		Static391.anInt8675 = Static391.anInt8680 * Static391.anInt8659 >> 4;
		Static391.anInt8687 = Static391.anInt8680 * Static391.anInt8665 >> 4;
		Static391.anInt8685 = (int) local46;
		Static391.anInt8686 = (int) local53;
		Static391.anInt8684 = (int) local59;
		Static391.anInt8673 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!pb", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass7_Sub3_10.method7862()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray505 == null) {
			this.anIntArray505 = new int[4];
		}
		this.aClass7_Sub3_10.oa(this.anIntArray505);
		this.aClass7_Sub3_10.V(this.aClass7_Sub3_10.anInt10108, this.aClass7_Sub3_10.anInt10090, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.A();
		@Pc(40) int local40 = this.ca();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.V(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass7_Sub3_10.da(this.anIntArray505[0], this.anIntArray505[1], this.anIntArray505[2], this.anIntArray505[3]);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected final void method8048(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class67 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass7_Sub3_10.method7862()) {
			throw new IllegalStateException();
		} else if (this.method6695(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class67_Sub2 local20 = (Class67_Sub2) arg6;
			this.method6692(local20.anIntArray126, local20.anIntArray127, Static391.anInt8685 - arg7, -arg8 - (Static391.anInt8673 - Static391.anInt8684));
		}
	}

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "()I")
	@Override
	public final int u() {
		return this.anInt8678;
	}
}
