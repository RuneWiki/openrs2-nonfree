import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class90_Sub2_Sub1 extends Class90_Sub2 {

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class90_Sub2_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!hn;IIII)Lclient!ba;")
	@Override
	public Class24 method7464(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class24_Sub1_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "()V")
	@Override
	protected void method6760() {
		super.anInt8506 = super.anInt8486 - super.anInt8508;
		super.anInt8490 = super.anInt8491 - super.anInt8508;
		super.anInt8500 = super.anInt8509 - super.anInt8488;
		super.anInt8492 = super.anInt8494 - super.anInt8488;
		for (@Pc(29) int local29 = 0; local29 < super.anInt8504; local29++) {
			@Pc(37) Class153 local37 = ((Class38_Sub1) super.aClass38Array3[local29]).aClass153_1;
			local37.anInt4479 = super.anInt8508 - super.anInt8486;
			local37.anInt4481 = super.anInt8488 - super.anInt8509;
			local37.anInt4477 = super.anInt8491 - super.anInt8486;
			local37.anInt4482 = super.anInt8494 - super.anInt8509;
		}
		@Pc(79) int local79 = super.anInt8509 * super.anInt8497 + super.anInt8486;
		for (@Pc(82) int local82 = super.anInt8509; local82 < super.anInt8494; local82++) {
			for (@Pc(85) int local85 = 0; local85 < super.anInt8504; local85++) {
				((Class38_Sub1) super.aClass38Array3[local85]).aClass153_1.anIntArray367[local82 - super.anInt8509] = local79;
			}
			local79 += super.anInt8497;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7472(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas12 = null;
			super.aClass6_Sub13_3 = null;
			if (super.aClass71_51 == null) {
				super.anIntArray602 = null;
				super.anInt8497 = super.anInt8489 = 1;
				this.method6755();
			}
			return;
		}
		@Pc(10) Class6_Sub13 local10 = (Class6_Sub13) super.aClass234_43.method5464((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		super.aCanvas12 = arg0;
		super.aClass6_Sub13_3 = local10;
		if (super.aClass71_51 != null) {
			return;
		}
		super.anIntArray602 = local10.anIntArray420;
		super.anInt8497 = local10.anInt5409;
		super.anInt8489 = local10.anInt5412;
		this.method6755();
		return;
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	@Override
	public void method7491(@OriginalArg(0) int arg0) {
		super.aClass38Array3[arg0].method5974(Thread.currentThread());
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class46 method7477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class46_Sub1_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7512() {
		@Pc(4) Class38_Sub1 local4 = (Class38_Sub1) this.method6761(Thread.currentThread());
		@Pc(7) Class153 local7 = local4.aClass153_1;
		local7.aBoolean329 = false;
		local7.aBoolean328 = true;
		@Pc(18) int local18 = 5 - super.anInt8506;
		@Pc(23) int local23 = 75 - super.anInt8506;
		@Pc(28) int local28 = 15 - super.anInt8506;
		@Pc(33) int local33 = 10 - super.anInt8500;
		@Pc(38) int local38 = 50 - super.anInt8500;
		@Pc(43) int local43 = 90 - super.anInt8500;
		local7.anInt4478 = 0;
		local7.aBoolean332 = false;
		local7.method3809(local33, local38, local43, local18, local23, local28, -65536, -65536, -65536);
		local7.aBoolean329 = true;
	}

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
	@Override
	public boolean method7480() {
		return false;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
	@Override
	public void method7478(@OriginalArg(0) int arg0) {
		super.anInt8504 = arg0;
		super.aClass38Array3 = new Class38_Sub1[super.anInt8504];
		for (@Pc(9) int local9 = 0; local9 < super.anInt8504; local9++) {
			super.aClass38Array3[local9] = new Class38_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(Z)V")
	@Override
	public void method7500(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class38_Sub1 local4 = (Class38_Sub1) this.method6761(Thread.currentThread());
		@Pc(7) Class153 local7 = local4.aClass153_1;
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
		@Pc(106) int local106 = arg0 - local7.method3810();
		@Pc(111) int local111 = arg1 - local7.method3803();
		@Pc(115) int local115 = local106 + local79;
		@Pc(119) int local119 = local106 - local87;
		@Pc(125) int local125 = local106 + local11 - local87;
		@Pc(131) int local131 = local106 + local11 + local79;
		@Pc(135) int local135 = local111 + local93;
		@Pc(139) int local139 = local111 - local101;
		@Pc(145) int local145 = local111 + local15 - local101;
		@Pc(151) int local151 = local111 + local15 + local93;
		local7.anInt4478 = 0;
		local7.aBoolean328 = local115 < 0 || local115 > local7.anInt4477 || local119 < 0 || local119 > local7.anInt4477 || local125 < 0 || local125 > local7.anInt4477;
		local7.method3800(local135, local139, local145, local115, local119, local125, arg4);
		local7.aBoolean328 = local115 < 0 || local115 > local7.anInt4477 || local125 < 0 || local125 > local7.anInt4477 || local131 < 0 || local131 > local7.anInt4477;
		local7.method3800(local135, local145, local151, local115, local125, local131, arg4);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!cq;IIII)V")
	@Override
	public void method6754(@OriginalArg(0) Class60_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt2704;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.h(arg1, arg2, arg4, arg0.anInt2703, 1);
			return;
		}
		if (super.anInt8513 != local2) {
			@Pc(32) Class71 local32 = (Class71) super.aClass330_60.method7677((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method6757(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method6764(local2) ? 64 : 128;
				local32 = this.method7471(local38, local48, local48, local48);
				super.aClass330_60.method7676(local32, (long) local2);
			}
			super.anInt8513 = local2;
			super.aClass71_52 = local32;
		}
		local8++;
		super.aClass71_52.KA(arg1 - arg4, arg2 - arg4, local8, local8, 0, arg0.anInt2703, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Lclient!ba;Lclient!hfa;Lclient!q;[Lclient!rc;I)V")
	@Override
	public void method7524(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) Class60_Sub6[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class24_Sub1_Sub2[] local3 = new Class24_Sub1_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class24_Sub1_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class24_Sub1_Sub2 local26 = Static595.method7429(this, local3);
		local26.method7406(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface2_15.method3085(arg6).aBoolean231) {
			this.h(arg0, arg1, arg3, arg7, arg9);
			return;
		}
		if (super.anInt8513 != arg6) {
			@Pc(26) Class71 local26 = (Class71) super.aClass330_60.method7677((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method6757(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method6764(arg6) ? 64 : 128;
				local26 = this.method7471(local32, local43, local43, local43);
				super.aClass330_60.method7676(local26, (long) arg6);
			}
			super.anInt8513 = arg6;
			super.aClass71_52 = local26;
		}
		super.aClass71_52.KA(arg0 - arg3, arg1 - arg4, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!vd;")
	@Override
	public Class38 method6761(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < super.anInt8504; local1++) {
			if (super.aClass38Array3[local1].aRunnable3 == arg0) {
				return super.aClass38Array3[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!rc;I)V")
	@Override
	public void method7476(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) Class60_Sub6[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class24_Sub1_Sub2[] local3 = new Class24_Sub1_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class24_Sub1_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class24_Sub1_Sub2 local26 = Static595.method7429(this, local3);
		local26.method7406(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	@Override
	public void method7468(@OriginalArg(0) int arg0) {
		super.aClass38Array3[arg0].method5974(null);
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7526(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class6_Sub13 local8 = (Class6_Sub13) super.aClass234_43.method5464((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method7948();
		local8 = Static484.method6801(arg0);
		super.aClass234_43.method5466((long) arg0.hashCode(), local8);
		if (super.aCanvas12 != arg0 || super.aClass71_51 != null) {
			return;
		}
		super.aClass6_Sub13_3 = local8;
		super.anIntArray602 = local8.anIntArray420;
		super.anInt8497 = local8.anInt5409;
		super.anInt8489 = local8.anInt5412;
		this.method6755();
	}
}
