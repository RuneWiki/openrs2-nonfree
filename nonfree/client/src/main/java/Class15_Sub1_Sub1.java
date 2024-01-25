import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class15_Sub1_Sub1 extends Class15_Sub1 {

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class15_Sub1_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!ht;I)V")
	@Override
	public void method5310(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class55_Sub3[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class21_Sub1_Sub1[] local3 = new Class21_Sub1_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class21_Sub1_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class21_Sub1_Sub1 local26 = Static604.method5099(this, local3);
		local26.method7171(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method5302(@OriginalArg(0) Class37 arg0) {
		if (arg0 instanceof Class37_Sub2_Sub1) {
			@Pc(5) Class37_Sub2_Sub1 local5 = (Class37_Sub2_Sub1) arg0;
			super.anInt5037 = local5.anInt8031;
			super.anInt5039 = local5.anInt8021;
			super.anIntArray309 = local5.anIntArray133;
			super.aClass37_26 = arg0;
		} else if (arg0 instanceof Class37_Sub2_Sub3) {
			@Pc(27) Class37_Sub2_Sub3 local27 = (Class37_Sub2_Sub3) arg0;
			super.anInt5037 = local27.anInt8031;
			super.anInt5039 = local27.anInt8021;
			super.anIntArray309 = local27.anIntArray495;
			super.aClass37_26 = arg0;
		} else {
			throw new RuntimeException();
		}
		this.method4269();
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5311(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class3_Sub2 local8 = (Class3_Sub2) super.aClass25_20.method946((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method8412();
		local8 = Static165.method3093(arg0);
		super.aClass25_20.method945(local8, (long) arg0.hashCode());
		if (super.aCanvas8 != arg0 || super.aClass37_26 != null) {
			return;
		}
		super.aClass3_Sub2_3 = local8;
		super.anIntArray309 = local8.anIntArray656;
		super.anInt5037 = local8.anInt9945;
		super.anInt5039 = local8.anInt9943;
		this.method4269();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!fu;IIII)V")
	@Override
	public void method4275(@OriginalArg(0) Class55_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt2867;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.h(arg1, arg2, arg4, arg0.anInt2864, 1);
			return;
		}
		if (super.anInt5046 != local2) {
			@Pc(32) Class37 local32 = (Class37) super.aClass211_38.method5534((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method4271(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method4267(local2) ? 64 : 128;
				local32 = this.method5324(local38, local48, local48, local48);
				super.aClass211_38.method5529((long) local2, local32);
			}
			super.anInt5046 = local2;
			super.lb = local32;
		}
		local8++;
		super.lb.KA(arg1 - arg4, arg2 - arg4, local8, local8, 0, arg0.anInt2864, 1);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5299() {
		@Pc(4) Class91_Sub1 local4 = (Class91_Sub1) this.method4266(Thread.currentThread());
		@Pc(7) Class204 local7 = local4.aClass204_1;
		local7.aBoolean526 = false;
		local7.aBoolean527 = true;
		@Pc(18) int local18 = 5 - super.anInt5017;
		@Pc(23) int local23 = 75 - super.anInt5017;
		@Pc(28) int local28 = 15 - super.anInt5017;
		@Pc(33) int local33 = 10 - super.anInt5042;
		@Pc(38) int local38 = 50 - super.anInt5042;
		@Pc(43) int local43 = 90 - super.anInt5042;
		local7.anInt6164 = 0;
		local7.aBoolean528 = false;
		local7.method5141(local33, local38, local43, local18, local23, local28, -65536, -65536, -65536);
		local7.aBoolean526 = true;
	}

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "()Z")
	@Override
	public boolean method5289() {
		return false;
	}

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "(I)V")
	@Override
	public void method5340(@OriginalArg(0) int arg0) {
		super.aClass91Array3[arg0].method3265(null);
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)V")
	@Override
	public void method5336(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!tv;")
	@Override
	public Class91 method4266(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < super.anInt5019; local1++) {
			if (super.aClass91Array3[local1].aRunnable3 == arg0) {
				return super.aClass91Array3[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class91_Sub1 local4 = (Class91_Sub1) this.method4266(Thread.currentThread());
		@Pc(7) Class204 local7 = local4.aClass204_1;
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
		@Pc(106) int local106 = arg0 - local7.method5135();
		@Pc(111) int local111 = arg1 - local7.method5131();
		@Pc(115) int local115 = local106 + local79;
		@Pc(119) int local119 = local106 - local87;
		@Pc(125) int local125 = local106 + local11 - local87;
		@Pc(131) int local131 = local106 + local11 + local79;
		@Pc(135) int local135 = local111 + local93;
		@Pc(139) int local139 = local111 - local101;
		@Pc(145) int local145 = local111 + local15 - local101;
		@Pc(151) int local151 = local111 + local15 + local93;
		local7.anInt6164 = 0;
		local7.aBoolean527 = local115 < 0 || local115 > local7.anInt6162 || local119 < 0 || local119 > local7.anInt6162 || local125 < 0 || local125 > local7.anInt6162;
		local7.method5139(local135, local139, local145, local115, local119, local125, arg4);
		local7.aBoolean527 = local115 < 0 || local115 > local7.anInt6162 || local125 < 0 || local125 > local7.anInt6162 || local131 < 0 || local131 > local7.anInt6162;
		local7.method5139(local135, local145, local151, local115, local125, local131, arg4);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!fca;IIII)Lclient!ba;")
	@Override
	public Class21 method5352(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class21_Sub1_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(I)V")
	@Override
	public void method5317(@OriginalArg(0) int arg0) {
		super.aClass91Array3[arg0].method3265(Thread.currentThread());
	}

	@OriginalMember(owner = "client!ap", name = "G", descriptor = "()V")
	@Override
	protected void method4270() {
		super.anInt5017 = super.anInt5021 - super.anInt5025;
		super.anInt5015 = super.anInt5030 - super.anInt5025;
		super.anInt5042 = super.anInt5016 - super.anInt5020;
		super.anInt5033 = super.anInt5018 - super.anInt5020;
		for (@Pc(29) int local29 = 0; local29 < super.anInt5019; local29++) {
			@Pc(37) Class204 local37 = ((Class91_Sub1) super.aClass91Array3[local29]).aClass204_1;
			local37.anInt6166 = super.anInt5025 - super.anInt5021;
			local37.anInt6163 = super.anInt5020 - super.anInt5016;
			local37.anInt6162 = super.anInt5030 - super.anInt5021;
			local37.anInt6165 = super.anInt5018 - super.anInt5016;
		}
		@Pc(79) int local79 = super.anInt5016 * super.anInt5037 + super.anInt5021;
		for (@Pc(82) int local82 = super.anInt5016; local82 < super.anInt5018; local82++) {
			for (@Pc(85) int local85 = 0; local85 < super.anInt5019; local85++) {
				((Class91_Sub1) super.aClass91Array3[local85]).aClass204_1.anIntArray426[local82 - super.anInt5016] = local79;
			}
			local79 += super.anInt5037;
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface4_11.method3088(arg6).aBoolean488) {
			this.h(arg0, arg1, arg3, arg7, arg9);
			return;
		}
		if (super.anInt5046 != arg6) {
			@Pc(26) Class37 local26 = (Class37) super.aClass211_38.method5534((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method4271(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method4267(arg6) ? 64 : 128;
				local26 = this.method5324(local32, local43, local43, local43);
				super.aClass211_38.method5529((long) arg6, local26);
			}
			super.anInt5046 = arg6;
			super.lb = local26;
		}
		super.lb.KA(arg0 - arg3, arg1 - arg4, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([Lclient!ba;Lclient!qu;Lclient!q;[Lclient!ht;I)V")
	@Override
	public void method5297(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) Class55_Sub3[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class21_Sub1_Sub1[] local3 = new Class21_Sub1_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class21_Sub1_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class21_Sub1_Sub1 local26 = Static604.method5099(this, local3);
		local26.method7171(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "()V")
	@Override
	public void method5303() {
		if (super.aCanvas8 == null) {
			super.anInt5037 = 1;
			super.anInt5039 = 1;
			super.anIntArray309 = null;
		} else {
			super.anIntArray309 = super.aClass3_Sub2_3.anIntArray656;
			super.anInt5037 = super.aClass3_Sub2_3.anInt9945;
			super.anInt5039 = super.aClass3_Sub2_3.anInt9943;
		}
		super.aClass37_26 = null;
		this.method4269();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class4 method5354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class4_Sub1_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5319(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas8 = null;
			super.aClass3_Sub2_3 = null;
			if (super.aClass37_26 == null) {
				super.anIntArray309 = null;
				super.anInt5037 = super.anInt5039 = 1;
				this.method4269();
			}
			return;
		}
		@Pc(10) Class3_Sub2 local10 = (Class3_Sub2) super.aClass25_20.method946((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		super.aCanvas8 = arg0;
		super.aClass3_Sub2_3 = local10;
		if (super.aClass37_26 != null) {
			return;
		}
		super.anIntArray309 = local10.anIntArray656;
		super.anInt5037 = local10.anInt9945;
		super.anInt5039 = local10.anInt9943;
		this.method4269();
		return;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V")
	@Override
	public void method5304(@OriginalArg(0) int arg0) {
		super.anInt5019 = arg0;
		super.aClass91Array3 = new Class91_Sub1[super.anInt5019];
		for (@Pc(9) int local9 = 0; local9 < super.anInt5019; local9++) {
			super.aClass91Array3[local9] = new Class91_Sub1(this);
		}
	}
}
