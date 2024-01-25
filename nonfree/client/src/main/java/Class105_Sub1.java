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

@OriginalClass("client!nf")
public final class Class105_Sub1 extends Class105 implements Interface3 {

	@OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
	public int anInt4167;

	@OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
	private int anInt4168;

	@OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
	public int anInt4169;

	@OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
	public int anInt4171;

	@OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
	public int anInt4172;

	@OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
	public int anInt4174;

	@OriginalMember(owner = "client!nf", name = "O", descriptor = "Lclient!ik;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!nf", name = "V", descriptor = "Z")
	public boolean aBoolean315;

	@OriginalMember(owner = "client!nf", name = "X", descriptor = "Lclient!rd;")
	public Class40_Sub2 aClass40_Sub2_1;

	@OriginalMember(owner = "client!nf", name = "Y", descriptor = "Z")
	public boolean aBoolean316;

	@OriginalMember(owner = "client!nf", name = "Z", descriptor = "I")
	private int anInt4176;

	@OriginalMember(owner = "client!nf", name = "ab", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!nf", name = "bb", descriptor = "Lclient!rd;")
	public Class40_Sub2 aClass40_Sub2_2;

	@OriginalMember(owner = "client!nf", name = "cb", descriptor = "I")
	public int anInt4177;

	@OriginalMember(owner = "client!nf", name = "db", descriptor = "I")
	private int anInt4178;

	@OriginalMember(owner = "client!nf", name = "gb", descriptor = "I")
	public int anInt4179;

	@OriginalMember(owner = "client!nf", name = "jb", descriptor = "Lclient!mb;")
	public Class31_Sub2 aClass31_Sub2_1;

	@OriginalMember(owner = "client!nf", name = "kb", descriptor = "Z")
	private boolean aBoolean318;

	@OriginalMember(owner = "client!nf", name = "mb", descriptor = "Ljava/lang/String;")
	private String aString157;

	@OriginalMember(owner = "client!nf", name = "pb", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!nf", name = "qb", descriptor = "Z")
	private boolean aBoolean319;

	@OriginalMember(owner = "client!nf", name = "rb", descriptor = "F")
	private float aFloat39;

	@OriginalMember(owner = "client!nf", name = "tb", descriptor = "I")
	private int anInt4184;

	@OriginalMember(owner = "client!nf", name = "ub", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!nf", name = "vb", descriptor = "I")
	private int anInt4185;

	@OriginalMember(owner = "client!nf", name = "wb", descriptor = "Lclient!rd;")
	public Class40_Sub2 aClass40_Sub2_3;

	@OriginalMember(owner = "client!nf", name = "zb", descriptor = "I")
	private int anInt4187;

	@OriginalMember(owner = "client!nf", name = "Ab", descriptor = "I")
	public int anInt4188;

	@OriginalMember(owner = "client!nf", name = "Bb", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!nf", name = "Cb", descriptor = "Z")
	private boolean aBoolean321;

	@OriginalMember(owner = "client!nf", name = "Eb", descriptor = "Lclient!rd;")
	public Class40_Sub2 aClass40_Sub2_4;

	@OriginalMember(owner = "client!nf", name = "Fb", descriptor = "Lclient!mb;")
	public Class31_Sub2 aClass31_Sub2_2;

	@OriginalMember(owner = "client!nf", name = "Gb", descriptor = "I")
	private int anInt4189;

	@OriginalMember(owner = "client!nf", name = "Hb", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!nf", name = "Kb", descriptor = "Z")
	private boolean aBoolean322;

	@OriginalMember(owner = "client!nf", name = "Lb", descriptor = "Lclient!rd;")
	public Class40_Sub2 aClass40_Sub2_5;

	@OriginalMember(owner = "client!nf", name = "Pb", descriptor = "Lclient!ir;")
	public Class44_Sub1 aClass44_Sub1_4;

	@OriginalMember(owner = "client!nf", name = "Qb", descriptor = "Lclient!ej;")
	public Class57 aClass57_3;

	@OriginalMember(owner = "client!nf", name = "Rb", descriptor = "Z")
	public boolean aBoolean323;

	@OriginalMember(owner = "client!nf", name = "Sb", descriptor = "I")
	private int anInt4191;

	@OriginalMember(owner = "client!nf", name = "Tb", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!nf", name = "Ub", descriptor = "Z")
	public boolean aBoolean324;

	@OriginalMember(owner = "client!nf", name = "Vb", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!nf", name = "Zb", descriptor = "Lclient!na;")
	private Interface9 anInterface9_4;

	@OriginalMember(owner = "client!nf", name = "ac", descriptor = "Z")
	private boolean aBoolean325;

	@OriginalMember(owner = "client!nf", name = "dc", descriptor = "Z")
	public boolean aBoolean328;

	@OriginalMember(owner = "client!nf", name = "ec", descriptor = "Lclient!ko;")
	private Interface8 anInterface8_4;

	@OriginalMember(owner = "client!nf", name = "gc", descriptor = "Z")
	private boolean aBoolean329;

	@OriginalMember(owner = "client!nf", name = "jc", descriptor = "F")
	private float aFloat49;

	@OriginalMember(owner = "client!nf", name = "kc", descriptor = "Z")
	private boolean aBoolean330;

	@OriginalMember(owner = "client!nf", name = "nc", descriptor = "I")
	private int anInt4197;

	@OriginalMember(owner = "client!nf", name = "oc", descriptor = "Lclient!ir;")
	public Class44_Sub1 aClass44_Sub1_5;

	@OriginalMember(owner = "client!nf", name = "sc", descriptor = "I")
	private int anInt4200;

	@OriginalMember(owner = "client!nf", name = "uc", descriptor = "F")
	private float aFloat51;

	@OriginalMember(owner = "client!nf", name = "wc", descriptor = "[Lclient!me;")
	private Class44[] aClass44Array1;

	@OriginalMember(owner = "client!nf", name = "xc", descriptor = "Z")
	private boolean aBoolean332;

	@OriginalMember(owner = "client!nf", name = "zc", descriptor = "J")
	private long aLong121;

	@OriginalMember(owner = "client!nf", name = "Ac", descriptor = "Lclient!rd;")
	public Class40_Sub2 aClass40_Sub2_6;

	@OriginalMember(owner = "client!nf", name = "Fc", descriptor = "Z")
	private boolean aBoolean333;

	@OriginalMember(owner = "client!nf", name = "Gc", descriptor = "Lclient!gd;")
	private Class78_Sub1 aClass78_Sub1_1;

	@OriginalMember(owner = "client!nf", name = "Hc", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!nf", name = "Jc", descriptor = "Ljava/lang/String;")
	private String aString158;

	@OriginalMember(owner = "client!nf", name = "Lc", descriptor = "Lclient!ir;")
	public Class44_Sub1 aClass44_Sub1_6;

	@OriginalMember(owner = "client!nf", name = "Mc", descriptor = "Z")
	public boolean aBoolean334;

	@OriginalMember(owner = "client!nf", name = "Oc", descriptor = "Lclient!ko;")
	public Interface8 anInterface8_5;

	@OriginalMember(owner = "client!nf", name = "Pc", descriptor = "Z")
	private boolean aBoolean335;

	@OriginalMember(owner = "client!nf", name = "Qc", descriptor = "Lclient!dh;")
	private Class44_Sub1_Sub1 aClass44_Sub1_Sub1_5;

	@OriginalMember(owner = "client!nf", name = "Uc", descriptor = "I")
	private int anInt4209;

	@OriginalMember(owner = "client!nf", name = "Vc", descriptor = "I")
	private int anInt4210;

	@OriginalMember(owner = "client!nf", name = "A", descriptor = "Lclient!sb;")
	private final Class180 aClass180_1 = new Class180();

	@OriginalMember(owner = "client!nf", name = "B", descriptor = "Lclient!vj;")
	private final Class31 aClass31_5 = new Class31_Sub2();

	@OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
	public final int anInt4170 = 8;

	@OriginalMember(owner = "client!nf", name = "F", descriptor = "[Lclient!ik;")
	private final Interface3[] anInterface3Array1 = new Interface3[4];

	@OriginalMember(owner = "client!nf", name = "K", descriptor = "Z")
	private boolean aBoolean314 = false;

	@OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
	public final int anInt4173 = 3;

	@OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
	private int anInt4175 = -1;

	@OriginalMember(owner = "client!nf", name = "I", descriptor = "Lclient!ar;")
	private final Class14 aClass14_15 = new Class14();

	@OriginalMember(owner = "client!nf", name = "P", descriptor = "Lclient!ar;")
	private final Class14 aClass14_16 = new Class14();

	@OriginalMember(owner = "client!nf", name = "Q", descriptor = "Lclient!ar;")
	private final Class14 aClass14_17 = new Class14();

	@OriginalMember(owner = "client!nf", name = "R", descriptor = "Lclient!ar;")
	private final Class14 aClass14_18 = new Class14();

	@OriginalMember(owner = "client!nf", name = "S", descriptor = "Lclient!ar;")
	private final Class14 aClass14_19 = new Class14();

	@OriginalMember(owner = "client!nf", name = "T", descriptor = "Lclient!ar;")
	private final Class14 aClass14_20 = new Class14();

	@OriginalMember(owner = "client!nf", name = "U", descriptor = "Lclient!ar;")
	private final Class14 aClass14_21 = new Class14();

	@OriginalMember(owner = "client!nf", name = "ib", descriptor = "I")
	private int anInt4181 = 0;

	@OriginalMember(owner = "client!nf", name = "nb", descriptor = "I")
	public int anInt4182 = 512;

	@OriginalMember(owner = "client!nf", name = "Ib", descriptor = "F")
	public float aFloat43 = 1.0F;

	@OriginalMember(owner = "client!nf", name = "Mb", descriptor = "[F")
	public final float[] aFloatArray12 = new float[4];

	@OriginalMember(owner = "client!nf", name = "sb", descriptor = "I")
	private int anInt4183 = 0;

	@OriginalMember(owner = "client!nf", name = "eb", descriptor = "F")
	public float aFloat36 = -1.0F;

	@OriginalMember(owner = "client!nf", name = "W", descriptor = "[F")
	private final float[] aFloatArray10 = new float[4];

	@OriginalMember(owner = "client!nf", name = "fc", descriptor = "F")
	private float aFloat47 = 1.0F;

	@OriginalMember(owner = "client!nf", name = "hb", descriptor = "I")
	private int anInt4180 = 0;

	@OriginalMember(owner = "client!nf", name = "hc", descriptor = "F")
	public float aFloat48 = 3584.0F;

	@OriginalMember(owner = "client!nf", name = "ob", descriptor = "F")
	private float aFloat37 = 0.0F;

	@OriginalMember(owner = "client!nf", name = "ic", descriptor = "I")
	private int anInt4194 = 8448;

	@OriginalMember(owner = "client!nf", name = "xb", descriptor = "I")
	private int anInt4186 = -1;

	@OriginalMember(owner = "client!nf", name = "Yb", descriptor = "I")
	private int anInt4193 = 8448;

	@OriginalMember(owner = "client!nf", name = "rc", descriptor = "I")
	public int anInt4199 = 512;

	@OriginalMember(owner = "client!nf", name = "Jb", descriptor = "F")
	private float aFloat44 = 1.0F;

	@OriginalMember(owner = "client!nf", name = "tc", descriptor = "I")
	public int anInt4201 = 3584;

	@OriginalMember(owner = "client!nf", name = "mc", descriptor = "I")
	public int anInt4196 = 0;

	@OriginalMember(owner = "client!nf", name = "Nb", descriptor = "[F")
	private final float[] aFloatArray13 = new float[4];

	@OriginalMember(owner = "client!nf", name = "Db", descriptor = "[F")
	private final float[] aFloatArray11 = new float[16];

	@OriginalMember(owner = "client!nf", name = "pc", descriptor = "I")
	public int anInt4198 = 50;

	@OriginalMember(owner = "client!nf", name = "Ob", descriptor = "I")
	public int anInt4190 = 0;

	@OriginalMember(owner = "client!nf", name = "Wb", descriptor = "[F")
	private final float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!nf", name = "Ec", descriptor = "F")
	public float aFloat54 = 1.0F;

	@OriginalMember(owner = "client!nf", name = "yc", descriptor = "I")
	private int anInt4202 = -1;

	@OriginalMember(owner = "client!nf", name = "Cc", descriptor = "F")
	public float aFloat52 = -1.0F;

	@OriginalMember(owner = "client!nf", name = "vc", descriptor = "Z")
	private boolean aBoolean331 = true;

	@OriginalMember(owner = "client!nf", name = "lc", descriptor = "I")
	public int anInt4195 = -1;

	@OriginalMember(owner = "client!nf", name = "Xb", descriptor = "I")
	private int anInt4192 = 0;

	@OriginalMember(owner = "client!nf", name = "Kc", descriptor = "I")
	private int anInt4205 = 0;

	@OriginalMember(owner = "client!nf", name = "Bc", descriptor = "I")
	private int anInt4203 = 0;

	@OriginalMember(owner = "client!nf", name = "qc", descriptor = "F")
	public float aFloat50 = 1.0F;

	@OriginalMember(owner = "client!nf", name = "Dc", descriptor = "F")
	public float aFloat53 = 3584.0F;

	@OriginalMember(owner = "client!nf", name = "Rc", descriptor = "I")
	private int anInt4207 = 0;

	@OriginalMember(owner = "client!nf", name = "Sc", descriptor = "I")
	public int anInt4208 = -1;

	@OriginalMember(owner = "client!nf", name = "Nc", descriptor = "I")
	public int anInt4206 = -1;

	@OriginalMember(owner = "client!nf", name = "u", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas3;

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "Lclient!fh;")
	public final Interface2 anInterface2_3;

	@OriginalMember(owner = "client!nf", name = "x", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl1;

	@OriginalMember(owner = "client!nf", name = "Ic", descriptor = "I")
	public final int anInt4204;

	@OriginalMember(owner = "client!nf", name = "lb", descriptor = "Z")
	private boolean lb;

	@OriginalMember(owner = "client!nf", name = "Tc", descriptor = "Z")
	public boolean aBoolean336;

	@OriginalMember(owner = "client!nf", name = "cc", descriptor = "Z")
	public boolean aBoolean327;

	@OriginalMember(owner = "client!nf", name = "fb", descriptor = "Z")
	public boolean aBoolean317;

	@OriginalMember(owner = "client!nf", name = "yb", descriptor = "Z")
	private boolean aBoolean320;

	@OriginalMember(owner = "client!nf", name = "bc", descriptor = "Z")
	public boolean aBoolean326;

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "Lclient!tc;")
	public final Class191 aClass191_1;

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "Lclient!lk;")
	private final Class132 aClass132_1;

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "Lclient!q;")
	private final Class164 aClass164_1;

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "Lclient!g;")
	private final Class1_Sub15_Sub1 aClass1_Sub15_Sub1_1;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fh;IILclient!wd;)V")
	public Class105_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class215 arg4) {
		this.aCanvas3 = arg0;
		this.anInterface2_3 = arg1;
		this.anInt4861 = arg2;
		@Pc(186) int local186 = 0;
		while (!this.aCanvas3.isShowing()) {
			if (local186++ > 5) {
				throw new RuntimeException("");
			}
			Static163.method2863(1000L);
		}
		this.aCanvas3.setIgnoreRepaint(true);
		try {
			if (Static198.aBoolean313 == null || !Static198.aBoolean313) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static198.aBoolean313 = Boolean.TRUE;
				} else {
					@Pc(220) Class193 local220 = arg4.method5679(this.getClass());
					while (local220.anInt5986 == 0) {
						Static163.method2863(100L);
					}
					if (local220.anInt5986 == 1) {
						Static198.aBoolean313 = Boolean.TRUE;
					}
				}
			}
			if (Static198.aBoolean313 == null || !Static198.aBoolean313) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas3, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method3609();
				this.anOpengl1 = this.aContext1.getGL();
				@Pc(287) int local287 = this.method3626();
				if (local287 != 0) {
					throw new RuntimeException("");
				}
				this.anInt4204 = this.aBoolean316 ? 33639 : 5121;
				@Pc(306) String local306 = this.aString158.toLowerCase();
				@Pc(310) String local310 = this.aString157.toLowerCase();
				if (local310.indexOf("radeon") != -1) {
					@Pc(317) int local317 = 0;
					@Pc(319) boolean local319 = false;
					@Pc(321) boolean local321 = false;
					@Pc(329) String[] local329 = Static183.method3233(local310.replace('/', ' '), ' ');
					for (@Pc(331) int local331 = 0; local331 < local329.length; local331++) {
						@Pc(339) String local339 = local329[local331];
						try {
							if (local339.length() > 0) {
								if (local339.charAt(0) == 'x' && local339.length() >= 3 && Static35.method681(local339.substring(1, 3))) {
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
									if (local339.length() >= 4 && Static35.method681(local339.substring(0, 4))) {
										local317 = Static38.method2707(local339.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(403) Exception local403) {
						}
					}
					if (!local321 && !local319) {
						if (local317 >= 7000 && local317 <= 7999) {
							this.lb = false;
						}
						if (local317 >= 7000 && local317 <= 9250) {
							this.aBoolean336 = false;
						}
					}
					if (!local319 || local317 < 4000) {
						this.aBoolean327 = false;
					}
					this.aBoolean317 &= this.anOpengl1.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean320 = this.lb;
				}
				if (local306.contains("intel")) {
					this.aBoolean326 = false;
				}
				if (this.lb) {
					try {
						@Pc(461) int[] local461 = new int[1];
						this.anOpengl1.glGenBuffersARB(1, local461, 0);
					} catch (@Pc(469) Throwable local469) {
						throw new RuntimeException("", local469);
					}
				}
				this.method3614(this);
				this.method4215();
				this.method3593();
				new Class76(this);
				this.aClass191_1 = new Class191(this, this.anInterface2_3);
				Static91.method1443(true);
				this.aBoolean314 = true;
				this.aClass132_1 = new Class132(this);
				this.aClass164_1 = new Class164(this);
				this.aClass1_Sub15_Sub1_1 = new Class1_Sub15_Sub1(this);
				this.method3601();
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
						Static163.method2863(100L);
					}
				}
				this.anOpengl1.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(553) Throwable local553) {
			local553.printStackTrace();
			this.method4206();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local553);
		}
	}

	@OriginalMember(owner = "client!nf", name = "H", descriptor = "()F")
	@Override
	public float method4294() {
		return this.aFloat35;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I")
	@Override
	public int method4214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!nf", name = "M", descriptor = "()V")
	private void method3560() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!nf", name = "N", descriptor = "()V")
	public void method3561() {
		if (this.anInt4191 == 8) {
			return;
		}
		this.method3610();
		this.method3594(true);
		this.method3621(true);
		this.method3589(true);
		this.method3603(1);
		this.method3618(1);
		this.anInt4191 = 8;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method4302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass44_Sub1_Sub1_5 == null || this.aClass44_Sub1_Sub1_5.anInt1285 < arg2 || this.aClass44_Sub1_Sub1_5.anInt1287 < arg3) {
			this.aClass44_Sub1_Sub1_5 = Static358.method1074(arg6, this, arg2, arg3);
			this.aClass44_Sub1_Sub1_5.method1072(false, false);
			local32 = this.aClass44_Sub1_Sub1_5.aFloat6;
			local36 = this.aClass44_Sub1_Sub1_5.aFloat5;
		} else {
			this.aClass44_Sub1_Sub1_5.method1071(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass44_Sub1_Sub1_5.aFloat6 * (float) arg3 / (float) this.aClass44_Sub1_Sub1_5.anInt1287;
			local36 = this.aClass44_Sub1_Sub1_5.aFloat5 * (float) arg2 / (float) this.aClass44_Sub1_Sub1_5.anInt1285;
		}
		this.method3592();
		this.method3591(this.aClass44_Sub1_Sub1_5);
		this.method3603(arg8);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method3627(arg5);
		this.method3562(34165, 34165);
		this.method3568(0, 34166, 768);
		this.method3568(2, 5890, 770);
		this.method3628(0, 34166);
		this.method3628(2, 5890);
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
		this.method3568(0, 5890, 768);
		this.method3568(2, 34166, 770);
		this.method3628(0, 5890);
		this.method3628(2, 34166);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([IIIII)Lclient!cq;")
	@Override
	public Class8 method4257(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class8_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "()Z")
	@Override
	public boolean method4219() {
		return false;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[Lclient!wc;)V")
	@Override
	public void method4242(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub19[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class1_Sub19 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static198.aFloatArray9[0] = local8.anInt2482;
			Static198.aFloatArray9[1] = local8.anInt2481;
			Static198.aFloatArray9[2] = local8.anInt2484;
			Static198.aFloatArray9[3] = 1.0F;
			this.anOpengl1.glLightfv(local12, 4611, Static198.aFloatArray9, 0);
			@Pc(44) int local44 = local8.anInt2483;
			@Pc(49) float local49 = local8.aFloat15 / 255.0F;
			Static198.aFloatArray9[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static198.aFloatArray9[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static198.aFloatArray9[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl1.glLightfv(local12, 4609, Static198.aFloatArray9, 0);
			this.anOpengl1.glLightf(local12, 4617, 1.0F / (float) (local8.anInt2479 * local8.anInt2479));
			this.anOpengl1.glEnable(local12);
		}
		while (local1 < this.anInt4203) {
			this.anOpengl1.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt4203 = arg0;
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(II)V")
	public void method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4176 != 0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt4194 != arg0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anInt4194 = arg0;
			local4 = true;
		}
		if (this.anInt4193 != arg1) {
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			this.anInt4193 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt4191 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "(I)I")
	public int method3563(@OriginalArg(0) int arg0) {
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
			return 0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!na;")
	public Interface9 method3564(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface9) (this.lb ? new Class80_Sub2(this, arg0, arg1, false) : new Class18_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!nf", name = "O", descriptor = "()V")
	private void method3565() {
		if (this.aBoolean330 && this.aBoolean323 | this.anInt4208 >= 0) {
			this.anOpengl1.glEnable(2912);
		} else {
			this.anOpengl1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "(II)V")
	public synchronized void method3566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub14 local4 = new Class1_Sub14(arg1);
		local4.aLong214 = arg0;
		this.aClass14_16.method300(local4);
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method4249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method3631();
		this.method3603(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean329) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local19);
		this.anOpengl1.glVertex2f(local14, local19);
		this.anOpengl1.glVertex2f(local14, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean329) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!nf", name = "P", descriptor = "()V")
	public void method3567() {
		this.anOpengl1.glLightfv(16384, 4611, this.aFloatArray14, 0);
		this.anOpengl1.glLightfv(16385, 4611, this.aFloatArray10, 0);
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(III)V")
	public void method3568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!gm;)V")
	public void method3569(@OriginalArg(0) Class84 arg0) {
		this.anOpengl1.glEnableClientState(32886);
		arg0.method1630();
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(Z)V")
	public void method3570(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean332) {
			this.aBoolean332 = arg0;
			this.method3619();
			this.anInt4191 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!mb;)V")
	public void method3571(@OriginalArg(0) Class31_Sub2 arg0) {
		this.anOpengl1.glPushMatrix();
		this.anOpengl1.glMultMatrixf(arg0.method3191(), 0);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
	@Override
	public void method4208(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(III)V")
	public void method3572(@OriginalArg(2) int arg0) {
		this.anOpengl1.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "()Z")
	@Override
	public boolean method4237() {
		return this.aBoolean329;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(FFF)V")
	private void method3573(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl1.glMatrixMode(5890);
		if (this.aBoolean335) {
			this.anOpengl1.glLoadIdentity();
		}
		this.anOpengl1.glTranslatef(arg0, arg1, arg2);
		this.anOpengl1.glMatrixMode(5888);
		this.aBoolean335 = true;
	}

	@OriginalMember(owner = "client!nf", name = "Q", descriptor = "()V")
	public void method3574() {
		this.anOpengl1.glPopMatrix();
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)I")
	@Override
	public int method4223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "(I)V")
	public synchronized void method3575(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub14 local4 = new Class1_Sub14(arg0);
		this.aClass14_21.method300(local4);
	}

	@OriginalMember(owner = "client!nf", name = "y", descriptor = "()Lclient!vj;")
	@Override
	public Class31 method4267() {
		return new Class31_Sub2();
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(FF)V")
	public void method3576(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat44 = arg0;
		this.aFloat37 = arg1;
		if (!this.aBoolean323) {
			this.method3623();
		}
	}

	@OriginalMember(owner = "client!nf", name = "J", descriptor = "()I")
	@Override
	public int method4297() {
		return this.anInt4201;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!vj;)V")
	@Override
	public void method4213(@OriginalArg(0) Class31 arg0) {
		this.aClass31_Sub2_2 = (Class31_Sub2) arg0;
		this.aClass31_Sub2_1.method3189(this.aClass31_Sub2_2);
		if (this.anInt4184 != 1) {
			this.method3620();
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	@Override
	public void method4205(@OriginalArg(0) int arg0) {
		this.method3609();
	}

	@OriginalMember(owner = "client!nf", name = "R", descriptor = "()V")
	private void method3577() {
		this.aFloat48 = (this.aFloatArray11[14] - (float) this.anInt4201) / this.aFloatArray11[10];
		this.aFloat53 = (float) this.anInt4201 - this.aFloat41;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(Lclient!gm;)V")
	public void method3578(@OriginalArg(0) Class84 arg0) {
		this.anOpengl1.glEnableClientState(32884);
		arg0.method1633();
	}

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "()V")
	@Override
	public void method4233() {
		this.anInt4183 = 0;
		this.anInt4192 = 0;
		this.anInt4205 = this.anInt4171;
		this.anInt4181 = this.anInt4172;
		this.anOpengl1.glDisable(3089);
		this.method3608();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!dc;Lclient!op;Lclient!vj;Lclient!kd;I)V")
	@Override
	public void method4276(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class153 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class7_Sub6 arg3) {
		arg0.method4587(arg2, arg3, 0);
		this.method4240(arg1);
	}

	@OriginalMember(owner = "client!nf", name = "S", descriptor = "()V")
	public void method3579() {
		if (this.anInt4191 == 16) {
			return;
		}
		this.method3597();
		this.method3594(true);
		this.method3621(true);
		this.method3589(true);
		this.method3603(1);
		this.method3618(1);
		this.anInt4191 = 16;
	}

	@OriginalMember(owner = "client!nf", name = "T", descriptor = "()Lclient!ik;")
	public Interface3 method3580() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "(I)V")
	public synchronized void method3581(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub14 local4 = new Class1_Sub14(arg0);
		this.aClass14_18.method300(local4);
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(Lclient!gm;)V")
	public void method3582(@OriginalArg(0) Class84 arg0) {
		this.anOpengl1.glEnableClientState(32885);
		arg0.method1632();
	}

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "(I)I")
	public int method3583(@OriginalArg(0) int arg0) {
		if (arg0 == 5121 || arg0 == 5120) {
			return 1;
		} else if (arg0 == 5123 || arg0 == 5122) {
			return 2;
		} else if (arg0 == 5125 || arg0 == 5124 || arg0 == 5126) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "U", descriptor = "()V")
	private void method3584() {
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadMatrixf(this.aFloatArray11, 0);
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!nf", name = "V", descriptor = "()V")
	private void method3585() {
		this.anOpengl1.glDepthMask(this.aBoolean318 && this.aBoolean331);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFF)V")
	public void method3586(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static198.aFloatArray8[0] = arg0;
		Static198.aFloatArray8[1] = arg1;
		Static198.aFloatArray8[2] = arg2;
		Static198.aFloatArray8[3] = arg3;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static198.aFloatArray8, 0);
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(F)V")
	public void method3587(@OriginalArg(0) float arg0) {
		if (this.aFloat47 != arg0) {
			this.aFloat47 = arg0;
			if (this.anInt4184 == 3) {
				this.method3632();
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIZ)Lclient!cq;")
	@Override
	public Class8 method4228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class8_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nf", name = "W", descriptor = "()Lclient!vm;")
	public Class44_Sub4 method3588() {
		return this.aClass78_Sub1_1 == null ? null : this.aClass78_Sub1_1.method4488();
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIII)V")
	@Override
	public void method4265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4183 < arg0) {
			this.anInt4183 = arg0;
		}
		if (this.anInt4205 > arg2) {
			this.anInt4205 = arg2;
		}
		if (this.anInt4192 < arg1) {
			this.anInt4192 = arg1;
		}
		if (this.anInt4181 > arg3) {
			this.anInt4181 = arg3;
		}
		this.anOpengl1.glEnable(3089);
		this.method3608();
		this.method3622();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3631();
		this.method3603(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(Z)V")
	public void method3589(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean318) {
			this.aBoolean318 = arg0;
			this.method3585();
			this.anInt4191 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ko;III)V")
	public void method3590(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3616(arg0);
		arg0.method1582(arg1, arg2);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!me;)V")
	public void method3591(@OriginalArg(0) Class44 arg0) {
		@Pc(5) Class44 local5 = this.aClass44Array1[this.anInt4176];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl1.glDisable(local5.anInt6476);
			} else {
				if (local5 == null) {
					this.anOpengl1.glEnable(arg0.anInt6476);
				} else if (arg0.anInt6476 != local5.anInt6476) {
					this.anOpengl1.glDisable(local5.anInt6476);
					this.anOpengl1.glEnable(arg0.anInt6476);
				}
				this.anOpengl1.glBindTexture(arg0.anInt6476, arg0.method5569());
			}
			this.aClass44Array1[this.anInt4176] = arg0;
		}
		this.anInt4191 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "()V")
	@Override
	public void method4215() {
		this.anInt4171 = this.aCanvas3.getWidth();
		this.anInt4172 = this.aCanvas3.getHeight();
		this.anOpengl1.glViewport(this.anInt4180, this.anInt4207, this.anInt4171, this.anInt4172);
		this.method3596();
		this.method4233();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!hs;)V")
	@Override
	public void method4256(@OriginalArg(0) Class78 arg0) {
		this.aClass78_Sub1_1 = (Class78_Sub1) arg0;
	}

	@OriginalMember(owner = "client!nf", name = "X", descriptor = "()V")
	public void method3592() {
		if (this.anInt4191 == 2) {
			return;
		}
		this.method3617();
		this.method3594(false);
		this.method3570(false);
		this.method3621(false);
		this.method3589(false);
		this.method3613();
		this.anInt4191 = 2;
	}

	@OriginalMember(owner = "client!nf", name = "Y", descriptor = "()V")
	private void method3593() {
		this.aClass31_Sub2_2 = new Class31_Sub2();
		this.aClass31_Sub2_1 = new Class31_Sub2();
		this.aClass44Array1 = new Class44[this.anInt4177];
		this.aClass44_Sub1_6 = new Class44_Sub1(this, 3553, 6408, 1, 1);
		this.aClass44_Sub1_4 = new Class44_Sub1(this, 3553, 6408, 1, 1);
		this.aClass44_Sub1_5 = new Class44_Sub1(this, 3553, 6408, 1, 1);
		this.aClass40_Sub2_4 = new Class40_Sub2(this);
		this.aClass40_Sub2_5 = new Class40_Sub2(this);
		this.aClass40_Sub2_1 = new Class40_Sub2(this);
		this.aClass40_Sub2_6 = new Class40_Sub2(this);
		this.aClass40_Sub2_2 = new Class40_Sub2(this);
		this.aClass40_Sub2_3 = new Class40_Sub2(this);
		this.anInterface8_5 = this.method3598(null, 1024, true);
		if (this.aBoolean326) {
			this.aClass57_3 = new Class57(this);
		}
		this.aClass180_1.method4898(this);
	}

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "(Z)V")
	public void method3594(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean330) {
			this.aBoolean330 = arg0;
			this.method3565();
			this.anInt4191 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "(I)V")
	public synchronized void method3595(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub14 local4 = new Class1_Sub14(arg0);
		this.aClass14_20.method300(local4);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([I)V")
	@Override
	public void method4292(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4183;
		arg0[1] = this.anInt4192;
		arg0[2] = this.anInt4205;
		arg0[3] = this.anInt4181;
	}

	@OriginalMember(owner = "client!nf", name = "Z", descriptor = "()V")
	public void method3596() {
		if (this.anInt4184 != 0) {
			this.anInt4184 = 0;
			this.anInt4191 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "x", descriptor = "()I")
	@Override
	public int method4266() {
		@Pc(2) int local2 = this.anInt4209;
		this.anInt4209 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([Lclient!dc;Lclient!vj;[Lclient!kd;I)V")
	@Override
	public void method4289(@OriginalArg(0) Class40[] arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class7_Sub6[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method4587(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "ab", descriptor = "()V")
	private void method3597() {
		if (this.anInt4184 != 3) {
			this.anInt4184 = 3;
			this.method3632();
			this.method3620();
			this.anInt4191 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!hs;Lclient!hs;FLclient!hs;)Lclient!hs;")
	@Override
	public Class78 method4221(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class78 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean315 && this.aBoolean326) {
			@Pc(11) Class78_Sub1_Sub2 local11 = null;
			@Pc(14) Class78_Sub1 local14 = (Class78_Sub1) arg0;
			@Pc(17) Class78_Sub1 local17 = (Class78_Sub1) arg1;
			@Pc(21) Class44_Sub4 local21 = local14.method4488();
			@Pc(25) Class44_Sub4 local25 = local17.method4488();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt6479 > local25.anInt6479 ? local21.anInt6479 : local25.anInt6479;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class78_Sub1_Sub2) {
					@Pc(52) Class78_Sub1_Sub2 local52 = (Class78_Sub1_Sub2) arg3;
					if (local52.method4490() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class78_Sub1_Sub2(this, local40);
				}
				local11.method4489(local21, arg2, local25);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
	@Override
	public void method4211(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!cl;[Lclient!up;Z)Lclient!wl;")
	@Override
	public Class29 method4264(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class201[] arg1) {
		return new Class29_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!nf", name = "B", descriptor = "()Z")
	@Override
	public boolean method4274() {
		return true;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(III)V")
	@Override
	public void method4263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean323) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt4186 = arg1;
		this.anInt4206 = arg2;
		this.method3623();
		this.aClass132_1.method2998(arg0, true);
	}

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)V")
	@Override
	public void method4295(@OriginalArg(0) int arg0) {
		this.method3603(0);
		this.anOpengl1.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl1.glClear(16384);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[BIZ)Lclient!ko;")
	public Interface8 method3598(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface8) (this.lb && (!arg2 || this.aBoolean320) ? new Class80_Sub1(this, 5123, arg0, arg1, arg2) : new Class18_Sub1(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[[I[[IIII)Lclient!ck;")
	@Override
	public Class12 method4231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class12_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!nf", name = "bb", descriptor = "()V")
	public void method3599() {
		if (this.anInt4191 == 4) {
			return;
		}
		this.method3617();
		this.method3594(false);
		this.method3570(false);
		this.method3621(false);
		this.method3589(false);
		this.method3613();
		this.method3603(1);
		this.method3618(1);
		this.anInt4191 = 4;
	}

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "(II)V")
	public synchronized void method3600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub14 local4 = new Class1_Sub14(arg1);
		local4.aLong214 = arg0;
		this.aClass14_17.method300(local4);
	}

	@OriginalMember(owner = "client!nf", name = "cb", descriptor = "()V")
	private void method3601() {
		this.method3613();
		for (@Pc(7) int local7 = this.anInt4177 - 1; local7 >= 0; local7--) {
			this.method3634(local7);
			this.method3591(null);
			this.anOpengl1.glTexEnvi(8960, 8704, 34160);
		}
		this.method3562(8448, 8448);
		this.method3568(2, 34168, 770);
		this.method3605();
		this.anOpengl1.glEnable(3042);
		this.anOpengl1.glBlendFunc(770, 771);
		this.anInt4187 = 1;
		this.anOpengl1.glEnable(3008);
		this.anOpengl1.glAlphaFunc(516, 0.0F);
		this.aBoolean322 = true;
		this.anOpengl1.glColorMask(true, true, true, true);
		this.aBoolean325 = true;
		this.anInt4185 = 1;
		this.method3594(true);
		this.method3570(true);
		this.method3621(true);
		this.method3589(true);
		this.method3596();
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
		this.anInt4202 = this.anInt4195 = -1;
		this.method4233();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([Lclient!dc;Lclient!op;Lclient!vj;[Lclient!kd;I)V")
	@Override
	public void method4220(@OriginalArg(0) Class40[] arg0, @OriginalArg(1) Class153 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class7_Sub6[] arg3, @OriginalArg(4) int arg4) {
		this.method4289(arg0, arg2, arg3, arg4);
		this.method4240(arg1);
	}

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "(I)Lclient!tr;")
	@Override
	public Class1_Sub41 method4306() {
		return null;
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "()V")
	@Override
	protected void method4206() {
		if (this.anOpengl1 != null) {
			try {
				this.aClass164_1.method4354();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl1 = null;
		}
		if (this.aContext1 != null) {
			this.method3560();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean314) {
			Static294.method5154(true);
			this.aBoolean314 = false;
		}
	}

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "()Z")
	@Override
	public boolean method4224() {
		return false;
	}

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "(Z)V")
	public void method3602(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean333) {
			this.aBoolean333 = arg0;
			this.method3619();
		}
	}

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "()V")
	@Override
	public void method4246() {
		this.method3589(true);
		this.anOpengl1.glClear(256);
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(Z)V")
	@Override
	public void method4280(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method4290(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class1_Sub14 local16;
		while (!this.aClass14_16.method308()) {
			local16 = (Class1_Sub14) this.aClass14_16.method310();
			Static198.anIntArray390[local1++] = (int) local16.aLong214;
			this.anInt4174 -= local16.anInt1474;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteBuffersARB(local1, Static198.anIntArray390, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteBuffersARB(local1, Static198.anIntArray390, 0);
			local1 = 0;
		}
		while (!this.aClass14_17.method308()) {
			local16 = (Class1_Sub14) this.aClass14_17.method310();
			Static198.anIntArray390[local1++] = (int) local16.aLong214;
			this.anInt4169 -= local16.anInt1474;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteTextures(local1, Static198.anIntArray390, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteTextures(local1, Static198.anIntArray390, 0);
			local1 = 0;
		}
		while (!this.aClass14_18.method308()) {
			local16 = (Class1_Sub14) this.aClass14_18.method310();
			Static198.anIntArray390[local1++] = local16.anInt1474;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteFramebuffersEXT(local1, Static198.anIntArray390, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteFramebuffersEXT(local1, Static198.anIntArray390, 0);
			local1 = 0;
		}
		while (!this.aClass14_19.method308()) {
			local16 = (Class1_Sub14) this.aClass14_19.method310();
			Static198.anIntArray390[local1++] = (int) local16.aLong214;
			this.anInt4168 -= local16.anInt1474;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static198.anIntArray390, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static198.anIntArray390, 0);
			local1 = 0;
		}
		while (!this.aClass14_20.method308()) {
			local16 = (Class1_Sub14) this.aClass14_20.method310();
			Static198.anIntArray390[local1++] = (int) local16.aLong214;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteProgramsARB(local1, Static198.anIntArray390, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteProgramsARB(local1, Static198.anIntArray390, 0);
		}
		while (!this.aClass14_15.method308()) {
			local16 = (Class1_Sub14) this.aClass14_15.method310();
			this.anOpengl1.glDeleteLists((int) local16.aLong214, local16.anInt1474);
		}
		while (!this.aClass14_21.method308()) {
			local16 = (Class1_Sub14) this.aClass14_21.method310();
			this.anOpengl1.glDeleteObjectARB(local16.anInt1474);
		}
		while (!this.aClass14_15.method308()) {
			local16 = (Class1_Sub14) this.aClass14_15.method310();
			this.anOpengl1.glDeleteLists((int) local16.aLong214, local16.anInt1474);
		}
		if (this.method4288() > 100663296 && Static292.method5114() > this.aLong121 + 60000L) {
			System.gc();
			this.aLong121 = Static292.method5114();
		}
		this.anInt4167 = local5;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!op;)V")
	@Override
	public void method4240(@OriginalArg(0) Class153 arg0) {
		this.aClass180_1.method4900(this, arg0);
	}

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "(I)V")
	public void method3603(@OriginalArg(0) int arg0) {
		if (this.anInt4185 == arg0) {
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
		if (local10 != this.aBoolean325) {
			this.anOpengl1.glColorMask(local10, local10, local10, true);
			this.aBoolean325 = local10;
		}
		if (local12 != this.aBoolean322) {
			if (local12) {
				this.anOpengl1.glEnable(3008);
			} else {
				this.anOpengl1.glDisable(3008);
			}
			this.aBoolean322 = local12;
		}
		if (local8 != this.anInt4187) {
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
			this.anInt4187 = local8;
		}
		this.anInt4185 = arg0;
		this.anInt4191 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4287(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static95.aFloat10 = arg0;
		Static95.aFloat12 = arg1;
		Static95.aFloat11 = arg2;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFFF)V")
	private void method3604(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		@Pc(6) float[] local6 = this.aFloatArray11;
		local6[0] = local3 / (arg1 - arg0);
		local6[1] = 0.0F;
		local6[2] = 0.0F;
		local6[3] = 0.0F;
		local6[4] = 0.0F;
		local6[5] = local3 / (arg3 - arg2);
		local6[6] = 0.0F;
		local6[7] = 0.0F;
		local6[8] = (arg1 + arg0) / (arg1 - arg0);
		local6[9] = (arg3 + arg2) / (arg3 - arg2);
		local6[10] = this.aFloat51 = -(arg5 + arg4) / (arg5 - arg4);
		local6[11] = -1.0F;
		local6[12] = 0.0F;
		local6[13] = 0.0F;
		local6[14] = this.aFloat49 = -(local3 * arg5) / (arg5 - arg4);
		local6[15] = 0.0F;
		this.method3606();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl1.glLineWidth((float) arg5);
		this.method4283(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4298(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nf", name = "db", descriptor = "()V")
	private void method3605() {
		if (this.aBoolean335) {
			this.anOpengl1.glMatrixMode(5890);
			this.anOpengl1.glLoadIdentity();
			this.anOpengl1.glMatrixMode(5888);
			this.aBoolean335 = false;
		}
	}

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "()V")
	@Override
	public void method4232() {
		if (this.aClass1_Sub15_Sub1_1.method1504()) {
			this.aClass164_1.method4349(this.aClass1_Sub15_Sub1_1);
			this.aClass191_1.method5103();
		}
	}

	@OriginalMember(owner = "client!nf", name = "eb", descriptor = "()V")
	private void method3606() {
		if (this.aFloat41 == 0.0F) {
			this.aFloatArray11[10] = this.aFloat51;
			this.aFloatArray11[14] = this.aFloat49;
		} else {
			@Pc(13) float local13 = this.aFloat35 / (this.aFloat41 + this.aFloat35);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat49 * (1.0F - local13) * (1.0F - local13) / this.aFloat41;
			this.aFloatArray11[10] = this.aFloat51 + local32;
			this.aFloatArray11[14] = this.aFloat49 * local17;
		}
		this.method3577();
	}

	@OriginalMember(owner = "client!nf", name = "C", descriptor = "()I")
	@Override
	public int method4279() {
		return 4;
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "()I")
	@Override
	public int method3559() {
		return this.anInt4172;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!up;Z)Lclient!cq;")
	@Override
	public Class8 method4238(@OriginalArg(0) Class201 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt6357 * arg0.anInt6354];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray70 == null) {
			for (local15 = 0; local15 < arg0.anInt6354; local15++) {
				for (local21 = 0; local21 < arg0.anInt6357; local21++) {
					@Pc(74) int local74 = arg0.anIntArray642[arg0.aByteArray71[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt6354; local15++) {
				for (local21 = 0; local21 < arg0.anInt6357; local21++) {
					local6[local10++] = arg0.aByteArray70[local8] << 24 | arg0.anIntArray642[arg0.aByteArray71[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class8 local100 = this.method4257(local6, arg0.anInt6357, arg0.anInt6357, arg0.anInt6354);
		local100.method4386(arg0.anInt6353, arg0.anInt6358, arg0.anInt6356, arg0.anInt6355);
		return local100;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!na;)V")
	public void method3607(@OriginalArg(0) Interface9 arg0) {
		if (this.anInterface9_4 != arg0 && this.lb) {
			this.anOpengl1.glBindBufferARB(34962, arg0.method4193());
			this.anInterface9_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[I[I)Lclient!ud;")
	@Override
	public Class15 method4303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static357.method320(this, arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!nf", name = "fb", descriptor = "()V")
	private void method3608() {
		this.aFloat45 = this.anInt4183 - this.anInt4196;
		this.aFloat42 = this.anInt4205 - this.anInt4196;
		this.aFloat46 = this.anInt4192 - this.anInt4190;
		this.aFloat55 = this.anInt4181 - this.anInt4190;
	}

	@OriginalMember(owner = "client!nf", name = "gb", descriptor = "()V")
	private void method3609() {
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
			Static163.method2863(1000L);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!wp;IIII)Lclient!dc;")
	@Override
	public Class40 method4301(@OriginalArg(0) Class219 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class40_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!nf", name = "hb", descriptor = "()V")
	public void method3610() {
		if (this.anInt4184 != 2) {
			this.anInt4184 = 2;
			this.method3584();
			this.method3620();
			this.anInt4191 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!nf", name = "I", descriptor = "()Z")
	@Override
	public boolean method4296() {
		return this.aClass1_Sub15_Sub1_1.method1504();
	}

	@OriginalMember(owner = "client!nf", name = "ib", descriptor = "()V")
	public void method3611() {
		this.anOpengl1.glDisableClientState(32886);
		this.anOpengl1.glDisableClientState(32885);
		this.anOpengl1.glDisableClientState(32884);
		for (@Pc(16) int local16 = this.anInt4189 - 1; local16 >= 0; local16--) {
			this.anOpengl1.glClientActiveTexture(local16 + 33984);
			this.anOpengl1.glDisableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4261(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method4245();
	}

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "()Z")
	@Override
	public boolean method4259() {
		return true;
	}

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "(II)V")
	public void method3612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4180 = arg0;
		this.anInt4207 = arg1;
		this.anOpengl1.glViewport(arg0, arg1, this.anInt4171, this.anInt4172);
		this.method3622();
	}

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "(I)V")
	public void method3613() {
		this.method3630(-2, true);
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(IIII)V")
	@Override
	public void method4282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4196 = arg0;
		this.anInt4190 = arg1;
		this.anInt4182 = arg2;
		this.anInt4199 = arg3;
		@Pc(23) float local23 = (float) (-this.anInt4196 * this.anInt4198) / (float) this.anInt4182;
		@Pc(35) float local35 = (float) (-this.anInt4190 * this.anInt4198) / (float) this.anInt4199;
		@Pc(49) float local49 = (float) ((this.anInt4171 - this.anInt4196) * this.anInt4198) / (float) this.anInt4182;
		@Pc(63) float local63 = (float) ((this.anInt4172 - this.anInt4190) * this.anInt4198) / (float) this.anInt4199;
		this.method3604(local23, local49, -local63, -local35, (float) this.anInt4198, (float) this.anInt4201);
		if (this.anInt4184 != 1) {
			this.method3596();
		}
		this.method3577();
		this.method3608();
	}

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "()F")
	@Override
	public float method4222() {
		return this.aFloat41;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ik;)V")
	public void method3614(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt4175 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt4175 >= 0) {
			this.anInterface3Array1[this.anInt4175].method3558();
		}
		this.anInterface3_1 = this.anInterface3Array1[++this.anInt4175] = arg0;
		this.anInterface3_1.method3557();
	}

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "()Z")
	@Override
	public boolean method4253() {
		if (!this.aClass1_Sub15_Sub1_1.method1504()) {
			if (!this.aClass164_1.method4355(this.aClass1_Sub15_Sub1_1)) {
				return false;
			}
			this.aClass191_1.method5103();
		}
		return true;
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V")
	@Override
	public void method4236(@OriginalArg(0) int arg0) {
		this.method3560();
	}

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "()Z")
	@Override
	public boolean method4216() {
		return true;
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(IIII)[I")
	@Override
	public int[] method4271() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl1.glReadPixels(0, this.anInt4172 - local6, 36, 1, 32993, this.anInt4204, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!nf", name = "A", descriptor = "()Z")
	@Override
	public boolean method4273() {
		return this.aClass1_Sub15_Sub1_1.method1513();
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method4275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method3631();
		this.method3603(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean329) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local23);
		this.anOpengl1.glVertex2f(local16, local23);
		this.anOpengl1.glVertex2f(local16, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean329) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass164_1.method4348(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I[BIZ)Lclient!na;")
	public Interface9 method3615(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface9) (this.lb && (!arg3 || this.aBoolean320) ? new Class80_Sub2(this, arg0, arg1, arg2, arg3) : new Class18_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "()V")
	@Override
	public void method3557() {
	}

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "()Z")
	@Override
	public boolean method4235() {
		return this.aClass132_1.method2997();
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "()V")
	@Override
	public void method3558() {
	}

	@OriginalMember(owner = "client!nf", name = "L", descriptor = "()Lclient!vj;")
	@Override
	public Class31 method4304() {
		return this.aClass31_5;
	}

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "()Z")
	@Override
	public boolean method4251() {
		return true;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FF)V")
	@Override
	public void method4207(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat35 && arg1 == this.aFloat41) {
			return;
		}
		this.aFloat35 = arg0;
		this.aFloat41 = arg1;
		this.method3606();
		this.method3577();
		if (this.anInt4184 == 3) {
			this.method3632();
		} else if (this.anInt4184 == 2) {
			this.method3584();
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ko;)V")
	public void method3616(@OriginalArg(0) Interface8 arg0) {
		if (this.anInterface8_4 != arg0 && this.lb) {
			this.anOpengl1.glBindBufferARB(34963, arg0.method4193());
			this.anInterface8_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(IIIII)V")
	@Override
	public void method4270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3631();
		this.method3603(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "()Z")
	@Override
	public boolean method4227() {
		return true;
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(IIIII)V")
	@Override
	protected void method4262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!nf", name = "jb", descriptor = "()V")
	private void method3617() {
		if (this.anInt4184 == 1) {
			return;
		}
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho(0.0D, (double) this.anInt4171, (double) this.anInt4172, 0.0D, -1.0D, 1.0D);
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anInt4184 = 1;
		this.anInt4191 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!nf", name = "u", descriptor = "()Z")
	@Override
	public boolean method4254() {
		return !this.aBoolean321;
	}

	@OriginalMember(owner = "client!nf", name = "D", descriptor = "()V")
	@Override
	public void method4284() {
		@Pc(2) int local2 = this.anInt4183;
		@Pc(5) int local5 = this.anInt4205;
		@Pc(8) int local8 = this.anInt4192;
		@Pc(11) int local11 = this.anInt4181;
		this.method4233();
		this.anOpengl1.glReadBuffer(1028);
		this.anOpengl1.glDrawBuffer(1029);
		this.method3596();
		this.method3594(false);
		this.method3570(false);
		this.method3621(false);
		this.method3589(false);
		this.method3591(null);
		this.method3613();
		this.method3618(0);
		this.method3603(0);
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRasterPos2i(0, 0);
		this.anOpengl1.glCopyPixels(0, 0, this.anInt4171, this.anInt4172, 6144);
		this.anOpengl1.glFlush();
		this.anOpengl1.glReadBuffer(1029);
		this.anOpengl1.glDrawBuffer(1029);
		this.method4268(local2, local8, local5, local11);
	}

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "(I)V")
	public void method3618(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3562(7681, 7681);
		} else if (arg0 == 1) {
			this.method3562(8448, 8448);
		} else if (arg0 == 2) {
			this.method3562(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
	@Override
	public void method4226() {
		this.aBoolean323 = true;
		this.anInt4186 = 1583160;
		this.anInt4206 = 40;
		this.method3623();
		this.method3565();
		this.aClass132_1.method2999(3, false, false);
		this.aClass132_1.method2998(-1, true);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4258() {
	}

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "()V")
	@Override
	public void method4245() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!nf", name = "z", descriptor = "()V")
	@Override
	public void method4272() {
		this.aClass132_1.method2999(0, false, false);
		this.aBoolean323 = false;
		this.method3623();
		this.method3565();
	}

	@OriginalMember(owner = "client!nf", name = "kb", descriptor = "()V")
	private void method3619() {
		if (this.aBoolean332 && !this.aBoolean333) {
			this.anOpengl1.glEnable(2896);
		} else {
			this.anOpengl1.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!nf", name = "K", descriptor = "()V")
	@Override
	public void method4300() {
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method4243(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt4202 != arg0;
		if (local7 || this.aFloat36 != arg1 || this.aFloat52 != arg2) {
			this.anInt4202 = arg0;
			this.aFloat36 = arg1;
			this.aFloat52 = arg2;
			if (local7) {
				this.aFloat50 = (float) (this.anInt4202 & 0xFF0000) / 1.671168E7F;
				this.aFloat54 = (float) (this.anInt4202 & 0xFFFF) / 65535.0F;
				this.aFloat43 = (float) (this.anInt4202 & 0xFF) / 255.0F;
				this.method3637();
			}
			this.method3624();
		}
		if (this.aFloatArray14[0] == arg3 && this.aFloatArray14[1] == arg4 && this.aFloatArray14[2] == arg5) {
			return;
		}
		this.aFloatArray14[0] = arg3;
		this.aFloatArray14[1] = arg4;
		this.aFloatArray14[2] = arg5;
		this.aFloatArray10[0] = -arg3;
		this.aFloatArray10[1] = -arg4;
		this.aFloatArray10[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray12[0] = arg3 * local132;
		this.aFloatArray12[1] = arg4 * local132;
		this.aFloatArray12[2] = arg5 * local132;
		this.aFloatArray13[0] = -this.aFloatArray12[0];
		this.aFloatArray13[1] = -this.aFloatArray12[1];
		this.aFloatArray13[2] = -this.aFloatArray12[2];
		this.method3567();
		this.anInt4179 = (int) (arg3 * 256.0F / arg4);
		this.anInt4188 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!nf", name = "lb", descriptor = "()V")
	private void method3620() {
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl1.glMultMatrixf(this.aClass31_Sub2_2.method3191(), 0);
		this.method3567();
	}

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "(Z)V")
	public void method3621(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean319) {
			return;
		}
		if (arg0) {
			this.anOpengl1.glEnable(2929);
		} else {
			this.anOpengl1.glDisable(2929);
		}
		this.aBoolean319 = arg0;
		this.anInt4191 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!nf", name = "mb", descriptor = "()V")
	private void method3622() {
		if (this.anInt4183 <= this.anInt4205 && this.anInt4192 <= this.anInt4181) {
			this.anOpengl1.glScissor(this.anInt4180 + this.anInt4183, this.anInt4207 + this.anInt4172 - this.anInt4181, this.anInt4205 - this.anInt4183, this.anInt4181 - this.anInt4192);
		} else {
			this.anOpengl1.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(F)V")
	@Override
	public void method4286(@OriginalArg(0) float arg0) {
		if (this.aFloat38 != arg0) {
			this.aFloat38 = arg0;
			this.method3637();
		}
	}

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "()V")
	@Override
	public void method4229() {
		this.aClass164_1.method4353();
	}

	@OriginalMember(owner = "client!nf", name = "nb", descriptor = "()V")
	private void method3623() {
		@Pc(15) int local15;
		if (this.aBoolean323) {
			this.anOpengl1.glFogf(2915, 0.0F);
			this.anOpengl1.glFogf(2916, 1.0F);
			local15 = this.anInt4186;
		} else {
			this.aFloat39 = (float) (this.anInt4201 - 256) - this.aFloat37;
			this.aFloat40 = this.aFloat39 - (float) this.anInt4208 * this.aFloat44;
			if (this.aFloat40 < (float) this.anInt4198) {
				this.aFloat40 = this.anInt4198;
			}
			this.anOpengl1.glFogf(2915, this.aFloat40);
			this.anOpengl1.glFogf(2916, this.aFloat39);
			local15 = this.anInt4195;
		}
		Static198.aFloatArray8[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static198.aFloatArray8[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static198.aFloatArray8[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl1.glFogfv(2918, Static198.aFloatArray8, 0);
	}

	@OriginalMember(owner = "client!nf", name = "ob", descriptor = "()V")
	private void method3624() {
		Static198.aFloatArray8[0] = this.aFloat36 * this.aFloat50;
		Static198.aFloatArray8[1] = this.aFloat36 * this.aFloat54;
		Static198.aFloatArray8[2] = this.aFloat36 * this.aFloat43;
		Static198.aFloatArray8[3] = 1.0F;
		this.anOpengl1.glLightfv(16384, 4609, Static198.aFloatArray8, 0);
		Static198.aFloatArray8[0] = -this.aFloat52 * this.aFloat50;
		Static198.aFloatArray8[1] = -this.aFloat52 * this.aFloat54;
		Static198.aFloatArray8[2] = -this.aFloat52 * this.aFloat43;
		Static198.aFloatArray8[3] = 1.0F;
		this.anOpengl1.glLightfv(16385, 4609, Static198.aFloatArray8, 0);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!gm;)V")
	public void method3625(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1) {
		this.anOpengl1.glClientActiveTexture(arg0 + 33984);
		this.anOpengl1.glEnableClientState(32888);
		arg1.method1631();
	}

	@OriginalMember(owner = "client!nf", name = "pb", descriptor = "()I")
	private int method3626() {
		@Pc(1) int local1 = 0;
		this.aString158 = this.anOpengl1.glGetString(7936);
		this.aString157 = this.anOpengl1.glGetString(7937);
		@Pc(17) String local17 = this.aString158.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl1.glGetString(7938);
		@Pc(53) String[] local53 = Static183.method3233(local45.replace('.', ' '), ' ');
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static38.method2707(local53[0]);
				@Pc(69) int local69 = Static38.method2707(local53[1]);
				this.anInt4197 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt4197 < 12) {
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
		this.anInt4177 = local116[0];
		this.anOpengl1.glGetIntegerv(34929, local116, 0);
		this.anInt4189 = local116[0];
		this.anOpengl1.glGetIntegerv(34930, local116, 0);
		this.anInt4200 = local116[0];
		if (this.anInt4177 < 2 || this.anInt4189 < 2 || this.anInt4200 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean321 = Static343.aString266 != null && Static343.aString266.startsWith("mac");
		this.aBoolean316 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.lb = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean329 = this.anOpengl1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean324 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean334 = this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean336 = this.anOpengl1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean317 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean315 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean327 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean328 = false;
		this.aBoolean326 = this.anOpengl1.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "(I)V")
	public void method3627(@OriginalArg(0) int arg0) {
		Static198.aFloatArray8[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static198.aFloatArray8[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static198.aFloatArray8[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static198.aFloatArray8[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static198.aFloatArray8, 0);
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(III)V")
	public void method3628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(II)V")
	@Override
	public void method4277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4198 == arg0 && this.anInt4201 == arg1) {
			return;
		}
		this.anInt4198 = arg0;
		this.anInt4201 = arg1;
		this.method3596();
		this.method3577();
		this.method3623();
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(Lclient!ik;)V")
	public void method3629(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt4175 < 0 || this.anInterface3Array1[this.anInt4175] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface3Array1[this.anInt4175--] = null;
		arg0.method3558();
		if (this.anInt4175 >= 0) {
			this.anInterface3_1 = this.anInterface3Array1[this.anInt4175];
			this.anInterface3_1.method3557();
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)V")
	public void method3630(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3633(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(IIII)V")
	@Override
	public void method4268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt4171) {
			arg2 = this.anInt4171;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt4172) {
			arg3 = this.anInt4172;
		}
		this.anInt4183 = arg0;
		this.anInt4192 = arg1;
		this.anInt4205 = arg2;
		this.anInt4181 = arg3;
		this.anOpengl1.glEnable(3089);
		this.method3608();
		this.method3622();
	}

	@OriginalMember(owner = "client!nf", name = "qb", descriptor = "()V")
	private void method3631() {
		if (this.anInt4191 == 1) {
			return;
		}
		this.method3617();
		this.method3594(false);
		this.method3570(false);
		this.method3621(false);
		this.method3589(false);
		this.method3591(null);
		this.method3613();
		this.method3618(0);
		this.anInt4191 = 1;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V")
	@Override
	public void method4269(@OriginalArg(0) boolean arg0) {
		this.aBoolean331 = arg0;
		this.method3585();
	}

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "()Z")
	@Override
	public boolean method4260() {
		return true;
	}

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "()I")
	@Override
	public int method4239() {
		return this.anInt4198;
	}

	@OriginalMember(owner = "client!nf", name = "rb", descriptor = "()V")
	private void method3632() {
		@Pc(11) float local11 = (float) -this.anInt4196 * this.aFloat47 / (float) this.anInt4182;
		@Pc(23) float local23 = (float) -this.anInt4190 * this.aFloat47 / (float) this.anInt4199;
		@Pc(37) float local37 = (float) (this.anInt4171 - this.anInt4196) * this.aFloat47 / (float) this.anInt4182;
		@Pc(51) float local51 = (float) (this.anInt4172 - this.anInt4190) * this.aFloat47 / (float) this.anInt4199;
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt4198 - this.aFloat41), (double) ((float) this.anInt4201 - this.aFloat41));
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!nf", name = "E", descriptor = "()Z")
	@Override
	public boolean method4285() {
		return false;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIII)Lclient!hs;")
	@Override
	public Class78 method4230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean315 ? new Class78_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZZ)V")
	public void method3633(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt4178) {
			if (arg0 < 0) {
				this.method3605();
				this.method3591(null);
				if (!this.aBoolean323) {
					this.aClass132_1.method2999(0, arg2, arg1);
				}
			} else {
				@Pc(11) Class44_Sub1 local11 = this.aClass191_1.method5102(arg0);
				@Pc(17) Class116 local17 = this.anInterface2_3.method951(arg0);
				if (local17.aByte43 == 0 && local17.aByte48 == 0) {
					this.method3605();
				} else {
					@Pc(30) int local30 = local17.aBoolean223 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method3573((float) (this.anInt4167 % local34 * local17.aByte43) / (float) local34, (float) (this.anInt4167 % local34 * local17.aByte48) / (float) local34, 0.0F);
				}
				if (this.aBoolean323) {
					this.aClass132_1.method2999(3, arg2, arg1);
					this.method3591(local11);
				} else {
					this.aClass132_1.method2999(local17.aByte47, arg2, arg1);
					this.aClass132_1.method2998(local17.aByte46, false);
					if (!this.aClass132_1.method3000(local11)) {
						this.method3591(local11);
					}
				}
			}
			this.anInt4178 = arg0;
		}
		this.anInt4191 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIILclient!ud;II)V")
	@Override
	public void method4278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class15 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class15_Sub1 local2 = (Class15_Sub1) arg5;
		@Pc(5) Class44_Sub1_Sub1 local5 = local2.aClass44_Sub1_Sub1_1;
		this.method3592();
		this.method3591(local2.aClass44_Sub1_Sub1_1);
		this.method3603(1);
		this.method3562(7681, 8448);
		this.method3568(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat5 / (float) local5.anInt1288;
		@Pc(37) float local37 = local5.aFloat6 / (float) local5.anInt1289;
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
		this.method3568(0, 5890, 768);
	}

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "(I)V")
	public void method3634(@OriginalArg(0) int arg0) {
		if (this.anInt4176 != arg0) {
			this.anOpengl1.glActiveTexture(arg0 + 33984);
			this.anInt4176 = arg0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "(I)I")
	public int method3635(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!nf", name = "F", descriptor = "()I")
	@Override
	public int method4288() {
		return this.anInt4174 + this.anInt4169 + this.anInt4168;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!tr;)V")
	@Override
	public void method4234(@OriginalArg(0) Class1_Sub41 arg0) {
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIIIII)Z")
	@Override
	public boolean method4241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass31_Sub2_2.aFloat31 * (float) arg0 + this.aClass31_Sub2_2.aFloat30 * (float) arg1 + this.aClass31_Sub2_2.aFloat26 * (float) arg2 + this.aClass31_Sub2_2.aFloat33;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass31_Sub2_2.aFloat31 * (float) arg3 + this.aClass31_Sub2_2.aFloat30 * (float) arg4 + this.aClass31_Sub2_2.aFloat26 * (float) arg5 + this.aClass31_Sub2_2.aFloat33;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt4198 && local55 < (float) this.anInt4198 || !(!(local24 > (float) this.anInt4201) || !(local55 > (float) this.anInt4201))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt4182 * (this.aClass31_Sub2_2.aFloat29 * (float) arg0 + this.aClass31_Sub2_2.aFloat22 * (float) arg1 + this.aClass31_Sub2_2.aFloat24 * (float) arg2 + this.aClass31_Sub2_2.aFloat32) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt4182 * (this.aClass31_Sub2_2.aFloat29 * (float) arg3 + this.aClass31_Sub2_2.aFloat22 * (float) arg4 + this.aClass31_Sub2_2.aFloat24 * (float) arg5 + this.aClass31_Sub2_2.aFloat32) / local55);
		if ((float) local119 < this.aFloat45 && (float) local151 < this.aFloat45 || (float) local119 > this.aFloat42 && (float) local151 > this.aFloat42) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt4199 * (this.aClass31_Sub2_2.aFloat27 * (float) arg0 + this.aClass31_Sub2_2.aFloat28 * (float) arg1 + this.aClass31_Sub2_2.aFloat25 * (float) arg2 + this.aClass31_Sub2_2.aFloat23) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt4199 * (this.aClass31_Sub2_2.aFloat27 * (float) arg3 + this.aClass31_Sub2_2.aFloat28 * (float) arg4 + this.aClass31_Sub2_2.aFloat25 * (float) arg5 + this.aClass31_Sub2_2.aFloat23) / local55);
			return (!((float) local209 < this.aFloat46) || !((float) local241 < this.aFloat46)) && (!((float) local209 > this.aFloat55) || !((float) local241 > this.aFloat55));
		}
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method4283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3631();
		this.method3603(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass31_Sub2_2.aFloat31 * (float) arg0 + this.aClass31_Sub2_2.aFloat30 * (float) arg1 + this.aClass31_Sub2_2.aFloat26 * (float) arg2 + this.aClass31_Sub2_2.aFloat33;
		if (local24 < (float) this.anInt4198 || local24 > (float) this.anInt4201) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt4182 * (this.aClass31_Sub2_2.aFloat29 * (float) arg0 + this.aClass31_Sub2_2.aFloat22 * (float) arg1 + this.aClass31_Sub2_2.aFloat24 * (float) arg2 + this.aClass31_Sub2_2.aFloat32) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt4199 * (this.aClass31_Sub2_2.aFloat27 * (float) arg0 + this.aClass31_Sub2_2.aFloat28 * (float) arg1 + this.aClass31_Sub2_2.aFloat25 * (float) arg2 + this.aClass31_Sub2_2.aFloat23) / local24);
		if ((float) local81 >= this.aFloat45 && (float) local81 <= this.aFloat42 && (float) local113 >= this.aFloat46 && (float) local113 <= this.aFloat55) {
			arg3[0] = (int) ((float) local81 - this.aFloat45);
			arg3[1] = (int) ((float) local113 - this.aFloat46);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!ud;II)V")
	@Override
	public void method4244(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class15_Sub1 local2 = (Class15_Sub1) arg0;
		@Pc(5) Class44_Sub1_Sub1 local5 = local2.aClass44_Sub1_Sub1_1;
		this.method3592();
		this.method3591(local2.aClass44_Sub1_Sub1_1);
		this.method3603(1);
		this.method3562(7681, 8448);
		this.method3568(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat5 / (float) local5.anInt1288;
		@Pc(37) float local37 = local5.aFloat6 / (float) local5.anInt1289;
		this.anOpengl1.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt4183 - arg1), local37 * (float) (this.anInt4192 - arg2));
		this.anOpengl1.glVertex2i(this.anInt4183, this.anInt4192);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt4183 - arg1), local37 * (float) (this.anInt4181 - arg2));
		this.anOpengl1.glVertex2i(this.anInt4183, this.anInt4181);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt4205 - arg1), local37 * (float) (this.anInt4181 - arg2));
		this.anOpengl1.glVertex2i(this.anInt4205, this.anInt4181);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt4205 - arg1), local37 * (float) (this.anInt4192 - arg2));
		this.anOpengl1.glVertex2i(this.anInt4205, this.anInt4192);
		this.anOpengl1.glEnd();
		this.method3568(0, 5890, 768);
	}

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "(II)V")
	public synchronized void method3636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub14 local4 = new Class1_Sub14(arg1);
		local4.aLong214 = arg0;
		this.aClass14_18.method300(local4);
	}

	@OriginalMember(owner = "client!nf", name = "sb", descriptor = "()V")
	private void method3637() {
		Static198.aFloatArray8[0] = this.aFloat38 * this.aFloat50;
		Static198.aFloatArray8[1] = this.aFloat38 * this.aFloat54;
		Static198.aFloatArray8[2] = this.aFloat38 * this.aFloat43;
		Static198.aFloatArray8[3] = 1.0F;
		this.anOpengl1.glLightModelfv(2899, Static198.aFloatArray8, 0);
	}

	@OriginalMember(owner = "client!nf", name = "G", descriptor = "()I")
	@Override
	public int method4291() {
		@Pc(2) int local2 = this.anInt4210;
		this.anInt4210 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(II)V")
	@Override
	public void method4281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4195 == arg0 && this.anInt4208 == arg1) {
			return;
		}
		this.anInt4195 = arg0;
		this.anInt4208 = arg1;
		if (!this.aBoolean323) {
			this.method3623();
			this.method3565();
		}
	}
}
