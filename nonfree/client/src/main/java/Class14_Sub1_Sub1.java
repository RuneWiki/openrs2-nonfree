import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class14_Sub1_Sub1 extends Class14_Sub1 {

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class14_Sub1_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(Z)V")
	@Override
	public void method6880(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aq", name = "G", descriptor = "()V")
	@Override
	protected void method5052() {
		super.anInt5823 = super.anInt5844 - super.anInt5827;
		super.anInt5824 = super.anInt5825 - super.anInt5827;
		super.anInt5816 = super.anInt5831 - super.anInt5837;
		super.anInt5821 = super.anInt5838 - super.anInt5837;
		for (@Pc(29) int local29 = 0; local29 < super.anInt5834; local29++) {
			@Pc(37) Class170 local37 = ((Class44_Sub2) super.aClass44Array3[local29]).aClass170_1;
			local37.anInt4930 = super.anInt5827 - super.anInt5844;
			local37.anInt4927 = super.anInt5837 - super.anInt5831;
			local37.anInt4928 = super.anInt5825 - super.anInt5844;
			local37.anInt4931 = super.anInt5838 - super.anInt5831;
		}
		@Pc(79) int local79 = super.anInt5831 * super.anInt5817 + super.anInt5844;
		for (@Pc(82) int local82 = super.anInt5831; local82 < super.anInt5838; local82++) {
			for (@Pc(85) int local85 = 0; local85 < super.anInt5834; local85++) {
				((Class44_Sub2) super.aClass44Array3[local85]).aClass170_1.anIntArray373[local82 - super.anInt5831] = local79;
			}
			local79 += super.anInt5817;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!po;I)V")
	@Override
	public void method6885(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) Class98_Sub5[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class20_Sub1_Sub2[] local3 = new Class20_Sub1_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class20_Sub1_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class20_Sub1_Sub2 local26 = Static610.method7295(this, local3);
		local26.method7273(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([Lclient!ba;Lclient!ig;Lclient!q;[Lclient!po;I)V")
	@Override
	public void method6872(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class98_Sub5[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class20_Sub1_Sub2[] local3 = new Class20_Sub1_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class20_Sub1_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class20_Sub1_Sub2 local26 = Static610.method7295(this, local3);
		local26.method7273(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V")
	@Override
	public void method6850(@OriginalArg(0) int arg0) {
		super.aClass44Array3[arg0].method6769(null);
	}

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "()V")
	@Override
	public void method6858() {
		if (super.aCanvas11 == null) {
			super.anInt5817 = 1;
			super.anInt5843 = 1;
			super.lb = null;
		} else {
			super.lb = super.aClass6_Sub23_3.anIntArray539;
			super.anInt5817 = super.aClass6_Sub23_3.anInt7481;
			super.anInt5843 = super.aClass6_Sub23_3.anInt7484;
		}
		super.aClass58_30 = null;
		this.method5047();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!nj;IIII)Lclient!ba;")
	@Override
	public Class20 method6833(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class20_Sub1_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(I)V")
	@Override
	public void method6873(@OriginalArg(0) int arg0) {
		super.aClass44Array3[arg0].method6769(Thread.currentThread());
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface4_15.method4234(arg6).aBoolean593) {
			this.h(arg0, arg1, arg3, arg7, arg9);
			return;
		}
		if (super.anInt5846 != arg6) {
			@Pc(26) Class58 local26 = (Class58) super.aClass136_69.method3473((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method5049(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method5057(arg6) ? 64 : 128;
				local26 = this.method6863(local32, local43, local43, local43);
				super.aClass136_69.method3482((long) arg6, local26);
			}
			super.anInt5846 = arg6;
			super.aClass58_31 = local26;
		}
		super.aClass58_31.KA(arg0 - arg3, arg1 - arg4, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method6821(@OriginalArg(0) Class58 arg0) {
		if (arg0 instanceof Class58_Sub1_Sub1) {
			@Pc(5) Class58_Sub1_Sub1 local5 = (Class58_Sub1_Sub1) arg0;
			super.anInt5817 = local5.anInt9369;
			super.anInt5843 = local5.anInt9392;
			super.lb = local5.anIntArray135;
			super.aClass58_30 = arg0;
		} else if (arg0 instanceof Class58_Sub1_Sub2) {
			@Pc(27) Class58_Sub1_Sub2 local27 = (Class58_Sub1_Sub2) arg0;
			super.anInt5817 = local27.anInt9369;
			super.anInt5843 = local27.anInt9392;
			super.lb = local27.anIntArray171;
			super.aClass58_30 = arg0;
		} else {
			throw new RuntimeException();
		}
		this.method5047();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class59 method6857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class59_Sub1_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6823(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class6_Sub23 local8 = (Class6_Sub23) super.aClass128_28.method3263((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method7804();
		local8 = Static176.method3226(arg0);
		super.aClass128_28.method3267(local8, (long) arg0.hashCode());
		if (super.aCanvas11 != arg0 || super.aClass58_30 != null) {
			return;
		}
		super.aClass6_Sub23_3 = local8;
		super.lb = local8.anIntArray539;
		super.anInt5817 = local8.anInt7481;
		super.anInt5843 = local8.anInt7484;
		this.method5047();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6868() {
		@Pc(4) Class44_Sub2 local4 = (Class44_Sub2) this.method5048(Thread.currentThread());
		@Pc(7) Class170 local7 = local4.aClass170_1;
		local7.aBoolean345 = false;
		local7.aBoolean344 = true;
		@Pc(18) int local18 = 5 - super.anInt5823;
		@Pc(23) int local23 = 75 - super.anInt5823;
		@Pc(28) int local28 = 15 - super.anInt5823;
		@Pc(33) int local33 = 10 - super.anInt5816;
		@Pc(38) int local38 = 50 - super.anInt5816;
		@Pc(43) int local43 = 90 - super.anInt5816;
		local7.anInt4929 = 0;
		local7.aBoolean347 = false;
		local7.method4270(local33, local38, local43, local18, local23, local28, -65536, -65536, -65536);
		local7.aBoolean345 = true;
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6900(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas11 = null;
			super.aClass6_Sub23_3 = null;
			if (super.aClass58_30 == null) {
				super.lb = null;
				super.anInt5817 = super.anInt5843 = 1;
				this.method5047();
			}
			return;
		}
		@Pc(10) Class6_Sub23 local10 = (Class6_Sub23) super.aClass128_28.method3263((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		super.aCanvas11 = arg0;
		super.aClass6_Sub23_3 = local10;
		if (super.aClass58_30 != null) {
			return;
		}
		super.lb = local10.anIntArray539;
		super.anInt5817 = local10.anInt7481;
		super.anInt5843 = local10.anInt7484;
		this.method5047();
		return;
	}

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "(I)V")
	@Override
	public void method6905(@OriginalArg(0) int arg0) {
		super.anInt5834 = arg0;
		super.aClass44Array3 = new Class44_Sub2[super.anInt5834];
		for (@Pc(9) int local9 = 0; local9 < super.anInt5834; local9++) {
			super.aClass44Array3[local9] = new Class44_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!fm;IIII)V")
	@Override
	public void method5059(@OriginalArg(0) Class98_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt9524;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.h(arg1, arg2, arg4, arg0.anInt9521, 1);
			return;
		}
		if (super.anInt5846 != local2) {
			@Pc(32) Class58 local32 = (Class58) super.aClass136_69.method3473((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method5049(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method5057(local2) ? 64 : 128;
				local32 = this.method6863(local38, local48, local48, local48);
				super.aClass136_69.method3482((long) local2, local32);
			}
			super.anInt5846 = local2;
			super.aClass58_31 = local32;
		}
		local8++;
		super.aClass58_31.KA(arg1 - arg4, arg2 - arg4, local8, local8, 0, arg0.anInt9521, 1);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class44_Sub2 local4 = (Class44_Sub2) this.method5048(Thread.currentThread());
		@Pc(7) Class170 local7 = local4.aClass170_1;
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
		@Pc(106) int local106 = arg0 - local7.method4275();
		@Pc(111) int local111 = arg1 - local7.method4264();
		@Pc(115) int local115 = local106 + local79;
		@Pc(119) int local119 = local106 - local87;
		@Pc(125) int local125 = local106 + local11 - local87;
		@Pc(131) int local131 = local106 + local11 + local79;
		@Pc(135) int local135 = local111 + local93;
		@Pc(139) int local139 = local111 - local101;
		@Pc(145) int local145 = local111 + local15 - local101;
		@Pc(151) int local151 = local111 + local15 + local93;
		local7.anInt4929 = 0;
		local7.aBoolean344 = local115 < 0 || local115 > local7.anInt4928 || local119 < 0 || local119 > local7.anInt4928 || local125 < 0 || local125 > local7.anInt4928;
		local7.method4274(local135, local139, local145, local115, local119, local125, arg4);
		local7.aBoolean344 = local115 < 0 || local115 > local7.anInt4928 || local125 < 0 || local125 > local7.anInt4928 || local131 < 0 || local131 > local7.anInt4928;
		local7.method4274(local135, local145, local151, local115, local125, local131, arg4);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!cm;")
	@Override
	public Class44 method5048(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < super.anInt5834; local1++) {
			if (super.aClass44Array3[local1].aRunnable4 == arg0) {
				return super.aClass44Array3[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "()Z")
	@Override
	public boolean method6876() {
		return false;
	}
}
