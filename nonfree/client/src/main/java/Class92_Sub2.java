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

@OriginalClass("client!ql")
public final class Class92_Sub2 extends Class92 implements Interface4 {

	@OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
	public int anInt5377;

	@OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
	public int anInt5378;

	@OriginalMember(owner = "client!ql", name = "F", descriptor = "I")
	public int anInt5379;

	@OriginalMember(owner = "client!ql", name = "G", descriptor = "Lclient!d;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!ql", name = "K", descriptor = "I")
	private int anInt5382;

	@OriginalMember(owner = "client!ql", name = "O", descriptor = "I")
	public int anInt5384;

	@OriginalMember(owner = "client!ql", name = "P", descriptor = "I")
	public int anInt5385;

	@OriginalMember(owner = "client!ql", name = "W", descriptor = "J")
	private long aLong198;

	@OriginalMember(owner = "client!ql", name = "Y", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!ql", name = "Z", descriptor = "Lclient!os;")
	public Class5_Sub2 aClass5_Sub2_1;

	@OriginalMember(owner = "client!ql", name = "cb", descriptor = "I")
	private int anInt5387;

	@OriginalMember(owner = "client!ql", name = "db", descriptor = "Z")
	public boolean aBoolean458;

	@OriginalMember(owner = "client!ql", name = "eb", descriptor = "Z")
	public boolean aBoolean459;

	@OriginalMember(owner = "client!ql", name = "fb", descriptor = "Lclient!cl;")
	private Interface3 anInterface3_3;

	@OriginalMember(owner = "client!ql", name = "gb", descriptor = "Lclient!bb;")
	private Class19 aClass19_13;

	@OriginalMember(owner = "client!ql", name = "ib", descriptor = "Z")
	public boolean aBoolean460;

	@OriginalMember(owner = "client!ql", name = "jb", descriptor = "Ljava/lang/String;")
	private String aString194;

	@OriginalMember(owner = "client!ql", name = "kb", descriptor = "I")
	private int anInt5388;

	@OriginalMember(owner = "client!ql", name = "mb", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!ql", name = "nb", descriptor = "Z")
	private boolean aBoolean461;

	@OriginalMember(owner = "client!ql", name = "vb", descriptor = "F")
	private float aFloat53;

	@OriginalMember(owner = "client!ql", name = "xb", descriptor = "I")
	public int anInt5393;

	@OriginalMember(owner = "client!ql", name = "yb", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!ql", name = "zb", descriptor = "[Lclient!na;")
	private Class70[] aClass70Array1;

	@OriginalMember(owner = "client!ql", name = "Bb", descriptor = "Lclient!jo;")
	public Class70_Sub4 aClass70_Sub4_4;

	@OriginalMember(owner = "client!ql", name = "Cb", descriptor = "Lclient!bi;")
	public Class23_Sub1 aClass23_Sub1_1;

	@OriginalMember(owner = "client!ql", name = "Db", descriptor = "Lclient!cl;")
	public Interface3 anInterface3_4;

	@OriginalMember(owner = "client!ql", name = "Eb", descriptor = "I")
	private int anInt5394;

	@OriginalMember(owner = "client!ql", name = "Fb", descriptor = "I")
	private int anInt5395;

	@OriginalMember(owner = "client!ql", name = "Hb", descriptor = "Z")
	private boolean aBoolean465;

	@OriginalMember(owner = "client!ql", name = "Ib", descriptor = "Lclient!ip;")
	private Interface6 anInterface6_5;

	@OriginalMember(owner = "client!ql", name = "Jb", descriptor = "Z")
	public boolean aBoolean466;

	@OriginalMember(owner = "client!ql", name = "Lb", descriptor = "Lclient!os;")
	public Class5_Sub2 aClass5_Sub2_2;

	@OriginalMember(owner = "client!ql", name = "Mb", descriptor = "Lclient!os;")
	public Class5_Sub2 aClass5_Sub2_3;

	@OriginalMember(owner = "client!ql", name = "Nb", descriptor = "Lclient!dh;")
	private Class49_Sub1 aClass49_Sub1_1;

	@OriginalMember(owner = "client!ql", name = "Ob", descriptor = "I")
	private int anInt5397;

	@OriginalMember(owner = "client!ql", name = "Pb", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!ql", name = "Qb", descriptor = "Lclient!bi;")
	public Class23_Sub1 aClass23_Sub1_2;

	@OriginalMember(owner = "client!ql", name = "Tb", descriptor = "[Z")
	private boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!ql", name = "Ub", descriptor = "Z")
	private boolean aBoolean467;

	@OriginalMember(owner = "client!ql", name = "Wb", descriptor = "[Lclient!bb;")
	private Class19[] aClass19Array1;

	@OriginalMember(owner = "client!ql", name = "Xb", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!ql", name = "ac", descriptor = "Z")
	private boolean aBoolean468;

	@OriginalMember(owner = "client!ql", name = "bc", descriptor = "Lclient!os;")
	public Class5_Sub2 aClass5_Sub2_4;

	@OriginalMember(owner = "client!ql", name = "cc", descriptor = "Lclient!vr;")
	public Class214 aClass214_4;

	@OriginalMember(owner = "client!ql", name = "ec", descriptor = "Z")
	private boolean aBoolean469;

	@OriginalMember(owner = "client!ql", name = "fc", descriptor = "Ljava/lang/String;")
	private String aString195;

	@OriginalMember(owner = "client!ql", name = "gc", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!ql", name = "kc", descriptor = "Lclient!os;")
	public Class5_Sub2 aClass5_Sub2_5;

	@OriginalMember(owner = "client!ql", name = "mc", descriptor = "I")
	public int anInt5405;

	@OriginalMember(owner = "client!ql", name = "nc", descriptor = "Lclient!jo;")
	public Class70_Sub4 aClass70_Sub4_5;

	@OriginalMember(owner = "client!ql", name = "oc", descriptor = "Lclient!bb;")
	private Class19 aClass19_14;

	@OriginalMember(owner = "client!ql", name = "pc", descriptor = "Z")
	private boolean aBoolean470;

	@OriginalMember(owner = "client!ql", name = "qc", descriptor = "F")
	private float aFloat62;

	@OriginalMember(owner = "client!ql", name = "rc", descriptor = "Z")
	private boolean aBoolean471;

	@OriginalMember(owner = "client!ql", name = "sc", descriptor = "Lclient!gn;")
	private Class70_Sub4_Sub1 aClass70_Sub4_Sub1_4;

	@OriginalMember(owner = "client!ql", name = "tc", descriptor = "Lclient!jo;")
	public Class70_Sub4 aClass70_Sub4_6;

	@OriginalMember(owner = "client!ql", name = "uc", descriptor = "I")
	private int anInt5406;

	@OriginalMember(owner = "client!ql", name = "xc", descriptor = "Z")
	public boolean aBoolean472;

	@OriginalMember(owner = "client!ql", name = "yc", descriptor = "Z")
	public boolean aBoolean473;

	@OriginalMember(owner = "client!ql", name = "Dc", descriptor = "Z")
	private boolean aBoolean474;

	@OriginalMember(owner = "client!ql", name = "Ec", descriptor = "Lclient!os;")
	public Class5_Sub2 aClass5_Sub2_6;

	@OriginalMember(owner = "client!ql", name = "Fc", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!ql", name = "Hc", descriptor = "F")
	private float aFloat66;

	@OriginalMember(owner = "client!ql", name = "Ic", descriptor = "Z")
	private boolean aBoolean475;

	@OriginalMember(owner = "client!ql", name = "Kc", descriptor = "I")
	private int anInt5412;

	@OriginalMember(owner = "client!ql", name = "Oc", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!ql", name = "Pc", descriptor = "I")
	private int anInt5415;

	@OriginalMember(owner = "client!ql", name = "Rc", descriptor = "I")
	private int anInt5416;

	@OriginalMember(owner = "client!ql", name = "Sc", descriptor = "Z")
	private boolean aBoolean476;

	@OriginalMember(owner = "client!ql", name = "Tc", descriptor = "Z")
	private boolean aBoolean477;

	@OriginalMember(owner = "client!ql", name = "Uc", descriptor = "Z")
	public boolean aBoolean478;

	@OriginalMember(owner = "client!ql", name = "Xc", descriptor = "I")
	public int anInt5418;

	@OriginalMember(owner = "client!ql", name = "Yc", descriptor = "Z")
	private boolean aBoolean480;

	@OriginalMember(owner = "client!ql", name = "Zc", descriptor = "Lclient!bb;")
	private Class19 aClass19_15;

	@OriginalMember(owner = "client!ql", name = "cd", descriptor = "I")
	private int anInt5419;

	@OriginalMember(owner = "client!ql", name = "dd", descriptor = "I")
	private int anInt5420;

	@OriginalMember(owner = "client!ql", name = "y", descriptor = "Lclient!hf;")
	private final Class89 aClass89_1 = new Class89();

	@OriginalMember(owner = "client!ql", name = "C", descriptor = "Lclient!ib;")
	private final Class23 aClass23_4 = new Class23_Sub1();

	@OriginalMember(owner = "client!ql", name = "H", descriptor = "I")
	private int anInt5380 = -1;

	@OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
	public final int anInt5381 = 8;

	@OriginalMember(owner = "client!ql", name = "J", descriptor = "Z")
	private boolean aBoolean455 = false;

	@OriginalMember(owner = "client!ql", name = "M", descriptor = "[Lclient!d;")
	private final Interface4[] anInterface4Array1 = new Interface4[4];

	@OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
	public final int anInt5383 = 3;

	@OriginalMember(owner = "client!ql", name = "L", descriptor = "Lclient!mk;")
	private final Class130 aClass130_118 = new Class130();

	@OriginalMember(owner = "client!ql", name = "Q", descriptor = "Lclient!mk;")
	private final Class130 aClass130_119 = new Class130();

	@OriginalMember(owner = "client!ql", name = "R", descriptor = "Lclient!mk;")
	private final Class130 aClass130_120 = new Class130();

	@OriginalMember(owner = "client!ql", name = "S", descriptor = "Lclient!mk;")
	private final Class130 aClass130_121 = new Class130();

	@OriginalMember(owner = "client!ql", name = "T", descriptor = "Lclient!mk;")
	private final Class130 aClass130_122 = new Class130();

	@OriginalMember(owner = "client!ql", name = "U", descriptor = "Lclient!mk;")
	private final Class130 aClass130_123 = new Class130();

	@OriginalMember(owner = "client!ql", name = "V", descriptor = "Lclient!mk;")
	private final Class130 aClass130_124 = new Class130();

	@OriginalMember(owner = "client!ql", name = "hb", descriptor = "[F")
	private final float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!ql", name = "ub", descriptor = "I")
	public int anInt5392 = 3584;

	@OriginalMember(owner = "client!ql", name = "Ab", descriptor = "F")
	public float aFloat55 = 1.0F;

	@OriginalMember(owner = "client!ql", name = "tb", descriptor = "Z")
	private boolean aBoolean463 = true;

	@OriginalMember(owner = "client!ql", name = "rb", descriptor = "I")
	public int anInt5390 = 50;

	@OriginalMember(owner = "client!ql", name = "Vb", descriptor = "F")
	public float aFloat58 = 3584.0F;

	@OriginalMember(owner = "client!ql", name = "Sb", descriptor = "I")
	private int anInt5398 = 0;

	@OriginalMember(owner = "client!ql", name = "hc", descriptor = "I")
	public int anInt5401 = 0;

	@OriginalMember(owner = "client!ql", name = "ic", descriptor = "I")
	public int anInt5402 = 0;

	@OriginalMember(owner = "client!ql", name = "lc", descriptor = "I")
	private int anInt5404 = 0;

	@OriginalMember(owner = "client!ql", name = "Gb", descriptor = "I")
	private int anInt5396 = 8448;

	@OriginalMember(owner = "client!ql", name = "jc", descriptor = "I")
	private int anInt5403 = 0;

	@OriginalMember(owner = "client!ql", name = "Zb", descriptor = "I")
	private int anInt5400 = -1;

	@OriginalMember(owner = "client!ql", name = "vc", descriptor = "I")
	public int anInt5407 = 512;

	@OriginalMember(owner = "client!ql", name = "qb", descriptor = "[F")
	private final float[] aFloatArray15 = new float[4];

	@OriginalMember(owner = "client!ql", name = "sb", descriptor = "I")
	private int anInt5391 = -1;

	@OriginalMember(owner = "client!ql", name = "Kb", descriptor = "[F")
	public final float[] aFloatArray16 = new float[4];

	@OriginalMember(owner = "client!ql", name = "Yb", descriptor = "I")
	private int anInt5399 = 0;

	@OriginalMember(owner = "client!ql", name = "ab", descriptor = "I")
	public int anInt5386 = -1;

	@OriginalMember(owner = "client!ql", name = "Jc", descriptor = "[F")
	private final float[] aFloatArray17 = new float[16];

	@OriginalMember(owner = "client!ql", name = "lb", descriptor = "F")
	public float lb = -1.0F;

	@OriginalMember(owner = "client!ql", name = "wc", descriptor = "I")
	private int anInt5408 = 0;

	@OriginalMember(owner = "client!ql", name = "Qc", descriptor = "F")
	public float aFloat68 = 1.0F;

	@OriginalMember(owner = "client!ql", name = "Lc", descriptor = "I")
	private int anInt5413 = 8448;

	@OriginalMember(owner = "client!ql", name = "Nc", descriptor = "I")
	public int anInt5414 = -1;

	@OriginalMember(owner = "client!ql", name = "ob", descriptor = "I")
	public int anInt5389 = 512;

	@OriginalMember(owner = "client!ql", name = "dc", descriptor = "F")
	public float aFloat60 = 3584.0F;

	@OriginalMember(owner = "client!ql", name = "zc", descriptor = "F")
	private float aFloat63 = 0.0F;

	@OriginalMember(owner = "client!ql", name = "Cc", descriptor = "I")
	public int anInt5411 = -1;

	@OriginalMember(owner = "client!ql", name = "Ac", descriptor = "I")
	private int anInt5409 = 0;

	@OriginalMember(owner = "client!ql", name = "Gc", descriptor = "F")
	private float aFloat65 = 1.0F;

	@OriginalMember(owner = "client!ql", name = "Mc", descriptor = "[F")
	private final float[] aFloatArray18 = new float[4];

	@OriginalMember(owner = "client!ql", name = "Rb", descriptor = "F")
	public float aFloat57 = -1.0F;

	@OriginalMember(owner = "client!ql", name = "Wc", descriptor = "I")
	private int anInt5417 = 0;

	@OriginalMember(owner = "client!ql", name = "bd", descriptor = "F")
	private float aFloat70 = 1.0F;

	@OriginalMember(owner = "client!ql", name = "ad", descriptor = "F")
	public float aFloat69 = 1.0F;

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas9;

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "Lclient!al;")
	public final Interface1 anInterface1_6;

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl2;

	@OriginalMember(owner = "client!ql", name = "Bc", descriptor = "I")
	public final int anInt5410;

	@OriginalMember(owner = "client!ql", name = "bb", descriptor = "Z")
	private boolean aBoolean457;

	@OriginalMember(owner = "client!ql", name = "X", descriptor = "Z")
	public boolean aBoolean456;

	@OriginalMember(owner = "client!ql", name = "pb", descriptor = "Z")
	public boolean aBoolean462;

	@OriginalMember(owner = "client!ql", name = "Vc", descriptor = "Z")
	private boolean aBoolean479;

	@OriginalMember(owner = "client!ql", name = "wb", descriptor = "Z")
	public boolean aBoolean464;

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "Lclient!is;")
	public final Class99 aClass99_1;

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "Lclient!ih;")
	private final Class98 aClass98_1;

	@OriginalMember(owner = "client!ql", name = "x", descriptor = "Lclient!fo;")
	private final Class76 aClass76_1;

	@OriginalMember(owner = "client!ql", name = "z", descriptor = "Lclient!bh;")
	private final Class4_Sub3_Sub1 aClass4_Sub3_Sub1_1;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!al;IILclient!lh;)V")
	public Class92_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class120 arg4) {
		this.aCanvas9 = arg0;
		this.anInterface1_6 = arg1;
		this.anInt5370 = arg2;
		@Pc(186) int local186 = 0;
		while (!this.aCanvas9.isShowing()) {
			if (local186++ > 5) {
				throw new RuntimeException("");
			}
			Static270.method5481(1000L);
		}
		this.aCanvas9.setIgnoreRepaint(true);
		try {
			if (!Static261.aBoolean454) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static261.aBoolean454 = Boolean.TRUE;
				} else {
					@Pc(218) Class51 local218 = arg4.method3222(this.getClass());
					while (local218.anInt1229 == 0) {
						Static270.method5481(100L);
					}
					if (local218.anInt1229 == 1) {
						Static261.aBoolean454 = Boolean.TRUE;
					}
				}
			}
			if (!Static261.aBoolean454) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas9, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method4567();
				this.anOpengl2 = this.aContext1.getGL();
				@Pc(283) int local283 = this.method4596();
				if (local283 != 0) {
					throw new RuntimeException("");
				}
				this.anInt5410 = this.aBoolean459 ? 33639 : 5121;
				@Pc(302) String local302 = this.aString195.toLowerCase();
				@Pc(306) String local306 = this.aString194.toLowerCase();
				if (local306.indexOf("radeon") != -1) {
					@Pc(313) int local313 = 0;
					@Pc(315) boolean local315 = false;
					@Pc(317) boolean local317 = false;
					@Pc(325) String[] local325 = Static304.method5143(local306.replace('/', ' '), ' ');
					for (@Pc(327) int local327 = 0; local327 < local325.length; local327++) {
						@Pc(335) String local335 = local325[local327];
						try {
							if (local335.length() > 0) {
								if (local335.charAt(0) == 'x' && local335.length() >= 3 && Static203.method3608(local335.substring(1, 3))) {
									local335 = local335.substring(1);
									local317 = true;
								}
								if (local335.equals("hd")) {
									local315 = true;
								} else {
									if (local335.startsWith("hd")) {
										local335 = local335.substring(2);
										local315 = true;
									}
									if (local335.length() >= 4 && Static203.method3608(local335.substring(0, 4))) {
										local313 = Static120.method2435(local335.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(399) Exception local399) {
						}
					}
					if (!local317 && !local315) {
						if (local313 >= 7000 && local313 <= 7999) {
							this.aBoolean457 = false;
						}
						if (local313 >= 7000 && local313 <= 9250) {
							this.aBoolean456 = false;
						}
					}
					if (!local315 || local313 < 4000) {
						this.aBoolean462 = false;
					}
					this.aBoolean479 = this.aBoolean457;
				}
				if (local302.contains("intel")) {
					this.aBoolean464 = false;
				}
				if (this.aBoolean457) {
					try {
						@Pc(448) int[] local448 = new int[1];
						this.anOpengl2.glGenBuffersARB(1, local448, 0);
					} catch (@Pc(456) Throwable local456) {
						throw new RuntimeException("", local456);
					}
				}
				this.method4615(this);
				this.method4482();
				this.method4612();
				new Class110(this);
				this.aClass99_1 = new Class99(this, this.anInterface1_6);
				Static288.method4933(true);
				this.aBoolean455 = true;
				this.aClass98_1 = new Class98(this);
				this.aClass76_1 = new Class76(this);
				this.aClass4_Sub3_Sub1_1 = new Class4_Sub3_Sub1(this);
				this.method4587();
				this.anOpengl2.glClear(16640);
				local186 = 0;
				while (true) {
					try {
						this.aContext1.swapBuffers();
						break;
					} catch (@Pc(521) Exception local521) {
						if (local186++ > 5) {
							throw new RuntimeException("");
						}
						Static270.method5481(100L);
					}
				}
				this.anOpengl2.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(540) Throwable local540) {
			local540.printStackTrace();
			this.method4503();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local540);
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)Lclient!ue;")
	@Override
	public Class4_Sub39 method4498() {
		return null;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(FF)V")
	public void method4543(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat70 = arg0;
		this.aFloat63 = arg1;
		if (!this.aBoolean458) {
			this.method4573();
		}
	}

	@OriginalMember(owner = "client!ql", name = "M", descriptor = "()V")
	private void method4544() {
		if (this.anInt5399 <= this.anInt5409 && this.anInt5403 <= this.anInt5408) {
			this.anOpengl2.glScissor(this.anInt5417 + this.anInt5399, this.anInt5404 + this.anInt5377 - this.anInt5408, this.anInt5409 - this.anInt5399, this.anInt5408 - this.anInt5403);
		} else {
			this.anOpengl2.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!pe;IIII)Lclient!jn;")
	@Override
	public Class5 method4513(@OriginalArg(0) Class153 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class5_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(IIIIII)Lclient!mc;")
	@Override
	public Class49 method4448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean466 ? new Class49_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ql", name = "N", descriptor = "()V")
	private void method4545() {
		if (this.aBoolean476) {
			this.anOpengl2.glMatrixMode(5890);
			this.anOpengl2.glLoadIdentity();
			this.anOpengl2.glMatrixMode(5888);
			this.aBoolean476 = false;
		}
	}

	@OriginalMember(owner = "client!ql", name = "G", descriptor = "()Z")
	@Override
	public boolean method4515() {
		return true;
	}

	@OriginalMember(owner = "client!ql", name = "O", descriptor = "()V")
	private void method4546() {
		if (this.aBoolean477 && this.aBoolean458 | this.anInt5411 >= 0) {
			this.anOpengl2.glEnable(2912);
		} else {
			this.anOpengl2.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "()Z")
	@Override
	public boolean method4447() {
		return true;
	}

	@OriginalMember(owner = "client!ql", name = "P", descriptor = "()V")
	private void method4547() {
		if (this.anInt5412 == 1) {
			return;
		}
		this.method4580();
		this.method4588(false);
		this.method4607(false);
		this.method4606(false);
		this.method4593(false);
		this.method4548(null);
		this.method4604();
		this.method4570(0);
		this.anInt5412 = 1;
	}

	@OriginalMember(owner = "client!ql", name = "C", descriptor = "()I")
	@Override
	public int method4499() {
		return 4;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!na;)V")
	public void method4548(@OriginalArg(0) Class70 arg0) {
		@Pc(5) Class70 local5 = this.aClass70Array1[this.anInt5415];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl2.glDisable(local5.anInt2351);
			} else {
				if (local5 == null) {
					this.anOpengl2.glEnable(arg0.anInt2351);
				} else if (arg0.anInt2351 != local5.anInt2351) {
					this.anOpengl2.glDisable(local5.anInt2351);
					this.anOpengl2.glEnable(arg0.anInt2351);
				}
				this.anOpengl2.glBindTexture(arg0.anInt2351, arg0.method1977());
			}
			this.aClass70Array1[this.anInt5415] = arg0;
		}
		this.anInt5412 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method4526(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class4_Sub36 local16;
		while (!this.aClass130_119.method3508()) {
			local16 = (Class4_Sub36) this.aClass130_119.method3500();
			Static261.anIntArray447[local1++] = (int) local16.aLong259;
			this.anInt5385 -= local16.anInt5967;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteBuffersARB(local1, Static261.anIntArray447, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteBuffersARB(local1, Static261.anIntArray447, 0);
			local1 = 0;
		}
		while (!this.aClass130_120.method3508()) {
			local16 = (Class4_Sub36) this.aClass130_120.method3500();
			Static261.anIntArray447[local1++] = (int) local16.aLong259;
			this.anInt5378 -= local16.anInt5967;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteTextures(local1, Static261.anIntArray447, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteTextures(local1, Static261.anIntArray447, 0);
			local1 = 0;
		}
		while (!this.aClass130_121.method3508()) {
			local16 = (Class4_Sub36) this.aClass130_121.method3500();
			Static261.anIntArray447[local1++] = local16.anInt5967;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteFramebuffersEXT(local1, Static261.anIntArray447, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteFramebuffersEXT(local1, Static261.anIntArray447, 0);
			local1 = 0;
		}
		while (!this.aClass130_122.method3508()) {
			local16 = (Class4_Sub36) this.aClass130_122.method3500();
			Static261.anIntArray447[local1++] = (int) local16.aLong259;
			this.anInt5382 -= local16.anInt5967;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static261.anIntArray447, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static261.anIntArray447, 0);
			local1 = 0;
		}
		while (!this.aClass130_123.method3508()) {
			local16 = (Class4_Sub36) this.aClass130_123.method3500();
			Static261.anIntArray447[local1++] = (int) local16.aLong259;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteProgramsARB(local1, Static261.anIntArray447, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteProgramsARB(local1, Static261.anIntArray447, 0);
		}
		while (!this.aClass130_118.method3508()) {
			local16 = (Class4_Sub36) this.aClass130_118.method3500();
			this.anOpengl2.glDeleteLists((int) local16.aLong259, local16.anInt5967);
		}
		while (!this.aClass130_124.method3508()) {
			local16 = (Class4_Sub36) this.aClass130_124.method3500();
			this.anOpengl2.glDeleteObjectARB(local16.anInt5967);
		}
		while (!this.aClass130_118.method3508()) {
			local16 = (Class4_Sub36) this.aClass130_118.method3500();
			this.anOpengl2.glDeleteLists((int) local16.aLong259, local16.anInt5967);
		}
		if (this.method4475() > 100663296 && Static274.method4763() > this.aLong198 + 60000L) {
			System.gc();
			this.aLong198 = Static274.method4763();
		}
		this.anInt5384 = local5;
	}

	@OriginalMember(owner = "client!ql", name = "z", descriptor = "()Z")
	@Override
	public boolean method4491() {
		return true;
	}

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "()I")
	@Override
	public int method4475() {
		return this.anInt5385 + this.anInt5378 + this.anInt5382;
	}

	@OriginalMember(owner = "client!ql", name = "J", descriptor = "()V")
	@Override
	public void method4531() {
	}

	@OriginalMember(owner = "client!ql", name = "Q", descriptor = "()V")
	private void method4549() {
		@Pc(11) float local11 = (float) -this.anInt5401 * this.aFloat65 / (float) this.anInt5407;
		@Pc(23) float local23 = (float) -this.anInt5402 * this.aFloat65 / (float) this.anInt5389;
		@Pc(37) float local37 = (float) (this.anInt5379 - this.anInt5401) * this.aFloat65 / (float) this.anInt5407;
		@Pc(51) float local51 = (float) (this.anInt5377 - this.anInt5402) * this.aFloat65 / (float) this.anInt5389;
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt5390 - this.aFloat61), (double) ((float) this.anInt5392 - this.aFloat61));
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I[BIZ)Lclient!ip;")
	public Interface6 method4550(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface6) (this.aBoolean457 && (!arg3 || this.aBoolean479) ? new Class54_Sub2(this, arg0, arg1, arg2, arg3) : new Class73_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!ql", name = "R", descriptor = "()V")
	public void method4551() {
		if (this.anInt5412 == 8) {
			return;
		}
		this.method4582();
		this.method4588(true);
		this.method4606(true);
		this.method4593(true);
		this.method4560(1);
		this.method4570(1);
		this.anInt5412 = 8;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!ip;")
	public Interface6 method4552(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface6) (this.aBoolean457 ? new Class54_Sub2(this, arg0, arg1, false) : new Class73_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!mc;Lclient!mc;FLclient!mc;)Lclient!mc;")
	@Override
	public Class49 method4512(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class49 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean466 && this.aBoolean464) {
			@Pc(11) Class49_Sub1_Sub1 local11 = null;
			@Pc(14) Class49_Sub1 local14 = (Class49_Sub1) arg0;
			@Pc(17) Class49_Sub1 local17 = (Class49_Sub1) arg1;
			@Pc(21) Class70_Sub2 local21 = local14.method4781();
			@Pc(25) Class70_Sub2 local25 = local17.method4781();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt2161 > local25.anInt2161 ? local21.anInt2161 : local25.anInt2161;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class49_Sub1_Sub1) {
					@Pc(52) Class49_Sub1_Sub1 local52 = (Class49_Sub1_Sub1) arg3;
					if (local52.method4623() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class49_Sub1_Sub1(this, local40);
				}
				local11.method4624(local21, local25, arg2);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIILclient!go;II)V")
	@Override
	public void method4487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class84 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class84_Sub2 local2 = (Class84_Sub2) arg5;
		@Pc(5) Class70_Sub4_Sub1 local5 = local2.aClass70_Sub4_Sub1_5;
		this.method4619();
		this.method4548(local2.aClass70_Sub4_Sub1_5);
		this.method4560(1);
		this.method4569(7681, 8448);
		this.method4578(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat24 / (float) local5.anInt2357;
		@Pc(37) float local37 = local5.aFloat23 / (float) local5.anInt2356;
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
		this.method4578(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!bb;)V")
	public void method4553(@OriginalArg(0) Class19 arg0) {
		@Pc(2) Interface6 local2 = arg0.anInterface6_1;
		this.method4562(local2);
		local2.method4305(arg0);
		this.aClass19_14 = arg0;
	}

	@OriginalMember(owner = "client!ql", name = "D", descriptor = "()V")
	@Override
	protected void method4503() {
		if (this.anOpengl2 != null) {
			try {
				this.aClass76_1.method1645();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl2 = null;
		}
		if (this.aContext1 != null) {
			this.method4616();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean455) {
			Static107.method5710(true);
			this.aBoolean455 = false;
		}
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "()V")
	@Override
	public void method4450() {
		@Pc(2) int local2 = this.anInt5399;
		@Pc(5) int local5 = this.anInt5409;
		@Pc(8) int local8 = this.anInt5403;
		@Pc(11) int local11 = this.anInt5408;
		this.method4467();
		this.anOpengl2.glReadBuffer(1028);
		this.anOpengl2.glDrawBuffer(1029);
		this.method4563();
		this.method4588(false);
		this.method4607(false);
		this.method4606(false);
		this.method4593(false);
		this.method4548(null);
		this.method4604();
		this.method4570(0);
		this.method4560(0);
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRasterPos2i(0, 0);
		this.anOpengl2.glCopyPixels(0, 0, this.anInt5379, this.anInt5377, 6144);
		this.anOpengl2.glFlush();
		this.anOpengl2.glReadBuffer(1029);
		this.anOpengl2.glDrawBuffer(1029);
		this.method4459(local2, local8, local5, local11);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)V")
	public void method4554(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4598(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ql", name = "S", descriptor = "()V")
	public void method4555() {
		if (this.anInt5412 == 16) {
			return;
		}
		this.method4620();
		this.method4588(true);
		this.method4606(true);
		this.method4593(true);
		this.method4560(1);
		this.method4570(1);
		this.anInt5412 = 16;
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "()I")
	@Override
	public int method4444() {
		@Pc(2) int local2 = this.anInt5419;
		this.anInt5419 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II[I[I)Lclient!go;")
	@Override
	public Class84 method4480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static366.method5117(arg0, arg3, arg1, this, arg2);
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(III)V")
	public void method4556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!cl;III)V")
	public void method4557(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4571(arg0);
		arg0.method4364(arg1, arg2);
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(IIII)V")
	@Override
	public void method4535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass76_1.method1648(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ql", name = "T", descriptor = "()V")
	private void method4558() {
		this.aFloat51 = this.anInt5399 - this.anInt5401;
		this.aFloat64 = this.anInt5409 - this.anInt5401;
		this.aFloat52 = this.anInt5403 - this.anInt5402;
		this.aFloat54 = this.anInt5408 - this.anInt5402;
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(II)I")
	@Override
	public int method4501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II[[I[[IIII)Lclient!bl;")
	@Override
	public Class26 method4518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class26_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ql", name = "y", descriptor = "()F")
	@Override
	public float method4490() {
		return this.aFloat59;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(FFFFFF)V")
	private void method4559(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		@Pc(6) float[] local6 = this.aFloatArray17;
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
		local6[10] = this.aFloat53 = -(arg5 + arg4) / (arg5 - arg4);
		local6[11] = -1.0F;
		local6[12] = 0.0F;
		local6[13] = 0.0F;
		local6[14] = this.aFloat62 = -(local3 * arg5) / (arg5 - arg4);
		local6[15] = 0.0F;
		this.method4586();
	}

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "(I)V")
	public void method4560(@OriginalArg(0) int arg0) {
		if (this.anInt5397 == arg0) {
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
		if (local10 != this.aBoolean475) {
			this.anOpengl2.glColorMask(local10, local10, local10, true);
			this.aBoolean475 = local10;
		}
		if (local12 != this.aBoolean469) {
			if (local12) {
				this.anOpengl2.glEnable(3008);
			} else {
				this.anOpengl2.glDisable(3008);
			}
			this.aBoolean469 = local12;
		}
		if (local8 != this.anInt5394) {
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
			this.anInt5394 = local8;
		}
		this.anInt5397 = arg0;
		this.anInt5412 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "()Z")
	@Override
	public boolean method4463() {
		return true;
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void method4524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(III)V")
	public void method4561(@OriginalArg(2) int arg0) {
		this.anOpengl2.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!mc;)V")
	@Override
	public void method4517(@OriginalArg(0) Class49 arg0) {
		this.aClass49_Sub1_1 = (Class49_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ip;)V")
	public void method4562(@OriginalArg(0) Interface6 arg0) {
		if (this.anInterface6_5 != arg0 && this.aBoolean457) {
			this.anOpengl2.glBindBufferARB(34962, arg0.method4362());
			this.anInterface6_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!ql", name = "U", descriptor = "()V")
	public void method4563() {
		if (this.anInt5388 != 0) {
			this.anInt5388 = 0;
			this.anInt5412 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ql", name = "V", descriptor = "()V")
	private void method4564() {
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadMatrixf(this.aFloatArray17, 0);
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ql", name = "W", descriptor = "()Lclient!g;")
	public Class70_Sub2 method4565() {
		return this.aClass49_Sub1_1 == null ? null : this.aClass49_Sub1_1.method4781();
	}

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "(I)V")
	public synchronized void method4566(@OriginalArg(0) int arg0) {
		@Pc(4) Class4_Sub36 local4 = new Class4_Sub36(arg0);
		this.aClass130_121.method3510(local4);
	}

	@OriginalMember(owner = "client!ql", name = "X", descriptor = "()V")
	private void method4567() {
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
			Static270.method5481(1000L);
		}
	}

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "(I)V")
	public void method4568(@OriginalArg(0) int arg0) {
		if (this.anInt5415 != arg0) {
			this.anOpengl2.glActiveTexture(arg0 + 33984);
			this.anInt5415 = arg0;
		}
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(II)V")
	public void method4569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5415 != 0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt5413 != arg0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anInt5413 = arg0;
			local4 = true;
		}
		if (this.anInt5396 != arg1) {
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			this.anInt5396 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt5412 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ql", name = "E", descriptor = "()Z")
	@Override
	public boolean method4504() {
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([IIIII)Lclient!lg;")
	@Override
	public Class60 method4537(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class60_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl2.glLineWidth((float) arg5);
		this.method4496(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl2.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V")
	@Override
	public void method4439(@OriginalArg(0) boolean arg0) {
		this.aBoolean463 = arg0;
		this.method4600();
	}

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "(I)V")
	public void method4570(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4569(7681, 7681);
		} else if (arg0 == 1) {
			this.method4569(8448, 8448);
		} else if (arg0 == 2) {
			this.method4569(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!cl;)V")
	public void method4571(@OriginalArg(0) Interface3 arg0) {
		if (this.anInterface3_3 != arg0 && this.aBoolean457) {
			this.anOpengl2.glBindBufferARB(34963, arg0.method4362());
			this.anInterface3_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "()V")
	@Override
	public void method4454() {
		if (this.aClass4_Sub3_Sub1_1.method425()) {
			this.aClass76_1.method1651(this.aClass4_Sub3_Sub1_1);
			this.aClass99_1.method2714();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(F)V")
	@Override
	public void method4536(@OriginalArg(0) float arg0) {
		if (this.aFloat67 != arg0) {
			this.aFloat67 = arg0;
			this.method4611();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ib;)V")
	@Override
	public void method4530(@OriginalArg(0) Class23 arg0) {
		this.aClass23_Sub1_2 = (Class23_Sub1) arg0;
		this.aClass23_Sub1_1.method464(this.aClass23_Sub1_2);
		if (this.anInt5388 != 1) {
			this.method4591();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(FFFF)V")
	public void method4572(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static261.aFloatArray12[0] = arg0;
		Static261.aFloatArray12[1] = arg1;
		Static261.aFloatArray12[2] = arg2;
		Static261.aFloatArray12[3] = arg3;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static261.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(IIII)V")
	@Override
	public void method4472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5399 < arg0) {
			this.anInt5399 = arg0;
		}
		if (this.anInt5409 > arg2) {
			this.anInt5409 = arg2;
		}
		if (this.anInt5403 < arg1) {
			this.anInt5403 = arg1;
		}
		if (this.anInt5408 > arg3) {
			this.anInt5408 = arg3;
		}
		this.anOpengl2.glEnable(3089);
		this.method4558();
		this.method4544();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ue;)V")
	@Override
	public void method4442(@OriginalArg(0) Class4_Sub39 arg0) {
	}

	@OriginalMember(owner = "client!ql", name = "Y", descriptor = "()V")
	private void method4573() {
		@Pc(15) int local15;
		if (this.aBoolean458) {
			this.anOpengl2.glFogf(2915, 0.0F);
			this.anOpengl2.glFogf(2916, 1.0F);
			local15 = this.anInt5391;
		} else {
			this.aFloat66 = (float) (this.anInt5392 - 256) - this.aFloat63;
			this.aFloat56 = this.aFloat66 - (float) this.anInt5411 * this.aFloat70;
			if (this.aFloat56 < (float) this.anInt5390) {
				this.aFloat56 = this.anInt5390;
			}
			this.anOpengl2.glFogf(2915, this.aFloat56);
			this.anOpengl2.glFogf(2916, this.aFloat66);
			local15 = this.anInt5414;
		}
		Static261.aFloatArray12[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static261.aFloatArray12[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static261.aFloatArray12[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl2.glFogfv(2918, Static261.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "(II)V")
	public synchronized void method4574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class4_Sub36 local4 = new Class4_Sub36(arg1);
		local4.aLong259 = arg0;
		this.aClass130_121.method3510(local4);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4521(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ql", name = "Z", descriptor = "()V")
	public void method4575() {
		if (this.anInt5412 == 4) {
			return;
		}
		this.method4580();
		this.method4588(false);
		this.method4607(false);
		this.method4606(false);
		this.method4593(false);
		this.method4604();
		this.method4560(1);
		this.method4570(1);
		this.anInt5412 = 4;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method4457(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt5400 != arg0;
		if (local7 || this.lb != arg1 || this.aFloat57 != arg2) {
			this.anInt5400 = arg0;
			this.lb = arg1;
			this.aFloat57 = arg2;
			if (local7) {
				this.aFloat68 = (float) (this.anInt5400 & 0xFF0000) / 1.671168E7F;
				this.aFloat55 = (float) (this.anInt5400 & 0xFFFF) / 65535.0F;
				this.aFloat69 = (float) (this.anInt5400 & 0xFF) / 255.0F;
				this.method4611();
			}
			this.method4614();
		}
		if (this.aFloatArray15[0] == arg3 && this.aFloatArray15[1] == arg4 && this.aFloatArray15[2] == arg5) {
			return;
		}
		this.aFloatArray15[0] = arg3;
		this.aFloatArray15[1] = arg4;
		this.aFloatArray15[2] = arg5;
		this.aFloatArray18[0] = -arg3;
		this.aFloatArray18[1] = -arg4;
		this.aFloatArray18[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray16[0] = arg3 * local132;
		this.aFloatArray16[1] = arg4 * local132;
		this.aFloatArray16[2] = arg5 * local132;
		this.aFloatArray14[0] = -this.aFloatArray16[0];
		this.aFloatArray14[1] = -this.aFloatArray16[1];
		this.aFloatArray14[2] = -this.aFloatArray16[2];
		this.method4608();
		this.anInt5418 = (int) (arg3 * 256.0F / arg4);
		this.anInt5393 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "()V")
	@Override
	public void method4482() {
		this.anInt5379 = this.aCanvas9.getWidth();
		this.anInt5377 = this.aCanvas9.getHeight();
		this.anOpengl2.glViewport(this.anInt5417, this.anInt5404, this.anInt5379, this.anInt5377);
		this.method4563();
		this.method4467();
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
	@Override
	public void method4510(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!ql", name = "A", descriptor = "()Z")
	@Override
	public boolean method4492() {
		return Static172.aString129 == null || !Static172.aString129.startsWith("mac");
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([Lclient!jn;Lclient!ib;[Lclient!pf;I)V")
	@Override
	public void method4455(@OriginalArg(0) Class5[] arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) Class17_Sub6[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method4029(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "H", descriptor = "()Z")
	@Override
	public boolean method4516() {
		return true;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(F)V")
	public void method4576(@OriginalArg(0) float arg0) {
		if (this.aFloat65 != arg0) {
			this.aFloat65 = arg0;
			if (this.anInt5388 == 3) {
				this.method4549();
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "(II)V")
	public synchronized void method4577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class4_Sub36 local4 = new Class4_Sub36(arg1);
		local4.aLong259 = arg0;
		this.aClass130_120.method3510(local4);
	}

	@OriginalMember(owner = "client!ql", name = "x", descriptor = "()V")
	@Override
	public void method4486() {
		this.method4593(true);
		this.anOpengl2.glClear(256);
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(III)V")
	public void method4578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(Z)V")
	@Override
	public void method4527(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ql", name = "L", descriptor = "()Lclient!ib;")
	@Override
	public Class23 method4538() {
		return new Class23_Sub1();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!hc;)V")
	@Override
	public void method4437(@OriginalArg(0) Class88 arg0) {
		this.aClass89_1.method2082(this, arg0);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIZ)Lclient!lg;")
	@Override
	public Class60 method4438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class60_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method4547();
		this.method4560(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean465) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local19);
		this.anOpengl2.glVertex2f(local14, local19);
		this.anOpengl2.glVertex2f(local14, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean465) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ql", name = "K", descriptor = "()Z")
	@Override
	public boolean method4534() {
		return true;
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "()V")
	@Override
	public void method5564() {
	}

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "()Z")
	@Override
	public boolean method4465() {
		return this.aClass4_Sub3_Sub1_1.method432();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4489(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static24.aFloat2 = arg0;
		Static24.aFloat3 = arg1;
		Static24.aFloat1 = arg2;
	}

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "(I)I")
	public int method4579(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "()V")
	@Override
	public void method4446() {
		this.aClass98_1.method2570(false, false, 0);
		this.aBoolean458 = false;
		this.method4573();
		this.method4546();
	}

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "()I")
	@Override
	public int method4484() {
		return this.anInt5392;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "()I")
	@Override
	public int method5562() {
		return this.anInt5377;
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V")
	@Override
	public void method4514(@OriginalArg(0) int arg0) {
		this.method4567();
	}

	@OriginalMember(owner = "client!ql", name = "ab", descriptor = "()V")
	private void method4580() {
		if (this.anInt5388 == 1) {
			return;
		}
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho(0.0D, (double) this.anInt5379, (double) this.anInt5377, 0.0D, -1.0D, 1.0D);
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anInt5388 = 1;
		this.anInt5412 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!jp;[Lclient!v;Z)Lclient!wm;")
	@Override
	public Class78 method4476(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class206[] arg1) {
		return new Class78_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ql", name = "bb", descriptor = "()V")
	private void method4581() {
		if (this.aBoolean470 && !this.aBoolean461) {
			this.anOpengl2.glEnable(2896);
		} else {
			this.anOpengl2.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ql", name = "cb", descriptor = "()V")
	public void method4582() {
		if (this.anInt5388 != 2) {
			this.anInt5388 = 2;
			this.method4564();
			this.method4591();
			this.anInt5412 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(II)V")
	@Override
	public void method4488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5414 == arg0 && this.anInt5411 == arg1) {
			return;
		}
		this.anInt5414 = arg0;
		this.anInt5411 = arg1;
		if (!this.aBoolean458) {
			this.method4573();
			this.method4546();
		}
	}

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "(II)V")
	public void method4583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5417 = arg0;
		this.anInt5404 = arg1;
		this.anOpengl2.glViewport(arg0, arg1, this.anInt5379, this.anInt5377);
		this.method4544();
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(Lclient!bb;)V")
	public void method4584(@OriginalArg(0) Class19 arg0) {
		@Pc(2) Interface6 local2 = arg0.anInterface6_1;
		this.method4562(local2);
		local2.method4306(arg0);
		this.aClass19_15 = arg0;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(FFF)V")
	private void method4585(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl2.glMatrixMode(5890);
		if (this.aBoolean476) {
			this.anOpengl2.glLoadIdentity();
		}
		this.anOpengl2.glTranslatef(arg0, arg1, arg2);
		this.anOpengl2.glMatrixMode(5888);
		this.aBoolean476 = true;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
	@Override
	public void method4464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5390 == arg0 && this.anInt5392 == arg1) {
			return;
		}
		this.anInt5390 = arg0;
		this.anInt5392 = arg1;
		this.method4563();
		this.method4599();
		this.method4573();
	}

	@OriginalMember(owner = "client!ql", name = "db", descriptor = "()V")
	private void method4586() {
		if (this.aFloat61 == 0.0F) {
			this.aFloatArray17[10] = this.aFloat53;
			this.aFloatArray17[14] = this.aFloat62;
		} else {
			@Pc(13) float local13 = this.aFloat59 / (this.aFloat61 + this.aFloat59);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat62 * (1.0F - local13) * (1.0F - local13) / this.aFloat61;
			this.aFloatArray17[10] = this.aFloat53 + local32;
			this.aFloatArray17[14] = this.aFloat62 * local17;
		}
		this.method4599();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4532() {
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "()V")
	@Override
	public void method5563() {
	}

	@OriginalMember(owner = "client!ql", name = "eb", descriptor = "()V")
	private void method4587() {
		this.method4604();
		for (@Pc(7) int local7 = this.anInt5405 - 1; local7 >= 0; local7--) {
			this.method4568(local7);
			this.method4548(null);
			this.anOpengl2.glTexEnvi(8960, 8704, 34160);
		}
		this.method4569(8448, 8448);
		this.method4578(2, 34168, 770);
		this.method4545();
		this.anOpengl2.glEnable(3042);
		this.anOpengl2.glBlendFunc(770, 771);
		this.anInt5394 = 1;
		this.anOpengl2.glEnable(3008);
		this.anOpengl2.glAlphaFunc(516, 0.0F);
		this.aBoolean469 = true;
		this.anOpengl2.glColorMask(true, true, true, true);
		this.aBoolean475 = true;
		this.method4588(true);
		this.method4607(true);
		this.method4606(true);
		this.method4593(true);
		this.method4563();
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
		@Pc(146) float[] local146 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(148) int local148 = 0; local148 < 8; local148++) {
			@Pc(155) int local155 = local148 + 16384;
			this.anOpengl2.glLightfv(local155, 4608, local146, 0);
			this.anOpengl2.glLightf(local155, 4615, 0.0F);
			this.anOpengl2.glLightf(local155, 4616, 0.0F);
		}
		this.anOpengl2.glEnable(16384);
		this.anOpengl2.glEnable(16385);
		this.anOpengl2.glFogf(2914, 0.95F);
		this.anOpengl2.glFogi(2917, 9729);
		this.anOpengl2.glHint(3156, 4353);
		this.anInt5400 = this.anInt5414 = -1;
		this.method4467();
	}

	@OriginalMember(owner = "client!ql", name = "B", descriptor = "()I")
	@Override
	public int method4494() {
		return this.anInt5390;
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(III)V")
	@Override
	public void method4493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean458) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt5391 = arg1;
		this.anInt5386 = arg2;
		this.method4573();
		this.aClass98_1.method2571(true, arg0);
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(Z)V")
	public void method4588(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean477) {
			this.aBoolean477 = arg0;
			this.method4546();
			this.anInt5412 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "()F")
	@Override
	public float method4473() {
		return this.aFloat61;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I[BIZ)Lclient!cl;")
	public Interface3 method4589(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface3) (this.aBoolean457 && (!arg2 || this.aBoolean479) ? new Class54_Sub1(this, 5123, arg0, arg1, arg2) : new Class73_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "(I)V")
	public void method4590(@OriginalArg(0) int arg0) {
		Static261.aFloatArray12[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static261.aFloatArray12[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static261.aFloatArray12[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static261.aFloatArray12[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static261.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!ql", name = "fb", descriptor = "()V")
	private void method4591() {
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl2.glMultMatrixf(this.aClass23_Sub1_2.method462(), 0);
		this.method4608();
	}

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "()V")
	@Override
	public void method4467() {
		this.anInt5399 = 0;
		this.anInt5403 = 0;
		this.anInt5409 = this.anInt5379;
		this.anInt5408 = this.anInt5377;
		this.anOpengl2.glDisable(3089);
		this.method4558();
	}

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "(I)I")
	public int method4592(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(Z)V")
	public void method4593(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean480) {
			this.aBoolean480 = arg0;
			this.method4600();
			this.anInt5412 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(Z)V")
	public void method4594(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean461) {
			this.aBoolean461 = arg0;
			this.method4581();
		}
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(Lclient!bb;)V")
	public void method4595(@OriginalArg(0) Class19 arg0) {
		@Pc(2) Interface6 local2 = arg0.anInterface6_1;
		this.method4562(local2);
		local2.method4302(arg0);
		this.aClass19_13 = arg0;
	}

	@OriginalMember(owner = "client!ql", name = "gb", descriptor = "()I")
	private int method4596() {
		@Pc(1) int local1 = 0;
		this.aString195 = this.anOpengl2.glGetString(7936);
		this.aString194 = this.anOpengl2.glGetString(7937);
		@Pc(17) String local17 = this.aString195.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl2.glGetString(7938);
		@Pc(53) String[] local53 = Static304.method5143(local45.replace('.', ' '), ' ');
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static120.method2435(local53[0]);
				@Pc(69) int local69 = Static120.method2435(local53[1]);
				this.anInt5387 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt5387 < 12) {
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
		this.anInt5405 = local116[0];
		this.anOpengl2.glGetIntegerv(34929, local116, 0);
		this.anInt5395 = local116[0];
		this.anOpengl2.glGetIntegerv(34930, local116, 0);
		this.anInt5416 = local116[0];
		if (this.anInt5405 < 2 || this.anInt5395 < 2 || this.anInt5416 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean459 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean457 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean465 = this.anOpengl2.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean478 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean460 = this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean456 = this.anOpengl2.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean473 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean466 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean462 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean472 = false;
		this.aBoolean464 = this.anOpengl2.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII)[I")
	@Override
	public int[] method4441() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl2.glReadPixels(0, this.anInt5377 - local6, 36, 1, 32993, this.anInt5410, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!ql", name = "hb", descriptor = "()V")
	public void method4597() {
		this.anOpengl2.glPopMatrix();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZZ)V")
	public void method4598(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt5406) {
			if (arg0 < 0) {
				this.method4545();
				this.method4548(null);
				if (!this.aBoolean458) {
					this.aClass98_1.method2570(arg1, arg2, 0);
				}
			} else {
				@Pc(11) Class70_Sub4 local11 = this.aClass99_1.method2713(arg0);
				@Pc(17) Class135 local17 = this.anInterface1_6.method5634(arg0);
				if (local17.aByte51 == 0 && local17.aByte54 == 0) {
					this.method4545();
				} else {
					@Pc(30) int local30 = local17.aBoolean360 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method4585((float) (this.anInt5384 % local34 * local17.aByte51) / (float) local34, (float) (this.anInt5384 % local34 * local17.aByte54) / (float) local34, 0.0F);
				}
				if (this.aBoolean458) {
					this.aClass98_1.method2570(arg1, arg2, 3);
					this.method4548(local11);
				} else {
					this.aClass98_1.method2570(arg1, arg2, local17.aByte49);
					this.aClass98_1.method2571(false, local17.aByte50);
					if (!this.aClass98_1.method2569(local11)) {
						this.method4548(local11);
					}
				}
			}
			this.anInt5406 = arg0;
		}
		this.anInt5412 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ql", name = "ib", descriptor = "()V")
	private void method4599() {
		this.aFloat58 = (this.aFloatArray17[14] - (float) this.anInt5392) / this.aFloatArray17[10];
		this.aFloat60 = (float) this.anInt5392 - this.aFloat61;
	}

	@OriginalMember(owner = "client!ql", name = "jb", descriptor = "()V")
	private void method4600() {
		this.anOpengl2.glDepthMask(this.aBoolean480 && this.aBoolean463);
	}

	@OriginalMember(owner = "client!ql", name = "kb", descriptor = "()V")
	public void method4601() {
		@Pc(6) boolean local6 = this.aClass19_14 != null;
		if (local6 != this.aBoolean474) {
			if (local6) {
				this.anOpengl2.glEnableClientState(32884);
			} else {
				this.anOpengl2.glDisableClientState(32884);
			}
			this.aBoolean474 = local6;
		}
		this.aClass19_14 = null;
		@Pc(34) boolean local34 = this.aClass19_15 != null;
		if (local34 != this.aBoolean467) {
			if (local34) {
				this.anOpengl2.glEnableClientState(32885);
			} else {
				this.anOpengl2.glDisableClientState(32885);
			}
			this.aBoolean467 = local34;
		}
		this.aClass19_15 = null;
		@Pc(62) boolean local62 = this.aClass19_13 != null;
		if (local62 != this.aBoolean471) {
			if (local62) {
				this.anOpengl2.glEnableClientState(32886);
			} else {
				this.anOpengl2.glDisableClientState(32886);
			}
			this.aBoolean471 = local62;
		}
		this.aClass19_13 = null;
		for (@Pc(85) int local85 = 0; local85 < this.anInt5395; local85++) {
			@Pc(98) boolean local98 = this.aClass19Array1[local85] != null;
			if (local98 != this.aBooleanArray26[local85]) {
				this.anOpengl2.glClientActiveTexture(local85 + 33984);
				if (local98) {
					this.anOpengl2.glEnableClientState(32888);
				} else {
					this.anOpengl2.glDisableClientState(32888);
				}
				this.aBooleanArray26[local85] = local98;
			}
			this.aClass19Array1[local85] = null;
		}
	}

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "(I)I")
	public int method4602(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method4495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method4547();
		this.method4560(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean465) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local23);
		this.anOpengl2.glVertex2f(local16, local23);
		this.anOpengl2.glVertex2f(local16, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean465) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(IIII)V")
	@Override
	public void method4520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5401 = arg0;
		this.anInt5402 = arg1;
		this.anInt5407 = arg2;
		this.anInt5389 = arg3;
		@Pc(23) float local23 = (float) (-this.anInt5401 * this.anInt5390) / (float) this.anInt5407;
		@Pc(35) float local35 = (float) (-this.anInt5402 * this.anInt5390) / (float) this.anInt5389;
		@Pc(49) float local49 = (float) ((this.anInt5379 - this.anInt5401) * this.anInt5390) / (float) this.anInt5407;
		@Pc(63) float local63 = (float) ((this.anInt5377 - this.anInt5402) * this.anInt5390) / (float) this.anInt5389;
		this.method4559(local23, local49, -local63, -local35, (float) this.anInt5390, (float) this.anInt5392);
		if (this.anInt5388 != 1) {
			this.method4563();
		}
		this.method4599();
		this.method4558();
	}

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "(I)V")
	public synchronized void method4603(@OriginalArg(0) int arg0) {
		@Pc(4) Class4_Sub36 local4 = new Class4_Sub36(arg0);
		this.aClass130_123.method3510(local4);
	}

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "(I)V")
	public void method4604() {
		this.method4554(-2, true);
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(II)I")
	@Override
	public int method4477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(IIIIII)Z")
	@Override
	public boolean method4449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass23_Sub1_2.aFloat7 * (float) arg0 + this.aClass23_Sub1_2.aFloat13 * (float) arg1 + this.aClass23_Sub1_2.aFloat6 * (float) arg2 + this.aClass23_Sub1_2.aFloat10;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass23_Sub1_2.aFloat7 * (float) arg3 + this.aClass23_Sub1_2.aFloat13 * (float) arg4 + this.aClass23_Sub1_2.aFloat6 * (float) arg5 + this.aClass23_Sub1_2.aFloat10;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt5390 && local55 < (float) this.anInt5390 || !(!(local24 > (float) this.anInt5392) || !(local55 > (float) this.anInt5392))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt5407 * (this.aClass23_Sub1_2.aFloat14 * (float) arg0 + this.aClass23_Sub1_2.aFloat15 * (float) arg1 + this.aClass23_Sub1_2.aFloat4 * (float) arg2 + this.aClass23_Sub1_2.aFloat11) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt5407 * (this.aClass23_Sub1_2.aFloat14 * (float) arg3 + this.aClass23_Sub1_2.aFloat15 * (float) arg4 + this.aClass23_Sub1_2.aFloat4 * (float) arg5 + this.aClass23_Sub1_2.aFloat11) / local55);
		if ((float) local119 < this.aFloat51 && (float) local151 < this.aFloat51 || (float) local119 > this.aFloat64 && (float) local151 > this.aFloat64) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt5389 * (this.aClass23_Sub1_2.aFloat9 * (float) arg0 + this.aClass23_Sub1_2.aFloat5 * (float) arg1 + this.aClass23_Sub1_2.aFloat12 * (float) arg2 + this.aClass23_Sub1_2.aFloat8) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt5389 * (this.aClass23_Sub1_2.aFloat9 * (float) arg3 + this.aClass23_Sub1_2.aFloat5 * (float) arg4 + this.aClass23_Sub1_2.aFloat12 * (float) arg5 + this.aClass23_Sub1_2.aFloat8) / local55);
			return (!((float) local209 < this.aFloat52) || !((float) local241 < this.aFloat52)) && (!((float) local209 > this.aFloat54) || !((float) local241 > this.aFloat54));
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!bi;)V")
	public void method4605(@OriginalArg(0) Class23_Sub1 arg0) {
		this.anOpengl2.glPushMatrix();
		this.anOpengl2.glMultMatrixf(arg0.method462(), 0);
	}

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "()Lclient!ib;")
	@Override
	public Class23 method4466() {
		return this.aClass23_4;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)V")
	@Override
	public void method4523(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)V")
	@Override
	public void method4529(@OriginalArg(0) int arg0) {
		this.method4560(0);
		this.anOpengl2.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl2.glClear(16384);
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "(Z)V")
	public void method4606(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean468) {
			return;
		}
		if (arg0) {
			this.anOpengl2.glEnable(2929);
		} else {
			this.anOpengl2.glDisable(2929);
		}
		this.aBoolean468 = arg0;
		this.anInt5412 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)V")
	@Override
	public void method4440() {
		this.aBoolean458 = true;
		this.anInt5391 = 1583160;
		this.anInt5386 = 40;
		this.method4573();
		this.method4546();
		this.aClass98_1.method2570(false, false, 3);
		this.aClass98_1.method2571(true, -1);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!v;Z)Lclient!lg;")
	@Override
	public Class60 method4506(@OriginalArg(0) Class206 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt6577 * arg0.anInt6576];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray91 == null) {
			for (local15 = 0; local15 < arg0.anInt6576; local15++) {
				for (local21 = 0; local21 < arg0.anInt6577; local21++) {
					@Pc(74) int local74 = arg0.anIntArray519[arg0.aByteArray92[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt6576; local15++) {
				for (local21 = 0; local21 < arg0.anInt6577; local21++) {
					local6[local10++] = arg0.aByteArray91[local8] << 24 | arg0.anIntArray519[arg0.aByteArray92[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class60 local100 = this.method4537(local6, arg0.anInt6577, arg0.anInt6577, arg0.anInt6576);
		local100.method5690(arg0.anInt6574, arg0.anInt6578, arg0.anInt6575, arg0.anInt6573);
		return local100;
	}

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "()V")
	@Override
	public void method4456() {
		this.aClass76_1.method1644();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([Lclient!jn;Lclient!hc;Lclient!ib;[Lclient!pf;I)V")
	@Override
	public void method4474(@OriginalArg(0) Class5[] arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) Class23 arg2, @OriginalArg(3) Class17_Sub6[] arg3, @OriginalArg(4) int arg4) {
		this.method4455(arg0, arg2, arg3, arg4);
		this.method4437(arg1);
	}

	@OriginalMember(owner = "client!ql", name = "I", descriptor = "()I")
	@Override
	public int method4519() {
		@Pc(2) int local2 = this.anInt5420;
		this.anInt5420 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "(Z)V")
	public void method4607(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean470) {
			this.aBoolean470 = arg0;
			this.method4581();
			this.anInt5412 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ql", name = "lb", descriptor = "()V")
	public void method4608() {
		this.anOpengl2.glLightfv(16384, 4611, this.aFloatArray15, 0);
		this.anOpengl2.glLightfv(16385, 4611, this.aFloatArray18, 0);
	}

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "()Z")
	@Override
	public boolean method4462() {
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "(I)V")
	public synchronized void method4609(@OriginalArg(0) int arg0) {
		@Pc(4) Class4_Sub36 local4 = new Class4_Sub36(arg0);
		this.aClass130_124.method3510(local4);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(FF)V")
	@Override
	public void method4539(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat59 && arg1 == this.aFloat61) {
			return;
		}
		this.aFloat59 = arg0;
		this.aFloat61 = arg1;
		this.method4586();
		this.method4599();
		if (this.anInt5388 == 3) {
			this.method4549();
		} else if (this.anInt5388 == 2) {
			this.method4564();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4507(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method4452();
	}

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "(II)V")
	public synchronized void method4610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class4_Sub36 local4 = new Class4_Sub36(arg1);
		local4.aLong259 = arg0;
		this.aClass130_119.method3510(local4);
	}

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "()Z")
	@Override
	public boolean method4461() {
		return this.aClass4_Sub3_Sub1_1.method425();
	}

	@OriginalMember(owner = "client!ql", name = "F", descriptor = "()Z")
	@Override
	public boolean method4505() {
		return this.aBoolean465;
	}

	@OriginalMember(owner = "client!ql", name = "mb", descriptor = "()V")
	private void method4611() {
		Static261.aFloatArray12[0] = this.aFloat67 * this.aFloat68;
		Static261.aFloatArray12[1] = this.aFloat67 * this.aFloat55;
		Static261.aFloatArray12[2] = this.aFloat67 * this.aFloat69;
		Static261.aFloatArray12[3] = 1.0F;
		this.anOpengl2.glLightModelfv(2899, Static261.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!ql", name = "nb", descriptor = "()V")
	private void method4612() {
		this.aClass23_Sub1_2 = new Class23_Sub1();
		this.aClass23_Sub1_1 = new Class23_Sub1();
		this.aClass70Array1 = new Class70[this.anInt5405];
		this.aBooleanArray26 = new boolean[this.anInt5395];
		this.aClass19Array1 = new Class19[this.anInt5395];
		this.aClass70_Sub4_5 = new Class70_Sub4(this, 3553, 6408, 1, 1);
		this.aClass70_Sub4_6 = new Class70_Sub4(this, 3553, 6408, 1, 1);
		this.aClass70_Sub4_4 = new Class70_Sub4(this, 3553, 6408, 1, 1);
		this.aClass5_Sub2_1 = new Class5_Sub2(this);
		this.aClass5_Sub2_2 = new Class5_Sub2(this);
		this.aClass5_Sub2_3 = new Class5_Sub2(this);
		this.aClass5_Sub2_5 = new Class5_Sub2(this);
		this.aClass5_Sub2_4 = new Class5_Sub2(this);
		this.aClass5_Sub2_6 = new Class5_Sub2(this);
		this.anInterface3_4 = this.method4589(null, 1024, true);
		if (this.aBoolean464) {
			this.aClass214_4 = new Class214(this);
		}
		this.aClass89_1.method2084(this);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!d;)V")
	public void method4613(@OriginalArg(0) Interface4 arg0) {
		if (this.anInt5380 < 0 || this.anInterface4Array1[this.anInt5380] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface4Array1[this.anInt5380--] = null;
		arg0.method5564();
		if (this.anInt5380 >= 0) {
			this.anInterface4_1 = this.anInterface4Array1[this.anInt5380];
			this.anInterface4_1.method5563();
		}
	}

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "()V")
	@Override
	public void method4452() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method4458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4547();
		this.method4560(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(IIII)V")
	@Override
	public void method4459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt5379) {
			arg2 = this.anInt5379;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt5377) {
			arg3 = this.anInt5377;
		}
		this.anInt5399 = arg0;
		this.anInt5403 = arg1;
		this.anInt5409 = arg2;
		this.anInt5408 = arg3;
		this.anOpengl2.glEnable(3089);
		this.method4558();
		this.method4544();
	}

	@OriginalMember(owner = "client!ql", name = "ob", descriptor = "()V")
	private void method4614() {
		Static261.aFloatArray12[0] = this.lb * this.aFloat68;
		Static261.aFloatArray12[1] = this.lb * this.aFloat55;
		Static261.aFloatArray12[2] = this.lb * this.aFloat69;
		Static261.aFloatArray12[3] = 1.0F;
		this.anOpengl2.glLightfv(16384, 4609, Static261.aFloatArray12, 0);
		Static261.aFloatArray12[0] = -this.aFloat57 * this.aFloat68;
		Static261.aFloatArray12[1] = -this.aFloat57 * this.aFloat55;
		Static261.aFloatArray12[2] = -this.aFloat57 * this.aFloat69;
		Static261.aFloatArray12[3] = 1.0F;
		this.anOpengl2.glLightfv(16385, 4609, Static261.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(Lclient!d;)V")
	public void method4615(@OriginalArg(0) Interface4 arg0) {
		if (this.anInt5380 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5380 >= 0) {
			this.anInterface4Array1[this.anInt5380].method5564();
		}
		this.anInterface4_1 = this.anInterface4Array1[++this.anInt5380] = arg0;
		this.anInterface4_1.method5563();
	}

	@OriginalMember(owner = "client!ql", name = "pb", descriptor = "()V")
	private void method4616() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I[Lclient!fs;)V")
	@Override
	public void method4445(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub12[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class4_Sub12 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static261.aFloatArray13[0] = local8.anInt6082;
			Static261.aFloatArray13[1] = local8.anInt6079;
			Static261.aFloatArray13[2] = local8.anInt6081;
			Static261.aFloatArray13[3] = 1.0F;
			this.anOpengl2.glLightfv(local12, 4611, Static261.aFloatArray13, 0);
			@Pc(44) int local44 = local8.anInt6078;
			@Pc(49) float local49 = local8.aFloat72 / 255.0F;
			Static261.aFloatArray13[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static261.aFloatArray13[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static261.aFloatArray13[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl2.glLightfv(local12, 4609, Static261.aFloatArray13, 0);
			this.anOpengl2.glLightf(local12, 4617, 1.0F / (float) (local8.anInt6083 * local8.anInt6083));
			this.anOpengl2.glEnable(local12);
		}
		while (local1 < this.anInt5398) {
			this.anOpengl2.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt5398 = arg0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!jn;Lclient!hc;Lclient!ib;Lclient!pf;I)V")
	@Override
	public void method4451(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) Class23 arg2, @OriginalArg(3) Class17_Sub6 arg3) {
		arg0.method4029(arg2, arg3, 0);
		this.method4437(arg1);
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V")
	@Override
	public void method4511(@OriginalArg(0) int arg0) {
		this.method4616();
	}

	@OriginalMember(owner = "client!ql", name = "qb", descriptor = "()Lclient!d;")
	public Interface4 method4617() {
		return this.anInterface4_1;
	}

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "()Z")
	@Override
	public boolean method4469() {
		if (!this.aClass4_Sub3_Sub1_1.method425()) {
			if (!this.aClass76_1.method1650(this.aClass4_Sub3_Sub1_1)) {
				return false;
			}
			this.aClass99_1.method2714();
		}
		return true;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!bb;)V")
	public void method4618(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		@Pc(2) Interface6 local2 = arg1.anInterface6_1;
		this.method4562(local2);
		local2.method4303(arg0, arg1);
		this.aClass19Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method4496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4547();
		this.method4560(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(IIIII)V")
	@Override
	public void method4483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4547();
		this.method4560(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "()Z")
	@Override
	public boolean method4460() {
		return this.aClass98_1.method2568();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!go;II)V")
	@Override
	public void method4508(@OriginalArg(1) Class84 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class84_Sub2 local2 = (Class84_Sub2) arg0;
		@Pc(5) Class70_Sub4_Sub1 local5 = local2.aClass70_Sub4_Sub1_5;
		this.method4619();
		this.method4548(local2.aClass70_Sub4_Sub1_5);
		this.method4560(1);
		this.method4569(7681, 8448);
		this.method4578(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat24 / (float) local5.anInt2357;
		@Pc(37) float local37 = local5.aFloat23 / (float) local5.anInt2356;
		this.anOpengl2.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt5399 - arg1), local37 * (float) (this.anInt5403 - arg2));
		this.anOpengl2.glVertex2i(this.anInt5399, this.anInt5403);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt5399 - arg1), local37 * (float) (this.anInt5408 - arg2));
		this.anOpengl2.glVertex2i(this.anInt5399, this.anInt5408);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt5409 - arg1), local37 * (float) (this.anInt5408 - arg2));
		this.anOpengl2.glVertex2i(this.anInt5409, this.anInt5408);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt5409 - arg1), local37 * (float) (this.anInt5403 - arg2));
		this.anOpengl2.glVertex2i(this.anInt5409, this.anInt5403);
		this.anOpengl2.glEnd();
		this.method4578(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ql", name = "rb", descriptor = "()V")
	public void method4619() {
		if (this.anInt5412 == 2) {
			return;
		}
		this.method4580();
		this.method4588(false);
		this.method4607(false);
		this.method4606(false);
		this.method4593(false);
		this.method4604();
		this.anInt5412 = 2;
	}

	@OriginalMember(owner = "client!ql", name = "w", descriptor = "()Z")
	@Override
	public boolean method4485() {
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method4470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass70_Sub4_Sub1_4 == null || this.aClass70_Sub4_Sub1_4.anInt2354 < arg2 || this.aClass70_Sub4_Sub1_4.anInt2353 < arg3) {
			this.aClass70_Sub4_Sub1_4 = Static360.method1996(arg3, arg6, arg2, this);
			this.aClass70_Sub4_Sub1_4.method1991(false, false);
			local32 = this.aClass70_Sub4_Sub1_4.aFloat23;
			local36 = this.aClass70_Sub4_Sub1_4.aFloat24;
		} else {
			this.aClass70_Sub4_Sub1_4.method1992(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass70_Sub4_Sub1_4.aFloat23 * (float) arg3 / (float) this.aClass70_Sub4_Sub1_4.anInt2353;
			local36 = this.aClass70_Sub4_Sub1_4.aFloat24 * (float) arg2 / (float) this.aClass70_Sub4_Sub1_4.anInt2354;
		}
		this.method4619();
		this.method4548(this.aClass70_Sub4_Sub1_4);
		this.method4560(arg8);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method4590(arg5);
		this.method4569(34165, 34165);
		this.method4578(0, 34166, 768);
		this.method4578(2, 5890, 770);
		this.method4556(0, 34166);
		this.method4556(2, 5890);
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
		this.method4578(0, 5890, 768);
		this.method4578(2, 34166, 770);
		this.method4556(0, 5890);
		this.method4556(2, 34166);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass23_Sub1_2.aFloat7 * (float) arg0 + this.aClass23_Sub1_2.aFloat13 * (float) arg1 + this.aClass23_Sub1_2.aFloat6 * (float) arg2 + this.aClass23_Sub1_2.aFloat10;
		if (local24 < (float) this.anInt5390 || local24 > (float) this.anInt5392) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt5407 * (this.aClass23_Sub1_2.aFloat14 * (float) arg0 + this.aClass23_Sub1_2.aFloat15 * (float) arg1 + this.aClass23_Sub1_2.aFloat4 * (float) arg2 + this.aClass23_Sub1_2.aFloat11) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt5389 * (this.aClass23_Sub1_2.aFloat9 * (float) arg0 + this.aClass23_Sub1_2.aFloat5 * (float) arg1 + this.aClass23_Sub1_2.aFloat12 * (float) arg2 + this.aClass23_Sub1_2.aFloat8) / local24);
		if ((float) local81 >= this.aFloat51 && (float) local81 <= this.aFloat64 && (float) local113 >= this.aFloat52 && (float) local113 <= this.aFloat54) {
			arg3[0] = (int) ((float) local81 - this.aFloat51);
			arg3[1] = (int) ((float) local113 - this.aFloat52);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([I)V")
	@Override
	public void method4525(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5399;
		arg0[1] = this.anInt5403;
		arg0[2] = this.anInt5409;
		arg0[3] = this.anInt5408;
	}

	@OriginalMember(owner = "client!ql", name = "sb", descriptor = "()V")
	private void method4620() {
		if (this.anInt5388 != 3) {
			this.anInt5388 = 3;
			this.method4549();
			this.method4591();
			this.anInt5412 &= 0xFFFFFFF8;
		}
	}
}
