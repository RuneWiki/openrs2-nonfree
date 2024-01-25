import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public abstract class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
	protected int anInt2752;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
	protected int anInt2765;

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "I")
	protected int anInt2770;

	@OriginalMember(owner = "client!tr", name = "y", descriptor = "I")
	protected int anInt2773;

	@OriginalMember(owner = "client!tr", name = "A", descriptor = "Lclient!rfa;")
	protected final Class12_Sub3 aClass12_Sub3_6;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
	public final int anInt2757;

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
	public final int anInt2754;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!rfa;II)V")
	public Class10_Sub1(@OriginalArg(0) Class12_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass12_Sub3_6 = arg0;
		this.anInt2757 = arg1;
		this.anInt2754 = arg2;
	}

	@OriginalMember(owner = "client!tr", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass12_Sub3_6.method6486()) {
			throw new IllegalStateException();
		} else if (this.method2345(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static516.anInt2753 = arg7;
			if (arg6 != 1) {
				Static516.anInt2779 = arg7 >>> 24;
				Static516.anInt2759 = 256 - Static516.anInt2779;
				if (arg6 == 0) {
					Static516.anInt2775 = arg7 >> 16 & 0xFF;
					Static516.anInt2767 = arg7 >> 8 & 0xFF;
					Static516.anInt2761 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static516.anInt2774 = arg7 >>> 24;
					Static516.anInt2776 = 256 - Static516.anInt2774;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static516.anInt2776 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static516.anInt2776 & 0xFF0000;
					Static516.anInt2750 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method2344(1);
			} else if (arg6 == 0) {
				this.method2344(0);
			} else if (arg6 == 3) {
				this.method2344(3);
			} else if (arg6 == 2) {
				this.method2344(2);
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "([I[III)V")
	protected abstract void method2342(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected final void method7675(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class200 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass12_Sub3_6.method6486()) {
			throw new IllegalStateException();
		} else if (this.method2345(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class200_Sub2 local20 = (Class200_Sub2) arg6;
			this.method2342(local20.anIntArray464, local20.anIntArray465, Static516.anInt2751 - arg7, -arg8 - (Static516.anInt2772 - Static516.anInt2769));
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method2343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!tr", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2752 = arg0;
		this.anInt2770 = arg1;
		this.anInt2773 = arg2;
		this.anInt2765 = arg3;
	}

	@OriginalMember(owner = "client!tr", name = "V", descriptor = "(IIIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!tr", name = "ca", descriptor = "()I")
	@Override
	public final int ca() {
		return this.anInt2770 + this.anInt2754 + this.anInt2765;
	}

	@OriginalMember(owner = "client!tr", name = "YA", descriptor = "(IIIIIIII)V")
	protected abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!tr", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt2757;
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(II)V")
	protected abstract void method2344(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tr", name = "u", descriptor = "()I")
	@Override
	public final int u() {
		return this.anInt2754;
	}

	@OriginalMember(owner = "client!tr", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass12_Sub3_6.method6486()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray170 == null) {
			this.anIntArray170 = new int[4];
		}
		this.aClass12_Sub3_6.oa(this.anIntArray170);
		this.aClass12_Sub3_6.V(this.aClass12_Sub3_6.anInt7812, this.aClass12_Sub3_6.anInt7798, arg0 + arg2, arg1 + arg3);
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
		this.aClass12_Sub3_6.da(this.anIntArray170[0], this.anIntArray170[1], this.anIntArray170[2], this.anIntArray170[3]);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IILclient!ua;II)V")
	public abstract void method7683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class200 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method2345(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt2752 + this.anInt2757 + this.anInt2773;
		@Pc(17) int local17 = this.anInt2770 + this.anInt2754 + this.anInt2765;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt2757 || local17 != this.anInt2754) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt2770;
			local65 = local53 * (float) this.anInt2770;
			local71 = local32 * (float) this.anInt2752;
			local77 = local39 * (float) this.anInt2752;
			@Pc(84) float local84 = -local32 * (float) this.anInt2773;
			@Pc(91) float local91 = -local39 * (float) this.anInt2773;
			@Pc(98) float local98 = -local46 * (float) this.anInt2765;
			@Pc(105) float local105 = -local53 * (float) this.anInt2765;
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
		if (local46 < (float) this.aClass12_Sub3_6.anInt7812) {
			local46 = this.aClass12_Sub3_6.anInt7812;
		}
		if (local53 > (float) this.aClass12_Sub3_6.anInt7813) {
			local53 = this.aClass12_Sub3_6.anInt7813;
		}
		if (local59 < (float) this.aClass12_Sub3_6.anInt7798) {
			local59 = this.aClass12_Sub3_6.anInt7798;
		}
		if (local65 > (float) this.aClass12_Sub3_6.anInt7820) {
			local65 = this.aClass12_Sub3_6.anInt7820;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static516.anInt2768 = this.aClass12_Sub3_6.anInt7796;
		Static516.anInt2755 = (int) ((float) ((int) local59 * Static516.anInt2768) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static516.anInt2766 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt2757 / local71);
		Static516.anInt2778 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt2754 / local77);
		Static516.anInt2756 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt2757 / local77);
		Static516.anInt2758 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt2754 / local71);
		Static516.anInt2771 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static516.anInt2762 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static516.anInt2777 = (this.anInt2757 >> 1 << 12) + (Static516.anInt2762 * Static516.anInt2756 >> 4);
		Static516.anInt2760 = (this.anInt2754 >> 1 << 12) + (Static516.anInt2762 * Static516.anInt2758 >> 4);
		Static516.anInt2763 = Static516.anInt2771 * Static516.anInt2766 >> 4;
		Static516.anInt2780 = Static516.anInt2771 * Static516.anInt2778 >> 4;
		Static516.anInt2751 = (int) local46;
		Static516.anInt2764 = (int) local53;
		Static516.anInt2769 = (int) local59;
		Static516.anInt2772 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!tr", name = "A", descriptor = "()I")
	@Override
	public final int A() {
		return this.anInt2752 + this.anInt2757 + this.anInt2773;
	}
}
