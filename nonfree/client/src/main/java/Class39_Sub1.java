import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public abstract class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "Ljava/awt/Canvas;")
	protected Canvas aCanvas4;

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
	private int anInt2055;

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "Lclient!fea;")
	protected Class2_Sub21 aClass2_Sub21_3;

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "Z")
	private boolean aBoolean152;

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "Lclient!ica;")
	protected Class127 aClass127_20;

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "Z")
	private boolean aBoolean153;

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
	public int anInt2056;

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
	public int anInt2057;

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
	public int anInt2058;

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
	public int anInt2059;

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
	public int anInt2060;

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
	public int anInt2061;

	@OriginalMember(owner = "client!fg", name = "A", descriptor = "[Lclient!rs;")
	protected Class76[] aClass76Array3;

	@OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
	protected int anInt2062;

	@OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
	public int anInt2063;

	@OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
	public int anInt2064;

	@OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
	private int anInt2065;

	@OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
	private int anInt2066;

	@OriginalMember(owner = "client!fg", name = "G", descriptor = "Lclient!od;")
	public Class181_Sub1 aClass181_Sub1_5;

	@OriginalMember(owner = "client!fg", name = "H", descriptor = "Lclient!qc;")
	private final Class231 aClass231_25;

	@OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
	public int anInt2067;

	@OriginalMember(owner = "client!fg", name = "J", descriptor = "F")
	private float aFloat40;

	@OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
	public int anInt2068;

	@OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
	public int anInt2069;

	@OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
	public int anInt2070;

	@OriginalMember(owner = "client!fg", name = "N", descriptor = "Z")
	private boolean aBoolean154;

	@OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
	private int anInt2071;

	@OriginalMember(owner = "client!fg", name = "P", descriptor = "Z")
	public boolean aBoolean155;

	@OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
	private int anInt2072;

	@OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
	public int anInt2073;

	@OriginalMember(owner = "client!fg", name = "S", descriptor = "F")
	private float aFloat41;

	@OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
	public int anInt2074;

	@OriginalMember(owner = "client!fg", name = "U", descriptor = "I")
	public int anInt2075;

	@OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
	public int anInt2076;

	@OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
	public int anInt2077;

	@OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
	public int anInt2078;

	@OriginalMember(owner = "client!fg", name = "Y", descriptor = "I")
	public int anInt2079;

	@OriginalMember(owner = "client!fg", name = "Z", descriptor = "I")
	public int anInt2080;

	@OriginalMember(owner = "client!fg", name = "ab", descriptor = "I")
	public int anInt2081;

	@OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
	public int anInt2082;

	@OriginalMember(owner = "client!fg", name = "cb", descriptor = "I")
	public int anInt2083;

	@OriginalMember(owner = "client!fg", name = "db", descriptor = "Lclient!ha;")
	protected Class35 aClass35_14;

	@OriginalMember(owner = "client!fg", name = "eb", descriptor = "[I")
	public int[] anIntArray221;

	@OriginalMember(owner = "client!fg", name = "fb", descriptor = "I")
	public int anInt2084;

	@OriginalMember(owner = "client!fg", name = "gb", descriptor = "Z")
	public boolean aBoolean156;

	@OriginalMember(owner = "client!fg", name = "hb", descriptor = "I")
	public int anInt2085;

	@OriginalMember(owner = "client!fg", name = "ib", descriptor = "Lclient!qc;")
	private final Class231 aClass231_26;

	@OriginalMember(owner = "client!fg", name = "jb", descriptor = "I")
	public int anInt2086;

	@OriginalMember(owner = "client!fg", name = "kb", descriptor = "Lclient!ha;")
	private Class35 aClass35_15;

	@OriginalMember(owner = "client!fg", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class39_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface12 arg1) {
		this(arg1);
		this.method6038(arg0);
		this.method6051(arg0);
	}

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!n;)V")
	private Class39_Sub1(@OriginalArg(0) Interface12 arg0) {
		super(arg0);
		this.aBoolean152 = false;
		this.aBoolean153 = false;
		this.aClass127_20 = new Class127(4);
		this.anInt2061 = 0;
		this.anInt2057 = 45823;
		this.anInt2066 = 0;
		this.anInt2070 = 0;
		this.anInt2065 = 0;
		this.anInt2059 = 50;
		this.aBoolean154 = false;
		this.aBoolean155 = false;
		this.anInt2075 = 0;
		this.anInt2060 = 3500;
		this.anInt2074 = 0;
		this.anInt2064 = 512;
		this.anInt2081 = 0;
		this.anInt2072 = 0;
		this.anInt2083 = 75518;
		this.anInt2082 = 78642;
		this.anInt2078 = 512;
		this.anInt2084 = 0;
		this.anInt2085 = 0;
		this.anInt2071 = 3500;
		this.anInt2076 = this.anInt2071 - 255;
		this.aClass231_25 = new Class231(16);
		this.lb = -1;
		this.aClass231_26 = new Class231(20);
		this.aClass181_Sub1_5 = new Class181_Sub1();
		this.method6074(1);
		this.method6047(0);
		Static368.method5873(true, false);
		this.aBoolean152 = true;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V")
	@Override
	public final void method6044(@OriginalArg(0) boolean arg0) {
		this.aBoolean154 = arg0;
		this.aClass231_26.method6240();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!bt;IIII)Lclient!r;")
	public abstract Class63 method6011(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "()Z")
	@Override
	public final boolean method6037() {
		return true;
	}

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "()V")
	@Override
	public void method6056() {
	}

	@OriginalMember(owner = "client!fg", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public final void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class209_Sub3 local2 = (Class209_Sub3) arg1;
		@Pc(5) int[] local5 = local2.anIntArray755;
		@Pc(8) int[] local8 = local2.anIntArray756;
		@Pc(20) int local20;
		if (this.anInt2070 < arg3 + local5.length) {
			local20 = this.anInt2070 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt2061 > arg3) {
			local33 = this.anInt2061 - arg3;
			arg3 = this.anInt2061;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt2068;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt2084 > local58) {
				local62 -= this.anInt2084 - local58;
				local58 = this.anInt2084;
			}
			if (this.anInt2074 < local58 + local62) {
				local62 = this.anInt2074 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray221[local58++] = arg0;
			}
			local49 += this.anInt2068;
		}
	}

	@OriginalMember(owner = "client!fg", name = "Z", descriptor = "(I)V")
	@Override
	public final void Z(@OriginalArg(0) int arg0) {
		this.f(0, 0, this.anInt2068, this.anInt2062, arg0, 0);
	}

	@OriginalMember(owner = "client!fg", name = "P", descriptor = "()F")
	@Override
	public final float P() {
		return this.aFloat40;
	}

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "()Z")
	@Override
	public final boolean method6025() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([Lclient!r;Lclient!oaa;Lclient!m;[Lclient!gr;I)V")
	public abstract void method6030(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class6_Sub4[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "(I)I")
	public final int method2049(@OriginalArg(0) int arg0) {
		return super.anInterface12_15.method2573(arg0).aShort118 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fg", name = "CA", descriptor = "()I")
	@Override
	public final int CA() {
		return this.anInt2071;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!qr;Z)Lclient!ha;")
	@Override
	public final Class35 method6018(@OriginalArg(0) Class241 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray589;
		@Pc(5) byte[] local5 = arg0.aByteArray102;
		@Pc(8) int local8 = arg0.anInt7606;
		@Pc(11) int local11 = arg0.anInt7604;
		@Pc(76) Class35_Sub2 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray101 == null) {
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
			local76 = new Class35_Sub2_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray101;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class35_Sub2_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class35_Sub2_Sub1(this, local20, local8, local11);
			}
		}
		local76.KA(arg0.anInt7603, arg0.anInt7605, arg0.anInt7601, arg0.anInt7602);
		return local76;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!lh;)V")
	@Override
	public final void method6059(@OriginalArg(0) Class58 arg0) {
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!rs;")
	public abstract Class76 method2050(@OriginalArg(0) Runnable arg0);

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6051(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "()V")
	@Override
	public final void method6034() throws Exception_Sub1 {
		if (this.aCanvas4 == null || this.aClass2_Sub21_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas4.getGraphics();
			this.aClass2_Sub21_3.method7766(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas4.repaint();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	public abstract Class75 method6081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt2084 || arg0 >= this.anInt2074) {
			return;
		}
		if (arg1 < this.anInt2061) {
			arg2 -= this.anInt2061 - arg1;
			arg1 = this.anInt2061;
		}
		if (arg1 + arg2 > this.anInt2070) {
			arg2 = this.anInt2070 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt2068;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray221[local40 + local54 * this.anInt2068] = arg3;
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
				local111 = local40 + local103 * this.anInt2068;
				local116 = this.anIntArray221[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray221[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt2068;
				local111 = this.anIntArray221[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray221[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!gr;I)V")
	public abstract void method6046(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class6_Sub4[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6038(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class2_Sub21 local8 = (Class2_Sub21) this.aClass127_20.method3205((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static113.method2225(arg0);
			this.aClass127_20.method3213(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "()V")
	private void method2051() {
		if (this.aFloat41 == 0.0F) {
			this.anInt2060 = this.anInt2071;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt2071;
		@Pc(12) float local12 = (float) this.anInt2059;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat40 / (this.aFloat41 + this.aFloat40);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat41;
		this.anInt2060 = (int) (((float) this.anInt2071 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
	public abstract void method6027(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public final void method6050(@OriginalArg(0) Class2_Sub4 arg0) {
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(FFF)V")
	@Override
	public final void method6069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!fg", name = "L", descriptor = "(I)V")
	@Override
	public final void L(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "()Z")
	@Override
	public final boolean method6073() {
		return true;
	}

	@OriginalMember(owner = "client!fg", name = "E", descriptor = "(III)V")
	@Override
	public final void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2085 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt2085 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt2085 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt2085 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt2085 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean156 = false;
		} else {
			this.aBoolean156 = true;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
	@Override
	public final void method6010(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "(I)[I")
	private int[] method2052(@OriginalArg(0) int arg0) {
		@Pc(2) Class231 local2 = this.aClass231_26;
		@Pc(12) Class2_Sub30 local12;
		synchronized (this.aClass231_26) {
			local12 = (Class2_Sub30) this.aClass231_26.method6228((long) arg0);
			if (local12 == null) {
				if (!super.anInterface12_15.method2572(arg0)) {
					return null;
				}
				@Pc(32) Class204 local32 = super.anInterface12_15.method2573(arg0);
				@Pc(42) int local42 = local32.aBoolean454 || this.aBoolean154 ? 64 : 128;
				local12 = new Class2_Sub30(arg0, local42, super.anInterface12_15.method2574(0.7F, local42, arg0, local42), local32.aBoolean455);
				this.aClass231_26.method6232(local12, (long) arg0);
			}
		}
		local12.aBoolean367 = true;
		return local12.method4281();
	}

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "()Z")
	public abstract boolean method6036();

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "()Z")
	@Override
	public final boolean method6066() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)I")
	@Override
	public final int method6028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!fg", name = "JA", descriptor = "(IIII)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2081 = arg0;
		this.anInt2085 = arg1;
		this.anInt2075 = arg2;
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "(IIIIII)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt2084) {
			arg2 -= this.anInt2084 - arg0;
			arg0 = this.anInt2084;
		}
		if (arg1 < this.anInt2061) {
			arg3 -= this.anInt2061 - arg1;
			arg1 = this.anInt2061;
		}
		if (arg0 + arg2 > this.anInt2074) {
			arg2 = this.anInt2074 - arg0;
		}
		if (arg1 + arg3 > this.anInt2070) {
			arg3 = this.anInt2070 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt2074 || arg1 > this.anInt2070) {
			return;
		}
		@Pc(67) int local67 = this.anInt2068 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt2068;
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
						local217 = this.anIntArray221[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray221[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray221[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray221[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray221[arg2] = arg4;
					arg2++;
					this.anIntArray221[arg2] = arg4;
					arg2++;
					this.anIntArray221[arg2] = arg4;
					arg2++;
					this.anIntArray221[arg2] = arg4;
					arg2++;
					this.anIntArray221[arg2] = arg4;
					arg2++;
					this.anIntArray221[arg2] = arg4;
					arg2++;
					this.anIntArray221[arg2] = arg4;
					arg2++;
					this.anIntArray221[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray221[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V")
	@Override
	public void method6047(@OriginalArg(0) int arg0) {
		this.aClass76Array3[arg0].method5861(Thread.currentThread());
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public final Class35 method6049(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class35_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class35_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class35_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class35_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method6083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.UA(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.UA(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt2084) {
					arg1 += local104 * (this.anInt2084 - arg0);
					arg0 = this.anInt2084;
				}
				if (arg2 >= this.anInt2074) {
					arg2 = this.anInt2074 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt2061 && local150 < this.anInt2070) {
							this.anIntArray221[arg0 + local150 * this.anInt2068] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt2061 && local213 < this.anInt2070) {
							local228 = arg0 + local213 * this.anInt2068;
							local233 = this.anIntArray221[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray221[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt2061 && local150 < this.anInt2070) {
							local213 = arg0 + local150 * this.anInt2068;
							local228 = this.anIntArray221[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray221[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt2061) {
					arg0 += local104 * (this.anInt2061 - arg1);
					arg1 = this.anInt2061;
				}
				if (arg3 >= this.anInt2070) {
					arg3 = this.anInt2070 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt2084 && local150 < this.anInt2074) {
							this.anIntArray221[local150 + arg1 * this.anInt2068] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt2084 && local213 < this.anInt2074) {
							local228 = local213 + arg1 * this.anInt2068;
							local233 = this.anIntArray221[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray221[local213 + arg1 * this.anInt2068] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt2084 && local150 < this.anInt2074) {
							local213 = local150 + arg1 * this.anInt2068;
							local228 = this.anIntArray221[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray221[local213] = local233 - local587 | local587 - (local587 >>> 8);
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.e(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.e(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "()Z")
	@Override
	public final boolean method6026() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "(IIII)[I")
	@Override
	public final int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt2068 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray221[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "()V")
	@Override
	public final void n() {
		this.anInt2084 = 0;
		this.anInt2061 = 0;
		this.anInt2074 = this.anInt2068;
		this.anInt2070 = this.anInt2062;
		this.method2060();
	}

	@OriginalMember(owner = "client!fg", name = "C", descriptor = "()Z")
	@Override
	public final boolean method6080() {
		return true;
	}

	@OriginalMember(owner = "client!fg", name = "M", descriptor = "(F)V")
	@Override
	public final void M(@OriginalArg(0) float arg0) {
		this.anInt2083 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "()Z")
	@Override
	public final boolean method6013() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!oaa;)V")
	@Override
	public final void method6019(@OriginalArg(0) Class208 arg0) {
		@Pc(3) Class6_Sub1 local3 = arg0.aClass210_1.aClass6_Sub1_7;
		for (@Pc(6) Class6_Sub1 local6 = local3.aClass6_Sub1_9; local6 != local3; local6 = local6.aClass6_Sub1_9) {
			@Pc(10) Class6_Sub1_Sub2 local10 = (Class6_Sub1_Sub2) local6;
			@Pc(15) int local15 = local10.anInt8123 >> 12;
			@Pc(20) int local20 = local10.anInt8129 >> 12;
			@Pc(25) int local25 = local10.anInt8124 >> 12;
			@Pc(49) int local49 = this.aClass181_Sub1_5.anInt6294 + (this.aClass181_Sub1_5.anInt6293 * local15 + this.aClass181_Sub1_5.anInt6296 * local20 + this.aClass181_Sub1_5.anInt6300 * local25 >> 15);
			if (local49 >= this.anInt2059 && local49 <= this.anInt2076) {
				@Pc(90) int local90 = this.anInt2086 + this.anInt2078 * (this.aClass181_Sub1_5.anInt6301 + (this.aClass181_Sub1_5.anInt6304 * local15 + this.aClass181_Sub1_5.anInt6299 * local20 + this.aClass181_Sub1_5.anInt6302 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt2073 + this.anInt2064 * (this.aClass181_Sub1_5.anInt6297 + (this.aClass181_Sub1_5.anInt6295 * local15 + this.aClass181_Sub1_5.anInt6303 * local20 + this.aClass181_Sub1_5.anInt6298 * local25 >> 15)) / local49;
				if (local90 >= this.anInt2084 && local90 <= this.anInt2074 && local122 >= this.anInt2061 && local122 <= this.anInt2070) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method2055(local10, local90, local122, (local10.anInt8122 * this.anInt2078 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "(I)[I")
	public final int[] method2053(@OriginalArg(0) int arg0) {
		@Pc(2) Class231 local2 = this.aClass231_26;
		@Pc(12) Class2_Sub30 local12;
		synchronized (this.aClass231_26) {
			local12 = (Class2_Sub30) this.aClass231_26.method6228((long) arg0);
			if (local12 == null) {
				if (!super.anInterface12_15.method2572(arg0)) {
					return null;
				}
				@Pc(32) Class204 local32 = super.anInterface12_15.method2573(arg0);
				@Pc(42) int local42 = local32.aBoolean454 || this.aBoolean154 ? 64 : 128;
				local12 = new Class2_Sub30(arg0, local42, super.anInterface12_15.method2571(local42, local42, 0.7F, arg0, true), local32.aBoolean455);
				this.aClass231_26.method6232(local12, (long) arg0);
			}
		}
		local12.aBoolean367 = true;
		return local12.method4281();
	}

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "(I)Z")
	public final boolean method2054(@OriginalArg(0) int arg0) {
		return super.anInterface12_15.method2572(arg0);
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(Z)V")
	@Override
	public final void method6058(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fg", name = "B", descriptor = "()V")
	@Override
	public final void method6076() {
	}

	@OriginalMember(owner = "client!fg", name = "F", descriptor = "(IIII)V")
	@Override
	public final void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2084 < arg0) {
			this.anInt2084 = arg0;
		}
		if (this.anInt2061 < arg1) {
			this.anInt2061 = arg1;
		}
		if (this.anInt2074 > arg2) {
			this.anInt2074 = arg2;
		}
		if (this.anInt2070 > arg3) {
			this.anInt2070 = arg3;
		}
		this.method2060();
	}

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "()I")
	@Override
	public final int method6053() {
		return 0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIF)Lclient!at;")
	@Override
	public final Class2_Sub5 method6077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	@Override
	public final void method6008(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt2055;
		for (@Pc(9) Object local9 = this.aClass231_26.method6233(); local9 != null; local9 = this.aClass231_26.method6230()) {
			@Pc(13) Class2_Sub30 local13 = (Class2_Sub30) local9;
			if (local13.aBoolean367) {
				local13.anInt4912 += local4;
				@Pc(27) int local27 = local13.anInt4912 / 20;
				if (local27 > 0) {
					@Pc(36) Class204 local36 = super.anInterface12_15.method2573(local13.anInt4910);
					local13.method4283(local36.aByte87 * local4 * 50 / 1000, local36.aByte84 * local4 * 50 / 1000);
					local13.anInt4912 -= local27 * 20;
				}
				local13.aBoolean367 = false;
			}
		}
		this.anInt2055 = arg0;
		this.aClass231_25.method6231(5);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public final void method6032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class209 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class209_Sub3 local2 = (Class209_Sub3) arg5;
		@Pc(5) int[] local5 = local2.anIntArray755;
		@Pc(8) int[] local8 = local2.anIntArray756;
		@Pc(17) int local17 = this.anInt2061 > arg7 ? this.anInt2061 : arg7;
		@Pc(32) int local32 = this.anInt2070 < arg7 + local5.length ? this.anInt2070 : arg7 + local5.length;
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
					if (local129 >= this.anInt2084 && local129 < this.anInt2074 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray221[local129 + arg1 * this.anInt2068] = arg4;
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
					if (local133 >= this.anInt2084 && local133 < this.anInt2074 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt2068;
						local248 = this.anIntArray221[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray221[local133 + arg1 * this.anInt2068] = local201 + local584;
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
		if (arg0 < this.anInt2084) {
			arg1 += local83 * (this.anInt2084 - arg0);
			arg0 = this.anInt2084;
		}
		if (arg2 >= this.anInt2074) {
			arg2 = this.anInt2074 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray221[arg0 + local129 * this.anInt2068] = arg4;
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
					local243 = arg0 + local133 * this.anInt2068;
					local248 = this.anIntArray221[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray221[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!dd;[Lclient!qr;Z)Lclient!ra;")
	@Override
	public final Class47 method6078(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class241[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt7606;
			local7[local11] = arg1[local11].anInt7604;
			if (arg1[local11].aByteArray101 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class47_Sub5(this, arg0, arg1, local3, local7);
		} else {
			return new Class47_Sub4(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public final void method6015(@OriginalArg(0) Class181 arg0) {
		this.aClass181_Sub1_5 = (Class181_Sub1) arg0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6007(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas4 == arg0) {
			this.method6051(null);
		}
		@Pc(15) Class2_Sub21 local15 = (Class2_Sub21) this.aClass127_20.method3205((long) arg0.hashCode());
		if (local15 != null) {
			local15.method7802();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!gda;III)V")
	public final void method2055(@OriginalArg(0) Class6_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt8127;
		@Pc(8) int local8 = arg3 << 1;
		if (local2 == -1) {
			this.A(arg1, arg2, arg3, arg0.anInt8125, 1);
			return;
		}
		if (this.lb != local2) {
			@Pc(32) Class35 local32 = (Class35) this.aClass231_25.method6228((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method2052(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method2056(local2) ? 64 : 128;
				local32 = this.method6049(local38, local48, local48, local48);
				this.aClass231_25.method6232(local32, (long) local2);
			}
			this.lb = local2;
			this.aClass35_15 = local32;
		}
		local8++;
		this.aClass35_15.ra(arg1 - arg3, arg2 - arg3, local8, local8, 0, arg0.anInt8125, 1);
	}

	@OriginalMember(owner = "client!fg", name = "A", descriptor = "()Z")
	@Override
	public final boolean method6075() {
		return true;
	}

	@OriginalMember(owner = "client!fg", name = "A", descriptor = "(IIIII)V")
	@Override
	protected final void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt2061) {
			local8 = this.anInt2061;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt2070) {
			local21 = this.anInt2070;
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
				if (local91 < this.anInt2084) {
					local91 = this.anInt2084;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2074) {
					local102 = this.anInt2074;
				}
				local116 = local91 + local30 * this.anInt2068;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray221[local116++] = arg3;
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
				if (local91 < this.anInt2084) {
					local91 = this.anInt2084;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2074 - 1) {
					local102 = this.anInt2074 - 1;
				}
				local116 = local91 + local30 * this.anInt2068;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray221[local116++] = arg3;
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
				if (local102 < this.anInt2084) {
					local102 = this.anInt2084;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt2074) {
					local116 = this.anInt2074;
				}
				local118 = local102 + local30 * this.anInt2068;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray221[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray221[local118++] = local277 + local340;
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
				if (local102 < this.anInt2084) {
					local102 = this.anInt2084;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt2074 - 1) {
					local116 = this.anInt2074 - 1;
				}
				local118 = local102 + local30 * this.anInt2068;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray221[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray221[local118++] = local277 + local340;
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
				if (local91 < this.anInt2084) {
					local91 = this.anInt2084;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2074) {
					local102 = this.anInt2074;
				}
				local116 = local91 + local30 * this.anInt2068;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray221[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray221[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt2084) {
					local91 = this.anInt2084;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2074 - 1) {
					local102 = this.anInt2074 - 1;
				}
				local116 = local91 + local30 * this.anInt2068;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray221[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray221[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "(I)Z")
	public final boolean method2056(@OriginalArg(0) int arg0) {
		return this.aBoolean154 || super.anInterface12_15.method2573(arg0).aBoolean454;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!r;Lclient!oaa;Lclient!m;Lclient!gr;I)V")
	@Override
	public final void method6020(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class6_Sub4 arg3) {
		((Class63_Sub1) arg0).method7730(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!fg", name = "D", descriptor = "()Z")
	@Override
	public final boolean method6082() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "()Z")
	@Override
	public final boolean method6065() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "YA", descriptor = "()I")
	@Override
	public final int YA() {
		@Pc(2) int local2 = this.anInt2065;
		this.anInt2065 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt2057 = (int) (arg1 * 65535.0F);
		this.anInt2082 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt2063 = (int) (arg3 * 65535.0F / local26);
		this.anInt2067 = (int) (arg4 * 65535.0F / local26);
		this.anInt2079 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!fg", name = "la", descriptor = "(FF)V")
	@Override
	public final void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat40 = arg0;
		this.aFloat41 = arg1;
		this.method2051();
	}

	@OriginalMember(owner = "client!fg", name = "E", descriptor = "()Z")
	public final boolean method2057() {
		return this.aBoolean153;
	}

	@OriginalMember(owner = "client!fg", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt2068;
		@Pc(35) int local35 = this.anInt2068 - arg2;
		if (arg1 + arg3 > this.anInt2070) {
			arg3 -= arg1 + arg3 - this.anInt2070;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt2061) {
			local59 = this.anInt2061 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt2068;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt2074) {
			local59 = arg0 + arg2 - this.anInt2074;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt2084) {
			local59 = this.anInt2084 - arg0;
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
						this.anIntArray221[local30++] = arg4;
					} else {
						this.anIntArray221[local30++] = arg5;
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
					local245 = this.anIntArray221[local30];
					this.anIntArray221[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray221[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray221[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "()Z")
	@Override
	public final boolean method6024() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)Lclient!u;")
	@Override
	public final Class2_Sub4 method6033(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIIII)V")
	public final void method2058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface12_15.method2573(arg5).aBoolean460) {
			this.A(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.lb != arg5) {
			@Pc(26) Class35 local26 = (Class35) this.aClass231_25.method6228((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method2052(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method2056(arg5) ? 64 : 128;
				local26 = this.method6049(local32, local43, local43, local43);
				this.aClass231_25.method6232(local26, (long) arg5);
			}
			this.lb = arg5;
			this.aClass35_15 = local26;
		}
		this.aClass35_15.ra(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!fg", name = "UA", descriptor = "(IIIII)V")
	@Override
	public final void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt2061 || arg1 >= this.anInt2070) {
			return;
		}
		if (arg0 < this.anInt2084) {
			arg2 -= this.anInt2084 - arg0;
			arg0 = this.anInt2084;
		}
		if (arg0 + arg2 > this.anInt2074) {
			arg2 = this.anInt2074 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt2068;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray221[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray221[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray221[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray221[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray221[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(IIII)V")
	@Override
	public final void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2086 = arg0;
		this.anInt2073 = arg1;
		this.anInt2078 = arg2;
		this.anInt2064 = arg3;
		this.method2060();
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "()V")
	@Override
	public final void method6023() {
		this.aClass231_26.method6240();
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt2059;
	}

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "()V")
	@Override
	public final void method6031() {
	}

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "(IIII)V")
	@Override
	public final void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2066 = this.anInt2085;
		this.anInt2081 = arg0;
		this.anInt2085 = arg1;
		this.anInt2075 = arg2;
		this.aBoolean155 = true;
	}

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "()Lclient!m;")
	@Override
	public final Class181 method6035() {
		return new Class181_Sub1();
	}

	@OriginalMember(owner = "client!fg", name = "ta", descriptor = "(II)V")
	@Override
	public final void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2059 = arg0;
		this.anInt2071 = arg1;
		this.anInt2076 = this.anInt2071 - 255;
		this.method2051();
	}

	@OriginalMember(owner = "client!fg", name = "N", descriptor = "(IIII)V")
	@Override
	public final void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt2068) {
			arg2 = this.anInt2068;
		}
		if (arg3 > this.anInt2062) {
			arg3 = this.anInt2062;
		}
		this.anInt2084 = arg0;
		this.anInt2074 = arg2;
		this.anInt2061 = arg1;
		this.anInt2070 = arg3;
		this.method2060();
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6057(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!fg", name = "ba", descriptor = "()I")
	@Override
	public final int ba() {
		@Pc(2) int local2 = this.anInt2072;
		this.anInt2072 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "([I)V")
	@Override
	public final void d(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2084;
		arg0[1] = this.anInt2061;
		arg0[2] = this.anInt2074;
		arg0[3] = this.anInt2070;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)I")
	@Override
	public final int method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!fg", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public final boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass181_Sub1_5.anInt6293 * arg0 + this.aClass181_Sub1_5.anInt6296 * arg1 + this.aClass181_Sub1_5.anInt6300 * arg2 >> 15) + this.aClass181_Sub1_5.anInt6294;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass181_Sub1_5.anInt6293 * arg3 + this.aClass181_Sub1_5.anInt6296 * arg4 + this.aClass181_Sub1_5.anInt6300 * arg5 >> 15) + this.aClass181_Sub1_5.anInt6294;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt2059 && local52 < this.anInt2059 || !(local23 <= this.anInt2071 || local52 <= this.anInt2071)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt2078 * ((this.aClass181_Sub1_5.anInt6304 * arg0 + this.aClass181_Sub1_5.anInt6299 * arg1 + this.aClass181_Sub1_5.anInt6302 * arg2 >> 15) + this.aClass181_Sub1_5.anInt6301) / local23;
		@Pc(133) int local133 = this.anInt2078 * ((this.aClass181_Sub1_5.anInt6304 * arg3 + this.aClass181_Sub1_5.anInt6299 * arg4 + this.aClass181_Sub1_5.anInt6302 * arg5 >> 15) + this.aClass181_Sub1_5.anInt6301) / local52;
		if (local104 < this.anInt2077 && local133 < this.anInt2077 || local104 > this.anInt2056 && local133 > this.anInt2056) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt2064 * ((this.aClass181_Sub1_5.anInt6295 * arg0 + this.aClass181_Sub1_5.anInt6303 * arg1 + this.aClass181_Sub1_5.anInt6298 * arg2 >> 15) + this.aClass181_Sub1_5.anInt6297) / local23;
			@Pc(209) int local209 = this.anInt2064 * ((this.aClass181_Sub1_5.anInt6295 * arg3 + this.aClass181_Sub1_5.anInt6303 * arg4 + this.aClass181_Sub1_5.anInt6298 * arg5 >> 15) + this.aClass181_Sub1_5.anInt6297) / local52;
			return (local180 >= this.anInt2069 || local209 >= this.anInt2069) && (local180 <= this.anInt2080 || local209 <= this.anInt2080);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public final Class209 method6017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class209_Sub3(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fg", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return 0;
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "()Z")
	@Override
	public final boolean method6014() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method6016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public final void method6064(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas4 == null || this.aClass2_Sub21_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas4.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt2068 && local21.y <= this.anInt2062 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass2_Sub21_3.method7767(local21.height, local21.y, local21.width, local21.x, local14);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas4.repaint();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!lh;Lclient!lh;FLclient!lh;)Lclient!lh;")
	@Override
	public final Class58 method6045(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class58 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "()Lclient!rr;")
	@Override
	public final Class254 method6009() {
		return new Class254(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "()Z")
	@Override
	public final boolean method6054() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "()V")
	@Override
	public final void method6041() {
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method6060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.UA(arg0, arg1, arg2, arg4, arg5);
		this.UA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.e(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.e(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIII)Lclient!lh;")
	@Override
	public final Class58 method6040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!fg", name = "xa", descriptor = "()V")
	@Override
	public final void xa() {
		this.anInt2085 = this.anInt2066;
		this.aBoolean155 = false;
	}

	@OriginalMember(owner = "client!fg", name = "F", descriptor = "()V")
	protected final void method2059() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2058; local1++) {
			this.aClass76Array3[local1].method5864();
		}
		this.n();
	}

	@OriginalMember(owner = "client!fg", name = "G", descriptor = "()V")
	protected abstract void method2060();

	@OriginalMember(owner = "client!fg", name = "IA", descriptor = "(III[I)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass181_Sub1_5.anInt6294 + (this.aClass181_Sub1_5.anInt6293 * arg0 + this.aClass181_Sub1_5.anInt6296 * arg1 + this.aClass181_Sub1_5.anInt6300 * arg2 >> 15);
		if (local23 < this.anInt2059 || local23 > this.anInt2071) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt2078 * (this.aClass181_Sub1_5.anInt6301 + (this.aClass181_Sub1_5.anInt6304 * arg0 + this.aClass181_Sub1_5.anInt6299 * arg1 + this.aClass181_Sub1_5.anInt6302 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt2064 * (this.aClass181_Sub1_5.anInt6297 + (this.aClass181_Sub1_5.anInt6295 * arg0 + this.aClass181_Sub1_5.anInt6303 * arg1 + this.aClass181_Sub1_5.anInt6298 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt2077 && local73 <= this.anInt2056 && local102 >= this.anInt2069 && local102 <= this.anInt2080) {
			arg3[0] = local73 - this.anInt2077;
			arg3[1] = local102 - this.anInt2069;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "()Lclient!m;")
	@Override
	public final Class181 method6022() {
		@Pc(3) Class76 local3 = this.method2050(Thread.currentThread());
		return local3.aClass181_Sub1_8;
	}

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "()V")
	@Override
	protected final void method6055() {
		if (this.aBoolean152) {
			Static456.method6972(true, false);
			this.aBoolean152 = false;
		}
		this.aClass2_Sub21_3 = null;
		this.aCanvas4 = null;
		this.aClass127_20 = null;
		this.aBoolean153 = true;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method6006();

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "()V")
	@Override
	public final void method6062() {
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public final Class35 method6072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt2068 + arg0;
		@Pc(16) int local16 = this.anInt2068 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray221[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class35_Sub2_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class35_Sub2_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "()Z")
	@Override
	public final boolean method6043() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "ra", descriptor = "()F")
	@Override
	public final float ra() {
		return this.aFloat41;
	}

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "(I)Z")
	public final boolean method2061(@OriginalArg(0) int arg0) {
		return super.anInterface12_15.method2573(arg0).aBoolean458;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
	@Override
	public final void method6012(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "(I)V")
	public abstract void method6074(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[Lclient!at;)V")
	@Override
	public final void method6063(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5[] arg1) {
	}
}
