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

@OriginalClass("client!bf")
public final class Class19_Sub1 extends Class19 implements Interface8 {

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "[I")
	private static final int[] anIntArray32 = new int[1000];

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "Ljava/lang/Boolean;")
	private static Boolean aBoolean31 = Boolean.FALSE;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "[F")
	private static final float[] aFloatArray4 = new float[4];

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "[F")
	private static final float[] aFloatArray5 = new float[4];

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "Lclient!mf;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
	public int anInt581;

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
	public int anInt582;

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
	public int anInt584;

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
	public int anInt585;

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
	private int anInt586;

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
	public int anInt587;

	@OriginalMember(owner = "client!bf", name = "ab", descriptor = "F")
	private float aFloat2;

	@OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
	private int anInt588;

	@OriginalMember(owner = "client!bf", name = "cb", descriptor = "Z")
	private boolean aBoolean33;

	@OriginalMember(owner = "client!bf", name = "db", descriptor = "F")
	public float aFloat3;

	@OriginalMember(owner = "client!bf", name = "eb", descriptor = "I")
	private int anInt589;

	@OriginalMember(owner = "client!bf", name = "gb", descriptor = "F")
	public float aFloat5;

	@OriginalMember(owner = "client!bf", name = "hb", descriptor = "Lclient!mu;")
	public Class14_Sub2 aClass14_Sub2_1;

	@OriginalMember(owner = "client!bf", name = "jb", descriptor = "Z")
	private boolean aBoolean34;

	@OriginalMember(owner = "client!bf", name = "kb", descriptor = "Lclient!mp;")
	public Class31_Sub2 aClass31_Sub2_1;

	@OriginalMember(owner = "client!bf", name = "mb", descriptor = "F")
	public float aFloat6;

	@OriginalMember(owner = "client!bf", name = "nb", descriptor = "I")
	public int anInt591;

	@OriginalMember(owner = "client!bf", name = "qb", descriptor = "Lclient!ua;")
	public Class228 aClass228_1;

	@OriginalMember(owner = "client!bf", name = "rb", descriptor = "Z")
	public boolean aBoolean35;

	@OriginalMember(owner = "client!bf", name = "vb", descriptor = "[Lclient!kq;")
	private Class8[] aClass8Array1;

	@OriginalMember(owner = "client!bf", name = "zb", descriptor = "Z")
	public boolean aBoolean38;

	@OriginalMember(owner = "client!bf", name = "Bb", descriptor = "I")
	public int anInt597;

	@OriginalMember(owner = "client!bf", name = "Cb", descriptor = "Lclient!mp;")
	public Class31_Sub2 aClass31_Sub2_2;

	@OriginalMember(owner = "client!bf", name = "Db", descriptor = "I")
	private int anInt598;

	@OriginalMember(owner = "client!bf", name = "Eb", descriptor = "Z")
	private boolean aBoolean39;

	@OriginalMember(owner = "client!bf", name = "Fb", descriptor = "I")
	public int anInt599;

	@OriginalMember(owner = "client!bf", name = "Gb", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!bf", name = "Ib", descriptor = "Lclient!mp;")
	public Class31_Sub2 aClass31_Sub2_3;

	@OriginalMember(owner = "client!bf", name = "Kb", descriptor = "Lclient!al;")
	public Class8_Sub1 aClass8_Sub1_1;

	@OriginalMember(owner = "client!bf", name = "Mb", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!bf", name = "Nb", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!bf", name = "Ob", descriptor = "I")
	private int anInt602;

	@OriginalMember(owner = "client!bf", name = "Qb", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!bf", name = "Rb", descriptor = "I")
	private int anInt603;

	@OriginalMember(owner = "client!bf", name = "Sb", descriptor = "Z")
	public boolean aBoolean40;

	@OriginalMember(owner = "client!bf", name = "Tb", descriptor = "Lclient!ln;")
	private Class8_Sub1_Sub1 aClass8_Sub1_Sub1_1;

	@OriginalMember(owner = "client!bf", name = "Vb", descriptor = "Z")
	private boolean aBoolean42;

	@OriginalMember(owner = "client!bf", name = "Wb", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!bf", name = "Yb", descriptor = "Lclient!mu;")
	public Class14_Sub2 aClass14_Sub2_2;

	@OriginalMember(owner = "client!bf", name = "ac", descriptor = "I")
	private int anInt604;

	@OriginalMember(owner = "client!bf", name = "bc", descriptor = "Z")
	private boolean aBoolean44;

	@OriginalMember(owner = "client!bf", name = "cc", descriptor = "Z")
	public boolean aBoolean45;

	@OriginalMember(owner = "client!bf", name = "dc", descriptor = "I")
	private int anInt605;

	@OriginalMember(owner = "client!bf", name = "ec", descriptor = "Z")
	private boolean aBoolean46;

	@OriginalMember(owner = "client!bf", name = "fc", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!bf", name = "gc", descriptor = "F")
	private float aFloat13;

	@OriginalMember(owner = "client!bf", name = "hc", descriptor = "Lclient!fd;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!bf", name = "jc", descriptor = "Lclient!mp;")
	public Class31_Sub2 aClass31_Sub2_4;

	@OriginalMember(owner = "client!bf", name = "mc", descriptor = "Z")
	private boolean aBoolean47;

	@OriginalMember(owner = "client!bf", name = "nc", descriptor = "Z")
	private boolean aBoolean48;

	@OriginalMember(owner = "client!bf", name = "oc", descriptor = "F")
	private float aFloat16;

	@OriginalMember(owner = "client!bf", name = "qc", descriptor = "Lclient!fg;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!bf", name = "sc", descriptor = "Z")
	public boolean aBoolean50;

	@OriginalMember(owner = "client!bf", name = "vc", descriptor = "Lclient!mp;")
	public Class31_Sub2 aClass31_Sub2_5;

	@OriginalMember(owner = "client!bf", name = "wc", descriptor = "I")
	private int anInt609;

	@OriginalMember(owner = "client!bf", name = "Ac", descriptor = "Z")
	private boolean aBoolean52;

	@OriginalMember(owner = "client!bf", name = "Bc", descriptor = "Lclient!al;")
	public Class8_Sub1 aClass8_Sub1_2;

	@OriginalMember(owner = "client!bf", name = "Fc", descriptor = "Z")
	public boolean aBoolean53;

	@OriginalMember(owner = "client!bf", name = "Gc", descriptor = "Lclient!mp;")
	public Class31_Sub2 aClass31_Sub2_6;

	@OriginalMember(owner = "client!bf", name = "Jc", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!bf", name = "Lc", descriptor = "Lclient!mp;")
	public Class31_Sub2 aClass31_Sub2_7;

	@OriginalMember(owner = "client!bf", name = "Mc", descriptor = "Z")
	private boolean aBoolean54;

	@OriginalMember(owner = "client!bf", name = "Nc", descriptor = "Lclient!al;")
	public Class8_Sub1 aClass8_Sub1_3;

	@OriginalMember(owner = "client!bf", name = "Tc", descriptor = "Lclient!mp;")
	public Class31_Sub2 aClass31_Sub2_8;

	@OriginalMember(owner = "client!bf", name = "Uc", descriptor = "Lclient!dl;")
	private Class42_Sub1 aClass42_Sub1_1;

	@OriginalMember(owner = "client!bf", name = "Vc", descriptor = "I")
	private int anInt621;

	@OriginalMember(owner = "client!bf", name = "Wc", descriptor = "I")
	private int anInt622;

	@OriginalMember(owner = "client!bf", name = "Yc", descriptor = "I")
	private int anInt623;

	@OriginalMember(owner = "client!bf", name = "Zc", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "Lclient!lu;")
	private final Class143 aClass143_1 = new Class143();

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "Lclient!on;")
	private final Class14 aClass14_1 = new Class14_Sub2();

	@OriginalMember(owner = "client!bf", name = "E", descriptor = "Z")
	private boolean aBoolean32 = false;

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
	private int anInt579 = -1;

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
	public final int anInt580 = 8;

	@OriginalMember(owner = "client!bf", name = "H", descriptor = "[Lclient!mf;")
	private final Interface8[] anInterface8Array1 = new Interface8[4];

	@OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
	public final int anInt583 = 3;

	@OriginalMember(owner = "client!bf", name = "M", descriptor = "Lclient!ld;")
	private final Class135 aClass135_4 = new Class135();

	@OriginalMember(owner = "client!bf", name = "R", descriptor = "Lclient!ld;")
	private final Class135 aClass135_5 = new Class135();

	@OriginalMember(owner = "client!bf", name = "S", descriptor = "Lclient!ld;")
	private final Class135 aClass135_6 = new Class135();

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "Lclient!ld;")
	private final Class135 aClass135_7 = new Class135();

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "Lclient!ld;")
	private final Class135 aClass135_8 = new Class135();

	@OriginalMember(owner = "client!bf", name = "V", descriptor = "Lclient!ld;")
	private final Class135 aClass135_9 = new Class135();

	@OriginalMember(owner = "client!bf", name = "W", descriptor = "Lclient!ld;")
	private final Class135 aClass135_10 = new Class135();

	@OriginalMember(owner = "client!bf", name = "Y", descriptor = "[F")
	private final float[] aFloatArray6 = new float[4];

	@OriginalMember(owner = "client!bf", name = "Z", descriptor = "[F")
	public final float[] aFloatArray7 = new float[4];

	@OriginalMember(owner = "client!bf", name = "ub", descriptor = "I")
	private int anInt595 = 8448;

	@OriginalMember(owner = "client!bf", name = "fb", descriptor = "F")
	public float aFloat4 = 3584.0F;

	@OriginalMember(owner = "client!bf", name = "Ab", descriptor = "F")
	private float aFloat8 = 1.0F;

	@OriginalMember(owner = "client!bf", name = "xb", descriptor = "F")
	public float aFloat7 = -1.0F;

	@OriginalMember(owner = "client!bf", name = "Jb", descriptor = "I")
	public int anInt601 = -1;

	@OriginalMember(owner = "client!bf", name = "ib", descriptor = "I")
	private int anInt590 = 0;

	@OriginalMember(owner = "client!bf", name = "Zb", descriptor = "Z")
	private boolean aBoolean43 = true;

	@OriginalMember(owner = "client!bf", name = "ic", descriptor = "I")
	public int anInt606 = 0;

	@OriginalMember(owner = "client!bf", name = "pc", descriptor = "I")
	private int anInt607 = 0;

	@OriginalMember(owner = "client!bf", name = "tc", descriptor = "F")
	public float aFloat17 = 3584.0F;

	@OriginalMember(owner = "client!bf", name = "Hb", descriptor = "I")
	public int anInt600 = 512;

	@OriginalMember(owner = "client!bf", name = "lb", descriptor = "F")
	public float lb = 1.0F;

	@OriginalMember(owner = "client!bf", name = "wb", descriptor = "I")
	public int anInt596 = 512;

	@OriginalMember(owner = "client!bf", name = "xc", descriptor = "I")
	public int anInt610 = 0;

	@OriginalMember(owner = "client!bf", name = "Dc", descriptor = "F")
	public float aFloat18 = 1.0F;

	@OriginalMember(owner = "client!bf", name = "Cc", descriptor = "I")
	private int anInt612 = 0;

	@OriginalMember(owner = "client!bf", name = "kc", descriptor = "F")
	private float aFloat14 = 0.0F;

	@OriginalMember(owner = "client!bf", name = "tb", descriptor = "I")
	private int anInt594 = 0;

	@OriginalMember(owner = "client!bf", name = "Lb", descriptor = "[F")
	private final float[] aFloatArray8 = new float[4];

	@OriginalMember(owner = "client!bf", name = "Pc", descriptor = "I")
	public int anInt617 = 50;

	@OriginalMember(owner = "client!bf", name = "Qc", descriptor = "I")
	public int anInt618 = 3584;

	@OriginalMember(owner = "client!bf", name = "Pb", descriptor = "F")
	private float aFloat10 = 1.0F;

	@OriginalMember(owner = "client!bf", name = "Xb", descriptor = "[F")
	private final float[] aFloatArray9 = new float[4];

	@OriginalMember(owner = "client!bf", name = "uc", descriptor = "I")
	private int anInt608 = 0;

	@OriginalMember(owner = "client!bf", name = "lc", descriptor = "F")
	public float aFloat15 = -1.0F;

	@OriginalMember(owner = "client!bf", name = "Sc", descriptor = "I")
	public int anInt620 = 0;

	@OriginalMember(owner = "client!bf", name = "zc", descriptor = "I")
	private int anInt611 = -1;

	@OriginalMember(owner = "client!bf", name = "X", descriptor = "F")
	public float aFloat1 = 1.0F;

	@OriginalMember(owner = "client!bf", name = "Oc", descriptor = "I")
	private int anInt616 = -1;

	@OriginalMember(owner = "client!bf", name = "Hc", descriptor = "I")
	public int anInt613 = -1;

	@OriginalMember(owner = "client!bf", name = "Kc", descriptor = "I")
	public int anInt615 = -1;

	@OriginalMember(owner = "client!bf", name = "Rc", descriptor = "I")
	private int anInt619 = 0;

	@OriginalMember(owner = "client!bf", name = "Ec", descriptor = "[F")
	private final float[] aFloatArray10 = new float[16];

	@OriginalMember(owner = "client!bf", name = "Ic", descriptor = "I")
	private int anInt614 = 8448;

	@OriginalMember(owner = "client!bf", name = "pb", descriptor = "I")
	private int anInt593 = 0;

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas2;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl1;

	@OriginalMember(owner = "client!bf", name = "ob", descriptor = "I")
	public final int anInt592;

	@OriginalMember(owner = "client!bf", name = "yb", descriptor = "Z")
	private boolean aBoolean37;

	@OriginalMember(owner = "client!bf", name = "Xc", descriptor = "Z")
	public boolean aBoolean55;

	@OriginalMember(owner = "client!bf", name = "yc", descriptor = "Z")
	public boolean aBoolean51;

	@OriginalMember(owner = "client!bf", name = "Ub", descriptor = "Z")
	public boolean aBoolean41;

	@OriginalMember(owner = "client!bf", name = "rc", descriptor = "Z")
	private boolean aBoolean49;

	@OriginalMember(owner = "client!bf", name = "sb", descriptor = "Z")
	public boolean aBoolean36;

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "Lclient!ea;")
	public final Class56 aClass56_1;

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "Lclient!hm;")
	private final Class95 aClass95_1;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "Lclient!rd;")
	private final Class200 aClass200_1;

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "Lclient!w;")
	private final Class2_Sub38_Sub1 aClass2_Sub38_Sub1_1;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!ci;IILclient!ml;)V", line = 1234)
	public Class19_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class152 arg4) {
		super(arg2, arg1);
		this.aCanvas2 = arg0;
		@Pc(185) int local185 = 0;
		while (!this.aCanvas2.isShowing()) {
			if (local185++ > 5) {
				throw new RuntimeException("");
			}
			Static214.method4024(1000L);
		}
		this.aCanvas2.setIgnoreRepaint(true);
		try {
			if (aBoolean31 == null || !aBoolean31) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					aBoolean31 = Boolean.TRUE;
				} else {
					@Pc(219) Class32 local219 = arg4.method3755(this.getClass());
					while (local219.anInt992 == 0) {
						Static214.method4024(100L);
					}
					if (local219.anInt992 == 1) {
						aBoolean31 = Boolean.TRUE;
					}
				}
			}
			if (aBoolean31 == null || !aBoolean31) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas2, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method829();
				this.anOpengl1 = this.aContext1.getGL();
				@Pc(286) int local286 = this.method789();
				if (local286 != 0) {
					throw new RuntimeException("");
				}
				this.anInt592 = this.aBoolean53 ? 33639 : 5121;
				@Pc(305) String local305 = this.aString7.toLowerCase();
				@Pc(309) String local309 = this.aString8.toLowerCase();
				if (local309.indexOf("radeon") != -1) {
					@Pc(316) int local316 = 0;
					@Pc(318) boolean local318 = false;
					@Pc(320) boolean local320 = false;
					@Pc(328) String[] local328 = Static187.method3644(' ', local309.replace('/', ' '));
					for (@Pc(330) int local330 = 0; local330 < local328.length; local330++) {
						@Pc(338) String local338 = local328[local330];
						try {
							if (local338.length() > 0) {
								if (local338.charAt(0) == 'x' && local338.length() >= 3 && Static123.method2487(local338.substring(1, 3))) {
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
									if (local338.length() >= 4 && Static123.method2487(local338.substring(0, 4))) {
										local316 = Static137.method2700(local338.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(402) Exception local402) {
						}
					}
					if (!local320 && !local318) {
						if (local316 >= 7000 && local316 <= 7999) {
							this.aBoolean37 = false;
						}
						if (local316 >= 7000 && local316 <= 9250) {
							this.aBoolean55 = false;
						}
					}
					if (!local318 || local316 < 4000) {
						this.aBoolean51 = false;
					}
					this.aBoolean41 &= this.anOpengl1.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean49 = this.aBoolean37;
				}
				if (local305.contains("intel")) {
					this.aBoolean36 = false;
				}
				if (this.aBoolean37) {
					try {
						@Pc(460) int[] local460 = new int[1];
						this.anOpengl1.glGenBuffersARB(1, local460, 0);
					} catch (@Pc(468) Throwable local468) {
						throw new RuntimeException("", local468);
					}
				}
				this.method808(this);
				this.method2805();
				this.method818();
				new Class44(this);
				this.aClass56_1 = new Class56(this, this.anInterface2_5);
				Static257.method4767(true);
				this.aBoolean32 = true;
				this.aClass95_1 = new Class95(this);
				this.aClass200_1 = new Class200(this);
				this.aClass2_Sub38_Sub1_1 = new Class2_Sub38_Sub1(this);
				this.method795();
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
						Static214.method4024(100L);
					}
				}
				this.anOpengl1.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(552) Throwable local552) {
			local552.printStackTrace();
			this.method2841();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local552);
		}
	}

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "()I", line = 6)
	@Override
	public int method2877() {
		return this.anInt618;
	}

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "()Z", line = 9)
	@Override
	public boolean method2861() {
		return false;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 12)
	@Override
	public void method2844(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method2885();
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)I", line = 22)
	public int method777(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)Lclient!kg;", line = 37)
	@Override
	public Class2_Sub22 method2878() {
		return null;
	}

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "(I)I", line = 43)
	public int method778(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!on;)V", line = 80)
	@Override
	public void method2898(@OriginalArg(0) Class14 arg0) {
		this.aClass14_Sub2_2 = (Class14_Sub2) arg0;
		this.aClass14_Sub2_1.method3939(this.aClass14_Sub2_2);
		if (this.anInt588 != 1) {
			this.method810();
		}
	}

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "(I)V", line = 88)
	public void method779(@OriginalArg(0) int arg0) {
		if (this.anInt604 == arg0) {
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
		if (local10 != this.aBoolean42) {
			this.anOpengl1.glColorMask(local10, local10, local10, true);
			this.aBoolean42 = local10;
		}
		if (local12 != this.aBoolean46) {
			if (local12) {
				this.anOpengl1.glEnable(3008);
			} else {
				this.anOpengl1.glDisable(3008);
			}
			this.aBoolean46 = local12;
		}
		if (local8 != this.anInt605) {
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
			this.anInt605 = local8;
		}
		this.anInt604 = arg0;
		this.anInt602 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "(I)V", line = 202)
	public void method780(@OriginalArg(0) int arg0) {
		aFloatArray4[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		aFloatArray4[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		aFloatArray4[2] = (float) (arg0 & 0xFF) / 255.0F;
		aFloatArray4[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl1.glTexEnvfv(8960, 8705, aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!bf", name = "M", descriptor = "()V", line = 209)
	private void method781() {
		if (this.anInt602 == 1) {
			return;
		}
		this.method788();
		this.method786(false);
		this.method782(false);
		this.method813(false);
		this.method817(false);
		this.method848(null);
		this.method784();
		this.method792(0);
		this.anInt602 = 1;
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "()Lclient!on;", line = 225)
	@Override
	public Class14 method2810() {
		return this.aClass14_1;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(Z)V", line = 228)
	public void method782(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean54) {
			this.aBoolean54 = arg0;
			this.method797();
			this.anInt602 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!fg;)V", line = 237)
	public void method783(@OriginalArg(0) Interface5 arg0) {
		if (this.anInterface5_2 != arg0 && this.aBoolean37) {
			this.anOpengl1.glBindBufferARB(34962, arg0.method6067());
			this.anInterface5_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "(I)V", line = 246)
	public void method784() {
		this.method787(-2, true);
	}

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "()V", line = 251)
	@Override
	public void method2833() {
		if (this.aClass2_Sub38_Sub1_1.method6305()) {
			this.aClass200_1.method5123(this.aClass2_Sub38_Sub1_1);
			this.aClass56_1.method1789();
		}
	}

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "()V", line = 261)
	@Override
	public void method2884() {
		this.aClass95_1.method2507(false, false, 0);
		this.aBoolean50 = false;
		this.method809();
		this.method837();
	}

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "()V", line = 270)
	@Override
	public void method2885() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(II)V", line = 281)
	public synchronized void method785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub39 local4 = new Class2_Sub39(arg1);
		local4.aLong232 = arg0;
		this.aClass135_7.method3541(local4);
	}

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "()Z", line = 289)
	@Override
	public boolean method2849() {
		if (!this.aClass2_Sub38_Sub1_1.method6305()) {
			if (!this.aClass200_1.method5116(this.aClass2_Sub38_Sub1_1)) {
				return false;
			}
			this.aClass56_1.method1789();
		}
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V", line = 303)
	@Override
	public void method2819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt590 < arg0) {
			this.anInt590 = arg0;
		}
		if (this.anInt608 > arg2) {
			this.anInt608 = arg2;
		}
		if (this.anInt612 < arg1) {
			this.anInt612 = arg1;
		}
		if (this.anInt607 > arg3) {
			this.anInt607 = arg3;
		}
		this.anOpengl1.glEnable(3089);
		this.method807();
		this.method825();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIIII)V", line = 323)
	@Override
	public void method2855() {
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(Z)V", line = 328)
	public void method786(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean52) {
			this.aBoolean52 = arg0;
			this.method837();
			this.anInt602 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V", line = 337)
	public void method787(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method846(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIIII)V", line = 343)
	@Override
	public void method2838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method781();
		this.method779(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean44) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local23);
		this.anOpengl1.glVertex2f(local16, local23);
		this.anOpengl1.glVertex2f(local16, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean44) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "()V", line = 367)
	private void method788() {
		if (this.anInt588 == 1) {
			return;
		}
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (this.anInt582 > 0 && this.anInt587 > 0) {
			this.anOpengl1.glOrtho(0.0D, (double) this.anInt582, (double) this.anInt587, 0.0D, -1.0D, 1.0D);
		}
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anInt588 = 1;
		this.anInt602 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIII)V", line = 384)
	@Override
	public void method2823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt606 = arg0;
		this.anInt620 = arg1;
		this.anInt596 = arg2;
		this.anInt600 = arg3;
		this.method840();
		this.method807();
		if (this.anInt588 == 3) {
			this.method799();
		} else if (this.anInt588 == 2) {
			this.method823();
		}
	}

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "()I", line = 400)
	private int method789() {
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
		@Pc(53) String[] local53 = Static187.method3644(' ', local45.replace('.', ' '));
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static137.method2700(local53[0]);
				@Pc(69) int local69 = Static137.method2700(local53[1]);
				this.anInt603 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt603 < 12) {
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
		this.anInt597 = local116[0];
		this.anOpengl1.glGetIntegerv(34929, local116, 0);
		this.anInt622 = local116[0];
		this.anOpengl1.glGetIntegerv(34930, local116, 0);
		this.anInt589 = local116[0];
		if (this.anInt597 < 2 || this.anInt622 < 2 || this.anInt589 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean47 = Static200.aString30 != null && Static200.aString30.startsWith("mac");
		this.aBoolean53 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean37 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean44 = this.anOpengl1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean40 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean35 = this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean55 = this.anOpengl1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean41 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean38 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean51 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean45 = false;
		this.aBoolean36 = this.anOpengl1.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "()I", line = 471)
	@Override
	public int method2888() {
		return 4;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[Lclient!of;)V", line = 477)
	@Override
	public void method2836(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub26[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class2_Sub26 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			aFloatArray5[0] = local8.anInt4363;
			aFloatArray5[1] = local8.anInt4361;
			aFloatArray5[2] = local8.anInt4364;
			aFloatArray5[3] = 1.0F;
			this.anOpengl1.glLightfv(local12, 4611, aFloatArray5, 0);
			@Pc(44) int local44 = local8.anInt4365;
			@Pc(49) float local49 = local8.aFloat64 / 255.0F;
			aFloatArray5[0] = (float) (local44 >> 16 & 0xFF) * local49;
			aFloatArray5[1] = (float) (local44 >> 8 & 0xFF) * local49;
			aFloatArray5[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl1.glLightfv(local12, 4609, aFloatArray5, 0);
			this.anOpengl1.glLightf(local12, 4617, 1.0F / (float) (local8.anInt4367 * local8.anInt4367));
			this.anOpengl1.glEnable(local12);
		}
		while (local1 < this.anInt593) {
			this.anOpengl1.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt593 = arg0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I", line = 513)
	@Override
	public int method2808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!kj;Lclient!kj;Lclient!kj;Lclient!kj;)V", line = 516)
	public void method790(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) Class126 arg3) {
		if (arg0 == null) {
			this.anOpengl1.glDisableClientState(32884);
		} else {
			this.anOpengl1.glEnableClientState(32884);
			arg0.method3384();
		}
		if (arg1 == null) {
			this.anOpengl1.glDisableClientState(32885);
		} else {
			this.anOpengl1.glEnableClientState(32885);
			arg1.method3383();
		}
		if (arg2 == null) {
			this.anOpengl1.glDisableClientState(32886);
		} else {
			this.anOpengl1.glEnableClientState(32886);
			arg2.method3385();
		}
		if (arg3 == null) {
			this.anOpengl1.glDisableClientState(32888);
		} else {
			this.anOpengl1.glEnableClientState(32888);
			arg3.method3386();
		}
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(IIII)V", line = 554)
	@Override
	public void method2897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt582) {
			arg2 = this.anInt582;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt587) {
			arg3 = this.anInt587;
		}
		this.anInt590 = arg0;
		this.anInt612 = arg1;
		this.anInt608 = arg2;
		this.anInt607 = arg3;
		this.anOpengl1.glEnable(3089);
		this.method807();
		this.method825();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([IIIII)Lclient!jd;", line = 575)
	@Override
	public Class13 method2886(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class13_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "()V", line = 578)
	public void method791() {
		this.anOpengl1.glPopMatrix();
	}

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "(I)V", line = 581)
	public void method792(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method794(7681, 7681);
		} else if (arg0 == 1) {
			this.method794(8448, 8448);
		} else if (arg0 == 2) {
			this.method794(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIILclient!kf;II)V", line = 597)
	@Override
	public void method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class78 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class78_Sub2 local2 = (Class78_Sub2) arg5;
		@Pc(5) Class8_Sub1_Sub1 local5 = local2.aClass8_Sub1_Sub1_2;
		this.method824();
		this.method848(local2.aClass8_Sub1_Sub1_2);
		this.method779(1);
		this.method794(7681, 8448);
		this.method793(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat41 / (float) local5.anInt3684;
		@Pc(37) float local37 = local5.aFloat42 / (float) local5.anInt3683;
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
		this.method793(0, 5890, 768);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III[I)V", line = 620)
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass14_Sub2_2.aFloat51 * (float) arg0 + this.aClass14_Sub2_2.aFloat58 * (float) arg1 + this.aClass14_Sub2_2.aFloat54 * (float) arg2 + this.aClass14_Sub2_2.aFloat59;
		if (local24 < (float) this.anInt617 || local24 > (float) this.anInt618) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt596 * (this.aClass14_Sub2_2.aFloat55 * (float) arg0 + this.aClass14_Sub2_2.aFloat50 * (float) arg1 + this.aClass14_Sub2_2.aFloat57 * (float) arg2 + this.aClass14_Sub2_2.aFloat60) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt600 * (this.aClass14_Sub2_2.aFloat61 * (float) arg0 + this.aClass14_Sub2_2.aFloat52 * (float) arg1 + this.aClass14_Sub2_2.aFloat56 * (float) arg2 + this.aClass14_Sub2_2.aFloat53) / local24);
		if ((float) local81 >= this.aFloat11 && (float) local81 <= this.aFloat9 && (float) local113 >= this.aFloat6 && (float) local113 <= this.aFloat20) {
			arg3[0] = (int) ((float) local81 - this.aFloat11);
			arg3[1] = (int) ((float) local113 - this.aFloat6);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!bf", name = "L", descriptor = "()V", line = 645)
	@Override
	public void method2905() {
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "()V", line = 649)
	@Override
	public void method2805() {
		this.anInt582 = this.aCanvas2.getWidth();
		this.anInt587 = this.aCanvas2.getHeight();
		this.anOpengl1.glViewport(this.anInt619, this.anInt594, this.anInt582, this.anInt587);
		this.method806();
		this.method2900();
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(IIII)V", line = 659)
	@Override
	public void method2882() {
		this.aBoolean50 = true;
		this.anInt611 = 1583160;
		this.anInt615 = 40;
		this.anInt610 = 127;
		this.method809();
		this.method837();
		this.aClass95_1.method2507(false, false, 3);
		this.aClass95_1.method2506(true, -1);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V", line = 669)
	public void method793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "()Z", line = 675)
	@Override
	public boolean method2807() {
		return this.aClass95_1.method2508();
	}

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "()Z", line = 678)
	@Override
	public boolean method2815() {
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!tp;)V", line = 681)
	@Override
	public void method2835(@OriginalArg(0) Class224 arg0) {
		this.aClass143_1.method3689(this, arg0);
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(II)V", line = 684)
	public void method794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt609 != 0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt595 != arg0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anInt595 = arg0;
			local4 = true;
		}
		if (this.anInt614 != arg1) {
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			this.anInt614 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt602 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "()Z", line = 716)
	@Override
	public boolean method2860() {
		return this.aClass2_Sub38_Sub1_1.method6311();
	}

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "()Z", line = 719)
	@Override
	public boolean method2890() {
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(FF)V", line = 724)
	@Override
	public void method2825(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat12 && arg1 == this.aFloat19) {
			return;
		}
		this.aFloat12 = arg0;
		this.aFloat19 = arg1;
		this.method815();
		if (this.anInt588 == 3) {
			this.method799();
		} else if (this.anInt588 == 2) {
			this.method823();
		}
	}

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "()I", line = 740)
	@Override
	public int method2816() {
		return this.anInt617;
	}

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "()Z", line = 745)
	@Override
	public boolean method2873() {
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "()V", line = 750)
	private void method795() {
		this.method784();
		for (@Pc(7) int local7 = this.anInt597 - 1; local7 >= 0; local7--) {
			this.method832(local7);
			this.method848(null);
			this.anOpengl1.glTexEnvi(8960, 8704, 34160);
		}
		this.method794(8448, 8448);
		this.method793(2, 34168, 770);
		this.method819();
		this.anInt604 = 1;
		this.anOpengl1.glEnable(3042);
		this.anOpengl1.glBlendFunc(770, 771);
		this.anInt605 = 1;
		this.anOpengl1.glEnable(3008);
		this.anOpengl1.glAlphaFunc(516, 0.0F);
		this.aBoolean46 = true;
		this.anOpengl1.glColorMask(true, true, true, true);
		this.aBoolean42 = true;
		this.method786(true);
		this.method782(true);
		this.method813(true);
		this.method817(true);
		this.method806();
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
		this.anInt616 = this.anInt613 = -1;
		this.method2900();
	}

	@OriginalMember(owner = "client!bf", name = "R", descriptor = "()V", line = 814)
	private void method796() {
		this.anOpengl1.glDepthMask(this.aBoolean39 && this.aBoolean43);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 822)
	@Override
	public synchronized void method2850(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class2_Sub39 local16;
		while (!this.aClass135_5.method3551()) {
			local16 = (Class2_Sub39) this.aClass135_5.method3550();
			anIntArray32[local1++] = (int) local16.aLong232;
			this.anInt581 -= local16.anInt6805;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteBuffersARB(local1, anIntArray32, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteBuffersARB(local1, anIntArray32, 0);
			local1 = 0;
		}
		while (!this.aClass135_6.method3551()) {
			local16 = (Class2_Sub39) this.aClass135_6.method3550();
			anIntArray32[local1++] = (int) local16.aLong232;
			this.anInt585 -= local16.anInt6805;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteTextures(local1, anIntArray32, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteTextures(local1, anIntArray32, 0);
			local1 = 0;
		}
		while (!this.aClass135_7.method3551()) {
			local16 = (Class2_Sub39) this.aClass135_7.method3550();
			anIntArray32[local1++] = local16.anInt6805;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteFramebuffersEXT(local1, anIntArray32, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteFramebuffersEXT(local1, anIntArray32, 0);
			local1 = 0;
		}
		while (!this.aClass135_8.method3551()) {
			local16 = (Class2_Sub39) this.aClass135_8.method3550();
			anIntArray32[local1++] = (int) local16.aLong232;
			this.anInt586 -= local16.anInt6805;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteRenderbuffersEXT(local1, anIntArray32, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteRenderbuffersEXT(local1, anIntArray32, 0);
			local1 = 0;
		}
		while (!this.aClass135_9.method3551()) {
			local16 = (Class2_Sub39) this.aClass135_9.method3550();
			anIntArray32[local1++] = (int) local16.aLong232;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteProgramsARB(local1, anIntArray32, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteProgramsARB(local1, anIntArray32, 0);
		}
		while (!this.aClass135_4.method3551()) {
			local16 = (Class2_Sub39) this.aClass135_4.method3550();
			this.anOpengl1.glDeleteLists((int) local16.aLong232, local16.anInt6805);
		}
		while (!this.aClass135_10.method3551()) {
			local16 = (Class2_Sub39) this.aClass135_10.method3550();
			this.anOpengl1.glDeleteObjectARB(local16.anInt6805);
		}
		while (!this.aClass135_4.method3551()) {
			local16 = (Class2_Sub39) this.aClass135_4.method3550();
			this.anOpengl1.glDeleteLists((int) local16.aLong232, local16.anInt6805);
		}
		if (this.method2901() > 100663296 && Static190.method3686() > this.aLong20 + 60000L) {
			System.gc();
			this.aLong20 = Static190.method3686();
		}
		this.anInt584 = local5;
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(IIIIII)V", line = 991)
	@Override
	public void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method781();
		this.method779(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean44) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local19);
		this.anOpengl1.glVertex2f(local14, local19);
		this.anOpengl1.glVertex2f(local14, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean44) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!bf", name = "S", descriptor = "()V", line = 1015)
	private void method797() {
		if (this.aBoolean54 && !this.aBoolean33) {
			this.anOpengl1.glEnable(2896);
		} else {
			this.anOpengl1.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "()V", line = 1027)
	@Override
	public void method2821() {
		this.method817(true);
		this.anOpengl1.glClear(256);
	}

	@OriginalMember(owner = "client!bf", name = "J", descriptor = "()V", line = 1039)
	@Override
	public void method2900() {
		this.anInt590 = 0;
		this.anInt612 = 0;
		this.anInt608 = this.anInt582;
		this.anInt607 = this.anInt587;
		this.anOpengl1.glDisable(3089);
		this.method807();
	}

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "()Z", line = 1050)
	@Override
	public boolean method2851() {
		return false;
	}

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "(I)I", line = 1054)
	public int method798(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "()F", line = 1066)
	@Override
	public float method2804() {
		return this.aFloat12;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)V", line = 1071)
	@Override
	public void method2847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl1.glLineWidth((float) arg5);
		this.method2811(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "()Z", line = 1077)
	@Override
	public boolean method2880() {
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "()Lclient!on;", line = 1083)
	@Override
	public Class14 method2899() {
		return new Class14_Sub2();
	}

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "()V", line = 1088)
	private void method799() {
		@Pc(11) float local11 = (float) -this.anInt606 * this.aFloat8 / (float) this.anInt596;
		@Pc(23) float local23 = (float) -this.anInt620 * this.aFloat8 / (float) this.anInt600;
		@Pc(37) float local37 = (float) (this.anInt582 - this.anInt606) * this.aFloat8 / (float) this.anInt596;
		@Pc(51) float local51 = (float) (this.anInt587 - this.anInt620) * this.aFloat8 / (float) this.anInt600;
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (local11 != local37 && local51 != local23) {
			this.anOpengl1.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt617 - this.aFloat19), (double) ((float) this.anInt618 - this.aFloat19));
		}
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(Z)V", line = 1105)
	public void method800(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean33) {
			this.aBoolean33 = arg0;
			this.method797();
		}
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V", line = 1115)
	@Override
	public void method2867(@OriginalArg(0) int arg0) {
		this.method805();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!fd;)V", line = 1120)
	public void method801(@OriginalArg(0) Interface4 arg0) {
		if (this.anInterface4_1 != arg0 && this.aBoolean37) {
			this.anOpengl1.glBindBufferARB(34963, arg0.method6067());
			this.anInterface4_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[I[I)Lclient!kf;", line = 1128)
	@Override
	public Class78 method2828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static375.method2347(arg0, this, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!fg;", line = 1131)
	public Interface5 method802(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface5) (this.aBoolean37 ? new Class10_Sub2(this, arg0, arg1, false) : new Class180_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "()V", line = 1141)
	@Override
	public void method2806() {
		if (this.anInt582 <= 0 && this.anInt587 <= 0) {
			return;
		}
		@Pc(9) int local9 = this.anInt590;
		@Pc(12) int local12 = this.anInt608;
		@Pc(15) int local15 = this.anInt612;
		@Pc(18) int local18 = this.anInt607;
		this.method2900();
		this.anOpengl1.glReadBuffer(1028);
		this.anOpengl1.glDrawBuffer(1029);
		this.method806();
		this.method786(false);
		this.method782(false);
		this.method813(false);
		this.method817(false);
		this.method848(null);
		this.method784();
		this.method792(0);
		this.method779(0);
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRasterPos2i(0, 0);
		this.anOpengl1.glCopyPixels(0, 0, this.anInt582, this.anInt587, 6144);
		this.anOpengl1.glFlush();
		this.anOpengl1.glReadBuffer(1029);
		this.anOpengl1.glDrawBuffer(1029);
		this.method2897(local9, local15, local12, local18);
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(II)V", line = 1178)
	public synchronized void method803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub39 local4 = new Class2_Sub39(arg1);
		local4.aLong232 = arg0;
		this.aClass135_6.method3541(local4);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(FFFF)V", line = 1183)
	public void method804(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		aFloatArray4[0] = arg0;
		aFloatArray4[1] = arg1;
		aFloatArray4[2] = arg2;
		aFloatArray4[3] = arg3;
		this.anOpengl1.glTexEnvfv(8960, 8705, aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)V", line = 1196)
	@Override
	public void method2874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt617 == arg0 && this.anInt618 == arg1) {
			return;
		}
		this.anInt617 = arg0;
		this.anInt618 = arg1;
		this.method840();
		this.method809();
		if (this.anInt588 == 3) {
			this.method799();
		} else if (this.anInt588 == 2) {
			this.method823();
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)V", line = 1215)
	@Override
	public void method2857(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "()V", line = 1218)
	private void method805() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!bf", name = "V", descriptor = "()V", line = 1225)
	public void method806() {
		if (this.anInt588 != 0) {
			this.anInt588 = 0;
			this.anInt602 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIZ)Lclient!jd;", line = 1417)
	@Override
	public Class13 method2820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class13_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bf", name = "W", descriptor = "()V", line = 1420)
	private void method807() {
		this.aFloat11 = this.anInt590 - this.anInt606;
		this.aFloat9 = this.anInt608 - this.anInt606;
		this.aFloat6 = this.anInt612 - this.anInt620;
		this.aFloat20 = this.anInt607 - this.anInt620;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!mf;)V", line = 1426)
	public void method808(@OriginalArg(0) Interface8 arg0) {
		if (this.anInt579 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt579 >= 0) {
			this.anInterface8Array1[this.anInt579].method5793();
		}
		this.anInterface8_1 = this.anInterface8Array1[++this.anInt579] = arg0;
		this.anInterface8_1.method5792();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!kf;II)V", line = 1437)
	@Override
	public void method2813(@OriginalArg(1) Class78 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class78_Sub2 local2 = (Class78_Sub2) arg0;
		@Pc(5) Class8_Sub1_Sub1 local5 = local2.aClass8_Sub1_Sub1_2;
		this.method824();
		this.method848(local2.aClass8_Sub1_Sub1_2);
		this.method779(1);
		this.method794(7681, 8448);
		this.method793(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat41 / (float) local5.anInt3684;
		@Pc(37) float local37 = local5.aFloat42 / (float) local5.anInt3683;
		this.anOpengl1.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt590 - arg1), local37 * (float) (this.anInt612 - arg2));
		this.anOpengl1.glVertex2i(this.anInt590, this.anInt612);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt590 - arg1), local37 * (float) (this.anInt607 - arg2));
		this.anOpengl1.glVertex2i(this.anInt590, this.anInt607);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt608 - arg1), local37 * (float) (this.anInt607 - arg2));
		this.anOpengl1.glVertex2i(this.anInt608, this.anInt607);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt608 - arg1), local37 * (float) (this.anInt612 - arg2));
		this.anOpengl1.glVertex2i(this.anInt608, this.anInt612);
		this.anOpengl1.glEnd();
		this.method793(0, 5890, 768);
	}

	@OriginalMember(owner = "client!bf", name = "X", descriptor = "()V", line = 1464)
	private void method809() {
		@Pc(15) int local15;
		if (this.aBoolean50) {
			this.anOpengl1.glFogf(2915, 0.0F);
			this.anOpengl1.glFogf(2916, 1.0F);
			local15 = this.anInt611;
		} else {
			this.aFloat2 = (float) (this.anInt618 - 256) - this.aFloat14;
			this.aFloat5 = this.aFloat2 - (float) this.anInt601 * this.aFloat10;
			if (this.aFloat5 < (float) this.anInt617) {
				this.aFloat5 = this.anInt617;
			}
			this.anOpengl1.glFogf(2915, this.aFloat5);
			this.anOpengl1.glFogf(2916, this.aFloat2);
			local15 = this.anInt613;
		}
		aFloatArray4[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		aFloatArray4[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		aFloatArray4[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl1.glFogfv(2918, aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII)V", line = 1490)
	@Override
	public void method2811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method781();
		this.method779(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!bf", name = "Y", descriptor = "()V", line = 1500)
	private void method810() {
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl1.glMultMatrixf(this.aClass14_Sub2_2.method3942(), 0);
		this.method814();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!fd;III)V", line = 1507)
	public void method811(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method801(arg0);
		arg0.method6066(arg1, arg2);
	}

	@OriginalMember(owner = "client!bf", name = "Z", descriptor = "()V", line = 1513)
	private void method812() {
		aFloatArray4[0] = this.aFloat7 * this.aFloat1;
		aFloatArray4[1] = this.aFloat7 * this.aFloat18;
		aFloatArray4[2] = this.aFloat7 * this.lb;
		aFloatArray4[3] = 1.0F;
		this.anOpengl1.glLightfv(16384, 4609, aFloatArray4, 0);
		aFloatArray4[0] = -this.aFloat15 * this.aFloat1;
		aFloatArray4[1] = -this.aFloat15 * this.aFloat18;
		aFloatArray4[2] = -this.aFloat15 * this.lb;
		aFloatArray4[3] = 1.0F;
		this.anOpengl1.glLightfv(16385, 4609, aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(Z)V", line = 1526)
	public void method813(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean48) {
			return;
		}
		if (arg0) {
			this.anOpengl1.glEnable(2929);
		} else {
			this.anOpengl1.glDisable(2929);
		}
		this.aBoolean48 = arg0;
		this.anInt602 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!bf", name = "ab", descriptor = "()V", line = 1539)
	public void method814() {
		this.anOpengl1.glLightfv(16384, 4611, this.aFloatArray7, 0);
		this.anOpengl1.glLightfv(16385, 4611, this.aFloatArray9, 0);
	}

	@OriginalMember(owner = "client!bf", name = "bb", descriptor = "()V", line = 1543)
	private void method815() {
		if (this.aFloat19 == 0.0F) {
			this.aFloatArray10[10] = this.aFloat16;
			this.aFloatArray10[14] = this.aFloat13;
		} else {
			@Pc(13) float local13 = this.aFloat12 / (this.aFloat19 + this.aFloat12);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat13 * (1.0F - local13) * (1.0F - local13) / this.aFloat19;
			this.aFloatArray10[10] = this.aFloat16 + local32;
			this.aFloatArray10[14] = this.aFloat13 * local17;
		}
		this.aFloat17 = (this.aFloatArray10[14] - (float) this.anInt618) / this.aFloatArray10[10];
		this.aFloat4 = (float) this.anInt618 - this.aFloat19;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[BIZ)Lclient!fg;", line = 1568)
	public Interface5 method816(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface5) (this.aBoolean37 && (!arg3 || this.aBoolean49) ? new Class10_Sub2(this, arg0, arg1, arg2, arg3) : new Class180_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(IIIIII)Lclient!rc;", line = 1576)
	@Override
	public Class42 method2879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean38 ? new Class42_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(Z)V", line = 1579)
	public void method817(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean39) {
			this.aBoolean39 = arg0;
			this.method796();
			this.anInt602 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)V", line = 1588)
	@Override
	public void method2895(@OriginalArg(0) int arg0) {
		this.method829();
	}

	@OriginalMember(owner = "client!bf", name = "cb", descriptor = "()V", line = 1592)
	private void method818() {
		this.aClass14_Sub2_2 = new Class14_Sub2();
		this.aClass14_Sub2_1 = new Class14_Sub2();
		this.aClass8Array1 = new Class8[this.anInt597];
		this.aClass8_Sub1_1 = new Class8_Sub1(this, 3553, 6408, 1, 1);
		this.aClass8_Sub1_2 = new Class8_Sub1(this, 3553, 6408, 1, 1);
		this.aClass8_Sub1_3 = new Class8_Sub1(this, 3553, 6408, 1, 1);
		this.aClass31_Sub2_4 = new Class31_Sub2(this);
		this.aClass31_Sub2_1 = new Class31_Sub2(this);
		this.aClass31_Sub2_2 = new Class31_Sub2(this);
		this.aClass31_Sub2_8 = new Class31_Sub2(this);
		this.aClass31_Sub2_5 = new Class31_Sub2(this);
		this.aClass31_Sub2_3 = new Class31_Sub2(this);
		this.aClass31_Sub2_7 = new Class31_Sub2(this);
		this.aClass31_Sub2_6 = new Class31_Sub2(this);
		if (this.aBoolean36) {
			this.aClass228_1 = new Class228(this);
		}
		this.aClass143_1.method3691(this);
	}

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "()Z", line = 1614)
	@Override
	public boolean method2831() {
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "db", descriptor = "()V", line = 1617)
	private void method819() {
		if (this.aBoolean34) {
			this.anOpengl1.glMatrixMode(5890);
			this.anOpengl1.glLoadIdentity();
			this.anOpengl1.glMatrixMode(5888);
			this.aBoolean34 = false;
		}
	}

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "(I)V", line = 1628)
	public synchronized void method820(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub39 local4 = new Class2_Sub39(arg0);
		this.aClass135_10.method3541(local4);
	}

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "()I", line = 1633)
	@Override
	public int method2822() {
		@Pc(2) int local2 = this.anInt621;
		this.anInt621 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "()I", line = 1645)
	@Override
	public int method2845() {
		@Pc(2) int local2 = this.anInt623;
		this.anInt623 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII[BII)V", line = 1654)
	@Override
	public void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass8_Sub1_Sub1_1 == null || this.aClass8_Sub1_Sub1_1.anInt3680 < arg2 || this.aClass8_Sub1_Sub1_1.anInt3681 < arg3) {
			this.aClass8_Sub1_Sub1_1 = Static382.method3642(this, arg6, arg3, arg2);
			this.aClass8_Sub1_Sub1_1.method3639(false, false);
			local32 = this.aClass8_Sub1_Sub1_1.aFloat42;
			local36 = this.aClass8_Sub1_Sub1_1.aFloat41;
		} else {
			this.aClass8_Sub1_Sub1_1.method3636(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass8_Sub1_Sub1_1.aFloat42 * (float) arg3 / (float) this.aClass8_Sub1_Sub1_1.anInt3681;
			local36 = this.aClass8_Sub1_Sub1_1.aFloat41 * (float) arg2 / (float) this.aClass8_Sub1_Sub1_1.anInt3680;
		}
		this.method824();
		this.method848(this.aClass8_Sub1_Sub1_1);
		this.method779(arg8);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method780(arg5);
		this.method794(34165, 34165);
		this.method793(0, 34166, 768);
		this.method793(2, 5890, 770);
		this.method833(0, 34166);
		this.method833(2, 5890);
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
		this.method793(0, 5890, 768);
		this.method793(2, 34166, 770);
		this.method833(0, 5890);
		this.method833(2, 34166);
	}

	@OriginalMember(owner = "client!bf", name = "eb", descriptor = "()Lclient!mf;", line = 1704)
	public Interface8 method821() {
		return this.anInterface8_1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!dk;Z)Lclient!jd;", line = 1708)
	@Override
	public Class13 method2893(@OriginalArg(0) Class48 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt1529 * arg0.anInt1531];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray20 == null) {
			for (local15 = 0; local15 < arg0.anInt1531; local15++) {
				for (local21 = 0; local21 < arg0.anInt1529; local21++) {
					@Pc(74) int local74 = arg0.anIntArray108[arg0.aByteArray21[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt1531; local15++) {
				for (local21 = 0; local21 < arg0.anInt1529; local21++) {
					local6[local10++] = arg0.aByteArray20[local8] << 24 | arg0.anIntArray108[arg0.aByteArray21[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class13 local100 = this.method2886(local6, arg0.anInt1529, arg0.anInt1529, arg0.anInt1531);
		local100.method6392(arg0.anInt1533, arg0.anInt1528, arg0.anInt1530, arg0.anInt1532);
		return local100;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!gn;Lclient!tp;Lclient!on;Lclient!au;I)V", line = 1764)
	@Override
	public void method2826(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) Class12_Sub2 arg3) {
		arg0.method3836(arg2, arg3, 0);
		this.method2835(arg1);
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(IIIII)V", line = 1771)
	@Override
	public void method2891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method781();
		this.method779(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "(I)V", line = 1785)
	public synchronized void method822(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub39 local4 = new Class2_Sub39(arg0);
		this.aClass135_7.method3541(local4);
	}

	@OriginalMember(owner = "client!bf", name = "fb", descriptor = "()V", line = 1789)
	private void method823() {
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadMatrixf(this.aFloatArray10, 0);
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bf", name = "gb", descriptor = "()V", line = 1795)
	public void method824() {
		if (this.anInt602 == 2) {
			return;
		}
		this.method788();
		this.method786(false);
		this.method782(false);
		this.method813(false);
		this.method817(false);
		this.method784();
		this.anInt602 = 2;
	}

	@OriginalMember(owner = "client!bf", name = "hb", descriptor = "()V", line = 1811)
	private void method825() {
		if (this.anInt590 <= this.anInt608 && this.anInt612 <= this.anInt607) {
			this.anOpengl1.glScissor(this.anInt619 + this.anInt590, this.anInt594 + this.anInt587 - this.anInt607, this.anInt608 - this.anInt590, this.anInt607 - this.anInt612);
		} else {
			this.anOpengl1.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(F)V", line = 1818)
	public void method826(@OriginalArg(0) float arg0) {
		if (this.aFloat8 != arg0) {
			this.aFloat8 = arg0;
			if (this.anInt588 == 3) {
				this.method799();
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "ib", descriptor = "()V", line = 1829)
	private void method827() {
		if (this.anInt588 != 3) {
			this.anInt588 = 3;
			this.method799();
			this.method810();
			this.anInt602 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V", line = 1841)
	@Override
	protected void method2818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!bf", name = "jb", descriptor = "()V", line = 1844)
	public void method828() {
		if (this.anInt588 != 2) {
			this.anInt588 = 2;
			this.method823();
			this.method810();
			this.anInt602 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bf", name = "kb", descriptor = "()V", line = 1857)
	private void method829() {
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
			Static214.method4024(1000L);
		}
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V", line = 1878)
	@Override
	public void method2856(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Lclient!mf;)V", line = 1885)
	public void method830(@OriginalArg(0) Interface8 arg0) {
		if (this.anInt579 < 0 || this.anInterface8Array1[this.anInt579] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface8Array1[this.anInt579--] = null;
		arg0.method5793();
		if (this.anInt579 >= 0) {
			this.anInterface8_1 = this.anInterface8Array1[this.anInt579];
			this.anInterface8_1.method5792();
		}
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V", line = 1901)
	@Override
	public void method2869(@OriginalArg(0) int arg0) {
		this.method779(0);
		this.anOpengl1.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl1.glClear(16384);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!mu;)V", line = 1909)
	public void method831(@OriginalArg(0) Class14_Sub2 arg0) {
		this.anOpengl1.glPushMatrix();
		this.anOpengl1.glMultMatrixf(arg0.method3942(), 0);
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(IIII)V", line = 1914)
	@Override
	public void method2868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean50) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt611 = arg1;
		this.anInt615 = arg2;
		this.anInt610 = arg3;
		this.method809();
		this.aClass95_1.method2506(true, arg0);
	}

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "(I)V", line = 1926)
	public void method832(@OriginalArg(0) int arg0) {
		if (this.anInt609 != arg0) {
			this.anOpengl1.glActiveTexture(arg0 + 33984);
			this.anInt609 = arg0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V", line = 1938)
	public void method833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V", line = 1944)
	@Override
	public void method2854(@OriginalArg(0) boolean arg0) {
		this.aBoolean43 = arg0;
		this.method796();
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(FFF)V", line = 1948)
	private void method834(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl1.glMatrixMode(5890);
		if (this.aBoolean34) {
			this.anOpengl1.glLoadIdentity();
		}
		this.anOpengl1.glTranslatef(arg0, arg1, arg2);
		this.anOpengl1.glMatrixMode(5888);
		this.aBoolean34 = true;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(III)V", line = 1957)
	public void method835(@OriginalArg(2) int arg0) {
		this.anOpengl1.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "(I)V", line = 1964)
	public synchronized void method836(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub39 local4 = new Class2_Sub39(arg0);
		this.aClass135_9.method3541(local4);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIII)V", line = 1970)
	@Override
	public void method2858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method781();
		this.method779(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([I)V", line = 1985)
	@Override
	public void method2853(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt590;
		arg0[1] = this.anInt612;
		arg0[2] = this.anInt608;
		arg0[3] = this.anInt607;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IFFFFF)V", line = 1994)
	@Override
	public void method2834(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt616 != arg0;
		if (local7 || this.aFloat7 != arg1 || this.aFloat15 != arg2) {
			this.anInt616 = arg0;
			this.aFloat7 = arg1;
			this.aFloat15 = arg2;
			if (local7) {
				this.aFloat1 = (float) (this.anInt616 & 0xFF0000) / 1.671168E7F;
				this.aFloat18 = (float) (this.anInt616 & 0xFFFF) / 65535.0F;
				this.lb = (float) (this.anInt616 & 0xFF) / 255.0F;
				this.method842();
			}
			this.method812();
		}
		if (this.aFloatArray8[0] == arg3 && this.aFloatArray8[1] == arg4 && this.aFloatArray8[2] == arg5) {
			return;
		}
		this.aFloatArray8[0] = arg3;
		this.aFloatArray8[1] = arg4;
		this.aFloatArray8[2] = arg5;
		this.aFloatArray6[0] = -arg3;
		this.aFloatArray6[1] = -arg4;
		this.aFloatArray6[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray7[0] = arg3 * local132;
		this.aFloatArray7[1] = arg4 * local132;
		this.aFloatArray7[2] = arg5 * local132;
		this.aFloatArray9[0] = -this.aFloatArray7[0];
		this.aFloatArray9[1] = -this.aFloatArray7[1];
		this.aFloatArray9[2] = -this.aFloatArray7[2];
		this.method814();
		this.anInt591 = (int) (arg3 * 256.0F / arg4);
		this.anInt599 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!bf", name = "lb", descriptor = "()V", line = 2034)
	private void method837() {
		if (this.aBoolean52 && this.aBoolean50 | this.anInt601 >= 0) {
			this.anOpengl1.glEnable(2912);
		} else {
			this.anOpengl1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!bf", name = "mb", descriptor = "()Lclient!qd;", line = 2041)
	public Class8_Sub3 method838() {
		return this.aClass42_Sub1_1 == null ? null : this.aClass42_Sub1_1.method2430();
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I[BIZ)Lclient!fd;", line = 2046)
	public Interface4 method839(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface4) (this.aBoolean37 && (!arg2 || this.aBoolean49) ? new Class10_Sub1(this, 5123, arg0, arg1, arg2) : new Class180_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "()Z", line = 2054)
	@Override
	public boolean method2814() {
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "()Z", line = 2058)
	@Override
	public boolean method2871() {
		return false;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([Lclient!gn;Lclient!tp;Lclient!on;[Lclient!au;I)V", line = 2061)
	@Override
	public void method2832(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) Class12_Sub2[] arg3, @OriginalArg(4) int arg4) {
		this.method2883(arg0, arg2, arg3, arg4);
		this.method2835(arg1);
	}

	@OriginalMember(owner = "client!bf", name = "nb", descriptor = "()V", line = 2066)
	private void method840() {
		@Pc(2) float[] local2 = this.aFloatArray10;
		@Pc(14) float local14 = (float) (-this.anInt606 * this.anInt617) / (float) this.anInt596;
		@Pc(28) float local28 = (float) ((this.anInt582 - this.anInt606) * this.anInt617) / (float) this.anInt596;
		@Pc(39) float local39 = (float) (this.anInt620 * this.anInt617) / (float) this.anInt600;
		@Pc(53) float local53 = (float) ((this.anInt620 - this.anInt587) * this.anInt617) / (float) this.anInt600;
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
			@Pc(67) float local67 = (float) this.anInt617 * 2.0F;
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
			local2[10] = this.aFloat16 = (float) -(this.anInt618 + this.anInt617) / (float) (this.anInt618 - this.anInt617);
			local2[11] = -1.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = this.aFloat13 = -(local67 * (float) this.anInt618) / (float) (this.anInt618 - this.anInt617);
			local2[15] = 0.0F;
		}
		this.method815();
	}

	@OriginalMember(owner = "client!bf", name = "E", descriptor = "()V", line = 2121)
	@Override
	public void method2889() {
		this.aClass200_1.method5118();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!vi;[Lclient!dk;Z)Lclient!ur;", line = 2124)
	@Override
	public Class130 method2859(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class48[] arg1) {
		return new Class130_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "()Z", line = 2127)
	@Override
	public boolean method2842() {
		return !this.aBoolean47;
	}

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "()I", line = 2130)
	@Override
	public int method2901() {
		return this.anInt581 + this.anInt585 + this.anInt586;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "()V", line = 2134)
	@Override
	public void method5793() {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(F)V", line = 2138)
	@Override
	public void method2840(@OriginalArg(0) float arg0) {
		if (this.aFloat3 != arg0) {
			this.aFloat3 = arg0;
			this.method842();
		}
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(II)V", line = 2147)
	public synchronized void method841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub39 local4 = new Class2_Sub39(arg1);
		local4.aLong232 = arg0;
		this.aClass135_5.method3541(local4);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[[I[[IIII)Lclient!tf;", line = 2152)
	@Override
	public Class6 method2809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class6_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "()I", line = 2155)
	@Override
	public int method5794() {
		return this.anInt587;
	}

	@OriginalMember(owner = "client!bf", name = "ob", descriptor = "()V", line = 2159)
	private void method842() {
		aFloatArray4[0] = this.aFloat3 * this.aFloat1;
		aFloatArray4[1] = this.aFloat3 * this.aFloat18;
		aFloatArray4[2] = this.aFloat3 * this.lb;
		aFloatArray4[3] = 1.0F;
		this.anOpengl1.glLightModelfv(2899, aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(IIII)V", line = 2169)
	@Override
	public void method2864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass200_1.method5122(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "(II)V", line = 2172)
	public void method843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt619 = arg0;
		this.anInt594 = arg1;
		this.anOpengl1.glViewport(arg0, arg1, this.anInt582, this.anInt587);
		this.method825();
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(Z)V", line = 2178)
	@Override
	public void method2876(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!pr;IIII)Lclient!gn;", line = 2180)
	@Override
	public Class31 method2866(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class31_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!bf", name = "pb", descriptor = "()V", line = 2183)
	public void method844() {
		if (this.anInt602 == 4) {
			return;
		}
		this.method788();
		this.method786(false);
		this.method782(false);
		this.method813(false);
		this.method817(false);
		this.method784();
		this.method779(1);
		this.method792(1);
		this.anInt602 = 4;
	}

	@OriginalMember(owner = "client!bf", name = "qb", descriptor = "()V", line = 2202)
	public void method845() {
		if (this.anInt602 == 16) {
			return;
		}
		this.method827();
		this.method786(true);
		this.method813(true);
		this.method817(true);
		this.method779(1);
		this.method792(1);
		this.anInt602 = 16;
	}

	@OriginalMember(owner = "client!bf", name = "H", descriptor = "()Z", line = 2215)
	@Override
	public boolean method2896() {
		return this.aBoolean44;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!rc;Lclient!rc;FLclient!rc;)Lclient!rc;", line = 2218)
	@Override
	public Class42 method2829(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class42 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean38 && this.aBoolean36) {
			@Pc(11) Class42_Sub1_Sub1 local11 = null;
			@Pc(14) Class42_Sub1 local14 = (Class42_Sub1) arg0;
			@Pc(17) Class42_Sub1 local17 = (Class42_Sub1) arg1;
			@Pc(21) Class8_Sub3 local21 = local14.method2430();
			@Pc(25) Class8_Sub3 local25 = local17.method2430();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt5157 > local25.anInt5157 ? local21.anInt5157 : local25.anInt5157;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class42_Sub1_Sub1) {
					@Pc(52) Class42_Sub1_Sub1 local52 = (Class42_Sub1_Sub1) arg3;
					if (local52.method1611() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class42_Sub1_Sub1(this, local40);
				}
				local11.method1612(arg2, local25, local21);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(IIIIII)Z", line = 2256)
	@Override
	public boolean method2843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass14_Sub2_2.aFloat51 * (float) arg0 + this.aClass14_Sub2_2.aFloat58 * (float) arg1 + this.aClass14_Sub2_2.aFloat54 * (float) arg2 + this.aClass14_Sub2_2.aFloat59;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass14_Sub2_2.aFloat51 * (float) arg3 + this.aClass14_Sub2_2.aFloat58 * (float) arg4 + this.aClass14_Sub2_2.aFloat54 * (float) arg5 + this.aClass14_Sub2_2.aFloat59;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt617 && local55 < (float) this.anInt617 || !(!(local24 > (float) this.anInt618) || !(local55 > (float) this.anInt618))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt596 * (this.aClass14_Sub2_2.aFloat55 * (float) arg0 + this.aClass14_Sub2_2.aFloat50 * (float) arg1 + this.aClass14_Sub2_2.aFloat57 * (float) arg2 + this.aClass14_Sub2_2.aFloat60) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt596 * (this.aClass14_Sub2_2.aFloat55 * (float) arg3 + this.aClass14_Sub2_2.aFloat50 * (float) arg4 + this.aClass14_Sub2_2.aFloat57 * (float) arg5 + this.aClass14_Sub2_2.aFloat60) / local55);
		if ((float) local119 < this.aFloat11 && (float) local151 < this.aFloat11 || (float) local119 > this.aFloat9 && (float) local151 > this.aFloat9) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt600 * (this.aClass14_Sub2_2.aFloat61 * (float) arg0 + this.aClass14_Sub2_2.aFloat52 * (float) arg1 + this.aClass14_Sub2_2.aFloat56 * (float) arg2 + this.aClass14_Sub2_2.aFloat53) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt600 * (this.aClass14_Sub2_2.aFloat61 * (float) arg3 + this.aClass14_Sub2_2.aFloat52 * (float) arg4 + this.aClass14_Sub2_2.aFloat56 * (float) arg5 + this.aClass14_Sub2_2.aFloat53) / local55);
			return (!((float) local209 < this.aFloat6) || !((float) local241 < this.aFloat6)) && (!((float) local209 > this.aFloat20) || !((float) local241 > this.aFloat20));
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!kg;)V", line = 2287)
	@Override
	public void method2848(@OriginalArg(0) Class2_Sub22 arg0) {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZZ)V", line = 2289)
	public void method846(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt598) {
			if (arg0 < 0) {
				this.method819();
				this.method848(null);
				if (!this.aBoolean50) {
					this.aClass95_1.method2507(arg2, arg1, 0);
				}
			} else {
				@Pc(11) Class8_Sub1 local11 = this.aClass56_1.method1790(arg0);
				@Pc(17) Class229 local17 = this.anInterface2_5.method2660(arg0);
				if (local17.aByte68 == 0 && local17.aByte69 == 0) {
					this.method819();
				} else {
					@Pc(30) int local30 = local17.aBoolean441 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method834((float) (this.anInt584 % local34 * local17.aByte68) / (float) local34, (float) (this.anInt584 % local34 * local17.aByte69) / (float) local34, 0.0F);
				}
				if (this.aBoolean50) {
					this.aClass95_1.method2507(arg2, arg1, 3);
					this.method848(local11);
				} else {
					this.aClass95_1.method2507(arg2, arg1, local17.aByte67);
					this.aClass95_1.method2506(false, local17.aByte72);
					if (!this.aClass95_1.method2509(local11)) {
						this.method848(local11);
					}
				}
			}
			this.anInt598 = arg0;
		}
		this.anInt602 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([Lclient!gn;Lclient!on;[Lclient!au;I)V", line = 2340)
	@Override
	public void method2883(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class12_Sub2[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method3836(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)I", line = 2351)
	@Override
	public int method2865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(IIII)[I", line = 2357)
	@Override
	public int[] method2852() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl1.glReadPixels(0, this.anInt587 - local6, 36, 1, 32993, this.anInt592, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()V", line = 2370)
	@Override
	public void method5792() {
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(FF)V", line = 2374)
	public void method847(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat10 = arg0;
		this.aFloat14 = arg1;
		if (!this.aBoolean50) {
			this.method809();
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!kq;)V", line = 2382)
	public void method848(@OriginalArg(0) Class8 arg0) {
		@Pc(5) Class8 local5 = this.aClass8Array1[this.anInt609];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl1.glDisable(local5.anInt6869);
			} else {
				if (local5 == null) {
					this.anOpengl1.glEnable(arg0.anInt6869);
				} else if (arg0.anInt6869 != local5.anInt6869) {
					this.anOpengl1.glDisable(local5.anInt6869);
					this.anOpengl1.glEnable(arg0.anInt6869);
				}
				this.anOpengl1.glBindTexture(arg0.anInt6869, arg0.method6159());
			}
			this.aClass8Array1[this.anInt609] = arg0;
		}
		this.anInt602 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "()F", line = 2412)
	@Override
	public float method2862() {
		return this.aFloat19;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(II)V", line = 2426)
	@Override
	public void method2881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt613 == arg0 && this.anInt601 == arg1) {
			return;
		}
		this.anInt613 = arg0;
		this.anInt601 = arg1;
		if (!this.aBoolean50) {
			this.method809();
			this.method837();
		}
	}

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "()Z", line = 2440)
	@Override
	public boolean method2894() {
		return this.aClass2_Sub38_Sub1_1.method6305();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2446)
	@Override
	public void method2830(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "()V", line = 2450)
	@Override
	protected void method2841() {
		if (this.anOpengl1 != null) {
			try {
				this.aClass200_1.method5121();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl1 = null;
		}
		if (this.aContext1 != null) {
			this.method805();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean32) {
			Static78.method1904(true);
			this.aBoolean32 = false;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!rc;)V", line = 2484)
	@Override
	public void method2872(@OriginalArg(0) Class42 arg0) {
		this.aClass42_Sub1_1 = (Class42_Sub1) arg0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(FFF)V", line = 2489)
	@Override
	public void method2875(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Class2_Sub38_Sub1.aFloat79 = arg0;
		Class2_Sub38_Sub1.aFloat78 = arg1;
		Class2_Sub38_Sub1.aFloat77 = arg2;
	}

	@OriginalMember(owner = "client!bf", name = "rb", descriptor = "()V", line = 2497)
	public void method849() {
		if (this.anInt602 == 8) {
			return;
		}
		this.method828();
		this.method786(true);
		this.method813(true);
		this.method817(true);
		this.method779(1);
		this.method792(1);
		this.anInt602 = 8;
	}
}
