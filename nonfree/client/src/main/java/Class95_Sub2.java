import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class95_Sub2 extends Class95 {

	@OriginalMember(owner = "client!jr", name = "B", descriptor = "Lclient!lea;")
	public Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!jr", name = "C", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!jr", name = "D", descriptor = "I")
	private int anInt4913;

	@OriginalMember(owner = "client!jr", name = "F", descriptor = "I")
	private int anInt4914;

	@OriginalMember(owner = "client!jr", name = "L", descriptor = "I")
	public int anInt4918;

	@OriginalMember(owner = "client!jr", name = "N", descriptor = "I")
	public int anInt4920;

	@OriginalMember(owner = "client!jr", name = "U", descriptor = "I")
	private int anInt4925;

	@OriginalMember(owner = "client!jr", name = "V", descriptor = "I")
	public int anInt4926;

	@OriginalMember(owner = "client!jr", name = "W", descriptor = "I")
	public int anInt4927;

	@OriginalMember(owner = "client!jr", name = "X", descriptor = "[Lclient!hn;")
	private Class150[] aClass150Array1;

	@OriginalMember(owner = "client!jr", name = "Y", descriptor = "I")
	private int anInt4928;

	@OriginalMember(owner = "client!jr", name = "Z", descriptor = "Lclient!bs;")
	private Class42 aClass42_1;

	@OriginalMember(owner = "client!jr", name = "db", descriptor = "I")
	private int anInt4931;

	@OriginalMember(owner = "client!jr", name = "eb", descriptor = "I")
	private int anInt4932;

	@OriginalMember(owner = "client!jr", name = "gb", descriptor = "I")
	public int anInt4934;

	@OriginalMember(owner = "client!jr", name = "hb", descriptor = "I")
	public int anInt4935;

	@OriginalMember(owner = "client!jr", name = "jb", descriptor = "I")
	public int anInt4937;

	@OriginalMember(owner = "client!jr", name = "mb", descriptor = "[F")
	public float[] aFloatArray30;

	@OriginalMember(owner = "client!jr", name = "nb", descriptor = "I")
	public int anInt4939;

	@OriginalMember(owner = "client!jr", name = "ob", descriptor = "I")
	public int anInt4940;

	@OriginalMember(owner = "client!jr", name = "qb", descriptor = "I")
	public int anInt4942;

	@OriginalMember(owner = "client!jr", name = "rb", descriptor = "[F")
	public float[] aFloatArray31;

	@OriginalMember(owner = "client!jr", name = "sb", descriptor = "[I")
	public int[] anIntArray280;

	@OriginalMember(owner = "client!jr", name = "tb", descriptor = "I")
	private int anInt4943;

	@OriginalMember(owner = "client!jr", name = "ub", descriptor = "I")
	public int anInt4944;

	@OriginalMember(owner = "client!jr", name = "wb", descriptor = "Lclient!hh;")
	private Class6 aClass6_16;

	@OriginalMember(owner = "client!jr", name = "E", descriptor = "Z")
	private boolean aBoolean325;

	@OriginalMember(owner = "client!jr", name = "G", descriptor = "Z")
	private boolean aBoolean326;

	@OriginalMember(owner = "client!jr", name = "A", descriptor = "Lclient!tca;")
	private Class333 aClass333_17;

	@OriginalMember(owner = "client!jr", name = "M", descriptor = "I")
	public int anInt4919;

	@OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
	public int anInt4921;

	@OriginalMember(owner = "client!jr", name = "P", descriptor = "I")
	public int anInt4922;

	@OriginalMember(owner = "client!jr", name = "ab", descriptor = "I")
	public int anInt4929;

	@OriginalMember(owner = "client!jr", name = "T", descriptor = "I")
	public int anInt4924;

	@OriginalMember(owner = "client!jr", name = "fb", descriptor = "I")
	private int anInt4933;

	@OriginalMember(owner = "client!jr", name = "ib", descriptor = "I")
	public int anInt4936;

	@OriginalMember(owner = "client!jr", name = "S", descriptor = "Z")
	private boolean aBoolean327;

	@OriginalMember(owner = "client!jr", name = "J", descriptor = "I")
	public int anInt4917;

	@OriginalMember(owner = "client!jr", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!jr", name = "kb", descriptor = "I")
	public int anInt4938;

	@OriginalMember(owner = "client!jr", name = "I", descriptor = "I")
	public int anInt4916;

	@OriginalMember(owner = "client!jr", name = "bb", descriptor = "I")
	public int anInt4930;

	@OriginalMember(owner = "client!jr", name = "R", descriptor = "I")
	public int anInt4923;

	@OriginalMember(owner = "client!jr", name = "pb", descriptor = "I")
	public int anInt4941;

	@OriginalMember(owner = "client!jr", name = "K", descriptor = "Lclient!qj;")
	private final Class295 aClass295_22;

	@OriginalMember(owner = "client!jr", name = "vb", descriptor = "I")
	private int anInt4945;

	@OriginalMember(owner = "client!jr", name = "cb", descriptor = "Lclient!qj;")
	private final Class295 aClass295_23;

	@OriginalMember(owner = "client!jr", name = "Q", descriptor = "Lclient!fn;")
	public Class17_Sub1 aClass17_Sub1_2;

	@OriginalMember(owner = "client!jr", name = "H", descriptor = "I")
	private int anInt4915;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!d;)V")
	private Class95_Sub2(@OriginalArg(0) Interface2 arg0) {
		super(arg0);
		this.aBoolean325 = false;
		this.aBoolean326 = false;
		this.aClass333_17 = new Class333(4);
		this.anInt4919 = 128;
		this.anInt4921 = 0;
		this.anInt4922 = 0;
		this.anInt4929 = 45823;
		this.anInt4924 = 78642;
		this.anInt4933 = 0;
		this.anInt4936 = 50;
		this.aBoolean327 = false;
		this.anInt4917 = 3500;
		this.lb = 0;
		this.anInt4938 = 512;
		this.anInt4916 = 512;
		this.anInt4930 = 0;
		this.anInt4923 = 0;
		this.anInt4941 = 75518;
		this.aClass295_22 = new Class295(16);
		this.anInt4945 = -1;
		try {
			this.aClass295_23 = new Class295(256);
			this.aClass17_Sub1_2 = new Class17_Sub1();
			this.method8029(1);
			this.method8035(0);
			Static253.method3817(true, true);
			this.aBoolean326 = true;
			this.anInt4915 = (int) Static15.method380();
		} catch (@Pc(99) Throwable local99) {
			local99.printStackTrace();
			this.method8007();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public Class95_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this(arg1);
		try {
			this.method8028(arg0, arg2, arg3);
			this.method8073(arg0);
		} catch (@Pc(12) Throwable local12) {
			local12.printStackTrace();
			this.method8007();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!jr", name = "x", descriptor = "()Z")
	@Override
	public boolean method8059() {
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!qca;IIII)V")
	private void method4267(@OriginalArg(0) Class34_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt10586;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method4274(arg1, arg2, arg3, arg4, arg0.anInt10581, 1);
			return;
		}
		if (this.anInt4945 != local2) {
			@Pc(33) Class6 local33 = (Class6) this.aClass295_22.method6470((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method4277(local2);
				if (local39 == null) {
					return;
				}
				@Pc(50) int local50 = this.method4282(local2) ? 64 : this.anInt4919;
				local33 = this.method7993(local39, local50, local50, local50);
				this.aClass295_22.method6469((long) local2, local33);
			}
			this.anInt4945 = local2;
			this.aClass6_16 = local33;
		}
		local8++;
		((Class6_Sub3) this.aClass6_16).method5142(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt10581, 1);
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)I")
	public int method4268(@OriginalArg(0) int arg0) {
		return super.anInterface2_12.method8330(arg0).aShort56 & 0xFFFF;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!hg;)V")
	@Override
	public void method8072(@OriginalArg(0) Interface10 arg0) {
		@Pc(2) Class42 local2 = (Class42) arg0;
		this.anInt4927 = local2.anInt1234;
		this.anInt4928 = local2.anInt1235;
		this.anIntArray280 = local2.anIntArray62;
		this.aClass42_1 = local2;
		this.anInt4931 = local2.anInt1234;
		this.anInt4932 = local2.anInt1235;
		this.aFloatArray30 = local2.aFloatArray7;
		this.method4275();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!cj;Lclient!cj;FLclient!cj;)Lclient!cj;")
	@Override
	public Class57 method8055(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class57 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!jr", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4942 = arg0;
		this.anInt4934 = arg1;
		this.anInt4938 = arg2;
		this.anInt4916 = arg3;
		this.method4276();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!al;)V")
	@Override
	public void method8037(@OriginalArg(0) Class17 arg0) {
		this.aClass17_Sub1_2 = (Class17_Sub1) arg0;
	}

	@OriginalMember(owner = "client!jr", name = "w", descriptor = "()V")
	@Override
	public void method8058() {
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!cj;)V")
	@Override
	public void method7989(@OriginalArg(0) Class57 arg0) {
	}

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "()Z")
	@Override
	public boolean method8003() {
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8048(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aCanvas4 == null || this.aClass3_Sub1_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas4.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x + arg2 <= this.anInt4927 && local21.y + arg3 <= this.anInt4928 && local21.x + arg2 + local21.width > 0 && local21.y + arg3 + local21.height > 0) {
					this.aClass3_Sub1_1.method6780(local21.height, local21.y + arg3, local21.x + arg2, local21.y, local14, local21.x, local21.width);
				}
			}
		} catch (@Pc(79) Exception local79) {
			this.aCanvas4.repaint();
		}
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "()Z")
	@Override
	public boolean method7999() {
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt4929 = (int) (arg1 * 65535.0F);
		this.anInt4924 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt4937 = (int) (arg3 * 65535.0F / local26);
		this.anInt4940 = (int) (arg4 * 65535.0F / local26);
		this.anInt4944 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!jr", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt4922 || arg1 >= this.anInt4930) {
			return;
		}
		if (arg0 < this.anInt4923) {
			arg2 -= this.anInt4923 - arg0;
			arg0 = this.anInt4923;
		}
		if (arg0 + arg2 > this.anInt4921) {
			arg2 = this.anInt4921 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt4927;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray280[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray280[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray280[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray280[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray280[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8073(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas4 = null;
			this.aClass3_Sub1_1 = null;
			if (this.aClass42_1 == null) {
				this.anIntArray280 = null;
				this.anInt4927 = this.anInt4928 = 1;
				this.anInt4931 = this.anInt4932 = 1;
				this.method4275();
			}
			return;
		}
		@Pc(10) Class3_Sub1 local10 = (Class3_Sub1) this.aClass333_17.method7489((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas4 = arg0;
		@Pc(18) Dimension local18 = arg0.getSize();
		this.anInt4914 = local18.width;
		this.anInt4913 = local18.height;
		this.aClass3_Sub1_1 = local10;
		if (this.aClass42_1 != null) {
			return;
		}
		this.anIntArray280 = local10.anIntArray439;
		this.anInt4927 = local10.anInt8242;
		this.anInt4928 = local10.anInt8241;
		if (this.anInt4927 != this.anInt4931 || this.anInt4928 != this.anInt4932) {
			this.anInt4925 = this.anInt4931 = this.anInt4927;
			this.anInt4943 = this.anInt4932 = this.anInt4928;
			this.aFloatArray31 = this.aFloatArray30 = new float[this.anInt4931 * this.anInt4932];
		}
		this.method4275();
		return;
	}

	@OriginalMember(owner = "client!jr", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class150 local3 = this.method4271(Thread.currentThread());
		local3.anInt4099 = arg0;
		local3.anInt4102 = arg1;
		local3.anInt4094 = arg2;
	}

	@OriginalMember(owner = "client!jr", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt4923 == 0 && this.anInt4921 == this.anInt4927 && this.anInt4922 == 0 && this.anInt4930 == this.anInt4928) {
			local19 = this.aFloatArray30.length;
			local25 = local19 - (local19 & 0x7);
			local27 = 0;
			while (local27 < local25) {
				this.aFloatArray30[local27++] = 2.14748365E9F;
				this.aFloatArray30[local27++] = 2.14748365E9F;
				this.aFloatArray30[local27++] = 2.14748365E9F;
				this.aFloatArray30[local27++] = 2.14748365E9F;
				this.aFloatArray30[local27++] = 2.14748365E9F;
				this.aFloatArray30[local27++] = 2.14748365E9F;
				this.aFloatArray30[local27++] = 2.14748365E9F;
				this.aFloatArray30[local27++] = 2.14748365E9F;
			}
			while (local27 < local19) {
				this.aFloatArray30[local27++] = 2.14748365E9F;
			}
			return;
		}
		local19 = this.anInt4921 - this.anInt4923;
		local25 = this.anInt4930 - this.anInt4922;
		local27 = this.anInt4927 - local19;
		@Pc(116) int local116 = this.anInt4923 + this.anInt4922 * this.anInt4927;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.aFloatArray30[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray30[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray30[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray30[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray30[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray30[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray30[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray30[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.aFloatArray30[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!eb;[Lclient!vf;Z)Lclient!da;")
	@Override
	public Class67 method8032(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class370[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt10491;
			local7[local11] = arg1[local11].anInt10490;
			if (arg1[local11].aByteArray97 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class67_Sub5(this, arg0, arg1, local3, local7);
		} else {
			return new Class67_Sub1(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!jr", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt4927 + arg0;
		@Pc(13) int local13 = arg1 * this.anInt4931 + arg0;
		if (local6 == 0 && local13 == 0) {
			return;
		}
		@Pc(21) int[] local21 = this.anIntArray280;
		@Pc(24) float[] local24 = this.aFloatArray30;
		@Pc(31) int local31;
		if (local6 < 0) {
			local31 = local21.length + local6;
			Static681.method4031(local21, -local6, local21, 0, local31);
		} else if (local6 > 0) {
			local31 = local21.length - local6;
			Static681.method4031(local21, 0, local21, local6, local31);
		}
		if (local13 < 0) {
			local31 = local24.length + local13;
			Static681.method4037(local24, -local13, local24, 0, local31);
		} else if (local13 > 0) {
			local31 = local24.length - local13;
			Static681.method4037(local24, 0, local24, local13, local31);
		}
	}

	@OriginalMember(owner = "client!jr", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return 0;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(II)I")
	@Override
	public int method8012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!jr", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jr", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt4917;
	}

	@OriginalMember(owner = "client!jr", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(26) float local26 = this.aClass17_Sub1_2.aFloat51 * (float) arg0 + this.aClass17_Sub1_2.aFloat47 * (float) arg1 + this.aClass17_Sub1_2.aFloat57 * (float) arg2 + this.aClass17_Sub1_2.aFloat49;
		if (local26 < 1.0F) {
			local26 = 1.0F;
		}
		@Pc(57) float local57 = this.aClass17_Sub1_2.aFloat51 * (float) arg3 + this.aClass17_Sub1_2.aFloat47 * (float) arg4 + this.aClass17_Sub1_2.aFloat57 * (float) arg5 + this.aClass17_Sub1_2.aFloat49;
		if (local57 < 1.0F) {
			local57 = 1.0F;
		}
		if (local26 < (float) this.anInt4936 && local57 < (float) this.anInt4936) {
			local1 |= 0x10;
		} else if (local26 > (float) this.anInt4917 && local57 > (float) this.anInt4917) {
			local1 |= 0x20;
		}
		@Pc(128) int local128 = (int) ((float) this.anInt4938 * (this.aClass17_Sub1_2.aFloat56 * (float) arg0 + this.aClass17_Sub1_2.aFloat48 * (float) arg1 + this.aClass17_Sub1_2.aFloat54 * (float) arg2 + this.aClass17_Sub1_2.aFloat55) / local26);
		@Pc(160) int local160 = (int) ((float) this.anInt4938 * (this.aClass17_Sub1_2.aFloat56 * (float) arg3 + this.aClass17_Sub1_2.aFloat48 * (float) arg4 + this.aClass17_Sub1_2.aFloat54 * (float) arg5 + this.aClass17_Sub1_2.aFloat55) / local57);
		if (local128 < this.anInt4935 && local160 < this.anInt4935) {
			local1 |= 0x1;
		} else if (local128 > this.anInt4926 && local160 > this.anInt4926) {
			local1 |= 0x2;
		}
		@Pc(217) int local217 = (int) ((float) this.anInt4916 * (this.aClass17_Sub1_2.aFloat46 * (float) arg0 + this.aClass17_Sub1_2.aFloat50 * (float) arg1 + this.aClass17_Sub1_2.aFloat52 * (float) arg2 + this.aClass17_Sub1_2.aFloat53) / local26);
		@Pc(249) int local249 = (int) ((float) this.anInt4916 * (this.aClass17_Sub1_2.aFloat46 * (float) arg3 + this.aClass17_Sub1_2.aFloat50 * (float) arg4 + this.aClass17_Sub1_2.aFloat52 * (float) arg5 + this.aClass17_Sub1_2.aFloat53) / local57);
		if (local217 < this.anInt4920 && local249 < this.anInt4920) {
			local1 |= 0x4;
		} else if (local217 > this.anInt4918 && local249 > this.anInt4918) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method4269(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7);
			} else {
				local28 = arg5 + arg6;
				local32 = arg7 % local28;
				local32 = local28 + arg5 - local32 - (-arg2 + 1) % local28;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				this.method4269(arg0 + arg2, arg1, 1 - arg2, arg4, arg5, arg6, arg7);
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
						if (arg0 >= this.anInt4923 && arg0 < this.anInt4921 && local267 >= this.anInt4922 && local267 < this.anInt4930 && arg7 < local143) {
							this.anIntArray280[arg0 + local267 * this.anInt4927] = arg4;
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
						if (arg0 >= this.anInt4923 && arg0 < this.anInt4921 && local349 >= this.anInt4922 && local349 < this.anInt4930 && arg7 < local143) {
							local375 = arg0 + local349 * this.anInt4927;
							local380 = this.anIntArray280[local375];
							local380 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray280[local375] = local340 + local380;
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
						if (arg1 >= this.anInt4922 && arg1 < this.anInt4930 && local267 >= this.anInt4923 && local267 < this.anInt4921 && arg7 < local143) {
							this.anIntArray280[local267 + arg1 * this.anInt4927] = arg4;
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
						if (arg1 >= this.anInt4922 && arg1 < this.anInt4930 && local349 >= this.anInt4923 && local349 < this.anInt4921 && arg7 < local143) {
							local375 = local349 + arg1 * this.anInt4927;
							local380 = this.anIntArray280[local375];
							@Pc(708) int local708 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray280[local349 + arg1 * this.anInt4927] = local340 + local708;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			}
		} else if (arg3 >= 0) {
			this.method4280(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7);
		} else {
			local28 = arg5 + arg6;
			local32 = arg7 % local28;
			local32 = local28 + arg5 - local32 - (-arg3 + 1) % local28;
			arg7 = local32 % local28;
			if (arg7 < 0) {
				arg7 += local28;
			}
			this.method4280(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "()Z")
	@Override
	public boolean method7996() {
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "u", descriptor = "()V")
	@Override
	public void method8042() {
		if (this.aCanvas4 == null) {
			this.anInt4927 = 1;
			this.anInt4928 = 1;
			this.anIntArray280 = null;
			this.anInt4931 = 1;
			this.anInt4932 = 1;
			this.aFloatArray30 = null;
		} else {
			this.anIntArray280 = this.aClass3_Sub1_1.anIntArray439;
			this.anInt4927 = this.aClass3_Sub1_1.anInt8242;
			this.anInt4928 = this.aClass3_Sub1_1.anInt8241;
			this.aFloatArray30 = this.aFloatArray31;
			this.anInt4931 = this.anInt4925;
			this.anInt4932 = this.anInt4943;
		}
		this.aClass42_1 = null;
		this.method4275();
	}

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)V")
	@Override
	public void method8056(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt4915;
		for (@Pc(9) Object local9 = this.aClass295_23.method6468(); local9 != null; local9 = this.aClass295_23.method6467()) {
			@Pc(13) Class3_Sub9 local13 = (Class3_Sub9) local9;
			if (local13.aBoolean99) {
				local13.anInt1409 += local4;
				@Pc(27) int local27 = local13.anInt1409 / 20;
				if (local27 > 0) {
					@Pc(36) Class250 local36 = super.anInterface2_12.method8330(local13.anInt1411);
					local13.method1242(local36.aByte95 * local4 * 50 / 1000, local36.aByte92 * local4 * 50 / 1000);
					local13.anInt1409 -= local27 * 20;
				}
				local13.aBoolean99 = false;
			}
		}
		this.anInt4915 = arg0;
		this.aClass295_22.method6462(5);
		this.aClass295_23.method6462(5);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIIII)V")
	private void method4269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < this.anInt4922 || arg1 >= this.anInt4930) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt4927;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg0 + local37 >= this.anInt4923 && arg0 + local37 < this.anInt4921 && local27 < arg4) {
					this.anIntArray280[local15 + local37] = arg3;
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
			if (arg0 + local103 >= this.anInt4923 && arg0 + local103 < this.anInt4921 && local27 < arg4) {
				@Pc(126) int local126 = this.anIntArray280[local15 + local103];
				@Pc(146) int local146 = ((local126 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local126 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray280[local15 + local103] = local97 + local146;
			}
			local103++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "()Z")
	@Override
	public boolean method8011() {
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "()Z")
	public boolean method4270() {
		return this.aBoolean325;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!hn;")
	public Class150 method4271(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4939; local1++) {
			if (this.aClass150Array1[local1].aRunnable2 == arg0) {
				return this.aClass150Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "(I)Z")
	public boolean method4272(@OriginalArg(0) int arg0) {
		return super.anInterface2_12.method8330(arg0).aBoolean469 || super.anInterface2_12.method8330(arg0).aBoolean463;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!tv;)V")
	@Override
	public void method8057(@OriginalArg(0) Class347 arg0) {
		@Pc(3) Class150 local3 = this.method4271(Thread.currentThread());
		@Pc(7) Class34_Sub3 local7 = arg0.aClass61_1.aClass34_Sub3_1;
		for (@Pc(10) Class34_Sub3 local10 = local7.aClass34_Sub3_10; local10 != local7; local10 = local10.aClass34_Sub3_10) {
			@Pc(14) Class34_Sub3_Sub2 local14 = (Class34_Sub3_Sub2) local10;
			@Pc(19) int local19 = local14.anInt10579 >> 12;
			@Pc(24) int local24 = local14.anInt10582 >> 12;
			@Pc(29) int local29 = local14.anInt10583 >> 12;
			@Pc(54) float local54 = this.aClass17_Sub1_2.aFloat49 + this.aClass17_Sub1_2.aFloat51 * (float) local19 + this.aClass17_Sub1_2.aFloat47 * (float) local24 + this.aClass17_Sub1_2.aFloat57 * (float) local29;
			if (!(local54 < (float) this.anInt4936) && !(local54 > (float) local3.anInt4095)) {
				@Pc(102) int local102 = this.anInt4942 + (int) ((float) this.anInt4938 * (this.aClass17_Sub1_2.aFloat55 + this.aClass17_Sub1_2.aFloat56 * (float) local19 + this.aClass17_Sub1_2.aFloat48 * (float) local24 + this.aClass17_Sub1_2.aFloat54 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt4934 + (int) ((float) this.anInt4916 * (this.aClass17_Sub1_2.aFloat53 + this.aClass17_Sub1_2.aFloat46 * (float) local19 + this.aClass17_Sub1_2.aFloat50 * (float) local24 + this.aClass17_Sub1_2.aFloat52 * (float) local29) / local54);
				if (local102 >= this.anInt4923 && local102 <= this.anInt4921 && local137 >= this.anInt4922 && local137 <= this.anInt4930) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method4267(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt10580 * this.anInt4938 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(24) float local24 = this.aClass17_Sub1_2.aFloat51 * (float) arg0 + this.aClass17_Sub1_2.aFloat47 * (float) arg1 + this.aClass17_Sub1_2.aFloat57 * (float) arg2 + this.aClass17_Sub1_2.aFloat49;
		@Pc(49) float local49 = this.aClass17_Sub1_2.aFloat51 * (float) arg3 + this.aClass17_Sub1_2.aFloat47 * (float) arg4 + this.aClass17_Sub1_2.aFloat57 * (float) arg5 + this.aClass17_Sub1_2.aFloat49;
		@Pc(51) int local51 = 0;
		if (local24 < (float) this.anInt4936 && local49 < (float) this.anInt4936) {
			local51 |= 0x10;
		} else if (local24 > (float) this.anInt4917 && local49 > (float) this.anInt4917) {
			local51 |= 0x20;
		}
		@Pc(117) int local117 = (int) ((float) this.anInt4938 * (this.aClass17_Sub1_2.aFloat56 * (float) arg0 + this.aClass17_Sub1_2.aFloat48 * (float) arg1 + this.aClass17_Sub1_2.aFloat54 * (float) arg2 + this.aClass17_Sub1_2.aFloat55) / (float) arg6);
		@Pc(150) int local150 = (int) ((float) this.anInt4938 * (this.aClass17_Sub1_2.aFloat56 * (float) arg3 + this.aClass17_Sub1_2.aFloat48 * (float) arg4 + this.aClass17_Sub1_2.aFloat54 * (float) arg5 + this.aClass17_Sub1_2.aFloat55) / (float) arg6);
		if (local117 < this.anInt4935 && local150 < this.anInt4935) {
			local51 |= 0x1;
		} else if (local117 > this.anInt4926 && local150 > this.anInt4926) {
			local51 |= 0x2;
		}
		@Pc(208) int local208 = (int) ((float) this.anInt4916 * (this.aClass17_Sub1_2.aFloat46 * (float) arg0 + this.aClass17_Sub1_2.aFloat50 * (float) arg1 + this.aClass17_Sub1_2.aFloat52 * (float) arg2 + this.aClass17_Sub1_2.aFloat53) / (float) arg6);
		@Pc(241) int local241 = (int) ((float) this.anInt4916 * (this.aClass17_Sub1_2.aFloat46 * (float) arg3 + this.aClass17_Sub1_2.aFloat50 * (float) arg4 + this.aClass17_Sub1_2.aFloat52 * (float) arg5 + this.aClass17_Sub1_2.aFloat53) / (float) arg6);
		if (local208 < this.anInt4920 && local241 < this.anInt4920) {
			local51 |= 0x4;
		} else if (local208 > this.anInt4918 && local241 > this.anInt4918) {
			local51 |= 0x8;
		}
		return local51;
	}

	@OriginalMember(owner = "client!jr", name = "m", descriptor = "()Z")
	@Override
	public boolean method8016() {
		return true;
	}

	@OriginalMember(owner = "client!jr", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt4927 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray280[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)V")
	@Override
	public void method8010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas4 == null || this.aClass3_Sub1_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas4.getGraphics();
			this.aClass3_Sub1_1.method6780(this.anInt4913, arg1, arg0, 0, local14, 0, this.anInt4914);
		} catch (@Pc(29) Exception local29) {
			this.aCanvas4.repaint();
		}
	}

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "()I")
	@Override
	public int method8026() {
		return 0;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V")
	@Override
	public void method8029(@OriginalArg(0) int arg0) {
		this.anInt4939 = arg0;
		this.aClass150Array1 = new Class150[this.anInt4939];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4939; local9++) {
			this.aClass150Array1[local9] = new Class150(this);
		}
	}

	@OriginalMember(owner = "client!jr", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass17_Sub1_2.aFloat49 + this.aClass17_Sub1_2.aFloat51 * (float) arg0 + this.aClass17_Sub1_2.aFloat47 * (float) arg1 + this.aClass17_Sub1_2.aFloat57 * (float) arg2;
		if (local24 < (float) this.anInt4936 || local24 > (float) this.anInt4917) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt4938 * (this.aClass17_Sub1_2.aFloat55 + this.aClass17_Sub1_2.aFloat56 * (float) arg0 + this.aClass17_Sub1_2.aFloat48 * (float) arg1 + this.aClass17_Sub1_2.aFloat54 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt4916 * (this.aClass17_Sub1_2.aFloat53 + this.aClass17_Sub1_2.aFloat46 * (float) arg0 + this.aClass17_Sub1_2.aFloat50 * (float) arg1 + this.aClass17_Sub1_2.aFloat52 * (float) arg2) / local24);
		if (local81 >= this.anInt4935 && local81 <= this.anInt4926 && local113 >= this.anInt4920 && local113 <= this.anInt4918) {
			arg3[0] = local81 - this.anInt4935;
			arg3[1] = local113 - this.anInt4920;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "(I)[I")
	public int[] method4273(@OriginalArg(0) int arg0) {
		@Pc(2) Class295 local2 = this.aClass295_23;
		@Pc(12) Class3_Sub9 local12;
		synchronized (this.aClass295_23) {
			local12 = (Class3_Sub9) this.aClass295_23.method6470((long) arg0);
			if (local12 == null) {
				if (!super.anInterface2_12.method8328(arg0)) {
					return null;
				}
				@Pc(32) Class250 local32 = super.anInterface2_12.method8330(arg0);
				@Pc(43) int local43 = local32.aBoolean462 || this.aBoolean327 ? 64 : this.anInt4919;
				local12 = new Class3_Sub9(arg0, local43, super.anInterface2_12.method8329(local43, local43, true, arg0, 0.7F), local32.anInt6666 != 1);
				this.aClass295_23.method6469((long) arg0, local12);
			}
		}
		local12.aBoolean99 = true;
		return local12.method1243();
	}

	@OriginalMember(owner = "client!jr", name = "t", descriptor = "()V")
	@Override
	public void method8039() {
	}

	@OriginalMember(owner = "client!jr", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg1;
		@Pc(5) int[] local5 = local2.anIntArray581;
		@Pc(8) int[] local8 = local2.anIntArray582;
		@Pc(20) int local20;
		if (this.anInt4930 < arg3 + local5.length) {
			local20 = this.anInt4930 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt4922 > arg3) {
			local33 = this.anInt4922 - arg3;
			arg3 = this.anInt4922;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt4927;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt4923 > local58) {
				local62 -= this.anInt4923 - local58;
				local58 = this.anInt4923;
			}
			if (this.anInt4921 < local58 + local62) {
				local62 = this.anInt4921 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray280[local58++] = arg0;
			}
			local49 += this.anInt4927;
		}
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "()Z")
	@Override
	public boolean method8002() {
		return true;
	}

	@OriginalMember(owner = "client!jr", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt4927;
		@Pc(35) int local35 = this.anInt4927 - arg2;
		if (arg1 + arg3 > this.anInt4930) {
			arg3 -= arg1 + arg3 - this.anInt4930;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt4922) {
			local59 = this.anInt4922 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt4927;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt4921) {
			local59 = arg0 + arg2 - this.anInt4921;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt4923) {
			local59 = this.anInt4923 - arg0;
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
						this.anIntArray280[local30++] = arg4;
					} else {
						this.anIntArray280[local30++] = arg5;
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
					local245 = this.anIntArray280[local30];
					this.anIntArray280[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray280[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray280[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!jr", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt4927) {
			arg2 = this.anInt4927;
		}
		if (arg3 > this.anInt4928) {
			arg3 = this.anInt4928;
		}
		this.anInt4923 = arg0;
		this.anInt4921 = arg2;
		this.anInt4922 = arg1;
		this.anInt4930 = arg3;
		this.method4276();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)Lclient!za;")
	@Override
	public Class3_Sub51 method8015(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!vf;Z)Lclient!hh;")
	@Override
	public Class6 method8008(@OriginalArg(0) Class370 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray556;
		@Pc(5) byte[] local5 = arg0.aByteArray96;
		@Pc(8) int local8 = arg0.anInt10491;
		@Pc(11) int local11 = arg0.anInt10490;
		@Pc(76) Class6_Sub3 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray97 == null) {
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
			local76 = new Class6_Sub3_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray97;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class6_Sub3_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class6_Sub3_Sub3(this, local20, local8, local11);
			}
		}
		local76.method5123(arg0.anInt10493, arg0.anInt10494, arg0.anInt10492, arg0.anInt10495);
		return local76;
	}

	@OriginalMember(owner = "client!jr", name = "s", descriptor = "()Z")
	@Override
	public boolean method8038() {
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(IIIIII)V")
	private void method4274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg1 - arg3;
		if (local8 < this.anInt4922) {
			local8 = this.anInt4922;
		}
		@Pc(21) int local21 = arg1 + arg3 + 1;
		if (local21 > this.anInt4930) {
			local21 = this.anInt4930;
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
				if (local91 < this.anInt4923) {
					local91 = this.anInt4923;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt4921) {
					local102 = this.anInt4921;
				}
				local116 = local91 + local30 * this.anInt4927;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray30[local116]) {
						this.anIntArray280[local116] = arg4;
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
				if (local91 < this.anInt4923) {
					local91 = this.anInt4923;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt4921 - 1) {
					local102 = this.anInt4921 - 1;
				}
				local116 = local91 + local30 * this.anInt4927;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray30[local116]) {
						this.anIntArray280[local116] = arg4;
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
				if (local102 < this.anInt4923) {
					local102 = this.anInt4923;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt4921) {
					local116 = this.anInt4921;
				}
				local118 = local102 + local30 * this.anInt4927;
				for (local350 = local102; local350 < local116; local350++) {
					if ((float) arg2 < this.aFloatArray30[local118]) {
						local364 = this.anIntArray280[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray280[local118] = local293 + local364;
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
				if (local102 < this.anInt4923) {
					local102 = this.anInt4923;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt4921 - 1) {
					local116 = this.anInt4921 - 1;
				}
				local118 = local102 + local30 * this.anInt4927;
				for (local350 = local102; local350 <= local116; local350++) {
					if ((float) arg2 < this.aFloatArray30[local118]) {
						local364 = this.anIntArray280[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray280[local118] = local293 + local364;
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
				if (local91 < this.anInt4923) {
					local91 = this.anInt4923;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt4921) {
					local102 = this.anInt4921;
				}
				local116 = local91 + local30 * this.anInt4927;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray30[local116]) {
						local350 = this.anIntArray280[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(643) int local643 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray280[local116] = local364 - local643 | local643 - (local643 >>> 8);
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
				if (local91 < this.anInt4923) {
					local91 = this.anInt4923;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt4921 - 1) {
					local102 = this.anInt4921 - 1;
				}
				local116 = local91 + local30 * this.anInt4927;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray30[local116]) {
						local350 = this.anIntArray280[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray280[local116] = local364 - local350 | local350 - (local350 >>> 8);
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

	@OriginalMember(owner = "client!jr", name = "q", descriptor = "()V")
	@Override
	public void method8027() {
		this.aClass295_23.method6464();
		this.aClass295_22.method6464();
	}

	@OriginalMember(owner = "client!jr", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.aa(0, 0, this.anInt4927, this.anInt4928, arg0, 0);
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method8062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!jr", name = "B", descriptor = "()V")
	private void method4275() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4939; local1++) {
			this.aClass150Array1[local1].method3490();
		}
		this.la();
	}

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "(I)V")
	@Override
	public void method8060(@OriginalArg(0) int arg0) {
		this.aClass150Array1[arg0].method3492((Runnable) null);
	}

	@OriginalMember(owner = "client!jr", name = "y", descriptor = "()Z")
	@Override
	public boolean method8061() {
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)V")
	@Override
	public void method8053(@OriginalArg(0) int arg0) {
		this.anInt4919 = arg0;
		this.aClass295_23.method6464();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIF)Lclient!uaa;")
	@Override
	public Class3_Sub13 method8070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg5;
		@Pc(5) int[] local5 = local2.anIntArray581;
		@Pc(8) int[] local8 = local2.anIntArray582;
		@Pc(17) int local17 = this.anInt4922 > arg7 ? this.anInt4922 : arg7;
		@Pc(32) int local32 = this.anInt4930 < arg7 + local5.length ? this.anInt4930 : arg7 + local5.length;
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
					if (local129 >= this.anInt4923 && local129 < this.anInt4921 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray280[local129 + arg1 * this.anInt4927] = arg4;
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
					if (local133 >= this.anInt4923 && local133 < this.anInt4921 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt4927;
						local248 = this.anIntArray280[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray280[local133 + arg1 * this.anInt4927] = local201 + local584;
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
		if (arg0 < this.anInt4923) {
			arg1 += local83 * (this.anInt4923 - arg0);
			arg0 = this.anInt4923;
		}
		if (arg2 >= this.anInt4921) {
			arg2 = this.anInt4921 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray280[arg0 + local129 * this.anInt4927] = arg4;
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
					local243 = arg0 + local133 * this.anInt4927;
					local248 = this.anIntArray280[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray280[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "()Lclient!al;")
	@Override
	public Class17 method7992() {
		return this.aClass17_Sub1_2;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8065(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas4 == arg0) {
			this.method8073((Canvas) null);
		}
		@Pc(15) Class3_Sub1 local15 = (Class3_Sub1) this.aClass333_17.method7489((long) arg0.hashCode());
		if (local15 != null) {
			local15.method9034();
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8006() {
		@Pc(3) Class150 local3 = this.method4271(Thread.currentThread());
		@Pc(6) Class126 local6 = local3.aClass126_1;
		local6.aBoolean255 = false;
		@Pc(14) int local14 = 5 - this.anInt4935;
		@Pc(19) int local19 = 75 - this.anInt4935;
		@Pc(24) int local24 = 15 - this.anInt4935;
		@Pc(29) int local29 = 10 - this.anInt4920;
		@Pc(34) int local34 = 50 - this.anInt4920;
		@Pc(39) int local39 = 90 - this.anInt4920;
		local6.aBoolean253 = local14 < 0 || local14 > local6.anInt3463 || local19 < 0 || local19 > local6.anInt3463 || local24 < 0 || local24 > local6.anInt3463;
		local6.anInt3460 = 0;
		local6.aBoolean251 = false;
		local6.method2962((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		local6.aBoolean255 = true;
	}

	@OriginalMember(owner = "client!jr", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt4922) {
			local8 = this.anInt4922;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt4930) {
			local21 = this.anInt4930;
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
				if (local91 < this.anInt4923) {
					local91 = this.anInt4923;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt4921) {
					local102 = this.anInt4921;
				}
				local116 = local91 + local30 * this.anInt4927;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray280[local116++] = arg3;
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
				if (local91 < this.anInt4923) {
					local91 = this.anInt4923;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt4921 - 1) {
					local102 = this.anInt4921 - 1;
				}
				local116 = local91 + local30 * this.anInt4927;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray280[local116++] = arg3;
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
			if (local102 < this.anInt4923) {
				local102 = this.anInt4923;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt4921) {
				local116 = this.anInt4921;
			}
			local118 = local102 + local30 * this.anInt4927;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray280[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray280[local118++] = local277 + local360;
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
			if (local102 < this.anInt4923) {
				local102 = this.anInt4923;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt4921 - 1) {
				local116 = this.anInt4921 - 1;
			}
			local118 = local102 + local30 * this.anInt4927;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray280[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray280[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!jr", name = "C", descriptor = "()V")
	private void method4276() {
		this.anInt4935 = this.anInt4923 - this.anInt4942;
		this.anInt4926 = this.anInt4921 - this.anInt4942;
		this.anInt4920 = this.anInt4922 - this.anInt4934;
		this.anInt4918 = this.anInt4930 - this.anInt4934;
		for (@Pc(29) int local29 = 0; local29 < this.anInt4939; local29++) {
			@Pc(36) Class126 local36 = this.aClass150Array1[local29].aClass126_1;
			local36.anInt3459 = this.anInt4942 - this.anInt4923;
			local36.anInt3458 = this.anInt4934 - this.anInt4922;
			local36.anInt3463 = this.anInt4921 - this.anInt4923;
			local36.anInt3462 = this.anInt4930 - this.anInt4922;
		}
		@Pc(78) int local78 = this.anInt4922 * this.anInt4927 + this.anInt4923;
		for (@Pc(81) int local81 = this.anInt4922; local81 < this.anInt4930; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt4939; local84++) {
				this.aClass150Array1[local84].aClass126_1.anIntArray179[local81 - this.anInt4922] = local78;
			}
			local78 += this.anInt4927;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class150 local3 = this.method4271(Thread.currentThread());
		@Pc(6) Class126 local6 = local3.aClass126_1;
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
		@Pc(105) int local105 = arg0 - local6.method2958();
		@Pc(110) int local110 = arg1 - local6.method2961();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt3460 = 0;
		this.C(false);
		local6.aBoolean253 = local114 < 0 || local114 > local6.anInt3463 || local118 < 0 || local118 > local6.anInt3463 || local124 < 0 || local124 > local6.anInt3463;
		local6.method2952((float) local134, (float) local138, (float) local144, (float) local114, (float) local118, (float) local124, 100.0F, 100.0F, 100.0F, arg4);
		local6.aBoolean253 = local114 < 0 || local114 > local6.anInt3463 || local124 < 0 || local124 > local6.anInt3463 || local130 < 0 || local130 > local6.anInt3463;
		local6.method2952((float) local134, (float) local144, (float) local150, (float) local114, (float) local124, (float) local130, 100.0F, 100.0F, 100.0F, arg4);
		this.C(true);
	}

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt4936;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "()Z")
	@Override
	public boolean method7995() {
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "r", descriptor = "()Z")
	@Override
	public boolean method8033() {
		return true;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class1_Sub3(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class35 method8044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class35_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class150 local3 = this.method4271(Thread.currentThread());
		this.anInt4936 = arg0;
		this.anInt4917 = arg1;
		local3.anInt4095 = this.anInt4917 - 255;
	}

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "(I)[I")
	public int[] method4277(@OriginalArg(0) int arg0) {
		@Pc(2) Class295 local2 = this.aClass295_23;
		@Pc(14) Class3_Sub9 local14;
		synchronized (this.aClass295_23) {
			local14 = (Class3_Sub9) this.aClass295_23.method6470((long) arg0 | Long.MIN_VALUE);
			if (local14 == null) {
				if (!super.anInterface2_12.method8328(arg0)) {
					return null;
				}
				@Pc(34) Class250 local34 = super.anInterface2_12.method8330(arg0);
				@Pc(45) int local45 = local34.aBoolean462 || this.aBoolean327 ? 64 : this.anInt4919;
				local14 = new Class3_Sub9(arg0, local45, super.anInterface2_12.method8327(0.7F, local45, arg0, local45), local34.anInt6666 != 1);
				this.aClass295_23.method6469((long) arg0 | Long.MIN_VALUE, local14);
			}
		}
		local14.aBoolean99 = true;
		return local14.method1243();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method4278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface2_12.method8330(arg6).aBoolean466) {
			this.method4274(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt4945 != arg6) {
			@Pc(26) Class6 local26 = (Class6) this.aClass295_22.method6470((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method4277(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(44) int local44 = this.method4282(arg6) ? 64 : this.anInt4919;
				local26 = this.method7993(local32, local44, local44, local44);
				this.aClass295_22.method6469((long) arg6, local26);
			}
			this.anInt4945 = arg6;
			this.aClass6_16 = local26;
		}
		((Class6_Sub3) this.aClass6_16).method5142(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8067(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub1 local8 = (Class3_Sub1) this.aClass333_17.method7489((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method9034();
		local8 = Static165.method2617(arg2, arg1, arg0);
		this.aClass333_17.method7488((long) arg0.hashCode(), local8);
		if (this.aCanvas4 != arg0 || this.aClass42_1 != null) {
			return;
		}
		@Pc(37) Dimension local37 = arg0.getSize();
		this.anInt4914 = local37.width;
		this.anInt4913 = local37.height;
		this.aClass3_Sub1_1 = local8;
		this.anIntArray280 = local8.anIntArray439;
		this.anInt4927 = local8.anInt8242;
		this.anInt4928 = local8.anInt8241;
		if (this.anInt4927 != this.anInt4931 || this.anInt4928 != this.anInt4932) {
			this.anInt4925 = this.anInt4931 = this.anInt4927;
			this.anInt4943 = this.anInt4932 = this.anInt4928;
			this.aFloatArray31 = this.aFloatArray30 = new float[this.anInt4931 * this.anInt4932];
		}
		this.method4275();
	}

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "(I)Z")
	public boolean method4279(@OriginalArg(0) int arg0) {
		return super.anInterface2_12.method8328(arg0);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8028(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub1 local8 = (Class3_Sub1) this.aClass333_17.method7489((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static165.method2617(arg2, arg1, arg0);
			this.aClass333_17.method7488((long) arg0.hashCode(), local8);
		} else if (local8.anInt8242 != arg1 || local8.anInt8241 != arg2) {
			this.method8067(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!jr", name = "z", descriptor = "()Lclient!al;")
	@Override
	public Class17 method8063() {
		return new Class17_Sub1();
	}

	@OriginalMember(owner = "client!jr", name = "A", descriptor = "()Lclient!dca;")
	@Override
	public Class72 method8064() {
		return new Class72(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!gl;IIII)Lclient!ka;")
	@Override
	public Class149 method8021(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class149_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt4923) {
					arg1 += local104 * (this.anInt4923 - arg0);
					arg0 = this.anInt4923;
				}
				if (arg2 >= this.anInt4921) {
					arg2 = this.anInt4921 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt4922 && local150 < this.anInt4930) {
							this.anIntArray280[arg0 + local150 * this.anInt4927] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt4922 && local213 < this.anInt4930) {
							local228 = arg0 + local213 * this.anInt4927;
							local233 = this.anIntArray280[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray280[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt4922 && local150 < this.anInt4930) {
							local213 = arg0 + local150 * this.anInt4927;
							local228 = this.anIntArray280[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray280[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt4922) {
					arg0 += local104 * (this.anInt4922 - arg1);
					arg1 = this.anInt4922;
				}
				if (arg3 >= this.anInt4930) {
					arg3 = this.anInt4930 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt4923 && local150 < this.anInt4921) {
							this.anIntArray280[local150 + arg1 * this.anInt4927] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt4923 && local213 < this.anInt4921) {
							local228 = local213 + arg1 * this.anInt4927;
							local233 = this.anIntArray280[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray280[local213 + arg1 * this.anInt4927] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt4923 && local150 < this.anInt4921) {
							local213 = local150 + arg1 * this.anInt4927;
							local228 = this.anIntArray280[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray280[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(Z)V")
	@Override
	public void method8022(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg5;
		@Pc(5) int[] local5 = local2.anIntArray581;
		@Pc(8) int[] local8 = local2.anIntArray582;
		@Pc(17) int local17 = this.anInt4922 > arg7 ? this.anInt4922 : arg7;
		@Pc(32) int local32 = this.anInt4930 < arg7 + local5.length ? this.anInt4930 : arg7 + local5.length;
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
					if (arg1 >= local17 && arg1 < local32 && local172 >= this.anInt4923 && local172 < this.anInt4921 && arg10 < local40 && local172 >= arg6 + local5[local176] && local172 < arg6 + local5[local176] + local8[local176]) {
						this.anIntArray280[local172 + arg1 * this.anInt4927] = arg4;
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
					if (arg1 >= local17 && arg1 < local32 && local176 >= this.anInt4923 && local176 < this.anInt4921 && arg10 < local40 && local176 >= arg6 + local5[local199] && local176 < arg6 + local5[local199] + local8[local199]) {
						local299 = local176 + arg1 * this.anInt4927;
						local316 = this.anIntArray280[local299];
						@Pc(707) int local707 = ((local316 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local316 & 0xFF00) * local172 >> 8 & 0xFF00);
						this.anIntArray280[local176 + arg1 * this.anInt4927] = local263 + local707;
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
				if (arg0 >= this.anInt4923 && arg0 < this.anInt4921 && local172 >= local17 && local172 < local32 && arg10 < local40) {
					local199 = arg6 + local5[local176];
					if (arg0 >= local199 && arg0 < local199 + local8[local176]) {
						this.anIntArray280[arg0 + local172 * this.anInt4927] = arg4;
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
			if (arg0 >= this.anInt4923 && arg0 < this.anInt4921 && local176 >= local17 && local176 < local32 && arg10 < local40) {
				local299 = arg6 + local5[local199];
				if (arg0 >= local299 && arg0 < local299 + local8[local199]) {
					local316 = arg0 + local176 * this.anInt4927;
					@Pc(321) int local321 = this.anIntArray280[local316];
					@Pc(341) int local341 = ((local321 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local321 & 0xFF00) * local172 >> 8 & 0xFF00);
					this.anIntArray280[local316] = local263 + local341;
				}
			}
			arg1 += local77;
			arg0++;
			local36 = arg10 + local159;
			arg10 = local36 % local48;
		}
	}

	@OriginalMember(owner = "client!jr", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass150Array1.length; local1++) {
			@Pc(7) Class150 local7 = this.aClass150Array1[local1];
			local7.anInt4102 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt4102 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt4102 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt4102 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt4102 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean275 = false;
			} else {
				local7.aBoolean275 = true;
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!tv;I)V")
	@Override
	public void method8051(@OriginalArg(0) Class347 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class150 local3 = this.method4271(Thread.currentThread());
		@Pc(7) Class34_Sub3 local7 = arg0.aClass61_1.aClass34_Sub3_1;
		for (@Pc(10) Class34_Sub3 local10 = local7.aClass34_Sub3_10; local10 != local7; local10 = local10.aClass34_Sub3_10) {
			@Pc(14) Class34_Sub3_Sub2 local14 = (Class34_Sub3_Sub2) local10;
			@Pc(19) int local19 = local14.anInt10579 >> 12;
			@Pc(24) int local24 = local14.anInt10582 >> 12;
			@Pc(29) int local29 = local14.anInt10583 >> 12;
			@Pc(54) float local54 = this.aClass17_Sub1_2.aFloat49 + this.aClass17_Sub1_2.aFloat51 * (float) local19 + this.aClass17_Sub1_2.aFloat47 * (float) local24 + this.aClass17_Sub1_2.aFloat57 * (float) local29;
			if (!(local54 < (float) this.anInt4936) && !(local54 > (float) local3.anInt4095)) {
				@Pc(103) int local103 = this.anInt4942 + (int) ((float) this.anInt4938 * (this.aClass17_Sub1_2.aFloat55 + this.aClass17_Sub1_2.aFloat56 * (float) local19 + this.aClass17_Sub1_2.aFloat48 * (float) local24 + this.aClass17_Sub1_2.aFloat54 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt4934 + (int) ((float) this.anInt4916 * (this.aClass17_Sub1_2.aFloat53 + this.aClass17_Sub1_2.aFloat46 * (float) local19 + this.aClass17_Sub1_2.aFloat50 * (float) local24 + this.aClass17_Sub1_2.aFloat52 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt4923 && local103 <= this.anInt4921 && local139 >= this.anInt4922 && local139 <= this.anInt4930) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method4267(local14, local103, local139, (int) local54, (local14.anInt10580 * this.anInt4938 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass150Array1.length; local1++) {
			this.aClass150Array1[local1].anInt4100 = this.aClass150Array1[local1].anInt4102;
			this.aClass150Array1[local1].anInt4099 = arg0;
			this.aClass150Array1[local1].anInt4102 = arg1;
			this.aClass150Array1[local1].anInt4094 = arg2;
			this.aClass150Array1[local1].aBoolean276 = true;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!io;Lclient!rr;)Lclient!hg;")
	@Override
	public Interface10 method8004(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Interface23 arg1) {
		return new Class42(this, (Class6) arg0, (Class215) arg1);
	}

	@OriginalMember(owner = "client!jr", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(24) float local24 = this.aClass17_Sub1_2.aFloat49 + this.aClass17_Sub1_2.aFloat51 * (float) arg0 + this.aClass17_Sub1_2.aFloat47 * (float) arg1 + this.aClass17_Sub1_2.aFloat57 * (float) arg2;
		if (local24 < (float) this.anInt4936 || local24 > (float) this.anInt4917) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(82) int local82 = (int) ((float) this.anInt4938 * (this.aClass17_Sub1_2.aFloat55 + this.aClass17_Sub1_2.aFloat56 * (float) arg0 + this.aClass17_Sub1_2.aFloat48 * (float) arg1 + this.aClass17_Sub1_2.aFloat54 * (float) arg2) / (float) arg3);
		@Pc(115) int local115 = (int) ((float) this.anInt4916 * (this.aClass17_Sub1_2.aFloat53 + this.aClass17_Sub1_2.aFloat46 * (float) arg0 + this.aClass17_Sub1_2.aFloat50 * (float) arg1 + this.aClass17_Sub1_2.aFloat52 * (float) arg2) / (float) arg3);
		if (local82 >= this.anInt4935 && local82 <= this.anInt4926 && local115 >= this.anInt4920 && local115 <= this.anInt4918) {
			arg4[0] = local82 - this.anInt4935;
			arg4[1] = local115 - this.anInt4920;
			arg4[2] = (int) local24;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)V")
	@Override
	public void method8035(@OriginalArg(0) int arg0) {
		this.aClass150Array1[arg0].method3492(Thread.currentThread());
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "()Z")
	@Override
	public boolean method8001() {
		return true;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(IIIIII)Lclient!cj;")
	@Override
	public Class57 method8043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "()V")
	@Override
	public void method8019() {
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)V")
	@Override
	public void method8009(@OriginalArg(0) boolean arg0) {
		this.aBoolean327 = arg0;
		this.aClass295_23.method6464();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "([I)V")
	@Override
	public void method7994(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4927;
		arg0[1] = this.anInt4928;
	}

	@OriginalMember(owner = "client!jr", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		this.anInt4941 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(II)Lclient!io;")
	@Override
	public Interface12 method8030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method8025(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIZ)Lclient!hh;")
	@Override
	public Class6 method7998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt4927 + arg0;
		@Pc(16) int local16 = this.anInt4927 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray280[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class6_Sub3_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class6_Sub3_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!jr", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt4923 = 0;
		this.anInt4922 = 0;
		this.anInt4921 = this.anInt4927;
		this.anInt4930 = this.anInt4928;
		this.method4276();
	}

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "()Lclient!al;")
	@Override
	public Class17 method8013() {
		@Pc(3) Class150 local3 = this.method4271(Thread.currentThread());
		return local3.aClass17_Sub1_1;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(IIIIIIII)V")
	private void method4280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < this.anInt4923 || arg0 >= this.anInt4921) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt4927;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg1 + local37 >= this.anInt4922 && arg1 + local37 < this.anInt4930 && local27 < arg4) {
					this.anIntArray280[local15 + local37 * this.anInt4927] = arg3;
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
			if (arg1 + local106 >= this.anInt4922 && arg1 + local106 < this.anInt4930 && local27 < arg4) {
				@Pc(129) int local129 = local15 + local106 * this.anInt4927;
				@Pc(134) int local134 = this.anIntArray280[local129];
				@Pc(154) int local154 = ((local134 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local134 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray280[local129] = local100 + local154;
			}
			local106++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!jr", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(2) int local2 = this.anInt4933;
		this.anInt4933 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!jr", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass150Array1.length; local1++) {
			this.aClass150Array1[local1].anInt4102 = this.aClass150Array1[local1].anInt4100;
			this.aClass150Array1[local1].aBoolean276 = false;
		}
	}

	@OriginalMember(owner = "client!jr", name = "v", descriptor = "()V")
	@Override
	public void method8052() {
	}

	@OriginalMember(owner = "client!jr", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class150 local3 = this.method4271(Thread.currentThread());
		local3.aBoolean277 = arg0;
	}

	@OriginalMember(owner = "client!jr", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4923 < arg0) {
			this.anInt4923 = arg0;
		}
		if (this.anInt4922 < arg1) {
			this.anInt4922 = arg1;
		}
		if (this.anInt4921 > arg2) {
			this.anInt4921 = arg2;
		}
		if (this.anInt4930 > arg3) {
			this.anInt4930 = arg3;
		}
		this.method4276();
	}

	@OriginalMember(owner = "client!jr", name = "m", descriptor = "(I)I")
	public int method4281(@OriginalArg(0) int arg0) {
		return super.anInterface2_12.method8330(arg0).anInt6666;
	}

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "()V")
	@Override
	protected void method8014() {
		if (this.aBoolean326) {
			Static84.method1335(true, false);
			this.aBoolean326 = false;
		}
		this.aClass3_Sub1_1 = null;
		this.aCanvas4 = null;
		this.anInt4914 = 0;
		this.anInt4913 = 0;
		this.aClass333_17 = null;
		this.aBoolean325 = true;
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "(II)I")
	@Override
	public int method8047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!jr", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4923;
		arg0[1] = this.anInt4922;
		arg0[2] = this.anInt4921;
		arg0[3] = this.anInt4930;
	}

	@OriginalMember(owner = "client!jr", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt4923 || arg0 >= this.anInt4921) {
			return;
		}
		if (arg1 < this.anInt4922) {
			arg2 -= this.anInt4922 - arg1;
			arg1 = this.anInt4922;
		}
		if (arg1 + arg2 > this.anInt4930) {
			arg2 = this.anInt4930 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt4927;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray280[local40 + local54 * this.anInt4927] = arg3;
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
				local111 = local40 + local103 * this.anInt4927;
				local116 = this.anIntArray280[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray280[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt4927;
				local111 = this.anIntArray280[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray280[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jr", name = "n", descriptor = "()Z")
	@Override
	public boolean method8017() {
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)Lclient!rr;")
	@Override
	public Interface23 method7987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class215(arg0, arg1);
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
		@Pc(4) int local4 = this.anInt4931 - arg2;
		@Pc(11) int local11 = arg1 * this.anInt4931 + arg0;
		@Pc(14) float[] local14 = this.aFloatArray30;
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

	@OriginalMember(owner = "client!jr", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass17_Sub1_2.aFloat49 + this.aClass17_Sub1_2.aFloat51 * (float) arg0 + this.aClass17_Sub1_2.aFloat47 * (float) arg1 + this.aClass17_Sub1_2.aFloat57 * (float) arg2;
		if (local24 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = (int) ((float) this.anInt4938 * (this.aClass17_Sub1_2.aFloat55 + this.aClass17_Sub1_2.aFloat56 * (float) arg0 + this.aClass17_Sub1_2.aFloat48 * (float) arg1 + this.aClass17_Sub1_2.aFloat54 * (float) arg2) / local24);
		@Pc(105) int local105 = (int) ((float) this.anInt4916 * (this.aClass17_Sub1_2.aFloat53 + this.aClass17_Sub1_2.aFloat46 * (float) arg0 + this.aClass17_Sub1_2.aFloat50 * (float) arg1 + this.aClass17_Sub1_2.aFloat52 * (float) arg2) / local24);
		arg3[0] = local73 - this.anInt4935;
		arg3[1] = local105 - this.anInt4920;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!jr", name = "n", descriptor = "(I)Z")
	public boolean method4282(@OriginalArg(0) int arg0) {
		return this.aBoolean327 || super.anInterface2_12.method8330(arg0).aBoolean462;
	}

	@OriginalMember(owner = "client!jr", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt4942, this.anInt4934, this.anInt4938, this.anInt4916 };
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I[Lclient!uaa;)V")
	@Override
	public void method8018(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub13[] arg1) {
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	@Override
	public void method7991() {
		Static664.anInt10797 = 10000;
		Static664.anInt10789 = 10000;
		if (this.anInt4939 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method8029(this.anInt4939);
		this.method8035(0);
	}

	@OriginalMember(owner = "client!jr", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(2) int local2 = this.lb;
		this.lb = 0;
		return local2;
	}

	@OriginalMember(owner = "client!jr", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt4923) {
			arg2 -= this.anInt4923 - arg0;
			arg0 = this.anInt4923;
		}
		if (arg1 < this.anInt4922) {
			arg3 -= this.anInt4922 - arg1;
			arg1 = this.anInt4922;
		}
		if (arg0 + arg2 > this.anInt4921) {
			arg2 = this.anInt4921 - arg0;
		}
		if (arg1 + arg3 > this.anInt4930) {
			arg3 = this.anInt4930 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt4921 || arg1 > this.anInt4930) {
			return;
		}
		@Pc(67) int local67 = this.anInt4927 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt4927;
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
						local217 = this.anIntArray280[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray280[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray280[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray280[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray280[arg2] = arg4;
					arg2++;
					this.anIntArray280[arg2] = arg4;
					arg2++;
					this.anIntArray280[arg2] = arg4;
					arg2++;
					this.anIntArray280[arg2] = arg4;
					arg2++;
					this.anIntArray280[arg2] = arg4;
					arg2++;
					this.anIntArray280[arg2] = arg4;
					arg2++;
					this.anIntArray280[arg2] = arg4;
					arg2++;
					this.anIntArray280[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray280[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8031(@OriginalArg(0) Class3_Sub51 arg0) {
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIZ)Lclient!hh;")
	@Override
	public Class6 method8025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? new Class6_Sub3_Sub3(this, arg0, arg1) : new Class6_Sub3_Sub1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "([IIIIIZ)Lclient!hh;")
	@Override
	public Class6 method8005(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class6_Sub3_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class6_Sub3_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4);
				}
			}
		}
		return local1 ? new Class6_Sub3_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class6_Sub3_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}
}
