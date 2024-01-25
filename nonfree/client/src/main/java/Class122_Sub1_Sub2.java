import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public final class Class122_Sub1_Sub2 extends Class122_Sub1 {

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class122_Sub1_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7278(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class1_Sub5 local12 = (Class1_Sub5) super.aClass17_39.method738((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method7525();
		local12 = Static19.method498(arg0);
		super.aClass17_39.method737(local12, (long) arg0.hashCode());
		if (arg0 != super.aCanvas15 || super.aClass2_48 != null) {
			return;
		}
		super.anInt8856 = local12.anInt3326;
		super.aClass1_Sub5_3 = local12;
		super.anInt8838 = local12.anInt3325;
		super.anIntArray823 = local12.anIntArray309;
		this.method7296();
		return;
	}

	@OriginalMember(owner = "client!waa", name = "E", descriptor = "()V")
	@Override
	protected void method7293() {
		super.anInt8836 = -super.anInt8830 + super.anInt8852;
		super.anInt8833 = -super.anInt8832 + super.anInt8845;
		super.anInt8844 = super.anInt8842 - super.anInt8830;
		super.anInt8850 = super.anInt8843 - super.anInt8832;
		for (@Pc(38) int local38 = 0; local38 < super.anInt8854; local38++) {
			@Pc(47) Class261 local47 = ((Class16_Sub2) super.aClass16Array3[local38]).aClass261_2;
			local47.anInt7457 = super.anInt8830 - super.anInt8852;
			local47.anInt7456 = -super.anInt8843 + super.anInt8845;
			local47.anInt7459 = super.anInt8842 - super.anInt8852;
			local47.anInt7458 = -super.anInt8843 + super.anInt8832;
		}
		@Pc(96) int local96 = super.anInt8852 + super.anInt8843 * super.anInt8838;
		for (@Pc(99) int local99 = super.anInt8843; local99 < super.anInt8845; local99++) {
			for (@Pc(103) int local103 = 0; local103 < super.anInt8854; local103++) {
				((Class16_Sub2) super.aClass16Array3[local103]).aClass261_2.anIntArray709[local99 - super.anInt8843] = local96;
			}
			local96 += super.anInt8838;
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class16_Sub2 local10 = (Class16_Sub2) this.method7289(Thread.currentThread());
		@Pc(13) Class261 local13 = local10.aClass261_2;
		@Pc(18) int local18 = arg2 - arg0;
		@Pc(23) int local23 = arg3 - arg1;
		@Pc(30) int local30 = local18 < 0 ? -local18 : local18;
		@Pc(37) int local37 = local23 >= 0 ? local23 : -local23;
		@Pc(39) int local39 = local30;
		if (local37 > local30) {
			local39 = local37;
		}
		if (local39 == 0) {
			return;
		}
		@Pc(57) int local57 = (local18 << 16) / local39;
		@Pc(63) int local63 = (local23 << 16) / local39;
		local18 += local57 >> 16;
		local23 += local63 >> 16;
		if (local63 > local57) {
			local63 = -local63;
		} else {
			local57 = -local57;
		}
		@Pc(96) int local96 = local63 * arg5 >> 17;
		@Pc(104) int local104 = local63 * arg5 + 1 >> 17;
		@Pc(110) int local110 = arg5 * local57 >> 17;
		@Pc(115) int local115 = arg0 - local13.method6230();
		@Pc(123) int local123 = local57 * arg5 + 1 >> 17;
		@Pc(128) int local128 = arg1 - local13.method6227();
		@Pc(132) int local132 = local96 + local115;
		@Pc(137) int local137 = local115 - local104;
		@Pc(144) int local144 = local18 + local115 - local104;
		@Pc(150) int local150 = local18 + local115 + local96;
		@Pc(154) int local154 = local128 + local110;
		@Pc(159) int local159 = local128 - local123;
		@Pc(166) int local166 = local128 + local23 - local123;
		@Pc(172) int local172 = local110 + local128 + local23;
		local13.anInt7460 = 0;
		local13.aBoolean533 = local132 < 0 || local13.anInt7459 < local132 || local137 < 0 || local137 > local13.anInt7459 || local144 < 0 || local144 > local13.anInt7459;
		local13.method6226(local154, local159, local166, local132, local137, local144, arg4);
		local13.aBoolean533 = local132 < 0 || local13.anInt7459 < local132 || local137 < 0 || local13.anInt7459 < local137 || local150 < 0 || local13.anInt7459 < local150;
		local13.method6226(local154, local166, local172, local132, local144, local150, arg4);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "([Lclient!r;Lclient!kw;Lclient!m;[Lclient!eca;I)V")
	@Override
	public void method7283(@OriginalArg(0) Class145[] arg0, @OriginalArg(1) Class175 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class72_Sub2[] arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class145_Sub1_Sub2[] local9 = new Class145_Sub1_Sub2[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class145_Sub1_Sub2) arg0[local11];
			}
		}
		@Pc(37) Class145_Sub1_Sub2 local37 = Static556.method4287(this, local9);
		local37.method4273(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "(I)V")
	@Override
	public void method7239(@OriginalArg(0) int arg0) {
		super.anInt8854 = arg0;
		super.aClass16Array3 = new Class16_Sub2[super.anInt8854];
		for (@Pc(15) int local15 = 0; local15 < super.anInt8854; local15++) {
			super.aClass16Array3[local15] = new Class16_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!waa", name = "x", descriptor = "()Z")
	@Override
	public boolean method7267() {
		return false;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7252() {
		@Pc(10) Class16_Sub2 local10 = (Class16_Sub2) this.method7289(Thread.currentThread());
		@Pc(13) Class261 local13 = local10.aClass261_2;
		@Pc(18) int local18 = 5 - super.anInt8836;
		@Pc(23) int local23 = 15 - super.anInt8836;
		@Pc(28) int local28 = 10 - super.anInt8850;
		local13.aBoolean531 = false;
		local13.aBoolean533 = true;
		@Pc(39) int local39 = 50 - super.anInt8850;
		@Pc(44) int local44 = 90 - super.anInt8850;
		@Pc(49) int local49 = 75 - super.anInt8836;
		local13.aBoolean534 = false;
		local13.anInt7460 = 0;
		local13.method6225(local28, local39, local44, local18, local49, local23, -65536, -65536, -65536);
		local13.aBoolean531 = true;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!fp;IIII)Lclient!r;")
	@Override
	public Class145 method7280(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class145_Sub1_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "(I)V")
	@Override
	public void method7232(@OriginalArg(0) int arg0) {
		super.aClass16Array3[arg0].method7157(Thread.currentThread());
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!iw;")
	@Override
	public Class16 method7289(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; super.anInt8854 > local7; local7++) {
			if (super.aClass16Array3[local7].aRunnable4 == arg0) {
				return super.aClass16Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class205 method7219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class205_Sub2_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7226(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas15 = null;
			super.aClass1_Sub5_3 = null;
			if (super.aClass2_48 == null) {
				super.anIntArray823 = null;
				super.anInt8838 = super.anInt8856 = 1;
				this.method7296();
			}
			return;
		}
		@Pc(35) Class1_Sub5 local35 = (Class1_Sub5) super.aClass17_39.method738((long) arg0.hashCode());
		if (local35 == null) {
			return;
		}
		super.aCanvas15 = arg0;
		super.aClass1_Sub5_3 = local35;
		if (super.aClass2_48 != null) {
			return;
		}
		super.anInt8838 = local35.anInt3325;
		super.anIntArray823 = local35.anIntArray309;
		super.anInt8856 = local35.anInt3326;
		this.method7296();
		return;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!eca;I)V")
	@Override
	public void method7257(@OriginalArg(0) Class145[] arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) Class72_Sub2[] arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class145_Sub1_Sub2[] local9 = new Class145_Sub1_Sub2[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class145_Sub1_Sub2) arg0[local11];
			}
		}
		@Pc(37) Class145_Sub1_Sub2 local37 = Static556.method4287(this, local9);
		local37.method4273(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)V")
	@Override
	public void method7211(@OriginalArg(0) int arg0) {
		super.aClass16Array3[arg0].method7157(null);
	}
}
