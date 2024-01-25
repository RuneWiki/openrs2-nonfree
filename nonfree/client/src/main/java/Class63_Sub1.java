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

@OriginalClass("client!ks")
public final class Class63_Sub1 extends Class63 implements Interface2 {

	@OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
	public int anInt3595;

	@OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
	private int anInt3596;

	@OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
	public int anInt3597;

	@OriginalMember(owner = "client!ks", name = "K", descriptor = "Lclient!gg;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!ks", name = "L", descriptor = "I")
	public int anInt3598;

	@OriginalMember(owner = "client!ks", name = "N", descriptor = "I")
	public int anInt3600;

	@OriginalMember(owner = "client!ks", name = "R", descriptor = "I")
	public int anInt3603;

	@OriginalMember(owner = "client!ks", name = "Y", descriptor = "Z")
	private boolean aBoolean249;

	@OriginalMember(owner = "client!ks", name = "Z", descriptor = "Lclient!ad;")
	public Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!ks", name = "cb", descriptor = "Z")
	private boolean aBoolean250;

	@OriginalMember(owner = "client!ks", name = "db", descriptor = "Lclient!ad;")
	public Class3_Sub1 aClass3_Sub1_2;

	@OriginalMember(owner = "client!ks", name = "gb", descriptor = "I")
	public int anInt3605;

	@OriginalMember(owner = "client!ks", name = "jb", descriptor = "I")
	private int anInt3608;

	@OriginalMember(owner = "client!ks", name = "kb", descriptor = "F")
	private float aFloat28;

	@OriginalMember(owner = "client!ks", name = "lb", descriptor = "Z")
	public boolean lb;

	@OriginalMember(owner = "client!ks", name = "mb", descriptor = "Z")
	public boolean aBoolean251;

	@OriginalMember(owner = "client!ks", name = "pb", descriptor = "F")
	private float aFloat30;

	@OriginalMember(owner = "client!ks", name = "sb", descriptor = "Z")
	private boolean aBoolean252;

	@OriginalMember(owner = "client!ks", name = "ub", descriptor = "Lclient!tj;")
	public Class197 aClass197_1;

	@OriginalMember(owner = "client!ks", name = "vb", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!ks", name = "wb", descriptor = "I")
	private int anInt3612;

	@OriginalMember(owner = "client!ks", name = "xb", descriptor = "Z")
	private boolean aBoolean253;

	@OriginalMember(owner = "client!ks", name = "zb", descriptor = "I")
	public int anInt3614;

	@OriginalMember(owner = "client!ks", name = "Bb", descriptor = "Lclient!d;")
	private Interface1 anInterface1_4;

	@OriginalMember(owner = "client!ks", name = "Cb", descriptor = "Z")
	private boolean aBoolean255;

	@OriginalMember(owner = "client!ks", name = "Db", descriptor = "Z")
	public boolean aBoolean256;

	@OriginalMember(owner = "client!ks", name = "Eb", descriptor = "Z")
	public boolean aBoolean257;

	@OriginalMember(owner = "client!ks", name = "Fb", descriptor = "Z")
	private boolean aBoolean258;

	@OriginalMember(owner = "client!ks", name = "Gb", descriptor = "Lclient!mf;")
	private Class19_Sub3_Sub1 aClass19_Sub3_Sub1_4;

	@OriginalMember(owner = "client!ks", name = "Kb", descriptor = "Z")
	public boolean aBoolean260;

	@OriginalMember(owner = "client!ks", name = "Nb", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!ks", name = "Ob", descriptor = "Z")
	private boolean aBoolean261;

	@OriginalMember(owner = "client!ks", name = "Pb", descriptor = "I")
	private int anInt3617;

	@OriginalMember(owner = "client!ks", name = "Rb", descriptor = "Lclient!ad;")
	public Class3_Sub1 aClass3_Sub1_3;

	@OriginalMember(owner = "client!ks", name = "Sb", descriptor = "I")
	private int anInt3619;

	@OriginalMember(owner = "client!ks", name = "Tb", descriptor = "I")
	private int anInt3620;

	@OriginalMember(owner = "client!ks", name = "Wb", descriptor = "Lclient!ad;")
	public Class3_Sub1 aClass3_Sub1_4;

	@OriginalMember(owner = "client!ks", name = "Yb", descriptor = "Z")
	public boolean aBoolean262;

	@OriginalMember(owner = "client!ks", name = "ac", descriptor = "Lclient!ad;")
	public Class3_Sub1 aClass3_Sub1_5;

	@OriginalMember(owner = "client!ks", name = "bc", descriptor = "Lclient!ad;")
	public Class3_Sub1 aClass3_Sub1_6;

	@OriginalMember(owner = "client!ks", name = "cc", descriptor = "I")
	private int anInt3623;

	@OriginalMember(owner = "client!ks", name = "dc", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!ks", name = "gc", descriptor = "I")
	private int anInt3625;

	@OriginalMember(owner = "client!ks", name = "jc", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!ks", name = "kc", descriptor = "I")
	private int anInt3628;

	@OriginalMember(owner = "client!ks", name = "mc", descriptor = "F")
	private float aFloat38;

	@OriginalMember(owner = "client!ks", name = "pc", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!ks", name = "qc", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!ks", name = "rc", descriptor = "Lclient!ba;")
	private Class13_Sub1 aClass13_Sub1_1;

	@OriginalMember(owner = "client!ks", name = "sc", descriptor = "Lclient!qb;")
	public Class19_Sub3 aClass19_Sub3_1;

	@OriginalMember(owner = "client!ks", name = "tc", descriptor = "Lclient!qb;")
	public Class19_Sub3 aClass19_Sub3_2;

	@OriginalMember(owner = "client!ks", name = "uc", descriptor = "Lclient!qb;")
	public Class19_Sub3 aClass19_Sub3_3;

	@OriginalMember(owner = "client!ks", name = "vc", descriptor = "Lclient!vr;")
	public Class129_Sub2 aClass129_Sub2_1;

	@OriginalMember(owner = "client!ks", name = "Ac", descriptor = "J")
	private long aLong130;

	@OriginalMember(owner = "client!ks", name = "Bc", descriptor = "Lclient!vr;")
	public Class129_Sub2 aClass129_Sub2_2;

	@OriginalMember(owner = "client!ks", name = "Dc", descriptor = "Lclient!ad;")
	public Class3_Sub1 aClass3_Sub1_7;

	@OriginalMember(owner = "client!ks", name = "Kc", descriptor = "Z")
	private boolean aBoolean267;

	@OriginalMember(owner = "client!ks", name = "Lc", descriptor = "Lclient!kd;")
	private Interface6 anInterface6_4;

	@OriginalMember(owner = "client!ks", name = "Mc", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!ks", name = "Oc", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!ks", name = "Pc", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!ks", name = "Qc", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!ks", name = "Rc", descriptor = "[Lclient!vo;")
	private Class19[] aClass19Array1;

	@OriginalMember(owner = "client!ks", name = "Sc", descriptor = "I")
	private int anInt3634;

	@OriginalMember(owner = "client!ks", name = "Tc", descriptor = "Lclient!ad;")
	public Class3_Sub1 aClass3_Sub1_8;

	@OriginalMember(owner = "client!ks", name = "Uc", descriptor = "Z")
	private boolean aBoolean269;

	@OriginalMember(owner = "client!ks", name = "Vc", descriptor = "Z")
	private boolean aBoolean270;

	@OriginalMember(owner = "client!ks", name = "Xc", descriptor = "I")
	public int anInt3636;

	@OriginalMember(owner = "client!ks", name = "Yc", descriptor = "I")
	private int anInt3637;

	@OriginalMember(owner = "client!ks", name = "Zc", descriptor = "I")
	private int anInt3638;

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "Lclient!tl;")
	private final Class198 aClass198_1 = new Class198();

	@OriginalMember(owner = "client!ks", name = "E", descriptor = "Lclient!m;")
	private final Class129 aClass129_2 = new Class129_Sub2();

	@OriginalMember(owner = "client!ks", name = "H", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!ks", name = "O", descriptor = "[Lclient!gg;")
	private final Interface2[] anInterface2Array1 = new Interface2[4];

	@OriginalMember(owner = "client!ks", name = "M", descriptor = "I")
	public final int anInt3599 = 8;

	@OriginalMember(owner = "client!ks", name = "P", descriptor = "I")
	public final int anInt3601 = 3;

	@OriginalMember(owner = "client!ks", name = "Q", descriptor = "I")
	private int anInt3602 = -1;

	@OriginalMember(owner = "client!ks", name = "F", descriptor = "Lclient!eb;")
	private final Class42 aClass42_23 = new Class42();

	@OriginalMember(owner = "client!ks", name = "S", descriptor = "Lclient!eb;")
	private final Class42 aClass42_24 = new Class42();

	@OriginalMember(owner = "client!ks", name = "T", descriptor = "Lclient!eb;")
	private final Class42 aClass42_25 = new Class42();

	@OriginalMember(owner = "client!ks", name = "U", descriptor = "Lclient!eb;")
	private final Class42 aClass42_26 = new Class42();

	@OriginalMember(owner = "client!ks", name = "V", descriptor = "Lclient!eb;")
	private final Class42 aClass42_27 = new Class42();

	@OriginalMember(owner = "client!ks", name = "W", descriptor = "Lclient!eb;")
	private final Class42 aClass42_28 = new Class42();

	@OriginalMember(owner = "client!ks", name = "X", descriptor = "Lclient!eb;")
	private final Class42 aClass42_29 = new Class42();

	@OriginalMember(owner = "client!ks", name = "ab", descriptor = "[F")
	private final float[] aFloatArray19 = new float[4];

	@OriginalMember(owner = "client!ks", name = "tb", descriptor = "F")
	private float aFloat31 = 1.0F;

	@OriginalMember(owner = "client!ks", name = "rb", descriptor = "I")
	public int anInt3611 = 0;

	@OriginalMember(owner = "client!ks", name = "Jb", descriptor = "I")
	private int anInt3615 = 8448;

	@OriginalMember(owner = "client!ks", name = "Mb", descriptor = "I")
	public int anInt3616 = -1;

	@OriginalMember(owner = "client!ks", name = "ib", descriptor = "I")
	public int anInt3607 = -1;

	@OriginalMember(owner = "client!ks", name = "nb", descriptor = "F")
	public float aFloat29 = 1.0F;

	@OriginalMember(owner = "client!ks", name = "fc", descriptor = "[F")
	private final float[] aFloatArray22 = new float[4];

	@OriginalMember(owner = "client!ks", name = "yb", descriptor = "I")
	private int anInt3613 = 0;

	@OriginalMember(owner = "client!ks", name = "Ub", descriptor = "F")
	public float aFloat36 = -1.0F;

	@OriginalMember(owner = "client!ks", name = "hc", descriptor = "I")
	private int anInt3626 = 0;

	@OriginalMember(owner = "client!ks", name = "Lb", descriptor = "F")
	public float aFloat34 = 1.0F;

	@OriginalMember(owner = "client!ks", name = "bb", descriptor = "I")
	private int anInt3604 = -1;

	@OriginalMember(owner = "client!ks", name = "Ib", descriptor = "F")
	public float aFloat33 = 3584.0F;

	@OriginalMember(owner = "client!ks", name = "yc", descriptor = "F")
	public float aFloat41 = 3584.0F;

	@OriginalMember(owner = "client!ks", name = "ec", descriptor = "I")
	private int anInt3624 = 0;

	@OriginalMember(owner = "client!ks", name = "qb", descriptor = "I")
	private int anInt3610 = 8448;

	@OriginalMember(owner = "client!ks", name = "Zb", descriptor = "[F")
	public final float[] aFloatArray21 = new float[4];

	@OriginalMember(owner = "client!ks", name = "ic", descriptor = "I")
	public int anInt3627 = -1;

	@OriginalMember(owner = "client!ks", name = "hb", descriptor = "I")
	public int anInt3606 = 512;

	@OriginalMember(owner = "client!ks", name = "fb", descriptor = "[F")
	private final float[] aFloatArray20 = new float[4];

	@OriginalMember(owner = "client!ks", name = "zc", descriptor = "F")
	public float aFloat42 = 1.0F;

	@OriginalMember(owner = "client!ks", name = "nc", descriptor = "I")
	public int anInt3630 = 50;

	@OriginalMember(owner = "client!ks", name = "Ec", descriptor = "Z")
	private boolean aBoolean264 = true;

	@OriginalMember(owner = "client!ks", name = "Gc", descriptor = "F")
	private float aFloat44 = 1.0F;

	@OriginalMember(owner = "client!ks", name = "Vb", descriptor = "I")
	public int anInt3621 = 512;

	@OriginalMember(owner = "client!ks", name = "oc", descriptor = "I")
	public int anInt3631 = 3584;

	@OriginalMember(owner = "client!ks", name = "Qb", descriptor = "I")
	public int anInt3618 = 0;

	@OriginalMember(owner = "client!ks", name = "ob", descriptor = "I")
	private int anInt3609 = 0;

	@OriginalMember(owner = "client!ks", name = "Fc", descriptor = "F")
	public float aFloat43 = -1.0F;

	@OriginalMember(owner = "client!ks", name = "eb", descriptor = "F")
	private float aFloat27 = 0.0F;

	@OriginalMember(owner = "client!ks", name = "Cc", descriptor = "[F")
	private final float[] aFloatArray23 = new float[16];

	@OriginalMember(owner = "client!ks", name = "Xb", descriptor = "I")
	private int anInt3622 = 0;

	@OriginalMember(owner = "client!ks", name = "Ic", descriptor = "I")
	private int anInt3633 = 0;

	@OriginalMember(owner = "client!ks", name = "lc", descriptor = "I")
	private int anInt3629 = 0;

	@OriginalMember(owner = "client!ks", name = "xc", descriptor = "I")
	private int anInt3632 = -1;

	@OriginalMember(owner = "client!ks", name = "w", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas2;

	@OriginalMember(owner = "client!ks", name = "B", descriptor = "Lclient!ic;")
	public final Interface3 anInterface3_5;

	@OriginalMember(owner = "client!ks", name = "x", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!ks", name = "u", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl1;

	@OriginalMember(owner = "client!ks", name = "Wc", descriptor = "I")
	public final int anInt3635;

	@OriginalMember(owner = "client!ks", name = "Hb", descriptor = "Z")
	private boolean aBoolean259;

	@OriginalMember(owner = "client!ks", name = "Nc", descriptor = "Z")
	public boolean aBoolean268;

	@OriginalMember(owner = "client!ks", name = "Jc", descriptor = "Z")
	public boolean aBoolean266;

	@OriginalMember(owner = "client!ks", name = "wc", descriptor = "Z")
	public boolean aBoolean263;

	@OriginalMember(owner = "client!ks", name = "Hc", descriptor = "Z")
	private boolean aBoolean265;

	@OriginalMember(owner = "client!ks", name = "Ab", descriptor = "Z")
	public boolean aBoolean254;

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "Lclient!dk;")
	public final Class35 aClass35_1;

	@OriginalMember(owner = "client!ks", name = "t", descriptor = "Lclient!mo;")
	private final Class139 aClass139_1;

	@OriginalMember(owner = "client!ks", name = "D", descriptor = "Lclient!of;")
	private final Class154 aClass154_1;

	@OriginalMember(owner = "client!ks", name = "v", descriptor = "Lclient!u;")
	private final Class1_Sub19_Sub1 aClass1_Sub19_Sub1_1;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!ic;IILclient!gt;)V")
	public Class63_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class75 arg4) {
		this.aCanvas2 = arg0;
		this.anInterface3_5 = arg1;
		this.anInt5007 = arg2;
		@Pc(186) int local186 = 0;
		while (!this.aCanvas2.isShowing()) {
			if (local186++ > 5) {
				throw new RuntimeException("");
			}
			Static135.method2737(1000L);
		}
		this.aCanvas2.setIgnoreRepaint(true);
		try {
			if (Static173.aBoolean247 == null || !Static173.aBoolean247) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static173.aBoolean247 = Boolean.TRUE;
				} else {
					@Pc(220) Class121 local220 = arg4.method2369(this.getClass());
					while (local220.anInt3693 == 0) {
						Static135.method2737(100L);
					}
					if (local220.anInt3693 == 1) {
						Static173.aBoolean247 = Boolean.TRUE;
					}
				}
			}
			if (Static173.aBoolean247 == null || !Static173.aBoolean247) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas2, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method3351();
				this.anOpengl1 = this.aContext1.getGL();
				@Pc(287) int local287 = this.method3332();
				if (local287 != 0) {
					throw new RuntimeException("");
				}
				this.anInt3635 = this.lb ? 33639 : 5121;
				@Pc(306) String local306 = this.aString30.toLowerCase();
				@Pc(310) String local310 = this.aString29.toLowerCase();
				if (local310.indexOf("radeon") != -1) {
					@Pc(317) int local317 = 0;
					@Pc(319) boolean local319 = false;
					@Pc(321) boolean local321 = false;
					@Pc(329) String[] local329 = Static143.method2850(' ', local310.replace('/', ' '));
					for (@Pc(331) int local331 = 0; local331 < local329.length; local331++) {
						@Pc(339) String local339 = local329[local331];
						try {
							if (local339.length() > 0) {
								if (local339.charAt(0) == 'x' && local339.length() >= 3 && Static9.method296(local339.substring(1, 3))) {
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
									if (local339.length() >= 4 && Static9.method296(local339.substring(0, 4))) {
										local317 = Static171.method3207(local339.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(403) Exception local403) {
						}
					}
					if (!local321 && !local319) {
						if (local317 >= 7000 && local317 <= 7999) {
							this.aBoolean259 = false;
						}
						if (local317 >= 7000 && local317 <= 9250) {
							this.aBoolean268 = false;
						}
					}
					if (!local319 || local317 < 4000) {
						this.aBoolean266 = false;
					}
					this.aBoolean263 &= this.anOpengl1.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean265 = this.aBoolean259;
				}
				if (local306.contains("intel")) {
					this.aBoolean254 = false;
				}
				if (this.aBoolean259) {
					try {
						@Pc(461) int[] local461 = new int[1];
						this.anOpengl1.glGenBuffersARB(1, local461, 0);
					} catch (@Pc(469) Throwable local469) {
						throw new RuntimeException("", local469);
					}
				}
				this.method3329(this);
				this.method4572();
				this.method3386();
				new Class15(this);
				this.aClass35_1 = new Class35(this, this.anInterface3_5);
				Static130.method2676(true);
				this.aBoolean248 = true;
				this.aClass139_1 = new Class139(this);
				this.aClass154_1 = new Class154(this);
				this.aClass1_Sub19_Sub1_1 = new Class1_Sub19_Sub1(this);
				this.method3364();
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
						Static135.method2737(100L);
					}
				}
				this.anOpengl1.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(553) Throwable local553) {
			local553.printStackTrace();
			this.method4613();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local553);
		}
	}

	@OriginalMember(owner = "client!ks", name = "E", descriptor = "()V")
	private void method3324() {
		if (this.anInt3634 == 1) {
			return;
		}
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (this.anInt3598 > 0 && this.anInt3600 > 0) {
			this.anOpengl1.glOrtho(0.0D, (double) this.anInt3598, (double) this.anInt3600, 0.0D, -1.0D, 1.0D);
		}
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anInt3634 = 1;
		this.anInt3620 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(III)V")
	public void method3325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!ks", name = "N", descriptor = "()V")
	public void method3326() {
		if (this.anInt3620 == 2) {
			return;
		}
		this.method3324();
		this.method3339(false);
		this.method3330(false);
		this.method3357(false);
		this.method3384(false);
		this.method3331();
		this.anInt3620 = 2;
	}

	@OriginalMember(owner = "client!ks", name = "O", descriptor = "()V")
	private void method3327() {
		@Pc(2) float[] local2 = this.aFloatArray23;
		@Pc(14) float local14 = (float) (-this.anInt3611 * this.anInt3630) / (float) this.anInt3606;
		@Pc(28) float local28 = (float) ((this.anInt3598 - this.anInt3611) * this.anInt3630) / (float) this.anInt3606;
		@Pc(39) float local39 = (float) (this.anInt3618 * this.anInt3630) / (float) this.anInt3621;
		@Pc(53) float local53 = (float) ((this.anInt3618 - this.anInt3600) * this.anInt3630) / (float) this.anInt3621;
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
			@Pc(67) float local67 = (float) this.anInt3630 * 2.0F;
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
			local2[10] = this.aFloat30 = (float) -(this.anInt3631 + this.anInt3630) / (float) (this.anInt3631 - this.anInt3630);
			local2[11] = -1.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = this.aFloat38 = -(local67 * (float) this.anInt3631) / (float) (this.anInt3631 - this.anInt3630);
			local2[15] = 0.0F;
		}
		this.method3361();
	}

	@OriginalMember(owner = "client!ks", name = "P", descriptor = "()V")
	private void method3328() {
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl1.glMultMatrixf(this.aClass129_Sub2_2.method5792(), 0);
		this.method3366();
	}

	@OriginalMember(owner = "client!ks", name = "D", descriptor = "()F")
	@Override
	public float method4638() {
		return this.aFloat46;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!gg;)V")
	public void method3329(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt3602 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3602 >= 0) {
			this.anInterface2Array1[this.anInt3602].method5353();
		}
		this.anInterface2_1 = this.anInterface2Array1[++this.anInt3602] = arg0;
		this.anInterface2_1.method5355();
	}

	@OriginalMember(owner = "client!ks", name = "i", descriptor = "()V")
	@Override
	public void method4572() {
		this.anInt3598 = this.aCanvas2.getWidth();
		this.anInt3600 = this.aCanvas2.getHeight();
		this.anOpengl1.glViewport(this.anInt3622, this.anInt3626, this.anInt3598, this.anInt3600);
		this.method3365();
		this.method4651();
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(Z)V")
	@Override
	public void method4635(@OriginalArg(0) boolean arg0) {
		this.aBoolean264 = arg0;
		this.method3383();
	}

	@OriginalMember(owner = "client!ks", name = "r", descriptor = "()Z")
	@Override
	public boolean method4598() {
		return true;
	}

	@OriginalMember(owner = "client!ks", name = "B", descriptor = "()Z")
	@Override
	public boolean method4624() {
		return this.aBoolean249;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "([Lclient!bi;Lclient!m;[Lclient!oo;I)V")
	@Override
	public void method4636(@OriginalArg(0) Class3[] arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) Class32_Sub4[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method1242(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "n", descriptor = "()Z")
	@Override
	public boolean method4583() {
		return true;
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(Z)V")
	public void method3330(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean267) {
			this.aBoolean267 = arg0;
			this.method3393();
			this.anInt3620 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method4622(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt3604 != arg0;
		if (local7 || this.aFloat36 != arg1 || this.aFloat43 != arg2) {
			this.anInt3604 = arg0;
			this.aFloat36 = arg1;
			this.aFloat43 = arg2;
			if (local7) {
				this.aFloat42 = (float) (this.anInt3604 & 0xFF0000) / 1.671168E7F;
				this.aFloat29 = (float) (this.anInt3604 & 0xFFFF) / 65535.0F;
				this.aFloat34 = (float) (this.anInt3604 & 0xFF) / 255.0F;
				this.method3349();
			}
			this.method3370();
		}
		if (this.aFloatArray20[0] == arg3 && this.aFloatArray20[1] == arg4 && this.aFloatArray20[2] == arg5) {
			return;
		}
		this.aFloatArray20[0] = arg3;
		this.aFloatArray20[1] = arg4;
		this.aFloatArray20[2] = arg5;
		this.aFloatArray19[0] = -arg3;
		this.aFloatArray19[1] = -arg4;
		this.aFloatArray19[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray21[0] = arg3 * local132;
		this.aFloatArray21[1] = arg4 * local132;
		this.aFloatArray21[2] = arg5 * local132;
		this.aFloatArray22[0] = -this.aFloatArray21[0];
		this.aFloatArray22[1] = -this.aFloatArray21[1];
		this.aFloatArray22[2] = -this.aFloatArray21[2];
		this.method3366();
		this.anInt3614 = (int) (arg3 * 256.0F / arg4);
		this.anInt3636 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "(I)V")
	public void method3331() {
		this.method3395(-2, true);
	}

	@OriginalMember(owner = "client!ks", name = "Q", descriptor = "()I")
	private int method3332() {
		@Pc(1) int local1 = 0;
		this.aString30 = this.anOpengl1.glGetString(7936);
		this.aString29 = this.anOpengl1.glGetString(7937);
		@Pc(17) String local17 = this.aString30.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl1.glGetString(7938);
		@Pc(53) String[] local53 = Static143.method2850(' ', local45.replace('.', ' '));
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static171.method3207(local53[0]);
				@Pc(69) int local69 = Static171.method3207(local53[1]);
				this.anInt3625 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt3625 < 12) {
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
		this.anInt3605 = local116[0];
		this.anOpengl1.glGetIntegerv(34929, local116, 0);
		this.anInt3619 = local116[0];
		this.anOpengl1.glGetIntegerv(34930, local116, 0);
		this.anInt3617 = local116[0];
		if (this.anInt3605 < 2 || this.anInt3619 < 2 || this.anInt3617 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean252 = Static111.aString15 != null && Static111.aString15.startsWith("mac");
		this.lb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean259 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean249 = this.anOpengl1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean257 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean256 = this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean268 = this.anOpengl1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean263 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean260 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean266 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean262 = false;
		this.aBoolean254 = this.anOpengl1.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3381();
		this.method3374(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!ks", name = "R", descriptor = "()V")
	public void method3333() {
		if (this.anInt3620 == 8) {
			return;
		}
		this.method3391();
		this.method3339(true);
		this.method3357(true);
		this.method3384(true);
		this.method3374(1);
		this.method3340(1);
		this.anInt3620 = 8;
	}

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)V")
	@Override
	public void method4627(@OriginalArg(0) int arg0) {
		this.method3374(0);
		this.anOpengl1.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl1.glClear(16384);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!d;III)V")
	public void method3334(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3358(arg0);
		arg0.method2056(arg1, arg2);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(FFFF)V")
	public void method3335(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static173.aFloatArray18[0] = arg0;
		Static173.aFloatArray18[1] = arg1;
		Static173.aFloatArray18[2] = arg2;
		Static173.aFloatArray18[3] = arg3;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static173.aFloatArray18, 0);
	}

	@OriginalMember(owner = "client!ks", name = "S", descriptor = "()V")
	private void method3336() {
		@Pc(15) int local15;
		if (this.aBoolean251) {
			this.anOpengl1.glFogf(2915, 0.0F);
			this.anOpengl1.glFogf(2916, 1.0F);
			local15 = this.anInt3632;
		} else {
			this.aFloat28 = (float) (this.anInt3631 - 256) - this.aFloat27;
			this.aFloat37 = this.aFloat28 - (float) this.anInt3607 * this.aFloat31;
			if (this.aFloat37 < (float) this.anInt3630) {
				this.aFloat37 = this.anInt3630;
			}
			this.anOpengl1.glFogf(2915, this.aFloat37);
			this.anOpengl1.glFogf(2916, this.aFloat28);
			local15 = this.anInt3616;
		}
		Static173.aFloatArray18[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static173.aFloatArray18[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static173.aFloatArray18[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl1.glFogfv(2918, Static173.aFloatArray18, 0);
	}

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "()Z")
	@Override
	public boolean method4599() {
		return !this.aBoolean252;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(IIII)V")
	@Override
	public void method4566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt3598) {
			arg2 = this.anInt3598;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt3600) {
			arg3 = this.anInt3600;
		}
		this.anInt3624 = arg0;
		this.anInt3613 = arg1;
		this.anInt3633 = arg2;
		this.anInt3609 = arg3;
		this.anOpengl1.glEnable(3089);
		this.method3388();
		this.method3373();
	}

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "(Z)V")
	public void method3337(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean253) {
			this.aBoolean253 = arg0;
			this.method3393();
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "()V")
	@Override
	public void method5353() {
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4564(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static316.aFloat59 = arg0;
		Static316.aFloat60 = arg1;
		Static316.aFloat61 = arg2;
	}

	@OriginalMember(owner = "client!ks", name = "w", descriptor = "()V")
	@Override
	public void method4608() {
	}

	@OriginalMember(owner = "client!ks", name = "H", descriptor = "()Z")
	@Override
	public boolean method4648() {
		if (!this.aClass1_Sub19_Sub1_1.method5457()) {
			if (!this.aClass154_1.method4164(this.aClass1_Sub19_Sub1_1)) {
				return false;
			}
			this.aClass35_1.method1410();
		}
		return true;
	}

	@OriginalMember(owner = "client!ks", name = "i", descriptor = "(I)V")
	public synchronized void method3338(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub9 local4 = new Class1_Sub9(arg0);
		this.aClass42_28.method1549(local4);
	}

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "(Z)V")
	public void method3339(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean270) {
			this.aBoolean270 = arg0;
			this.method3354();
			this.anInt3620 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(IIII)V")
	@Override
	public void method4590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3611 = arg0;
		this.anInt3618 = arg1;
		this.anInt3606 = arg2;
		this.anInt3621 = arg3;
		this.method3327();
		this.method3388();
		if (this.anInt3634 == 3) {
			this.method3380();
		} else if (this.anInt3634 == 2) {
			this.method3359();
		}
	}

	@OriginalMember(owner = "client!ks", name = "j", descriptor = "(I)V")
	public void method3340(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3356(7681, 7681);
		} else if (arg0 == 1) {
			this.method3356(8448, 8448);
		} else if (arg0 == 2) {
			this.method3356(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!ks", name = "F", descriptor = "()I")
	@Override
	public int method4642() {
		return this.anInt3597 + this.anInt3595 + this.anInt3596;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!hi;[Lclient!tr;Z)Lclient!df;")
	@Override
	public Class33 method4611(@OriginalArg(0) Class80 arg0, @OriginalArg(1) Class201[] arg1) {
		return new Class33_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I[Lclient!ap;)V")
	@Override
	public void method4557(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class1_Sub5 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static173.aFloatArray17[0] = local8.anInt4966;
			Static173.aFloatArray17[1] = local8.anInt4967;
			Static173.aFloatArray17[2] = local8.anInt4965;
			Static173.aFloatArray17[3] = 1.0F;
			this.anOpengl1.glLightfv(local12, 4611, Static173.aFloatArray17, 0);
			@Pc(44) int local44 = local8.anInt4970;
			@Pc(49) float local49 = local8.aFloat52 / 255.0F;
			Static173.aFloatArray17[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static173.aFloatArray17[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static173.aFloatArray17[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl1.glLightfv(local12, 4609, Static173.aFloatArray17, 0);
			this.anOpengl1.glLightf(local12, 4617, 1.0F / (float) (local8.anInt4963 * local8.anInt4963));
			this.anOpengl1.glEnable(local12);
		}
		while (local1 < this.anInt3629) {
			this.anOpengl1.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt3629 = arg0;
	}

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "(II)V")
	public synchronized void method3341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub9 local4 = new Class1_Sub9(arg1);
		local4.aLong217 = arg0;
		this.aClass42_26.method1549(local4);
	}

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "(I)V")
	public void method3342(@OriginalArg(0) int arg0) {
		Static173.aFloatArray18[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static173.aFloatArray18[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static173.aFloatArray18[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static173.aFloatArray18[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static173.aFloatArray18, 0);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass129_Sub2_2.aFloat73 * (float) arg0 + this.aClass129_Sub2_2.aFloat75 * (float) arg1 + this.aClass129_Sub2_2.aFloat74 * (float) arg2 + this.aClass129_Sub2_2.aFloat66;
		if (local24 < (float) this.anInt3630 || local24 > (float) this.anInt3631) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt3606 * (this.aClass129_Sub2_2.aFloat65 * (float) arg0 + this.aClass129_Sub2_2.aFloat68 * (float) arg1 + this.aClass129_Sub2_2.aFloat70 * (float) arg2 + this.aClass129_Sub2_2.aFloat71) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt3621 * (this.aClass129_Sub2_2.aFloat72 * (float) arg0 + this.aClass129_Sub2_2.aFloat67 * (float) arg1 + this.aClass129_Sub2_2.aFloat69 * (float) arg2 + this.aClass129_Sub2_2.aFloat64) / local24);
		if ((float) local81 >= this.aFloat40 && (float) local81 <= this.aFloat47 && (float) local113 >= this.aFloat39 && (float) local113 <= this.aFloat45) {
			arg3[0] = (int) ((float) local81 - this.aFloat40);
			arg3[1] = (int) ((float) local113 - this.aFloat39);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "()Z")
	@Override
	public boolean method4567() {
		return false;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(F)V")
	public void method3343(@OriginalArg(0) float arg0) {
		if (this.aFloat44 != arg0) {
			this.aFloat44 = arg0;
			if (this.anInt3634 == 3) {
				this.method3380();
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "()I")
	@Override
	public int method5354() {
		return this.anInt3600;
	}

	@OriginalMember(owner = "client!ks", name = "C", descriptor = "()Lclient!m;")
	@Override
	public Class129 method4634() {
		return this.aClass129_2;
	}

	@OriginalMember(owner = "client!ks", name = "T", descriptor = "()V")
	public void method3344() {
		this.anOpengl1.glPopMatrix();
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "()V")
	@Override
	public void method5355() {
	}

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "(I)V")
	public void method3345(@OriginalArg(0) int arg0) {
		if (this.anInt3628 != arg0) {
			this.anOpengl1.glActiveTexture(arg0 + 33984);
			this.anInt3628 = arg0;
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(FFF)V")
	private void method3346(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl1.glMatrixMode(5890);
		if (this.aBoolean250) {
			this.anOpengl1.glLoadIdentity();
		}
		this.anOpengl1.glTranslatef(arg0, arg1, arg2);
		this.anOpengl1.glMatrixMode(5888);
		this.aBoolean250 = true;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIII)[I")
	@Override
	public int[] method4562() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl1.glReadPixels(0, this.anInt3600 - local6, 36, 1, 32993, this.anInt3635, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "(II)V")
	public void method3347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3622 = arg0;
		this.anInt3626 = arg1;
		this.anOpengl1.glViewport(arg0, arg1, this.anInt3598, this.anInt3600);
		this.method3373();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl1.glLineWidth((float) arg5);
		this.method4626(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ks", name = "M", descriptor = "()Z")
	@Override
	public boolean method4657() {
		return this.aClass1_Sub19_Sub1_1.method5457();
	}

	@OriginalMember(owner = "client!ks", name = "m", descriptor = "(I)V")
	public synchronized void method3348(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub9 local4 = new Class1_Sub9(arg0);
		this.aClass42_29.method1549(local4);
	}

	@OriginalMember(owner = "client!ks", name = "U", descriptor = "()V")
	private void method3349() {
		Static173.aFloatArray18[0] = this.aFloat35 * this.aFloat42;
		Static173.aFloatArray18[1] = this.aFloat35 * this.aFloat29;
		Static173.aFloatArray18[2] = this.aFloat35 * this.aFloat34;
		Static173.aFloatArray18[3] = 1.0F;
		this.anOpengl1.glLightModelfv(2899, Static173.aFloatArray18, 0);
	}

	@OriginalMember(owner = "client!ks", name = "V", descriptor = "()Lclient!gg;")
	public Interface2 method3350() {
		return this.anInterface2_1;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V")
	@Override
	public void method4568(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "()V")
	@Override
	public void method4561() {
		this.aClass139_1.method3748(0, false, false);
		this.aBoolean251 = false;
		this.method3336();
		this.method3354();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "([I)V")
	@Override
	public void method4565(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3624;
		arg0[1] = this.anInt3613;
		arg0[2] = this.anInt3633;
		arg0[3] = this.anInt3609;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(IIIII)V")
	@Override
	protected void method4595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
	@Override
	public void method4576(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "()Z")
	@Override
	public boolean method4575() {
		return false;
	}

	@OriginalMember(owner = "client!ks", name = "W", descriptor = "()V")
	private void method3351() {
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
			Static135.method2737(1000L);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method4658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass19_Sub3_Sub1_4 == null || this.aClass19_Sub3_Sub1_4.anInt3964 < arg2 || this.aClass19_Sub3_Sub1_4.anInt3963 < arg3) {
			this.aClass19_Sub3_Sub1_4 = Static376.method3683(arg3, this, arg2, arg6);
			this.aClass19_Sub3_Sub1_4.method3681(false, false);
			local32 = this.aClass19_Sub3_Sub1_4.aFloat48;
			local36 = this.aClass19_Sub3_Sub1_4.aFloat49;
		} else {
			this.aClass19_Sub3_Sub1_4.method3679(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass19_Sub3_Sub1_4.aFloat48 * (float) arg3 / (float) this.aClass19_Sub3_Sub1_4.anInt3963;
			local36 = this.aClass19_Sub3_Sub1_4.aFloat49 * (float) arg2 / (float) this.aClass19_Sub3_Sub1_4.anInt3964;
		}
		this.method3326();
		this.method3355(this.aClass19_Sub3_Sub1_4);
		this.method3374(arg8);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method3342(arg5);
		this.method3356(34165, 34165);
		this.method3325(0, 34166, 768);
		this.method3325(2, 5890, 770);
		this.method3371(0, 34166);
		this.method3371(2, 5890);
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
		this.method3325(0, 5890, 768);
		this.method3325(2, 34166, 770);
		this.method3371(0, 5890);
		this.method3371(2, 34166);
	}

	@OriginalMember(owner = "client!ks", name = "X", descriptor = "()V")
	private void method3352() {
		if (this.aBoolean250) {
			this.anOpengl1.glMatrixMode(5890);
			this.anOpengl1.glLoadIdentity();
			this.anOpengl1.glMatrixMode(5888);
			this.aBoolean250 = false;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "([Lclient!bi;Lclient!ci;Lclient!m;[Lclient!oo;I)V")
	@Override
	public void method4597(@OriginalArg(0) Class3[] arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class129 arg2, @OriginalArg(3) Class32_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method4636(arg0, arg2, arg3, arg4);
		this.method4559(arg1);
	}

	@OriginalMember(owner = "client!ks", name = "n", descriptor = "(I)V")
	public synchronized void method3353(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub9 local4 = new Class1_Sub9(arg0);
		this.aClass42_26.method1549(local4);
	}

	@OriginalMember(owner = "client!ks", name = "Y", descriptor = "()V")
	private void method3354() {
		if (this.aBoolean270 && this.aBoolean251 | this.anInt3607 >= 0) {
			this.anOpengl1.glEnable(2912);
		} else {
			this.anOpengl1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ks", name = "I", descriptor = "()Z")
	@Override
	public boolean method4649() {
		return true;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!ci;)V")
	@Override
	public void method4559(@OriginalArg(0) Class26 arg0) {
		this.aClass198_1.method5376(this, arg0);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!vo;)V")
	public void method3355(@OriginalArg(0) Class19 arg0) {
		@Pc(5) Class19 local5 = this.aClass19Array1[this.anInt3628];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl1.glDisable(local5.anInt4603);
			} else {
				if (local5 == null) {
					this.anOpengl1.glEnable(arg0.anInt4603);
				} else if (arg0.anInt4603 != local5.anInt4603) {
					this.anOpengl1.glDisable(local5.anInt4603);
					this.anOpengl1.glEnable(arg0.anInt4603);
				}
				this.anOpengl1.glBindTexture(arg0.anInt4603, arg0.method4242());
			}
			this.aClass19Array1[this.anInt3628] = arg0;
		}
		this.anInt3620 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)V")
	@Override
	public void method4563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean251) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt3632 = arg1;
		this.anInt3627 = arg2;
		this.method3336();
		this.aClass139_1.method3751(arg0, true);
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(IIII)V")
	@Override
	public void method4641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass154_1.method4168(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "(II)V")
	public void method3356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3628 != 0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt3615 != arg0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anInt3615 = arg0;
			local4 = true;
		}
		if (this.anInt3610 != arg1) {
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			this.anInt3610 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt3620 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "(Z)V")
	public void method3357(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean255) {
			return;
		}
		if (arg0) {
			this.anOpengl1.glEnable(2929);
		} else {
			this.anOpengl1.glDisable(2929);
		}
		this.aBoolean255 = arg0;
		this.anInt3620 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!d;)V")
	public void method3358(@OriginalArg(0) Interface1 arg0) {
		if (this.anInterface1_4 != arg0 && this.aBoolean259) {
			this.anOpengl1.glBindBufferARB(34963, arg0.method5379());
			this.anInterface1_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!ks", name = "Z", descriptor = "()V")
	private void method3359() {
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadMatrixf(this.aFloatArray23, 0);
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I[BIZ)Lclient!kd;")
	public Interface6 method3360(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface6) (this.aBoolean259 && (!arg3 || this.aBoolean265) ? new Class66_Sub2(this, arg0, arg1, arg2, arg3) : new Class23_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)V")
	@Override
	public void method4618(@OriginalArg(0) int arg0) {
		this.method3390();
	}

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "(IIII)V")
	@Override
	public void method4659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3624 < arg0) {
			this.anInt3624 = arg0;
		}
		if (this.anInt3633 > arg2) {
			this.anInt3633 = arg2;
		}
		if (this.anInt3613 < arg1) {
			this.anInt3613 = arg1;
		}
		if (this.anInt3609 > arg3) {
			this.anInt3609 = arg3;
		}
		this.anOpengl1.glEnable(3089);
		this.method3388();
		this.method3373();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIIILclient!tm;II)V")
	@Override
	public void method4585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class92 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class92_Sub1 local2 = (Class92_Sub1) arg5;
		@Pc(5) Class19_Sub3_Sub1 local5 = local2.aClass19_Sub3_Sub1_3;
		this.method3326();
		this.method3355(local2.aClass19_Sub3_Sub1_3);
		this.method3374(1);
		this.method3356(7681, 8448);
		this.method3325(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat49 / (float) local5.anInt3967;
		@Pc(37) float local37 = local5.aFloat48 / (float) local5.anInt3966;
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
		this.method3325(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ks", name = "ab", descriptor = "()V")
	private void method3361() {
		if (this.aFloat46 == 0.0F) {
			this.aFloatArray23[10] = this.aFloat30;
			this.aFloatArray23[14] = this.aFloat38;
		} else {
			@Pc(13) float local13 = this.aFloat32 / (this.aFloat46 + this.aFloat32);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat38 * (1.0F - local13) * (1.0F - local13) / this.aFloat46;
			this.aFloatArray23[10] = this.aFloat30 + local32;
			this.aFloatArray23[14] = this.aFloat38 * local17;
		}
		this.aFloat41 = (this.aFloatArray23[14] - (float) this.anInt3631) / this.aFloatArray23[10];
		this.aFloat33 = (float) this.anInt3631 - this.aFloat46;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!vr;)V")
	public void method3362(@OriginalArg(0) Class129_Sub2 arg0) {
		this.anOpengl1.glPushMatrix();
		this.anOpengl1.glMultMatrixf(arg0.method5792(), 0);
	}

	@OriginalMember(owner = "client!ks", name = "J", descriptor = "()V")
	@Override
	public void method4651() {
		this.anInt3624 = 0;
		this.anInt3613 = 0;
		this.anInt3633 = this.anInt3598;
		this.anInt3609 = this.anInt3600;
		this.anOpengl1.glDisable(3089);
		this.method3388();
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method4626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3381();
		this.method3374(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!kd;")
	public Interface6 method3363(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface6) (this.aBoolean259 ? new Class66_Sub2(this, arg0, arg1, false) : new Class23_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "()V")
	@Override
	public void method4614() {
		this.aClass154_1.method4163();
	}

	@OriginalMember(owner = "client!ks", name = "bb", descriptor = "()V")
	private void method3364() {
		this.method3331();
		for (@Pc(7) int local7 = this.anInt3605 - 1; local7 >= 0; local7--) {
			this.method3345(local7);
			this.method3355(null);
			this.anOpengl1.glTexEnvi(8960, 8704, 34160);
		}
		this.method3356(8448, 8448);
		this.method3325(2, 34168, 770);
		this.method3352();
		this.anInt3623 = 1;
		this.anOpengl1.glEnable(3042);
		this.anOpengl1.glBlendFunc(770, 771);
		this.anInt3608 = 1;
		this.anOpengl1.glEnable(3008);
		this.anOpengl1.glAlphaFunc(516, 0.0F);
		this.aBoolean269 = true;
		this.anOpengl1.glColorMask(true, true, true, true);
		this.aBoolean258 = true;
		this.method3339(true);
		this.method3330(true);
		this.method3357(true);
		this.method3384(true);
		this.method3365();
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
		this.anInt3604 = this.anInt3616 = -1;
		this.method4651();
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)V")
	@Override
	public void method4582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3630 == arg0 && this.anInt3631 == arg1) {
			return;
		}
		this.anInt3630 = arg0;
		this.anInt3631 = arg1;
		this.method3327();
		this.method3336();
		if (this.anInt3634 == 3) {
			this.method3380();
		} else if (this.anInt3634 == 2) {
			this.method3359();
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)Lclient!mk;")
	@Override
	public Class1_Sub30 method4588() {
		return null;
	}

	@OriginalMember(owner = "client!ks", name = "cb", descriptor = "()V")
	public void method3365() {
		if (this.anInt3634 != 0) {
			this.anInt3634 = 0;
			this.anInt3620 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ks", name = "db", descriptor = "()V")
	public void method3366() {
		this.anOpengl1.glLightfv(16384, 4611, this.aFloatArray21, 0);
		this.anOpengl1.glLightfv(16385, 4611, this.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!kd;)V")
	public void method3367(@OriginalArg(0) Interface6 arg0) {
		if (this.anInterface6_4 != arg0 && this.aBoolean259) {
			this.anOpengl1.glBindBufferARB(34962, arg0.method5379());
			this.anInterface6_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "(I)I")
	public int method3368(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ks", name = "eb", descriptor = "()Lclient!ea;")
	public Class19_Sub2 method3369() {
		return this.aClass13_Sub1_1 == null ? null : this.aClass13_Sub1_1.method5276();
	}

	@OriginalMember(owner = "client!ks", name = "j", descriptor = "()Lclient!m;")
	@Override
	public Class129 method4573() {
		return new Class129_Sub2();
	}

	@OriginalMember(owner = "client!ks", name = "fb", descriptor = "()V")
	private void method3370() {
		Static173.aFloatArray18[0] = this.aFloat36 * this.aFloat42;
		Static173.aFloatArray18[1] = this.aFloat36 * this.aFloat29;
		Static173.aFloatArray18[2] = this.aFloat36 * this.aFloat34;
		Static173.aFloatArray18[3] = 1.0F;
		this.anOpengl1.glLightfv(16384, 4609, Static173.aFloatArray18, 0);
		Static173.aFloatArray18[0] = -this.aFloat43 * this.aFloat42;
		Static173.aFloatArray18[1] = -this.aFloat43 * this.aFloat29;
		Static173.aFloatArray18[2] = -this.aFloat43 * this.aFloat34;
		Static173.aFloatArray18[3] = 1.0F;
		this.anOpengl1.glLightfv(16385, 4609, Static173.aFloatArray18, 0);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II[[I[[IIII)Lclient!ui;")
	@Override
	public Class36 method4581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class36_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(III)V")
	public void method3371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "(I)I")
	public int method3372(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(Z)V")
	@Override
	public void method4637(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ks", name = "gb", descriptor = "()V")
	private void method3373() {
		if (this.anInt3624 <= this.anInt3633 && this.anInt3613 <= this.anInt3609) {
			this.anOpengl1.glScissor(this.anInt3622 + this.anInt3624, this.anInt3626 + this.anInt3600 - this.anInt3609, this.anInt3633 - this.anInt3624, this.anInt3609 - this.anInt3613);
		} else {
			this.anOpengl1.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method4604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3381();
		this.method3374(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!ks", name = "q", descriptor = "(I)V")
	public void method3374(@OriginalArg(0) int arg0) {
		if (this.anInt3623 == arg0) {
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
		if (local10 != this.aBoolean258) {
			this.anOpengl1.glColorMask(local10, local10, local10, true);
			this.aBoolean258 = local10;
		}
		if (local12 != this.aBoolean269) {
			if (local12) {
				this.anOpengl1.glEnable(3008);
			} else {
				this.anOpengl1.glDisable(3008);
			}
			this.aBoolean269 = local12;
		}
		if (local8 != this.anInt3608) {
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
			this.anInt3608 = local8;
		}
		this.anInt3623 = arg0;
		this.anInt3620 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "(III)V")
	public void method3375(@OriginalArg(2) int arg0) {
		this.anOpengl1.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(F)V")
	@Override
	public void method4650(@OriginalArg(0) float arg0) {
		if (this.aFloat35 != arg0) {
			this.aFloat35 = arg0;
			this.method3349();
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!tm;II)V")
	@Override
	public void method4594(@OriginalArg(1) Class92 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class92_Sub1 local2 = (Class92_Sub1) arg0;
		@Pc(5) Class19_Sub3_Sub1 local5 = local2.aClass19_Sub3_Sub1_3;
		this.method3326();
		this.method3355(local2.aClass19_Sub3_Sub1_3);
		this.method3374(1);
		this.method3356(7681, 8448);
		this.method3325(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat49 / (float) local5.anInt3967;
		@Pc(37) float local37 = local5.aFloat48 / (float) local5.anInt3966;
		this.anOpengl1.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt3624 - arg1), local37 * (float) (this.anInt3613 - arg2));
		this.anOpengl1.glVertex2i(this.anInt3624, this.anInt3613);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt3624 - arg1), local37 * (float) (this.anInt3609 - arg2));
		this.anOpengl1.glVertex2i(this.anInt3624, this.anInt3609);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt3633 - arg1), local37 * (float) (this.anInt3609 - arg2));
		this.anOpengl1.glVertex2i(this.anInt3633, this.anInt3609);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt3633 - arg1), local37 * (float) (this.anInt3613 - arg2));
		this.anOpengl1.glVertex2i(this.anInt3633, this.anInt3613);
		this.anOpengl1.glEnd();
		this.method3325(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V")
	@Override
	public void method4600(@OriginalArg(0) int arg0) {
		this.method3351();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4646(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4632(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method4647();
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I[BIZ)Lclient!d;")
	public Interface1 method3376(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface1) (this.aBoolean259 && (!arg2 || this.aBoolean265) ? new Class66_Sub1(this, 5123, arg0, arg1, arg2) : new Class23_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "()Z")
	@Override
	public boolean method4558() {
		return this.aClass139_1.method3750();
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(III)V")
	@Override
	public void method4643() {
		this.aBoolean251 = true;
		this.anInt3632 = 1583160;
		this.anInt3627 = 40;
		this.method3336();
		this.method3354();
		this.aClass139_1.method3748(3, false, false);
		this.aClass139_1.method3751(-1, true);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public void method4596(@OriginalArg(0) Class129 arg0) {
		this.aClass129_Sub2_2 = (Class129_Sub2) arg0;
		this.aClass129_Sub2_1.method5790(this.aClass129_Sub2_2);
		if (this.anInt3634 != 1) {
			this.method3328();
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(Lclient!gg;)V")
	public void method3377(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt3602 < 0 || this.anInterface2Array1[this.anInt3602] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface2Array1[this.anInt3602--] = null;
		arg0.method5353();
		if (this.anInt3602 >= 0) {
			this.anInterface2_1 = this.anInterface2Array1[this.anInt3602];
			this.anInterface2_1.method5355();
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(FF)V")
	@Override
	public void method4570(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat32 && arg1 == this.aFloat46) {
			return;
		}
		this.aFloat32 = arg0;
		this.aFloat46 = arg1;
		this.method3361();
		if (this.anInt3634 == 3) {
			this.method3380();
		} else if (this.anInt3634 == 2) {
			this.method3359();
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!bi;Lclient!ci;Lclient!m;Lclient!oo;I)V")
	@Override
	public void method4655(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class129 arg2, @OriginalArg(3) Class32_Sub4 arg3) {
		arg0.method1242(arg2, arg3, 0);
		this.method4559(arg1);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZZ)V")
	public void method3378(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt3612) {
			if (arg0 < 0) {
				this.method3352();
				this.method3355(null);
				if (!this.aBoolean251) {
					this.aClass139_1.method3748(0, arg1, arg2);
				}
			} else {
				@Pc(11) Class19_Sub3 local11 = this.aClass35_1.method1409(arg0);
				@Pc(17) Class178 local17 = this.anInterface3_5.method5486(arg0);
				if (local17.aByte50 == 0 && local17.aByte48 == 0) {
					this.method3352();
				} else {
					@Pc(30) int local30 = local17.aBoolean395 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method3346((float) (this.anInt3603 % local34 * local17.aByte50) / (float) local34, (float) (this.anInt3603 % local34 * local17.aByte48) / (float) local34, 0.0F);
				}
				if (this.aBoolean251) {
					this.aClass139_1.method3748(3, arg1, arg2);
					this.method3355(local11);
				} else {
					this.aClass139_1.method3748(local17.aByte54, arg1, arg2);
					this.aClass139_1.method3751(local17.aByte51, false);
					if (!this.aClass139_1.method3749(local11)) {
						this.method3355(local11);
					}
				}
			}
			this.anInt3612 = arg0;
		}
		this.anInt3620 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method4645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method3381();
		this.method3374(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean249) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local23);
		this.anOpengl1.glVertex2f(local16, local23);
		this.anOpengl1.glVertex2f(local16, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean249) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "(II)V")
	public synchronized void method3379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub9 local4 = new Class1_Sub9(arg1);
		local4.aLong217 = arg0;
		this.aClass42_25.method1549(local4);
	}

	@OriginalMember(owner = "client!ks", name = "m", descriptor = "()I")
	@Override
	public int method4580() {
		@Pc(2) int local2 = this.anInt3637;
		this.anInt3637 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "()V")
	@Override
	public void method4591() {
		if (this.aClass1_Sub19_Sub1_1.method5457()) {
			this.aClass154_1.method4166(this.aClass1_Sub19_Sub1_1);
			this.aClass35_1.method1410();
		}
	}

	@OriginalMember(owner = "client!ks", name = "hb", descriptor = "()V")
	private void method3380() {
		@Pc(11) float local11 = (float) -this.anInt3611 * this.aFloat44 / (float) this.anInt3606;
		@Pc(23) float local23 = (float) -this.anInt3618 * this.aFloat44 / (float) this.anInt3621;
		@Pc(37) float local37 = (float) (this.anInt3598 - this.anInt3611) * this.aFloat44 / (float) this.anInt3606;
		@Pc(51) float local51 = (float) (this.anInt3600 - this.anInt3618) * this.aFloat44 / (float) this.anInt3621;
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (local11 != local37 && local51 != local23) {
			this.anOpengl1.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt3630 - this.aFloat46), (double) ((float) this.anInt3631 - this.aFloat46));
		}
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!sd;Lclient!sd;FLclient!sd;)Lclient!sd;")
	@Override
	public Class13 method4631(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class13 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean260 && this.aBoolean254) {
			@Pc(11) Class13_Sub1_Sub1 local11 = null;
			@Pc(14) Class13_Sub1 local14 = (Class13_Sub1) arg0;
			@Pc(17) Class13_Sub1 local17 = (Class13_Sub1) arg1;
			@Pc(21) Class19_Sub2 local21 = local14.method5276();
			@Pc(25) Class19_Sub2 local25 = local17.method5276();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt1573 > local25.anInt1573 ? local21.anInt1573 : local25.anInt1573;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class13_Sub1_Sub1) {
					@Pc(52) Class13_Sub1_Sub1 local52 = (Class13_Sub1_Sub1) arg3;
					if (local52.method1559() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class13_Sub1_Sub1(this, local40);
				}
				local11.method1560(arg2, local25, local21);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ks", name = "ib", descriptor = "()V")
	private void method3381() {
		if (this.anInt3620 == 1) {
			return;
		}
		this.method3324();
		this.method3339(false);
		this.method3330(false);
		this.method3357(false);
		this.method3384(false);
		this.method3355(null);
		this.method3331();
		this.method3340(0);
		this.anInt3620 = 1;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(FF)V")
	public void method3382(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat31 = arg0;
		this.aFloat27 = arg1;
		if (!this.aBoolean251) {
			this.method3336();
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4610() {
	}

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "()I")
	@Override
	public int method4569() {
		return this.anInt3631;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II[I[I)Lclient!tm;")
	@Override
	public Class92 method4560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static373.method2756(this, arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!e;IIII)Lclient!bi;")
	@Override
	public Class3 method4652(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class3_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ks", name = "jb", descriptor = "()V")
	private void method3383() {
		this.anOpengl1.glDepthMask(this.aBoolean261 && this.aBoolean264);
	}

	@OriginalMember(owner = "client!ks", name = "v", descriptor = "()Z")
	@Override
	public boolean method4606() {
		return this.aClass1_Sub19_Sub1_1.method5461();
	}

	@OriginalMember(owner = "client!ks", name = "u", descriptor = "()Z")
	@Override
	public boolean method4602() {
		return false;
	}

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "(Z)V")
	public void method3384(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean261) {
			this.aBoolean261 = arg0;
			this.method3383();
			this.anInt3620 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ks", name = "kb", descriptor = "()V")
	private void method3385() {
		if (this.anInt3634 != 3) {
			this.anInt3634 = 3;
			this.method3380();
			this.method3328();
			this.anInt3620 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ks", name = "A", descriptor = "()F")
	@Override
	public float method4621() {
		return this.aFloat32;
	}

	@OriginalMember(owner = "client!ks", name = "q", descriptor = "()I")
	@Override
	public int method4593() {
		return this.anInt3630;
	}

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "()V")
	@Override
	public void method4620() {
		this.method3384(true);
		this.anOpengl1.glClear(256);
	}

	@OriginalMember(owner = "client!ks", name = "t", descriptor = "()I")
	@Override
	public int method4601() {
		@Pc(2) int local2 = this.anInt3638;
		this.anInt3638 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!sd;)V")
	@Override
	public void method4607(@OriginalArg(0) Class13 arg0) {
		this.aClass13_Sub1_1 = (Class13_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIZ)Lclient!ae;")
	@Override
	public Class4 method4612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class4_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ks", name = "lb", descriptor = "()V")
	private void method3386() {
		this.aClass129_Sub2_2 = new Class129_Sub2();
		this.aClass129_Sub2_1 = new Class129_Sub2();
		this.aClass19Array1 = new Class19[this.anInt3605];
		this.aClass19_Sub3_3 = new Class19_Sub3(this, 3553, 6408, 1, 1);
		this.aClass19_Sub3_1 = new Class19_Sub3(this, 3553, 6408, 1, 1);
		this.aClass19_Sub3_2 = new Class19_Sub3(this, 3553, 6408, 1, 1);
		this.aClass3_Sub1_2 = new Class3_Sub1(this);
		this.aClass3_Sub1_8 = new Class3_Sub1(this);
		this.aClass3_Sub1_7 = new Class3_Sub1(this);
		this.aClass3_Sub1_1 = new Class3_Sub1(this);
		this.aClass3_Sub1_3 = new Class3_Sub1(this);
		this.aClass3_Sub1_4 = new Class3_Sub1(this);
		this.aClass3_Sub1_6 = new Class3_Sub1(this);
		this.aClass3_Sub1_5 = new Class3_Sub1(this);
		if (this.aBoolean254) {
			this.aClass197_1 = new Class197(this);
		}
		this.aClass198_1.method5374(this);
	}

	@OriginalMember(owner = "client!ks", name = "L", descriptor = "()Z")
	@Override
	public boolean method4656() {
		return true;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "([IIIII)Lclient!ae;")
	@Override
	public Class4 method4587(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class4_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!pa;Lclient!pa;Lclient!pa;Lclient!pa;)V")
	public void method3387(@OriginalArg(0) Class161 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) Class161 arg2, @OriginalArg(3) Class161 arg3) {
		if (arg0 == null) {
			this.anOpengl1.glDisableClientState(32884);
		} else {
			this.anOpengl1.glEnableClientState(32884);
			arg0.method4367();
		}
		if (arg1 == null) {
			this.anOpengl1.glDisableClientState(32885);
		} else {
			this.anOpengl1.glEnableClientState(32885);
			arg1.method4364();
		}
		if (arg2 == null) {
			this.anOpengl1.glDisableClientState(32886);
		} else {
			this.anOpengl1.glEnableClientState(32886);
			arg2.method4365();
		}
		if (arg3 == null) {
			this.anOpengl1.glDisableClientState(32888);
		} else {
			this.anOpengl1.glEnableClientState(32888);
			arg3.method4366();
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(II)I")
	@Override
	public int method4628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(IIIIII)Z")
	@Override
	public boolean method4605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass129_Sub2_2.aFloat73 * (float) arg0 + this.aClass129_Sub2_2.aFloat75 * (float) arg1 + this.aClass129_Sub2_2.aFloat74 * (float) arg2 + this.aClass129_Sub2_2.aFloat66;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass129_Sub2_2.aFloat73 * (float) arg3 + this.aClass129_Sub2_2.aFloat75 * (float) arg4 + this.aClass129_Sub2_2.aFloat74 * (float) arg5 + this.aClass129_Sub2_2.aFloat66;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt3630 && local55 < (float) this.anInt3630 || !(!(local24 > (float) this.anInt3631) || !(local55 > (float) this.anInt3631))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt3606 * (this.aClass129_Sub2_2.aFloat65 * (float) arg0 + this.aClass129_Sub2_2.aFloat68 * (float) arg1 + this.aClass129_Sub2_2.aFloat70 * (float) arg2 + this.aClass129_Sub2_2.aFloat71) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt3606 * (this.aClass129_Sub2_2.aFloat65 * (float) arg3 + this.aClass129_Sub2_2.aFloat68 * (float) arg4 + this.aClass129_Sub2_2.aFloat70 * (float) arg5 + this.aClass129_Sub2_2.aFloat71) / local55);
		if ((float) local119 < this.aFloat40 && (float) local151 < this.aFloat40 || (float) local119 > this.aFloat47 && (float) local151 > this.aFloat47) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt3621 * (this.aClass129_Sub2_2.aFloat72 * (float) arg0 + this.aClass129_Sub2_2.aFloat67 * (float) arg1 + this.aClass129_Sub2_2.aFloat69 * (float) arg2 + this.aClass129_Sub2_2.aFloat64) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt3621 * (this.aClass129_Sub2_2.aFloat72 * (float) arg3 + this.aClass129_Sub2_2.aFloat67 * (float) arg4 + this.aClass129_Sub2_2.aFloat69 * (float) arg5 + this.aClass129_Sub2_2.aFloat64) / local55);
			return (!((float) local209 < this.aFloat39) || !((float) local241 < this.aFloat39)) && (!((float) local209 > this.aFloat45) || !((float) local241 > this.aFloat45));
		}
	}

	@OriginalMember(owner = "client!ks", name = "mb", descriptor = "()V")
	private void method3388() {
		this.aFloat40 = this.anInt3624 - this.anInt3611;
		this.aFloat47 = this.anInt3633 - this.anInt3611;
		this.aFloat39 = this.anInt3613 - this.anInt3618;
		this.aFloat45 = this.anInt3609 - this.anInt3618;
	}

	@OriginalMember(owner = "client!ks", name = "nb", descriptor = "()V")
	public void method3389() {
		if (this.anInt3620 == 4) {
			return;
		}
		this.method3324();
		this.method3339(false);
		this.method3330(false);
		this.method3357(false);
		this.method3384(false);
		this.method3331();
		this.method3374(1);
		this.method3340(1);
		this.anInt3620 = 4;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIII)Lclient!sd;")
	@Override
	public Class13 method4571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean260 ? new Class13_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ks", name = "K", descriptor = "()Z")
	@Override
	public boolean method4654() {
		return true;
	}

	@OriginalMember(owner = "client!ks", name = "ob", descriptor = "()V")
	private void method3390() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!ks", name = "pb", descriptor = "()V")
	public void method3391() {
		if (this.anInt3634 != 2) {
			this.anInt3634 = 2;
			this.method3359();
			this.method3328();
			this.anInt3620 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "(IIIIII)V")
	@Override
	public void method4653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method3381();
		this.method3374(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean249) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local19);
		this.anOpengl1.glVertex2f(local14, local19);
		this.anOpengl1.glVertex2f(local14, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean249) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!tr;Z)Lclient!ae;")
	@Override
	public Class4 method4589(@OriginalArg(0) Class201 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt6040 * arg0.anInt6042];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray87 == null) {
			for (local15 = 0; local15 < arg0.anInt6042; local15++) {
				for (local21 = 0; local21 < arg0.anInt6040; local21++) {
					@Pc(74) int local74 = arg0.anIntArray471[arg0.aByteArray88[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt6042; local15++) {
				for (local21 = 0; local21 < arg0.anInt6040; local21++) {
					local6[local10++] = arg0.aByteArray87[local8] << 24 | arg0.anIntArray471[arg0.aByteArray88[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class4 local100 = this.method4587(local6, arg0.anInt6040, arg0.anInt6040, arg0.anInt6042);
		local100.method5965(arg0.anInt6039, arg0.anInt6043, arg0.anInt6044, arg0.anInt6041);
		return local100;
	}

	@OriginalMember(owner = "client!ks", name = "i", descriptor = "(II)V")
	public synchronized void method3392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub9 local4 = new Class1_Sub9(arg1);
		local4.aLong217 = arg0;
		this.aClass42_24.method1549(local4);
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "()V")
	@Override
	public void method4556() {
		if (this.anInt3598 <= 0 && this.anInt3600 <= 0) {
			return;
		}
		@Pc(9) int local9 = this.anInt3624;
		@Pc(12) int local12 = this.anInt3633;
		@Pc(15) int local15 = this.anInt3613;
		@Pc(18) int local18 = this.anInt3609;
		this.method4651();
		this.anOpengl1.glReadBuffer(1028);
		this.anOpengl1.glDrawBuffer(1029);
		this.method3365();
		this.method3339(false);
		this.method3330(false);
		this.method3357(false);
		this.method3384(false);
		this.method3355(null);
		this.method3331();
		this.method3340(0);
		this.method3374(0);
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRasterPos2i(0, 0);
		this.anOpengl1.glCopyPixels(0, 0, this.anInt3598, this.anInt3600, 6144);
		this.anOpengl1.glFlush();
		this.anOpengl1.glReadBuffer(1029);
		this.anOpengl1.glDrawBuffer(1029);
		this.method4566(local9, local15, local12, local18);
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(II)V")
	@Override
	public void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3616 == arg0 && this.anInt3607 == arg1) {
			return;
		}
		this.anInt3616 = arg0;
		this.anInt3607 = arg1;
		if (!this.aBoolean251) {
			this.method3336();
			this.method3354();
		}
	}

	@OriginalMember(owner = "client!ks", name = "qb", descriptor = "()V")
	private void method3393() {
		if (this.aBoolean267 && !this.aBoolean253) {
			this.anOpengl1.glEnable(2896);
		} else {
			this.anOpengl1.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ks", name = "rb", descriptor = "()V")
	public void method3394() {
		if (this.anInt3620 == 16) {
			return;
		}
		this.method3385();
		this.method3339(true);
		this.method3357(true);
		this.method3384(true);
		this.method3374(1);
		this.method3340(1);
		this.anInt3620 = 16;
	}

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "()I")
	@Override
	public int method4592() {
		return 4;
	}

	@OriginalMember(owner = "client!ks", name = "G", descriptor = "()V")
	@Override
	public void method4647() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZ)V")
	public void method3395(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3378(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!mk;)V")
	@Override
	public void method4616(@OriginalArg(0) Class1_Sub30 arg0) {
	}

	@OriginalMember(owner = "client!ks", name = "x", descriptor = "()V")
	@Override
	protected void method4613() {
		if (this.anOpengl1 != null) {
			try {
				this.aClass154_1.method4167();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl1 = null;
		}
		if (this.aContext1 != null) {
			this.method3390();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean248) {
			Static287.method5072(true);
			this.aBoolean248 = false;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)I")
	@Override
	public int method4574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ks", name = "r", descriptor = "(I)I")
	public int method3396(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "()Z")
	@Override
	public boolean method4578() {
		return true;
	}

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method4633(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class1_Sub9 local16;
		while (!this.aClass42_24.method1538()) {
			local16 = (Class1_Sub9) this.aClass42_24.method1541();
			Static173.anIntArray266[local1++] = (int) local16.aLong217;
			this.anInt3597 -= local16.anInt571;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteBuffersARB(local1, Static173.anIntArray266, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteBuffersARB(local1, Static173.anIntArray266, 0);
			local1 = 0;
		}
		while (!this.aClass42_25.method1538()) {
			local16 = (Class1_Sub9) this.aClass42_25.method1541();
			Static173.anIntArray266[local1++] = (int) local16.aLong217;
			this.anInt3595 -= local16.anInt571;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteTextures(local1, Static173.anIntArray266, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteTextures(local1, Static173.anIntArray266, 0);
			local1 = 0;
		}
		while (!this.aClass42_26.method1538()) {
			local16 = (Class1_Sub9) this.aClass42_26.method1541();
			Static173.anIntArray266[local1++] = local16.anInt571;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteFramebuffersEXT(local1, Static173.anIntArray266, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteFramebuffersEXT(local1, Static173.anIntArray266, 0);
			local1 = 0;
		}
		while (!this.aClass42_27.method1538()) {
			local16 = (Class1_Sub9) this.aClass42_27.method1541();
			Static173.anIntArray266[local1++] = (int) local16.aLong217;
			this.anInt3596 -= local16.anInt571;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static173.anIntArray266, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static173.anIntArray266, 0);
			local1 = 0;
		}
		while (!this.aClass42_28.method1538()) {
			local16 = (Class1_Sub9) this.aClass42_28.method1541();
			Static173.anIntArray266[local1++] = (int) local16.aLong217;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteProgramsARB(local1, Static173.anIntArray266, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteProgramsARB(local1, Static173.anIntArray266, 0);
		}
		while (!this.aClass42_23.method1538()) {
			local16 = (Class1_Sub9) this.aClass42_23.method1541();
			this.anOpengl1.glDeleteLists((int) local16.aLong217, local16.anInt571);
		}
		while (!this.aClass42_29.method1538()) {
			local16 = (Class1_Sub9) this.aClass42_29.method1541();
			this.anOpengl1.glDeleteObjectARB(local16.anInt571);
		}
		while (!this.aClass42_23.method1538()) {
			local16 = (Class1_Sub9) this.aClass42_23.method1541();
			this.anOpengl1.glDeleteLists((int) local16.aLong217, local16.anInt571);
		}
		if (this.method4642() > 100663296 && Static183.method3462() > this.aLong130 + 60000L) {
			System.gc();
			this.aLong130 = Static183.method3462();
		}
		this.anInt3603 = local5;
	}
}
