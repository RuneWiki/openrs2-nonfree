import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class109_Sub2 extends Class109 {

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
	private int anInt5858;

	@OriginalMember(owner = "client!ra", name = "y", descriptor = "Lclient!mu;")
	private Class1_Sub11 aClass1_Sub11_1;

	@OriginalMember(owner = "client!ra", name = "C", descriptor = "[Lclient!ur;")
	private Class244[] aClass244Array1;

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
	public int anInt5862;

	@OriginalMember(owner = "client!ra", name = "H", descriptor = "F")
	private float aFloat84;

	@OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
	public int anInt5866;

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
	public int anInt5868;

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
	public int anInt5869;

	@OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
	public int anInt5870;

	@OriginalMember(owner = "client!ra", name = "Q", descriptor = "Z")
	public boolean aBoolean381;

	@OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
	private int anInt5877;

	@OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
	public int anInt5879;

	@OriginalMember(owner = "client!ra", name = "cb", descriptor = "F")
	private float aFloat85;

	@OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
	public int anInt5881;

	@OriginalMember(owner = "client!ra", name = "eb", descriptor = "Lclient!f;")
	private Class80 aClass80_14;

	@OriginalMember(owner = "client!ra", name = "gb", descriptor = "I")
	public int anInt5883;

	@OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
	public int anInt5884;

	@OriginalMember(owner = "client!ra", name = "mb", descriptor = "[I")
	public int[] anIntArray465;

	@OriginalMember(owner = "client!ra", name = "ob", descriptor = "I")
	public int anInt5887;

	@OriginalMember(owner = "client!ra", name = "pb", descriptor = "I")
	public int anInt5888;

	@OriginalMember(owner = "client!ra", name = "rb", descriptor = "Lclient!f;")
	private Class80 aClass80_15;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "Z")
	private boolean aBoolean378;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "Z")
	private boolean aBoolean379;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "Lclient!bj;")
	private Class27 aClass27_32;

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
	public int anInt5859;

	@OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
	public int anInt5865;

	@OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
	public int anInt5860;

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
	private int anInt5867;

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
	private int anInt5873;

	@OriginalMember(owner = "client!ra", name = "I", descriptor = "Z")
	public boolean aBoolean380;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
	public int anInt5863;

	@OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
	public int anInt5872;

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
	public int anInt5861;

	@OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
	private int anInt5874;

	@OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
	public int anInt5876;

	@OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
	private int anInt5871;

	@OriginalMember(owner = "client!ra", name = "Z", descriptor = "I")
	public int anInt5878;

	@OriginalMember(owner = "client!ra", name = "W", descriptor = "Z")
	private boolean aBoolean382;

	@OriginalMember(owner = "client!ra", name = "fb", descriptor = "I")
	public int anInt5882;

	@OriginalMember(owner = "client!ra", name = "kb", descriptor = "I")
	public int anInt5885;

	@OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
	public int anInt5880;

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
	public int anInt5864;

	@OriginalMember(owner = "client!ra", name = "V", descriptor = "I")
	public int anInt5875;

	@OriginalMember(owner = "client!ra", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!ra", name = "nb", descriptor = "I")
	public int anInt5886;

	@OriginalMember(owner = "client!ra", name = "hb", descriptor = "Lclient!ff;")
	private final Class83 aClass83_47;

	@OriginalMember(owner = "client!ra", name = "qb", descriptor = "I")
	private int anInt5889;

	@OriginalMember(owner = "client!ra", name = "ib", descriptor = "Lclient!ff;")
	private final Class83 aClass83_48;

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "Lclient!pj;")
	public Class18_Sub2 aClass18_Sub2_2;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(ILclient!m;)V")
	private Class109_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		super(arg0, arg1);
		this.aBoolean378 = false;
		this.aBoolean379 = false;
		this.aClass27_32 = new Class27(4);
		this.anInt5859 = 75518;
		this.anInt5865 = 0;
		this.anInt5860 = 0;
		this.anInt5867 = 0;
		this.anInt5873 = 0;
		this.aBoolean380 = false;
		this.anInt5863 = 45823;
		this.anInt5872 = 78642;
		this.anInt5861 = 0;
		this.anInt5874 = 0;
		this.anInt5876 = 512;
		this.anInt5871 = 3500;
		this.anInt5878 = 0;
		this.aBoolean382 = false;
		this.anInt5882 = 0;
		this.anInt5885 = 3500;
		this.anInt5880 = 0;
		this.anInt5864 = this.anInt5871 - 255;
		this.anInt5875 = 50;
		this.lb = 512;
		this.anInt5886 = 0;
		this.aClass83_47 = new Class83(16);
		this.anInt5889 = -1;
		this.aClass83_48 = new Class83(20);
		this.aClass18_Sub2_2 = new Class18_Sub2();
		this.method4717(1);
		this.method4725(0);
		Static286.method4044(false);
		this.aBoolean379 = true;
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;)V")
	public Class109_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2) {
		this(arg0, arg2);
		this.method4707(arg1);
		this.method4752(arg1);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.da(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.da(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "()I")
	@Override
	public int g() {
		@Pc(2) int local2 = this.anInt5873;
		this.anInt5873 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "()V")
	@Override
	public void method4740() {
		this.aClass83_48.method1669();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class62 method4746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class62_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "()V")
	@Override
	public void method4704() {
		if (this.aCanvas6 == null || this.aClass1_Sub11_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas6.getGraphics();
			this.aClass1_Sub11_1.method5037(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!qb;)V")
	@Override
	public void method4702(@OriginalArg(0) Class185 arg0) {
		@Pc(3) Class39_Sub2 local3 = arg0.aClass212_1.aClass39_Sub2_3;
		for (@Pc(6) Class39_Sub2 local6 = local3.aClass39_Sub2_8; local6 != local3; local6 = local6.aClass39_Sub2_8) {
			@Pc(10) Class39_Sub2_Sub1 local10 = (Class39_Sub2_Sub1) local6;
			@Pc(15) int local15 = local10.anInt7204 >> 12;
			@Pc(20) int local20 = local10.anInt7206 >> 12;
			@Pc(25) int local25 = local10.anInt7210 >> 12;
			@Pc(49) int local49 = this.aClass18_Sub2_2.anInt5443 + (this.aClass18_Sub2_2.anInt5440 * local15 + this.aClass18_Sub2_2.anInt5439 * local20 + this.aClass18_Sub2_2.anInt5438 * local25 >> 15);
			if (local49 >= this.anInt5875 && local49 <= this.anInt5864) {
				@Pc(90) int local90 = this.anInt5870 + this.anInt5876 * (this.aClass18_Sub2_2.anInt5435 + (this.aClass18_Sub2_2.anInt5442 * local15 + this.aClass18_Sub2_2.anInt5444 * local20 + this.aClass18_Sub2_2.anInt5446 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt5866 + this.lb * (this.aClass18_Sub2_2.anInt5437 + (this.aClass18_Sub2_2.anInt5445 * local15 + this.aClass18_Sub2_2.anInt5441 * local20 + this.aClass18_Sub2_2.anInt5436 * local25 >> 15)) / local49;
				if (local90 >= this.anInt5878 && local90 <= this.anInt5860 && local122 >= this.anInt5861 && local122 <= this.anInt5886) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method4763(local10, local90, local122, (local10.anInt7212 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "(Lclient!ia;)V")
	@Override
	public void m(@OriginalArg(0) Class18 arg0) {
		this.aClass18_Sub2_2 = (Class18_Sub2) arg0;
	}

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "(I)[I")
	public int[] method4756(@OriginalArg(0) int arg0) {
		@Pc(2) Class83 local2 = this.aClass83_48;
		@Pc(12) Class1_Sub38 local12;
		synchronized (this.aClass83_48) {
			local12 = (Class1_Sub38) this.aClass83_48.method1658((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_9.method4837(arg0)) {
					return null;
				}
				@Pc(32) Class151 local32 = super.anInterface7_9.method4836(arg0);
				@Pc(42) int local42 = local32.aBoolean295 || this.aBoolean382 ? 64 : 128;
				local12 = new Class1_Sub38(arg0, local42, super.anInterface7_9.method4839(true, local42, 0.7F, local42, arg0), local32.aBoolean293);
				this.aClass83_48.method1675((long) arg0, local12);
			}
		}
		local12.aBoolean387 = true;
		return local12.method4822();
	}

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "()F")
	@Override
	public float w() {
		return this.aFloat85;
	}

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "(FF)V")
	@Override
	public void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat84 = arg0;
		this.aFloat85 = arg1;
		this.method4767();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "()Z")
	@Override
	public boolean method4686() {
		return true;
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
	@Override
	public void method4717(@OriginalArg(0) int arg0) {
		if (this.anInt5887 == arg0) {
			return;
		}
		this.anInt5887 = arg0;
		this.aClass244Array1 = new Class244[this.anInt5887];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5887; local14++) {
			this.aClass244Array1[local14] = new Class244(this);
		}
	}

	@OriginalMember(owner = "client!ra", name = "IA", descriptor = "(IIII)[I")
	@Override
	public int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt5884 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray465[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIII)V")
	public void method4757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface7_9.method4836(arg5).aBoolean291) {
			this.O(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt5889 != arg5) {
			@Pc(26) Class80 local26 = (Class80) this.aClass83_47.method1658((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method4761(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method4765(arg5) ? 64 : 128;
				local26 = this.method4739(local32, local43, local43, local43);
				this.aClass83_47.method1675((long) arg5, local26);
			}
			this.anInt5889 = arg5;
			this.aClass80_15 = local26;
		}
		this.aClass80_15.M(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!ra", name = "A", descriptor = "()Z")
	public boolean method4758() {
		return this.aBoolean378;
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "()V")
	@Override
	public void method4696() {
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "()I")
	@Override
	public int d() {
		return this.anInt5875;
	}

	@OriginalMember(owner = "client!ra", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5865 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt5865 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt5865 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt5865 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt5865 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean381 = false;
		} else {
			this.aBoolean381 = true;
		}
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4752(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas6 = null;
			this.aClass1_Sub11_1 = null;
			if (this.aClass80_14 == null) {
				this.anIntArray465 = null;
				this.anInt5884 = this.anInt5877 = 1;
				this.method4762();
			}
			return;
		}
		@Pc(10) Class1_Sub11 local10 = (Class1_Sub11) this.aClass27_32.method553((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas6 = arg0;
		this.aClass1_Sub11_1 = local10;
		if (this.aClass80_14 != null) {
			return;
		}
		this.anIntArray465 = local10.anIntArray512;
		this.anInt5884 = local10.anInt6235;
		this.anInt5877 = local10.anInt6233;
		this.method4762();
		return;
	}

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "()Z")
	@Override
	public boolean method4703() {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V")
	@Override
	public void method4698(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "(I)Z")
	public boolean method4759(@OriginalArg(0) int arg0) {
		return super.anInterface7_9.method4837(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!nh;I)V")
	@Override
	public void method4718(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) Class39_Sub7[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class37_Sub1[] local3 = new Class37_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class37_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class37_Sub1 local26 = Static76.method1330(this, local3);
		local26.method1325(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class80 method4714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt5884 + arg0;
		@Pc(16) int local16 = this.anInt5884 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray465[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class80_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class80_Sub1_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIF)Lclient!pe;")
	@Override
	public Class1_Sub5 method4692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "()V")
	private void method4760() {
		this.anInt5883 = this.anInt5878 - this.anInt5870;
		this.anInt5888 = this.anInt5860 - this.anInt5870;
		this.anInt5879 = this.anInt5861 - this.anInt5866;
		this.anInt5881 = this.anInt5886 - this.anInt5866;
		for (@Pc(29) int local29 = 0; local29 < this.anInt5887; local29++) {
			@Pc(36) Class38 local36 = this.aClass244Array1[local29].aClass38_2;
			local36.anInt809 = this.anInt5870 - this.anInt5878;
			local36.anInt811 = this.anInt5866 - this.anInt5861;
			local36.anInt810 = this.anInt5860 - this.anInt5878;
			local36.anInt813 = this.anInt5886 - this.anInt5861;
		}
		@Pc(78) int local78 = this.anInt5861 * this.anInt5884 + this.anInt5878;
		for (@Pc(81) int local81 = this.anInt5861; local81 < this.anInt5886; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt5887; local84++) {
				this.aClass244Array1[local84].aClass38_2.anIntArray55[local81 - this.anInt5861] = local78;
			}
			local78 += this.anInt5884;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lclient!c;Lclient!qb;Lclient!ia;[Lclient!nh;I)V")
	@Override
	public void method4688(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) Class39_Sub7[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class37_Sub1[] local3 = new Class37_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class37_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class37_Sub1 local26 = Static76.method1330(this, local3);
		local26.method1325(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!ra", name = "JA", descriptor = "(II)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5875 = arg0;
		this.anInt5871 = arg1;
		this.anInt5864 = this.anInt5871 - 255;
		this.method4767();
	}

	@OriginalMember(owner = "client!ra", name = "NA", descriptor = "(IIIIII)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt5878) {
			arg2 -= this.anInt5878 - arg0;
			arg0 = this.anInt5878;
		}
		if (arg1 < this.anInt5861) {
			arg3 -= this.anInt5861 - arg1;
			arg1 = this.anInt5861;
		}
		if (arg0 + arg2 > this.anInt5860) {
			arg2 = this.anInt5860 - arg0;
		}
		if (arg1 + arg3 > this.anInt5886) {
			arg3 = this.anInt5886 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt5860 || arg1 > this.anInt5886) {
			return;
		}
		@Pc(67) int local67 = this.anInt5884 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt5884;
		@Pc(78) int local78 = arg4 >>> 24;
		@Pc(90) int local90;
		@Pc(94) int local94;
		@Pc(101) int local101;
		if (arg5 != 0 && (arg5 != 1 || local78 != 255)) {
			@Pc(221) int local221;
			if (arg5 == 1) {
				@Pc(205) int local205 = ((arg4 & 0xFF00FF) * local78 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local78 >> 8 & 0xFF00) + (local78 << 24);
				local90 = 256 - local78;
				for (local94 = 0; local94 < arg3; local94++) {
					for (local101 = -arg2; local101 < 0; local101++) {
						local221 = this.anIntArray465[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray465[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray465[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray465[local74++] = local221 - local298 | local298 - (local298 >>> 8);
					}
					local74 += local67;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local90 = arg2 >> 3;
		local94 = arg2 & 0x7;
		arg2 = local74 - 1;
		for (local101 = -arg3; local101 < 0; local101++) {
			if (local90 > 0) {
				arg0 = local90;
				do {
					arg2++;
					this.anIntArray465[arg2] = arg4;
					arg2++;
					this.anIntArray465[arg2] = arg4;
					arg2++;
					this.anIntArray465[arg2] = arg4;
					arg2++;
					this.anIntArray465[arg2] = arg4;
					arg2++;
					this.anIntArray465[arg2] = arg4;
					arg2++;
					this.anIntArray465[arg2] = arg4;
					arg2++;
					this.anIntArray465[arg2] = arg4;
					arg2++;
					this.anIntArray465[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray465[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!ra", name = "W", descriptor = "()I")
	@Override
	public int W() {
		return this.anInt5871;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4681(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas6 == null || this.aClass1_Sub11_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas6.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt5884 && local21.y <= this.anInt5877 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass1_Sub11_1.method5038(local14, local21.height, local21.y, local21.x, local21.width);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!ra", name = "pa", descriptor = "(IIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt5884) {
			arg2 = this.anInt5884;
		}
		if (arg3 > this.anInt5877) {
			arg3 = this.anInt5877;
		}
		this.anInt5878 = arg0;
		this.anInt5860 = arg2;
		this.anInt5861 = arg1;
		this.anInt5886 = arg3;
		this.method4760();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I")
	@Override
	public int method4699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!pv;Lclient!pv;FLclient!pv;)Lclient!pv;")
	@Override
	public Class78 method4735(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class78 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "()Z")
	@Override
	public boolean method4748() {
		return true;
	}

	@OriginalMember(owner = "client!ra", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5882 = arg0;
		this.anInt5865 = arg1;
		this.anInt5880 = arg2;
	}

	@OriginalMember(owner = "client!ra", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5870 = arg0;
		this.anInt5866 = arg1;
		this.anInt5876 = arg2;
		this.lb = arg3;
		this.method4760();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class244 local3 = this.method4768(Thread.currentThread());
		@Pc(6) Class38 local6 = local3.aClass38_2;
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(14) int local14 = arg3 - arg1;
		@Pc(21) int local21 = local10 >= 0 ? local10 : -local10;
		@Pc(28) int local28 = local14 >= 0 ? local14 : -local14;
		@Pc(30) int local30 = local21;
		if (local21 < local28) {
			local30 = local28;
		}
		if (local30 == 0) {
			return;
		}
		@Pc(44) int local44 = (local10 << 16) / local30;
		@Pc(50) int local50 = (local14 << 16) / local30;
		if (local50 <= local44) {
			local44 = -local44;
		} else {
			local50 = -local50;
		}
		@Pc(66) int local66 = arg5 * local50 >> 17;
		@Pc(74) int local74 = arg5 * local50 + 1 >> 17;
		@Pc(80) int local80 = arg5 * local44 >> 17;
		@Pc(88) int local88 = arg5 * local44 + 1 >> 17;
		@Pc(93) int local93 = arg0 - local6.method741();
		@Pc(98) int local98 = arg1 - local6.method743();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt812 = 0;
		local6.aBoolean32 = local102 < 0 || local102 > local6.anInt810 || local106 < 0 || local106 > local6.anInt810 || local112 < 0 || local112 > local6.anInt810;
		local6.method737(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean32 = local102 < 0 || local102 > local6.anInt810 || local106 < 0 || local106 > local6.anInt810 || local118 < 0 || local118 > local6.anInt810;
		local6.method737(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(Z)V")
	@Override
	public void method4733(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "()Z")
	@Override
	public boolean method4712() {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "y", descriptor = "()Z")
	@Override
	public boolean method4744() {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)I")
	@Override
	public int method4710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4707(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub11 local8 = (Class1_Sub11) this.aClass27_32.method553((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static147.method2219(arg0);
			this.aClass27_32.method564((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "()Z")
	@Override
	public boolean method4687() {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "(I)[I")
	private int[] method4761(@OriginalArg(0) int arg0) {
		@Pc(2) Class83 local2 = this.aClass83_48;
		@Pc(12) Class1_Sub38 local12;
		synchronized (this.aClass83_48) {
			local12 = (Class1_Sub38) this.aClass83_48.method1658((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_9.method4837(arg0)) {
					return null;
				}
				@Pc(32) Class151 local32 = super.anInterface7_9.method4836(arg0);
				@Pc(42) int local42 = local32.aBoolean295 || this.aBoolean382 ? 64 : 128;
				local12 = new Class1_Sub38(arg0, local42, super.anInterface7_9.method4840(0.7F, arg0, local42, local42), local32.aBoolean293);
				this.aClass83_48.method1675((long) arg0, local12);
			}
		}
		local12.aBoolean387 = true;
		return local12.method4822();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class80 method4739(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class80_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class80_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class80_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class80_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "()V")
	private void method4762() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5887; local1++) {
			this.aClass244Array1[local1].method5563();
		}
		this.va();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method4730(@OriginalArg(0) Class1_Sub23 arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "aa", descriptor = "(IIIIII[BII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt5884;
		@Pc(35) int local35 = this.anInt5884 - arg2;
		if (arg1 + arg3 > this.anInt5886) {
			arg3 -= arg1 + arg3 - this.anInt5886;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt5861) {
			local59 = this.anInt5861 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt5884;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt5860) {
			local59 = arg0 + arg2 - this.anInt5860;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt5878) {
			local59 = this.anInt5878 - arg0;
			arg2 -= local59;
			local30 += local59;
			local6 += local14 * local59;
			local35 += local59;
		}
		local59 = arg4 >>> 24;
		@Pc(132) int local132 = arg5 >>> 24;
		@Pc(145) int local145;
		@Pc(148) int local148;
		@Pc(155) int local155;
		@Pc(158) int local158;
		if (arg8 == 0 || arg8 == 1 && local59 == 255 && local132 == 255) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					if (arg6[(local6 >> 16) + local155] == 0) {
						this.anIntArray465[local30++] = arg4;
					} else {
						this.anIntArray465[local30++] = arg5;
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
			return;
		}
		@Pc(222) int local222;
		@Pc(236) int local236;
		@Pc(240) int local240;
		@Pc(245) int local245;
		if (arg8 == 1) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					local236 = local222 >>> 24;
					local240 = 255 - local236;
					local245 = this.anIntArray465[local30];
					this.anIntArray465[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else if (arg8 == 2) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					if (local222 == 0) {
						local30++;
					} else {
						local236 = this.anIntArray465[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray465[local30++] = local240 - local360 | local360 - (local360 >>> 8);
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ui;III)V")
	public void method4763(@OriginalArg(0) Class39_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt7208;
		@Pc(6) int local6 = arg3 >> 1;
		if (local2 == -1) {
			this.O(arg1, arg2, local6, arg0.anInt7207, 1);
			return;
		}
		if (this.anInt5889 != local2) {
			@Pc(30) Class80 local30 = (Class80) this.aClass83_47.method1658((long) local2);
			if (local30 == null) {
				@Pc(36) int[] local36 = this.method4761(local2);
				if (local36 == null) {
					return;
				}
				@Pc(46) int local46 = this.method4765(local2) ? 64 : 128;
				local30 = this.method4739(local36, local46, local46, local46);
				this.aClass83_47.method1675((long) local2, local30);
			}
			this.anInt5889 = local2;
			this.aClass80_15 = local30;
		}
		if (this.aClass80_15.ja() == 64) {
			arg3 <<= 0x1;
			local6 <<= 0x1;
		}
		this.aClass80_15.M(arg1 - local6, arg2 - local6, arg3, arg3, 0, arg0.anInt7207, 1);
	}

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "()Z")
	@Override
	public boolean method4721() {
		return true;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!mp;Z)Lclient!f;")
	@Override
	public Class80 method4684(@OriginalArg(0) Class159 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray369;
		@Pc(5) byte[] local5 = arg0.aByteArray58;
		@Pc(8) int local8 = arg0.anInt4573;
		@Pc(11) int local11 = arg0.anInt4569;
		@Pc(76) Class80_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray57 == null) {
			local20 = new int[local2.length];
			local25 = new byte[local8 * local11];
			for (local27 = 0; local27 < local11; local27++) {
				local32 = local27 * local8;
				for (local34 = 0; local34 < local8; local34++) {
					local25[local32 + local34] = local5[local32 + local34];
				}
			}
			for (local32 = 0; local32 < local2.length; local32++) {
				local20[local32] = local2[local32];
			}
			local76 = new Class80_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray57;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class80_Sub1_Sub1(this, local20, local8, local11);
				local76 = new Class80_Sub1_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class80_Sub1_Sub1(this, local20, local8, local11);
			}
		}
		local76.ka(arg0.anInt4568, arg0.anInt4572, arg0.anInt4570, arg0.anInt4571);
		return local76;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4691(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ra", name = "FA", descriptor = "()I")
	@Override
	public int FA() {
		return 0;
	}

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "()Z")
	@Override
	public boolean method4734() {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
	@Override
	public void method4708(@OriginalArg(0) int arg0) {
		this.aClass244Array1[arg0].method5562(null);
	}

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "()Z")
	@Override
	public boolean method4729() {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "(I)Z")
	public boolean method4764(@OriginalArg(0) int arg0) {
		return super.anInterface7_9.method4836(arg0).aBoolean296;
	}

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "(I)Z")
	public boolean method4765(@OriginalArg(0) int arg0) {
		return this.aBoolean382 || super.anInterface7_9.method4836(arg0).aBoolean295;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[Lclient!pe;)V")
	@Override
	public void method4726(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1) {
	}

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "()Lclient!ia;")
	@Override
	public Class18 method4715() {
		return new Class18_Sub2();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4747() {
		@Pc(3) Class244 local3 = this.method4768(Thread.currentThread());
		@Pc(6) Class38 local6 = local3.aClass38_2;
		local6.aBoolean30 = false;
		local6.aBoolean30 = false;
		local6.anInt812 = 0;
		local6.aBoolean32 = true;
		local6.method739(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean30 = true;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "(I)I")
	public int method4766(@OriginalArg(0) int arg0) {
		return super.anInterface7_9.method4836(arg0).aShort49 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "()Z")
	@Override
	public boolean method4732() {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
	@Override
	public void method4738(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt5858;
		for (@Pc(9) Object local9 = this.aClass83_48.method1660(); local9 != null; local9 = this.aClass83_48.method1662()) {
			@Pc(13) Class1_Sub38 local13 = (Class1_Sub38) local9;
			if (local13.aBoolean387) {
				local13.anInt5958 += local4;
				@Pc(27) int local27 = local13.anInt5958 / 20;
				if (local27 > 0) {
					@Pc(36) Class151 local36 = super.anInterface7_9.method4836(local13.anInt5957);
					local13.method4823(local36.aByte55 * local4 * 50 / 1000, local36.aByte50 * local4 * 50 / 1000);
					local13.anInt5958 -= local27 * 20;
				}
				local13.aBoolean387 = false;
			}
		}
		this.anInt5858 = arg0;
		this.aClass83_47.method1663(5);
	}

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "()V")
	private void method4767() {
		if (this.aFloat85 == 0.0F) {
			this.anInt5885 = this.anInt5871;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt5871;
		@Pc(12) float local12 = (float) this.anInt5875;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat84 / (this.aFloat85 + this.aFloat84);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat85;
		this.anInt5885 = (int) (((float) this.anInt5871 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "()V")
	@Override
	public void method4737() {
	}

	@OriginalMember(owner = "client!ra", name = "la", descriptor = "()F")
	@Override
	public float la() {
		return this.aFloat84;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
	@Override
	public void method4682(@OriginalArg(0) boolean arg0) {
		this.aBoolean382 = arg0;
		this.aClass83_48.method1669();
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Lclient!l;")
	@Override
	public Class1_Sub23 method4690() {
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5874 = this.anInt5865;
		this.anInt5882 = arg0;
		this.anInt5865 = arg1;
		this.anInt5880 = arg2;
		this.aBoolean380 = true;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4728(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas6 == arg0) {
			this.method4752(null);
		}
		@Pc(15) Class1_Sub11 local15 = (Class1_Sub11) this.aClass27_32.method553((long) arg0.hashCode());
		if (local15 != null) {
			local15.method6071();
		}
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method4705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.U(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.U(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
			}
		} else if (arg2 != 0) {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(104) int local104;
			@Pc(137) int local137;
			@Pc(150) int local150;
			@Pc(213) int local213;
			@Pc(228) int local228;
			@Pc(233) int local233;
			@Pc(204) int local204;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(94) int local94 = arg3 << 16;
				local104 = (int) Math.floor((double) local94 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt5878) {
					arg1 += local104 * (this.anInt5878 - arg0);
					arg0 = this.anInt5878;
				}
				if (arg2 >= this.anInt5860) {
					arg2 = this.anInt5860 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5861 && local150 < this.anInt5886) {
							this.anIntArray465[arg0 + local150 * this.anInt5884] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt5861 && local213 < this.anInt5886) {
							local228 = arg0 + local213 * this.anInt5884;
							local233 = this.anIntArray465[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray465[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(357) int local357 = arg2 << 16;
				local104 = (int) Math.floor((double) local357 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt5861) {
					arg0 += local104 * (this.anInt5861 - arg1);
					arg1 = this.anInt5861;
				}
				if (arg3 >= this.anInt5886) {
					arg3 = this.anInt5886 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt5878 && local150 < this.anInt5860) {
							this.anIntArray465[local150 + arg1 * this.anInt5884] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt5878 && local213 < this.anInt5860) {
							local228 = local213 + arg1 * this.anInt5884;
							local233 = this.anIntArray465[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray465[local213 + arg1 * this.anInt5884] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.da(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.da(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "()V")
	@Override
	public void method4693() {
	}

	@OriginalMember(owner = "client!ra", name = "O", descriptor = "(IIIII)V")
	@Override
	protected void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt5861) {
			local8 = this.anInt5861;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt5886) {
			local21 = this.anInt5886;
		}
		@Pc(30) int local30 = local8;
		@Pc(34) int local34 = arg2 * arg2;
		@Pc(36) int local36 = 0;
		@Pc(40) int local40 = arg1 - local8;
		@Pc(44) int local44 = local40 * local40;
		@Pc(48) int local48 = local44 - local40;
		if (arg1 > local21) {
			arg1 = local21;
		}
		@Pc(57) int local57 = arg3 >>> 24;
		@Pc(91) int local91;
		@Pc(102) int local102;
		@Pc(116) int local116;
		@Pc(118) int local118;
		if (arg4 == 0 || arg4 == 1 && local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt5878) {
					local91 = this.anInt5878;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5860) {
					local102 = this.anInt5860;
				}
				local116 = local91 + local30 * this.anInt5884;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray465[local116++] = arg3;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg2;
			local40 = local30 - arg1;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg2;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt5878) {
					local91 = this.anInt5878;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5860 - 1) {
					local102 = this.anInt5860 - 1;
				}
				local116 = local91 + local30 * this.anInt5884;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray465[local116++] = arg3;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(334) int local334;
		@Pc(340) int local340;
		if (arg4 == 1) {
			@Pc(277) int local277 = ((arg3 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
			local91 = 256 - local57;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local102 = arg0 + 1 - local36;
				if (local102 < this.anInt5878) {
					local102 = this.anInt5878;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt5860) {
					local116 = this.anInt5860;
				}
				local118 = local102 + local30 * this.anInt5884;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray465[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray465[local118++] = local277 + local340;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg2;
			local40 = -local40;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg2;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local102 = arg0 - local36;
				if (local102 < this.anInt5878) {
					local102 = this.anInt5878;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt5860 - 1) {
					local116 = this.anInt5860 - 1;
				}
				local118 = local102 + local30 * this.anInt5884;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray465[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray465[local118++] = local277 + local340;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else if (arg4 == 2) {
			@Pc(593) int local593;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt5878) {
					local91 = this.anInt5878;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5860) {
					local102 = this.anInt5860;
				}
				local116 = local91 + local30 * this.anInt5884;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray465[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray465[local116++] = local340 - local603 | local603 - (local603 >>> 8);
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg2;
			local40 = -local40;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg2;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt5878) {
					local91 = this.anInt5878;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5860 - 1) {
					local102 = this.anInt5860 - 1;
				}
				local116 = local91 + local30 * this.anInt5884;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray465[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray465[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ra", name = "SA", descriptor = "(IIIIII)Z")
	@Override
	public boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass18_Sub2_2.anInt5440 * arg0 + this.aClass18_Sub2_2.anInt5439 * arg1 + this.aClass18_Sub2_2.anInt5438 * arg2 >> 15) + this.aClass18_Sub2_2.anInt5443;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass18_Sub2_2.anInt5440 * arg3 + this.aClass18_Sub2_2.anInt5439 * arg4 + this.aClass18_Sub2_2.anInt5438 * arg5 >> 15) + this.aClass18_Sub2_2.anInt5443;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt5875 && local52 < this.anInt5875 || !(local23 <= this.anInt5871 || local52 <= this.anInt5871)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt5876 * ((this.aClass18_Sub2_2.anInt5442 * arg0 + this.aClass18_Sub2_2.anInt5444 * arg1 + this.aClass18_Sub2_2.anInt5446 * arg2 >> 15) + this.aClass18_Sub2_2.anInt5435) / local23;
		@Pc(133) int local133 = this.anInt5876 * ((this.aClass18_Sub2_2.anInt5442 * arg3 + this.aClass18_Sub2_2.anInt5444 * arg4 + this.aClass18_Sub2_2.anInt5446 * arg5 >> 15) + this.aClass18_Sub2_2.anInt5435) / local52;
		if (local104 < this.anInt5883 && local133 < this.anInt5883 || local104 > this.anInt5888 && local133 > this.anInt5888) {
			return false;
		} else {
			@Pc(180) int local180 = this.lb * ((this.aClass18_Sub2_2.anInt5445 * arg0 + this.aClass18_Sub2_2.anInt5441 * arg1 + this.aClass18_Sub2_2.anInt5436 * arg2 >> 15) + this.aClass18_Sub2_2.anInt5437) / local23;
			@Pc(209) int local209 = this.lb * ((this.aClass18_Sub2_2.anInt5445 * arg3 + this.aClass18_Sub2_2.anInt5441 * arg4 + this.aClass18_Sub2_2.anInt5436 * arg5 >> 15) + this.aClass18_Sub2_2.anInt5437) / local52;
			return (local180 >= this.anInt5879 || local209 >= this.anInt5879) && (local180 <= this.anInt5881 || local209 <= this.anInt5881);
		}
	}

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "()V")
	@Override
	public void method4722() {
	}

	@OriginalMember(owner = "client!ra", name = "xa", descriptor = "()I")
	@Override
	public int xa() {
		@Pc(2) int local2 = this.anInt5867;
		this.anInt5867 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ra", name = "S", descriptor = "()V")
	@Override
	public void S() {
		this.anInt5865 = this.anInt5874;
		this.aBoolean380 = false;
	}

	@OriginalMember(owner = "client!ra", name = "da", descriptor = "(IIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt5878 || arg0 >= this.anInt5860) {
			return;
		}
		if (arg1 < this.anInt5861) {
			arg2 -= this.anInt5861 - arg1;
			arg1 = this.anInt5861;
		}
		if (arg1 + arg2 > this.anInt5886) {
			arg2 = this.anInt5886 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5884;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray465[local40 + local54 * this.anInt5884] = arg3;
			}
			return;
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(116) int local116;
		if (arg4 == 1) {
			@Pc(97) int local97 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local103 = 0; local103 < arg2; local103++) {
				local111 = local40 + local103 * this.anInt5884;
				local116 = this.anIntArray465[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray465[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt5884;
				local111 = this.anIntArray465[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray465[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!c;Lclient!qb;Lclient!ia;Lclient!nh;I)V")
	@Override
	public void method4736(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) Class39_Sub7 arg3) {
		((Class37_Sub1) arg0).method1325(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "()Z")
	@Override
	public boolean method4754() {
		return true;
	}

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "([I)V")
	@Override
	public void u(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5878;
		arg0[1] = this.anInt5861;
		arg0[2] = this.anInt5860;
		arg0[3] = this.anInt5886;
	}

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "()Z")
	@Override
	public boolean method4701() {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "Z", descriptor = "(IIII)V")
	@Override
	public void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5878 < arg0) {
			this.anInt5878 = arg0;
		}
		if (this.anInt5861 < arg1) {
			this.anInt5861 = arg1;
		}
		if (this.anInt5860 > arg2) {
			this.anInt5860 = arg2;
		}
		if (this.anInt5886 > arg3) {
			this.anInt5886 = arg3;
		}
		this.method4760();
	}

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "(ILclient!ea;II)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class62_Sub1 local2 = (Class62_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray443;
		@Pc(8) int[] local8 = local2.anIntArray442;
		@Pc(20) int local20;
		if (this.anInt5886 < arg3 + local5.length) {
			local20 = this.anInt5886 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt5861 > arg3) {
			local33 = this.anInt5861 - arg3;
			arg3 = this.anInt5861;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt5884;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt5878 > local58) {
				local62 -= this.anInt5878 - local58;
				local58 = this.anInt5878;
			}
			if (this.anInt5860 < local58 + local62) {
				local62 = this.anInt5860 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray465[local58++] = arg0;
			}
			local49 += this.anInt5884;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class136 method4750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class136_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!gv;[Lclient!mp;Z)Lclient!oa;")
	@Override
	public Class129 method4719(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class159[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt4573;
			local7[local11] = arg1[local11].anInt4569;
			if (arg1[local11].aByteArray57 != null) {
			}
		}
		return new Class129_Sub4(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!ra", name = "XA", descriptor = "(IFFFFF)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt5863 = (int) (arg1 * 65535.0F);
		this.anInt5872 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt5869 = (int) (arg3 * 65535.0F / local26);
		this.anInt5868 = (int) (arg4 * 65535.0F / local26);
		this.anInt5862 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(IIIIII)Lclient!pv;")
	@Override
	public Class78 method4695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!ur;")
	public Class244 method4768(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5887; local1++) {
			if (this.aClass244Array1[local1].aRunnable2 == arg0) {
				return this.aClass244Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!pv;)V")
	@Override
	public void method4711(@OriginalArg(0) Class78 arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "ua", descriptor = "(F)V")
	@Override
	public void ua(@OriginalArg(0) float arg0) {
		this.anInt5859 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!ra", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt5878 = 0;
		this.anInt5861 = 0;
		this.anInt5860 = this.anInt5884;
		this.anInt5886 = this.anInt5877;
		this.method4760();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	@Override
	public void method4679(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "C", descriptor = "()I")
	@Override
	public int method4755() {
		return 0;
	}

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "()Z")
	@Override
	public boolean method4724() {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt5861 || arg1 >= this.anInt5886) {
			return;
		}
		if (arg0 < this.anInt5878) {
			arg2 -= this.anInt5878 - arg0;
			arg0 = this.anInt5878;
		}
		if (arg0 + arg2 > this.anInt5860) {
			arg2 = this.anInt5860 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5884;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray465[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray465[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray465[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray465[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray465[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "()Z")
	@Override
	public boolean method4706() {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		this.NA(0, 0, this.anInt5884, this.anInt5877, arg0, 0);
	}

	@OriginalMember(owner = "client!ra", name = "ia", descriptor = "(III[I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass18_Sub2_2.anInt5443 + (this.aClass18_Sub2_2.anInt5440 * arg0 + this.aClass18_Sub2_2.anInt5439 * arg1 + this.aClass18_Sub2_2.anInt5438 * arg2 >> 15);
		if (local23 < this.anInt5875 || local23 > this.anInt5871) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt5876 * (this.aClass18_Sub2_2.anInt5435 + (this.aClass18_Sub2_2.anInt5442 * arg0 + this.aClass18_Sub2_2.anInt5444 * arg1 + this.aClass18_Sub2_2.anInt5446 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.lb * (this.aClass18_Sub2_2.anInt5437 + (this.aClass18_Sub2_2.anInt5445 * arg0 + this.aClass18_Sub2_2.anInt5441 * arg1 + this.aClass18_Sub2_2.anInt5436 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt5883 && local73 <= this.anInt5888 && local102 >= this.anInt5879 && local102 <= this.anInt5881) {
			arg3[0] = local73 - this.anInt5883;
			arg3[1] = local102 - this.anInt5879;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
	@Override
	public void method4725(@OriginalArg(0) int arg0) {
		this.aClass244Array1[arg0].method5562(Thread.currentThread());
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "()V")
	@Override
	protected void method4694() {
		if (this.aBoolean379) {
			Static304.method4357(false);
			this.aBoolean379 = false;
		}
		this.aClass1_Sub11_1 = null;
		this.aCanvas6 = null;
		this.aClass27_32 = null;
		this.aBoolean378 = true;
	}

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "()Z")
	@Override
	public boolean method4716() {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method4680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class62 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class62_Sub1 local2 = (Class62_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray443;
		@Pc(8) int[] local8 = local2.anIntArray442;
		@Pc(17) int local17 = this.anInt5861 > arg7 ? this.anInt5861 : arg7;
		@Pc(32) int local32 = this.anInt5886 < arg7 + local5.length ? this.anInt5886 : arg7 + local5.length;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg2 + arg3 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(83) int local83;
		@Pc(116) int local116;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(145) int local145;
		@Pc(226) int local226;
		@Pc(243) int local243;
		@Pc(248) int local248;
		@Pc(201) int local201;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			@Pc(390) int local390 = arg2 << 16;
			local83 = (int) Math.floor((double) local390 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < local17) {
				arg0 += local83 * (local17 - arg1);
				arg1 = local17;
			}
			if (arg3 >= local32) {
				arg3 = local32 - 1;
			}
			local116 = arg4 >>> 24;
			if (local116 == 255) {
				while (arg1 <= arg3) {
					local129 = arg0 >> 16;
					local133 = arg1 - arg7;
					local145 = arg6 + local5[local133];
					if (local129 >= this.anInt5878 && local129 < this.anInt5860 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray465[local129 + arg1 * this.anInt5884] = arg4;
					}
					arg0 += local83;
					arg1++;
				}
			} else {
				local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
				local129 = 256 - local116;
				while (arg1 <= arg3) {
					local133 = arg0 >> 16;
					local145 = arg1 - arg7;
					local226 = arg6 + local5[local145];
					if (local133 >= this.anInt5878 && local133 < this.anInt5860 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt5884;
						local248 = this.anIntArray465[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray465[local133 + arg1 * this.anInt5884] = local201 + local584;
					}
					arg0 += local83;
					arg1++;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		@Pc(73) int local73 = arg3 << 16;
		local83 = (int) Math.floor((double) local73 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt5878) {
			arg1 += local83 * (this.anInt5878 - arg0);
			arg0 = this.anInt5878;
		}
		if (arg2 >= this.anInt5860) {
			arg2 = this.anInt5860 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray465[arg0 + local129 * this.anInt5884] = arg4;
					}
				}
				arg1 += local83;
				arg0++;
			}
			return;
		}
		local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
		local129 = 256 - local116;
		while (arg0 <= arg2) {
			local133 = arg1 >> 16;
			local145 = local133 - arg7;
			if (local133 >= local17 && local133 < local32) {
				local226 = arg6 + local5[local145];
				if (arg0 >= local226 && arg0 < local226 + local8[local145]) {
					local243 = arg0 + local133 * this.anInt5884;
					local248 = this.anIntArray465[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray465[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4731(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub11 local8 = (Class1_Sub11) this.aClass27_32.method553((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method6071();
		local8 = Static147.method2219(arg0);
		this.aClass27_32.method564((long) arg0.hashCode(), local8);
		if (this.aCanvas6 != arg0 || this.aClass80_14 != null) {
			return;
		}
		this.aClass1_Sub11_1 = local8;
		this.anIntArray465 = local8.anIntArray512;
		this.anInt5884 = local8.anInt6235;
		this.anInt5877 = local8.anInt6233;
		this.method4762();
	}

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "()Lclient!ia;")
	@Override
	public Class18 method4709() {
		@Pc(3) Class244 local3 = this.method4768(Thread.currentThread());
		return local3.aClass18_Sub2_3;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!wk;IIII)Lclient!c;")
	@Override
	public Class37 method4697(@OriginalArg(0) Class264 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class37_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}
}
