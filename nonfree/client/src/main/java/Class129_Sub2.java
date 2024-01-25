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

@OriginalClass("client!tb")
public final class Class129_Sub2 extends Class129 implements Interface9 {

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
	public int anInt5879;

	@OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
	public int anInt5880;

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "Lclient!vc;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
	public int anInt5881;

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
	public int anInt5882;

	@OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
	public int anInt5886;

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
	private int anInt5887;

	@OriginalMember(owner = "client!tb", name = "X", descriptor = "Lclient!nd;")
	public Class61_Sub2 aClass61_Sub2_1;

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "Lclient!lp;")
	public Class126_Sub2 aClass126_Sub2_1;

	@OriginalMember(owner = "client!tb", name = "ab", descriptor = "Lclient!lp;")
	public Class126_Sub2 aClass126_Sub2_2;

	@OriginalMember(owner = "client!tb", name = "bb", descriptor = "[Lclient!ue;")
	private Class56[] aClass56Array1;

	@OriginalMember(owner = "client!tb", name = "db", descriptor = "Lclient!lp;")
	public Class126_Sub2 aClass126_Sub2_3;

	@OriginalMember(owner = "client!tb", name = "eb", descriptor = "Z")
	public boolean aBoolean374;

	@OriginalMember(owner = "client!tb", name = "gb", descriptor = "Z")
	private boolean aBoolean375;

	@OriginalMember(owner = "client!tb", name = "hb", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!tb", name = "ib", descriptor = "Z")
	private boolean aBoolean376;

	@OriginalMember(owner = "client!tb", name = "kb", descriptor = "Lclient!nd;")
	public Class61_Sub2 aClass61_Sub2_2;

	@OriginalMember(owner = "client!tb", name = "nb", descriptor = "Z")
	public boolean aBoolean377;

	@OriginalMember(owner = "client!tb", name = "ob", descriptor = "Z")
	private boolean aBoolean378;

	@OriginalMember(owner = "client!tb", name = "qb", descriptor = "Lclient!wq;")
	public Class217 aClass217_4;

	@OriginalMember(owner = "client!tb", name = "vb", descriptor = "Z")
	public boolean aBoolean379;

	@OriginalMember(owner = "client!tb", name = "wb", descriptor = "F")
	private float aFloat59;

	@OriginalMember(owner = "client!tb", name = "yb", descriptor = "Lclient!ok;")
	private Interface5 anInterface5_5;

	@OriginalMember(owner = "client!tb", name = "zb", descriptor = "Ljava/lang/String;")
	private String aString58;

	@OriginalMember(owner = "client!tb", name = "Bb", descriptor = "I")
	private int anInt5894;

	@OriginalMember(owner = "client!tb", name = "Db", descriptor = "F")
	private float aFloat60;

	@OriginalMember(owner = "client!tb", name = "Eb", descriptor = "I")
	private int anInt5896;

	@OriginalMember(owner = "client!tb", name = "Hb", descriptor = "Z")
	private boolean aBoolean381;

	@OriginalMember(owner = "client!tb", name = "Ib", descriptor = "Lclient!lp;")
	public Class126_Sub2 aClass126_Sub2_4;

	@OriginalMember(owner = "client!tb", name = "Lb", descriptor = "I")
	private int anInt5898;

	@OriginalMember(owner = "client!tb", name = "Mb", descriptor = "Z")
	private boolean aBoolean383;

	@OriginalMember(owner = "client!tb", name = "Nb", descriptor = "Lclient!im;")
	public Class56_Sub4 aClass56_Sub4_5;

	@OriginalMember(owner = "client!tb", name = "Ob", descriptor = "I")
	public int anInt5899;

	@OriginalMember(owner = "client!tb", name = "Qb", descriptor = "Z")
	private boolean aBoolean384;

	@OriginalMember(owner = "client!tb", name = "Rb", descriptor = "Z")
	private boolean aBoolean385;

	@OriginalMember(owner = "client!tb", name = "Sb", descriptor = "J")
	private long aLong180;

	@OriginalMember(owner = "client!tb", name = "Tb", descriptor = "I")
	public int anInt5901;

	@OriginalMember(owner = "client!tb", name = "Ub", descriptor = "Lclient!im;")
	public Class56_Sub4 aClass56_Sub4_6;

	@OriginalMember(owner = "client!tb", name = "Wb", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!tb", name = "Xb", descriptor = "Z")
	public boolean aBoolean386;

	@OriginalMember(owner = "client!tb", name = "Zb", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!tb", name = "cc", descriptor = "Lclient!lp;")
	public Class126_Sub2 aClass126_Sub2_5;

	@OriginalMember(owner = "client!tb", name = "dc", descriptor = "Z")
	private boolean aBoolean389;

	@OriginalMember(owner = "client!tb", name = "ec", descriptor = "Z")
	private boolean aBoolean390;

	@OriginalMember(owner = "client!tb", name = "fc", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!tb", name = "hc", descriptor = "Ljava/lang/String;")
	private String aString59;

	@OriginalMember(owner = "client!tb", name = "ic", descriptor = "F")
	public float aFloat65;

	@OriginalMember(owner = "client!tb", name = "jc", descriptor = "I")
	private int anInt5904;

	@OriginalMember(owner = "client!tb", name = "kc", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!tb", name = "lc", descriptor = "Lclient!im;")
	public Class56_Sub4 aClass56_Sub4_7;

	@OriginalMember(owner = "client!tb", name = "nc", descriptor = "Z")
	public boolean aBoolean392;

	@OriginalMember(owner = "client!tb", name = "pc", descriptor = "I")
	private int anInt5906;

	@OriginalMember(owner = "client!tb", name = "sc", descriptor = "I")
	private int anInt5909;

	@OriginalMember(owner = "client!tb", name = "tc", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!tb", name = "vc", descriptor = "I")
	private int anInt5910;

	@OriginalMember(owner = "client!tb", name = "xc", descriptor = "I")
	public int anInt5912;

	@OriginalMember(owner = "client!tb", name = "Ac", descriptor = "Lclient!qb;")
	private Interface6 anInterface6_6;

	@OriginalMember(owner = "client!tb", name = "Cc", descriptor = "Z")
	public boolean aBoolean393;

	@OriginalMember(owner = "client!tb", name = "Dc", descriptor = "Z")
	private boolean aBoolean394;

	@OriginalMember(owner = "client!tb", name = "Ec", descriptor = "Lclient!kf;")
	private Class56_Sub4_Sub1 aClass56_Sub4_Sub1_4;

	@OriginalMember(owner = "client!tb", name = "Hc", descriptor = "I")
	private int anInt5915;

	@OriginalMember(owner = "client!tb", name = "Ic", descriptor = "I")
	private int anInt5916;

	@OriginalMember(owner = "client!tb", name = "Qc", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!tb", name = "Rc", descriptor = "Lclient!mm;")
	private Class132_Sub1 aClass132_Sub1_1;

	@OriginalMember(owner = "client!tb", name = "Sc", descriptor = "Lclient!lp;")
	public Class126_Sub2 aClass126_Sub2_6;

	@OriginalMember(owner = "client!tb", name = "Uc", descriptor = "F")
	private float aFloat74;

	@OriginalMember(owner = "client!tb", name = "Vc", descriptor = "I")
	private int anInt5920;

	@OriginalMember(owner = "client!tb", name = "Wc", descriptor = "I")
	private int anInt5921;

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "Lclient!ac;")
	private final Class4 aClass4_1 = new Class4();

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "Lclient!ic;")
	private final Class61 aClass61_4 = new Class61_Sub2();

	@OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
	public final int anInt5884 = 3;

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
	public final int anInt5883 = 8;

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "Z")
	private boolean aBoolean373 = false;

	@OriginalMember(owner = "client!tb", name = "P", descriptor = "[Lclient!vc;")
	private final Interface9[] anInterface9Array1 = new Interface9[4];

	@OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
	private int anInt5885 = -1;

	@OriginalMember(owner = "client!tb", name = "M", descriptor = "Lclient!aq;")
	private final Class16 aClass16_44 = new Class16();

	@OriginalMember(owner = "client!tb", name = "R", descriptor = "Lclient!aq;")
	private final Class16 aClass16_45 = new Class16();

	@OriginalMember(owner = "client!tb", name = "S", descriptor = "Lclient!aq;")
	private final Class16 aClass16_46 = new Class16();

	@OriginalMember(owner = "client!tb", name = "T", descriptor = "Lclient!aq;")
	private final Class16 aClass16_47 = new Class16();

	@OriginalMember(owner = "client!tb", name = "U", descriptor = "Lclient!aq;")
	private final Class16 aClass16_48 = new Class16();

	@OriginalMember(owner = "client!tb", name = "V", descriptor = "Lclient!aq;")
	private final Class16 aClass16_49 = new Class16();

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "Lclient!aq;")
	private final Class16 aClass16_50 = new Class16();

	@OriginalMember(owner = "client!tb", name = "mb", descriptor = "I")
	private int anInt5890 = 8448;

	@OriginalMember(owner = "client!tb", name = "Y", descriptor = "F")
	public float aFloat54 = 3584.0F;

	@OriginalMember(owner = "client!tb", name = "sb", descriptor = "[F")
	private final float[] aFloatArray27 = new float[4];

	@OriginalMember(owner = "client!tb", name = "Ab", descriptor = "I")
	public int anInt5893 = -1;

	@OriginalMember(owner = "client!tb", name = "tb", descriptor = "F")
	public float aFloat58 = -1.0F;

	@OriginalMember(owner = "client!tb", name = "ub", descriptor = "I")
	public int anInt5891 = 512;

	@OriginalMember(owner = "client!tb", name = "pb", descriptor = "F")
	public float aFloat56 = 3584.0F;

	@OriginalMember(owner = "client!tb", name = "rb", descriptor = "F")
	public float aFloat57 = 1.0F;

	@OriginalMember(owner = "client!tb", name = "Jb", descriptor = "I")
	private int anInt5897 = 0;

	@OriginalMember(owner = "client!tb", name = "uc", descriptor = "F")
	public float aFloat68 = 1.0F;

	@OriginalMember(owner = "client!tb", name = "oc", descriptor = "I")
	public int anInt5905 = 512;

	@OriginalMember(owner = "client!tb", name = "Pb", descriptor = "I")
	private int anInt5900 = -1;

	@OriginalMember(owner = "client!tb", name = "Fb", descriptor = "F")
	public float aFloat61 = 1.0F;

	@OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
	public int lb = -1;

	@OriginalMember(owner = "client!tb", name = "mc", descriptor = "[F")
	public final float[] aFloatArray28 = new float[4];

	@OriginalMember(owner = "client!tb", name = "qc", descriptor = "I")
	public int anInt5907 = 0;

	@OriginalMember(owner = "client!tb", name = "zc", descriptor = "[F")
	private final float[] aFloatArray29 = new float[16];

	@OriginalMember(owner = "client!tb", name = "yc", descriptor = "F")
	private float aFloat69 = 1.0F;

	@OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
	private int anInt5888 = 0;

	@OriginalMember(owner = "client!tb", name = "Vb", descriptor = "I")
	public int anInt5902 = 3584;

	@OriginalMember(owner = "client!tb", name = "Fc", descriptor = "I")
	private int anInt5913 = -1;

	@OriginalMember(owner = "client!tb", name = "Cb", descriptor = "I")
	private int anInt5895 = 0;

	@OriginalMember(owner = "client!tb", name = "jb", descriptor = "[F")
	private final float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!tb", name = "Lc", descriptor = "I")
	private int anInt5917 = 0;

	@OriginalMember(owner = "client!tb", name = "rc", descriptor = "I")
	private int anInt5908 = 0;

	@OriginalMember(owner = "client!tb", name = "Yb", descriptor = "I")
	private int anInt5903 = 0;

	@OriginalMember(owner = "client!tb", name = "Gc", descriptor = "I")
	public int anInt5914 = 0;

	@OriginalMember(owner = "client!tb", name = "Nc", descriptor = "Z")
	private boolean aBoolean395 = true;

	@OriginalMember(owner = "client!tb", name = "Kc", descriptor = "[F")
	private final float[] aFloatArray30 = new float[4];

	@OriginalMember(owner = "client!tb", name = "Tc", descriptor = "I")
	private int anInt5919 = 0;

	@OriginalMember(owner = "client!tb", name = "Bc", descriptor = "F")
	private float aFloat70 = 1.0F;

	@OriginalMember(owner = "client!tb", name = "wc", descriptor = "I")
	private int anInt5911 = 8448;

	@OriginalMember(owner = "client!tb", name = "Oc", descriptor = "F")
	public float aFloat72 = -1.0F;

	@OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
	public int anInt5889 = -1;

	@OriginalMember(owner = "client!tb", name = "Mc", descriptor = "I")
	public int anInt5918 = 50;

	@OriginalMember(owner = "client!tb", name = "Jc", descriptor = "F")
	private float aFloat71 = 0.0F;

	@OriginalMember(owner = "client!tb", name = "A", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas5;

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "Lclient!ja;")
	public final Interface2 anInterface2_7;

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl2;

	@OriginalMember(owner = "client!tb", name = "xb", descriptor = "I")
	public final int anInt5892;

	@OriginalMember(owner = "client!tb", name = "gc", descriptor = "Z")
	private boolean aBoolean391;

	@OriginalMember(owner = "client!tb", name = "Kb", descriptor = "Z")
	public boolean aBoolean382;

	@OriginalMember(owner = "client!tb", name = "bc", descriptor = "Z")
	public boolean aBoolean388;

	@OriginalMember(owner = "client!tb", name = "Gb", descriptor = "Z")
	public boolean aBoolean380;

	@OriginalMember(owner = "client!tb", name = "ac", descriptor = "Z")
	private boolean aBoolean387;

	@OriginalMember(owner = "client!tb", name = "Pc", descriptor = "Z")
	public boolean aBoolean396;

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "Lclient!vm;")
	public final Class207 aClass207_1;

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Lclient!pc;")
	private final Class153 aClass153_1;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "Lclient!ag;")
	private final Class7 aClass7_1;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "Lclient!ji;")
	private final Class11_Sub23_Sub1 aClass11_Sub23_Sub1_1;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!ja;IILclient!ko;)V")
	public Class129_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class118 arg4) {
		this.aCanvas5 = arg0;
		this.anInterface2_7 = arg1;
		this.anInt5876 = arg2;
		@Pc(186) int local186 = 0;
		while (!this.aCanvas5.isShowing()) {
			if (local186++ > 5) {
				throw new RuntimeException("");
			}
			Static244.method4311(1000L);
		}
		this.aCanvas5.setIgnoreRepaint(true);
		try {
			if (Static298.aBoolean372 == null || !Static298.aBoolean372) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static298.aBoolean372 = Boolean.TRUE;
				} else {
					@Pc(220) Class2 local220 = arg4.method2705(this.getClass());
					while (local220.anInt6 == 0) {
						Static244.method4311(100L);
					}
					if (local220.anInt6 == 1) {
						Static298.aBoolean372 = Boolean.TRUE;
					}
				}
			}
			if (Static298.aBoolean372 == null || !Static298.aBoolean372) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas5, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method5073();
				this.anOpengl2 = this.aContext1.getGL();
				@Pc(287) int local287 = this.method5031();
				if (local287 != 0) {
					throw new RuntimeException("");
				}
				this.anInt5892 = this.aBoolean377 ? 33639 : 5121;
				@Pc(306) String local306 = this.aString58.toLowerCase();
				@Pc(310) String local310 = this.aString59.toLowerCase();
				if (local310.indexOf("radeon") != -1) {
					@Pc(317) int local317 = 0;
					@Pc(319) boolean local319 = false;
					@Pc(321) boolean local321 = false;
					@Pc(329) String[] local329 = Static313.method5273(' ', local310.replace('/', ' '));
					for (@Pc(331) int local331 = 0; local331 < local329.length; local331++) {
						@Pc(339) String local339 = local329[local331];
						try {
							if (local339.length() > 0) {
								if (local339.charAt(0) == 'x' && local339.length() >= 3 && Static87.method1251(local339.substring(1, 3))) {
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
									if (local339.length() >= 4 && Static87.method1251(local339.substring(0, 4))) {
										local317 = Static87.method1250(local339.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(403) Exception local403) {
						}
					}
					if (!local321 && !local319) {
						if (local317 >= 7000 && local317 <= 7999) {
							this.aBoolean391 = false;
						}
						if (local317 >= 7000 && local317 <= 9250) {
							this.aBoolean382 = false;
						}
					}
					if (!local319 || local317 < 4000) {
						this.aBoolean388 = false;
					}
					this.aBoolean380 &= this.anOpengl2.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean387 = this.aBoolean391;
				}
				if (local306.contains("intel")) {
					this.aBoolean396 = false;
				}
				if (this.aBoolean391) {
					try {
						@Pc(461) int[] local461 = new int[1];
						this.anOpengl2.glGenBuffersARB(1, local461, 0);
					} catch (@Pc(469) Throwable local469) {
						throw new RuntimeException("", local469);
					}
				}
				this.method5039(this);
				this.method4974();
				this.method5081();
				new Class163(this);
				this.aClass207_1 = new Class207(this, this.anInterface2_7);
				Static171.method2792(true);
				this.aBoolean373 = true;
				this.aClass153_1 = new Class153(this);
				this.aClass7_1 = new Class7(this);
				this.aClass11_Sub23_Sub1_1 = new Class11_Sub23_Sub1(this);
				this.method5096();
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
						Static244.method4311(100L);
					}
				}
				this.anOpengl2.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(553) Throwable local553) {
			local553.printStackTrace();
			this.method4928();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local553);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([IIIII)Lclient!sg;")
	@Override
	public Class97 method4958(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class97_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(III)V")
	public void method5029(@OriginalArg(2) int arg0) {
		this.anOpengl2.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4997(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method5009();
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "()Z")
	@Override
	public boolean method4921() {
		return false;
	}

	@OriginalMember(owner = "client!tb", name = "M", descriptor = "()V")
	public void method5030() {
		if (this.anInt5910 != 0) {
			this.anInt5910 = 0;
			this.anInt5916 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "()V")
	@Override
	public void method4944() {
		this.method5044(true);
		this.anOpengl2.glClear(256);
	}

	@OriginalMember(owner = "client!tb", name = "N", descriptor = "()I")
	private int method5031() {
		@Pc(1) int local1 = 0;
		this.aString58 = this.anOpengl2.glGetString(7936);
		this.aString59 = this.anOpengl2.glGetString(7937);
		@Pc(17) String local17 = this.aString58.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl2.glGetString(7938);
		@Pc(53) String[] local53 = Static313.method5273(' ', local45.replace('.', ' '));
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static87.method1250(local53[0]);
				@Pc(69) int local69 = Static87.method1250(local53[1]);
				this.anInt5906 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt5906 < 12) {
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
		this.anInt5901 = local116[0];
		this.anOpengl2.glGetIntegerv(34929, local116, 0);
		this.anInt5898 = local116[0];
		this.anOpengl2.glGetIntegerv(34930, local116, 0);
		this.anInt5904 = local116[0];
		if (this.anInt5901 < 2 || this.anInt5898 < 2 || this.anInt5904 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean376 = Static167.aString32 != null && Static167.aString32.startsWith("mac");
		this.aBoolean377 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean391 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean390 = this.anOpengl2.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean379 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean374 = this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean382 = this.anOpengl2.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean380 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean393 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean388 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean392 = false;
		this.aBoolean396 = this.anOpengl2.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5011() {
	}

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "()Z")
	@Override
	public boolean method4992() {
		return this.aBoolean390;
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)V")
	public synchronized void method5032(@OriginalArg(0) int arg0) {
		@Pc(4) Class11_Sub33 local4 = new Class11_Sub33(arg0);
		this.aClass16_47.method190(local4);
	}

	@OriginalMember(owner = "client!tb", name = "O", descriptor = "()V")
	private void method5033() {
		if (this.anInt5903 <= this.anInt5917 && this.anInt5919 <= this.anInt5895) {
			this.anOpengl2.glScissor(this.anInt5888 + this.anInt5903, this.anInt5897 + this.anInt5879 - this.anInt5895, this.anInt5917 - this.anInt5903, this.anInt5895 - this.anInt5919);
		} else {
			this.anOpengl2.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!tb", name = "F", descriptor = "()V")
	@Override
	public void method5003() {
		if (this.anInt5881 <= 0 && this.anInt5879 <= 0) {
			return;
		}
		@Pc(9) int local9 = this.anInt5903;
		@Pc(12) int local12 = this.anInt5917;
		@Pc(15) int local15 = this.anInt5919;
		@Pc(18) int local18 = this.anInt5895;
		this.method4966();
		this.anOpengl2.glReadBuffer(1028);
		this.anOpengl2.glDrawBuffer(1029);
		this.method5030();
		this.method5045(false);
		this.method5069(false);
		this.method5089(false);
		this.method5044(false);
		this.method5084(null);
		this.method5041();
		this.method5094(0);
		this.method5035(0);
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRasterPos2i(0, 0);
		this.anOpengl2.glCopyPixels(0, 0, this.anInt5881, this.anInt5879, 6144);
		this.anOpengl2.glFlush();
		this.anOpengl2.glReadBuffer(1029);
		this.anOpengl2.glDrawBuffer(1029);
		this.method4952(local9, local15, local12, local18);
	}

	@OriginalMember(owner = "client!tb", name = "P", descriptor = "()V")
	private void method5034() {
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl2.glMultMatrixf(this.aClass61_Sub2_2.method3671(), 0);
		this.method5087();
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(IIIIII)Lclient!qe;")
	@Override
	public Class132 method5006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean393 ? new Class132_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "(I)V")
	public void method5035(@OriginalArg(0) int arg0) {
		if (this.anInt5896 == arg0) {
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
		if (local10 != this.aBoolean385) {
			this.anOpengl2.glColorMask(local10, local10, local10, true);
			this.aBoolean385 = local10;
		}
		if (local12 != this.aBoolean384) {
			if (local12) {
				this.anOpengl2.glEnable(3008);
			} else {
				this.anOpengl2.glDisable(3008);
			}
			this.aBoolean384 = local12;
		}
		if (local8 != this.anInt5915) {
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
			this.anInt5915 = local8;
		}
		this.anInt5896 = arg0;
		this.anInt5916 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "()V")
	public void method5036() {
		if (this.anInt5916 == 2) {
			return;
		}
		this.method5099();
		this.method5045(false);
		this.method5069(false);
		this.method5089(false);
		this.method5044(false);
		this.method5041();
		this.anInt5916 = 2;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!ep;II)V")
	@Override
	public void method4970(@OriginalArg(1) Class66 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class66_Sub2 local2 = (Class66_Sub2) arg0;
		@Pc(5) Class56_Sub4_Sub1 local5 = local2.aClass56_Sub4_Sub1_5;
		this.method5036();
		this.method5084(local2.aClass56_Sub4_Sub1_5);
		this.method5035(1);
		this.method5067(7681, 8448);
		this.method5037(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat22 / (float) local5.anInt3015;
		@Pc(37) float local37 = local5.aFloat21 / (float) local5.anInt3016;
		this.anOpengl2.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt5903 - arg1), local37 * (float) (this.anInt5919 - arg2));
		this.anOpengl2.glVertex2i(this.anInt5903, this.anInt5919);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt5903 - arg1), local37 * (float) (this.anInt5895 - arg2));
		this.anOpengl2.glVertex2i(this.anInt5903, this.anInt5895);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt5917 - arg1), local37 * (float) (this.anInt5895 - arg2));
		this.anOpengl2.glVertex2i(this.anInt5917, this.anInt5895);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt5917 - arg1), local37 * (float) (this.anInt5919 - arg2));
		this.anOpengl2.glVertex2i(this.anInt5917, this.anInt5919);
		this.anOpengl2.glEnd();
		this.method5037(0, 5890, 768);
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIIII)V")
	@Override
	protected void method4942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(III)V")
	public void method5037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
	@Override
	public void method4953(@OriginalArg(0) int arg0) {
		this.method5073();
	}

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "()V")
	@Override
	public void method4968() {
		if (this.aClass11_Sub23_Sub1_1.method2241()) {
			this.aClass7_1.method29(this.aClass11_Sub23_Sub1_1);
			this.aClass207_1.method5500();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[[I[[IIII)Lclient!ij;")
	@Override
	public Class77 method4948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class77_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!q;Lclient!q;Lclient!q;Lclient!q;)V")
	public void method5038(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) Class160 arg3) {
		if (arg0 == null) {
			this.anOpengl2.glDisableClientState(32884);
		} else {
			this.anOpengl2.glEnableClientState(32884);
			arg0.method4347();
		}
		if (arg1 == null) {
			this.anOpengl2.glDisableClientState(32885);
		} else {
			this.anOpengl2.glEnableClientState(32885);
			arg1.method4349();
		}
		if (arg2 == null) {
			this.anOpengl2.glDisableClientState(32886);
		} else {
			this.anOpengl2.glEnableClientState(32886);
			arg2.method4346();
		}
		if (arg3 == null) {
			this.anOpengl2.glDisableClientState(32888);
		} else {
			this.anOpengl2.glEnableClientState(32888);
			arg3.method4348();
		}
	}

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "()Z")
	@Override
	public boolean method4987() {
		return !this.aBoolean376;
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(IIII)V")
	@Override
	public void method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5914 = arg0;
		this.anInt5907 = arg1;
		this.anInt5905 = arg2;
		this.anInt5891 = arg3;
		this.method5042();
		this.method5100();
		if (this.anInt5910 == 3) {
			this.method5083();
		} else if (this.anInt5910 == 2) {
			this.method5065();
		}
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)V")
	@Override
	public void method4961(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "()Z")
	@Override
	public boolean method5020() {
		return this.aClass11_Sub23_Sub1_1.method2241();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!vc;)V")
	public void method5039(@OriginalArg(0) Interface9 arg0) {
		if (this.anInt5885 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5885 >= 0) {
			this.anInterface9Array1[this.anInt5885].method5723();
		}
		this.anInterface9_1 = this.anInterface9Array1[++this.anInt5885] = arg0;
		this.anInterface9_1.method5724();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZZ)V")
	public void method5040(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt5894) {
			if (arg0 < 0) {
				this.method5049();
				this.method5084(null);
				if (!this.aBoolean386) {
					this.aClass153_1.method4177(arg2, arg1, 0);
				}
			} else {
				@Pc(11) Class56_Sub4 local11 = this.aClass207_1.method5501(arg0);
				@Pc(17) Class134 local17 = this.anInterface2_7.method2244(arg0);
				if (local17.aByte46 == 0 && local17.aByte45 == 0) {
					this.method5049();
				} else {
					@Pc(30) int local30 = local17.aBoolean259 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method5058((float) (this.anInt5886 % local34 * local17.aByte46) / (float) local34, (float) (this.anInt5886 % local34 * local17.aByte45) / (float) local34, 0.0F);
				}
				if (this.aBoolean386) {
					this.aClass153_1.method4177(arg2, arg1, 3);
					this.method5084(local11);
				} else {
					this.aClass153_1.method4177(arg2, arg1, local17.aByte42);
					this.aClass153_1.method4176(local17.aByte44, false);
					if (!this.aClass153_1.method4175(local11)) {
						this.method5084(local11);
					}
				}
			}
			this.anInt5894 = arg0;
		}
		this.anInt5916 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "(I)V")
	public void method5041() {
		this.method5080(-2, true);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!lg;Z)Lclient!sg;")
	@Override
	public Class97 method5018(@OriginalArg(0) Class125 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt3499 * arg0.anInt3501];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray50 == null) {
			for (local15 = 0; local15 < arg0.anInt3501; local15++) {
				for (local21 = 0; local21 < arg0.anInt3499; local21++) {
					@Pc(74) int local74 = arg0.anIntArray226[arg0.aByteArray49[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt3501; local15++) {
				for (local21 = 0; local21 < arg0.anInt3499; local21++) {
					local6[local10++] = arg0.aByteArray50[local8] << 24 | arg0.anIntArray226[arg0.aByteArray49[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class97 local100 = this.method4958(local6, arg0.anInt3499, arg0.anInt3499, arg0.anInt3501);
		local100.method5549(arg0.anInt3496, arg0.anInt3498, arg0.anInt3500, arg0.anInt3497);
		return local100;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ip;)V")
	@Override
	public void method4982(@OriginalArg(0) Class11_Sub22 arg0) {
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method4988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass56_Sub4_Sub1_4 == null || this.aClass56_Sub4_Sub1_4.anInt3013 < arg2 || this.aClass56_Sub4_Sub1_4.anInt3012 < arg3) {
			this.aClass56_Sub4_Sub1_4 = Static366.method2556(this, arg2, arg6, arg3);
			this.aClass56_Sub4_Sub1_4.method2553(false, false);
			local32 = this.aClass56_Sub4_Sub1_4.aFloat21;
			local36 = this.aClass56_Sub4_Sub1_4.aFloat22;
		} else {
			this.aClass56_Sub4_Sub1_4.method2551(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass56_Sub4_Sub1_4.aFloat21 * (float) arg3 / (float) this.aClass56_Sub4_Sub1_4.anInt3012;
			local36 = this.aClass56_Sub4_Sub1_4.aFloat22 * (float) arg2 / (float) this.aClass56_Sub4_Sub1_4.anInt3013;
		}
		this.method5036();
		this.method5084(this.aClass56_Sub4_Sub1_4);
		this.method5035(arg8);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method5074(arg5);
		this.method5067(34165, 34165);
		this.method5037(0, 34166, 768);
		this.method5037(2, 5890, 770);
		this.method5097(0, 34166);
		this.method5097(2, 5890);
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
		this.method5037(0, 5890, 768);
		this.method5037(2, 34166, 770);
		this.method5097(0, 5890);
		this.method5097(2, 34166);
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)Lclient!ip;")
	@Override
	public Class11_Sub22 method4962() {
		return null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "()I")
	@Override
	public int method5722() {
		return this.anInt5879;
	}

	@OriginalMember(owner = "client!tb", name = "R", descriptor = "()V")
	private void method5042() {
		@Pc(2) float[] local2 = this.aFloatArray29;
		@Pc(14) float local14 = (float) (-this.anInt5914 * this.anInt5918) / (float) this.anInt5905;
		@Pc(28) float local28 = (float) ((this.anInt5881 - this.anInt5914) * this.anInt5918) / (float) this.anInt5905;
		@Pc(39) float local39 = (float) (this.anInt5907 * this.anInt5918) / (float) this.anInt5891;
		@Pc(53) float local53 = (float) ((this.anInt5907 - this.anInt5879) * this.anInt5918) / (float) this.anInt5891;
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
			@Pc(67) float local67 = (float) this.anInt5918 * 2.0F;
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
			local2[10] = this.aFloat60 = (float) -(this.anInt5902 + this.anInt5918) / (float) (this.anInt5902 - this.anInt5918);
			local2[11] = -1.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = this.aFloat74 = -(local67 * (float) this.anInt5902) / (float) (this.anInt5902 - this.anInt5918);
			local2[15] = 0.0F;
		}
		this.method5070();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([Lclient!mj;Lclient!mr;Lclient!ic;[Lclient!vf;I)V")
	@Override
	public void method5004(@OriginalArg(0) Class126[] arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) Class10_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method4994(arg0, arg2, arg3, arg4);
		this.method5008(arg1);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	@Override
	public void method4924(@OriginalArg(0) int arg0) {
		this.method5068();
	}

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "(I)I")
	public int method5043(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(Z)V")
	public void method5044(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean394) {
			this.aBoolean394 = arg0;
			this.method5075();
			this.anInt5916 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(II)V")
	@Override
	public void method5012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5918 == arg0 && this.anInt5902 == arg1) {
			return;
		}
		this.anInt5918 = arg0;
		this.anInt5902 = arg1;
		this.method5042();
		this.method5085();
		if (this.anInt5910 == 3) {
			this.method5083();
		} else if (this.anInt5910 == 2) {
			this.method5065();
		}
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(Z)V")
	public void method5045(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean383) {
			this.aBoolean383 = arg0;
			this.method5048();
			this.anInt5916 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!tb", name = "S", descriptor = "()V")
	public void method5046() {
		if (this.anInt5916 == 4) {
			return;
		}
		this.method5099();
		this.method5045(false);
		this.method5069(false);
		this.method5089(false);
		this.method5044(false);
		this.method5041();
		this.method5035(1);
		this.method5094(1);
		this.anInt5916 = 4;
	}

	@OriginalMember(owner = "client!tb", name = "T", descriptor = "()V")
	private void method5047() {
		if (this.aBoolean378 && !this.aBoolean375) {
			this.anOpengl2.glEnable(2896);
		} else {
			this.anOpengl2.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!tb", name = "U", descriptor = "()V")
	private void method5048() {
		if (this.aBoolean383 && this.aBoolean386 | this.lb >= 0) {
			this.anOpengl2.glEnable(2912);
		} else {
			this.anOpengl2.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!tb", name = "V", descriptor = "()V")
	private void method5049() {
		if (this.aBoolean389) {
			this.anOpengl2.glMatrixMode(5890);
			this.anOpengl2.glLoadIdentity();
			this.anOpengl2.glMatrixMode(5888);
			this.aBoolean389 = false;
		}
	}

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "(I)I")
	public int method5050(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "()I")
	@Override
	public int method4980() {
		@Pc(2) int local2 = this.anInt5920;
		this.anInt5920 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(FF)V")
	public void method5051(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat70 = arg0;
		this.aFloat71 = arg1;
		if (!this.aBoolean386) {
			this.method5085();
		}
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "()Z")
	@Override
	public boolean method4927() {
		return true;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4936(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(Z)V")
	public void method5052(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean375) {
			this.aBoolean375 = arg0;
			this.method5047();
		}
	}

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "()V")
	@Override
	public void method4967() {
		this.aClass7_1.method30();
	}

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "()Z")
	@Override
	public boolean method5017() {
		return this.aClass11_Sub23_Sub1_1.method2242();
	}

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "()V")
	public void method5053() {
		if (this.anInt5916 == 8) {
			return;
		}
		this.method5088();
		this.method5045(true);
		this.method5089(true);
		this.method5044(true);
		this.method5035(1);
		this.method5094(1);
		this.anInt5916 = 8;
	}

	@OriginalMember(owner = "client!tb", name = "X", descriptor = "()V")
	public void method5054() {
		if (this.anInt5916 == 16) {
			return;
		}
		this.method5077();
		this.method5045(true);
		this.method5089(true);
		this.method5044(true);
		this.method5035(1);
		this.method5094(1);
		this.anInt5916 = 16;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass61_Sub2_2.aFloat43 * (float) arg0 + this.aClass61_Sub2_2.aFloat42 * (float) arg1 + this.aClass61_Sub2_2.aFloat33 * (float) arg2 + this.aClass61_Sub2_2.aFloat37;
		if (local24 < (float) this.anInt5918 || local24 > (float) this.anInt5902) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt5905 * (this.aClass61_Sub2_2.aFloat36 * (float) arg0 + this.aClass61_Sub2_2.aFloat35 * (float) arg1 + this.aClass61_Sub2_2.aFloat38 * (float) arg2 + this.aClass61_Sub2_2.aFloat41) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt5891 * (this.aClass61_Sub2_2.aFloat39 * (float) arg0 + this.aClass61_Sub2_2.aFloat32 * (float) arg1 + this.aClass61_Sub2_2.aFloat40 * (float) arg2 + this.aClass61_Sub2_2.aFloat34) / local24);
		if ((float) local81 >= this.aFloat55 && (float) local81 <= this.aFloat62 && (float) local113 >= this.aFloat65 && (float) local113 <= this.aFloat63) {
			arg3[0] = (int) ((float) local81 - this.aFloat55);
			arg3[1] = (int) ((float) local113 - this.aFloat65);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method4925(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt5913 != arg0;
		if (local7 || this.aFloat72 != arg1 || this.aFloat58 != arg2) {
			this.anInt5913 = arg0;
			this.aFloat72 = arg1;
			this.aFloat58 = arg2;
			if (local7) {
				this.aFloat68 = (float) (this.anInt5913 & 0xFF0000) / 1.671168E7F;
				this.aFloat61 = (float) (this.anInt5913 & 0xFFFF) / 65535.0F;
				this.aFloat57 = (float) (this.anInt5913 & 0xFF) / 255.0F;
				this.method5098();
			}
			this.method5063();
		}
		if (this.aFloatArray30[0] == arg3 && this.aFloatArray30[1] == arg4 && this.aFloatArray30[2] == arg5) {
			return;
		}
		this.aFloatArray30[0] = arg3;
		this.aFloatArray30[1] = arg4;
		this.aFloatArray30[2] = arg5;
		this.aFloatArray26[0] = -arg3;
		this.aFloatArray26[1] = -arg4;
		this.aFloatArray26[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray28[0] = arg3 * local132;
		this.aFloatArray28[1] = arg4 * local132;
		this.aFloatArray28[2] = arg5 * local132;
		this.aFloatArray27[0] = -this.aFloatArray28[0];
		this.aFloatArray27[1] = -this.aFloatArray28[1];
		this.aFloatArray27[2] = -this.aFloatArray28[2];
		this.method5087();
		this.anInt5912 = (int) (arg3 * 256.0F / arg4);
		this.anInt5899 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!tb", name = "Y", descriptor = "()V")
	private void method5055() {
		if (this.anInt5916 == 1) {
			return;
		}
		this.method5099();
		this.method5045(false);
		this.method5069(false);
		this.method5089(false);
		this.method5044(false);
		this.method5084(null);
		this.method5041();
		this.method5094(0);
		this.anInt5916 = 1;
	}

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "()Lclient!ds;")
	public Class56_Sub1 method5056() {
		return this.aClass132_Sub1_1 == null ? null : this.aClass132_Sub1_1.method5140();
	}

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "(I)I")
	public int method5057(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass7_1.method35(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "()Z")
	@Override
	public boolean method4932() {
		return false;
	}

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "()Lclient!ic;")
	@Override
	public Class61 method4979() {
		return this.aClass61_4;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V")
	@Override
	public void method4955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5889 == arg0 && this.lb == arg1) {
			return;
		}
		this.anInt5889 = arg0;
		this.lb = arg1;
		if (!this.aBoolean386) {
			this.method5085();
			this.method5048();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(FFF)V")
	private void method5058(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl2.glMatrixMode(5890);
		if (this.aBoolean389) {
			this.anOpengl2.glLoadIdentity();
		}
		this.anOpengl2.glTranslatef(arg0, arg1, arg2);
		this.anOpengl2.glMatrixMode(5888);
		this.aBoolean389 = true;
	}

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "()Z")
	@Override
	public boolean method4975() {
		return true;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ok;)V")
	public void method5059(@OriginalArg(0) Interface5 arg0) {
		if (this.anInterface5_5 != arg0 && this.aBoolean391) {
			this.anOpengl2.glBindBufferARB(34963, arg0.method4888());
			this.anInterface5_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[BIZ)Lclient!ok;")
	public Interface5 method5060(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface5) (this.aBoolean391 && (!arg2 || this.aBoolean387) ? new Class80_Sub2(this, 5123, arg0, arg1, arg2) : new Class100_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(IIII)[I")
	@Override
	public int[] method5001() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl2.glReadPixels(0, this.anInt5879 - local6, 36, 1, 32993, this.anInt5892, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(II)V")
	public synchronized void method5061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class11_Sub33 local4 = new Class11_Sub33(arg1);
		local4.aLong215 = arg0;
		this.aClass16_47.method190(local4);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!qb;")
	public Interface6 method5062(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface6) (this.aBoolean391 ? new Class80_Sub1(this, arg0, arg1, false) : new Class100_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ic;)V")
	@Override
	public void method4971(@OriginalArg(0) Class61 arg0) {
		this.aClass61_Sub2_2 = (Class61_Sub2) arg0;
		this.aClass61_Sub2_1.method3672(this.aClass61_Sub2_2);
		if (this.anInt5910 != 1) {
			this.method5034();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
	@Override
	public void method4964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean386) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt5900 = arg1;
		this.anInt5893 = arg2;
		this.method5085();
		this.aClass153_1.method4176(arg0, true);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!qe;Lclient!qe;FLclient!qe;)Lclient!qe;")
	@Override
	public Class132 method4965(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class132 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean393 && this.aBoolean396) {
			@Pc(11) Class132_Sub1_Sub1 local11 = null;
			@Pc(14) Class132_Sub1 local14 = (Class132_Sub1) arg0;
			@Pc(17) Class132_Sub1 local17 = (Class132_Sub1) arg1;
			@Pc(21) Class56_Sub1 local21 = local14.method5140();
			@Pc(25) Class56_Sub1 local25 = local17.method5140();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt1226 > local25.anInt1226 ? local21.anInt1226 : local25.anInt1226;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class132_Sub1_Sub1) {
					@Pc(52) Class132_Sub1_Sub1 local52 = (Class132_Sub1_Sub1) arg3;
					if (local52.method4823() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class132_Sub1_Sub1(this, local40);
				}
				local11.method4824(arg2, local21, local25);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "()I")
	@Override
	public int method5000() {
		return 4;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[Lclient!bh;)V")
	@Override
	public void method4963(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub5[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class11_Sub5 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static298.aFloatArray25[0] = local8.anInt1285;
			Static298.aFloatArray25[1] = local8.anInt1287;
			Static298.aFloatArray25[2] = local8.anInt1286;
			Static298.aFloatArray25[3] = 1.0F;
			this.anOpengl2.glLightfv(local12, 4611, Static298.aFloatArray25, 0);
			@Pc(44) int local44 = local8.anInt1290;
			@Pc(49) float local49 = local8.aFloat9 / 255.0F;
			Static298.aFloatArray25[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static298.aFloatArray25[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static298.aFloatArray25[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl2.glLightfv(local12, 4609, Static298.aFloatArray25, 0);
			this.anOpengl2.glLightf(local12, 4617, 1.0F / (float) (local8.anInt1289 * local8.anInt1289));
			this.anOpengl2.glEnable(local12);
		}
		while (local1 < this.anInt5908) {
			this.anOpengl2.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt5908 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method4945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method5055();
		this.method5035(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean390) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local19);
		this.anOpengl2.glVertex2f(local14, local19);
		this.anOpengl2.glVertex2f(local14, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean390) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!tb", name = "ab", descriptor = "()V")
	private void method5063() {
		Static298.aFloatArray24[0] = this.aFloat72 * this.aFloat68;
		Static298.aFloatArray24[1] = this.aFloat72 * this.aFloat61;
		Static298.aFloatArray24[2] = this.aFloat72 * this.aFloat57;
		Static298.aFloatArray24[3] = 1.0F;
		this.anOpengl2.glLightfv(16384, 4609, Static298.aFloatArray24, 0);
		Static298.aFloatArray24[0] = -this.aFloat58 * this.aFloat68;
		Static298.aFloatArray24[1] = -this.aFloat58 * this.aFloat61;
		Static298.aFloatArray24[2] = -this.aFloat58 * this.aFloat57;
		Static298.aFloatArray24[3] = 1.0F;
		this.anOpengl2.glLightfv(16385, 4609, Static298.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "()V")
	@Override
	public void method4950() {
		this.aClass153_1.method4177(false, false, 0);
		this.aBoolean386 = false;
		this.method5085();
		this.method5048();
	}

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "()Z")
	@Override
	public boolean method5021() {
		return this.aClass153_1.method4174();
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(II)V")
	public synchronized void method5064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class11_Sub33 local4 = new Class11_Sub33(arg1);
		local4.aLong215 = arg0;
		this.aClass16_45.method190(local4);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl2.glLineWidth((float) arg5);
		this.method4951(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl2.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIZ)Lclient!sg;")
	@Override
	public Class97 method4960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class97_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "()V")
	@Override
	public void method4943() {
	}

	@OriginalMember(owner = "client!tb", name = "bb", descriptor = "()V")
	private void method5065() {
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadMatrixf(this.aFloatArray29, 0);
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "()Z")
	@Override
	public boolean method4935() {
		return true;
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(II)V")
	public synchronized void method5066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class11_Sub33 local4 = new Class11_Sub33(arg1);
		local4.aLong215 = arg0;
		this.aClass16_46.method190(local4);
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "(II)V")
	public void method5067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5909 != 0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt5911 != arg0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anInt5911 = arg0;
			local4 = true;
		}
		if (this.anInt5890 != arg1) {
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			this.anInt5890 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt5916 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(FF)V")
	@Override
	public void method4986(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat73 && arg1 == this.aFloat64) {
			return;
		}
		this.aFloat73 = arg0;
		this.aFloat64 = arg1;
		this.method5070();
		if (this.anInt5910 == 3) {
			this.method5083();
		} else if (this.anInt5910 == 2) {
			this.method5065();
		}
	}

	@OriginalMember(owner = "client!tb", name = "cb", descriptor = "()V")
	private void method5068() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIILclient!ep;II)V")
	@Override
	public void method4931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class66 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class66_Sub2 local2 = (Class66_Sub2) arg5;
		@Pc(5) Class56_Sub4_Sub1 local5 = local2.aClass56_Sub4_Sub1_5;
		this.method5036();
		this.method5084(local2.aClass56_Sub4_Sub1_5);
		this.method5035(1);
		this.method5067(7681, 8448);
		this.method5037(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat22 / (float) local5.anInt3015;
		@Pc(37) float local37 = local5.aFloat21 / (float) local5.anInt3016;
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
		this.method5037(0, 5890, 768);
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "(Z)V")
	public void method5069(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean378) {
			this.aBoolean378 = arg0;
			this.method5047();
			this.anInt5916 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "()V")
	@Override
	public void method5723() {
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(Z)V")
	@Override
	public void method5002(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "()Z")
	@Override
	public boolean method4959() {
		return false;
	}

	@OriginalMember(owner = "client!tb", name = "db", descriptor = "()V")
	private void method5070() {
		if (this.aFloat64 == 0.0F) {
			this.aFloatArray29[10] = this.aFloat60;
			this.aFloatArray29[14] = this.aFloat74;
		} else {
			@Pc(13) float local13 = this.aFloat73 / (this.aFloat64 + this.aFloat73);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat74 * (1.0F - local13) * (1.0F - local13) / this.aFloat64;
			this.aFloatArray29[10] = this.aFloat60 + local32;
			this.aFloatArray29[14] = this.aFloat74 * local17;
		}
		this.aFloat56 = (this.aFloatArray29[14] - (float) this.anInt5902) / this.aFloatArray29[10];
		this.aFloat54 = (float) this.anInt5902 - this.aFloat64;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!mr;)V")
	@Override
	public void method5008(@OriginalArg(0) Class136 arg0) {
		this.aClass4_1.method11(this, arg0);
	}

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "()Z")
	@Override
	public boolean method4954() {
		if (!this.aClass11_Sub23_Sub1_1.method2241()) {
			if (!this.aClass7_1.method32(this.aClass11_Sub23_Sub1_1)) {
				return false;
			}
			this.aClass207_1.method5500();
		}
		return true;
	}

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "(I)V")
	public synchronized void method5071(@OriginalArg(0) int arg0) {
		@Pc(4) Class11_Sub33 local4 = new Class11_Sub33(arg0);
		this.aClass16_49.method190(local4);
	}

	@OriginalMember(owner = "client!tb", name = "eb", descriptor = "()V")
	public void method5072() {
		this.anOpengl2.glPopMatrix();
	}

	@OriginalMember(owner = "client!tb", name = "fb", descriptor = "()V")
	private void method5073() {
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
			Static244.method4311(1000L);
		}
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "()I")
	@Override
	public int method4923() {
		return this.anInt5880 + this.anInt5882 + this.anInt5887;
	}

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "()V")
	@Override
	public void method4966() {
		this.anInt5903 = 0;
		this.anInt5919 = 0;
		this.anInt5917 = this.anInt5881;
		this.anInt5895 = this.anInt5879;
		this.anOpengl2.glDisable(3089);
		this.method5100();
	}

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "(I)V")
	public void method5074(@OriginalArg(0) int arg0) {
		Static298.aFloatArray24[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static298.aFloatArray24[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static298.aFloatArray24[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static298.aFloatArray24[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static298.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!tb", name = "gb", descriptor = "()V")
	private void method5075() {
		this.anOpengl2.glDepthMask(this.aBoolean394 && this.aBoolean395);
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method4947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5055();
		this.method5035(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!nd;)V")
	public void method5076(@OriginalArg(0) Class61_Sub2 arg0) {
		this.anOpengl2.glPushMatrix();
		this.anOpengl2.glMultMatrixf(arg0.method3671(), 0);
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(IIIIII)Z")
	@Override
	public boolean method5014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass61_Sub2_2.aFloat43 * (float) arg0 + this.aClass61_Sub2_2.aFloat42 * (float) arg1 + this.aClass61_Sub2_2.aFloat33 * (float) arg2 + this.aClass61_Sub2_2.aFloat37;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass61_Sub2_2.aFloat43 * (float) arg3 + this.aClass61_Sub2_2.aFloat42 * (float) arg4 + this.aClass61_Sub2_2.aFloat33 * (float) arg5 + this.aClass61_Sub2_2.aFloat37;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt5918 && local55 < (float) this.anInt5918 || !(!(local24 > (float) this.anInt5902) || !(local55 > (float) this.anInt5902))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt5905 * (this.aClass61_Sub2_2.aFloat36 * (float) arg0 + this.aClass61_Sub2_2.aFloat35 * (float) arg1 + this.aClass61_Sub2_2.aFloat38 * (float) arg2 + this.aClass61_Sub2_2.aFloat41) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt5905 * (this.aClass61_Sub2_2.aFloat36 * (float) arg3 + this.aClass61_Sub2_2.aFloat35 * (float) arg4 + this.aClass61_Sub2_2.aFloat38 * (float) arg5 + this.aClass61_Sub2_2.aFloat41) / local55);
		if ((float) local119 < this.aFloat55 && (float) local151 < this.aFloat55 || (float) local119 > this.aFloat62 && (float) local151 > this.aFloat62) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt5891 * (this.aClass61_Sub2_2.aFloat39 * (float) arg0 + this.aClass61_Sub2_2.aFloat32 * (float) arg1 + this.aClass61_Sub2_2.aFloat40 * (float) arg2 + this.aClass61_Sub2_2.aFloat34) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt5891 * (this.aClass61_Sub2_2.aFloat39 * (float) arg3 + this.aClass61_Sub2_2.aFloat32 * (float) arg4 + this.aClass61_Sub2_2.aFloat40 * (float) arg5 + this.aClass61_Sub2_2.aFloat34) / local55);
			return (!((float) local209 < this.aFloat65) || !((float) local241 < this.aFloat65)) && (!((float) local209 > this.aFloat63) || !((float) local241 > this.aFloat63));
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([I)V")
	@Override
	public void method4920(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5903;
		arg0[1] = this.anInt5919;
		arg0[2] = this.anInt5917;
		arg0[3] = this.anInt5895;
	}

	@OriginalMember(owner = "client!tb", name = "hb", descriptor = "()V")
	private void method5077() {
		if (this.anInt5910 != 3) {
			this.anInt5910 = 3;
			this.method5083();
			this.method5034();
			this.anInt5916 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!tb", name = "ib", descriptor = "()Lclient!vc;")
	public Interface9 method5078() {
		return this.anInterface9_1;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I[BIZ)Lclient!qb;")
	public Interface6 method5079(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface6) (this.aBoolean391 && (!arg3 || this.aBoolean387) ? new Class80_Sub1(this, arg0, arg1, arg2, arg3) : new Class100_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V")
	public void method5080(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method5040(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "()V")
	@Override
	public void method5724() {
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V")
	@Override
	public void method4995(@OriginalArg(0) boolean arg0) {
		this.aBoolean395 = arg0;
		this.method5075();
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIII)V")
	@Override
	public void method4952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt5881) {
			arg2 = this.anInt5881;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt5879) {
			arg3 = this.anInt5879;
		}
		this.anInt5903 = arg0;
		this.anInt5919 = arg1;
		this.anInt5917 = arg2;
		this.anInt5895 = arg3;
		this.anOpengl2.glEnable(3089);
		this.method5100();
		this.method5033();
	}

	@OriginalMember(owner = "client!tb", name = "jb", descriptor = "()V")
	private void method5081() {
		this.aClass61_Sub2_2 = new Class61_Sub2();
		this.aClass61_Sub2_1 = new Class61_Sub2();
		this.aClass56Array1 = new Class56[this.anInt5901];
		this.aClass56_Sub4_7 = new Class56_Sub4(this, 3553, 6408, 1, 1);
		this.aClass56_Sub4_6 = new Class56_Sub4(this, 3553, 6408, 1, 1);
		this.aClass56_Sub4_5 = new Class56_Sub4(this, 3553, 6408, 1, 1);
		this.aClass126_Sub2_4 = new Class126_Sub2(this);
		this.aClass126_Sub2_3 = new Class126_Sub2(this);
		this.aClass126_Sub2_6 = new Class126_Sub2(this);
		this.aClass126_Sub2_2 = new Class126_Sub2(this);
		this.aClass126_Sub2_5 = new Class126_Sub2(this);
		this.aClass126_Sub2_1 = new Class126_Sub2(this);
		if (this.aBoolean396) {
			this.aClass217_4 = new Class217(this);
		}
		this.aClass4_1.method13(this);
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "()V")
	@Override
	protected void method4928() {
		if (this.anOpengl2 != null) {
			try {
				this.aClass7_1.method33();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl2 = null;
		}
		if (this.aContext1 != null) {
			this.method5068();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean373) {
			Static13.method184(true);
			this.aBoolean373 = false;
		}
	}

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "()Z")
	@Override
	public boolean method4939() {
		return true;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(Lclient!vc;)V")
	public void method5082(@OriginalArg(0) Interface9 arg0) {
		if (this.anInt5885 < 0 || this.anInterface9Array1[this.anInt5885] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface9Array1[this.anInt5885--] = null;
		arg0.method5723();
		if (this.anInt5885 >= 0) {
			this.anInterface9_1 = this.anInterface9Array1[this.anInt5885];
			this.anInterface9_1.method5724();
		}
	}

	@OriginalMember(owner = "client!tb", name = "kb", descriptor = "()V")
	private void method5083() {
		@Pc(11) float local11 = (float) -this.anInt5914 * this.aFloat69 / (float) this.anInt5905;
		@Pc(23) float local23 = (float) -this.anInt5907 * this.aFloat69 / (float) this.anInt5891;
		@Pc(37) float local37 = (float) (this.anInt5881 - this.anInt5914) * this.aFloat69 / (float) this.anInt5905;
		@Pc(51) float local51 = (float) (this.anInt5879 - this.anInt5907) * this.aFloat69 / (float) this.anInt5891;
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		if (local11 != local37 && local51 != local23) {
			this.anOpengl2.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt5918 - this.aFloat64), (double) ((float) this.anInt5902 - this.aFloat64));
		}
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ue;)V")
	public void method5084(@OriginalArg(0) Class56 arg0) {
		@Pc(5) Class56 local5 = this.aClass56Array1[this.anInt5909];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl2.glDisable(local5.anInt3010);
			} else {
				if (local5 == null) {
					this.anOpengl2.glEnable(arg0.anInt3010);
				} else if (arg0.anInt3010 != local5.anInt3010) {
					this.anOpengl2.glDisable(local5.anInt3010);
					this.anOpengl2.glEnable(arg0.anInt3010);
				}
				this.anOpengl2.glBindTexture(arg0.anInt3010, arg0.method2536());
			}
			this.aClass56Array1[this.anInt5909] = arg0;
		}
		this.anInt5916 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "()F")
	@Override
	public float method4922() {
		return this.aFloat64;
	}

	@OriginalMember(owner = "client!tb", name = "lb", descriptor = "()V")
	private void method5085() {
		@Pc(15) int local15;
		if (this.aBoolean386) {
			this.anOpengl2.glFogf(2915, 0.0F);
			this.anOpengl2.glFogf(2916, 1.0F);
			local15 = this.anInt5900;
		} else {
			this.aFloat59 = (float) (this.anInt5902 - 256) - this.aFloat71;
			this.aFloat67 = this.aFloat59 - (float) this.lb * this.aFloat70;
			if (this.aFloat67 < (float) this.anInt5918) {
				this.aFloat67 = this.anInt5918;
			}
			this.anOpengl2.glFogf(2915, this.aFloat67);
			this.anOpengl2.glFogf(2916, this.aFloat59);
			local15 = this.anInt5889;
		}
		Static298.aFloatArray24[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static298.aFloatArray24[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static298.aFloatArray24[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl2.glFogfv(2918, Static298.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	@Override
	public void method4930(@OriginalArg(0) int arg0) {
		this.method5035(0);
		this.anOpengl2.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl2.glClear(16384);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(FFFF)V")
	public void method5086(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static298.aFloatArray24[0] = arg0;
		Static298.aFloatArray24[1] = arg1;
		Static298.aFloatArray24[2] = arg2;
		Static298.aFloatArray24[3] = arg3;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static298.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "()F")
	@Override
	public float method4981() {
		return this.aFloat73;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5005(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static146.aFloat19 = arg0;
		Static146.aFloat17 = arg1;
		Static146.aFloat18 = arg2;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!br;IIII)Lclient!mj;")
	@Override
	public Class126 method4929(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class126_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!k;[Lclient!lg;Z)Lclient!ai;")
	@Override
	public Class9 method4933(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class125[] arg1) {
		return new Class9_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(F)V")
	@Override
	public void method4937(@OriginalArg(0) float arg0) {
		if (this.aFloat66 != arg0) {
			this.aFloat66 = arg0;
			this.method5098();
		}
	}

	@OriginalMember(owner = "client!tb", name = "mb", descriptor = "()V")
	public void method5087() {
		this.anOpengl2.glLightfv(16384, 4611, this.aFloatArray28, 0);
		this.anOpengl2.glLightfv(16385, 4611, this.aFloatArray27, 0);
	}

	@OriginalMember(owner = "client!tb", name = "nb", descriptor = "()V")
	public void method5088() {
		if (this.anInt5910 != 2) {
			this.anInt5910 = 2;
			this.method5065();
			this.method5034();
			this.anInt5916 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "(Z)V")
	public void method5089(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean381) {
			return;
		}
		if (arg0) {
			this.anOpengl2.glEnable(2929);
		} else {
			this.anOpengl2.glDisable(2929);
		}
		this.aBoolean381 = arg0;
		this.anInt5916 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method4969(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class11_Sub33 local16;
		while (!this.aClass16_45.method194()) {
			local16 = (Class11_Sub33) this.aClass16_45.method180();
			Static298.anIntArray486[local1++] = (int) local16.aLong215;
			this.anInt5880 -= local16.anInt5153;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteBuffersARB(local1, Static298.anIntArray486, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteBuffersARB(local1, Static298.anIntArray486, 0);
			local1 = 0;
		}
		while (!this.aClass16_46.method194()) {
			local16 = (Class11_Sub33) this.aClass16_46.method180();
			Static298.anIntArray486[local1++] = (int) local16.aLong215;
			this.anInt5882 -= local16.anInt5153;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteTextures(local1, Static298.anIntArray486, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteTextures(local1, Static298.anIntArray486, 0);
			local1 = 0;
		}
		while (!this.aClass16_47.method194()) {
			local16 = (Class11_Sub33) this.aClass16_47.method180();
			Static298.anIntArray486[local1++] = local16.anInt5153;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteFramebuffersEXT(local1, Static298.anIntArray486, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteFramebuffersEXT(local1, Static298.anIntArray486, 0);
			local1 = 0;
		}
		while (!this.aClass16_48.method194()) {
			local16 = (Class11_Sub33) this.aClass16_48.method180();
			Static298.anIntArray486[local1++] = (int) local16.aLong215;
			this.anInt5887 -= local16.anInt5153;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static298.anIntArray486, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static298.anIntArray486, 0);
			local1 = 0;
		}
		while (!this.aClass16_49.method194()) {
			local16 = (Class11_Sub33) this.aClass16_49.method180();
			Static298.anIntArray486[local1++] = (int) local16.aLong215;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteProgramsARB(local1, Static298.anIntArray486, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteProgramsARB(local1, Static298.anIntArray486, 0);
		}
		while (!this.aClass16_44.method194()) {
			local16 = (Class11_Sub33) this.aClass16_44.method180();
			this.anOpengl2.glDeleteLists((int) local16.aLong215, local16.anInt5153);
		}
		while (!this.aClass16_50.method194()) {
			local16 = (Class11_Sub33) this.aClass16_50.method180();
			this.anOpengl2.glDeleteObjectARB(local16.anInt5153);
		}
		while (!this.aClass16_44.method194()) {
			local16 = (Class11_Sub33) this.aClass16_44.method180();
			this.anOpengl2.glDeleteLists((int) local16.aLong215, local16.anInt5153);
		}
		if (this.method4923() > 100663296 && Static268.method4627() > this.aLong180 + 60000L) {
			System.gc();
			this.aLong180 = Static268.method4627();
		}
		this.anInt5886 = local5;
	}

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "()V")
	@Override
	public void method5009() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "()I")
	@Override
	public int method4999() {
		@Pc(2) int local2 = this.anInt5921;
		this.anInt5921 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(IIIII)V")
	@Override
	public void method4990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5055();
		this.method5035(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!tb", name = "A", descriptor = "()Lclient!ic;")
	@Override
	public Class61 method4983() {
		return new Class61_Sub2();
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method4951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5055();
		this.method5035(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "()Z")
	@Override
	public boolean method4956() {
		return true;
	}

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "(II)V")
	public void method5090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5888 = arg0;
		this.anInt5897 = arg1;
		this.anOpengl2.glViewport(arg0, arg1, this.anInt5881, this.anInt5879);
		this.method5033();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)I")
	@Override
	public int method4938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "(I)V")
	public void method5091(@OriginalArg(0) int arg0) {
		if (this.anInt5909 != arg0) {
			this.anOpengl2.glActiveTexture(arg0 + 33984);
			this.anInt5909 = arg0;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!qe;)V")
	@Override
	public void method4973(@OriginalArg(0) Class132 arg0) {
		this.aClass132_Sub1_1 = (Class132_Sub1) arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ok;III)V")
	public void method5092(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method5059(arg0);
		arg0.method4887(arg1, arg2);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!qb;)V")
	public void method5093(@OriginalArg(0) Interface6 arg0) {
		if (this.anInterface6_6 != arg0 && this.aBoolean391) {
			this.anOpengl2.glBindBufferARB(34962, arg0.method4888());
			this.anInterface6_6 = arg0;
		}
	}

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "(I)V")
	public void method5094(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method5067(7681, 7681);
		} else if (arg0 == 1) {
			this.method5067(8448, 8448);
		} else if (arg0 == 2) {
			this.method5067(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!tb", name = "L", descriptor = "()Z")
	@Override
	public boolean method5022() {
		return true;
	}

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "()V")
	@Override
	public void method4974() {
		this.anInt5881 = this.aCanvas5.getWidth();
		this.anInt5879 = this.aCanvas5.getHeight();
		this.anOpengl2.glViewport(this.anInt5888, this.anInt5897, this.anInt5881, this.anInt5879);
		this.method5030();
		this.method4966();
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(F)V")
	public void method5095(@OriginalArg(0) float arg0) {
		if (this.aFloat69 != arg0) {
			this.aFloat69 = arg0;
			if (this.anInt5910 == 3) {
				this.method5083();
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	@Override
	public void method4919(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(II)I")
	@Override
	public int method4989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!tb", name = "ob", descriptor = "()V")
	private void method5096() {
		this.method5041();
		for (@Pc(7) int local7 = this.anInt5901 - 1; local7 >= 0; local7--) {
			this.method5091(local7);
			this.method5084(null);
			this.anOpengl2.glTexEnvi(8960, 8704, 34160);
		}
		this.method5067(8448, 8448);
		this.method5037(2, 34168, 770);
		this.method5049();
		this.anInt5896 = 1;
		this.anOpengl2.glEnable(3042);
		this.anOpengl2.glBlendFunc(770, 771);
		this.anInt5915 = 1;
		this.anOpengl2.glEnable(3008);
		this.anOpengl2.glAlphaFunc(516, 0.0F);
		this.aBoolean384 = true;
		this.anOpengl2.glColorMask(true, true, true, true);
		this.aBoolean385 = true;
		this.method5045(true);
		this.method5069(true);
		this.method5089(true);
		this.method5044(true);
		this.method5030();
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
		this.anInt5913 = this.anInt5889 = -1;
		this.method4966();
	}

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "()I")
	@Override
	public int method4976() {
		return this.anInt5918;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)V")
	@Override
	public void method5019() {
		this.aBoolean386 = true;
		this.anInt5900 = 1583160;
		this.anInt5893 = 40;
		this.method5085();
		this.method5048();
		this.aClass153_1.method4177(false, false, 3);
		this.aClass153_1.method4176(-1, true);
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(III)V")
	public void method5097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "()I")
	@Override
	public int method5016() {
		return this.anInt5902;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!mj;Lclient!mr;Lclient!ic;Lclient!vf;I)V")
	@Override
	public void method4977(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) Class10_Sub8 arg3) {
		arg0.method3139(arg2, arg3, 0);
		this.method5008(arg1);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([Lclient!mj;Lclient!ic;[Lclient!vf;I)V")
	@Override
	public void method4994(@OriginalArg(0) Class126[] arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) Class10_Sub8[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method3139(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "pb", descriptor = "()V")
	private void method5098() {
		Static298.aFloatArray24[0] = this.aFloat66 * this.aFloat68;
		Static298.aFloatArray24[1] = this.aFloat66 * this.aFloat61;
		Static298.aFloatArray24[2] = this.aFloat66 * this.aFloat57;
		Static298.aFloatArray24[3] = 1.0F;
		this.anOpengl2.glLightModelfv(2899, Static298.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[I[I)Lclient!ep;")
	@Override
	public Class66 method4957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static371.method5672(arg0, arg1, arg2, this, arg3);
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(IIII)V")
	@Override
	public void method4984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5903 < arg0) {
			this.anInt5903 = arg0;
		}
		if (this.anInt5917 > arg2) {
			this.anInt5917 = arg2;
		}
		if (this.anInt5919 < arg1) {
			this.anInt5919 = arg1;
		}
		if (this.anInt5895 > arg3) {
			this.anInt5895 = arg3;
		}
		this.anOpengl2.glEnable(3089);
		this.method5100();
		this.method5033();
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method5015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method5055();
		this.method5035(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean390) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local23);
		this.anOpengl2.glVertex2f(local16, local23);
		this.anOpengl2.glVertex2f(local16, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean390) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!tb", name = "qb", descriptor = "()V")
	private void method5099() {
		if (this.anInt5910 == 1) {
			return;
		}
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		if (this.anInt5881 > 0 && this.anInt5879 > 0) {
			this.anOpengl2.glOrtho(0.0D, (double) this.anInt5881, (double) this.anInt5879, 0.0D, -1.0D, 1.0D);
		}
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anInt5910 = 1;
		this.anInt5916 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!tb", name = "rb", descriptor = "()V")
	private void method5100() {
		this.aFloat55 = this.anInt5903 - this.anInt5914;
		this.aFloat62 = this.anInt5917 - this.anInt5914;
		this.aFloat65 = this.anInt5919 - this.anInt5907;
		this.aFloat63 = this.anInt5895 - this.anInt5907;
	}

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "(I)V")
	public synchronized void method5101(@OriginalArg(0) int arg0) {
		@Pc(4) Class11_Sub33 local4 = new Class11_Sub33(arg0);
		this.aClass16_50.method190(local4);
	}
}
