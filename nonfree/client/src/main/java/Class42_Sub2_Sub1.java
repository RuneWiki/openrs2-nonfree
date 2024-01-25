import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class42_Sub2_Sub1 extends Class42_Sub2 {

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class42_Sub2_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface11 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "([Lclient!r;Lclient!hp;Lclient!m;[Lclient!kn;I)V")
	@Override
	public void method5809(@OriginalArg(0) Class26[] arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class7_Sub4[] arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class26_Sub1_Sub2[] local9 = new Class26_Sub1_Sub2[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class26_Sub1_Sub2) arg0[local11];
			}
		}
		@Pc(37) Class26_Sub1_Sub2 local37 = Static552.method2996(this, local9);
		local37.method2993(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5799(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class12_Sub5 local12 = (Class12_Sub5) super.aClass68_43.method1917((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method7967();
		local12 = Static216.method3993(arg0);
		super.aClass68_43.method1916(local12, (long) arg0.hashCode());
		if (arg0 != super.aCanvas10 || super.aClass84_11 != null) {
			return;
		}
		super.anInt5359 = local12.anInt9178;
		super.aClass12_Sub5_3 = local12;
		super.anIntArray375 = local12.anIntArray674;
		super.anInt5343 = local12.anInt9182;
		this.method4541();
		return;
	}

	@OriginalMember(owner = "client!ip", name = "x", descriptor = "()Z")
	@Override
	public boolean method5843() {
		return false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class215 method5796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class215_Sub1_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!kn;I)V")
	@Override
	public void method5860(@OriginalArg(0) Class26[] arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) Class7_Sub4[] arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class26_Sub1_Sub2[] local9 = new Class26_Sub1_Sub2[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class26_Sub1_Sub2) arg0[local11];
			}
		}
		@Pc(37) Class26_Sub1_Sub2 local37 = Static552.method2996(this, local9);
		local37.method2993(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!ch;")
	@Override
	public Class54 method4545(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; local7 < super.anInt5357; local7++) {
			if (super.aClass54Array3[local7].aRunnable3 == arg0) {
				return super.aClass54Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V")
	@Override
	public void method5804(@OriginalArg(0) int arg0) {
		super.aClass54Array3[arg0].method6538(Thread.currentThread());
	}

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "(I)V")
	@Override
	public void method5837(@OriginalArg(0) int arg0) {
		super.aClass54Array3[arg0].method6538(null);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5844() {
		@Pc(10) Class54_Sub1 local10 = (Class54_Sub1) this.method4545(Thread.currentThread());
		@Pc(13) Class300 local13 = local10.aClass300_2;
		local13.aBoolean650 = false;
		local13.aBoolean648 = true;
		local13.anInt9116 = 0;
		local13.aBoolean646 = false;
		local13.method7511(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local13.aBoolean650 = true;
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
	@Override
	public void method5797(@OriginalArg(0) int arg0) {
		super.anInt5357 = arg0;
		super.aClass54Array3 = new Class54_Sub1[super.anInt5357];
		for (@Pc(15) int local15 = 0; local15 < super.anInt5357; local15++) {
			super.aClass54Array3[local15] = new Class54_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!ln;IIII)Lclient!r;")
	@Override
	public Class26 method5812(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class26_Sub1_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class54_Sub1 local10 = (Class54_Sub1) this.method4545(Thread.currentThread());
		@Pc(13) Class300 local13 = local10.aClass300_2;
		@Pc(18) int local18 = arg2 - arg0;
		@Pc(23) int local23 = arg3 - arg1;
		@Pc(33) int local33 = local18 < 0 ? -local18 : local18;
		@Pc(43) int local43 = local23 < 0 ? -local23 : local23;
		@Pc(45) int local45 = local33;
		if (local33 < local43) {
			local45 = local43;
		}
		if (local45 == 0) {
			return;
		}
		@Pc(63) int local63 = (local18 << 16) / local45;
		@Pc(69) int local69 = (local23 << 16) / local45;
		local18 += local63 >> 16;
		local23 += local69 >> 16;
		if (local69 > local63) {
			local69 = -local69;
		} else {
			local63 = -local63;
		}
		@Pc(102) int local102 = local69 * arg5 >> 17;
		@Pc(110) int local110 = arg5 * local69 + 1 >> 17;
		@Pc(116) int local116 = local63 * arg5 >> 17;
		@Pc(124) int local124 = arg5 * local63 + 1 >> 17;
		@Pc(129) int local129 = arg0 - local13.method7514();
		@Pc(134) int local134 = arg1 - local13.method7522();
		@Pc(138) int local138 = local102 + local129;
		@Pc(143) int local143 = local129 - local110;
		@Pc(150) int local150 = local129 + local18 - local110;
		@Pc(157) int local157 = local18 + local129 + local102;
		@Pc(162) int local162 = local134 + local116;
		@Pc(167) int local167 = local134 - local124;
		@Pc(174) int local174 = local134 + local23 - local124;
		@Pc(180) int local180 = local116 + local134 + local23;
		local13.anInt9116 = 0;
		local13.aBoolean648 = local138 < 0 || local13.anInt9119 < local138 || local143 < 0 || local143 > local13.anInt9119 || local150 < 0 || local150 > local13.anInt9119;
		local13.method7512(local162, local167, local174, local138, local143, local150, arg4);
		local13.aBoolean648 = local138 < 0 || local13.anInt9119 < local138 || local143 < 0 || local143 > local13.anInt9119 || local157 < 0 || local13.anInt9119 < local157;
		local13.method7512(local162, local174, local180, local138, local150, local157, arg4);
	}

	@OriginalMember(owner = "client!ip", name = "G", descriptor = "()V")
	@Override
	protected void method4543() {
		super.anInt5360 = -super.anInt5361 + super.anInt5348;
		super.anInt5363 = -super.anInt5361 + super.anInt5351;
		super.anInt5362 = super.anInt5344 - super.anInt5341;
		super.anInt5366 = -super.anInt5341 + super.anInt5353;
		for (@Pc(39) int local39 = 0; local39 < super.anInt5357; local39++) {
			@Pc(48) Class300 local48 = ((Class54_Sub1) super.aClass54Array3[local39]).aClass300_2;
			local48.anInt9120 = -super.anInt5348 + super.anInt5361;
			local48.anInt9118 = -super.anInt5344 + super.anInt5353;
			local48.anInt9119 = super.anInt5351 - super.anInt5348;
			local48.anInt9117 = super.anInt5341 - super.anInt5344;
		}
		@Pc(93) int local93 = super.anInt5344 * super.anInt5359 + super.anInt5348;
		for (@Pc(96) int local96 = super.anInt5344; super.anInt5353 > local96; local96++) {
			for (@Pc(100) int local100 = 0; super.anInt5357 > local100; local100++) {
				((Class54_Sub1) super.aClass54Array3[local100]).aClass300_2.anIntArray672[local96 - super.anInt5344] = local93;
			}
			local93 += super.anInt5359;
		}
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5846(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aClass12_Sub5_3 = null;
			super.aCanvas10 = null;
			if (super.aClass84_11 == null) {
				super.anInt5359 = super.anInt5343 = 1;
				super.anIntArray375 = null;
				this.method4541();
			}
			return;
		}
		@Pc(10) Class12_Sub5 local10 = (Class12_Sub5) super.aClass68_43.method1917((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		super.aClass12_Sub5_3 = local10;
		super.aCanvas10 = arg0;
		if (super.aClass84_11 == null) {
			super.anInt5359 = local10.anInt9178;
			super.anInt5343 = local10.anInt9182;
			super.anIntArray375 = local10.anIntArray674;
			this.method4541();
		}
	}
}
