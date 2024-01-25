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

@OriginalClass("client!ge")
public final class Class81_Sub1 extends Class81 implements Interface3 {

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
	private int anInt1802;

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
	public int anInt1803;

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "Lclient!ep;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
	public int anInt1804;

	@OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
	public int anInt1806;

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
	public int anInt1807;

	@OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
	public int anInt1809;

	@OriginalMember(owner = "client!ge", name = "ab", descriptor = "Lclient!lb;")
	public Class28_Sub3 aClass28_Sub3_2;

	@OriginalMember(owner = "client!ge", name = "cb", descriptor = "Ljava/lang/String;")
	private String aString68;

	@OriginalMember(owner = "client!ge", name = "eb", descriptor = "Lclient!jm;")
	private Class110 aClass110_1;

	@OriginalMember(owner = "client!ge", name = "hb", descriptor = "I")
	private int anInt1812;

	@OriginalMember(owner = "client!ge", name = "jb", descriptor = "Z")
	private boolean aBoolean133;

	@OriginalMember(owner = "client!ge", name = "kb", descriptor = "Lclient!uq;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!ge", name = "lb", descriptor = "F")
	private float lb;

	@OriginalMember(owner = "client!ge", name = "ob", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!ge", name = "pb", descriptor = "Lclient!jd;")
	public Class105 aClass105_2;

	@OriginalMember(owner = "client!ge", name = "rb", descriptor = "[Lclient!jm;")
	private Class110[] aClass110Array1;

	@OriginalMember(owner = "client!ge", name = "sb", descriptor = "Z")
	public boolean aBoolean135;

	@OriginalMember(owner = "client!ge", name = "tb", descriptor = "Lclient!ef;")
	private Class28_Sub3_Sub1 aClass28_Sub3_Sub1_2;

	@OriginalMember(owner = "client!ge", name = "ub", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!ge", name = "vb", descriptor = "Lclient!fl;")
	public Class72_Sub1 aClass72_Sub1_1;

	@OriginalMember(owner = "client!ge", name = "wb", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!ge", name = "xb", descriptor = "J")
	private long aLong60;

	@OriginalMember(owner = "client!ge", name = "yb", descriptor = "Lclient!gp;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!ge", name = "zb", descriptor = "I")
	private int anInt1815;

	@OriginalMember(owner = "client!ge", name = "Ab", descriptor = "I")
	private int anInt1816;

	@OriginalMember(owner = "client!ge", name = "Bb", descriptor = "F")
	private float aFloat39;

	@OriginalMember(owner = "client!ge", name = "Eb", descriptor = "Z")
	public boolean aBoolean136;

	@OriginalMember(owner = "client!ge", name = "Fb", descriptor = "Z")
	private boolean aBoolean137;

	@OriginalMember(owner = "client!ge", name = "Gb", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!ge", name = "Ib", descriptor = "Lclient!bi;")
	private Class19_Sub1 aClass19_Sub1_1;

	@OriginalMember(owner = "client!ge", name = "Kb", descriptor = "F")
	private float aFloat41;

	@OriginalMember(owner = "client!ge", name = "Lb", descriptor = "Z")
	public boolean aBoolean139;

	@OriginalMember(owner = "client!ge", name = "Nb", descriptor = "Z")
	public boolean aBoolean140;

	@OriginalMember(owner = "client!ge", name = "Pb", descriptor = "I")
	private int anInt1821;

	@OriginalMember(owner = "client!ge", name = "Qb", descriptor = "Lclient!rh;")
	public Class78_Sub2 aClass78_Sub2_1;

	@OriginalMember(owner = "client!ge", name = "Rb", descriptor = "[Z")
	private boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!ge", name = "Ub", descriptor = "I")
	public int anInt1822;

	@OriginalMember(owner = "client!ge", name = "Vb", descriptor = "Z")
	private boolean aBoolean142;

	@OriginalMember(owner = "client!ge", name = "Wb", descriptor = "Lclient!gp;")
	public Interface4 anInterface4_2;

	@OriginalMember(owner = "client!ge", name = "Yb", descriptor = "Z")
	public boolean aBoolean143;

	@OriginalMember(owner = "client!ge", name = "bc", descriptor = "Lclient!jm;")
	private Class110 aClass110_2;

	@OriginalMember(owner = "client!ge", name = "cc", descriptor = "Lclient!rh;")
	public Class78_Sub2 aClass78_Sub2_2;

	@OriginalMember(owner = "client!ge", name = "dc", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!ge", name = "ec", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!ge", name = "fc", descriptor = "Z")
	private boolean aBoolean144;

	@OriginalMember(owner = "client!ge", name = "gc", descriptor = "I")
	private int anInt1826;

	@OriginalMember(owner = "client!ge", name = "hc", descriptor = "Z")
	private boolean aBoolean145;

	@OriginalMember(owner = "client!ge", name = "jc", descriptor = "Lclient!fl;")
	public Class72_Sub1 aClass72_Sub1_2;

	@OriginalMember(owner = "client!ge", name = "kc", descriptor = "Lclient!rh;")
	public Class78_Sub2 aClass78_Sub2_3;

	@OriginalMember(owner = "client!ge", name = "nc", descriptor = "Z")
	private boolean aBoolean146;

	@OriginalMember(owner = "client!ge", name = "pc", descriptor = "[Lclient!mo;")
	private Class28[] aClass28Array1;

	@OriginalMember(owner = "client!ge", name = "tc", descriptor = "Lclient!rh;")
	public Class78_Sub2 aClass78_Sub2_4;

	@OriginalMember(owner = "client!ge", name = "uc", descriptor = "Z")
	private boolean aBoolean148;

	@OriginalMember(owner = "client!ge", name = "vc", descriptor = "Lclient!jm;")
	private Class110 aClass110_3;

	@OriginalMember(owner = "client!ge", name = "xc", descriptor = "I")
	private int anInt1829;

	@OriginalMember(owner = "client!ge", name = "zc", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!ge", name = "Ac", descriptor = "Lclient!lb;")
	public Class28_Sub3 aClass28_Sub3_3;

	@OriginalMember(owner = "client!ge", name = "Fc", descriptor = "I")
	private int anInt1833;

	@OriginalMember(owner = "client!ge", name = "Ic", descriptor = "Z")
	public boolean aBoolean149;

	@OriginalMember(owner = "client!ge", name = "Lc", descriptor = "Z")
	private boolean aBoolean151;

	@OriginalMember(owner = "client!ge", name = "Mc", descriptor = "I")
	private int anInt1834;

	@OriginalMember(owner = "client!ge", name = "Nc", descriptor = "I")
	private int anInt1835;

	@OriginalMember(owner = "client!ge", name = "Oc", descriptor = "Z")
	private boolean aBoolean152;

	@OriginalMember(owner = "client!ge", name = "Pc", descriptor = "Z")
	private boolean aBoolean153;

	@OriginalMember(owner = "client!ge", name = "Rc", descriptor = "Lclient!rh;")
	public Class78_Sub2 aClass78_Sub2_5;

	@OriginalMember(owner = "client!ge", name = "Sc", descriptor = "Z")
	private boolean aBoolean154;

	@OriginalMember(owner = "client!ge", name = "Tc", descriptor = "Z")
	private boolean aBoolean155;

	@OriginalMember(owner = "client!ge", name = "Uc", descriptor = "Lclient!rh;")
	public Class78_Sub2 aClass78_Sub2_6;

	@OriginalMember(owner = "client!ge", name = "Vc", descriptor = "Lclient!lb;")
	public Class28_Sub3 aClass28_Sub3_4;

	@OriginalMember(owner = "client!ge", name = "Wc", descriptor = "Z")
	public boolean aBoolean156;

	@OriginalMember(owner = "client!ge", name = "Zc", descriptor = "Ljava/lang/String;")
	private String aString69;

	@OriginalMember(owner = "client!ge", name = "ad", descriptor = "I")
	public int anInt1839;

	@OriginalMember(owner = "client!ge", name = "cd", descriptor = "I")
	public int anInt1841;

	@OriginalMember(owner = "client!ge", name = "fd", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!ge", name = "gd", descriptor = "I")
	private int anInt1843;

	@OriginalMember(owner = "client!ge", name = "hd", descriptor = "I")
	private int anInt1844;

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "Lclient!p;")
	private final Class159 aClass159_1 = new Class159();

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "Lclient!po;")
	private final Class72 aClass72_2 = new Class72_Sub1();

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
	public final int anInt1801 = 8;

	@OriginalMember(owner = "client!ge", name = "J", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
	private int anInt1805 = -1;

	@OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
	public final int anInt1808 = 3;

	@OriginalMember(owner = "client!ge", name = "R", descriptor = "[Lclient!ep;")
	private final Interface3[] anInterface3Array1 = new Interface3[4];

	@OriginalMember(owner = "client!ge", name = "L", descriptor = "Lclient!vq;")
	private final Class211 aClass211_9 = new Class211();

	@OriginalMember(owner = "client!ge", name = "U", descriptor = "Lclient!vq;")
	private final Class211 aClass211_10 = new Class211();

	@OriginalMember(owner = "client!ge", name = "V", descriptor = "Lclient!vq;")
	private final Class211 aClass211_11 = new Class211();

	@OriginalMember(owner = "client!ge", name = "W", descriptor = "Lclient!vq;")
	private final Class211 aClass211_12 = new Class211();

	@OriginalMember(owner = "client!ge", name = "X", descriptor = "Lclient!vq;")
	private final Class211 aClass211_13 = new Class211();

	@OriginalMember(owner = "client!ge", name = "Y", descriptor = "Lclient!vq;")
	private final Class211 aClass211_14 = new Class211();

	@OriginalMember(owner = "client!ge", name = "Z", descriptor = "Lclient!vq;")
	private final Class211 aClass211_15 = new Class211();

	@OriginalMember(owner = "client!ge", name = "mb", descriptor = "I")
	public int anInt1813 = -1;

	@OriginalMember(owner = "client!ge", name = "Jb", descriptor = "Z")
	private boolean aBoolean138 = true;

	@OriginalMember(owner = "client!ge", name = "nb", descriptor = "I")
	public int anInt1814 = 3584;

	@OriginalMember(owner = "client!ge", name = "ac", descriptor = "I")
	private int anInt1825 = -1;

	@OriginalMember(owner = "client!ge", name = "ic", descriptor = "F")
	public float aFloat45 = 1.0F;

	@OriginalMember(owner = "client!ge", name = "Tb", descriptor = "F")
	public float aFloat42 = 3584.0F;

	@OriginalMember(owner = "client!ge", name = "Db", descriptor = "I")
	public int anInt1818 = 512;

	@OriginalMember(owner = "client!ge", name = "Xb", descriptor = "I")
	private int anInt1823 = 8448;

	@OriginalMember(owner = "client!ge", name = "mc", descriptor = "I")
	public int anInt1828 = 50;

	@OriginalMember(owner = "client!ge", name = "Cc", descriptor = "F")
	private float aFloat50 = 1.0F;

	@OriginalMember(owner = "client!ge", name = "gb", descriptor = "[F")
	private final float[] aFloatArray7 = new float[16];

	@OriginalMember(owner = "client!ge", name = "Zb", descriptor = "I")
	private int anInt1824 = -1;

	@OriginalMember(owner = "client!ge", name = "Sb", descriptor = "[F")
	private final float[] aFloatArray8 = new float[4];

	@OriginalMember(owner = "client!ge", name = "rc", descriptor = "[F")
	private final float[] aFloatArray9 = new float[4];

	@OriginalMember(owner = "client!ge", name = "db", descriptor = "I")
	public int anInt1810 = -1;

	@OriginalMember(owner = "client!ge", name = "bb", descriptor = "F")
	public float aFloat35 = 1.0F;

	@OriginalMember(owner = "client!ge", name = "yc", descriptor = "I")
	private int anInt1830 = 0;

	@OriginalMember(owner = "client!ge", name = "Hb", descriptor = "I")
	private int anInt1819 = 0;

	@OriginalMember(owner = "client!ge", name = "lc", descriptor = "I")
	public int anInt1827 = 512;

	@OriginalMember(owner = "client!ge", name = "fb", descriptor = "I")
	public int anInt1811 = 0;

	@OriginalMember(owner = "client!ge", name = "Hc", descriptor = "F")
	public float aFloat52 = 1.0F;

	@OriginalMember(owner = "client!ge", name = "sc", descriptor = "F")
	public float aFloat47 = 3584.0F;

	@OriginalMember(owner = "client!ge", name = "wc", descriptor = "F")
	public float aFloat48 = -1.0F;

	@OriginalMember(owner = "client!ge", name = "Mb", descriptor = "I")
	private int anInt1820 = 0;

	@OriginalMember(owner = "client!ge", name = "Bc", descriptor = "I")
	public int anInt1831 = -1;

	@OriginalMember(owner = "client!ge", name = "Cb", descriptor = "I")
	private int anInt1817 = 0;

	@OriginalMember(owner = "client!ge", name = "Dc", descriptor = "[F")
	private final float[] aFloatArray10 = new float[4];

	@OriginalMember(owner = "client!ge", name = "Gc", descriptor = "F")
	public float aFloat51 = -1.0F;

	@OriginalMember(owner = "client!ge", name = "Xc", descriptor = "I")
	private int anInt1837 = 0;

	@OriginalMember(owner = "client!ge", name = "Qc", descriptor = "I")
	private int anInt1836 = 0;

	@OriginalMember(owner = "client!ge", name = "dd", descriptor = "I")
	private int anInt1842 = 8448;

	@OriginalMember(owner = "client!ge", name = "bd", descriptor = "I")
	private int anInt1840 = 0;

	@OriginalMember(owner = "client!ge", name = "ed", descriptor = "F")
	private float aFloat53 = 1.0F;

	@OriginalMember(owner = "client!ge", name = "Yc", descriptor = "I")
	public int anInt1838 = 0;

	@OriginalMember(owner = "client!ge", name = "qc", descriptor = "F")
	private float aFloat46 = 0.0F;

	@OriginalMember(owner = "client!ge", name = "Jc", descriptor = "[F")
	public final float[] aFloatArray11 = new float[4];

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas1;

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "Lclient!cj;")
	public final Interface2 anInterface2_2;

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl1;

	@OriginalMember(owner = "client!ge", name = "Ec", descriptor = "I")
	public final int anInt1832;

	@OriginalMember(owner = "client!ge", name = "qb", descriptor = "Z")
	private boolean aBoolean134;

	@OriginalMember(owner = "client!ge", name = "Kc", descriptor = "Z")
	public boolean aBoolean150;

	@OriginalMember(owner = "client!ge", name = "Ob", descriptor = "Z")
	public boolean aBoolean141;

	@OriginalMember(owner = "client!ge", name = "oc", descriptor = "Z")
	private boolean aBoolean147;

	@OriginalMember(owner = "client!ge", name = "ib", descriptor = "Z")
	public boolean aBoolean132;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "Lclient!wi;")
	public final Class217 aClass217_1;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "Lclient!kb;")
	private final Class114 aClass114_1;

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "Lclient!aa;")
	private final Class2 aClass2_1;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Lclient!gh;")
	private final Class6_Sub14_Sub1 aClass6_Sub14_Sub1_1;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!cj;IILclient!vj;)V")
	public Class81_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class206 arg4) {
		this.aCanvas1 = arg0;
		this.anInterface2_2 = arg1;
		this.anInt2815 = arg2;
		@Pc(186) int local186 = 0;
		while (!this.aCanvas1.isShowing()) {
			if (local186++ > 5) {
				throw new RuntimeException("");
			}
			Static278.method5283(1000L);
		}
		this.aCanvas1.setIgnoreRepaint(true);
		try {
			if (!Static97.aBoolean130) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static97.aBoolean130 = Boolean.TRUE;
				} else {
					@Pc(218) Class196 local218 = arg4.method5519(this.getClass());
					while (local218.anInt5851 == 0) {
						Static278.method5283(100L);
					}
					if (local218.anInt5851 == 1) {
						Static97.aBoolean130 = Boolean.TRUE;
					}
				}
			}
			if (!Static97.aBoolean130) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas1, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method1972();
				this.anOpengl1 = this.aContext1.getGL();
				@Pc(283) int local283 = this.method2012();
				if (local283 != 0) {
					throw new RuntimeException("");
				}
				this.anInt1832 = this.aBoolean156 ? 33639 : 5121;
				@Pc(302) String local302 = this.aString69.toLowerCase();
				@Pc(306) String local306 = this.aString68.toLowerCase();
				if (local306.indexOf("radeon") != -1) {
					@Pc(313) int local313 = 0;
					@Pc(315) boolean local315 = false;
					@Pc(317) boolean local317 = false;
					@Pc(325) String[] local325 = Static194.method3611(local306.replace('/', ' '), ' ');
					for (@Pc(327) int local327 = 0; local327 < local325.length; local327++) {
						@Pc(335) String local335 = local325[local327];
						try {
							if (local335.length() > 0) {
								if (local335.charAt(0) == 'x' && local335.length() >= 3 && Static234.method30(local335.substring(1, 3))) {
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
									if (local335.length() >= 4 && Static234.method30(local335.substring(0, 4))) {
										local313 = Static344.method5646(local335.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(399) Exception local399) {
						}
					}
					if (!local317 && !local315) {
						if (local313 >= 7000 && local313 <= 7999) {
							this.aBoolean134 = false;
						}
						if (local313 >= 7000 && local313 <= 9250) {
							this.aBoolean150 = false;
						}
					}
					if (!local315 || local313 < 4000) {
						this.aBoolean141 = false;
					}
					this.aBoolean147 = this.aBoolean134;
				}
				if (local302.contains("intel")) {
					this.aBoolean132 = false;
				}
				if (this.aBoolean134) {
					try {
						@Pc(448) int[] local448 = new int[1];
						this.anOpengl1.glGenBuffersARB(1, local448, 0);
					} catch (@Pc(456) Throwable local456) {
						throw new RuntimeException("", local456);
					}
				}
				this.method1997(this);
				this.method2965();
				this.method2023();
				new Class138(this);
				this.aClass217_1 = new Class217(this, this.anInterface2_2);
				Static10.method192(true);
				this.aBoolean131 = true;
				this.aClass114_1 = new Class114(this);
				this.aClass2_1 = new Class2(this);
				this.aClass6_Sub14_Sub1_1 = new Class6_Sub14_Sub1(this);
				this.method2007();
				this.anOpengl1.glClear(16640);
				local186 = 0;
				while (true) {
					try {
						this.aContext1.swapBuffers();
						break;
					} catch (@Pc(521) Exception local521) {
						if (local186++ > 5) {
							throw new RuntimeException("");
						}
						Static278.method5283(100L);
					}
				}
				this.anOpengl1.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(540) Throwable local540) {
			local540.printStackTrace();
			this.method2969();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local540);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([I)V")
	@Override
	public void method2989(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1840;
		arg0[1] = this.anInt1817;
		arg0[2] = this.anInt1830;
		arg0[3] = this.anInt1837;
	}

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "()V")
	private void method1949() {
		Static97.aFloatArray5[0] = this.aFloat44 * this.aFloat52;
		Static97.aFloatArray5[1] = this.aFloat44 * this.aFloat45;
		Static97.aFloatArray5[2] = this.aFloat44 * this.aFloat35;
		Static97.aFloatArray5[3] = 1.0F;
		this.anOpengl1.glLightModelfv(2899, Static97.aFloatArray5, 0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!jm;)V")
	public void method1950(@OriginalArg(0) Class110 arg0) {
		@Pc(2) Interface8 local2 = arg0.anInterface8_2;
		this.method1967(local2);
		local2.method5001(arg0);
		this.aClass110_1 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(Z)V")
	public void method1951(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean155) {
			this.aBoolean155 = arg0;
			this.method1966();
		}
	}

	@OriginalMember(owner = "client!ge", name = "N", descriptor = "()Lclient!ca;")
	public Class28_Sub1 method1952() {
		return this.aClass19_Sub1_1 == null ? null : this.aClass19_Sub1_1.method4311();
	}

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "()F")
	@Override
	public float method2970() {
		return this.aFloat43;
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)V")
	public void method1953(@OriginalArg(0) int arg0) {
		if (this.anInt1834 != arg0) {
			this.anOpengl1.glActiveTexture(arg0 + 33984);
			this.anInt1834 = arg0;
		}
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(II)V")
	public synchronized void method1954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class6_Sub43 local4 = new Class6_Sub43(arg1);
		local4.aLong218 = arg0;
		this.aClass211_10.method5585(local4);
	}

	@OriginalMember(owner = "client!ge", name = "O", descriptor = "()Lclient!ep;")
	public Interface3 method1955() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "()V")
	@Override
	public void method2742() {
	}

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "()I")
	@Override
	public int method3018() {
		@Pc(2) int local2 = this.anInt1844;
		this.anInt1844 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ge", name = "P", descriptor = "()V")
	private void method1956() {
		Static97.aFloatArray5[0] = this.aFloat48 * this.aFloat52;
		Static97.aFloatArray5[1] = this.aFloat48 * this.aFloat45;
		Static97.aFloatArray5[2] = this.aFloat48 * this.aFloat35;
		Static97.aFloatArray5[3] = 1.0F;
		this.anOpengl1.glLightfv(16384, 4609, Static97.aFloatArray5, 0);
		Static97.aFloatArray5[0] = -this.aFloat51 * this.aFloat52;
		Static97.aFloatArray5[1] = -this.aFloat51 * this.aFloat45;
		Static97.aFloatArray5[2] = -this.aFloat51 * this.aFloat35;
		Static97.aFloatArray5[3] = 1.0F;
		this.anOpengl1.glLightfv(16385, 4609, Static97.aFloatArray5, 0);
	}

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "()V")
	public void method1957() {
		this.anOpengl1.glLightfv(16384, 4611, this.aFloatArray9, 0);
		this.anOpengl1.glLightfv(16385, 4611, this.aFloatArray8, 0);
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)V")
	public void method1958(@OriginalArg(0) int arg0) {
		Static97.aFloatArray5[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static97.aFloatArray5[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static97.aFloatArray5[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static97.aFloatArray5[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static97.aFloatArray5, 0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl1.glLineWidth((float) arg5);
		this.method3043(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(Z)V")
	public void method1959(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean142) {
			this.aBoolean142 = arg0;
			this.method1960();
			this.anInt1833 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "()Z")
	@Override
	public boolean method2951() {
		return false;
	}

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "()Z")
	@Override
	public boolean method3044() {
		return false;
	}

	@OriginalMember(owner = "client!ge", name = "R", descriptor = "()V")
	private void method1960() {
		this.anOpengl1.glDepthMask(this.aBoolean142 && this.aBoolean138);
	}

	@OriginalMember(owner = "client!ge", name = "S", descriptor = "()V")
	public void method1961() {
		if (this.anInt1833 == 16) {
			return;
		}
		this.method2014();
		this.method1962(true);
		this.method2006(true);
		this.method1959(true);
		this.method1963(1);
		this.method1979(1);
		this.anInt1833 = 16;
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(Z)V")
	public void method1962(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean148) {
			this.aBoolean148 = arg0;
			this.method1999();
			this.anInt1833 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method2992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method2002();
		this.method1963(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean152) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local23);
		this.anOpengl1.glVertex2f(local16, local23);
		this.anOpengl1.glVertex2f(local16, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean152) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "(I)V")
	public void method1963(@OriginalArg(0) int arg0) {
		if (this.anInt1816 == arg0) {
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
		if (local10 != this.aBoolean137) {
			this.anOpengl1.glColorMask(local10, local10, local10, true);
			this.aBoolean137 = local10;
		}
		if (local12 != this.aBoolean145) {
			if (local12) {
				this.anOpengl1.glEnable(3008);
			} else {
				this.anOpengl1.glDisable(3008);
			}
			this.aBoolean145 = local12;
		}
		if (local8 != this.anInt1835) {
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
			this.anInt1835 = local8;
		}
		this.anInt1816 = arg0;
		this.anInt1833 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[Lclient!uc;)V")
	@Override
	public void method3036(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub17[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class6_Sub17 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static97.aFloatArray6[0] = local8.anInt2314;
			Static97.aFloatArray6[1] = local8.anInt2316;
			Static97.aFloatArray6[2] = local8.anInt2317;
			Static97.aFloatArray6[3] = 1.0F;
			this.anOpengl1.glLightfv(local12, 4611, Static97.aFloatArray6, 0);
			@Pc(44) int local44 = local8.anInt2319;
			@Pc(49) float local49 = local8.aFloat61 / 255.0F;
			Static97.aFloatArray6[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static97.aFloatArray6[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static97.aFloatArray6[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl1.glLightfv(local12, 4609, Static97.aFloatArray6, 0);
			this.anOpengl1.glLightf(local12, 4617, 1.0F / (float) (local8.anInt2315 * local8.anInt2315));
			this.anOpengl1.glEnable(local12);
		}
		while (local1 < this.anInt1820) {
			this.anOpengl1.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt1820 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	@Override
	public void method2987(@OriginalArg(0) int arg0) {
		this.method1963(0);
		this.anOpengl1.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl1.glClear(16384);
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(IIIII)V")
	@Override
	protected void method3031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([Lclient!rc;Lclient!po;[Lclient!tc;I)V")
	@Override
	public void method3037(@OriginalArg(0) Class78[] arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) Class20_Sub8[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method4649(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "()V")
	@Override
	public void method3003() {
		@Pc(2) int local2 = this.anInt1840;
		@Pc(5) int local5 = this.anInt1830;
		@Pc(8) int local8 = this.anInt1817;
		@Pc(11) int local11 = this.anInt1837;
		this.method3032();
		this.anOpengl1.glReadBuffer(1028);
		this.anOpengl1.glDrawBuffer(1029);
		this.method1992();
		this.method1962(false);
		this.method2004(false);
		this.method2006(false);
		this.method1959(false);
		this.method2022(null);
		this.method1993();
		this.method1979(0);
		this.method1963(0);
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRasterPos2i(0, 0);
		this.anOpengl1.glCopyPixels(0, 0, this.anInt1803, this.anInt1807, 6144);
		this.anOpengl1.glFlush();
		this.anOpengl1.glReadBuffer(1029);
		this.anOpengl1.glDrawBuffer(1029);
		this.method3033(local2, local8, local5, local11);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ep;)V")
	public void method1964(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt1805 < 0 || this.anInterface3Array1[this.anInt1805] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface3Array1[this.anInt1805--] = null;
		arg0.method2743();
		if (this.anInt1805 >= 0) {
			this.anInterface3_1 = this.anInterface3Array1[this.anInt1805];
			this.anInterface3_1.method2742();
		}
	}

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "()V")
	@Override
	protected void method2969() {
		if (this.anOpengl1 != null) {
			try {
				this.aClass2_1.method35();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl1 = null;
		}
		if (this.aContext1 != null) {
			this.method2019();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean131) {
			Static165.method5489(true);
			this.aBoolean131 = false;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)V")
	@Override
	public void method2953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1840 < arg0) {
			this.anInt1840 = arg0;
		}
		if (this.anInt1830 > arg2) {
			this.anInt1830 = arg2;
		}
		if (this.anInt1817 < arg1) {
			this.anInt1817 = arg1;
		}
		if (this.anInt1837 > arg3) {
			this.anInt1837 = arg3;
		}
		this.anOpengl1.glEnable(3089);
		this.method1976();
		this.method2009();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(FF)V")
	@Override
	public void method2974(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat40 && arg1 == this.aFloat43) {
			return;
		}
		this.aFloat40 = arg0;
		this.aFloat43 = arg1;
		this.method1991();
		this.method1980();
		if (this.anInt1821 == 3) {
			this.method2010();
		} else if (this.anInt1821 == 2) {
			this.method2001();
		}
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(II)V")
	public void method1965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1834 != 0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt1823 != arg0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anInt1823 = arg0;
			local4 = true;
		}
		if (this.anInt1842 != arg1) {
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			this.anInt1842 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt1833 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method3043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2002();
		this.method1963(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "()Lclient!po;")
	@Override
	public Class72 method3029() {
		return new Class72_Sub1();
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(IIIII)V")
	@Override
	public void method3010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2002();
		this.method1963(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!ge", name = "T", descriptor = "()V")
	private void method1966() {
		if (this.aBoolean133 && !this.aBoolean155) {
			this.anOpengl1.glEnable(2896);
		} else {
			this.anOpengl1.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "()Lclient!po;")
	@Override
	public Class72 method2990() {
		return this.aClass72_2;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!uq;)V")
	public void method1967(@OriginalArg(0) Interface8 arg0) {
		if (this.anInterface8_1 != arg0 && this.aBoolean134) {
			this.anOpengl1.glBindBufferARB(34962, arg0.method5116());
			this.anInterface8_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!gp;)V")
	public void method1968(@OriginalArg(0) Interface4 arg0) {
		if (this.anInterface4_1 != arg0 && this.aBoolean134) {
			this.anOpengl1.glBindBufferARB(34963, arg0.method5116());
			this.anInterface4_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Lclient!oe;")
	@Override
	public Class6_Sub29 method2984() {
		return null;
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "()I")
	@Override
	public int method2952() {
		return this.anInt1809 + this.anInt1806 + this.anInt1802;
	}

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "(I)I")
	public int method1969(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method2962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method2002();
		this.method1963(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean152) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local19);
		this.anOpengl1.glVertex2f(local14, local19);
		this.anOpengl1.glVertex2f(local14, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean152) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method3009(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method3030();
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)V")
	@Override
	public void method3049() {
		this.aBoolean136 = true;
		this.anInt1824 = 1583160;
		this.anInt1831 = 40;
		this.method2003();
		this.method1999();
		this.aClass114_1.method3142(false, 3, false);
		this.aClass114_1.method3143(true, -1);
	}

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "()I")
	@Override
	public int method3021() {
		@Pc(2) int local2 = this.anInt1843;
		this.anInt1843 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ge", name = "L", descriptor = "()V")
	@Override
	public void method3045() {
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[BIZ)Lclient!gp;")
	public Interface4 method1970(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface4) (this.aBoolean134 && (!arg2 || this.aBoolean147) ? new Class45_Sub1(this, 5123, arg0, arg1, arg2) : new Class39_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method2956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2002();
		this.method1963(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!ge", name = "U", descriptor = "()V")
	public void method1971() {
		@Pc(6) boolean local6 = this.aClass110_2 != null;
		if (local6 != this.aBoolean153) {
			if (local6) {
				this.anOpengl1.glEnableClientState(32884);
			} else {
				this.anOpengl1.glDisableClientState(32884);
			}
			this.aBoolean153 = local6;
		}
		this.aClass110_2 = null;
		@Pc(34) boolean local34 = this.aClass110_3 != null;
		if (local34 != this.aBoolean151) {
			if (local34) {
				this.anOpengl1.glEnableClientState(32885);
			} else {
				this.anOpengl1.glDisableClientState(32885);
			}
			this.aBoolean151 = local34;
		}
		this.aClass110_3 = null;
		@Pc(62) boolean local62 = this.aClass110_1 != null;
		if (local62 != this.aBoolean146) {
			if (local62) {
				this.anOpengl1.glEnableClientState(32886);
			} else {
				this.anOpengl1.glDisableClientState(32886);
			}
			this.aBoolean146 = local62;
		}
		this.aClass110_1 = null;
		for (@Pc(85) int local85 = 0; local85 < this.anInt1812; local85++) {
			@Pc(98) boolean local98 = this.aClass110Array1[local85] != null;
			if (local98 != this.aBooleanArray17[local85]) {
				this.anOpengl1.glClientActiveTexture(local85 + 33984);
				if (local98) {
					this.anOpengl1.glEnableClientState(32888);
				} else {
					this.anOpengl1.glDisableClientState(32888);
				}
				this.aBooleanArray17[local85] = local98;
			}
			this.aClass110Array1[local85] = null;
		}
	}

	@OriginalMember(owner = "client!ge", name = "V", descriptor = "()V")
	private void method1972() {
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
			Static278.method5283(1000L);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!gp;III)V")
	public void method1973(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1968(arg0);
		arg0.method5117(arg1, arg2);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(FFF)V")
	private void method1974(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl1.glMatrixMode(5890);
		if (this.aBoolean144) {
			this.anOpengl1.glLoadIdentity();
		}
		this.anOpengl1.glTranslatef(arg0, arg1, arg2);
		this.anOpengl1.glMatrixMode(5888);
		this.aBoolean144 = true;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(III)V")
	public void method1975(@OriginalArg(2) int arg0) {
		this.anOpengl1.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ge", name = "W", descriptor = "()V")
	private void method1976() {
		this.aFloat36 = this.anInt1840 - this.anInt1838;
		this.aFloat38 = this.anInt1830 - this.anInt1838;
		this.aFloat49 = this.anInt1817 - this.anInt1811;
		this.aFloat54 = this.anInt1837 - this.anInt1811;
	}

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "()Z")
	@Override
	public boolean method2997() {
		return this.aClass6_Sub14_Sub1_1.method2060();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([IIIII)Lclient!of;")
	@Override
	public Class40 method2996(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class40_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "(I)V")
	public synchronized void method1977(@OriginalArg(0) int arg0) {
		@Pc(4) Class6_Sub43 local4 = new Class6_Sub43(arg0);
		this.aClass211_15.method5585(local4);
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(II)V")
	public void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1819 = arg0;
		this.anInt1836 = arg1;
		this.anOpengl1.glViewport(arg0, arg1, this.anInt1803, this.anInt1807);
		this.method2009();
	}

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "()Z")
	@Override
	public boolean method3028() {
		return true;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(FFF)V")
	@Override
	public void method3007(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static100.aFloat55 = arg0;
		Static100.aFloat56 = arg1;
		Static100.aFloat57 = arg2;
	}

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "(I)V")
	public void method1979(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1965(7681, 7681);
		} else if (arg0 == 1) {
			this.method1965(8448, 8448);
		} else if (arg0 == 2) {
			this.method1965(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
	@Override
	public void method2957(@OriginalArg(0) boolean arg0) {
		this.aBoolean138 = arg0;
		this.method1960();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!qi;Lclient!qi;FLclient!qi;)Lclient!qi;")
	@Override
	public Class19 method2991(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class19 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean139 && this.aBoolean132) {
			@Pc(11) Class19_Sub1_Sub2 local11 = null;
			@Pc(14) Class19_Sub1 local14 = (Class19_Sub1) arg0;
			@Pc(17) Class19_Sub1 local17 = (Class19_Sub1) arg1;
			@Pc(21) Class28_Sub1 local21 = local14.method4311();
			@Pc(25) Class28_Sub1 local25 = local17.method4311();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt644 > local25.anInt644 ? local21.anInt644 : local25.anInt644;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class19_Sub1_Sub2) {
					@Pc(52) Class19_Sub1_Sub2 local52 = (Class19_Sub1_Sub2) arg3;
					if (local52.method4312() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class19_Sub1_Sub2(this, local40);
				}
				local11.method4313(arg2, local21, local25);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIII)V")
	@Override
	public void method2961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass2_1.method42(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ge", name = "X", descriptor = "()V")
	private void method1980() {
		this.aFloat42 = (this.aFloatArray7[14] - (float) this.anInt1814) / this.aFloatArray7[10];
		this.aFloat47 = (float) this.anInt1814 - this.aFloat43;
	}

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "(I)I")
	public int method1981(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ge", name = "Y", descriptor = "()V")
	public void method1982() {
		if (this.anInt1833 == 8) {
			return;
		}
		this.method2005();
		this.method1962(true);
		this.method2006(true);
		this.method1959(true);
		this.method1963(1);
		this.method1979(1);
		this.anInt1833 = 8;
	}

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "()Z")
	@Override
	public boolean method3041() {
		return true;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method2993(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt1825 != arg0;
		if (local7 || this.aFloat48 != arg1 || this.aFloat51 != arg2) {
			this.anInt1825 = arg0;
			this.aFloat48 = arg1;
			this.aFloat51 = arg2;
			if (local7) {
				this.aFloat52 = (float) (this.anInt1825 & 0xFF0000) / 1.671168E7F;
				this.aFloat45 = (float) (this.anInt1825 & 0xFFFF) / 65535.0F;
				this.aFloat35 = (float) (this.anInt1825 & 0xFF) / 255.0F;
				this.method1949();
			}
			this.method1956();
		}
		if (this.aFloatArray9[0] == arg3 && this.aFloatArray9[1] == arg4 && this.aFloatArray9[2] == arg5) {
			return;
		}
		this.aFloatArray9[0] = arg3;
		this.aFloatArray9[1] = arg4;
		this.aFloatArray9[2] = arg5;
		this.aFloatArray8[0] = -arg3;
		this.aFloatArray8[1] = -arg4;
		this.aFloatArray8[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray11[0] = arg3 * local132;
		this.aFloatArray11[1] = arg4 * local132;
		this.aFloatArray11[2] = arg5 * local132;
		this.aFloatArray10[0] = -this.aFloatArray11[0];
		this.aFloatArray10[1] = -this.aFloatArray11[1];
		this.aFloatArray10[2] = -this.aFloatArray11[2];
		this.method1957();
		this.anInt1839 = (int) (arg3 * 256.0F / arg4);
		this.anInt1822 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I")
	@Override
	public int method2958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "(I)V")
	public synchronized void method1983(@OriginalArg(0) int arg0) {
		@Pc(4) Class6_Sub43 local4 = new Class6_Sub43(arg0);
		this.aClass211_14.method5585(local4);
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "()Z")
	@Override
	public boolean method2949() {
		return true;
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(III)V")
	public void method1984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(II)V")
	public synchronized void method1985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class6_Sub43 local4 = new Class6_Sub43(arg1);
		local4.aLong218 = arg0;
		this.aClass211_11.method5585(local4);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)I")
	@Override
	public int method2994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "()Z")
	@Override
	public boolean method2981() {
		return true;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(III)V")
	public void method1986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "()V")
	@Override
	public void method3022() {
		this.aClass2_1.method38();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method2960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass28_Sub3_Sub1_2 == null || this.aClass28_Sub3_Sub1_2.anInt1334 < arg2 || this.aClass28_Sub3_Sub1_2.anInt1335 < arg3) {
			this.aClass28_Sub3_Sub1_2 = Static359.method1259(arg6, this, arg2, arg3);
			this.aClass28_Sub3_Sub1_2.method1257(false, false);
			local32 = this.aClass28_Sub3_Sub1_2.aFloat20;
			local36 = this.aClass28_Sub3_Sub1_2.aFloat21;
		} else {
			this.aClass28_Sub3_Sub1_2.method1254(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass28_Sub3_Sub1_2.aFloat20 * (float) arg3 / (float) this.aClass28_Sub3_Sub1_2.anInt1335;
			local36 = this.aClass28_Sub3_Sub1_2.aFloat21 * (float) arg2 / (float) this.aClass28_Sub3_Sub1_2.anInt1334;
		}
		this.method2026();
		this.method2022(this.aClass28_Sub3_Sub1_2);
		this.method1963(arg8);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method1958(arg5);
		this.method1965(34165, 34165);
		this.method1986(0, 34166, 768);
		this.method1986(2, 5890, 770);
		this.method1984(0, 34166);
		this.method1984(2, 5890);
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
		this.method1986(0, 5890, 768);
		this.method1986(2, 34166, 770);
		this.method1984(0, 5890);
		this.method1984(2, 34166);
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "()V")
	@Override
	public void method2965() {
		this.anInt1803 = this.aCanvas1.getWidth();
		this.anInt1807 = this.aCanvas1.getHeight();
		this.anOpengl1.glViewport(this.anInt1819, this.anInt1836, this.anInt1803, this.anInt1807);
		this.method1992();
		this.method3032();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[[I[[IIII)Lclient!nc;")
	@Override
	public Class106 method3008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class106_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!rn;II)V")
	@Override
	public void method3047(@OriginalArg(1) Class74 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class74_Sub1 local2 = (Class74_Sub1) arg0;
		@Pc(5) Class28_Sub3_Sub1 local5 = local2.aClass28_Sub3_Sub1_1;
		this.method2026();
		this.method2022(local2.aClass28_Sub3_Sub1_1);
		this.method1963(1);
		this.method1965(7681, 8448);
		this.method1986(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat21 / (float) local5.anInt1338;
		@Pc(37) float local37 = local5.aFloat20 / (float) local5.anInt1337;
		this.anOpengl1.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt1840 - arg1), local37 * (float) (this.anInt1817 - arg2));
		this.anOpengl1.glVertex2i(this.anInt1840, this.anInt1817);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt1840 - arg1), local37 * (float) (this.anInt1837 - arg2));
		this.anOpengl1.glVertex2i(this.anInt1840, this.anInt1837);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt1830 - arg1), local37 * (float) (this.anInt1837 - arg2));
		this.anOpengl1.glVertex2i(this.anInt1830, this.anInt1837);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt1830 - arg1), local37 * (float) (this.anInt1817 - arg2));
		this.anOpengl1.glVertex2i(this.anInt1830, this.anInt1817);
		this.anOpengl1.glEnd();
		this.method1986(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!po;)V")
	@Override
	public void method2954(@OriginalArg(0) Class72 arg0) {
		this.aClass72_Sub1_1 = (Class72_Sub1) arg0;
		this.aClass72_Sub1_2.method1532(this.aClass72_Sub1_1);
		if (this.anInt1821 != 1) {
			this.method2008();
		}
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "()Z")
	@Override
	public boolean method2964() {
		return false;
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(II)V")
	@Override
	public void method3035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1813 == arg0 && this.anInt1810 == arg1) {
			return;
		}
		this.anInt1813 = arg0;
		this.anInt1810 = arg1;
		if (!this.aBoolean136) {
			this.method2003();
			this.method1999();
		}
	}

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "()Z")
	@Override
	public boolean method2988() {
		return true;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(FF)V")
	public void method1987(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat50 = arg0;
		this.aFloat46 = arg1;
		if (!this.aBoolean136) {
			this.method2003();
		}
	}

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "()V")
	@Override
	public void method3032() {
		this.anInt1840 = 0;
		this.anInt1817 = 0;
		this.anInt1830 = this.anInt1803;
		this.anInt1837 = this.anInt1807;
		this.anOpengl1.glDisable(3089);
		this.method1976();
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method3026(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class6_Sub43 local16;
		while (!this.aClass211_10.method5589()) {
			local16 = (Class6_Sub43) this.aClass211_10.method5587();
			Static97.anIntArray254[local1++] = (int) local16.aLong218;
			this.anInt1809 -= local16.anInt6289;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteBuffersARB(local1, Static97.anIntArray254, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteBuffersARB(local1, Static97.anIntArray254, 0);
			local1 = 0;
		}
		while (!this.aClass211_11.method5589()) {
			local16 = (Class6_Sub43) this.aClass211_11.method5587();
			Static97.anIntArray254[local1++] = (int) local16.aLong218;
			this.anInt1806 -= local16.anInt6289;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteTextures(local1, Static97.anIntArray254, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteTextures(local1, Static97.anIntArray254, 0);
			local1 = 0;
		}
		while (!this.aClass211_12.method5589()) {
			local16 = (Class6_Sub43) this.aClass211_12.method5587();
			Static97.anIntArray254[local1++] = local16.anInt6289;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteFramebuffersEXT(local1, Static97.anIntArray254, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteFramebuffersEXT(local1, Static97.anIntArray254, 0);
			local1 = 0;
		}
		while (!this.aClass211_13.method5589()) {
			local16 = (Class6_Sub43) this.aClass211_13.method5587();
			Static97.anIntArray254[local1++] = (int) local16.aLong218;
			this.anInt1802 -= local16.anInt6289;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static97.anIntArray254, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static97.anIntArray254, 0);
			local1 = 0;
		}
		while (!this.aClass211_14.method5589()) {
			local16 = (Class6_Sub43) this.aClass211_14.method5587();
			Static97.anIntArray254[local1++] = (int) local16.aLong218;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteProgramsARB(local1, Static97.anIntArray254, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteProgramsARB(local1, Static97.anIntArray254, 0);
		}
		while (!this.aClass211_9.method5589()) {
			local16 = (Class6_Sub43) this.aClass211_9.method5587();
			this.anOpengl1.glDeleteLists((int) local16.aLong218, local16.anInt6289);
		}
		while (!this.aClass211_15.method5589()) {
			local16 = (Class6_Sub43) this.aClass211_15.method5587();
			this.anOpengl1.glDeleteObjectARB(local16.anInt6289);
		}
		while (!this.aClass211_9.method5589()) {
			local16 = (Class6_Sub43) this.aClass211_9.method5587();
			this.anOpengl1.glDeleteLists((int) local16.aLong218, local16.anInt6289);
		}
		if (this.method2952() > 100663296 && Static245.method4300() > this.aLong60 + 60000L) {
			System.gc();
			this.aLong60 = Static245.method4300();
		}
		this.anInt1804 = local5;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method3020() {
	}

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "(I)V")
	public synchronized void method1988(@OriginalArg(0) int arg0) {
		@Pc(4) Class6_Sub43 local4 = new Class6_Sub43(arg0);
		this.aClass211_12.method5585(local4);
	}

	@OriginalMember(owner = "client!ge", name = "Z", descriptor = "()V")
	public void method1989() {
		this.anOpengl1.glPopMatrix();
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I[BIZ)Lclient!uq;")
	public Interface8 method1990(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface8) (this.aBoolean134 && (!arg3 || this.aBoolean147) ? new Class45_Sub2(this, arg0, arg1, arg2, arg3) : new Class39_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!ge", name = "ab", descriptor = "()V")
	private void method1991() {
		if (this.aFloat43 == 0.0F) {
			this.aFloatArray7[10] = this.aFloat39;
			this.aFloatArray7[14] = this.aFloat41;
		} else {
			@Pc(13) float local13 = this.aFloat40 / (this.aFloat43 + this.aFloat40);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat41 * (1.0F - local13) * (1.0F - local13) / this.aFloat43;
			this.aFloatArray7[10] = this.aFloat39 + local32;
			this.aFloatArray7[14] = this.aFloat41 * local17;
		}
		this.method1980();
	}

	@OriginalMember(owner = "client!ge", name = "bb", descriptor = "()V")
	public void method1992() {
		if (this.anInt1821 != 0) {
			this.anInt1821 = 0;
			this.anInt1833 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "()I")
	@Override
	public int method2744() {
		return this.anInt1807;
	}

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "(I)V")
	public void method1993() {
		this.method1994(-2, true);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3006(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V")
	@Override
	public void method3039(@OriginalArg(0) int arg0) {
		this.method1972();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!oe;)V")
	@Override
	public void method3048(@OriginalArg(0) Class6_Sub29 arg0) {
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
	public void method1994(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method2017(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
	@Override
	public void method2998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean136) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt1824 = arg1;
		this.anInt1831 = arg2;
		this.method2003();
		this.aClass114_1.method3143(true, arg0);
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(II)V")
	public synchronized void method1995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class6_Sub43 local4 = new Class6_Sub43(arg1);
		local4.aLong218 = arg0;
		this.aClass211_12.method5585(local4);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Lclient!jm;)V")
	public void method1996(@OriginalArg(0) Class110 arg0) {
		@Pc(2) Interface8 local2 = arg0.anInterface8_2;
		this.method1967(local2);
		local2.method5003(arg0);
		this.aClass110_2 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(IIIIII)Z")
	@Override
	public boolean method2972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass72_Sub1_1.aFloat27 * (float) arg0 + this.aClass72_Sub1_1.aFloat26 * (float) arg1 + this.aClass72_Sub1_1.aFloat29 * (float) arg2 + this.aClass72_Sub1_1.aFloat23;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass72_Sub1_1.aFloat27 * (float) arg3 + this.aClass72_Sub1_1.aFloat26 * (float) arg4 + this.aClass72_Sub1_1.aFloat29 * (float) arg5 + this.aClass72_Sub1_1.aFloat23;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt1828 && local55 < (float) this.anInt1828 || !(!(local24 > (float) this.anInt1814) || !(local55 > (float) this.anInt1814))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt1818 * (this.aClass72_Sub1_1.aFloat25 * (float) arg0 + this.aClass72_Sub1_1.aFloat31 * (float) arg1 + this.aClass72_Sub1_1.aFloat34 * (float) arg2 + this.aClass72_Sub1_1.aFloat30) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt1818 * (this.aClass72_Sub1_1.aFloat25 * (float) arg3 + this.aClass72_Sub1_1.aFloat31 * (float) arg4 + this.aClass72_Sub1_1.aFloat34 * (float) arg5 + this.aClass72_Sub1_1.aFloat30) / local55);
		if ((float) local119 < this.aFloat36 && (float) local151 < this.aFloat36 || (float) local119 > this.aFloat38 && (float) local151 > this.aFloat38) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt1827 * (this.aClass72_Sub1_1.aFloat24 * (float) arg0 + this.aClass72_Sub1_1.aFloat28 * (float) arg1 + this.aClass72_Sub1_1.aFloat33 * (float) arg2 + this.aClass72_Sub1_1.aFloat32) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt1827 * (this.aClass72_Sub1_1.aFloat24 * (float) arg3 + this.aClass72_Sub1_1.aFloat28 * (float) arg4 + this.aClass72_Sub1_1.aFloat33 * (float) arg5 + this.aClass72_Sub1_1.aFloat32) / local55);
			return (!((float) local209 < this.aFloat49) || !((float) local241 < this.aFloat49)) && (!((float) local209 > this.aFloat54) || !((float) local241 > this.aFloat54));
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	@Override
	public void method2982(@OriginalArg(0) int arg0) {
		this.method2019();
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(IIII)V")
	@Override
	public void method2985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1838 = arg0;
		this.anInt1811 = arg1;
		this.anInt1818 = arg2;
		this.anInt1827 = arg3;
		@Pc(23) float local23 = (float) (-this.anInt1838 * this.anInt1828) / (float) this.anInt1818;
		@Pc(35) float local35 = (float) (-this.anInt1811 * this.anInt1828) / (float) this.anInt1827;
		@Pc(49) float local49 = (float) ((this.anInt1803 - this.anInt1838) * this.anInt1828) / (float) this.anInt1818;
		@Pc(63) float local63 = (float) ((this.anInt1807 - this.anInt1811) * this.anInt1828) / (float) this.anInt1827;
		this.method2011(local23, local49, -local63, -local35, (float) this.anInt1828, (float) this.anInt1814);
		if (this.anInt1821 != 1) {
			this.method1992();
		}
		this.method1980();
		this.method1976();
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Lclient!ep;)V")
	public void method1997(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt1805 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt1805 >= 0) {
			this.anInterface3Array1[this.anInt1805].method2743();
		}
		this.anInterface3_1 = this.anInterface3Array1[++this.anInt1805] = arg0;
		this.anInterface3_1.method2742();
	}

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "()Z")
	@Override
	public boolean method2978() {
		return this.aBoolean152;
	}

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "()I")
	@Override
	public int method3038() {
		return 4;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "()V")
	@Override
	public void method2743() {
	}

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "()V")
	@Override
	public void method3030() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)V")
	@Override
	public void method3012(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!jm;)V")
	public void method1998(@OriginalArg(0) int arg0, @OriginalArg(1) Class110 arg1) {
		@Pc(2) Interface8 local2 = arg1.anInterface8_2;
		this.method1967(local2);
		local2.method5002(arg0, arg1);
		this.aClass110Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ge", name = "cb", descriptor = "()V")
	private void method1999() {
		if (this.aBoolean148 && this.aBoolean136 | this.anInt1810 >= 0) {
			this.anOpengl1.glEnable(2912);
		} else {
			this.anOpengl1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(FFFF)V")
	public void method2000(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static97.aFloatArray5[0] = arg0;
		Static97.aFloatArray5[1] = arg1;
		Static97.aFloatArray5[2] = arg2;
		Static97.aFloatArray5[3] = arg3;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static97.aFloatArray5, 0);
	}

	@OriginalMember(owner = "client!ge", name = "db", descriptor = "()V")
	private void method2001() {
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadMatrixf(this.aFloatArray7, 0);
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "()I")
	@Override
	public int method3025() {
		return this.anInt1828;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(F)V")
	@Override
	public void method2980(@OriginalArg(0) float arg0) {
		if (this.aFloat44 != arg0) {
			this.aFloat44 = arg0;
			this.method1949();
		}
	}

	@OriginalMember(owner = "client!ge", name = "eb", descriptor = "()V")
	private void method2002() {
		if (this.anInt1833 == 1) {
			return;
		}
		this.method2025();
		this.method1962(false);
		this.method2004(false);
		this.method2006(false);
		this.method1959(false);
		this.method2022(null);
		this.method1993();
		this.method1979(0);
		this.anInt1833 = 1;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(IIII)[I")
	@Override
	public int[] method2976() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl1.glReadPixels(0, this.anInt1807 - local6, 36, 1, 32993, this.anInt1832, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "()V")
	@Override
	public void method2963() {
		if (this.aClass6_Sub14_Sub1_1.method2058()) {
			this.aClass2_1.method39(this.aClass6_Sub14_Sub1_1);
			this.aClass217_1.method5731();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!qi;)V")
	@Override
	public void method2959(@OriginalArg(0) Class19 arg0) {
		this.aClass19_Sub1_1 = (Class19_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "fb", descriptor = "()V")
	private void method2003() {
		@Pc(15) int local15;
		if (this.aBoolean136) {
			this.anOpengl1.glFogf(2915, 0.0F);
			this.anOpengl1.glFogf(2916, 1.0F);
			local15 = this.anInt1824;
		} else {
			this.lb = (float) (this.anInt1814 - 256) - this.aFloat46;
			this.aFloat37 = this.lb - (float) this.anInt1810 * this.aFloat50;
			if (this.aFloat37 < (float) this.anInt1828) {
				this.aFloat37 = this.anInt1828;
			}
			this.anOpengl1.glFogf(2915, this.aFloat37);
			this.anOpengl1.glFogf(2916, this.lb);
			local15 = this.anInt1813;
		}
		Static97.aFloatArray5[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static97.aFloatArray5[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static97.aFloatArray5[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl1.glFogfv(2918, Static97.aFloatArray5, 0);
	}

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "()F")
	@Override
	public float method3040() {
		return this.aFloat40;
	}

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "()Z")
	@Override
	public boolean method3005() {
		if (!this.aClass6_Sub14_Sub1_1.method2058()) {
			if (!this.aClass2_1.method40(this.aClass6_Sub14_Sub1_1)) {
				return false;
			}
			this.aClass217_1.method5731();
		}
		return true;
	}

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "()I")
	@Override
	public int method2983() {
		return this.anInt1814;
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(Z)V")
	public void method2004(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean133) {
			this.aBoolean133 = arg0;
			this.method1966();
			this.anInt1833 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "()Z")
	@Override
	public boolean method2986() {
		return Static332.aString294 == null || !Static332.aString294.startsWith("mac");
	}

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "()Z")
	@Override
	public boolean method3011() {
		return true;
	}

	@OriginalMember(owner = "client!ge", name = "gb", descriptor = "()V")
	public void method2005() {
		if (this.anInt1821 != 2) {
			this.anInt1821 = 2;
			this.method2001();
			this.method2008();
			this.anInt1833 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(Z)V")
	public void method2006(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean154) {
			return;
		}
		if (arg0) {
			this.anOpengl1.glEnable(2929);
		} else {
			this.anOpengl1.glDisable(2929);
		}
		this.aBoolean154 = arg0;
		this.anInt1833 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ge", name = "hb", descriptor = "()V")
	private void method2007() {
		this.method1993();
		for (@Pc(7) int local7 = this.anInt1841 - 1; local7 >= 0; local7--) {
			this.method1953(local7);
			this.method2022(null);
			this.anOpengl1.glTexEnvi(8960, 8704, 34160);
		}
		this.method1965(8448, 8448);
		this.method1986(2, 34168, 770);
		this.method2020();
		this.anOpengl1.glEnable(3042);
		this.anOpengl1.glBlendFunc(770, 771);
		this.anInt1835 = 1;
		this.anOpengl1.glEnable(3008);
		this.anOpengl1.glAlphaFunc(516, 0.0F);
		this.aBoolean145 = true;
		this.anOpengl1.glColorMask(true, true, true, true);
		this.aBoolean137 = true;
		this.method1962(true);
		this.method2004(true);
		this.method2006(true);
		this.method1959(true);
		this.method1992();
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
		@Pc(146) float[] local146 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(148) int local148 = 0; local148 < 8; local148++) {
			@Pc(155) int local155 = local148 + 16384;
			this.anOpengl1.glLightfv(local155, 4608, local146, 0);
			this.anOpengl1.glLightf(local155, 4615, 0.0F);
			this.anOpengl1.glLightf(local155, 4616, 0.0F);
		}
		this.anOpengl1.glEnable(16384);
		this.anOpengl1.glEnable(16385);
		this.anOpengl1.glFogf(2914, 0.95F);
		this.anOpengl1.glFogi(2917, 9729);
		this.anOpengl1.glHint(3156, 4353);
		this.anInt1825 = this.anInt1813 = -1;
		this.method3032();
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
	@Override
	public void method2995(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!he;)V")
	@Override
	public void method3034(@OriginalArg(0) Class90 arg0) {
		this.aClass159_1.method4151(this, arg0);
	}

	@OriginalMember(owner = "client!ge", name = "ib", descriptor = "()V")
	private void method2008() {
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl1.glMultMatrixf(this.aClass72_Sub1_1.method1534(), 0);
		this.method1957();
	}

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "()Z")
	@Override
	public boolean method3024() {
		return this.aClass6_Sub14_Sub1_1.method2058();
	}

	@OriginalMember(owner = "client!ge", name = "jb", descriptor = "()V")
	private void method2009() {
		if (this.anInt1840 <= this.anInt1830 && this.anInt1817 <= this.anInt1837) {
			this.anOpengl1.glScissor(this.anInt1819 + this.anInt1840, this.anInt1836 + this.anInt1807 - this.anInt1837, this.anInt1830 - this.anInt1840, this.anInt1837 - this.anInt1817);
		} else {
			this.anOpengl1.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ge", name = "kb", descriptor = "()V")
	private void method2010() {
		@Pc(11) float local11 = (float) -this.anInt1838 * this.aFloat53 / (float) this.anInt1818;
		@Pc(23) float local23 = (float) -this.anInt1811 * this.aFloat53 / (float) this.anInt1827;
		@Pc(37) float local37 = (float) (this.anInt1803 - this.anInt1838) * this.aFloat53 / (float) this.anInt1818;
		@Pc(51) float local51 = (float) (this.anInt1807 - this.anInt1811) * this.aFloat53 / (float) this.anInt1827;
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt1828 - this.aFloat43), (double) ((float) this.anInt1814 - this.aFloat43));
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(IIII)V")
	@Override
	public void method3033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt1803) {
			arg2 = this.anInt1803;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt1807) {
			arg3 = this.anInt1807;
		}
		this.anInt1840 = arg0;
		this.anInt1817 = arg1;
		this.anInt1830 = arg2;
		this.anInt1837 = arg3;
		this.anOpengl1.glEnable(3089);
		this.method1976();
		this.method2009();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(FFFFFF)V")
	private void method2011(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		@Pc(6) float[] local6 = this.aFloatArray7;
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
		local6[10] = this.aFloat39 = -(arg5 + arg4) / (arg5 - arg4);
		local6[11] = -1.0F;
		local6[12] = 0.0F;
		local6[13] = 0.0F;
		local6[14] = this.aFloat41 = -(local3 * arg5) / (arg5 - arg4);
		local6[15] = 0.0F;
		this.method1991();
	}

	@OriginalMember(owner = "client!ge", name = "lb", descriptor = "()I")
	private int method2012() {
		@Pc(1) int local1 = 0;
		this.aString69 = this.anOpengl1.glGetString(7936);
		this.aString68 = this.anOpengl1.glGetString(7937);
		@Pc(17) String local17 = this.aString69.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl1.glGetString(7938);
		@Pc(53) String[] local53 = Static194.method3611(local45.replace('.', ' '), ' ');
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static344.method5646(local53[0]);
				@Pc(69) int local69 = Static344.method5646(local53[1]);
				this.anInt1815 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt1815 < 12) {
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
		this.anInt1841 = local116[0];
		this.anOpengl1.glGetIntegerv(34929, local116, 0);
		this.anInt1812 = local116[0];
		this.anOpengl1.glGetIntegerv(34930, local116, 0);
		this.anInt1826 = local116[0];
		if (this.anInt1841 < 2 || this.anInt1812 < 2 || this.anInt1826 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean156 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean134 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean152 = this.anOpengl1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean143 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean135 = this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean150 = this.anOpengl1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean140 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean139 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean141 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean149 = false;
		this.aBoolean132 = this.anOpengl1.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "()V")
	@Override
	public void method3023() {
		this.method1959(true);
		this.anOpengl1.glClear(256);
	}

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "(I)I")
	public int method2013(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!hb;Z)Lclient!of;")
	@Override
	public Class40 method3015(@OriginalArg(0) Class88 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt2079 * arg0.anInt2081];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray44 == null) {
			for (local15 = 0; local15 < arg0.anInt2081; local15++) {
				for (local21 = 0; local21 < arg0.anInt2079; local21++) {
					@Pc(74) int local74 = arg0.anIntArray281[arg0.aByteArray45[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt2081; local15++) {
				for (local21 = 0; local21 < arg0.anInt2079; local21++) {
					local6[local10++] = arg0.aByteArray44[local8] << 24 | arg0.anIntArray281[arg0.aByteArray45[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class40 local100 = this.method2996(local6, arg0.anInt2079, arg0.anInt2079, arg0.anInt2081);
		local100.method5074(arg0.anInt2084, arg0.anInt2083, arg0.anInt2080, arg0.anInt2082);
		return local100;
	}

	@OriginalMember(owner = "client!ge", name = "mb", descriptor = "()V")
	private void method2014() {
		if (this.anInt1821 != 3) {
			this.anInt1821 = 3;
			this.method2010();
			this.method2008();
			this.anInt1833 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([Lclient!rc;Lclient!he;Lclient!po;[Lclient!tc;I)V")
	@Override
	public void method2971(@OriginalArg(0) Class78[] arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) Class20_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method3037(arg0, arg2, arg3, arg4);
		this.method3034(arg1);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIILclient!rn;II)V")
	@Override
	public void method3000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class74 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class74_Sub1 local2 = (Class74_Sub1) arg5;
		@Pc(5) Class28_Sub3_Sub1 local5 = local2.aClass28_Sub3_Sub1_1;
		this.method2026();
		this.method2022(local2.aClass28_Sub3_Sub1_1);
		this.method1963(1);
		this.method1965(7681, 8448);
		this.method1986(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat21 / (float) local5.anInt1338;
		@Pc(37) float local37 = local5.aFloat20 / (float) local5.anInt1337;
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
		this.method1986(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!fl;)V")
	public void method2015(@OriginalArg(0) Class72_Sub1 arg0) {
		this.anOpengl1.glPushMatrix();
		this.anOpengl1.glMultMatrixf(arg0.method1534(), 0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass72_Sub1_1.aFloat27 * (float) arg0 + this.aClass72_Sub1_1.aFloat26 * (float) arg1 + this.aClass72_Sub1_1.aFloat29 * (float) arg2 + this.aClass72_Sub1_1.aFloat23;
		if (local24 < (float) this.anInt1828 || local24 > (float) this.anInt1814) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt1818 * (this.aClass72_Sub1_1.aFloat25 * (float) arg0 + this.aClass72_Sub1_1.aFloat31 * (float) arg1 + this.aClass72_Sub1_1.aFloat34 * (float) arg2 + this.aClass72_Sub1_1.aFloat30) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt1827 * (this.aClass72_Sub1_1.aFloat24 * (float) arg0 + this.aClass72_Sub1_1.aFloat28 * (float) arg1 + this.aClass72_Sub1_1.aFloat33 * (float) arg2 + this.aClass72_Sub1_1.aFloat32) / local24);
		if ((float) local81 >= this.aFloat36 && (float) local81 <= this.aFloat38 && (float) local113 >= this.aFloat49 && (float) local113 <= this.aFloat54) {
			arg3[0] = (int) ((float) local81 - this.aFloat36);
			arg3[1] = (int) ((float) local113 - this.aFloat49);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!bs;[Lclient!hb;Z)Lclient!pi;")
	@Override
	public Class30 method3046(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class88[] arg1) {
		return new Class30_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ge", name = "nb", descriptor = "()V")
	public void method2016() {
		if (this.anInt1833 == 4) {
			return;
		}
		this.method2025();
		this.method1962(false);
		this.method2004(false);
		this.method2006(false);
		this.method1959(false);
		this.method1993();
		this.method1963(1);
		this.method1979(1);
		this.anInt1833 = 4;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!eb;IIII)Lclient!rc;")
	@Override
	public Class78 method3016(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class78_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZZ)V")
	public void method2017(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt1829) {
			if (arg0 < 0) {
				this.method2020();
				this.method2022(null);
				if (!this.aBoolean136) {
					this.aClass114_1.method3142(arg2, 0, arg1);
				}
			} else {
				@Pc(11) Class28_Sub3 local11 = this.aClass217_1.method5732(arg0);
				@Pc(17) Class82 local17 = this.anInterface2_2.method346(arg0);
				if (local17.aByte22 == 0 && local17.aByte26 == 0) {
					this.method2020();
				} else {
					@Pc(30) int local30 = local17.aBoolean165 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method1974((float) (this.anInt1804 % local34 * local17.aByte22) / (float) local34, (float) (this.anInt1804 % local34 * local17.aByte26) / (float) local34, 0.0F);
				}
				if (this.aBoolean136) {
					this.aClass114_1.method3142(arg2, 3, arg1);
					this.method2022(local11);
				} else {
					this.aClass114_1.method3142(arg2, local17.aByte27, arg1);
					this.aClass114_1.method3143(false, local17.aByte23);
					if (!this.aClass114_1.method3144(local11)) {
						this.method2022(local11);
					}
				}
			}
			this.anInt1829 = arg0;
		}
		this.anInt1833 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(Lclient!jm;)V")
	public void method2018(@OriginalArg(0) Class110 arg0) {
		@Pc(2) Interface8 local2 = arg0.anInterface8_2;
		this.method1967(local2);
		local2.method5000(arg0);
		this.aClass110_3 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "ob", descriptor = "()V")
	private void method2019() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!ge", name = "pb", descriptor = "()V")
	private void method2020() {
		if (this.aBoolean144) {
			this.anOpengl1.glMatrixMode(5890);
			this.anOpengl1.glLoadIdentity();
			this.anOpengl1.glMatrixMode(5888);
			this.aBoolean144 = false;
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(F)V")
	public void method2021(@OriginalArg(0) float arg0) {
		if (this.aFloat53 != arg0) {
			this.aFloat53 = arg0;
			if (this.anInt1821 == 3) {
				this.method2010();
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!mo;)V")
	public void method2022(@OriginalArg(0) Class28 arg0) {
		@Pc(5) Class28 local5 = this.aClass28Array1[this.anInt1834];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl1.glDisable(local5.anInt4318);
			} else {
				if (local5 == null) {
					this.anOpengl1.glEnable(arg0.anInt4318);
				} else if (arg0.anInt4318 != local5.anInt4318) {
					this.anOpengl1.glDisable(local5.anInt4318);
					this.anOpengl1.glEnable(arg0.anInt4318);
				}
				this.anOpengl1.glBindTexture(arg0.anInt4318, arg0.method4127());
			}
			this.aClass28Array1[this.anInt1834] = arg0;
		}
		this.anInt1833 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ge", name = "J", descriptor = "()V")
	@Override
	public void method3042() {
		this.aClass114_1.method3142(false, 0, false);
		this.aBoolean136 = false;
		this.method2003();
		this.method1999();
	}

	@OriginalMember(owner = "client!ge", name = "qb", descriptor = "()V")
	private void method2023() {
		this.aClass72_Sub1_1 = new Class72_Sub1();
		this.aClass72_Sub1_2 = new Class72_Sub1();
		this.aClass28Array1 = new Class28[this.anInt1841];
		this.aBooleanArray17 = new boolean[this.anInt1812];
		this.aClass110Array1 = new Class110[this.anInt1812];
		this.aClass28_Sub3_2 = new Class28_Sub3(this, 3553, 6408, 1, 1);
		this.aClass28_Sub3_3 = new Class28_Sub3(this, 3553, 6408, 1, 1);
		this.aClass28_Sub3_4 = new Class28_Sub3(this, 3553, 6408, 1, 1);
		this.aClass78_Sub2_4 = new Class78_Sub2(this);
		this.aClass78_Sub2_1 = new Class78_Sub2(this);
		this.aClass78_Sub2_6 = new Class78_Sub2(this);
		this.aClass78_Sub2_2 = new Class78_Sub2(this);
		this.aClass78_Sub2_5 = new Class78_Sub2(this);
		this.aClass78_Sub2_3 = new Class78_Sub2(this);
		this.anInterface4_2 = this.method1970(null, 1024, true);
		if (this.aBoolean132) {
			this.aClass105_2 = new Class105(this);
		}
		this.aClass159_1.method4148(this);
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)V")
	@Override
	public void method3019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1828 == arg0 && this.anInt1814 == arg1) {
			return;
		}
		this.anInt1828 = arg0;
		this.anInt1814 = arg1;
		this.method1992();
		this.method1980();
		this.method2003();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!rc;Lclient!he;Lclient!po;Lclient!tc;I)V")
	@Override
	public void method2979(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) Class20_Sub8 arg3) {
		arg0.method4649(arg2, arg3, 0);
		this.method3034(arg1);
	}

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "()Z")
	@Override
	public boolean method2975() {
		return this.aClass114_1.method3145();
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIIIII)Lclient!qi;")
	@Override
	public Class19 method2968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean139 ? new Class19_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!uq;")
	public Interface8 method2024(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface8) (this.aBoolean134 ? new Class45_Sub2(this, arg0, arg1, false) : new Class39_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ge", name = "rb", descriptor = "()V")
	private void method2025() {
		if (this.anInt1821 == 1) {
			return;
		}
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho(0.0D, (double) this.anInt1803, (double) this.anInt1807, 0.0D, -1.0D, 1.0D);
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anInt1821 = 1;
		this.anInt1833 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
	@Override
	public void method3013(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIZ)Lclient!of;")
	@Override
	public Class40 method2967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class40_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ge", name = "sb", descriptor = "()V")
	public void method2026() {
		if (this.anInt1833 == 2) {
			return;
		}
		this.method2025();
		this.method1962(false);
		this.method2004(false);
		this.method2006(false);
		this.method1959(false);
		this.method1993();
		this.anInt1833 = 2;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[I[I)Lclient!rn;")
	@Override
	public Class74 method2955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static361.method1548(arg2, this, arg1, arg0, arg3);
	}
}
