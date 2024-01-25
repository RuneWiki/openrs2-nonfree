import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class9_Sub2_Sub2 extends Class9_Sub2 {

	@OriginalMember(owner = "client!lf", name = "nb", descriptor = "[I")
	public int[] anIntArray380;

	@OriginalMember(owner = "client!lf", name = "qb", descriptor = "I")
	private int anInt5350;

	@OriginalMember(owner = "client!lf", name = "zb", descriptor = "I")
	private int anInt5358;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class9_Sub2_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "()V")
	@Override
	protected void method4648() {
		super.anInt5336 = super.anInt5332 - super.anInt5343;
		super.anInt5334 = super.anInt5330 - super.anInt5318;
		super.anInt5345 = super.anInt5321 - super.anInt5318;
		super.anInt5346 = super.anInt5326 - super.anInt5343;
		for (@Pc(38) int local38 = 0; local38 < super.anInt5333; local38++) {
			@Pc(47) Class105 local47 = ((Class253_Sub2) super.aClass253Array3[local38]).aClass105_2;
			local47.anInt3528 = super.anInt5330 - super.anInt5321;
			local47.anInt3531 = -super.anInt5321 + super.anInt5318;
			local47.anInt3527 = -super.anInt5332 + super.anInt5326;
			local47.anInt3530 = -super.anInt5332 + super.anInt5343;
		}
		@Pc(92) int local92 = super.anInt5332 + super.anInt5321 * super.anInt5320;
		for (@Pc(95) int local95 = super.anInt5321; local95 < super.anInt5330; local95++) {
			for (@Pc(99) int local99 = 0; super.anInt5333 > local99; local99++) {
				((Class253_Sub2) super.aClass253Array3[local99]).aClass105_2.anIntArray278[local95 - super.anInt5321] = local92;
			}
			local92 += super.anInt5320;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	@Override
	public void method7584(@OriginalArg(0) int arg0) {
		super.aClass253Array3[arg0].method7883(null);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class10 method7574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class10_Sub1_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!fd;IIII)Lclient!r;")
	@Override
	public Class19 method7635(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class19_Sub1_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "()V")
	@Override
	public void method7623() {
		@Pc(9) int local9 = this.anIntArray380.length;
		@Pc(15) int local15 = local9 - local9 & 0x7;
		@Pc(17) int local17 = 0;
		while (local17 < local15) {
			this.anIntArray380[local17++] = Integer.MAX_VALUE;
			this.anIntArray380[local17++] = Integer.MAX_VALUE;
			this.anIntArray380[local17++] = Integer.MAX_VALUE;
			this.anIntArray380[local17++] = Integer.MAX_VALUE;
			this.anIntArray380[local17++] = Integer.MAX_VALUE;
			this.anIntArray380[local17++] = Integer.MAX_VALUE;
			this.anIntArray380[local17++] = Integer.MAX_VALUE;
			this.anIntArray380[local17++] = Integer.MAX_VALUE;
		}
		while (local9 > local17) {
			this.anIntArray380[local17++] = Integer.MAX_VALUE;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7595() {
		@Pc(10) Class253_Sub2 local10 = (Class253_Sub2) this.method4655(Thread.currentThread());
		@Pc(13) Class105 local13 = local10.aClass105_2;
		local13.aBoolean219 = false;
		local13.aBoolean220 = true;
		local13.anInt3529 = 0;
		local13.aBoolean221 = false;
		local13.method3173(10, 50, 90, 5, 75, 15, 0, 0, 0, -65536, -65536, -65536);
		local13.aBoolean219 = true;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([Lclient!r;Lclient!rd;Lclient!m;[Lclient!pr;I)V")
	@Override
	public void method7593(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class2_Sub7[] arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class19_Sub1_Sub2[] local9 = new Class19_Sub1_Sub2[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class19_Sub1_Sub2) arg0[local11];
			}
		}
		@Pc(37) Class19_Sub1_Sub2 local37 = Static560.method7292(this, local9);
		local37.method7276(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!pr;I)V")
	@Override
	public void method7578(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class2_Sub7[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method7258(arg1, arg2 == null ? null : arg2[0], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
	@Override
	public void method7596(@OriginalArg(0) int arg0) {
		super.aClass253Array3[arg0].method7883(Thread.currentThread());
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(I)V")
	@Override
	public void method7643(@OriginalArg(0) int arg0) {
		super.anInt5333 = arg0;
		super.aClass253Array3 = new Class253_Sub2[super.anInt5333];
		for (@Pc(15) int local15 = 0; super.anInt5333 > local15; local15++) {
			super.aClass253Array3[local15] = new Class253_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!rk;")
	@Override
	public Class253 method4655(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; super.anInt5333 > local7; local7++) {
			if (arg0 == super.aClass253Array3[local7].aRunnable4) {
				return super.aClass253Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7627(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class1_Sub22 local12 = (Class1_Sub22) super.aClass174_18.method4422((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method7983();
		local12 = Static167.method3277(arg0);
		super.aClass174_18.method4420(local12, (long) arg0.hashCode());
		if (arg0 != super.aCanvas10 || super.aClass12_10 != null) {
			return;
		}
		super.aClass1_Sub22_3 = local12;
		super.anInt5320 = local12.anInt6138;
		super.anInt5339 = local12.anInt6140;
		super.anIntArray379 = local12.anIntArray455;
		this.method4656();
		return;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7634(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aClass1_Sub22_3 = null;
			super.aCanvas10 = null;
			if (super.aClass12_10 != null) {
				return;
			}
			super.anIntArray379 = null;
			this.anInt5358 = this.anInt5350 = 1;
			super.anInt5320 = super.anInt5339 = 1;
			this.method4656();
			return;
		}
		@Pc(14) Class1_Sub22 local14 = (Class1_Sub22) super.aClass174_18.method4422((long) arg0.hashCode());
		if (local14 == null) {
			return;
		}
		super.aCanvas10 = arg0;
		super.aClass1_Sub22_3 = local14;
		if (super.aClass12_10 != null) {
			return;
		}
		super.anInt5320 = local14.anInt6138;
		super.anInt5339 = local14.anInt6140;
		super.anIntArray379 = local14.anIntArray455;
		if (super.anInt5320 != this.anInt5358 || super.anInt5339 != this.anInt5350) {
			this.anInt5358 = super.anInt5320;
			this.anInt5350 = super.anInt5339;
			this.anIntArray380 = new int[this.anInt5350 * this.anInt5358];
		}
		this.method4656();
		return;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class253_Sub2 local10 = (Class253_Sub2) this.method4655(Thread.currentThread());
		@Pc(13) Class105 local13 = local10.aClass105_2;
		@Pc(18) int local18 = arg2 - arg0;
		@Pc(23) int local23 = arg3 - arg1;
		@Pc(30) int local30 = local18 >= 0 ? local18 : -local18;
		@Pc(40) int local40 = local23 < 0 ? -local23 : local23;
		@Pc(42) int local42 = local30;
		if (local30 < local40) {
			local42 = local40;
		}
		if (local42 == 0) {
			return;
		}
		@Pc(59) int local59 = (local18 << 16) / local42;
		local18 += local59 >> 16;
		@Pc(71) int local71 = (local23 << 16) / local42;
		local23 += local71 >> 16;
		if (local59 >= local71) {
			local59 = -local59;
		} else {
			local71 = -local71;
		}
		@Pc(94) int local94 = arg5 * local71 >> 17;
		@Pc(102) int local102 = arg5 * local71 + 1 >> 17;
		@Pc(108) int local108 = arg5 * local59 >> 17;
		@Pc(113) int local113 = arg0 - local13.method3174();
		@Pc(121) int local121 = arg5 * local59 + 1 >> 17;
		@Pc(126) int local126 = arg1 - local13.method3176();
		@Pc(130) int local130 = local94 + local113;
		@Pc(134) int local134 = local113 - local102;
		@Pc(142) int local142 = local113 + local18 - local102;
		@Pc(148) int local148 = local94 + local113 + local18;
		@Pc(152) int local152 = local108 + local126;
		@Pc(157) int local157 = local126 - local121;
		@Pc(165) int local165 = local126 + local23 - local121;
		@Pc(172) int local172 = local23 + local126 + local108;
		local13.anInt3529 = 0;
		local13.aBoolean220 = local130 < 0 || local130 > local13.anInt3527 || local134 < 0 || local134 > local13.anInt3527 || local142 < 0 || local13.anInt3527 < local142;
		local13.method3178(local152, local157, local165, local130, local134, local142, 0, 0, 0, arg4);
		local13.aBoolean220 = local130 < 0 || local13.anInt3527 < local130 || local134 < 0 || local134 > local13.anInt3527 || local148 < 0 || local13.anInt3527 < local148;
		local13.method3178(local152, local165, local172, local130, local142, local148, 0, 0, 0, arg4);
	}

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "()Z")
	@Override
	public boolean method7640() {
		return true;
	}
}
