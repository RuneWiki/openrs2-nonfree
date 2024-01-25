import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class39_Sub1_Sub2 extends Class39_Sub1 {

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class39_Sub1_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface12 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "()V")
	@Override
	protected void method2060() {
		super.anInt2056 = super.anInt2074 - super.anInt2086;
		super.anInt2077 = super.anInt2084 - super.anInt2086;
		super.anInt2069 = super.anInt2061 - super.anInt2073;
		super.anInt2080 = -super.anInt2073 + super.anInt2070;
		for (@Pc(38) int local38 = 0; super.anInt2058 > local38; local38++) {
			@Pc(47) Class128 local47 = ((Class76_Sub2) super.aClass76Array3[local38]).aClass128_2;
			local47.anInt3634 = super.anInt2073 - super.anInt2061;
			local47.anInt3632 = -super.anInt2084 + super.anInt2074;
			local47.anInt3635 = super.anInt2086 - super.anInt2084;
			local47.anInt3631 = -super.anInt2061 + super.anInt2070;
		}
		@Pc(93) int local93 = super.anInt2084 + super.anInt2068 * super.anInt2061;
		for (@Pc(96) int local96 = super.anInt2061; super.anInt2070 > local96; local96++) {
			for (@Pc(100) int local100 = 0; local100 < super.anInt2058; local100++) {
				((Class76_Sub2) super.aClass76Array3[local100]).aClass128_2.anIntArray390[local96 - super.anInt2061] = local93;
			}
			local93 += super.anInt2068;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class75 method6081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class75_Sub2_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6006() {
		@Pc(10) Class76_Sub2 local10 = (Class76_Sub2) this.method2050(Thread.currentThread());
		@Pc(13) Class128 local13 = local10.aClass128_2;
		local13.aBoolean278 = false;
		local13.aBoolean280 = true;
		local13.aBoolean276 = false;
		local13.anInt3633 = 0;
		local13.method3237(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local13.aBoolean278 = true;
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0) {
		super.anInt2058 = arg0;
		super.aClass76Array3 = new Class76_Sub2[super.anInt2058];
		for (@Pc(15) int local15 = 0; super.anInt2058 > local15; local15++) {
			super.aClass76Array3[local15] = new Class76_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
	@Override
	public void method6047(@OriginalArg(0) int arg0) {
		super.aClass76Array3[arg0].method5861(Thread.currentThread());
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!bt;IIII)Lclient!r;")
	@Override
	public Class63 method6011(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class63_Sub1_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class76_Sub2 local10 = (Class76_Sub2) this.method2050(Thread.currentThread());
		@Pc(13) Class128 local13 = local10.aClass128_2;
		@Pc(18) int local18 = arg2 - arg0;
		@Pc(23) int local23 = arg3 - arg1;
		@Pc(33) int local33 = local18 >= 0 ? local18 : -local18;
		@Pc(40) int local40 = local23 < 0 ? -local23 : local23;
		@Pc(42) int local42 = local33;
		if (local40 > local33) {
			local42 = local40;
		}
		if (local42 == 0) {
			return;
		}
		@Pc(60) int local60 = (local18 << 16) / local42;
		local18 += local60 >> 16;
		@Pc(72) int local72 = (local23 << 16) / local42;
		local23 += local72 >> 16;
		if (local60 >= local72) {
			local60 = -local60;
		} else {
			local72 = -local72;
		}
		@Pc(99) int local99 = arg5 * local72 >> 17;
		@Pc(107) int local107 = arg5 * local72 + 1 >> 17;
		@Pc(113) int local113 = local60 * arg5 >> 17;
		@Pc(121) int local121 = arg5 * local60 + 1 >> 17;
		@Pc(126) int local126 = arg0 - local13.method3247();
		@Pc(131) int local131 = arg1 - local13.method3249();
		@Pc(135) int local135 = local126 + local99;
		@Pc(139) int local139 = local126 - local107;
		@Pc(146) int local146 = local126 + local18 - local107;
		@Pc(152) int local152 = local99 + local18 + local126;
		@Pc(156) int local156 = local113 + local131;
		@Pc(161) int local161 = local131 - local121;
		@Pc(168) int local168 = local131 + local23 - local121;
		@Pc(175) int local175 = local113 + local131 + local23;
		local13.anInt3633 = 0;
		local13.aBoolean280 = local135 < 0 || local13.anInt3632 < local135 || local139 < 0 || local139 > local13.anInt3632 || local146 < 0 || local146 > local13.anInt3632;
		local13.method3246(local156, local161, local168, local135, local139, local146, arg4);
		local13.aBoolean280 = local135 < 0 || local13.anInt3632 < local135 || local139 < 0 || local139 > local13.anInt3632 || local152 < 0 || local152 > local13.anInt3632;
		local13.method3246(local156, local168, local175, local135, local146, local152, arg4);
	}

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "()Z")
	@Override
	public boolean method6036() {
		return false;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6051(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas4 = null;
			super.aClass2_Sub21_3 = null;
			if (super.aClass35_14 != null) {
				return;
			}
			super.anIntArray221 = null;
			super.anInt2068 = super.anInt2062 = 1;
			this.method2059();
			return;
		}
		@Pc(14) Class2_Sub21 local14 = (Class2_Sub21) super.aClass127_20.method3205((long) arg0.hashCode());
		if (local14 == null) {
			return;
		}
		super.aClass2_Sub21_3 = local14;
		super.aCanvas4 = arg0;
		if (super.aClass35_14 != null) {
			return;
		}
		super.anInt2062 = local14.anInt9342;
		super.anIntArray221 = local14.anIntArray761;
		super.anInt2068 = local14.anInt9341;
		this.method2059();
		return;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6057(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class2_Sub21 local12 = (Class2_Sub21) super.aClass127_20.method3205((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method7802();
		local12 = Static113.method2225(arg0);
		super.aClass127_20.method3213(local12, (long) arg0.hashCode());
		if (super.aCanvas4 != arg0 || super.aClass35_14 != null) {
			return;
		}
		super.anInt2062 = local12.anInt9342;
		super.anInt2068 = local12.anInt9341;
		super.aClass2_Sub21_3 = local12;
		super.anIntArray221 = local12.anIntArray761;
		this.method2059();
		return;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([Lclient!r;Lclient!oaa;Lclient!m;[Lclient!gr;I)V")
	@Override
	public void method6030(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class6_Sub4[] arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class63_Sub1_Sub1[] local9 = new Class63_Sub1_Sub1[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class63_Sub1_Sub1) arg0[local11];
			}
		}
		@Pc(33) Class63_Sub1_Sub1 local33 = Static549.method1874(this, local9);
		local33.method7730(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!rs;")
	@Override
	public Class76 method2050(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; super.anInt2058 > local7; local7++) {
			if (arg0 == super.aClass76Array3[local7].aRunnable3) {
				return super.aClass76Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!gr;I)V")
	@Override
	public void method6046(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class6_Sub4[] arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class63_Sub1_Sub1[] local9 = new Class63_Sub1_Sub1[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class63_Sub1_Sub1) arg0[local11];
			}
		}
		@Pc(37) Class63_Sub1_Sub1 local37 = Static549.method1874(this, local9);
		local37.method7730(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
	@Override
	public void method6027(@OriginalArg(0) int arg0) {
		super.aClass76Array3[arg0].method5861(null);
	}
}
