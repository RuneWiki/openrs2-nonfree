import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class66_Sub2_Sub2 extends Class66_Sub2 {

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class66_Sub2_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "()Z")
	@Override
	public boolean method6834() {
		return false;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface3_15.method7249(arg6).aBoolean514) {
			this.h(arg0, arg1, arg3, arg7, arg9);
			return;
		}
		if (super.anInt3235 != arg6) {
			@Pc(26) Class13 local26 = (Class13) super.aClass223_27.method4943((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method2965(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method2955(arg6) ? 64 : 128;
				local26 = this.method6843(local32, local43, local43, local43);
				super.aClass223_27.method4938((long) arg6, local26);
			}
			super.anInt3235 = arg6;
			super.aClass13_13 = local26;
		}
		super.aClass13_13.KA(arg0 - arg3, arg1 - arg4, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6816() {
		@Pc(4) Class94_Sub1 local4 = (Class94_Sub1) this.method2953(Thread.currentThread());
		@Pc(7) Class227 local7 = local4.aClass227_2;
		local7.aBoolean436 = false;
		local7.aBoolean437 = true;
		@Pc(18) int local18 = 5 - super.anInt3217;
		@Pc(23) int local23 = 75 - super.anInt3217;
		@Pc(28) int local28 = 15 - super.anInt3217;
		@Pc(33) int local33 = 10 - super.anInt3233;
		@Pc(38) int local38 = 50 - super.anInt3233;
		@Pc(43) int local43 = 90 - super.anInt3233;
		local7.anInt5884 = 0;
		local7.aBoolean435 = false;
		local7.method4984(local33, local38, local43, local18, local23, local28, -65536, -65536, -65536);
		local7.aBoolean436 = true;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!di;IIII)V")
	@Override
	public void method2956(@OriginalArg(0) Class26_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt9221;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.h(arg1, arg2, arg4, arg0.anInt9219, 1);
			return;
		}
		if (super.anInt3235 != local2) {
			@Pc(32) Class13 local32 = (Class13) super.aClass223_27.method4943((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method2965(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method2955(local2) ? 64 : 128;
				local32 = this.method6843(local38, local48, local48, local48);
				super.aClass223_27.method4938((long) local2, local32);
			}
			super.anInt3235 = local2;
			super.aClass13_13 = local32;
		}
		local8++;
		super.aClass13_13.KA(arg1 - arg4, arg2 - arg4, local8, local8, 0, arg0.anInt9219, 1);
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
	@Override
	public void method6813(@OriginalArg(0) int arg0) {
		super.aClass94Array3[arg0].method5762(Thread.currentThread());
	}

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "()V")
	@Override
	protected void method2954() {
		super.anInt3217 = super.anInt3216 - super.anInt3231;
		super.anInt3225 = super.anInt3230 - super.anInt3231;
		super.anInt3233 = super.anInt3208 - super.anInt3224;
		super.anInt3210 = super.anInt3218 - super.anInt3224;
		for (@Pc(29) int local29 = 0; local29 < super.anInt3229; local29++) {
			@Pc(37) Class227 local37 = ((Class94_Sub1) super.aClass94Array3[local29]).aClass227_2;
			local37.anInt5887 = super.anInt3231 - super.anInt3216;
			local37.anInt5882 = super.anInt3224 - super.anInt3208;
			local37.anInt5883 = super.anInt3230 - super.anInt3216;
			local37.anInt5886 = super.anInt3218 - super.anInt3208;
		}
		@Pc(79) int local79 = super.anInt3208 * super.anInt3214 + super.anInt3216;
		for (@Pc(82) int local82 = super.anInt3208; local82 < super.anInt3218; local82++) {
			for (@Pc(85) int local85 = 0; local85 < super.anInt3229; local85++) {
				((Class94_Sub1) super.aClass94Array3[local85]).aClass227_2.anIntArray481[local82 - super.anInt3208] = local79;
			}
			local79 += super.anInt3214;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class94_Sub1 local4 = (Class94_Sub1) this.method2953(Thread.currentThread());
		@Pc(7) Class227 local7 = local4.aClass227_2;
		@Pc(11) int local11 = arg2 - arg0;
		@Pc(15) int local15 = arg3 - arg1;
		@Pc(22) int local22 = local11 >= 0 ? local11 : -local11;
		@Pc(29) int local29 = local15 >= 0 ? local15 : -local15;
		@Pc(31) int local31 = local22;
		if (local22 < local29) {
			local31 = local29;
		}
		if (local31 == 0) {
			return;
		}
		@Pc(45) int local45 = (local11 << 16) / local31;
		@Pc(51) int local51 = (local15 << 16) / local31;
		local11 += local45 >> 16;
		local15 += local51 >> 16;
		if (local51 <= local45) {
			local45 = -local45;
		} else {
			local51 = -local51;
		}
		@Pc(79) int local79 = arg5 * local51 >> 17;
		@Pc(87) int local87 = arg5 * local51 + 1 >> 17;
		@Pc(93) int local93 = arg5 * local45 >> 17;
		@Pc(101) int local101 = arg5 * local45 + 1 >> 17;
		@Pc(106) int local106 = arg0 - local7.method4985();
		@Pc(111) int local111 = arg1 - local7.method4982();
		@Pc(115) int local115 = local106 + local79;
		@Pc(119) int local119 = local106 - local87;
		@Pc(125) int local125 = local106 + local11 - local87;
		@Pc(131) int local131 = local106 + local11 + local79;
		@Pc(135) int local135 = local111 + local93;
		@Pc(139) int local139 = local111 - local101;
		@Pc(145) int local145 = local111 + local15 - local101;
		@Pc(151) int local151 = local111 + local15 + local93;
		local7.anInt5884 = 0;
		local7.aBoolean437 = local115 < 0 || local115 > local7.anInt5883 || local119 < 0 || local119 > local7.anInt5883 || local125 < 0 || local125 > local7.anInt5883;
		local7.method4975(local135, local139, local145, local115, local119, local125, arg4);
		local7.aBoolean437 = local115 < 0 || local115 > local7.anInt5883 || local125 < 0 || local125 > local7.anInt5883 || local131 < 0 || local131 > local7.anInt5883;
		local7.method4975(local135, local145, local151, local115, local125, local131, arg4);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "()V")
	@Override
	public void method6780() {
		if (super.aCanvas10 == null) {
			super.anInt3214 = 1;
			super.anInt3215 = 1;
			super.anIntArray301 = null;
		} else {
			super.anIntArray301 = super.aClass4_Sub1_3.anIntArray680;
			super.anInt3214 = super.aClass4_Sub1_3.anInt8906;
			super.anInt3215 = super.aClass4_Sub1_3.anInt8905;
		}
		super.aClass13_12 = null;
		this.method2961();
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(Z)V")
	@Override
	public void method6857(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([Lclient!ba;Lclient!c;Lclient!q;[Lclient!ot;I)V")
	@Override
	public void method6798(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class26_Sub5[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class9_Sub1_Sub2[] local3 = new Class9_Sub1_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class9_Sub1_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class9_Sub1_Sub2 local26 = Static601.method1178(this, local3);
		local26.method1173(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!eo;")
	@Override
	public Class94 method2953(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < super.anInt3229; local1++) {
			if (super.aClass94Array3[local1].aRunnable3 == arg0) {
				return super.aClass94Array3[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!pf;IIII)Lclient!ba;")
	@Override
	public Class9 method6779(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class9_Sub1_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6854(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas10 = null;
			super.aClass4_Sub1_3 = null;
			if (super.aClass13_12 == null) {
				super.anIntArray301 = null;
				super.anInt3214 = super.anInt3215 = 1;
				this.method2961();
			}
			return;
		}
		@Pc(10) Class4_Sub1 local10 = (Class4_Sub1) super.aClass183_12.method4289((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		super.aCanvas10 = arg0;
		super.aClass4_Sub1_3 = local10;
		if (super.aClass13_12 != null) {
			return;
		}
		super.anIntArray301 = local10.anIntArray680;
		super.anInt3214 = local10.anInt8906;
		super.anInt3215 = local10.anInt8905;
		this.method2961();
		return;
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)V")
	@Override
	public void method6835(@OriginalArg(0) int arg0) {
		super.anInt3229 = arg0;
		super.aClass94Array3 = new Class94_Sub1[super.anInt3229];
		for (@Pc(9) int local9 = 0; local9 < super.anInt3229; local9++) {
			super.aClass94Array3[local9] = new Class94_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!ot;I)V")
	@Override
	public void method6845(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Class26_Sub5[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class9_Sub1_Sub2[] local3 = new Class9_Sub1_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class9_Sub1_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class9_Sub1_Sub2 local26 = Static601.method1178(this, local3);
		local26.method1173(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6815(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class4_Sub1 local8 = (Class4_Sub1) super.aClass183_12.method4289((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method8013();
		local8 = Static429.method6116(arg0);
		super.aClass183_12.method4282((long) arg0.hashCode(), local8);
		if (super.aCanvas10 != arg0 || super.aClass13_12 != null) {
			return;
		}
		super.aClass4_Sub1_3 = local8;
		super.anIntArray301 = local8.anIntArray680;
		super.anInt3214 = local8.anInt8906;
		super.anInt3215 = local8.anInt8905;
		this.method2961();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	@Override
	public void method6787(@OriginalArg(0) int arg0) {
		super.aClass94Array3[arg0].method5762(null);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method6811(@OriginalArg(0) Class13 arg0) {
		if (arg0 instanceof Class13_Sub1_Sub2) {
			@Pc(5) Class13_Sub1_Sub2 local5 = (Class13_Sub1_Sub2) arg0;
			super.anInt3214 = local5.anInt6567;
			super.anInt3215 = local5.anInt6560;
			super.anIntArray301 = local5.anIntArray372;
			super.aClass13_12 = arg0;
		} else if (arg0 instanceof Class13_Sub1_Sub1) {
			@Pc(27) Class13_Sub1_Sub1 local27 = (Class13_Sub1_Sub1) arg0;
			super.anInt3214 = local27.anInt6567;
			super.anInt3215 = local27.anInt6560;
			super.anIntArray301 = local27.anIntArray123;
			super.aClass13_12 = arg0;
		} else {
			throw new RuntimeException();
		}
		this.method2961();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class16 method6797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class16_Sub2_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}
}
