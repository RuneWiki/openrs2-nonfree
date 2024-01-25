import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class55_Sub2 extends Class55 {

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "Z")
	public boolean aBoolean481;

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "F")
	private float aFloat63;

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "Lclient!fa;")
	public Class66_Sub1 aClass66_Sub1_3;

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "Lclient!ka;")
	private Class109 aClass109_54;

	@OriginalMember(owner = "client!sq", name = "A", descriptor = "I")
	public int anInt5831;

	@OriginalMember(owner = "client!sq", name = "F", descriptor = "I")
	public int anInt5834;

	@OriginalMember(owner = "client!sq", name = "G", descriptor = "I")
	public int anInt5835;

	@OriginalMember(owner = "client!sq", name = "N", descriptor = "I")
	public int anInt5841;

	@OriginalMember(owner = "client!sq", name = "P", descriptor = "I")
	public int anInt5842;

	@OriginalMember(owner = "client!sq", name = "Q", descriptor = "I")
	public int anInt5843;

	@OriginalMember(owner = "client!sq", name = "T", descriptor = "[Lclient!a;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!sq", name = "Y", descriptor = "I")
	public int anInt5849;

	@OriginalMember(owner = "client!sq", name = "fb", descriptor = "I")
	private int anInt5854;

	@OriginalMember(owner = "client!sq", name = "gb", descriptor = "I")
	public int anInt5855;

	@OriginalMember(owner = "client!sq", name = "jb", descriptor = "I")
	public int anInt5857;

	@OriginalMember(owner = "client!sq", name = "kb", descriptor = "F")
	private float aFloat64;

	@OriginalMember(owner = "client!sq", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!sq", name = "mb", descriptor = "Lclient!sf;")
	private Class5_Sub38 aClass5_Sub38_1;

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "Z")
	private boolean aBoolean482 = false;

	@OriginalMember(owner = "client!sq", name = "E", descriptor = "I")
	public int anInt5833 = 0;

	@OriginalMember(owner = "client!sq", name = "L", descriptor = "I")
	public int anInt5839 = 45823;

	@OriginalMember(owner = "client!sq", name = "I", descriptor = "I")
	public int anInt5837 = 512;

	@OriginalMember(owner = "client!sq", name = "S", descriptor = "I")
	public int anInt5845 = 78642;

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
	private int anInt5828 = 0;

	@OriginalMember(owner = "client!sq", name = "W", descriptor = "I")
	public int anInt5847 = 0;

	@OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
	public int anInt5832 = 3500;

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
	public int anInt5829 = 0;

	@OriginalMember(owner = "client!sq", name = "R", descriptor = "I")
	public int anInt5844 = 512;

	@OriginalMember(owner = "client!sq", name = "cb", descriptor = "I")
	public int anInt5852 = 0;

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
	private int anInt5827 = 3500;

	@OriginalMember(owner = "client!sq", name = "X", descriptor = "I")
	private int anInt5848 = 0;

	@OriginalMember(owner = "client!sq", name = "M", descriptor = "I")
	public int anInt5840 = 75518;

	@OriginalMember(owner = "client!sq", name = "y", descriptor = "I")
	private int anInt5830 = 0;

	@OriginalMember(owner = "client!sq", name = "C", descriptor = "Z")
	private boolean aBoolean483 = false;

	@OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
	public int anInt5836 = this.anInt5827 - 255;

	@OriginalMember(owner = "client!sq", name = "db", descriptor = "Z")
	private boolean aBoolean484 = false;

	@OriginalMember(owner = "client!sq", name = "eb", descriptor = "I")
	public int anInt5853 = 50;

	@OriginalMember(owner = "client!sq", name = "Z", descriptor = "I")
	public int anInt5850 = 0;

	@OriginalMember(owner = "client!sq", name = "bb", descriptor = "I")
	public int anInt5851 = 0;

	@OriginalMember(owner = "client!sq", name = "hb", descriptor = "I")
	public int anInt5856 = 0;

	@OriginalMember(owner = "client!sq", name = "ib", descriptor = "Z")
	public boolean aBoolean485 = false;

	@OriginalMember(owner = "client!sq", name = "U", descriptor = "Lclient!ka;")
	private final Class109 aClass109_55 = new Class109(16);

	@OriginalMember(owner = "client!sq", name = "ab", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!sq", name = "O", descriptor = "Lclient!gf;")
	public Interface3 anInterface3_6;

	@OriginalMember(owner = "client!sq", name = "D", descriptor = "Lclient!ui;")
	private Class3 aClass3_1;

	@OriginalMember(owner = "client!sq", name = "K", descriptor = "[I")
	public int[] anIntArray569;

	@OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
	public int anInt5838;

	@OriginalMember(owner = "client!sq", name = "V", descriptor = "I")
	private int anInt5846;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!gf;I)V")
	public Class55_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2) {
		this.aCanvas5 = arg0;
		this.anInterface3_6 = arg1;
		super.anInt5811 = arg2;
		this.aClass3_1 = Static299.method6019(this.aCanvas5);
		this.anIntArray569 = this.aClass3_1.anIntArray69;
		this.anInt5838 = this.aClass3_1.anInt608;
		this.anInt5846 = this.aClass3_1.anInt605;
		this.method5265();
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)V")
	@Override
	public void method5237(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "()Z")
	@Override
	public boolean method5177() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([Lclient!ts;Lclient!ve;[Lclient!uh;I)V")
	@Override
	public void method5244(@OriginalArg(0) Class112[] arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) Class32_Sub8[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class112_Sub2[] local3 = new Class112_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class112_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class112_Sub2 local26 = Static243.method4354(this, local3);
		local26.method4375(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!ve;)V")
	@Override
	public void method5252(@OriginalArg(0) Class66 arg0) {
		this.aClass66_Sub1_3 = (Class66_Sub1) arg0;
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "()V")
	@Override
	public void method5159() {
		if (this.aCanvas5 == null || this.aClass3_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas5.getGraphics();
			this.aClass3_1.method551(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method5246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt5838;
		@Pc(35) int local35 = this.anInt5838 - arg2;
		if (arg1 + arg3 > this.anInt5833) {
			arg3 -= arg1 + arg3 - this.anInt5833;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt5850) {
			local59 = this.anInt5850 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt5838;
			local8 = local23 * local59;
		}
		if (arg0 + arg2 > this.anInt5829) {
			local59 = arg0 + arg2 - this.anInt5829;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt5847) {
			local59 = this.anInt5847 - arg0;
			arg2 -= local59;
			local30 += local59;
			local6 = local14 * local59;
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
						this.anIntArray569[local30++] = arg4;
					} else {
						this.anIntArray569[local30++] = arg5;
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
					local245 = this.anIntArray569[local30];
					this.anIntArray569[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray569[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray569[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method5221(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt5839 = (int) (arg1 * 65535.0F);
		this.anInt5845 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.lb = (int) (arg3 * 65535.0F / local26);
		this.anInt5855 = (int) (arg4 * 65535.0F / local26);
		this.anInt5849 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!ts;Lclient!ns;Lclient!ve;Lclient!uh;I)V")
	@Override
	public void method5241(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) Class32_Sub8 arg3) {
		((Class112_Sub2) arg0).method4375(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([I)V")
	@Override
	public void method5203(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5847;
		arg0[1] = this.anInt5850;
		arg0[2] = this.anInt5829;
		arg0[3] = this.anInt5833;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "()V")
	private void method5260() {
		this.anInt5834 = this.anInt5847 - this.anInt5831;
		this.anInt5842 = this.anInt5829 - this.anInt5831;
		this.anInt5857 = this.anInt5850 - this.anInt5843;
		this.anInt5841 = this.anInt5833 - this.anInt5843;
		for (@Pc(29) int local29 = 0; local29 < this.anInt5835; local29++) {
			@Pc(36) Class80 local36 = this.aClass1Array1[local29].aClass80_1;
			local36.anInt2017 = this.anInt5831 - this.anInt5847;
			local36.anInt2014 = this.anInt5843 - this.anInt5850;
			local36.anInt2015 = this.anInt5829 - this.anInt5847;
			local36.anInt2016 = this.anInt5833 - this.anInt5850;
		}
		@Pc(78) int local78 = this.anInt5850 * this.anInt5838 + this.anInt5847;
		for (@Pc(81) int local81 = this.anInt5850; local81 < this.anInt5833; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt5835; local84++) {
				this.aClass1Array1[local84].aClass80_1.anIntArray198[local81 - this.anInt5850] = local78;
			}
			local78 += this.anInt5838;
		}
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(III)V")
	@Override
	public void method5234() {
		this.anInt5830 = this.anInt5852;
		this.anInt5856 = -1;
		this.anInt5852 = 1583160;
		this.anInt5851 = 40;
		this.aBoolean485 = true;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
	@Override
	public void method5164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5852 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt5852 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt5852 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt5852 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt5852 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean481 = false;
		} else {
			this.aBoolean481 = true;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIZ)Lclient!wn;")
	@Override
	public Class95 method5157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt5838 + arg0;
		@Pc(16) int local16 = this.anInt5838 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray569[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class95_Sub1_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class95_Sub1_Sub3(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!hf;III)V")
	public void method5261(@OriginalArg(0) Class32_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg3 >> 1;
		@Pc(6) int local6 = arg0.anInt3757;
		if (local6 == -1) {
			this.method5175(arg1, arg2, local3, arg0.anInt3761);
			return;
		}
		if (this.aClass5_Sub38_1 == null || this.aClass5_Sub38_1.aLong235 != (long) local6) {
			this.aClass5_Sub38_1 = (Class5_Sub38) this.aClass109_55.method2857((long) local6);
		}
		if (this.aClass5_Sub38_1 == null) {
			@Pc(44) int[] local44 = this.method5270(local6);
			if (local44 == null) {
				return;
			}
			this.aClass5_Sub38_1 = new Class5_Sub38();
			this.aClass5_Sub38_1.aBoolean474 = this.method5268(local6);
			@Pc(65) int local65 = this.aClass5_Sub38_1.aBoolean474 ? 64 : 128;
			this.aClass5_Sub38_1.aClass95_12 = this.method5210(local44, local65, local65, local65);
			this.aClass109_55.method2855((long) local6, this.aClass5_Sub38_1);
		}
		if (this.aClass5_Sub38_1.aBoolean474) {
			local3 <<= 0x1;
			arg3 <<= 0x1;
		}
		this.aClass5_Sub38_1.aClass95_12.method5493(arg1 - local3, arg2 - local3, arg3, arg3, 1, arg0.anInt3761, 1);
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(IIII)V")
	@Override
	public void method5167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(FF)V")
	@Override
	public void method5156(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat63 = arg0;
		this.aFloat64 = arg1;
		this.method5271();
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "(I)V")
	@Override
	public void method5255(@OriginalArg(0) int arg0) {
		this.aClass1Array1[arg0].method4(Thread.currentThread());
	}

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "(I)I")
	public int method5262(@OriginalArg(0) int arg0) {
		return this.anInterface3_6.method1511(arg0).aShort84 & 0xFFFF;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
	@Override
	public void method5226(@OriginalArg(0) int arg0) {
		this.method5205(0, 0, this.anInt5838, this.anInt5846, arg0, 0);
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method5176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt5850 || arg1 >= this.anInt5833) {
			return;
		}
		if (arg0 < this.anInt5847) {
			arg2 -= this.anInt5847 - arg0;
			arg0 = this.anInt5847;
		}
		if (arg0 + arg2 > this.anInt5829) {
			arg2 = this.anInt5829 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5838;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray569[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray569[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray569[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray569[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray569[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5174(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas5 == null || this.aClass3_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas5.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt5838 && local21.y <= this.anInt5846 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass3_1.method545(local21.width, local21.y, local21.height, local21.x, local14);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "()Z")
	@Override
	public boolean method5193() {
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(II)I")
	@Override
	public int method5181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x10400;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!sq", name = "H", descriptor = "()F")
	@Override
	public float method5232() {
		return this.aFloat64;
	}

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "(I)Z")
	public boolean method5263(@OriginalArg(0) int arg0) {
		return this.anInterface3_6.method1511(arg0).aBoolean544;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5176(arg0, arg1, arg2, arg4, arg5);
		this.method5176(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method5192(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method5192(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!sq", name = "y", descriptor = "()V")
	@Override
	public void method5212() {
	}

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "()Z")
	@Override
	public boolean method5209() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II[I[I)Lclient!de;")
	@Override
	public Class46 method5206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class46_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5831 = arg0;
		this.anInt5843 = arg1;
		this.anInt5844 = arg2;
		this.anInt5837 = arg3;
		this.method5260();
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "()Z")
	public boolean method5264() {
		return this.aBoolean484;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "()V")
	private void method5265() {
		this.aClass109_54 = new Class109(20);
		this.aClass66_Sub1_3 = new Class66_Sub1();
		Static55.method4832(false);
		this.aBoolean482 = true;
		this.method5233(1);
		this.method5255(0);
		this.method5186();
	}

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "()Z")
	@Override
	public boolean method5170() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class1 local3 = this.method5266(Thread.currentThread());
		@Pc(6) Class80 local6 = local3.aClass80_1;
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
		@Pc(93) int local93 = arg0 - local6.method1902();
		@Pc(98) int local98 = arg1 - local6.method1898();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt2018 = 0;
		local6.aBoolean146 = local102 < 0 || local102 > local6.anInt2015 || local106 < 0 || local106 > local6.anInt2015 || local112 < 0 || local112 > local6.anInt2015;
		local6.method1892(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean146 = local102 < 0 || local102 > local6.anInt2015 || local106 < 0 || local106 > local6.anInt2015 || local118 < 0 || local118 > local6.anInt2015;
		local6.method1892(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!jf;Z)Lclient!wn;")
	@Override
	public Class95 method5229(@OriginalArg(0) Class100 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray288;
		@Pc(5) byte[] local5 = arg0.aByteArray38;
		@Pc(8) int local8 = arg0.anInt2902;
		@Pc(11) int local11 = arg0.anInt2901;
		@Pc(76) Class95_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray37 == null) {
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
			local76 = new Class95_Sub1_Sub1(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray37;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class95_Sub1_Sub2(this, local20, local8, local11);
				local76 = new Class95_Sub1_Sub3(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class95_Sub1_Sub2(this, local20, local8, local11);
			}
		}
		local76.method5496(arg0.anInt2897, arg0.anInt2899, arg0.anInt2900, arg0.anInt2898);
		return local76;
	}

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "()I")
	@Override
	public int method5196() {
		return 0;
	}

	@OriginalMember(owner = "client!sq", name = "E", descriptor = "()V")
	@Override
	public void method5224() {
		this.anInt5852 = this.anInt5830;
		this.aBoolean485 = false;
	}

	@OriginalMember(owner = "client!sq", name = "L", descriptor = "()V")
	@Override
	public void method5256() {
	}

	@OriginalMember(owner = "client!sq", name = "I", descriptor = "()I")
	@Override
	public int method5242() {
		@Pc(2) int local2 = this.anInt5848;
		this.anInt5848 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "()V")
	@Override
	public void method5186() {
		this.anInt5847 = 0;
		this.anInt5850 = 0;
		this.anInt5829 = this.anInt5838;
		this.anInt5833 = this.anInt5846;
		this.method5260();
	}

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "()Z")
	@Override
	public boolean method5190() {
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5847 < arg0) {
			this.anInt5847 = arg0;
		}
		if (this.anInt5850 < arg1) {
			this.anInt5850 = arg1;
		}
		if (this.anInt5829 > arg2) {
			this.anInt5829 = arg2;
		}
		if (this.anInt5833 > arg3) {
			this.anInt5833 = arg3;
		}
		this.method5260();
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(Z)V")
	@Override
	public void method5249(@OriginalArg(0) boolean arg0) {
		this.aBoolean483 = arg0;
		this.aClass109_54.method2858();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!a;")
	public Class1 method5266(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5835; local1++) {
			if (this.aClass1Array1[local1].aRunnable1 == arg0) {
				return this.aClass1Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "()V")
	@Override
	public void method5211() {
	}

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "()Lclient!ve;")
	@Override
	public Class66 method5195() {
		@Pc(3) Class1 local3 = this.method5266(Thread.currentThread());
		return local3.aClass66_Sub1_1;
	}

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "()Z")
	@Override
	public boolean method5182() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method5175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt5850) {
			local8 = this.anInt5850;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt5833) {
			local21 = this.anInt5833;
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
				if (local91 < this.anInt5847) {
					local91 = this.anInt5847;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5829) {
					local102 = this.anInt5829;
				}
				local116 = local91 + local30 * this.anInt5838;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray569[local116++] = arg3;
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
				if (local91 < this.anInt5847) {
					local91 = this.anInt5847;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5829 - 1) {
					local102 = this.anInt5829 - 1;
				}
				local116 = local91 + local30 * this.anInt5838;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray569[local116++] = arg3;
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
			if (local102 < this.anInt5847) {
				local102 = this.anInt5847;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt5829) {
				local116 = this.anInt5829;
			}
			local118 = local102 + local30 * this.anInt5838;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray569[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray569[local118++] = local277 + local360;
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
			if (local102 < this.anInt5847) {
				local102 = this.anInt5847;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt5829 - 1) {
				local116 = this.anInt5829 - 1;
			}
			local118 = local102 + local30 * this.anInt5838;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray569[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray569[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)I")
	@Override
	public int method5165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!de;II)V")
	@Override
	public void method5185(@OriginalArg(1) Class46 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class46_Sub1 local2 = (Class46_Sub1) arg0;
		@Pc(5) int[] local5 = local2.anIntArray403;
		@Pc(8) int[] local8 = local2.anIntArray402;
		@Pc(20) int local20;
		if (this.anInt5833 < arg2 + local5.length) {
			local20 = this.anInt5833 - arg2;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt5850 > arg2) {
			local33 = this.anInt5850 - arg2;
			arg2 = this.anInt5850;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg2 * this.anInt5838;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg1 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt5847 > local58) {
				local62 -= this.anInt5847 - local58;
				local58 = this.anInt5847;
			}
			if (this.anInt5829 < local58 + local62) {
				local62 = this.anInt5829 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray569[local58++] = -16777216;
			}
			local49 += this.anInt5838;
		}
	}

	@OriginalMember(owner = "client!sq", name = "D", descriptor = "()I")
	@Override
	public int method5222() {
		@Pc(2) int local2 = this.anInt5828;
		this.anInt5828 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "()Z")
	@Override
	public boolean method5187() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "B", descriptor = "()Z")
	@Override
	public boolean method5218() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "()Z")
	@Override
	public boolean method5160() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!ns;)V")
	@Override
	public void method5189(@OriginalArg(0) Class146 arg0) {
		@Pc(3) Class32_Sub3 local3 = arg0.aClass13_1.aClass32_Sub3_1;
		for (@Pc(6) Class32_Sub3 local6 = local3.aClass32_Sub3_8; local6 != local3; local6 = local6.aClass32_Sub3_8) {
			@Pc(10) Class32_Sub3_Sub1 local10 = (Class32_Sub3_Sub1) local6;
			@Pc(15) int local15 = local10.anInt3760 >> 12;
			@Pc(20) int local20 = local10.anInt3755 >> 12;
			@Pc(25) int local25 = local10.anInt3756 >> 12;
			@Pc(49) int local49 = this.aClass66_Sub1_3.anInt1552 + (this.aClass66_Sub1_3.anInt1553 * local15 + this.aClass66_Sub1_3.anInt1545 * local20 + this.aClass66_Sub1_3.anInt1548 * local25 >> 15);
			if (local49 >= this.anInt5853 && local49 <= this.anInt5827) {
				@Pc(90) int local90 = this.anInt5831 + this.anInt5844 * (this.aClass66_Sub1_3.anInt1544 + (this.aClass66_Sub1_3.anInt1549 * local15 + this.aClass66_Sub1_3.anInt1546 * local20 + this.aClass66_Sub1_3.anInt1551 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt5843 + this.anInt5837 * (this.aClass66_Sub1_3.anInt1555 + (this.aClass66_Sub1_3.anInt1554 * local15 + this.aClass66_Sub1_3.anInt1547 * local20 + this.aClass66_Sub1_3.anInt1550 * local25 >> 15)) / local49;
				if (local90 >= this.anInt5847 && local90 <= this.anInt5829 && local122 >= this.anInt5850 && local122 <= this.anInt5833) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method5261(local10, local90, local122, (local10.anInt3759 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "()Lclient!ve;")
	@Override
	public Class66 method5173() {
		return new Class66_Sub1();
	}

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "(I)Z")
	public boolean method5267(@OriginalArg(0) int arg0) {
		return this.anInterface3_6.method1509(arg0);
	}

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "(I)Z")
	public boolean method5268(@OriginalArg(0) int arg0) {
		return this.aBoolean483 || this.anInterface3_6.method1511(arg0).aBoolean539;
	}

	@OriginalMember(owner = "client!sq", name = "K", descriptor = "()Z")
	@Override
	public boolean method5250() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method5192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt5847 || arg0 >= this.anInt5829) {
			return;
		}
		if (arg1 < this.anInt5850) {
			arg2 -= this.anInt5850 - arg1;
			arg1 = this.anInt5850;
		}
		if (arg1 + arg2 > this.anInt5833) {
			arg2 = this.anInt5833 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5838;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray569[local40 + local54 * this.anInt5838] = arg3;
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
				local111 = local40 + local103 * this.anInt5838;
				local116 = this.anIntArray569[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray569[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt5838;
				local111 = this.anIntArray569[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray569[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([Lclient!ts;Lclient!ns;Lclient!ve;[Lclient!uh;I)V")
	@Override
	public void method5214(@OriginalArg(0) Class112[] arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) Class32_Sub8[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class112_Sub2[] local3 = new Class112_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class112_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class112_Sub2 local26 = Static243.method4354(this, local3);
		local26.method4375(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!sq", name = "J", descriptor = "()Z")
	@Override
	public boolean method5247() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(IIII)V")
	@Override
	public void method5258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt5838) {
			arg2 = this.anInt5838;
		}
		if (arg3 > this.anInt5846) {
			arg3 = this.anInt5846;
		}
		this.anInt5847 = arg0;
		this.anInt5829 = arg2;
		this.anInt5850 = arg1;
		this.anInt5833 = arg3;
		this.method5260();
	}

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "()V")
	@Override
	public void method5199() {
		this.aClass109_54.method2858();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)V")
	@Override
	public void method5163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5856 = arg0;
		this.anInt5852 = arg1;
		this.anInt5851 = arg2;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II[[I[[IIII)Lclient!dn;")
	@Override
	public Class51 method5155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class51_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!lf;)V")
	@Override
	public void method5227(@OriginalArg(0) Class5_Sub23 arg0) {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([IIIII)Lclient!wn;")
	@Override
	public Class95 method5210(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class95_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class95_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class95_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class95_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(I)V")
	@Override
	public void method5248(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt5854;
		for (@Pc(9) Object local9 = this.aClass109_54.method2865(); local9 != null; local9 = this.aClass109_54.method2848()) {
			@Pc(13) Class5_Sub13 local13 = (Class5_Sub13) local9;
			if (local13.aBoolean106) {
				local13.anInt1521 += local4;
				@Pc(27) int local27 = local13.anInt1521 / 20;
				if (local27 > 0) {
					@Pc(36) Class200 local36 = this.anInterface3_6.method1511(local13.anInt1519);
					local13.method1450(local36.aByte68 * local4 * 50 / 1000, local36.aByte67 * local4 * 50 / 1000);
					local13.anInt1521 -= local27 * 20;
				}
				local13.aBoolean106 = false;
			}
		}
		this.anInt5854 = arg0;
		this.aClass109_55.method2859(5);
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "(IIIIII)Lclient!sg;")
	@Override
	public Class54 method5238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(Z)V")
	@Override
	public void method5259(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Lclient!lf;")
	@Override
	public Class5_Sub23 method5198() {
		return null;
	}

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "(I)V")
	@Override
	public void method5257(@OriginalArg(0) int arg0) {
		this.aClass1Array1[arg0].method4(null);
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(II)V")
	@Override
	public void method5200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5853 = arg0;
		this.anInt5827 = arg1;
		this.anInt5836 = this.anInt5827 - 255;
		this.method5271();
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(IIII)[I")
	@Override
	public int[] method5202() {
		@Pc(4) int[] local4 = new int[1152];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			@Pc(18) int local18 = local8 * this.anInt5838;
			for (@Pc(20) int local20 = 0; local20 < 36; local20++) {
				local4[local6++] = this.anIntArray569[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5253(@OriginalArg(0) Canvas arg0) {
		this.aCanvas5 = arg0;
		this.method5171();
	}

	@OriginalMember(owner = "client!sq", name = "F", descriptor = "()Z")
	@Override
	public boolean method5228() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "(I)[I")
	public int[] method5269(@OriginalArg(0) int arg0) {
		@Pc(2) Class109 local2 = this.aClass109_54;
		@Pc(12) Class5_Sub13 local12;
		synchronized (this.aClass109_54) {
			local12 = (Class5_Sub13) this.aClass109_54.method2857((long) arg0);
			if (local12 == null) {
				if (!this.anInterface3_6.method1509(arg0)) {
					return null;
				}
				@Pc(32) Class200 local32 = this.anInterface3_6.method1511(arg0);
				@Pc(42) int local42 = local32.aBoolean539 || this.aBoolean483 ? 64 : 128;
				local12 = new Class5_Sub13(arg0, local42, this.anInterface3_6.method1508(local42, local42, arg0, true, 0.7F), local32.aBoolean538);
				this.aClass109_54.method2855((long) arg0, local12);
			}
		}
		local12.aBoolean106 = true;
		return local12.method1452();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass66_Sub1_3.anInt1552 + (this.aClass66_Sub1_3.anInt1553 * arg0 + this.aClass66_Sub1_3.anInt1545 * arg1 + this.aClass66_Sub1_3.anInt1548 * arg2 >> 15);
		if (local23 < this.anInt5853 || local23 > this.anInt5827) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt5844 * (this.aClass66_Sub1_3.anInt1544 + (this.aClass66_Sub1_3.anInt1549 * arg0 + this.aClass66_Sub1_3.anInt1546 * arg1 + this.aClass66_Sub1_3.anInt1551 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt5837 * (this.aClass66_Sub1_3.anInt1555 + (this.aClass66_Sub1_3.anInt1554 * arg0 + this.aClass66_Sub1_3.anInt1547 * arg1 + this.aClass66_Sub1_3.anInt1550 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt5834 && local73 <= this.anInt5842 && local102 >= this.anInt5857 && local102 <= this.anInt5841) {
			arg3[0] = local73 - this.anInt5834;
			arg3[1] = local102 - this.anInt5857;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "(I)[I")
	private int[] method5270(@OriginalArg(0) int arg0) {
		@Pc(2) Class109 local2 = this.aClass109_54;
		@Pc(12) Class5_Sub13 local12;
		synchronized (this.aClass109_54) {
			local12 = (Class5_Sub13) this.aClass109_54.method2857((long) arg0);
			if (local12 == null) {
				if (!this.anInterface3_6.method1509(arg0)) {
					return null;
				}
				@Pc(32) Class200 local32 = this.anInterface3_6.method1511(arg0);
				@Pc(42) int local42 = local32.aBoolean539 || this.aBoolean483 ? 64 : 128;
				local12 = new Class5_Sub13(arg0, local42, this.anInterface3_6.method1512(0.7F, local42, local42, arg0), local32.aBoolean538);
				this.aClass109_54.method2855((long) arg0, local12);
			}
		}
		local12.aBoolean106 = true;
		return local12.method1452();
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt5847) {
			arg2 -= this.anInt5847 - arg0;
			arg0 = this.anInt5847;
		}
		if (arg1 < this.anInt5850) {
			arg3 -= this.anInt5850 - arg1;
			arg1 = this.anInt5850;
		}
		if (arg0 + arg2 > this.anInt5829) {
			arg2 = this.anInt5829 - arg0;
		}
		if (arg1 + arg3 > this.anInt5833) {
			arg3 = this.anInt5833 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt5829 || arg1 > this.anInt5833) {
			return;
		}
		@Pc(67) int local67 = this.anInt5838 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt5838;
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
						local221 = this.anIntArray569[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray569[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray569[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray569[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray569[arg2] = arg4;
					arg2++;
					this.anIntArray569[arg2] = arg4;
					arg2++;
					this.anIntArray569[arg2] = arg4;
					arg2++;
					this.anIntArray569[arg2] = arg4;
					arg2++;
					this.anIntArray569[arg2] = arg4;
					arg2++;
					this.anIntArray569[arg2] = arg4;
					arg2++;
					this.anIntArray569[arg2] = arg4;
					arg2++;
					this.anIntArray569[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray569[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIILclient!de;II)V")
	@Override
	public void method5245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class46 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class46_Sub1 local2 = (Class46_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray403;
		@Pc(8) int[] local8 = local2.anIntArray402;
		@Pc(17) int local17 = this.anInt5850 > arg7 ? this.anInt5850 : arg7;
		@Pc(32) int local32 = this.anInt5833 < arg7 + local5.length ? this.anInt5833 : arg7 + local5.length;
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
					if (local129 >= this.anInt5847 && local129 < this.anInt5829 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray569[local129 + arg1 * this.anInt5838] = arg4;
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
					if (local133 >= this.anInt5847 && local133 < this.anInt5829 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt5838;
						local248 = this.anIntArray569[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray569[local133 + arg1 * this.anInt5838] = local201 + local584;
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
		if (arg0 < this.anInt5847) {
			arg1 += local83 * (this.anInt5847 - arg0);
			arg0 = this.anInt5847;
		}
		if (arg2 >= this.anInt5829) {
			arg2 = this.anInt5829 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray569[arg0 + local129 * this.anInt5838] = arg4;
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
					local243 = arg0 + local133 * this.anInt5838;
					local248 = this.anIntArray569[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray569[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[Lclient!bn;)V")
	@Override
	public void method5172(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub9[] arg1) {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(F)V")
	@Override
	public void method5223(@OriginalArg(0) float arg0) {
		this.anInt5840 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5235(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method5216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method5176(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.method5176(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt5847) {
					arg1 += local104 * (this.anInt5847 - arg0);
					arg0 = this.anInt5847;
				}
				if (arg2 >= this.anInt5829) {
					arg2 = this.anInt5829 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5850 && local150 < this.anInt5833) {
							this.anIntArray569[arg0 + local150 * this.anInt5838] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt5850 && local213 < this.anInt5833) {
							local228 = arg0 + local213 * this.anInt5838;
							local233 = this.anIntArray569[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray569[local228] = local204 + local233;
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
				if (arg1 < this.anInt5850) {
					arg0 += local104 * (this.anInt5850 - arg1);
					arg1 = this.anInt5850;
				}
				if (arg3 >= this.anInt5833) {
					arg3 = this.anInt5833 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt5847 && local150 < this.anInt5829) {
							this.anIntArray569[local150 + arg1 * this.anInt5838] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt5847 && local213 < this.anInt5829) {
							local228 = local213 + arg1 * this.anInt5838;
							local233 = this.anIntArray569[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray569[local213 + arg1 * this.anInt5838] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method5192(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.method5192(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!sq", name = "M", descriptor = "()V")
	private void method5271() {
		if (this.aFloat64 == 0.0F) {
			this.anInt5832 = this.anInt5827;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt5827;
		@Pc(12) float local12 = (float) this.anInt5853;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat63 / (this.aFloat64 + this.aFloat63);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat64;
		this.anInt5832 = (int) (((float) this.anInt5827 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "()Z")
	@Override
	public boolean method5158() {
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "()I")
	@Override
	public int method5213() {
		return this.anInt5827;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!ri;IIII)Lclient!ts;")
	@Override
	public Class112 method5201(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class112_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!sg;Lclient!sg;FLclient!sg;)Lclient!sg;")
	@Override
	public Class54 method5225(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class54 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!sg;)V")
	@Override
	public void method5179(@OriginalArg(0) Class54 arg0) {
	}

	@OriginalMember(owner = "client!sq", name = "C", descriptor = "()V")
	@Override
	public void method5220() {
	}

	@OriginalMember(owner = "client!sq", name = "A", descriptor = "()I")
	@Override
	public int method5217() {
		return this.anInt5853;
	}

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "()Z")
	@Override
	public boolean method5166() {
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5184() {
		@Pc(3) Class1 local3 = this.method5266(Thread.currentThread());
		@Pc(6) Class80 local6 = local3.aClass80_1;
		local6.aBoolean149 = false;
		local6.aBoolean149 = false;
		local6.anInt2018 = 0;
		local6.aBoolean146 = true;
		local6.method1895(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean149 = true;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIII)Z")
	@Override
	public boolean method5191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass66_Sub1_3.anInt1553 * arg0 + this.aClass66_Sub1_3.anInt1545 * arg1 + this.aClass66_Sub1_3.anInt1548 * arg2 >> 15) + this.aClass66_Sub1_3.anInt1552;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass66_Sub1_3.anInt1553 * arg3 + this.aClass66_Sub1_3.anInt1545 * arg4 + this.aClass66_Sub1_3.anInt1548 * arg5 >> 15) + this.aClass66_Sub1_3.anInt1552;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt5853 && local52 < this.anInt5853 || !(local23 <= this.anInt5827 || local52 <= this.anInt5827)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt5844 * ((this.aClass66_Sub1_3.anInt1549 * arg0 + this.aClass66_Sub1_3.anInt1546 * arg1 + this.aClass66_Sub1_3.anInt1551 * arg2 >> 15) + this.aClass66_Sub1_3.anInt1544) / local23;
		@Pc(133) int local133 = this.anInt5844 * ((this.aClass66_Sub1_3.anInt1549 * arg3 + this.aClass66_Sub1_3.anInt1546 * arg4 + this.aClass66_Sub1_3.anInt1551 * arg5 >> 15) + this.aClass66_Sub1_3.anInt1544) / local52;
		if (local104 < this.anInt5834 && local133 < this.anInt5834 || local104 > this.anInt5842 && local133 > this.anInt5842) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt5837 * ((this.aClass66_Sub1_3.anInt1554 * arg0 + this.aClass66_Sub1_3.anInt1547 * arg1 + this.aClass66_Sub1_3.anInt1550 * arg2 >> 15) + this.aClass66_Sub1_3.anInt1555) / local23;
			@Pc(209) int local209 = this.anInt5837 * ((this.aClass66_Sub1_3.anInt1554 * arg3 + this.aClass66_Sub1_3.anInt1547 * arg4 + this.aClass66_Sub1_3.anInt1550 * arg5 >> 15) + this.aClass66_Sub1_3.anInt1555) / local52;
			return (local180 >= this.anInt5857 || local209 >= this.anInt5857) && (local180 <= this.anInt5841 || local209 <= this.anInt5841);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!ci;[Lclient!jf;Z)Lclient!ok;")
	@Override
	public Class18 method5180(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class100[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt2902;
			local7[local11] = arg1[local11].anInt2901;
			if (arg1[local11].aByteArray37 != null) {
			}
		}
		return new Class18_Sub3(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "()Z")
	@Override
	public boolean method5188() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "()I")
	@Override
	public int method5207() {
		return 0;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
	@Override
	public void method5233(@OriginalArg(0) int arg0) {
		if (this.anInt5835 == arg0) {
			return;
		}
		this.anInt5835 = arg0;
		this.aClass1Array1 = new Class1[this.anInt5835];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5835; local14++) {
			this.aClass1Array1[local14] = new Class1(this);
		}
	}

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "()V")
	@Override
	public void method5171() {
		this.aClass3_1 = Static299.method6019(this.aCanvas5);
		this.anIntArray569 = this.aClass3_1.anIntArray69;
		this.anInt5838 = this.aClass3_1.anInt608;
		this.anInt5846 = this.aClass3_1.anInt605;
		for (@Pc(22) int local22 = 0; local22 < this.anInt5835; local22++) {
			this.aClass1Array1[local22].method5();
		}
		this.method5186();
	}

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "()V")
	@Override
	protected void method5197() {
		if (this.aBoolean482) {
			Static7.method122(false);
			this.aBoolean482 = false;
		}
		this.aCanvas5 = null;
		this.anInterface3_6 = null;
		this.aClass3_1 = null;
		this.aBoolean484 = true;
	}

	@OriginalMember(owner = "client!sq", name = "G", descriptor = "()F")
	@Override
	public float method5231() {
		return this.aFloat63;
	}
}
