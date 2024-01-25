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

@OriginalClass("client!mm")
public final class Class55_Sub1 extends Class55 implements Interface9 {

	@OriginalMember(owner = "client!mm", name = "G", descriptor = "I")
	public int anInt3992;

	@OriginalMember(owner = "client!mm", name = "J", descriptor = "I")
	private int anInt3994;

	@OriginalMember(owner = "client!mm", name = "L", descriptor = "Lclient!sj;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
	public int anInt3996;

	@OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
	public int anInt3997;

	@OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
	public int anInt3998;

	@OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
	public int anInt3999;

	@OriginalMember(owner = "client!mm", name = "Y", descriptor = "I")
	private int anInt4000;

	@OriginalMember(owner = "client!mm", name = "ab", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!mm", name = "cb", descriptor = "Z")
	public boolean aBoolean308;

	@OriginalMember(owner = "client!mm", name = "db", descriptor = "I")
	private int anInt4002;

	@OriginalMember(owner = "client!mm", name = "eb", descriptor = "F")
	private float aFloat35;

	@OriginalMember(owner = "client!mm", name = "fb", descriptor = "Lclient!kf;")
	public Class112_Sub1 aClass112_Sub1_1;

	@OriginalMember(owner = "client!mm", name = "ib", descriptor = "F")
	private float aFloat36;

	@OriginalMember(owner = "client!mm", name = "nb", descriptor = "Z")
	private boolean aBoolean311;

	@OriginalMember(owner = "client!mm", name = "pb", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!mm", name = "qb", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!mm", name = "rb", descriptor = "I")
	private int anInt4004;

	@OriginalMember(owner = "client!mm", name = "sb", descriptor = "I")
	public int anInt4005;

	@OriginalMember(owner = "client!mm", name = "tb", descriptor = "I")
	public int anInt4006;

	@OriginalMember(owner = "client!mm", name = "ub", descriptor = "Lclient!kf;")
	public Class112_Sub1 aClass112_Sub1_2;

	@OriginalMember(owner = "client!mm", name = "vb", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!mm", name = "xb", descriptor = "I")
	private int anInt4008;

	@OriginalMember(owner = "client!mm", name = "yb", descriptor = "Z")
	public boolean aBoolean313;

	@OriginalMember(owner = "client!mm", name = "Ab", descriptor = "I")
	private int anInt4009;

	@OriginalMember(owner = "client!mm", name = "Bb", descriptor = "Z")
	private boolean aBoolean314;

	@OriginalMember(owner = "client!mm", name = "Eb", descriptor = "Z")
	private boolean aBoolean316;

	@OriginalMember(owner = "client!mm", name = "Fb", descriptor = "I")
	private int anInt4010;

	@OriginalMember(owner = "client!mm", name = "Gb", descriptor = "[Lclient!t;")
	private Class60[] aClass60Array1;

	@OriginalMember(owner = "client!mm", name = "Hb", descriptor = "Z")
	private boolean aBoolean317;

	@OriginalMember(owner = "client!mm", name = "Pb", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!mm", name = "Rb", descriptor = "Z")
	public boolean aBoolean318;

	@OriginalMember(owner = "client!mm", name = "Ub", descriptor = "Lclient!kf;")
	public Class112_Sub1 aClass112_Sub1_3;

	@OriginalMember(owner = "client!mm", name = "Vb", descriptor = "Lclient!vj;")
	private Class60_Sub4_Sub1 aClass60_Sub4_Sub1_2;

	@OriginalMember(owner = "client!mm", name = "Wb", descriptor = "Lclient!ke;")
	private Class54_Sub1 aClass54_Sub1_1;

	@OriginalMember(owner = "client!mm", name = "Zb", descriptor = "Z")
	private boolean aBoolean319;

	@OriginalMember(owner = "client!mm", name = "ac", descriptor = "Z")
	public boolean aBoolean320;

	@OriginalMember(owner = "client!mm", name = "bc", descriptor = "Lclient!hn;")
	public Class60_Sub4 aClass60_Sub4_4;

	@OriginalMember(owner = "client!mm", name = "ec", descriptor = "Z")
	private boolean aBoolean321;

	@OriginalMember(owner = "client!mm", name = "ic", descriptor = "I")
	public int anInt4023;

	@OriginalMember(owner = "client!mm", name = "jc", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!mm", name = "kc", descriptor = "J")
	private long aLong141;

	@OriginalMember(owner = "client!mm", name = "lc", descriptor = "Z")
	private boolean aBoolean323;

	@OriginalMember(owner = "client!mm", name = "mc", descriptor = "Lclient!hn;")
	public Class60_Sub4 aClass60_Sub4_5;

	@OriginalMember(owner = "client!mm", name = "nc", descriptor = "Z")
	private boolean aBoolean324;

	@OriginalMember(owner = "client!mm", name = "pc", descriptor = "I")
	private int anInt4024;

	@OriginalMember(owner = "client!mm", name = "sc", descriptor = "Lclient!kf;")
	public Class112_Sub1 aClass112_Sub1_4;

	@OriginalMember(owner = "client!mm", name = "uc", descriptor = "Lclient!dc;")
	private Interface1 anInterface1_3;

	@OriginalMember(owner = "client!mm", name = "vc", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!mm", name = "wc", descriptor = "Z")
	public boolean aBoolean326;

	@OriginalMember(owner = "client!mm", name = "xc", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!mm", name = "yc", descriptor = "I")
	private int anInt4027;

	@OriginalMember(owner = "client!mm", name = "zc", descriptor = "Z")
	private boolean aBoolean327;

	@OriginalMember(owner = "client!mm", name = "Ac", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!mm", name = "Cc", descriptor = "I")
	private int anInt4029;

	@OriginalMember(owner = "client!mm", name = "Ec", descriptor = "Z")
	private boolean aBoolean329;

	@OriginalMember(owner = "client!mm", name = "Gc", descriptor = "Lclient!kf;")
	public Class112_Sub1 aClass112_Sub1_5;

	@OriginalMember(owner = "client!mm", name = "Ic", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!mm", name = "Lc", descriptor = "Lclient!vh;")
	public Class66_Sub2 aClass66_Sub2_1;

	@OriginalMember(owner = "client!mm", name = "Mc", descriptor = "Lclient!q;")
	private Interface8 anInterface8_3;

	@OriginalMember(owner = "client!mm", name = "Nc", descriptor = "Lclient!vh;")
	public Class66_Sub2 aClass66_Sub2_2;

	@OriginalMember(owner = "client!mm", name = "Pc", descriptor = "F")
	private float aFloat54;

	@OriginalMember(owner = "client!mm", name = "Qc", descriptor = "Z")
	public boolean aBoolean330;

	@OriginalMember(owner = "client!mm", name = "Sc", descriptor = "Lclient!qd;")
	public Class167 aClass167_4;

	@OriginalMember(owner = "client!mm", name = "Tc", descriptor = "Lclient!kf;")
	public Class112_Sub1 aClass112_Sub1_6;

	@OriginalMember(owner = "client!mm", name = "Vc", descriptor = "Lclient!hn;")
	public Class60_Sub4 aClass60_Sub4_6;

	@OriginalMember(owner = "client!mm", name = "Wc", descriptor = "I")
	private int anInt4033;

	@OriginalMember(owner = "client!mm", name = "Xc", descriptor = "I")
	private int anInt4034;

	@OriginalMember(owner = "client!mm", name = "y", descriptor = "Lclient!s;")
	private final Class182 aClass182_1 = new Class182();

	@OriginalMember(owner = "client!mm", name = "E", descriptor = "Lclient!ve;")
	private final Class66 aClass66_2 = new Class66_Sub2();

	@OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
	private int anInt3993 = -1;

	@OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
	public final int anInt3991 = 3;

	@OriginalMember(owner = "client!mm", name = "K", descriptor = "I")
	public final int anInt3995 = 8;

	@OriginalMember(owner = "client!mm", name = "P", descriptor = "[Lclient!sj;")
	private final Interface9[] anInterface9Array1 = new Interface9[4];

	@OriginalMember(owner = "client!mm", name = "R", descriptor = "Z")
	private boolean aBoolean307 = false;

	@OriginalMember(owner = "client!mm", name = "H", descriptor = "Lclient!jm;")
	private final Class103 aClass103_92 = new Class103();

	@OriginalMember(owner = "client!mm", name = "S", descriptor = "Lclient!jm;")
	private final Class103 aClass103_93 = new Class103();

	@OriginalMember(owner = "client!mm", name = "T", descriptor = "Lclient!jm;")
	private final Class103 aClass103_94 = new Class103();

	@OriginalMember(owner = "client!mm", name = "U", descriptor = "Lclient!jm;")
	private final Class103 aClass103_95 = new Class103();

	@OriginalMember(owner = "client!mm", name = "V", descriptor = "Lclient!jm;")
	private final Class103 aClass103_96 = new Class103();

	@OriginalMember(owner = "client!mm", name = "W", descriptor = "Lclient!jm;")
	private final Class103 aClass103_97 = new Class103();

	@OriginalMember(owner = "client!mm", name = "X", descriptor = "Lclient!jm;")
	private final Class103 aClass103_98 = new Class103();

	@OriginalMember(owner = "client!mm", name = "lb", descriptor = "F")
	public float lb = 1.0F;

	@OriginalMember(owner = "client!mm", name = "jb", descriptor = "F")
	public float aFloat37 = 3584.0F;

	@OriginalMember(owner = "client!mm", name = "Cb", descriptor = "F")
	private float aFloat43 = 0.0F;

	@OriginalMember(owner = "client!mm", name = "ob", descriptor = "Z")
	private boolean aBoolean312 = true;

	@OriginalMember(owner = "client!mm", name = "Lb", descriptor = "I")
	private int anInt4014 = 0;

	@OriginalMember(owner = "client!mm", name = "Kb", descriptor = "I")
	public int anInt4013 = -1;

	@OriginalMember(owner = "client!mm", name = "Ib", descriptor = "I")
	private int anInt4011 = 0;

	@OriginalMember(owner = "client!mm", name = "bb", descriptor = "[F")
	public final float[] aFloatArray12 = new float[4];

	@OriginalMember(owner = "client!mm", name = "hb", descriptor = "I")
	private int anInt4003 = 0;

	@OriginalMember(owner = "client!mm", name = "wb", descriptor = "I")
	public int anInt4007 = 512;

	@OriginalMember(owner = "client!mm", name = "Sb", descriptor = "F")
	private float aFloat45 = 1.0F;

	@OriginalMember(owner = "client!mm", name = "Nb", descriptor = "I")
	private int anInt4016 = 8448;

	@OriginalMember(owner = "client!mm", name = "Xb", descriptor = "I")
	private int anInt4019 = -1;

	@OriginalMember(owner = "client!mm", name = "Qb", descriptor = "I")
	private int anInt4018 = 0;

	@OriginalMember(owner = "client!mm", name = "Yb", descriptor = "[F")
	private final float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!mm", name = "cc", descriptor = "I")
	private int anInt4020 = 0;

	@OriginalMember(owner = "client!mm", name = "Ob", descriptor = "I")
	private int anInt4017 = 0;

	@OriginalMember(owner = "client!mm", name = "Mb", descriptor = "I")
	public int anInt4015 = 0;

	@OriginalMember(owner = "client!mm", name = "mb", descriptor = "F")
	private float aFloat38 = 1.0F;

	@OriginalMember(owner = "client!mm", name = "zb", descriptor = "F")
	public float aFloat42 = -1.0F;

	@OriginalMember(owner = "client!mm", name = "Tb", descriptor = "[F")
	private final float[] aFloatArray13 = new float[4];

	@OriginalMember(owner = "client!mm", name = "fc", descriptor = "I")
	private int anInt4022 = 8448;

	@OriginalMember(owner = "client!mm", name = "hc", descriptor = "F")
	public float aFloat46 = 1.0F;

	@OriginalMember(owner = "client!mm", name = "dc", descriptor = "I")
	private int anInt4021 = 0;

	@OriginalMember(owner = "client!mm", name = "Jc", descriptor = "F")
	public float aFloat53 = 1.0F;

	@OriginalMember(owner = "client!mm", name = "Hc", descriptor = "F")
	public float aFloat52 = 3584.0F;

	@OriginalMember(owner = "client!mm", name = "rc", descriptor = "I")
	public int anInt4025 = -1;

	@OriginalMember(owner = "client!mm", name = "Fc", descriptor = "F")
	public float aFloat51 = -1.0F;

	@OriginalMember(owner = "client!mm", name = "Z", descriptor = "I")
	public int anInt4001 = 50;

	@OriginalMember(owner = "client!mm", name = "tc", descriptor = "I")
	public int anInt4026 = 0;

	@OriginalMember(owner = "client!mm", name = "Rc", descriptor = "I")
	private int anInt4031 = -1;

	@OriginalMember(owner = "client!mm", name = "Bc", descriptor = "I")
	public int anInt4028 = 3584;

	@OriginalMember(owner = "client!mm", name = "oc", descriptor = "[F")
	private final float[] aFloatArray15 = new float[16];

	@OriginalMember(owner = "client!mm", name = "Kc", descriptor = "I")
	public int anInt4030 = -1;

	@OriginalMember(owner = "client!mm", name = "Uc", descriptor = "I")
	public int anInt4032 = 512;

	@OriginalMember(owner = "client!mm", name = "Oc", descriptor = "[F")
	private final float[] aFloatArray16 = new float[4];

	@OriginalMember(owner = "client!mm", name = "B", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas4;

	@OriginalMember(owner = "client!mm", name = "w", descriptor = "Lclient!gf;")
	public final Interface3 anInterface3_4;

	@OriginalMember(owner = "client!mm", name = "u", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!mm", name = "t", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl1;

	@OriginalMember(owner = "client!mm", name = "Jb", descriptor = "I")
	public final int anInt4012;

	@OriginalMember(owner = "client!mm", name = "gc", descriptor = "Z")
	private boolean aBoolean322;

	@OriginalMember(owner = "client!mm", name = "qc", descriptor = "Z")
	public boolean aBoolean325;

	@OriginalMember(owner = "client!mm", name = "Dc", descriptor = "Z")
	public boolean aBoolean328;

	@OriginalMember(owner = "client!mm", name = "Db", descriptor = "Z")
	public boolean aBoolean315;

	@OriginalMember(owner = "client!mm", name = "kb", descriptor = "Z")
	private boolean aBoolean310;

	@OriginalMember(owner = "client!mm", name = "gb", descriptor = "Z")
	public boolean aBoolean309;

	@OriginalMember(owner = "client!mm", name = "D", descriptor = "Lclient!kq;")
	public final Class117 aClass117_1;

	@OriginalMember(owner = "client!mm", name = "z", descriptor = "Lclient!ba;")
	private final Class15 aClass15_1;

	@OriginalMember(owner = "client!mm", name = "A", descriptor = "Lclient!kc;")
	private final Class111 aClass111_1;

	@OriginalMember(owner = "client!mm", name = "v", descriptor = "Lclient!am;")
	private final Class5_Sub5_Sub1 aClass5_Sub5_Sub1_1;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!gf;IILclient!ne;)V")
	public Class55_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class139 arg4) {
		this.aCanvas4 = arg0;
		this.anInterface3_4 = arg1;
		this.anInt5811 = arg2;
		@Pc(186) int local186 = 0;
		while (!this.aCanvas4.isShowing()) {
			if (local186++ > 5) {
				throw new RuntimeException("");
			}
			Static20.method408(1000L);
		}
		this.aCanvas4.setIgnoreRepaint(true);
		try {
			if (Static201.aBoolean306 == null || !Static201.aBoolean306) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static201.aBoolean306 = Boolean.TRUE;
				} else {
					@Pc(220) Class16 local220 = arg4.method3873(this.getClass());
					while (local220.anInt381 == 0) {
						Static20.method408(100L);
					}
					if (local220.anInt381 == 1) {
						Static201.aBoolean306 = Boolean.TRUE;
					}
				}
			}
			if (Static201.aBoolean306 == null || !Static201.aBoolean306) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas4, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method3691();
				this.anOpengl1 = this.aContext1.getGL();
				@Pc(287) int local287 = this.method3662();
				if (local287 != 0) {
					throw new RuntimeException("");
				}
				this.anInt4012 = this.aBoolean308 ? 33639 : 5121;
				@Pc(306) String local306 = this.aString28.toLowerCase();
				@Pc(310) String local310 = this.aString29.toLowerCase();
				if (local310.indexOf("radeon") != -1) {
					@Pc(317) int local317 = 0;
					@Pc(319) boolean local319 = false;
					@Pc(321) boolean local321 = false;
					@Pc(329) String[] local329 = Static172.method4047(local310.replace('/', ' '), ' ');
					for (@Pc(331) int local331 = 0; local331 < local329.length; local331++) {
						@Pc(339) String local339 = local329[local331];
						try {
							if (local339.length() > 0) {
								if (local339.charAt(0) == 'x' && local339.length() >= 3 && Static38.method598(local339.substring(1, 3))) {
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
									if (local339.length() >= 4 && Static38.method598(local339.substring(0, 4))) {
										local317 = Static36.method580(local339.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(403) Exception local403) {
						}
					}
					if (!local321 && !local319) {
						if (local317 >= 7000 && local317 <= 7999) {
							this.aBoolean322 = false;
						}
						if (local317 >= 7000 && local317 <= 9250) {
							this.aBoolean325 = false;
						}
					}
					if (!local319 || local317 < 4000) {
						this.aBoolean328 = false;
					}
					this.aBoolean315 &= this.anOpengl1.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean310 = this.aBoolean322;
				}
				if (local306.contains("intel")) {
					this.aBoolean309 = false;
				}
				if (this.aBoolean322) {
					try {
						@Pc(461) int[] local461 = new int[1];
						this.anOpengl1.glGenBuffersARB(1, local461, 0);
					} catch (@Pc(469) Throwable local469) {
						throw new RuntimeException("", local469);
					}
				}
				this.method3685(this);
				this.method5171();
				this.method3639();
				new Class211(this);
				this.aClass117_1 = new Class117(this, this.anInterface3_4);
				Static55.method4832(true);
				this.aBoolean307 = true;
				this.aClass15_1 = new Class15(this);
				this.aClass111_1 = new Class111(this);
				this.aClass5_Sub5_Sub1_1 = new Class5_Sub5_Sub1(this);
				this.method3679();
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
						Static20.method408(100L);
					}
				}
				this.anOpengl1.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(553) Throwable local553) {
			local553.printStackTrace();
			this.method5197();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local553);
		}
	}

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "(Z)V")
	public void method3637(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean319) {
			this.aBoolean319 = arg0;
			this.method3686();
		}
	}

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "(Z)V")
	public void method3638(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean323) {
			this.aBoolean323 = arg0;
			this.method3658();
			this.anInt4024 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!mm", name = "M", descriptor = "()V")
	private void method3639() {
		this.aClass66_Sub2_2 = new Class66_Sub2();
		this.aClass66_Sub2_1 = new Class66_Sub2();
		this.aClass60Array1 = new Class60[this.anInt4005];
		this.aClass60_Sub4_4 = new Class60_Sub4(this, 3553, 6408, 1, 1);
		this.aClass60_Sub4_5 = new Class60_Sub4(this, 3553, 6408, 1, 1);
		this.aClass60_Sub4_6 = new Class60_Sub4(this, 3553, 6408, 1, 1);
		this.aClass112_Sub1_5 = new Class112_Sub1(this);
		this.aClass112_Sub1_6 = new Class112_Sub1(this);
		this.aClass112_Sub1_3 = new Class112_Sub1(this);
		this.aClass112_Sub1_4 = new Class112_Sub1(this);
		this.aClass112_Sub1_1 = new Class112_Sub1(this);
		this.aClass112_Sub1_2 = new Class112_Sub1(this);
		if (this.aBoolean309) {
			this.aClass167_4 = new Class167(this);
		}
		this.aClass182_1.method4969(this);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!vl;Lclient!vl;Lclient!vl;Lclient!vl;)V")
	public void method3640(@OriginalArg(0) Class203 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) Class203 arg3) {
		if (arg0 == null) {
			this.anOpengl1.glDisableClientState(32884);
		} else {
			this.anOpengl1.glEnableClientState(32884);
			arg0.method5860();
		}
		if (arg1 == null) {
			this.anOpengl1.glDisableClientState(32885);
		} else {
			this.anOpengl1.glEnableClientState(32885);
			arg1.method5862();
		}
		if (arg2 == null) {
			this.anOpengl1.glDisableClientState(32886);
		} else {
			this.anOpengl1.glEnableClientState(32886);
			arg2.method5859();
		}
		if (arg3 == null) {
			this.anOpengl1.glDisableClientState(32888);
		} else {
			this.anOpengl1.glEnableClientState(32888);
			arg3.method5861();
		}
	}

	@OriginalMember(owner = "client!mm", name = "K", descriptor = "()Z")
	@Override
	public boolean method5250() {
		return this.aBoolean317;
	}

	@OriginalMember(owner = "client!mm", name = "J", descriptor = "()Z")
	@Override
	public boolean method5247() {
		return this.aClass5_Sub5_Sub1_1.method238();
	}

	@OriginalMember(owner = "client!mm", name = "r", descriptor = "()Lclient!ve;")
	@Override
	public Class66 method5195() {
		return this.aClass66_2;
	}

	@OriginalMember(owner = "client!mm", name = "I", descriptor = "()I")
	@Override
	public int method5242() {
		@Pc(2) int local2 = this.anInt4033;
		this.anInt4033 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!ts;Lclient!ns;Lclient!ve;Lclient!uh;I)V")
	@Override
	public void method5241(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) Class32_Sub8 arg3) {
		arg0.method4338(arg2, arg3, 0);
		this.method5189(arg1);
	}

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "(I)V")
	public synchronized void method3641(@OriginalArg(0) int arg0) {
		@Pc(4) Class5_Sub15 local4 = new Class5_Sub15(arg0);
		this.aClass103_95.method2745(local4);
	}

	@OriginalMember(owner = "client!mm", name = "N", descriptor = "()V")
	private void method3642() {
		@Pc(2) float[] local2 = this.aFloatArray15;
		@Pc(14) float local14 = (float) (-this.anInt4026 * this.anInt4001) / (float) this.anInt4007;
		@Pc(28) float local28 = (float) ((this.anInt3996 - this.anInt4026) * this.anInt4001) / (float) this.anInt4007;
		@Pc(39) float local39 = (float) (this.anInt4015 * this.anInt4001) / (float) this.anInt4032;
		@Pc(53) float local53 = (float) ((this.anInt4015 - this.anInt3997) * this.anInt4001) / (float) this.anInt4032;
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
			@Pc(67) float local67 = (float) this.anInt4001 * 2.0F;
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
			local2[10] = this.aFloat36 = (float) -(this.anInt4028 + this.anInt4001) / (float) (this.anInt4028 - this.anInt4001);
			local2[11] = -1.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = this.aFloat54 = -(local67 * (float) this.anInt4028) / (float) (this.anInt4028 - this.anInt4001);
			local2[15] = 0.0F;
		}
		this.method3672();
	}

	@OriginalMember(owner = "client!mm", name = "O", descriptor = "()Lclient!fq;")
	public Class60_Sub2 method3643() {
		return this.aClass54_Sub1_1 == null ? null : this.aClass54_Sub1_1.method2238();
	}

	@OriginalMember(owner = "client!mm", name = "P", descriptor = "()V")
	private void method3644() {
		Static201.aFloatArray11[0] = this.aFloat42 * this.aFloat46;
		Static201.aFloatArray11[1] = this.aFloat42 * this.aFloat53;
		Static201.aFloatArray11[2] = this.aFloat42 * this.lb;
		Static201.aFloatArray11[3] = 1.0F;
		this.anOpengl1.glLightfv(16384, 4609, Static201.aFloatArray11, 0);
		Static201.aFloatArray11[0] = -this.aFloat51 * this.aFloat46;
		Static201.aFloatArray11[1] = -this.aFloat51 * this.aFloat53;
		Static201.aFloatArray11[2] = -this.aFloat51 * this.lb;
		Static201.aFloatArray11[3] = 1.0F;
		this.anOpengl1.glLightfv(16385, 4609, Static201.aFloatArray11, 0);
	}

	@OriginalMember(owner = "client!mm", name = "Q", descriptor = "()V")
	private void method3645() {
		@Pc(15) int local15;
		if (this.aBoolean320) {
			this.anOpengl1.glFogf(2915, 0.0F);
			this.anOpengl1.glFogf(2916, 1.0F);
			local15 = this.anInt4019;
		} else {
			this.aFloat35 = (float) (this.anInt4028 - 256) - this.aFloat43;
			this.aFloat49 = this.aFloat35 - (float) this.anInt4030 * this.aFloat45;
			if (this.aFloat49 < (float) this.anInt4001) {
				this.aFloat49 = this.anInt4001;
			}
			this.anOpengl1.glFogf(2915, this.aFloat49);
			this.anOpengl1.glFogf(2916, this.aFloat35);
			local15 = this.anInt4013;
		}
		Static201.aFloatArray11[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static201.aFloatArray11[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static201.aFloatArray11[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl1.glFogfv(2918, Static201.aFloatArray11, 0);
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4011 < arg0) {
			this.anInt4011 = arg0;
		}
		if (this.anInt4017 > arg2) {
			this.anInt4017 = arg2;
		}
		if (this.anInt4003 < arg1) {
			this.anInt4003 = arg1;
		}
		if (this.anInt4014 > arg3) {
			this.anInt4014 = arg3;
		}
		this.anOpengl1.glEnable(3089);
		this.method3696();
		this.method3657();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass66_Sub2_2.aFloat66 * (float) arg0 + this.aClass66_Sub2_2.aFloat74 * (float) arg1 + this.aClass66_Sub2_2.aFloat72 * (float) arg2 + this.aClass66_Sub2_2.aFloat73;
		if (local24 < (float) this.anInt4001 || local24 > (float) this.anInt4028) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt4007 * (this.aClass66_Sub2_2.aFloat71 * (float) arg0 + this.aClass66_Sub2_2.aFloat69 * (float) arg1 + this.aClass66_Sub2_2.aFloat77 * (float) arg2 + this.aClass66_Sub2_2.aFloat68) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt4032 * (this.aClass66_Sub2_2.aFloat70 * (float) arg0 + this.aClass66_Sub2_2.aFloat75 * (float) arg1 + this.aClass66_Sub2_2.aFloat67 * (float) arg2 + this.aClass66_Sub2_2.aFloat76) / local24);
		if ((float) local81 >= this.aFloat44 && (float) local81 <= this.aFloat40 && (float) local113 >= this.aFloat47 && (float) local113 <= this.aFloat39) {
			arg3[0] = (int) ((float) local81 - this.aFloat44);
			arg3[1] = (int) ((float) local113 - this.aFloat47);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(III)V")
	@Override
	public void method5234() {
		this.aBoolean320 = true;
		this.anInt4019 = 1583160;
		this.anInt4025 = 40;
		this.method3645();
		this.method3658();
		this.aClass15_1.method339(false, false, 3);
		this.aClass15_1.method342(true, -1);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl1.glLineWidth((float) arg5);
		this.method5216(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!mm", name = "R", descriptor = "()V")
	private void method3646() {
		if (this.anInt4024 == 1) {
			return;
		}
		this.method3651();
		this.method3638(false);
		this.method3695(false);
		this.method3701(false);
		this.method3671(false);
		this.method3677(null);
		this.method3666();
		this.method3655(0);
		this.anInt4024 = 1;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!q;")
	public Interface8 method3647(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface8) (this.aBoolean322 ? new Class48_Sub1(this, arg0, arg1, false) : new Class12_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(FF)V")
	public void method3648(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat45 = arg0;
		this.aFloat43 = arg1;
		if (!this.aBoolean320) {
			this.method3645();
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method3646();
		this.method3692(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean317) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local23);
		this.anOpengl1.glVertex2f(local16, local23);
		this.anOpengl1.glVertex2f(local16, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean317) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5253(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5174(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method5159();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(F)V")
	@Override
	public void method5223(@OriginalArg(0) float arg0) {
		if (this.aFloat48 != arg0) {
			this.aFloat48 = arg0;
			this.method3659();
		}
	}

	@OriginalMember(owner = "client!mm", name = "C", descriptor = "()V")
	@Override
	public void method5220() {
		this.aClass111_1.method2880();
	}

	@OriginalMember(owner = "client!mm", name = "S", descriptor = "()V")
	public void method3649() {
		this.anOpengl1.glLightfv(16384, 4611, this.aFloatArray12, 0);
		this.anOpengl1.glLightfv(16385, 4611, this.aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!mm", name = "T", descriptor = "()V")
	public void method3650() {
		if (this.anInt4002 != 2) {
			this.anInt4002 = 2;
			this.method3697();
			this.method3703();
			this.anInt4024 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "()Z")
	@Override
	public boolean method5166() {
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "([Lclient!ts;Lclient!ve;[Lclient!uh;I)V")
	@Override
	public void method5244(@OriginalArg(0) Class112[] arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) Class32_Sub8[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method4338(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "L", descriptor = "()V")
	@Override
	public void method5256() {
		this.method3671(true);
		this.anOpengl1.glClear(256);
	}

	@OriginalMember(owner = "client!mm", name = "U", descriptor = "()V")
	private void method3651() {
		if (this.anInt4002 == 1) {
			return;
		}
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (this.anInt3996 > 0 && this.anInt3997 > 0) {
			this.anOpengl1.glOrtho(0.0D, (double) this.anInt3996, (double) this.anInt3997, 0.0D, -1.0D, 1.0D);
		}
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anInt4002 = 1;
		this.anInt4024 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method5221(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt4031 != arg0;
		if (local7 || this.aFloat42 != arg1 || this.aFloat51 != arg2) {
			this.anInt4031 = arg0;
			this.aFloat42 = arg1;
			this.aFloat51 = arg2;
			if (local7) {
				this.aFloat46 = (float) (this.anInt4031 & 0xFF0000) / 1.671168E7F;
				this.aFloat53 = (float) (this.anInt4031 & 0xFFFF) / 65535.0F;
				this.lb = (float) (this.anInt4031 & 0xFF) / 255.0F;
				this.method3659();
			}
			this.method3644();
		}
		if (this.aFloatArray16[0] == arg3 && this.aFloatArray16[1] == arg4 && this.aFloatArray16[2] == arg5) {
			return;
		}
		this.aFloatArray16[0] = arg3;
		this.aFloatArray16[1] = arg4;
		this.aFloatArray16[2] = arg5;
		this.aFloatArray13[0] = -arg3;
		this.aFloatArray13[1] = -arg4;
		this.aFloatArray13[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray12[0] = arg3 * local132;
		this.aFloatArray12[1] = arg4 * local132;
		this.aFloatArray12[2] = arg5 * local132;
		this.aFloatArray14[0] = -this.aFloatArray12[0];
		this.aFloatArray14[1] = -this.aFloatArray12[1];
		this.aFloatArray14[2] = -this.aFloatArray12[2];
		this.method3649();
		this.anInt4023 = (int) (arg3 * 256.0F / arg4);
		this.anInt4006 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!lf;)V")
	@Override
	public void method5227(@OriginalArg(0) Class5_Sub23 arg0) {
	}

	@OriginalMember(owner = "client!mm", name = "s", descriptor = "()I")
	@Override
	public int method5196() {
		return this.anInt3992 + this.anInt3998 + this.anInt3994;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!de;II)V")
	@Override
	public void method5185(@OriginalArg(1) Class46 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class46_Sub2 local2 = (Class46_Sub2) arg0;
		@Pc(5) Class60_Sub4_Sub1 local5 = local2.aClass60_Sub4_Sub1_5;
		this.method3670();
		this.method3677(local2.aClass60_Sub4_Sub1_5);
		this.method3692(1);
		this.method3709(7681, 8448);
		this.method3684(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat79 / (float) local5.anInt6577;
		@Pc(37) float local37 = local5.aFloat78 / (float) local5.anInt6576;
		this.anOpengl1.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt4011 - arg1), local37 * (float) (this.anInt4003 - arg2));
		this.anOpengl1.glVertex2i(this.anInt4011, this.anInt4003);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt4011 - arg1), local37 * (float) (this.anInt4014 - arg2));
		this.anOpengl1.glVertex2i(this.anInt4011, this.anInt4014);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt4017 - arg1), local37 * (float) (this.anInt4014 - arg2));
		this.anOpengl1.glVertex2i(this.anInt4017, this.anInt4014);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt4017 - arg1), local37 * (float) (this.anInt4003 - arg2));
		this.anOpengl1.glVertex2i(this.anInt4017, this.anInt4003);
		this.anOpengl1.glEnd();
		this.method3684(0, 5890, 768);
	}

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "(II)V")
	public synchronized void method3652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class5_Sub15 local4 = new Class5_Sub15(arg1);
		local4.aLong235 = arg0;
		this.aClass103_93.method2745(local4);
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(IIII)V")
	@Override
	public void method5167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass111_1.method2879(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!mm", name = "z", descriptor = "()I")
	@Override
	public int method5213() {
		return this.anInt4028;
	}

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "(II)V")
	public synchronized void method3653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class5_Sub15 local4 = new Class5_Sub15(arg1);
		local4.aLong235 = arg0;
		this.aClass103_95.method2745(local4);
	}

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "()Lclient!ve;")
	@Override
	public Class66 method5173() {
		return new Class66_Sub2();
	}

	@OriginalMember(owner = "client!mm", name = "w", descriptor = "()Z")
	@Override
	public boolean method5209() {
		if (!this.aClass5_Sub5_Sub1_1.method238()) {
			if (!this.aClass111_1.method2876(this.aClass5_Sub5_Sub1_1)) {
				return false;
			}
			this.aClass117_1.method3127();
		}
		return true;
	}

	@OriginalMember(owner = "client!mm", name = "m", descriptor = "()V")
	@Override
	public void method5186() {
		this.anInt4011 = 0;
		this.anInt4003 = 0;
		this.anInt4017 = this.anInt3996;
		this.anInt4014 = this.anInt3997;
		this.anOpengl1.glDisable(3089);
		this.method3696();
	}

	@OriginalMember(owner = "client!mm", name = "V", descriptor = "()V")
	public void method3654() {
		if (this.anInt4024 == 4) {
			return;
		}
		this.method3651();
		this.method3638(false);
		this.method3695(false);
		this.method3701(false);
		this.method3671(false);
		this.method3666();
		this.method3692(1);
		this.method3655(1);
		this.anInt4024 = 4;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II[[I[[IIII)Lclient!dn;")
	@Override
	public Class51 method5155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class51_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4026 = arg0;
		this.anInt4015 = arg1;
		this.anInt4007 = arg2;
		this.anInt4032 = arg3;
		this.method3642();
		this.method3696();
		if (this.anInt4002 == 3) {
			this.method3683();
		} else if (this.anInt4002 == 2) {
			this.method3697();
		}
	}

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "(I)V")
	public void method3655(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3709(7681, 7681);
		} else if (arg0 == 1) {
			this.method3709(8448, 8448);
		} else if (arg0 == 2) {
			this.method3709(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5184() {
	}

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "()Z")
	@Override
	public boolean method5170() {
		return true;
	}

	@OriginalMember(owner = "client!mm", name = "W", descriptor = "()V")
	public void method3656() {
		if (this.anInt4002 != 0) {
			this.anInt4002 = 0;
			this.anInt4024 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!mm", name = "X", descriptor = "()V")
	private void method3657() {
		if (this.anInt4011 <= this.anInt4017 && this.anInt4003 <= this.anInt4014) {
			this.anOpengl1.glScissor(this.anInt4018 + this.anInt4011, this.anInt4020 + this.anInt3997 - this.anInt4014, this.anInt4017 - this.anInt4011, this.anInt4014 - this.anInt4003);
		} else {
			this.anOpengl1.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "(I)V")
	@Override
	public void method5255(@OriginalArg(0) int arg0) {
		this.method3691();
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method5192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3646();
		this.method3692(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!mm", name = "Y", descriptor = "()V")
	private void method3658() {
		if (this.aBoolean323 && this.aBoolean320 | this.anInt4030 >= 0) {
			this.anOpengl1.glEnable(2912);
		} else {
			this.anOpengl1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!mm", name = "Z", descriptor = "()V")
	private void method3659() {
		Static201.aFloatArray11[0] = this.aFloat48 * this.aFloat46;
		Static201.aFloatArray11[1] = this.aFloat48 * this.aFloat53;
		Static201.aFloatArray11[2] = this.aFloat48 * this.lb;
		Static201.aFloatArray11[3] = 1.0F;
		this.anOpengl1.glLightModelfv(2899, Static201.aFloatArray11, 0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method5175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!mm", name = "ab", descriptor = "()V")
	private void method3660() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!mm", name = "u", descriptor = "()V")
	@Override
	public void method5199() {
	}

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "(I)V")
	public synchronized void method3661(@OriginalArg(0) int arg0) {
		@Pc(4) Class5_Sub15 local4 = new Class5_Sub15(arg0);
		this.aClass103_97.method2745(local4);
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "()Z")
	@Override
	public boolean method5158() {
		return !this.aBoolean327;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIII)Z")
	@Override
	public boolean method5191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass66_Sub2_2.aFloat66 * (float) arg0 + this.aClass66_Sub2_2.aFloat74 * (float) arg1 + this.aClass66_Sub2_2.aFloat72 * (float) arg2 + this.aClass66_Sub2_2.aFloat73;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass66_Sub2_2.aFloat66 * (float) arg3 + this.aClass66_Sub2_2.aFloat74 * (float) arg4 + this.aClass66_Sub2_2.aFloat72 * (float) arg5 + this.aClass66_Sub2_2.aFloat73;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt4001 && local55 < (float) this.anInt4001 || !(!(local24 > (float) this.anInt4028) || !(local55 > (float) this.anInt4028))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt4007 * (this.aClass66_Sub2_2.aFloat71 * (float) arg0 + this.aClass66_Sub2_2.aFloat69 * (float) arg1 + this.aClass66_Sub2_2.aFloat77 * (float) arg2 + this.aClass66_Sub2_2.aFloat68) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt4007 * (this.aClass66_Sub2_2.aFloat71 * (float) arg3 + this.aClass66_Sub2_2.aFloat69 * (float) arg4 + this.aClass66_Sub2_2.aFloat77 * (float) arg5 + this.aClass66_Sub2_2.aFloat68) / local55);
		if ((float) local119 < this.aFloat44 && (float) local151 < this.aFloat44 || (float) local119 > this.aFloat40 && (float) local151 > this.aFloat40) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt4032 * (this.aClass66_Sub2_2.aFloat70 * (float) arg0 + this.aClass66_Sub2_2.aFloat75 * (float) arg1 + this.aClass66_Sub2_2.aFloat67 * (float) arg2 + this.aClass66_Sub2_2.aFloat76) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt4032 * (this.aClass66_Sub2_2.aFloat70 * (float) arg3 + this.aClass66_Sub2_2.aFloat75 * (float) arg4 + this.aClass66_Sub2_2.aFloat67 * (float) arg5 + this.aClass66_Sub2_2.aFloat76) / local55);
			return (!((float) local209 < this.aFloat47) || !((float) local241 < this.aFloat47)) && (!((float) local209 > this.aFloat39) || !((float) local241 > this.aFloat39));
		}
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(Z)V")
	@Override
	public void method5249(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mm", name = "bb", descriptor = "()I")
	private int method3662() {
		@Pc(1) int local1 = 0;
		this.aString28 = this.anOpengl1.glGetString(7936);
		this.aString29 = this.anOpengl1.glGetString(7937);
		@Pc(17) String local17 = this.aString28.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl1.glGetString(7938);
		@Pc(53) String[] local53 = Static172.method4047(local45.replace('.', ' '), ' ');
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static36.method580(local53[0]);
				@Pc(69) int local69 = Static36.method580(local53[1]);
				this.anInt4000 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt4000 < 12) {
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
		this.anInt4005 = local116[0];
		this.anOpengl1.glGetIntegerv(34929, local116, 0);
		this.anInt4027 = local116[0];
		this.anOpengl1.glGetIntegerv(34930, local116, 0);
		this.anInt4010 = local116[0];
		if (this.anInt4005 < 2 || this.anInt4027 < 2 || this.anInt4010 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean327 = Static210.aString33 != null && Static210.aString33.startsWith("mac");
		this.aBoolean308 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean322 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean317 = this.anOpengl1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean330 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean313 = this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean325 = this.anOpengl1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean315 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean318 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean328 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean326 = false;
		this.aBoolean309 = this.anOpengl1.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(Z)V")
	@Override
	public void method5237(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(III)V")
	public void method3663(@OriginalArg(2) int arg0) {
		this.anOpengl1.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)I")
	@Override
	public int method5165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!mm", name = "cb", descriptor = "()V")
	private void method3664() {
		if (this.anInt4002 != 3) {
			this.anInt4002 = 3;
			this.method3683();
			this.method3703();
			this.anInt4024 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "(Z)V")
	@Override
	public void method5259(@OriginalArg(0) boolean arg0) {
		this.aBoolean312 = arg0;
		this.method3668();
	}

	@OriginalMember(owner = "client!mm", name = "E", descriptor = "()V")
	@Override
	public void method5224() {
		this.aClass15_1.method339(false, false, 0);
		this.aBoolean320 = false;
		this.method3645();
		this.method3658();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!ve;)V")
	@Override
	public void method5252(@OriginalArg(0) Class66 arg0) {
		this.aClass66_Sub2_2 = (Class66_Sub2) arg0;
		this.aClass66_Sub2_1.method5829(this.aClass66_Sub2_2);
		if (this.anInt4002 != 1) {
			this.method3703();
		}
	}

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "()Z")
	@Override
	public boolean method5160() {
		return true;
	}

	@OriginalMember(owner = "client!mm", name = "v", descriptor = "()I")
	@Override
	public int method5207() {
		return 4;
	}

	@OriginalMember(owner = "client!mm", name = "db", descriptor = "()V")
	public void method3665() {
		this.anOpengl1.glPopMatrix();
	}

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "()Z")
	@Override
	public boolean method5187() {
		return true;
	}

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "(I)V")
	public void method3666() {
		this.method3680(-2, true);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!ci;[Lclient!jf;Z)Lclient!ok;")
	@Override
	public Class18 method5180(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class100[] arg1) {
		return new Class18_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "(I)V")
	public void method3667(@OriginalArg(0) int arg0) {
		Static201.aFloatArray11[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static201.aFloatArray11[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static201.aFloatArray11[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static201.aFloatArray11[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static201.aFloatArray11, 0);
	}

	@OriginalMember(owner = "client!mm", name = "eb", descriptor = "()V")
	private void method3668() {
		this.anOpengl1.glDepthMask(this.aBoolean316 && this.aBoolean312);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZZ)V")
	public void method3669(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt4029) {
			if (arg0 < 0) {
				this.method3682();
				this.method3677(null);
				if (!this.aBoolean320) {
					this.aClass15_1.method339(arg2, arg1, 0);
				}
			} else {
				@Pc(11) Class60_Sub4 local11 = this.aClass117_1.method3128(arg0);
				@Pc(17) Class200 local17 = this.anInterface3_4.method1511(arg0);
				if (local17.aByte68 == 0 && local17.aByte67 == 0) {
					this.method3682();
				} else {
					@Pc(30) int local30 = local17.aBoolean539 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method3694((float) (this.anInt3999 % local34 * local17.aByte68) / (float) local34, (float) (this.anInt3999 % local34 * local17.aByte67) / (float) local34, 0.0F);
				}
				if (this.aBoolean320) {
					this.aClass15_1.method339(arg2, arg1, 3);
					this.method3677(local11);
				} else {
					this.aClass15_1.method339(arg2, arg1, local17.aByte63);
					this.aClass15_1.method342(false, local17.aByte64);
					if (!this.aClass15_1.method341(local11)) {
						this.method3677(local11);
					}
				}
			}
			this.anInt4029 = arg0;
		}
		this.anInt4024 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!sg;Lclient!sg;FLclient!sg;)Lclient!sg;")
	@Override
	public Class54 method5225(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class54 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean318 && this.aBoolean309) {
			@Pc(11) Class54_Sub1_Sub1 local11 = null;
			@Pc(14) Class54_Sub1 local14 = (Class54_Sub1) arg0;
			@Pc(17) Class54_Sub1 local17 = (Class54_Sub1) arg1;
			@Pc(21) Class60_Sub2 local21 = local14.method2238();
			@Pc(25) Class60_Sub2 local25 = local17.method2238();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt1838 > local25.anInt1838 ? local21.anInt1838 : local25.anInt1838;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class54_Sub1_Sub1) {
					@Pc(52) Class54_Sub1_Sub1 local52 = (Class54_Sub1_Sub1) arg3;
					if (local52.method1015() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class54_Sub1_Sub1(this, local40);
				}
				local11.method1014(local21, local25, arg2);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!mm", name = "D", descriptor = "()I")
	@Override
	public int method5222() {
		@Pc(2) int local2 = this.anInt4034;
		this.anInt4034 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!mm", name = "A", descriptor = "()I")
	@Override
	public int method5217() {
		return this.anInt4001;
	}

	@OriginalMember(owner = "client!mm", name = "fb", descriptor = "()V")
	public void method3670() {
		if (this.anInt4024 == 2) {
			return;
		}
		this.method3651();
		this.method3638(false);
		this.method3695(false);
		this.method3701(false);
		this.method3671(false);
		this.method3666();
		this.anInt4024 = 2;
	}

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "(Z)V")
	public void method3671(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean316) {
			this.aBoolean316 = arg0;
			this.method3668();
			this.anInt4024 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!sg;)V")
	@Override
	public void method5179(@OriginalArg(0) Class54 arg0) {
		this.aClass54_Sub1_1 = (Class54_Sub1) arg0;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIZ)Lclient!wn;")
	@Override
	public Class95 method5157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class95_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "()Z")
	@Override
	public boolean method5182() {
		return true;
	}

	@OriginalMember(owner = "client!mm", name = "gb", descriptor = "()V")
	private void method3672() {
		if (this.aFloat41 == 0.0F) {
			this.aFloatArray15[10] = this.aFloat36;
			this.aFloatArray15[14] = this.aFloat54;
		} else {
			@Pc(13) float local13 = this.aFloat50 / (this.aFloat41 + this.aFloat50);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat54 * (1.0F - local13) * (1.0F - local13) / this.aFloat41;
			this.aFloatArray15[10] = this.aFloat36 + local32;
			this.aFloatArray15[14] = this.aFloat54 * local17;
		}
		this.aFloat37 = (this.aFloatArray15[14] - (float) this.anInt4028) / this.aFloatArray15[10];
		this.aFloat52 = (float) this.anInt4028 - this.aFloat41;
	}

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "()Z")
	@Override
	public boolean method5188() {
		return this.aClass5_Sub5_Sub1_1.method240();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!dc;III)V")
	public void method3673(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3675(arg0);
		arg0.method5666(arg1, arg2);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[BIZ)Lclient!q;")
	public Interface8 method3674(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface8) (this.aBoolean322 && (!arg3 || this.aBoolean310) ? new Class48_Sub1(this, arg0, arg1, arg2, arg3) : new Class12_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!dc;)V")
	public void method3675(@OriginalArg(0) Interface1 arg0) {
		if (this.anInterface1_3 != arg0 && this.aBoolean322) {
			this.anOpengl1.glBindBufferARB(34963, arg0.method5663());
			this.anInterface1_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(II)I")
	@Override
	public int method5181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "()V")
	@Override
	public void method5159() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(FFFF)V")
	public void method3676(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static201.aFloatArray11[0] = arg0;
		Static201.aFloatArray11[1] = arg1;
		Static201.aFloatArray11[2] = arg2;
		Static201.aFloatArray11[3] = arg3;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static201.aFloatArray11, 0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!t;)V")
	public void method3677(@OriginalArg(0) Class60 arg0) {
		@Pc(5) Class60 local5 = this.aClass60Array1[this.anInt4004];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl1.glDisable(local5.anInt6572);
			} else {
				if (local5 == null) {
					this.anOpengl1.glEnable(arg0.anInt6572);
				} else if (arg0.anInt6572 != local5.anInt6572) {
					this.anOpengl1.glDisable(local5.anInt6572);
					this.anOpengl1.glEnable(arg0.anInt6572);
				}
				this.anOpengl1.glBindTexture(arg0.anInt6572, arg0.method5846());
			}
			this.aClass60Array1[this.anInt4004] = arg0;
		}
		this.anInt4024 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(F)V")
	public void method3678(@OriginalArg(0) float arg0) {
		if (this.aFloat38 != arg0) {
			this.aFloat38 = arg0;
			if (this.anInt4002 == 3) {
				this.method3683();
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "G", descriptor = "()F")
	@Override
	public float method5231() {
		return this.aFloat50;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[Lclient!bn;)V")
	@Override
	public void method5172(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub9[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class5_Sub9 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static201.aFloatArray10[0] = local8.anInt703;
			Static201.aFloatArray10[1] = local8.anInt704;
			Static201.aFloatArray10[2] = local8.anInt708;
			Static201.aFloatArray10[3] = 1.0F;
			this.anOpengl1.glLightfv(local12, 4611, Static201.aFloatArray10, 0);
			@Pc(44) int local44 = local8.anInt702;
			@Pc(49) float local49 = local8.aFloat8 / 255.0F;
			Static201.aFloatArray10[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static201.aFloatArray10[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static201.aFloatArray10[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl1.glLightfv(local12, 4609, Static201.aFloatArray10, 0);
			this.anOpengl1.glLightf(local12, 4617, 1.0F / (float) (local8.anInt705 * local8.anInt705));
			this.anOpengl1.glEnable(local12);
		}
		while (local1 < this.anInt4021) {
			this.anOpengl1.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt4021 = arg0;
	}

	@OriginalMember(owner = "client!mm", name = "hb", descriptor = "()V")
	private void method3679() {
		this.method3666();
		for (@Pc(7) int local7 = this.anInt4005 - 1; local7 >= 0; local7--) {
			this.method3693(local7);
			this.method3677(null);
			this.anOpengl1.glTexEnvi(8960, 8704, 34160);
		}
		this.method3709(8448, 8448);
		this.method3684(2, 34168, 770);
		this.method3682();
		this.anInt4008 = 1;
		this.anOpengl1.glEnable(3042);
		this.anOpengl1.glBlendFunc(770, 771);
		this.anInt4009 = 1;
		this.anOpengl1.glEnable(3008);
		this.anOpengl1.glAlphaFunc(516, 0.0F);
		this.aBoolean324 = true;
		this.anOpengl1.glColorMask(true, true, true, true);
		this.aBoolean314 = true;
		this.method3638(true);
		this.method3695(true);
		this.method3701(true);
		this.method3671(true);
		this.method3656();
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
		this.anInt4031 = this.anInt4013 = -1;
		this.method5186();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)V")
	public void method3680(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3669(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!mm", name = "m", descriptor = "(I)I")
	public int method3681(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
	@Override
	public void method5226(@OriginalArg(0) int arg0) {
		this.method3692(0);
		this.anOpengl1.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl1.glClear(16384);
	}

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "(IIIIII)Lclient!sg;")
	@Override
	public Class54 method5238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean318 ? new Class54_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!mm", name = "ib", descriptor = "()V")
	private void method3682() {
		if (this.aBoolean321) {
			this.anOpengl1.glMatrixMode(5890);
			this.anOpengl1.glLoadIdentity();
			this.anOpengl1.glMatrixMode(5888);
			this.aBoolean321 = false;
		}
	}

	@OriginalMember(owner = "client!mm", name = "jb", descriptor = "()V")
	private void method3683() {
		@Pc(11) float local11 = (float) -this.anInt4026 * this.aFloat38 / (float) this.anInt4007;
		@Pc(23) float local23 = (float) -this.anInt4015 * this.aFloat38 / (float) this.anInt4032;
		@Pc(37) float local37 = (float) (this.anInt3996 - this.anInt4026) * this.aFloat38 / (float) this.anInt4007;
		@Pc(51) float local51 = (float) (this.anInt3997 - this.anInt4015) * this.aFloat38 / (float) this.anInt4032;
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (local11 != local37 && local51 != local23) {
			this.anOpengl1.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt4001 - this.aFloat41), (double) ((float) this.anInt4028 - this.aFloat41));
		}
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "(III)V")
	public void method3684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "([I)V")
	@Override
	public void method5203(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4011;
		arg0[1] = this.anInt4003;
		arg0[2] = this.anInt4017;
		arg0[3] = this.anInt4014;
	}

	@OriginalMember(owner = "client!mm", name = "q", descriptor = "()Z")
	@Override
	public boolean method5193() {
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!sj;)V")
	public void method3685(@OriginalArg(0) Interface9 arg0) {
		if (this.anInt3993 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3993 >= 0) {
			this.anInterface9Array1[this.anInt3993].method4537();
		}
		this.anInterface9_1 = this.anInterface9Array1[++this.anInt3993] = arg0;
		this.anInterface9_1.method4539();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "([IIIII)Lclient!wn;")
	@Override
	public Class95 method5210(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class95_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!mm", name = "kb", descriptor = "()V")
	private void method3686() {
		if (this.aBoolean311 && !this.aBoolean319) {
			this.anOpengl1.glEnable(2896);
		} else {
			this.anOpengl1.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "(I)I")
	public int method3687(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)V")
	@Override
	public void method5163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean320) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt4019 = arg1;
		this.anInt4025 = arg2;
		this.method3645();
		this.aClass15_1.method342(true, arg0);
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "()I")
	@Override
	public int method4538() {
		return this.anInt3997;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!ns;)V")
	@Override
	public void method5189(@OriginalArg(0) Class146 arg0) {
		this.aClass182_1.method4970(this, arg0);
	}

	@OriginalMember(owner = "client!mm", name = "x", descriptor = "()V")
	@Override
	public void method5211() {
		if (this.aClass5_Sub5_Sub1_1.method238()) {
			this.aClass111_1.method2877(this.aClass5_Sub5_Sub1_1);
			this.aClass117_1.method3127();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method5246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass60_Sub4_Sub1_2 == null || this.aClass60_Sub4_Sub1_2.anInt6574 < arg2 || this.aClass60_Sub4_Sub1_2.anInt6575 < arg3) {
			this.aClass60_Sub4_Sub1_2 = Static369.method5854(arg3, arg6, arg2, this);
			this.aClass60_Sub4_Sub1_2.method5849(false, false);
			local32 = this.aClass60_Sub4_Sub1_2.aFloat78;
			local36 = this.aClass60_Sub4_Sub1_2.aFloat79;
		} else {
			this.aClass60_Sub4_Sub1_2.method5847(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass60_Sub4_Sub1_2.aFloat78 * (float) arg3 / (float) this.aClass60_Sub4_Sub1_2.anInt6575;
			local36 = this.aClass60_Sub4_Sub1_2.aFloat79 * (float) arg2 / (float) this.aClass60_Sub4_Sub1_2.anInt6574;
		}
		this.method3670();
		this.method3677(this.aClass60_Sub4_Sub1_2);
		this.method3692(arg8);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method3667(arg5);
		this.method3709(34165, 34165);
		this.method3684(0, 34166, 768);
		this.method3684(2, 5890, 770);
		this.method3689(0, 34166);
		this.method3689(2, 5890);
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
		this.method3684(0, 5890, 768);
		this.method3684(2, 34166, 770);
		this.method3689(0, 5890);
		this.method3689(2, 34166);
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(Lclient!sj;)V")
	public void method3688(@OriginalArg(0) Interface9 arg0) {
		if (this.anInt3993 < 0 || this.anInterface9Array1[this.anInt3993] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface9Array1[this.anInt3993--] = null;
		arg0.method4537();
		if (this.anInt3993 >= 0) {
			this.anInterface9_1 = this.anInterface9Array1[this.anInt3993];
			this.anInterface9_1.method4539();
		}
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V")
	@Override
	public void method5233(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "()V")
	@Override
	public void method5171() {
		this.anInt3996 = this.aCanvas4.getWidth();
		this.anInt3997 = this.aCanvas4.getHeight();
		this.anOpengl1.glViewport(this.anInt4018, this.anInt4020, this.anInt3996, this.anInt3997);
		this.method3656();
		this.method5186();
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method5176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3646();
		this.method3692(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method3646();
		this.method3692(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean317) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local19);
		this.anOpengl1.glVertex2f(local14, local19);
		this.anOpengl1.glVertex2f(local14, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean317) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "(III)V")
	public void method3689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
	@Override
	public void method5164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4013 == arg0 && this.anInt4030 == arg1) {
			return;
		}
		this.anInt4013 = arg0;
		this.anInt4030 = arg1;
		if (!this.aBoolean320) {
			this.method3645();
			this.method3658();
		}
	}

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method5248(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class5_Sub15 local16;
		while (!this.aClass103_93.method2750()) {
			local16 = (Class5_Sub15) this.aClass103_93.method2743();
			Static201.anIntArray388[local1++] = (int) local16.aLong235;
			this.anInt3992 -= local16.anInt1686;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteBuffersARB(local1, Static201.anIntArray388, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteBuffersARB(local1, Static201.anIntArray388, 0);
			local1 = 0;
		}
		while (!this.aClass103_94.method2750()) {
			local16 = (Class5_Sub15) this.aClass103_94.method2743();
			Static201.anIntArray388[local1++] = (int) local16.aLong235;
			this.anInt3998 -= local16.anInt1686;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteTextures(local1, Static201.anIntArray388, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteTextures(local1, Static201.anIntArray388, 0);
			local1 = 0;
		}
		while (!this.aClass103_95.method2750()) {
			local16 = (Class5_Sub15) this.aClass103_95.method2743();
			Static201.anIntArray388[local1++] = local16.anInt1686;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteFramebuffersEXT(local1, Static201.anIntArray388, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteFramebuffersEXT(local1, Static201.anIntArray388, 0);
			local1 = 0;
		}
		while (!this.aClass103_96.method2750()) {
			local16 = (Class5_Sub15) this.aClass103_96.method2743();
			Static201.anIntArray388[local1++] = (int) local16.aLong235;
			this.anInt3994 -= local16.anInt1686;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static201.anIntArray388, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static201.anIntArray388, 0);
			local1 = 0;
		}
		while (!this.aClass103_97.method2750()) {
			local16 = (Class5_Sub15) this.aClass103_97.method2743();
			Static201.anIntArray388[local1++] = (int) local16.aLong235;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteProgramsARB(local1, Static201.anIntArray388, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteProgramsARB(local1, Static201.anIntArray388, 0);
		}
		while (!this.aClass103_92.method2750()) {
			local16 = (Class5_Sub15) this.aClass103_92.method2743();
			this.anOpengl1.glDeleteLists((int) local16.aLong235, local16.anInt1686);
		}
		while (!this.aClass103_98.method2750()) {
			local16 = (Class5_Sub15) this.aClass103_98.method2743();
			this.anOpengl1.glDeleteObjectARB(local16.anInt1686);
		}
		while (!this.aClass103_92.method2750()) {
			local16 = (Class5_Sub15) this.aClass103_92.method2743();
			this.anOpengl1.glDeleteLists((int) local16.aLong235, local16.anInt1686);
		}
		if (this.method5196() > 100663296 && Static340.method5863() > this.aLong141 + 60000L) {
			System.gc();
			this.aLong141 = Static340.method5863();
		}
		this.anInt3999 = local5;
	}

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "(I)I")
	public int method3690(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!mm", name = "lb", descriptor = "()V")
	private void method3691() {
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
			Static20.method408(1000L);
		}
	}

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "(II)V")
	@Override
	public void method5200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4001 == arg0 && this.anInt4028 == arg1) {
			return;
		}
		this.anInt4001 = arg0;
		this.anInt4028 = arg1;
		this.method3642();
		this.method3645();
		if (this.anInt4002 == 3) {
			this.method3683();
		} else if (this.anInt4002 == 2) {
			this.method3697();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)Lclient!lf;")
	@Override
	public Class5_Sub23 method5198() {
		return null;
	}

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "(I)V")
	public void method3692(@OriginalArg(0) int arg0) {
		if (this.anInt4008 == arg0) {
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
		if (local10 != this.aBoolean314) {
			this.anOpengl1.glColorMask(local10, local10, local10, true);
			this.aBoolean314 = local10;
		}
		if (local12 != this.aBoolean324) {
			if (local12) {
				this.anOpengl1.glEnable(3008);
			} else {
				this.anOpengl1.glDisable(3008);
			}
			this.aBoolean324 = local12;
		}
		if (local8 != this.anInt4009) {
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
			this.anInt4009 = local8;
		}
		this.anInt4008 = arg0;
		this.anInt4024 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!mm", name = "q", descriptor = "(I)V")
	public void method3693(@OriginalArg(0) int arg0) {
		if (this.anInt4004 != arg0) {
			this.anOpengl1.glActiveTexture(arg0 + 33984);
			this.anInt4004 = arg0;
		}
	}

	@OriginalMember(owner = "client!mm", name = "H", descriptor = "()F")
	@Override
	public float method5232() {
		return this.aFloat41;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(FFF)V")
	private void method3694(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl1.glMatrixMode(5890);
		if (this.aBoolean321) {
			this.anOpengl1.glLoadIdentity();
		}
		this.anOpengl1.glTranslatef(arg0, arg1, arg2);
		this.anOpengl1.glMatrixMode(5888);
		this.aBoolean321 = true;
	}

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "(Z)V")
	public void method3695(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean311) {
			this.aBoolean311 = arg0;
			this.method3686();
			this.anInt4024 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!mm", name = "B", descriptor = "()Z")
	@Override
	public boolean method5218() {
		return true;
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "(IIII)[I")
	@Override
	public int[] method5202() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl1.glReadPixels(0, this.anInt3997 - local6, 36, 1, 32993, this.anInt4012, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!mm", name = "mb", descriptor = "()V")
	private void method3696() {
		this.aFloat44 = this.anInt4011 - this.anInt4026;
		this.aFloat40 = this.anInt4017 - this.anInt4026;
		this.aFloat47 = this.anInt4003 - this.anInt4015;
		this.aFloat39 = this.anInt4014 - this.anInt4015;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!jf;Z)Lclient!wn;")
	@Override
	public Class95 method5229(@OriginalArg(0) Class100 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt2902 * arg0.anInt2901];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray37 == null) {
			for (local15 = 0; local15 < arg0.anInt2901; local15++) {
				for (local21 = 0; local21 < arg0.anInt2902; local21++) {
					@Pc(74) int local74 = arg0.anIntArray288[arg0.aByteArray38[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt2901; local15++) {
				for (local21 = 0; local21 < arg0.anInt2902; local21++) {
					local6[local10++] = arg0.aByteArray37[local8] << 24 | arg0.anIntArray288[arg0.aByteArray38[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class95 local100 = this.method5210(local6, arg0.anInt2902, arg0.anInt2902, arg0.anInt2901);
		local100.method5496(arg0.anInt2897, arg0.anInt2899, arg0.anInt2900, arg0.anInt2898);
		return local100;
	}

	@OriginalMember(owner = "client!mm", name = "nb", descriptor = "()V")
	private void method3697() {
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadMatrixf(this.aFloatArray15, 0);
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "()Z")
	@Override
	public boolean method5177() {
		return true;
	}

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "()Z")
	@Override
	public boolean method5190() {
		return this.aClass15_1.method340();
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "()V")
	@Override
	public void method4539() {
	}

	@OriginalMember(owner = "client!mm", name = "y", descriptor = "()V")
	@Override
	public void method5212() {
		if (this.anInt3996 <= 0 && this.anInt3997 <= 0) {
			return;
		}
		@Pc(9) int local9 = this.anInt4011;
		@Pc(12) int local12 = this.anInt4017;
		@Pc(15) int local15 = this.anInt4003;
		@Pc(18) int local18 = this.anInt4014;
		this.method5186();
		this.anOpengl1.glReadBuffer(1028);
		this.anOpengl1.glDrawBuffer(1029);
		this.method3656();
		this.method3638(false);
		this.method3695(false);
		this.method3701(false);
		this.method3671(false);
		this.method3677(null);
		this.method3666();
		this.method3655(0);
		this.method3692(0);
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRasterPos2i(0, 0);
		this.anOpengl1.glCopyPixels(0, 0, this.anInt3996, this.anInt3997, 6144);
		this.anOpengl1.glFlush();
		this.anOpengl1.glReadBuffer(1029);
		this.anOpengl1.glDrawBuffer(1029);
		this.method5258(local9, local15, local12, local18);
	}

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "(II)V")
	public synchronized void method3698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class5_Sub15 local4 = new Class5_Sub15(arg1);
		local4.aLong235 = arg0;
		this.aClass103_94.method2745(local4);
	}

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method5216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3646();
		this.method3692(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!q;)V")
	public void method3699(@OriginalArg(0) Interface8 arg0) {
		if (this.anInterface8_3 != arg0 && this.aBoolean322) {
			this.anOpengl1.glBindBufferARB(34962, arg0.method5663());
			this.anInterface8_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!vh;)V")
	public void method3700(@OriginalArg(0) Class66_Sub2 arg0) {
		this.anOpengl1.glPushMatrix();
		this.anOpengl1.glMultMatrixf(arg0.method5831(), 0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIILclient!de;II)V")
	@Override
	public void method5245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class46 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class46_Sub2 local2 = (Class46_Sub2) arg5;
		@Pc(5) Class60_Sub4_Sub1 local5 = local2.aClass60_Sub4_Sub1_5;
		this.method3670();
		this.method3677(local2.aClass60_Sub4_Sub1_5);
		this.method3692(1);
		this.method3709(7681, 8448);
		this.method3684(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat79 / (float) local5.anInt6577;
		@Pc(37) float local37 = local5.aFloat78 / (float) local5.anInt6576;
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
		this.method3684(0, 5890, 768);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "([Lclient!ts;Lclient!ns;Lclient!ve;[Lclient!uh;I)V")
	@Override
	public void method5214(@OriginalArg(0) Class112[] arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) Class32_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method5244(arg0, arg2, arg3, arg4);
		this.method5189(arg1);
	}

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "(Z)V")
	public void method3701(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean329) {
			return;
		}
		if (arg0) {
			this.anOpengl1.glEnable(2929);
		} else {
			this.anOpengl1.glDisable(2929);
		}
		this.aBoolean329 = arg0;
		this.anInt4024 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!mm", name = "ob", descriptor = "()V")
	public void method3702() {
		if (this.anInt4024 == 16) {
			return;
		}
		this.method3664();
		this.method3638(true);
		this.method3701(true);
		this.method3671(true);
		this.method3692(1);
		this.method3655(1);
		this.anInt4024 = 16;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II[I[I)Lclient!de;")
	@Override
	public Class46 method5206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static367.method4833(this, arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "(I)V")
	@Override
	public void method5257(@OriginalArg(0) int arg0) {
		this.method3660();
	}

	@OriginalMember(owner = "client!mm", name = "pb", descriptor = "()V")
	private void method3703() {
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl1.glMultMatrixf(this.aClass66_Sub2_2.method5831(), 0);
		this.method3649();
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I[BIZ)Lclient!dc;")
	public Interface1 method3704(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface1) (this.aBoolean322 && (!arg2 || this.aBoolean310) ? new Class48_Sub2(this, 5123, arg0, arg1, arg2) : new Class12_Sub1(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(FF)V")
	@Override
	public void method5156(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat50 && arg1 == this.aFloat41) {
			return;
		}
		this.aFloat50 = arg0;
		this.aFloat41 = arg1;
		this.method3672();
		if (this.anInt4002 == 3) {
			this.method3683();
		} else if (this.anInt4002 == 2) {
			this.method3697();
		}
	}

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "(IIII)V")
	@Override
	public void method5258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt3996) {
			arg2 = this.anInt3996;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt3997) {
			arg3 = this.anInt3997;
		}
		this.anInt4011 = arg0;
		this.anInt4003 = arg1;
		this.anInt4017 = arg2;
		this.anInt4014 = arg3;
		this.anOpengl1.glEnable(3089);
		this.method3696();
		this.method3657();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!ri;IIII)Lclient!ts;")
	@Override
	public Class112 method5201(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class112_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!mm", name = "r", descriptor = "(I)V")
	public synchronized void method3705(@OriginalArg(0) int arg0) {
		@Pc(4) Class5_Sub15 local4 = new Class5_Sub15(arg0);
		this.aClass103_98.method2745(local4);
	}

	@OriginalMember(owner = "client!mm", name = "F", descriptor = "()Z")
	@Override
	public boolean method5228() {
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "(II)V")
	public void method3706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4018 = arg0;
		this.anInt4020 = arg1;
		this.anOpengl1.glViewport(arg0, arg1, this.anInt3996, this.anInt3997);
		this.method3657();
	}

	@OriginalMember(owner = "client!mm", name = "qb", descriptor = "()V")
	public void method3707() {
		if (this.anInt4024 == 8) {
			return;
		}
		this.method3650();
		this.method3638(true);
		this.method3701(true);
		this.method3671(true);
		this.method3692(1);
		this.method3655(1);
		this.anInt4024 = 8;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "()V")
	@Override
	public void method4537() {
	}

	@OriginalMember(owner = "client!mm", name = "rb", descriptor = "()Lclient!sj;")
	public Interface9 method3708() {
		return this.anInterface9_1;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5235(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static13.aFloat3 = arg0;
		Static13.aFloat5 = arg1;
		Static13.aFloat4 = arg2;
	}

	@OriginalMember(owner = "client!mm", name = "t", descriptor = "()V")
	@Override
	protected void method5197() {
		if (this.anOpengl1 != null) {
			try {
				this.aClass111_1.method2875();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl1 = null;
		}
		if (this.aContext1 != null) {
			this.method3660();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean307) {
			Static7.method122(true);
			this.aBoolean307 = false;
		}
	}

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "(II)V")
	public void method3709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4004 != 0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt4022 != arg0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anInt4022 = arg0;
			local4 = true;
		}
		if (this.anInt4016 != arg1) {
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			this.anInt4016 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt4024 &= 0xFFFFFFE2;
		}
	}
}
