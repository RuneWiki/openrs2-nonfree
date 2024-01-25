import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!hv", name = "xb", descriptor = "I")
	private int anInt4380;

	@OriginalMember(owner = "client!hv", name = "Bb", descriptor = "I")
	private int anInt4384;

	@OriginalMember(owner = "client!hv", name = "Cb", descriptor = "[I")
	public int[] anIntArray408;

	static {
		new Class67("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class5_Sub2_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class52 method7432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class52_Sub1_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class99_Sub1 local10 = (Class99_Sub1) this.method7497(Thread.currentThread());
		@Pc(13) Class40 local13 = local10.lb;
		@Pc(18) int local18 = arg2 - arg0;
		@Pc(23) int local23 = arg3 - arg1;
		@Pc(30) int local30 = local18 >= 0 ? local18 : -local18;
		@Pc(37) int local37 = local23 >= 0 ? local23 : -local23;
		@Pc(39) int local39 = local30;
		if (local30 < local37) {
			local39 = local37;
		}
		if (local39 == 0) {
			return;
		}
		@Pc(53) int local53 = (local18 << 16) / local39;
		@Pc(59) int local59 = (local23 << 16) / local39;
		local18 += local53 >> 16;
		local23 += local59 >> 16;
		if (local59 <= local53) {
			local53 = -local53;
		} else {
			local59 = -local59;
		}
		@Pc(88) int local88 = local59 * arg5 >> 17;
		@Pc(96) int local96 = local59 * arg5 + 1 >> 17;
		@Pc(102) int local102 = local53 * arg5 >> 17;
		@Pc(110) int local110 = local53 * arg5 + 1 >> 17;
		@Pc(115) int local115 = arg0 - local13.method1054();
		@Pc(120) int local120 = arg1 - local13.method1049();
		@Pc(124) int local124 = local88 + local115;
		@Pc(129) int local129 = local115 - local96;
		@Pc(137) int local137 = local115 + local18 - local96;
		@Pc(144) int local144 = local88 + local115 + local18;
		@Pc(149) int local149 = local120 + local102;
		@Pc(153) int local153 = local120 - local110;
		@Pc(161) int local161 = local120 + local23 - local110;
		@Pc(168) int local168 = local23 + local120 + local102;
		local13.anInt1115 = 0;
		local13.aBoolean84 = local124 < 0 || local13.anInt1114 < local124 || local129 < 0 || local129 > local13.anInt1114 || local137 < 0 || local13.anInt1114 < local137;
		local13.method1047(local149, local153, local161, local124, local129, local137, 0, 0, 0, arg4);
		local13.aBoolean84 = local124 < 0 || local124 > local13.anInt1114 || local129 < 0 || local13.anInt1114 < local129 || local144 < 0 || local144 > local13.anInt1114;
		local13.method1047(local149, local161, local168, local124, local137, local144, 0, 0, 0, arg4);
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7442(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class3_Sub6 local12 = (Class3_Sub6) super.aClass267_44.method6644((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method7820();
		local12 = Static9.method6181(arg0);
		super.aClass267_44.method6640(local12, (long) arg0.hashCode());
		if (arg0 != super.aCanvas14 || super.aClass119_32 != null) {
			return;
		}
		super.aClass3_Sub6_3 = local12;
		super.anInt9070 = local12.anInt2586;
		super.anInt9076 = local12.anInt2588;
		super.anIntArray762 = local12.anIntArray259;
		this.method7494();
		return;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!sda;I)V")
	@Override
	public void method7468(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) Class4_Sub7[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method5774(arg1, arg2 == null ? null : arg2[0], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7436() {
		@Pc(10) Class99_Sub1 local10 = (Class99_Sub1) this.method7497(Thread.currentThread());
		@Pc(13) Class40 local13 = local10.lb;
		@Pc(18) int local18 = 75 - super.anInt9057;
		@Pc(23) int local23 = 10 - super.anInt9060;
		@Pc(28) int local28 = 90 - super.anInt9060;
		@Pc(33) int local33 = 15 - super.anInt9057;
		@Pc(38) int local38 = 5 - super.anInt9057;
		@Pc(43) int local43 = 50 - super.anInt9060;
		local13.aBoolean82 = false;
		local13.aBoolean84 = true;
		local13.anInt1115 = 0;
		local13.aBoolean86 = false;
		local13.method1050(local23, local43, local28, local38, local18, local33, 0, 0, 0, -65536, -65536, -65536);
		local13.aBoolean82 = true;
	}

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "(I)V")
	@Override
	public void method7454(@OriginalArg(0) int arg0) {
		super.aClass99Array3[arg0].method4757(null);
	}

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "(I)V")
	@Override
	public void method7438(@OriginalArg(0) int arg0) {
		super.aClass99Array3[arg0].method4757(Thread.currentThread());
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7422(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas14 = null;
			super.aClass3_Sub6_3 = null;
			if (super.aClass119_32 == null) {
				this.anInt4380 = this.anInt4384 = 1;
				super.anInt9076 = super.anInt9070 = 1;
				super.anIntArray762 = null;
				this.method7494();
			}
			return;
		}
		@Pc(38) Class3_Sub6 local38 = (Class3_Sub6) super.aClass267_44.method6644((long) arg0.hashCode());
		if (local38 == null) {
			return;
		}
		super.aClass3_Sub6_3 = local38;
		super.aCanvas14 = arg0;
		if (super.aClass119_32 != null) {
			return;
		}
		super.anInt9070 = local38.anInt2586;
		super.anIntArray762 = local38.anIntArray259;
		super.anInt9076 = local38.anInt2588;
		if (this.anInt4380 != super.anInt9076 || super.anInt9070 != this.anInt4384) {
			this.anInt4384 = super.anInt9070;
			this.anInt4380 = super.anInt9076;
			this.anIntArray408 = new int[this.anInt4384 * this.anInt4380];
		}
		this.method7494();
	}

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "()V")
	@Override
	public void method7444() {
		@Pc(9) int local9 = this.anIntArray408.length;
		@Pc(16) int local16 = local9 - local9 & 0x7;
		@Pc(18) int local18 = 0;
		while (local18 < local16) {
			this.anIntArray408[local18++] = Integer.MAX_VALUE;
			this.anIntArray408[local18++] = Integer.MAX_VALUE;
			this.anIntArray408[local18++] = Integer.MAX_VALUE;
			this.anIntArray408[local18++] = Integer.MAX_VALUE;
			this.anIntArray408[local18++] = Integer.MAX_VALUE;
			this.anIntArray408[local18++] = Integer.MAX_VALUE;
			this.anIntArray408[local18++] = Integer.MAX_VALUE;
			this.anIntArray408[local18++] = Integer.MAX_VALUE;
		}
		while (local9 > local18) {
			this.anIntArray408[local18++] = Integer.MAX_VALUE;
		}
	}

	@OriginalMember(owner = "client!hv", name = "w", descriptor = "()Z")
	@Override
	public boolean method7462() {
		return true;
	}

	@OriginalMember(owner = "client!hv", name = "E", descriptor = "()V")
	@Override
	protected void method7492() {
		super.anInt9073 = super.anInt9049 - super.anInt9058;
		super.anInt9060 = super.anInt9069 - super.anInt9058;
		super.anInt9057 = super.anInt9064 - super.lb;
		super.anInt9066 = -super.lb + super.anInt9068;
		for (@Pc(36) int local36 = 0; local36 < super.anInt9048; local36++) {
			@Pc(45) Class40 local45 = ((Class99_Sub1) super.aClass99Array3[local36]).lb;
			local45.anInt1114 = -super.anInt9064 + super.anInt9068;
			local45.anInt1112 = super.anInt9049 - super.anInt9069;
			local45.anInt1113 = super.anInt9058 - super.anInt9069;
			local45.anInt1111 = super.lb - super.anInt9064;
		}
		@Pc(89) int local89 = super.anInt9076 * super.anInt9069 + super.anInt9064;
		for (@Pc(92) int local92 = super.anInt9069; super.anInt9049 > local92; local92++) {
			for (@Pc(96) int local96 = 0; local96 < super.anInt9048; local96++) {
				((Class99_Sub1) super.aClass99Array3[local96]).lb.anIntArray151[local92 - super.anInt9069] = local89;
			}
			local89 += super.anInt9076;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!nw;")
	@Override
	public Class99 method7497(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; super.anInt9048 > local7; local7++) {
			if (arg0 == super.aClass99Array3[local7].aRunnable3) {
				return super.aClass99Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "(I)V")
	@Override
	public void method7474(@OriginalArg(0) int arg0) {
		super.anInt9048 = arg0;
		super.aClass99Array3 = new Class99_Sub1[super.anInt9048];
		for (@Pc(15) int local15 = 0; super.anInt9048 > local15; local15++) {
			super.aClass99Array3[local15] = new Class99_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!or;IIII)Lclient!ba;")
	@Override
	public Class2 method7443(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class2_Sub1_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "([Lclient!ba;Lclient!be;Lclient!q;[Lclient!sda;I)V")
	@Override
	public void method7478(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class4_Sub7[] arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class2_Sub1_Sub2[] local9 = new Class2_Sub1_Sub2[arg0.length];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11] != null) {
				local9[local11] = (Class2_Sub1_Sub2) arg0[local11];
			}
		}
		@Pc(37) Class2_Sub1_Sub2 local37 = Static558.method5817(this, local9);
		local37.method5804(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}
}
