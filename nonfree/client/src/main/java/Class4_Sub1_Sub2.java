import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class4_Sub1_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7215() {
		@Pc(10) Class200_Sub2 local10 = (Class200_Sub2) this.method2741(Thread.currentThread());
		@Pc(13) Class80 local13 = local10.aClass80_2;
		local13.aBoolean186 = true;
		local13.aBoolean184 = false;
		local13.aBoolean185 = false;
		local13.anInt2209 = 0;
		local13.method2124(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local13.aBoolean184 = true;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class7 method7187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class7_Sub2_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class200_Sub2 local10 = (Class200_Sub2) this.method2741(Thread.currentThread());
		@Pc(13) Class80 local13 = local10.aClass80_2;
		@Pc(18) int local18 = arg2 - arg0;
		@Pc(23) int local23 = arg3 - arg1;
		@Pc(33) int local33 = local18 < 0 ? -local18 : local18;
		@Pc(43) int local43 = local23 >= 0 ? local23 : -local23;
		@Pc(45) int local45 = local33;
		if (local33 < local43) {
			local45 = local43;
		}
		if (local45 == 0) {
			return;
		}
		@Pc(66) int local66 = (local18 << 16) / local45;
		@Pc(72) int local72 = (local23 << 16) / local45;
		local18 += local66 >> 16;
		local23 += local72 >> 16;
		if (local66 < local72) {
			local72 = -local72;
		} else {
			local66 = -local66;
		}
		@Pc(105) int local105 = local72 * arg5 >> 17;
		@Pc(113) int local113 = local72 * arg5 + 1 >> 17;
		@Pc(119) int local119 = local66 * arg5 >> 17;
		@Pc(127) int local127 = arg5 * local66 + 1 >> 17;
		@Pc(132) int local132 = arg0 - local13.method2122();
		@Pc(137) int local137 = arg1 - local13.method2121();
		@Pc(142) int local142 = local132 + local105;
		@Pc(147) int local147 = local132 - local113;
		@Pc(154) int local154 = local18 + local132 - local113;
		@Pc(160) int local160 = local18 + local132 + local105;
		@Pc(165) int local165 = local137 + local119;
		@Pc(169) int local169 = local137 - local127;
		@Pc(177) int local177 = local137 + local23 - local127;
		@Pc(183) int local183 = local119 + local137 + local23;
		local13.anInt2209 = 0;
		local13.aBoolean186 = local142 < 0 || local13.anInt2211 < local142 || local147 < 0 || local147 > local13.anInt2211 || local154 < 0 || local13.anInt2211 < local154;
		local13.method2119(local165, local169, local177, local142, local147, local154, arg4);
		local13.aBoolean186 = local142 < 0 || local142 > local13.anInt2211 || local147 < 0 || local147 > local13.anInt2211 || local160 < 0 || local13.anInt2211 < local160;
		local13.method2119(local165, local177, local183, local142, local154, local160, arg4);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7158(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class1_Sub13 local12 = (Class1_Sub13) super.aClass230_20.method6144((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method8239();
		local12 = Static16.method8191(arg0);
		super.aClass230_20.method6139((long) arg0.hashCode(), local12);
		if (arg0 != super.aCanvas6 || super.aClass104_12 != null) {
			return;
		}
		super.anIntArray248 = local12.anIntArray833;
		super.anInt2871 = local12.anInt9492;
		super.aClass1_Sub13_3 = local12;
		super.anInt2885 = local12.anInt9491;
		this.method2738();
		return;
	}

	@OriginalMember(owner = "client!fw", name = "F", descriptor = "()V")
	@Override
	protected void method2739() {
		super.anInt2874 = -super.anInt2887 + super.anInt2882;
		super.anInt2875 = super.anInt2869 - super.anInt2887;
		super.anInt2892 = -super.anInt2879 + super.anInt2893;
		super.anInt2884 = super.anInt2896 - super.anInt2879;
		for (@Pc(39) int local39 = 0; super.anInt2883 > local39; local39++) {
			@Pc(48) Class80 local48 = ((Class200_Sub2) super.aClass200Array3[local39]).aClass80_2;
			local48.anInt2211 = -super.anInt2896 + super.anInt2893;
			local48.anInt2213 = -super.anInt2896 + super.anInt2879;
			local48.anInt2214 = super.anInt2882 - super.anInt2869;
			local48.anInt2210 = super.anInt2887 - super.anInt2869;
		}
		@Pc(94) int local94 = super.anInt2869 * super.anInt2885 + super.anInt2896;
		for (@Pc(97) int local97 = super.anInt2869; local97 < super.anInt2882; local97++) {
			for (@Pc(101) int local101 = 0; super.anInt2883 > local101; local101++) {
				((Class200_Sub2) super.aClass200Array3[local101]).aClass80_2.anIntArray163[local97 - super.anInt2869] = local94;
			}
			local94 += super.anInt2885;
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "([Lclient!r;Lclient!ka;Lclient!m;[Lclient!cf;I)V")
	@Override
	public void method7175(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) Class46_Sub1[] arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class97_Sub1_Sub1[] local9 = new Class97_Sub1_Sub1[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class97_Sub1_Sub1) arg0[local11];
			}
		}
		@Pc(33) Class97_Sub1_Sub1 local33 = Static549.method4402(this, local9);
		local33.method5540(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!fw", name = "k", descriptor = "()Z")
	@Override
	public boolean method7166() {
		return false;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V")
	@Override
	public void method7185(@OriginalArg(0) int arg0) {
		super.anInt2883 = arg0;
		super.aClass200Array3 = new Class200_Sub2[super.anInt2883];
		for (@Pc(15) int local15 = 0; super.anInt2883 > local15; local15++) {
			super.aClass200Array3[local15] = new Class200_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!cf;I)V")
	@Override
	public void method7159(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) Class46_Sub1[] arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class97_Sub1_Sub1[] local9 = new Class97_Sub1_Sub1[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class97_Sub1_Sub1) arg0[local11];
			}
		}
		@Pc(37) Class97_Sub1_Sub1 local37 = Static549.method4402(this, local9);
		local37.method5540(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7174(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas6 = null;
			super.aClass1_Sub13_3 = null;
			if (super.aClass104_12 == null) {
				super.anInt2885 = super.anInt2871 = 1;
				super.anIntArray248 = null;
				this.method2738();
			}
			return;
		}
		@Pc(10) Class1_Sub13 local10 = (Class1_Sub13) super.aClass230_20.method6144((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		super.aCanvas6 = arg0;
		super.aClass1_Sub13_3 = local10;
		if (super.aClass104_12 == null) {
			super.anIntArray248 = local10.anIntArray833;
			super.anInt2885 = local10.anInt9491;
			super.anInt2871 = local10.anInt9492;
			this.method2738();
		}
	}

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "(I)V")
	@Override
	public void method7213(@OriginalArg(0) int arg0) {
		super.aClass200Array3[arg0].method5586(null);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!vc;")
	@Override
	public Class200 method2741(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; local7 < super.anInt2883; local7++) {
			if (super.aClass200Array3[local7].aRunnable3 == arg0) {
				return super.aClass200Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!ei;IIII)Lclient!r;")
	@Override
	public Class97 method7192(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class97_Sub1_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)V")
	@Override
	public void method7196(@OriginalArg(0) int arg0) {
		super.aClass200Array3[arg0].method5586(Thread.currentThread());
	}
}
