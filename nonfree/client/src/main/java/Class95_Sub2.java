import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class95_Sub2 extends Class95 {

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
	private int anInt3849;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "Lclient!sfa;")
	public Class2_Sub26 aClass2_Sub26_1;

	@OriginalMember(owner = "client!ii", name = "A", descriptor = "Z")
	private boolean aBoolean276;

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "Lclient!gca;")
	private Class118 aClass118_20;

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "I")
	private int anInt3850;

	@OriginalMember(owner = "client!ii", name = "D", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
	private int anInt3851;

	@OriginalMember(owner = "client!ii", name = "F", descriptor = "Z")
	private boolean aBoolean277;

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
	public int anInt3852;

	@OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
	public int anInt3853;

	@OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
	private int anInt3854;

	@OriginalMember(owner = "client!ii", name = "J", descriptor = "I")
	private int anInt3855;

	@OriginalMember(owner = "client!ii", name = "K", descriptor = "[F")
	public float[] aFloatArray17;

	@OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
	public int anInt3856;

	@OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
	public int anInt3857;

	@OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
	public int anInt3858;

	@OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
	public int anInt3859;

	@OriginalMember(owner = "client!ii", name = "P", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
	private int anInt3860;

	@OriginalMember(owner = "client!ii", name = "R", descriptor = "I")
	public int anInt3861;

	@OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
	public int anInt3862;

	@OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
	public int anInt3863;

	@OriginalMember(owner = "client!ii", name = "U", descriptor = "Z")
	private boolean aBoolean278;

	@OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
	public int anInt3864;

	@OriginalMember(owner = "client!ii", name = "W", descriptor = "Lclient!bh;")
	private final Class32 aClass32_38;

	@OriginalMember(owner = "client!ii", name = "X", descriptor = "I")
	public int anInt3865;

	@OriginalMember(owner = "client!ii", name = "Y", descriptor = "I")
	public int anInt3866;

	@OriginalMember(owner = "client!ii", name = "Z", descriptor = "Lclient!wc;")
	private Class371 aClass371_1;

	@OriginalMember(owner = "client!ii", name = "ab", descriptor = "[F")
	public float[] aFloatArray18;

	@OriginalMember(owner = "client!ii", name = "bb", descriptor = "I")
	public int anInt3867;

	@OriginalMember(owner = "client!ii", name = "cb", descriptor = "I")
	public int anInt3868;

	@OriginalMember(owner = "client!ii", name = "db", descriptor = "I")
	public int anInt3869;

	@OriginalMember(owner = "client!ii", name = "eb", descriptor = "I")
	public int anInt3870;

	@OriginalMember(owner = "client!ii", name = "fb", descriptor = "Lclient!mda;")
	public Class177_Sub2 aClass177_Sub2_2;

	@OriginalMember(owner = "client!ii", name = "gb", descriptor = "I")
	public int anInt3871;

	@OriginalMember(owner = "client!ii", name = "hb", descriptor = "I")
	private int anInt3872;

	@OriginalMember(owner = "client!ii", name = "ib", descriptor = "I")
	private int anInt3873;

	@OriginalMember(owner = "client!ii", name = "jb", descriptor = "Lclient!bh;")
	private final Class32 aClass32_39;

	@OriginalMember(owner = "client!ii", name = "kb", descriptor = "I")
	public int anInt3874;

	@OriginalMember(owner = "client!ii", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!ii", name = "mb", descriptor = "I")
	public int anInt3875;

	@OriginalMember(owner = "client!ii", name = "nb", descriptor = "[Lclient!ae;")
	private Class5[] aClass5Array1;

	@OriginalMember(owner = "client!ii", name = "ob", descriptor = "I")
	private int anInt3876;

	@OriginalMember(owner = "client!ii", name = "pb", descriptor = "I")
	public int anInt3877;

	@OriginalMember(owner = "client!ii", name = "qb", descriptor = "I")
	public int anInt3878;

	@OriginalMember(owner = "client!ii", name = "rb", descriptor = "I")
	public int anInt3879;

	@OriginalMember(owner = "client!ii", name = "sb", descriptor = "I")
	private int anInt3880;

	@OriginalMember(owner = "client!ii", name = "tb", descriptor = "I")
	private int anInt3881;

	@OriginalMember(owner = "client!ii", name = "ub", descriptor = "Lclient!cw;")
	private Class61 aClass61_14;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public Class95_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this(arg1);
		this.method6984(arg0, arg2, arg3);
		this.method7002(arg0);
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!d;)V")
	private Class95_Sub2(@OriginalArg(0) Interface6 arg0) {
		super(arg0);
		this.aBoolean276 = false;
		this.aBoolean277 = false;
		this.aClass118_20 = new Class118(4);
		this.anInt3854 = 0;
		this.anInt3853 = 78642;
		this.anInt3859 = 0;
		this.anInt3852 = 0;
		this.anInt3865 = 50;
		this.anInt3871 = 0;
		this.anInt3868 = 512;
		this.anInt3866 = 3500;
		this.anInt3858 = 75518;
		this.anInt3869 = 45823;
		this.anInt3877 = 512;
		this.aBoolean278 = false;
		this.lb = 128;
		this.anInt3880 = 0;
		this.anInt3879 = 0;
		this.aClass32_39 = new Class32(16);
		this.anInt3881 = -1;
		this.aClass32_38 = new Class32(256);
		this.aClass177_Sub2_2 = new Class177_Sub2();
		this.method6971(1);
		this.method6982(0);
		Static171.method2575(true, true);
		this.aBoolean276 = true;
		this.anInt3849 = (int) Static476.method6413();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class5 local3 = this.method3302(Thread.currentThread());
		@Pc(6) Class364 local6 = local3.aClass364_1;
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
		local10 += local44 >> 16;
		local14 += local50 >> 16;
		if (local50 <= local44) {
			local44 = -local44;
		} else {
			local50 = -local50;
		}
		@Pc(78) int local78 = arg5 * local50 >> 17;
		@Pc(86) int local86 = arg5 * local50 + 1 >> 17;
		@Pc(92) int local92 = arg5 * local44 >> 17;
		@Pc(100) int local100 = arg5 * local44 + 1 >> 17;
		@Pc(105) int local105 = arg0 - local6.method8147();
		@Pc(110) int local110 = arg1 - local6.method8138();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt9734 = 0;
		this.C(false);
		local6.aBoolean712 = local114 < 0 || local114 > local6.anInt9732 || local118 < 0 || local118 > local6.anInt9732 || local124 < 0 || local124 > local6.anInt9732;
		local6.method8137((float) local134, (float) local138, (float) local144, (float) local114, (float) local118, (float) local124, 100.0F, 100.0F, 100.0F, arg4);
		local6.aBoolean712 = local114 < 0 || local114 > local6.anInt9732 || local124 < 0 || local124 > local6.anInt9732 || local130 < 0 || local130 > local6.anInt9732;
		local6.method8137((float) local134, (float) local144, (float) local150, (float) local114, (float) local124, (float) local130, 100.0F, 100.0F, 100.0F, arg4);
		this.C(true);
	}

	@OriginalMember(owner = "client!ii", name = "A", descriptor = "()V")
	@Override
	public void method7011() {
	}

	@OriginalMember(owner = "client!ii", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt3875 + arg0;
		@Pc(13) int local13 = arg1 * this.anInt3873 + arg0;
		if (local6 == 0 && local13 == 0) {
			return;
		}
		@Pc(21) int[] local21 = this.anIntArray269;
		@Pc(24) float[] local24 = this.aFloatArray17;
		@Pc(31) int local31;
		if (local6 < 0) {
			local31 = local21.length + local6;
			Static653.method5397(local21, -local6, local21, 0, local31);
		} else if (local6 > 0) {
			local31 = local21.length - local6;
			Static653.method5397(local21, 0, local21, local6, local31);
		}
		if (local13 < 0) {
			local31 = local24.length + local13;
			Static653.method5396(local24, -local13, local24, 0, local31);
		} else if (local13 > 0) {
			local31 = local24.length - local13;
			Static653.method5396(local24, 0, local24, local13, local31);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!tba;Z)Lclient!cw;")
	@Override
	public Class61 method6980(@OriginalArg(0) Class329 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray597;
		@Pc(5) byte[] local5 = arg0.aByteArray101;
		@Pc(8) int local8 = arg0.anInt8813;
		@Pc(11) int local11 = arg0.anInt8812;
		@Pc(76) Class61_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray100 == null) {
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
			local76 = new Class61_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray100;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class61_Sub1_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class61_Sub1_Sub1(this, local20, local8, local11);
			}
		}
		local76.method6436(arg0.anInt8816, arg0.anInt8814, arg0.anInt8815, arg0.anInt8811);
		return local76;
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)[I")
	public int[] method3300(@OriginalArg(0) int arg0) {
		@Pc(2) Class32 local2 = this.aClass32_38;
		@Pc(14) Class2_Sub28 local14;
		synchronized (this.aClass32_38) {
			local14 = (Class2_Sub28) this.aClass32_38.method630((long) arg0 | Long.MIN_VALUE);
			if (local14 == null) {
				if (!super.anInterface6_27.method1493(arg0)) {
					return null;
				}
				@Pc(34) Class175 local34 = super.anInterface6_27.method1492(arg0);
				@Pc(45) int local45 = local34.aBoolean309 || this.aBoolean278 ? 64 : this.lb;
				local14 = new Class2_Sub28(arg0, local45, super.anInterface6_27.method1488(0.7F, local45, arg0, local45), local34.anInt4384 != 1);
				this.aClass32_38.method629(local14, (long) arg0 | Long.MIN_VALUE);
			}
		}
		local14.aBoolean369 = true;
		return local14.method4419();
	}

	@OriginalMember(owner = "client!ii", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt3875) {
			arg2 = this.anInt3875;
		}
		if (arg3 > this.anInt3855) {
			arg3 = this.anInt3855;
		}
		this.anInt3859 = arg0;
		this.anInt3852 = arg2;
		this.anInt3871 = arg1;
		this.anInt3879 = arg3;
		this.method3309();
	}

	@OriginalMember(owner = "client!ii", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt3859 == 0 && this.anInt3852 == this.anInt3875 && this.anInt3871 == 0 && this.anInt3879 == this.anInt3855) {
			local19 = this.aFloatArray17.length;
			local25 = local19 - (local19 & 0x7);
			local27 = 0;
			while (local27 < local25) {
				this.aFloatArray17[local27++] = 2.14748365E9F;
				this.aFloatArray17[local27++] = 2.14748365E9F;
				this.aFloatArray17[local27++] = 2.14748365E9F;
				this.aFloatArray17[local27++] = 2.14748365E9F;
				this.aFloatArray17[local27++] = 2.14748365E9F;
				this.aFloatArray17[local27++] = 2.14748365E9F;
				this.aFloatArray17[local27++] = 2.14748365E9F;
				this.aFloatArray17[local27++] = 2.14748365E9F;
			}
			while (local27 < local19) {
				this.aFloatArray17[local27++] = 2.14748365E9F;
			}
			return;
		}
		local19 = this.anInt3852 - this.anInt3859;
		local25 = this.anInt3879 - this.anInt3871;
		local27 = this.anInt3875 - local19;
		@Pc(116) int local116 = this.anInt3859 + this.anInt3871 * this.anInt3875;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.aFloatArray17[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray17[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray17[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray17[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray17[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray17[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray17[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray17[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.aFloatArray17[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6950(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub26 local8 = (Class2_Sub26) this.aClass118_20.method2595((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method8653();
		local8 = Static356.method4784(arg2, arg1, arg0);
		this.aClass118_20.method2601(local8, (long) arg0.hashCode());
		if (this.aCanvas3 != arg0 || this.aClass371_1 != null) {
			return;
		}
		@Pc(37) Dimension local37 = arg0.getSize();
		this.anInt3851 = local37.width;
		this.anInt3850 = local37.height;
		this.aClass2_Sub26_1 = local8;
		this.anIntArray269 = local8.anIntArray482;
		this.anInt3875 = local8.anInt6571;
		this.anInt3855 = local8.anInt6570;
		if (this.anInt3875 != this.anInt3873 || this.anInt3855 != this.anInt3872) {
			this.anInt3876 = this.anInt3873 = this.anInt3875;
			this.anInt3860 = this.anInt3872 = this.anInt3855;
			this.aFloatArray18 = this.aFloatArray17 = new float[this.anInt3873 * this.anInt3872];
		}
		this.method3313();
	}

	@OriginalMember(owner = "client!ii", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		this.anInt3858 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6987(@OriginalArg(0) Class2_Sub31 arg0) {
	}

	@OriginalMember(owner = "client!ii", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(2) int local2 = this.anInt3854;
		this.anInt3854 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[Lclient!kb;)V")
	@Override
	public void method7004(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub24[] arg1) {
	}

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class5 local3 = this.method3302(Thread.currentThread());
		local3.aBoolean8 = arg0;
	}

	@OriginalMember(owner = "client!ii", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass177_Sub2_2.aFloat103 + this.aClass177_Sub2_2.aFloat105 * (float) arg0 + this.aClass177_Sub2_2.aFloat101 * (float) arg1 + this.aClass177_Sub2_2.aFloat111 * (float) arg2;
		if (local24 < (float) this.anInt3865 || local24 > (float) this.anInt3866) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt3868 * (this.aClass177_Sub2_2.aFloat102 + this.aClass177_Sub2_2.aFloat112 * (float) arg0 + this.aClass177_Sub2_2.aFloat106 * (float) arg1 + this.aClass177_Sub2_2.aFloat109 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt3877 * (this.aClass177_Sub2_2.aFloat108 + this.aClass177_Sub2_2.aFloat107 * (float) arg0 + this.aClass177_Sub2_2.aFloat104 * (float) arg1 + this.aClass177_Sub2_2.aFloat110 * (float) arg2) / local24);
		if (local81 >= this.anInt3870 && local81 <= this.anInt3856 && local113 >= this.anInt3878 && local113 <= this.anInt3861) {
			arg3[0] = local81 - this.anInt3870;
			arg3[1] = local113 - this.anInt3878;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!hs;Lclient!mp;)Lclient!cha;")
	@Override
	public Interface4 method6959(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Interface18 arg1) {
		return new Class371(this, (Class61) arg0, (Class324) arg1);
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)Lclient!mp;")
	@Override
	public Interface18 method6983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class324(arg0, arg1);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIZ)Lclient!cw;")
	@Override
	public Class61 method6972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt3875 + arg0;
		@Pc(16) int local16 = this.anInt3875 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray269[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class61_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class61_Sub1_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ii", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt3866;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIIIIZ)Lclient!cw;")
	@Override
	public Class61 method7012(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class61_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class61_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4);
				}
			}
		}
		return local1 ? new Class61_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class61_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIF)Lclient!kb;")
	@Override
	public Class2_Sub24 method6929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIII)V")
	private void method3301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < this.anInt3859 || arg0 >= this.anInt3852) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt3875;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg1 + local37 >= this.anInt3871 && arg1 + local37 < this.anInt3879 && local27 < arg4) {
					this.anIntArray269[local15 + local37 * this.anInt3875] = arg3;
				}
				local37++;
				local27++;
				local27 %= local23;
			}
			return;
		}
		@Pc(100) int local100 = ((arg3 & 0xFF00FF) * local19 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local19 >> 8 & 0xFF00) + (local19 << 24);
		local37 = 256 - local19;
		@Pc(106) int local106 = 0;
		while (local106 < arg2) {
			if (arg1 + local106 >= this.anInt3871 && arg1 + local106 < this.anInt3879 && local27 < arg4) {
				@Pc(129) int local129 = local15 + local106 * this.anInt3875;
				@Pc(134) int local134 = this.anIntArray269[local129];
				@Pc(154) int local154 = ((local134 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local134 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray269[local129] = local100 + local154;
			}
			local106++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!ae;")
	public Class5 method3302(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3874; local1++) {
			if (this.aClass5Array1[local1].aRunnable2 == arg0) {
				return this.aClass5Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ii", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(26) float local26 = this.aClass177_Sub2_2.aFloat105 * (float) arg0 + this.aClass177_Sub2_2.aFloat101 * (float) arg1 + this.aClass177_Sub2_2.aFloat111 * (float) arg2 + this.aClass177_Sub2_2.aFloat103;
		if (local26 < 1.0F) {
			local26 = 1.0F;
		}
		@Pc(57) float local57 = this.aClass177_Sub2_2.aFloat105 * (float) arg3 + this.aClass177_Sub2_2.aFloat101 * (float) arg4 + this.aClass177_Sub2_2.aFloat111 * (float) arg5 + this.aClass177_Sub2_2.aFloat103;
		if (local57 < 1.0F) {
			local57 = 1.0F;
		}
		if (local26 < (float) this.anInt3865 && local57 < (float) this.anInt3865) {
			local1 |= 0x10;
		} else if (local26 > (float) this.anInt3866 && local57 > (float) this.anInt3866) {
			local1 |= 0x20;
		}
		@Pc(128) int local128 = (int) ((float) this.anInt3868 * (this.aClass177_Sub2_2.aFloat112 * (float) arg0 + this.aClass177_Sub2_2.aFloat106 * (float) arg1 + this.aClass177_Sub2_2.aFloat109 * (float) arg2 + this.aClass177_Sub2_2.aFloat102) / local26);
		@Pc(160) int local160 = (int) ((float) this.anInt3868 * (this.aClass177_Sub2_2.aFloat112 * (float) arg3 + this.aClass177_Sub2_2.aFloat106 * (float) arg4 + this.aClass177_Sub2_2.aFloat109 * (float) arg5 + this.aClass177_Sub2_2.aFloat102) / local57);
		if (local128 < this.anInt3870 && local160 < this.anInt3870) {
			local1 |= 0x1;
		} else if (local128 > this.anInt3856 && local160 > this.anInt3856) {
			local1 |= 0x2;
		}
		@Pc(217) int local217 = (int) ((float) this.anInt3877 * (this.aClass177_Sub2_2.aFloat107 * (float) arg0 + this.aClass177_Sub2_2.aFloat104 * (float) arg1 + this.aClass177_Sub2_2.aFloat110 * (float) arg2 + this.aClass177_Sub2_2.aFloat108) / local26);
		@Pc(249) int local249 = (int) ((float) this.anInt3877 * (this.aClass177_Sub2_2.aFloat107 * (float) arg3 + this.aClass177_Sub2_2.aFloat104 * (float) arg4 + this.aClass177_Sub2_2.aFloat110 * (float) arg5 + this.aClass177_Sub2_2.aFloat108) / local57);
		if (local217 < this.anInt3878 && local249 < this.anInt3878) {
			local1 |= 0x4;
		} else if (local217 > this.anInt3861 && local249 > this.anInt3861) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "()Lclient!uha;")
	@Override
	public Class177 method6979() {
		return this.aClass177_Sub2_2;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!kda;IIII)Lclient!ka;")
	@Override
	public Class182 method6938(@OriginalArg(0) Class186 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class182_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "()Z")
	@Override
	public boolean method6926() {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt3863, this.anInt3862, this.anInt3868, this.anInt3877 };
	}

	@OriginalMember(owner = "client!ii", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass5Array1.length; local1++) {
			@Pc(7) Class5 local7 = this.aClass5Array1[local1];
			local7.anInt83 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt83 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt83 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt83 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt83 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean10 = false;
			} else {
				local7.aBoolean10 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(24) float local24 = this.aClass177_Sub2_2.aFloat105 * (float) arg0 + this.aClass177_Sub2_2.aFloat101 * (float) arg1 + this.aClass177_Sub2_2.aFloat111 * (float) arg2 + this.aClass177_Sub2_2.aFloat103;
		@Pc(49) float local49 = this.aClass177_Sub2_2.aFloat105 * (float) arg3 + this.aClass177_Sub2_2.aFloat101 * (float) arg4 + this.aClass177_Sub2_2.aFloat111 * (float) arg5 + this.aClass177_Sub2_2.aFloat103;
		@Pc(51) int local51 = 0;
		if (local24 < (float) this.anInt3865 && local49 < (float) this.anInt3865) {
			local51 |= 0x10;
		} else if (local24 > (float) this.anInt3866 && local49 > (float) this.anInt3866) {
			local51 |= 0x20;
		}
		@Pc(117) int local117 = (int) ((float) this.anInt3868 * (this.aClass177_Sub2_2.aFloat112 * (float) arg0 + this.aClass177_Sub2_2.aFloat106 * (float) arg1 + this.aClass177_Sub2_2.aFloat109 * (float) arg2 + this.aClass177_Sub2_2.aFloat102) / (float) arg6);
		@Pc(150) int local150 = (int) ((float) this.anInt3868 * (this.aClass177_Sub2_2.aFloat112 * (float) arg3 + this.aClass177_Sub2_2.aFloat106 * (float) arg4 + this.aClass177_Sub2_2.aFloat109 * (float) arg5 + this.aClass177_Sub2_2.aFloat102) / (float) arg6);
		if (local117 < this.anInt3870 && local150 < this.anInt3870) {
			local51 |= 0x1;
		} else if (local117 > this.anInt3856 && local150 > this.anInt3856) {
			local51 |= 0x2;
		}
		@Pc(208) int local208 = (int) ((float) this.anInt3877 * (this.aClass177_Sub2_2.aFloat107 * (float) arg0 + this.aClass177_Sub2_2.aFloat104 * (float) arg1 + this.aClass177_Sub2_2.aFloat110 * (float) arg2 + this.aClass177_Sub2_2.aFloat108) / (float) arg6);
		@Pc(241) int local241 = (int) ((float) this.anInt3877 * (this.aClass177_Sub2_2.aFloat107 * (float) arg3 + this.aClass177_Sub2_2.aFloat104 * (float) arg4 + this.aClass177_Sub2_2.aFloat110 * (float) arg5 + this.aClass177_Sub2_2.aFloat108) / (float) arg6);
		if (local208 < this.anInt3878 && local241 < this.anInt3878) {
			local51 |= 0x4;
		} else if (local208 > this.anInt3861 && local241 > this.anInt3861) {
			local51 |= 0x8;
		}
		return local51;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7002(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas3 = null;
			this.aClass2_Sub26_1 = null;
			if (this.aClass371_1 == null) {
				this.anIntArray269 = null;
				this.anInt3875 = this.anInt3855 = 1;
				this.anInt3873 = this.anInt3872 = 1;
				this.method3313();
			}
			return;
		}
		@Pc(10) Class2_Sub26 local10 = (Class2_Sub26) this.aClass118_20.method2595((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas3 = arg0;
		@Pc(18) Dimension local18 = arg0.getSize();
		this.anInt3851 = local18.width;
		this.anInt3850 = local18.height;
		this.aClass2_Sub26_1 = local10;
		if (this.aClass371_1 != null) {
			return;
		}
		this.anIntArray269 = local10.anIntArray482;
		this.anInt3875 = local10.anInt6571;
		this.anInt3855 = local10.anInt6570;
		if (this.anInt3875 != this.anInt3873 || this.anInt3855 != this.anInt3872) {
			this.anInt3876 = this.anInt3873 = this.anInt3875;
			this.anInt3860 = this.anInt3872 = this.anInt3855;
			this.aFloatArray18 = this.aFloatArray17 = new float[this.anInt3873 * this.anInt3872];
		}
		this.method3313();
		return;
	}

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "()Z")
	public boolean method3303() {
		return this.aBoolean277;
	}

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "()Z")
	@Override
	public boolean method6958() {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!sm;IIII)V")
	private void method3304(@OriginalArg(0) Class13_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt5952;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method3315(arg1, arg2, arg3, arg4, arg0.anInt5957, 1);
			return;
		}
		if (this.anInt3881 != local2) {
			@Pc(33) Class61 local33 = (Class61) this.aClass32_39.method630((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method3300(local2);
				if (local39 == null) {
					return;
				}
				@Pc(50) int local50 = this.method3307(local2) ? 64 : this.lb;
				local33 = this.method6953(local39, local50, local50, local50);
				this.aClass32_39.method629(local33, (long) local2);
			}
			this.anInt3881 = local2;
			this.aClass61_14 = local33;
		}
		local8++;
		((Class61_Sub1) this.aClass61_14).method6457(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt5957, 1);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!cd;Lclient!cd;FLclient!cd;)Lclient!cd;")
	@Override
	public Class12 method6974(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class12 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "()Z")
	@Override
	public boolean method6945() {
		return true;
	}

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "()V")
	@Override
	public void method6986() {
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
			@Pc(309) int local309;
			@Pc(204) int local204;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(94) int local94 = arg3 << 16;
				local104 = (int) Math.floor((double) local94 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt3859) {
					arg1 += local104 * (this.anInt3859 - arg0);
					arg0 = this.anInt3859;
				}
				if (arg2 >= this.anInt3852) {
					arg2 = this.anInt3852 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt3871 && local150 < this.anInt3879) {
							this.anIntArray269[arg0 + local150 * this.anInt3875] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt3871 && local213 < this.anInt3879) {
							local228 = arg0 + local213 * this.anInt3875;
							local233 = this.anIntArray269[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray269[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt3871 && local150 < this.anInt3879) {
							local213 = arg0 + local150 * this.anInt3875;
							local228 = this.anIntArray269[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray269[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt3871) {
					arg0 += local104 * (this.anInt3871 - arg1);
					arg1 = this.anInt3871;
				}
				if (arg3 >= this.anInt3879) {
					arg3 = this.anInt3879 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt3859 && local150 < this.anInt3852) {
							this.anIntArray269[local150 + arg1 * this.anInt3875] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt3859 && local213 < this.anInt3852) {
							local228 = local213 + arg1 * this.anInt3875;
							local233 = this.anIntArray269[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray269[local213 + arg1 * this.anInt3875] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt3859 && local150 < this.anInt3852) {
							local213 = local150 + arg1 * this.anInt3875;
							local228 = this.anIntArray269[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray269[local213] = local233 - local587 | local587 - (local587 >>> 8);
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.P(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.P(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ii", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(2) int local2 = this.anInt3880;
		this.anInt3880 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)V")
	@Override
	public void method7006(@OriginalArg(0) boolean arg0) {
		this.aBoolean278 = arg0;
		this.aClass32_38.method640();
	}

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "()V")
	@Override
	public void method7000() {
		if (this.aCanvas3 == null) {
			this.anInt3875 = 1;
			this.anInt3855 = 1;
			this.anIntArray269 = null;
			this.anInt3873 = 1;
			this.anInt3872 = 1;
			this.aFloatArray17 = null;
		} else {
			this.anIntArray269 = this.aClass2_Sub26_1.anIntArray482;
			this.anInt3875 = this.aClass2_Sub26_1.anInt6571;
			this.anInt3855 = this.aClass2_Sub26_1.anInt6570;
			this.aFloatArray17 = this.aFloatArray18;
			this.anInt3873 = this.anInt3876;
			this.anInt3872 = this.anInt3860;
		}
		this.aClass371_1 = null;
		this.method3313();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6927() {
		@Pc(3) Class5 local3 = this.method3302(Thread.currentThread());
		@Pc(6) Class364 local6 = local3.aClass364_1;
		local6.aBoolean714 = false;
		@Pc(14) int local14 = 5 - this.anInt3870;
		@Pc(19) int local19 = 75 - this.anInt3870;
		@Pc(24) int local24 = 15 - this.anInt3870;
		@Pc(29) int local29 = 10 - this.anInt3878;
		@Pc(34) int local34 = 50 - this.anInt3878;
		@Pc(39) int local39 = 90 - this.anInt3878;
		local6.aBoolean712 = local14 < 0 || local14 > local6.anInt9732 || local19 < 0 || local19 > local6.anInt9732 || local24 < 0 || local24 > local6.anInt9732;
		local6.anInt9734 = 0;
		local6.aBoolean715 = false;
		local6.method8145((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		local6.aBoolean714 = true;
	}

	@OriginalMember(owner = "client!ii", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3859;
		arg0[1] = this.anInt3871;
		arg0[2] = this.anInt3852;
		arg0[3] = this.anInt3879;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
		@Pc(4) int local4 = this.anInt3873 - arg2;
		@Pc(11) int local11 = arg1 * this.anInt3873 + arg0;
		@Pc(14) float[] local14 = this.aFloatArray17;
		@Pc(16) int local16 = 0;
		while (local16 < arg3) {
			@Pc(19) int local19 = 0;
			while (local19 < arg2) {
				@Pc(24) float local24 = local14[local11];
				if (local24 != 2.14748365E9F) {
					local14[local11] = (float) ((double) local24 + arg4);
				}
				local19++;
				local11++;
			}
			local16++;
			local11 += local4;
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Lclient!hs;")
	@Override
	public Interface11 method6968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method6952(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "()Z")
	@Override
	public boolean method6932() {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "()Z")
	@Override
	public boolean method6951() {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)V")
	@Override
	public void method6981(@OriginalArg(0) int arg0) {
		this.aClass5Array1[arg0].method105(null);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray118;
		@Pc(8) int[] local8 = local2.anIntArray119;
		@Pc(17) int local17 = this.anInt3871 > arg7 ? this.anInt3871 : arg7;
		@Pc(32) int local32 = this.anInt3879 < arg7 + local5.length ? this.anInt3879 : arg7 + local5.length;
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
					if (local129 >= this.anInt3859 && local129 < this.anInt3852 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray269[local129 + arg1 * this.anInt3875] = arg4;
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
					if (local133 >= this.anInt3859 && local133 < this.anInt3852 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt3875;
						local248 = this.anIntArray269[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray269[local133 + arg1 * this.anInt3875] = local201 + local584;
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
		if (arg0 < this.anInt3859) {
			arg1 += local83 * (this.anInt3859 - arg0);
			arg0 = this.anInt3859;
		}
		if (arg2 >= this.anInt3852) {
			arg2 = this.anInt3852 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray269[arg0 + local129 * this.anInt3875] = arg4;
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
					local243 = arg0 + local133 * this.anInt3875;
					local248 = this.anIntArray269[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray269[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "()V")
	@Override
	public void method6933() {
		this.aClass32_38.method640();
		this.aClass32_39.method640();
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
	@Override
	public void method6949(@OriginalArg(0) int arg0) {
		this.lb = arg0;
		this.aClass32_38.method640();
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(II)I")
	@Override
	public int method7005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "()Z")
	@Override
	public boolean method6964() {
		return true;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIIIII)Lclient!cd;")
	@Override
	public Class12 method6954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!ev;)V")
	@Override
	public void method6960(@OriginalArg(0) Class98 arg0) {
		@Pc(3) Class5 local3 = this.method3302(Thread.currentThread());
		@Pc(7) Class13_Sub3 local7 = arg0.aClass220_1.aClass13_Sub3_5;
		for (@Pc(10) Class13_Sub3 local10 = local7.aClass13_Sub3_9; local10 != local7; local10 = local10.aClass13_Sub3_9) {
			@Pc(14) Class13_Sub3_Sub2 local14 = (Class13_Sub3_Sub2) local10;
			@Pc(19) int local19 = local14.anInt5953 >> 12;
			@Pc(24) int local24 = local14.anInt5959 >> 12;
			@Pc(29) int local29 = local14.anInt5954 >> 12;
			@Pc(54) float local54 = this.aClass177_Sub2_2.aFloat103 + this.aClass177_Sub2_2.aFloat105 * (float) local19 + this.aClass177_Sub2_2.aFloat101 * (float) local24 + this.aClass177_Sub2_2.aFloat111 * (float) local29;
			if (!(local54 < (float) this.anInt3865) && !(local54 > (float) local3.anInt82)) {
				@Pc(102) int local102 = this.anInt3863 + (int) ((float) this.anInt3868 * (this.aClass177_Sub2_2.aFloat102 + this.aClass177_Sub2_2.aFloat112 * (float) local19 + this.aClass177_Sub2_2.aFloat106 * (float) local24 + this.aClass177_Sub2_2.aFloat109 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt3862 + (int) ((float) this.anInt3877 * (this.aClass177_Sub2_2.aFloat108 + this.aClass177_Sub2_2.aFloat107 * (float) local19 + this.aClass177_Sub2_2.aFloat104 * (float) local24 + this.aClass177_Sub2_2.aFloat110 * (float) local29) / local54);
				if (local102 >= this.anInt3859 && local102 <= this.anInt3852 && local137 >= this.anInt3871 && local137 <= this.anInt3879) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method3304(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt5956 * this.anInt3868 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "()Z")
	@Override
	public boolean method6944() {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(II)V")
	@Override
	public void method6996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas3 == null || this.aClass2_Sub26_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas3.getGraphics();
			this.aClass2_Sub26_1.method5617(arg0, this.anInt3851, local14, 0, this.anInt3850, 0, arg1);
		} catch (@Pc(29) Exception local29) {
			this.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!ii", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return 0;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class1_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
	@Override
	public void method6988(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ii", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(24) float local24 = this.aClass177_Sub2_2.aFloat103 + this.aClass177_Sub2_2.aFloat105 * (float) arg0 + this.aClass177_Sub2_2.aFloat101 * (float) arg1 + this.aClass177_Sub2_2.aFloat111 * (float) arg2;
		if (local24 < (float) this.anInt3865 || local24 > (float) this.anInt3866) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(82) int local82 = (int) ((float) this.anInt3868 * (this.aClass177_Sub2_2.aFloat102 + this.aClass177_Sub2_2.aFloat112 * (float) arg0 + this.aClass177_Sub2_2.aFloat106 * (float) arg1 + this.aClass177_Sub2_2.aFloat109 * (float) arg2) / (float) arg3);
		@Pc(115) int local115 = (int) ((float) this.anInt3877 * (this.aClass177_Sub2_2.aFloat108 + this.aClass177_Sub2_2.aFloat107 * (float) arg0 + this.aClass177_Sub2_2.aFloat104 * (float) arg1 + this.aClass177_Sub2_2.aFloat110 * (float) arg2) / (float) arg3);
		if (local82 >= this.anInt3870 && local82 <= this.anInt3856 && local115 >= this.anInt3878 && local115 <= this.anInt3861) {
			arg4[0] = local82 - this.anInt3870;
			arg4[1] = local115 - this.anInt3878;
			arg4[2] = (int) local24;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!ev;I)V")
	@Override
	public void method6977(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class5 local3 = this.method3302(Thread.currentThread());
		@Pc(7) Class13_Sub3 local7 = arg0.aClass220_1.aClass13_Sub3_5;
		for (@Pc(10) Class13_Sub3 local10 = local7.aClass13_Sub3_9; local10 != local7; local10 = local10.aClass13_Sub3_9) {
			@Pc(14) Class13_Sub3_Sub2 local14 = (Class13_Sub3_Sub2) local10;
			@Pc(19) int local19 = local14.anInt5953 >> 12;
			@Pc(24) int local24 = local14.anInt5959 >> 12;
			@Pc(29) int local29 = local14.anInt5954 >> 12;
			@Pc(54) float local54 = this.aClass177_Sub2_2.aFloat103 + this.aClass177_Sub2_2.aFloat105 * (float) local19 + this.aClass177_Sub2_2.aFloat101 * (float) local24 + this.aClass177_Sub2_2.aFloat111 * (float) local29;
			if (!(local54 < (float) this.anInt3865) && !(local54 > (float) local3.anInt82)) {
				@Pc(103) int local103 = this.anInt3863 + (int) ((float) this.anInt3868 * (this.aClass177_Sub2_2.aFloat102 + this.aClass177_Sub2_2.aFloat112 * (float) local19 + this.aClass177_Sub2_2.aFloat106 * (float) local24 + this.aClass177_Sub2_2.aFloat109 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt3862 + (int) ((float) this.anInt3877 * (this.aClass177_Sub2_2.aFloat108 + this.aClass177_Sub2_2.aFloat107 * (float) local19 + this.aClass177_Sub2_2.aFloat104 * (float) local24 + this.aClass177_Sub2_2.aFloat110 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt3859 && local103 <= this.anInt3852 && local139 >= this.anInt3871 && local139 <= this.anInt3879) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method3304(local14, local103, local139, (int) local54, (local14.anInt5956 * this.anInt3868 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "()Z")
	@Override
	public boolean method6962() {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method3305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface6_27.method1492(arg6).aBoolean308) {
			this.method3315(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt3881 != arg6) {
			@Pc(26) Class61 local26 = (Class61) this.aClass32_39.method630((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method3300(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(44) int local44 = this.method3307(arg6) ? 64 : this.lb;
				local26 = this.method6953(local32, local44, local44, local44);
				this.aClass32_39.method629(local26, (long) arg6);
			}
			this.anInt3881 = arg6;
			this.aClass61_14 = local26;
		}
		((Class61_Sub1) this.aClass61_14).method6457(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V")
	@Override
	public void method6971(@OriginalArg(0) int arg0) {
		this.anInt3874 = arg0;
		this.aClass5Array1 = new Class5[this.anInt3874];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3874; local9++) {
			this.aClass5Array1[local9] = new Class5(this);
		}
	}

	@OriginalMember(owner = "client!ii", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt3859 || arg0 >= this.anInt3852) {
			return;
		}
		if (arg1 < this.anInt3871) {
			arg2 -= this.anInt3871 - arg1;
			arg1 = this.anInt3871;
		}
		if (arg1 + arg2 > this.anInt3879) {
			arg2 = this.anInt3879 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt3875;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray269[local40 + local54 * this.anInt3875] = arg3;
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
				local111 = local40 + local103 * this.anInt3875;
				local116 = this.anIntArray269[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray269[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt3875;
				local111 = this.anIntArray269[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray269[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "(I)I")
	public int method3306(@OriginalArg(0) int arg0) {
		return super.anInterface6_27.method1492(arg0).aShort44 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "()Lclient!gba;")
	@Override
	public Class117 method7008() {
		return new Class117(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!ii", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt3871) {
			local8 = this.anInt3871;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt3879) {
			local21 = this.anInt3879;
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
		if (local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt3859) {
					local91 = this.anInt3859;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3852) {
					local102 = this.anInt3852;
				}
				local116 = local91 + local30 * this.anInt3875;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray269[local116++] = arg3;
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
				if (local91 < this.anInt3859) {
					local91 = this.anInt3859;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3852 - 1) {
					local102 = this.anInt3852 - 1;
				}
				local116 = local91 + local30 * this.anInt3875;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray269[local116++] = arg3;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(277) int local277 = ((arg3 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
		local91 = 256 - local57;
		@Pc(334) int local334;
		@Pc(340) int local340;
		while (local30 < arg1) {
			while (local48 <= local34 || local44 <= local34) {
				local44 += local36 + local36;
				local48 += local36++ + local36;
			}
			local102 = arg0 + 1 - local36;
			if (local102 < this.anInt3859) {
				local102 = this.anInt3859;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt3852) {
				local116 = this.anInt3852;
			}
			local118 = local102 + local30 * this.anInt3875;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray269[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray269[local118++] = local277 + local360;
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
			if (local102 < this.anInt3859) {
				local102 = this.anInt3859;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt3852 - 1) {
				local116 = this.anInt3852 - 1;
			}
			local118 = local102 + local30 * this.anInt3875;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray269[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray269[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "(I)Z")
	public boolean method3307(@OriginalArg(0) int arg0) {
		return this.aBoolean278 || super.anInterface6_27.method1492(arg0).aBoolean309;
	}

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "(I)Z")
	public boolean method3308(@OriginalArg(0) int arg0) {
		return super.anInterface6_27.method1492(arg0).aBoolean307 || super.anInterface6_27.method1492(arg0).aBoolean304;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
	@Override
	public void method6935() {
		Static348.anInt5472 = 10000;
		Static348.anInt5476 = 10000;
		if (this.anInt3874 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method6971(this.anInt3874);
		this.method6982(0);
	}

	@OriginalMember(owner = "client!ii", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3859 < arg0) {
			this.anInt3859 = arg0;
		}
		if (this.anInt3871 < arg1) {
			this.anInt3871 = arg1;
		}
		if (this.anInt3852 > arg2) {
			this.anInt3852 = arg2;
		}
		if (this.anInt3879 > arg3) {
			this.anInt3879 = arg3;
		}
		this.method3309();
	}

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "()V")
	private void method3309() {
		this.anInt3870 = this.anInt3859 - this.anInt3863;
		this.anInt3856 = this.anInt3852 - this.anInt3863;
		this.anInt3878 = this.anInt3871 - this.anInt3862;
		this.anInt3861 = this.anInt3879 - this.anInt3862;
		for (@Pc(29) int local29 = 0; local29 < this.anInt3874; local29++) {
			@Pc(36) Class364 local36 = this.aClass5Array1[local29].aClass364_1;
			local36.anInt9731 = this.anInt3863 - this.anInt3859;
			local36.anInt9733 = this.anInt3862 - this.anInt3871;
			local36.anInt9732 = this.anInt3852 - this.anInt3859;
			local36.anInt9730 = this.anInt3879 - this.anInt3871;
		}
		@Pc(78) int local78 = this.anInt3871 * this.anInt3875 + this.anInt3859;
		for (@Pc(81) int local81 = this.anInt3871; local81 < this.anInt3879; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt3874; local84++) {
				this.aClass5Array1[local84].aClass364_1.anIntArray666[local81 - this.anInt3871] = local78;
			}
			local78 += this.anInt3875;
		}
	}

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "()Z")
	@Override
	public boolean method6995() {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!uha;)V")
	@Override
	public void method6941(@OriginalArg(0) Class177 arg0) {
		this.aClass177_Sub2_2 = (Class177_Sub2) arg0;
	}

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "()Z")
	@Override
	public boolean method6993() {
		return true;
	}

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "(I)[I")
	public int[] method3310(@OriginalArg(0) int arg0) {
		@Pc(2) Class32 local2 = this.aClass32_38;
		@Pc(12) Class2_Sub28 local12;
		synchronized (this.aClass32_38) {
			local12 = (Class2_Sub28) this.aClass32_38.method630((long) arg0);
			if (local12 == null) {
				if (!super.anInterface6_27.method1493(arg0)) {
					return null;
				}
				@Pc(32) Class175 local32 = super.anInterface6_27.method1492(arg0);
				@Pc(43) int local43 = local32.aBoolean309 || this.aBoolean278 ? 64 : this.lb;
				local12 = new Class2_Sub28(arg0, local43, super.anInterface6_27.method1489(true, local43, 0.7F, local43, arg0), local32.anInt4384 != 1);
				this.aClass32_38.method629(local12, (long) arg0);
			}
		}
		local12.aBoolean369 = true;
		return local12.method4419();
	}

	@OriginalMember(owner = "client!ii", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray118;
		@Pc(8) int[] local8 = local2.anIntArray119;
		@Pc(20) int local20;
		if (this.anInt3879 < arg3 + local5.length) {
			local20 = this.anInt3879 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt3871 > arg3) {
			local33 = this.anInt3871 - arg3;
			arg3 = this.anInt3871;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt3875;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt3859 > local58) {
				local62 -= this.anInt3859 - local58;
				local58 = this.anInt3859;
			}
			if (this.anInt3852 < local58 + local62) {
				local62 = this.anInt3852 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray269[local58++] = arg0;
			}
			local49 += this.anInt3875;
		}
	}

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "(I)Lclient!za;")
	@Override
	public Class2_Sub31 method6985(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ii", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt3859) {
			arg2 -= this.anInt3859 - arg0;
			arg0 = this.anInt3859;
		}
		if (arg1 < this.anInt3871) {
			arg3 -= this.anInt3871 - arg1;
			arg1 = this.anInt3871;
		}
		if (arg0 + arg2 > this.anInt3852) {
			arg2 = this.anInt3852 - arg0;
		}
		if (arg1 + arg3 > this.anInt3879) {
			arg3 = this.anInt3879 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt3852 || arg1 > this.anInt3879) {
			return;
		}
		@Pc(67) int local67 = this.anInt3875 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt3875;
		@Pc(78) int local78 = arg4 >>> 24;
		@Pc(90) int local90;
		@Pc(94) int local94;
		@Pc(101) int local101;
		if (arg5 != 0 && (arg5 != 1 || local78 != 255)) {
			@Pc(217) int local217;
			if (arg5 == 1) {
				@Pc(201) int local201 = ((arg4 & 0xFF00FF) * local78 >> 8 & 0xFF00FF) + (((arg4 & 0xFF00FF00) >>> 8) * local78 & 0xFF00FF00);
				local90 = 256 - local78;
				for (local94 = 0; local94 < arg3; local94++) {
					for (local101 = -arg2; local101 < 0; local101++) {
						local217 = this.anIntArray269[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray269[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray269[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray269[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray269[arg2] = arg4;
					arg2++;
					this.anIntArray269[arg2] = arg4;
					arg2++;
					this.anIntArray269[arg2] = arg4;
					arg2++;
					this.anIntArray269[arg2] = arg4;
					arg2++;
					this.anIntArray269[arg2] = arg4;
					arg2++;
					this.anIntArray269[arg2] = arg4;
					arg2++;
					this.anIntArray269[arg2] = arg4;
					arg2++;
					this.anIntArray269[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray269[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6978(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas3 == arg0) {
			this.method7002(null);
		}
		@Pc(15) Class2_Sub26 local15 = (Class2_Sub26) this.aClass118_20.method2595((long) arg0.hashCode());
		if (local15 != null) {
			local15.method8653();
		}
	}

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "()Z")
	@Override
	public boolean method6992() {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt3875;
		@Pc(35) int local35 = this.anInt3875 - arg2;
		if (arg1 + arg3 > this.anInt3879) {
			arg3 -= arg1 + arg3 - this.anInt3879;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt3871) {
			local59 = this.anInt3871 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt3875;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt3852) {
			local59 = arg0 + arg2 - this.anInt3852;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt3859) {
			local59 = this.anInt3859 - arg0;
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
						this.anIntArray269[local30++] = arg4;
					} else {
						this.anIntArray269[local30++] = arg5;
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
					local245 = this.anIntArray269[local30];
					this.anIntArray269[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray269[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray269[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6943(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aCanvas3 == null || this.aClass2_Sub26_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas3.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x + arg2 <= this.anInt3875 && local21.y + arg3 <= this.anInt3855 && local21.x + arg2 + local21.width > 0 && local21.y + arg3 + local21.height > 0) {
					this.aClass2_Sub26_1.method5617(local21.x + arg2, local21.width, local14, local21.x, local21.height, local21.y, local21.y + arg3);
				}
			}
		} catch (@Pc(79) Exception local79) {
			this.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6957(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!cha;)V")
	@Override
	public void method7010(@OriginalArg(0) Interface4 arg0) {
		@Pc(2) Class371 local2 = (Class371) arg0;
		this.anInt3875 = local2.anInt9956;
		this.anInt3855 = local2.anInt9965;
		this.anIntArray269 = local2.anIntArray681;
		this.aClass371_1 = local2;
		this.anInt3873 = local2.anInt9956;
		this.anInt3872 = local2.anInt9965;
		this.aFloatArray17 = local2.aFloatArray83;
		this.method3313();
	}

	@OriginalMember(owner = "client!ii", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass5Array1.length; local1++) {
			this.aClass5Array1[local1].anInt83 = this.aClass5Array1[local1].anInt85;
			this.aClass5Array1[local1].aBoolean9 = false;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([I)V")
	@Override
	public void method6969(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3875;
		arg0[1] = this.anInt3855;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "()Lclient!uha;")
	@Override
	public Class177 method6967() {
		@Pc(3) Class5 local3 = this.method3302(Thread.currentThread());
		return local3.aClass177_Sub2_1;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class76 method6934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class76_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!cd;)V")
	@Override
	public void method6939(@OriginalArg(0) Class12 arg0) {
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method3314(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7);
			} else {
				local28 = arg5 + arg6;
				local32 = arg7 % local28;
				local32 = local28 + arg5 - local32 - (-arg2 + 1) % local28;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				this.method3314(arg0 + arg2, arg1, 1 - arg2, arg4, arg5, arg6, arg7);
			}
		} else if (arg2 != 0) {
			local32 = arg7 << 8;
			@Pc(143) int local143 = arg5 << 8;
			@Pc(147) int local147 = arg6 << 8;
			local28 = local143 + local147;
			arg7 = local32 % local28;
			@Pc(172) int local172;
			@Pc(176) int local176;
			if (arg2 + arg3 < 0) {
				local172 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
				local176 = local172 % local28;
				local32 = local28 + local143 - arg7 - local176;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(254) int local254;
			@Pc(267) int local267;
			@Pc(349) int local349;
			@Pc(375) int local375;
			@Pc(380) int local380;
			@Pc(237) int local237;
			@Pc(223) int local223;
			@Pc(340) int local340;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				local223 = arg3 << 16;
				local172 = (int) Math.floor((double) local223 / (double) arg2 + 0.5D);
				local237 = arg2 + arg0;
				local176 = arg4 >>> 24;
				local254 = (int) Math.sqrt((double) ((local172 >> 8) * (local172 >> 8) + 65536));
				if (local176 == 255) {
					while (arg0 <= local237) {
						local267 = arg1 >> 16;
						if (arg0 >= this.anInt3859 && arg0 < this.anInt3852 && local267 >= this.anInt3871 && local267 < this.anInt3879 && arg7 < local143) {
							this.anIntArray269[arg0 + local267 * this.anInt3875] = arg4;
						}
						arg1 += local172;
						arg0++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				} else {
					local340 = ((arg4 & 0xFF00FF) * local176 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local176 >> 8 & 0xFF00) + (local176 << 24);
					local267 = 256 - local176;
					while (arg0 <= local237) {
						local349 = arg1 >> 16;
						if (arg0 >= this.anInt3859 && arg0 < this.anInt3852 && local349 >= this.anInt3871 && local349 < this.anInt3879 && arg7 < local143) {
							local375 = arg0 + local349 * this.anInt3875;
							local380 = this.anIntArray269[local375];
							local380 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray269[local375] = local340 + local380;
						}
						arg1 += local172;
						arg0++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				local237 = arg2 << 16;
				local172 = (int) Math.floor((double) local237 / (double) arg3 + 0.5D);
				local223 = arg3 + arg1;
				local176 = arg4 >>> 24;
				local254 = (int) Math.sqrt((double) ((local172 >> 8) * (local172 >> 8) + 65536));
				if (local176 == 255) {
					while (arg1 <= local223) {
						local267 = arg0 >> 16;
						if (arg1 >= this.anInt3871 && arg1 < this.anInt3879 && local267 >= this.anInt3859 && local267 < this.anInt3852 && arg7 < local143) {
							this.anIntArray269[local267 + arg1 * this.anInt3875] = arg4;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				} else {
					local340 = ((arg4 & 0xFF00FF) * local176 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local176 >> 8 & 0xFF00) + (local176 << 24);
					local267 = 256 - local176;
					while (arg1 <= local223) {
						local349 = arg0 >> 16;
						if (arg1 >= this.anInt3871 && arg1 < this.anInt3879 && local349 >= this.anInt3859 && local349 < this.anInt3852 && arg7 < local143) {
							local375 = local349 + arg1 * this.anInt3875;
							local380 = this.anIntArray269[local375];
							@Pc(708) int local708 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray269[local349 + arg1 * this.anInt3875] = local340 + local708;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			}
		} else if (arg3 >= 0) {
			this.method3301(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7);
		} else {
			local28 = arg5 + arg6;
			local32 = arg7 % local28;
			local32 = local28 + arg5 - local32 - (-arg3 + 1) % local28;
			arg7 = local32 % local28;
			if (arg7 < 0) {
				arg7 += local28;
			}
			this.method3301(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class5 local3 = this.method3302(Thread.currentThread());
		this.anInt3865 = arg0;
		this.anInt3866 = arg1;
		local3.anInt82 = this.anInt3866 - 255;
	}

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "()V")
	@Override
	protected void method6966() {
		if (this.aBoolean276) {
			Static621.method8309(false, true);
			this.aBoolean276 = false;
		}
		this.aClass2_Sub26_1 = null;
		this.aCanvas3 = null;
		this.anInt3851 = 0;
		this.anInt3850 = 0;
		this.aClass118_20 = null;
		this.aBoolean277 = true;
	}

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "()V")
	@Override
	public void method6991() {
	}

	@OriginalMember(owner = "client!ii", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt3871 || arg1 >= this.anInt3879) {
			return;
		}
		if (arg0 < this.anInt3859) {
			arg2 -= this.anInt3859 - arg0;
			arg0 = this.anInt3859;
		}
		if (arg0 + arg2 > this.anInt3852) {
			arg2 = this.anInt3852 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt3875;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray269[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray269[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray269[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray269[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray269[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!oq;[Lclient!tba;Z)Lclient!da;")
	@Override
	public Class62 method6956(@OriginalArg(0) Class256 arg0, @OriginalArg(1) Class329[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt8813;
			local7[local11] = arg1[local11].anInt8812;
			if (arg1[local11].aByteArray100 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class62_Sub4(this, arg0, arg1, local3, local7);
		} else {
			return new Class62_Sub1(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "(I)I")
	public int method3311(@OriginalArg(0) int arg0) {
		return super.anInterface6_27.method1492(arg0).anInt4384;
	}

	@OriginalMember(owner = "client!ii", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt3859 = 0;
		this.anInt3871 = 0;
		this.anInt3852 = this.anInt3875;
		this.anInt3879 = this.anInt3855;
		this.method3309();
	}

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "()I")
	@Override
	public int method6994() {
		return 0;
	}

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt3865;
	}

	@OriginalMember(owner = "client!ii", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass5Array1.length; local1++) {
			this.aClass5Array1[local1].anInt85 = this.aClass5Array1[local1].anInt83;
			this.aClass5Array1[local1].anInt86 = arg0;
			this.aClass5Array1[local1].anInt83 = arg1;
			this.aClass5Array1[local1].anInt81 = arg2;
			this.aClass5Array1[local1].aBoolean9 = true;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)I")
	@Override
	public int method6963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6984(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub26 local8 = (Class2_Sub26) this.aClass118_20.method2595((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static356.method4784(arg2, arg1, arg0);
			this.aClass118_20.method2601(local8, (long) arg0.hashCode());
		} else if (local8.anInt6571 != arg1 || local8.anInt6570 != arg2) {
			this.method6950(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray118;
		@Pc(8) int[] local8 = local2.anIntArray119;
		@Pc(17) int local17 = this.anInt3871 > arg7 ? this.anInt3871 : arg7;
		@Pc(32) int local32 = this.anInt3879 < arg7 + local5.length ? this.anInt3879 : arg7 + local5.length;
		@Pc(36) int local36 = arg10 << 8;
		@Pc(40) int local40 = arg8 << 8;
		@Pc(44) int local44 = arg9 << 8;
		@Pc(48) int local48 = local40 + local44;
		arg10 = local36 % local48;
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(77) int local77;
		@Pc(81) int local81;
		if (arg2 + arg3 < 0) {
			local77 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
			local81 = local77 % local48;
			local36 = local48 + local40 - arg10 - local81;
			arg10 = local36 % local48;
			if (arg10 < 0) {
				arg10 += local48;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(159) int local159;
		@Pc(172) int local172;
		@Pc(176) int local176;
		@Pc(199) int local199;
		@Pc(299) int local299;
		@Pc(316) int local316;
		@Pc(142) int local142;
		@Pc(128) int local128;
		@Pc(263) int local263;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			local142 = arg2 << 16;
			local77 = (int) Math.floor((double) local142 / (double) arg3 + 0.5D);
			local81 = (int) Math.sqrt((double) ((local77 >> 8) * (local77 >> 8) + 65536));
			local128 = arg3 + arg1;
			local159 = arg4 >>> 24;
			if (local159 == 255) {
				while (arg1 <= local128) {
					local172 = arg0 >> 16;
					local176 = arg1 - arg7;
					if (arg1 >= local17 && arg1 < local32 && local172 >= this.anInt3859 && local172 < this.anInt3852 && arg10 < local40 && local172 >= arg6 + local5[local176] && local172 < arg6 + local5[local176] + local8[local176]) {
						this.anIntArray269[local172 + arg1 * this.anInt3875] = arg4;
					}
					arg0 += local77;
					arg1++;
					local36 = arg10 + local81;
					arg10 = local36 % local48;
				}
			} else {
				local263 = ((arg4 & 0xFF00FF) * local159 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local159 >> 8 & 0xFF00) + (local159 << 24);
				local172 = 256 - local159;
				while (arg1 <= local128) {
					local176 = arg0 >> 16;
					local199 = arg1 - arg7;
					if (arg1 >= local17 && arg1 < local32 && local176 >= this.anInt3859 && local176 < this.anInt3852 && arg10 < local40 && local176 >= arg6 + local5[local199] && local176 < arg6 + local5[local199] + local8[local199]) {
						local299 = local176 + arg1 * this.anInt3875;
						local316 = this.anIntArray269[local299];
						@Pc(707) int local707 = ((local316 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local316 & 0xFF00) * local172 >> 8 & 0xFF00);
						this.anIntArray269[local176 + arg1 * this.anInt3875] = local263 + local707;
					}
					arg0 += local77;
					arg1++;
					local36 = arg10 + local81;
					arg10 = local36 % local48;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		local128 = arg3 << 16;
		local77 = (int) Math.floor((double) local128 / (double) arg2 + 0.5D);
		local142 = arg2 + arg0;
		local81 = arg4 >>> 24;
		local159 = (int) Math.sqrt((double) ((local77 >> 8) * (local77 >> 8) + 65536));
		if (local81 == 255) {
			while (arg0 <= local142) {
				local172 = arg1 >> 16;
				local176 = local172 - arg7;
				if (arg0 >= this.anInt3859 && arg0 < this.anInt3852 && local172 >= local17 && local172 < local32 && arg10 < local40) {
					local199 = arg6 + local5[local176];
					if (arg0 >= local199 && arg0 < local199 + local8[local176]) {
						this.anIntArray269[arg0 + local172 * this.anInt3875] = arg4;
					}
				}
				arg1 += local77;
				arg0++;
				local36 = arg10 + local159;
				arg10 = local36 % local48;
			}
			return;
		}
		local263 = ((arg4 & 0xFF00FF) * local81 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local81 >> 8 & 0xFF00) + (local81 << 24);
		local172 = 256 - local81;
		while (arg0 <= local142) {
			local176 = arg1 >> 16;
			local199 = local176 - arg7;
			if (arg0 >= this.anInt3859 && arg0 < this.anInt3852 && local176 >= local17 && local176 < local32 && arg10 < local40) {
				local299 = arg6 + local5[local199];
				if (arg0 >= local299 && arg0 < local299 + local8[local199]) {
					local316 = arg0 + local176 * this.anInt3875;
					@Pc(321) int local321 = this.anIntArray269[local316];
					@Pc(341) int local341 = ((local321 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local321 & 0xFF00) * local172 >> 8 & 0xFF00);
					this.anIntArray269[local316] = local263 + local341;
				}
			}
			arg1 += local77;
			arg0++;
			local36 = arg10 + local159;
			arg10 = local36 % local48;
		}
	}

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "(I)V")
	@Override
	public void method6982(@OriginalArg(0) int arg0) {
		this.aClass5Array1[arg0].method105(Thread.currentThread());
	}

	@OriginalMember(owner = "client!ii", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt3869 = (int) (arg1 * 65535.0F);
		this.anInt3853 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt3867 = (int) (arg3 * 65535.0F / local26);
		this.anInt3864 = (int) (arg4 * 65535.0F / local26);
		this.anInt3857 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "(I)Z")
	public boolean method3312(@OriginalArg(0) int arg0) {
		return super.anInterface6_27.method1493(arg0);
	}

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "()Lclient!uha;")
	@Override
	public Class177 method7001() {
		return new Class177_Sub2();
	}

	@OriginalMember(owner = "client!ii", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt3875 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray269[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "()V")
	private void method3313() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3874; local1++) {
			this.aClass5Array1[local1].method107();
		}
		this.la();
	}

	@OriginalMember(owner = "client!ii", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass177_Sub2_2.aFloat103 + this.aClass177_Sub2_2.aFloat105 * (float) arg0 + this.aClass177_Sub2_2.aFloat101 * (float) arg1 + this.aClass177_Sub2_2.aFloat111 * (float) arg2;
		if (local24 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = (int) ((float) this.anInt3868 * (this.aClass177_Sub2_2.aFloat102 + this.aClass177_Sub2_2.aFloat112 * (float) arg0 + this.aClass177_Sub2_2.aFloat106 * (float) arg1 + this.aClass177_Sub2_2.aFloat109 * (float) arg2) / local24);
		@Pc(105) int local105 = (int) ((float) this.anInt3877 * (this.aClass177_Sub2_2.aFloat108 + this.aClass177_Sub2_2.aFloat107 * (float) arg0 + this.aClass177_Sub2_2.aFloat104 * (float) arg1 + this.aClass177_Sub2_2.aFloat110 * (float) arg2) / local24);
		arg3[0] = local73 - this.anInt3870;
		arg3[1] = local105 - this.anInt3878;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!ii", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.aa(0, 0, this.anInt3875, this.anInt3855, arg0, 0);
	}

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "()Z")
	@Override
	public boolean method7003() {
		return true;
	}

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "()Z")
	@Override
	public boolean method6946() {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIIIIIII)V")
	private void method3314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < this.anInt3871 || arg1 >= this.anInt3879) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt3875;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg0 + local37 >= this.anInt3859 && arg0 + local37 < this.anInt3852 && local27 < arg4) {
					this.anIntArray269[local15 + local37] = arg3;
				}
				local37++;
				local27++;
				local27 %= local23;
			}
			return;
		}
		@Pc(97) int local97 = ((arg3 & 0xFF00FF) * local19 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local19 >> 8 & 0xFF00) + (local19 << 24);
		local37 = 256 - local19;
		@Pc(103) int local103 = 0;
		while (local103 < arg2) {
			if (arg0 + local103 >= this.anInt3859 && arg0 + local103 < this.anInt3852 && local27 < arg4) {
				@Pc(126) int local126 = this.anIntArray269[local15 + local103];
				@Pc(146) int local146 = ((local126 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local126 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray269[local15 + local103] = local97 + local146;
			}
			local103++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "()V")
	@Override
	public void method6976() {
	}

	@OriginalMember(owner = "client!ii", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	@Override
	public void method6925(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt3849;
		for (@Pc(9) Object local9 = this.aClass32_38.method637(); local9 != null; local9 = this.aClass32_38.method635()) {
			@Pc(13) Class2_Sub28 local13 = (Class2_Sub28) local9;
			if (local13.aBoolean369) {
				local13.anInt5235 += local4;
				@Pc(27) int local27 = local13.anInt5235 / 20;
				if (local27 > 0) {
					@Pc(36) Class175 local36 = super.anInterface6_27.method1492(local13.anInt5237);
					local13.method4421(local36.aByte53 * local4 * 50 / 1000, local36.aByte54 * local4 * 50 / 1000);
					local13.anInt5235 -= local27 * 20;
				}
				local13.aBoolean369 = false;
			}
		}
		this.anInt3849 = arg0;
		this.aClass32_39.method634(5);
		this.aClass32_38.method634(5);
	}

	@OriginalMember(owner = "client!ii", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class5 local3 = this.method3302(Thread.currentThread());
		local3.anInt86 = arg0;
		local3.anInt83 = arg1;
		local3.anInt81 = arg2;
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(IIIIII)V")
	private void method3315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg1 - arg3;
		if (local8 < this.anInt3871) {
			local8 = this.anInt3871;
		}
		@Pc(21) int local21 = arg1 + arg3 + 1;
		if (local21 > this.anInt3879) {
			local21 = this.anInt3879;
		}
		@Pc(30) int local30 = local8;
		@Pc(34) int local34 = arg3 * arg3;
		@Pc(36) int local36 = 0;
		@Pc(40) int local40 = arg1 - local8;
		@Pc(44) int local44 = local40 * local40;
		@Pc(48) int local48 = local44 - local40;
		if (arg1 > local21) {
			arg1 = local21;
		}
		@Pc(57) int local57 = arg4 >>> 24;
		@Pc(91) int local91;
		@Pc(102) int local102;
		@Pc(116) int local116;
		@Pc(118) int local118;
		if (arg5 == 0 || arg5 == 1 && local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt3859) {
					local91 = this.anInt3859;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3852) {
					local102 = this.anInt3852;
				}
				local116 = local91 + local30 * this.anInt3875;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray17[local116]) {
						this.anIntArray269[local116] = arg4;
					}
					local116++;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg3;
			local40 = local30 - arg1;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg3;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt3859) {
					local91 = this.anInt3859;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3852 - 1) {
					local102 = this.anInt3852 - 1;
				}
				local116 = local91 + local30 * this.anInt3875;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray17[local116]) {
						this.anIntArray269[local116] = arg4;
					}
					local116++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(350) int local350;
		@Pc(364) int local364;
		if (arg5 == 1) {
			@Pc(293) int local293 = ((arg4 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
			local91 = 256 - local57;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local102 = arg0 + 1 - local36;
				if (local102 < this.anInt3859) {
					local102 = this.anInt3859;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt3852) {
					local116 = this.anInt3852;
				}
				local118 = local102 + local30 * this.anInt3875;
				for (local350 = local102; local350 < local116; local350++) {
					if ((float) arg2 < this.aFloatArray17[local118]) {
						local364 = this.anIntArray269[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray269[local118] = local293 + local364;
					}
					local118++;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg3;
			local40 = -local40;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg3;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local102 = arg0 - local36;
				if (local102 < this.anInt3859) {
					local102 = this.anInt3859;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt3852 - 1) {
					local116 = this.anInt3852 - 1;
				}
				local118 = local102 + local30 * this.anInt3875;
				for (local350 = local102; local350 <= local116; local350++) {
					if ((float) arg2 < this.aFloatArray17[local118]) {
						local364 = this.anIntArray269[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray269[local118] = local293 + local364;
					}
					local118++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else if (arg5 == 2) {
			@Pc(633) int local633;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt3859) {
					local91 = this.anInt3859;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3852) {
					local102 = this.anInt3852;
				}
				local116 = local91 + local30 * this.anInt3875;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray17[local116]) {
						local350 = this.anIntArray269[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(643) int local643 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray269[local116] = local364 - local643 | local643 - (local643 >>> 8);
					}
					local116++;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg3;
			local40 = -local40;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg3;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt3859) {
					local91 = this.anInt3859;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3852 - 1) {
					local102 = this.anInt3852 - 1;
				}
				local116 = local91 + local30 * this.anInt3875;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray17[local116]) {
						local350 = this.anIntArray269[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray269[local116] = local364 - local350 | local350 - (local350 >>> 8);
					}
					local116++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ii", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3863 = arg0;
		this.anInt3862 = arg1;
		this.anInt3868 = arg2;
		this.anInt3877 = arg3;
		this.method3309();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIZ)Lclient!cw;")
	@Override
	public Class61 method6952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? new Class61_Sub1_Sub1(this, arg0, arg1) : new Class61_Sub1_Sub2(this, arg0, arg1);
	}
}
