import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class9_Sub2_Sub1 extends Class9_Sub2 {

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class9_Sub2_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7627(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class1_Sub22 local12 = (Class1_Sub22) super.aClass174_18.method4422((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method7983();
		local12 = Static167.method3277(arg0);
		super.aClass174_18.method4420(local12, (long) arg0.hashCode());
		if (super.aCanvas10 != arg0 || super.aClass12_10 != null) {
			return;
		}
		super.anInt5320 = local12.anInt6138;
		super.anInt5339 = local12.anInt6140;
		super.anIntArray379 = local12.anIntArray455;
		super.aClass1_Sub22_3 = local12;
		this.method4656();
		return;
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	@Override
	public void method7596(@OriginalArg(0) int arg0) {
		super.aClass253Array3[arg0].method7883(Thread.currentThread());
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!pr;I)V")
	@Override
	public void method7578(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class2_Sub7[] arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class19_Sub1_Sub1[] local9 = new Class19_Sub1_Sub1[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class19_Sub1_Sub1) arg0[local11];
			}
		}
		@Pc(37) Class19_Sub1_Sub1 local37 = Static548.method984(this, local9);
		local37.method7276(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7595() {
		@Pc(10) Class253_Sub1 local10 = (Class253_Sub1) this.method4655(Thread.currentThread());
		@Pc(13) Class221 local13 = local10.aClass221_2;
		local13.aBoolean427 = false;
		local13.aBoolean429 = true;
		local13.anInt6421 = 0;
		local13.aBoolean426 = false;
		local13.method5574(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local13.aBoolean427 = true;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!rk;")
	@Override
	public Class253 method4655(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; local7 < super.anInt5333; local7++) {
			if (super.aClass253Array3[local7].aRunnable4 == arg0) {
				return super.aClass253Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([Lclient!r;Lclient!rd;Lclient!m;[Lclient!pr;I)V")
	@Override
	public void method7593(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class2_Sub7[] arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class19_Sub1_Sub1[] local9 = new Class19_Sub1_Sub1[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class19_Sub1_Sub1) arg0[local11];
			}
		}
		@Pc(33) Class19_Sub1_Sub1 local33 = Static548.method984(this, local9);
		local33.method7276(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class253_Sub1 local10 = (Class253_Sub1) this.method4655(Thread.currentThread());
		@Pc(13) Class221 local13 = local10.aClass221_2;
		@Pc(17) int local17 = arg2 - arg0;
		@Pc(22) int local22 = arg3 - arg1;
		@Pc(32) int local32 = local17 >= 0 ? local17 : -local17;
		@Pc(39) int local39 = local22 < 0 ? -local22 : local22;
		@Pc(41) int local41 = local32;
		if (local32 < local39) {
			local41 = local39;
		}
		if (local41 == 0) {
			return;
		}
		@Pc(55) int local55 = (local17 << 16) / local41;
		@Pc(61) int local61 = (local22 << 16) / local41;
		local17 += local55 >> 16;
		local22 += local61 >> 16;
		if (local61 > local55) {
			local61 = -local61;
		} else {
			local55 = -local55;
		}
		@Pc(94) int local94 = local61 * arg5 >> 17;
		@Pc(102) int local102 = arg5 * local61 + 1 >> 17;
		@Pc(108) int local108 = local55 * arg5 >> 17;
		@Pc(113) int local113 = arg0 - local13.method5572();
		@Pc(121) int local121 = arg5 * local55 + 1 >> 17;
		@Pc(126) int local126 = arg1 - local13.method5569();
		@Pc(130) int local130 = local94 + local113;
		@Pc(135) int local135 = local113 - local102;
		@Pc(142) int local142 = local17 + local113 - local102;
		@Pc(148) int local148 = local94 + local113 + local17;
		@Pc(152) int local152 = local126 + local108;
		@Pc(157) int local157 = local126 - local121;
		@Pc(164) int local164 = local126 + local22 - local121;
		@Pc(171) int local171 = local108 + local126 + local22;
		local13.anInt6421 = 0;
		local13.aBoolean429 = local130 < 0 || local130 > local13.anInt6419 || local135 < 0 || local13.anInt6419 < local135 || local142 < 0 || local142 > local13.anInt6419;
		local13.method5582(local152, local157, local164, local130, local135, local142, arg4);
		local13.aBoolean429 = local130 < 0 || local13.anInt6419 < local130 || local135 < 0 || local13.anInt6419 < local135 || local148 < 0 || local13.anInt6419 < local148;
		local13.method5582(local152, local164, local171, local130, local142, local148, arg4);
	}

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)V")
	@Override
	public void method7643(@OriginalArg(0) int arg0) {
		super.anInt5333 = arg0;
		super.aClass253Array3 = new Class253_Sub1[super.anInt5333];
		for (@Pc(15) int local15 = 0; super.anInt5333 > local15; local15++) {
			super.aClass253Array3[local15] = new Class253_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "()V")
	@Override
	protected void method4648() {
		super.anInt5336 = super.anInt5332 - super.anInt5343;
		super.anInt5334 = -super.anInt5318 + super.anInt5330;
		super.anInt5345 = -super.anInt5318 + super.anInt5321;
		super.anInt5346 = super.anInt5326 - super.anInt5343;
		for (@Pc(38) int local38 = 0; local38 < super.anInt5333; local38++) {
			@Pc(47) Class221 local47 = ((Class253_Sub1) super.aClass253Array3[local38]).aClass221_2;
			local47.anInt6424 = super.anInt5318 - super.anInt5321;
			local47.anInt6420 = super.anInt5330 - super.anInt5321;
			local47.anInt6422 = super.anInt5343 - super.anInt5332;
			local47.anInt6419 = -super.anInt5332 + super.anInt5326;
		}
		@Pc(97) int local97 = super.anInt5321 * super.anInt5320 + super.anInt5332;
		for (@Pc(100) int local100 = super.anInt5321; local100 < super.anInt5330; local100++) {
			for (@Pc(104) int local104 = 0; super.anInt5333 > local104; local104++) {
				((Class253_Sub1) super.aClass253Array3[local104]).aClass221_2.anIntArray482[local100 - super.anInt5321] = local97;
			}
			local97 += super.anInt5320;
		}
	}

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "()Z")
	@Override
	public boolean method7640() {
		return false;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class10 method7574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class10_Sub1_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	@Override
	public void method7584(@OriginalArg(0) int arg0) {
		super.aClass253Array3[arg0].method7883(null);
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7634(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas10 = null;
			super.aClass1_Sub22_3 = null;
			if (super.aClass12_10 != null) {
				return;
			}
			super.anIntArray379 = null;
			super.anInt5320 = super.anInt5339 = 1;
			this.method4656();
			return;
		}
		@Pc(14) Class1_Sub22 local14 = (Class1_Sub22) super.aClass174_18.method4422((long) arg0.hashCode());
		if (local14 == null) {
			return;
		}
		super.aClass1_Sub22_3 = local14;
		super.aCanvas10 = arg0;
		if (super.aClass12_10 != null) {
			return;
		}
		super.anInt5339 = local14.anInt6140;
		super.anInt5320 = local14.anInt6138;
		super.anIntArray379 = local14.anIntArray455;
		this.method4656();
		return;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!fd;IIII)Lclient!r;")
	@Override
	public Class19 method7635(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class19_Sub1_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}
}
