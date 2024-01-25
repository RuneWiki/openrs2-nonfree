import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jca")
public final class Class62_Sub2_Sub1 extends Class62_Sub2 {

	@OriginalMember(owner = "client!jca", name = "rb", descriptor = "[I")
	public int[] anIntArray295;

	@OriginalMember(owner = "client!jca", name = "Fb", descriptor = "I")
	private int anInt4303;

	@OriginalMember(owner = "client!jca", name = "Mb", descriptor = "I")
	private int anInt4310;

	static {
		new Class40("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
	}

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class62_Sub2_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class178_Sub1 local10 = (Class178_Sub1) this.method7071(Thread.currentThread());
		@Pc(13) Class317 local13 = local10.aClass317_2;
		@Pc(18) int local18 = arg2 - arg0;
		@Pc(23) int local23 = arg3 - arg1;
		@Pc(30) int local30 = local18 >= 0 ? local18 : -local18;
		@Pc(40) int local40 = local23 < 0 ? -local23 : local23;
		@Pc(42) int local42 = local30;
		if (local30 < local40) {
			local42 = local40;
		}
		if (local42 == 0) {
			return;
		}
		@Pc(59) int local59 = (local18 << 16) / local42;
		@Pc(65) int local65 = (local23 << 16) / local42;
		local18 += local59 >> 16;
		local23 += local65 >> 16;
		if (local59 < local65) {
			local65 = -local65;
		} else {
			local59 = -local59;
		}
		@Pc(98) int local98 = arg5 * local65 >> 17;
		@Pc(106) int local106 = local65 * arg5 + 1 >> 17;
		@Pc(112) int local112 = local59 * arg5 >> 17;
		@Pc(117) int local117 = arg0 - local13.method7410();
		@Pc(125) int local125 = arg5 * local59 + 1 >> 17;
		@Pc(130) int local130 = arg1 - local13.method7419();
		@Pc(134) int local134 = local98 + local117;
		@Pc(139) int local139 = local117 - local106;
		@Pc(146) int local146 = local18 + local117 - local106;
		@Pc(152) int local152 = local117 + local18 + local98;
		@Pc(156) int local156 = local112 + local130;
		@Pc(161) int local161 = local130 - local125;
		@Pc(168) int local168 = local23 + local130 - local125;
		@Pc(175) int local175 = local23 + local130 + local112;
		local13.anInt9123 = 0;
		local13.aBoolean669 = local134 < 0 || local134 > local13.anInt9122 || local139 < 0 || local139 > local13.anInt9122 || local146 < 0 || local13.anInt9122 < local146;
		local13.method7412(local156, local161, local168, local134, local139, local146, 0, 0, 0, arg4);
		local13.aBoolean669 = local134 < 0 || local13.anInt9122 < local134 || local139 < 0 || local13.anInt9122 < local139 || local152 < 0 || local152 > local13.anInt9122;
		local13.method7412(local156, local168, local175, local134, local146, local152, 0, 0, 0, arg4);
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7015(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas15 = null;
			super.aClass5_Sub34_3 = null;
			if (super.aClass25_27 == null) {
				super.anIntArray672 = null;
				super.anInt8670 = super.anInt8683 = 1;
				this.anInt4303 = this.anInt4310 = 1;
				this.method7081();
			}
			return;
		}
		@Pc(10) Class5_Sub34 local10 = (Class5_Sub34) super.aClass42_39.method1109((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		super.aClass5_Sub34_3 = local10;
		super.aCanvas15 = arg0;
		if (super.aClass25_27 != null) {
			return;
		}
		super.anInt8683 = local10.anInt7960;
		super.anIntArray672 = local10.anIntArray603;
		super.anInt8670 = local10.anInt7959;
		if (super.anInt8670 != this.anInt4303 || super.anInt8683 != this.anInt4310) {
			this.anInt4310 = super.anInt8683;
			this.anInt4303 = super.anInt8670;
			this.anIntArray295 = new int[this.anInt4310 * this.anInt4303];
		}
		this.method7081();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!kw;")
	@Override
	public Class178 method7071(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; super.anInt8686 > local7; local7++) {
			if (super.aClass178Array3[local7].aRunnable3 == arg0) {
				return super.aClass178Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jca", name = "E", descriptor = "()V")
	@Override
	protected void method7072() {
		super.anInt8696 = super.anInt8685 - super.anInt8676;
		super.lb = super.anInt8673 - super.anInt8676;
		super.anInt8692 = -super.anInt8694 + super.anInt8672;
		super.anInt8693 = -super.anInt8694 + super.anInt8695;
		for (@Pc(38) int local38 = 0; local38 < super.anInt8686; local38++) {
			@Pc(47) Class317 local47 = ((Class178_Sub1) super.aClass178Array3[local38]).aClass317_2;
			local47.anInt9121 = super.anInt8676 - super.anInt8673;
			local47.anInt9122 = super.anInt8685 - super.anInt8673;
			local47.anInt9124 = -super.anInt8695 + super.anInt8694;
			local47.anInt9120 = super.anInt8672 - super.anInt8695;
		}
		@Pc(96) int local96 = super.anInt8673 + super.anInt8670 * super.anInt8695;
		for (@Pc(99) int local99 = super.anInt8695; local99 < super.anInt8672; local99++) {
			for (@Pc(103) int local103 = 0; local103 < super.anInt8686; local103++) {
				((Class178_Sub1) super.aClass178Array3[local103]).aClass317_2.anIntArray727[local99 - super.anInt8695] = local96;
			}
			local96 += super.anInt8670;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "([Lclient!r;Lclient!sh;Lclient!m;[Lclient!paa;I)V")
	@Override
	public void method7008(@OriginalArg(0) Class36[] arg0, @OriginalArg(1) Class267 arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) Class30_Sub6[] arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class36_Sub1_Sub1[] local9 = new Class36_Sub1_Sub1[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class36_Sub1_Sub1) arg0[local11];
			}
		}
		@Pc(37) Class36_Sub1_Sub1 local37 = Static548.method1025(this, local9);
		local37.method7383(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(I)V")
	@Override
	public void method7001(@OriginalArg(0) int arg0) {
		super.aClass178Array3[arg0].method5645(Thread.currentThread());
	}

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "(I)V")
	@Override
	public void method7060(@OriginalArg(0) int arg0) {
		super.aClass178Array3[arg0].method5645(null);
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "()V")
	@Override
	public void method6999() {
		@Pc(9) int local9 = this.anIntArray295.length;
		@Pc(16) int local16 = local9 - local9 & 0x7;
		@Pc(18) int local18 = 0;
		while (local16 > local18) {
			this.anIntArray295[local18++] = Integer.MAX_VALUE;
			this.anIntArray295[local18++] = Integer.MAX_VALUE;
			this.anIntArray295[local18++] = Integer.MAX_VALUE;
			this.anIntArray295[local18++] = Integer.MAX_VALUE;
			this.anIntArray295[local18++] = Integer.MAX_VALUE;
			this.anIntArray295[local18++] = Integer.MAX_VALUE;
			this.anIntArray295[local18++] = Integer.MAX_VALUE;
			this.anIntArray295[local18++] = Integer.MAX_VALUE;
		}
		while (local9 > local18) {
			this.anIntArray295[local18++] = Integer.MAX_VALUE;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!ld;IIII)Lclient!r;")
	@Override
	public Class36 method7012(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class36_Sub1_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7038(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class5_Sub34 local12 = (Class5_Sub34) super.aClass42_39.method1109((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method7425();
		local12 = Static345.method5369(arg0);
		super.aClass42_39.method1106((long) arg0.hashCode(), local12);
		if (super.aCanvas15 != arg0 || super.aClass25_27 != null) {
			return;
		}
		super.aClass5_Sub34_3 = local12;
		super.anIntArray672 = local12.anIntArray603;
		super.anInt8683 = local12.anInt7960;
		super.anInt8670 = local12.anInt7959;
		this.method7081();
		return;
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V")
	@Override
	public void method6997(@OriginalArg(0) int arg0) {
		super.anInt8686 = arg0;
		super.aClass178Array3 = new Class178_Sub1[super.anInt8686];
		for (@Pc(15) int local15 = 0; super.anInt8686 > local15; local15++) {
			super.aClass178Array3[local15] = new Class178_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6995() {
		@Pc(10) Class178_Sub1 local10 = (Class178_Sub1) this.method7071(Thread.currentThread());
		@Pc(13) Class317 local13 = local10.aClass317_2;
		local13.aBoolean669 = true;
		local13.aBoolean667 = false;
		local13.anInt9123 = 0;
		local13.aBoolean666 = false;
		local13.method7405(10, 50, 90, 5, 75, 15, 0, 0, 0, -65536, -65536, -65536);
		local13.aBoolean667 = true;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class131 method7051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class131_Sub2_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!paa;I)V")
	@Override
	public void method7019(@OriginalArg(0) Class36[] arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) Class30_Sub6[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method7360(arg1, arg2 == null ? null : arg2[0], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!jca", name = "B", descriptor = "()Z")
	@Override
	public boolean method7062() {
		return true;
	}
}
