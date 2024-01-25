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

@OriginalClass("client!hj")
public final class Class2_Sub1 extends Class2 implements Interface2 {

	@OriginalMember(owner = "client!hj", name = "F", descriptor = "Lclient!fp;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
	public int anInt2408;

	@OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
	public int anInt2409;

	@OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
	public int anInt2411;

	@OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
	public int anInt2412;

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
	private int anInt2414;

	@OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
	public int anInt2415;

	@OriginalMember(owner = "client!hj", name = "Y", descriptor = "Ljava/lang/String;")
	private String aString100;

	@OriginalMember(owner = "client!hj", name = "ab", descriptor = "Z")
	public boolean aBoolean202;

	@OriginalMember(owner = "client!hj", name = "bb", descriptor = "Lclient!bj;")
	public Class21_Sub1 aClass21_Sub1_1;

	@OriginalMember(owner = "client!hj", name = "cb", descriptor = "Z")
	private boolean aBoolean203;

	@OriginalMember(owner = "client!hj", name = "db", descriptor = "Lclient!qa;")
	public Class78_Sub2 aClass78_Sub2_1;

	@OriginalMember(owner = "client!hj", name = "fb", descriptor = "Z")
	public boolean aBoolean204;

	@OriginalMember(owner = "client!hj", name = "gb", descriptor = "I")
	public int anInt2418;

	@OriginalMember(owner = "client!hj", name = "hb", descriptor = "I")
	private int anInt2419;

	@OriginalMember(owner = "client!hj", name = "ib", descriptor = "Z")
	public boolean aBoolean205;

	@OriginalMember(owner = "client!hj", name = "jb", descriptor = "Z")
	private boolean aBoolean206;

	@OriginalMember(owner = "client!hj", name = "lb", descriptor = "Z")
	private boolean lb;

	@OriginalMember(owner = "client!hj", name = "nb", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!hj", name = "ob", descriptor = "I")
	private int anInt2420;

	@OriginalMember(owner = "client!hj", name = "sb", descriptor = "Lclient!rq;")
	public Class18_Sub1 aClass18_Sub1_1;

	@OriginalMember(owner = "client!hj", name = "tb", descriptor = "I")
	private int anInt2421;

	@OriginalMember(owner = "client!hj", name = "vb", descriptor = "Lclient!bj;")
	public Class21_Sub1 aClass21_Sub1_2;

	@OriginalMember(owner = "client!hj", name = "wb", descriptor = "F")
	private float aFloat46;

	@OriginalMember(owner = "client!hj", name = "yb", descriptor = "Lclient!qa;")
	public Class78_Sub2 aClass78_Sub2_2;

	@OriginalMember(owner = "client!hj", name = "zb", descriptor = "I")
	private int anInt2423;

	@OriginalMember(owner = "client!hj", name = "Ab", descriptor = "Z")
	public boolean aBoolean208;

	@OriginalMember(owner = "client!hj", name = "Cb", descriptor = "[Lclient!nj;")
	private Class18[] aClass18Array1;

	@OriginalMember(owner = "client!hj", name = "Db", descriptor = "Z")
	public boolean aBoolean209;

	@OriginalMember(owner = "client!hj", name = "Eb", descriptor = "Ljava/lang/String;")
	private String aString101;

	@OriginalMember(owner = "client!hj", name = "Gb", descriptor = "Lclient!oc;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!hj", name = "Hb", descriptor = "I")
	private int anInt2426;

	@OriginalMember(owner = "client!hj", name = "Lb", descriptor = "I")
	private int anInt2428;

	@OriginalMember(owner = "client!hj", name = "Mb", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!hj", name = "Ob", descriptor = "Z")
	private boolean aBoolean210;

	@OriginalMember(owner = "client!hj", name = "Qb", descriptor = "Z")
	private boolean aBoolean211;

	@OriginalMember(owner = "client!hj", name = "Rb", descriptor = "Lclient!vi;")
	public Class211 aClass211_1;

	@OriginalMember(owner = "client!hj", name = "Tb", descriptor = "I")
	private int anInt2429;

	@OriginalMember(owner = "client!hj", name = "Ub", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!hj", name = "Vb", descriptor = "J")
	private long aLong97;

	@OriginalMember(owner = "client!hj", name = "Wb", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!hj", name = "ac", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!hj", name = "cc", descriptor = "Z")
	private boolean aBoolean212;

	@OriginalMember(owner = "client!hj", name = "dc", descriptor = "Z")
	private boolean aBoolean213;

	@OriginalMember(owner = "client!hj", name = "ec", descriptor = "Lclient!sg;")
	private Interface6 anInterface6_2;

	@OriginalMember(owner = "client!hj", name = "ic", descriptor = "Lclient!bc;")
	private Class18_Sub1_Sub1 aClass18_Sub1_Sub1_2;

	@OriginalMember(owner = "client!hj", name = "jc", descriptor = "Lclient!qa;")
	public Class78_Sub2 aClass78_Sub2_3;

	@OriginalMember(owner = "client!hj", name = "kc", descriptor = "I")
	public int anInt2434;

	@OriginalMember(owner = "client!hj", name = "lc", descriptor = "I")
	private int anInt2435;

	@OriginalMember(owner = "client!hj", name = "mc", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!hj", name = "pc", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!hj", name = "qc", descriptor = "I")
	public int anInt2437;

	@OriginalMember(owner = "client!hj", name = "rc", descriptor = "Z")
	private boolean aBoolean216;

	@OriginalMember(owner = "client!hj", name = "tc", descriptor = "F")
	private float aFloat60;

	@OriginalMember(owner = "client!hj", name = "uc", descriptor = "I")
	private int anInt2438;

	@OriginalMember(owner = "client!hj", name = "wc", descriptor = "Z")
	private boolean aBoolean219;

	@OriginalMember(owner = "client!hj", name = "xc", descriptor = "Lclient!qa;")
	public Class78_Sub2 aClass78_Sub2_4;

	@OriginalMember(owner = "client!hj", name = "yc", descriptor = "F")
	private float aFloat61;

	@OriginalMember(owner = "client!hj", name = "zc", descriptor = "Lclient!rq;")
	public Class18_Sub1 aClass18_Sub1_2;

	@OriginalMember(owner = "client!hj", name = "Cc", descriptor = "Lclient!qa;")
	public Class78_Sub2 aClass78_Sub2_5;

	@OriginalMember(owner = "client!hj", name = "Fc", descriptor = "Lclient!qa;")
	public Class78_Sub2 aClass78_Sub2_6;

	@OriginalMember(owner = "client!hj", name = "Gc", descriptor = "Z")
	private boolean aBoolean220;

	@OriginalMember(owner = "client!hj", name = "Ic", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!hj", name = "Rc", descriptor = "Z")
	public boolean aBoolean222;

	@OriginalMember(owner = "client!hj", name = "Uc", descriptor = "Lclient!oo;")
	private Class113_Sub1 aClass113_Sub1_1;

	@OriginalMember(owner = "client!hj", name = "Vc", descriptor = "Lclient!rq;")
	public Class18_Sub1 aClass18_Sub1_3;

	@OriginalMember(owner = "client!hj", name = "Wc", descriptor = "I")
	private int anInt2450;

	@OriginalMember(owner = "client!hj", name = "Xc", descriptor = "I")
	private int anInt2451;

	@OriginalMember(owner = "client!hj", name = "v", descriptor = "Lclient!sn;")
	private final Class190 aClass190_1 = new Class190();

	@OriginalMember(owner = "client!hj", name = "E", descriptor = "Lclient!ci;")
	private final Class21 aClass21_1 = new Class21_Sub1();

	@OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
	private int anInt2410 = -1;

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
	public final int anInt2413 = 8;

	@OriginalMember(owner = "client!hj", name = "N", descriptor = "[Lclient!fp;")
	private final Interface2[] anInterface2Array1 = new Interface2[4];

	@OriginalMember(owner = "client!hj", name = "I", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
	public final int anInt2416 = 3;

	@OriginalMember(owner = "client!hj", name = "R", descriptor = "Lclient!tc;")
	private final Class195 aClass195_22 = new Class195();

	@OriginalMember(owner = "client!hj", name = "S", descriptor = "Lclient!tc;")
	private final Class195 aClass195_23 = new Class195();

	@OriginalMember(owner = "client!hj", name = "T", descriptor = "Lclient!tc;")
	private final Class195 aClass195_24 = new Class195();

	@OriginalMember(owner = "client!hj", name = "U", descriptor = "Lclient!tc;")
	private final Class195 aClass195_25 = new Class195();

	@OriginalMember(owner = "client!hj", name = "V", descriptor = "Lclient!tc;")
	private final Class195 aClass195_26 = new Class195();

	@OriginalMember(owner = "client!hj", name = "W", descriptor = "Lclient!tc;")
	private final Class195 aClass195_27 = new Class195();

	@OriginalMember(owner = "client!hj", name = "X", descriptor = "Lclient!tc;")
	private final Class195 aClass195_28 = new Class195();

	@OriginalMember(owner = "client!hj", name = "kb", descriptor = "F")
	private float aFloat43 = 0.0F;

	@OriginalMember(owner = "client!hj", name = "Z", descriptor = "Z")
	private boolean aBoolean201 = true;

	@OriginalMember(owner = "client!hj", name = "mb", descriptor = "[F")
	private final float[] aFloatArray20 = new float[4];

	@OriginalMember(owner = "client!hj", name = "rb", descriptor = "[F")
	private final float[] aFloatArray21 = new float[4];

	@OriginalMember(owner = "client!hj", name = "pb", descriptor = "F")
	private float aFloat45 = 1.0F;

	@OriginalMember(owner = "client!hj", name = "eb", descriptor = "I")
	private int anInt2417 = 8448;

	@OriginalMember(owner = "client!hj", name = "xb", descriptor = "[F")
	private final float[] aFloatArray22 = new float[16];

	@OriginalMember(owner = "client!hj", name = "Nb", descriptor = "F")
	private float aFloat50 = 1.0F;

	@OriginalMember(owner = "client!hj", name = "Kb", descriptor = "I")
	private int anInt2427 = 0;

	@OriginalMember(owner = "client!hj", name = "Ib", descriptor = "F")
	public float aFloat47 = -1.0F;

	@OriginalMember(owner = "client!hj", name = "Zb", descriptor = "I")
	public int anInt2431 = -1;

	@OriginalMember(owner = "client!hj", name = "Yb", descriptor = "F")
	public float aFloat55 = 1.0F;

	@OriginalMember(owner = "client!hj", name = "fc", descriptor = "I")
	public int anInt2433 = 3584;

	@OriginalMember(owner = "client!hj", name = "Pb", descriptor = "F")
	public float aFloat51 = 1.0F;

	@OriginalMember(owner = "client!hj", name = "Dc", descriptor = "[F")
	private final float[] aFloatArray24 = new float[4];

	@OriginalMember(owner = "client!hj", name = "Jb", descriptor = "F")
	public float aFloat48 = 1.0F;

	@OriginalMember(owner = "client!hj", name = "Ec", descriptor = "I")
	private int anInt2440 = 0;

	@OriginalMember(owner = "client!hj", name = "Jc", descriptor = "F")
	public float aFloat63 = 3584.0F;

	@OriginalMember(owner = "client!hj", name = "Bb", descriptor = "I")
	public int anInt2424 = 50;

	@OriginalMember(owner = "client!hj", name = "Ac", descriptor = "I")
	private int anInt2439 = -1;

	@OriginalMember(owner = "client!hj", name = "Kc", descriptor = "I")
	private int anInt2441 = 0;

	@OriginalMember(owner = "client!hj", name = "Bc", descriptor = "[F")
	public final float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!hj", name = "Sb", descriptor = "F")
	public float aFloat52 = -1.0F;

	@OriginalMember(owner = "client!hj", name = "Oc", descriptor = "I")
	public int anInt2445 = 512;

	@OriginalMember(owner = "client!hj", name = "Xb", descriptor = "I")
	public int anInt2430 = 0;

	@OriginalMember(owner = "client!hj", name = "Lc", descriptor = "I")
	private int anInt2442 = -1;

	@OriginalMember(owner = "client!hj", name = "nc", descriptor = "F")
	public float aFloat58 = 3584.0F;

	@OriginalMember(owner = "client!hj", name = "Nc", descriptor = "I")
	public int anInt2444 = -1;

	@OriginalMember(owner = "client!hj", name = "Sc", descriptor = "I")
	private int anInt2448 = 0;

	@OriginalMember(owner = "client!hj", name = "Tc", descriptor = "I")
	private int anInt2449 = 0;

	@OriginalMember(owner = "client!hj", name = "bc", descriptor = "I")
	public int anInt2432 = 0;

	@OriginalMember(owner = "client!hj", name = "Pc", descriptor = "I")
	public int anInt2446 = 512;

	@OriginalMember(owner = "client!hj", name = "oc", descriptor = "I")
	private int anInt2436 = 0;

	@OriginalMember(owner = "client!hj", name = "Mc", descriptor = "I")
	public int anInt2443 = -1;

	@OriginalMember(owner = "client!hj", name = "Fb", descriptor = "I")
	private int anInt2425 = 8448;

	@OriginalMember(owner = "client!hj", name = "Qc", descriptor = "I")
	private int anInt2447 = 0;

	@OriginalMember(owner = "client!hj", name = "w", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas1;

	@OriginalMember(owner = "client!hj", name = "C", descriptor = "Lclient!sr;")
	public final Interface7 anInterface7_5;

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!hj", name = "y", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl1;

	@OriginalMember(owner = "client!hj", name = "ub", descriptor = "I")
	public final int anInt2422;

	@OriginalMember(owner = "client!hj", name = "Hc", descriptor = "Z")
	private boolean aBoolean221;

	@OriginalMember(owner = "client!hj", name = "hc", descriptor = "Z")
	public boolean aBoolean215;

	@OriginalMember(owner = "client!hj", name = "vc", descriptor = "Z")
	public boolean aBoolean218;

	@OriginalMember(owner = "client!hj", name = "gc", descriptor = "Z")
	public boolean aBoolean214;

	@OriginalMember(owner = "client!hj", name = "qb", descriptor = "Z")
	private boolean aBoolean207;

	@OriginalMember(owner = "client!hj", name = "sc", descriptor = "Z")
	public boolean aBoolean217;

	@OriginalMember(owner = "client!hj", name = "D", descriptor = "Lclient!ri;")
	public final Class178 aClass178_1;

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "Lclient!ee;")
	private final Class48 aClass48_1;

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "Lclient!rl;")
	private final Class179 aClass179_1;

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "Lclient!vp;")
	private final Class1_Sub32_Sub1 aClass1_Sub32_Sub1_1;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!sr;IILclient!kq;)V")
	public Class2_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class110 arg4) {
		this.aCanvas1 = arg0;
		this.anInterface7_5 = arg1;
		this.anInt3495 = arg2;
		@Pc(186) int local186 = 0;
		while (!this.aCanvas1.isShowing()) {
			if (local186++ > 5) {
				throw new RuntimeException("");
			}
			Static134.method2598(1000L);
		}
		this.aCanvas1.setIgnoreRepaint(true);
		try {
			if (Static124.aBoolean199 == null || !Static124.aBoolean199) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static124.aBoolean199 = Boolean.TRUE;
				} else {
					@Pc(220) Class134 local220 = arg4.method3376(this.getClass());
					while (local220.anInt4033 == 0) {
						Static134.method2598(100L);
					}
					if (local220.anInt4033 == 1) {
						Static124.aBoolean199 = Boolean.TRUE;
					}
				}
			}
			if (Static124.aBoolean199 == null || !Static124.aBoolean199) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas1, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method2383();
				this.anOpengl1 = this.aContext1.getGL();
				@Pc(287) int local287 = this.method2353();
				if (local287 != 0) {
					throw new RuntimeException("");
				}
				this.anInt2422 = this.aBoolean204 ? 33639 : 5121;
				@Pc(306) String local306 = this.aString100.toLowerCase();
				@Pc(310) String local310 = this.aString101.toLowerCase();
				if (local310.indexOf("radeon") != -1) {
					@Pc(317) int local317 = 0;
					@Pc(319) boolean local319 = false;
					@Pc(321) boolean local321 = false;
					@Pc(329) String[] local329 = Static62.method1317(local310.replace('/', ' '), ' ');
					for (@Pc(331) int local331 = 0; local331 < local329.length; local331++) {
						@Pc(339) String local339 = local329[local331];
						try {
							if (local339.length() > 0) {
								if (local339.charAt(0) == 'x' && local339.length() >= 3 && Static335.method5579(local339.substring(1, 3))) {
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
									if (local339.length() >= 4 && Static335.method5579(local339.substring(0, 4))) {
										local317 = Static280.method4822(local339.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(403) Exception local403) {
						}
					}
					if (!local321 && !local319) {
						if (local317 >= 7000 && local317 <= 7999) {
							this.aBoolean221 = false;
						}
						if (local317 >= 7000 && local317 <= 9250) {
							this.aBoolean215 = false;
						}
					}
					if (!local319 || local317 < 4000) {
						this.aBoolean218 = false;
					}
					this.aBoolean214 &= this.anOpengl1.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean207 = this.aBoolean221;
				}
				if (local306.contains("intel")) {
					this.aBoolean217 = false;
				}
				if (this.aBoolean221) {
					try {
						@Pc(461) int[] local461 = new int[1];
						this.anOpengl1.glGenBuffersARB(1, local461, 0);
					} catch (@Pc(469) Throwable local469) {
						throw new RuntimeException("", local469);
					}
				}
				this.method2339(this);
				this.method3276();
				this.method2317();
				new Class108(this);
				this.aClass178_1 = new Class178(this, this.anInterface7_5);
				Static115.method2094(true);
				this.aBoolean200 = true;
				this.aClass48_1 = new Class48(this);
				this.aClass179_1 = new Class179(this);
				this.aClass1_Sub32_Sub1_1 = new Class1_Sub32_Sub1(this);
				this.method2347();
				this.anOpengl1.glClear(16640);
				local186 = 0;
				while (true) {
					try {
						this.aContext1.swapBuffers();
						break;
					} catch (@Pc(534) Exception local534) {
						if (local186++ > 5) {
							throw new RuntimeException("");
						}
						Static134.method2598(100L);
					}
				}
				this.anOpengl1.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(553) Throwable local553) {
			local553.printStackTrace();
			this.method3330();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local553);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!er;)V")
	@Override
	public void method3338(@OriginalArg(0) Class1_Sub13 arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!hc;Lclient!qd;Lclient!ci;Lclient!bd;I)V")
	@Override
	public void method3236(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Class15_Sub2 arg3) {
		arg0.method4379(arg2, arg3, 0);
		this.method3252(arg1);
	}

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "()V")
	public void method2312() {
		if (this.anInt2423 == 4) {
			return;
		}
		this.method2332();
		this.method2333(false);
		this.method2358(false);
		this.method2370(false);
		this.method2344(false);
		this.method2357();
		this.method2336(1);
		this.method2340(1);
		this.anInt2423 = 4;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!bj;)V")
	public void method2313(@OriginalArg(0) Class21_Sub1 arg0) {
		this.anOpengl1.glPushMatrix();
		this.anOpengl1.glMultMatrixf(arg0.method795(), 0);
	}

	@OriginalMember(owner = "client!hj", name = "N", descriptor = "()V")
	public void method2314() {
		this.anOpengl1.glLightfv(16384, 4611, this.aFloatArray20, 0);
		this.anOpengl1.glLightfv(16385, 4611, this.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3287(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(FFFF)V")
	public void method2315(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static124.aFloatArray19[0] = arg0;
		Static124.aFloatArray19[1] = arg1;
		Static124.aFloatArray19[2] = arg2;
		Static124.aFloatArray19[3] = arg3;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static124.aFloatArray19, 0);
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(II)V")
	public void method2316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2427 = arg0;
		this.anInt2449 = arg1;
		this.anOpengl1.glViewport(arg0, arg1, this.anInt2412, this.anInt2409);
		this.method2326();
	}

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "()V")
	private void method2317() {
		this.aClass21_Sub1_2 = new Class21_Sub1();
		this.aClass21_Sub1_1 = new Class21_Sub1();
		this.aClass18Array1 = new Class18[this.anInt2434];
		this.aClass18_Sub1_3 = new Class18_Sub1(this, 3553, 6408, 1, 1);
		this.aClass18_Sub1_1 = new Class18_Sub1(this, 3553, 6408, 1, 1);
		this.aClass18_Sub1_2 = new Class18_Sub1(this, 3553, 6408, 1, 1);
		this.aClass78_Sub2_4 = new Class78_Sub2(this);
		this.aClass78_Sub2_2 = new Class78_Sub2(this);
		this.aClass78_Sub2_5 = new Class78_Sub2(this);
		this.aClass78_Sub2_6 = new Class78_Sub2(this);
		this.aClass78_Sub2_1 = new Class78_Sub2(this);
		this.aClass78_Sub2_3 = new Class78_Sub2(this);
		if (this.aBoolean217) {
			this.aClass211_1 = new Class211(this);
		}
		this.aClass190_1.method4925(this);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[BIZ)Lclient!oc;")
	public Interface4 method2318(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface4) (this.aBoolean221 && (!arg2 || this.aBoolean207) ? new Class63_Sub2(this, 5123, arg0, arg1, arg2) : new Class47_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass21_Sub1_2.aFloat9 * (float) arg0 + this.aClass21_Sub1_2.aFloat18 * (float) arg1 + this.aClass21_Sub1_2.aFloat10 * (float) arg2 + this.aClass21_Sub1_2.aFloat8;
		if (local24 < (float) this.anInt2424 || local24 > (float) this.anInt2433) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt2445 * (this.aClass21_Sub1_2.aFloat13 * (float) arg0 + this.aClass21_Sub1_2.aFloat15 * (float) arg1 + this.aClass21_Sub1_2.aFloat12 * (float) arg2 + this.aClass21_Sub1_2.aFloat7) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt2446 * (this.aClass21_Sub1_2.aFloat16 * (float) arg0 + this.aClass21_Sub1_2.aFloat17 * (float) arg1 + this.aClass21_Sub1_2.aFloat14 * (float) arg2 + this.aClass21_Sub1_2.aFloat11) / local24);
		if ((float) local81 >= this.aFloat54 && (float) local81 <= this.aFloat49 && (float) local113 >= this.aFloat57 && (float) local113 <= this.aFloat53) {
			arg3[0] = (int) ((float) local81 - this.aFloat54);
			arg3[1] = (int) ((float) local113 - this.aFloat57);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIII)V")
	@Override
	public void method3246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass179_1.method4759(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(II)I")
	@Override
	public int method3292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)V")
	public synchronized void method2319(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub37 local4 = new Class1_Sub37(arg0);
		this.aClass195_28.method5018(local4);
	}

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "(I)I")
	public int method2320(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIII)Z")
	@Override
	public boolean method3258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass21_Sub1_2.aFloat9 * (float) arg0 + this.aClass21_Sub1_2.aFloat18 * (float) arg1 + this.aClass21_Sub1_2.aFloat10 * (float) arg2 + this.aClass21_Sub1_2.aFloat8;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass21_Sub1_2.aFloat9 * (float) arg3 + this.aClass21_Sub1_2.aFloat18 * (float) arg4 + this.aClass21_Sub1_2.aFloat10 * (float) arg5 + this.aClass21_Sub1_2.aFloat8;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt2424 && local55 < (float) this.anInt2424 || !(!(local24 > (float) this.anInt2433) || !(local55 > (float) this.anInt2433))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt2445 * (this.aClass21_Sub1_2.aFloat13 * (float) arg0 + this.aClass21_Sub1_2.aFloat15 * (float) arg1 + this.aClass21_Sub1_2.aFloat12 * (float) arg2 + this.aClass21_Sub1_2.aFloat7) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt2445 * (this.aClass21_Sub1_2.aFloat13 * (float) arg3 + this.aClass21_Sub1_2.aFloat15 * (float) arg4 + this.aClass21_Sub1_2.aFloat12 * (float) arg5 + this.aClass21_Sub1_2.aFloat7) / local55);
		if ((float) local119 < this.aFloat54 && (float) local151 < this.aFloat54 || (float) local119 > this.aFloat49 && (float) local151 > this.aFloat49) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt2446 * (this.aClass21_Sub1_2.aFloat16 * (float) arg0 + this.aClass21_Sub1_2.aFloat17 * (float) arg1 + this.aClass21_Sub1_2.aFloat14 * (float) arg2 + this.aClass21_Sub1_2.aFloat11) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt2446 * (this.aClass21_Sub1_2.aFloat16 * (float) arg3 + this.aClass21_Sub1_2.aFloat17 * (float) arg4 + this.aClass21_Sub1_2.aFloat14 * (float) arg5 + this.aClass21_Sub1_2.aFloat11) / local55);
			return (!((float) local209 < this.aFloat57) || !((float) local241 < this.aFloat57)) && (!((float) local209 > this.aFloat53) || !((float) local241 > this.aFloat53));
		}
	}

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "()F")
	@Override
	public float method3282() {
		return this.aFloat59;
	}

	@OriginalMember(owner = "client!hj", name = "G", descriptor = "()V")
	@Override
	public void method3326() {
	}

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "()Lclient!ci;")
	@Override
	public Class21 method3284() {
		return this.aClass21_1;
	}

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "(I)V")
	public synchronized void method2321(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub37 local4 = new Class1_Sub37(arg0);
		this.aClass195_27.method5018(local4);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZZ)V")
	public void method2322(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt2426) {
			if (arg0 < 0) {
				this.method2366();
				this.method2376(null);
				if (!this.aBoolean208) {
					this.aClass48_1.method1466(arg1, 0, arg2);
				}
			} else {
				@Pc(11) Class18_Sub1 local11 = this.aClass178_1.method4728(arg0);
				@Pc(17) Class215 local17 = this.anInterface7_5.method2788(arg0);
				if (local17.aByte72 == 0 && local17.aByte69 == 0) {
					this.method2366();
				} else {
					@Pc(30) int local30 = local17.aBoolean566 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method2334((float) (this.anInt2408 % local34 * local17.aByte72) / (float) local34, (float) (this.anInt2408 % local34 * local17.aByte69) / (float) local34, 0.0F);
				}
				if (this.aBoolean208) {
					this.aClass48_1.method1466(arg1, 3, arg2);
					this.method2376(local11);
				} else {
					this.aClass48_1.method1466(arg1, local17.aByte67, arg2);
					this.aClass48_1.method1464(local17.aByte73, false);
					if (!this.aClass48_1.method1463(local11)) {
						this.method2376(local11);
					}
				}
			}
			this.anInt2426 = arg0;
		}
		this.anInt2423 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!hj", name = "y", descriptor = "()Z")
	@Override
	public boolean method3295() {
		return this.aClass1_Sub32_Sub1_1.method5589();
	}

	@OriginalMember(owner = "client!hj", name = "P", descriptor = "()V")
	private void method2323() {
		@Pc(11) float local11 = (float) -this.anInt2430 * this.aFloat45 / (float) this.anInt2445;
		@Pc(23) float local23 = (float) -this.anInt2432 * this.aFloat45 / (float) this.anInt2446;
		@Pc(37) float local37 = (float) (this.anInt2412 - this.anInt2430) * this.aFloat45 / (float) this.anInt2445;
		@Pc(51) float local51 = (float) (this.anInt2409 - this.anInt2432) * this.aFloat45 / (float) this.anInt2446;
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (local11 != local37 && local51 != local23) {
			this.anOpengl1.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt2424 - this.aFloat59), (double) ((float) this.anInt2433 - this.aFloat59));
		}
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hj", name = "Q", descriptor = "()V")
	private void method2324() {
		@Pc(15) int local15;
		if (this.aBoolean208) {
			this.anOpengl1.glFogf(2915, 0.0F);
			this.anOpengl1.glFogf(2916, 1.0F);
			local15 = this.anInt2442;
		} else {
			this.aFloat61 = (float) (this.anInt2433 - 256) - this.aFloat43;
			this.aFloat56 = this.aFloat61 - (float) this.anInt2444 * this.aFloat50;
			if (this.aFloat56 < (float) this.anInt2424) {
				this.aFloat56 = this.anInt2424;
			}
			this.anOpengl1.glFogf(2915, this.aFloat56);
			this.anOpengl1.glFogf(2916, this.aFloat61);
			local15 = this.anInt2431;
		}
		Static124.aFloatArray19[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static124.aFloatArray19[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static124.aFloatArray19[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl1.glFogfv(2918, Static124.aFloatArray19, 0);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "()I")
	@Override
	public int method5528() {
		return this.anInt2409;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!sg;")
	public Interface6 method2325(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface6) (this.aBoolean221 ? new Class63_Sub1(this, arg0, arg1, false) : new Class47_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(FF)V")
	@Override
	public void method3320(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat44 && arg1 == this.aFloat59) {
			return;
		}
		this.aFloat44 = arg0;
		this.aFloat59 = arg1;
		this.method2349();
		if (this.anInt2428 == 3) {
			this.method2323();
		} else if (this.anInt2428 == 2) {
			this.method2343();
		}
	}

	@OriginalMember(owner = "client!hj", name = "R", descriptor = "()V")
	private void method2326() {
		if (this.anInt2436 <= this.anInt2440 && this.anInt2441 <= this.anInt2447) {
			this.anOpengl1.glScissor(this.anInt2427 + this.anInt2436, this.anInt2449 + this.anInt2409 - this.anInt2447, this.anInt2440 - this.anInt2436, this.anInt2447 - this.anInt2441);
		} else {
			this.anOpengl1.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIZ)Lclient!lf;")
	@Override
	public Class90 method3266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class90_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(IIIII)V")
	@Override
	public void method3325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2354();
		this.method2336(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method3286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2354();
		this.method2336(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!hj", name = "S", descriptor = "()V")
	public void method2327() {
		if (this.anInt2423 == 16) {
			return;
		}
		this.method2368();
		this.method2333(true);
		this.method2370(true);
		this.method2344(true);
		this.method2336(1);
		this.method2340(1);
		this.anInt2423 = 16;
	}

	@OriginalMember(owner = "client!hj", name = "T", descriptor = "()V")
	private void method2328() {
		this.aFloat54 = this.anInt2436 - this.anInt2430;
		this.aFloat49 = this.anInt2440 - this.anInt2430;
		this.aFloat57 = this.anInt2441 - this.anInt2432;
		this.aFloat53 = this.anInt2447 - this.anInt2432;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method3315() {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(F)V")
	@Override
	public void method3341(@OriginalArg(0) float arg0) {
		if (this.aFloat62 != arg0) {
			this.aFloat62 = arg0;
			this.method2380();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([I)V")
	@Override
	public void method3311(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2436;
		arg0[1] = this.anInt2441;
		arg0[2] = this.anInt2440;
		arg0[3] = this.anInt2447;
	}

	@OriginalMember(owner = "client!hj", name = "U", descriptor = "()V")
	public void method2329() {
		if (this.anInt2423 == 2) {
			return;
		}
		this.method2332();
		this.method2333(false);
		this.method2358(false);
		this.method2370(false);
		this.method2344(false);
		this.method2357();
		this.anInt2423 = 2;
	}

	@OriginalMember(owner = "client!hj", name = "K", descriptor = "()V")
	@Override
	public void method3331() {
		if (this.anInt2412 <= 0 && this.anInt2409 <= 0) {
			return;
		}
		@Pc(9) int local9 = this.anInt2436;
		@Pc(12) int local12 = this.anInt2440;
		@Pc(15) int local15 = this.anInt2441;
		@Pc(18) int local18 = this.anInt2447;
		this.method3327();
		this.anOpengl1.glReadBuffer(1028);
		this.anOpengl1.glDrawBuffer(1029);
		this.method2352();
		this.method2333(false);
		this.method2358(false);
		this.method2370(false);
		this.method2344(false);
		this.method2376(null);
		this.method2357();
		this.method2340(0);
		this.method2336(0);
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRasterPos2i(0, 0);
		this.anOpengl1.glCopyPixels(0, 0, this.anInt2412, this.anInt2409, 6144);
		this.anOpengl1.glFlush();
		this.anOpengl1.glReadBuffer(1029);
		this.anOpengl1.glDrawBuffer(1029);
		this.method3250(local9, local15, local12, local18);
	}

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "()V")
	@Override
	public void method3276() {
		this.anInt2412 = this.aCanvas1.getWidth();
		this.anInt2409 = this.aCanvas1.getHeight();
		this.anOpengl1.glViewport(this.anInt2427, this.anInt2449, this.anInt2412, this.anInt2409);
		this.method2352();
		this.method3327();
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I[BIZ)Lclient!sg;")
	public Interface6 method2330(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface6) (this.aBoolean221 && (!arg3 || this.aBoolean207) ? new Class63_Sub1(this, arg0, arg1, arg2, arg3) : new Class47_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)V")
	@Override
	public void method3316(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(III)V")
	public void method2331(@OriginalArg(2) int arg0) {
		this.anOpengl1.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!hj", name = "o", descriptor = "()I")
	@Override
	public int method3265() {
		@Pc(2) int local2 = this.anInt2450;
		this.anInt2450 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method3267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2354();
		this.method2336(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method3300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method2354();
		this.method2336(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.lb) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local19);
		this.anOpengl1.glVertex2f(local14, local19);
		this.anOpengl1.glVertex2f(local14, local9);
		this.anOpengl1.glEnd();
		if (this.lb) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)Lclient!er;")
	@Override
	public Class1_Sub13 method3275() {
		return null;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II[I[I)Lclient!tm;")
	@Override
	public Class97 method3299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static360.method2693(this, arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!hj", name = "V", descriptor = "()V")
	private void method2332() {
		if (this.anInt2428 == 1) {
			return;
		}
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (this.anInt2412 > 0 && this.anInt2409 > 0) {
			this.anOpengl1.glOrtho(0.0D, (double) this.anInt2412, (double) this.anInt2409, 0.0D, -1.0D, 1.0D);
		}
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anInt2428 = 1;
		this.anInt2423 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(Z)V")
	public void method2333(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean210) {
			this.aBoolean210 = arg0;
			this.method2375();
			this.anInt2423 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(FFF)V")
	private void method2334(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl1.glMatrixMode(5890);
		if (this.aBoolean206) {
			this.anOpengl1.glLoadIdentity();
		}
		this.anOpengl1.glTranslatef(arg0, arg1, arg2);
		this.anOpengl1.glMatrixMode(5888);
		this.aBoolean206 = true;
	}

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "()Z")
	@Override
	public boolean method3244() {
		return this.lb;
	}

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "()V")
	@Override
	public void method3256() {
		this.aClass48_1.method1466(false, 0, false);
		this.aBoolean208 = false;
		this.method2324();
		this.method2375();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II[[I[[IIII)Lclient!sm;")
	@Override
	public Class41 method3336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class41_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!di;[Lclient!nc;Z)Lclient!rj;")
	@Override
	public Class13 method3306(@OriginalArg(0) Class38 arg0, @OriginalArg(1) Class138[] arg1) {
		return new Class13_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "(I)I")
	public int method2335(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!hj", name = "I", descriptor = "()V")
	@Override
	public void method3328() {
		this.aClass179_1.method4758();
	}

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "()Z")
	@Override
	public boolean method3274() {
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "(I)V")
	public void method2336(@OriginalArg(0) int arg0) {
		if (this.anInt2429 == arg0) {
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
		if (local10 != this.aBoolean203) {
			this.anOpengl1.glColorMask(local10, local10, local10, true);
			this.aBoolean203 = local10;
		}
		if (local12 != this.aBoolean219) {
			if (local12) {
				this.anOpengl1.glEnable(3008);
			} else {
				this.anOpengl1.glDisable(3008);
			}
			this.aBoolean219 = local12;
		}
		if (local8 != this.anInt2438) {
			if (local8 == 1) {
				this.anOpengl1.glEnable(3042);
				this.anOpengl1.glBlendEquation(32774);
				this.anOpengl1.glBlendFunc(770, 771);
			} else if (local8 == 2) {
				this.anOpengl1.glEnable(3042);
				this.anOpengl1.glBlendEquation(32774);
				this.anOpengl1.glBlendFunc(1, 1);
			} else if (local8 == 3) {
				this.anOpengl1.glEnable(3042);
				this.anOpengl1.glBlendEquation(32778);
				this.anOpengl1.glBlendFunc(1, 1);
			} else if (local8 == 4) {
				this.anOpengl1.glEnable(3042);
				this.anOpengl1.glBlendEquation(32774);
				this.anOpengl1.glBlendFunc(774, 1);
			} else {
				this.anOpengl1.glDisable(3042);
			}
			this.anInt2438 = local8;
		}
		this.anInt2429 = arg0;
		this.anInt2423 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(F)V")
	public void method2337(@OriginalArg(0) float arg0) {
		if (this.aFloat45 != arg0) {
			this.aFloat45 = arg0;
			if (this.anInt2428 == 3) {
				this.method2323();
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "W", descriptor = "()V")
	private void method2338() {
		this.anOpengl1.glDepthMask(this.aBoolean216 && this.aBoolean201);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!tm;II)V")
	@Override
	public void method3334(@OriginalArg(1) Class97 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class97_Sub1 local2 = (Class97_Sub1) arg0;
		@Pc(5) Class18_Sub1_Sub1 local5 = local2.aClass18_Sub1_Sub1_3;
		this.method2329();
		this.method2376(local2.aClass18_Sub1_Sub1_3);
		this.method2336(1);
		this.method2351(7681, 8448);
		this.method2372(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat4 / (float) local5.anInt441;
		@Pc(37) float local37 = local5.aFloat5 / (float) local5.anInt440;
		this.anOpengl1.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt2436 - arg1), local37 * (float) (this.anInt2441 - arg2));
		this.anOpengl1.glVertex2i(this.anInt2436, this.anInt2441);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt2436 - arg1), local37 * (float) (this.anInt2447 - arg2));
		this.anOpengl1.glVertex2i(this.anInt2436, this.anInt2447);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt2440 - arg1), local37 * (float) (this.anInt2447 - arg2));
		this.anOpengl1.glVertex2i(this.anInt2440, this.anInt2447);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt2440 - arg1), local37 * (float) (this.anInt2441 - arg2));
		this.anOpengl1.glVertex2i(this.anInt2440, this.anInt2441);
		this.anOpengl1.glEnd();
		this.method2372(0, 5890, 768);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!fp;)V")
	public void method2339(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt2410 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2410 >= 0) {
			this.anInterface2Array1[this.anInt2410].method5529();
		}
		this.anInterface2_1 = this.anInterface2Array1[++this.anInt2410] = arg0;
		this.anInterface2_1.method5527();
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "()Z")
	@Override
	public boolean method3243() {
		return this.aClass48_1.method1465();
	}

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "()Lclient!ci;")
	@Override
	public Class21 method3298() {
		return new Class21_Sub1();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)I")
	@Override
	public int method3247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "(I)V")
	public void method2340(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2351(7681, 7681);
		} else if (arg0 == 1) {
			this.method2351(8448, 8448);
		} else if (arg0 == 2) {
			this.method2351(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "(I)I")
	public int method2341(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!hj", name = "C", descriptor = "()I")
	@Override
	public int method3312() {
		return 4;
	}

	@OriginalMember(owner = "client!hj", name = "D", descriptor = "()F")
	@Override
	public float method3317() {
		return this.aFloat44;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([IIIII)Lclient!lf;")
	@Override
	public Class90 method3288(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class90_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
	@Override
	public void method3309(@OriginalArg(0) int arg0) {
		this.method2336(0);
		this.anOpengl1.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl1.glClear(16384);
	}

	@OriginalMember(owner = "client!hj", name = "X", descriptor = "()V")
	private void method2342() {
		if (this.aBoolean211 && !this.aBoolean212) {
			this.anOpengl1.glEnable(2896);
		} else {
			this.anOpengl1.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIILclient!tm;II)V")
	@Override
	public void method3296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class97 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class97_Sub1 local2 = (Class97_Sub1) arg5;
		@Pc(5) Class18_Sub1_Sub1 local5 = local2.aClass18_Sub1_Sub1_3;
		this.method2329();
		this.method2376(local2.aClass18_Sub1_Sub1_3);
		this.method2336(1);
		this.method2351(7681, 8448);
		this.method2372(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat4 / (float) local5.anInt441;
		@Pc(37) float local37 = local5.aFloat5 / (float) local5.anInt440;
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
		this.method2372(0, 5890, 768);
	}

	@OriginalMember(owner = "client!hj", name = "Y", descriptor = "()V")
	private void method2343() {
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadMatrixf(this.aFloatArray22, 0);
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!nc;Z)Lclient!lf;")
	@Override
	public Class90 method3322(@OriginalArg(0) Class138 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt4100 * arg0.anInt4097];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray66 == null) {
			for (local15 = 0; local15 < arg0.anInt4097; local15++) {
				for (local21 = 0; local21 < arg0.anInt4100; local21++) {
					@Pc(74) int local74 = arg0.anIntArray488[arg0.aByteArray65[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt4097; local15++) {
				for (local21 = 0; local21 < arg0.anInt4100; local21++) {
					local6[local10++] = arg0.aByteArray66[local8] << 24 | arg0.anIntArray488[arg0.aByteArray65[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class90 local100 = this.method3288(local6, arg0.anInt4100, arg0.anInt4100, arg0.anInt4097);
		local100.method5457(arg0.anInt4098, arg0.anInt4099, arg0.anInt4096, arg0.anInt4101);
		return local100;
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(Z)V")
	public void method2344(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean216) {
			this.aBoolean216 = arg0;
			this.method2338();
			this.anInt2423 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!hj", name = "Z", descriptor = "()Lclient!ih;")
	public Class18_Sub2 method2345() {
		return this.aClass113_Sub1_1 == null ? null : this.aClass113_Sub1_1.method4247();
	}

	@OriginalMember(owner = "client!hj", name = "A", descriptor = "()Z")
	@Override
	public boolean method3305() {
		return true;
	}

	@OriginalMember(owner = "client!hj", name = "v", descriptor = "()Z")
	@Override
	public boolean method3289() {
		if (!this.aClass1_Sub32_Sub1_1.method5589()) {
			if (!this.aClass179_1.method4756(this.aClass1_Sub32_Sub1_1)) {
				return false;
			}
			this.aClass178_1.method4729();
		}
		return true;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!qd;)V")
	@Override
	public void method3252(@OriginalArg(0) Class162 arg0) {
		this.aClass190_1.method4923(this, arg0);
	}

	@OriginalMember(owner = "client!hj", name = "J", descriptor = "()V")
	@Override
	protected void method3330() {
		if (this.anOpengl1 != null) {
			try {
				this.aClass179_1.method4753();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl1 = null;
		}
		if (this.aContext1 != null) {
			this.method2356();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean200) {
			Static99.method1806(true);
			this.aBoolean200 = false;
		}
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V")
	@Override
	public void method3313(@OriginalArg(0) int arg0) {
		this.method2383();
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(III)V")
	public void method2346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!hj", name = "x", descriptor = "()V")
	@Override
	public void method3294() {
		this.method2344(true);
		this.anOpengl1.glClear(256);
	}

	@OriginalMember(owner = "client!hj", name = "ab", descriptor = "()V")
	private void method2347() {
		this.method2357();
		for (@Pc(7) int local7 = this.anInt2434 - 1; local7 >= 0; local7--) {
			this.method2373(local7);
			this.method2376(null);
			this.anOpengl1.glTexEnvi(8960, 8704, 34160);
		}
		this.method2351(8448, 8448);
		this.method2372(2, 34168, 770);
		this.method2366();
		this.anInt2429 = 1;
		this.anOpengl1.glEnable(3042);
		this.anOpengl1.glBlendFunc(770, 771);
		this.anInt2438 = 1;
		this.anOpengl1.glEnable(3008);
		this.anOpengl1.glAlphaFunc(516, 0.0F);
		this.aBoolean219 = true;
		this.anOpengl1.glColorMask(true, true, true, true);
		this.aBoolean203 = true;
		this.method2333(true);
		this.method2358(true);
		this.method2370(true);
		this.method2344(true);
		this.method2352();
		this.anOpengl1.setSwapInterval(0);
		this.anOpengl1.glShadeModel(7425);
		this.anOpengl1.glClearDepth(1.0F);
		this.anOpengl1.glDepthFunc(515);
		this.anOpengl1.glPolygonMode(1028, 6914);
		this.anOpengl1.glEnable(2884);
		this.anOpengl1.glCullFace(1029);
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glColorMaterial(1028, 5634);
		this.anOpengl1.glEnable(2903);
		@Pc(149) float[] local149 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(151) int local151 = 0; local151 < 8; local151++) {
			@Pc(158) int local158 = local151 + 16384;
			this.anOpengl1.glLightfv(local158, 4608, local149, 0);
			this.anOpengl1.glLightf(local158, 4615, 0.0F);
			this.anOpengl1.glLightf(local158, 4616, 0.0F);
		}
		this.anOpengl1.glEnable(16384);
		this.anOpengl1.glEnable(16385);
		this.anOpengl1.glFogf(2914, 0.95F);
		this.anOpengl1.glFogi(2917, 9729);
		this.anOpengl1.glHint(3156, 4353);
		this.anInt2439 = this.anInt2431 = -1;
		this.method3327();
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(III)V")
	@Override
	public void method3332() {
		this.aBoolean208 = true;
		this.anInt2442 = 1583160;
		this.anInt2443 = 40;
		this.method2324();
		this.method2375();
		this.aClass48_1.method1466(false, 3, false);
		this.aClass48_1.method1464(-1, true);
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "(IIIIII)Lclient!vm;")
	@Override
	public Class113 method3333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean202 ? new Class113_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
	@Override
	public void method3272(@OriginalArg(0) int arg0) {
		this.method2356();
	}

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "(I)V")
	public synchronized void method2348(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub37 local4 = new Class1_Sub37(arg0);
		this.aClass195_25.method5018(local4);
	}

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "()V")
	@Override
	public void method3264() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "()Z")
	@Override
	public boolean method3261() {
		return true;
	}

	@OriginalMember(owner = "client!hj", name = "bb", descriptor = "()V")
	private void method2349() {
		if (this.aFloat59 == 0.0F) {
			this.aFloatArray22[10] = this.aFloat60;
			this.aFloatArray22[14] = this.aFloat46;
		} else {
			@Pc(13) float local13 = this.aFloat44 / (this.aFloat59 + this.aFloat44);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat46 * (1.0F - local13) * (1.0F - local13) / this.aFloat59;
			this.aFloatArray22[10] = this.aFloat60 + local32;
			this.aFloatArray22[14] = this.aFloat46 * local17;
		}
		this.aFloat58 = (this.aFloatArray22[14] - (float) this.anInt2433) / this.aFloatArray22[10];
		this.aFloat63 = (float) this.anInt2433 - this.aFloat59;
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "(II)V")
	public synchronized void method2350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub37 local4 = new Class1_Sub37(arg1);
		local4.aLong215 = arg0;
		this.aClass195_23.method5018(local4);
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "(II)V")
	public void method2351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2421 != 0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt2425 != arg0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anInt2425 = arg0;
			local4 = true;
		}
		if (this.anInt2417 != arg1) {
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			this.anInt2417 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt2423 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!hj", name = "cb", descriptor = "()V")
	public void method2352() {
		if (this.anInt2428 != 0) {
			this.anInt2428 = 0;
			this.anInt2423 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[Lclient!vb;)V")
	@Override
	public void method3260(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub31[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class1_Sub31 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static124.aFloatArray18[0] = local8.anInt4687;
			Static124.aFloatArray18[1] = local8.anInt4691;
			Static124.aFloatArray18[2] = local8.anInt4693;
			Static124.aFloatArray18[3] = 1.0F;
			this.anOpengl1.glLightfv(local12, 4611, Static124.aFloatArray18, 0);
			@Pc(44) int local44 = local8.anInt4690;
			@Pc(49) float local49 = local8.aFloat89 / 255.0F;
			Static124.aFloatArray18[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static124.aFloatArray18[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static124.aFloatArray18[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl1.glLightfv(local12, 4609, Static124.aFloatArray18, 0);
			this.anOpengl1.glLightf(local12, 4617, 1.0F / (float) (local8.anInt4688 * local8.anInt4688));
			this.anOpengl1.glEnable(local12);
		}
		while (local1 < this.anInt2448) {
			this.anOpengl1.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt2448 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method3263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method2354();
		this.method2336(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.lb) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local23);
		this.anOpengl1.glVertex2f(local16, local23);
		this.anOpengl1.glVertex2f(local16, local9);
		this.anOpengl1.glEnd();
		if (this.lb) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3241(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class1_Sub37 local16;
		while (!this.aClass195_23.method5017()) {
			local16 = (Class1_Sub37) this.aClass195_23.method5031();
			Static124.anIntArray291[local1++] = (int) local16.aLong215;
			this.anInt2415 -= local16.anInt6000;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteBuffersARB(local1, Static124.anIntArray291, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteBuffersARB(local1, Static124.anIntArray291, 0);
			local1 = 0;
		}
		while (!this.aClass195_24.method5017()) {
			local16 = (Class1_Sub37) this.aClass195_24.method5031();
			Static124.anIntArray291[local1++] = (int) local16.aLong215;
			this.anInt2411 -= local16.anInt6000;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteTextures(local1, Static124.anIntArray291, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteTextures(local1, Static124.anIntArray291, 0);
			local1 = 0;
		}
		while (!this.aClass195_25.method5017()) {
			local16 = (Class1_Sub37) this.aClass195_25.method5031();
			Static124.anIntArray291[local1++] = local16.anInt6000;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteFramebuffersEXT(local1, Static124.anIntArray291, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteFramebuffersEXT(local1, Static124.anIntArray291, 0);
			local1 = 0;
		}
		while (!this.aClass195_26.method5017()) {
			local16 = (Class1_Sub37) this.aClass195_26.method5031();
			Static124.anIntArray291[local1++] = (int) local16.aLong215;
			this.anInt2414 -= local16.anInt6000;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static124.anIntArray291, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static124.anIntArray291, 0);
			local1 = 0;
		}
		while (!this.aClass195_27.method5017()) {
			local16 = (Class1_Sub37) this.aClass195_27.method5031();
			Static124.anIntArray291[local1++] = (int) local16.aLong215;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteProgramsARB(local1, Static124.anIntArray291, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteProgramsARB(local1, Static124.anIntArray291, 0);
		}
		while (!this.aClass195_22.method5017()) {
			local16 = (Class1_Sub37) this.aClass195_22.method5031();
			this.anOpengl1.glDeleteLists((int) local16.aLong215, local16.anInt6000);
		}
		while (!this.aClass195_28.method5017()) {
			local16 = (Class1_Sub37) this.aClass195_28.method5031();
			this.anOpengl1.glDeleteObjectARB(local16.anInt6000);
		}
		while (!this.aClass195_22.method5017()) {
			local16 = (Class1_Sub37) this.aClass195_22.method5031();
			this.anOpengl1.glDeleteLists((int) local16.aLong215, local16.anInt6000);
		}
		if (this.method3262() > 100663296 && Static349.method5647() > this.aLong97 + 60000L) {
			System.gc();
			this.aLong97 = Static349.method5647();
		}
		this.anInt2408 = local5;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
	@Override
	public void method3281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean208) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt2442 = arg1;
		this.anInt2443 = arg2;
		this.method2324();
		this.aClass48_1.method1464(arg0, true);
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(IIII)V")
	@Override
	public void method3250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt2412) {
			arg2 = this.anInt2412;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt2409) {
			arg3 = this.anInt2409;
		}
		this.anInt2436 = arg0;
		this.anInt2441 = arg1;
		this.anInt2440 = arg2;
		this.anInt2447 = arg3;
		this.anOpengl1.glEnable(3089);
		this.method2328();
		this.method2326();
	}

	@OriginalMember(owner = "client!hj", name = "db", descriptor = "()I")
	private int method2353() {
		@Pc(1) int local1 = 0;
		this.aString100 = this.anOpengl1.glGetString(7936);
		this.aString101 = this.anOpengl1.glGetString(7937);
		@Pc(17) String local17 = this.aString100.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl1.glGetString(7938);
		@Pc(53) String[] local53 = Static62.method1317(local45.replace('.', ' '), ' ');
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static280.method4822(local53[0]);
				@Pc(69) int local69 = Static280.method4822(local53[1]);
				this.anInt2419 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt2419 < 12) {
			local1 |= 0x2;
		}
		if (!this.anOpengl1.isExtensionAvailable("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!this.anOpengl1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(116) int[] local116 = new int[1];
		this.anOpengl1.glGetIntegerv(34018, local116, 0);
		this.anInt2434 = local116[0];
		this.anOpengl1.glGetIntegerv(34929, local116, 0);
		this.anInt2435 = local116[0];
		this.anOpengl1.glGetIntegerv(34930, local116, 0);
		this.anInt2420 = local116[0];
		if (this.anInt2434 < 2 || this.anInt2435 < 2 || this.anInt2420 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean220 = Static168.aString140 != null && Static168.aString140.startsWith("mac");
		this.aBoolean204 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean221 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.lb = this.anOpengl1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean205 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean209 = this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean215 = this.anOpengl1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean214 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean202 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean218 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean222 = false;
		this.aBoolean217 = this.anOpengl1.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!hj", name = "eb", descriptor = "()V")
	private void method2354() {
		if (this.anInt2423 == 1) {
			return;
		}
		this.method2332();
		this.method2333(false);
		this.method2358(false);
		this.method2370(false);
		this.method2344(false);
		this.method2376(null);
		this.method2357();
		this.method2340(0);
		this.anInt2423 = 1;
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "()Z")
	@Override
	public boolean method3240() {
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)V")
	@Override
	public void method3304(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "(Z)V")
	public void method2355(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean212) {
			this.aBoolean212 = arg0;
			this.method2342();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method3273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl1.glLineWidth((float) arg5);
		this.method3267(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(IIII)[I")
	@Override
	public int[] method3259() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl1.glReadPixels(0, this.anInt2409 - local6, 36, 1, 32993, this.anInt2422, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!hj", name = "fb", descriptor = "()V")
	private void method2356() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!vm;Lclient!vm;FLclient!vm;)Lclient!vm;")
	@Override
	public Class113 method3323(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class113 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean202 && this.aBoolean217) {
			@Pc(11) Class113_Sub1_Sub2 local11 = null;
			@Pc(14) Class113_Sub1 local14 = (Class113_Sub1) arg0;
			@Pc(17) Class113_Sub1 local17 = (Class113_Sub1) arg1;
			@Pc(21) Class18_Sub2 local21 = local14.method4247();
			@Pc(25) Class18_Sub2 local25 = local17.method4247();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt2706 > local25.anInt2706 ? local21.anInt2706 : local25.anInt2706;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class113_Sub1_Sub2) {
					@Pc(52) Class113_Sub1_Sub2 local52 = (Class113_Sub1_Sub2) arg3;
					if (local52.method4249() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class113_Sub1_Sub2(this, local40);
				}
				local11.method4248(arg2, local21, local25);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!hj", name = "o", descriptor = "(I)V")
	public void method2357() {
		this.method2363(-2, true);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ap;IIII)Lclient!hc;")
	@Override
	public Class78 method3251(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class78_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "()I")
	@Override
	public int method3253() {
		@Pc(2) int local2 = this.anInt2451;
		this.anInt2451 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([Lclient!hc;Lclient!qd;Lclient!ci;[Lclient!bd;I)V")
	@Override
	public void method3318(@OriginalArg(0) Class78[] arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Class15_Sub2[] arg3, @OriginalArg(4) int arg4) {
		this.method3285(arg0, arg2, arg3, arg4);
		this.method3252(arg1);
	}

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "()Z")
	@Override
	public boolean method3270() {
		return true;
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "()V")
	@Override
	public void method5529() {
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "(Z)V")
	public void method2358(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean211) {
			this.aBoolean211 = arg0;
			this.method2342();
			this.anInt2423 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!hj", name = "H", descriptor = "()V")
	@Override
	public void method3327() {
		this.anInt2436 = 0;
		this.anInt2441 = 0;
		this.anInt2440 = this.anInt2412;
		this.anInt2447 = this.anInt2409;
		this.anOpengl1.glDisable(3089);
		this.method2328();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method3329(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2439 != arg0;
		if (local7 || this.aFloat52 != arg1 || this.aFloat47 != arg2) {
			this.anInt2439 = arg0;
			this.aFloat52 = arg1;
			this.aFloat47 = arg2;
			if (local7) {
				this.aFloat55 = (float) (this.anInt2439 & 0xFF0000) / 1.671168E7F;
				this.aFloat51 = (float) (this.anInt2439 & 0xFFFF) / 65535.0F;
				this.aFloat48 = (float) (this.anInt2439 & 0xFF) / 255.0F;
				this.method2380();
			}
			this.method2364();
		}
		if (this.aFloatArray20[0] == arg3 && this.aFloatArray20[1] == arg4 && this.aFloatArray20[2] == arg5) {
			return;
		}
		this.aFloatArray20[0] = arg3;
		this.aFloatArray20[1] = arg4;
		this.aFloatArray20[2] = arg5;
		this.aFloatArray21[0] = -arg3;
		this.aFloatArray21[1] = -arg4;
		this.aFloatArray21[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray23[0] = arg3 * local132;
		this.aFloatArray23[1] = arg4 * local132;
		this.aFloatArray23[2] = arg5 * local132;
		this.aFloatArray24[0] = -this.aFloatArray23[0];
		this.aFloatArray24[1] = -this.aFloatArray23[1];
		this.aFloatArray24[2] = -this.aFloatArray23[2];
		this.method2314();
		this.anInt2418 = (int) (arg3 * 256.0F / arg4);
		this.anInt2437 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!hj", name = "F", descriptor = "()Z")
	@Override
	public boolean method3321() {
		return true;
	}

	@OriginalMember(owner = "client!hj", name = "E", descriptor = "()V")
	@Override
	public void method3319() {
		if (this.aClass1_Sub32_Sub1_1.method5589()) {
			this.aClass179_1.method4754(this.aClass1_Sub32_Sub1_1);
			this.aClass178_1.method4729();
		}
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "()Z")
	@Override
	public boolean method3237() {
		return true;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!sg;)V")
	public void method2359(@OriginalArg(0) Interface6 arg0) {
		if (this.anInterface6_2 != arg0 && this.aBoolean221) {
			this.anOpengl1.glBindBufferARB(34962, arg0.method4262());
			this.anInterface6_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!hj", name = "gb", descriptor = "()V")
	public void method2360() {
		this.anOpengl1.glPopMatrix();
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)V")
	@Override
	public void method3280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2424 == arg0 && this.anInt2433 == arg1) {
			return;
		}
		this.anInt2424 = arg0;
		this.anInt2433 = arg1;
		this.method2379();
		this.method2324();
		if (this.anInt2428 == 3) {
			this.method2323();
		} else if (this.anInt2428 == 2) {
			this.method2343();
		}
	}

	@OriginalMember(owner = "client!hj", name = "hb", descriptor = "()V")
	public void method2361() {
		if (this.anInt2428 != 2) {
			this.anInt2428 = 2;
			this.method2343();
			this.method2384();
			this.anInt2423 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "(II)V")
	public synchronized void method2362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub37 local4 = new Class1_Sub37(arg1);
		local4.aLong215 = arg0;
		this.aClass195_24.method5018(local4);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)V")
	public void method2363(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method2322(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(IIII)V")
	@Override
	public void method3278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2430 = arg0;
		this.anInt2432 = arg1;
		this.anInt2445 = arg2;
		this.anInt2446 = arg3;
		this.method2379();
		this.method2328();
		if (this.anInt2428 == 3) {
			this.method2323();
		} else if (this.anInt2428 == 2) {
			this.method2343();
		}
	}

	@OriginalMember(owner = "client!hj", name = "ib", descriptor = "()V")
	private void method2364() {
		Static124.aFloatArray19[0] = this.aFloat52 * this.aFloat55;
		Static124.aFloatArray19[1] = this.aFloat52 * this.aFloat51;
		Static124.aFloatArray19[2] = this.aFloat52 * this.aFloat48;
		Static124.aFloatArray19[3] = 1.0F;
		this.anOpengl1.glLightfv(16384, 4609, Static124.aFloatArray19, 0);
		Static124.aFloatArray19[0] = -this.aFloat47 * this.aFloat55;
		Static124.aFloatArray19[1] = -this.aFloat47 * this.aFloat51;
		Static124.aFloatArray19[2] = -this.aFloat47 * this.aFloat48;
		Static124.aFloatArray19[3] = 1.0F;
		this.anOpengl1.glLightfv(16385, 4609, Static124.aFloatArray19, 0);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(FF)V")
	public void method2365(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat50 = arg0;
		this.aFloat43 = arg1;
		if (!this.aBoolean208) {
			this.method2324();
		}
	}

	@OriginalMember(owner = "client!hj", name = "jb", descriptor = "()V")
	private void method2366() {
		if (this.aBoolean206) {
			this.anOpengl1.glMatrixMode(5890);
			this.anOpengl1.glLoadIdentity();
			this.anOpengl1.glMatrixMode(5888);
			this.aBoolean206 = false;
		}
	}

	@OriginalMember(owner = "client!hj", name = "kb", descriptor = "()V")
	public void method2367() {
		if (this.anInt2423 == 8) {
			return;
		}
		this.method2361();
		this.method2333(true);
		this.method2370(true);
		this.method2344(true);
		this.method2336(1);
		this.method2340(1);
		this.anInt2423 = 8;
	}

	@OriginalMember(owner = "client!hj", name = "lb", descriptor = "()V")
	private void method2368() {
		if (this.anInt2428 != 3) {
			this.anInt2428 = 3;
			this.method2323();
			this.method2384();
			this.anInt2423 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ln;Lclient!ln;Lclient!ln;Lclient!ln;)V")
	public void method2369(@OriginalArg(0) Class120 arg0, @OriginalArg(1) Class120 arg1, @OriginalArg(2) Class120 arg2, @OriginalArg(3) Class120 arg3) {
		if (arg0 == null) {
			this.anOpengl1.glDisableClientState(32884);
		} else {
			this.anOpengl1.glEnableClientState(32884);
			arg0.method3552();
		}
		if (arg1 == null) {
			this.anOpengl1.glDisableClientState(32885);
		} else {
			this.anOpengl1.glEnableClientState(32885);
			arg1.method3551();
		}
		if (arg2 == null) {
			this.anOpengl1.glDisableClientState(32886);
		} else {
			this.anOpengl1.glEnableClientState(32886);
			arg2.method3554();
		}
		if (arg3 == null) {
			this.anOpengl1.glDisableClientState(32888);
		} else {
			this.anOpengl1.glEnableClientState(32888);
			arg3.method3553();
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(Z)V")
	@Override
	public void method3337(@OriginalArg(0) boolean arg0) {
		this.aBoolean201 = arg0;
		this.method2338();
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "()Z")
	@Override
	public boolean method3238() {
		return this.aClass1_Sub32_Sub1_1.method5596();
	}

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "(Z)V")
	public void method2370(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean213) {
			return;
		}
		if (arg0) {
			this.anOpengl1.glEnable(2929);
		} else {
			this.anOpengl1.glDisable(2929);
		}
		this.aBoolean213 = arg0;
		this.anInt2423 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!oc;III)V")
	public void method2371(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2378(arg0);
		arg0.method4266(arg1, arg2);
	}

	@OriginalMember(owner = "client!hj", name = "L", descriptor = "()I")
	@Override
	public int method3340() {
		return this.anInt2424;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(FFF)V")
	@Override
	public void method3248(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static336.aFloat118 = arg0;
		Static336.aFloat119 = arg1;
		Static336.aFloat117 = arg2;
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(III)V")
	public void method2372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "(I)V")
	public void method2373(@OriginalArg(0) int arg0) {
		if (this.anInt2421 != arg0) {
			this.anOpengl1.glActiveTexture(arg0 + 33984);
			this.anInt2421 = arg0;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([Lclient!hc;Lclient!ci;[Lclient!bd;I)V")
	@Override
	public void method3285(@OriginalArg(0) Class78[] arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class15_Sub2[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method4379(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "(IIII)V")
	@Override
	public void method3291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2436 < arg0) {
			this.anInt2436 = arg0;
		}
		if (this.anInt2440 > arg2) {
			this.anInt2440 = arg2;
		}
		if (this.anInt2441 < arg1) {
			this.anInt2441 = arg1;
		}
		if (this.anInt2447 > arg3) {
			this.anInt2447 = arg3;
		}
		this.anOpengl1.glEnable(3089);
		this.method2328();
		this.method2326();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method3308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass18_Sub1_Sub1_2 == null || this.aClass18_Sub1_Sub1_2.anInt439 < arg2 || this.aClass18_Sub1_Sub1_2.anInt437 < arg3) {
			this.aClass18_Sub1_Sub1_2 = Static356.method506(this, arg3, arg6, arg2);
			this.aClass18_Sub1_Sub1_2.method500(false, false);
			local32 = this.aClass18_Sub1_Sub1_2.aFloat5;
			local36 = this.aClass18_Sub1_Sub1_2.aFloat4;
		} else {
			this.aClass18_Sub1_Sub1_2.method502(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass18_Sub1_Sub1_2.aFloat5 * (float) arg3 / (float) this.aClass18_Sub1_Sub1_2.anInt437;
			local36 = this.aClass18_Sub1_Sub1_2.aFloat4 * (float) arg2 / (float) this.aClass18_Sub1_Sub1_2.anInt439;
		}
		this.method2329();
		this.method2376(this.aClass18_Sub1_Sub1_2);
		this.method2336(arg8);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method2377(arg5);
		this.method2351(34165, 34165);
		this.method2372(0, 34166, 768);
		this.method2372(2, 5890, 770);
		this.method2346(0, 34166);
		this.method2346(2, 5890);
		@Pc(129) float local129 = (float) arg0;
		@Pc(132) float local132 = (float) arg1;
		@Pc(137) float local137 = local129 + (float) arg2;
		@Pc(142) float local142 = local132 + (float) arg3;
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glTexCoord2f(0.0F, 0.0F);
		this.anOpengl1.glVertex2f(local129, local132);
		this.anOpengl1.glTexCoord2f(0.0F, local36);
		this.anOpengl1.glVertex2f(local129, local142);
		this.anOpengl1.glTexCoord2f(local32, local36);
		this.anOpengl1.glVertex2f(local137, local142);
		this.anOpengl1.glTexCoord2f(local32, 0.0F);
		this.anOpengl1.glVertex2f(local137, local132);
		this.anOpengl1.glEnd();
		this.method2372(0, 5890, 768);
		this.method2372(2, 34166, 770);
		this.method2346(0, 5890);
		this.method2346(2, 34166);
	}

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "(II)V")
	public synchronized void method2374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub37 local4 = new Class1_Sub37(arg1);
		local4.aLong215 = arg0;
		this.aClass195_25.method5018(local4);
	}

	@OriginalMember(owner = "client!hj", name = "w", descriptor = "()Z")
	@Override
	public boolean method3293() {
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "mb", descriptor = "()V")
	private void method2375() {
		if (this.aBoolean210 && this.aBoolean208 | this.anInt2444 >= 0) {
			this.anOpengl1.glEnable(2912);
		} else {
			this.anOpengl1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!nj;)V")
	public void method2376(@OriginalArg(0) Class18 arg0) {
		@Pc(5) Class18 local5 = this.aClass18Array1[this.anInt2421];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl1.glDisable(local5.anInt5452);
			} else {
				if (local5 == null) {
					this.anOpengl1.glEnable(arg0.anInt5452);
				} else if (arg0.anInt5452 != local5.anInt5452) {
					this.anOpengl1.glDisable(local5.anInt5452);
					this.anOpengl1.glEnable(arg0.anInt5452);
				}
				this.anOpengl1.glBindTexture(arg0.anInt5452, arg0.method4842());
			}
			this.aClass18Array1[this.anInt2421] = arg0;
		}
		this.anInt2423 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "(I)V")
	public void method2377(@OriginalArg(0) int arg0) {
		Static124.aFloatArray19[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static124.aFloatArray19[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static124.aFloatArray19[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static124.aFloatArray19[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static124.aFloatArray19, 0);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!oc;)V")
	public void method2378(@OriginalArg(0) Interface4 arg0) {
		if (this.anInterface4_1 != arg0 && this.aBoolean221) {
			this.anOpengl1.glBindBufferARB(34963, arg0.method4262());
			this.anInterface4_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!hj", name = "nb", descriptor = "()V")
	private void method2379() {
		@Pc(2) float[] local2 = this.aFloatArray22;
		@Pc(14) float local14 = (float) (-this.anInt2430 * this.anInt2424) / (float) this.anInt2445;
		@Pc(28) float local28 = (float) ((this.anInt2412 - this.anInt2430) * this.anInt2424) / (float) this.anInt2445;
		@Pc(39) float local39 = (float) (this.anInt2432 * this.anInt2424) / (float) this.anInt2446;
		@Pc(53) float local53 = (float) ((this.anInt2432 - this.anInt2409) * this.anInt2424) / (float) this.anInt2446;
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
			@Pc(67) float local67 = (float) this.anInt2424 * 2.0F;
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
			local2[10] = this.aFloat60 = (float) -(this.anInt2433 + this.anInt2424) / (float) (this.anInt2433 - this.anInt2424);
			local2[11] = -1.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = this.aFloat46 = -(local67 * (float) this.anInt2433) / (float) (this.anInt2433 - this.anInt2424);
			local2[15] = 0.0F;
		}
		this.method2349();
	}

	@OriginalMember(owner = "client!hj", name = "ob", descriptor = "()V")
	private void method2380() {
		Static124.aFloatArray19[0] = this.aFloat62 * this.aFloat55;
		Static124.aFloatArray19[1] = this.aFloat62 * this.aFloat51;
		Static124.aFloatArray19[2] = this.aFloat62 * this.aFloat48;
		Static124.aFloatArray19[3] = 1.0F;
		this.anOpengl1.glLightModelfv(2899, Static124.aFloatArray19, 0);
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "(IIIII)V")
	@Override
	protected void method3339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method3314(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method3264();
	}

	@OriginalMember(owner = "client!hj", name = "B", descriptor = "()I")
	@Override
	public int method3307() {
		return this.anInt2433;
	}

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "()Z")
	@Override
	public boolean method3255() {
		return !this.aBoolean220;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ci;)V")
	@Override
	public void method3239(@OriginalArg(0) Class21 arg0) {
		this.aClass21_Sub1_2 = (Class21_Sub1) arg0;
		this.aClass21_Sub1_1.method793(this.aClass21_Sub1_2);
		if (this.anInt2428 != 1) {
			this.method2384();
		}
	}

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "()Z")
	@Override
	public boolean method3268() {
		return true;
	}

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "()I")
	@Override
	public int method3262() {
		return this.anInt2415 + this.anInt2411 + this.anInt2414;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!vm;)V")
	@Override
	public void method3271(@OriginalArg(0) Class113 arg0) {
		this.aClass113_Sub1_1 = (Class113_Sub1) arg0;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Lclient!fp;)V")
	public void method2381(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt2410 < 0 || this.anInterface2Array1[this.anInt2410] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface2Array1[this.anInt2410--] = null;
		arg0.method5529();
		if (this.anInt2410 >= 0) {
			this.anInterface2_1 = this.anInterface2Array1[this.anInt2410];
			this.anInterface2_1.method5527();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
	@Override
	public void method3279(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "pb", descriptor = "()Lclient!fp;")
	public Interface2 method2382() {
		return this.anInterface2_1;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "()V")
	@Override
	public void method5527() {
	}

	@OriginalMember(owner = "client!hj", name = "qb", descriptor = "()V")
	private void method2383() {
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
			Static134.method2598(1000L);
		}
	}

	@OriginalMember(owner = "client!hj", name = "rb", descriptor = "()V")
	private void method2384() {
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl1.glMultMatrixf(this.aClass21_Sub1_2.method795(), 0);
		this.method2314();
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(II)V")
	@Override
	public void method3302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2431 == arg0 && this.anInt2444 == arg1) {
			return;
		}
		this.anInt2431 = arg0;
		this.anInt2444 = arg1;
		if (!this.aBoolean208) {
			this.method2324();
			this.method2375();
		}
	}
}
