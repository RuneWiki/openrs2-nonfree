import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class121_Sub1_Sub1 extends Class121_Sub1 {

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class121_Sub1_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!rf;IIII)Lclient!ba;")
	@Override
	public Class22 method7088(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class22_Sub1_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!gk", name = "G", descriptor = "()V")
	@Override
	protected void method3929() {
		super.anInt4500 = super.anInt4519 - super.anInt4510;
		super.anInt4515 = super.anInt4502 - super.anInt4510;
		super.anInt4521 = super.anInt4514 - super.anInt4528;
		super.anInt4518 = super.anInt4523 - super.anInt4528;
		for (@Pc(29) int local29 = 0; local29 < super.anInt4503; local29++) {
			@Pc(37) Class46 local37 = ((Class77_Sub2) super.aClass77Array3[local29]).aClass46_1;
			local37.anInt931 = super.anInt4510 - super.anInt4519;
			local37.anInt932 = super.anInt4528 - super.anInt4514;
			local37.anInt929 = super.anInt4502 - super.anInt4519;
			local37.anInt928 = super.anInt4523 - super.anInt4514;
		}
		@Pc(79) int local79 = super.anInt4514 * super.anInt4529 + super.anInt4519;
		for (@Pc(82) int local82 = super.anInt4514; local82 < super.anInt4523; local82++) {
			for (@Pc(85) int local85 = 0; local85 < super.anInt4503; local85++) {
				((Class77_Sub2) super.aClass77Array3[local85]).aClass46_1.anIntArray60[local82 - super.anInt4514] = local79;
			}
			local79 += super.anInt4529;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7101(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas6 = null;
			super.aClass6_Sub16_3 = null;
			if (super.aClass4_15 == null) {
				super.anIntArray444 = null;
				super.anInt4529 = super.anInt4508 = 1;
				this.method3923();
			}
			return;
		}
		@Pc(10) Class6_Sub16 local10 = (Class6_Sub16) super.aClass212_17.method5106((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		super.aCanvas6 = arg0;
		super.aClass6_Sub16_3 = local10;
		if (super.aClass4_15 != null) {
			return;
		}
		super.anIntArray444 = local10.anIntArray574;
		super.anInt4529 = local10.anInt7174;
		super.anInt4508 = local10.anInt7173;
		this.method3923();
		return;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class60 method7121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class60_Sub1_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!pl;IIII)V")
	@Override
	public void method3927(@OriginalArg(0) Class102_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt2522;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.h(arg1, arg2, arg4, arg0.anInt2519, 1);
			return;
		}
		if (super.anInt4530 != local2) {
			@Pc(32) Class4 local32 = (Class4) super.aClass332_114.method7502((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method3933(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method3931(local2) ? 64 : 128;
				local32 = this.method7110(local38, local48, local48, local48);
				super.aClass332_114.method7498((long) local2, local32);
			}
			super.anInt4530 = local2;
			super.aClass4_16 = local32;
		}
		local8++;
		super.aClass4_16.KA(arg1 - arg4, arg2 - arg4, local8, local8, 0, arg0.anInt2519, 1);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!hi;")
	@Override
	public Class77 method3922(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < super.anInt4503; local1++) {
			if (super.aClass77Array3[local1].aRunnable3 == arg0) {
				return super.aClass77Array3[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7156(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class6_Sub16 local8 = (Class6_Sub16) super.aClass212_17.method5106((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method7849();
		local8 = Static296.method7809(arg0);
		super.aClass212_17.method5104((long) arg0.hashCode(), local8);
		if (super.aCanvas6 != arg0 || super.aClass4_15 != null) {
			return;
		}
		super.aClass6_Sub16_3 = local8;
		super.anIntArray444 = local8.anIntArray574;
		super.anInt4529 = local8.anInt7174;
		super.anInt4508 = local8.anInt7173;
		this.method3923();
	}

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "()Z")
	@Override
	public boolean method7142() {
		return false;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7115() {
		@Pc(4) Class77_Sub2 local4 = (Class77_Sub2) this.method3922(Thread.currentThread());
		@Pc(7) Class46 local7 = local4.aClass46_1;
		local7.aBoolean43 = false;
		local7.aBoolean47 = true;
		@Pc(18) int local18 = 5 - super.anInt4500;
		@Pc(23) int local23 = 75 - super.anInt4500;
		@Pc(28) int local28 = 15 - super.anInt4500;
		@Pc(33) int local33 = 10 - super.anInt4521;
		@Pc(38) int local38 = 50 - super.anInt4521;
		@Pc(43) int local43 = 90 - super.anInt4521;
		local7.anInt927 = 0;
		local7.aBoolean45 = false;
		local7.method733(local33, local38, local43, local18, local23, local28, -65536, -65536, -65536);
		local7.aBoolean43 = true;
	}

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "(I)V")
	@Override
	public void method7119(@OriginalArg(0) int arg0) {
		super.anInt4503 = arg0;
		super.aClass77Array3 = new Class77_Sub2[super.anInt4503];
		for (@Pc(9) int local9 = 0; local9 < super.anInt4503; local9++) {
			super.aClass77Array3[local9] = new Class77_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
	@Override
	public void method7089(@OriginalArg(0) int arg0) {
		super.aClass77Array3[arg0].method2704(null);
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method3925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface7_14.method5209(arg6).aBoolean107) {
			this.h(arg0, arg1, arg3, arg7, arg9);
			return;
		}
		if (super.anInt4530 != arg6) {
			@Pc(26) Class4 local26 = (Class4) super.aClass332_114.method7502((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method3933(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method3931(arg6) ? 64 : 128;
				local26 = this.method7110(local32, local43, local43, local43);
				super.aClass332_114.method7498((long) arg6, local26);
			}
			super.anInt4530 = arg6;
			super.aClass4_16 = local26;
		}
		super.aClass4_16.KA(arg0 - arg3, arg1 - arg4, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([Lclient!ba;Lclient!ob;Lclient!q;[Lclient!qn;I)V")
	@Override
	public void method7151(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class102_Sub5[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class22_Sub1_Sub2[] local3 = new Class22_Sub1_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class22_Sub1_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class22_Sub1_Sub2 local26 = Static588.method4736(this, local3);
		local26.method4727(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)V")
	@Override
	public void method7105(@OriginalArg(0) int arg0) {
		super.aClass77Array3[arg0].method2704(Thread.currentThread());
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(Z)V")
	@Override
	public void method7129(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!qn;I)V")
	@Override
	public void method7136(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class102_Sub5[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class22_Sub1_Sub2[] local3 = new Class22_Sub1_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class22_Sub1_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class22_Sub1_Sub2 local26 = Static588.method4736(this, local3);
		local26.method4727(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class77_Sub2 local4 = (Class77_Sub2) this.method3922(Thread.currentThread());
		@Pc(7) Class46 local7 = local4.aClass46_1;
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
		@Pc(106) int local106 = arg0 - local7.method729();
		@Pc(111) int local111 = arg1 - local7.method727();
		@Pc(115) int local115 = local106 + local79;
		@Pc(119) int local119 = local106 - local87;
		@Pc(125) int local125 = local106 + local11 - local87;
		@Pc(131) int local131 = local106 + local11 + local79;
		@Pc(135) int local135 = local111 + local93;
		@Pc(139) int local139 = local111 - local101;
		@Pc(145) int local145 = local111 + local15 - local101;
		@Pc(151) int local151 = local111 + local15 + local93;
		local7.anInt927 = 0;
		local7.aBoolean47 = local115 < 0 || local115 > local7.anInt929 || local119 < 0 || local119 > local7.anInt929 || local125 < 0 || local125 > local7.anInt929;
		local7.method740(local135, local139, local145, local115, local119, local125, arg4);
		local7.aBoolean47 = local115 < 0 || local115 > local7.anInt929 || local125 < 0 || local125 > local7.anInt929 || local131 < 0 || local131 > local7.anInt929;
		local7.method740(local135, local145, local151, local115, local125, local131, arg4);
	}
}
