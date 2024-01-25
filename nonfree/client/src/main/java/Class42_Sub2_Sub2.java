import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class42_Sub2_Sub2 extends Class42_Sub2 {

	@OriginalMember(owner = "client!kw", name = "Db", descriptor = "I")
	private int anInt5378;

	@OriginalMember(owner = "client!kw", name = "Eb", descriptor = "I")
	private int anInt5379;

	@OriginalMember(owner = "client!kw", name = "Fb", descriptor = "[I")
	public int[] anIntArray377;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class42_Sub2_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface11 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(I)V")
	@Override
	public void method5804(@OriginalArg(0) int arg0) {
		super.aClass54Array3[arg0].method6538(Thread.currentThread());
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!ln;IIII)Lclient!r;")
	@Override
	public Class26 method5812(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class26_Sub1_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5846(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas10 = null;
			super.aClass12_Sub5_3 = null;
			if (super.aClass84_11 == null) {
				this.anInt5379 = this.anInt5378 = 1;
				super.anIntArray375 = null;
				super.anInt5359 = super.anInt5343 = 1;
				this.method4541();
			}
			return;
		}
		@Pc(41) Class12_Sub5 local41 = (Class12_Sub5) super.aClass68_43.method1917((long) arg0.hashCode());
		if (local41 == null) {
			return;
		}
		super.aCanvas10 = arg0;
		super.aClass12_Sub5_3 = local41;
		if (super.aClass84_11 != null) {
			return;
		}
		super.anInt5343 = local41.anInt9182;
		super.anIntArray375 = local41.anIntArray674;
		super.anInt5359 = local41.anInt9178;
		if (this.anInt5379 != super.anInt5359 || this.anInt5378 != super.anInt5343) {
			this.anInt5378 = super.anInt5343;
			this.anInt5379 = super.anInt5359;
			this.anIntArray377 = new int[this.anInt5379 * this.anInt5378];
		}
		this.method4541();
		return;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!ch;")
	@Override
	public Class54 method4545(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; super.anInt5357 > local7; local7++) {
			if (arg0 == super.aClass54Array3[local7].aRunnable3) {
				return super.aClass54Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "()V")
	@Override
	public void method5792() {
		@Pc(9) int local9 = this.anIntArray377.length;
		@Pc(15) int local15 = local9 - local9 & 0x7;
		@Pc(17) int local17 = 0;
		while (local15 > local17) {
			this.anIntArray377[local17++] = Integer.MAX_VALUE;
			this.anIntArray377[local17++] = Integer.MAX_VALUE;
			this.anIntArray377[local17++] = Integer.MAX_VALUE;
			this.anIntArray377[local17++] = Integer.MAX_VALUE;
			this.anIntArray377[local17++] = Integer.MAX_VALUE;
			this.anIntArray377[local17++] = Integer.MAX_VALUE;
			this.anIntArray377[local17++] = Integer.MAX_VALUE;
			this.anIntArray377[local17++] = Integer.MAX_VALUE;
		}
		while (local17 < local9) {
			this.anIntArray377[local17++] = Integer.MAX_VALUE;
		}
	}

	@OriginalMember(owner = "client!kw", name = "G", descriptor = "()V")
	@Override
	protected void method4543() {
		super.anInt5360 = super.anInt5348 - super.anInt5361;
		super.anInt5362 = super.anInt5344 - super.anInt5341;
		super.anInt5366 = super.anInt5353 - super.anInt5341;
		super.anInt5363 = -super.anInt5361 + super.anInt5351;
		for (@Pc(36) int local36 = 0; local36 < super.anInt5357; local36++) {
			@Pc(45) Class107 local45 = ((Class54_Sub2) super.aClass54Array3[local36]).aClass107_2;
			local45.anInt3204 = super.anInt5341 - super.anInt5344;
			local45.anInt3203 = super.anInt5361 - super.anInt5348;
			local45.anInt3201 = -super.anInt5344 + super.anInt5353;
			local45.anInt3205 = super.anInt5351 - super.anInt5348;
		}
		@Pc(88) int local88 = super.anInt5344 * super.anInt5359 + super.anInt5348;
		for (@Pc(91) int local91 = super.anInt5344; super.anInt5353 > local91; local91++) {
			for (@Pc(95) int local95 = 0; super.anInt5357 > local95; local95++) {
				((Class54_Sub2) super.aClass54Array3[local95]).aClass107_2.anIntArray239[local91 - super.anInt5344] = local88;
			}
			local88 += super.anInt5359;
		}
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V")
	@Override
	public void method5797(@OriginalArg(0) int arg0) {
		super.anInt5357 = arg0;
		super.aClass54Array3 = new Class54_Sub2[super.anInt5357];
		for (@Pc(15) int local15 = 0; super.anInt5357 > local15; local15++) {
			super.aClass54Array3[local15] = new Class54_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class54_Sub2 local10 = (Class54_Sub2) this.method4545(Thread.currentThread());
		@Pc(13) Class107 local13 = local10.aClass107_2;
		@Pc(18) int local18 = arg2 - arg0;
		@Pc(23) int local23 = arg3 - arg1;
		@Pc(33) int local33 = local18 < 0 ? -local18 : local18;
		@Pc(43) int local43 = local23 < 0 ? -local23 : local23;
		@Pc(45) int local45 = local33;
		if (local43 > local33) {
			local45 = local43;
		}
		if (local45 == 0) {
			return;
		}
		@Pc(59) int local59 = (local18 << 16) / local45;
		local18 += local59 >> 16;
		@Pc(71) int local71 = (local23 << 16) / local45;
		local23 += local71 >> 16;
		if (local71 <= local59) {
			local59 = -local59;
		} else {
			local71 = -local71;
		}
		@Pc(98) int local98 = arg5 * local71 >> 17;
		@Pc(106) int local106 = local71 * arg5 + 1 >> 17;
		@Pc(112) int local112 = local59 * arg5 >> 17;
		@Pc(117) int local117 = arg0 - local13.method2880();
		@Pc(125) int local125 = local59 * arg5 + 1 >> 17;
		@Pc(130) int local130 = arg1 - local13.method2881();
		@Pc(135) int local135 = local117 + local98;
		@Pc(139) int local139 = local117 - local106;
		@Pc(146) int local146 = local117 + local18 - local106;
		@Pc(152) int local152 = local117 + local18 + local98;
		@Pc(157) int local157 = local130 + local112;
		@Pc(161) int local161 = local130 - local125;
		@Pc(169) int local169 = local130 + local23 - local125;
		@Pc(176) int local176 = local23 + local130 + local112;
		local13.anInt3206 = 0;
		local13.aBoolean258 = local135 < 0 || local135 > local13.anInt3205 || local139 < 0 || local139 > local13.anInt3205 || local146 < 0 || local13.anInt3205 < local146;
		local13.method2887(local157, local161, local169, local135, local139, local146, 0, 0, 0, arg4);
		local13.aBoolean258 = local135 < 0 || local135 > local13.anInt3205 || local139 < 0 || local139 > local13.anInt3205 || local152 < 0 || local152 > local13.anInt3205;
		local13.method2887(local157, local169, local176, local135, local146, local152, 0, 0, 0, arg4);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class215 method5796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class215_Sub1_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
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
		super.anInt5343 = local12.anInt9182;
		super.anIntArray375 = local12.anIntArray674;
		super.aClass12_Sub5_3 = local12;
		super.anInt5359 = local12.anInt9178;
		this.method4541();
		return;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "([Lclient!r;Lclient!hp;Lclient!m;[Lclient!kn;I)V")
	@Override
	public void method5809(@OriginalArg(0) Class26[] arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class7_Sub4[] arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class26_Sub1_Sub1[] local9 = new Class26_Sub1_Sub1[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class26_Sub1_Sub1) arg0[local11];
			}
		}
		@Pc(33) Class26_Sub1_Sub1 local33 = Static548.method677(this, local9);
		local33.method2993(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!kn;I)V")
	@Override
	public void method5860(@OriginalArg(0) Class26[] arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) Class7_Sub4[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method8003(arg1, arg2 == null ? null : arg2[0], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "(I)V")
	@Override
	public void method5837(@OriginalArg(0) int arg0) {
		super.aClass54Array3[arg0].method6538(null);
	}

	@OriginalMember(owner = "client!kw", name = "x", descriptor = "()Z")
	@Override
	public boolean method5843() {
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5844() {
		@Pc(10) Class54_Sub2 local10 = (Class54_Sub2) this.method4545(Thread.currentThread());
		@Pc(13) Class107 local13 = local10.aClass107_2;
		local13.aBoolean257 = false;
		local13.aBoolean258 = true;
		local13.anInt3206 = 0;
		local13.aBoolean256 = false;
		local13.method2889(10, 50, 90, 5, 75, 15, 0, 0, 0, -65536, -65536, -65536);
		local13.aBoolean257 = true;
	}
}
