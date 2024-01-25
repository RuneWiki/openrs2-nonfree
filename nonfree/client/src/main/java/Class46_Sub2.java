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

@OriginalClass("client!sq")
public final class Class46_Sub2 extends Class46 implements Interface4 {

	@OriginalMember(owner = "client!sq", name = "I", descriptor = "I")
	public int anInt5734;

	@OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
	public int anInt5735;

	@OriginalMember(owner = "client!sq", name = "O", descriptor = "I")
	public int anInt5738;

	@OriginalMember(owner = "client!sq", name = "R", descriptor = "Lclient!hh;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!sq", name = "S", descriptor = "I")
	public int anInt5740;

	@OriginalMember(owner = "client!sq", name = "T", descriptor = "I")
	public int anInt5741;

	@OriginalMember(owner = "client!sq", name = "U", descriptor = "I")
	private int anInt5742;

	@OriginalMember(owner = "client!sq", name = "bb", descriptor = "F")
	public float aFloat115;

	@OriginalMember(owner = "client!sq", name = "cb", descriptor = "Z")
	private boolean aBoolean379;

	@OriginalMember(owner = "client!sq", name = "db", descriptor = "I")
	private int anInt5743;

	@OriginalMember(owner = "client!sq", name = "jb", descriptor = "F")
	public float aFloat116;

	@OriginalMember(owner = "client!sq", name = "mb", descriptor = "Z")
	private boolean aBoolean381;

	@OriginalMember(owner = "client!sq", name = "pb", descriptor = "I")
	public int anInt5750;

	@OriginalMember(owner = "client!sq", name = "rb", descriptor = "I")
	private int anInt5752;

	@OriginalMember(owner = "client!sq", name = "sb", descriptor = "Z")
	public boolean aBoolean382;

	@OriginalMember(owner = "client!sq", name = "tb", descriptor = "J")
	private long aLong184;

	@OriginalMember(owner = "client!sq", name = "ub", descriptor = "F")
	public float aFloat118;

	@OriginalMember(owner = "client!sq", name = "vb", descriptor = "F")
	private float aFloat119;

	@OriginalMember(owner = "client!sq", name = "wb", descriptor = "F")
	public float aFloat120;

	@OriginalMember(owner = "client!sq", name = "xb", descriptor = "Lclient!dp;")
	public Class45_Sub1 aClass45_Sub1_1;

	@OriginalMember(owner = "client!sq", name = "zb", descriptor = "Lclient!rg;")
	private Class67_Sub1 aClass67_Sub1_1;

	@OriginalMember(owner = "client!sq", name = "Ab", descriptor = "I")
	private int anInt5754;

	@OriginalMember(owner = "client!sq", name = "Cb", descriptor = "Lclient!lq;")
	public Class51_Sub2 aClass51_Sub2_1;

	@OriginalMember(owner = "client!sq", name = "Fb", descriptor = "Lclient!l;")
	private Class8_Sub1_Sub1 aClass8_Sub1_Sub1_4;

	@OriginalMember(owner = "client!sq", name = "Gb", descriptor = "Z")
	private boolean aBoolean383;

	@OriginalMember(owner = "client!sq", name = "Hb", descriptor = "Lclient!dp;")
	public Class45_Sub1 aClass45_Sub1_2;

	@OriginalMember(owner = "client!sq", name = "Ib", descriptor = "Z")
	private boolean aBoolean384;

	@OriginalMember(owner = "client!sq", name = "Jb", descriptor = "F")
	private float aFloat121;

	@OriginalMember(owner = "client!sq", name = "Kb", descriptor = "I")
	public int anInt5756;

	@OriginalMember(owner = "client!sq", name = "Mb", descriptor = "Lclient!ql;")
	public Class171 aClass171_4;

	@OriginalMember(owner = "client!sq", name = "Pb", descriptor = "Z")
	private boolean aBoolean386;

	@OriginalMember(owner = "client!sq", name = "Sb", descriptor = "Z")
	public boolean aBoolean387;

	@OriginalMember(owner = "client!sq", name = "Tb", descriptor = "F")
	private float aFloat124;

	@OriginalMember(owner = "client!sq", name = "Wb", descriptor = "Lclient!ai;")
	public Class8_Sub1 aClass8_Sub1_4;

	@OriginalMember(owner = "client!sq", name = "bc", descriptor = "I")
	private int anInt5760;

	@OriginalMember(owner = "client!sq", name = "cc", descriptor = "Ljava/lang/String;")
	private String aString213;

	@OriginalMember(owner = "client!sq", name = "dc", descriptor = "I")
	private int anInt5761;

	@OriginalMember(owner = "client!sq", name = "ec", descriptor = "Z")
	private boolean aBoolean391;

	@OriginalMember(owner = "client!sq", name = "fc", descriptor = "Lclient!ai;")
	public Class8_Sub1 aClass8_Sub1_5;

	@OriginalMember(owner = "client!sq", name = "ic", descriptor = "Lclient!lq;")
	public Class51_Sub2 aClass51_Sub2_2;

	@OriginalMember(owner = "client!sq", name = "jc", descriptor = "F")
	public float aFloat126;

	@OriginalMember(owner = "client!sq", name = "lc", descriptor = "Lclient!mq;")
	private Interface5 anInterface5_3;

	@OriginalMember(owner = "client!sq", name = "nc", descriptor = "Lclient!dp;")
	public Class45_Sub1 aClass45_Sub1_3;

	@OriginalMember(owner = "client!sq", name = "oc", descriptor = "I")
	private int anInt5765;

	@OriginalMember(owner = "client!sq", name = "rc", descriptor = "I")
	private int anInt5766;

	@OriginalMember(owner = "client!sq", name = "sc", descriptor = "Lclient!dp;")
	public Class45_Sub1 aClass45_Sub1_4;

	@OriginalMember(owner = "client!sq", name = "vc", descriptor = "Z")
	private boolean aBoolean392;

	@OriginalMember(owner = "client!sq", name = "wc", descriptor = "Lclient!eb;")
	private Interface3 anInterface3_5;

	@OriginalMember(owner = "client!sq", name = "xc", descriptor = "Z")
	private boolean aBoolean393;

	@OriginalMember(owner = "client!sq", name = "yc", descriptor = "Lclient!dp;")
	public Class45_Sub1 aClass45_Sub1_5;

	@OriginalMember(owner = "client!sq", name = "zc", descriptor = "Z")
	private boolean aBoolean394;

	@OriginalMember(owner = "client!sq", name = "Bc", descriptor = "I")
	private int anInt5769;

	@OriginalMember(owner = "client!sq", name = "Cc", descriptor = "Z")
	private boolean aBoolean396;

	@OriginalMember(owner = "client!sq", name = "Ec", descriptor = "Ljava/lang/String;")
	private String aString214;

	@OriginalMember(owner = "client!sq", name = "Jc", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!sq", name = "Kc", descriptor = "[Lclient!od;")
	private Class8[] aClass8Array1;

	@OriginalMember(owner = "client!sq", name = "Mc", descriptor = "Lclient!dp;")
	public Class45_Sub1 aClass45_Sub1_6;

	@OriginalMember(owner = "client!sq", name = "Nc", descriptor = "Lclient!ai;")
	public Class8_Sub1 aClass8_Sub1_6;

	@OriginalMember(owner = "client!sq", name = "Oc", descriptor = "I")
	public int anInt5772;

	@OriginalMember(owner = "client!sq", name = "Pc", descriptor = "I")
	private int anInt5773;

	@OriginalMember(owner = "client!sq", name = "Qc", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!sq", name = "Rc", descriptor = "Z")
	public boolean aBoolean397;

	@OriginalMember(owner = "client!sq", name = "Tc", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!sq", name = "Wc", descriptor = "Z")
	public boolean aBoolean398;

	@OriginalMember(owner = "client!sq", name = "Xc", descriptor = "Z")
	public boolean aBoolean399;

	@OriginalMember(owner = "client!sq", name = "Yc", descriptor = "Z")
	public boolean aBoolean400;

	@OriginalMember(owner = "client!sq", name = "Zc", descriptor = "I")
	private int anInt5776;

	@OriginalMember(owner = "client!sq", name = "ad", descriptor = "I")
	private int anInt5777;

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "Lclient!ta;")
	private final Class191 aClass191_1 = new Class191();

	@OriginalMember(owner = "client!sq", name = "H", descriptor = "Lclient!pg;")
	private final Class51 aClass51_5 = new Class51_Sub2();

	@OriginalMember(owner = "client!sq", name = "M", descriptor = "I")
	public final int anInt5736 = 3;

	@OriginalMember(owner = "client!sq", name = "N", descriptor = "I")
	public final int anInt5737 = 8;

	@OriginalMember(owner = "client!sq", name = "P", descriptor = "I")
	private int anInt5739 = -1;

	@OriginalMember(owner = "client!sq", name = "L", descriptor = "[Lclient!hh;")
	private final Interface4[] anInterface4Array1 = new Interface4[4];

	@OriginalMember(owner = "client!sq", name = "Q", descriptor = "Z")
	private boolean aBoolean378 = false;

	@OriginalMember(owner = "client!sq", name = "K", descriptor = "Lclient!bd;")
	private final Class18 aClass18_36 = new Class18();

	@OriginalMember(owner = "client!sq", name = "V", descriptor = "Lclient!bd;")
	private final Class18 aClass18_37 = new Class18();

	@OriginalMember(owner = "client!sq", name = "W", descriptor = "Lclient!bd;")
	private final Class18 aClass18_38 = new Class18();

	@OriginalMember(owner = "client!sq", name = "X", descriptor = "Lclient!bd;")
	private final Class18 aClass18_39 = new Class18();

	@OriginalMember(owner = "client!sq", name = "Y", descriptor = "Lclient!bd;")
	private final Class18 aClass18_40 = new Class18();

	@OriginalMember(owner = "client!sq", name = "Z", descriptor = "Lclient!bd;")
	private final Class18 aClass18_41 = new Class18();

	@OriginalMember(owner = "client!sq", name = "ab", descriptor = "Lclient!bd;")
	private final Class18 aClass18_42 = new Class18();

	@OriginalMember(owner = "client!sq", name = "kb", descriptor = "F")
	public float aFloat117 = 3584.0F;

	@OriginalMember(owner = "client!sq", name = "qb", descriptor = "I")
	public int anInt5751 = 512;

	@OriginalMember(owner = "client!sq", name = "yb", descriptor = "I")
	public int anInt5753 = -1;

	@OriginalMember(owner = "client!sq", name = "Nb", descriptor = "I")
	public int anInt5757 = 50;

	@OriginalMember(owner = "client!sq", name = "ob", descriptor = "I")
	public int anInt5749 = -1;

	@OriginalMember(owner = "client!sq", name = "Eb", descriptor = "[F")
	private final float[] aFloatArray24 = new float[16];

	@OriginalMember(owner = "client!sq", name = "Rb", descriptor = "I")
	private int anInt5758 = 8448;

	@OriginalMember(owner = "client!sq", name = "Bb", descriptor = "[F")
	private final float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!sq", name = "ib", descriptor = "I")
	private int anInt5747 = 0;

	@OriginalMember(owner = "client!sq", name = "gb", descriptor = "I")
	private int anInt5745 = 0;

	@OriginalMember(owner = "client!sq", name = "fb", descriptor = "I")
	private int anInt5744 = 0;

	@OriginalMember(owner = "client!sq", name = "Yb", descriptor = "[F")
	public final float[] aFloatArray25 = new float[4];

	@OriginalMember(owner = "client!sq", name = "hc", descriptor = "I")
	private int anInt5763 = -1;

	@OriginalMember(owner = "client!sq", name = "Dc", descriptor = "I")
	public int anInt5770 = 0;

	@OriginalMember(owner = "client!sq", name = "uc", descriptor = "I")
	public int anInt5768 = 3584;

	@OriginalMember(owner = "client!sq", name = "hb", descriptor = "I")
	private int anInt5746 = -1;

	@OriginalMember(owner = "client!sq", name = "ac", descriptor = "I")
	private int anInt5759 = 8448;

	@OriginalMember(owner = "client!sq", name = "kc", descriptor = "F")
	public float aFloat127 = 1.0F;

	@OriginalMember(owner = "client!sq", name = "Ob", descriptor = "F")
	public float aFloat122 = -1.0F;

	@OriginalMember(owner = "client!sq", name = "pc", descriptor = "[F")
	private final float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!sq", name = "Xb", descriptor = "F")
	public float aFloat125 = -1.0F;

	@OriginalMember(owner = "client!sq", name = "nb", descriptor = "I")
	private int anInt5748 = 0;

	@OriginalMember(owner = "client!sq", name = "Db", descriptor = "I")
	public int anInt5755 = 0;

	@OriginalMember(owner = "client!sq", name = "Hc", descriptor = "F")
	private float aFloat130 = 1.0F;

	@OriginalMember(owner = "client!sq", name = "Gc", descriptor = "I")
	private int anInt5771 = 0;

	@OriginalMember(owner = "client!sq", name = "Ic", descriptor = "F")
	public float aFloat131 = 3584.0F;

	@OriginalMember(owner = "client!sq", name = "mc", descriptor = "I")
	public int anInt5764 = -1;

	@OriginalMember(owner = "client!sq", name = "qc", descriptor = "F")
	private float aFloat128 = 1.0F;

	@OriginalMember(owner = "client!sq", name = "Lc", descriptor = "[F")
	private final float[] aFloatArray27 = new float[4];

	@OriginalMember(owner = "client!sq", name = "Qb", descriptor = "F")
	public float aFloat123 = 1.0F;

	@OriginalMember(owner = "client!sq", name = "Zb", descriptor = "Z")
	private boolean aBoolean390 = true;

	@OriginalMember(owner = "client!sq", name = "Sc", descriptor = "I")
	public int anInt5774 = 512;

	@OriginalMember(owner = "client!sq", name = "Vc", descriptor = "F")
	private float aFloat135 = 0.0F;

	@OriginalMember(owner = "client!sq", name = "gc", descriptor = "I")
	private int anInt5762 = 0;

	@OriginalMember(owner = "client!sq", name = "Fc", descriptor = "F")
	public float aFloat129 = 1.0F;

	@OriginalMember(owner = "client!sq", name = "Uc", descriptor = "I")
	private int anInt5775 = 0;

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas5;

	@OriginalMember(owner = "client!sq", name = "C", descriptor = "Lclient!ah;")
	public final Interface2 anInterface2_6;

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl1;

	@OriginalMember(owner = "client!sq", name = "tc", descriptor = "I")
	public final int anInt5767;

	@OriginalMember(owner = "client!sq", name = "Ac", descriptor = "Z")
	private boolean aBoolean395;

	@OriginalMember(owner = "client!sq", name = "eb", descriptor = "Z")
	public boolean aBoolean380;

	@OriginalMember(owner = "client!sq", name = "Lb", descriptor = "Z")
	public boolean aBoolean385;

	@OriginalMember(owner = "client!sq", name = "Ub", descriptor = "Z")
	public boolean aBoolean388;

	@OriginalMember(owner = "client!sq", name = "Vb", descriptor = "Z")
	private boolean aBoolean389;

	@OriginalMember(owner = "client!sq", name = "lb", descriptor = "Z")
	public boolean lb;

	@OriginalMember(owner = "client!sq", name = "F", descriptor = "Lclient!nb;")
	public final Class144 aClass144_1;

	@OriginalMember(owner = "client!sq", name = "E", descriptor = "Lclient!t;")
	private final Class190 aClass190_1;

	@OriginalMember(owner = "client!sq", name = "y", descriptor = "Lclient!rq;")
	private final Class180 aClass180_1;

	@OriginalMember(owner = "client!sq", name = "G", descriptor = "Lclient!ao;")
	private final Class14_Sub1_Sub1 aClass14_Sub1_Sub1_1;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!ah;IILclient!ap;)V")
	public Class46_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15 arg4) {
		this.aCanvas5 = arg0;
		this.anInterface2_6 = arg1;
		this.anInt5722 = arg2;
		@Pc(186) int local186 = 0;
		while (!this.aCanvas5.isShowing()) {
			if (local186++ > 5) {
				throw new RuntimeException("");
			}
			Static15.method5425(1000L);
		}
		this.aCanvas5.setIgnoreRepaint(true);
		try {
			if (Static299.aBoolean377 == null || !Static299.aBoolean377) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static299.aBoolean377 = Boolean.TRUE;
				} else {
					@Pc(220) Class205 local220 = arg4.method274(this.getClass());
					while (local220.anInt6370 == 0) {
						Static15.method5425(100L);
					}
					if (local220.anInt6370 == 1) {
						Static299.aBoolean377 = Boolean.TRUE;
					}
				}
			}
			if (Static299.aBoolean377 == null || !Static299.aBoolean377) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas5, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method5265();
				this.anOpengl1 = this.aContext1.getGL();
				@Pc(287) int local287 = this.method5258();
				if (local287 != 0) {
					throw new RuntimeException("");
				}
				this.anInt5767 = this.aBoolean397 ? 33639 : 5121;
				@Pc(306) String local306 = this.aString213.toLowerCase();
				@Pc(310) String local310 = this.aString214.toLowerCase();
				if (local310.indexOf("radeon") != -1) {
					@Pc(317) int local317 = 0;
					@Pc(319) boolean local319 = false;
					@Pc(321) boolean local321 = false;
					@Pc(329) String[] local329 = Static105.method2289(local310.replace('/', ' '), ' ');
					for (@Pc(331) int local331 = 0; local331 < local329.length; local331++) {
						@Pc(339) String local339 = local329[local331];
						try {
							if (local339.length() > 0) {
								if (local339.charAt(0) == 'x' && local339.length() >= 3 && Static335.method5776(local339.substring(1, 3))) {
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
									if (local339.length() >= 4 && Static335.method5776(local339.substring(0, 4))) {
										local317 = Static75.method1895(local339.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(403) Exception local403) {
						}
					}
					if (!local321 && !local319) {
						if (local317 >= 7000 && local317 <= 7999) {
							this.aBoolean395 = false;
						}
						if (local317 >= 7000 && local317 <= 9250) {
							this.aBoolean380 = false;
						}
					}
					if (!local319 || local317 < 4000) {
						this.aBoolean385 = false;
					}
					this.aBoolean388 &= this.anOpengl1.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean389 = this.aBoolean395;
				}
				if (local306.contains("intel")) {
					this.lb = false;
				}
				if (this.aBoolean395) {
					try {
						@Pc(461) int[] local461 = new int[1];
						this.anOpengl1.glGenBuffersARB(1, local461, 0);
					} catch (@Pc(469) Throwable local469) {
						throw new RuntimeException("", local469);
					}
				}
				this.method5247(this);
				this.method5117();
				this.method5250();
				new Class100(this);
				this.aClass144_1 = new Class144(this, this.anInterface2_6);
				Static78.method1946(true);
				this.aBoolean378 = true;
				this.aClass190_1 = new Class190(this);
				this.aClass180_1 = new Class180(this);
				this.aClass14_Sub1_Sub1_1 = new Class14_Sub1_Sub1(this);
				this.method5199();
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
						Static15.method5425(100L);
					}
				}
				this.anOpengl1.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(553) Throwable local553) {
			local553.printStackTrace();
			this.method5137();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local553);
		}
	}

	@OriginalMember(owner = "client!sq", name = "A", descriptor = "()V")
	@Override
	public void method5153() {
		this.method5208(true);
		this.anOpengl1.glClear(256);
	}

	@OriginalMember(owner = "client!sq", name = "M", descriptor = "()V")
	private void method5194() {
		this.aFloat134 = this.anInt5748 - this.anInt5755;
		this.aFloat132 = this.anInt5744 - this.anInt5755;
		this.aFloat116 = this.anInt5762 - this.anInt5770;
		this.aFloat115 = this.anInt5745 - this.anInt5770;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5243();
		this.method5256(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!id;Lclient!jp;Lclient!pg;Lclient!cd;I)V")
	@Override
	public void method5116(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) Class1_Sub3 arg3) {
		arg0.method1794(arg2, arg3, 0);
		this.method5122(arg1);
	}

	@OriginalMember(owner = "client!sq", name = "N", descriptor = "()V")
	public void method5195() {
		this.anOpengl1.glPopMatrix();
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method5243();
		this.method5256(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean393) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local19);
		this.anOpengl1.glVertex2f(local14, local19);
		this.anOpengl1.glVertex2f(local14, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean393) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!eb;")
	public Interface3 method5196(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface3) (this.aBoolean395 ? new Class54_Sub2(this, arg0, arg1, false) : new Class182_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!sq", name = "L", descriptor = "()Z")
	@Override
	public boolean method5187() {
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "()V")
	@Override
	public void method5117() {
		this.anInt5735 = this.aCanvas5.getWidth();
		this.anInt5740 = this.aCanvas5.getHeight();
		this.anOpengl1.glViewport(this.anInt5747, this.anInt5775, this.anInt5735, this.anInt5740);
		this.method5262();
		this.method5139();
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method5104(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class14_Sub34 local16;
		while (!this.aClass18_37.method452()) {
			local16 = (Class14_Sub34) this.aClass18_37.method454();
			Static299.anIntArray520[local1++] = (int) local16.aLong217;
			this.anInt5741 -= local16.anInt6039;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteBuffersARB(local1, Static299.anIntArray520, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteBuffersARB(local1, Static299.anIntArray520, 0);
			local1 = 0;
		}
		while (!this.aClass18_38.method452()) {
			local16 = (Class14_Sub34) this.aClass18_38.method454();
			Static299.anIntArray520[local1++] = (int) local16.aLong217;
			this.anInt5734 -= local16.anInt6039;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteTextures(local1, Static299.anIntArray520, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteTextures(local1, Static299.anIntArray520, 0);
			local1 = 0;
		}
		while (!this.aClass18_39.method452()) {
			local16 = (Class14_Sub34) this.aClass18_39.method454();
			Static299.anIntArray520[local1++] = local16.anInt6039;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteFramebuffersEXT(local1, Static299.anIntArray520, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteFramebuffersEXT(local1, Static299.anIntArray520, 0);
			local1 = 0;
		}
		while (!this.aClass18_40.method452()) {
			local16 = (Class14_Sub34) this.aClass18_40.method454();
			Static299.anIntArray520[local1++] = (int) local16.aLong217;
			this.anInt5742 -= local16.anInt6039;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static299.anIntArray520, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static299.anIntArray520, 0);
			local1 = 0;
		}
		while (!this.aClass18_41.method452()) {
			local16 = (Class14_Sub34) this.aClass18_41.method454();
			Static299.anIntArray520[local1++] = (int) local16.aLong217;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteProgramsARB(local1, Static299.anIntArray520, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteProgramsARB(local1, Static299.anIntArray520, 0);
		}
		while (!this.aClass18_36.method452()) {
			local16 = (Class14_Sub34) this.aClass18_36.method454();
			this.anOpengl1.glDeleteLists((int) local16.aLong217, local16.anInt6039);
		}
		while (!this.aClass18_42.method452()) {
			local16 = (Class14_Sub34) this.aClass18_42.method454();
			this.anOpengl1.glDeleteObjectARB(local16.anInt6039);
		}
		while (!this.aClass18_36.method452()) {
			local16 = (Class14_Sub34) this.aClass18_36.method454();
			this.anOpengl1.glDeleteLists((int) local16.aLong217, local16.anInt6039);
		}
		if (this.method5174() > 100663296 && Static168.method3300() > this.aLong184 + 60000L) {
			System.gc();
			this.aLong184 = Static168.method3300();
		}
		this.anInt5738 = local5;
	}

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "()Z")
	@Override
	public boolean method5102() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "O", descriptor = "()V")
	public void method5197() {
		if (this.anInt5761 == 16) {
			return;
		}
		this.method5244();
		this.method5266(true);
		this.method5235(true);
		this.method5208(true);
		this.method5256(1);
		this.method5252(1);
		this.anInt5761 = 16;
	}

	@OriginalMember(owner = "client!sq", name = "P", descriptor = "()V")
	public void method5198() {
		if (this.anInt5761 == 2) {
			return;
		}
		this.method5230();
		this.method5266(false);
		this.method5241(false);
		this.method5235(false);
		this.method5208(false);
		this.method5226();
		this.anInt5761 = 2;
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(Z)V")
	@Override
	public void method5156(@OriginalArg(0) boolean arg0) {
		this.aBoolean390 = arg0;
		this.method5263();
	}

	@OriginalMember(owner = "client!sq", name = "Q", descriptor = "()V")
	private void method5199() {
		this.method5226();
		for (@Pc(7) int local7 = this.anInt5750 - 1; local7 >= 0; local7--) {
			this.method5225(local7);
			this.method5251(null);
			this.anOpengl1.glTexEnvi(8960, 8704, 34160);
		}
		this.method5248(8448, 8448);
		this.method5261(2, 34168, 770);
		this.method5264();
		this.anInt5769 = 1;
		this.anOpengl1.glEnable(3042);
		this.anOpengl1.glBlendFunc(770, 771);
		this.anInt5743 = 1;
		this.anOpengl1.glEnable(3008);
		this.anOpengl1.glAlphaFunc(516, 0.0F);
		this.aBoolean381 = true;
		this.anOpengl1.glColorMask(true, true, true, true);
		this.aBoolean379 = true;
		this.method5266(true);
		this.method5241(true);
		this.method5235(true);
		this.method5208(true);
		this.method5262();
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
		this.anInt5746 = this.anInt5749 = -1;
		this.method5139();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass51_Sub2_1.aFloat68 * (float) arg0 + this.aClass51_Sub2_1.aFloat71 * (float) arg1 + this.aClass51_Sub2_1.aFloat77 * (float) arg2 + this.aClass51_Sub2_1.aFloat70;
		if (local24 < (float) this.anInt5757 || local24 > (float) this.anInt5768) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt5774 * (this.aClass51_Sub2_1.aFloat73 * (float) arg0 + this.aClass51_Sub2_1.aFloat72 * (float) arg1 + this.aClass51_Sub2_1.aFloat67 * (float) arg2 + this.aClass51_Sub2_1.aFloat75) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt5751 * (this.aClass51_Sub2_1.aFloat76 * (float) arg0 + this.aClass51_Sub2_1.aFloat69 * (float) arg1 + this.aClass51_Sub2_1.aFloat78 * (float) arg2 + this.aClass51_Sub2_1.aFloat74) / local24);
		if ((float) local81 >= this.aFloat134 && (float) local81 <= this.aFloat132 && (float) local113 >= this.aFloat116 && (float) local113 <= this.aFloat115) {
			arg3[0] = (int) ((float) local81 - this.aFloat134);
			arg3[1] = (int) ((float) local113 - this.aFloat116);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!sq", name = "R", descriptor = "()V")
	private void method5200() {
		if (this.aBoolean391 && this.aBoolean399 | this.anInt5753 >= 0) {
			this.anOpengl1.glEnable(2912);
		} else {
			this.anOpengl1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)V")
	@Override
	public void method5126() {
		this.aBoolean399 = true;
		this.anInt5763 = 1583160;
		this.anInt5764 = 40;
		this.method5253();
		this.method5200();
		this.aClass190_1.method5268(false, 3, false);
		this.aClass190_1.method5267(-1, true);
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(III)V")
	public void method5201(@OriginalArg(2) int arg0) {
		this.anOpengl1.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "(I)I")
	public int method5202(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!ka;)V")
	@Override
	public void method5096(@OriginalArg(0) Class14_Sub20 arg0) {
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(II)I")
	@Override
	public int method5149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(II)V")
	public synchronized void method5203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class14_Sub34 local4 = new Class14_Sub34(arg1);
		local4.aLong217 = arg0;
		this.aClass18_39.method451(local4);
	}

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "()Z")
	@Override
	public boolean method5134() {
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
	@Override
	public void method5111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5757 == arg0 && this.anInt5768 == arg1) {
			return;
		}
		this.anInt5757 = arg0;
		this.anInt5768 = arg1;
		this.method5239();
		this.method5253();
		if (this.anInt5766 == 3) {
			this.method5249();
		} else if (this.anInt5766 == 2) {
			this.method5259();
		}
	}

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "()F")
	@Override
	public float method5098() {
		return this.aFloat118;
	}

	@OriginalMember(owner = "client!sq", name = "S", descriptor = "()V")
	private void method5204() {
		if (this.anInt5748 <= this.anInt5744 && this.anInt5762 <= this.anInt5745) {
			this.anOpengl1.glScissor(this.anInt5747 + this.anInt5748, this.anInt5775 + this.anInt5740 - this.anInt5745, this.anInt5744 - this.anInt5748, this.anInt5745 - this.anInt5762);
		} else {
			this.anOpengl1.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5136(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sq", name = "T", descriptor = "()V")
	private void method5205() {
		Static299.aFloatArray22[0] = this.aFloat122 * this.aFloat123;
		Static299.aFloatArray22[1] = this.aFloat122 * this.aFloat127;
		Static299.aFloatArray22[2] = this.aFloat122 * this.aFloat129;
		Static299.aFloatArray22[3] = 1.0F;
		this.anOpengl1.glLightfv(16384, 4609, Static299.aFloatArray22, 0);
		Static299.aFloatArray22[0] = -this.aFloat125 * this.aFloat123;
		Static299.aFloatArray22[1] = -this.aFloat125 * this.aFloat127;
		Static299.aFloatArray22[2] = -this.aFloat125 * this.aFloat129;
		Static299.aFloatArray22[3] = 1.0F;
		this.anOpengl1.glLightfv(16385, 4609, Static299.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZZ)V")
	public void method5206(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt5765) {
			if (arg0 < 0) {
				this.method5264();
				this.method5251(null);
				if (!this.aBoolean399) {
					this.aClass190_1.method5268(arg2, 0, arg1);
				}
			} else {
				@Pc(11) Class8_Sub1 local11 = this.aClass144_1.method3785(arg0);
				@Pc(17) Class154 local17 = this.anInterface2_6.method116(arg0);
				if (local17.aByte45 == 0 && local17.aByte50 == 0) {
					this.method5264();
				} else {
					@Pc(30) int local30 = local17.aBoolean292 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method5260((float) (this.anInt5738 % local34 * local17.aByte45) / (float) local34, (float) (this.anInt5738 % local34 * local17.aByte50) / (float) local34, 0.0F);
				}
				if (this.aBoolean399) {
					this.aClass190_1.method5268(arg2, 3, arg1);
					this.method5251(local11);
				} else {
					this.aClass190_1.method5268(arg2, local17.aByte48, arg1);
					this.aClass190_1.method5267(local17.aByte46, false);
					if (!this.aClass190_1.method5269(local11)) {
						this.method5251(local11);
					}
				}
			}
			this.anInt5765 = arg0;
		}
		this.anInt5761 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!sq", name = "U", descriptor = "()V")
	private void method5207() {
		if (this.aBoolean396 && !this.aBoolean384) {
			this.anOpengl1.glEnable(2896);
		} else {
			this.anOpengl1.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(IIII)V")
	@Override
	public void method5178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5755 = arg0;
		this.anInt5770 = arg1;
		this.anInt5774 = arg2;
		this.anInt5751 = arg3;
		this.method5239();
		this.method5194();
		if (this.anInt5766 == 3) {
			this.method5249();
		} else if (this.anInt5766 == 2) {
			this.method5259();
		}
	}

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "()V")
	@Override
	public void method5152() {
		if (this.aClass14_Sub1_Sub1_1.method268()) {
			this.aClass180_1.method4804(this.aClass14_Sub1_Sub1_1);
			this.aClass144_1.method3784();
		}
	}

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "()V")
	@Override
	public void method5118() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(Z)V")
	public void method5208(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean383) {
			this.aBoolean383 = arg0;
			this.method5263();
			this.anInt5761 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(FFFF)V")
	public void method5209(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static299.aFloatArray22[0] = arg0;
		Static299.aFloatArray22[1] = arg1;
		Static299.aFloatArray22[2] = arg2;
		Static299.aFloatArray22[3] = arg3;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static299.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "()Z")
	@Override
	public boolean method5106() {
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "(I)V")
	public synchronized void method5210(@OriginalArg(0) int arg0) {
		@Pc(4) Class14_Sub34 local4 = new Class14_Sub34(arg0);
		this.aClass18_39.method451(local4);
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(Z)V")
	@Override
	public void method5128(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II[I[I)Lclient!q;")
	@Override
	public Class156 method5101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static364.method4004(arg2, arg1, this, arg0, arg3);
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(FF)V")
	public void method5211(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat128 = arg0;
		this.aFloat135 = arg1;
		if (!this.aBoolean399) {
			this.method5253();
		}
	}

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "(I)V")
	public void method5212(@OriginalArg(0) int arg0) {
		Static299.aFloatArray22[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static299.aFloatArray22[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static299.aFloatArray22[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static299.aFloatArray22[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static299.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!sq", name = "V", descriptor = "()V")
	private void method5213() {
		if (this.aFloat120 == 0.0F) {
			this.aFloatArray24[10] = this.aFloat119;
			this.aFloatArray24[14] = this.aFloat124;
		} else {
			@Pc(13) float local13 = this.aFloat118 / (this.aFloat120 + this.aFloat118);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat124 * (1.0F - local13) * (1.0F - local13) / this.aFloat120;
			this.aFloatArray24[10] = this.aFloat119 + local32;
			this.aFloatArray24[14] = this.aFloat124 * local17;
		}
		this.aFloat117 = (this.aFloatArray24[14] - (float) this.anInt5768) / this.aFloatArray24[10];
		this.aFloat131 = (float) this.anInt5768 - this.aFloat120;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(IIIIII)Lclient!ma;")
	@Override
	public Class67 method5094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean398 ? new Class67_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIILclient!q;II)V")
	@Override
	public void method5179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class156 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class156_Sub1 local2 = (Class156_Sub1) arg5;
		@Pc(5) Class8_Sub1_Sub1 local5 = local2.aClass8_Sub1_Sub1_3;
		this.method5198();
		this.method5251(local2.aClass8_Sub1_Sub1_3);
		this.method5256(1);
		this.method5248(7681, 8448);
		this.method5261(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat63 / (float) local5.anInt3576;
		@Pc(37) float local37 = local5.aFloat64 / (float) local5.anInt3577;
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
		this.method5261(0, 5890, 768);
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "(Z)V")
	public void method5214(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean384) {
			this.aBoolean384 = arg0;
			this.method5207();
		}
	}

	@OriginalMember(owner = "client!sq", name = "W", descriptor = "()V")
	private void method5215() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(F)V")
	public void method5216(@OriginalArg(0) float arg0) {
		if (this.aFloat130 != arg0) {
			this.aFloat130 = arg0;
			if (this.anInt5766 == 3) {
				this.method5249();
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "()I")
	@Override
	public int method5135() {
		return 4;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!qd;Lclient!qd;Lclient!qd;Lclient!qd;)V")
	public void method5217(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class168 arg2, @OriginalArg(3) Class168 arg3) {
		if (arg0 == null) {
			this.anOpengl1.glDisableClientState(32884);
		} else {
			this.anOpengl1.glEnableClientState(32884);
			arg0.method4465();
		}
		if (arg1 == null) {
			this.anOpengl1.glDisableClientState(32885);
		} else {
			this.anOpengl1.glEnableClientState(32885);
			arg1.method4467();
		}
		if (arg2 == null) {
			this.anOpengl1.glDisableClientState(32886);
		} else {
			this.anOpengl1.glEnableClientState(32886);
			arg2.method4466();
		}
		if (arg3 == null) {
			this.anOpengl1.glDisableClientState(32888);
		} else {
			this.anOpengl1.glEnableClientState(32888);
			arg3.method4468();
		}
	}

	@OriginalMember(owner = "client!sq", name = "X", descriptor = "()V")
	private void method5218() {
		Static299.aFloatArray22[0] = this.aFloat126 * this.aFloat123;
		Static299.aFloatArray22[1] = this.aFloat126 * this.aFloat127;
		Static299.aFloatArray22[2] = this.aFloat126 * this.aFloat129;
		Static299.aFloatArray22[3] = 1.0F;
		this.anOpengl1.glLightModelfv(2899, Static299.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "()V")
	@Override
	public void method5139() {
		this.anInt5748 = 0;
		this.anInt5762 = 0;
		this.anInt5744 = this.anInt5735;
		this.anInt5745 = this.anInt5740;
		this.anOpengl1.glDisable(3089);
		this.method5194();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZ)V")
	public void method5219(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method5206(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!sq", name = "Y", descriptor = "()Lclient!hh;")
	public Interface4 method5220() {
		return this.anInterface4_1;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!gh;[Lclient!vp;Z)Lclient!mp;")
	@Override
	public Class30 method5093(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class207[] arg1) {
		return new Class30_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[Lclient!ej;)V")
	@Override
	public void method5124(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub13[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class14_Sub13 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static299.aFloatArray21[0] = local8.anInt5640;
			Static299.aFloatArray21[1] = local8.anInt5635;
			Static299.aFloatArray21[2] = local8.anInt5638;
			Static299.aFloatArray21[3] = 1.0F;
			this.anOpengl1.glLightfv(local12, 4611, Static299.aFloatArray21, 0);
			@Pc(44) int local44 = local8.anInt5637;
			@Pc(49) float local49 = local8.aFloat105 / 255.0F;
			Static299.aFloatArray21[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static299.aFloatArray21[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static299.aFloatArray21[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl1.glLightfv(local12, 4609, Static299.aFloatArray21, 0);
			this.anOpengl1.glLightf(local12, 4617, 1.0F / (float) (local8.anInt5639 * local8.anInt5639));
			this.anOpengl1.glEnable(local12);
		}
		while (local1 < this.anInt5771) {
			this.anOpengl1.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt5771 = arg0;
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "(II)V")
	public void method5221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5747 = arg0;
		this.anInt5775 = arg1;
		this.anOpengl1.glViewport(arg0, arg1, this.anInt5735, this.anInt5740);
		this.method5204();
	}

	@OriginalMember(owner = "client!sq", name = "E", descriptor = "()Z")
	@Override
	public boolean method5162() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "J", descriptor = "()Z")
	@Override
	public boolean method5184() {
		return this.aBoolean393;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5190() {
	}

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "()I")
	@Override
	public int method5146() {
		@Pc(2) int local2 = this.anInt5776;
		this.anInt5776 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(FF)V")
	@Override
	public void method5161(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat118 && arg1 == this.aFloat120) {
			return;
		}
		this.aFloat118 = arg0;
		this.aFloat120 = arg1;
		this.method5213();
		if (this.anInt5766 == 3) {
			this.method5249();
		} else if (this.anInt5766 == 2) {
			this.method5259();
		}
	}

	@OriginalMember(owner = "client!sq", name = "Z", descriptor = "()V")
	private void method5222() {
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl1.glMultMatrixf(this.aClass51_Sub2_1.method3564(), 0);
		this.method5228();
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "()Z")
	@Override
	public boolean method5088() {
		return !this.aBoolean394;
	}

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "(II)V")
	public synchronized void method5223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class14_Sub34 local4 = new Class14_Sub34(arg1);
		local4.aLong217 = arg0;
		this.aClass18_38.method451(local4);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II[[I[[IIII)Lclient!lf;")
	@Override
	public Class114 method5150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class114_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!jp;)V")
	@Override
	public void method5122(@OriginalArg(0) Class109 arg0) {
		this.aClass191_1.method5272(this, arg0);
	}

	@OriginalMember(owner = "client!sq", name = "G", descriptor = "()I")
	@Override
	public int method5174() {
		return this.anInt5741 + this.anInt5734 + this.anInt5742;
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "()V")
	@Override
	public void method5086() {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!eb;)V")
	public void method5224(@OriginalArg(0) Interface3 arg0) {
		if (this.anInterface3_5 != arg0 && this.aBoolean395) {
			this.anOpengl1.glBindBufferARB(34962, arg0.method5385());
			this.anInterface3_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "(I)V")
	public void method5225(@OriginalArg(0) int arg0) {
		if (this.anInt5754 != arg0) {
			this.anOpengl1.glActiveTexture(arg0 + 33984);
			this.anInt5754 = arg0;
		}
	}

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "()F")
	@Override
	public float method5097() {
		return this.aFloat120;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl1.glLineWidth((float) arg5);
		this.method5189(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(IIIII)V")
	@Override
	protected void method5166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!q;II)V")
	@Override
	public void method5165(@OriginalArg(1) Class156 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class156_Sub1 local2 = (Class156_Sub1) arg0;
		@Pc(5) Class8_Sub1_Sub1 local5 = local2.aClass8_Sub1_Sub1_3;
		this.method5198();
		this.method5251(local2.aClass8_Sub1_Sub1_3);
		this.method5256(1);
		this.method5248(7681, 8448);
		this.method5261(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat63 / (float) local5.anInt3576;
		@Pc(37) float local37 = local5.aFloat64 / (float) local5.anInt3577;
		this.anOpengl1.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt5748 - arg1), local37 * (float) (this.anInt5762 - arg2));
		this.anOpengl1.glVertex2i(this.anInt5748, this.anInt5762);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt5748 - arg1), local37 * (float) (this.anInt5745 - arg2));
		this.anOpengl1.glVertex2i(this.anInt5748, this.anInt5745);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt5744 - arg1), local37 * (float) (this.anInt5745 - arg2));
		this.anOpengl1.glVertex2i(this.anInt5744, this.anInt5745);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt5744 - arg1), local37 * (float) (this.anInt5762 - arg2));
		this.anOpengl1.glVertex2i(this.anInt5744, this.anInt5762);
		this.anOpengl1.glEnd();
		this.method5261(0, 5890, 768);
	}

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "(I)V")
	public void method5226() {
		this.method5219(-2, true);
	}

	@OriginalMember(owner = "client!sq", name = "F", descriptor = "()Z")
	@Override
	public boolean method5168() {
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
	@Override
	public void method5100(@OriginalArg(0) int arg0) {
		this.method5256(0);
		this.anOpengl1.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl1.glClear(16384);
	}

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "(I)V")
	@Override
	public void method5171(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "()I")
	@Override
	public int method5191() {
		return this.anInt5740;
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "(I)V")
	@Override
	public void method5159(@OriginalArg(0) int arg0) {
		this.method5215();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!mq;)V")
	public void method5227(@OriginalArg(0) Interface5 arg0) {
		if (this.anInterface5_3 != arg0 && this.aBoolean395) {
			this.anOpengl1.glBindBufferARB(34963, arg0.method5385());
			this.anInterface5_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!g;IIII)Lclient!id;")
	@Override
	public Class45 method5148(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class45_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!sq", name = "ab", descriptor = "()V")
	public void method5228() {
		this.anOpengl1.glLightfv(16384, 4611, this.aFloatArray25, 0);
		this.anOpengl1.glLightfv(16385, 4611, this.aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!vp;Z)Lclient!gl;")
	@Override
	public Class2 method5157(@OriginalArg(0) Class207 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt6509 * arg0.anInt6508];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray209 == null) {
			for (local15 = 0; local15 < arg0.anInt6508; local15++) {
				for (local21 = 0; local21 < arg0.anInt6509; local21++) {
					@Pc(74) int local74 = arg0.anIntArray623[arg0.aByteArray208[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt6508; local15++) {
				for (local21 = 0; local21 < arg0.anInt6509; local21++) {
					local6[local10++] = arg0.aByteArray209[local8] << 24 | arg0.anIntArray623[arg0.aByteArray208[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class2 local100 = this.method5167(local6, arg0.anInt6509, arg0.anInt6509, arg0.anInt6508);
		local100.method2634(arg0.anInt6507, arg0.anInt6510, arg0.anInt6511, arg0.anInt6506);
		return local100;
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(IIII)V")
	@Override
	public void method5188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass180_1.method4799(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "()I")
	@Override
	public int method5129() {
		@Pc(2) int local2 = this.anInt5777;
		this.anInt5777 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "()V")
	@Override
	public void method5193() {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[BIZ)Lclient!eb;")
	public Interface3 method5229(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface3) (this.aBoolean395 && (!arg3 || this.aBoolean389) ? new Class54_Sub2(this, arg0, arg1, arg2, arg3) : new Class182_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!sq", name = "bb", descriptor = "()V")
	private void method5230() {
		if (this.anInt5766 == 1) {
			return;
		}
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (this.anInt5735 > 0 && this.anInt5740 > 0) {
			this.anOpengl1.glOrtho(0.0D, (double) this.anInt5735, (double) this.anInt5740, 0.0D, -1.0D, 1.0D);
		}
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anInt5766 = 1;
		this.anInt5761 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!mq;III)V")
	public void method5231(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method5227(arg0);
		arg0.method5080(arg1, arg2);
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method5143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method5243();
		this.method5256(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean393) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local23);
		this.anOpengl1.glVertex2f(local16, local23);
		this.anOpengl1.glVertex2f(local16, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean393) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "()Z")
	@Override
	public boolean method5140() {
		if (!this.aClass14_Sub1_Sub1_1.method268()) {
			if (!this.aClass180_1.method4803(this.aClass14_Sub1_Sub1_1)) {
				return false;
			}
			this.aClass144_1.method3784();
		}
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "(I)I")
	public int method5232(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "(I)I")
	public int method5233(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "(IIIIII)V")
	@Override
	public void method5189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5243();
		this.method5256(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)V")
	@Override
	public void method5125(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I[BIZ)Lclient!mq;")
	public Interface5 method5234(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface5) (this.aBoolean395 && (!arg2 || this.aBoolean389) ? new Class54_Sub1(this, 5123, arg0, arg1, arg2) : new Class182_Sub1(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([I)V")
	@Override
	public void method5133(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5748;
		arg0[1] = this.anInt5762;
		arg0[2] = this.anInt5744;
		arg0[3] = this.anInt5745;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5175(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static11.aFloat4 = arg0;
		Static11.aFloat5 = arg1;
		Static11.aFloat6 = arg2;
	}

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "(Z)V")
	public void method5235(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean386) {
			return;
		}
		if (arg0) {
			this.anOpengl1.glEnable(2929);
		} else {
			this.anOpengl1.glDisable(2929);
		}
		this.aBoolean386 = arg0;
		this.anInt5761 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!sq", name = "y", descriptor = "()Z")
	@Override
	public boolean method5151() {
		return this.aClass14_Sub1_Sub1_1.method268();
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(III)V")
	public void method5236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(III)V")
	@Override
	public void method5186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean399) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt5763 = arg1;
		this.anInt5764 = arg2;
		this.method5253();
		this.aClass190_1.method5267(arg0, true);
	}

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "()Z")
	@Override
	public boolean method5138() {
		return this.aClass190_1.method5270();
	}

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "()V")
	@Override
	public void method5103() {
		if (this.anInt5735 <= 0 && this.anInt5740 <= 0) {
			return;
		}
		@Pc(9) int local9 = this.anInt5748;
		@Pc(12) int local12 = this.anInt5744;
		@Pc(15) int local15 = this.anInt5762;
		@Pc(18) int local18 = this.anInt5745;
		this.method5139();
		this.anOpengl1.glReadBuffer(1028);
		this.anOpengl1.glDrawBuffer(1029);
		this.method5262();
		this.method5266(false);
		this.method5241(false);
		this.method5235(false);
		this.method5208(false);
		this.method5251(null);
		this.method5226();
		this.method5252(0);
		this.method5256(0);
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRasterPos2i(0, 0);
		this.anOpengl1.glCopyPixels(0, 0, this.anInt5735, this.anInt5740, 6144);
		this.anOpengl1.glFlush();
		this.anOpengl1.glReadBuffer(1029);
		this.anOpengl1.glDrawBuffer(1029);
		this.method5172(local9, local15, local12, local18);
	}

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "(II)V")
	public synchronized void method5237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class14_Sub34 local4 = new Class14_Sub34(arg1);
		local4.aLong217 = arg0;
		this.aClass18_37.method451(local4);
	}

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "(I)V")
	public synchronized void method5238(@OriginalArg(0) int arg0) {
		@Pc(4) Class14_Sub34 local4 = new Class14_Sub34(arg0);
		this.aClass18_42.method451(local4);
	}

	@OriginalMember(owner = "client!sq", name = "cb", descriptor = "()V")
	private void method5239() {
		@Pc(2) float[] local2 = this.aFloatArray24;
		@Pc(14) float local14 = (float) (-this.anInt5755 * this.anInt5757) / (float) this.anInt5774;
		@Pc(28) float local28 = (float) ((this.anInt5735 - this.anInt5755) * this.anInt5757) / (float) this.anInt5774;
		@Pc(39) float local39 = (float) (this.anInt5770 * this.anInt5757) / (float) this.anInt5751;
		@Pc(53) float local53 = (float) ((this.anInt5770 - this.anInt5740) * this.anInt5757) / (float) this.anInt5751;
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
			@Pc(67) float local67 = (float) this.anInt5757 * 2.0F;
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
			local2[10] = this.aFloat119 = (float) -(this.anInt5768 + this.anInt5757) / (float) (this.anInt5768 - this.anInt5757);
			local2[11] = -1.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = this.aFloat124 = -(local67 * (float) this.anInt5768) / (float) (this.anInt5768 - this.anInt5757);
			local2[15] = 0.0F;
		}
		this.method5213();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5142(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method5118();
	}

	@OriginalMember(owner = "client!sq", name = "db", descriptor = "()V")
	public void method5240() {
		if (this.anInt5761 == 4) {
			return;
		}
		this.method5230();
		this.method5266(false);
		this.method5241(false);
		this.method5235(false);
		this.method5208(false);
		this.method5226();
		this.method5256(1);
		this.method5252(1);
		this.anInt5761 = 4;
	}

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "(Z)V")
	public void method5241(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean396) {
			this.aBoolean396 = arg0;
			this.method5207();
			this.anInt5761 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([Lclient!id;Lclient!pg;[Lclient!cd;I)V")
	@Override
	public void method5123(@OriginalArg(0) Class45[] arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) Class1_Sub3[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method1794(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "eb", descriptor = "()V")
	public void method5242() {
		if (this.anInt5761 == 8) {
			return;
		}
		this.method5245();
		this.method5266(true);
		this.method5235(true);
		this.method5208(true);
		this.method5256(1);
		this.method5252(1);
		this.anInt5761 = 8;
	}

	@OriginalMember(owner = "client!sq", name = "fb", descriptor = "()V")
	private void method5243() {
		if (this.anInt5761 == 1) {
			return;
		}
		this.method5230();
		this.method5266(false);
		this.method5241(false);
		this.method5235(false);
		this.method5208(false);
		this.method5251(null);
		this.method5226();
		this.method5252(0);
		this.anInt5761 = 1;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "()V")
	@Override
	public void method5192() {
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(IIII)V")
	@Override
	public void method5172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt5735) {
			arg2 = this.anInt5735;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt5740) {
			arg3 = this.anInt5740;
		}
		this.anInt5748 = arg0;
		this.anInt5762 = arg1;
		this.anInt5744 = arg2;
		this.anInt5745 = arg3;
		this.anOpengl1.glEnable(3089);
		this.method5194();
		this.method5204();
	}

	@OriginalMember(owner = "client!sq", name = "gb", descriptor = "()V")
	private void method5244() {
		if (this.anInt5766 != 3) {
			this.anInt5766 = 3;
			this.method5249();
			this.method5222();
			this.anInt5761 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "()V")
	@Override
	public void method5131() {
		this.aClass190_1.method5268(false, 0, false);
		this.aBoolean399 = false;
		this.method5253();
		this.method5200();
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
	@Override
	public void method5132(@OriginalArg(0) int arg0) {
		this.method5265();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIII)[I")
	@Override
	public int[] method5105() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl1.glReadPixels(0, this.anInt5740 - local6, 36, 1, 32993, this.anInt5767, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!sq", name = "C", descriptor = "()Z")
	@Override
	public boolean method5155() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "hb", descriptor = "()V")
	public void method5245() {
		if (this.anInt5766 != 2) {
			this.anInt5766 = 2;
			this.method5259();
			this.method5222();
			this.anInt5761 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!sq", name = "ib", descriptor = "()Lclient!rj;")
	public Class8_Sub4 method5246() {
		return this.aClass67_Sub1_1 == null ? null : this.aClass67_Sub1_1.method5494();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!hh;)V")
	public void method5247(@OriginalArg(0) Interface4 arg0) {
		if (this.anInt5739 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5739 >= 0) {
			this.anInterface4Array1[this.anInt5739].method5193();
		}
		this.anInterface4_1 = this.anInterface4Array1[++this.anInt5739] = arg0;
		this.anInterface4_1.method5192();
	}

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "(II)V")
	public void method5248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5754 != 0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt5758 != arg0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anInt5758 = arg0;
			local4 = true;
		}
		if (this.anInt5759 != arg1) {
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			this.anInt5759 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt5761 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!sq", name = "jb", descriptor = "()V")
	private void method5249() {
		@Pc(11) float local11 = (float) -this.anInt5755 * this.aFloat130 / (float) this.anInt5774;
		@Pc(23) float local23 = (float) -this.anInt5770 * this.aFloat130 / (float) this.anInt5751;
		@Pc(37) float local37 = (float) (this.anInt5735 - this.anInt5755) * this.aFloat130 / (float) this.anInt5774;
		@Pc(51) float local51 = (float) (this.anInt5740 - this.anInt5770) * this.aFloat130 / (float) this.anInt5751;
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (local11 != local37 && local51 != local23) {
			this.anOpengl1.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt5757 - this.aFloat120), (double) ((float) this.anInt5768 - this.aFloat120));
		}
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5748 < arg0) {
			this.anInt5748 = arg0;
		}
		if (this.anInt5744 > arg2) {
			this.anInt5744 = arg2;
		}
		if (this.anInt5762 < arg1) {
			this.anInt5762 = arg1;
		}
		if (this.anInt5745 > arg3) {
			this.anInt5745 = arg3;
		}
		this.anOpengl1.glEnable(3089);
		this.method5194();
		this.method5204();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method5180(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt5746 != arg0;
		if (local7 || this.aFloat122 != arg1 || this.aFloat125 != arg2) {
			this.anInt5746 = arg0;
			this.aFloat122 = arg1;
			this.aFloat125 = arg2;
			if (local7) {
				this.aFloat123 = (float) (this.anInt5746 & 0xFF0000) / 1.671168E7F;
				this.aFloat127 = (float) (this.anInt5746 & 0xFFFF) / 65535.0F;
				this.aFloat129 = (float) (this.anInt5746 & 0xFF) / 255.0F;
				this.method5218();
			}
			this.method5205();
		}
		if (this.aFloatArray23[0] == arg3 && this.aFloatArray23[1] == arg4 && this.aFloatArray23[2] == arg5) {
			return;
		}
		this.aFloatArray23[0] = arg3;
		this.aFloatArray23[1] = arg4;
		this.aFloatArray23[2] = arg5;
		this.aFloatArray27[0] = -arg3;
		this.aFloatArray27[1] = -arg4;
		this.aFloatArray27[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray25[0] = arg3 * local132;
		this.aFloatArray25[1] = arg4 * local132;
		this.aFloatArray25[2] = arg5 * local132;
		this.aFloatArray26[0] = -this.aFloatArray25[0];
		this.aFloatArray26[1] = -this.aFloatArray25[1];
		this.aFloatArray26[2] = -this.aFloatArray25[2];
		this.method5228();
		this.anInt5772 = (int) (arg3 * 256.0F / arg4);
		this.anInt5756 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method5147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5243();
		this.method5256(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!sq", name = "kb", descriptor = "()V")
	private void method5250() {
		this.aClass51_Sub2_1 = new Class51_Sub2();
		this.aClass51_Sub2_2 = new Class51_Sub2();
		this.aClass8Array1 = new Class8[this.anInt5750];
		this.aClass8_Sub1_6 = new Class8_Sub1(this, 3553, 6408, 1, 1);
		this.aClass8_Sub1_5 = new Class8_Sub1(this, 3553, 6408, 1, 1);
		this.aClass8_Sub1_4 = new Class8_Sub1(this, 3553, 6408, 1, 1);
		this.aClass45_Sub1_5 = new Class45_Sub1(this);
		this.aClass45_Sub1_6 = new Class45_Sub1(this);
		this.aClass45_Sub1_4 = new Class45_Sub1(this);
		this.aClass45_Sub1_2 = new Class45_Sub1(this);
		this.aClass45_Sub1_1 = new Class45_Sub1(this);
		this.aClass45_Sub1_3 = new Class45_Sub1(this);
		if (this.lb) {
			this.aClass171_4 = new Class171(this);
		}
		this.aClass191_1.method5274(this);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIZ)Lclient!gl;")
	@Override
	public Class2 method5182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class2_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([Lclient!id;Lclient!jp;Lclient!pg;[Lclient!cd;I)V")
	@Override
	public void method5130(@OriginalArg(0) Class45[] arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) Class1_Sub3[] arg3, @OriginalArg(4) int arg4) {
		this.method5123(arg0, arg2, arg3, arg4);
		this.method5122(arg1);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!od;)V")
	public void method5251(@OriginalArg(0) Class8 arg0) {
		@Pc(5) Class8 local5 = this.aClass8Array1[this.anInt5754];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl1.glDisable(local5.anInt5318);
			} else {
				if (local5 == null) {
					this.anOpengl1.glEnable(arg0.anInt5318);
				} else if (arg0.anInt5318 != local5.anInt5318) {
					this.anOpengl1.glDisable(local5.anInt5318);
					this.anOpengl1.glEnable(arg0.anInt5318);
				}
				this.anOpengl1.glBindTexture(arg0.anInt5318, arg0.method4737());
			}
			this.aClass8Array1[this.anInt5754] = arg0;
		}
		this.anInt5761 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!ma;Lclient!ma;FLclient!ma;)Lclient!ma;")
	@Override
	public Class67 method5109(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class67 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean398 && this.lb) {
			@Pc(11) Class67_Sub1_Sub2 local11 = null;
			@Pc(14) Class67_Sub1 local14 = (Class67_Sub1) arg0;
			@Pc(17) Class67_Sub1 local17 = (Class67_Sub1) arg1;
			@Pc(21) Class8_Sub4 local21 = local14.method5494();
			@Pc(25) Class8_Sub4 local25 = local17.method5494();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt5321 > local25.anInt5321 ? local21.anInt5321 : local25.anInt5321;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class67_Sub1_Sub2) {
					@Pc(52) Class67_Sub1_Sub2 local52 = (Class67_Sub1_Sub2) arg3;
					if (local52.method5495() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class67_Sub1_Sub2(this, local40);
				}
				local11.method5496(local25, local21, arg2);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "()I")
	@Override
	public int method5114() {
		return this.anInt5757;
	}

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "(I)V")
	public void method5252(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method5248(7681, 7681);
		} else if (arg0 == 1) {
			this.method5248(8448, 8448);
		} else if (arg0 == 2) {
			this.method5248(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(II)V")
	@Override
	public void method5163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5749 == arg0 && this.anInt5753 == arg1) {
			return;
		}
		this.anInt5749 = arg0;
		this.anInt5753 = arg1;
		if (!this.aBoolean399) {
			this.method5253();
			this.method5200();
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!pg;)V")
	@Override
	public void method5144(@OriginalArg(0) Class51 arg0) {
		this.aClass51_Sub2_1 = (Class51_Sub2) arg0;
		this.aClass51_Sub2_2.method3566(this.aClass51_Sub2_1);
		if (this.anInt5766 != 1) {
			this.method5222();
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!ma;)V")
	@Override
	public void method5170(@OriginalArg(0) Class67 arg0) {
		this.aClass67_Sub1_1 = (Class67_Sub1) arg0;
	}

	@OriginalMember(owner = "client!sq", name = "lb", descriptor = "()V")
	private void method5253() {
		@Pc(15) int local15;
		if (this.aBoolean399) {
			this.anOpengl1.glFogf(2915, 0.0F);
			this.anOpengl1.glFogf(2916, 1.0F);
			local15 = this.anInt5763;
		} else {
			this.aFloat121 = (float) (this.anInt5768 - 256) - this.aFloat135;
			this.aFloat133 = this.aFloat121 - (float) this.anInt5753 * this.aFloat128;
			if (this.aFloat133 < (float) this.anInt5757) {
				this.aFloat133 = this.anInt5757;
			}
			this.anOpengl1.glFogf(2915, this.aFloat133);
			this.anOpengl1.glFogf(2916, this.aFloat121);
			local15 = this.anInt5749;
		}
		Static299.aFloatArray22[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static299.aFloatArray22[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static299.aFloatArray22[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl1.glFogfv(2918, Static299.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)Lclient!ka;")
	@Override
	public Class14_Sub20 method5141() {
		return null;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!lq;)V")
	public void method5254(@OriginalArg(0) Class51_Sub2 arg0) {
		this.anOpengl1.glPushMatrix();
		this.anOpengl1.glMultMatrixf(arg0.method3564(), 0);
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(Lclient!hh;)V")
	public void method5255(@OriginalArg(0) Interface4 arg0) {
		if (this.anInt5739 < 0 || this.anInterface4Array1[this.anInt5739] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface4Array1[this.anInt5739--] = null;
		arg0.method5193();
		if (this.anInt5739 >= 0) {
			this.anInterface4_1 = this.anInterface4Array1[this.anInt5739];
			this.anInterface4_1.method5192();
		}
	}

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "(I)V")
	public void method5256(@OriginalArg(0) int arg0) {
		if (this.anInt5769 == arg0) {
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
		if (local10 != this.aBoolean379) {
			this.anOpengl1.glColorMask(local10, local10, local10, true);
			this.aBoolean379 = local10;
		}
		if (local12 != this.aBoolean381) {
			if (local12) {
				this.anOpengl1.glEnable(3008);
			} else {
				this.anOpengl1.glDisable(3008);
			}
			this.aBoolean381 = local12;
		}
		if (local8 != this.anInt5743) {
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
			this.anInt5743 = local8;
		}
		this.anInt5769 = arg0;
		this.anInt5761 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "(I)V")
	public synchronized void method5257(@OriginalArg(0) int arg0) {
		@Pc(4) Class14_Sub34 local4 = new Class14_Sub34(arg0);
		this.aClass18_41.method451(local4);
	}

	@OriginalMember(owner = "client!sq", name = "mb", descriptor = "()I")
	private int method5258() {
		@Pc(1) int local1 = 0;
		this.aString213 = this.anOpengl1.glGetString(7936);
		this.aString214 = this.anOpengl1.glGetString(7937);
		@Pc(17) String local17 = this.aString213.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl1.glGetString(7938);
		@Pc(53) String[] local53 = Static105.method2289(local45.replace('.', ' '), ' ');
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static75.method1895(local53[0]);
				@Pc(69) int local69 = Static75.method1895(local53[1]);
				this.anInt5760 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt5760 < 12) {
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
		this.anInt5750 = local116[0];
		this.anOpengl1.glGetIntegerv(34929, local116, 0);
		this.anInt5773 = local116[0];
		this.anOpengl1.glGetIntegerv(34930, local116, 0);
		this.anInt5752 = local116[0];
		if (this.anInt5750 < 2 || this.anInt5773 < 2 || this.anInt5752 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean394 = Static12.aString10 != null && Static12.aString10.startsWith("mac");
		this.aBoolean397 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean395 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean393 = this.anOpengl1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean382 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean400 = this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean380 = this.anOpengl1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean388 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean398 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean385 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean387 = false;
		this.lb = this.anOpengl1.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "()I")
	@Override
	public int method5089() {
		return this.anInt5768;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([IIIII)Lclient!gl;")
	@Override
	public Class2 method5167(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class2_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!sq", name = "K", descriptor = "()Lclient!pg;")
	@Override
	public Class51 method5185() {
		return new Class51_Sub2();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method5127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass8_Sub1_Sub1_4 == null || this.aClass8_Sub1_Sub1_4.anInt3574 < arg2 || this.aClass8_Sub1_Sub1_4.anInt3575 < arg3) {
			this.aClass8_Sub1_Sub1_4 = Static360.method3374(this, arg6, arg2, arg3);
			this.aClass8_Sub1_Sub1_4.method3370(false, false);
			local32 = this.aClass8_Sub1_Sub1_4.aFloat64;
			local36 = this.aClass8_Sub1_Sub1_4.aFloat63;
		} else {
			this.aClass8_Sub1_Sub1_4.method3373(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass8_Sub1_Sub1_4.aFloat64 * (float) arg3 / (float) this.aClass8_Sub1_Sub1_4.anInt3575;
			local36 = this.aClass8_Sub1_Sub1_4.aFloat63 * (float) arg2 / (float) this.aClass8_Sub1_Sub1_4.anInt3574;
		}
		this.method5198();
		this.method5251(this.aClass8_Sub1_Sub1_4);
		this.method5256(arg8);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method5212(arg5);
		this.method5248(34165, 34165);
		this.method5261(0, 34166, 768);
		this.method5261(2, 5890, 770);
		this.method5236(0, 34166);
		this.method5236(2, 5890);
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
		this.method5261(0, 5890, 768);
		this.method5261(2, 34166, 770);
		this.method5236(0, 5890);
		this.method5236(2, 34166);
	}

	@OriginalMember(owner = "client!sq", name = "H", descriptor = "()Z")
	@Override
	public boolean method5176() {
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "nb", descriptor = "()V")
	private void method5259() {
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadMatrixf(this.aFloatArray24, 0);
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "(IIIIII)Z")
	@Override
	public boolean method5173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass51_Sub2_1.aFloat68 * (float) arg0 + this.aClass51_Sub2_1.aFloat71 * (float) arg1 + this.aClass51_Sub2_1.aFloat77 * (float) arg2 + this.aClass51_Sub2_1.aFloat70;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass51_Sub2_1.aFloat68 * (float) arg3 + this.aClass51_Sub2_1.aFloat71 * (float) arg4 + this.aClass51_Sub2_1.aFloat77 * (float) arg5 + this.aClass51_Sub2_1.aFloat70;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt5757 && local55 < (float) this.anInt5757 || !(!(local24 > (float) this.anInt5768) || !(local55 > (float) this.anInt5768))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt5774 * (this.aClass51_Sub2_1.aFloat73 * (float) arg0 + this.aClass51_Sub2_1.aFloat72 * (float) arg1 + this.aClass51_Sub2_1.aFloat67 * (float) arg2 + this.aClass51_Sub2_1.aFloat75) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt5774 * (this.aClass51_Sub2_1.aFloat73 * (float) arg3 + this.aClass51_Sub2_1.aFloat72 * (float) arg4 + this.aClass51_Sub2_1.aFloat67 * (float) arg5 + this.aClass51_Sub2_1.aFloat75) / local55);
		if ((float) local119 < this.aFloat134 && (float) local151 < this.aFloat134 || (float) local119 > this.aFloat132 && (float) local151 > this.aFloat132) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt5751 * (this.aClass51_Sub2_1.aFloat76 * (float) arg0 + this.aClass51_Sub2_1.aFloat69 * (float) arg1 + this.aClass51_Sub2_1.aFloat78 * (float) arg2 + this.aClass51_Sub2_1.aFloat74) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt5751 * (this.aClass51_Sub2_1.aFloat76 * (float) arg3 + this.aClass51_Sub2_1.aFloat69 * (float) arg4 + this.aClass51_Sub2_1.aFloat78 * (float) arg5 + this.aClass51_Sub2_1.aFloat74) / local55);
			return (!((float) local209 < this.aFloat116) || !((float) local241 < this.aFloat116)) && (!((float) local209 > this.aFloat115) || !((float) local241 > this.aFloat115));
		}
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(FFF)V")
	private void method5260(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl1.glMatrixMode(5890);
		if (this.aBoolean392) {
			this.anOpengl1.glLoadIdentity();
		}
		this.anOpengl1.glTranslatef(arg0, arg1, arg2);
		this.anOpengl1.glMatrixMode(5888);
		this.aBoolean392 = true;
	}

	@OriginalMember(owner = "client!sq", name = "B", descriptor = "()Z")
	@Override
	public boolean method5154() {
		return this.aClass14_Sub1_Sub1_1.method269();
	}

	@OriginalMember(owner = "client!sq", name = "D", descriptor = "()Z")
	@Override
	public boolean method5160() {
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "(III)V")
	public void method5261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "()Lclient!pg;")
	@Override
	public Class51 method5145() {
		return this.aClass51_5;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(F)V")
	@Override
	public void method5121(@OriginalArg(0) float arg0) {
		if (this.aFloat126 != arg0) {
			this.aFloat126 = arg0;
			this.method5218();
		}
	}

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "()V")
	@Override
	protected void method5137() {
		if (this.anOpengl1 != null) {
			try {
				this.aClass180_1.method4802();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl1 = null;
		}
		if (this.aContext1 != null) {
			this.method5215();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean378) {
			Static88.method2109(true);
			this.aBoolean378 = false;
		}
	}

	@OriginalMember(owner = "client!sq", name = "ob", descriptor = "()V")
	public void method5262() {
		if (this.anInt5766 != 0) {
			this.anInt5766 = 0;
			this.anInt5761 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!sq", name = "pb", descriptor = "()V")
	private void method5263() {
		this.anOpengl1.glDepthMask(this.aBoolean383 && this.aBoolean390);
	}

	@OriginalMember(owner = "client!sq", name = "I", descriptor = "()V")
	@Override
	public void method5183() {
		this.aClass180_1.method4806();
	}

	@OriginalMember(owner = "client!sq", name = "qb", descriptor = "()V")
	private void method5264() {
		if (this.aBoolean392) {
			this.anOpengl1.glMatrixMode(5890);
			this.anOpengl1.glLoadIdentity();
			this.anOpengl1.glMatrixMode(5888);
			this.aBoolean392 = false;
		}
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)I")
	@Override
	public int method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!sq", name = "rb", descriptor = "()V")
	private void method5265() {
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
			Static15.method5425(1000L);
		}
	}

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "(Z)V")
	public void method5266(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean391) {
			this.aBoolean391 = arg0;
			this.method5200();
			this.anInt5761 &= 0xFFFFFFE0;
		}
	}
}
