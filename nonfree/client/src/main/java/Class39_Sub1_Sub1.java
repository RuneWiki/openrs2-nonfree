import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class39_Sub1_Sub1 extends Class39_Sub1 {

	@OriginalMember(owner = "client!cm", name = "tb", descriptor = "[I")
	public int[] anIntArray117;

	@OriginalMember(owner = "client!cm", name = "xb", descriptor = "I")
	private int anInt1454;

	@OriginalMember(owner = "client!cm", name = "Fb", descriptor = "I")
	private int anInt1461;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class39_Sub1_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface12 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class75 method6081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class75_Sub2_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "()Z")
	@Override
	public boolean method6036() {
		return true;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class76_Sub1 local10 = (Class76_Sub1) this.method2050(Thread.currentThread());
		@Pc(13) Class156 local13 = local10.aClass156_1;
		@Pc(17) int local17 = arg2 - arg0;
		@Pc(22) int local22 = arg3 - arg1;
		@Pc(29) int local29 = local17 < 0 ? -local17 : local17;
		@Pc(36) int local36 = local22 < 0 ? -local22 : local22;
		@Pc(38) int local38 = local29;
		if (local29 < local36) {
			local38 = local36;
		}
		if (local38 == 0) {
			return;
		}
		@Pc(52) int local52 = (local17 << 16) / local38;
		@Pc(58) int local58 = (local22 << 16) / local38;
		local17 += local52 >> 16;
		local22 += local58 >> 16;
		if (local58 <= local52) {
			local52 = -local52;
		} else {
			local58 = -local58;
		}
		@Pc(87) int local87 = local58 * arg5 >> 17;
		@Pc(95) int local95 = local58 * arg5 + 1 >> 17;
		@Pc(101) int local101 = local52 * arg5 >> 17;
		@Pc(106) int local106 = arg0 - local13.method3732();
		@Pc(114) int local114 = arg5 * local52 + 1 >> 17;
		@Pc(119) int local119 = arg1 - local13.method3735();
		@Pc(124) int local124 = local106 + local87;
		@Pc(129) int local129 = local106 - local95;
		@Pc(136) int local136 = local17 + local106 - local95;
		@Pc(142) int local142 = local106 + local17 + local87;
		@Pc(146) int local146 = local119 + local101;
		@Pc(151) int local151 = local119 - local114;
		@Pc(159) int local159 = local119 + local22 - local114;
		@Pc(165) int local165 = local101 + local22 + local119;
		local13.anInt4320 = 0;
		local13.aBoolean329 = local124 < 0 || local124 > local13.anInt4318 || local129 < 0 || local129 > local13.anInt4318 || local136 < 0 || local136 > local13.anInt4318;
		local13.method3741(local146, local151, local159, local124, local129, local136, 0, 0, 0, arg4);
		local13.aBoolean329 = local124 < 0 || local13.anInt4318 < local124 || local129 < 0 || local13.anInt4318 < local129 || local142 < 0 || local13.anInt4318 < local142;
		local13.method3741(local146, local159, local165, local124, local136, local142, 0, 0, 0, arg4);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6006() {
		@Pc(10) Class76_Sub1 local10 = (Class76_Sub1) this.method2050(Thread.currentThread());
		@Pc(13) Class156 local13 = local10.aClass156_1;
		local13.aBoolean329 = true;
		local13.aBoolean328 = false;
		local13.anInt4320 = 0;
		local13.aBoolean327 = false;
		local13.method3744(10, 50, 90, 5, 75, 15, 0, 0, 0, -65536, -65536, -65536);
		local13.aBoolean328 = true;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!gr;I)V")
	@Override
	public void method6046(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class6_Sub4[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method7700(arg1, arg2 == null ? null : arg2[0], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)V")
	@Override
	public void method6027(@OriginalArg(0) int arg0) {
		super.aClass76Array3[arg0].method5861(null);
	}

	@OriginalMember(owner = "client!cm", name = "u", descriptor = "()V")
	@Override
	public void method6056() {
		@Pc(9) int local9 = this.anIntArray117.length;
		@Pc(15) int local15 = local9 - local9 & 0x7;
		@Pc(17) int local17 = 0;
		while (local17 < local15) {
			this.anIntArray117[local17++] = Integer.MAX_VALUE;
			this.anIntArray117[local17++] = Integer.MAX_VALUE;
			this.anIntArray117[local17++] = Integer.MAX_VALUE;
			this.anIntArray117[local17++] = Integer.MAX_VALUE;
			this.anIntArray117[local17++] = Integer.MAX_VALUE;
			this.anIntArray117[local17++] = Integer.MAX_VALUE;
			this.anIntArray117[local17++] = Integer.MAX_VALUE;
			this.anIntArray117[local17++] = Integer.MAX_VALUE;
		}
		while (local9 > local17) {
			this.anIntArray117[local17++] = Integer.MAX_VALUE;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!bt;IIII)Lclient!r;")
	@Override
	public Class63 method6011(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class63_Sub1_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "(I)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0) {
		super.anInt2058 = arg0;
		super.aClass76Array3 = new Class76_Sub1[super.anInt2058];
		for (@Pc(15) int local15 = 0; local15 < super.anInt2058; local15++) {
			super.aClass76Array3[local15] = new Class76_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!rs;")
	@Override
	public Class76 method2050(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; local7 < super.anInt2058; local7++) {
			if (arg0 == super.aClass76Array3[local7].aRunnable3) {
				return super.aClass76Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6051(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aClass2_Sub21_3 = null;
			super.aCanvas4 = null;
			if (super.aClass35_14 == null) {
				this.anInt1461 = this.anInt1454 = 1;
				super.anInt2068 = super.anInt2062 = 1;
				super.anIntArray221 = null;
				this.method2059();
			}
			return;
		}
		@Pc(10) Class2_Sub21 local10 = (Class2_Sub21) super.aClass127_20.method3205((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		super.aClass2_Sub21_3 = local10;
		super.aCanvas4 = arg0;
		if (super.aClass35_14 != null) {
			return;
		}
		super.anIntArray221 = local10.anIntArray761;
		super.anInt2068 = local10.anInt9341;
		super.anInt2062 = local10.anInt9342;
		if (super.anInt2068 != this.anInt1461 || super.anInt2062 != this.anInt1454) {
			this.anInt1461 = super.anInt2068;
			this.anInt1454 = super.anInt2062;
			this.anIntArray117 = new int[this.anInt1454 * this.anInt1461];
		}
		this.method2059();
	}

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6057(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class2_Sub21 local12 = (Class2_Sub21) super.aClass127_20.method3205((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method7802();
		local12 = Static113.method2225(arg0);
		super.aClass127_20.method3213(local12, (long) arg0.hashCode());
		if (arg0 != super.aCanvas4 || super.aClass35_14 != null) {
			return;
		}
		super.anInt2062 = local12.anInt9342;
		super.aClass2_Sub21_3 = local12;
		super.anInt2068 = local12.anInt9341;
		super.anIntArray221 = local12.anIntArray761;
		this.method2059();
		return;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "([Lclient!r;Lclient!oaa;Lclient!m;[Lclient!gr;I)V")
	@Override
	public void method6030(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class6_Sub4[] arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class63_Sub1_Sub2[] local9 = new Class63_Sub1_Sub2[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class63_Sub1_Sub2) arg0[local11];
			}
		}
		@Pc(33) Class63_Sub1_Sub2 local33 = Static560.method7735(this, local9);
		local33.method7730(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!cm", name = "G", descriptor = "()V")
	@Override
	protected void method2060() {
		super.anInt2069 = super.anInt2061 - super.anInt2073;
		super.anInt2056 = super.anInt2074 - super.anInt2086;
		super.anInt2077 = super.anInt2084 - super.anInt2086;
		super.anInt2080 = -super.anInt2073 + super.anInt2070;
		for (@Pc(37) int local37 = 0; local37 < super.anInt2058; local37++) {
			@Pc(46) Class156 local46 = ((Class76_Sub1) super.aClass76Array3[local37]).aClass156_1;
			local46.anInt4318 = -super.anInt2084 + super.anInt2074;
			local46.anInt4319 = -super.anInt2061 + super.anInt2073;
			local46.anInt4322 = super.anInt2070 - super.anInt2061;
			local46.anInt4323 = super.anInt2086 - super.anInt2084;
		}
		@Pc(95) int local95 = super.anInt2084 + super.anInt2061 * super.anInt2068;
		for (@Pc(98) int local98 = super.anInt2061; local98 < super.anInt2070; local98++) {
			for (@Pc(102) int local102 = 0; local102 < super.anInt2058; local102++) {
				((Class76_Sub1) super.aClass76Array3[local102]).aClass156_1.anIntArray421[local98 - super.anInt2061] = local95;
			}
			local95 += super.anInt2068;
		}
	}

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)V")
	@Override
	public void method6047(@OriginalArg(0) int arg0) {
		super.aClass76Array3[arg0].method5861(Thread.currentThread());
	}
}
