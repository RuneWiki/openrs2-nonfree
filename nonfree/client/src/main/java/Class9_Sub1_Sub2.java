import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class9_Sub1_Sub2 extends Class9_Sub1 {

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class9_Sub1_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!cr", name = "H", descriptor = "()V")
	@Override
	protected void method1654() {
		super.anInt1829 = super.anInt1813 - super.anInt1812;
		super.anInt1806 = super.anInt1821 - super.anInt1812;
		super.anInt1808 = super.anInt1815 - super.anInt1824;
		super.anInt1831 = super.anInt1830 - super.anInt1824;
		for (@Pc(29) int local29 = 0; local29 < super.anInt1805; local29++) {
			@Pc(37) Class258 local37 = ((Class179_Sub2) super.aClass179Array3[local29]).aClass258_2;
			local37.anInt7597 = super.anInt1812 - super.anInt1813;
			local37.anInt7599 = super.anInt1824 - super.anInt1815;
			local37.anInt7600 = super.anInt1821 - super.anInt1813;
			local37.anInt7595 = super.anInt1830 - super.anInt1815;
		}
		@Pc(79) int local79 = super.anInt1815 * super.anInt1832 + super.anInt1813;
		for (@Pc(82) int local82 = super.anInt1815; local82 < super.anInt1830; local82++) {
			for (@Pc(85) int local85 = 0; local85 < super.anInt1805; local85++) {
				((Class179_Sub2) super.aClass179Array3[local85]).aClass258_2.anIntArray535[local82 - super.anInt1815] = local79;
			}
			local79 += super.anInt1832;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "([Lclient!ba;Lclient!tg;Lclient!q;[Lclient!mr;I)V")
	@Override
	public void method5445(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class5_Sub4[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class23_Sub3_Sub2[] local3 = new Class23_Sub3_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class23_Sub3_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class23_Sub3_Sub2 local26 = Static592.method7108(this, local3);
		local26.method7100(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "(I)V")
	@Override
	public void method5426(@OriginalArg(0) int arg0) {
		super.aClass179Array3[arg0].method7256(null);
	}

	@OriginalMember(owner = "client!cr", name = "A", descriptor = "()Z")
	@Override
	public boolean method5458() {
		return false;
	}

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "(I)V")
	@Override
	public void method5459(@OriginalArg(0) int arg0) {
		super.aClass179Array3[arg0].method7256(Thread.currentThread());
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5396() {
		@Pc(4) Class179_Sub2 local4 = (Class179_Sub2) this.method1653(Thread.currentThread());
		@Pc(7) Class258 local7 = local4.aClass258_2;
		local7.aBoolean557 = false;
		local7.aBoolean561 = true;
		@Pc(18) int local18 = 5 - super.anInt1829;
		@Pc(23) int local23 = 75 - super.anInt1829;
		@Pc(28) int local28 = 15 - super.anInt1829;
		@Pc(33) int local33 = 10 - super.anInt1808;
		@Pc(38) int local38 = 50 - super.anInt1808;
		@Pc(43) int local43 = 90 - super.anInt1808;
		local7.anInt7598 = 0;
		local7.aBoolean558 = false;
		local7.method6344(local33, local38, local43, local18, local23, local28, -65536, -65536, -65536);
		local7.aBoolean557 = true;
	}

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "(Z)V")
	@Override
	public void method5455(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
	@Override
	public void method5394(@OriginalArg(0) int arg0) {
		super.anInt1805 = arg0;
		super.aClass179Array3 = new Class179_Sub2[super.anInt1805];
		for (@Pc(9) int local9 = 0; local9 < super.anInt1805; local9++) {
			super.aClass179Array3[local9] = new Class179_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!uea;")
	@Override
	public Class179 method1653(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < super.anInt1805; local1++) {
			if (super.aClass179Array3[local1].aRunnable3 == arg0) {
				return super.aClass179Array3[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class179_Sub2 local4 = (Class179_Sub2) this.method1653(Thread.currentThread());
		@Pc(7) Class258 local7 = local4.aClass258_2;
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
		@Pc(106) int local106 = arg0 - local7.method6343();
		@Pc(111) int local111 = arg1 - local7.method6346();
		@Pc(115) int local115 = local106 + local79;
		@Pc(119) int local119 = local106 - local87;
		@Pc(125) int local125 = local106 + local11 - local87;
		@Pc(131) int local131 = local106 + local11 + local79;
		@Pc(135) int local135 = local111 + local93;
		@Pc(139) int local139 = local111 - local101;
		@Pc(145) int local145 = local111 + local15 - local101;
		@Pc(151) int local151 = local111 + local15 + local93;
		local7.anInt7598 = 0;
		local7.aBoolean561 = local115 < 0 || local115 > local7.anInt7600 || local119 < 0 || local119 > local7.anInt7600 || local125 < 0 || local125 > local7.anInt7600;
		local7.method6334(local135, local139, local145, local115, local119, local125, arg4);
		local7.aBoolean561 = local115 < 0 || local115 > local7.anInt7600 || local125 < 0 || local125 > local7.anInt7600 || local131 < 0 || local131 > local7.anInt7600;
		local7.method6334(local135, local145, local151, local115, local125, local131, arg4);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!aca;IIII)V")
	@Override
	public void method1645(@OriginalArg(0) Class5_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt6013;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.h(arg1, arg2, arg4, arg0.anInt6015, 1);
			return;
		}
		if (super.lb != local2) {
			@Pc(32) Class66 local32 = (Class66) super.aClass245_22.method6082((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method1650(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method1643(local2) ? 64 : 128;
				local32 = this.method5423(local38, local48, local48, local48);
				super.aClass245_22.method6075(local32, (long) local2);
			}
			super.lb = local2;
			super.aClass66_19 = local32;
		}
		local8++;
		super.aClass66_19.KA(arg1 - arg4, arg2 - arg4, local8, local8, 0, arg0.anInt6015, 1);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5403(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class6_Sub13 local8 = (Class6_Sub13) super.aClass305_11.method7447((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method8151();
		local8 = Static150.method6203(arg0);
		super.aClass305_11.method7448((long) arg0.hashCode(), local8);
		if (super.aCanvas5 != arg0 || super.aClass66_18 != null) {
			return;
		}
		super.aClass6_Sub13_3 = local8;
		super.anIntArray130 = local8.anIntArray729;
		super.anInt1832 = local8.anInt8669;
		super.anInt1816 = local8.anInt8670;
		this.method1649();
	}

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5465(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas5 = null;
			super.aClass6_Sub13_3 = null;
			if (super.aClass66_18 == null) {
				super.anIntArray130 = null;
				super.anInt1832 = super.anInt1816 = 1;
				this.method1649();
			}
			return;
		}
		@Pc(10) Class6_Sub13 local10 = (Class6_Sub13) super.aClass305_11.method7447((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		super.aCanvas5 = arg0;
		super.aClass6_Sub13_3 = local10;
		if (super.aClass66_18 != null) {
			return;
		}
		super.anIntArray130 = local10.anIntArray729;
		super.anInt1832 = local10.anInt8669;
		super.anInt1816 = local10.anInt8670;
		this.method1649();
		return;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!mr;I)V")
	@Override
	public void method5408(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class5_Sub4[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class23_Sub3_Sub2[] local3 = new Class23_Sub3_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class23_Sub3_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class23_Sub3_Sub2 local26 = Static592.method7108(this, local3);
		local26.method7100(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method1648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface2_11.method3585(arg6).aBoolean656) {
			this.h(arg0, arg1, arg3, arg7, arg9);
			return;
		}
		if (super.lb != arg6) {
			@Pc(26) Class66 local26 = (Class66) super.aClass245_22.method6082((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method1650(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method1643(arg6) ? 64 : 128;
				local26 = this.method5423(local32, local43, local43, local43);
				super.aClass245_22.method6075(local26, (long) arg6);
			}
			super.lb = arg6;
			super.aClass66_19 = local26;
		}
		super.aClass66_19.KA(arg0 - arg3, arg1 - arg4, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class62 method5415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class62_Sub1_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!qda;IIII)Lclient!ba;")
	@Override
	public Class23 method5404(@OriginalArg(0) Class260 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class23_Sub3_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}
}
