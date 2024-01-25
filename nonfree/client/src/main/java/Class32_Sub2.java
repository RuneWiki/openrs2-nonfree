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

@OriginalClass("client!h")
public final class Class32_Sub2 extends Class32 implements Interface3 {

	@OriginalMember(owner = "client!h", name = "L", descriptor = "I")
	public int anInt2485;

	@OriginalMember(owner = "client!h", name = "N", descriptor = "I")
	private int anInt2486;

	@OriginalMember(owner = "client!h", name = "O", descriptor = "I")
	public int anInt2487;

	@OriginalMember(owner = "client!h", name = "P", descriptor = "Lclient!ha;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
	public int anInt2488;

	@OriginalMember(owner = "client!h", name = "R", descriptor = "I")
	public int anInt2489;

	@OriginalMember(owner = "client!h", name = "S", descriptor = "I")
	public int anInt2490;

	@OriginalMember(owner = "client!h", name = "bb", descriptor = "Lclient!ks;")
	private Interface4 anInterface4_2;

	@OriginalMember(owner = "client!h", name = "eb", descriptor = "F")
	private float aFloat17;

	@OriginalMember(owner = "client!h", name = "gb", descriptor = "Lclient!vi;")
	private Class114_Sub1 aClass114_Sub1_1;

	@OriginalMember(owner = "client!h", name = "ib", descriptor = "F")
	private float aFloat18;

	@OriginalMember(owner = "client!h", name = "kb", descriptor = "Z")
	private boolean aBoolean227;

	@OriginalMember(owner = "client!h", name = "nb", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!h", name = "ob", descriptor = "I")
	private int anInt2496;

	@OriginalMember(owner = "client!h", name = "pb", descriptor = "I")
	public int anInt2497;

	@OriginalMember(owner = "client!h", name = "rb", descriptor = "Lclient!bj;")
	public Class20_Sub1 aClass20_Sub1_2;

	@OriginalMember(owner = "client!h", name = "sb", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!h", name = "wb", descriptor = "I")
	public int anInt2500;

	@OriginalMember(owner = "client!h", name = "zb", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!h", name = "Bb", descriptor = "Z")
	private boolean aBoolean229;

	@OriginalMember(owner = "client!h", name = "Cb", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!h", name = "Eb", descriptor = "J")
	private long aLong81;

	@OriginalMember(owner = "client!h", name = "Gb", descriptor = "[Lclient!sd;")
	private Class20[] aClass20Array1;

	@OriginalMember(owner = "client!h", name = "Hb", descriptor = "Lclient!kr;")
	public Class73_Sub2 aClass73_Sub2_1;

	@OriginalMember(owner = "client!h", name = "Ib", descriptor = "Z")
	private boolean aBoolean231;

	@OriginalMember(owner = "client!h", name = "Jb", descriptor = "Z")
	private boolean aBoolean232;

	@OriginalMember(owner = "client!h", name = "Mb", descriptor = "Z")
	private boolean aBoolean233;

	@OriginalMember(owner = "client!h", name = "Nb", descriptor = "Z")
	public boolean aBoolean234;

	@OriginalMember(owner = "client!h", name = "Ob", descriptor = "Lclient!kr;")
	public Class73_Sub2 aClass73_Sub2_2;

	@OriginalMember(owner = "client!h", name = "Pb", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!h", name = "Qb", descriptor = "Z")
	private boolean aBoolean235;

	@OriginalMember(owner = "client!h", name = "Rb", descriptor = "I")
	private int anInt2505;

	@OriginalMember(owner = "client!h", name = "Sb", descriptor = "Lclient!ng;")
	public Class109_Sub2 aClass109_Sub2_1;

	@OriginalMember(owner = "client!h", name = "Tb", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!h", name = "Vb", descriptor = "Z")
	private boolean aBoolean236;

	@OriginalMember(owner = "client!h", name = "Wb", descriptor = "I")
	public int anInt2507;

	@OriginalMember(owner = "client!h", name = "Xb", descriptor = "Ljava/lang/String;")
	private String aString24;

	@OriginalMember(owner = "client!h", name = "Yb", descriptor = "I")
	private int anInt2508;

	@OriginalMember(owner = "client!h", name = "Zb", descriptor = "Lclient!kr;")
	public Class73_Sub2 aClass73_Sub2_3;

	@OriginalMember(owner = "client!h", name = "ac", descriptor = "Lclient!kr;")
	public Class73_Sub2 aClass73_Sub2_4;

	@OriginalMember(owner = "client!h", name = "bc", descriptor = "Lclient!ao;")
	public Class11 aClass11_1;

	@OriginalMember(owner = "client!h", name = "cc", descriptor = "I")
	private int anInt2509;

	@OriginalMember(owner = "client!h", name = "ec", descriptor = "I")
	private int anInt2510;

	@OriginalMember(owner = "client!h", name = "fc", descriptor = "Z")
	private boolean aBoolean238;

	@OriginalMember(owner = "client!h", name = "gc", descriptor = "Z")
	public boolean aBoolean239;

	@OriginalMember(owner = "client!h", name = "ic", descriptor = "I")
	private int anInt2512;

	@OriginalMember(owner = "client!h", name = "kc", descriptor = "Lclient!va;")
	private Interface8 anInterface8_3;

	@OriginalMember(owner = "client!h", name = "lc", descriptor = "Z")
	public boolean aBoolean240;

	@OriginalMember(owner = "client!h", name = "mc", descriptor = "Lclient!bj;")
	public Class20_Sub1 aClass20_Sub1_3;

	@OriginalMember(owner = "client!h", name = "pc", descriptor = "I")
	private int anInt2515;

	@OriginalMember(owner = "client!h", name = "tc", descriptor = "Lclient!dg;")
	private Class20_Sub1_Sub1 aClass20_Sub1_Sub1_1;

	@OriginalMember(owner = "client!h", name = "uc", descriptor = "Z")
	public boolean aBoolean241;

	@OriginalMember(owner = "client!h", name = "xc", descriptor = "Lclient!bj;")
	public Class20_Sub1 aClass20_Sub1_4;

	@OriginalMember(owner = "client!h", name = "yc", descriptor = "Lclient!ng;")
	public Class109_Sub2 aClass109_Sub2_2;

	@OriginalMember(owner = "client!h", name = "zc", descriptor = "F")
	public float aFloat28;

	@OriginalMember(owner = "client!h", name = "Dc", descriptor = "Z")
	private boolean aBoolean244;

	@OriginalMember(owner = "client!h", name = "Fc", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!h", name = "Gc", descriptor = "F")
	private float aFloat32;

	@OriginalMember(owner = "client!h", name = "Ic", descriptor = "I")
	private int anInt2518;

	@OriginalMember(owner = "client!h", name = "Pc", descriptor = "Lclient!kr;")
	public Class73_Sub2 aClass73_Sub2_5;

	@OriginalMember(owner = "client!h", name = "Qc", descriptor = "Z")
	private boolean aBoolean246;

	@OriginalMember(owner = "client!h", name = "Rc", descriptor = "I")
	private int anInt2521;

	@OriginalMember(owner = "client!h", name = "Tc", descriptor = "Lclient!kr;")
	public Class73_Sub2 aClass73_Sub2_6;

	@OriginalMember(owner = "client!h", name = "Wc", descriptor = "Z")
	public boolean aBoolean247;

	@OriginalMember(owner = "client!h", name = "Xc", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!h", name = "Yc", descriptor = "Z")
	public boolean aBoolean248;

	@OriginalMember(owner = "client!h", name = "Zc", descriptor = "I")
	private int anInt2524;

	@OriginalMember(owner = "client!h", name = "ad", descriptor = "I")
	private int anInt2525;

	@OriginalMember(owner = "client!h", name = "F", descriptor = "Lclient!fj;")
	private final Class68 aClass68_1 = new Class68();

	@OriginalMember(owner = "client!h", name = "H", descriptor = "Lclient!wr;")
	private final Class109 aClass109_18 = new Class109_Sub2();

	@OriginalMember(owner = "client!h", name = "I", descriptor = "I")
	public final int anInt2483 = 3;

	@OriginalMember(owner = "client!h", name = "M", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!h", name = "J", descriptor = "I")
	public final int anInt2484 = 8;

	@OriginalMember(owner = "client!h", name = "T", descriptor = "[Lclient!ha;")
	private final Interface3[] anInterface3Array1 = new Interface3[4];

	@OriginalMember(owner = "client!h", name = "U", descriptor = "I")
	private int anInt2491 = -1;

	@OriginalMember(owner = "client!h", name = "K", descriptor = "Lclient!bb;")
	private final Class16 aClass16_7 = new Class16();

	@OriginalMember(owner = "client!h", name = "V", descriptor = "Lclient!bb;")
	private final Class16 aClass16_8 = new Class16();

	@OriginalMember(owner = "client!h", name = "W", descriptor = "Lclient!bb;")
	private final Class16 aClass16_9 = new Class16();

	@OriginalMember(owner = "client!h", name = "X", descriptor = "Lclient!bb;")
	private final Class16 aClass16_10 = new Class16();

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "Lclient!bb;")
	private final Class16 aClass16_11 = new Class16();

	@OriginalMember(owner = "client!h", name = "Z", descriptor = "Lclient!bb;")
	private final Class16 aClass16_12 = new Class16();

	@OriginalMember(owner = "client!h", name = "ab", descriptor = "Lclient!bb;")
	private final Class16 aClass16_13 = new Class16();

	@OriginalMember(owner = "client!h", name = "db", descriptor = "Z")
	private boolean aBoolean226 = true;

	@OriginalMember(owner = "client!h", name = "qb", descriptor = "I")
	private int anInt2498 = 0;

	@OriginalMember(owner = "client!h", name = "cb", descriptor = "[F")
	private final float[] aFloatArray12 = new float[4];

	@OriginalMember(owner = "client!h", name = "fb", descriptor = "I")
	public int anInt2492 = 50;

	@OriginalMember(owner = "client!h", name = "tb", descriptor = "F")
	private float aFloat21 = 1.0F;

	@OriginalMember(owner = "client!h", name = "jb", descriptor = "I")
	private int anInt2494 = 8448;

	@OriginalMember(owner = "client!h", name = "yb", descriptor = "F")
	public float aFloat22 = 1.0F;

	@OriginalMember(owner = "client!h", name = "lb", descriptor = "I")
	public int lb = 0;

	@OriginalMember(owner = "client!h", name = "mb", descriptor = "I")
	public int anInt2495 = 512;

	@OriginalMember(owner = "client!h", name = "Ub", descriptor = "I")
	private int anInt2506 = 0;

	@OriginalMember(owner = "client!h", name = "hb", descriptor = "I")
	public int anInt2493 = -1;

	@OriginalMember(owner = "client!h", name = "jc", descriptor = "I")
	private int anInt2513 = 0;

	@OriginalMember(owner = "client!h", name = "nc", descriptor = "I")
	public int anInt2514 = -1;

	@OriginalMember(owner = "client!h", name = "sc", descriptor = "I")
	private int anInt2516 = 0;

	@OriginalMember(owner = "client!h", name = "xb", descriptor = "I")
	public int anInt2501 = 512;

	@OriginalMember(owner = "client!h", name = "Fb", descriptor = "I")
	private int anInt2503 = 0;

	@OriginalMember(owner = "client!h", name = "Ab", descriptor = "I")
	public int anInt2502 = 0;

	@OriginalMember(owner = "client!h", name = "Cc", descriptor = "[F")
	public final float[] aFloatArray16 = new float[4];

	@OriginalMember(owner = "client!h", name = "Hc", descriptor = "I")
	private int anInt2517 = 0;

	@OriginalMember(owner = "client!h", name = "oc", descriptor = "F")
	public float aFloat27 = 1.0F;

	@OriginalMember(owner = "client!h", name = "Bc", descriptor = "F")
	public float aFloat30 = 3584.0F;

	@OriginalMember(owner = "client!h", name = "hc", descriptor = "I")
	private int anInt2511 = -1;

	@OriginalMember(owner = "client!h", name = "Lb", descriptor = "I")
	private int anInt2504 = 0;

	@OriginalMember(owner = "client!h", name = "Lc", descriptor = "F")
	public float aFloat35 = -1.0F;

	@OriginalMember(owner = "client!h", name = "qc", descriptor = "[F")
	private final float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!h", name = "rc", descriptor = "[F")
	private final float[] aFloatArray15 = new float[16];

	@OriginalMember(owner = "client!h", name = "Sc", descriptor = "F")
	public float aFloat36 = 3584.0F;

	@OriginalMember(owner = "client!h", name = "Ec", descriptor = "F")
	private float aFloat31 = 1.0F;

	@OriginalMember(owner = "client!h", name = "Ac", descriptor = "F")
	private float aFloat29 = 0.0F;

	@OriginalMember(owner = "client!h", name = "Kc", descriptor = "F")
	public float aFloat34 = -1.0F;

	@OriginalMember(owner = "client!h", name = "Nc", descriptor = "I")
	public int anInt2519 = -1;

	@OriginalMember(owner = "client!h", name = "Jc", descriptor = "F")
	public float aFloat33 = 1.0F;

	@OriginalMember(owner = "client!h", name = "Oc", descriptor = "I")
	public int anInt2520 = 3584;

	@OriginalMember(owner = "client!h", name = "Vc", descriptor = "I")
	private int anInt2523 = -1;

	@OriginalMember(owner = "client!h", name = "Uc", descriptor = "I")
	private int anInt2522 = 8448;

	@OriginalMember(owner = "client!h", name = "Kb", descriptor = "[F")
	private final float[] aFloatArray13 = new float[4];

	@OriginalMember(owner = "client!h", name = "A", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas3;

	@OriginalMember(owner = "client!h", name = "w", descriptor = "Lclient!gd;")
	public final Interface2 anInterface2_4;

	@OriginalMember(owner = "client!h", name = "u", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!h", name = "E", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl2;

	@OriginalMember(owner = "client!h", name = "vb", descriptor = "I")
	public final int anInt2499;

	@OriginalMember(owner = "client!h", name = "vc", descriptor = "Z")
	private boolean aBoolean242;

	@OriginalMember(owner = "client!h", name = "Db", descriptor = "Z")
	public boolean aBoolean230;

	@OriginalMember(owner = "client!h", name = "dc", descriptor = "Z")
	public boolean aBoolean237;

	@OriginalMember(owner = "client!h", name = "Mc", descriptor = "Z")
	public boolean aBoolean245;

	@OriginalMember(owner = "client!h", name = "wc", descriptor = "Z")
	private boolean aBoolean243;

	@OriginalMember(owner = "client!h", name = "ub", descriptor = "Z")
	public boolean aBoolean228;

	@OriginalMember(owner = "client!h", name = "v", descriptor = "Lclient!ag;")
	public final Class6 aClass6_1;

	@OriginalMember(owner = "client!h", name = "y", descriptor = "Lclient!in;")
	private final Class98 aClass98_1;

	@OriginalMember(owner = "client!h", name = "D", descriptor = "Lclient!re;")
	private final Class178 aClass178_1;

	@OriginalMember(owner = "client!h", name = "C", descriptor = "Lclient!wg;")
	private final Class1_Sub20_Sub1 aClass1_Sub20_Sub1_1;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!gd;IILclient!nh;)V")
	public Class32_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class143 arg4) {
		this.aCanvas3 = arg0;
		this.anInterface2_4 = arg1;
		this.anInt2472 = arg2;
		@Pc(186) int local186 = 0;
		while (!this.aCanvas3.isShowing()) {
			if (local186++ > 5) {
				throw new RuntimeException("");
			}
			Static190.method3690(1000L);
		}
		this.aCanvas3.setIgnoreRepaint(true);
		try {
			if (Static105.aBoolean224 == null || !Static105.aBoolean224) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static105.aBoolean224 = Boolean.TRUE;
				} else {
					@Pc(220) Class162 local220 = arg4.method3887(this.getClass());
					while (local220.anInt4801 == 0) {
						Static190.method3690(100L);
					}
					if (local220.anInt4801 == 1) {
						Static105.aBoolean224 = Boolean.TRUE;
					}
				}
			}
			if (Static105.aBoolean224 == null || !Static105.aBoolean224) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas3, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method2274();
				this.anOpengl2 = this.aContext1.getGL();
				@Pc(287) int local287 = this.method2318();
				if (local287 != 0) {
					throw new RuntimeException("");
				}
				this.anInt2499 = this.aBoolean240 ? 33639 : 5121;
				@Pc(306) String local306 = this.aString24.toLowerCase();
				@Pc(310) String local310 = this.aString25.toLowerCase();
				if (local310.indexOf("radeon") != -1) {
					@Pc(317) int local317 = 0;
					@Pc(319) boolean local319 = false;
					@Pc(321) boolean local321 = false;
					@Pc(329) String[] local329 = Static309.method5164(' ', local310.replace('/', ' '));
					for (@Pc(331) int local331 = 0; local331 < local329.length; local331++) {
						@Pc(339) String local339 = local329[local331];
						try {
							if (local339.length() > 0) {
								if (local339.charAt(0) == 'x' && local339.length() >= 3 && Static349.method5593(local339.substring(1, 3))) {
									local339 = local339.substring(1);
									local321 = true;
								}
								if (local339.equals("hd")) {
									local319 = true;
								} else {
									if (local339.startsWith("hd")) {
										local339 = local339.substring(2);
										local319 = true;
									}
									if (local339.length() >= 4 && Static349.method5593(local339.substring(0, 4))) {
										local317 = Static89.method1943(local339.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(403) Exception local403) {
						}
					}
					if (!local321 && !local319) {
						if (local317 >= 7000 && local317 <= 7999) {
							this.aBoolean242 = false;
						}
						if (local317 >= 7000 && local317 <= 9250) {
							this.aBoolean230 = false;
						}
					}
					if (!local319 || local317 < 4000) {
						this.aBoolean237 = false;
					}
					this.aBoolean245 &= this.anOpengl2.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean243 = this.aBoolean242;
				}
				if (local306.contains("intel")) {
					this.aBoolean228 = false;
				}
				if (this.aBoolean242) {
					try {
						@Pc(461) int[] local461 = new int[1];
						this.anOpengl2.glGenBuffersARB(1, local461, 0);
					} catch (@Pc(469) Throwable local469) {
						throw new RuntimeException("", local469);
					}
				}
				this.method2316(this);
				this.method2228();
				this.method2294();
				new Class118(this);
				this.aClass6_1 = new Class6(this, this.anInterface2_4);
				Static140.method2826(true);
				this.aBoolean225 = true;
				this.aClass98_1 = new Class98(this);
				this.aClass178_1 = new Class178(this);
				this.aClass1_Sub20_Sub1_1 = new Class1_Sub20_Sub1(this);
				this.method2307();
				this.anOpengl2.glClear(16640);
				local186 = 0;
				while (true) {
					try {
						this.aContext1.swapBuffers();
						break;
					} catch (@Pc(534) Exception local534) {
						if (local186++ > 5) {
							throw new RuntimeException("");
						}
						Static190.method3690(100L);
					}
				}
				this.anOpengl2.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(553) Throwable local553) {
			local553.printStackTrace();
			this.method2182();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local553);
		}
	}

	@OriginalMember(owner = "client!h", name = "F", descriptor = "()V")
	@Override
	public void method2228() {
		this.anInt2490 = this.aCanvas3.getWidth();
		this.anInt2489 = this.aCanvas3.getHeight();
		this.anOpengl2.glViewport(this.anInt2504, this.anInt2503, this.anInt2490, this.anInt2489);
		this.method2268();
		this.method2184();
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
	@Override
	public void method2180(@OriginalArg(0) int arg0) {
		this.method2291(0);
		this.anOpengl2.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl2.glClear(16384);
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(II)V")
	public void method2247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2504 = arg0;
		this.anInt2503 = arg1;
		this.anOpengl2.glViewport(arg0, arg1, this.anInt2490, this.anInt2489);
		this.method2306();
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(IZ)V")
	public void method2248(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method2299(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(II)V")
	@Override
	public void method2202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2492 == arg0 && this.anInt2520 == arg1) {
			return;
		}
		this.anInt2492 = arg0;
		this.anInt2520 = arg1;
		this.method2290();
		this.method2278();
		if (this.anInt2509 == 3) {
			this.method2300();
		} else if (this.anInt2509 == 2) {
			this.method2303();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Lclient!ge;Lclient!sk;Lclient!wr;[Lclient!fi;I)V")
	@Override
	public void method2172(@OriginalArg(0) Class73[] arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Class8_Sub3[] arg3, @OriginalArg(4) int arg4) {
		this.method2198(arg0, arg2, arg3, arg4);
		this.method2190(arg1);
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(II)V")
	public synchronized void method2249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub13 local4 = new Class1_Sub13(arg1);
		local4.aLong213 = arg0;
		this.aClass16_8.method416(local4);
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(Z)V")
	public void method2250(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean232) {
			this.aBoolean232 = arg0;
			this.method2267();
			this.anInt2512 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!va;)V")
	public void method2251(@OriginalArg(0) Interface8 arg0) {
		if (this.anInterface8_3 != arg0 && this.aBoolean242) {
			this.anOpengl2.glBindBufferARB(34962, arg0.method2573());
			this.anInterface8_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ks;III)V")
	public void method2252(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2298(arg0);
		arg0.method2575(arg1, arg2);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method2190(@OriginalArg(0) Class191 arg0) {
		this.aClass68_1.method1837(this, arg0);
	}

	@OriginalMember(owner = "client!h", name = "M", descriptor = "()V")
	private void method2253() {
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl2.glMultMatrixf(this.aClass109_Sub2_1.method3881(), 0);
		this.method2280();
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method2193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2259();
		this.method2291(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!h", name = "i", descriptor = "(I)V")
	public void method2254(@OriginalArg(0) int arg0) {
		Static105.aFloatArray11[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static105.aFloatArray11[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static105.aFloatArray11[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static105.aFloatArray11[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static105.aFloatArray11, 0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(FF)V")
	@Override
	public void method2225(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat19 && arg1 == this.aFloat37) {
			return;
		}
		this.aFloat19 = arg0;
		this.aFloat37 = arg1;
		this.method2260();
		if (this.anInt2509 == 3) {
			this.method2300();
		} else if (this.anInt2509 == 2) {
			this.method2303();
		}
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(II)V")
	public void method2255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2508 != 0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt2494 != arg0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anInt2494 = arg0;
			local4 = true;
		}
		if (this.anInt2522 != arg1) {
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			this.anInt2522 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt2512 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!h", name = "N", descriptor = "()V")
	public void method2256() {
		if (this.anInt2512 == 4) {
			return;
		}
		this.method2285();
		this.method2312(false);
		this.method2250(false);
		this.method2262(false);
		this.method2281(false);
		this.method2258();
		this.method2291(1);
		this.method2282(1);
		this.anInt2512 = 4;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(F)V")
	public void method2257(@OriginalArg(0) float arg0) {
		if (this.aFloat31 != arg0) {
			this.aFloat31 = arg0;
			if (this.anInt2509 == 3) {
				this.method2300();
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "j", descriptor = "(I)V")
	public void method2258() {
		this.method2248(-2, true);
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "()Z")
	@Override
	public boolean method2144() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "O", descriptor = "()V")
	private void method2259() {
		if (this.anInt2512 == 1) {
			return;
		}
		this.method2285();
		this.method2312(false);
		this.method2250(false);
		this.method2262(false);
		this.method2281(false);
		this.method2287(null);
		this.method2258();
		this.method2282(0);
		this.anInt2512 = 1;
	}

	@OriginalMember(owner = "client!h", name = "P", descriptor = "()V")
	private void method2260() {
		if (this.aFloat37 == 0.0F) {
			this.aFloatArray15[10] = this.aFloat18;
			this.aFloatArray15[14] = this.aFloat32;
		} else {
			@Pc(13) float local13 = this.aFloat19 / (this.aFloat37 + this.aFloat19);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat32 * (1.0F - local13) * (1.0F - local13) / this.aFloat37;
			this.aFloatArray15[10] = this.aFloat18 + local32;
			this.aFloatArray15[14] = this.aFloat32 * local17;
		}
		this.aFloat30 = (this.aFloatArray15[14] - (float) this.anInt2520) / this.aFloatArray15[10];
		this.aFloat36 = (float) this.anInt2520 - this.aFloat37;
	}

	@OriginalMember(owner = "client!h", name = "k", descriptor = "(I)I")
	public int method2261(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(Z)V")
	public void method2262(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean238) {
			return;
		}
		if (arg0) {
			this.anOpengl2.glEnable(2929);
		} else {
			this.anOpengl2.glDisable(2929);
		}
		this.aBoolean238 = arg0;
		this.anInt2512 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(III)V")
	@Override
	public void method2138() {
		this.aBoolean248 = true;
		this.anInt2511 = 1583160;
		this.anInt2519 = 40;
		this.method2278();
		this.method2270();
		this.aClass98_1.method2632(3, false, false);
		this.aClass98_1.method2631(-1, true);
	}

	@OriginalMember(owner = "client!h", name = "l", descriptor = "(I)I")
	public int method2263(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
	@Override
	public void method2244() {
	}

	@OriginalMember(owner = "client!h", name = "o", descriptor = "()V")
	@Override
	public void method2179() {
		this.aClass178_1.method4710();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Lclient!si;)V")
	@Override
	public void method2236(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub30[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class1_Sub30 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static105.aFloatArray10[0] = local8.anInt5299;
			Static105.aFloatArray10[1] = local8.anInt5298;
			Static105.aFloatArray10[2] = local8.anInt5297;
			Static105.aFloatArray10[3] = 1.0F;
			this.anOpengl2.glLightfv(local12, 4611, Static105.aFloatArray10, 0);
			@Pc(44) int local44 = local8.anInt5301;
			@Pc(49) float local49 = local8.aFloat74 / 255.0F;
			Static105.aFloatArray10[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static105.aFloatArray10[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static105.aFloatArray10[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl2.glLightfv(local12, 4609, Static105.aFloatArray10, 0);
			this.anOpengl2.glLightf(local12, 4617, 1.0F / (float) (local8.anInt5300 * local8.anInt5300));
			this.anOpengl2.glEnable(local12);
		}
		while (local1 < this.anInt2506) {
			this.anOpengl2.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt2506 = arg0;
	}

	@OriginalMember(owner = "client!h", name = "Q", descriptor = "()V")
	private void method2264() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(III)V")
	public void method2265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!h", name = "p", descriptor = "()V")
	@Override
	protected void method2182() {
		if (this.anOpengl2 != null) {
			try {
				this.aClass178_1.method4717();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl2 = null;
		}
		if (this.aContext1 != null) {
			this.method2264();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean225) {
			Static117.method2484(true);
			this.aBoolean225 = false;
		}
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "(II)V")
	public synchronized void method2266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub13 local4 = new Class1_Sub13(arg1);
		local4.aLong213 = arg0;
		this.aClass16_10.method416(local4);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILclient!em;II)V")
	@Override
	public void method2154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class52 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class52_Sub2 local2 = (Class52_Sub2) arg5;
		@Pc(5) Class20_Sub1_Sub1 local5 = local2.aClass20_Sub1_Sub1_4;
		this.method2293();
		this.method2287(local2.aClass20_Sub1_Sub1_4);
		this.method2291(1);
		this.method2255(7681, 8448);
		this.method2276(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat8 / (float) local5.anInt1603;
		@Pc(37) float local37 = local5.aFloat9 / (float) local5.anInt1602;
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
		this.method2276(0, 5890, 768);
	}

	@OriginalMember(owner = "client!h", name = "R", descriptor = "()V")
	private void method2267() {
		if (this.aBoolean232 && !this.aBoolean229) {
			this.anOpengl2.glEnable(2896);
		} else {
			this.anOpengl2.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(IIII)V")
	@Override
	public void method2226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt2490) {
			arg2 = this.anInt2490;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt2489) {
			arg3 = this.anInt2489;
		}
		this.anInt2513 = arg0;
		this.anInt2517 = arg1;
		this.anInt2498 = arg2;
		this.anInt2516 = arg3;
		this.anOpengl2.glEnable(3089);
		this.method2279();
		this.method2306();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ts;)V")
	@Override
	public void method2169(@OriginalArg(0) Class114 arg0) {
		this.aClass114_Sub1_1 = (Class114_Sub1) arg0;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(IIII)V")
	@Override
	public void method2242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.lb = arg0;
		this.anInt2502 = arg1;
		this.anInt2495 = arg2;
		this.anInt2501 = arg3;
		this.method2290();
		this.method2279();
		if (this.anInt2509 == 3) {
			this.method2300();
		} else if (this.anInt2509 == 2) {
			this.method2303();
		}
	}

	@OriginalMember(owner = "client!h", name = "S", descriptor = "()V")
	public void method2268() {
		if (this.anInt2509 != 0) {
			this.anInt2509 = 0;
			this.anInt2512 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ig;Lclient!ig;Lclient!ig;Lclient!ig;)V")
	public void method2269(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class91 arg3) {
		if (arg0 == null) {
			this.anOpengl2.glDisableClientState(32884);
		} else {
			this.anOpengl2.glEnableClientState(32884);
			arg0.method2599();
		}
		if (arg1 == null) {
			this.anOpengl2.glDisableClientState(32885);
		} else {
			this.anOpengl2.glEnableClientState(32885);
			arg1.method2597();
		}
		if (arg2 == null) {
			this.anOpengl2.glDisableClientState(32886);
		} else {
			this.anOpengl2.glEnableClientState(32886);
			arg2.method2598();
		}
		if (arg3 == null) {
			this.anOpengl2.glDisableClientState(32888);
		} else {
			this.anOpengl2.glEnableClientState(32888);
			arg3.method2600();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2229(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static347.aFloat77 = arg0;
		Static347.aFloat78 = arg1;
		Static347.aFloat76 = arg2;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[I[I)Lclient!em;")
	@Override
	public Class52 method2238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static368.method3166(arg3, this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!h", name = "T", descriptor = "()V")
	private void method2270() {
		if (this.aBoolean231 && this.aBoolean248 | this.anInt2493 >= 0) {
			this.anOpengl2.glEnable(2912);
		} else {
			this.anOpengl2.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!h", name = "z", descriptor = "()F")
	@Override
	public float method2216() {
		return this.aFloat37;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ng;)V")
	public void method2271(@OriginalArg(0) Class109_Sub2 arg0) {
		this.anOpengl2.glPushMatrix();
		this.anOpengl2.glMultMatrixf(arg0.method3881(), 0);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(III)V")
	@Override
	public void method2164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean248) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt2511 = arg1;
		this.anInt2519 = arg2;
		this.method2278();
		this.aClass98_1.method2631(arg0, true);
	}

	@OriginalMember(owner = "client!h", name = "n", descriptor = "()Z")
	@Override
	public boolean method2178() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method2241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method2259();
		this.method2291(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean227) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local19);
		this.anOpengl2.glVertex2f(local14, local19);
		this.anOpengl2.glVertex2f(local14, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean227) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(IIII)V")
	@Override
	public void method2218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass178_1.method4715(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!va;")
	public Interface8 method2272(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface8) (this.aBoolean242 ? new Class69_Sub1(this, arg0, arg1, false) : new Class4_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(FFF)V")
	private void method2273(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl2.glMatrixMode(5890);
		if (this.aBoolean235) {
			this.anOpengl2.glLoadIdentity();
		}
		this.anOpengl2.glTranslatef(arg0, arg1, arg2);
		this.anOpengl2.glMatrixMode(5888);
		this.aBoolean235 = true;
	}

	@OriginalMember(owner = "client!h", name = "U", descriptor = "()V")
	private void method2274() {
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
			Static190.method3690(1000L);
		}
	}

	@OriginalMember(owner = "client!h", name = "J", descriptor = "()Z")
	@Override
	public boolean method2235() {
		return this.aClass98_1.method2629();
	}

	@OriginalMember(owner = "client!h", name = "V", descriptor = "()V")
	private void method2275() {
		if (this.anInt2509 != 3) {
			this.anInt2509 = 3;
			this.method2300();
			this.method2253();
			this.anInt2512 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!h", name = "I", descriptor = "()Z")
	@Override
	public boolean method2233() {
		return this.aBoolean227;
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(III)V")
	public void method2276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!wr;)V")
	@Override
	public void method2201(@OriginalArg(0) Class109 arg0) {
		this.aClass109_Sub2_1 = (Class109_Sub2) arg0;
		this.aClass109_Sub2_2.method3882(this.aClass109_Sub2_1);
		if (this.anInt2509 != 1) {
			this.method2253();
		}
	}

	@OriginalMember(owner = "client!h", name = "C", descriptor = "()Z")
	@Override
	public boolean method2222() {
		return !this.aBoolean233;
	}

	@OriginalMember(owner = "client!h", name = "m", descriptor = "()V")
	@Override
	public void method2177() {
		this.method2281(true);
		this.anOpengl2.glClear(256);
	}

	@OriginalMember(owner = "client!h", name = "x", descriptor = "()Z")
	@Override
	public boolean method2213() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!em;II)V")
	@Override
	public void method2156(@OriginalArg(1) Class52 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class52_Sub2 local2 = (Class52_Sub2) arg0;
		@Pc(5) Class20_Sub1_Sub1 local5 = local2.aClass20_Sub1_Sub1_4;
		this.method2293();
		this.method2287(local2.aClass20_Sub1_Sub1_4);
		this.method2291(1);
		this.method2255(7681, 8448);
		this.method2276(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat8 / (float) local5.anInt1603;
		@Pc(37) float local37 = local5.aFloat9 / (float) local5.anInt1602;
		this.anOpengl2.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt2513 - arg1), local37 * (float) (this.anInt2517 - arg2));
		this.anOpengl2.glVertex2i(this.anInt2513, this.anInt2517);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt2513 - arg1), local37 * (float) (this.anInt2516 - arg2));
		this.anOpengl2.glVertex2i(this.anInt2513, this.anInt2516);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt2498 - arg1), local37 * (float) (this.anInt2516 - arg2));
		this.anOpengl2.glVertex2i(this.anInt2498, this.anInt2516);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt2498 - arg1), local37 * (float) (this.anInt2517 - arg2));
		this.anOpengl2.glVertex2i(this.anInt2498, this.anInt2517);
		this.anOpengl2.glEnd();
		this.method2276(0, 5890, 768);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!iq;Z)Lclient!c;")
	@Override
	public Class5 method2149(@OriginalArg(0) Class99 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt2875 * arg0.anInt2877];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray51 == null) {
			for (local15 = 0; local15 < arg0.anInt2877; local15++) {
				for (local21 = 0; local21 < arg0.anInt2875; local21++) {
					@Pc(74) int local74 = arg0.anIntArray257[arg0.aByteArray52[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt2877; local15++) {
				for (local21 = 0; local21 < arg0.anInt2875; local21++) {
					local6[local10++] = arg0.aByteArray51[local8] << 24 | arg0.anIntArray257[arg0.aByteArray52[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class5 local100 = this.method2155(local6, arg0.anInt2875, arg0.anInt2875, arg0.anInt2877);
		local100.method3636(arg0.anInt2874, arg0.anInt2876, arg0.anInt2872, arg0.anInt2873);
		return local100;
	}

	@OriginalMember(owner = "client!h", name = "W", descriptor = "()V")
	private void method2277() {
		this.anOpengl2.glDepthMask(this.aBoolean246 && this.aBoolean226);
	}

	@OriginalMember(owner = "client!h", name = "s", descriptor = "()Z")
	@Override
	public boolean method2192() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "X", descriptor = "()V")
	private void method2278() {
		@Pc(15) int local15;
		if (this.aBoolean248) {
			this.anOpengl2.glFogf(2915, 0.0F);
			this.anOpengl2.glFogf(2916, 1.0F);
			local15 = this.anInt2511;
		} else {
			this.aFloat17 = (float) (this.anInt2520 - 256) - this.aFloat29;
			this.aFloat26 = this.aFloat17 - (float) this.anInt2493 * this.aFloat21;
			if (this.aFloat26 < (float) this.anInt2492) {
				this.aFloat26 = this.anInt2492;
			}
			this.anOpengl2.glFogf(2915, this.aFloat26);
			this.anOpengl2.glFogf(2916, this.aFloat17);
			local15 = this.anInt2514;
		}
		Static105.aFloatArray11[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static105.aFloatArray11[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static105.aFloatArray11[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl2.glFogfv(2918, Static105.aFloatArray11, 0);
	}

	@OriginalMember(owner = "client!h", name = "t", descriptor = "()Lclient!wr;")
	@Override
	public Class109 method2194() {
		return this.aClass109_18;
	}

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "()V")
	private void method2279() {
		this.aFloat28 = this.anInt2513 - this.lb;
		this.aFloat20 = this.anInt2498 - this.lb;
		this.aFloat24 = this.anInt2517 - this.anInt2502;
		this.aFloat25 = this.anInt2516 - this.anInt2502;
	}

	@OriginalMember(owner = "client!h", name = "i", descriptor = "()V")
	@Override
	public void method2162() {
		this.aClass98_1.method2632(0, false, false);
		this.aBoolean248 = false;
		this.method2278();
		this.method2270();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ge;Lclient!sk;Lclient!wr;Lclient!fi;I)V")
	@Override
	public void method2181(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Class8_Sub3 arg3) {
		arg0.method3322(arg2, arg3, 0);
		this.method2190(arg1);
	}

	@OriginalMember(owner = "client!h", name = "Z", descriptor = "()V")
	public void method2280() {
		this.anOpengl2.glLightfv(16384, 4611, this.aFloatArray16, 0);
		this.anOpengl2.glLightfv(16385, 4611, this.aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "()Z")
	@Override
	public boolean method2141() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[[I[[IIII)Lclient!ip;")
	@Override
	public Class53 method2167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class53_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2158(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class1_Sub13 local16;
		while (!this.aClass16_8.method418()) {
			local16 = (Class1_Sub13) this.aClass16_8.method408();
			Static105.anIntArray233[local1++] = (int) local16.aLong213;
			this.anInt2488 -= local16.anInt1849;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteBuffersARB(local1, Static105.anIntArray233, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteBuffersARB(local1, Static105.anIntArray233, 0);
			local1 = 0;
		}
		while (!this.aClass16_9.method418()) {
			local16 = (Class1_Sub13) this.aClass16_9.method408();
			Static105.anIntArray233[local1++] = (int) local16.aLong213;
			this.anInt2485 -= local16.anInt1849;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteTextures(local1, Static105.anIntArray233, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteTextures(local1, Static105.anIntArray233, 0);
			local1 = 0;
		}
		while (!this.aClass16_10.method418()) {
			local16 = (Class1_Sub13) this.aClass16_10.method408();
			Static105.anIntArray233[local1++] = local16.anInt1849;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteFramebuffersEXT(local1, Static105.anIntArray233, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteFramebuffersEXT(local1, Static105.anIntArray233, 0);
			local1 = 0;
		}
		while (!this.aClass16_11.method418()) {
			local16 = (Class1_Sub13) this.aClass16_11.method408();
			Static105.anIntArray233[local1++] = (int) local16.aLong213;
			this.anInt2486 -= local16.anInt1849;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static105.anIntArray233, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static105.anIntArray233, 0);
			local1 = 0;
		}
		while (!this.aClass16_12.method418()) {
			local16 = (Class1_Sub13) this.aClass16_12.method408();
			Static105.anIntArray233[local1++] = (int) local16.aLong213;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteProgramsARB(local1, Static105.anIntArray233, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteProgramsARB(local1, Static105.anIntArray233, 0);
		}
		while (!this.aClass16_7.method418()) {
			local16 = (Class1_Sub13) this.aClass16_7.method408();
			this.anOpengl2.glDeleteLists((int) local16.aLong213, local16.anInt1849);
		}
		while (!this.aClass16_13.method418()) {
			local16 = (Class1_Sub13) this.aClass16_13.method408();
			this.anOpengl2.glDeleteObjectARB(local16.anInt1849);
		}
		while (!this.aClass16_7.method418()) {
			local16 = (Class1_Sub13) this.aClass16_7.method408();
			this.anOpengl2.glDeleteLists((int) local16.aLong213, local16.anInt1849);
		}
		if (this.method2227() > 100663296 && Static162.method3252() > this.aLong81 + 60000L) {
			System.gc();
			this.aLong81 = Static162.method3252();
		}
		this.anInt2487 = local5;
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(IIIIII)Z")
	@Override
	public boolean method2243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass109_Sub2_1.aFloat62 * (float) arg0 + this.aClass109_Sub2_1.aFloat58 * (float) arg1 + this.aClass109_Sub2_1.aFloat56 * (float) arg2 + this.aClass109_Sub2_1.aFloat57;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass109_Sub2_1.aFloat62 * (float) arg3 + this.aClass109_Sub2_1.aFloat58 * (float) arg4 + this.aClass109_Sub2_1.aFloat56 * (float) arg5 + this.aClass109_Sub2_1.aFloat57;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt2492 && local55 < (float) this.anInt2492 || !(!(local24 > (float) this.anInt2520) || !(local55 > (float) this.anInt2520))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt2495 * (this.aClass109_Sub2_1.aFloat60 * (float) arg0 + this.aClass109_Sub2_1.aFloat63 * (float) arg1 + this.aClass109_Sub2_1.aFloat59 * (float) arg2 + this.aClass109_Sub2_1.aFloat55) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt2495 * (this.aClass109_Sub2_1.aFloat60 * (float) arg3 + this.aClass109_Sub2_1.aFloat63 * (float) arg4 + this.aClass109_Sub2_1.aFloat59 * (float) arg5 + this.aClass109_Sub2_1.aFloat55) / local55);
		if ((float) local119 < this.aFloat28 && (float) local151 < this.aFloat28 || (float) local119 > this.aFloat20 && (float) local151 > this.aFloat20) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt2501 * (this.aClass109_Sub2_1.aFloat54 * (float) arg0 + this.aClass109_Sub2_1.aFloat61 * (float) arg1 + this.aClass109_Sub2_1.aFloat52 * (float) arg2 + this.aClass109_Sub2_1.aFloat53) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt2501 * (this.aClass109_Sub2_1.aFloat54 * (float) arg3 + this.aClass109_Sub2_1.aFloat61 * (float) arg4 + this.aClass109_Sub2_1.aFloat52 * (float) arg5 + this.aClass109_Sub2_1.aFloat53) / local55);
			return (!((float) local209 < this.aFloat24) || !((float) local241 < this.aFloat24)) && (!((float) local209 > this.aFloat25) || !((float) local241 > this.aFloat25));
		}
	}

	@OriginalMember(owner = "client!h", name = "u", descriptor = "()I")
	@Override
	public int method2203() {
		return this.anInt2520;
	}

	@OriginalMember(owner = "client!h", name = "w", descriptor = "()F")
	@Override
	public float method2212() {
		return this.aFloat19;
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(Z)V")
	public void method2281(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean246) {
			this.aBoolean246 = arg0;
			this.method2277();
			this.anInt2512 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!h", name = "m", descriptor = "(I)V")
	public void method2282(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2255(7681, 7681);
		} else if (arg0 == 1) {
			this.method2255(8448, 8448);
		} else if (arg0 == 2) {
			this.method2255(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!h", name = "ab", descriptor = "()Lclient!ha;")
	public Interface3 method2283() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!h", name = "bb", descriptor = "()V")
	public void method2284() {
		this.anOpengl2.glPopMatrix();
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(IIII)V")
	@Override
	public void method2220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2513 < arg0) {
			this.anInt2513 = arg0;
		}
		if (this.anInt2498 > arg2) {
			this.anInt2498 = arg2;
		}
		if (this.anInt2517 < arg1) {
			this.anInt2517 = arg1;
		}
		if (this.anInt2516 > arg3) {
			this.anInt2516 = arg3;
		}
		this.anOpengl2.glEnable(3089);
		this.method2279();
		this.method2306();
	}

	@OriginalMember(owner = "client!h", name = "cb", descriptor = "()V")
	private void method2285() {
		if (this.anInt2509 == 1) {
			return;
		}
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		if (this.anInt2490 > 0 && this.anInt2489 > 0) {
			this.anOpengl2.glOrtho(0.0D, (double) this.anInt2490, (double) this.anInt2489, 0.0D, -1.0D, 1.0D);
		}
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anInt2509 = 1;
		this.anInt2512 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method2200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method2259();
		this.method2291(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean227) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local23);
		this.anOpengl2.glVertex2f(local16, local23);
		this.anOpengl2.glVertex2f(local16, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean227) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!h", name = "n", descriptor = "(I)V")
	public synchronized void method2286(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub13 local4 = new Class1_Sub13(arg0);
		this.aClass16_10.method416(local4);
	}

	@OriginalMember(owner = "client!h", name = "K", descriptor = "()Z")
	@Override
	public boolean method2237() {
		return this.aClass1_Sub20_Sub1_1.method5575();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!sd;)V")
	public void method2287(@OriginalArg(0) Class20 arg0) {
		@Pc(5) Class20 local5 = this.aClass20Array1[this.anInt2508];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl2.glDisable(local5.anInt6563);
			} else {
				if (local5 == null) {
					this.anOpengl2.glEnable(arg0.anInt6563);
				} else if (arg0.anInt6563 != local5.anInt6563) {
					this.anOpengl2.glDisable(local5.anInt6563);
					this.anOpengl2.glEnable(arg0.anInt6563);
				}
				this.anOpengl2.glBindTexture(arg0.anInt6563, arg0.method5505());
			}
			this.aClass20Array1[this.anInt2508] = arg0;
		}
		this.anInt2512 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!h", name = "db", descriptor = "()V")
	private void method2288() {
		Static105.aFloatArray11[0] = this.aFloat35 * this.aFloat27;
		Static105.aFloatArray11[1] = this.aFloat35 * this.aFloat33;
		Static105.aFloatArray11[2] = this.aFloat35 * this.aFloat22;
		Static105.aFloatArray11[3] = 1.0F;
		this.anOpengl2.glLightfv(16384, 4609, Static105.aFloatArray11, 0);
		Static105.aFloatArray11[0] = -this.aFloat34 * this.aFloat27;
		Static105.aFloatArray11[1] = -this.aFloat34 * this.aFloat33;
		Static105.aFloatArray11[2] = -this.aFloat34 * this.aFloat22;
		Static105.aFloatArray11[3] = 1.0F;
		this.anOpengl2.glLightfv(16385, 4609, Static105.aFloatArray11, 0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2145(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([I)V")
	@Override
	public void method2174(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2513;
		arg0[1] = this.anInt2517;
		arg0[2] = this.anInt2498;
		arg0[3] = this.anInt2516;
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)Lclient!ac;")
	@Override
	public Class1_Sub2 method2210() {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(FF)V")
	public void method2289(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat21 = arg0;
		this.aFloat29 = arg1;
		if (!this.aBoolean248) {
			this.method2278();
		}
	}

	@OriginalMember(owner = "client!h", name = "eb", descriptor = "()V")
	private void method2290() {
		@Pc(2) float[] local2 = this.aFloatArray15;
		@Pc(14) float local14 = (float) (-this.lb * this.anInt2492) / (float) this.anInt2495;
		@Pc(28) float local28 = (float) ((this.anInt2490 - this.lb) * this.anInt2492) / (float) this.anInt2495;
		@Pc(39) float local39 = (float) (this.anInt2502 * this.anInt2492) / (float) this.anInt2501;
		@Pc(53) float local53 = (float) ((this.anInt2502 - this.anInt2489) * this.anInt2492) / (float) this.anInt2501;
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
			@Pc(67) float local67 = (float) this.anInt2492 * 2.0F;
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
			local2[10] = this.aFloat18 = (float) -(this.anInt2520 + this.anInt2492) / (float) (this.anInt2520 - this.anInt2492);
			local2[11] = -1.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = this.aFloat32 = -(local67 * (float) this.anInt2520) / (float) (this.anInt2520 - this.anInt2492);
			local2[15] = 0.0F;
		}
		this.method2260();
	}

	@OriginalMember(owner = "client!h", name = "o", descriptor = "(I)V")
	public void method2291(@OriginalArg(0) int arg0) {
		if (this.anInt2515 == arg0) {
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
		if (local10 != this.aBoolean236) {
			this.anOpengl2.glColorMask(local10, local10, local10, true);
			this.aBoolean236 = local10;
		}
		if (local12 != this.aBoolean244) {
			if (local12) {
				this.anOpengl2.glEnable(3008);
			} else {
				this.anOpengl2.glDisable(3008);
			}
			this.aBoolean244 = local12;
		}
		if (local8 != this.anInt2510) {
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
			this.anInt2510 = local8;
		}
		this.anInt2515 = arg0;
		this.anInt2512 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!h", name = "p", descriptor = "(I)I")
	public int method2292(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ts;Lclient!ts;FLclient!ts;)Lclient!ts;")
	@Override
	public Class114 method2139(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class114 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean234 && this.aBoolean228) {
			@Pc(11) Class114_Sub1_Sub1 local11 = null;
			@Pc(14) Class114_Sub1 local14 = (Class114_Sub1) arg0;
			@Pc(17) Class114_Sub1 local17 = (Class114_Sub1) arg1;
			@Pc(21) Class20_Sub2 local21 = local14.method4118();
			@Pc(25) Class20_Sub2 local25 = local17.method4118();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt2660 > local25.anInt2660 ? local21.anInt2660 : local25.anInt2660;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class114_Sub1_Sub1) {
					@Pc(52) Class114_Sub1_Sub1 local52 = (Class114_Sub1_Sub1) arg3;
					if (local52.method3121() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class114_Sub1_Sub1(this, local40);
				}
				local11.method3122(arg2, local25, local21);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!h", name = "v", descriptor = "()V")
	@Override
	public void method2209() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Lclient!ge;Lclient!wr;[Lclient!fi;I)V")
	@Override
	public void method2198(@OriginalArg(0) Class73[] arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class8_Sub3[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method3322(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2196() {
	}

	@OriginalMember(owner = "client!h", name = "q", descriptor = "()V")
	@Override
	public void method2184() {
		this.anInt2513 = 0;
		this.anInt2517 = 0;
		this.anInt2498 = this.anInt2490;
		this.anInt2516 = this.anInt2489;
		this.anOpengl2.glDisable(3089);
		this.method2279();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method2189(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2523 != arg0;
		if (local7 || this.aFloat35 != arg1 || this.aFloat34 != arg2) {
			this.anInt2523 = arg0;
			this.aFloat35 = arg1;
			this.aFloat34 = arg2;
			if (local7) {
				this.aFloat27 = (float) (this.anInt2523 & 0xFF0000) / 1.671168E7F;
				this.aFloat33 = (float) (this.anInt2523 & 0xFFFF) / 65535.0F;
				this.aFloat22 = (float) (this.anInt2523 & 0xFF) / 255.0F;
				this.method2297();
			}
			this.method2288();
		}
		if (this.aFloatArray13[0] == arg3 && this.aFloatArray13[1] == arg4 && this.aFloatArray13[2] == arg5) {
			return;
		}
		this.aFloatArray13[0] = arg3;
		this.aFloatArray13[1] = arg4;
		this.aFloatArray13[2] = arg5;
		this.aFloatArray12[0] = -arg3;
		this.aFloatArray12[1] = -arg4;
		this.aFloatArray12[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray16[0] = arg3 * local132;
		this.aFloatArray16[1] = arg4 * local132;
		this.aFloatArray16[2] = arg5 * local132;
		this.aFloatArray14[0] = -this.aFloatArray16[0];
		this.aFloatArray14[1] = -this.aFloatArray16[1];
		this.aFloatArray14[2] = -this.aFloatArray16[2];
		this.method2280();
		this.anInt2500 = (int) (arg3 * 256.0F / arg4);
		this.anInt2507 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(II)V")
	@Override
	public void method2204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2514 == arg0 && this.anInt2493 == arg1) {
			return;
		}
		this.anInt2514 = arg0;
		this.anInt2493 = arg1;
		if (!this.aBoolean248) {
			this.method2278();
			this.method2270();
		}
	}

	@OriginalMember(owner = "client!h", name = "fb", descriptor = "()V")
	public void method2293() {
		if (this.anInt2512 == 2) {
			return;
		}
		this.method2285();
		this.method2312(false);
		this.method2250(false);
		this.method2262(false);
		this.method2281(false);
		this.method2258();
		this.anInt2512 = 2;
	}

	@OriginalMember(owner = "client!h", name = "A", descriptor = "()V")
	@Override
	public void method2217() {
		if (this.anInt2490 <= 0 && this.anInt2489 <= 0) {
			return;
		}
		@Pc(9) int local9 = this.anInt2513;
		@Pc(12) int local12 = this.anInt2498;
		@Pc(15) int local15 = this.anInt2517;
		@Pc(18) int local18 = this.anInt2516;
		this.method2184();
		this.anOpengl2.glReadBuffer(1028);
		this.anOpengl2.glDrawBuffer(1029);
		this.method2268();
		this.method2312(false);
		this.method2250(false);
		this.method2262(false);
		this.method2281(false);
		this.method2287(null);
		this.method2258();
		this.method2282(0);
		this.method2291(0);
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRasterPos2i(0, 0);
		this.anOpengl2.glCopyPixels(0, 0, this.anInt2490, this.anInt2489, 6144);
		this.anOpengl2.glFlush();
		this.anOpengl2.glReadBuffer(1029);
		this.anOpengl2.glDrawBuffer(1029);
		this.method2226(local9, local15, local12, local18);
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "()Z")
	@Override
	public boolean method2160() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "gb", descriptor = "()V")
	private void method2294() {
		this.aClass109_Sub2_1 = new Class109_Sub2();
		this.aClass109_Sub2_2 = new Class109_Sub2();
		this.aClass20Array1 = new Class20[this.anInt2497];
		this.aClass20_Sub1_3 = new Class20_Sub1(this, 3553, 6408, 1, 1);
		this.aClass20_Sub1_4 = new Class20_Sub1(this, 3553, 6408, 1, 1);
		this.aClass20_Sub1_2 = new Class20_Sub1(this, 3553, 6408, 1, 1);
		this.aClass73_Sub2_3 = new Class73_Sub2(this);
		this.aClass73_Sub2_2 = new Class73_Sub2(this);
		this.aClass73_Sub2_1 = new Class73_Sub2(this);
		this.aClass73_Sub2_5 = new Class73_Sub2(this);
		this.aClass73_Sub2_6 = new Class73_Sub2(this);
		this.aClass73_Sub2_4 = new Class73_Sub2(this);
		if (this.aBoolean228) {
			this.aClass11_1 = new Class11(this);
		}
		this.aClass68_1.method1836(this);
	}

	@OriginalMember(owner = "client!h", name = "hb", descriptor = "()V")
	public void method2295() {
		if (this.anInt2509 != 2) {
			this.anInt2509 = 2;
			this.method2303();
			this.method2253();
			this.anInt2512 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!h", name = "q", descriptor = "(I)V")
	public synchronized void method2296(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub13 local4 = new Class1_Sub13(arg0);
		this.aClass16_13.method416(local4);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(F)V")
	@Override
	public void method2140(@OriginalArg(0) float arg0) {
		if (this.aFloat23 != arg0) {
			this.aFloat23 = arg0;
			this.method2297();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ac;)V")
	@Override
	public void method2176(@OriginalArg(0) Class1_Sub2 arg0) {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!fa;[Lclient!iq;Z)Lclient!ak;")
	@Override
	public Class9 method2199(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class99[] arg1) {
		return new Class9_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V")
	@Override
	public void method2239(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "ib", descriptor = "()V")
	private void method2297() {
		Static105.aFloatArray11[0] = this.aFloat23 * this.aFloat27;
		Static105.aFloatArray11[1] = this.aFloat23 * this.aFloat33;
		Static105.aFloatArray11[2] = this.aFloat23 * this.aFloat22;
		Static105.aFloatArray11[3] = 1.0F;
		this.anOpengl2.glLightModelfv(2899, Static105.aFloatArray11, 0);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
	@Override
	public void method2207(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "j", descriptor = "()Z")
	@Override
	public boolean method2163() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I")
	@Override
	public int method2173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ks;)V")
	public void method2298(@OriginalArg(0) Interface4 arg0) {
		if (this.anInterface4_2 != arg0 && this.aBoolean242) {
			this.anOpengl2.glBindBufferARB(34963, arg0.method2573());
			this.anInterface4_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IZZ)V")
	public void method2299(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt2518) {
			if (arg0 < 0) {
				this.method2313();
				this.method2287(null);
				if (!this.aBoolean248) {
					this.aClass98_1.method2632(0, arg2, arg1);
				}
			} else {
				@Pc(11) Class20_Sub1 local11 = this.aClass6_1.method198(arg0);
				@Pc(17) Class154 local17 = this.anInterface2_4.method4244(arg0);
				if (local17.aByte33 == 0 && local17.aByte31 == 0) {
					this.method2313();
				} else {
					@Pc(30) int local30 = local17.aBoolean440 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method2273((float) (this.anInt2487 % local34 * local17.aByte33) / (float) local34, (float) (this.anInt2487 % local34 * local17.aByte31) / (float) local34, 0.0F);
				}
				if (this.aBoolean248) {
					this.aClass98_1.method2632(3, arg2, arg1);
					this.method2287(local11);
				} else {
					this.aClass98_1.method2632(local17.aByte34, arg2, arg1);
					this.aClass98_1.method2631(local17.aByte32, false);
					if (!this.aClass98_1.method2630(local11)) {
						this.method2287(local11);
					}
				}
			}
			this.anInt2518 = arg0;
		}
		this.anInt2512 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "()V")
	@Override
	public void method2146() {
	}

	@OriginalMember(owner = "client!h", name = "L", descriptor = "()I")
	@Override
	public int method2240() {
		return 4;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIII)Lclient!c;")
	@Override
	public Class5 method2155(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class5_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!h", name = "jb", descriptor = "()V")
	private void method2300() {
		@Pc(11) float local11 = (float) -this.lb * this.aFloat31 / (float) this.anInt2495;
		@Pc(23) float local23 = (float) -this.anInt2502 * this.aFloat31 / (float) this.anInt2501;
		@Pc(37) float local37 = (float) (this.anInt2490 - this.lb) * this.aFloat31 / (float) this.anInt2495;
		@Pc(51) float local51 = (float) (this.anInt2489 - this.anInt2502) * this.aFloat31 / (float) this.anInt2501;
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		if (local11 != local37 && local51 != local23) {
			this.anOpengl2.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt2492 - this.aFloat37), (double) ((float) this.anInt2520 - this.aFloat37));
		}
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
	@Override
	public void method2211(@OriginalArg(0) int arg0) {
		this.method2274();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[BIZ)Lclient!ks;")
	public Interface4 method2301(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface4) (this.aBoolean242 && (!arg2 || this.aBoolean243) ? new Class69_Sub2(this, 5123, arg0, arg1, arg2) : new Class4_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ha;)V")
	public void method2302(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt2491 < 0 || this.anInterface3Array1[this.anInt2491] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface3Array1[this.anInt2491--] = null;
		arg0.method2244();
		if (this.anInt2491 >= 0) {
			this.anInterface3_1 = this.anInterface3Array1[this.anInt2491];
			this.anInterface3_1.method2246();
		}
	}

	@OriginalMember(owner = "client!h", name = "kb", descriptor = "()V")
	private void method2303() {
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadMatrixf(this.aFloatArray15, 0);
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!h", name = "y", descriptor = "()Z")
	@Override
	public boolean method2214() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "E", descriptor = "()I")
	@Override
	public int method2227() {
		return this.anInt2488 + this.anInt2485 + this.anInt2486;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I")
	@Override
	public int method2159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method2224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass20_Sub1_Sub1_1 == null || this.aClass20_Sub1_Sub1_1.anInt1599 < arg2 || this.aClass20_Sub1_Sub1_1.anInt1601 < arg3) {
			this.aClass20_Sub1_Sub1_1 = Static362.method1392(this, arg2, arg3, arg6);
			this.aClass20_Sub1_Sub1_1.method1388(false, false);
			local32 = this.aClass20_Sub1_Sub1_1.aFloat9;
			local36 = this.aClass20_Sub1_Sub1_1.aFloat8;
		} else {
			this.aClass20_Sub1_Sub1_1.method1386(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass20_Sub1_Sub1_1.aFloat9 * (float) arg3 / (float) this.aClass20_Sub1_Sub1_1.anInt1601;
			local36 = this.aClass20_Sub1_Sub1_1.aFloat8 * (float) arg2 / (float) this.aClass20_Sub1_Sub1_1.anInt1599;
		}
		this.method2293();
		this.method2287(this.aClass20_Sub1_Sub1_1);
		this.method2291(arg8);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method2254(arg5);
		this.method2255(34165, 34165);
		this.method2276(0, 34166, 768);
		this.method2276(2, 5890, 770);
		this.method2265(0, 34166);
		this.method2265(2, 5890);
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
		this.method2276(0, 5890, 768);
		this.method2276(2, 34166, 770);
		this.method2265(0, 5890);
		this.method2265(2, 34166);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method2161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2259();
		this.method2291(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method2148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2259();
		this.method2291(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!h", name = "r", descriptor = "(I)V")
	public synchronized void method2304(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub13 local4 = new Class1_Sub13(arg0);
		this.aClass16_12.method416(local4);
	}

	@OriginalMember(owner = "client!h", name = "B", descriptor = "()Lclient!wr;")
	@Override
	public Class109 method2221() {
		return new Class109_Sub2();
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "()V")
	@Override
	public void method2246() {
	}

	@OriginalMember(owner = "client!h", name = "l", descriptor = "()Z")
	@Override
	public boolean method2175() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I[BIZ)Lclient!va;")
	public Interface8 method2305(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface8) (this.aBoolean242 && (!arg3 || this.aBoolean243) ? new Class69_Sub1(this, arg0, arg1, arg2, arg3) : new Class4_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!h", name = "D", descriptor = "()I")
	@Override
	public int method2223() {
		return this.anInt2492;
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "()I")
	@Override
	public int method2151() {
		@Pc(2) int local2 = this.anInt2524;
		this.anInt2524 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!h", name = "lb", descriptor = "()V")
	private void method2306() {
		if (this.anInt2513 <= this.anInt2498 && this.anInt2517 <= this.anInt2516) {
			this.anOpengl2.glScissor(this.anInt2504 + this.anInt2513, this.anInt2503 + this.anInt2489 - this.anInt2516, this.anInt2498 - this.anInt2513, this.anInt2516 - this.anInt2517);
		} else {
			this.anOpengl2.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!h", name = "mb", descriptor = "()V")
	private void method2307() {
		this.method2258();
		for (@Pc(7) int local7 = this.anInt2497 - 1; local7 >= 0; local7--) {
			this.method2314(local7);
			this.method2287(null);
			this.anOpengl2.glTexEnvi(8960, 8704, 34160);
		}
		this.method2255(8448, 8448);
		this.method2276(2, 34168, 770);
		this.method2313();
		this.anInt2515 = 1;
		this.anOpengl2.glEnable(3042);
		this.anOpengl2.glBlendFunc(770, 771);
		this.anInt2510 = 1;
		this.anOpengl2.glEnable(3008);
		this.anOpengl2.glAlphaFunc(516, 0.0F);
		this.aBoolean244 = true;
		this.anOpengl2.glColorMask(true, true, true, true);
		this.aBoolean236 = true;
		this.method2312(true);
		this.method2250(true);
		this.method2262(true);
		this.method2281(true);
		this.method2268();
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
		this.anInt2523 = this.anInt2514 = -1;
		this.method2184();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2165(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method2209();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(FFFF)V")
	public void method2308(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static105.aFloatArray11[0] = arg0;
		Static105.aFloatArray11[1] = arg1;
		Static105.aFloatArray11[2] = arg2;
		Static105.aFloatArray11[3] = arg3;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static105.aFloatArray11, 0);
	}

	@OriginalMember(owner = "client!h", name = "G", descriptor = "()I")
	@Override
	public int method2230() {
		@Pc(2) int local2 = this.anInt2525;
		this.anInt2525 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!h", name = "H", descriptor = "()Z")
	@Override
	public boolean method2231() {
		if (!this.aClass1_Sub20_Sub1_1.method5570()) {
			if (!this.aClass178_1.method4713(this.aClass1_Sub20_Sub1_1)) {
				return false;
			}
			this.aClass6_1.method197();
		}
		return true;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "()I")
	@Override
	public int method2245() {
		return this.anInt2489;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!hf;IIII)Lclient!ge;")
	@Override
	public Class73 method2153(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class73_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(Z)V")
	public void method2309(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean229) {
			this.aBoolean229 = arg0;
			this.method2267();
		}
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(III)V")
	public void method2310(@OriginalArg(2) int arg0) {
		this.anOpengl2.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZ)Lclient!c;")
	@Override
	public Class5 method2219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class5_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "nb", descriptor = "()Lclient!hp;")
	public Class20_Sub2 method2311() {
		return this.aClass114_Sub1_1 == null ? null : this.aClass114_Sub1_1.method4118();
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIII)V")
	@Override
	protected void method2171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "(Z)V")
	public void method2312(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean231) {
			this.aBoolean231 = arg0;
			this.method2270();
			this.anInt2512 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)[I")
	@Override
	public int[] method2208() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl2.glReadPixels(0, this.anInt2489 - local6, 36, 1, 32993, this.anInt2499, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(IIIIII)Lclient!ts;")
	@Override
	public Class114 method2215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean234 ? new Class114_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!h", name = "ob", descriptor = "()V")
	private void method2313() {
		if (this.aBoolean235) {
			this.anOpengl2.glMatrixMode(5890);
			this.anOpengl2.glLoadIdentity();
			this.anOpengl2.glMatrixMode(5888);
			this.aBoolean235 = false;
		}
	}

	@OriginalMember(owner = "client!h", name = "s", descriptor = "(I)V")
	public void method2314(@OriginalArg(0) int arg0) {
		if (this.anInt2508 != arg0) {
			this.anOpengl2.glActiveTexture(arg0 + 33984);
			this.anInt2508 = arg0;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	@Override
	public void method2142(@OriginalArg(0) boolean arg0) {
		this.aBoolean226 = arg0;
		this.method2277();
	}

	@OriginalMember(owner = "client!h", name = "pb", descriptor = "()V")
	public void method2315() {
		if (this.anInt2512 == 8) {
			return;
		}
		this.method2295();
		this.method2312(true);
		this.method2262(true);
		this.method2281(true);
		this.method2291(1);
		this.method2282(1);
		this.anInt2512 = 8;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Lclient!ha;)V")
	public void method2316(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt2491 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2491 >= 0) {
			this.anInterface3Array1[this.anInt2491].method2244();
		}
		this.anInterface3_1 = this.anInterface3Array1[++this.anInt2491] = arg0;
		this.anInterface3_1.method2246();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass109_Sub2_1.aFloat62 * (float) arg0 + this.aClass109_Sub2_1.aFloat58 * (float) arg1 + this.aClass109_Sub2_1.aFloat56 * (float) arg2 + this.aClass109_Sub2_1.aFloat57;
		if (local24 < (float) this.anInt2492 || local24 > (float) this.anInt2520) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt2495 * (this.aClass109_Sub2_1.aFloat60 * (float) arg0 + this.aClass109_Sub2_1.aFloat63 * (float) arg1 + this.aClass109_Sub2_1.aFloat59 * (float) arg2 + this.aClass109_Sub2_1.aFloat55) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt2501 * (this.aClass109_Sub2_1.aFloat54 * (float) arg0 + this.aClass109_Sub2_1.aFloat61 * (float) arg1 + this.aClass109_Sub2_1.aFloat52 * (float) arg2 + this.aClass109_Sub2_1.aFloat53) / local24);
		if ((float) local81 >= this.aFloat28 && (float) local81 <= this.aFloat20 && (float) local113 >= this.aFloat24 && (float) local113 <= this.aFloat25) {
			arg3[0] = (int) ((float) local81 - this.aFloat28);
			arg3[1] = (int) ((float) local113 - this.aFloat24);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!h", name = "r", descriptor = "()V")
	@Override
	public void method2187() {
		if (this.aClass1_Sub20_Sub1_1.method5570()) {
			this.aClass178_1.method4711(this.aClass1_Sub20_Sub1_1);
			this.aClass6_1.method197();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	@Override
	public void method2147(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!h", name = "k", descriptor = "()Z")
	@Override
	public boolean method2166() {
		return this.aClass1_Sub20_Sub1_1.method5570();
	}

	@OriginalMember(owner = "client!h", name = "i", descriptor = "(II)V")
	public synchronized void method2317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub13 local4 = new Class1_Sub13(arg1);
		local4.aLong213 = arg0;
		this.aClass16_9.method416(local4);
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	@Override
	public void method2195(@OriginalArg(0) int arg0) {
		this.method2264();
	}

	@OriginalMember(owner = "client!h", name = "qb", descriptor = "()I")
	private int method2318() {
		@Pc(1) int local1 = 0;
		this.aString24 = this.anOpengl2.glGetString(7936);
		this.aString25 = this.anOpengl2.glGetString(7937);
		@Pc(17) String local17 = this.aString24.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl2.glGetString(7938);
		@Pc(53) String[] local53 = Static309.method5164(' ', local45.replace('.', ' '));
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static89.method1943(local53[0]);
				@Pc(69) int local69 = Static89.method1943(local53[1]);
				this.anInt2505 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt2505 < 12) {
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
		this.anInt2497 = local116[0];
		this.anOpengl2.glGetIntegerv(34929, local116, 0);
		this.anInt2496 = local116[0];
		this.anOpengl2.glGetIntegerv(34930, local116, 0);
		this.anInt2521 = local116[0];
		if (this.anInt2497 < 2 || this.anInt2496 < 2 || this.anInt2521 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean233 = Static207.aString41 != null && Static207.aString41.startsWith("mac");
		this.aBoolean240 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean242 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean227 = this.anOpengl2.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean239 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean241 = this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean230 = this.anOpengl2.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean245 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean234 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean237 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean247 = false;
		this.aBoolean228 = this.anOpengl2.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!h", name = "rb", descriptor = "()V")
	public void method2319() {
		if (this.anInt2512 == 16) {
			return;
		}
		this.method2275();
		this.method2312(true);
		this.method2262(true);
		this.method2281(true);
		this.method2291(1);
		this.method2282(1);
		this.anInt2512 = 16;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl2.glLineWidth((float) arg5);
		this.method2193(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl2.glLineWidth(1.0F);
	}
}
