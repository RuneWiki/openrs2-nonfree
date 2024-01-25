import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ac", name = "qb", descriptor = "[I")
	public int[] anIntArray16;

	@OriginalMember(owner = "client!ac", name = "Fb", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!ac", name = "Ib", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class4_Sub1_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "()Z")
	@Override
	public boolean method7166() {
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "()V")
	@Override
	public void method7202() {
		@Pc(9) int local9 = this.anIntArray16.length;
		@Pc(16) int local16 = local9 - local9 & 0x7;
		@Pc(18) int local18 = 0;
		while (local16 > local18) {
			this.anIntArray16[local18++] = Integer.MAX_VALUE;
			this.anIntArray16[local18++] = Integer.MAX_VALUE;
			this.anIntArray16[local18++] = Integer.MAX_VALUE;
			this.anIntArray16[local18++] = Integer.MAX_VALUE;
			this.anIntArray16[local18++] = Integer.MAX_VALUE;
			this.anIntArray16[local18++] = Integer.MAX_VALUE;
			this.anIntArray16[local18++] = Integer.MAX_VALUE;
			this.anIntArray16[local18++] = Integer.MAX_VALUE;
		}
		while (local9 > local18) {
			this.anIntArray16[local18++] = Integer.MAX_VALUE;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!vc;")
	@Override
	public Class200 method2741(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; local7 < super.anInt2883; local7++) {
			if (super.aClass200Array3[local7].aRunnable3 == arg0) {
				return super.aClass200Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
	@Override
	public void method7213(@OriginalArg(0) int arg0) {
		super.aClass200Array3[arg0].method5586(null);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7215() {
		@Pc(10) Class200_Sub1 local10 = (Class200_Sub1) this.method2741(Thread.currentThread());
		@Pc(13) Class298 local13 = local10.aClass298_2;
		local13.aBoolean664 = false;
		local13.aBoolean665 = true;
		local13.anInt8806 = 0;
		local13.aBoolean663 = false;
		local13.method7694(10, 50, 90, 5, 75, 15, 0, 0, 0, -65536, -65536, -65536);
		local13.aBoolean664 = true;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class200_Sub1 local10 = (Class200_Sub1) this.method2741(Thread.currentThread());
		@Pc(13) Class298 local13 = local10.aClass298_2;
		@Pc(18) int local18 = arg2 - arg0;
		@Pc(23) int local23 = arg3 - arg1;
		@Pc(33) int local33 = local18 >= 0 ? local18 : -local18;
		@Pc(40) int local40 = local23 < 0 ? -local23 : local23;
		@Pc(42) int local42 = local33;
		if (local40 > local33) {
			local42 = local40;
		}
		if (local42 == 0) {
			return;
		}
		@Pc(59) int local59 = (local18 << 16) / local42;
		@Pc(65) int local65 = (local23 << 16) / local42;
		local18 += local59 >> 16;
		local23 += local65 >> 16;
		if (local65 > local59) {
			local65 = -local65;
		} else {
			local59 = -local59;
		}
		@Pc(98) int local98 = arg5 * local65 >> 17;
		@Pc(106) int local106 = local65 * arg5 + 1 >> 17;
		@Pc(112) int local112 = arg5 * local59 >> 17;
		@Pc(120) int local120 = arg5 * local59 + 1 >> 17;
		@Pc(125) int local125 = arg0 - local13.method7686();
		@Pc(130) int local130 = arg1 - local13.method7698();
		@Pc(135) int local135 = local125 + local98;
		@Pc(139) int local139 = local125 - local106;
		@Pc(146) int local146 = local18 + local125 - local106;
		@Pc(153) int local153 = local125 + local18 + local98;
		@Pc(158) int local158 = local130 + local112;
		@Pc(162) int local162 = local130 - local120;
		@Pc(168) int local168 = local23 + local130 - local120;
		@Pc(175) int local175 = local112 + local130 + local23;
		local13.anInt8806 = 0;
		local13.aBoolean665 = local135 < 0 || local13.anInt8805 < local135 || local139 < 0 || local139 > local13.anInt8805 || local146 < 0 || local146 > local13.anInt8805;
		local13.method7693(local158, local162, local168, local135, local139, local146, 0, 0, 0, arg4);
		local13.aBoolean665 = local135 < 0 || local13.anInt8805 < local135 || local139 < 0 || local139 > local13.anInt8805 || local153 < 0 || local153 > local13.anInt8805;
		local13.method7693(local158, local168, local175, local135, local146, local153, 0, 0, 0, arg4);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ei;IIII)Lclient!r;")
	@Override
	public Class97 method7192(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class97_Sub1_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([Lclient!r;Lclient!ka;Lclient!m;[Lclient!cf;I)V")
	@Override
	public void method7175(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) Class46_Sub1[] arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class97_Sub1_Sub2[] local9 = new Class97_Sub1_Sub2[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class97_Sub1_Sub2) arg0[local11];
			}
		}
		@Pc(33) Class97_Sub1_Sub2 local33 = Static550.method5552(this, local9);
		local33.method5540(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!cf;I)V")
	@Override
	public void method7159(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) Class46_Sub1[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method6773(arg1, arg2 == null ? null : arg2[0], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class7 method7187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class7_Sub2_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7158(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class1_Sub13 local12 = (Class1_Sub13) super.aClass230_20.method6144((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method8239();
		local12 = Static16.method8191(arg0);
		super.aClass230_20.method6139((long) arg0.hashCode(), local12);
		if (arg0 != super.aCanvas6 || super.aClass104_12 != null) {
			return;
		}
		super.anInt2885 = local12.anInt9491;
		super.aClass1_Sub13_3 = local12;
		super.anInt2871 = local12.anInt9492;
		super.anIntArray248 = local12.anIntArray833;
		this.method2738();
		return;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
	@Override
	public void method7196(@OriginalArg(0) int arg0) {
		super.aClass200Array3[arg0].method5586(Thread.currentThread());
	}

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "()V")
	@Override
	protected void method2739() {
		super.anInt2884 = super.anInt2896 - super.anInt2879;
		super.anInt2892 = -super.anInt2879 + super.anInt2893;
		super.anInt2874 = super.anInt2882 - super.anInt2887;
		super.anInt2875 = -super.anInt2887 + super.anInt2869;
		for (@Pc(39) int local39 = 0; super.anInt2883 > local39; local39++) {
			@Pc(48) Class298 local48 = ((Class200_Sub1) super.aClass200Array3[local39]).aClass298_2;
			local48.anInt8809 = -super.anInt2896 + super.anInt2879;
			local48.anInt8808 = -super.anInt2869 + super.anInt2887;
			local48.anInt8805 = super.anInt2893 - super.anInt2896;
			local48.anInt8810 = super.anInt2882 - super.anInt2869;
		}
		@Pc(97) int local97 = super.anInt2896 + super.anInt2885 * super.anInt2869;
		for (@Pc(100) int local100 = super.anInt2869; local100 < super.anInt2882; local100++) {
			for (@Pc(104) int local104 = 0; super.anInt2883 > local104; local104++) {
				((Class200_Sub1) super.aClass200Array3[local104]).aClass298_2.anIntArray767[local100 - super.anInt2869] = local97;
			}
			local97 += super.anInt2885;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	@Override
	public void method7185(@OriginalArg(0) int arg0) {
		super.anInt2883 = arg0;
		super.aClass200Array3 = new Class200_Sub1[super.anInt2883];
		for (@Pc(15) int local15 = 0; super.anInt2883 > local15; local15++) {
			super.aClass200Array3[local15] = new Class200_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7174(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas6 = null;
			super.aClass1_Sub13_3 = null;
			if (super.aClass104_12 == null) {
				super.anIntArray248 = null;
				this.anInt160 = this.anInt157 = 1;
				super.anInt2885 = super.anInt2871 = 1;
				this.method2738();
			}
			return;
		}
		@Pc(41) Class1_Sub13 local41 = (Class1_Sub13) super.aClass230_20.method6144((long) arg0.hashCode());
		if (local41 == null) {
			return;
		}
		super.aCanvas6 = arg0;
		super.aClass1_Sub13_3 = local41;
		if (super.aClass104_12 != null) {
			return;
		}
		super.anInt2885 = local41.anInt9491;
		super.anInt2871 = local41.anInt9492;
		super.anIntArray248 = local41.anIntArray833;
		if (super.anInt2885 != this.anInt160 || super.anInt2871 != this.anInt157) {
			this.anInt160 = super.anInt2885;
			this.anInt157 = super.anInt2871;
			this.anIntArray16 = new int[this.anInt157 * this.anInt160];
		}
		this.method2738();
		return;
	}
}
