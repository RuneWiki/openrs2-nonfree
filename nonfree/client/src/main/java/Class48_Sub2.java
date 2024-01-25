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

@OriginalClass("client!ic")
public final class Class48_Sub2 extends Class48 implements Interface9 {

	@OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
	public int anInt3044;

	@OriginalMember(owner = "client!ic", name = "E", descriptor = "Lclient!ti;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
	public int anInt3046;

	@OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
	private int anInt3048;

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
	public int anInt3049;

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
	public int anInt3050;

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
	public int anInt3052;

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "Z")
	public boolean aBoolean218;

	@OriginalMember(owner = "client!ic", name = "Y", descriptor = "Z")
	private boolean aBoolean219;

	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "F")
	private float aFloat11;

	@OriginalMember(owner = "client!ic", name = "bb", descriptor = "Lclient!rl;")
	public Class159_Sub2 aClass159_Sub2_1;

	@OriginalMember(owner = "client!ic", name = "db", descriptor = "I")
	private int anInt3055;

	@OriginalMember(owner = "client!ic", name = "eb", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!ic", name = "fb", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!ic", name = "gb", descriptor = "Lclient!rl;")
	public Class159_Sub2 aClass159_Sub2_2;

	@OriginalMember(owner = "client!ic", name = "hb", descriptor = "I")
	private int anInt3056;

	@OriginalMember(owner = "client!ic", name = "nb", descriptor = "Lclient!en;")
	private Class10_Sub1 aClass10_Sub1_1;

	@OriginalMember(owner = "client!ic", name = "ob", descriptor = "Z")
	private boolean aBoolean222;

	@OriginalMember(owner = "client!ic", name = "rb", descriptor = "Z")
	private boolean aBoolean223;

	@OriginalMember(owner = "client!ic", name = "sb", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!ic", name = "ub", descriptor = "F")
	private float aFloat16;

	@OriginalMember(owner = "client!ic", name = "vb", descriptor = "[Lclient!vd;")
	private Class81[] aClass81Array1;

	@OriginalMember(owner = "client!ic", name = "xb", descriptor = "Lclient!ij;")
	public Class21_Sub1 aClass21_Sub1_1;

	@OriginalMember(owner = "client!ic", name = "zb", descriptor = "Lclient!eb;")
	private Interface2 anInterface2_3;

	@OriginalMember(owner = "client!ic", name = "Ab", descriptor = "Z")
	private boolean aBoolean224;

	@OriginalMember(owner = "client!ic", name = "Bb", descriptor = "I")
	private int anInt3061;

	@OriginalMember(owner = "client!ic", name = "Db", descriptor = "Lclient!rl;")
	public Class159_Sub2 aClass159_Sub2_3;

	@OriginalMember(owner = "client!ic", name = "Eb", descriptor = "I")
	private int anInt3063;

	@OriginalMember(owner = "client!ic", name = "Fb", descriptor = "I")
	private int anInt3064;

	@OriginalMember(owner = "client!ic", name = "Hb", descriptor = "Z")
	public boolean aBoolean225;

	@OriginalMember(owner = "client!ic", name = "Lb", descriptor = "F")
	private float aFloat19;

	@OriginalMember(owner = "client!ic", name = "Mb", descriptor = "Lclient!rl;")
	public Class159_Sub2 aClass159_Sub2_4;

	@OriginalMember(owner = "client!ic", name = "Pb", descriptor = "Lclient!ij;")
	public Class21_Sub1 aClass21_Sub1_2;

	@OriginalMember(owner = "client!ic", name = "Qb", descriptor = "Lclient!rl;")
	public Class159_Sub2 aClass159_Sub2_5;

	@OriginalMember(owner = "client!ic", name = "Sb", descriptor = "Lclient!tr;")
	public Class81_Sub2 aClass81_Sub2_1;

	@OriginalMember(owner = "client!ic", name = "Tb", descriptor = "Z")
	public boolean aBoolean226;

	@OriginalMember(owner = "client!ic", name = "Vb", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!ic", name = "Wb", descriptor = "Z")
	public boolean aBoolean227;

	@OriginalMember(owner = "client!ic", name = "Yb", descriptor = "F")
	public float aFloat22;

	@OriginalMember(owner = "client!ic", name = "Zb", descriptor = "Z")
	private boolean aBoolean228;

	@OriginalMember(owner = "client!ic", name = "ac", descriptor = "I")
	private int anInt3071;

	@OriginalMember(owner = "client!ic", name = "dc", descriptor = "J")
	private long aLong84;

	@OriginalMember(owner = "client!ic", name = "ec", descriptor = "Z")
	private boolean aBoolean230;

	@OriginalMember(owner = "client!ic", name = "fc", descriptor = "Lclient!rl;")
	public Class159_Sub2 aClass159_Sub2_6;

	@OriginalMember(owner = "client!ic", name = "gc", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!ic", name = "hc", descriptor = "Lclient!tr;")
	public Class81_Sub2 aClass81_Sub2_2;

	@OriginalMember(owner = "client!ic", name = "jc", descriptor = "Z")
	private boolean aBoolean231;

	@OriginalMember(owner = "client!ic", name = "lc", descriptor = "Lclient!js;")
	public Class121 aClass121_1;

	@OriginalMember(owner = "client!ic", name = "mc", descriptor = "I")
	private int anInt3073;

	@OriginalMember(owner = "client!ic", name = "pc", descriptor = "Lclient!rl;")
	public Class159_Sub2 aClass159_Sub2_7;

	@OriginalMember(owner = "client!ic", name = "qc", descriptor = "Ljava/lang/String;")
	private String aString22;

	@OriginalMember(owner = "client!ic", name = "rc", descriptor = "I")
	public int anInt3074;

	@OriginalMember(owner = "client!ic", name = "sc", descriptor = "Z")
	private boolean aBoolean233;

	@OriginalMember(owner = "client!ic", name = "tc", descriptor = "I")
	public int anInt3075;

	@OriginalMember(owner = "client!ic", name = "vc", descriptor = "Lclient!tr;")
	public Class81_Sub2 aClass81_Sub2_3;

	@OriginalMember(owner = "client!ic", name = "wc", descriptor = "I")
	private int anInt3077;

	@OriginalMember(owner = "client!ic", name = "xc", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!ic", name = "yc", descriptor = "Z")
	private boolean aBoolean234;

	@OriginalMember(owner = "client!ic", name = "Cc", descriptor = "Lclient!lm;")
	private Class81_Sub2_Sub1 aClass81_Sub2_Sub1_2;

	@OriginalMember(owner = "client!ic", name = "Dc", descriptor = "Z")
	public boolean aBoolean235;

	@OriginalMember(owner = "client!ic", name = "Ec", descriptor = "I")
	private int anInt3080;

	@OriginalMember(owner = "client!ic", name = "Gc", descriptor = "Lclient!rl;")
	public Class159_Sub2 aClass159_Sub2_8;

	@OriginalMember(owner = "client!ic", name = "Ic", descriptor = "I")
	private int anInt3081;

	@OriginalMember(owner = "client!ic", name = "Lc", descriptor = "Ljava/lang/String;")
	private String aString23;

	@OriginalMember(owner = "client!ic", name = "Nc", descriptor = "Z")
	public boolean aBoolean239;

	@OriginalMember(owner = "client!ic", name = "Qc", descriptor = "I")
	private int anInt3085;

	@OriginalMember(owner = "client!ic", name = "Sc", descriptor = "Lclient!hs;")
	private Interface6 anInterface6_2;

	@OriginalMember(owner = "client!ic", name = "Uc", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!ic", name = "Vc", descriptor = "I")
	public int anInt3087;

	@OriginalMember(owner = "client!ic", name = "Xc", descriptor = "Z")
	private boolean aBoolean240;

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "Lclient!du;")
	private final Class60 aClass60_1 = new Class60();

	@OriginalMember(owner = "client!ic", name = "B", descriptor = "Lclient!bd;")
	private final Class21 aClass21_6 = new Class21_Sub1();

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
	private int anInt3047 = -1;

	@OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
	public final int anInt3045 = 8;

	@OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
	public final int anInt3051 = 3;

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "[Lclient!ti;")
	private final Interface9[] anInterface9Array1 = new Interface9[4];

	@OriginalMember(owner = "client!ic", name = "M", descriptor = "Lclient!vf;")
	private final Class238 aClass238_10 = new Class238();

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "Lclient!vf;")
	private final Class238 aClass238_11 = new Class238();

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "Lclient!vf;")
	private final Class238 aClass238_12 = new Class238();

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "Lclient!vf;")
	private final Class238 aClass238_13 = new Class238();

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "Lclient!vf;")
	private final Class238 aClass238_14 = new Class238();

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "Lclient!vf;")
	private final Class238 aClass238_15 = new Class238();

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "Lclient!vf;")
	private final Class238 aClass238_16 = new Class238();

	@OriginalMember(owner = "client!ic", name = "cb", descriptor = "I")
	private int anInt3054 = 0;

	@OriginalMember(owner = "client!ic", name = "lb", descriptor = "[F")
	public final float[] lb = new float[4];

	@OriginalMember(owner = "client!ic", name = "qb", descriptor = "I")
	public int anInt3059 = 3584;

	@OriginalMember(owner = "client!ic", name = "jb", descriptor = "I")
	public int anInt3058 = 512;

	@OriginalMember(owner = "client!ic", name = "pb", descriptor = "[F")
	private final float[] aFloatArray15 = new float[4];

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "F")
	public float aFloat10 = -1.0F;

	@OriginalMember(owner = "client!ic", name = "tb", descriptor = "F")
	private float aFloat15 = 1.0F;

	@OriginalMember(owner = "client!ic", name = "Ob", descriptor = "I")
	private int anInt3067 = 8448;

	@OriginalMember(owner = "client!ic", name = "Rb", descriptor = "I")
	private int anInt3068 = -1;

	@OriginalMember(owner = "client!ic", name = "ib", descriptor = "I")
	public int anInt3057 = 50;

	@OriginalMember(owner = "client!ic", name = "Cb", descriptor = "I")
	public int anInt3062 = 0;

	@OriginalMember(owner = "client!ic", name = "nc", descriptor = "F")
	private float aFloat25 = 0.0F;

	@OriginalMember(owner = "client!ic", name = "Kb", descriptor = "I")
	public int anInt3066 = -1;

	@OriginalMember(owner = "client!ic", name = "Ub", descriptor = "I")
	private int anInt3069 = 0;

	@OriginalMember(owner = "client!ic", name = "yb", descriptor = "F")
	public float aFloat17 = -1.0F;

	@OriginalMember(owner = "client!ic", name = "ic", descriptor = "F")
	public float aFloat24 = 1.0F;

	@OriginalMember(owner = "client!ic", name = "Nb", descriptor = "F")
	public float aFloat20 = 1.0F;

	@OriginalMember(owner = "client!ic", name = "Ib", descriptor = "[F")
	private final float[] aFloatArray16 = new float[4];

	@OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
	private int anInt3053 = 0;

	@OriginalMember(owner = "client!ic", name = "wb", descriptor = "I")
	private int anInt3060 = 0;

	@OriginalMember(owner = "client!ic", name = "bc", descriptor = "I")
	public int anInt3072 = -1;

	@OriginalMember(owner = "client!ic", name = "Gb", descriptor = "F")
	public float aFloat18 = 3584.0F;

	@OriginalMember(owner = "client!ic", name = "kc", descriptor = "[F")
	private final float[] aFloatArray17 = new float[4];

	@OriginalMember(owner = "client!ic", name = "Xb", descriptor = "I")
	public int anInt3070 = 512;

	@OriginalMember(owner = "client!ic", name = "Ac", descriptor = "F")
	public float aFloat27 = 3584.0F;

	@OriginalMember(owner = "client!ic", name = "Hc", descriptor = "F")
	private float aFloat28 = 1.0F;

	@OriginalMember(owner = "client!ic", name = "Mc", descriptor = "I")
	private int anInt3082 = 8448;

	@OriginalMember(owner = "client!ic", name = "Pc", descriptor = "I")
	private int anInt3084 = 0;

	@OriginalMember(owner = "client!ic", name = "Rc", descriptor = "I")
	public int anInt3086 = 0;

	@OriginalMember(owner = "client!ic", name = "Oc", descriptor = "I")
	private int anInt3083 = 0;

	@OriginalMember(owner = "client!ic", name = "Bc", descriptor = "I")
	public int anInt3079 = 0;

	@OriginalMember(owner = "client!ic", name = "uc", descriptor = "I")
	private int anInt3076 = -1;

	@OriginalMember(owner = "client!ic", name = "Jc", descriptor = "Z")
	private boolean aBoolean237 = true;

	@OriginalMember(owner = "client!ic", name = "Jb", descriptor = "I")
	private int anInt3065 = 0;

	@OriginalMember(owner = "client!ic", name = "Wc", descriptor = "F")
	public float aFloat30 = 1.0F;

	@OriginalMember(owner = "client!ic", name = "Tc", descriptor = "[F")
	private final float[] aFloatArray18 = new float[16];

	@OriginalMember(owner = "client!ic", name = "Yc", descriptor = "I")
	public int anInt3088 = -1;

	@OriginalMember(owner = "client!ic", name = "y", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas3;

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!ic", name = "u", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl2;

	@OriginalMember(owner = "client!ic", name = "zc", descriptor = "I")
	public final int anInt3078;

	@OriginalMember(owner = "client!ic", name = "oc", descriptor = "Z")
	private boolean aBoolean232;

	@OriginalMember(owner = "client!ic", name = "Fc", descriptor = "Z")
	public boolean aBoolean236;

	@OriginalMember(owner = "client!ic", name = "Kc", descriptor = "Z")
	public boolean aBoolean238;

	@OriginalMember(owner = "client!ic", name = "mb", descriptor = "Z")
	public boolean aBoolean221;

	@OriginalMember(owner = "client!ic", name = "kb", descriptor = "Z")
	private boolean aBoolean220;

	@OriginalMember(owner = "client!ic", name = "cc", descriptor = "Z")
	public boolean aBoolean229;

	@OriginalMember(owner = "client!ic", name = "x", descriptor = "Lclient!hp;")
	public final Class100 aClass100_1;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "Lclient!wf;")
	private final Class245 aClass245_1;

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "Lclient!wp;")
	private final Class249 aClass249_1;

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "Lclient!jn;")
	private final Class2_Sub21_Sub1 aClass2_Sub21_Sub1_1;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!eg;IILclient!kd;)V")
	public Class48_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class123 arg4) {
		super(arg2, arg1);
		this.aCanvas3 = arg0;
		@Pc(185) int local185 = 0;
		while (!this.aCanvas3.isShowing()) {
			if (local185++ > 5) {
				throw new RuntimeException("");
			}
			Static215.method3855(1000L);
		}
		this.aCanvas3.setIgnoreRepaint(true);
		try {
			if (Static143.aBoolean216 == null || !Static143.aBoolean216) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static143.aBoolean216 = Boolean.TRUE;
				} else {
					@Pc(219) Class86 local219 = arg4.method3254(this.getClass());
					while (local219.anInt2590 == 0) {
						Static215.method3855(100L);
					}
					if (local219.anInt2590 == 1) {
						Static143.aBoolean216 = Boolean.TRUE;
					}
				}
			}
			if (Static143.aBoolean216 == null || !Static143.aBoolean216) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas3, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method2553();
				this.anOpengl2 = this.aContext1.getGL();
				@Pc(286) int local286 = this.method2612();
				if (local286 != 0) {
					throw new RuntimeException("");
				}
				this.anInt3078 = this.aBoolean218 ? 33639 : 5121;
				@Pc(305) String local305 = this.aString23.toLowerCase();
				@Pc(309) String local309 = this.aString22.toLowerCase();
				if (local309.indexOf("radeon") != -1) {
					@Pc(316) int local316 = 0;
					@Pc(318) boolean local318 = false;
					@Pc(320) boolean local320 = false;
					@Pc(328) String[] local328 = Static71.method1265(local309.replace('/', ' '), ' ');
					for (@Pc(330) int local330 = 0; local330 < local328.length; local330++) {
						@Pc(338) String local338 = local328[local330];
						try {
							if (local338.length() > 0) {
								if (local338.charAt(0) == 'x' && local338.length() >= 3 && Static84.method1453(local338.substring(1, 3))) {
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
									if (local338.length() >= 4 && Static84.method1453(local338.substring(0, 4))) {
										local316 = Static335.method5402(local338.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(402) Exception local402) {
						}
					}
					if (!local320 && !local318) {
						if (local316 >= 7000 && local316 <= 7999) {
							this.aBoolean232 = false;
						}
						if (local316 >= 7000 && local316 <= 9250) {
							this.aBoolean236 = false;
						}
					}
					if (!local318 || local316 < 4000) {
						this.aBoolean238 = false;
					}
					this.aBoolean221 &= this.anOpengl2.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean220 = this.aBoolean232;
				}
				if (local305.contains("intel")) {
					this.aBoolean229 = false;
				}
				if (this.aBoolean232) {
					try {
						@Pc(460) int[] local460 = new int[1];
						this.anOpengl2.glGenBuffersARB(1, local460, 0);
					} catch (@Pc(468) Throwable local468) {
						throw new RuntimeException("", local468);
					}
				}
				this.method2556(this);
				this.method2471();
				this.method2594();
				new Class228(this);
				this.aClass100_1 = new Class100(this, this.anInterface3_4);
				Static119.method2125(true);
				this.aBoolean217 = true;
				this.aClass245_1 = new Class245(this);
				this.aClass249_1 = new Class249(this);
				this.aClass2_Sub21_Sub1_1 = new Class2_Sub21_Sub1(this);
				this.method2567();
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
						Static215.method3855(100L);
					}
				}
				this.anOpengl2.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(552) Throwable local552) {
			local552.printStackTrace();
			this.method2468();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local552);
		}
	}

	@OriginalMember(owner = "client!ic", name = "M", descriptor = "()V")
	private void method2553() {
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
			Static215.method3855(1000L);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2525() {
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)V")
	public void method2554(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method2605(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
	@Override
	public void method2452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3054 < arg0) {
			this.anInt3054 = arg0;
		}
		if (this.anInt3083 > arg2) {
			this.anInt3083 = arg2;
		}
		if (this.anInt3065 < arg1) {
			this.anInt3065 = arg1;
		}
		if (this.anInt3053 > arg3) {
			this.anInt3053 = arg3;
		}
		this.anOpengl2.glEnable(3089);
		this.method2591();
		this.method2568();
	}

	@OriginalMember(owner = "client!ic", name = "u", descriptor = "()V")
	@Override
	public void method2503() {
		this.method2603(true);
		this.anOpengl2.glClear(256);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V")
	@Override
	public void method2499(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ic", name = "N", descriptor = "()V")
	private void method2555() {
		if (this.anInt3073 == 1) {
			return;
		}
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		if (this.anInt3052 > 0 && this.anInt3044 > 0) {
			this.anOpengl2.glOrtho(0.0D, (double) this.anInt3052, (double) this.anInt3044, 0.0D, -1.0D, 1.0D);
		}
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anInt3073 = 1;
		this.anInt3080 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "()Lclient!bd;")
	@Override
	public Class21 method2483() {
		return new Class21_Sub1();
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "()I")
	@Override
	public int method2446() {
		return 4;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!kp;IIII)Lclient!qh;")
	@Override
	public Class159 method2540(@OriginalArg(0) Class130 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class159_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(IIIIII)Z")
	@Override
	public boolean method2497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass21_Sub1_1.aFloat35 * (float) arg0 + this.aClass21_Sub1_1.aFloat39 * (float) arg1 + this.aClass21_Sub1_1.aFloat33 * (float) arg2 + this.aClass21_Sub1_1.aFloat38;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass21_Sub1_1.aFloat35 * (float) arg3 + this.aClass21_Sub1_1.aFloat39 * (float) arg4 + this.aClass21_Sub1_1.aFloat33 * (float) arg5 + this.aClass21_Sub1_1.aFloat38;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt3057 && local55 < (float) this.anInt3057 || !(!(local24 > (float) this.anInt3059) || !(local55 > (float) this.anInt3059))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt3058 * (this.aClass21_Sub1_1.aFloat37 * (float) arg0 + this.aClass21_Sub1_1.aFloat40 * (float) arg1 + this.aClass21_Sub1_1.aFloat41 * (float) arg2 + this.aClass21_Sub1_1.aFloat32) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt3058 * (this.aClass21_Sub1_1.aFloat37 * (float) arg3 + this.aClass21_Sub1_1.aFloat40 * (float) arg4 + this.aClass21_Sub1_1.aFloat41 * (float) arg5 + this.aClass21_Sub1_1.aFloat32) / local55);
		if ((float) local119 < this.aFloat23 && (float) local151 < this.aFloat23 || (float) local119 > this.aFloat12 && (float) local151 > this.aFloat12) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt3070 * (this.aClass21_Sub1_1.aFloat31 * (float) arg0 + this.aClass21_Sub1_1.aFloat34 * (float) arg1 + this.aClass21_Sub1_1.aFloat42 * (float) arg2 + this.aClass21_Sub1_1.aFloat36) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt3070 * (this.aClass21_Sub1_1.aFloat31 * (float) arg3 + this.aClass21_Sub1_1.aFloat34 * (float) arg4 + this.aClass21_Sub1_1.aFloat42 * (float) arg5 + this.aClass21_Sub1_1.aFloat36) / local55);
			return (!((float) local209 < this.aFloat26) || !((float) local241 < this.aFloat26)) && (!((float) local209 > this.aFloat13) || !((float) local241 > this.aFloat13));
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ti;)V")
	public void method2556(@OriginalArg(0) Interface9 arg0) {
		if (this.anInt3047 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3047 >= 0) {
			this.anInterface9Array1[this.anInt3047].method3023();
		}
		this.anInterface9_1 = this.anInterface9Array1[++this.anInt3047] = arg0;
		this.anInterface9_1.method3021();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!eb;")
	public Interface2 method2557(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface2) (this.aBoolean232 ? new Class94_Sub1(this, arg0, arg1, false) : new Class99_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method2501(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class2_Sub16 local16;
		while (!this.aClass238_11.method5805()) {
			local16 = (Class2_Sub16) this.aClass238_11.method5803();
			Static143.anIntArray237[local1++] = (int) local16.aLong213;
			this.anInt3049 -= local16.anInt2601;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteBuffersARB(local1, Static143.anIntArray237, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteBuffersARB(local1, Static143.anIntArray237, 0);
			local1 = 0;
		}
		while (!this.aClass238_12.method5805()) {
			local16 = (Class2_Sub16) this.aClass238_12.method5803();
			Static143.anIntArray237[local1++] = (int) local16.aLong213;
			this.anInt3046 -= local16.anInt2601;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteTextures(local1, Static143.anIntArray237, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteTextures(local1, Static143.anIntArray237, 0);
			local1 = 0;
		}
		while (!this.aClass238_13.method5805()) {
			local16 = (Class2_Sub16) this.aClass238_13.method5803();
			Static143.anIntArray237[local1++] = local16.anInt2601;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteFramebuffersEXT(local1, Static143.anIntArray237, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteFramebuffersEXT(local1, Static143.anIntArray237, 0);
			local1 = 0;
		}
		while (!this.aClass238_14.method5805()) {
			local16 = (Class2_Sub16) this.aClass238_14.method5803();
			Static143.anIntArray237[local1++] = (int) local16.aLong213;
			this.anInt3048 -= local16.anInt2601;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static143.anIntArray237, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static143.anIntArray237, 0);
			local1 = 0;
		}
		while (!this.aClass238_15.method5805()) {
			local16 = (Class2_Sub16) this.aClass238_15.method5803();
			Static143.anIntArray237[local1++] = (int) local16.aLong213;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteProgramsARB(local1, Static143.anIntArray237, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteProgramsARB(local1, Static143.anIntArray237, 0);
		}
		while (!this.aClass238_10.method5805()) {
			local16 = (Class2_Sub16) this.aClass238_10.method5803();
			this.anOpengl2.glDeleteLists((int) local16.aLong213, local16.anInt2601);
		}
		while (!this.aClass238_16.method5805()) {
			local16 = (Class2_Sub16) this.aClass238_16.method5803();
			this.anOpengl2.glDeleteObjectARB(local16.anInt2601);
		}
		while (!this.aClass238_10.method5805()) {
			local16 = (Class2_Sub16) this.aClass238_10.method5803();
			this.anOpengl2.glDeleteLists((int) local16.aLong213, local16.anInt2601);
		}
		if (this.method2546() > 100663296 && Static101.method1805() > this.aLong84 + 60000L) {
			System.gc();
			this.aLong84 = Static101.method1805();
		}
		this.anInt3050 = local5;
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(IIII)V")
	@Override
	public void method2496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt3052) {
			arg2 = this.anInt3052;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt3044) {
			arg3 = this.anInt3044;
		}
		this.anInt3054 = arg0;
		this.anInt3065 = arg1;
		this.anInt3083 = arg2;
		this.anInt3053 = arg3;
		this.anOpengl2.glEnable(3089);
		this.method2591();
		this.method2568();
	}

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "()V")
	@Override
	public void method2505() {
		this.anInt3054 = 0;
		this.anInt3065 = 0;
		this.anInt3083 = this.anInt3052;
		this.anInt3053 = this.anInt3044;
		this.anOpengl2.glDisable(3089);
		this.method2591();
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(Z)V")
	public void method2558(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean228) {
			this.aBoolean228 = arg0;
			this.method2584();
			this.anInt3080 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "()V")
	private void method2559() {
		Static143.aFloatArray13[0] = this.aFloat29 * this.aFloat20;
		Static143.aFloatArray13[1] = this.aFloat29 * this.aFloat24;
		Static143.aFloatArray13[2] = this.aFloat29 * this.aFloat30;
		Static143.aFloatArray13[3] = 1.0F;
		this.anOpengl2.glLightModelfv(2899, Static143.aFloatArray13, 0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([IIIII)Lclient!rg;")
	@Override
	public Class27 method2456(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class27_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "()Lclient!ti;")
	public Interface9 method2560() {
		return this.anInterface9_1;
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(II)V")
	public synchronized void method2561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub16 local4 = new Class2_Sub16(arg1);
		local4.aLong213 = arg0;
		this.aClass238_11.method5796(local4);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!hs;)V")
	public void method2562(@OriginalArg(0) Interface6 arg0) {
		if (this.anInterface6_2 != arg0 && this.aBoolean232) {
			this.anOpengl2.glBindBufferARB(34963, arg0.method5135());
			this.anInterface6_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "()Z")
	@Override
	public boolean method2453() {
		return true;
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(II)V")
	public void method2563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3081 != 0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt3067 != arg0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anInt3067 = arg0;
			local4 = true;
		}
		if (this.anInt3082 != arg1) {
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			this.anInt3082 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt3080 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[BIZ)Lclient!eb;")
	public Interface2 method2564(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface2) (this.aBoolean232 && (!arg3 || this.aBoolean220) ? new Class94_Sub1(this, arg0, arg1, arg2, arg3) : new Class99_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "()V")
	public void method2565() {
		this.anOpengl2.glPopMatrix();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([Lclient!qh;Lclient!cd;Lclient!bd;[Lclient!qt;I)V")
	@Override
	public void method2541(@OriginalArg(0) Class159[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Class7_Sub6[] arg3, @OriginalArg(4) int arg4) {
		this.method2477(arg0, arg2, arg3, arg4);
		this.method2516(arg1);
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(IIIII)V")
	@Override
	public void method2532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2620();
		this.method2569(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)V")
	public void method2566(@OriginalArg(0) int arg0) {
		if (this.anInt3081 != arg0) {
			this.anOpengl2.glActiveTexture(arg0 + 33984);
			this.anInt3081 = arg0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "()V")
	private void method2567() {
		this.method2589();
		for (@Pc(7) int local7 = this.anInt3075 - 1; local7 >= 0; local7--) {
			this.method2566(local7);
			this.method2573(null);
			this.anOpengl2.glTexEnvi(8960, 8704, 34160);
		}
		this.method2563(8448, 8448);
		this.method2611(2, 34168, 770);
		this.method2619();
		this.anInt3071 = 1;
		this.anOpengl2.glEnable(3042);
		this.anOpengl2.glBlendFunc(770, 771);
		this.anInt3064 = 1;
		this.anOpengl2.glEnable(3008);
		this.anOpengl2.glAlphaFunc(516, 0.0F);
		this.aBoolean231 = true;
		this.anOpengl2.glColorMask(true, true, true, true);
		this.aBoolean223 = true;
		this.method2600(true);
		this.method2558(true);
		this.method2582(true);
		this.method2603(true);
		this.method2578();
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
		this.anInt3068 = this.anInt3088 = -1;
		this.method2505();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method2522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass81_Sub2_Sub1_2 == null || this.aClass81_Sub2_Sub1_2.anInt4125 < arg2 || this.aClass81_Sub2_Sub1_2.anInt4124 < arg3) {
			this.aClass81_Sub2_Sub1_2 = Static400.method3642(arg2, arg6, this, arg3);
			this.aClass81_Sub2_Sub1_2.method3640(false, false);
			local32 = this.aClass81_Sub2_Sub1_2.aFloat49;
			local36 = this.aClass81_Sub2_Sub1_2.aFloat50;
		} else {
			this.aClass81_Sub2_Sub1_2.method3639(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass81_Sub2_Sub1_2.aFloat49 * (float) arg3 / (float) this.aClass81_Sub2_Sub1_2.anInt4124;
			local36 = this.aClass81_Sub2_Sub1_2.aFloat50 * (float) arg2 / (float) this.aClass81_Sub2_Sub1_2.anInt4125;
		}
		this.method2576();
		this.method2573(this.aClass81_Sub2_Sub1_2);
		this.method2569(arg8);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method2585(arg5);
		this.method2563(34165, 34165);
		this.method2611(0, 34166, 768);
		this.method2611(2, 5890, 770);
		this.method2575(0, 34166);
		this.method2575(2, 5890);
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
		this.method2611(0, 5890, 768);
		this.method2611(2, 34166, 770);
		this.method2575(0, 5890);
		this.method2575(2, 34166);
	}

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "()V")
	private void method2568() {
		if (this.anInt3054 <= this.anInt3083 && this.anInt3065 <= this.anInt3053) {
			this.anOpengl2.glScissor(this.anInt3069 + this.anInt3054, this.anInt3060 + this.anInt3044 - this.anInt3053, this.anInt3083 - this.anInt3054, this.anInt3053 - this.anInt3065);
		} else {
			this.anOpengl2.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!hg;II)V")
	@Override
	public void method2513(@OriginalArg(1) Class8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class8_Sub2 local2 = (Class8_Sub2) arg0;
		@Pc(5) Class81_Sub2_Sub1 local5 = local2.aClass81_Sub2_Sub1_5;
		this.method2576();
		this.method2573(local2.aClass81_Sub2_Sub1_5);
		this.method2569(1);
		this.method2563(7681, 8448);
		this.method2611(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat50 / (float) local5.anInt4127;
		@Pc(37) float local37 = local5.aFloat49 / (float) local5.anInt4128;
		this.anOpengl2.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt3054 - arg1), local37 * (float) (this.anInt3065 - arg2));
		this.anOpengl2.glVertex2i(this.anInt3054, this.anInt3065);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt3054 - arg1), local37 * (float) (this.anInt3053 - arg2));
		this.anOpengl2.glVertex2i(this.anInt3054, this.anInt3053);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt3083 - arg1), local37 * (float) (this.anInt3053 - arg2));
		this.anOpengl2.glVertex2i(this.anInt3083, this.anInt3053);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt3083 - arg1), local37 * (float) (this.anInt3065 - arg2));
		this.anOpengl2.glVertex2i(this.anInt3083, this.anInt3065);
		this.anOpengl2.glEnd();
		this.method2611(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[Lclient!hq;)V")
	@Override
	public void method2474(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub8[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class2_Sub8 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static143.aFloatArray14[0] = local8.anInt1379;
			Static143.aFloatArray14[1] = local8.anInt1375;
			Static143.aFloatArray14[2] = local8.anInt1377;
			Static143.aFloatArray14[3] = 1.0F;
			this.anOpengl2.glLightfv(local12, 4611, Static143.aFloatArray14, 0);
			@Pc(44) int local44 = local8.anInt1378;
			@Pc(49) float local49 = local8.aFloat7 / 255.0F;
			Static143.aFloatArray14[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static143.aFloatArray14[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static143.aFloatArray14[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl2.glLightfv(local12, 4609, Static143.aFloatArray14, 0);
			this.anOpengl2.glLightf(local12, 4617, 1.0F / (float) (local8.anInt1374 * local8.anInt1374));
			this.anOpengl2.glEnable(local12);
		}
		while (local1 < this.anInt3084) {
			this.anOpengl2.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt3084 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)V")
	public void method2569(@OriginalArg(0) int arg0) {
		if (this.anInt3071 == arg0) {
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
		if (local10 != this.aBoolean223) {
			this.anOpengl2.glColorMask(local10, local10, local10, true);
			this.aBoolean223 = local10;
		}
		if (local12 != this.aBoolean231) {
			if (local12) {
				this.anOpengl2.glEnable(3008);
			} else {
				this.anOpengl2.glDisable(3008);
			}
			this.aBoolean231 = local12;
		}
		if (local8 != this.anInt3064) {
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
			this.anInt3064 = local8;
		}
		this.anInt3071 = arg0;
		this.anInt3080 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ij;)V")
	public void method2570(@OriginalArg(0) Class21_Sub1 arg0) {
		this.anOpengl2.glPushMatrix();
		this.anOpengl2.glMultMatrixf(arg0.method2683(), 0);
	}

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "()Z")
	@Override
	public boolean method2542() {
		return this.aClass2_Sub21_Sub1_1.method2936();
	}

	@OriginalMember(owner = "client!ic", name = "D", descriptor = "()V")
	@Override
	public void method2529() {
		if (this.anInt3052 <= 0 && this.anInt3044 <= 0) {
			return;
		}
		@Pc(9) int local9 = this.anInt3054;
		@Pc(12) int local12 = this.anInt3083;
		@Pc(15) int local15 = this.anInt3065;
		@Pc(18) int local18 = this.anInt3053;
		this.method2505();
		this.anOpengl2.glReadBuffer(1028);
		this.anOpengl2.glDrawBuffer(1029);
		this.method2578();
		this.method2600(false);
		this.method2558(false);
		this.method2582(false);
		this.method2603(false);
		this.method2573(null);
		this.method2589();
		this.method2609(0);
		this.method2569(0);
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRasterPos2i(0, 0);
		this.anOpengl2.glCopyPixels(0, 0, this.anInt3052, this.anInt3044, 6144);
		this.anOpengl2.glFlush();
		this.anOpengl2.glReadBuffer(1029);
		this.anOpengl2.glDrawBuffer(1029);
		this.method2496(local9, local15, local12, local18);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl2.glLineWidth((float) arg5);
		this.method2490(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl2.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
	@Override
	public void method2487(@OriginalArg(0) boolean arg0) {
		this.aBoolean237 = arg0;
		this.method2597();
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(FF)V")
	public void method2571(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat15 = arg0;
		this.aFloat25 = arg1;
		if (!this.aBoolean239) {
			this.method2622();
		}
	}

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "(I)V")
	public synchronized void method2572(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub16 local4 = new Class2_Sub16(arg0);
		this.aClass238_16.method5796(local4);
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "()V")
	@Override
	public void method3023() {
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!vd;)V")
	public void method2573(@OriginalArg(0) Class81 arg0) {
		@Pc(5) Class81 local5 = this.aClass81Array1[this.anInt3081];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl2.glDisable(local5.anInt4831);
			} else {
				if (local5 == null) {
					this.anOpengl2.glEnable(arg0.anInt4831);
				} else if (arg0.anInt4831 != local5.anInt4831) {
					this.anOpengl2.glDisable(local5.anInt4831);
					this.anOpengl2.glEnable(arg0.anInt4831);
				}
				this.anOpengl2.glBindTexture(arg0.anInt4831, arg0.method4344());
			}
			this.aClass81Array1[this.anInt3081] = arg0;
		}
		this.anInt3080 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "(I)V")
	public synchronized void method2574(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub16 local4 = new Class2_Sub16(arg0);
		this.aClass238_15.method5796(local4);
	}

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)V")
	@Override
	public void method2518(@OriginalArg(0) int arg0) {
		this.method2553();
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(IIII)V")
	@Override
	public void method2485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean239) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt3076 = arg1;
		this.anInt3066 = arg2;
		this.anInt3086 = arg3;
		this.method2622();
		this.aClass245_1.method5993(arg0, true);
	}

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "()F")
	@Override
	public float method2462() {
		return this.aFloat22;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
	public void method2575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!aj;Lclient!aj;FLclient!aj;)Lclient!aj;")
	@Override
	public Class10 method2506(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class10 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean235 && this.aBoolean229) {
			@Pc(11) Class10_Sub1_Sub2 local11 = null;
			@Pc(14) Class10_Sub1 local14 = (Class10_Sub1) arg0;
			@Pc(17) Class10_Sub1 local17 = (Class10_Sub1) arg1;
			@Pc(21) Class81_Sub3 local21 = local14.method5620();
			@Pc(25) Class81_Sub3 local25 = local17.method5620();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt4461 > local25.anInt4461 ? local21.anInt4461 : local25.anInt4461;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class10_Sub1_Sub2) {
					@Pc(52) Class10_Sub1_Sub2 local52 = (Class10_Sub1_Sub2) arg3;
					if (local52.method5622() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class10_Sub1_Sub2(this, local40);
				}
				local11.method5621(local21, arg2, local25);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "()Z")
	@Override
	public boolean method2454() {
		return true;
	}

	@OriginalMember(owner = "client!ic", name = "z", descriptor = "()F")
	@Override
	public float method2517() {
		return this.aFloat21;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(F)V")
	@Override
	public void method2498(@OriginalArg(0) float arg0) {
		if (this.aFloat29 != arg0) {
			this.aFloat29 = arg0;
			this.method2559();
		}
	}

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "()V")
	public void method2576() {
		if (this.anInt3080 == 2) {
			return;
		}
		this.method2555();
		this.method2600(false);
		this.method2558(false);
		this.method2582(false);
		this.method2603(false);
		this.method2589();
		this.anInt3080 = 2;
	}

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "()V")
	public void method2577() {
		if (this.anInt3080 == 4) {
			return;
		}
		this.method2555();
		this.method2600(false);
		this.method2558(false);
		this.method2582(false);
		this.method2603(false);
		this.method2589();
		this.method2569(1);
		this.method2609(1);
		this.anInt3080 = 4;
	}

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "()V")
	public void method2578() {
		if (this.anInt3073 != 0) {
			this.anInt3073 = 0;
			this.anInt3080 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method2490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2620();
		this.method2569(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "()Z")
	@Override
	public boolean method2450() {
		if (!this.aClass2_Sub21_Sub1_1.method2936()) {
			if (!this.aClass249_1.method6101(this.aClass2_Sub21_Sub1_1)) {
				return false;
			}
			this.aClass100_1.method2379();
		}
		return true;
	}

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "()Z")
	@Override
	public boolean method2535() {
		return this.aBoolean224;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
	@Override
	public void method2478(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)Lclient!wt;")
	@Override
	public Class2_Sub44 method2466() {
		return null;
	}

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "()V")
	private void method2579() {
		if (this.anInt3073 != 3) {
			this.anInt3073 = 3;
			this.method2599();
			this.method2581();
			this.anInt3080 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "()V")
	@Override
	public void method2486() {
		if (this.aClass2_Sub21_Sub1_1.method2936()) {
			this.aClass249_1.method6099(this.aClass2_Sub21_Sub1_1);
			this.aClass100_1.method2379();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!hs;III)V")
	public void method2580(@OriginalArg(0) Interface6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2562(arg0);
		arg0.method5137(arg1, arg2);
	}

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "()Z")
	@Override
	public boolean method2473() {
		return this.aClass245_1.method5991();
	}

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "()V")
	private void method2581() {
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl2.glMultMatrixf(this.aClass21_Sub1_1.method2683(), 0);
		this.method2625();
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(Z)V")
	public void method2582(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean219) {
			return;
		}
		if (arg0) {
			this.anOpengl2.glEnable(2929);
		} else {
			this.anOpengl2.glDisable(2929);
		}
		this.aBoolean219 = arg0;
		this.anInt3080 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "()I")
	@Override
	public int method2508() {
		return this.anInt3059;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!bd;)V")
	@Override
	public void method2482(@OriginalArg(0) Class21 arg0) {
		this.aClass21_Sub1_1 = (Class21_Sub1) arg0;
		this.aClass21_Sub1_2.method2686(this.aClass21_Sub1_1);
		if (this.anInt3073 != 1) {
			this.method2581();
		}
	}

	@OriginalMember(owner = "client!ic", name = "Y", descriptor = "()V")
	private void method2583() {
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadMatrixf(this.aFloatArray18, 0);
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "()V")
	private void method2584() {
		if (this.aBoolean228 && !this.aBoolean234) {
			this.anOpengl2.glEnable(2896);
		} else {
			this.anOpengl2.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "()Z")
	@Override
	public boolean method2519() {
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	@Override
	public void method2457(@OriginalArg(0) int arg0) {
		this.method2601();
	}

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "()I")
	@Override
	public int method2546() {
		return this.anInt3049 + this.anInt3046 + this.anInt3048;
	}

	@OriginalMember(owner = "client!ic", name = "x", descriptor = "()Z")
	@Override
	public boolean method2511() {
		return true;
	}

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "(I)V")
	public void method2585(@OriginalArg(0) int arg0) {
		Static143.aFloatArray13[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static143.aFloatArray13[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static143.aFloatArray13[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static143.aFloatArray13[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static143.aFloatArray13, 0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
	@Override
	public void method3021() {
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!fh;Lclient!fh;Lclient!fh;Lclient!fh;)V")
	public void method2586(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) Class75 arg3) {
		if (arg0 == null) {
			this.anOpengl2.glDisableClientState(32884);
		} else {
			this.anOpengl2.glEnableClientState(32884);
			arg0.method1736();
		}
		if (arg1 == null) {
			this.anOpengl2.glDisableClientState(32885);
		} else {
			this.anOpengl2.glEnableClientState(32885);
			arg1.method1737();
		}
		if (arg2 == null) {
			this.anOpengl2.glDisableClientState(32886);
		} else {
			this.anOpengl2.glEnableClientState(32886);
			arg2.method1734();
		}
		if (arg3 == null) {
			this.anOpengl2.glDisableClientState(32888);
		} else {
			this.anOpengl2.glEnableClientState(32888);
			arg3.method1735();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2472(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "(I)V")
	public synchronized void method2587(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub16 local4 = new Class2_Sub16(arg0);
		this.aClass238_13.method5796(local4);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[[I[[IIII)Lclient!mi;")
	@Override
	public Class149 method2461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class149_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(FFF)V")
	private void method2588(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl2.glMatrixMode(5890);
		if (this.aBoolean230) {
			this.anOpengl2.glLoadIdentity();
		}
		this.anOpengl2.glTranslatef(arg0, arg1, arg2);
		this.anOpengl2.glMatrixMode(5888);
		this.aBoolean230 = true;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)V")
	@Override
	public void method2475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3088 == arg0 && this.anInt3072 == arg1) {
			return;
		}
		this.anInt3088 = arg0;
		this.anInt3072 = arg1;
		if (!this.aBoolean239) {
			this.method2622();
			this.method2624();
		}
	}

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "(I)V")
	public void method2589() {
		this.method2554(-2, true);
	}

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "(I)I")
	public int method2590(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIII)Lclient!aj;")
	@Override
	public Class10 method2447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean235 ? new Class10_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "()Z")
	@Override
	public boolean method2488() {
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(II)V")
	@Override
	public void method2492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3057 == arg0 && this.anInt3059 == arg1) {
			return;
		}
		this.anInt3057 = arg0;
		this.anInt3059 = arg1;
		this.method2618();
		this.method2622();
		if (this.anInt3073 == 3) {
			this.method2599();
		} else if (this.anInt3073 == 2) {
			this.method2583();
		}
	}

	@OriginalMember(owner = "client!ic", name = "ab", descriptor = "()V")
	private void method2591() {
		this.aFloat23 = this.anInt3054 - this.anInt3079;
		this.aFloat12 = this.anInt3083 - this.anInt3079;
		this.aFloat26 = this.anInt3065 - this.anInt3062;
		this.aFloat13 = this.anInt3053 - this.anInt3062;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!aj;)V")
	@Override
	public void method2489(@OriginalArg(0) Class10 arg0) {
		this.aClass10_Sub1_1 = (Class10_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ic", name = "bb", descriptor = "()V")
	public void method2592() {
		if (this.anInt3080 == 8) {
			return;
		}
		this.method2615();
		this.method2600(true);
		this.method2582(true);
		this.method2603(true);
		this.method2569(1);
		this.method2609(1);
		this.anInt3080 = 8;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!km;Z)Lclient!rg;")
	@Override
	public Class27 method2527(@OriginalArg(0) Class128 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt3865 * arg0.anInt3863];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray45 == null) {
			for (local15 = 0; local15 < arg0.anInt3863; local15++) {
				for (local21 = 0; local21 < arg0.anInt3865; local21++) {
					@Pc(74) int local74 = arg0.anIntArray289[arg0.aByteArray46[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt3863; local15++) {
				for (local21 = 0; local21 < arg0.anInt3865; local21++) {
					local6[local10++] = arg0.aByteArray45[local8] << 24 | arg0.anIntArray289[arg0.aByteArray46[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class27 local100 = this.method2456(local6, arg0.anInt3865, arg0.anInt3865, arg0.anInt3863);
		local100.method5325(arg0.anInt3866, arg0.anInt3864, arg0.anInt3867, arg0.anInt3862);
		return local100;
	}

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "(II)V")
	public synchronized void method2593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub16 local4 = new Class2_Sub16(arg1);
		local4.aLong213 = arg0;
		this.aClass238_12.method5796(local4);
	}

	@OriginalMember(owner = "client!ic", name = "cb", descriptor = "()V")
	private void method2594() {
		this.aClass21_Sub1_1 = new Class21_Sub1();
		this.aClass21_Sub1_2 = new Class21_Sub1();
		this.aClass81Array1 = new Class81[this.anInt3075];
		this.aClass81_Sub2_1 = new Class81_Sub2(this, 3553, 6408, 1, 1);
		this.aClass81_Sub2_2 = new Class81_Sub2(this, 3553, 6408, 1, 1);
		this.aClass81_Sub2_3 = new Class81_Sub2(this, 3553, 6408, 1, 1);
		this.aClass159_Sub2_2 = new Class159_Sub2(this);
		this.aClass159_Sub2_6 = new Class159_Sub2(this);
		this.aClass159_Sub2_8 = new Class159_Sub2(this);
		this.aClass159_Sub2_1 = new Class159_Sub2(this);
		this.aClass159_Sub2_3 = new Class159_Sub2(this);
		this.aClass159_Sub2_5 = new Class159_Sub2(this);
		this.aClass159_Sub2_4 = new Class159_Sub2(this);
		this.aClass159_Sub2_7 = new Class159_Sub2(this);
		if (this.aBoolean229) {
			this.aClass121_1 = new Class121(this);
		}
		this.aClass60_1.method1363(this);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2480(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method2538();
	}

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "(II)V")
	public void method2595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3069 = arg0;
		this.anInt3060 = arg1;
		this.anOpengl2.glViewport(arg0, arg1, this.anInt3052, this.anInt3044);
		this.method2568();
	}

	@OriginalMember(owner = "client!ic", name = "B", descriptor = "()I")
	@Override
	public int method2523() {
		@Pc(2) int local2 = this.anInt3055;
		this.anInt3055 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ic", name = "db", descriptor = "()V")
	private void method2596() {
		Static143.aFloatArray13[0] = this.aFloat10 * this.aFloat20;
		Static143.aFloatArray13[1] = this.aFloat10 * this.aFloat24;
		Static143.aFloatArray13[2] = this.aFloat10 * this.aFloat30;
		Static143.aFloatArray13[3] = 1.0F;
		this.anOpengl2.glLightfv(16384, 4609, Static143.aFloatArray13, 0);
		Static143.aFloatArray13[0] = -this.aFloat17 * this.aFloat20;
		Static143.aFloatArray13[1] = -this.aFloat17 * this.aFloat24;
		Static143.aFloatArray13[2] = -this.aFloat17 * this.aFloat30;
		Static143.aFloatArray13[3] = 1.0F;
		this.anOpengl2.glLightfv(16385, 4609, Static143.aFloatArray13, 0);
	}

	@OriginalMember(owner = "client!ic", name = "eb", descriptor = "()V")
	private void method2597() {
		this.anOpengl2.glDepthMask(this.aBoolean222 && this.aBoolean237);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!cd;)V")
	@Override
	public void method2516(@OriginalArg(0) Class34 arg0) {
		this.aClass60_1.method1359(this, arg0);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I[BIZ)Lclient!hs;")
	public Interface6 method2598(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface6) (this.aBoolean232 && (!arg2 || this.aBoolean220) ? new Class94_Sub2(this, 5123, arg0, arg1, arg2) : new Class99_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!ic", name = "fb", descriptor = "()V")
	private void method2599() {
		@Pc(11) float local11 = (float) -this.anInt3079 * this.aFloat28 / (float) this.anInt3058;
		@Pc(23) float local23 = (float) -this.anInt3062 * this.aFloat28 / (float) this.anInt3070;
		@Pc(37) float local37 = (float) (this.anInt3052 - this.anInt3079) * this.aFloat28 / (float) this.anInt3058;
		@Pc(51) float local51 = (float) (this.anInt3044 - this.anInt3062) * this.aFloat28 / (float) this.anInt3070;
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		if (local11 != local37 && local51 != local23) {
			this.anOpengl2.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt3057 - this.aFloat21), (double) ((float) this.anInt3059 - this.aFloat21));
		}
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(Z)V")
	public void method2600(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean233) {
			this.aBoolean233 = arg0;
			this.method2624();
			this.anInt3080 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "()Z")
	@Override
	public boolean method2481() {
		return !this.aBoolean240;
	}

	@OriginalMember(owner = "client!ic", name = "gb", descriptor = "()V")
	private void method2601() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!ic", name = "hb", descriptor = "()V")
	private void method2602() {
		if (this.aFloat21 == 0.0F) {
			this.aFloatArray18[10] = this.aFloat11;
			this.aFloatArray18[14] = this.aFloat16;
		} else {
			@Pc(13) float local13 = this.aFloat22 / (this.aFloat21 + this.aFloat22);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat16 * (1.0F - local13) * (1.0F - local13) / this.aFloat21;
			this.aFloatArray18[10] = this.aFloat11 + local32;
			this.aFloatArray18[14] = this.aFloat16 * local17;
		}
		this.aFloat18 = (this.aFloatArray18[14] - (float) this.anInt3059) / this.aFloatArray18[10];
		this.aFloat27 = (float) this.anInt3059 - this.aFloat21;
	}

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "(Z)V")
	public void method2603(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean222) {
			this.aBoolean222 = arg0;
			this.method2597();
			this.anInt3080 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "(Z)V")
	public void method2604(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean234) {
			this.aBoolean234 = arg0;
			this.method2584();
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)I")
	@Override
	public int method2451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
	@Override
	public void method2512(@OriginalArg(0) int arg0) {
		this.method2569(0);
		this.anOpengl2.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl2.glClear(16384);
	}

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "()V")
	@Override
	public void method2465() {
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZZ)V")
	public void method2605(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt3085) {
			if (arg0 < 0) {
				this.method2619();
				this.method2573(null);
				if (!this.aBoolean239) {
					this.aClass245_1.method5992(arg2, arg1, 0);
				}
			} else {
				@Pc(11) Class81_Sub2 local11 = this.aClass100_1.method2378(arg0);
				@Pc(17) Class166 local17 = this.anInterface3_4.method1278(arg0);
				if (local17.aByte35 == 0 && local17.aByte40 == 0) {
					this.method2619();
				} else {
					@Pc(30) int local30 = local17.aBoolean346 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method2588((float) (this.anInt3050 % local34 * local17.aByte35) / (float) local34, (float) (this.anInt3050 % local34 * local17.aByte40) / (float) local34, 0.0F);
				}
				if (this.aBoolean239) {
					this.aClass245_1.method5992(arg2, arg1, 3);
					this.method2573(local11);
				} else {
					this.aClass245_1.method5992(arg2, arg1, local17.aByte37);
					this.aClass245_1.method5993(local17.aByte36, false);
					if (!this.aClass245_1.method5994(local11)) {
						this.method2573(local11);
					}
				}
			}
			this.anInt3085 = arg0;
		}
		this.anInt3080 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIILclient!hg;II)V")
	@Override
	public void method2530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class8 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class8_Sub2 local2 = (Class8_Sub2) arg5;
		@Pc(5) Class81_Sub2_Sub1 local5 = local2.aClass81_Sub2_Sub1_5;
		this.method2576();
		this.method2573(local2.aClass81_Sub2_Sub1_5);
		this.method2569(1);
		this.method2563(7681, 8448);
		this.method2611(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat50 / (float) local5.anInt4127;
		@Pc(37) float local37 = local5.aFloat49 / (float) local5.anInt4128;
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
		this.method2611(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method2467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method2543(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt3068 != arg0;
		if (local7 || this.aFloat10 != arg1 || this.aFloat17 != arg2) {
			this.anInt3068 = arg0;
			this.aFloat10 = arg1;
			this.aFloat17 = arg2;
			if (local7) {
				this.aFloat20 = (float) (this.anInt3068 & 0xFF0000) / 1.671168E7F;
				this.aFloat24 = (float) (this.anInt3068 & 0xFFFF) / 65535.0F;
				this.aFloat30 = (float) (this.anInt3068 & 0xFF) / 255.0F;
				this.method2559();
			}
			this.method2596();
		}
		if (this.aFloatArray17[0] == arg3 && this.aFloatArray17[1] == arg4 && this.aFloatArray17[2] == arg5) {
			return;
		}
		this.aFloatArray17[0] = arg3;
		this.aFloatArray17[1] = arg4;
		this.aFloatArray17[2] = arg5;
		this.aFloatArray15[0] = -arg3;
		this.aFloatArray15[1] = -arg4;
		this.aFloatArray15[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.lb[0] = arg3 * local132;
		this.lb[1] = arg4 * local132;
		this.lb[2] = arg5 * local132;
		this.aFloatArray16[0] = -this.lb[0];
		this.aFloatArray16[1] = -this.lb[1];
		this.aFloatArray16[2] = -this.lb[2];
		this.method2625();
		this.anInt3087 = (int) (arg3 * 256.0F / arg4);
		this.anInt3074 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "()V")
	@Override
	public void method2537() {
		this.aClass249_1.method6097();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([Lclient!qh;Lclient!bd;[Lclient!qt;I)V")
	@Override
	public void method2477(@OriginalArg(0) Class159[] arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class7_Sub6[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method4952(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(FFFF)V")
	public void method2606(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static143.aFloatArray13[0] = arg0;
		Static143.aFloatArray13[1] = arg1;
		Static143.aFloatArray13[2] = arg2;
		Static143.aFloatArray13[3] = arg3;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static143.aFloatArray13, 0);
	}

	@OriginalMember(owner = "client!ic", name = "ib", descriptor = "()V")
	public void method2607() {
		if (this.anInt3080 == 16) {
			return;
		}
		this.method2579();
		this.method2600(true);
		this.method2582(true);
		this.method2603(true);
		this.method2569(1);
		this.method2609(1);
		this.anInt3080 = 16;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Lclient!ti;)V")
	public void method2608(@OriginalArg(0) Interface9 arg0) {
		if (this.anInt3047 < 0 || this.anInterface9Array1[this.anInt3047] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface9Array1[this.anInt3047--] = null;
		arg0.method3023();
		if (this.anInt3047 >= 0) {
			this.anInterface9_1 = this.anInterface9Array1[this.anInt3047];
			this.anInterface9_1.method3021();
		}
	}

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "(I)V")
	public void method2609(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2563(7681, 7681);
		} else if (arg0 == 1) {
			this.method2563(8448, 8448);
		} else if (arg0 == 2) {
			this.method2563(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "()Lclient!bd;")
	@Override
	public Class21 method2445() {
		return this.aClass21_6;
	}

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "(I)I")
	public int method2610(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(III)V")
	public void method2611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "(IIIIII)V")
	@Override
	public void method2534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method2620();
		this.method2569(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean224) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local23);
		this.anOpengl2.glVertex2f(local16, local23);
		this.anOpengl2.glVertex2f(local16, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean224) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ic", name = "jb", descriptor = "()I")
	private int method2612() {
		@Pc(1) int local1 = 0;
		this.aString23 = this.anOpengl2.glGetString(7936);
		this.aString22 = this.anOpengl2.glGetString(7937);
		@Pc(17) String local17 = this.aString23.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl2.glGetString(7938);
		@Pc(53) String[] local53 = Static71.method1265(local45.replace('.', ' '), ' ');
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static335.method5402(local53[0]);
				@Pc(69) int local69 = Static335.method5402(local53[1]);
				this.anInt3056 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt3056 < 12) {
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
		this.anInt3075 = local116[0];
		this.anOpengl2.glGetIntegerv(34929, local116, 0);
		this.anInt3061 = local116[0];
		this.anOpengl2.glGetIntegerv(34930, local116, 0);
		this.anInt3063 = local116[0];
		if (this.anInt3075 < 2 || this.anInt3061 < 2 || this.anInt3063 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean240 = Static175.aString32 != null && Static175.aString32.startsWith("mac");
		this.aBoolean218 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean232 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean224 = this.anOpengl2.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean225 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean226 = this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean236 = this.anOpengl2.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean221 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean235 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean238 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean227 = false;
		this.aBoolean229 = this.anOpengl2.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIZ)Lclient!rg;")
	@Override
	public Class27 method2510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class27_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ic", name = "C", descriptor = "()I")
	@Override
	public int method2528() {
		@Pc(2) int local2 = this.anInt3077;
		this.anInt3077 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!qh;Lclient!cd;Lclient!bd;Lclient!qt;I)V")
	@Override
	public void method2520(@OriginalArg(0) Class159 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Class7_Sub6 arg3) {
		arg0.method4952(arg2, arg3, 0);
		this.method2516(arg1);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "()I")
	@Override
	public int method3022() {
		return this.anInt3044;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(F)V")
	public void method2613(@OriginalArg(0) float arg0) {
		if (this.aFloat28 != arg0) {
			this.aFloat28 = arg0;
			if (this.anInt3073 == 3) {
				this.method2599();
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!eb;)V")
	public void method2614(@OriginalArg(0) Interface2 arg0) {
		if (this.anInterface2_3 != arg0 && this.aBoolean232) {
			this.anOpengl2.glBindBufferARB(34962, arg0.method5135());
			this.anInterface2_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "kb", descriptor = "()V")
	public void method2615() {
		if (this.anInt3073 != 2) {
			this.anInt3073 = 2;
			this.method2583();
			this.method2581();
			this.anInt3080 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "()V")
	@Override
	public void method2471() {
		this.anInt3052 = this.aCanvas3.getWidth();
		this.anInt3044 = this.aCanvas3.getHeight();
		this.anOpengl2.glViewport(this.anInt3069, this.anInt3060, this.anInt3052, this.anInt3044);
		this.method2578();
		this.method2505();
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(IIII)V")
	@Override
	public void method2469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3079 = arg0;
		this.anInt3062 = arg1;
		this.anInt3058 = arg2;
		this.anInt3070 = arg3;
		this.method2618();
		this.method2591();
		if (this.anInt3073 == 3) {
			this.method2599();
		} else if (this.anInt3073 == 2) {
			this.method2583();
		}
	}

	@OriginalMember(owner = "client!ic", name = "lb", descriptor = "()Lclient!nb;")
	public Class81_Sub3 method2616() {
		return this.aClass10_Sub1_1 == null ? null : this.aClass10_Sub1_1.method5620();
	}

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "()I")
	@Override
	public int method2539() {
		return this.anInt3057;
	}

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "(I)I")
	public int method2617(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[I[I)Lclient!hg;")
	@Override
	public Class8 method2502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static402.method5372(arg1, arg0, this, arg2, arg3);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I")
	@Override
	public int method2448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "()Z")
	@Override
	public boolean method2476() {
		return true;
	}

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "()V")
	@Override
	protected void method2468() {
		if (this.anOpengl2 != null) {
			try {
				this.aClass249_1.method6103();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl2 = null;
		}
		if (this.aContext1 != null) {
			this.method2601();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean217) {
			Static206.method3768(true);
			this.aBoolean217 = false;
		}
	}

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "()Z")
	@Override
	public boolean method2459() {
		return this.aClass2_Sub21_Sub1_1.method2939();
	}

	@OriginalMember(owner = "client!ic", name = "H", descriptor = "()V")
	@Override
	public void method2538() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass21_Sub1_1.aFloat35 * (float) arg0 + this.aClass21_Sub1_1.aFloat39 * (float) arg1 + this.aClass21_Sub1_1.aFloat33 * (float) arg2 + this.aClass21_Sub1_1.aFloat38;
		if (local24 < (float) this.anInt3057 || local24 > (float) this.anInt3059) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt3058 * (this.aClass21_Sub1_1.aFloat37 * (float) arg0 + this.aClass21_Sub1_1.aFloat40 * (float) arg1 + this.aClass21_Sub1_1.aFloat41 * (float) arg2 + this.aClass21_Sub1_1.aFloat32) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt3070 * (this.aClass21_Sub1_1.aFloat31 * (float) arg0 + this.aClass21_Sub1_1.aFloat34 * (float) arg1 + this.aClass21_Sub1_1.aFloat42 * (float) arg2 + this.aClass21_Sub1_1.aFloat36) / local24);
		if ((float) local81 >= this.aFloat23 && (float) local81 <= this.aFloat12 && (float) local113 >= this.aFloat26 && (float) local113 <= this.aFloat13) {
			arg3[0] = (int) ((float) local81 - this.aFloat23);
			arg3[1] = (int) ((float) local113 - this.aFloat26);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ic", name = "mb", descriptor = "()V")
	private void method2618() {
		@Pc(2) float[] local2 = this.aFloatArray18;
		@Pc(14) float local14 = (float) (-this.anInt3079 * this.anInt3057) / (float) this.anInt3058;
		@Pc(28) float local28 = (float) ((this.anInt3052 - this.anInt3079) * this.anInt3057) / (float) this.anInt3058;
		@Pc(39) float local39 = (float) (this.anInt3062 * this.anInt3057) / (float) this.anInt3070;
		@Pc(53) float local53 = (float) ((this.anInt3062 - this.anInt3044) * this.anInt3057) / (float) this.anInt3070;
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
			@Pc(67) float local67 = (float) this.anInt3057 * 2.0F;
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
			local2[10] = this.aFloat11 = (float) -(this.anInt3059 + this.anInt3057) / (float) (this.anInt3059 - this.anInt3057);
			local2[11] = -1.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = this.aFloat16 = -(local67 * (float) this.anInt3059) / (float) (this.anInt3059 - this.anInt3057);
			local2[15] = 0.0F;
		}
		this.method2602();
	}

	@OriginalMember(owner = "client!ic", name = "E", descriptor = "()V")
	@Override
	public void method2533() {
		this.aClass245_1.method5992(false, false, 0);
		this.aBoolean239 = false;
		this.method2622();
		this.method2624();
	}

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "()Z")
	@Override
	public boolean method2544() {
		return true;
	}

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "(IIII)V")
	@Override
	public void method2521() {
		this.aBoolean239 = true;
		this.anInt3076 = 1583160;
		this.anInt3066 = 40;
		this.anInt3086 = 127;
		this.method2622();
		this.method2624();
		this.aClass245_1.method5992(false, false, 3);
		this.aClass245_1.method5993(-1, true);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method2470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method2620();
		this.method2569(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean224) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local19);
		this.anOpengl2.glVertex2f(local14, local19);
		this.anOpengl2.glVertex2f(local14, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean224) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!bg;[Lclient!km;Z)Lclient!cr;")
	@Override
	public Class44 method2526(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class128[] arg1) {
		return new Class44_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "()Z")
	@Override
	public boolean method2500() {
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method2491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2620();
		this.method2569(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!ic", name = "nb", descriptor = "()V")
	private void method2619() {
		if (this.aBoolean230) {
			this.anOpengl2.glMatrixMode(5890);
			this.anOpengl2.glLoadIdentity();
			this.anOpengl2.glMatrixMode(5888);
			this.aBoolean230 = false;
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(IIII)V")
	@Override
	public void method2464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass249_1.method6098(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(Z)V")
	@Override
	public void method2504(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!wt;)V")
	@Override
	public void method2449(@OriginalArg(0) Class2_Sub44 arg0) {
	}

	@OriginalMember(owner = "client!ic", name = "ob", descriptor = "()V")
	private void method2620() {
		if (this.anInt3080 == 1) {
			return;
		}
		this.method2555();
		this.method2600(false);
		this.method2558(false);
		this.method2582(false);
		this.method2603(false);
		this.method2573(null);
		this.method2589();
		this.method2609(0);
		this.anInt3080 = 1;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2531(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static166.aFloat45 = arg0;
		Static166.aFloat43 = arg1;
		Static166.aFloat44 = arg2;
	}

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "(II)V")
	public synchronized void method2621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub16 local4 = new Class2_Sub16(arg1);
		local4.aLong213 = arg0;
		this.aClass238_13.method5796(local4);
	}

	@OriginalMember(owner = "client!ic", name = "pb", descriptor = "()V")
	private void method2622() {
		@Pc(15) int local15;
		if (this.aBoolean239) {
			this.anOpengl2.glFogf(2915, 0.0F);
			this.anOpengl2.glFogf(2916, 1.0F);
			local15 = this.anInt3076;
		} else {
			this.aFloat19 = (float) (this.anInt3059 - 256) - this.aFloat25;
			this.aFloat14 = this.aFloat19 - (float) this.anInt3072 * this.aFloat15;
			if (this.aFloat14 < (float) this.anInt3057) {
				this.aFloat14 = this.anInt3057;
			}
			this.anOpengl2.glFogf(2915, this.aFloat14);
			this.anOpengl2.glFogf(2916, this.aFloat19);
			local15 = this.anInt3088;
		}
		Static143.aFloatArray13[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static143.aFloatArray13[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static143.aFloatArray13[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl2.glFogfv(2918, Static143.aFloatArray13, 0);
	}

	@OriginalMember(owner = "client!ic", name = "y", descriptor = "()Z")
	@Override
	public boolean method2515() {
		return true;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(III)V")
	public void method2623(@OriginalArg(2) int arg0) {
		this.anOpengl2.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ic", name = "qb", descriptor = "()V")
	private void method2624() {
		if (this.aBoolean233 && this.aBoolean239 | this.anInt3072 >= 0) {
			this.anOpengl2.glEnable(2912);
		} else {
			this.anOpengl2.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(FF)V")
	@Override
	public void method2460(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat22 && arg1 == this.aFloat21) {
			return;
		}
		this.aFloat22 = arg0;
		this.aFloat21 = arg1;
		this.method2602();
		if (this.anInt3073 == 3) {
			this.method2599();
		} else if (this.anInt3073 == 2) {
			this.method2583();
		}
	}

	@OriginalMember(owner = "client!ic", name = "rb", descriptor = "()V")
	public void method2625() {
		this.anOpengl2.glLightfv(16384, 4611, this.lb, 0);
		this.anOpengl2.glLightfv(16385, 4611, this.aFloatArray16, 0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([I)V")
	@Override
	public void method2495(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3054;
		arg0[1] = this.anInt3065;
		arg0[2] = this.anInt3083;
		arg0[3] = this.anInt3053;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIII)[I")
	@Override
	public int[] method2463() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl2.glReadPixels(0, this.anInt3044 - local6, 36, 1, 32993, this.anInt3078, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}
}
