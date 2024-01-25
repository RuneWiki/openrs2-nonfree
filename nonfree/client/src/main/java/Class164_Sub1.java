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

@OriginalClass("client!nm")
public final class Class164_Sub1 extends Class164 implements Interface1 {

	@OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
	public int anInt4058;

	@OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
	public int anInt4059;

	@OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
	private int anInt4062;

	@OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
	public int anInt4063;

	@OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
	public int anInt4064;

	@OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
	public int anInt4066;

	@OriginalMember(owner = "client!nm", name = "O", descriptor = "Lclient!bl;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!nm", name = "W", descriptor = "[Lclient!ap;")
	private Class15[] aClass15Array1;

	@OriginalMember(owner = "client!nm", name = "Y", descriptor = "F")
	private float aFloat34;

	@OriginalMember(owner = "client!nm", name = "bb", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!nm", name = "db", descriptor = "Lclient!hi;")
	public Class15_Sub2 aClass15_Sub2_5;

	@OriginalMember(owner = "client!nm", name = "eb", descriptor = "Ljava/lang/String;")
	private String aString53;

	@OriginalMember(owner = "client!nm", name = "hb", descriptor = "F")
	private float aFloat36;

	@OriginalMember(owner = "client!nm", name = "ib", descriptor = "I")
	private int anInt4071;

	@OriginalMember(owner = "client!nm", name = "jb", descriptor = "Z")
	private boolean aBoolean401;

	@OriginalMember(owner = "client!nm", name = "kb", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!nm", name = "lb", descriptor = "Z")
	private boolean lb;

	@OriginalMember(owner = "client!nm", name = "ob", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!nm", name = "sb", descriptor = "Z")
	private boolean aBoolean402;

	@OriginalMember(owner = "client!nm", name = "ub", descriptor = "Lclient!vp;")
	public Class127_Sub2 aClass127_Sub2_1;

	@OriginalMember(owner = "client!nm", name = "vb", descriptor = "Z")
	private boolean aBoolean404;

	@OriginalMember(owner = "client!nm", name = "xb", descriptor = "I")
	private int anInt4075;

	@OriginalMember(owner = "client!nm", name = "yb", descriptor = "I")
	public int anInt4076;

	@OriginalMember(owner = "client!nm", name = "zb", descriptor = "Z")
	private boolean aBoolean406;

	@OriginalMember(owner = "client!nm", name = "Ab", descriptor = "I")
	private int anInt4077;

	@OriginalMember(owner = "client!nm", name = "Bb", descriptor = "Lclient!fu;")
	public Class22_Sub2 aClass22_Sub2_1;

	@OriginalMember(owner = "client!nm", name = "Cb", descriptor = "Z")
	public boolean aBoolean407;

	@OriginalMember(owner = "client!nm", name = "Db", descriptor = "Lclient!fu;")
	public Class22_Sub2 aClass22_Sub2_2;

	@OriginalMember(owner = "client!nm", name = "Gb", descriptor = "Z")
	public boolean aBoolean408;

	@OriginalMember(owner = "client!nm", name = "Hb", descriptor = "Z")
	private boolean aBoolean409;

	@OriginalMember(owner = "client!nm", name = "Jb", descriptor = "I")
	private int anInt4078;

	@OriginalMember(owner = "client!nm", name = "Kb", descriptor = "Z")
	private boolean aBoolean410;

	@OriginalMember(owner = "client!nm", name = "Mb", descriptor = "Z")
	public boolean aBoolean411;

	@OriginalMember(owner = "client!nm", name = "Ob", descriptor = "Lclient!gg;")
	public Class90 aClass90_4;

	@OriginalMember(owner = "client!nm", name = "Pb", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!nm", name = "Rb", descriptor = "Ljava/lang/String;")
	private String aString54;

	@OriginalMember(owner = "client!nm", name = "Tb", descriptor = "Lclient!fu;")
	public Class22_Sub2 aClass22_Sub2_3;

	@OriginalMember(owner = "client!nm", name = "Vb", descriptor = "Lclient!op;")
	private Class16_Sub1 aClass16_Sub1_1;

	@OriginalMember(owner = "client!nm", name = "Wb", descriptor = "Z")
	private boolean aBoolean412;

	@OriginalMember(owner = "client!nm", name = "Xb", descriptor = "Lclient!gs;")
	private Interface5 anInterface5_4;

	@OriginalMember(owner = "client!nm", name = "Yb", descriptor = "I")
	private int anInt4082;

	@OriginalMember(owner = "client!nm", name = "Zb", descriptor = "Lclient!fu;")
	public Class22_Sub2 aClass22_Sub2_4;

	@OriginalMember(owner = "client!nm", name = "ac", descriptor = "Lclient!ec;")
	private Interface3 anInterface3_5;

	@OriginalMember(owner = "client!nm", name = "bc", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!nm", name = "dc", descriptor = "Lclient!fu;")
	public Class22_Sub2 aClass22_Sub2_5;

	@OriginalMember(owner = "client!nm", name = "ec", descriptor = "Lclient!fu;")
	public Class22_Sub2 aClass22_Sub2_6;

	@OriginalMember(owner = "client!nm", name = "gc", descriptor = "I")
	private int anInt4083;

	@OriginalMember(owner = "client!nm", name = "hc", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!nm", name = "ic", descriptor = "I")
	private int anInt4084;

	@OriginalMember(owner = "client!nm", name = "kc", descriptor = "Z")
	public boolean aBoolean413;

	@OriginalMember(owner = "client!nm", name = "nc", descriptor = "F")
	private float aFloat48;

	@OriginalMember(owner = "client!nm", name = "oc", descriptor = "I")
	private int anInt4086;

	@OriginalMember(owner = "client!nm", name = "qc", descriptor = "Lclient!fu;")
	public Class22_Sub2 aClass22_Sub2_7;

	@OriginalMember(owner = "client!nm", name = "rc", descriptor = "Lclient!fu;")
	public Class22_Sub2 aClass22_Sub2_8;

	@OriginalMember(owner = "client!nm", name = "sc", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!nm", name = "uc", descriptor = "I")
	public int anInt4088;

	@OriginalMember(owner = "client!nm", name = "wc", descriptor = "Lclient!hi;")
	public Class15_Sub2 aClass15_Sub2_6;

	@OriginalMember(owner = "client!nm", name = "xc", descriptor = "I")
	private int anInt4090;

	@OriginalMember(owner = "client!nm", name = "yc", descriptor = "Lclient!up;")
	private Class15_Sub2_Sub1 aClass15_Sub2_Sub1_3;

	@OriginalMember(owner = "client!nm", name = "zc", descriptor = "Z")
	private boolean aBoolean415;

	@OriginalMember(owner = "client!nm", name = "Ac", descriptor = "Lclient!hi;")
	public Class15_Sub2 aClass15_Sub2_7;

	@OriginalMember(owner = "client!nm", name = "Bc", descriptor = "Z")
	public boolean aBoolean416;

	@OriginalMember(owner = "client!nm", name = "Fc", descriptor = "I")
	public int anInt4093;

	@OriginalMember(owner = "client!nm", name = "Ic", descriptor = "Lclient!vp;")
	public Class127_Sub2 aClass127_Sub2_2;

	@OriginalMember(owner = "client!nm", name = "Jc", descriptor = "I")
	private int anInt4096;

	@OriginalMember(owner = "client!nm", name = "Lc", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!nm", name = "Nc", descriptor = "Z")
	private boolean aBoolean418;

	@OriginalMember(owner = "client!nm", name = "Qc", descriptor = "I")
	private int anInt4098;

	@OriginalMember(owner = "client!nm", name = "Rc", descriptor = "Z")
	public boolean aBoolean419;

	@OriginalMember(owner = "client!nm", name = "Xc", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "Lclient!pb;")
	private final Class179 aClass179_1 = new Class179();

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "Lclient!mu;")
	private final Class127 aClass127_5 = new Class127_Sub2();

	@OriginalMember(owner = "client!nm", name = "C", descriptor = "[Lclient!bl;")
	private final Interface1[] anInterface1Array1 = new Interface1[4];

	@OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
	public final int anInt4061 = 8;

	@OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
	public final int anInt4065 = 3;

	@OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
	private int anInt4060 = -1;

	@OriginalMember(owner = "client!nm", name = "N", descriptor = "Z")
	private boolean aBoolean398 = false;

	@OriginalMember(owner = "client!nm", name = "H", descriptor = "Lclient!at;")
	private final Class17 aClass17_41 = new Class17();

	@OriginalMember(owner = "client!nm", name = "P", descriptor = "Lclient!at;")
	private final Class17 aClass17_42 = new Class17();

	@OriginalMember(owner = "client!nm", name = "Q", descriptor = "Lclient!at;")
	private final Class17 aClass17_43 = new Class17();

	@OriginalMember(owner = "client!nm", name = "R", descriptor = "Lclient!at;")
	private final Class17 aClass17_44 = new Class17();

	@OriginalMember(owner = "client!nm", name = "S", descriptor = "Lclient!at;")
	private final Class17 aClass17_45 = new Class17();

	@OriginalMember(owner = "client!nm", name = "T", descriptor = "Lclient!at;")
	private final Class17 aClass17_46 = new Class17();

	@OriginalMember(owner = "client!nm", name = "U", descriptor = "Lclient!at;")
	private final Class17 aClass17_47 = new Class17();

	@OriginalMember(owner = "client!nm", name = "X", descriptor = "I")
	public int anInt4067 = -1;

	@OriginalMember(owner = "client!nm", name = "Eb", descriptor = "[F")
	public final float[] aFloatArray22 = new float[4];

	@OriginalMember(owner = "client!nm", name = "mb", descriptor = "F")
	public float aFloat38 = 3584.0F;

	@OriginalMember(owner = "client!nm", name = "pb", descriptor = "I")
	public int anInt4073 = 0;

	@OriginalMember(owner = "client!nm", name = "Fb", descriptor = "[F")
	private final float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!nm", name = "mc", descriptor = "Z")
	private boolean aBoolean414 = true;

	@OriginalMember(owner = "client!nm", name = "ab", descriptor = "I")
	public int anInt4069 = 0;

	@OriginalMember(owner = "client!nm", name = "fc", descriptor = "[F")
	private final float[] aFloatArray25 = new float[16];

	@OriginalMember(owner = "client!nm", name = "Qb", descriptor = "F")
	public float aFloat44 = 1.0F;

	@OriginalMember(owner = "client!nm", name = "Lb", descriptor = "F")
	public float aFloat42 = 1.0F;

	@OriginalMember(owner = "client!nm", name = "pc", descriptor = "I")
	public int anInt4087 = -1;

	@OriginalMember(owner = "client!nm", name = "Sb", descriptor = "I")
	private int anInt4080 = 0;

	@OriginalMember(owner = "client!nm", name = "vc", descriptor = "I")
	public int anInt4089 = 3584;

	@OriginalMember(owner = "client!nm", name = "rb", descriptor = "F")
	private float aFloat40 = 1.0F;

	@OriginalMember(owner = "client!nm", name = "Nb", descriptor = "I")
	private int anInt4079 = -1;

	@OriginalMember(owner = "client!nm", name = "qb", descriptor = "I")
	public int anInt4074 = -1;

	@OriginalMember(owner = "client!nm", name = "Ec", descriptor = "I")
	public int anInt4092 = 512;

	@OriginalMember(owner = "client!nm", name = "Gc", descriptor = "I")
	private int anInt4094 = 8448;

	@OriginalMember(owner = "client!nm", name = "Ib", descriptor = "F")
	public float aFloat41 = -1.0F;

	@OriginalMember(owner = "client!nm", name = "Mc", descriptor = "F")
	public float aFloat51 = -1.0F;

	@OriginalMember(owner = "client!nm", name = "cc", descriptor = "[F")
	private final float[] aFloatArray24 = new float[4];

	@OriginalMember(owner = "client!nm", name = "gb", descriptor = "I")
	public int anInt4070 = 50;

	@OriginalMember(owner = "client!nm", name = "lc", descriptor = "F")
	private float aFloat47 = 0.0F;

	@OriginalMember(owner = "client!nm", name = "V", descriptor = "F")
	public float aFloat33 = 1.0F;

	@OriginalMember(owner = "client!nm", name = "tc", descriptor = "F")
	public float aFloat50 = 3584.0F;

	@OriginalMember(owner = "client!nm", name = "Pc", descriptor = "F")
	private float aFloat52 = 1.0F;

	@OriginalMember(owner = "client!nm", name = "nb", descriptor = "I")
	private int anInt4072 = -1;

	@OriginalMember(owner = "client!nm", name = "Oc", descriptor = "I")
	private int anInt4097 = 8448;

	@OriginalMember(owner = "client!nm", name = "Dc", descriptor = "I")
	private int anInt4091 = 0;

	@OriginalMember(owner = "client!nm", name = "Z", descriptor = "I")
	private int anInt4068 = 0;

	@OriginalMember(owner = "client!nm", name = "Hc", descriptor = "I")
	public int anInt4095 = 0;

	@OriginalMember(owner = "client!nm", name = "Uc", descriptor = "I")
	public int anInt4100 = 512;

	@OriginalMember(owner = "client!nm", name = "Tc", descriptor = "I")
	private int anInt4099 = 0;

	@OriginalMember(owner = "client!nm", name = "Vc", descriptor = "I")
	private int anInt4101 = 0;

	@OriginalMember(owner = "client!nm", name = "Kc", descriptor = "[F")
	private final float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!nm", name = "Wc", descriptor = "I")
	private int anInt4102 = 0;

	@OriginalMember(owner = "client!nm", name = "Ub", descriptor = "I")
	private int anInt4081 = 0;

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas4;

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl1;

	@OriginalMember(owner = "client!nm", name = "jc", descriptor = "I")
	public final int anInt4085;

	@OriginalMember(owner = "client!nm", name = "wb", descriptor = "Z")
	private boolean aBoolean405;

	@OriginalMember(owner = "client!nm", name = "cb", descriptor = "Z")
	public boolean aBoolean399;

	@OriginalMember(owner = "client!nm", name = "tb", descriptor = "Z")
	public boolean aBoolean403;

	@OriginalMember(owner = "client!nm", name = "fb", descriptor = "Z")
	public boolean aBoolean400;

	@OriginalMember(owner = "client!nm", name = "Cc", descriptor = "Z")
	private boolean aBoolean417;

	@OriginalMember(owner = "client!nm", name = "Sc", descriptor = "Z")
	public boolean aBoolean420;

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "Lclient!pe;")
	public final Class181 aClass181_1;

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "Lclient!l;")
	private final Class140 aClass140_1;

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "Lclient!jl;")
	private final Class120 aClass120_1;

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "Lclient!jd;")
	private final Class1_Sub20_Sub1 aClass1_Sub20_Sub1_1;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!cp;IILclient!ng;)V")
	public Class164_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class162 arg4) {
		super(arg2, arg1);
		this.aCanvas4 = arg0;
		@Pc(185) int local185 = 0;
		while (!this.aCanvas4.isShowing()) {
			if (local185++ > 5) {
				throw new RuntimeException("");
			}
			Static57.method5056(1000L);
		}
		this.aCanvas4.setIgnoreRepaint(true);
		try {
			if (Static242.aBoolean397 == null || !Static242.aBoolean397) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static242.aBoolean397 = Boolean.TRUE;
				} else {
					@Pc(219) Class112 local219 = arg4.method3262(this.getClass());
					while (local219.anInt2969 == 0) {
						Static57.method5056(100L);
					}
					if (local219.anInt2969 == 1) {
						Static242.aBoolean397 = Boolean.TRUE;
					}
				}
			}
			if (Static242.aBoolean397 == null || !Static242.aBoolean397) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas4, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method3574();
				this.anOpengl1 = this.aContext1.getGL();
				@Pc(286) int local286 = this.method3561();
				if (local286 != 0) {
					throw new RuntimeException("");
				}
				this.anInt4085 = this.aBoolean413 ? 33639 : 5121;
				@Pc(305) String local305 = this.aString53.toLowerCase();
				@Pc(309) String local309 = this.aString54.toLowerCase();
				if (local309.indexOf("radeon") != -1) {
					@Pc(316) int local316 = 0;
					@Pc(318) boolean local318 = false;
					@Pc(320) boolean local320 = false;
					@Pc(328) String[] local328 = Static88.method1335(local309.replace('/', ' '), ' ');
					for (@Pc(330) int local330 = 0; local330 < local328.length; local330++) {
						@Pc(338) String local338 = local328[local330];
						try {
							if (local338.length() > 0) {
								if (local338.charAt(0) == 'x' && local338.length() >= 3 && Static156.method2347(local338.substring(1, 3))) {
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
									if (local338.length() >= 4 && Static156.method2347(local338.substring(0, 4))) {
										local316 = Static147.method2202(local338.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(402) Exception local402) {
						}
					}
					if (!local320 && !local318) {
						if (local316 >= 7000 && local316 <= 7999) {
							this.aBoolean405 = false;
						}
						if (local316 >= 7000 && local316 <= 9250) {
							this.aBoolean399 = false;
						}
					}
					if (!local318 || local316 < 4000) {
						this.aBoolean403 = false;
					}
					this.aBoolean400 &= this.anOpengl1.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean417 = this.aBoolean405;
				}
				if (local305.contains("intel")) {
					this.aBoolean420 = false;
				}
				if (this.aBoolean405) {
					try {
						@Pc(460) int[] local460 = new int[1];
						this.anOpengl1.glGenBuffersARB(1, local460, 0);
					} catch (@Pc(468) Throwable local468) {
						throw new RuntimeException("", local468);
					}
				}
				this.method3562(this);
				this.method5359();
				this.method3579();
				new Class32(this);
				this.aClass181_1 = new Class181(this, this.anInterface2_7);
				Static133.method1962(true);
				this.aBoolean398 = true;
				this.aClass140_1 = new Class140(this);
				this.aClass120_1 = new Class120(this);
				this.aClass1_Sub20_Sub1_1 = new Class1_Sub20_Sub1(this);
				this.method3600();
				this.anOpengl1.glClear(16640);
				local185 = 0;
				while (true) {
					try {
						this.aContext1.swapBuffers();
						break;
					} catch (@Pc(533) Exception local533) {
						if (local185++ > 5) {
							throw new RuntimeException("");
						}
						Static57.method5056(100L);
					}
				}
				this.anOpengl1.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(552) Throwable local552) {
			local552.printStackTrace();
			this.method5346();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local552);
		}
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(II)V")
	public synchronized void method3560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub30 local4 = new Class1_Sub30(arg1);
		local4.aLong207 = arg0;
		this.aClass17_44.method199(local4);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I[Lclient!ma;)V")
	@Override
	public void method5355(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub27[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class1_Sub27 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static242.aFloatArray20[0] = local8.anInt3874;
			Static242.aFloatArray20[1] = local8.anInt3876;
			Static242.aFloatArray20[2] = local8.anInt3873;
			Static242.aFloatArray20[3] = 1.0F;
			this.anOpengl1.glLightfv(local12, 4611, Static242.aFloatArray20, 0);
			@Pc(44) int local44 = local8.anInt3869;
			@Pc(49) float local49 = local8.aFloat25 / 255.0F;
			Static242.aFloatArray20[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static242.aFloatArray20[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static242.aFloatArray20[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl1.glLightfv(local12, 4609, Static242.aFloatArray20, 0);
			this.anOpengl1.glLightf(local12, 4617, 1.0F / (float) (local8.anInt3868 * local8.anInt3868));
			this.anOpengl1.glEnable(local12);
		}
		while (local1 < this.anInt4102) {
			this.anOpengl1.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt4102 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "H", descriptor = "()Lclient!mu;")
	@Override
	public Class127 method5393() {
		return new Class127_Sub2();
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V")
	@Override
	public void method5326(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "()V")
	@Override
	public void method3558() {
	}

	@OriginalMember(owner = "client!nm", name = "M", descriptor = "()I")
	private int method3561() {
		@Pc(1) int local1 = 0;
		this.aString53 = this.anOpengl1.glGetString(7936);
		this.aString54 = this.anOpengl1.glGetString(7937);
		@Pc(17) String local17 = this.aString53.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl1.glGetString(7938);
		@Pc(53) String[] local53 = Static88.method1335(local45.replace('.', ' '), ' ');
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static147.method2202(local53[0]);
				@Pc(69) int local69 = Static147.method2202(local53[1]);
				this.anInt4078 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt4078 < 12) {
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
		this.anInt4093 = local116[0];
		this.anOpengl1.glGetIntegerv(34929, local116, 0);
		this.anInt4075 = local116[0];
		this.anOpengl1.glGetIntegerv(34930, local116, 0);
		this.anInt4083 = local116[0];
		if (this.anInt4093 < 2 || this.anInt4075 < 2 || this.anInt4083 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean409 = Static237.aString47 != null && Static237.aString47.startsWith("mac");
		this.aBoolean413 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean405 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean418 = this.anOpengl1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean408 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean416 = this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean399 = this.anOpengl1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean400 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean411 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean403 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean407 = false;
		this.aBoolean420 = this.anOpengl1.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!bl;)V")
	public void method3562(@OriginalArg(0) Interface1 arg0) {
		if (this.anInt4060 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt4060 >= 0) {
			this.anInterface1Array1[this.anInt4060].method3559();
		}
		this.anInterface1_1 = this.anInterface1Array1[++this.anInt4060] = arg0;
		this.anInterface1_1.method3558();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II[I[I)Lclient!us;")
	@Override
	public Class34 method5319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static408.method5206(arg3, arg2, arg0, arg1, this);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4095 = arg0;
		this.anInt4069 = arg1;
		this.anInt4100 = arg2;
		this.anInt4092 = arg3;
		this.method3610();
		this.method3599();
		if (this.anInt4098 == 3) {
			this.method3564();
		} else if (this.anInt4098 == 2) {
			this.method3622();
		}
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
	@Override
	public void method5345(@OriginalArg(0) int arg0) {
		this.method3601();
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(Z)V")
	public void method3563(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean401) {
			return;
		}
		if (arg0) {
			this.anOpengl1.glEnable(2929);
		} else {
			this.anOpengl1.glDisable(2929);
		}
		this.aBoolean401 = arg0;
		this.anInt4096 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!nm", name = "N", descriptor = "()V")
	private void method3564() {
		@Pc(11) float local11 = (float) -this.anInt4095 * this.aFloat52 / (float) this.anInt4100;
		@Pc(23) float local23 = (float) -this.anInt4069 * this.aFloat52 / (float) this.anInt4092;
		@Pc(37) float local37 = (float) (this.anInt4066 - this.anInt4095) * this.aFloat52 / (float) this.anInt4100;
		@Pc(51) float local51 = (float) (this.anInt4064 - this.anInt4069) * this.aFloat52 / (float) this.anInt4092;
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (local11 != local37 && local51 != local23) {
			this.anOpengl1.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt4070 - this.aFloat45), (double) ((float) this.anInt4089 - this.aFloat45));
		}
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!nm", name = "O", descriptor = "()V")
	private void method3565() {
		if (this.aBoolean404 && this.aBoolean419 | this.anInt4074 >= 0) {
			this.anOpengl1.glEnable(2912);
		} else {
			this.anOpengl1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "()V")
	@Override
	public void method5359() {
		this.anInt4066 = this.aCanvas4.getWidth();
		this.anInt4064 = this.aCanvas4.getHeight();
		this.anOpengl1.glViewport(this.anInt4068, this.anInt4091, this.anInt4066, this.anInt4064);
		this.method3632();
		this.method5306();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(FFFF)V")
	public void method3566(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static242.aFloatArray21[0] = arg0;
		Static242.aFloatArray21[1] = arg1;
		Static242.aFloatArray21[2] = arg2;
		Static242.aFloatArray21[3] = arg3;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static242.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(IIII)V")
	@Override
	public void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass120_1.method2573(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nm", name = "P", descriptor = "()V")
	private void method3567() {
		Static242.aFloatArray21[0] = this.aFloat41 * this.aFloat33;
		Static242.aFloatArray21[1] = this.aFloat41 * this.aFloat42;
		Static242.aFloatArray21[2] = this.aFloat41 * this.aFloat44;
		Static242.aFloatArray21[3] = 1.0F;
		this.anOpengl1.glLightfv(16384, 4609, Static242.aFloatArray21, 0);
		Static242.aFloatArray21[0] = -this.aFloat51 * this.aFloat33;
		Static242.aFloatArray21[1] = -this.aFloat51 * this.aFloat42;
		Static242.aFloatArray21[2] = -this.aFloat51 * this.aFloat44;
		Static242.aFloatArray21[3] = 1.0F;
		this.anOpengl1.glLightfv(16385, 4609, Static242.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!nm", name = "z", descriptor = "()I")
	@Override
	public int method5375() {
		@Pc(2) int local2 = this.anInt4086;
		this.anInt4086 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "()I")
	@Override
	public int method5347() {
		return this.anInt4070;
	}

	@OriginalMember(owner = "client!nm", name = "K", descriptor = "()V")
	@Override
	public void method5404() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "()I")
	@Override
	public int method3557() {
		return this.anInt4064;
	}

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "()I")
	@Override
	public int method5323() {
		return this.anInt4058 + this.anInt4063 + this.anInt4062;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!ec;")
	public Interface3 method3568(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface3) (this.aBoolean405 ? new Class19_Sub1(this, arg0, arg1, false) : new Class21_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)V")
	public void method3569(@OriginalArg(2) int arg0) {
		this.anOpengl1.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!nm", name = "C", descriptor = "()Z")
	@Override
	public boolean method5379() {
		return this.aClass140_1.method2864();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!is;[Lclient!ff;Z)Lclient!tr;")
	@Override
	public Class137 method5352(@OriginalArg(0) Class110 arg0, @OriginalArg(1) Class80[] arg1) {
		return new Class137_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)V")
	@Override
	public void method5390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4070 == arg0 && this.anInt4089 == arg1) {
			return;
		}
		this.anInt4070 = arg0;
		this.anInt4089 = arg1;
		this.method3610();
		this.method3588();
		if (this.anInt4098 == 3) {
			this.method3564();
		} else if (this.anInt4098 == 2) {
			this.method3622();
		}
	}

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "(II)V")
	public void method3570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4068 = arg0;
		this.anInt4091 = arg1;
		this.anOpengl1.glViewport(arg0, arg1, this.anInt4066, this.anInt4064);
		this.method3576();
	}

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "()F")
	@Override
	public float method5333() {
		return this.aFloat45;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method5354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass15_Sub2_Sub1_3 == null || this.aClass15_Sub2_Sub1_3.anInt5853 < arg2 || this.aClass15_Sub2_Sub1_3.anInt5854 < arg3) {
			this.aClass15_Sub2_Sub1_3 = Static406.method5044(arg6, arg2, this, arg3);
			this.aClass15_Sub2_Sub1_3.method5042(false, false);
			local32 = this.aClass15_Sub2_Sub1_3.aFloat66;
			local36 = this.aClass15_Sub2_Sub1_3.aFloat65;
		} else {
			this.aClass15_Sub2_Sub1_3.method5040(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass15_Sub2_Sub1_3.aFloat66 * (float) arg3 / (float) this.aClass15_Sub2_Sub1_3.anInt5854;
			local36 = this.aClass15_Sub2_Sub1_3.aFloat65 * (float) arg2 / (float) this.aClass15_Sub2_Sub1_3.anInt5853;
		}
		this.method3623();
		this.method3603(this.aClass15_Sub2_Sub1_3);
		this.method3607(arg8);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method3627(arg5);
		this.method3629(34165, 34165);
		this.method3571(0, 34166, 768);
		this.method3571(2, 5890, 770);
		this.method3612(0, 34166);
		this.method3612(2, 5890);
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
		this.method3571(0, 5890, 768);
		this.method3571(2, 34166, 770);
		this.method3612(0, 5890);
		this.method3612(2, 34166);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(III)V")
	public void method3571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)V")
	@Override
	public void method5377(@OriginalArg(0) int arg0) {
		this.method3574();
	}

	@OriginalMember(owner = "client!nm", name = "Q", descriptor = "()V")
	private void method3572() {
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl1.glMultMatrixf(this.aClass127_Sub2_2.method5280(), 0);
		this.method3573();
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(IIIII)V")
	@Override
	public void method5392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3583();
		this.method3607(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!nm", name = "R", descriptor = "()V")
	public void method3573() {
		this.anOpengl1.glLightfv(16384, 4611, this.aFloatArray22, 0);
		this.anOpengl1.glLightfv(16385, 4611, this.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!nm", name = "S", descriptor = "()V")
	private void method3574() {
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
			Static57.method5056(1000L);
		}
	}

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "(I)I")
	public int method3575(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!nm", name = "T", descriptor = "()V")
	private void method3576() {
		if (this.anInt4080 <= this.anInt4101 && this.anInt4081 <= this.anInt4099) {
			this.anOpengl1.glScissor(this.anInt4068 + this.anInt4080, this.anInt4091 + this.anInt4064 - this.anInt4099, this.anInt4101 - this.anInt4080, this.anInt4099 - this.anInt4081);
		} else {
			this.anOpengl1.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V")
	@Override
	public void method5366(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(FFF)V")
	private void method3577(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl1.glMatrixMode(5890);
		if (this.aBoolean402) {
			this.anOpengl1.glLoadIdentity();
		}
		this.anOpengl1.glTranslatef(arg0, arg1, arg2);
		this.anOpengl1.glMatrixMode(5888);
		this.aBoolean402 = true;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)V")
	public void method3578(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3616(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!nm", name = "U", descriptor = "()V")
	private void method3579() {
		this.aClass127_Sub2_2 = new Class127_Sub2();
		this.aClass127_Sub2_1 = new Class127_Sub2();
		this.aClass15Array1 = new Class15[this.anInt4093];
		this.aClass15_Sub2_6 = new Class15_Sub2(this, 3553, 6408, 1, 1);
		this.aClass15_Sub2_5 = new Class15_Sub2(this, 3553, 6408, 1, 1);
		this.aClass15_Sub2_7 = new Class15_Sub2(this, 3553, 6408, 1, 1);
		this.aClass22_Sub2_8 = new Class22_Sub2(this);
		this.aClass22_Sub2_4 = new Class22_Sub2(this);
		this.aClass22_Sub2_1 = new Class22_Sub2(this);
		this.aClass22_Sub2_3 = new Class22_Sub2(this);
		this.aClass22_Sub2_7 = new Class22_Sub2(this);
		this.aClass22_Sub2_6 = new Class22_Sub2(this);
		this.aClass22_Sub2_5 = new Class22_Sub2(this);
		this.aClass22_Sub2_2 = new Class22_Sub2(this);
		if (this.aBoolean420) {
			this.aClass90_4 = new Class90(this);
		}
		this.aClass179_1.method4031(this);
	}

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "()V")
	@Override
	protected void method5346() {
		if (this.anOpengl1 != null) {
			try {
				this.aClass120_1.method2579();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl1 = null;
		}
		if (this.aContext1 != null) {
			this.method3601();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean398) {
			Static70.method1141(true);
			this.aBoolean398 = false;
		}
	}

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "()V")
	@Override
	public void method5324() {
		this.aClass140_1.method2863(false, false, 0);
		this.aBoolean419 = false;
		this.method3588();
		this.method3565();
	}

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "(I)I")
	public int method3580(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method5388(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt4072 != arg0;
		if (local7 || this.aFloat41 != arg1 || this.aFloat51 != arg2) {
			this.anInt4072 = arg0;
			this.aFloat41 = arg1;
			this.aFloat51 = arg2;
			if (local7) {
				this.aFloat33 = (float) (this.anInt4072 & 0xFF0000) / 1.671168E7F;
				this.aFloat42 = (float) (this.anInt4072 & 0xFFFF) / 65535.0F;
				this.aFloat44 = (float) (this.anInt4072 & 0xFF) / 255.0F;
				this.method3628();
			}
			this.method3567();
		}
		if (this.aFloatArray26[0] == arg3 && this.aFloatArray26[1] == arg4 && this.aFloatArray26[2] == arg5) {
			return;
		}
		this.aFloatArray26[0] = arg3;
		this.aFloatArray26[1] = arg4;
		this.aFloatArray26[2] = arg5;
		this.aFloatArray23[0] = -arg3;
		this.aFloatArray23[1] = -arg4;
		this.aFloatArray23[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray22[0] = arg3 * local132;
		this.aFloatArray22[1] = arg4 * local132;
		this.aFloatArray22[2] = arg5 * local132;
		this.aFloatArray24[0] = -this.aFloatArray22[0];
		this.aFloatArray24[1] = -this.aFloatArray22[1];
		this.aFloatArray24[2] = -this.aFloatArray22[2];
		this.method3573();
		this.anInt4088 = (int) (arg3 * 256.0F / arg4);
		this.anInt4076 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II[[I[[IIII)Lclient!cl;")
	@Override
	public Class42 method5403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class42_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "(IIII)V")
	@Override
	public void method5383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean419) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt4079 = arg1;
		this.anInt4087 = arg2;
		this.anInt4073 = arg3;
		this.method3588();
		this.aClass140_1.method2865(true, arg0);
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(II)I")
	@Override
	public int method5396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "()I")
	@Override
	public int method5348() {
		return this.anInt4089;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!ns;Lclient!im;Lclient!mu;Lclient!ro;I)V")
	@Override
	public void method5365(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class108 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) Class41_Sub5 arg3) {
		arg0.method1565(arg2, arg3, 0);
		this.method5315(arg1);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!mu;)V")
	@Override
	public void method5357(@OriginalArg(0) Class127 arg0) {
		this.aClass127_Sub2_2 = (Class127_Sub2) arg0;
		this.aClass127_Sub2_1.method5279(this.aClass127_Sub2_2);
		if (this.anInt4098 != 1) {
			this.method3572();
		}
	}

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "(IIII)V")
	@Override
	public void method5385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4080 < arg0) {
			this.anInt4080 = arg0;
		}
		if (this.anInt4101 > arg2) {
			this.anInt4101 = arg2;
		}
		if (this.anInt4081 < arg1) {
			this.anInt4081 = arg1;
		}
		if (this.anInt4099 > arg3) {
			this.anInt4099 = arg3;
		}
		this.anOpengl1.glEnable(3089);
		this.method3599();
		this.method3576();
	}

	@OriginalMember(owner = "client!nm", name = "E", descriptor = "()Z")
	@Override
	public boolean method5384() {
		return true;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!ku;)V")
	@Override
	public void method5374(@OriginalArg(0) Class1_Sub23 arg0) {
	}

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "()Z")
	@Override
	public boolean method5328() {
		return false;
	}

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "()Z")
	@Override
	public boolean method5309() {
		return true;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([IIIII)Lclient!dp;")
	@Override
	public Class51 method5349(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class51_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "()Z")
	@Override
	public boolean method5308() {
		return !this.aBoolean409;
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(Z)V")
	public void method3581(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean412) {
			this.aBoolean412 = arg0;
			this.method3596();
			this.anInt4096 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "()F")
	@Override
	public float method5338() {
		return this.aFloat46;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5322(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILclient!us;II)V")
	@Override
	public void method5312(@OriginalArg(1) Class34 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class34_Sub2 local2 = (Class34_Sub2) arg0;
		@Pc(5) Class15_Sub2_Sub1 local5 = local2.aClass15_Sub2_Sub1_5;
		this.method3623();
		this.method3603(local2.aClass15_Sub2_Sub1_5);
		this.method3607(1);
		this.method3629(7681, 8448);
		this.method3571(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat65 / (float) local5.anInt5857;
		@Pc(37) float local37 = local5.aFloat66 / (float) local5.anInt5856;
		this.anOpengl1.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt4080 - arg1), local37 * (float) (this.anInt4081 - arg2));
		this.anOpengl1.glVertex2i(this.anInt4080, this.anInt4081);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt4080 - arg1), local37 * (float) (this.anInt4099 - arg2));
		this.anOpengl1.glVertex2i(this.anInt4080, this.anInt4099);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt4101 - arg1), local37 * (float) (this.anInt4099 - arg2));
		this.anOpengl1.glVertex2i(this.anInt4101, this.anInt4099);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt4101 - arg1), local37 * (float) (this.anInt4081 - arg2));
		this.anOpengl1.glVertex2i(this.anInt4101, this.anInt4081);
		this.anOpengl1.glEnd();
		this.method3571(0, 5890, 768);
	}

	@OriginalMember(owner = "client!nm", name = "V", descriptor = "()V")
	public void method3582() {
		if (this.anInt4096 == 8) {
			return;
		}
		this.method3589();
		this.method3602(true);
		this.method3563(true);
		this.method3606(true);
		this.method3607(1);
		this.method3586(1);
		this.anInt4096 = 8;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)Lclient!ku;")
	@Override
	public Class1_Sub23 method5318() {
		return null;
	}

	@OriginalMember(owner = "client!nm", name = "W", descriptor = "()V")
	private void method3583() {
		if (this.anInt4096 == 1) {
			return;
		}
		this.method3608();
		this.method3602(false);
		this.method3581(false);
		this.method3563(false);
		this.method3606(false);
		this.method3603(null);
		this.method3630();
		this.method3586(0);
		this.anInt4096 = 1;
	}

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "(I)V")
	public void method3584(@OriginalArg(0) int arg0) {
		if (this.anInt4077 != arg0) {
			this.anOpengl1.glActiveTexture(arg0 + 33984);
			this.anInt4077 = arg0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "X", descriptor = "()V")
	private void method3585() {
		if (this.aBoolean402) {
			this.anOpengl1.glMatrixMode(5890);
			this.anOpengl1.glLoadIdentity();
			this.anOpengl1.glMatrixMode(5888);
			this.aBoolean402 = false;
		}
	}

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "(I)V")
	public void method3586(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3629(7681, 7681);
		} else if (arg0 == 1) {
			this.method3629(8448, 8448);
		} else if (arg0 == 2) {
			this.method3629(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!nm", name = "Y", descriptor = "()V")
	public void method3587() {
		if (this.anInt4096 == 4) {
			return;
		}
		this.method3608();
		this.method3602(false);
		this.method3581(false);
		this.method3563(false);
		this.method3606(false);
		this.method3630();
		this.method3607(1);
		this.method3586(1);
		this.anInt4096 = 4;
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "()Z")
	@Override
	public boolean method5304() {
		return true;
	}

	@OriginalMember(owner = "client!nm", name = "Z", descriptor = "()V")
	private void method3588() {
		@Pc(15) int local15;
		if (this.aBoolean419) {
			this.anOpengl1.glFogf(2915, 0.0F);
			this.anOpengl1.glFogf(2916, 1.0F);
			local15 = this.anInt4079;
		} else {
			this.aFloat48 = (float) (this.anInt4089 - 256) - this.aFloat47;
			this.aFloat43 = this.aFloat48 - (float) this.anInt4074 * this.aFloat40;
			if (this.aFloat43 < (float) this.anInt4070) {
				this.aFloat43 = this.anInt4070;
			}
			this.anOpengl1.glFogf(2915, this.aFloat43);
			this.anOpengl1.glFogf(2916, this.aFloat48);
			local15 = this.anInt4067;
		}
		Static242.aFloatArray21[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static242.aFloatArray21[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static242.aFloatArray21[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl1.glFogfv(2918, Static242.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([Lclient!ns;Lclient!mu;[Lclient!ro;I)V")
	@Override
	public void method5370(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class41_Sub5[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method1565(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "ab", descriptor = "()V")
	public void method3589() {
		if (this.anInt4098 != 2) {
			this.anInt4098 = 2;
			this.method3622();
			this.method3572();
			this.anInt4096 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V")
	@Override
	public void method5361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4067 == arg0 && this.anInt4074 == arg1) {
			return;
		}
		this.anInt4067 = arg0;
		this.anInt4074 = arg1;
		if (!this.aBoolean419) {
			this.method3588();
			this.method3565();
		}
	}

	@OriginalMember(owner = "client!nm", name = "bb", descriptor = "()V")
	private void method3590() {
		if (this.aFloat45 == 0.0F) {
			this.aFloatArray25[10] = this.aFloat36;
			this.aFloatArray25[14] = this.aFloat34;
		} else {
			@Pc(13) float local13 = this.aFloat46 / (this.aFloat45 + this.aFloat46);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat34 * (1.0F - local13) * (1.0F - local13) / this.aFloat45;
			this.aFloatArray25[10] = this.aFloat36 + local32;
			this.aFloatArray25[14] = this.aFloat34 * local17;
		}
		this.aFloat50 = (this.aFloatArray25[14] - (float) this.anInt4089) / this.aFloatArray25[10];
		this.aFloat38 = (float) this.anInt4089 - this.aFloat45;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass127_Sub2_2.aFloat68 * (float) arg0 + this.aClass127_Sub2_2.aFloat69 * (float) arg1 + this.aClass127_Sub2_2.aFloat77 * (float) arg2 + this.aClass127_Sub2_2.aFloat70;
		if (local24 < (float) this.anInt4070 || local24 > (float) this.anInt4089) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt4100 * (this.aClass127_Sub2_2.aFloat71 * (float) arg0 + this.aClass127_Sub2_2.aFloat67 * (float) arg1 + this.aClass127_Sub2_2.aFloat72 * (float) arg2 + this.aClass127_Sub2_2.aFloat76) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt4092 * (this.aClass127_Sub2_2.aFloat74 * (float) arg0 + this.aClass127_Sub2_2.aFloat75 * (float) arg1 + this.aClass127_Sub2_2.aFloat73 * (float) arg2 + this.aClass127_Sub2_2.aFloat78) / local24);
		if ((float) local81 >= this.aFloat49 && (float) local81 <= this.aFloat37 && (float) local113 >= this.aFloat39 && (float) local113 <= this.aFloat35) {
			arg3[0] = (int) ((float) local81 - this.aFloat49);
			arg3[1] = (int) ((float) local113 - this.aFloat39);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!nm", name = "cb", descriptor = "()Lclient!bl;")
	public Interface1 method3591() {
		return this.anInterface1_1;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V")
	@Override
	public void method5307(@OriginalArg(0) boolean arg0) {
		this.aBoolean414 = arg0;
		this.method3613();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!ff;Z)Lclient!dp;")
	@Override
	public Class51 method5360(@OriginalArg(0) Class80 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt1753 * arg0.anInt1751];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray34 == null) {
			for (local15 = 0; local15 < arg0.anInt1751; local15++) {
				for (local21 = 0; local21 < arg0.anInt1753; local21++) {
					@Pc(74) int local74 = arg0.anIntArray225[arg0.aByteArray33[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt1751; local15++) {
				for (local21 = 0; local21 < arg0.anInt1753; local21++) {
					local6[local10++] = arg0.aByteArray34[local8] << 24 | arg0.anIntArray225[arg0.aByteArray33[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class51 local100 = this.method5349(local6, arg0.anInt1753, arg0.anInt1753, arg0.anInt1751);
		local100.method4672(arg0.anInt1752, arg0.anInt1748, arg0.anInt1749, arg0.anInt1750);
		return local100;
	}

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "()Z")
	@Override
	public boolean method5336() {
		return false;
	}

	@OriginalMember(owner = "client!nm", name = "G", descriptor = "()Z")
	@Override
	public boolean method5389() {
		return false;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!vn;IIII)Lclient!ns;")
	@Override
	public Class22 method5368(@OriginalArg(0) Class238 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class22_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "(I)I")
	public int method3592(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method3583();
		this.method3607(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean418) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local19);
		this.anOpengl1.glVertex2f(local14, local19);
		this.anOpengl1.glVertex2f(local14, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean418) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "(Z)V")
	public void method3593(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.lb) {
			this.lb = arg0;
			this.method3596();
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I[BIZ)Lclient!ec;")
	public Interface3 method3594(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface3) (this.aBoolean405 && (!arg3 || this.aBoolean417) ? new Class19_Sub1(this, arg0, arg1, arg2, arg3) : new Class21_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!nm", name = "db", descriptor = "()V")
	private void method3595() {
		if (this.anInt4098 != 3) {
			this.anInt4098 = 3;
			this.method3564();
			this.method3572();
			this.anInt4096 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!nm", name = "eb", descriptor = "()V")
	private void method3596() {
		if (this.aBoolean412 && !this.lb) {
			this.anOpengl1.glEnable(2896);
		} else {
			this.anOpengl1.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(Z)V")
	@Override
	public void method5340(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "()V")
	@Override
	public void method5303() {
		if (this.anInt4066 <= 0 && this.anInt4064 <= 0) {
			return;
		}
		@Pc(9) int local9 = this.anInt4080;
		@Pc(12) int local12 = this.anInt4101;
		@Pc(15) int local15 = this.anInt4081;
		@Pc(18) int local18 = this.anInt4099;
		this.method5306();
		this.anOpengl1.glReadBuffer(1028);
		this.anOpengl1.glDrawBuffer(1029);
		this.method3632();
		this.method3602(false);
		this.method3581(false);
		this.method3563(false);
		this.method3606(false);
		this.method3603(null);
		this.method3630();
		this.method3586(0);
		this.method3607(0);
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRasterPos2i(0, 0);
		this.anOpengl1.glCopyPixels(0, 0, this.anInt4066, this.anInt4064, 6144);
		this.anOpengl1.glFlush();
		this.anOpengl1.glReadBuffer(1029);
		this.anOpengl1.glDrawBuffer(1029);
		this.method5313(local9, local15, local12, local18);
	}

	@OriginalMember(owner = "client!nm", name = "fb", descriptor = "()V")
	public void method3597() {
		this.anOpengl1.glPopMatrix();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!vp;)V")
	public void method3598(@OriginalArg(0) Class127_Sub2 arg0) {
		this.anOpengl1.glPushMatrix();
		this.anOpengl1.glMultMatrixf(arg0.method5280(), 0);
	}

	@OriginalMember(owner = "client!nm", name = "gb", descriptor = "()V")
	private void method3599() {
		this.aFloat49 = this.anInt4080 - this.anInt4095;
		this.aFloat37 = this.anInt4101 - this.anInt4095;
		this.aFloat39 = this.anInt4081 - this.anInt4069;
		this.aFloat35 = this.anInt4099 - this.anInt4069;
	}

	@OriginalMember(owner = "client!nm", name = "hb", descriptor = "()V")
	private void method3600() {
		this.method3630();
		for (@Pc(7) int local7 = this.anInt4093 - 1; local7 >= 0; local7--) {
			this.method3584(local7);
			this.method3603(null);
			this.anOpengl1.glTexEnvi(8960, 8704, 34160);
		}
		this.method3629(8448, 8448);
		this.method3571(2, 34168, 770);
		this.method3585();
		this.anInt4084 = 1;
		this.anOpengl1.glEnable(3042);
		this.anOpengl1.glBlendFunc(770, 771);
		this.anInt4090 = 1;
		this.anOpengl1.glEnable(3008);
		this.anOpengl1.glAlphaFunc(516, 0.0F);
		this.aBoolean415 = true;
		this.anOpengl1.glColorMask(true, true, true, true);
		this.aBoolean410 = true;
		this.method3602(true);
		this.method3581(true);
		this.method3563(true);
		this.method3606(true);
		this.method3632();
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
		this.anInt4072 = this.anInt4067 = -1;
		this.method5306();
	}

	@OriginalMember(owner = "client!nm", name = "ib", descriptor = "()V")
	private void method3601() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(IIIIII)Z")
	@Override
	public boolean method5380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass127_Sub2_2.aFloat68 * (float) arg0 + this.aClass127_Sub2_2.aFloat69 * (float) arg1 + this.aClass127_Sub2_2.aFloat77 * (float) arg2 + this.aClass127_Sub2_2.aFloat70;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass127_Sub2_2.aFloat68 * (float) arg3 + this.aClass127_Sub2_2.aFloat69 * (float) arg4 + this.aClass127_Sub2_2.aFloat77 * (float) arg5 + this.aClass127_Sub2_2.aFloat70;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt4070 && local55 < (float) this.anInt4070 || !(!(local24 > (float) this.anInt4089) || !(local55 > (float) this.anInt4089))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt4100 * (this.aClass127_Sub2_2.aFloat71 * (float) arg0 + this.aClass127_Sub2_2.aFloat67 * (float) arg1 + this.aClass127_Sub2_2.aFloat72 * (float) arg2 + this.aClass127_Sub2_2.aFloat76) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt4100 * (this.aClass127_Sub2_2.aFloat71 * (float) arg3 + this.aClass127_Sub2_2.aFloat67 * (float) arg4 + this.aClass127_Sub2_2.aFloat72 * (float) arg5 + this.aClass127_Sub2_2.aFloat76) / local55);
		if ((float) local119 < this.aFloat49 && (float) local151 < this.aFloat49 || (float) local119 > this.aFloat37 && (float) local151 > this.aFloat37) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt4092 * (this.aClass127_Sub2_2.aFloat74 * (float) arg0 + this.aClass127_Sub2_2.aFloat75 * (float) arg1 + this.aClass127_Sub2_2.aFloat73 * (float) arg2 + this.aClass127_Sub2_2.aFloat78) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt4092 * (this.aClass127_Sub2_2.aFloat74 * (float) arg3 + this.aClass127_Sub2_2.aFloat75 * (float) arg4 + this.aClass127_Sub2_2.aFloat73 * (float) arg5 + this.aClass127_Sub2_2.aFloat78) / local55);
			return (!((float) local209 < this.aFloat39) || !((float) local241 < this.aFloat39)) && (!((float) local209 > this.aFloat35) || !((float) local241 > this.aFloat35));
		}
	}

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "(Z)V")
	public void method3602(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean404) {
			this.aBoolean404 = arg0;
			this.method3565();
			this.anInt4096 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "L", descriptor = "()Z")
	@Override
	public boolean method5405() {
		if (!this.aClass1_Sub20_Sub1_1.method2492()) {
			if (!this.aClass120_1.method2577(this.aClass1_Sub20_Sub1_1)) {
				return false;
			}
			this.aClass181_1.method4060();
		}
		return true;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!ap;)V")
	public void method3603(@OriginalArg(0) Class15 arg0) {
		@Pc(5) Class15 local5 = this.aClass15Array1[this.anInt4077];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl1.glDisable(local5.anInt6388);
			} else {
				if (local5 == null) {
					this.anOpengl1.glEnable(arg0.anInt6388);
				} else if (arg0.anInt6388 != local5.anInt6388) {
					this.anOpengl1.glDisable(local5.anInt6388);
					this.anOpengl1.glEnable(arg0.anInt6388);
				}
				this.anOpengl1.glBindTexture(arg0.anInt6388, arg0.method5561());
			}
			this.aClass15Array1[this.anInt4077] = arg0;
		}
		this.anInt4096 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "(II)V")
	public synchronized void method3604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub30 local4 = new Class1_Sub30(arg1);
		local4.aLong207 = arg0;
		this.aClass17_42.method199(local4);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!gs;)V")
	public void method3605(@OriginalArg(0) Interface5 arg0) {
		if (this.anInterface5_4 != arg0 && this.aBoolean405) {
			this.anOpengl1.glBindBufferARB(34963, arg0.method3103());
			this.anInterface5_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "()Z")
	@Override
	public boolean method5327() {
		return this.aBoolean418;
	}

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method5382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method3583();
		this.method3607(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean418) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local23);
		this.anOpengl1.glVertex2f(local16, local23);
		this.anOpengl1.glVertex2f(local16, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean418) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "()V")
	@Override
	public void method5305() {
		if (this.aClass1_Sub20_Sub1_1.method2492()) {
			this.aClass120_1.method2574(this.aClass1_Sub20_Sub1_1);
			this.aClass181_1.method4060();
		}
	}

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "()Z")
	@Override
	public boolean method5317() {
		return this.aClass1_Sub20_Sub1_1.method2492();
	}

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "(Z)V")
	public void method3606(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean406) {
			this.aBoolean406 = arg0;
			this.method3613();
			this.anInt4096 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "(I)V")
	public void method3607(@OriginalArg(0) int arg0) {
		if (this.anInt4084 == arg0) {
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
		if (local10 != this.aBoolean410) {
			this.anOpengl1.glColorMask(local10, local10, local10, true);
			this.aBoolean410 = local10;
		}
		if (local12 != this.aBoolean415) {
			if (local12) {
				this.anOpengl1.glEnable(3008);
			} else {
				this.anOpengl1.glDisable(3008);
			}
			this.aBoolean415 = local12;
		}
		if (local8 != this.anInt4090) {
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
			this.anInt4090 = local8;
		}
		this.anInt4084 = arg0;
		this.anInt4096 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!nm", name = "jb", descriptor = "()V")
	private void method3608() {
		if (this.anInt4098 == 1) {
			return;
		}
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (this.anInt4066 > 0 && this.anInt4064 > 0) {
			this.anOpengl1.glOrtho(0.0D, (double) this.anInt4066, (double) this.anInt4064, 0.0D, -1.0D, 1.0D);
		}
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anInt4098 = 1;
		this.anInt4096 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!nm", name = "J", descriptor = "()V")
	@Override
	public void method5400() {
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(Lclient!bl;)V")
	public void method3609(@OriginalArg(0) Interface1 arg0) {
		if (this.anInt4060 < 0 || this.anInterface1Array1[this.anInt4060] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface1Array1[this.anInt4060--] = null;
		arg0.method3559();
		if (this.anInt4060 >= 0) {
			this.anInterface1_1 = this.anInterface1Array1[this.anInt4060];
			this.anInterface1_1.method3558();
		}
	}

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "()I")
	@Override
	public int method5372() {
		@Pc(2) int local2 = this.anInt4071;
		this.anInt4071 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "()Z")
	@Override
	public boolean method5369() {
		return true;
	}

	@OriginalMember(owner = "client!nm", name = "kb", descriptor = "()V")
	private void method3610() {
		@Pc(2) float[] local2 = this.aFloatArray25;
		@Pc(14) float local14 = (float) (-this.anInt4095 * this.anInt4070) / (float) this.anInt4100;
		@Pc(28) float local28 = (float) ((this.anInt4066 - this.anInt4095) * this.anInt4070) / (float) this.anInt4100;
		@Pc(39) float local39 = (float) (this.anInt4069 * this.anInt4070) / (float) this.anInt4092;
		@Pc(53) float local53 = (float) ((this.anInt4069 - this.anInt4064) * this.anInt4070) / (float) this.anInt4092;
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
			@Pc(67) float local67 = (float) this.anInt4070 * 2.0F;
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
			local2[10] = this.aFloat36 = (float) -(this.anInt4089 + this.anInt4070) / (float) (this.anInt4089 - this.anInt4070);
			local2[11] = -1.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = this.aFloat34 = -(local67 * (float) this.anInt4089) / (float) (this.anInt4089 - this.anInt4070);
			local2[15] = 0.0F;
		}
		this.method3590();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!ec;)V")
	public void method3611(@OriginalArg(0) Interface3 arg0) {
		if (this.anInterface3_5 != arg0 && this.aBoolean405) {
			this.anOpengl1.glBindBufferARB(34962, arg0.method3103());
			this.anInterface3_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method5363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3583();
		this.method3607(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!nm", name = "A", descriptor = "()V")
	@Override
	public void method5376() {
		this.method3606(true);
		this.anOpengl1.glClear(256);
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(III)V")
	public void method3612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(FF)V")
	@Override
	public void method5314(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat46 && arg1 == this.aFloat45) {
			return;
		}
		this.aFloat46 = arg0;
		this.aFloat45 = arg1;
		this.method3590();
		if (this.anInt4098 == 3) {
			this.method3564();
		} else if (this.anInt4098 == 2) {
			this.method3622();
		}
	}

	@OriginalMember(owner = "client!nm", name = "I", descriptor = "()Z")
	@Override
	public boolean method5394() {
		return true;
	}

	@OriginalMember(owner = "client!nm", name = "lb", descriptor = "()V")
	private void method3613() {
		this.anOpengl1.glDepthMask(this.aBoolean406 && this.aBoolean414);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!im;)V")
	@Override
	public void method5315(@OriginalArg(0) Class108 arg0) {
		this.aClass179_1.method4034(this, arg0);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!gs;III)V")
	public void method3614(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3605(arg0);
		arg0.method3104(arg1, arg2);
	}

	@OriginalMember(owner = "client!nm", name = "mb", descriptor = "()V")
	public void method3615() {
		if (this.anInt4096 == 16) {
			return;
		}
		this.method3595();
		this.method3602(true);
		this.method3563(true);
		this.method3606(true);
		this.method3607(1);
		this.method3586(1);
		this.anInt4096 = 16;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZZ)V")
	public void method3616(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt4082) {
			if (arg0 < 0) {
				this.method3585();
				this.method3603(null);
				if (!this.aBoolean419) {
					this.aClass140_1.method2863(arg2, arg1, 0);
				}
			} else {
				@Pc(11) Class15_Sub2 local11 = this.aClass181_1.method4059(arg0);
				@Pc(17) Class98 local17 = this.anInterface2_7.method4741(arg0);
				if (local17.aByte29 == 0 && local17.aByte27 == 0) {
					this.method3585();
				} else {
					@Pc(30) int local30 = local17.aBoolean193 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method3577((float) (this.anInt4059 % local34 * local17.aByte29) / (float) local34, (float) (this.anInt4059 % local34 * local17.aByte27) / (float) local34, 0.0F);
				}
				if (this.aBoolean419) {
					this.aClass140_1.method2863(arg2, arg1, 3);
					this.method3603(local11);
				} else {
					this.aClass140_1.method2863(arg2, arg1, local17.aByte33);
					this.aClass140_1.method2865(false, local17.aByte32);
					if (!this.aClass140_1.method2866(local11)) {
						this.method3603(local11);
					}
				}
			}
			this.anInt4082 = arg0;
		}
		this.anInt4096 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!nm", name = "D", descriptor = "()Z")
	@Override
	public boolean method5381() {
		return true;
	}

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "(I)V")
	public synchronized void method3617(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub30 local4 = new Class1_Sub30(arg0);
		this.aClass17_46.method199(local4);
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5367(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class1_Sub30 local16;
		while (!this.aClass17_42.method204()) {
			local16 = (Class1_Sub30) this.aClass17_42.method203();
			Static242.anIntArray509[local1++] = (int) local16.aLong207;
			this.anInt4058 -= local16.anInt3799;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteBuffersARB(local1, Static242.anIntArray509, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteBuffersARB(local1, Static242.anIntArray509, 0);
			local1 = 0;
		}
		while (!this.aClass17_43.method204()) {
			local16 = (Class1_Sub30) this.aClass17_43.method203();
			Static242.anIntArray509[local1++] = (int) local16.aLong207;
			this.anInt4063 -= local16.anInt3799;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteTextures(local1, Static242.anIntArray509, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteTextures(local1, Static242.anIntArray509, 0);
			local1 = 0;
		}
		while (!this.aClass17_44.method204()) {
			local16 = (Class1_Sub30) this.aClass17_44.method203();
			Static242.anIntArray509[local1++] = local16.anInt3799;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteFramebuffersEXT(local1, Static242.anIntArray509, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteFramebuffersEXT(local1, Static242.anIntArray509, 0);
			local1 = 0;
		}
		while (!this.aClass17_45.method204()) {
			local16 = (Class1_Sub30) this.aClass17_45.method203();
			Static242.anIntArray509[local1++] = (int) local16.aLong207;
			this.anInt4062 -= local16.anInt3799;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static242.anIntArray509, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static242.anIntArray509, 0);
			local1 = 0;
		}
		while (!this.aClass17_46.method204()) {
			local16 = (Class1_Sub30) this.aClass17_46.method203();
			Static242.anIntArray509[local1++] = (int) local16.aLong207;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteProgramsARB(local1, Static242.anIntArray509, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteProgramsARB(local1, Static242.anIntArray509, 0);
		}
		while (!this.aClass17_41.method204()) {
			local16 = (Class1_Sub30) this.aClass17_41.method203();
			this.anOpengl1.glDeleteLists((int) local16.aLong207, local16.anInt3799);
		}
		while (!this.aClass17_47.method204()) {
			local16 = (Class1_Sub30) this.aClass17_47.method203();
			this.anOpengl1.glDeleteObjectARB(local16.anInt3799);
		}
		while (!this.aClass17_41.method204()) {
			local16 = (Class1_Sub30) this.aClass17_41.method203();
			this.anOpengl1.glDeleteLists((int) local16.aLong207, local16.anInt3799);
		}
		if (this.method5323() > 100663296 && Static378.method5293() > this.aLong135 + 60000L) {
			System.gc();
			this.aLong135 = Static378.method5293();
		}
		this.anInt4059 = local5;
	}

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "(I)V")
	@Override
	public void method5402(@OriginalArg(0) int arg0) {
		this.method3607(0);
		this.anOpengl1.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl1.glClear(16384);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!as;)V")
	@Override
	public void method5311(@OriginalArg(0) Class16 arg0) {
		this.aClass16_Sub1_1 = (Class16_Sub1) arg0;
	}

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "(I)V")
	public synchronized void method3618(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub30 local4 = new Class1_Sub30(arg0);
		this.aClass17_44.method199(local4);
	}

	@OriginalMember(owner = "client!nm", name = "F", descriptor = "()V")
	@Override
	public void method5386() {
		this.aClass120_1.method2576();
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(F)V")
	public void method3619(@OriginalArg(0) float arg0) {
		if (this.aFloat52 != arg0) {
			this.aFloat52 = arg0;
			if (this.anInt4098 == 3) {
				this.method3564();
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "()Z")
	@Override
	public boolean method5341() {
		return this.aClass1_Sub20_Sub1_1.method2500();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5344() {
	}

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "()V")
	@Override
	public void method5306() {
		this.anInt4080 = 0;
		this.anInt4081 = 0;
		this.anInt4101 = this.anInt4066;
		this.anInt4099 = this.anInt4064;
		this.anOpengl1.glDisable(3089);
		this.method3599();
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I[BIZ)Lclient!gs;")
	public Interface5 method3620(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface5) (this.aBoolean405 && (!arg2 || this.aBoolean417) ? new Class19_Sub2(this, 5123, arg0, arg1, arg2) : new Class21_Sub1(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!nm", name = "nb", descriptor = "()Lclient!cd;")
	public Class15_Sub1 method3621() {
		return this.aClass16_Sub1_1 == null ? null : this.aClass16_Sub1_1.method2857();
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(IIIIII)Lclient!as;")
	@Override
	public Class16 method5325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean411 ? new Class16_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(IIII)[I")
	@Override
	public int[] method5373() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl1.glReadPixels(0, this.anInt4064 - local6, 36, 1, 32993, this.anInt4085, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([I)V")
	@Override
	public void method5353(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4080;
		arg0[1] = this.anInt4081;
		arg0[2] = this.anInt4101;
		arg0[3] = this.anInt4099;
	}

	@OriginalMember(owner = "client!nm", name = "ob", descriptor = "()V")
	private void method3622() {
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadMatrixf(this.aFloatArray25, 0);
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!nm", name = "pb", descriptor = "()V")
	public void method3623() {
		if (this.anInt4096 == 2) {
			return;
		}
		this.method3608();
		this.method3602(false);
		this.method3581(false);
		this.method3563(false);
		this.method3606(false);
		this.method3630();
		this.anInt4096 = 2;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "()V")
	@Override
	public void method3559() {
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!jt;Lclient!jt;Lclient!jt;Lclient!jt;)V")
	public void method3624(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) Class126 arg3) {
		if (arg0 == null) {
			this.anOpengl1.glDisableClientState(32884);
		} else {
			this.anOpengl1.glEnableClientState(32884);
			arg0.method2615();
		}
		if (arg1 == null) {
			this.anOpengl1.glDisableClientState(32885);
		} else {
			this.anOpengl1.glEnableClientState(32885);
			arg1.method2617();
		}
		if (arg2 == null) {
			this.anOpengl1.glDisableClientState(32886);
		} else {
			this.anOpengl1.glEnableClientState(32886);
			arg2.method2614();
		}
		if (arg3 == null) {
			this.anOpengl1.glDisableClientState(32888);
		} else {
			this.anOpengl1.glEnableClientState(32888);
			arg3.method2616();
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5350(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method5404();
	}

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "(I)V")
	public synchronized void method3625(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub30 local4 = new Class1_Sub30(arg0);
		this.aClass17_47.method199(local4);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(F)V")
	@Override
	public void method5398(@OriginalArg(0) float arg0) {
		if (this.aFloat53 != arg0) {
			this.aFloat53 = arg0;
			this.method3628();
		}
	}

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "(II)V")
	public synchronized void method3626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub30 local4 = new Class1_Sub30(arg1);
		local4.aLong207 = arg0;
		this.aClass17_43.method199(local4);
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(IIII)V")
	@Override
	public void method5330() {
		this.aBoolean419 = true;
		this.anInt4079 = 1583160;
		this.anInt4087 = 40;
		this.anInt4073 = 127;
		this.method3588();
		this.method3565();
		this.aClass140_1.method2863(false, false, 3);
		this.aClass140_1.method2865(true, -1);
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3583();
		this.method3607(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(II)I")
	@Override
	public int method5391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIILclient!us;II)V")
	@Override
	public void method5339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class34 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class34_Sub2 local2 = (Class34_Sub2) arg5;
		@Pc(5) Class15_Sub2_Sub1 local5 = local2.aClass15_Sub2_Sub1_5;
		this.method3623();
		this.method3603(local2.aClass15_Sub2_Sub1_5);
		this.method3607(1);
		this.method3629(7681, 8448);
		this.method3571(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat65 / (float) local5.anInt5857;
		@Pc(37) float local37 = local5.aFloat66 / (float) local5.anInt5856;
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
		this.method3571(0, 5890, 768);
	}

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "(I)V")
	public void method3627(@OriginalArg(0) int arg0) {
		Static242.aFloatArray21[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static242.aFloatArray21[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static242.aFloatArray21[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static242.aFloatArray21[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static242.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!nm", name = "qb", descriptor = "()V")
	private void method3628() {
		Static242.aFloatArray21[0] = this.aFloat53 * this.aFloat33;
		Static242.aFloatArray21[1] = this.aFloat53 * this.aFloat42;
		Static242.aFloatArray21[2] = this.aFloat53 * this.aFloat44;
		Static242.aFloatArray21[3] = 1.0F;
		this.anOpengl1.glLightModelfv(2899, Static242.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!nm", name = "B", descriptor = "()Lclient!mu;")
	@Override
	public Class127 method5378() {
		return this.aClass127_5;
	}

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "(II)V")
	public void method3629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4077 != 0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt4097 != arg0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anInt4097 = arg0;
			local4 = true;
		}
		if (this.anInt4094 != arg1) {
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			this.anInt4094 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt4096 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method5332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([Lclient!ns;Lclient!im;Lclient!mu;[Lclient!ro;I)V")
	@Override
	public void method5316(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class108 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) Class41_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method5370(arg0, arg2, arg3, arg4);
		this.method5315(arg1);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl1.glLineWidth((float) arg5);
		this.method5364(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5399(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static169.aFloat18 = arg0;
		Static169.aFloat19 = arg1;
		Static169.aFloat17 = arg2;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt4066) {
			arg2 = this.anInt4066;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt4064) {
			arg3 = this.anInt4064;
		}
		this.anInt4080 = arg0;
		this.anInt4081 = arg1;
		this.anInt4101 = arg2;
		this.anInt4099 = arg3;
		this.anOpengl1.glEnable(3089);
		this.method3599();
		this.method3576();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIZ)Lclient!dp;")
	@Override
	public Class51 method5387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class51_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "(I)V")
	public void method3630() {
		this.method3578(-2, true);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(FF)V")
	public void method3631(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat40 = arg0;
		this.aFloat47 = arg1;
		if (!this.aBoolean419) {
			this.method3588();
		}
	}

	@OriginalMember(owner = "client!nm", name = "rb", descriptor = "()V")
	public void method3632() {
		if (this.anInt4098 != 0) {
			this.anInt4098 = 0;
			this.anInt4096 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "()I")
	@Override
	public int method5337() {
		return 4;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!as;Lclient!as;FLclient!as;)Lclient!as;")
	@Override
	public Class16 method5342(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class16 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean411 && this.aBoolean420) {
			@Pc(11) Class16_Sub1_Sub1 local11 = null;
			@Pc(14) Class16_Sub1 local14 = (Class16_Sub1) arg0;
			@Pc(17) Class16_Sub1 local17 = (Class16_Sub1) arg1;
			@Pc(21) Class15_Sub1 local21 = local14.method2857();
			@Pc(25) Class15_Sub1 local25 = local17.method2857();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt820 > local25.anInt820 ? local21.anInt820 : local25.anInt820;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class16_Sub1_Sub1) {
					@Pc(52) Class16_Sub1_Sub1 local52 = (Class16_Sub1_Sub1) arg3;
					if (local52.method2332() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class16_Sub1_Sub1(this, local40);
				}
				local11.method2333(local21, local25, arg2);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}
}
