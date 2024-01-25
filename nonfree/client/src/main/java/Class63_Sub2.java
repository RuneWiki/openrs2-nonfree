import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class63_Sub2 extends Class63 implements Interface5 {

	@OriginalMember(owner = "client!fu", name = "J", descriptor = "I")
	public int anInt2088;

	@OriginalMember(owner = "client!fu", name = "N", descriptor = "I")
	public int anInt2091;

	@OriginalMember(owner = "client!fu", name = "O", descriptor = "I")
	public int anInt2092;

	@OriginalMember(owner = "client!fu", name = "Q", descriptor = "I")
	public int anInt2093;

	@OriginalMember(owner = "client!fu", name = "R", descriptor = "I")
	public int anInt2094;

	@OriginalMember(owner = "client!fu", name = "U", descriptor = "I")
	private int anInt2096;

	@OriginalMember(owner = "client!fu", name = "V", descriptor = "Lclient!nd;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "client!fu", name = "cb", descriptor = "F")
	private float aFloat18;

	@OriginalMember(owner = "client!fu", name = "db", descriptor = "I")
	public int anInt2097;

	@OriginalMember(owner = "client!fu", name = "fb", descriptor = "Z")
	private boolean aBoolean145;

	@OriginalMember(owner = "client!fu", name = "gb", descriptor = "Lclient!mi;")
	public Class44_Sub2 aClass44_Sub2_1;

	@OriginalMember(owner = "client!fu", name = "jb", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!fu", name = "kb", descriptor = "Z")
	private boolean aBoolean146;

	@OriginalMember(owner = "client!fu", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!fu", name = "mb", descriptor = "F")
	private float aFloat21;

	@OriginalMember(owner = "client!fu", name = "nb", descriptor = "I")
	private int anInt2100;

	@OriginalMember(owner = "client!fu", name = "rb", descriptor = "Lclient!hm;")
	public Class99 aClass99_3;

	@OriginalMember(owner = "client!fu", name = "tb", descriptor = "Z")
	public boolean aBoolean147;

	@OriginalMember(owner = "client!fu", name = "vb", descriptor = "Z")
	private boolean aBoolean148;

	@OriginalMember(owner = "client!fu", name = "xb", descriptor = "I")
	private int anInt2104;

	@OriginalMember(owner = "client!fu", name = "zb", descriptor = "Lclient!fa;")
	public Class66_Sub1 aClass66_Sub1_1;

	@OriginalMember(owner = "client!fu", name = "Bb", descriptor = "Z")
	public boolean aBoolean149;

	@OriginalMember(owner = "client!fu", name = "Cb", descriptor = "I")
	private int anInt2106;

	@OriginalMember(owner = "client!fu", name = "Db", descriptor = "Z")
	private boolean aBoolean150;

	@OriginalMember(owner = "client!fu", name = "Eb", descriptor = "Lclient!uo;")
	public Class20_Sub4 aClass20_Sub4_3;

	@OriginalMember(owner = "client!fu", name = "Fb", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!fu", name = "Gb", descriptor = "Lclient!jj;")
	private Interface3 anInterface3_4;

	@OriginalMember(owner = "client!fu", name = "Kb", descriptor = "Z")
	public boolean aBoolean152;

	@OriginalMember(owner = "client!fu", name = "Lb", descriptor = "Z")
	public boolean aBoolean153;

	@OriginalMember(owner = "client!fu", name = "Mb", descriptor = "I")
	private int anInt2107;

	@OriginalMember(owner = "client!fu", name = "Nb", descriptor = "Lclient!bm;")
	private Class21_Sub1 aClass21_Sub1_1;

	@OriginalMember(owner = "client!fu", name = "Ob", descriptor = "Lclient!wc;")
	private Class20_Sub4_Sub1 aClass20_Sub4_Sub1_2;

	@OriginalMember(owner = "client!fu", name = "Sb", descriptor = "I")
	private int anInt2110;

	@OriginalMember(owner = "client!fu", name = "Vb", descriptor = "Lclient!fa;")
	public Class66_Sub1 aClass66_Sub1_2;

	@OriginalMember(owner = "client!fu", name = "Xb", descriptor = "I")
	public int anInt2112;

	@OriginalMember(owner = "client!fu", name = "Yb", descriptor = "Lclient!fa;")
	public Class66_Sub1 aClass66_Sub1_3;

	@OriginalMember(owner = "client!fu", name = "cc", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!fu", name = "ec", descriptor = "Z")
	private boolean aBoolean154;

	@OriginalMember(owner = "client!fu", name = "fc", descriptor = "Lclient!uo;")
	public Class20_Sub4 aClass20_Sub4_4;

	@OriginalMember(owner = "client!fu", name = "gc", descriptor = "I")
	private int anInt2116;

	@OriginalMember(owner = "client!fu", name = "hc", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!fu", name = "ic", descriptor = "Z")
	private boolean aBoolean155;

	@OriginalMember(owner = "client!fu", name = "jc", descriptor = "Lclient!uo;")
	public Class20_Sub4 aClass20_Sub4_5;

	@OriginalMember(owner = "client!fu", name = "kc", descriptor = "Z")
	private boolean aBoolean156;

	@OriginalMember(owner = "client!fu", name = "lc", descriptor = "I")
	public int anInt2117;

	@OriginalMember(owner = "client!fu", name = "pc", descriptor = "I")
	private int anInt2120;

	@OriginalMember(owner = "client!fu", name = "qc", descriptor = "Z")
	private boolean aBoolean157;

	@OriginalMember(owner = "client!fu", name = "rc", descriptor = "Lclient!fa;")
	public Class66_Sub1 aClass66_Sub1_4;

	@OriginalMember(owner = "client!fu", name = "sc", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!fu", name = "uc", descriptor = "[Lclient!tp;")
	private Class20[] aClass20Array1;

	@OriginalMember(owner = "client!fu", name = "wc", descriptor = "I")
	private int anInt2123;

	@OriginalMember(owner = "client!fu", name = "zc", descriptor = "F")
	private float aFloat33;

	@OriginalMember(owner = "client!fu", name = "Ec", descriptor = "Lclient!mi;")
	public Class44_Sub2 aClass44_Sub2_2;

	@OriginalMember(owner = "client!fu", name = "Gc", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!fu", name = "Hc", descriptor = "Ljava/lang/String;")
	private String aString22;

	@OriginalMember(owner = "client!fu", name = "Jc", descriptor = "Lclient!fa;")
	public Class66_Sub1 aClass66_Sub1_5;

	@OriginalMember(owner = "client!fu", name = "Lc", descriptor = "Z")
	private boolean aBoolean160;

	@OriginalMember(owner = "client!fu", name = "Oc", descriptor = "Z")
	public boolean aBoolean162;

	@OriginalMember(owner = "client!fu", name = "Pc", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!fu", name = "Qc", descriptor = "Z")
	private boolean aBoolean163;

	@OriginalMember(owner = "client!fu", name = "Rc", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!fu", name = "Sc", descriptor = "I")
	private int anInt2129;

	@OriginalMember(owner = "client!fu", name = "Tc", descriptor = "Z")
	public boolean aBoolean164;

	@OriginalMember(owner = "client!fu", name = "Uc", descriptor = "Lclient!pc;")
	private Interface6 anInterface6_5;

	@OriginalMember(owner = "client!fu", name = "Wc", descriptor = "I")
	private int anInt2131;

	@OriginalMember(owner = "client!fu", name = "Yc", descriptor = "Lclient!fa;")
	public Class66_Sub1 aClass66_Sub1_6;

	@OriginalMember(owner = "client!fu", name = "Zc", descriptor = "Lclient!fa;")
	public Class66_Sub1 aClass66_Sub1_7;

	@OriginalMember(owner = "client!fu", name = "ad", descriptor = "Lclient!fa;")
	public Class66_Sub1 aClass66_Sub1_8;

	@OriginalMember(owner = "client!fu", name = "cd", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!fu", name = "dd", descriptor = "J")
	private long aLong74;

	@OriginalMember(owner = "client!fu", name = "z", descriptor = "Lclient!cm;")
	private final Class35 aClass35_1 = new Class35();

	@OriginalMember(owner = "client!fu", name = "I", descriptor = "Lclient!de;")
	private final Class44 aClass44_2 = new Class44_Sub2();

	@OriginalMember(owner = "client!fu", name = "M", descriptor = "I")
	private int anInt2090 = -1;

	@OriginalMember(owner = "client!fu", name = "K", descriptor = "[Lclient!nd;")
	private final Interface5[] anInterface5Array1 = new Interface5[4];

	@OriginalMember(owner = "client!fu", name = "L", descriptor = "I")
	public final int anInt2089 = 3;

	@OriginalMember(owner = "client!fu", name = "S", descriptor = "Z")
	private boolean aBoolean144 = false;

	@OriginalMember(owner = "client!fu", name = "T", descriptor = "I")
	public final int anInt2095 = 8;

	@OriginalMember(owner = "client!fu", name = "P", descriptor = "Lclient!cf;")
	private final Class30 aClass30_7 = new Class30();

	@OriginalMember(owner = "client!fu", name = "W", descriptor = "Lclient!cf;")
	private final Class30 aClass30_8 = new Class30();

	@OriginalMember(owner = "client!fu", name = "X", descriptor = "Lclient!cf;")
	private final Class30 aClass30_9 = new Class30();

	@OriginalMember(owner = "client!fu", name = "Y", descriptor = "Lclient!cf;")
	private final Class30 aClass30_10 = new Class30();

	@OriginalMember(owner = "client!fu", name = "Z", descriptor = "Lclient!cf;")
	private final Class30 aClass30_11 = new Class30();

	@OriginalMember(owner = "client!fu", name = "ab", descriptor = "Lclient!cf;")
	private final Class30 aClass30_12 = new Class30();

	@OriginalMember(owner = "client!fu", name = "bb", descriptor = "Lclient!cf;")
	private final Class30 aClass30_13 = new Class30();

	@OriginalMember(owner = "client!fu", name = "ub", descriptor = "F")
	public float aFloat22 = 1.0F;

	@OriginalMember(owner = "client!fu", name = "pb", descriptor = "I")
	private int anInt2102 = 0;

	@OriginalMember(owner = "client!fu", name = "hb", descriptor = "I")
	public int anInt2098 = 50;

	@OriginalMember(owner = "client!fu", name = "sb", descriptor = "I")
	private int anInt2103 = 0;

	@OriginalMember(owner = "client!fu", name = "Ub", descriptor = "F")
	private float aFloat29 = 0.0F;

	@OriginalMember(owner = "client!fu", name = "Tb", descriptor = "F")
	private float aFloat28 = 1.0F;

	@OriginalMember(owner = "client!fu", name = "ob", descriptor = "I")
	public int anInt2101 = -1;

	@OriginalMember(owner = "client!fu", name = "nc", descriptor = "I")
	private int anInt2118 = -1;

	@OriginalMember(owner = "client!fu", name = "Pb", descriptor = "I")
	public int anInt2108 = 0;

	@OriginalMember(owner = "client!fu", name = "Qb", descriptor = "I")
	private int anInt2109 = 0;

	@OriginalMember(owner = "client!fu", name = "eb", descriptor = "F")
	public float aFloat19 = 3584.0F;

	@OriginalMember(owner = "client!fu", name = "tc", descriptor = "I")
	private int anInt2121 = 0;

	@OriginalMember(owner = "client!fu", name = "oc", descriptor = "I")
	public int anInt2119 = -1;

	@OriginalMember(owner = "client!fu", name = "Rb", descriptor = "F")
	public float aFloat27 = -1.0F;

	@OriginalMember(owner = "client!fu", name = "Hb", descriptor = "F")
	public float aFloat26 = -1.0F;

	@OriginalMember(owner = "client!fu", name = "ac", descriptor = "I")
	public int anInt2114 = 3584;

	@OriginalMember(owner = "client!fu", name = "Bc", descriptor = "I")
	private int anInt2127 = 0;

	@OriginalMember(owner = "client!fu", name = "Wb", descriptor = "I")
	private int anInt2111 = 8448;

	@OriginalMember(owner = "client!fu", name = "bc", descriptor = "I")
	public int anInt2115 = 0;

	@OriginalMember(owner = "client!fu", name = "Ic", descriptor = "F")
	public float aFloat35 = 1.0F;

	@OriginalMember(owner = "client!fu", name = "xc", descriptor = "I")
	private int anInt2124 = 0;

	@OriginalMember(owner = "client!fu", name = "dc", descriptor = "F")
	public float aFloat30 = 1.0F;

	@OriginalMember(owner = "client!fu", name = "Ab", descriptor = "I")
	public int anInt2105 = 0;

	@OriginalMember(owner = "client!fu", name = "mc", descriptor = "[F")
	private final float[] aFloatArray11 = new float[16];

	@OriginalMember(owner = "client!fu", name = "Zb", descriptor = "I")
	public int anInt2113 = 512;

	@OriginalMember(owner = "client!fu", name = "yc", descriptor = "I")
	private int anInt2125 = -1;

	@OriginalMember(owner = "client!fu", name = "vc", descriptor = "I")
	private int anInt2122 = 8448;

	@OriginalMember(owner = "client!fu", name = "yb", descriptor = "F")
	public float aFloat24 = 3584.0F;

	@OriginalMember(owner = "client!fu", name = "qb", descriptor = "[F")
	private final float[] aFloatArray9 = new float[4];

	@OriginalMember(owner = "client!fu", name = "Mc", descriptor = "[F")
	public final float[] aFloatArray13 = new float[4];

	@OriginalMember(owner = "client!fu", name = "Vc", descriptor = "I")
	public int anInt2130 = 512;

	@OriginalMember(owner = "client!fu", name = "Kc", descriptor = "[F")
	private final float[] aFloatArray12 = new float[4];

	@OriginalMember(owner = "client!fu", name = "Dc", descriptor = "I")
	private int anInt2128 = 0;

	@OriginalMember(owner = "client!fu", name = "wb", descriptor = "F")
	private float aFloat23 = 1.0F;

	@OriginalMember(owner = "client!fu", name = "Ib", descriptor = "[F")
	private final float[] aFloatArray10 = new float[4];

	@OriginalMember(owner = "client!fu", name = "Ac", descriptor = "I")
	public int anInt2126 = -1;

	@OriginalMember(owner = "client!fu", name = "bd", descriptor = "Z")
	private boolean aBoolean166 = true;

	@OriginalMember(owner = "client!fu", name = "F", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas2;

	@OriginalMember(owner = "client!fu", name = "B", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!fu", name = "y", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl2;

	@OriginalMember(owner = "client!fu", name = "ib", descriptor = "I")
	public final int anInt2099;

	@OriginalMember(owner = "client!fu", name = "Cc", descriptor = "Z")
	private boolean aBoolean158;

	@OriginalMember(owner = "client!fu", name = "Jb", descriptor = "Z")
	public boolean aBoolean151;

	@OriginalMember(owner = "client!fu", name = "Nc", descriptor = "Z")
	public boolean aBoolean161;

	@OriginalMember(owner = "client!fu", name = "Fc", descriptor = "Z")
	public boolean aBoolean159;

	@OriginalMember(owner = "client!fu", name = "Xc", descriptor = "Z")
	private boolean aBoolean165;

	@OriginalMember(owner = "client!fu", name = "ed", descriptor = "Z")
	public boolean aBoolean167;

	@OriginalMember(owner = "client!fu", name = "x", descriptor = "Lclient!sn;")
	public final Class218 aClass218_1;

	@OriginalMember(owner = "client!fu", name = "H", descriptor = "Lclient!mc;")
	private final Class155 aClass155_1;

	@OriginalMember(owner = "client!fu", name = "A", descriptor = "Lclient!qj;")
	private final Class201 aClass201_1;

	@OriginalMember(owner = "client!fu", name = "C", descriptor = "Lclient!eg;")
	private final Class2_Sub13_Sub1 aClass2_Sub13_Sub1_1;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!tq;IILclient!is;)V")
	public Class63_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class111 arg4) {
		super(arg2, arg1);
		this.aCanvas2 = arg0;
		@Pc(185) int local185 = 0;
		while (!this.aCanvas2.isShowing()) {
			if (local185++ > 5) {
				throw new RuntimeException("");
			}
			Static358.method2028(1000L);
		}
		this.aCanvas2.setIgnoreRepaint(true);
		try {
			if (Static101.aBoolean143 == null || !Static101.aBoolean143) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static101.aBoolean143 = Boolean.TRUE;
				} else {
					@Pc(219) Class182 local219 = arg4.method2815(this.getClass());
					while (local219.anInt4498 == 0) {
						Static358.method2028(100L);
					}
					if (local219.anInt4498 == 1) {
						Static101.aBoolean143 = Boolean.TRUE;
					}
				}
			}
			if (Static101.aBoolean143 == null || !Static101.aBoolean143) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas2, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method2070();
				this.anOpengl2 = this.aContext1.getGL();
				@Pc(286) int local286 = this.method2129();
				if (local286 != 0) {
					throw new RuntimeException("");
				}
				this.anInt2099 = this.aBoolean153 ? 33639 : 5121;
				@Pc(305) String local305 = this.aString21.toLowerCase();
				@Pc(309) String local309 = this.aString22.toLowerCase();
				if (local309.indexOf("radeon") != -1) {
					@Pc(316) int local316 = 0;
					@Pc(318) boolean local318 = false;
					@Pc(320) boolean local320 = false;
					@Pc(328) String[] local328 = Static104.method2176(' ', local309.replace('/', ' '));
					for (@Pc(330) int local330 = 0; local330 < local328.length; local330++) {
						@Pc(338) String local338 = local328[local330];
						try {
							if (local338.length() > 0) {
								if (local338.charAt(0) == 'x' && local338.length() >= 3 && Static34.method626(local338.substring(1, 3))) {
									local338 = local338.substring(1);
									local320 = true;
								}
								if (local338.equals("hd")) {
									local318 = true;
								} else {
									if (local338.startsWith("hd")) {
										local338 = local338.substring(2);
										local318 = true;
									}
									if (local338.length() >= 4 && Static34.method626(local338.substring(0, 4))) {
										local316 = Static189.method5666(local338.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(402) Exception local402) {
						}
					}
					if (!local320 && !local318) {
						if (local316 >= 7000 && local316 <= 7999) {
							this.aBoolean158 = false;
						}
						if (local316 >= 7000 && local316 <= 9250) {
							this.aBoolean151 = false;
						}
					}
					if (!local318 || local316 < 4000) {
						this.aBoolean161 = false;
					}
					this.aBoolean159 &= this.anOpengl2.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean165 = this.aBoolean158;
				}
				if (local305.contains("intel")) {
					this.aBoolean167 = false;
				}
				if (this.aBoolean158) {
					try {
						@Pc(460) int[] local460 = new int[1];
						this.anOpengl2.glGenBuffersARB(1, local460, 0);
					} catch (@Pc(468) Throwable local468) {
						throw new RuntimeException("", local468);
					}
				}
				this.method2077(this);
				this.method1956();
				this.method2097();
				new Class3(this);
				this.aClass218_1 = new Class218(this, this.anInterface9_3);
				Static342.method5006(true);
				this.aBoolean144 = true;
				this.aClass155_1 = new Class155(this);
				this.aClass201_1 = new Class201(this);
				this.aClass2_Sub13_Sub1_1 = new Class2_Sub13_Sub1(this);
				this.method2110();
				this.anOpengl2.glClear(16640);
				local185 = 0;
				while (true) {
					try {
						this.aContext1.swapBuffers();
						break;
					} catch (@Pc(533) Exception local533) {
						if (local185++ > 5) {
							throw new RuntimeException("");
						}
						Static358.method2028(100L);
					}
				}
				this.anOpengl2.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(552) Throwable local552) {
			local552.printStackTrace();
			this.method1980();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local552);
		}
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(III)V")
	public void method2064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!fu", name = "M", descriptor = "()V")
	public void method2065() {
		if (this.anInt2129 == 8) {
			return;
		}
		this.method2087();
		this.method2118(true);
		this.method2073(true);
		this.method2103(true);
		this.method2090(1);
		this.method2122(1);
		this.anInt2129 = 8;
	}

	@OriginalMember(owner = "client!fu", name = "F", descriptor = "()Z")
	@Override
	public boolean method2036() {
		return true;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(Z)V")
	@Override
	public void method1997(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fu", name = "N", descriptor = "()V")
	public void method2066() {
		this.anOpengl2.glLightfv(16384, 4611, this.aFloatArray13, 0);
		this.anOpengl2.glLightfv(16385, 4611, this.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "()V")
	@Override
	public void method1956() {
		this.anInt2091 = this.aCanvas2.getWidth();
		this.anInt2094 = this.aCanvas2.getHeight();
		this.anOpengl2.glViewport(this.anInt2121, this.anInt2127, this.anInt2091, this.anInt2094);
		this.method2075();
		this.method1967();
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1991(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class2_Sub14 local16;
		while (!this.aClass30_8.method684()) {
			local16 = (Class2_Sub14) this.aClass30_8.method695();
			Static101.anIntArray439[local1++] = (int) local16.aLong209;
			this.anInt2093 -= local16.anInt1455;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteBuffersARB(local1, Static101.anIntArray439, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteBuffersARB(local1, Static101.anIntArray439, 0);
			local1 = 0;
		}
		while (!this.aClass30_9.method684()) {
			local16 = (Class2_Sub14) this.aClass30_9.method695();
			Static101.anIntArray439[local1++] = (int) local16.aLong209;
			this.anInt2092 -= local16.anInt1455;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteTextures(local1, Static101.anIntArray439, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteTextures(local1, Static101.anIntArray439, 0);
			local1 = 0;
		}
		while (!this.aClass30_10.method684()) {
			local16 = (Class2_Sub14) this.aClass30_10.method695();
			Static101.anIntArray439[local1++] = local16.anInt1455;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteFramebuffersEXT(local1, Static101.anIntArray439, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteFramebuffersEXT(local1, Static101.anIntArray439, 0);
			local1 = 0;
		}
		while (!this.aClass30_11.method684()) {
			local16 = (Class2_Sub14) this.aClass30_11.method695();
			Static101.anIntArray439[local1++] = (int) local16.aLong209;
			this.anInt2096 -= local16.anInt1455;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static101.anIntArray439, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static101.anIntArray439, 0);
			local1 = 0;
		}
		while (!this.aClass30_12.method684()) {
			local16 = (Class2_Sub14) this.aClass30_12.method695();
			Static101.anIntArray439[local1++] = (int) local16.aLong209;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteProgramsARB(local1, Static101.anIntArray439, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteProgramsARB(local1, Static101.anIntArray439, 0);
		}
		while (!this.aClass30_7.method684()) {
			local16 = (Class2_Sub14) this.aClass30_7.method695();
			this.anOpengl2.glDeleteLists((int) local16.aLong209, local16.anInt1455);
		}
		while (!this.aClass30_13.method684()) {
			local16 = (Class2_Sub14) this.aClass30_13.method695();
			this.anOpengl2.glDeleteObjectARB(local16.anInt1455);
		}
		while (!this.aClass30_7.method684()) {
			local16 = (Class2_Sub14) this.aClass30_7.method695();
			this.anOpengl2.glDeleteLists((int) local16.aLong209, local16.anInt1455);
		}
		if (this.method2018() > 100663296 && Static39.method699() > this.aLong74 + 60000L) {
			System.gc();
			this.aLong74 = Static39.method699();
		}
		this.anInt2088 = local5;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)V")
	@Override
	public void method1984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2101 == arg0 && this.anInt2119 == arg1) {
			return;
		}
		this.anInt2101 = arg0;
		this.anInt2119 = arg1;
		if (!this.aBoolean147) {
			this.method2099();
			this.method2078();
		}
	}

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "(IIIIII)Lclient!rp;")
	@Override
	public Class21 method2033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean164 ? new Class21_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!fu", name = "C", descriptor = "()V")
	@Override
	public void method2022() {
		if (this.anInt2091 <= 0 && this.anInt2094 <= 0) {
			return;
		}
		@Pc(9) int local9 = this.anInt2109;
		@Pc(12) int local12 = this.anInt2103;
		@Pc(15) int local15 = this.anInt2102;
		@Pc(18) int local18 = this.anInt2124;
		this.method1967();
		this.anOpengl2.glReadBuffer(1028);
		this.anOpengl2.glDrawBuffer(1029);
		this.method2075();
		this.method2118(false);
		this.method2085(false);
		this.method2073(false);
		this.method2103(false);
		this.method2068(null);
		this.method2089();
		this.method2122(0);
		this.method2090(0);
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRasterPos2i(0, 0);
		this.anOpengl2.glCopyPixels(0, 0, this.anInt2091, this.anInt2094, 6144);
		this.anOpengl2.glFlush();
		this.anOpengl2.glReadBuffer(1029);
		this.anOpengl2.glDrawBuffer(1029);
		this.method1958(local9, local15, local12, local18);
	}

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "()Z")
	@Override
	public boolean method1966() {
		return false;
	}

	@OriginalMember(owner = "client!fu", name = "p", descriptor = "()I")
	@Override
	public int method1987() {
		@Pc(2) int local2 = this.anInt2110;
		this.anInt2110 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!fu", name = "O", descriptor = "()V")
	private void method2067() {
		@Pc(11) float local11 = (float) -this.anInt2105 * this.aFloat23 / (float) this.anInt2130;
		@Pc(23) float local23 = (float) -this.anInt2115 * this.aFloat23 / (float) this.anInt2113;
		@Pc(37) float local37 = (float) (this.anInt2091 - this.anInt2105) * this.aFloat23 / (float) this.anInt2130;
		@Pc(51) float local51 = (float) (this.anInt2094 - this.anInt2115) * this.aFloat23 / (float) this.anInt2113;
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		if (local11 != local37 && local51 != local23) {
			this.anOpengl2.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt2098 - this.aFloat38), (double) ((float) this.anInt2114 - this.aFloat38));
		}
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!gm;Z)Lclient!rn;")
	@Override
	public Class18 method2000(@OriginalArg(0) Class86 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt2411 * arg0.anInt2410];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray34 == null) {
			for (local15 = 0; local15 < arg0.anInt2410; local15++) {
				for (local21 = 0; local21 < arg0.anInt2411; local21++) {
					@Pc(74) int local74 = arg0.anIntArray455[arg0.aByteArray35[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt2410; local15++) {
				for (local21 = 0; local21 < arg0.anInt2411; local21++) {
					local6[local10++] = arg0.aByteArray34[local8] << 24 | arg0.anIntArray455[arg0.aByteArray35[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class18 local100 = this.method2029(local6, arg0.anInt2411, arg0.anInt2411, arg0.anInt2410);
		local100.method4552(arg0.anInt2408, arg0.anInt2407, arg0.anInt2409, arg0.anInt2412);
		return local100;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!tp;)V")
	public void method2068(@OriginalArg(0) Class20 arg0) {
		@Pc(5) Class20 local5 = this.aClass20Array1[this.anInt2120];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl2.glDisable(local5.anInt6331);
			} else {
				if (local5 == null) {
					this.anOpengl2.glEnable(arg0.anInt6331);
				} else if (arg0.anInt6331 != local5.anInt6331) {
					this.anOpengl2.glDisable(local5.anInt6331);
					this.anOpengl2.glEnable(arg0.anInt6331);
				}
				this.anOpengl2.glBindTexture(arg0.anInt6331, arg0.method5500());
			}
			this.aClass20Array1[this.anInt2120] = arg0;
		}
		this.anInt2129 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIIILclient!oj;II)V")
	@Override
	public void method1964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class165 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class165_Sub2 local2 = (Class165_Sub2) arg5;
		@Pc(5) Class20_Sub4_Sub1 local5 = local2.aClass20_Sub4_Sub1_5;
		this.method2135();
		this.method2068(local2.aClass20_Sub4_Sub1_5);
		this.method2090(1);
		this.method2091(7681, 8448);
		this.method2081(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat79 / (float) local5.anInt6339;
		@Pc(37) float local37 = local5.aFloat78 / (float) local5.anInt6338;
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
		this.method2081(0, 5890, 768);
	}

	@OriginalMember(owner = "client!fu", name = "P", descriptor = "()Lclient!nd;")
	public Interface5 method2069() {
		return this.anInterface5_1;
	}

	@OriginalMember(owner = "client!fu", name = "D", descriptor = "()Lclient!de;")
	@Override
	public Class44 method2024() {
		return this.aClass44_2;
	}

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "()Z")
	@Override
	public boolean method1957() {
		return true;
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(Z)V")
	@Override
	public void method2053(@OriginalArg(0) boolean arg0) {
		this.aBoolean166 = arg0;
		this.method2088();
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(IIII)V")
	@Override
	public void method1978() {
		this.aBoolean147 = true;
		this.anInt2118 = 1583160;
		this.anInt2126 = 40;
		this.anInt2108 = 127;
		this.method2099();
		this.method2078();
		this.aClass155_1.method3491(false, false, 3);
		this.aClass155_1.method3490(true, -1);
	}

	@OriginalMember(owner = "client!fu", name = "Q", descriptor = "()V")
	private void method2070() {
		@Pc(1) int local1 = 0;
		while (true) {
			try {
				if (this.aContext1.makeCurrent()) {
					return;
				}
			} catch (@Pc(8) Exception local8) {
			}
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Static358.method2028(1000L);
		}
	}

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "(I)I")
	public int method2071(@OriginalArg(0) int arg0) {
		if (arg0 == 5121 || arg0 == 5120) {
			return 1;
		} else if (arg0 == 5123 || arg0 == 5122) {
			return 2;
		} else if (arg0 == 5125 || arg0 == 5124 || arg0 == 5126) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!jj;III)V")
	public void method2072(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2136(arg0);
		arg0.method3591(arg1, arg2);
	}

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "(Z)V")
	public void method2073(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean160) {
			return;
		}
		if (arg0) {
			this.anOpengl2.glEnable(2929);
		} else {
			this.anOpengl2.glDisable(2929);
		}
		this.aBoolean160 = arg0;
		this.anInt2129 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "(I)V")
	@Override
	public void method2044(@OriginalArg(0) int arg0) {
		this.method2070();
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(IZ)V")
	public void method2074(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method2132(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass44_Sub2_1.aFloat63 * (float) arg0 + this.aClass44_Sub2_1.aFloat61 * (float) arg1 + this.aClass44_Sub2_1.aFloat58 * (float) arg2 + this.aClass44_Sub2_1.aFloat67;
		if (local24 < (float) this.anInt2098 || local24 > (float) this.anInt2114) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt2130 * (this.aClass44_Sub2_1.aFloat66 * (float) arg0 + this.aClass44_Sub2_1.aFloat57 * (float) arg1 + this.aClass44_Sub2_1.aFloat59 * (float) arg2 + this.aClass44_Sub2_1.aFloat60) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt2113 * (this.aClass44_Sub2_1.aFloat64 * (float) arg0 + this.aClass44_Sub2_1.aFloat56 * (float) arg1 + this.aClass44_Sub2_1.aFloat65 * (float) arg2 + this.aClass44_Sub2_1.aFloat62) / local24);
		if ((float) local81 >= this.aFloat32 && (float) local81 <= this.aFloat31 && (float) local113 >= this.aFloat36 && (float) local113 <= this.aFloat37) {
			arg3[0] = (int) ((float) local81 - this.aFloat32);
			arg3[1] = (int) ((float) local113 - this.aFloat36);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!fu", name = "R", descriptor = "()V")
	public void method2075() {
		if (this.anInt2100 != 0) {
			this.anInt2100 = 0;
			this.anInt2129 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(II)V")
	public synchronized void method2076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub14 local4 = new Class2_Sub14(arg1);
		local4.aLong209 = arg0;
		this.aClass30_10.method685(local4);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!nd;)V")
	public void method2077(@OriginalArg(0) Interface5 arg0) {
		if (this.anInt2090 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2090 >= 0) {
			this.anInterface5Array1[this.anInt2090].method2529();
		}
		this.anInterface5_1 = this.anInterface5Array1[++this.anInt2090] = arg0;
		this.anInterface5_1.method2528();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method2023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass20_Sub4_Sub1_2 == null || this.aClass20_Sub4_Sub1_2.anInt6337 < arg2 || this.aClass20_Sub4_Sub1_2.anInt6336 < arg3) {
			this.aClass20_Sub4_Sub1_2 = Static406.method5514(arg6, arg3, arg2, this);
			this.aClass20_Sub4_Sub1_2.method5511(false, false);
			local32 = this.aClass20_Sub4_Sub1_2.aFloat78;
			local36 = this.aClass20_Sub4_Sub1_2.aFloat79;
		} else {
			this.aClass20_Sub4_Sub1_2.method5508(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass20_Sub4_Sub1_2.aFloat78 * (float) arg3 / (float) this.aClass20_Sub4_Sub1_2.anInt6336;
			local36 = this.aClass20_Sub4_Sub1_2.aFloat79 * (float) arg2 / (float) this.aClass20_Sub4_Sub1_2.anInt6337;
		}
		this.method2135();
		this.method2068(this.aClass20_Sub4_Sub1_2);
		this.method2090(arg8);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method2131(arg5);
		this.method2091(34165, 34165);
		this.method2081(0, 34166, 768);
		this.method2081(2, 5890, 770);
		this.method2064(0, 34166);
		this.method2064(2, 5890);
		@Pc(129) float local129 = (float) arg0;
		@Pc(132) float local132 = (float) arg1;
		@Pc(137) float local137 = local129 + (float) arg2;
		@Pc(142) float local142 = local132 + (float) arg3;
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glTexCoord2f(0.0F, 0.0F);
		this.anOpengl2.glVertex2f(local129, local132);
		this.anOpengl2.glTexCoord2f(0.0F, local36);
		this.anOpengl2.glVertex2f(local129, local142);
		this.anOpengl2.glTexCoord2f(local32, local36);
		this.anOpengl2.glVertex2f(local137, local142);
		this.anOpengl2.glTexCoord2f(local32, 0.0F);
		this.anOpengl2.glVertex2f(local137, local132);
		this.anOpengl2.glEnd();
		this.method2081(0, 5890, 768);
		this.method2081(2, 34166, 770);
		this.method2064(0, 5890);
		this.method2064(2, 34166);
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method1976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2127();
		this.method2090(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!fu", name = "A", descriptor = "()I")
	@Override
	public int method2018() {
		return this.anInt2093 + this.anInt2092 + this.anInt2096;
	}

	@OriginalMember(owner = "client!fu", name = "u", descriptor = "()V")
	@Override
	public void method2001() {
		if (this.aClass2_Sub13_Sub1_1.method1183()) {
			this.aClass201_1.method4274(this.aClass2_Sub13_Sub1_1);
			this.aClass218_1.method4665();
		}
	}

	@OriginalMember(owner = "client!fu", name = "S", descriptor = "()V")
	private void method2078() {
		if (this.aBoolean150 && this.aBoolean147 | this.anInt2119 >= 0) {
			this.anOpengl2.glEnable(2912);
		} else {
			this.anOpengl2.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(Z)V")
	public void method2079(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean154) {
			this.aBoolean154 = arg0;
			this.method2124();
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "([Lclient!n;Lclient!pa;Lclient!de;[Lclient!r;I)V")
	@Override
	public void method1969(@OriginalArg(0) Class66[] arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(3) Class10_Sub7[] arg3, @OriginalArg(4) int arg4) {
		this.method2007(arg0, arg2, arg3, arg4);
		this.method1973(arg1);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!qi;IIII)Lclient!n;")
	@Override
	public Class66 method1998(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class66_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!fu", name = "s", descriptor = "()Lclient!de;")
	@Override
	public Class44 method1995() {
		return new Class44_Sub2();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!pa;)V")
	@Override
	public void method1973(@OriginalArg(0) Class186 arg0) {
		this.aClass35_1.method792(this, arg0);
	}

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "()Z")
	@Override
	public boolean method1979() {
		return true;
	}

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "()V")
	@Override
	protected void method1980() {
		if (this.anOpengl2 != null) {
			try {
				this.aClass201_1.method4273();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl2 = null;
		}
		if (this.aContext1 != null) {
			this.method2082();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean144) {
			Static6.method145(true);
			this.aBoolean144 = false;
		}
	}

	@OriginalMember(owner = "client!fu", name = "I", descriptor = "()I")
	@Override
	public int method2043() {
		@Pc(2) int local2 = this.anInt2107;
		this.anInt2107 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "(II)V")
	public synchronized void method2080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub14 local4 = new Class2_Sub14(arg1);
		local4.aLong209 = arg0;
		this.aClass30_9.method685(local4);
	}

	@OriginalMember(owner = "client!fu", name = "G", descriptor = "()I")
	@Override
	public int method2039() {
		return this.anInt2098;
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(III)V")
	public void method2081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!fu", name = "T", descriptor = "()V")
	private void method2082() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!fu", name = "U", descriptor = "()V")
	private void method2083() {
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl2.glMultMatrixf(this.aClass44_Sub2_1.method3544(), 0);
		this.method2066();
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(F)V")
	public void method2084(@OriginalArg(0) float arg0) {
		if (this.aFloat23 != arg0) {
			this.aFloat23 = arg0;
			if (this.anInt2100 == 3) {
				this.method2067();
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "(Z)V")
	public void method2085(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean145) {
			this.aBoolean145 = arg0;
			this.method2124();
			this.anInt2129 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!fu", name = "k", descriptor = "()Z")
	@Override
	public boolean method1971() {
		return !this.aBoolean155;
	}

	@OriginalMember(owner = "client!fu", name = "V", descriptor = "()V")
	public void method2086() {
		this.anOpengl2.glPopMatrix();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "([IIIII)Lclient!rn;")
	@Override
	public Class18 method2029(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class18_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!fu", name = "J", descriptor = "()V")
	@Override
	public void method2049() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!fu", name = "W", descriptor = "()V")
	public void method2087() {
		if (this.anInt2100 != 2) {
			this.anInt2100 = 2;
			this.method2126();
			this.method2083();
			this.anInt2129 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "()V")
	@Override
	public void method1952() {
		this.aClass155_1.method3491(false, false, 0);
		this.aBoolean147 = false;
		this.method2099();
		this.method2078();
	}

	@OriginalMember(owner = "client!fu", name = "X", descriptor = "()V")
	private void method2088() {
		this.anOpengl2.glDepthMask(this.aBoolean148 && this.aBoolean166);
	}

	@OriginalMember(owner = "client!fu", name = "j", descriptor = "(I)V")
	public void method2089() {
		this.method2074(-2, true);
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method1955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method2127();
		this.method2090(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean157) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local23);
		this.anOpengl2.glVertex2f(local16, local23);
		this.anOpengl2.glVertex2f(local16, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean157) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!fu", name = "k", descriptor = "(I)V")
	public void method2090(@OriginalArg(0) int arg0) {
		if (this.anInt2104 == arg0) {
			return;
		}
		@Pc(10) boolean local10;
		@Pc(12) boolean local12;
		@Pc(8) byte local8;
		if (arg0 == 1) {
			local8 = 1;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = 2;
			local10 = true;
			local12 = false;
		} else if (arg0 == 128) {
			local8 = 2;
			local10 = false;
			local12 = true;
		} else if (arg0 == 129) {
			local8 = 3;
			local10 = false;
			local12 = true;
		} else if (arg0 == 130) {
			local8 = 4;
			local10 = true;
			local12 = true;
		} else {
			local8 = 0;
			local10 = true;
			local12 = false;
		}
		if (local10 != this.aBoolean146) {
			this.anOpengl2.glColorMask(local10, local10, local10, true);
			this.aBoolean146 = local10;
		}
		if (local12 != this.aBoolean156) {
			if (local12) {
				this.anOpengl2.glEnable(3008);
			} else {
				this.anOpengl2.glDisable(3008);
			}
			this.aBoolean156 = local12;
		}
		if (local8 != this.anInt2123) {
			if (local8 == 1) {
				this.anOpengl2.glEnable(3042);
				this.anOpengl2.glBlendEquation(32774);
				this.anOpengl2.glBlendFunc(770, 771);
			} else if (local8 == 2) {
				this.anOpengl2.glEnable(3042);
				this.anOpengl2.glBlendEquation(32774);
				this.anOpengl2.glBlendFunc(1, 1);
			} else if (local8 == 3) {
				this.anOpengl2.glEnable(3042);
				this.anOpengl2.glBlendEquation(32778);
				this.anOpengl2.glBlendFunc(1, 1);
			} else if (local8 == 4) {
				this.anOpengl2.glEnable(3042);
				this.anOpengl2.glBlendEquation(32774);
				this.anOpengl2.glBlendFunc(774, 1);
			} else {
				this.anOpengl2.glDisable(3042);
			}
			this.anInt2123 = local8;
		}
		this.anInt2104 = arg0;
		this.anInt2129 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(II)V")
	@Override
	public void method2047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2098 == arg0 && this.anInt2114 == arg1) {
			return;
		}
		this.anInt2098 = arg0;
		this.anInt2114 = arg1;
		this.method2107();
		this.method2099();
		if (this.anInt2100 == 3) {
			this.method2067();
		} else if (this.anInt2100 == 2) {
			this.method2126();
		}
	}

	@OriginalMember(owner = "client!fu", name = "j", descriptor = "()V")
	@Override
	public void method1968() {
		this.aClass201_1.method4271();
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(IIIII)V")
	@Override
	protected void method2026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "(II)V")
	public void method2091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2120 != 0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt2122 != arg0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anInt2122 = arg0;
			local4 = true;
		}
		if (this.anInt2111 != arg1) {
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			this.anInt2111 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt2129 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "()I")
	@Override
	public int method2530() {
		return this.anInt2094;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(II)I")
	@Override
	public int method2031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!fu", name = "Y", descriptor = "()V")
	private void method2092() {
		if (this.aBoolean163) {
			this.anOpengl2.glMatrixMode(5890);
			this.anOpengl2.glLoadIdentity();
			this.anOpengl2.glMatrixMode(5888);
			this.aBoolean163 = false;
		}
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(I)V")
	@Override
	public void method2004(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "()V")
	@Override
	public void method2529() {
	}

	@OriginalMember(owner = "client!fu", name = "Z", descriptor = "()Lclient!bl;")
	public Class20_Sub1 method2093() {
		return this.aClass21_Sub1_1 == null ? null : this.aClass21_Sub1_1.method4646();
	}

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "()V")
	@Override
	public void method1967() {
		this.anInt2109 = 0;
		this.anInt2102 = 0;
		this.anInt2103 = this.anInt2091;
		this.anInt2124 = this.anInt2094;
		this.anOpengl2.glDisable(3089);
		this.method2105();
	}

	@OriginalMember(owner = "client!fu", name = "l", descriptor = "(I)V")
	public synchronized void method2094(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub14 local4 = new Class2_Sub14(arg0);
		this.aClass30_13.method685(local4);
	}

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "(II)I")
	@Override
	public int method2051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(FFF)V")
	@Override
	public void method1988(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static73.aFloat3 = arg0;
		Static73.aFloat4 = arg1;
		Static73.aFloat5 = arg2;
	}

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(IIIIII)Z")
	@Override
	public boolean method1983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass44_Sub2_1.aFloat63 * (float) arg0 + this.aClass44_Sub2_1.aFloat61 * (float) arg1 + this.aClass44_Sub2_1.aFloat58 * (float) arg2 + this.aClass44_Sub2_1.aFloat67;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass44_Sub2_1.aFloat63 * (float) arg3 + this.aClass44_Sub2_1.aFloat61 * (float) arg4 + this.aClass44_Sub2_1.aFloat58 * (float) arg5 + this.aClass44_Sub2_1.aFloat67;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt2098 && local55 < (float) this.anInt2098 || !(!(local24 > (float) this.anInt2114) || !(local55 > (float) this.anInt2114))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt2130 * (this.aClass44_Sub2_1.aFloat66 * (float) arg0 + this.aClass44_Sub2_1.aFloat57 * (float) arg1 + this.aClass44_Sub2_1.aFloat59 * (float) arg2 + this.aClass44_Sub2_1.aFloat60) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt2130 * (this.aClass44_Sub2_1.aFloat66 * (float) arg3 + this.aClass44_Sub2_1.aFloat57 * (float) arg4 + this.aClass44_Sub2_1.aFloat59 * (float) arg5 + this.aClass44_Sub2_1.aFloat60) / local55);
		if ((float) local119 < this.aFloat32 && (float) local151 < this.aFloat32 || (float) local119 > this.aFloat31 && (float) local151 > this.aFloat31) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt2113 * (this.aClass44_Sub2_1.aFloat64 * (float) arg0 + this.aClass44_Sub2_1.aFloat56 * (float) arg1 + this.aClass44_Sub2_1.aFloat65 * (float) arg2 + this.aClass44_Sub2_1.aFloat62) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt2113 * (this.aClass44_Sub2_1.aFloat64 * (float) arg3 + this.aClass44_Sub2_1.aFloat56 * (float) arg4 + this.aClass44_Sub2_1.aFloat65 * (float) arg5 + this.aClass44_Sub2_1.aFloat62) / local55);
			return (!((float) local209 < this.aFloat36) || !((float) local241 < this.aFloat36)) && (!((float) local209 > this.aFloat37) || !((float) local241 > this.aFloat37));
		}
	}

	@OriginalMember(owner = "client!fu", name = "ab", descriptor = "()V")
	private void method2095() {
		Static101.aFloatArray7[0] = this.aFloat27 * this.aFloat30;
		Static101.aFloatArray7[1] = this.aFloat27 * this.aFloat22;
		Static101.aFloatArray7[2] = this.aFloat27 * this.aFloat35;
		Static101.aFloatArray7[3] = 1.0F;
		this.anOpengl2.glLightfv(16384, 4609, Static101.aFloatArray7, 0);
		Static101.aFloatArray7[0] = -this.aFloat26 * this.aFloat30;
		Static101.aFloatArray7[1] = -this.aFloat26 * this.aFloat22;
		Static101.aFloatArray7[2] = -this.aFloat26 * this.aFloat35;
		Static101.aFloatArray7[3] = 1.0F;
		this.anOpengl2.glLightfv(16385, 4609, Static101.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILclient!oj;II)V")
	@Override
	public void method1977(@OriginalArg(1) Class165 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class165_Sub2 local2 = (Class165_Sub2) arg0;
		@Pc(5) Class20_Sub4_Sub1 local5 = local2.aClass20_Sub4_Sub1_5;
		this.method2135();
		this.method2068(local2.aClass20_Sub4_Sub1_5);
		this.method2090(1);
		this.method2091(7681, 8448);
		this.method2081(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat79 / (float) local5.anInt6339;
		@Pc(37) float local37 = local5.aFloat78 / (float) local5.anInt6338;
		this.anOpengl2.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt2109 - arg1), local37 * (float) (this.anInt2102 - arg2));
		this.anOpengl2.glVertex2i(this.anInt2109, this.anInt2102);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt2109 - arg1), local37 * (float) (this.anInt2124 - arg2));
		this.anOpengl2.glVertex2i(this.anInt2109, this.anInt2124);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt2103 - arg1), local37 * (float) (this.anInt2124 - arg2));
		this.anOpengl2.glVertex2i(this.anInt2103, this.anInt2124);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt2103 - arg1), local37 * (float) (this.anInt2102 - arg2));
		this.anOpengl2.glVertex2i(this.anInt2103, this.anInt2102);
		this.anOpengl2.glEnd();
		this.method2081(0, 5890, 768);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!kg;[Lclient!gm;Z)Lclient!am;")
	@Override
	public Class9 method2034(@OriginalArg(0) Class136 arg0, @OriginalArg(1) Class86[] arg1) {
		return new Class9_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!fu", name = "bb", descriptor = "()V")
	private void method2096() {
		Static101.aFloatArray7[0] = this.aFloat25 * this.aFloat30;
		Static101.aFloatArray7[1] = this.aFloat25 * this.aFloat22;
		Static101.aFloatArray7[2] = this.aFloat25 * this.aFloat35;
		Static101.aFloatArray7[3] = 1.0F;
		this.anOpengl2.glLightModelfv(2899, Static101.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!fu", name = "w", descriptor = "()I")
	@Override
	public int method2003() {
		return this.anInt2114;
	}

	@OriginalMember(owner = "client!fu", name = "cb", descriptor = "()V")
	private void method2097() {
		this.aClass44_Sub2_1 = new Class44_Sub2();
		this.aClass44_Sub2_2 = new Class44_Sub2();
		this.aClass20Array1 = new Class20[this.anInt2117];
		this.aClass20_Sub4_3 = new Class20_Sub4(this, 3553, 6408, 1, 1);
		this.aClass20_Sub4_4 = new Class20_Sub4(this, 3553, 6408, 1, 1);
		this.aClass20_Sub4_5 = new Class20_Sub4(this, 3553, 6408, 1, 1);
		this.aClass66_Sub1_2 = new Class66_Sub1(this);
		this.aClass66_Sub1_8 = new Class66_Sub1(this);
		this.aClass66_Sub1_3 = new Class66_Sub1(this);
		this.aClass66_Sub1_4 = new Class66_Sub1(this);
		this.aClass66_Sub1_6 = new Class66_Sub1(this);
		this.aClass66_Sub1_1 = new Class66_Sub1(this);
		this.aClass66_Sub1_7 = new Class66_Sub1(this);
		this.aClass66_Sub1_5 = new Class66_Sub1(this);
		if (this.aBoolean167) {
			this.aClass99_3 = new Class99(this);
		}
		this.aClass35_1.method790(this);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(FFFF)V")
	public void method2098(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static101.aFloatArray7[0] = arg0;
		Static101.aFloatArray7[1] = arg1;
		Static101.aFloatArray7[2] = arg2;
		Static101.aFloatArray7[3] = arg3;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static101.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!fu", name = "db", descriptor = "()V")
	private void method2099() {
		@Pc(15) int local15;
		if (this.aBoolean147) {
			this.anOpengl2.glFogf(2915, 0.0F);
			this.anOpengl2.glFogf(2916, 1.0F);
			local15 = this.anInt2118;
		} else {
			this.aFloat33 = (float) (this.anInt2114 - 256) - this.aFloat29;
			this.aFloat34 = this.aFloat33 - (float) this.anInt2119 * this.aFloat28;
			if (this.aFloat34 < (float) this.anInt2098) {
				this.aFloat34 = this.anInt2098;
			}
			this.anOpengl2.glFogf(2915, this.aFloat34);
			this.anOpengl2.glFogf(2916, this.aFloat33);
			local15 = this.anInt2101;
		}
		Static101.aFloatArray7[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static101.aFloatArray7[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static101.aFloatArray7[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl2.glFogfv(2918, Static101.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)V")
	@Override
	public void method2020(@OriginalArg(0) int arg0) {
		this.method2090(0);
		this.anOpengl2.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl2.glClear(16384);
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method2015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2127();
		this.method2090(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!fu", name = "y", descriptor = "()Z")
	@Override
	public boolean method2012() {
		return this.aClass155_1.method3489();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!hb;)V")
	@Override
	public void method2014(@OriginalArg(0) Class2_Sub20 arg0) {
	}

	@OriginalMember(owner = "client!fu", name = "r", descriptor = "()Z")
	@Override
	public boolean method1994() {
		return this.aClass2_Sub13_Sub1_1.method1193();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(FF)V")
	@Override
	public void method2030(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat20 && arg1 == this.aFloat38) {
			return;
		}
		this.aFloat20 = arg0;
		this.aFloat38 = arg1;
		this.method2111();
		if (this.anInt2100 == 3) {
			this.method2067();
		} else if (this.anInt2100 == 2) {
			this.method2126();
		}
	}

	@OriginalMember(owner = "client!fu", name = "l", descriptor = "()Z")
	@Override
	public boolean method1974() {
		return this.aClass2_Sub13_Sub1_1.method1183();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I[BIZ)Lclient!jj;")
	public Interface3 method2100(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface3) (this.aBoolean158 && (!arg2 || this.aBoolean165) ? new Class92_Sub2(this, 5123, arg0, arg1, arg2) : new Class23_Sub1(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "(I)I")
	public int method2101(@OriginalArg(0) int arg0) {
		if (arg0 == 6406 || arg0 == 6409) {
			return 1;
		} else if (arg0 == 6410 || arg0 == 34846 || arg0 == 34844) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408 || arg0 == 34847) {
			return 4;
		} else if (arg0 == 34843) {
			return 6;
		} else if (arg0 == 34842) {
			return 8;
		} else if (arg0 == 6402) {
			return 3;
		} else if (arg0 == 6401) {
			return 1;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "(IIII)V")
	@Override
	public void method2054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass201_1.method4272(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "(IIII)[I")
	@Override
	public int[] method2010() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl2.glReadPixels(0, this.anInt2094 - local6, 36, 1, 32993, this.anInt2099, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!n;Lclient!pa;Lclient!de;Lclient!r;I)V")
	@Override
	public void method2055(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(3) Class10_Sub7 arg3) {
		arg0.method5126(arg2, arg3, 0);
		this.method1973(arg1);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!mi;)V")
	public void method2102(@OriginalArg(0) Class44_Sub2 arg0) {
		this.anOpengl2.glPushMatrix();
		this.anOpengl2.glMultMatrixf(arg0.method3544(), 0);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2040() {
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method1960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2127();
		this.method2090(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "(Z)V")
	public void method2103(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean148) {
			this.aBoolean148 = arg0;
			this.method2088();
			this.anInt2129 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)V")
	@Override
	public void method1992(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fu", name = "L", descriptor = "()Z")
	@Override
	public boolean method2057() {
		return true;
	}

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "(I)V")
	@Override
	public void method2042(@OriginalArg(0) int arg0) {
		this.method2082();
	}

	@OriginalMember(owner = "client!fu", name = "eb", descriptor = "()V")
	private void method2104() {
		if (this.anInt2109 <= this.anInt2103 && this.anInt2102 <= this.anInt2124) {
			this.anOpengl2.glScissor(this.anInt2121 + this.anInt2109, this.anInt2127 + this.anInt2094 - this.anInt2124, this.anInt2103 - this.anInt2109, this.anInt2124 - this.anInt2102);
		} else {
			this.anOpengl2.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method1981(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method2049();
	}

	@OriginalMember(owner = "client!fu", name = "fb", descriptor = "()V")
	private void method2105() {
		this.aFloat32 = this.anInt2109 - this.anInt2105;
		this.aFloat31 = this.anInt2103 - this.anInt2105;
		this.aFloat36 = this.anInt2102 - this.anInt2115;
		this.aFloat37 = this.anInt2124 - this.anInt2115;
	}

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "(II)V")
	public void method2106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2121 = arg0;
		this.anInt2127 = arg1;
		this.anOpengl2.glViewport(arg0, arg1, this.anInt2091, this.anInt2094);
		this.method2104();
	}

	@OriginalMember(owner = "client!fu", name = "gb", descriptor = "()V")
	private void method2107() {
		@Pc(2) float[] local2 = this.aFloatArray11;
		@Pc(14) float local14 = (float) (-this.anInt2105 * this.anInt2098) / (float) this.anInt2130;
		@Pc(28) float local28 = (float) ((this.anInt2091 - this.anInt2105) * this.anInt2098) / (float) this.anInt2130;
		@Pc(39) float local39 = (float) (this.anInt2115 * this.anInt2098) / (float) this.anInt2113;
		@Pc(53) float local53 = (float) ((this.anInt2115 - this.anInt2094) * this.anInt2098) / (float) this.anInt2113;
		if (local14 == local28 || local39 == local53) {
			local2[0] = 1.0F;
			local2[1] = 0.0F;
			local2[2] = 0.0F;
			local2[3] = 0.0F;
			local2[4] = 0.0F;
			local2[5] = 1.0F;
			local2[6] = 0.0F;
			local2[7] = 0.0F;
			local2[8] = 0.0F;
			local2[9] = 0.0F;
			local2[10] = 1.0F;
			local2[11] = 0.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = 0.0F;
			local2[15] = 1.0F;
		} else {
			@Pc(67) float local67 = (float) this.anInt2098 * 2.0F;
			local2[0] = local67 / (local28 - local14);
			local2[1] = 0.0F;
			local2[2] = 0.0F;
			local2[3] = 0.0F;
			local2[4] = 0.0F;
			local2[5] = local67 / (local39 - local53);
			local2[6] = 0.0F;
			local2[7] = 0.0F;
			local2[8] = (local28 + local14) / (local28 - local14);
			local2[9] = (local39 + local53) / (local39 - local53);
			local2[10] = this.aFloat18 = (float) -(this.anInt2114 + this.anInt2098) / (float) (this.anInt2114 - this.anInt2098);
			local2[11] = -1.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = this.aFloat21 = -(local67 * (float) this.anInt2114) / (float) (this.anInt2114 - this.anInt2098);
			local2[15] = 0.0F;
		}
		this.method2111();
	}

	@OriginalMember(owner = "client!fu", name = "hb", descriptor = "()V")
	public void method2108() {
		if (this.anInt2129 == 16) {
			return;
		}
		this.method2120();
		this.method2118(true);
		this.method2073(true);
		this.method2103(true);
		this.method2090(1);
		this.method2122(1);
		this.anInt2129 = 16;
	}

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "(I)I")
	public int method2109(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return 7681;
		} else if (arg0 == 1) {
			return 8448;
		} else if (arg0 == 2) {
			return 34165;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fu", name = "ib", descriptor = "()V")
	private void method2110() {
		this.method2089();
		for (@Pc(7) int local7 = this.anInt2117 - 1; local7 >= 0; local7--) {
			this.method2115(local7);
			this.method2068(null);
			this.anOpengl2.glTexEnvi(8960, 8704, 34160);
		}
		this.method2091(8448, 8448);
		this.method2081(2, 34168, 770);
		this.method2092();
		this.anInt2104 = 1;
		this.anOpengl2.glEnable(3042);
		this.anOpengl2.glBlendFunc(770, 771);
		this.anInt2123 = 1;
		this.anOpengl2.glEnable(3008);
		this.anOpengl2.glAlphaFunc(516, 0.0F);
		this.aBoolean156 = true;
		this.anOpengl2.glColorMask(true, true, true, true);
		this.aBoolean146 = true;
		this.method2118(true);
		this.method2085(true);
		this.method2073(true);
		this.method2103(true);
		this.method2075();
		this.anOpengl2.setSwapInterval(0);
		this.anOpengl2.glShadeModel(7425);
		this.anOpengl2.glClearDepth(1.0F);
		this.anOpengl2.glDepthFunc(515);
		this.anOpengl2.glPolygonMode(1028, 6914);
		this.anOpengl2.glEnable(2884);
		this.anOpengl2.glCullFace(1029);
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glColorMaterial(1028, 5634);
		this.anOpengl2.glEnable(2903);
		@Pc(149) float[] local149 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(151) int local151 = 0; local151 < 8; local151++) {
			@Pc(158) int local158 = local151 + 16384;
			this.anOpengl2.glLightfv(local158, 4608, local149, 0);
			this.anOpengl2.glLightf(local158, 4615, 0.0F);
			this.anOpengl2.glLightf(local158, 4616, 0.0F);
		}
		this.anOpengl2.glEnable(16384);
		this.anOpengl2.glEnable(16385);
		this.anOpengl2.glFogf(2914, 0.95F);
		this.anOpengl2.glFogi(2917, 9729);
		this.anOpengl2.glHint(3156, 4353);
		this.anInt2125 = this.anInt2101 = -1;
		this.method1967();
	}

	@OriginalMember(owner = "client!fu", name = "jb", descriptor = "()V")
	private void method2111() {
		if (this.aFloat38 == 0.0F) {
			this.aFloatArray11[10] = this.aFloat18;
			this.aFloatArray11[14] = this.aFloat21;
		} else {
			@Pc(13) float local13 = this.aFloat20 / (this.aFloat38 + this.aFloat20);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat21 * (1.0F - local13) * (1.0F - local13) / this.aFloat38;
			this.aFloatArray11[10] = this.aFloat18 + local32;
			this.aFloatArray11[14] = this.aFloat21 * local17;
		}
		this.aFloat24 = (this.aFloatArray11[14] - (float) this.anInt2114) / this.aFloatArray11[10];
		this.aFloat19 = (float) this.anInt2114 - this.aFloat38;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(I[BIZ)Lclient!pc;")
	public Interface6 method2112(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface6) (this.aBoolean158 && (!arg3 || this.aBoolean165) ? new Class92_Sub1(this, arg0, arg1, arg2, arg3) : new Class23_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II[I[I)Lclient!oj;")
	@Override
	public Class165 method2017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static405.method4897(arg0, arg1, arg2, arg3, this);
	}

	@OriginalMember(owner = "client!fu", name = "q", descriptor = "()I")
	@Override
	public int method1990() {
		return 4;
	}

	@OriginalMember(owner = "client!fu", name = "v", descriptor = "()F")
	@Override
	public float method2002() {
		return this.aFloat20;
	}

	@OriginalMember(owner = "client!fu", name = "kb", descriptor = "()V")
	public void method2113() {
		if (this.anInt2129 == 4) {
			return;
		}
		this.method2116();
		this.method2118(false);
		this.method2085(false);
		this.method2073(false);
		this.method2103(false);
		this.method2089();
		this.method2090(1);
		this.method2122(1);
		this.anInt2129 = 4;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!fm;Lclient!fm;Lclient!fm;Lclient!fm;)V")
	public void method2114(@OriginalArg(0) Class72 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) Class72 arg3) {
		if (arg0 == null) {
			this.anOpengl2.glDisableClientState(32884);
		} else {
			this.anOpengl2.glEnableClientState(32884);
			arg0.method1868();
		}
		if (arg1 == null) {
			this.anOpengl2.glDisableClientState(32885);
		} else {
			this.anOpengl2.glEnableClientState(32885);
			arg1.method1867();
		}
		if (arg2 == null) {
			this.anOpengl2.glDisableClientState(32886);
		} else {
			this.anOpengl2.glEnableClientState(32886);
			arg2.method1866();
		}
		if (arg3 == null) {
			this.anOpengl2.glDisableClientState(32888);
		} else {
			this.anOpengl2.glEnableClientState(32888);
			arg3.method1869();
		}
	}

	@OriginalMember(owner = "client!fu", name = "o", descriptor = "(I)V")
	public void method2115(@OriginalArg(0) int arg0) {
		if (this.anInt2120 != arg0) {
			this.anOpengl2.glActiveTexture(arg0 + 33984);
			this.anInt2120 = arg0;
		}
	}

	@OriginalMember(owner = "client!fu", name = "lb", descriptor = "()V")
	private void method2116() {
		if (this.anInt2100 == 1) {
			return;
		}
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		if (this.anInt2091 > 0 && this.anInt2094 > 0) {
			this.anOpengl2.glOrtho(0.0D, (double) this.anInt2091, (double) this.anInt2094, 0.0D, -1.0D, 1.0D);
		}
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anInt2100 = 1;
		this.anInt2129 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "([I)V")
	@Override
	public void method1962(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2109;
		arg0[1] = this.anInt2102;
		arg0[2] = this.anInt2103;
		arg0[3] = this.anInt2124;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!rp;Lclient!rp;FLclient!rp;)Lclient!rp;")
	@Override
	public Class21 method2016(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class21 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean164 && this.aBoolean167) {
			@Pc(11) Class21_Sub1_Sub1 local11 = null;
			@Pc(14) Class21_Sub1 local14 = (Class21_Sub1) arg0;
			@Pc(17) Class21_Sub1 local17 = (Class21_Sub1) arg1;
			@Pc(21) Class20_Sub1 local21 = local14.method4646();
			@Pc(25) Class20_Sub1 local25 = local17.method4646();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt628 > local25.anInt628 ? local21.anInt628 : local25.anInt628;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class21_Sub1_Sub1) {
					@Pc(52) Class21_Sub1_Sub1 local52 = (Class21_Sub1_Sub1) arg3;
					if (local52.method4177() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class21_Sub1_Sub1(this, local40);
				}
				local11.method4178(arg2, local21, local25);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!pc;)V")
	public void method2117(@OriginalArg(0) Interface6 arg0) {
		if (this.anInterface6_5 != arg0 && this.aBoolean158) {
			this.anOpengl2.glBindBufferARB(34962, arg0.method3588());
			this.anInterface6_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "(Z)V")
	public void method2118(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean150) {
			this.aBoolean150 = arg0;
			this.method2078();
			this.anInt2129 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(Lclient!nd;)V")
	public void method2119(@OriginalArg(0) Interface5 arg0) {
		if (this.anInt2090 < 0 || this.anInterface5Array1[this.anInt2090] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface5Array1[this.anInt2090--] = null;
		arg0.method2529();
		if (this.anInt2090 >= 0) {
			this.anInterface5_1 = this.anInterface5Array1[this.anInt2090];
			this.anInterface5_1.method2528();
		}
	}

	@OriginalMember(owner = "client!fu", name = "K", descriptor = "()F")
	@Override
	public float method2056() {
		return this.aFloat38;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(F)V")
	@Override
	public void method1959(@OriginalArg(0) float arg0) {
		if (this.aFloat25 != arg0) {
			this.aFloat25 = arg0;
			this.method2096();
		}
	}

	@OriginalMember(owner = "client!fu", name = "mb", descriptor = "()V")
	private void method2120() {
		if (this.anInt2100 != 3) {
			this.anInt2100 = 3;
			this.method2067();
			this.method2083();
			this.anInt2129 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!fu", name = "H", descriptor = "()V")
	@Override
	public void method2041() {
		this.method2103(true);
		this.anOpengl2.glClear(256);
	}

	@OriginalMember(owner = "client!fu", name = "p", descriptor = "(I)V")
	public synchronized void method2121(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub14 local4 = new Class2_Sub14(arg0);
		this.aClass30_10.method685(local4);
	}

	@OriginalMember(owner = "client!fu", name = "x", descriptor = "()Z")
	@Override
	public boolean method2005() {
		return false;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method2038(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2125 != arg0;
		if (local7 || this.aFloat27 != arg1 || this.aFloat26 != arg2) {
			this.anInt2125 = arg0;
			this.aFloat27 = arg1;
			this.aFloat26 = arg2;
			if (local7) {
				this.aFloat30 = (float) (this.anInt2125 & 0xFF0000) / 1.671168E7F;
				this.aFloat22 = (float) (this.anInt2125 & 0xFFFF) / 65535.0F;
				this.aFloat35 = (float) (this.anInt2125 & 0xFF) / 255.0F;
				this.method2096();
			}
			this.method2095();
		}
		if (this.aFloatArray9[0] == arg3 && this.aFloatArray9[1] == arg4 && this.aFloatArray9[2] == arg5) {
			return;
		}
		this.aFloatArray9[0] = arg3;
		this.aFloatArray9[1] = arg4;
		this.aFloatArray9[2] = arg5;
		this.aFloatArray10[0] = -arg3;
		this.aFloatArray10[1] = -arg4;
		this.aFloatArray10[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray13[0] = arg3 * local132;
		this.aFloatArray13[1] = arg4 * local132;
		this.aFloatArray13[2] = arg5 * local132;
		this.aFloatArray12[0] = -this.aFloatArray13[0];
		this.aFloatArray12[1] = -this.aFloatArray13[1];
		this.aFloatArray12[2] = -this.aFloatArray13[2];
		this.method2066();
		this.anInt2097 = (int) (arg3 * 256.0F / arg4);
		this.anInt2112 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!fu", name = "q", descriptor = "(I)V")
	public void method2122(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2091(7681, 7681);
		} else if (arg0 == 1) {
			this.method2091(8448, 8448);
		} else if (arg0 == 2) {
			this.method2091(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!fu", name = "r", descriptor = "(I)V")
	public synchronized void method2123(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub14 local4 = new Class2_Sub14(arg0);
		this.aClass30_12.method685(local4);
	}

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(IIII)V")
	@Override
	public void method2009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean147) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt2118 = arg1;
		this.anInt2126 = arg2;
		this.anInt2108 = arg3;
		this.method2099();
		this.aClass155_1.method3490(true, arg0);
	}

	@OriginalMember(owner = "client!fu", name = "nb", descriptor = "()V")
	private void method2124() {
		if (this.aBoolean145 && !this.aBoolean154) {
			this.anOpengl2.glEnable(2896);
		} else {
			this.anOpengl2.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "(II)V")
	public synchronized void method2125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub14 local4 = new Class2_Sub14(arg1);
		local4.aLong209 = arg0;
		this.aClass30_8.method685(local4);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "()V")
	@Override
	public void method2528() {
	}

	@OriginalMember(owner = "client!fu", name = "ob", descriptor = "()V")
	private void method2126() {
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadMatrixf(this.aFloatArray11, 0);
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!fu", name = "pb", descriptor = "()V")
	private void method2127() {
		if (this.anInt2129 == 1) {
			return;
		}
		this.method2116();
		this.method2118(false);
		this.method2085(false);
		this.method2073(false);
		this.method2103(false);
		this.method2068(null);
		this.method2089();
		this.method2122(0);
		this.anInt2129 = 1;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIZ)Lclient!rn;")
	@Override
	public Class18 method2046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class18_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(FFF)V")
	private void method2128(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl2.glMatrixMode(5890);
		if (this.aBoolean163) {
			this.anOpengl2.glLoadIdentity();
		}
		this.anOpengl2.glTranslatef(arg0, arg1, arg2);
		this.anOpengl2.glMatrixMode(5888);
		this.aBoolean163 = true;
	}

	@OriginalMember(owner = "client!fu", name = "o", descriptor = "()Z")
	@Override
	public boolean method1986() {
		return this.aBoolean157;
	}

	@OriginalMember(owner = "client!fu", name = "z", descriptor = "()Z")
	@Override
	public boolean method2013() {
		return false;
	}

	@OriginalMember(owner = "client!fu", name = "qb", descriptor = "()I")
	private int method2129() {
		@Pc(1) int local1 = 0;
		this.aString21 = this.anOpengl2.glGetString(7936);
		this.aString22 = this.anOpengl2.glGetString(7937);
		@Pc(17) String local17 = this.aString21.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl2.glGetString(7938);
		@Pc(53) String[] local53 = Static104.method2176(' ', local45.replace('.', ' '));
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static189.method5666(local53[0]);
				@Pc(69) int local69 = Static189.method5666(local53[1]);
				this.lb = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.lb < 12) {
			local1 |= 0x2;
		}
		if (!this.anOpengl2.isExtensionAvailable("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!this.anOpengl2.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(116) int[] local116 = new int[1];
		this.anOpengl2.glGetIntegerv(34018, local116, 0);
		this.anInt2117 = local116[0];
		this.anOpengl2.glGetIntegerv(34929, local116, 0);
		this.anInt2106 = local116[0];
		this.anOpengl2.glGetIntegerv(34930, local116, 0);
		this.anInt2116 = local116[0];
		if (this.anInt2117 < 2 || this.anInt2106 < 2 || this.anInt2116 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean155 = Static152.aString35 != null && Static152.aString35.startsWith("mac");
		this.aBoolean153 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean158 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean157 = this.anOpengl2.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean152 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean162 = this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean151 = this.anOpengl2.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean159 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean164 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean161 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean149 = false;
		this.aBoolean167 = this.anOpengl2.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!pc;")
	public Interface6 method2130(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface6) (this.aBoolean158 ? new Class92_Sub1(this, arg0, arg1, false) : new Class23_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method1993(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fu", name = "s", descriptor = "(I)V")
	public void method2131(@OriginalArg(0) int arg0) {
		Static101.aFloatArray7[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static101.aFloatArray7[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static101.aFloatArray7[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static101.aFloatArray7[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static101.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "([Lclient!n;Lclient!de;[Lclient!r;I)V")
	@Override
	public void method2007(@OriginalArg(0) Class66[] arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) Class10_Sub7[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method5126(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method1982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method2127();
		this.method2090(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean157) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local19);
		this.anOpengl2.glVertex2f(local14, local19);
		this.anOpengl2.glVertex2f(local14, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean157) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I[Lclient!nq;)V")
	@Override
	public void method2011(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub17[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class2_Sub17 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static101.aFloatArray8[0] = local8.anInt2042;
			Static101.aFloatArray8[1] = local8.anInt2041;
			Static101.aFloatArray8[2] = local8.anInt2037;
			Static101.aFloatArray8[3] = 1.0F;
			this.anOpengl2.glLightfv(local12, 4611, Static101.aFloatArray8, 0);
			@Pc(44) int local44 = local8.anInt2040;
			@Pc(49) float local49 = local8.aFloat17 / 255.0F;
			Static101.aFloatArray8[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static101.aFloatArray8[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static101.aFloatArray8[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl2.glLightfv(local12, 4609, Static101.aFloatArray8, 0);
			this.anOpengl2.glLightf(local12, 4617, 1.0F / (float) (local8.anInt2043 * local8.anInt2043));
			this.anOpengl2.glEnable(local12);
		}
		while (local1 < this.anInt2128) {
			this.anOpengl2.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt2128 = arg0;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IZZ)V")
	public void method2132(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt2131) {
			if (arg0 < 0) {
				this.method2092();
				this.method2068(null);
				if (!this.aBoolean147) {
					this.aClass155_1.method3491(arg1, arg2, 0);
				}
			} else {
				@Pc(11) Class20_Sub4 local11 = this.aClass218_1.method4664(arg0);
				@Pc(17) Class132 local17 = this.anInterface9_3.method139(arg0);
				if (local17.aByte31 == 0 && local17.aByte29 == 0) {
					this.method2092();
				} else {
					@Pc(30) int local30 = local17.aBoolean249 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method2128((float) (this.anInt2088 % local34 * local17.aByte31) / (float) local34, (float) (this.anInt2088 % local34 * local17.aByte29) / (float) local34, 0.0F);
				}
				if (this.aBoolean147) {
					this.aClass155_1.method3491(arg1, arg2, 3);
					this.method2068(local11);
				} else {
					this.aClass155_1.method3491(arg1, arg2, local17.aByte33);
					this.aClass155_1.method3490(false, local17.aByte35);
					if (!this.aClass155_1.method3492(local11)) {
						this.method2068(local11);
					}
				}
			}
			this.anInt2131 = arg0;
		}
		this.anInt2129 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "(III)V")
	public void method2133(@OriginalArg(2) int arg0) {
		this.anOpengl2.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method1963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl2.glLineWidth((float) arg5);
		this.method1976(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl2.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "(IIII)V")
	@Override
	public void method2008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2109 < arg0) {
			this.anInt2109 = arg0;
		}
		if (this.anInt2103 > arg2) {
			this.anInt2103 = arg2;
		}
		if (this.anInt2102 < arg1) {
			this.anInt2102 = arg1;
		}
		if (this.anInt2124 > arg3) {
			this.anInt2124 = arg3;
		}
		this.anOpengl2.glEnable(3089);
		this.method2105();
		this.method2104();
	}

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)Lclient!hb;")
	@Override
	public Class2_Sub20 method2037() {
		return null;
	}

	@OriginalMember(owner = "client!fu", name = "t", descriptor = "()Z")
	@Override
	public boolean method1996() {
		if (!this.aClass2_Sub13_Sub1_1.method1183()) {
			if (!this.aClass201_1.method4268(this.aClass2_Sub13_Sub1_1)) {
				return false;
			}
			this.aClass218_1.method4665();
		}
		return true;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!rp;)V")
	@Override
	public void method1989(@OriginalArg(0) Class21 arg0) {
		this.aClass21_Sub1_1 = (Class21_Sub1) arg0;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(FF)V")
	public void method2134(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat28 = arg0;
		this.aFloat29 = arg1;
		if (!this.aBoolean147) {
			this.method2099();
		}
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(IIII)V")
	@Override
	public void method2006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2105 = arg0;
		this.anInt2115 = arg1;
		this.anInt2130 = arg2;
		this.anInt2113 = arg3;
		this.method2107();
		this.method2105();
		if (this.anInt2100 == 3) {
			this.method2067();
		} else if (this.anInt2100 == 2) {
			this.method2126();
		}
	}

	@OriginalMember(owner = "client!fu", name = "rb", descriptor = "()V")
	public void method2135() {
		if (this.anInt2129 == 2) {
			return;
		}
		this.method2116();
		this.method2118(false);
		this.method2085(false);
		this.method2073(false);
		this.method2103(false);
		this.method2089();
		this.anInt2129 = 2;
	}

	@OriginalMember(owner = "client!fu", name = "B", descriptor = "()V")
	@Override
	public void method2021() {
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!jj;)V")
	public void method2136(@OriginalArg(0) Interface3 arg0) {
		if (this.anInterface3_4 != arg0 && this.aBoolean158) {
			this.anOpengl2.glBindBufferARB(34963, arg0.method3588());
			this.anInterface3_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!fu", name = "E", descriptor = "()Z")
	@Override
	public boolean method2032() {
		return true;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIII)V")
	@Override
	public void method1958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt2091) {
			arg2 = this.anInt2091;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt2094) {
			arg3 = this.anInt2094;
		}
		this.anInt2109 = arg0;
		this.anInt2102 = arg1;
		this.anInt2103 = arg2;
		this.anInt2124 = arg3;
		this.anOpengl2.glEnable(3089);
		this.method2105();
		this.method2104();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!de;)V")
	@Override
	public void method1961(@OriginalArg(0) Class44 arg0) {
		this.aClass44_Sub2_1 = (Class44_Sub2) arg0;
		this.aClass44_Sub2_2.method3543(this.aClass44_Sub2_1);
		if (this.anInt2100 != 1) {
			this.method2083();
		}
	}

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "()Z")
	@Override
	public boolean method1953() {
		return true;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II[[I[[IIII)Lclient!ij;")
	@Override
	public Class107 method1972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class107_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}
}
