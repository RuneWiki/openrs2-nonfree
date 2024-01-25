import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class5_Sub2_Sub2 extends Class5_Sub2 {

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class5_Sub2_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!or;IIII)Lclient!ba;")
	@Override
	public Class2 method7443(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class2_Sub1_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!vr", name = "E", descriptor = "()V")
	@Override
	protected void method7492() {
		super.anInt9060 = -super.anInt9058 + super.anInt9069;
		super.anInt9057 = -super.lb + super.anInt9064;
		super.anInt9066 = -super.lb + super.anInt9068;
		super.anInt9073 = super.anInt9049 - super.anInt9058;
		for (@Pc(39) int local39 = 0; super.anInt9048 > local39; local39++) {
			@Pc(48) Class255 local48 = ((Class99_Sub2) super.aClass99Array3[local39]).aClass255_2;
			local48.anInt7793 = super.lb - super.anInt9064;
			local48.anInt7792 = -super.anInt9069 + super.anInt9049;
			local48.anInt7794 = super.anInt9058 - super.anInt9069;
			local48.anInt7790 = -super.anInt9064 + super.anInt9068;
		}
		@Pc(96) int local96 = super.anInt9064 + super.anInt9069 * super.anInt9076;
		for (@Pc(99) int local99 = super.anInt9069; local99 < super.anInt9049; local99++) {
			for (@Pc(103) int local103 = 0; local103 < super.anInt9048; local103++) {
				((Class99_Sub2) super.aClass99Array3[local103]).aClass255_2.anIntArray666[local99 - super.anInt9069] = local96;
			}
			local96 += super.anInt9076;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class99_Sub2 local10 = (Class99_Sub2) this.method7497(Thread.currentThread());
		@Pc(13) Class255 local13 = local10.aClass255_2;
		@Pc(17) int local17 = arg2 - arg0;
		@Pc(22) int local22 = arg3 - arg1;
		@Pc(29) int local29 = local17 < 0 ? -local17 : local17;
		@Pc(36) int local36 = local22 >= 0 ? local22 : -local22;
		@Pc(38) int local38 = local29;
		if (local29 < local36) {
			local38 = local36;
		}
		if (local38 == 0) {
			return;
		}
		@Pc(56) int local56 = (local17 << 16) / local38;
		local17 += local56 >> 16;
		@Pc(68) int local68 = (local22 << 16) / local38;
		local22 += local68 >> 16;
		if (local68 <= local56) {
			local56 = -local56;
		} else {
			local68 = -local68;
		}
		@Pc(91) int local91 = arg5 * local68 >> 17;
		@Pc(99) int local99 = local68 * arg5 + 1 >> 17;
		@Pc(105) int local105 = local56 * arg5 >> 17;
		@Pc(110) int local110 = arg0 - local13.method6451();
		@Pc(118) int local118 = local56 * arg5 + 1 >> 17;
		@Pc(123) int local123 = arg1 - local13.method6444();
		@Pc(127) int local127 = local110 + local91;
		@Pc(132) int local132 = local110 - local99;
		@Pc(139) int local139 = local17 + local110 - local99;
		@Pc(146) int local146 = local91 + local110 + local17;
		@Pc(151) int local151 = local123 + local105;
		@Pc(155) int local155 = local123 - local118;
		@Pc(162) int local162 = local22 + local123 - local118;
		@Pc(168) int local168 = local22 + local123 + local105;
		local13.anInt7795 = 0;
		local13.aBoolean554 = local127 < 0 || local13.anInt7790 < local127 || local132 < 0 || local132 > local13.anInt7790 || local139 < 0 || local139 > local13.anInt7790;
		local13.method6446(local151, local155, local162, local127, local132, local139, arg4);
		local13.aBoolean554 = local127 < 0 || local127 > local13.anInt7790 || local132 < 0 || local13.anInt7790 < local132 || local146 < 0 || local146 > local13.anInt7790;
		local13.method6446(local151, local162, local168, local127, local139, local146, arg4);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!sda;I)V")
	@Override
	public void method7468(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) Class4_Sub7[] arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class2_Sub1_Sub1[] local9 = new Class2_Sub1_Sub1[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class2_Sub1_Sub1) arg0[local11];
			}
		}
		@Pc(37) Class2_Sub1_Sub1 local37 = Static550.method168(this, local9);
		local37.method5804(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7442(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class3_Sub6 local12 = (Class3_Sub6) super.aClass267_44.method6644((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method7820();
		local12 = Static9.method6181(arg0);
		super.aClass267_44.method6640(local12, (long) arg0.hashCode());
		if (arg0 != super.aCanvas14 || super.aClass119_32 != null) {
			return;
		}
		super.anInt9070 = local12.anInt2586;
		super.anInt9076 = local12.anInt2588;
		super.anIntArray762 = local12.anIntArray259;
		super.aClass3_Sub6_3 = local12;
		this.method7494();
		return;
	}

	@OriginalMember(owner = "client!vr", name = "w", descriptor = "()Z")
	@Override
	public boolean method7462() {
		return false;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7422(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas14 = null;
			super.aClass3_Sub6_3 = null;
			if (super.aClass119_32 == null) {
				super.anInt9076 = super.anInt9070 = 1;
				super.anIntArray762 = null;
				this.method7494();
			}
			return;
		}
		@Pc(32) Class3_Sub6 local32 = (Class3_Sub6) super.aClass267_44.method6644((long) arg0.hashCode());
		if (local32 == null) {
			return;
		}
		super.aClass3_Sub6_3 = local32;
		super.aCanvas14 = arg0;
		if (super.aClass119_32 == null) {
			super.anInt9076 = local32.anInt2588;
			super.anInt9070 = local32.anInt2586;
			super.anIntArray762 = local32.anIntArray259;
			this.method7494();
		}
	}

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "(I)V")
	@Override
	public void method7474(@OriginalArg(0) int arg0) {
		super.anInt9048 = arg0;
		super.aClass99Array3 = new Class99_Sub2[super.anInt9048];
		for (@Pc(15) int local15 = 0; local15 < super.anInt9048; local15++) {
			super.aClass99Array3[local15] = new Class99_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)V")
	@Override
	public void method7438(@OriginalArg(0) int arg0) {
		super.aClass99Array3[arg0].method4757(Thread.currentThread());
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7436() {
		@Pc(10) Class99_Sub2 local10 = (Class99_Sub2) this.method7497(Thread.currentThread());
		@Pc(13) Class255 local13 = local10.aClass255_2;
		@Pc(18) int local18 = 75 - super.anInt9057;
		@Pc(23) int local23 = 50 - super.anInt9060;
		local13.aBoolean552 = false;
		@Pc(31) int local31 = 10 - super.anInt9060;
		@Pc(36) int local36 = 90 - super.anInt9060;
		@Pc(41) int local41 = 15 - super.anInt9057;
		local13.aBoolean554 = true;
		@Pc(49) int local49 = 5 - super.anInt9057;
		local13.anInt7795 = 0;
		local13.aBoolean551 = false;
		local13.method6455(local31, local23, local36, local49, local18, local41, -65536, -65536, -65536);
		local13.aBoolean552 = true;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "([Lclient!ba;Lclient!be;Lclient!q;[Lclient!sda;I)V")
	@Override
	public void method7478(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class4_Sub7[] arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class2_Sub1_Sub1[] local9 = new Class2_Sub1_Sub1[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class2_Sub1_Sub1) arg0[local11];
			}
		}
		@Pc(33) Class2_Sub1_Sub1 local33 = Static550.method168(this, local9);
		local33.method5804(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class52 method7432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class52_Sub1_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "(I)V")
	@Override
	public void method7454(@OriginalArg(0) int arg0) {
		super.aClass99Array3[arg0].method4757(null);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!nw;")
	@Override
	public Class99 method7497(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; local7 < super.anInt9048; local7++) {
			if (arg0 == super.aClass99Array3[local7].aRunnable3) {
				return super.aClass99Array3[local7];
			}
		}
		return null;
	}
}
