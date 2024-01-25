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

@OriginalClass("client!ao")
public final class Class4_Sub1 extends Class4 implements Interface6 {

	@OriginalMember(owner = "client!ao", name = "F", descriptor = "Lclient!tj;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
	public int anInt314;

	@OriginalMember(owner = "client!ao", name = "H", descriptor = "I")
	public int anInt315;

	@OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
	public int anInt316;

	@OriginalMember(owner = "client!ao", name = "K", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!ao", name = "L", descriptor = "I")
	public int anInt319;

	@OriginalMember(owner = "client!ao", name = "M", descriptor = "I")
	public int anInt320;

	@OriginalMember(owner = "client!ao", name = "W", descriptor = "Z")
	public boolean aBoolean28;

	@OriginalMember(owner = "client!ao", name = "X", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!ao", name = "Y", descriptor = "F")
	public float aFloat7;

	@OriginalMember(owner = "client!ao", name = "Z", descriptor = "F")
	public float aFloat8;

	@OriginalMember(owner = "client!ao", name = "db", descriptor = "Lclient!rj;")
	public Class124_Sub2 aClass124_Sub2_1;

	@OriginalMember(owner = "client!ao", name = "fb", descriptor = "I")
	public int anInt322;

	@OriginalMember(owner = "client!ao", name = "hb", descriptor = "Lclient!ai;")
	public Class7_Sub1 aClass7_Sub1_1;

	@OriginalMember(owner = "client!ao", name = "jb", descriptor = "F")
	private float aFloat11;

	@OriginalMember(owner = "client!ao", name = "lb", descriptor = "F")
	public float lb;

	@OriginalMember(owner = "client!ao", name = "nb", descriptor = "Lclient!mg;")
	public Class128 aClass128_1;

	@OriginalMember(owner = "client!ao", name = "rb", descriptor = "Lclient!ai;")
	public Class7_Sub1 aClass7_Sub1_2;

	@OriginalMember(owner = "client!ao", name = "sb", descriptor = "Lclient!fm;")
	private Class22_Sub1 aClass22_Sub1_1;

	@OriginalMember(owner = "client!ao", name = "tb", descriptor = "Lclient!rn;")
	private Class124_Sub2_Sub1 aClass124_Sub2_Sub1_1;

	@OriginalMember(owner = "client!ao", name = "ub", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!ao", name = "vb", descriptor = "Z")
	public boolean aBoolean32;

	@OriginalMember(owner = "client!ao", name = "wb", descriptor = "Lclient!pm;")
	public Class133_Sub2 aClass133_Sub2_1;

	@OriginalMember(owner = "client!ao", name = "xb", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!ao", name = "Bb", descriptor = "Lclient!rj;")
	public Class124_Sub2 aClass124_Sub2_2;

	@OriginalMember(owner = "client!ao", name = "Cb", descriptor = "Z")
	public boolean aBoolean34;

	@OriginalMember(owner = "client!ao", name = "Db", descriptor = "Lclient!as;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!ao", name = "Eb", descriptor = "Z")
	private boolean aBoolean35;

	@OriginalMember(owner = "client!ao", name = "Gb", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!ao", name = "Jb", descriptor = "Lclient!um;")
	private Interface8 anInterface8_2;

	@OriginalMember(owner = "client!ao", name = "Kb", descriptor = "F")
	private float aFloat14;

	@OriginalMember(owner = "client!ao", name = "Ob", descriptor = "Z")
	public boolean aBoolean37;

	@OriginalMember(owner = "client!ao", name = "Pb", descriptor = "Z")
	private boolean aBoolean38;

	@OriginalMember(owner = "client!ao", name = "Qb", descriptor = "F")
	public float aFloat15;

	@OriginalMember(owner = "client!ao", name = "Rb", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!ao", name = "Ub", descriptor = "[Lclient!lp;")
	private Class124[] aClass124Array1;

	@OriginalMember(owner = "client!ao", name = "Xb", descriptor = "Z")
	private boolean aBoolean39;

	@OriginalMember(owner = "client!ao", name = "Yb", descriptor = "Lclient!ai;")
	public Class7_Sub1 aClass7_Sub1_3;

	@OriginalMember(owner = "client!ao", name = "Zb", descriptor = "Z")
	private boolean aBoolean40;

	@OriginalMember(owner = "client!ao", name = "ac", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!ao", name = "bc", descriptor = "Z")
	public boolean aBoolean41;

	@OriginalMember(owner = "client!ao", name = "cc", descriptor = "Z")
	private boolean aBoolean42;

	@OriginalMember(owner = "client!ao", name = "ec", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!ao", name = "gc", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!ao", name = "hc", descriptor = "Z")
	private boolean aBoolean43;

	@OriginalMember(owner = "client!ao", name = "ic", descriptor = "Z")
	private boolean aBoolean44;

	@OriginalMember(owner = "client!ao", name = "lc", descriptor = "Z")
	private boolean aBoolean46;

	@OriginalMember(owner = "client!ao", name = "oc", descriptor = "Z")
	private boolean aBoolean47;

	@OriginalMember(owner = "client!ao", name = "pc", descriptor = "I")
	public int anInt340;

	@OriginalMember(owner = "client!ao", name = "tc", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!ao", name = "vc", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!ao", name = "xc", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!ao", name = "yc", descriptor = "Lclient!ai;")
	public Class7_Sub1 aClass7_Sub1_4;

	@OriginalMember(owner = "client!ao", name = "zc", descriptor = "F")
	public float aFloat22;

	@OriginalMember(owner = "client!ao", name = "Bc", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!ao", name = "Cc", descriptor = "Lclient!rj;")
	public Class124_Sub2 aClass124_Sub2_3;

	@OriginalMember(owner = "client!ao", name = "Fc", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!ao", name = "Gc", descriptor = "I")
	public int anInt349;

	@OriginalMember(owner = "client!ao", name = "Hc", descriptor = "F")
	private float aFloat23;

	@OriginalMember(owner = "client!ao", name = "Ic", descriptor = "Lclient!ai;")
	public Class7_Sub1 aClass7_Sub1_5;

	@OriginalMember(owner = "client!ao", name = "Jc", descriptor = "Z")
	private boolean aBoolean49;

	@OriginalMember(owner = "client!ao", name = "Mc", descriptor = "Lclient!ai;")
	public Class7_Sub1 aClass7_Sub1_6;

	@OriginalMember(owner = "client!ao", name = "Nc", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!ao", name = "Pc", descriptor = "Z")
	public boolean aBoolean50;

	@OriginalMember(owner = "client!ao", name = "Qc", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!ao", name = "Sc", descriptor = "Lclient!pm;")
	public Class133_Sub2 aClass133_Sub2_2;

	@OriginalMember(owner = "client!ao", name = "Uc", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!ao", name = "Vc", descriptor = "I")
	private int anInt355;

	@OriginalMember(owner = "client!ao", name = "w", descriptor = "Lclient!hk;")
	private final Class85 aClass85_1 = new Class85();

	@OriginalMember(owner = "client!ao", name = "B", descriptor = "Lclient!nc;")
	private final Class133 aClass133_1 = new Class133_Sub2();

	@OriginalMember(owner = "client!ao", name = "D", descriptor = "Z")
	private boolean aBoolean27 = false;

	@OriginalMember(owner = "client!ao", name = "C", descriptor = "I")
	private int anInt312 = -1;

	@OriginalMember(owner = "client!ao", name = "E", descriptor = "I")
	public final int anInt313 = 3;

	@OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
	public final int anInt317 = 8;

	@OriginalMember(owner = "client!ao", name = "O", descriptor = "[Lclient!tj;")
	private final Interface6[] anInterface6Array1 = new Interface6[4];

	@OriginalMember(owner = "client!ao", name = "N", descriptor = "Lclient!wq;")
	private final Class216 aClass216_9 = new Class216();

	@OriginalMember(owner = "client!ao", name = "Q", descriptor = "Lclient!wq;")
	private final Class216 aClass216_10 = new Class216();

	@OriginalMember(owner = "client!ao", name = "R", descriptor = "Lclient!wq;")
	private final Class216 aClass216_11 = new Class216();

	@OriginalMember(owner = "client!ao", name = "S", descriptor = "Lclient!wq;")
	private final Class216 aClass216_12 = new Class216();

	@OriginalMember(owner = "client!ao", name = "T", descriptor = "Lclient!wq;")
	private final Class216 aClass216_13 = new Class216();

	@OriginalMember(owner = "client!ao", name = "U", descriptor = "Lclient!wq;")
	private final Class216 aClass216_14 = new Class216();

	@OriginalMember(owner = "client!ao", name = "V", descriptor = "Lclient!wq;")
	private final Class216 aClass216_15 = new Class216();

	@OriginalMember(owner = "client!ao", name = "ab", descriptor = "I")
	public int anInt321 = 50;

	@OriginalMember(owner = "client!ao", name = "eb", descriptor = "F")
	public float aFloat10 = 3584.0F;

	@OriginalMember(owner = "client!ao", name = "bb", descriptor = "F")
	private float aFloat9 = 1.0F;

	@OriginalMember(owner = "client!ao", name = "pb", descriptor = "I")
	public int anInt324 = -1;

	@OriginalMember(owner = "client!ao", name = "yb", descriptor = "[F")
	private final float[] aFloatArray7 = new float[4];

	@OriginalMember(owner = "client!ao", name = "cb", descriptor = "[F")
	private final float[] aFloatArray5 = new float[4];

	@OriginalMember(owner = "client!ao", name = "Ab", descriptor = "I")
	private int anInt327 = 0;

	@OriginalMember(owner = "client!ao", name = "dc", descriptor = "I")
	public int anInt334 = -1;

	@OriginalMember(owner = "client!ao", name = "gb", descriptor = "I")
	private int anInt323 = 8448;

	@OriginalMember(owner = "client!ao", name = "kb", descriptor = "F")
	public float aFloat12 = 1.0F;

	@OriginalMember(owner = "client!ao", name = "Nb", descriptor = "I")
	private int anInt332 = 0;

	@OriginalMember(owner = "client!ao", name = "Vb", descriptor = "I")
	private int anInt333 = -1;

	@OriginalMember(owner = "client!ao", name = "Sb", descriptor = "F")
	public float aFloat16 = 3584.0F;

	@OriginalMember(owner = "client!ao", name = "Wb", descriptor = "F")
	public float aFloat18 = -1.0F;

	@OriginalMember(owner = "client!ao", name = "kc", descriptor = "I")
	private int anInt338 = 0;

	@OriginalMember(owner = "client!ao", name = "mc", descriptor = "I")
	private int anInt339 = 0;

	@OriginalMember(owner = "client!ao", name = "uc", descriptor = "I")
	public int anInt344 = 0;

	@OriginalMember(owner = "client!ao", name = "rc", descriptor = "I")
	private int anInt342 = 0;

	@OriginalMember(owner = "client!ao", name = "Hb", descriptor = "F")
	private float aFloat13 = 0.0F;

	@OriginalMember(owner = "client!ao", name = "fc", descriptor = "I")
	public int anInt336 = 512;

	@OriginalMember(owner = "client!ao", name = "mb", descriptor = "Z")
	private boolean aBoolean30 = true;

	@OriginalMember(owner = "client!ao", name = "wc", descriptor = "I")
	public int anInt345 = 0;

	@OriginalMember(owner = "client!ao", name = "sc", descriptor = "I")
	private int anInt343 = 0;

	@OriginalMember(owner = "client!ao", name = "qb", descriptor = "[F")
	private final float[] aFloatArray6 = new float[16];

	@OriginalMember(owner = "client!ao", name = "Lb", descriptor = "I")
	public int anInt331 = -1;

	@OriginalMember(owner = "client!ao", name = "Ac", descriptor = "[F")
	private final float[] aFloatArray9 = new float[4];

	@OriginalMember(owner = "client!ao", name = "Tb", descriptor = "F")
	public float aFloat17 = 1.0F;

	@OriginalMember(owner = "client!ao", name = "qc", descriptor = "I")
	public int anInt341 = 3584;

	@OriginalMember(owner = "client!ao", name = "nc", descriptor = "[F")
	public final float[] aFloatArray8 = new float[4];

	@OriginalMember(owner = "client!ao", name = "Ib", descriptor = "I")
	private int anInt330 = 8448;

	@OriginalMember(owner = "client!ao", name = "Kc", descriptor = "F")
	private float aFloat24 = 1.0F;

	@OriginalMember(owner = "client!ao", name = "Lc", descriptor = "F")
	public float aFloat25 = 1.0F;

	@OriginalMember(owner = "client!ao", name = "Dc", descriptor = "I")
	private int anInt347 = -1;

	@OriginalMember(owner = "client!ao", name = "Rc", descriptor = "I")
	private int anInt353 = 0;

	@OriginalMember(owner = "client!ao", name = "Oc", descriptor = "I")
	public int anInt351 = 512;

	@OriginalMember(owner = "client!ao", name = "Tc", descriptor = "F")
	public float aFloat26 = -1.0F;

	@OriginalMember(owner = "client!ao", name = "t", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas1;

	@OriginalMember(owner = "client!ao", name = "s", descriptor = "Lclient!ul;")
	public final Interface7 anInterface7_1;

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!ao", name = "x", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl1;

	@OriginalMember(owner = "client!ao", name = "Fb", descriptor = "I")
	public final int anInt328;

	@OriginalMember(owner = "client!ao", name = "zb", descriptor = "Z")
	private boolean aBoolean33;

	@OriginalMember(owner = "client!ao", name = "ib", descriptor = "Z")
	public boolean aBoolean29;

	@OriginalMember(owner = "client!ao", name = "Mb", descriptor = "Z")
	public boolean aBoolean36;

	@OriginalMember(owner = "client!ao", name = "Ec", descriptor = "Z")
	public boolean aBoolean48;

	@OriginalMember(owner = "client!ao", name = "ob", descriptor = "Z")
	private boolean aBoolean31;

	@OriginalMember(owner = "client!ao", name = "jc", descriptor = "Z")
	public boolean aBoolean45;

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "Lclient!cf;")
	public final Class29 aClass29_1;

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "Lclient!uf;")
	private final Class196 aClass196_1;

	@OriginalMember(owner = "client!ao", name = "z", descriptor = "Lclient!df;")
	private final Class42 aClass42_1;

	@OriginalMember(owner = "client!ao", name = "u", descriptor = "Lclient!pn;")
	private final Class2_Sub34_Sub1 aClass2_Sub34_Sub1_1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!ul;IILclient!rd;)V")
	public Class4_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class168 arg4) {
		this.aCanvas1 = arg0;
		this.anInterface7_1 = arg1;
		this.anInt4681 = arg2;
		@Pc(186) int local186 = 0;
		while (!this.aCanvas1.isShowing()) {
			if (local186++ > 5) {
				throw new RuntimeException("");
			}
			Static102.method2276(1000L);
		}
		this.aCanvas1.setIgnoreRepaint(true);
		try {
			if (Static13.aBoolean26 == null || !Static13.aBoolean26) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static13.aBoolean26 = Boolean.TRUE;
				} else {
					@Pc(220) Class193 local220 = arg4.method4854(this.getClass());
					while (local220.anInt6293 == 0) {
						Static102.method2276(100L);
					}
					if (local220.anInt6293 == 1) {
						Static13.aBoolean26 = Boolean.TRUE;
					}
				}
			}
			if (Static13.aBoolean26 == null || !Static13.aBoolean26) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas1, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method541();
				this.anOpengl1 = this.aContext1.getGL();
				@Pc(287) int local287 = this.method593();
				if (local287 != 0) {
					throw new RuntimeException("");
				}
				this.anInt328 = this.aBoolean32 ? 33639 : 5121;
				@Pc(306) String local306 = this.aString7.toLowerCase();
				@Pc(310) String local310 = this.aString8.toLowerCase();
				if (local310.indexOf("radeon") != -1) {
					@Pc(317) int local317 = 0;
					@Pc(319) boolean local319 = false;
					@Pc(321) boolean local321 = false;
					@Pc(329) String[] local329 = Static336.method5829(local310.replace('/', ' '), ' ');
					for (@Pc(331) int local331 = 0; local331 < local329.length; local331++) {
						@Pc(339) String local339 = local329[local331];
						try {
							if (local339.length() > 0) {
								if (local339.charAt(0) == 'x' && local339.length() >= 3 && Static279.method5064(local339.substring(1, 3))) {
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
									if (local339.length() >= 4 && Static279.method5064(local339.substring(0, 4))) {
										local317 = Static133.method2671(local339.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(403) Exception local403) {
						}
					}
					if (!local321 && !local319) {
						if (local317 >= 7000 && local317 <= 7999) {
							this.aBoolean33 = false;
						}
						if (local317 >= 7000 && local317 <= 9250) {
							this.aBoolean29 = false;
						}
					}
					if (!local319 || local317 < 4000) {
						this.aBoolean36 = false;
					}
					this.aBoolean48 &= this.anOpengl1.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean31 = this.aBoolean33;
				}
				if (local306.contains("intel")) {
					this.aBoolean45 = false;
				}
				if (this.aBoolean33) {
					try {
						@Pc(461) int[] local461 = new int[1];
						this.anOpengl1.glGenBuffersARB(1, local461, 0);
					} catch (@Pc(469) Throwable local469) {
						throw new RuntimeException("", local469);
					}
				}
				this.method597(this);
				this.method4208();
				this.method565();
				new Class116(this);
				this.aClass29_1 = new Class29(this, this.anInterface7_1);
				Static345.method841(true);
				this.aBoolean27 = true;
				this.aClass196_1 = new Class196(this);
				this.aClass42_1 = new Class42(this);
				this.aClass2_Sub34_Sub1_1 = new Class2_Sub34_Sub1(this);
				this.method561();
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
						Static102.method2276(100L);
					}
				}
				this.anOpengl1.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(553) Throwable local553) {
			local553.printStackTrace();
			this.method4255();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local553);
		}
	}

	@OriginalMember(owner = "client!ao", name = "K", descriptor = "()I")
	@Override
	public int method4302() {
		return this.anInt341;
	}

	@OriginalMember(owner = "client!ao", name = "M", descriptor = "()V")
	private void method536() {
		@Pc(2) float[] local2 = this.aFloatArray6;
		@Pc(14) float local14 = (float) (-this.anInt345 * this.anInt321) / (float) this.anInt351;
		@Pc(28) float local28 = (float) ((this.anInt320 - this.anInt345) * this.anInt321) / (float) this.anInt351;
		@Pc(39) float local39 = (float) (this.anInt344 * this.anInt321) / (float) this.anInt336;
		@Pc(53) float local53 = (float) ((this.anInt344 - this.anInt316) * this.anInt321) / (float) this.anInt336;
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
			@Pc(67) float local67 = (float) this.anInt321 * 2.0F;
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
			local2[10] = this.aFloat14 = (float) -(this.anInt341 + this.anInt321) / (float) (this.anInt341 - this.anInt321);
			local2[11] = -1.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = this.aFloat23 = -(local67 * (float) this.anInt341) / (float) (this.anInt341 - this.anInt321);
			local2[15] = 0.0F;
		}
		this.method540();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	@Override
	public void method4217(@OriginalArg(0) int arg0) {
		this.method541();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!um;")
	public Interface8 method537(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface8) (this.aBoolean33 ? new Class112_Sub2(this, arg0, arg1, false) : new Class50_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(FF)V")
	public void method538(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat24 = arg0;
		this.aFloat13 = arg1;
		if (!this.aBoolean28) {
			this.method598();
		}
	}

	@OriginalMember(owner = "client!ao", name = "A", descriptor = "()Z")
	@Override
	public boolean method4279() {
		return true;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)V")
	@Override
	public void method4254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean28) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt333 = arg1;
		this.anInt331 = arg2;
		this.method598();
		this.aClass196_1.method5559(true, arg0);
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method4251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method582();
		this.method572(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(II)I")
	@Override
	public int method4256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ao", name = "N", descriptor = "()V")
	private void method539() {
		this.lb = this.anInt338 - this.anInt345;
		this.aFloat7 = this.anInt327 - this.anInt345;
		this.aFloat20 = this.anInt332 - this.anInt344;
		this.aFloat15 = this.anInt353 - this.anInt344;
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(IIII)V")
	@Override
	public void method4266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt345 = arg0;
		this.anInt344 = arg1;
		this.anInt351 = arg2;
		this.anInt336 = arg3;
		this.method536();
		this.method539();
		if (this.anInt352 == 3) {
			this.method601();
		} else if (this.anInt352 == 2) {
			this.method595();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt347 != arg0;
		if (local7 || this.aFloat18 != arg1 || this.aFloat26 != arg2) {
			this.anInt347 = arg0;
			this.aFloat18 = arg1;
			this.aFloat26 = arg2;
			if (local7) {
				this.aFloat17 = (float) (this.anInt347 & 0xFF0000) / 1.671168E7F;
				this.aFloat12 = (float) (this.anInt347 & 0xFFFF) / 65535.0F;
				this.aFloat25 = (float) (this.anInt347 & 0xFF) / 255.0F;
				this.method589();
			}
			this.method556();
		}
		if (this.aFloatArray7[0] == arg3 && this.aFloatArray7[1] == arg4 && this.aFloatArray7[2] == arg5) {
			return;
		}
		this.aFloatArray7[0] = arg3;
		this.aFloatArray7[1] = arg4;
		this.aFloatArray7[2] = arg5;
		this.aFloatArray5[0] = -arg3;
		this.aFloatArray5[1] = -arg4;
		this.aFloatArray5[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray8[0] = arg3 * local132;
		this.aFloatArray8[1] = arg4 * local132;
		this.aFloatArray8[2] = arg5 * local132;
		this.aFloatArray9[0] = -this.aFloatArray8[0];
		this.aFloatArray9[1] = -this.aFloatArray8[1];
		this.aFloatArray9[2] = -this.aFloatArray8[2];
		this.method554();
		this.anInt340 = (int) (arg3 * 256.0F / arg4);
		this.anInt349 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "()F")
	@Override
	public float method4248() {
		return this.aFloat21;
	}

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "()Lclient!nc;")
	@Override
	public Class133 method4244() {
		return this.aClass133_1;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([IIIII)Lclient!gj;")
	@Override
	public Class31 method4227(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class31_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4257(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "()V")
	@Override
	public void method3558() {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!bm;Lclient!bm;FLclient!bm;)Lclient!bm;")
	@Override
	public Class22 method4295(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class22 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean41 && this.aBoolean45) {
			@Pc(11) Class22_Sub1_Sub1 local11 = null;
			@Pc(14) Class22_Sub1 local14 = (Class22_Sub1) arg0;
			@Pc(17) Class22_Sub1 local17 = (Class22_Sub1) arg1;
			@Pc(21) Class124_Sub3 local21 = local14.method5765();
			@Pc(25) Class124_Sub3 local25 = local17.method5765();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt6710 > local25.anInt6710 ? local21.anInt6710 : local25.anInt6710;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class22_Sub1_Sub1) {
					@Pc(52) Class22_Sub1_Sub1 local52 = (Class22_Sub1_Sub1) arg3;
					if (local52.method3652() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class22_Sub1_Sub1(this, local40);
				}
				local11.method3653(local25, local21, arg2);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ao", name = "O", descriptor = "()V")
	private void method540() {
		if (this.aFloat8 == 0.0F) {
			this.aFloatArray6[10] = this.aFloat14;
			this.aFloatArray6[14] = this.aFloat23;
		} else {
			@Pc(13) float local13 = this.aFloat21 / (this.aFloat8 + this.aFloat21);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat23 * (1.0F - local13) * (1.0F - local13) / this.aFloat8;
			this.aFloatArray6[10] = this.aFloat14 + local32;
			this.aFloatArray6[14] = this.aFloat23 * local17;
		}
		this.aFloat10 = (this.aFloatArray6[14] - (float) this.anInt341) / this.aFloatArray6[10];
		this.aFloat16 = (float) this.anInt341 - this.aFloat8;
	}

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "()I")
	@Override
	public int method4239() {
		@Pc(2) int local2 = this.anInt355;
		this.anInt355 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ao", name = "P", descriptor = "()V")
	private void method541() {
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
			Static102.method2276(1000L);
		}
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(II)V")
	public synchronized void method542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub42 local4 = new Class2_Sub42(arg1);
		local4.aLong213 = arg0;
		this.aClass216_11.method5995(local4);
	}

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "(I)I")
	public int method543(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "(I)V")
	public synchronized void method544(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub42 local4 = new Class2_Sub42(arg0);
		this.aClass216_12.method5995(local4);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!em;)V")
	@Override
	public void method4262(@OriginalArg(0) Class2_Sub17 arg0) {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt338 < arg0) {
			this.anInt338 = arg0;
		}
		if (this.anInt327 > arg2) {
			this.anInt327 = arg2;
		}
		if (this.anInt332 < arg1) {
			this.anInt332 = arg1;
		}
		if (this.anInt353 > arg3) {
			this.anInt353 = arg3;
		}
		this.anOpengl1.glEnable(3089);
		this.method539();
		this.method604();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!bm;)V")
	@Override
	public void method4243(@OriginalArg(0) Class22 arg0) {
		this.aClass22_Sub1_1 = (Class22_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!gm;)V")
	@Override
	public void method4303(@OriginalArg(0) Class75 arg0) {
		this.aClass85_1.method2515(this, arg0);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZZ)V")
	public void method545(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt326) {
			if (arg0 < 0) {
				this.method555();
				this.method602(null);
				if (!this.aBoolean28) {
					this.aClass196_1.method5560(0, arg2, arg1);
				}
			} else {
				@Pc(11) Class124_Sub2 local11 = this.aClass29_1.method863(arg0);
				@Pc(17) Class213 local17 = this.anInterface7_1.method5778(arg0);
				if (local17.aByte71 == 0 && local17.aByte73 == 0) {
					this.method555();
				} else {
					@Pc(30) int local30 = local17.aBoolean609 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method571((float) (this.anInt319 % local34 * local17.aByte71) / (float) local34, (float) (this.anInt319 % local34 * local17.aByte73) / (float) local34, 0.0F);
				}
				if (this.aBoolean28) {
					this.aClass196_1.method5560(3, arg2, arg1);
					this.method602(local11);
				} else {
					this.aClass196_1.method5560(local17.aByte72, arg2, arg1);
					this.aClass196_1.method5559(false, local17.aByte76);
					if (!this.aClass196_1.method5561(local11)) {
						this.method602(local11);
					}
				}
			}
			this.anInt326 = arg0;
		}
		this.anInt346 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!tj;)V")
	public void method546(@OriginalArg(0) Interface6 arg0) {
		if (this.anInt312 < 0 || this.anInterface6Array1[this.anInt312] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface6Array1[this.anInt312--] = null;
		arg0.method3558();
		if (this.anInt312 >= 0) {
			this.anInterface6_1 = this.anInterface6Array1[this.anInt312];
			this.anInterface6_1.method3559();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!tr;IIII)Lclient!bk;")
	@Override
	public Class7 method4237(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class7_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(Z)V")
	public void method547(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean38) {
			this.aBoolean38 = arg0;
			this.method575();
			this.anInt346 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ao", name = "x", descriptor = "()Lclient!nc;")
	@Override
	public Class133 method4273() {
		return new Class133_Sub2();
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(Z)V")
	public void method548(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean42) {
			this.aBoolean42 = arg0;
			this.method594();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I[Lclient!qp;)V")
	@Override
	public void method4284(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub36[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class2_Sub36 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static13.aFloatArray4[0] = local8.anInt5111;
			Static13.aFloatArray4[1] = local8.anInt5109;
			Static13.aFloatArray4[2] = local8.anInt5115;
			Static13.aFloatArray4[3] = 1.0F;
			this.anOpengl1.glLightfv(local12, 4611, Static13.aFloatArray4, 0);
			@Pc(44) int local44 = local8.anInt5117;
			@Pc(49) float local49 = local8.aFloat71 / 255.0F;
			Static13.aFloatArray4[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static13.aFloatArray4[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static13.aFloatArray4[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl1.glLightfv(local12, 4609, Static13.aFloatArray4, 0);
			this.anOpengl1.glLightf(local12, 4617, 1.0F / (float) (local8.anInt5108 * local8.anInt5108));
			this.anOpengl1.glEnable(local12);
		}
		while (local1 < this.anInt343) {
			this.anOpengl1.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt343 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "()Z")
	@Override
	public boolean method4258() {
		return true;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(FF)V")
	@Override
	public void method4306(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat21 && arg1 == this.aFloat8) {
			return;
		}
		this.aFloat21 = arg0;
		this.aFloat8 = arg1;
		this.method540();
		if (this.anInt352 == 3) {
			this.method601();
		} else if (this.anInt352 == 2) {
			this.method595();
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "()V")
	@Override
	public void method3559() {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([Lclient!bk;Lclient!gm;Lclient!nc;[Lclient!kf;I)V")
	@Override
	public void method4277(@OriginalArg(0) Class7[] arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(3) Class55_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method4280(arg0, arg2, arg3, arg4);
		this.method4303(arg1);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!pm;)V")
	public void method549(@OriginalArg(0) Class133_Sub2 arg0) {
		this.anOpengl1.glPushMatrix();
		this.anOpengl1.glMultMatrixf(arg0.method4341(), 0);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIILclient!hb;II)V")
	@Override
	public void method4250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class77 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class77_Sub2 local2 = (Class77_Sub2) arg5;
		@Pc(5) Class124_Sub2_Sub1 local5 = local2.aClass124_Sub2_Sub1_5;
		this.method603();
		this.method602(local2.aClass124_Sub2_Sub1_5);
		this.method572(1);
		this.method580(7681, 8448);
		this.method590(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat73 / (float) local5.anInt5595;
		@Pc(37) float local37 = local5.aFloat72 / (float) local5.anInt5594;
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
		this.method590(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([I)V")
	@Override
	public void method4235(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt338;
		arg0[1] = this.anInt332;
		arg0[2] = this.anInt327;
		arg0[3] = this.anInt353;
	}

	@OriginalMember(owner = "client!ao", name = "Q", descriptor = "()V")
	private void method550() {
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl1.glMultMatrixf(this.aClass133_Sub2_1.method4341(), 0);
		this.method554();
	}

	@OriginalMember(owner = "client!ao", name = "y", descriptor = "()Z")
	@Override
	public boolean method4275() {
		if (!this.aClass2_Sub34_Sub1_1.method4354()) {
			if (!this.aClass42_1.method1234(this.aClass2_Sub34_Sub1_1)) {
				return false;
			}
			this.aClass29_1.method862();
		}
		return true;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I[BIZ)Lclient!um;")
	public Interface8 method551(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface8) (this.aBoolean33 && (!arg3 || this.aBoolean31) ? new Class112_Sub2(this, arg0, arg1, arg2, arg3) : new Class50_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "(I)I")
	public int method552(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!th;[Lclient!go;Z)Lclient!sj;")
	@Override
	public Class37 method4305(@OriginalArg(0) Class188 arg0, @OriginalArg(1) Class76[] arg1) {
		return new Class37_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "(II)V")
	public void method553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt339 = arg0;
		this.anInt342 = arg1;
		this.anOpengl1.glViewport(arg0, arg1, this.anInt320, this.anInt316);
		this.method604();
	}

	@OriginalMember(owner = "client!ao", name = "R", descriptor = "()V")
	public void method554() {
		this.anOpengl1.glLightfv(16384, 4611, this.aFloatArray8, 0);
		this.anOpengl1.glLightfv(16385, 4611, this.aFloatArray9, 0);
	}

	@OriginalMember(owner = "client!ao", name = "S", descriptor = "()V")
	private void method555() {
		if (this.aBoolean46) {
			this.anOpengl1.glMatrixMode(5890);
			this.anOpengl1.glLoadIdentity();
			this.anOpengl1.glMatrixMode(5888);
			this.aBoolean46 = false;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!nc;)V")
	@Override
	public void method4233(@OriginalArg(0) Class133 arg0) {
		this.aClass133_Sub2_1 = (Class133_Sub2) arg0;
		this.aClass133_Sub2_2.method4342(this.aClass133_Sub2_1);
		if (this.anInt352 != 1) {
			this.method550();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[I[I)Lclient!hb;")
	@Override
	public Class77 method4242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static371.method5715(arg2, arg3, arg1, arg0, this);
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(IIII)V")
	@Override
	public void method4222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass42_1.method1239(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ao", name = "s", descriptor = "()I")
	@Override
	public int method4263() {
		return 4;
	}

	@OriginalMember(owner = "client!ao", name = "T", descriptor = "()V")
	private void method556() {
		Static13.aFloatArray3[0] = this.aFloat18 * this.aFloat17;
		Static13.aFloatArray3[1] = this.aFloat18 * this.aFloat12;
		Static13.aFloatArray3[2] = this.aFloat18 * this.aFloat25;
		Static13.aFloatArray3[3] = 1.0F;
		this.anOpengl1.glLightfv(16384, 4609, Static13.aFloatArray3, 0);
		Static13.aFloatArray3[0] = -this.aFloat26 * this.aFloat17;
		Static13.aFloatArray3[1] = -this.aFloat26 * this.aFloat12;
		Static13.aFloatArray3[2] = -this.aFloat26 * this.aFloat25;
		Static13.aFloatArray3[3] = 1.0F;
		this.anOpengl1.glLightfv(16385, 4609, Static13.aFloatArray3, 0);
	}

	@OriginalMember(owner = "client!ao", name = "U", descriptor = "()Lclient!vk;")
	public Class124_Sub3 method557() {
		return this.aClass22_Sub1_1 == null ? null : this.aClass22_Sub1_1.method5765();
	}

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)V")
	@Override
	public void method4283(@OriginalArg(0) int arg0) {
		this.method572(0);
		this.anOpengl1.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl1.glClear(16384);
	}

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "(Z)V")
	public void method558(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean40) {
			this.aBoolean40 = arg0;
			this.method592();
			this.anInt346 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(IIII)V")
	@Override
	public void method4252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt320) {
			arg2 = this.anInt320;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt316) {
			arg3 = this.anInt316;
		}
		this.anInt338 = arg0;
		this.anInt332 = arg1;
		this.anInt327 = arg2;
		this.anInt353 = arg3;
		this.anOpengl1.glEnable(3089);
		this.method539();
		this.method604();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4281(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method4298();
	}

	@OriginalMember(owner = "client!ao", name = "V", descriptor = "()V")
	private void method559() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "(I)V")
	public synchronized void method560(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub42 local4 = new Class2_Sub42(arg0);
		this.aClass216_14.method5995(local4);
	}

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "()I")
	@Override
	public int method4215() {
		return this.anInt321;
	}

	@OriginalMember(owner = "client!ao", name = "z", descriptor = "()Z")
	@Override
	public boolean method4278() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "()V")
	@Override
	public void method4225() {
		this.method558(true);
		this.anOpengl1.glClear(256);
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "()I")
	@Override
	public int method3560() {
		return this.anInt316;
	}

	@OriginalMember(owner = "client!ao", name = "W", descriptor = "()V")
	private void method561() {
		this.method578();
		for (@Pc(7) int local7 = this.anInt322 - 1; local7 >= 0; local7--) {
			this.method600(local7);
			this.method602(null);
			this.anOpengl1.glTexEnvi(8960, 8704, 34160);
		}
		this.method580(8448, 8448);
		this.method590(2, 34168, 770);
		this.method555();
		this.anInt337 = 1;
		this.anOpengl1.glEnable(3042);
		this.anOpengl1.glBlendFunc(770, 771);
		this.anInt350 = 1;
		this.anOpengl1.glEnable(3008);
		this.anOpengl1.glAlphaFunc(516, 0.0F);
		this.aBoolean44 = true;
		this.anOpengl1.glColorMask(true, true, true, true);
		this.aBoolean47 = true;
		this.method547(true);
		this.method568(true);
		this.method608(true);
		this.method558(true);
		this.method583();
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
		this.anInt347 = this.anInt324 = -1;
		this.method4299();
	}

	@OriginalMember(owner = "client!ao", name = "X", descriptor = "()V")
	private void method562() {
		if (this.anInt352 != 3) {
			this.anInt352 = 3;
			this.method601();
			this.method550();
			this.anInt346 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "()Z")
	@Override
	public boolean method4240() {
		return this.aClass2_Sub34_Sub1_1.method4354();
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(F)V")
	public void method563(@OriginalArg(0) float arg0) {
		if (this.aFloat9 != arg0) {
			this.aFloat9 = arg0;
			if (this.anInt352 == 3) {
				this.method601();
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "D", descriptor = "()F")
	@Override
	public float method4288() {
		return this.aFloat8;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([Lclient!bk;Lclient!nc;[Lclient!kf;I)V")
	@Override
	public void method4280(@OriginalArg(0) Class7[] arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) Class55_Sub4[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method1441(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "E", descriptor = "()Z")
	@Override
	public boolean method4290() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "(II)V")
	public synchronized void method564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub42 local4 = new Class2_Sub42(arg1);
		local4.aLong213 = arg0;
		this.aClass216_10.method5995(local4);
	}

	@OriginalMember(owner = "client!ao", name = "Y", descriptor = "()V")
	private void method565() {
		this.aClass133_Sub2_1 = new Class133_Sub2();
		this.aClass133_Sub2_2 = new Class133_Sub2();
		this.aClass124Array1 = new Class124[this.anInt322];
		this.aClass124_Sub2_1 = new Class124_Sub2(this, 3553, 6408, 1, 1);
		this.aClass124_Sub2_3 = new Class124_Sub2(this, 3553, 6408, 1, 1);
		this.aClass124_Sub2_2 = new Class124_Sub2(this, 3553, 6408, 1, 1);
		this.aClass7_Sub1_2 = new Class7_Sub1(this);
		this.aClass7_Sub1_1 = new Class7_Sub1(this);
		this.aClass7_Sub1_6 = new Class7_Sub1(this);
		this.aClass7_Sub1_3 = new Class7_Sub1(this);
		this.aClass7_Sub1_4 = new Class7_Sub1(this);
		this.aClass7_Sub1_5 = new Class7_Sub1(this);
		if (this.aBoolean45) {
			this.aClass128_1 = new Class128(this);
		}
		this.aClass85_1.method2518(this);
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I[BIZ)Lclient!as;")
	public Interface1 method566(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface1) (this.aBoolean33 && (!arg2 || this.aBoolean31) ? new Class112_Sub1(this, 5123, arg0, arg1, arg2) : new Class50_Sub1(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!go;Z)Lclient!gj;")
	@Override
	public Class31 method4214(@OriginalArg(0) Class76 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt2414 * arg0.anInt2415];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray40 == null) {
			for (local15 = 0; local15 < arg0.anInt2415; local15++) {
				for (local21 = 0; local21 < arg0.anInt2414; local21++) {
					@Pc(74) int local74 = arg0.anIntArray223[arg0.aByteArray41[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt2415; local15++) {
				for (local21 = 0; local21 < arg0.anInt2414; local21++) {
					local6[local10++] = arg0.aByteArray40[local8] << 24 | arg0.anIntArray223[arg0.aByteArray41[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class31 local100 = this.method4227(local6, arg0.anInt2414, arg0.anInt2414, arg0.anInt2415);
		local100.method4386(arg0.anInt2416, arg0.anInt2413, arg0.anInt2417, arg0.anInt2418);
		return local100;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!as;III)V")
	public void method567(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method576(arg0);
		arg0.method4323(arg1, arg2);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass133_Sub2_1.aFloat55 * (float) arg0 + this.aClass133_Sub2_1.aFloat59 * (float) arg1 + this.aClass133_Sub2_1.aFloat60 * (float) arg2 + this.aClass133_Sub2_1.aFloat56;
		if (local24 < (float) this.anInt321 || local24 > (float) this.anInt341) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt351 * (this.aClass133_Sub2_1.aFloat62 * (float) arg0 + this.aClass133_Sub2_1.aFloat64 * (float) arg1 + this.aClass133_Sub2_1.aFloat63 * (float) arg2 + this.aClass133_Sub2_1.aFloat57) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt336 * (this.aClass133_Sub2_1.aFloat58 * (float) arg0 + this.aClass133_Sub2_1.aFloat53 * (float) arg1 + this.aClass133_Sub2_1.aFloat61 * (float) arg2 + this.aClass133_Sub2_1.aFloat54) / local24);
		if ((float) local81 >= this.lb && (float) local81 <= this.aFloat7 && (float) local113 >= this.aFloat20 && (float) local113 <= this.aFloat15) {
			arg3[0] = (int) ((float) local81 - this.lb);
			arg3[1] = (int) ((float) local113 - this.aFloat20);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)V")
	@Override
	public void method4206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt324 == arg0 && this.anInt334 == arg1) {
			return;
		}
		this.anInt324 = arg0;
		this.anInt334 = arg1;
		if (!this.aBoolean28) {
			this.method598();
			this.method575();
		}
	}

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "(Z)V")
	public void method568(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean43) {
			this.aBoolean43 = arg0;
			this.method594();
			this.anInt346 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ao", name = "L", descriptor = "()V")
	@Override
	public void method4304() {
		if (this.aClass2_Sub34_Sub1_1.method4354()) {
			this.aClass42_1.method1237(this.aClass2_Sub34_Sub1_1);
			this.aClass29_1.method862();
		}
	}

	@OriginalMember(owner = "client!ao", name = "Z", descriptor = "()Lclient!tj;")
	public Interface6 method569() {
		return this.anInterface6_1;
	}

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "(I)V")
	public synchronized void method570(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub42 local4 = new Class2_Sub42(arg0);
		this.aClass216_15.method5995(local4);
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(FFF)V")
	private void method571(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl1.glMatrixMode(5890);
		if (this.aBoolean46) {
			this.anOpengl1.glLoadIdentity();
		}
		this.anOpengl1.glTranslatef(arg0, arg1, arg2);
		this.anOpengl1.glMatrixMode(5888);
		this.aBoolean46 = true;
	}

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "(I)V")
	public void method572(@OriginalArg(0) int arg0) {
		if (this.anInt337 == arg0) {
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
		if (local10 != this.aBoolean47) {
			this.anOpengl1.glColorMask(local10, local10, local10, true);
			this.aBoolean47 = local10;
		}
		if (local12 != this.aBoolean44) {
			if (local12) {
				this.anOpengl1.glEnable(3008);
			} else {
				this.anOpengl1.glDisable(3008);
			}
			this.aBoolean44 = local12;
		}
		if (local8 != this.anInt350) {
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
			this.anInt350 = local8;
		}
		this.anInt337 = arg0;
		this.anInt346 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4232(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class2_Sub42 local16;
		while (!this.aClass216_10.method5990()) {
			local16 = (Class2_Sub42) this.aClass216_10.method5999();
			Static13.anIntArray24[local1++] = (int) local16.aLong213;
			this.anInt314 -= local16.anInt6670;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteBuffersARB(local1, Static13.anIntArray24, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteBuffersARB(local1, Static13.anIntArray24, 0);
			local1 = 0;
		}
		while (!this.aClass216_11.method5990()) {
			local16 = (Class2_Sub42) this.aClass216_11.method5999();
			Static13.anIntArray24[local1++] = (int) local16.aLong213;
			this.anInt315 -= local16.anInt6670;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteTextures(local1, Static13.anIntArray24, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteTextures(local1, Static13.anIntArray24, 0);
			local1 = 0;
		}
		while (!this.aClass216_12.method5990()) {
			local16 = (Class2_Sub42) this.aClass216_12.method5999();
			Static13.anIntArray24[local1++] = local16.anInt6670;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteFramebuffersEXT(local1, Static13.anIntArray24, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteFramebuffersEXT(local1, Static13.anIntArray24, 0);
			local1 = 0;
		}
		while (!this.aClass216_13.method5990()) {
			local16 = (Class2_Sub42) this.aClass216_13.method5999();
			Static13.anIntArray24[local1++] = (int) local16.aLong213;
			this.anInt318 -= local16.anInt6670;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static13.anIntArray24, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static13.anIntArray24, 0);
			local1 = 0;
		}
		while (!this.aClass216_14.method5990()) {
			local16 = (Class2_Sub42) this.aClass216_14.method5999();
			Static13.anIntArray24[local1++] = (int) local16.aLong213;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteProgramsARB(local1, Static13.anIntArray24, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteProgramsARB(local1, Static13.anIntArray24, 0);
		}
		while (!this.aClass216_9.method5990()) {
			local16 = (Class2_Sub42) this.aClass216_9.method5999();
			this.anOpengl1.glDeleteLists((int) local16.aLong213, local16.anInt6670);
		}
		while (!this.aClass216_15.method5990()) {
			local16 = (Class2_Sub42) this.aClass216_15.method5999();
			this.anOpengl1.glDeleteObjectARB(local16.anInt6670);
		}
		while (!this.aClass216_9.method5990()) {
			local16 = (Class2_Sub42) this.aClass216_9.method5999();
			this.anOpengl1.glDeleteLists((int) local16.aLong213, local16.anInt6670);
		}
		if (this.method4253() > 100663296 && Static51.method1197() > this.aLong10 + 60000L) {
			System.gc();
			this.aLong10 = Static51.method1197();
		}
		this.anInt319 = local5;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method4247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass124_Sub2_Sub1_1 == null || this.aClass124_Sub2_Sub1_1.anInt5593 < arg2 || this.aClass124_Sub2_Sub1_1.anInt5592 < arg3) {
			this.aClass124_Sub2_Sub1_1 = Static370.method4996(arg2, this, arg6, arg3);
			this.aClass124_Sub2_Sub1_1.method4995(false, false);
			local32 = this.aClass124_Sub2_Sub1_1.aFloat72;
			local36 = this.aClass124_Sub2_Sub1_1.aFloat73;
		} else {
			this.aClass124_Sub2_Sub1_1.method4993(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass124_Sub2_Sub1_1.aFloat72 * (float) arg3 / (float) this.aClass124_Sub2_Sub1_1.anInt5592;
			local36 = this.aClass124_Sub2_Sub1_1.aFloat73 * (float) arg2 / (float) this.aClass124_Sub2_Sub1_1.anInt5593;
		}
		this.method603();
		this.method602(this.aClass124_Sub2_Sub1_1);
		this.method572(arg8);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method587(arg5);
		this.method580(34165, 34165);
		this.method590(0, 34166, 768);
		this.method590(2, 5890, 770);
		this.method588(0, 34166);
		this.method588(2, 5890);
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
		this.method590(0, 5890, 768);
		this.method590(2, 34166, 770);
		this.method588(0, 5890);
		this.method588(2, 34166);
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "()V")
	@Override
	public void method4208() {
		this.anInt320 = this.aCanvas1.getWidth();
		this.anInt316 = this.aCanvas1.getHeight();
		this.anOpengl1.glViewport(this.anInt339, this.anInt342, this.anInt320, this.anInt316);
		this.method583();
		this.method4299();
	}

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "()Z")
	@Override
	public boolean method4228() {
		return this.aClass196_1.method5562();
	}

	@OriginalMember(owner = "client!ao", name = "ab", descriptor = "()V")
	public void method573() {
		if (this.anInt352 != 2) {
			this.anInt352 = 2;
			this.method595();
			this.method550();
			this.anInt346 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ao", name = "t", descriptor = "()V")
	@Override
	public void method4264() {
		this.aClass42_1.method1236();
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(IIIII)V")
	@Override
	public void method4289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method582();
		this.method572(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!bk;Lclient!gm;Lclient!nc;Lclient!kf;I)V")
	@Override
	public void method4245(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(3) Class55_Sub4 arg3) {
		arg0.method1441(arg2, arg3, 0);
		this.method4303(arg1);
	}

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "(I)V")
	public void method574(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method580(7681, 7681);
		} else if (arg0 == 1) {
			this.method580(8448, 8448);
		} else if (arg0 == 2) {
			this.method580(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!ao", name = "bb", descriptor = "()V")
	private void method575() {
		if (this.aBoolean38 && this.aBoolean28 | this.anInt334 >= 0) {
			this.anOpengl1.glEnable(2912);
		} else {
			this.anOpengl1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(Z)V")
	@Override
	public void method4268(@OriginalArg(0) boolean arg0) {
		this.aBoolean30 = arg0;
		this.method592();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V")
	@Override
	public void method4205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt321 == arg0 && this.anInt341 == arg1) {
			return;
		}
		this.anInt321 = arg0;
		this.anInt341 = arg1;
		this.method536();
		this.method598();
		if (this.anInt352 == 3) {
			this.method601();
		} else if (this.anInt352 == 2) {
			this.method595();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!as;)V")
	public void method576(@OriginalArg(0) Interface1 arg0) {
		if (this.anInterface1_2 != arg0 && this.aBoolean33) {
			this.anOpengl1.glBindBufferARB(34963, arg0.method4970());
			this.anInterface1_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
	@Override
	public void method4219(@OriginalArg(0) int arg0) {
		this.method559();
	}

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "(II)V")
	public synchronized void method577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub42 local4 = new Class2_Sub42(arg1);
		local4.aLong213 = arg0;
		this.aClass216_12.method5995(local4);
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(IIIIII)Lclient!bm;")
	@Override
	public Class22 method4236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean41 ? new Class22_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(Z)V")
	@Override
	public void method4229(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "(I)V")
	public void method578() {
		this.method591(-2, true);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4249(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static246.aFloat67 = arg0;
		Static246.aFloat66 = arg1;
		Static246.aFloat65 = arg2;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!um;)V")
	public void method579(@OriginalArg(0) Interface8 arg0) {
		if (this.anInterface8_2 != arg0 && this.aBoolean33) {
			this.anOpengl1.glBindBufferARB(34962, arg0.method4970());
			this.anInterface8_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "(II)V")
	public void method580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt348 != 0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt330 != arg0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anInt330 = arg0;
			local4 = true;
		}
		if (this.anInt323 != arg1) {
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			this.anInt323 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt346 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ao", name = "H", descriptor = "()V")
	@Override
	public void method4298() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!ao", name = "I", descriptor = "()V")
	@Override
	public void method4299() {
		this.anInt338 = 0;
		this.anInt332 = 0;
		this.anInt327 = this.anInt320;
		this.anInt353 = this.anInt316;
		this.anOpengl1.glDisable(3089);
		this.method539();
	}

	@OriginalMember(owner = "client!ao", name = "cb", descriptor = "()V")
	public void method581() {
		if (this.anInt346 == 8) {
			return;
		}
		this.method573();
		this.method547(true);
		this.method608(true);
		this.method558(true);
		this.method572(1);
		this.method574(1);
		this.anInt346 = 8;
	}

	@OriginalMember(owner = "client!ao", name = "db", descriptor = "()V")
	private void method582() {
		if (this.anInt346 == 1) {
			return;
		}
		this.method596();
		this.method547(false);
		this.method568(false);
		this.method608(false);
		this.method558(false);
		this.method602(null);
		this.method578();
		this.method574(0);
		this.anInt346 = 1;
	}

	@OriginalMember(owner = "client!ao", name = "eb", descriptor = "()V")
	public void method583() {
		if (this.anInt352 != 0) {
			this.anInt352 = 0;
			this.anInt346 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!hf;Lclient!hf;Lclient!hf;Lclient!hf;)V")
	public void method584(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) Class81 arg3) {
		if (arg0 == null) {
			this.anOpengl1.glDisableClientState(32884);
		} else {
			this.anOpengl1.glEnableClientState(32884);
			arg0.method2501();
		}
		if (arg1 == null) {
			this.anOpengl1.glDisableClientState(32885);
		} else {
			this.anOpengl1.glEnableClientState(32885);
			arg1.method2499();
		}
		if (arg2 == null) {
			this.anOpengl1.glDisableClientState(32886);
		} else {
			this.anOpengl1.glEnableClientState(32886);
			arg2.method2502();
		}
		if (arg3 == null) {
			this.anOpengl1.glDisableClientState(32888);
		} else {
			this.anOpengl1.glEnableClientState(32888);
			arg3.method2500();
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(III)V")
	public void method585(@OriginalArg(2) int arg0) {
		this.anOpengl1.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ao", name = "fb", descriptor = "()V")
	public void method586() {
		if (this.anInt346 == 4) {
			return;
		}
		this.method596();
		this.method547(false);
		this.method568(false);
		this.method608(false);
		this.method558(false);
		this.method578();
		this.method572(1);
		this.method574(1);
		this.anInt346 = 4;
	}

	@OriginalMember(owner = "client!ao", name = "w", descriptor = "()Z")
	@Override
	public boolean method4272() {
		return this.aBoolean35;
	}

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "(I)V")
	public void method587(@OriginalArg(0) int arg0) {
		Static13.aFloatArray3[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static13.aFloatArray3[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static13.aFloatArray3[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static13.aFloatArray3[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static13.aFloatArray3, 0);
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "()V")
	@Override
	public void method4209() {
		this.aClass196_1.method5560(0, false, false);
		this.aBoolean28 = false;
		this.method598();
		this.method575();
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(III)V")
	public void method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ao", name = "C", descriptor = "()V")
	@Override
	public void method4285() {
		if (this.anInt320 <= 0 && this.anInt316 <= 0) {
			return;
		}
		@Pc(9) int local9 = this.anInt338;
		@Pc(12) int local12 = this.anInt327;
		@Pc(15) int local15 = this.anInt332;
		@Pc(18) int local18 = this.anInt353;
		this.method4299();
		this.anOpengl1.glReadBuffer(1028);
		this.anOpengl1.glDrawBuffer(1029);
		this.method583();
		this.method547(false);
		this.method568(false);
		this.method608(false);
		this.method558(false);
		this.method602(null);
		this.method578();
		this.method574(0);
		this.method572(0);
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRasterPos2i(0, 0);
		this.anOpengl1.glCopyPixels(0, 0, this.anInt320, this.anInt316, 6144);
		this.anOpengl1.glFlush();
		this.anOpengl1.glReadBuffer(1029);
		this.anOpengl1.glDrawBuffer(1029);
		this.method4252(local9, local15, local12, local18);
	}

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "(IIIIII)V")
	@Override
	public void method4287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method582();
		this.method572(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean35) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local23);
		this.anOpengl1.glVertex2f(local16, local23);
		this.anOpengl1.glVertex2f(local16, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean35) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[[I[[IIII)Lclient!gh;")
	@Override
	public Class73 method4224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class73_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ao", name = "gb", descriptor = "()V")
	private void method589() {
		Static13.aFloatArray3[0] = this.aFloat22 * this.aFloat17;
		Static13.aFloatArray3[1] = this.aFloat22 * this.aFloat12;
		Static13.aFloatArray3[2] = this.aFloat22 * this.aFloat25;
		Static13.aFloatArray3[3] = 1.0F;
		this.anOpengl1.glLightModelfv(2899, Static13.aFloatArray3, 0);
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method4246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method582();
		this.method572(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean35) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local19);
		this.anOpengl1.glVertex2f(local14, local19);
		this.anOpengl1.glVertex2f(local14, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean35) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(III)V")
	public void method590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)V")
	public void method591(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method545(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ao", name = "hb", descriptor = "()V")
	private void method592() {
		this.anOpengl1.glDepthMask(this.aBoolean40 && this.aBoolean30);
	}

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "()Z")
	@Override
	public boolean method4213() {
		return true;
	}

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "()I")
	@Override
	public int method4253() {
		return this.anInt314 + this.anInt315 + this.anInt318;
	}

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "()V")
	@Override
	protected void method4255() {
		if (this.anOpengl1 != null) {
			try {
				this.aClass42_1.method1233();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl1 = null;
		}
		if (this.aContext1 != null) {
			this.method559();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean27) {
			Static104.method4925(true);
			this.aBoolean27 = false;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4286() {
	}

	@OriginalMember(owner = "client!ao", name = "ib", descriptor = "()I")
	private int method593() {
		@Pc(1) int local1 = 0;
		this.aString7 = this.anOpengl1.glGetString(7936);
		this.aString8 = this.anOpengl1.glGetString(7937);
		@Pc(17) String local17 = this.aString7.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl1.glGetString(7938);
		@Pc(53) String[] local53 = Static336.method5829(local45.replace('.', ' '), ' ');
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static133.method2671(local53[0]);
				@Pc(69) int local69 = Static133.method2671(local53[1]);
				this.anInt325 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt325 < 12) {
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
		this.anInt322 = local116[0];
		this.anOpengl1.glGetIntegerv(34929, local116, 0);
		this.anInt329 = local116[0];
		this.anOpengl1.glGetIntegerv(34930, local116, 0);
		this.anInt335 = local116[0];
		if (this.anInt322 < 2 || this.anInt329 < 2 || this.anInt335 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean39 = Static268.aString52 != null && Static268.aString52.startsWith("mac");
		this.aBoolean32 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean33 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean35 = this.anOpengl1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean50 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean34 = this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean29 = this.anOpengl1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean48 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean41 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean36 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean37 = false;
		this.aBoolean45 = this.anOpengl1.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIII)Z")
	@Override
	public boolean method4226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass133_Sub2_1.aFloat55 * (float) arg0 + this.aClass133_Sub2_1.aFloat59 * (float) arg1 + this.aClass133_Sub2_1.aFloat60 * (float) arg2 + this.aClass133_Sub2_1.aFloat56;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass133_Sub2_1.aFloat55 * (float) arg3 + this.aClass133_Sub2_1.aFloat59 * (float) arg4 + this.aClass133_Sub2_1.aFloat60 * (float) arg5 + this.aClass133_Sub2_1.aFloat56;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt321 && local55 < (float) this.anInt321 || !(!(local24 > (float) this.anInt341) || !(local55 > (float) this.anInt341))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt351 * (this.aClass133_Sub2_1.aFloat62 * (float) arg0 + this.aClass133_Sub2_1.aFloat64 * (float) arg1 + this.aClass133_Sub2_1.aFloat63 * (float) arg2 + this.aClass133_Sub2_1.aFloat57) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt351 * (this.aClass133_Sub2_1.aFloat62 * (float) arg3 + this.aClass133_Sub2_1.aFloat64 * (float) arg4 + this.aClass133_Sub2_1.aFloat63 * (float) arg5 + this.aClass133_Sub2_1.aFloat57) / local55);
		if ((float) local119 < this.lb && (float) local151 < this.lb || (float) local119 > this.aFloat7 && (float) local151 > this.aFloat7) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt336 * (this.aClass133_Sub2_1.aFloat58 * (float) arg0 + this.aClass133_Sub2_1.aFloat53 * (float) arg1 + this.aClass133_Sub2_1.aFloat61 * (float) arg2 + this.aClass133_Sub2_1.aFloat54) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt336 * (this.aClass133_Sub2_1.aFloat58 * (float) arg3 + this.aClass133_Sub2_1.aFloat53 * (float) arg4 + this.aClass133_Sub2_1.aFloat61 * (float) arg5 + this.aClass133_Sub2_1.aFloat54) / local55);
			return (!((float) local209 < this.aFloat20) || !((float) local241 < this.aFloat20)) && (!((float) local209 > this.aFloat15) || !((float) local241 > this.aFloat15));
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method4207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIII)[I")
	@Override
	public int[] method4212() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl1.glReadPixels(0, this.anInt316 - local6, 36, 1, 32993, this.anInt328, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!ao", name = "v", descriptor = "()V")
	@Override
	public void method4271() {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(F)V")
	@Override
	public void method4216(@OriginalArg(0) float arg0) {
		if (this.aFloat22 != arg0) {
			this.aFloat22 = arg0;
			this.method589();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl1.glLineWidth((float) arg5);
		this.method4259(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!hb;II)V")
	@Override
	public void method4269(@OriginalArg(1) Class77 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class77_Sub2 local2 = (Class77_Sub2) arg0;
		@Pc(5) Class124_Sub2_Sub1 local5 = local2.aClass124_Sub2_Sub1_5;
		this.method603();
		this.method602(local2.aClass124_Sub2_Sub1_5);
		this.method572(1);
		this.method580(7681, 8448);
		this.method590(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat73 / (float) local5.anInt5595;
		@Pc(37) float local37 = local5.aFloat72 / (float) local5.anInt5594;
		this.anOpengl1.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt338 - arg1), local37 * (float) (this.anInt332 - arg2));
		this.anOpengl1.glVertex2i(this.anInt338, this.anInt332);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt338 - arg1), local37 * (float) (this.anInt353 - arg2));
		this.anOpengl1.glVertex2i(this.anInt338, this.anInt353);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt327 - arg1), local37 * (float) (this.anInt353 - arg2));
		this.anOpengl1.glVertex2i(this.anInt327, this.anInt353);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt327 - arg1), local37 * (float) (this.anInt332 - arg2));
		this.anOpengl1.glVertex2i(this.anInt327, this.anInt332);
		this.anOpengl1.glEnd();
		this.method590(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V")
	@Override
	public void method4218(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ao", name = "jb", descriptor = "()V")
	private void method594() {
		if (this.aBoolean43 && !this.aBoolean42) {
			this.anOpengl1.glEnable(2896);
		} else {
			this.anOpengl1.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(II)I")
	@Override
	public int method4276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "()Z")
	@Override
	public boolean method4211() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "kb", descriptor = "()V")
	private void method595() {
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadMatrixf(this.aFloatArray6, 0);
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ao", name = "B", descriptor = "()Z")
	@Override
	public boolean method4282() {
		return true;
	}

	@OriginalMember(owner = "client!ao", name = "lb", descriptor = "()V")
	private void method596() {
		if (this.anInt352 == 1) {
			return;
		}
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (this.anInt320 > 0 && this.anInt316 > 0) {
			this.anOpengl1.glOrtho(0.0D, (double) this.anInt320, (double) this.anInt316, 0.0D, -1.0D, 1.0D);
		}
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anInt352 = 1;
		this.anInt346 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method4259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method582();
		this.method572(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "()Z")
	@Override
	public boolean method4231() {
		return !this.aBoolean39;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(Lclient!tj;)V")
	public void method597(@OriginalArg(0) Interface6 arg0) {
		if (this.anInt312 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt312 >= 0) {
			this.anInterface6Array1[this.anInt312].method3558();
		}
		this.anInterface6_1 = this.anInterface6Array1[++this.anInt312] = arg0;
		this.anInterface6_1.method3559();
	}

	@OriginalMember(owner = "client!ao", name = "mb", descriptor = "()V")
	private void method598() {
		@Pc(15) int local15;
		if (this.aBoolean28) {
			this.anOpengl1.glFogf(2915, 0.0F);
			this.anOpengl1.glFogf(2916, 1.0F);
			local15 = this.anInt333;
		} else {
			this.aFloat11 = (float) (this.anInt341 - 256) - this.aFloat13;
			this.aFloat19 = this.aFloat11 - (float) this.anInt334 * this.aFloat24;
			if (this.aFloat19 < (float) this.anInt321) {
				this.aFloat19 = this.anInt321;
			}
			this.anOpengl1.glFogf(2915, this.aFloat19);
			this.anOpengl1.glFogf(2916, this.aFloat11);
			local15 = this.anInt324;
		}
		Static13.aFloatArray3[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static13.aFloatArray3[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static13.aFloatArray3[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl1.glFogfv(2918, Static13.aFloatArray3, 0);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(FFFF)V")
	public void method599(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static13.aFloatArray3[0] = arg0;
		Static13.aFloatArray3[1] = arg1;
		Static13.aFloatArray3[2] = arg2;
		Static13.aFloatArray3[3] = arg3;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static13.aFloatArray3, 0);
	}

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "(I)V")
	public void method600(@OriginalArg(0) int arg0) {
		if (this.anInt348 != arg0) {
			this.anOpengl1.glActiveTexture(arg0 + 33984);
			this.anInt348 = arg0;
		}
	}

	@OriginalMember(owner = "client!ao", name = "J", descriptor = "()Z")
	@Override
	public boolean method4301() {
		return true;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(III)V")
	@Override
	public void method4270() {
		this.aBoolean28 = true;
		this.anInt333 = 1583160;
		this.anInt331 = 40;
		this.method598();
		this.method575();
		this.aClass196_1.method5560(3, false, false);
		this.aClass196_1.method5559(true, -1);
	}

	@OriginalMember(owner = "client!ao", name = "F", descriptor = "()Z")
	@Override
	public boolean method4294() {
		return this.aClass2_Sub34_Sub1_1.method4361();
	}

	@OriginalMember(owner = "client!ao", name = "u", descriptor = "()I")
	@Override
	public int method4265() {
		@Pc(2) int local2 = this.anInt354;
		this.anInt354 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIZ)Lclient!gj;")
	@Override
	public Class31 method4291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class31_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ao", name = "nb", descriptor = "()V")
	private void method601() {
		@Pc(11) float local11 = (float) -this.anInt345 * this.aFloat9 / (float) this.anInt351;
		@Pc(23) float local23 = (float) -this.anInt344 * this.aFloat9 / (float) this.anInt336;
		@Pc(37) float local37 = (float) (this.anInt320 - this.anInt345) * this.aFloat9 / (float) this.anInt351;
		@Pc(51) float local51 = (float) (this.anInt316 - this.anInt344) * this.aFloat9 / (float) this.anInt336;
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (local11 != local37 && local51 != local23) {
			this.anOpengl1.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt321 - this.aFloat8), (double) ((float) this.anInt341 - this.aFloat8));
		}
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!lp;)V")
	public void method602(@OriginalArg(0) Class124 arg0) {
		@Pc(5) Class124 local5 = this.aClass124Array1[this.anInt348];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl1.glDisable(local5.anInt6844);
			} else {
				if (local5 == null) {
					this.anOpengl1.glEnable(arg0.anInt6844);
				} else if (arg0.anInt6844 != local5.anInt6844) {
					this.anOpengl1.glDisable(local5.anInt6844);
					this.anOpengl1.glEnable(arg0.anInt6844);
				}
				this.anOpengl1.glBindTexture(arg0.anInt6844, arg0.method5902());
			}
			this.aClass124Array1[this.anInt348] = arg0;
		}
		this.anInt346 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ao", name = "ob", descriptor = "()V")
	public void method603() {
		if (this.anInt346 == 2) {
			return;
		}
		this.method596();
		this.method547(false);
		this.method568(false);
		this.method608(false);
		this.method558(false);
		this.method578();
		this.anInt346 = 2;
	}

	@OriginalMember(owner = "client!ao", name = "pb", descriptor = "()V")
	private void method604() {
		if (this.anInt338 <= this.anInt327 && this.anInt332 <= this.anInt353) {
			this.anOpengl1.glScissor(this.anInt339 + this.anInt338, this.anInt342 + this.anInt316 - this.anInt353, this.anInt327 - this.anInt338, this.anInt353 - this.anInt332);
		} else {
			this.anOpengl1.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "(I)I")
	public int method605(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "(I)Lclient!em;")
	@Override
	public Class2_Sub17 method4293() {
		return null;
	}

	@OriginalMember(owner = "client!ao", name = "qb", descriptor = "()V")
	public void method606() {
		this.anOpengl1.glPopMatrix();
	}

	@OriginalMember(owner = "client!ao", name = "rb", descriptor = "()V")
	public void method607() {
		if (this.anInt346 == 16) {
			return;
		}
		this.method562();
		this.method547(true);
		this.method608(true);
		this.method558(true);
		this.method572(1);
		this.method574(1);
		this.anInt346 = 16;
	}

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "(Z)V")
	public void method608(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean49) {
			return;
		}
		if (arg0) {
			this.anOpengl1.glEnable(2929);
		} else {
			this.anOpengl1.glDisable(2929);
		}
		this.aBoolean49 = arg0;
		this.anInt346 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V")
	@Override
	public void method4267(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!ao", name = "G", descriptor = "()Z")
	@Override
	public boolean method4297() {
		return true;
	}
}
