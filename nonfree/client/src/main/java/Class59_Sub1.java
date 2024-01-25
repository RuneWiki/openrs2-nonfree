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

@OriginalClass("client!po")
public final class Class59_Sub1 extends Class59 implements Interface5 {

	@OriginalMember(owner = "client!po", name = "H", descriptor = "I")
	public int anInt4758;

	@OriginalMember(owner = "client!po", name = "I", descriptor = "I")
	public int anInt4759;

	@OriginalMember(owner = "client!po", name = "K", descriptor = "Lclient!kl;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "client!po", name = "L", descriptor = "I")
	public int anInt4760;

	@OriginalMember(owner = "client!po", name = "O", descriptor = "I")
	public int anInt4762;

	@OriginalMember(owner = "client!po", name = "P", descriptor = "I")
	public int anInt4763;

	@OriginalMember(owner = "client!po", name = "Q", descriptor = "I")
	private int anInt4764;

	@OriginalMember(owner = "client!po", name = "X", descriptor = "Lclient!nc;")
	public Class112_Sub2 aClass112_Sub2_1;

	@OriginalMember(owner = "client!po", name = "Y", descriptor = "Z")
	private boolean aBoolean348;

	@OriginalMember(owner = "client!po", name = "bb", descriptor = "Z")
	private boolean aBoolean349;

	@OriginalMember(owner = "client!po", name = "cb", descriptor = "I")
	private int anInt4766;

	@OriginalMember(owner = "client!po", name = "db", descriptor = "Z")
	public boolean aBoolean350;

	@OriginalMember(owner = "client!po", name = "eb", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!po", name = "fb", descriptor = "Ljava/lang/String;")
	private String aString279;

	@OriginalMember(owner = "client!po", name = "gb", descriptor = "Z")
	private boolean aBoolean351;

	@OriginalMember(owner = "client!po", name = "ib", descriptor = "Z")
	public boolean aBoolean353;

	@OriginalMember(owner = "client!po", name = "kb", descriptor = "F")
	private float aFloat72;

	@OriginalMember(owner = "client!po", name = "qb", descriptor = "Lclient!jn;")
	public Class101_Sub1 aClass101_Sub1_1;

	@OriginalMember(owner = "client!po", name = "rb", descriptor = "I")
	private int anInt4770;

	@OriginalMember(owner = "client!po", name = "sb", descriptor = "I")
	private int anInt4771;

	@OriginalMember(owner = "client!po", name = "vb", descriptor = "Z")
	public boolean aBoolean354;

	@OriginalMember(owner = "client!po", name = "wb", descriptor = "Z")
	private boolean aBoolean355;

	@OriginalMember(owner = "client!po", name = "xb", descriptor = "Lclient!fc;")
	public Class11_Sub1 aClass11_Sub1_4;

	@OriginalMember(owner = "client!po", name = "yb", descriptor = "Lclient!jn;")
	public Class101_Sub1 aClass101_Sub1_2;

	@OriginalMember(owner = "client!po", name = "Bb", descriptor = "I")
	private int anInt4774;

	@OriginalMember(owner = "client!po", name = "Cb", descriptor = "Z")
	private boolean aBoolean357;

	@OriginalMember(owner = "client!po", name = "Fb", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!po", name = "Hb", descriptor = "[Z")
	private boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!po", name = "Jb", descriptor = "[Lclient!pe;")
	private Class156[] aClass156Array1;

	@OriginalMember(owner = "client!po", name = "Kb", descriptor = "Z")
	private boolean aBoolean358;

	@OriginalMember(owner = "client!po", name = "Lb", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!po", name = "Mb", descriptor = "I")
	private int anInt4778;

	@OriginalMember(owner = "client!po", name = "Ob", descriptor = "Lclient!jn;")
	public Class101_Sub1 aClass101_Sub1_3;

	@OriginalMember(owner = "client!po", name = "Qb", descriptor = "[Lclient!fl;")
	private Class11[] aClass11Array1;

	@OriginalMember(owner = "client!po", name = "Sb", descriptor = "Z")
	private boolean aBoolean359;

	@OriginalMember(owner = "client!po", name = "Ub", descriptor = "Lclient!fc;")
	public Class11_Sub1 aClass11_Sub1_5;

	@OriginalMember(owner = "client!po", name = "Vb", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!po", name = "Wb", descriptor = "F")
	private float aFloat80;

	@OriginalMember(owner = "client!po", name = "Yb", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!po", name = "Zb", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!po", name = "dc", descriptor = "I")
	public int anInt4784;

	@OriginalMember(owner = "client!po", name = "fc", descriptor = "Z")
	private boolean aBoolean360;

	@OriginalMember(owner = "client!po", name = "hc", descriptor = "Z")
	public boolean aBoolean361;

	@OriginalMember(owner = "client!po", name = "kc", descriptor = "Z")
	public boolean aBoolean363;

	@OriginalMember(owner = "client!po", name = "lc", descriptor = "Lclient!uf;")
	private Class18_Sub1 aClass18_Sub1_1;

	@OriginalMember(owner = "client!po", name = "mc", descriptor = "Z")
	public boolean aBoolean364;

	@OriginalMember(owner = "client!po", name = "nc", descriptor = "I")
	private int anInt4787;

	@OriginalMember(owner = "client!po", name = "oc", descriptor = "I")
	public int anInt4788;

	@OriginalMember(owner = "client!po", name = "pc", descriptor = "I")
	private int anInt4789;

	@OriginalMember(owner = "client!po", name = "qc", descriptor = "Lclient!ti;")
	private Interface9 anInterface9_4;

	@OriginalMember(owner = "client!po", name = "rc", descriptor = "Lclient!jn;")
	public Class101_Sub1 aClass101_Sub1_4;

	@OriginalMember(owner = "client!po", name = "uc", descriptor = "Lclient!ib;")
	public Class87 aClass87_3;

	@OriginalMember(owner = "client!po", name = "wc", descriptor = "Lclient!an;")
	private Class11_Sub1_Sub1 aClass11_Sub1_Sub1_5;

	@OriginalMember(owner = "client!po", name = "Ac", descriptor = "F")
	private float aFloat87;

	@OriginalMember(owner = "client!po", name = "Bc", descriptor = "Lclient!eo;")
	public Interface2 anInterface2_4;

	@OriginalMember(owner = "client!po", name = "Cc", descriptor = "Ljava/lang/String;")
	private String aString280;

	@OriginalMember(owner = "client!po", name = "Ec", descriptor = "Lclient!jn;")
	public Class101_Sub1 aClass101_Sub1_5;

	@OriginalMember(owner = "client!po", name = "Fc", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!po", name = "Hc", descriptor = "I")
	private int anInt4792;

	@OriginalMember(owner = "client!po", name = "Jc", descriptor = "F")
	public float aFloat90;

	@OriginalMember(owner = "client!po", name = "Lc", descriptor = "Lclient!nc;")
	public Class112_Sub2 aClass112_Sub2_2;

	@OriginalMember(owner = "client!po", name = "Mc", descriptor = "Lclient!pe;")
	private Class156 aClass156_9;

	@OriginalMember(owner = "client!po", name = "Nc", descriptor = "Z")
	private boolean aBoolean368;

	@OriginalMember(owner = "client!po", name = "Rc", descriptor = "I")
	private int anInt4794;

	@OriginalMember(owner = "client!po", name = "Sc", descriptor = "I")
	public int anInt4795;

	@OriginalMember(owner = "client!po", name = "Tc", descriptor = "Z")
	private boolean aBoolean370;

	@OriginalMember(owner = "client!po", name = "Vc", descriptor = "J")
	private long aLong165;

	@OriginalMember(owner = "client!po", name = "Wc", descriptor = "Lclient!pe;")
	private Class156 aClass156_10;

	@OriginalMember(owner = "client!po", name = "Xc", descriptor = "Z")
	private boolean aBoolean371;

	@OriginalMember(owner = "client!po", name = "Yc", descriptor = "Lclient!fc;")
	public Class11_Sub1 aClass11_Sub1_6;

	@OriginalMember(owner = "client!po", name = "Zc", descriptor = "Lclient!jn;")
	public Class101_Sub1 aClass101_Sub1_6;

	@OriginalMember(owner = "client!po", name = "ad", descriptor = "Z")
	private boolean aBoolean372;

	@OriginalMember(owner = "client!po", name = "bd", descriptor = "Lclient!eo;")
	private Interface2 anInterface2_5;

	@OriginalMember(owner = "client!po", name = "cd", descriptor = "Lclient!pe;")
	private Class156 aClass156_11;

	@OriginalMember(owner = "client!po", name = "dd", descriptor = "I")
	private int anInt4797;

	@OriginalMember(owner = "client!po", name = "ed", descriptor = "I")
	private int anInt4798;

	@OriginalMember(owner = "client!po", name = "r", descriptor = "Lclient!go;")
	private final Class74 aClass74_1 = new Class74();

	@OriginalMember(owner = "client!po", name = "D", descriptor = "Lclient!vr;")
	private final Class112 aClass112_4 = new Class112_Sub2();

	@OriginalMember(owner = "client!po", name = "G", descriptor = "I")
	private int anInt4757 = -1;

	@OriginalMember(owner = "client!po", name = "F", descriptor = "Z")
	private boolean aBoolean347 = false;

	@OriginalMember(owner = "client!po", name = "E", descriptor = "I")
	public final int anInt4756 = 8;

	@OriginalMember(owner = "client!po", name = "N", descriptor = "[Lclient!kl;")
	private final Interface5[] anInterface5Array1 = new Interface5[4];

	@OriginalMember(owner = "client!po", name = "M", descriptor = "I")
	public final int anInt4761 = 3;

	@OriginalMember(owner = "client!po", name = "J", descriptor = "Lclient!vn;")
	private final Class211 aClass211_24 = new Class211();

	@OriginalMember(owner = "client!po", name = "R", descriptor = "Lclient!vn;")
	private final Class211 aClass211_25 = new Class211();

	@OriginalMember(owner = "client!po", name = "S", descriptor = "Lclient!vn;")
	private final Class211 aClass211_26 = new Class211();

	@OriginalMember(owner = "client!po", name = "T", descriptor = "Lclient!vn;")
	private final Class211 aClass211_27 = new Class211();

	@OriginalMember(owner = "client!po", name = "U", descriptor = "Lclient!vn;")
	private final Class211 aClass211_28 = new Class211();

	@OriginalMember(owner = "client!po", name = "V", descriptor = "Lclient!vn;")
	private final Class211 aClass211_29 = new Class211();

	@OriginalMember(owner = "client!po", name = "W", descriptor = "Lclient!vn;")
	private final Class211 aClass211_30 = new Class211();

	@OriginalMember(owner = "client!po", name = "pb", descriptor = "I")
	public int anInt4769 = 50;

	@OriginalMember(owner = "client!po", name = "ub", descriptor = "I")
	private int anInt4773 = 0;

	@OriginalMember(owner = "client!po", name = "ab", descriptor = "I")
	public int anInt4765 = -1;

	@OriginalMember(owner = "client!po", name = "nb", descriptor = "I")
	private int anInt4768 = -1;

	@OriginalMember(owner = "client!po", name = "zb", descriptor = "Z")
	private boolean aBoolean356 = true;

	@OriginalMember(owner = "client!po", name = "mb", descriptor = "F")
	public float aFloat73 = 1.0F;

	@OriginalMember(owner = "client!po", name = "cc", descriptor = "I")
	private int anInt4783 = 0;

	@OriginalMember(owner = "client!po", name = "Db", descriptor = "I")
	public int anInt4775 = -1;

	@OriginalMember(owner = "client!po", name = "Z", descriptor = "[F")
	private final float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!po", name = "gc", descriptor = "F")
	private float aFloat83 = 1.0F;

	@OriginalMember(owner = "client!po", name = "Nb", descriptor = "I")
	private int anInt4779 = 0;

	@OriginalMember(owner = "client!po", name = "Pb", descriptor = "I")
	public int anInt4780 = -1;

	@OriginalMember(owner = "client!po", name = "ec", descriptor = "I")
	public int anInt4785 = 512;

	@OriginalMember(owner = "client!po", name = "tc", descriptor = "F")
	public float aFloat84 = 3584.0F;

	@OriginalMember(owner = "client!po", name = "jb", descriptor = "I")
	private int anInt4767 = 0;

	@OriginalMember(owner = "client!po", name = "Xb", descriptor = "[F")
	public final float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!po", name = "lb", descriptor = "I")
	private int lb = 8448;

	@OriginalMember(owner = "client!po", name = "ac", descriptor = "I")
	public int anInt4781 = 0;

	@OriginalMember(owner = "client!po", name = "Eb", descriptor = "I")
	public int anInt4776 = 3584;

	@OriginalMember(owner = "client!po", name = "ic", descriptor = "I")
	public int anInt4786 = 512;

	@OriginalMember(owner = "client!po", name = "bc", descriptor = "I")
	private int anInt4782 = -1;

	@OriginalMember(owner = "client!po", name = "ob", descriptor = "F")
	public float aFloat74 = -1.0F;

	@OriginalMember(owner = "client!po", name = "vc", descriptor = "F")
	private float aFloat85 = 0.0F;

	@OriginalMember(owner = "client!po", name = "Tb", descriptor = "F")
	public float aFloat78 = 3584.0F;

	@OriginalMember(owner = "client!po", name = "zc", descriptor = "F")
	public float aFloat86 = 1.0F;

	@OriginalMember(owner = "client!po", name = "tb", descriptor = "I")
	private int anInt4772 = 0;

	@OriginalMember(owner = "client!po", name = "Kc", descriptor = "I")
	public int anInt4793 = 0;

	@OriginalMember(owner = "client!po", name = "Oc", descriptor = "F")
	private float aFloat91 = 1.0F;

	@OriginalMember(owner = "client!po", name = "Rb", descriptor = "[F")
	private final float[] aFloatArray25 = new float[4];

	@OriginalMember(owner = "client!po", name = "sc", descriptor = "I")
	private int anInt4790 = 0;

	@OriginalMember(owner = "client!po", name = "Gc", descriptor = "F")
	public float aFloat89 = -1.0F;

	@OriginalMember(owner = "client!po", name = "Qc", descriptor = "[F")
	private final float[] aFloatArray27 = new float[16];

	@OriginalMember(owner = "client!po", name = "Gb", descriptor = "[F")
	private final float[] aFloatArray24 = new float[4];

	@OriginalMember(owner = "client!po", name = "Uc", descriptor = "I")
	private int anInt4796 = 0;

	@OriginalMember(owner = "client!po", name = "Ib", descriptor = "I")
	private int anInt4777 = 8448;

	@OriginalMember(owner = "client!po", name = "Ab", descriptor = "F")
	public float aFloat75 = 1.0F;

	@OriginalMember(owner = "client!po", name = "z", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas4;

	@OriginalMember(owner = "client!po", name = "u", descriptor = "Lclient!bm;")
	public final Interface1 anInterface1_5;

	@OriginalMember(owner = "client!po", name = "B", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!po", name = "C", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl2;

	@OriginalMember(owner = "client!po", name = "Dc", descriptor = "I")
	public final int anInt4791;

	@OriginalMember(owner = "client!po", name = "yc", descriptor = "Z")
	private boolean aBoolean366;

	@OriginalMember(owner = "client!po", name = "hb", descriptor = "Z")
	public boolean aBoolean352;

	@OriginalMember(owner = "client!po", name = "xc", descriptor = "Z")
	public boolean aBoolean365;

	@OriginalMember(owner = "client!po", name = "jc", descriptor = "Z")
	public boolean aBoolean362;

	@OriginalMember(owner = "client!po", name = "Pc", descriptor = "Z")
	private boolean aBoolean369;

	@OriginalMember(owner = "client!po", name = "Ic", descriptor = "Z")
	public boolean aBoolean367;

	@OriginalMember(owner = "client!po", name = "A", descriptor = "Lclient!un;")
	public final Class204 aClass204_1;

	@OriginalMember(owner = "client!po", name = "y", descriptor = "Lclient!pf;")
	private final Class157 aClass157_1;

	@OriginalMember(owner = "client!po", name = "v", descriptor = "Lclient!ub;")
	private final Class197 aClass197_1;

	@OriginalMember(owner = "client!po", name = "t", descriptor = "Lclient!cb;")
	private final Class5_Sub5_Sub1 aClass5_Sub5_Sub1_1;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!bm;IILclient!am;)V")
	public Class59_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class10 arg4) {
		this.aCanvas4 = arg0;
		this.anInterface1_5 = arg1;
		this.anInt5487 = arg2;
		@Pc(186) int local186 = 0;
		while (!this.aCanvas4.isShowing()) {
			if (local186++ > 5) {
				throw new RuntimeException("");
			}
			Static105.method2138(1000L);
		}
		this.aCanvas4.setIgnoreRepaint(true);
		try {
			if (!Static245.aBoolean346) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static245.aBoolean346 = Boolean.TRUE;
				} else {
					@Pc(218) Class60 local218 = arg4.method321(this.getClass());
					while (local218.anInt1838 == 0) {
						Static105.method2138(100L);
					}
					if (local218.anInt1838 == 1) {
						Static245.aBoolean346 = Boolean.TRUE;
					}
				}
			}
			if (!Static245.aBoolean346) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas4, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method4324();
				this.anOpengl2 = this.aContext1.getGL();
				@Pc(283) int local283 = this.method4282();
				if (local283 != 0) {
					throw new RuntimeException("");
				}
				this.anInt4791 = this.aBoolean350 ? 33639 : 5121;
				@Pc(302) String local302 = this.aString280.toLowerCase();
				@Pc(306) String local306 = this.aString279.toLowerCase();
				if (local306.indexOf("radeon") != -1) {
					@Pc(313) int local313 = 0;
					@Pc(315) boolean local315 = false;
					@Pc(317) boolean local317 = false;
					@Pc(325) String[] local325 = Static219.method3847(' ', local306.replace('/', ' '));
					for (@Pc(327) int local327 = 0; local327 < local325.length; local327++) {
						@Pc(335) String local335 = local325[local327];
						try {
							if (local335.length() > 0) {
								if (local335.charAt(0) == 'x' && local335.length() >= 3 && Static54.method1178(local335.substring(1, 3))) {
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
									if (local335.length() >= 4 && Static54.method1178(local335.substring(0, 4))) {
										local313 = Static269.method4544(local335.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(399) Exception local399) {
						}
					}
					if (!local317 && !local315) {
						if (local313 >= 7000 && local313 <= 7999) {
							this.aBoolean366 = false;
						}
						if (local313 >= 7000 && local313 <= 9250) {
							this.aBoolean352 = false;
						}
					}
					if (!local315 || local313 < 4000) {
						this.aBoolean365 = false;
					}
					this.aBoolean362 &= this.anOpengl2.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean369 = this.aBoolean366;
				}
				if (local302.contains("intel")) {
					this.aBoolean367 = false;
				}
				if (this.aBoolean366) {
					try {
						@Pc(457) int[] local457 = new int[1];
						this.anOpengl2.glGenBuffersARB(1, local457, 0);
					} catch (@Pc(465) Throwable local465) {
						throw new RuntimeException("", local465);
					}
				}
				this.method4289(this);
				this.method4884();
				this.method4278();
				new Class73(this);
				this.aClass204_1 = new Class204(this, this.anInterface1_5);
				Static85.method1930(true);
				this.aBoolean347 = true;
				this.aClass157_1 = new Class157(this);
				this.aClass197_1 = new Class197(this);
				this.aClass5_Sub5_Sub1_1 = new Class5_Sub5_Sub1(this);
				this.method4341();
				this.anOpengl2.glClear(16640);
				local186 = 0;
				while (true) {
					try {
						this.aContext1.swapBuffers();
						break;
					} catch (@Pc(530) Exception local530) {
						if (local186++ > 5) {
							throw new RuntimeException("");
						}
						Static105.method2138(100L);
					}
				}
				this.anOpengl2.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(549) Throwable local549) {
			local549.printStackTrace();
			this.method4828();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local549);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!ti;)V")
	public void method4266(@OriginalArg(0) Interface9 arg0) {
		if (this.anInterface9_4 != arg0 && this.aBoolean366) {
			this.anOpengl2.glBindBufferARB(34962, arg0.method5698());
			this.anInterface9_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!po", name = "H", descriptor = "()I")
	@Override
	public int method4878() {
		return this.anInt4776;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([Lclient!mj;Lclient!vr;[Lclient!ue;I)V")
	@Override
	public void method4840(@OriginalArg(0) Class101[] arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) Class63_Sub7[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method5172(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "f", descriptor = "(Z)V")
	public void method4267(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean368) {
			return;
		}
		if (arg0) {
			this.anOpengl2.glEnable(2929);
		} else {
			this.anOpengl2.glDisable(2929);
		}
		this.aBoolean368 = arg0;
		this.anInt4792 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!po", name = "B", descriptor = "()V")
	@Override
	public void method4858() {
		this.aClass157_1.method4039(0, false, false);
		this.aBoolean363 = false;
		this.method4329();
		this.method4306();
	}

	@OriginalMember(owner = "client!po", name = "f", descriptor = "()I")
	@Override
	public int method4796() {
		return 4;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(FF)V")
	@Override
	public void method4859(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat79 && arg1 == this.aFloat71) {
			return;
		}
		this.aFloat79 = arg0;
		this.aFloat71 = arg1;
		this.method4319();
		this.method4304();
		if (this.anInt4778 == 3) {
			this.method4332();
		} else if (this.anInt4778 == 2) {
			this.method4313();
		}
	}

	@OriginalMember(owner = "client!po", name = "e", descriptor = "(I)V")
	@Override
	public void method4852(@OriginalArg(0) int arg0) {
		this.method4336();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!bd;)V")
	@Override
	public void method4788(@OriginalArg(0) Class18 arg0) {
		this.aClass18_Sub1_1 = (Class18_Sub1) arg0;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!pe;)V")
	public void method4268(@OriginalArg(0) Class156 arg0) {
		@Pc(2) Interface9 local2 = arg0.anInterface9_3;
		this.method4266(local2);
		local2.method5705(arg0);
		this.aClass156_11 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "e", descriptor = "(IIIII)V")
	@Override
	public void method4867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4334();
		this.method4342(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)V")
	@Override
	public void method4790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4765 == arg0 && this.anInt4780 == arg1) {
			return;
		}
		this.anInt4765 = arg0;
		this.anInt4780 = arg1;
		if (!this.aBoolean363) {
			this.method4329();
			this.method4306();
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(FFF)V")
	private void method4269(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl2.glMatrixMode(5890);
		if (this.aBoolean370) {
			this.anOpengl2.glLoadIdentity();
		}
		this.anOpengl2.glTranslatef(arg0, arg1, arg2);
		this.anOpengl2.glMatrixMode(5888);
		this.aBoolean370 = true;
	}

	@OriginalMember(owner = "client!po", name = "h", descriptor = "(I)V")
	public synchronized void method4270(@OriginalArg(0) int arg0) {
		@Pc(4) Class5_Sub37 local4 = new Class5_Sub37(arg0);
		this.aClass211_30.method5609(local4);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4876(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static33.aFloat17 = arg0;
		Static33.aFloat15 = arg1;
		Static33.aFloat16 = arg2;
	}

	@OriginalMember(owner = "client!po", name = "i", descriptor = "(I)V")
	public synchronized void method4271(@OriginalArg(0) int arg0) {
		@Pc(4) Class5_Sub37 local4 = new Class5_Sub37(arg0);
		this.aClass211_27.method5609(local4);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIIILclient!hm;II)V")
	@Override
	public void method4809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class15 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class15_Sub1 local2 = (Class15_Sub1) arg5;
		@Pc(5) Class11_Sub1_Sub1 local5 = local2.aClass11_Sub1_Sub1_1;
		this.method4305();
		this.method4296(local2.aClass11_Sub1_Sub1_1);
		this.method4342(1);
		this.method4311(7681, 8448);
		this.method4297(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat10 / (float) local5.anInt369;
		@Pc(37) float local37 = local5.aFloat9 / (float) local5.anInt368;
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
		this.method4297(0, 5890, 768);
	}

	@OriginalMember(owner = "client!po", name = "M", descriptor = "()V")
	private void method4272() {
		if (this.anInt4790 <= this.anInt4796 && this.anInt4773 <= this.anInt4767) {
			this.anOpengl2.glScissor(this.anInt4779 + this.anInt4790, this.anInt4783 + this.anInt4762 - this.anInt4767, this.anInt4796 - this.anInt4790, this.anInt4767 - this.anInt4773);
		} else {
			this.anOpengl2.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!po", name = "g", descriptor = "()Lclient!vr;")
	@Override
	public Class112 method4798() {
		return this.aClass112_4;
	}

	@OriginalMember(owner = "client!po", name = "j", descriptor = "(I)V")
	public void method4273(@OriginalArg(0) int arg0) {
		if (this.anInt4789 != arg0) {
			this.anOpengl2.glActiveTexture(arg0 + 33984);
			this.anInt4789 = arg0;
		}
	}

	@OriginalMember(owner = "client!po", name = "g", descriptor = "(Z)V")
	public void method4274(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean348) {
			this.aBoolean348 = arg0;
			this.method4303();
			this.anInt4792 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!pe;)V")
	public void method4275(@OriginalArg(0) int arg0, @OriginalArg(1) Class156 arg1) {
		@Pc(2) Interface9 local2 = arg1.anInterface9_3;
		this.method4266(local2);
		local2.method5703(arg0, arg1);
		this.aClass156Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!po", name = "A", descriptor = "()Z")
	@Override
	public boolean method4854() {
		return true;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(F)V")
	public void method4276(@OriginalArg(0) float arg0) {
		if (this.aFloat83 != arg0) {
			this.aFloat83 = arg0;
			if (this.anInt4778 == 3) {
				this.method4332();
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "L", descriptor = "()V")
	@Override
	public void method4884() {
		this.anInt4760 = this.aCanvas4.getWidth();
		this.anInt4762 = this.aCanvas4.getHeight();
		this.anOpengl2.glViewport(this.anInt4779, this.anInt4783, this.anInt4760, this.anInt4762);
		this.method4343();
		this.method4810();
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method4838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4334();
		this.method4342(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!po", name = "e", descriptor = "(II)V")
	public void method4277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4779 = arg0;
		this.anInt4783 = arg1;
		this.anOpengl2.glViewport(arg0, arg1, this.anInt4760, this.anInt4762);
		this.method4272();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!oq;IIII)Lclient!mj;")
	@Override
	public Class101 method4804(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class101_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!po", name = "z", descriptor = "()I")
	@Override
	public int method4853() {
		@Pc(2) int local2 = this.anInt4797;
		this.anInt4797 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!po", name = "N", descriptor = "()V")
	private void method4278() {
		this.aClass112_Sub2_1 = new Class112_Sub2();
		this.aClass112_Sub2_2 = new Class112_Sub2();
		this.aClass11Array1 = new Class11[this.anInt4788];
		this.aBooleanArray24 = new boolean[this.anInt4770];
		this.aClass156Array1 = new Class156[this.anInt4770];
		this.aClass11_Sub1_6 = new Class11_Sub1(this, 3553, 6408, 1, 1);
		this.aClass11_Sub1_5 = new Class11_Sub1(this, 3553, 6408, 1, 1);
		this.aClass11_Sub1_4 = new Class11_Sub1(this, 3553, 6408, 1, 1);
		this.aClass101_Sub1_2 = new Class101_Sub1(this);
		this.aClass101_Sub1_1 = new Class101_Sub1(this);
		this.aClass101_Sub1_5 = new Class101_Sub1(this);
		this.aClass101_Sub1_3 = new Class101_Sub1(this);
		this.aClass101_Sub1_4 = new Class101_Sub1(this);
		this.aClass101_Sub1_6 = new Class101_Sub1(this);
		this.anInterface2_4 = this.method4312(null, 1024, true);
		if (this.aBoolean367) {
			this.aClass87_3 = new Class87(this);
		}
		this.aClass74_1.method2155(this);
	}

	@OriginalMember(owner = "client!po", name = "s", descriptor = "()V")
	@Override
	protected void method4828() {
		if (this.anOpengl2 != null) {
			try {
				this.aClass197_1.method5335();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl2 = null;
		}
		if (this.aContext1 != null) {
			this.method4336();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean347) {
			Static280.method4737(true);
			this.aBoolean347 = false;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!nc;)V")
	public void method4279(@OriginalArg(0) Class112_Sub2 arg0) {
		this.anOpengl2.glPushMatrix();
		this.anOpengl2.glMultMatrixf(arg0.method3601(), 0);
	}

	@OriginalMember(owner = "client!po", name = "k", descriptor = "(I)I")
	public int method4280(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!po", name = "O", descriptor = "()V")
	private void method4281() {
		Static245.aFloatArray21[0] = this.aFloat81 * this.aFloat75;
		Static245.aFloatArray21[1] = this.aFloat81 * this.aFloat73;
		Static245.aFloatArray21[2] = this.aFloat81 * this.aFloat86;
		Static245.aFloatArray21[3] = 1.0F;
		this.anOpengl2.glLightModelfv(2899, Static245.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([Lclient!mj;Lclient!bg;Lclient!vr;[Lclient!ue;I)V")
	@Override
	public void method4856(@OriginalArg(0) Class101[] arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) Class63_Sub7[] arg3, @OriginalArg(4) int arg4) {
		this.method4840(arg0, arg2, arg3, arg4);
		this.method4868(arg1);
	}

	@OriginalMember(owner = "client!po", name = "P", descriptor = "()I")
	private int method4282() {
		@Pc(1) int local1 = 0;
		this.aString280 = this.anOpengl2.glGetString(7936);
		this.aString279 = this.anOpengl2.glGetString(7937);
		@Pc(17) String local17 = this.aString280.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl2.glGetString(7938);
		@Pc(53) String[] local53 = Static219.method3847(' ', local45.replace('.', ' '));
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static269.method4544(local53[0]);
				@Pc(69) int local69 = Static269.method4544(local53[1]);
				this.anInt4774 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt4774 < 12) {
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
		this.anInt4788 = local116[0];
		this.anOpengl2.glGetIntegerv(34929, local116, 0);
		this.anInt4770 = local116[0];
		this.anOpengl2.glGetIntegerv(34930, local116, 0);
		this.anInt4766 = local116[0];
		if (this.anInt4788 < 2 || this.anInt4770 < 2 || this.anInt4766 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean350 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean366 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean349 = this.anOpengl2.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean353 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean361 = this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean352 = this.anOpengl2.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean362 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean354 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean365 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean364 = false;
		this.aBoolean367 = this.anOpengl2.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!po", name = "e", descriptor = "(IIII)V")
	@Override
	public void method4869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4781 = arg0;
		this.anInt4793 = arg1;
		this.anInt4786 = arg2;
		this.anInt4785 = arg3;
		@Pc(23) float local23 = (float) (-this.anInt4781 * this.anInt4769) / (float) this.anInt4786;
		@Pc(35) float local35 = (float) (-this.anInt4793 * this.anInt4769) / (float) this.anInt4785;
		@Pc(49) float local49 = (float) ((this.anInt4760 - this.anInt4781) * this.anInt4769) / (float) this.anInt4786;
		@Pc(63) float local63 = (float) ((this.anInt4762 - this.anInt4793) * this.anInt4769) / (float) this.anInt4785;
		this.method4333(local23, local49, -local63, -local35, (float) this.anInt4769, (float) this.anInt4776);
		if (this.anInt4778 != 1) {
			this.method4343();
		}
		this.method4304();
		this.method4283();
	}

	@OriginalMember(owner = "client!po", name = "Q", descriptor = "()V")
	private void method4283() {
		this.aFloat77 = this.anInt4790 - this.anInt4781;
		this.aFloat82 = this.anInt4796 - this.anInt4781;
		this.aFloat76 = this.anInt4773 - this.anInt4793;
		this.aFloat88 = this.anInt4767 - this.anInt4793;
	}

	@OriginalMember(owner = "client!po", name = "E", descriptor = "()Z")
	@Override
	public boolean method4864() {
		return true;
	}

	@OriginalMember(owner = "client!po", name = "y", descriptor = "()V")
	@Override
	public void method4848() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "()I")
	@Override
	public int method4264() {
		return this.anInt4762;
	}

	@OriginalMember(owner = "client!po", name = "R", descriptor = "()V")
	private void method4284() {
		if (this.aBoolean355 && !this.aBoolean371) {
			this.anOpengl2.glEnable(2896);
		} else {
			this.anOpengl2.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "()V")
	@Override
	public void method4265() {
	}

	@OriginalMember(owner = "client!po", name = "S", descriptor = "()V")
	public void method4285() {
		if (this.anInt4792 == 8) {
			return;
		}
		this.method4294();
		this.method4310(true);
		this.method4267(true);
		this.method4274(true);
		this.method4342(1);
		this.method4327(1);
		this.anInt4792 = 8;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(F)V")
	@Override
	public void method4791(@OriginalArg(0) float arg0) {
		if (this.aFloat81 != arg0) {
			this.aFloat81 = arg0;
			this.method4281();
		}
	}

	@OriginalMember(owner = "client!po", name = "e", descriptor = "()Lclient!vr;")
	@Override
	public Class112 method4789() {
		return new Class112_Sub2();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4837(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!po", name = "D", descriptor = "()Z")
	@Override
	public boolean method4862() {
		return true;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4807(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method4848();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	@Override
	public void method4816(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!po", name = "C", descriptor = "()V")
	@Override
	public void method4860() {
		this.method4274(true);
		this.anOpengl2.glClear(256);
	}

	@OriginalMember(owner = "client!po", name = "f", descriptor = "(II)V")
	public synchronized void method4286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class5_Sub37 local4 = new Class5_Sub37(arg1);
		local4.aLong218 = arg0;
		this.aClass211_26.method5609(local4);
	}

	@OriginalMember(owner = "client!po", name = "i", descriptor = "()I")
	@Override
	public int method4800() {
		@Pc(2) int local2 = this.anInt4798;
		this.anInt4798 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass112_Sub2_1.aFloat57 * (float) arg0 + this.aClass112_Sub2_1.aFloat55 * (float) arg1 + this.aClass112_Sub2_1.aFloat54 * (float) arg2 + this.aClass112_Sub2_1.aFloat62;
		if (local24 < (float) this.anInt4769 || local24 > (float) this.anInt4776) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt4786 * (this.aClass112_Sub2_1.aFloat51 * (float) arg0 + this.aClass112_Sub2_1.aFloat56 * (float) arg1 + this.aClass112_Sub2_1.aFloat61 * (float) arg2 + this.aClass112_Sub2_1.aFloat60) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt4785 * (this.aClass112_Sub2_1.aFloat59 * (float) arg0 + this.aClass112_Sub2_1.aFloat52 * (float) arg1 + this.aClass112_Sub2_1.aFloat53 * (float) arg2 + this.aClass112_Sub2_1.aFloat58) / local24);
		if ((float) local81 >= this.aFloat77 && (float) local81 <= this.aFloat82 && (float) local113 >= this.aFloat76 && (float) local113 <= this.aFloat88) {
			arg3[0] = (int) ((float) local81 - this.aFloat77);
			arg3[1] = (int) ((float) local113 - this.aFloat76);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([IIIII)Lclient!kh;")
	@Override
	public Class54 method4834(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class54_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!po", name = "l", descriptor = "()V")
	@Override
	public void method4810() {
		this.anInt4790 = 0;
		this.anInt4773 = 0;
		this.anInt4796 = this.anInt4760;
		this.anInt4767 = this.anInt4762;
		this.anOpengl2.glDisable(3089);
		this.method4283();
	}

	@OriginalMember(owner = "client!po", name = "u", descriptor = "()I")
	@Override
	public int method4839() {
		return this.anInt4769;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(Z)V")
	@Override
	public void method4825(@OriginalArg(0) boolean arg0) {
		this.aBoolean356 = arg0;
		this.method4303();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(FFFF)V")
	public void method4287(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static245.aFloatArray21[0] = arg0;
		Static245.aFloatArray21[1] = arg1;
		Static245.aFloatArray21[2] = arg2;
		Static245.aFloatArray21[3] = arg3;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static245.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIII)Z")
	@Override
	public boolean method4833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass112_Sub2_1.aFloat57 * (float) arg0 + this.aClass112_Sub2_1.aFloat55 * (float) arg1 + this.aClass112_Sub2_1.aFloat54 * (float) arg2 + this.aClass112_Sub2_1.aFloat62;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass112_Sub2_1.aFloat57 * (float) arg3 + this.aClass112_Sub2_1.aFloat55 * (float) arg4 + this.aClass112_Sub2_1.aFloat54 * (float) arg5 + this.aClass112_Sub2_1.aFloat62;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt4769 && local55 < (float) this.anInt4769 || !(!(local24 > (float) this.anInt4776) || !(local55 > (float) this.anInt4776))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt4786 * (this.aClass112_Sub2_1.aFloat51 * (float) arg0 + this.aClass112_Sub2_1.aFloat56 * (float) arg1 + this.aClass112_Sub2_1.aFloat61 * (float) arg2 + this.aClass112_Sub2_1.aFloat60) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt4786 * (this.aClass112_Sub2_1.aFloat51 * (float) arg3 + this.aClass112_Sub2_1.aFloat56 * (float) arg4 + this.aClass112_Sub2_1.aFloat61 * (float) arg5 + this.aClass112_Sub2_1.aFloat60) / local55);
		if ((float) local119 < this.aFloat77 && (float) local151 < this.aFloat77 || (float) local119 > this.aFloat82 && (float) local151 > this.aFloat82) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt4785 * (this.aClass112_Sub2_1.aFloat59 * (float) arg0 + this.aClass112_Sub2_1.aFloat52 * (float) arg1 + this.aClass112_Sub2_1.aFloat53 * (float) arg2 + this.aClass112_Sub2_1.aFloat58) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt4785 * (this.aClass112_Sub2_1.aFloat59 * (float) arg3 + this.aClass112_Sub2_1.aFloat52 * (float) arg4 + this.aClass112_Sub2_1.aFloat53 * (float) arg5 + this.aClass112_Sub2_1.aFloat58) / local55);
			return (!((float) local209 < this.aFloat76) || !((float) local241 < this.aFloat76)) && (!((float) local209 > this.aFloat88) || !((float) local241 > this.aFloat88));
		}
	}

	@OriginalMember(owner = "client!po", name = "e", descriptor = "(IIIIII)Lclient!bd;")
	@Override
	public Class18 method4879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean354 ? new Class18_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!fn;)V")
	@Override
	public void method4846(@OriginalArg(0) Class5_Sub14 arg0) {
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(Lclient!pe;)V")
	public void method4288(@OriginalArg(0) Class156 arg0) {
		@Pc(2) Interface9 local2 = arg0.anInterface9_3;
		this.method4266(local2);
		local2.method5702(arg0);
		this.aClass156_9 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II[I[I)Lclient!hm;")
	@Override
	public Class15 method4806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static358.method465(arg1, this, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
	@Override
	public void method4812(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!kl;)V")
	public void method4289(@OriginalArg(0) Interface5 arg0) {
		if (this.anInt4757 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt4757 >= 0) {
			this.anInterface5Array1[this.anInt4757].method4265();
		}
		this.anInterface5_1 = this.anInterface5Array1[++this.anInt4757] = arg0;
		this.anInterface5_1.method4263();
	}

	@OriginalMember(owner = "client!po", name = "T", descriptor = "()Lclient!kl;")
	public Interface5 method4290() {
		return this.anInterface5_1;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!cl;Z)Lclient!kh;")
	@Override
	public Class54 method4872(@OriginalArg(0) Class37 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt1012 * arg0.anInt1008];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray10 == null) {
			for (local15 = 0; local15 < arg0.anInt1008; local15++) {
				for (local21 = 0; local21 < arg0.anInt1012; local21++) {
					@Pc(74) int local74 = arg0.anIntArray51[arg0.aByteArray11[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt1008; local15++) {
				for (local21 = 0; local21 < arg0.anInt1012; local21++) {
					local6[local10++] = arg0.aByteArray10[local8] << 24 | arg0.anIntArray51[arg0.aByteArray11[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class54 local100 = this.method4834(local6, arg0.anInt1012, arg0.anInt1012, arg0.anInt1008);
		local100.method5567(arg0.anInt1011, arg0.anInt1013, arg0.anInt1010, arg0.anInt1009);
		return local100;
	}

	@OriginalMember(owner = "client!po", name = "h", descriptor = "(Z)V")
	public void method4291(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean371) {
			this.aBoolean371 = arg0;
			this.method4284();
		}
	}

	@OriginalMember(owner = "client!po", name = "g", descriptor = "(II)V")
	public synchronized void method4292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class5_Sub37 local4 = new Class5_Sub37(arg1);
		local4.aLong218 = arg0;
		this.aClass211_25.method5609(local4);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IZZ)V")
	public void method4293(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt4787) {
			if (arg0 < 0) {
				this.method4340();
				this.method4296(null);
				if (!this.aBoolean363) {
					this.aClass157_1.method4039(0, arg1, arg2);
				}
			} else {
				@Pc(11) Class11_Sub1 local11 = this.aClass204_1.method5431(arg0);
				@Pc(17) Class84 local17 = this.anInterface1_5.method2005(arg0);
				if (local17.aByte24 == 0 && local17.aByte28 == 0) {
					this.method4340();
				} else {
					@Pc(30) int local30 = local17.aBoolean170 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method4269((float) (this.anInt4759 % local34 * local17.aByte24) / (float) local34, (float) (this.anInt4759 % local34 * local17.aByte28) / (float) local34, 0.0F);
				}
				if (this.aBoolean363) {
					this.aClass157_1.method4039(3, arg1, arg2);
					this.method4296(local11);
				} else {
					this.aClass157_1.method4039(local17.aByte29, arg1, arg2);
					this.aClass157_1.method4038(false, local17.aByte27);
					if (!this.aClass157_1.method4037(local11)) {
						this.method4296(local11);
					}
				}
			}
			this.anInt4787 = arg0;
		}
		this.anInt4792 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl2.glLineWidth((float) arg5);
		this.method4850(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl2.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!po", name = "U", descriptor = "()V")
	public void method4294() {
		if (this.anInt4778 != 2) {
			this.anInt4778 = 2;
			this.method4313();
			this.method4335();
			this.anInt4792 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!po", name = "V", descriptor = "()V")
	private void method4295() {
		if (this.anInt4778 == 1) {
			return;
		}
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho(0.0D, (double) this.anInt4760, (double) this.anInt4762, 0.0D, -1.0D, 1.0D);
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anInt4778 = 1;
		this.anInt4792 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!fl;)V")
	public void method4296(@OriginalArg(0) Class11 arg0) {
		@Pc(5) Class11 local5 = this.aClass11Array1[this.anInt4789];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl2.glDisable(local5.anInt3902);
			} else {
				if (local5 == null) {
					this.anOpengl2.glEnable(arg0.anInt3902);
				} else if (arg0.anInt3902 != local5.anInt3902) {
					this.anOpengl2.glDisable(local5.anInt3902);
					this.anOpengl2.glEnable(arg0.anInt3902);
				}
				this.anOpengl2.glBindTexture(arg0.anInt3902, arg0.method3579());
			}
			this.aClass11Array1[this.anInt4789] = arg0;
		}
		this.anInt4792 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(III)V")
	public void method4297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(IIIII)V")
	@Override
	protected void method4831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!po", name = "g", descriptor = "(I)Lclient!fn;")
	@Override
	public Class5_Sub14 method4861() {
		return null;
	}

	@OriginalMember(owner = "client!po", name = "o", descriptor = "()Z")
	@Override
	public boolean method4818() {
		return this.aClass157_1.method4040();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!hm;II)V")
	@Override
	public void method4803(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class15_Sub1 local2 = (Class15_Sub1) arg0;
		@Pc(5) Class11_Sub1_Sub1 local5 = local2.aClass11_Sub1_Sub1_1;
		this.method4305();
		this.method4296(local2.aClass11_Sub1_Sub1_1);
		this.method4342(1);
		this.method4311(7681, 8448);
		this.method4297(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat10 / (float) local5.anInt369;
		@Pc(37) float local37 = local5.aFloat9 / (float) local5.anInt368;
		this.anOpengl2.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt4790 - arg1), local37 * (float) (this.anInt4773 - arg2));
		this.anOpengl2.glVertex2i(this.anInt4790, this.anInt4773);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt4790 - arg1), local37 * (float) (this.anInt4767 - arg2));
		this.anOpengl2.glVertex2i(this.anInt4790, this.anInt4767);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt4796 - arg1), local37 * (float) (this.anInt4767 - arg2));
		this.anOpengl2.glVertex2i(this.anInt4796, this.anInt4767);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt4796 - arg1), local37 * (float) (this.anInt4773 - arg2));
		this.anOpengl2.glVertex2i(this.anInt4796, this.anInt4773);
		this.anOpengl2.glEnd();
		this.method4297(0, 5890, 768);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([I)V")
	@Override
	public void method4817(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4790;
		arg0[1] = this.anInt4773;
		arg0[2] = this.anInt4796;
		arg0[3] = this.anInt4767;
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(III)V")
	public void method4298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!po", name = "W", descriptor = "()V")
	public void method4299() {
		if (this.anInt4792 == 16) {
			return;
		}
		this.method4328();
		this.method4310(true);
		this.method4267(true);
		this.method4274(true);
		this.method4342(1);
		this.method4327(1);
		this.anInt4792 = 16;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method4850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4334();
		this.method4342(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
	@Override
	public void method4823(@OriginalArg(0) int arg0) {
		this.method4342(0);
		this.anOpengl2.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl2.glClear(16384);
	}

	@OriginalMember(owner = "client!po", name = "G", descriptor = "()V")
	@Override
	public void method4871() {
		this.aClass197_1.method5342();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!ti;")
	public Interface9 method4300(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface9) (this.aBoolean366 ? new Class40_Sub2(this, arg0, arg1, false) : new Class8_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!po", name = "l", descriptor = "(I)V")
	public void method4301(@OriginalArg(0) int arg0) {
		Static245.aFloatArray21[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static245.aFloatArray21[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static245.aFloatArray21[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static245.aFloatArray21[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static245.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!po", name = "v", descriptor = "()Z")
	@Override
	public boolean method4841() {
		return false;
	}

	@OriginalMember(owner = "client!po", name = "X", descriptor = "()V")
	public void method4302() {
		this.anOpengl2.glPopMatrix();
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "()Z")
	@Override
	public boolean method4786() {
		return Static11.aString17 == null || !Static11.aString17.startsWith("mac");
	}

	@OriginalMember(owner = "client!po", name = "Y", descriptor = "()V")
	private void method4303() {
		this.anOpengl2.glDepthMask(this.aBoolean348 && this.aBoolean356);
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(II)V")
	@Override
	public void method4886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4769 == arg0 && this.anInt4776 == arg1) {
			return;
		}
		this.anInt4769 = arg0;
		this.anInt4776 = arg1;
		this.method4343();
		this.method4304();
		this.method4329();
	}

	@OriginalMember(owner = "client!po", name = "K", descriptor = "()V")
	@Override
	public void method4883() {
		if (this.aClass5_Sub5_Sub1_1.method828()) {
			this.aClass197_1.method5338(this.aClass5_Sub5_Sub1_1);
			this.aClass204_1.method5432();
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!nm;[Lclient!cl;Z)Lclient!tc;")
	@Override
	public Class91 method4813(@OriginalArg(0) Class138 arg0, @OriginalArg(1) Class37[] arg1) {
		return new Class91_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!po", name = "Z", descriptor = "()V")
	private void method4304() {
		this.aFloat84 = (this.aFloatArray27[14] - (float) this.anInt4776) / this.aFloatArray27[10];
		this.aFloat78 = (float) this.anInt4776 - this.aFloat71;
	}

	@OriginalMember(owner = "client!po", name = "ab", descriptor = "()V")
	public void method4305() {
		if (this.anInt4792 == 2) {
			return;
		}
		this.method4295();
		this.method4310(false);
		this.method4321(false);
		this.method4267(false);
		this.method4274(false);
		this.method4320();
		this.anInt4792 = 2;
	}

	@OriginalMember(owner = "client!po", name = "bb", descriptor = "()V")
	private void method4306() {
		if (this.aBoolean358 && this.aBoolean363 | this.anInt4780 >= 0) {
			this.anOpengl2.glEnable(2912);
		} else {
			this.anOpengl2.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!po", name = "t", descriptor = "()Z")
	@Override
	public boolean method4832() {
		return true;
	}

	@OriginalMember(owner = "client!po", name = "x", descriptor = "()Z")
	@Override
	public boolean method4844() {
		return this.aClass5_Sub5_Sub1_1.method828();
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(IIII)V")
	@Override
	public void method4866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass197_1.method5340(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!po", name = "h", descriptor = "(II)V")
	public synchronized void method4307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class5_Sub37 local4 = new Class5_Sub37(arg1);
		local4.aLong218 = arg0;
		this.aClass211_27.method5609(local4);
	}

	@OriginalMember(owner = "client!po", name = "cb", descriptor = "()V")
	public void method4308() {
		if (this.anInt4792 == 4) {
			return;
		}
		this.method4295();
		this.method4310(false);
		this.method4321(false);
		this.method4267(false);
		this.method4274(false);
		this.method4320();
		this.method4342(1);
		this.method4327(1);
		this.anInt4792 = 4;
	}

	@OriginalMember(owner = "client!po", name = "m", descriptor = "(I)I")
	public int method4309(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIZ)Lclient!kh;")
	@Override
	public Class54 method4794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class54_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "()V")
	@Override
	public void method4263() {
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!vr;)V")
	@Override
	public void method4787(@OriginalArg(0) Class112 arg0) {
		this.aClass112_Sub2_1 = (Class112_Sub2) arg0;
		this.aClass112_Sub2_2.method3603(this.aClass112_Sub2_1);
		if (this.anInt4778 != 1) {
			this.method4335();
		}
	}

	@OriginalMember(owner = "client!po", name = "i", descriptor = "(Z)V")
	public void method4310(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean358) {
			this.aBoolean358 = arg0;
			this.method4306();
			this.anInt4792 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!po", name = "n", descriptor = "()V")
	@Override
	public void method4815() {
	}

	@OriginalMember(owner = "client!po", name = "i", descriptor = "(II)V")
	public void method4311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4789 != 0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt4777 != arg0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anInt4777 = arg0;
			local4 = true;
		}
		if (this.lb != arg1) {
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			this.lb = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt4792 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I[BIZ)Lclient!eo;")
	public Interface2 method4312(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface2) (this.aBoolean366 && (!arg2 || this.aBoolean369) ? new Class40_Sub1(this, 5123, arg0, arg1, arg2) : new Class8_Sub1(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!bg;)V")
	@Override
	public void method4868(@OriginalArg(0) Class21 arg0) {
		this.aClass74_1.method2156(this, arg0);
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method4877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method4334();
		this.method4342(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean349) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local19);
		this.anOpengl2.glVertex2f(local14, local19);
		this.anOpengl2.glVertex2f(local14, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean349) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!po", name = "J", descriptor = "()V")
	@Override
	public void method4881() {
		@Pc(2) int local2 = this.anInt4790;
		@Pc(5) int local5 = this.anInt4796;
		@Pc(8) int local8 = this.anInt4773;
		@Pc(11) int local11 = this.anInt4767;
		this.method4810();
		this.anOpengl2.glReadBuffer(1028);
		this.anOpengl2.glDrawBuffer(1029);
		this.method4343();
		this.method4310(false);
		this.method4321(false);
		this.method4267(false);
		this.method4274(false);
		this.method4296(null);
		this.method4320();
		this.method4327(0);
		this.method4342(0);
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRasterPos2i(0, 0);
		this.anOpengl2.glCopyPixels(0, 0, this.anInt4760, this.anInt4762, 6144);
		this.anOpengl2.glFlush();
		this.anOpengl2.glReadBuffer(1029);
		this.anOpengl2.glDrawBuffer(1029);
		this.method4795(local2, local8, local5, local11);
	}

	@OriginalMember(owner = "client!po", name = "db", descriptor = "()V")
	private void method4313() {
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadMatrixf(this.aFloatArray27, 0);
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!bd;Lclient!bd;FLclient!bd;)Lclient!bd;")
	@Override
	public Class18 method4836(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean354 && this.aBoolean367) {
			@Pc(11) Class18_Sub1_Sub2 local11 = null;
			@Pc(14) Class18_Sub1 local14 = (Class18_Sub1) arg0;
			@Pc(17) Class18_Sub1 local17 = (Class18_Sub1) arg1;
			@Pc(21) Class11_Sub2 local21 = local14.method5332();
			@Pc(25) Class11_Sub2 local25 = local17.method5332();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt529 > local25.anInt529 ? local21.anInt529 : local25.anInt529;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class18_Sub1_Sub2) {
					@Pc(52) Class18_Sub1_Sub2 local52 = (Class18_Sub1_Sub2) arg3;
					if (local52.method5334() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class18_Sub1_Sub2(this, local40);
				}
				local11.method5333(local25, local21, arg2);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!po", name = "n", descriptor = "(I)V")
	public synchronized void method4314(@OriginalArg(0) int arg0) {
		@Pc(4) Class5_Sub37 local4 = new Class5_Sub37(arg0);
		this.aClass211_29.method5609(local4);
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(Lclient!kl;)V")
	public void method4315(@OriginalArg(0) Interface5 arg0) {
		if (this.anInt4757 < 0 || this.anInterface5Array1[this.anInt4757] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface5Array1[this.anInt4757--] = null;
		arg0.method4265();
		if (this.anInt4757 >= 0) {
			this.anInterface5_1 = this.anInterface5Array1[this.anInt4757];
			this.anInterface5_1.method4263();
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4819() {
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt4760) {
			arg2 = this.anInt4760;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt4762) {
			arg3 = this.anInt4762;
		}
		this.anInt4790 = arg0;
		this.anInt4773 = arg1;
		this.anInt4796 = arg2;
		this.anInt4767 = arg3;
		this.anOpengl2.glEnable(3089);
		this.method4283();
		this.method4272();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IZ)V")
	public void method4316(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4293(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!po", name = "F", descriptor = "()Z")
	@Override
	public boolean method4865() {
		return false;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4845(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class5_Sub37 local16;
		while (!this.aClass211_25.method5606()) {
			local16 = (Class5_Sub37) this.aClass211_25.method5596();
			Static245.anIntArray374[local1++] = (int) local16.aLong218;
			this.anInt4763 -= local16.anInt5532;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteBuffersARB(local1, Static245.anIntArray374, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteBuffersARB(local1, Static245.anIntArray374, 0);
			local1 = 0;
		}
		while (!this.aClass211_26.method5606()) {
			local16 = (Class5_Sub37) this.aClass211_26.method5596();
			Static245.anIntArray374[local1++] = (int) local16.aLong218;
			this.anInt4758 -= local16.anInt5532;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteTextures(local1, Static245.anIntArray374, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteTextures(local1, Static245.anIntArray374, 0);
			local1 = 0;
		}
		while (!this.aClass211_27.method5606()) {
			local16 = (Class5_Sub37) this.aClass211_27.method5596();
			Static245.anIntArray374[local1++] = local16.anInt5532;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteFramebuffersEXT(local1, Static245.anIntArray374, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteFramebuffersEXT(local1, Static245.anIntArray374, 0);
			local1 = 0;
		}
		while (!this.aClass211_28.method5606()) {
			local16 = (Class5_Sub37) this.aClass211_28.method5596();
			Static245.anIntArray374[local1++] = (int) local16.aLong218;
			this.anInt4764 -= local16.anInt5532;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static245.anIntArray374, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static245.anIntArray374, 0);
			local1 = 0;
		}
		while (!this.aClass211_29.method5606()) {
			local16 = (Class5_Sub37) this.aClass211_29.method5596();
			Static245.anIntArray374[local1++] = (int) local16.aLong218;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteProgramsARB(local1, Static245.anIntArray374, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteProgramsARB(local1, Static245.anIntArray374, 0);
		}
		while (!this.aClass211_24.method5606()) {
			local16 = (Class5_Sub37) this.aClass211_24.method5596();
			this.anOpengl2.glDeleteLists((int) local16.aLong218, local16.anInt5532);
		}
		while (!this.aClass211_30.method5606()) {
			local16 = (Class5_Sub37) this.aClass211_30.method5596();
			this.anOpengl2.glDeleteObjectARB(local16.anInt5532);
		}
		while (!this.aClass211_24.method5606()) {
			local16 = (Class5_Sub37) this.aClass211_24.method5596();
			this.anOpengl2.glDeleteLists((int) local16.aLong218, local16.anInt5532);
		}
		if (this.method4880() > 100663296 && Static284.method4783() > this.aLong165 + 60000L) {
			System.gc();
			this.aLong165 = Static284.method4783();
		}
		this.anInt4759 = local5;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(III)V")
	@Override
	public void method4863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean363) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt4768 = arg1;
		this.anInt4775 = arg2;
		this.method4329();
		this.aClass157_1.method4038(true, arg0);
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I[BIZ)Lclient!ti;")
	public Interface9 method4317(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface9) (this.aBoolean366 && (!arg3 || this.aBoolean369) ? new Class40_Sub2(this, arg0, arg1, arg2, arg3) : new Class8_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!po", name = "h", descriptor = "()Z")
	@Override
	public boolean method4799() {
		return false;
	}

	@OriginalMember(owner = "client!po", name = "r", descriptor = "()Z")
	@Override
	public boolean method4827() {
		return this.aBoolean349;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I[Lclient!vg;)V")
	@Override
	public void method4885(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub13[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class5_Sub13 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static245.aFloatArray22[0] = local8.anInt2080;
			Static245.aFloatArray22[1] = local8.anInt2076;
			Static245.aFloatArray22[2] = local8.anInt2082;
			Static245.aFloatArray22[3] = 1.0F;
			this.anOpengl2.glLightfv(local12, 4611, Static245.aFloatArray22, 0);
			@Pc(44) int local44 = local8.anInt2077;
			@Pc(49) float local49 = local8.aFloat29 / 255.0F;
			Static245.aFloatArray22[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static245.aFloatArray22[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static245.aFloatArray22[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl2.glLightfv(local12, 4609, Static245.aFloatArray22, 0);
			this.anOpengl2.glLightf(local12, 4617, 1.0F / (float) (local8.anInt2079 * local8.anInt2079));
			this.anOpengl2.glEnable(local12);
		}
		while (local1 < this.anInt4772) {
			this.anOpengl2.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt4772 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!eo;III)V")
	public void method4318(@OriginalArg(0) Interface2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4331(arg0);
		arg0.method2595(arg1, arg2);
	}

	@OriginalMember(owner = "client!po", name = "eb", descriptor = "()V")
	private void method4319() {
		if (this.aFloat71 == 0.0F) {
			this.aFloatArray27[10] = this.aFloat87;
			this.aFloatArray27[14] = this.aFloat72;
		} else {
			@Pc(13) float local13 = this.aFloat79 / (this.aFloat71 + this.aFloat79);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat72 * (1.0F - local13) * (1.0F - local13) / this.aFloat71;
			this.aFloatArray27[10] = this.aFloat87 + local32;
			this.aFloatArray27[14] = this.aFloat72 * local17;
		}
		this.method4304();
	}

	@OriginalMember(owner = "client!po", name = "o", descriptor = "(I)V")
	public void method4320() {
		this.method4316(-2, true);
	}

	@OriginalMember(owner = "client!po", name = "q", descriptor = "()Z")
	@Override
	public boolean method4826() {
		if (!this.aClass5_Sub5_Sub1_1.method828()) {
			if (!this.aClass197_1.method5336(this.aClass5_Sub5_Sub1_1)) {
				return false;
			}
			this.aClass204_1.method5432();
		}
		return true;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(IIII)V")
	@Override
	public void method4829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4790 < arg0) {
			this.anInt4790 = arg0;
		}
		if (this.anInt4796 > arg2) {
			this.anInt4796 = arg2;
		}
		if (this.anInt4773 < arg1) {
			this.anInt4773 = arg1;
		}
		if (this.anInt4767 > arg3) {
			this.anInt4767 = arg3;
		}
		this.anOpengl2.glEnable(3089);
		this.method4283();
		this.method4272();
	}

	@OriginalMember(owner = "client!po", name = "m", descriptor = "()F")
	@Override
	public float method4814() {
		return this.aFloat71;
	}

	@OriginalMember(owner = "client!po", name = "p", descriptor = "()Z")
	@Override
	public boolean method4824() {
		return this.aClass5_Sub5_Sub1_1.method829();
	}

	@OriginalMember(owner = "client!po", name = "j", descriptor = "(Z)V")
	public void method4321(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean355) {
			this.aBoolean355 = arg0;
			this.method4284();
			this.anInt4792 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(Lclient!pe;)V")
	public void method4322(@OriginalArg(0) Class156 arg0) {
		@Pc(2) Interface9 local2 = arg0.anInterface9_3;
		this.method4266(local2);
		local2.method5704(arg0);
		this.aClass156_10 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II[[I[[IIII)Lclient!ac;")
	@Override
	public Class3 method4874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class3_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!po", name = "fb", descriptor = "()V")
	private void method4323() {
		Static245.aFloatArray21[0] = this.aFloat74 * this.aFloat75;
		Static245.aFloatArray21[1] = this.aFloat74 * this.aFloat73;
		Static245.aFloatArray21[2] = this.aFloat74 * this.aFloat86;
		Static245.aFloatArray21[3] = 1.0F;
		this.anOpengl2.glLightfv(16384, 4609, Static245.aFloatArray21, 0);
		Static245.aFloatArray21[0] = -this.aFloat89 * this.aFloat75;
		Static245.aFloatArray21[1] = -this.aFloat89 * this.aFloat73;
		Static245.aFloatArray21[2] = -this.aFloat89 * this.aFloat86;
		Static245.aFloatArray21[3] = 1.0F;
		this.anOpengl2.glLightfv(16385, 4609, Static245.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!po", name = "j", descriptor = "()Z")
	@Override
	public boolean method4805() {
		return true;
	}

	@OriginalMember(owner = "client!po", name = "I", descriptor = "()I")
	@Override
	public int method4880() {
		return this.anInt4763 + this.anInt4758 + this.anInt4764;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method4851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method4334();
		this.method4342(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean349) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local23);
		this.anOpengl2.glVertex2f(local16, local23);
		this.anOpengl2.glVertex2f(local16, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean349) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!po", name = "gb", descriptor = "()V")
	private void method4324() {
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
			Static105.method2138(1000L);
		}
	}

	@OriginalMember(owner = "client!po", name = "hb", descriptor = "()V")
	public void method4325() {
		@Pc(6) boolean local6 = this.aClass156_9 != null;
		if (local6 != this.aBoolean359) {
			if (local6) {
				this.anOpengl2.glEnableClientState(32884);
			} else {
				this.anOpengl2.glDisableClientState(32884);
			}
			this.aBoolean359 = local6;
		}
		this.aClass156_9 = null;
		@Pc(34) boolean local34 = this.aClass156_11 != null;
		if (local34 != this.aBoolean357) {
			if (local34) {
				this.anOpengl2.glEnableClientState(32885);
			} else {
				this.anOpengl2.glDisableClientState(32885);
			}
			this.aBoolean357 = local34;
		}
		this.aClass156_11 = null;
		@Pc(62) boolean local62 = this.aClass156_10 != null;
		if (local62 != this.aBoolean351) {
			if (local62) {
				this.anOpengl2.glEnableClientState(32886);
			} else {
				this.anOpengl2.glDisableClientState(32886);
			}
			this.aBoolean351 = local62;
		}
		this.aClass156_10 = null;
		for (@Pc(85) int local85 = 0; local85 < this.anInt4770; local85++) {
			@Pc(98) boolean local98 = this.aClass156Array1[local85] != null;
			if (local98 != this.aBooleanArray24[local85]) {
				this.anOpengl2.glClientActiveTexture(local85 + 33984);
				if (local98) {
					this.anOpengl2.glEnableClientState(32888);
				} else {
					this.anOpengl2.glDisableClientState(32888);
				}
				this.aBooleanArray24[local85] = local98;
			}
			this.aClass156Array1[local85] = null;
		}
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V")
	@Override
	public void method4847(@OriginalArg(0) int arg0) {
		this.method4324();
	}

	@OriginalMember(owner = "client!po", name = "w", descriptor = "()Z")
	@Override
	public boolean method4842() {
		return true;
	}

	@OriginalMember(owner = "client!po", name = "ib", descriptor = "()Lclient!bc;")
	public Class11_Sub2 method4326() {
		return this.aClass18_Sub1_1 == null ? null : this.aClass18_Sub1_1.method5332();
	}

	@OriginalMember(owner = "client!po", name = "p", descriptor = "(I)V")
	public void method4327(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4311(7681, 7681);
		} else if (arg0 == 1) {
			this.method4311(8448, 8448);
		} else if (arg0 == 2) {
			this.method4311(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!po", name = "jb", descriptor = "()V")
	private void method4328() {
		if (this.anInt4778 != 3) {
			this.anInt4778 = 3;
			this.method4332();
			this.method4335();
			this.anInt4792 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!po", name = "kb", descriptor = "()V")
	private void method4329() {
		@Pc(15) int local15;
		if (this.aBoolean363) {
			this.anOpengl2.glFogf(2915, 0.0F);
			this.anOpengl2.glFogf(2916, 1.0F);
			local15 = this.anInt4768;
		} else {
			this.aFloat80 = (float) (this.anInt4776 - 256) - this.aFloat85;
			this.aFloat90 = this.aFloat80 - (float) this.anInt4780 * this.aFloat91;
			if (this.aFloat90 < (float) this.anInt4769) {
				this.aFloat90 = this.anInt4769;
			}
			this.anOpengl2.glFogf(2915, this.aFloat90);
			this.anOpengl2.glFogf(2916, this.aFloat80);
			local15 = this.anInt4765;
		}
		Static245.aFloatArray21[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static245.aFloatArray21[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static245.aFloatArray21[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl2.glFogfv(2918, Static245.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!po", name = "lb", descriptor = "()V")
	public void method4330() {
		this.anOpengl2.glLightfv(16384, 4611, this.aFloatArray24, 0);
		this.anOpengl2.glLightfv(16385, 4611, this.aFloatArray25, 0);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
	@Override
	public void method4822() {
		this.aBoolean363 = true;
		this.anInt4768 = 1583160;
		this.anInt4775 = 40;
		this.method4329();
		this.method4306();
		this.aClass157_1.method4039(3, false, false);
		this.aClass157_1.method4038(true, -1);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!eo;)V")
	public void method4331(@OriginalArg(0) Interface2 arg0) {
		if (this.anInterface2_5 != arg0 && this.aBoolean366) {
			this.anOpengl2.glBindBufferARB(34963, arg0.method5698());
			this.anInterface2_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!po", name = "mb", descriptor = "()V")
	private void method4332() {
		@Pc(11) float local11 = (float) -this.anInt4781 * this.aFloat83 / (float) this.anInt4786;
		@Pc(23) float local23 = (float) -this.anInt4793 * this.aFloat83 / (float) this.anInt4785;
		@Pc(37) float local37 = (float) (this.anInt4760 - this.anInt4781) * this.aFloat83 / (float) this.anInt4786;
		@Pc(51) float local51 = (float) (this.anInt4762 - this.anInt4793) * this.aFloat83 / (float) this.anInt4785;
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt4769 - this.aFloat71), (double) ((float) this.anInt4776 - this.aFloat71));
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(FFFFFF)V")
	private void method4333(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		@Pc(6) float[] local6 = this.aFloatArray27;
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
		local6[10] = this.aFloat87 = -(arg5 + arg4) / (arg5 - arg4);
		local6[11] = -1.0F;
		local6[12] = 0.0F;
		local6[13] = 0.0F;
		local6[14] = this.aFloat72 = -(local3 * arg5) / (arg5 - arg4);
		local6[15] = 0.0F;
		this.method4319();
	}

	@OriginalMember(owner = "client!po", name = "nb", descriptor = "()V")
	private void method4334() {
		if (this.anInt4792 == 1) {
			return;
		}
		this.method4295();
		this.method4310(false);
		this.method4321(false);
		this.method4267(false);
		this.method4274(false);
		this.method4296(null);
		this.method4320();
		this.method4327(0);
		this.anInt4792 = 1;
	}

	@OriginalMember(owner = "client!po", name = "k", descriptor = "()F")
	@Override
	public float method4808() {
		return this.aFloat79;
	}

	@OriginalMember(owner = "client!po", name = "ob", descriptor = "()V")
	private void method4335() {
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl2.glMultMatrixf(this.aClass112_Sub2_1.method3601(), 0);
		this.method4330();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method4793(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt4782 != arg0;
		if (local7 || this.aFloat74 != arg1 || this.aFloat89 != arg2) {
			this.anInt4782 = arg0;
			this.aFloat74 = arg1;
			this.aFloat89 = arg2;
			if (local7) {
				this.aFloat75 = (float) (this.anInt4782 & 0xFF0000) / 1.671168E7F;
				this.aFloat73 = (float) (this.anInt4782 & 0xFFFF) / 65535.0F;
				this.aFloat86 = (float) (this.anInt4782 & 0xFF) / 255.0F;
				this.method4281();
			}
			this.method4323();
		}
		if (this.aFloatArray24[0] == arg3 && this.aFloatArray24[1] == arg4 && this.aFloatArray24[2] == arg5) {
			return;
		}
		this.aFloatArray24[0] = arg3;
		this.aFloatArray24[1] = arg4;
		this.aFloatArray24[2] = arg5;
		this.aFloatArray25[0] = -arg3;
		this.aFloatArray25[1] = -arg4;
		this.aFloatArray25[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray26[0] = arg3 * local132;
		this.aFloatArray26[1] = arg4 * local132;
		this.aFloatArray26[2] = arg5 * local132;
		this.aFloatArray23[0] = -this.aFloatArray26[0];
		this.aFloatArray23[1] = -this.aFloatArray26[1];
		this.aFloatArray23[2] = -this.aFloatArray26[2];
		this.method4330();
		this.anInt4795 = (int) (arg3 * 256.0F / arg4);
		this.anInt4784 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!po", name = "pb", descriptor = "()V")
	private void method4336() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(II)I")
	@Override
	public int method4792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(FF)V")
	public void method4337(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat91 = arg0;
		this.aFloat85 = arg1;
		if (!this.aBoolean363) {
			this.method4329();
		}
	}

	@OriginalMember(owner = "client!po", name = "e", descriptor = "(III)V")
	public void method4338(@OriginalArg(2) int arg0) {
		this.anOpengl2.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(II)I")
	@Override
	public int method4843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!po", name = "q", descriptor = "(I)I")
	public int method4339(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!mj;Lclient!bg;Lclient!vr;Lclient!ue;I)V")
	@Override
	public void method4811(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) Class63_Sub7 arg3) {
		arg0.method5172(arg2, arg3, 0);
		this.method4868(arg1);
	}

	@OriginalMember(owner = "client!po", name = "qb", descriptor = "()V")
	private void method4340() {
		if (this.aBoolean370) {
			this.anOpengl2.glMatrixMode(5890);
			this.anOpengl2.glLoadIdentity();
			this.anOpengl2.glMatrixMode(5888);
			this.aBoolean370 = false;
		}
	}

	@OriginalMember(owner = "client!po", name = "rb", descriptor = "()V")
	private void method4341() {
		this.method4320();
		for (@Pc(7) int local7 = this.anInt4788 - 1; local7 >= 0; local7--) {
			this.method4273(local7);
			this.method4296(null);
			this.anOpengl2.glTexEnvi(8960, 8704, 34160);
		}
		this.method4311(8448, 8448);
		this.method4297(2, 34168, 770);
		this.method4340();
		this.anOpengl2.glEnable(3042);
		this.anOpengl2.glBlendFunc(770, 771);
		this.anInt4794 = 1;
		this.anOpengl2.glEnable(3008);
		this.anOpengl2.glAlphaFunc(516, 0.0F);
		this.aBoolean360 = true;
		this.anOpengl2.glColorMask(true, true, true, true);
		this.aBoolean372 = true;
		this.anInt4771 = 1;
		this.method4310(true);
		this.method4321(true);
		this.method4267(true);
		this.method4274(true);
		this.method4343();
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
		this.anInt4782 = this.anInt4765 = -1;
		this.method4810();
	}

	@OriginalMember(owner = "client!po", name = "e", descriptor = "(Z)V")
	@Override
	public void method4873(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!po", name = "r", descriptor = "(I)V")
	public void method4342(@OriginalArg(0) int arg0) {
		if (this.anInt4771 == arg0) {
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
		if (local10 != this.aBoolean372) {
			this.anOpengl2.glColorMask(local10, local10, local10, true);
			this.aBoolean372 = local10;
		}
		if (local12 != this.aBoolean360) {
			if (local12) {
				this.anOpengl2.glEnable(3008);
			} else {
				this.anOpengl2.glDisable(3008);
			}
			this.aBoolean360 = local12;
		}
		if (local8 != this.anInt4794) {
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
			this.anInt4794 = local8;
		}
		this.anInt4771 = arg0;
		this.anInt4792 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!po", name = "sb", descriptor = "()V")
	public void method4343() {
		if (this.anInt4778 != 0) {
			this.anInt4778 = 0;
			this.anInt4792 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(IIII)[I")
	@Override
	public int[] method4801() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl2.glReadPixels(0, this.anInt4762 - local6, 36, 1, 32993, this.anInt4791, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method4882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass11_Sub1_Sub1_5 == null || this.aClass11_Sub1_Sub1_5.anInt365 < arg2 || this.aClass11_Sub1_Sub1_5.anInt367 < arg3) {
			this.aClass11_Sub1_Sub1_5 = Static356.method390(this, arg3, arg6, arg2);
			this.aClass11_Sub1_Sub1_5.method387(false, false);
			local32 = this.aClass11_Sub1_Sub1_5.aFloat9;
			local36 = this.aClass11_Sub1_Sub1_5.aFloat10;
		} else {
			this.aClass11_Sub1_Sub1_5.method388(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass11_Sub1_Sub1_5.aFloat9 * (float) arg3 / (float) this.aClass11_Sub1_Sub1_5.anInt367;
			local36 = this.aClass11_Sub1_Sub1_5.aFloat10 * (float) arg2 / (float) this.aClass11_Sub1_Sub1_5.anInt365;
		}
		this.method4305();
		this.method4296(this.aClass11_Sub1_Sub1_5);
		this.method4342(arg8);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method4301(arg5);
		this.method4311(34165, 34165);
		this.method4297(0, 34166, 768);
		this.method4297(2, 5890, 770);
		this.method4298(0, 34166);
		this.method4298(2, 5890);
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
		this.method4297(0, 5890, 768);
		this.method4297(2, 34166, 770);
		this.method4298(0, 5890);
		this.method4298(2, 34166);
	}
}
