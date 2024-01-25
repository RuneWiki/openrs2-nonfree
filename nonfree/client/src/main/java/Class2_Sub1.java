import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
	protected int anInt2756;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
	protected int anInt2757;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
	protected int anInt2763;

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
	protected int anInt2767;

	@OriginalMember(owner = "client!ph", name = "A", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "Lclient!kd;")
	protected final Class46_Sub1 aClass46_Sub1_7;

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
	protected final int anInt2772;

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
	protected final int anInt2774;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!kd;II)V")
	protected Class2_Sub1(@OriginalArg(0) Class46_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass46_Sub1_7 = arg0;
		this.anInt2772 = arg1;
		this.anInt2774 = arg2;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "()I")
	@Override
	public final int method2627() {
		return this.anInt2763 + this.anInt2774 + this.anInt2757;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)V")
	protected abstract void method2645(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(FFFFFF)V")
	private void method2646(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt2767 + this.anInt2772 + this.anInt2756;
		@Pc(17) int local17 = this.anInt2763 + this.anInt2774 + this.anInt2757;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt2772 || local17 != this.anInt2774) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt2763;
			local65 = local53 * (float) this.anInt2763;
			local71 = local32 * (float) this.anInt2767;
			local77 = local39 * (float) this.anInt2767;
			@Pc(84) float local84 = -local32 * (float) this.anInt2756;
			@Pc(91) float local91 = -local39 * (float) this.anInt2756;
			@Pc(98) float local98 = -local46 * (float) this.anInt2757;
			@Pc(105) float local105 = -local53 * (float) this.anInt2757;
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
		if (local46 < (float) this.aClass46_Sub1_7.anInt3390) {
			local46 = this.aClass46_Sub1_7.anInt3390;
		}
		if (local53 > (float) this.aClass46_Sub1_7.anInt3394) {
			local53 = this.aClass46_Sub1_7.anInt3394;
		}
		if (local59 < (float) this.aClass46_Sub1_7.anInt3374) {
			local59 = this.aClass46_Sub1_7.anInt3374;
		}
		if (local65 > (float) this.aClass46_Sub1_7.anInt3372) {
			local65 = this.aClass46_Sub1_7.anInt3372;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static246.anInt2773 = this.aClass46_Sub1_7.lb;
		Static246.anInt2755 = (int) ((float) ((int) local59 * Static246.anInt2773) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static246.anInt2749 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt2772 / local71);
		Static246.anInt2764 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt2774 / local77);
		Static246.anInt2765 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt2772 / local77);
		Static246.anInt2750 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt2774 / local71);
		Static246.anInt2753 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static246.anInt2762 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static246.anInt2777 = (this.anInt2772 >> 1 << 12) + (Static246.anInt2762 * Static246.anInt2765 >> 4);
		Static246.anInt2761 = (this.anInt2774 >> 1 << 12) + (Static246.anInt2762 * Static246.anInt2750 >> 4);
		Static246.anInt2768 = Static246.anInt2753 * Static246.anInt2749 >> 4;
		Static246.anInt2770 = Static246.anInt2753 * Static246.anInt2764 >> 4;
		Static246.anInt2776 = (int) local46;
		Static246.anInt2778 = (int) local53;
		Static246.anInt2771 = (int) local59;
		Static246.anInt2769 = (int) local65;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method2638(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass46_Sub1_7.method3211()) {
			throw new IllegalStateException();
		}
		this.method2646(arg0, arg1, arg2, arg3, arg4, arg5);
		Static246.anInt2759 = arg7;
		if (arg6 != 0) {
			Static246.anInt2748 = arg7 >>> 24;
			Static246.anInt2760 = 256 - Static246.anInt2748;
			if (arg6 == 1) {
				Static246.anInt2758 = arg7 >> 16 & 0xFF;
				Static246.anInt2775 = arg7 >> 8 & 0xFF;
				Static246.anInt2751 = arg7 & 0xFF;
			} else {
				Static246.anInt2754 = arg7 >>> 24;
				Static246.anInt2766 = 256 - Static246.anInt2754;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static246.anInt2766 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static246.anInt2766 & 0xFF0000;
				Static246.anInt2752 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method2645(0);
		} else if (arg6 == 1) {
			this.method2645(1);
		} else if (arg6 == 2) {
			this.method2645(2);
		}
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "()I")
	@Override
	public final int method2640() {
		return this.anInt2774;
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "()I")
	@Override
	public final int method2639() {
		return this.anInt2772;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method2634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2767 = arg0;
		this.anInt2763 = arg1;
		this.anInt2756 = arg2;
		this.anInt2757 = arg3;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method2637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILclient!q;II)V")
	public abstract void method2636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class156 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(FFFFFFLclient!q;II)V")
	@Override
	protected final void method2635(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class156 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass46_Sub1_7.method3211()) {
			throw new IllegalStateException();
		}
		this.method2646(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class156_Sub2 local18 = (Class156_Sub2) arg6;
		this.method2647(local18.anIntArray399, local18.anIntArray398, Static246.anInt2776 - arg7, -arg8 - (Static246.anInt2769 - Static246.anInt2771));
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)V")
	public abstract void method2643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method2641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass46_Sub1_7.method3211()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray239 == null) {
			this.anIntArray239 = new int[4];
		}
		this.aClass46_Sub1_7.method5133(this.anIntArray239);
		this.aClass46_Sub1_7.method5107(this.aClass46_Sub1_7.anInt3390, this.aClass46_Sub1_7.anInt3374, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method2630();
		@Pc(40) int local40 = this.method2627();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method2643(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass46_Sub1_7.method5172(this.anIntArray239[0], this.anIntArray239[1], this.anIntArray239[2], this.anIntArray239[3]);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "([I[III)V")
	protected abstract void method2647(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "()I")
	@Override
	public final int method2630() {
		return this.anInt2767 + this.anInt2772 + this.anInt2756;
	}
}
