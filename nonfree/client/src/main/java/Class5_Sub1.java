import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public abstract class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "[I")
	private int[] anIntArray697;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	protected int anInt5689;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	protected int anInt5699;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
	protected int anInt5706;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	protected int anInt5712;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Lclient!fu;")
	protected final Class82_Sub1 aClass82_Sub1_9;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	protected final int anInt5708;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
	protected final int anInt5700;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!fu;II)V")
	protected Class5_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass82_Sub1_9 = arg0;
		this.anInt5708 = arg1;
		this.anInt5700 = arg2;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V")
	protected abstract void method5007(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "()I")
	@Override
	public final int method4990() {
		return this.anInt5689 + this.anInt5708 + this.anInt5699;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method4989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass82_Sub1_9.method2066()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray697 == null) {
			this.anIntArray697 = new int[4];
		}
		this.aClass82_Sub1_9.method4523(this.anIntArray697);
		this.aClass82_Sub1_9.method4542(this.aClass82_Sub1_9.anInt2101, this.aClass82_Sub1_9.anInt2115, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method4990();
		@Pc(40) int local40 = this.method4992();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5006(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass82_Sub1_9.method4477(this.anIntArray697[0], this.anIntArray697[1], this.anIntArray697[2], this.anIntArray697[3]);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V")
	public abstract void method5006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([I[III)V")
	protected abstract void method5008(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method4998(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass82_Sub1_9.method2066()) {
			throw new IllegalStateException();
		}
		this.method5009(arg0, arg1, arg2, arg3, arg4, arg5);
		Static162.anInt5703 = arg7;
		if (arg6 != 0) {
			Static162.anInt5688 = arg7 >>> 24;
			Static162.anInt5690 = 256 - Static162.anInt5688;
			if (arg6 == 1) {
				Static162.anInt5705 = arg7 >> 16 & 0xFF;
				Static162.anInt5698 = arg7 >> 8 & 0xFF;
				Static162.anInt5686 = arg7 & 0xFF;
			} else {
				Static162.anInt5704 = arg7 >>> 24;
				Static162.anInt5685 = 256 - Static162.anInt5704;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static162.anInt5685 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static162.anInt5685 & 0xFF0000;
				Static162.anInt5707 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method5007(0);
		} else if (arg6 == 1) {
			this.method5007(1);
		} else if (arg6 == 2) {
			this.method5007(2);
		}
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "()I")
	@Override
	public final int method5002() {
		return this.anInt5708;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "()I")
	@Override
	public final int method4992() {
		return this.anInt5706 + this.anInt5700 + this.anInt5712;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(FFFFFF)V")
	private void method5009(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt5689 + this.anInt5708 + this.anInt5699;
		@Pc(17) int local17 = this.anInt5706 + this.anInt5700 + this.anInt5712;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt5708 || local17 != this.anInt5700) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt5706;
			local65 = local53 * (float) this.anInt5706;
			local71 = local32 * (float) this.anInt5689;
			local77 = local39 * (float) this.anInt5689;
			@Pc(84) float local84 = -local32 * (float) this.anInt5699;
			@Pc(91) float local91 = -local39 * (float) this.anInt5699;
			@Pc(98) float local98 = -local46 * (float) this.anInt5712;
			@Pc(105) float local105 = -local53 * (float) this.anInt5712;
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
		if (local46 < (float) this.aClass82_Sub1_9.anInt2101) {
			local46 = this.aClass82_Sub1_9.anInt2101;
		}
		if (local53 > (float) this.aClass82_Sub1_9.anInt2125) {
			local53 = this.aClass82_Sub1_9.anInt2125;
		}
		if (local59 < (float) this.aClass82_Sub1_9.anInt2115) {
			local59 = this.aClass82_Sub1_9.anInt2115;
		}
		if (local65 > (float) this.aClass82_Sub1_9.anInt2112) {
			local65 = this.aClass82_Sub1_9.anInt2112;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static162.anInt5701 = this.aClass82_Sub1_9.anInt2120;
		Static162.anInt5692 = (int) ((float) ((int) local59 * Static162.anInt5701) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static162.anInt5687 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt5708 / local71);
		Static162.anInt5713 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt5700 / local77);
		Static162.anInt5711 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt5708 / local77);
		Static162.anInt5693 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt5700 / local71);
		Static162.anInt5714 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static162.anInt5715 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static162.anInt5694 = (this.anInt5708 >> 1 << 12) + (Static162.anInt5715 * Static162.anInt5711 >> 4);
		Static162.anInt5697 = (this.anInt5700 >> 1 << 12) + (Static162.anInt5715 * Static162.anInt5693 >> 4);
		Static162.anInt5709 = Static162.anInt5714 * Static162.anInt5687 >> 4;
		Static162.anInt5710 = Static162.anInt5714 * Static162.anInt5713 >> 4;
		Static162.anInt5702 = (int) local46;
		Static162.anInt5695 = (int) local53;
		Static162.anInt5691 = (int) local59;
		Static162.anInt5696 = (int) local65;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(FFFFFFLclient!vb;II)V")
	@Override
	protected final void method5001(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class201 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass82_Sub1_9.method2066()) {
			throw new IllegalStateException();
		}
		this.method5009(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class201_Sub1 local18 = (Class201_Sub1) arg6;
		this.method5008(local18.anIntArray685, local18.anIntArray687, Static162.anInt5702 - arg7, -arg8 - (Static162.anInt5696 - Static162.anInt5691));
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method4994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5689 = arg0;
		this.anInt5706 = arg1;
		this.anInt5699 = arg2;
		this.anInt5712 = arg3;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILclient!vb;II)V")
	public abstract void method4995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class201 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "()I")
	@Override
	public final int method4999() {
		return this.anInt5700;
	}
}
