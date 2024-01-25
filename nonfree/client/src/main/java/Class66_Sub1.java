import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public abstract class Class66_Sub1 extends Class66 {

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
	public int anInt9662;

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
	public int anInt9668;

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
	public int anInt9673;

	@OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
	public int anInt9677;

	@OriginalMember(owner = "client!dt", name = "t", descriptor = "[I")
	private int[] anIntArray832;

	@OriginalMember(owner = "client!dt", name = "v", descriptor = "Lclient!uq;")
	protected final Class9_Sub1 aClass9_Sub1_17;

	@OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
	public final int anInt9679;

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
	public final int anInt9660;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!uq;II)V")
	protected Class66_Sub1(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass9_Sub1_17 = arg0;
		this.anInt9679 = arg1;
		this.anInt9660 = arg2;
	}

	@OriginalMember(owner = "client!dt", name = "AA", descriptor = "()I")
	@Override
	public final int AA() {
		return this.anInt9662 + this.anInt9679 + this.anInt9677;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(II)V")
	protected abstract void method8070(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILclient!fa;II)V")
	public abstract void method8063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dt", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public final void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass9_Sub1_17.method1651()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray832 == null) {
			this.anIntArray832 = new int[4];
		}
		this.aClass9_Sub1_17.A(this.anIntArray832);
		this.aClass9_Sub1_17.Q(this.aClass9_Sub1_17.anInt1813, this.aClass9_Sub1_17.anInt1815, arg0 + arg2, arg1 + arg3);
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
		this.aClass9_Sub1_17.ca(this.anIntArray832[0], this.anIntArray832[1], this.anIntArray832[2], this.anIntArray832[3]);
	}

	@OriginalMember(owner = "client!dt", name = "I", descriptor = "(IIIII)V")
	public abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dt", name = "QA", descriptor = "()I")
	@Override
	public final int QA() {
		return this.anInt9679;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "()I")
	@Override
	public final int b() {
		return this.anInt9660;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method8071(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt9662 + this.anInt9679 + this.anInt9677;
		@Pc(17) int local17 = this.anInt9673 + this.anInt9660 + this.anInt9668;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt9679 || local17 != this.anInt9660) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt9673;
			local65 = local53 * (float) this.anInt9673;
			local71 = local32 * (float) this.anInt9662;
			local77 = local39 * (float) this.anInt9662;
			@Pc(84) float local84 = -local32 * (float) this.anInt9677;
			@Pc(91) float local91 = -local39 * (float) this.anInt9677;
			@Pc(98) float local98 = -local46 * (float) this.anInt9668;
			@Pc(105) float local105 = -local53 * (float) this.anInt9668;
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
		if (local46 < (float) this.aClass9_Sub1_17.anInt1813) {
			local46 = this.aClass9_Sub1_17.anInt1813;
		}
		if (local53 > (float) this.aClass9_Sub1_17.anInt1821) {
			local53 = this.aClass9_Sub1_17.anInt1821;
		}
		if (local59 < (float) this.aClass9_Sub1_17.anInt1815) {
			local59 = this.aClass9_Sub1_17.anInt1815;
		}
		if (local65 > (float) this.aClass9_Sub1_17.anInt1830) {
			local65 = this.aClass9_Sub1_17.anInt1830;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static102.anInt9664 = this.aClass9_Sub1_17.anInt1832;
		Static102.anInt9687 = (int) ((float) ((int) local59 * Static102.anInt9664) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static102.anInt9661 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt9679 / local71);
		Static102.anInt9663 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt9660 / local77);
		Static102.anInt9667 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt9679 / local77);
		Static102.anInt9685 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt9660 / local71);
		Static102.anInt9682 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static102.anInt9666 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static102.anInt9659 = (this.anInt9679 >> 1 << 12) + (Static102.anInt9666 * Static102.anInt9667 >> 4);
		Static102.anInt9684 = (this.anInt9660 >> 1 << 12) + (Static102.anInt9666 * Static102.anInt9685 >> 4);
		Static102.anInt9670 = Static102.anInt9682 * Static102.anInt9661 >> 4;
		Static102.anInt9676 = Static102.anInt9682 * Static102.anInt9663 >> 4;
		Static102.anInt9686 = (int) local46;
		Static102.anInt9675 = (int) local53;
		Static102.anInt9674 = (int) local59;
		Static102.anInt9680 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!dt", name = "KA", descriptor = "(IIIIIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dt", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9662 = arg0;
		this.anInt9673 = arg1;
		this.anInt9677 = arg2;
		this.anInt9668 = arg3;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "([I[III)V")
	protected abstract void method8072(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "()I")
	@Override
	public final int a() {
		return this.anInt9673 + this.anInt9660 + this.anInt9668;
	}

	@OriginalMember(owner = "client!dt", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass9_Sub1_17.method1651()) {
			throw new IllegalStateException();
		} else if (this.method8071(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static102.anInt9681 = arg7;
			if (arg6 != 1) {
				Static102.anInt9669 = arg7 >>> 24;
				Static102.anInt9671 = 256 - Static102.anInt9669;
				if (arg6 == 0) {
					Static102.anInt9683 = arg7 >> 16 & 0xFF;
					Static102.anInt9688 = arg7 >> 8 & 0xFF;
					Static102.anInt9689 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static102.anInt9672 = arg7 >>> 24;
					Static102.anInt9678 = 256 - Static102.anInt9672;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static102.anInt9678 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static102.anInt9678 & 0xFF0000;
					Static102.anInt9665 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method8070(1);
			} else if (arg6 == 0) {
				this.method8070(0);
			} else if (arg6 == 3) {
				this.method8070(3);
			} else if (arg6 == 2) {
				this.method8070(2);
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected final void method8064(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class19 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass9_Sub1_17.method1651()) {
			throw new IllegalStateException();
		} else if (this.method8071(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class19_Sub1 local20 = (Class19_Sub1) arg6;
			this.method8072(local20.anIntArray55, local20.anIntArray54, Static102.anInt9686 - arg7, -arg8 - (Static102.anInt9680 - Static102.anInt9674));
		}
	}
}
