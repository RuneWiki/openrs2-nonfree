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

@OriginalClass("client!ig")
public final class Class47_Sub2 extends Class47 implements Interface4 {

	@OriginalMember(owner = "client!ig", name = "H", descriptor = "Lclient!eh;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
	public int anInt3057;

	@OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
	public int anInt3058;

	@OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
	public int anInt3059;

	@OriginalMember(owner = "client!ig", name = "P", descriptor = "I")
	public int anInt3063;

	@OriginalMember(owner = "client!ig", name = "Q", descriptor = "I")
	public int anInt3064;

	@OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
	private int anInt3065;

	@OriginalMember(owner = "client!ig", name = "ab", descriptor = "Z")
	private boolean aBoolean222;

	@OriginalMember(owner = "client!ig", name = "cb", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!ig", name = "eb", descriptor = "I")
	private int anInt3066;

	@OriginalMember(owner = "client!ig", name = "hb", descriptor = "I")
	private int anInt3068;

	@OriginalMember(owner = "client!ig", name = "ib", descriptor = "I")
	private int anInt3069;

	@OriginalMember(owner = "client!ig", name = "kb", descriptor = "Z")
	public boolean aBoolean224;

	@OriginalMember(owner = "client!ig", name = "mb", descriptor = "I")
	public int anInt3070;

	@OriginalMember(owner = "client!ig", name = "nb", descriptor = "F")
	private float aFloat41;

	@OriginalMember(owner = "client!ig", name = "ob", descriptor = "I")
	private int anInt3071;

	@OriginalMember(owner = "client!ig", name = "pb", descriptor = "Z")
	private boolean aBoolean225;

	@OriginalMember(owner = "client!ig", name = "qb", descriptor = "Lclient!os;")
	public Class57_Sub2 aClass57_Sub2_1;

	@OriginalMember(owner = "client!ig", name = "rb", descriptor = "Lclient!ja;")
	private Class81_Sub1 aClass81_Sub1_1;

	@OriginalMember(owner = "client!ig", name = "sb", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!ig", name = "ub", descriptor = "Z")
	public boolean aBoolean227;

	@OriginalMember(owner = "client!ig", name = "xb", descriptor = "Lclient!da;")
	public Class38_Sub1 aClass38_Sub1_1;

	@OriginalMember(owner = "client!ig", name = "zb", descriptor = "I")
	private int anInt3074;

	@OriginalMember(owner = "client!ig", name = "Bb", descriptor = "I")
	public int anInt3075;

	@OriginalMember(owner = "client!ig", name = "Cb", descriptor = "Lclient!da;")
	public Class38_Sub1 aClass38_Sub1_2;

	@OriginalMember(owner = "client!ig", name = "Db", descriptor = "Z")
	public boolean aBoolean229;

	@OriginalMember(owner = "client!ig", name = "Eb", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!ig", name = "Mb", descriptor = "Z")
	private boolean aBoolean230;

	@OriginalMember(owner = "client!ig", name = "Nb", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!ig", name = "Ob", descriptor = "Z")
	public boolean aBoolean231;

	@OriginalMember(owner = "client!ig", name = "Rb", descriptor = "Z")
	private boolean aBoolean233;

	@OriginalMember(owner = "client!ig", name = "Sb", descriptor = "Z")
	private boolean aBoolean234;

	@OriginalMember(owner = "client!ig", name = "Tb", descriptor = "Lclient!hf;")
	public Class52_Sub1 aClass52_Sub1_5;

	@OriginalMember(owner = "client!ig", name = "Ub", descriptor = "Lclient!mp;")
	private Interface8 anInterface8_4;

	@OriginalMember(owner = "client!ig", name = "Vb", descriptor = "I")
	private int anInt3082;

	@OriginalMember(owner = "client!ig", name = "Xb", descriptor = "I")
	public int anInt3084;

	@OriginalMember(owner = "client!ig", name = "Yb", descriptor = "Z")
	public boolean aBoolean235;

	@OriginalMember(owner = "client!ig", name = "Zb", descriptor = "I")
	private int anInt3085;

	@OriginalMember(owner = "client!ig", name = "dc", descriptor = "I")
	private int anInt3088;

	@OriginalMember(owner = "client!ig", name = "ec", descriptor = "Lclient!da;")
	public Class38_Sub1 aClass38_Sub1_3;

	@OriginalMember(owner = "client!ig", name = "gc", descriptor = "Z")
	private boolean aBoolean237;

	@OriginalMember(owner = "client!ig", name = "jc", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!ig", name = "kc", descriptor = "Z")
	private boolean aBoolean238;

	@OriginalMember(owner = "client!ig", name = "lc", descriptor = "Lclient!rk;")
	private Class52_Sub1_Sub1 aClass52_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ig", name = "pc", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!ig", name = "uc", descriptor = "Lclient!os;")
	public Class57_Sub2 aClass57_Sub2_2;

	@OriginalMember(owner = "client!ig", name = "wc", descriptor = "Lclient!is;")
	private Interface6 anInterface6_4;

	@OriginalMember(owner = "client!ig", name = "xc", descriptor = "Z")
	private boolean aBoolean241;

	@OriginalMember(owner = "client!ig", name = "zc", descriptor = "Lclient!da;")
	public Class38_Sub1 aClass38_Sub1_4;

	@OriginalMember(owner = "client!ig", name = "Ac", descriptor = "I")
	private int anInt3093;

	@OriginalMember(owner = "client!ig", name = "Bc", descriptor = "Lclient!hf;")
	public Class52_Sub1 aClass52_Sub1_6;

	@OriginalMember(owner = "client!ig", name = "Cc", descriptor = "Z")
	public boolean aBoolean242;

	@OriginalMember(owner = "client!ig", name = "Dc", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!ig", name = "Fc", descriptor = "F")
	private float aFloat52;

	@OriginalMember(owner = "client!ig", name = "Ic", descriptor = "Lclient!da;")
	public Class38_Sub1 aClass38_Sub1_5;

	@OriginalMember(owner = "client!ig", name = "Jc", descriptor = "Z")
	private boolean aBoolean243;

	@OriginalMember(owner = "client!ig", name = "Lc", descriptor = "Z")
	private boolean aBoolean244;

	@OriginalMember(owner = "client!ig", name = "Nc", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!ig", name = "Oc", descriptor = "F")
	private float aFloat56;

	@OriginalMember(owner = "client!ig", name = "Pc", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!ig", name = "Qc", descriptor = "Lclient!gg;")
	public Class77 aClass77_4;

	@OriginalMember(owner = "client!ig", name = "Rc", descriptor = "[Lclient!ee;")
	private Class52[] aClass52Array1;

	@OriginalMember(owner = "client!ig", name = "Tc", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!ig", name = "Uc", descriptor = "Lclient!da;")
	public Class38_Sub1 aClass38_Sub1_6;

	@OriginalMember(owner = "client!ig", name = "Vc", descriptor = "Lclient!hf;")
	public Class52_Sub1 aClass52_Sub1_7;

	@OriginalMember(owner = "client!ig", name = "Wc", descriptor = "J")
	private long aLong91;

	@OriginalMember(owner = "client!ig", name = "Yc", descriptor = "I")
	private int anInt3098;

	@OriginalMember(owner = "client!ig", name = "Zc", descriptor = "I")
	private int anInt3099;

	@OriginalMember(owner = "client!ig", name = "A", descriptor = "Lclient!fh;")
	private final Class68 aClass68_1 = new Class68();

	@OriginalMember(owner = "client!ig", name = "F", descriptor = "Lclient!s;")
	private final Class57 aClass57_1 = new Class57_Sub2();

	@OriginalMember(owner = "client!ig", name = "M", descriptor = "I")
	private int anInt3061 = -1;

	@OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
	public final int anInt3062 = 8;

	@OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
	public final int anInt3060 = 3;

	@OriginalMember(owner = "client!ig", name = "R", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!ig", name = "T", descriptor = "[Lclient!eh;")
	private final Interface4[] anInterface4Array1 = new Interface4[4];

	@OriginalMember(owner = "client!ig", name = "N", descriptor = "Lclient!kn;")
	private final Class116 aClass116_19 = new Class116();

	@OriginalMember(owner = "client!ig", name = "U", descriptor = "Lclient!kn;")
	private final Class116 aClass116_20 = new Class116();

	@OriginalMember(owner = "client!ig", name = "V", descriptor = "Lclient!kn;")
	private final Class116 aClass116_21 = new Class116();

	@OriginalMember(owner = "client!ig", name = "W", descriptor = "Lclient!kn;")
	private final Class116 aClass116_22 = new Class116();

	@OriginalMember(owner = "client!ig", name = "X", descriptor = "Lclient!kn;")
	private final Class116 aClass116_23 = new Class116();

	@OriginalMember(owner = "client!ig", name = "Y", descriptor = "Lclient!kn;")
	private final Class116 aClass116_24 = new Class116();

	@OriginalMember(owner = "client!ig", name = "Z", descriptor = "Lclient!kn;")
	private final Class116 aClass116_25 = new Class116();

	@OriginalMember(owner = "client!ig", name = "db", descriptor = "F")
	public float aFloat39 = -1.0F;

	@OriginalMember(owner = "client!ig", name = "Ib", descriptor = "I")
	private int anInt3078 = 0;

	@OriginalMember(owner = "client!ig", name = "jb", descriptor = "F")
	public float aFloat40 = 1.0F;

	@OriginalMember(owner = "client!ig", name = "Wb", descriptor = "I")
	public int anInt3083 = 512;

	@OriginalMember(owner = "client!ig", name = "bb", descriptor = "F")
	public float aFloat37 = -1.0F;

	@OriginalMember(owner = "client!ig", name = "Gb", descriptor = "I")
	private int anInt3076 = 0;

	@OriginalMember(owner = "client!ig", name = "Qb", descriptor = "Z")
	private boolean aBoolean232 = true;

	@OriginalMember(owner = "client!ig", name = "Ab", descriptor = "F")
	public float aFloat43 = 1.0F;

	@OriginalMember(owner = "client!ig", name = "Pb", descriptor = "I")
	private int anInt3081 = 0;

	@OriginalMember(owner = "client!ig", name = "hc", descriptor = "I")
	public int anInt3089 = 512;

	@OriginalMember(owner = "client!ig", name = "Lb", descriptor = "I")
	private int anInt3080 = 0;

	@OriginalMember(owner = "client!ig", name = "nc", descriptor = "F")
	private float aFloat49 = 0.0F;

	@OriginalMember(owner = "client!ig", name = "Fb", descriptor = "F")
	public float aFloat45 = 3584.0F;

	@OriginalMember(owner = "client!ig", name = "sc", descriptor = "I")
	private int anInt3092 = -1;

	@OriginalMember(owner = "client!ig", name = "fc", descriptor = "F")
	private float aFloat47 = 1.0F;

	@OriginalMember(owner = "client!ig", name = "bc", descriptor = "I")
	public int anInt3087 = 0;

	@OriginalMember(owner = "client!ig", name = "rc", descriptor = "I")
	public int anInt3091 = -1;

	@OriginalMember(owner = "client!ig", name = "yb", descriptor = "I")
	private int anInt3073 = -1;

	@OriginalMember(owner = "client!ig", name = "Jb", descriptor = "I")
	public int anInt3079 = 3584;

	@OriginalMember(owner = "client!ig", name = "vc", descriptor = "F")
	public float aFloat51 = 1.0F;

	@OriginalMember(owner = "client!ig", name = "ic", descriptor = "I")
	public int anInt3090 = -1;

	@OriginalMember(owner = "client!ig", name = "gb", descriptor = "I")
	private int anInt3067 = 0;

	@OriginalMember(owner = "client!ig", name = "yc", descriptor = "[F")
	private final float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!ig", name = "Hb", descriptor = "I")
	private int anInt3077 = 8448;

	@OriginalMember(owner = "client!ig", name = "mc", descriptor = "[F")
	private final float[] aFloatArray12 = new float[16];

	@OriginalMember(owner = "client!ig", name = "oc", descriptor = "[F")
	private final float[] aFloatArray13 = new float[4];

	@OriginalMember(owner = "client!ig", name = "Ec", descriptor = "I")
	private int anInt3094 = 0;

	@OriginalMember(owner = "client!ig", name = "Kc", descriptor = "I")
	public int anInt3096 = 50;

	@OriginalMember(owner = "client!ig", name = "Kb", descriptor = "[F")
	private final float[] aFloatArray11 = new float[4];

	@OriginalMember(owner = "client!ig", name = "Gc", descriptor = "F")
	public float aFloat53 = 3584.0F;

	@OriginalMember(owner = "client!ig", name = "Sc", descriptor = "I")
	public int anInt3097 = 0;

	@OriginalMember(owner = "client!ig", name = "lb", descriptor = "I")
	private int lb = 8448;

	@OriginalMember(owner = "client!ig", name = "ac", descriptor = "I")
	public int anInt3086 = -1;

	@OriginalMember(owner = "client!ig", name = "wb", descriptor = "I")
	private int anInt3072 = 0;

	@OriginalMember(owner = "client!ig", name = "Mc", descriptor = "F")
	private float aFloat54 = 1.0F;

	@OriginalMember(owner = "client!ig", name = "Xc", descriptor = "[F")
	public final float[] aFloatArray15 = new float[4];

	@OriginalMember(owner = "client!ig", name = "x", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas4;

	@OriginalMember(owner = "client!ig", name = "t", descriptor = "Lclient!bk;")
	public final Interface3 anInterface3_5;

	@OriginalMember(owner = "client!ig", name = "B", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!ig", name = "w", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl2;

	@OriginalMember(owner = "client!ig", name = "Hc", descriptor = "I")
	public final int anInt3095;

	@OriginalMember(owner = "client!ig", name = "qc", descriptor = "Z")
	private boolean aBoolean239;

	@OriginalMember(owner = "client!ig", name = "tb", descriptor = "Z")
	public boolean aBoolean226;

	@OriginalMember(owner = "client!ig", name = "fb", descriptor = "Z")
	public boolean aBoolean223;

	@OriginalMember(owner = "client!ig", name = "cc", descriptor = "Z")
	public boolean aBoolean236;

	@OriginalMember(owner = "client!ig", name = "tc", descriptor = "Z")
	private boolean aBoolean240;

	@OriginalMember(owner = "client!ig", name = "vb", descriptor = "Z")
	public boolean aBoolean228;

	@OriginalMember(owner = "client!ig", name = "z", descriptor = "Lclient!vb;")
	public final Class206 aClass206_1;

	@OriginalMember(owner = "client!ig", name = "C", descriptor = "Lclient!gf;")
	private final Class76 aClass76_1;

	@OriginalMember(owner = "client!ig", name = "E", descriptor = "Lclient!gk;")
	private final Class78 aClass78_1;

	@OriginalMember(owner = "client!ig", name = "y", descriptor = "Lclient!dg;")
	private final Class4_Sub14_Sub1 aClass4_Sub14_Sub1_1;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!bk;IILclient!ml;)V")
	public Class47_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class134 arg4) {
		this.aCanvas4 = arg0;
		this.anInterface3_5 = arg1;
		this.anInt3056 = arg2;
		@Pc(186) int local186 = 0;
		while (!this.aCanvas4.isShowing()) {
			if (local186++ > 5) {
				throw new RuntimeException("");
			}
			Static249.method4396(1000L);
		}
		this.aCanvas4.setIgnoreRepaint(true);
		try {
			if (Static131.aBoolean220 == null || !Static131.aBoolean220) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static131.aBoolean220 = Boolean.TRUE;
				} else {
					@Pc(220) Class185 local220 = arg4.method3769(this.getClass());
					while (local220.anInt5682 == 0) {
						Static249.method4396(100L);
					}
					if (local220.anInt5682 == 1) {
						Static131.aBoolean220 = Boolean.TRUE;
					}
				}
			}
			if (Static131.aBoolean220 == null || !Static131.aBoolean220) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas4, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method2771();
				this.anOpengl2 = this.aContext1.getGL();
				@Pc(287) int local287 = this.method2777();
				if (local287 != 0) {
					throw new RuntimeException("");
				}
				this.anInt3095 = this.aBoolean235 ? 33639 : 5121;
				@Pc(306) String local306 = this.aString30.toLowerCase();
				@Pc(310) String local310 = this.aString29.toLowerCase();
				if (local310.indexOf("radeon") != -1) {
					@Pc(317) int local317 = 0;
					@Pc(319) boolean local319 = false;
					@Pc(321) boolean local321 = false;
					@Pc(329) String[] local329 = Static212.method2554(local310.replace('/', ' '), ' ');
					for (@Pc(331) int local331 = 0; local331 < local329.length; local331++) {
						@Pc(339) String local339 = local329[local331];
						try {
							if (local339.length() > 0) {
								if (local339.charAt(0) == 'x' && local339.length() >= 3 && Static312.method5142(local339.substring(1, 3))) {
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
									if (local339.length() >= 4 && Static312.method5142(local339.substring(0, 4))) {
										local317 = Static246.method4383(local339.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(403) Exception local403) {
						}
					}
					if (!local321 && !local319) {
						if (local317 >= 7000 && local317 <= 7999) {
							this.aBoolean239 = false;
						}
						if (local317 >= 7000 && local317 <= 9250) {
							this.aBoolean226 = false;
						}
					}
					if (!local319 || local317 < 4000) {
						this.aBoolean223 = false;
					}
					this.aBoolean236 &= this.anOpengl2.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean240 = this.aBoolean239;
				}
				if (local306.contains("intel")) {
					this.aBoolean228 = false;
				}
				if (this.aBoolean239) {
					try {
						@Pc(461) int[] local461 = new int[1];
						this.anOpengl2.glGenBuffersARB(1, local461, 0);
					} catch (@Pc(469) Throwable local469) {
						throw new RuntimeException("", local469);
					}
				}
				this.method2767(this);
				this.method2691();
				this.method2764();
				new Class153(this);
				this.aClass206_1 = new Class206(this, this.anInterface3_5);
				Static199.method3743(true);
				this.aBoolean221 = true;
				this.aClass76_1 = new Class76(this);
				this.aClass78_1 = new Class78(this);
				this.aClass4_Sub14_Sub1_1 = new Class4_Sub14_Sub1(this);
				this.method2795();
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
						Static249.method4396(100L);
					}
				}
				this.anOpengl2.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(553) Throwable local553) {
			local553.printStackTrace();
			this.method2753();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local553);
		}
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(II)I")
	@Override
	public int method2742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ig", name = "y", descriptor = "()Z")
	@Override
	public boolean method2712() {
		return true;
	}

	@OriginalMember(owner = "client!ig", name = "M", descriptor = "()V")
	private void method2764() {
		this.aClass57_Sub2_2 = new Class57_Sub2();
		this.aClass57_Sub2_1 = new Class57_Sub2();
		this.aClass52Array1 = new Class52[this.anInt3075];
		this.aClass52_Sub1_7 = new Class52_Sub1(this, 3553, 6408, 1, 1);
		this.aClass52_Sub1_5 = new Class52_Sub1(this, 3553, 6408, 1, 1);
		this.aClass52_Sub1_6 = new Class52_Sub1(this, 3553, 6408, 1, 1);
		this.aClass38_Sub1_5 = new Class38_Sub1(this);
		this.aClass38_Sub1_4 = new Class38_Sub1(this);
		this.aClass38_Sub1_1 = new Class38_Sub1(this);
		this.aClass38_Sub1_2 = new Class38_Sub1(this);
		this.aClass38_Sub1_6 = new Class38_Sub1(this);
		this.aClass38_Sub1_3 = new Class38_Sub1(this);
		if (this.aBoolean228) {
			this.aClass77_4 = new Class77(this);
		}
		this.aClass68_1.method2124(this);
	}

	@OriginalMember(owner = "client!ig", name = "E", descriptor = "()F")
	@Override
	public float method2734() {
		return this.aFloat42;
	}

	@OriginalMember(owner = "client!ig", name = "N", descriptor = "()V")
	private void method2765() {
		if (this.anInt3068 == 1) {
			return;
		}
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		if (this.anInt3063 > 0 && this.anInt3064 > 0) {
			this.anOpengl2.glOrtho(0.0D, (double) this.anInt3063, (double) this.anInt3064, 0.0D, -1.0D, 1.0D);
		}
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anInt3068 = 1;
		this.anInt3071 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(Z)V")
	public void method2766(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean237) {
			this.aBoolean237 = arg0;
			this.method2802();
		}
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method2751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2835();
		this.method2811(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!k;Z)Lclient!vj;")
	@Override
	public Class58 method2677(@OriginalArg(0) Class110 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt3409 * arg0.anInt3411];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray50 == null) {
			for (local15 = 0; local15 < arg0.anInt3411; local15++) {
				for (local21 = 0; local21 < arg0.anInt3409; local21++) {
					@Pc(74) int local74 = arg0.anIntArray300[arg0.aByteArray49[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt3411; local15++) {
				for (local21 = 0; local21 < arg0.anInt3409; local21++) {
					local6[local10++] = arg0.aByteArray50[local8] << 24 | arg0.anIntArray300[arg0.aByteArray49[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class58 local100 = this.method2679(local6, arg0.anInt3409, arg0.anInt3409, arg0.anInt3411);
		local100.method4280(arg0.anInt3408, arg0.anInt3406, arg0.anInt3410, arg0.anInt3407);
		return local100;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!sg;II)V")
	@Override
	public void method2720(@OriginalArg(1) Class118 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class118_Sub2 local2 = (Class118_Sub2) arg0;
		@Pc(5) Class52_Sub1_Sub1 local5 = local2.aClass52_Sub1_Sub1_5;
		this.method2773();
		this.method2772(local2.aClass52_Sub1_Sub1_5);
		this.method2811(1);
		this.method2790(7681, 8448);
		this.method2801(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat90 / (float) local5.anInt5499;
		@Pc(37) float local37 = local5.aFloat89 / (float) local5.anInt5498;
		this.anOpengl2.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt3094 - arg1), local37 * (float) (this.anInt3067 - arg2));
		this.anOpengl2.glVertex2i(this.anInt3094, this.anInt3067);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt3094 - arg1), local37 * (float) (this.anInt3080 - arg2));
		this.anOpengl2.glVertex2i(this.anInt3094, this.anInt3080);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt3076 - arg1), local37 * (float) (this.anInt3080 - arg2));
		this.anOpengl2.glVertex2i(this.anInt3076, this.anInt3080);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt3076 - arg1), local37 * (float) (this.anInt3067 - arg2));
		this.anOpengl2.glVertex2i(this.anInt3076, this.anInt3067);
		this.anOpengl2.glEnd();
		this.method2801(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!eh;)V")
	public void method2767(@OriginalArg(0) Interface4 arg0) {
		if (this.anInt3061 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3061 >= 0) {
			this.anInterface4Array1[this.anInt3061].method2762();
		}
		this.anInterface4_1 = this.anInterface4Array1[++this.anInt3061] = arg0;
		this.anInterface4_1.method2763();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method2746(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt3092 != arg0;
		if (local7 || this.aFloat37 != arg1 || this.aFloat39 != arg2) {
			this.anInt3092 = arg0;
			this.aFloat37 = arg1;
			this.aFloat39 = arg2;
			if (local7) {
				this.aFloat51 = (float) (this.anInt3092 & 0xFF0000) / 1.671168E7F;
				this.aFloat40 = (float) (this.anInt3092 & 0xFFFF) / 65535.0F;
				this.aFloat43 = (float) (this.anInt3092 & 0xFF) / 255.0F;
				this.method2769();
			}
			this.method2803();
		}
		if (this.aFloatArray11[0] == arg3 && this.aFloatArray11[1] == arg4 && this.aFloatArray11[2] == arg5) {
			return;
		}
		this.aFloatArray11[0] = arg3;
		this.aFloatArray11[1] = arg4;
		this.aFloatArray11[2] = arg5;
		this.aFloatArray14[0] = -arg3;
		this.aFloatArray14[1] = -arg4;
		this.aFloatArray14[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray15[0] = arg3 * local132;
		this.aFloatArray15[1] = arg4 * local132;
		this.aFloatArray15[2] = arg5 * local132;
		this.aFloatArray13[0] = -this.aFloatArray15[0];
		this.aFloatArray13[1] = -this.aFloatArray15[1];
		this.aFloatArray13[2] = -this.aFloatArray15[2];
		this.method2827();
		this.anInt3070 = (int) (arg3 * 256.0F / arg4);
		this.anInt3084 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(Z)V")
	@Override
	public void method2758(@OriginalArg(0) boolean arg0) {
		this.aBoolean232 = arg0;
		this.method2797();
	}

	@OriginalMember(owner = "client!ig", name = "O", descriptor = "()Lclient!wl;")
	public Class52_Sub4 method2768() {
		return this.aClass81_Sub1_1 == null ? null : this.aClass81_Sub1_1.method5599();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([IIIII)Lclient!vj;")
	@Override
	public Class58 method2679(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class58_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)V")
	@Override
	public void method2725(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ig", name = "P", descriptor = "()V")
	private void method2769() {
		Static131.aFloatArray10[0] = this.aFloat55 * this.aFloat51;
		Static131.aFloatArray10[1] = this.aFloat55 * this.aFloat40;
		Static131.aFloatArray10[2] = this.aFloat55 * this.aFloat43;
		Static131.aFloatArray10[3] = 1.0F;
		this.anOpengl2.glLightModelfv(2899, Static131.aFloatArray10, 0);
	}

	@OriginalMember(owner = "client!ig", name = "B", descriptor = "()V")
	@Override
	public void method2723() {
	}

	@OriginalMember(owner = "client!ig", name = "D", descriptor = "()Z")
	@Override
	public boolean method2731() {
		return this.aClass4_Sub14_Sub1_1.method1264();
	}

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "(I)V")
	public synchronized void method2770(@OriginalArg(0) int arg0) {
		@Pc(4) Class4_Sub8 local4 = new Class4_Sub8(arg0);
		this.aClass116_25.method3274(local4);
	}

	@OriginalMember(owner = "client!ig", name = "K", descriptor = "()V")
	@Override
	public void method2756() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(F)V")
	@Override
	public void method2662(@OriginalArg(0) float arg0) {
		if (this.aFloat55 != arg0) {
			this.aFloat55 = arg0;
			this.method2769();
		}
	}

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "()Lclient!s;")
	@Override
	public Class57 method2706() {
		return this.aClass57_1;
	}

	@OriginalMember(owner = "client!ig", name = "Q", descriptor = "()V")
	private void method2771() {
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
			Static249.method4396(1000L);
		}
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
	@Override
	public void method2728(@OriginalArg(0) int arg0) {
		this.method2811(0);
		this.anOpengl2.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl2.glClear(16384);
	}

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "()Z")
	@Override
	public boolean method2675() {
		return true;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ee;)V")
	public void method2772(@OriginalArg(0) Class52 arg0) {
		@Pc(5) Class52 local5 = this.aClass52Array1[this.anInt3069];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl2.glDisable(local5.anInt6685);
			} else {
				if (local5 == null) {
					this.anOpengl2.glEnable(arg0.anInt6685);
				} else if (arg0.anInt6685 != local5.anInt6685) {
					this.anOpengl2.glDisable(local5.anInt6685);
					this.anOpengl2.glEnable(arg0.anInt6685);
				}
				this.anOpengl2.glBindTexture(arg0.anInt6685, arg0.method5610());
			}
			this.aClass52Array1[this.anInt3069] = arg0;
		}
		this.anInt3071 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ig", name = "R", descriptor = "()V")
	public void method2773() {
		if (this.anInt3071 == 2) {
			return;
		}
		this.method2765();
		this.method2798(false);
		this.method2825(false);
		this.method2794(false);
		this.method2810(false);
		this.method2814();
		this.anInt3071 = 2;
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)V")
	@Override
	public void method2744(@OriginalArg(0) int arg0) {
		this.method2771();
	}

	@OriginalMember(owner = "client!ig", name = "G", descriptor = "()Z")
	@Override
	public boolean method2740() {
		return true;
	}

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "()I")
	@Override
	public int method2683() {
		return this.anInt3096;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(III)V")
	@Override
	public void method2741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean224) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt3073 = arg1;
		this.anInt3091 = arg2;
		this.method2823();
		this.aClass76_1.method2283(arg0, true);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZZ)V")
	public void method2774(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt3093) {
			if (arg0 < 0) {
				this.method2786();
				this.method2772(null);
				if (!this.aBoolean224) {
					this.aClass76_1.method2281(arg1, arg2, 0);
				}
			} else {
				@Pc(11) Class52_Sub1 local11 = this.aClass206_1.method5381(arg0);
				@Pc(17) Class102 local17 = this.anInterface3_5.method5441(arg0);
				if (local17.aByte39 == 0 && local17.aByte37 == 0) {
					this.method2786();
				} else {
					@Pc(30) int local30 = local17.aBoolean256 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method2799((float) (this.anInt3057 % local34 * local17.aByte39) / (float) local34, (float) (this.anInt3057 % local34 * local17.aByte37) / (float) local34, 0.0F);
				}
				if (this.aBoolean224) {
					this.aClass76_1.method2281(arg1, arg2, 3);
					this.method2772(local11);
				} else {
					this.aClass76_1.method2281(arg1, arg2, local17.aByte36);
					this.aClass76_1.method2283(local17.aByte40, false);
					if (!this.aClass76_1.method2284(local11)) {
						this.method2772(local11);
					}
				}
			}
			this.anInt3093 = arg0;
		}
		this.anInt3071 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ig", name = "C", descriptor = "()I")
	@Override
	public int method2730() {
		return this.anInt3059 + this.anInt3058 + this.anInt3065;
	}

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "()I")
	@Override
	public int method2694() {
		@Pc(2) int local2 = this.anInt3099;
		this.anInt3099 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "()V")
	@Override
	public void method2678() {
		this.method2810(true);
		this.anOpengl2.glClear(256);
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(IIII)[I")
	@Override
	public int[] method2752() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl2.glReadPixels(0, this.anInt3064 - local6, 36, 1, 32993, this.anInt3095, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!ig", name = "S", descriptor = "()V")
	private void method2775() {
		if (this.anInt3068 != 3) {
			this.anInt3068 = 3;
			this.method2826();
			this.method2821();
			this.anInt3071 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "()V")
	@Override
	public void method2657() {
		this.aClass78_1.method2345();
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(IIIII)V")
	@Override
	protected void method2729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "(I)I")
	public int method2776(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl2.glLineWidth((float) arg5);
		this.method2751(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl2.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([I)V")
	@Override
	public void method2699(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3094;
		arg0[1] = this.anInt3067;
		arg0[2] = this.anInt3076;
		arg0[3] = this.anInt3080;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!qf;IIII)Lclient!ni;")
	@Override
	public Class38 method2717(@OriginalArg(0) Class165 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class38_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ig", name = "s", descriptor = "()I")
	@Override
	public int method2700() {
		return this.anInt3079;
	}

	@OriginalMember(owner = "client!ig", name = "T", descriptor = "()I")
	private int method2777() {
		@Pc(1) int local1 = 0;
		this.aString30 = this.anOpengl2.glGetString(7936);
		this.aString29 = this.anOpengl2.glGetString(7937);
		@Pc(17) String local17 = this.aString30.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl2.glGetString(7938);
		@Pc(53) String[] local53 = Static212.method2554(local45.replace('.', ' '), ' ');
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static246.method4383(local53[0]);
				@Pc(69) int local69 = Static246.method4383(local53[1]);
				this.anInt3066 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt3066 < 12) {
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
		this.anInt3088 = local116[0];
		this.anOpengl2.glGetIntegerv(34930, local116, 0);
		this.anInt3074 = local116[0];
		if (this.anInt3075 < 2 || this.anInt3088 < 2 || this.anInt3074 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean233 = Static200.aString41 != null && Static200.aString41.startsWith("mac");
		this.aBoolean235 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean239 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean238 = this.anOpengl2.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean242 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean231 = this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean226 = this.anOpengl2.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean236 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean227 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean223 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean229 = false;
		this.aBoolean228 = this.anOpengl2.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "()V")
	@Override
	public void method2763() {
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "()I")
	@Override
	public int method2761() {
		return this.anInt3064;
	}

	@OriginalMember(owner = "client!ig", name = "U", descriptor = "()V")
	public void method2778() {
		if (this.anInt3068 != 2) {
			this.anInt3068 = 2;
			this.method2800();
			this.method2821();
			this.anInt3071 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!os;)V")
	public void method2779(@OriginalArg(0) Class57_Sub2 arg0) {
		this.anOpengl2.glPushMatrix();
		this.anOpengl2.glMultMatrixf(arg0.method4206(), 0);
	}

	@OriginalMember(owner = "client!ig", name = "V", descriptor = "()V")
	private void method2780() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "()V")
	@Override
	public void method2664() {
		if (this.anInt3063 <= 0 && this.anInt3064 <= 0) {
			return;
		}
		@Pc(9) int local9 = this.anInt3094;
		@Pc(12) int local12 = this.anInt3076;
		@Pc(15) int local15 = this.anInt3067;
		@Pc(18) int local18 = this.anInt3080;
		this.method2722();
		this.anOpengl2.glReadBuffer(1028);
		this.anOpengl2.glDrawBuffer(1029);
		this.method2816();
		this.method2798(false);
		this.method2825(false);
		this.method2794(false);
		this.method2810(false);
		this.method2772(null);
		this.method2814();
		this.method2782(0);
		this.method2811(0);
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRasterPos2i(0, 0);
		this.anOpengl2.glCopyPixels(0, 0, this.anInt3063, this.anInt3064, 6144);
		this.anOpengl2.glFlush();
		this.anOpengl2.glReadBuffer(1029);
		this.anOpengl2.glDrawBuffer(1029);
		this.method2709(local9, local15, local12, local18);
	}

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "(I)I")
	public int method2781(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "(I)V")
	public void method2782(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2790(7681, 7681);
		} else if (arg0 == 1) {
			this.method2790(8448, 8448);
		} else if (arg0 == 2) {
			this.method2790(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass57_Sub2_2.aFloat72 * (float) arg0 + this.aClass57_Sub2_2.aFloat73 * (float) arg1 + this.aClass57_Sub2_2.aFloat82 * (float) arg2 + this.aClass57_Sub2_2.aFloat76;
		if (local24 < (float) this.anInt3096 || local24 > (float) this.anInt3079) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt3083 * (this.aClass57_Sub2_2.aFloat75 * (float) arg0 + this.aClass57_Sub2_2.aFloat81 * (float) arg1 + this.aClass57_Sub2_2.aFloat78 * (float) arg2 + this.aClass57_Sub2_2.aFloat79) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt3089 * (this.aClass57_Sub2_2.aFloat71 * (float) arg0 + this.aClass57_Sub2_2.aFloat77 * (float) arg1 + this.aClass57_Sub2_2.aFloat80 * (float) arg2 + this.aClass57_Sub2_2.aFloat74) / local24);
		if ((float) local81 >= this.aFloat57 && (float) local81 <= this.aFloat44 && (float) local113 >= this.aFloat46 && (float) local113 <= this.aFloat50) {
			arg3[0] = (int) ((float) local81 - this.aFloat57);
			arg3[1] = (int) ((float) local113 - this.aFloat46);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[BIZ)Lclient!mp;")
	public Interface8 method2783(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface8) (this.aBoolean239 && (!arg3 || this.aBoolean240) ? new Class48_Sub1(this, arg0, arg1, arg2, arg3) : new Class66_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "(II)V")
	public synchronized void method2784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class4_Sub8 local4 = new Class4_Sub8(arg1);
		local4.aLong223 = arg0;
		this.aClass116_20.method3274(local4);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([Lclient!ni;Lclient!s;[Lclient!rh;I)V")
	@Override
	public void method2711(@OriginalArg(0) Class38[] arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) Class2_Sub5[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method1925(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "F", descriptor = "()Z")
	@Override
	public boolean method2736() {
		return true;
	}

	@OriginalMember(owner = "client!ig", name = "W", descriptor = "()V")
	public void method2785() {
		if (this.anInt3071 == 8) {
			return;
		}
		this.method2778();
		this.method2798(true);
		this.method2794(true);
		this.method2810(true);
		this.method2811(1);
		this.method2782(1);
		this.anInt3071 = 8;
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "()Z")
	@Override
	public boolean method2658() {
		return true;
	}

	@OriginalMember(owner = "client!ig", name = "X", descriptor = "()V")
	private void method2786() {
		if (this.aBoolean243) {
			this.anOpengl2.glMatrixMode(5890);
			this.anOpengl2.glLoadIdentity();
			this.anOpengl2.glMatrixMode(5888);
			this.aBoolean243 = false;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!mp;")
	public Interface8 method2787(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface8) (this.aBoolean239 ? new Class48_Sub1(this, arg0, arg1, false) : new Class66_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZ)V")
	public void method2788(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method2774(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIII)V")
	@Override
	public void method2665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass78_1.method2338(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "(I)V")
	public synchronized void method2789(@OriginalArg(0) int arg0) {
		@Pc(4) Class4_Sub8 local4 = new Class4_Sub8(arg0);
		this.aClass116_22.method3274(local4);
	}

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "(II)V")
	public void method2790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3069 != 0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.lb != arg0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.lb = arg0;
			local4 = true;
		}
		if (this.anInt3077 != arg1) {
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			this.anInt3077 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt3071 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "(II)V")
	public void method2791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3078 = arg0;
		this.anInt3081 = arg1;
		this.anOpengl2.glViewport(arg0, arg1, this.anInt3063, this.anInt3064);
		this.method2829();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!rm;)V")
	@Override
	public void method2713(@OriginalArg(0) Class176 arg0) {
		this.aClass68_1.method2122(this, arg0);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFFF)V")
	public void method2792(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static131.aFloatArray10[0] = arg0;
		Static131.aFloatArray10[1] = arg1;
		Static131.aFloatArray10[2] = arg2;
		Static131.aFloatArray10[3] = arg3;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static131.aFloatArray10, 0);
	}

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "()Z")
	@Override
	public boolean method2672() {
		return this.aClass76_1.method2282();
	}

	@OriginalMember(owner = "client!ig", name = "A", descriptor = "()V")
	@Override
	public void method2722() {
		this.anInt3094 = 0;
		this.anInt3067 = 0;
		this.anInt3076 = this.anInt3063;
		this.anInt3080 = this.anInt3064;
		this.anOpengl2.glDisable(3089);
		this.method2796();
	}

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "()V")
	@Override
	public void method2671() {
		if (this.aClass4_Sub14_Sub1_1.method1261()) {
			this.aClass78_1.method2343(this.aClass4_Sub14_Sub1_1);
			this.aClass206_1.method5382();
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIILclient!sg;II)V")
	@Override
	public void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class118 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class118_Sub2 local2 = (Class118_Sub2) arg5;
		@Pc(5) Class52_Sub1_Sub1 local5 = local2.aClass52_Sub1_Sub1_5;
		this.method2773();
		this.method2772(local2.aClass52_Sub1_Sub1_5);
		this.method2811(1);
		this.method2790(7681, 8448);
		this.method2801(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat90 / (float) local5.anInt5499;
		@Pc(37) float local37 = local5.aFloat89 / (float) local5.anInt5498;
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
		this.method2801(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)Lclient!bc;")
	@Override
	public Class4_Sub5 method2696() {
		return null;
	}

	@OriginalMember(owner = "client!ig", name = "Y", descriptor = "()V")
	private void method2793() {
		@Pc(2) float[] local2 = this.aFloatArray12;
		@Pc(14) float local14 = (float) (-this.anInt3097 * this.anInt3096) / (float) this.anInt3083;
		@Pc(28) float local28 = (float) ((this.anInt3063 - this.anInt3097) * this.anInt3096) / (float) this.anInt3083;
		@Pc(39) float local39 = (float) (this.anInt3087 * this.anInt3096) / (float) this.anInt3089;
		@Pc(53) float local53 = (float) ((this.anInt3087 - this.anInt3064) * this.anInt3096) / (float) this.anInt3089;
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
			@Pc(67) float local67 = (float) this.anInt3096 * 2.0F;
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
			local2[10] = this.aFloat41 = (float) -(this.anInt3079 + this.anInt3096) / (float) (this.anInt3079 - this.anInt3096);
			local2[11] = -1.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = this.aFloat52 = -(local67 * (float) this.anInt3079) / (float) (this.anInt3079 - this.anInt3096);
			local2[15] = 0.0F;
		}
		this.method2836();
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
	@Override
	public void method2738(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(IIII)V")
	@Override
	public void method2709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt3063) {
			arg2 = this.anInt3063;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt3064) {
			arg3 = this.anInt3064;
		}
		this.anInt3094 = arg0;
		this.anInt3067 = arg1;
		this.anInt3076 = arg2;
		this.anInt3080 = arg3;
		this.anOpengl2.glEnable(3089);
		this.method2796();
		this.method2829();
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(Z)V")
	public void method2794(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean230) {
			return;
		}
		if (arg0) {
			this.anOpengl2.glEnable(2929);
		} else {
			this.anOpengl2.glDisable(2929);
		}
		this.aBoolean230 = arg0;
		this.anInt3071 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ig", name = "Z", descriptor = "()V")
	private void method2795() {
		this.method2814();
		for (@Pc(7) int local7 = this.anInt3075 - 1; local7 >= 0; local7--) {
			this.method2828(local7);
			this.method2772(null);
			this.anOpengl2.glTexEnvi(8960, 8704, 34160);
		}
		this.method2790(8448, 8448);
		this.method2801(2, 34168, 770);
		this.method2786();
		this.anInt3082 = 1;
		this.anOpengl2.glEnable(3042);
		this.anOpengl2.glBlendFunc(770, 771);
		this.anInt3085 = 1;
		this.anOpengl2.glEnable(3008);
		this.anOpengl2.glAlphaFunc(516, 0.0F);
		this.aBoolean244 = true;
		this.anOpengl2.glColorMask(true, true, true, true);
		this.aBoolean234 = true;
		this.method2798(true);
		this.method2825(true);
		this.method2794(true);
		this.method2810(true);
		this.method2816();
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
		this.anInt3092 = this.anInt3086 = -1;
		this.method2722();
	}

	@OriginalMember(owner = "client!ig", name = "ab", descriptor = "()V")
	private void method2796() {
		this.aFloat57 = this.anInt3094 - this.anInt3097;
		this.aFloat44 = this.anInt3076 - this.anInt3097;
		this.aFloat46 = this.anInt3067 - this.anInt3087;
		this.aFloat50 = this.anInt3080 - this.anInt3087;
	}

	@OriginalMember(owner = "client!ig", name = "bb", descriptor = "()V")
	private void method2797() {
		this.anOpengl2.glDepthMask(this.aBoolean222 && this.aBoolean232);
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(Z)V")
	public void method2798(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean241) {
			this.aBoolean241 = arg0;
			this.method2832();
			this.anInt3071 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(FFF)V")
	private void method2799(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl2.glMatrixMode(5890);
		if (this.aBoolean243) {
			this.anOpengl2.glLoadIdentity();
		}
		this.anOpengl2.glTranslatef(arg0, arg1, arg2);
		this.anOpengl2.glMatrixMode(5888);
		this.aBoolean243 = true;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)I")
	@Override
	public int method2695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[Lclient!pc;)V")
	@Override
	public void method2716(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub33[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class4_Sub33 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static131.aFloatArray9[0] = local8.anInt5295;
			Static131.aFloatArray9[1] = local8.anInt5294;
			Static131.aFloatArray9[2] = local8.anInt5298;
			Static131.aFloatArray9[3] = 1.0F;
			this.anOpengl2.glLightfv(local12, 4611, Static131.aFloatArray9, 0);
			@Pc(44) int local44 = local8.anInt5293;
			@Pc(49) float local49 = local8.aFloat85 / 255.0F;
			Static131.aFloatArray9[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static131.aFloatArray9[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static131.aFloatArray9[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl2.glLightfv(local12, 4609, Static131.aFloatArray9, 0);
			this.anOpengl2.glLightf(local12, 4617, 1.0F / (float) (local8.anInt5292 * local8.anInt5292));
			this.anOpengl2.glEnable(local12);
		}
		while (local1 < this.anInt3072) {
			this.anOpengl2.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt3072 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method2724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2835();
		this.method2811(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!ig", name = "cb", descriptor = "()V")
	private void method2800() {
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadMatrixf(this.aFloatArray12, 0);
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "()V")
	@Override
	public void method2762() {
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ro;)V")
	@Override
	public void method2739(@OriginalArg(0) Class81 arg0) {
		this.aClass81_Sub1_1 = (Class81_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(III)V")
	public void method2801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "()V")
	@Override
	public void method2691() {
		this.anInt3063 = this.aCanvas4.getWidth();
		this.anInt3064 = this.aCanvas4.getHeight();
		this.anOpengl2.glViewport(this.anInt3078, this.anInt3081, this.anInt3063, this.anInt3064);
		this.method2816();
		this.method2722();
	}

	@OriginalMember(owner = "client!ig", name = "db", descriptor = "()V")
	private void method2802() {
		if (this.aBoolean225 && !this.aBoolean237) {
			this.anOpengl2.glEnable(2896);
		} else {
			this.anOpengl2.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "()Z")
	@Override
	public boolean method2661() {
		if (!this.aClass4_Sub14_Sub1_1.method1261()) {
			if (!this.aClass78_1.method2341(this.aClass4_Sub14_Sub1_1)) {
				return false;
			}
			this.aClass206_1.method5382();
		}
		return true;
	}

	@OriginalMember(owner = "client!ig", name = "H", descriptor = "()I")
	@Override
	public int method2745() {
		return 4;
	}

	@OriginalMember(owner = "client!ig", name = "eb", descriptor = "()V")
	private void method2803() {
		Static131.aFloatArray10[0] = this.aFloat37 * this.aFloat51;
		Static131.aFloatArray10[1] = this.aFloat37 * this.aFloat40;
		Static131.aFloatArray10[2] = this.aFloat37 * this.aFloat43;
		Static131.aFloatArray10[3] = 1.0F;
		this.anOpengl2.glLightfv(16384, 4609, Static131.aFloatArray10, 0);
		Static131.aFloatArray10[0] = -this.aFloat39 * this.aFloat51;
		Static131.aFloatArray10[1] = -this.aFloat39 * this.aFloat40;
		Static131.aFloatArray10[2] = -this.aFloat39 * this.aFloat43;
		Static131.aFloatArray10[3] = 1.0F;
		this.anOpengl2.glLightfv(16385, 4609, Static131.aFloatArray10, 0);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method2685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass52_Sub1_Sub1_1 == null || this.aClass52_Sub1_Sub1_1.anInt5495 < arg2 || this.aClass52_Sub1_Sub1_1.anInt5496 < arg3) {
			this.aClass52_Sub1_Sub1_1 = Static367.method4737(this, arg6, arg2, arg3);
			this.aClass52_Sub1_Sub1_1.method4734(false, false);
			local32 = this.aClass52_Sub1_Sub1_1.aFloat89;
			local36 = this.aClass52_Sub1_Sub1_1.aFloat90;
		} else {
			this.aClass52_Sub1_Sub1_1.method4731(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass52_Sub1_Sub1_1.aFloat89 * (float) arg3 / (float) this.aClass52_Sub1_Sub1_1.anInt5496;
			local36 = this.aClass52_Sub1_Sub1_1.aFloat90 * (float) arg2 / (float) this.aClass52_Sub1_Sub1_1.anInt5495;
		}
		this.method2773();
		this.method2772(this.aClass52_Sub1_Sub1_1);
		this.method2811(arg8);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method2820(arg5);
		this.method2790(34165, 34165);
		this.method2801(0, 34166, 768);
		this.method2801(2, 5890, 770);
		this.method2804(0, 34166);
		this.method2804(2, 5890);
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
		this.method2801(0, 5890, 768);
		this.method2801(2, 34166, 770);
		this.method2804(0, 5890);
		this.method2804(2, 34166);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(FF)V")
	@Override
	public void method2701(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat38 && arg1 == this.aFloat42) {
			return;
		}
		this.aFloat38 = arg0;
		this.aFloat42 = arg1;
		this.method2836();
		if (this.anInt3068 == 3) {
			this.method2826();
		} else if (this.anInt3068 == 2) {
			this.method2800();
		}
	}

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "()Z")
	@Override
	public boolean method2686() {
		return false;
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(III)V")
	public void method2804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ig", name = "w", descriptor = "()I")
	@Override
	public int method2708() {
		@Pc(2) int local2 = this.anInt3098;
		this.anInt3098 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ig", name = "J", descriptor = "()Z")
	@Override
	public boolean method2754() {
		return false;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!wi;Lclient!wi;Lclient!wi;Lclient!wi;)V")
	public void method2805(@OriginalArg(0) Class217 arg0, @OriginalArg(1) Class217 arg1, @OriginalArg(2) Class217 arg2, @OriginalArg(3) Class217 arg3) {
		if (arg0 == null) {
			this.anOpengl2.glDisableClientState(32884);
		} else {
			this.anOpengl2.glEnableClientState(32884);
			arg0.method5568();
		}
		if (arg1 == null) {
			this.anOpengl2.glDisableClientState(32885);
		} else {
			this.anOpengl2.glEnableClientState(32885);
			arg1.method5567();
		}
		if (arg2 == null) {
			this.anOpengl2.glDisableClientState(32886);
		} else {
			this.anOpengl2.glEnableClientState(32886);
			arg2.method5570();
		}
		if (arg3 == null) {
			this.anOpengl2.glDisableClientState(32888);
		} else {
			this.anOpengl2.glEnableClientState(32888);
			arg3.method5569();
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!is;)V")
	public void method2806(@OriginalArg(0) Interface6 arg0) {
		if (this.anInterface6_4 != arg0 && this.aBoolean239) {
			this.anOpengl2.glBindBufferARB(34963, arg0.method4256());
			this.anInterface6_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "(II)V")
	public synchronized void method2807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class4_Sub8 local4 = new Class4_Sub8(arg1);
		local4.aLong223 = arg0;
		this.aClass116_21.method3274(local4);
	}

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "()Z")
	@Override
	public boolean method2680() {
		return false;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2668(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static59.aFloat14 = arg0;
		Static59.aFloat12 = arg1;
		Static59.aFloat13 = arg2;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Lclient!eh;)V")
	public void method2808(@OriginalArg(0) Interface4 arg0) {
		if (this.anInt3061 < 0 || this.anInterface4Array1[this.anInt3061] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface4Array1[this.anInt3061--] = null;
		arg0.method2762();
		if (this.anInt3061 >= 0) {
			this.anInterface4_1 = this.anInterface4Array1[this.anInt3061];
			this.anInterface4_1.method2763();
		}
	}

	@OriginalMember(owner = "client!ig", name = "z", descriptor = "()V")
	@Override
	public void method2719() {
		this.aClass76_1.method2281(false, false, 0);
		this.aBoolean224 = false;
		this.method2823();
		this.method2832();
	}

	@OriginalMember(owner = "client!ig", name = "fb", descriptor = "()V")
	public void method2809() {
		if (this.anInt3071 == 4) {
			return;
		}
		this.method2765();
		this.method2798(false);
		this.method2825(false);
		this.method2794(false);
		this.method2810(false);
		this.method2814();
		this.method2811(1);
		this.method2782(1);
		this.anInt3071 = 4;
	}

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "(Z)V")
	public void method2810(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean222) {
			this.aBoolean222 = arg0;
			this.method2797();
			this.anInt3071 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ig", name = "I", descriptor = "()V")
	@Override
	protected void method2753() {
		if (this.anOpengl2 != null) {
			try {
				this.aClass78_1.method2342();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl2 = null;
		}
		if (this.aContext1 != null) {
			this.method2780();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean221) {
			Static181.method3486(true);
			this.aBoolean221 = false;
		}
	}

	@OriginalMember(owner = "client!ig", name = "L", descriptor = "()Z")
	@Override
	public boolean method2757() {
		return this.aClass4_Sub14_Sub1_1.method1261();
	}

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "(I)V")
	public void method2811(@OriginalArg(0) int arg0) {
		if (this.anInt3082 == arg0) {
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
		if (local10 != this.aBoolean234) {
			this.anOpengl2.glColorMask(local10, local10, local10, true);
			this.aBoolean234 = local10;
		}
		if (local12 != this.aBoolean244) {
			if (local12) {
				this.anOpengl2.glEnable(3008);
			} else {
				this.anOpengl2.glDisable(3008);
			}
			this.aBoolean244 = local12;
		}
		if (local8 != this.anInt3085) {
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
			this.anInt3085 = local8;
		}
		this.anInt3082 = arg0;
		this.anInt3071 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!s;)V")
	@Override
	public void method2656(@OriginalArg(0) Class57 arg0) {
		this.aClass57_Sub2_2 = (Class57_Sub2) arg0;
		this.aClass57_Sub2_1.method4207(this.aClass57_Sub2_2);
		if (this.anInt3068 != 1) {
			this.method2821();
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!mp;)V")
	public void method2812(@OriginalArg(0) Interface8 arg0) {
		if (this.anInterface8_4 != arg0 && this.aBoolean239) {
			this.anOpengl2.glBindBufferARB(34962, arg0.method4256());
			this.anInterface8_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "(II)V")
	public synchronized void method2813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class4_Sub8 local4 = new Class4_Sub8(arg1);
		local4.aLong223 = arg0;
		this.aClass116_22.method3274(local4);
	}

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "()Z")
	@Override
	public boolean method2670() {
		return !this.aBoolean233;
	}

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "(I)V")
	public void method2814() {
		this.method2788(-2, true);
	}

	@OriginalMember(owner = "client!ig", name = "gb", descriptor = "()Lclient!eh;")
	public Interface4 method2815() {
		return this.anInterface4_1;
	}

	@OriginalMember(owner = "client!ig", name = "hb", descriptor = "()V")
	public void method2816() {
		if (this.anInt3068 != 0) {
			this.anInt3068 = 0;
			this.anInt3071 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	@Override
	public void method2655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3096 == arg0 && this.anInt3079 == arg1) {
			return;
		}
		this.anInt3096 = arg0;
		this.anInt3079 = arg1;
		this.method2793();
		this.method2823();
		if (this.anInt3068 == 3) {
			this.method2826();
		} else if (this.anInt3068 == 2) {
			this.method2800();
		}
	}

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "(I)V")
	public synchronized void method2817(@OriginalArg(0) int arg0) {
		@Pc(4) Class4_Sub8 local4 = new Class4_Sub8(arg0);
		this.aClass116_24.method3274(local4);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!is;III)V")
	public void method2818(@OriginalArg(0) Interface6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2806(arg0);
		arg0.method4257(arg1, arg2);
	}

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "(IIIIII)V")
	@Override
	public void method2759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method2835();
		this.method2811(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean238) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local23);
		this.anOpengl2.glVertex2f(local16, local23);
		this.anOpengl2.glVertex2f(local16, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean238) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
	@Override
	public void method2676(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2666() {
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I[BIZ)Lclient!is;")
	public Interface6 method2819(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface6) (this.aBoolean239 && (!arg2 || this.aBoolean240) ? new Class48_Sub2(this, 5123, arg0, arg1, arg2) : new Class66_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "(I)V")
	public void method2820(@OriginalArg(0) int arg0) {
		Static131.aFloatArray10[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static131.aFloatArray10[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static131.aFloatArray10[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static131.aFloatArray10[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static131.aFloatArray10, 0);
	}

	@OriginalMember(owner = "client!ig", name = "t", descriptor = "()F")
	@Override
	public float method2702() {
		return this.aFloat38;
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(II)V")
	@Override
	public void method2703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3086 == arg0 && this.anInt3090 == arg1) {
			return;
		}
		this.anInt3086 = arg0;
		this.anInt3090 = arg1;
		if (!this.aBoolean224) {
			this.method2823();
			this.method2832();
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method2707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2835();
		this.method2811(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!ig", name = "ib", descriptor = "()V")
	private void method2821() {
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl2.glMultMatrixf(this.aClass57_Sub2_2.method4206(), 0);
		this.method2827();
	}

	@OriginalMember(owner = "client!ig", name = "jb", descriptor = "()V")
	public void method2822() {
		if (this.anInt3071 == 16) {
			return;
		}
		this.method2775();
		this.method2798(true);
		this.method2794(true);
		this.method2810(true);
		this.method2811(1);
		this.method2782(1);
		this.anInt3071 = 16;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ro;Lclient!ro;FLclient!ro;)Lclient!ro;")
	@Override
	public Class81 method2718(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class81 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean227 && this.aBoolean228) {
			@Pc(11) Class81_Sub1_Sub2 local11 = null;
			@Pc(14) Class81_Sub1 local14 = (Class81_Sub1) arg0;
			@Pc(17) Class81_Sub1 local17 = (Class81_Sub1) arg1;
			@Pc(21) Class52_Sub4 local21 = local14.method5599();
			@Pc(25) Class52_Sub4 local25 = local17.method5599();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt6687 > local25.anInt6687 ? local21.anInt6687 : local25.anInt6687;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class81_Sub1_Sub2) {
					@Pc(52) Class81_Sub1_Sub2 local52 = (Class81_Sub1_Sub2) arg3;
					if (local52.method5600() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class81_Sub1_Sub2(this, local40);
				}
				local11.method5601(local25, arg2, local21);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ig", name = "kb", descriptor = "()V")
	private void method2823() {
		@Pc(15) int local15;
		if (this.aBoolean224) {
			this.anOpengl2.glFogf(2915, 0.0F);
			this.anOpengl2.glFogf(2916, 1.0F);
			local15 = this.anInt3073;
		} else {
			this.aFloat56 = (float) (this.anInt3079 - 256) - this.aFloat49;
			this.aFloat48 = this.aFloat56 - (float) this.anInt3090 * this.aFloat47;
			if (this.aFloat48 < (float) this.anInt3096) {
				this.aFloat48 = this.anInt3096;
			}
			this.anOpengl2.glFogf(2915, this.aFloat48);
			this.anOpengl2.glFogf(2916, this.aFloat56);
			local15 = this.anInt3086;
		}
		Static131.aFloatArray10[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static131.aFloatArray10[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static131.aFloatArray10[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl2.glFogfv(2918, Static131.aFloatArray10, 0);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(F)V")
	public void method2824(@OriginalArg(0) float arg0) {
		if (this.aFloat54 != arg0) {
			this.aFloat54 = arg0;
			if (this.anInt3068 == 3) {
				this.method2826();
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "(Z)V")
	public void method2825(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean225) {
			this.aBoolean225 = arg0;
			this.method2802();
			this.anInt3071 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II[[I[[IIII)Lclient!uh;")
	@Override
	public Class60 method2690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class60_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIIIII)Z")
	@Override
	public boolean method2684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass57_Sub2_2.aFloat72 * (float) arg0 + this.aClass57_Sub2_2.aFloat73 * (float) arg1 + this.aClass57_Sub2_2.aFloat82 * (float) arg2 + this.aClass57_Sub2_2.aFloat76;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass57_Sub2_2.aFloat72 * (float) arg3 + this.aClass57_Sub2_2.aFloat73 * (float) arg4 + this.aClass57_Sub2_2.aFloat82 * (float) arg5 + this.aClass57_Sub2_2.aFloat76;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt3096 && local55 < (float) this.anInt3096 || !(!(local24 > (float) this.anInt3079) || !(local55 > (float) this.anInt3079))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt3083 * (this.aClass57_Sub2_2.aFloat75 * (float) arg0 + this.aClass57_Sub2_2.aFloat81 * (float) arg1 + this.aClass57_Sub2_2.aFloat78 * (float) arg2 + this.aClass57_Sub2_2.aFloat79) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt3083 * (this.aClass57_Sub2_2.aFloat75 * (float) arg3 + this.aClass57_Sub2_2.aFloat81 * (float) arg4 + this.aClass57_Sub2_2.aFloat78 * (float) arg5 + this.aClass57_Sub2_2.aFloat79) / local55);
		if ((float) local119 < this.aFloat57 && (float) local151 < this.aFloat57 || (float) local119 > this.aFloat44 && (float) local151 > this.aFloat44) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt3089 * (this.aClass57_Sub2_2.aFloat71 * (float) arg0 + this.aClass57_Sub2_2.aFloat77 * (float) arg1 + this.aClass57_Sub2_2.aFloat80 * (float) arg2 + this.aClass57_Sub2_2.aFloat74) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt3089 * (this.aClass57_Sub2_2.aFloat71 * (float) arg3 + this.aClass57_Sub2_2.aFloat77 * (float) arg4 + this.aClass57_Sub2_2.aFloat80 * (float) arg5 + this.aClass57_Sub2_2.aFloat74) / local55);
			return (!((float) local209 < this.aFloat46) || !((float) local241 < this.aFloat46)) && (!((float) local209 > this.aFloat50) || !((float) local241 > this.aFloat50));
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!bc;)V")
	@Override
	public void method2674(@OriginalArg(0) Class4_Sub5 arg0) {
	}

	@OriginalMember(owner = "client!ig", name = "lb", descriptor = "()V")
	private void method2826() {
		@Pc(11) float local11 = (float) -this.anInt3097 * this.aFloat54 / (float) this.anInt3083;
		@Pc(23) float local23 = (float) -this.anInt3087 * this.aFloat54 / (float) this.anInt3089;
		@Pc(37) float local37 = (float) (this.anInt3063 - this.anInt3097) * this.aFloat54 / (float) this.anInt3083;
		@Pc(51) float local51 = (float) (this.anInt3064 - this.anInt3087) * this.aFloat54 / (float) this.anInt3089;
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		if (local11 != local37 && local51 != local23) {
			this.anOpengl2.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt3096 - this.aFloat42), (double) ((float) this.anInt3079 - this.aFloat42));
		}
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ig", name = "mb", descriptor = "()V")
	public void method2827() {
		this.anOpengl2.glLightfv(16384, 4611, this.aFloatArray15, 0);
		this.anOpengl2.glLightfv(16385, 4611, this.aFloatArray13, 0);
	}

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "(I)V")
	public void method2828(@OriginalArg(0) int arg0) {
		if (this.anInt3069 != arg0) {
			this.anOpengl2.glActiveTexture(arg0 + 33984);
			this.anInt3069 = arg0;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)V")
	@Override
	public void method2660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3097 = arg0;
		this.anInt3087 = arg1;
		this.anInt3083 = arg2;
		this.anInt3089 = arg3;
		this.method2793();
		this.method2796();
		if (this.anInt3068 == 3) {
			this.method2826();
		} else if (this.anInt3068 == 2) {
			this.method2800();
		}
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(IIII)V")
	@Override
	public void method2681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3094 < arg0) {
			this.anInt3094 = arg0;
		}
		if (this.anInt3076 > arg2) {
			this.anInt3076 = arg2;
		}
		if (this.anInt3067 < arg1) {
			this.anInt3067 = arg1;
		}
		if (this.anInt3080 > arg3) {
			this.anInt3080 = arg3;
		}
		this.anOpengl2.glEnable(3089);
		this.method2796();
		this.method2829();
	}

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "(I)V")
	@Override
	public void method2755(@OriginalArg(0) int arg0) {
		this.method2780();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
	@Override
	public void method2689() {
		this.aBoolean224 = true;
		this.anInt3073 = 1583160;
		this.anInt3091 = 40;
		this.method2823();
		this.method2832();
		this.aClass76_1.method2281(false, false, 3);
		this.aClass76_1.method2283(-1, true);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method2692(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class4_Sub8 local16;
		while (!this.aClass116_20.method3277()) {
			local16 = (Class4_Sub8) this.aClass116_20.method3266();
			Static131.anIntArray268[local1++] = (int) local16.aLong223;
			this.anInt3059 -= local16.anInt492;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteBuffersARB(local1, Static131.anIntArray268, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteBuffersARB(local1, Static131.anIntArray268, 0);
			local1 = 0;
		}
		while (!this.aClass116_21.method3277()) {
			local16 = (Class4_Sub8) this.aClass116_21.method3266();
			Static131.anIntArray268[local1++] = (int) local16.aLong223;
			this.anInt3058 -= local16.anInt492;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteTextures(local1, Static131.anIntArray268, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteTextures(local1, Static131.anIntArray268, 0);
			local1 = 0;
		}
		while (!this.aClass116_22.method3277()) {
			local16 = (Class4_Sub8) this.aClass116_22.method3266();
			Static131.anIntArray268[local1++] = local16.anInt492;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteFramebuffersEXT(local1, Static131.anIntArray268, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteFramebuffersEXT(local1, Static131.anIntArray268, 0);
			local1 = 0;
		}
		while (!this.aClass116_23.method3277()) {
			local16 = (Class4_Sub8) this.aClass116_23.method3266();
			Static131.anIntArray268[local1++] = (int) local16.aLong223;
			this.anInt3065 -= local16.anInt492;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static131.anIntArray268, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static131.anIntArray268, 0);
			local1 = 0;
		}
		while (!this.aClass116_24.method3277()) {
			local16 = (Class4_Sub8) this.aClass116_24.method3266();
			Static131.anIntArray268[local1++] = (int) local16.aLong223;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteProgramsARB(local1, Static131.anIntArray268, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteProgramsARB(local1, Static131.anIntArray268, 0);
		}
		while (!this.aClass116_19.method3277()) {
			local16 = (Class4_Sub8) this.aClass116_19.method3266();
			this.anOpengl2.glDeleteLists((int) local16.aLong223, local16.anInt492);
		}
		while (!this.aClass116_25.method3277()) {
			local16 = (Class4_Sub8) this.aClass116_25.method3266();
			this.anOpengl2.glDeleteObjectARB(local16.anInt492);
		}
		while (!this.aClass116_19.method3277()) {
			local16 = (Class4_Sub8) this.aClass116_19.method3266();
			this.anOpengl2.glDeleteLists((int) local16.aLong223, local16.anInt492);
		}
		if (this.method2730() > 100663296 && Static208.method3879() > this.aLong91 + 60000L) {
			System.gc();
			this.aLong91 = Static208.method3879();
		}
		this.anInt3057 = local5;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([Lclient!ni;Lclient!rm;Lclient!s;[Lclient!rh;I)V")
	@Override
	public void method2714(@OriginalArg(0) Class38[] arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) Class2_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method2711(arg0, arg2, arg3, arg4);
		this.method2713(arg1);
	}

	@OriginalMember(owner = "client!ig", name = "nb", descriptor = "()V")
	private void method2829() {
		if (this.anInt3094 <= this.anInt3076 && this.anInt3067 <= this.anInt3080) {
			this.anOpengl2.glScissor(this.anInt3078 + this.anInt3094, this.anInt3081 + this.anInt3064 - this.anInt3080, this.anInt3076 - this.anInt3094, this.anInt3080 - this.anInt3067);
		} else {
			this.anOpengl2.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ig", name = "ob", descriptor = "()V")
	public void method2830() {
		this.anOpengl2.glPopMatrix();
	}

	@OriginalMember(owner = "client!ig", name = "r", descriptor = "()Z")
	@Override
	public boolean method2697() {
		return this.aBoolean238;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method2682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method2835();
		this.method2811(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean238) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local19);
		this.anOpengl2.glVertex2f(local14, local19);
		this.anOpengl2.glVertex2f(local14, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean238) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ni;Lclient!rm;Lclient!s;Lclient!rh;I)V")
	@Override
	public void method2760(@OriginalArg(0) Class38 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) Class2_Sub5 arg3) {
		arg0.method1925(arg2, arg3, 0);
		this.method2713(arg1);
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(IIIIII)Lclient!ro;")
	@Override
	public Class81 method2735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean227 ? new Class81_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ig", name = "r", descriptor = "(I)I")
	public int method2831(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ig", name = "u", descriptor = "()Lclient!s;")
	@Override
	public Class57 method2705() {
		return new Class57_Sub2();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2726(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ig", name = "pb", descriptor = "()V")
	private void method2832() {
		if (this.aBoolean241 && this.aBoolean224 | this.anInt3090 >= 0) {
			this.anOpengl2.glEnable(2912);
		} else {
			this.anOpengl2.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(FF)V")
	public void method2833(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat47 = arg0;
		this.aFloat49 = arg1;
		if (!this.aBoolean224) {
			this.method2823();
		}
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(III)V")
	public void method2834(@OriginalArg(2) int arg0) {
		this.anOpengl2.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ig", name = "qb", descriptor = "()V")
	private void method2835() {
		if (this.anInt3071 == 1) {
			return;
		}
		this.method2765();
		this.method2798(false);
		this.method2825(false);
		this.method2794(false);
		this.method2810(false);
		this.method2772(null);
		this.method2814();
		this.method2782(0);
		this.anInt3071 = 1;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II[I[I)Lclient!sg;")
	@Override
	public Class118 method2663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static364.method3918(arg0, arg2, arg3, arg1, this);
	}

	@OriginalMember(owner = "client!ig", name = "rb", descriptor = "()V")
	private void method2836() {
		if (this.aFloat42 == 0.0F) {
			this.aFloatArray12[10] = this.aFloat41;
			this.aFloatArray12[14] = this.aFloat52;
		} else {
			@Pc(13) float local13 = this.aFloat38 / (this.aFloat42 + this.aFloat38);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat52 * (1.0F - local13) * (1.0F - local13) / this.aFloat42;
			this.aFloatArray12[10] = this.aFloat41 + local32;
			this.aFloatArray12[14] = this.aFloat52 * local17;
		}
		this.aFloat53 = (this.aFloatArray12[14] - (float) this.anInt3079) / this.aFloatArray12[10];
		this.aFloat45 = (float) this.anInt3079 - this.aFloat42;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!bb;[Lclient!k;Z)Lclient!ug;")
	@Override
	public Class51 method2693(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class110[] arg1) {
		return new Class51_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2750(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method2756();
	}

	@OriginalMember(owner = "client!ig", name = "x", descriptor = "()Z")
	@Override
	public boolean method2710() {
		return true;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIZ)Lclient!vj;")
	@Override
	public Class58 method2733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class58_Sub2(this, arg0, arg1, arg2, arg3);
	}
}
