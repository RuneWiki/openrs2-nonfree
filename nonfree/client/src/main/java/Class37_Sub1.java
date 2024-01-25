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

@OriginalClass("client!cg")
public final class Class37_Sub1 extends Class37 implements Interface10 {

	@OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
	private int anInt631;

	@OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
	public int anInt633;

	@OriginalMember(owner = "client!cg", name = "Q", descriptor = "I")
	public int anInt635;

	@OriginalMember(owner = "client!cg", name = "R", descriptor = "I")
	public int anInt636;

	@OriginalMember(owner = "client!cg", name = "S", descriptor = "I")
	public int anInt637;

	@OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
	public int anInt638;

	@OriginalMember(owner = "client!cg", name = "V", descriptor = "Lclient!vd;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!cg", name = "db", descriptor = "Lclient!d;")
	public Class49_Sub1 aClass49_Sub1_1;

	@OriginalMember(owner = "client!cg", name = "hb", descriptor = "I")
	public int anInt641;

	@OriginalMember(owner = "client!cg", name = "ib", descriptor = "Lclient!bh;")
	public Class23 aClass23_2;

	@OriginalMember(owner = "client!cg", name = "lb", descriptor = "F")
	public float lb;

	@OriginalMember(owner = "client!cg", name = "mb", descriptor = "I")
	private int anInt644;

	@OriginalMember(owner = "client!cg", name = "nb", descriptor = "F")
	private float aFloat2;

	@OriginalMember(owner = "client!cg", name = "ob", descriptor = "I")
	private int anInt645;

	@OriginalMember(owner = "client!cg", name = "pb", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!cg", name = "ub", descriptor = "I")
	private int anInt649;

	@OriginalMember(owner = "client!cg", name = "vb", descriptor = "I")
	private int anInt650;

	@OriginalMember(owner = "client!cg", name = "xb", descriptor = "F")
	public float aFloat4;

	@OriginalMember(owner = "client!cg", name = "yb", descriptor = "I")
	private int anInt652;

	@OriginalMember(owner = "client!cg", name = "zb", descriptor = "F")
	public float aFloat5;

	@OriginalMember(owner = "client!cg", name = "Bb", descriptor = "Z")
	public boolean aBoolean58;

	@OriginalMember(owner = "client!cg", name = "Cb", descriptor = "Z")
	public boolean aBoolean59;

	@OriginalMember(owner = "client!cg", name = "Db", descriptor = "Z")
	private boolean aBoolean60;

	@OriginalMember(owner = "client!cg", name = "Hb", descriptor = "I")
	private int anInt655;

	@OriginalMember(owner = "client!cg", name = "Ib", descriptor = "Z")
	private boolean aBoolean62;

	@OriginalMember(owner = "client!cg", name = "Kb", descriptor = "I")
	public int anInt656;

	@OriginalMember(owner = "client!cg", name = "Mb", descriptor = "I")
	private int anInt657;

	@OriginalMember(owner = "client!cg", name = "Ob", descriptor = "Z")
	private boolean aBoolean63;

	@OriginalMember(owner = "client!cg", name = "Qb", descriptor = "Z")
	private boolean aBoolean64;

	@OriginalMember(owner = "client!cg", name = "Tb", descriptor = "Lclient!d;")
	public Class49_Sub1 aClass49_Sub1_2;

	@OriginalMember(owner = "client!cg", name = "Wb", descriptor = "F")
	private float aFloat9;

	@OriginalMember(owner = "client!cg", name = "Xb", descriptor = "Lclient!d;")
	public Class49_Sub1 aClass49_Sub1_3;

	@OriginalMember(owner = "client!cg", name = "Zb", descriptor = "I")
	public int anInt661;

	@OriginalMember(owner = "client!cg", name = "bc", descriptor = "Lclient!pq;")
	public Class81_Sub4 aClass81_Sub4_2;

	@OriginalMember(owner = "client!cg", name = "dc", descriptor = "Lclient!pm;")
	public Class38_Sub2 aClass38_Sub2_1;

	@OriginalMember(owner = "client!cg", name = "gc", descriptor = "Lclient!d;")
	public Class49_Sub1 aClass49_Sub1_4;

	@OriginalMember(owner = "client!cg", name = "hc", descriptor = "Lclient!d;")
	public Class49_Sub1 aClass49_Sub1_5;

	@OriginalMember(owner = "client!cg", name = "jc", descriptor = "I")
	private int anInt665;

	@OriginalMember(owner = "client!cg", name = "kc", descriptor = "Z")
	public boolean aBoolean67;

	@OriginalMember(owner = "client!cg", name = "mc", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!cg", name = "pc", descriptor = "Lclient!qq;")
	private Class81_Sub4_Sub1 aClass81_Sub4_Sub1_1;

	@OriginalMember(owner = "client!cg", name = "rc", descriptor = "Z")
	public boolean aBoolean69;

	@OriginalMember(owner = "client!cg", name = "uc", descriptor = "I")
	private int anInt669;

	@OriginalMember(owner = "client!cg", name = "vc", descriptor = "Lclient!pq;")
	public Class81_Sub4 aClass81_Sub4_3;

	@OriginalMember(owner = "client!cg", name = "wc", descriptor = "Z")
	private boolean aBoolean70;

	@OriginalMember(owner = "client!cg", name = "yc", descriptor = "Lclient!na;")
	private Interface7 anInterface7_1;

	@OriginalMember(owner = "client!cg", name = "zc", descriptor = "Z")
	private boolean aBoolean71;

	@OriginalMember(owner = "client!cg", name = "Ac", descriptor = "Z")
	public boolean aBoolean72;

	@OriginalMember(owner = "client!cg", name = "Bc", descriptor = "J")
	private long aLong28;

	@OriginalMember(owner = "client!cg", name = "Cc", descriptor = "Z")
	public boolean aBoolean73;

	@OriginalMember(owner = "client!cg", name = "Dc", descriptor = "Lclient!d;")
	public Class49_Sub1 aClass49_Sub1_6;

	@OriginalMember(owner = "client!cg", name = "Ec", descriptor = "[Lclient!q;")
	private Class81[] aClass81Array1;

	@OriginalMember(owner = "client!cg", name = "Hc", descriptor = "Lclient!d;")
	public Class49_Sub1 aClass49_Sub1_7;

	@OriginalMember(owner = "client!cg", name = "Ic", descriptor = "Z")
	private boolean aBoolean74;

	@OriginalMember(owner = "client!cg", name = "Jc", descriptor = "Lclient!di;")
	private Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!cg", name = "Kc", descriptor = "Z")
	private boolean aBoolean75;

	@OriginalMember(owner = "client!cg", name = "Mc", descriptor = "F")
	public float aFloat17;

	@OriginalMember(owner = "client!cg", name = "Rc", descriptor = "Lclient!pm;")
	public Class38_Sub2 aClass38_Sub2_2;

	@OriginalMember(owner = "client!cg", name = "Tc", descriptor = "F")
	private float aFloat18;

	@OriginalMember(owner = "client!cg", name = "Uc", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!cg", name = "Vc", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!cg", name = "Wc", descriptor = "Z")
	private boolean aBoolean78;

	@OriginalMember(owner = "client!cg", name = "Xc", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!cg", name = "Yc", descriptor = "Lclient!d;")
	public Class49_Sub1 aClass49_Sub1_8;

	@OriginalMember(owner = "client!cg", name = "Zc", descriptor = "Z")
	private boolean aBoolean79;

	@OriginalMember(owner = "client!cg", name = "ad", descriptor = "Lclient!pq;")
	public Class81_Sub4 aClass81_Sub4_4;

	@OriginalMember(owner = "client!cg", name = "bd", descriptor = "Lclient!io;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "client!cg", name = "cd", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!cg", name = "dd", descriptor = "I")
	private int anInt673;

	@OriginalMember(owner = "client!cg", name = "ed", descriptor = "I")
	private int anInt674;

	@OriginalMember(owner = "client!cg", name = "D", descriptor = "Lclient!vr;")
	private final Class211 aClass211_1 = new Class211();

	@OriginalMember(owner = "client!cg", name = "J", descriptor = "Lclient!jd;")
	private final Class38 aClass38_1 = new Class38_Sub2();

	@OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
	public final int anInt632 = 8;

	@OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
	private int anInt634 = -1;

	@OriginalMember(owner = "client!cg", name = "U", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!cg", name = "N", descriptor = "[Lclient!vd;")
	private final Interface10[] anInterface10Array1 = new Interface10[4];

	@OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
	public final int anInt639 = 3;

	@OriginalMember(owner = "client!cg", name = "K", descriptor = "Lclient!sf;")
	private final Class180 aClass180_5 = new Class180();

	@OriginalMember(owner = "client!cg", name = "X", descriptor = "Lclient!sf;")
	private final Class180 aClass180_6 = new Class180();

	@OriginalMember(owner = "client!cg", name = "Y", descriptor = "Lclient!sf;")
	private final Class180 aClass180_7 = new Class180();

	@OriginalMember(owner = "client!cg", name = "Z", descriptor = "Lclient!sf;")
	private final Class180 aClass180_8 = new Class180();

	@OriginalMember(owner = "client!cg", name = "ab", descriptor = "Lclient!sf;")
	private final Class180 aClass180_9 = new Class180();

	@OriginalMember(owner = "client!cg", name = "bb", descriptor = "Lclient!sf;")
	private final Class180 aClass180_10 = new Class180();

	@OriginalMember(owner = "client!cg", name = "cb", descriptor = "Lclient!sf;")
	private final Class180 aClass180_11 = new Class180();

	@OriginalMember(owner = "client!cg", name = "fb", descriptor = "I")
	private int anInt640 = -1;

	@OriginalMember(owner = "client!cg", name = "wb", descriptor = "I")
	private int anInt651 = 0;

	@OriginalMember(owner = "client!cg", name = "tb", descriptor = "I")
	public int anInt648 = 512;

	@OriginalMember(owner = "client!cg", name = "Lb", descriptor = "[F")
	public final float[] aFloatArray7 = new float[4];

	@OriginalMember(owner = "client!cg", name = "gb", descriptor = "[F")
	private final float[] aFloatArray5 = new float[4];

	@OriginalMember(owner = "client!cg", name = "Pb", descriptor = "F")
	public float aFloat7 = 1.0F;

	@OriginalMember(owner = "client!cg", name = "Nb", descriptor = "I")
	private int anInt658 = 0;

	@OriginalMember(owner = "client!cg", name = "Jb", descriptor = "F")
	private float aFloat6 = 0.0F;

	@OriginalMember(owner = "client!cg", name = "Vb", descriptor = "I")
	private int anInt660 = 0;

	@OriginalMember(owner = "client!cg", name = "sb", descriptor = "I")
	private int anInt647 = -1;

	@OriginalMember(owner = "client!cg", name = "rb", descriptor = "I")
	public int anInt646 = -1;

	@OriginalMember(owner = "client!cg", name = "Eb", descriptor = "[F")
	private final float[] aFloatArray6 = new float[4];

	@OriginalMember(owner = "client!cg", name = "jb", descriptor = "I")
	public int anInt642 = 512;

	@OriginalMember(owner = "client!cg", name = "Ub", descriptor = "F")
	public float aFloat8 = 3584.0F;

	@OriginalMember(owner = "client!cg", name = "lc", descriptor = "I")
	private int anInt666 = 8448;

	@OriginalMember(owner = "client!cg", name = "sc", descriptor = "I")
	public int anInt668 = -1;

	@OriginalMember(owner = "client!cg", name = "kb", descriptor = "I")
	public int anInt643 = 50;

	@OriginalMember(owner = "client!cg", name = "ec", descriptor = "F")
	private float aFloat10 = 1.0F;

	@OriginalMember(owner = "client!cg", name = "oc", descriptor = "Z")
	private boolean aBoolean68 = true;

	@OriginalMember(owner = "client!cg", name = "Rb", descriptor = "[F")
	private final float[] aFloatArray8 = new float[16];

	@OriginalMember(owner = "client!cg", name = "Sb", descriptor = "I")
	private int anInt659 = 0;

	@OriginalMember(owner = "client!cg", name = "qb", descriptor = "F")
	private float aFloat3 = 1.0F;

	@OriginalMember(owner = "client!cg", name = "qc", descriptor = "I")
	private int anInt667 = 0;

	@OriginalMember(owner = "client!cg", name = "nc", descriptor = "F")
	public float aFloat12 = 1.0F;

	@OriginalMember(owner = "client!cg", name = "tc", descriptor = "F")
	public float aFloat13 = 3584.0F;

	@OriginalMember(owner = "client!cg", name = "Ab", descriptor = "I")
	public int anInt653 = 0;

	@OriginalMember(owner = "client!cg", name = "Pc", descriptor = "I")
	private int anInt671 = 0;

	@OriginalMember(owner = "client!cg", name = "Gc", descriptor = "F")
	public float aFloat15 = -1.0F;

	@OriginalMember(owner = "client!cg", name = "Oc", descriptor = "[F")
	private final float[] aFloatArray9 = new float[4];

	@OriginalMember(owner = "client!cg", name = "ic", descriptor = "I")
	private int anInt664 = 8448;

	@OriginalMember(owner = "client!cg", name = "Gb", descriptor = "I")
	public int anInt654 = -1;

	@OriginalMember(owner = "client!cg", name = "Lc", descriptor = "F")
	public float aFloat16 = -1.0F;

	@OriginalMember(owner = "client!cg", name = "Fc", descriptor = "F")
	public float aFloat14 = 1.0F;

	@OriginalMember(owner = "client!cg", name = "Sc", descriptor = "I")
	private int anInt672 = 0;

	@OriginalMember(owner = "client!cg", name = "fc", descriptor = "I")
	public int anInt663 = 0;

	@OriginalMember(owner = "client!cg", name = "ac", descriptor = "I")
	public int anInt662 = 3584;

	@OriginalMember(owner = "client!cg", name = "E", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas2;

	@OriginalMember(owner = "client!cg", name = "y", descriptor = "Lclient!ec;")
	public final Interface3 anInterface3_1;

	@OriginalMember(owner = "client!cg", name = "C", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!cg", name = "I", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl1;

	@OriginalMember(owner = "client!cg", name = "xc", descriptor = "I")
	public final int anInt670;

	@OriginalMember(owner = "client!cg", name = "Fb", descriptor = "Z")
	private boolean aBoolean61;

	@OriginalMember(owner = "client!cg", name = "eb", descriptor = "Z")
	public boolean aBoolean57;

	@OriginalMember(owner = "client!cg", name = "Nc", descriptor = "Z")
	public boolean aBoolean76;

	@OriginalMember(owner = "client!cg", name = "cc", descriptor = "Z")
	public boolean aBoolean66;

	@OriginalMember(owner = "client!cg", name = "Yb", descriptor = "Z")
	private boolean aBoolean65;

	@OriginalMember(owner = "client!cg", name = "Qc", descriptor = "Z")
	public boolean aBoolean77;

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "Lclient!re;")
	public final Class171 aClass171_1;

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "Lclient!rn;")
	private final Class174 aClass174_1;

	@OriginalMember(owner = "client!cg", name = "x", descriptor = "Lclient!cc;")
	private final Class33 aClass33_1;

	@OriginalMember(owner = "client!cg", name = "F", descriptor = "Lclient!uc;")
	private final Class2_Sub6_Sub1 aClass2_Sub6_Sub1_1;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!ec;IILclient!sc;)V")
	public Class37_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class179 arg4) {
		this.aCanvas2 = arg0;
		this.anInterface3_1 = arg1;
		this.anInt4312 = arg2;
		@Pc(186) int local186 = 0;
		while (!this.aCanvas2.isShowing()) {
			if (local186++ > 5) {
				throw new RuntimeException("");
			}
			Static248.method4401(1000L);
		}
		this.aCanvas2.setIgnoreRepaint(true);
		try {
			if (Static42.aBoolean55 == null || !Static42.aBoolean55) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static42.aBoolean55 = Boolean.TRUE;
				} else {
					@Pc(220) Class26 local220 = arg4.method4894(this.getClass());
					while (local220.anInt484 == 0) {
						Static248.method4401(100L);
					}
					if (local220.anInt484 == 1) {
						Static42.aBoolean55 = Boolean.TRUE;
					}
				}
			}
			if (Static42.aBoolean55 == null || !Static42.aBoolean55) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas2, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method742();
				this.anOpengl1 = this.aContext1.getGL();
				@Pc(287) int local287 = this.method791();
				if (local287 != 0) {
					throw new RuntimeException("");
				}
				this.anInt670 = this.aBoolean72 ? 33639 : 5121;
				@Pc(306) String local306 = this.aString4.toLowerCase();
				@Pc(310) String local310 = this.aString5.toLowerCase();
				if (local310.indexOf("radeon") != -1) {
					@Pc(317) int local317 = 0;
					@Pc(319) boolean local319 = false;
					@Pc(321) boolean local321 = false;
					@Pc(329) String[] local329 = Static137.method2633(' ', local310.replace('/', ' '));
					for (@Pc(331) int local331 = 0; local331 < local329.length; local331++) {
						@Pc(339) String local339 = local329[local331];
						try {
							if (local339.length() > 0) {
								if (local339.charAt(0) == 'x' && local339.length() >= 3 && Static113.method2232(local339.substring(1, 3))) {
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
									if (local339.length() >= 4 && Static113.method2232(local339.substring(0, 4))) {
										local317 = Static16.method250(local339.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(403) Exception local403) {
						}
					}
					if (!local321 && !local319) {
						if (local317 >= 7000 && local317 <= 7999) {
							this.aBoolean61 = false;
						}
						if (local317 >= 7000 && local317 <= 9250) {
							this.aBoolean57 = false;
						}
					}
					if (!local319 || local317 < 4000) {
						this.aBoolean76 = false;
					}
					this.aBoolean66 &= this.anOpengl1.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean65 = this.aBoolean61;
				}
				if (local306.contains("intel")) {
					this.aBoolean77 = false;
				}
				if (this.aBoolean61) {
					try {
						@Pc(461) int[] local461 = new int[1];
						this.anOpengl1.glGenBuffersARB(1, local461, 0);
					} catch (@Pc(469) Throwable local469) {
						throw new RuntimeException("", local469);
					}
				}
				this.method798(this);
				this.method3721();
				this.method745();
				new Class77(this);
				this.aClass171_1 = new Class171(this, this.anInterface3_1);
				Static204.method3873(true);
				this.aBoolean56 = true;
				this.aClass174_1 = new Class174(this);
				this.aClass33_1 = new Class33(this);
				this.aClass2_Sub6_Sub1_1 = new Class2_Sub6_Sub1(this);
				this.method744();
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
						Static248.method4401(100L);
					}
				}
				this.anOpengl1.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(553) Throwable local553) {
			local553.printStackTrace();
			this.method3710();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local553);
		}
	}

	@OriginalMember(owner = "client!cg", name = "D", descriptor = "()V")
	private void method730() {
		Static42.aFloatArray3[0] = this.aFloat16 * this.aFloat14;
		Static42.aFloatArray3[1] = this.aFloat16 * this.aFloat12;
		Static42.aFloatArray3[2] = this.aFloat16 * this.aFloat7;
		Static42.aFloatArray3[3] = 1.0F;
		this.anOpengl1.glLightfv(16384, 4609, Static42.aFloatArray3, 0);
		Static42.aFloatArray3[0] = -this.aFloat15 * this.aFloat14;
		Static42.aFloatArray3[1] = -this.aFloat15 * this.aFloat12;
		Static42.aFloatArray3[2] = -this.aFloat15 * this.aFloat7;
		Static42.aFloatArray3[3] = 1.0F;
		this.anOpengl1.glLightfv(16385, 4609, Static42.aFloatArray3, 0);
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V")
	@Override
	public void method3689(@OriginalArg(0) int arg0) {
		this.method731(0);
		this.anOpengl1.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl1.glClear(16384);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!go;[Lclient!ck;Z)Lclient!lp;")
	@Override
	public Class71 method3659(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class40[] arg1) {
		return new Class71_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "(I)V")
	public void method731(@OriginalArg(0) int arg0) {
		if (this.anInt669 == arg0) {
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
		if (local10 != this.aBoolean63) {
			this.anOpengl1.glColorMask(local10, local10, local10, true);
			this.aBoolean63 = local10;
		}
		if (local12 != this.aBoolean75) {
			if (local12) {
				this.anOpengl1.glEnable(3008);
			} else {
				this.anOpengl1.glDisable(3008);
			}
			this.aBoolean75 = local12;
		}
		if (local8 != this.anInt657) {
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
			this.anInt657 = local8;
		}
		this.anInt669 = arg0;
		this.anInt644 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)I")
	@Override
	public int method3686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIIIZ)Lclient!kr;")
	@Override
	public Class46 method3741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class46_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII)V")
	@Override
	public void method3677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt635) {
			arg2 = this.anInt635;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt637) {
			arg3 = this.anInt637;
		}
		this.anInt667 = arg0;
		this.anInt672 = arg1;
		this.anInt659 = arg2;
		this.anInt671 = arg3;
		this.anOpengl1.glEnable(3089);
		this.method756();
		this.method739();
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "()I")
	@Override
	public int method3648() {
		@Pc(2) int local2 = this.anInt674;
		this.anInt674 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "()Z")
	@Override
	public boolean method3645() {
		return true;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	@Override
	public void method3647(@OriginalArg(0) int arg0) {
		this.method758();
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method3697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method779();
		this.method731(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean64) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local23);
		this.anOpengl1.glVertex2f(local16, local23);
		this.anOpengl1.glVertex2f(local16, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean64) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(III)V")
	public void method732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(II)V")
	public synchronized void method733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub23 local4 = new Class2_Sub23(arg1);
		local4.aLong219 = arg0;
		this.aClass180_6.method4909(local4);
	}

	@OriginalMember(owner = "client!cg", name = "N", descriptor = "()V")
	public void method734() {
		if (this.anInt644 == 16) {
			return;
		}
		this.method755();
		this.method788(true);
		this.method790(true);
		this.method772(true);
		this.method731(1);
		this.method774(1);
		this.anInt644 = 16;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(Z)V")
	@Override
	public void method3725(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cg", name = "E", descriptor = "()Lclient!jd;")
	@Override
	public Class38 method3736() {
		return new Class38_Sub2();
	}

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "(II)V")
	public void method735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt655 != 0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt664 != arg0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anInt664 = arg0;
			local4 = true;
		}
		if (this.anInt666 != arg1) {
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			this.anInt666 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt644 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[Lclient!dt;)V")
	@Override
	public void method3652(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class2_Sub10 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static42.aFloatArray4[0] = local8.anInt4039;
			Static42.aFloatArray4[1] = local8.anInt4045;
			Static42.aFloatArray4[2] = local8.anInt4043;
			Static42.aFloatArray4[3] = 1.0F;
			this.anOpengl1.glLightfv(local12, 4611, Static42.aFloatArray4, 0);
			@Pc(44) int local44 = local8.anInt4041;
			@Pc(49) float local49 = local8.aFloat42 / 255.0F;
			Static42.aFloatArray4[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static42.aFloatArray4[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static42.aFloatArray4[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl1.glLightfv(local12, 4609, Static42.aFloatArray4, 0);
			this.anOpengl1.glLightf(local12, 4617, 1.0F / (float) (local8.anInt4042 * local8.anInt4042));
			this.anOpengl1.glEnable(local12);
		}
		while (local1 < this.anInt651) {
			this.anOpengl1.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt651 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "(II)V")
	public synchronized void method736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub23 local4 = new Class2_Sub23(arg1);
		local4.aLong219 = arg0;
		this.aClass180_7.method4909(local4);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!tf;Lclient!tf;Lclient!tf;Lclient!tf;)V")
	public void method737(@OriginalArg(0) Class190 arg0, @OriginalArg(1) Class190 arg1, @OriginalArg(2) Class190 arg2, @OriginalArg(3) Class190 arg3) {
		if (arg0 == null) {
			this.anOpengl1.glDisableClientState(32884);
		} else {
			this.anOpengl1.glEnableClientState(32884);
			arg0.method5152();
		}
		if (arg1 == null) {
			this.anOpengl1.glDisableClientState(32885);
		} else {
			this.anOpengl1.glEnableClientState(32885);
			arg1.method5151();
		}
		if (arg2 == null) {
			this.anOpengl1.glDisableClientState(32886);
		} else {
			this.anOpengl1.glEnableClientState(32886);
			arg2.method5150();
		}
		if (arg3 == null) {
			this.anOpengl1.glDisableClientState(32888);
		} else {
			this.anOpengl1.glEnableClientState(32888);
			arg3.method5153();
		}
	}

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "(I)V")
	public void method738(@OriginalArg(0) int arg0) {
		Static42.aFloatArray3[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static42.aFloatArray3[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static42.aFloatArray3[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static42.aFloatArray3[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static42.aFloatArray3, 0);
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method3680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method779();
		this.method731(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method779();
		this.method731(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I")
	@Override
	public int method3685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!cg", name = "O", descriptor = "()V")
	private void method739() {
		if (this.anInt667 <= this.anInt659 && this.anInt672 <= this.anInt671) {
			this.anOpengl1.glScissor(this.anInt658 + this.anInt667, this.anInt660 + this.anInt637 - this.anInt671, this.anInt659 - this.anInt667, this.anInt671 - this.anInt672);
		} else {
			this.anOpengl1.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "()V")
	@Override
	public void method3651() {
		this.aClass33_1.method495();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)V")
	@Override
	public void method3656() {
		this.aBoolean69 = true;
		this.anInt647 = 1583160;
		this.anInt668 = 40;
		this.method794();
		this.method785();
		this.aClass174_1.method4843(false, false, 3);
		this.aClass174_1.method4842(-1, true);
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(FFF)V")
	private void method740(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl1.glMatrixMode(5890);
		if (this.aBoolean71) {
			this.anOpengl1.glLoadIdentity();
		}
		this.anOpengl1.glTranslatef(arg0, arg1, arg2);
		this.anOpengl1.glMatrixMode(5888);
		this.aBoolean71 = true;
	}

	@OriginalMember(owner = "client!cg", name = "P", descriptor = "()V")
	public void method741() {
		if (this.anInt665 != 2) {
			this.anInt665 = 2;
			this.method757();
			this.method749();
			this.anInt644 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method3653(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class2_Sub23 local16;
		while (!this.aClass180_6.method4911()) {
			local16 = (Class2_Sub23) this.aClass180_6.method4914();
			Static42.anIntArray68[local1++] = (int) local16.aLong219;
			this.anInt633 -= local16.anInt3818;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteBuffersARB(local1, Static42.anIntArray68, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteBuffersARB(local1, Static42.anIntArray68, 0);
			local1 = 0;
		}
		while (!this.aClass180_7.method4911()) {
			local16 = (Class2_Sub23) this.aClass180_7.method4914();
			Static42.anIntArray68[local1++] = (int) local16.aLong219;
			this.anInt636 -= local16.anInt3818;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteTextures(local1, Static42.anIntArray68, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteTextures(local1, Static42.anIntArray68, 0);
			local1 = 0;
		}
		while (!this.aClass180_8.method4911()) {
			local16 = (Class2_Sub23) this.aClass180_8.method4914();
			Static42.anIntArray68[local1++] = local16.anInt3818;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteFramebuffersEXT(local1, Static42.anIntArray68, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteFramebuffersEXT(local1, Static42.anIntArray68, 0);
			local1 = 0;
		}
		while (!this.aClass180_9.method4911()) {
			local16 = (Class2_Sub23) this.aClass180_9.method4914();
			Static42.anIntArray68[local1++] = (int) local16.aLong219;
			this.anInt631 -= local16.anInt3818;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static42.anIntArray68, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static42.anIntArray68, 0);
			local1 = 0;
		}
		while (!this.aClass180_10.method4911()) {
			local16 = (Class2_Sub23) this.aClass180_10.method4914();
			Static42.anIntArray68[local1++] = (int) local16.aLong219;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteProgramsARB(local1, Static42.anIntArray68, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteProgramsARB(local1, Static42.anIntArray68, 0);
		}
		while (!this.aClass180_5.method4911()) {
			local16 = (Class2_Sub23) this.aClass180_5.method4914();
			this.anOpengl1.glDeleteLists((int) local16.aLong219, local16.anInt3818);
		}
		while (!this.aClass180_11.method4911()) {
			local16 = (Class2_Sub23) this.aClass180_11.method4914();
			this.anOpengl1.glDeleteObjectARB(local16.anInt3818);
		}
		while (!this.aClass180_5.method4911()) {
			local16 = (Class2_Sub23) this.aClass180_5.method4914();
			this.anOpengl1.glDeleteLists((int) local16.aLong219, local16.anInt3818);
		}
		if (this.method3661() > 100663296 && Static22.method285() > this.aLong28 + 60000L) {
			System.gc();
			this.aLong28 = Static22.method285();
		}
		this.anInt638 = local5;
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "()V")
	@Override
	public void method3644() {
		if (this.aClass2_Sub6_Sub1_1.method5328()) {
			this.aClass33_1.method493(this.aClass2_Sub6_Sub1_1);
			this.aClass171_1.method4778();
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!gf;)V")
	@Override
	public void method3657(@OriginalArg(0) Class2_Sub18 arg0) {
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3707(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(IIII)V")
	@Override
	public void method3748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass33_1.method500(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cg", name = "Q", descriptor = "()V")
	private void method742() {
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
			Static248.method4401(1000L);
		}
	}

	@OriginalMember(owner = "client!cg", name = "R", descriptor = "()Lclient!gm;")
	public Class81_Sub1 method743() {
		return this.aClass3_Sub1_1 == null ? null : this.aClass3_Sub1_1.method3586();
	}

	@OriginalMember(owner = "client!cg", name = "J", descriptor = "()Z")
	@Override
	public boolean method3745() {
		return this.aBoolean64;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method3704() {
	}

	@OriginalMember(owner = "client!cg", name = "S", descriptor = "()V")
	private void method744() {
		this.method781();
		for (@Pc(7) int local7 = this.anInt641 - 1; local7 >= 0; local7--) {
			this.method759(local7);
			this.method767(null);
			this.anOpengl1.glTexEnvi(8960, 8704, 34160);
		}
		this.method735(8448, 8448);
		this.method732(2, 34168, 770);
		this.method778();
		this.anInt669 = 1;
		this.anOpengl1.glEnable(3042);
		this.anOpengl1.glBlendFunc(770, 771);
		this.anInt657 = 1;
		this.anOpengl1.glEnable(3008);
		this.anOpengl1.glAlphaFunc(516, 0.0F);
		this.aBoolean75 = true;
		this.anOpengl1.glColorMask(true, true, true, true);
		this.aBoolean63 = true;
		this.method788(true);
		this.method793(true);
		this.method790(true);
		this.method772(true);
		this.method773();
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
		this.anInt640 = this.anInt646 = -1;
		this.method3709();
	}

	@OriginalMember(owner = "client!cg", name = "T", descriptor = "()V")
	private void method745() {
		this.aClass38_Sub2_1 = new Class38_Sub2();
		this.aClass38_Sub2_2 = new Class38_Sub2();
		this.aClass81Array1 = new Class81[this.anInt641];
		this.aClass81_Sub4_3 = new Class81_Sub4(this, 3553, 6408, 1, 1);
		this.aClass81_Sub4_4 = new Class81_Sub4(this, 3553, 6408, 1, 1);
		this.aClass81_Sub4_2 = new Class81_Sub4(this, 3553, 6408, 1, 1);
		this.aClass49_Sub1_3 = new Class49_Sub1(this);
		this.aClass49_Sub1_2 = new Class49_Sub1(this);
		this.aClass49_Sub1_1 = new Class49_Sub1(this);
		this.aClass49_Sub1_8 = new Class49_Sub1(this);
		this.aClass49_Sub1_5 = new Class49_Sub1(this);
		this.aClass49_Sub1_6 = new Class49_Sub1(this);
		this.aClass49_Sub1_7 = new Class49_Sub1(this);
		this.aClass49_Sub1_4 = new Class49_Sub1(this);
		if (this.aBoolean77) {
			this.aClass23_2 = new Class23(this);
		}
		this.aClass211_1.method5649(this);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!jp;IIII)Lclient!wp;")
	@Override
	public Class49 method3667(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class49_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[BIZ)Lclient!na;")
	public Interface7 method746(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface7) (this.aBoolean61 && (!arg3 || this.aBoolean65) ? new Class110_Sub2(this, arg0, arg1, arg2, arg3) : new Class106_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "(I)I")
	public int method747(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!wa;)V")
	@Override
	public void method3743(@OriginalArg(0) Class214 arg0) {
		this.aClass211_1.method5652(this, arg0);
	}

	@OriginalMember(owner = "client!cg", name = "G", descriptor = "()I")
	@Override
	public int method3740() {
		return 4;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!io;)V")
	public void method748(@OriginalArg(0) Interface5 arg0) {
		if (this.anInterface5_1 != arg0 && this.aBoolean61) {
			this.anOpengl1.glBindBufferARB(34963, arg0.method5582());
			this.anInterface5_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "()V")
	@Override
	public void method728() {
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIII)[I")
	@Override
	public int[] method3684() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl1.glReadPixels(0, this.anInt637 - local6, 36, 1, 32993, this.anInt670, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!cg", name = "U", descriptor = "()V")
	private void method749() {
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl1.glMultMatrixf(this.aClass38_Sub2_1.method4485(), 0);
		this.method761();
	}

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "()F")
	@Override
	public float method3705() {
		return this.aFloat21;
	}

	@OriginalMember(owner = "client!cg", name = "V", descriptor = "()V")
	private void method750() {
		@Pc(11) float local11 = (float) -this.anInt663 * this.aFloat10 / (float) this.anInt648;
		@Pc(23) float local23 = (float) -this.anInt653 * this.aFloat10 / (float) this.anInt642;
		@Pc(37) float local37 = (float) (this.anInt635 - this.anInt663) * this.aFloat10 / (float) this.anInt648;
		@Pc(51) float local51 = (float) (this.anInt637 - this.anInt653) * this.aFloat10 / (float) this.anInt642;
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (local11 != local37 && local51 != local23) {
			this.anOpengl1.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt643 - this.aFloat4), (double) ((float) this.anInt662 - this.aFloat4));
		}
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!cg", name = "W", descriptor = "()V")
	public void method751() {
		if (this.anInt644 == 8) {
			return;
		}
		this.method741();
		this.method788(true);
		this.method790(true);
		this.method772(true);
		this.method731(1);
		this.method774(1);
		this.anInt644 = 8;
	}

	@OriginalMember(owner = "client!cg", name = "X", descriptor = "()V")
	public void method752() {
		this.anOpengl1.glPopMatrix();
	}

	@OriginalMember(owner = "client!cg", name = "Y", descriptor = "()V")
	private void method753() {
		this.anOpengl1.glDepthMask(this.aBoolean62 && this.aBoolean68);
	}

	@OriginalMember(owner = "client!cg", name = "Z", descriptor = "()V")
	public void method754() {
		if (this.anInt644 == 2) {
			return;
		}
		this.method802();
		this.method788(false);
		this.method793(false);
		this.method790(false);
		this.method772(false);
		this.method781();
		this.anInt644 = 2;
	}

	@OriginalMember(owner = "client!cg", name = "ab", descriptor = "()V")
	private void method755() {
		if (this.anInt665 != 3) {
			this.anInt665 = 3;
			this.method750();
			this.method749();
			this.anInt644 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!jd;)V")
	@Override
	public void method3682(@OriginalArg(0) Class38 arg0) {
		this.aClass38_Sub2_1 = (Class38_Sub2) arg0;
		this.aClass38_Sub2_2.method4484(this.aClass38_Sub2_1);
		if (this.anInt665 != 1) {
			this.method749();
		}
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(IIII)V")
	@Override
	public void method3716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt663 = arg0;
		this.anInt653 = arg1;
		this.anInt648 = arg2;
		this.anInt642 = arg3;
		this.method795();
		this.method756();
		if (this.anInt665 == 3) {
			this.method750();
		} else if (this.anInt665 == 2) {
			this.method757();
		}
	}

	@OriginalMember(owner = "client!cg", name = "bb", descriptor = "()V")
	private void method756() {
		this.aFloat20 = this.anInt667 - this.anInt663;
		this.lb = this.anInt659 - this.anInt663;
		this.aFloat17 = this.anInt672 - this.anInt653;
		this.aFloat5 = this.anInt671 - this.anInt653;
	}

	@OriginalMember(owner = "client!cg", name = "cb", descriptor = "()V")
	private void method757() {
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadMatrixf(this.aFloatArray8, 0);
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method3726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass81_Sub4_Sub1_1 == null || this.aClass81_Sub4_Sub1_1.anInt5614 < arg2 || this.aClass81_Sub4_Sub1_1.anInt5612 < arg3) {
			this.aClass81_Sub4_Sub1_1 = Static375.method4750(arg2, arg3, arg6, this);
			this.aClass81_Sub4_Sub1_1.method4745(false, false);
			local32 = this.aClass81_Sub4_Sub1_1.aFloat67;
			local36 = this.aClass81_Sub4_Sub1_1.aFloat66;
		} else {
			this.aClass81_Sub4_Sub1_1.method4746(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass81_Sub4_Sub1_1.aFloat67 * (float) arg3 / (float) this.aClass81_Sub4_Sub1_1.anInt5612;
			local36 = this.aClass81_Sub4_Sub1_1.aFloat66 * (float) arg2 / (float) this.aClass81_Sub4_Sub1_1.anInt5614;
		}
		this.method754();
		this.method767(this.aClass81_Sub4_Sub1_1);
		this.method731(arg8);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method738(arg5);
		this.method735(34165, 34165);
		this.method732(0, 34166, 768);
		this.method732(2, 5890, 770);
		this.method769(0, 34166);
		this.method769(2, 5890);
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
		this.method732(0, 5890, 768);
		this.method732(2, 34166, 770);
		this.method769(0, 5890);
		this.method769(2, 34166);
	}

	@OriginalMember(owner = "client!cg", name = "db", descriptor = "()V")
	private void method758() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method3670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl1.glLineWidth((float) arg5);
		this.method3680(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!or;II)V")
	@Override
	public void method3731(@OriginalArg(1) Class124 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class124_Sub2 local2 = (Class124_Sub2) arg0;
		@Pc(5) Class81_Sub4_Sub1 local5 = local2.aClass81_Sub4_Sub1_5;
		this.method754();
		this.method767(local2.aClass81_Sub4_Sub1_5);
		this.method731(1);
		this.method735(7681, 8448);
		this.method732(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat66 / (float) local5.anInt5616;
		@Pc(37) float local37 = local5.aFloat67 / (float) local5.anInt5615;
		this.anOpengl1.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt667 - arg1), local37 * (float) (this.anInt672 - arg2));
		this.anOpengl1.glVertex2i(this.anInt667, this.anInt672);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt667 - arg1), local37 * (float) (this.anInt671 - arg2));
		this.anOpengl1.glVertex2i(this.anInt667, this.anInt671);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt659 - arg1), local37 * (float) (this.anInt671 - arg2));
		this.anOpengl1.glVertex2i(this.anInt659, this.anInt671);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt659 - arg1), local37 * (float) (this.anInt672 - arg2));
		this.anOpengl1.glVertex2i(this.anInt659, this.anInt672);
		this.anOpengl1.glEnd();
		this.method732(0, 5890, 768);
	}

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "()V")
	@Override
	protected void method3710() {
		if (this.anOpengl1 != null) {
			try {
				this.aClass33_1.method499();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl1 = null;
		}
		if (this.aContext1 != null) {
			this.method758();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean56) {
			Static69.method3474(true);
			this.aBoolean56 = false;
		}
	}

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "(I)V")
	public void method759(@OriginalArg(0) int arg0) {
		if (this.anInt655 != arg0) {
			this.anOpengl1.glActiveTexture(arg0 + 33984);
			this.anInt655 = arg0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
	@Override
	public void method3650(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!na;")
	public Interface7 method760(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface7) (this.aBoolean61 ? new Class110_Sub2(this, arg0, arg1, false) : new Class106_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)V")
	@Override
	public void method3715(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIILclient!or;II)V")
	@Override
	public void method3673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class124 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class124_Sub2 local2 = (Class124_Sub2) arg5;
		@Pc(5) Class81_Sub4_Sub1 local5 = local2.aClass81_Sub4_Sub1_5;
		this.method754();
		this.method767(local2.aClass81_Sub4_Sub1_5);
		this.method731(1);
		this.method735(7681, 8448);
		this.method732(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat66 / (float) local5.anInt5616;
		@Pc(37) float local37 = local5.aFloat67 / (float) local5.anInt5615;
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
		this.method732(0, 5890, 768);
	}

	@OriginalMember(owner = "client!cg", name = "eb", descriptor = "()V")
	public void method761() {
		this.anOpengl1.glLightfv(16384, 4611, this.aFloatArray7, 0);
		this.anOpengl1.glLightfv(16385, 4611, this.aFloatArray9, 0);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class105 method3691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class105_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method3693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method779();
		this.method731(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!cg", name = "F", descriptor = "()Z")
	@Override
	public boolean method3738() {
		return true;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([Lclient!wp;Lclient!wa;Lclient!jd;[Lclient!id;I)V")
	@Override
	public void method3666(@OriginalArg(0) Class49[] arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) Class57_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method3714(arg0, arg2, arg3, arg4);
		this.method3743(arg1);
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(IIIII)V")
	@Override
	protected void method3734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "(I)V")
	public synchronized void method762(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub23 local4 = new Class2_Sub23(arg0);
		this.aClass180_10.method4909(local4);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([Lclient!wp;Lclient!jd;[Lclient!id;I)V")
	@Override
	public void method3714(@OriginalArg(0) Class49[] arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(2) Class57_Sub4[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method5825(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(III)V")
	public void method763(@OriginalArg(2) int arg0) {
		this.anOpengl1.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(Z)V")
	public void method764(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean79) {
			this.aBoolean79 = arg0;
			this.method800();
		}
	}

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "()Z")
	@Override
	public boolean method3683() {
		return false;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!io;III)V")
	public void method765(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method748(arg0);
		arg0.method4904(arg1, arg2);
	}

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "(II)V")
	public void method766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt658 = arg0;
		this.anInt660 = arg1;
		this.anOpengl1.glViewport(arg0, arg1, this.anInt635, this.anInt637);
		this.method739();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!q;)V")
	public void method767(@OriginalArg(0) Class81 arg0) {
		@Pc(5) Class81 local5 = this.aClass81Array1[this.anInt655];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl1.glDisable(local5.anInt5610);
			} else {
				if (local5 == null) {
					this.anOpengl1.glEnable(arg0.anInt5610);
				} else if (arg0.anInt5610 != local5.anInt5610) {
					this.anOpengl1.glDisable(local5.anInt5610);
					this.anOpengl1.glEnable(arg0.anInt5610);
				}
				this.anOpengl1.glBindTexture(arg0.anInt5610, arg0.method4740());
			}
			this.aClass81Array1[this.anInt655] = arg0;
		}
		this.anInt644 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([I)V")
	@Override
	public void method3676(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt667;
		arg0[1] = this.anInt672;
		arg0[2] = this.anInt659;
		arg0[3] = this.anInt671;
	}

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "()I")
	@Override
	public int method3661() {
		return this.anInt633 + this.anInt636 + this.anInt631;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[I[I)Lclient!or;")
	@Override
	public Class124 method3750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static376.method4786(arg1, arg0, arg2, this, arg3);
	}

	@OriginalMember(owner = "client!cg", name = "L", descriptor = "()V")
	@Override
	public void method3747() {
		this.aClass174_1.method4843(false, false, 0);
		this.aBoolean69 = false;
		this.method794();
		this.method785();
	}

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "()Z")
	@Override
	public boolean method3679() {
		return true;
	}

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "()V")
	@Override
	public void method3709() {
		this.anInt667 = 0;
		this.anInt672 = 0;
		this.anInt659 = this.anInt635;
		this.anInt671 = this.anInt637;
		this.anOpengl1.glDisable(3089);
		this.method756();
	}

	@OriginalMember(owner = "client!cg", name = "fb", descriptor = "()V")
	private void method768() {
		Static42.aFloatArray3[0] = this.aFloat19 * this.aFloat14;
		Static42.aFloatArray3[1] = this.aFloat19 * this.aFloat12;
		Static42.aFloatArray3[2] = this.aFloat19 * this.aFloat7;
		Static42.aFloatArray3[3] = 1.0F;
		this.anOpengl1.glLightModelfv(2899, Static42.aFloatArray3, 0);
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V")
	@Override
	public void method3678(@OriginalArg(0) int arg0) {
		this.method742();
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(III)V")
	@Override
	public void method3730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean69) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt647 = arg1;
		this.anInt668 = arg2;
		this.method794();
		this.aClass174_1.method4842(arg0, true);
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(III)V")
	public void method769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!tc;)V")
	@Override
	public void method3735(@OriginalArg(0) Class3 arg0) {
		this.aClass3_Sub1_1 = (Class3_Sub1) arg0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!na;)V")
	public void method770(@OriginalArg(0) Interface7 arg0) {
		if (this.anInterface7_1 != arg0 && this.aBoolean61) {
			this.anOpengl1.glBindBufferARB(34962, arg0.method5582());
			this.anInterface7_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "K", descriptor = "()I")
	@Override
	public int method3746() {
		@Pc(2) int local2 = this.anInt673;
		this.anInt673 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZZ)V")
	public void method771(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt650) {
			if (arg0 < 0) {
				this.method778();
				this.method767(null);
				if (!this.aBoolean69) {
					this.aClass174_1.method4843(arg2, arg1, 0);
				}
			} else {
				@Pc(11) Class81_Sub4 local11 = this.aClass171_1.method4777(arg0);
				@Pc(17) Class89 local17 = this.anInterface3_1.method166(arg0);
				if (local17.aByte26 == 0 && local17.aByte29 == 0) {
					this.method778();
				} else {
					@Pc(30) int local30 = local17.aBoolean249 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method740((float) (this.anInt638 % local34 * local17.aByte26) / (float) local34, (float) (this.anInt638 % local34 * local17.aByte29) / (float) local34, 0.0F);
				}
				if (this.aBoolean69) {
					this.aClass174_1.method4843(arg2, arg1, 3);
					this.method767(local11);
				} else {
					this.aClass174_1.method4843(arg2, arg1, local17.aByte28);
					this.aClass174_1.method4842(local17.aByte30, false);
					if (!this.aClass174_1.method4844(local11)) {
						this.method767(local11);
					}
				}
			}
			this.anInt650 = arg0;
		}
		this.anInt644 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "()V")
	@Override
	public void method3700() {
	}

	@OriginalMember(owner = "client!cg", name = "M", descriptor = "()Z")
	@Override
	public boolean method3749() {
		if (!this.aClass2_Sub6_Sub1_1.method5328()) {
			if (!this.aClass33_1.method494(this.aClass2_Sub6_Sub1_1)) {
				return false;
			}
			this.aClass171_1.method4778();
		}
		return true;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(FFF)V")
	@Override
	public void method3718(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static322.aFloat74 = arg0;
		Static322.aFloat76 = arg1;
		Static322.aFloat75 = arg2;
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(Z)V")
	public void method772(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean62) {
			this.aBoolean62 = arg0;
			this.method753();
			this.anInt644 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(F)V")
	@Override
	public void method3717(@OriginalArg(0) float arg0) {
		if (this.aFloat19 != arg0) {
			this.aFloat19 = arg0;
			this.method768();
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([IIIII)Lclient!kr;")
	@Override
	public Class46 method3729(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class46_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!cg", name = "gb", descriptor = "()V")
	public void method773() {
		if (this.anInt665 != 0) {
			this.anInt665 = 0;
			this.anInt644 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "(I)V")
	public void method774(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method735(7681, 7681);
		} else if (arg0 == 1) {
			this.method735(8448, 8448);
		} else if (arg0 == 2) {
			this.method735(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!cg", name = "hb", descriptor = "()Lclient!vd;")
	public Interface10 method775() {
		return this.anInterface10_1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)V")
	public void method776(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method771(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!cg", name = "C", descriptor = "()Z")
	@Override
	public boolean method3733() {
		return false;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!tc;Lclient!tc;FLclient!tc;)Lclient!tc;")
	@Override
	public Class3 method3702(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean58 && this.aBoolean77) {
			@Pc(11) Class3_Sub1_Sub2 local11 = null;
			@Pc(14) Class3_Sub1 local14 = (Class3_Sub1) arg0;
			@Pc(17) Class3_Sub1 local17 = (Class3_Sub1) arg1;
			@Pc(21) Class81_Sub1 local21 = local14.method3586();
			@Pc(25) Class81_Sub1 local25 = local17.method3586();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt2373 > local25.anInt2373 ? local21.anInt2373 : local25.anInt2373;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class3_Sub1_Sub2) {
					@Pc(52) Class3_Sub1_Sub2 local52 = (Class3_Sub1_Sub2) arg3;
					if (local52.method3588() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class3_Sub1_Sub2(this, local40);
				}
				local11.method3587(local21, local25, arg2);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass38_Sub2_1.aFloat54 * (float) arg0 + this.aClass38_Sub2_1.aFloat53 * (float) arg1 + this.aClass38_Sub2_1.aFloat55 * (float) arg2 + this.aClass38_Sub2_1.aFloat52;
		if (local24 < (float) this.anInt643 || local24 > (float) this.anInt662) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt648 * (this.aClass38_Sub2_1.aFloat56 * (float) arg0 + this.aClass38_Sub2_1.aFloat59 * (float) arg1 + this.aClass38_Sub2_1.aFloat60 * (float) arg2 + this.aClass38_Sub2_1.aFloat58) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt642 * (this.aClass38_Sub2_1.aFloat63 * (float) arg0 + this.aClass38_Sub2_1.aFloat62 * (float) arg1 + this.aClass38_Sub2_1.aFloat57 * (float) arg2 + this.aClass38_Sub2_1.aFloat61) / local24);
		if ((float) local81 >= this.aFloat20 && (float) local81 <= this.lb && (float) local113 >= this.aFloat17 && (float) local113 <= this.aFloat5) {
			arg3[0] = (int) ((float) local81 - this.aFloat20);
			arg3[1] = (int) ((float) local113 - this.aFloat17);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "()I")
	@Override
	public int method3706() {
		return this.anInt643;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIII)Lclient!tc;")
	@Override
	public Class3 method3671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean58 ? new Class3_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I[BIZ)Lclient!io;")
	public Interface5 method777(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface5) (this.aBoolean61 && (!arg2 || this.aBoolean65) ? new Class110_Sub1(this, 5123, arg0, arg1, arg2) : new Class106_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)Lclient!gf;")
	@Override
	public Class2_Sub18 method3732() {
		return null;
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(II)V")
	@Override
	public void method3701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt646 == arg0 && this.anInt654 == arg1) {
			return;
		}
		this.anInt646 = arg0;
		this.anInt654 = arg1;
		if (!this.aBoolean69) {
			this.method794();
			this.method785();
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!ck;Z)Lclient!kr;")
	@Override
	public Class46 method3708(@OriginalArg(0) Class40 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt694 * arg0.anInt691];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray6 == null) {
			for (local15 = 0; local15 < arg0.anInt691; local15++) {
				for (local21 = 0; local21 < arg0.anInt694; local21++) {
					@Pc(74) int local74 = arg0.anIntArray69[arg0.aByteArray7[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt691; local15++) {
				for (local21 = 0; local21 < arg0.anInt694; local21++) {
					local6[local10++] = arg0.aByteArray6[local8] << 24 | arg0.anIntArray69[arg0.aByteArray7[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class46 local100 = this.method3729(local6, arg0.anInt694, arg0.anInt694, arg0.anInt691);
		local100.method5020(arg0.anInt693, arg0.anInt696, arg0.anInt695, arg0.anInt692);
		return local100;
	}

	@OriginalMember(owner = "client!cg", name = "ib", descriptor = "()V")
	private void method778() {
		if (this.aBoolean71) {
			this.anOpengl1.glMatrixMode(5890);
			this.anOpengl1.glLoadIdentity();
			this.anOpengl1.glMatrixMode(5888);
			this.aBoolean71 = false;
		}
	}

	@OriginalMember(owner = "client!cg", name = "jb", descriptor = "()V")
	private void method779() {
		if (this.anInt644 == 1) {
			return;
		}
		this.method802();
		this.method788(false);
		this.method793(false);
		this.method790(false);
		this.method772(false);
		this.method767(null);
		this.method781();
		this.method774(0);
		this.anInt644 = 1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "()V")
	@Override
	public void method727() {
	}

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "()V")
	@Override
	public void method3721() {
		this.anInt635 = this.aCanvas2.getWidth();
		this.anInt637 = this.aCanvas2.getHeight();
		this.anOpengl1.glViewport(this.anInt658, this.anInt660, this.anInt635, this.anInt637);
		this.method773();
		this.method3709();
	}

	@OriginalMember(owner = "client!cg", name = "x", descriptor = "()Z")
	@Override
	public boolean method3713() {
		return !this.aBoolean60;
	}

	@OriginalMember(owner = "client!cg", name = "kb", descriptor = "()V")
	public void method780() {
		if (this.anInt644 == 4) {
			return;
		}
		this.method802();
		this.method788(false);
		this.method793(false);
		this.method790(false);
		this.method772(false);
		this.method781();
		this.method731(1);
		this.method774(1);
		this.anInt644 = 4;
	}

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "(I)V")
	public void method781() {
		this.method776(-2, true);
	}

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "()Z")
	@Override
	public boolean method3695() {
		return true;
	}

	@OriginalMember(owner = "client!cg", name = "y", descriptor = "()Z")
	@Override
	public boolean method3719() {
		return this.aClass2_Sub6_Sub1_1.method5328();
	}

	@OriginalMember(owner = "client!cg", name = "B", descriptor = "()Z")
	@Override
	public boolean method3727() {
		return true;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!vd;)V")
	public void method782(@OriginalArg(0) Interface10 arg0) {
		if (this.anInt634 < 0 || this.anInterface10Array1[this.anInt634] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface10Array1[this.anInt634--] = null;
		arg0.method728();
		if (this.anInt634 >= 0) {
			this.anInterface10_1 = this.anInterface10Array1[this.anInt634];
			this.anInterface10_1.method727();
		}
	}

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "(I)V")
	public synchronized void method783(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub23 local4 = new Class2_Sub23(arg0);
		this.aClass180_8.method4909(local4);
	}

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "(II)V")
	public synchronized void method784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub23 local4 = new Class2_Sub23(arg1);
		local4.aLong219 = arg0;
		this.aClass180_8.method4909(local4);
	}

	@OriginalMember(owner = "client!cg", name = "lb", descriptor = "()V")
	private void method785() {
		if (this.aBoolean74 && this.aBoolean69 | this.anInt654 >= 0) {
			this.anOpengl1.glEnable(2912);
		} else {
			this.anOpengl1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(FF)V")
	public void method786(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat3 = arg0;
		this.aFloat6 = arg1;
		if (!this.aBoolean69) {
			this.method794();
		}
	}

	@OriginalMember(owner = "client!cg", name = "H", descriptor = "()V")
	@Override
	public void method3742() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(FFFF)V")
	public void method787(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static42.aFloatArray3[0] = arg0;
		Static42.aFloatArray3[1] = arg1;
		Static42.aFloatArray3[2] = arg2;
		Static42.aFloatArray3[3] = arg3;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static42.aFloatArray3, 0);
	}

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "()Z")
	@Override
	public boolean method3690() {
		return false;
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(Z)V")
	public void method788(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean74) {
			this.aBoolean74 = arg0;
			this.method785();
			this.anInt644 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "()Z")
	@Override
	public boolean method3663() {
		return this.aClass2_Sub6_Sub1_1.method5330();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!pm;)V")
	public void method789(@OriginalArg(0) Class38_Sub2 arg0) {
		this.anOpengl1.glPushMatrix();
		this.anOpengl1.glMultMatrixf(arg0.method4485(), 0);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method3723(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method3742();
	}

	@OriginalMember(owner = "client!cg", name = "A", descriptor = "()Z")
	@Override
	public boolean method3722() {
		return this.aClass174_1.method4841();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(FF)V")
	@Override
	public void method3662(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat21 && arg1 == this.aFloat4) {
			return;
		}
		this.aFloat21 = arg0;
		this.aFloat4 = arg1;
		this.method797();
		if (this.anInt665 == 3) {
			this.method750();
		} else if (this.anInt665 == 2) {
			this.method757();
		}
	}

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "(Z)V")
	public void method790(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean70) {
			return;
		}
		if (arg0) {
			this.anOpengl1.glEnable(2929);
		} else {
			this.anOpengl1.glDisable(2929);
		}
		this.aBoolean70 = arg0;
		this.anInt644 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!cg", name = "mb", descriptor = "()I")
	private int method791() {
		@Pc(1) int local1 = 0;
		this.aString4 = this.anOpengl1.glGetString(7936);
		this.aString5 = this.anOpengl1.glGetString(7937);
		@Pc(17) String local17 = this.aString4.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl1.glGetString(7938);
		@Pc(53) String[] local53 = Static137.method2633(' ', local45.replace('.', ' '));
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static16.method250(local53[0]);
				@Pc(69) int local69 = Static16.method250(local53[1]);
				this.anInt649 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt649 < 12) {
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
		this.anInt641 = local116[0];
		this.anOpengl1.glGetIntegerv(34929, local116, 0);
		this.anInt645 = local116[0];
		this.anOpengl1.glGetIntegerv(34930, local116, 0);
		this.anInt652 = local116[0];
		if (this.anInt641 < 2 || this.anInt645 < 2 || this.anInt652 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean60 = Static293.aString57 != null && Static293.aString57.startsWith("mac");
		this.aBoolean72 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean61 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean64 = this.anOpengl1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean67 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean59 = this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean57 = this.anOpengl1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean66 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean58 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean76 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean73 = false;
		this.aBoolean77 = this.anOpengl1.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "(I)I")
	public int method792(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(IIII)V")
	@Override
	public void method3696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt667 < arg0) {
			this.anInt667 = arg0;
		}
		if (this.anInt659 > arg2) {
			this.anInt659 = arg2;
		}
		if (this.anInt672 < arg1) {
			this.anInt672 = arg1;
		}
		if (this.anInt671 > arg3) {
			this.anInt671 = arg3;
		}
		this.anOpengl1.glEnable(3089);
		this.method756();
		this.method739();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method3664(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt640 != arg0;
		if (local7 || this.aFloat16 != arg1 || this.aFloat15 != arg2) {
			this.anInt640 = arg0;
			this.aFloat16 = arg1;
			this.aFloat15 = arg2;
			if (local7) {
				this.aFloat14 = (float) (this.anInt640 & 0xFF0000) / 1.671168E7F;
				this.aFloat12 = (float) (this.anInt640 & 0xFFFF) / 65535.0F;
				this.aFloat7 = (float) (this.anInt640 & 0xFF) / 255.0F;
				this.method768();
			}
			this.method730();
		}
		if (this.aFloatArray6[0] == arg3 && this.aFloatArray6[1] == arg4 && this.aFloatArray6[2] == arg5) {
			return;
		}
		this.aFloatArray6[0] = arg3;
		this.aFloatArray6[1] = arg4;
		this.aFloatArray6[2] = arg5;
		this.aFloatArray5[0] = -arg3;
		this.aFloatArray5[1] = -arg4;
		this.aFloatArray5[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray7[0] = arg3 * local132;
		this.aFloatArray7[1] = arg4 * local132;
		this.aFloatArray7[2] = arg5 * local132;
		this.aFloatArray9[0] = -this.aFloatArray7[0];
		this.aFloatArray9[1] = -this.aFloatArray7[1];
		this.aFloatArray9[2] = -this.aFloatArray7[2];
		this.method761();
		this.anInt661 = (int) (arg3 * 256.0F / arg4);
		this.anInt656 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(IIIIII)Z")
	@Override
	public boolean method3728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass38_Sub2_1.aFloat54 * (float) arg0 + this.aClass38_Sub2_1.aFloat53 * (float) arg1 + this.aClass38_Sub2_1.aFloat55 * (float) arg2 + this.aClass38_Sub2_1.aFloat52;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass38_Sub2_1.aFloat54 * (float) arg3 + this.aClass38_Sub2_1.aFloat53 * (float) arg4 + this.aClass38_Sub2_1.aFloat55 * (float) arg5 + this.aClass38_Sub2_1.aFloat52;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt643 && local55 < (float) this.anInt643 || !(!(local24 > (float) this.anInt662) || !(local55 > (float) this.anInt662))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt648 * (this.aClass38_Sub2_1.aFloat56 * (float) arg0 + this.aClass38_Sub2_1.aFloat59 * (float) arg1 + this.aClass38_Sub2_1.aFloat60 * (float) arg2 + this.aClass38_Sub2_1.aFloat58) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt648 * (this.aClass38_Sub2_1.aFloat56 * (float) arg3 + this.aClass38_Sub2_1.aFloat59 * (float) arg4 + this.aClass38_Sub2_1.aFloat60 * (float) arg5 + this.aClass38_Sub2_1.aFloat58) / local55);
		if ((float) local119 < this.aFloat20 && (float) local151 < this.aFloat20 || (float) local119 > this.lb && (float) local151 > this.lb) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt642 * (this.aClass38_Sub2_1.aFloat63 * (float) arg0 + this.aClass38_Sub2_1.aFloat62 * (float) arg1 + this.aClass38_Sub2_1.aFloat57 * (float) arg2 + this.aClass38_Sub2_1.aFloat61) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt642 * (this.aClass38_Sub2_1.aFloat63 * (float) arg3 + this.aClass38_Sub2_1.aFloat62 * (float) arg4 + this.aClass38_Sub2_1.aFloat57 * (float) arg5 + this.aClass38_Sub2_1.aFloat61) / local55);
			return (!((float) local209 < this.aFloat17) || !((float) local241 < this.aFloat17)) && (!((float) local209 > this.aFloat5) || !((float) local241 > this.aFloat5));
		}
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method3712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method779();
		this.method731(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean64) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local19);
		this.anOpengl1.glVertex2f(local14, local19);
		this.anOpengl1.glVertex2f(local14, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean64) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "()V")
	@Override
	public void method3665() {
		this.method772(true);
		this.anOpengl1.glClear(256);
	}

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "(Z)V")
	public void method793(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean78) {
			this.aBoolean78 = arg0;
			this.method800();
			this.anInt644 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!cg", name = "I", descriptor = "()F")
	@Override
	public float method3744() {
		return this.aFloat4;
	}

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "()Z")
	@Override
	public boolean method3649() {
		return true;
	}

	@OriginalMember(owner = "client!cg", name = "nb", descriptor = "()V")
	private void method794() {
		@Pc(15) int local15;
		if (this.aBoolean69) {
			this.anOpengl1.glFogf(2915, 0.0F);
			this.anOpengl1.glFogf(2916, 1.0F);
			local15 = this.anInt647;
		} else {
			this.aFloat9 = (float) (this.anInt662 - 256) - this.aFloat6;
			this.aFloat11 = this.aFloat9 - (float) this.anInt654 * this.aFloat3;
			if (this.aFloat11 < (float) this.anInt643) {
				this.aFloat11 = this.anInt643;
			}
			this.anOpengl1.glFogf(2915, this.aFloat11);
			this.anOpengl1.glFogf(2916, this.aFloat9);
			local15 = this.anInt646;
		}
		Static42.aFloatArray3[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static42.aFloatArray3[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static42.aFloatArray3[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl1.glFogfv(2918, Static42.aFloatArray3, 0);
	}

	@OriginalMember(owner = "client!cg", name = "ob", descriptor = "()V")
	private void method795() {
		@Pc(2) float[] local2 = this.aFloatArray8;
		@Pc(14) float local14 = (float) (-this.anInt663 * this.anInt643) / (float) this.anInt648;
		@Pc(28) float local28 = (float) ((this.anInt635 - this.anInt663) * this.anInt643) / (float) this.anInt648;
		@Pc(39) float local39 = (float) (this.anInt653 * this.anInt643) / (float) this.anInt642;
		@Pc(53) float local53 = (float) ((this.anInt653 - this.anInt637) * this.anInt643) / (float) this.anInt642;
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
			@Pc(67) float local67 = (float) this.anInt643 * 2.0F;
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
			local2[10] = this.aFloat18 = (float) -(this.anInt662 + this.anInt643) / (float) (this.anInt662 - this.anInt643);
			local2[11] = -1.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = this.aFloat2 = -(local67 * (float) this.anInt662) / (float) (this.anInt662 - this.anInt643);
			local2[15] = 0.0F;
		}
		this.method797();
	}

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "()Lclient!jd;")
	@Override
	public Class38 method3672() {
		return this.aClass38_1;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(F)V")
	public void method796(@OriginalArg(0) float arg0) {
		if (this.aFloat10 != arg0) {
			this.aFloat10 = arg0;
			if (this.anInt665 == 3) {
				this.method750();
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "pb", descriptor = "()V")
	private void method797() {
		if (this.aFloat4 == 0.0F) {
			this.aFloatArray8[10] = this.aFloat18;
			this.aFloatArray8[14] = this.aFloat2;
		} else {
			@Pc(13) float local13 = this.aFloat21 / (this.aFloat4 + this.aFloat21);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat2 * (1.0F - local13) * (1.0F - local13) / this.aFloat4;
			this.aFloatArray8[10] = this.aFloat18 + local32;
			this.aFloatArray8[14] = this.aFloat2 * local17;
		}
		this.aFloat13 = (this.aFloatArray8[14] - (float) this.anInt662) / this.aFloatArray8[10];
		this.aFloat8 = (float) this.anInt662 - this.aFloat4;
	}

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "()I")
	@Override
	public int method3674() {
		return this.anInt662;
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(II)V")
	@Override
	public void method3703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt643 == arg0 && this.anInt662 == arg1) {
			return;
		}
		this.anInt643 = arg0;
		this.anInt662 = arg1;
		this.method795();
		this.method794();
		if (this.anInt665 == 3) {
			this.method750();
		} else if (this.anInt665 == 2) {
			this.method757();
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(Lclient!vd;)V")
	public void method798(@OriginalArg(0) Interface10 arg0) {
		if (this.anInt634 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt634 >= 0) {
			this.anInterface10Array1[this.anInt634].method728();
		}
		this.anInterface10_1 = this.anInterface10Array1[++this.anInt634] = arg0;
		this.anInterface10_1.method727();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!wp;Lclient!wa;Lclient!jd;Lclient!id;I)V")
	@Override
	public void method3692(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) Class57_Sub4 arg3) {
		arg0.method5825(arg2, arg3, 0);
		this.method3743(arg1);
	}

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "(I)V")
	public synchronized void method799(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub23 local4 = new Class2_Sub23(arg0);
		this.aClass180_11.method4909(local4);
	}

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "()V")
	@Override
	public void method3668() {
		if (this.anInt635 <= 0 && this.anInt637 <= 0) {
			return;
		}
		@Pc(9) int local9 = this.anInt667;
		@Pc(12) int local12 = this.anInt659;
		@Pc(15) int local15 = this.anInt672;
		@Pc(18) int local18 = this.anInt671;
		this.method3709();
		this.anOpengl1.glReadBuffer(1028);
		this.anOpengl1.glDrawBuffer(1029);
		this.method773();
		this.method788(false);
		this.method793(false);
		this.method790(false);
		this.method772(false);
		this.method767(null);
		this.method781();
		this.method774(0);
		this.method731(0);
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRasterPos2i(0, 0);
		this.anOpengl1.glCopyPixels(0, 0, this.anInt635, this.anInt637, 6144);
		this.anOpengl1.glFlush();
		this.anOpengl1.glReadBuffer(1029);
		this.anOpengl1.glDrawBuffer(1029);
		this.method3677(local9, local15, local12, local18);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
	@Override
	public void method3675(@OriginalArg(0) boolean arg0) {
		this.aBoolean68 = arg0;
		this.method753();
	}

	@OriginalMember(owner = "client!cg", name = "qb", descriptor = "()V")
	private void method800() {
		if (this.aBoolean78 && !this.aBoolean79) {
			this.anOpengl1.glEnable(2896);
		} else {
			this.anOpengl1.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "(I)I")
	public int method801(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!cg", name = "rb", descriptor = "()V")
	private void method802() {
		if (this.anInt665 == 1) {
			return;
		}
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (this.anInt635 > 0 && this.anInt637 > 0) {
			this.anOpengl1.glOrtho(0.0D, (double) this.anInt635, (double) this.anInt637, 0.0D, -1.0D, 1.0D);
		}
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anInt665 = 1;
		this.anInt644 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "()I")
	@Override
	public int method729() {
		return this.anInt637;
	}
}
