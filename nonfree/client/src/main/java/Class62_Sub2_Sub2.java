import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class62_Sub2_Sub2 extends Class62_Sub2 {

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class62_Sub2_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!vf", name = "B", descriptor = "()Z")
	@Override
	public boolean method7062() {
		return false;
	}

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "(I)V")
	@Override
	public void method7060(@OriginalArg(0) int arg0) {
		super.aClass178Array3[arg0].method5645(null);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
	@Override
	public void method6997(@OriginalArg(0) int arg0) {
		super.anInt8686 = arg0;
		super.aClass178Array3 = new Class178_Sub2[super.anInt8686];
		for (@Pc(15) int local15 = 0; local15 < super.anInt8686; local15++) {
			super.aClass178Array3[local15] = new Class178_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class131 method7051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class131_Sub2_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7038(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class5_Sub34 local12 = (Class5_Sub34) super.aClass42_39.method1109((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method7425();
		local12 = Static345.method5369(arg0);
		super.aClass42_39.method1106((long) arg0.hashCode(), local12);
		if (super.aCanvas15 != arg0 || super.aClass25_27 != null) {
			return;
		}
		super.aClass5_Sub34_3 = local12;
		super.anInt8683 = local12.anInt7960;
		super.anInt8670 = local12.anInt7959;
		super.anIntArray672 = local12.anIntArray603;
		this.method7081();
		return;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7015(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas15 = null;
			super.aClass5_Sub34_3 = null;
			if (super.aClass25_27 == null) {
				super.anIntArray672 = null;
				super.anInt8670 = super.anInt8683 = 1;
				this.method7081();
			}
			return;
		}
		@Pc(35) Class5_Sub34 local35 = (Class5_Sub34) super.aClass42_39.method1109((long) arg0.hashCode());
		if (local35 == null) {
			return;
		}
		super.aClass5_Sub34_3 = local35;
		super.aCanvas15 = arg0;
		if (super.aClass25_27 != null) {
			return;
		}
		super.anInt8670 = local35.anInt7959;
		super.anInt8683 = local35.anInt7960;
		super.anIntArray672 = local35.anIntArray603;
		this.method7081();
		return;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
	@Override
	public void method7001(@OriginalArg(0) int arg0) {
		super.aClass178Array3[arg0].method5645(Thread.currentThread());
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!kw;")
	@Override
	public Class178 method7071(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; super.anInt8686 > local7; local7++) {
			if (arg0 == super.aClass178Array3[local7].aRunnable3) {
				return super.aClass178Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([Lclient!r;Lclient!sh;Lclient!m;[Lclient!paa;I)V")
	@Override
	public void method7008(@OriginalArg(0) Class36[] arg0, @OriginalArg(1) Class267 arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) Class30_Sub6[] arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class36_Sub1_Sub2[] local9 = new Class36_Sub1_Sub2[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class36_Sub1_Sub2) arg0[local11];
			}
		}
		@Pc(37) Class36_Sub1_Sub2 local37 = Static559.method7389(this, local9);
		local37.method7383(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!ld;IIII)Lclient!r;")
	@Override
	public Class36 method7012(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class36_Sub1_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!paa;I)V")
	@Override
	public void method7019(@OriginalArg(0) Class36[] arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) Class30_Sub6[] arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class36_Sub1_Sub2[] local9 = new Class36_Sub1_Sub2[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class36_Sub1_Sub2) arg0[local11];
			}
		}
		@Pc(37) Class36_Sub1_Sub2 local37 = Static559.method7389(this, local9);
		local37.method7383(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class178_Sub2 local10 = (Class178_Sub2) this.method7071(Thread.currentThread());
		@Pc(13) Class90 local13 = local10.aClass90_1;
		@Pc(18) int local18 = arg2 - arg0;
		@Pc(22) int local22 = arg3 - arg1;
		@Pc(32) int local32 = local18 >= 0 ? local18 : -local18;
		@Pc(42) int local42 = local22 >= 0 ? local22 : -local22;
		@Pc(44) int local44 = local32;
		if (local42 > local32) {
			local44 = local42;
		}
		if (local44 == 0) {
			return;
		}
		@Pc(62) int local62 = (local18 << 16) / local44;
		local18 += local62 >> 16;
		@Pc(74) int local74 = (local22 << 16) / local44;
		local22 += local74 >> 16;
		if (local74 <= local62) {
			local62 = -local62;
		} else {
			local74 = -local74;
		}
		@Pc(97) int local97 = local74 * arg5 >> 17;
		@Pc(105) int local105 = local74 * arg5 + 1 >> 17;
		@Pc(111) int local111 = arg5 * local62 >> 17;
		@Pc(116) int local116 = arg0 - local13.method2308();
		@Pc(124) int local124 = local62 * arg5 + 1 >> 17;
		@Pc(129) int local129 = arg1 - local13.method2300();
		@Pc(133) int local133 = local97 + local116;
		@Pc(138) int local138 = local116 - local105;
		@Pc(145) int local145 = local18 + local116 - local105;
		@Pc(152) int local152 = local18 + local116 + local97;
		@Pc(156) int local156 = local129 + local111;
		@Pc(160) int local160 = local129 - local124;
		@Pc(168) int local168 = local129 + local22 - local124;
		@Pc(174) int local174 = local22 + local129 + local111;
		local13.anInt2573 = 0;
		local13.aBoolean169 = local133 < 0 || local133 > local13.anInt2571 || local138 < 0 || local138 > local13.anInt2571 || local145 < 0 || local13.anInt2571 < local145;
		local13.method2310(local156, local160, local168, local133, local138, local145, arg4);
		local13.aBoolean169 = local133 < 0 || local133 > local13.anInt2571 || local138 < 0 || local13.anInt2571 < local138 || local152 < 0 || local13.anInt2571 < local152;
		local13.method2310(local156, local168, local174, local133, local145, local152, arg4);
	}

	@OriginalMember(owner = "client!vf", name = "E", descriptor = "()V")
	@Override
	protected void method7072() {
		super.lb = super.anInt8673 - super.anInt8676;
		super.anInt8693 = super.anInt8695 - super.anInt8694;
		super.anInt8692 = -super.anInt8694 + super.anInt8672;
		super.anInt8696 = -super.anInt8676 + super.anInt8685;
		for (@Pc(38) int local38 = 0; local38 < super.anInt8686; local38++) {
			@Pc(47) Class90 local47 = ((Class178_Sub2) super.aClass178Array3[local38]).aClass90_1;
			local47.anInt2572 = -super.anInt8695 + super.anInt8672;
			local47.anInt2574 = -super.anInt8695 + super.anInt8694;
			local47.anInt2571 = -super.anInt8673 + super.anInt8685;
			local47.anInt2569 = -super.anInt8673 + super.anInt8676;
		}
		@Pc(94) int local94 = super.anInt8695 * super.anInt8670 + super.anInt8673;
		for (@Pc(97) int local97 = super.anInt8695; local97 < super.anInt8672; local97++) {
			for (@Pc(101) int local101 = 0; local101 < super.anInt8686; local101++) {
				((Class178_Sub2) super.aClass178Array3[local101]).aClass90_1.anIntArray221[local97 - super.anInt8695] = local94;
			}
			local94 += super.anInt8670;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6995() {
		@Pc(10) Class178_Sub2 local10 = (Class178_Sub2) this.method7071(Thread.currentThread());
		@Pc(13) Class90 local13 = local10.aClass90_1;
		local13.aBoolean169 = true;
		local13.aBoolean165 = false;
		local13.aBoolean168 = false;
		local13.anInt2573 = 0;
		local13.method2306(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local13.aBoolean165 = true;
	}
}
