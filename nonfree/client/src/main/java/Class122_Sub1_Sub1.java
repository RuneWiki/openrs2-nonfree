import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class122_Sub1_Sub1 extends Class122_Sub1 {

	@OriginalMember(owner = "client!hh", name = "tb", descriptor = "I")
	private int anInt3299;

	@OriginalMember(owner = "client!hh", name = "Cb", descriptor = "[I")
	public int[] anIntArray305;

	@OriginalMember(owner = "client!hh", name = "Db", descriptor = "I")
	private int anInt3307;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class122_Sub1_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7226(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas15 = null;
			super.aClass1_Sub5_3 = null;
			if (super.aClass2_48 == null) {
				super.anIntArray823 = null;
				this.anInt3307 = this.anInt3299 = 1;
				super.anInt8838 = super.anInt8856 = 1;
				this.method7296();
			}
			return;
		}
		@Pc(41) Class1_Sub5 local41 = (Class1_Sub5) super.aClass17_39.method738((long) arg0.hashCode());
		if (local41 == null) {
			return;
		}
		super.aCanvas15 = arg0;
		super.aClass1_Sub5_3 = local41;
		if (super.aClass2_48 != null) {
			return;
		}
		super.anInt8856 = local41.anInt3326;
		super.anInt8838 = local41.anInt3325;
		super.anIntArray823 = local41.anIntArray309;
		if (super.anInt8838 != this.anInt3307 || this.anInt3299 != super.anInt8856) {
			this.anInt3299 = super.anInt8856;
			this.anInt3307 = super.anInt8838;
			this.anIntArray305 = new int[this.anInt3307 * this.anInt3299];
		}
		this.method7296();
		return;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7252() {
		@Pc(10) Class16_Sub1 local10 = (Class16_Sub1) this.method7289(Thread.currentThread());
		@Pc(13) Class77 local13 = local10.aClass77_1;
		@Pc(18) int local18 = 10 - super.anInt8850;
		@Pc(23) int local23 = 90 - super.anInt8850;
		@Pc(28) int local28 = 75 - super.anInt8836;
		@Pc(33) int local33 = 5 - super.anInt8836;
		local13.aBoolean132 = false;
		local13.aBoolean133 = true;
		@Pc(44) int local44 = 50 - super.anInt8850;
		@Pc(49) int local49 = 15 - super.anInt8836;
		local13.anInt2141 = 0;
		local13.aBoolean130 = false;
		local13.method1814(local18, local44, local23, local33, local28, local49, 0, 0, 0, -65536, -65536, -65536);
		local13.aBoolean132 = true;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class205 method7219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class205_Sub2_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
	@Override
	public void method7232(@OriginalArg(0) int arg0) {
		super.aClass16Array3[arg0].method7157(Thread.currentThread());
	}

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V")
	@Override
	public void method7239(@OriginalArg(0) int arg0) {
		super.anInt8854 = arg0;
		super.aClass16Array3 = new Class16_Sub1[super.anInt8854];
		for (@Pc(15) int local15 = 0; local15 < super.anInt8854; local15++) {
			super.aClass16Array3[local15] = new Class16_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!eca;I)V")
	@Override
	public void method7257(@OriginalArg(0) Class145[] arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) Class72_Sub2[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method6686(arg1, arg2 == null ? null : arg2[0], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "E", descriptor = "()V")
	@Override
	protected void method7293() {
		super.anInt8844 = super.anInt8842 - super.anInt8830;
		super.anInt8850 = -super.anInt8832 + super.anInt8843;
		super.anInt8833 = -super.anInt8832 + super.anInt8845;
		super.anInt8836 = -super.anInt8830 + super.anInt8852;
		for (@Pc(38) int local38 = 0; local38 < super.anInt8854; local38++) {
			@Pc(47) Class77 local47 = ((Class16_Sub1) super.aClass16Array3[local38]).aClass77_1;
			local47.anInt2143 = super.anInt8832 - super.anInt8843;
			local47.anInt2144 = super.anInt8842 - super.anInt8852;
			local47.anInt2140 = -super.anInt8843 + super.anInt8845;
			local47.anInt2139 = super.anInt8830 - super.anInt8852;
		}
		@Pc(96) int local96 = super.anInt8843 * super.anInt8838 + super.anInt8852;
		for (@Pc(99) int local99 = super.anInt8843; local99 < super.anInt8845; local99++) {
			for (@Pc(103) int local103 = 0; super.anInt8854 > local103; local103++) {
				((Class16_Sub1) super.aClass16Array3[local103]).aClass77_1.anIntArray210[local99 - super.anInt8843] = local96;
			}
			local96 += super.anInt8838;
		}
	}

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "()Z")
	@Override
	public boolean method7267() {
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!iw;")
	@Override
	public Class16 method7289(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; local7 < super.anInt8854; local7++) {
			if (arg0 == super.aClass16Array3[local7].aRunnable4) {
				return super.aClass16Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hh", name = "D", descriptor = "()V")
	@Override
	public void method7284() {
		@Pc(9) int local9 = this.anIntArray305.length;
		@Pc(16) int local16 = local9 - local9 & 0x7;
		@Pc(18) int local18 = 0;
		while (local16 > local18) {
			this.anIntArray305[local18++] = Integer.MAX_VALUE;
			this.anIntArray305[local18++] = Integer.MAX_VALUE;
			this.anIntArray305[local18++] = Integer.MAX_VALUE;
			this.anIntArray305[local18++] = Integer.MAX_VALUE;
			this.anIntArray305[local18++] = Integer.MAX_VALUE;
			this.anIntArray305[local18++] = Integer.MAX_VALUE;
			this.anIntArray305[local18++] = Integer.MAX_VALUE;
			this.anIntArray305[local18++] = Integer.MAX_VALUE;
		}
		while (local9 > local18) {
			this.anIntArray305[local18++] = Integer.MAX_VALUE;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([Lclient!r;Lclient!kw;Lclient!m;[Lclient!eca;I)V")
	@Override
	public void method7283(@OriginalArg(0) Class145[] arg0, @OriginalArg(1) Class175 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class72_Sub2[] arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class145_Sub1_Sub1[] local9 = new Class145_Sub1_Sub1[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class145_Sub1_Sub1) arg0[local11];
			}
		}
		@Pc(33) Class145_Sub1_Sub1 local33 = Static553.method3728(this, local9);
		local33.method4273(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7278(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class1_Sub5 local12 = (Class1_Sub5) super.aClass17_39.method738((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method7525();
		local12 = Static19.method498(arg0);
		super.aClass17_39.method737(local12, (long) arg0.hashCode());
		if (super.aCanvas15 != arg0 || super.aClass2_48 != null) {
			return;
		}
		super.aClass1_Sub5_3 = local12;
		super.anInt8856 = local12.anInt3326;
		super.anIntArray823 = local12.anIntArray309;
		super.anInt8838 = local12.anInt3325;
		this.method7296();
		return;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!fp;IIII)Lclient!r;")
	@Override
	public Class145 method7280(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class145_Sub1_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	@Override
	public void method7211(@OriginalArg(0) int arg0) {
		super.aClass16Array3[arg0].method7157(null);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class16_Sub1 local10 = (Class16_Sub1) this.method7289(Thread.currentThread());
		@Pc(13) Class77 local13 = local10.aClass77_1;
		@Pc(18) int local18 = arg2 - arg0;
		@Pc(23) int local23 = arg3 - arg1;
		@Pc(30) int local30 = local18 < 0 ? -local18 : local18;
		@Pc(40) int local40 = local23 < 0 ? -local23 : local23;
		@Pc(42) int local42 = local30;
		if (local40 > local30) {
			local42 = local40;
		}
		if (local42 == 0) {
			return;
		}
		@Pc(63) int local63 = (local18 << 16) / local42;
		local18 += local63 >> 16;
		@Pc(75) int local75 = (local23 << 16) / local42;
		local23 += local75 >> 16;
		if (local63 < local75) {
			local75 = -local75;
		} else {
			local63 = -local63;
		}
		@Pc(98) int local98 = arg5 * local75 >> 17;
		@Pc(106) int local106 = arg5 * local75 + 1 >> 17;
		@Pc(112) int local112 = arg5 * local63 >> 17;
		@Pc(117) int local117 = arg0 - local13.method1802();
		@Pc(125) int local125 = local63 * arg5 + 1 >> 17;
		@Pc(130) int local130 = arg1 - local13.method1816();
		@Pc(134) int local134 = local98 + local117;
		@Pc(139) int local139 = local117 - local106;
		@Pc(146) int local146 = local18 + local117 - local106;
		@Pc(154) int local154 = local117 + local18 + local98;
		@Pc(158) int local158 = local112 + local130;
		@Pc(163) int local163 = local130 - local125;
		@Pc(169) int local169 = local23 + local130 - local125;
		@Pc(176) int local176 = local130 + local23 + local112;
		local13.anInt2141 = 0;
		local13.aBoolean133 = local134 < 0 || local134 > local13.anInt2144 || local139 < 0 || local13.anInt2144 < local139 || local146 < 0 || local146 > local13.anInt2144;
		local13.method1808(local158, local163, local169, local134, local139, local146, 0, 0, 0, arg4);
		local13.aBoolean133 = local134 < 0 || local13.anInt2144 < local134 || local139 < 0 || local139 > local13.anInt2144 || local154 < 0 || local13.anInt2144 < local154;
		local13.method1808(local158, local169, local176, local134, local146, local154, 0, 0, 0, arg4);
	}
}
